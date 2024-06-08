package com.oneslogi.wms.logic.returns;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TTrbaditemcaseCB;
import com.oneslogi.base.dbflute.exbhv.TTrbaditemcaseBhv;
import com.oneslogi.base.dbflute.exentity.TTrbaditemcase;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 不適品ラベル出力データ更新ロジッククラス
 */
public class NonconformityLabelPrintUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrbaditemcaseBhv tTrbaditemcaseBhv;

	/**
	 * <h2>不適品ラベル情報一覧データのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数の不適品ラベル情報のコントロールNo.を更新する
	 * </pre>
	 * @param dataList 不適品ラベル情報一覧データ
	 * @param controlNo セットするコントロールNo.
	 */
	public void setControlNo(List<TTrbaditemcase> dataList, Long controlNo) {
		List<TTrbaditemcase> updateList = new ArrayList<TTrbaditemcase>();

		for (TTrbaditemcase data : dataList) {
			TTrbaditemcase updateEntity = tTrbaditemcaseBhv.newMyEntity();
			updateEntity.setTrbaditemcaseId(data.getTrbaditemcaseId());
			updateEntity.setVersionNo(data.getVersionNo());
			updateEntity.setControlNo(controlNo);
			updateList.add(updateEntity);
		}

		tTrbaditemcaseBhv.batchUpdate(updateList);
	}

	/**
	 * <h2>不適品ラベル情報のコントロールNo.をクリアする。</h2>
	 * <pre>
	 * 引数のコントロールNo.から不適品ラベル情報の検索を行い
	 * 対象データを更新する
	 * </pre>
	 * @param controlNo クリア対象のコントロールNo.
	 * @param systemDt システム管理日付
	 */
	public void clearControlNo(Long controlNo, String systemDt) {
		TTrbaditemcaseCB clearCB = tTrbaditemcaseBhv.newMyConditionBean();
		clearCB.query().setControlNo_Equal(controlNo);

		List<TTrbaditemcase> selectList = tTrbaditemcaseBhv.selectList(clearCB);
		for (TTrbaditemcase data : selectList) {
			TTrbaditemcase clearEntity = tTrbaditemcaseBhv.newMyEntity();
			clearEntity.setControlNo(null);
			clearEntity.setDtExtdata1(systemDt);
			// 再印刷区分が'0'(未発行) の場合
			if (data.getReprintedflg().equals("0")) {
				clearEntity.setReprintedflg("1");
				clearEntity.setVaExtdata1("0");
			} else {
				clearEntity.setVaExtdata1("1");
			}
			tTrbaditemcaseBhv.queryUpdate(clearEntity, clearCB);
		}
	}
}
