package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫区分マスタデータ取得ロジッククラス
 */
public class StockTypeMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MStockTypeBhv mStockTypeBhv;

	/**
	 * <h2>在庫区分マスタのデータを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから在庫区分マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD、辞書マスタビュー：辞書名
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MStockType> 在庫区分マスタデータのリスト
	 */
	public List<MStockType> select(MStockType mStockType, ErrorStatus errSts) {

		List<MStockType> result = null;

		// ===== 在庫区分マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
		cb.setupSelect_VDict(getCultureId());

		// 在庫区分CDの設定
		cb.query().setStockTypeCd_PrefixSearch(mStockType.getStockTypeCd());
		// 処理区分名称の設定
		if (mStockType.getVDict() != null){
			cb.query().queryVDict(getCultureId()).setDictNm_PrefixSearch(mStockType.getVDict().getDictNm());
		}
		//削除フラグの設定
		//cb.query().setDelFlg_Equal(mStockType.getDelFlg());
		// ソート順の設定
		cb.query().addOrderBy_StockTypeCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== 在庫区分マスタ検索実行 =====
		result = selectList(mStockTypeBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}
}