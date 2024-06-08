package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanSpareCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanSpareBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TReceivePlanSpare;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *入荷予定削除ロジッククラス
 */
public class ReceivePlanDeleteLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana Start
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana End

	// [#2253]予備項目対応 2017.08.18 sampei End
	@Inject
	private TReceivePlanSpareBhv tReceivePlanSpareBhv;
	// [#2253]予備項目対応 2017.08.18 sampei End

	/**
	 * <h2>入荷予定を削除する（論理削除）。</h2>
	 * <pre>
	 * 引数をキーに入荷予定ヘッダと入荷予定ボディと入荷予定予備の更新処理を行う。
	 * 該当データを検索し、入荷予定帳票の更新処理を行う。
	 * ※上記の更新は論理削除となる。
	 * </pre>
	 * @param header 入荷予定ヘッダ：入荷予定ヘッダID・バージョンNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(TReceivePlanH header, ErrorStatus errSts) {
		// ===== 入荷予定ヘッダ更新 =====
		TReceivePlanH tReceivePlanH = tReceivePlanHBhv.newMyEntity();

		// 入荷予定ヘッダの更新対象設定
		tReceivePlanH.setReceivePlanHId(header.getReceivePlanHId());
		tReceivePlanH.setVersionNo(header.getVersionNo());

		// 入荷予定ヘッダの更新データ編集
		tReceivePlanH.setDelFlg_$1();
		// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷予定ヘッダの入荷ステータス設定を追加 2014.11.28 Start
		tReceivePlanH.setReceiveStatus_$90();
		// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷予定ヘッダの入荷ステータス設定を追加 2014.11.28 End

		// 入荷予定ヘッダの更新実行
		tReceivePlanHBhv.update(tReceivePlanH);


		// [#2253]予備項目対応 2017.08.18 sampei Start
		TReceivePlanSpareCB planSpareCb = tReceivePlanSpareBhv.newMyConditionBean();
		TReceivePlanSpare planSpare = new TReceivePlanSpare();
		// [#2253]予備項目対応 2017.08.18 sampei End

		// ===== 入荷予定ボディ更新 =====
		// 入荷予定ボディデータ取得
		TReceivePlanBCB bCb = tReceivePlanBBhv.newMyConditionBean();
		bCb.query().setReceivePlanHId_Equal(header.getReceivePlanHId());
		List<TReceivePlanB> bodyList = new ArrayList<TReceivePlanB>();
		bodyList = tReceivePlanBBhv.selectList(bCb);
		if (bodyList.size() > 0) {
			// 入荷予定ボディの更新データ編集 入荷予定ボディリストのデータ件数分繰返
			for (TReceivePlanB body : bodyList) {
				body.setDelFlg_$1();
				// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷予定ボディの入荷ステータス設定を追加 2014.11.28 Start
				body.setReceiveStatus_$90();
				// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷予定ボディの入荷ステータス設定を追加 2014.11.28 End

				// [#2253]予備項目対応 2017.08.18 sampei Start
				// 入荷予定予備の削除
				planSpareCb.query().setReceivePlanBId_Equal(body.getReceivePlanBId());
				planSpare.setDelFlg_$1();
				tReceivePlanSpareBhv.queryUpdate(planSpare, planSpareCb);
				// [#2253]予備項目対応 2017.08.18 sampei End
			}

			// 入荷予定ボディの更新実行
			tReceivePlanBBhv.batchUpdate(bodyList);

		}

		// ===== 入荷予定帳票更新 =====
		// 入荷予定帳票データ取得
		//		TReceivePlanRCB rCb = tReceivePlanRBhv.newMyConditionBean();
		//		rCb.query().setReceivePlanHId_Equal(header.getReceivePlanHId());
		//		TReceivePlanR tReceivePlanR = tReceivePlanRBhv.selectEntity(rCb);
		//		if (tReceivePlanR != null) {
		//			// 入荷予定帳票の更新データ編集 エンティティ編集
		//			tReceivePlanR.setDelFlg_$1();
		//
		//			// 入荷予定帳票の更新実行
		//			tReceivePlanRBhv.update(tReceivePlanR);
		//		}

		// ===== 入荷予定帳票更新 =====
		// 入荷予定帳票データ取得
		TReceivePlanR tReceivePlanR = tReceivePlanRBhv.newMyEntity();

		// 入荷予定帳票の更新対象設定
		tReceivePlanR.setReceivePlanHId(header.getTReceivePlanRAsOne().getReceivePlanHId());
		tReceivePlanR.setVersionNo(header.getTReceivePlanRAsOne().getVersionNo());

		// 入荷予定帳票の更新データ編集
		tReceivePlanR.setDelFlg_$1();

		// 入荷予定帳票の更新実行
		tReceivePlanRBhv.update(tReceivePlanR);

	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana Start
	/**
	 * <h2>入荷予定を削除する(物理削除)。</h2>
	 * <pre>
	 * 引数をキーに入庫実績ボディ、入庫実績ヘッダ、入荷予定ボディ、入荷予定予備、入荷予定帳票、入荷予定ヘッダ
	 * のデータを物理削除する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deletePhysical(TReceivePlanH header, ErrorStatus errSts) {

		// 入庫実績ボディの削除
		TStoreRecordBCB storeBodyCb = tStoreRecordBBhv.newMyConditionBean();
		storeBodyCb.checkInvalidQuery();
		storeBodyCb.query().queryTReceivePlanB().setReceivePlanHId_Equal(header.getReceivePlanHId());
		tStoreRecordBBhv.queryDelete(storeBodyCb);

		// 入庫実績ヘッダの削除
		TStoreRecordHCB storeHeaderCb = tStoreRecordHBhv.newMyConditionBean();
		storeHeaderCb.checkInvalidQuery();
		storeHeaderCb.query().setReceivePlanHId_Equal(header.getReceivePlanHId());
		tStoreRecordHBhv.queryDelete(storeHeaderCb);

		// 入荷予定ボディの削除
		TReceivePlanBCB planBodyCb = tReceivePlanBBhv.newMyConditionBean();
		planBodyCb.checkInvalidQuery();
		planBodyCb.query().setReceivePlanHId_Equal(header.getReceivePlanHId());

		// [#2253]予備項目対応 2017.08.18 sampei Start
		// 入荷予定予備の削除
		TReceivePlanSpareCB planSpareCb = tReceivePlanSpareBhv.newMyConditionBean();

		List<TReceivePlanB> resultBodyList = tReceivePlanBBhv.selectList(planBodyCb);

		for(TReceivePlanB planBodyForSpare : resultBodyList){
			planSpareCb.checkInvalidQuery();
			planSpareCb.query().setReceivePlanBId_Equal(planBodyForSpare.getReceivePlanBId());
			tReceivePlanSpareBhv.queryDelete(planSpareCb);
			planSpareCb = tReceivePlanSpareBhv.newMyConditionBean();
		}
		// [#2253]予備項目対応 2017.08.18 sampei End

		tReceivePlanBBhv.queryDelete(planBodyCb);

		// 入荷予定帳票の削除
		tReceivePlanRBhv.delete(header.getTReceivePlanRAsOne());

		// 入荷予定ヘッダの削除
		tReceivePlanHBhv.delete(header);
	}
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana End
}
