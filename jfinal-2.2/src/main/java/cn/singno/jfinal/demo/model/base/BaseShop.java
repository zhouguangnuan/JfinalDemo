package cn.singno.jfinal.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseShop<M extends BaseShop<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setShopId(java.lang.String shopId) {
		set("shopId", shopId);
	}

	public java.lang.String getShopId() {
		return get("shopId");
	}

	public void setShopName(java.lang.String shopName) {
		set("shopName", shopName);
	}

	public java.lang.String getShopName() {
		return get("shopName");
	}

	public void setShopIntro(java.lang.String shopIntro) {
		set("shopIntro", shopIntro);
	}

	public java.lang.String getShopIntro() {
		return get("shopIntro");
	}

	public void setShopTips(java.lang.String shopTips) {
		set("shopTips", shopTips);
	}

	public java.lang.String getShopTips() {
		return get("shopTips");
	}

	public void setShopType(java.lang.Integer shopType) {
		set("shopType", shopType);
	}

	public java.lang.Integer getShopType() {
		return get("shopType");
	}

	public void setShopTypeName(java.lang.String shopTypeName) {
		set("shopTypeName", shopTypeName);
	}

	public java.lang.String getShopTypeName() {
		return get("shopTypeName");
	}

	public void setShopDesc(byte[] shopDesc) {
		set("shopDesc", shopDesc);
	}

	public byte[] getShopDesc() {
		return get("shopDesc");
	}

	public void setMobilePhone(java.lang.String mobilePhone) {
		set("mobilePhone", mobilePhone);
	}

	public java.lang.String getMobilePhone() {
		return get("mobilePhone");
	}

	public void setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
	}

	public java.lang.String getTelephone() {
		return get("telephone");
	}

	public void setCountry(java.lang.String country) {
		set("country", country);
	}

	public java.lang.String getCountry() {
		return get("country");
	}

	public void setProvinceId(java.lang.Integer provinceId) {
		set("provinceId", provinceId);
	}

	public java.lang.Integer getProvinceId() {
		return get("provinceId");
	}

	public void setProvinceName(java.lang.String provinceName) {
		set("provinceName", provinceName);
	}

	public java.lang.String getProvinceName() {
		return get("provinceName");
	}

	public void setCityId(java.lang.Integer cityId) {
		set("cityId", cityId);
	}

	public java.lang.Integer getCityId() {
		return get("cityId");
	}

	public void setCityName(java.lang.String cityName) {
		set("cityName", cityName);
	}

	public java.lang.String getCityName() {
		return get("cityName");
	}

	public void setCounty(java.lang.String county) {
		set("county", county);
	}

	public java.lang.String getCounty() {
		return get("county");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setLdAmount(java.math.BigDecimal ldAmount) {
		set("ldAmount", ldAmount);
	}

	public java.math.BigDecimal getLdAmount() {
		return get("ldAmount");
	}

	public void setLon(java.lang.Double lon) {
		set("lon", lon);
	}

	public java.lang.Double getLon() {
		return get("lon");
	}

	public void setLat(java.lang.Double lat) {
		set("lat", lat);
	}

	public java.lang.Double getLat() {
		return get("lat");
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
