package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserBalance<M extends BaseUserBalance<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public void setOptType(java.lang.Integer optType) {
		set("optType", optType);
	}

	public java.lang.Integer getOptType() {
		return get("optType");
	}

	public void setRechargeType(java.lang.Integer rechargeType) {
		set("rechargeType", rechargeType);
	}

	public java.lang.Integer getRechargeType() {
		return get("rechargeType");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setFAmount(java.math.BigDecimal fAmount) {
		set("fAmount", fAmount);
	}

	public java.math.BigDecimal getFAmount() {
		return get("fAmount");
	}

	public void setBalance(java.math.BigDecimal balance) {
		set("balance", balance);
	}

	public java.math.BigDecimal getBalance() {
		return get("balance");
	}

	public void setGiftAmount(java.math.BigDecimal giftAmount) {
		set("giftAmount", giftAmount);
	}

	public java.math.BigDecimal getGiftAmount() {
		return get("giftAmount");
	}

	public void setRechargeId(java.lang.String rechargeId) {
		set("rechargeId", rechargeId);
	}

	public java.lang.String getRechargeId() {
		return get("rechargeId");
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

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public void setState(java.lang.Integer state) {
		set("state", state);
	}

	public java.lang.Integer getState() {
		return get("state");
	}

	public void setAutoTimestamp(java.util.Date autoTimestamp) {
		set("autoTimestamp", autoTimestamp);
	}

	public java.util.Date getAutoTimestamp() {
		return get("autoTimestamp");
	}

}
