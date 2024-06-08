package com.oneslogi.wms.resources.inventory;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
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
import com.oneslogi.base.dbflute.exentity.TInventoryR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.inventory.InventoryWorkListPrintDto;
import com.oneslogi.wms.dto.report.InventoryWorkListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryWorkListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸作業リスト発行に必要な各種情報を取得するクラス。
 */
@Path("/inventory/inventoryWorkListPrint")
public class InventoryWorkListPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "InventoryWorkList";

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
		 * 棚卸作業リスト発行データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 棚卸帳票更新異常
		 */
		protected static final int INVENTORY_REPORT_UPDATE_FAILED = 3;
	}

	@Inject
	private TInventoryRBhv tInventoryRBhv;
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
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private InventoryWorkListPrintLogic inventoryWorkListPrintLogic;
	@Inject
	private MZoneBhv mZoneBhv;
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja Start
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Delete
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja End
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
	 * @return InventoryWorkListPrintDto 棚卸作業リスト画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryWorkListPrintDto init() {
		InventoryWorkListPrintDto dto = new InventoryWorkListPrintDto();

		// 発行帳票を指定
		dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return dto;
	}

	/**
	 * <h2>棚卸作業リスト発行。</h2>
	 * <pre>
	 * ・コントロールNo.を更新してから、棚卸作業リストデータを取得する
	 * ・帳票を発行する
	 * ・エラーがない場合は、データベースに棚卸帳票データを更新する
	 * ・・棚卸作業リスト出力フラグ
	 * </pre>
	 * @param inventoryWorkListPrintDto 棚卸作業リスト画面用DTO
	 * @return InventoryWorkListPrintDto 棚卸作業リスト画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public InventoryWorkListPrintDto print(final InventoryWorkListPrintDto inventoryWorkListPrintDto) throws Exception {

		// 発行帳票を指定
		inventoryWorkListPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		// コントロールNo更新データの組み立てのチェックデータ編集
		// 棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH headerData = headerMapper.mappingToEntity(inventoryWorkListPrintDto.data.head);
		// 棚卸ボディ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB bodyData = bodyMapper.mappingToEntity(inventoryWorkListPrintDto.data.body);
		// 棚卸指示
		TInventoryInstDtoMapper instMappet  = new TInventoryInstDtoMapper();
		TInventoryInst instData = instMappet.mappingToEntity(inventoryWorkListPrintDto.data.inst);

		// マスタ検索で必要なIDの取得
		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(headerData.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		// [#1760] 棚卸作業リストの入数が0になる問題を修正 2017.05.09 kawana Start
		headerData.setMClient(mClient);
		// [#1760] 棚卸作業リストの入数が0になる問題を修正 2017.05.09 kawana End
		headerData.setClientId(mClient.getClientId());
		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(headerData.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		// [#1760] 棚卸作業リストの入数が0になる問題を修正 2017.05.09 kawana Start
		headerData.setMCenter(mCenter);
		// [#1760] 棚卸作業リストの入数が0になる問題を修正 2017.05.09 kawana End
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

		// 倉庫ID
		if (!CU.isNullOrEmpty(bodyData.getMWarehouse().getWarehouseCd())) {
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(bodyData.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			bodyData.setWarehouseId(mWarehouse.getWarehouseId());
		}
		// 預託ID取得
		if (!CU.isNullOrEmpty(bodyData.getMCustomerByDepositId().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(headerData.getClientId());
			mCustomer.setCustomerCd(bodyData.getMCustomerByDepositId().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			bodyData.setDepositId(mCustomer.getCustomerId());
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

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// コントロールNo更新データの組み立てのチェックデータ編集
		headerData.setControlNo(controlNo);
		bodyData.setControlNo(controlNo);
		instData.setControlNo(controlNo);

		// 棚卸帳票更新用エンティティ編集
		TInventoryR reportDataD = tInventoryRBhv.newMyEntity();
		reportDataD.setControlNo(controlNo);

		// 棚卸作業リスト発行クラス.コントロールNo.更新メソッドを呼出し

		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		inventoryWorkListPrintLogic.updateControlNo(headerData, bodyData, instData, reportDataD,zoneIdList, errRetSts(StatusCode.INVENTORY_REPORT_UPDATE_FAILED));
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 棚卸作業リストデータの取得
		// 棚卸作業リスト発行クラス.作業データ取得メソッドを呼出し
		List<TInventoryB> tInventoryBList = inventoryWorkListPrintLogic.select(reportDataD, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 帳票出力データ取得処理
		//荷主センタ変更対応 2017.01.27 sja Start
//		List<InventoryWorkListDto> dataList = getPrintData(tInventoryBList,instData.getStockExistOnlyFlg());
		List<InventoryWorkListDto> dataList = getPrintData(tInventoryBList,instData.getStockExistOnlyFlg(),headerData.getMCenter());
		//荷主センタ変更対応 2017.01.27 sja End
		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//棚卸差異帳票を発行する
		inventoryWorkListPrintDto.printBasicData.outputData = json.format(dataList);
		printLogic.print(inventoryWorkListPrintDto);

		InventoryWorkListPrintDto ret = new InventoryWorkListPrintDto();
		ret.output = inventoryWorkListPrintDto.output;

		// 棚卸帳票の出力情報の更新処理（ロジッククラスを呼ぶ）
		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		TInventoryR updateEntity = tInventoryRBhv.newMyEntity();
		updateEntity.setControlNo(null);
		updateEntity.setTwlOutFlg_$1();
		updateEntity.setTwlOutUserId(this.getUserId());
		updateEntity.setTwlOutDt(new Timestamp(new Date().getTime()));;
		// 棚卸作業リスト発行クラス.帳票出力情報更新メソッドを呼出し
		inventoryWorkListPrintLogic.updateOutFlg(reportDataD, updateEntity, errRetSts(StatusCode.INVENTORY_REPORT_UPDATE_FAILED));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return ret;
	}

	/**
	 * <h2>棚卸作業リスト発行データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・棚卸作業リスト発行データを取得する
	 * </pre>
	 * @param List<TInventoryB> 棚卸ボディ
	 * @param stockExistOnlyFlg 画面.在庫数表示あり
	 * @return List<InventoryWorkListDto> 棚卸作業リスト帳票用DTO
	 * @throws Exception
	 */
	// 棚卸作業リストデータ抽出
	//荷主センタ変更対応 2017.01.27 sja Start
//	private List<InventoryWorkListDto> getPrintData(List<TInventoryB> list, String stockExistOnlyFlg) {
	private List<InventoryWorkListDto> getPrintData(List<TInventoryB> list, String stockExistOnlyFlg,MCenter mCenter) {
	//荷主センタ変更対応 2017.01.27 sja End
		List<InventoryWorkListDto> retList = new ArrayList<InventoryWorkListDto>();

		for (TInventoryB tInventoryB : list) {
			InventoryWorkListDto dto = new InventoryWorkListDto();
			dto.cultureId = getCultureId();

			// ヘッダ部
			TInventoryH tInventoryH = tInventoryB.chaseTInventoryH();
			dto.clientCd = tInventoryH.chaseMClient().getClientCd();
			dto.clientNm = tInventoryH.chaseMClient().getClientAbbr();
			dto.centerCd = tInventoryH.chaseMCenter().getCenterCd();
			dto.centerNm = tInventoryH.chaseMCenter().getCenterAbbr();
			dto.warehouseCd = tInventoryB.chaseMWarehouse().getWarehouseCd();
			dto.warehouseNm = tInventoryB.chaseMWarehouse().getWarehouseAbbr();
			dto.zoneCd = tInventoryB.chaseMLocation().chaseMZone().getZoneCd();
			dto.inventoryDt = tInventoryH.getInventoryDt();
			dto.stockTypeCd = tInventoryB.chaseMStockType().getStockTypeCd();
			dto.stockTypeNm = tInventoryB.chaseMStockType().chaseVDict().getDictNm();
			dto.depositCd = tInventoryB.chaseMCustomerByDepositId().getCustomerCd();
			dto.depositNm = tInventoryB.chaseMCustomerByDepositId().getCustomerAbbr();

			// ボディ部
			dto.locationCd = tInventoryB.chaseMLocation().getLocationCd();
			dto.locationNm = tInventoryB.chaseMLocation().getLocationNm();
			dto.productCd = tInventoryB.chaseMProduct().getProductCd();
			dto.productNm = tInventoryB.chaseMProduct().getProductAbbr();
			dto.janCd = tInventoryB.chaseMProduct().getJanCd();
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja Start
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
			dto.unitNum = tInventoryB.chaseTStock().getUnitNum();
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja End
			dto.storeNo = tInventoryB.chaseTStoreNo().getStoreNoId();
			dto.storeLabelNo = tInventoryB.chaseTStoreNo().getStoreLabelNo();
			//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
			dto.storeDt = tInventoryB.chaseTStoreNo().getStoreDt();
			dto.storeNoFlg = this.storeNoFlg;
			//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End
			dto.stockNum = tInventoryB.getChargeNum();
			// 2014/10/27 新ｿﾘ-038 add start
			dto.allocNum = tInventoryB.getAllocNum();
			// 2014/10/27 新ｿﾘ-038 add end
			dto.limitDt = tInventoryB.getLimitDt();
			dto.lot = tInventoryB.getLot();
			dto.stockExistOnlyFlg = stockExistOnlyFlg;
			// 作業中数を追加する 2015.11.13 hayashi Start
			dto.moveNum = tInventoryB.getMoveNum();
			// 作業中数を追加する 2015.11.13 hayashi End

			// [Ver3.0] unit of measure対応 2017.11.21 REN Start
			//内訳
			dto.setBreakdown(tInventoryB.getBreakdown());

			//入数
			dto.setStringUnitNum(tInventoryB.getStringUnitNum());

			//最小梱包単位
			dto.setMinimumPackingUnit(tInventoryB.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.21 REN End

			retList.add(dto);
		}

		return retList;
	}

}
