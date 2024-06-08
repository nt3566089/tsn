package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassGrpCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値グループマスタメンテナンス取得ロジッククラス
 */
public class CenterClassGrpMasterSelectLogic extends AbstractLogic {

	//===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;

	/**
	 * <h2>センタ区分値マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにセンタ区分値マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass selectCenterClassMaster(MCenterClass mCenterClass, ErrorStatus errStatus) {

		MCenterClass result = null;

		//==== センタ区分値マスタデータ取得 =====

		//検索条件の設定
		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		// 区分値ID
		cb.query().setCenterClassId_Equal(mCenterClass.getCenterClassId());

		//===== センタ区分値マスタ検索実行 =====
		result = mCenterClassBhv.selectEntity(cb);

		//===== ０件チェック =====
		if (result == null) {
			this.getErrorManager().add(new ErrorStatus(errStatus.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>センタ区分値グループマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ区分値グループマスタデータを取得する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return List<MCenterClassGrp> センタ区分値グループマスタリスト
	 */
	public List<MCenterClassGrp> selectCenterClassGrpMaster(MCenterClass mCenterClass, ErrorStatus errStatus) {
		List<MCenterClassGrp> result = null;

		//==== センタ区分値グループマスタ編集データ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MCenterClassGrpCB cb = mCenterClassGrpBhv.newMyConditionBean();
		// センタ区分値ID
		cb.query().setCenterClassId_Equal(mCenterClass.getCenterClassId());
		//ソート順の設定
		cb.query().addOrderBy_ClassGrpCd_Asc();

		//===== センタ区分値マスタ検索実行 =====
		result = mCenterClassGrpBhv.selectList(cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}
}