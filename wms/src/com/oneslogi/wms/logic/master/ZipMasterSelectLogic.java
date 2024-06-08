package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 郵便番号マスタデータ取得ロジッククラス。
 */
public class ZipMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZipBhv mZipBhv;

	/**
	 * <h2>郵便番号マスタデータを取得する（ページ処理あり）。</h2>
	 * <pre>
	 * 引数をキーに郵便番号マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：郵便番号・都道府県・市区町村・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MZip> 郵便番号マスタデータのリスト
	 */
	public List<MZip> select(MZip mZip, PagingData paging, ErrorStatus errSts) {

		List<MZip> result = null;

		// ===== 郵便番号マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MZipCB cb =  mZipBhv.newMyConditionBean();
		// 郵便番号の設定
		cb.query().setZipCd_PrefixSearch(mZip.getZipCd());
		// 都道府県の設定
		cb.query().setAddress1_LikeSearch(mZip.getAddress1(), new LikeSearchOption().likeContain());
		// 市区町村の設定
		cb.query().setAddress2_LikeSearch(mZip.getAddress2(), new LikeSearchOption().likeContain());

		// 削除フラグの設定
		cb.query().setDelFlg_Equal(mZip.getDelFlg());

		// 2016.02.23 Zhang 一覧編集 ※4 Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		//フラグ1
		cb.setupSelect_BClassDtlByFlg1();
		cb.setupSelect_BClassDtlByFlg1().withVDict(getCultureId());
		//フラグ2
		cb.setupSelect_BClassDtlByFlg2();
		cb.setupSelect_BClassDtlByFlg2().withVDict(getCultureId());
		//フラグ3
		cb.setupSelect_BClassDtlByFlg3();
		cb.setupSelect_BClassDtlByFlg3().withVDict(getCultureId());
		//フラグ4
		cb.setupSelect_BClassDtlByFlg4();
		cb.setupSelect_BClassDtlByFlg4().withVDict(getCultureId());
		//更新区分
		cb.setupSelect_BClassDtlByUpdType();
		cb.setupSelect_BClassDtlByUpdType().withVDict(getCultureId());
		//変更理由
		cb.setupSelect_BClassDtlByReasonType();
		cb.setupSelect_BClassDtlByReasonType().withVDict(getCultureId());
		//フラグ５
		cb.setupSelect_BClassDtlByFlg5();
		cb.setupSelect_BClassDtlByFlg5().withVDict(getCultureId());
		//フラグ6
		cb.setupSelect_BClassDtlByFlg6();
		cb.setupSelect_BClassDtlByFlg6().withVDict(getCultureId());
		//修正コード
		cb.setupSelect_BClassDtlByUpdCd();
		cb.setupSelect_BClassDtlByUpdCd().withVDict(getCultureId());
		//大口事業所フラグ
		cb.setupSelect_BClassDtlByCompanyFlg();
		cb.setupSelect_BClassDtlByCompanyFlg().withVDict(getCultureId());
		//削除フラグ
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// 2016.02.23 Zhang 一覧編集 ※4 End

		// ソート順の設定
		cb.query().addOrderBy_ZipCd_Asc();
		cb.query().addOrderBy_Address1_Asc();
		cb.query().addOrderBy_Address2_Asc();

		// [EC-CT1-073] 検索件数制限の対応 2015.02.25 kawana Start
		// ===== 郵便番号マスタ検索実行 =====
//		result = selectList(mZipBhv, cb);
		result =selectPage(mZipBhv, cb, paging);
		// [EC-CT1-073] 検索件数制限の対応 2015.02.25 kawana End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}

	// 2016.02.23 Zhang 一覧編集 ※4 Start
	/**
	 * <h2>郵便番号マスタデータを取得する（ページ処理なし）。</h2>
	 * <pre>
	 * 引数をキーに郵便番号マスタデータを取得する。
	 * </pre>
	 * @param header 郵便番号マスタ：郵便番号
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MZip 郵便番号マスタ
	 */
	public MZip selectById(MZip header, ErrorStatus errSts) {
		//===== 編集データ取得 =====

		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MZipCB cb = mZipBhv.newMyConditionBean();

		//郵便番号CDの設定
		cb.query().setZipCd_Equal(header.getZipCd());

		//===== 検索実行 =====
		final MZip zip = mZipBhv.selectEntity(cb);

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		return zip;
	}
	// 2016.02.23 Zhang 一覧編集 ※4 Start
}