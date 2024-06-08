package com.oneslogi.wms.resources.daily;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientCenterDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.job.logic.JobQueEntry;
import com.oneslogi.job.logic.JobQueEntryInitializerLogic;
import com.oneslogi.job.logic.jobqueentry.JobQueEntryResult;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.dto.daily.DailyDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.daily.DailyMainLogic;
import com.oneslogi.wms.logic.master.CenterMasterMaintenanceSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 日次締め処理画面のリソースクラス。
 */
@Path("/daily/daily")
public class DailyResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int DATA_GET_FAILED = 2;
		/**
		 * チェック異常
		 */
		protected static final int CHECK_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int UPDATE_FAILED = 4;
		// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start
		/**
		 * 日次締処理異常
		 */
		protected static final int EXECUTE_FAILED = 5;
		/**
		 * 日次締処理ジョブ登録異常
		 */
		protected static final int JOB_QUE_ENTRY_FAILED = 6;
		// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End
	}

	// [#471] ユーザ荷主マスタでの荷主制限を復活 2016.12.16 kawana Start

	// ===== 使用テーブル =====

	@Inject
	private MUserClientBhv mUserClientBhv;

	// [#471] ユーザ荷主マスタでの荷主制限を復活 2016.12.16 kawana End

	// ===== 使用ロジック =====

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CenterMasterMaintenanceSelectLogic centerMasterMaintenanceSelectLogic;
	@Inject
	private DailyMainLogic dailyProcessLogic;
	// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start
	@Inject
	private JobQueEntryInitializerLogic jobQueEntryInitializerLogic;
	// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End

	//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.09.25 miyabe Start
	@Inject
	private MessageLogic messageLogic;
	//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.09.25 miyabe Start

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタマスタのセンタIDをキーに荷主センタマスタデータ取り出し
	 * ・日次締め処理画面のデータを画面用DTOに設定
	 * </pre>
	 * @return DailyDto 日次締め処理画面用DTO
	 */
	@GET
	@Path("/init")
	public DailyDto init() {
		return new DailyDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・日次締め処理DTOをキーに日次締め処理データ取り出し
	 * </pre>
	 * @param dailyDto 日次締め処理画面用DTO
	 * @return DailyDto 日次締め処理画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/search")
	public DailyDto search(DailyDto dailyDto) throws Exception {

		// Entity変換
		MCenterDtoMapper mapper = new MCenterDtoMapper();
		MClientCenterDtoMapper clientCentermapper = new MClientCenterDtoMapper();
		MCenter center = mapper.mappingToEntity(dailyDto.data.dailySearch);

		//センタID取得
		String centerCd = center.getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		center.setCenterId(mCenter.getCenterId());

		// 検索
		List<MCenter> page = centerMasterMaintenanceSelectLogic.selectById(center, errRetSts(StatusCode.DATA_GET_FAILED));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// [#471] ユーザ荷主マスタでの荷主制限を復活・ソース可読性向上 2016.12.16 kawana Start

		List<MClientCenter> clientCenterList = page.get(0).getMClientCenterList();
		Set<Long> userRoleClientIdSet = getUserRoleClientIdSet();

		List<MClientCenter> displayClientList = new ArrayList<MClientCenter>();
		int rowIndex = 0;
		for (MClientCenter clientCenter : clientCenterList) {

			if (clientCenter.isDelFlg$1()) {
				// 削除
				continue;
			}

			// ===== ユーザ荷主マスタの権限チェック =====

			if (0 < userRoleClientIdSet.size()) {
				// 1件も荷主を設定していない場合は制限なし

				if (!userRoleClientIdSet.contains(clientCenter.getClientId())) {
					// 許可されていない荷主
					continue;
				}
			}

			// ===== 次の日を設定して表示荷主リストに追加 =====

			String systemdt = clientCenter.getSystemDt();
			Calendar cal = Calendar.getInstance();
			cal.setTime(CU.stringToDate(systemdt));
			cal.add(Calendar.DAY_OF_MONTH, 1);
			clientCenter.setSystemDateAdd(CU.calendarToString(cal));

			clientCenter.setLineNo(String.valueOf(rowIndex));

			displayClientList.add(clientCenter);

			rowIndex++;
		}

		// [#471] ユーザ荷主マスタでの荷主制限を復活・ソース可読性向上 2016.12.16 kawana End


		//Entity-Dto変換処理
		List<MClientCenterDto> list = clientCentermapper.mappingToDtoList(displayClientList);

		//検索結果詰込処理
		dailyDto.data.dailyList = list;

		return dailyDto;
	}

	// [#471] ユーザ荷主マスタでの荷主制限を復活 2016.12.16 kawana Start

	/**
	 * ログインユーザが扱える荷主IDのリストを返却(セット)
	 * @return 許可された荷主IDのセット (0件の場合は全許可)
	 */
	private Set<Long> getUserRoleClientIdSet() {

		// ユーザ荷主マスタデータを取得
		MUserClientCB cb = mUserClientBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setUserId_Equal(getUserId());
		List<MUserClient> userClientList = mUserClientBhv.selectList(cb);

		Set<Long> userRoleClientIdSet = new HashSet<Long>();
		for (MUserClient uc : userClientList) {
			userRoleClientIdSet.add(uc.getClientId());
		}

		return userRoleClientIdSet;
	}

	// [#471] ユーザ荷主マスタでの荷主制限を復活 2016.12.16 kawana End

	/**
	 * <h2>チェック処理</h2>
	 * <pre>
	 * 日次処理（データのチェック）をする
	 *
	 * </pre>
	 * @param dailyDto 日次締め処理画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/check")
	public StatusDto check(DailyDto dailyDto) {
		MClientCenterDtoMapper mapper = new MClientCenterDtoMapper();
		List<MClientCenter> mClientCenterList = mapper.mappingToEntityList(dailyDto.data.dailyList);

		int rowIndex = -1;
		for (MClientCenter mClientCenter : mClientCenterList) {
			rowIndex = Integer.valueOf(mClientCenter.getLineNo()).intValue();
			//日次処理.チェック処理
			dailyProcessLogic.checkExecute(mClientCenter, errRetSts(errRetSts(StatusCode.CHECK_FAILED), StatusCode.CHECK_FAILED, rowIndex));
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}
		}
		if (dailyDto.flg) {
			// 確認メッセージをエラー管理クラスに登録
			//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.09.26 miyabe Start
			int notInspectConfirmationCount = 0;
			StringBuilder confirmationMessage = new StringBuilder();
			String notInspectClientCenter = messageLogic.getMessageNm(WmsMessageConst.NOT_COMPLETE_SHIPPING_INSPECTION_CLIENT_CENTER_INFORMATION);

			for (MClientCenter mClientCenter : mClientCenterList) {
				//出荷未確定データ存在チェック
				if(!dailyProcessLogic.checkShippingInspection(mClientCenter)){
					//荷主、センタ名称詰込み
					String addCenter = notInspectClientCenter.replace("[0]", mClientCenter.getMCenter().getCenterNm());
					String addClientCenter = addCenter.replace("[1]", mClientCenter.getMClient().getClientNm());
					//確認メッセージの組み立て
					confirmationMessage.append("\n");
					confirmationMessage.append(addClientCenter);
					notInspectConfirmationCount ++;
				}
			}
			// 確認メッセージをエラー管理クラスに登録
			if (notInspectConfirmationCount > 0) {
				this.getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION),
						WmsMessageConst.DAILY_CONFIRMATION_NOT_COMPLETE_SHIPPING_INSPECTION, confirmationMessage.toString());
			} else {
				this.getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DAILY_PROCESS_EXECUTE_CONFIRMATION);
			}
			//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.09.26 miyabe End
		}
		// 結果の設定
		return null;
	}

	/**
	 * <h2>締切処理</h2>
	 * <pre>
	 * 締切処理を行う
	 * 日次処理（データの改廃、業務日付の更新）をする。
	 *
	 * </pre>
	 * @param dailyDto 日次締め処理画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws Exception
	 */
	@POST
	@Path("/daily")
	public StatusDto daily(DailyDto dailyDto) throws Exception {
		// Entity変換
		MClientCenterDtoMapper mapper = new MClientCenterDtoMapper();
		List<MClientCenter> mClientCenterList = mapper.mappingToEntityList(dailyDto.data.dailyList);

		this.check(dailyDto);

		int rowIndex = -1;
		for (MClientCenter mClientCenter : mClientCenterList) {
			rowIndex = Integer.valueOf(mClientCenter.getLineNo()).intValue();

			// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start

			// バッチ処理中フラグ更新
			dailyProcessLogic.updateBatchProgress(mClientCenter, errRetSts(StatusCode.UPDATE_FAILED, rowIndex));
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 日次処理実行
			dailyProcessLogic.mainProcess(mClientCenter, errRetSts(StatusCode.EXECUTE_FAILED, rowIndex));
			if (getErrorManager().size() > 0) {
				return null;
			}

			// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return null;
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start

	/**
	 * <h2>締切処理(バッチ処理)</h2>
	 * <pre>
	 * 締切処理をジョブキューに登録する
	 * </pre>
	 * @param dailyDto 日次締め処理画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws Exception
	 */
	@POST
	@Path("/dailyBatch")
	public StatusDto dailyBatch(DailyDto dailyDto) throws Exception {

		// Entity変換
		MClientCenterDtoMapper mapper = new MClientCenterDtoMapper();
		List<MClientCenter> mClientCenterList = mapper.mappingToEntityList(dailyDto.data.dailyList);

		this.check(dailyDto);

		List<String> jobQueNoList = new ArrayList<String>();
		int rowIndex = -1;
		for (MClientCenter mClientCenter : mClientCenterList) {
			rowIndex = Integer.valueOf(mClientCenter.getLineNo()).intValue();

			// ===== バッチ処理中フラグ更新 =====
			dailyProcessLogic.updateBatchProgress(mClientCenter, errRetSts(StatusCode.UPDATE_FAILED, rowIndex));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== 日次バッチ登録 =====
			String jobQueNo = jobEntry(mClientCenter, errRetSts(StatusCode.JOB_QUE_ENTRY_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			jobQueNoList.add(getJobQueNoMessage(mClientCenter.getMClient().getClientCd(), jobQueNo));
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.DAILY_BATCH_REGISTER_INFORMATION, CU.join(",", jobQueNoList));
		return null;
	}

	/**
	 * ジョブキュー登録
	 * @param mClientCenter 対象の荷主センタマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ジョブキュー登録受付No
	 */
	private String jobEntry(MClientCenter mClientCenter, ErrorStatus errSts) {
		String jobCd = getPropertyValue(WmsPropertyConst.DAILY_BATCH_JOB_CD);
		JobQueEntry jobQueEntry = jobQueEntryInitializerLogic.initialize(jobCd);
		// パラメータ設定
		long centerId = mClientCenter.getCenterId();
		String centerCd = mClientCenter.getMCenter().getCenterCd();
		long clientId = mClientCenter.getClientId();
		String clientCd = mClientCenter.getMClient().getClientCd();
		String nextDt = mClientCenter.getSystemDateAdd();
		jobQueEntry.addJobParam("centerId", String.valueOf(centerId));
		jobQueEntry.addJobParam("clientId", String.valueOf(clientId));
		jobQueEntry.addJobParam("centerCd", centerCd);
		jobQueEntry.addJobParam("clientCd", clientCd);
		jobQueEntry.addJobParam("nextDt", nextDt);

		// ジョブキュー登録
		JobQueEntryResult jobQueEntryResult = jobQueEntry.entry(errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		return jobQueEntryResult.getJobQueReceiptNo();
	}

	/**
	 * メッセージ用のジョブキュー番号取得
	 * "(荷主CD):(ジョブキュー番号)"を返す
	 * @param clientCd 荷主CD
	 * @param jobQueNo ジョブキュー番号
	 * @return メッセージ用文字列
	 */
	private String getJobQueNoMessage(String clientCd, String jobQueNo) {
		return new StringBuilder().append(clientCd).append(":").append(jobQueNo).toString();
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End
}
