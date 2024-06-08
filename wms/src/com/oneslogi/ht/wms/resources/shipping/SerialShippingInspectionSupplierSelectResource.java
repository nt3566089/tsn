package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionSupplierSelectDto;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;

/**
 * 納品先選択画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionSupplierSelect")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionSupplierSelect/display")
public class SerialShippingInspectionSupplierSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialShippingInspectionSelectLogic selectLogic;
	@Inject
	private CustomerLogic customerLogic;

	/**
	 * 納品先選択画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl, SerialShippingInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");

		MCustomerDtoMapper mCustomerDtoMapper = new MCustomerDtoMapper();

		MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		MClient mClient = new MClient();
		mClient.setClientId(dto.getwHtSerialShippingInspDto().getClientId());

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
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 納品先選択画面表示を行います。
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

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng Start

		//画面ヘッダ設定
		resource.initScreen("SerialShippingInspectionSupplierSelectHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//仕入先選択画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionSupplierSelect.jsp", ses);
	}

	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、 予定無し入荷(仕入先)画面に遷移します。
	 * @param bean 仕入先選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam SerialShippingInspectionSupplierSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		//納品先存在チェック
		MCustomer mCustomer = new MCustomer();
		mCustomer.setCustomerCd(bean.getSupplier());
		mCustomer.setClientId(wHtSerialShippingInspDto.getClientId());

		mCustomer = customerLogic.getDeliveryCustomer(mCustomer, new ErrorStatus());
		if (mCustomer != null) {
			dto.setSupplierCustomerCd(mCustomer.getCustomerCd());
			dto.setSupplierCustomerNm(mCustomer.getCustomerNm());
		}

		ses.setAttribute("SerialShippingInspectionDto", dto);

		//シリアル登出(No)画面を表示
		SerialShippingInspectionWorkNoResource.display(this, util);

	}
	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End

}
