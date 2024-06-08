package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dtomapper.TPickingBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.shipping.PickingListPrintParamDto;

/**
 * ピッキングリスト発行ロジッククラス
 */
public class PickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用ロジック =====

	@Inject
	private PickingNoUpdateLogic pickingNoUpdateLogic;
	@Inject
	private PickingListPrintSelectLogic selectLogic;
	@Inject
	private SingleRowPickingListPrintLogic singleRowPickingListPrintLogic;
	@Inject
	private CasePickingListPrintLogic casePickingListPrintLogic;
	@Inject
	private PrintLogic printLogic;

	// ===== 列挙型 =====

	/** ピッキングリスト発行種別 */
	public enum PickingListCls {

		/** オーダー */
		ORDER(0, "OrderPickingList"),
		/** トータル */
		TOTAL(1, "TotalPickingList"),
		/** 摘み取り */
		PICKING(2, "PLPickingList"),
		/** 種蒔き */
		SEEDING(3, "SLPickingList"),
		/** ケース */
		CASE(4, "CasePickingList"),
		/** マルチ */
		MULTI(5, "MultiPickingList"),
		/** 単行 */
		SINGLE_ROW(6, "SingleRowPickingList");

		private int clsCd;
		private String reportCd;

		private PickingListCls(int clsCd, String reportCd) {
			this.clsCd = clsCd;
			this.reportCd = reportCd;
		}

		private static final Map<Integer, PickingListCls> clsCdMap = new HashMap<Integer, PickingListCls>();
		private static final Map<String, PickingListCls> reportCdMap = new HashMap<String, PickingListCls>();
		static {
			for (PickingListCls value : values()) {
				clsCdMap.put(value.clsCd, value);
				reportCdMap.put(value.reportCd, value);
			}
		}

		public static PickingListCls clsCdOf(int clsCd) {
			return clsCdMap.get(clsCd);
		}

		public static PickingListCls reportCdOf(String reportCd) {
			return reportCdMap.get(reportCd);
		}

		public int clsCd() {
			return clsCd;
		}

		public String reportCd() {
			return reportCd;
		}
	}

	/**
	 * <h2>ピッキングリスト発行.</h2>
	 * <pre>
	 * 引数のコントロールNo.(出庫帳票)が設定されたデータを対象にして
	 * ピッキングリストを発行する。
	 *
	 * 発行後、各出力フラグを出力済に更新する。
	 * </pre>
	 * @param tPickingR 出庫帳票:コントールNo.
	 * @param pickingListCls ピッキングリスト種別
	 * @param printParamDto 印刷情報(画面から選択された情報 + 帳票ID)
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void print(TPickingR tPickingR, PickingListCls pickingListCls, PrintParamDto pickingListPrintDto, MParam param, ErrorStatus errSts) {

		// 出庫帳票の更新用エンティティ
		TPickingR updatePickingR = new TPickingR();
		// 発行データ
		List<?> printDto = null;
		// 入庫No.管理フラグ
		String storeNoFlg = param.getStoreNoFlg();

		switch (pickingListCls) {
		case ORDER:
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana Start
			// ピッキンググループNo.採番
			pickingNoUpdateLogic.updateNoOrderPickingList(tPickingR, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana End

			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			//オーダーピッキングリスト発行.オーダーピッキングリスト発行データ取得メソッドを呼出し
			printDto = selectLogic.getOrderDataList(tPickingR, storeNoFlg, errSts);
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			if (0 < getErrorManager().size()) {
				return;
			}
			// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第1回対応を削除 2014.11.26 fengc

			// オーダーピッキングリスト出力済
			updatePickingR.setOplOutFlg_$1();
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
			setPL1OutFlg(updatePickingR);
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
			break;
		case TOTAL:
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana Start
			// ピッキンググループNo.、仮置きNo.、種蒔きNo. 採番
			pickingNoUpdateLogic.updateNoTotalPickingList(tPickingR, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana End

			//トータルピッキングリスト発行.トータルピッキングリスト発行データ取得メソッドを呼出し
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			printDto = selectLogic.getTotalDataList(tPickingR, storeNoFlg, errSts);
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			if (0 < getErrorManager().size()) {
				return;
			}
			// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第1回対応を削除 2014.11.26 fengc

			// トータルピッキングリスト出力済
			updatePickingR.setTplOutFlg_$1();
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
			setPL1OutFlg(updatePickingR);
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
			break;
		case MULTI:
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana Start
			// ピッキンググループNo. / カートNo. / バケット列、段No. 採番
			pickingNoUpdateLogic.updateNoMultiPickingList(tPickingR, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana End

			//マルチピッキングリスト発行.マルチピッキングリスト発行データ取得メソッドを呼出し
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			printDto = selectLogic.getMultiDataList(tPickingR, storeNoFlg, errSts);
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			if (0 < getErrorManager().size()) {
				return;
			}
			// マルチピッキングリスト出力済
			updatePickingR.setMltOutFlg_$1();
			// [エンハンス PH2.0] マルチピッキングリストを追加 2015.12.18 sja End
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
			setPL1OutFlg(updatePickingR);
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
			break;
		// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana Start
		case SINGLE_ROW:
			// 単行ピッキングリストデータ取得
			List<TPickingB> printDataList = singleRowPickingListPrintLogic.selectProgressData(tPickingR, storeNoFlg, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			printDto = new TPickingBDtoMapper().mappingToDtoList(printDataList);

			// 単行ピッキングリスト発行フラグ設定
			updatePickingR.setSplOutFlg_$1();
			// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana End
			setPL1OutFlg(updatePickingR);
			break;
		case PICKING:
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			printDto = selectLogic.getPLDataList(tPickingR, storeNoFlg, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			updatePickingR.setPlOutFlg_$1();
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
			setPL2OutFlg(updatePickingR);
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
			break;
		case SEEDING:
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			printDto = selectLogic.getSLDataList(tPickingR, storeNoFlg, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			updatePickingR.setSlOutFlg_$1();
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
			setPL2OutFlg(updatePickingR);
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
			break;
		case CASE:
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana Start
			// ケースピッキングNo. 採番
			pickingNoUpdateLogic.updateNoCasePickingList(tPickingR, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
			// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana End

			// ケースピッキングリスト発行データ取得
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			printDto = selectLogic.getCaseDataList(tPickingR, storeNoFlg, errSts);
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			if (0 < getErrorManager().size()) {
				return;
			}
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
			// ケースピッキングリスト出力済
			setCaseOutFlg(updatePickingR);
			// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
			// [1.1.4-CT-069] ケースピッキングリストを出力した時にケース分は検品済にする 2016.06.02 kawana Start
			if (!param.isUseHtShipFlg$1()) {
				// HT未使用の場合、ケース出庫分を検品済に変更
				casePickingListPrintLogic.updateInspectionFlg(tPickingR, errSts);
				if (0 < getErrorManager().size()) {
					return;
				}
			}
			// [1.1.4-CT-069] ケースピッキングリストを出力した時にケース分は検品済にする 2016.06.02 kawana End
			break;
		}

		JSON json = new JSON();
		json.setSuppressNull(true);

		// 帳票を発行
		pickingListPrintDto.printBasicData.outputData = json.format(printDto);
		try {
			printLogic.print(pickingListPrintDto);
		} catch (Exception e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}

		PickingListPrintParamDto ret = new PickingListPrintParamDto();
		ret.output = pickingListPrintDto.output;

		// 出庫帳票更新
		selectLogic.tPickingRUpdate(updatePickingR, tPickingR, errSts);
	}

	// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start

	/**
	 * 1次ピッキングリスト発行フラグの設定(発行済)
	 *
	 * @param pickingR 出庫帳票
	 */
	private void setPL1OutFlg(TPickingR pickingR) {

		Timestamp time = new Timestamp(System.currentTimeMillis());

		pickingR.setPl1OutFlg_$1();
		pickingR.setPl1OutUserId(this.getUserId());
		pickingR.setPl1OutDt(time);
	}

	/**
	 * 2次ピッキングリスト発行フラグの設定(発行済)
	 *
	 * @param pickingR 出庫帳票
	 */
	private void setPL2OutFlg(TPickingR pickingR) {

		Timestamp time = new Timestamp(System.currentTimeMillis());

		pickingR.setPl2OutFlg_$1();
		pickingR.setPl2OutUserId(this.getUserId());
		pickingR.setPl2OutDt(time);
	}

	/**
	 * 2次ピッキングリスト発行フラグの設定(発行済)
	 *
	 * @param pickingR 出庫帳票
	 */
	private void setCaseOutFlg(TPickingR pickingR) {

		Timestamp time = new Timestamp(System.currentTimeMillis());

		pickingR.setCaseOutFlg_$1();
		pickingR.setCaseOutUserId(this.getUserId());
		pickingR.setCaseOutDt(time);
	}

	// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
}
