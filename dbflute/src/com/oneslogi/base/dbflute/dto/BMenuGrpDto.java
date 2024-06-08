package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBMenuGrpDto;

/**
 * The entity of b_menu_grp.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BMenuGrpDto extends BsBMenuGrpDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // 行番号
  	private String lineNo;

 	public String getLineNo() {
 		return lineNo;
 	}

 	public void setLineNo(String lineNo) {
 		this.lineNo = lineNo;
 	}
}
