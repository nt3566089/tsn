package com.oneslogi.wms.resources.assist;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.wms.dto.assist.LocationMasterSearchDto;
import com.oneslogi.wms.logic.assist.LocationListSelectLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションマスタ検索画面のリソースクラス。
 */
@Path("/assist/locationMasterSearch")
public class LocationMasterSearchResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * ロケーションマスタデータ取得異常
		 */
		protected static final int LOCATION_MASTER_SELECT_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private LocationListSelectLogic locationListSelectLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return LocationMasterSearchDto ロケーションマスタ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public LocationMasterSearchDto initNew() {

		// 画面用DTO作成
		LocationMasterSearchDto locationMasterSearchDto = new LocationMasterSearchDto();

		return locationMasterSearchDto;
	}

	/**
	 * <h2>ロケーションマスタデータ取得。</h2>
	 * <pre>
	 * ・ロケーションマスタデータ取得
	 * </pre>
	 * @param locationMasterSearchDto ロケーションマスタ検索画面用DTO
	 * @return LocationMasterSearchDto ロケーションマスタ検索画面用DTO
	 */
	@GET
	@Path("/search")
	public LocationMasterSearchDto search(LocationMasterSearchDto locationMasterSearchDto) {

		// CenterIdを取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(locationMasterSearchDto.data.head.getMCenter().getCenterCd());
		Long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();

		// ロケーションマスタデータ取得の検索データ編集
		MLocationDtoMapper headerMapper = new MLocationDtoMapper();
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
		MLocation location = headerMapper.mappingToEntity(locationMasterSearchDto.data.head);
		location.setCenterId(centerId);

		// 倉庫
		MWarehouse warehouse = location.chaseMZone().chaseMWarehouse();
		warehouse.setCenterId(centerId);

		// ゾーン
		MZone zone = location.chaseMZone();

		// ロケーションマスタデータ取得の取得
		PagingResultBean<MLocation> page = locationListSelectLogic.select(location, zone, warehouse, locationMasterSearchDto.paging, errRetSts(StatusCode.LOCATION_MASTER_SELECT_FAILED));
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// ===== 画面用DTO ボディの作成 =====
		// [C-CWMS-0028] 不要なソース削除 2015.06.05 kawana
		locationMasterSearchDto.data.list = headerMapper.mappingToDtoList(page);

		return locationMasterSearchDto;
	}
}
