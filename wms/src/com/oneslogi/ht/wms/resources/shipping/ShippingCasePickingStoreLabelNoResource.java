package com.oneslogi.ht.wms.resources.shipping;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingStoreLabelNoDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingUpdateLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ケースピッキング(入庫No.入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingCasePickingStoreLabelNo")
@HandyErrorReturnPath(returnURL = "ShippingCasePickingStoreLabelNo/display")
public class ShippingCasePickingStoreLabelNoResource extends HandyMenuResource {

	// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw add Start
	protected static class StatusCode {
		/**
		 * 荷札の自動印刷エラー
		 */
		protected static final int AUTO_PRINT_ERROR = 3;
	}

	// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw add End

	/* 共通関数群ユティリティクラス */
	@Inject
	private HandyCommonUtil util;
	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;
	/* ケースピッキングデータチェックロジッククラス */
	@Inject
	private ShippingCasePickingCheckLogic checkLogic;
	/* ケースピッキングデータ取得ロジッククラス */
	@Inject
	private ShippingCasePickingSelectLogic shippingCasePickingSelectLogic;
	/* ケースピッキングデータ更新ロジッククラス */
	@Inject
	private ShippingCasePickingUpdateLogic shippingCasePickingUpdateLogic;
	/* センタマスタに対するロジッククラス */
	@Inject
	private CenterLogic centerLogic;
	/* 荷主マスタに対するロジッククラス */
	@Inject
	private ClientLogic clientLogic;
	/* 倉庫マスタチェック処理ロジッククラス */
	@Inject
	private WarehouseLogic warehouseLogic;

	/**
	 * ケースピッキング(入庫No.入力)画面初期化メソッドです。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		load(this, util, shippingCasePickingSelectLogic, checkLogic);
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util,
			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			ShippingCasePickingSelectLogic selectLogic, ShippingCasePickingCheckLogic checkLogic) throws Exception {
		// [Ver3.0] unit of measure対応 2017.11.29 王 End

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//検品画面表示項目を取得
		wHtShippingPicking = selectLogic.selectWorkData(wHtShippingPicking, dto.getCasePickingNo());

		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", "ShippingCasePickingNo/load");
			errorManager.clear();
			return;
		}
		// [Ver3.0] unit of measure対応 2017.11.30 王 Start
		// 入数の取得処理
		// 入数が取得できない場合
		if (!checkLogic.getUnitNum(wHtShippingPicking)) {
			//入数の設定
			wHtShippingPicking.setUnitNum(1L);
		}
		// [Ver3.0] unit of measure対応 2017.11.30 王 End
		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));

		//[ON推-品向-1059] 削除 2016.04.04 chou Start

		ses.setAttribute("ShippingCasePickingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ケースピッキング(入庫No.入力)画面表示を行います。
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
		resource.initScreen("ShippingCasePickingStoreLabelNoHT");

		//オプションボタン１（左上）の設定
		resource.setOptionButton1(
				ButtonInfo.builder()
						.url("ShippingCasePickingList/load?backUrl=ShippingCasePickingStoreLabelNo/display")
						.itemCd("option1")
						.type(BUTTON_URL_JUMP_WITH_DATA)
						.keyType(KEY_TYPE_OPTION1).build());
		//オプションボタン２（右上）設定
		resource.setOptionButton2(
				ButtonInfo.builder()
						.url("ShippingCasePickingStoreLabelNo/skip")
						.itemCd("option2")
						.type(BUTTON_URL_JUMP_WITH_DATA)
						.keyType(KEY_TYPE_OPTION2).build());
		//フッタボタン（左）設定
		resource.setReturnButton(
				ButtonInfo.builder()
						.url("ShippingCasePickingCancel/load?backUrl=ShippingCasePickingStoreLabelNo/display")
						.itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingCasePickingStoreLabelNo/send").itemCd("send").build());
		//非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingCasePickingStoreLabelNo/input").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 End

		//入庫No.入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingCasePickingStoreLabelNo.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキング(数量入力)画面に遷移します。
	 * @param bean 入庫No.入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ShippingCasePickingStoreLabelNoDto bean) throws Exception {

		// ケースピッキングNo.のデータ存在チェック
		if (!ShippingCasePickingResource.checkExistCasePickingNo(this, util, shippingLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
		//入力チェック(サイズ)
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

		//入庫NO一致チェック
		if (!checkLogic.checkStoreLabelNoDiff(wHtShippingPicking, bean.getStoreLabelNo())) {
			return;
		}

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		dto.setBackUrl("ShippingCasePickingStoreLabelNo/load");
		ses.setAttribute("ShippingCasePickingDto", dto);

		//数量入力画面を表示
		ShippingCasePickingQtyResource.load(this, util);
	}

	/**
	 * スキップボタン押下時にコールされるメソッドです。<br>
	 * スキップ処理を行い、ケースピッキング(入庫No.入力)画面に遷移します。
	 * @param bean 入庫No.入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/skip")
	public void skip(@BeanParam ShippingCasePickingStoreLabelNoDto bean) throws Exception {

		// ケースピッキングNo.のデータ存在チェック
		if (!ShippingCasePickingResource.checkExistCasePickingNo(this, util, shippingLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		//スキップ回数加算
		wHtShippingPickingDto.setSkipNum(wHtShippingPickingDto.getSkipNum() + 1);

		wHtShippingPickingDto.setSpgQtyOns(WCC.ZERO);

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingCasePickingDto", dto);

		//出荷ピッキングワーク更新
		shippingCasePickingUpdateLogic.updateWkPickingFlg(wHtShippingPicking);

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingCasePickingDto", dto);

		// 次の画面で完了音を鳴らす。
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

		//入庫No.入力画面を表示
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
	}

	/**
	 * スキャン時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ピック数をカウントアップします。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/input")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogEnd("ShippingCasePickingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void input(@BeanParam ShippingCasePickingStoreLabelNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		//[ON推-品向-1059] 追加 2016.04.04 chou Start
		dto.setStoreLabelNo(bean.getStoreLabelNo());
		//[ON推-品向-1059] 追加 2016.04.04 chou End

		if (bean.getStoreLabelNo() == null || bean.getStoreLabelNo().equals("")) {
			// [#575] ValidateチェックのHT国際化 2017.04.11 sja Start
			this.getErrorManager().clear();
			// [#575] ValidateチェックのHT国際化 2017.04.11 sja End

			//ケースピック(JAN)の画面を表示
			// [Ver3.0] unit of measure対応 2017.12.01 王 Start
			ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
			// [Ver3.0] unit of measure対応 2017.12.01 王 End
			return;
		}

		// ケースピッキングNo.のデータ存在チェック
		if (!ShippingCasePickingResource.checkExistCasePickingNo(this, util, shippingLogic)) {
			return;
		}

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

		//入庫NO一致チェック
		if (!checkLogic.checkStoreLabelNoDiff(wHtShippingPicking, bean.getStoreLabelNo())) {
			return;
		}

		//指示数、検品済数を取得
		BigDecimal qty = wHtShippingPickingDto.getSpgQtyOns();
		BigDecimal instNum = wHtShippingPickingDto.getInstNum();

		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.21 fujiwara Start
		// 小数を扱う商品か判別、小数を扱う商品ならば検品済数のカウントアップを避ける

		if (wHtShippingPickingDto.getMProduct().getMShapeGrp().getDecimalExistFlg().equals("0")) {

			//検品済数カウントアップ
			qty = WCC.add(qty, WCC.ONE);

		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.21 fujiwara End

		}else{
			//[#2943] HTソースCDスキャン時インクリメント制御対応 小数を扱う商品の場合スキャン時に数量画面へ遷移 2018.01.05 fujiwara Start
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			dto.setBackUrl("ShippingCasePickingStoreLabelNo/load");
			ses.setAttribute("ShippingCasePickingDto", dto);

			//数量入力画面を表示
			ShippingCasePickingQtyResource.load(this, util);
			return;
		}
			//[#2943] HTソースCDスキャン時インクリメント制御対応 小数を扱う商品の場合スキャン時に数量画面へ遷移 2018.01.05 fujiwara End
		//検品済をセット
		wHtShippingPicking.setSpgQtyOns(qty);

		//検品済数が指示数に達したかチェック
		if (WCC.isZero(qty) || WCC.isZero(instNum) || WCC.isNotEqual(qty, instNum)) {

			//出荷ピッキングワーク更新(検品数)
			shippingCasePickingUpdateLogic.updateWkPickingFlg(wHtShippingPicking);

			//入庫No.入力画面を表示
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingCasePickingDto", dto);

			// 次の画面で完了音を鳴らす。
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
			// [Ver3.0] unit of measure対応 2017.11.29 王 End
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			skipWorkLogEnd();
			addWorkLogQty(WCC.ZERO);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
		} else {

			wHtShippingPicking.setPickingFlg("1");//出庫フラグ:出庫済

			//出荷ピッキングワークの更新(出荷ピッキングワーク.出庫フラグ→出庫済)
			shippingCasePickingUpdateLogic.updateWkPickingFlg(wHtShippingPicking);

			//梱包ボディの更新(出庫フラグ→出庫済、検品フラグ→検品済)
			if (shippingCasePickingUpdateLogic.updatePickingFlg(wHtShippingPicking, dto.getCasePickingNo(), errRetSts(StatusCode.AUTO_PRINT_ERROR))) {//ケースピッキングNO全部検品済
				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingCasePickingDto", dto);

				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start

				if (getErrorManager().size() > 0) {
					int statusCd = getErrorManager().get().get(1).getStatusCd();
					if (statusCd == StatusCode.AUTO_PRINT_ERROR) {
						// 荷札自動印刷時エラーの場合、エラー画面を表示した後、成功した時と同じ画面へ遷移
						sendErrorScreen(util.getMessage(getErrorManager()), "", "ShippingCasePickingStoreLabelNo/finishErrorConfirm");
						getErrorManager().clear();
						return;
					}
				}
				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				// 総数量
				setWorkLogQty(WCC.add(getWorkLogQty(), wHtShippingPicking.getInstNum()));
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
				//完了確認画面を表示
				displayEndDialog();

				return;
			} else {//ケースピッキングNO一部検品済
				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingCasePickingDto", dto);

				// 次の画面で完了音を鳴らす。
				setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
				if (getErrorManager().size() > 0) {
					int statusCd = getErrorManager().get().get(1).getStatusCd();
					if (statusCd == StatusCode.AUTO_PRINT_ERROR) {
						// 荷札自動印刷時エラーの場合、エラー画面を表示した後、成功した時と同じ画面へ遷移
						sendErrorScreen(util.getMessage(getErrorManager()), "", "ShippingCasePickingStoreLabelNo/notFinishErrorConfirm");
						getErrorManager().clear();
						return;
					}
				}
				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
				skipWorkLogEnd();
				addWorkLogQty(wHtShippingPicking.getInstNum());
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

				//入庫No.管理フラグを取得
				String storeNoFlg = shippingCasePickingSelectLogic.getStoreNoFlg(ses);

				if (storeNoFlg.equals("0")) {//入庫NO.管理対象外の場合
					//ケースピック(JAN)の画面を表示
					// [Ver3.0] unit of measure対応 2017.12.01 王 Start
					ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
					// [Ver3.0] unit of measure対応 2017.12.01 王 End
				} else {//入庫NO.管理対象の場合
					//ケースピック(入庫No.)の画面を表示
					// [Ver3.0] unit of measure対応 2017.11.29 王 Start
					ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
					// [Ver3.0] unit of measure対応 2017.11.29 王 End
				}

				return;
			}
		}
	}

	// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
	/**
	 * 未終了時、エラー画面表示後行う処理
	 * @throws Exception
	 */
	@GET
	@Path("/notFinishErrorConfirm")
	public void notFinishErrorConfirm() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		//入庫No.管理フラグを取得
		String storeNoFlg = shippingCasePickingSelectLogic.getStoreNoFlg(ses);

		if (storeNoFlg.equals("0")) {//入庫NO.管理対象外の場合
			//ケースピック(JAN)の画面を表示
			// [Ver3.0] unit of measure対応 2017.12.01 王 Start
			ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
			// [Ver3.0] unit of measure対応 2017.12.01 王 End
		} else {//入庫NO.管理対象の場合
			//ケースピック(入庫No.)の画面を表示
			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
			// [Ver3.0] unit of measure対応 2017.11.29 王 End
		}
		return;
	}

	/**
	 * 終了時、エラー画面表示後行う処理
	 * @throws Exception
	 */
	@GET
	@Path("/finishErrorConfirm")
	public void finishErrorConfirm() throws Exception {
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_OPERATION_END);
		displayEndDialog();
	}

	// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {

		displayOperationEndDialog(
				"ShippingCasePicking",
				"ShippingCasePickingStoreLabelNo/onEndDialogEnd",
				"ShippingCasePickingStoreLabelNo/onEndDialogContinue");
	}

	/**
	 * 完了確認画面終了時にコールされるメソッドです。<br>
	 * 入力チェックを行い、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ShippingCasePickingResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキングNo入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//機能単位セッションを再構造
		ShippingCasePickingResource.removeSession(this, util, shippingLogic);

		//ケースピッキングNo入力画面を表示
		ShippingCasePickingNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
