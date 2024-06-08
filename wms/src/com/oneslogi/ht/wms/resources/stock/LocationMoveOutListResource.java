package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.LocationMoveDto;
import com.oneslogi.ht.wms.logic.stock.LocationMoveSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ロケ変更(一覧)画面Resourceクラスです。
 *
 */
@Path("/handy/LocationMoveOutList")
@HandyErrorReturnPath(returnURL = "LocationMoveOutList/display")
public class LocationMoveOutListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private LocationMoveSelectLogic selectLogic;

	/**
	 * ロケ変更(一覧)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic, userLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			LocationMoveSelectLogic selectLogic, UserLogic userLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		// [#197][2.1.0-CT-033] 排他チェック不正を修正(不要なコード削除) 2016.11.15 kawana

		//荷主情報の取得
		MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		MClient mClient = mClientDtoMapper.mappingToEntity(dto.getTStockDto().getMClient());
		mClient.setClientId(dto.getTStockDto().getClientId());

		// [#197][2.1.0-CT-033] 排他チェック不正を修正(不要なコード削除) 2016.11.15 kawana

		//ロケーション情報の取得
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationDtoMapper.mappingToEntity(dto.getTStockDto().getMLocation());

		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana Start
		//一覧画面表示項目を取得
		List<TStock> lstTStock = selectLogic.selectStock(mClient, mLocation, bUser);
		// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana End

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		TStockDtoMapper tStockDtoMapper = new TStockDtoMapper();
		dto.setLstTStockDto(tStockDtoMapper.mappingToDtoList(lstTStock));
		ses.setAttribute("LocationMoveDto", dto);

		//自画面表示
		display(resource, util);
	}


	/**
	 * ロケ変更(一覧)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng Start

		//画面ヘッダ設定
		resource.initScreen("LocationMoveOutListHT");

		//フッタボタン（左）設定
		resource.setOptionButton1(ButtonInfo.builder().url("LocationMoveOutList/prev").itemCd("prev").type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_NUM1).build());
		//フッタボタン（右）設定
		resource.setOptionButton2(ButtonInfo.builder().url("LocationMoveOutList/next").itemCd("next").type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_NUM3).build());
	    //フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("LocationMoveOutLoc/display").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("LocationMoveOutList/send").itemCd("send").build());

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("LocationMoveOutList/send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng End

		//ロケ変更(一覧)画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/LocationMoveOutList.jsp",ses);
	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/prev")
	public void prev() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstTStockDto().size() - 1);
		}

		ses.setAttribute("LocationMoveDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 次時にコールされるメソッドです。<br>
	 * 次情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/next")
	public void next() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");

		if (dto.getPageIndex() < dto.getLstTStockDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("LocationMoveDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * ロケ変更(入庫ロケ)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");
		TStockDto selectDto = dto.getLstTStockDto().get(dto.getPageIndex());
		dto.setTStockDto(selectDto);

		ses.setAttribute("LocationMoveDto", dto);

		//ロケ変更(入庫ロケ)画面を表示
		LocationMoveInLocResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
