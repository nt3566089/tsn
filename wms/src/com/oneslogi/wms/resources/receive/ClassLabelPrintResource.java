package com.oneslogi.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ClassLabelPrintDto;
import com.oneslogi.wms.dto.report.StoreLabelDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.ClassLabelPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 汎用ラベル出力に必要な各種情報を取得するクラス
 *
 */
@Path("/receive/classLabelPrint")
public class ClassLabelPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "ClassLabel";

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
		 * 汎用ラベル発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}
	@Inject
	private WarehouseLogic mWarehouseLogic;
	@Inject
	private ClassLabelPrintLogic classLabelPrintLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
	@Inject
	private MWarehouseBhv mWarehouseBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return storeLabelPrintDto 汎用ラベル発行用DTO
	 */
	@GET
	@Path("/init")
	public ClassLabelPrintDto init() {
		ClassLabelPrintDto classLabelPrintDto = new ClassLabelPrintDto();

		// 発行帳票を指定
		classLabelPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return classLabelPrintDto;
	}

	/**
	 * <h2>汎用ラベル発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに汎用ラベル発行データを取得する
	 * </pre>
	 * @param storeLabelPrintDto 汎用ラベル発行用DTO
	 * @return classLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public ClassLabelPrintDto print(final ClassLabelPrintDto classLabelPrintDto) throws Exception {

		// [#275] initとprintで使用DTOが異なる問題を修正 2016.12.02 kawana Start

		// Entity変換
		TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper();
		TStoreRecordB entityTStoreRecordB = mapper.mappingToEntity(classLabelPrintDto.data.search);

		// [#275] initとprintで使用DTOが異なる問題を修正 2016.12.02 kawana End

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		numberingCenterLogic.getControlNo();

		//センタマスタ取得
		MCenter centerEntity = mCenterBhv.newMyEntity();

		String centerCd = entityTStoreRecordB.getTStoreRecordH().getMCenter().getCenterCd();

		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		centerEntity.setCenterId(mCenter.getCenterId());

		//荷主マスタ取得
		MClient clientEntity = mClientBhv.newMyEntity();

		String clientCd = entityTStoreRecordB.getTStoreRecordH().getMClient().getClientCd();

		MClient mClient = new MClient();

		mClient.setClientCd(clientCd);

		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		clientEntity.setClientId(mClient.getClientId());

		//倉庫ID取得
		MWarehouse warehouseEntity = mWarehouseBhv.newMyEntity();

		MWarehouse mWarehouse = new MWarehouse();

		if(!CU.isNullOrEmpty(entityTStoreRecordB.chaseTReceivePlanB().chaseMWarehouse().getWarehouseCd())){

			mWarehouse.setWarehouseCd(entityTStoreRecordB.chaseTReceivePlanB().chaseMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());

			mWarehouse = mWarehouseLogic.getUkEntity(mWarehouse);

			if (mWarehouse == null) {
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}

			warehouseEntity.setWarehouseId(mWarehouse.getWarehouseId());
		}

		//入庫No.
		TStoreNo storeLabelNo = new TStoreNo();
		storeLabelNo.setStoreLabelNo(entityTStoreRecordB.getStoreLabelNo());

		//帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）

		List<TStoreRecordB> tStoreRecordBList = classLabelPrintLogic.select(clientEntity, centerEntity, warehouseEntity, entityTStoreRecordB, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (tStoreRecordBList == null) {
			return null;
		}

		List<StoreLabelDto> retList = new ArrayList<StoreLabelDto>();

		StoreLabelDto storeLabelDto;

		for(TStoreRecordB tBody:tStoreRecordBList){

			storeLabelDto = new StoreLabelDto();

			storeLabelDto.cultureId = getCultureId();

			storeLabelDto.clientCd = tBody.getClientCd();

			storeLabelDto.clientNm = tBody.getClientAbbr();

			storeLabelDto.centerCd = tBody.getCenterCd();

			storeLabelDto.centerNm = tBody.getCenterAbbr();

			storeLabelDto.warehouseCd = tBody.getWarehouseCd();

			storeLabelDto.warehouseNm = tBody.getWarehouseAbbr();

			storeLabelDto.storeLabelNo = tBody.getStoreLabelNo();

			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
			storeLabelDto.storeDt = tBody.getStoreDt();
			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

			storeLabelDto.unitNum = 0l;

			storeLabelDto.paraNum = WCC.ZERO;

			storeLabelDto.caseNum = WCC.ZERO;

			storeLabelDto.storeNum = WCC.ZERO;

			storeLabelDto.printCondition = "2";

			storeLabelDto.userCd = this.getUserCd();

			retList.add(storeLabelDto);
		}

		// 帳票発行処理
		JSON json = new JSON();

		json.setSuppressNull(true);

		// [#275] initとprintで使用DTOが異なる問題を修正 2016.12.02 kawana Start

		classLabelPrintDto.printBasicData.outputData = json.format(retList);

		printLogic.print(classLabelPrintDto);

		// [#275] initとprintで使用DTOが異なる問題を修正 2016.12.02 kawana End

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return  classLabelPrintDto;
	}
}
