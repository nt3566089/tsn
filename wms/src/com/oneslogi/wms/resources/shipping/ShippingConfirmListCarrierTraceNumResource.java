package com.oneslogi.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.logic.shipping.ShippingConfirmListCarrierTraceNumUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/shippingConfirmListCarrierTraceNum")
public class ShippingConfirmListCarrierTraceNumResource extends AbstractWmsResource {

	// ===== 使用テーブル =====
	@Inject
	private TPackingHBhv tPackingHBhv;
	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 更新異常
		 */
		protected static final int T_PACKING_H_UPDATE_FAILED = 1;
	}
		// ===== 使用ロジッククラス =====
	@Inject
	private ShippingConfirmListCarrierTraceNumUpdateLogic shippingConfirmListCarrierTraceNumUpdateLogic;
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 貨物追跡No.を表示する
		* </pre>
	 * @return carrierTraceNum 貨物追跡No.
	 */
	@GET
	@Path("/init")
	public String init(Long pickingHId) {
		// 梱包ヘッダ取得
		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.query().setPickingHId_Equal(pickingHId);
		// ===== 検索実行 =====
		List<TPackingH> tPackingHList = tPackingHBhv.selectList(cb);
		if (tPackingHList.size() > 0){
			return tPackingHList.get(0).getCarrierTraceNum();
		} else {
			return null;
		}
	}
	/**
	 * <h2>更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに梱包ヘッダを更新し。
	 *
	 * </pre>
	 * @param request[0] センタID
	 * @param request[1] Bill of Lading No.
	 * @param request[2] 貨物追跡No.
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(String[] request ) {
		// 梱包ヘッダ更新
		shippingConfirmListCarrierTraceNumUpdateLogic.update(request[0], request[1],request[2], errRetSts(StatusCode.T_PACKING_H_UPDATE_FAILED));

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
