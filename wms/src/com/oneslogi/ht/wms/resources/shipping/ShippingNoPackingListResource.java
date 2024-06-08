package com.oneslogi.ht.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingInsertLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingUpdateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(登録内容参照)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingList")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingList/display")
public class ShippingNoPackingListResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingNoPackingSelectLogic selectLogic;
	@Inject
	private ShippingNoPackingInsertLogic insertLogic;
	@Inject
	private ShippingNoPackingUpdateLogic updateLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * バラ出荷検品(登録内容参照)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ShippingNoPackingSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//一覧画面表示項目を取得
		List<WHtShipping> lstWHtShipping = selectLogic.selectList(wHtShipping);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		dto.setLstWHtShippingDto(wHtShippingDtoMapper.mappingToDtoList(lstWHtShipping));
		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * バラ出荷検品(登録内容参照)画面表示を行います。
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
		resource.initScreen("ShippingNoPackingListHT");
		// オプションボタン１を設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("ShippingNoPackingList/interrupt")
				.itemCd("option1").type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_OPTION1).build());
		// オプションボタン2を設定
		resource.setOptionButton2(
				ButtonInfo.builder()
				.url("ShippingNoPackingList/delete")
				.itemCd("option2").type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_OPTION2).build());
        //フッタボタン（左）設定
		resource.setReturnButton(
				ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("ShippingNoPackingList/prev")
				.itemCd("prev").build(), ButtonInfo.builder().url("ShippingNoPackingList/next").itemCd("next").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD END
		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingList.jsp",ses);
	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/prev")
	public void prev() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstWHtShippingDto().size() - 1);
		}

		ses.setAttribute("ShippingNoPackingDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 次時にコールされるメソッドです。<br>
	 * 次情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/next")
	public void next() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");

		if (dto.getPageIndex() < dto.getLstWHtShippingDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ShippingNoPackingDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 中断時にコールされるメソッドです。<br>
	 * 中断確認画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/interrupt")
	public void interrupt() throws Exception {
		//中断確認画面を表示
		displayInterruptDialog();
	}

	// [EC-CT1-182] 削除実行時に確認メッセージを表示するよう修正 2015.04.02 watanabe Start
	/**
	 * 削除時にコールされるメソッドです。<br>
	 * 削除確認画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/delete")
	public void delete() throws Exception {
		//中断確認画面を表示
		displayDeleteDialog();
	}
	// [EC-CT1-182] 削除実行時に確認メッセージを表示するよう修正 2015.04.02 watanabe End

	/**
	 * <h2>中断確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayInterruptDialog() throws Exception {
		/* 2015/05/18 INOUE UPDATE START フッタ共通化対応 */
		// 中断確認画面を表示する共通関数ができたので、そちらを使用する。
		/* 2015/06/12 INOUE UPDATE START 色・音の適用 */
		// 共通関数の定義変更に対応
		displayCancelDialog(
				// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start
				"ShippingNoPacking",
				// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
				"ShippingNoPackingList/display",
				"ShippingNoPackingList/onInterruptOk"
			);
		/* 2015/06/12 INOUE UPDATE END */
		/* 2015/05/18 INOUE END */
	}

	// [EC-CT1-182] 削除実行時に確認メッセージを表示するよう修正 2015.04.02 watanabe Start
	/**
	 * <h2>削除確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayDeleteDialog() throws Exception {

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		/* 2015/05/18 INOUE UPDATE START フッタ共通化対応 */

		// 削除確認画面を表示する共通関数ができたので、そちらを使用する。
		displayDeleteDialog(
				"ShippingNoPackingList/display",
				"ShippingNoPackingList/deleteOK"
			);
		/* 2015/05/18 INOUE END */

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}
	// [EC-CT1-182] 削除実行時に確認メッセージを表示するよう修正 2015.04.02 watanabe End

	/**
	 * 中断確認画面はい時にコールされるメソッドです。<br>
	 * 中断確認画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onInterruptOk")
	// [#3676][Ver3.0] WAS連携対応 2018.03.15 kawana Start
	@WorkLogEnd("ShippingNoPackingHT")
	// [#3676][Ver3.0] WAS連携対応 2018.03.15 kawana End
	public void onInterruptOk() throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//中断処理を行う
		insertLogic.insertWShippingInterrupt(wHtShipping);
//		insertLogic.insertWHtShippingInterrupt(wHtShipping);

		//機能単位セッションをクリア
		ShippingNoPackingResource.removeSession(this, util, shippingLogic);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 削除時にコールされるメソッドです。<br>
	 * 登録内容参照画面に遷移します。
	 * @throws Exception
	 */
	@GET
	// [EC-CT1-182] 削除実行時に確認メッセージを表示するよう修正 2015.04.02 watanabe Start
	@Path("/deleteOK")
	public void deleteOK() throws Exception {
	// [EC-CT1-182] 削除実行時に確認メッセージを表示するよう修正 2015.04.02 watanabe Start

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();
		WHtShippingDto deleteDto = dto.getLstWHtShippingDto().get(dto.getPageIndex());

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);
		WHtShipping entityDel = wHtShippingDtoMapper.mappingToEntity(deleteDto);

		//削除処理を行う
		updateLogic.deleteWHtShipping(wHtShipping, entityDel);
		if (getErrorManager().size() > 0) {
			return;
		}
		// [ON推-品向-564] 削除時に数量に変化があるため、再度データのとり直しを行う 2015.03.26 watanabe Start
		// [EC-CT1-184] 同一製品であるかどうかをチェックして足しこみを行う 2015.04.02 watanabe Start
		if(wHtShippingDto.getProductCd()!=null){
			if(wHtShippingDto.getProductCd().equals(deleteDto.getProductCd())){
				BigDecimal adQty = WCC.add(wHtShippingDto.getSpgQtyRemain(), deleteDto.getSpgQtyOns());
				wHtShipping.setSpgQtyRemain(adQty);
			}
		}
		// [EC-CT1-184] 同一製品であるかどうかをチェックして足しこみを行う 2015.04.02 watanabe End
		// [ON推-品向-564] 削除時に数量に変化があるため、再度データのとり直しを行う 2015.03.26 watanabe End

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//画面初期化を行い
		load(dto.getBackUrl());
	}


}
