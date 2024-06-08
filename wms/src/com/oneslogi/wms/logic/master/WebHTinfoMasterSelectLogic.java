package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MWebHtInfoCB;
import com.oneslogi.base.dbflute.exbhv.MWebHtInfoBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * WEBHT管理マスタメンテナンス取得ロジッククラス
 */
public class WebHTinfoMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MWebHtInfoBhv mWebHtInfoBhv;

	/**
	 * <h2>WEBHT管理マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからWEBHT管理マスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mWebHtInfo WEBHT管理マスタ：管理情報ID・MACアドレス・削除フラグ
	 * @param mCenter センタマスタ：センタID
	 * @param mWarehouse 倉庫マスタ：倉庫ID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MWebHtInfo> WEBHT管理マスタリスト
	 */
	public PagingResultBean<MWebHtInfo> select(MWebHtInfo mWebHtInfo, MCenter mCenter, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MWebHtInfo> result = null;
		// ===== WEBHT管理マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MWebHtInfoCB cb = mWebHtInfoBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MClient();

		// センタIDの設定
		cb.query().setCenterId_Equal(mCenter.getCenterId());
		// 荷主IDの設定
		cb.query().setClientId_Equal(mWebHtInfo.getClientId());
		// MACアドレスの設定
		cb.query().setMacAddress_PrefixSearch(mWebHtInfo.getMacAddress());

		// 削除フラグの設定
		cb.query().setDelFlg_Equal(mWebHtInfo.getDelFlg());

		// ソート順の設定
		cb.query().addOrderBy_WebHtInfoId_Asc();

		// ===== WEBHT管理マスタ検索実行 =====
		result = selectPage(mWebHtInfoBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

}