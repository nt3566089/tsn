package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMShapeGrpDtlDto;

/**
 * The entity of m_shape_grp_dtl.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpDtlDto extends BsMShapeGrpDtlDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    //[Ver3.0] unit of measure対応 2017.11.21 PYM Start
	private String shapeCd;
	public String getShapeCd() {
		return shapeCd;
	}
	public void setShapeCd(String shapeCd) {
		this.shapeCd = shapeCd;
	}
    //[Ver3.0] unit of measure対応 2017.11.21 PYM End
}
