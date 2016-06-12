package cn.singno.jfinal.demo.controller.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.ehcache.CacheKit;

import cn.singno.jfinal.demo.base.BaseTest;
import cn.singno.jfinal.demo.config.DemoConfig;
import cn.singno.jfinal.demo.model.CommonUser;

public class CommonUserTest extends BaseTest<DemoConfig> {

	@Test
	public void update() throws Exception {
		CommonUser commonUser = CommonUser.dao.findById(304);
		commonUser.set("nickName", "测试-周2").update();
		System.out.println(commonUser.toJson());
	}

	@Test
	public void save() throws Exception {
		CommonUser commonUser = CommonUser.dao.findById(304);
		commonUser.set("id", null);
		commonUser.set("mobilePhone", "22");
		commonUser.set("nickName", "测试-周2");
		commonUser.save();
		System.out.println(commonUser.toJson());
	}

	@Test
	public void paginate() throws Exception {
		Page<CommonUser> page = CommonUser.dao.paginate(1, 10, "select *",
				"from massage_common_user where nickName=? order by createTime desc", "测试-周2");
		System.out.println(JSON.toJSONString(page));
	}

	@Test
	public void RecordAndDb() throws Exception {
		Record user = new Record().set("nickName", "singno");
		Db.save("massage_common_user", user);
	}

	@Test
	public void testTx1() throws Exception {
//		boolean success = Db.tx(new IAtom() {
//			@Override
//			public boolean run() throws SQLException {
//				Boolean success = Boolean.FALSE;
//				
//				Record user = new Record().set("id", 359).set("nickName", "singno3");
//				success = Db.update("massage_common_user", user);
//			
//				int a = 1/0;
//				
//				return success;
//			}
//		});
		
//		Boolean success = Boolean.FALSE;
//		Record user = new Record().set("id", 359).set("nickName", "singno3");
//		success = Db.update("massage_common_user", user);
//	
//		int a = 1/0;
	}
	
	@Test
	public void testTx2() throws Exception {
		boolean success = Db.tx(new IAtom() {
			@Override
			public boolean run() throws SQLException {
				CommonUser commonUser = CommonUser.dao.findById(304);
				commonUser.set("nickName", "测试-周2");
				Boolean success = commonUser.update();
			
				int a = 1/0;
				
				return success;
			}
		});
	}
}
