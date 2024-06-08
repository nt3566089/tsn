package com.oneslogi.wms.resources.receive;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ReceivePlanListPrintDto;
import com.oneslogi.wms.dto.report.ReceivePlanListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入荷予定リスト出力に必要な各種情報を取得するクラス
 * @author hi.watanabe.mp
 *
 */
@Path("/receive/receivePlanListPrint")
public class ReceivePlanListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "ReceivePlanList";

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
		 * 入荷予定データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;

		/**
		 * 入荷予定帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;

	}

	@Inject
	private WarehouseLogic mWarehouseLogic;
	@Inject
	private ReceivePlanListPrintLogic receivePlanListPrintLogic;
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
	 * @return receivePlanListPrintDto 入荷予定リスト発行画面用DTO
	 */
	@GET
	@Path("/init")
	public ReceivePlanListPrintDto init() {
		ReceivePlanListPrintDto receivePlanListPrintDto = new ReceivePlanListPrintDto();

		// 発行帳票を指定
		receivePlanListPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return receivePlanListPrintDto;
	}

	/**
	 * <h2>入荷予定リスト発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、入荷予定帳票データ更新を取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに入荷予定帳票データ更新を更新する
	 * ・入荷予定リスト出力フラグ
	 * </pre>
	 * @param dtoList 入荷予定リスト発行画面用DTO
	 * @return receivePlanListPrintDto 処理結果DTO
	 */
	@GET
	@Path("/print")
	public ReceivePlanListPrintDto print(final List<ReceivePlanListPrintDto> dtoList) throws Exception {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		//荷主センタ変更対応 201７.02.24 sja Start
		MCenter mCenter = new MCenter();
		//荷主センタ変更対応 201７.02.24 sja End
		for(ReceivePlanListPrintDto dto : dtoList)
		{
			// 発行帳票を指定
			dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

			// Entity変換
			TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
			TReceivePlanB entity = mapper.mappingToEntity(dto.data.search);

			//コントロールNo更新
			TReceivePlanR update = new TReceivePlanR();

			TReceivePlanH header = new TReceivePlanH();

			TReceivePlanB body = new TReceivePlanB();

			TReceivePlanR report = new TReceivePlanR();

			//エンティティ編集
			update.setControlNo(controlNo);

			//センタID取得
			String centerCd = entity.getTReceivePlanH().getMCenter().getCenterCd();
			//荷主センタ変更対応 201７.02.24 sja Start
//			MCenter mCenter = new MCenter();
			//荷主センタ変更対応 201７.02.24 sja End

			mCenter.setCenterCd(centerCd);

			mCenter = centerLogic.getUkEntity(mCenter);

			header.setCenterId(mCenter.getCenterId());

			//荷主ID取得
			String clientCd = entity.getTReceivePlanH().getMClient().getClientCd();

			MClient mClient = new MClient();

			mClient.setClientCd(clientCd);

			mClient = clientLogic.getUkEntity(mClient);

			header.setClientId(mClient.getClientId());

			//倉庫
			String warehouseCd = entity.getPlanWarehouseCd();

			if (!CU.isNullOrEmpty(warehouseCd)) {
				MWarehouse mWarehouse = new MWarehouse();
				mWarehouse.setWarehouseCd(warehouseCd);
				mWarehouse.setCenterId(mCenter.getCenterId());
				mWarehouse = mWarehouseLogic.getUkEntity(mWarehouse);
				body.setPlanWarehouseId(mWarehouse.getWarehouseId());
			}

			//入荷予定日(From)
			header.setReceivePlanDtFrom(entity.getTReceivePlanH().getReceivePlanDtFrom());

			//入荷予定日(To)
			header.setReceivePlanDtTo(entity.getTReceivePlanH().getReceivePlanDtTo());

			//WMS入荷伝票No.
			header.setReceiveSlipNo(entity.getTReceivePlanH().getReceiveSlipNo());

			//顧客入荷指示No.
			header.setPlanClientReceiveNo(entity.getTReceivePlanH().getPlanClientReceiveNo());

			//予預
			String deposit = entity.getTReceivePlanH().getMCustomerByPlanDepositId().getCustomerCd();

			header.setPlanDepositCd(deposit);

			//発行条件
			if (!"2".equals(entity.getTReceivePlanH().getPrintCondition())) {
				report.setRplOutFlg(entity.getTReceivePlanH().getPrintCondition());
			}

			// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
			receivePlanListPrintLogic.updateControlNo(update, header, body, report, errRetSts(StatusCode.UPDATE_EXCEPTION));
		}

		//入荷予定帳票(検索用)
		TReceivePlanR tReceivePlanR = new TReceivePlanR();
		tReceivePlanR.setControlNo(controlNo);

		//入荷予定リスト発行データ取得メソッドを呼出し
		//荷主センタ変更対応 201７.02.24 sja Start
//		List<TReceivePlanB> receivePlanBList = receivePlanListPrintLogic.select(tReceivePlanR,errRetSts(StatusCode.NOT_FOUND_DATA));
		List<TReceivePlanB> receivePlanBList = receivePlanListPrintLogic.select(tReceivePlanR,mCenter, errRetSts(StatusCode.NOT_FOUND_DATA));
		//荷主センタ変更対応 201７.02.24 sja End

		if (receivePlanBList == null) {
			return null;
		}

		// 帳票出力データ取得処理
		List<ReceivePlanListDto> dataList = new ArrayList<ReceivePlanListDto>();

		for (TReceivePlanB tReceivePlanB : receivePlanBList) {
			ReceivePlanListDto redto = new ReceivePlanListDto();
			redto.cultureId = getCultureId();
			redto.receivePlanHId = tReceivePlanB.getReceivePlanHId();
			redto.receivePlanBId = tReceivePlanB.getReceivePlanBId();

			// ヘッダ部
			TReceivePlanH tReceivePlanH = tReceivePlanB.chaseTReceivePlanH();
			//帳票ID
			redto.reportId = reportLogic.getReportId(REPORT_CD);

			//帳票CD
			redto.reportCd = REPORT_CD;

			//センタCD
			redto.centerCd = tReceivePlanH.chaseMCenter().getCenterCd();

			//センタ略称
			redto.centerNm = tReceivePlanH.chaseMCenter().getCenterAbbr();

			//荷主CD
			redto.clientCd = tReceivePlanH.chaseMClient().getClientCd();

			//荷主略称
			redto.clientNm = tReceivePlanH.chaseMClient().getClientAbbr();

			//入荷予定日
			redto.receivePlanDt = tReceivePlanH.getReceivePlanDt();

			//仕入先CD
			redto.planSupplierCd = tReceivePlanH.chaseMCustomerByPlanSupplierId().getCustomerCd();

			//仕入先略称
			redto.planSupplierNm = tReceivePlanH.chaseMCustomerByPlanSupplierId().getCustomerAbbr();

			//預託CD
			redto.depositCd = tReceivePlanH.chaseMCustomerByPlanDepositId().getCustomerCd();

			//預託略称
			redto.depositNm = tReceivePlanH.chaseMCustomerByPlanDepositId().getCustomerAbbr();

			//WMS入荷伝票No.
			redto.receiveSlipNo = tReceivePlanH.getReceiveSlipNo();

			//顧客入荷指示No.
			redto.clientReceiveNo = tReceivePlanH.getPlanClientReceiveNo();

			//処理区分CD
			redto.setProcessTypeCd(tReceivePlanH.chaseMProcessType().getProcessTypeCd());

			//処理区分略称
			redto.setProcessTypeNm(tReceivePlanH.chaseMProcessType().chaseVDict().getDictNm());

			// [ON推-品向-955] 在庫区分を追加 2015.10.01 kawana Start

			//在庫区分CD
			redto.stockTypeCd = tReceivePlanH.chaseMStockType().getStockTypeCd();

			//在庫区分名称
			redto.stockTypeNm = tReceivePlanH.chaseMStockType().chaseVDict().getDictNm();

			// [ON推-品向-955] 在庫区分を追加 2015.10.01 kawana End

			// ボディ部
			//No.
			redto.lineNo = tReceivePlanB.getLineNo();

			//商品CD
			redto.productCd = tReceivePlanB.getProductCd();
			// [SK2-009] 予定ロケーションのみ表示するように修正します。 2014.12.09 衛 Start
			//ロケーションNM
			redto.locationNm = tReceivePlanB.chaseMLocation().getLocationNm();
			// [SK2-009] 予定ロケーションのみ表示するように修正します。 2014.12.09 衛 End
			//商品名称
			redto.productNm = tReceivePlanB.chaseMProduct().getProductAbbr();

			//顧客発注No.
			redto.clientOrderNo = tReceivePlanB.getPlanClientOrderNo();

			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			//JAN
			redto.janCd = tReceivePlanB.chaseMProduct().getJanCd();
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End

			//期限日
			redto.planLimitDt = tReceivePlanB.getPlanLimitDt();

			//ロット
			redto.planLot = tReceivePlanB.getPlanLot();

			//入荷総数(予定)
			BigDecimal pNum = tReceivePlanB.getPlanNum();

			redto.planNum = pNum;

			// [Ver3.0] unit of measure対応 2017.11.21 REN Start
			//内訳
			redto.setBreakdown(tReceivePlanB.getBreakdown());

			//入数
			redto.setStringUnitNum(tReceivePlanB.getStringUnitNum());

			//最小梱包単位
			redto.setMinimumPackingUnit(tReceivePlanB.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.21 REN End

			// [Ver3.0] unit of measure対応 2017.11.21 REN Del

			// 発行フラグ
			if (!"2".equals(tReceivePlanH.chaseTReceivePlanRAsOne().getRplOutFlg())) {
				redto.printFlg = tReceivePlanH.chaseTReceivePlanRAsOne().getRplOutFlg();
			}

			dataList.add(redto);
		}

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//入荷予定帳票を発行する
		dtoList.get(0).printBasicData.outputData = json.format(dataList);
		printLogic.print(dtoList.get(0));

		ReceivePlanListPrintDto receivePlanListPrintDto = new ReceivePlanListPrintDto();
		receivePlanListPrintDto.output = dtoList.get(0).output;

		Timestamp time = new Timestamp(System.currentTimeMillis());
		TReceivePlanR tr = new TReceivePlanR();
		//入荷予定帳票更新
		tr.setControlNo(null);

		tr.setRplOutFlg_$1();

		tr.setRplOutUserId(this.getUserId());

		tr.setRplOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		receivePlanListPrintLogic.updateRplOutFlg(tr, tReceivePlanR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return receivePlanListPrintDto;
	}
}
