package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingBoxDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(箱登録)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingBox")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingBox/display")
public class ShippingNoPackingBoxResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingNoPackingCheckLogic checkLogic;
	@Inject
	private ShippingNoPackingSelectLogic selectLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * バラ出荷検品(箱登録)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
		//自画面初期化
		//load(this, util, backUrl, checkLogic, selectLogic);
		load(this, util, backUrl, checkLogic, selectLogic,shippingLogic,clearLogic, commonLogic);
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
	}

	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
	//	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
	//  ShippingNoPackingCheckLogic checkLogic, ShippingNoPackingSelectLogic selectLogic) throws Exception {
	public static void load(
			HandyResourceBase resource,
			HandyCommonUtil util,
			String backUrl,
			ShippingNoPackingCheckLogic checkLogic,
			ShippingNoPackingSelectLogic selectLogic,
			ShippingLogic shippingLogic,
			ShippingNoPackingClearLogic clearLogic,
			ShippingCommonLogic commonLogic
			) throws Exception {

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//出庫検品箱登録チェック
		if (checkLogic.selectNoBoxCount(wHtShipping) == 0) {
			//データはすべて検品済です。
			resource.sendErrorScreen(util.getMessage(WmsMessageConst.HANDY_SHIPPING_PACKING_COMPLETE), "", backUrl);
			return;
		} else {
			if (selectLogic.selectSpgQtyOnsCount(wHtShipping) == 0) {
				//未検品データが存在します。
				resource.sendErrorScreen(util.getMessage(WmsMessageConst.HANDY_SHIPPING_PACKING_NOT_COMPLETE), "", backUrl);
				return;
			}
		}

		//個口の取得
		selectLogic.selectPiece(wHtShipping);

		wHtShipping.setBoxId(null);
		wHtShipping.setBoxCd("");
		wHtShipping.setBoxNm("");
		wHtShipping.setMBox(new MBox());

		dto.setBackUrl(backUrl);

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
		wHtShipping.setBoxId(dto.getDefaultBox().getBoxId());
		wHtShipping.setBoxCd(dto.getDefaultBox().getBoxCd());
		wHtShipping.setBoxNm(dto.getDefaultBox().getBoxNm());
		wHtShipping.setMBox(new MBoxDtoMapper().mappingToEntity(dto.getDefaultBox()));
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (commonLogic.isShippingPackingNo(wHtShipping.getCenterId(), wHtShipping.getPickingWorkNo())) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// 出荷梱包No.で検品する場合、PieceNo=1を設定
			wHtShipping.setPieceNo(1l);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
		//自画面表示
//		display(resource, util);
		// 荷材選択スキップ 0：スキップしない、1：スキップする
		if(dto.getIsBoxSelectSkip().equals("1")){
			// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod Start
			if (dto.getDefaultBox().getBoxId() == null) {
				//自画面表示
				display(resource, util);
			} else {
				ShippingNoPackingBoxDto bean = new ShippingNoPackingBoxDto();
				bean.setBoxCd(dto.getDefaultBox().getBoxCd());
				send(resource, util, bean, checkLogic, selectLogic, shippingLogic, clearLogic, commonLogic);
			}
			// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod End

		}else{
			//自画面表示
			display(resource, util);
		}
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End

	}

	/**
	 * バラ出荷検品(箱登録)画面表示を行います。
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

		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Add Start
		// パラメータマスタ.荷材選択スキップ=[0:スキップしない]、かつ、デフォルト荷材設定あり(荷材取得可能)の場合、デフォルト荷材.荷材CDを箱登録画面.荷材CDの初期値とする
		if (dto.getIsBoxSelectSkip().equals("0")) {
			if (dto.getDefaultBox().getBoxId() != null) {
				ShippingNoPackingBoxDto boxDto = new ShippingNoPackingBoxDto();
				boxDto.setBoxCd(dto.getDefaultBox().getBoxCd());
				ses.setAttribute("ShippingNoPackingBoxDto", boxDto);
			}
		}
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Add End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25  ライ MOD START
		//画面ヘッダ設定
		resource.initScreen("ShippingNoPackingBoxHT");
		// 非表示ボタンの設定
		resource.setHideButton(
				ButtonInfo.builder().url("ShippingNoPackingBox/send").build());
		//フッタボタン（左）設定
		resource.setReturnButton(
				ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder().url("ShippingNoPackingBox/send").itemCd("send").keyType(KEY_TYPE_ENTER).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25  ライ MOD END
		//箱登録画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingBox.jsp",ses);
	}

	/**
	 * 決定時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(送信確認)画面に遷移します。
	 * @param bean 箱登録画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ShippingNoPackingBoxDto bean) throws Exception {

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
		send(this, util, bean, checkLogic, selectLogic, shippingLogic, clearLogic, commonLogic);

//		//出庫作業Noが出庫ヘッダにの存在チェック
//		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic)) {
//			return;
//		}
//
//		HttpServletRequest req = getHttpServletRequest();
//		HttpSession ses = req.getSession();
//
//		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
//		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();
//
//		wHtShippingDto.setBoxCd(bean.getBoxCd());
//
//		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
//
//		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
//		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);
//
//		//箱存在チェック
//		if (!checkLogic.checkBoxCd(wHtShipping)) {
//			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
//			ses.setAttribute("ShippingNoPackingDto", dto);
//
//			return;
//		}
//
//		/* 2015/06/12 INOUE ADD START 色・音の適用 */
//		// 以下のselectLogic.selectAllBoxの中では個口の更新を行っているので、次の画面は更新完了であると見做す必要がある。
//		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
//		/* 2015/06/12 INOUE ADD END */
//
//		//箱未登録全ﾃﾞｰﾀ抽出
//		if (selectLogic.selectAllBox(wHtShipping)) {
//			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
//			ses.setAttribute("ShippingNoPackingDto", dto);
//
//			//検品完了の場合、送信確認画面へ遷移する
//			ShippingNoPackingSendResource.load(this, util);
//
//			return;
//		} else {
//			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
//			ses.setAttribute("ShippingNoPackingDto", dto);
//
//			//検品未完了の場合、JAN入力画面へ遷移する
//			ShippingNoPackingJanCdResource.load(this, util);
//
//			return;
//		}
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End

	}
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
	public static void send(HandyResourceBase resource, HandyCommonUtil util,ShippingNoPackingBoxDto bean,
			ShippingNoPackingCheckLogic checkLogic, ShippingNoPackingSelectLogic selectLogic,
			ShippingLogic shippingLogic,ShippingNoPackingClearLogic clearLogic,ShippingCommonLogic commonLogic) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(resource, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		wHtShippingDto.setBoxCd(bean.getBoxCd());

		// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			resource.sendErrorScreen(valMsg, "", resource.getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.14 sja End

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//箱存在チェック
		//[Ver3.0][#2859] 荷材ID未設定の時の処理を変更 2017.12.01 miyabe start
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod Start
		// 荷材ID未設定の場合、荷材マスタから取得
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod End
		// [Ver3.0][#4477] 荷材マスタに存在しない荷材CDの場合エラーを返す(if文削除) 2018.04.27 matsumoto Start
		if (!checkLogic.checkBoxCd(wHtShipping)) {
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			return;
		}
		// [Ver3.0][#4477] 荷材マスタに存在しない荷材CDの場合エラーを返す(if文削除) 2018.04.27 matsumoto End

		//[Ver3.0][#2859] 荷材ID未設定の時の処理を変更 2017.12.01 miyabe end

		// 以下のselectLogic.selectAllBoxの中では個口の更新を行っているので、次の画面は更新完了であると見做す必要がある。
		resource.setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

		//箱未登録全ﾃﾞｰﾀ抽出
		if (selectLogic.selectAllBox(wHtShipping)) {
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			//検品完了の場合、送信確認画面へ遷移する
			ShippingNoPackingSendResource.load(resource, util);

			return;
		} else {
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			//検品未完了の場合、JAN入力画面へ遷移する
			ShippingNoPackingJanCdResource.load(resource, util);

			return;
		}

	}
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
}
