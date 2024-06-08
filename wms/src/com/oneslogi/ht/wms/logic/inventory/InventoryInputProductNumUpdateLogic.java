package com.oneslogi.ht.wms.logic.inventory;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力棚卸データ更新ロジッククラス
 */
public class InventoryInputProductNumUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 棚卸ボディ         */
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	/* 棚卸入力履歴       */
	@Inject
	private TInventoryInpHistBhv tInventoryInpHistBhv;

	/**
	 * <h2>棚卸数を更新する。</h2>
	 * <pre>
	 * 引数を条件に、棚卸ボディを検索し、
	 * データが存在する場合、以下の処理を行う。
	 * ・棚卸ボディの棚卸数を更新する
	 * ・既存の棚卸入力履歴データの最新フラグを「1：最新である」から「0：最新でない」に更新する
	 * ・棚卸入力履歴を最新フラグ「1：最新である」で新規登録する
	 * データが存在しない場合、棚卸ボディと棚卸入力履歴を新規登録する。
	 * ※更新、登録時、排他チェック用に棚卸ボディのバージョンNoを設定する
	 *
	 * データが複数件の場合、
	 * 引数の数量を引当可能数を上限に、各棚卸数へ割り当てる。
	 * 割り当てる数量が0になった場合は、棚卸数を0とする。
	 * 対象の全レコード更新後、割り当てる数量に残数がある場合、最終レコードの棚卸数に残数を加算し更新する。
	 *
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸ヘッダID
	 * @param wHtInventoryDto 商品棚卸ワーク：倉庫ID・ロケーションID・商品ID・預託在庫区分ID・在庫区分ID・ロット・期限日・数量
	 * @return WHtInventoryInputProdDto 商品棚卸ワーク
	 */
	//[HT1.5-CT1-041] 処理結果を返したいので返り値を変更 2015/06/26 KAI UPDATE START
	//public void updateInventoryNum(TInventoryH tInventoryH, WHtInventoryInputProdDto wHtInventoryDto) {
	// [Ver3.0] unit of measure対応 2018.1.2 REN Start
	public WHtInventoryInputProdDto updateInventoryNum(TInventoryH tInventoryH, WHtInventoryInputProdDto wHtInventoryDto,Long shapeId) {
    // [Ver3.0] unit of measure対応 2018.1.2 REN End
	//[HT1.5-CT1-041] 処理結果を返したいので返り値を変更 2015/06/26 KAI UPDATE END

		TInventoryInpHist retTInventoryInpHist = new TInventoryInpHist();

		//棚卸ボディ取得処理
		TInventoryBCB tInventoryBCB = tInventoryBBhv.newMyConditionBean();

		//[HT1.5-CT1-039] 2015/06/26 sja-soft 棚卸ヘッダID条件を追加する add-s
		tInventoryBCB.query().setInventoryHId_Equal(tInventoryH.getInventoryHId());
		//[HT1.5-CT1-039] 2015/06/26 sja-soft 棚卸ヘッダID条件を追加する add-e

		tInventoryBCB.query().setLocationId_Equal(wHtInventoryDto.getLocId());
		tInventoryBCB.query().setProductId_Equal(wHtInventoryDto.getProductId());
		tInventoryBCB.query().setDepositId_Equal(wHtInventoryDto.getConsignmentClsId());
		tInventoryBCB.query().setStockTypeId_Equal(wHtInventoryDto.getStockTypeId());
		tInventoryBCB.query().setLot_Equal(wHtInventoryDto.getLot());
		tInventoryBCB.query().setLimitDt_Equal(wHtInventoryDto.getLimitDt());
		tInventoryBCB.query().setStockAdjustFlg_Equal_$0();

		tInventoryBCB.query().addOrderBy_StoreLabelNo_Asc();

		List<TInventoryB> lstTInventoryB = tInventoryBBhv.selectList(tInventoryBCB);
		if (lstTInventoryB.size()==0){
			//新規
			TInventoryB tInventoryB = new TInventoryB();

			tInventoryB.setInventoryHId(tInventoryH.getInventoryHId());
			tInventoryB.setWarehouseId(wHtInventoryDto.getWarehouseId());
			tInventoryB.setProductId(wHtInventoryDto.getProductId());
			tInventoryB.setStockTypeId(wHtInventoryDto.getStockTypeId());
			tInventoryB.setLocationId(wHtInventoryDto.getLocId());
			tInventoryB.setDepositId(wHtInventoryDto.getConsignmentClsId());
			tInventoryB.setLotId(wHtInventoryDto.getLotId());
			tInventoryB.setLot(wHtInventoryDto.getLot());
			tInventoryB.setLimitDt(wHtInventoryDto.getLimitDt());
			tInventoryB.setInventoryNum(wHtInventoryDto.getQty());
			tInventoryB.setInputType_$30();
			tInventoryB.setStockAdjustFlg_$0();
			tInventoryB.setShapeId(shapeId);
			tInventoryBBhv.insert(tInventoryB);

			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD START
			wHtInventoryDto.setInventoryBVersionNo(0L);
			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD END

			//棚卸入力履歴
			TInventoryInpHist tInventoryInpHist = new TInventoryInpHist();

			tInventoryInpHist.setInputDt(AccessContext.getAccessTimestampOnThread());
			tInventoryInpHist.setInventoryBId(tInventoryB.getInventoryBId());
			tInventoryInpHist.setInventoryNum(wHtInventoryDto.getQty());
			tInventoryInpHist.setLastFlg_$1();

			tInventoryInpHistBhv.insert(tInventoryInpHist);
		}else{
			//更新
			BigDecimal qty = wHtInventoryDto.getQty();
			BigDecimal updateQty = WCC.ZERO;

			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD START
			Long versionNo = 0L;
			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD END

			TInventoryInpHist tInventoryInpHist = new TInventoryInpHist();
			tInventoryInpHist.setInputDt(AccessContext.getAccessTimestampOnThread());
			for (TInventoryB tInventoryB : lstTInventoryB) {

				//[HT1.5-CT1-040] 棚卸数の更新は加算から上書きに変更 2015/06/26 KAI UPDATE START
				/*
				if(tInventoryB.getChargeNum().equals(tInventoryB.getInventoryNum())){
					continue;
				}
				Long diff = tInventoryB.getChargeNum() - tInventoryB.getInventoryNum();
				if(diff <= 0){
					tInventoryB.setInventoryNum(tInventoryB.getInventoryNum() + qty);
					tInventoryBBhv.update(tInventoryB);

					tInventoryInpHist.setInventoryBId(tInventoryB.getInventoryBId());
					tInventoryInpHist.setInventoryNum(qty);
					retTInventoryInpHist = insertInventoryInpHist(tInventoryInpHist);

					qty = 0L;
					break;
				}else{
					if(qty.compareTo(diff) <= 0){
						tInventoryB.setInventoryNum(tInventoryB.getInventoryNum() + qty);
						tInventoryBBhv.update(tInventoryB);

						tInventoryInpHist.setInventoryBId(tInventoryB.getInventoryBId());
						tInventoryInpHist.setInventoryNum(qty);
						retTInventoryInpHist = insertInventoryInpHist(tInventoryInpHist);

						qty = 0L;
						break;
					}else{
						tInventoryB.setInventoryNum(tInventoryB.getInventoryNum() + diff);
						tInventoryBBhv.update(tInventoryB);

						tInventoryInpHist.setInventoryBId(tInventoryB.getInventoryBId());
						tInventoryInpHist.setInventoryNum(diff);
						retTInventoryInpHist = insertInventoryInpHist(tInventoryInpHist);

						qty = qty - diff;
					}
				}
				*/
				//更新数の設定
				if(qty.compareTo(tInventoryB.getChargeNum()) >= 0){
					//残数の方が大きい場合は棚卸前在庫数で更新
					updateQty = tInventoryB.getChargeNum();
					qty = WCC.subtract(qty, tInventoryB.getChargeNum());
				} else {
					//棚卸前在庫数の方が大きい場合は残数で更新(以降のデータは全て０で更新)
					updateQty = qty;
					qty = WCC.ZERO;
				}
				//棚卸ボディ更新
				tInventoryB.setInventoryNum(updateQty);
				tInventoryBBhv.update(tInventoryB);

				//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD START
				versionNo += tInventoryB.getVersionNo();
				//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD END

				//棚卸入力履歴更新
				tInventoryInpHist.setInventoryBId(tInventoryB.getInventoryBId());
				tInventoryInpHist.setInventoryNum(updateQty);
				retTInventoryInpHist = insertInventoryInpHist(tInventoryInpHist);
				//[HT1.5-CT1-040] 棚卸数の更新は加算から上書きに変更 2015/06/26 KAI UPDATE END
			}

			//残数がある場合は最後のレコードの加算
			if(WCC.isPositive(qty)){
				TInventoryB tInventoryB = lstTInventoryB.get(lstTInventoryB.size()-1);
				tInventoryB.setInventoryNum(WCC.add(tInventoryB.getInventoryNum(), qty));
				tInventoryBBhv.update(tInventoryB);

				//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD START
				versionNo += tInventoryB.getVersionNo();
				//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD END

				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				if(WCC.isEqual(qty, wHtInventoryDto.getQty())){
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
					tInventoryInpHist.setInventoryBId(tInventoryB.getInventoryBId());
					tInventoryInpHist.setInventoryNum(qty);
					retTInventoryInpHist = insertInventoryInpHist(tInventoryInpHist);
				}else{
					retTInventoryInpHist.setInventoryNum(WCC.add(tInventoryInpHist.getInventoryNum(), qty));
					tInventoryInpHistBhv.update(tInventoryInpHist);
				}
			}

			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD START
			wHtInventoryDto.setInventoryBVersionNo(versionNo);
			//[HT1.5-CT1-041] 同時送信の排他チェックのために棚卸ボディのバージョンNoを追加 2015/06/26 KAI ADD END
		}
		//[HT1.5-CT1-041] 同時送信の排他チェックのために戻り値を追加 2015/06/26 KAI ADD START
		return wHtInventoryDto;
		//[HT1.5-CT1-041] 同時送信の排他チェックのために戻り値を追加 2015/06/26 KAI ADD END
	}

	private TInventoryInpHist insertInventoryInpHist(TInventoryInpHist tInventoryInpHist) {
		//棚卸入力履歴更新処理
		TInventoryInpHistCB tInventoryInpHistCB = tInventoryInpHistBhv.newMyConditionBean();

		tInventoryInpHistCB.query().setInventoryBId_Equal(tInventoryInpHist.getInventoryBId());
		tInventoryInpHistCB.query().setLastFlg_Equal_$1();

		List<TInventoryInpHist> lstTInventoryInpHist = tInventoryInpHistBhv.selectList(tInventoryInpHistCB);
		if (lstTInventoryInpHist.size()>0){
			for (TInventoryInpHist tInventoryInpHistLoop : lstTInventoryInpHist) {
				tInventoryInpHistLoop.setLastFlg_$0();
			}
			tInventoryInpHistBhv.batchUpdate(lstTInventoryInpHist);
		}

		//棚卸入力履歴新規処理
		tInventoryInpHist.setLastFlg_$1();
		tInventoryInpHistBhv.insert(tInventoryInpHist);

		return tInventoryInpHist;
	}

	/**
	 * <h2>棚卸ボディの在庫調整状況のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に棚卸ボディを検索し、
	 * 在庫調整フラグより在庫調整状況を判定する。
	 *
	 * 在庫調整フラグが"0"（未調整）の場合、trueを返す。
	 * 在庫調整フラグが"0"以外（調整済）の場合、falseを返す。
	 *
	 * 該当する棚卸ボディデータが存在しない場合、trueを返す。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ（未使用）
	 * @param wHtInventoryDto 商品棚卸ワーク：ロットID・商品ID・預託在庫区分ID・在庫区分ID・ロット・期限日
	 * @return boolean true：未調整；false：調整済
	 */
	public boolean checkInventoryAdjust(TInventoryH tInventoryH, WHtInventoryInputProdDto wHtInventoryDto) {

		//棚卸ボディ取得処理
		TInventoryBCB tInventoryBCB = tInventoryBBhv.newMyConditionBean();

		// [#1854] 過去に調整済の棚卸入力があるとエラーになってしまう問題を修正 2017.05.26 kawana Start
		tInventoryBCB.query().setInventoryHId_Equal(wHtInventoryDto.getInventoryHId());
		// [#1854] 過去に調整済の棚卸入力があるとエラーになってしまう問題を修正 2017.05.26 kawana End
		tInventoryBCB.query().setLocationId_Equal(wHtInventoryDto.getLocId());
		tInventoryBCB.query().setProductId_Equal(wHtInventoryDto.getProductId());
		tInventoryBCB.query().setDepositId_Equal(wHtInventoryDto.getConsignmentClsId());
		tInventoryBCB.query().setStockTypeId_Equal(wHtInventoryDto.getStockTypeId());
		tInventoryBCB.query().setLot_Equal(wHtInventoryDto.getLot());
		tInventoryBCB.query().setLimitDt_Equal(wHtInventoryDto.getLimitDt());

		List<TInventoryB> lstTInventoryB = tInventoryBBhv.selectList(tInventoryBCB);
		if (lstTInventoryB.size()==0){
			return true;
		}else{
			for (TInventoryB tInventoryB : lstTInventoryB) {
				if(tInventoryB.isStockAdjustFlg$0()){
					return true;
				}
			}
		}

		return false;
	}

}