package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBUserDto;

/**
 * The entity of B_USER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BUserDto extends BsBUserDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

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
