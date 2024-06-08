package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingQtyDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingCheckLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingQty")
@HandyErrorReturnPath(returnURL = "ShippingPickingQty/display")
public class ShippingPickingQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingCheckLogic checkLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	// [Ver3.0] unit of measure対応 2017.11.20 王 Start
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

	// [Ver3.0] unit of measure対応 2017.11.20 王 End

	/**
	 * パラピッキング(数量入力)画面初期化メソッドです。
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

		ShippingPickingDto dto = (ShippingPickingDto) ses.getAttribute("ShippingPickingDto");
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
		ses.setAttribute("ShippingPickingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * パラピッキング(数量入力)画面表示を行います。
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

		// [Ver3.0] unit of measure対応 2017.11.20 王 Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		ShippingPickingDto dto = (ShippingPickingDto) ses.getAttribute("ShippingPickingDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ShippingPickingQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定

			// [Ver3.0] unit of measure対応 2017.11.20 王 Start
			dto.setQty(auxiliaryInfo.getCalcQty());
			// [Ver3.0] unit of measure対応 2017.11.20 王 End

			ses.setAttribute("ShippingPickingDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("shipping");
		auxiliaryInfo.setReturnResource("ShippingPickingQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ShippingPickingQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.data.wHtShippingPickingDto.getMProduct().getProductId());
		auxiliaryInfo.setProductCd(dto.data.wHtShippingPickingDto.getMProduct().getProductCd());
		auxiliaryInfo.setShapeGrpId(dto.data.wHtShippingPickingDto.getMProduct().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.20 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH Start
		//画面ヘッダ設定
		resource.initScreen("ShippingPickingQtyHT");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingPickingQty/send").build());

		// オプションボタン１の設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("ShippingPickingList/load?backUrl=ShippingPickingQty/display").itemCd("view").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingPickingStoreLabelNo/load").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingPickingQty/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH End
		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingQty.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(送信確認)画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ShippingPickingQtyDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在又は出荷梱包Noが梱包ヘッダに存在チェック
		if (!ShippingPickingResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingDto dto = (ShippingPickingDto) ses.getAttribute("ShippingPickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
		// [#575] ValidateチェックのHT国際化 2017.02.13 sja Start

		//入力チェック
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.13 sja End
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		// [Ver3.0] unit of measure対応 2017.11.20 王 Start
		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.getwHtShippingPickingDto().getMProduct().getProductCd();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("ShippingPickingQtyHT", "qty");
		//ログイン情報
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//荷主ID
		Long clientId = loginInfo.getClientId();
		//小数有無フラグ
		String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

		if (decimalExistFlg.equals("0")) {
			if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
				return;
			}
		}
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		// [Ver3.0] unit of measure対応  2017.11.20 王 End
		// [Ver3.0] unit of measure対応 2017.11.20 王 Start
		wHtShippingPickingDto.setSpgQtyOns(WCC.toBigDecimal(bean.getQty()));
		// [Ver3.0] unit of measure対応 2017.11.20 王 End
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//数量チェック
		if (!checkLogic.checkSpgQtyOns(wHtShippingPicking)) {
			return;
		}
		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingDto", dto);

		//送信確認画面を表示
		ShippingPickingSendResource.load(this, util);
	}

}
