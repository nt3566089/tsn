package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsHInventoryHDto;

/**
 * The entity of H_INVENTORY_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HInventoryHDto extends BsHInventoryHDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // Parameter修正 2016.10.17 Myo Min Oo Add Start
    // 棚卸日(From)
    private String inventoryDtFrom;

	// 棚卸日(To)
    private String inventoryDtTo;

	public String getInventoryDtFrom() {
		return inventoryDtFrom;
	}

	public void setInventoryDtFrom(String inventoryDtFrom) {
		this.inventoryDtFrom = inventoryDtFrom;
	}

	public String getInventoryDtTo() {
		return inventoryDtTo;
	}

	public void setInventoryDtTo(String inventoryDtTo) {
		this.inventoryDtTo = inventoryDtTo;
	}
	// Parameter修正 2016.10.17 Myo Min Oo Add End
}
