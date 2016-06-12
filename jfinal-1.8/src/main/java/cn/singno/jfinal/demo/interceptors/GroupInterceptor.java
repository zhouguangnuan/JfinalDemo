package cn.singno.jfinal.demo.interceptors;

import com.jfinal.aop.InterceptorStack;

public class GroupInterceptor extends InterceptorStack {

	@Override
	public void config() {
		addInterceptors(new AuthInterceptor(), new LogInterceptor());
	}
}
