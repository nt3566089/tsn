package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.LocationMoveDto;
import com.oneslogi.ht.wms.dto.stock.LocationMoveOutLocDto;
import com.oneslogi.ht.wms.logic.stock.LocationMoveCheckLogic;
import com.oneslogi.ht.wms.logic.stock.LocationMoveSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ロケ変更(出庫ロケ)画面Resourceクラスです。z
 *
 */
@Path("/handy/LocationMoveOutLoc")
@HandyErrorReturnPath(returnURL = "LocationMoveOutLoc/display")
public class LocationMoveOutLocResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private LocationMoveCheckLogic checkLogic;
	@Inject
	private LocationMoveSelectLogic selectLogic;

	/**
	 * ロケ変更(出庫ロケ)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {
		//機能単位セッションを処理化
		LocationMoveResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ロケ変更(出庫ロケ)画面表示を行います。
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
		resource.initScreen("LocationMoveOutLocHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("LocationMoveOutLoc/back").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("LocationMoveOutLoc/send").itemCd("send").build());

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("LocationMoveOutLoc/send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng End

		//ロケ変更(出庫ロケ)画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/LocationMoveOutLoc.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// ロケ変更(終了)画面の表示

		String dialogScreenCd = "LocationMoveCancelHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_CANCEL);

		// いいえボタン設定
		setReturnButton(ButtonInfo.builder().url("LocationMoveOutLoc/onCancelDialogNo").itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).build());
		// はいボタン設定
		setSendButton(ButtonInfo.builder().url("LocationMoveOutLoc/onCancelDialogYes").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * 終了確認画面終了時にコールされるメソッドです。<br>
	 * セッションをクリア、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogYes")
	public void onCancelDialogYes() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		LocationMoveResource.removeSession(this, util);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_STOCK);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 終了確認画面継続時にコールされるメソッドです。<br>
	 *  ロケ変更(出庫ロケ)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogNo")
	public void onCancelDialogNo() throws Exception {

		// ロケ変更(出庫ロケ)画面を表示
		LocationMoveOutLocResource.display(this, util);

	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ロケ変更(一覧)画面に遷移します。
	 * @param bean ロケ変更(出庫ロケ)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("LocationMoveHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam LocationMoveOutLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");

		TStockDto tStockDto = dto.getTStockDto();
		tStockDto.getMLocation().setLocationCd(bean.getLocationCd());

		// [#575] ValidateチェックのHT国際化 2017.02.21 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.21 sja End

		//出庫ロケ存在チェック
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationDtoMapper.mappingToEntity(tStockDto.getMLocation());

		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}
		tStockDto.getMLocation().setLocationNm(mLocation.getLocationNm());

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//商品情報の取得
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(null);
		//荷主情報の取得
		MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		MClient mClient = mClientDtoMapper.mappingToEntity(dto.getTStockDto().getMClient());
		mClient.setClientId(dto.getTStockDto().getClientId());
		//倉庫情報の取得
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		MWarehouse mWarehouse = mWarehouseDtoMapper.mappingToEntity(dto.getTStockDto().getMWarehouse());
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		//入庫No.情報の取得
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(null);

		//在庫存在チェック
		int dataCnt = checkLogic.checkStock(mClient, mLocation, mProduct, mWarehouse, bUser,tStoreNo);
		if (dataCnt == 0) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		//トレース項目
		setWorkLogTraceItem(bean.getLocationCd());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana Start
		// ※ タイミングを見て作り込む可能性があるためコメントアウトで対応
		//通信制御データ作成
//		util.setHtComCtl(ses, "LocationMoveOut", bean.getLocationCd());
		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana End

		ses.setAttribute("LocationMoveDto", dto);

		//ロケ変更(一覧)画面を表示
		LocationMoveOutListResource.load(this, util, "LocationMoveOutLoc/display", selectLogic, userLogic);
	}
}
