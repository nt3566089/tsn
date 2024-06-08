package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.WHtSerialShippingInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionJanCdDto;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(ｿｰｽCD)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionJanCd")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionJanCd/display")
public class SerialShippingInspectionJanCdResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialShippingInspectionCheckLogic checkLogic;
	@Inject
	private SerialShippingInspectionSelectLogic selectLogic;

	/**
	 * シリアル登出(ｿｰｽCD)画面初期化を行います。
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

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		if (CU.isNullOrEmpty(wHtSerialShippingInsp.getProductCd())) {
			wHtSerialShippingInsp.setJanCd("");
			wHtSerialShippingInsp.setProductCd("");
			wHtSerialShippingInsp.setProductNm("");
		}
		dto.setwHtSerialShippingInspDto(wHtSerialShippingInspDtoMapper.mappingToDto(wHtSerialShippingInsp));
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * シリアル登出(ｿｰｽCD)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng Start

		//画面ヘッダ設定
		resource.initScreen("SerialShippingInspectionJanCdHT");
		// 非表示ボタンを設定
		resource.setHideButton(ButtonInfo.builder().url("SerialShippingInspectionJanCd/send").build());
		// オプションボタン２を設定
		resource.setOptionButton2(ButtonInfo.builder().url("SerialShippingInspectionJanCd/complete").itemCd("end").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialShippingInspectionCancel/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("SerialShippingInspectionJanCd/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionJanCd.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(数量入力)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SerialShippingInspectionJanCdDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		wHtSerialShippingInspDto.setJanCd(bean.getJanCd());

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		//入力チェック
		if (bean.isValidateErr()) {
			return;
		}

		dto.setmProduct(null);

		// ==== 入力したJAN/商品コードが商品マスタデータに存在するかチェックを行う ====

		MProduct mProduct = new MProduct();
		mProduct.setClientId(wHtSerialShippingInsp.getClientId());
		mProduct.setJanCd(wHtSerialShippingInsp.getJanCd());
		List<MProduct> lstMProduct = checkLogic.checkJanProdCd(mProduct);
		if (lstMProduct.size() == 0) {
			return;
		}
		mProduct = lstMProduct.get(0);
		wHtSerialShippingInsp.setProductId(mProduct.getProductId());

		if (!CU.isNullOrEmpty(wHtSerialShippingInsp.getPickingWorkNo())) {

			// 商品出庫チェック
			if (!checkLogic.checkProduct(wHtSerialShippingInsp)) {
				return;
			}
		}

		wHtSerialShippingInsp.setJanCd(mProduct.getJanCd());
		wHtSerialShippingInsp.setProductCd(mProduct.getProductCd());
		wHtSerialShippingInsp.setProductNm(mProduct.getProductNm());
		dto.setmProduct(mProduct);

		// 出庫数超過チェック
		checkLogic.checkOrverQuantity(wHtSerialShippingInsp.getCenterId(), wHtSerialShippingInsp.getClientId(), wHtSerialShippingInsp.getPickingWorkNo(), wHtSerialShippingInsp.getProductId(),
				wHtSerialShippingInsp.getProductCd(),
				wHtSerialShippingInsp.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = selectLogic.selectList(wHtSerialShippingInsp);
		dto.setInspQty(lstWHtSerialShippingInsp.size());

		dto.setwHtSerialShippingInspDto(wHtSerialShippingInspDtoMapper.mappingToDto(wHtSerialShippingInsp));
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//シリアル登出(ｼﾘｱﾙ)入力画面を表示
		SerialShippingInspectionSerialNoResource.load(this, util);
	}

	/**
	 * 完了時にコールされるメソッドです。<br>
	 * 伝票No単位の完了確認画面に遷移します。
	 * @param bean JAN入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = selectLogic.selectList(wHtSerialShippingInsp);
		dto.setInspQty(lstWHtSerialShippingInsp.size());

		ses.setAttribute("SerialShippingInspectionDto", dto);
		SerialShippingInspectionSendResource.load(this, util);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
