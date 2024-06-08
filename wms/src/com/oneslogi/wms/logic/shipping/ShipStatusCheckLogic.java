package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusCheckLogic;

/**
 * 出荷状態チェックロジッククラス
 */
public class ShipStatusCheckLogic extends AbstractWmsLogic {

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana Start
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana End

	// ===== 使用ロジック =====
	@Inject
	private ReceiveStatusCheckLogic receiveStatusCheckLogic;

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start

	// ===== enum =====

	/** 開始種別 */
	public enum StartType {
		/** なし */
		NONE,
		/** ピッキング開始 */
		PICKING_START,
		/** 検品開始 */
		INSPECT_START
	}

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

	/**
	 * <h2>出荷指示修正時のチェックを行う。</h2>
	 * <pre>
	 * 出荷指示修正時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダの入力区分が"20"(EDI)の場合、出荷指示修正は不可とする。
	 * 出荷指示ヘッダの入力区分が"20"(EDI)以外、且つ出荷ステータスが"10"(未出荷)または"99"(エラー)以外の場合、出荷指示修正は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 *
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：入力区分・出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void orderUpdate(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷指示修正起動／EDIまたは出荷指示修正起動／未出荷時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.入力区分＝"20"(EDI)の場合 =====
			if (head.isInputType$20()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_ORDER_UPDATE_START_EDI_ERROR);
				return;
			} else {
				// ===== sShipInstHeaderList.入力区分＝"20"(EDI)以外の場合 =====
				// ===== sShipInstHeaderList.出荷ステータス＝"10"(未出荷)or"99"(エラー)以外の場合 =====
				if (!(head.isShippingStatus$10() || head.isShippingStatus$99())) {
					// ===== エラーメッセージをエラー管理クラスに登録 =====
					this.getErrorManager().add(errSts, WmsMessageConst.SHIP_ORDER_UPDATE_START_NONSHIPMENT_ERROR);
					return;
				}
			}
		}
	}

	/**
	 * <h2>出庫指示時のチェックを行う。</h2>
	 * <pre>
	 * 出庫指示時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが"10"(未出荷)以外の場合、出庫指示は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrder(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出庫指示起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"10"(未出荷)以外の場合 =====
			if (!head.isShippingStatus$10()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.PICKING_INST_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>出庫指示解除のチェックを行う。</h2>
	 * <pre>
	 * 出庫指示解除時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記以外の場合、出庫指示解除は不可とする。
	 * ・"25"(出庫指示済)
	 * ・"30"(ピッキング中)
	 * ・"35"(ピッキング済)
	 * ・"40"(検品中)
	 * ・"45"(検品中断)
	 * ・"50"(検品済)
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrderCancel(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出庫指示解除起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"25"(出庫指示済)または"30"(ピッキング中)または"35"(ピッキング済)または
			// "40"(検品中)または"45"(検品中断)または"50"(検品済)以外の場合 =====
			if (!(head.isShippingStatus$25() || head.isShippingStatus$30() || head.isShippingStatus$35()
					|| head.isShippingStatus$40() || head.isShippingStatus$45() || head.isShippingStatus$50())) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.PICKING_INST_CANCEL_START_ERROR);
				return;
			}
		}
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start

	/**
	 * <h2>出庫指示前チェック処理。</h2>
	 * <pre>
	 * 出庫指示処理前のチェック処理。
	 * 次のチェックをする。異常の場合はエラーを登録する。
	 * ・DBから取得したデータ件数がパラメータの件数と一致すること
	 * ・出荷ステータスが未出荷であること
	 *
	 * チェック対象の出荷指示ヘッダにコントロールNoが設定されている必要がある。
	 * コントロールNo.を条件に検索する。
	 *
	 * 【データ取得テーブル】
	 * ・出荷指示ヘッダ
	 *
	 * 【パラメータの使用項目】
	 *  (出荷指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・コントロールNo
	 * </pre>
	 * @param shippingInstH 出荷指示ヘッダ
	 * @param dataCount 出荷指示数
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrder(TShippingInstH shippingInstH, int dataCount, ErrorStatus errSts) {

		// ===== 件数チェック =====
		checkCount(shippingInstH, dataCount, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 出荷ステータスチェック =====
		checkStatusIs$10(shippingInstH, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * <h2>出庫指示前チェック処理(バッチ処理)。</h2>
	 * <pre>
	 * 出庫指示処理前のチェック処理。
	 * 次のチェックをする。異常の場合はエラーを登録する。
	 * ・DBから取得したデータ件数がパラメータの件数と一致すること
	 * ・出荷ステータスが出庫指示中であること
	 *
	 * チェック対象の出荷指示ヘッダにコントロールNoが設定されている必要がある。
	 * コントロールNo.を条件に検索する。
	 *
	 * 【データ取得テーブル】
	 * ・出荷指示ヘッダ
	 *
	 * 【パラメータの使用項目】
	 *  (出荷指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・コントロールNo
	 * </pre>
	 * @param shippingInstH 出荷指示ヘッダ
	 * @param dataCount 出荷指示数
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrderBatch(TShippingInstH shippingInstH, int dataCount, ErrorStatus errSts) {

		// ===== 件数チェック =====
		checkCount(shippingInstH, dataCount, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 出荷ステータスチェック =====
		checkStatusIs$15(shippingInstH, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * <h2>出庫指示後チェック処理。</h2>
	 * <pre>
	 * 出庫指示処理後のチェック処理。
	 * 次のチェックをする。異常の場合はエラーを登録する。
	 * ・DBから取得したデータ件数がパラメータの件数と一致すること
	 *
	 * チェック対象の出荷指示ヘッダにコントロールNoが設定されている必要がある。
	 * コントロールNo.を条件に検索する。
	 *
	 * 【データ取得テーブル】
	 * ・出荷指示ヘッダ
	 *
	 * 【パラメータの使用項目】
	 *  (出荷指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・コントロールNo
	 * </pre>
	 * @param shippingInstH 出荷指示ヘッダ
	 * @param dataCount 出荷指示数
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void workOrderAfter(TShippingInstH shippingInstH, int dataCount, ErrorStatus errSts) {
		// ===== 件数チェック =====
		checkCount(shippingInstH, dataCount, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * 件数チェック
	 * @param shippingInstH 出荷指示ヘッダ
	 * @param dataCount 出荷指示数
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void checkCount(TShippingInstH shippingInstH, int dataCount, ErrorStatus errSts) {
		// データ件数を取得
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(shippingInstH.getCenterId());
		cb.query().setClientId_Equal(shippingInstH.getClientId());
		cb.query().setControlNo_Equal(shippingInstH.getControlNo());

		int count = tShippingInstHBhv.selectCount(cb);

		if (count != dataCount) {
			// エラーメッセージをエラー管理クラスに登録
			this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			if (this.getDatabaseLogger().isLoggingStart()) {
				// エラーログを追加
				this.getDatabaseLogger().addErrorLogDtl(WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			}
			return;
		}
	}

	/**
	 * 出荷ステータスチェック(未出荷)
	 * @param shippingInstH 出荷指示ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void checkStatusIs$10(TShippingInstH shippingInstH, ErrorStatus errSts) {
		// 未出荷以外のデータ件数を取得
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(shippingInstH.getCenterId());
		cb.query().setClientId_Equal(shippingInstH.getClientId());
		cb.query().setControlNo_Equal(shippingInstH.getControlNo());
		cb.query().setShippingStatus_NotEqual_$10();

		int count = tShippingInstHBhv.selectCount(cb);

		if (0 < count) {
			// エラーメッセージをエラー管理クラスに登録
			this.getErrorManager().add(errSts, WmsMessageConst.PICKING_INST_START_ERROR);
			if (this.getDatabaseLogger().isLoggingStart()) {
				// エラーログを追加
				this.getDatabaseLogger().addErrorLogDtl(WmsMessageConst.PICKING_INST_START_ERROR);
			}
			return;
		}
	}

	/**
	 * 出荷ステータスチェック(出庫指示中)
	 * @param shippingInstH 出荷指示ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void checkStatusIs$15(TShippingInstH shippingInstH, ErrorStatus errSts) {
		// 未出荷以外のデータ件数を取得
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(shippingInstH.getCenterId());
		cb.query().setClientId_Equal(shippingInstH.getClientId());
		cb.query().setControlNo_Equal(shippingInstH.getControlNo());
		cb.query().setShippingStatus_NotEqual_$15();

		int count = tShippingInstHBhv.selectCount(cb);

		if (0 < count) {
			// エラーメッセージをエラー管理クラスに登録
			this.getErrorManager().add(errSts, WmsMessageConst.PICKING_INST_START_ERROR);
			if (this.getDatabaseLogger().isLoggingStart()) {
				// エラーログを追加
				this.getDatabaseLogger().addErrorLogDtl(WmsMessageConst.PICKING_INST_START_ERROR);
			}
			return;
		}
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End

	/**
	 * <h2>作業日_出荷日変更のチェックを行う。</h2>
	 * <pre>
	 * 作業日_出荷日変更時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記の場合、作業日_出荷日変更は不可とする。
	 * ・"55"(出荷確定)
	 * ・"90"(キャンセル)
	 * エラーメッセージをエラー管理クラスに登録する。
	 *
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void dateUpdate(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 作業日／出荷日変更起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"55"(出荷確定)または"90"(キャンセル)の場合 =====
			if (head.isShippingStatus$55() || head.isShippingStatus$90()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.WORK_DAY_SHIPPING_DAY_CHANGE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>配送コース変更のチェックを行う。</h2>
	 * <pre>
	 * 配送コース変更時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記以外の場合、配送コース変更は不可とする。
	 * ・"10"(未出荷)
	 * ・"99"(エラー)
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deliveryCouseUpdate(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 配送コース変更起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {

			// [#2165] 出庫指示後の配送コース変更機能の追加 出庫確定済以外を変更可能とする 2017/08/03 sampei Start
			// [ON推-品向-878] エラーデータも配送コースの変更を可能にする 2015.07.16 kawana Start
			// ===== 出荷ステータスが未出荷またはエラー以外の場合 =====
			//if (!(head.isShippingStatus$10() || head.isShippingStatus$99())) {
				// [ON推-品向-878] エラーデータも配送コースの変更を可能にする 2015.07.16 kawana End
			if (head.isShippingStatus$55()) {
			// [#2165] 出庫指示後の配送コース変更機能の追加 出庫確定済以外を変更可能とする 2017/08/03 sampei End

				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_CHANGE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>出荷指示削除時のチェックを行う。</h2>
	 * <pre>
	 * 出荷指示削除時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが"10"(未出荷)以外の場合、出荷指示削除は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipOrderDelete(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷指示削除起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"10"(未出荷)以外の場合 =====
			if (!head.isShippingStatus$10()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INST_DELETE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>エラーチェックのチェックを行う。</h2>
	 * <pre>
	 * エラーチェック時のチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記以外の場合、エラーチェックは不可とする。
	 * ・"10"(未出荷)
	 * ・"99"(エラー)
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void errorCheck(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== エラーチェック起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"10"(未出荷)または"99"(エラー)以外の場合 =====
			if (!(head.isShippingStatus$10() || head.isShippingStatus$99())) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.ERROR_CHECK_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>郵便番号変更時のチェックを行う。</h2>
	 * <pre>
	 * 郵便番号変更時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが"99"(エラー)以外の場合、郵便番号変更は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void postCodeUpdate(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 郵便番号変更起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {

			// [#638] 郵便番号の一括変更を未出荷であれば変更できるように変更 2017.01.24 kawana Start
			// ===== sShipInstHeaderList.出荷ステータス＝"99"(エラー)以外の場合 =====
			if (!(head.isShippingStatus$10() || head.isShippingStatus$99())) {
				// [#638] 郵便番号の一括変更を未出荷であれば変更できるように変更 2017.01.24 kawana End

				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.ZIP_NO_CHANGE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>エラー削除時のチェックを行う。</h2>
	 * <pre>
	 * エラー削除時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが"99"(エラー)以外の場合、エラー削除は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void errorDelete(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== エラー削除起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"99"(エラー)以外の場合 =====
			if (!head.isShippingStatus$99()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.ERROR_DELETE_START_ERROR);
				return;
			}
		}
	}

	// [Ver3.1][#5125] 欠品クリア処理を追加 2018.08.20 matsumoto Start
	/**
	 * <h2>欠品クリア時のチェックを行う。
	 * <pre>
	 * 欠品クリア時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが"10"(未出荷)以外の場合、欠品クリアは不可とする。
	 * 出荷指示ヘッダ.欠品フラグが"0"(欠品無)の場合、欠品クリアは不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void clearShortage(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		// ===== 欠品クリア起動時処理 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス = "10"(未出荷)以外の場合 =====
			if (!head.isShippingStatus$10()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.CLEAR_SHORTAGE_EXCEPT_NOT_SHIPPING_START_ERROR);
				return;
			}
			// ===== sShipInstHeaderList.欠品フラグ = "0"(欠品無)の場合 =====
			if (head.isStockOutFlg$0() || CU.isNullOrEmpty(head.getStockOutFlg())) {
				this.getErrorManager().add(errSts, WmsMessageConst.CLEAR_SHORTAGE_EXCEPT_STOCK_OUT_START_ERROR);
				return;
			}
		}
	}
	// [Ver3.1][#5125] 欠品クリア処理を追加 2018.08.20 matsumoto End

	/**
	 * <h2>作業メッセージ登録時のチェックを行う。</h2>
	 * <pre>
	 * 作業メッセージ登録時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記の場合、作業メッセージ登録は不可とする。
	 * ・"55"(出荷確定)
	 * ・"90"(キャンセル)
	 * エラーメッセージをエラー管理クラスに登録する。
	 *
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void remarkMessage(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 作業メッセージ登録起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"55"(出荷確定)または"90"(キャンセル)の場合 =====
			if (head.isShippingStatus$55() || head.isShippingStatus$90()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.WORK_MESSAGE_INSERT_START_ERROR);
				return;
			}
		}
	}

	// [#1706][#1713] SDピッキング対応 2017.04.28 kawana Start

	/**
	 * <h2>ピースピッキング開始前のステータスチェック.</h2>
	 * <pre>
	 * ピースピッキング開始用に梱包ステータスのチェックを行う。
	 * 以下の場合はエラーメッセージをエラー管理クラスに登録する。
	 *
	 * ・"25"(出庫指示済)または"30"(ピッキング中) 以外
	 *
	 * </pre>
	 * @param packingHList 梱包ヘッダのリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void piecePickingStart(List<TPackingH> packingHList, ErrorStatus errSts) {

		for (TPackingH packingH : packingHList) {

			if (!(packingH.isPackingStatus$25() || packingH.isPackingStatus$30())) {

				this.getErrorManager().add(errSts, WmsMessageConst.PICKING_START_STATUS_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>ケースピッキング開始前のステータスチェック.</h2>
	 * <pre>
	 * ケースピッキング開始用にステータスのチェックを行う。
	 * ※ステータスは出庫フラグ、検品フラグから判定する
	 * 以下の場合はエラーメッセージをエラー管理クラスに登録する。
	 *
	 * ・"25"(出庫指示済)または"30"(ピッキング中)または"40"(検品中) 以外
	 *
	 * </pre>
	 * @param packingBList 梱包ボディのリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void casePickingStart(List<TPackingB> packingBList, ErrorStatus errSts) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		CDef.PickingStatus status = getPickingStatus(packingBList, StartType.NONE);

		if (!(status == CDef.PickingStatus.$25 || status == CDef.PickingStatus.$30 || status == CDef.PickingStatus.$40)) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			this.getErrorManager().add(errSts, WmsMessageConst.PICKING_START_STATUS_ERROR);
			return;
		}
	}

	/**
	 * <h2>ピースピッキング解除前のステータスチェック.</h2>
	 * <pre>
	 * ピースピッキング解除用に梱包ステータスのチェックを行う。
	 * 以下の場合はエラーメッセージをエラー管理クラスに登録する。
	 *
	 * ・"30"(ピッキング中) 以外
	 *
	 * </pre>
	 * @param packingHList 梱包ヘッダのリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void piecePickingCancel(List<TPackingH> packingHList, ErrorStatus errSts) {

		for (TPackingH packingH : packingHList) {

			if (!packingH.isPackingStatus$30()) {

				this.getErrorManager().add(errSts, WmsMessageConst.PICKING_CANCEL_STATUS_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>ケースピッキング解除前のステータスチェック.</h2>
	 * <pre>
	 * ケースピッキング解除用にステータスのチェックを行う。
	 * ※ステータスは出庫フラグ、検品フラグから判定する
	 * 以下の場合はエラーメッセージをエラー管理クラスに登録する。
	 *
	 * ・"30"(ピッキング中)または"40"(検品中) 以外
	 *
	 * </pre>
	 * @param packingBList 梱包ボディのリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void casePickingCancel(List<TPackingB> packingBList, ErrorStatus errSts) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		CDef.PickingStatus status = getPickingStatus(packingBList, StartType.NONE);

		if (!(status == CDef.PickingStatus.$30 || status == CDef.PickingStatus.$40)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			this.getErrorManager().add(errSts, WmsMessageConst.PICKING_CANCEL_STATUS_ERROR);
			return;
		}
	}

	// [#1706][#1713] SDピッキング対応 2017.04.28 kawana End

	/**
	 * <h2>出荷実績訂正時のチェックを行う。</h2>
	 * <pre>
	 * 出荷実績訂正時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記以外の場合、出荷実績訂正は不可とする。
	 * ・"25"(出庫指示済)
	 * ・"35"(ピッキング済)
	 * ・"50"(検品済)
	 * エラーメッセージをエラー管理クラスに登録する。
	 *
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipResultUpdate(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷訂正起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"25"(出庫指示済)または"35"(ピッキング済)または
			// "50"(検品済)以外の場合 =====
			if (!(head.isShippingStatus$25() || head.isShippingStatus$35() || head.isShippingStatus$50())) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_UPDATE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>出荷検品開始時のチェックを行う。</h2>
	 * <pre>
	 * 出荷検品開始時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"25"(出庫指示済)or"35"(ピッキング済)の場合のみ、出荷検品開始は可とする。
	 *
	 * 出庫ヘッダ.出庫ステータスが"40"(検品中)の場合、検品中エラーで出荷検品開始は不可とする。
	 * 出庫ヘッダ.出庫ステータスが"50"(検品済)の場合、検品済エラーで出荷検品開始は不可とする。
	 * 上記以外は、ステータスエラーで出荷検品開始は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 *
	 * @param pickHeaderList 出庫ヘッダリスト：出庫
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void inspectStart(List<TPackingH> packHeaderList, ErrorStatus errSts) {

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start

		// ===== packHeaderListの件数＝0の場合 =====
		if (packHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷検品開始／検品中または出荷検品開始時処理 =====

		for (TPackingH head : packHeaderList) {
			// ===== packHeaderList.出庫ステータス＝"25"(出庫指示済)または"35"(ピッキング済)以外の場合 =====
			if (!(head.isPackingStatus$25() || head.isPackingStatus$35())) {
				// ===== packHeaderList.出庫ステータス＝"40"(検品中)の場合 =====
				if (head.isPackingStatus$40()) {
					// ===== エラーメッセージをエラー管理クラスに登録 =====
					this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_START_UNDER_INSPECT_ERROR);
					return;
				} else {
					// ===== packHeaderList.出庫ステータス＝"40"(検品中)以外の場合 =====
					// ===== packHeaderList.出庫ステータス＝"50"(検品済)の場合 =====
					if (head.isPackingStatus$50()) {
						// ===== エラーメッセージをエラー管理クラスに登録 =====
						this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_START_INSPECT_COMPLETE_ERROR);
						return;
					} else {
						// ===== packHeaderList.出庫ステータス＝"50"(検品済)以外の場合 =====
						// ===== エラーメッセージをエラー管理クラスに登録 =====
						this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_START_ERROR);
						return;
					}
				}
			}
		}

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End
	}

	//[C-CWMS-0051]梱包計算対応(出荷梱包No.で検品する処理追加）  2015/12/2 NayZaw Start
	/**
	 * <h2>出荷検品開始(出荷梱包No)時のチェックを行う。</h2>
	 * <pre>
	 * 出荷検品開始時、梱包ヘッダのチェックを行う。
	 * 梱包ヘッダ.梱包ステータスが"25"(出庫指示済)or"35"(ピッキング済)の場合のみ、出荷検品開始可とする。
	 *
	 * 梱包ヘッダ.梱包ステータスが"40"(検品中)の場合、検品中エラーで出荷検品開始は不可とする。
	 * 梱包ヘッダ.梱包ステータスが"50"(検品済)の場合、検品済エラーで出荷検品開始は不可とする。
	 * 上記以外は、ステータスエラーで出荷検品開始は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 *
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param packHeaderList 梱包ヘッダリスト：梱包ステータス
	 * @param packBodyList 梱包ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingInspectStart(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPackingH> packHeaderList,
			List<TPackingB> packBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (packHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷検品開始／検品中または出荷検品開始時処理 =====
		// ===== packHeaderListのデータ件数分繰返 =====
		for (TPackingH head : packHeaderList) {
			// ===== packHeaderList.梱包ステータス＝"25"(出庫指示済)または"35"(ピッキング済)以外の場合 =====
			if (!(head.isPackingStatus$25() || head.isPackingStatus$35())) {
				// ===== packHeaderList.梱包ステータス＝"40"(検品中)の場合 =====
				if (head.isPackingStatus$40()) {
					// ===== エラーメッセージをエラー管理クラスに登録 =====
					this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_START_UNDER_INSPECT_ERROR);
					return;
				} else {
					// ===== packHeaderList.梱包ステータス＝"40"(検品中)以外の場合 =====
					// ===== packHeaderList.梱包ステータス＝"50"(検品済)の場合 =====
					if (head.isPackingStatus$50()) {
						// ===== エラーメッセージをエラー管理クラスに登録 =====
						this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_START_INSPECT_COMPLETE_ERROR);
						return;
					} else {
						// ===== packHeaderList.梱包ステータス＝"50"(検品済)以外の場合 =====
						// ===== エラーメッセージをエラー管理クラスに登録 =====
						this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_START_ERROR);
						return;
					}
				}
			}
		}
	}

	//[C-CWMS-0051]梱包計算対応(出荷梱包No.で検品する処理追加）  2015/12/2 NayZaw End

	/**
	 * <h2>出荷検品再開のチェックを行う。</h2>
	 * <pre>
	 * 出荷検品再開時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"45"(検品中断)以外の場合、出荷検品再開は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ステータス
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void inspectRestart(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷検品再開時処理 =====
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
			// ===== pickHeaderList.出庫ステータス＝"45"(検品中断)以外の場合 =====
			if (!head.isPickingStatus$45()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_RE_START_ERROR);
				return;
			}
		}
	}

	//[C-CWMS-0051]梱包計算対応(出荷梱包No.で検品する処理追加）  2015/12/3 NayZaw Start
	/**
	 * <h2>出荷検品再開(出荷梱包No)のチェックを行う。</h2>
	 * <pre>
	 * 出荷検品再開時、梱包ヘッダのチェックを行う。
	 * 梱包ヘッダ.出庫ステータスが"45"(検品中断)以外の場合、出荷検品再開は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param packHeaderList 梱包ヘッダリスト
	 * @param packBodyList 梱包ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingInspectRestart(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPackingH> packHeaderList,
			List<TPackingB> packBodyList,
			ErrorStatus errSts) {

		// ===== packHeaderListの件数＝0の場合 =====
		if (packHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷検品再開時処理 =====
		// ===== packHeaderListのデータ件数分繰返 =====
		for (TPackingH head : packHeaderList) {
			// ===== pickHeaderList.出庫ステータス＝"45"(検品中断)以外の場合 =====
			if (!head.isPackingStatus$45()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSPECT_RE_START_ERROR);
				return;
			}
		}
	}

	//[C-CWMS-0051]梱包計算対応(出荷梱包No.で検品する処理追加）  2015/12/3 NayZaw End

	/**
	 * <h2>梱包明細修正のチェックを行う。</h2>
	 * <pre>
	 * 梱包明細修正時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"50"(検品済)以外の場合、梱包明細修正は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ステータス
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingUpdate(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 梱包明細修正起動時処理 =====
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
// 「2.2.1 機能 #1980」 2017.07.26 ATK Start
			// ===== pickHeaderList.出庫ステータス＝"50"(検品済)以外の場合 =====
			//if (!head.isPickingStatus$50()) {
			//		this.getErrorManager().add(errSts, WmsMessageConst.PACKING_UPDATE_START_ERROR);
			// ===== pickHeaderList.出庫ステータス＝"55"出荷確定済の場合 =====
			if (head.isPickingStatus$55()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIPPING_CONFIRM_ERROR);
// 「2.2.1 機能 #1980」 2017.07.26 ATK End
				return;
				// [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe Start
				// ===== pickHeaderList.出庫ステータス＝"30"(ピッキング中)、"40"(出荷検品中)"45"(出荷検品中断)のいずれかの場合 =====
			} else if(head.isPickingStatus$30() || head.isPickingStatus$40() || head.isPickingStatus$45()) {
				this.getErrorManager().add(errSts, WmsMessageConst.WORKING_PACKING_ERROR);
			}
			// [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe End
		}
	}

	/**
	 * <h2>強制出荷確定のチェックを行う。</h2>
	 * <pre>
	 * 強制出荷確定時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが下記以外の場合、強制出荷確定は不可とする。
	 * ・"25"(出庫指示済)
	 * ・"35"(ピッキング済)
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ステータス
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void forcedShipComplete(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 強制出荷確定起動時処理 =====
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
			// ===== pickHeaderList.出庫ステータス＝"25"(出庫指示済)または"35"(ピッキング済)以外の場合 =====
			if (!(head.isPickingStatus$25() || head.isPickingStatus$35())) {
				this.getErrorManager().add(errSts, WmsMessageConst.FORCED_SHIP_COMPLETE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>出荷確定のチェックを行う。</h2>
	 * <pre>
	 * 出荷確定時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"50"(検品済)以外の場合、出荷確定は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ステータス
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipComplete(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷確定起動時処理 =====
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
			// ===== pickHeaderList.出庫ステータス＝"50"(検品済)以外の場合 =====
			if (!head.isPickingStatus$50()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_COMPLETE_START_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>出荷確定解除のチェックを行う。</h2>
	 * <pre>
	 * 出荷確定解除時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"55"(出荷確定)以外の場合、出荷確定解除は不可とする。
	 * センタ間移動の場合は【入荷状態チェック.入荷削除】チェックを行って、
	 * 入荷削除不可（入荷作業が既に始まっている）の場合、出荷確定解除は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ヘッダID・出庫ステータス・センタ間移動フラグ・出庫作業No.
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipCompleteCancel(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷確定解除起動時処理 =====
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
			// ===== pickHeaderList.出庫ステータス＝"55"(出荷確定)以外の場合 =====
			if (!head.isPickingStatus$55()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_COMPLETE_CANCEL_START_ERROR);
				return;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			// センタ間移動の場合は入荷予定の削除チェックを行う
			if (head.isCenterTransitFlg$1()) {

				// 入荷予定ヘッダの検索
				TReceivePlanHCB receivePlanCb = tReceivePlanHBhv.newMyConditionBean();
				receivePlanCb.checkInvalidQuery();
				receivePlanCb.query().setPickingHId_Equal(head.getPickingHId());

				List<TReceivePlanH> receivePlanHList = tReceivePlanHBhv.selectList(receivePlanCb);

				//入荷状態チェック.入荷削除メソッドを呼出し
				boolean canDelete = receiveStatusCheckLogic.receivePlanDelete(receivePlanHList);

				if (!canDelete) {
					// エラーを登録
					this.getErrorManager().add(errSts, WmsMessageConst.SHIP_COMPLETED_CANNOT_CANCEL_RECEIVING_ERROR, head.getPickingWorkNo());
					return;
				}
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End
		}
	}

	/**
	 * <h2>出庫検品のチェックを行う。</h2>
	 * <pre>
	 * 出庫検品時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"30"(ピッキング中)、"35"(ピッキング済)の場合、ピッキング中、またはピッキング済で出庫検品は不可とする。
	 * 出庫ヘッダ.出庫ステータスが"25"(出庫指示済)以外の場合、出庫検品は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ステータス
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipPick(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== pickHeaderListの件数＝0の場合 =====
		if (pickHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出庫検品起動時処理 =====
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
			// ===== pickHeaderList.出庫ステータス＝"30"(ピッキング中)の場合、または　"35"(ピッキング済)の場合、 =====
			if (head.isPickingStatus$30() || head.isPickingStatus$35()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_PICK_FIRST_START_ERROR);
				return;
			}
			//======= pickHeaderList.出庫ステータス＝"25"(出庫指示済)以外の場合、 ==========
			if (!head.isPickingStatus$25()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIP_PICK_SECOND_START_ERROR);
				return;
			}
		}
	}

	// [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo Start
	/**
	 * <h2>出荷検品解除時のチェックを行う。</h2>
	 * <pre>
	 * 出荷検品解除時、出荷指示ヘッダのチェックを行う。
	 * 出荷指示ヘッダ.出荷ステータスが下記以外の場合、出荷検品解除は不可とする。
	 * ・"40"(検品中)
	 * ・"45"(検品中断)
	 * ・"50"(検品済)
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出荷ステータス
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void pieceShippingInspectCancel(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList,
			ErrorStatus errSts) {

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出荷検品解除起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		for (TShippingInstH head : sShipInstHeaderList) {
			// ===== sShipInstHeaderList.出荷ステータス＝"40"(出荷検品中) または "45"(出荷検品中断) または "50"(出荷検品済)以外の場合 =====
			if (!(head.isShippingStatus$40() || head.isShippingStatus$45() || head.isShippingStatus$50())) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.PIECE_SHIPPING_INSPECT_CACEL_START_ERROR);
				return;
			}
		}
	}

	// [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo End

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

	// [#1470][Ver2.2.0] ケースピッキング完了後の荷札自動出力処理における検品フラグ全て検品済チェック処理修正 2017.03.23 honma Mod Start
	/**
	 * <h2>全て検品済か判定する。</h2>
	 * <pre>
	 * 梱包ヘッダIDを条件に梱包ボディを検索し検品フラグが全て検品済かチェックを行う。
	 * </pre>
	 * @param packingHId 梱包ヘッダID
	 * @return boolean true : 全て検品済 、 false : 未検品あり
	 */
	public boolean isCompletedInspection(long packingHId) {

		// 梱包ボディを検索
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setPackingHId_Equal(packingHId);

		List<TPackingB> bodyList = tPackingBBhv.selectList(cb);

		return isCompletedInspection(bodyList);
	}

	// [#1470][Ver2.2.0] ケースピッキング完了後の荷札出力処理における検品フラグ全て検品済チェック処理修正 2017.03.23 honma Mod End

	/**
	 * <h2>全て検品済か判定する。</h2>
	 * <pre>
	 * 引数の梱包ボディの検品フラグが全て検品済かチェックを行う。
	 *
	 * </pre>
	 * @param packingBList 梱包ボディリスト：検品フラグ
	 * @return boolean true : 全て検品済 、 false : 未検品あり
	 */
	public boolean isCompletedInspection(List<TPackingB> packingBList) {

		if (packingBList == null || packingBList.size() == 0) {
			// ボディなしは未検品扱い
			// (ボディが作成される前の状態と判断)

			return false;
		}

		for (TPackingB body : packingBList) {
			if (body.getInspectionFlg() == null || body.isInspectionFlg$0()) {
				// 未検品あり

				return false;
			}
		}

		// 全て検品済み
		return true;
	}

	/**
	 * <h2>全てピッキング済か判定する。</h2>
	 * <pre>
	 * 引数の梱包ボディのピッキングフラグが全てピッキング済かチェックを行う。
	 * </pre>
	 * @param pickingHId 梱包ヘッダID
	 * @return boolean true : 全てピッキング済 、 false : 未ピッキングあり
	 */
	public boolean isCompletedPicking(long pickingHId) {

		// 梱包ボディを検索
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setPickingHId_Equal(pickingHId);

		List<TPackingB> bodyList = tPackingBBhv.selectList(cb);

		return isCompletedPicking(bodyList);
	}

	/**
	 * <h2>全てピッキング済か判定する。</h2>
	 * <pre>
	 * 引数の梱包ボディのピッキングフラグが全てピッキング済かチェックを行う。
	 * </pre>
	 * @param packingBList 梱包ボディリスト：出庫フラグ
	 * @return boolean true : 全てピッキング済 、 false : 未ピッキングあり
	 */
	public boolean isCompletedPicking(List<TPackingB> packingBList) {

		if (packingBList == null || packingBList.size() == 0) {
			// ボディなしは未ピッキング扱い
			// (ボディが作成される前の状態と判断)

			return false;
		}

		for (TPackingB body : packingBList) {
			// [#1561] SD用の排他ステータスを追加 2017.04.12 kawana Start
			if (!body.isPickingFlg$1()) {
				// [#1561] SD用の排他ステータスを追加 2017.04.12 kawana End
				// 未ピッキングあり

				return false;
			}
		}

		// 全てピッキング済み
		return true;
	}

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.28 kawana Start

	/**
	 * <h2>出庫ステータスを判定して返却.</h2>
	 * <pre>
	 * 梱包ボディの出庫フラグ、検品フラグの状態から出庫ステータスを判定し、
	 * 返却する。
	 *
	 * 【判定するステータス】
	 *  25:出庫指示済
	 *  30:ピッキング中
	 *  35:ピッキング済
	 *  40:出荷検品中
	 *  50:出荷検品済
	 * </pre>
	 *
	 * @param pickingHId 出庫ヘッダID
	 * @param startType 作業開始種別
	 * @return 出庫ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public CDef.PickingStatus getPickingStatus(long pickingHId, StartType startType, MParam param) {
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.specify().columnPickingFlg();
		cb.specify().columnInspectionFlg();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setPickingHId_Equal(pickingHId);
		if (!param.isUseHtShipFlg$1()) {
			// HT/SDケースピックなしの場合

			// ケース梱包はステータスの判定に含めない
			cb.query().queryTPackingH().setMixedFlg_Equal_$1();
		}

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		CDef.PickingStatus status = getPickingStatus(packingBList, startType);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		return status;
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	}

	// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.28 kawana End

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

	/**
	 * <h2>梱包ステータスを判定して返却.</h2>
	 * <pre>
	 * 梱包ボディの出庫フラグ、検品フラグの状態から梱包ステータスを判定し、
	 * 返却する。
	 *
	 * 【判定するステータス】
	 *  25:出庫指示済
	 *  30:ピッキング中
	 *  35:ピッキング済
	 *  40:出荷検品中
	 *  50:出荷検品済
	 * </pre>
	 *
	 * @param packingHId 梱包ヘッダID
	 * @param startType 作業開始種別
	 * @return 梱包ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public CDef.PackingStatus getPackingStatus(long packingHId, StartType startType) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.specify().columnPickingFlg();
		cb.specify().columnInspectionFlg();

		cb.checkInvalidQuery();
		cb.query().setPackingHId_Equal(packingHId);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);
		CDef.PickingStatus status = getPickingStatus(packingBList, startType);

		return convertToShippingStatus(status);
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	private CDef.PickingStatus getPickingStatus(List<TPackingB> packingBList, StartType startType) {

		// [#1811] ケース梱包のみの場合、検品済ならない問題を修正
		// [#1811] 対象データがない場合は出庫指示済ではなく検品済にするため、packingBListのサイズチェックを削除 2017.05.22 kawana

		// ※ ピッキングしないで検品だけする場合もあるため検品フラグからチェック

		// ===== 検品フラグの判定 =====

		boolean isCompletedInspection = true;
		boolean isInspectionStart = false;

		if (startType == StartType.INSPECT_START) {
			// ピッキング開始の呼出
			isInspectionStart = true;
		}

		for (TPackingB body : packingBList) {

			// [#5115][v3.1] 単行出荷検品 作成 2018.08.15 kawana Start

			switch (body.getInspectionFlgAsInspectionFlg()) {
			case $0:
				// 未ピッキング
				isCompletedInspection = false;
				break;
			case $1:
				// ピッキング有
				isInspectionStart = true;
				break;
			case $7:
				// ピッキング中
				isInspectionStart = true;
				isCompletedInspection = false;
				break;
			}

			// ※ breakしてはダメ (検品中が拾えない)

			// [#5115][v3.1] 単行出荷検品 作成 2018.08.15 kawana End
		}

		if (isCompletedInspection) {
			// 全て検品済
			return CDef.PickingStatus.$50;
		}

		if (isInspectionStart) {
			// 検品中
			return CDef.PickingStatus.$40;
		}

		// ===== ピッキングフラグの判定 =====

		boolean isCompletedPicking = true;
		boolean isPickingStart = false;

		if (startType == StartType.PICKING_START) {
			// ピッキング開始の呼出
			isPickingStart = true;
		}

		for (TPackingB body : packingBList) {

			// [#1706][#1713] SDピッキング対応 2017.04.28 kawana Start
			switch (body.getPickingFlgAsPickingFlg()) {
			case $0:
				// 未ピッキング
				isCompletedPicking = false;
				break;
			case $1:
				// ピッキング有
				isPickingStart = true;
				break;
			case $7:
				// ピッキング中
				isPickingStart = true;
				isCompletedPicking = false;
				break;
			}
			// [#1706][#1713] SDピッキング対応 2017.04.28 kawana End

			// ※ 途中でfor文をbreakしてはダメ (ピッキング中が拾えない)
		}

		if (isCompletedPicking) {
			// 全てピッキング済
			return CDef.PickingStatus.$35;
		}

		if (isPickingStart) {
			// ピッキング中
			return CDef.PickingStatus.$30;
		}

		return CDef.PickingStatus.$25;
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	/**
	 * 出庫ステータスから梱包ステータスに変換
	 * @param pickingStatus 出庫ステータス
	 * @return 梱包ステータス
	 */
	private CDef.PackingStatus convertToShippingStatus(CDef.PickingStatus pickingStatus) {

		return CDef.PackingStatus.codeOf(pickingStatus.code());
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

	// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana Start

	/**
	 * <h2>出荷確定データが含まれていないかチェック.</h2>
	 * <pre>
	 * ケースピッキングNo.を条件にDB検索し、
	 * 梱包ヘッダのステータスが出荷確定済(55)がある場合はエラーを登録する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkExistShippingFixedData(long centerId, long clientId, String casePickingNo, ErrorStatus errSts) {

		List<String> casePickingNoList = new ArrayList<String>();
		casePickingNoList.add(casePickingNo);
		checkExistShippingFixedData(centerId, clientId, casePickingNoList, errSts);
	}

	/**
	 * <h2>出荷確定データが含まれていないかチェック.</h2>
	 * <pre>
	 * ケースピッキングNo.を条件にDB検索し、
	 * 梱包ヘッダのステータスが出荷確定済(55)がある場合はエラーを登録する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNoList ケースピッキングNo.リスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkExistShippingFixedData(long centerId, long clientId, Collection<String> casePickingNoList, ErrorStatus errSts) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.fetchFirst(1);
		cb.setupSelect_TPackingH().withTPickingH();
		cb.specify().specifyTPackingH().specifyTPickingH().columnPickingWorkNo();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setPackingStatus_Equal_$55();
		cb.query().setCasePickingNo_InScope(casePickingNoList);

		TPackingB entity = tPackingBBhv.selectEntity(cb);

		if (entity != null) {
			getErrorManager().add(errSts, WmsMessageConst.CASE_PICKING_NO_EXISTS_FIXED_DATA_ERROR, entity.getTPackingH().getTPickingH().getPickingWorkNo());
			return;
		}
	}

	// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana End
}
