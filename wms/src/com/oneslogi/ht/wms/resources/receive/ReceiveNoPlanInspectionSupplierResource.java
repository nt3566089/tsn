package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionSupplierDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 予定無し入荷(仕入先)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionSupplier")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionSupplier/display")
public class ReceiveNoPlanInspectionSupplierResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;

	/**
	 * 予定無し入荷(仕入先)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, customerLogic, userLogic, selectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CustomerLogic customerLogic
			, UserLogic userLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		dto.setSupplier("");
		dto.getwHtReceiveNoPlanInspDto().setClientReceiveNo("");
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util, customerLogic, userLogic, selectLogic);
	}

	/**
	 * 予定無し入荷(仕入先)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util, customerLogic, userLogic, selectLogic);
	}
	public static void display(HandyResourceBase resource, HandyCommonUtil util, CustomerLogic customerLogic, UserLogic userLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionSupplierHT");
		//非表示の設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionSupplier/send").build());

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		//フッタボタン（左）設定
	    resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionKbn/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionSupplier/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//仕入先名称取得
		if(!CU.isNullOrEmpty(dto.getSupplier())){
			MCustomer mCustomer = new MCustomer();
			mCustomer.setCustomerCd(dto.getSupplier());
			mCustomer.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

			mCustomer = customerLogic.getUkEntity(mCustomer);
			wHtReceiveNoPlanInspecDto.setSupplierNm("");
			if (mCustomer != null) {
				if(mCustomer.isVendorFlg$1()){
					wHtReceiveNoPlanInspecDto.setSupplierId(mCustomer.getCustomerId());
					wHtReceiveNoPlanInspecDto.setSupplierNm(mCustomer.getCustomerNm());
				}
			}
		}else{
			wHtReceiveNoPlanInspecDto.setSupplierId(null);
			wHtReceiveNoPlanInspecDto.setSupplierNm("");
		}

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(仕入先)画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionSupplier.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、予定無し入荷(JAN入力)画面に遷移します。
	 * @param bean 予定無し入荷(仕入先)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("ReceiveNoPlanInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam ReceiveNoPlanInspectionSupplierDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		dto.setSupplier(bean.getSupplier());
	    wHtReceiveNoPlanInspecDto.setClientReceiveNo(bean.getClientReceiveNo());

		// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.09 sja End

		if (!CU.isNullOrEmpty(dto.getSupplier())) {
			//仕入先存在チェック
			MCustomer mCustomer = new MCustomer();
			mCustomer.setCustomerCd(dto.getSupplier());
			mCustomer.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

			mCustomer = customerLogic.getUkEntity(mCustomer, new ErrorStatus());
			if (mCustomer == null) {
				wHtReceiveNoPlanInspecDto.setSupplierNm("");
				wHtReceiveNoPlanInspecDto.setSupplierCd("");
				wHtReceiveNoPlanInspecDto.setSupplierId(null);
				dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
				ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
				return;
			}
			wHtReceiveNoPlanInspecDto.setSupplierNm(mCustomer.getCustomerNm());
			wHtReceiveNoPlanInspecDto.setSupplierCd(mCustomer.getCustomerCd());
			wHtReceiveNoPlanInspecDto.setSupplierId(mCustomer.getCustomerId());

			if(!mCustomer.isVendorFlg$1()){
				wHtReceiveNoPlanInspecDto.setSupplierNm("");
				wHtReceiveNoPlanInspecDto.setSupplierCd("");
				wHtReceiveNoPlanInspecDto.setSupplierId(null);
				dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
				ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_VENDOR_FLAG_NOT_FOUND_ERROR);
				return;
			}
		}
		wHtReceiveNoPlanInspecDto.setHtWorkNo("");
		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		// [ON推-品向-1004] 継続であっても、別入荷予定ヘッダを作成しを修正 2015.11.12 By SJA Start
		TReceivePlanHDto tReceivePlanHDto = new TReceivePlanHDto();
		dto.setTReceivePlanHDto(tReceivePlanHDto);
		// [ON推-品向-1004] 継続であっても、別入荷予定ヘッダを作成しを修正 2015.11.12 By SJA End

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.getClientReceiveNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA Start
//		//通信制御データ作成
//		String reopenKey = dto.getLabelKbn();
//		reopenKey = reopenKey + "," + CU.nullToStr(wHtReceiveNoPlanInspecDto.getHtWorkNo());
//		reopenKey = reopenKey + "," + CU.nullToStr(wHtReceiveNoPlanInspecDto.getClientReceiveNo());
//		reopenKey = reopenKey + "," + dto.getDeposit();
//		reopenKey = reopenKey + "," + dto.getProcessType();
//		reopenKey = reopenKey + "," + dto.getStockType();
//		reopenKey = reopenKey + "," + dto.getSupplier();
//		util.setHtComCtl(ses, "ReceiveNoPlanInspection", reopenKey);
		// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA End

		//予定無し入荷(JAN)画面を表示
		ReceiveNoPlanInspectionJanResource.load(this, util);

	}

	/**
	 * 仕入先押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、仕入先選択入力画面に遷移します。
	 * @param bean 予定無し入荷(仕入先)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/supplier")
	public void supplier(@BeanParam ReceiveNoPlanInspectionSupplierDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//仕入先入力画面を表示
		ReceiveNoPlanInspectionSupplierSelectResource.load(this, util, "ReceiveNoPlanInspectionSupplier/display", selectLogic);

	}

}
