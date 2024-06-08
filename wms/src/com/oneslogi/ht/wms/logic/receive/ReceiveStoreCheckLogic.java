package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;


/**
 * 入庫格納存在チェックロジッククラス
 */
public class ReceiveStoreCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;

	// [HT1.5-CT1-024,025]伝票No、商品の存在チェックは別に行う 2016/06/26 KAI ADD START
	/**
	 * <h2>入荷予定ボディデータの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入荷予定ボディからデータを検索し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定し、falseを返す。
	 * データ存在する場合、trueを返す。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：荷主ID・センタID・入庫ＮＯ・商品CD
	 * @return boolean true:存在 false:未存在
	 */
	public boolean checkExistReceivePlan(WHtReceiveStore wHtReceiveStore) {

		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
		tReceivePlanBCB.setupSelect_TReceivePlanH();

		tReceivePlanBCB.query().queryTReceivePlanH().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tReceivePlanBCB.query().queryTReceivePlanH().setClientId_Equal(wHtReceiveStore.getClientId());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceiveSlipNo_Equal(wHtReceiveStore.getOnsNum());
		tReceivePlanBCB.query().setProductCd_Equal(wHtReceiveStore.getProductCd());

		List<TReceivePlanB> lstTReceivePlanB = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		if (lstTReceivePlanB.size() == 0) {
			// 該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		return true;
	}
	// [HT1.5-CT1-024,025]伝票No、商品の存在チェックは別に行う 2016/06/26 KAI ADD END

	/**
	 * <h2>入庫実績データの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ボディからデータを検索し、結果を返却する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：商品CD・ロット・期限日・入庫ＮＯ
	 * @return List<TStoreRecordB> 入庫実績データリスト
	 */
	public List<TStoreRecordB> checkExistStoreRecordBSelect(WHtReceiveStore wHtReceiveStore) {

		//入庫実績データ情報の取得
		TStoreRecordBCB tStoreRecordBCB = tStoreRecordBBhv.newMyConditionBean();
		tStoreRecordBCB.setupSelect_TReceivePlanB();
		tStoreRecordBCB.setupSelect_TReceivePlanB().withTReceivePlanH();
		tStoreRecordBCB.query().queryTReceivePlanB().setProductCd_Equal(wHtReceiveStore.getProductCd());
		tStoreRecordBCB.query().setLot_Equal(wHtReceiveStore.getLot());
		tStoreRecordBCB.query().setLimitDt_Equal(wHtReceiveStore.getLimitDt());
		// [#6634][v3.1] センタIDの条件抜けを修正 2019.07.30 kawana Start
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setCenterId_Equal(wHtReceiveStore.getCenterId());
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setClientId_Equal(wHtReceiveStore.getClientId());
		// [#6634][v3.1] センタIDの条件抜けを修正 2019.07.30 kawana End
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setReceiveSlipNo_Equal(wHtReceiveStore.getOnsNum());

		List<TStoreRecordB> tStoreRecordBList = tStoreRecordBBhv.selectList(tStoreRecordBCB);

		return tStoreRecordBList;
	}
}
