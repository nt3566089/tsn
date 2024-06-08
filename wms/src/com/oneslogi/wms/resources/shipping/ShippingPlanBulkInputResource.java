package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.EShippingInst;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingPlanBulkInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputCheckStatusLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputRegisterLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷指示一括取込画面のリソースクラス。
 */
@Path("/shipping/shippingPlanBulkInput")
public class ShippingPlanBulkInputResource extends AbstractWmsResource {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma start

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 21;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
		// [#5698] エラーコードがnullだったため、エラーメッセージが登録されない問題を修正 2018.12.10 tanaka Start
		/**
		 * 登録異常
		 */
		protected static final int ERROR_INFORMATION = 2;
		// [#5698] エラーコードがnullだったため、エラーメッセージが登録されない問題を修正 2018.12.10 tanaka End
		/**
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 22;
		/**
		 * データの取り込み中にエラーが発生しました。
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	// [C-CWMS-0052] SDS連携に伴い、登録処理をlogic化 2015.12.02 koyama Start
	@Inject
	private ShippingPlanBulkInputRegisterLogic shippingPlanBulkInputRegisterLogic;
	@Inject
	private ShippingPlanBulkInputCheckStatusLogic shippingPlanBulkInputCheckStatusLogic;
	// [C-CWMS-0052] SDS連携に伴い、登録処理をlogic化 2015.12.02 koyama End
	@Inject
	private ShippingPlanBulkInputSelectLogic shippingPlanBulkInputSelectLogic;

	// ===== enum =====
	/**
	 * 入力チェック（登録）の結果
	 */
	public enum ResultSetupRegisterData {
		ALL_OK,
		ERROR,
		// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
		PRODUCT_NOT_FOUND,
		// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End
		// [ON推-品向-1121] 届先入力チェックを削除 2016.04.21 kawana
		INFO_WARN
	}

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ShippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ShippingPlanBulkInputDto initNew() {

		ShippingPlanBulkInputDto dto = new ShippingPlanBulkInputDto();

		return dto;
	}

	/**
	 * <h2>出荷指示一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @param clientCd 荷主CD
	 * @param centerCd センタCD
	 * @return ShippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ShippingPlanBulkInputDto fileUpload(MultipartFormDataInput input
			, @QueryParam("clientCd") String clientCd
			, @QueryParam("centerCd") String centerCd
			, @QueryParam("chkErrorShow") String chkErrorShow
			, @QueryParam("errorProcessMet") String errorProcessMet) throws Exception {

		// 画面用DTO作成
		ShippingPlanBulkInputDto shippingPlanBulkInputDto = new ShippingPlanBulkInputDto();
		int rows = 0;

		//アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		//アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(shippingPlanBulkInputDto, param);
			rows += conv.getUploadRows();
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		shippingPlanBulkInputDto.data.receiveCd = receiveCd;

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntityWithDeletedCheck(mClient);

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenter);

		// [#5662][v3.1] 緊急フラグの「9」を取込と空になってしまう問題を修正 2018.11.21 kawana Start
		// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana Start

		// ※※※ TShippingInstBDtoをEntityに変換してしまうと区分値の範囲を超えた文字(緊急フラグ等)が空になってしまうためDtoのままロジックに渡す。 (本リソース、ロジックだけ例外とする)
		// ※※※ 本来は一括取込系のため、E_SHIPPING_INSTの型でデータの取込、エラーチェックをするべき だが、影響ソースが大きいため改修しない。

		// 登録データ作成
		List<EShippingInst> eShippingInstList = shippingPlanBulkInputSelectLogic.convertEShippingInst(receiveCd, mCenter, mClient, shippingPlanBulkInputDto.data.shippingPlan);

		// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana End
		// [#5662][v3.1] 緊急フラグの「9」を取込と空になってしまう問題を修正 2018.11.21 kawana End

		// データ登録
		try {
			shippingPlanBulkInputRegisterLogic.batchInsertEShippingInst(eShippingInstList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new ShippingPlanBulkInputDto();
		}

		// エラーチェック
		shippingPlanBulkInputCheckStatusLogic.checkError(receiveCd, centerCd, clientCd, shippingPlanBulkInputRegisterLogic.getOutputLog());

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return shippingPlanBulkInputDto;

	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面表示用データを検索する
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 * @param errSts エラーステータス
	 * @return ShippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingPlanBulkInputDto search(ShippingPlanBulkInputDto shippingPlanBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = shippingPlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		String centerCd = tshippingInstH.getMCenter().getCenterCd();
		String clientCd = tshippingInstH.getMClient().getClientCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		ShippingPlanBulkInputSelectLogic.SelectCls cls = ShippingPlanBulkInputSelectLogic.SelectCls.ALL;
		if (CU.nullToStr(tshippingInstH.getChkErrorShow()).equals("1")) {
			cls = ShippingPlanBulkInputSelectLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		List<TShippingInstBDto> shippingPlanList =
				shippingPlanBulkInputSelectLogic.selectAndConvertEShippingInstList(receiveCd, centerCd, clientCd, shippingPlanBulkInputDto.paging, cls);

		// 画面DTOに設定
		shippingPlanBulkInputDto.data.shippingPlan = shippingPlanList;

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		shippingPlanBulkInputDto.data.dataCount = shippingPlanBulkInputSelectLogic.getEShippingPlanCount(receiveCd, centerCd, clientCd);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		return shippingPlanBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータを検索し存在する場合はエラーを登録する。
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 * @return StatusDto ステータスDTO
	 */
	@GET
	@Path("/checkExistError")
	public StatusDto checkExistError(ShippingPlanBulkInputDto shippingPlanBulkInputDto) {

		// 受信CD
		String receiveCd = shippingPlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);
		// 検索に必要な項目を取得・設定
		String centerCd = tshippingInstH.getMCenter().getCenterCd();
		String clientCd = tshippingInstH.getMClient().getClientCd();

		// エラーデータ検索実行
		List<TShippingInstBDto> shippingPlanList =
				shippingPlanBulkInputSelectLogic.selectAndConvertEShippingInstList(receiveCd, centerCd, clientCd, ShippingPlanBulkInputSelectLogic.SelectCls.ERROR_ONLY);

		if (0 < shippingPlanList.size()) {
			// エラー有
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
			return null;
		}

		return null;
	}

	/**
	 * <h2>Excel出力処理。</h2>
	 * <pre>
	 * Excel出力処理を行う
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 * @param errSts エラーステータス
	 * @return CustomerMasterBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public ShippingPlanBulkInputDto excelOutput(ShippingPlanBulkInputDto shippingPlanBulkInputDto, ErrorStatus errSts) throws IOException {

		// 受信CD
		String receiveCd = shippingPlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		String centerCd = tshippingInstH.getMCenter().getCenterCd();
		String clientCd = tshippingInstH.getMClient().getClientCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 取込データ全件検索実行
		shippingPlanBulkInputDto.data.shippingPlan =
				shippingPlanBulkInputSelectLogic.selectAndConvertEShippingInstList(receiveCd, centerCd, clientCd, ShippingPlanBulkInputSelectLogic.SelectCls.ALL);

		shippingPlanBulkInputDto.data.head = tShippingInstHDtoMapper.mappingToDto(tshippingInstH);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);
		return shippingPlanBulkInputDto;
	}

	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 * @return ShippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public ShippingPlanBulkInputDto checkErrorMaster(ShippingPlanBulkInputDto shippingPlanBulkInputDto) {

		// 受信CD
		String receiveCd = shippingPlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		String centerCd = tshippingInstH.getMCenter().getCenterCd();
		String clientCd = tshippingInstH.getMClient().getClientCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
		// 関係マスタチェック処理実行
		int masterErrorCount = shippingPlanBulkInputCheckStatusLogic.checkErrorMaster(receiveCd, mCenter.getCenterCd(), mClient.getClientCd(), shippingPlanBulkInputRegisterLogic.getOutputLog());
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End
		shippingPlanBulkInputDto.data.errorCount = masterErrorCount;

		return shippingPlanBulkInputDto;
	}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

	/**
	 * <h2>出荷指示登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに出荷指示データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ShippingPlanBulkInputDto shippingPlanBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = shippingPlanBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = shippingPlanBulkInputDto.data.errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		// ヘッダ項目をエンティティに変換
		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		String centerCd = tshippingInstH.getMCenter().getCenterCd();
		String clientCd = tshippingInstH.getMClient().getClientCd();

		// [C-CWMS-0052] SDS連携に伴い、処理をlogic化 2015.12.02 koyama Start
		// 登録
		// [#5698] エラーコードがnullだったため、エラーメッセージが登録されない問題を修正 2018.12.11 tanaka Start
		shippingPlanBulkInputRegisterLogic.register(receiveCd, centerCd, clientCd, errRetSts(StatusCode.ERROR_INFORMATION));
		// [#5698] エラーコードがnullだったため、エラーメッセージが登録されない問題を修正 2018.12.11 tanaka End
		// [C-CWMS-0052] SDS連携に伴い、処理をlogic化 2015.12.02 koyama End
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

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma end

}
