package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MMatchingCB;
import com.oneslogi.base.dbflute.exbhv.MMatchingBhv;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * マッチングマスタメンテナンス取得ロジッククラス
 */
public class MatchingMasterSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MMatchingBhv mMatchingBhv;

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 *<pre>
	 * マッチングマスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param matching マッチングマスタ：マッチング種類・マッチングキーワード・変換CD
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MMatching> マッチングマスタリスト
	 */
	public List<MMatching> select(MMatching matching, PagingData paging, ErrorStatus errSts) {

		List<MMatching> result = null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MMatchingCB cb = mMatchingBhv.newMyConditionBean();

		cb.query().setMatchingType_LikeSearch(matching.getMatchingType(), new LikeSearchOption().likeContain());
		cb.query().setMatchingKeyword_LikeSearch(matching.getMatchingKeyword(), new LikeSearchOption().likeContain());
		cb.query().setTransformCd_LikeSearch(matching.getTransformCd(), new LikeSearchOption().likeContain());

		// ソート順の設定
		cb.query().addOrderBy_MatchingType_Asc();
		cb.query().addOrderBy_MatchingKeyword_Asc();
		cb.query().addOrderBy_MatchingId_Asc();

//		2016.02.19 Pan ページング ※3 Start
		// ===== 検索実行 =====
//		result = mMatchingBhv.selectList(cb);
		result = selectPage(mMatchingBhv, cb, paging);
//		2016.02.19 Pan ページング ※3 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}
}