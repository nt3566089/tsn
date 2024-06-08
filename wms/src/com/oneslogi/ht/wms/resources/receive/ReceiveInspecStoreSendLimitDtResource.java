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
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 期限日確認画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreSendLimitDt")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreSendLimitDt/display")
public class ReceiveInspecStoreSendLimitDtResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	/**
	 * 入荷検品格納(期限日確認画面)画面初期化を行います。
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
	 * 入荷検品格納(期限日確認画面)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreSendLimitDtHT",VIEW_TEMPLATE_WARN);
		// 戻るボタンの設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreSendLimitDt/no").itemCd("no").build());
		// 送信ボタンの設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreSendLimitDt/yes").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreSendLimitDt.jsp", ses);

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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());

		if (mProduct.isLotManagFlg$1()) {
			// ロット・期限日入力画面を表示
			ReceiveInspecStoreLotLimitDtResource.display(this, util);
		} else {
			// 期限日入力画面を表示
			ReceiveInspecStoreLimitDtResource.display(this, util);
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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		// 画面で選択した内容に応じて遷移先画面を変更する
		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

		if (mParam.isStoreNoFlg$0()) {
			//　ロケ入力画面を表示
			ReceiveInspecStoreLocationResource.load(this, util);
		}

		if (dto.getLabelKbn().equals("1")) {
			//　ロケ入力画面を表示
			ReceiveInspecStoreLocationResource.load(this, util);
		}

		if (dto.getLabelKbn().equals("2")) {
			// 汎用ラベルNO入力確認画面へ遷移する
			ReceiveInspecStoreLabelInputResource.load(this, util);
		}

	}

}
