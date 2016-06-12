package cn.singno.jfinal.demo.interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class AuthInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		System.out.println("before action AuthInterceptor");
		
//		http://localhost:8080/jfinal-1.8/admin/users
		
//		System.out.println(ai.getActionKey());// /admin/users
//		System.out.println(ai.getControllerKey());// /admin/users
//		System.out.println(ai.getMethodName());// index
//		System.out.println(ai.getViewPath());// /WEB-INF/beetl/admin/users/
//		System.out.println(ai.getClass());// class com.jfinal.core.ActionInvocation
//		System.out.println(ai.getController().getClass().getName());
//		// cn.singno.jfinal.demo.controller.admin.UserController
//		System.out.println(ai.getMethod().getName());// index
		
		ai.invoke();
		System.out.println("end action AuthInterceptor");
	}

}
