/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * AGV移動指示データ出力ロジッククラス
 */
public class AmsMoveRequestsOutputLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private MParamBhv mParamBhv;
	/**
	 * <h2>AGV移動指示データ取得。</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する。
	 * 取得データが0件チェック
	 *
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・梱包ボディ
	 * ・梱包ヘッダ
	 * ・出庫ボディ
	 * ・出庫ヘッダ
	 * ・出庫帳票
	 * ・引当指示ボディ
	 * ・引当指示ヘッダ
	 * ・出荷指示ボディ
	 * ・出荷指示ヘッダ
	 * ・商品マスタ
	 * ・ロケーションマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (出庫帳票)
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param report 出庫帳票
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<TPackingB> 梱包ボディリスト
	 */
	public List<TPackingB> select(TPickingR report, ErrorStatus errSts){

		List<TPackingB> result = null;

		// ==== 梱包ボディデータ取得 =====

		// 検索条件の設定
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		// 梱包ヘッダ
		cb.setupSelect_TPackingH();
		// 荷主マスタ
		cb.setupSelect_TPackingH().withMClient();
		// センタマスタ
		cb.setupSelect_TPackingH().withMCenter();
		// 出庫ヘッダ
		cb.setupSelect_TPackingH().withTPickingH();
		// 引当指示ヘッダ
		cb.setupSelect_TPackingH().withTAllocInstH();
		// 商品マスタ
		cb.setupSelect_TAllocInstB().withMProduct();
		// 出庫ボディ
		cb.setupSelect_TPickingB();
		// 在庫データ
		cb.setupSelect_TPickingB().withTStock();
		// ロケマスタ
		cb.setupSelect_TPickingB().withTStock().withMLocation();
		// 出荷指示ヘッダ
		cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH();
		// 出庫帳票
		cb.setupSelect_TPackingH().withTPickingH().withTPickingRAsOne();

		// 検索条件の設定
		cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(report.getControlNo());

		// ソート条件
		// 荷主CD
		cb.query().queryTPackingH().queryMClient().addOrderBy_ClientCd_Asc();
		// センタCD
		cb.query().queryTPackingH().queryMCenter().addOrderBy_CenterCd_Asc();
		// 出庫作業No.
		cb.query().queryTPackingH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		// 出荷梱包No.
		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();
		// WMS出荷伝票No.
		cb.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc();
		// 商品CD
		cb.query().queryTAllocInstB().queryMProduct().addOrderBy_ProductCd_Asc();
		// ロケーションCD
		cb.query().queryTPickingB().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();

		result = selectList(tPackingBBhv, cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}

	/**
	 * <h2>出庫帳票更新。</h2>
	 * <pre>
	 * 下記テーブルのデータを更新する。
	 * ・出庫帳票
	 *
	 * 【パラメータの使用項目】
	 *  (出庫帳票(更新用))
	 *
	 *  (出庫ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・出庫ステータス
	 *
	 *  (出帳票(検索用))
	 * ・出荷実績出力フラグ
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param header 出庫ヘッダ
	 * @param report 出庫帳票(検索用)
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateControlNo(TPickingR update, TPickingH header, TPickingR report, ErrorStatus errStatus) {
		// ===== 出庫帳票データ更新 =====
		TPickingRCB cb = tPickingRBhv.newConditionBean();
		cb.setupSelect_TPickingH();

		// 検索条件
		cb.query().queryTPickingH().setClientId_Equal(header.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(header.getCenterId());
		//フラグ管理はしていないので必要に応じてカスタマイズしてください
		//cb.query().setAgvOutFlg_Equal(report.getAgvOutFlg());
		//フラグ管理はしていないので必要に応じてカスタマイズしてください

		// ===== 出庫帳票の更新 =====
		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>AGV移動指示出力フラグ更新。</h2>
	 * <pre>
	 * 下記テーブルのデータを更新する。
	 * ・出庫帳票
	 *
	 * 【パラメータの使用項目】
	 *  (出庫帳票(更新用))
	 *  ・コントロールNo.(NULL)
	 *
	 *  (出庫帳票(検索用))
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param report 出庫帳票(検索用)
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateAgvOutFlg(TPickingR update, TPickingR report, ErrorStatus errStatus){

		// ===== 出庫帳票データ更新 =====

		// 更新条件を作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());
		// ===== 出庫帳票の更新 =====
		tPickingRBhv.queryUpdate(update, cb);

	}

	/**
	 * <h2>パラメータマスタの情報取得</h2>
	 * <pre>
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return List<MParam>:パラメータマスタリスト
	 */
	public List<MParam> getMParam(Long clientId, Long centerId) {
		//パラメータ情報の取得
		MParamCB mParamCB = mParamBhv.newMyConditionBean();
		mParamCB.setupSelect_MClientCenter();
		mParamCB.query().queryMClientCenter().setClientId_Equal(clientId);
		mParamCB.query().queryMClientCenter().setCenterId_Equal(centerId);
		List<MParam> lstMParam = mParamBhv.selectList(mParamCB);
		return lstMParam;
	}
}

