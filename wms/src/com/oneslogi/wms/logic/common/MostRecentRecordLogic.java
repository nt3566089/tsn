package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.apache.xpath.operations.String;

import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterLast;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 引当制御マスタ共通ロジッククラス
 */
public class MostRecentRecordLogic extends AbstractWmsLogic {

	@Inject
	private MMfpickctlBhv mMfpickctlBhv;


	//
	/**
	 * <h2>ユニークキーを条件に銘柄マスタを結合したエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mMfpickctl 引当制御マスタ・引当制御ID・銘柄CD
	 * @param mProduct 銘柄マスタ：銘柄CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MMfpickctl 引当制御マスタ
	 */
	public SqlAllocateControlMasterLast getMostRecentRecord(Long clientId,String itemCd,String pickfrdate) {
		//MMfpickctl resultEntity = null;


			if (clientId == null) {
				return null;
			}
//			if (CU.isNullOrEmpty(productCd)) {
//				return null;
//			}
//			if (CU.isNullOrEmpty(pickfrdate)) {
//				return null;
//			}
//			// 外出しSQLの定義
//			String path = MMfpickctlBhv.PATH_selectSqlAllocateControlMasterLast;
//
//			// 引数設定
//			SqlAllocateControlMasterLastPmb pmb = new SqlAllocateControlMasterLastPmb();
//
//			pmb.setClientId(clientId);
//			pmb.setProductCd(productCd);
//			pmb.setPickfrdate(pickfrdate);
//
//			// 1 件のみ取得
//			pmb.fetchFirst(1);

//			// 検索実行
//			Class<SqlAllocateControlMasterLast> entityType = SqlAllocateControlMasterLast.class;
//
//
//			//
//			SqlAllocateControlMasterLast sqlAllocateControlMasterListLast = mMfpickctlBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);
//			if(sqlAllocateControlMasterListLast == null) {
//				return null;
//			}
//
//			return sqlAllocateControlMasterListLast;
			return null;
	}




}
