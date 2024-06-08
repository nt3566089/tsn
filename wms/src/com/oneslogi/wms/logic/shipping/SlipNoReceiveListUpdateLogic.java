package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TCcopamBhv;
import com.oneslogi.base.dbflute.exentity.TCcopam;
import com.oneslogi.base.dbflute.exentity.customize.SqlDispatchRecordInputList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配車実績入力(一覧)削除ロジッククラス
 */
public class SlipNoReceiveListUpdateLogic extends AbstractWmsLogic {
	
	// ===== 使用テーブル =====
	@Inject
	private TCcopamBhv tCcopamBhv;

	// ===== 使用ロジッククラス =====


	/**
	 * <h2>配車実績入力(一覧)削除処理を行う。</h2>
	 * <pre>
	 * 配車実績更新(削除)。
	 * </pre>
	 * @param sqlDispatchRecordInputList 配車実績ENTITYリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(List<SqlDispatchRecordInputList> sqlDispatchRecordInputList, ErrorStatus errSts) {
		
		// 配車実績更新リストの初期化を行う
		List<TCcopam> tCcopamLstUpd = new ArrayList<TCcopam>();
		
		// 配車実績ENTITYリストの件数分、以下の繰り返し処理を行う
		for (SqlDispatchRecordInputList sqlReplenishInstConfirm : sqlDispatchRecordInputList) {

			// 配車実績ENTITYに、以下の内容を設定する
			TCcopam tCcopam = new TCcopam();
			
			tCcopam.setDelFlg_$1();
			tCcopam.setCcopamId(sqlReplenishInstConfirm.getCcopamId());
			tCcopam.setVersionNo(sqlReplenishInstConfirm.getVersionNo());
			
			tCcopamLstUpd.add(tCcopam);

		}
		
		// 配車実績ENTITYリストで配車実績を更新(batchUpdate)する
		if (!tCcopamLstUpd.isEmpty()) {
			tCcopamBhv.batchUpdate(tCcopamLstUpd);
		}
	}
	
}