package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * パラメータマスタデータの登録ロジッククラス
 */
public class ParamMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MParamBhv mParamBhv;

	/**
	 * <h2>パラメータマスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをパラメータマスタに登録する。
	 * </pre>
	 * @param mParam パラメータマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MParam mParam, ErrorStatus errSts) {
		// ===== パラメータマスタ登録実行 =====
		mParamBhv.insert(mParam);
	}

}