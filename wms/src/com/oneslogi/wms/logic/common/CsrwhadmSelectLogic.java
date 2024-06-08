package com.oneslogi.wms.logic.common;

import java.util.Objects;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TCsrwhadmCB;
import com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TCsrwhadm;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 仕分拠点管理マスタ共通ロジッククラス
 */
public class CsrwhadmSelectLogic extends AbstractWmsLogic {

	private static final String TDAYESRCOMPFG_$0 = "0";


	@Inject
	private TCsrwhadmBhv tCsrwhadmBhv;

	@Inject
	private ClientCenterLogic clientCenterLogic;


	/**
	 * <h2>仕分拠点管理マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に仕分拠点管理マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @return MClient 荷主マスタ
	 */
	private TCsrwhadm getUkEntity(Long centerId, Long clientId, ErrorStatus errSts) {

		if (centerId == null) {
			return null;
		}
		if (clientId == null) {
			return null;
		}

		TCsrwhadmCB cb = tCsrwhadmBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
//		cb.query().setClientId_Equal(clientId);
		cb.query().setDelFlg_Equal(CDef.DelFlg.$0.code());
//		return tCsrwhadmBhv.selectEntityWithDeletedCheck(cb);

		TCsrwhadm tCsrwhadm = new TCsrwhadm();

		tCsrwhadm = tCsrwhadmBhv.selectEntity(cb);

		return tCsrwhadm;

	}

	private String gettingDate(Long centerId, Long clientId, ErrorStatus errSts) {
		// マスタ存在チェック＆ID取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setCenterId(centerId);
			mClientCenter.setClientId(clientId);

			// 共通関数側でエラー設定まで行わない呼び方
			mClientCenter = clientCenterLogic.getUkEntity(mClientCenter, errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}

			return mClientCenter.getSystemDt();

	}


	public void csrwhadmSelect (Long centerId, Long clientId , ErrorStatus errSts) {

		// 荷主センタマスタからシステム稼働日を取得
		String systemDt = gettingDate(centerId,clientId, errSts);
		if (getErrorManager().size() > 0) {
			return;
		}

		// 仕分テーブルを検索
		TCsrwhadm result = this.getUkEntity(centerId, clientId, null);
		if (result == null) {
			return;
		}


		// チェック処理
		if(Objects.equals(result.getSrymd(),systemDt) && (result.getSroprtcnt() > 0) && (Objects.equals(result.getTdayesrcompfg(), TDAYESRCOMPFG_$0))) {
			getErrorManager().add(errSts, WmsMessageConst.SORTING_WORK_INCOMPLETE_ERROR);
			return;
		}


		return;
	}


}
