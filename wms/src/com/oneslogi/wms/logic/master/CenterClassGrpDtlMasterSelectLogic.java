package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値グループ明細マスタメンテナンスロジッククラス
 */
public class CenterClassGrpDtlMasterSelectLogic extends AbstractLogic {

	//===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;

	/**
	 * <h2>センタ区分値マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにセンタ区分値マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return MCenterClass センタ区分値マスタエンティティ
	 */
	public MCenterClass selectCenterClassMaster(MCenterClass mCenterClass, ErrorStatus errStatus) {

		MCenterClass result = null;

		//==== センタ区分値マスタデータ取得 =====

		//検索条件の設定
		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		// センタ区分値ID
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
	 * <h2>センタ区分値マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ区分値マスタ、センタ区分値グループ明細マスタのデータを取得する。
	 *</pre>
	 * @param mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param mCenterClassGrp センタ区分値グループマスタ：センタ区分値グループID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return List<MCenterClassDtl> センタ区分値明細マスタリスト
	 */
	public List<MCenterClassDtl> selectCenterClassGrpMaster(MCenterClass mCenterClass, final MCenterClassGrp mCenterClassGrp, ErrorStatus errStatus) {
		List<MCenterClassDtl> result = new ArrayList<MCenterClassDtl>();

		//==== 明細部データ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MCenterClassDtlCB cb = mCenterClassDtlBhv.newMyConditionBean();
		cb.setupSelect_MCenterClass();
		cb.setupSelect_VDict(getCultureId());
		// センタ区分値明細マスタ.センタ区分値ID
		cb.query().setCenterClassId_Equal(mCenterClass.getCenterClassId());
		//ソート順の設定
		cb.query().queryMCenterClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		//===== センタ区分値マスタ検索実行 =====
		result = mCenterClassDtlBhv.selectList(cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// [#4046] メッセージCD見直し 0件チェックが実装されていなかったため追加 2018/3/14 sampei Start
		//===== ０件チェック =====
		if (result == null) {
			this.getErrorManager().add(new ErrorStatus(errStatus.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [#4046] メッセージCD見直し 0件チェックが実装されていなかったため追加 2018/3/14 sampei End

		mCenterClassDtlBhv.loadMCenterClassGrpDtlList(result, new ConditionBeanSetupper<MCenterClassGrpDtlCB>() {
			public void setup(MCenterClassGrpDtlCB mCenterClassGrpDtlCB) {
				// センタ区分値グループマスタ.センタ区分値ID
				mCenterClassGrpDtlCB.query().queryMCenterClassGrp().setCenterClassGrpId_Equal(mCenterClassGrp.getCenterClassGrpId());
			}
		});

		return result;
	}
}