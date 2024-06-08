package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

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
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutLabelNoDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutCheckLogic;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 在庫移動出庫(入庫ラベルNo.)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOutLabelNo")
@HandyErrorReturnPath(returnURL = "StockMoveOutLabelNo/display")
public class StockMoveOutLabelNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private StockMoveOutCheckLogic checkLogic;
	@Inject
	private StockMoveOutSelectLogic selectLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private HandyCommonUtil logic;

	/**
	 * 在庫移動出庫(入庫ラベルNo.)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, logic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, HandyCommonUtil logic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");
		dto.setStoreLabelNo("");
		ses.setAttribute("StockMoveOutDto", dto);

		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			// 入庫No管理対象場合
			// 自画面表示
			display(resource, util, logic);
		} else {
			// 入庫No管理対象外場合
			// JAN入力画面に遷移する
			StockMoveOutJanCdResource.load(resource, util, logic);
		}
	}

	/**
	 * 在庫移動出庫(入庫ラベルNo.)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util, logic);
	}
	public static void display(HandyResourceBase resource, HandyCommonUtil util, HandyCommonUtil logic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW Start
		resource.initScreen("StockMoveOutLabelNoHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveOutLabelNo/send").build());
		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder().url("StockMoveOutJanCd/load").itemCd("option2").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveOutLoc/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveOutLabelNo/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW End

		//JAN入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveOutLabelNo.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動出庫(数量入力)画面に遷移します。
	 * @param bean 入庫ラベルNo.入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam StockMoveOutLabelNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");
		dto.setStoreLabelNo(bean.getLabelNo());

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
		//ロケーション情報の取得
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationDtoMapper.mappingToEntity(dto.getTStockDto().getMLocation());
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		//入庫No.情報の取得
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(bean.getLabelNo());

		//在庫存在チェック
		int dataCnt = checkLogic.checkStock(mClient, mLocation, mProduct, mWarehouse, bUser, tStoreNo);
		if (dataCnt == 0) {
			return;
		} else if (dataCnt == 1) {
			List<TStock> lstTStock = selectLogic.SelectStock(mClient, mLocation, mProduct, mWarehouse, bUser, tStoreNo);
			TStockDtoMapper tStockDtoMapper = new TStockDtoMapper();
			TStockDto tStockDto = tStockDtoMapper.mappingToDto(lstTStock.get(0));
			dto.setTStockDto(tStockDto);
		}

		ses.setAttribute("StockMoveOutDto", dto);

		if (dataCnt == 1) {
			//数量入力画面を表示
			StockMoveOutQtyResource.load(this, util, "StockMoveOutLabelNo/display");
		} else {
			//在庫選択画面を表示
			StockMoveOutListResource.load(this, util, "StockMoveOutLabelNo/display", selectLogic, userLogic);
		}
	}
}
