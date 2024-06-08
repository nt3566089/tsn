package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 郵便番号マスタ(大口事業所)マスタデータの登録処理ロジッククラス
 */
public class ZipCompanyMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZipBhv mZipBhv;

	/**
	 * <h2>郵便番号マスタ(大口事業所)マスタデータの登録処理</h2>
	 * <pre>
	 *
	 * 下記テーブルのデータを登録する。
	 * ・郵便番号マスタ(大口事業所)マスタ
	 *
	 * </pre>
	 * @param mZip 郵便番号マスタ
	 * @param errSts エラー時に登録するエラーステータス
	 */
	public void insert(MZip mZip, ErrorStatus errSts) {

		//検索条件の設定
		MZip result = null;
		MZipCB cb = mZipBhv.newMyConditionBean();

		//郵便番号の設定
		cb.query().setZipCd_Equal(mZip.getZipCd());

		result = mZipBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 郵便番号マスタ登録実行 =====
			mZipBhv.insert(mZip);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

	}
}
