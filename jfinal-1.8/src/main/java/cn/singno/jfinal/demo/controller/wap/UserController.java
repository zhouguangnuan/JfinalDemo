package cn.singno.jfinal.demo.controller.wap;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.jfinal.plugin.spring.Inject;

import cn.singno.jfinal.demo.model.CommonUser;
import cn.singno.jfinal.demo.service.CommonUserService;

public class UserController extends Controller{
	
//	@Inject.BY_NAME
//	private CommonUserService commonUserService;
	
	public void index(){
		int a = 0;
		System.out.println(4/a);
		setAttr("name", "singno");
		render("index.html");
	}
	
	// 无参公有方法，即action方法
	public void test(){
		System.out.println("getPara('age')：" + getPara("age"));
		System.out.println("getParaToInt('age')：" + getParaToInt("age"));
		System.out.println("getPara(0)：" + getPara(0));
		System.out.println("getParaToInt(0)：" + getParaToInt(0));
		System.out.println("getPara()：" + getPara());
		
//		http://localhost:8080/jfinal-1.8/wap/users/test?age=1
//		getPara('age')：1
//		getParaToInt('age')：1
//		getPara(0)：null
//		getParaToInt(0)：null
//		getPara()：null
		
//		http://localhost:8080/jfinal-1.8/wap/users/test/1-2
//		getPara('age')：null
//		getParaToInt('age')：null
//		getPara(0)：1
//		getParaToInt(0)：1
//		getPara()：1-2
		
		renderText("这是一个action方法");
	}
	
	@Before(Tx.class)
	public void saveUser(){
		CommonUser commonUser = CommonUser.dao.findById(304);
		commonUser.set("nickName", "测试-周5");
		Boolean success = commonUser.update();
		
		int a = 1/0;
		
		if(success){
			renderText("success");
		}else{
			renderText("fail");
		}
	}
	
	@Before(Tx.class)
	public void saveUser2(){
		CommonUser commonUser = saveCommonUser();
		renderJson(commonUser);
	}
	
	private CommonUser saveCommonUser() {
		CommonUser commonUser = CommonUser.dao.findById(304);
		commonUser.set("nickName", "测试-周8");
		Boolean success = commonUser.update();
		
		int a = 1/0;
		
		if(success){
			return commonUser;
		}else{
			return null;
		}
	}
}
