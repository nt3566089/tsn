package com.oneslogi.wms.logic.shipping;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TEcOrderRCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResultDetail;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.DeliverySlipListDto;
import com.oneslogi.wms.dto.report.EcDeliverySlipListDto;
import com.oneslogi.wms.logic.ecorder.EcDeliverySlipListPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic.TagLabelCls;

/**
 * 出荷検品自動印刷クラス
 */
public class ShippingInspectAutoPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブルクラス =====

	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	@Inject
	private TEcOrderRBhv tEcOrderRBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private MClientCenterBhv mClientCenterBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private TagLabelPrintLogic tagLabelPrintLogic;
	@Inject
	private EcDeliverySlipListPrintSelectLogic ecDeliverySlipSelectLogic;
	@Inject
	private DeliverySlipListPrintLogic deliverySlipSelectLogic;

	/**
	 * <h2>荷札/納品明細の自動発行(ピース)</h2>
	 * <pre>
	 *  検品後荷札出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 *  荷札を自動発行する。
	 *
	 * 検品後納品明細出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 * 検品後納品明細出力対象に従い、ECお買上明細または納品明細を自動発行する。
	 * </pre>
	 *
	 * @param pickingH 出庫ヘッダ:出庫ヘッダID
	 * @param mParam パラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printPiecePickingH(TPickingH pickingH, MParam mParam, ErrorStatus errSts) {
		List<TPickingH> pickingHList = new ArrayList<TPickingH>();
		pickingHList.add(pickingH);

		printPiecePickingH(pickingHList, mParam, errSts);
	}

	/**
	 * <h2>荷札/納品明細の自動発行(ピース)</h2>
	 * <pre>
	 *  検品後荷札出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 *  荷札を自動発行する。
	 *
	 * 検品後納品明細出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 * 検品後納品明細出力対象に従い、ECお買上明細または納品明細を自動発行する。
	 * </pre>
	 *
	 * @param pickingHList 出庫ヘッダリスト:出庫ヘッダID
	 * @param mParam パラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printPiecePickingH(List<TPickingH> pickingHList, MParam mParam, ErrorStatus errSts) {

		List<Long> pickingHIdList = tPickingHBhv.extractPickingHIdList(pickingHList);

		// ===== 荷札発行 =====

		if (mParam.isAfterTagOutFlg$1() || mParam.isAfterTagOutFlg$3()) {
			// 「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」

			printTagLabel(selectPackingHIdSet(pickingHIdList), TagLabelCls.TAG_PIECE, errSts);
		}

		// ===== 納品明細発行 =====

		if (mParam.isAfterDelivSlipOutFlg$1() || mParam.isAfterDelivSlipOutFlg$3()) {
			// 「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」

			if (mParam.isAfterDelivSlipOutTgt$1()) {
				// ECお買上明細

				printEcDelivSlip(pickingHIdList, errSts);
			} else if (mParam.isAfterDelivSlipOutTgt$2()) {
				// 納品明細

				MClientCenter clientCenter = mClientCenterBhv.selectByPKValueWithDeletedCheck(mParam.getClientCenterId());
				printDeliverySlip(pickingHIdList, clientCenter, errSts);
			}
		}
	}

	/**
	 * <h2>荷札/納品明細の自動発行(ピース)</h2>
	 * <pre>
	 *  検品後荷札出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 *  荷札を自動発行する。
	 *
	 * 検品後納品明細出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 * 検品後納品明細出力対象に従い、ECお買上明細または納品明細を自動発行する。
	 * </pre>
	 *
	 * @param packingH 梱包ヘッダ:梱包ヘッダID
	 * @param mParam パラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printPiecePackingH(TPackingH packingH, MParam mParam, ErrorStatus errSts) {
		List<TPackingH> packingHList = new ArrayList<TPackingH>();
		packingHList.add(packingH);

		printPiecePackingH(packingHList, mParam, errSts);
	}

	/**
	 * <h2>荷札/納品明細の自動発行(ピース)</h2>
	 * <pre>
	 *  検品後荷札出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 *  荷札を自動発行する。
	 *
	 * 検品後納品明細出力フラグが
	 *  「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 * 検品後納品明細出力対象に従い、ECお買上明細または納品明細を自動発行する。
	 * </pre>
	 *
	 * @param packingHList 梱包ヘッダリスト:梱包ヘッダID
	 * @param mParam パラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printPiecePackingH(List<TPackingH> packingHList, MParam mParam, ErrorStatus errSts) {

		List<Long> packingHIdList = tPackingHBhv.extractPackingHIdList(packingHList);

		// ===== 荷札発行 =====

		if (mParam.isAfterTagOutFlg$1() || mParam.isAfterTagOutFlg$3()) {
			// 「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」

			printTagLabel(packingHIdList, TagLabelCls.TAG_PIECE, errSts);
		}

		// ===== 納品明細発行 =====

		if (mParam.isAfterDelivSlipOutFlg$1() || mParam.isAfterDelivSlipOutFlg$3()) {
			// 「1:バラ出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」

			// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana Start
			printDeliverySlip(packingHIdList, mParam, errSts);
			// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana End
		}
	}

	/**
	 * <h2>荷札/納品明細の自動発行(ケース)</h2>
	 * <pre>
	 *  検品後荷札出力フラグが
	 *  「2:ケース出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 *  荷札を自動発行する。
	 *
	 * 検品後納品明細出力フラグが
	 *  「2:ケース出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」の場合
	 * 検品後納品明細出力対象に従い、ECお買上明細または納品明細を自動発行する。
	 * </pre>
	 *
	 * @param packingHIdList 梱包ヘッダIDリスト
	 * @param mParam パラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printCase(Collection<Long> packingHIdList, MParam mParam, ErrorStatus errSts) {

		// ===== 荷札発行 =====

		if (mParam.isAfterTagOutFlg$2() || mParam.isAfterTagOutFlg$3()) {
			// 「2:ケース出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」

			printTagLabel(packingHIdList, TagLabelCls.TAG_CASE, errSts);
		}

		// ===== 納品明細発行 =====

		if (mParam.isAfterDelivSlipOutFlg$2() || mParam.isAfterDelivSlipOutFlg$3()) {
			// 「2:ケース出荷検品後のみ出力」又は「3:バラ・ケース出荷検品後に出力」

			// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana Start
			printDeliverySlip(packingHIdList, mParam, errSts);
			// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana End
		}
	}

	/**
	 * 梱包ヘッダIDリストの取得
	 */
	private Collection<Long> selectPackingHIdSet(final Collection<Long> pickingHIdList) {

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setPickingHId_InScope(pickingHIdList);

		List<TPackingH> packingHList = tPackingHBhv.selectList(cb);

		return tPackingHBhv.extractPackingHIdList(packingHList);
	}

	/**
	 * 出庫ヘッダIDリストの取得
	 */
	private Collection<Long> selectPickingHIdSet(final Collection<Long> packingHIdList) {

		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().existsTPackingHList(new SubQuery<TPackingHCB>() {

			@Override
			public void query(TPackingHCB packingHCb) {
				packingHCb.query().setPackingHId_InScope(packingHIdList);
			}
		});

		List<TPickingH> pickingHList = tPickingHBhv.selectList(cb);

		return tPickingHBhv.extractPickingHIdList(pickingHList);
	}

	/**
	 * 荷札発行
	 */
	private void printTagLabel(Collection<Long> packingHIdList, TagLabelCls tagLabelCls, ErrorStatus errSts) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		long controlNo = numberingLogic.getControlNo();

		// コントロールNo.設定
		int targetCount = setControlNoPackingR(controlNo, packingHIdList);

		if (0 < targetCount) {

			TPackingR tPackingR = new TPackingR();
			tPackingR.setControlNo(controlNo);

			// 荷札発行メソッド呼出し
			tagLabelPrintLogic.printAuto(tPackingR, tagLabelCls, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			// コントロールNoクリア
			clearControlNo(tPackingR);
		}
	}

	// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana Start

	/**
	 * 納品明細発行
	 */
	private void printDeliverySlip(Collection<Long> packingHIdList, MParam mParam, ErrorStatus errSts) {

		// 納品明細発行対象の梱包ヘッダIDリスト
		List<Long> targetPackingHIdList = new ArrayList<Long>();
		for (long packingHId : packingHIdList) {

			if (deliverySlipSelectLogic.isTargetPackingH(packingHId)) {
				// 納品明細発行対象

				targetPackingHIdList.add(packingHId);
			}
		}

		if (targetPackingHIdList.isEmpty()) {
			return;
		}

		Collection<Long> pickingHIdList = selectPickingHIdSet(targetPackingHIdList);
		if (mParam.isAfterDelivSlipOutTgt$1()) {
			// ECお買上明細

			printEcDelivSlip(pickingHIdList, errSts);
		} else if (mParam.isAfterDelivSlipOutTgt$2()) {
			// 納品明細

			MClientCenter clientCenter = mClientCenterBhv.selectByPKValueWithDeletedCheck(mParam.getClientCenterId());
			printDeliverySlip(pickingHIdList, clientCenter, errSts);
		}
	}

	// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana End

	/**
	 * ECお買上明細発行
	 */
	private void printEcDelivSlip(Collection<Long> pickingHIdList, ErrorStatus errSts) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		long controlNo = numberingLogic.getControlNo();

		// EC受注帳票にコントロールNo.を設定
		int targetNum = setControlNoEcOrderR(controlNo, pickingHIdList);
		if (targetNum < 1) {
			// 対象データなし

			return;
		}

		// EC受注帳票(検索用)
		TEcOrderR ecOrderRSearch = tEcOrderRBhv.newMyEntity();
		ecOrderRSearch.setControlNo(controlNo);

		// コントロールNoを指定してロジック呼出
		List<EcDeliverySlipListDto> printDto;
		try {
			printDto = ecDeliverySlipSelectLogic.selectReportDtoList(ecOrderRSearch, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		} catch (UnsupportedEncodingException e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}

		// 帳票発行
		excecAutoPrint(EcDeliverySlipListPrintSelectLogic.REPORT_CD, printDto, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 発行フラグ更新、コントロールNo.クリア
		TEcOrderR ecOrderRupdate = tEcOrderRBhv.newMyEntity();

		ecOrderRupdate.setControlNo(null);
		ecOrderRupdate.setStatementOutFlg_$1();
		ecOrderRupdate.setStatementOutDt(new Timestamp(System.currentTimeMillis()));
		ecOrderRupdate.setStatementOutUserId(this.getUserId());

		ecDeliverySlipSelectLogic.ecOrderRUpdate(ecOrderRupdate, ecOrderRSearch, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * 納品明細発行
	 */
	private void printDeliverySlip(Collection<Long> pickingHIdList, MClientCenter clientCenter, ErrorStatus errSts) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		long controlNo = numberingLogic.getControlNo();

		// 出庫帳票にコントロールNo.を設定
		int targetNum = setControlNoPickingR(controlNo, pickingHIdList);
		if (targetNum < 1) {
			// 対象データなし

			return;
		}

		//出庫帳票(検索用)
		TPickingR tPickingRsearch = tPickingRBhv.newMyEntity();
		tPickingRsearch.setControlNo(controlNo);

		// 帳票用Dto取得
		List<DeliverySlipListDto> printDtoList = deliverySlipSelectLogic.selectReportDtoList(tPickingRsearch, clientCenter.getCenterId(), clientCenter.getClientId(), errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 帳票発行
		excecAutoPrint(DeliverySlipListPrintLogic.REPORT_CD, printDtoList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 発行フラグ更新、コントロールNo.クリア
		TPickingR pickingRupdate = tPickingRBhv.newMyEntity();

		pickingRupdate.setControlNo(null);
		pickingRupdate.setPackingOutFlg_$1();
		pickingRupdate.setPackingOutUserId(this.getUserId());
		pickingRupdate.setPackingOutDt(new Timestamp(System.currentTimeMillis()));

		deliverySlipSelectLogic.updatePrOutFlg(pickingRupdate, tPickingRsearch, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * コントロールNoのクリア
	 * @param report 梱包帳票(検索用)：コントロールNo.
	 */
	private void clearControlNo(TPackingR report) {

		// ===== 梱包帳票更新 =====
		// 更新条件作成
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// 更新項目作成
		TPackingR update = new TPackingR();
		update.setControlNo(null);

		// 梱包帳票更新
		tPackingRBhv.queryUpdate(update, cb);
	}

	/**
	 * 梱包帳票にコントロールNo.設定
	 */
	private int setControlNoPackingR(long controlNo, Collection<Long> packingHIdList) {

		// 更新条件作成
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setPackingHId_InScope(packingHIdList);

		// 更新条件作成
		TPackingR entity = new TPackingR();
		entity.setControlNo(controlNo);

		// 出庫帳票の更新
		return tPackingRBhv.queryUpdate(entity, cb);
	}

	/**
	 * EC受注帳票にコントロールNo.設定
	 */
	private int setControlNoEcOrderR(long controlNo, Collection<Long> pickingHIdList) {

		TEcOrderRCB cb = tEcOrderRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTEcOrderH().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingHId_InScope(pickingHIdList);

		// 更新項目作成
		TEcOrderR update = tEcOrderRBhv.newMyEntity();
		update.setControlNo(controlNo);

		return tEcOrderRBhv.queryUpdate(update, cb);
	}

	/**
	 * EC受注帳票にコントロールNo.設定
	 */
	private int setControlNoPickingR(long controlNo, Collection<Long> pickingHIdList) {

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setPickingHId_InScope(pickingHIdList);

		// 更新項目作成
		TPickingR update = tPickingRBhv.newMyEntity();
		update.setControlNo(controlNo);

		return tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * 帳票発行実行 (自動印刷)
	 */
	private void excecAutoPrint(String reportCd, List<?> data, ErrorStatus errSts) {

		//帳票発行処理
		try {
			AutoPrintAddQueueResult result = null;
			JSON json = new JSON();
			json.setSuppressNull(true);
			result = autoPrintLogic.print(reportCd, json.format(data));

			if (result.isError()) {

				for (AutoPrintAddQueueResultDetail resultError : result.getResultDetails()) {
					if (resultError.getFieldNm() != null && resultError.getFieldNm().equals("PRINTER_GROUP_ID")) {
						getErrorManager().add(errSts, WmsMessageConst.CAN_NOT_PRINT_PRINTER_NOT_SET_ERROR);
						return;
					}
				}

				// エラー登録
				getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
				return;
			}
		} catch (Exception e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}
	}
}
