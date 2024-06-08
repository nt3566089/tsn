package com.oneslogi.ht.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動出庫チェックロジッククラス
 */
public class StockMoveOutCheckLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private StockMoveOutSelectLogic selectLogic;

	/**
	 * <h2>在庫データのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、【在庫移動出庫データ取得.在庫データ取得】を行い、取得件数を返す。
	 * 在庫データが取得できなかった場合、入力不備エラーをエラーステータスに設定する。
	 *
	 * 【在庫移動出庫データ取得.在庫データ取得】
	 * ・{@link StockMoveOutSelectLogic#SelectStock(MClient, MLocation, MProduct, MWarehouse, BUser, TStoreNo) 在庫データ取得メソッド}を呼び出す。
	 * </pre>
	 *
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mLocation  ロケーションマスタ：センタID・ロケーションCD
	 * @param mProduct 商品マスタ：JANCD（商品CD）
	 * @param mWarehouse 倉庫マスタ
	 * @param bUser ユーザマスタ：カルチャID
	 * @param tStoreNo 入庫No.：入庫ラベルNo.
	 * @return int 在庫データの件数
	 */
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
	//public int checkStock(MClient mClient, MLocation mLocation, MProduct mProduct, MWarehouse mWarehouse, BUser bUser) {
	public int checkStock(MClient mClient, MLocation mLocation, MProduct mProduct, MWarehouse mWarehouse, BUser bUser, TStoreNo tStoreNo) {
	/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//List<TStock> lstTStock = selectLogic.SelectStock(mClient, mLocation, mProduct, mWarehouse, bUser);
		List<TStock> lstTStock = selectLogic.SelectStock(mClient, mLocation, mProduct, mWarehouse, bUser, tStoreNo);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		// [#4457] 移動出庫(ロケ)在庫データが存在しないロケを指定した場合のエラーチェック修正 2018.4.19 fujiwara Start
		if (lstTStock == null || lstTStock.size() == 0) {
			return 0;
		}
		// [#4457] 移動出庫(ロケ)在庫データが存在しないロケを指定した場合のエラーチェック修正 2018.4.19 fujiwara End

		return lstTStock.size();
	}
}