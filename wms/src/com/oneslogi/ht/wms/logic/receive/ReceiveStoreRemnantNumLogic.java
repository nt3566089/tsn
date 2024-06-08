package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫格納在庫受払情報取得ロジッククラス
 */
public class ReceiveStoreRemnantNumLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
		/* 在庫受払     */
		@Inject
		private TStockInoutBhv tStockInoutBhv;

		/**
		 * <h2>在庫受払情報を取得する。</h2>
		 * <pre>
		 * 引数を条件に未格納の在庫受払データを取得する。
		 * </pre>
		 * @param strProductCd 商品CD
		 * @param strLimitDt 期限日
		 * @param strLot ロット
		 * @param strOnsNum 伝票NO
		 * @return List<TStockInout> 在庫受払リスト
		 */
		public List<TStockInout> selectRemnantNum(WHtReceiveStore wHtReceiveStore, String strOnsNum) {
			//在庫受払情報の取得
			TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();

			tStockInoutCB.setupSelect_TStock();
			//tStockInoutCB.setupSelect_TStoreRecordB().withTReceivePlanB().withTReceivePlanH().withMProcessType().withMStockType().withVDict(getCultureId());
			tStockInoutCB.setupSelect_TStoreRecordB().withTStoreRecordH().withMProcessType().withMStockType().withVDict(getCultureId());
			// [#6634][v3.1] センタIDの条件抜けを修正 2019.07.30 kawana Start
			tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().setProductCd_Equal(wHtReceiveStore.getProductCd());
			tStockInoutCB.query().queryTStoreRecordB().setLimitDt_Equal(wHtReceiveStore.getLimitDt());
			tStockInoutCB.query().queryTStoreRecordB().setLot_Equal(wHtReceiveStore.getLot());
			tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().queryTReceivePlanH().setCenterId_Equal(wHtReceiveStore.getCenterId());
			tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().queryTReceivePlanH().setClientId_Equal(wHtReceiveStore.getClientId());
			// [#6634][v3.1] センタIDの条件抜けを修正 2019.07.30 kawana End
			tStockInoutCB.query().queryTStoreRecordB().queryTReceivePlanB().queryTReceivePlanH().setReceiveSlipNo_Equal(strOnsNum);
			/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
			tStockInoutCB.query().queryTStoreRecordB().setStoreFlg_Equal_$0();
			/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
			List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(tStockInoutCB);

			return tStockInoutList;
		}
}
