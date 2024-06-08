package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷数チェックロジッククラス
 */
public class ReceiveNumCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	/**
	 * <h2>入荷数チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーにデータベースから入荷予定データを取得し、
	 * 入荷予定数を超えていないかのチェックを行う。
	 * 検索結果が未存在の場合、「1｣を返す。
	 * 入荷予定数が０の場合、空白を返す。
	 * 入庫数は入荷予定数より大きい場合、「2」を返す。
	 * </pre>
	 * @param bodyList 入庫実績ボディリスト：入荷予定ボディID・入庫数
	 * @return String 入荷数チェックの戻り値
	 */
	public String check(List<TStoreRecordB> bodyList) {

//		Boolean result = true ;
		String result = "" ;

		// 変数の設定
		HashMap<Long,BigDecimal> hashMap = new HashMap<Long,BigDecimal>();

  		for(TStoreRecordB body : bodyList) {
  			 if(hashMap.containsKey(body.getReceivePlanBId())){
  				 //入荷予定ボディIDというキーが存在の場合
  				hashMap.put(body.getReceivePlanBId(),WCC.add(hashMap.get(body.getReceivePlanBId()), body.getStoreNum()));
  			 } else {
  				//入荷予定ボディIDというキーが未存在の場合
  				hashMap.put(body.getReceivePlanBId(),body.getStoreNum());
  			}
  		}

  		 Iterator<Map.Entry<Long, BigDecimal>> it = hashMap.entrySet().iterator();

  		 while (it.hasNext()) {
  		     Map.Entry<Long, BigDecimal> entry = it.next();
  		     TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
  		     //検索条件
  		     cb.query().setReceivePlanBId_Equal(entry.getKey());
  		     TReceivePlanB Result = null;
  			 Result = tReceivePlanBBhv.selectEntity(cb);

  			 if (Result == null) {
  				result ="1";
  				return result;
  			 }
  		     // [SK2-010] 予定数が0の場合、チェックを行わない  2014.12.08 KI Start
  		     if (WCC.isZero(Result.getPlanNum())){
  			    return result;
  		     }
  		     // [SK2-010] 予定数が0の場合、チェックを行わない  2014.12.08 KI End
  			 if(WCC.isGreaterThan(entry.getValue(), Result.getPlanNum())){
  				result ="2";
  			}
  		 }

  		return result;
	}
}
