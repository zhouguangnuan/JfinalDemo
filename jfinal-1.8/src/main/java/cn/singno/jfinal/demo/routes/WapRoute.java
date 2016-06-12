package cn.singno.jfinal.demo.routes;

import com.jfinal.config.Routes;

import cn.singno.jfinal.demo.controller.wap.UserController;

public class WapRoute extends Routes{

	@Override
	public void config() {
		add("/wap/users", UserController.class, "/WEB-INF/beetl/wap/users");
	}

}
