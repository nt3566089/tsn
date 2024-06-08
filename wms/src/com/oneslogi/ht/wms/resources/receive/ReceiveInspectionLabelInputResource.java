package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionLabelInputDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 入荷検品(汎用)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionLabelInput")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionLabelInput/display")
public class ReceiveInspectionLabelInputResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspectionCheckLogic checkLogic;

	/**
	 * 入荷検品(汎用)画面初期化を行います。
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
	 * 入荷検品(汎用)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionLabelInputHT");

		// 非表示ボタン設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspectionLabelInput/send").build());

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionLabelInput/back").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspectionLabelInput/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionLabelInput.jsp", ses);
	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、検品確認画面に遷移します。
	 * @param bean 入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveInspectionLabelInputDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");
        dto.getTReceivePlanBDto().setPlanStoreLabelNo(bean.storeLabelNo);

        // [#575] ValidateチェックのHT国際化 2017.02.07 sja Start
        //入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.07 sja End

		ses.setAttribute("ReceiveInspectionDto", dto);

		// 入力した汎用ラベルNOが既に入庫NOテーブルに存在するかチェックを行う
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(bean.storeLabelNo);
		checkLogic.checkLabelInput(tStoreNo);

		if (getErrorManager().size() > 0) {
			return;
		}

		// 検品確認画面を表示
		ReceiveInspectionSendResource.load(this, util);
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

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());
		mProduct.setProductCd(tReceivePlanBDto.getMProduct().getProductCd());

		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
			// ロット・期限日入力画面を表示
			ReceiveInspectionLotLimitDtResource.display(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
			// ロット入力画面を表示
			ReceiveInspectionLotResource.display(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
			// 期限日入力画面を表示
			ReceiveInspectionLimitDtResource.display(this, util);
			return;
		}

		// 数量入力画面を表示
		ReceiveInspectionQtyResource.display(this, util);
	}
}
