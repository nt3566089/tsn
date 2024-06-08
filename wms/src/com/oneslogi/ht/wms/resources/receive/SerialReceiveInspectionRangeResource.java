package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionRangeDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionInsertLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.util.WmsSerialNoUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登入(範囲)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionRange")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionRange/display")
public class SerialReceiveInspectionRangeResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialReceiveInspectionCheckLogic checkLogic;
	@Inject
	private SerialReceiveInspectionInsertLogic insertLogic;

	/**
	 * シリアル登入(範囲)画面初期化を行います。
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
	 * シリアル登入(範囲)画面表示を行います。
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

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		ses.setAttribute("SerialReceiveInspectionDto", dto);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH Start
        //画面を設定
		resource.initScreen("SerialReceiveInspectionRangeHT");

		///戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionRange/back").itemCd("return").build());

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SerialReceiveInspectionRange/send").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionRange/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionRange.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * ラベル選択画面またはメニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SerialReceiveInspectionRangeDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setSerialNum(bean.serialNum);
		dto.setEndSerialNo(bean.endSerialNo);

		// ===== 入力チェック =====

		if (bean.isValidateErr()) {
			return;
		}

		String startSerialNo = dto.getStartSerialNo();
		String endSerialNo = bean.getEndSerialNo();
		String serialNumStr = bean.serialNum;

		if (CU.isNullOrEmpty(serialNumStr) && CU.isNullOrEmpty(endSerialNo)) {
			// どちらも未入力

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SERIAL_NO_RANGE_INPUT_ERROR);
			return;
		}

		if (!CU.isNullOrEmpty(serialNumStr) && !CU.isNullOrEmpty(endSerialNo)) {
			// どちらも入力

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SERIAL_NO_RANGE_INPUT_ERROR);
			return;
		}

		// ===== シリアルNo.リスト作成 =====

		WmsSerialNoUtil.CreateSerialNoListResult serialNoResult;
		if (CU.isNullOrEmpty(endSerialNo)) {
			serialNoResult = WmsSerialNoUtil.createSerialNoList(startSerialNo, Integer.valueOf(serialNumStr));
		} else {
			serialNoResult = WmsSerialNoUtil.createSerialNoList(startSerialNo, endSerialNo);
		}

		if (serialNoResult.isError()) {
			getErrorManager().add(new ErrorStatus(), serialNoResult.getErrorMessageCd());
			return;
		}

		// [#1977] シリアル登入(範囲)画面の「数量」項目又は「ｼﾘｱﾙ」項目に入力した値より登録数が設定マスタで設定した件数を超える場合エラーにする 2017.6.28 nayzaw Start
		int countAllowValue = getPropertyIntValue(WmsPropertyConst.ALLOW_INSERT_COUNT);
		if(serialNoResult.getSerialNoList().size() > getPropertyIntValue(WmsPropertyConst.ALLOW_INSERT_COUNT)){
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.OVER_SAFETY_SIZE_TO_H_T_ERROR,String.valueOf(countAllowValue));
			return;
		}
		// [#1977] シリアル登入(範囲)画面の「数量」項目又は「ｼﾘｱﾙ」項目に入力した値より登録数が設定マスタで設定した件数を超える場合エラーにする 2017.6.28 nayzaw end

		List<String> serialNoList = serialNoResult.getSerialNoList();

		// ===== 登録済チェック =====

		checkLogic.checkAlreadyRegistered(dto.getCenterId(), dto.getClientId(), dto.getReceiveSlipNo(), dto.getProductId(), serialNoList);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== シリアルNo.をワーク登録 =====

		int inspecCount = 0;
		for (String serialNo : serialNoList) {
			WHtSerialReceiveInsp wHtSerialReceiveInsp = new WHtSerialReceiveInsp();
			wHtSerialReceiveInsp.setSerialNo(serialNo);
			wHtSerialReceiveInsp.setMacAddress(dto.getMacAddress());
			wHtSerialReceiveInsp.setClientId(dto.getClientId());
			wHtSerialReceiveInsp.setCenterId(dto.getCenterId());
			wHtSerialReceiveInsp.setReceiveSlipNo(dto.getReceiveSlipNo());
			wHtSerialReceiveInsp.setJanCd(dto.getJanProdCd());
			wHtSerialReceiveInsp.setProductCd(dto.getProductCd());
			wHtSerialReceiveInsp.setProductNm(dto.getProductNm());
			int insertCount = insertLogic.insertWHtSerialReceiveInspec(wHtSerialReceiveInsp, dto.getSupplierCd());
			inspecCount = inspecCount + insertCount;
		}

		// ===== 入荷数超過チェック =====

		checkLogic.checkOrverQuantity(dto.getCenterId(), dto.getClientId(), dto.getReceiveSlipNo(), dto.getProductId(), dto.getProductCd(), dto.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 画面遷移 =====

		// 登録数を合計
		dto.setUnitNum(dto.getUnitNum() + inspecCount);
		// 入力値のクリア
		dto.setStartSerialNo("");
		dto.setSerialNo("");
		dto.setSerialNum("");
		dto.setEndSerialNo("");

		ses.setAttribute("SerialReceiveInspectionDto", dto);
		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionSerialNoResource.load(this, util);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setSerialNum("");
		dto.setEndSerialNo("");
		ses.setAttribute("SerialReceiveInspectionDto", dto);
		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionSerialNoResource.load(this, util);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End