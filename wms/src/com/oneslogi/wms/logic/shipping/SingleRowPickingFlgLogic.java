package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * 単行ピッキングフラグロジッククラス
 */
public class SingleRowPickingFlgLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPickingHBhv tPickingHBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private ParamLogic paramLogic;

	/**
	 * <h2>単行ピックフラグ設定。</h2>
	 * <pre>
	 * 下記条件で出庫ヘッダの単行ピックフラグを1に設定する。
	 * パラメータマスタ.単行ピックフラグが0の場合は何もしないで処理を終了する。
	 *
	 * 【単行ピック条件】
	 *  ・引数のセンタID、荷主ID、コントロールNo. (出荷指示ヘッダ)
	 *  ・引当指示ボディが1件
	 *  ・出庫ボディが1件
	 *  ・指示数がパラメータマスタ.単行ピック上限指示数以下 (引当指示ボディ)
	 *  ・欠品なし
	 *  ・引当商品が小数を含まない (荷姿グループマスタ)
	 *
	 * 【検索テーブル】
	 * ・出荷指示ヘッダ
	 * ・引当指示ヘッダ
	 * ・引当指示ボディ
	 * ・商品マスタ
	 * ・荷姿グループマスタ
	 *
	 * 【更新テーブル】
	 * ・出庫ヘッダ
	 *
	 * 【パラメータの使用項目】
	 *  (出荷指示ヘッダ)
	 *  ・センタID
	 *  ・荷主ID
	 *  ・コントロールNo.
	 *
	 * </pre>
	 *
	 * @param shippingInstHead 出荷指示ヘッダ:センタID、荷主ID、コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateSglRowPicFlg(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();

		// ===== パラメータマスタ取得 =====

		MClientCenter mccCb = new MClientCenter();
		mccCb.setCenterId(centerId);
		mccCb.setClientId(clientId);
		MParam param = paramLogic.getUkEntityUseCash(mccCb);

		if (!param.isSglRowPicFlg$1()) {
			// 単行ピックしない
			return;
		}

		// ===== 単行ピックフラグを設定する条件作成 =====

		final long controlNo = shippingInstHead.getControlNo();

		TPickingHCB cb = tPickingHBhv.newMyConditionBean();

		// 出荷指示ヘッダのコントロールNo.を条件
		cb.query().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB tsihCb) {
				tsihCb.query().setCenterId_Equal(centerId);
				tsihCb.query().setClientId_Equal(clientId);
				tsihCb.query().setControlNo_Equal(controlNo);
			}
		});

		// 引当指示ボディが1件
		cb.query().queryTAllocInstH().derivedTAllocInstBList().count(new SubQuery<TAllocInstBCB>() {

			@Override
			public void query(TAllocInstBCB taibCb) {
				taibCb.specify().columnAllocInstBId();
				// ここで上限指示数や小数フラグ有無を設定すると
				// 件数が変化してしまうためNG
			}
		}).equal(1);

		// 出庫ボディが1件
		cb.query().derivedTPickingBList().count(new SubQuery<TPickingBCB>() {

			@Override
			public void query(TPickingBCB tpbCb) {
				tpbCb.specify().columnPickingBId();
			}
		}).equal(1);

		final long maxInstNum = param.getSglRowPicMaxInstNum();

		cb.query().queryTAllocInstH().existsTAllocInstBList(new SubQuery<TAllocInstBCB>() {

			@Override
			public void query(TAllocInstBCB taibCb) {
				// 最大指示数以下
				taibCb.query().setInstNum_LessEqual(WCC.toBigDecimal(maxInstNum));
				// 小数を含まない商品
				taibCb.query().queryMProduct().queryMShapeGrp().setDecimalExistFlg_Equal_$0();
			}
		});

		// 欠品・緊急なし
		cb.query().queryTAllocInstH().derivedTShippingInstHList().count(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB tsihCb) {
				tsihCb.specify().columnShippingInstHId();
				tsihCb.orScopeQuery(new OrQuery<TShippingInstHCB>() {

					@Override
					public void query(TShippingInstHCB tsihOrCb) {

						tsihOrCb.query().setStockOutFlg_Equal_$1();
						tsihOrCb.query().setEmergencyFlg_Equal_$1();
					}
				});
			}
		}).equal(0);

		// ===== 単行ピックフラグ更新実行 =====

		TPickingH entity = tPickingHBhv.newMyEntity();
		entity.setSglRowPicFlg_$1();

		// 更新実行
		tPickingHBhv.queryUpdate(entity, cb);
	}
}