package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MEdiCB;
import com.oneslogi.base.dbflute.exbhv.MEdiBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EDIマスタ共通ロジッククラス
 */
public class EdiLogic extends AbstractWmsLogic {

	@Inject
	private MEdiBhv mEdiBhv;

	/**
	 * <h2>EDIマスタのリストの取得処理を行う。</h2>
	 * <pre>
	 * EDIマスタのリストを取得する。
	 * </pre>
	 * @return List<MEdi> EDIマスタリスト
	 */
	public List<MEdi> getEntityList() {

		MEdiCB cb = mEdiBhv.newMyConditionBean();
		cb.addOrderBy_PK_Asc();

		return mEdiBhv.selectList(cb);
	}
}