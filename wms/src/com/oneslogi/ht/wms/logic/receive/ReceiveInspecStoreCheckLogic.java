package com.oneslogi.ht.wms.logic.receive;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.receive.ReceiveNumCheckLogic;

/**
 * 入荷検品・格納チェックロジッククラス
 */
public class ReceiveInspecStoreCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;
	@Inject
	private TStoreNoBhv tStoreNoBhv;
	@Inject
	private ReceiveNumCheckLogic numCheckLogic;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;

	/**
	 * <h2>入荷予定ヘッダのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入荷予定ヘッダのデータを検索し、１件目のデータを返却する。
	 * 検索対象が見つからない場合、メッセージフラグの値により下記のエラーをエラーステータスに設定する。
	 * ・メッセージフラグが"1"の場合、削除済エラー
	 * ・上記以外の場合、０件エラー
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・WMS入荷伝票No.
	 * @param msgFlg メッセージフラグ
	 * @return TReceivePlanH 入荷予定ヘッダ
	 */
	public TReceivePlanH checkReceiveSlipNo(TReceivePlanH tReceivePlanH, String msgFlg) {

		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();

		tReceivePlanHCB.query().setCenterId_Equal(tReceivePlanH.getCenterId());
		tReceivePlanHCB.query().setClientId_Equal(tReceivePlanH.getClientId());
		tReceivePlanHCB.query().setReceiveSlipNo_Equal(tReceivePlanH.getReceiveSlipNo());

		List<TReceivePlanH> lstTReceivePlanH = tReceivePlanHBhv.selectList(tReceivePlanHCB);

		if (lstTReceivePlanH.size() == 0) {
			// 再開時の削除チェックで使い回したいためメッセージフラグでメッセージ変更
			if (msgFlg.equals("1")){
				// 対象の伝票が削除されました。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SLIP_NO_DELETED);
			} else {
				// 該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			}
			return null;
		}

		return lstTReceivePlanH.get(0);
	}

	/**
	 * <h2>JAN/商品コードの予定数チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に【入荷検品・格納関連データ取得.予定数合計を取得】を実行し、
	 * 入荷予定ボディの予定数合計を取得する。
	 * 予定数合計が０の場合、入荷予定数０は不可のエラーをエラーステータスに設定する。
	 *
	 * 【入荷検品・格納関連データ取得.予定数合計を取得】
	 * ・{@link ReceiveInspecStoreSelectLogic#selectReceivePlanData(TReceivePlanH, MProduct, BUser) 予定数合計を取得メソッド}を呼び出す。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.・センタ間移動フラグ
	 * @param mProduct 商品マスタ：JANCD・商品CD
	 * @param bUser ユーザマスタ：カルチャID
	 * @return TReceivePlanB 入荷予定ボディ
	 */
	public TReceivePlanB checkJanProduct(TReceivePlanH tReceivePlanH, MProduct mProduct, BUser bUser) {

		TReceivePlanB tReceivePlanB = selectLogic.selectReceivePlanData(tReceivePlanH, mProduct, bUser);
		if (tReceivePlanB == null) {
			return null;
		}

		if (WCC.isZero(tReceivePlanB.getPlanNum())) {
			// 入荷予定数が0 ==> 予定なしデータ

			// [#4658] 予定なしの伝票を入荷検品した時のエラーメッセージが分かりにくい 2018.05.28 kawana Start
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.RECEIVE_INSPECTION_CANNOT_EXECUTE_NOT_FOUND_PLAN_DATA_ERROR);
			// [#4658] 予定なしの伝票を入荷検品した時のエラーメッセージが分かりにくい 2018.05.28 kawana End
			return null;
		}

		return tReceivePlanB;
	}

	/**
	 * <h2>入庫ラベルNo.のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入庫No.のデータを検索し、
	 * 検索対象が存在する場合、重複エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tStoreNo 入庫No.：入庫ラベルNo.
	 */
	public void checkLabelInput(TStoreNo tStoreNo) {
		//商品マスタのデータ取得
		TStoreNoCB tStoreNoCB = tStoreNoBhv.newMyConditionBean();
		tStoreNoCB.query().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());

		List<TStoreNo> lstTStoreNo = tStoreNoBhv.selectList(tStoreNoCB);

		if (lstTStoreNo.size() > 0) {
			// 存在する場合
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
			return;
		}
	}


	/**
	 * <h2>過入荷の数量チェックを行う。</h2>
	 * <pre>
	 * 引数の条件で入荷予定情報を取得し、入庫実績ボディの入庫数の合計値を抽出する。
	 * 【入荷数チェック】を行い、予定数を超えている(戻り値＝2)場合、
	 * 過入荷エラーをエラーステータスに設定する。
	 *
	 * 【入荷数チェック】
	 * ・{@link ReceiveNumCheckLogic#check(List) 入荷数チェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param planB 入荷予定ボディ：入荷予定ヘッダID・商品ID・入庫バラ数
	 */
	public void checkOverPlanNum(TReceivePlanB planB) {
		// 入荷予定情報の取得
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();

		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.query().queryTReceivePlanH().setReceivePlanHId_Equal(planB.getReceivePlanHId());
		tReceivePlanBCB.query().setProductId_Equal(planB.getProductId());

		//入庫実績ボディの入庫数の合計値を抽出
		tReceivePlanBCB.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
			@Override
			public void query(TStoreRecordBCB subCB) {
				subCB.specify().columnStoreNum();
				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_sumStoreNum, op -> op.coalesce(0));

		tReceivePlanBCB.query().addOrderBy_ReceivePlanBId_Asc();

		List<TReceivePlanB> lstTReceivePlanB = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		List<TStoreRecordB> storeBodyList = new ArrayList<TStoreRecordB>();
		BigDecimal lngNum = WCC.ZERO;
		BigDecimal lngAllNum = planB.getPreceNum();
        for (TReceivePlanB receive : lstTReceivePlanB) {
        	if (WCC.isZero(lngAllNum)) {
        		break;
        	}
        	lngNum = WCC.subtract(receive.getPlanNum(), receive.getSumStoreNum());
        	if (WCC.isPositive(lngNum)) {
        		if (WCC.isGreaterThan(lngNum, lngAllNum)) {
        			lngNum = lngAllNum;
        		}
        		TStoreRecordB store = new TStoreRecordB();
        		store.setReceivePlanBId(receive.getReceivePlanBId());
        		store.setStoreNum(WCC.add(receive.getSumStoreNum(), lngNum));
        		storeBodyList.add(store);
        		lngAllNum = WCC.subtract(lngAllNum, lngNum);
        	}
        }

        if (WCC.isPositive(lngAllNum)) {
        	if (storeBodyList.size() > 0) {
        		lngAllNum = WCC.add(lngAllNum, storeBodyList.get(storeBodyList.size() - 1).getStoreNum());
        		storeBodyList.get(storeBodyList.size() - 1).setStoreNum(lngAllNum);
        	} else {
        		TStoreRecordB store = new TStoreRecordB();
        		store.setReceivePlanBId(lstTReceivePlanB.get(0).getReceivePlanBId());
        		store.setStoreNum(WCC.add(lstTReceivePlanB.get(0).getSumStoreNum(), lngAllNum));
        		storeBodyList.add(store);
        	}
        }

		String strCheck = numCheckLogic.check(storeBodyList);
		// 入荷予定数を超えている場合
		if (CU.equals(strCheck, "2")) {
			// 検品数が予定数を超えています。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_QTY_OVER_ERROR);
			return;
		}

	}

	/**
	 * <h2入荷予定ヘッダの差異のチェックを行う。</h2>
	 *  <pre>
	 * 引数の条件で入荷予定情報を取得する、
	 * 入庫実績ボディの入庫数の合計値を抽出し、
	 * 予定と実績商品が変わる或いは予定数、実績数の差異がありましたら、trueを返す。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：荷主ID・センタID・入荷予定ヘッダID・WMS入荷伝票No.
	 * @return boolean チェック結果(True:差異あり False:差異なし)
	 */
	public boolean chkUnmatch(TReceivePlanH tReceivePlanH) {

		// 入荷予定情報の取得
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();

		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMClient();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMCenter();
		tReceivePlanBCB.setupSelect_MProduct();

		tReceivePlanBCB.query().queryTReceivePlanH().setCenterId_Equal(tReceivePlanH.getCenterId());
		tReceivePlanBCB.query().queryTReceivePlanH().setClientId_Equal(tReceivePlanH.getClientId());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceiveSlipNo_Equal(tReceivePlanH.getReceiveSlipNo());
		tReceivePlanBCB.query().queryTReceivePlanH().setReceivePlanHId_Equal(tReceivePlanH.getReceivePlanHId());

		//入庫実績ボディの入庫数の合計値を抽出
		tReceivePlanBCB.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
			@Override
			public void query(TStoreRecordBCB subCB) {
				subCB.specify().columnStoreNum();
				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_sumStoreNum, op -> op.coalesce(0));

		tReceivePlanBCB.query().addOrderBy_ProductId_Asc();
		tReceivePlanBCB.query().addOrderBy_ReceivePlanBId_Asc();

		List<TReceivePlanB> lstTReceivePlanB = tReceivePlanBBhv.selectList(tReceivePlanBCB);

		//変数初期化
		boolean blnUnmatch = false;
		Long lngProductIdBef = -1L;
		BigDecimal lngPlanNumSum = WCC.ZERO;
		BigDecimal lngStoreNumSum = WCC.ZERO;

		//取得した件数分ループ
		for (TReceivePlanB temp : lstTReceivePlanB) {
			//商品IDが変わったら差異のチェック
			if (lngProductIdBef.compareTo(temp.getProductId()) != 0) {
				if (lngPlanNumSum.compareTo(lngStoreNumSum) != 0) {
					blnUnmatch = true;
					break;
				}
				//変数初期化
				lngPlanNumSum = temp.getPlanNum();
				lngStoreNumSum = temp.getSumStoreNum();
				//商品IDを退避
				lngProductIdBef = temp.getProductId();
			} else {
				//予定数、実績数のサマリをカウント
				lngPlanNumSum = WCC.add(lngPlanNumSum,temp.getPlanNum());
				lngStoreNumSum = WCC.add(lngStoreNumSum, temp.getSumStoreNum());
			}
		}
		//最終データの差異のチェック
		if (lngPlanNumSum.compareTo(lngStoreNumSum) != 0) {
			blnUnmatch = true;
		}

		return blnUnmatch;
	}


	/**
	 * <h2>ＨＴ検品中ステータスのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ボディの情報を取得する。
	 * 入荷ステータスが"02"(入荷中)で入庫実績ボディの最新更新日の入力区分が"30"(HT)の場合、HT検品中とし「true」を返す。
	 *
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：センタID・荷主ID・WMS入荷伝票No.・入荷予定ヘッダID
	 * @return boolean true : HT検品中  false : HT検品中ではない
	 */
	public boolean chkHtReceive(TReceivePlanH tReceivePlanH) {

		// 入庫実績情報の取得
		TStoreRecordBCB tStoreRecordBCB = tStoreRecordBBhv.newMyConditionBean();
		tStoreRecordBCB.setupSelect_TReceivePlanB();
		tStoreRecordBCB.setupSelect_TReceivePlanB().withTReceivePlanH();
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setCenterId_Equal(tReceivePlanH.getCenterId());
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setClientId_Equal(tReceivePlanH.getClientId());
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setReceiveSlipNo_Equal(tReceivePlanH.getReceiveSlipNo());
		tStoreRecordBCB.query().queryTReceivePlanB().queryTReceivePlanH().setReceivePlanHId_Equal(tReceivePlanH.getReceivePlanHId());

		List<TStoreRecordB> lstTStoreRecordB = tStoreRecordBBhv.selectList(tStoreRecordBCB);

		if (lstTStoreRecordB.size() == 0) {
			// 存在しない場合は未入荷扱い
			return false;
		}

		//ステータスが02：入荷中以外は抜ける
		if (!lstTStoreRecordB.get(0).getTReceivePlanB().getTReceivePlanH().isReceiveStatus$02()) {
			return false;
		}

		//変数初期化
		Timestamp lastUpdDt = null;
		String lastInputType = null;

		//取得した件数分ループ
		for (TStoreRecordB temp : lstTStoreRecordB) {

			// 最新更新日と比較
			Timestamp updDt = temp.getUpdDt();
			String inputType = temp.getInputType();

			if(updDt == null || CU.isNullOrEmpty(inputType)) {
				continue;
			}

			if (lastUpdDt == null || (lastUpdDt.compareTo(updDt) < 0)) {
				// 最新更新日、最新更新日の入力区分を変更
				lastUpdDt = updDt;
				lastInputType = inputType;
			}
		}

		// 最新更新日の入力区分が「HT」の場合はtrueを返す
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (CDef.InputType.codeOf(lastInputType) == CDef.InputType.$30) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			return true;
		}

		return false;
	}

}
