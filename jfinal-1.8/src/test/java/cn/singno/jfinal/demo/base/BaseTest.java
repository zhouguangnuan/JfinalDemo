package cn.singno.jfinal.demo.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.servlet.ServletContext;

import org.junit.AfterClass;
import org.junit.Before;

import com.google.common.base.Preconditions;
import com.jfinal.config.JFinalConfig;
import com.jfinal.core.JFinal;
import com.jfinal.ext.kit.Reflect;
import com.jfinal.ext.test.ControllerTestCase;

@SuppressWarnings("all")
public class BaseTest<T extends JFinalConfig> extends ControllerTestCase<T>{
	
	protected static ServletContext servletContext = new MyMockServletContext();
	
	private static boolean configStarted = false;
	private static JFinalConfig configInstance;
	private Class<? extends JFinalConfig> config;
	
    public BaseTest() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Preconditions.checkArgument(genericSuperclass instanceof ParameterizedType,
                "Your ControllerTestCase must have genericType");
        config = (Class<? extends JFinalConfig>) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
	
	private static void initConfig(Class<JFinal> clazz, JFinal me, ServletContext servletContext, JFinalConfig config) {
        Reflect.on(me).call("init", config, servletContext);
    }

    public static void start(Class<? extends JFinalConfig> configClass) throws Exception {
        if (configStarted) {
            return;
        }
        Class<JFinal> clazz = JFinal.class;
        JFinal me = JFinal.me();
        configInstance = configClass.newInstance();
        initConfig(clazz, me, servletContext, configInstance);
        handler = Reflect.on(me).get("handler");
        configStarted = true;
        configInstance.afterJFinalStart();
    }
    
    @Before
    public void init() throws Exception {
        this.start(config);
    }
    
    @AfterClass
    public static void stop() throws Exception {
        configInstance.beforeJFinalStop();
    }
}
