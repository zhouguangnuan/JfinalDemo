package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseHisOrder<M extends BaseHisOrder<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setSignDate(java.lang.String signDate) {
		set("signDate", signDate);
	}

	public java.lang.String getSignDate() {
		return get("signDate");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}

	public java.lang.String getUserName() {
		return get("userName");
	}

	public void setMobilePhone(java.lang.String mobilePhone) {
		set("mobilePhone", mobilePhone);
	}

	public java.lang.String getMobilePhone() {
		return get("mobilePhone");
	}

	public void setHospital(java.lang.String hospital) {
		set("hospital", hospital);
	}

	public java.lang.String getHospital() {
		return get("hospital");
	}

	public void setHome(java.lang.String home) {
		set("home", home);
	}

	public java.lang.String getHome() {
		return get("home");
	}

	public void setJsId(java.lang.Integer jsId) {
		set("jsId", jsId);
	}

	public java.lang.Integer getJsId() {
		return get("jsId");
	}

	public void setCateId(java.lang.Integer cateId) {
		set("cateId", cateId);
	}

	public java.lang.Integer getCateId() {
		return get("cateId");
	}

	public void setOrderEndDate(java.lang.String orderEndDate) {
		set("orderEndDate", orderEndDate);
	}

	public java.lang.String getOrderEndDate() {
		return get("orderEndDate");
	}

	public void setOrderAmount(java.math.BigDecimal orderAmount) {
		set("orderAmount", orderAmount);
	}

	public java.math.BigDecimal getOrderAmount() {
		return get("orderAmount");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

}
