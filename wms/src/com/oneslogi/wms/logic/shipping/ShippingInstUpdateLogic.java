package com.oneslogi.wms.logic.shipping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstSpareCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷指示訂正処理ロジッククラス
 */
public class ShippingInstUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// [#2253]予備項目対応 2017.08.18 sampei Start
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	// [#2253]予備項目対応 2017.08.18 sampei End

	/**
	 * <h2>出荷指示を訂正する。</h2>
	 * <pre>
	 * 出荷指示ヘッダを更新する。
	 * 出荷指示ボディを削除後、登録する。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：全項目
	 * @param body 出荷指示ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(TShippingInstH header, List<TShippingInstB> body, ErrorStatus errSts) {

		// [ON推-品向-286] 排他処理を追加 2014.11.28 王忠勝 Start
		// ===== 出荷指示ヘッダ更新 =====
		tShippingInstHBhv.update(header);
		// [ON推-品向-286] 排他処理を追加 2014.11.28 王忠勝 End

		// ===== 出荷指示ボディ削除 =====
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.query().setShippingInstHId_Equal(header.getShippingInstHId());

		// [#2253]予備項目対応 2017.08.18 sampei Start
		// ===== 出荷指示予備削除 =====
		TShippingInstSpareCB spareCb= tShippingInstSpareBhv.newConditionBean();
		Set<Long> bodyIdSet = new HashSet<Long>();
		List<TShippingInstB> resultBodyList = tShippingInstBBhv.selectList(cb);
		for(TShippingInstB resultBody : resultBodyList){
			bodyIdSet.add(resultBody.getShippingInstBId());
		}
		spareCb.query().setShippingInstBId_InScope(bodyIdSet);
		tShippingInstSpareBhv.queryDelete(spareCb);
		// [#2253]予備項目対応 2017.08.18 sampei End

		tShippingInstBBhv.queryDelete(cb);

		long lineNo = 1l;
		for (TShippingInstB tShippingInstB : body) {
			//出荷指示ヘッダIDの設定
			tShippingInstB.setShippingInstHId(header.getShippingInstHId());
			// [Ver3.1][#5770] 出荷指示訂正時欠品数をnullにする 2018.12.18 matsumoto Start
			tShippingInstB.setStockOutNum(null);
			// [Ver3.1][#5770] 出荷指示訂正時欠品数をnullにする 2018.12.18 matsumoto End

			// 行Noを設定
			tShippingInstB.setLineNo(lineNo);

			lineNo++;
			// ===== 出荷指示ボディ登録 =====
			tShippingInstBBhv.insert(tShippingInstB);

			tShippingInstB.getTShippingInstSpareAsOne().setShippingInstBId(tShippingInstB.getShippingInstBId());
			tShippingInstSpareBhv.insert(tShippingInstB.getTShippingInstSpareAsOne());
			// [#2253]予備項目対応 2017.08.18 sampei End
		}

		// [C-EC-018] delete処理を削除。明細行0行の場合はJS、Resourceでエラーとする。 2015.02.04 kawana
	}
}