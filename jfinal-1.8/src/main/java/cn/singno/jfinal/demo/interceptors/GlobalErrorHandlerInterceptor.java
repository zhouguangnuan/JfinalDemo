package cn.singno.jfinal.demo.interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class GlobalErrorHandlerInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		System.out.println("before action GlobalErrorHandlerInterceptor");
		try {
			ai.invoke();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end action GlobalErrorHandlerInterceptor");
	}

}
