package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionLabelInputDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionCheckLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 予定無し入荷(汎用)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionLabelInput")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionLabelInput/display")
public class ReceiveNoPlanInspectionLabelInputResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionCheckLogic checkLogic;

	/**
	 * 予定無し入荷(汎用)画面初期化を行います。
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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		dto.setStoreLabelNo("");
		dto.getwHtReceiveNoPlanInspDto().setStoreNo("");
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 予定無し入荷(汎用)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionLabelInputHT");

		//フッタボタン（左上）設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLabelInput/send").build());

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLabelInput/back").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLabelInput/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionLabelInput.jsp", ses);
	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、検品確認画面に遷移します。
	 * @param bean 入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionLabelInputDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
        dto.setStoreLabelNo(bean.storeLabelNo);

		// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start
        //入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.09 sja End
		dto.getwHtReceiveNoPlanInspDto().setStoreNo(dto.getStoreLabelNo());
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		// 入力した汎用ラベルNOが既に入庫NOテーブルに存在するかチェックを行う
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(bean.storeLabelNo);
		checkLogic.checkLabelInput(tStoreNo);

		if (getErrorManager().size() > 0) {
			return;
		}

		// ロケ入力画面へ遷移する
		ReceiveNoPlanInspectionLocResource.load(this, util);
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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto.getMProduct());
		mProduct.setProductCd(wHtReceiveNoPlanInspecDto.getProductCd());

		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
			// ロット・期限日入力画面を表示
			ReceiveNoPlanInspectionLotLimitDtResource.display(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
			// ロット入力画面を表示
			ReceiveNoPlanInspectionLotResource.display(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
			// 期限日入力画面を表示
			ReceiveNoPlanInspectionLimitDtResource.display(this, util);
			return;
		}

		// 数量入力画面を表示
		ReceiveNoPlanInspectionQtyResource.display(this, util);
	}
}
