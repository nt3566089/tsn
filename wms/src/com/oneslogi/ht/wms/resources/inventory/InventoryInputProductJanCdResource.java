package com.oneslogi.ht.wms.resources.inventory;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductJanCdDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductJanCdChkLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.LotLogic;

/**
 * 商品棚卸入力(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductJanCd")
@HandyErrorReturnPath(returnURL = "InventoryInputProductJanCd/display")
public class InventoryInputProductJanCdResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private InventoryInputProductJanCdChkLogic janCdChkLogic;
	// [#6070][v2.2] HT棚卸入力でロットIDが設定されない問題を修正 2019.02.25 kawana Start
	@Inject
	private LotLogic lotLogic;
	// [#6070][v2.2] HT棚卸入力でロットIDが設定されない問題を修正 2019.02.25 kawana End

	/**
	 * 商品棚卸入力(JAN入力)画面初期化を行います。
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

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();
		dto.setJanProdCd("");
		wHtInventoryInputProdDto.setProductId(null);
		wHtInventoryInputProdDto.setProductNm("");
		wHtInventoryInputProdDto.setProductCd("");
		wHtInventoryInputProdDto.setJanCd("");
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(JAN入力)画面表示を行います。
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
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.29  ライ MOD Start
		resource.initScreen("InventoryInputProductJanCdHT");
		//フッタボタン（非表示）設定
		resource.setHideButton(
				ButtonInfo.builder()
				.url("InventoryInputProductJanCd/send").build());
		//フッタボタン（左上）設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("InventoryInputProductList/load?backUrl=InventoryInputProductJanCd/display")
				.itemCd("option1").build());

		//フッタボタン（左）設定
		resource.setReturnButton(
				ButtonInfo.builder()
				.url("InventoryInputProductLoc/display")
				.itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder()
				.url("InventoryInputProductJanCd/send")
				.itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.29  ライ MOD END
		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductJanCd.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(ロット、期限日)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam InventoryInputProductJanCdDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		dto.setJanProdCd(bean.getJanProdCd());
		ses.setAttribute("InventoryInputProductDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.22 sja End

		//商品存在チェック
		MProduct mProduct = new MProduct();
		mProduct.setClientId(wHtInventoryInputProdDto.getClientId());
		mProduct.setJanCd(bean.getJanProdCd());
		List<MProduct> lstMProduct = janCdChkLogic.checkJanProdCd(mProduct);
		if (lstMProduct.size()==0){
			wHtInventoryInputProdDto.setProductId(null);
			wHtInventoryInputProdDto.setProductNm("");
			wHtInventoryInputProdDto.setProductCd("");
			wHtInventoryInputProdDto.setJanCd("");
			return;
		}else{
			wHtInventoryInputProdDto.setProductId(lstMProduct.get(0).getProductId());
			wHtInventoryInputProdDto.setProductNm(lstMProduct.get(0).getProductNm());
			wHtInventoryInputProdDto.setProductCd(lstMProduct.get(0).getProductCd());
			wHtInventoryInputProdDto.setJanCd(lstMProduct.get(0).getJanCd());
		}

		dto.setJanProdCd(bean.getJanProdCd());
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);

		if(lstMProduct.get(0).isLimitDtManagFlg$1()&&lstMProduct.get(0).isLotManagFlg$1()){
			//ロット・期限日入力画面を表示
			dto.setLotLimitDt("1");
			ses.setAttribute("InventoryInputProductDto", dto);
			InventoryInputProductLotLimitDtResource.load(this, util);
			return;
		}

		if(lstMProduct.get(0).isLotManagFlg$1()){
			//ロット入力画面を表示
			dto.setLotLimitDt("2");
			ses.setAttribute("InventoryInputProductDto", dto);
			InventoryInputProductLotResource.load(this, util);
			return;
		}

		if(lstMProduct.get(0).isLimitDtManagFlg$1()){
			//期限日入力画面を表示
			dto.setLotLimitDt("3");
			ses.setAttribute("InventoryInputProductDto", dto);
			InventoryInputProductLimitDtResource.load(this, util);
			return;
		}

		// [#6070][v2.2] HT棚卸入力でロットIDが設定されない問題を修正 2019.02.25 kawana Start
		// ロットID取得 (期限日、ロットなし)
		TLot lotC = new TLot();
		lotC.setProductId(wHtInventoryInputProdDto.getProductId());
		TLot tLot = lotLogic.getUkEntity(lotC);
		if (tLot != null) {
			wHtInventoryInputProdDto.setLotId(tLot.getLotId());
		}
		// [#6070][v2.2] HT棚卸入力でロットIDが設定されない問題を修正 2019.02.25 kawana End

		//数量入力画面を表示
		dto.setLotLimitDt("0");
		ses.setAttribute("InventoryInputProductDto", dto);
		InventoryInputProductQtyResource.load(this, util);
	}

}
