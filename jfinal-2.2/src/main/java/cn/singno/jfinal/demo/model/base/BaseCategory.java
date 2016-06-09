package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCategory<M extends BaseCategory<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setCateId(java.lang.String cateId) {
		set("cateId", cateId);
	}

	public java.lang.String getCateId() {
		return get("cateId");
	}

	public void setCateName(java.lang.String cateName) {
		set("cateName", cateName);
	}

	public java.lang.String getCateName() {
		return get("cateName");
	}

	public void setBuzLine(java.lang.Integer buzLine) {
		set("buzLine", buzLine);
	}

	public java.lang.Integer getBuzLine() {
		return get("buzLine");
	}

	public void setBuzLineName(java.lang.String buzLineName) {
		set("buzLineName", buzLineName);
	}

	public java.lang.String getBuzLineName() {
		return get("buzLineName");
	}

	public void setDepth(java.lang.Integer depth) {
		set("depth", depth);
	}

	public java.lang.Integer getDepth() {
		return get("depth");
	}

	public void setParentId(java.lang.String parentId) {
		set("parentId", parentId);
	}

	public java.lang.String getParentId() {
		return get("parentId");
	}

	public void setParentName(java.lang.String parentName) {
		set("parentName", parentName);
	}

	public java.lang.String getParentName() {
		return get("parentName");
	}

	public void setShopId(java.lang.String shopId) {
		set("shopId", shopId);
	}

	public java.lang.String getShopId() {
		return get("shopId");
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
