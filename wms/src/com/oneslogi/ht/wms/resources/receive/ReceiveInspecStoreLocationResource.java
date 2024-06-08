package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreLocationDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * 検品格納(ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreLocation")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreLocation/display")
public class ReceiveInspecStoreLocationResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;

	/**
	 * 入庫検品格納(ロケ入力)画面初期化を行います。
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
		dto.setLoc("");
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 *入庫検品格納(ロケ入力)画面表示を行います。
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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());

		// ==== 【JAN入力】画面で入力したJAN/商品コードのロット管理フラグ期限日管理フラグに応じて遷移先画面を変更する ====
		String backUrl = "ReceiveInspecStoreQty/display";

		// 汎用ラベル使用場合
		if (dto.getLabelKbn().equals("2")) {
			backUrl = "ReceiveInspecStoreLabelInput/display";
		}
		//ON推-品向-1005 センタ間移動の場合、ロット・期限日設定している場合、戻る先修正   2015/11/10 NayZaw Start
		//
		else if (dto.getTReceivePlanBDto().getTReceivePlanH().getCenterTransitFlg().equals("1")) {
			if (mProduct.isLotManagFlg$1() || mProduct.isLimitDtManagFlg$1()) {
				// ロット・期限日入力画面を表示
				backUrl = "ReceiveInspecStoreCenterMoveLotLimitDt/display";
			}
		//ON推-品向-1005 センタ間移動の場合、ロット・期限日設定している場合、戻る先修正   2015/11/10 NayZaw End
		}else {

			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
				// ロット・期限日入力画面を表示
				backUrl = "ReceiveInspecStoreLotLimitDt/display";
			}

			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
				// ロット入力画面を表示
				backUrl = "ReceiveInspecStoreLot/display";
			}

			if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
				// 期限日入力画面を表示
				backUrl = "ReceiveInspecStoreLimitDt/display";
			}
		}

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreLocationHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspecStoreLocation/send").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(backUrl).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreLocation/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreLocation.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、送信確認画面に遷移します。
	 * @param bean ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveInspecStoreLocationDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		dto.setLoc(bean.getLoc());
		ses.setAttribute("ReceiveInspecStoreDto", dto);

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

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLoc());
		mLocation.setCenterId(dto.data.tReceivePlanBDto.getTReceivePlanH().getCenterId());
		mLocation = selectLogic.getMLocation(mLocation);
		if (mLocation == null) {
			// ロケーションマスタに存在しません
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			return;
		}

		if (!mLocation.isLocationType$00()) {
			//ロケは通常ロケーションを入力してください。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LOC_NORMAL);
			return;
		}

		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();

		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();
		tReceivePlanBDto.setPlanLocationId(mLocation.getLocationId());
		tReceivePlanBDto.setPlanLocationCd(mLocation.getLocationCd());
		dto.setTReceivePlanBDto(tReceivePlanBDto);
		dto.getTStoreRecordBDto().setMLocation(mLocationDtoMapper.mappingToDto(mLocation));
		dto.getTReceivePlanBDto().setMLocation(mLocationDtoMapper.mappingToDto(mLocation));

		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//格納確認画面を表示
		ReceiveInspecStoreSendResource.load(this, util);

	}
}
