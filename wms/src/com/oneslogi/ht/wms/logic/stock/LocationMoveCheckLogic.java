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
 * ロケ変更チェックロジッククラス
 */
public class LocationMoveCheckLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private LocationMoveSelectLogic selectLogic;

	/**
	 * <h2>在庫データのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、【ロケ変更データ取得.在庫データ取得】を行い、取得件数を返す。
	 * 在庫データが取得できなかった場合、入力不備エラーをエラーステータスに設定する。
	 *
	 * 【ロケ変更データ取得.在庫データ取得】
	 * ・{@link LocationMoveSelectLogic#SelectStock(MClient, MLocation, MProduct, MWarehouse, BUser, TStoreNo) 在庫データ取得メソッド}を呼び出す。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mLocation ロケーションマスタ：センタID・ロケーションID
	 * @param mProduct 商品マスタ：商品CD・JANCD
	 * @param mWarehouse 倉庫マスタ（未使用）
	 * @param bUser ユーザマスタ：カルチャID
	 * @param tStoreNo 入庫No.：入庫ラベルNo.
	 * @return int 在庫データ件数
	 */
	public int checkStock(MClient mClient, MLocation mLocation, MProduct mProduct, MWarehouse mWarehouse, BUser bUser, TStoreNo tStoreNo) {

		// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana Start
		List<TStock> lstTStock = selectLogic.selectStock(mClient, mLocation, bUser);
		// [#197][2.1.0-CT-033] 排他チェック不正を修正 2016.11.15 kawana End

		// [#4457] ロケ変更(出庫ロケ)在庫データのないロケを入力した場合のエラーチェック修正 2018.4.19 fujiwara Start
		if (lstTStock == null || lstTStock.size() == 0) {
			return 0;
		}
		// [#4457] ロケ変更(出庫ロケ)在庫データのないロケを入力した場合のエラーチェック修正 2018.4.19 fujiwara End
		return lstTStock.size();
	}
}
