package cn.singno.jfinal.demo.routes;

import com.jfinal.config.Routes;

import cn.singno.jfinal.demo.controller.admin.UserController;

public class AdminRoute extends Routes{

	@Override
	public void config() {
		add("/admin/users", UserController.class, "/WEB-INF/beetl/admin/users");
	}

}