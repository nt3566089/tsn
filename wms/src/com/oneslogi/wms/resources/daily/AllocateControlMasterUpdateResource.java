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
import com.oneslogi.wms.dto.daily.AllocateControlMasterUpdateDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.daily.AllocateControlMasterUpdateLogic;
import com.oneslogi.wms.logic.daily.AllocateControlMasterUpdateSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 引当制御マスタ更新のリソースクラス。
 */
@Path("/daily/allocateControlMasterUpdate")
public class AllocateControlMasterUpdateResource extends AbstractWmsResource {

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
	private AllocateControlMasterUpdateLogic allocateControlMasterUpdateLogic;
	@Inject
	private AllocateControlMasterUpdateSelectLogic allocateControlMasterUpdateSelectLogic;
	
	/**
	 * <h2>引当制御マスタ更新</h2>
	 * <pre>
	 * 引当制御マスタの有効区分を更新する。
	 * </pre>
	 * @param centerCd 拠点CD
	 * @param clientCd 荷主CD
	 * @return AllocateControlMasterUpdateDto 引当制御マスタ更新DTO 
	 */
	@GET
	@Path("/register")
	public AllocateControlMasterUpdateDto register(@QueryParam("centerCd") String centerCd,
			@QueryParam("clientCd") String clientCd) {
		
		AllocateControlMasterUpdateDto result = new AllocateControlMasterUpdateDto();
		result.status.statusCode = StatusCode.SUCCESS;

		// 運用ログ書込み開始
		allocateControlMasterUpdateLogic.startLog(WmsMessageConst.ALLOCATE_CONTROL_MASTER_UPDATE_PROGRAM_NAME_INFORMATION, centerCd, clientCd);
		allocateControlMasterUpdateLogic.addInfoLog(WmsMessageConst.CALL_BATCH_PARAMETER_INFORMATION, new String[] {centerCd, clientCd});
		
		//[TSN] ログ明細セクション名の修正。×「データ出力」→〇「データ登録」 2024.3.22 K.Nakaide Start
		// 処理開始時のログ明細出力
		//allocateControlMasterUpdateLogic.startLogSection(WmsMessageConst.OUTPUT_SECTION_NAME_OUTPUT_INFORMATION);
		allocateControlMasterUpdateLogic.startLogSection(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		//[TSN] ログ明細セクション名の修正。×「データ出力」→〇「データ登録」 2024.3.22 K.Nakaide End

		// コントロールNo.取得
		Long controlNo = numberingLogic.getControlNo();

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 該当データなしエラー
		if (mCenter == null) {
			allocateControlMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					allocateControlMasterUpdateLogic.getMessage(WmsMessageConst.CENTER_NOT_FOUND_ERROR));
			allocateControlMasterUpdateLogic.endLogSection();
			allocateControlMasterUpdateLogic.endFailureLog();
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
			allocateControlMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					allocateControlMasterUpdateLogic.getMessage(WmsMessageConst.CLIENT_NOT_FOUND_ERROR));
			allocateControlMasterUpdateLogic.endLogSection();
			allocateControlMasterUpdateLogic.endFailureLog();
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
			allocateControlMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					allocateControlMasterUpdateLogic.getMessage(WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR));
			allocateControlMasterUpdateLogic.endLogSection();
			allocateControlMasterUpdateLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}
		String systemDt = mClientCenter.getSystemDt();


		// 有効区分を検索
		boolean existValidTypeFutur = allocateControlMasterUpdateSelectLogic.existMMfpickctlValidTypeFutur(systemDt);
		boolean existValidTypeApplicable = allocateControlMasterUpdateSelectLogic.existMMfpickctlValidTypeApplicable(systemDt);
		int updateCount = 0;
		if(existValidTypeFutur || existValidTypeApplicable) {
			// コントロールNo.更新
			allocateControlMasterUpdateSelectLogic.updateMMfpickctlControlNo(systemDt, controlNo);
			
			// 有効区分更新
			if(existValidTypeFutur) {
				updateCount += allocateControlMasterUpdateSelectLogic.updateMMfpickctlValidTypeFuturToApplicable(systemDt);
			}
			
			if(existValidTypeApplicable) {
				updateCount += allocateControlMasterUpdateSelectLogic.updateMMfpickctlValidTypeApplicableToPast(systemDt);
			}
			
			// コントロールNo.更新(クリア)
			allocateControlMasterUpdateSelectLogic.updateMMfpickctlControlNo(controlNo);
		}
		
		// 運用ログ明細にデータ出力結果を出力
		allocateControlMasterUpdateLogic.addInfoLog(WmsMessageConst.UPDATE_ALLOCATE_CONTROL_MASTER_VALID_TYPE, String.valueOf(updateCount));

		// 運用ログ明細にデータ出力完了を出力
		allocateControlMasterUpdateLogic.endLogSection();

		// 運用ログ書き込み完了
		allocateControlMasterUpdateLogic.endSuccessLog();
		
		return result;
	}
}
