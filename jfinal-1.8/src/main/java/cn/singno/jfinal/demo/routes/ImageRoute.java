package cn.singno.jfinal.demo.routes;

import com.jfinal.config.Routes;

import cn.singno.jfinal.demo.controller.common.StaticResourceController;

public class ImageRoute extends Routes{

	@Override
	public void config() {
		add("/img", StaticResourceController.class, "/img");
	}
}