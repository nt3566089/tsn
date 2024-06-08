package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * ケースピッキング検品登録ロジッククラス
 */
public class ShippingCasePickingInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// ===== 使用ロジック =====

	@Inject
	private ParamLogic paramLogic;

	/**
	 * <h2>出荷ピッキングワークを登録する。</h2>
	 * <pre>
	 * 対象データを検索(梱包ボディ)し、出荷ピッキングワークを作成・登録する。
	 * 検索対象が見つからない場合、エラーを登録する。
	 *
	 * 商品、ロケーション、ロット、入庫No.（入庫NO.管理対象の場合）単位で
	 * 指示数(梱包数)を合計し、出荷ピッキングワークデータを登録する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス
	 * @param casePickingNo ケースピッキングNO
	 */
	public void insertWHtShippingPicking(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.26 chou Add Start

		// ===== 入庫No.管理フラグ取得 =====

		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(wHtShippingPicking.getClientId());
		mClientCenter.setCenterId(wHtShippingPicking.getCenterId());
		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

		boolean isStoreNoManage = mParam.isStoreNoFlg$1();

		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.26 chou Add End

		// ===== 対象データ(梱包ボディ)取得 =====

		TPackingBCB packingBCB = tPackingBBhv.newMyConditionBean();

		// テーブル結合
		packingBCB.setupSelect_TPickingB().withTPickingH();
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
		packingBCB.setupSelect_TPickingB().withTStock().withTLot();
		packingBCB.setupSelect_TPickingB().withTStock().withMLocation();
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		packingBCB.setupSelect_TPickingB().withTStock().withMProduct();
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		packingBCB.setupSelect_TPickingB().withTStock().withMLocation().withMZone();
		packingBCB.setupSelect_TPickingB().withTStock().withTStoreNo();

		// 取得条件
		packingBCB.checkInvalidQuery();
		packingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		packingBCB.query().setCasePickingNo_Equal(casePickingNo);

		// ソート条件
		packingBCB.query().queryTPickingB().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		packingBCB.query().queryTPickingB().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		packingBCB.query().queryTPickingB().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		packingBCB.query().queryTPickingB().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		packingBCB.query().queryTPickingB().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		packingBCB.query().queryTPickingB().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		packingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();

		// 検索実行
		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBCB);

		if (packingBList.size() < 1) {
			// 該当データなし

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// ===== 出荷ピッキングワーク作成 =====

		// ※ 順番はDBの検索順を保持する
		Map<WHtShippingPickingKey, WHtShippingPicking> insertWorkEntityMap = new LinkedHashMap<WHtShippingPickingKey, WHtShippingPicking>();

		for (TPackingB packingB : packingBList) {

			TStock stock = packingB.getTPickingB().getTStock();

			// 梱包数を合計するキー作成
			// - 商品、ロケーション、ロットをキー
			// - 入庫ラベルNo.管理する場合は 入庫ラベルNo.もキーに追加

			WHtShippingPickingKey key;

			long productId = stock.getProductId();
			long locationId = stock.getLocationId();
			long lotId = stock.getLotId();

			if (isStoreNoManage) {
				long storeNoId = stock.getStoreNoId();
				key = new WHtShippingPickingKey(productId, locationId, lotId, storeNoId);
			} else {
				key = new WHtShippingPickingKey(productId, locationId, lotId);
			}

			WHtShippingPicking insertWorkEntity;
			if (insertWorkEntityMap.containsKey(key)) {
				// 作成済

				// 梱包数を加算
				insertWorkEntity = insertWorkEntityMap.get(key);
				BigDecimal instNum = WCC.add(insertWorkEntity.getInstNum(), packingB.getPackingNum());
				insertWorkEntity.setInstNum(instNum);
				continue;
			}

			// 未作成のため新規作成

			insertWorkEntity = new WHtShippingPicking();

			insertWorkEntity.setMacAddress(wHtShippingPicking.getMacAddress());
			insertWorkEntity.setClientId(wHtShippingPicking.getClientId());
			insertWorkEntity.setCenterId(wHtShippingPicking.getCenterId());
			// 出庫ボディID : 合計するから必ず一致するとは限らないが…
			insertWorkEntity.setPickingBId(packingB.getPickingBId());
			insertWorkEntity.setPickingWorkNo(packingB.getTPickingB().getTPickingH().getPickingWorkNo());
			insertWorkEntity.setProductId(stock.getProductId());
			insertWorkEntity.setProductCd(stock.getMProduct().getProductCd());
			insertWorkEntity.setProductNm(stock.getMProduct().getProductNm());
			insertWorkEntity.setJanCd(stock.getMProduct().getJanCd());
			// [Ver3.0] unit of measure対応 2017.12.01 王 Del
			// 入庫ラベルNo. : 入庫ラベルNo.管理しない場合は合計するから必ず一致するとは限らないが…
			insertWorkEntity.setStoreLabelNo(stock.getTStoreNo().getStoreLabelNo());
			insertWorkEntity.setLocationId(stock.getLocationId());
			insertWorkEntity.setLocationCd(stock.getMLocation().getLocationCd());
			insertWorkEntity.setLocationNm(stock.getMLocation().getLocationNm());
			insertWorkEntity.setLotId(stock.getLotId());
			insertWorkEntity.setLot(stock.getTLot().getLot());
			insertWorkEntity.setLimitDt(stock.getTLot().getLimitDt());
			insertWorkEntity.setInstNum(packingB.getPackingNum());
			insertWorkEntity.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
			insertWorkEntity.setWorkEndDt(AccessContext.getAccessTimestampOnThread());
			// 初期状態は未検品
			insertWorkEntity.setPickingFlg("0");
			insertWorkEntity.setSkipNum(0L);
			insertWorkEntity.setSpgQtyOns(WCC.ZERO);

			insertWorkEntityMap.put(key, insertWorkEntity);
		}

		// ===== 出荷ピッキングワーク登録 =====

		List<WHtShippingPicking> insertList = new ArrayList<WHtShippingPicking>(insertWorkEntityMap.values());
		wHtShippingPickingBhv.batchInsert(insertList);

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	}

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

	// [Ver3.0] unit of measure対応 2017.12.01 王 Del

	private static class WHtShippingPickingKey {

		private long productId;
		private long locationId;
		private long lotId;
		private long storeNoId;

		public WHtShippingPickingKey(long productId, long locationId, long lotId) {
			this.productId = productId;
			this.locationId = locationId;
			this.lotId = lotId;
		}

		public WHtShippingPickingKey(long productId, long locationId, long lotId, long storeNoId) {
			this.productId = productId;
			this.locationId = locationId;
			this.lotId = lotId;
			this.storeNoId = storeNoId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (locationId ^ (locationId >>> 32));
			result = prime * result + (int) (lotId ^ (lotId >>> 32));
			result = prime * result + (int) (productId ^ (productId >>> 32));
			result = prime * result + (int) (storeNoId ^ (storeNoId >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WHtShippingPickingKey other = (WHtShippingPickingKey) obj;
			if (locationId != other.locationId)
				return false;
			if (lotId != other.lotId)
				return false;
			if (productId != other.productId)
				return false;
			if (storeNoId != other.storeNoId)
				return false;
			return true;
		}
	}

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
}