package com.oneslogi.ht.wms.logic.operation;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.WWorkBhv;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出退勤・休憩入力機能のupdateロジック。
 */
public class AttendanceEntryHTUpdateLogic extends AbstractWmsLogic {

	// 使用Bhv
	@Inject
	private WWorkBhv wWorkBhv;

	// 勤務実績ワークEntity
	private WWork wWork;

	/**
	 * <h2>
	 * 勤務実績ワーク情報をパラメータにセットする。
	 * </h2>
	 * @param wWork
	 */
	public void updateRegisterByWWork(WWork wWork) {
		this.wWork = wWork;

		this.updateByWWork();
	}

	/**
	 * <h2>
	 * 勤務実績ワークテーブルの更新処理。
	 * </h2>
	 * <pre>
	 * セットされたパラメータでアップデートする。
	 * 値がセットされていない場合、NullPointerExceptionをthrowする。
	 * </pre>
	 */
	private void updateByWWork() {
		if(this.wWork == null) {
			throw new NullPointerException();
		}

		wWorkBhv.update(this.wWork);
	}

}
