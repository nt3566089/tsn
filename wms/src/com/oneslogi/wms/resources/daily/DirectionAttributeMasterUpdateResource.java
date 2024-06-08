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
import com.oneslogi.wms.dto.daily.DirectionAttributeMasterUpdateDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.daily.DirectionAttributeMasterUpdateLogic;
import com.oneslogi.wms.logic.daily.DirectionAttributeMasterUpdateSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 方面属性マスタ更新のリソースクラス。
 */
@Path("/daily/directionAttributeMasterUpdate")
public class DirectionAttributeMasterUpdateResource extends AbstractWmsResource {

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
	private DirectionAttributeMasterUpdateLogic directionAttributeMasterUpdateLogic;
	@Inject
	private DirectionAttributeMasterUpdateSelectLogic directionAttributeMasterUpdateSelectLogic;
	
	/**
	 * <h2>方面属性マスタ更新</h2>
	 * <pre>
	 * 方面属性マスタの世代区分を更新する。
	 * </pre>
	 * @param centerCd 拠点CD
	 * @param clientCd 荷主CD
	 * @return DirectionAttributeMasterUpdateDto 方面属性マスタ更新DTO 
	 */
	@GET
	@Path("/register")
	public DirectionAttributeMasterUpdateDto register(@QueryParam("centerCd") String centerCd,
			@QueryParam("clientCd") String clientCd) {
		
		DirectionAttributeMasterUpdateDto result = new DirectionAttributeMasterUpdateDto();
		result.status.statusCode = StatusCode.SUCCESS;

		// 運用ログ書込み開始
		directionAttributeMasterUpdateLogic.startLog(WmsMessageConst.DIRECTION_ATTRIBUTE_MASTER_UPDATE_PROGRAM_NAME_INFORMATION, centerCd, clientCd);
		directionAttributeMasterUpdateLogic.addInfoLog(WmsMessageConst.CALL_BATCH_PARAMETER_INFORMATION, new String[] {centerCd, clientCd});
		
		// 処理開始時のログ明細出力
		directionAttributeMasterUpdateLogic.startLogSection(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		
		// コントロールNo.取得
		Long controlNo = numberingLogic.getControlNo();

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 該当データなしエラー
		if (mCenter == null) {
			directionAttributeMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					directionAttributeMasterUpdateLogic.getMessage(WmsMessageConst.CENTER_NOT_FOUND_ERROR));
			directionAttributeMasterUpdateLogic.endLogSection();
			directionAttributeMasterUpdateLogic.endFailureLog();
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
			directionAttributeMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					directionAttributeMasterUpdateLogic.getMessage(WmsMessageConst.CLIENT_NOT_FOUND_ERROR));
			directionAttributeMasterUpdateLogic.endLogSection();
			directionAttributeMasterUpdateLogic.endFailureLog();
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
			directionAttributeMasterUpdateLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					directionAttributeMasterUpdateLogic.getMessage(WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR));
			directionAttributeMasterUpdateLogic.endLogSection();
			directionAttributeMasterUpdateLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}
		String systemDt = mClientCenter.getSystemDt();


		// 更新対象データの検索
		boolean existGrtnIdFutur = directionAttributeMasterUpdateSelectLogic.existMCdrcattGrtnIdFutur(systemDt);
		boolean existDelete = directionAttributeMasterUpdateSelectLogic.existMCdrcattDelete(systemDt);
		int updateCount = 0;
		if(existGrtnIdFutur || existDelete) {
			// コントロールNo.更新
			directionAttributeMasterUpdateSelectLogic.updateMCdrcattControlNo(systemDt, controlNo);
			
			if(existGrtnIdFutur) {
				// 世代区分更新
				updateCount += directionAttributeMasterUpdateSelectLogic.updateMCdrcattGrtnIdFuturToApplicable(systemDt);
			}
			
			if(existDelete) {
				// レコード削除
				updateCount += directionAttributeMasterUpdateSelectLogic.deleteMCdrcatt(systemDt);
			}
			
			// コントロールNo.更新(クリア)
			directionAttributeMasterUpdateSelectLogic.updateMCdrcattControlNo(controlNo);
		}
		
		// 運用ログ明細にデータ出力結果を出力
		directionAttributeMasterUpdateLogic.addInfoLog(WmsMessageConst.UPDATE_DIRECTION_ATTRIBUTE_MASTER_GRTN_ID, String.valueOf(updateCount));

		// 運用ログ明細にデータ出力完了を出力
		directionAttributeMasterUpdateLogic.endLogSection();

		// 運用ログ書き込み完了
		directionAttributeMasterUpdateLogic.endSuccessLog();
		
		return result;
	}
}
