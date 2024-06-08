package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ区分値マスタメンテナンス取得ロジッククラス
 */
public class CenterClassMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;

	/**
	 * <h2>センタ区分値マスタ一覧データを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ区分値マスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param  mCenterClass センタ区分値マスタ：区分値CD・区分値解説・システム種別・センタID
	 * @param  paging ページ検索の設定
	 * @param  errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MCenterClass> センタ区分値マスタリスト
	 */
	public PagingResultBean<MCenterClass> select(MCenterClass mCenterClass,PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MCenterClass> result = null;

		// ===== センタ区分値マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		// [#230] システム種別名称が表示されない 2016.11.10 kawana Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlBySystemType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [#230] システム種別名称が表示されない 2016.11.10 kawana End

		// 区分値CDの設定
		cb.query().setClassCd_PrefixSearch(mCenterClass.getClassCd());
		// 区分値解説の設定
		cb.query().setClassComment_LikeSearch(mCenterClass.getClassComment(), new LikeSearchOption().likeContain());
		// システム種別の設定
		cb.query().setSystemType_Equal(mCenterClass.getSystemType());
		// センタの設定
		cb.query().setCenterId_Equal(mCenterClass.getCenterId());
		// ソート順の設定
		cb.query().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().addOrderBy_ClassCd_Asc();

		// ===== センタ区分値マスタ検索実行 =====
		result = selectPage(mCenterClassBhv, cb, paging);

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