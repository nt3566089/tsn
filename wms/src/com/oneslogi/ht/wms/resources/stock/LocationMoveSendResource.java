package com.oneslogi.ht.wms.resources.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.stock.LocationMoveDto;
import com.oneslogi.ht.wms.logic.stock.LocationMoveSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StoreLabelNoNumberingLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.StockTransferInstructionLogic;
import com.oneslogi.wms.logic.stock.StockTransferResultLogic;
import com.oneslogi.wms.logic.stock.StockTransferStatusUpdateLogic;

/**
 * ロケ変更(確認)画面Resourceクラスです。
 *
 */
@Path("/handy/LocationMoveSend")
@HandyErrorReturnPath(returnURL = "LocationMoveSend/display")
public class LocationMoveSendResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private StockTransferInstructionLogic stocktransferInstruction;
	@Inject
	private StockTransferResultLogic stocktransferResult;
	@Inject
	private StockTransferStatusUpdateLogic stocktransferStatusUpdate;
	@Inject
	private LocationMoveSelectLogic selectLogic;
	// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;
	// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End

	/**
	 * ロケ変更(確認)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		//自画面表示
		display(resource, util);
	}

	/**
	 * ロケ変更(確認)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng Start
		//画面ヘッダ設定
		resource.initScreen("LocationMoveSendHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("LocationMoveInLoc/display").itemCd("no").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("LocationMoveSend/send").itemCd("yes").build());
		//非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("LocationMoveSend/send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng end

		//ロケ変更(確認)画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/LocationMoveSend.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ロケ変更(出庫ロケ)に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("LocationMoveHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");

		// [ON推-品向-1008] 在庫の排他チェックを追加 2015.11.13 kawana Start

		List<TStockDto> sesStockDtoList = dto.getLstTStockDto();
		if (sesStockDtoList == null) {

			//他のユーザに変更されています。内容を確認して下さい。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}

		TStockDtoMapper stockDtoMapper = new TStockDtoMapper();
		List<TStock> sesStockList = stockDtoMapper.mappingToEntityList(sesStockDtoList);

		TStock stockCondition = stockDtoMapper.mappingToEntity(dto.getTStockDto());

		// ===== 移動対象の在庫の再取得(移動に必要なマスタを結合) =====
		// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana Start
		List<TStock> stockList = selectLogic.selectMoveStock(stockCondition, sesStockList);
		// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana End
		if (0 < getErrorManager().size()) {
			return;
		}

		//[ON推-品質問題点指摘票(新ｿﾘV2-053)] 修正対応 2016.08.18 chou Del

		// 移動先ロケーションの設定
		MLocation mLocationTo = new MLocation();
		mLocationTo.setLocationId(dto.getLocationId());
		mLocationTo.setLocationCd(dto.getLocationCd());

		// [ON推-品向-1008] 在庫の排他チェックを追加 2015.11.13 kawana End

		// === 在庫データ件数分繰返 ===
		for (TStock stock : stockList) {
			MoveOneData(stock, stock.getChargeNum(), mLocationTo);
			if (0 < getErrorManager().size()) {
				return;
			}
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		//移動数
		BigDecimal chargeNumSumUsedByLog = WCC.ZERO;
		// === 在庫データ件数分繰返 ===
		for (TStock stock : stockList) {
			chargeNumSumUsedByLog = WCC.add(chargeNumSumUsedByLog, stock.getChargeNum());
		}
		setWorkLogQty(chargeNumSumUsedByLog);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [C-CWMS-0050] 補充ロケーデータ更新 2016.2.19 nayzaw Start
		stocktransferResult.updateLocationReplenishData(stockList.get(0).getLocationId(), dto.getLocationId());

		// [C-CWMS-0050] 補充ロケーデータ更新 2016.2.19 nayzaw End

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

		//ロケ変更(出庫ロケ)画面を表示
		LocationMoveOutLocResource.load(this, util, centerLogic, clientLogic, warehouseLogic);
	}

	/**
	 * <h2>移動指示データの作成</h2>
	 * <pre>
	 * 一件在庫データを移動する
	 * </pre>
	 * @param instNum      在庫データ
	 * @param instNum      出庫指示数
	 */
	private void MoveOneData(TStock tStock, BigDecimal instNum, MLocation mLocationTo) {

		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH header =new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		List<TMoveInstB> bodyList =new ArrayList<TMoveInstB>();
		TMoveInstB bodyFrom = new TMoveInstB();
		TMoveInstB bodyTo = new TMoveInstB();

		// ===== 移動指示データの作成 =====
		createMoveInstData(tStock,header,bodyFrom, bodyTo);

		bodyFrom.setInstNum(instNum);
		bodyTo.setInstNum(instNum);
		bodyTo.setLocationId(mLocationTo.getLocationId());
		bodyTo.setLocationCd(mLocationTo.getLocationCd());
		bodyList.add(bodyFrom);
		bodyList.add(bodyTo);

		// ===== 在庫移動指示.在庫移動クラスを呼出し =====
		stocktransferInstruction.stockMove(header, bodyList, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return;
		}

		try {

			// ===== tMoveInstBListのデータ件数分繰返 =====
			for (TMoveInstB body : bodyList) {

				// ===== 処理区分判定=====
				// ===== tMoveInstBList．入出庫区分が１：出庫の場合 =====
				if (body.isInoutType$1()){
					// ===== 在庫移動実績.在庫移動［出庫］クラスを呼出し =====
					stocktransferResult.stockMoveOut(header, bodyList, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}

					// ===== 在庫移動ステータス更新.在庫移動［出庫］クラスを呼出し =====
					stocktransferStatusUpdate.stockMoveOut(header, body, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}
				}
			}

			for (TMoveInstB body : bodyList) {
				// ===== 処理区分判定=====
				// ===== tMoveInstBList．入出庫区分が0：入庫の場合 =====
				if (body.isInoutType$0()) {
				// ===== 在庫移動実績.在庫移動［入庫］クラスを呼出し =====
					stocktransferResult.stockMoveIn(header, bodyList, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}
					// ===== 在庫移動ステータス更新.在庫移動［入庫］クラスを呼出し =====
					stocktransferStatusUpdate.stockMoveIn(header, body, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}
				}
			}

		} catch (Exception e) {
			//他のユーザが変更している可能性があります。内容を確認して下さい。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.EXCLUSIVE_CONTROL_ERROR);
			return;
		}

	}

	/**
	 * <h2>移動指示データの作成</h2>
	 * <pre>
	 * 在庫データの内容は移動指示データに設定する
	 * </pre>
	 * @param stockMoveDto 在庫移動画面用DTO
	 * @param header       在庫移動指示ヘッダ
	 * @param bodyFrom     在庫移動指示ボディ（出庫）
	 * @param bodyTo       在庫移動指示ボディ（入庫）
	 */
	private void createMoveInstData(TStock tStock ,TMoveInstH header ,TMoveInstB bodyFrom, TMoveInstB bodyTo) {

		// ====== 在庫移動指示ヘッダ情報の設定 =======
		header.setClientId(tStock.getClientId());
		header.setCenterId(tStock.getMWarehouse().getCenterId());
		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(header.getClientId());
		mClientCenter.setCenterId(header.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// システム管理日付の取得
		String inst_Dt = "";
		try {
			inst_Dt = CommonUtil.dateToString(CommonUtil.stringToDate(mClientCenter.getSystemDt()));
			header.setInstDt(inst_Dt);
		} catch (Exception e) {
			getErrorManager().throwException(e);
		}

		// WMS在庫移動伝票No.を登録する直前に採番
		String moveSlipNo = numberingCenterLogic.getNumbering(header.getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);
		header.setMoveSlipNo(moveSlipNo);

		// 処理区分マスタCDCd取得と処理区分マスタID設定 =====
		MProcessType mProcessType = new MProcessType();
		mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$21.code());
		mProcessType = processTypeLogic.getUkEntity(mProcessType);
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		header.setMoveInstStatus_$02();
		header.setInputType_$30();

		// ====== 在庫移動指示ボディ情報の設定（出庫） =======
		bodyFrom.setMoveInstStatus_$02();
		bodyFrom.setInoutType_$1();
		bodyFrom.setWarehouseId(tStock.getMWarehouse().getWarehouseId());
		bodyFrom.setWarehouseCd(tStock.getMWarehouse().getWarehouseCd());
		bodyFrom.setProductId(tStock.getMProduct().getProductId());
		bodyFrom.setProductCd(tStock.getMProduct().getProductCd());
		bodyFrom.setStockTypeId(tStock.getMStockType().getStockTypeId());
		bodyFrom.setStockTypeCd(tStock.getMStockType().getStockTypeCd());
		bodyFrom.setLocationId(tStock.getMLocation().getLocationId());
		bodyFrom.setLocationCd(tStock.getMLocation().getLocationCd());
		bodyFrom.setDepositId(tStock.getMCustomer().getCustomerId());
		bodyFrom.setDepositCd(tStock.getMCustomer().getCustomerCd());
		bodyFrom.setLotId(tStock.getTLot().getLotId());
		bodyFrom.setLot(tStock.getTLot().getLot());
		bodyFrom.setLimitDt(tStock.getTLot().getLimitDt());
		bodyFrom.setStoreNoId(tStock.getTStoreNo().getStoreNoId());
		bodyFrom.setStoreLabelNo(tStock.getTStoreNo().getStoreLabelNo());
		if (tStock.getTStoreNo().getMCustomer() != null) {
			bodyFrom.setSupplierId(tStock.getTStoreNo().getMCustomer().getCustomerId());
			bodyFrom.setSupplierCd(tStock.getTStoreNo().getMCustomer().getCustomerCd());
		}
		bodyFrom.setShapeId(tStock.getShapeId());
		bodyFrom.setShapeCd(tStock.getMShape().getShapeCd());
		bodyFrom.setUnitNum(tStock.getUnitNum());

		// ====== 在庫移動指示ボディ情報の設定（入庫） =======
		bodyTo.setMoveInstStatus_$00();
		bodyTo.setInoutType_$0();
		bodyTo.setWarehouseId(tStock.getMWarehouse().getWarehouseId());
		bodyTo.setWarehouseCd(tStock.getMWarehouse().getWarehouseCd());
		bodyTo.setProductId(tStock.getMProduct().getProductId());
		bodyTo.setProductCd(tStock.getMProduct().getProductCd());
		bodyTo.setStockTypeId(tStock.getMStockType().getStockTypeId());
		bodyTo.setStockTypeCd(tStock.getMStockType().getStockTypeCd());
		bodyTo.setDepositId(tStock.getMCustomer().getCustomerId());
		bodyTo.setDepositCd(tStock.getMCustomer().getCustomerCd());
		bodyTo.setLotId(tStock.getTLot().getLotId());
		bodyTo.setLot(tStock.getTLot().getLot());
		bodyTo.setLimitDt(tStock.getTLot().getLimitDt());
		// [ON推-品向-1012] 引当済在庫がある場合に入庫ラベルNo重複の致命的エラーのため(部分入庫になる)入庫ラベルの指定を削除 2015.11.12 kawana
		// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
		bodyTo.setStoreLabelNo(storeLabelNoNumberingLogic.numbering());
		// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End
		if (tStock.getTStoreNo().getMCustomer() != null) {
			bodyTo.setSupplierId(tStock.getTStoreNo().getMCustomer().getCustomerId());
			bodyTo.setSupplierCd(tStock.getTStoreNo().getMCustomer().getCustomerCd());
		}
		bodyTo.setShapeId(tStock.getShapeId());
		bodyTo.setShapeCd(tStock.getMShape().getShapeCd());
		bodyTo.setUnitNum(tStock.getUnitNum());
	}
}
