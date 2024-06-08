package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dto.AutoPrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.InspectionLabelDto;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;
import com.oneslogi.wms.logic.common.ReportLogic;

/**
 * オーダーピッキング更新ロジッククラス
 */
public class OrderPickingUpdateLogic extends AbstractWmsLogic {

	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
	// ===== 定数定義 =====
	private static final String REPORT_CD = "InspectionLabel";
	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End

	// ===== 使用テーブル =====

	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End

	// ===== 使用ロジッククラス =====

	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;
	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End

	/**
	 * <h2>オーダーピッキング開始処理(出庫フラグ、ステータスの更新)【出荷梱包No単位】.</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・出庫フラグの更新 (出庫作業中)
	 * ・各ヘッダのステタース更新 (ピッキング中)
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updatePickingStart(long centerId, long clientId, String shippingPackingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		// 梱包ボディ検索

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);
		cb.query().setPickingFlg_NotEqual_$1(); // 未出庫のみ検索
		cb.query().setInspectionFlg_NotEqual_$1(); // 未検品のみ検索
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		List<CDef.PackingStatus> inScopePackingStatus = new ArrayList<CDef.PackingStatus>();
		inScopePackingStatus.add(CDef.PackingStatus.$25); // 出庫指示済
		inScopePackingStatus.add(CDef.PackingStatus.$30); // ピッキング中

		cb.query().queryTPackingH().setPackingStatus_InScope_AsPackingStatus(inScopePackingStatus);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() < 1) {
			// 該当データなし

			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		// ===== 出庫フラグ更新(ピック作業中:7) =====

		// ※ ピック作業中(7) はケースピッキングNo.単位で排他処理する為のステータス。
		// ※ HTはワークテーブルで排他チェックしているがSDはワークテーブルを使用していないため
		// ※ ケースピッキングNo.による排他チェックが出来ない。
		// ※ SDの時だけ作業開始時にピック作業中(7)に更新して排他チェックを行う

		for (TPackingB packingB : packingBList) {
			// 出庫作業中
			packingB.setPickingFlg_$7();
		}
		tPackingBBhv.batchUpdate(packingBList);

		// ===== 各ヘッダのステータス更新 =====

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

		// ピッキング中に変更
		shipStatusUpdateLogic.packingShipPickStart(packingHList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	/**
	 * <h2>オーダーピッキング済処理(出庫フラグ、ステータスの更新).</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・出庫フラグの更新 (出庫済)
	 * ・各ヘッダのステタース更新 (ピッキング済)
	 * ・検品ラベルの自動発行
	 *
	 * ラベルの発行に失敗した場合は、警告メッセージを設定する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param stockId 在庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception
	 */
	public void updatePickingFlg(long centerId, long clientId, String shippingPackingNo, long stockId, ErrorStatus errSts) throws Exception {

		// ===== 対象データ取得 =====

		// 梱包ボディ検索

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);
		cb.query().queryTPickingB().setStockId_Equal(stockId);
		cb.query().setPickingFlg_NotEqual_$1(); // 未出庫のみ検索
		cb.query().setInspectionFlg_NotEqual_$1(); // 未検品のみ検索
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		List<CDef.PackingStatus> inScopePackingStatus = new ArrayList<CDef.PackingStatus>();
		inScopePackingStatus.add(CDef.PackingStatus.$30); // ピッキング中
		cb.query().queryTPackingH().setPackingStatus_InScope_AsPackingStatus(inScopePackingStatus);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() < 1) {
			// 該当データなし

			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		// ===== 出庫フラグを「1：出庫済」に更新 =====

		for (TPackingB packingB : packingBList) {
			packingB.setPickingFlg_$1();
		}
		tPackingBBhv.batchUpdate(packingBList);

		// ===== 各ヘッダのステータス更新 =====

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

		// ピッキング済に変更
		shipStatusUpdateLogic.packingShipPicked(packingHList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
		// ===== 検品ラベルの自動印刷 =====

		// 出荷梱包No単位でステータスが全てピッキング済になったとき、検品用作業ラベルを出力する

		for (TPackingH tPackingH : packingHList) {
			// 梱包ヘッダ検索
			TPackingHCB hcb = tPackingHBhv.newMyConditionBean();
			hcb.setupSelect_TPickingH();
			hcb.checkInvalidQuery();
			hcb.query().setPackingHId_Equal(tPackingH.getPackingHId());
			TPackingH packingH = tPackingHBhv.selectEntity(hcb);

			if (packingH.isPackingStatus$35()) {
				MClientCenter paramCondition = new MClientCenter();
				paramCondition.setCenterId(centerId);
				paramCondition.setClientId(clientId);

				MParam mParam = new MParam();
				mParam = paramLogic.getUkEntityWithDeletedCheck(paramCondition);

				autoPrintLabel(packingH, mParam, errSts);

				if (0 < getErrorManager().size()) {
					return;
				}
			}
		}
		// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
	}

	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
	/**
	 * <h2>検品ラベル自動発行.</h2>
	 * <pre>
	 * 検品ラベルを自動印刷する。
	 * </pre>
	 * @param tPackingH 対象の梱包ヘッダ
	 * @param mParam 対象のパラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception
	 */
	public void autoPrintLabel(TPackingH tPackingH, MParam mParam, ErrorStatus errSts) throws Exception {

		// ===== 検品ラベル出力データ設定 =====

		InspectionLabelDto labelDto = new InspectionLabelDto();
		labelDto.setPackingCalCls(mParam.getPackingCalCls());
		labelDto.setPickingWorkNo(tPackingH.getTPickingH().getPickingWorkNo());
		labelDto.setShippingPackingNo(tPackingH.getShippingPackingNo());
		labelDto.setUserCd(getUserCd());
		labelDto.cultureId = getCultureId();

		// 帳票レイアウトマスタで自動印刷対象の判定
		// 同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD), "1");
		if (pReportLayout != null) {
			// SD検品ラベル出力の判定[1:出力する]の場合のみ、自動発行する
			if (mParam.isInspectionLabelOutFlg$1()) {
				// ※※ 自動発行の場合、発行枚数の上限チェックはしない

				// 帳票発行処理
				JSON json = new JSON();
				json.setSuppressNull(true);

				AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(REPORT_CD);
				// 同一帳票内のレイアウトの中から、自動印刷対象のデータのIDをセット
				autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
				//印刷内容
				autoPrintParamDto.printBasicData.outputData = json.format(labelDto);

				AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);

				if (!result.isSuccess()) {
					// 検品ラベル発行失敗

					// 自動発行エラー(エラーはクリアして警告を登録)
					getErrorManager().clear();
					this.getWarnManager().add(warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.INSPECTION_LABEL_AUTO_PRINT_FAILED_WARN);
					return;
				}

				// ===== 出力フラグ更新 =====

				updateInspectionOutFlg(tPackingH.getShippingPackingNo());
			}
		}

	}

	/**
	 * SD検品ラベル出力フラグ更新(出力済に更新)
	 */
	private void updateInspectionOutFlg(String shippingPackingNo) {
		// 出力フラグ更新

		// ===== 条件 =====
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);

		// ===== 更新値 =====

		TPackingR packingR = new TPackingR();
		packingR.setInspectionOutFlg_$1();
		packingR.setInspectionOutUserId(this.getUserId());
		Timestamp time = new Timestamp(System.currentTimeMillis());
		packingR.setInspectionOutDt(time);

		// ===== 更新実行 =====
		// 同時実行でデッドロックが発生したため日次用のデッドロック対策メソッドを使用
		queryUpdateLogic.queryUpdateWithSelect(tPackingRBhv, packingR, cb, queryUpdateSettingsLogic.getQuerySetter(tPackingRBhv));
	}


	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End

	/**
	 * <h2>オーダーピッキング解除処理(出庫フラグ、ステータスの更新).</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・出庫フラグ、検品フラグの更新 (未出庫、未検品)
	 * ・各ヘッダのステタース更新 (出庫指示済)
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void clearPickingFlg(long centerId, long clientId, String shippingPackingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		// 更新条件
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.setupSelect_TPackingH();

		cb.checkInvalidQuery();
		cb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(centerId);
		cb.query().queryTPickingB().queryTPickingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		List<CDef.PackingStatus> inScopePackingStatus = new ArrayList<CDef.PackingStatus>();
		inScopePackingStatus.add(CDef.PackingStatus.$30); // ピッキング中

		cb.query().queryTPackingH().setPackingStatus_InScope_AsPackingStatus(inScopePackingStatus);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() < 1) {
			// データなし
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		// ===== 出庫フラグを「0：未出庫」に更新 =====

		for (TPackingB packingB : packingBList) {
			packingB.setPickingFlg_$0();
		}
		tPackingBBhv.batchUpdate(packingBList);

		// ===== 各ヘッダのステータス更新 =====

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

		//出庫ステータスの更新 (出庫指示済に変更)
		shipStatusUpdateLogic.packingShipPickCancel(packingHList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

}