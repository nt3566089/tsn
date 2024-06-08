package com.oneslogi.wms.resources.daily;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.daily.ReceiveDesignMasterUpdateDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.daily.ReceiveDesignMasterUpdateLogic;
import com.oneslogi.wms.logic.daily.ReceiveDesignMasterUpdateSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 受入デザイン更新のリソースクラス。
 */
@Path("/daily/receiveDesignMasterUpdate")
public class ReceiveDesignMasterUpdateResource extends AbstractWmsResource {

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
		 * 警告終了
		 */
		protected static final int WARNING = 4;

		/**
		 * 異常終了
		 */
		protected static final int ABNORMAL = 9;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ReceiveDesignMasterUpdateLogic ReceiveDesignMasterUpdateLogic;
	@Inject
	ReceiveDesignMasterUpdateSelectLogic ReceiveDesignMasterUpdateSelectLogic;
	
	/**
	 * <h2>受入デザインマスタ更新</h2>
	 * <pre>
	 * 受入デザインマスタの有効区分を更新する。
	 * </pre>
	 * @param centerCd 拠点CD
	 * @param clientCd 荷主CD
	 * @return ReceiveDesignMasterUpdateDto 受入デザインマスタ更新DTO 
	 */
	@GET
	@Path("/register")
	public ReceiveDesignMasterUpdateDto register(@QueryParam("centerCd") String centerCd,
			@QueryParam("clientCd") String clientCd) {
		
		ReceiveDesignMasterUpdateDto result = new ReceiveDesignMasterUpdateDto();
		result.status.statusCode = StatusCode.SUCCESS;

		// 運用ログ書込み開始
		ReceiveDesignMasterUpdateLogic.startLog(WmsMessageConst.RECEIVE_DESIGN_MASTER_UPDATE_PROGRAM_NAME_INFORMATION, centerCd, clientCd);
		ReceiveDesignMasterUpdateLogic.addInfoLog(WmsMessageConst.CALL_BATCH_PARAMETER_INFORMATION, new String[] {centerCd, clientCd});
		
		// 処理開始時のログ明細出力
		ReceiveDesignMasterUpdateLogic.startLogSection(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		
		// コントロールNo.取得
		Long controlNo = numberingLogic.getControlNo();

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 該当データなしエラー
		if (mCenter == null) {
			ReceiveDesignMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					ReceiveDesignMasterUpdateLogic.getMessage(WmsMessageConst.CENTER_NOT_FOUND_ERROR));
			ReceiveDesignMasterUpdateLogic.endLogSection();
			ReceiveDesignMasterUpdateLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}
		long centerId = mCenter.getCenterId();
		
		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 該当データなしエラー
		if (mClient == null) {
			ReceiveDesignMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					ReceiveDesignMasterUpdateLogic.getMessage(WmsMessageConst.CLIENT_NOT_FOUND_ERROR));
			ReceiveDesignMasterUpdateLogic.endLogSection();
			ReceiveDesignMasterUpdateLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}
		long clientId = mClient.getClientId();
		
		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setCenterId(centerId);
		mClientCenter.setClientId(clientId);
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// 該当なしエラー
		if(mClientCenter == null) {
			ReceiveDesignMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					ReceiveDesignMasterUpdateLogic.getMessage(WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR));
			ReceiveDesignMasterUpdateLogic.endLogSection();
			ReceiveDesignMasterUpdateLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}
		String systemDt = mClientCenter.getSystemDt();


		// 有効区分を検索
		boolean existValidTypeFutur = ReceiveDesignMasterUpdateSelectLogic.existMMfrcvdesignValidTypeFutur(systemDt);
		boolean existValidTypeApplicable = ReceiveDesignMasterUpdateSelectLogic.existMMfrcvdesignValidTypeApplicable(systemDt);
		int updateCount = 0;
		if(existValidTypeFutur || existValidTypeApplicable) {
			// コントロールNo.更新
			ReceiveDesignMasterUpdateSelectLogic.updateMMfrcvdesignControlNo(systemDt, controlNo);
			
			// 有効区分更新
			if(existValidTypeFutur) {
				updateCount += ReceiveDesignMasterUpdateSelectLogic.updateMMfrcvdesignValidTypeFuturToApplicable(systemDt);
			}
			
			if(existValidTypeApplicable) {
				updateCount += ReceiveDesignMasterUpdateSelectLogic.updateMMfrcvdesignValidTypeApplicableToPast(systemDt);
			}
			
			// コントロールNo.更新(クリア)
			ReceiveDesignMasterUpdateSelectLogic.updateMMfrcvdesignControlNo(controlNo);
		}
		
		// 運用ログ明細にデータ出力結果を出力
		ReceiveDesignMasterUpdateLogic.addInfoLog(WmsMessageConst.UPDATE_RECEIVE_DESIGN_MASTER_VALID_TYPE, String.valueOf(updateCount));

		// 運用ログ明細にデータ出力完了を出力
		ReceiveDesignMasterUpdateLogic.endLogSection();

		// 運用ログ書き込み完了
		ReceiveDesignMasterUpdateLogic.endSuccessLog();
		
		return result;
	}
}
