package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 佐川データ作成処理ロジッククラス
 */
public class SagawaInvoceDataLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;

	/**
	 * <h2>佐川送り状マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに佐川送り状マスタからデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingH 出庫ヘッダ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCarrierSlipSgw> 佐川送り状マスタリスト
	 */
	public List<MCarrierSlipSgw> selectmCarrierSlipSgw(final TPickingH tPickingH,ErrorStatus errSts) {

		List<MCarrierSlipSgw> result = null;

		// ===== 佐川送り状マスタデータ取得 =====
		MCarrierSlipSgwCB mCarrierSlipSgwCB = mCarrierSlipSgwBhv.newMyConditionBean();

		// 検索条件の設定
		mCarrierSlipSgwCB.query().setTagType_Equal(tPickingH.getTagType());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
		//センタID（Center_ID）
		mCarrierSlipSgwCB.query().setCenterId_Equal(tPickingH.getCenterId());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

		// 検索実行
		result = mCarrierSlipSgwBhv.selectList(mCarrierSlipSgwCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}
}
