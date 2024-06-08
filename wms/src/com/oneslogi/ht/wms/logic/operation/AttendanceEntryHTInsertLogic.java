package com.oneslogi.ht.wms.logic.operation;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.WWorkBhv;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出退勤・休憩入力機能のinsertロジック。
 */
public class AttendanceEntryHTInsertLogic extends AbstractWmsLogic {

	// 使用Bhv
	@Inject
	private WWorkBhv wWorkBhv;

	/**
	 * <h2>
	 * 勤務実績ワークテーブルのインサートロジック。
	 * </h2>
	 * <pre>
	 * セットされたパラメータをインサートする。
	 * 値がセットされていない場合、NullPointerExceptionをthrowする。
	 * </pre>
	 * @param wWork
	 * @return
	 */
	public WWork insertByWWork(WWork wWork) {
		if(wWork == null) {
			throw new NullPointerException();
		}
		wWorkBhv.insert(wWork);

		return wWork;
	}

}