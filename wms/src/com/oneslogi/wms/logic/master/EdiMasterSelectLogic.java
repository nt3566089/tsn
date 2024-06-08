package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MEdiCB;
import com.oneslogi.base.dbflute.exbhv.MEdiBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * EDIマスタメンテナンス取得ロジッククラス
 */
public class EdiMasterSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MEdiBhv mEdiBhv;

	/**
	 * <h2>EDIマスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにEDIマスタデータを取得する。
	 * </pre>
	 * @param entity EDIマスタ：EDI名称
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MEdi EDIマスタ
	 */
	public MEdi getUkEntity(MEdi entity, ErrorStatus errSts) {
		MEdiCB cb = mEdiBhv.newConditionBean();
		cb.query().setEdiNm_Equal(entity.getEdiNm());
		return mEdiBhv.selectEntity(cb);
	}

	/**
	 * <h2>EDIマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにEDIマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param  mEdi EDIマスタ：EDIID
	 * @param  errSts エラー時に設定するエラーステータス
	 * @return MEdi EDIマスタ
	 */
	public MEdi selectEdiMaster(MEdi mEdi,  ErrorStatus errSts) {

		MEdi result = null;

		// ===== 一覧データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MEdiCB cb = mEdiBhv.newMyConditionBean();
		cb.query().setEdiId_Equal(mEdi.getEdiId());

		// ===== EDIマスタ検索実行 =====
		result = mEdiBhv.selectEntity(cb);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result == null) {
			this.getErrorManager().add(errSts, BaseMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	/**
	 * <h2>EDIマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにEDIマスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mEdi EDIマスタ：EDI名称
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MEdi> EDIマスタリスト
	 */
	public PagingResultBean<MEdi> select(MEdi mEdi,PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MEdi> result = null;

		// ===== EDIマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MEdiCB cb = mEdiBhv.newMyConditionBean();

		// EDICDの設定
		cb.query().setEdiNm_LikeSearch(mEdi.getEdiNm(), new LikeSearchOption().likeContain());
		// ソート順の設定
		cb.query().addOrderBy_EdiNm_Asc();

		// ===== EDIマスタ検索実行 =====
		result = selectPage(mEdiBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}
}