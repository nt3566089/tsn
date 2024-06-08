package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsHReceiveB;

/**
 * The entity of H_RECEIVE_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveB extends BsHReceiveB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // Parameter修正 2016.10.12 Soe Thiha Tun Add Start
    // 期限日From
  	private String storeDtFrom;

  	// 期限日To
  	private String storeDtTo;

  	// 入庫格納ロケーション(From)
  	private String storeLocationCdFrom;

 	// 入庫格納ロケーション(To)
  	private String storeLocationCdTo;

  	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.05.31 shimizu Start
  	// 入庫格納フラグ名称
  	private String storeFlgNm;
  	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.05.31 shimizu End

  	public String getStoreDtFrom() {
 		return storeDtFrom;
 	}

 	public void setStoreDtFrom(String storeDtFrom) {
 		this.storeDtFrom = storeDtFrom;
 	}

 	public String getStoreDtTo() {
 		return storeDtTo;
 	}

 	public void setStoreDtTo(String storeDtTo) {
 		this.storeDtTo = storeDtTo;
 	}

 	public String getStoreLocationCdFrom() {
		return storeLocationCdFrom;
	}

	public void setStoreLocationCdFrom(String storeLocationCdFrom) {
		this.storeLocationCdFrom = storeLocationCdFrom;
	}

	public String getStoreLocationCdTo() {
		return storeLocationCdTo;
	}

	public void setStoreLocationCdTo(String storeLocationCdTo) {
		this.storeLocationCdTo = storeLocationCdTo;
	}

	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.05.31 shimizu Start
	public String getStoreFlgNm() {
		return storeFlgNm;
	}

	public void setStoreFlgNm(String storeFlgNm) {
		this.storeFlgNm = storeFlgNm;
	}
	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.05.31 shimizu End

	// Parameter修正 2016.10.12 Soe Thiha Tun Add End
}
