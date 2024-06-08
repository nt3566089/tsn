package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsHReceiveBDto;

/**
 * The entity of H_RECEIVE_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveBDto extends BsHReceiveBDto {

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

  	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
  	// 入庫格納ロケーションNM(From)
  	private String storeLocationNmFrom;

 	// 入庫格納ロケーションNM(To)
  	private String storeLocationNmTo;
  	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

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
	// Parameter修正 2016.10.12 Soe Thiha Tun Add End

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	public String getStoreLocationNmFrom() {
		return storeLocationNmFrom;
	}

	public void setStoreLocationNmFrom(String storeLocationNmFrom) {
		this.storeLocationNmFrom = storeLocationNmFrom;
	}

	public String getStoreLocationNmTo() {
		return storeLocationNmTo;
	}

	public void setStoreLocationNmTo(String storeLocationNmTo) {
		this.storeLocationNmTo = storeLocationNmTo;
	}
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.05.31 shimizu Start
	public String getStoreFlgNm() {
		return storeFlgNm;
	}

	public void setStoreFlgNm(String storeFlgNm) {
		this.storeFlgNm = storeFlgNm;
	}
	// [Ver3.0][#4665] 入庫格納フラグ項目にフラグ名称を表示するよう修正 2018.05.31 shimizu End
}
