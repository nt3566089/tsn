package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.BDictCultureCB;
import com.oneslogi.base.dbflute.exbhv.BDictCultureBhv;
import com.oneslogi.base.dbflute.exentity.BDictCulture;
import com.oneslogi.base.dbflute.exentity.MHtDictCulture;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CU;

/**
 * HT辞書カルチャマスデータ取得ロジッククラス
 */
public class HTDictCultureMasterSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private BDictCultureBhv bDictCultureBhv;

	/**
	 * <h2>HT辞書カルチャマス一覧データ取得。</h2>
	 * <pre>
	 *HT辞書カルチャマス情報を取得する。
	 *
	 * 戻り値には次のテーブル結果が設定される。
	 *
	 * 【データ取得テーブル】
	 *  HT辞書カルチャマスタ
	 *  辞書カルチャマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (辞書カルチャマスタ)
	 *  ・カルチャID
	 *  ・辞書名
	 * </pre>
	 * @param mHtDictCulture HT辞書カルチャマスタ
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<BDictCulture> 辞書カルチャマスタデータのリスト
	 */
	public List<BDictCulture> select(final MHtDictCulture mHtDictCulture, PagingData paging, ErrorStatus errSts) {

		// ===== 辞書カルチャマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		BDictCultureCB cb = bDictCultureBhv.newMyConditionBean();

		// 検索条件の設定
		cb.setupSelect_MHtDictCultureAsOne();
		cb.setupSelect_BCulture().withVDict(getCultureId());

		// 辞書CDの設定
		cb.query().queryBCulture().setCultureCd_Equal(mHtDictCulture.getBDictCulture().getBCulture().getCultureCd());

		// 検索処理の実行
		if (!(CU.isNullOrEmpty(mHtDictCulture.getDictNm()))) {
			cb.orScopeQuery(new OrQuery<BDictCultureCB>() {
				public void query(BDictCultureCB orCB) {

					orCB.query().setDictNm_LikeSearch(mHtDictCulture.getDictNm(), new LikeSearchOption().likeContain());
					orCB.query().queryMHtDictCultureAsOne().setDictNm_LikeSearch(mHtDictCulture.getDictNm(), new LikeSearchOption().likeContain());

				}
			});
		}

		// ソート順の設定
		cb.query().addOrderBy_DictNm_Asc();

		// ==== 辞書カルチャマスタ検索実行 =====
		List<BDictCulture> result = selectPage(bDictCultureBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, BaseMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}
}