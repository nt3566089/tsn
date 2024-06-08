package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MMatchingCB;
import com.oneslogi.base.dbflute.exbhv.MMatchingBhv;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * マッチングマスタ共通ロジッククラス
 */
public class MatchingLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MMatchingBhv mMatcinghBhv;

	// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana Start

	// ===== enum =====

	/** 運送業者種別 */
	public enum CarrierCls {
		YAMATO,
		SAGAWA,
		YU_PACK
	}

	// ===== 内部定義 =====

	// 時間帯CD 変換
	private static final String MATCHING_TYPE_TZ_WMS_TO_YAMATO = "WMS_TO_YAMATO_DELIV_TZ";
	private static final String MATCHING_TYPE_TZ_WMS_TO_SAGAWA = "WMS_TO_SAGAWA_DELIV_TZ";
	private static final String MATCHING_TYPE_TZ_WMS_TO_YUPACK = "WMS_TO_YUPACK_DELIV_TZ";

	// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana End

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にマッチングマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity マッチングマスタ：マッチングID
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getPkEntityWithDeletedCheck(MMatching entity) {
		if (entity.getMatchingId() == null) {
			return null;
		}
		return mMatcinghBhv.selectByPKValueWithDeletedCheck(entity.getMatchingId());
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にマッチングマスタデータを取得する。
	 * </pre>
	 * @param entity マッチングマスタ：マッチングID
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getPkEntity(MMatching entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にマッチングマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity マッチングマスタ：マッチングID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getPkEntity(MMatching entity, ErrorStatus errSts) {
		MMatching resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.MATCHING_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にマッチングマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity マッチングマスタ：マッチング種類・マッチングキーワード
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getUkEntityWithDeletedCheck(MMatching entity) {

		if (CU.isNullOrEmpty(entity.getMatchingType())) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getMatchingKeyword())) {
			return null;
		}

		MMatchingCB cb = mMatcinghBhv.newMyConditionBean();
		cb.query().setMatchingType_Equal(entity.getMatchingType());
		cb.query().setMatchingKeyword_Equal(entity.getMatchingKeyword());
		return mMatcinghBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にマッチングマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity マッチングマスタ：マッチング種類・変換CD
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getUkEntityByCdWithDeletedCheck(MMatching entity) {

		if (CU.isNullOrEmpty(entity.getMatchingType())) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getTransformCd())) {
			return null;
		}

		MMatchingCB cb = mMatcinghBhv.newMyConditionBean();
		cb.query().setMatchingType_Equal(entity.getMatchingType());
		cb.query().setTransformCd_Equal(entity.getTransformCd());
		return mMatcinghBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にマッチングマスタデータを取得する。
	 * </pre>
	 * @param entity マッチングマスタ：マッチング種類・マッチングキーワード
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getUkEntity(MMatching entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にマッチングマスタデータを取得する。
	 * </pre>
	 * @param entity マッチングマスタ：マッチング種類・変換CD
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getUkEntityByCd(MMatching entity) {
		return getUkEntityByCd(entity, null);
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にマッチングマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity マッチングマスタ：マッチング種類・マッチングキーワード
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getUkEntity(MMatching entity, ErrorStatus errSts) {
		MMatching resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.MATCHING_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>マッチングマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にマッチングマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity マッチングマスタ：マッチング種類・変換CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MMatching マッチングマスタ
	 */
	public MMatching getUkEntityByCd(MMatching entity, ErrorStatus errSts) {
		MMatching resultEntity = null;
		try {
			resultEntity = getUkEntityByCdWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.MATCHING_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana Start

	/**
	 * <h2>時間帯CDの変換(WMS⇒運送業者).</h2>
	 * <pre>
	 * WMSの時間帯CDから運送業者の時間帯CDに変換する。
	 * マッチングマスタに登録がない場合は空文字を返却。
	 * </pre>
	 * @param carrierCls 運送業者種別
	 * @param delivTz WMSの時間帯CD
	 * @return 変換後の時間帯CD
	 */
	public String convertDelivTzWmsToCarrier(CarrierCls carrierCls, String delivTz) {

		if (CU.isNullOrEmpty(delivTz)) {
			return "";
		}

		String matchingType;
		switch (carrierCls) {
		case YAMATO:
			matchingType = MATCHING_TYPE_TZ_WMS_TO_YAMATO;
			break;
		case SAGAWA:
			matchingType = MATCHING_TYPE_TZ_WMS_TO_SAGAWA;
			break;
		case YU_PACK:
			matchingType = MATCHING_TYPE_TZ_WMS_TO_YUPACK;
			break;
		default:
			return delivTz;
		}

		// マッチングマスタを検索
		MMatching cb = new MMatching();
		cb.setMatchingType(matchingType);
		cb.setMatchingKeyword(delivTz);
		MMatching matching = getUkEntity(cb);
		if (matching == null) {
			return "";
		} else {
			return matching.getTransformCd();
		}
	}

	// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana End
}
