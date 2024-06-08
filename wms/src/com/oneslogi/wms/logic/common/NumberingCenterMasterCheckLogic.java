package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ採番マスタチェック共通ロジッククラス
 */
public class NumberingCenterMasterCheckLogic extends AbstractWmsLogic {

	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	/**
	 * <h2>新規登録時センタ採番マスタに存在チェック</h2>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkNumberingCenterMasterInsert(MNumberingCenter mNumberingCenter, ErrorStatus errSts){

		numberingCenterLogic.checkNumberingCenterInsert(mNumberingCenter, errSts);
	}

	/**
	 * <h2>更新する時センタ採番マスタに存在チェック</h2>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkNumberingCenterMasterUpdate(MNumberingCenter mNumberingCenter, ErrorStatus errSts){

		numberingCenterLogic.checkNumberingCenterUpdate(mNumberingCenter, errSts);
	}

	// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe Start
	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
	public void checkNumberingCenterMasterSize(MNumberingCenter mNumberingCenter, ErrorStatus errSts, int rowNumber){
		numberingCenterLogic.checkNumberingCenterSize(mNumberingCenter, errSts, rowNumber);
	}
	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End
	// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe End

	// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add Start
	/**
	 * <h2>配送コースマスタ全件取得</h2>
	 * @param mNumberingCenter センタ採番マスタ
	 * @return 検索結果の配送コースマスタリスト
	 */
	public List<MDeliveryCourse> selectDeliveryCourseList(MNumberingCenter mNumberingCenter){
		return numberingCenterLogic.selectDeliveryCourseListAll(mNumberingCenter);
	}

	/**
	 * <h2>センタ採番マスタの削除チェック</h2>
	 * <pre>
	 * 配送コースマスタの追跡番号採番キーとして設定されている場合、削除不可<br>
	 * <pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param deliveryCourseList 配送コースマスタリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkNumberingCenterMasterDelete(MNumberingCenter mNumberingCenter, List<MDeliveryCourse> deliveryCourseList, ErrorStatus errSts){
		numberingCenterLogic.checkNumberingCenterMasterDelete(mNumberingCenter, deliveryCourseList, errSts);
	}
	// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add End
}
