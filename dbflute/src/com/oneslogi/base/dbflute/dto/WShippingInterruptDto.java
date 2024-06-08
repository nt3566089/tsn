package com.oneslogi.base.dbflute.dto;

import java.util.LinkedHashSet;

import com.oneslogi.base.dbflute.dto.bs.BsWShippingInterruptDto;

/**
 * The entity of w_shipping_interrupt.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WShippingInterruptDto extends BsWShippingInterruptDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// 20141022  追加 [ON推-CT2-432対応] Start
	private Boolean isFromInterrupt;
	private Boolean isPackingNo;
	// [#5115][v3.1] 単行出荷検品画面 新規作成 20180709 fujiwara Start
	private Boolean pickingGroupNo;
	// [#5115][v3.1] 単行出荷検品画面 新規作成 20180709 fujiwara End
	// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto Start
	private LinkedHashSet<String> pickingWorkMessageSet;
	// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto End

	public Boolean isIsFromInterrupt() {
		return isFromInterrupt;
	}

	public void setIsFromInterrupt(Boolean isFromInterrupt) {
		this.isFromInterrupt = isFromInterrupt;
	}
	// 20141027  追加 [ON推-CT2-432対応] End

	/**
	 * @return isPackingNo
	 */
	public Boolean getIsPackingNo() {
		return isPackingNo;
	}

	/**
	 * @param isPackingNo セットする isPackingNo
	 */
	public void setIsPackingNo(Boolean isPackingNo) {
		this.isPackingNo = isPackingNo;
	}

	// [#5115][v3.1] 単行出荷検品画面 追加 20180709 fujiwara Start
	/**
	 * @return pickingGroupNo
	 */
	public Boolean getPickingGroupNo() {
		return pickingGroupNo;
	}

	/**
	 * @param pickingGroupNo セットする pickingGroupNo
	 */
	public void setPickingGroupNo(Boolean pickingGroupNo) {
		this.pickingGroupNo = pickingGroupNo;
	}
	// [#5115][v3.1] 単行出荷検品画面 追加 20180709 fujiwara End

	// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto Start
	/**
	 * @return pickingWorkMessageSet
	 */
	public LinkedHashSet<String> getPickingWorkMessageSet() {
		return pickingWorkMessageSet;
	}

	/**
	 * @param pickingWorkMessageSet セットする pickingWorkMessageSet
	 */
	public void setPickingWorkMessageSet(LinkedHashSet<String> pickingWorkMessageSet) {
		this.pickingWorkMessageSet = pickingWorkMessageSet;
	}
	// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.05 matsumoto End
}
