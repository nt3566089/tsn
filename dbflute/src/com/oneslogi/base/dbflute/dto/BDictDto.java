package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBDictDto;

/**
 * The entity of B_DICT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BDictDto extends BsBDictDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

 	// ===== 以下Eclipse自動生成のアクセサメソッド =====

    // 行番号
 	private String lineNo;

 	public String getLineNo() {
 		return lineNo;
 	}

 	public void setLineNo(String lineNo) {
 		this.lineNo = lineNo;
 	}

    // 辞書名（変更前）
 	private String oldDictNm;

 	public String getOldDictNm() {
		return oldDictNm;
	}
	public void setOldDictNm(String oldDictNm) {
		this.oldDictNm = oldDictNm;
	}

	//カルチャCD
    protected String _cultureCd;

    public String getCultureCd() {
        return _cultureCd;
    }

    public void setCultureCd(String cultureCd) {
        __modifiedProperties.add("cultureCd");
        this._cultureCd = cultureCd;
    }

    //辞書カルチャマスタの辞書名
    protected String _dictCultureNm;

    public String getDictCultureNm() {
        return _dictCultureNm;
    }

    public void setDictCultureNm(String dictCultureCd) {
        __modifiedProperties.add("dictCultureNm");
        this._dictCultureNm = dictCultureCd;
    }
}
