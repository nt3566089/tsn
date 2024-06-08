package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TShippingInstSpare;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷指示登録処理ロジッククラス
 */
public class ShippingInstInsertLogic extends AbstractWmsLogic {

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
	 * <h2>出荷指示を登録する。</h2>
	 * <pre>
	 * 出荷指示ヘッダと出荷指示ボディ・出荷指示予備のデータを登録する。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：全項目
	 * @param body 出荷指示ボディリスト： +  出荷指示予備
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(TShippingInstH header, List<TShippingInstB> body, ErrorStatus errSts) {

		// ===== 出荷指示ヘッダの登録実行 =====
		tShippingInstHBhv.insert(header);
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start
		long lineNo = 1l;
		for (int i=0;i<body.size();i++){
			//出荷指示ヘッダIDの設定
			body.get(i).setShippingInstHId(header.getShippingInstHId());
			body.get(i).setControlNo(header.getControlNo());
			// 行Noを設定
			body.get(i).setLineNo(lineNo);
			lineNo++;
		}
//		for (TShippingInstB tShippingInstB : body) {
//			//出荷指示ヘッダIDの設定
//			tShippingInstB.setShippingInstHId(header.getShippingInstHId());
//
//			// 行Noを設定
//			tShippingInstB.setLineNo(lineNo);
//
//			lineNo++;
//			// ===== 出荷指示ヘッダの登録実行 =====
//			tShippingInstBBhv.insert(tShippingInstB);
//		}
		// ===== 出荷指示ヘッダの登録実行 =====
		tShippingInstBBhv.batchInsert(body);
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start

		// [#2253]予備項目対応 2017.08.18 sampei Start
		TShippingInstSpare tShippingInstSpare = new TShippingInstSpare();
		List<TShippingInstSpare> lstTShippingInstSpare = new ArrayList<TShippingInstSpare>();

		for (int i=0;i<body.size();i++){
			TShippingInstBCB cb = new TShippingInstBBhv().newConditionBean();
			cb.query().setShippingInstHId_Equal(body.get(i).getShippingInstHId());
			cb.query().setLineNo_Equal(body.get(i).getLineNo());
			TShippingInstB resultBody = tShippingInstBBhv.selectEntity(cb);

			tShippingInstSpare.setShippingInstBId(resultBody.getShippingInstBId());

			if(body.get(i).getTShippingInstSpareAsOne() != null){
				tShippingInstSpare.setSpareStr1(body.get(i).getTShippingInstSpareAsOne().getSpareStr1());
				tShippingInstSpare.setSpareStr2(body.get(i).getTShippingInstSpareAsOne().getSpareStr2());
				tShippingInstSpare.setSpareStr3(body.get(i).getTShippingInstSpareAsOne().getSpareStr3());
				if(body.get(i).getTShippingInstSpareAsOne().getSpareNum1() !=  null){
					tShippingInstSpare.setSpareNum1(body.get(i).getTShippingInstSpareAsOne().getSpareNum1());
				}

				if(body.get(i).getTShippingInstSpareAsOne().getSpareNum2() !=  null){
					tShippingInstSpare.setSpareNum2(body.get(i).getTShippingInstSpareAsOne().getSpareNum2());
				}

				if(body.get(i).getTShippingInstSpareAsOne().getSpareNum3() !=  null){
					tShippingInstSpare.setSpareNum3(body.get(i).getTShippingInstSpareAsOne().getSpareNum3());
				}
			}
			lstTShippingInstSpare.add(tShippingInstSpare);
			tShippingInstSpare = new TShippingInstSpare();
		}
		tShippingInstSpareBhv.batchInsert(lstTShippingInstSpare);

		// [#2253]予備項目対応 2017.08.18 sampei End


	}
}