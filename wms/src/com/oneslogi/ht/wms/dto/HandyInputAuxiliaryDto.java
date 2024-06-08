package com.oneslogi.ht.wms.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;


/**
 * 入力補助情報を保持します。
 */
public class HandyInputAuxiliaryDto extends HandyBaseDto {

	public static MProductDto chaseHandyInputAuxiliaryDto() {
		return chaseHandyInputAuxiliaryDto(new MProductDto());
	}

	public static MProductDto chaseHandyInputAuxiliaryDto (MProductDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class HandyInputAuxiliaryData implements Serializable {

		/** 商品データ */
		public MProductDto mProductDto = chaseHandyInputAuxiliaryDto();

		/** 画面表示用商品荷姿データ */
		public List<HandyInputAuxiliaryProductShapeDto> inputAuxiliaryProductShapeDtoList = new ArrayList<HandyInputAuxiliaryProductShapeDto>();

	}

	public HandyInputAuxiliaryData data = new HandyInputAuxiliaryData();

	/** 商品荷姿1内訳数 */
	@QueryParam("productShapeInputQty1")
	private String productShapeInputQty1;

	/** 商品荷姿2内訳数 */
	@QueryParam("productShapeInputQty2")
	private String productShapeInputQty2;

	/** 商品荷姿3内訳数 */
	@QueryParam("productShapeInputQty3")
	private String productShapeInputQty3;

	/** 商品荷姿4内訳数 */
	@QueryParam("productShapeInputQty4")
	private String productShapeInputQty4;

	public String getProductShapeInputQty1() {
		return productShapeInputQty1;
	}

	public void setProductShapeInputQty1(String productShapeInputQty1) {
		this.productShapeInputQty1 = productShapeInputQty1;
	}

	public String getProductShapeInputQty2() {
		return productShapeInputQty2;
	}

	public void setProductShapeInputQty2(String productShapeInputQty2) {
		this.productShapeInputQty2 = productShapeInputQty2;
	}

	public String getProductShapeInputQty3() {
		return productShapeInputQty3;
	}

	public void setProductShapeInputQty3(String productShapeInputQty3) {
		this.productShapeInputQty3 = productShapeInputQty3;
	}

	public String getProductShapeInputQty4() {
		return productShapeInputQty4;
	}

	public void setProductShapeInputQty4(String productShapeInputQty4) {
		this.productShapeInputQty4 = productShapeInputQty4;
	}

	public MProductDto getMProductDto() {
		return data.mProductDto;
	}

	public void setMProductDto(MProductDto mProductDto) {
		this.data.mProductDto = mProductDto;
	}

	public List<HandyInputAuxiliaryProductShapeDto> getInputAuxiliaryProductShapeDtoList() {
		return data.inputAuxiliaryProductShapeDtoList;
	}

	public void setInputAuxiliaryProductShapeDtoList(List<HandyInputAuxiliaryProductShapeDto> inputAuxiliaryProductShapeDtoList) {
		this.data.inputAuxiliaryProductShapeDtoList = inputAuxiliaryProductShapeDtoList;
	}

}
