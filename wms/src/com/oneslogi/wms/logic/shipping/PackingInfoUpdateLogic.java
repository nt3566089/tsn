/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.jboss.weld.exceptions.IllegalArgumentException;
import org.jboss.weld.exceptions.IllegalStateException;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;
import com.oneslogi.wms.core.logic.shipping.PackingCalculateLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * 梱包情報更新ジッククラス
 */
public class PackingInfoUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPickingHBhv tPickingHBhv;
	// [ver2.2.1][#1981] 出庫指示時の梱包数≠検品時梱包数の時、送り状出力フラグを初期化し荷札再出力の警告メッセージが表示されるよう修正 2017.08.15 miyabe Start
	@Inject
	private TPickingRBhv tPickingRBhv;
	// [ver2.2.1][#1981] 出庫指示時の梱包数≠検品時梱包数の時、送り状出力フラグを初期化し荷札再出力の警告メッセージが表示されるよう修正 2017.08.15 miyabe End
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [#2913] 容積・重量の計算を共通化(不要な変数MProductShapeBhvを削除) 2018.02.13 kawana
	// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
	@Inject
	private MBoxBhv mBoxBhv;
	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;
	// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

	// ===== 使用ロジック =====

	@Inject
	private NumberingCenterLogic numberingLogic;
	// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana Start
	@Inject
	private PackingUpdateSelectLogic selectLogic;
	@Inject
	private PackingCalculateLogic packingCalculateLogic;
	@Inject
	private ProductShapeCalcLogic productShapeCalcLogic;
	@Inject
	private StwListPrintLogic stwListPrintLogic;
	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
	// [#2287] 梱包明細修正後の検品フラグ不正を修正 2017.10.28 kawana Start
	@Inject
	private ShipStatusCheckLogic statusCheckLogic;
	// [#2287] 梱包明細修正後の検品フラグ不正を修正 2017.10.28 kawana End
	// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana Start
	@Inject
	private PickingMethodRecommendationCallLogic pickingMethodRecommendationCallLogic;
	// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana End

	// ===== 返却用変数・クラス =====

	/** 更新情報 */
	public static class UpdateInfo {
		/** 更新有無 */
		public boolean doUpdate = false;
		/** 梱包追加有無 */
		public boolean doAddPacking = false;
		/** 梱包削除有無 */
		public boolean doDeletePacking = false;
		/** 梱包個口数に変更あり */
		public boolean modifiedPackingHCount = false;
		/** 納品明細出力クリア有無(出荷実績訂正用) */
		public boolean doClearPackingOut = false;
		/** 送り状出力クリア有無 */
		public boolean doClearSlipOut = false;
		/** 送り状データ出力クリア有無 */
		public boolean doClearInvoiceCreate = false;
		/** 積込リスト出力クリア有無 */
		public boolean doClearStwOut = false;
		/** 荷札出力クリア有無 */
		public boolean doClearTagOut = false;
	}

	// ===== enum =====

	/** 出庫ボディの更新有無 */
	public enum DoUpdatePickingB {
		/** 出庫ボディを更新する */
		TRUE,
		/** 出庫ボディを更新しない */
		FALSE
	}

	/** 梱包データ更新結果 */
	public enum ResultUpdatePackingData {
		/** 梱包ヘッダを削除 */
		DELETE_PACKING_H,
		/** 梱包ヘッダを更新 */
		UPDATE_PACKING_H
	}

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana End

	// ===== 変数 =====

	//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
	public boolean isPieceShippingInspectProcess = false;
	//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End

	/**
	 * <h2>梱包情報を更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷指示ヘッダを検索して、更新する。
	 * 古い梱包ヘッダ、梱包ボディと梱包帳票のデータを削除する、
	 * 出荷梱包No.を採番後、梱包ヘッダ、梱包ボディと梱包帳票データを編集し、登録する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param tPackingBList 梱包ボディリスト：商品CD・荷材CD・荷材ID・梱包数・出庫ボディID・引当指示ボディID
	 * @param tShippingInstH 出荷指示ヘッダ：更新日時
	 * @param rowCount 出荷指示ヘッダ件数（排他用）
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateAll(TPickingH tPickingH, List<TPackingB> tPackingBList, TShippingInstH tShippingInstH, int rowCount, ErrorStatus errSts) {

		// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana

		BigDecimal totalPackingNum = WCC.ZERO;
		String boxCd = null;
		String boxId = null;
		int count = 0;

		// [#2913] 出荷データ排他チェックをメソッド化(リファクタリング) 2018.02.07 kawana Start
		List<TShippingInstH> sShipInstHeader = checkShippingInstHUpdate(tPickingH, tShippingInstH, rowCount, errSts);
		// [#2913] 出荷データ排他チェックをメソッド化(リファクタリング) 2018.02.07 kawana End

		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei

		// 出荷指示ヘッダ更新
		tShippingInstHBhv.batchUpdate(sShipInstHeader);

		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] End


		// ===== 梱包ボディ登録用データ取得 =====

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		// 処理対象テーブル
		cb.setupSelect_TPickingH();
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TAllocInstB().withMProduct();
		// 検索条件
		cb.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		cb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Mod Start
		if (isPieceShippingInspectProcess) {
			cb.query().existsTPackingBList(new SubQuery<TPackingBCB>(){
				@Override
				public void query(TPackingBCB arg0) {
					arg0.query().queryTPackingH().setMixedFlg_Equal_$1();//混載フラグは1:混載を指定
				}
			});
		}else {
			// [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe Start
			cb.orScopeQuery(new OrQuery<TPickingBCB>() {
				@Override
				public void query(TPickingBCB cb2) {
					cb2.query().queryTPickingH().setPickingStatus_Equal_$25();
					cb2.query().queryTPickingH().setPickingStatus_Equal_$35();
					cb2.query().queryTPickingH().setPickingStatus_Equal_$50();
				}
			});
			// [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe End
		}
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Mod End
		// 検索結果を出庫ボディリストにセット
		List<TPickingB> tPickingB = tPickingBBhv.selectList(cb);

		// ===== 登録前に梱包データの削除(delete使用) =====
		TPackingBCB cb1 = tPackingBBhv.newMyConditionBean();
		// 処理対象テーブル
		cb1.setupSelect_TPackingH();
		cb1.setupSelect_TPackingH().withTPickingH();
		cb1.setupSelect_TPackingH().withTPackingRAsOne();
		// 削除条件
		// [検査-118] センタIDと荷主IDの検索条件漏れ 2014.12.06 koseki Start
		cb1.query().queryTPackingH().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb1.query().queryTPackingH().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		// [検査-118] センタIDと荷主IDの検索条件漏れ 2014.12.06 koseki End
		cb1.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());

		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
		if (isPieceShippingInspectProcess) {
			cb1.query().queryTPackingH().setMixedFlg_Equal_$1();//混載フラグが1:混載
		}
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End

		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe Start
		int trackingNumberingUnit;
		if(sShipInstHeader.get(0).getMDeliveryCourse().getTrackingNumberingUnit() == null){
			trackingNumberingUnit = 0;
		} else {
			trackingNumberingUnit = Integer.parseInt(sShipInstHeader.get(0).getMDeliveryCourse().getTrackingNumberingUnit());
		}
		boolean packingBDelFlg = false;
		if(trackingNumberingUnit == 0 || trackingNumberingUnit == 1){
			packingBDelFlg = true;
		}

		List<TPackingB> deletePackingBList = tPackingBBhv.selectList(cb1);

		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe End

		// 検索結果より、梱包ボディの削除実行
		tPackingBBhv.batchDelete(deletePackingBList);

		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe Start
		//梱包ヘッダと梱包帳票の退避用リストを作成
		TPackingHCB deletePackingHCb1 = tPackingHBhv.newMyConditionBean();
		deletePackingHCb1.setupSelect_TPickingH();
		deletePackingHCb1.setupSelect_TPackingRAsOne();
		// [#5476][v3.1] 出荷検品時に退避リスト抽出の条件へ混在フラグ:1を追加 2018.10.19 tanaka Start
		if (isPieceShippingInspectProcess) {
			deletePackingHCb1.query().setMixedFlg_Equal_$1();
		}
		// [#5476][v3.1] 出荷検品時に退避リスト抽出の条件へ混在フラグ:1を追加 2018.10.19 tanaka End
		deletePackingHCb1.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		deletePackingHCb1.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		deletePackingHCb1.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		deletePackingHCb1.query().addOrderBy_ShippingPackingNo_Asc();
		List <TPackingH> deletePackingHList = tPackingHBhv.selectList(deletePackingHCb1);
		// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add Start
		boolean packingTagOutFlg = false;
		// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add Start
		List <TPackingR> deletePackingRList = new ArrayList <TPackingR> ();
		for(TPackingH delete : deletePackingHList) {
			if (delete.getTPackingRAsOne() != null) {
				deletePackingRList.add(delete.getTPackingRAsOne());
				// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add Start
				if (delete.getTPackingRAsOne().getTagOutFlgAsListOutFlg() == CDef.ListOutFlg.$1) {
					packingTagOutFlg = true;
				}
				// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add End
			}
		}
		// 検索結果より、梱包帳票の削除実行
		TPackingR deleteTPackingR = new TPackingR();
		for (TPackingB del : deletePackingBList) {
			if (del.chaseTPackingH().chaseTPackingRAsOne().getPackingHId() != null) {
				if (deleteTPackingR != del.chaseTPackingH().chaseTPackingRAsOne()) {
					deleteTPackingR = del.chaseTPackingH().chaseTPackingRAsOne();
					tPackingRBhv.delete(deleteTPackingR);
					deleteTPackingR = del.chaseTPackingH().chaseTPackingRAsOne();
				}
			}
		}
		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe End

		// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana Start
		// 検索結果より、梱包ヘッダの削除実行
		TPackingH deletePackingH = null;
		Set<Long> delPackingHIdSet = new HashSet<Long>();
		for (TPackingB del : deletePackingBList) {
			if (!delPackingHIdSet.contains(del.getPackingHId())) {

				// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana Start
				pickingMethodRecommendationCallLogic.packingDelete(del.getPackingHId());
				// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana End
				delPackingHIdSet.add(del.getPackingHId());
				tPackingHBhv.delete(del.getTPackingH());
				deletePackingH = del.getTPackingH();
			}
		}
		// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana End

		// [SK2-048] 出荷実績訂正する時、梱包ボディを削除してから、梱包ボディに紐つく梱包ヘッダと梱包帳票を残るので、削除するために、以下の処理を追加 2014.12.15 許 Start
		TPackingHCB deletePackingHCb2 = tPackingHBhv.newMyConditionBean();
		deletePackingHCb2.setupSelect_TPickingH();
		deletePackingHCb2.setupSelect_TPackingRAsOne();
		deletePackingHCb2.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		deletePackingHCb2.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		deletePackingHCb2.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		deletePackingHCb2.query().notExistsTPackingBList(new SubQuery<TPackingBCB>() {

			@Override
			public void query(TPackingBCB subCB) {
			}
		});

		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe Start
		// 検索結果より、梱包ヘッダの削除実行
		List<TPackingH> deletePackingHList2 = tPackingHBhv.selectList(deletePackingHCb2);
		if(deletePackingHList2.size() > 0 ){
			for(TPackingH delPackingH : deletePackingHList2){
				// 検索結果より、梱包帳票の削除実行
				TPackingR delPackingR = new TPackingR();
				if(delPackingH.chaseTPackingRAsOne().getPackingHId() != null) {
					delPackingR = delPackingH.chaseTPackingRAsOne();
					tPackingRBhv.delete(delPackingR);
					deleteTPackingR = delPackingR;
				// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe End
				}
				// 梱包ヘッダの削除実行
				tPackingHBhv.delete(delPackingH);
				// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana Start
				deletePackingH = delPackingH;
				// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana End
			}
		}
		// [SK2-048] 出荷実績訂正する時、梱包ボディを削除してから、梱包ボディに紐つく梱包ヘッダと梱包帳票を残るので、削除するために、以下の処理を追加 2014.12.15 許 End

		// ===== 梱包ヘッダ登録 =====
		count = 0;
		//[C-CWMS-0051] 1センターに対して商品荷姿マスタで複数のデータになるため、使用している荷姿IDで検索 2015.12.21 NayZaw Start

		//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL

		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時に貨物追跡番号が連番となるよう修正 2017.08.04 miyabe Start
		int tPackingHCount = 0;
		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時に貨物追跡番号が連番となるよう修正 2017.08.04 miyabe End

		// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana Start
		List<TPackingH> insertPackingHList = new ArrayList<TPackingH>();
		// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana End

		// SLSA対応ソースマージ対応 2018.03.08 kawana Start
		BigDecimal weight = null;
		// SLSA対応ソースマージ対応 2018.03.08 kawana End

		// 梱包ボディリストのデータ件数分繰返
		for (TPackingB body : tPackingBList) {
			count = count + 1;

			// SLSA対応ソースマージ対応 2018.03.08 kawana Start
			if (body.getWeight() != null) {
				weight = body.getWeight();
			}
			// SLSA対応ソースマージ対応 2018.03.08 kawana End

			// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana

			//[C-CWMS-0051] 1センターに対して商品荷姿マスタで複数のデータになるため、使用している荷姿IDで検索 2015.12.21 NayZaw End

			// 箱番号が前の行と不一致 梱包ヘッダに以下内容設定する
			if (body.getBoxCd().equals(boxCd) == false && count != 1) {
				TPackingH tPackingH = new TPackingH();
				tPackingH.setClientId(tPickingH.getClientId());
				tPackingH.setCenterId(tPickingH.getCenterId());
				tPackingH.setProcessTypeId(tPickingB.get(0).chaseTPickingH().getProcessTypeId());
				tPackingH.setAllocInstHId(tPickingB.get(0).chaseTPickingH().getAllocInstHId());
				tPackingH.setPickingHId(tPickingB.get(0).chaseTPickingH().getPickingHId());
				// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start
				tPackingH.setShippingPackingNo(numberingLogic.getNumbering(tPickingH.getCenterId(), WmsNumberingConst.SHIPPING_PACKING_NO));
				// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End
				tPackingH.setBoxId(Long.parseLong(boxId));
				// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
				tPackingH.setGrossWeight(weight);
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
				// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.22 kawana Start
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				tPackingH.setPackingStatusAsPackingStatus(getPackingStatus(tPickingH, tPickingH.getPickingStatusAsPickingStatus()));
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
				// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.22 kawana End

				//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
				tPackingH.setMixedFlg_$1();//混載フラグは1:混載を指定
				//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End

				// 梱包ヘッダの登録実行（変数.梱包数が０のデータは登録対象外）
				if (WCC.isZero(totalPackingNum)){
					if (count != tPackingBList.size()) {
						boxCd = body.getBoxCd();
						boxId = body.getBoxId();
						// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana
						totalPackingNum = WCC.add(totalPackingNum, body.getPackingNum());
						continue;
					}
				} else {

					// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana Start
					if (deletePackingH != null) {
						// 削除した梱包ヘッダの情報を引継
						tPackingH.setMultiPicFlg(deletePackingH.getMultiPicFlg());
						tPackingH.setCartNo(deletePackingH.getCartNo());
						tPackingH.setBucketColNo(deletePackingH.getBucketColNo());
						tPackingH.setBucketRowNo(deletePackingH.getBucketRowNo());
						tPackingH.setSeedingNo(deletePackingH.getSeedingNo());
						//「機能 #1981 の対応」ATK 2017/07/25 Start
						// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時に貨物追跡番号が連番となるよう修正 2017.08.04 miyabe Start

						// 「追跡番号採番単位が未選択or『1:出庫作業番号単位』」かつ「貨物追跡No.が非空欄」かつ「ループ数＜削除梱包ヘッダ数」（既存貨物追跡No採番）
						if (packingBDelFlg && deletePackingH.getCarrierTraceNum() != null && tPackingHCount < deletePackingHList.size()) {
							tPackingH.setCarrierTraceNum(deletePackingHList.get(0).getCarrierTraceNum());
						// 「追跡番号採番単位が『2:梱包単位』」かつ「貨物追跡No.が非空欄」かつ「ループ数＜削除梱包ヘッダ数」（既存貨物追跡No採番）
						} else if (!packingBDelFlg && deletePackingH.getCarrierTraceNum() != null && tPackingHCount < deletePackingHList.size()) {
							tPackingH.setCarrierTraceNum(deletePackingHList.get(tPackingHCount).getCarrierTraceNum());
						}
						tPackingHCount ++;
						// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時に貨物追跡番号が連番となるよう修正 2017.08.04 miyabe End

						//「機能 #1981 の対応」ATK 2017/07/25 End
					}
					// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana End
					tPackingHBhv.insert(tPackingH);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana Start
					insertPackingHList.add(tPackingH);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana End
					totalPackingNum = WCC.ZERO;
					// SLSA対応ソースマージ対応 2018.03.08 kawana Start
					weight = null;
					// SLSA対応ソースマージ対応 2018.03.08 kawana End
					// 梱包ボディリストの件数分繰り返し
					for (TPackingB body1 : tPackingBList) {
						if (body1.getBoxCd().equals(boxCd)) {
							//tPackingBList．箱番号＝箱番号場合、梱包ボディのエンティティの編集
							body1.setPackingHId(tPackingH.getPackingHId());
						}
					}
					TPackingR TPackingr1 = new TPackingR();
					TPackingr1.setPackingHId(tPackingH.getPackingHId());
					TPackingr1.setStwOutFlg_$0();
					tPackingRBhv.insert(TPackingr1);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana Start
					tPackingH.setTPackingRAsOne(TPackingr1);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana End
				}
			}
			// 最後行の場合、梱包ヘッダに以下内容設定する
			if (count == tPackingBList.size()) {
				boxCd = body.getBoxCd();
				boxId = body.getBoxId();

				// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana

				totalPackingNum = WCC.add(totalPackingNum, body.getPackingNum());
				TPackingH tPackingH = new TPackingH();
				tPackingH.setClientId(tPickingH.getClientId());
				tPackingH.setCenterId(tPickingH.getCenterId());
				tPackingH.setProcessTypeId(tPickingB.get(0).chaseTPickingH().getProcessTypeId());
				tPackingH.setAllocInstHId(tPickingB.get(0).chaseTPickingH().getAllocInstHId());
				tPackingH.setPickingHId(tPickingB.get(0).chaseTPickingH().getPickingHId());
				// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start
				tPackingH.setShippingPackingNo(numberingLogic.getNumbering(tPickingH.getCenterId(), WmsNumberingConst.SHIPPING_PACKING_NO));
				// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End
				tPackingH.setBoxId(Long.parseLong(boxId));
				// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
				tPackingH.setGrossWeight(weight);
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
				// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.22 kawana Start
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				tPackingH.setPackingStatusAsPackingStatus(getPackingStatus(tPickingH, tPickingH.getPickingStatusAsPickingStatus()));
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
				// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.22 kawana End

				//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
				tPackingH.setMixedFlg_$1();//混載フラグは1:混載を指定
				//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End

				// 梱包ヘッダの登録実行（変数.梱包数が０のデータは登録対象外）
				if (WCC.isZero(totalPackingNum)){
					continue;
				} else {
					// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana Start
					if (deletePackingH != null) {
						// 削除した梱包ヘッダの情報を引継
						tPackingH.setMultiPicFlg(deletePackingH.getMultiPicFlg());
						tPackingH.setCartNo(deletePackingH.getCartNo());
						tPackingH.setBucketColNo(deletePackingH.getBucketColNo());
						tPackingH.setBucketRowNo(deletePackingH.getBucketRowNo());
						tPackingH.setSeedingNo(deletePackingH.getSeedingNo());
						//「機能 #1981 の対応」ATK 2017/07/25 Start
						// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時に貨物追跡番号が連番となるよう修正 2017.08.04 miyabe Start

						// 「追跡番号採番単位が未選択or『1:出庫作業番号単位』」かつ「貨物追跡No.が非空欄」かつ「ループ数＜削除梱包ヘッダ数」（既存貨物追跡No採番）
						if (packingBDelFlg && deletePackingH.getCarrierTraceNum() != null && tPackingHCount < deletePackingHList.size()) {
							tPackingH.setCarrierTraceNum(deletePackingHList.get(0).getCarrierTraceNum());
						// 「追跡番号採番単位が『2:梱包単位』」かつ「貨物追跡No.が非空欄」かつ「ループ数＜削除梱包ヘッダ数」（既存貨物追跡No採番）
						} else if (!packingBDelFlg && deletePackingH.getCarrierTraceNum() != null && tPackingHCount < deletePackingHList.size()) {
							tPackingH.setCarrierTraceNum(deletePackingHList.get(tPackingHCount).getCarrierTraceNum());
						}
						tPackingHCount ++;
						// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時に貨物追跡番号が連番となるよう修正 2017.08.04 miyabe End
						//「機能 #1981 の対応」ATK 2017/07/25 End
					}
					// [ON推-品向-1168] 出荷検品解除用に削除前の種蒔きNo等を新規梱包ヘッダに設定 2016.07.05 kawana End
					tPackingHBhv.insert(tPackingH);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana Start
					insertPackingHList.add(tPackingH);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana End
					totalPackingNum = WCC.ZERO;
					// 梱包ボディリストの件数分繰り返し
					for (TPackingB body1 : tPackingBList) {
						if (body1.getBoxCd().equals(boxCd)) {
							//tPackingBList．箱番号＝箱番号場合、梱包ボディのエンティティの編集
							body1.setPackingHId(tPackingH.getPackingHId());
						}
					}
					TPackingR TPackingr1 = new TPackingR();
					TPackingr1.setPackingHId(tPackingH.getPackingHId());
					TPackingr1.setStwOutFlg_$0();
					tPackingRBhv.insert(TPackingr1);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana Start
					tPackingH.setTPackingRAsOne(TPackingr1);
					// [#2913] 容積・重量の計算を共通化 2018.02.13 kawana End
				}
			}
			// 上記取得したデータ設定する
			boxCd = body.getBoxCd();
			boxId = body.getBoxId();

			// [#2913] 容積・重量の計算を共通化(不要になった処理を削除) 2018.02.13 kawana

			totalPackingNum = WCC.add(totalPackingNum, body.getPackingNum());
		}

		// [#2287] 梱包明細修正後の検品フラグ不正を修正 2017.10.28 kawana Start

		// 削除した梱包ボディが全てピッキング済か
		boolean isCompletedPicking = statusCheckLogic.isCompletedPicking(deletePackingBList);
		// 削除した梱包ボディが全て検品済か
		boolean isCompletedInspection = statusCheckLogic.isCompletedInspection(deletePackingBList);

		// [#2287] 梱包明細修正後の検品フラグ不正を修正 2017.10.28 kawana End

		// ===== 梱包ボディ登録 =====
		// 梱包ボディリストのデータ件数分繰返梱包数
		for (TPackingB body : tPackingBList) {
			// 梱包ヘッダID、商品CD、梱包数の取得
			Long tPackingHId = body.getPackingHId();
			String productCd = body.getProductCd();
			totalPackingNum = body.getPackingNum();
			// 出庫ボディリストのデータ件数分繰返
			for (TPickingB body1 : tPickingB) {
				// 変数．梱包数が０場合、次のループへ
				if (WCC.isZero(totalPackingNum)) {
					break;
				}
				// 出庫ボディリスト．出庫数＝０場合、次のループへ
				if (WCC.isZero(body1.getPickingNum())) {
					continue;
				}
				TPackingB tPackingB = new TPackingB();
				// 商品CD＝出庫ボディリスト．商品CD場合、梱包ボディエンティティの編集
				if (productCd.equals(body1.chaseTAllocInstB().chaseMProduct().getProductCd())) {
					tPackingB.setPackingHId(tPackingHId);
					tPackingB.setPickingBId(body1.getPickingBId());
					tPackingB.setAllocInstBId(body1.getAllocInstBId());
					// 変数．梱包数＞出庫数場合、出庫数を設定する。以外場合、変数．梱包数を設定する
					if (WCC.isGreaterThan(totalPackingNum, body1.getPickingNum())) {
						tPackingB.setPackingNum(body1.getPickingNum());
					} else {
						tPackingB.setPackingNum(totalPackingNum);
					}

					// [#2287] 梱包明細修正後の検品フラグ不正を修正 2017.10.28 kawana Start

					// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
					if (isCompletedPicking) {
						// 削除前は全てのピッキング済

						tPackingB.setPickingFlg_$1();
					} else {

						tPackingB.setPickingFlg_$0();
					}

					if (isCompletedInspection) {
						// 削除前は全て検品済

						tPackingB.setInspectionFlg_$1();
					} else {

						tPackingB.setInspectionFlg_$0();
					}
					// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

					// [#2287] 梱包明細修正後の検品フラグ不正を修正 2017.10.28 kawana End

					// 梱包ボディの登録実行
					tPackingBBhv.insert(tPackingB);
					// 変数．梱包数＞＝出庫数場合、出庫ボディリストのデータを編集する
					if (WCC.isPositive(WCC.subtract(body1.getPickingNum(), totalPackingNum))) {
						body1.setPickingNum(WCC.subtract(body1.getPickingNum(), totalPackingNum));
					} else {
						body1.setPickingNum(WCC.ZERO);
					}
					//tPickingBBhv.update(body1);
					// 変数．梱包数＝変数．梱包数－の梱包ボディ．梱包数
					totalPackingNum = WCC.subtract(totalPackingNum, tPackingB.getPackingNum());
				}
			}
		}

		// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため処理削除 2018.02.07 kawana

		// [#2913] 容積・重量の計算を共通化 2018.02.20 kawana Start

		for (TPackingH insertPackingH : insertPackingHList) {

			// SLSA対応ソースマージ対応 2018.03.08 kawana Start
			if (insertPackingH.getGrossWeight() != null) {
				// 重量入力済
				continue;
			}
			// SLSA対応ソースマージ対応 2018.03.08 kawana End

			// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
			// 梱包ヘッダの重量・容積の更新
			updatePackingData(insertPackingH, errSts);
			// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
			if (0 < getErrorManager().size()) {
				return;
			}
		}

		// [#2913] 容積・重量の計算を共通化 2018.02.20 kawana End

		// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Mod Start
		// [ver2.2.1][#1981] 出庫指示時の梱包数≠検品時梱包数の時、送り状出力フラグを初期化し荷札再出力の警告メッセージが表示されるよう修正 2017.08.15 miyabe Start
		if (deletePackingHList.size() != tPackingHCount && tPickingH.getPickingHId() != null && packingTagOutFlg) {
			//送り状出力フラグの初期化
			TPickingR updatedTPickingR = tPickingRBhv.selectByPKValue(tPickingH.getPickingHId());
			updatedTPickingR.setSlipOutDt(null);
			updatedTPickingR.setSlipOutFlg_$0();
			updatedTPickingR.setSlipOutUserId(null);
			updatedTPickingR.setInvoiceCreateDt(null);
			updatedTPickingR.setInvoiceCreateFlg_$0();
			updatedTPickingR.setInvoiceIssueNum(null);
			tPickingRBhv.update(updatedTPickingR);
			// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add Start
			// 出荷作業Noで取得可能な[荷主・センタ・出荷日・配送コース]に紐付くデータの[梱包帳票．積込系]の情報をクリア
			TPackingR updatedTPackingR = new TPackingR();
			updatedTPackingR.setStwOutFlg_$0();
			updatedTPackingR.setStwOutUserId(null);
			updatedTPackingR.setStwOutDt(null);
			// [#6553][v3.1] 致命的エラー対応 2019.06.28 kawana Start
			TAllocInstH allocInstH = tAllocInstHBhv.selectByPKValue(tPickingH.getAllocInstHId());
			// [#6553][v3.1] 致命的エラー対応 2019.06.28 kawana End
			TPackingRCB tPackingRCB = tPackingRBhv.newMyConditionBean();
			tPackingRCB.setupSelect_TPackingH().withTAllocInstH();
			tPackingRCB.query().queryTPackingH().queryTAllocInstH().setClientId_Equal(allocInstH.getClientId());
			tPackingRCB.query().queryTPackingH().queryTAllocInstH().setCenterId_Equal(allocInstH.getCenterId());
			tPackingRCB.query().queryTPackingH().queryTAllocInstH().setShippingDt_Equal(allocInstH.getShippingDt());
			tPackingRCB.query().queryTPackingH().queryTAllocInstH().setDeliveryCourseId_Equal(allocInstH.getDeliveryCourseId());
			tPackingRBhv.queryUpdate(updatedTPackingR, tPackingRCB);
			// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add End
			//荷札再出力警告メッセージの設定
			this.getWarnManager().add(warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()),
				WmsMessageConst.SHIPPING_INSPECTION_COMPLETE_TAG_LABEL_REISSUE_INFORMATION);
		}
		// [ver2.2.1][#1981] 出庫指示時の梱包数≠検品時梱包数の時、送り状出力フラグを初期化し荷札再出力の警告メッセージが表示されるよう修正 2017.08.15 miyabe
		// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Mod End
	}

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start

	/**
	 * <h2>出荷指示ヘッダの排他チェック.</h2>
	 * <pre>
	 * 引数の更新日時で出荷指示ヘッダを検索して取得件数が一致するかの排他チェックを行う。
	 * 排他エラーの場合は、エラー管理クラスにエラーを登録する。
	 *
	 * 検索した出荷指示ヘッダのリストを返却する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param tShippingInstH 出荷指示ヘッダ：更新日時
	 * @param rowCount 出荷指示ヘッダ件数（排他用）
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 検索した出荷指示ヘッダのリスト
	 */
	public List<TShippingInstH> checkShippingInstHUpdate(TPickingH tPickingH, TShippingInstH tShippingInstH, int rowCount, ErrorStatus errSts) {

		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] Start
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		// エンティティ編集(更新用データ編集)
		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe Start
		cb.setupSelect_MDeliveryCourse();
		// [ver2.2.1][#1981] 追跡番号採番単位「2:梱包単位」時は荷札出力フラグを保持するよう修正 2017.08.03 miyabe End
		// [検査-118] センタIDと荷主IDの検索条件漏れ 2014.12.06 koseki Start
		cb.query().queryTAllocInstH().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTAllocInstH().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		// [検査-118] センタIDと荷主IDの検索条件漏れ 2014.12.06 koseki End
		cb.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());

		// [ON推-CT4-256] 排他処理変更対応追加 2014.11.21 kei Start
		cb.query().setUpdDt_LessEqual(tShippingInstH.getUpdDt());
		// [ON推-CT4-256] 排他処理変更対応追加 2014.11.21 kei End

		List<TShippingInstH> shippingInstHList = tShippingInstHBhv.selectList(cb);

		// [ON推-CT4-256] 排他処理変更対応追加 2014.11.21 kei Start
		if (shippingInstHList.size() != rowCount) {
			getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		// [ON推-CT4-256] 排他処理変更対応追加 2014.11.21 kei End
		return shippingInstHList;
	}

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.22 kawana Start

	/**
	 * <h2>梱包ステータスの取得</h2>
	 * <pre>
	 * 出庫ステータスから梱包ステータスを取得する。
	 *
	 * </pre>
	 * @param pickingStatus 出庫ステータス
	 * @return 梱包ステータス
	 */
	private CDef.PackingStatus getPackingStatus(TPickingH tPickingH, CDef.PickingStatus pickingStatus) {

		// [#1163] 梱包明細修正で致命的エラー 2017.03.13 kawana Start
		if (pickingStatus == null) {
			TPickingHCB cb = tPickingHBhv.newMyConditionBean();
			cb.query().setCenterId_Equal(tPickingH.getCenterId());
			cb.query().setClientId_Equal(tPickingH.getClientId());
			cb.query().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
			TPickingH updatedtPickingH = tPickingHBhv.selectEntity(cb);
			pickingStatus = updatedtPickingH.getPickingStatusAsPickingStatus();
		}
		// [#1163] 梱包明細修正で致命的エラー 2017.03.13 kawana End

		switch (pickingStatus) {
		// [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe Start
		case $10:
			return CDef.PackingStatus.$10;
		case $15:
			return CDef.PackingStatus.$15;
		case $20:
			return CDef.PackingStatus.$20;
		case $25:
			return CDef.PackingStatus.$25;
		case $30:
			return CDef.PackingStatus.$30;
		case $35:
			return CDef.PackingStatus.$35;
		case $40:
			return CDef.PackingStatus.$40;
		case $45:
			return CDef.PackingStatus.$45;
		case $50:
			return CDef.PackingStatus.$50;
		case $55:
			return CDef.PackingStatus.$55;
		case $90:
			return CDef.PackingStatus.$90;
		case $99:
			return CDef.PackingStatus.$99;
		}
		return null;
		// [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe End
	}

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.22 kawana End

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana Start

	/**
	 * <h2>梱包情報の更新.</h2>
	 * <pre>
	 * 次の手順で梱包情報を更新する。
	 *
	 * [1] 変更前の梱包情報の検索
	 *
	 * [2] 引数の梱包情報と比較し、比較結果により処理を行う。
	 *
	 * [2-1] 削除された梱包は
	 *     梱包ヘッダ、梱包帳票、梱包ボディの削除
	 *
	 * [2-2] 梱包数、荷材IDが変更されている梱包は
	 *     梱包ボディの全削除、梱包ボディを新規追加、梱包ヘッダの更新
	 *     (ケースピック情報のクリア、積込フラグのクリア、総重量・総容積の更新)
	 *
	 * [2-3] 追加された梱包は
	 *      梱包ヘッダ、梱包帳票、梱包ボディを追加 (混載フラグは混載)
	 *
	 * [3] [2]で梱包の削除・追加がある場合、同じ出庫作業No.のデータに対して次の処理を行う。
	 * ・荷札出力をクリア ※貨物追跡番号採番単位が「梱包単位」の場合は変更しない
	 *
	 * [4] [2]で梱包の削除・追加があり梱包個口数が変わる場合、同じ出庫作業No.のデータに対して次の処理を行う。
	 * ・送り状出力をクリア
	 * ・送り状データ出力をクリア
	 * ・積込リスト出力をクリア(同じセンタ、荷主、配送コース、出荷日のものは全て)
	 *
	 * </pre>
	 *
	 * @param tPickingH 出庫ヘッダ:センタID・荷主ID・出庫作業No
	 * @param tAllocInstH 引当指示ヘッダ:引当指示ヘッダID
	 * @param inputPackingUpdateList 梱包情報：梱包ヘッダID・荷材No・荷材ID・商品ID・梱包総数
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return UpdateInfo 梱包情報の更新結果
	 */
	public UpdateInfo update(TPickingH tPickingH, TAllocInstH tAllocInstH, List<SqlPackingListUpdate> inputPackingUpdateList, ErrorStatus errSts) {

		// ===== 差分の抜出 =====

		// 変更前の情報をDBから検索
		List<SqlPackingListUpdate> dbPackingUpdateList = selectLogic.select(tPickingH, new PagingData(), errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 差分を探しやすいようにDB値をマップに詰替
		Map<Long, Map<Long, SqlPackingListUpdate>> dbEntityMap = new HashMap<Long, Map<Long, SqlPackingListUpdate>>();
		for (SqlPackingListUpdate dbPackingUpdate : dbPackingUpdateList) {

			// 箱単位
			long packingHId = dbPackingUpdate.getPackingHId();
			Map<Long, SqlPackingListUpdate> productMap;
			if (dbEntityMap.containsKey(packingHId)) {
				productMap = dbEntityMap.get(packingHId);
			} else {
				productMap = new HashMap<Long, SqlPackingListUpdate>();
				dbEntityMap.put(packingHId, productMap);
			}

			// 商品単位
			long productId = dbPackingUpdate.getProductId();
			// ※複数存在することはSQL上ありえない
			if (productMap.containsKey(productId)) {
				getErrorManager().throwException(new IllegalStateException("Entity(SqlPackingListUpdate) is duplicate.(key:packingHId, productId)"));
			}
			productMap.put(productId, dbPackingUpdate);
		}

		// 新規に追加された情報 (キー：梱包番号)
		Map<String, List<SqlPackingListUpdate>> newEntityMap = new TreeMap<String, List<SqlPackingListUpdate>>(); // 自動テストでDB登録順が毎回同じになるようにTreeMap使用

		// 差分を探しやすいように入力値をマップに詰替
		Map<Long, Map<Long, SqlPackingListUpdate>> inputEntityMap = new HashMap<Long, Map<Long, SqlPackingListUpdate>>();
		for (SqlPackingListUpdate inputPackingUpdate : inputPackingUpdateList) {
			// キーの取出し

			if (inputPackingUpdate.getPackingHId() == null) {
				// 新規の梱包

				// [#5420][v3.1] 追加した箱を梱包数を0個にすると致命的エラー発生 2018.10.19 kawana Start
				if (WCC.isPositive(inputPackingUpdate.getPackingNumSum())) {
					// 投入数あり

					putNewEntity(newEntityMap, inputPackingUpdate);
				}
				// [#5420][v3.1] 追加した箱を梱包数を0個にすると致命的エラー発生 2018.10.19 kawana End

				continue;
			}

			// 箱単位
			long packingHId = inputPackingUpdate.getPackingHId();
			Map<Long, SqlPackingListUpdate> productMap;
			if (inputEntityMap.containsKey(packingHId)) {
				productMap = inputEntityMap.get(packingHId);
			} else {
				productMap = new TreeMap<Long, SqlPackingListUpdate>(); // 自動テストでDB登録順が毎回同じになるようにTreeMap使用
				inputEntityMap.put(packingHId, productMap);
			}

			// 商品単位
			long productId = inputPackingUpdate.getProductId();

			if (productMap.containsKey(productId)) {
				// どちらかが新規入力

				SqlPackingListUpdate oldEntity = productMap.get(productId);

				// 「荷材No.」が大きい方が新規と判定
				if (0 < CU.nullToStr(oldEntity.getBoxNo()).compareTo(inputPackingUpdate.getBoxNo())) {
					// oldEntityのBoxNoが大きい ⇒ 既にマップに入っている方が新規

					putNewEntity(newEntityMap, oldEntity);
					productMap.put(productId, inputPackingUpdate);

				} else {
					// inputPackingUpdateのBoxNoが大きい ⇒ 現在のentityが新規

					putNewEntity(newEntityMap, inputPackingUpdate);
				}
			} else {
				productMap.put(productId, inputPackingUpdate);
			}
		}

		Map<Long, List<SqlPackingListUpdate>> changeInputEntityMap = new TreeMap<Long, List<SqlPackingListUpdate>>(); // 自動テストでDB登録順が毎回同じになるようにTreeMap使用
		List<Long> deletePackingHIdList = new ArrayList<Long>();

		// 差分確認
		for (Map.Entry<Long, Map<Long, SqlPackingListUpdate>> dbEntityEntry : dbEntityMap.entrySet()) {
			long packingHId = dbEntityEntry.getKey();

			Map<Long, SqlPackingListUpdate> dbProductMap = dbEntityEntry.getValue();
			Map<Long, SqlPackingListUpdate> inputProductMap = inputEntityMap.get(packingHId);
			if (inputProductMap == null) {
				// 入力値にない ⇒ 削除されていると判定
				deletePackingHIdList.add(packingHId);
				continue;
			}

			// チェック済の箱は消す
			inputEntityMap.remove(packingHId);

			// 商品種類数のチェック
			if (dbProductMap.keySet().size() != inputProductMap.keySet().size()) {
				// 梱包の中身が変わっている
				changeInputEntityMap.put(packingHId, new ArrayList<SqlPackingListUpdate>(inputProductMap.values()));
				continue;
			}

			for (Map.Entry<Long, SqlPackingListUpdate> dbProductEntry : dbProductMap.entrySet()) {
				long productId = dbProductEntry.getKey();
				SqlPackingListUpdate dbEntity = dbProductEntry.getValue();
				SqlPackingListUpdate inputEntity = inputProductMap.get(productId);
				if (inputEntity == null) {
					// 商品が変わっている (全置換)
					changeInputEntityMap.put(packingHId, new ArrayList<SqlPackingListUpdate>(inputProductMap.values()));
					break;
				}

				if (isChangeEntity(dbEntity, inputEntity)) {
					// 1個でも変わってたら梱包の作り直し

					// 変更マップに追加
					changeInputEntityMap.put(packingHId, new ArrayList<SqlPackingListUpdate>(inputProductMap.values()));
					break;
				}
			}
		}

		// チェックされなかった梱包は新規登録
		for (Map<Long, SqlPackingListUpdate> inputProductMap : inputEntityMap.values()) {

			for (SqlPackingListUpdate entity : inputProductMap.values()) {
				putNewEntity(newEntityMap, entity);
			}
		}

		// ===== 変更前情報の保持 =====

		// 梱包の変更前に現在の出庫フラグ、検品フラグの状態を取得 (出庫作業No.単位)

		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start

		final TPickingH dbPickingH = selectPickingHByPickingWorkNo(tPickingH.getCenterId(), tPickingH.getPickingWorkNo());
		final long pickingHId = dbPickingH.getPickingHId();

		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End

		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start

		MParam param = null;
		PickingFlgInfo pickingFlgInfo = null;
		if (!changeInputEntityMap.isEmpty() || !newEntityMap.isEmpty()) {

			// パラメータマスタ検索
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(tPickingH.getClientId());
			mClientCenter.setCenterId(tPickingH.getCenterId());
			param = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

			// 出庫フラグ・検品フラグの状態を取得
			pickingFlgInfo = getPickingFlgInfo(pickingHId, param);
		}

		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

		// ===== 梱包の削除 =====

		// 更新結果クラス (返却用)
		UpdateInfo updateInfo = new UpdateInfo();

		// ※ 貨物追跡番号等の必要な情報を残す必要があるため、梱包ヘッダは使いまわす

		// 削除した商品ID、出庫ボディID、梱包数を退避 (追加する時に使う)
		Map<Long, Map<Long, PackingNumInfo>> deletePackingNumMap = new HashMap<Long, Map<Long, PackingNumInfo>>();

		int deleteCount = 0;

		// 箱の削除あり
		if (!deletePackingHIdList.isEmpty()) {

			updateInfo.doUpdate = true;
			updateInfo.doDeletePacking = true;
			updateInfo.doClearTagOut = true; // 後続処理で荷札が梱包単位かを判定

			deleteCount = deletePackingHIdList.size();
		}

		for (long deletePackingHId : deletePackingHIdList) {

			// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana Start
			// ピッキング提案データ削除
			pickingMethodRecommendationCallLogic.packingDelete(deletePackingHId);
			// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana End

			// 梱包ボディ削除
			{
				TPackingBCB cb = tPackingBBhv.newMyConditionBean();
				cb.setupSelect_TAllocInstB();
				cb.query().setPackingHId_Equal(deletePackingHId);
				List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

				for (TPackingB packingB : packingBList) {
					// 削除した商品ID、出庫ボディID、梱包数を退避 (追加する時に使う)
					addPackingNumMap(deletePackingNumMap, packingB);
				}

				tPackingBBhv.batchDelete(packingBList);
			}
			// 梱包帳票削除
			{
				TPackingRCB cb = tPackingRBhv.newMyConditionBean();
				cb.query().setPackingHId_Equal(deletePackingHId);
				tPackingRBhv.queryDelete(cb);
			}
			// 梱包ヘッダ削除
			{
				TPackingHCB cb = tPackingHBhv.newMyConditionBean();
				cb.query().setPackingHId_Equal(deletePackingHId);
				tPackingHBhv.queryDelete(cb);
			}
		}

		// ===== 梱包の変更 =====

		// 変更分の梱包ボディを削除
		for (long changePackingHId : changeInputEntityMap.keySet()) {

			TPackingBCB cb = tPackingBBhv.newMyConditionBean();
			cb.setupSelect_TAllocInstB();
			cb.query().setPackingHId_Equal(changePackingHId);
			List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

			for (TPackingB packingB : packingBList) {
				// 削除した商品ID、出庫ボディID、梱包数を退避 (追加する時に使う)
				addPackingNumMap(deletePackingNumMap, packingB);
			}

			tPackingBBhv.batchDelete(packingBList);
		}

		// 変更分の梱包ボディを新規追加

		List<TPackingB> insertPackingBList = new ArrayList<TPackingB>();
		Map<Long, Long> boxIdMap = new HashMap<Long, Long>();

		for (Map.Entry<Long, List<SqlPackingListUpdate>> inputEntityEntry : changeInputEntityMap.entrySet()) {
			long packingHId = inputEntityEntry.getKey();

			List<SqlPackingListUpdate> inputEntityList = inputEntityEntry.getValue();

			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana Start
			// 変更後の荷材IDを退避
			Long boxId = getInputBoxId(inputEntityList);
			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana End
			boxIdMap.put(packingHId, boxId);

			for (SqlPackingListUpdate inputEntity : inputEntityList) {

				// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana Start

				// 梱包数
				BigDecimal inputPackingNum = inputEntity.getPackingNumSum();

				if (WCC.isZero(inputPackingNum)) {
					// 梱包なし ==> 次の入力行へ
					continue;
				}

				// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana End

				if (!equals(boxId, inputEntity.getBoxId())) {

					getErrorManager().throwException(new IllegalArgumentException("input boxCd does not match in same boxNo."));
				}

				long productId = inputEntity.getProductId();

				// 削除した出庫ボディID、梱包数とつきあわせて梱包ボディを新規作成

				Map<Long, PackingNumInfo> packingNumInfoMap = deletePackingNumMap.get(productId);
				for (Map.Entry<Long, PackingNumInfo> packingInfoEntry : packingNumInfoMap.entrySet()) {

					if (WCC.isZero(inputPackingNum)) {
						// 梱包数が0 ⇒ 梱包数分の梱包ボディ作成済
						break;
					}

					// 出庫ボディID毎の梱包数を取得
					long pickingBId = packingInfoEntry.getKey();
					PackingNumInfo packingInfo = packingInfoEntry.getValue();
					BigDecimal deletePackingNum = packingInfo.getPackingNum();

					if (WCC.isZero(deletePackingNum)) {
						// 全て梱包済
						continue;
					}

					long allocInstBId = packingInfo.getAllocInstBId();

					// 梱包ボディの梱包数を決定
					BigDecimal newPackingNum;
					if (WCC.isLessEqual(deletePackingNum, inputPackingNum)) {
						// deletePackingNumが小さい

						newPackingNum = deletePackingNum;
					} else {
						newPackingNum = inputPackingNum;
					}

					// 梱包ボディ作成
					TPackingB packingB = new TPackingB();
					packingB.setPackingHId(packingHId);
					packingB.setPickingBId(pickingBId);
					packingB.setAllocInstBId(allocInstBId);
					packingB.setPackingNum(newPackingNum);

					// 出庫フラグ・検品フラグの設定
					setPackingBFlg(packingB, pickingFlgInfo);

					// 登録リストに追加
					insertPackingBList.add(packingB);

					// 出庫ボディID毎の梱包数、新規作成分の梱包数を減らす
					packingInfo.subtract(newPackingNum);
					inputPackingNum = WCC.subtract(inputPackingNum, newPackingNum);
				}

				if (!WCC.isZero(inputPackingNum)) {
					// 出庫ボディID毎の梱包数が不足していて梱包数が残ってしまった ⇒ 致命的エラー
					getErrorManager().throwException(new IllegalStateException("packingNum is shortage."));
				}
			}
		}

		// 梱包ボディ登録
		if (!insertPackingBList.isEmpty()) {
			tPackingBBhv.batchInsert(insertPackingBList);
		}

		// 梱包ヘッダ更新
		if (!changeInputEntityMap.isEmpty()) {

			// 変更あり
			updateInfo.doUpdate = true;

			// 対象の梱包ヘッダを検索
			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.setupSelect_TPackingRAsOne();
			cb.checkInvalidQuery();
			cb.query().setPackingHId_InScope(changeInputEntityMap.keySet());
			cb.addOrderBy_PK_Asc();

			List<TPackingH> dbPackingHList = tPackingHBhv.selectList(cb);

			for (TPackingH packingH : dbPackingHList) {

				Long boxId = boxIdMap.get(packingH.getPackingHId());
				// 荷材の変更
				packingH.setBoxId(boxId);

				// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
				// 梱包ヘッダの更新 (容積、重量、混載フラグ)
				ResultUpdatePackingData result = updatePackingData(packingH, pickingFlgInfo, param, DoUpdatePickingB.FALSE, errSts);
				// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
				if (0 < getErrorManager().size()) {
					return null;
				}

				if (result == ResultUpdatePackingData.DELETE_PACKING_H) {
					// 梱包削除

					updateInfo.doDeletePacking = true;
					updateInfo.doClearTagOut = true; // 後続処理で荷札が梱包単位かを判定

					deleteCount++;
				}
			}
		}

		// ===== 梱包の追加 =====

		int addCount = 0;

		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
		Integer seedingNo = null;
		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
		if (!newEntityMap.isEmpty()) {

			updateInfo.doUpdate = true;
			updateInfo.doClearTagOut = true; // 後続処理で荷札が梱包単位かを判定

			addCount = newEntityMap.size();

			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
			// 現在の種蒔きNo.を検索
			seedingNo = selectSeedingNo(dbPickingH);
			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
		}

		for (List<SqlPackingListUpdate> newEntityList : newEntityMap.values()) {
			// 新規箱登録

			List<TPickingB> newPickingBList = new ArrayList<TPickingB>();

			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana Start
			Long boxId = getInputBoxId(newEntityList);
			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana End

			for (SqlPackingListUpdate newEntity : newEntityList) {

				// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana Start

				// 梱包数
				BigDecimal inputPackingNum = newEntity.getPackingNumSum();

				if (WCC.isZero(inputPackingNum)) {
					// 梱包なし ==> 次の入力行へ
					continue;
				}

				// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana End

				if (!equals(boxId, newEntity.getBoxId())) {

					getErrorManager().throwException(new IllegalArgumentException("input boxCd does not match in same boxNo."));
				}

				long productId = newEntity.getProductId();

				// 削除した出庫ボディID、梱包数とつきあわせて出庫ボディを新規作成

				Map<Long, PackingNumInfo> packingNumInfoMap = deletePackingNumMap.get(productId);
				for (Map.Entry<Long, PackingNumInfo> packingInfoEntry : packingNumInfoMap.entrySet()) {

					if (WCC.isZero(inputPackingNum)) {
						// 梱包数が0 ⇒ 梱包数分の梱包ボディ作成済
						break;
					}

					// 出庫ボディID毎の梱包数を取得
					long pickingBId = packingInfoEntry.getKey();
					PackingNumInfo packingInfo = packingInfoEntry.getValue();
					BigDecimal deletePackingNum = packingInfo.getPackingNum();

					if (WCC.isZero(deletePackingNum)) {
						// 全て梱包済
						continue;
					}

					// 梱包ボディの梱包数を決定
					BigDecimal newPackingNum;
					if (WCC.isLessEqual(deletePackingNum, inputPackingNum)) {
						// deletePackingNumが小さい

						newPackingNum = deletePackingNum;
					} else {
						newPackingNum = inputPackingNum;
					}

					// 出庫ボディ作成(取得)・追加
					TPickingB pickingB = selectPickingBforNewPacking(pickingBId);
					pickingB.setPickingNum(newPackingNum);

					newPickingBList.add(pickingB);

					// 出庫ボディID毎の梱包数、新規作成分の梱包数を減らす
					packingInfo.subtract(newPackingNum);
					inputPackingNum = WCC.subtract(inputPackingNum, newPackingNum);
				}

				if (!WCC.isZero(inputPackingNum)) {
					// 出庫ボディID毎の梱包数が不足していて梱包数が残ってしまった ⇒ 致命的エラー
					getErrorManager().throwException(new IllegalStateException("packingNum is shortage."));
				}
			}

			// 梱包計算なしで梱包データを作成して登録
			MBox box = null;
			if (boxId != null) {
				box = mBoxBhv.selectByPKValue(boxId);
			}
			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
			if (seedingNo != null) {
				seedingNo++;
			}
			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
			registerNewPackingData(newPickingBList, box, seedingNo, pickingFlgInfo, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// ===== 帳票出力状態の更新 =====

		if (deleteCount != addCount) {
			// 個口数に変更あり

			updateInfo.modifiedPackingHCount = true;
			updateInfo.doClearSlipOut = true;
			updateInfo.doClearInvoiceCreate = true;
			updateInfo.doClearStwOut = true;
		}

		TAllocInstH allocInstH = tAllocInstHBhv.selectByPKValue(tAllocInstH.getAllocInstHId());

		// 帳票の出力フラグを更新
		clearOutFlgWithTrackingNumberingUnitCheck(pickingHId, updateInfo, allocInstH, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		return updateInfo;
	}

	/**
	 * <h2>届先情報の更新.</h2>
	 * <pre>
	 * 引数の届先情報に引当指示ヘッダを更新する。
	 * 荷札、送り状、送り状データ出力、積込リストの発行状態をクリアする。
	 * </pre>
	 *
	 * @param tAllocInstH 引当指示ヘッダ：引当指示ヘッダID・納品指定日・納品時間帯・届先郵便番号・届先電話番号・届先住所１・届先住所２・届先住所３・届先名称・バージョンNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateDeliveryInfo(TPickingH tPickingH, TAllocInstH tAllocInstH, ErrorStatus errSts) {

		TAllocInstH allocInstH = tAllocInstHBhv.selectByPKValue(tAllocInstH.getAllocInstHId());

		// エンティティの編集
		allocInstH.setDelivCustomerId(null);
		allocInstH.setDelivDt(tAllocInstH.getDelivDt());
		allocInstH.setDelivTz(tAllocInstH.getDelivTz());
		allocInstH.setDelivZipCd(tAllocInstH.getDelivZipCd());
		allocInstH.setDelivTelNo(tAllocInstH.getDelivTelNo());
		allocInstH.setDelivAddress1(tAllocInstH.getDelivAddress1());
		allocInstH.setDelivAddress2(tAllocInstH.getDelivAddress2());
		allocInstH.setDelivAddress3(tAllocInstH.getDelivAddress3());
		allocInstH.setDelivCustomerNm(tAllocInstH.getDelivCustomerNm());
		allocInstH.setVersionNo(tAllocInstH.getVersionNo());

		// 引当指示ヘッダの更新実行
		tAllocInstHBhv.update(allocInstH);

		// 帳票の出力情報クリア
		clearOutFlgDeliveryInfo(tPickingH.getCenterId(), tPickingH.getPickingWorkNo(), allocInstH, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * マップに追加
	 */
	private void putNewEntity(Map<String, List<SqlPackingListUpdate>> newEntityMap, SqlPackingListUpdate newEntity) {

		String boxNo = CU.nullToStr(newEntity.getBoxNo());

		if (newEntityMap.containsKey(boxNo)) {
			newEntityMap.get(boxNo).add(newEntity);
		} else {
			List<SqlPackingListUpdate> entityList = new ArrayList<SqlPackingListUpdate>();
			entityList.add(newEntity);
			newEntityMap.put(boxNo, entityList);
		}
	}

	/**
	 * 箱情報が変わっているか
	 */
	private boolean isChangeEntity(SqlPackingListUpdate dbEntity, SqlPackingListUpdate inputEntity) {

		// 荷材CD
		if (!CU.nullToStr(dbEntity.getBoxCd()).equals(CU.nullToStr(inputEntity.getBoxCd()))) {
			return true;
		}

		// 梱包数
		if (!WCC.isEqual(CU.nullToZero(dbEntity.getPackingNumSum()), CU.nullToZero(inputEntity.getPackingNumSum()))) {
			return true;
		}

		return false;
	}

	/**
	 * 出庫ヘッダIDの取得
	 */
	private TPickingH selectPickingHByPickingWorkNo(long centerId, String pickingWorkNo) {

		TPickingHCB cb = tPickingHBhv.newMyConditionBean();

		cb.specify().columnPickingHId();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setPickingWorkNo_Equal(pickingWorkNo);

		TPickingH pickingH = tPickingHBhv.selectEntity(cb);

		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
		return pickingH;
		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
	}

	/**
	 * <h2>出庫フラグ・検品フラグ情報取得.</h2>
	 * <pre>
	 * 同じ出庫ヘッダに紐づく全ての梱包ボディが
	 * 出庫済か、検品済かを設定した出庫フラグ情報クラスを返却する。
	 *
	 * (引数の出庫ヘッダIDを条件に出庫ボディを検索)
	 *
	 * </pre>
	 * @param pickingHId 出庫ヘッダID
	 * @param param パラメータマスタ
	 * @return 全て出庫済か、全て検品済かを設定した出庫フラグ情報クラス
	 */
	public PickingFlgInfo getPickingFlgInfo(long pickingHId, MParam param) {

		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
		// 出庫作業No.を条件に梱包ボディリストを取得
		List<TPackingB> dbPackingBList = selectPackingBListOnlyPickingFlg(pickingHId, param);
		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

		PickingFlgInfo flgInfo = new PickingFlgInfo();

		// 全てピッキング済か
		flgInfo.isAllCompletedPicking = statusCheckLogic.isCompletedPicking(dbPackingBList);
		// 全て検品済か
		flgInfo.isAllCompletedInspection = statusCheckLogic.isCompletedInspection(dbPackingBList);

		return flgInfo;
	}

	/**
	 * 梱包ボディリストの取得
	 */
	private List<TPackingB> selectPackingBListOnlyPickingFlg(long pickingHId, MParam param) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.specify().columnPickingFlg();
		cb.specify().columnInspectionFlg();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setPickingHId_Equal(pickingHId);
		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
		if (!param.isUseHtShipFlg$1()) {
			// HT/SDケースピックなしの場合

			// ケースは含めない
			cb.query().queryTPackingH().setMixedFlg_Equal_$1();
		}
		// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		return packingBList;
	}

	/**
	 * マップに追加
	 */
	private void addPackingNumMap(Map<Long, Map<Long, PackingNumInfo>> deletePackingNumMap, TPackingB packingB) {

		long productId = packingB.getTAllocInstB().getProductId();
		long pickingBId = packingB.getPickingBId();
		BigDecimal packingNum = packingB.getPackingNum();

		if (packingNum == null || WCC.isZeroOrLess(packingNum)) {
			return;
		}

		Map<Long, PackingNumInfo> pickingMap;
		if (deletePackingNumMap.containsKey(productId)) {

			pickingMap = deletePackingNumMap.get(productId);
		} else {

			pickingMap = new TreeMap<Long, PackingNumInfo>(); // 自動テストでDB登録順が毎回同じになるようにTreeMap使用
			deletePackingNumMap.put(productId, pickingMap);
		}

		if (pickingMap.containsKey(pickingBId)) {
			// 現在の値に追加
			pickingMap.get(pickingBId).add(packingNum);
		} else {
			// 新規追加
			PackingNumInfo packingNumInfo = new PackingNumInfo(packingNum, packingB.getAllocInstBId());
			pickingMap.put(pickingBId, packingNumInfo);
		}
	}

	// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana Start

	/**
	 * 入力した荷材IDを返却
	 * @return 荷材ID
	 */
	private Long getInputBoxId(List<SqlPackingListUpdate> inputEntityList) {

		for (SqlPackingListUpdate inputEntity : inputEntityList) {

			if (inputEntity.getBoxId() != null) {
				return inputEntity.getBoxId();
			}
		}

		return null;
	}

	// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.05.30 kawana End

	/**
	 * <h2>梱包ボディの出庫フラグ・検品フラグの設定.</h2>
	 * <pre>
	 * 出庫フラグ情報クラスに合わせて、
	 * 梱包ボディの出庫フラグ、検品フラグを設定する。
	 * </pre>
	 * @param packingB 出庫フラグ・検品フラグを設定する梱包ボディ
	 * @param pickingFlgInfo 出庫フラグ情報
	 */
	public void setPackingBFlg(TPackingB packingB, PickingFlgInfo pickingFlgInfo) {

		if (pickingFlgInfo.isAllCompletedPicking) {
			packingB.setPickingFlg_$1();
		} else {
			packingB.setPickingFlg_$0();
		}

		if (pickingFlgInfo.isAllCompletedInspection) {
			packingB.setInspectionFlg_$1();
		} else {
			packingB.setInspectionFlg_$0();
		}
	}

	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start

	/**
	 * <h2>梱包ヘッダ(梱包ボディ)の更新.</h2>
	 * <pre>
	 * 引数の梱包ヘッダの次の情報をDB更新する。
	 * ・混載フラグ ==> 1:混載
	 * ・積込フラグ ==> 0:未検品
	 * ・総容積・総重量 ==> 梱包ボディを検索して加算して設定
	 *
	 * 紐づく梱包ボディが0件の場合は、
	 * 引数の梱包ヘッダ・梱包帳票(getTPackingRAsOneで取得)をDB削除する。
	 *
	 * </pre>
	 *
	 * @param packingH 更新に使用する梱包ヘッダ(梱包帳票を結合したもの)
	 * @param doUpdatePickingB 梱包ボディ更新有無
	 * @param errSts エラー時に設定するエラーステータス
	 * @return DB更新した場合はUPDATE_PACKING_H、DB削除した場合はDELETE_PACKING_Hを返却
	 */
	public ResultUpdatePackingData updatePackingData(TPackingH packingH, ErrorStatus errSts) {

		packingH.setMixedFlg_$1();
		return updatePackingData(packingH, null, null, DoUpdatePickingB.FALSE, errSts);
	}

	/**
	 * <h2>梱包ヘッダ(梱包ボディ)の更新.</h2>
	 * <pre>
	 * 引数の梱包ヘッダの次の情報をDB更新する。
	 * ・混載フラグ ==> 1:混載
	 * ・積込フラグ ==> 0:未検品
	 * ・総容積・総重量 ==> 梱包ボディを検索して加算して設定
	 * ・単品から混載への変更の場合、次の情報もDB更新する。
	 *   -・梱包ステータス ==> 出庫フラグ・検品フラグ情報から判定 ※SD/HTケースピックなしの場合のみ
	 *   -・種蒔きNo. ==> 同一の出庫指示バッチNo.内での最大値 + 1
	 *
	 * また、引数で梱包ボディ更新ありを指定した場合 かつ 単品から混載への変更の場合
	 * 梱包ヘッダに紐づく梱包ボディの次の情報をDB更新する。
	 * ・ケースピッキングNo. ==> null
	 * ・出庫フラグ ==> 出庫フラグ・検品フラグ情報から判定 ※SD/HTケースピックなしの場合のみ
	 * ・検品フラグ ==> 出庫フラグ・検品フラグ情報から判定 ※SD/HTケースピックなしの場合のみ
	 *
	 * 紐づく梱包ボディが0件の場合は、
	 * 引数の梱包ヘッダ・梱包帳票(getTPackingRAsOneで取得)をDB削除する。
	 *
	 * </pre>
	 *
	 * @param packingH 更新に使用する梱包ヘッダ(梱包帳票を結合したもの)
	 * @param pickingFlgInfo 出庫フラグ・検品フラグ情報
	 * @param param パラメータマスタ
	 * @param doUpdatePickingB 梱包ボディ更新有無
	 * @param errSts エラー時に設定するエラーステータス
	 * @return DB更新した場合はUPDATE_PACKING_H、DB削除した場合はDELETE_PACKING_Hを返却
	 */
	public ResultUpdatePackingData updatePackingData(TPackingH packingH, PickingFlgInfo pickingFlgInfo, MParam param, DoUpdatePickingB doUpdatePickingB, ErrorStatus errSts) {

		// ===== 梱包ボディ検索 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TPickingB().withTStock();
		cb.query().setPackingHId_Equal(packingH.getPackingHId());

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.isEmpty()) {
			// 梱包ボディなし -> 梱包ヘッダ削除

			// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana Start
			// ピッキング提案データ削除
			pickingMethodRecommendationCallLogic.packingDelete(packingH.getPackingHId());
			// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana End

			tPackingRBhv.delete(packingH.getTPackingRAsOne());
			tPackingHBhv.delete(packingH);

			return ResultUpdatePackingData.DELETE_PACKING_H;
		}

		// ===== 総容積、総重量に加算 =====

		BigDecimal totalVolume = WCC.ZERO;
		BigDecimal totalWeight = WCC.ZERO;

		for (TPackingB packingB : packingBList) {

			// 商品のピース荷姿
			MProductShape pieceProductShape = productShapeCalcLogic.getPieceProductShape(packingB.chaseTPickingB().chaseTStock().getProductId());
			if (pieceProductShape == null) {
				continue;
			}

			BigDecimal packingNum = packingB.getPackingNum();

			BigDecimal pieceVolume = CU.nullToZero(pieceProductShape.getVolume());
			BigDecimal pieceWeight = CU.nullToZero(pieceProductShape.getGrossWeight());

			totalVolume = WCC.add(totalVolume, WCC.multiply(pieceVolume, packingNum));
			totalWeight = WCC.add(totalWeight, WCC.multiply(pieceWeight, packingNum));

			if (doUpdatePickingB == DoUpdatePickingB.TRUE) {
				// 出庫ボディの更新

				if (packingH.isMixedFlg$0()) {
					// 単品 => 混載に変更

					// ケースピッキングNo.をクリア
					packingB.setCasePickingNo(null);

					if (!param.isUseHtShipFlg$1()) {
						// HT/SDケースピックなしの場合

						// 出庫フラグ・検品フラグの変更
						setPackingBFlg(packingB, pickingFlgInfo);
					}

					tPackingBBhv.update(packingB);
				}
			}
		}

		packingH.setTotalVolume(totalVolume);
		packingH.setGrossWeight(totalWeight);

		if (packingH.isMixedFlg$0()) {
			// 単品 => 混載に変更

			packingH.setMixedFlg_$1();

			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
			// 種蒔No.
			Integer seedingNo = selectSeedingNo(tPickingHBhv.selectByPKValue(packingH.getPickingHId()));
			String seedingNoStr = null;
			if (seedingNo != null) {
				seedingNoStr = toStringSeedingNo(seedingNo + 1);
				packingH.setSeedingNo(seedingNoStr);
			}
			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End

			if (!param.isUseHtShipFlg$1()) {
				// HT/SDケースピックなしの場合

				// 梱包ステータス変更
				if (pickingFlgInfo.isAllCompletedInspection) {
					// 検品済
					packingH.setPackingStatus_$50();
				} else if (pickingFlgInfo.isAllCompletedPicking) {
					// ピッキング済
					packingH.setPackingStatus_$35();
				} else {
					// 出庫指示済
					packingH.setPackingStatus_$25();
				}
			}
		}

		packingH.setLoadingFlg_$0(); // 積込フラグをクリアする

		// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana Start
		// 最大数値チェック
		packingCalculateLogic.checkMaxNumber(packingH, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}
		// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana End

		tPackingHBhv.update(packingH);

		return ResultUpdatePackingData.UPDATE_PACKING_H;
	}

	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

	/**
	 * <h2>現在の種蒔きNo.の最大値を取得.</h2>
	 * <pre>
	 * 同じピッキンググループNo.の梱包ヘッダに付与されている
	 * 種蒔きNo.のうち最大の種蒔きNo.を返す。
	 *
	 * ピッキンググループNo.が空 または
	 * 種蒔きNo.が未設定の場合は
	 * nullを返却する。
	 * </pre>
	 *
	 * @param pickingH 出庫ヘッダ : センタID、ピッキンググループNo.
	 * @return 現在の種蒔きNo.の最大値
	 */
	public Integer selectSeedingNo(TPickingH pickingH) {

		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start

		if (CU.isNullOrEmpty(pickingH.getPickingGroupNo())) {
			return null;
		}

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.specify().columnSeedingNo();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(pickingH.getCenterId());
		cb.query().queryTPickingH().setPickingGroupNo_Equal(pickingH.getPickingGroupNo());

		cb.query().addOrderBy_SeedingNo_Desc();
		cb.fetchFirst(1);

		TPackingH entity = tPackingHBhv.selectEntity(cb);
		if (entity == null) {
			return null;
		}

		String seedingNo = entity.getSeedingNo();
		if (CU.isNullOrEmpty(seedingNo)) {
			return null;
		}

		return Integer.valueOf(seedingNo);
		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
	}

	// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更(selectPickingBatchNo削除) 2018.08.24 kawana Delete

	/**
	 * 新規梱包登録用に出庫ボディを検索
	 */
	private TPickingB selectPickingBforNewPacking(long pickingBId) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.setupSelect_TStock();

		cb.query().setPickingBId_Equal(pickingBId);

		TPickingB dbPickingB = tPickingBBhv.selectEntity(cb);

		return dbPickingB;
	}

	/**
	 * <h2>新規梱包データを作成・登録.</h2>
	 * <pre>
	 * 新規梱包ヘッダを作成し、引数の出庫ボディの商品を
	 * 梱包ボディに登録する。
	 * 梱包データは梱包計算なし、荷材設定なしで登録される。
	 * 梱包ボディの出庫フラグ・検品フラグは出庫フラグ情報に合わせて変更して登録する。
	 *
	 * 【登録テーブル】
	 * ・梱包ヘッダ
	 * ・梱包帳票
	 * ・梱包ボディ
	 *
	 * </pre>
	 *
	 * @param pickingBIdSet 出庫ボディID
	 * @param seedingNo 種蒔きNo.
	 * @param pickingFlgInfo 出庫フラグ情報
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerNewPackingData(Set<Long> pickingBIdSet, Integer seedingNo, PickingFlgInfo pickingFlgInfo, ErrorStatus errSts) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.setupSelect_TStock();

		cb.checkInvalidQuery();
		cb.query().setPickingBId_InScope(pickingBIdSet);
		cb.addOrderBy_PK_Asc();

		List<TPickingB> dbPickingBList = tPickingBBhv.selectList(cb);

		registerNewPackingData(dbPickingBList, null, seedingNo, pickingFlgInfo, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * 新規梱包データの登録
	 */
	private void registerNewPackingData(List<TPickingB> pickingBList, MBox box, Integer seedingNo, PickingFlgInfo pickingFlgInfo, ErrorStatus errSts) {

		// 梱包(梱包計算なし)作成 (必ず1件)
		List<TPackingH> packingData = packingCalculateLogic.packingPieceNoCalc(pickingBList, box, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 種蒔きNo.
		for (TPackingH packingH : packingData) {

			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start

			if (seedingNo != null) {

				// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start
				String seedNoStr = toStringSeedingNo(seedingNo);
				// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End
				packingH.setSeedingNo(seedNoStr);
			}

			// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End
		}

		// DB登録
		insertNewPackingData(packingData, pickingFlgInfo);
	}

	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana Start

	/**
	 * 種蒔きNo.を文字列に変換
	 */
	private String toStringSeedingNo(int seedingNo) {
		String seedNoStr = "0000000000" + seedingNo;
		seedNoStr = seedNoStr.substring(seedNoStr.length() - 10);
		return seedNoStr;
	}

	// [#2874] HT/SDケースピッキングなしの場合にステータス不正が発生 2018.06.26 kawana End

	/**
	 * 引数の下記の梱包データをデータベースに登録する
	 * ・梱包ヘッダ
	 * ・梱包帳票
	 * ・梱包ボディのリスト (検品済に変更)
	 */
	private void insertNewPackingData(List<TPackingH> packingHList, PickingFlgInfo pickingFlgInfo) {

		List<TPackingB> allPackingBList = new ArrayList<TPackingB>();
		List<TPackingR> allPackingRList = new ArrayList<TPackingR>();

		for (TPackingH packingH : packingHList) {

			tPackingHBhv.insert(packingH);
			long packingHId = packingH.getPackingHId();

			TPackingR packingR = packingH.getTPackingRAsOne();
			packingR.setPackingHId(packingHId);
			allPackingRList.add(packingR);

			List<TPackingB> packingBList = packingH.getTPackingBList();
			for (TPackingB packingB : packingBList) {
				packingB.setPackingHId(packingHId);

				// 出庫フラグ・検品フラグの設定
				setPackingBFlg(packingB, pickingFlgInfo);

				allPackingBList.add(packingB);
			}
		}

		tPackingRBhv.batchInsert(allPackingRList);
		tPackingBBhv.batchInsert(allPackingBList);
	}

	/**
	 * 帳票の出力状況をクリア(届先変更用)
	 */
	private void clearOutFlgDeliveryInfo(long centerId, String pickingWorkNo, TAllocInstH allocInstH, ErrorStatus errSts) {

		UpdateInfo updateInfo = new UpdateInfo();
		updateInfo.doUpdate = true;
		updateInfo.doClearSlipOut = true;
		updateInfo.doClearInvoiceCreate = true;
		updateInfo.doClearStwOut = true;
		updateInfo.doClearTagOut = true; // 後続処理で荷札が梱包単位かを判定

		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana Start
		final long pickingHId = selectPickingHByPickingWorkNo(centerId, pickingWorkNo).getPickingHId();
		// [#5131][v3.1] 種蒔きNo.をピッキンググループNo.単位に変更 2018.08.24 kawana End

		// 出力フラグのクリア実行
		clearOutFlg(pickingHId, updateInfo, allocInstH, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * <h2>帳票の出力状況をクリア(貨物追跡番号の採番単位チェック含む).</h2>
	 * <pre>
	 * 引数の更新情報を元に次の帳票出力情報をクリアする。
	 * ・納品明細 (出荷実績訂正で使用)
	 * ・荷札
	 * ・送り状
	 * ・送り状データ
	 * ・積込リスト
	 *
	 * 【貨物追跡番号の採番単位チェック】
	 * 引当指示ヘッダの配送コースIDから配送コースを検索し、
	 * 貨物追跡番号の採番単位が梱包単位の場合は
	 * 荷札出力のクリアを強制的になしにする。※ 引数の更新情報も変更
	 *
	 * 【更新テーブル】
	 * ・梱包帳票
	 * ・出庫帳票
	 *
	 * </pre>
	 * @param pickingHId 出庫ヘッダID
	 * @param updateInfo 更新情報
	 * @param allocInstH 引当指示ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void clearOutFlgWithTrackingNumberingUnitCheck(long pickingHId, UpdateInfo updateInfo, TAllocInstH allocInstH, ErrorStatus errSts) {

		if (!updateInfo.doUpdate) {
			return;
		}

		// 貨物追跡番号の採番単位をチェック
		MDeliveryCourse deliveryCourse = mDeliveryCourseBhv.selectByPKValue(allocInstH.getDeliveryCourseId());
		if (deliveryCourse.isTrackingNumberingUnit$2()) {
			// 梱包単位で貨物追跡 => 荷札出力のクリアはしない

			updateInfo.doClearTagOut = false;
		}

		// 出力フラグのクリア実行
		clearOutFlg(pickingHId, updateInfo, allocInstH, errSts);
	}

	/**
	 * 帳票の出力状況をクリア
	 */
	private void clearOutFlg(long pickingHId, UpdateInfo updateInfo, TAllocInstH allocInstH, ErrorStatus errSts) {
		// 梱包ヘッダ・出庫ヘッダ取得 (出庫作業No.を条件)
		List<TPackingH> dbPackingHList = selectPackingHListForStatusUpdate(pickingHId);

		for (TPackingH dbPackingH : dbPackingHList) {

			// 梱包帳票のステータス更新
			clearOutFlgPackingR(dbPackingH.getTPackingRAsOne(), updateInfo);
		}

		TPickingR pickingR;
		if (dbPackingHList.isEmpty()) {
			// 全欠品で梱包がなくなった場合は空になる
			// ※※本処理は出荷実績訂正用の処理のため消さないこと

			pickingR = tPickingRBhv.selectByPKValue(pickingHId);
		} else {

			pickingR = dbPackingHList.get(0).getTPickingH().getTPickingRAsOne();
		}

		// 出庫帳票のステータス更新
		clearOutFlgPickingR(pickingR, updateInfo);

		// 積込リスト出力の更新
		if (updateInfo.doClearStwOut) {

			stwListPrintLogic.clearStwOutFlg(allocInstH, errSts);
		}
	}

	/**
	 * 梱包ヘッダ・梱包帳票・出庫ヘッダ・出庫帳票の取得
	 */
	private List<TPackingH> selectPackingHListForStatusUpdate(long pickingHId) {

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();

		cb.setupSelect_TPackingRAsOne();
		cb.setupSelect_TPickingH().withTPickingRAsOne();

		cb.checkInvalidQuery();
		cb.query().queryTPickingH().setPickingHId_Equal(pickingHId);

		cb.addOrderBy_PK_Asc();

		List<TPackingH> packingHList = tPackingHBhv.selectList(cb);

		return packingHList;
	}

	/**
	 * 梱包帳票のステータス更新
	 */
	private void clearOutFlgPackingR(TPackingR dbPackingR, UpdateInfo updateInfo) {

		boolean isChange = false;

		if (updateInfo.doClearTagOut) {
			// 荷札出力クリア
			dbPackingR.setTagOutFlg_$0();
			dbPackingR.setTagOutUserId(null);
			dbPackingR.setTagOutDt(null);
			dbPackingR.setTagDlUrl(null);

			isChange = true;
		}

		if (isChange) {
			// DB更新
			tPackingRBhv.update(dbPackingR);
		}
	}

	/**
	 * 出庫帳票のスーテタス更新
	 */
	private void clearOutFlgPickingR(TPickingR dbPickingR, UpdateInfo updateInfo) {

		boolean isChange = false;

		if (updateInfo.doClearPackingOut) {
			// ※ 本処理は出荷実績訂正用の処理のため消さないこと

			// 納品明細クリア
			dbPickingR.setPackingOutFlg_$0();
			dbPickingR.setPackingOutUserId(null);
			dbPickingR.setPackingOutDt(null);

			isChange = true;
		}

		if (updateInfo.doClearSlipOut) {

			// 送り状出力クリア
			dbPickingR.setSlipOutFlg_$0();
			dbPickingR.setSlipOutUserId(null);
			dbPickingR.setSlipOutDt(null);

			isChange = true;
		}

		if (updateInfo.doClearInvoiceCreate) {

			// 送り状データ作成クリア
			dbPickingR.setInvoiceCreateFlg_$0();
			dbPickingR.setInvoiceCreateDt(null);
			dbPickingR.setInvoiceIssueNum(null);

			isChange = true;
		}

		if (isChange) {

			// DB更新
			tPickingRBhv.update(dbPickingR);
		}
	}

	/**
	 * 出庫フラグ・検品フラグ情報
	 */
	public static class PickingFlgInfo {
		/** 全て梱包ボディが出庫済か (true:出庫済) */
		public boolean isAllCompletedPicking;
		/** 全て梱包ボディが検品済か (true:検品済) */
		public boolean isAllCompletedInspection;
	}

	/**
	 * 梱包数の情報クラス
	 */
	private static class PackingNumInfo {
		private BigDecimal packingNum;
		private long allocInstBId;

		public PackingNumInfo(BigDecimal packingNum, long allocInstBId) {
			if (packingNum == null) {
				this.packingNum = WCC.ZERO;
			} else {
				this.packingNum = packingNum;
			}
			this.allocInstBId = allocInstBId;
		}

		public void add(BigDecimal addPackingNum) {
			if (addPackingNum == null) {
				return;
			}

			this.packingNum = WCC.add(this.packingNum, addPackingNum);
		}

		public void subtract(BigDecimal subtractPackingNum) {
			if (subtractPackingNum == null) {
				return;
			}

			this.packingNum = WCC.subtract(this.packingNum, subtractPackingNum);
		}

		public BigDecimal getPackingNum() {
			return packingNum;
		}

		public long getAllocInstBId() {
			return allocInstBId;
		}
	}

	/**
	 * Longのequals (null考慮)
	 */
	private boolean equals(Long l1, Long l2) {
		if (l1 == null && l2 == null) {
			return true;
		}

		if (l1 == null || l2 == null) {
			return false;
		}

		return l1.longValue() == l2.longValue();
	}

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana End
}

