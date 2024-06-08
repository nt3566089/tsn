package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreLimitDtDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;

/**
 * 入庫格納(期限日入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreLimitDt")
@HandyErrorReturnPath(returnURL = "ReceiveStoreLimitDt/display")
public class ReceiveStoreLimitDtResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveStoreCheckLogic receiveStoreCheckLogic;
	@Inject
	private ReceiveStoreSelectLogic receiveStoreSelectLogic;

	/**
	 * 入庫格納(期限日入力)画面初期化を行います。
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
		dto.setLimitDt("");
		wHtReceiveStoreDto.setLimitDt("");
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入庫格納(期限日入力)画面表示を行います。
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
		resource.initScreen("ReceiveStoreLimitDtHT");
		//非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreLimitDt/send").build());
		/* 2015/05/14 INOUE END */
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreJanCd/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreLimitDt/send").itemCd("send").build());

		//期限日入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreLimitDt.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、数量入力画面に遷移します。
	 * @param bean 期限日入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveStoreLimitDtDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setLimitDt(bean.getLimitDt());
		wHtReceiveStoreDto.setLot(null);

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
		wHtReceiveStoreDto.setStockTypeId(null);
		wHtReceiveStoreDto.setDepositId(null);
		wHtReceiveStoreDto.setSupplierId(null);;
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */

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


		//期限日チェック
		try {
			SimpleDateFormat dateValid = new SimpleDateFormat("yyyyMMdd");
			dateValid.setLenient(false);
			Date dt = dateValid.parse(bean.getLimitDt());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			dto.setLimitDt(dateFormat.format(dt));
		} catch (Exception ex) {
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATE_ERROR);
			return;
		}

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//入力した期限日が入庫実績データに存在するかチェックを行う
		List<TStoreRecordB> tStoreRecordBList = receiveStoreCheckLogic.checkExistStoreRecordBSelect(wHtReceiveStore);

		if (tStoreRecordBList.size() == 0) {
			//該当の期限日が入庫実績データに存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LIMIT_DT_NOT_FOUND_ERROR);
			return;
		}

		BigDecimal lSumStoreNum = WCC.ZERO;
		boolean blStoreFlg = false;
		for (int i = 0; i < tStoreRecordBList.size(); i++) {
			lSumStoreNum = WCC.add(lSumStoreNum, tStoreRecordBList.get(i).getStoreNum());
			if ("0".equals(tStoreRecordBList.get(i).getStoreFlg().toString())) {
				blStoreFlg = true;
			}
		}

		//入力した期限日の入庫数チェックを行う
		if (WCC.isZero(lSumStoreNum)) {
			//該当の期限日の入庫数が0です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LIMIT_DT_QTY_ZERO_ERROR);
			return;
		}

		//入力した期限日の入庫格納フラグが全て格納済かチェックを行う
		if (blStoreFlg == false) {
			//該当の期限日が全て格納済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LIMIT_DT_STORED_ERROR);
			return;
		}

		//入力した期限日で取得した入庫実績データから仮ロケに入荷した在庫データが存在するかチェックを行う
		List<TStockInout> tStockInoutList = receiveStoreSelectLogic.checkExistStoreInoutSelect(wHtReceiveStore);
		if (tStockInoutList.size() == 0) {
			//該当の期限日で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LIMIT_DT_STOCK_NOT_FOUND_ERROR);
			return;
		}

		BigDecimal lChargeNum = WCC.ZERO;
		BigDecimal lStoreNum = WCC.ZERO;
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [S]
		String strStoreLabelNo = "@";
		//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [E]
		for (int i = 0; i < tStockInoutList.size(); i++) {
			//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [S]
			if ( !strStoreLabelNo.equals(tStockInoutList.get(i).getTStock().getTStoreNo().getStoreLabelNo())) {
				lChargeNum = WCC.add(lChargeNum, tStockInoutList.get(i).getTStock().getChargeNum());
			}
			strStoreLabelNo = tStockInoutList.get(i).getTStock().getTStoreNo().getStoreLabelNo();
			//[新WMS-112-051]同じ商品が複数明細有る場合、数が多くなってしまう不具合修正 2015.11.27 Yokosuka [E]
			lStoreNum = WCC.add(lStoreNum, tStockInoutList.get(i).getTStoreRecordB().getStoreNum());
		}

		//仮ロケに入荷した在庫データの在庫数チェックを行う
		if (WCC.isZero(lChargeNum)) {
			//該当の期限日の仮ロケに入荷した在庫データの在庫数が0です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LIMIT_DT_STOCK_QTY_ZERO_ERROR);
			return;
		}

		//格納済数
		wHtReceiveStoreDto.setNumOfStore(WCC.subtract(lStoreNum, lChargeNum));
		wHtReceiveStoreDto.setPlanNum(lStoreNum);
		//wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStoreRecordB().getTReceivePlanB().getTReceivePlanH().getMProcessType().getMStockType().getStockTypeId());
		//wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStoreRecordB().getTReceivePlanB().getTReceivePlanH().getMProcessType().getMStockType().chaseVDict().getDictNm());
		wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStoreRecordB().getTStoreRecordH().getMProcessType().getMStockType().getStockTypeId());
		wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStoreRecordB().getTStoreRecordH().getMProcessType().getMStockType().chaseVDict().getDictNm());
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
//		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
//		ses.setAttribute("ReceiveStoreDto", dto);

//		//数量入力画面を表示
//		ReceiveStoreQtyResource.load(this, util);

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

		if (lstStockTypeId.size() == 0) {
			//該当の仮ロケに入荷した在庫データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR);
			return;
		}
		if (lstStockTypeId.size()<=1){
			//入庫格納（数量）画面を表示
			dto.setLotLimitDt("3");
			wHtReceiveStoreDto.setStockTypeId(dto.getLstStockTypeId().get(0));
			wHtReceiveStoreDto.setStkClsNm(dto.getLstStockTypeNm().get(0));
			wHtReceiveStoreDto.setDepositId(dto.getLstDepositId().get(0));
			wHtReceiveStoreDto.setDepositNm(dto.getLstDepositNm().get(0));
			wHtReceiveStoreDto.setSupplierId(dto.getLstSupplierId().get(0));
			wHtReceiveStoreDto.setSupplierNm(dto.getLstSupplierNm().get(0));
			dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
			ses.setAttribute("ReceiveStoreDto", dto);
			ReceiveStoreQtyResource.load(this, util);
		}else{
			//入庫格納（選択）画面を表示
			dto.setLotLimitDt("3");
			dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
			ses.setAttribute("ReceiveStoreDto", dto);
			ReceiveStoreSelectResource.load(this, util);
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */

	}

}
