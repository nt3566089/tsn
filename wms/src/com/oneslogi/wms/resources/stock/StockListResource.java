package com.oneslogi.wms.resources.stock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.TStockReportDto;
import com.oneslogi.base.dbflute.dtomapper.TStockReportDtoMapper;
import com.oneslogi.base.dbflute.exentity.HStockReport;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockReport;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.stock.StockListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;
import com.oneslogi.wms.logic.stock.StockListLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/stock/stocklist")
public class StockListResource extends AbstractWmsResource {

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

		protected static final int NOT_FOUND_DATA = 2;
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana Start
		// [ON推-品向-986] 入庫ラベル出力フラグの更新処理を追加 2015.11.02 kawana Start
		protected static final int STORE_LABEL_PRINT_FAILED = 3;
		// [ON推-品向-986] 入庫ラベル出力フラグの更新処理を追加 2015.11.02 kawana End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana End
	}

	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
	// 入庫ラベル発行レポートCD
	private static final String STORE_LABEL_REPORT_CD = "StoreLabel";
	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End
	// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start
	private static final String STOCK_LIST_REPORT_CD = "StockListSample";
	// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private WarehouseLogic warehouseLogic;

	@Inject
	private CustomerLogic customerLogic;

	@Inject
	private StockListLogic stockListLogic;

	@Inject
	private ClientCenterLogic clientCenterLogic;

	@Inject
	private StockTypeLogic stockTypeLogic;

	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
	@Inject
	private ReportLogic reportLogic;

	@Inject
	private PrintLogic printLogic;

	@Inject
	private StoreLabelPrintLogic storeLabelPrintLogic;

	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

	// [Ver3.0] unit of measure対応 2017.11.22 駱 Del


	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
	// [#4194][Ver3.0] 入庫ラベル - 入庫ラベル発行データ取得処理共通化 2018.04.02 honma Delete
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End
	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockListDto 現品在庫問合せ画面用DTO
	 */
	@GET
	@Path("/init")
	public StockListDto init() {

		// 画面用DTO作成
		StockListDto stockListDto = new StockListDto();

		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
		// 入庫ラベル発行帳票を指定
		stockListDto.data.storeLabelPrintParam.printBasicData.reportId = reportLogic.getReportId(STORE_LABEL_REPORT_CD);
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End
		// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start
		stockListDto.data.stockListPrintParam.printBasicData.reportId = reportLogic.getReportId(STOCK_LIST_REPORT_CD);
		// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End

		return stockListDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、出庫指示一覧データ取得
	 * </pre>
	 * @param  stockListDto 現品在庫問合せ画面用DTO
	 * @return stockListDto 現品在庫問合せ画面用DTO
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@GET
	@Path("/search")
	public StockListDto search(StockListDto stockListDto) throws ParseException {
		StockListDto resultStockListDto = new StockListDto();

		TStockReportDtoMapper mapper = new TStockReportDtoMapper();
		TStockReport tStockReport = mapper.mappingToEntity(stockListDto.data.head);
		String dt = null  ;
		String dtTemp = null ;
		String limitDtNum = null;
		int limitDtNumTp = 0;
		String dttemp1 = null ;

		String limitDt = null;
		String limitDtTp = null;

		//マスタ検索で必要なIDの取得
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(tStockReport.getTStock().getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

    	//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tStockReport.getTStock().getMWarehouse().getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		//倉庫ID取得
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setWarehouseCd(tStockReport.getTStock().getMWarehouse().getWarehouseCd());
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		//預託ID取得
		MCustomer mCustomer = new MCustomer();
		mCustomer.setClientId(mClient.getClientId());
		mCustomer.setCustomerCd(tStockReport.getTStock().getMCustomer().getCustomerCd());
		mCustomer = customerLogic.getUkEntity(mCustomer);

		//在庫区分ID取得
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(tStockReport.getTStock().getMStockType().getStockTypeCd());
		mStockType = stockTypeLogic.getUkEntity(mStockType);

		// ===== 在庫問合せデータ取得 =====

		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mClient.getClientId());
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// 現品在庫問合せデータの取得

		// 現品在庫問合せデータ取得の検索データ編集
		TStock setTStock = new TStock();
		MProduct setMProduct = new MProduct();
		MLocation setMLocation = new MLocation();
		// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana
		TLot setLot = new TLot();

		// 荷主ID
		setTStock.setClientId(mClient.getClientId());

		// 倉庫ID
		if(mWarehouse != null){
			if(mWarehouse.getWarehouseId() != null){
				setTStock.setWarehouseId(mWarehouse.getWarehouseId());
			}
		}

		// 預託ID
		if(mCustomer != null){
			if(mCustomer.getCustomerId() != null){
				setTStock.setDepositId(mCustomer.getCustomerId());
			}
		}

		// 在庫区分ID
		if(mStockType != null){
			if(mStockType.getStockTypeId() != null){
				setTStock.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
		// 在庫数 0非表示
		setTStock.setStockNumDisplay(tStockReport.chaseTStock().getStockNumDisplay());
		// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

		//引当可能数 0非表示
		if(stockListDto.data.head.getChargeNumDisplay() != null){
			setTStock.setChargeNumDisplay(stockListDto.data.head.getChargeNumDisplay());
		}

		//0非表示
		if(stockListDto.data.head.getDisplay() != null){
			setTStock.setDisplay(stockListDto.data.head.getDisplay());
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// 積送中在庫のみ表示
		setTStock.setTransitDisplay(tStockReport.chaseTStock().getTransitDisplay());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

		// センタID
		if(mClientCenter != null){
			if(mClientCenter.getCenterId() != null){
				mCenter.setCenterId(mClientCenter.getCenterId());
			}
		}

		// 在庫区分
		if(stockListDto.data.head.getStockdisplayfld() != null){
			setTStock.setStockdisplayfld(stockListDto.data.head.getStockdisplayfld());
		}

		// 商品CD
		if(stockListDto.data.head.getTStock().getMProduct().getProductCd() != null){
			setMProduct.setProductCd(stockListDto.data.head.getTStock().getMProduct().getProductCd());
		}

		// JANCD
		if(stockListDto.data.head.getTStock().getMProduct().getJanCd() != null){
			setMProduct.setJanCd(stockListDto.data.head.getTStock().getMProduct().getJanCd());
		}

		// ロケーションCD(From)
		if(stockListDto.data.head.getLocationCdFrom() != null){
			setMLocation.setLocationCdFrom(stockListDto.data.head.getLocationCdFrom());
		}

		// ロケーションCD(To)
		if(stockListDto.data.head.getLocationCdTo() != null){
			setMLocation.setLocationCdTo(stockListDto.data.head.getLocationCdTo());
		}

		// 期限日(From)
		if(stockListDto.data.head.getLimitDtFrom() != null){
			setLot.setLimitDtFrom(stockListDto.data.head.getLimitDtFrom());
		}

		// 期限日(To)
		if(stockListDto.data.head.getLimitDtTo() != null){
			setLot.setLimitDtTo(stockListDto.data.head.getLimitDtTo());
		}

		// 期限日数
		if(stockListDto.data.head.getLimitDtNum() != null){
			setLot.setLimitDtNum(stockListDto.data.head.getLimitDtNum());
		}

		// システム管理日付
		setTStock.setDataTime(tStockReport.getTStock().getDataTime());

		// ロット
		if(stockListDto.data.head.getTStock().getTLot().getLot() != null){
			setLot.setLot(stockListDto.data.head.getTStock().getTLot().getLot());
		}

		limitDtNum = stockListDto.data.head.getLimitDtNum();
		if (limitDtNum != null && !"".equals(limitDtNum)){
			limitDtNumTp = Integer.parseInt(limitDtNum);
		}else{
			limitDtNumTp = 0;
		}

		dtTemp = stockListDto.data.head.getTStock().getDataTime();
		dttemp1 = dtTemp.substring(0,4) + "/" + dtTemp.substring(4,6) + "/" + dtTemp.substring(6,8);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(dttemp1);
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.DAY_OF_MONTH,limitDtNumTp);
		dt = sdf.format(cl.getTime());
		dt = dt.replace("/", "");
		setTStock.setDtAddLdn(dt);

		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
		MZone setZone = tStockReport.chaseTStock().chaseMLocation().chaseMZone();
		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End

		PagingResultBean<TStockReport> page = null;
		PagingResultBean<HStockReport> page1 = null;

		int  limitDtNum1 = 0;
		if(limitDtNum != null && !"".equals(limitDtNum)){
			limitDtNum1 = Integer.parseInt(limitDtNum) ;
		}else{
			limitDtNum1 = 0;
		}

		List<TStockReport> resultTStockReport = new ArrayList<TStockReport>();

		Long shippingLimitNumTp = null;

		if (tStockReport.getTStock().getDataTime().equals(mClientCenter.getSystemDt())) {

			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana Start
			// 現在データの検索を真に設定
			resultStockListDto.data.isSearchCurrentData = true;
			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana End

			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana Start
			page = (PagingResultBean<TStockReport>) stockListLogic.select(setTStock, mCenter, setMProduct, setMLocation, setZone, setLot, stockListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana End
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			if(page.size() > 0){
				for(int i = 0; i < page.size(); i++ ){
					if(page.get(i).getTStock().getTLot().getLimitDt() != null){
						shippingLimitNumTp =  page.get(i).getTStock().getMProduct().getShippingLimitNum();
						limitDt = page.get(i).getTStock().getTLot().getLimitDt();
						limitDtTp = limitDt.substring(0,4) + "/" + limitDt.substring(4,6) + "/" + limitDt.substring(6,8);
						SimpleDateFormat sdfT = new SimpleDateFormat("yyyy/MM/dd");
						Date dateT = sdfT.parse(limitDtTp);
						Calendar clT = Calendar.getInstance();
						clT.setTime(dateT);
						if(shippingLimitNumTp != null){
							clT.add(Calendar.DAY_OF_MONTH,-Integer.parseInt(String.valueOf(shippingLimitNumTp)));
						}
					    String dt1 = sdfT.format(clT.getTime());
						dt1 = dt1.replace("/", "");
						page.get(i).setShippingLimitDt(dt1);
					}

					if(page.get(i).getDtAddLdn() != null){
						page.get(i).setDtAddLdn(page.get(i).getDtAddLdn());
					}

					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja Start
					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(page.get(i).chaseTStock().getMProduct().getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setCaseFlg("1");
					// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja End

					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana Start
					// ケース数、ピース数を設定
					setCalculateData(page.get(i));
					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana End
				}
			}

			TStockReportDtoMapper mapper1 = new TStockReportDtoMapper();
			List<TStockReportDto> list = mapper1.mappingToDtoList(page);
			resultStockListDto.paging = stockListDto.paging;
			resultStockListDto.data.body = list;
		} else {

			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana Start
			// 現在データの検索を偽に設定
			resultStockListDto.data.isSearchCurrentData = false;
			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana End

			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana Start
			page1 = (PagingResultBean<HStockReport>) stockListLogic.select(setTStock, mCenter, setMProduct, setMLocation, setZone, setLot, stockListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana End
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			if(page1.size() > 0){
				for(int i = 0; i < page1.size(); i++ ){
					TStockReport tStockReportH = new TStockReport();
					tStockReportH.setTStock(new TStock());
					tStockReportH.getTStock().setMProduct(new MProduct());
					//荷主センタ変更対応 2017.02.27 sja Start
					tStockReportH.getTStock().setMClient(new MClient());
					tStockReportH.getTStock().getMClient().setClientCd(page1.get(i).getHStock().getClientCd());
					tStockReportH.getTStock().getMClient().setClientNm(page1.get(i).getHStock().getClientNm());
					//荷主センタ変更対応 2017.02.27 sja End
					//商品CD
					tStockReportH.getTStock().getMProduct().setProductCd(page1.get(i).getHStock().getProductCd());
					//商品名称
					tStockReportH.getTStock().getMProduct().setProductNm(page1.get(i).getHStock().getProductNm());
					//商品略称
					tStockReportH.getTStock().getMProduct().setProductAbbr(page1.get(i).getHStock().getProductAbbr());
					//JANCD
					tStockReportH.getTStock().getMProduct().setJanCd(page1.get(i).getHStock().getJanCd());
					//倉庫CD、倉庫名称
					tStockReportH.getTStock().setMWarehouse(new MWarehouse());
					//荷主センタ変更対応 2017.02.27 sja Start
					tStockReportH.getTStock().getMWarehouse().setMCenter(new MCenter());
					//荷主センタ変更対応 2017.02.27 sja End
					tStockReportH.getTStock().getMWarehouse().setWarehouseCd(page1.get(i).getHStock().getWarehouseCd());
					tStockReportH.getTStock().getMWarehouse().setWarehouseNm(page1.get(i).getHStock().getWarehouseNm());
					//荷主センタ変更対応 2017.02.27 sja Start
					tStockReportH.getTStock().getMWarehouse().getMCenter().setCenterCd(page1.get(i).getHStock().getCenterCd());
					tStockReportH.getTStock().getMWarehouse().getMCenter().setCenterNm(page1.get(i).getHStock().getCenterNm());
					//荷主センタ変更対応 2017.02.27 sja End
					//ロケーションCD
					tStockReportH.getTStock().setMLocation(new MLocation());
					tStockReportH.getTStock().getMLocation().setLocationCd(page1.get(i).getHStock().getLocationCd());
					// [ON推-品向-393] 履歴検索でロケーション名が表示されない問題を修正 2014.12.03 kawana Start
					tStockReportH.getTStock().getMLocation().setLocationNm(page1.get(i).getHStock().getLocationNm());
					// [ON推-品向-393] 履歴検索でロケーション名が表示されない問題を修正 2014.12.03 kawana End

					//預託CD
					tStockReportH.getTStock().setMCustomer(new MCustomer());
					tStockReportH.getTStock().getMCustomer().setCustomerId(page1.get(i).getHStock().getDepositId());
					tStockReportH.getTStock().getMCustomer().setCustomerCd(page1.get(i).getHStock().getDepositCd());
					tStockReportH.getTStock().getMCustomer().setCustomerNm(page1.get(i).getHStock().getDepositNm());
					//在庫区分CD
					tStockReportH.getTStock().setMStockType(new MStockType());
					tStockReportH.getTStock().getMStockType().setVDict(new VDict());
					tStockReportH.getTStock().getMStockType().setStockTypeId(page1.get(i).getHStock().getStockTypeId());
					tStockReportH.getTStock().getMStockType().setStockTypeCd(page1.get(i).getHStock().getMStockType().getStockTypeCd());
					tStockReportH.getTStock().getMStockType().getVDict().setCultureId(page1.get(i).getHStock().getMStockType().getVDict().getCultureId());
					tStockReportH.getTStock().getMStockType().getVDict().setDictNm(page1.get(i).getHStock().getMStockType().getVDict().getDictNm());
					//ロット
					tStockReportH.getTStock().setTLot(new TLot());
					tStockReportH.getTStock().getTLot().setLot(page1.get(i).getHStock().getLot());
					tStockReportH.getTStock().getTLot().setLimitDt(page1.get(i).getHStock().getLimitDt());
					//入庫ラベルNo.
					tStockReportH.getTStock().setTStoreNo(new TStoreNo());
					tStockReportH.getTStock().getTStoreNo().setTStoreNoSelf(new TStoreNo());
					tStockReportH.getTStock().getTStoreNo().setStoreNoId(page1.get(i).getHStock().getStoreNoId());
					tStockReportH.getTStock().getTStoreNo().setStoreLabelNo(page1.get(i).getHStock().getStoreLabelNo());
					tStockReportH.getTStock().getTStoreNo().getTStoreNoSelf().setStoreLabelNo(page1.get(i).getHStock().getOldStoreLabelNo());
					if(page1.get(i).getHStock().getOldStoreNumId() != null){
						tStockReportH.getTStock().getTStoreNo().setOldStoreNumId(page1.get(i).getHStock().getOldStoreNumId().longValue());
					}
					//入庫日
					tStockReportH.getTStock().getTStoreNo().setStoreDt(page1.get(i).getHStock().getStoreDt());

					//仕入先CD
					tStockReportH.getTStock().getTStoreNo().setMCustomer(new MCustomer());
					tStockReportH.getTStock().getTStoreNo().getMCustomer().setCustomerCd(page1.get(i).getHStock().getSupplierCd());
					//仕入先名称
					tStockReportH.getTStock().getTStoreNo().getMCustomer().setCustomerNm(page1.get(i).getHStock().getSupplierNm());
					//仕入先略称
					tStockReportH.getTStock().getTStoreNo().getMCustomer().setCustomerAbbr(page1.get(i).getHStock().getSupplierAbbr());
					//引当可能数
					tStockReportH.getTStock().setChargeNum(page1.get(i).getChargeNum());

					//当日入庫数
					tStockReportH.setStoreNumDay(page1.get(i).getStoreNumDay());
					//当日出庫数
					tStockReportH.setPickingNumDay(page1.get(i).getPickingNumDay());
					//当日移動数＋
					tStockReportH.setMovePlsNumDay(page1.get(i).getMovePlsNumDay());
					//当日移動数－
					tStockReportH.setMoveMnsNumDay(page1.get(i).getMoveMnsNumDay());
					//当日調整数＋
					tStockReportH.setAdjPlsNumDay(page1.get(i).getAdjPlsNumDay());
					//当日調整数－
					tStockReportH.setAdjMnsNumDay(page1.get(i).getAdjMnsNumDay());
					//前日引当可能数
					tStockReportH.setPChargeNumDay(page1.get(i).getPChargeNumDay());

					//当月入庫数
					tStockReportH.setStoreNumMonth(page1.get(i).getStoreNumMonth());
					//当月出庫数
					tStockReportH.setPickingNumMonth(page1.get(i).getPickingNumMonth());
					//当月移動数＋
					tStockReportH.setMovePlsNumMonth(page1.get(i).getMovePlsNumMonth());
					//当月移動数－
					tStockReportH.setMoveMnsNumMonth(page1.get(i).getMoveMnsNumMonth());
					//当月調整数＋
					tStockReportH.setAdjPlsNumMonth(page1.get(i).getAdjPlsNumMonth());
					//当月調整数－
					tStockReportH.setAdjMnsNumMonth(page1.get(i).getAdjMnsNumMonth());
					//前月引当可能数
					tStockReportH.setPChargeNumMonth(page1.get(i).getPChargeNumMonth());
					//１０日残引当可能数
					tStockReportH.setChargeNum10(page1.get(i).getChargeNum10());
					//１５日残引当可能数
					tStockReportH.setChargeNum15(page1.get(i).getChargeNum15());
					//２０日残引当可能数
					tStockReportH.setChargeNum20(page1.get(i).getChargeNum20());
					//末日残引当可能数
					tStockReportH.setChargeNumLast(page1.get(i).getChargeNumLast());
					//引当済数
					tStockReportH.getTStock().setAllocNum(page1.get(i).getAllocNum());
					//移動中数
					tStockReportH.getTStock().setMoveNum(page1.get(i).getMoveNum());
					// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
					//積送中数
					tStockReportH.getTStock().setTransitNum(page1.get(i).getTransitNum());
					// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
					//入数
					tStockReportH.getTStock().setUnitNum(page1.get(i).getHStock().getUnitNum());
					//最新入庫年月日
					tStockReportH.setLastStoreDt(page1.get(i).getLastStoreDt());
					//最新出庫年月日
					tStockReportH.setLastPickingDt(page1.get(i).getLastPickingDt());
					//登録日時
					tStockReportH.setAddDt(page1.get(i).getAddDt());
					// [Ver3.0] unit of measure対応 2017.11.22 駱 start
                    // 商品最小荷姿単位名称
					tStockReportH.setProductUnit(page1.get(i).getProductUnit());
					// 入数内訳
					tStockReportH.setUnitNumBreakdown(page1.get(i).getUnitNumBreakdown());
					// 在庫内訳
					tStockReportH.setStockBreakdown(page1.get(i).getStockBreakdown());
					// 引当可能内訳
					tStockReportH.setChargeBreakdown(page1.get(i).getChargeBreakdown());
					// 引当済内訳
					tStockReportH.setAllocBreakdown(page1.get(i).getAllocBreakdown());
					// 作業中内訳
					tStockReportH.setMoveBreakdown(page1.get(i).getMoveBreakdown());
					// 積送中内訳
					tStockReportH.setTransitBreakdown(page1.get(i).getTransitBreakdown());
					// 内訳
					tStockReportH.setBreakdown(page1.get(i).getBreakdown());
					// 入数
					tStockReportH.setStringUnitNum(page1.get(i).getStringUnitNum());
					//最小梱包単位
					tStockReportH.setMinimumPackingUnit(page1.get(i).getMinimumPackingUnit());
					// [Ver3.0] unit of measure対応 2017.11.22 駱 end

					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja Start
					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(page1.get(i).getHStock().getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setCaseFlg("1");
					// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja End

					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana Start
					// ケース数、ピース数を設定
					setCalculateData(tStockReportH);
					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana End

					resultTStockReport.add(tStockReportH.clone());
				}

				TStockReportDtoMapper mapper1 = new TStockReportDtoMapper();
				List<TStockReportDto> list = mapper1.mappingToDtoList(resultTStockReport);
				resultStockListDto.paging = stockListDto.paging;
				resultStockListDto.data.body = list;
			}
		}
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		return resultStockListDto;
	}

	// [ON推-品向-963] ケース数・ピース数計算をユーティリティクラスに抜出 2015.10.05 kawana Start

	// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana Start
	/**
	 * 在庫の計算値を設定する
	 *
	 * @param stockReportList 在庫・在庫日報リスト
	 */
	private void setCalculateData(TStockReport stockReport) {

		TStock stock = stockReport.chaseTStock();
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start

		// 引当可能数
		BigDecimal chargeNum = stock.getChargeNum();

		// 引当済数
		BigDecimal allocNum = stock.getAllocNum();

		// 移動中数
		BigDecimal moveNum = stock.getMoveNum();

		// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start

		// 在庫数 = 引当可能数＋引当済数＋移動中数
		BigDecimal stockNum = WCC.add(chargeNum, allocNum, moveNum);
		stock.setStockNum(stockNum);
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End
		// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End
	}

	// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana End

	// [ON推-品向-963] ケース数・ピース数計算をユーティリティクラスに抜出 2015.10.05 kawana End

	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start

	/**
	 * <h2>入庫ラベル発行</h2>
	 * <pre>
	 * 入庫ラベル発行データを取得し設定する
	 * </pre>
	 * @param stockListDto 画面用DTO
	 * @return StockListDto 入庫ラベル発行データを設定した画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/storeLabelPrint")
	public StockListDto storeLabelPrint(StockListDto stockListDto) throws Exception {

		// 発行DTO
		PrintParamDto printParamDto = stockListDto.data.storeLabelPrintParam;

		// 選択した在庫をEntity変換
		TStockReportDtoMapper mapper = new TStockReportDtoMapper();
		List<TStockReport> stockReportList = mapper.mappingToEntityList(stockListDto.data.body);

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start

		Set<Long> stockIdSet = new HashSet<>();
		for (TStockReport stockReport : stockReportList) {
			stockIdSet.add(stockReport.getStockId());
		}

		final long centerId = stockReportList.get(0).getTStock().getMWarehouse().getMCenter().getCenterId();
		storeLabelPrintLogic.printAll(printParamDto, centerId, stockIdSet, errRetSts(StatusCode.STORE_LABEL_PRINT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End

		// 完了メッセージを設定
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return stockListDto;
	}
	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

	// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start
	/**
	 * <h2>在庫リスト発行。</h2>
	 * <pre>
	 * 検索条件で在庫を検索し在庫リストを発行する。
	 * 現在はサンプルのため時刻用のカルチャIDは帳票側で1固定にしている。
	 * </pre>
	 * @param stockListDto 画面用DTO
	 * @return StockListDto 在庫リスト発行データを設定した画面用DTO
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	@GET
	@Path("/stockListPrint")
	public StockListDto stockListPrint(final StockListDto stockListDto) throws Exception {

		// ========================= 検索メソッドの中身をコピー(サンプル実装のため共通化しない) =====================

		StockListDto resultStockListDto = new StockListDto();

		TStockReportDtoMapper mapper = new TStockReportDtoMapper();
		TStockReport tStockReport = mapper.mappingToEntity(stockListDto.data.head);
		String dt = null;
		String dtTemp = null;
		String limitDtNum = null;
		int limitDtNumTp = 0;
		String dttemp1 = null;

		String limitDt = null;
		String limitDtTp = null;

		//マスタ検索で必要なIDの取得
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(tStockReport.getTStock().getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tStockReport.getTStock().getMWarehouse().getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		//倉庫ID取得
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setWarehouseCd(tStockReport.getTStock().getMWarehouse().getWarehouseCd());
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		//預託ID取得
		MCustomer mCustomer = new MCustomer();
		mCustomer.setClientId(mClient.getClientId());
		mCustomer.setCustomerCd(tStockReport.getTStock().getMCustomer().getCustomerCd());
		mCustomer = customerLogic.getUkEntity(mCustomer);

		//在庫区分ID取得
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(tStockReport.getTStock().getMStockType().getStockTypeCd());
		mStockType = stockTypeLogic.getUkEntity(mStockType);

		// ===== 在庫問合せデータ取得 =====

		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mClient.getClientId());
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// 現品在庫問合せデータの取得

		// 現品在庫問合せデータ取得の検索データ編集
		TStock setTStock = new TStock();
		MProduct setMProduct = new MProduct();
		MLocation setMLocation = new MLocation();
		// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana
		TLot setLot = new TLot();

		// 荷主ID
		setTStock.setClientId(mClient.getClientId());

		// 倉庫ID
		if (mWarehouse != null) {
			if (mWarehouse.getWarehouseId() != null) {
				setTStock.setWarehouseId(mWarehouse.getWarehouseId());
			}
		}

		// 預託ID
		if (mCustomer != null) {
			if (mCustomer.getCustomerId() != null) {
				setTStock.setDepositId(mCustomer.getCustomerId());
			}
		}

		// 在庫区分ID
		if (mStockType != null) {
			if (mStockType.getStockTypeId() != null) {
				setTStock.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
		// 在庫数 0非表示
		setTStock.setStockNumDisplay(tStockReport.chaseTStock().getStockNumDisplay());
		// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

		//引当可能数 0非表示
		if (stockListDto.data.head.getChargeNumDisplay() != null) {
			setTStock.setChargeNumDisplay(stockListDto.data.head.getChargeNumDisplay());
		}

		//0非表示
		if (stockListDto.data.head.getDisplay() != null) {
			setTStock.setDisplay(stockListDto.data.head.getDisplay());
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// 積送中在庫のみ表示
		setTStock.setTransitDisplay(tStockReport.chaseTStock().getTransitDisplay());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

		// センタID
		if (mClientCenter != null) {
			if (mClientCenter.getCenterId() != null) {
				mCenter.setCenterId(mClientCenter.getCenterId());
			}
		}

		// 在庫区分
		if (stockListDto.data.head.getStockdisplayfld() != null) {
			setTStock.setStockdisplayfld(stockListDto.data.head.getStockdisplayfld());
		}

		// 商品CD
		if (stockListDto.data.head.getTStock().getMProduct().getProductCd() != null) {
			setMProduct.setProductCd(stockListDto.data.head.getTStock().getMProduct().getProductCd());
		}

		// JANCD
		if (stockListDto.data.head.getTStock().getMProduct().getJanCd() != null) {
			setMProduct.setJanCd(stockListDto.data.head.getTStock().getMProduct().getJanCd());
		}

		// ロケーションCD(From)
		if (stockListDto.data.head.getLocationCdFrom() != null) {
			setMLocation.setLocationCdFrom(stockListDto.data.head.getLocationCdFrom());
		}

		// ロケーションCD(To)
		if (stockListDto.data.head.getLocationCdTo() != null) {
			setMLocation.setLocationCdTo(stockListDto.data.head.getLocationCdTo());
		}

		// 期限日(From)
		if (stockListDto.data.head.getLimitDtFrom() != null) {
			setLot.setLimitDtFrom(stockListDto.data.head.getLimitDtFrom());
		}

		// 期限日(To)
		if (stockListDto.data.head.getLimitDtTo() != null) {
			setLot.setLimitDtTo(stockListDto.data.head.getLimitDtTo());
		}

		// 期限日数
		if (stockListDto.data.head.getLimitDtNum() != null) {
			setLot.setLimitDtNum(stockListDto.data.head.getLimitDtNum());
		}

		// システム管理日付
		setTStock.setDataTime(tStockReport.getTStock().getDataTime());

		// ロット
		if (stockListDto.data.head.getTStock().getTLot().getLot() != null) {
			setLot.setLot(stockListDto.data.head.getTStock().getTLot().getLot());
		}

		limitDtNum = stockListDto.data.head.getLimitDtNum();
		if (limitDtNum != null && !"".equals(limitDtNum)) {
			limitDtNumTp = Integer.parseInt(limitDtNum);
		} else {
			limitDtNumTp = 0;
		}

		dtTemp = stockListDto.data.head.getTStock().getDataTime();
		dttemp1 = dtTemp.substring(0, 4) + "/" + dtTemp.substring(4, 6) + "/" + dtTemp.substring(6, 8);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(dttemp1);
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.DAY_OF_MONTH, limitDtNumTp);
		dt = sdf.format(cl.getTime());
		dt = dt.replace("/", "");
		setTStock.setDtAddLdn(dt);

		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
		MZone setZone = tStockReport.chaseTStock().chaseMLocation().chaseMZone();
		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End

		PagingResultBean<TStockReport> page = null;
		PagingResultBean<HStockReport> page1 = null;

		List<TStockReportDto> list = null;

		List<TStockReport> resultTStockReport = new ArrayList<TStockReport>();

		Long shippingLimitNumTp = null;

		if (tStockReport.getTStock().getDataTime().equals(mClientCenter.getSystemDt())) {

			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana Start
			// 現在データの検索を真に設定
			resultStockListDto.data.isSearchCurrentData = true;
			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana End

			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana Start
			page = (PagingResultBean<TStockReport>) stockListLogic.select(setTStock, mCenter, setMProduct, setMLocation, setZone, setLot, stockListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana End
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			if (page.size() > 0) {
				for (int i = 0; i < page.size(); i++) {
					if (page.get(i).getTStock().getTLot().getLimitDt() != null) {
						shippingLimitNumTp = page.get(i).getTStock().getMProduct().getShippingLimitNum();
						limitDt = page.get(i).getTStock().getTLot().getLimitDt();
						limitDtTp = limitDt.substring(0, 4) + "/" + limitDt.substring(4, 6) + "/" + limitDt.substring(6, 8);
						SimpleDateFormat sdfT = new SimpleDateFormat("yyyy/MM/dd");
						Date dateT = sdfT.parse(limitDtTp);
						Calendar clT = Calendar.getInstance();
						clT.setTime(dateT);
						if (shippingLimitNumTp != null) {
							clT.add(Calendar.DAY_OF_MONTH, -Integer.parseInt(String.valueOf(shippingLimitNumTp)));
						}
						String dt1 = sdfT.format(clT.getTime());
						dt1 = dt1.replace("/", "");
						page.get(i).setShippingLimitDt(dt1);
					}

					if (page.get(i).getDtAddLdn() != null) {
						page.get(i).setDtAddLdn(page.get(i).getDtAddLdn());
					}

					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja Start
					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(page.get(i).chaseTStock().getMProduct().getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setCaseFlg("1");
					// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja End

					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana Start
					// ケース数、ピース数を設定
					setCalculateData(page.get(i));
					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana End
				}
			}

			TStockReportDtoMapper mapper1 = new TStockReportDtoMapper();
			list = mapper1.mappingToDtoList(page);
		} else {

			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana Start
			// 現在データの検索を偽に設定
			resultStockListDto.data.isSearchCurrentData = false;
			// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana End

			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana Start
			page1 = (PagingResultBean<HStockReport>) stockListLogic.select(setTStock, mCenter, setMProduct, setMLocation, setZone, setLot, stockListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
			// [ON推-品向-263] 未使用の区分値を削除 2014.11.21 kawana End
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			if (page1.size() > 0) {
				for (int i = 0; i < page1.size(); i++) {
					TStockReport tStockReportH = new TStockReport();
					tStockReportH.setTStock(new TStock());
					tStockReportH.getTStock().setMProduct(new MProduct());
					//荷主センタ変更対応 2017.02.27 sja Start
					tStockReportH.getTStock().setMClient(new MClient());
					tStockReportH.getTStock().getMClient().setClientCd(page1.get(i).getHStock().getClientCd());
					tStockReportH.getTStock().getMClient().setClientNm(page1.get(i).getHStock().getClientNm());
					//荷主センタ変更対応 2017.02.27 sja End
					//商品CD
					tStockReportH.getTStock().getMProduct().setProductCd(page1.get(i).getHStock().getProductCd());
					//商品名称
					tStockReportH.getTStock().getMProduct().setProductNm(page1.get(i).getHStock().getProductNm());
					//商品略称
					tStockReportH.getTStock().getMProduct().setProductAbbr(page1.get(i).getHStock().getProductAbbr());
					//JANCD
					tStockReportH.getTStock().getMProduct().setJanCd(page1.get(i).getHStock().getJanCd());
					//倉庫CD、倉庫名称
					tStockReportH.getTStock().setMWarehouse(new MWarehouse());
					//荷主センタ変更対応 2017.02.27 sja Start
					tStockReportH.getTStock().getMWarehouse().setMCenter(new MCenter());
					//荷主センタ変更対応 2017.02.27 sja End
					tStockReportH.getTStock().getMWarehouse().setWarehouseCd(page1.get(i).getHStock().getWarehouseCd());
					tStockReportH.getTStock().getMWarehouse().setWarehouseNm(page1.get(i).getHStock().getWarehouseNm());
					//荷主センタ変更対応 2017.02.27 sja Start
					tStockReportH.getTStock().getMWarehouse().getMCenter().setCenterCd(page1.get(i).getHStock().getCenterCd());
					tStockReportH.getTStock().getMWarehouse().getMCenter().setCenterNm(page1.get(i).getHStock().getCenterNm());
					//荷主センタ変更対応 2017.02.27 sja End
					//ロケーションCD
					tStockReportH.getTStock().setMLocation(new MLocation());
					tStockReportH.getTStock().getMLocation().setLocationCd(page1.get(i).getHStock().getLocationCd());
					// [ON推-品向-393] 履歴検索でロケーション名が表示されない問題を修正 2014.12.03 kawana Start
					tStockReportH.getTStock().getMLocation().setLocationNm(page1.get(i).getHStock().getLocationNm());
					// [ON推-品向-393] 履歴検索でロケーション名が表示されない問題を修正 2014.12.03 kawana End

					//預託CD
					tStockReportH.getTStock().setMCustomer(new MCustomer());
					tStockReportH.getTStock().getMCustomer().setCustomerId(page1.get(i).getHStock().getDepositId());
					tStockReportH.getTStock().getMCustomer().setCustomerCd(page1.get(i).getHStock().getDepositCd());
					tStockReportH.getTStock().getMCustomer().setCustomerNm(page1.get(i).getHStock().getDepositNm());
					//在庫区分CD
					tStockReportH.getTStock().setMStockType(new MStockType());
					tStockReportH.getTStock().getMStockType().setVDict(new VDict());
					tStockReportH.getTStock().getMStockType().setStockTypeId(page1.get(i).getHStock().getStockTypeId());
					tStockReportH.getTStock().getMStockType().setStockTypeCd(page1.get(i).getHStock().getMStockType().getStockTypeCd());
					tStockReportH.getTStock().getMStockType().getVDict().setCultureId(page1.get(i).getHStock().getMStockType().getVDict().getCultureId());
					tStockReportH.getTStock().getMStockType().getVDict().setDictNm(page1.get(i).getHStock().getMStockType().getVDict().getDictNm());
					//ロット
					tStockReportH.getTStock().setTLot(new TLot());
					tStockReportH.getTStock().getTLot().setLot(page1.get(i).getHStock().getLot());
					tStockReportH.getTStock().getTLot().setLimitDt(page1.get(i).getHStock().getLimitDt());
					//入庫ラベルNo.
					tStockReportH.getTStock().setTStoreNo(new TStoreNo());
					tStockReportH.getTStock().getTStoreNo().setTStoreNoSelf(new TStoreNo());
					tStockReportH.getTStock().getTStoreNo().setStoreNoId(page1.get(i).getHStock().getStoreNoId());
					tStockReportH.getTStock().getTStoreNo().setStoreLabelNo(page1.get(i).getHStock().getStoreLabelNo());
					tStockReportH.getTStock().getTStoreNo().getTStoreNoSelf().setStoreLabelNo(page1.get(i).getHStock().getOldStoreLabelNo());
					if (page1.get(i).getHStock().getOldStoreNumId() != null) {
						tStockReportH.getTStock().getTStoreNo().setOldStoreNumId(page1.get(i).getHStock().getOldStoreNumId().longValue());
					}
					//入庫日
					tStockReportH.getTStock().getTStoreNo().setStoreDt(page1.get(i).getHStock().getStoreDt());

					//仕入先CD
					tStockReportH.getTStock().getTStoreNo().setMCustomer(new MCustomer());
					tStockReportH.getTStock().getTStoreNo().getMCustomer().setCustomerCd(page1.get(i).getHStock().getSupplierCd());
					//仕入先名称
					tStockReportH.getTStock().getTStoreNo().getMCustomer().setCustomerNm(page1.get(i).getHStock().getSupplierNm());
					//仕入先略称
					tStockReportH.getTStock().getTStoreNo().getMCustomer().setCustomerAbbr(page1.get(i).getHStock().getSupplierAbbr());
					//引当可能数
					tStockReportH.getTStock().setChargeNum(page1.get(i).getChargeNum());

					//当日入庫数
					tStockReportH.setStoreNumDay(page1.get(i).getStoreNumDay());
					//当日出庫数
					tStockReportH.setPickingNumDay(page1.get(i).getPickingNumDay());
					//当日移動数＋
					tStockReportH.setMovePlsNumDay(page1.get(i).getMovePlsNumDay());
					//当日移動数－
					tStockReportH.setMoveMnsNumDay(page1.get(i).getMoveMnsNumDay());
					//当日調整数＋
					tStockReportH.setAdjPlsNumDay(page1.get(i).getAdjPlsNumDay());
					//当日調整数－
					tStockReportH.setAdjMnsNumDay(page1.get(i).getAdjMnsNumDay());
					//前日引当可能数
					tStockReportH.setPChargeNumDay(page1.get(i).getPChargeNumDay());

					//当月入庫数
					tStockReportH.setStoreNumMonth(page1.get(i).getStoreNumMonth());
					//当月出庫数
					tStockReportH.setPickingNumMonth(page1.get(i).getPickingNumMonth());
					//当月移動数＋
					tStockReportH.setMovePlsNumMonth(page1.get(i).getMovePlsNumMonth());
					//当月移動数－
					tStockReportH.setMoveMnsNumMonth(page1.get(i).getMoveMnsNumMonth());
					//当月調整数＋
					tStockReportH.setAdjPlsNumMonth(page1.get(i).getAdjPlsNumMonth());
					//当月調整数－
					tStockReportH.setAdjMnsNumMonth(page1.get(i).getAdjMnsNumMonth());
					//前月引当可能数
					tStockReportH.setPChargeNumMonth(page1.get(i).getPChargeNumMonth());
					//１０日残引当可能数
					tStockReportH.setChargeNum10(page1.get(i).getChargeNum10());
					//１５日残引当可能数
					tStockReportH.setChargeNum15(page1.get(i).getChargeNum15());
					//２０日残引当可能数
					tStockReportH.setChargeNum20(page1.get(i).getChargeNum20());
					//末日残引当可能数
					tStockReportH.setChargeNumLast(page1.get(i).getChargeNumLast());
					//引当済数
					tStockReportH.getTStock().setAllocNum(page1.get(i).getAllocNum());
					//移動中数
					tStockReportH.getTStock().setMoveNum(page1.get(i).getMoveNum());
					// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
					//積送中数
					tStockReportH.getTStock().setTransitNum(page1.get(i).getTransitNum());
					// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
					//入数
					tStockReportH.getTStock().setUnitNum(page1.get(i).getHStock().getUnitNum());
					//最新入庫年月日
					tStockReportH.setLastStoreDt(page1.get(i).getLastStoreDt());
					//最新出庫年月日
					tStockReportH.setLastPickingDt(page1.get(i).getLastPickingDt());
					//登録日時
					tStockReportH.setAddDt(page1.get(i).getAddDt());

					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja Start
					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(page1.get(i).getHStock().getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setCaseFlg("1");
					// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja End

					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana Start
					// ケース数、ピース数を設定
					setCalculateData(tStockReportH);
					// [C-NIS-0001] ケース数、ピース数を追加 2015.08.27 kawana End

					resultTStockReport.add(tStockReportH.clone());
				}

				TStockReportDtoMapper mapper1 = new TStockReportDtoMapper();
				list = mapper1.mappingToDtoList(resultTStockReport);
			}
		}
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// ========================= 検索メソッドの中身をコピー(サンプル実装のため共通化しない) =====================

		// 発行DTO
		PrintParamDto printParamDto = stockListDto.data.stockListPrintParam;

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);
		printParamDto.printBasicData.outputData = json.format(list);
		printLogic.print(printParamDto);

		// 完了メッセージを設定
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return stockListDto;
	}
	// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End
}
