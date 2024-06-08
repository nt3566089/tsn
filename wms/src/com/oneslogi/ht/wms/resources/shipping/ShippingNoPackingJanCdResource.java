package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingJanCdDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingUpdateLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogData;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingJanCd")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingJanCd/display")
public class ShippingNoPackingJanCdResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingNoPackingCheckLogic checkLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	@Inject
	private ShippingNoPackingSelectLogic selectLogic;
	@Inject
	private ShippingNoPackingUpdateLogic updateLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * バラ出荷検品(JAN入力)画面初期化を行います。
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

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//[ON推-品質問題点指摘票(新ｿﾘV2-071)] 修正対応 2016.08.29 chou Mod Start
		if(CU.isNullOrEmpty(wHtShipping.getProductCd())){
			wHtShipping.setJanCd("");
			wHtShipping.setProductId(null);
			wHtShipping.setProductCd("");
			wHtShipping.setProductNm("");
			wHtShipping.setMProduct(new MProduct());
			wHtShipping.setSpgQtyRemain(null);
			wHtShipping.setSpgQtyOns(WCC.ZERO);
		}else{
			wHtShipping.setJanCd("");
		}
		//[ON推-品質問題点指摘票(新ｿﾘV2-071)] 修正対応 2016.08.29 chou Mod End
		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * バラ出荷検品(JAN入力)画面表示を行います。
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
		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");

		//画面ヘッダ設定
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD Start
		resource.initScreen("ShippingNoPackingJanCdHT");
		// 非表示ボタンを設定
		resource.setHideButton(
				ButtonInfo.builder().url("ShippingNoPackingJanCd/input").func("6").build());
		// オプションボタン１を設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("ShippingNoPackingList/load?backUrl=ShippingNoPackingJanCd/display").itemCd("option1").build());
		if(!dto.isPackingNo){
			// オプションボタン２を設定
		    resource.setOptionButton2(
		    		ButtonInfo.builder()
		    		.url("ShippingNoPackingBox/load?backUrl=ShippingNoPackingJanCd/display").itemCd("option2").build());
		}//フッタボタン（左）設定
	    resource.setReturnButton(
	    		ButtonInfo.builder().url("ShippingNoPackingCancel/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder().url("ShippingNoPackingJanCd/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD END
		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingJanCd.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(数量入力)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ShippingNoPackingJanCdDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		wHtShippingDto.setJanCd(bean.getJanCd());

		//2015/04/27 KAI UPDATE START カウントアップ対応 状況に応じて遷移先画面を変更するためチェック方法を変更
		/*
		//入力チェック
		String valMsg = util.inputCheck(ses, bean);
		if (valMsg != null && valMsg.trim().length() > 0) {
			//入力エラー
			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//商品存在チェック
		if (!checkLogic.checkProduct(wHtShipping)) {
			return;
		}

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//数量入力画面を表示
		ShippingNoPackingQtyResource.load(this, util);
		*/

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		// JAN/商品入力有無のチェック
		if (CU.isNullOrEmpty(bean.getJanCd())) {
			//未入力の場合

			//検品途中か判断
			if (!CU.isNullOrEmpty(wHtShipping.getProductCd())) {
				//検品途中の場合は数量入力画面に遷移
				dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
				ses.setAttribute("ShippingNoPackingDto", dto);

				//数量入力画面を表示
				ShippingNoPackingQtyResource.load(this, util);
			} else {
				//検品未完了件数チェック
				if (selectLogic.selectSpgQtyRemainCount(wHtShipping) > 0) {
					//未検品データが存在します。
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NOT_COMPLETE);
					return;
				}

				//箱未登録件数チェック
				if (checkLogic.selectNoBoxCount(wHtShipping) > 0) {
					//出庫検品箱数 > 0 時
					dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
					ses.setAttribute("ShippingNoPackingDto", dto);

					// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
					// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

					ShippingNoPackingBoxResource.load(this, util, "ShippingNoPackingJanCd/load", checkLogic, selectLogic, shippingLogic, clearLogic, commonLogic);
					return;

					// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
					// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End
				}
				//戻り先画面の設定
				dto.setBackUrl("ShippingNoPackingJanCd/load");

				dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
				ses.setAttribute("ShippingNoPackingDto", dto);

				//全件箱登録まで完了している場合は送信確認画面を表示
				ShippingNoPackingSendResource.load(this, util);
				return;
			}
		} else {
			//入力ありの場合
			//商品存在チェック
			if (!checkLogic.checkProduct(wHtShipping)) {
				return;
			}

			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			//数量入力画面を表示
			ShippingNoPackingQtyResource.load(this, util);
			return;
		}
		//2015/04/27 KAI UPDATE END
	}

	//2015/04/27 KAI ADD START カウントアップ対応 JANスキャンでカウントアップ
	/**
	 * JAN入力＋ENT時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(箱登録)画面画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/input")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogData("ShippingNoPackingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void input(@BeanParam ShippingNoPackingJanCdDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダに存在するかチェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		wHtShippingDto.setJanCd(bean.getJanCd());

		// [#575] ValidateチェックのHT国際化 2017.02.16 sja End
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

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//商品存在チェック
		if (!checkLogic.checkProduct(wHtShipping)) {
			//エラー時は表示内容をクリア
			wHtShipping.setProductId(null);
			wHtShipping.setProductCd("");
			wHtShipping.setProductNm("");
			wHtShipping.setMProduct(new MProduct());
			wHtShipping.setSpgQtyRemain(null);
			wHtShipping.setSpgQtyOns(WCC.ZERO);
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			return;
		}

		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.25 fujiwara Start
		if (wHtShipping.getMProduct().getMShapeGrp().getDecimalExistFlg().equals("0")) {
			//検品数を１に設定
			wHtShipping.setSpgQtyOns(WCC.ONE);

			//検品済数の取得
			if (!checkLogic.checkSpgQtyOns(wHtShipping)) {
				//エラー時は表示内容をクリア
				wHtShipping.setJanCd("");
				wHtShipping.setProductId(null);
				wHtShipping.setProductCd("");
				wHtShipping.setProductNm("");
				wHtShipping.setMProduct(new MProduct());
				wHtShipping.setSpgQtyRemain(null);
				wHtShipping.setSpgQtyOns(WCC.ZERO);
				dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
				ses.setAttribute("ShippingNoPackingDto", dto);

				return;
			}

			//出荷検品WORKテーブルの更新
			updateLogic.updateWHtShipping(wHtShipping);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			addWorkLogQty(1);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
		} else {
			wHtShipping.setSpgQtyOns(WCC.ZERO);
			//[#2943] HTソースCDスキャン時インクリメント制御対応 小数を扱う商品の場合スキャン時に数量画面へ遷移 2018.01.05 fujiwara Start
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);
			//数量入力画面表示
			ShippingNoPackingQtyResource.load(this, util);
			return;
			//[#2943] HTソースCDスキャン時インクリメント制御対応 小数を扱う商品の場合スキャン時に数量画面へ遷移 2018.01.05 fujiwara End
		}
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.25 fujiwara End

		//出庫検品残数の抽出
		selectLogic.selectSpgQtyRemain(wHtShipping);

		//商品単位に完了した場合は表示内容をクリア
		if (WCC.isZero(wHtShipping.getSpgQtyRemain())) {
			wHtShipping.setJanCd("");
			wHtShipping.setProductId(null);
			wHtShipping.setProductCd("");
			wHtShipping.setProductNm("");
			wHtShipping.setMProduct(new MProduct());
			wHtShipping.setSpgQtyRemain(null);
		} else {
			//完了していない場合はJ/商のみクリア
			wHtShipping.setJanCd("");
		}

		/* 2015/06/12 INOUE ADD START 色・音の適用 */
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
		/* 2015/06/12 INOUE ADD END */

		//検品未完件数抽出
		if (selectLogic.selectSpgQtyRemainCount(wHtShipping) == 0) {
			//出荷検品未完件数=0時
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

			ShippingNoPackingBoxResource.load(this, util, "ShippingNoPackingJanCd/load", checkLogic, selectLogic, shippingLogic, clearLogic, commonLogic);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			return;
			// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End
		}

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//JAN入力画面を表示
		ShippingNoPackingJanCdResource.display(this, util);
	}
	//2015/04/27 KAI ADD END

}
