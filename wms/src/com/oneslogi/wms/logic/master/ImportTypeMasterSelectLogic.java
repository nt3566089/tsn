package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MImportTypeCB;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取込み種別マスタメンテナンス取得ロジッククラス
 */
public class ImportTypeMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MImportTypeBhv mImportTypeBhv;

	/**
	 * <h2>取込み種別マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに取込み種別マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param importType 取込み種別マスタ：荷主ID・EDIID・アップロードテーブル名・取込種別CD・取込種別名称・納品書タイトル
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MImportType> 取込み種別マスタリスト
	 */
	public List<MImportType> select(MImportType importType, ErrorStatus errSts) {

		List<MImportType> result = null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByLineFeedCd().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByGiftStatementType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		cb.setupSelect_MEdi();

		cb.query().setClientId_Equal(importType.getClientId());
		cb.query().setEdiId_Equal(importType.getEdiId());
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
		cb.query().setUploadTableNm_Equal(importType.getUploadTableNm());
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End
		cb.query().setImportTypeCd_LikeSearch(importType.getImportTypeCd(), new LikeSearchOption().likeContain());
		cb.query().setImportTypeNm_LikeSearch(importType.getImportTypeNm(), new LikeSearchOption().likeContain());
		cb.query().setStatementTitle_LikeSearch(importType.getStatementTitle(), new LikeSearchOption().likeContain());

		// ソート順の設定
		cb.query().addOrderBy_ClientId_Asc();
		cb.query().addOrderBy_ImportTypeCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== 検索実行 =====
		result = selectList(mImportTypeBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

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