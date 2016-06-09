//package cn.singno.jfinal.demo;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.jfinal.kit.Prop;
//import com.jfinal.kit.PropKit;
//import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
//import com.jfinal.plugin.c3p0.C3p0Plugin;
//
//import cn.singno.jfinal.demo.model._MappingKit;
//
//public class BaseTest {
//	
//	private C3p0Plugin cp = null;
//	private ActiveRecordPlugin arp = null;
//	
//	@Before
//	public void beforeTest() throws Exception {
//		Prop dbConfig = PropKit.use("dbConfig.properties");
//		cp = new C3p0Plugin(dbConfig.get("jdbcUrl"),dbConfig.get("username"),dbConfig.get("password"));
//		arp = new ActiveRecordPlugin(cp);
//		
//		_MappingKit.mapping(arp);
//		
//		cp.start();
//		arp.start();
//	}
//	
//	@After
//	public void afterTest() throws Exception {
//		if(null!=cp) cp.stop();
//		if(null!=arp) arp.stop();
//	}
//}
