package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.customize.SqlELocationListDto;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlELocationListDtoMapper;
import com.oneslogi.base.dbflute.exentity.ELocation;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlELocationList;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.master.LocationMasterBulkInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.LocationMasterBulkInputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションマスタデータ機能に対するリソースクラス。
 */
@Path("/master/locationMasterBulkInput")
public class LocationMasterBulkInputResource extends AbstractWmsResource {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.01 honma start
	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
		/**
		 * 登録異常
		 */
		protected static final int LOCATION_MASTER_REGISTER_FAILED = 8;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 16;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		/**
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 17;

		/**
		 * データの取り込み中にエラーが発生しました。
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private LocationMasterBulkInputSelectLogic locationMasterBulkInputLogic;

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
	 * @return LocationMasterBulkInputDto ロケーションマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public LocationMasterBulkInputDto initNew() {

		// 画面用DTO作成
		LocationMasterBulkInputDto locationMasterDto = new LocationMasterBulkInputDto();

		return locationMasterDto;
	}

	/**
	 * <h2>ロケーションマスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return LocationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public LocationMasterBulkInputDto fileUpload(MultipartFormDataInput input
			, @QueryParam("centerCd") String centerCd
			, @QueryParam("clientCd") String clientCd
			, @QueryParam("chkErrorShow") String chkErrorShow
			, @QueryParam("errorProcessMet") String errorProcessMet
			) throws Exception {

		// 画面用DTO作成
		LocationMasterBulkInputDto locationMasterBulkInputDto = new LocationMasterBulkInputDto();
		// 荷主CD
		locationMasterBulkInputDto.data.head.setClientCd(clientCd);
		// センタCD
		locationMasterBulkInputDto.data.head.setCenterCd(centerCd);
		// エラーのみ表示
		locationMasterBulkInputDto.data.head.setChkErrorShow(chkErrorShow);
		// エラー処理方法
		locationMasterBulkInputDto.data.head.setErrorProcessMet(errorProcessMet);

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(locationMasterBulkInputDto, param);
			rows += conv.getUploadRows();
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		locationMasterBulkInputDto.data.receiveCd = receiveCd;

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		// 荷主ID
		locationMasterBulkInputDto.data.head.setClientId(mClient.getClientId());

		// 登録データ作成
		List<ELocation> eLocationList = locationMasterBulkInputLogic.convertELocation(mCenter, mClient, locationMasterBulkInputDto.data.body, receiveCd);

		// データ登録
		try {
			locationMasterBulkInputLogic.batchInsert(eLocationList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new LocationMasterBulkInputDto();
		}

		// エラーチェック
		locationMasterBulkInputLogic.checkError(locationMasterBulkInputDto);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return locationMasterBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータ件数を取得し、存在する場合はエラーを登録する。
	 * </pre>
	 * @param locationMasterDto ロケーションマスタ取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return LocationMasterBulkInputDto ロケーションマスタ取込画面用DTO
	 */
	@GET
	@Path("/checkExistError")
	public LocationMasterBulkInputDto checkExistError(LocationMasterBulkInputDto locationMasterDto, ErrorStatus errSts) {

		// エラーデータ取得
		// [2.1.0-CT-003]バグ対応修正 2016.11.04 honma Mod Start
		List<SqlELocationList> sqlELocationListList = locationMasterBulkInputLogic.getELocationList(locationMasterDto.data.receiveCd
				, locationMasterDto.data.head, null, LocationMasterBulkInputSelectLogic.SelectCls.ERROR_ONLY);
		// [2.1.0-CT-003]バグ対応修正 2016.11.04 honma Mod End

		locationMasterDto.data.head.setCounter(sqlELocationListList.size());

		//[ＯＮ推_品向_1109] Excel取込時全てエラーとなるデータを登録する時に、画面無反応の対応 2016.04.22 DSW Start
		if (sqlELocationListList.size() > 0) {
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
		}
		//[ＯＮ推_品向_1109] Excel取込時全てエラーとなるデータを登録する時に、画面無反応の対応 2016.04.22 DSW End

		return locationMasterDto;
	}

	/**
	 * <h2>Excel出力。/h2>
	 * <pre>
	 * Excel出力
	 * </pre>
	 * @param locationMasterBulkInputDto ロケーションマスタ取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return LocationMasterBulkInputDto ロケーションマスタ取込画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public LocationMasterBulkInputDto excelOutput(LocationMasterBulkInputDto locationMasterBulkInputDto, ErrorStatus errSts) throws IOException {

		SqlELocationListDtoMapper mapper = new SqlELocationListDtoMapper();

		// ロケーションマスタ受信テーブルから、取込対象ファイルの全データ取得
		List<SqlELocationList> sqlELocationListList = locationMasterBulkInputLogic.getELocationList(locationMasterBulkInputDto.data.receiveCd
				, locationMasterBulkInputDto.data.head, null, LocationMasterBulkInputSelectLogic.SelectCls.ALL);

		locationMasterBulkInputDto.data.body = mapper.mappingToDtoList(sqlELocationListList);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return locationMasterBulkInputDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・ロケーションマスタ一括取込データ取り出し
	 * </pre>
	 * @param locationMasterDto ロケーションマスタ一括取込画面用DTO
	 * @return LocationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 */
	@GET
	@Path("/search")
	public LocationMasterBulkInputDto search(LocationMasterBulkInputDto locationMasterDto) throws IOException {

		SqlELocationListDtoMapper sqlLocationMapper = new SqlELocationListDtoMapper();

		LocationMasterBulkInputSelectLogic.SelectCls cls = LocationMasterBulkInputSelectLogic.SelectCls.ALL;
		if (CU.nullToStr(locationMasterDto.data.head.getChkErrorShow()).equals("1")) {
			cls = LocationMasterBulkInputSelectLogic.SelectCls.ERROR_ONLY;
		}

		List<SqlELocationList> sqlELocationList = locationMasterBulkInputLogic.getELocationList(locationMasterDto.data.receiveCd, locationMasterDto.data.head, locationMasterDto.paging, cls);

		List<SqlELocationListDto> sqlELocationListDto = sqlLocationMapper.mappingToDtoList(sqlELocationList);

		LocationMasterBulkInputDto locationMasterBulkInputDto = new LocationMasterBulkInputDto();

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		locationMasterBulkInputDto.data.dataCount = locationMasterBulkInputLogic.getELocationCount(locationMasterDto.data.receiveCd, locationMasterDto.data.head);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		locationMasterBulkInputDto.paging = locationMasterDto.paging;
		locationMasterBulkInputDto.data.head = locationMasterDto.data.head;
		locationMasterBulkInputDto.data.body = sqlELocationListDto;

		return locationMasterBulkInputDto;
	}

	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param locationMasterDto ロケーションマスタ一括取込画面用DTO
	 * @return LocationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public LocationMasterBulkInputDto checkErrorMaster(LocationMasterBulkInputDto locationMasterDto) {

		// 受信CD
		String receiveCd = locationMasterDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// 関係マスタチェック処理実行
		int masterErrorCount = locationMasterBulkInputLogic.checkErrorMaster(locationMasterDto);
		int locationMasterErrorCount = locationMasterBulkInputLogic.checkErrorLocationMaster(locationMasterDto);
		locationMasterDto.data.errorCount = masterErrorCount + locationMasterErrorCount;

		return locationMasterDto;
	}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

	/**
	 * <h2>ロケーションマスタ登録 。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param locationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(LocationMasterBulkInputDto locationMasterBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = locationMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = locationMasterBulkInputDto.data.errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		locationMasterBulkInputLogic.register(locationMasterBulkInputDto, errRetSts(StatusCode.LOCATION_MASTER_REGISTER_FAILED));
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 警告メッセージ
		if (0 < masterErrorCount) {
			getInfoManager().clear();
			getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			return null;
		}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		return null;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.01 honma end
}
