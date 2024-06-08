package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.dto.customize.SqlAllocateControlMasterEditDto;
import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlAllocateControlMasterEditNearestFuturePmb;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterEditNearestFuture;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 引当制御マスタ共通ロジッククラス
 */
public class NearestFutureRecordLogic extends AbstractWmsLogic {

	@Inject
	private MMfpickctlBhv mMfpickctlBhv;


	//
	/**
	 * <h2>ユニークキーを条件に銘柄マスタを結合したエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mMfpickctl 引当制御マスタ・銘柄CD・適用開始日
	 * @param mProduct 銘柄マスタ：銘柄CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MMfpickctl 引当制御マスタ
	 */
	public SqlAllocateControlMasterEditNearestFuture getNearestFutureRecord(SqlAllocateControlMasterEditDto dto) {


			if (dto.getClientId() == null) {
				return null;
			}
			if (CU.isNullOrEmpty(dto.getProductCd())) {
				return null;
			}
			if (CU.isNullOrEmpty(dto.getPickfrdate())) {
				return null;
			}
			// 外出しSQLの定義
			String path = MMfpickctlBhv.PATH_selectSqlAllocateControlMasterEditNearestFuture;

			// 引数設定
			SqlAllocateControlMasterEditNearestFuturePmb pmb = new SqlAllocateControlMasterEditNearestFuturePmb();

			pmb.setClientId(dto.getClientId());
			pmb.setProductCd(dto.getProductCd());
			pmb.setPickfrdate(dto.getPickfrdate());
			pmb.fetchFirst(1);// 1 件のみ取得


			// 検索実行
			Class<SqlAllocateControlMasterEditNearestFuture> entityType = SqlAllocateControlMasterEditNearestFuture.class;
			SqlAllocateControlMasterEditNearestFuture SqlAllocateControlMasterEditPickFrDate = mMfpickctlBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);
			if(SqlAllocateControlMasterEditPickFrDate == null) {
				return null;
			}

			return SqlAllocateControlMasterEditPickFrDate ;
	}
}
