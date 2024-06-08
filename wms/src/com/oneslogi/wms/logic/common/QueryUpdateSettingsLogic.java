package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.HInventoryBCB;
import com.oneslogi.base.dbflute.cbean.HInventoryHCB;
import com.oneslogi.base.dbflute.cbean.HMoveBCB;
import com.oneslogi.base.dbflute.cbean.HMoveHCB;
import com.oneslogi.base.dbflute.cbean.HPackingBCB;
import com.oneslogi.base.dbflute.cbean.HPackingHCB;
import com.oneslogi.base.dbflute.cbean.HReceiveBCB;
import com.oneslogi.base.dbflute.cbean.HReceiveHCB;
import com.oneslogi.base.dbflute.cbean.HReceiveSpareCB;
import com.oneslogi.base.dbflute.cbean.HShippingBCB;
import com.oneslogi.base.dbflute.cbean.HShippingHCB;
import com.oneslogi.base.dbflute.cbean.HShippingSpareCB;
import com.oneslogi.base.dbflute.cbean.HStockCB;
import com.oneslogi.base.dbflute.cbean.HStockInoutCB;
import com.oneslogi.base.dbflute.cbean.HStockReportCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInstCB;
import com.oneslogi.base.dbflute.cbean.TInventoryRCB;
import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstHCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstRCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanRCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanSpareCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstSpareCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStockReportCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoRCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordRCB;
import com.oneslogi.base.dbflute.exbhv.HInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.HInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.HMoveBBhv;
import com.oneslogi.base.dbflute.exbhv.HMoveHBhv;
import com.oneslogi.base.dbflute.exbhv.HPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.HPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.HReceiveBBhv;
import com.oneslogi.base.dbflute.exbhv.HReceiveHBhv;
import com.oneslogi.base.dbflute.exbhv.HReceiveSpareBhv;
import com.oneslogi.base.dbflute.exbhv.HShippingBBhv;
import com.oneslogi.base.dbflute.exbhv.HShippingHBhv;
import com.oneslogi.base.dbflute.exbhv.HShippingSpareBhv;
import com.oneslogi.base.dbflute.exbhv.HStockBhv;
import com.oneslogi.base.dbflute.exbhv.HStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.HStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanSpareBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoRBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exentity.HInventoryB;
import com.oneslogi.base.dbflute.exentity.HInventoryH;
import com.oneslogi.base.dbflute.exentity.HMoveB;
import com.oneslogi.base.dbflute.exentity.HMoveH;
import com.oneslogi.base.dbflute.exentity.HPackingB;
import com.oneslogi.base.dbflute.exentity.HPackingH;
import com.oneslogi.base.dbflute.exentity.HReceiveB;
import com.oneslogi.base.dbflute.exentity.HReceiveH;
import com.oneslogi.base.dbflute.exentity.HReceiveSpare;
import com.oneslogi.base.dbflute.exentity.HShippingB;
import com.oneslogi.base.dbflute.exentity.HShippingH;
import com.oneslogi.base.dbflute.exentity.HShippingSpare;
import com.oneslogi.base.dbflute.exentity.HStock;
import com.oneslogi.base.dbflute.exentity.HStockInout;
import com.oneslogi.base.dbflute.exentity.HStockReport;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TInventoryR;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TReceivePlanSpare;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TShippingInstSpare;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStockReport;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.TStoreNoR;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;

/**
 * QueryDelete , QueryUpdate用引数クラスの管理ロジッククラス
 */
public class QueryUpdateSettingsLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private HStockReportBhv hStockReportBhv;
	@Inject
	private TStockReportBhv tStockReportBhv;
	@Inject
	private HStockBhv hStockBhv;
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private TStoreRecordRBhv tStoreRecordRBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TInventoryInpHistBhv tInventoryInpHistBhv;
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	@Inject
	private TInventoryRBhv tInventoryRBhv;
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	@Inject
	private HReceiveBBhv hReceiveBBhv;
	@Inject
	private HReceiveHBhv hReceiveHBhv;
	@Inject
	private HPackingBBhv hPackingBBhv;
	@Inject
	private HPackingHBhv hPackingHBhv;
	@Inject
	private HShippingBBhv hShippingBBhv;
	@Inject
	private HShippingHBhv hShippingHBhv;
	@Inject
	private HInventoryBBhv hInventoryBBhv;
	@Inject
	private HInventoryHBhv hInventoryHBhv;
	@Inject
	private HMoveBBhv hMoveBBhv;
	@Inject
	private HMoveHBhv hMoveHBhv;
	@Inject
	private HStockInoutBhv hStockInoutBhv;
	@Inject
	private TLotBhv tLotBhv;
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TStoreNoBhv tStoreNoBhv;
	@Inject
	private TStoreNoRBhv tStoreNoRBhv;
	// [#2253]予備項目対応 2017.09.28 sampei Start
	@Inject
	private TReceivePlanSpareBhv tReceivePlanSpareBhv;
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	@Inject
	private HReceiveSpareBhv hReceiveSpareBhv;
	@Inject
	private HShippingSpareBhv hShippingSpareBhv;

	// [#2253]予備項目対応 2017.09.28 sampei End

	/**
	 * <h2>QueryDelete , QueryUpdateの引数を取得する。</h2>
	 * <pre>
	 * 日次締処理共通ロジッククラスの QueryDelete , QueryUpdate メソッドの引数、
	 * QuerySetterクラスを作成して返却する。
	 * </pre>
	 * @param bhv 処理対象テーブルの操作クラス
	 * @return AbstractQuerySetter 処理対象テーブル用のQuerySetterクラス
	 */
	public AbstractQuerySetter getQuerySetter(AbstractBehaviorWritable<?, ?> bhv) {

		if (bhv instanceof HStockReportBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HStockReportCB) cb).specify().columnStockReportId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hStockReportBhv.extractStockReportIdList((List<HStockReport>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HStockReportCB cb = hStockReportBhv.newMyConditionBean();
					cb.query().setStockReportId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStockReportBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStockReportCB) cb).specify().columnStockId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStockReportBhv.extractStockIdList((List<TStockReport>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStockReportCB cb = tStockReportBhv.newMyConditionBean();
					cb.query().setStockId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HStockBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HStockCB) cb).specify().columnStockId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hStockBhv.extractStockIdList((List<HStock>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HStockCB cb = hStockBhv.newMyConditionBean();
					cb.query().setStockId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStockBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStockCB) cb).specify().columnStockId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStockBhv.extractStockIdList((List<TStock>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStockCB cb = tStockBhv.newMyConditionBean();
					cb.query().setStockId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStockInoutBhv) {

			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStockInoutCB) cb).specify().columnStockInoutId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStockInoutBhv.extractStockInoutIdList((List<TStockInout>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
					cb.query().setStockInoutId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStoreRecordBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStoreRecordBCB) cb).specify().columnStoreRecordBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStoreRecordBBhv.extractStoreRecordBIdList((List<TStoreRecordB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
					cb.query().setStoreRecordBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStoreRecordRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStoreRecordRCB) cb).specify().columnStoreRecordHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStoreRecordRBhv.extractStoreRecordHIdList((List<TStoreRecordR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStoreRecordRCB cb = tStoreRecordRBhv.newMyConditionBean();
					cb.query().setStoreRecordHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStoreRecordHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStoreRecordHCB) cb).specify().columnStoreRecordHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStoreRecordHBhv.extractStoreRecordHIdList((List<TStoreRecordH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStoreRecordHCB cb = tStoreRecordHBhv.newMyConditionBean();
					cb.query().setStoreRecordHId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#2253]予備項目対応 2017.09.28 sampei Start
		if (bhv instanceof TReceivePlanSpareBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TReceivePlanSpareCB) cb).specify().columnReceivePlanBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tReceivePlanSpareBhv.extractReceivePlanBIdList((List<TReceivePlanSpare>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TReceivePlanSpareCB cb = tReceivePlanSpareBhv.newMyConditionBean();
					cb.query().setReceivePlanBId_InScope(pkList);
					return cb;
				}
			};
		}
		// [#2253]予備項目対応 2017.09.28 sampei End

		if (bhv instanceof TReceivePlanBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TReceivePlanBCB) cb).specify().columnReceivePlanBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tReceivePlanBBhv.extractReceivePlanBIdList((List<TReceivePlanB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
					cb.query().setReceivePlanBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TReceivePlanRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TReceivePlanRCB) cb).specify().columnReceivePlanHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tReceivePlanRBhv.extractReceivePlanHIdList((List<TReceivePlanR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TReceivePlanRCB cb = tReceivePlanRBhv.newMyConditionBean();
					cb.query().setReceivePlanHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TReceivePlanHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TReceivePlanHCB) cb).specify().columnReceivePlanHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tReceivePlanHBhv.extractReceivePlanHIdList((List<TReceivePlanH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
					cb.query().setReceivePlanHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPackingRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPackingRCB) cb).specify().columnPackingHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPackingRBhv.extractPackingHIdList((List<TPackingR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPackingRCB cb = tPackingRBhv.newMyConditionBean();
					cb.query().setPackingHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPackingBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPackingBCB) cb).specify().columnPackingBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPackingBBhv.extractPackingBIdList((List<TPackingB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPackingBCB cb = tPackingBBhv.newMyConditionBean();
					cb.query().setPackingBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPackingHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPackingHCB) cb).specify().columnPackingHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPackingHBhv.extractPackingHIdList((List<TPackingH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPackingHCB cb = tPackingHBhv.newMyConditionBean();
					cb.query().setPackingHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPickingBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPickingBCB) cb).specify().columnPickingBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPickingBBhv.extractPickingBIdList((List<TPickingB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPickingBCB cb = tPickingBBhv.newMyConditionBean();
					cb.query().setPickingBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPickingRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPickingRCB) cb).specify().columnPickingHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPickingRBhv.extractPickingHIdList((List<TPickingR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPickingRCB cb = tPickingRBhv.newMyConditionBean();
					cb.query().setPickingHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPickingHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPickingHCB) cb).specify().columnPickingHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPickingHBhv.extractPickingHIdList((List<TPickingH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPickingHCB cb = tPickingHBhv.newMyConditionBean();
					cb.query().setPickingHId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#2253]予備項目対応 2017.09.28 sampei Start
		if (bhv instanceof TShippingInstSpareBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TShippingInstSpareCB) cb).specify().columnShippingInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tShippingInstSpareBhv.extractShippingInstBIdList((List<TShippingInstSpare>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TShippingInstSpareCB cb = tShippingInstSpareBhv.newMyConditionBean();
					cb.query().setShippingInstBId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#2253]予備項目対応 2017.09.28 sampei End

		if (bhv instanceof TShippingInstBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TShippingInstBCB) cb).specify().columnShippingInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tShippingInstBBhv.extractShippingInstBIdList((List<TShippingInstB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
					cb.query().setShippingInstBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TShippingInstHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TShippingInstHCB) cb).specify().columnShippingInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tShippingInstHBhv.extractShippingInstHIdList((List<TShippingInstH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
					cb.query().setShippingInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TInventoryInpHistBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TInventoryInpHistCB) cb).specify().columnInventoryInpHistId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tInventoryInpHistBhv.extractInventoryInpHistIdList((List<TInventoryInpHist>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TInventoryInpHistCB cb = tInventoryInpHistBhv.newMyConditionBean();
					cb.query().setInventoryInpHistId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TInventoryInstBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TInventoryInstCB) cb).specify().columnInventoryInstId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tInventoryInstBhv.extractInventoryInstIdList((List<TInventoryInst>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TInventoryInstCB cb = tInventoryInstBhv.newMyConditionBean();
					cb.query().setInventoryInstId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TInventoryBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TInventoryBCB) cb).specify().columnInventoryBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tInventoryBBhv.extractInventoryBIdList((List<TInventoryB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
					cb.query().setInventoryBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TInventoryHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TInventoryHCB) cb).specify().columnInventoryHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tInventoryHBhv.extractInventoryHIdList((List<TInventoryH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TInventoryHCB cb = tInventoryHBhv.newMyConditionBean();
					cb.query().setInventoryHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TMoveRecordBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TMoveRecordBCB) cb).specify().columnMoveRecordBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tMoveRecordBBhv.extractMoveRecordBIdList((List<TMoveRecordB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TMoveRecordBCB cb = tMoveRecordBBhv.newMyConditionBean();
					cb.query().setMoveRecordBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TMoveInstBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TMoveInstBCB) cb).specify().columnMoveInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tMoveInstBBhv.extractMoveInstBIdList((List<TMoveInstB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
					cb.query().setMoveInstBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TMoveInstHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TMoveInstHCB) cb).specify().columnMoveInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tMoveInstHBhv.extractMoveInstHIdList((List<TMoveInstH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TMoveInstHCB cb = tMoveInstHBhv.newMyConditionBean();
					cb.query().setMoveInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TMoveInstRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TMoveInstRCB) cb).specify().columnMoveInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tMoveInstRBhv.extractMoveInstHIdList((List<TMoveInstR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TMoveInstRCB cb = tMoveInstRBhv.newMyConditionBean();
					cb.query().setMoveInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TInventoryRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TInventoryRCB) cb).specify().columnInventoryBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tInventoryRBhv.extractInventoryBIdList((List<TInventoryR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
					cb.query().setInventoryBId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#2253]予備項目対応 2017.09.28 sampei Start
		if (bhv instanceof HReceiveSpareBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HReceiveSpareCB) cb).specify().columnStoreRecordBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hReceiveSpareBhv.extractStoreRecordBIdList((List<HReceiveSpare>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HReceiveSpareCB cb = hReceiveSpareBhv.newMyConditionBean();
					cb.query().setStoreRecordBId_InScope(pkList);
					return cb;
				}
			};
		}
		// [#2253]予備項目対応 2017.09.28 sampei End

		if (bhv instanceof HReceiveBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HReceiveBCB) cb).specify().columnStoreRecordBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hReceiveBBhv.extractStoreRecordBIdList((List<HReceiveB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HReceiveBCB cb = hReceiveBBhv.newMyConditionBean();
					cb.query().setStoreRecordBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HReceiveHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HReceiveHCB) cb).specify().columnStoreRecordHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hReceiveHBhv.extractStoreRecordHIdList((List<HReceiveH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HReceiveHCB cb = hReceiveHBhv.newMyConditionBean();
					cb.query().setStoreRecordHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HPackingBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HPackingBCB) cb).specify().columnPackingBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hPackingBBhv.extractPackingBIdList((List<HPackingB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HPackingBCB cb = hPackingBBhv.newMyConditionBean();
					cb.query().setPackingBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HPackingHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HPackingHCB) cb).specify().columnPackingHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hPackingHBhv.extractPackingHIdList((List<HPackingH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HPackingHCB cb = hPackingHBhv.newMyConditionBean();
					cb.query().setPackingHId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#2253]予備項目対応 2017.09.28 sampei End
		if (bhv instanceof HShippingSpareBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HShippingSpareCB) cb).specify().columnShippingInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hShippingSpareBhv.extractShippingInstBIdList((List<HShippingSpare>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HShippingSpareCB cb = hShippingSpareBhv.newMyConditionBean();
					cb.query().setShippingInstBId_InScope(pkList);
					return cb;
				}
			};
		}
		// [#2253]予備項目対応 2017.09.28 sampei End

		if (bhv instanceof HShippingBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HShippingBCB) cb).specify().columnShippingInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hShippingBBhv.extractShippingInstBIdList((List<HShippingB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HShippingBCB cb = hShippingBBhv.newMyConditionBean();
					cb.query().setShippingInstBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HShippingHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HShippingHCB) cb).specify().columnShippingInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hShippingHBhv.extractShippingInstHIdList((List<HShippingH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HShippingHCB cb = hShippingHBhv.newMyConditionBean();
					cb.query().setShippingInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HInventoryBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HInventoryBCB) cb).specify().columnInventoryBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hInventoryBBhv.extractInventoryBIdList((List<HInventoryB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HInventoryBCB cb = hInventoryBBhv.newMyConditionBean();
					cb.query().setInventoryBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HInventoryHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HInventoryHCB) cb).specify().columnInventoryHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hInventoryHBhv.extractInventoryHIdList((List<HInventoryH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HInventoryHCB cb = hInventoryHBhv.newMyConditionBean();
					cb.query().setInventoryHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HMoveBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HMoveBCB) cb).specify().columnMoveRecordBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hMoveBBhv.extractMoveRecordBIdList((List<HMoveB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HMoveBCB cb = hMoveBBhv.newMyConditionBean();
					cb.query().setMoveRecordBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HMoveHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HMoveHCB) cb).specify().columnMoveInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hMoveHBhv.extractMoveInstHIdList((List<HMoveH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HMoveHCB cb = hMoveHBhv.newMyConditionBean();
					cb.query().setMoveInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof HStockInoutBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((HStockInoutCB) cb).specify().columnStockInoutId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return hStockInoutBhv.extractStockInoutIdList((List<HStockInout>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					HStockInoutCB cb = hStockInoutBhv.newMyConditionBean();
					cb.query().setStockInoutId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TLotBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TLotCB) cb).specify().columnLotId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tLotBhv.extractLotIdList((List<TLot>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TLotCB cb = tLotBhv.newMyConditionBean();
					cb.query().setLotId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TAllocLotBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TAllocLotCB) cb).specify().columnAllocInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tAllocLotBhv.extractAllocInstBIdList((List<TAllocLot>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TAllocLotCB cb = tAllocLotBhv.newMyConditionBean();
					cb.query().setAllocInstBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TAllocInstBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TAllocInstBCB) cb).specify().columnAllocInstBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tAllocInstBBhv.extractAllocInstBIdList((List<TAllocInstB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
					cb.query().setAllocInstBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TAllocInstHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TAllocInstHCB) cb).specify().columnAllocInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tAllocInstHBhv.extractAllocInstHIdList((List<TAllocInstH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TAllocInstHCB cb = tAllocInstHBhv.newMyConditionBean();
					cb.query().setAllocInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStoreNoBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStoreNoCB) cb).specify().columnStoreNoId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStoreNoBhv.extractStoreNoIdList((List<TStoreNo>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStoreNoCB cb = tStoreNoBhv.newMyConditionBean();
					cb.query().setStoreNoId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TStoreNoRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TStoreNoRCB) cb).specify().columnStoreNoId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tStoreNoRBhv.extractStoreNoIdList((List<TStoreNoR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TStoreNoRCB cb = tStoreNoRBhv.newMyConditionBean();
					cb.query().setStoreNoId_InScope(pkList);
					return cb;
				}
			};
		}

		getErrorManager().throwException(new IllegalArgumentException("querySetter not found"));
		return null;
	}
}
