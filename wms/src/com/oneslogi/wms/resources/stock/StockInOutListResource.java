package com.oneslogi.wms.resources.stock;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TStockInoutDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.wms.dto.stock.StockInOutListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.StockInOutSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫受払問合せ画面のリソースクラス。
 */
@Path("/stock/stockInOutList")
public class StockInOutListResource extends AbstractWmsResource {

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
		 * 在庫受払データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockInOutSelectLogic selectLogic;
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
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫受払問合せ明細の空行を新規作成
	 * </pre>
	 * @return StockInOutListDto 在庫受払問合せ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public StockInOutListDto initNew() {

		// 画面用DTO作成
		StockInOutListDto stockInOutListDto = new StockInOutListDto();

		return stockInOutListDto;
	}

	/**
	 * <h2>在庫受払データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、在庫受払問合せデータ取得
	 * </pre>
	 * @param stockInOutListDto 在庫受払問合せ画面用DTO
	 * @return StockInOutListDto 在庫受払問合せ画面用DTO
	 * @throws ParseException
	 */
	@GET
	@Path("/search")
	public StockInOutListDto search(StockInOutListDto stockInOutListDto) throws IOException, ParseException {

		StockInOutListDto stockInOutDto = new StockInOutListDto();

		// 在庫受払データ取得の検索データ編集
		TStockInoutDtoMapper headerMapper = new TStockInoutDtoMapper();
		TStockInout header = headerMapper.mappingToEntity(stockInOutListDto.data.head);

		// 在庫受払検索で必要なIDの取得
		TStockInout tStockInout = new TStockInout();

		// センタマスタ検索で必要なIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(header.getCenterCd());
		long centerId = centerLogic.getUkEntity(centerCondition).getCenterId();

		// 処理区分マスタ検索で必要なIDの取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setProcessTypeCd(header.getMProcessType().getProcessTypeCd());
		if (header.getMProcessType().getProcessTypeCd() != null) {
			long processTypeId = processTypeLogic.getUkEntity(processTypeCondition).getProcessTypeId();
			tStockInout.setProcessTypeId(processTypeId);
		}

		tStockInout.setProcessDtFrom(header.getProcessDtFrom());
		//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa

		TStock tstock = new TStock();

		// 荷主マスタ検索で必要なIDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getTStock().getMClient().getClientCd());
		long clientId = clientLogic.getUkEntity(clientCondition).getClientId();
		tstock.setClientId(clientId);

		// 倉庫マスタ検索で必要なIDの取得
		MWarehouse warehouseCondition = new MWarehouse();
		warehouseCondition.setWarehouseCd(header.getTStock().getMWarehouse().getWarehouseCd());
		warehouseCondition.setCenterId(centerId);
		if (header.getTStock().getMWarehouse().getWarehouseCd() != null) {
			long warehouseId = warehouseLogic.getUkEntity(warehouseCondition).getWarehouseId();
			tstock.setWarehouseId(warehouseId);
		}

		// 取引先マスタ検索で必要なIDの取得
		MCustomer customerCondition = new MCustomer();
		customerCondition.setClientId(clientId);
		customerCondition.setCustomerCd(header.getTStock().getMCustomer().getCustomerCd());
		if (header.getTStock().getMCustomer().getCustomerCd() != null) {
			long customerId = customerLogic.getUkEntity(customerCondition).getCustomerId();
			tstock.setDepositId(customerId);
		}

		// 在庫区分マスタ検索で必要なIDの取得
		MStockType stockTypeCondition = new MStockType();
		stockTypeCondition.setStockTypeCd(header.getTStock().getMStockType().getStockTypeCd());
		if (header.getTStock().getMStockType().getStockTypeCd() != null) {
			long stockTypeId = stockTypeLogic.getUkEntity(stockTypeCondition).getStockTypeId();
			tstock.setStockTypeId(stockTypeId);
		}

		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setCenterId(centerId);

		MProduct mProduct = new MProduct();
		//商品CD
		if (header.getProductCd() != null) {
			mProduct.setProductCd(header.getProductCd());
		}
		//ＪＡＮＣＤ
		if (header.getJanCd() != null) {
			mProduct.setJanCd(header.getJanCd());
		}

		MLocation mLocation = new MLocation();
		//ロケーションCD（From）
		if (header.getLocationCdFrom() != null) {
			mLocation.setLocationCdFrom(header.getLocationCdFrom());
		}
		//ロケーションCD（To）
		if (header.getLocationCdTo() != null) {
			mLocation.setLocationCdTo(header.getLocationCdTo());
		}

		TLot tLot = new TLot();
		//期限日(From)
		if (header.getLimitDtFrom() != null) {
			tLot.setLimitDtFrom(header.getLimitDtFrom());
		}
		//期限日(To)
		if (header.getLimitDtTo() != null) {
			tLot.setLimitDtTo(header.getLimitDtTo());
		}
		//ロット
		if (header.getLot() != null) {
			tLot.setLot(header.getLot());
		}

		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);

		// システム管理日付の取得
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		if(mClientCenter.getSystemDt().compareTo(header.getProcessDtTo()) < 0){
			tStockInout.setProcessDtTo(mClientCenter.getSystemDt());
		}else{
			tStockInout.setProcessDtTo(header.getProcessDtTo());
		}

		// 在庫受払問合せデータ取得
		List<StockInOutListDto> list = selectLogic.select(tStockInout, tstock, mWarehouse, mProduct, mLocation, tLot, mClientCenter, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 検索結果詰込処理
		stockInOutDto.data.body = list;

		return stockInOutDto;
	}

}
