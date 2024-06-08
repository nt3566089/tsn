package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB;
import com.oneslogi.base.dbflute.cbean.MCarrierSlipYmtCB;
import com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassGrpCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassGrpDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterColCB;
import com.oneslogi.base.dbflute.cbean.MCenterItemCB;
import com.oneslogi.base.dbflute.cbean.MCenterScreenCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MNumberingCenterCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrpDtl;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ関連マスタ作成ロジッククラス
 */
public class CenterRelatedCopyLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;
	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;
	@Inject
	private MCenterClassGrpDtlBhv mCenterClassGrpDtlBhv;
	// [#3347][Ver3.0] TODO残対応(UoM) - 荷姿マスタ取得処理削除 2018.01.15 honma Delete
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private MParamBhv mParamBhv;
	@Inject
	private MCenterColBhv mCenterColBhv;
	@Inject
	private MCenterItemBhv mCenterItemBhv;
	@Inject
	private MCenterScreenBhv mCenterScreenBhv;
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;
	@Inject
	private MCarrierSlipYmtBhv mCarrierSlipYmtBhv;
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	/**
	 * <h2>センタ採番マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ採番マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MNumberingCenter センタ採番マスタ
	 */
	public List<MNumberingCenter> selectNumberingCenter(long centerId, boolean bolIncludeDeletedData) {

		List<MNumberingCenter> result = null;

		// ===== センタ採番マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MNumberingCenterCB cb = mNumberingCenterBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_NumberingCenterId_Asc();

		// =====センタ採番マスタ検索実行 =====
		result = selectList(mNumberingCenterBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterClass センタ区分値マスタ
	 */
	public List<MCenterClass> selectCenterClass(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterClass> result = null;

		// ===== センタ区分値マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassId_Asc();

		// =====センタ区分値マスタ検索実行 =====
		result = selectList(mCenterClassBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値明細マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値明細マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterClassDtl センタ区分値明細マスタデータ
	 */
	public List<MCenterClassDtl> selectCenterClassDtl(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterClassDtl> result = null;

		// ===== センタ区分値明細マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassDtlCB cb = mCenterClassDtlBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassDtlId_Asc();

		// =====センタ区分値明細マスタ検索実行 =====
		result = selectList(mCenterClassDtlBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値明細マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値明細マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param centerClassId
	 * @return MCenterClassDtl センタ区分値明細マスタデータ
	 */
	public List<MCenterClassDtl> selectCenterClassDtl(long centerId, long centerClassId) {

		List<MCenterClassDtl> result = null;

		// ===== センタ区分値明細マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassDtlCB cb = mCenterClassDtlBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		// センタ区分値IDの設定
		cb.query().setCenterClassId_Equal(centerClassId);
		// 削除フラグの設定
		cb.query().setDelFlg_Equal_$0();
		cb.query().queryMCenterClass().setDelFlg_Equal_$0();
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassDtlId_Asc();

		// =====センタ区分値明細マスタ検索実行 =====
		result = selectList(mCenterClassDtlBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値グループマスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値グループマスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterClassGrp センタ区分値グループマスタデータ
	 */
	public List<MCenterClassGrp> selectCenterClassGrp(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterClassGrp> result = null;

		// ===== センタ区分値グループマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassGrpCB cb = mCenterClassGrpBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassGrpId_Asc();

		// =====センタ区分値グループマスタ検索実行 =====
		result = selectList(mCenterClassGrpBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値グループマスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値グループマスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param centerClassId センタ区分値ID
	 * @return MCenterClassGrp センタ区分値グループマスタデータ
	 */
	public List<MCenterClassGrp> selectCenterClassGrp(long centerId, long centerClassId) {

		List<MCenterClassGrp> result = null;

		// ===== センタ区分値グループマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassGrpCB cb = mCenterClassGrpBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		// センタ区分値IDの設定
		cb.query().setCenterClassId_Equal(centerClassId);
		// 削除フラグの設定
		cb.query().setDelFlg_Equal_$0();
		cb.query().queryMCenterClass().setDelFlg_Equal_$0();
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassGrpId_Asc();

		// =====センタ区分値グループマスタ検索実行 =====
		result = selectList(mCenterClassGrpBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値グループ明細マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値グループ明細マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterClassGrpDtl センタ区分値グループ明細マスタデータ
	 */
	public List<MCenterClassGrpDtl> selectCenterClassGrpDtl(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterClassGrpDtl> result = null;

		// ===== センタ区分値グループ明細マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassGrpDtlCB cb = mCenterClassGrpDtlBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().queryMCenterClassGrp().queryMCenterClass().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassGrpDtlId_Asc();

		// =====センタ区分値グループ明細マスタ検索実行 =====
		result = selectList(mCenterClassGrpDtlBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ区分値グループ明細マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ区分値グループ明細マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param centerClassDtlId センタ区分値明細ID
	 * @param centerClassGrpId センタ区分値グループID
	 * @return MCenterClassGrpDtl センタ区分値グループ明細マスタデータ
	 */
	public List<MCenterClassGrpDtl> selectCenterClassGrpDtl(long centerId, long centerClassDtlId, long centerClassGrpId) {

		List<MCenterClassGrpDtl> result = null;

		// ===== センタ区分値グループ明細マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterClassGrpDtlCB cb = mCenterClassGrpDtlBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().queryMCenterClassGrp().queryMCenterClass().setCenterId_Equal(centerId);
		// センタ区分値IDの設定
		cb.query().setCenterClassDtlId_Equal(centerClassDtlId);
		// センタ区分値グループIDの設定
		cb.query().setCenterClassGrpId_Equal(centerClassGrpId);
		// 削除フラグの設定
		cb.query().setDelFlg_Equal_$0();
		// ソートキーの設定
		cb.query().addOrderBy_CenterClassGrpDtlId_Asc();

		// =====センタ区分値グループ明細マスタ検索実行 =====
		result = selectList(mCenterClassGrpDtlBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	// [#3347][Ver3.0] TODO残対応(UoM) - 荷姿マスタ取得処理削除 2018.01.15 honma Delete

	/**
	 * <h2>荷主センタマスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーに荷主センタマスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @return MClientCenter 荷主センタマスタデータ
	 */
	public List<MClientCenter> selectClientCenter(long centerId, long clientId) {

		List<MClientCenter> result = null;

		// ===== 荷主センタマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 荷主IDの設定
		cb.query().setClientId_Equal(clientId);
		// 削除フラグの設定
		cb.query().setDelFlg_Equal_$0();
		// ソートキーの設定
		cb.query().addOrderBy_ClientCenterId_Asc();

		// =====荷主センタマスタ検索実行 =====
		result = selectList(mClientCenterBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>パラメータマスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにパラメータマスタデータを取得する。
	 * </pre>
	 * @param centerId センタ荷主ID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MParam パラメータマスタデータ
	 */
	public List<MParam> selectParam(long clientCenterId, boolean bolIncludeDeletedData) {

		List<MParam> result = null;

		// ===== パラメータマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MParamCB cb = mParamBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setClientCenterId_Equal(clientCenterId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().queryMClientCenter().addOrderBy_ClientCenterId_Asc();

		// =====パラメータマスタ検索実行 =====
		result = selectList(mParamBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ列マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ列マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterCol センタ列マスタデータ
	 */
	public List<MCenterCol> selectCenterCol(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterCol> result = null;

		// ===== センタ列マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterColCB cb = mCenterColBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CenterColId_Asc();

		// =====センタ列マスタ検索実行 =====
		result = selectList(mCenterColBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ項目マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ項目マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterItem センタ項目マスタデータ
	 */
	public List<MCenterItem> selectCenterItem(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterItem> result = null;

		// ===== センタ項目マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterItemCB cb = mCenterItemBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CenterItemId_Asc();

		// =====センタ項目マスタ検索実行 =====
		result = selectList(mCenterItemBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタ画面マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにセンタ画面マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCenterScreen センタ画面マスタデータ
	 */
	public List<MCenterScreen> selectCenterScreen(long centerId, boolean bolIncludeDeletedData) {

		List<MCenterScreen> result = null;

		// ===== センタ画面マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCenterScreenCB cb = mCenterScreenBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CenterScreenId_Asc();

		// =====センタ画面マスタ検索実行 =====
		result = selectList(mCenterScreenBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>佐川送り状マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーに佐川送り状マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCarrierSlipSgw 佐川送り状マスタデータ
	 */
	public List<MCarrierSlipSgw> selectCarrierSlipSgw(long centerId, boolean bolIncludeDeletedData) {

		List<MCarrierSlipSgw> result = null;

		// ===== 佐川送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipSgwCB cb = mCarrierSlipSgwBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CarrierSlipSgwId_Asc();

		// =====佐川送り状マスタ検索実行 =====
		result = selectList(mCarrierSlipSgwBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>ヤマト送り状マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにヤマト送り状マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCarrierSlipYmt ヤマト送り状マスタデータ
	 */
	public List<MCarrierSlipYmt> selectCarrierSlipYmt(long centerId, boolean bolIncludeDeletedData) {

		List<MCarrierSlipYmt> result = null;

		// ===== ヤマト送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipYmtCB cb = mCarrierSlipYmtBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CarrierSlipYmtId_Asc();

		// =====ヤマト送り状マスタ検索実行 =====
		result = selectList(mCarrierSlipYmtBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>ゆうパック送り状マスタデータを取得する。</h2>
	 * <pre>
	 *  引数をキーにゆうパック送り状マスタデータを取得する。
	 * </pre>
	 * @param centerId センタID
	 * @param bolIncludeDeletedData 削除データを含める
	 * @return MCarrierSlipYupk ゆうパック送り状マスタデータ
	 */
	public List<MCarrierSlipYupk> selectCarrierSlipYupk(long centerId, boolean bolIncludeDeletedData) {

		List<MCarrierSlipYupk> result = null;

		// ===== ゆうパック送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipYupkCB cb = mCarrierSlipYupkBhv.newMyConditionBean();
		// センタIDの設定
		cb.query().setCenterId_Equal(centerId);
		// 削除フラグの設定
		if (!bolIncludeDeletedData) {
			cb.query().setDelFlg_Equal_$0();
		}
		// ソートキーの設定
		cb.query().addOrderBy_CarrierSlipYupkId_Asc();

		// =====ゆうパック送り状マスタ検索実行 =====
		result = selectList(mCarrierSlipYupkBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

}
