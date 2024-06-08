package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * パラピッキング開始Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingStart")
@HandyErrorReturnPath(returnURL = "ShippingPickingStart/start")
public class ShippingPickingStartResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ParamLogic paramLogic;

	/**
	 * 開始時にコールされるメソッドです。<br>
	 * 入庫No管理フラグで遷移先画面を制御します。
	 * @throws Exception
	 */
	@GET
	@Path("/start")
	public void start() throws Exception {

		HttpServletRequest req = this.getHttpServletRequest();
		HttpSession ses = req.getSession();

		//ログイン情報取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////荷主情報の取得
		//MClient mClient = new MClient();
		//mClient.setClientCd(loginInfo.getClientCd());
		//mClient = clientLogic.getUkEntity(mClient);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//パラメータマスタ情報の取得
		MClientCenter mClientCenter = new MClientCenter();
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//mClientCenter.setClientId(mClient.getClientId());
		//mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter.setClientId(loginInfo.getClientId());
		mClientCenter.setCenterId(loginInfo.getCenterId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]
		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		//入庫No.管理フラグの内容で遷移先を変更
		String storeNoFlg = mParam.getStoreNoFlg();
		if (storeNoFlg.equalsIgnoreCase("0")) {
			//商品ピッキングの作業No入力画面を表示
			ShippingPickingProductWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);
		} else {
			//入庫No.ピッキングの作業No入力画面を表示
			ShippingPickingWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);
		}
	}
}
