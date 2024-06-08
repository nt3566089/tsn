package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreJanDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 検品格納(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreJan")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreJan/display")
public class ReceiveInspecStoreJanResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspecStoreCheckLogic checkLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;

	/**
	 * 検品格納(JAN入力)画面初期化を行います。
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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		dto.setJanProdCd("");
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 検品格納(JAN入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreJanHT");
		// オプションボタン１設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("ReceiveInspecStoreList/load?backUrl=ReceiveInspecStoreJan/display").itemCd("option1").build()
				);
		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder().url("ReceiveInspecStoreJan/complete").itemCd("option2").build());
		// 非表示ボタン設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspecStoreJan/send").build());
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreCancel/load").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreJan/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreJan.jsp", ses);
	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、数量入力画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveInspecStoreJanDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		dto.setJanProdCd(bean.productCd);

		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End

		// ==== 入力したJAN/商品コードが入荷予定データに存在するかチェックを行う ====
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(dto.getJanProdCd());

		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// J/商存在チェック
		TReceivePlanB tReceivePlanB = checkLogic.checkJanProduct(tReceivePlanH, mProduct, bUser);
		if (tReceivePlanB == null) {
			return;
		}

		TReceivePlanBDtoMapper tReceivePlanBDtoMapper = new TReceivePlanBDtoMapper();
		TReceivePlanBDto tReceivePlanBDto = tReceivePlanBDtoMapper.mappingToDto(tReceivePlanB);
		tReceivePlanBDto.setPlanLocationCd("");
		tReceivePlanBDto.setPlanLocationId(null);
		tReceivePlanBDto.setPlanLot("");
		tReceivePlanBDto.setPlanLimitDt("");
		tReceivePlanBDto.setPlanStoreLabelNo("");

		dto.setTReceivePlanBDto(tReceivePlanBDto);
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//検品格納(数量)画面を表示
		ReceiveInspecStoreQtyResource.load(this, util);
	}

	/**
	 * 完了時にコールされるメソッドです。<br>
	 * 伝票No単位の完了確認画面に遷移します。
	 * @param bean JAN入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete(@BeanParam ReceiveInspecStoreJanDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();
		dto.setJanProdCd(bean.getProductCd());

		// JAN/商品の入力チェックを行う
		if (!CU.isNullOrEmpty(bean.getProductCd())) {
			// JAN/商品は空白以外場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_COMPLETE_NO_INPUT);
			return;
		}

		TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = mapper.mappingToEntity(tReceivePlanBDto.getTReceivePlanH());

		// 伝票No単位の総入荷予定数の取得
		BigDecimal lngPlanNumSum = selectLogic.getReceivePlanNum(tReceivePlanH);

		// 伝票No単位の総検品済数の取得
		WHtReceiveInspection wReceive = new WHtReceiveInspection();
		wReceive.setCenterId(tReceivePlanBDto.getTReceivePlanH().getCenterId());
		wReceive.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());
		wReceive.setHtWorkNo(tReceivePlanBDto.getTReceivePlanH().getReceiveSlipNo());
		wReceive.setMacAddress(dto.getMacAddress());

		BigDecimal lngStoreNumSum = selectLogic.getMyStoreNum(wReceive);
		dto.setStoreNumSum(selectLogic.selectStoreNum(wReceive));
		dto.setPlanNumSum(lngPlanNumSum);

		if (WCC.isZero(lngStoreNumSum)) {
			//HT入荷中チェック
			if (checkLogic.chkHtReceive(tReceivePlanH) == false) {
				// 検品が行われていません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_NOT_INPUT);
				return;
			}
		}

		// 商品単位の実績数差異をチェック
		boolean blnUnmatch = checkLogic.chkUnmatch(tReceivePlanH);
		if (blnUnmatch == false) {
			// 【完了確認(伝票No単位 差異無)】画面へ遷移する
			dto.setDifferentFlg("0");
		} else {
			dto.setDifferentFlg("1");
		}

		//入荷予定ヘッダの再取得
		tReceivePlanH = checkLogic.checkReceiveSlipNo(tReceivePlanH, "1");
		if (tReceivePlanH == null) {
			return;
		}
		//取得した入荷予定ヘッダをセット
		TReceivePlanBDtoMapper tReceivePlanBDtoMapper = new TReceivePlanBDtoMapper();
		TReceivePlanB tReceivePlanB = tReceivePlanBDtoMapper.mappingToEntity(tReceivePlanBDto);
		tReceivePlanB.setTReceivePlanH(tReceivePlanH);
		tReceivePlanBDto = tReceivePlanBDtoMapper.mappingToDto(tReceivePlanB);
		dto.setTReceivePlanBDto(tReceivePlanBDto);

		if (!dto.getDifferentFlg().equals("0")) {
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_WARN);
		}

		ses.setAttribute("ReceiveInspecStoreDto", dto);
		ReceiveInspecStoreSendWorkNoResource.load(this, util);
	}
}
