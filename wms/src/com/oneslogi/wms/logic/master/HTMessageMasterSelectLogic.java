package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.BMessageCB;
import com.oneslogi.base.dbflute.exbhv.BMessageBhv;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.MHtMessage;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CU;

/**
 * HTメッセージマスタデータ取得ロジッククラス
 */
public class HTMessageMasterSelectLogic extends AbstractLogic {

	//===== 使用テーブル =====
	@Inject
	private BMessageBhv bMessageBhv;

	/**
	 * <h2>HTメッセージマスデータ取得。</h2>
	 * <pre>
	 * HTメッセージマスタ情報を取得する
	 * 以下のチェックを行う
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブル結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・メッセージマスタ
	 * ・HTメッセージマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (メッセージマスタ)
	 *  ・メッセージCD
	 *  ・メッセージ
	 *  ・属性
	 *  ・システム種別
	 *  ・カルチャ
	 *
	 * </pre>
	 * @param mHtMessage HTメッセージマスタ
	 * @param paging ページ検索の設定
	 * @param errSts エラーステータス
	 * @return List<BMessage> メッセージマスタリスト
	 */
	public List<BMessage> select(final MHtMessage mHtMessage, PagingData paging, ErrorStatus errSts) {
		List<BMessage> result = null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		BMessageCB cb = bMessageBhv.newMyConditionBean();

		//==== メッセージマスタデータ取得 =====
		//検索条件の設定
		cb.setupSelect_MHtMessageAsOne();
		cb.setupSelect_BCulture().withVDict(getCultureId());

		// カルチャCD
		cb.query().queryBCulture().setCultureCd_Equal(mHtMessage.getBMessage().getBCulture().getCultureCd());
		// メッセージCD
		cb.query().setMessageCd_LikeSearch(mHtMessage.getBMessage().getMessageCd(), new LikeSearchOption().likeContain());
		// 属性
		cb.query().setMessageType_Equal(mHtMessage.getBMessage().getMessageType());
		// システム種別
		cb.query().setSystemType_Equal(mHtMessage.getBMessage().getSystemType());
		// カルチャ
		cb.query().queryBCulture().setCultureId_Equal(mHtMessage.getBMessage().getBCulture().getCultureId());

		if (!(CU.isNullOrEmpty(mHtMessage.getMessageNm()))) {
			cb.orScopeQuery(new OrQuery<BMessageCB>() {
				public void query(BMessageCB orCB) {
					// メッセージ
					orCB.query().setMessageNm_LikeSearch(mHtMessage.getMessageNm(), new LikeSearchOption().likeContain());
					// メッセージ
					orCB.query().queryMHtMessageAsOne().setMessageNm_LikeSearch(mHtMessage.getMessageNm(), new LikeSearchOption().likeContain());
				}
			});
		}
		// ソート順の設定
		cb.query().addOrderBy_MessageCd_Asc();

		//===== メッセージマスタ検索実行 =====

		//		result = bMessageBhv.selectList(cb);
		result = selectPage(bMessageBhv, cb, paging);

		//===== 0件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}
}