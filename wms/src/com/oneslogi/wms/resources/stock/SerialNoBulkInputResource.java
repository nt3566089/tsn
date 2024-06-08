package com.oneslogi.wms.resources.stock;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.TSerialNoDto;
import com.oneslogi.base.dbflute.dtomapper.TSerialNoDtoMapper;
import com.oneslogi.base.dbflute.exentity.ESerialInput;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.stock.SerialNoBulkInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.stock.SerialNoBulkInputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * シリアルNo.メンテナンス機能に対するリソースクラス。
 */
@Path("/stock/serialNoBulkInput")
public class SerialNoBulkInputResource extends AbstractWmsResource {

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
		 * 登録異常
		 */
		protected static final int T_SERIAL_NO_REGISTER_FAILED = 5;

		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 11;

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
	private SerialNoBulkInputLogic bulkInputSelectLogic;

	@Inject
	private NumberingCenterLogic numberingLogic;

	@Inject
	private CenterLogic centerLogic;

	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return SerialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public SerialNoBulkInputDto initNew() {

		// 画面用DTO作成
		SerialNoBulkInputDto serialNoBulkInputDto = new SerialNoBulkInputDto();

		return serialNoBulkInputDto;
	}

	/**
	 * <h2>シリアルNo.一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return SerialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public SerialNoBulkInputDto fileUpload(MultipartFormDataInput input
			, @QueryParam("centerCd") String centerCd
			, @QueryParam("clientCd") String clientCd
			, @QueryParam("chkErrorShow") String chkErrorShow
			, @QueryParam("errorProcessMet") String errorProcessMet
			) throws Exception {

		// 画面用DTO作成
		SerialNoBulkInputDto serialNoBulkInputDto = new SerialNoBulkInputDto();

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(serialNoBulkInputDto, param);
			rows += conv.getUploadRows();
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		serialNoBulkInputDto.data.receiveCd = receiveCd;

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 登録データ作成
		List<ESerialInput> eSerialInputList = bulkInputSelectLogic.convertESerialInput(receiveCd, mCenter, mClient, serialNoBulkInputDto.data.serialNoList);

		// データ登録
		try {
			bulkInputSelectLogic.batchInsertESerialInput(eSerialInputList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			return new SerialNoBulkInputDto();
		}

		// エラーチェック
		bulkInputSelectLogic.checkError(receiveCd, centerCd, clientCd);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return serialNoBulkInputDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・シリアルNo.メンテナンスデータ取り出し
	 * </pre>
	 * @param locationMasterDto シリアルNo.メンテナンス画面用DTO
	 * @return SerialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public SerialNoBulkInputDto search(SerialNoBulkInputDto serialNoBulkInputDto) throws IOException {

		// 受信CD
		String receiveCd = serialNoBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TSerialNoDto header = serialNoBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = header.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = header.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		SerialNoBulkInputLogic.SelectCls cls = SerialNoBulkInputLogic.SelectCls.ALL;
		if (CU.nullToStr(serialNoBulkInputDto.data.head.getChkErrorShow()).equals("1")) {
			cls = SerialNoBulkInputLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		List<TSerialNo> serialNoList = bulkInputSelectLogic.selectAndConvertESerialInputList(receiveCd, centerCd, clientCd, serialNoBulkInputDto.paging, cls);

		// 画面DTOに設定
		serialNoBulkInputDto.data.serialNoList = new TSerialNoDtoMapper().mappingToDtoList(serialNoList);

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka start
		serialNoBulkInputDto.data.dataCount = bulkInputSelectLogic.getESerialCount(receiveCd, centerCd, clientCd);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka end

		return serialNoBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータ件数を取得し、存在する場合はエラーを登録する。
	 * </pre>
	 * @param serialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 * @param errSts ErrorStatus
	 * @return serialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 */
	@GET
	@Path("/checkExistError")
	public SerialNoBulkInputDto checkExistError(SerialNoBulkInputDto serialNoBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = serialNoBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TSerialNoDto header = serialNoBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = header.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = header.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// エラーデータ取得
		List<TSerialNo> serialNoList = bulkInputSelectLogic.selectAndConvertESerialInputList(receiveCd, centerCd, clientCd, SerialNoBulkInputLogic.SelectCls.ERROR_ONLY);

		if (serialNoList.size() > 0) {
			// エラー有
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
			return null;
		}

		return null;
	}

	/**
	 * <h2>Excel出力。/h2>
	 * <pre>
	 * Excel出力
	 * </pre>
	 * @param serialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 * @param errSts ErrorStatus
	 * @return SerialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public SerialNoBulkInputDto excelOutput(SerialNoBulkInputDto serialNoBulkInputDto, ErrorStatus errSts) throws IOException {

		// 受信CD
		String receiveCd = serialNoBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TSerialNoDto header = serialNoBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = header.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = header.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// シリアルNo.受信テーブルから、取込対象ファイルの全データ取得
		List<TSerialNo> serialNoList = bulkInputSelectLogic.selectAndConvertESerialInputList(receiveCd, centerCd, clientCd,  SerialNoBulkInputLogic.SelectCls.ALL);

		serialNoBulkInputDto.data.serialNoList = new TSerialNoDtoMapper().mappingToDtoList(serialNoList);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return serialNoBulkInputDto;
	}

	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param serialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 * @return SerialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public SerialNoBulkInputDto checkErrorMaster(SerialNoBulkInputDto serialNoBulkInputDto) {

		// 受信CD
		String receiveCd = serialNoBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目
		TSerialNoDto header = serialNoBulkInputDto.data.head;

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		String centerCd = header.getMCenter().getCenterCd();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		String clientCd = header.getMClient().getClientCd();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 関係マスタチェック処理実行
		int masterErrorCount = bulkInputSelectLogic.checkErrorMaster(receiveCd, mCenter.getCenterCd(), mClient.getClientCd());
		serialNoBulkInputDto.data.errorCount = masterErrorCount;

		return serialNoBulkInputDto;
	}

	/**
	 * <h2>シリアルNo.管理テーブル登録 。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param serialNoBulkInputDto シリアルNo.メンテナンス画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(SerialNoBulkInputDto serialNoBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = serialNoBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = serialNoBulkInputDto.data.errorCount;

		// ヘッダ項目
		TSerialNoDto header = serialNoBulkInputDto.data.head;
		// センタCD
		String centerCd = header.getMCenter().getCenterCd();
		// 荷主CD
		String clientCd = header.getMClient().getClientCd();

		// 登録処理
		bulkInputSelectLogic.register(receiveCd, centerCd, clientCd, errRetSts(StatusCode.T_SERIAL_NO_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 警告メッセージ
		if (0 == getWarnManager().size()) {
			getInfoManager().clear();
			if (0 < masterErrorCount) {
				// 警告メッセージ
				getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			} else {
				// 完了メッセージ
				getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
			}
		}

		return null;
	}

}
