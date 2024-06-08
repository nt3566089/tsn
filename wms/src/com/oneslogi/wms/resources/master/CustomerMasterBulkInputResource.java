package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.MCenterCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.ECustomer;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.master.CustomerMasterBulkInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CustomerMasterBulkInputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 取引先マスタ取込機能に対するリソースクラス。
 */
@Path("/master/customerMasterBulkInput")
public class CustomerMasterBulkInputResource extends AbstractWmsResource {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 (全体見直し) 2016.08.01 kawana Start

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
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 4;
		/**
		 * 登録異常
		 */
		protected static final int CUSTOMER_MASTER_REGISTER_FAILED = 5;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add Start
		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 11;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add End
		/**
		 * データの取り込み中にエラーが発生しました
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CustomerMasterBulkInputLogic customerMasterBulkInputLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CustomerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CustomerMasterBulkInputDto initNew() {

		// 画面用DTO作成
		CustomerMasterBulkInputDto dto = new CustomerMasterBulkInputDto();

		return dto;
	}

	/**
	 * <h2>取引先マスタ一括取込.</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return CustomerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public CustomerMasterBulkInputDto fileUpload(MultipartFormDataInput input, @QueryParam("clientCd") String clientCd, @QueryParam("chkErrorShow") String chkErrorShow) throws Exception {

		// 画面用DTO作成
		CustomerMasterBulkInputDto customerMasterBulkInputDto = new CustomerMasterBulkInputDto();

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(customerMasterBulkInputDto, param);
			rows = rows + conv.getUploadRows();
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		customerMasterBulkInputDto.data.receiveCd = receiveCd;

		// 登録データ作成
		MCenter mCenter = new MCenter();
		mCenter.setCenterId(getCenterClassCondition());
		mCenter = centerLogic.getPkEntity(mCenter);

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		List<ECustomer> eCustomerList = customerMasterBulkInputLogic.convertECustomer(mCenter, mClient, customerMasterBulkInputDto.data.customerMaster, receiveCd);

		// データ登録
		try {
		customerMasterBulkInputLogic.insertECustomer(eCustomerList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new CustomerMasterBulkInputDto();
		}

		// エラーチェック
		customerMasterBulkInputLogic.checkError(receiveCd);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return customerMasterBulkInputDto;
	}

	/**
	 * <h2>取込データ検索処理。</h2>
	 * <pre>
	 * 取込データを検索する。
	 * </pre>
	 * @param customerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 * @return CustomerMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CustomerMasterBulkInputDto search(CustomerMasterBulkInputDto customerMasterBulkInputDto) {

		// 受信CD
		String receiveCd = customerMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MCustomerDtoMapper customerMapper = new MCustomerDtoMapper();
		MCustomer header = customerMapper.mappingToEntity(customerMasterBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		MCenter mCenter = new MCenter();
		mCenter.setCenterId(getCenterClassCondition());
		mCenter = centerLogic.getPkEntity(mCenter);

		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		CustomerMasterBulkInputLogic.SelectCls cls = CustomerMasterBulkInputLogic.SelectCls.ALL;
		if (CU.nullToStr(header.getChkErrorShow()).equals("1")) {
			cls = CustomerMasterBulkInputLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		List<MCenterCustomerDto> customerList =
				customerMasterBulkInputLogic.selectAndConvertECustomerList(receiveCd, customerMasterBulkInputDto.paging, cls);

		// 画面DTOに設定
		customerMasterBulkInputDto.data.customerMaster = customerList;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		customerMasterBulkInputDto.data.dataCount = customerMasterBulkInputLogic.getECustomerCount(receiveCd);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		return customerMasterBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータを検索し存在する場合はエラーを登録する。
	 * </pre>
	 * @param customerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 * @return StatusDto ステータスDTO
	 */
	@GET
	@Path("/checkExistError")
	public StatusDto checkExistError(CustomerMasterBulkInputDto customerMasterBulkInputDto) {

		// 受信CD
		String receiveCd = customerMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// エラーデータ検索実行
		List<MCenterCustomerDto> customerList = customerMasterBulkInputLogic.selectAndConvertECustomerList(receiveCd, CustomerMasterBulkInputLogic.SelectCls.ERROR_ONLY);

		if (0 < customerList.size()) {
			// エラー有
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
			return null;
		}

		return null;
	}

	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add Start
	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param customerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 * @return CustomerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public CustomerMasterBulkInputDto checkErrorMaster(CustomerMasterBulkInputDto customerMasterBulkInputDto) {

		// 受信CD
		String receiveCd = customerMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// 関係マスタチェック処理実行
		int masterErrorCount = customerMasterBulkInputLogic.checkErrorMaster(receiveCd);
		customerMasterBulkInputDto.data.errorCount = masterErrorCount;

		return customerMasterBulkInputDto;
	}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add End

	/**
	 * <h2>取引先マスタ登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに取引先マスタを登録し、完了メッセージを設定する
	 * </pre>
	 * @param customerMasterBulkInputDto 取引先マスタ一括取込画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CustomerMasterBulkInputDto customerMasterBulkInputDto) {

		// 受信CD
		String receiveCd = customerMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add Start
		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = customerMasterBulkInputDto.data.errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add End

		customerMasterBulkInputLogic.register(receiveCd, errRetSts(StatusCode.CUSTOMER_MASTER_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add Start
		// 警告メッセージ
		if (0 < masterErrorCount) {
			getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			return null;
		}
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add End

		// 完了メッセージ
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 (全体見直し) 2016.08.01 kawana End

	//[Ver3.1][#5754] Excel出力処理を他一括取込系画面と統一 2018.12.18 tanaka start
	/**
	 * <h2>Excel出力。/h2>
	 * <pre>
	 * Excel出力
	 * </pre>
	 * @param customerMasterBulkInputDto 取引先マスタ取込画面用DTO
	 * @param errSts ErrorStatus
	 * @return CustomerMasterBulkInputDto 取引先マスタ取込画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public CustomerMasterBulkInputDto excelOutput(CustomerMasterBulkInputDto customerMasterBulkInputDto, ErrorStatus errSts) throws IOException {

		// 受信CD
		String receiveCd = customerMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ロケーションマスタ受信テーブルから、取込対象ファイルの全データ取得
		List<MCenterCustomerDto> customerList = customerMasterBulkInputLogic.selectAndConvertECustomerList(receiveCd, null, CustomerMasterBulkInputLogic.SelectCls.ALL);

		// 画面DTOに設定
		customerMasterBulkInputDto.data.customerMaster = customerList;

		return customerMasterBulkInputDto;

	}
	//[Ver3.1][#5754] Excel出力処理を他一括取込系画面と統一 2018.12.18 tanaka end

}
