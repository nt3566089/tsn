package com.oneslogi.wms.resources.receive;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.exentity.EReceivePlan;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ReceivePlanBulkInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanBulkInputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入荷予定取込機能に対するリソースクラス。
 */
@Path("/receive/receivePlanBulkInput")
public class ReceivePlanBulkInputResource extends AbstractWmsResource {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.20 honma start

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
		 * 入荷予定データ登録異常
		 */
		protected static final int RECEIVE_PLAN_INSERT_FAILED = 5;

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 11;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		/**
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 14;

		/**
		 * データの取り込み中にエラーが発生しました。
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ReceivePlanBulkInputSelectLogic bulkInputSelectLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReceivePlanBulkInputDto 入荷予定一括取込画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReceivePlanBulkInputDto initNew() {

		// 画面用DTO作成
		ReceivePlanBulkInputDto dto = new ReceivePlanBulkInputDto();

		return dto;
	}

	/**
	 * <h2>入荷予定一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return ReceivePlanBulkInputDto 入荷予定一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ReceivePlanBulkInputDto fileUpload(MultipartFormDataInput input
		, @QueryParam("centerCd") String centerCd
		, @QueryParam("clientCd") String clientCd
		, @QueryParam("chkErrorShow") String chkErrorShow
		, @QueryParam("errorProcessMet") String errorProcessMet
		) throws Exception {

		// 画面用DTO作成
		ReceivePlanBulkInputDto receivePlanBulkInputDto = new ReceivePlanBulkInputDto();

		int rows = 0;

		//アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		//アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(receivePlanBulkInputDto, param);
			rows += conv.getUploadRows();
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		receivePlanBulkInputDto.data.receiveCd = receiveCd;

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntityWithDeletedCheck(mClient);

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenter);

		// 登録データ作成
		List<EReceivePlan> eReceivePlanList = bulkInputSelectLogic.convertEReceivePlan(receiveCd, mCenter, mClient, receivePlanBulkInputDto.data.receivePlan);

		// データ登録
		try {
			bulkInputSelectLogic.batchInsertEReceivePlan(eReceivePlanList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new ReceivePlanBulkInputDto();
		}

		// エラーチェック
		bulkInputSelectLogic.checkError(receiveCd, centerCd, clientCd);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return receivePlanBulkInputDto;
	}

	/**
	 * <h2>取込データ検索処理。</h2>
	 * <pre>
	 * 取込データを検索する。
	 * </pre>
	 * @param receivePlanBulkInputDto 入荷予定一括取込DTO
	 * @return ReceivePlanBulkInputDto 入荷予定一括取込画面用DTO
	 */
	@GET
	@Path("/search")
	public ReceivePlanBulkInputDto search(ReceivePlanBulkInputDto receivePlanBulkInputDto) {

		// 受信CD
		String receiveCd = receivePlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TReceivePlanHDto receivePlanH = receivePlanBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = receivePlanH.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = receivePlanH.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		ReceivePlanBulkInputSelectLogic.SelectCls cls = ReceivePlanBulkInputSelectLogic.SelectCls.ALL;
		if (CU.nullToStr(receivePlanH.getChkErrorShow()).equals("1")) {
			cls = ReceivePlanBulkInputSelectLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		List<TReceivePlanBDto> receivePlanList = bulkInputSelectLogic.selectAndConvertEReceivePlanList(receiveCd, centerCd, clientCd, receivePlanBulkInputDto.paging, cls);

		// 画面DTOに設定
		receivePlanBulkInputDto.data.receivePlan = receivePlanList;

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		receivePlanBulkInputDto.data.dataCount = bulkInputSelectLogic.getEReceivePlanCount(receiveCd, centerCd, clientCd);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		return receivePlanBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータを検索し存在する場合はエラーを登録する。
	 * </pre>
	 * @param receivePlanBulkInputDto 入荷予定一括取込DTO
	 * @return StatusDto ステータスDTO
	 */
	@GET
	@Path("/checkExistError")
	public StatusDto checkExistError(ReceivePlanBulkInputDto receivePlanBulkInputDto) {

		// 受信CD
		String receiveCd = receivePlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TReceivePlanHDto receivePlanH = receivePlanBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = receivePlanH.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = receivePlanH.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// エラーデータ検索実行
		List<TReceivePlanBDto> receivePlanList = bulkInputSelectLogic.selectAndConvertEReceivePlanList(receiveCd, centerCd, clientCd, ReceivePlanBulkInputSelectLogic.SelectCls.ERROR_ONLY);

		if (0 < receivePlanList.size()) {
			// エラー有
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
			return null;
		}

		return null;
	}

	/**
	 * <h2>Excel出力処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @param receivePlanBulkInputDto 入荷予定一括取込DTO
	 * @param errSts エラーステータス
	 * @return ReceivePlanBulkInputDto 入荷予定一括取込画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public ReceivePlanBulkInputDto excelOutput(ReceivePlanBulkInputDto receivePlanBulkInputDto, ErrorStatus errSts) throws IOException {

		// 受信CD
		String receiveCd = receivePlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TReceivePlanHDto receivePlanH = receivePlanBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = receivePlanH.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = receivePlanH.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 取込データ全件検索実行
		receivePlanBulkInputDto.data.receivePlan = bulkInputSelectLogic.selectAndConvertEReceivePlanList(receiveCd, centerCd, clientCd, ReceivePlanBulkInputSelectLogic.SelectCls.ALL);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return receivePlanBulkInputDto;
	}

	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param receivePlanBulkInputDto 入荷予定一括取込DTO
	 * @return ReceivePlanBulkInputDto 入荷予定一括取込DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public ReceivePlanBulkInputDto checkErrorMaster(ReceivePlanBulkInputDto receivePlanBulkInputDto) {

		// 受信CD
		String receiveCd = receivePlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TReceivePlanHDto receivePlanH = receivePlanBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = receivePlanH.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = receivePlanH.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 関係マスタチェック処理実行
		int masterErrorCount = bulkInputSelectLogic.checkErrorMaster(receiveCd, mCenter.getCenterCd(), mClient.getClientCd());
		receivePlanBulkInputDto.data.errorCount = masterErrorCount;

		return receivePlanBulkInputDto;
	}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

	/**
	 * <h2>入荷予定登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに入荷予定データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param receivePlanBulkInputDto 入荷予定一括取込DTO
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ReceivePlanBulkInputDto receivePlanBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = receivePlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = receivePlanBulkInputDto.data.errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		// ヘッダ項目
		TReceivePlanHDto receivePlanH = receivePlanBulkInputDto.data.head;
		// センタCD
		String centerCd = receivePlanH.getMCenter().getCenterCd();
		// 荷主CD
		String clientCd = receivePlanH.getMClient().getClientCd();

		// 登録処理
		bulkInputSelectLogic.register(receiveCd, centerCd, clientCd, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
		if (0 == getWarnManager().size()) {
			if (0 < masterErrorCount) {
				// 警告メッセージ
				getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			} else {
				// 完了メッセージ
				getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
			}
		}
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		return null;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.20 honma end

}
