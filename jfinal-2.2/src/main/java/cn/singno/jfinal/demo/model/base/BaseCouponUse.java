package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCouponUse<M extends BaseCouponUse<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public void setOrderId(java.lang.String orderId) {
		set("orderId", orderId);
	}

	public java.lang.String getOrderId() {
		return get("orderId");
	}

	public void setCouponId(java.lang.String couponId) {
		set("couponId", couponId);
	}

	public java.lang.String getCouponId() {
		return get("couponId");
	}

	public void setPublishId(java.lang.String publishId) {
		set("publishId", publishId);
	}

	public java.lang.String getPublishId() {
		return get("publishId");
	}

	public void setUseStatus(java.lang.Integer useStatus) {
		set("useStatus", useStatus);
	}

	public java.lang.Integer getUseStatus() {
		return get("useStatus");
	}

	public void setYn(java.lang.Integer yn) {
		set("yn", yn);
	}

	public java.lang.Integer getYn() {
		return get("yn");
	}

	public void setUseIp(java.lang.String useIp) {
		set("useIp", useIp);
	}

	public java.lang.String getUseIp() {
		return get("useIp");
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

	public void setAutoTimestamp(java.util.Date autoTimestamp) {
		set("autoTimestamp", autoTimestamp);
	}

	public java.util.Date getAutoTimestamp() {
		return get("autoTimestamp");
	}

}
