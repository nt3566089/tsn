package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingInstNumSelectDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic;

/**
 * 単行出荷検品(作業指示数選択)画面Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPackingInstNumSelect")
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPackingInstNumSelect/load")
public class SingleRowShippingNoPackingInstNumSelectResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	// ===== 使用ロジック  =====

	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;

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

		//自画面表示
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

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");

		// 画面設定
		resource.initScreen("SingleRowShippingNoPackingInstNumSelectHT");

		// 戻るボタンの設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());

		// 画面表示
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SingleRowShippingNoPackingInstNumSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 単行出荷検品(ソースCD)画面に遷移します
	 * @param bean 作業指示数選択画面情報を保持するDTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam SingleRowShippingNoPackingInstNumSelectDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		// Entity変換
		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();
		WSglRowShipInspH search = wSglRowShipInspHDtoMapper.mappingToEntity(dto.getSearchDto());
		search.setWorkInstNum(bean.getInstNum());
		// 検品対象データ取得
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

	}

}
