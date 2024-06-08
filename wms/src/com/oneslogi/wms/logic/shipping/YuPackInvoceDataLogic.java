package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゆうぱっく送り状データ作成ロジッククラス
 */
public class YuPackInvoceDataLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	/**
	 * <h2>ゆうぱっく送り状データを取得する。</h2>
	 * <pre>
	 * 引数をキーにゆうぱっく送り状マスタからデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingH 出庫ヘッダ:センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCarrierSlipYupk> ゆうぱっく送り状マスタリスト
	 */
	public List<MCarrierSlipYupk> selectmCarrierSlipSgw(final TPickingH tPickingH,ErrorStatus errSts) {

		List<MCarrierSlipYupk> result = null;

		// ===== ゆうぱっく送り状マスタデータ取得 =====
		MCarrierSlipYupkCB mCarrierSlipYupkCB = mCarrierSlipYupkBhv.newMyConditionBean();

		// 検索条件の設定
		mCarrierSlipYupkCB.query().setTagType_Equal(tPickingH.getTagType());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
		//センタID（Center_ID）
		mCarrierSlipYupkCB.query().setCenterId_Equal(tPickingH.getCenterId());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

		// 検索実行
		result = mCarrierSlipYupkBhv.selectList(mCarrierSlipYupkCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}
}
