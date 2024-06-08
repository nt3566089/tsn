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
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingWorkNoDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingCheckLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング(出庫作業No入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingWorkNo")
@HandyErrorReturnPath(returnURL = "ShippingPickingWorkNo/display")
public class ShippingPickingWorkNoResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingCheckLogic checkLogic;
	//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Add Start
	/* パラメータマスタに対するロジッククラス */
	@Inject
	private ParamLogic paramLogic;
	//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Add End
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * パラピッキング(出庫作業No入力)画面初期化を行います。
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
		ShippingPickingResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * パラピッキング(出庫作業No入力)画面表示を行います。
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
		resource.initScreen("ShippingPickingWorkNoHT");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingPickingWorkNo/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingPickingWorkNo/back").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingPickingWorkNo/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH Start

		//出庫作業No入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingWorkNo.jsp", ses);
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
		ShippingPickingResource.removeSession(this, util, shippingLogic);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(数量入力)画面に遷移します。
	 * @param bean 出庫作業No入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogStart("ShippingPickingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void send(@BeanParam ShippingPickingWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingDto dto = (ShippingPickingDto) ses.getAttribute("ShippingPickingDto");

		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();
		wHtShippingPickingDto.setPickingWorkNo(bean.getPickingWorkNo());

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

		//2015/03/31 KAI ADD START 顧客出荷指示Noでもできるようチェック処理を追加
		wHtShippingPicking = shippingLogic.checkClientShippingNo(wHtShippingPicking);
		if (wHtShippingPicking == null) {
			return;
		}
		//2015/03/31 KAI ADD END
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			//入力したデータが出庫作業Noの場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Add Start
			//ログイン情報取得
			HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

			//パラメータマスタ情報の取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(loginInfo.getClientId());
			mClientCenter.setCenterId(loginInfo.getCenterId());

			MParam mParam = new MParam();
			mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

			//梱包計算有の場合は、出庫作業No入力時に、エラーメッセージを表示
			if ("1".equals(mParam.getPackingCalCls())) {//梱包計算処理区分:梱包計算有の場合
				//出荷梱包Noを入力して下さい。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PICKING_WORK_NO_INPUT_ERROR);
				return;
			}
			//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Add End

			//出庫作業No存在チェック
			if (!checkLogic.checkPickingWorkNo(wHtShippingPicking)) {
				return;
			}
			// [C-CWMS-0051] 梱包計算の件対応で梱包ヘッダにデータが入力した為、ケース品存在チェックを削除 2015.12.15 NayZaw

			//出庫ステータスの更新(30: ピッキング中 )
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePickingStatus(wHtShippingPicking, CDef.PickingStatus.$30);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

			dto.setIsPackingNo(false);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			//入力したデータが出荷梱包Noの場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			if (!checkLogic.checkShippingPackingNo(wHtShippingPicking)) {
				return;
			}
			//梱包ステータスの更新(30: ピッキング中 )
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePackingStatus(wHtShippingPicking, CDef.PackingStatus.$30);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

			dto.setIsPackingNo(true);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

		// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
		setWorkLogTraceItem(bean.getPickingWorkNo());
		// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

		//2015/03/31 KAI ADD START 顧客出荷指示Noから取得した出庫作業Noをここでセット
		wHtShippingPickingDto.setPickingWorkNo(wHtShippingPicking.getPickingWorkNo());
		//2015/03/31 KAI ADD END

		//通信制御データ作成
		util.setHtComCtl(ses, "ShippingPicking", wHtShippingPickingDto.getPickingWorkNo());

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingDto", dto);

		//入庫No入力画面を表示
		ShippingPickingStoreLabelNoResource.load(this, util);

	}

}
