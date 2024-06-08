package com.oneslogi.ht.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 *バラ出荷検品（梱包計算なし）更新ロジッククラス
 */
public class ShippingNoPackingUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出荷検品ワーク     */
	@Inject
	private WHtShippingBhv wHtShippingBhv;

	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

	// ===== 使用ロジック =====

	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * <h2>出荷検品ワークテーブルを更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルを取得し、
	 * 検品済数と検品残数を計算後更新する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID・商品ID
	 */
	public void updateWHtShipping(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.setupSelect_MProduct();
		//wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setProductId_Equal(wHtShipping.getProductId());
		wHtShippingCB.query().setBoxId_IsNull();

		WHtShipping entity = wHtShippingBhv.selectEntity(wHtShippingCB);

		if (entity != null) {
			entity.setSpgQtyOns(WCC.add(entity.getSpgQtyOns(), wHtShipping.getSpgQtyOns()));
			entity.setSpgQtyRemain(WCC.subtract(entity.getInstNum(), entity.getSpgQtyOns()));
			wHtShippingBhv.update(entity);
		}
	}

	/**
	 * <h2>出荷検品ワークデータを削除する。</h2>
	 * <pre>
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行う。
	 * ①出荷梱包No.の場合、検品残数に検品済数を加算し、検品済数、荷材情報をクリアし、出荷検品ワーク(削除用)を更新する。
	 * ②出荷検品ワーク(削除用)の荷材IDが未設定の場合、検品残数に検品済数を加算し、検品済数＝0で更新する。
	 * ③上記以外の場合、荷材未登録の出荷検品ワークを取得し、削除データの検品済数を検品残数、指示数に加算し、更新する。
	 *   出荷検品ワーク(削除用)のデータを削除する。
	 *   個口分子/個口分母を調整し、出荷検品ワークデータを更新する。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：センタID・荷主ID・MACアドレス・出庫作業No.・個口番号
	 * @param entityDel 出荷検品ワーク(削除用)：全項目
	 */
	public void deleteWHtShipping(WHtShipping wHtShipping, WHtShipping entityDel) {

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		if (commonLogic.isShippingPackingNo(entityDel.getCenterId(), entityDel.getPickingWorkNo())) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			entityDel.setSpgQtyRemain(WCC.add(entityDel.getSpgQtyRemain(), entityDel.getSpgQtyOns()));
			entityDel.setSpgQtyOns(WCC.ZERO);
			entityDel.setBoxId(null);
			entityDel.setBoxCd("");
			entityDel.setBoxNm("");
			wHtShippingBhv.update(entityDel);
		}else if (entityDel.getBoxId() == null) {
			entityDel.setSpgQtyRemain(WCC.add(entityDel.getSpgQtyRemain(), entityDel.getSpgQtyOns()));
			entityDel.setSpgQtyOns(WCC.ZERO);
			wHtShippingBhv.update(entityDel);
		}
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
		else {
			Long pieceNo = entityDel.getPieceNo();

			//個口番号の件数を取得
			WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
			wHtShippingCB.query().setMacAddress_Equal(entityDel.getMacAddress());
			wHtShippingCB.query().setCenterId_Equal(entityDel.getCenterId());
			wHtShippingCB.query().setClientId_Equal(entityDel.getClientId());
			//		wHtShippingCB.query().setSpgInspectionFlg_Equal(entityDel.getSpgInspectionFlg());
			wHtShippingCB.query().setPickingWorkNo_Equal(entityDel.getPickingWorkNo());
			wHtShippingCB.query().setPieceNo_Equal(entityDel.getPieceNo());
			int cntPieceNo = wHtShippingBhv.selectCount(wHtShippingCB);

			//箱登録しない分を取得
			wHtShippingCB = wHtShippingBhv.newMyConditionBean();
			wHtShippingCB.query().setMacAddress_Equal(entityDel.getMacAddress());
			wHtShippingCB.query().setCenterId_Equal(entityDel.getCenterId());
			wHtShippingCB.query().setClientId_Equal(entityDel.getClientId());
			//		wHtShippingCB.query().setSpgInspectionFlg_Equal(entityDel.getSpgInspectionFlg());
			wHtShippingCB.query().setPickingWorkNo_Equal(entityDel.getPickingWorkNo());
			wHtShippingCB.query().setProductId_Equal(entityDel.getProductId());
			wHtShippingCB.query().setBoxId_IsNull();

			//削除処理を行う
			WHtShipping entityNoBox = wHtShippingBhv.selectEntity(wHtShippingCB);
			if (entityNoBox != null) {
				entityNoBox.setInstNum(WCC.add(entityNoBox.getInstNum(), entityDel.getSpgQtyOns()));
				entityNoBox.setSpgQtyRemain(WCC.add(entityNoBox.getSpgQtyRemain(), entityDel.getSpgQtyOns()));

				wHtShippingBhv.update(entityNoBox);

				wHtShippingBhv.delete(entityDel);
			} else {
				entityDel.setSpgQtyRemain(WCC.add(entityDel.getSpgQtyRemain(), entityDel.getSpgQtyOns()));
				entityDel.setSpgQtyOns(WCC.ZERO);
				entityDel.setBoxId(null);
				entityDel.setBoxCd("");
				entityDel.setBoxNm("");
				entityDel.setPieceNo(0l);
				//entityDel.setPieceNumeRecode(0l);		//DBテーブルで削除した項目

				wHtShippingBhv.update(entityDel);
			}

			//【C-CWMS-0040】「pieceDenoRecode」,「pieceNumeRecode」はいらないで「pieceNo」で管理する処理に変更 2015/09/17  NayZaw UPDATE Start

			//		Long pieceDenoRecode = entityDel.getPieceDenoRecode();
			//個口分子/個口分母の調整
			if (cntPieceNo == 1) {
				wHtShippingCB = wHtShippingBhv.newMyConditionBean();
				wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
				wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
				wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
				//			wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
				wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
				wHtShippingCB.query().setPieceNo_GreaterThan(pieceNo);
				wHtShippingCB.query().setBoxId_IsNotNull();

				List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

				for (WHtShipping entityUpd : lstWHtShipping) {
					entityUpd.setPieceNo(entityUpd.getPieceNo() - 1);
					//			    entityUpd.setPieceNumeRecode(entityUpd.getPieceNumeRecode() - 1);
				}
				wHtShippingBhv.batchUpdate(lstWHtShipping);
				//
				//			wHtShippingCB = wHtShippingBhv.newMyConditionBean();
				//			wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
				//			wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
				//			wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
				////			wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
				//			wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
				//			wHtShippingCB.query().setPieceDenoRecode_GreaterThan(0l);		//
				//
				//			lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);
				//
				//			pieceDenoRecode = pieceDenoRecode - 1;
				//			for (WHtShipping entityUpd : lstWHtShipping) {
				//				entityUpd.setPieceDenoRecode(pieceDenoRecode);
				//			}
				//			wHtShippingBhv.batchUpdate(lstWHtShipping);

				wHtShipping.setPieceNo(wHtShipping.getPieceNo() - 1);
			}
			//		wHtShipping.setPieceNumeRecode(pieceDenoRecode + 1);
			//    	wHtShipping.setPieceDenoRecode(pieceDenoRecode);
			//		wHtShipping.setPieceNo(wHtShipping.getPieceNo()-1);

			//【C-CWMS-0040】「pieceDenoRecode」,「pieceNumeRecode」はいらないで「pieceNo」で管理する処理に変更 2015/09/17  NayZaw UPDATE Start
		}
	}

}