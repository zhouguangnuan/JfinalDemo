package cn.singno.jfinal.demo.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;

import cn.singno.jfinal.demo.controller.HelloController;
import cn.singno.jfinal.demo.model.AdminUser;
import cn.singno.jfinal.demo.model.AreaGroup;

public class DemoConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(Boolean.TRUE);
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
		Prop dbConfig = PropKit.use("dbConfig.properties");
		C3p0Plugin cp = new C3p0Plugin(dbConfig.get("jdbcUrl"),dbConfig.get("username"),dbConfig.get("password"));me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		me.add(arp);
		arp.addMapping("massage_admin_user", "id", AdminUser.class);
		arp.addMapping("massage_area_group", "id", AreaGroup.class);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		
		
	}

	@Override
	public void configHandler(Handlers me) {
		
		
	}
	
	@Override
	public void afterJFinalStart(){
		
	};
	
	@Override
	public void beforeJFinalStop(){
		
	};
}
