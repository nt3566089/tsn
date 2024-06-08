package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.WShippingInterrupt;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * 検品中断処理ロジッククラス
 */
public class ShippingInterruptLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;

	// ===== 使用テーブル =====
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;

	/**
	 * <h2>出荷検品中断データを登録する。</h2>
	 * <pre>
	 * 出荷検品中断ID採番し、出荷検品中断テーブルにデータを登録後、
	 * 【出荷ステータス更新クラス.出荷検品中断】を行う。
	 *
	 * 【出荷ステータス更新クラス.出荷検品中断】
	 * ・{@link ShipStatusUpdateLogic#inspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷ステータス・出荷検品中断メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tAllocInstBList 引当指示ボディリスト：指示数・検品済数・検品残数・商品ID・出荷梱包No.荷材ID
	 * @param tPickingHList 出庫ヘッダリスト：引当指示ヘッダID・荷主ID・センタID・更新ユーザ・出庫作業No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(List<TAllocInstB> tAllocInstBList,
			List<TPickingH> tPickingHList,
			ErrorStatus errSts) {

		// ===== 出荷検品中断登録 =====
		// ===== 出庫ボディリストのデータ件数分繰返 =====
		List<WShippingInterrupt> wShippingInterruptList = new ArrayList<WShippingInterrupt>();
		for (TAllocInstB tAllocInstB : tAllocInstBList) {
			// ===== 出荷検品中断の登録データ編集 =====
			WShippingInterrupt wShippingInterrupt = new WShippingInterrupt();

			wShippingInterrupt.setShippingInstHId(Long.parseLong(numberingLogic.getNumbering(WmsNumberingConst.SHIPPING_INST_H_ID)));

			// 引当指示ヘッダID
			wShippingInterrupt.setAllocInstHId(tPickingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getAllocInstHId());
			// 荷主
			wShippingInterrupt.setClientId(tPickingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getClientId());
			// センタ
			wShippingInterrupt.setCenterId(tPickingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getCenterId());
			// 担当者CD
			wShippingInterrupt.setUserCd(tPickingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getUpdUser());
			// 出庫作業No.
			wShippingInterrupt.setPickingWorkNo(tPickingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getPickingWorkNo());
			// 指示数
			// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] Start
			//wShippingInterrupt.setUnitNum(tAllocInstB.getInstNum());
			wShippingInterrupt.setInstNum(tAllocInstB.getInstNum());
			// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] End
			// 検品済数
			wShippingInterrupt.setSpgQtyOns(tAllocInstB.getSpgQtyOns());
			// 検品残数
			wShippingInterrupt.setSpgQtyRemain(tAllocInstB.getSpgQtyRemain());
			// 商品ID
			wShippingInterrupt.setProductId(tAllocInstB.getProductId());

     		//【C-CWMS-0040】出荷検品中断テーブルでは存在しない項目為、削除 2015/09/15 Nay Zaw DELETE Start

//			// 商品Cd
//			wShippingInterrupt.setProductCd(tAllocInstB.getProductCd());
//			// 検品ステータス
//			wShippingInterrupt.setSpgStatus(tPickingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getPickingStatus());
//
     		//【C-CWMS-0040】出荷検品中断テーブルでは存在しない項目為、削除 2015/09/15 Nay Zaw DELETE End

			// 個口番号
			// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] Start
			//wShippingInterrupt.setShippingPackingNo(tAllocInstB.getShippingPackingNo());
//			if(tAllocInstB.getShippingPackingNo()!=null){
//				wShippingInterrupt.setPieceNo(tAllocInstB.getShippingPackingNo());
//			}
//			else{
//				wShippingInterrupt.setPieceNo(0l);
//			}
			wShippingInterrupt.setPieceNo(tAllocInstB.getShippingPackingNo());

			// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] End
			// 荷材ID
			wShippingInterrupt.setBoxId(tAllocInstB.getBoxId());

			//【C-CWMS-0040】出荷検品中断テーブルでは存在しない項目為、削除 2015/09/15 Nay Zaw DELETE Start

//			// [横並-076] BigDecimal→Longを変更 2014.12.03 kei Start
//			// 単重量(グロス)
//			wShippingInterrupt.setNetWeight(tAllocInstB.getNetWeight().longValue());
//			// 総重量(グロス)
//			wShippingInterrupt.setGrossWeight(tAllocInstB.getGrossWeight().longValue());
//			// [横並-076] BigDecimal→Longを変更 2014.12.03 kei End

			//【C-CWMS-0040】出荷検品中断テーブルでは存在しない項目為、削除 2015/09/15 Nay Zaw DELETE End

			wShippingInterruptList.add(wShippingInterrupt);
		}

		// ===== 出荷検品中断の登録実行 =====
		wShippingInterruptBhv.batchInsert(wShippingInterruptList);

		// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品中断メッソドを呼出し =====
		shipStatusUpdateLogic.inspectInterrupt(tPickingHList,errSts);
	}

	// [C-CWMS-0051] 出荷梱包No．で検品の場合為追加処理 2015/12/02 NayZaw Start
	/**
	 * <h2>出荷検品中断データを登録する(出荷梱包No.で検品の場合）。</h2>
	 * <pre>
	 * 出荷検品中断ID採番し、出荷検品中断テーブルにデータを登録後、
	 * 【出荷ステータス更新クラス.出荷検品中断】を行う。
	 *
	 *
	 * 【出荷ステータス更新クラス.出荷検品中断】
	 * ・{@link ShipStatusUpdateLogic#packingInspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷ステータス・出荷検品中断(出荷梱包Noで検品場合）メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tAllocInstBList 引当指示ボディリスト：：指示数・検品済数・検品残数・商品ID・出荷梱包No.荷材ID
	 * @param tPackingHList 梱包ヘッダリスト：引当指示ヘッダID・荷主ID・センタID・更新ユーザ・出庫作業No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertWithPackingNo(List<TAllocInstB> tAllocInstBList,
			List<TPackingH> tPackingHList,
			ErrorStatus errSts) {

		// ===== 出荷検品中断登録 =====
		// ===== 出庫ボディリストのデータ件数分繰返 =====
		List<WShippingInterrupt> wShippingInterruptList = new ArrayList<WShippingInterrupt>();
		for (TAllocInstB tAllocInstB : tAllocInstBList) {
			// ===== 出荷検品中断の登録データ編集 =====
			WShippingInterrupt wShippingInterrupt = new WShippingInterrupt();

			wShippingInterrupt.setShippingInstHId(Long.parseLong(numberingLogic.getNumbering(WmsNumberingConst.SHIPPING_INST_H_ID)));

			// 引当指示ヘッダID
			wShippingInterrupt.setAllocInstHId(tPackingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getAllocInstHId());
			// 荷主
			wShippingInterrupt.setClientId(tPackingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getClientId());
			// センタ
			wShippingInterrupt.setCenterId(tPackingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getCenterId());
			// 担当者CD
			wShippingInterrupt.setUserCd(tPackingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getUpdUser());
			// 出庫作業No.
			wShippingInterrupt.setPickingWorkNo(tPackingHList.get(tAllocInstBList.indexOf(tAllocInstB)).getShippingPackingNo());
			// 指示数
			// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] Start
			//wShippingInterrupt.setUnitNum(tAllocInstB.getInstNum());
			wShippingInterrupt.setInstNum(tAllocInstB.getInstNum());
			// 20141011 SJA_ZHU 追加 [ON推-CT2-342対応] End
			// 検品済数
			wShippingInterrupt.setSpgQtyOns(tAllocInstB.getSpgQtyOns());
			// 検品残数
			wShippingInterrupt.setSpgQtyRemain(tAllocInstB.getSpgQtyRemain());
			// 商品ID
			wShippingInterrupt.setProductId(tAllocInstB.getProductId());

			wShippingInterrupt.setPieceNo(tAllocInstB.getShippingPackingNo());

			wShippingInterrupt.setBoxId(tAllocInstB.getBoxId());

			wShippingInterruptList.add(wShippingInterrupt);
		}

		// ===== 出荷検品中断の登録実行 =====
		wShippingInterruptBhv.batchInsert(wShippingInterruptList);

		// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品中断メッソドを呼出し =====
		shipStatusUpdateLogic.packingInspectInterrupt(tPackingHList,errSts);

	}
	// [C-CWMS-0051] 出荷梱包No．で検品の場合為追加処理 2015/12/02 NayZaw End
}
