package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAuBind<M extends BaseAuBind<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setAreaGroupId(java.lang.String areaGroupId) {
		set("areaGroupId", areaGroupId);
	}

	public java.lang.String getAreaGroupId() {
		return get("areaGroupId");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}

	public java.lang.String getUserName() {
		return get("userName");
	}

	public void setBindTime(java.util.Date bindTime) {
		set("bindTime", bindTime);
	}

	public java.util.Date getBindTime() {
		return get("bindTime");
	}

}
