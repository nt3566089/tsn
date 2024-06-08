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
public class ProductShapeMasterBulkInputDto extends PagingDto{

	public static MProductDto chaseMProductDto() {
		return chaseMProductDto(new MProductDto());
	}

	public static MProductDto chaseMProductDto (MProductDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static MProductShapeDto chaseMProductShapeDto() {
		return chaseMProductShapeDto(new MProductShapeDto());
	}

	public static MProductShapeDto chaseMProductShapeDto(MProductShapeDto dto) {
		// [Ver3.0] unit of measure対応 2017.12.27 NING Del
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		return dto;
	}

	public static class ProductShapeMasterEditData implements Serializable {
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.14 honma start
		public String receiveCd;
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.14 honma end
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka end
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		public int errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
		public MProductDto head = chaseMProductDto();
		public List<MProductShapeDto> productShapeMaster = new ArrayList<MProductShapeDto>();
		public MProductShapeDto blankRow = chaseMProductShapeDto();

		/** ピース荷姿CD */
		public String pieceShapeCd;
}

	public ProductShapeMasterEditData data = new ProductShapeMasterEditData();


}
