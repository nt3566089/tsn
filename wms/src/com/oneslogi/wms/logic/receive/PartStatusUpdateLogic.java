package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 分納元・打切りデータ予定数更新ロジッククラス
 */
public class PartStatusUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;


	/**
	 * <h2>分納元・打切りデータ予定数を更新する。</h2>
	 * <pre>
	 * 引数で受け取った入荷予定ボディリストを更新する。
	 * </pre>
	 * @param bodyList 入荷予定ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update( List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		List<TStoreRecordB> result = null;

		// ===== 入荷予定ボディ更新 =====

		for (TReceivePlanB body : bodyList) {

			// 検索条件の設定
			TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
			cb.query().setReceivePlanBId_Equal(body.getReceivePlanBId());
			// 検索実行
			result = tStoreRecordBBhv.selectList(cb);

			BigDecimal i=WCC.ZERO;
			for (TStoreRecordB tStoreRecord : result) {
				i = WCC.add(i, tStoreRecord.getStoreNum());
			}
			body.setPlanNum(i);

			// [検査-029] 排他のﾒｯｾｰｼﾞ修正 2014.12.2 yangc Start
			//入荷予定ボディの更新実行
			tReceivePlanBBhv.update(body);
			// [検査-029] 排他のﾒｯｾｰｼﾞ修正 2014.12.2 yangc End
		}

	}

}
