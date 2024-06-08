/**
 *
 */
package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 積込検品配送コース選択画面の情報を保存します
 *
 */
public class ShippingLoadingInspectionDeliveryCourseSelectDto extends HandyBaseDto {

	@QueryParam("deliveryCourse")
	private String deliveryCourse;

	/**
	 * @return deliveryCourse
	 */
	public String getDeliveryCourse() {
		return deliveryCourse;
	}

	/**
	 * @param deliveryCourse セットする deliveryCourse
	 */
	public void setDeliveryCourse(String deliveryCourse) {
		this.deliveryCourse = deliveryCourse;
	}



}
