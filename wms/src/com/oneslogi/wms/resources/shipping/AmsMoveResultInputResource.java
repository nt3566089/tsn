package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.shipping.AmsMoveResultInputDto;
import com.oneslogi.wms.dto.shipping.AmsMoveResultInputDto.AmsMoveResultInputBody;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.shipping.AmsMoveResultInputLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * AGV移動完了データ取込のリソースクラス。
 */
@Path("/shipping/AmsMoveResultInput")
public class AmsMoveResultInputResource extends AbstractWmsResource {

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
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * AGV移動指示データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private ShippingCommonLogic commonLogic;

	@Inject
	private AmsMoveResultInputLogic updateLogic;

	/**
	 * <h2>AGV移動完了データ取込</h2>
	 * <pre>
	 * ・AGV移動完了データを取り込んで作業Noをキーにピッキングフラグを更新する
	 * </pre>
	 * @param  clientCd 荷主CD
	 * @param  centerCd センタCD
	 * @param  amsMoveResultInputDto AGV実績DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/regist")
	public StatusDto regist(@QueryParam("clientCd") String clientCd, @QueryParam("centerCd")String centerCd, AmsMoveResultInputDto amsMoveResultInputDto) {

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		Long clitneId = null;
		if (mClient != null) {
			clitneId = mClient.getClientId();
		}

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		Long centerId = null;
		if (mCenter != null) {
			centerId = mCenter.getCenterId();
		}

		//送信されたデータ件数分ループ
		List<AmsMoveResultInputBody> bodylist = new ArrayList<AmsMoveResultInputBody>();
		bodylist = amsMoveResultInputDto.data.moveRequests;
		List<String> pickingWorkNoList = new ArrayList<String>();
		List<String> packingNoList = new ArrayList<String>();
		for (AmsMoveResultInputBody body : bodylist) {
			final String targetNo = body.workNo;

			//梱包no判定
			if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
				// 出庫作業No.退避
				if (!pickingWorkNoList.contains(targetNo)){
					pickingWorkNoList.add(targetNo);
				}
			} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
				// 出荷梱包No.退避
				if (!packingNoList.contains(targetNo)){
					packingNoList.add(targetNo);
				}
			}
		}

		//出庫作業No.が存在する場合
		if (pickingWorkNoList.size() > 0){
			//出庫作業No.でピッキングフラグを更新
			updateLogic.updatePickingFlg(clitneId,centerId,pickingWorkNoList);
		}

		//出荷梱包No.が存在する場合
		if (packingNoList.size() > 0){
			//出荷梱包No.でピッキングフラグを更新
			updateLogic.updatePickingFlgByPackingNo(clitneId,centerId,packingNoList);
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return null;
	}
}
