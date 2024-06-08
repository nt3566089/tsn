package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 処理区分マスタ共通ロジッククラス。
 */
public class ProcessTypeLogic extends AbstractWmsLogic {

	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * <h2>処理区分マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に処理区分マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分ID
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getPkEntityWithDeletedCheck(MProcessType entity) {
		if (entity.getProcessTypeId() == null) {
			return null;
		}
		return mProcessTypeBhv.selectByPKValueWithDeletedCheck(entity.getProcessTypeId());
	}

	/**
	 * <h2>処理区分マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に処理区分マスタデータを取得する。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分ID
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getPkEntity(MProcessType entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>処理区分マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に処理区分マスタデータを取得する。
     * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getPkEntity(MProcessType entity, ErrorStatus errSts) {
		MProcessType resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "processTypeNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>処理区分マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に処理区分マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分CD
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getUkEntityWithDeletedCheck(MProcessType entity) {

		if (CU.isNullOrEmpty(entity.getProcessTypeCd())) {
			return null;
		}

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.query().setProcessTypeCd_Equal(entity.getProcessTypeCd());

		return mProcessTypeBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>処理区分マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に処理区分マスタデータを取得する。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分CD
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getUkEntity(MProcessType entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>処理区分マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に処理区分マスタデータを取得する。
     * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getUkEntity(MProcessType entity, ErrorStatus errSts) {
		MProcessType resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "processTypeNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>処理区分マスタを取得する（在庫区分マスタを結合する）。</h2>
	 * <pre>
	 * プライマリキーを条件に処理区分マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分ID
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getPkEntityWithStockTypeAndDeletedCheck(MProcessType entity) {
		if (entity.getProcessTypeId() == null) {
			return null;
		}

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.setupSelect_MStockType();
		cb.query().setProcessTypeId_Equal(entity.getProcessTypeId());

		return mProcessTypeBhv.selectEntityWithDeletedCheck(cb);
	}

	// [ON推-品向-953]未入力の在庫区分を設定 2015.10.01 kawana Start

	/**
	 * <h2>処理区分マスタを取得する（在庫区分マスタを結合する）。</h2>
	 * <pre>
	 * ユニークキーを条件に処理区分マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分CD
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getUkEntityWithStockTypeAndDeletedCheck(MProcessType entity) {

		if (CU.isNullOrEmpty(entity.getProcessTypeCd())) {
			return null;
		}

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_MStockType();
		cb.query().setProcessTypeCd_Equal(entity.getProcessTypeCd());

		return mProcessTypeBhv.selectEntityWithDeletedCheck(cb);
	}

	// [ON推-品向-953]未入力の在庫区分を設定 2015.10.01 kawana End

	/**
	 * <h2>登録時処理区分CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に処理区分マスタのデータを検索し、
	 * 検索結果が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mProcessType 処理区分マスタ：処理区分CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:処理区分CD重複)
	 */
	public boolean checkProcessTypeCdInsert(MProcessType mProcessType, ErrorStatus errSts) {
		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setProcessTypeCd_Equal(mProcessType.getProcessTypeCd());

		int count = mProcessTypeBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
	/**
	 * <h2>デフォルト値の処理区分マスタを取得する。</h2>
	 * <pre>
	 * 引数の入荷フラグ、出荷フラグ、在庫調整フラグを条件にデフォルトの処理区分、在庫区分を取得する。
	 * </pre>
	 * @param entity 処理区分マスタ：入荷フラグ・出荷フラグ・在庫調整フラグ
	 * @return MProcessType 処理区分マスタ(結合：在庫区分マスタ)
	 */
	public MProcessType getDefaultEntity(MProcessType entity) {

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.query().setDefaultFlg_Equal("1");
		cb.query().setReceiveFlg_Equal(entity.getReceiveFlg());
		cb.query().setShippingFlg_Equal(entity.getShippingFlg());
		cb.query().setStockAdjustFlg_Equal(entity.getStockAdjustFlg());

		return mProcessTypeBhv.selectEntity(cb);
	}

	/**
	 * <h2>処理区分マスタリストを取得する。</h2>
	 * <pre>
	 * 引数を条件に処理区分、在庫区分のリストを取得する。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分CD・辞書ID・入荷フラグ・出荷フラグ・在庫調整フラグ・
	 *                               デフォルトフラグ・在庫区分ID
	 * @return List<MProcessType> 処理区分マスタリスト(結合：在庫区分マスタ)
	 */
	public List<MProcessType> getEntityList(MProcessType entity) {

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.query().setProcessTypeCd_Equal(entity.getProcessTypeCd());
		cb.query().setDictId_Equal(entity.getDictId());
		cb.query().setReceiveFlg_Equal(entity.getReceiveFlg());
		cb.query().setShippingFlg_Equal(entity.getShippingFlg());
		cb.query().setStockAdjustFlg_Equal(entity.getStockAdjustFlg());
		cb.query().setDefaultFlg_Equal(entity.getDefaultFlg());
		cb.query().setStockTypeId_Equal(entity.getStockTypeId());

		return selectList(mProcessTypeBhv, cb);
	}
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

	// レスポンス対策 2016.02.19 kawana Start

	/**
	 * <h2>処理区分マスタを取得する。(キャッシュ使用)</h2>
	 * <pre>
	 * ユニークキーを条件に処理区分マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 処理区分マスタ：処理区分CD
	 * @return MProcessType 処理区分マスタ
	 */
	public MProcessType getUkEntityCacheable(MProcessType entity) {

		if (CU.isNullOrEmpty(entity.getProcessTypeCd())) {
			return null;
		}

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.query().setProcessTypeCd_Equal(entity.getProcessTypeCd());

		return selectEntityCacheable(mProcessTypeBhv, cb);
	}

	// レスポンス対策 2016.02.19 kawana End

	/**
	 * <h2>処理区分マスタリストを取得する。</h2>
	 * <pre>
	 * 引数をキーに処理区分マスタリストを取得する。
	 * </pre>
	 * @param receiveFlg 入荷フラグ
	 * @param shippingFlg 出荷フラグ
	 * @param moveFlg 在庫調整フラグ
	 * @return ListResultBean<MProcessType> 処理区分マスタリスト
	 */
	public ListResultBean<MProcessType> getMProcessType(String receiveFlg,String shippingFlg,String moveFlg) {

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.setupSelect_VDict(getCultureId());
		cb.setupSelect_MStockType();

		cb.specify().columnProcessTypeCd();
		cb.specify().columnDefaultFlg();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().specifyMStockType().columnStockTypeCd();

		final String strReceiveFlg = receiveFlg;
		final String strShippingFlg = shippingFlg;
		final String strStockAdjustFlg = moveFlg;

		cb.orScopeQuery(new OrQuery<MProcessTypeCB>() {
			@Override
			public void query(MProcessTypeCB orCB) {
				if (strReceiveFlg.equals("1")) {
					orCB.query().setReceiveFlg_Equal(strReceiveFlg);
				}
				if (strShippingFlg.equals("1")) {
					orCB.query().setShippingFlg_Equal(strShippingFlg);
				}
				if (strStockAdjustFlg.equals("1")) {
					orCB.query().setStockAdjustFlg_Equal(strStockAdjustFlg);
				}
			}
		});

		cb.query().addOrderBy_ProcessTypeCd_Asc();

		ListResultBean<MProcessType> mProcessType = mProcessTypeBhv.selectList(cb);

		return mProcessType;
	}
}
