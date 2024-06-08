package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionJanDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * 予定無し入荷(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionJan")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionJan/display")
public class ReceiveNoPlanInspectionJanResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionCheckLogic checkLogic;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;

	/**
	 * 予定無し入荷(JAN入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		dto.setJanProdCd("");
		wHtReceiveNoPlanInspecDto.setProductId(null);
		wHtReceiveNoPlanInspecDto.setProductNm("");
		wHtReceiveNoPlanInspecDto.setProductCd("");
		wHtReceiveNoPlanInspecDto.setJanCd("");
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 予定無し入荷(JAN入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionJanHT");
		// オプションボタン１設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionList/load?backUrl=ReceiveNoPlanInspectionJan/display")
				.itemCd("option1")
				.build());
		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionJan/complete")
				.itemCd("option2")
				.build());
		// 非表示ボタン設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionJan/send").build());

		//キャンセル確認画面へ遷移
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionCancel/load").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionJan/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//予定無し入荷(JAN)画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionJan.jsp", ses);
	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、数量入力画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionJanDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();
		dto.setJanProdCd(bean.getProductCd());

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


		// ==== 入力したJAN/商品コードが商品マスタに存在するかチェックを行う ====
		MProduct mProduct = new MProduct();
		mProduct.setClientId(wHtReceiveNoPlanInspecDto.getClientId());
		mProduct.setJanCd(bean.getProductCd());

		//[#1787] 入数の不正の件対応 2017.05.25 nayzaw Start
		Long centerId = wHtReceiveNoPlanInspecDto.getCenterId();
		// J/商存在チェック
		List<MProduct> lstMProduct = checkLogic.checkJanProdCd(mProduct,centerId);
		if (lstMProduct.size()==0){
			wHtReceiveNoPlanInspecDto.setProductId(null);
			wHtReceiveNoPlanInspecDto.setProductNm("");
			wHtReceiveNoPlanInspecDto.setProductCd("");
			wHtReceiveNoPlanInspecDto.setJanCd("");
			return;
		}

		mProduct = lstMProduct.get(0);
		wHtReceiveNoPlanInspecDto.setProductId(mProduct.getProductId());
		wHtReceiveNoPlanInspecDto.setProductNm(mProduct.getProductNm());
		wHtReceiveNoPlanInspecDto.setProductCd(mProduct.getProductCd());
		wHtReceiveNoPlanInspecDto.setJanCd(mProduct.getJanCd());
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
		dto.setJanProdCd(bean.getProductCd());

		//[#1787] 入数の不正の件対応 2017.05.25 nayzaw End

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProductDto  mProductDto = mProductDtoMapper.mappingToDto(mProduct);
		wHtReceiveNoPlanInspecDto.setMProduct(mProductDto);
		wHtReceiveNoPlanInspecDto.setLot("");
		wHtReceiveNoPlanInspecDto.setLimitDt("");
		wHtReceiveNoPlanInspecDto.setStoreNo("");
		dto.setStoreLabelNo("");

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(数量)画面を表示
		ReceiveNoPlanInspectionQtyResource.load(this, util);
	}

	/**
	 * 完了時にコールされるメソッドです。<br>
	 * 伝票No単位の完了確認画面に遷移します。
	 * @param bean JAN入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete(@BeanParam ReceiveNoPlanInspectionJanDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();
		dto.setJanProdCd(bean.getProductCd());

		// 伝票Noの入力チェックを行う
		if (CU.isNullOrEmpty(wHtReceiveNoPlanInspecDto.getHtWorkNo())) {
			// 伝票Noは空白場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_NO_PLAN_NOT_INPUT);
			return;
		}

		// JAN/商品の入力チェックを行う
		if (!CU.isNullOrEmpty(bean.getProductCd())) {
			// JAN/商品は空白以外場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_COMPLETE_NO_INPUT);
			return;
		}

		// 伝票No単位の総検品済数の取得
		WHtReceiveNoPlanInsp wReceive = new WHtReceiveNoPlanInsp();
		wReceive.setCenterId(wHtReceiveNoPlanInspecDto.getCenterId());
		wReceive.setClientId(wHtReceiveNoPlanInspecDto.getClientId());
		wReceive.setHtWorkNo(wHtReceiveNoPlanInspecDto.getHtWorkNo());
		wReceive.setMacAddress(dto.getMacAddress());
		dto.setStoreNumSum(selectLogic.selectStoreNum(wReceive));

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//伝票No単位の完了確認画面を表示
		ReceiveNoPlanInspectionWorkNoResource.load(this, util);
	}
}
