package com.oneslogi.wms.resources.inventory;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.inventory.InventoryDiffListPrintDto;
import com.oneslogi.wms.dto.report.InventoryDiffListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryDiffListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸差異リスト出力に必要な各種情報を取得するクラス。
 */
@Path("/inventory/inventoryDiffListPrint")
public class InventoryDiffListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "InventoryDiffList";

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
		 * 棚卸差異リスト発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private InventoryDiffListPrintLogic inventoryDiffListPrintLogic;
	@Inject
	private MZoneBhv mZoneBhv;
	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
	@Inject
	private ParamLogic paramLogic;

	//入庫No.管理フラグ
	private String storeNoFlg;
	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryDiffListPrintDto 棚卸差異リスト画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryDiffListPrintDto init() {
		InventoryDiffListPrintDto dto = new InventoryDiffListPrintDto();

		// 発行帳票を指定
		dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return dto;
	}

	/**
	 * <h2>棚卸差異リスト発行。</h2>
	 * <pre>
	 * ・棚卸差異リストデータを取得する
	 * ・帳票を発行する
	 * </pre>
	 * @param inventoryDiffListPrintDto 棚卸差異リスト発行画面用DTO
	 * @return InventoryDiffListPrintDto 棚卸差異リスト発行画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public InventoryDiffListPrintDto print(final InventoryDiffListPrintDto inventoryDiffListPrintDto) throws Exception {

		// 発行帳票を指定
		inventoryDiffListPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		List<TInventoryB> tInventoryBList = new ArrayList<TInventoryB>();

		// ===== 棚卸差異リストデータの取得 =====
		// 棚卸差異リストデータの取得のパラメータ編集
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH headerData = headerMapper.mappingToEntity(inventoryDiffListPrintDto.data.head);

		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB bodyData = bodyMapper.mappingToEntity(inventoryDiffListPrintDto.data.body);

		TInventoryInstDtoMapper instMappet  = new TInventoryInstDtoMapper();
		TInventoryInst instData = instMappet.mappingToEntity(inventoryDiffListPrintDto.data.inst);

		// マスタ検索で必要なIDの取得
		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(headerData.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		headerData.setClientId(mClient.getClientId());
		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(headerData.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		headerData.setCenterId(mCenter.getCenterId());

		//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
		MClientCenter mcc = new MClientCenter();
		mcc.setClientId(mClient.getClientId());
		mcc.setCenterId(mCenter.getCenterId());

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);
		if (mParam != null) {
			//入庫No.管理フラグ
			this.storeNoFlg = mParam.getStoreNoFlg();
		}
		//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

		// 預託ID取得
		if (!CU.isNullOrEmpty(bodyData.getMCustomerByDepositId().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(headerData.getClientId());
			mCustomer.setCustomerCd(bodyData.getMCustomerByDepositId().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			bodyData.setDepositId(mCustomer.getCustomerId());
		}
		// 倉庫ID
		if (!CU.isNullOrEmpty(bodyData.getMWarehouse().getWarehouseCd())) {
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(bodyData.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			bodyData.setWarehouseId(mWarehouse.getWarehouseId());
		}
		// 在庫区分ID
		if (!CU.isNullOrEmpty(bodyData.getMStockType().getStockTypeCd())) {
			MStockType mStockType = new MStockType();
//			mStockType.setClientId(headerData.getClientId());
			mStockType.setStockTypeCd(bodyData.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			bodyData.setStockTypeId(mStockType.getStockTypeId());
		}
		// 商品ID
		if (!CU.isNullOrEmpty(bodyData.getMProduct().getProductCd())) {
			MProduct mProduct = new MProduct();
			mProduct.setClientId(headerData.getClientId());
			mProduct.setProductCd(bodyData.getMProduct().getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);
			if (mProduct != null ) {
				bodyData.setProductId(mProduct.getProductId());
			} else {
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
		}
		// ゾーンID
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		List<Long> zoneIdList = new ArrayList<Long>();
		if (!CU.isNullOrEmpty(instData.getMZone().getZoneCd())) {
			MZoneCB mZoneCB = mZoneBhv.newConditionBean();
			mZoneCB.query().setZoneCd_Equal(instData.getMZone().getZoneCd());
			List<MZone> mzoneList = mZoneBhv.selectList(mZoneCB);
			// ゾーンIDリストをセット
			for (MZone mZone : mzoneList) {
				zoneIdList.add(mZone.getZoneId());
			}
		}
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		// ピース差異
		instData.setPieceQty(CommonUtil.nullToZero(instData.getPieceQty()));
		// ケース差異
		instData.setCaseQty(CommonUtil.nullToZero(instData.getCaseQty()));

		// 在棚卸差異リストデータ取得クラス.作業データ取得メソッドを呼出し
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		tInventoryBList = inventoryDiffListPrintLogic.select(headerData,bodyData,instData,zoneIdList,errRetSts(StatusCode.NOT_FOUND_DATA));
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		List<InventoryDiffListDto> dataList = getPrintData(tInventoryBList);

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//棚卸差異帳票を発行する
		inventoryDiffListPrintDto.printBasicData.outputData = json.format(dataList);
		printLogic.print(inventoryDiffListPrintDto);

		InventoryDiffListPrintDto ret = new InventoryDiffListPrintDto();
		ret.output = inventoryDiffListPrintDto.output;

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return ret;
	}

	/**
	 * <h2>棚卸差異リスト発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・棚卸差異リスト発行データを取得する
	 * </pre>
	 * @param List<TInventoryB> 棚卸ボディ
	 * @return List<InventoryDiffListDto> 棚卸差異リスト帳票用DTO
	 * @throws Exception
	 */
	private List<InventoryDiffListDto> getPrintData(List<TInventoryB> list) {

		List<InventoryDiffListDto> retList = new ArrayList<InventoryDiffListDto>();

		for (TInventoryB tInventoryB : list) {
			InventoryDiffListDto dto = new InventoryDiffListDto();
			dto.cultureId = getCultureId();

			// ヘッダ部
			TInventoryH tInventoryH = tInventoryB.chaseTInventoryH();
			dto.clientCd = tInventoryH.chaseMClient().getClientCd();
			dto.clientNm = tInventoryH.chaseMClient().getClientAbbr();
			dto.centerCd = tInventoryH.chaseMCenter().getCenterCd();
			dto.centerNm = tInventoryH.chaseMCenter().getCenterAbbr();
			dto.warehouseCd = tInventoryB.chaseMWarehouse().getWarehouseCd();
			dto.warehouseNm = tInventoryB.chaseMWarehouse().getWarehouseAbbr();
			dto.inventoryDt = tInventoryH.getInventoryDt();
			dto.stockTypeCd = tInventoryB.chaseMStockType().getStockTypeCd();
			dto.stockTypeNm = tInventoryB.chaseMStockType().chaseVDict().getDictNm();
			dto.depositCd = tInventoryB.chaseMCustomerByDepositId().getCustomerCd();
			dto.depositNm = tInventoryB.chaseMCustomerByDepositId().getCustomerAbbr();

			// ボディ部
			dto.productCd = tInventoryB.chaseMProduct().getProductCd();
			dto.productNm = tInventoryB.chaseMProduct().getProductAbbr();
			dto.janCd = tInventoryB.chaseMProduct().getJanCd();
			dto.storeNo = tInventoryB.chaseTStoreNo().getStoreNoId();
			dto.storeLabelNo = tInventoryB.chaseTStoreNo().getStoreLabelNo();
			//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
			dto.storeDt = tInventoryB.chaseTStoreNo().getStoreDt();
			dto.storeNoFlg = this.storeNoFlg;
			//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

			// [Ver3.0] unit of measure対応 2017.11.29 REN Start
			//在庫内訳
			dto.setStockBreakdown(tInventoryB.getStockBreakdown());

			//棚卸内訳
			dto.setInventoryBreakdown(tInventoryB.getInventoryBreakdown());

			//入数
			dto.setStringUnitNum(tInventoryB.getStringUnitNum());

			//最小梱包単位
			dto.setMinimumPackingUnit(tInventoryB.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.29 REN End
			dto.limitDt = tInventoryB.getLimitDt();
			dto.lot = tInventoryB.getLot();
			dto.locationCd = tInventoryB.chaseMLocation().getLocationCd();
			dto.locationNm = tInventoryB.chaseMLocation().getLocationNm();
			dto.stockNum = tInventoryB.getChargeNum();
			dto.inventoryNum = tInventoryB.getInventoryNum();
			if (CommonUtil.nullToZero(tInventoryB.getShapeUnitNum()).compareTo(0l) == 0) {
				dto.unitNum = 0l;
				// [#2962][Ver3.0] 不要なピース・ケース換算処理(DTOへの追加)を削除 2018.02.19 miyabe Delete
			} else {
				dto.unitNum = tInventoryB.getShapeUnitNum();
				// [#2962][Ver3.0] 不要なピース・ケース換算処理(DTOへの追加)を削除 2018.02.19 miyabe Delete
			}
			dto.diffNum = tInventoryB.getNumDiff();

			retList.add(dto);

		}

		return retList;
	}

}
