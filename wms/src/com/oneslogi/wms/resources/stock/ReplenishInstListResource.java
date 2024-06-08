package com.oneslogi.wms.resources.stock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StoreLabelNoNumberingLogic;
import com.oneslogi.wms.dto.stock.ReplenishInstListDto;
import com.oneslogi.wms.dto.stock.ReplenishInstListDto.ReplenishInstListBodyData;
import com.oneslogi.wms.dto.stock.ReplenishInstListDto.ReplenishInstListHeadData;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.stock.ReplenishInstInsertLogic;
import com.oneslogi.wms.logic.stock.ReplenishInstSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 補充指示一覧画面のリソースクラス。
 */
@Path("/stock/replenishInstList")
public class ReplenishInstListResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 補充指示一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_ERROR = 2;
		/**
		 * 補充指示処理異常
		 */
		protected static final int REPLENISH_INST_ERROR = 3;
		/**
		 * 補充指示処理警告
		 */
		protected static final int REPLENISH_INST_WARN = 4;

	}

	// ===== 使用ロジッククラス =====

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ReplenishInstSelectLogic replenishInstSelectLogic;
	@Inject
	private ReplenishInstInsertLogic replenishInstInsertLogic;
	@Inject
	private ParamLogic paramLogic;
	//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 追加 Start
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;
	//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 追加 End
	// [#1781] 補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
	@Inject
	private MessageLogic messageLogic;
	// [#1781] 補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End

	/**
	 * <h2>初期処理用のコマンド</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockInOutListDto 補充指示一覧検索画面用DTO
	 */
	@GET
	@Path("/init")
	public ReplenishInstListDto initCmd() {

		// 画面用DTO作成
		ReplenishInstListDto replenishInstListDto = new ReplenishInstListDto();

		return replenishInstListDto;
	}

	/**
	 * <h2>補充指示一覧データ検索用のコマンド</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、補充指示一覧データ取得
	 * </pre>
	 * @param replenishInstListDto 補充指示一覧画面用DTO
	 * @return ReplenishInstListDto 補充指示一覧画面用DTO
	 * @throws ParseException
	 */
	@GET
	@Path("/search")
	public ReplenishInstListDto searchCmd(ReplenishInstListDto replenishInstListDto)
		throws ParseException {

		// [#2237] 検索結果の上限チェックを追加 2017.08.14 kawana Start

		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei Start
		ReplenishInstListDto resultDto = this.search(replenishInstListDto, 1, null, null, null, null);
		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei End

		// ===== 上限チェック =====

		//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana Start
		int allowListCount = getAllowCount();
		//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana End
		if (0 < allowListCount) {
			if (allowListCount < resultDto.data.body.size()) {
				this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_ERROR), WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(allowListCount));
				return null;
			}
		}

		return resultDto;

		// [#2237] 検索結果の上限チェックを追加 2017.08.14 kawana End

	}

	//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana Start

	/**
	 * 上限数の取得
	 */
	private int getAllowCount() {

		if (isDataTypeExcel()) {
			return getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_EXCEL);
		} else {
			return getPropertyIntValue(WmsPropertyConst.ALLOW_RESPONSE_LIST_COUNT);
		}
	}

	//  [#4685][v3.0] Excel出力時の上限数を変更 2018.06.08 kawana End

	/**
	 * <h2>補充指示データ登録前チェック用のコマンド</h2>
	 * <pre>
	 * 入力データのチェックを行う
	 * エラーがない場合は、確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param replenishInstListDto 補充指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws ParseException
	 */
	@POST
	@Path("/registerCheck")
	public StatusDto checkCmd(ReplenishInstListDto replenishInstListDto) throws ParseException {

		// ===== 登録データをチェック =====
		this.registerCheck(replenishInstListDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>補充指示処理実行用のコマンド</h2>
	 * <pre>
	 * データの登録処理。
	 * エラーがない場合は、データベースに在庫移動指示ヘッダ、在庫移動指示ボディデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはregisterCheck()の結果で判定。
	 * </pre>
	 * @param stockTypeMasterDto 補充指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws ParseException
	 */
	@POST
	@Path("/register")
	public StatusDto registerCmd(ReplenishInstListDto replenishInstListDto) throws ParseException {

		// ===== 登録データをチェック =====
		this.registerCheck(replenishInstListDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		//[Ver1.1.4][ON推-補充処理の不具合] 2016.01.29 chou 修正 End
		boolean isRegisterOk = false;

		for (ReplenishInstListBodyData bodyData :replenishInstListDto.data.body) {

			isRegisterOk = false;

			// ===== 在庫移動指示ヘッダリスト =====
			List<TMoveInstH> headerList = new ArrayList<TMoveInstH>();

			//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 修正 Start

			// ===== 在庫移動指示ボディリスト =====
			List<List<TMoveInstB>> tMoveInstBLists = new ArrayList<List<TMoveInstB>>();

			// ===== 在庫移動実績ボディ =====
			TMoveRecordB recordBody = null;

			// ===== 登録データ組み立て =====
			this.setupRegisterData(replenishInstListDto.data.head, bodyData, headerList, tMoveInstBLists);

			// ===== 在庫数不足のチェック =====
			if (headerList.size() == 0) {
				// 補充指示一覧の複数補充指示の中に、在庫.引当可能数が不足する場合に、警告メッセージを表示
				this.getWarnManager().add(this.warnRetSts(StatusCode.REPLENISH_INST_WARN), WmsMessageConst.STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
				return null;
			}

			for(int i = 0; i < headerList.size(); i ++) {

				TMoveInstH instHeader = headerList.get(i);
				List<TMoveInstB> instBodyList = tMoveInstBLists.get(i);

				recordBody = new TMoveRecordB();

				if(instBodyList.size() != 2){
					//処理中止
					return null;
				}

				//在庫移動指示ヘッダ、ボディを登録
				this.replenishInstInsertLogic.insert(instHeader, instBodyList, recordBody, errRetSts(StatusCode.REPLENISH_INST_ERROR));

				//在庫移動［出庫］処理、在庫移動実績ボディの更新、在庫移動指示ボディの更新を行う
				this.replenishInstInsertLogic.stockMoveOut(instHeader, instBodyList, recordBody, errRetSts(StatusCode.REPLENISH_INST_ERROR));

				isRegisterOk = true;
			}
		}

		if (isRegisterOk) {
			// [#1781] 補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
			// [ON推-品向-1163] 在庫移動一覧画面へ遷移を追加 2016.07.01 kawana Start

			// ===== 定期補充指示 完了メッセージの登録 =====

			String centerCd = replenishInstListDto.data.head.getCenterCd_H();
			String clientCd = replenishInstListDto.data.head.getClientCd_H();

			String stockMoveListLinkStr = messageLogic.getMessageNm(WmsMessageConst.STOCK_MOVE_LIST_REPLENISH_LINK, centerCd, clientCd);

			getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.REPLENISH_INST_COMPLETE_INFORMATION, stockMoveListLinkStr);
			// [ON推-品向-1163] 在庫移動一覧画面へ遷移を追加 2016.07.01 kawana End
			// [#1781] 補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End
		}

		//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 修正 End

		return null;
	}

	// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei Start
	/**
	 * <h2>補充指示一覧データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、補充指示一覧データ取得
	 * </pre>
	 * @param replenishInstListDto 補充指示一覧画面用DTO
	 * @param type 処理区分（1:通常検索用  2:DBチェック用）
	 * @param locationIdColtn ロケーションIDのコレクション
	 * @param productIdColtn 商品IDのコレクション
	 * @param stockTypeIdColtn 在庫区分IDのコレクション
	 * @param depositIdColtn 預託IDのコレクション
	 *
	 * @return ReplenishInstListDto 補充指示一覧画面用DTO
	 * @throws ParseException
	 */
	private ReplenishInstListDto search(ReplenishInstListDto replenishInstListDto, int type,
			Collection<Long> locationIdColtn, Collection<Long> productIdColtn,
			Collection<Long> stockTypeIdColtn, Collection<Long> depositIdColtn) throws ParseException {
		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei End
		ReplenishInstListDto result = new ReplenishInstListDto();
		ReplenishInstListHeadData head = replenishInstListDto.data.head;

		MLocation mLocation = new MLocation();
		TStock tstock = new TStock();

		MClient mClient = new MClient();
		MClientCenter mClientCenter = new MClientCenter();

		// 荷主マスタ検索で必要なIDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(head.getClientCd_H());
		// 荷主ID
		Long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		tstock.setClientId(clientId);
		mClientCenter.setClientId(clientId);
		mClient.setClientId(clientId);
		mClient.setClientCd(head.getClientCd_H());

		// センタマスタ検索で必要なIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(head.getCenterCd_H());
		// センタID
		Long centerId = centerLogic.getUkEntity(centerCondition).getCenterId();
		mLocation.setCenterId(centerId);
		mClientCenter.setCenterId(centerId);

		// 倉庫マスタ検索で必要なIDの取得
		MWarehouse warehouseCondition = new MWarehouse();
		warehouseCondition.setWarehouseCd(head.getReplenishToWarehouseCd_H());
		warehouseCondition.setCenterId(centerId);
		if (!CU.isNullOrEmpty(head.getReplenishToWarehouseCd_H())) {
			// 倉庫ID
			Long warehouseId = warehouseLogic.getUkEntity(warehouseCondition).getWarehouseId();
			tstock.setWarehouseId(warehouseId);

			// ゾーンマスタ検索で必要なIDの取得
			MZone zoneCondition = new MZone();
			zoneCondition.setWarehouseId(warehouseId);
			zoneCondition.setZoneCd(head.getReplenishToZoneCd_H());
			if (!CU.isNullOrEmpty(head.getReplenishToZoneCd_H())) {
				// ゾーンID
				Long zoneId = zoneLogic.getUkEntity(zoneCondition).getZoneId();
				mLocation.setZoneId(zoneId);
			}
		}

		mLocation.setLocationCdFrom(head.getReplenishToLocationCdFrom_H());
		mLocation.setLocationCdTo(head.getReplenishToLocationCdTo_H());

		// 在庫区分マスタ検索で必要なIDの取得
		MStockType stockTypeCondition = new MStockType();
		stockTypeCondition.setStockTypeCd(head.getStockTypeCd_H());
		if (!CU.isNullOrEmpty(head.getStockTypeCd_H())) {
			// 在庫区分ID
			Long stockTypeId = stockTypeLogic.getUkEntity(stockTypeCondition).getStockTypeId();
			tstock.setStockTypeId(stockTypeId);
		}

		// 取引先マスタ検索で必要なIDの取得
		MCustomer customerCondition = new MCustomer();
		if (!CU.isNullOrEmpty(head.getDepositCd_H())){
			customerCondition.setClientId(clientId);
			customerCondition.setCustomerCd(head.getDepositCd_H());
			// 預託ID
			Long customerId = customerLogic.getUkEntity(customerCondition).getCustomerId();
			tstock.setDepositId(customerId);
		}

		// [バグ（ＰＧ不良） #1003] 対応修正 2017.2.13 nayzaw Start
		MProduct mProduct = new MProduct();
		mProduct.setProductCd(head.getProductCd_H());
		// [バグ（ＰＧ不良） #1003] 対応修正 2017.2.13 nayzaw End

		mLocation.setDelFlg("0");
		tstock.setDelFlg("0");

		this.replenishInstSelectLogic.setReplenishMinNumCond(head.getReplenishMinNumCond_H());

		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei Start
		//ページング無しで一覧データを取得
		// [バグ（ＰＧ不良） #1003] 対応修正 引数（商品マスタ）を追加 2017.2.13 nayzaw Start
		result.data.body = this.replenishInstSelectLogic.select(mLocation, tstock, mClientCenter, mClient, mProduct, type, locationIdColtn, productIdColtn, stockTypeIdColtn, depositIdColtn, errRetSts(StatusCode.SEARCH_DATA_ERROR));
		// [バグ（ＰＧ不良） #1003] 対応修正 引数（商品マスタ）を追加 2017.2.13 nayzaw End
		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei End
		return result;
	}

	/**
	 * <h2>補充指示数が変わっているかをチェック</h2>
	 * <pre>
	 * 画面からの補充指示数はDB再検索された補充指示数と一致しているかのチェックを行う
	 * ・一致する場合、falseとして戻る
	 * ・一致しない場合、trueとして戻る
	 *
	 * </pre>
	 * @param replenishInstListDto 補充指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws ParseException
	 */
	private boolean checkDbDataChanged(ReplenishInstListDto replenishInstListDto) throws ParseException{
		boolean res = true;

		List<ReplenishInstListBodyData> pageDataBodyList = replenishInstListDto.data.body;//画面からのデータ

		//画面からのデータから関連IDを抽出する
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 Start
		Collection<Long> productIdColtn = this.getIdList(pageDataBodyList, 1);
		Collection<Long> locationIdColtn = this.getIdList(pageDataBodyList, 2);
		Collection<Long> stockTypeIdColtn = this.getIdList(pageDataBodyList, 3);
		Collection<Long> depositIdColtn = this.getIdList(pageDataBodyList, 4);
		//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 End
		//
		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei Start
		ReplenishInstListDto dbDataDto = this.search(replenishInstListDto, 2, locationIdColtn, productIdColtn, stockTypeIdColtn, depositIdColtn);
		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei Start

		List<ReplenishInstListBodyData> dbDataBodyList = dbDataDto.data.body;//DBから再検索されるデータ

		for (ReplenishInstListBodyData pageData : pageDataBodyList) {

			for (ReplenishInstListBodyData dbData : dbDataBodyList) {

				if (pageData.getReplenishToLocationId().longValue() == dbData.getReplenishToLocationId().longValue() &&
						pageData.getProductId().longValue() == dbData.getProductId().longValue() &&
						pageData.getStockTypeId().longValue() == dbData.getStockTypeId().longValue() &&
						pageData.getDepositId().longValue() == dbData.getDepositId().longValue()) {

					//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 Start
					if (WCC.isNotEqual(pageData.getReplenishInstNum(), dbData.getReplenishInstNum()) ||
							WCC.isNotEqual(pageData.getReplenishFromStockNum(), dbData.getReplenishFromStockNum()) ||
							WCC.isNotEqual(pageData.getReplenishToStockNum(), dbData.getReplenishToStockNum()) ||
							WCC.isNotEqual(pageData.getReplenishInstOverNum(), dbData.getReplenishInstOverNum())) {
						return true;
					}else {
						res = false;
					}
					//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 修正 End

				}

			}

		}

		return res;
	}

	/**
	 * <h2>在庫移動指示登録データのチェック。</h2>
	 * <pre>
	 * 補充指示が可能かのチェックをする
	 * 次の場合、エラーとして扱い、エラーステータス、エラーメッセージCDを設定する
	 *  【エラー条件】
	 *  補充指示数≦0の場合、補充指示数＞最大格納数－補充先在庫数の場合、/画面で操作しているデータが古い場合
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 補充指示処理異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param replenishInstListDto 補充指示一覧画面用DTO
	 * @return StatusDto           処理結果DTO
	 * @throws ParseException
	 */
	private StatusDto registerCheck(ReplenishInstListDto replenishInstListDto) throws ParseException {

		//画面で操作しているデータが古い場合のチェックを行う
		if (this.checkDbDataChanged(replenishInstListDto)) {
			getErrorManager().add(this.errRetSts(StatusCode.REPLENISH_INST_ERROR), WmsMessageConst.REPLENISH_INST_CANNNOT_REGISTER_PAGE_DATA_IS_OLD_ERROR);

			return null;
		}

		//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.28 chou 削除

		for (ReplenishInstListBodyData bodyData :replenishInstListDto.data.body) {

			//補充指示数≦0の場合、補充指示が不可とし、エラーメッセージを表示する。
			if (bodyData.getReplenishInstNum().compareTo(WCC.ZERO) <= 0) {

				getErrorManager().add(this.errRetSts(StatusCode.REPLENISH_INST_ERROR), WmsMessageConst.REPLENISH_INST_CANNNOT_REGISTER_INST_NUM_ZERO_ERROR);
				// ===== 処理中止 =====
				return null;
			}

			//補充指示数＞最大格納数－補充先在庫数の場合（※補充可能な数量を超える場合）、補充指示が不可とし、エラーメッセージを表示する。
			//[ON推-品向-1153]このチェック処理を外す 2016.05.10 chou Del Start
//			Long replenishMaxNumP = bodyData.getUnitNum() > 0L ? bodyData.getReplenishMaxNum() * bodyData.getUnitNum() : bodyData.getReplenishMaxNum();
//			if (bodyData.getReplenishToStockNum().longValue() + bodyData.getReplenishInstNum().longValue() + bodyData.getReplenishInstOverNum().longValue() > replenishMaxNumP.longValue()) {
//
//				getErrorManager().add(this.errRetSts(StatusCode.REPLENISH_INST_ERROR), WmsMessageConst.REPLENISHMENT_UNIT_QTY_CANNOT_INPUT_MORE_THAN_MAX_QTY_ERROR);
//				// ===== 処理中止 =====
//				return null;
//			}
			//[ON推-品向-1153]このチェック処理を外す 2016.05.10 chou Del End

		}

		return null;
	}

	//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 修正 Start
	/**
	 * <h2>在庫移動指示登録データの設定。</h2>
	 * <pre>
	 * </pre>
	 * @param headData 補充指示一覧画面用DTOのヘッダ
	 * @param bodyData 補充指示一覧画面用DTOのボディ
	 * @param headerList           在庫移動指示ヘッダのリスト
	 * @param tMoveInstBLists      在庫移動指示ボディの複数のリスト
	 * @return void
	 * @throws ParseException
	 */
	private void setupRegisterData(ReplenishInstListHeadData headData, ReplenishInstListBodyData bodyData, List<TMoveInstH> headerList, List<List<TMoveInstB>> tMoveInstBLists) throws ParseException {

		// 荷主マスタ検索で荷主IDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(headData.getClientCd_H());
		Long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		// センタマスタ検索でセンタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(headData.getCenterCd_H());
		Long centerId = centerLogic.getUkEntity(centerCondition).getCenterId();

		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		MParam mpm = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		//定期補充単位区分(0：必要数 1：最大格納数荷姿切り上げ)
		String rgReplenishUnitCls = "";
		if (mpm != null){
			rgReplenishUnitCls = mpm.getRgReplenishUnitCls();
		}

		TStock tstockCond = new TStock();
		tstockCond.setClientId(clientId);// 荷主IDの設定
		tstockCond.setProductId(bodyData.getProductId());// 商品IDの設定
		tstockCond.setStockTypeId(bodyData.getStockTypeId());// 在庫区分IDの設定
		tstockCond.setDepositId(bodyData.getDepositId());// 預託IDの設定
		tstockCond.setDelFlg("0");// 削除フラグの設定

		MLocation mLocationCond = new MLocation();
		mLocationCond.setCenterId(centerId);// センタIDの設定
		mLocationCond.setDelFlg("0");// 削除フラグの設定

		//補充指示一覧の補充指示数
		BigDecimal replenishInstNum = bodyData.getReplenishInstNum();

		//====== 補充指示一覧で選択された補充先ロケーションに対して、======
		//====== その補充元ロケーションの在庫情報を取得する。        ======
		List<TStock> stockDataList =  this.replenishInstSelectLogic.getStockInfo(tstockCond, mLocationCond);

		if (stockDataList.size() == 0) {
			// 補充元在庫なし
			//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.09 chou 削除 Start
			//getErrorManager().add(this.errRetSts(StatusCode.REPLENISH_INST_ERROR), WmsMessageConst.REPLENISHMENT_STOCK_NOT_FOUND_ERROR);
			//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.09 chou 削除 End
			return;
		}

		BigDecimal replenishFromStockNum = WCC.ZERO;
		for(TStock tsk : stockDataList) {
			replenishFromStockNum = WCC.add(replenishFromStockNum, tsk.getChargeNum());
		}

		//実際に補充指示数＞補充元在庫数の場合、補充不可とする。
		if(WCC.isGreaterThan(replenishInstNum, replenishFromStockNum)){
			return;
		}

		for(TStock tsk : stockDataList) {

			//登録用の在庫移動指示ボディデータ(補充元－出庫分)
			List<TMoveInstB> list = new ArrayList<TMoveInstB>();

			// ===== 登録する補充指示情報を設定する =====

			TMoveInstB tMoveInstB1 = new TMoveInstB();//補充元データ(出庫)
			TMoveInstB tMoveInstB2 = new TMoveInstB();//補充先データ(入庫)

			// 在庫移動指示ステータス(01: 移動中)
			tMoveInstB1.setMoveInstStatus_$01();
			tMoveInstB2.setMoveInstStatus_$01();
			// ロケーションID
			tMoveInstB1.setLocationId(tsk.getLocationId());
			tMoveInstB2.setLocationId(bodyData.getReplenishToLocationId());
			// ロケーションCD
			tMoveInstB1.setLocationCd(tsk.getMLocation().getLocationCd());
			tMoveInstB2.setLocationCd(bodyData.getReplenishToLocationCd());
			// 商品ID
			tMoveInstB1.setProductId(tsk.getProductId());
			tMoveInstB2.setProductId(bodyData.getProductId());
			// 商品CD
			tMoveInstB1.setProductCd(tsk.getMProduct().getProductCd());
			tMoveInstB2.setProductCd(bodyData.getProductCd());
			// 在庫区分ID
			tMoveInstB1.setStockTypeId(tsk.getStockTypeId());
			tMoveInstB2.setStockTypeId(bodyData.getStockTypeId());
			// 在庫区分CD
			tMoveInstB1.setStockTypeCd(tsk.getMStockType().getStockTypeCd());
			tMoveInstB2.setStockTypeCd(bodyData.getStockTypeCd());
			// 倉庫ID
			tMoveInstB1.setWarehouseId(tsk.getWarehouseId());
			tMoveInstB2.setWarehouseId(bodyData.getWarehouseId());
			// 倉庫CD
			tMoveInstB1.setWarehouseCd(tsk.getMWarehouse().getWarehouseCd());
			tMoveInstB2.setWarehouseCd(bodyData.getWarehouseCd());
			// 荷姿ID
			tMoveInstB1.setShapeId(tsk.getShapeId());
			tMoveInstB2.setShapeId(tsk.getShapeId());
			// 荷姿CD
			tMoveInstB1.setShapeCd(tsk.getMShape().getShapeCd());
			tMoveInstB2.setShapeCd(tsk.getMShape().getShapeCd());
			// 入出庫区分
			tMoveInstB1.setInoutType("1");//(1: 出庫)
			tMoveInstB2.setInoutType("0");//(0: 入庫)
			// 入数
			tMoveInstB1.setUnitNum(tsk.getUnitNum());
			tMoveInstB2.setUnitNum(tsk.getUnitNum());
			// 預託ID
			tMoveInstB1.setDepositId(tsk.getDepositId());
			tMoveInstB2.setDepositId(bodyData.getDepositId());
			// 預託CD
			tMoveInstB1.setDepositCd(tsk.getMCustomer().getCustomerCd());
			tMoveInstB2.setDepositCd(bodyData.getDepositCd());
			//[Ver1.1.4][ON推] 重複設定があった為、削除 2016.03.11 chou 削除 Start
//			// 入庫No.ID
//			tMoveInstB1.setStoreNoId(tsk.getTStoreNo().getStoreNoId());
//			tMoveInstB2.setStoreNoId(tsk.getTStoreNo().getStoreNoId());
			//[Ver1.1.4][ON推] 重複設定があった為、削除 2016.03.11 chou 削除 End
			// ロットID
			tMoveInstB1.setLotId(tsk.getLotId());
			tMoveInstB2.setLotId(tsk.getLotId());
			// ロット
			tMoveInstB1.setLot(tsk.getTLot().getLot());
			tMoveInstB2.setLot(tsk.getTLot().getLot());
			// 期限日
			tMoveInstB1.setLimitDt(tsk.getTLot().getLimitDt());
			tMoveInstB2.setLimitDt(tsk.getTLot().getLimitDt());
			// 入庫No.ID
			tMoveInstB1.setStoreNoId(tsk.getStoreNoId());

			//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 修正 Start
			tMoveInstB2.setStoreNoId(null);
			//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 修正 End

			// 入庫ラベルNo.
			tMoveInstB1.setStoreLabelNo(tsk.getTStoreNo().getStoreLabelNo());

			//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 修正 Start
			//入出庫区分:入庫の場合、入庫ラベルNo.を新しく採番して設定
			tMoveInstB2.setStoreLabelNo(storeLabelNoNumberingLogic.numbering());
			//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 修正 End

			// 入庫日
			tMoveInstB1.setStoreDt(tsk.getTStoreNo().getStoreDt());
			tMoveInstB2.setStoreDt(tsk.getTStoreNo().getStoreDt());
			// 仕入先ID
			tMoveInstB1.setSupplierId(tsk.getTStoreNo().getSupplierId());
			tMoveInstB2.setSupplierId(tsk.getTStoreNo().getSupplierId());
			// 仕入先CD
			tMoveInstB1.setSupplierCd(tsk.getTStoreNo().getMCustomer() != null ? tsk.getTStoreNo().getMCustomer().getCustomerCd() : null);
			tMoveInstB2.setSupplierCd(tsk.getTStoreNo().getMCustomer() != null ? tsk.getTStoreNo().getMCustomer().getCustomerCd() : null);
			// 引当可能数
			BigDecimal chargeNum = tsk.getChargeNum();
			//最大格納数荷姿切り上げの場合に、入数単位で在庫を引く事
			if("1".equals(rgReplenishUnitCls)) {
				if(bodyData.getUnitNum() > 0L) {
					BigDecimal num = WCC.divide(chargeNum, bodyData.getUnitNum());//入数の整数倍数を取得
					if(WCC.isPositive(num)) {
						chargeNum = WCC.multiply(bodyData.getUnitNum(), num);
					}else {
						continue;//次の在庫への引当処理を行う
					}
				}
			}

			// 差額
			BigDecimal difference = WCC.subtract(chargeNum, replenishInstNum);
			if(WCC.isZeroOrGreater(difference)) {//引当可能数 ≧ 補充指示数の場合、補充指示一覧の補充指示数を指示数とする
				// 指示数
				tMoveInstB1.setInstNum(replenishInstNum);
				tMoveInstB2.setInstNum(replenishInstNum);
				list.add(tMoveInstB1);
				list.add(tMoveInstB2);

				//リストにヘッダデータを追加
				headerList.add(this.setupMoveInstHeadData(mClientCenter));

				//リストにボディリストを追加
				tMoveInstBLists.add(list);

				//処理を抜ける
				break;

			}else {//引当可能数 ＜ 補充指示数の場合、引当可能数を指示数とする

				// 指示数
				tMoveInstB1.setInstNum(chargeNum);
				tMoveInstB2.setInstNum(chargeNum);

				list.add(tMoveInstB1);
				list.add(tMoveInstB2);

				//リストにヘッダデータを追加
				headerList.add(this.setupMoveInstHeadData(mClientCenter));
				//[Ver1.1.4][ON推-補充処理の不具合] 2016.01.29 chou 追加 End

				//リストにボディリストを追加
				tMoveInstBLists.add(list);

				replenishInstNum = WCC.multiply(difference, WCC.MINUS_ONE);//正数にする
			}

		}

	}
	//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 修正 End

	//[Ver1.1.4][ON推-補充処理の不具合] 2016.01.29 chou 追加 Start
	/**
	 * <h2>在庫移動指示ヘッダデータの作成。</h2>
	 * <pre>
	 * </pre>
	 * @param mClientCenter 荷主センタマスタ
	 * @return TMoveInstH
	 */
	private TMoveInstH setupMoveInstHeadData(MClientCenter mClientCenter) {
		//登録用の在庫移動指示ヘッダデータ
		TMoveInstH tMoveInstH = new TMoveInstH();

		String sysDate = mClientCenter.getSystemDt();

		//システム管理日付
		String inst_Dt = "";

		try {
			inst_Dt = CommonUtil.dateToString(CommonUtil.stringToDate(sysDate));
		} catch (Exception e) {
			getErrorManager().throwException(e);
		}

		MProcessType mProcessType = new MProcessType();
		mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$32.code());//処理区分CDが32:定期補充
		mProcessType = processTypeLogic.getUkEntity(mProcessType);

		// 指示日
		tMoveInstH.setInstDt(inst_Dt);//システム管理日付で設定

		// WMS在庫移動伝票No.を登録する直前に採番
		String moveSlipNo = numberingCenterLogic.getNumbering(mClientCenter.getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);
		tMoveInstH.setMoveSlipNo(moveSlipNo);// WMS在庫移動伝票No.

		// 荷主ID
		tMoveInstH.setClientId(mClientCenter.getClientId());
		// センタID
		tMoveInstH.setCenterId(mClientCenter.getCenterId());
		// 処理区分ID
		tMoveInstH.setProcessTypeId(mProcessType.getProcessTypeId());
		// 入力区分（00: 画面入力）
		tMoveInstH.setInputType_$00();
		// 在庫移動指示ステータス(01: 移動中)
		tMoveInstH.setMoveInstStatus_$01();

		return tMoveInstH;
	}
	//[Ver1.1.4][ON推-補充処理の不具合] 2016.01.29 chou 追加 End
	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 Start
	/**
	 * <h2>商品ID、ロケーションID、在庫区分ID、預託IDのリストを取得。</h2>
	 *
	 * <pre></pre>
	 * @param list 補充指示一覧データリスト
	 * @param type 処理区分（1:商品IDを取得する場合  2:ロケーションIDを取得する場合  3:在庫区分IDを取得する場合  4:預託IDを取得する場合）
	 *
	 * @return Collection<Long> ID情報のリスト
	 */
	public Collection<Long> getIdList(List<ReplenishInstListBodyData> list, int type){
		Collection<Long> idList = new HashSet<Long>();

		for (ReplenishInstListBodyData data : list){
			if (type == 1){
				idList.add(data.getProductId());
			}else if (type == 2){
				idList.add(data.getReplenishToLocationId());
			}else if (type == 3){
				idList.add(data.getStockTypeId());
			}else if (type == 4){
				idList.add(data.getDepositId());
			}else{
				return null;
			}

		}
		return idList;
	}
	//[Ver1.1.4][ON推-補充指示一覧検索の不具合] 2016.02.02 chou 追加 End

}
