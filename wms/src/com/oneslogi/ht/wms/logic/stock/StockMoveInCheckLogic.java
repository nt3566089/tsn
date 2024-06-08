package com.oneslogi.ht.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動入庫チェックロジッククラス
 */
public class StockMoveInCheckLogic extends AbstractWmsLogic {

	/* 在庫移動指示ボディ     */
	@Inject
	private StockMoveInSelectLogic selectLogic;

	/**
	/**
	 * <h2>在庫移動指示ボディデータのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に【在庫移動入庫データ取得.在庫移動指示ボディ取得】を行い、在庫移動指示ボディデータを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定後、falseを返す。
	 *
	 * 在庫移動指示ボディの在庫移動指示ステータスが全て完了でないかチェックを行う。
	 * 在庫移動指示ステータスが全て"02"(完了)の場合、全て移動完了済エラーをエラーステータスに設定後、falseを返す。
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * 【在庫移動入庫データ取得.在庫移動指示ボディ取得】
	 * ・{@link StockMoveInSelectLogic#selectTMoveInstB(MProduct, MWarehouse, BUser, boolean) 在庫移動指示ボディ取得メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID・JANCD
	 * @param mWarehouse 倉庫マスタ：倉庫ID・センタID
	 * @param bUser ユーザマスタ：カルチャID
	 * @return boolean true：エラーなし、false：データなし、又は全て移動完了
	 */
	public boolean checkTMoveInstB(MProduct mProduct, MWarehouse mWarehouse, BUser bUser) {

		List<TMoveInstB> lstTMoveInstB = selectLogic.selectTMoveInstB(mProduct, mWarehouse, bUser, false);

		if (lstTMoveInstB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		boolean blnCheckFlg = true;
		//入力したJAN/商品コードの在庫移動指示ステータスが全て完了かチェックを行う
		for (int i = 0; i < lstTMoveInstB.size(); i++) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (!(CDef.MoveInstStatus.$02.code().equals(lstTMoveInstB.get(i).getMoveInstStatus()))) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				blnCheckFlg = false;
			}
		}

		if (blnCheckFlg) {
			//該当の商品移動が全て完了しました。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STOCK_MOVE_COMPLETE);
			return false;
		}

		return true;
	}

	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
	/**
	/**
	 * <h2>在庫移動指示ボディデータのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に【在庫移動入庫データ取得.在庫移動指示ボディ取得】を行い、在庫移動指示ボディデータを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定後、falseを返す。
	 *
	 * 在庫移動指示ボディの在庫移動指示ステータスが全て完了でないかチェックを行う。
	 * 在庫移動指示ステータスが全て"02"(完了)の場合、全て移動完了済エラーをエラーステータスに設定後、falseを返す。
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * 【在庫移動入庫データ取得.在庫移動指示ボディ取得】
	 * ・{@link StockMoveInSelectLogic#selectTMoveInstB(MProduct, MWarehouse, BUser, boolean, String) 在庫移動指示ボディ取得メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID
	 * @param mWarehouse 倉庫マスタ：倉庫ID・センタID
	 * @param bUser ユーザマスタ：カルチャID
	 * @param storeLabelNo 入庫ラベルNo.
	 * @return boolean true：エラーなし；false：エラーあり
	 */
	public boolean checkTMoveInstB(MProduct mProduct, MWarehouse mWarehouse, BUser bUser,String storeLabelNo) {

		// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
		List<TMoveInstB> lstTMoveInstB = selectLogic.selectTMoveInstB(mProduct, mWarehouse, bUser, true, storeLabelNo);
		// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End

		if (lstTMoveInstB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		boolean blnCheckFlg = true;
		//入力したラベルNoの在庫移動指示ステータスが全て完了かチェックを行う
		for (int i = 0; i < lstTMoveInstB.size(); i++) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (!(CDef.MoveInstStatus.$02.code().equals(lstTMoveInstB.get(i).getMoveInstStatus()))) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				blnCheckFlg = false;
			}
		}

		if (blnCheckFlg) {
			//該当のラベルNO移動が全て完了しました。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STOCK_LABEL_MOVE_COMPLETE);
			return false;
		}

		return true;
	}

	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
}