package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゆうパック送り状マスタメンテナンス取得ロジッククラス
 */
public class CarrierSlipYupkMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYupkBhv MCarrierSlipYupkBhv;

	/**
	 * <h2>ゆうパック送り状マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからゆうパック送り状マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrierSlipYupk ゆうパック送り状マスタ：センタID・データ種別・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCarrierSlipYupk> ゆうパック送り状マスタリスト
	 */
	public List<MCarrierSlipYupk> select(MCarrierSlipYupk mCarrierSlipYupk, PagingData paging, ErrorStatus errSts) {

		List<MCarrierSlipYupk> result = null;

		// ===== ゆうパック送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipYupkCB cb = MCarrierSlipYupkBhv.newMyConditionBean();
		cb.setupSelect_MCenter();

//		2016.03.15 Zhang 一覧編集 ※4  Start
		// 文字コード
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByCharacterCd().withVDict(getCultureId());
		// 郵便種別
		cb.setupSelect_BClassDtlByPostType().withVDict(getCultureId());
		// 保冷種別
		cb.setupSelect_BClassDtlByCoolType().withVDict(getCultureId());
		// 元/着払/代引
		cb.setupSelect_BClassDtlByCodType().withVDict(getCultureId());
		// 逆さま厳禁区分
		cb.setupSelect_BClassDtlByNoUpsideDownCls().withVDict(getCultureId());
		// 下済み厳禁区分
		cb.setupSelect_BClassDtlByNoStockCls().withVDict(getCultureId());
		// 削除フラグ
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
//		2016.03.15 Zhang 一覧編集 ※4  Start

		// データ種別 (前方一致)
		cb.query().setTagType_PrefixSearch(mCarrierSlipYupk.getTagType());
		//センタCDの設定(前方一致)
		cb.query().setCenterId_Equal(mCarrierSlipYupk.getCenterId());
		//削除フラグの設定(完全一致)
		cb.query().setDelFlg_Equal(mCarrierSlipYupk.getDelFlg());

		// ソート順の設定(データ種別)
		cb.query().addOrderBy_TagType_Asc();

		// ===== ゆうパック送り状マスタ検索実行 =====
//		2016.02.19 Pan ページング ※3 Start
//		result = MCarrierSlipYupkBhv.selectList(cb);
		result = selectPage(MCarrierSlipYupkBhv, cb, paging);
//		2016.02.19 Pan ページング ※3 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	// 2016.03.15 Zhang 一覧編集 ※4 Start
	/**
	 * <h2>ゆうパック送り状マスタを取得する。</h2>
	 * <pre>
	 * 引数をキーにゆうパック送り状マスタからデータを取得する。
	 * 検索対象が見つからない場合、既に削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param carrierSlipYupkId ゆうパック送り状マスタ：送り状定義ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipYupk ゆうパック送り状マスタ
	 */
	public MCarrierSlipYupk selectById(long carrierSlipYupkId, ErrorStatus errSts) {
		//===== 編集データ取得 =====

		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCarrierSlipYupkCB cb = MCarrierSlipYupkBhv.newMyConditionBean();

		cb.setupSelect_MCenter();

		cb.query().setCarrierSlipYupkId_Equal(carrierSlipYupkId);

		//===== 検索実行 =====
		final MCarrierSlipYupk carrierSlipYupk = MCarrierSlipYupkBhv.selectEntity(cb);

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		if (carrierSlipYupk == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DELETED_CANNOT_DELETE_ERROR);
		}

		return carrierSlipYupk;
	}
	// 2016.03.15 Zhang 一覧編集 ※4 Start
}