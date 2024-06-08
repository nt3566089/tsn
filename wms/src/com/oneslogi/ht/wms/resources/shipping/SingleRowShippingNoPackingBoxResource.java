package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WSglRowShipInspBDto;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingBoxDto;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.BoxLogic;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic;

/**
 * 単行出荷検品(箱登録)画面Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPackingBox")
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPackingBox/load")
public class SingleRowShippingNoPackingBoxResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	// ===== 使用ロジック  =====

	@Inject
	private BoxLogic mBoxLogic;
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
		load(this, util, singleRowShippingInspectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, SingleRowShippingInspectLogic singleRowShippingInspectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");

		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();
		WSglRowShipInspH wSglRowShipInspH = wSglRowShipInspHDtoMapper.mappingToEntity(dto.getWSglRowShipInspHDto());
		WSglRowShipInspB inspectData = new WSglRowShipInspBDtoMapper().mappingToEntity(dto.getInspData());

		dto.setWSglRowShipInspHDto(wSglRowShipInspHDtoMapper.mappingToDto(wSglRowShipInspH));

		if (CU.isNullOrEmpty(dto.getDefaultBox().getBoxCd())) {

			// デフォルト荷材取得
			MBox defaultBox = singleRowShippingInspectLogic.selectDefaultBox(wSglRowShipInspH, inspectData);
			if (defaultBox != null) {
				// デフォルト荷材あり

				dto.setDefaultBox(new MBoxDtoMapper().mappingToDto(defaultBox));
			}
		}

		ses.setAttribute("BoxMessage", util.getMessage(WmsMessageConst.HANDY_INPUT_BOX_CD_INFO));
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
		resource.initScreen("SingleRowShippingNoPackingBoxHT");

		// 送信ボタンの設定
		resource.setSendButton(ButtonInfo.builder().url("SingleRowShippingNoPackingBox/send").itemCd("send").keyType(KEY_TYPE_ENTER).build());
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SingleRowShippingNoPackingBox/send").build());

		// 画面表示
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SingleRowShippingNoPackingBox.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。
	 * @param bean 荷材CD入力画面情報を保持するDTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SingleRowShippingNoPackingBoxDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		dto.getDefaultBox().setBoxCd(bean.getBoxCd());

		if (bean.isValidateErr()) {
			return;
		}

		// Entity変換
		WSglRowShipInspHDto wSglRowShipInspHDto = dto.getWSglRowShipInspHDto();
		WSglRowShipInspBDto wSglRowShipInspBDto = dto.getInspData();

		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();
		WSglRowShipInspH wSglRowShipInspH = wSglRowShipInspHDtoMapper.mappingToEntity(wSglRowShipInspHDto);
		WSglRowShipInspB wSglRowShipInspB = new WSglRowShipInspBDtoMapper().mappingToEntity(wSglRowShipInspBDto);

		// 荷材マスタ存在チェック
		MBox mBox = new MBox();
		mBox.setCenterId(wSglRowShipInspH.getCenterId());
		mBox.setBoxCd(bean.getBoxCd());
		MBox selectMBoxEntity = mBoxLogic.getUkEntity(mBox);

		if (selectMBoxEntity == null) {
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.BOX_NOT_FOUND_ERROR);
			return;
		}

		// 荷材更新処理
		wSglRowShipInspH.setBoxId(selectMBoxEntity.getBoxId());
		singleRowShippingInspectLogic.updateBoxId(wSglRowShipInspH, new ErrorStatus());
		if (getErrorManager().size() > 0) {
			return;
		}

		// 伝票残数
		long slipQtyRemain = wSglRowShipInspB.getWSglRowShipInspH().getSlipNum() - CU.nullToZero(wSglRowShipInspB.getWSglRowShipInspH().getInspectedSlipNum());
		dto.setSlipQtyRemain(slipQtyRemain);
		// ログインユーザの検品済数を設定
		dto.setUserInspectedQty(0L);

		dto.setWSglRowShipInspHDto(wSglRowShipInspHDtoMapper.mappingToDto(wSglRowShipInspH));
		dto.setInspData(new WSglRowShipInspBDtoMapper().mappingToDto(wSglRowShipInspB));

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// 単行出荷検品(ソースCD)画面表示
		SingleRowShippingNoPackingJanCdResource.load(this, util, singleRowShippingInspectLogic);
	}
}
