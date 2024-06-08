package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.stock.InventoryUpdateLogic;
import com.oneslogi.wms.logic.stock.StockAdjustUpdateLogic;

/**
 * 棚卸在庫一括更新登録ロジッククラス
 */
public class InventoryAllInsUptLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private StockAdjustUpdateLogic stockAdjustUpdateLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private InventoryUpdateLogic inventoryUpdateLogic;

	/**
	 * <h2>棚卸の一括在庫調整を行う。</h2>
	 * <pre>
	 * WMS在庫移動伝票Noを採番後、在庫移動指示ヘッダ、在庫移動指示ボディのデータを組み立てる。
	 * 在庫数の増減がある場合、在庫移動指示データの【在庫調整】及び【棚卸データ更新】を行う。
	 *
	 * 【在庫調整】
	 * ・{@link StockAdjustUpdateLogic#update(MProcessType mProcessType, TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 完納メソッド}を呼び出す。
	 *
	 * 【棚卸データ更新】
	 * ・{@link InventoryUpdateLogic#update(TInventoryB, TMoveInstH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 棚卸データ更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：倉庫ID・在庫区分ID・商品ID・ロケーションID・預託ID・ロットID・ロット・期限日・入庫No.ID・入庫ラベルNo.・仕入先ID・荷姿ID・入数・棚卸数・引当可能数
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void insert(TInventoryH tInventoryH, List<TInventoryB> tInventoryB, ErrorStatus errStatus) {

		for (TInventoryB body : tInventoryB) {
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(body.getTInventoryH().getClientId());
			mClientCenter.setCenterId(body.getTInventoryH().getCenterId());
			mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
			String systemdt = mClientCenter.getSystemDt();
			// [SK2-023] WMS在庫移動伝票No採番時にセンターIDを荷主IDで検索しているのが原因でした。 2014.12.15 KI Start
			String moveSlipNo = numberingLogic.getNumbering(body.getTInventoryH().getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);
			// [SK2-023] WMS在庫移動伝票No採番時にセンターIDを荷主IDで検索しているのが原因でした。 2014.12.15 KI End
			// [ON推-品向-395] 棚卸在庫一括更新を差分で在庫調整するように変更 2014.12.04 kawana Start

			TMoveInstH tMoveInstH = new TMoveInstH();
			TMoveInstB tMoveInstB = new TMoveInstB();
			MProcessType mProcessType = new MProcessType();

			//在庫移動指示ヘッダ
			tMoveInstH.setClientId(tInventoryH.getClientId());
			tMoveInstH.setCenterId(tInventoryH.getCenterId());
			tMoveInstH.setMoveSlipNo(moveSlipNo);
			tMoveInstH.setInstDt(systemdt);
			tMoveInstH.setInputType_$00();
			tMoveInstH.setMoveInstStatus_$00();
			tMoveInstH.setProcessTypeId(mProcessType.getProcessTypeId());
			//在庫移動指示ボディ
			// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更(ここから削除) 2016.04.20 kawana
			tMoveInstB.setMoveInstStatus_$00();
			tMoveInstB.setWarehouseId(body.getWarehouseId());
			tMoveInstB.setWarehouseCd(body.getMWarehouse().getWarehouseCd());
			tMoveInstB.setStockTypeId(body.getStockTypeId());
			tMoveInstB.setStockTypeCd(body.getMStockType().getStockTypeCd());
			tMoveInstB.setProductId(body.getProductId());
			tMoveInstB.setProductCd(body.getMProduct().getProductCd());
			tMoveInstB.setLocationId(body.getLocationId());
			tMoveInstB.setLocationCd(body.getMLocation().getLocationCd());
			tMoveInstB.setDepositId(body.getDepositId());
			tMoveInstB.setDepositCd(body.getMCustomerByDepositId().getCustomerCd());
			if (body.getLotId() != null) {
				tMoveInstB.setLotId(body.getLotId());
			}
			tMoveInstB.setLot(body.getLot());
			tMoveInstB.setLimitDt(body.getLimitDt());
			tMoveInstB.setStoreNoId(body.getStoreNoId());
			tMoveInstB.setStoreLabelNo(body.getStoreLabelNo());
			// [ON推-品向-408] 入庫No.テーブルが存在しない場合がある。 2014.12.04 koseki Start
			// [横並-198] 仕入先IDが入っていなかったら設定しないように修正 2014.12.03 koseki Start
			if (body.getTStoreNo() != null && body.getTStoreNo().getSupplierId() != null) {
				tMoveInstB.setSupplierId(body.getTStoreNo().getSupplierId());
				tMoveInstB.setSupplierCd(body.getTStoreNo().getMCustomer().getCustomerCd());
			} else { // 棚卸入力で入力された仕入先
				tMoveInstB.setSupplierId(body.getSupplierId());
				tMoveInstB.setSupplierCd(body.getSupplierCd());
			}
			// [横並-198] 仕入先IDが入っていなかったら設定しないように修正 2014.12.03 koseki End
			// [#1074] 入庫ラベルNo.指定されていてもマージを優先するように変更 2017.03.03 kawana Start
			tMoveInstB.setStoreDt(body.getStoreDt());
			// [#1074] 入庫ラベルNo.指定されていてもマージを優先するように変更 2017.03.03 kawana End
			// [ON推-品向-408] 入庫No.テーブルが存在しない場合がある。 2014.12.04 koseki End
			tMoveInstB.setShapeId(body.getShapeId());
			if (body.getMShape() != null) {
				tMoveInstB.setShapeCd(body.getMShape().getShapeCd());
			}
			tMoveInstB.setUnitNum(body.getUnitNum());
			tMoveInstB.setInstNum(body.getInventoryNum());

			// 在庫調整実行
			BigDecimal beforeNum = body.getChargeNum();
			BigDecimal afterNum = body.getInventoryNum();
			BigDecimal adjustNum = WCC.ZERO;
			boolean necessaryAdjustFlg = false;

			// 在庫数の増減を判定
			if (WCC.isLessThan(beforeNum, afterNum)) {
				// 在庫調整[+]の設定
				// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana Start
				mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$24.code());
				// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana End
				adjustNum = WCC.subtract(afterNum, beforeNum);
				necessaryAdjustFlg = true;
				// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana Start
				tMoveInstB.setInoutType_$0();
				// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana End
			} else if (WCC.isLessThan(afterNum, beforeNum)) {
				// 在庫調整[-]の設定
				// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana Start
				mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$23.code());
				// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana End
				adjustNum = WCC.subtract(beforeNum, afterNum);
				necessaryAdjustFlg = true;
				// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana Start
				tMoveInstB.setInoutType_$1();
				// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana End
			}

			if (necessaryAdjustFlg) {
				// 在庫調整を実行

				mProcessType = processTypeLogic.getUkEntity(mProcessType);
				tMoveInstH.setProcessTypeId(mProcessType.getProcessTypeId());
				tMoveInstB.setInstNum(adjustNum);

				stockAdjustUpdateLogic.update(mProcessType, tMoveInstH, tMoveInstB, errStatus);

				// 棚卸データを更新
				tMoveInstB.setInstNum(afterNum);
				inventoryUpdateLogic.update(body, tMoveInstH, errStatus);
			}

			// [ON推-品向-395] 棚卸在庫一括更新を差分で在庫調整するように変更 2014.12.04 kawana End
		}

	}
}