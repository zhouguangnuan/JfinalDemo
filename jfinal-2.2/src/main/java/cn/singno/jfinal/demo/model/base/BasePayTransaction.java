package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePayTransaction<M extends BasePayTransaction<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setPayType(java.lang.Integer payType) {
		set("payType", payType);
	}

	public java.lang.Integer getPayType() {
		return get("payType");
	}

	public void setPayAmount(java.math.BigDecimal payAmount) {
		set("payAmount", payAmount);
	}

	public java.math.BigDecimal getPayAmount() {
		return get("payAmount");
	}

	public void setBusinessType(java.lang.Integer businessType) {
		set("businessType", businessType);
	}

	public java.lang.Integer getBusinessType() {
		return get("businessType");
	}

	public void setBusinessId(java.lang.String businessId) {
		set("businessId", businessId);
	}

	public java.lang.String getBusinessId() {
		return get("businessId");
	}

	public void setPayTransactionTime(java.util.Date payTransactionTime) {
		set("payTransactionTime", payTransactionTime);
	}

	public java.util.Date getPayTransactionTime() {
		return get("payTransactionTime");
	}

	public void setPayTransactionId(java.lang.String payTransactionId) {
		set("payTransactionId", payTransactionId);
	}

	public java.lang.String getPayTransactionId() {
		return get("payTransactionId");
	}

	public void setPayUserId(java.lang.Integer payUserId) {
		set("payUserId", payUserId);
	}

	public java.lang.Integer getPayUserId() {
		return get("payUserId");
	}

	public void setPayUserName(java.lang.String payUserName) {
		set("payUserName", payUserName);
	}

	public java.lang.String getPayUserName() {
		return get("payUserName");
	}

	public void setState(java.lang.Integer state) {
		set("state", state);
	}

	public java.lang.Integer getState() {
		return get("state");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

}
