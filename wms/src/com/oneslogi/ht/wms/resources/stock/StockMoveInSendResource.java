package com.oneslogi.ht.wms.resources.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveInDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveInSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockSelectLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockSelectLotCondition;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.StockMoveSelectLogic;
import com.oneslogi.wms.logic.stock.StockMoveUpdateLogic;
import com.oneslogi.wms.logic.stock.StockTransferResultLogic;
import com.oneslogi.wms.logic.stock.StockTransferStatusUpdateLogic;

/**
 * 在庫移動入庫(送信確認)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveInSend")
@HandyErrorReturnPath(returnURL = "StockMoveInSend/display")
public class StockMoveInSendResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private StockTransferResultLogic stocktransferResult;
	@Inject
	private StockTransferStatusUpdateLogic stocktransferStatusUpdate;
	@Inject
	private UserLogic userLogic;
	@Inject
	private StockMoveInSelectLogic selectLogic;
	// [C-CWMS-0050] 全数在庫移動際、補充ロケー件対応 2016.2.18 nayzaw Start
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private StockSelectLogic stockLogic;
	@Inject
	private StockMoveUpdateLogic updateLogic;
	@Inject
	private StockMoveSelectLogic stockMoveSelectLogic;
	// [C-CWMS-0050] 全数在庫移動際、補充ロケー件対応 2016.2.18 nayzaw Start

	/**
	 * 在庫移動入庫(送信確認)画面初期化を行います。
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
	 * 在庫移動出庫(送信確認)画面表示を行います。
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
		resource.initScreen("StockMoveInSendHT");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url("StockMoveInLoc/display")
				.itemCd("no").type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("StockMoveInSend/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_SEND).build());


		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//送信確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveInSend.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動出庫(完了確認)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("StockMoveInHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();

		TMoveInstB tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(dto.getTMoveInstBDto());

		TMoveInstB bodyFrom = selectLogic.selectMLocation(tMoveInstB, bUser);

		// ===== 在庫移動指示ヘッダ =====
		//TMoveInstH header = new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		List<TMoveInstB> bodyList = new ArrayList<TMoveInstB>();
		TMoveInstHDtoMapper tMoveInstHDtoMapper = new TMoveInstHDtoMapper();
		TMoveInstH header = tMoveInstHDtoMapper.mappingToEntity(dto.getTMoveInstBDto().getTMoveInstH());
		TMoveInstB bodyTo = tMoveInstBDtoMapper.mappingToEntity(dto.getTMoveInstBDto());
		bodyTo.setLocationId(dto.getLocationId());
		bodyTo.setLocationCd(dto.getLocationCd());

		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
		bodyTo.setWarehouseCd(dto.getWarehouseCd());
		bodyTo.setWarehouseId(dto.getWarehouseId());
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
		bodyList.add(bodyFrom);
		bodyList.add(bodyTo);

		// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana Start
		//全数移動確認
		boolean isAllMove = stockUpdateCheckLogic.isAllShippingProductStore(bodyList.get(0));
		// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana End

		try {

			// ===== tMoveInstBListのデータ件数分繰返 =====
			for (TMoveInstB body : bodyList) {
				// ===== 処理区分判定=====
				// ===== tMoveInstBList．入出庫区分が0：入庫の場合 =====
				if (body.isInoutType$0()) {
					// ===== 在庫移動実績.在庫移動［入庫］クラスを呼出し =====
					stocktransferResult.stockMoveIn(header, bodyList, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}

					// ===== 在庫移動ステータス更新.在庫移動［入庫］クラスを呼出し =====
					stocktransferStatusUpdate.stockMoveIn(header, body, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}
				}
			}
			// [C-CWMS-0050]  全数在庫移動際補充ロケ件対応 2016.2.18 nayzaw Start

			if(!CU.isNotNullAndEquals(bodyFrom.getLocationId(),bodyTo.getLocationId())){

				MClientCenter clientCenter = stockMoveSelectLogic.getClientCenterInfo(header.getClientId(), header.getCenterId());

				// [Ver3.0] unit of measure対応 2017.12.01 王 Start
				long shapeId = util.getPieceShapeId(bodyFrom.getProductId());
				// [Ver3.0] unit of measure対応 2017.12.01 王 End
				bodyFrom.setShapeId(shapeId);
				boolean isManageStoreDt = clientCenter.getMParamAsOne().isStoreDtFlg$1();


				//在庫移動実績ボディ作成
				TMoveRecordB recordBody = new TMoveRecordB();
				recordBody.setMoveInstHId(header.getMoveInstHId());
				recordBody.setMoveInstBId(bodyFrom.getMoveInstBId());
				recordBody.setProcessNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.PROCESS_NO));
				recordBody.setLocationId(bodyFrom.getLocationId());
				recordBody.setMoveDt(clientCenter.getSystemDt());
				recordBody.setMoveNum(bodyFrom.getInstNum());

				//在庫データ作成
				TStock stock = null;
				if(bodyFrom.getStoreNoId() != null){
					//入庫No.IDの設定あり
					stock = stockLogic.selectByStoreNoAndLocation(bodyFrom.getStoreNoId(), bodyFrom.getLocationId(), true, new ErrorStatus());
				}else{

					//入庫No.IDの設定なし

					StockSelectLotCondition lotCondition;
					if(isManageStoreDt){
						//入庫日管理あり

						lotCondition = StockSelectLotCondition.builder().clientId(header.getClientId()).productId(bodyFrom.getProductId()).stockTypeId(bodyFrom.getStockTypeId())
								.locationId(recordBody.getLocationId()).depositId(bodyFrom.getDepositId()).lotId(bodyFrom.getLotId()).shapeId(bodyFrom.getShapeId())
								.storeDt(bodyFrom.getStoreDt()).joinStoreNo(true).build();
					}
					else{
						//入庫日管理なし
						lotCondition = StockSelectLotCondition.builder().clientId(header.getClientId()).productId(bodyFrom.getProductId()).stockTypeId(bodyFrom.getStockTypeId())
								.locationId(recordBody.getLocationId()).depositId(bodyFrom.getDepositId()).lotId(bodyFrom.getLotId()).shapeId(bodyFrom.getShapeId()).joinStoreNo(true)
								.build();
					}
					stock = stockLogic.selectByLot(lotCondition, new ErrorStatus());
				}
				stock.setChargeNum(WCC.add(stock.getChargeNum(), bodyFrom.getInstNum()));

				if(isAllMove){
					//全数移動の場合ロケーションマスタの補充データ更新
					updateLogic.updateLocationReplenishData(bodyFrom, bodyTo, recordBody);
				}
			}

			// [C-CWMS-0050]  全数在庫移動際補充ロケ件対応 2016.2.18 nayzaw End

		} catch (Exception e) {
			//他のユーザが変更している可能性があります。内容を確認して下さい。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.EXCLUSIVE_CONTROL_ERROR);
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 数量
		setWorkLogQty(dto.getTMoveInstBDto().getInstNum());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		/* 2015/06/11 INOUE ADD START 色・音の適用 */
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
		/* 2015/06/11 INOUE ADD END */

		//ロケ入力画面を遷移する
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
		//StockMoveInJanCdResource.load(this, util, centerLogic, clientLogic, warehouseLogic, userLogic);
		StockMoveInJanCdResource.load(this, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
	}

}
