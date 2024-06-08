package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductMasterListDto extends PagingDto{

	public static MProductDto chaseProductMasterListDto() {
		return chaseProductMasterListDto(new MProductDto());
	}

	public static MProductDto chaseProductMasterListDto (MProductDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class ProductMasterListData implements Serializable {

		// 検索条件
		public MProductDto head = chaseProductMasterListDto();

		// 検索結果
		public List<MProductDto> body = new ArrayList<MProductDto>();
		
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
		// 商品ラベル出力設定
		public ProductMasterLabelPrintDto reportData = new ProductMasterLabelPrintDto();
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End
	}

	public ProductMasterListData data = new ProductMasterListData();
}
