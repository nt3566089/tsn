package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionSupplierSelectDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 仕入先選択画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionSupplierSelect")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionSupplierSelect/display")
public class ReceiveNoPlanInspectionSupplierSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * 仕入先選択画面初期化を行います。
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

		MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		MClient mClient = new MClient();
		mClient.setClientId(dto.getwHtReceiveNoPlanInspDto().getClientId());

		//一覧画面表示項目を取得
		List<MCustomer> lstMCustomer = selectLogic.selectSupplierList(mClientDtoMapper.mappingToDto(mClient));
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setBackUrl(backUrl);
		dto.setMCustomerBySupplierDto(mCustomerDtoMapper.mappingToDtoList(lstMCustomer));
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 仕入先選択画面表示を行います。
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
		resource.initScreen("ReceiveNoPlanInspectionSupplierSelectHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//仕入先選択画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionSupplierSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、 予定無し入荷(仕入先)画面に遷移します。
	 * @param bean 仕入先選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam ReceiveNoPlanInspectionSupplierSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		dto.setSupplier(bean.getSupplier());

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(仕入先)画面を表示
		ReceiveNoPlanInspectionSupplierResource.display(this, util, customerLogic, userLogic, selectLogic);

	}

}
