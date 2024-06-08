package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBMenuDto;

/**
 * The entity of B_MENU.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BMenuDto extends BsBMenuDto {

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
