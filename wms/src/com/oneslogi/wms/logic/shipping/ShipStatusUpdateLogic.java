package com.oneslogi.wms.logic.shipping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic.StartType;

/**
 * 出荷ステータス更新クラス
 */
public class ShipStatusUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [#2147] ピッキングと検品のステータス更新を共通化(不要になった変数tPackingBBhvを削除) 2017.07.20 kawana

	// ===== 使用ロジック =====

	@Inject
	private ShipStatusCheckLogic checkLogic;
	// [C-CWMS-0066] 非同期処理化 2016.11.09 kawana Start
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;
	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.28 kawana Start
	@Inject
	private ParamLogic paramLogic;

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.28 kawana End

	/**
	 * <h2>出庫指示開始のステータスを更新する。</h2>
	 * <pre>
	 * 出庫指示処理前の出荷ステータスの更新を行う。
	 * 出荷指示ヘッダ.出荷ステータスを"15"(出庫指示中)に一括更新する。
	 * </pre>
	 * @param controlNo 更新対象の出荷ヘッダにつけられたコントロールNo.
	 * @param dataCount 対象件数
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrderBatchStart(long controlNo, int dataCount, ErrorStatus errSts) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);
		cb.query().setShippingStatus_Equal_$10(); // 未出荷を条件に設定

		TShippingInstH entity = new TShippingInstH();
		entity.setShippingStatus_$15(); // 出庫指示中

		int count = tShippingInstHBhv.queryUpdate(entity, cb);
		if (count != dataCount) {
			getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}
	}

	/**
	 * <h2>出庫指示中異常時のステータス更新。</h2>
	 * <pre>
	 * 出荷指示ヘッダ.出荷ステータスを"10"(未出荷)に一括更新する。
	 * </pre>
	 * @param controlNo 更新対象の出荷ヘッダにつけられたコントロールNo.
	 * @param dataCount 対象件数
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrderBatchCancel(long controlNo) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);
		cb.query().setShippingStatus_Equal_$15(); // 未出荷を条件に設定

		TShippingInstH entity = new TShippingInstH();
		entity.setShippingStatus_$10(); // 出庫指示中

		// デッドロック対策メソッドを使用
		queryUpdateLogic.queryUpdateWithSelect(tShippingInstHBhv, entity, cb, queryUpdateSettingsLogic.getQuerySetter(tShippingInstHBhv));
	}

	// [C-CWMS-0066] 非同期処理化 2016.11.09 kawana End

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana End

	/**
	 * <h2>出庫指示のステータスを更新する。</h2>
	 * <pre>
	 * 出庫指示処理時出荷ステータスの更新を行う。
	 * 出荷指示ヘッダ.出荷ステータスを"25"(出庫指示済)に一括更新する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrder(List<TShippingInstH> sShipInstHeaderList, ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷指示ヘッダ更新(出庫指示済)[一括更新] =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== エンティティ編集(更新用データ編集) =====
			head.setShippingStatus_$25();
		}
		tShippingInstHBhv.batchUpdate(sShipInstHeaderList);
	}

	/**
	 * <h2>出庫指示解除のステータスを更新する。</h2>
	 * <pre>
	 * 出庫指示解除処理時出荷ステータスの更新を行う。
	 * 出荷指示ヘッダ.出荷ステータスを"10"(未出荷)に一括更新する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrderCancel(List<TShippingInstH> sShipInstHeaderList, ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷指示ヘッダ更新(未出荷)[一括更新] =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== エンティティ編集(更新用データ編集) =====
			head.setShippingStatus_$10();
		}
		tShippingInstHBhv.batchUpdate(sShipInstHeaderList);
	}

	/**
	 * <h2>出荷検品完了のステータスを更新する。</h2>
	 * <pre>
	 * 出荷検品完了時、ステータスの更新を行う。
	 * 該当する梱包ボティデータで【全て検品済判定】処理を行い、
	 * 全て検品済の場合、梱包ヘッダ.梱包ステータスを"50"(検品済)に更新する。
	 * 梱包ヘッダが全て検品済の場合、
	 * 出庫ヘッダ.出庫ステータスを"50"(検品済)に更新する。
	 * 最後に、出荷指示ヘッダ.出荷ステータスを"50"(検品済)に更新する。
	 *
	 * 【全て検品済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedInspection(List) 全て検品済の判定メソッド}を呼び出す。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void inspected(List<TPickingH> pickHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		this.inspected(pickHeaderList, errSts, 1);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	/**
	 * <h2>出荷検品完了のステータスを更新する。</h2>
	 * <pre>
	 * 出荷検品完了時、ステータスの更新を行う。
	 * 該当する梱包ボティデータで【全て検品済判定】処理を行い、
	 * 全て検品済の場合、梱包ヘッダ.梱包ステータスを"50"(検品済)に更新する。
	 * 梱包ヘッダが全て検品済の場合、
	 * 出庫ヘッダ.出庫ステータスを"50"(検品済)に更新する。
	 * 最後に、出荷指示ヘッダ.出荷ステータスを"50"(検品済)に更新する。
	 *
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @param mixedFlg 混載フラグ 0:単品 1:混載
	 */
	public void inspected(List<TPickingH> pickHeaderList, ErrorStatus errSts, int mixedFlg) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana Start
		updateAllStatusForPickFlgAndInspFlg(pickHeaderList, mixedFlg, StartType.INSPECT_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana End
	}

	// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.25 kawana Start

	/**
	 * <h2>ケースピッキングリスト発行によるステータス更新。</h2>
	 * <pre>
	 * ケースピッキングリスト発行用のステータス更新を行う。
	 *
	 * 梱包ステータス、出荷ステータス、出庫ステータスを検品フラグ、出庫フラグの状態に合わせて更新する。
	 * 検品フラグが全て「0:未検品」の場合は、「検品中」とはしない。
	 * （inspectedメソッドでは「検品中」になる)
	 *
	 * </pre>
	 * @param pickingHList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void casePickingListPrint(List<TPickingH> pickingHList, ErrorStatus errSts) {

		updateAllStatusForPickFlgAndInspFlg(pickingHList, 0, StartType.NONE);
	}

	// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.25 kawana End

	//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015/12/07 NayZaw Start
	/**
	 * <h2>出荷検品完了のステータスを更新する（出荷梱包No.で検品）。</h2>
	 * <pre>
	 * 出荷検品完了時、ステータスの更新を行う。
	 * 該当する梱包ボティデータで【全て検品済判定】処理を行い、
	 * 検品済の場合、梱包ヘッダ.梱包ステータスを"50"(検品済)に更新する。
	 * 同じ出庫作業No.である他の梱包データも検品済場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"50"(検品済)に更新する。
	 *
	 * 【全て検品済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedInspection(List) 全て検品済の判定メソッド}を呼び出す。
	 * </pre>
	 * @param packHeaderList 梱包ヘッダリスト：梱包ヘッダID・センタID・荷主ID・出庫ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingInspected(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana Start
		updateAllStatusForPickFlgAndInspFlg(packHeaderList, StartType.INSPECT_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana End
	}

	//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015/12/07 NayZaw End

	/**
	 * <h2>出荷検品開始処理のステータスを更新する。</h2>
	 * <pre>
	 * 出荷検品開始時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"40"(検品中)に更新し、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"40"(検品中)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void inspectStart(List<TPickingH> pickHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(pickHeaderList, 1, StartType.INSPECT_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	// [C-CWMS-0051] 出荷梱包No．で検品の場合為追加処理 2015/12/02 NayZaw Start
	/**
	 * <h2>出荷検品開始処理のステータスを更新する（出荷梱包No.で検品）。</h2>
	 * <pre>
	 * 出荷検品開始時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"40"(検品中)に更新し、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"40"(検品中)に更新する。
	 * </pre>
	 * @param packHeaderList 梱包ヘッダリスト：梱包ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingInspectStart(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(packHeaderList, StartType.INSPECT_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	// [C-CWMS-0051] 出荷梱包No．で検品の場合為追加処理 2015/12/02 NayZaw End

	/**
	 * <h2>出荷検品中断処理のステータスを更新する。</h2>
	 * <pre>
	 * 出荷検品中断時、ステータスの更新を行う。
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"45"(検品中断)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void inspectInterrupt(List<TPickingH> pickHeaderList, ErrorStatus errSts) {

		// ===== pickHeaderList件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

			// ===== 梱包ヘッダのステータス更新(検品中断)

			queryUpdatePackingStatus(head.getPickingHId(), CDef.PackingStatus.$45);

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

			// ===== 出庫ヘッダ更新(検品中断) =====
			head.setPickingStatus_$45();
			tPickingHBhv.update(head);

			// ===== 出荷指示ヘッダ更新(検品中断) =====
			// ===== 検索条件の設定 =====
			TShippingInstHCB hcb = tShippingInstHBhv.newMyConditionBean();
			// エンティティ編集(更新用データ編集)
			TShippingInstH sShipInstHeader = tShippingInstHBhv.newMyEntity();
			sShipInstHeader.setShippingStatus_$45();
			// 更新条件作成
			hcb.query().setAllocInstHId_Equal(head.getAllocInstHId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
			//荷主ID（Client_ID）
			hcb.query().setClientId_Equal(head.getClientId());
			//センタID（Center_ID）
			hcb.query().setCenterId_Equal(head.getCenterId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End
			// 出荷指示ヘッダ更新
			tShippingInstHBhv.queryUpdate(sShipInstHeader, hcb);
		}
	}

	// [C-CWMS-0051] 出荷梱包No．で検品の場合為追加処理 2015/12/02 NayZaw Start
	/**
	 * <h2>出荷検品中断処理のステータスを更新する(出荷梱包No.で検品)。</h2>
	 * <pre>
	 * 出荷検品中断時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"45"(検品中断)に更新する。
	 * </pre>
	 * @param packHeaderList 梱包ヘッダリスト：全項目(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingInspectInterrupt(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// ===== pickHeaderList件数＝0の場合 =====
		if (packHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPackingH head : packHeaderList) {

			// ===== 梱包ヘッダ更新(検品中断) =====
			head.setPackingStatus_$45();
			tPackingHBhv.update(head);
		}
	}

	// [C-CWMS-0051] 出荷梱包No．で検品の場合為追加処理 2015/12/02 NayZaw End

	/**
	 * <h2>出荷検品キャンセル処理のステータスを更新する。</h2>
	 * <pre>
	 * 出荷検品キャンセル時、ステータスの更新を行う。
	 * 該当する梱包ヘッダデータで【全てピッキング済判定】処理を行い、
	 * 全てピッキング済の場合、梱包ヘッダ.ステータスを"35"(ピッキング済)に更新する。
	 * 梱包ヘッダが全てピッキング済の場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"35"(ピッキング済)に更新する。
	 *
	 * 全てピッキング済ではないの場合、梱包ヘッダ.ステータスを"25"(ピッキング中)に更新し、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"25"(ピッキング中)に更新する。
	 *
	 * 【全てピッキング済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済の判定メソッド}を呼び出す。
	 * </pre>
	 *
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void inspectCancel(List<TPickingH> pickHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(pickHeaderList, 1, StartType.NONE);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	// [C-CWMS-0051] 出荷梱包No.で検品場合、出荷検品キャンセル処理 2015/12/04 NayZaw Start
	/**
	 * <h2>出荷検品キャンセル処理のステータスを更新する（出荷梱包No.で検品）。</h2>
	 * <pre>
	 * 出荷検品キャンセル時、ステータスの更新を行う。
	 * 該当する梱包ヘッダデータで【全てピッキング済判定】処理を行い、
	 * 全てピッキング済の場合、梱包ヘッダ.ステータスを"35"(ピッキング済)に更新する。
	 *
	 * 同じ出庫作業No.で全梱包No.の梱包ステータスが"35"(ピッキング済)又は"25"(出庫指示済)の場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"25"(出庫指示済)に更新する。
	 * それ以外の場合、出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"35"(ピッキング済)に更新する。
	 *
	 * 【全てピッキング済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済の判定メソッド}を呼び出す。
	 * </pre>
	 * @param packHeaderList 梱包ヘッダリスト：出庫ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingInspectCancel(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(packHeaderList, StartType.NONE);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	// [C-CWMS-0051] 出荷梱包No.で検品場合、出荷検品キャンセル処理 2015/12/04 NayZaw End

	/**
	 * <h2>出荷確定のステータスを更新する。</h2>
	 * <pre>
	 * 出荷確定時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータス、出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"55"(出荷確定済)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipCompleted(List<TPickingH> pickHeaderList, ErrorStatus errSts) {

		// ===== pickHeaderList件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

			// ===== 梱包ヘッダのステータス更新(出荷確定)
			queryUpdatePackingStatus(head.getPickingHId(), CDef.PackingStatus.$55);

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

			// ===== 出庫ヘッダ更新(出庫確定) =====
			head.setPickingStatus_$55();
			tPickingHBhv.update(head);

			// ===== 出荷指示ヘッダ更新(出庫確定) =====
			// ===== 検索条件の設定 =====
			TShippingInstHCB hcb = tShippingInstHBhv.newMyConditionBean();
			// エンティティ編集(更新用データ編集)
			TShippingInstH sShipInstHeader = tShippingInstHBhv.newMyEntity();
			sShipInstHeader.setShippingStatus_$55();
			// 更新条件作成
			hcb.query().setAllocInstHId_Equal(head.getAllocInstHId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
			//荷主ID（Client_ID）
			hcb.query().setClientId_Equal(head.getClientId());
			//センタID（Center_ID）
			hcb.query().setCenterId_Equal(head.getCenterId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End
			// 出荷指示ヘッダ更新
			tShippingInstHBhv.queryUpdate(sShipInstHeader, hcb);
		}
	}

	/**
	 * <h2>出荷確定解除のステータスを更新する。</h2>
	 * <pre>
	 * 出荷確定解除時、ステータスの更新を行う。
	 * 該当する梱包ヘッダデータで【全て検品済判定】処理を行い、全て検品済の場合、梱包ヘッダ.ステータスを"50"(検品済)に更新する。
	 * 梱包ヘッダが全て検品済の場合、出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"50"(検品済)に更新する。
	 *
	 * 【全てピッキング済判定】処理を行い、全てピッキング済の場合、梱包ヘッダ.ステータスを"35"(ピッキング済)に更新する。
	 * 梱包ヘッダが全てピッキング済の場合、出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"35"(ピッキング済)に更新する。
	 *
	 * それ以外、梱包ヘッダ.ステータスを"25"(出庫指示済)に更新し、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"25"(出庫指示済)に更新する。
	 *
	 * 【全て検品済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedInspection(List) 全て検品済の判定メソッド}を呼び出す。
	 *
	 * 【全てピッキング済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipCompletedCancel(List<TPickingH> pickHeaderList, ErrorStatus errSts) {

		// ===== (2-1)pickHeaderList件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== (3)pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana Start

			// ===== 梱包ヘッダを検索
			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.checkInvalidQuery();
			cb.query().setPickingHId_Equal(head.getPickingHId());

			List<TPackingH> packingHList = tPackingHBhv.selectList(cb);
			// 梱包ボディを結合
			tPackingHBhv.loadTPackingBList(packingHList, new ConditionBeanSetupper<TPackingBCB>() {
				@Override
				public void setup(TPackingBCB packingBCb) {
				}
			});

			// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start

			// ===== 梱包ヘッダのステータスを更新 =====

			for (TPackingH packingH : packingHList) {

				List<TPackingB> packingBList = packingH.getTPackingBList();

				// ===== ピッキングフラグ、検品フラグによりステータスを更新
				if (checkLogic.isCompletedInspection(packingBList)) {
					// 検品済

					packingH.setPackingStatus_$50();
				} else if (checkLogic.isCompletedPicking(packingBList)) {
					// ピッキング済

					packingH.setPackingStatus_$35();
				} else {
					// それ以外

					packingH.setPackingStatus_$25();
				}

				// 梱包ヘッダのステータス更新
				tPackingHBhv.update(packingH);
			}

			// ===== 出庫ヘッダ、出荷指示ヘッダのステータス更新
			updatePickingStatusAndShippingStatusForPickFlgAndInspFlg(head, StartType.NONE);

			// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana End
		}
	}

	/**
	 * <h2>出庫完了処理のステータスを更新する。</h2>
	 * <pre>
	 * 出庫作業No.で出庫検品完了時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスが全て"35"(ピッキング済)の場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"35"(ピッキング済)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @param mixedFlg 混載フラグ 0:単品 1:混載
	 */
	//[ON推-品向-1063]  2016.04.04 chou 修正 Start
	public void shipPicked(List<TPickingH> pickHeaderList, ErrorStatus errSts, int mixedFlg) {
		//[ON推-品向-1063]  2016.04.04 chou 修正 End

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana Start
		updateAllStatusForPickFlgAndInspFlg(pickHeaderList, mixedFlg, StartType.PICKING_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana End
	}

	//[ON推-品向-1063]  2016.04.04 chou 追加 Start

	/**
	 * <h2>出庫完了処理のステータスを更新する。</h2>
	 * <pre>
	 * 出庫作業No.でバラ検品完了時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスが全て"35"(ピッキング済)の場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"35"(ピッキング済)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipPicked(List<TPickingH> pickHeaderList, ErrorStatus errSts) {
		this.shipPicked(pickHeaderList, errSts, 1);//デフォルトで、混載フラグに 1:混載（バラ）を指定
	}

	//[ON推-品向-1063]  2016.04.04 chou 追加 End

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
	/**
	 * <h2>出庫完了処理のステータスを更新する（出荷梱包No.で検品）。</h2>
	 * <pre>
	 * 出荷梱包No.で出庫検品完了時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"35"(ピッキング済)に更新する。
	 * 当梱包と同じ出庫作業No.である他の梱包のステータスを確認し、
	 * 他の梱包もピッキング済の場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"35"(ピッキング済)に更新する。
	 * </pre>
	 * @param packHeaderList 梱包ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingShipPicked(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana Start
		updateAllStatusForPickFlgAndInspFlg(packHeaderList, StartType.PICKING_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.21 kawana End
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End

	/**
	 * <h2>出庫開始処理のステータスを更新する。</h2>
	 * <pre>
	 * 出庫検品開始時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"30"(ピッキング中)に更新する。
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"30"(ピッキング中)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @param mixedFlg 混載フラグ 0:単品 1:混載
	 */
	//[ON推-品向-1063]  2016.04.04 chou 修正 Start
	public void shipPickStart(List<TPickingH> pickHeaderList, ErrorStatus errSts, int mixedFlg) {
		//[ON推-品向-1063]  2016.04.04 chou 修正 End

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(pickHeaderList, mixedFlg, StartType.PICKING_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	//[ON推-品向-1063]  2016.04.04 chou 追加 Start
	/**
	 * <h2>出庫開始処理のステータスを更新する(出庫作業No.でバラ検品)。</h2>
	 * <pre>
	 * 出庫検品開始時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"30"(ピッキング中)に更新する。
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"30"(ピッキング中)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipPickStart(List<TPickingH> pickHeaderList, ErrorStatus errSts) {
		this.shipPickStart(pickHeaderList, errSts, 1);//デフォルトで、混載フラグに 1:混載（バラ）を指定
	}

	//[ON推-品向-1063]  2016.04.04 chou 追加 End

	// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品する場合、ピッキング中更新処理追加 2015.12.14 NayZaw Start
	/**
	 * <h2>出庫開始処理のステータスを更新する(出荷梱包No.で検品)。</h2>
	 * <pre>
	 * 出庫開始時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"30"(ピッキング中)に更新する。
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"30"(ピッキング中)に更新する。
	 * </pre>
	 * @param packHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingShipPickStart(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(packHeaderList, StartType.PICKING_START);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品する場合、ピッキング中更新処理追加 2015.12.14 NayZaw End

	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Add Start
	/**
	 * <h2>出庫キャンセル処理のステータスを更新する(出庫作業No.でバラ検品)。</h2>
	 * <pre>
	 * 出庫キャンセル時、ステータスの更新を行う。
	 *
	 * 梱包ヘッダ.梱包ステータスを"25"(出庫指示済)に更新する。
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"25"(出庫指示済)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipPickCancel(List<TPickingH> pickHeaderList, ErrorStatus errSts) {
		this.shipPickCancel(pickHeaderList, errSts, 1);//デフォルトで、混載フラグに 1:混載（バラ）を指定
	}

	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Add End

	/**
	 * <h2>出庫キャンセル処理のステータスを更新する。</h2>
	 * <pre>
	 * 出庫キャンセル時、ステータスの更新を行う。
	 *
	 * 梱包ヘッダ.梱包ステータスを"25"(出庫指示済)に更新する。
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"25"(出庫指示済)に更新する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @param mixedFlg 混載フラグ 0:単品 1:混載
	 */
	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Mod Start
	public void shipPickCancel(List<TPickingH> pickHeaderList, ErrorStatus errSts, int mixedFlg) {
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Mod End

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(pickHeaderList, mixedFlg, StartType.NONE);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	/**
	 * <h2>出庫キャンセル処理のステータスを更新する(出荷梱包No.で検品)。</h2>
	 * <pre>
	 * 梱包検品キャンセル時、ステータスの更新を行う。
	 * 梱包ヘッダ.梱包ステータスを"25"(出庫指示済)に更新する。
	 * 当梱包No.と同じ出庫作業No.である他の梱包データも梱包指示済の場合、
	 * 出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスを"25"(出庫指示済)に更新する。
	 * </pre>
	 * @param packHeaderList 梱包ヘッダリスト：出庫ヘッダID・引当指示ヘッダID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingShipPickCancel(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start
		updateAllStatusForPickFlgAndInspFlg(packHeaderList, StartType.NONE);
		// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End
	}

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

	/**
	 * <h2>出庫ヘッダIDを条件に梱包ヘッダの梱包ステータスを更新</h2>
	 * @param pickingHId 出庫ヘッダID
	 * @param status 梱包ステータスの更新値
	 * @param mixedFlg 混載フラグ 0:単品 1:混載
	 */
	//[ON推-品向-1063]  2016.04.04 chou 修正 Start
	private int queryUpdatePackingStatus(long pickingHId, CDef.PackingStatus status, int mixedFlg) {
		//[ON推-品向-1063]  2016.04.04 chou 修正 End

		TPackingHCB updateCb = tPackingHBhv.newMyConditionBean();
		updateCb.checkInvalidQuery();
		updateCb.query().setPickingHId_Equal(pickingHId);

		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.25 chou Mod Start
		if (status.equals(CDef.PackingStatus.$25) ||
				status.equals(CDef.PackingStatus.$30) ||
				status.equals(CDef.PackingStatus.$35) ||
				status.equals(CDef.PackingStatus.$40) ||
				status.equals(CDef.PackingStatus.$45)) {
			//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.25 chou Mod End

			//[ON推-品向-1063]  2016.04.04 chou 修正 Start
			if (mixedFlg == 0) {// ケースの更新対象を指定
				updateCb.query().setMixedFlg_Equal_$0();//単品
			} else if (mixedFlg == 1) {// バラの更新対象を指定
				updateCb.query().setMixedFlg_Equal_$1();//混載
			}
			//[ON推-品向-1063]  2016.04.04 chou 修正 End
		}

		TPackingH updateEntity = new TPackingH();
		updateEntity.setPackingStatus(status.code());
		return tPackingHBhv.queryUpdate(updateEntity, updateCb);
	}

	//[ON推-品向-1063]  2016.04.04 chou 追加 Start
	/**
	 * <h2>出庫ヘッダIDを条件に梱包ヘッダの梱包ステータスを更新</h2>
	 * @param pickingHId 出庫ヘッダID
	 * @param status 梱包ステータスの更新値
	 */
	private int queryUpdatePackingStatus(long pickingHId, CDef.PackingStatus status) {
		return this.queryUpdatePackingStatus(pickingHId, status, 1);
	}

	//[ON推-品向-1063] 2016.04.04 chou 追加 End

	/**
	 * <h2>引当指示ヘッダIDを条件に出荷指示ヘッダの出荷ステータスを更新</h2>
	 * @param allocInstHId 引当指示ヘッダID
	 * @param status 出荷ステータスの更新値
	 */
	private int queryUpdateShippingStatus(long allocInstHId, CDef.ShippingStatus status) {

		TShippingInstHCB updateCb = tShippingInstHBhv.newMyConditionBean();
		updateCb.checkInvalidQuery();
		updateCb.query().setAllocInstHId_Equal(allocInstHId);

		TShippingInstH updateEntity = new TShippingInstH();
		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start
		updateEntity.setShippingStatusAsShippingStatus(status);
		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

		return tShippingInstHBhv.queryUpdate(updateEntity, updateCb);
	}

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.28 kawana Start

	/**
	 * <h2>出庫フラグ、検品フラグから出庫ヘッダ、出庫指示ヘッダのステータスを更新.</h2>
	 *
	 * @param pickingH 出庫ヘッダ
	 * @param startType 作業開始種別
	 */
	private void updatePickingStatusAndShippingStatusForPickFlgAndInspFlg(TPickingH pickingH, ShipStatusCheckLogic.StartType startType) {

		MClientCenter mc = new MClientCenter();
		mc.setClientId(pickingH.getClientId());
		mc.setCenterId(pickingH.getCenterId());
		MParam param = paramLogic.getUkEntityWithDeletedCheck(mc);

		// 出庫フラグ、検品フラグから出庫ステータスを取得
		CDef.PickingStatus pickingStatus = checkLogic.getPickingStatus(pickingH.getPickingHId(), startType, param);

		// ===== 出庫ヘッダ更新 =====

		pickingH.setPickingStatusAsPickingStatus(pickingStatus);
		tPickingHBhv.update(pickingH);

		// ===== 出荷指示ヘッダ更新 =====

		queryUpdateShippingStatus(pickingH.getAllocInstHId(), convertToShippingStatus(pickingStatus));
	}

	/**
	 * <h2>出庫ステータスクラスを出荷ステータスクラスに変換.</h2>
	 * @param pickingStatus 出庫ステータス
	 * @return 出荷ステータス
	 */
	private CDef.ShippingStatus convertToShippingStatus(CDef.PickingStatus pickingStatus) {

		return CDef.ShippingStatus.codeOf(pickingStatus.code());
	}

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.28 kawana End

	// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana Start

	/**
	 * <h2>出庫フラグ、検品フラグからステータスを更新.</h2>
	 * <pre>
	 * 出庫フラグ、検品フラグから下記ステータスを更新
	 * ・梱包ステータス
	 * ・出庫ステータス
	 * ・出荷ステータス
	 * </pre>
	 * @param packingHList 対象の梱包ヘッダリスト (梱包ヘッダID使用)
	 * @param mixedFlg 混載フラグ 0:単品 1:混載
	 * @param startType 開始種別
	 */
	private void updateAllStatusForPickFlgAndInspFlg(List<TPickingH> pickHeaderList, int mixedFlg, StartType startType) {

		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出庫ヘッダのデータ件数分繰返 =====
		for (TPickingH pickingH : pickHeaderList) {

			// [#1561] オーダーピッキングに出荷梱包No.の検索条件を追加 2017.04.13 kawana Start
			//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Mod Startt
			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

			// ===== 梱包ヘッダを検索 =====

			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.checkInvalidQuery();
			cb.query().setPickingHId_Equal(pickingH.getPickingHId());
			if (mixedFlg == 0) {
				// 単品(ケース)のみ

				cb.query().setMixedFlg_Equal_$0();
			} else if (mixedFlg == 1) {
				// 混載(バラ・ピース)のみ

				cb.query().setMixedFlg_Equal_$1();
			}

			List<TPackingH> packingHList = tPackingHBhv.selectList(cb);

			for (TPackingH packingH : packingHList) {

				// ===== 梱包ヘッダのステータス更新 =====
				updatePackingStatusForPickFlgAndInspFlg(packingH, startType);
			}

			// ===== 出庫ヘッダ、出荷指示ヘッダのステータス更新 =====
			updatePickingStatusAndShippingStatusForPickFlgAndInspFlg(pickingH, startType);
		}
	}

	/**
	 * <h2>出庫フラグ、検品フラグからステータスを更新.</h2>
	 * <pre>
	 * 出庫フラグ、検品フラグから下記ステータスを更新
	 * ・梱包ステータス
	 * ・出庫ステータス
	 * ・出荷ステータス
	 * </pre>
	 * @param packingHList 対象の梱包ヘッダリスト (梱包ヘッダID使用)
	 * @param startType 開始種別
	 */
	private void updateAllStatusForPickFlgAndInspFlg(List<TPackingH> packingHList, StartType startType) {

		if (packingHList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		Set<Long> pickingHIdSet = new HashSet<Long>();

		// ===== 梱包ヘッダのデータ件数分繰返 =====
		for (TPackingH packingH : packingHList) {

			// ===== 梱包ヘッダのステータス更新 =====
			updatePackingStatusForPickFlgAndInspFlg(packingH, startType);

			pickingHIdSet.add(packingH.getPickingHId());
		}

		// ===== 梱包ヘッダに紐づく出庫ヘッダ取得 =====

		TPickingHCB pickingHCb = tPickingHBhv.newMyConditionBean();
		pickingHCb.checkInvalidQuery();
		pickingHCb.query().setPickingHId_InScope(pickingHIdSet);
		List<TPickingH> pickingHList = tPickingHBhv.selectList(pickingHCb);

		for (TPickingH pickingH : pickingHList) {

			// ===== 出庫ヘッダと出荷ヘッダのステータス更新 =====
			updatePickingStatusAndShippingStatusForPickFlgAndInspFlg(pickingH, startType);
		}
	}

	// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.20 kawana End

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

	/**
	 * <h2>出庫フラグ、検品フラグから梱包ヘッダのステータスを更新.</h2>
	 *
	 * @param packingH 梱包ヘッダ
	 * @param startType 作業開始種別
	 */
	private void updatePackingStatusForPickFlgAndInspFlg(TPackingH packingH, ShipStatusCheckLogic.StartType startType) {

		// 出庫フラグ、検品フラグから梱包ステータスを取得
		CDef.PackingStatus packingStatus = checkLogic.getPackingStatus(packingH.getPackingHId(), startType);

		// ===== 梱包ヘッダ更新 =====

		packingH.setPackingStatusAsPackingStatus(packingStatus);
		tPackingHBhv.update(packingH);
	}

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
}
