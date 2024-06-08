package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ採番マスタメンテナンス更新ロジッククラス
 *
 */
public class NumberingCenterMasterUpdateLogic extends AbstractWmsLogic {

	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;

	/**
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラー時に使用するエラーステータス
	 */
	public void update(MNumberingCenter mNumberingCenter, ErrorStatus errSts){

		// ===========センタ採番マスタ登録実行
		mNumberingCenterBhv.update(mNumberingCenter);
	}

	/**
	 * @param lstNumberingCenter センタ採番マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーマステータス
	 */
	public void batchUpdate(List<MNumberingCenter> lstNumberingCenter, ErrorStatus errSts){

		// ===========センタ採番マスタ登録処理
		mNumberingCenterBhv.batchUpdate(lstNumberingCenter);
	}
}
