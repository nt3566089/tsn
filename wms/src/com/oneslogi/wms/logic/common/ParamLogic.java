package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * パラメータマスタ共通ロジッククラス。
 */
public class ParamLogic extends AbstractWmsLogic {

	@Inject
	private MParamBhv bhv;

	// レスポンス対策 2016.01.22 kawana Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// レスポンス対策 2016.01.22 kawana End

	/**
	 * <h2>パラメータマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にパラメータマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @return MParam パラメータマスタ
	 */
	public MParam getUkEntityWithDeletedCheck(MClientCenter entity) {
		if (entity.getClientId() == null) {
			return null;
		}
		if (entity.getCenterId() == null) {
			return null;
		}

		MParamCB cb = bhv.newMyConditionBean();
		cb.query().queryMClientCenter().setClientId_Equal(entity.getClientId());
		cb.query().queryMClientCenter().setCenterId_Equal(entity.getCenterId());

		return bhv.selectEntityWithDeletedCheck(cb);
	}

	// レスポンス対策 2016.01.22 kawana Start
	/**
	 * <h2>ユニークキーを条件に荷主センタマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに荷主センタマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @return MParam パラメータマスタ
	 */
	public MParam getUkEntityUseCash(MClientCenter entity) {

		MClientCenter clientCenter = clientCenterLogic.getUkEntityCacheable(entity);
		if (clientCenter == null) {
			return null;
		}

		return clientCenter.getMParamAsOne();
	}
	// レスポンス対策 2016.01.22 kawana End

	// [ON推-UT210-014] パラメータマスタ情報を荷主ID、センタIDを元に1件取得 yokosuka 2016.07.13 [S]
	// ※HTの処理で各機能毎に作成しているが置き換えは範囲が広い為未実施(実施したらコメント削除)
	/**
	 * <h2>パラメータマスタの情報取得</h2>
	 * <pre>
	 * </pre>
	 * @param clientId 荷主情報
	 * @param centerId センタ情報
	 * @return MParam:パラメータマスタ
	 */
	public MParam getMParam(Long clientId, Long centerId) {

		//パラメータ情報の取得
		MParamCB mParamCB = bhv.newMyConditionBean();
		mParamCB.setupSelect_MClientCenter();
		mParamCB.query().queryMClientCenter().setClientId_Equal(clientId);
		mParamCB.query().queryMClientCenter().setCenterId_Equal(centerId);
		List<MParam> lstMParam = bhv.selectList(mParamCB);

		if (lstMParam.size() > 0) {
			return lstMParam.get(0);
		} else {
			// 0: 管理しない
			return null;
		}
	}
	// [ON推-UT210-014] パラメータマスタ情報を荷主ID、センタIDを元に1件取得 yokosuka 2016.07.13 [E]

}
