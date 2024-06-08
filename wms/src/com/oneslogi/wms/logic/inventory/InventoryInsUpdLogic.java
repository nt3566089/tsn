package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryInputList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.LotLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;

/**
 * 棚卸データ登録・更新ロジッククラス
 */
public class InventoryInsUpdLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	/*棚卸ボディ*/
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	//棚卸入力履歴
	@Inject
	private TInventoryInpHistBhv tInventoryInpHistBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private LotLogic lotLogic;
	@Inject
	private ZoneLogic zoneLogic;
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.25 sja Start
	@Inject
	private ProductShapeLogic productShapeLogic;

	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.25 sja End
	/**
	 * <h2>棚卸データを登録・更新する。</h2>
	 * <pre>
	 * 引数の棚卸ボディIDがNULLの場合、棚卸ボディデータを新規登録する。
	 * 棚卸ボディに同じユニークキーのデータが既に存在する場合は、
	 * 既に登録済のエラーをエラー管理クラスに設定し、処理を終了する。
	 *
	 * 引数の棚卸ボディIDがNULLでない場合、対象の棚卸ボディデータを更新する。
	 *
	 * 既存の棚卸入力履歴データの最新フラグを「0：最新でない」で一括更新後、
	 * 新規に棚卸入力履歴データを作成し、一括登録する。
	 * </pre>
	 * @param bodylist 棚卸ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void InsertUpdate(List<TInventoryB> bodylist, ErrorStatus errSts) {

		List<TInventoryB> result = null;

		TInventoryH result1 = null;

		boolean blnUpdate = false;
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start
		List<TInventoryInpHist> reportList = new ArrayList<>();
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW End
		//棚卸ボディリストのデータ件数分繰返
		for (TInventoryB data : bodylist) {
			//棚卸ボディリスト.棚卸ボディIDがNULL場合
			if (data.getInventoryBId() == null) {
				// 新規在庫追加

				// [#2050] 在庫数nullの在庫を追加すると致命的エラー発生 2017.07.05 kawana Start
				if (WCC.isNotZero(CU.nullToZero(data.getInventoryNum()))) {
					// [#2050] 在庫数nullの在庫を追加すると致命的エラー発生 2017.07.05 kawana End

					//商品マスタ
					MProduct mProduct = new MProduct();
					//荷主ID取得
					MClient mClient = new MClient();
					mClient.setClientCd(data.getTInventoryH().getMClient().getClientCd());
					mClient = clientLogic.getUkEntity(mClient);
					//センタID取得
					MCenter mCenter = new MCenter();
					mCenter.setCenterCd(data.getTInventoryH().getMCenter().getCenterCd());
					mCenter = centerLogic.getUkEntity(mCenter);
					//ゾーン
					if (!CU.isNullOrEmpty(Long.toString(data.getMLocation().getZoneId()))) {
						MZone mZoneCondition = new MZone();
						mZoneCondition.setZoneId(data.getMLocation().getZoneId());
						mZoneCondition = zoneLogic.getPkEntity(mZoneCondition);
						data.setWarehouseId(mZoneCondition.getWarehouseId());
					}
					// 商品ID
					if (!CU.isNullOrEmpty(data.getMProduct().getProductCd())) {
						mProduct.setClientId(mClient.getClientId());
						mProduct.setProductCd(data.getMProduct().getProductCd());
						mProduct = productLogic.getUkEntity(mProduct);
						data.setProductId(mProduct.getProductId());
					}
					// 在庫区分ID
					if (!CU.isNullOrEmpty(data.getMStockType().getStockTypeCd())) {
						MStockType mStockType = new MStockType();
						//						mStockType.setClientId(mClient.getClientId());
						mStockType.setStockTypeCd(data.getMStockType().getStockTypeCd());
						mStockType = stockTypeLogic.getUkEntity(mStockType);
						data.setStockTypeId(mStockType.getStockTypeId());
					}
					//ロケーションID取得
					if (!CU.isNullOrEmpty(data.getMLocation().getLocationCd())) {
						MLocation mLocation = new MLocation();
						mLocation.setCenterId(mCenter.getCenterId());
						mLocation.setLocationCd(data.getMLocation().getLocationCd());
						mLocation = locationLogic.getUkEntity(mLocation);
						data.setLocationId(mLocation.getLocationId());
						if (CU.isNullOrEmpty(data.getMWarehouse().getWarehouseCd())) {
							MZone mZoneCondition = new MZone();
							mZoneCondition.setZoneId(mLocation.getZoneId());
							MZone mZone = zoneLogic.getPkEntity(mZoneCondition);
							data.setWarehouseId(mZone.getWarehouseId());
						}

					}
					// 預託ID取得
					if (!CU.isNullOrEmpty(data.getMCustomerByDepositId().getCustomerCd())) {
						MCustomer mCustomer = new MCustomer();
						mCustomer.setClientId(mClient.getClientId());
						mCustomer.setCustomerCd(data.getMCustomerByDepositId().getCustomerCd());
						mCustomer = customerLogic.getUkEntity(mCustomer);
						data.setDepositId(mCustomer.getCustomerId());
					}
					//ロット入力のみ場合、ロットIDの取得
					TLot tLotCondition = new TLot();
					tLotCondition.setProductId(data.getProductId());
					tLotCondition.setLot(data.getLot());
					tLotCondition.setLimitDt(data.getLimitDt());
					tLotCondition = lotLogic.getUkEntity(tLotCondition);
					if (tLotCondition == null) {
						data.setLotId(null);
					} else {
						data.setLotId(tLotCondition.getLotId());
					}

					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.25 sja Start
					MProductShape mProductShape = new MProductShape();
					mProductShape.setProductId(mProduct.getProductId());
					mProductShape.setClientId(mClient.getClientId());
					mProductShape.setCenterId(mCenter.getCenterId());
					mProductShape.setPieceFlg("1");
					mProductShape = productShapeLogic.getMProductShape(mProductShape);
					// [#3347][Ver3.0] TODO残対応(UoM) -  WMSコア部在庫更新処理と合わせるため入数の設定を削除 2018.01.15 honma Delete
					// [Ver3.0] unit of measure対応 2017.12.5 潘 Start
					data.setShapeId(mProductShape.chaseMShapeGrpDtl().getShapeId());
					// [Ver3.0] unit of measure対応 2017.12.5 潘 End
					// [エンハンス PH2.0] 入数の設定値を変更 2015.12.25 sja End

					// 検索条件の設定
					TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
					//棚卸ヘッダID
					cb.query().setInventoryHId_Equal(data.getInventoryHId());
					//倉庫ID
					cb.query().setWarehouseId_Equal(data.getWarehouseId());
					//商品ID
					cb.query().setProductId_Equal(data.getProductId());
					//在庫区分ID
					cb.query().setStockTypeId_Equal(data.getStockTypeId());
					//ロケーションID
					cb.query().setLocationId_Equal(data.getLocationId());
					//預託ID
					cb.query().setDepositId_Equal(data.getDepositId());
					//ロットID
					cb.query().setLot_Equal(data.getLot());
					//期限日
					// [横並-147] 期限日を修正 2014.11.25 SJA-ZHENG Start
					cb.query().setLimitDt_Equal(data.getLimitDt());
					// [横並-147] 期限日を修正 2014.11.25 SJA-ZHENG End
					//入庫ラベルNo.
					cb.query().setStoreLabelNo_Equal(data.getStoreLabelNo());
					//仕入先
					cb.query().setSupplierId_Equal(data.chaseMCustomerBySupplierId().getCustomerId());
					// [エンハンス PH2.0] 入庫日を追加する 2015.12.25 sja Start
					// 入庫日
					cb.query().setStoreDt_Equal(data.getStoreDt());
					// [エンハンス PH2.0] 入庫日を追加する 2015.12.25 sja End
					// ===== 棚卸ボディの存在チェック実行 =====
					result = tInventoryBBhv.selectList(cb);

					// ===== データ存在場合、処理終了 =====
					if (result.size() > 0) {
						this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						return;
					} else { //データ存在しない場合
						//棚卸ボディの登録実行
						data.setInputType_$00();
						data.setSupplierId(data.chaseMCustomerBySupplierId().getCustomerId());
						data.setSupplierCd(data.chaseMCustomerBySupplierId().getCustomerCd());

						tInventoryBBhv.insert(data);
					}

					blnUpdate = true;
				}
				//棚卸ボディリスト.棚卸ボディIDがNULLでない場合、
			} else {
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				if (data.getInventoryInpHistId() == null && data.getInventoryNum() != null && !WCC.isEqual(data.getInventoryNum(), data.getOldInventoryNum())) {
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
					//棚卸ボディの更新実行
					tInventoryBBhv.update(data);
					blnUpdate = true;
				}
			}

			if (blnUpdate == true) {
				//登録時に同一棚卸ボディIDを一度'0'に更新し
				ListResultBean<TInventoryInpHist> resultInpHist = null;

				TInventoryInpHistCB tInventoryInpHistCB = tInventoryInpHistBhv.newMyConditionBean();
				tInventoryInpHistCB.query().setInventoryBId_Equal(data.getInventoryBId());
				resultInpHist = tInventoryInpHistBhv.selectList(tInventoryInpHistCB);

				if (resultInpHist.size() > 0) {
					for (TInventoryInpHist hist : resultInpHist) {
						hist.setLastFlg_$0(); //setLastFlg("0");
					}
				}
				//一度'0'に更新し
				tInventoryInpHistBhv.batchUpdate(resultInpHist);

				// システム管理日付取得
				TInventoryHCB tInventoryH = tInventoryHBhv.newMyConditionBean();

				tInventoryH.query().setInventoryHId_Equal(data.getInventoryHId());

				result1 = tInventoryHBhv.selectEntity(tInventoryH);
				MClientCenter mClientCenter = new MClientCenter();
				mClientCenter.setClientId(result1.getClientId());
				mClientCenter.setCenterId(result1.getCenterId());
				mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

				Date date = null;
				Long time = null;

				try {
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					date = df.parse(df.format(new Date()));
					time = date.getTime();
				} catch (ParseException e) {
					getErrorManager().throwException(e);
				}

				Timestamp ts = new Timestamp(time);

				//エンティティ編集 Timestamp
				TInventoryInpHist report = new TInventoryInpHist();
				report.setInputDt(ts);
				report.setInventoryBId(data.getInventoryBId());
				report.setInventoryNum(data.getInventoryNum());
				report.setLastFlg_$1();//.setLastFlg("1");

				reportList.add(report);

				//棚卸入力履歴の登録実行
				//				tInventoryInpHistBhv.insert(report);
			}
			blnUpdate = false;
		}
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start
		if (!reportList.isEmpty()) {
			//棚卸入力履歴の登録実行
			tInventoryInpHistBhv.batchInsert(reportList);
		}
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW End
	}

	/**
	 * <h2>棚卸データを更新する。</h2>
	 * <pre>
	 * 棚卸ボディの一括更新する。
	 * </pre>
	 * @param bodylist 棚卸ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateInventoryB(List<SqlInventoryInputList> bodylist, ErrorStatus errSts) {

		List<TInventoryB> updList = new ArrayList<TInventoryB>();

		for(SqlInventoryInputList ent : bodylist) {
			BigDecimal newNum = ent.getInventoryNum() != null ? ent.getInventoryNum() : WCC.ZERO;
			BigDecimal oldNum = ent.getInventoryNumOld() != null ? ent.getInventoryNumOld() : WCC.ZERO;
			if(WCC.compare(newNum ,oldNum) != 0) {
				TInventoryB tib = new TInventoryB();
				tib.setInventoryBId(ent.getInventoryBId());
				tib.setInventoryNum(newNum);
				tib.setInventoryInputFlg("1");
				tib.setVersionNo(ent.getVersionNo());
				updList.add(tib);
			}
		}

		if(updList.size() > 0) {
			tInventoryBBhv.batchUpdate(updList);
		}
	}
}