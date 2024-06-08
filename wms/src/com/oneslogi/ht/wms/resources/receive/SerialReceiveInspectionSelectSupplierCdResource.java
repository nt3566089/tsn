package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionSupplierSelectDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionSelectSupplierCdLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * 入荷登録確認画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionSelectSupplierCd")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionSelectSupplierCd/display")
public class SerialReceiveInspectionSelectSupplierCdResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialReceiveInspectionSelectSupplierCdLogic selectSupplierCdLogic;
	@Inject
	private CustomerLogic customerLogic;

	/**
	 * 入荷登録確認画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util,selectSupplierCdLogic,backUrl);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util,SerialReceiveInspectionSelectSupplierCdLogic selectSupplierCdLogic,String backUrl) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		MClient mClient = new MClient();
		mClient.setClientId(dto.getClientId());

		List<MCustomer> mCustomerList = selectSupplierCdLogic.select(mClient);
		dto.setLstSupplier(mCustomerList);

		dto.setBackUrl(backUrl);
		ses.setAttribute("SerialReceiveInspectionDto", dto);
		ses.setAttribute("SerialReceiveInspectionWorkNoDto", dto);
		//自画面表示
		display(resource, util,selectSupplierCdLogic);
	}

	/**
	 * 入荷登録確認画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util,selectSupplierCdLogic);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util,SerialReceiveInspectionSelectSupplierCdLogic selectSupplierCdLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH Start
        //画面を設定
		resource.initScreen("SerialReceiveInspectionSelectSupplierCdHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionSelectSupplierCd.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、 予定無し入荷(仕入先)画面に遷移します。
	 * @param bean 仕入先選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam SerialReceiveInspectionSupplierSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		dto.setSupplierCd(bean.getSupplier());

		MCustomer mCustomer = new MCustomer();
		mCustomer.setClientId(dto.getClientId());
		mCustomer.setCustomerCd(dto.getSupplierCd());
		mCustomer = customerLogic.getVendorCustomerByClientCd(mCustomer, new ErrorStatus());
		if (mCustomer == null) {
			return;
		}
		dto.setSupplierNm(mCustomer.getCustomerNm());

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//シリアル登出(No)画面を表示
		SerialReceiveInspectionWorkNoResource.display(this, util);
	}
}
// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
