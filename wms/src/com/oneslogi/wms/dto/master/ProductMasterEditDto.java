package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDtlDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductMasterEditDto extends BaseDto{

	public static MProductDto chaseMProductDto() {
		return chaseMProductDto(new MProductDto());
	}

	public static MProductDto chaseMProductDto (MProductDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static MProductShapeDto chaseMProductBodyDto() {
		return chaseMProductBodyDto(new MProductShapeDto());
	}

	public static MProductShapeDto chaseMProductBodyDto(MProductShapeDto dto) {
		// [Ver3.0] unit of measure対応 2017.12.12 han Start
		if (dto.getMShapeGrpDtl() == null) {
			dto.setMShapeGrpDtl(new MShapeGrpDtlDto());
		}

		if (dto.getMShapeGrpDtl().getMShape() == null) {
			dto.getMShapeGrpDtl().setMShape(new MShapeDto());
		}
		// [Ver3.0] unit of measure対応 2017.12.12 han End
		return dto;
	}

	public static class ProductMasterEditData implements Serializable {
		public MProductDto head = chaseMProductDto();

		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
//		public List<MProductShapeDto> body = new ArrayList<MProductShapeDto>();
		public List<MShapeDto> body = new ArrayList<MShapeDto>();
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		public List<MShapeGrpDtlDto> gridBody = new ArrayList<MShapeGrpDtlDto>();
		public String decimalExistFlg = null;
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		public Long pieceShapeId ;
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End


		public MProductShapeDto blankRow = chaseMProductBodyDto();
	}

	public ProductMasterEditData data = new ProductMasterEditData();
}
