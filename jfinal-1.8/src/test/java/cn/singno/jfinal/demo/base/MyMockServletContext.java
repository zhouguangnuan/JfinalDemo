package cn.singno.jfinal.demo.base;

import com.jfinal.ext.test.MockServletContext;

public class MyMockServletContext extends MockServletContext{
	
	@Override
    public String getRealPath(String path) {
        return "E:/Tomcat 7.0/webapps/jfinal-1.8";
    }
}
