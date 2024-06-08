package com.oneslogi.ht.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.ht.base.dto.HandyBaseDto;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷)情報を保持します
 *
 */
public class SerialShippingInspectionDto extends HandyBaseDto {

	public static WHtSerialShippingInspDto chaseWHtSerialShippingInspDto() {
		return chaseWHtSerialShippingInspDto(new WHtSerialShippingInspDto());
	}

	public static WHtSerialShippingInspDto chaseWHtSerialShippingInspDto(WHtSerialShippingInspDto dto) {
		return dto;
	}

	public static class SerialShippingInspectionData implements Serializable {

		private static final long serialVersionUID = 1L;

		/** シリアル登録(出荷)ワーク */
		public WHtSerialShippingInspDto wHtSerialShippingInspDto = chaseWHtSerialShippingInspDto();

		/** 納品先データ */
		public List<MCustomerDto> lstMCustomerBySupplierDto = new ArrayList<MCustomerDto>();

		/** 出荷予定ヘッダ */
		public TShippingInstH tShippingInstH = null;

		/** 商品マスタ */
		public MProduct mProduct = null;

	};

	public SerialShippingInspectionData data = new SerialShippingInspectionData();

	/** 出荷梱包No.で検品するか判断するフラグ*/
	public boolean isPackingNo = false;

	// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除(変数spgWorkComment削除) 2018.12.14 kawana Delete

	/** 納品先 */
	public String supplierCustomerCd = "";
	public String supplierCustomerNm = "";

	/** 登録数 */
	public int inspQty = 0;

	/** スタートシリアルNo. */
	public String startSerialNo = "";

	/** 終了シリアルNo. */
	public String endSerialNo = "";

	/** 数量 */
	public String serialNum = "";

	/**
	 * @return wHtSerialShippingInspDto
	 */
	public WHtSerialShippingInspDto getwHtSerialShippingInspDto() {
		return data.wHtSerialShippingInspDto;
	}

	/**
	 * @param wHtSerialShippingInspDto セットする wHtSerialShippingInspDto
	 */
	public void setwHtSerialShippingInspDto(WHtSerialShippingInspDto wHtSerialShippingInspDto) {
		this.data.wHtSerialShippingInspDto = wHtSerialShippingInspDto;
	}

	/**
	 * @return the tShippingInstH
	 */
	public TShippingInstH gettShippingInstH() {
		return this.data.tShippingInstH;
	}

	/**
	 * @param tShippingInstH the tShippingInstH to set
	 */
	public void settShippingInstH(TShippingInstH tShippingInstH) {
		this.data.tShippingInstH = tShippingInstH;
	}

	/**
	 * @return the mProduct
	 */
	public MProduct getmProduct() {
		return this.data.mProduct;
	}

	/**
	 * @param mProduct the mProduct to set
	 */
	public void setmProduct(MProduct mProduct) {
		this.data.mProduct = mProduct;
	}

	/**
	 * @return isPackingNo
	 */
	public boolean getIsPackingNo() {
		return isPackingNo;
	}

	/**
	 * @param isPackingNo セットする isPackingNo
	 */
	public void setIsPackingNo(boolean isPackingNo) {
		this.isPackingNo = isPackingNo;
	}

	// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除 2018.12.14 kawana Delete

	public String getSupplierCustomerCd() {
		return supplierCustomerCd;
	}

	public void setSupplierCustomerCd(String supplierCustomerCd) {
		this.supplierCustomerCd = supplierCustomerCd;
	}

	/**
	 * @return lstMCustomerBySupplierDto
	 */
	public List<MCustomerDto> getLstMCustomerBySupplierDto() {
		return data.lstMCustomerBySupplierDto;
	}

	/**
	 * @param lstMCustomerBySupplierDto セットする lstMCustomerBySupplierDto
	 */
	public void setMCustomerBySupplierDto(List<MCustomerDto> lstMCustomerBySupplierDto) {
		this.data.lstMCustomerBySupplierDto = lstMCustomerBySupplierDto;
	}

	/**
	 * @return the supplierCustomerNm
	 */
	public String getSupplierCustomerNm() {
		return supplierCustomerNm;
	}

	/**
	 * @param supplierCustomerNm the supplierCustomerNm to set
	 */
	public void setSupplierCustomerNm(String supplierCustomerNm) {
		this.supplierCustomerNm = supplierCustomerNm;
	}

	/**
	 * @return the startSerialNo
	 */
	public String getStartSerialNo() {
		return startSerialNo;
	}

	/**
	 * @param startSerialNo the startSerialNo to set
	 */
	public void setStartSerialNo(String startSerialNo) {
		this.startSerialNo = startSerialNo;
	}

	/**
	 * @return the serialNum
	 */
	public String getSerialNum() {
		return serialNum;
	}

	/**
	 * @param serialNum the serialNum to set
	 */
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	/**
	 * @return the endSerialNo
	 */
	public String getEndSerialNo() {
		return endSerialNo;
	}

	/**
	 * @param endSerialNo the endSerialNo to set
	 */
	public void setEndSerialNo(String endSerialNo) {
		this.endSerialNo = endSerialNo;
	}

	/**
	 * @return the inspQty
	 */
	public int getInspQty() {
		return inspQty;
	}

	/**
	 * @param inspQty the inspQty to set
	 */
	public void setInspQty(int inspQty) {
		this.inspQty = inspQty;
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
