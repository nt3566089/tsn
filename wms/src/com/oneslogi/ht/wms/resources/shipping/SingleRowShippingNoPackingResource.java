package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WSglRowShipInspHDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.shipping.SingleRowShippingInspectLogic;

/**
 * 単行出荷検品再開Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPacking")
//[Ver3.1][#5540] 検品再開時にエラーが発生した場合出荷管理メニューへ遷移する 2018.11.01 matsumoto Start
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPacking/backSubMenu")
//[Ver3.1][#5540] 検品再開時にエラーが発生した場合出荷管理メニューへ遷移する 2018.11.01 matsumoto End
public class SingleRowShippingNoPackingResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private UserLogic userLogic;
	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、単行出荷検品(JAN入力)画面に遷移します。
	 * @param pickingWorkNo
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") long wSglRowShipInspHId) throws Exception {

		//機能単位セッションを初期化
		SingleRowShippingNoPackingResource.createSession(this, util, userLogic);

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		// Entity変換
		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");
		WSglRowShipInspHDtoMapper wSglRowShipInspHDtoMapper = new WSglRowShipInspHDtoMapper();
		WSglRowShipInspH searchDto = wSglRowShipInspHDtoMapper.mappingToEntity(dto.getSearchDto());

		// 検品中データ取得
		WSglRowShipInspB inspectData = singleRowShippingInspectLogic.selectWorkingData(searchDto, new ErrorStatus());
		//[Ver3.1][#5540] 検品再開時にエラーが発生した場合出荷管理メニューへ遷移する 2018.11.01 matsumoto Start
		if (getErrorManager().size() > 0) {
			return;
		}
		//[Ver3.1][#5540] 検品再開時にエラーが発生した場合出荷管理メニューへ遷移する 2018.11.01 matsumoto End

		// 検品中データが未存在
		if (inspectData == null) {

			// 次の検品データを取得
			inspectData = singleRowShippingInspectLogic.selectNextData(wSglRowShipInspHId, searchDto.getUserId(), new ErrorStatus());

			if (inspectData == null) {
				// 次の検品データが未存在

				// 機能単位セッションをクリア
				SingleRowShippingNoPackingResource.removeSession(this, util);
				// メニュー表示
				displaySubMenu(MENU_GROUP_CD_SHIPPING);
				return;
			}
		}

		WSglRowShipInspH inspectDataH = inspectData.getWSglRowShipInspH();
		inspectDataH.setUserId(searchDto.getUserId());

		if (!CU.isNullOrEmpty(inspectData.getPickingWorkMessage())) {
			// 出庫作業メッセージが存在する場合
			dto.setPickingWorkMessage(inspectData.getPickingWorkMessage());
			dto.setPickingWorkNo(inspectData.getTPickingH().getPickingWorkNo());
		}

		// 伝票残数
		long slipQtyRemain = inspectDataH.getSlipNum() - CU.nullToZero(inspectDataH.getInspectedSlipNum());
		dto.setSlipQtyRemain(slipQtyRemain);
		// ログインユーザの検品済数を取得
		long inspectedNum = singleRowShippingInspectLogic.selectUserInspectedNum(inspectDataH, new ErrorStatus());
		dto.setUserInspectedQty(inspectedNum);

		searchDto.setWorkInstNum(inspectDataH.getWorkInstNum());
		searchDto.setProductId(inspectDataH.getProductId());
		searchDto.setPickingGroupNo(inspectDataH.getPickingGroupNo());
		searchDto.setTempNo(inspectDataH.getTempNo());

		dto.setSearchDto(wSglRowShipInspHDtoMapper.mappingToDto(searchDto));
		dto.setWSglRowShipInspHDto(wSglRowShipInspHDtoMapper.mappingToDto(inspectDataH));
		dto.setInspData(new WSglRowShipInspBDtoMapper().mappingToDto(inspectData));

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		// 単行出荷検品(ソースCD)画面を表示
		SingleRowShippingNoPackingJanCdResource.load(this, util, singleRowShippingInspectLogic);
	}

	// [Ver3.1][#5540] 検品再開時にエラーが発生した場合出荷管理メニューへ遷移する 2018.11.01 matsumoto Start
	/**
	 * <h2>エラーが返された場合出荷管理メニューへ戻ります。</h2>
	 * @throws Exception
	 */
	@GET
	@Path("/backSubMenu")
	public void backSubMenu() throws Exception {
		// 機能単位セッションをクリア
		SingleRowShippingNoPackingResource.removeSession(this, util);
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
		return;
	}
	// [Ver3.1][#5540] 検品再開時にエラーが発生した場合出荷管理メニューへ遷移する 2018.11.01 matsumoto End

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, UserLogic userLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		// ユーザID取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		BUser loginUser = userLogic.getUkEntity(bUser);

		// 単行出荷検品情報の初期化
		SingleRowShippingNoPackingDto dto = new SingleRowShippingNoPackingDto();
		WSglRowShipInspHDto searchDto = dto.getSearchDto();

		searchDto.setCenterId(loginInfo.getCenterId());
		searchDto.setClientId(loginInfo.getClientId());
		searchDto.setUpdUser(loginInfo.getUserCd());
		searchDto.setUserId(loginUser.getUserId());

		// 単行出荷検品Dtoの初期化
		ses.setAttribute("SingleRowShippingNoPackingDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic          業務ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("SingleRowShippingNoPackingDto");
	}

}
