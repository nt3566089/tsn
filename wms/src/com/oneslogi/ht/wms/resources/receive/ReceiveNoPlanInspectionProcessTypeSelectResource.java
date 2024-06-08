package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.dtomapper.MProcessTypeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionProcessTypeSelectDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 処理区分選択画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionProcessTypeSelect")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionProcessTypeSelect/display")
public class ReceiveNoPlanInspectionProcessTypeSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private CustomerLogic customerLogic;
	//ON推-品向-1003 2015/11/12 NayZaw Start
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;
	//ON推-品向-1003 2015/11/12 NayZaw End
	/**
	 * 処理区分選択画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, userLogic, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl,
			UserLogic userLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		MProcessTypeDtoMapper mProcessTypeDtoMapper = new MProcessTypeDtoMapper();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//一覧画面表示項目を取得
		List<MProcessType> lstMProcessType = selectLogic.selectProcessList(bUser);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setBackUrl(backUrl);
		dto.setMProcessTypeDto(mProcessTypeDtoMapper.mappingToDtoList(lstMProcessType));
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 処理区分選択画面表示を行います。
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
		resource.initScreen("ReceiveNoPlanInspectionProcessTypeSelectHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//預託選択画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionProcessTypeSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、予定無し入荷(区分)画面に遷移します。
	 * @param bean 処理区分選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam ReceiveNoPlanInspectionProcessTypeSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		//ON推-品向-1003 2015/11/12 NayZaw Start
		if(!dto.getProcessType().equals(bean.getProcessType()))
		{
			MProcessTypeCB mProcessTypeCB = mProcessTypeBhv.newMyConditionBean();
			mProcessTypeCB.setupSelect_MStockType();
			mProcessTypeCB.query().setProcessTypeCd_Equal(bean.getProcessType());

			MProcessType mProcessType = mProcessTypeBhv.selectEntity(mProcessTypeCB);
			dto.setStockType(mProcessType.getMStockType().getStockTypeCd());
		}
		//ON推-品向-1003 2015/11/12 NayZaw End
		dto.setProcessType(bean.getProcessType());

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(区分)画面を表示
		ReceiveNoPlanInspectionKbnResource.display(this, util, customerLogic, userLogic, selectLogic);

	}

}
