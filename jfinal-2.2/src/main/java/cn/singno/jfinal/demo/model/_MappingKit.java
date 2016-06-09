package cn.singno.jfinal.demo.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("massage_admin_user", "id", AdminUser.class);
		arp.addMapping("massage_area_group", "id", AreaGroup.class);
		arp.addMapping("massage_au_bind", "id", AuBind.class);
		arp.addMapping("massage_category", "id", Category.class);
		arp.addMapping("massage_city", "id", City.class);
		arp.addMapping("massage_common_user", "id", CommonUser.class);
		arp.addMapping("massage_coupon", "id", Coupon.class);
		arp.addMapping("massage_coupon_publish", "id", CouponPublish.class);
		arp.addMapping("massage_coupon_use", "id", CouponUse.class);
		arp.addMapping("massage_dic", "id", Dic.class);
		arp.addMapping("massage_feedback", "id", Feedback.class);
		arp.addMapping("massage_his_order", "id", HisOrder.class);
		arp.addMapping("massage_holiday", "id", Holiday.class);
		arp.addMapping("massage_images", "id", Images.class);
		arp.addMapping("massage_info", "id", Info.class);
		arp.addMapping("massage_log", "id", Log.class);
		arp.addMapping("massage_message", "id", Message.class);
		arp.addMapping("massage_order", "id", Order.class);
		arp.addMapping("massage_pay_transaction", "id", PayTransaction.class);
		arp.addMapping("massage_shop", "id", Shop.class);
		arp.addMapping("massage_ss_bind", "id", SsBind.class);
		arp.addMapping("massage_su_bind", "id", SuBind.class);
		arp.addMapping("massage_suborder", "id", Suborder.class);
		arp.addMapping("massage_user_address", "id", UserAddress.class);
		arp.addMapping("massage_user_balance", "id", UserBalance.class);
		arp.addMapping("massage_validate_code", "id", ValidateCode.class);
		arp.addMapping("massage_ware", "id", Ware.class);
		arp.addMapping("massage_ware_price", "id", WarePrice.class);
		arp.addMapping("massage_ware_store", "id", WareStore.class);
	}
}
