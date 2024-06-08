package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.customize.SqlEZipListDto;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlEZipListDtoMapper;
import com.oneslogi.base.dbflute.exentity.EZip;
import com.oneslogi.base.dbflute.exentity.customize.SqlEZipList;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.master.ZipMasterBulkInputDto;
import com.oneslogi.wms.logic.master.ZipMasterBulkInputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 郵便番号マスタデータ機能に対するリソースクラス。
 */
@Path("/master/zipMasterBulkInput")
public class ZipMasterBulkInputResource extends AbstractWmsResource {

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
		 * warn
		 */
		protected static final int WARN_INFORMATION = 2;

		/**
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 3;
		// [#5698] エラーコードが１になってたため、エラーメッセージがconfirmになっていた問題を修正 2018.12.11 tanaka Start
		/**
		 * 登録異常
		 */
		protected static final int ZIP_MASTER_REGISTER_FAILED = 4;
		// [#5698] エラーコードが１になってたため、エラーメッセージがconfirmになっていた問題を修正 2018.12.11 tanaka End
		/**
		 * データの取り込み中にエラーが発生しました。
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	private static final String ENCODING = "MS932";
	private static final char DELIMITER_CHAR = ',';
	private static final String LINE_CODE = "\r\n";
	private static final int READ_START_LINE = 1;

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipMasterBulkInputLogic zipMasterBulkInputLogic;

	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ZipMasterBulkInputDto 郵便番号マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public ZipMasterBulkInputDto initNew() {

		// 画面用DTO作成
		ZipMasterBulkInputDto zipMasterDto = new ZipMasterBulkInputDto();

		return zipMasterDto;
	}

	/**
	 * <h2>郵便番号マスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return ZipMasterBulkInputDto 郵便番号マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ZipMasterBulkInputDto fileUpload(MultipartFormDataInput input
			, @QueryParam("chkErrorShow") String chkErrorShow
			, @QueryParam("errorProcessMet") String errorProcessMet
			, @QueryParam("uploadZipType") String uploadZipType
			) throws Exception {

		// 画面用DTO作成
		ZipMasterBulkInputDto zipMasterBulkInputDto = new ZipMasterBulkInputDto();
		// エラーのみ表示
		zipMasterBulkInputDto.data.head.setChkErrorShow(chkErrorShow);
		// エラー処理方法
		zipMasterBulkInputDto.data.head.setErrorProcessMet(errorProcessMet);
		// 郵便番号種別
		zipMasterBulkInputDto.data.head.setUploadZipType(uploadZipType);

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file, ENCODING, DELIMITER_CHAR, LINE_CODE, READ_START_LINE);
			conv.setData(zipMasterBulkInputDto, param);
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		zipMasterBulkInputDto.data.receiveCd = receiveCd;

		// 登録データ作成
		List<EZip> eZipList = zipMasterBulkInputLogic.convertEZip(zipMasterBulkInputDto.data.body, receiveCd, uploadZipType);

		// データ登録
		try {
			zipMasterBulkInputLogic.batchInsert(eZipList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			return new ZipMasterBulkInputDto();
		}

		zipMasterBulkInputDto.data.body.clear();

		return zipMasterBulkInputDto;
	}

	/**
	 * <h2>取込データのエラーチェック.</h2>
	 * <pre>
	 * 受信テーブルに登録されたデータに対して、文字列チェックを実施する。
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタ取込画面用DTO
	 * @return ZipMasterBulkInputDto 郵便番号マスタ取込画面用DTO
	 */
	@GET
	@Path("/checkError")
	public ZipMasterBulkInputDto checkError(ZipMasterBulkInputDto zipMasterDto) {

		// エラーチェック
		zipMasterBulkInputLogic.checkError(zipMasterDto);

		return zipMasterDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータ件数を取得し、存在する場合はエラーを登録する。
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタ取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return ZipMasterBulkInputDto 郵便番号マスタ取込画面用DTO
	 */
	@GET
	@Path("/checkExistError")
	public ZipMasterBulkInputDto checkExistError(ZipMasterBulkInputDto zipMasterDto, ErrorStatus errSts) {

		// エラーデータ取得
		List<SqlEZipList> sqlEZipListList = zipMasterBulkInputLogic.getEZipList(zipMasterDto.data.receiveCd
				, zipMasterDto.data.head, null, ZipMasterBulkInputLogic.SelectCls.ERROR_ONLY);

		zipMasterDto.data.head.setCounter(sqlEZipListList.size());

		if (sqlEZipListList.size() > 0) {
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
		}

		return zipMasterDto;
	}

	/**
	 * <h2>Excel出力。/h2>
	 * <pre>
	 * Excel出力
	 * </pre>
	 * @param zipMasterBulkInputDto 郵便番号マスタ取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return ZipMasterBulkInputDto 郵便番号マスタ取込画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public ZipMasterBulkInputDto excelOutput(ZipMasterBulkInputDto zipMasterBulkInputDto, ErrorStatus errSts) throws IOException {

		SqlEZipListDtoMapper mapper = new SqlEZipListDtoMapper();

		// 郵便番号マスタ受信テーブルから、取込対象ファイルの全データ取得
		List<SqlEZipList> sqlEZipListList = zipMasterBulkInputLogic.getEZipList(zipMasterBulkInputDto.data.receiveCd
				, zipMasterBulkInputDto.data.head, null, ZipMasterBulkInputLogic.SelectCls.ALL);

		zipMasterBulkInputDto.data.body = mapper.mappingToDtoList(sqlEZipListList);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return zipMasterBulkInputDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・郵便番号マスタ一括取込データ取り出し
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタ一括取込画面用DTO
	 * @return ZipMasterBulkInputDto 郵便番号マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/search")
	public ZipMasterBulkInputDto search(ZipMasterBulkInputDto zipMasterDto) throws IOException {

		SqlEZipListDtoMapper sqlZipMapper = new SqlEZipListDtoMapper();

		ZipMasterBulkInputLogic.SelectCls cls = ZipMasterBulkInputLogic.SelectCls.ALL;
		if (CU.nullToStr(zipMasterDto.data.head.getChkErrorShow()).equals("1")) {
			cls = ZipMasterBulkInputLogic.SelectCls.ERROR_ONLY;
		}

		List<SqlEZipList> sqlEZipList = zipMasterBulkInputLogic.getEZipList(zipMasterDto.data.receiveCd, zipMasterDto.data.head, zipMasterDto.paging, cls);

		List<SqlEZipListDto> sqlEZipListDto = sqlZipMapper.mappingToDtoList(sqlEZipList);

		ZipMasterBulkInputDto zipMasterBulkInputDto = new ZipMasterBulkInputDto();

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		zipMasterBulkInputDto.data.dataCount = zipMasterBulkInputLogic.getEZipCount(zipMasterDto.data.receiveCd);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		zipMasterBulkInputDto.paging = zipMasterDto.paging;
		zipMasterBulkInputDto.data.head = zipMasterDto.data.head;
		zipMasterBulkInputDto.data.body = sqlEZipListDto;

		return zipMasterBulkInputDto;
	}

	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param zipMasterDto 郵便番号マスタ一括取込画面用DTO
	 * @return ZipMasterBulkInputDto 郵便番号マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public ZipMasterBulkInputDto checkErrorMaster(ZipMasterBulkInputDto zipMasterDto) {

		// 受信CD
		String receiveCd = zipMasterDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// 関係マスタチェック処理実行
		int zipMasterErrorCount = zipMasterBulkInputLogic.checkErrorZipMaster(zipMasterDto);
		zipMasterDto.data.errorCount = zipMasterErrorCount;

		return zipMasterDto;
	}

	/**
	 * <h2>郵便番号マスタ登録 。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param zipMasterBulkInputDto 郵便番号マスタ一括取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ZipMasterBulkInputDto zipMasterBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = zipMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = zipMasterBulkInputDto.data.errorCount;

		zipMasterBulkInputLogic.register(zipMasterBulkInputDto, errRetSts(StatusCode.ZIP_MASTER_REGISTER_FAILED));

		if (0 < getErrorManager().size()) {
			return null;
		}

		// 警告メッセージ
		if (0 < masterErrorCount) {
			getInfoManager().clear();
			getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			return null;
		}

		return null;
	}

}
