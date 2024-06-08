package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingNoDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingInsertLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ケースピッキング(ケースピッキングNo入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingCasePickingNo")
@HandyErrorReturnPath(returnURL = "ShippingCasePickingNo/display")
public class ShippingCasePickingNoResource extends HandyMenuResource {

	/* 共通関数群ユティリティクラス */
	@Inject
	private HandyCommonUtil util;
	/* センタマスタに対するロジッククラス */
	@Inject
	private CenterLogic centerLogic;
	/* 荷主マスタに対するロジッククラス */
	@Inject
	private ClientLogic clientLogic;
	/* 倉庫マスタチェック処理ロジッククラス */
	@Inject
	private WarehouseLogic warehouseLogic;
	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;
	/* ケースピッキングデータチェックロジッククラス */
	@Inject
	private ShippingCasePickingCheckLogic checkLogic;
	/* ケースピッキングデータ取得ロジッククラス */
	@Inject
	private ShippingCasePickingSelectLogic shippingCasePickingSelectLogic;
	/* ケースピッキングデータ登録ロジッククラス */
	@Inject
	private ShippingCasePickingInsertLogic shippingCasePickingInsertLogic;

	/**
	 * ケースピッキング(ケースピッキングNo入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {

		//機能単位セッションを処理化
		ShippingCasePickingResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ケースピッキング(ケースピッキングNo入力)画面表示を行います。
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
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 Start

		// 画面初期設定
		resource.initScreen("ShippingCasePickingNoHT");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingCasePickingNo/send").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingCasePickingNo/back").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingCasePickingNo/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 End

		//ケースピッキングNo入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingCasePickingNo.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// 機能単位セッションをクリア
		ShippingCasePickingResource.removeSession(this, util, shippingLogic);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキング(JAN/入庫No.)画面に遷移します。
	 * @param bean ケースピッキングNo入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogStart("ShippingCasePickingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void send(@BeanParam ShippingCasePickingNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();
		dto.setCasePickingNo(bean.getCasePickingNo());

		// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.14 sja End

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		// ケースピッキングNo存在など一連のチェックを行う
		if (!checkLogic.checkCasePickingNo(wHtShippingPicking, bean.getCasePickingNo())) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
		setWorkLogTraceItem(bean.getCasePickingNo());
		// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

		//出庫ステータスの更新(30: ピッキング中 )
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		shippingLogic.updatePickingStatusByCasePickingNo(wHtShippingPicking, bean.getCasePickingNo(), CDef.PickingStatus.$30);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//出荷ピッキングワーク登録
		shippingCasePickingInsertLogic.insertWHtShippingPicking(wHtShippingPicking, bean.getCasePickingNo());

		//通信制御データ作成
		util.setHtComCtl(ses, "ShippingCasePicking", bean.getCasePickingNo());

		ses.setAttribute("ShippingCasePickingDto", dto);

		//入庫No.管理フラグを取得
		String storeNoFlg = shippingCasePickingSelectLogic.getStoreNoFlg(ses);

		if (storeNoFlg.equals("0")) {//入庫NO.管理対象外の場合
			//ケースピック(JAN)の画面を表示
			// [Ver3.0] unit of measure対応 2017.12.01 王 Start
			ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
			// [Ver3.0] unit of measure対応 2017.12.01 王 End
		} else {//入庫NO.管理対象の場合
			//ケースピック(入庫No.)の画面を表示
			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
			// [Ver3.0] unit of measure対応 2017.11.29 王 End
		}
	}

}
