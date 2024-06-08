package com.oneslogi.ht.wms.resources.shipping;

import java.util.Set;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingProductDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic;

/**
 * 単行出荷検品(商品)画面Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPackingProduct")
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPackingProduct/load")
public class SingleRowShippingNoPackingProductResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private HandyScreenUtil screenUtil;

	// ===== 使用ロジック  =====

	@Inject
	private ProductLogic productLogic;
	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;
	// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End

	/**
	 * 画面初期化
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

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		dto.getSearchDto().setProductId(null);

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// 自画面表示
		display(resource, util);
	}

	/**
	 * 画面表示
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

		// 画面設定
		resource.initScreen("SingleRowShippingNoPackingProductHT");

		// 戻るボタンの設定
		resource.setReturnButton(ButtonInfo.builder().url("SingleRowShippingNoPackingNo/display").itemCd("return").build());
		// 送信ボタンの設定
		resource.setSendButton(ButtonInfo.builder().url("SingleRowShippingNoPackingProduct/send").itemCd("send").build());
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SingleRowShippingNoPackingProduct/send").build());

		// 画面表示
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SingleRowShippingNoPackingProduct.jsp", ses);
	}

	/**
	 * <h2>送信時にコールされるメソッドです</h2>
	 * 入力チェックを行い、作業指示数選択画面に遷移します。
	 * @param bean 商品CD入力画面情報を保持するDTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SingleRowShippingNoPackingProductDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		WSglRowShipInspHDto searchDto = dto.getSearchDto();

		searchDto.getMProduct().setProductCd(bean.getJanCd());

		// 入力チェック
		if (bean.isValidateErr()) {
			return;
		}

		//ログイン情報取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		// 商品存在チェック
		MProduct mProduct = new MProduct();
		mProduct.setProductCd(bean.getJanCd());
		mProduct.setJanCd(bean.getJanCd());
		mProduct.setClientId(loginInfo.getClientId());

		MProduct selectProduct = productLogic.getEntityProductCdOrJanCd(mProduct);

		// 検索結果が0件の場合
		if (selectProduct == null) {
			this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			return;
		}

		// Entity変換
		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();
		WSglRowShipInspH search = wSglRowShipInspHDtoMapper.mappingToEntity(searchDto);

		// 検品中データ検索
		WSglRowShipInspB workingData = singleRowShippingInspectLogic.selectWorkingData(search, new ErrorStatus());
		if (getErrorManager().size() > 0) {
			return;
		}

		search.setProductId(selectProduct.getProductId());

		if (workingData == null) {
			// 検品中データが未存在

			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start

			MParam param = paramLogic.getMParam(search.getClientId(), search.getCenterId());

			if (CU.nullToZero(param.getSglRowPicMaxInstNum()).longValue() == 1L) {
				// 上限指示数が1

				search.setWorkInstNum(1L);
				// 検品データ検索
				WSglRowShipInspB inspectData = singleRowShippingInspectLogic.selectInspectData(search, new ErrorStatus());
				if (getErrorManager().size() > 0) {
					return;
				}

				WSglRowShipInspH wSglRowShipInspH = inspectData.getWSglRowShipInspH();
				wSglRowShipInspH.setUserId(search.getUserId());

				// 納品先停止が含まれていないかチェック
				if (singleRowShippingInspectLogic.existsShippingStopCustomer(wSglRowShipInspH)) {
					dto.setShippingStopCustomerFlg(true);
				}

				// 通信制御データ作成
				util.setHtComCtl(ses, "SingleRowShippingNoPacking", String.valueOf(wSglRowShipInspH.getSglRowShipInspHId()));

				// 検索対象データをDTOに変換
				dto.setSearchDto(wSglRowShipInspHDtoMapper.mappingToDto(search));
				dto.setWSglRowShipInspHDto(wSglRowShipInspHDtoMapper.mappingToDto(wSglRowShipInspH));
				dto.setInspData(new WSglRowShipInspBDtoMapper().mappingToDto(inspectData));

				// 伝票残数
				long slipQtyRemain = wSglRowShipInspH.getSlipNum() - CU.nullToZero(wSglRowShipInspH.getInspectedSlipNum());
				dto.setSlipQtyRemain(slipQtyRemain);
				// ログインユーザの検品済数を取得
				long inspectedNum = singleRowShippingInspectLogic.selectUserInspectedNum(wSglRowShipInspH, new ErrorStatus());
				dto.setUserInspectedQty(inspectedNum);

				ses.setAttribute("SingleRowShippingNoPackingDto", dto);
				// 単行出荷検品(ソースCD)画面表示
				SingleRowShippingNoPackingJanCdResource.load(this, util, singleRowShippingInspectLogic);
				return;
			} else {
				// 上限指示数が1以外

				// 作業指示数を検索
				Set<Long> workInstNumSet = singleRowShippingInspectLogic.selectWorkInstNumSet(search, new ErrorStatus());
				if (getErrorManager().size() > 0) {
					return;
				}

				// 結果の設定
				dto.setInstNumList(workInstNumSet);

				//戻り先画面の設定
				dto.setBackUrl("SingleRowShippingNoPackingProduct/display");
				dto.setSearchDto(wSglRowShipInspHDtoMapper.mappingToDto(search));
				ses.setAttribute("SingleRowShippingNoPackingDto", dto);

				// 指示数選択画面表示
				SingleRowShippingNoPackingInstNumSelectResource.load(this, util);
				return;
			}

			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End
		}

		WSglRowShipInspH wSglRowShipInspH = workingData.getWSglRowShipInspH();
		if (!CU.isNotNullAndEquals(selectProduct.getProductId(), wSglRowShipInspH.getProductId())) {
			// 入力されたソースCDと検品中データのソースCDが不一致

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_PRODUCT_ERROR, wSglRowShipInspH.getMProduct().getProductCd());
			return;
		}

		if (!CU.isNullOrEmpty(workingData.getPickingWorkMessage())) {
			// 出庫作業メッセージが存在する場合

			dto.setPickingWorkMessage(workingData.getPickingWorkMessage());
			dto.setPickingWorkNo(workingData.getTPickingH().getPickingWorkNo());
		}

		// 伝票残数
		long slipQtyRemain = wSglRowShipInspH.getSlipNum().longValue() - CU.nullToZero(wSglRowShipInspH.getInspectedSlipNum());
		dto.setSlipQtyRemain(slipQtyRemain);

		// ログインユーザの検品済数を取得
		wSglRowShipInspH.setUserId(search.getUserId());
		long inspectedNum = singleRowShippingInspectLogic.selectUserInspectedNum(wSglRowShipInspH, new ErrorStatus());
		dto.setUserInspectedQty(inspectedNum);

		search.setWorkInstNum(wSglRowShipInspH.getWorkInstNum());
		dto.setSearchDto(wSglRowShipInspHDtoMapper.mappingToDto(search));
		dto.setWSglRowShipInspHDto(wSglRowShipInspHDtoMapper.mappingToDto(wSglRowShipInspH));
		dto.setInspData(new WSglRowShipInspBDtoMapper().mappingToDto(workingData));
		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// 通信制御データ作成
		util.setHtComCtl(ses, "SingleRowShippingNoPacking", String.valueOf(wSglRowShipInspH.getSglRowShipInspHId()));

		// 中断再開画面表示
		String programNm = screenUtil.itemNm("SingleRowShippingNoPackingHT", "programName");
		displayResumeDialog(programNm, "SingleRowShippingNoPackingJanCd/load");
	}
}
