package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYmtCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ヤマト送り状マスタメンテナンス取得ロジッククラス
 */
public class CarrierSlipYmtMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYmtBhv MCarrierSlipYmtBhv;

	/**
	 * <h2>ヤマト送り状マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからヤマト送り状マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrierSlipYmt ヤマト送り状マスタ：センタID・データ種別・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCarrierSlipYmt> ヤマト送り状マスタリスト
	 */
	public List<MCarrierSlipYmt> select(MCarrierSlipYmt mCarrierSlipYmt, PagingData paging, ErrorStatus errSts) {

		List<MCarrierSlipYmt> result = null;

		// ===== ヤマト送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipYmtCB cb = MCarrierSlipYmtBhv.newMyConditionBean();
		cb.setupSelect_MCenter();

//		2016.03.12 Zhang 一覧編集 ※4  Start
		// 文字コード
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByCharacterCd().withVDict(getCultureId());
		// 送り状種別
		cb.setupSelect_BClassDtlBySlipType().withVDict(getCultureId());
		// クール区分
		cb.setupSelect_BClassDtlByCoolCls().withVDict(getCultureId());
		// 個数口表示フラグ
		cb.setupSelect_BClassDtlByPackingShowFlg().withVDict(getCultureId());
		// 削除フラグ
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
//		2016.03.12 Zhang 一覧編集 ※4  End

		// データ種別 (前方一致)
		cb.query().setTagType_PrefixSearch(mCarrierSlipYmt.getTagType());
		//センタCDの設定(前方一致)
		cb.query().setCenterId_Equal(mCarrierSlipYmt.getCenterId());
		//削除フラグの設定(完全一致)
		cb.query().setDelFlg_Equal(mCarrierSlipYmt.getDelFlg());

		// ソート順の設定(データ種別)
		cb.query().addOrderBy_TagType_Asc();

		// ===== ヤマト送り状マスタ検索実行 =====
//		2016.02.18 Pan ページング ※3 Start
//		result = MCarrierSlipYmtBhv.selectList(cb);
		result = selectPage(MCarrierSlipYmtBhv, cb, paging);
//		2016.02.18 Pan ページング ※3 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	// 2016.02.23 Zhang 一覧編集 ※4 Start
	/**
	 * <h2>ヤマト送り状マスタを取得する。</h2>
	 * <pre>
	 * 引数をキーにヤマト送り状マスタからデータを取得する。
	 * 検索対象が見つからない場合、既に削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param carrierSlipYmtId ヤマト送り状マスタ：送り状定義ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipYmt ヤマト送り状マスタ
	 */
	public MCarrierSlipYmt selectById(long carrierSlipYmtId, ErrorStatus errSts) {
		//===== 編集データ取得 =====

		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCarrierSlipYmtCB cb = MCarrierSlipYmtBhv.newMyConditionBean();

		cb.setupSelect_MCenter();

		cb.query().setCarrierSlipYmtId_Equal(carrierSlipYmtId);

		//===== 検索実行 =====
		final MCarrierSlipYmt carrierSlipYmt = MCarrierSlipYmtBhv.selectEntity(cb);

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		if (carrierSlipYmt == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DELETED_CANNOT_DELETE_ERROR);
		}

		return carrierSlipYmt;
	}
	// 2016.02.23 Zhang 一覧編集 ※4 Start
}