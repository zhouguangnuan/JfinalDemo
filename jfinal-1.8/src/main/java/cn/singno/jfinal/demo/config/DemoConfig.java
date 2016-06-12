package cn.singno.jfinal.demo.config;

import org.beetl.core.GroupTemplate;
import org.beetl.ext.jfinal.BeetlRenderFactory;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.spring.SpringPlugin;

import cn.singno.jfinal.demo.controller.common.HelloController;
import cn.singno.jfinal.demo.interceptors.GlobalErrorHandlerInterceptor;
import cn.singno.jfinal.demo.model._MappingKit;
import cn.singno.jfinal.demo.routes.AdminRoute;
import cn.singno.jfinal.demo.routes.ImageRoute;
import cn.singno.jfinal.demo.routes.WapRoute;

public class DemoConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(Boolean.TRUE);
		
		// 设置视图解析器，这里使用beel模板
		me.setMainRenderFactory(new BeetlRenderFactory());
		GroupTemplate gt = BeetlRenderFactory.groupTemplate;
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		
		me.add(new WapRoute());
		me.add(new AdminRoute());
		me.add(new ImageRoute());
	}

	@Override
	public void configPlugin(Plugins me) {
		// 数据源
		loadPropertyFile("classes/dbConfig.properties");
		C3p0Plugin cp = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("username"), getProperty("password"));
		me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		arp.setShowSql(true);//这句话就是ShowSql
		_MappingKit.mapping(arp);
		me.add(arp);
		
		// 
//		me.add(new SpringPlugin());
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// 这里配置全局拦截器
		me.add(new GlobalErrorHandlerInterceptor());
	}

	@Override
	public void configHandler(Handlers me) {
		
		
	}
	
	@Override
	public void afterJFinalStart(){
		System.out.println("JFinal Started");
	};
	
	@Override
	public void beforeJFinalStop(){
		System.out.println("JFinal Stop");
	};
}
