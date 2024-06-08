package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDepositSelectDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 預託選択画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionDepositSelect")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionDepositSelect/display")
public class ReceiveNoPlanInspectionDepositSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * 預託選択画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		MCustomerDtoMapper mCustomerDtoMapper = new MCustomerDtoMapper();

		MClient mClient = new MClient();
		mClient.setClientId(dto.getwHtReceiveNoPlanInspDto().getClientId());

		//一覧画面表示項目を取得
		List<MCustomer> lstMCustomer = selectLogic.selectDepositList(mClient);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setBackUrl(backUrl);
		dto.setMCustomerByDepositDto(mCustomerDtoMapper.mappingToDtoList(lstMCustomer));
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 預託選択画面表示を行います。
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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionDepositSelectHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//預託選択画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionDepositSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、 予定無し入荷(区分)画面に遷移します。
	 * @param bean 預託選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam ReceiveNoPlanInspectionDepositSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		dto.setDeposit(bean.getDeposit());

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(区分)画面を表示
		ReceiveNoPlanInspectionKbnResource.display(this, util, customerLogic, userLogic, selectLogic);

	}

}
