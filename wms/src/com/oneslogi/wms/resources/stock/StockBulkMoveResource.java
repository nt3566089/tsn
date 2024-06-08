package com.oneslogi.wms.resources.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStockReportDto;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StoreLabelNoNumberingLogic;
import com.oneslogi.wms.dto.stock.StockBulkMoveDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.stock.StockTransferInstructionLogic;
import com.oneslogi.wms.logic.stock.StockTransferResultLogic;
import com.oneslogi.wms.logic.stock.StockTransferStatusUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/stock/stockBulkMove")
public class StockBulkMoveResource extends AbstractWmsResource {

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
		 * 在庫移動データ登録エラー
		 */
		protected static final int T_STOCK_INSERT_FALED = 2;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND = 3;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 4;
		/**
		 * 倉庫CDが同じでない
		 */
		protected static final int LOCATION_IN_WAREHOUSE_NOT_FOUND = 5;
		/**
		 * 取引先マスタ存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND = 6;
	}

	// ===== メンバ変数 =====
	/**
	 * データ入力チェックの結果（登録）
	 */
	protected enum ResultSetupRegisterData {
		ALL_OK,
		ERROR
	}

	/**
	 * 登録データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private StockTransferResultLogic stocktransferResult;
	@Inject
	private StockTransferStatusUpdateLogic stocktransferStatusUpdate;
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;
	@Inject
	private StockTransferInstructionLogic stocktransferInstruction;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockBulkMoveDto 在庫一括移動指示画面用DTO
	 */
	@GET
	@Path("/init")
	public StockBulkMoveDto init() {

		// 画面用DTO作成
		StockBulkMoveDto StockBulkMoveDto = new StockBulkMoveDto();

		return StockBulkMoveDto;
	}

	/**
	 * <h2>在庫移動対象データ取得処理</h2>
	 * <pre>
	 * 在庫問合せ画面で選択された行を取得する。
	 * </pre>
	 * @param stockBulkMoveDto 在庫一括移動指示画面用DTO
	 * @return StockBulkMoveDto 在庫一括移動指示画面用DTO
	 */
	@GET
	@Path("/getData")
	public StockBulkMoveDto getData(StockBulkMoveDto stockBulkMoveDto) {
		StockBulkMoveDto resultStockBulkMoveDto = new StockBulkMoveDto();

		List<TStockReportDto> list = stockBulkMoveDto.data.head;
		List<TStockDto> body = new ArrayList<TStockDto>();

		// 詰込処理
		for (TStockReportDto tStockReportDto : list) {
			TStockDto tStockDto = new TStockDto();

			tStockDto = tStockReportDto.getTStock();
			tStockDto.setMoveCaseNum(WCC.ZERO);
			tStockDto.setMovePieceNum(WCC.ZERO);
			tStockDto.setMoveInstNum(WCC.ZERO);
		    // [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ start
			tStockDto.setUnitNumBreakdown(tStockReportDto.getUnitNumBreakdown());
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ End
			body.add(tStockDto);
		}

		resultStockBulkMoveDto.data.body = body;
		return resultStockBulkMoveDto;
	}

	/**
	 * <h2>入力チェック処理</h2>
	 * <pre>
	 * 在庫一括移動指示画面で入力された内容をチェックする。
	 * </pre>
	 * @param stockBulkMoveDto 在庫一括移動指示画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(StockBulkMoveDto stockBulkMoveDto) {

		TStockDtoMapper mapper = new TStockDtoMapper();
		List<TStock> list = mapper.mappingToEntityList(stockBulkMoveDto.data.body);

		List<TMoveInstH> headerList = new ArrayList<TMoveInstH>();
		List<List<TMoveInstB>> bodyList = new ArrayList<List<TMoveInstB>>();

		// 更新データを組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(list, headerList, bodyList, errRetSts(StatusCode.T_STOCK_INSERT_FALED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>登録処理</h2>
	 * <pre>
	 * 在庫一括移動指示画面で入力された内容を登録する。
	 * </pre>
	 * @param stockBulkMoveDto 在庫一括移動指示画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(StockBulkMoveDto stockBulkMoveDto) {

		TStockDtoMapper mapper = new TStockDtoMapper();
		List<TStock> list = mapper.mappingToEntityList(stockBulkMoveDto.data.body);

		List<TMoveInstH> headerList = new ArrayList<TMoveInstH>();
		List<List<TMoveInstB>> bodyList = new ArrayList<List<TMoveInstB>>();

		// 更新データを組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(list, headerList, bodyList, errRetSts(StatusCode.T_STOCK_INSERT_FALED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		}

		int index = -1;
		for (TMoveInstH header : headerList) {
			index++;
			// DBに入荷予定を更新
			List<TMoveInstB> bodySubList = new ArrayList<TMoveInstB>();
			bodySubList = bodyList.get(index);

			// ===== 在庫移動指示.在庫移動クラスを呼出し =====
			stocktransferInstruction.stockMove(header, bodySubList, new ErrorStatus());
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== tMoveInstBListのデータ件数分繰返 =====
			for (TMoveInstB body : bodySubList) {
				// ===== 処理区分判定=====

				// ===== tMoveInstBList．入出庫区分が１：出庫の場合 =====
				if (body.isInoutType$1()) {
					// ===== 在庫移動実績.在庫移動［出庫］クラスを呼出し =====
					stocktransferResult.stockMoveOut(header, bodySubList, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return null;
					}

					// ===== 在庫移動ステータス更新.在庫移動［出庫］クラスを呼出し =====
					stocktransferStatusUpdate.stockMoveOut(header, body, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return null;
					}
				}
			}

		}

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		return null;
	}

	/**
	 * <h2>登録データ組立処理</h2>
	 * <pre>
	 * 登録データを組立る。
	 * </pre>
	 * @param list 在庫Dto
	 * @param headerList 在庫移動指示ヘッダDto
	 * @param bodyList 在庫移動指示ボディDto
	 * @param errSts エラーステータス
	 * @return 処理結果
	 */
	protected ResultSetupRegisterData setupRegisterData(List<TStock> list, List<TMoveInstH> headerList, List<List<TMoveInstB>> bodyList, ErrorStatus errSts) {

		ResultSetupRegisterData checkStatus = null;

		// 登録データの組み立て
		ResultSetupData resultSetup = setupData(list, headerList, bodyList, errSts);

		// 結果の詰め替え
		switch (resultSetup) {

		case ALL_OK:
			checkStatus = ResultSetupRegisterData.ALL_OK;
			break;

		case ERROR:
			checkStatus = ResultSetupRegisterData.ERROR;
			break;

		}
		return checkStatus;
	}

	/**
	 * <h2>登録データ組立処理</h2>
	 * <pre>
	 * 登録データを組立る。
	 * </pre>
	 * @param list 在庫Dto
	 * @param headerList 在庫移動指示ヘッダDto
	 * @param bodyList 在庫移動指示ボディDto
	 * @param errSts エラーステータス
	 * @return 処理結果
	 */
	protected ResultSetupData setupData(List<TStock> list, List<TMoveInstH> headerList, List<List<TMoveInstB>> bodyList, ErrorStatus errSts) {

		int rowIndex = -1;
		for (TStock tStock : list) {
			rowIndex++;

			Long clientId = tStock.getMClient().getClientId();
			Long centerId = tStock.getMWarehouse().getMCenter().getCenterId();

			TMoveInstH header = new TMoveInstH();

			header.setClientId(clientId);
			header.setCenterId(centerId);

			//システム管理日付取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(clientId);
			mClientCenter.setCenterId(centerId);
			mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
			String inst_Dt = "";
			try {
				inst_Dt = CommonUtil.dateToString(CommonUtil.stringToDate(mClientCenter.getSystemDt()));
				header.setInstDt(inst_Dt);
			} catch (Exception e) {
				getErrorManager().throwException(e);
			}

			// WMS在庫移動伝票No.を登録する直前に採番
			String moveSlipNo = numberingCenterLogic.getNumbering(centerId, WmsNumberingConst.MOVE_SLIP_NO);
			header.setMoveSlipNo(moveSlipNo);

			MProcessType mProcessType = new MProcessType();
			mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$21.code());
			mProcessType = processTypeLogic.getUkEntity(mProcessType);
			header.setProcessTypeId(mProcessType.getProcessTypeId());

			header.setMoveInstStatus_$00();
			header.setInputType_$00();

			headerList.add(header);

			List<TMoveInstB> bodySubList = new ArrayList<TMoveInstB>();
			TMoveInstB bodyFrom = new TMoveInstB();
			TMoveInstB bodyTo = new TMoveInstB();

			MClientCenter clientCenter = new MClientCenter();
			clientCenter.setClientId(clientId);
			clientCenter.setCenterId(centerId);
			//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL

			// ====== 在庫移動指示ボディ情報の設定（出庫） =======
			bodyFrom.setMoveInstStatus_$00();
			bodyFrom.setInoutType_$1();
			bodyFrom.setWarehouseId(tStock.getMWarehouse().getWarehouseId());
			bodyFrom.setWarehouseCd(tStock.getMWarehouse().getWarehouseCd());
			bodyFrom.setProductId(tStock.getMProduct().getProductId());
			bodyFrom.setProductCd(tStock.getMProduct().getProductCd());
			bodyFrom.setStockTypeId(tStock.getMStockType().getStockTypeId());
			bodyFrom.setStockTypeCd(tStock.getMStockType().getStockTypeCd());
			bodyFrom.setLocationId(tStock.getMLocation().getLocationId());
			bodyFrom.setLocationCd(tStock.getMLocation().getLocationCd());
			bodyFrom.setDepositId(tStock.getMCustomer().getCustomerId());
			bodyFrom.setDepositCd(tStock.getMCustomer().getCustomerCd());
			bodyFrom.setLotId(tStock.getTLot().getLotId());
			bodyFrom.setLot(tStock.getTLot().getLot());
			bodyFrom.setLimitDt(tStock.getTLot().getLimitDt());
			bodyFrom.setStoreNoId(tStock.getTStoreNo().getStoreNoId());
			bodyFrom.setStoreLabelNo(tStock.getTStoreNo().getStoreLabelNo());
			bodyFrom.setStoreDt(tStock.getTStoreNo().getStoreDt());
			if (tStock.getTStoreNo().getMCustomer() != null) {
				bodyFrom.setSupplierId(tStock.getTStoreNo().getMCustomer().getCustomerId());
				bodyFrom.setSupplierCd(tStock.getTStoreNo().getMCustomer().getCustomerCd());
			}
			bodyFrom.setShapeId(tStock.getShapeId());
			//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL
			bodyFrom.setUnitNum(tStock.getUnitNum());
			bodyFrom.setInstNum(tStock.getMoveInstNum());

			// ====== 在庫移動指示ボディ情報の設定（入庫） =======
			bodyTo.setMoveInstStatus_$00();
			bodyTo.setInoutType_$0();
			bodyTo.setWarehouseId(tStock.getMWarehouse().getWarehouseId());
			bodyTo.setWarehouseCd(tStock.getMWarehouse().getWarehouseCd());
			bodyTo.setProductId(tStock.getMProduct().getProductId());
			bodyTo.setProductCd(tStock.getMProduct().getProductCd());
			bodyTo.setStockTypeId(tStock.getMStockType().getStockTypeId());
			bodyTo.setStockTypeCd(tStock.getMStockType().getStockTypeCd());
			MLocation mLocation = new MLocation();
			mLocation.setLocationCd(tStock.getMoveLocationCd());
			mLocation.setCenterId(centerId);
			mLocation = locationLogic.getUkEntity(mLocation, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));
			bodyTo.setLocationCd(tStock.getMoveLocationCd());
			if (mLocation != null) {
				bodyTo.setLocationId(mLocation.getLocationId());
			}
			bodyTo.setDepositId(tStock.getMCustomer().getCustomerId());
			bodyTo.setDepositCd(tStock.getMCustomer().getCustomerCd());
			bodyTo.setLotId(tStock.getTLot().getLotId());
			bodyTo.setLot(tStock.getTLot().getLot());
			bodyTo.setLimitDt(tStock.getTLot().getLimitDt());
			bodyTo.setStoreDt(tStock.getTStoreNo().getStoreDt());
			bodyTo.setStoreLabelNo(storeLabelNoNumberingLogic.numbering());
			if (tStock.getTStoreNo().getMCustomer() != null) {
				bodyTo.setSupplierId(tStock.getTStoreNo().getMCustomer().getCustomerId());
				bodyTo.setSupplierCd(tStock.getTStoreNo().getMCustomer().getCustomerCd());
			}
			bodyTo.setShapeId(tStock.getShapeId());
			//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL
			bodyTo.setUnitNum(tStock.getUnitNum());
			bodyTo.setInstNum(tStock.getMoveInstNum());

			bodySubList.add(bodyFrom);
			bodySubList.add(bodyTo);

			bodyList.add(bodySubList);
		}

		// 結果の設定
		ResultSetupData checkStatus;
		if (getErrorManager().size() > 0) {
			checkStatus = ResultSetupData.ERROR;
		} else {
			checkStatus = ResultSetupData.ALL_OK;
		}

		return checkStatus;
	}

}