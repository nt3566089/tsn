package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 処理区分マスタメンテナンス取得ロジッククラス
 */
public class ProcessTypeMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * <h2>処理区分マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースから処理区分マスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProcessType ：処理区分CD・処理区分名称・入荷フラグ・出荷フラグ・在庫調整フラグ・デフォルトフラグ・削除フラグ・在庫区分
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MProcessType> 処理区分マスタデータのリスト
	 */
	public List<MProcessType> select(MProcessType mProcessType, ErrorStatus errSts) {

		List<MProcessType> result = null;

		// ===== 処理区分マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.setupSelect_MStockType();
		cb.setupSelect_VDict(getCultureId());

		// 処理区分CDの設定
		cb.query().setProcessTypeCd_PrefixSearch(mProcessType.getProcessTypeCd());
		// 処理区分名称の設定
		if (mProcessType.getVDict() != null){
			cb.query().queryVDict(getCultureId()).setDictNm_PrefixSearch(mProcessType.getVDict().getDictNm());
		}
		// 入荷フラグの設定
		cb.query().setReceiveFlg_Equal(mProcessType.getReceiveFlg());
		// 出荷フラグの設定
		cb.query().setShippingFlg_Equal(mProcessType.getShippingFlg());
		// 在庫調整フラグの設定
		cb.query().setStockAdjustFlg_Equal(mProcessType.getStockAdjustFlg());
		// デフォルトフラグの設定
		cb.query().setDefaultFlg_Equal(mProcessType.getDefaultFlg());
		// 在庫区分の設定
		cb.query().queryMStockType().setStockTypeCd_Equal(mProcessType.getMStockType().getStockTypeCd());
		//削除フラグの設定
		//cb.query().setDelFlg_Equal(mProcessType.getDelFlg());

		// ソート順の設定
		cb.query().addOrderBy_ProcessTypeCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== 処理区分マスタ検索実行 =====
		result = selectList(mProcessTypeBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}
}