package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.BDictCB;
import com.oneslogi.base.dbflute.exbhv.BDictBhv;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.MHtDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CU;

/**
 * HT辞書マスタメンテナンスデータ取得ロジッククラス
 */
public class HTDictMasterSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private BDictBhv bDictBhv;

	/**
	 * <h2>HT辞書マスタ一覧データ取得。</h2>
	 * <pre>
	 * HT辞書マスタ情報を取得する。
	 * 以下のチェックを行う。
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブル結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・HT辞書マスタ
	 *
	 * 【パラメータの使用項目】
	 *  (HT辞書マスタ)
	 *  ・システム種別
	 *  ・辞書名
	 * </pre>
	 * @param mhtdict HT辞書マスタ
	 * @param paging ページ検索の設定
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<BDict> 辞書マスタデータのリスト
	 */
	public List<BDict> select(final MHtDict mhtdict, PagingData paging, ErrorStatus errSts) {

		List<BDict> result = null;
		// ===== HT辞書マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		BDictCB cb = bDictBhv.newMyConditionBean();

		cb.setupSelect_MHtDictAsOne();

		//システム種別の設定
		cb.query().setSystemType_Equal(mhtdict.getBDict().getSystemType());

		//検索処理の実行

		if (!(CU.isNullOrEmpty(mhtdict.getDictNm()))) {
			cb.orScopeQuery(new OrQuery<BDictCB>() {
				public void query(BDictCB orCB) {

					orCB.query().setDictNm_LikeSearch(mhtdict.getDictNm(), new LikeSearchOption().likeContain());
					orCB.query().queryMHtDictAsOne().setDictNm_LikeSearch(mhtdict.getDictNm(), new LikeSearchOption().likeContain());

				}
			});
		}
		// ソート順の設定
		cb.query().addOrderBy_DictNm_Asc();//辞書名

		// ==== HT辞書マスタ検索実行 =====
		result = selectPage(bDictBhv, cb, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, BaseMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}
}