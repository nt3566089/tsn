package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionLocDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 予定無し入荷(ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionLoc")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionLoc/display")
public class ReceiveNoPlanInspectionLocResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LocationLogic locationLogic;

	/**
	 * 予定無し入荷(ロケ入力)画面初期化を行います。
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
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();
		wHtReceiveNoPlanInspecDto.setRcvLocCd("");

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 *予定無し入荷(ロケ入力)画面表示を行います。
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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto.getMProduct());

		// ==== 【JAN入力】画面で入力したJAN/商品コードのロット管理フラグ期限日管理フラグに応じて遷移先画面を変更する ====
		String backUrl = "ReceiveNoPlanInspectionQty/display";

		// 汎用ラベル使用場合
		if (dto.getLabelKbn().equals("2")) {
			backUrl = "ReceiveNoPlanInspectionLabelInput/display";
		} else {
			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
				// ロット・期限日入力画面を表示
				backUrl = "ReceiveNoPlanInspectionLotLimitDt/display";
			}

			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
				// ロット入力画面を表示
				backUrl = "ReceiveNoPlanInspectionLot/display";
			}

			if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
				// 期限日入力画面を表示
				backUrl = "ReceiveNoPlanInspectionLimitDt/display";
			}
		}

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionLocHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLoc/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(backUrl).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLoc/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionLoc.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、送信確認画面に遷移します。
	 * @param bean ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionLocDto bean) throws Exception {//

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();
		wHtReceiveNoPlanInspecDto.setRcvLocCd(bean.getLoc());

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.09 sja End

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLoc());
		mLocation.setCenterId(wHtReceiveNoPlanInspecDto.getCenterId());
		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		wHtReceiveNoPlanInspecDto.setRcvLocId(mLocation.getLocationId());
		wHtReceiveNoPlanInspecDto.setRcvLocNm(mLocation.getLocationNm());
		wHtReceiveNoPlanInspecDto.setRcvLocCd(bean.getLoc());

		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocationDto  mLocationDto = mLocationDtoMapper.mappingToDto(mLocation);
		wHtReceiveNoPlanInspecDto.setMLocation(mLocationDto);

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷確認画面を表示
		ReceiveNoPlanInspectionSendResource.load(this, util);

	}
}
