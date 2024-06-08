package com.oneslogi.ht.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspBDto;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingJanCdDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic.ResultInspected;

/**
 * 単行出荷検品(ｿｰｽCD)画面Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPackingJanCd")
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPackingJanCd/load")
public class SingleRowShippingNoPackingJanCdResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private UserLogic userLogic;
	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;
	@Inject
	private TPickingBBhv tPickingBBhv;

	/**
	 * 画面初期化
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {

		//自画面初期化
		load(this, util, singleRowShippingInspectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, SingleRowShippingInspectLogic singleRowShippingInspectLogic) throws Exception {

		//自画面表示
		display(resource, util, singleRowShippingInspectLogic);
	}

	/**
	 * 単行出荷検品(ソースCD)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util, singleRowShippingInspectLogic);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util, SingleRowShippingInspectLogic singleRowShippingInspectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");

		// 検品をリセット
		boolean inspectedFlg = dto.isInspectedFlg();
		dto.setInspectedFlg(false);
		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		if (dto.isShippingStopCustomerFlg()) {
			// 納品先の出荷停止あり

			resource.sendWarnScreen(util.getMessage(WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_EXISTS_SHIPPING_STOP_CUSTOMER_WARN), "",
					"SingleRowShippingNoPackingJanCd/backFromShippingStopCustomerWarn");
			return;
		}

		// 荷材IDがnull
		if (dto.getWSglRowShipInspHDto().getBoxId() == null) {

			// 単行出荷検品(箱登録)を表示
			SingleRowShippingNoPackingBoxResource.load(resource, util, singleRowShippingInspectLogic);
			return;
		}

		if (!CU.isNullOrEmpty(dto.getPickingWorkMessage())) {
			// 出庫作業メッセージ確認画面表示

			SingleRowShippingNoPackingWorkMessageResource.load(resource, util);
			return;
		}

		if (dto.isTagOutErrorFlg()) {
			// 帳票発行エラー警告表示

			resource.sendWarnScreenWithButtons(util.getMessage(WmsMessageConst.HANDY_TAG_OUTPUT_ERROR), "", "SingleRowShippingNoPackingNo/load",
					"SingleRowShippingNoPackingJanCd/backFromTagPrintError");
			return;
		}

		if (dto.isNoNextData()) {
			// 次の検品データなし

			// 通信制御データをクリア
			util.clearHtComCtl(ses);
			// 完了画面表示
			resource.displayOperationEndDialog(
					"SingleRowShippingNoPacking",
					"SingleRowShippingNoPackingJanCd/onEndDialogEnd",
					"SingleRowShippingNoPackingJanCd/onEndDialogContinue");
			return;
		}

		// 画面設定
		if (inspectedFlg) {
			// 検品音あり
			resource.initScreen("SingleRowShippingNoPackingJanCdHT", VIEW_TEMPLATE_COMPLETE);
		} else {
			// 通常
			resource.initScreen("SingleRowShippingNoPackingJanCdHT");
		}

		// 戻るボタンの設定
		resource.setReturnButton(ButtonInfo.builder().url("SingleRowShippingNoPackingProduct/load").itemCd("return").build());
		// 送信ボタンの設定
		resource.setSendButton(ButtonInfo.builder().url("SingleRowShippingNoPackingJanCd/send").itemCd("send").build());
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SingleRowShippingNoPackingJanCd/send").build());

		// 画面表示
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SingleRowShippingNoPackingJanCd.jsp", ses);
	}

	/**
	 * <h2>納品先停止警告画面から戻った際に呼ばれるメソッドです。</h2>
	 * <pre>
	 * セッションに存在する荷札発行エラーフラグをfalse:正常に戻します。
	 * </pre>
	 * @throws Exception
	 */
	@GET
	@Path("/backFromShippingStopCustomerWarn")
	public void backFromShippingStopCustomerWarn() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		dto.setShippingStopCustomerFlg(false);

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);
		SingleRowShippingNoPackingJanCdResource.display(this, util, singleRowShippingInspectLogic);
	}

	/**
	 * <h2>作業メッセージ表示画面で継続ボタン押下時に呼ばれるメソッドです。</h2>
	 * <pre>
	 * セッションに存在する出庫作業Noと出荷作業メッセージをnullにします。
	 * 伝票残数が0の場合完了画面を表示します。
	 * </pre>
	 * @throws Exception
	 */
	@GET
	@Path("/backFromWorkMessage")
	public void backFromWorkMessage() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		dto.setPickingWorkMessage(null);
		dto.setPickingWorkNo(null);

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);
		SingleRowShippingNoPackingJanCdResource.display(this, util, singleRowShippingInspectLogic);
	}

	/**
	 * <h2>荷札発行エラー画面から戻った際に呼ばれるメソッドです。</h2>
	 * <pre>
	 * セッションに存在する荷札発行エラーフラグをfalse:正常に戻します。
	 * </pre>
	 * @throws Exception
	 */
	@GET
	@Path("/backFromTagPrintError")
	public void backFromTagPrintError() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		dto.setTagOutErrorFlg(false);

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);
		SingleRowShippingNoPackingJanCdResource.display(this, util, singleRowShippingInspectLogic);

	}

	/**
	 * 送信時にコールされるメソッドです。
	 * @param bean janCD入力画面情報を保持するDTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	@WorkLogStartEnd("SingleRowShippingNoPackingHT")
	public void send(@BeanParam SingleRowShippingNoPackingJanCdDto bean) throws Exception {

		final String inputJanCd = bean.getJanCd();

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		WSglRowShipInspBDto inspectDataDto = dto.getInspData();
		inspectDataDto.setInputJanCd(inputJanCd);

		if (bean.isValidateErr()) {
			return;
		}

		// Entity変換
		WSglRowShipInspBDtoMapper wSglRowShipInspBDtoMapper = new WSglRowShipInspBDtoMapper();
		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();
		WSglRowShipInspH search = wSglRowShipInspHDtoMapper.mappingToEntity(dto.getSearchDto());
		WSglRowShipInspH wSglRowShipInspH = wSglRowShipInspHDtoMapper.mappingToEntity(dto.getWSglRowShipInspHDto());
		WSglRowShipInspB inspectData = wSglRowShipInspBDtoMapper.mappingToEntity(dto.getInspData());

		final long userId = search.getUserId();
		inspectData.setUserId(userId);

		// 検品処理
		ResultInspected result = singleRowShippingInspectLogic.inspected(wSglRowShipInspH, inspectData, new ErrorStatus());
		if (getErrorManager().size() > 0) {
			return;
		}

		// 対象データなし
		if (result.isNoData) {
			// 同一指示数の別データを検索する

			// 検索前に選択した荷材IDを退避
			long boxId = wSglRowShipInspH.getBoxId();

			// 検品対象データ取得
			inspectData = singleRowShippingInspectLogic.selectInspectData(search, new ErrorStatus());
			if (getErrorManager().size() > 0) {
				return;
			}

			wSglRowShipInspH = inspectData.getWSglRowShipInspH();

			// 納品先停止が含まれていないかチェック
			if (singleRowShippingInspectLogic.existsShippingStopCustomer(wSglRowShipInspH)) {
				dto.setShippingStopCustomerFlg(true);
			}

			if (wSglRowShipInspH.getBoxId() == null) {
				// 検索後のデータが荷材ID未設定

				wSglRowShipInspH.setBoxId(boxId);

				// 荷材ID設定
				singleRowShippingInspectLogic.updateBoxId(wSglRowShipInspH, new ErrorStatus());
				if (getErrorManager().size() > 0) {
					return;
				}
			}

			inspectData.setUserId(userId);
			inspectData.setInputJanCd(inputJanCd);

			// 検品処理
			result = singleRowShippingInspectLogic.inspected(wSglRowShipInspH, inspectData, new ErrorStatus());
			if (getErrorManager().size() > 0) {
				return;
			}

			if (result.isNoData) {
				// 新しいデータも更新された ⇒ エラー

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return;
			}
		}

		if (!CU.isNullOrEmpty(result.pickingWorkMessage)) {
			// 出庫作業メッセージあり
			dto.setPickingWorkMessage(result.pickingWorkMessage);
			dto.setPickingWorkNo(result.pickingWorkNo);

		}

		if (result.failedPrint) {
			// 帳票発行エラーあり
			dto.setTagOutErrorFlg(true);
		}

		if (result.isInspectedSlip) {
			// 1伝票の検品完了

			//トレース項目
			setWorkLogTraceItem(result.pickingWorkNo);
			// 数量項目
			setWorkLogQty(wSglRowShipInspH.getWorkInstNum());
		} else {

			// 作業ログの登録をスキップ
			skipWorkLogEnd();
		}

		if (result.remainSlipNum < 1) {
			// 残伝票なし

			dto.setNoNextData(true);
		} else {

			// 次の検品対象データを取得
			WSglRowShipInspB nextInspectData = singleRowShippingInspectLogic.selectNextData(wSglRowShipInspH.getSglRowShipInspHId(), userId, new ErrorStatus());
			if (0 < getErrorManager().size()) {
				return;
			}

			if (nextInspectData == null) {
				// 次の検品データなし

				dto.setNoNextData(true);
			}

			dto.setInspData(wSglRowShipInspBDtoMapper.mappingToDto(nextInspectData));
		}

		// 検品あり
		dto.setInspectedFlg(true);
		// ログインユーザの検品済数をインクリメント
		dto.setUserInspectedQty(dto.getUserInspectedQty() + 1L);
		// 伝票残数取得
		dto.setSlipQtyRemain(result.remainSlipNum);
		dto.setWSglRowShipInspHDto(wSglRowShipInspHDtoMapper.mappingToDto(wSglRowShipInspH));
		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// ソースCD入力画面表示
		SingleRowShippingNoPackingJanCdResource.display(this, util, singleRowShippingInspectLogic);
	}

	/**
	 * 完了確認画面終了時にコールされるメソッドです。<br>
	 * 入力チェックを行い、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// 機能単位セッションをクリア
		SingleRowShippingNoPackingResource.removeSession(this, util);
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * ピッキンググループNo入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		WSglRowShipInspH search = new WSglRowShipInspHDtoMapper().mappingToEntity(dto.getSearchDto());

		int remainCount = countRemainInspData(search);

		if (0 < remainCount) {
			// 同一ピッキンググループNo.に残伝票あり

			// 検索条件
			WSglRowShipInspHDto searchDto = dto.getSearchDto();

			//機能単位セッションを再作成
			SingleRowShippingNoPackingResource.removeSession(this, util);
			SingleRowShippingNoPackingResource.createSession(this, util, userLogic);

			// 入力されたピッキンググループNo.、仮置きNo.を設定
			dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
			dto.getSearchDto().setPickingGroupNo(searchDto.getPickingGroupNo());
			dto.getSearchDto().setTempNo(searchDto.getTempNo());
			ses.setAttribute("SingleRowShippingNoPackingDto", dto);

			// 単行出荷検品(商品)画面を表示
			SingleRowShippingNoPackingProductResource.load(this, util);
		} else {
			// 残伝票なし

			//機能単位セッションをクリア
			SingleRowShippingNoPackingResource.removeSession(this, util);

			//単行出荷検品(No)画面を表示
			SingleRowShippingNoPackingNoResource.load(this, util, userLogic);
			return;
		}
	}

	/**
	 * 未検品データ数を検索
	 */
	private int countRemainInspData(WSglRowShipInspH search) {

		List<CDef.PickingStatus> inPickingStatus = new ArrayList<CDef.PickingStatus>();
		inPickingStatus.add(CDef.PickingStatus.$25); // 出庫指示済
		inPickingStatus.add(CDef.PickingStatus.$35); // ピッキング済

		// 出庫ボディテーブル検索
		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.query().queryTPickingH().setCenterId_Equal(search.getCenterId());
		cb.query().queryTPickingH().setClientId_Equal(search.getClientId());
		cb.query().queryTPickingH().setPickingGroupNo_Equal(search.getPickingGroupNo());
		cb.query().setTempNo_Equal(search.getTempNo());
		cb.query().queryTPickingH().setPickingStatus_InScope_AsPickingStatus(inPickingStatus);

		return tPickingBBhv.selectCount(cb);
	}
}
