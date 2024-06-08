package com.oneslogi.ht.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;

/**
 * 入荷検品(詳細)センタ移動ロット・期限日選択画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionCenterMoveLotLimitDt")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionCenterMoveLotLimitDt/display")
public class ReceiveInspectionCenterMoveLotLimitDtResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspectionSelectLogic selectLogic;
	@Inject
	private ReceiveInspectionCheckLogic checkLogic;
	@Inject
	private LotLimitCheckLogic lotLimitCheckLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;


	/**
	 * ロット・期限日入力画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, null, selectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ReceiveInspectionSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		// 商品情報の取得
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);
		List<TReceivePlanB> lstTReceivePlanB = selectLogic.selectReceivePlanListData(tReceivePlanH, mProduct, null);
		if(lstTReceivePlanB != null){
			TReceivePlanBDtoMapper tReceivePlanBDtoMapper = new TReceivePlanBDtoMapper();
			dto.setLstTReceivePlanBDto(tReceivePlanBDtoMapper.mappingToDtoList(lstTReceivePlanB));
			ses.setAttribute("ReceiveInspectionDto", dto);
		}

		//自画面表示
		display(resource, util);
	}

	/**
	 * ロット・期限日入力画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionCenterMoveLotLimitDtHT");

		// 非表示ボタンの設定
		resource.setHideButton(
				ButtonInfo.builder()
				.url("ReceiveInspectionCenterMoveLotLimitDt/send")
				.itemCd("return").build());

		//フッタボタン（左）設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("ReceiveInspectionCenterMoveLotLimitDt/prev")
				.itemCd("option1")
				.type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_NUM1).build());
		//フッタボタン（右）設定
		resource.setOptionButton2(
				ButtonInfo.builder()
				.url("ReceiveInspectionCenterMoveLotLimitDt/next")
				.itemCd("option2")
				.type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_NUM3).build());
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionQty/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspectionCenterMoveLotLimitDt/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionCenterMoveLotLimitDt.jsp", ses);

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

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstTReceivePlanBDto().size() - 1);
		}

		ses.setAttribute("ReceiveInspectionDto", dto);

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

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		ses.setAttribute("ReceiveInspectionDto", dto);

		if (dto.getPageIndex() < dto.getLstTReceivePlanBDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ReceiveInspectionDto", dto);

		//自画面表示
		display();

	}
	/**
	 *
	 * @param bean JAN入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();
		TReceivePlanBDto selectDto=dto.getLstTReceivePlanBDto().get(dto.getPageIndex());

		TReceivePlanBDtoMapper planBDtoMapper = new TReceivePlanBDtoMapper();
		TReceivePlanB selectPlanB=planBDtoMapper.mappingToEntity(selectDto);

		tReceivePlanBDto.setReceivePlanBId(selectDto.getReceivePlanBId());
		tReceivePlanBDto.setPlanLot(selectPlanB.getPlanLot());
		tReceivePlanBDto.setPlanLimitDt(selectPlanB.getPlanLimitDt());

		checkLogic.checkOverPlanBPlanNum(selectPlanB, dto);
		if (getErrorManager().size() > 0) {
			return;
		}

		//ロット・期限日チェック
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(tReceivePlanBDto.getMProduct());
		mProduct.setProductCd(tReceivePlanBDto.getMProduct().getProductCd());

		MClient mClient = new MClient();
		mClient.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());

		TLot tLot = new TLot();
		tLot.setLimitDt(selectPlanB.getPlanLimitDt());
		tLot.setLot(selectPlanB.getPlanLot());

		// ロット・期限日の入力チェックを行う
		if (!lotLimitCheckLogic.check(mClient, mProduct, tLot, WCC.ONE, new ErrorStatus())) {
			return;
		}

		dto.setTReceivePlanBDto(tReceivePlanBDto);
		ses.setAttribute("ReceiveInspectionDto", dto);

		// ==== 【JAN入力】画面で入力したJAN/商品コードの期限日逆転防止フラグが'1：管理する'の場合は入荷限界日のチェックを行う。 ====
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH planHeader = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		TReceivePlanBDtoMapper tTReceivePlanBDtoMapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();

		TReceivePlanB tReceivePlanB = tTReceivePlanBDtoMapper.mappingToEntity(dto.getTReceivePlanBDto());
		planBodyList.add(tReceivePlanB);

		TStoreRecordH recordHeader = new TStoreRecordH();

		recordHeader.setCenterId(tReceivePlanBDto.getTReceivePlanH().getCenterId());
		recordHeader.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());

		List<TStoreRecordB> recordBodyList = new ArrayList<TStoreRecordB>();
		TStoreRecordB tStoreRecordB = new TStoreRecordB();
		tStoreRecordB.setReceivePlanBId(tReceivePlanB.getReceivePlanBId());
		tStoreRecordB.setLimitDt(selectPlanB.getPlanLimitDt());
		tStoreRecordB.setLot(selectPlanB.getPlanLot());

		recordBodyList.add(tStoreRecordB);

		// JAN/商品コードの期限日逆転防止フラグが'1：管理する'の場合は入荷限界日のチェックを行う。
		stockUpdateCheckLogic.receiveLimitDateCheck(planHeader, planBodyList, recordHeader, recordBodyList, new ErrorStatus());

		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setPastStoreDtFlg(dto.getMParamDto().getPastStoreDtFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return;
		}
		if (getWarnManager().size() > 0) {
			// 期限日が入荷限界日を過ぎている場合
			if (mParam.getPastStoreDtFlg().equals("0")) {
				// パラメータマスタの過去日入力可フラグが'0：不可'の場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.INPUT_LIMIT_DATE_OVER_ERROR);
				return;
			} else {
				// 期限日確認画面へ遷移する
				getWarnManager().clear();
				ReceiveInspectionSendLimitDtResource.load(this, util);
				return;
			}
		}

		// 画面で選択した内容に応じて遷移先画面を変更する
		if (dto.getLabelKbn().equals("1")) {
			// 入庫No.管理フラグが'0：管理しない'、入庫ラベル使用を選択した場合
			// 検品確認画面へ遷移する
			ReceiveInspectionSendResource.load(this, util);
		} else {
			// 汎用ラベルNO入力確認画面へ遷移する
			ReceiveInspectionLabelInputResource.load(this, util);
		}
	}
}
