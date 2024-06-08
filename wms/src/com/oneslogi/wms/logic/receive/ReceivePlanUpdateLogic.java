package com.oneslogi.wms.logic.receive;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanRCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanSpareCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanSpareBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanSpare;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷予定更新ロジッククラス
 */
public class ReceivePlanUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
	// [#2253]予備項目対応 2017.08.18 sampei Start
	@Inject
	private TReceivePlanSpareBhv tReceivePlanSpareBhv;
	// [#2253]予備項目対応 2017.08.18 sampei End

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
	    /**
		 * 正常終了
		 */
	    protected static final int SUCCESS = 0;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}


	/**
	 * <h2>入荷予定を更新する。</h2>
	 * <pre>
	 * 引数(header)をキーに排他チェックを行う。
	 * 更新対象が存在しない場合、データなしエラーをエラーステータスに設定する。
	 * 登録明細行数が0件の場合、入荷予定ヘッダおよび入荷予定帳票を削除し、削除完了メッセージを設定する。
	 * 登録明細行数は1件以上の場合、入荷予定ヘッダの更新と入荷予定ボディ・入荷予定予備の登録を行う。
	 * 入荷予定ヘッダIDをキーに入荷予定ボディデータを削除する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：全項目
	 * @param bodyList 入荷予定ボディのリスト：全項目  + 入荷予定予備
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(TReceivePlanH header, List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		// ヘッダIDの取得
		long headerId = header.getReceivePlanHId();

		// 排他チェック
		TReceivePlanHCB planHcb = tReceivePlanHBhv.newMyConditionBean();
		planHcb.query().setReceivePlanHId_Equal(headerId);
		TReceivePlanH tReceivePlanH = tReceivePlanHBhv.selectEntityWithDeletedCheck(planHcb);
		if (tReceivePlanH == null) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return;
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		} else if (!CU.isNotNullAndEquals(tReceivePlanH.getVersionNo(), header.getVersionNo())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return;
		}


		// ===== 入荷予定ボディ削除 =====
		// 削除条件作成
		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setReceivePlanHId_Equal(headerId);

		// [#2253]予備項目対応 2017.08.18 sampei Start
		TReceivePlanSpare tReceivePlanSpare = new TReceivePlanSpare();

		// ===== 入荷予定予備削除 =====
		TReceivePlanSpareCB spareCb= tReceivePlanSpareBhv.newConditionBean();
		Set<Long> bodyIdSet = new HashSet<Long>();
		List<TReceivePlanB> resultBodyList = tReceivePlanBBhv.selectList(cb);
		for(TReceivePlanB resultBody : resultBodyList){
			bodyIdSet.add(resultBody.getReceivePlanBId());
		}
		spareCb.query().setReceivePlanBId_InScope(bodyIdSet);
		tReceivePlanSpareBhv.queryDelete(spareCb);
		// [#2253]予備項目対応 2017.08.18 sampei End

		// 削除実行
		tReceivePlanBBhv.queryDelete(cb);

		// ===== 登録明細行数確認 =====
		if (bodyList.size() == 0) {

			// ===== 入荷予定帳票の削除 =====
			TReceivePlanRCB reportCb = tReceivePlanRBhv.newMyConditionBean();
			reportCb.checkInvalidQuery();
			reportCb.query().setReceivePlanHId_Equal(headerId);
			// 削除実行
			tReceivePlanRBhv.queryDelete(reportCb);

			// ===== 入荷予定ヘッダ削除 =====
			tReceivePlanHBhv.delete(header);

			// ===== 情報メッセージをエラー管理クラスに登録 ===
			this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.RECEIVE_PLAN_DATA_DELETE_INFORMATION);

		} else {

			// ===== 入荷予定ボディ登録 =====
//			long lineNo = 1l;
			for (TReceivePlanB body : bodyList) {

				// ヘッダIDの設定
				body.setReceivePlanHId(headerId);
//				// 行Noを設定
//				body.setLineNo(lineNo);
//
//				lineNo++;

				// ボディ登録実行
				tReceivePlanBBhv.insert(body);

				// [#2253]予備項目対応 2017.08.18 sampei Start
				tReceivePlanSpare.setReceivePlanBId(body.getReceivePlanBId());
				tReceivePlanSpare.setSpareStr1(body.getTReceivePlanSpareAsOne().getSpareStr1());
				tReceivePlanSpare.setSpareStr2(body.getTReceivePlanSpareAsOne().getSpareStr2());
				tReceivePlanSpare.setSpareStr3(body.getTReceivePlanSpareAsOne().getSpareStr3());
				tReceivePlanSpare.setSpareNum1(body.getTReceivePlanSpareAsOne().getSpareNum1());
				tReceivePlanSpare.setSpareNum2(body.getTReceivePlanSpareAsOne().getSpareNum2());
				tReceivePlanSpare.setSpareNum3(body.getTReceivePlanSpareAsOne().getSpareNum3());
				tReceivePlanSpareBhv.insert(tReceivePlanSpare);
				// [#2253]予備項目対応 2017.08.18 sampei End
				tReceivePlanSpare = new TReceivePlanSpare();
			}

			// ===== 入荷予定ヘッダ更新 =====
			tReceivePlanHBhv.update(header);
		}
	}

}
