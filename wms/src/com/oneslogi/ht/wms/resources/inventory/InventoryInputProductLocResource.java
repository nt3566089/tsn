package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductLocDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CustomerLogic;
//import com.oneslogi.ht.wms.dto.shipping.InventoryLocDto;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 商品棚卸入力(ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductLoc")
@HandyErrorReturnPath(returnURL = "InventoryInputProductLoc/display")
public class InventoryInputProductLocResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private InventoryInputProductLogic inventoryLogic;
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * 商品棚卸入力(ロケ入力)画面初期化を行います。
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
		wHtInventoryInputProdDto.setLocCd("");
		wHtInventoryInputProdDto.setLocId(null);
		wHtInventoryInputProdDto.setLocNm("");
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(ロケ入力)画面表示を行います。
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

		//画面ヘッダ設定
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD Start
		resource.initScreen("InventoryInputProductLocHT");
		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("InventoryInputProductLoc/send").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("InventoryInputProductLoc/back").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("InventoryInputProductLoc/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD END
		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductLoc.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(JAN)画面に遷移します。
	 * @param bean ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("InventoryInputProductHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam InventoryInputProductLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		wHtInventoryInputProdDto.setLocCd(bean.getLoc());

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

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLoc());
		mLocation.setCenterId(dto.data.wHtInventoryInputProdDto.getCenterId());

		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.getLoc());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		//2015/05/14 [HT1.5-CT1-007] WEBHT情報はIDに変更する YOKOSUKA [S]
		//ロケの紐付く倉庫を取得し設定する
		MZoneCB cbZone = mZoneBhv.newMyConditionBean();
		cbZone.query().setZoneId_Equal(mLocation.getZoneId());
		MZone mZone = mZoneBhv.selectEntityWithDeletedCheck(cbZone);

		wHtInventoryInputProdDto.setWarehouseId(mZone.getWarehouseId());
		//2015/05/14 [HT1.5-CT1-007] WEBHT情報はIDに変更する YOKOSUKA [E]
		wHtInventoryInputProdDto.setLocId(mLocation.getLocationId());
		wHtInventoryInputProdDto.setLocNm(mLocation.getLocationNm());
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);
		//JAN入力画面を表示
		InventoryInputProductJanCdResource.load(this, util);

	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * 商品棚卸入力(預託・在庫区分入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//通信制御データ
		util.clearHtComCtl(ses);

		//商品棚卸入力(預託・在庫区分入力)画面へ戻る
		InventoryInputProductKbnResource.display(this, util, customerLogic, stockTypeLogic, userLogic, inventoryLogic);
	}

}
