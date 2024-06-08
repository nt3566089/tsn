package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 期限日確認画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionSendLimitDt")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionSendLimitDt/display")
public class ReceiveNoPlanInspectionSendLimitDtResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	/**
	 * 入荷検品(期限日確認画面)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		//自画面表示
		display(resource, util);
	}

	/**
	 * 入荷検品(期限日確認画面)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionSendLimitDtHT",VIEW_TEMPLATE_WARN);
		resource.setHeaderColor("Yellow");

		// 戻るボタンの設定
		resource.setReturnButton(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionSendLimitDt/no")
				.itemCd("return")
				.build());
		// 送信ボタンの設定
		resource.setSendButton(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionSendLimitDt/yes")
				.itemCd("send")
				.build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionSendLimitDt.jsp", ses);

	}

	/**
	 * いいえ時にコールされるメソッドです。<br>
	 * 入力チェックを行い、画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/no")
	public void no() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getwHtReceiveNoPlanInspDto().getMProduct());

		if (mProduct.isLotManagFlg$1()) {
			// ロット・期限日入力画面を表示
			ReceiveNoPlanInspectionLotLimitDtResource.display(this, util);
		} else {
			// 期限日入力画面を表示
			ReceiveNoPlanInspectionLimitDtResource.display(this, util);
		}

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/yes")
	public void yes() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		// 画面で選択した内容に応じて遷移先画面を変更する
		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

		if (mParam.isStoreNoFlg$0()) {
			// ロケ入力画面へ遷移する
			ReceiveNoPlanInspectionLocResource.load(this, util);
		}

		if (dto.getLabelKbn().equals("1")) {
			// ロケ入力画面へ遷移する
			ReceiveNoPlanInspectionLocResource.load(this, util);
		}

		if (dto.getLabelKbn().equals("2")) {
			// 汎用ラベルNO入力確認画面へ遷移する
			ReceiveNoPlanInspectionLabelInputResource.load(this, util);
		}

	}

}
