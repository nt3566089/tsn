package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.WHtSerialShippingInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionRangeDto;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionInsertLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.util.WmsSerialNoUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(範囲)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionRange")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionRange/display")
public class SerialShippingInspectionRangeResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialShippingInspectionInsertLogic insetLogic;
	@Inject
	private SerialShippingInspectionCheckLogic checkLogic;
	/**
	 * シリアル登出(範囲)画面初期化を行います。
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

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		dto.setSerialNum("");
		dto.setEndSerialNo("");

		dto.setwHtSerialShippingInspDto(wHtSerialShippingInspDtoMapper.mappingToDto(wHtSerialShippingInsp));
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * シリアル登出(範囲)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng Start

		//画面ヘッダ設定
		resource.initScreen("SerialShippingInspectionRangeHT");

		// 非表示ボタンを設定
		resource.setHideButton(ButtonInfo.builder().url("SerialShippingInspectionRange/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("SerialShippingInspectionRange/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//シリアル入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionRange.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(数量入力)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SerialShippingInspectionRangeDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtInspDto = dto.getwHtSerialShippingInspDto();

		dto.setSerialNum(bean.getSerialNum());
		dto.setEndSerialNo(bean.getSerialNo());

		// ===== 入力チェック =====

		if (bean.isValidateErr()) {
			return;
		}

		final String startSerialNo = dto.getStartSerialNo();
		final String endSerialNo = dto.getEndSerialNo();
		final String serialNumStr = dto.getSerialNum();

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
			// 範囲エラー
			getErrorManager().add(new ErrorStatus(), serialNoResult.getErrorMessageCd());
			return;
		}

		// [#1977] シリアル登入(範囲)画面の「数量」項目又は「ｼﾘｱﾙ」項目に入力した値より検品数が設定マスタで設定した件数を超える場合エラーにする 2017.6.28 nayzaw Start
		int countAllowValue = getPropertyIntValue(WmsPropertyConst.ALLOW_INSERT_COUNT);
		if(serialNoResult.getSerialNoList().size() > getPropertyIntValue(WmsPropertyConst.ALLOW_INSERT_COUNT)){
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.OVER_SAFETY_SIZE_TO_H_T_ERROR,String.valueOf(countAllowValue));
			return;
		}
		// [#1977] シリアル登入(範囲)画面の「数量」項目又は「ｼﾘｱﾙ」項目に入力した値より検品数が設定マスタで設定した件数を超える場合エラーにする 2017.6.28 nayzaw end

		List<String> serialNoList = serialNoResult.getSerialNoList();

		// ===== 登録済チェック =====

		checkLogic.checkAlreadyRegistered(wHtInspDto.getCenterId(), wHtInspDto.getClientId(), wHtInspDto.getPickingWorkNo(), wHtInspDto.getProductId(), serialNoList);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== シリアルNo.をワーク登録 =====

		int insertCount = 0;
		for (String serialNo : serialNoList) {
			WHtSerialShippingInsp entity = new WHtSerialShippingInsp();
			entity.setSerialNo(serialNo);
			entity.setMacAddress(wHtInspDto.getMacAddress());
			entity.setClientId(wHtInspDto.getClientId());
			entity.setCenterId(wHtInspDto.getCenterId());
			entity.setPickingWorkNo(wHtInspDto.getPickingWorkNo());
			entity.setCustomerId(wHtInspDto.getCustomerId());
			entity.setJanCd(dto.getmProduct().getJanCd());
			entity.setProductCd(dto.getmProduct().getProductCd());
			entity.setProductNm(dto.getmProduct().getProductNm());

			int count = insetLogic.insertWHtSerialShippingInspec(entity);
			insertCount = insertCount + count;
		}

		// ===== 出庫数超過チェック =====

		checkLogic.checkOrverQuantity(wHtInspDto.getCenterId(), wHtInspDto.getClientId(), wHtInspDto.getPickingWorkNo(), wHtInspDto.getProductId(), wHtInspDto.getProductCd(),
				wHtInspDto.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 画面遷移 =====

		dto.setInspQty(dto.getInspQty() + insertCount);
		dto.setStartSerialNo("");
		dto.setSerialNum("");
		dto.setEndSerialNo("");

		// [#1839] シリアル登入(範囲)画面からシリアル登入(ｼﾘｱﾙ)画面へ戻る時ｼﾘｱﾙをクリアする様に修正 2017.6.5 nayzaw Start
		dto.getwHtSerialShippingInspDto().setSerialNo("");
		// [#1839] シリアル登入(範囲)画面からシリアル登入(ｼﾘｱﾙ)画面へ戻る時ｼﾘｱﾙをクリアする様に修正 2017.6.5 nayzaw End
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//シリアル登出(ｼﾘｱﾙ)入力画面を表示
		SerialShippingInspectionSerialNoResource.display(this, util);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
