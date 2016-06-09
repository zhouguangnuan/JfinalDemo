package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminUser<M extends BaseAdminUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}

	public java.lang.String getUserName() {
		return get("userName");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setNickName(java.lang.String nickName) {
		set("nickName", nickName);
	}

	public java.lang.String getNickName() {
		return get("nickName");
	}

	public void setMobilePhone(java.lang.String mobilePhone) {
		set("mobilePhone", mobilePhone);
	}

	public java.lang.String getMobilePhone() {
		return get("mobilePhone");
	}

	public void setWeChat(java.lang.String weChat) {
		set("weChat", weChat);
	}

	public java.lang.String getWeChat() {
		return get("weChat");
	}

	public void setUserNo(java.lang.String userNo) {
		set("userNo", userNo);
	}

	public java.lang.String getUserNo() {
		return get("userNo");
	}

	public void setUserType(java.lang.Integer userType) {
		set("userType", userType);
	}

	public java.lang.Integer getUserType() {
		return get("userType");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public void setYn(java.lang.Integer yn) {
		set("yn", yn);
	}

	public java.lang.Integer getYn() {
		return get("yn");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

}