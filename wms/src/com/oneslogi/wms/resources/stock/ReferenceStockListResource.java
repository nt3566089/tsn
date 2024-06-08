package com.oneslogi.wms.resources.stock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

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
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.stock.ReferenceStockListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.ReferenceStockListLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/stock/ReferenceStockList")
public class ReferenceStockListResource extends AbstractWmsResource {

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
		 * 在庫問合せ一覧データ取得異常
		 * */
		protected static final int NOT_FOUND_DATA = 2;
	}

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
	private ReferenceStockListLogic referenceStockListLogic;

	@Inject
	private ClientCenterLogic clientCenterLogic;

	@Inject
	private StockTypeLogic stockTypeLogic;

	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Delete

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReferenceStockListDto 現品在庫問合せ(参照)画面用DTO
	 */
	@GET
	@Path("/init")
	public ReferenceStockListDto init() {

		// 画面用DTO作成
		ReferenceStockListDto referenceStockListDto = new ReferenceStockListDto();
		return referenceStockListDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、出庫指示一覧データ取得
	 * </pre>
	 * @param  referenceStockListDto 現品在庫問合せ(参照)画面用DTO
	 * @return referenceStockListDto 現品在庫問合せ(参照)画面用DTO
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@GET
	@Path("/search")
	public ReferenceStockListDto search(ReferenceStockListDto referenceStockListDto) throws ParseException {
		ReferenceStockListDto resultReferenceStockListDto = new ReferenceStockListDto();

		TStockReportDtoMapper mapper = new TStockReportDtoMapper();
		TStockReport tStockReport = mapper.mappingToEntity(referenceStockListDto.data.head);
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

		// ===== 在庫問合せ(参照)データ取得 =====

		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mClient.getClientId());
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// 現品在庫問合せ(参照)データの取得

		// 現品在庫問合せ(参照)データ取得の検索データ編集
		TStock setTStock = new TStock();
		MProduct setMProduct = new MProduct();
		MLocation setMLocation = new MLocation();
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

		// 在庫数 0非表示
		setTStock.setStockNumDisplay(tStockReport.chaseTStock().getStockNumDisplay());

		//引当可能数 0非表示
		if(referenceStockListDto.data.head.getChargeNumDisplay() != null){
			setTStock.setChargeNumDisplay(referenceStockListDto.data.head.getChargeNumDisplay());
		}

		//0非表示
		if(referenceStockListDto.data.head.getDisplay() != null){
			setTStock.setDisplay(referenceStockListDto.data.head.getDisplay());
		}

		// 積送中在庫のみ表示
		setTStock.setTransitDisplay(tStockReport.chaseTStock().getTransitDisplay());

		// センタID
		if(mClientCenter != null){
			if(mClientCenter.getCenterId() != null){
				mCenter.setCenterId(mClientCenter.getCenterId());
			}
		}

		// 在庫区分
		if(referenceStockListDto.data.head.getStockdisplayfld() != null){
			setTStock.setStockdisplayfld(referenceStockListDto.data.head.getStockdisplayfld());
		}

		// 商品CD
		if(referenceStockListDto.data.head.getTStock().getMProduct().getProductCd() != null){
			setMProduct.setProductCd(referenceStockListDto.data.head.getTStock().getMProduct().getProductCd());
		}

		// JANCD
		if(referenceStockListDto.data.head.getTStock().getMProduct().getJanCd() != null){
			setMProduct.setJanCd(referenceStockListDto.data.head.getTStock().getMProduct().getJanCd());
		}

		// ロケーションCD(From)
		if(referenceStockListDto.data.head.getLocationCdFrom() != null){
			setMLocation.setLocationCdFrom(referenceStockListDto.data.head.getLocationCdFrom());
		}

		// ロケーションCD(To)
		if(referenceStockListDto.data.head.getLocationCdTo() != null){
			setMLocation.setLocationCdTo(referenceStockListDto.data.head.getLocationCdTo());
		}

		// 期限日(From)
		if(referenceStockListDto.data.head.getLimitDtFrom() != null){
			setLot.setLimitDtFrom(referenceStockListDto.data.head.getLimitDtFrom());
		}

		// 期限日(To)
		if(referenceStockListDto.data.head.getLimitDtTo() != null){
			setLot.setLimitDtTo(referenceStockListDto.data.head.getLimitDtTo());
		}

		// 期限日数
		if(referenceStockListDto.data.head.getLimitDtNum() != null){
			setLot.setLimitDtNum(referenceStockListDto.data.head.getLimitDtNum());
		}

		// システム管理日付
		setTStock.setDataTime(tStockReport.getTStock().getDataTime());

		// ロット
		if(referenceStockListDto.data.head.getTStock().getTLot().getLot() != null){
			setLot.setLot(referenceStockListDto.data.head.getTStock().getTLot().getLot());
		}

		// ユーザCD
		setTStock.setReferenceUserCd(referenceStockListDto.data.head.getReferenceUserCd());

		limitDtNum = referenceStockListDto.data.head.getLimitDtNum();
		if (limitDtNum != null && !"".equals(limitDtNum)){
			limitDtNumTp = Integer.parseInt(limitDtNum);
		}else{
			limitDtNumTp = 0;
		}

		dtTemp = referenceStockListDto.data.head.getTStock().getDataTime();
		dttemp1 = dtTemp.substring(0,4) + "/" + dtTemp.substring(4,6) + "/" + dtTemp.substring(6,8);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(dttemp1);
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.DAY_OF_MONTH,limitDtNumTp);
		dt = sdf.format(cl.getTime());
		dt = dt.replace("/", "");
		setTStock.setDtAddLdn(dt);

		MZone setZone = tStockReport.chaseTStock().chaseMLocation().chaseMZone();

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

			page = (PagingResultBean<TStockReport>) referenceStockListLogic.select(setTStock, mCenter, setMProduct, setMLocation, setZone, setLot, referenceStockListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
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

					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(page.get(i).chaseTStock().getMProduct().getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setCaseFlg("1");
					// [#3347][Ver3.0] TODO残対応(UoM) -  WMSコア部在庫更新処理と合わせるため入数の設定を削除 2018.01.15 honma Delete

					// ケース数、ピース数を設定
					setCalculateData(page.get(i));
				}
			}

			TStockReportDtoMapper mapper1 = new TStockReportDtoMapper();
			List<TStockReportDto> list = mapper1.mappingToDtoList(page);
			resultReferenceStockListDto.paging = referenceStockListDto.paging;
			resultReferenceStockListDto.data.body = list;
		} else {


			page1 = (PagingResultBean<HStockReport>) referenceStockListLogic.select(setTStock, mCenter, setMProduct, setMLocation, setZone, setLot, referenceStockListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
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
					tStockReportH.getTStock().getMLocation().setLocationNm(page1.get(i).getHStock().getLocationNm());

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
					//積送中数
					tStockReportH.getTStock().setTransitNum(page1.get(i).getTransitNum());
					//入数
					tStockReportH.getTStock().setUnitNum(page1.get(i).getHStock().getUnitNum());
					//最新入庫年月日
					tStockReportH.setLastStoreDt(page1.get(i).getLastStoreDt());
					//最新出庫年月日
					tStockReportH.setLastPickingDt(page1.get(i).getLastPickingDt());
					// [ver3.0][#3280] 複数荷姿対応 2018.02.02 matsumoto Start
					//商品単位
					tStockReportH.setProductUnit(page1.get(i).getProductUnit());
					//入数内訳
					tStockReportH.setUnitNumBreakdown(page1.get(i).getUnitNumBreakdown());
					//在庫内訳
					tStockReportH.setStockBreakdown(page1.get(i).getStockBreakdown());
					//引当可能内訳
					tStockReportH.setChargeBreakdown(page1.get(i).getChargeBreakdown());
					//引当済内訳
					tStockReportH.setAllocBreakdown(page1.get(i).getAllocBreakdown());
					//作業中内訳
					tStockReportH.setMoveBreakdown(page1.get(i).getMoveBreakdown());
					//積送中内訳
					tStockReportH.setTransitBreakdown(page1.get(i).getTransitBreakdown());

					// [ver3.0][#3280] 複数荷姿対応 2018.02.02 matsumoto End
					//登録日時
					tStockReportH.setAddDt(page1.get(i).getAddDt());

					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(page1.get(i).getHStock().getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setCaseFlg("1");
					// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
					tStockReportH.chaseTStock().setUnitNum(page1.get(i).getHStock().getUnitNum());
					// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End

					// ケース数、ピース数を設定
					setCalculateData(tStockReportH);

					resultTStockReport.add(tStockReportH.clone());
				}

				TStockReportDtoMapper mapper1 = new TStockReportDtoMapper();
				List<TStockReportDto> list = mapper1.mappingToDtoList(resultTStockReport);
				resultReferenceStockListDto.paging = referenceStockListDto.paging;
				resultReferenceStockListDto.data.body = list;
			}
		}
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		return resultReferenceStockListDto;
	}

	/**
	 * 在庫の計算値を設定する
	 *
	 * @param stockReportList 在庫・在庫日報リスト
	 */
	private void setCalculateData(TStockReport stockReport) {

		TStock stock = stockReport.chaseTStock();

		// 引当可能数
		BigDecimal chargeNum = stock.getChargeNum();

		// 引当済数
		BigDecimal allocNum = stock.getAllocNum();

		// 移動中数
		BigDecimal moveNum = stock.getMoveNum();

		// 在庫数 = 引当可能数＋引当済数＋移動中数
		BigDecimal stockNum = WCC.add(chargeNum, allocNum, moveNum);
		stock.setStockNum(stockNum);

	}
}
