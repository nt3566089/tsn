package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.StockOutInstCxlFlg;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TKeepingLotCB;
import com.oneslogi.base.dbflute.cbean.TLastLotCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TKeepingLotBhv;
import com.oneslogi.base.dbflute.exbhv.TLastLotBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TKeepingLot;
import com.oneslogi.base.dbflute.exentity.TLastLot;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TShippingInstSpare;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * 在庫引当欠品ロジッククラス
 */
public class StockAllocateStockOutLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	@Inject
	private TLastLotBhv tLastLotBhv;
	@Inject
	private TKeepingLotBhv tKeepingLotBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private ParamLogic paramLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>欠品引当取消.</h2>
	 * <pre>
	 * 欠品時出庫指示取消フラグ、欠品時引当区分に従い、引当を取り消す。
	 * 引当指示ヘッダもしくは引当指示ボディ単位に取消処理をする。
	 *
	 * 【処理内容】
	 * ・欠品データ検索
	 * ・在庫更新 - 出庫[赤]
	 * ・引当済数を0に更新 (引当指示ボディ、出庫指示ボディ)
	 * ・引当ロット削除
	 * ・最終ロット更新
	 * ・出庫ボディ削除
	 * 出庫指示を取消の場合、加えて下記処理を行う
	 * ・出庫帳票の削除
	 * ・出庫ヘッダの削除
	 * ・引当指示ボディの削除
	 * ・引当指示ヘッダの削除
	 * ・出荷ステータスの更新 (未出荷)
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void allocateCancel(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();

		MClientCenter mccCb = new MClientCenter();
		mccCb.setCenterId(centerId);
		mccCb.setClientId(clientId);
		MParam param = paramLogic.getUkEntityUseCash(mccCb);

		// 欠品時引当区分
		CDef.StockOutAllocCls stockOutAllocCls = param.getStockOutAllocClsAsStockOutAllocCls();
		// 欠品時出庫指示取消フラグ
		CDef.StockOutInstCxlFlg stockOutInstCxlFlg = param.getStockOutInstCxlFlgAsStockOutInstCxlFlg();

		if (stockOutInstCxlFlg == StockOutInstCxlFlg.$1) {
			// 欠品時、出庫指示取消
			allocateCancelHeader(shippingInstHead, stockOutInstCxlFlg, errSts);
		} else {

			if (stockOutAllocCls == null) {
				return;
			}

			switch (stockOutAllocCls) {
			case $0:
				// 引当可能数を引当 (引当キャンセルしない)
				return;
			case $1:
				// 商品単位0引当
				allocateCancelBody(shippingInstHead, errSts);
				break;
			case $2:
				// 納品先単位0引当
				allocateCancelHeader(shippingInstHead, stockOutInstCxlFlg, errSts);
				break;
			}
		}
	}

	/**
	 * 引当指示ヘッダ単位での引当取消
	 */
	private void allocateCancelHeader(TShippingInstH shippingInstHead, StockOutInstCxlFlg stockOutInstCxlFlg, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();
		final long controlNo = shippingInstHead.getControlNo();

		// 出荷指示ヘッダの欠品フラグ = 1 の引当指示ボディを検索
		TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();

		cb.checkInvalidQuery();
		cb.query().queryTAllocInstH().setCenterId_Equal(centerId);
		cb.query().queryTAllocInstH().setClientId_Equal(clientId);
		cb.query().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB sihCb) {
				// 欠品フラグ
				sihCb.query().setStockOutFlg_Equal_$1();
				sihCb.query().setControlNo_Equal(controlNo);
			}
		});

		List<TAllocInstB> allocInstBList = tAllocInstBBhv.selectList(cb);
		if (allocInstBList.isEmpty()) {
			// 欠品データなし
			return;
		}

		// 引当指示ボディの引当キャンセル
		allocateCancelBody(allocInstBList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		if (stockOutInstCxlFlg == StockOutInstCxlFlg.$0) {
			// 出庫指示取消しない
			return;
		}

		// ===== 出庫指示取消 =====

		// 取消済の引当指示ヘッダID
		Set<Long> endAllocInstHIdSet = new HashSet<Long>();
		for (TAllocInstB allocInstB : allocInstBList) {

			final long allocInstHId = allocInstB.getAllocInstHId();
			if (endAllocInstHIdSet.contains(allocInstHId)) {
				// 取消済
				continue;
			}

			endAllocInstHIdSet.add(allocInstHId);

			// 出庫指示取消
			shippInstructureCancel(allocInstHId);
		}
	}

	/**
	 * 引当指示ボディ単位での引当取消
	 */
	private void allocateCancelBody(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();
		final long controlNo = shippingInstHead.getControlNo();

		// 欠品のある引当指示ボディを検索
		TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();

		cb.checkInvalidQuery();
		cb.query().queryTAllocInstH().setCenterId_Equal(centerId);
		cb.query().queryTAllocInstH().setClientId_Equal(clientId);
		cb.query().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB sihCb) {
				sihCb.query().setControlNo_Equal(controlNo);
			}
		});
		cb.query().existsTShippingInstBList(new SubQuery<TShippingInstBCB>() {

			@Override
			public void query(TShippingInstBCB sibCb) {
				// 欠品数
				sibCb.query().setStockOutNum_GreaterThan(WCC.ZERO);
			}
		});

		List<TAllocInstB> allocInstBList = tAllocInstBBhv.selectList(cb);
		if (allocInstBList.isEmpty()) {
			// 欠品データなし
			return;
		}

		// 引当指示ボディの引当キャンセル
		allocateCancelBody(allocInstBList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * 引当指示ボディ単位での引当取消
	 */
	private void allocateCancelBody(List<TAllocInstB> allocInstBList, ErrorStatus errSts) {

		// 出庫指示ボディを検索
		tAllocInstBBhv.loadTShippingInstBList(allocInstBList, new ConditionBeanSetupper<TShippingInstBCB>() {
			@Override
			public void setup(TShippingInstBCB sibCb) {
			}
		});
		// 在庫受払を検索
		tAllocInstBBhv.loadTStockInoutList(allocInstBList, new ConditionBeanSetupper<TStockInoutCB>() {
			@Override
			public void setup(TStockInoutCB sioCb) {
			}
		});

		for (TAllocInstB allocInstB : allocInstBList) {

			if (WCC.isZero(allocInstB.getAllocNum())) {
				// 引当なし
				continue;
			}

			TAllocInstH allocInstH = allocInstB.getTAllocInstH();

			// 在庫更新 - 出庫[赤]
			stockUpdateLogic.shipedCancel(allocInstH, allocInstB, allocInstB.getTStockInoutList(), errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			// 引当済数の更新
			allocInstB.setAllocNum(WCC.ZERO);
			tAllocInstBBhv.update(allocInstB);

			final long allocInstBId = allocInstB.getAllocInstBId();

			// 引当ロット削除
			deleteAllocLot(allocInstBId);
			// 最終ロット更新
			lastLotUpdate(allocInstH, allocInstB);
			// 出庫ボディ削除
			deletePickingB(allocInstBId);

			// 出荷指示ボディの引当済数更新
			List<TShippingInstB> shippingInstBList = allocInstB.getTShippingInstBList();
			for (TShippingInstB shippingInstB : shippingInstBList) {
				shippingInstB.setAllocNum(WCC.ZERO);
				tShippingInstBBhv.update(shippingInstB);
			}
		}
	}

	/**
	 * 引当ロット削除
	 */
	private void deleteAllocLot(final long allocInstBId) {

		TAllocLotCB cb = tAllocLotBhv.newMyConditionBean();
		cb.query().setAllocInstBId_Equal(allocInstBId);
		tAllocLotBhv.queryDelete(cb);
	}

	/**
	 * <h2>最終ロットを取消する。</h2>
	 * <pre>
	 * 引当指示ボディの期限日逆転防止フラグが「管理する」の場合、
	 * 最終ロット管理を過去出庫ロットの期限日に更新する。
	 *
	 * ・対象の引当ロット管理データが１件以上の場合
	 *
	 *   引当ロット管理の最大期限日と最終ロット管理の期限日を比較する。
	 *   最終ロット管理の期限日の方が大きい場合、最終ロット管理を引当ロット管理のロットに更新する。
	 *
	 * ・対象の引当ロット管理データが０件の場合
	 *
	 *   保管ロット管理の最大期限日と最終ロット管理の期限日を比較して、
	 *   最終ロット管理の期限日の方が大きい場合、最終ロット管理を保管ロット管理のロットに更新する。
	 *   保管ロット管理データが０件の場合、最終ロット管理を削除する。
	 * </pre>
	 */
	private void lastLotUpdate(TAllocInstH allocInstHeader, TAllocInstB allocInstBody) {

		if (!allocInstBody.isLimitDtReverseFlg$1()) {
			// 期限日逆転防止フラグ管理しない
			return;
		}

		final long supplierId = allocInstHeader.getSupplyCustomerId();
		final long productId = allocInstBody.getProductId();

		// ===== 最終ロット検索 =====

		TLastLotCB lastLotCb = tLastLotBhv.newMyConditionBean();
		lastLotCb.setupSelect_TLot();
		lastLotCb.query().setCustomerId_Equal(supplierId);
		lastLotCb.query().setProductId_Equal(productId);

		//検索実行
		TLastLot lastLot = tLastLotBhv.selectEntity(lastLotCb);

		if (lastLot == null) {
			// 最終ロットなし
			return;
		}

		// ===== 引当ロット検索 =====

		TAllocLotCB allocLotCb = tAllocLotBhv.newMyConditionBean();
		allocLotCb.setupSelect_TLot();
		//検索条件
		allocLotCb.query().setCustomerId_Equal(supplierId);
		allocLotCb.query().setProductId_Equal(productId);
		// 期限日等を指定している引当指示は除外
		allocLotCb.query().queryTAllocInstB().setLimitDt_IsNull();
		allocLotCb.query().queryTAllocInstB().setLocationCd_IsNull();
		allocLotCb.query().queryTAllocInstB().setLot_IsNull();
		// ソート条件で期限日の最大を取得
		allocLotCb.query().queryTLot().addOrderBy_LimitDt_Desc();
		// 1件取得
		allocLotCb.fetchFirst(1);

		TAllocLot allocLot = tAllocLotBhv.selectEntity(allocLotCb);

		TLot lot = null;
		if (allocLot != null) {
			// 引当ロット存在

			lot = allocLot.getTLot();
		} else {
			// 引当ロット未存在

			// 保管ロット検索
			TKeepingLotCB keepLotCb = tKeepingLotBhv.newMyConditionBean();
			keepLotCb.setupSelect_TLot();
			keepLotCb.query().setCustomerId_Equal(supplierId);
			keepLotCb.query().setProductId_Equal(productId);
			//ソート条件
			keepLotCb.query().queryTLot().addOrderBy_LimitDt_Desc();
			// 1件取得
			keepLotCb.fetchFirst(1);

			TKeepingLot keepLot = tKeepingLotBhv.selectEntity(keepLotCb);
			if (keepLot != null) {
				lot = keepLot.getTLot();
			}
		}

		if (lot == null) {
			// 過去に出庫ロットなし
			tLastLotBhv.delete(lastLot);
			return;
		}

		if (0 < (lastLot.getTLot().getLimitDt()).compareTo(lot.getLimitDt())) {
			// 最終ロットが大きい => 最終ロットの更新

			lastLot.setLotId(lot.getLotId());
			tLastLotBhv.update(lastLot);
		}
	}

	/**
	 * 出庫ボディ削除
	 */
	private void deletePickingB(final long allocInstBId) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.query().setAllocInstBId_Equal(allocInstBId);
		tPickingBBhv.queryDelete(cb);
	}

	/**
	 * 出荷指示取消
	 */
	private void shippInstructureCancel(final long allocInstHId) {

		// ===== 在庫受払を更新 =====
		{
			TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
			cb.query().queryTAllocInstB().setAllocInstHId_Equal(allocInstHId);

			TStockInout entity = new TStockInout();
			entity.setAllocInstBId(null);

			tStockInoutBhv.queryUpdate(entity, cb);
		}

		// ===== 出荷指示ボディを更新 =====
		{
			TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
			cb.query().queryTAllocInstB().setAllocInstHId_Equal(allocInstHId);

			TShippingInstB entity = new TShippingInstB();
			entity.setAllocInstBId(null);

			tShippingInstBBhv.queryUpdate(entity, cb);
		}

		// ===== 出荷指示ヘッダを更新 =====
		{
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
			cb.query().setAllocInstHId_Equal(allocInstHId);

			TShippingInstH entity = new TShippingInstH();
			entity.setAllocInstHId(null);
			entity.setPickingBatchNo(null);
			// 未出荷
			entity.setShippingStatus_$10();

			tShippingInstHBhv.queryUpdate(entity, cb);
		}

		// ===== 出庫帳票を削除 =====
		{
			TPickingRCB cb = tPickingRBhv.newMyConditionBean();
			cb.query().queryTPickingH().setAllocInstHId_Equal(allocInstHId);

			tPickingRBhv.queryDelete(cb);
		}

		// ===== 出庫ヘッダを削除 =====
		{
			TPickingHCB cb = tPickingHBhv.newMyConditionBean();
			cb.query().setAllocInstHId_Equal(allocInstHId);

			tPickingHBhv.queryDelete(cb);
		}

		// ===== 引当指ボディを削除 =====
		{
			TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
			cb.query().setAllocInstHId_Equal(allocInstHId);

			tAllocInstBBhv.queryDelete(cb);
		}

		// ===== 引当指示ヘッダを削除 =====
		{
			TAllocInstHCB cb = tAllocInstHBhv.newMyConditionBean();
			cb.query().setAllocInstHId_Equal(allocInstHId);

			tAllocInstHBhv.queryDelete(cb);
		}
	}

	/**
	 * <h2>欠品伝票の分離.</h2>
	 * <pre>
	 * 欠品 もしくは 引当取消 した出荷指示を
	 * 引当分と未引当分に分離する。
	 *
	 * 引当分の指示数を減らし(欠品なしにする)
	 * 未引当分の出荷指示を新規に作成する。
	 * 新規に作成した出荷指示の出荷ステータスは未出荷とする。
	 *
	 * 全数欠品の場合、
	 * 伝票の分離は行わず出荷ステータスを未出荷とする。
	 * （出庫指示取消扱い）
	 * </pre>
	 *
	 * @param shippingInstHead 出荷指示ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void splitShippingInstData(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();

		MClientCenter mccCb = new MClientCenter();
		mccCb.setCenterId(centerId);
		mccCb.setClientId(clientId);
		MParam param = paramLogic.getUkEntityUseCash(mccCb);

		// [#6552][v3.1] 欠品時伝票分離フラグがnullの時に伝票が分離されてしまう問題を修正 kawana Start
		if (!param.isStockOutInstSplitFlg$1()) {
			// [#6552][v3.1] 欠品時伝票分離フラグがnullの時に伝票が分離されてしまう問題を修正 kawana End
			// 分離しない
			return;
		}

		// ===== 分離対象を検索 =====

		// 指示数よりも引当済数が少ない出荷指示ボディを検索
		// ※※ 引当キャンセルを考慮して欠品数を条件にしない

		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TShippingInstH().withTAllocInstH();
		cb.setupSelect_TShippingInstSpareAsOne();

		cb.checkInvalidQuery();
		cb.query().queryTShippingInstH().setCenterId_Equal(centerId);
		cb.query().queryTShippingInstH().setClientId_Equal(clientId);
		cb.query().queryTShippingInstH().setControlNo_Equal(shippingInstHead.getControlNo());
		// 出庫指示済 (出庫指示取消されたものは対象としない)
		cb.query().queryTShippingInstH().setShippingStatus_Equal_$25();

		// 引当済数 ＜ 指示数
		cb.columnQuery(new SpecifyQuery<TShippingInstBCB>() {

			@Override
			public void specify(TShippingInstBCB cqCb) {
				// 引当済数
				cqCb.specify().columnAllocNum();
			}
		}).lessThan(new SpecifyQuery<TShippingInstBCB>() {

			@Override
			public void specify(TShippingInstBCB cqCb) {
				// 引当済数
				cqCb.specify().columnInstNum();
			}
		});

		// 自動テスト用に処理順を指定
		cb.addOrderBy_PK_Asc();

		// 検索実行
		List<TShippingInstB> shippingInstBList = tShippingInstBBhv.selectList(cb);
		if (shippingInstBList.isEmpty()) {
			// 対象なし
			return;
		}

		// 全欠品チェックの結果 (キー：出荷指示ヘッダID)
		Map<Long, Boolean> allStockOutMap = new HashMap<Long, Boolean>();
		// 処理済の出荷指示ヘッダID
		Set<Long> endShippingInstHIdSet = new HashSet<Long>();
		// 削除チェック対象の引当指示ヘッダID
		List<TAllocInstH> doDeleteCheckAllocInstHList = new ArrayList<TAllocInstH>();
		// コピーした出荷指示ヘッダIDのマップ (キー：コピー元出荷指示ヘッダID)
		Map<Long, Long> newShippingInstHIdMap = new HashMap<Long, Long>();

		for (TShippingInstB shippingInstB : shippingInstBList) {

			long shippingInstHId = shippingInstB.getShippingInstHId();

			// ===== (出荷指示)全欠品チェック =====

			boolean allStockOut = isAllStockOut(shippingInstHId, allStockOutMap);

			if (allStockOut) {
				// 全欠品 - 分離の必要なし

				// 出荷指示ボディ更新
				shippingInstB.setAllocInstBId(null);
				tShippingInstBBhv.update(shippingInstB);

				// 引当指示ボディの更新
				splitShippingInstData_updateAllocInstB(shippingInstB.getTAllocInstB(), shippingInstB.getInstNum());

				if (!endShippingInstHIdSet.contains(shippingInstHId)) {
					// 出荷指示ヘッダの更新

					endShippingInstHIdSet.add(shippingInstHId);

					TShippingInstH shippingInstH = shippingInstB.getTShippingInstH();

					// 削除チェック対象の引当指示ヘッダを設定
					doDeleteCheckAllocInstHList.add(shippingInstH.getTAllocInstH());

					shippingInstH.setAllocInstHId(null);
					shippingInstH.setPickingBatchNo(null);
					// 未出荷
					shippingInstH.setShippingStatus_$10();

					tShippingInstHBhv.update(shippingInstH);
				}
			} else {
				// 部分欠品 - 分離

				// 出荷指示ヘッダの分離
				if (!endShippingInstHIdSet.contains(shippingInstHId)) {
					endShippingInstHIdSet.add(shippingInstHId);

					TShippingInstH shippingInstH = shippingInstB.getTShippingInstH();

					// 出荷指示ヘッダのコピー
					TShippingInstH newShippingInstH = shippingInstH.clone();

					newShippingInstH.setShippingInstHId(null);
					newShippingInstH.setAllocInstHId(null);
					newShippingInstH.setShippingSlipNo(numberingLogic.getNumbering(centerId, WmsCoreNumberingConst.SHIPPING_SLIP_NO));
					newShippingInstH.setShippingStatus_$10();
					newShippingInstH.setPickingBatchNo(null);
					// 金額をクリア
					newShippingInstH.setCod(null);
					newShippingInstH.setCodTax(null);
					newShippingInstH.setCodTax(null);
					newShippingInstH.setTotalPrice(null);
					newShippingInstH.setTotalTax(null);

					// コピーを登録
					tShippingInstHBhv.insert(newShippingInstH);

					// 新しい出荷指示ヘッダIDを退避
					newShippingInstHIdMap.put(shippingInstHId, newShippingInstH.getShippingInstHId());

					// コピー元の出荷指示ヘッダは欠品フラグを0にする
					shippingInstH.setStockOutFlg_$0();
					tShippingInstHBhv.update(shippingInstH);
				}

				// 出荷指示ボディの分離

				BigDecimal allocNum = shippingInstB.getAllocNum();
				if (WCC.isZero(allocNum)) {
					// 引当なし -> ボディは分離しない

					// 出荷指示ボディ更新
					shippingInstB.setAllocInstBId(null);
					shippingInstB.setShippingInstHId(newShippingInstHIdMap.get(shippingInstHId));
					tShippingInstBBhv.update(shippingInstB);

					// 引当指示ボディの更新
					splitShippingInstData_updateAllocInstB(shippingInstB.getTAllocInstB(), shippingInstB.getInstNum());

				} else {
					// 引当あり -> ボディも分離

					BigDecimal subtractNum = WCC.subtract(shippingInstB.getInstNum(), allocNum);

					// 引当指示ボディの更新
					splitShippingInstData_updateAllocInstB(shippingInstB.getTAllocInstB(), subtractNum);

					// 出荷指示ボディのコピー
					TShippingInstB newShippingInstB = shippingInstB.clone();

					newShippingInstB.setShippingInstBId(null);
					newShippingInstB.setShippingInstHId(newShippingInstHIdMap.get(shippingInstHId));
					newShippingInstB.setAllocInstBId(null);
					newShippingInstB.setInstNum(subtractNum);
					newShippingInstB.setAllocNum(WCC.ZERO);
					// 金額をクリア (単価はそのまま)
					newShippingInstB.setPrice(null);
					newShippingInstB.setTax(null);

					// コピーを登録
					tShippingInstBBhv.insert(newShippingInstB);

					// 出荷指示備考のコピー
					TShippingInstSpare newShippingInstSpare = shippingInstB.chaseTShippingInstSpareAsOne().clone();
					newShippingInstSpare.setShippingInstBId(newShippingInstB.getShippingInstBId());
					// コピーを登録
					tShippingInstSpareBhv.insert(newShippingInstSpare);

					// コピー元の出庫指示ボディを編集 (欠品なし)
					shippingInstB.setInstNum(allocNum);
					shippingInstB.setStockOutNum(WCC.ZERO);

					tShippingInstBBhv.update(shippingInstB);
				}
			}
		}

		// ===== 引当指示ヘッダの削除 =====

		// 処理済の出荷指示ヘッダID
		Set<Long> endAllocInstHIdSet = new HashSet<Long>();

		for (TAllocInstH allocInstH : doDeleteCheckAllocInstHList) {

			long allocInstHId = allocInstH.getAllocInstHId();

			if (endAllocInstHIdSet.contains(allocInstHId)) {
				continue;
			}
			endAllocInstHIdSet.add(allocInstHId);

			splitShippingInstData_deleteAllocInstH(allocInstH);
		}
	}

	/**
	 * 全欠品チェック
	 */
	private boolean isAllStockOut(long shippingInstHId, Map<Long, Boolean> allStockOutMap) {

		if (allStockOutMap.containsKey(shippingInstHId)) {
			// 既に取得済
			return allStockOutMap.get(shippingInstHId);
		}

		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.query().setShippingInstHId_Equal(shippingInstHId);
		cb.query().setAllocNum_GreaterThan(WCC.ZERO);

		int count = tShippingInstBBhv.selectCount(cb);

		if (0 < count) {
			// 引当済のボディが存在

			allStockOutMap.put(shippingInstHId, false);
			return false;
		} else {
			// 引当済のボディが未存在

			allStockOutMap.put(shippingInstHId, true);
			return true;
		}
	}

	/**
	 * 引当指示ボディの更新
	 */
	private void splitShippingInstData_updateAllocInstB(TAllocInstB allocInstB, BigDecimal subtractNum) {

		BigDecimal allocInstNum = WCC.subtract(allocInstB.getInstNum(), subtractNum);
		if (WCC.isZero(allocInstNum)) {
			// 指示数 = 0 -> 削除

			// ===== 在庫受払を更新 =====
			// ※引当キャンセルで欠品した場合は受払が発生しているため

			TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
			cb.query().setAllocInstBId_Equal(allocInstB.getAllocInstBId());
			TStockInout entity = new TStockInout();
			entity.setAllocInstBId(null);

			tStockInoutBhv.queryUpdate(entity, cb);

			// ===== 引当指示ボディ削除 =====

			tAllocInstBBhv.delete(allocInstB);
		} else {
			// ===== 指示数更新 =====

			allocInstB.setInstNum(allocInstNum);
			tAllocInstBBhv.update(allocInstB);
		}
	}

	/**
	 * 引当指示ヘッダの削除
	 */
	private void splitShippingInstData_deleteAllocInstH(TAllocInstH allocInstH) {

		// ===== 引当指示ボディが0件か確認 =====

		final long allocInstHId = allocInstH.getAllocInstHId();

		TAllocInstBCB countCb = tAllocInstBBhv.newMyConditionBean();
		countCb.query().setAllocInstHId_Equal(allocInstHId);

		int bodyCount = tAllocInstBBhv.selectCount(countCb);

		if (bodyCount < 1) {
			// ボディ0件

			// ===== 出庫帳票を削除 =====
			{
				TPickingRCB cb = tPickingRBhv.newMyConditionBean();
				cb.query().queryTPickingH().setAllocInstHId_Equal(allocInstHId);

				tPickingRBhv.queryDelete(cb);
			}

			// ===== 出庫ヘッダを削除 =====
			{
				TPickingHCB cb = tPickingHBhv.newMyConditionBean();
				cb.query().setAllocInstHId_Equal(allocInstHId);

				tPickingHBhv.queryDelete(cb);
			}

			// ===== 引当指示ヘッダ削除 =====

			tAllocInstHBhv.delete(allocInstH);
		}
	}

}