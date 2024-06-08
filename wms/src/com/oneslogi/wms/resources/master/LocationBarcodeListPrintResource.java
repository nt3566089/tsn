package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.master.LocationBarcodeListPrintDto;
import com.oneslogi.wms.dto.report.LocationBarcodeListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.master.LocationBarcodeListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションバーコードリスト発行のリソースクラス。
 */
@Path("/master/locationBarcodeListPrint")
public class LocationBarcodeListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "LocationBarcodeList";
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
		 * 発行データ取得取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private MZoneBhv mZoneBhv;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private LocationBarcodeListPrintLogic locationBarcodeListPrintLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return LocationBarcodeListPrintDto ロケーションバーコードリスト発行用DTO
	 */
	@GET
	@Path("/init")
	public LocationBarcodeListPrintDto init() {

		LocationBarcodeListPrintDto dto = new LocationBarcodeListPrintDto();
		// 発行帳票を指定
		dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		return dto;
	}

	/**
	 * <h2>ロケーションバーコードリスト発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースにロケーションバーコードリスト発行データを取得する
	 * </pre>
	 * @param locationBarcodeListPrintDto ロケーションバーコードリスト発行用DTO
	 * @return LocationBarcodeListPrintDto ロケーションバーコードリスト発行用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public LocationBarcodeListPrintDto select(final LocationBarcodeListPrintDto locationBarcodeListPrintDto) throws Exception {

		//ロケーションバーコードリスト発行の取得
		LocationBarcodeListPrintDto ret = new LocationBarcodeListPrintDto();

		// Entity変換
		MLocationDtoMapper mapper = new MLocationDtoMapper();
		MLocation entityLocation = mapper.mappingToEntity(locationBarcodeListPrintDto.data.searchCondition);

		// 発行帳票を指定
		locationBarcodeListPrintDto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）

		MZone entityZ = mZoneBhv.newMyEntity();

		MLocation entityF = mLocationBhv.newMyEntity();

		MLocation entityT = mLocationBhv.newMyEntity();

		entityLocation.setControlNo(controlNo);

		//センタID取得
		String centerCd = entityLocation.getMCenter().getCenterCd();

		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);

		entityF.setCenterId(mCenter.getCenterId());

		//ロケーションコード
		entityF.setLocationCdFrom(entityLocation.getLocationCdFrom());

		entityT.setLocationCdTo(entityLocation.getLocationCdTo());

		//倉庫ID取得
		String warehouseCd = null;

		Long mWarehouseId = null;

		if(entityLocation.getMZone().getMWarehouse() != null){

			warehouseCd = entityLocation.getMZone().getMWarehouse().getWarehouseCd();
		}

		MWarehouse mWarehouse = new MWarehouse();

		if(!CU.isNullOrEmpty(warehouseCd)){

			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse.setCenterId(mCenter.getCenterId());

			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

			entityZ.setWarehouseId(mWarehouse.getWarehouseId());

			mWarehouseId = mWarehouse.getWarehouseId();
		}

		//ゾーンID取得
		String zoneCd = entityLocation.getMZone().getZoneCd();

	   	MZone mZone = new MZone();
	    // [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI Start
	 	entityZ.setZoneCd(zoneCd);

		if(!CU.isNullOrEmpty(zoneCd) && !CU.isNullOrEmpty(warehouseCd)){
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI End
		    mZone.setWarehouseId(mWarehouseId);

			mZone.setZoneCd(zoneCd);

			 mZone = zoneLogic.getUkEntity(mZone);

			entityF.setZoneId(mZone.getZoneId());
		}

		List<MLocation> mLocationList = locationBarcodeListPrintLogic.select(entityF, entityT, entityZ, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (mLocationList == null) {
			return null;
		}

		Iterator<MLocation> mLocationIte = mLocationList.iterator();

		List<LocationBarcodeListDto> retList = new ArrayList<LocationBarcodeListDto>();

		LocationBarcodeListDto locationBarcodeListDto;

		while (mLocationIte.hasNext()) {

			MLocation mLocation = (MLocation) mLocationIte.next();

			MLocationDtoMapper mapperDto = new MLocationDtoMapper();

			MLocationDto tmpDto = mapperDto.mappingToDto(mLocation);

			locationBarcodeListDto = new LocationBarcodeListDto();

			locationBarcodeListDto.locationCd = tmpDto.getLocationCd();

			locationBarcodeListDto.locationNm = tmpDto.getLocationNm();

			locationBarcodeListDto.centerCd = tmpDto.getMCenter().getCenterCd();

			locationBarcodeListDto.centerNm = tmpDto.getMCenter().getCenterAbbr();

			locationBarcodeListDto.warehouseCd = tmpDto.getMZone().getMWarehouse().getWarehouseCd();

			locationBarcodeListDto.warehouseNm = tmpDto.getMZone().getMWarehouse().getWarehouseAbbr();

			locationBarcodeListDto.zoneCd = tmpDto.getMZone().getZoneCd();

			locationBarcodeListDto.zoneNm = tmpDto.getMZone().getZoneNm();

			retList.add(locationBarcodeListDto);
		}

		// 帳票発行処理
		JSON json = new JSON();

		json.setSuppressNull(true);

		locationBarcodeListPrintDto.printBasicData.outputData = json.format(retList);

		printLogic.print(locationBarcodeListPrintDto);

		ret.output = locationBarcodeListPrintDto.output;

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return  ret;
	}
}
