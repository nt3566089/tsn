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
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveInDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveInLabelNoDto;
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
 * 在庫移動入庫(入庫ラベルNo)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveInLabelNo")
@HandyErrorReturnPath(returnURL = "StockMoveInLabelNo/display")
public class StockMoveInLabelNoResource extends HandyMenuResource {

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
	 * 在庫移動入庫(入庫ラベルNo)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);
    }

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, UserLogic userLogic,StockMoveInSelectLogic selectLogic) throws Exception {
		//機能単位セッションを処理化
		StockMoveInResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫移動入庫(入庫ラベルNo)画面表示を行います。
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
		resource.initScreen("StockMoveInLabelNoHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveInLabelNo/back").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveInLabelNo/send").itemCd("send").build());

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveInLabelNo/send").build());

		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder().url("StockMoveInJanCd/display").itemCd("option2").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//入庫ラベルNo画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveInLabelNo.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動入庫(入庫ラベルNo)画面に遷移します。
	 * @param bean 入庫ラベルNo画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("StockMoveInHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam StockMoveInLabelNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		TMoveInstBDto tMoveInstBDto = dto.getTMoveInstBDto();
		// [#1563] 前画面に戻ってから操作すると致命的エラー発生 - 問題のコードは不要なため削除 2017.04.14 kawana
		dto.setLabelNo(bean.getLabelNo());

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
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//商品情報の取得
		MProduct mProduct = new MProduct();
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
		boolean blnCheck = checkLogic.checkTMoveInstB(mProduct, mWarehouse, bUser,bean.getLabelNo());

		if (!blnCheck) {
			return;
		} else {
			List<TMoveInstB> lstTMoveInstB = selectLogic.selectTMoveInstB(mProduct, mWarehouse, bUser, true,bean.getLabelNo());
			if (lstTMoveInstB.size() == 1) {
				dataCnt = 1;
				tMoveInstBDto = tMoveInstBDtoMapper.mappingToDto(lstTMoveInstB.get(0));
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
		setWorkLogTraceItem(bean.getLabelNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana Start
		// ※ タイミングを見て作り込む可能性があるためコメントアウトで対応
		//通信制御データ作成
//		String reopenKey = "1";
//		reopenKey = reopenKey + "," +  bean.getLabelNo();
//		util.setHtComCtl(ses, "StockMoveIn", reopenKey);
		// [#3984] ワークテーブル未使用の中途半端な再開機能を削除 2018.03.08 kawana End

		if (dataCnt == 1) {
			//ロケ入力画面を表示
			StockMoveInLocResource.load(this, util, "StockMoveInLabelNo/display");
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
		StockMoveInLabelNoResource.display(this, util);

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
		setReturnButton(ButtonInfo.builder().url("StockMoveInLabelNo/onCancelDialogNo").itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).build());
		// はいボタン設定
		setSendButton(ButtonInfo.builder().url("StockMoveInLabelNo/onCancelDialogYes").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).build());

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
