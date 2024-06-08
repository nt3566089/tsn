package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MEdiCB;
import com.oneslogi.base.dbflute.exbhv.MEdiBhv;
import com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dbflute.exentity.MEdiColumn;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * EDI項目マスタメンテナンス登録ロジッククラス
 */
public class EdiColumnMasterInsertLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MEdiBhv mEdiBhv;
	@Inject
	private MEdiColumnBhv mEdiColumnBhv;

	/**
	 * <h2>EDI項目マスタを登録する。</h2>
	 * <pre>
	 *
	 * EDIマスタとEDI項目マスタのデータを登録する。
	 * EDI名称が存在する場合、
	 * 存在済みエラーをエラーステータスに設定する。
	 * </pre>
	 * @param mEdi EDIマスタ：全項目
	 * @param mEdiColumnList EDI項目マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MEdi mEdi, List<MEdiColumn> mEdiColumnList, ErrorStatus errSts) {

		//検索条件の設定
		MEdi result = null;
		MEdiCB cb = mEdiBhv.newMyConditionBean();

		//EDI名称の設定
		cb.query().setEdiNm_Equal(mEdi.getEdiNm());

		result = mEdiBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== EDI列マスタ登録実行 =====
			mEdiBhv.insert(mEdi);

		} else {
			//存在した場合
			this.getErrorManager().add(errSts, BaseMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}

		for(MEdiColumn mEdiColumnEnt : mEdiColumnList){

			mEdiColumnEnt.setEdiId(mEdi.getEdiId());
			// ===== EDI列マスタ登録実行 =====
			mEdiColumnBhv.insert(mEdiColumnEnt);

		}
	}
}
