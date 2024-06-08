package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.BaseException;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * ケースピッキング画面更新ロジッククラス
 */
public class CasePickingUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	/* 梱包ボディ */
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana Start
	@Inject
	private TPickingRBhv tPickingRBhv;
	// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana End

	// ===== 使用ロジック =====

	@Inject
	ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana Start
	@Inject
	private PickingNoUpdateLogic pickingNoUpdateLogic;
	// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana End
	// [Ver3.1][#5117]荷札自動発行の際に使用するロジックの変更 2018.09.18 matsumoto Start
	@Inject
	private ShippingInspectAutoPrintLogic shippingInspectAutoPrintLogic;
	// [Ver3.1][#5117]荷札自動発行の際に使用するロジックの変更 2018.09.18 matsumoto End

	// ===== 定数 =====

	private static final int STATUS_CD_AUTO_PRINT_ERROR = 9001;

	/**
	 * <h2>ケースピッキング開始処理(出庫フラグ、ステータスの更新).</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・出庫フラグの更新 (出庫作業中)
	 * ・各ヘッダのステタース更新 (ピッキング中)
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updatePickingStart(long centerId, long clientId, String casePickingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		// 梱包ボディ検索

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);
		cb.query().setPickingFlg_NotEqual_$1(); // 未出庫のみ検索
		cb.query().setInspectionFlg_NotEqual_$1(); // 未検品のみ検索
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		List<CDef.PackingStatus> inScopePackingStatus = new ArrayList<CDef.PackingStatus>();
		inScopePackingStatus.add(CDef.PackingStatus.$25); // 出庫指示済
		inScopePackingStatus.add(CDef.PackingStatus.$30); // ピッキング中
		inScopePackingStatus.add(CDef.PackingStatus.$40); // 出荷検品中 (一部ケースピッキング完了)

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
	 * <h2>ケースピッキング済処理(出庫フラグ、ステータスの更新).</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・出庫フラグ、検品フラグの更新
	 * ・各ヘッダのステタース更新 (検品中または検品済)
	 * ・荷札の自動発行
	 *
	 * 荷札の発行に失敗した場合は、警告メッセージを設定する。
	 * </pre>
	 *
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 * @param stockId 在庫ID
	 * @param errSts エラーステータス
	 */
	public void updatePickingFlg(long centerId, long clientId, String casePickingNo, long stockId, ErrorStatus errSts) {

		// ===== 対象データを取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.setupSelect_TPackingH();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);
		cb.query().queryTPickingB().setStockId_Equal(stockId);
		cb.query().setPickingFlg_NotEqual_$1(); // 未出庫のみ検索
		cb.query().setInspectionFlg_NotEqual_$1(); // 未検品のみ検索
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		List<CDef.PackingStatus> inScopePackingStatus = new ArrayList<CDef.PackingStatus>();
		inScopePackingStatus.add(CDef.PackingStatus.$30); // ピッキング中
		inScopePackingStatus.add(CDef.PackingStatus.$40); // 出荷検品中 (一部ケースピッキング完了)

		cb.query().queryTPackingH().setPackingStatus_InScope_AsPackingStatus(inScopePackingStatus);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() < 1) {
			// データなし
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		Set<Long> packingHIdSet = new HashSet<Long>();

		for (TPackingB packingB : packingBList) {
			packingHIdSet.add(packingB.getPackingHId());
		}

		// ===== 出庫フラグを「1：出庫済」に更新 =====
		// ===== 検品フラグを「1：検品済」に更新 =====

		for (TPackingB packingB : packingBList) {
			packingB.setPickingFlg_$1();
			packingB.setInspectionFlg_$1();
		}
		tPackingBBhv.batchUpdate(packingBList);

		// ===== 各ヘッダのステータス更新 =====

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

		// 検品中または検品済に変更
		shipStatusUpdateLogic.packingInspected(packingHList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 荷札の自動印刷 =====

		MClientCenter paramCondition = new MClientCenter();
		paramCondition.setCenterId(centerId);
		paramCondition.setClientId(clientId);

		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(paramCondition);

		autoPrintTagLabel(packingHIdSet, mParam, errSts);
		if (0 < getErrorManager().size()) {

			return;
		}
	}

	/**
	 * <h2>ケース荷札自動発行.</h2>
	 * <pre>
	 * パラメータマスタの検品後荷札出力の設定に従い、
	 * ケース荷札を自動印刷する。
	 * </pre>
	 * @param packingHIdSet 対象の梱包ヘッダIDリスト
	 * @param mParam
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void autoPrintTagLabel(Collection<Long> packingHIdList, MParam mParam, ErrorStatus errSts) {
			// [Ver3.1][#5118] if文削除 2018.09.18 matsutmoto Del
			// パラメータマスタの検品後荷札出力が「2: ケース出荷検品後に出力」又は「3:バラ・ケース出荷検品後に出力」の場合は自動印刷
			// [Ver3.1][#5117]荷札自動発行の際に使用するロジックの変更 2018.09.18 matsumoto Start
			// 荷札発行メソッド呼出し
			shippingInspectAutoPrintLogic.printCase(packingHIdList, mParam, errSts );
			// [Ver3.1][#5117]荷札自動発行の際に使用するロジックの変更 2018.09.18 matsumoto End
			if (0 < getErrorManager().size()) {

				// 自動発行以外のエラーがある場合は処理終了
				for (Map.Entry<Integer, BaseException> entry : getErrorManager().get().entrySet()) {
					BaseException e = entry.getValue();
					int statusCd = e.getStatusCd();
					int subStatusCd = e.getSubStatusCd();

					if (statusCd != STATUS_CD_AUTO_PRINT_ERROR || subStatusCd != STATUS_CD_AUTO_PRINT_ERROR) {
						return;
					}
				}

				// 自動発行エラー(エラーはクリアして警告を登録)
				getErrorManager().clear();
				this.getWarnManager().add(warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.CASE_PICKING_AUTO_TAG_PRINT_FAILED_WARN);

			}
	}

	// [Ver3.1][#5117]荷札自動発行の際に使用するロジックの変更(梱包帳票にコントロールNo.設定削除) 2018.09.18 matsumoto Del

	// [Ver3.1][#5117]荷札自動発行の際に使用するロジックの変更(梱包帳票のコントロールNo.をクリア削除) 2018.09.18 matsumoto Del

	/**
	 * <h2>ケースピッキング解除処理(出庫フラグ、ステータスの更新).</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・出庫フラグ、検品フラグの更新 (未出庫、未検品)
	 * ・各ヘッダのステタース更新 (出庫指示済)
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void clearPickingFlg(long centerId, long clientId, String casePickingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		// 更新条件
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.setupSelect_TPackingH();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() < 1) {
			// データなし
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		// ===== 出庫フラグを「0：未出庫」に更新 =====
		// ===== 検品フラグを「0：未検品」に更新 =====

		for (TPackingB packingB : packingBList) {
			packingB.setPickingFlg_$0();
			packingB.setInspectionFlg_$0();
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

	// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana Start

	/**
	 * <h2>ケースピッキングNo設定(全て).</h2>
	 * <pre>
	 * ケースピッキング対象の梱包全てにケースピッキングNo.を設定する。
	 * ケースピッキングNo.が未設定の梱包ボディを検索し、ケースピッキングNo.を設定する。
	 *
	 * 【DB更新】
	 * ・出庫帳票 : 変更なし (対象にコントロールNo.をつけて、処理後に外す)
	 * ・梱包ボディ : ケースピッキングNo.
	 * </pre>
	 */
	public void updateAllCasePickingNo(final CasePickingSelectLogic.SelectCondition searchCondition, ErrorStatus errSts) {

		if (!CU.isNullOrEmpty(searchCondition.getCasePickingNo())) {
			// ケースピッキングNo.指定あり
			return;
		}

		// ===== 対象にコントロールNoを設定 =====

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();

		cb.query().setControlNo_IsNull();
		cb.query().queryTPickingH().queryTAllocInstH().setWorkDt_GreaterEqual(searchCondition.getWorkDtFrom());
		cb.query().queryTPickingH().queryTAllocInstH().setWorkDt_LessEqual(searchCondition.getWorkDtTo());
		cb.query().queryTPickingH().queryTAllocInstH().setShippingDt_GreaterEqual(searchCondition.getShippingDtFrom());
		cb.query().queryTPickingH().queryTAllocInstH().setShippingDt_LessEqual(searchCondition.getShippingDtTo());

		cb.query().queryTPickingH().existsTPackingHList(new SubQuery<TPackingHCB>() {

			@Override
			public void query(TPackingHCB tphCb) {

				tphCb.query().setCenterId_Equal(searchCondition.getCenterId());
				tphCb.query().setClientId_Equal(searchCondition.getClientId());
				tphCb.query().setMixedFlg_Equal_$0(); // 単品(ケース梱包)
				tphCb.query().setPackingStatus_Equal_$25(); // 出庫指示済
				tphCb.query().existsTPackingBList(new SubQuery<TPackingBCB>() {
					@Override
					public void query(TPackingBCB tpbCb) {
						tpbCb.query().setCasePickingNo_IsNull(); // ケースピッキングNo. = null
					}
				});
			}
		});

		long controlNo = numberingCenterLogic.getControlNo();

		TPickingR controlNoPickingR = tPickingRBhv.newMyEntity();
		controlNoPickingR.setControlNo(controlNo);

		int updateCount = tPickingRBhv.queryUpdate(controlNoPickingR, cb);

		if (updateCount < 1) {
			// 対象なし(全てケースピッキングNo.がついている)

			return;
		}

		// ===== ケースピッキングNo.設定 =====

		pickingNoUpdateLogic.updateNoCasePickingList(controlNoPickingR, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== コントロールNo.クリア =====

		TPickingRCB clearCb = tPickingRBhv.newMyConditionBean();
		clearCb.query().setControlNo_Equal(controlNo);

		TPickingR clearEntity = tPickingRBhv.newMyEntity();
		clearEntity.setControlNo(null);

		int clearCount = tPickingRBhv.queryUpdate(clearEntity, clearCb);

		if (updateCount != clearCount) {
			getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}
	}

	// [#5136][v3.1] SDケースピッキング開始時に対象全てにケースピッキングNo.を設定する 2018.08.27 kawana End
}