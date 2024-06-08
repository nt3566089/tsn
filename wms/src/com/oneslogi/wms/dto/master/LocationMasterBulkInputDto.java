package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dto.customize.SqlELocationListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class LocationMasterBulkInputDto extends PagingDto {

	public static SqlELocationListDto chaseMLocationDto() {
//		return chaseMLocationDto(new MLocationDto());
		return new SqlELocationListDto();
	}

	public static MLocationDto chaseMLocationDto(MLocationDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMZone() == null ) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMZone().getMWarehouse() == null ) {
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}
		return dto;
	}

	public static SqlELocationListDto chaseMLocationBodyDto() {
//		return chaseMLocationBodyDto(new MLocationDto());
		return new SqlELocationListDto();
	}

	public static MLocationDto chaseMLocationBodyDto(MLocationDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMZone() == null ) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMZone().getMWarehouse() == null ) {
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMProductShapeByMaxStoreProductShapeId()== null) {
			dto.setMProductShapeByMaxStoreProductShapeId(new MProductShapeDto());
		}

		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		if (dto.getMProductShapeByReplenishPProductShapeId()== null) {
			dto.setMProductShapeByReplenishPProductShapeId(new MProductShapeDto());
		}

		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		return dto;
	}

	public static class LocationMasterData implements Serializable {
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.08.31 honma Start
		public String receiveCd;
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.08.31 honma End
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka end
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		public int errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
		//検索条件
		public SqlELocationListDto head = new SqlELocationListDto();
		//検索結果(ロケーションマスタ受信テーブル)
		public List<SqlELocationListDto> body = new ArrayList<SqlELocationListDto>();
//		//検索結果(ロケーションマスタ)
//		public List<MLocationDto> bodyLocation = new ArrayList<MLocationDto>();
		//空行
		public SqlELocationListDto blankRow = chaseMLocationBodyDto();
	};

	public LocationMasterData data = new LocationMasterData();
}
