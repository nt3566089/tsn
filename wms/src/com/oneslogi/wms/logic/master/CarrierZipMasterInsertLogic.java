package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierZipCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierZipBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierZip;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 運送業者郵便番号マスタデータの登録処理ロジッククラス
 */
public class CarrierZipMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierZipBhv mCarrierZipBhv;

	/**
	 * <h2>運送業者郵便番号マスタ登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを運送業者郵便番号マスタに登録する。
	 * </pre>
	 * @param mZip 運送業者郵便番号マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCarrierZip mCarrierZip, ErrorStatus errSts) {

		// [#436] 郵便場号がない場合、エラーとせずにスキップする 2016.12.15 kawana Start
		if (mCarrierZip.getZipId() == null || mCarrierZip.getCommonCarrierId() == null) {
			// ※※※ 郵便番号がないデータが多数あるのでエラーとしない
			return;
		}
		// [#436] 郵便場号がない場合、エラーとせずにスキップする 2016.12.15 kawana End

		//検索条件の設定
		MCarrierZip result = null;
		MCarrierZipCB cb = mCarrierZipBhv.newMyConditionBean();

		//共通運送業者IDの設定
		cb.query().setCommonCarrierId_Equal(mCarrierZip.getCommonCarrierId());
		//郵便番号IDの設定
		cb.query().setZipId_Equal(mCarrierZip.getZipId());

		result = mCarrierZipBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== ヤマト着店マスタ登録実行 =====
			mCarrierZipBhv.insert(mCarrierZip);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

	}
}
