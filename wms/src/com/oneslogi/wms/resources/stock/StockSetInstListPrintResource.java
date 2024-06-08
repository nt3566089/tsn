package com.oneslogi.wms.resources.stock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.StockSetInstListDto;
import com.oneslogi.wms.dto.stock.StockSetInstListPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.stock.StockSetInstListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * セット組指示書発行に必要な各種情報を取得するクラス。
 */
@Path("/stock/stockSetInstListPrint")
public class StockSetInstListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "StockSetInstList";
	private static final String PGM_CD = "StockSetInstListPrint";

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
		 * セット組指示書発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * セット組指示書更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 4;
		/**
		 * 預託在庫区分が存在異常
		 */
		protected static final int DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR = 5;
		/**
		 * 在庫区分が存在異常
		 */
		protected static final int STOCK_CLASS_NOT_FOUND_ERROR = 6;
	}

	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private StockSetInstListPrintLogic stockSetInstListPrintLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockSetInstListPrintDto セット組指示書発行リスト画面用DTO
	 */
	@GET
	@Path("/init")
	public StockSetInstListPrintDto init() {
		StockSetInstListPrintDto stockSetInstListPrintDto = new StockSetInstListPrintDto();

		// 発行帳票を指定
		stockSetInstListPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return stockSetInstListPrintDto;
	}

	/**
	 * <h2>セット組指示書発行リスト発行。</h2>
	 * <pre>
	 * ・コントロールNo.を更新してから、セット組指示書発行リストデータを取得する
	 * ・帳票を発行する
	 * ・エラーがない場合は、データベースにセット組指示書発行データを更新する
	 * ・・セット組指示書発行リスト出力フラグ
	 * </pre>
	 * @param dto セット組指示書発行リスト画面用DTO
	 * @return StockSetInstListPrintDto セット組指示書発行リスト画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public StockSetInstListPrintDto print(final StockSetInstListPrintDto dto) throws Exception {

		// 発行帳票を指定
		dto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper();
		TMoveInstB tMoveInstB = mapper.mappingToEntity(dto.data.search);

		//コントロールNo更新
		TMoveInstR update = new TMoveInstR();

		TMoveInstH tMoveInstH = new TMoveInstH();

		TMoveInstR report = new TMoveInstR();

		//エンティティ編集
		update.setControlNo(controlNo);

		//マスタ検索で必要なIDの取得
		// ===== センタIDを取得 =====
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tMoveInstB.getTMoveInstH().getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		// センタIDを設定
		tMoveInstH.setCenterId(centerId);

		// ===== 荷主IDを取得 =====
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tMoveInstB.getTMoveInstH().getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		// 荷主IDを設定
		tMoveInstH.setClientId(clientId);

		// ===== 親商品IDを取得 =====
		MProduct productCondition = new MProduct();
		if(!CU.isNullOrEmpty(tMoveInstB.getMProduct().getProductCd())){
			productCondition.setClientId(clientId);
			productCondition.setProductCd(tMoveInstB.getMProduct().getProductCd());
			MProduct product = productLogic.getUkEntity(productCondition);
			if (product == null) {
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND),	WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				return null;
			}else{
				// 親商品存在チェック
				stockSetInstListPrintLogic.parentIdCheck(product.getProductId(), errRetSts(StatusCode.PRODUCT_NOT_FOUND));
				if (getErrorManager().size() > 0) {
					return null;
				}
				// 商品IDを設定
				tMoveInstB.setProductId(product.getProductId());
			}
		}

		// ===== 預託IDを取得 =====
		String customerCd = tMoveInstB.getDepositCd();
		if(!CU.isNullOrEmpty(customerCd)){
			MCustomer deposit = new MCustomer();
			deposit.setCustomerCd(customerCd);
			deposit.setClientId(clientId);
			deposit = customerLogic.getUkEntity(deposit);
			if(deposit == null){
				//預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			}else{
				// 預託IDを設定
				tMoveInstB.setDepositId(deposit.getCustomerId());
			}
		}

		// ===== 在庫区分IDを取得 =====
		String stockTypeCd = tMoveInstB.getStockTypeCd();
		MStockType mStockType = new MStockType();
		if(!CU.isNullOrEmpty(stockTypeCd)){
			mStockType.setStockTypeCd(stockTypeCd);
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if(mStockType == null){
				// 在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.STOCK_CLASS_NOT_FOUND_ERROR), WmsMessageConst.STOCK_TYPE_NOT_FOUND_ERROR);
			}else{
				// 在庫区分IDを設定
				tMoveInstB.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		// [ON推-品向-1032] 検索条件に発行条件を追加 2015.12.16 koyama Start
		//発行条件
		if (!"2".equals(tMoveInstB.getPrintCondition())) {
			report.setInstOutFlg(tMoveInstB.getPrintCondition());
		}

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		stockSetInstListPrintLogic.updateControlNo(update, tMoveInstH, tMoveInstB, report, errRetSts(StatusCode.UPDATE_EXCEPTION));
		// [ON推-品向-1032] 検索条件に発行条件を追加 2015.12.16 koyama End

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//セット組指示書帳票(検索用)
		report.setControlNo(update.getControlNo());

		//セット組指示書発行データ取得メソッドを呼出し
		List<StockSetInstListDto> stockSetInstList = stockSetInstListPrintLogic.select(update, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<StockSetInstListDto> dataList = new ArrayList<StockSetInstListDto>();
		boolean blnFirst = true;
		String moveSlipNoPre = null;
		String productCdPre =  "";
		String isFirstFlg = "0";
		for (StockSetInstListDto printList : stockSetInstList) {
			StockSetInstListDto redto = new StockSetInstListDto();
			redto.setCultureId(getCultureId());
			redto.setReportCd(REPORT_CD);
			redto.setPgmCd(PGM_CD);
			redto.printFlg = printList.printFlg;

			isFirstFlg = "0";
			if (!blnFirst == true) {
				if (!moveSlipNoPre.equals(printList.getMoveSlipNo()) || !productCdPre.equals(printList.getProductCd())) {
					dataList.get(dataList.size()-1).setIsLastFlg("1");
					isFirstFlg = "1";
				}
			} else {
				isFirstFlg = "1";
				blnFirst = false;
			}
			moveSlipNoPre = printList.getMoveSlipNo();
			productCdPre = printList.getProductCd();

			// ヘッダ設定
			redto.setMoveSlipNo(printList.getMoveSlipNo());
			redto.setCenterCd(printList.getCenterCd());
			redto.setCenterNm(printList.getCenterNm());
			redto.setClientCd(printList.getClientCd());
			redto.setClientNm(printList.getClientNm());
			redto.setWarehouseCd(printList.getWarehouseCd());
			redto.setWarehouseNm(printList.getWarehouseNm());
			redto.setProductCdH(printList.getProductCdH());
			redto.setProductNmH(printList.getProductNmH());
			redto.setDepositCdH(printList.getDepositCdH());
			redto.setDepositNmH(printList.getDepositNmH());
			redto.setStockTypeCdH(printList.getStockTypeCdH());
			redto.setStockTypeNmH(printList.getStockTypeNmH());
			redto.setLocationCdH(printList.getLocationCdH());
			redto.setLocationNmH(printList.getLocationNmH());
			redto.setInstNumH(printList.getInstNumH());
			redto.setLotH(printList.getLotH());
			redto.setLimitDtH(printList.getLimitDtH());
			redto.setStoreDtH(printList.getStoreDtH());

			// 明細設定
			redto.setProductCd(printList.getProductCd());
			redto.setProductNm(printList.getProductNm());
			redto.setDepositCd(printList.getDepositCd());
			redto.setDepositNm(printList.getDepositNm());
			redto.setUnitNum(printList.getUnitNum());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
			redto.setJanCd(printList.getJanCd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End
			redto.setStoreLabelNo(printList.getStoreLabelNo());
			redto.setStockTypeCd(printList.getStockTypeCd());
			redto.setStockTypeNm(printList.getStockTypeNm());
			redto.setLocationCd(printList.getLocationCd());
			redto.setLocationNm(printList.getLocationNm());
			redto.setInstNum(printList.getInstNum());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
			redto.setMinimumPackingUnit(printList.getMinimumPackingUnit());
			// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End
			redto.setLot(printList.getLot());
			redto.setLimitDt(printList.getLimitDt());
			redto.setStoreDt(printList.getStoreDt());
			redto.setChargeNum(printList.getChargeNum());
			redto.setIsFirstFlg(isFirstFlg);
			redto.setIsLastFlg("0");

			dataList.add(redto);
		}
		dataList.get(dataList.size()-1).setIsLastFlg("1");

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//セット組指示書を発行する
		dto.printBasicData.outputData = json.format(dataList);
		printLogic.print(dto);

		StockSetInstListPrintDto stockSetInstListPrintDto = new StockSetInstListPrintDto();
		stockSetInstListPrintDto.output = dto.output;

		Timestamp time = new Timestamp(System.currentTimeMillis());

		//在庫移動指示帳票更新
		update.setControlNo(null);

		update.setInstOutFlg_$1();

		update.setInstOutUserId(this.getUserId());

		update.setInstOutDt(time);

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		stockSetInstListPrintLogic.updateOutFlg(update, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return stockSetInstListPrintDto;
	}

}
