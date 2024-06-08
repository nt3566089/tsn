package com.oneslogi.ht.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductJanCdDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductUpdateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingProductJanCd")
@HandyErrorReturnPath(returnURL = "ShippingPickingProductJanCd/display")
public class ShippingPickingProductJanCdResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingProductCheckLogic checkLogic;
	@Inject
	private ShippingPickingProductSelectLogic selectLogic;
	@Inject
	private ShippingPickingProductUpdateLogic updateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * パラピッキング(JAN入力)画面初期化メソッドです。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util,
			ShippingPickingProductSelectLogic selectLogic
			) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//検品画面表示項目を取得
		wHtShippingPicking = selectLogic.selectWorkData(wHtShippingPicking);

		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", "ShippingPickingProductWorkNo/load");
			errorManager.clear();
			return;
		}

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		//[ON推-1.1.4-CT-065]CT指摘の修正対応 2016.05.26 chou Del Start
//		dto.setJanCd("");
		//[ON推-1.1.4-CT-065]CT指摘の修正対応 2016.05.26 chou Del End

		ses.setAttribute("ShippingPickingProductDto", dto);

		//[ON推-品向-1112] 修正対応 2016.4.18 chou Add Start
		@SuppressWarnings("unchecked")
		List<MProductShape> gTin14Symbol = (List<MProductShape>)ses.getAttribute("GTIN14_SYMBOL");
		if (gTin14Symbol == null) {
			//荷姿マスタ.GTIN14シンボルの取得、メモリに一時保持
			gTin14Symbol = selectLogic.getMProductShapeInfo(wHtShippingPicking);
			ses.setAttribute("GTIN14_SYMBOL", gTin14Symbol);
		}
		//[ON推-品向-1112] 修正対応 2016.4.18 chou Add End

		//自画面表示
		display(resource, util);
	}

	/**
	 * パラピッキング(JAN入力)画面表示を行います。
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
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 wangqi Start

		// 画面初期設定
		resource.initScreen("ShippingPickingProductJanCdHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingPickingProductCancel/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingPickingProductJanCd/send").itemCd("send").build());
		//フッタボタン（左上）設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("ShippingPickingProductList/load?backUrl=ShippingPickingProductJanCd/display")
				.itemCd("option1").build()
				);
		//フッタボタン（右上）設定
		resource.setOptionButton2(ButtonInfo.builder().url("ShippingPickingProductJanCd/skip").itemCd("option2").build());
		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingPickingProductJanCd/input").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 wangqi End

		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingProductJanCd.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(数量入力)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ShippingPickingProductJanCdDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingProductResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		wHtShippingPickingDto.setJanCd(bean.getJanCd());

		//2015/04/27 KAI UPDATE START 数量入力画面に遷移させるだけの機能にするのでチェック方法を変更
		//入力チェック
		/*
		String valMsg = util.inputCheck(ses, bean);
		if (valMsg != null && valMsg.trim().length() > 0) {
			//入力エラー
			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//JAN/商品一致チェック
		if (!checkLogic.checkJanCd(wHtShipping)) {
			return;
		}
		*/

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		// JAN/商品入力済チェック
		//検品済数を取得
		BigDecimal qty = wHtShippingPickingDto.getSpgQtyOns();

		//検品が一度でも行われたかチェック
		if (WCC.isZero(qty)){
			//商品をスキャンして下さい。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_NOT_INPUT_ERROR);
			return;
		}
		//2015/04/27 KAI UPDATE END

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingProductDto", dto);

		//数量入力画面を表示
		ShippingPickingProductQtyResource.load(this, util);
	}

	/**
	 * スキップボタン押下時にコールされるメソッドです。<br>
	 * スキップ処理を行い、パラピッキング(数量入力)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/skip")
	public void skip(@BeanParam ShippingPickingProductJanCdDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingProductResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		//スキップ回数加算
		wHtShippingPickingDto.setSkipNum(wHtShippingPickingDto.getSkipNum() + 1);
		//検品数をクリア 2015/04/27 KAI ADD
		wHtShippingPickingDto.setSpgQtyOns(WCC.ZERO);

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingProductDto", dto);

		//出荷検品ワーク更新
		updateLogic.updateWkPickingFlg(wHtShippingPicking);

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingProductDto", dto);

		/* 2015/06/12 INOUE ADD START 色・音の適用 */
		// 次の画面で完了音を鳴らす。
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
		/* 2015/06/12 INOUE ADD END */

		//[ON推-品向-1111] 修正対応 2016.4.18 chou Add Start
		ses.removeAttribute("GTIN14_SYMBOL");
		//[ON推-品向-1111] 修正対応 2016.4.18 chou Add End

		//JAN入力画面を表示
		ShippingPickingProductJanCdResource.load(this, util, selectLogic);

	}


	/**
	 * スキャン時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ピック数をカウントアップします。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/input")
	// [#2946][Ver3.0] WAS連携対応 2018/02/28 PYM Start
	@WorkLogEnd("ShippingPickingProductHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/28 PYM End
	public void input(@BeanParam ShippingPickingProductJanCdDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingProductResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		wHtShippingPickingDto.setJanCd(bean.getJanCd());
		//[ON推-1.1.4-CT-065]CT指摘の修正対応 2016.05.26 chou Add Start
		dto.setJanCd(bean.getJanCd());
		//[ON推-1.1.4-CT-065]CT指摘の修正対応 2016.05.26 chou Add End

		// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.16 sja End

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//JAN/商品一致チェック
		if (!checkLogic.checkJanCd(wHtShippingPicking)) {
			return;
		}

		//指示数、検品済数を取得
		BigDecimal qty = wHtShippingPickingDto.getSpgQtyOns();
		BigDecimal instNum = wHtShippingPickingDto.getInstNum();

		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）fujiwara Start
		// 小数を扱わない商品をインクリメント対象に
		if (wHtShippingPickingDto.getMProduct().getMShapeGrp().getDecimalExistFlg().equals("0")) {
			//[ON推-品向-1112] 修正対応 2016.4.18 chou Mod Start

			//検品済数カウントアップ
			if (checkLogic.checkGtin14SymbolJanCdAndGetUnitNum(wHtShippingPicking, bean.getJanCd())) {
				// [Ver3.0] unit of measure対応 2017.12.01 王 Del
				// [Ver3.0] unit of measure対応 2017.11.30 王 Start
				// 入数の取得処理
				// 入数が取得できない場合
				if (!checkLogic.getUnitNum(wHtShippingPicking)) {
					//入数の設定
					wHtShippingPicking.setUnitNum(1L);
				}
				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingCasePickingDto", dto);
				// [Ver3.0] unit of measure対応 2017.11.30 王 End
				Long unitNum = wHtShippingPicking.getUnitNum();

				qty = WCC.add(qty, CU.nullToZero(unitNum) == 0 ? WCC.ONE : unitNum);
			} else {
				qty = WCC.add(qty, WCC.ONE);
			}
			// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）fujiwara End
		} else {
			//[#2943] HTソースCDスキャン時インクリメント制御対応 小数を扱う商品の場合スキャン時に数量画面へ遷移 2018.01.05 fujiwara Start
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingProductDto", dto);

			//数量入力画面を表示
			ShippingPickingProductQtyResource.load(this, util);
			return;

		}
		//[#2943] HTソースCDスキャン時インクリメント制御対応 小数を扱う商品の場合スキャン時に数量画面へ遷移 2018.01.05 fujiwara End

		if (WCC.isGreaterThan(qty, instNum)) {
			//該当のアイテムの残数を超えています。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_SPG_QTY_OVER_ERROR);
			return;
		}
		//[ON推-品向-1112] 修正対応 2016.4.18 chou Mod End

		//検品済をセット
		wHtShippingPicking.setSpgQtyOns(qty);

		//検品済数が指示数に達したかチェック
		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if(WCC.isZero(qty) || WCC.isZero(instNum) || WCC.isNotEqual(qty, instNum)){
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			//出荷検品ワーク更新(検品数)
			updateLogic.updateWkPickingFlg(wHtShippingPicking);

			//JAN入力画面を表示
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingProductDto", dto);

			/* 2015/06/12 INOUE ADD START 色・音の適用 */
			// 次の画面で完了音を鳴らす。
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
			/* 2015/06/12 INOUE ADD END */

			ShippingPickingProductJanCdResource.load(this, util, selectLogic);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			skipWorkLogEnd();
			addWorkLogQty(WCC.ZERO);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
		} else {
			wHtShippingPicking.setPickingFlg("1");

			//出荷検品ワーク更新(検品済)
			updateLogic.updateWkPickingFlg(wHtShippingPicking);

			//[ON推-品向-1112] 修正対応 2016.4.18 chou Add Start
			ses.removeAttribute("GTIN14_SYMBOL");
			//[ON推-品向-1112] 修正対応 2016.4.18 chou Add End

			//出庫フラグの更新
			if (updateLogic.updatePickingFlg(wHtShippingPicking)) {

				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				// 総数量
				setWorkLogQty(WCC.add(getWorkLogQty(), wHtShippingPicking.getInstNum()));
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
				//出庫作業NO全部出庫済
				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingPickingProductDto", dto);

				//完了確認画面を表示
				displayEndDialog();

				return;
			} else {
				//出庫作業NO一部出庫済
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
				skipWorkLogEnd();
				addWorkLogQty(wHtShippingPicking.getInstNum());
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingPickingProductDto", dto);

				/* 2015/06/12 INOUE ADD START 色・音の適用 */
				// 次の画面で完了音を鳴らす。
				setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
				/* 2015/06/12 INOUE ADD END */

				//JAN入力画面を表示
				ShippingPickingProductJanCdResource.load(this, util, selectLogic);

				return;
			}
		}
	}

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		/* 2015/05/18 INOUE UPDATE START フッタ共通化対応 */
		/* 2015/06/12 INOUE UPDATE START 色・音の適用 */
		displayOperationEndDialog(
				"ShippingPickingProduct",
				"ShippingPickingProductQty/onEndDialogEnd",
				"ShippingPickingProductQty/onEndDialogContinue"
			);
		/* 2015/06/12 INOUE UPDATE END */
		/* 2015/05/18 INOUE END */
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

		//機能単位セッションをクリア
		ShippingPickingProductResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * 入力チェックを行い、出庫作業No入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//機能単位セッションを再構造
		ShippingPickingProductResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		ShippingPickingProductWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
