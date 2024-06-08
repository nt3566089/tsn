package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBDict;

/**
 * The entity of B_DICT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BDict extends BsBDict {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public static final String ALIAS_Culture_Cd="CULTURE_CD";
    private String cultureCd;
    public String getCultureCd() {
		return cultureCd;
	}
    public void setCultureCd(String cultureCd) {
		this.cultureCd = cultureCd;
	}

    public static final String ALIAS_Dict_Culture_Nm="DICT_CULTURE_NM";
    private String dictCultureNm;
    public String getDictCultureNm() {
		return dictCultureNm;
	}
    public void setDictCultureNm(String dictCultureNm) {
		this.dictCultureNm = dictCultureNm;
	}
}
