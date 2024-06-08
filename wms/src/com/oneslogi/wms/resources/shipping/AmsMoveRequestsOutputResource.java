package com.oneslogi.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.AmsMoveRequestsOutputDto;
import com.oneslogi.wms.dto.shipping.AmsMoveRequestsOutputDto.AgvMoveRequestsOutputBody;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.shipping.AmsMoveRequestsOutputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * AGV移動指示データ抽出のリソースクラス。
 */
@Path("/shipping/AmsMoveRequestsOutput")
public class AmsMoveRequestsOutputResource extends AbstractWmsResource {

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
	private ParamLogic paramLogic;
	@Inject
	private AmsMoveRequestsOutputLogic outputLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	/**
	 * <h2>AGV移動指示データ取得。</h2>
	 * <pre>
	 * ・AGV移動指示データ取得取り出し
	 * ・AGV移動指示DTOに設定
	 * </pre>
	 * @param  clientCd 荷主CD
	 * @param  centerCd センタCD
	 * @param  mapCd マップCD
	 * @param  outputMode 出力モード(1:ヘッダ行あり 2:ヘッダ行なし)
	 * @return AgvMoveRequestsDto AGV移動指示DTO
	 */
	@GET
	@Path("/search")
	public AmsMoveRequestsOutputDto search(@QueryParam("clientCd") String clientCd, @QueryParam("centerCd")String centerCd, @QueryParam("mapCd")String mapCd, @QueryParam("outputMode")String outputMode) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//移動要求バッチNo.を採番
		String moveRequestBatchNo = numberingCenterLogic.getNumbering("MOVE_REQUEST_BATCH_NO");

		// コントロールNo.更新
		// 更新用
		TPickingR update = new TPickingR();
		// 発行条件用
		TPickingH header = new TPickingH();
		TPickingR report = new TPickingR();

		// コントロールNo.の設定
		update.setControlNo(controlNo);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			header.setClientId(null);
		} else {
			header.setClientId(mClient.getClientId());
		}

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			header.setCenterId(null);
		} else {
			header.setCenterId(mCenter.getCenterId());
		}

		// 発行条件の設定
		//フラグ管理はしていないので必要に応じてカスタマイズしてください
		//report.setAgvOutFlg_$0(); //AGV移動指示データ未出力
		//フラグ管理はしていないので必要に応じてカスタマイズしてください

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		outputLogic.updateControlNo(update, header, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		// 出庫帳票(検索用)
		TPickingR tPickingR = new TPickingR();
		tPickingR.setControlNo(controlNo);

		// AGV移動指示データ取得メソッド呼出し
		List<TPackingB> selectEntity = outputLogic.select(tPickingR, errRetSts(StatusCode.NOT_FOUND_DATA));

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		//取得したデータを集約
		MParam mParam = new MParam();
		String clientCdBef = "";
		String centerCdBef = "";

		//１件のキー情報をセット(梱包計算ありは梱包No単位で集約)
		String defKeyBef = selectEntity.get(0).getTPackingH().getTPickingH().getPickingWorkNo();
		if ("1".equals(mParam.getPackingCalCls())){
			defKeyBef += selectEntity.get(0).getTPackingH().getShippingPackingNo();
		}
		defKeyBef += selectEntity.get(0).getTPickingB().getTShippingInstB().getTShippingInstH().getShippingSlipNo();
		defKeyBef += selectEntity.get(0).getTAllocInstB().getMProduct().getProductCd();
		defKeyBef += selectEntity.get(0).getTPickingB().getTStock().getMLocation().getLocationCd();
		BigDecimal packingNumSum = BigDecimal.ZERO;

		List<AgvMoveRequestsOutputBody> bodyList = new ArrayList<AgvMoveRequestsOutputBody>();

		//１行目にタイトル行をセット(ヘッダ行ありの場合のみ)
		if (outputMode.equals("1")){
			AgvMoveRequestsOutputBody bodyTitle = new AgvMoveRequestsOutputBody();
			//bodyTitle.batchNo = "移動要求バッチNo.";
			//bodyTitle.headerNo = "移動要求ヘッダNo.";
			//bodyTitle.lineNo = "移動要求行No.";
			//bodyTitle.linkNo = "移動要求連携No.";
			//bodyTitle.workNo = "移動要求作業No.";
			//bodyTitle.requestDetail = "要求内容";
			//bodyTitle.moveSource = "移動元";
			//bodyTitle.moveDestination = "移動先";
			//bodyTitle.item = "移動物品";
			//bodyTitle.quantity = "移動数";
			//bodyTitle.priority = "優先順位";
			bodyList.add(bodyTitle);
		}

		AgvMoveRequestsOutputBody body = new AgvMoveRequestsOutputBody();
		for (TPackingB entity : selectEntity) {
			//荷主、センターが変わったらパラメータマスタ取得
			if (!clientCdBef.equals(entity.getTPackingH().getMClient().getClientCd()) ||
				!centerCdBef.equals(entity.getTPackingH().getMCenter().getCenterCd())) {
				mParam = paramLogic.getMParam(entity.getTPackingH().getClientId(), entity.getTPackingH().getCenterId());
				clientCdBef = entity.getTPackingH().getMClient().getClientCd();
				centerCdBef = entity.getTPackingH().getMCenter().getCenterCd();
			}

			//比較用の集約キーを設定
			String defKey = entity.getTPackingH().getTPickingH().getPickingWorkNo();
			if ("1".equals(mParam.getPackingCalCls())){
				defKey += entity.getTPackingH().getShippingPackingNo();
			}
			defKey += entity.getTPickingB().getTShippingInstB().getTShippingInstH().getShippingSlipNo();
			defKey += entity.getTAllocInstB().getMProduct().getProductCd();
			defKey += entity.getTPickingB().getTStock().getMLocation().getLocationCd();

			//集約キーがブレイクした場合は集約結果をリストに格納
			if (!defKeyBef.equals(defKey)){
				body.quantity = Long.parseLong(packingNumSum.stripTrailingZeros().toPlainString());
				bodyList.add(body);
				body = new AgvMoveRequestsOutputBody();
				packingNumSum = BigDecimal.ZERO;
				defKeyBef = defKey;
			}

			body.batchNo = moveRequestBatchNo;
			body.headerNo = entity.getTPickingB().getTShippingInstB().getTShippingInstH().getShippingSlipNo();
			//body.lineNo = null;
			body.lineNo = 1L;
			body.linkNo = "";
			if ("1".equals(mParam.getPackingCalCls())){
				body.workNo = entity.getTPackingH().getShippingPackingNo();
			} else {
				body.workNo = entity.getTPackingH().getTPickingH().getPickingWorkNo();
			}
			body.requestDetail = "";
			body.moveSource = "";
			body.moveDestination = entity.getTPickingB().getTStock().getMLocation().getLocationCd();
			body.item = entity.getTAllocInstB().getMProduct().getProductCd();
			if ("1".equals(entity.getTPickingB().getTShippingInstB().getTShippingInstH().getEmergencyFlg())){
				body.priority = 1L; //緊急
			} else {
				body.priority = 2L; //通常
			}

			//指示数加算
			packingNumSum = packingNumSum.add(entity.getPackingNum());
		}

		//ループ最後の集約結果をリストに格納
		body.quantity = Long.parseLong(packingNumSum.stripTrailingZeros().toPlainString());
		bodyList.add(body);

		// ===== DTO の作成 =====
		AmsMoveRequestsOutputDto result = new AmsMoveRequestsOutputDto();
		result.data.mapCd = mapCd;
		result.data.moveRequests = bodyList;

		// 出庫帳票更新内容設定
		TPickingR tr = new TPickingR();
		tr.setControlNo(null);
		//フラグ管理はしていないので必要に応じてカスタマイズしてください
		//tr.setAgvOutFlg_$1();
		//tr.setAgvOutUserId(this.getUserId());
		//Timestamp time = new Timestamp(System.currentTimeMillis());
		//tr.setAgvOutDt(time);
		//フラグ管理はしていないので必要に応じてカスタマイズしてください

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		outputLogic.updateAgvOutFlg(tr, tPickingR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return result;
	}

}
