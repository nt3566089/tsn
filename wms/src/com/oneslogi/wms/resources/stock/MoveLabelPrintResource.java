package com.oneslogi.wms.resources.stock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.MoveLabelDto;
import com.oneslogi.wms.dto.stock.MoveLabelPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.MoveLabelPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 搬送ラベル出力に必要な各種情報を取得するクラス
 *
 */
@Path("/stock/moveLabelPrint")
public class MoveLabelPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "MoveLabel";

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
		 * 搬送ラベル発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;

		/**
		 * 在庫移動指示帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;
	}

	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private WarehouseLogic mWarehouseLogic;
	@Inject
	private MoveLabelPrintLogic moveLabelPrintLogic;
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

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return moveLabelPrintDto 搬送ラベル発行画面用DTO
	 */
	@GET
	@Path("/init")
	public MoveLabelPrintDto init() {

		MoveLabelPrintDto moveLabelPrintDto = new MoveLabelPrintDto();

		// 発行帳票を指定
		moveLabelPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return moveLabelPrintDto;
	}

	/**
	 * <h2>搬送ラベル発行処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに搬送ラベル発行データを取得する
	 * </pre>
	 * @param moveLabelPrintDto 搬送ラベル発行用DTO
	 * @return moveLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public MoveLabelPrintDto select(final MoveLabelPrintDto moveLabelPrintDto) throws Exception {

		// 発行帳票を指定
		moveLabelPrintDto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// Entity変換
		TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper();
		TMoveInstB entityTMoveInstB = mapper.mappingToEntity(moveLabelPrintDto.data.search);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		numberingCenterLogic.getControlNo();

		// 在庫移動指示ヘッダ
		TMoveInstH tMoveInstH = tMoveInstHBhv.newMyEntity();

		// センタID取得
		String centerCd = entityTMoveInstB.getTMoveInstH().getMCenter().getCenterCd();

		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tMoveInstH.setCenterId(mCenter.getCenterId());

		// 荷主ID取得
		String clientCd = entityTMoveInstB.getTMoveInstH().getMClient().getClientCd();

		MClient mClient = new MClient();

		mClient.setClientCd(clientCd);

		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tMoveInstH.setClientId(mClient.getClientId());

		// 指示日
		tMoveInstH.setInstDt(entityTMoveInstB.getTMoveInstH().getInstDt());

		// WMS在庫移動伝票No.
		tMoveInstH.setMoveSlipNo(entityTMoveInstB.getTMoveInstH().getMoveSlipNo());

		// 在庫移動指示ボディ
		TMoveInstB tMoveInstB = tMoveInstBBhv.newMyEntity();

		// 倉庫ID取得
		MWarehouse mWarehouse = new MWarehouse();

		if(!CU.isNullOrEmpty(entityTMoveInstB.chaseMWarehouse().getWarehouseCd())){

			mWarehouse.setWarehouseCd(entityTMoveInstB.chaseMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());

		    mWarehouse = mWarehouseLogic.getUkEntity(mWarehouse);

		    if (mWarehouse == null) {
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}

		    tMoveInstB.setWarehouseId(mWarehouse.getWarehouseId());
		}

		// 入庫ラベルNo.
		tMoveInstB.setStoreLabelNo(entityTMoveInstB.getStoreLabelNo());

		// ユーザCD
		tMoveInstB.setAddUser(entityTMoveInstB.getAddUser());

		// 発行条件
		if (!"2".equals(entityTMoveInstB.getPrintCondition())) {
			tMoveInstB.setPrintCondition(entityTMoveInstB.getPrintCondition());
		}

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		List<TMoveInstB> stockList = moveLabelPrintLogic.select(tMoveInstH, tMoveInstB, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (stockList == null) {
			//this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		Iterator<TMoveInstB> stockIte = stockList.iterator();

		List<MoveLabelDto> retList = new ArrayList<MoveLabelDto>();

		MoveLabelDto moveLabelDto;

		while (stockIte.hasNext()) {

			TMoveInstB tBody = (TMoveInstB) stockIte.next();

			// 調整移動区分(0:調整の場合、出力しない)
			if("0".equals(tBody.getClsMove())) {
				continue;
			}

			// 倉庫CD
			if (!CU.isNullOrEmpty(entityTMoveInstB.chaseMWarehouse().getWarehouseCd())){
				if((tBody.chaseMWarehouse() != null ) &&
						!CU.isNullOrEmpty(tBody.chaseMWarehouse().getWarehouseCd()) &&
						entityTMoveInstB.chaseMWarehouse().getWarehouseCd().equals(tBody.chaseMWarehouse().getWarehouseCd())){
					// 何もしない
				} else {
					continue;
				}
			}


			// [#134] 搬送ラベルの入数を商品荷姿マスタから取得するように変更 2016.10.28 kawana Start

			// [Ver3.0] unit of measure対応 2017.11.28 REN Del

			// [#134] 搬送ラベルの入数を商品荷姿マスタから取得するように変更 2016.10.28 kawana End

			moveLabelDto = new MoveLabelDto();

			moveLabelDto.cultureId = getCultureId();

			// 荷主CD
			moveLabelDto.clientCd = tBody.chaseTMoveInstH().chaseMClient().getClientCd();

			// 荷主略称
			moveLabelDto.clientNm = tBody.chaseTMoveInstH().chaseMClient().getClientAbbr();

			// センタCD
			moveLabelDto.centerCd = tBody.chaseTMoveInstH().chaseMCenter().getCenterCd();

			// センタ略称
			moveLabelDto.centerNm = tBody.chaseTMoveInstH().chaseMCenter().getCenterAbbr();

			// 商品CD
			if(!CU.isNullOrEmpty(tBody.chaseMProduct().getProductCd())){
				moveLabelDto.productCd = tBody.chaseMProduct().getProductCd();
			}else{
				moveLabelDto.productCd = "";
			}

			// 商品名称
			moveLabelDto.productNm = tBody.chaseMProduct().getProductAbbr();

			// JANCD
			if(!CU.isNullOrEmpty(tBody.chaseMProduct().getJanCd())){
				moveLabelDto.janCd = tBody.chaseMProduct().getJanCd();
			}else{
				moveLabelDto.janCd = "";
			}

			// 預託
			moveLabelDto.depositNm = tBody.chaseMCustomerByDepositId().getCustomerAbbr();

			// 期限日
			moveLabelDto.limitDt = tBody.getLimitDt();

			// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod Start
			// 倉庫CD
			if (!CU.isNullOrEmpty(tBody.chaseMWarehouse().getWarehouseCd())) {
				moveLabelDto.warehouseCd = tBody.chaseMWarehouse().getWarehouseCd();
			} else {
				moveLabelDto.warehouseCd = "";
			}

			// 倉庫略称
			if (!CU.isNullOrEmpty(tBody.chaseMWarehouse().getWarehouseAbbr())) {
				moveLabelDto.warehouseNm = tBody.chaseMWarehouse().getWarehouseAbbr();
			} else {
				moveLabelDto.warehouseNm = "";
			}
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(倉庫CD,NM表示対象) 2018.04.03 honma Mod End

			// 在庫区分
			moveLabelDto.stockType = tBody.chaseMStockType().chaseVDict().getDictNm();

			// ロット
			moveLabelDto.lot = tBody.getLot();

			// ゾーンCD
			moveLabelDto.zoneCd = tBody.chaseMLocation().chaseMZone().getZoneCd();

			// ゾーン名称
			moveLabelDto.zoneNm = tBody.chaseMLocation().chaseMZone().getZoneNm();

			// 総ピース数
			moveLabelDto.storeNum = tBody.getInstNum();

			// [#134] 搬送ラベルの入数を商品荷姿マスタから取得するように変更 2016.10.28 kawana Start
			// [Ver3.0] unit of measure対応 2017.11.28 REN Del
			// [#134] 搬送ラベルの入数を商品荷姿マスタから取得するように変更 2016.10.28 kawana End

			// [Ver3.0] unit of measure対応 2017.11.21 REN Start
			//内訳
			moveLabelDto.setBreakdown(tBody.getBreakdown());

			//入数
			moveLabelDto.setStringUnitNum(tBody.getStringUnitNum());

			//最小梱包単位
			moveLabelDto.setMinimumPackingUnit(tBody.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.21 REN End

			// [Ver3.0] unit of measure対応 2017.11.28 REN Del

			// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
			// 入庫ラベルNo.
			moveLabelDto.storeLabelNo = CU.nullToStr(tBody.getStoreLabelNo());
			// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End

			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
			//入庫日
			if((tBody.chaseTStoreNo() != null ) &&
					!CU.isNullOrEmpty(tBody.chaseTStoreNo().getStoreDt())){
				moveLabelDto.storeDt = tBody.chaseTStoreNo().getStoreDt();
			}else{
				moveLabelDto.storeDt = "";
			}
			//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

			moveLabelDto.printCondition = "1";

			// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外) 2018.04.03 honma Mod Start
			// 推奨ロケCD
			moveLabelDto.tLoactionCd = "";

			// 推奨ロケ
			moveLabelDto.tLocationNm = "";
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外) 2018.04.03 honma Mod End

			// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
			if (tBody.chaseMProduct().getMLocationList().size() > 0) {
				// ピックロケCD
				moveLabelDto.setPickTLocationCd(tBody.chaseMProduct().getMLocationList().get(0).getLocationCd());

				// ピックロケ名称
				moveLabelDto.setPickTLocationNm(tBody.chaseMProduct().getMLocationList().get(0).getLocationNm());
			}
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End

			// 出庫ロケCD(入出庫区分:1出庫)
			moveLabelDto.outTLocationCd = tBody.getOutTLocationCd();

			// 出庫ロケ(入出庫区分:1出庫)
			moveLabelDto.outTLocationNm = tBody.getOutTLocationNm();

			// 入庫ロケCD(入出庫区分:0入庫)
			moveLabelDto.inTLocationCd = tBody.getInTLocationCd();

			// 入庫ロケ(入出庫区分:0入庫)
			moveLabelDto.inTLocationNm = tBody.getInTLocationNm();

			// ユーザCD
			moveLabelDto.userCd = tBody.getAddUser();

			retList.add(moveLabelDto);
		}

		// 該当データ無し
		if (retList.size() == 0) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 帳票発行処理
		JSON json = new JSON();

		json.setSuppressNull(true);

		moveLabelPrintDto.printBasicData.outputData = json.format(retList);

		printLogic.print(moveLabelPrintDto);

		// 搬送ラベル発行の取得
		MoveLabelPrintDto returnMoveLabelPrintDto = new MoveLabelPrintDto();
		returnMoveLabelPrintDto.output = moveLabelPrintDto.output;

		for(TMoveInstB stock : stockList) {
			// 調整移動区分(0:調整の場合、出力しないので、更新しない)
			if("0".equals(stock.getClsMove())) {
				continue;
			}

			// 倉庫CD
			if (!CU.isNullOrEmpty(entityTMoveInstB.chaseMWarehouse().getWarehouseCd())){
				if((stock.chaseMWarehouse() != null ) &&
						!CU.isNullOrEmpty(stock.chaseMWarehouse().getWarehouseCd()) &&
						entityTMoveInstB.chaseMWarehouse().getWarehouseCd().equals(stock.chaseMWarehouse().getWarehouseCd())){
					// 何もしない
				} else {
					continue;
				}
			}

			TMoveInstR tMoveInstR = new TMoveInstR();
			tMoveInstR.setMoveInstHId(stock.getMoveInstHId());

			// 指示書出力フラグ更新処理（ロジッククラスを呼ぶ）
			moveLabelPrintLogic.update(tMoveInstR, errRetSts(StatusCode.UPDATE_EXCEPTION));
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return  returnMoveLabelPrintDto;
	}

}
