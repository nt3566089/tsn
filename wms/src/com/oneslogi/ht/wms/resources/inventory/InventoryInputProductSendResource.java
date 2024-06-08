package com.oneslogi.ht.wms.resources.inventory;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
//import com.oneslogi.ht.wms.dto.shipping.InventorySendDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductNumUpdateLogic;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductWkInsertLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.logic.common.ClientCenterLogic;

/**
 * 商品棚卸入力(送信確認)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductSend")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSend/display")
public class InventoryInputProductSendResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private InventoryInputProductWkInsertLogic inventoryWkInsertLogic;
	@Inject
	private InventoryInputProductNumUpdateLogic inventoryNumUpdateLogic;

	/**
	 * 商品棚卸入力(送信確認)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(送信確認)画面表示を行います。
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
		resource.initScreen("InventoryInputProductSendHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("InventoryInputProductQty/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("InventoryInputProductSend/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD END
		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSend.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(ロケ入力)画面画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("InventoryInputProductHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();
		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(wHtInventoryInputProdDto.getClientId());
		mClientCenter.setCenterId(wHtInventoryInputProdDto.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// システム管理日付の取得
		//String sysDt = CommonUtil.dateToString(CommonUtil.stringToDate(mClientCenter.getSystemDt()));

		//棚卸ヘッダ取得処理
		TInventoryHCB tInventoryHCB = tInventoryHBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2018.1.2 REN Start
		long shapeId = util.getPieceShapeId(wHtInventoryInputProdDto.getProductId());
		// [Ver3.0] unit of measure対応 2018.1.2 REN End

		//[HT1.5-CT1-039] 2015/06/26 sja-soft 棚卸ヘッダの棚卸日条件を削除する del-s
		//tInventoryHCB.query().setInventoryDt_Equal(sysDt);
		//[HT1.5-CT1-039] 2015/06/26 sja-soft 棚卸ヘッダの棚卸日条件を削除する  del-e
		tInventoryHCB.query().setClientId_Equal(wHtInventoryInputProdDto.getClientId());
		tInventoryHCB.query().setCenterId_Equal(wHtInventoryInputProdDto.getCenterId());
		//[HT1.5-CT1-039] 2015/06/26 sja-soft 棚卸ヘッダの棚卸日降順を追加する add-s
		tInventoryHCB.query().addOrderBy_InventoryDt_Desc();
		//[HT1.5-CT1-039] 2015/06/26 sja-soft 棚卸ヘッダの棚卸日降順を追加する add-e

		List<TInventoryH> lstTInventoryH = tInventoryHBhv.selectList(tInventoryHCB);
		if (lstTInventoryH.size()==0){
			//棚卸ヘッダ無しはエラーとする
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_NO_STOCK_COUNT);
			return;
		}else{

			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ヘッダIDを追加 2015/06/26 KAI ADD START
			wHtInventoryInputProdDto.setInventoryHId(lstTInventoryH.get(0).getInventoryHId());
			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ヘッダIDを追加 2015/06/26 KAI ADD END

			if(inventoryNumUpdateLogic.checkInventoryAdjust(lstTInventoryH.get(0), wHtInventoryInputProdDto)==false){
				//全部在庫調整済の場合、エラーを表示する
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_INVENTORY_INPUT_ERROR);
				InventoryInputProductQtyResource.display(this, util);
				return;
			}

			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			// 数量
			setWorkLogQty(dto.getQty());
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

			//棚卸数の更新
			//[HT1.5-CT1-041] 同時送信の排他チェックのために戻り値を追加 2015/06/26 KAI UPDATE START
			//inventoryNumUpdateLogic.updateInventoryNum(lstTInventoryH.get(0), wHtInventoryInputProdDto);
			// [Ver3.0] unit of measure対応 2018.1.2 REN Start
			wHtInventoryInputProdDto = inventoryNumUpdateLogic.updateInventoryNum(lstTInventoryH.get(0), wHtInventoryInputProdDto,shapeId);
			// [Ver3.0] unit of measure対応 2018.1.2 REN End
			//[HT1.5-CT1-041] 同時送信の排他チェックのために戻り値を追加 2015/06/26 KAI UPDATE END

			//商品棚卸WORKの登録
			inventoryWkInsertLogic.insertWHtInventoryInputProd(wHtInventoryInputProdDto);
		}
		wHtInventoryInputProdDto.setLocId(null);
		wHtInventoryInputProdDto.setLocCd("");
		wHtInventoryInputProdDto.setLocNm("");
		wHtInventoryInputProdDto.setJanCd("");
		wHtInventoryInputProdDto.setProductId(null);
		wHtInventoryInputProdDto.setProductCd("");
		wHtInventoryInputProdDto.setProductNm("");
		wHtInventoryInputProdDto.setLotId(null);
		wHtInventoryInputProdDto.setLot("");
		wHtInventoryInputProdDto.setLimitDt("");
		wHtInventoryInputProdDto.setQty(null);

		dto.setJanProdCd("");
		dto.setQty("");
		dto.setLimitDt("");
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		/* 2015/06/11 INOUE ADD START 色・音の適用 */
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
		/* 2015/06/11 INOUE ADD END */

		InventoryInputProductLocResource.load(this, util);
		return;
	}

}
