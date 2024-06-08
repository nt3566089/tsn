package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMZipDto;

/**
 * The entity of M_ZIP.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MZipDto extends BsMZipDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===== 導出カラム =====

    // 行番号
    private String lineNo;

    /** 検索件数 */
    private int counter;
    private String errorFlg;

    // ===== 以下Eclipse自動生成のアクセサメソッド =====

    public String getErrorFlg() {
        return errorFlg;
    }

    public void setErrorFlg(String errorFlg) {
        this.errorFlg = errorFlg;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

}
