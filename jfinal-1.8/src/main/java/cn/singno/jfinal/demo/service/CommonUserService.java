package cn.singno.jfinal.demo.service;

import cn.singno.jfinal.demo.model.CommonUser;

public class CommonUserService{
	public static final CommonUserService service = new CommonUserService();
	
//	无效，jfinal事务只在 action有效
//	@Before(Tx.class)
	public CommonUser saveCommonUser() {
		CommonUser commonUser = CommonUser.dao.findById(304);
		commonUser.set("nickName", "测试-周5");
		Boolean success = commonUser.update();
		
		int a = 1/0;
		
		if(success){
			return commonUser;
		}else{
			return null;
		}
	}
}
