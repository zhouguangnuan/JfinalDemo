package cn.singno.jfinal.demo.controller.admin;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.core.Controller;

import cn.singno.jfinal.demo.interceptors.AuthInterceptor;
import cn.singno.jfinal.demo.interceptors.GroupInterceptor;
import cn.singno.jfinal.demo.interceptors.LogInterceptor;

@Before(AuthInterceptor.class)
public class UserController extends Controller{
	
	@Before(LogInterceptor.class)
	public void index(){
		renderText("hello JFinal.admin World.");
	}
	
	@ClearInterceptor
	@Before(GroupInterceptor.class)
	public void index2(){
		renderText("hello JFinal.admin World.");
	}
}
