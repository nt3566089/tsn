package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreJanCdDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductJanCdChkLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;

/**
 * 入庫格納(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreJanCd")
@HandyErrorReturnPath(returnURL = "ReceiveStoreJanCd/display")
public class ReceiveStoreJanCdResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private InventoryInputProductJanCdChkLogic janCdChkLogic;
	@Inject
	private ReceiveStoreSelectLogic receiveStoreSelectLogic;

	/**
	 * 入庫格納(JAN入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		dto.setJanProdCd("");
		wHtReceiveStoreDto.setJanCd("");
		wHtReceiveStoreDto.setProductId(null);
		wHtReceiveStoreDto.setProductCd("");
		wHtReceiveStoreDto.setProductNm("");
		// [Ver3.0] unit of measure対応 2017.11.23 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2017.11.23 王 End
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入庫格納(JAN入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD Start
		resource.initScreen("ReceiveStoreJanCdHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreJanCd/send").build());
		// オプション１ボタンの設定
		resource.setOptionButton1(ButtonInfo.builder().url("ReceiveStoreList/load?backUrl=ReceiveStoreJanCd/display").itemCd("option1").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreKariLoc/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreJanCd/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD END
		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreJanCd.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ロット、期限日、数量入力画面画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveStoreJanCdDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setJanCd(bean.getJanProdCd());
		wHtReceiveStoreDto.setLimitDt(null);
		wHtReceiveStoreDto.setLot(null);

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
		wHtReceiveStoreDto.setStockTypeId(null);
		wHtReceiveStoreDto.setDepositId(null);
		wHtReceiveStoreDto.setSupplierId(null);;
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
		dto.setJanProdCd(bean.getJanProdCd());
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End


		//商品存在チェック
		MProduct mProduct = new MProduct();
		mProduct.setClientId(wHtReceiveStoreDto.getClientId());
		mProduct.setJanCd(bean.getJanProdCd());
		List<MProduct> lstMProduct = janCdChkLogic.checkJanProdCd(mProduct);
		if (0 < getErrorManager().size()) {
			return;
		}

		wHtReceiveStoreDto.setProductCd(lstMProduct.get(0).getProductCd());

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
//		// [HT1.5-CT1-025]商品の伝票No内存在チェックは別に行う 2016/06/26 KAI ADD START
//		if (!receiveStoreCheckLogic.checkExistReceivePlan(wHtReceiveStore)) {
//			return;
//		}
//		// [HT1.5-CT1-025]商品の伝票No内存在チェックは別に行う 2016/06/26 KAI ADD END
//
//		//入力したJAN/商品コードが入庫実績データに存在するかチェックを行う
//		List<TStoreRecordB> tStoreRecordBList = receiveStoreCheckLogic.checkExistStoreRecordBSelect(wHtReceiveStore);
//
//		if (tStoreRecordBList.size() == 0) {
//			//該当のJAN/商品コードが入庫実績データに存在しません。
//			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_NOT_FOUND_ERROR);
//			return;
//		}
//
//		Long lSumStoreNum = 0l;
//		boolean blStoreFlg = false;
//		for (int i = 0; i < tStoreRecordBList.size(); i++) {
//			lSumStoreNum = lSumStoreNum + tStoreRecordBList.get(i).getStoreNum();
//			if ("0".equals(tStoreRecordBList.get(i).getStoreFlg().toString())) {
//				blStoreFlg = true;
//			}
//		}
//
//		//入力したJAN/商品の入庫数チェックを行う
//		if (lSumStoreNum == 0) {
//			//該当のJAN/商品コードの入庫数が0です。
//			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_QTY_ZERO_ERROR);
//			return;
//		}
//
//		//入力したJAN/商品の入庫格納フラグが全て格納済かチェックを行う
//		if (blStoreFlg == false) {
//			//該当のJAN/商品コードが全て格納済です。
//			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_STORED_ERROR);
//			return;
//		}
//
//		//入力したJAN/商品コードで取得した入庫実績データから仮ロケに入荷した在庫データが存在するかチェックを行う
//		List<TStockInout> tStockInoutList = receiveStoreSelectLogic.checkExistStoreInoutSelect(wHtReceiveStore);
//
//		if (tStockInoutList.size() == 0) {
//			//該当のJAN/商品コードで取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。
//			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_STOCK_NOT_FOUND_ERROR);
//			return;
//		}
//
//		Long lChargeNum = 0l;
//		Long lStoreNum = 0l;
//		// [HT1.5-CT1-033] 2015/06/25 update sja [S]
//		boolean blnSame = true;
//		// [HT1.5-CT1-033] 2015/06/25 update sja [E]
//		for (int i = 0; i < tStockInoutList.size(); i++) {
//			lChargeNum = lChargeNum + tStockInoutList.get(i).getTStock().getChargeNum();
//			lStoreNum = lStoreNum + tStockInoutList.get(i).getTStoreRecordB().getStoreNum();
//
//			// [HT1.5-CT1-033] 2015/06/25 update sja [S]
//			if (tStockInoutList.get(0).getTStock().getLotId() != tStockInoutList.get(i).getTStock().getLotId() && blnSame) {
//				blnSame = false;
//			}
//			// [HT1.5-CT1-033] 2015/06/25 update sja [E]
//
//		}
//
//		//仮ロケに入荷した在庫データの在庫数チェックを行う
//		if (lChargeNum == 0) {
//			//該当のJAN/商品コードの仮ロケに入荷した在庫データの在庫数が0です。
//			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_STOCK_QTY_ZERO_ERROR);
//			return;
//		}
//
//		wHtReceiveStoreDto.setProductId(lstMProduct.get(0).getProductId());
//		wHtReceiveStoreDto.setProductNm(lstMProduct.get(0).getProductNm());
//		wHtReceiveStoreDto.setProductCd(lstMProduct.get(0).getProductCd());
//		wHtReceiveStoreDto.setJanCd(lstMProduct.get(0).getJanCd());
//
//		// [HT1.5-CT1-033] 2015/06/25 update sja [S]
//		//if (tStockInoutList.size() == 1){
//		if (blnSame){
//			// [HT1.5-CT1-033] 2015/06/25 update sja [E]
//			//格納済数
//			wHtReceiveStoreDto.setNumOfStore(lStoreNum - lChargeNum);
//			wHtReceiveStoreDto.setLimitDt(tStockInoutList.get(0).getTStoreRecordB().getLimitDt());
//			wHtReceiveStoreDto.setLot(tStockInoutList.get(0).getTStoreRecordB().getLot());
//			wHtReceiveStoreDto.setPlanNum(lStoreNum);
//			//wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStoreRecordB().getTReceivePlanB().getTReceivePlanH().getMProcessType().getMStockType().getStockTypeId());
//			wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStoreRecordB().getTStoreRecordH().getMProcessType().getMStockType().getStockTypeId());
//			//wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStoreRecordB().getTReceivePlanB().getTReceivePlanH().getMProcessType().getMStockType().chaseVDict().getDictNm());
//			wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStoreRecordB().getTStoreRecordH().getMProcessType().getMStockType().chaseVDict().getDictNm());
//
//			//数量入力画面を表示
//			dto.setLotLimitDt("0");
//			ses.setAttribute("ReceiveStoreDto", dto);
//			ReceiveStoreQtyResource.load(this, util);
//			return;
//		}

//		if (lstMProduct.get(0).isLotManagFlg$1() && lstMProduct.get(0).isLimitDtManagFlg$1()) {
//			//ロット・期限日入力画面を表示
//			dto.setLotLimitDt("1");
//			ses.setAttribute("ReceiveStoreDto", dto);
//			ReceiveStoreLotLimitDtResource.load(this, util);
//			return;
//		}
//
//		if (lstMProduct.get(0).isLotManagFlg$1()) {
//			//ロット入力画面を表示
//			dto.setLotLimitDt("2");
//			ses.setAttribute("ReceiveStoreDto", dto);
//			ReceiveStoreLotResource.load(this, util);
//			return;
//		}
//
//		if (lstMProduct.get(0).isLimitDtManagFlg$1()) {
//			//期限日入力画面を表示
//			dto.setLotLimitDt("3");
//			ses.setAttribute("ReceiveStoreDto", dto);
//			ReceiveStoreLimitDtResource.load(this, util);
//			return;
//		}
//
//		//格納済数
//		wHtReceiveStoreDto.setNumOfStore(lStoreNum - lChargeNum);
//		wHtReceiveStoreDto.setPlanNum(lStoreNum);
//		wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStoreRecordB().getTStoreRecordH().getMProcessType().getMStockType().getStockTypeId());
//		wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStoreRecordB().getTStoreRecordH().getMProcessType().getMStockType().chaseVDict().getDictNm());
//
//		//数量入力画面を表示
//		dto.setLotLimitDt("0");
//		ses.setAttribute("ReceiveStoreDto", dto);
//		ReceiveStoreQtyResource.load(this, util);

		//在庫データに入力したの仮ロケが存在するかチェックを行う
		List<TStockInout> tStockInoutListByKariLoc = receiveStoreSelectLogic.checkExistStoreInoutSelectByKariLoc(wHtReceiveStore);
		if (tStockInoutListByKariLoc.size() == 0) {
			//該当の仮ロケに入荷した在庫データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR);
			return;
		}
		BigDecimal lChargeNum = WCC.ZERO;
		BigDecimal lStoreNum = WCC.ZERO;
		boolean blnSame = true;
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [S]
		String strStoreLabelNo = "@";
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [E]

		for (int i = 0; i < tStockInoutListByKariLoc.size(); i++) {
			//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [S]
			if ( !strStoreLabelNo.equals(tStockInoutListByKariLoc.get(i).getTStock().getTStoreNo().getStoreLabelNo())) {
				lChargeNum = WCC.add(lChargeNum, tStockInoutListByKariLoc.get(i).getTStock().getChargeNum());
			}
			strStoreLabelNo = tStockInoutListByKariLoc.get(i).getTStock().getTStoreNo().getStoreLabelNo();
			//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [E]
			lStoreNum = WCC.add(lStoreNum, tStockInoutListByKariLoc.get(i).getTStoreRecordB().getStoreNum());
			if ((!CU.nullToStr(tStockInoutListByKariLoc.get(0).getTStoreRecordB().getLot()).equals(CU.nullToStr(tStockInoutListByKariLoc.get(i).getTStoreRecordB().getLot())) ||
				!CU.nullToStr(tStockInoutListByKariLoc.get(0).getTStoreRecordB().getLimitDt()).equals(CU.nullToStr(tStockInoutListByKariLoc.get(i).getTStoreRecordB().getLimitDt())))
				&& blnSame) {

				blnSame = false;
			}
		}

		//仮ロケに入荷した在庫データの在庫数チェックを行う
		if (WCC.isZero(lChargeNum)) {
			//該当のJAN/商品コードの仮ロケに入荷した在庫データの在庫数が0です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_STOCK_QTY_ZERO_ERROR);
			return;
		}

		wHtReceiveStoreDto.setProductId(lstMProduct.get(0).getProductId());
		wHtReceiveStoreDto.setProductNm(lstMProduct.get(0).getProductNm());
		wHtReceiveStoreDto.setProductCd(lstMProduct.get(0).getProductCd());
		wHtReceiveStoreDto.setJanCd(lstMProduct.get(0).getJanCd());

		if (! blnSame){
			if (lstMProduct.get(0).isLotManagFlg$1() && lstMProduct.get(0).isLimitDtManagFlg$1()) {
				//ロット・期限日入力画面を表示
				dto.setLotLimitDt("1");
				ses.setAttribute("ReceiveStoreDto", dto);
				ReceiveStoreLotLimitDtResource.load(this, util);
				return;
			}

			if (lstMProduct.get(0).isLotManagFlg$1()) {
				//ロット入力画面を表示
				dto.setLotLimitDt("2");
				ses.setAttribute("ReceiveStoreDto", dto);
				ReceiveStoreLotResource.load(this, util);
				return;
			}

			if (lstMProduct.get(0).isLimitDtManagFlg$1()) {
				//期限日入力画面を表示
				dto.setLotLimitDt("3");
				ses.setAttribute("ReceiveStoreDto", dto);
				ReceiveStoreLimitDtResource.load(this, util);
				return;
			}
		}

		List<TStockInout> tStockInoutSelect = receiveStoreSelectLogic.tStockInoutSelect(wHtReceiveStore);

		String strTemp = "";
		/** 在庫区分ID */
		List<Long> lstStockTypeId = new ArrayList<Long>();
		/** 在庫区分NM */
		List<String> lstStockTypeNm = new ArrayList<String>();
		/** 預託ID */
		List<Long> lstDepositId = new ArrayList<Long>();
		/** 預託NM */
		List<String> lstDepositNm = new ArrayList<String>();
		/** 仕入先ID */
		List<Long> lstSupplierId = new ArrayList<Long>();
		/** 仕入先NM */
		List<String> lstSupplierNm = new ArrayList<String>();
		for (int j = 0; j < tStockInoutSelect.size(); j++) {
			if (! strTemp.equals(tStockInoutSelect.get(j).getTStock().getStockTypeId().toString() +
							tStockInoutSelect.get(j).getTStock().getDepositId().toString() +
							tStockInoutSelect.get(j).getTStoreRecordB().getTStoreRecordH().getSupplierId().toString())){
				lstStockTypeId.add(tStockInoutSelect.get(j).getTStock().getStockTypeId());
				lstStockTypeNm.add(tStockInoutSelect.get(j).getTStock().getMStockType().chaseVDict().getDictNm());
				lstDepositId.add(tStockInoutSelect.get(j).getTStock().getDepositId());
				lstDepositNm.add(tStockInoutSelect.get(j).getTStock().getMCustomer().getCustomerNm());
				lstSupplierId.add(tStockInoutSelect.get(j).getTStoreRecordB().getTStoreRecordH().getSupplierId());
				lstSupplierNm.add(tStockInoutSelect.get(j).getTStoreRecordB().getTStoreRecordH().getMCustomerBySupplierId().getCustomerNm());
				strTemp = tStockInoutSelect.get(j).getTStock().getStockTypeId().toString() +
						tStockInoutSelect.get(j).getTStoreRecordB().getTStoreRecordH().getDepositId().toString() +
						tStockInoutSelect.get(j).getTStoreRecordB().getTStoreRecordH().getSupplierId().toString();
			}
		}
		dto.setLstStockTypeId(lstStockTypeId);
		dto.setLstStockTypeNm(lstStockTypeNm);
		dto.setLstDepositId(lstDepositId);
		dto.setLstDepositNm(lstDepositNm);
		dto.setLstSupplierId(lstSupplierId);
		dto.setLstSupplierNm(lstSupplierNm);
		//格納済数
		wHtReceiveStoreDto.setNumOfStore(WCC.subtract(lStoreNum, lChargeNum));
		wHtReceiveStoreDto.setLimitDt(tStockInoutListByKariLoc.get(0).getTStoreRecordB().getLimitDt());
		wHtReceiveStoreDto.setLot(tStockInoutListByKariLoc.get(0).getTStoreRecordB().getLot());
		wHtReceiveStoreDto.setPlanNum(lStoreNum);
		wHtReceiveStoreDto.setStockTypeId(tStockInoutListByKariLoc.get(0).getTStock().getStockTypeId());
		wHtReceiveStoreDto.setStkClsNm(tStockInoutListByKariLoc.get(0).getTStock().getMStockType().chaseVDict().getDictNm());
		dto.setJanProdCd(bean.getJanProdCd());

		if (lstStockTypeId.size() == 0) {
			//該当の仮ロケに入荷した在庫データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR);
			return;
		}

		if (lstStockTypeId.size()<=1){
			//入庫格納（数量）画面を表示
			dto.setLotLimitDt("0");
			wHtReceiveStoreDto.setStockTypeId(dto.getLstStockTypeId().get(0));
			wHtReceiveStoreDto.setStkClsNm(dto.getLstStockTypeNm().get(0));
			wHtReceiveStoreDto.setDepositId(dto.getLstDepositId().get(0));
			wHtReceiveStoreDto.setDepositNm(dto.getLstDepositNm().get(0));
			wHtReceiveStoreDto.setSupplierId(dto.getLstSupplierId().get(0));
			wHtReceiveStoreDto.setSupplierNm(dto.getLstSupplierNm().get(0));
			dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
			ses.setAttribute("ReceiveStoreDto", dto);
			ReceiveStoreQtyResource.load(this, util);
			return;
		}else{
			//入庫格納（選択）画面を表示
			dto.setLotLimitDt("0");
			dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
			ses.setAttribute("ReceiveStoreDto", dto);
			ReceiveStoreSelectResource.load(this, util);
			return;
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
	}
}
