package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.PReportCB;
import com.oneslogi.base.dbflute.cbean.PReportLayoutCB;
import com.oneslogi.base.dbflute.exbhv.PReportBhv;
import com.oneslogi.base.dbflute.exbhv.PReportLayoutBhv;
import com.oneslogi.base.dbflute.exentity.PReport;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 帳票マスタ共通ロジッククラス
 */
public class ReportLogic extends AbstractWmsLogic {

	@Inject
	private PReportBhv pReportBhv;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 Start
	@Inject
	private PReportLayoutBhv pReportLayoutBhv;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 End

	/**
	 * <h2>帳票マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に帳票マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 帳票マスタ：帳票ID
	 * @return PReport 帳票マスタ
	 */
	public PReport getPkEntityWithDeletedCheck(PReport entity) {
		if (entity.getReportId() == null) {
			return null;
		}
		return pReportBhv.selectByPKValueWithDeletedCheck(entity.getReportId());
	}

	/**
	 * <h2>帳票マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に帳票マスタデータを取得する。
	 * </pre>
	 * @param entity 帳票マスタ：帳票ID
	 * @return PReport 帳票マスタ
	 */
	public PReport getPkEntity(PReport entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>帳票マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に帳票マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 帳票マスタ：帳票ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PReport 帳票マスタ
	 */
	public PReport getPkEntity(PReport entity, ErrorStatus errSts) {
		PReport resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "reportNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>帳票マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に帳票マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 帳票マスタ：帳票CD
	 * @return PReport 帳票マスタ
	 */
	public PReport getUkEntityWithDeletedCheck(PReport entity) {
		if (CU.isNullOrEmpty(entity.getReportCd())) {
			return null;
		}
		PReportCB cb = pReportBhv.newMyConditionBean();
		cb.query().setReportCd_Equal(entity.getReportCd());
		return pReportBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>帳票マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に帳票マスタデータを取得する。
	 * </pre>
	 * @param entity 帳票マスタ：帳票CD
	 * @return PReport 帳票マスタ
	 */
	public PReport getUkEntity(PReport entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>帳票マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に帳票マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 帳票マスタ：帳票CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PReport 帳票マスタ
	 */
	public PReport getUkEntity(PReport entity, ErrorStatus errSts) {
		PReport resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "reportNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>レポートＣＤを条件にレポートＩＤを返す。</h2>
	 * <pre>
	 * レポートＣＤを条件にレポートＩＤを返す。
	 * </pre>
	 * @param reportCd レポートＣＤ
	 * @return Long レポートＩＤ
	 */
	public Long getReportId(String reportCd) {
		PReport entity = pReportBhv.newMyEntity();
		entity.setReportCd(reportCd);
		PReport resultEntity = getUkEntityWithDeletedCheck(entity);
		return resultEntity.getReportId();
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 Start
	/**
	 * <h2>レポートIDと自動印刷対象フラグを条件に帳票レイアウトエンティティを返す。</h2>
	 * <pre>
	 * 自動印刷対象フラグより、帳票レイアウトエンティティを返す。
	 * </pre>
	 * @param reportId レポートID
	 * @param autoPrintTargetFlg
	 * @return PReportLayout 帳票レイアウトエンティティ
	 */
	public PReportLayout getPReportLayout(Long reportId,String autoPrintTargetFlg) {
		// [ON推-UT210-017 ]　自動印刷対象判定追加　SJA 2016.07.05 Start
		PReportLayout resultEntity = null;		
		try {
			// [ON推-UT210-017 ]　自動印刷対象判定追加　SJA 2016.07.05 End
			PReportLayoutCB cb = pReportLayoutBhv.newMyConditionBean();
			cb.setupSelect_PReport();
			cb.setupSelect_PLayoutPrintSettingAsOne();
			cb.query().setReportId_Equal(reportId);
			cb.query().setAutoPrintTargetFlg_Equal(autoPrintTargetFlg);
			// [ON推-UT210-017 ]　自動印刷対象判定追加　SJA 2016.07.05 Start
			//return pReportLayoutBhv.selectEntityWithDeletedCheck(cb);
			resultEntity = pReportLayoutBhv.selectEntityWithDeletedCheck(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			return null;
		}
		return resultEntity;
		// [ON推-UT210-017 ]　自動印刷対象判定追加　SJA 2016.07.05 End
	}
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 End
}
