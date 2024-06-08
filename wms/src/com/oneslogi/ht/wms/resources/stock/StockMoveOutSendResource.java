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
import com.oneslogi.base.dbflute.dtomapper.TLotDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreNoDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutSelectLogic;
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
 * 在庫移動出庫(送信確認)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOutSend")
@HandyErrorReturnPath(returnURL = "StockMoveOutSend/display")
public class StockMoveOutSendResource extends HandyResourceBase {

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
	private StockMoveOutSelectLogic selectLogic;
	// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;
	// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End

	/**
	 * 在庫移動出庫(送信確認)画面初期化を行います。
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
	 * 在庫移動出庫(送信確認)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW Start
		resource.initScreen("StockMoveOutSendHT");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder()
				.url("StockMoveOutQty/display")
				.itemCd("no")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_RETURN)
				.build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder()
				.url("StockMoveOutSend/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_SEND)
				.build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		//送信確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveOutSend.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動出庫(完了確認)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("StockMoveOutHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		// ===== 在庫データの取得 =====
		TStockDtoMapper tStockDtoMapper = new TStockDtoMapper();
		TStock tStock = tStockDtoMapper.mappingToEntity(dto.getTStockDto());

		TLotDtoMapper tLotDtoMapper = new TLotDtoMapper();
		TLot tLot = tLotDtoMapper.mappingToEntity(dto.getTStockDto().getTLot());

		TStoreNoDtoMapper tStoreNoDtoMapper = new TStoreNoDtoMapper();
		TStoreNo tStoreNo = tStoreNoDtoMapper.mappingToEntity(dto.getTStockDto().getTStoreNo());
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		tStoreNo.setStoreLabelNo(dto.getStoreLabelNo());
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		List<TStock> lstTStock = selectLogic.SelectStockData(tStock, tLot, tStoreNo);
		if (0 < getErrorManager().size()) {
			return;
		}

		// === 在庫データ件数分繰返 ===
		BigDecimal instNum = WCC.toBigDecimal(dto.getQty());
		/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
		List<TMoveInstB> lstTMoveInstB = new ArrayList<TMoveInstB>();
		/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */
		for (TStock stock: lstTStock) {
			if (WCC.isGreaterThan(instNum, stock.getChargeNum())) {
				instNum = WCC.subtract(instNum, stock.getChargeNum());
				/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
				//MoveOneData(stock, stock.getChargeNum());
				MoveOneData(stock, stock.getChargeNum(), lstTMoveInstB);
				/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */
				if (0 < getErrorManager().size()) {
					return;
				}
			} else {
				/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
				//MoveOneData(stock, instNum);
				MoveOneData(stock, instNum, lstTMoveInstB);
				/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */
				if (0 < getErrorManager().size()) {
					return;
				}
				instNum = WCC.ZERO;
				break;
			}
		}
		if (WCC.isPositive(instNum)) {
			// 在庫移動数より在庫.引当可能数が少ない場合
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		//数量
		setWorkLogQty(dto.getQty());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
		TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
		dto.setLstTMoveInstBDto(tMoveInstBDtoMapper.mappingToDtoList(lstTMoveInstB));
		ses.setAttribute("StockMoveOutDto", dto);
		/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */

		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
//		//通信制御データをクリア
//		util.clearHtComCtl(ses);
//
//		/* 2015/06/11 INOUE ADD START 色・音の適用 */
//		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
//		/* 2015/06/11 INOUE ADD END */
    	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */

		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//ロケ入力画面を遷移する
        //StockMoveOutLocResource.load(this, util, centerLogic, clientLogic, warehouseLogic);
		displayDialog();
    	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
	}

	/**
	 * <h2>移動指示データの作成</h2>
	 * <pre>
	 * 一件在庫データを移動する
	 * </pre>
	 * @param tStock          在庫データ
	 * @param instNum         出庫指示数
	 * @param lstTMoveInstB   在庫移動指示ボディ
	 */
	/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
//	private void MoveOneData(TStock tStock, long instNum) {
	private void MoveOneData(TStock tStock, BigDecimal instNum, List<TMoveInstB> lstTMoveInstB) {
	/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */

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
		bodyList.add(bodyFrom);
		bodyList.add(bodyTo);

		// ===== 在庫移動指示.在庫移動クラスを呼出し =====
		stocktransferInstruction.stockMove(header, bodyList, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return;
		}

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
			/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA Start */
			// ===== tMoveInstBList．入出庫区分が0：入庫の場合 =====
			if (body.isInoutType$0()) {
				body.setTMoveInstH(header);
		        lstTMoveInstB.add(body);
			}
			/* [次期エンハンス] 移動入庫を追加 2015.09.17 By SJA End */
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
		//2015/04/28 KAI UPDATE START 設定方法変更
		//mProcessType.setProcessTypeCd_$21();
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$21.code());
		//2015/04/28 KAI UPDATE END
		mProcessType = processTypeLogic.getUkEntity(mProcessType);
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		header.setMoveInstStatus_$00();
		header.setInputType_$30();

		// ====== 在庫移動指示ボディ情報の設定（出庫） =======
		bodyFrom.setMoveInstStatus_$00();
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
		// [#187][2.1.0-CT-028] HT在庫移動入庫で致命的エラー発生 2016.11.07 kawana Start
		bodyFrom.setStoreDt(tStock.getTStoreNo().getStoreDt());
		// [#187][2.1.0-CT-028] HT在庫移動入庫で致命的エラー発生 2016.11.07 kawana End
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
		// [#187][2.1.0-CT-028] HT在庫移動入庫で致命的エラー発生 2016.11.07 kawana Start
		bodyTo.setStoreDt(tStock.getTStoreNo().getStoreDt());
		// [#187][2.1.0-CT-028] HT在庫移動入庫で致命的エラー発生 2016.11.07 kawana End
		// 入庫の入庫NoIDの設定を削除 2016.3.11 nayzaw
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

	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
	/**
	 * <h2>在庫移動出庫（続け）画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayDialog() throws Exception {

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// ===== 在庫移動出庫(確認)を表示 =====

		String dialogScreenCd = "StockMoveOutCancelOrSendHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_CANCEL);

		// いいえボタン設定
		setReturnButton(ButtonInfo.builder().url("StockMoveOutSend/onCancelDialogNo").itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).build());
		// はいボタン設定
		setSendButton(ButtonInfo.builder().url("StockMoveOutSend/onCancelDialogYes").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * 在庫移動出庫（続け）画面終了時にコールされるメソッドです。<br>
	 * セッションをクリア、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogYes")
	public void onCancelDialogYes() throws Exception {

		//在庫移動入庫ロケ入力画面を表示
		StockMoveOutInLocResource.display(this, util);
	}

	/**
	 * 在庫移動出庫（続け）画面継続時にコールされるメソッドです。<br>
	 * 在庫移動出庫ロケ入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogNo")
	public void onCancelDialogNo() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

		//ロケ入力画面を遷移する
        StockMoveOutLocResource.load(this, util, centerLogic, clientLogic, warehouseLogic,selectLogic);

	}
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
}
