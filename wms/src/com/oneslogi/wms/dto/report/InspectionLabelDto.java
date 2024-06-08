package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

public class InspectionLabelDto extends ReportDto {

	//梱包計算処理区分
	public String packingCalCls;

	//出庫作業No.
	public String pickingWorkNo;

	//出荷梱包No.
	public String shippingPackingNo;

	//ユーザCD
	public String userCd;

	/**
	 * @return the packingCalCls
	 */
	public String getPackingCalCls() {
		return packingCalCls;
	}

	/**
	 * @param packingCalCls the packingCalCls to set
	 */
	public void setPackingCalCls(String packingCalCls) {
		this.packingCalCls = packingCalCls;
	}

	/**
	 * @return the pickingWorkNo
	 */
	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	/**
	 * @param pickingWorkNo the pickingWorkNo to set
	 */
	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	/**
	 * @return the shippingPackingNo
	 */
	public String getShippingPackingNo() {
		return shippingPackingNo;
	}

	/**
	 * @param shippingPackingNo the shippingPackingNo to set
	 */
	public void setShippingPackingNo(String shippingPackingNo) {
		this.shippingPackingNo = shippingPackingNo;
	}

	/**
	 * @return the userCd
	 */
	public String getUserCd() {
		return userCd;
	}

	/**
	 * @param userCd the userCd to set
	 */
	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}


}
