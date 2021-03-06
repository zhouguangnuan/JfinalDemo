package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAreaGroup<M extends BaseAreaGroup<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setAreaGroupId(java.lang.String areaGroupId) {
		set("areaGroupId", areaGroupId);
	}

	public java.lang.String getAreaGroupId() {
		return get("areaGroupId");
	}

	public void setAreaGroupName(java.lang.String areaGroupName) {
		set("areaGroupName", areaGroupName);
	}

	public java.lang.String getAreaGroupName() {
		return get("areaGroupName");
	}

	public void setGroupLeaderId(java.lang.Integer groupLeaderId) {
		set("groupLeaderId", groupLeaderId);
	}

	public java.lang.Integer getGroupLeaderId() {
		return get("groupLeaderId");
	}

	public void setGroupLeaderName(java.lang.String groupLeaderName) {
		set("groupLeaderName", groupLeaderName);
	}

	public java.lang.String getGroupLeaderName() {
		return get("groupLeaderName");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setYn(java.lang.Integer yn) {
		set("yn", yn);
	}

	public java.lang.Integer getYn() {
		return get("yn");
	}

	public void setCreateUserId(java.lang.Integer createUserId) {
		set("createUserId", createUserId);
	}

	public java.lang.Integer getCreateUserId() {
		return get("createUserId");
	}

	public void setCreateUserName(java.lang.String createUserName) {
		set("createUserName", createUserName);
	}

	public java.lang.String getCreateUserName() {
		return get("createUserName");
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
