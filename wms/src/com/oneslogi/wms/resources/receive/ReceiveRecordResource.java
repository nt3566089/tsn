package com.oneslogi.wms.resources.receive;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveRecordList;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveRecordUsernum1List;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ReceiveRecordDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.receive.ReceiveRecordFileCreateLogic;
import com.oneslogi.wms.logic.receive.ReceiveRecordLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入庫実績送信（販物）のリソースクラス。
 */
@Path("/receive/ReceiveRecord")
public class ReceiveRecordResource extends AbstractWmsResource {

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

	/**
	 * 送信CD採番用機能ID
	 */
	protected static final String RECEIVE_RECORD = "ReceiveRecord";

	/**
	 * 出力件数ログ出力用文字列(国産)
	 */
	protected static final String RECEIVE_RECORD_DOMESTIC = "入庫実績送信(販物)(国産)";

	/**
	 * 出力件数ログ出力用文字列(輸入)
	 */
	protected static final String RECEIVE_RECORD_IMPORT = "入庫実績送信(販物)(輸入)";

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ReceiveRecordLogic receiveRecordLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ReceiveRecordFileCreateLogic receiveRecordFileCreateLogic;

	/**
	 * <h2>入庫実績データ取得。</h2>
	 * <pre>
	 * ・入庫実績情報取得
	 * ・入庫実績DTOに設定
	 * </pre>
	 * @param  centerCd 拠点CD
	 * @param  clientCd 荷主CD
	 * @param  controlNo コントロールNo.
	 * @return ReceiveRecordListDto 入庫実績送信（販物）DTO
	 */
	@GET
	@Path("/send")
	public ReceiveRecordDto send(@QueryParam("centerCd")String centerCd,
			@QueryParam("clientCd") String clientCd,
			@QueryParam("controlNo") String controlNo) {

		ReceiveRecordDto result = new ReceiveRecordDto();
		result.status.statusCode = StatusCode.SUCCESS;

		// 運用ログ書き込み開始
		receiveRecordLogic.startLog(WmsMessageConst.RECEIVE_RECORD_PROGRAM_NAME_INFORMATION, centerCd, clientCd);
		receiveRecordLogic.addInfoLog(WmsMessageConst.CALL_BATCH_PARAMETER_INFORMATION, new String[] { centerCd, clientCd });

		// 処理開始時のログ明細出力
		receiveRecordLogic.startLogSection(WmsMessageConst.OUTPUT_SECTION_NAME_OUTPUT_INFORMATION);

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 該当データなしエラー
		if (mCenter == null) {
			receiveRecordLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.CENTER_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endFailureLog();
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
			receiveRecordLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.CLIENT_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}

		// コントロールNo.未指定エラー
		if (CU.isNullOrEmpty(controlNo)) {
			receiveRecordLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.DATA_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}

		Long controlNoLong = Long.parseLong(controlNo);

		// 対象の入庫予定を更新ロック
		int lockNum = receiveRecordFileCreateLogic.getTTrrcvLock(controlNoLong);

		// 対象データ無しの場合、処理終了
		if (lockNum == 0) {
			receiveRecordLogic.addInfoLog(WmsMessageConst.COMMON_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.DATA_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endSuccessLog();
			result.status.statusCode = StatusCode.SUCCESS;
			return result;
		}

		// 国産・輸入区分取得
		ListResultBean<SqlReceiveRecordUsernum1List> domImpList = receiveRecordFileCreateLogic.selectUsernum1List(controlNoLong);

		// 対象データ無しの場合、処理終了
		if (domImpList.size() == 0) {
			receiveRecordLogic.addInfoLog(WmsMessageConst.COMMON_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.DATA_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endSuccessLog();
			result.status.statusCode = StatusCode.SUCCESS;
			return result;
		}

		ListResultBean<SqlReceiveRecordList> domesticList = new ListResultBean<SqlReceiveRecordList>();
		ListResultBean<SqlReceiveRecordList> importList = new ListResultBean<SqlReceiveRecordList>();

		// 取得した国産・輸入区分の件数分繰り返し処理
		for (SqlReceiveRecordUsernum1List domImp : domImpList) {

			// 国産・輸入区分が'11'(国産)の場合
			if (CDef.Usid.$11.code().equals(String.valueOf(domImp.getUsernum1Distinct()))) {

				// 入庫登録情報(国産)を取得
				domesticList = receiveRecordFileCreateLogic.selectReceiveRecordList(controlNoLong, CDef.Usid.$11.code());
			}

			// 国産・輸入区分が'31'(輸入)の場合
			if (CDef.Usid.$31.code().equals(String.valueOf(domImp.getUsernum1Distinct()))) {

				// 入庫登録情報(輸入)を取得
				importList = receiveRecordFileCreateLogic.selectReceiveRecordList(controlNoLong, CDef.Usid.$31.code());
			}
		}

		// 対象データ無しの場合、処理終了
		if (domesticList.size() == 0 && importList.size() == 0) {
			receiveRecordLogic.addInfoLog(WmsMessageConst.COMMON_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.DATA_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endSuccessLog();
			result.status.statusCode = StatusCode.SUCCESS;
			return result;
		}

		// 送信CD採番
		String numberingSendCd = numberingCenterLogic.getNumberingCenter(centerId, RECEIVE_RECORD);

		// 採番エラー
		if (numberingSendCd == null) {
			receiveRecordLogic.addErrorLog(WmsMessageConst.COMMON_ERROR_MESSAGE_INFORMATION,
					receiveRecordLogic.getMessage(WmsMessageConst.NUMBERING_CENTER_NOT_FOUND_ERROR));
			receiveRecordLogic.endLogSection();
			receiveRecordLogic.endFailureLog();
			result.status.statusCode = StatusCode.ABNORMAL;
			return result;
		}

		// 入庫実績送信テーブル（販物）登録
		receiveRecordFileCreateLogic.insertReceiveRecordList(domesticList, importList, numberingSendCd, centerCd);

		// コントロールNo.クリア
		receiveRecordFileCreateLogic.clearControlNo(controlNoLong);

		// 取得した国産・輸入区分の件数分繰り返し処理
		for (SqlReceiveRecordUsernum1List domImp : domImpList) {

			// 国産・輸入区分が'11'(国産)の場合
			if (CDef.Usid.$11.code().equals(String.valueOf(domImp.getUsernum1Distinct()))) {

				// 出力データ作成処理呼出し
				result.data.domesticList = receiveRecordFileCreateLogic.createOutputData(
						centerCd, numberingSendCd, CDef.Usid.$11.code());
			}

			// 国産・輸入区分が'31'(輸入)の場合
			if (CDef.Usid.$31.code().equals(String.valueOf(domImp.getUsernum1Distinct()))) {

				// 出力データ作成処理呼出し
				result.data.importList = receiveRecordFileCreateLogic.createOutputData(
						centerCd, numberingSendCd, CDef.Usid.$31.code());
			}
		}

		// 入庫実績送信テーブル（販物）フラグ更新
		receiveRecordFileCreateLogic.updateWorkFlg(numberingSendCd);

		// 運用ログ明細に国産データ出力結果を出力
		receiveRecordLogic.addInfoLog(WmsMessageConst.OUTPUT_RECORD_INFORMATION, new String[] { RECEIVE_RECORD_DOMESTIC,
				String.valueOf(result.data.domesticList.size())});

		// 運用ログ明細に輸入データ出力結果を出力
		receiveRecordLogic.addInfoLog(WmsMessageConst.OUTPUT_RECORD_INFORMATION, new String[] { RECEIVE_RECORD_IMPORT,
				String.valueOf(result.data.importList.size())});

		// 運用ログ明細にデータ出力完了を出力
		receiveRecordLogic.endLogSection();

		// 運用ログ書き込み完了
		receiveRecordLogic.endSuccessLog();

		return result;
	}

}
