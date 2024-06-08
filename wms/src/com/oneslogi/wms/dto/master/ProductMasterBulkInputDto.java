package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductMasterBulkInputDto extends PagingDto{

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
		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		return dto;
	}

	public static class ProductMasterEditData implements Serializable {
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.08 honma start
		public String receiveCd;
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.08 honma end
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka end
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		public int errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
		public MProductDto head = chaseMProductDto();
		public List<MProductShapeDto> productMaster = new ArrayList<MProductShapeDto>();
		public MProductShapeDto blankRow = chaseMProductBodyDto();
	}

	public ProductMasterEditData data = new ProductMasterEditData();
}
