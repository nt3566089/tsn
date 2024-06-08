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
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutLocDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutCheckLogic;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫移動出庫(出庫ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOutLoc")
@HandyErrorReturnPath(returnURL = "StockMoveOutLoc/display")
public class StockMoveOutLocResource extends HandyMenuResource {

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
	private HandyCommonUtil logic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private StockMoveOutCheckLogic checkLogic;
	@Inject
	private StockMoveOutSelectLogic selectLogic;

	/**
	 * 在庫移動出庫(出庫ロケ入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//load(this, util, centerLogic, clientLogic, warehouseLogic);
		load(this, util, centerLogic, clientLogic, warehouseLogic, selectLogic);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
	}
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
//	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
//			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, StockMoveOutSelectLogic selectLogic) throws Exception {
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
		//機能単位セッションを処理化
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//StockMoveOutResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);
		StockMoveOutResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic, selectLogic);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫移動出庫(出庫ロケ入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW Start
		resource.initScreen("StockMoveOutLocHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveOutLoc/back").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveOutLoc/send").itemCd("send").build());

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveOutLoc/send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		//出庫ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveOutLoc.jsp", ses);
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

		// ===== 在庫移動出庫(終了)を表示 =====

		String dialogScreenCd = "StockMoveOutCancelHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_CANCEL);

		// いいえボタン設定
		setReturnButton(ButtonInfo.builder().url("StockMoveOutLoc/onCancelDialogNo").itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).build());
		// はいボタン設定
		setSendButton(ButtonInfo.builder().url("StockMoveOutLoc/onCancelDialogYes").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).build());

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
		StockMoveOutResource.removeSession(this, util);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_STOCK);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 終了確認画面継続時にコールされるメソッドです。<br>
	 * 在庫移動出庫ロケ入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogNo")
	public void onCancelDialogNo() throws Exception {

		//在庫移動出庫ロケ入力画面を表示
		StockMoveOutLocResource.display(this, util);

	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動出庫(JAN入力)画面に遷移します。
	 * @param bean 出庫ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("StockMoveOutHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam StockMoveOutLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		TStockDto tStockDto = dto.getTStockDto();
		tStockDto.getMLocation().setLocationCd(bean.getLocationCd());

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

		//出庫ロケ存在チェック
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationDtoMapper.mappingToEntity(tStockDto.getMLocation());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		//mLocation.setCenterId(tStockDto.getMWarehouse().getCenterId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}
		tStockDto.getMLocation().setLocationNm(mLocation.getLocationNm());

		//[HT1.5-CT1-038] ロケーション単位の在庫データ存在チェックを追加 2015/06/25 KAI ADD START
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
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//入庫No.情報の取得
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(null);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		//在庫存在チェック
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//int dataCnt = checkLogic.checkStock(mClient, mLocation, mProduct, mWarehouse, bUser);
		int dataCnt = checkLogic.checkStock(mClient, mLocation, mProduct, mWarehouse, bUser, tStoreNo);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
		if (dataCnt == 0) {
			return;
		}
		//[HT1.5-CT1-038] ロケーション単位の在庫データ存在チェックを追加 2015/06/25 KAI ADD END

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.getLocationCd());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana Start
		// ※ タイミングを見て作り込む可能性があるためコメントアウトで対応
		//通信制御データ作成
//		util.setHtComCtl(ses, "StockMoveOut", bean.getLocationCd());
		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana End

		ses.setAttribute("StockMoveOutDto", dto);

		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
//		//JAN入力画面を表示
//		StockMoveOutJanCdResource.load(this, util, logic);
		//入庫ラベルNo.入力画面を表示
		StockMoveOutLabelNoResource.load(this, util, logic);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
	}
}
