package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveInDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveInJanCdDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveInCheckLogic;
import com.oneslogi.ht.wms.logic.stock.StockMoveInSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫移動入庫(JAN入力)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveInJanCd")
@HandyErrorReturnPath(returnURL = "StockMoveInJanCd/display")
public class StockMoveInJanCdResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private UserLogic userLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private StockMoveInCheckLogic checkLogic;
	@Inject
	private StockMoveInSelectLogic selectLogic;

	/**
	 * 在庫移動入庫(JAN入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//機能単位セッションを処理化
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
		//StockMoveInResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic, userLogic);
//		//自画面表示
//		display(this, util);
		load(this, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
	}


	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, UserLogic userLogic) throws Exception {

		//機能単位セッションを処理化
		StockMoveInResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic, userLogic);

		//自画面表示
		display(resource, util);
	}

	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, UserLogic userLogic,StockMoveInSelectLogic selectLogic) throws Exception {
		//機能単位セッションを処理化
		StockMoveInResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			ses.setAttribute("StockMoveInDto", dto);
			//入庫ラベルNo入力画面に遷移する
			StockMoveInLabelNoResource.load(resource, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);
		} else {
			// 入庫No管理対象外場合
			//自画面表示
			display(resource, util);
		}
	}
	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
	/**
	 * 在庫移動入庫(JAN入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("StockMoveInJanCdHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveInJanCd/back").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveInJanCd/send").itemCd("send").build());

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveInJanCd/send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveInJanCd.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動入庫(JAN入力)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("StockMoveInHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam StockMoveInJanCdDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		TMoveInstBDto tMoveInstBDto = dto.getTMoveInstBDto();
		dto.getTMoveInstBDto().getMProduct().setJanCd(bean.getJanCd());
		dto.setJanCdProd(bean.getJanCd());

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

		TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
		TMoveInstB tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(tMoveInstBDto);
		tMoveInstB.chaseMProduct().setJanCd(bean.getJanCd());
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//商品情報の取得
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(bean.getJanCd());
		mProduct.setClientId(loginInfo.getClientId());
		//倉庫情報の取得
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		MWarehouse mWarehouse = mWarehouseDtoMapper.mappingToEntity(dto.getTMoveInstBDto().getMWarehouse());
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		dto.setTMoveInstBDto(tMoveInstBDtoMapper.mappingToDto(tMoveInstB));
		ses.setAttribute("StockMoveInDto", dto);

		//データ存在チェック
		int dataCnt = 0;
		boolean blnCheck = checkLogic.checkTMoveInstB(mProduct, mWarehouse, bUser);

		if (!blnCheck) {
			return;
		} else {
			List<TMoveInstB> lstTMoveInstB = selectLogic.selectTMoveInstB(mProduct, mWarehouse, bUser, true);
			if (lstTMoveInstB.size() == 1) {
				dataCnt = 1;
				tMoveInstBDto = tMoveInstBDtoMapper.mappingToDto(lstTMoveInstB.get(0));
				//TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
				dto.setLstTMoveInstBDto(tMoveInstBDtoMapper.mappingToDtoList(lstTMoveInstB));

				for (int i = 0; i < lstTMoveInstB.size(); i++) {
					tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(dto.getLstTMoveInstBDto().get(i));

					TMoveInstB tmpTMoveInstB = selectLogic.selectMLocation(tMoveInstB, bUser);
					//ロケマスタの取得
					MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
					MLocation mLocation = new MLocation();
					mLocation.setLocationNm(tmpTMoveInstB.getMLocation().getLocationNm());
					mLocation.setLocationId(tmpTMoveInstB.getMLocation().getLocationId());
					mLocation.setLocationCd(tmpTMoveInstB.getMLocation().getLocationCd());
					dto.getLstTMoveInstBDto().get(i).setMLocation(mLocationDtoMapper.mappingToDto(mLocation));
					dto.setMoveInstHId(tmpTMoveInstB.getMoveInstHId());
				}
				dto.setTMoveInstBDto(tMoveInstBDto);
			}
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		//トレース項目
		setWorkLogTraceItem(bean.getJanCd());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana Start
		// ※ タイミングを見て作り込む可能性があるためコメントアウトで対応
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
//		//通信制御データ作成
//		String reopenKey = "0";
//		reopenKey = reopenKey + "," +  bean.getJanCd();
//		util.setHtComCtl(ses, "StockMoveIn", reopenKey);
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana End

		if (dataCnt == 1) {
			//数量入力画面を表示
			StockMoveInLocResource.load(this, util, "StockMoveInJanCd/display");
		} else {
			//在庫選択画面を表示
			StockMoveInSelectResource.load(this, util, "StockMoveInJanCd/display", selectLogic, userLogic);
		}
	}

	/**
	 * 在庫移動入庫(終了確認)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogNo")
	public void onCancelDialogNo() throws Exception {

		//在庫移動出庫ロケ入力画面を表示
		StockMoveInJanCdResource.display(this, util);

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

		// ===== 在庫移動入庫(終了)を表示 =====

		String dialogScreenCd = "StockMoveInCancelHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_CANCEL);

		// いいえボタン設定
		setReturnButton(ButtonInfo.builder().url("StockMoveInJanCd/onCancelDialogNo").itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).build());
		// はいボタン設定
		setSendButton(ButtonInfo.builder().url("StockMoveInJanCd/onCancelDialogYes").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 在庫移動入庫(終了確認)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onCancelDialogYes")
	public void onCancelDialogYes() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションを再構造
		StockMoveInResource.removeSession(this, util);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_STOCK);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

}
