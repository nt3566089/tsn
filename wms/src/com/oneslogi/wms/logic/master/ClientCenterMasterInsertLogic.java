package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主センタマスタデータの登録ロジッククラス
 */
public class ClientCenterMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientCenterBhv mClientCenterBhv;

	/**
	 * <h2>荷主センタマスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを荷主センタマスタに登録する。
	 * </pre>
	 * @param mClientCenter 荷主センタマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MClientCenter mClientCenter, ErrorStatus errSts) {
		// ===== 荷主センタマスタ登録実行 =====
		mClientCenterBhv.insert(mClientCenter);
	}

}