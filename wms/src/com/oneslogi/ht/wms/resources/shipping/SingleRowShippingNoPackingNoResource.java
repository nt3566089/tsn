package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingNoDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 単行出荷検品(No)画面Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPackingNo")
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPackingNo/display")
public class SingleRowShippingNoPackingNoResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private UserLogic userLogic;

	/**
	 * 画面初期化
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {

		//自画面初期化
		load(this, util, userLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, UserLogic userLogic) throws Exception {

		//機能単位セッションを処理化
		SingleRowShippingNoPackingResource.createSession(resource, util, userLogic);

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
		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();

		WSglRowShipInspH search = wSglRowShipInspHDtoMapper.mappingToEntity(dto.getSearchDto());

		WSglRowShipInspHDto wSglRowShipInspHDto = wSglRowShipInspHDtoMapper.mappingToDto(search);
		dto.setSearchDto(wSglRowShipInspHDto);
		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// 画面設定
		resource.initScreen("SingleRowShippingNoPackingNoHT");

		// 戻るボタンの設定
		resource.setReturnButton(ButtonInfo.builder().url("SingleRowShippingNoPackingNo/back").itemCd("return").build());
		// 送信ボタンの設定
		resource.setSendButton(ButtonInfo.builder().url("SingleRowShippingNoPackingNo/send").itemCd("send").build());
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SingleRowShippingNoPackingNo/send").build());

		// 画面表示
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SingleRowShippingNoPackingNo.jsp", ses);
	}

	/**
	 * <h2>戻る処理。</h2>
	 * <pre>
	 * 戻るボタン押下時にコールされるメソッドです。
	 * メニュー画面に遷移します。
	 * </pre>
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// 機能単位セッションをクリア
		SingleRowShippingNoPackingResource.removeSession(this, util);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、単行出荷検品(商品)画面に遷移します。
	 * @param bean ピッキンググループNo.,仮置きNo.入力画面情報を保持するDTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SingleRowShippingNoPackingNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		WSglRowShipInspHDto searchDto = dto.getSearchDto();

		searchDto.setPickingGroupNo(bean.getPickingGroupNo());
		searchDto.setTempNo(bean.getTempNo());

		// 入力チェック
		if (bean.isValidateErr()) {

			return;
		}

		//戻り先画面の設定
		dto.setBackUrl("SingleRowShippingNoPackingNo/display");
		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// 単行出荷検品(商品)画面を表示
		SingleRowShippingNoPackingProductResource.load(this, util);
		return;
	}

}
