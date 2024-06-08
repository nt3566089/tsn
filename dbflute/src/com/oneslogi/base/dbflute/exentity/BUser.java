package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBUser;

/**
 * The entity of B_USER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BUser extends BsBUser {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public BCulture chaseBCulture() {
		return _bCulture != null ? _bCulture : new BCulture();
	}

	public BRoleGrp chaseBRoleGrp() {
		return _bRoleGrp != null ? _bRoleGrp : new BRoleGrp();
	}

    public BClassDtl chaseBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg != null ? _bClassDtlByDelFlg : new BClassDtl();
    }

   	// ======================================================

    // カルチャ名
  	private String cultureNm;

  	// 権限グループ名
   	private String roleGrpNm;

   	// 削除フラグ名
   	private String delFlgNm;

 	public String getCultureNm() {
 		return cultureNm;
 	}

 	public void setCultureNm(String cultureNm) {
 		this.cultureNm = cultureNm;
 	}

 	public String getRoleGrpNm() {
 		return roleGrpNm;
 	}

 	public void setRoleGrpNm(String roleGrpNm) {
 		this.roleGrpNm = roleGrpNm;
 	}

	public String getDelFlgNm() {
		return delFlgNm;
	}

	public void setDelFlgNm(String delFlgNm) {
		this.delFlgNm = delFlgNm;
	}

}
