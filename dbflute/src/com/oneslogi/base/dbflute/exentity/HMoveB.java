package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsHMoveB;

/**
 * The entity of H_MOVE_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HMoveB extends BsHMoveB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // Parameter修正 2016.10.12 Soe Thiha Tun Add Start
    // 移動日(From)
    private String moveDtFrom;

	// 移動日(To)
    private String moveDtTo;

	public String getMoveDtFrom() {
		return moveDtFrom;
	}

	public void setMoveDtFrom(String moveDtFrom) {
		this.moveDtFrom = moveDtFrom;
	}

	public String getMoveDtTo() {
		return moveDtTo;
	}

	public void setMoveDtTo(String moveDtTo) {
		this.moveDtTo = moveDtTo;
	}
	// Parameter修正 2016.10.12 Soe Thiha Tun Add End
}
