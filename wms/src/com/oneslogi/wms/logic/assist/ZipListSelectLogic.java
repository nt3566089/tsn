package com.oneslogi.wms.logic.assist;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 郵便番号マスタデータ取得ロジッククラス
 */
public class ZipListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MZipBhv mZipBhv;

	/**
	 * <h2>郵便番号マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから郵便番号マスタデータを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 郵便番号マスタ：郵便番号・都道府県・市区町村
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MZip> 郵便番号マスタリスト
	 */
	public PagingResultBean<MZip> select(MZip header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MZip> result = null;

		//===== 郵便番号マスタデータ取得 =====

		//検索条件の設定
		MZipCB cb = mZipBhv.newMyConditionBean();

		//大口事業所フラグの設定
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByCompanyFlg();
		cb.setupSelect_BClassDtlByCompanyFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe ENd

		//郵便番号の設定
		cb.query().setZipCd_PrefixSearch(header.getZipCd());

		//都道府県の設定
		cb.query().setAddress1_LikeSearch(header.getAddress1(), new LikeSearchOption().likeContain());

		//市区町村の設定
		cb.query().setAddress2_LikeSearch(header.getAddress2(), new LikeSearchOption().likeContain());

		//ソート順の設定
		cb.query().addOrderBy_ZipCd_Asc();//郵便番号
		cb.query().addOrderBy_Address1_Asc();//都道府県
		cb.query().addOrderBy_Address2_Asc();//市区町村

		//検索処理
		result = selectPage(mZipBhv, cb, paging);

		//==== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}