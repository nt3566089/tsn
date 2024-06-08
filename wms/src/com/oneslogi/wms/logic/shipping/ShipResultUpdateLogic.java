/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.shipping.PackingInfoUpdateLogic.PickingFlgInfo;

/**
 * 出荷実績訂正ロジッククラス
 */
public class ShipResultUpdateLogic extends AbstractWmsLogic {

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.20 kawana Start

	// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana Start

	// ===== 使用テーブル =====

	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MProductBhv mProductBhv;

	// ===== 使用ロジック =====

	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	@Inject
	private LastShipdLotLogic lastShipdLotLogic;
	@Inject
	private PackingInfoUpdateLogic packingUpdateLogic;
	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

	// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana End

	// ===== 返却用変数・クラス =====

	/** 更新情報 */
	public static class UpdateInfo extends PackingInfoUpdateLogic.UpdateInfo {
		/** 梱包変更有無 */
		public boolean doChangePacking = false;
	}

	// ===== 列挙型(クラス内使用) =====

	/** 検索条件種別 */
	private enum SearchConditionType {
		/** 出庫ヘッダID */
		PICKING_H_ID,
		/** 引当指示ボディID */
		ALLOC_INST_B_ID
	}

	private enum ChangeType {
		/** 減算 */
		MINUS,
		/** 加算 */
		PLUS
	}

	/**
	 * <h2>出荷実績訂正を実行する。</h2>
	 * <pre>
	 *
	 * 以下の順番で処理を行う。
	 *
	 * [1] 下記のチェックを行う。
	 * ・納品先の出荷停止チェック
	 * ・商品の出荷停止チェック
	 *
	 * [2] 在庫を更新する
	 * ・現在の出庫をキャンセル
	 * ・変更後の在庫を出庫
	 *
	 * [3] 下記を変更する
	 * ・各出荷指示の引当済数
	 * ・欠品フラグ
	 * ・引当ロット (最終ロット)
	 * ・梱包数
	 *
	 * [4] 期限日・ロット単位の出庫数に変更がある場合
	 * ・納品明細出力をクリア
	 *
	 * [5] 梱包数の増減または出庫在庫に変更のある梱包ヘッダに次の変更する。
	 * ・ケースピッキング情報のクリア
	 * ・積込フラグをクリア
	 * ・総重量、総容積の再計算
	 * ・梱包数が0の場合は梱包ヘッダを削除
	 * ・変更前に梱包ヘッダが0件の場合は梱包ヘッダを追加
	 *
	 * [6] 梱包ヘッダ数に増減がある場合、次の変更をする。
	 * ・荷札出力をクリア(同じ出庫ヘッダのものは全て)  ※貨物追跡番号採番単位が「梱包単位」の場合は変更しない
	 * ・送り状出力をクリア
	 * ・送り状データ出力をクリア
	 * ・積込リスト出力をクリア(同じセンタ、荷主、配送コース、出荷日のものは全て)
	 *
	 * </pre>
	 * @param shippingInstH 出荷指示ヘッダ：納品先ID・センタID・荷主ID・出庫指示バッチNo.
	 * @param shippingInstB 出荷指示ボディ：出荷指示ボディID・引当指示ボディID・商品ID
	 * @param pickingH 出庫ヘッダ：出庫ヘッダID・出庫作業No
	 * @param inputPickingBList 出庫ボディリスト：出庫ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return UpdateInfo 更新情報
	 */
	public UpdateInfo update(TShippingInstH shippingInstH, TShippingInstB shippingInstB, TPickingH pickingH, List<TPickingB> inputPickingBList, ErrorStatus errSts) {

		// 20140929 sja 修正 Start
		if (shippingInstH == null ||
				shippingInstB == null ||
				pickingH == null ||
				inputPickingBList == null) {

			// 致命的例外をスローする
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 20140929 sja 修正 End
		if (inputPickingBList.isEmpty()) {

			// 致命的例外をスローする
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更(不要な処理を削除) 2016.05.30 kawana

		final long shippingInstBId = shippingInstB.getShippingInstBId();
		final long allocInstBId = shippingInstB.getAllocInstBId();

		// 20141003 許 仮追加 [ON推-CT3-065対応] Start
		// 引当指示ボディ存在チェックを行う
		TShippingInstB dbShippingInstB = tShippingInstBBhv.selectByPKValue(shippingInstBId);

		if (dbShippingInstB.getAllocInstBId() == null || !dbShippingInstB.getAllocInstBId().equals(allocInstBId)) {

			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		TAllocInstB dbAllocInstB = selectAllocInstBWithH(allocInstBId);
		TAllocInstH dbAllocInstH = dbAllocInstB.getTAllocInstH();

		// ===== 取引先出荷停止のチェック =====

		checkShippingStopSupplyer(shippingInstH, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 商品出荷停止のチェック =====

		checkShippingStopProduct(shippingInstB, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana Start

		// ===== 変更前の梱包情報の作成 =====

		PackingInfoManager packingManager = new PackingInfoManager();

		// 関連する梱包ボディを検索
		List<TPackingB> packingBList = selectPackingBList(allocInstBId, SearchConditionType.ALLOC_INST_B_ID);

		final long productId = dbAllocInstB.getProductId();
		// 梱包情報に登録
		packingManager.createPackingInfo(productId, packingBList);

		// ===== 変更のチェック =====

		// 処理No.採番
		String processNo = numberingCenterLogic.getNumbering(shippingInstH.getCenterId(), WmsNumberingConst.PROCESS_NO);

		List<TPickingB> insertPickingBList = new ArrayList<TPickingB>();
		List<TPickingB> deletePickingBList = new ArrayList<TPickingB>();
		List<TPickingB> minusPickingBList = new ArrayList<TPickingB>();
		List<TPickingB> plusPickingBList = new ArrayList<TPickingB>();
		Map<Long, TPickingB> dbPickingBMap = new HashMap<Long, TPickingB>();

		// 更新情報
		UpdateInfo updateInfo = new UpdateInfo();

		// ロット単位の商品数を管理
		LotNumManager lotNumManager = new LotNumManager();

		for (TPickingB inputPickingB : inputPickingBList) {

			if (inputPickingB.getPickingBId() == null) {
				// 新規追加

				// [ON推-品向-1189] 出庫数0の実績訂正で致命的エラー 2016.08.23 kawana Start
				if (WCC.isPositive(inputPickingB.getPickingNum())) {
					inputPickingB.setShippingInstBId(shippingInstBId);
					inputPickingB.setAllocInstBId(allocInstBId);
					insertPickingBList.add(inputPickingB);

					// 変更有り
					updateInfo.doUpdate = true;
				}
				// [ON推-品向-1189] 出庫数0の実績訂正で致命的エラー 2016.08.23 kawana End
				continue;
			}

			final long pickingBId = inputPickingB.getPickingBId();

			// 現在の出庫ボディを検索
			TPickingB dbPickingB = selectPickingB(pickingBId);

			// 変更有無をチェック
			ChangeInfo changeInfo = isChange(dbPickingB, inputPickingB);
			if (!changeInfo.isChange) {
				// 変更無し
				continue;
			}

			// 変更有り
			updateInfo.doUpdate = true;

			if (!changeInfo.isChangeNum) {
				// 在庫変更のみ(数の変更なし)

				changePickingStockOnly(dbPickingB, inputPickingB, shippingInstH, dbShippingInstB, dbAllocInstH, dbAllocInstB, processNo, lotNumManager, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}

				continue;
			}

			if (changeInfo.isPlusNum) {
				// 数量が増えている

				plusPickingBList.add(inputPickingB);
			} else {
				// 数量が減っている

				minusPickingBList.add(inputPickingB);
				if (changeInfo.isZeroNum) {
					// 数量が0以下 => 削除

					deletePickingBList.add(dbPickingB);
				}
			}

			// 更新処理で使うため退避
			dbPickingBMap.put(pickingBId, dbPickingB);
		}

		if (!updateInfo.doUpdate) {
			// 変更なし

			return updateInfo;
		}

		// ===== 変更された出庫ボディの処理 =====

		// 梱包データが空か
		final boolean isEmptyPacking = packingManager.isEmpty(productId);
		// 同じ商品の梱包がない梱包ボディリスト (変更前に全欠品)
		List<TPickingB> notFoundPackingPickingBList = new ArrayList<TPickingB>();

		// 数が減った出庫ボディを処理 ※ 梱包を維持するため減ったものから処理 ※
		for (TPickingB inputPickingB : minusPickingBList) {

			final long pickingBId = inputPickingB.getPickingBId();

			// DBの出庫ボディ取得
			TPickingB dbPickingB = dbPickingBMap.get(pickingBId);

			BigDecimal diffNum = WCC.subtract(dbPickingB.getPickingNum(), inputPickingB.getPickingNum());

			// 出庫変更処理
			changePicking(dbPickingB, inputPickingB, diffNum, ChangeType.MINUS, shippingInstH, dbShippingInstB, dbAllocInstH, dbAllocInstB, processNo, lotNumManager, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (isEmptyPacking) {
				// 入る箱がない
				notFoundPackingPickingBList.add(inputPickingB);
			} else {
				// 梱包情報の変更
				packingManager.subtractNum(productId, pickingBId, diffNum);
			}
		}

		// 数が増えた出庫ボディを処理
		for (TPickingB inputPickingB : plusPickingBList) {

			final long pickingBId = inputPickingB.getPickingBId();

			// DBの出庫ボディ取得
			TPickingB dbPickingB = dbPickingBMap.get(pickingBId);

			BigDecimal diffNum = WCC.subtract(inputPickingB.getPickingNum(), dbPickingB.getPickingNum());

			changePicking(dbPickingB, inputPickingB, diffNum, ChangeType.PLUS, shippingInstH, dbShippingInstB, dbAllocInstH, dbAllocInstB, processNo, lotNumManager, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (isEmptyPacking) {
				// 入る箱がない
				notFoundPackingPickingBList.add(inputPickingB);
			} else {
				// 梱包情報の変更
				packingManager.addNum(productId, pickingBId, diffNum);
			}
		}

		if (0 < insertPickingBList.size()) {

			// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
			// 仮置きNoを取得
			Integer tempNo = selectTempNo(pickingH);
			// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End

			for (TPickingB insertPickingB : insertPickingBList) {

				// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
				if (tempNo != null) {
					tempNo++;
				}
				// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End

				// 出庫ボディを新規登録
				registerPicking(insertPickingB, shippingInstH, dbShippingInstB, pickingH, dbAllocInstH, dbAllocInstB, tempNo, processNo, lotNumManager, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}

				if (isEmptyPacking) {
					// 入る箱がない
					notFoundPackingPickingBList.add(insertPickingB);
				} else {
					// 梱包情報の変更
					packingManager.addNum(productId, insertPickingB.getPickingBId(), insertPickingB.getPickingNum());
				}
			}
		}

		// 引当ロット更新
		if (updateInfo.doUpdate) {

			updateAllocLot(dbAllocInstH, dbAllocInstB, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// ロット単位の商品数に差分があったか
		if (!lotNumManager.isAllZero()) {

			updateInfo.doClearPackingOut = true;

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
			// 欠品フラグの更新
			updateStockOutFlg(dbShippingInstB.getShippingInstHId());
			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
		}

		// ===== 梱包の変更 =====

		final long pickingHId = pickingH.getPickingHId();

		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start

		// パラメータマスタ検索
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(pickingH.getClientId());
		mClientCenter.setCenterId(pickingH.getCenterId());
		MParam param = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		// 全て出庫済・全て検品済の情報取得
		PickingFlgInfo pickingFlgInfo = packingUpdateLogic.getPickingFlgInfo(pickingHId, param);

		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

		// 梱包情報リスト
		for (PackingInfo packingInfo : packingManager.getPackingInfoList()) {

			// 変更のある梱包(出庫単位)情報リスト
			List<PackingPickingInfo> modifiedPickingInfoList = packingInfo.getModifiedList();

			if (modifiedPickingInfoList.isEmpty()) {
				// 変更なし
				continue;
			}

			final long packingHId = packingInfo.getPackingHId();
			TPackingH dbPackingH = null;

			// 増減のある梱包リストの繰返し
			for (PackingPickingInfo pickingInfo : modifiedPickingInfoList) {

				final long pickingBId = pickingInfo.getPickingBId();

				boolean isPlus = pickingInfo.isPlus();
				// 差分の残数
				BigDecimal remainNum = pickingInfo.getDiffNum();

				// 変更対象の梱包ボディを取得
				List<TPackingB> dbPackingBList = selectPackingBListForChange(packingHId, pickingBId);

				if (!dbPackingBList.isEmpty()) {

					dbPackingH = dbPackingBList.get(0).getTPackingH();

					// 梱包ボディの更新処理 (更新後の残数を返却)
					remainNum = updatePackingB(dbPackingBList, isPlus, remainNum);
				}

				if (WCC.isPositive(remainNum)) {
					// 残数あり

					if (isPlus) {

						// 梱包ボディの新規登録
						insertPackingB(packingHId, pickingBId, allocInstBId, remainNum, pickingFlgInfo);
					} else {
						// データ不正

						this.getErrorManager().throwException(new IllegalStateException("packingNum(TPackingB) is shortage."));
					}
				}
			}

			if (dbPackingH == null) {
				// 梱包ボディ新規追加の場合は設定されていない

				dbPackingH = tPackingHBhv.selectByPKValue(packingHId);
			}

			// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
			// 梱包データの更新
			PackingInfoUpdateLogic.ResultUpdatePackingData resultUpdatePackingH = packingUpdateLogic.updatePackingData(dbPackingH, pickingFlgInfo, param, PackingInfoUpdateLogic.DoUpdatePickingB.TRUE, errSts);
			// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (resultUpdatePackingH == PackingInfoUpdateLogic.ResultUpdatePackingData.DELETE_PACKING_H) {
				// 梱包ヘッダの削除

				updateInfo.doDeletePacking = true;
				updateInfo.modifiedPackingHCount = true;
				updateInfo.doClearSlipOut = true;
				updateInfo.doClearInvoiceCreate = true;
				updateInfo.doClearStwOut = true;
				updateInfo.doClearTagOut = true; // 後続処理で荷札が梱包単位かを判定
			}

			if (packingInfo.isModifiedNum()) {
				// 梱包数に変更あり
				updateInfo.doChangePacking = true;
			}
		}

		if (!notFoundPackingPickingBList.isEmpty()) {
			// 変更前梱包データがない出庫ボディを処理

			updateInfo.doChangePacking = true;

			// 出荷梱包No.が一番大きい梱包を検索
			TPackingH superPackingH = selectPackingHForAddPackingB(pickingHId);

			if (superPackingH == null) {
				// 新規梱包作成

				// 対象の出庫ボディを検索 (必要なテーブルを結合)
				Set<Long> pickingBIdSet = new HashSet<Long>();
				for (TPickingB b : notFoundPackingPickingBList) {
					pickingBIdSet.add(b.getPickingBId());
				}

				// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start

				// 種蒔きNo.取得
				Integer seedingNo = packingUpdateLogic.selectSeedingNo(pickingH);
				if (seedingNo != null) {
					seedingNo++;
				}

				// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End

				// 新規梱包の登録
				packingUpdateLogic.registerNewPackingData(pickingBIdSet, seedingNo, pickingFlgInfo, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}

				updateInfo.doAddPacking = true;
				updateInfo.modifiedPackingHCount = true;
				updateInfo.doClearSlipOut = true;
				updateInfo.doClearInvoiceCreate = true;
				updateInfo.doClearStwOut = true;
				updateInfo.doClearTagOut = true; // 後続処理で荷札が梱包単位かを判定
			} else {
				// 取得した梱包に全部追加

				for (TPickingB pickingB : notFoundPackingPickingBList) {

					// 梱包ボディの新規登録
					insertPackingB(superPackingH.getPackingHId(), pickingB.getPickingBId(), allocInstBId, pickingB.getPickingNum(), pickingFlgInfo);
				}

				// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
				// 梱包データの更新
				packingUpdateLogic.updatePackingData(superPackingH, pickingFlgInfo, param, PackingInfoUpdateLogic.DoUpdatePickingB.TRUE, errSts);
				// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
				if (0 < getErrorManager().size()) {
					return null;
				}
			}
		}

		// ===== 出庫数0の出庫ボディを削除 =====

		if (0 < deletePickingBList.size()) {

			tPickingBBhv.batchDelete(deletePickingBList);
		}

		// ===== 帳票出力フラグをクリア =====

		packingUpdateLogic.clearOutFlgWithTrackingNumberingUnitCheck(pickingHId, updateInfo, dbAllocInstH, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		return updateInfo;

		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana End
	}

	/**
	 * 引当指示ボディ・引当指示ヘッダの検索
	 */
	private TAllocInstB selectAllocInstBWithH(long allocInstBId) {

		TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();
		cb.query().setAllocInstBId_Equal(allocInstBId);

		TAllocInstB allocInstB = tAllocInstBBhv.selectEntity(cb);

		return allocInstB;
	}

	/**
	 * 納品先出荷停止チェック
	 */
	private void checkShippingStopSupplyer(TShippingInstH shippingInstHeader, ErrorStatus errSts) {

		if (shippingInstHeader.getSupplyCustomerId() == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		MCustomer customer = mCustomerBhv.selectByPKValue(shippingInstHeader.getSupplyCustomerId());

		if (customer == null || customer.isDelFlg$1()) {
			this.getErrorManager().add(errSts, WmsMessageConst.SHIP_TO_CODE_NOT_FOUND_ERROR);
			return;
		}

		if (customer.isShippingStopFlg$1()) {
			this.getErrorManager().add(errSts, WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return;
		}
	}

	/**
	 * 商品出荷停止チェック
	 */
	private void checkShippingStopProduct(TShippingInstB shippingInstBody, ErrorStatus errSts) {

		if (shippingInstBody.getProductId() == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		MProduct product = mProductBhv.selectByPKValue(shippingInstBody.getProductId());

		if (product == null || product.isDelFlg$1()) {
			this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CODE_FOUND_DELETED_ERROR);
			return;
		}

		if (product.isShippingStopFlg$1()) {
			this.getErrorManager().add(errSts, WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
			return;
		}
	}

	// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana Start

	/**
	 * 出庫ボディ検索
	 */
	private TPickingB selectPickingB(long pickingBId) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();

		cb.setupSelect_TStock().withMCustomer();
		cb.setupSelect_TStock().withMStockType();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withTStoreNo();

		cb.checkInvalidQuery();
		cb.query().setPickingBId_Equal(pickingBId);

		TPickingB pickingB = tPickingBBhv.selectEntity(cb);

		return pickingB;
	}

	/**
	 * 画面の入力内容とDBの登録内容に変更内容をチェック
	 */
	private ChangeInfo isChange(TPickingB before, TPickingB after) {

		ChangeInfo changeInfo = new ChangeInfo();

		// 出庫数
		BigDecimal beforeNum = before.getPickingNum();
		BigDecimal afterNum = CU.nullToZero(after.getPickingNum());
		if (!WCC.isEqual(beforeNum, afterNum)) {
			changeInfo.isChange = true;
			changeInfo.isChangeNum = true;
			if (WCC.isLessThan(beforeNum, afterNum)) {
				changeInfo.isPlusNum = true;
			} else {
				if (!WCC.isPositive(afterNum)) {
					changeInfo.isZeroNum = true;
				}
			}
		}

		TStock beforeStock = before.chaseTStock();
		TStock afterStock = after.chaseTStock();

		// 預託
		if (!equals(beforeStock.chaseMCustomer().getCustomerCd(), afterStock.chaseMCustomer().getCustomerCd())) {
			changeInfo.isChange = true;
		}

		// 在庫区分
		if (!equals(beforeStock.chaseMStockType().getStockTypeCd(), afterStock.chaseMStockType().getStockTypeCd())) {
			changeInfo.isChange = true;
		}

		// ロケーション
		if (!equals(beforeStock.chaseMLocation().getLocationCd(), afterStock.chaseMLocation().getLocationCd())) {
			changeInfo.isChange = true;
		}

		// ロット
		if (!equals(beforeStock.chaseTLot().getLot(), afterStock.chaseTLot().getLot())) {
			changeInfo.isChange = true;
		}

		// 期限日
		if (!equals(beforeStock.chaseTLot().getLimitDt(), afterStock.chaseTLot().getLimitDt())) {
			changeInfo.isChange = true;
		}

		// 入庫日
		if (!equals(beforeStock.chaseTStoreNo().getStoreDt(), afterStock.chaseTStoreNo().getStoreDt())) {
			changeInfo.isChange = true;
		}

		// 入庫ラベル
		if (!equals(beforeStock.chaseTStoreNo().getStoreLabelNo(), afterStock.chaseTStoreNo().getStoreLabelNo())) {
			changeInfo.isChange = true;
		}

		return changeInfo;
	}

	private boolean equals(String a, String b) {
		return CU.nullToStr(a).equals(CU.nullToStr(b));
	}

	/**
	 * 出庫する在庫を変更 (数量に変更なし)
	 */
	private void changePickingStockOnly(TPickingB dbPickingB, TPickingB inputPickingB, TShippingInstH shippingInstH, TShippingInstB shippingInstB, TAllocInstH dbAllocInstH, TAllocInstB dbAllocInstB,
			String processNo, LotNumManager lotNumManager, ErrorStatus errSts) {

		// ===== 在庫の更新 =====

		// 在庫更新 - 出庫(赤)
		stockUpdateShipedCancel(dbPickingB, processNo, lotNumManager, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 在庫更新 - 出庫(黒)
		stockUpdateShiped(shippingInstH, shippingInstB, dbAllocInstH, dbAllocInstB, inputPickingB, processNo, lotNumManager, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 出荷在庫の変更 =====

		dbPickingB.setStockId(inputPickingB.getStockId());
		tPickingBBhv.update(dbPickingB);
	}

	/**
	 * 出庫ボディの変更処理
	 */
	private void changePicking(TPickingB dbPickingB, TPickingB inputPickingB, BigDecimal diffNum, ChangeType type, TShippingInstH shippingInstH, TShippingInstB dbShippingInstB,
			TAllocInstH dbAllocInstH, TAllocInstB dbAllocInstB, String processNo, LotNumManager lotNumManager, ErrorStatus errSts) {

		// ===== 在庫の更新 =====

		// 在庫更新 - 出庫(赤)
		stockUpdateShipedCancel(dbPickingB, processNo, lotNumManager, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 在庫更新 - 出庫(黒)
		stockUpdateShiped(shippingInstH, dbShippingInstB, dbAllocInstH, dbAllocInstB, inputPickingB, processNo, lotNumManager, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		boolean isPlus = false;
		switch (type) {
		case PLUS:
			isPlus = true;
			break;
		case MINUS:
			isPlus = false;
			break;
		}

		// ===== 出荷在庫の変更 =====

		// 出庫ボディ
		dbPickingB.setStockId(inputPickingB.getStockId());
		dbPickingB.setPickingNum(inputPickingB.getPickingNum());
		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
		dbPickingB.setShapeId(null);
		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
		tPickingBBhv.update(dbPickingB);

		// 引当指示ボディ
		dbAllocInstB.setAllocNum(getDiffNum(dbAllocInstB.getAllocNum(), diffNum, isPlus));
		dbAllocInstB.setProcessNo(processNo);
		tAllocInstBBhv.update(dbAllocInstB);

		// 出荷指示ボディ
		dbShippingInstB.setAllocNum(getDiffNum(dbShippingInstB.getAllocNum(), diffNum, isPlus));

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start

		// 欠品数の設定
		BigDecimal stockOutNum = WCC.subtract(dbShippingInstB.getInstNum(), dbShippingInstB.getAllocNum());
		if (WCC.isNegative(stockOutNum)) {

			stockOutNum = WCC.ZERO;
		}
		dbShippingInstB.setStockOutNum(stockOutNum);

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

		tShippingInstBBhv.update(dbShippingInstB);
	}

	/**
	 * 仮置きNo.の検索
	 */
	private Integer selectTempNo(TPickingH pickingH) {

		// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start

		if (CU.isNullOrEmpty(pickingH.getPickingGroupNo())) {
			return null;
		}

		// 検索条件の設定
		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.specify().columnTempNo();

		cb.checkInvalidQuery();
		cb.query().queryTPickingH().setCenterId_Equal(pickingH.getCenterId());
		cb.query().queryTPickingH().setClientId_Equal(pickingH.getClientId());
		cb.query().queryTPickingH().setPickingGroupNo_Equal(pickingH.getPickingGroupNo());
		cb.query().setTempNo_IsNotNull();

		cb.query().addOrderBy_TempNo_Desc();
		cb.fetchFirst(1);

		TPickingB pickingB = tPickingBBhv.selectEntity(cb);

		if (pickingB == null) {
			return null;
		} else {
			return Integer.valueOf(pickingB.getTempNo());
		}

		// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
	}

	/**
	 * 新規に出庫ボディを追加
	 */
	private void registerPicking(TPickingB insertPickingB, TShippingInstH shippingInstH, TShippingInstB dbShippingInstB, TPickingH pickingH, TAllocInstH dbAllocInstH, TAllocInstB dbAllocInstB,
			Integer tempNo, String processNo, LotNumManager lotNumManager, ErrorStatus errSts) {

		// ===== 在庫更新 ======

		// 在庫更新 - 出庫(黒)
		stockUpdateShiped(shippingInstH, dbShippingInstB, dbAllocInstH, dbAllocInstB, insertPickingB, processNo, lotNumManager, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 引当済数の更新 =====

		BigDecimal pickingNum = insertPickingB.getPickingNum();

		// 引当指示ボディの更新
		dbAllocInstB.setAllocNum(WCC.add(dbAllocInstB.getAllocNum(), pickingNum));
		tAllocInstBBhv.update(dbAllocInstB);

		// 出荷指示ボディの更新
		dbShippingInstB.setAllocNum(WCC.add(dbShippingInstB.getAllocNum(), pickingNum));

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start

		// 欠品数の設定
		BigDecimal stockOutNum = WCC.subtract(dbShippingInstB.getInstNum(), dbShippingInstB.getAllocNum());
		if (WCC.isNegative(stockOutNum)) {

			stockOutNum = WCC.ZERO;
		}
		dbShippingInstB.setStockOutNum(stockOutNum);

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

		tShippingInstBBhv.update(dbShippingInstB);

		// ===== 出庫ボディの作成 =====

		insertPickingB.setPickingBId(null);
		insertPickingB.setPickingHId(pickingH.getPickingHId());
		// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
		if (tempNo != null) {
			String tmpNoStr = "0000" + String.valueOf(tempNo);
			tmpNoStr = tmpNoStr.substring(tmpNoStr.length() - 4);
			insertPickingB.setTempNo(tmpNoStr);
		}
		// [#5131][v3.1] 仮置きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
		insertPickingB.setTransitNum(WCC.ZERO);
		insertPickingB.setShapeId(null);
		tPickingBBhv.insert(insertPickingB);
	}

	/**
	 * 在庫更新 出庫(赤)
	 */
	private void stockUpdateShipedCancel(TPickingB pickingB, String processNo, LotNumManager lotNumManager, ErrorStatus errSts) {

		// 前回受払(出庫[黒])の在庫受払を検索
		TStockInoutCB stockInoutCb = tStockInoutBhv.newMyConditionBean();
		stockInoutCb.setupSelect_TAllocInstB().withTAllocInstH();

		stockInoutCb.checkInvalidQuery();
		stockInoutCb.query().setAllocInstBId_Equal(pickingB.getAllocInstBId());
		stockInoutCb.query().setStockId_Equal(pickingB.getStockId());
		stockInoutCb.query().setInoutType_Equal_$1();
		stockInoutCb.query().setCorrectType_Equal_$0();

		stockInoutCb.query().addOrderBy_StockInoutId_Desc();
		stockInoutCb.fetchFirst(1);

		TStockInout stockInout = tStockInoutBhv.selectEntity(stockInoutCb);

		// キャンセル数を出庫数に設定
		stockInout.setStockInoutNum(pickingB.getPickingNum());

		// 在庫更新.出庫[赤]メソッドの引数を作成
		TAllocInstH tAllocInstH = stockInout.getTAllocInstB().getTAllocInstH();
		TAllocInstB tAllocInstB = stockInout.getTAllocInstB();
		tAllocInstB.setProcessNo(processNo);
		List<TStockInout> stockInoutList = new ArrayList<TStockInout>();
		stockInoutList.add(stockInout);

		// 在庫更新.出庫[赤]メソッドを呼出
		stockUpdateLogic.shipedCancel(tAllocInstH, tAllocInstB, stockInoutList, errSts);

		// 出庫キャンセルした商品数をロット単位で管理(加算していく)
		lotNumManager.addNum(pickingB.getTStock().getLotId(), pickingB.getPickingNum());
	}

	/**
	 * 在庫更新 出庫(黒)
	 */
	private void stockUpdateShiped(TShippingInstH shippingInstH, TShippingInstB shippingInstB, TAllocInstH allocInstH, TAllocInstB allocInstB, TPickingB pickingB, String processNo,
			LotNumManager lotNumManager, ErrorStatus errSts) {

		if (WCC.isZero(pickingB.getPickingNum())) {
			return;
		}

		// 在庫を検索
		TStock stock = selectStock(shippingInstH, shippingInstB, pickingB, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 在庫更新の引数作成

		allocInstB.setProcessNo(processNo);

		TStockInout inout = new TStockInout();
		inout.setStockId(stock.getStockId());
		inout.setStockInoutNum(pickingB.getPickingNum());

		List<TStockInout> inoutList = new ArrayList<TStockInout>();
		inoutList.add(inout);

		// 在庫更新.出庫[黒]を呼出
		stockUpdateLogic.shiped(allocInstH, allocInstB, inoutList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		pickingB.setStockId(stock.getStockId());

		// 出庫キャンセルした商品数をロット単位で管理(減算していく)
		lotNumManager.subtractNum(stock.getLotId(), pickingB.getPickingNum());
	}

	/**
	 * 出庫した在庫を検索
	 */
	private TStock selectStock(TShippingInstH shippingInstHeader, TShippingInstB shippingInstBody, TPickingB pickingB, ErrorStatus errSts) {

		TStockCB cb = tStockBhv.newMyConditionBean();

		// 荷主
		cb.query().setClientId_Equal(shippingInstHeader.getClientId());
		// センタ
		cb.query().queryMLocation().setCenterId_Equal(shippingInstHeader.getCenterId());
		// 商品
		cb.query().setProductId_Equal(shippingInstBody.getProductId());
		// 在庫区分
		cb.query().queryMStockType().setStockTypeCd_Equal(pickingB.getTStock().chaseMStockType().getStockTypeCd());
		// ロケーション
		cb.query().queryMLocation().setLocationCd_Equal(pickingB.getTStock().chaseMLocation().getLocationCd());
		// 預託
		cb.query().queryMCustomer().setCustomerCd_Equal(pickingB.getTStock().chaseMCustomer().getCustomerCd());
		// 入庫ラベル
		cb.query().queryTStoreNo().setStoreLabelNo_Equal(pickingB.getTStock().chaseTStoreNo().getStoreLabelNo());
		// ロット
		cb.query().queryTLot().setLot_Equal(pickingB.chaseTStock().chaseTLot().getLot());
		// 期限日
		cb.query().queryTLot().setLimitDt_Equal(pickingB.chaseTStock().chaseTLot().getLimitDt());
		// 入庫日
		cb.query().queryTStoreNo().setStoreDt_Equal(pickingB.chaseTStock().chaseTStoreNo().getStoreDt());
		// 引当可能数 > 0
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		List<TStock> stockList = tStockBhv.selectList(cb);

		if (stockList.size() < 1) {
			// [新ｿﾘV2-046] メッセージ変更 2016.08.04 kawana Start
			// 在庫なし
			getErrorManager().add(errSts, WmsMessageConst.STOCK_CAN_BE_ALLOCATE_NOT_FOUND_INFORMATION);
			// [新ｿﾘV2-046] メッセージ変更 2016.08.04 kawana End
			return null;
		}

		if (1 < stockList.size()) {
			// 在庫が2件以上
			getErrorManager().add(errSts, WmsMessageConst.STOCK_DATA_PLURAL_FOUND_ERROR);
			return null;
		}

		TStock stock = stockList.get(0);

		if (WCC.isLessThan(stock.getChargeNum(), pickingB.getPickingNum())) {
			// 在庫数不足
			getErrorManager().add(errSts, WmsMessageConst.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR);
			return null;
		}

		return stock;
	}

	/**
	 * 差分計算
	 */
	private BigDecimal getDiffNum(BigDecimal srcNum, BigDecimal diffNum, boolean isPlus) {

		if (isPlus) {
			return WCC.add(srcNum, diffNum);
		} else {
			return WCC.subtract(srcNum, diffNum);
		}
	}

	/**
	 * 引当ロットの更新
	 */
	private void updateAllocLot(TAllocInstH allocInstH, TAllocInstB allocInstB, ErrorStatus errSts) {

		final long allocInstBId = allocInstB.getAllocInstBId();

		// 引当ロット削除
		deleteAllocLot(allocInstBId);

		// 最終ロット管理.最終ロット取消
		lastShipdLotLogic.LastShipLotCancel(allocInstH, allocInstB, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 引当ロット更新
		insertAllocLot(allocInstBId);

		// 最終ロット更新
		lastShipdLotLogic.LastShipLotUpdate(allocInstH, allocInstB, errSts);
		if (getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * 引当ロット削除
	 */
	private void deleteAllocLot(final long allocInstBId) {
		// 引当ロット管理を削除
		TAllocLotCB tAllocLotCB = tAllocLotBhv.newMyConditionBean();
		tAllocLotCB.checkInvalidQuery();
		tAllocLotCB.query().setAllocInstBId_Equal(allocInstBId);
		tAllocLotBhv.queryDelete(tAllocLotCB);
	}

	/**
	 * 引当ロット登録
	 */
	private void insertAllocLot(long allocInstBId) {

		// 出庫ボディを期限日ソート(降順)して1行取得
		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TStock();
		cb.setupSelect_TAllocInstB().withTAllocInstH();

		cb.query().setAllocInstBId_Equal(allocInstBId);
		cb.query().setPickingNum_GreaterThan(WCC.ZERO);
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Desc().withNullsLast();
		cb.query().queryTStock().queryTLot().addOrderBy_Lot_Desc().withNullsLast();
		cb.query().queryTStock().queryTLot().addOrderBy_LotId_Desc();
		cb.fetchFirst(1);

		TPickingB pickingB = tPickingBBhv.selectEntity(cb);

		if (pickingB == null) {
			return;
		}

		TAllocLot allocLot = new TAllocLot();
		allocLot.setAllocInstBId(allocInstBId);
		allocLot.setCustomerId(pickingB.getTAllocInstB().getTAllocInstH().getSupplyCustomerId());
		allocLot.setProductId(pickingB.getTAllocInstB().getProductId());
		allocLot.setLotId(pickingB.getTStock().getLotId());

		// 登録実行
		tAllocLotBhv.insertOrUpdateNonstrict(allocLot);
	}

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start

	/**
	 * 欠品フラグの更新
	 */
	private void updateStockOutFlg(long shippingInstHId) {

		// 欠品ボディの数
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.query().setShippingInstHId_Equal(shippingInstHId);
		cb.query().setStockOutNum_GreaterThan(WCC.ZERO);
		int count = tShippingInstBBhv.selectCount(cb);

		// 出庫指示ヘッダの更新
		TShippingInstHCB hCb = tShippingInstHBhv.newMyConditionBean();
		hCb.query().setShippingInstHId_Equal(shippingInstHId);

		TShippingInstH updateEntity = tShippingInstHBhv.newMyEntity();
		if (0 < count) {
			updateEntity.setStockOutFlg_$1();
		} else {
			updateEntity.setStockOutFlg_$0();
		}

		tShippingInstHBhv.queryUpdate(updateEntity, hCb);
	}

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

	/**
	 * 梱包ボディリスト検索(梱包ボディ更新用)
	 */
	private List<TPackingB> selectPackingBListForChange(long packingHId, long pickingBId) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TPackingH().withTPackingRAsOne();
		cb.query().addOrderBy_PackingBId_Desc();

		cb.query().setPackingHId_Equal(packingHId);
		cb.query().setPickingBId_Equal(pickingBId);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		return packingBList;
	}

	/**
	 * 梱包ボディを加算する先の梱包ヘッダを検索
	 */
	private TPackingH selectPackingHForAddPackingB(long pickingHId) {

		List<TPackingB> packingBList = selectPackingBList(pickingHId, SearchConditionType.PICKING_H_ID);

		if (packingBList.isEmpty()) {
			return null;
		}

		return packingBList.get(0).getTPackingH();
	}

	/**
	 * 梱包ボディリスト検索
	 */
	private List<TPackingB> selectPackingBList(long searchId, SearchConditionType searchConditionType) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TPackingH().withTPackingRAsOne();
		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Desc().withNullsFirst();
		cb.query().addOrderBy_PackingBId_Desc();

		switch (searchConditionType) {
		case PICKING_H_ID:
			cb.query().queryTPackingH().setPickingHId_Equal(searchId);
			cb.query().queryTPackingH().setMixedFlg_Equal_$1();
			break;
		case ALLOC_INST_B_ID:
			cb.query().setAllocInstBId_Equal(searchId);
			break;
		}

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		return packingBList;
	}

	/**
	 * 梱包ボディの更新
	 */
	private BigDecimal updatePackingB(List<TPackingB> dbPackingBList, boolean isPlus, BigDecimal diffNum) {

		// 差分残数
		BigDecimal remainNum = diffNum;

		for (TPackingB dbPackingB : dbPackingBList) {

			if (!WCC.isPositive(remainNum)) {
				break;
			}

			BigDecimal packingNum = dbPackingB.getPackingNum();

			if (isPlus) {
				// 加算
				packingNum = WCC.add(packingNum, remainNum);
				remainNum = WCC.ZERO;

			} else {
				// 減算

				if (WCC.isLessEqual(remainNum, packingNum)) {
					// 差分残数より梱包数が多い

					packingNum = WCC.subtract(packingNum, remainNum);
					remainNum = WCC.ZERO;
				} else {
					// 梱包数より差分残数が多い

					remainNum = WCC.subtract(remainNum, packingNum);
					packingNum = WCC.ZERO;
				}
			}

			if (WCC.isPositive(packingNum)) {
				// 梱包ボディ更新
				dbPackingB.setPackingNum(packingNum);
				tPackingBBhv.update(dbPackingB);
			} else {
				// 梱包ボディを削除 (梱包数が0)
				tPackingBBhv.delete(dbPackingB);
			}
		}

		return remainNum;
	}

	/**
	 * 梱包ボディの新規登録
	 */
	private void insertPackingB(final long packingHId, final long pickingBId, final long allocInstBId, BigDecimal packingNum, PickingFlgInfo pickingFlgInfo) {

		TPackingB packingB = new TPackingB();
		packingB.setPackingHId(packingHId);
		packingB.setPickingBId(pickingBId);
		packingB.setAllocInstBId(allocInstBId);

		packingB.setPackingNum(packingNum);

		// 出庫フラグ・検品フラグ
		packingUpdateLogic.setPackingBFlg(packingB, pickingFlgInfo);

		tPackingBBhv.insert(packingB);
	}

	// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana End

	/** 変更チェック結果 */
	private static class ChangeInfo {

		public boolean isChange = false;
		public boolean isChangeNum = false;
		public boolean isPlusNum = false;
		public boolean isZeroNum = false;

	}

	/** ロット単位の商品数管理クラス */
	private static class LotNumManager {

		Map<Long, BigDecimal> lotNumMap = new HashMap<Long, BigDecimal>();

		/**
		 * ロット単位の商品数を加算
		 * @param lotId ロットID
		 * @param addNum 加算数
		 */
		public void addNum(long lotId, BigDecimal addNum) {

			if (lotNumMap.containsKey(lotId)) {

				BigDecimal num = lotNumMap.get(lotId);

				lotNumMap.put(lotId, WCC.add(num, addNum));
			} else {

				lotNumMap.put(lotId, addNum);
			}
		}

		/**
		 * ロット単位の商品数を減算
		 * @param lotId ロットID
		 * @param subtractNum 減算数
		 */
		public void subtractNum(long lotId, BigDecimal subtractNum) {

			if (lotNumMap.containsKey(lotId)) {

				BigDecimal num = lotNumMap.get(lotId);

				lotNumMap.put(lotId, WCC.subtract(num, subtractNum));
			} else {

				lotNumMap.put(lotId, WCC.subtract(WCC.ZERO, subtractNum));
			}
		}

		/**
		 * 全てのロットの商品数が0かを判定
		 * @return true:全てのロットの商品数が0
		 */
		public boolean isAllZero() {

			for (BigDecimal num : lotNumMap.values()) {
				if (!WCC.isZero(num)) {
					// 0ではない
					return false;
				}
			}

			return true;
		}
	}

	/** 梱包情報管理クラス */
	private static class PackingInfoManager {

		// キー：梱包ヘッダID
		Map<Long, PackingInfo> packingInfoMap = new TreeMap<Long, PackingInfo>();
		// キー：商品ID
		Map<Long, List<PackingInfo>> packingInfoListMap = new HashMap<Long, List<PackingInfo>>();

		/**
		 * 梱包情報の作成
		 * @param productId 商品ID
		 * @param packingBList 商品関連する全ての出庫ボディリスト
		 */
		public void createPackingInfo(long productId, List<TPackingB> packingBList) {

			List<PackingInfo> packingInfoList = new ArrayList<PackingInfo>();
			Set<Long> existsCheckPackingHIdSet = new HashSet<Long>();

			for (TPackingB packingB : packingBList) {

				long packingHId = packingB.getPackingHId();
				// 同じ梱包に別商品が入ることもあるのでマップから取得
				// ※現在は商品単位で本メソッドが呼ばれるためありえないが
				//   梱包情報管理クラスの実装としてあるべき姿を追求
				PackingInfo info = packingInfoMap.get(packingHId);
				if (info == null) {

					info = new PackingInfo(packingHId, packingB.chaseTPackingH().getShippingPackingNo());
					packingInfoMap.put(packingHId, info);
				}

				info.addNum(productId, packingB.getPickingBId(), packingB.getPackingNum());

				if (!existsCheckPackingHIdSet.contains(packingHId)) {

					packingInfoList.add(info);
					existsCheckPackingHIdSet.add(packingHId);
				}
			}

			for (PackingInfo info : packingInfoList) {

				info.fixInitNum(productId);
			}

			packingInfoListMap.put(productId, packingInfoList);
		}

		/**
		 * 該当商品が入っている梱包が存在するか
		 * @param productId 商品ID
		 * @return true:梱包が存在  false:梱包が未存在
		 */
		public boolean isEmpty(long productId) {

			if (!packingInfoListMap.containsKey(productId)) {
				return false;
			}

			return packingInfoListMap.get(productId).isEmpty();
		}

		/**
		 * 梱包数の加算
		 * @param productId 商品ID
		 * @param pickingBId 出庫ボディID
		 * @param addNum 加算数
		 */
		public void addNum(long productId, long pickingBId, BigDecimal addNum) {

			if (isEmpty(productId)) {
				throw new IllegalStateException();
			}

			List<PackingInfo> infoList = packingInfoListMap.get(productId);

			// 残数
			BigDecimal remaingNum = addNum;

			for (PackingInfo info : infoList) {

				if (WCC.isZero(remaingNum)) {
					// 残数なし
					break;
				}

				if (!info.isMinus(productId)) {
					// 箱にもう入らない (引かれた数なし)
					continue;
				}

				// 箱に入る数 (他処理で引かれた数)
				BigDecimal minusNum = info.getMinusNum(productId);

				if (WCC.isLessEqual(remaingNum, minusNum)) {
					// 残数より箱に入る数が大きい

					info.addNum(productId, pickingBId, remaingNum);
					// 残数なし
					remaingNum = WCC.ZERO;
				} else {

					info.addNum(productId, pickingBId, minusNum);
					// 残数を計算
					remaingNum = WCC.subtract(remaingNum, minusNum);
				}
			}

			if (WCC.isPositive(remaingNum)) {
				// 残数あり => 入る箱がなかった

				// リストの最初の箱に入れる (出荷梱包No.の降順になっているはず)
				infoList.get(0).addNum(productId, pickingBId, remaingNum);
			}
		}

		/**
		 * 梱包数の減算
		 * @param productId 商品ID
		 * @param pickingBId 出庫ボディID
		 * @param addNum 減算数
		 */
		public void subtractNum(long productId, long pickingBId, BigDecimal subtractNum) {

			if (isEmpty(productId)) {
				throw new IllegalStateException();
			}

			List<PackingInfo> infoList = packingInfoListMap.get(productId);

			// 残数
			BigDecimal remaingNum = subtractNum;

			for (PackingInfo info : infoList) {

				if (WCC.isZero(remaingNum)) {
					// 残数なし
					break;
				}

				// 箱の数
				BigDecimal infoNum = info.getNum(productId, pickingBId);
				if (WCC.isZero(infoNum)) {
					continue;
				}

				if (WCC.isLessEqual(remaingNum, infoNum)) {
					// 残数より箱の数が大きい

					info.subtractNum(productId, pickingBId, remaingNum);
					// 残数なし
					remaingNum = WCC.ZERO;
				} else {

					info.subtractNum(productId, pickingBId, infoNum);
					// 残数を計算
					remaingNum = WCC.subtract(remaingNum, infoNum);
				}
			}

			if (WCC.isPositive(remaingNum)) {
				// 残数あり => 箱内の数が不足 (リソースでチェックしているはずなので致命的エラー)

				throw new IllegalStateException("packingNum(TPackingB) is shortage.");
			}
		}

		/**
		 * 梱包情報を取得
		 *
		 * @return 梱包情報リスト
		 */
		public List<PackingInfo> getPackingInfoList() {

			return new ArrayList<PackingInfo>(packingInfoMap.values());
		}
	}

	/** 梱包情報 */
	private static class PackingInfo {

		private final long packingHId;
		@SuppressWarnings("unused")
		private final String shippingPackingNo; // デバッグ用に保持

		// キー:商品ID
		private Map<Long, PackingProductInfo> productInfoMap = new HashMap<Long, PackingProductInfo>();

		/**
		 * コンストラクタ
		 * @param packingHId 梱包ヘッダID
		 * @param shippingPackingNo 出荷梱包No.
		 */
		public PackingInfo(long packingHId, String shippingPackingNo) {
			this.packingHId = packingHId;
			this.shippingPackingNo = shippingPackingNo;
		}

		/**
		 * 対象商品の初期梱包数の確定。現在の梱包数を初期数とする。
		 * @param productId 商品ID
		 */
		public void fixInitNum(long productId) {

			productInfoMap.get(productId).fixInitNum();
		}

		/**
		 * 対象商品、対象出庫ボディIDの梱包数を取得する。
		 * @param productId 商品ID
		 * @param pickingBId 出庫ボディID
		 * @return 梱包数
		 */
		public BigDecimal getNum(long productId, long pickingBId) {
			if (productInfoMap.containsKey(productId)) {
				return productInfoMap.get(productId).getNum(pickingBId);
			} else {
				return WCC.ZERO;
			}
		}

		/**
		 * 対象商品が初期数量から梱包数が減っているか
		 * @param productId 商品ID
		 * @return true:減っている
		 */
		public boolean isMinus(long productId) {

			if (productInfoMap.containsKey(productId)) {
				return productInfoMap.get(productId).isMinus();
			} else {
				return false;
			}
		}

		/**
		 * 対象商品の減った梱包数を取得
		 * @param productId 商品ID
		 * @return 減った梱包数 (初期梱包数との差分)
		 */
		public BigDecimal getMinusNum(long productId) {

			if (productInfoMap.containsKey(productId)) {
				return productInfoMap.get(productId).getMinusNum();
			} else {
				return WCC.ZERO;
			}
		}

		/**
		 * 対象商品の梱包数を加算
		 * @param productId 商品ID
		 * @param pickingBId 出庫ボディID
		 * @param addNum 加算数
		 */
		public void addNum(long productId, long pickingBId, BigDecimal addNum) {

			if (productInfoMap.containsKey(productId)) {
				productInfoMap.get(productId).addNum(pickingBId, addNum);
			} else {
				newPickingInfo(productId, pickingBId, addNum);
			}
		}

		/**
		 * 対象商品の梱包数を減算
		 * @param productId 商品ID
		 * @param pickingBId 出庫ボディID
		 * @param subtractNum 減算数
		 */
		public void subtractNum(long productId, long pickingBId, BigDecimal subtractNum) {

			if (productInfoMap.containsKey(productId)) {
				productInfoMap.get(productId).subtractNum(pickingBId, subtractNum);
			} else {
				throw new IllegalStateException();
			}
		}

		/**
		 * 梱包数の増減有無
		 * @return true:増減あり
		 */
		public boolean isModifiedNum() {

			for (PackingProductInfo productInfo : productInfoMap.values()) {

				if (productInfo.isModifiedNum()) {
					return true;
				}
			}

			return false;
		}

		/**
		 * 変更された梱包情報リストの取得
		 * @return 変更のある梱包情報リスト(出庫ボディID単位)
		 */
		public List<PackingPickingInfo> getModifiedList() {

			List<PackingPickingInfo> modifiedList = new ArrayList<PackingPickingInfo>();

			for (PackingProductInfo productInfo : productInfoMap.values()) {

				modifiedList.addAll(productInfo.getModifiedList());
			}

			return modifiedList;
		}

		/**
		 * 梱包ヘッダID取得
		 * @return 梱包ヘッダID
		 */
		public long getPackingHId() {
			return packingHId;
		}

		/**
		 * 新規梱包情報の登録
		 */
		private void newPickingInfo(long productId, long pickingBId, BigDecimal packingNum) {
			PackingProductInfo info = new PackingProductInfo();
			info.addNum(pickingBId, packingNum);
			productInfoMap.put(productId, info);
		}
	}

	/** 梱包商品情報 */
	private static class PackingProductInfo {

		// キー:出庫ボディID
		private Map<Long, PackingPickingInfo> pickingInfoMap = new HashMap<Long, PackingPickingInfo>();
		private BigDecimal initAllNum;
		private BigDecimal allNum = WCC.ZERO;

		/**
		 * 初期梱包数の確定。現在の梱包数を初期数量とする。
		 */
		public void fixInitNum() {

			initAllNum = allNum;

			for (PackingPickingInfo pickingInfo : pickingInfoMap.values()) {

				pickingInfo.fixInitNum();
			}
		}

		/**
		 * 現在の梱包数を取得 (出庫ボディID指定)
		 * @return 梱包数
		 */
		public BigDecimal getNum(long pickingBId) {

			if (pickingInfoMap.containsKey(pickingBId)) {
				return pickingInfoMap.get(pickingBId).getNum();
			} else {
				return WCC.ZERO;
			}
		}

		/**
		 * 初期数量から梱包数が減っているか
		 * @return true:減っている
		 */
		public boolean isMinus() {

			return WCC.isLessThan(allNum, initAllNum);
		}

		/**
		 * 減った梱包数を取得
		 * @return 減った梱包数 (初期梱包数との差分)
		 */
		public BigDecimal getMinusNum() {
			return WCC.subtract(initAllNum, allNum);
		}

		/**
		 * 梱包数を加算
		 * @param pickingBId 出庫ボディID
		 * @param addNum 加算数
		 */
		public void addNum(long pickingBId, BigDecimal addNum) {

			if (pickingInfoMap.containsKey(pickingBId)) {
				pickingInfoMap.get(pickingBId).addNum(addNum);
			} else {
				newPickingInfo(pickingBId, addNum);
			}

			allNum = WCC.add(allNum, addNum);
		}

		/**
		 * 梱包数を減算
		 * @param pickingBId 出庫ボディID
		 * @param subtractNum 減算数
		 */
		public void subtractNum(long pickingBId, BigDecimal subtractNum) {

			if (pickingInfoMap.containsKey(pickingBId)) {
				pickingInfoMap.get(pickingBId).subtractNum(subtractNum);
			} else {
				throw new IllegalStateException("Not found packing.(pickingBId)");
			}

			allNum = WCC.subtract(allNum, subtractNum);
		}

		/**
		 * 梱包数の増減有無
		 * @return true:増減あり
		 */
		public boolean isModifiedNum() {

			return !WCC.isEqual(allNum, initAllNum);
		}

		/**
		 * 変更のある梱包情報リストの取得
		 * @return 変更のある梱包情報リスト(出庫ボディID単位)
		 */
		public List<PackingPickingInfo> getModifiedList() {

			List<PackingPickingInfo> modifiedList = new ArrayList<ShipResultUpdateLogic.PackingPickingInfo>();

			for (PackingPickingInfo pickingInfo : pickingInfoMap.values()) {

				if (pickingInfo.isModified()) {
					modifiedList.add(pickingInfo);
				}
			}

			return modifiedList;
		}

		/**
		 * 新規梱包情報の登録
		 */
		private void newPickingInfo(long pickingBId, BigDecimal packingNum) {
			PackingPickingInfo info = new PackingPickingInfo(pickingBId, packingNum);
			pickingInfoMap.put(pickingBId, info);
		}
	}

	/** 梱包情報(出庫ボディID単位) */
	private static class PackingPickingInfo {

		private final long pickingBId;
		private BigDecimal initPackingNum = WCC.ZERO;
		private BigDecimal packingNum;

		/**
		 * コンストラクタ
		 * @param pickingBId 出庫ボディID
		 * @param packingNum 梱包数
		 */
		public PackingPickingInfo(long pickingBId, BigDecimal packingNum) {
			this.pickingBId = pickingBId;
			this.packingNum = packingNum;
		}

		/**
		 * 初期梱包数の確定。現在の梱包数を初期数量とする。
		 */
		public void fixInitNum() {
			initPackingNum = packingNum;
		}

		/**
		 * 梱包数の減算
		 * @param subtractNum 減算数
		 */
		public void subtractNum(BigDecimal subtractNum) {

			packingNum = WCC.subtract(packingNum, subtractNum);
		}

		/**
		 * 梱包数の加算
		 * @param addNum 加算数
		 */
		public void addNum(BigDecimal addNum) {

			packingNum = WCC.add(packingNum, addNum);
		}

		/**
		 * 梱包数の変更有無
		 * @return true:変更有
		 */
		public boolean isModified() {
			return !WCC.isEqual(initPackingNum, packingNum);
		}

		/**
		 * 梱包数が加算されているか
		 * @return true:加算されている
		 */
		public boolean isPlus() {
			return WCC.isLessThan(initPackingNum, packingNum);
		}

		/**
		 * 現在の梱包数を取得
		 * @return 梱包数
		 */
		public BigDecimal getNum() {

			return packingNum;
		}

		/**
		 * 梱包数の初期数量との差分数を取得
		 * @return 差分数
		 */
		public BigDecimal getDiffNum() {
			if (isPlus()) {
				return WCC.subtract(packingNum, initPackingNum);
			} else {
				return WCC.subtract(initPackingNum, packingNum);
			}
		}

		/**
		 * 出庫ボディIDの取得
		 * @return 出庫ボディID
		 */
		public long getPickingBId() {
			return pickingBId;
		}
	}

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.20 kawana End
}
