package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingStoreLabelNoDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング(入庫No.入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingStoreLabelNo")
@HandyErrorReturnPath(returnURL = "ShippingPickingStoreLabelNo/display")
public class ShippingPickingStoreLabelNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingCheckLogic checkLogic;
// [Ver3.0] unit of measure対応 2017.11.22 王  Start
	@Inject
	private ShippingPickingSelectLogic selectLogic;
// [Ver3.0] unit of measure対応 2017.11.22 王  Start
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * パラピッキング(入庫No.入力)画面初期化メソッドです。
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
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		wHtShippingPickingDto.setStoreLabelNo("");

		ses.setAttribute("ShippingPickingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * パラピッキング(入庫No.入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH Start
		//画面ヘッダ設定
		resource.initScreen("ShippingPickingStoreLabelNoHT");

		//非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingPickingStoreLabelNo/send").func("6").build());

		// オプションボタン１の設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("ShippingPickingList/load?backUrl=ShippingPickingStoreLabelNo/display").itemCd("view").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingPickingCancel/load").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingPickingStoreLabelNo/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH End
		//入庫No.入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingStoreLabelNo.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(数量入力)画面に遷移します。
	 * @param bean 入庫No.入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ShippingPickingStoreLabelNoDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingDto dto = (ShippingPickingDto) ses.getAttribute("ShippingPickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		wHtShippingPickingDto.setStoreLabelNo(bean.getStoreLabelNo());

		// [#575] ValidateチェックのHT国際化 2017.02.13 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.13 sja End

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//入庫NO存在チェック
		if (!checkLogic.checkStoreLabelNo(wHtShippingPicking)) {
			return;
		}
		// [Ver3.0] unit of measure対応 2017.11.22 王  Start
		//商品情報の取得
		MProduct mProduct = selectLogic.selectProduct(wHtShippingPicking);

		wHtShippingPicking.setMProduct(mProduct);
		// [Ver3.0] unit of measure対応 2017.11.22 王  End

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingDto", dto);

		//数量入力画面を表示
		ShippingPickingQtyResource.load(this, util);
	}

}
