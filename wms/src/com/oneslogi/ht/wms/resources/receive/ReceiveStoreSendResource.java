package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSendSelectLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreUpdateLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreWkDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreWkInsertLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.StockMoveUpdateLogic;

/**
 * 入庫格納(格納確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreSend")
@HandyErrorReturnPath(returnURL = "ReceiveStoreSend/display")
public class ReceiveStoreSendResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ReceiveStoreWkInsertLogic insertLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ReceiveStoreSendSelectLogic receiveStoreSendSelectLogic;
	@Inject
	private ReceiveStoreUpdateLogic receiveStoreUpdateLogic;
	@Inject
	private StockMoveUpdateLogic stockMoveUpdateLogic;
	@Inject
	private ReceiveStoreWkDeleteLogic receivestoreLogic;
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private ReceiveStoreSelectLogic selectLogic;

	/**
	 * 入庫格納(格納確認)画面初期化を行います。
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
	 * 入庫格納(格納確認)画面表示を行います。
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
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD Start
		resource.initScreen("ReceiveStoreSendHT");
		//非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreSend/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreLoc/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreSend/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD END
		//格納確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreSend.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、終了確認画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogMergeEnd("ReceiveStoreHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//[新WMS-112-051]同一商品複数行の格納でエラーとなる対応 2015.11.27 Yokosuka [S]
		List<TStock> tStockList = receiveStoreSendSelectLogic.stockSelect(wHtReceiveStore);

		if (tStockList.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// === 在庫データ件数分繰返 ===
		BigDecimal instStoreNum = wHtReceiveStoreDto.getStoreNum();
		for (int i = 0; i < tStockList.size(); i++) {
			if(WCC.isZero(instStoreNum)){
				break;
			}
			if (WCC.isGreaterEqual(instStoreNum, tStockList.get(i).getChargeNum())) {
				instStoreNum = WCC.subtract(instStoreNum, tStockList.get(i).getChargeNum());
				ReceiveStoreData(tStockList.get(i), tStockList.get(i).getChargeNum());
				if (0 < getErrorManager().size()) {
					return;
				}

				List<TStockInout> tStockInoutList = receiveStoreSendSelectLogic.tStoreRecordBSelect(tStockList.get(i));
				for (int j = 0; j < tStockInoutList.size(); j++) {
					TStoreRecordB data = tStockInoutList.get(j).getTStoreRecordB();
					data.setStoreFlg_$1();
					receiveStoreUpdateLogic.update(data);
				}

			} else {
				ReceiveStoreData(tStockList.get(i), instStoreNum);
				if (0 < getErrorManager().size()) {
					return;
				}
				instStoreNum = WCC.ZERO;
				break;
			}
		}

		if (WCC.isPositive(instStoreNum)) {
			// 在庫移動数より在庫.引当可能数が少ない場合
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
			return;
		}
		//[新WMS-112-051]同一商品複数行の格納でエラーとなる対応 2015.11.27 Yokosuka [E]

		//入庫格納WORKの登録
		insertLogic.insertWHtReceiveStore(wHtReceiveStore);

		wHtReceiveStore.setLot(null);
		wHtReceiveStore.setLimitDt(null);
		wHtReceiveStore.setProductCd(null);
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
		wHtReceiveStore.setDepositId(null);
		wHtReceiveStore.setStockTypeId(null);
		wHtReceiveStore.setSupplierId(null);
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
		List<TStockInout> lastStockInout = receiveStoreSendSelectLogic.storeRecordBSelect(wHtReceiveStore);

		if (lastStockInout.size() == 0) {
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			// 総数量
			setWorkLogQty(CU.nullToZero(wHtReceiveStore.getStoreNum()));
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
			displayEndDialog();
		} else {
			/* 2015/06/11 INOUE ADD START 色・音の適用 */
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
			/* 2015/06/11 INOUE ADD END */
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			// 総数量
			setWorkLogQty(CU.nullToZero(wHtReceiveStore.getStoreNum()));
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

			/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
//			//JAN入力画面を表示
//			ReceiveStoreJanCdResource.load(this, util);
			MParam mParam = new MParam();
			mParam.setStoreNoFlg(dto.getStoreNoFlg());
			if (mParam.isStoreNoFlg$1()) {
				//入力したラベルNoで取得した入庫実績データから在庫データが存在するかチェックを行う
				List<TStockInout> tStockInoutList = selectLogic.checkExistStoreInoutSelect(wHtReceiveStore);
				if (tStockInoutList.size() == 0) {
					//該当のラベルNOに入荷した在庫データが存在しません。
					String valMsg = "";
					valMsg = "";
					valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_LABEL_STOCK_NOT_FOUND_ERROR);
					sendErrorScreen(valMsg, "", "ReceiveStoreLabelNo/display");
					return;
				}

				BigDecimal lChargeNum = WCC.ZERO;
				BigDecimal lStoreNum = WCC.ZERO;

				// [2.1.0-CT-054]同一商品複数明細で予定にロケーションCDが入っている場合に数量計算がおかしい問題を修正 2016.11.17 nayzaw Start
				Set<Long> addedChargeNumStockIdSet = new HashSet<Long>();
				for (int i = 0; i < tStockInoutList.size(); i++) {
					if (!addedChargeNumStockIdSet.contains(tStockInoutList.get(i).getStockId())) {
						lChargeNum = WCC.add(lChargeNum, tStockInoutList.get(i).getTStock().getChargeNum());
						addedChargeNumStockIdSet.add(tStockInoutList.get(i).getStockId());
					}
					lStoreNum = WCC.add(lStoreNum, tStockInoutList.get(i).getTStoreRecordB().getStoreNum());
				}
				// [2.1.0-CT-054]同一商品複数明細で予定にロケーションCDが入っている場合に数量計算がおかしい問題を修正 2016.11.17 nayzaw End

				//ラベルNoに入荷した在庫データの在庫数チェックを行う
				if (WCC.isZero(lChargeNum)) {
					//該当のラベルNOに入荷した在庫データの在庫数が0です。
					String valMsg = "";
					valMsg = "";
					valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_LABEL_STOCK_QTY_ZERO_ERROR);
					sendErrorScreen(valMsg, "", "ReceiveStoreLabelNo/display");
					return;
				}
				wHtReceiveStoreDto.setProductId(tStockInoutList.get(0).getTStock().getProductId());
				wHtReceiveStoreDto.setProductNm(tStockInoutList.get(0).getTStock().getMProduct().getProductNm());
				wHtReceiveStoreDto.setProductCd(tStockInoutList.get(0).getTStock().getMProduct().getProductCd());
				wHtReceiveStoreDto.setJanCd(tStockInoutList.get(0).getTStock().getMProduct().getJanCd());

				//格納済数
				wHtReceiveStoreDto.setNumOfStore(WCC.subtract(lStoreNum, lChargeNum));
				wHtReceiveStoreDto.setLimitDt(tStockInoutList.get(0).getTStoreRecordB().getLimitDt());
				wHtReceiveStoreDto.setLot(tStockInoutList.get(0).getTStoreRecordB().getLot());
				wHtReceiveStoreDto.setPlanNum(lStoreNum);
				wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStock().getStockTypeId());
				wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStock().getMStockType().chaseVDict().getDictNm());

				dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
				ses.setAttribute("ReceiveStoreDto", dto);
				//入庫格納(数量入力)画面表示
				ReceiveStoreQtyResource.load(this, util);
			}else{
				//JAN入力画面を表示
				ReceiveStoreJanCdResource.load(this, util);
			}
			/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
		}
	}

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		/* 2015/05/14 INOUE UPDATE START フッタ共通化対応 */
		/* 2015/06/11 INOUE UPDATE START 色・音の適用 */
		displayOperationEndDialog(
				"ReceiveStore",
				"ReceiveStoreSend/onEndDialogEnd",
				"ReceiveStoreSend/onEndDialogContinue"
			);
		/* 2015/06/11 INOUE UPDATE END */
		/* 2015/05/14 INOUE END */
	}

	/**
	 * 完了確認画面終了時にコールされるメソッドです。<br>
	 * 入力チェックを行い、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションを再構造
		ReceiveStoreResource.removeSession(this, util, receivestoreLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * 入力チェックを行い、仮ロケ或いはラベルNo入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
//		//伝票NO入力画面を表示
//		ReceiveStoreWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);
		//次画面を表示
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			ReceiveStoreLabelNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic,selectLogic);
		}else{
			//仮ロケ入力画面を表示
			ReceiveStoreKariLocResource.load(this, util, centerLogic, clientLogic, warehouseLogic,selectLogic);
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
	}

	/**
	 * <h2>移動指示データの作成</h2>
	 * <pre>
	 * 一件在庫データを移動する
	 * </pre>
	 * @param tStock       在庫データ
	 * @param instNum      出庫指示数
	 */
	private void ReceiveStoreData(TStock tStock, BigDecimal instNum) {

		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH header = new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		List<TMoveInstB> bodyList = new ArrayList<TMoveInstB>();
		TMoveInstB bodyFrom = new TMoveInstB();
		TMoveInstB bodyTo = new TMoveInstB();

		// ===== 移動指示データの作成 =====
		createReceiveStoreData(tStock, header, bodyFrom, bodyTo);

		bodyFrom.setInstNum(instNum);
		bodyTo.setInstNum(instNum);
		bodyList.add(bodyFrom);
		bodyList.add(bodyTo);

		stockMoveUpdateLogic.update(bodyList, header, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return;
		}

	}

	/**
	 * <h2>移動指示データの作成</h2>
	 * <pre>
	 * 在庫データの内容は移動指示データに設定する
	 * </pre>
	 * @param tStock       在庫データ
	 * @param header       在庫移動指示ヘッダ
	 * @param bodyFrom     在庫移動指示ボディ（出庫）
	 * @param bodyTo       在庫移動指示ボディ（入庫）
	 */
	private void createReceiveStoreData(TStock tStock, TMoveInstH header, TMoveInstB bodyFrom, TMoveInstB bodyTo) {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

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
		// [ON推-品向-1019] 2016/11/13 処理区分を入庫格納に変更 Yokosuka [S]
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$25.code());
		// [ON推-品向-1019] 2016/11/13 処理区分を入庫格納に変更 Yokosuka [E]
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
		bodyTo.setLocationId(wHtReceiveStore.getLocId());
		bodyTo.setLocationCd(wHtReceiveStore.getLocCd());
		bodyTo.setLotId(tStock.getTLot().getLotId());
		bodyTo.setLot(tStock.getTLot().getLot());
		bodyTo.setLimitDt(tStock.getTLot().getLimitDt());
		// // 入庫の入庫NoIDの設定を削除 2016.3.18 nayzaw
//		bodyTo.setStoreNoId(tStock.getTStoreNo().getStoreNoId());
		if (tStock.getTStoreNo().getMCustomer() != null) {
			bodyTo.setSupplierId(tStock.getTStoreNo().getMCustomer().getCustomerId());
			bodyTo.setSupplierCd(tStock.getTStoreNo().getMCustomer().getCustomerCd());
		}
		bodyTo.setShapeId(tStock.getShapeId());
		bodyTo.setShapeCd(tStock.getMShape().getShapeCd());
		bodyTo.setUnitNum(tStock.getUnitNum());
	}
	// [HT1.5-CT1-027] 2015/06/25 update sja [S]
	/**
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 */

	public void getPkStoreRecordHLock(TStoreRecordH entity) {
		if (entity.getStoreRecordHId() == null) {
			return;
		}

		TStoreRecordHCB cb = tStoreRecordHBhv.newMyConditionBean();
		cb.query().setStoreRecordHId_Equal(entity.getStoreRecordHId());
		cb.lockForUpdate();
		tStoreRecordHBhv.selectEntityWithDeletedCheck(cb);
		return;
	}
	// [HT1.5-CT1-027] 2015/06/25 update sja [E]
}
