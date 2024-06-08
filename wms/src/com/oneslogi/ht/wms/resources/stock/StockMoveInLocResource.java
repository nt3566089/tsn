package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.stock.StockMoveInDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveInLocDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 在庫移動入庫(先ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveInLoc")
@HandyErrorReturnPath(returnURL = "StockMoveInLoc/display")
public class StockMoveInLocResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private MZoneBhv mZoneBhv;
	/**
	 * 在庫移動入庫(ロケ入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");

		if (CU.nullToZero(dto.getMoveInstHId()) != 0) {
			if (!dto.getMoveInstHId().equals(dto.getTMoveInstBDto().getTMoveInstH().getMoveInstHId())) {
				dto.setLocationCd("");
			}
		} else {
			dto.setMoveInstHId(dto.getTMoveInstBDto().getTMoveInstH().getMoveInstHId());
		}

		//戻るURLの設定
		dto.setBackUrl(backUrl);

		ses.setAttribute("StockMoveInDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫移動入庫(先ロケ入力)画面表示を行います。
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

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("StockMoveInLocHT");

		//非表示の設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveInLoc/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveInLoc/send").itemCd("send").build());


		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveInLoc.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動入庫(送信確認)画面に遷移します。
	 * @param bean ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam StockMoveInLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		dto.setLocationCd(bean.getLocationCd());
		// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.16 sja End

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLocationCd());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//mLocation.setCenterId(dto.getTMoveInstBDto().getMWarehouse().getCenterId());
		mLocation.setCenterId(dto.getTMoveInstBDto().getTMoveInstH().getCenterId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}

		dto.setLocationNm(mLocation.getLocationNm());
		dto.setLocationId(mLocation.getLocationId());

		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
		//ZONE情報の取得
		MZoneCB mZoneCB = mZoneBhv.newMyConditionBean();
		mZoneCB.setupSelect_MWarehouse();
		mZoneCB.query().setZoneId_Equal(mLocation.getZoneId());
		List<MZone> lstMZone = mZoneBhv.selectList(mZoneCB);

		if (lstMZone.size() > 0) {
			dto.setWarehouseId(lstMZone.get(0).getWarehouseId());
			dto.setWarehouseCd(lstMZone.get(0).getMWarehouse().getWarehouseCd());
		} else {
			return;
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */

		ses.setAttribute("StockMoveInDto", dto);

		//送信確認画面を表示
		StockMoveInSendResource.load(this, util);

		return;
	}
}
