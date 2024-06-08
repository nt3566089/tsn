package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductLotDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;
import com.oneslogi.wms.logic.common.LotLogic;

/**
 * 商品棚卸入力(ロット入力)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductLot")
@HandyErrorReturnPath(returnURL = "InventoryInputProductLot/display")
public class InventoryInputProductLotResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LotLimitCheckLogic lotLimitCheckLogic;
	@Inject
	private LotLogic lotLogic;

	/**
	 * 商品棚卸入力(ロット入力)画面初期化を行います。
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
		wHtInventoryInputProdDto.setLotId(null);
		wHtInventoryInputProdDto.setLot("");
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(ロット入力)画面表示を行います。
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
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD Start
		resource.initScreen("InventoryInputProductLotHT");
		// 非表示ボタンの設定
		resource.setHideButton(
				ButtonInfo.builder().url("InventoryInputProductLot/send").build());
		// オプションボタン１の設定
		resource.setOptionButton1(
				ButtonInfo.builder().url("InventoryInputProductList/load?backUrl=InventoryInputProductLot/display")
				.itemCd("option1").build());
        //フッタボタン（左）設定
		resource.setReturnButton(
				ButtonInfo.builder().url("InventoryInputProductJanCd/display")
				.itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder().url("InventoryInputProductLot/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD END
		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductLot.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(数量入力)画面に遷移します。
	 * @param bean 商品棚卸入力(ロット入力)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam InventoryInputProductLotDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		wHtInventoryInputProdDto.setLot(bean.getLot());

		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
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

		//ロット・期限日チェック
		MClient mClient = new MClient();
		MProduct mProduct = new MProduct();
		TLot tLot = new TLot();

		mClient.setClientId(dto.getwHtInventoryInputProdDto().getClientId());
		mProduct.setProductCd(dto.getwHtInventoryInputProdDto().getProductCd());
		tLot.setLot(bean.getLot());

		if (!lotLimitCheckLogic.check(mClient, mProduct, tLot, WCC.ONE, new ErrorStatus())){
			return;
		}

		//ロットID取得
		tLot.setProductId(wHtInventoryInputProdDto.getProductId());
		tLot = lotLogic.getUkEntity(tLot);
		if (tLot != null) {
			wHtInventoryInputProdDto.setLotId(tLot.getLotId());
		}

		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		//数量入力画面を表示
		InventoryInputProductQtyResource.load(this, util);

	}

}
