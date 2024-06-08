package com.oneslogi.ht.wms.dto.receive;

import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.ht.base.dto.HandyBaseDto;

// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷)画面の情報を保持します。
 *
 */
public class SerialReceiveInspectionDto extends HandyBaseDto {

	/** WMS入荷伝票No. */
	private String receiveSlipNo = "";

	/** 仕入先CD */
	private String supplierCd = "";

	/** 仕入先名称 */
	private String supplierNm = "";

	/** センタID */
	private Long centerId;

	/** 荷主ID */
	private Long clientId;

	/** MACアドレス */
	private String macAddress = "";

	/** パラメータマスタ */
	private MParamDto mParamDto;

	/** 差異フラグ */
	private String differentFlg;

	/** 商品 /Jan*/
	private String janProdCd = "";

	/** 商品ID */
	private Long productId;

	/** 商品 */
	private String productCd = "";

	/** 商品名称 */
	private String productNm = "";

	/** 検品数 */
	private int unitNum = 0;

	/** シリアルNo. */
	private String serialNo = "";

	/** 開始シリアルNo. */
	private String startSerialNo = "";

	/** 終了シリアルNo. */
	private String endSerialNo = "";

	/** 数量 */
	private String serialNum = null;

	/** 仕入先データ */
	private List<MCustomer> lstSupplier = new ArrayList<MCustomer>();

	// ===== 以下、ゲッタとセッタ =====

	public String getEndSerialNo() {
		return endSerialNo;
	}

	public void setEndSerialNo(String endSerialNo) {
		this.endSerialNo = endSerialNo;
	}

	public String getStartSerialNo() {
		return startSerialNo;
	}

	public void setStartSerialNo(String startSerialNo) {
		this.startSerialNo = startSerialNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getJanProdCd() {
		return janProdCd;
	}

	public void setJanProdCd(String janProdCd) {
		this.janProdCd = janProdCd;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public MParamDto getMParamDto() {
		return mParamDto;
	}

	public void setMParamDto(MParamDto mParamDto) {
		this.mParamDto = mParamDto;
	}

	public String getDifferentFlg() {
		return differentFlg;
	}

	public void setDifferentFlg(String differentFlg) {
		this.differentFlg = differentFlg;
	}

	/**
	 * @return macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress セットする macAddress
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public MParamDto getmParamDto() {
		return mParamDto;
	}

	public void setmParamDto(MParamDto mParamDto) {
		this.mParamDto = mParamDto;
	}

	public String getReceiveSlipNo() {
		return receiveSlipNo;
	}

	public void setReceiveSlipNo(String receiveSlipNo) {
		this.receiveSlipNo = receiveSlipNo;
	}

	public String getSupplierCd() {
		return supplierCd;
	}

	public void setSupplierCd(String supplierCd) {
		this.supplierCd = supplierCd;
	}

	public String getSupplierNm() {
		return supplierNm;
	}

	public void setSupplierNm(String supplierNm) {
		this.supplierNm = supplierNm;
	}

	public Long getCenterId() {
		return centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public List<MCustomer> getLstSupplier() {
		return lstSupplier;
	}

	public void setLstSupplier(List<MCustomer> lstSupplier) {
		this.lstSupplier = lstSupplier;
	}

	public void setUnitNum(int unitNum) {
		this.unitNum = unitNum;
	}

	public int getUnitNum() {
		return unitNum;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
