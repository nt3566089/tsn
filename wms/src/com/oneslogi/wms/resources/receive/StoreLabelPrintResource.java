package com.oneslogi.wms.resources.receive;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.receive.StoreLabelPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入庫ラベル出力に必要な各種情報を取得するクラス
 *
 */
@Path("/receive/storeLabelPrint")
public class StoreLabelPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "StoreLabel";

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
		 * 入庫ラベル発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana Start
		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
		/**
		 * 入庫ラベル発行異常
		 */
		protected static final int STORE_LABEL_PRINT_FAILED = 3;
		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana End
	}

	// ===== 使用テーブル =====

	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;

	// ===== 使用ロジック =====

	@Inject
	private WarehouseLogic mWarehouseLogic;
	@Inject
	private StoreLabelPrintLogic storeLabelPrintLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ReportLogic reportLogic;
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要な変数numberingCenterLogic, printLogic を削除) 2018.04.27 honma/kawana Delete
	@Inject
	private CustomerLogic mCustomerLogic;


	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return storeLabelPrintDto 入庫ラベル発行画面用DTO
	 */
	@GET
	@Path("/init")
	public StoreLabelPrintDto init() {

		StoreLabelPrintDto storeLabelPrintDto = new StoreLabelPrintDto();

		// 発行帳票を指定
		storeLabelPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return storeLabelPrintDto;
	}

	/**
	 * <h2>入庫ラベル発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに入庫ラベル発行データを取得する
	 * </pre>
	 * @param storeLabelPrintDto 入庫ラベル発行用DTO
	 * @return storeLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public StoreLabelPrintDto select(final StoreLabelPrintDto storeLabelPrintDto) throws Exception {

		// 発行帳票を指定
		storeLabelPrintDto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// Entity変換
		TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper();
		TStoreRecordB entityTStoreRecordB = mapper.mappingToEntity(storeLabelPrintDto.data.search);

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要な処理を削除) 2018.04.27 honma/kawana Delete

		// 入庫実績ヘッダ
		TStoreRecordH tStoreRecordH = tStoreRecordHBhv.newMyEntity();

		//センタID取得
		String centerCd = entityTStoreRecordB.getTStoreRecordH().getMCenter().getCenterCd();

		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(centerCd);

		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tStoreRecordH.setCenterId(mCenter.getCenterId());

		//荷主ID取得
		String clientCd = entityTStoreRecordB.getTStoreRecordH().getMClient().getClientCd();

		MClient mClient = new MClient();

		mClient.setClientCd(clientCd);

		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		tStoreRecordH.setClientId(mClient.getClientId());

		//倉庫ID取得
		MWarehouse mWarehouse = new MWarehouse();

		if(!CU.isNullOrEmpty(entityTStoreRecordB.chaseTReceivePlanB().chaseMWarehouse().getWarehouseCd())){

			mWarehouse.setWarehouseCd(entityTStoreRecordB.chaseTReceivePlanB().chaseMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());

		    mWarehouse = mWarehouseLogic.getUkEntity(mWarehouse);

		    if (mWarehouse == null) {
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}

			tStoreRecordH.setWarehouseId(mWarehouse.getWarehouseId());
		}

		//入庫実績ボディ
		TStoreRecordB tStoreRecordB = tStoreRecordBBhv.newMyEntity();

		tStoreRecordB.setStoreDt(entityTStoreRecordB.getStoreDt());
		// [ON推-品向-601] 帳票データ件数の上限を設定に伴い発行条件を追加 2015.04.16 kawana Start
		tStoreRecordB.setStoreLabelNoFrom(entityTStoreRecordB.getStoreLabelNoFrom());
		tStoreRecordB.setStoreLabelNoTo(entityTStoreRecordB.getStoreLabelNoTo());
		// [ON推-品向-601] 帳票データ件数の上限を設定に伴い発行条件を追加 2015.04.16 kawana End

		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
		// WMS入荷伝票No
		tStoreRecordB.setReceiveSlipNo(entityTStoreRecordB.getTReceivePlanB().getTReceivePlanH().getReceiveSlipNo());
		// 顧客入荷指示No
		tStoreRecordB.setClientReceiveNo(entityTStoreRecordB.getTStoreRecordH().getClientReceiveNo());
		// ユーザCD
		tStoreRecordB.setAddUser(entityTStoreRecordB.getAddUser());

		// 発行条件
		if (!"2".equals(entityTStoreRecordB.getPrintCondition())) {
			tStoreRecordB.setPrintCondition(entityTStoreRecordB.getPrintCondition());
		}
		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

		//取引先マスタ
		MCustomer supplier = new MCustomer();
		if(!CU.isNullOrEmpty(entityTStoreRecordB.getTStoreRecordH().getMCustomerBySupplierId().getCustomerCd())){
			String customerCd = entityTStoreRecordB.getTStoreRecordH().getMCustomerBySupplierId().getCustomerCd();
			supplier.setCustomerCd(customerCd);
			supplier.setClientId(mClient.getClientId());
			supplier = mCustomerLogic.getVendorCustomerByClientCd(supplier, errRetSts(StatusCode.NOT_FOUND_DATA));

			if (supplier == null) {
				return null;
			}
		}

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana Start

		// 対象在庫を検索
		List<TStock> stockList = storeLabelPrintLogic.search(tStoreRecordH, tStoreRecordB, supplier, errRetSts(StatusCode.NOT_FOUND_DATA));
		if (0 < getErrorManager().size()) {
			return null;
		}

		Set<Long> stockIdSet = new HashSet<Long>();
		for (TStock stock : stockList) {

			stockIdSet.add(stock.getStockId());
		}

		// 発行
		storeLabelPrintLogic.printAll(storeLabelPrintDto, tStoreRecordH.getCenterId(), stockIdSet, errRetSts(StatusCode.STORE_LABEL_PRINT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return  storeLabelPrintDto;

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana End
	}
	//[ON推-品向-454] 入庫明細に存在されていない在庫受払は発行させないように修正。 2014.12.25 KI End
}
