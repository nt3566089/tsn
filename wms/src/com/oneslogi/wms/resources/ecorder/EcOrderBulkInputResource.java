package com.oneslogi.wms.resources.ecorder;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.dbflute.Entity;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyBCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyHCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeCB;
import com.oneslogi.base.dbflute.cbean.MMatchingCB;
import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.cbean.TAmazonOrderCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderBCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TRakutenOrderCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TYahooOrderCB;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MImportTypeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBCopyBBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBCopyHBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exbhv.MMatchingBhv;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TAmazonOrderBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderBBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv;
import com.oneslogi.base.dbflute.exbhv.TRakutenOrderBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TYahooOrderBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyB;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyH;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.dbflute.exentity.TAmazonOrder;
import com.oneslogi.base.dbflute.exentity.TEcOrderB;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TRakutenOrder;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TYahooOrder;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.InputDto.ColumnDefsData;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.common.ImportTypeDto;
import com.oneslogi.wms.dto.ecorder.EcOrderBulkInputDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstErrorCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstInsertLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷指示一括取込画面のリソースクラス。
 */
@Path("/ecorder/ecOrderBulkInput")
public class EcOrderBulkInputResource extends AbstractWmsResource {

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
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 取込み種別マスタ設定異常
		 */
		protected static final int IMPORT_TYPE_ERROR_SETTING = 2;
		/**
		 * 受注番号重複異常
		 */
		protected static final int DUPLICAT_ORDER_NO_ERROR = 3;
		/**
		 * 必須項目未設定異常
		 */
		protected static final int NECESSARY_ERROR = 4;
		/**
		 * 出庫指示エラー有
		 */
		protected static final int SHIPPING_INST_WARN = 5;
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.06.01 kawana Start
		/**
		 * ファイル結合エラー
		 */
		protected static final int FILE_JOIN_ERROR = 6;
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.06.01 kawana End
		// エラーチェック処理をコントロールNoで取得する方法に変更 2016.3.14 nayzaw Start
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 7;
		// エラーチェック処理をコントロールNoで取得する方法に変更 2016.3.14 nayzaw End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ShippingInstInsertLogic shippingInsertLogic;
	@Inject
	private ShippingInstErrorCheckLogic shippingInstErrorCheckLogic;
	// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/15 SJA Start
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;
	// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/15 SJA End
	// [#483] 荷札の消費税が表示されない不具合を修正 2016.12.19 kawana Start
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;
	// [#483] 荷札の消費税が表示されない不具合を修正 2016.12.19 kawana End

	// ===== 使用テーブル =====
	@Inject
	private MImportTypeBhv mImportTypeBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	@Inject
	private MImportTypeBCopyHBhv mImportTypeBCopyHBhv;
	@Inject
	private MImportTypeBCopyBBhv mImportTypeBCopyBBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End
	@Inject
	private TRakutenOrderBhv tRakutenOrderBhv;
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
	@Inject
	private TAmazonOrderBhv tAmazonOrderBhv;
	@Inject
	private TYahooOrderBhv tYahooOrderBhv;
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TEcOrderRBhv tEcOrderRBhv;
	@Inject
	private TEcOrderBBhv tEcOrderBBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private MMatchingBhv mMatchingBhv;
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;
	// エラーチェック処理をコントロールNoで取得する方法に変更 2016.3.14 nayzaw Start
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	// エラーチェック処理をコントロールNoで取得する方法に変更 2016.3.14 nayzaw End
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start

	// ===== クラス変数 =====
	/**
	 * マッチングマスタ変換クラス
	 */
	private MatchingTransformer machingTransformer = new MatchingTransformer();

	/**
	 * マッチングマスタの変換値への変換クラス
	 */
	class MatchingTransformer {

		Map<String, List<MMatching>> matchingListMap;

		MatchingTransformer() {
			matchingListMap = new HashMap<String, List<MMatching>>();
		}

		/**
		 * 引数のマッチング種別、マッチングキーワードから変換値を返却
		 *
		 * @param matchingType マッチング種別
		 * @param machingKeyword マッチングキーワード
		 * @return 変換値
		 */
		public String getTransformCd(String matchingType, String machingKeyword) {
			return getTransformCd(matchingType, machingKeyword, false);
		}

		/**
		 * 引数のマッチング種別、マッチングキーワードから変換値を返却
		 *
		 * @param matchingType マッチング種別
		 * @param machingKeyword マッチングキーワード
		 * @return 変換値
		 */
		public String getTransformCdLikeMatch(String matchingType, String machingKeyword) {
			return getTransformCd(matchingType, machingKeyword, true);
		}

		private String getTransformCd(String matchingType, String machingKeyword, boolean isLikeMatch) {

			if (CU.isNullOrEmpty(matchingType) || CU.isNullOrEmpty(machingKeyword)) {
				return null;
			}

			List<MMatching> matchingList = matchingListMap.get(matchingType);
			if (matchingList == null) {
				matchingList = getMatchingList(matchingType);
				matchingListMap.put(matchingType, matchingList);
			}

			if (matchingList == null) {
				// 定義なし
				return null;
			}

			for (MMatching matching : matchingList) {

				if (isLikeMatch) {
					if (-1 < machingKeyword.indexOf(matching.getMatchingKeyword())) {
						// 変換値を返却
						return matching.getTransformCd();
					}
				} else {
					if (matching.getMatchingKeyword().equals(machingKeyword)) {
						// 変換値を返却
						return matching.getTransformCd();
					}
				}
			}

			// マッチする定義なし
			return null;
		}

		/**
		 * <pre>
		 * DBから引数のマッチングタイプのマッチングマスタのリストを取得する。
		 * </pre>
		 * @param matchingType
		 * @return
		 */
		private List<MMatching> getMatchingList(String matchingType) {

			MMatchingCB cb = mMatchingBhv.newConditionBean();
			cb.checkInvalidQuery();
			cb.query().setMatchingType_Equal(matchingType);
			cb.query().addOrderBy_MatchingKeyword_Asc();
			return mMatchingBhv.selectList(cb);
		}
	}

	/**
	 * 取込種別
	 */
	private enum UploadType {
		NORMAL,
		HEADER,
		BODY
	}

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return EcOrderInputDto EC受注一括取込画面用DTO
	 */
	@GET
	@Path("/initNew")
	public EcOrderBulkInputDto initNew() {

		EcOrderBulkInputDto dto = new EcOrderBulkInputDto();

		return dto;
	}

	@GET
	@Path("/importTypeList")
	public ImportTypeDto getKeyValueList(@QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId) {

		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		cb.query().setClientId_Equal(clientId);
		cb.query().addOrderBy_ImportTypeCd_Asc();

		ListResultBean<MImportType> mImportTypeList = mImportTypeBhv.selectList(cb);

		mImportTypeBhv.loadMImportTypeBList(mImportTypeList, new ConditionBeanSetupper<MImportTypeBCB>() {
			@Override
			public void setup(MImportTypeBCB cbBody) {
				cbBody.setupSelect_MEdiColumn();
			}
		});

		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		List<MImportTypeDto> resultList = mapper.mappingToDtoList(mImportTypeList);

		ImportTypeDto dto = new ImportTypeDto();
		dto.data.mImportType = resultList;
		return dto;
	}

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start

	/**
	 * <h2>EC受注データ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @param clientId 荷主Id
	 * @param centerId センタId
	 * @param importTypeCd 取込み種別CD
	 * @return EcOrderBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public EcOrderBulkInputDto fileUpload(MultipartFormDataInput input, @QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId, @QueryParam("importTypeCd") String importTypeCd)
			throws Exception {

		EcOrderBulkInputDto ecOrderBulkInputDto = fileUpload(input, clientId, centerId, importTypeCd, UploadType.NORMAL);

		return ecOrderBulkInputDto;
	}

	/**
	 * <h2>EC受注データ一括取込(ヘッダファイル)。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return EcOrderBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@POST
	@Path("/fileUploadHeader")
	public EcOrderBulkInputDto fileUploadHeader(MultipartFormDataInput input, @QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId,
			@QueryParam("importTypeCd") String importTypeCd)
			throws Exception {

		EcOrderBulkInputDto ecOrderBulkInputDto = fileUpload(input, clientId, centerId, importTypeCd, UploadType.HEADER);

		// [ON推-品向-838] ヘッダ内で同一のキーがある場合はエラーとする 2015.07.08 kawana Start
		// 重複チェック列名
		String keyField = ecOrderBulkInputDto.data.base.getDuplicateColumnNm();
		Class<?> importTypeClass;
		try {
			importTypeClass = Class.forName("com.oneslogi.base.dbflute.dto." + StringUtils.capitalize(ecOrderBulkInputDto.data.base.getUploadTableNm()) + "Dto");
		} catch (ClassNotFoundException e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		// 重複チェック列の取得メソッド
		Method getKeyMethod = importTypeClass.getMethod("get" + StringUtils.capitalize(keyField));

		// 重複チェック
		List<Object> keyList = new ArrayList<Object>();
		for (Object head : ecOrderBulkInputDto.data.orderHeader) {
			Object key = getKeyMethod.invoke(head);

			if (keyList.contains(key)) {

				// ヘッダファイル内でキー重複あり - エラーとする
				getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_DUPLICATE_ERROR, key.toString());
				return null;
			}

			keyList.add(key);
		}
		// [ON推-品向-838] ヘッダ内で同一のキーがある場合はエラーとする 2015.07.08 kawana End

		return ecOrderBulkInputDto;
	}

	/**
	 * <h2>EC受注データ一括取込(ボディファイル)。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return EcOrderBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@POST
	@Path("/fileUploadBody")
	public EcOrderBulkInputDto fileUploadBody(MultipartFormDataInput input, @QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId,
			@QueryParam("importTypeCd") String importTypeCd)
			throws Exception {

		EcOrderBulkInputDto ecOrderBulkInputDto = fileUpload(input, clientId, centerId, importTypeCd, UploadType.BODY);

		return ecOrderBulkInputDto;
	}

	/**
	 * <h2>EC受注データ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @param clientCd 荷主CD
	 * @param centerCd センタCD
	 * @param importTypeCd 取込み種別CD
	 * @param type 取込の種類
	 * @return EcOrderBulkInputDto 出荷指示一括取込画面用DTO
	 */
	private EcOrderBulkInputDto fileUpload(MultipartFormDataInput input, Long clientId, Long centerId, String importTypeCd, UploadType type) throws IOException, Exception {

		// 取込み種別マスタよりファイルの形式を取得
		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.query().setImportTypeCd_Equal(importTypeCd);
		cb.query().setClientId_Equal(clientId);
		MImportType mImportType = mImportTypeBhv.selectEntity(cb);

		Class<?> importTypeClass;
		try {
			importTypeClass = Class.forName("com.oneslogi.base.dbflute.dto." + StringUtils.capitalize(mImportType.getUploadTableNm()) + "Dto");
		} catch (ClassNotFoundException e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		// 画面用DTO作成
		EcOrderBulkInputDto ecOrderBulkInputDto = new EcOrderBulkInputDto();

		ecOrderBulkInputDto.data.clientId = clientId;
		ecOrderBulkInputDto.data.centerId = centerId;

		// 取込み種別マスタの設定
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		ecOrderBulkInputDto.data.base = mapper.mappingToDto(mImportType);

		int rows = 0;

		// ファイルアップロード
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();
		InputDto param = null;

		if (type == UploadType.NORMAL) {

			param = getUploadParams(input);
		} else {

			// 結合キー ※※※ 重複チェック列名をヘッダ、ボディの結合キーとする
			String keyField = mImportType.getDuplicateColumnNm();

			InputDto paramMain = getUploadParams(input);
			// ヘッダ項目とボディ項目を作成
			InputDto paramHeader = new InputDto();
			paramHeader.input.gridModelNm = "orderHeader";
			InputDto paramBody = new InputDto();
			paramBody.input.gridModelNm = "orderBody";
			// ヘッダ、ボディの項目定義を設定
			setColumnDefs(paramMain.input.columnDefs, paramHeader, paramBody, keyField);

			if (type == UploadType.HEADER) {
				param = paramHeader;
			} else if (type == UploadType.BODY) {
				param = paramBody;
			}
		}

		//アップロードデータ取込処理
		for (String file : files) {

			String lineString = null;
			if (mImportType.getLineFeedCd().equals("1")) {
				lineString = "\r\n";
			} else if (mImportType.getLineFeedCd().equals("2")) {
				lineString = "\r";
			} else if (mImportType.getLineFeedCd().equals("3")) {
				lineString = "\n";
			}
			// [#6866][OSS] 取込種別マスタ「読み飛ばし行数」が未設定の場合に致命的エラー発生 2019.11.19 kawana Start
			conv.open(file, mImportType.getCharacterCd(), mImportType.getDelimiter().toCharArray()[0], lineString, (int) (CU.nullToZero(mImportType.getSkippingRows()) + 1));
			// [#6866][OSS] 取込種別マスタ「読み飛ばし行数」が未設定の場合に致命的エラー発生 2019.11.19 kawana End
			conv.setData(ecOrderBulkInputDto, param, importTypeClass);
			rows += conv.getUploadRows();

		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return ecOrderBulkInputDto;
	}

	/**
	 * <h2>EC受注データ一括取込(ボディファイル)。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param ecOrderBulkInputDto  出荷指示一括取込画面用DTO
	 * @return EcOrderBulkInputDto 出荷指示一括取込画面用DTO
	 */
	@POST
	@Path("/afterUploadHeaderAndBody")
	@SuppressWarnings("unchecked")
	public EcOrderBulkInputDto afterUploadHeaderAndBody(EcOrderBulkInputDto ecOrderBulkInputDto) throws Exception {

		// ===== ヘッダDTOとボディDTOを結合する =====

		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		MImportType importType = mapper.mappingToEntity(ecOrderBulkInputDto.data.base);
		String uploadTable = importType.getUploadTableNm();
		List<Object> headerDtoList;
		List<Object> bodyDtoList;
		try {
			headerDtoList = (List<Object>) decodeString(ecOrderBulkInputDto.data.jsonDataHeader, uploadTable);
			bodyDtoList = (List<Object>) decodeString(ecOrderBulkInputDto.data.jsonDataBody, uploadTable);
		} catch (Exception e) {
			return null;
		}

		// 取込クラス
		Class<?> importClass;
		try {
			importClass = Class.forName("com.oneslogi.base.dbflute.dto." + StringUtils.capitalize(uploadTable) + "Dto");
		} catch (ClassNotFoundException e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		// 結合キー ※※※ 重複チェック列名をヘッダ、ボディの結合キーとする
		String keyField = importType.getDuplicateColumnNm();

		// 結合キーの取得メソッド
		Method getKeyMethod = importClass.getMethod("get" + StringUtils.capitalize(keyField));

		// ヘッダDtoMapを作成(キー:結合キー)
		Map<Object, Object> headerMap = new HashMap<Object, Object>();
		for (Object head : headerDtoList) {
			Object key = getKeyMethod.invoke(head);

			// [ON推-品向-838] ヘッダ内で同一のキーがある場合はエラーとする 2015.07.02 kawana Start
			if (headerMap.containsKey(key)) {

				// ヘッダファイル内でキー重複あり - エラーとする
				getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_DUPLICATE_ERROR, key.toString());
				return null;
			}
			// [ON推-品向-838] ヘッダ内で同一のキーがある場合はエラーとする 2015.07.02 kawana End

			headerMap.put(key, head);
		}

		// ヘッダ項目とボディ項目を作成
		InputDto paramHeader = new InputDto();
		InputDto paramBody = new InputDto();
		// ヘッダ、ボディの項目定義を設定
		setColumnDefs(ecOrderBulkInputDto.data.columnDefs, paramHeader, paramBody, keyField);

		// ボディDtoにヘッダDtoの内容を設定
		// getterとsetterの作成
		// ヘッダに設定した項目をボディに設定
		List<Method> getterList = new ArrayList<Method>();
		List<Method> setterList = new ArrayList<Method>();
		for (InputDto.ColumnDefsData col : paramHeader.input.columnDefs) {
			String fieldNm = col.field;
			Method getter = importClass.getMethod("get" + StringUtils.capitalize(fieldNm));
			Method setter = importClass.getMethod("set" + StringUtils.capitalize(fieldNm), getter.getReturnType());

			getterList.add(getter);
			setterList.add(setter);
		}

		Set<Object> bodyKeyList = new HashSet<Object>();

		// ボディDtoにヘッダ内容を設定
		for (Object body : bodyDtoList) {
			Object key = getKeyMethod.invoke(body);
			// ヘッダDto取得
			Object header = headerMap.get(key);

			if (header == null) {
				// 紐づくヘッダなし

				// エラーを登録して処理終了
				getErrorManager().add(errRetSts(StatusCode.FILE_JOIN_ERROR), WmsMessageConst.EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_NOT_FOUND_ERROR, key.toString());
				return null;
			}

			bodyKeyList.add(key);

			for (int i = 0; i < getterList.size(); i++) {
				Method getter = getterList.get(i);
				Method setter = setterList.get(i);

				Object getValue = getter.invoke(header);
				setter.invoke(body, getValue);
			}
		}

		// ヘッダファイル・ボディファイルのキー数の一致チェック
		if (bodyKeyList.size() != headerMap.size()) {
			// 紐づくボディなし

			// 使用したヘッダを除外
			for (Object key : bodyKeyList) {
				headerMap.remove(key);
			}

			// 未使用のヘッダのキーを抜出
			StringBuilder sb = new StringBuilder();
			for (Object key : headerMap.keySet()) {
				if (sb.length() != 0) {
					sb.append(",");
				}
				sb.append(key.toString());
			}

			// エラーを登録して処理終了
			getErrorManager().add(errRetSts(StatusCode.FILE_JOIN_ERROR), WmsMessageConst.EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_PRODUCT_NOT_FOUND_ERROR, sb.toString());
			return null;
		}

		// 返却用Dtoの設定
		ecOrderBulkInputDto.data.order = bodyDtoList;

		return ecOrderBulkInputDto;
	}

	/**
	 * ヘッダ、ボディの項目定義の作成
	 * @param columnDefs ヘッダ＋ボディの項目定義
	 * @param paramHeader ヘッダ定義インスタンス
	 * @param paramBody ボデ定義インスタンス
	 * @param keyField ヘッダとボディの結合キー
	 */
	private void setColumnDefs(List<ColumnDefsData> columnDefs, InputDto paramHeader, InputDto paramBody, String keyField) {
		int keyCount = 0;
		int headerColumnLength = 0;
		for (InputDto.ColumnDefsData col : columnDefs) {

			if (col.field.equals(keyField)) {
				// ヘッダ、ボディの結合キーと一致

				keyCount++;
				if (keyCount == 2) {
					// ボディ項目に突入
					headerColumnLength = paramHeader.input.columnDefs.size();
				}
			}

			if (keyCount < 2) {
				// ヘッダ項目

				paramHeader.input.columnDefs.add(col);
			} else {
				// ボディ項目

				// 列位置を変更
				InputDto.ColumnDefsData bodyCol = new InputDto.ColumnDefsData();
				bodyCol.displayName = col.displayName;
				bodyCol.field = col.field;
				bodyCol.visible = col.visible;
				bodyCol.inColIndex = col.inColIndex - headerColumnLength;

				paramBody.input.columnDefs.add(bodyCol);
			}
		}
	}

	/**
	 * Base64で受け取ったリクエストデータを本来のDtoに変換する。
	 * ※JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為、送信データをコンバートし対応
	 */
	private Object decodeString(String stringDto, String tableName) throws Exception {

		Class<?> importTypeClass;
		try {
			importTypeClass = Class.forName("com.oneslogi.base.dbflute.dto." + StringUtils.capitalize(tableName) + "Dto");
		} catch (ClassNotFoundException e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		ObjectMapper mapper = new ObjectMapper();

		String body = new String(Base64.decodeBase64(stringDto), StandardCharsets.UTF_8);

		return mapper.readValue(body, mapper.getTypeFactory().constructCollectionType(List.class, importTypeClass));
	}

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	/**
	 * <h2>EC受注データ登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースにEC受注データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param ecOrderBulkInputDto EC受注データ一括取込画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	@SuppressWarnings("unchecked")
	public StatusDto register(EcOrderBulkInputDto ecOrderBulkInputDto, ErrorStatus errSts) {
		Object orderDto;
		try {
			orderDto = decodeString(ecOrderBulkInputDto.data.jsonData, ecOrderBulkInputDto.data.base.getUploadTableNm());
		} catch (Exception e) {
			return null;
		}

		Class<?> importTypeClassDtoMapper;
		try {
			importTypeClassDtoMapper = Class.forName("com.oneslogi.base.dbflute.dtomapper." + StringUtils.capitalize(ecOrderBulkInputDto.data.base.getUploadTableNm()) + "DtoMapper");
		} catch (ClassNotFoundException e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		Object orderDtoMapper;
		try {
			orderDtoMapper = importTypeClassDtoMapper.newInstance();
		} catch (Exception e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		Method orderMappingToEntityList;
		try {
			orderMappingToEntityList = orderDtoMapper.getClass().getMethod("mappingToEntityList", List.class);
		} catch (Exception e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}
		List<Entity> orderListObj;
		try {
			orderListObj = (List<Entity>) orderMappingToEntityList.invoke(orderDtoMapper, orderDto);
		} catch (Exception e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}

		// 重複チェック用配列
		HashMap<String, Object> orderNoMap = new HashMap<String, Object>();

		// 各種値を設定
		Long rowNo = 0l;
		Long receiveId = Long.parseLong(numberingCenterLogic.getNumbering(WmsNumberingConst.RECEIVE_ID)); // 受信IDを採番
		for (Entity entity : orderListObj) {
			// 重複チェック用に受注番号を取得
			if (StringUtils.isNotEmpty(ecOrderBulkInputDto.data.base.getDuplicateColumnNm())) {
				Method orderNoGetMethod;
				try {
					orderNoGetMethod = entity.getClass().getMethod("get" + StringUtils.capitalize(ecOrderBulkInputDto.data.base.getDuplicateColumnNm()));
					String orderNo = (String) orderNoGetMethod.invoke(entity);
					if (StringUtils.isEmpty(orderNo)) {
						// 受注番号が設定されていない場合、エラー
						getErrorManager().add(errRetSts(StatusCode.NECESSARY_ERROR), WmsMessageConst.EC_ORDER_NECESSARY_ORDER_NO_ERROR);
						return null;
					}
					if (!orderNoMap.containsKey(orderNo)) {
						orderNoMap.put(orderNo, null);
					}
				} catch (NoSuchMethodException e) {
					getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
					return null;
				} catch (Exception e) {
					getErrorManager().throwException(e);
					return null;
				}
			}
			// 受信IDの設定(１ファイルで一つ)
			if (StringUtils.isNotEmpty(ecOrderBulkInputDto.data.base.getRcvIdColumnNm())) {
				Method rcvIdSetMethod;
				try {
					rcvIdSetMethod = entity.getClass().getMethod("set" + StringUtils.capitalize(ecOrderBulkInputDto.data.base.getRcvIdColumnNm()), Long.class);
					rcvIdSetMethod.invoke(entity, receiveId);
				} catch (NoSuchMethodException e) {
					getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
					return null;
				} catch (Exception e) {
					getErrorManager().throwException(e);
					return null;
				}
			}
			// 行№の設定(１ファイルで通番)
			if (StringUtils.isNotEmpty(ecOrderBulkInputDto.data.base.getRowNoColumnNm())) {
				rowNo += 1;
				Method rowNoSetMethod;
				try {
					rowNoSetMethod = entity.getClass().getMethod("set" + StringUtils.capitalize(ecOrderBulkInputDto.data.base.getRowNoColumnNm()), Long.class);
					rowNoSetMethod.invoke(entity, rowNo);
				} catch (NoSuchMethodException e) {
					getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
					return null;
				} catch (Exception e) {
					getErrorManager().throwException(e);
					return null;
				}
			}
			// エラーフラグの設定
			Method errorFlgSetMethod;
			try {
				errorFlgSetMethod = entity.getClass().getMethod("setErrorFlg", String.class);
				errorFlgSetMethod.invoke(entity, "0");
			} catch (NoSuchMethodException e) {
				// メソッドが無くても何もしない
			} catch (Exception e) {
				getErrorManager().throwException(e);
				return null;
			}
			// 取込みフラグの設定
			Method importFlgSetMethod;
			try {
				importFlgSetMethod = entity.getClass().getMethod("setImportFlg", String.class);
				importFlgSetMethod.invoke(entity, "0");
			} catch (NoSuchMethodException e) {
				// メソッドが無くても何もしない
			} catch (Exception e) {
				getErrorManager().throwException(e);
				return null;
			}

			// 取込み種別IDの設定
			Method importTypeIdSetMethod;
			try {
				importTypeIdSetMethod = entity.getClass().getMethod("setImportTypeId", Long.class);
				importTypeIdSetMethod.invoke(entity, ecOrderBulkInputDto.data.base.getImportTypeId());
			} catch (NoSuchMethodException e) {
				// メソッドが無くても何もしない
			} catch (Exception e) {
				getErrorManager().throwException(e);
				return null;
			}
		}

		// 同一受注番号が既に登録されているか確認（1件でも存在したら、全体エラー）
		if (orderNoMap.size() > 0) {
			TShippingInstHCB cbTShippingInstH = tShippingInstHBhv.newConditionBean();
			cbTShippingInstH.query().setClientId_Equal(ecOrderBulkInputDto.data.clientId);
			cbTShippingInstH.query().setCenterId_Equal(ecOrderBulkInputDto.data.centerId);
			cbTShippingInstH.query().setShippingStatus_NotEqual_$90(); // キャンセルされていない
			cbTShippingInstH.query().setClientShippingNo_InScope(orderNoMap.keySet()); // 受注番号が一緒
			cbTShippingInstH.query().addOrderBy_ClientShippingNo_Asc();

			List<TShippingInstH> shippingInstHList = tShippingInstHBhv.selectList(cbTShippingInstH);
			if (shippingInstHList.size() > 0) {
				// 1件でも存在したらエラー
				getErrorManager().add(errRetSts(StatusCode.DUPLICAT_ORDER_NO_ERROR), WmsMessageConst.EC_ORDER_DUPLICATE_ORDER_NO_ERROR, shippingInstHList.get(0).getClientShippingNo());
				return null;
			}
		}

		// 受信テーブルに一括インサート
		BehaviorWritable bhv = (BehaviorWritable) getBehaviorSelector().byName(ecOrderBulkInputDto.data.base.getUploadTableNm());
		bhv.lumpCreate(orderListObj, null);

		// 当日日付を取得する為、荷主センタマスタを取得しておく
		MClientCenter conditionEntity = new MClientCenter();
		conditionEntity.setClientId(ecOrderBulkInputDto.data.clientId);
		conditionEntity.setCenterId(ecOrderBulkInputDto.data.centerId);

		MClientCenter clientCenterEntity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		// EC受注ヘッダコピー列の定義取得
		MImportTypeBCopyHCB copyHcb = mImportTypeBCopyHBhv.newMyConditionBean();
		copyHcb.checkInvalidQuery();
		copyHcb.setupSelect_MImportTypeB();
		copyHcb.query().queryMImportTypeB().setImportTypeId_Equal(ecOrderBulkInputDto.data.base.getImportTypeId());
		List<MImportTypeBCopyH> copyHList = mImportTypeBCopyHBhv.selectList(copyHcb);

		// EC受注ボディコピー列の定義取得
		MImportTypeBCopyBCB copyBcb = mImportTypeBCopyBBhv.newMyConditionBean();
		copyBcb.checkInvalidQuery();
		copyBcb.setupSelect_MImportTypeB();
		copyBcb.query().queryMImportTypeB().setImportTypeId_Equal(ecOrderBulkInputDto.data.base.getImportTypeId());
		List<MImportTypeBCopyB> copyBList = mImportTypeBCopyBBhv.selectList(copyBcb);
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

		// getter/setterメソッドの設定
		List<Method> copyHgetterList = new ArrayList<Method>();
		List<Method> copyHsetterList = new ArrayList<Method>();
		List<Method> copyBgetterList = new ArrayList<Method>();
		List<Method> copyBsetterList = new ArrayList<Method>();
		try {
			// 取得元テーブル
			Class<?> srcTable = Class.forName("com.oneslogi.base.dbflute.exentity." + StringUtils.capitalize(ecOrderBulkInputDto.data.base.getUploadTableNm()));

			// EC受注ヘッダへのメソッドを取得
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
			for (MImportTypeBCopyH copyH : copyHList) {
				String srcColumn = copyH.getMImportTypeB().getUploadColumnNm();
				String copyColumn = copyH.getCopyHColumnNm();
				// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

				Method getter;
				Method setter;
				// getter/setterメソッドの取得
				getter = srcTable.getMethod("get" + StringUtils.capitalize(srcColumn));
				setter = TEcOrderH.class.getMethod("set" + StringUtils.capitalize(copyColumn), getter.getReturnType());

				copyHgetterList.add(getter);
				copyHsetterList.add(setter);
			}

			// EC受注ボディへのメソッドを取得
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
			for (MImportTypeBCopyB copyB : copyBList) {
				String srcColumn = copyB.getMImportTypeB().getUploadColumnNm();
				String copyColumn = copyB.getCopyBColumnNm();
				// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

				Method getter;
				Method setter;
				// getter/setterメソッドの取得
				getter = srcTable.getMethod("get" + StringUtils.capitalize(srcColumn));
				setter = TEcOrderB.class.getMethod("set" + StringUtils.capitalize(copyColumn), getter.getReturnType());

				copyBgetterList.add(getter);
				copyBsetterList.add(setter);
			}
		} catch (Exception e) {

			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana End

		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
		/********************************************************************
		/** 受注テーブルに取り込んだ後、以下の処理でEC受注データに取込みを行う
		/********************************************************************/
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		CDef.UploadTableNm uploadTable = CDef.UploadTableNm.codeOf(ecOrderBulkInputDto.data.base.getUploadTableNm());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		switch (uploadTable) {
		case $tRakutenOrder:
			register_ecOrder_rakuten(ecOrderBulkInputDto, receiveId, clientCenterEntity.getSystemDt(), copyHgetterList, copyHsetterList, copyBgetterList, copyBsetterList);
			break;
		case $tAmazonOrder:
			register_ecOrder_amazon(ecOrderBulkInputDto, receiveId, clientCenterEntity.getSystemDt(), copyHgetterList, copyHsetterList, copyBgetterList, copyBsetterList);
			break;
		case $tYahooOrder:
			register_ecOrder_yahoo(ecOrderBulkInputDto, receiveId, clientCenterEntity.getSystemDt(), copyHgetterList, copyHsetterList, copyBgetterList, copyBsetterList);
			break;
		}
		// エラー時は処理終了
		if (0 < getErrorManager().size()) {
			return null;
		}
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End

		/***************************************
		/** EC受注データから出荷指示を作成
		/***************************************/
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
		String importTypeCd = ecOrderBulkInputDto.data.base.getImportTypeCd();
		String matchingTypeDelivTz = importTypeCd + "_DELIV_TZ";
		String matchingTypeDelivCourse = importTypeCd + "_DELIVERY_COURSE";

		MProcessTypeCB cbProcessType = mProcessTypeBhv.newConditionBean();
		cbProcessType.query().setProcessTypeCd_Equal(machingTransformer.getTransformCd(importTypeCd, "PROCESS_TYPE_CD"));
		cbProcessType.specify().columnProcessTypeId();
		cbProcessType.specify().columnProcessTypeCd();
		long processTypeId = mProcessTypeBhv.selectEntity(cbProcessType).getProcessTypeId();
		String onetimeCustomerCd = machingTransformer.getTransformCd(importTypeCd, "ONETIME_CD");
		String stockTypeCd = machingTransformer.getTransformCd(importTypeCd, "STOCK_TYPE_CD");
		String depositCd = machingTransformer.getTransformCd(importTypeCd, "DEPOSIT_CD");
		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/15 SJA Start
		// 荷主CDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientId(ecOrderBulkInputDto.data.clientId);
		MClient clientEntity = clientLogic.getPkEntityWithDeletedCheck(clientCondition);

		// 取引先IDの取得
		MCustomer customerCondition = new MCustomer();
		customerCondition.setClientCd(clientEntity.getClientCd());
		customerCondition.setCustomerCd(onetimeCustomerCd);
		MCustomer customerEntity = customerLogic.getDeliveryCustomerByClientCd(customerCondition);
		if (customerEntity == null) {
			customerEntity = new MCustomer();
		}
		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/15 SJA End
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End

		// EC受注データから取込み対象データ取得
		TEcOrderBCB cbEcOrder = tEcOrderBBhv.newConditionBean();
		cbEcOrder.setupSelect_TEcOrderH();
		cbEcOrder.query().queryTEcOrderH().setReceiveId_Equal(receiveId);
		cbEcOrder.query().addOrderBy_EcOrderHId_Asc();
		cbEcOrder.query().addOrderBy_EcOrderBId_Asc();

		List<TEcOrderB> tEcOrderBList = tEcOrderBBhv.selectList(cbEcOrder);

		TShippingInstH tShippingInstH = new TShippingInstH();
		TShippingInstB tShippingInstB = new TShippingInstB();
		List<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();
		List<TShippingInstB> tShippingInstBList = new ArrayList<TShippingInstB>();
		Long ecOrderHId = 0l;
		TEcOrderH updateTEcOrderH = new TEcOrderH();
		Long lineNo = 0l;

		boolean isError = false;
		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		for (TEcOrderB tEcOrderBody : tEcOrderBList) {
			if (!ecOrderHId.equals(tEcOrderBody.getEcOrderHId())) {
				if (ecOrderHId > 0) {
					// 出荷指示関連へ追加
					shippingInsertLogic.insert(tShippingInstH, tShippingInstBList, errSts);

					// EC受注データの更新
					updateTEcOrderH.setShippingInstHId(tShippingInstH.getShippingInstHId());
					updateTEcOrderH.setImportFlg_$1();
					tEcOrderHBhv.update(updateTEcOrderH);

					// コントロールNoでエラーチェックをする為チェックを1回のみに変更(ここでのエラーチェックを削除) 2016.3.14 nayzaw

				}
				tShippingInstH = new TShippingInstH();
				tShippingInstBList = new ArrayList<TShippingInstB>();

				tShippingInstH.setClientId(tEcOrderBody.getTEcOrderH().getClientId());
				tShippingInstH.setCenterId(tEcOrderBody.getTEcOrderH().getCenterId());
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
				tShippingInstH.setProcessTypeId(processTypeId);
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End
				tShippingInstH.setInputType_$10();
				tShippingInstH.setShippingDt(clientCenterEntity.getSystemDt());
				tShippingInstH.setWorkDt(clientCenterEntity.getSystemDt());
				if (StringUtils.isNotEmpty(tEcOrderBody.getTEcOrderH().getDelivDt())) {
					tShippingInstH.setDelivPlanDt(tEcOrderBody.getTEcOrderH().getDelivDt());
					tShippingInstH.setDelivDt(tEcOrderBody.getTEcOrderH().getDelivDt());
				}
				// [#2017] EC受注データにおいて「指定日なし・指定時間あり」で指定時間がクリアされないように修正 2017/6/27 nayzaw Start
				tShippingInstH.setDelivTz(machingTransformer.getTransformCd(matchingTypeDelivTz, tEcOrderBody.getTEcOrderH().getDelivTz()));
				// [#2017] EC受注データにおいて「指定日なし・指定時間あり」で指定時間がクリアされないように修正 2017/6/27 nayzaw End
				tShippingInstH.setClientShippingNo(tEcOrderBody.getTEcOrderH().getOrderNo());
				tShippingInstH.setShippingSlipNo(numberingCenterLogic.getNumbering(tEcOrderBody.getTEcOrderH().getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));
				tShippingInstH.setShippingStatus_$10();
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
				tShippingInstH.setSupplyCustomerCd(onetimeCustomerCd);
				tShippingInstH.setDelivCustomerCd(onetimeCustomerCd);
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End
				tShippingInstH.setDelivAddressSupply(tEcOrderBody.getTEcOrderH().getMergeId());
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
				// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/15 SJA Start
				// 納品先ID
				tShippingInstH.setSupplyCustomerId(customerEntity.getCustomerId());
				// 納品先名称
				tShippingInstH.setSupplyCustomerNm(tEcOrderBody.getTEcOrderH().getDelivCustomerNm());
				// 届先ID
				tShippingInstH.setDelivCustomerId(customerEntity.getCustomerId());
				// 届先住所1
				tShippingInstH.setDelivAddress1(tEcOrderBody.getTEcOrderH().getDelivAddress1());
				// 届先住所2
				tShippingInstH.setDelivAddress2(tEcOrderBody.getTEcOrderH().getDelivAddress2());
				// 届先住所3
				tShippingInstH.setDelivAddress3(tEcOrderBody.getTEcOrderH().getDelivAddress3());
				// 届先名称
				tShippingInstH.setDelivCustomerNm(tEcOrderBody.getTEcOrderH().getDelivCustomerNm());
				// [#483] 荷札の消費税が表示されない不具合を修正 2016.12.19 kawana Start
				// 請求金額情報を取得
				TShippingInstH codInfo = getCodShippingInstH(tEcOrderBody.getTEcOrderH());
				// 代引請求額
				tShippingInstH.setCod(codInfo.getCod());
				// 消費税
				tShippingInstH.setCodTax(codInfo.getCodTax());
				// [#483] 荷札の消費税が表示されない不具合を修正 2016.12.19 kawana End
				// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/15 SJA End
				// 配送コースの検索
				// まずは決済方法で変換
				String deliveryCourceCd = machingTransformer.getTransformCdLikeMatch(matchingTypeDelivCourse, tEcOrderBody.getTEcOrderH().getPaymentMethod());
				if (StringUtils.isEmpty(deliveryCourceCd)) {
					// 配送方法で変換
					deliveryCourceCd = machingTransformer.getTransformCdLikeMatch(matchingTypeDelivCourse, tEcOrderBody.getTEcOrderH().getDelivMethod());
				}
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End
				tShippingInstH.setDeliveryCourseCd(deliveryCourceCd);
				tShippingInstH.setEmergencyFlg_$0();
				tShippingInstH.setPickingWorkMessage(tEcOrderBody.getTEcOrderH().getComment1());
				tShippingInstH.setErrorFlg_$1();
				// コントロールNoでチェック処理を対応するよう変更為コントロールNoをヘッダに設定する 2016.3.14 nayzaw Start
				tShippingInstH.setControlNo(controlNo);
				tShippingInstHList.add(tShippingInstH);
				// コントロールNoでチェック処理を対応するよう変更為コントロールNoをヘッダに設定する 2016.3.14 nayzaw End

				updateTEcOrderH = tEcOrderBody.getTEcOrderH();
				ecOrderHId = tEcOrderBody.getEcOrderHId();
				lineNo = 0l;
			}

			lineNo += 1;
			tShippingInstB = new TShippingInstB();

			tShippingInstB.setLineNo(lineNo);
			// [EC-CT1-014] 2015.02.10 商品CDが指定されていないと、NotNull制約に引っかかるのでエラーにする。 t.koseki Start
			if (StringUtils.isEmpty(tEcOrderBody.getProductCd())) {
				getErrorManager().add(errRetSts(StatusCode.NECESSARY_ERROR), WmsMessageConst.EC_ORDER_NECESSARY_PRODUCT_CD_ERROR);
				return null;
			}
			// [EC-CT1-014] 2015.02.10 商品CDが指定されていないと、NotNull制約に引っかかるのでエラーにする。 t.koseki End

			tShippingInstB.setProductCd(tEcOrderBody.getProductCd());
			// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana Start
			tShippingInstB.setStockTypeCd(stockTypeCd);
			tShippingInstB.setDepositCd(depositCd);
			// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.28 kawana End
			tShippingInstB.setInstNum(WCC.toBigDecimal(CU.nullToZero(tEcOrderBody.getOrderNum())));

			tShippingInstBList.add(tShippingInstB);
		}
		if (ecOrderHId > 0) {
			// 出荷指示関連へ追加
			shippingInsertLogic.insert(tShippingInstH, tShippingInstBList, errSts);

			// EC受注データの更新
			updateTEcOrderH.setShippingInstHId(tShippingInstH.getShippingInstHId());
			updateTEcOrderH.setImportFlg_$1();
			tEcOrderHBhv.update(updateTEcOrderH);

			// エラーチェック処をコントロールNoで取得する方法に変更 2016.03.14 nayzaw Start
			// 出荷指示のエラーチェック
			boolean err = shippingInstErrorCheckLogic.check(controlNo,null, errSts);

			if (err) {
				isError = true;
				// 出荷指示のエラーチェックメッソドでエラーマネージャーに入れたエラーメッセージをクリア
				getErrorManager().clear();
			}
		}

		// 出荷指示ボディのコントロールNoクリア処理追加と更新数チェック処理追加 2016.4.25 nayzaw Start
		//コントロールNo.のクリア処理
		for (TShippingInstH list : tShippingInstHList) {
			list.setControlNo(controlNo);
		}
		Long oldControlNo = controlNo;
		controlNo = null;
		// 出荷指示ヘッダのコントロールNoクリア
		int headerUpdateCount = updateControlNoLogic.update(tShippingInstHList, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

 		// 出荷指示ボディのコントロールNoクリア
		int bodyUpdateCount = updateControlNoLogic.updateTShippingInstBody(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}
		if(headerUpdateCount != tShippingInstHList.size() || bodyUpdateCount != tEcOrderBList.size()){
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// 出荷指示ボディのコントロールNoクリア処理追加と更新数チェック処理追加 2016.4.25 nayzaw End

		// エラーチェック処をコントロールNoで取得する方法に変更 2016.03.14 nayzaw End

		if (isError) {
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.SHIPPING_INST_WARN), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		} else {
			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		}

		return null;
	}

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.06.02 kawana Start

	/**
	 * 楽天RMS受注テーブルからEC受注ヘッダ、EC受注ボディテーブルを登録する
	 *
	 * @param ecOrderBulkInputDto EC受注データ一括取込DTO
	 * @param receiveId 受信ID
	 * @param SystemDt システム日付
	 * @param copyHgetterList 楽天RMSからEC受注ヘッダへコピーする列のgetterリスト
	 * @param copyHsetterList 楽天RMSからEC受注ヘッダへコピーする列のsetterリスト
	 * @param copyBgetterList 楽天RMSからEC受注ボディへコピーする列のgetterリスト
	 * @param copyBsetterList 楽天RMSからEC受注ボディへコピーする列のsetterリスト
	 */
	private void register_ecOrder_rakuten(EcOrderBulkInputDto ecOrderBulkInputDto, Long receiveId, String SystemDt, List<Method> copyHgetterList, List<Method> copyHsetterList,
			List<Method> copyBgetterList, List<Method> copyBsetterList) {

		String combineId = null;
		String delivDt = null;
		String delivTz = null;
		String paymentMethod = null;
		String delivMethod = null;

		TRakutenOrderCB cb = tRakutenOrderBhv.newConditionBean();
		cb.query().setReceiveId_Equal(receiveId);
		cb.query().setImportFlg_Equal("0");
		cb.query().addOrderBy_CombineId_Asc();
		cb.query().addOrderBy_CombineStatus_Asc();
		cb.query().addOrderBy_RowNo_Asc();
		List<TRakutenOrder> orderList = tRakutenOrderBhv.selectList(cb);
		String orderNo = null;
		TEcOrderH tEcOrderH = new TEcOrderH();
		TEcOrderR tEcOrderR;
		TEcOrderB tEcOrderB;

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana Start
		List<Object> copyHValueList = null;
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana End

		for (TRakutenOrder tRakutenOrder : orderList) {
			// 同梱IDが同じデータは1件目と同じ配送方法等にする。
			if (StringUtils.isNotEmpty(tRakutenOrder.getCombineId()) && !tRakutenOrder.getCombineId().equals("0")) {
				if (StringUtils.isEmpty(combineId) || !combineId.equals(tRakutenOrder.getCombineId())) {
					delivDt = tRakutenOrder.getDelivDt();
					delivTz = tRakutenOrder.getDelivTz();
					paymentMethod = tRakutenOrder.getPaymentMethod();
					delivMethod = tRakutenOrder.getDelivMethod();
				}
				combineId = tRakutenOrder.getCombineId();
			} else {
				delivDt = tRakutenOrder.getDelivDt();
				delivTz = tRakutenOrder.getDelivTz();
				paymentMethod = tRakutenOrder.getPaymentMethod();
				delivMethod = tRakutenOrder.getDelivMethod();
			}

			if (StringUtils.isEmpty(orderNo) || !orderNo.equals(tRakutenOrder.getOrderNo())) {
				// 受注番号が変わったら、EC受注ヘッダを作成
				tEcOrderH = new TEcOrderH();
				tEcOrderH.setClientId(ecOrderBulkInputDto.data.clientId);
				tEcOrderH.setCenterId(ecOrderBulkInputDto.data.centerId);
				tEcOrderH.setImportDt(SystemDt);
				tEcOrderH.setOrderNo(tRakutenOrder.getOrderNo());
				// あす楽の場合、優先フラグを立てる
				if (StringUtils.isNotEmpty(tRakutenOrder.getTomorrowFlg()) && tRakutenOrder.getTomorrowFlg().equals("1")) {
					tEcOrderH.setPriorityFlg_$1();
				} else {
					tEcOrderH.setPriorityFlg_$0();
				}
				tEcOrderH.setOrderDt(toDateStringFormat(tRakutenOrder.getOrderDt()));
				tEcOrderH.setOrderTime(tRakutenOrder.getOrderTime());
				tEcOrderH.setDelivDt(toDateStringFormat(delivDt));
				tEcOrderH.setDelivTz(delivTz);
				tEcOrderH.setComment1(tRakutenOrder.getSingleMemo()); // コメント1に一言メモ
				tEcOrderH.setComment2(tRakutenOrder.getRakutenOrderComment()); // コメント2に通常コメント
				if (StringUtils.isNotEmpty(tRakutenOrder.getGiftFlg()) && tRakutenOrder.getGiftFlg().equals("1")) {
					tEcOrderH.setGiftFlg_$1();
				} else {
					tEcOrderH.setGiftFlg_$0();
				}
				tEcOrderH.setNoshi(tRakutenOrder.getNoshi());
				String orderZipCd = "";
				if (StringUtils.isNotEmpty(tRakutenOrder.getOrderZipCd1()) && tRakutenOrder.getOrderZipCd1().length() > 3) {
					if (StringUtils.isNumeric(tRakutenOrder.getOrderZipCd1().replace("-", ""))) {
						orderZipCd = StringUtils.leftPad(tRakutenOrder.getOrderZipCd1().replace("-", ""), 7, '0');
					} else {
						orderZipCd = tRakutenOrder.getOrderZipCd1();
					}
				} else if (StringUtils.isNotEmpty(tRakutenOrder.getOrderZipCd1()) && StringUtils.isNotEmpty(tRakutenOrder.getOrderZipCd2())) {
					if (!StringUtils.isNumeric(tRakutenOrder.getOrderZipCd1()) || !StringUtils.isNumeric(tRakutenOrder.getOrderZipCd2())) {
						orderZipCd = tRakutenOrder.getOrderZipCd1() + tRakutenOrder.getOrderZipCd2();
					} else {
						orderZipCd = StringUtils.leftPad(tRakutenOrder.getOrderZipCd1(), 3, '0') + StringUtils.leftPad(tRakutenOrder.getOrderZipCd2(), 4, '0');
					}
				}
				if (orderZipCd.equals("0000000")) {
					orderZipCd = "";
				}
				tEcOrderH.setOrderZipCd(orderZipCd);
				tEcOrderH.setOrderAddress1(tRakutenOrder.getOrderAddress1());
				tEcOrderH.setOrderAddress2(tRakutenOrder.getOrderAddress2());
				tEcOrderH.setOrderAddress3(tRakutenOrder.getOrderAddress3());
				tEcOrderH.setOrderCustomerNm((CU.nullToStr(tRakutenOrder.getOrderCustomerNm1()) + " " + CU.nullToStr(tRakutenOrder.getOrderCustomerNm2())).trim());
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana Start
				tEcOrderH.setOrderCustomerNmKana(CU.nullToStr(tRakutenOrder.getOrderCustomerKn1()) + " " + CU.nullToStr(tRakutenOrder.getOrderCustomerKn2()).trim());
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana End
				tEcOrderH.setOrderTelNo(CU.nullToStr(tRakutenOrder.getOrderTelNo1()) + CU.nullToStr(tRakutenOrder.getOrderTelNo2()) + CU.nullToStr(tRakutenOrder.getOrderTelNo3()));
				if (StringUtils.isNotEmpty(tRakutenOrder.getDelivMatchFlg()) && tRakutenOrder.getDelivMatchFlg().equals("1")) {
					tEcOrderH.setDelivMatchFlg_$1();
				} else if (StringUtils.isNotEmpty(tRakutenOrder.getDelivMatchFlg()) && tRakutenOrder.getDelivMatchFlg().equals("0")) {
					tEcOrderH.setDelivMatchFlg_$0();
				} else {
					if (CU.equals(tRakutenOrder.getOrderAddress1(), tRakutenOrder.getDelivAddress1())
							&& CU.equals(tRakutenOrder.getOrderAddress2(), tRakutenOrder.getDelivAddress2())
							&& CU.equals(tRakutenOrder.getOrderAddress3(), tRakutenOrder.getDelivAddress3())
							&& CU.equals(tRakutenOrder.getOrderCustomerNm1(), tRakutenOrder.getDelivCustomerNm1())
							&& CU.equals(tRakutenOrder.getOrderCustomerNm2(), tRakutenOrder.getDelivCustomerNm2())) {
						tEcOrderH.setDelivMatchFlg_$1();
					} else {
						tEcOrderH.setDelivMatchFlg_$0();
					}
				}
				if (StringUtils.isNotEmpty(tRakutenOrder.getCombineId()) && !tRakutenOrder.getCombineId().equals("0")) {
					// 同梱IDが振られていたら、設定
					tEcOrderH.setMergeId(tRakutenOrder.getCombineId());
				} else {
					// 同梱IDが振られていない場合、受注NOを設定
					tEcOrderH.setMergeId(tRakutenOrder.getOrderNo());
				}
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana Start
				tEcOrderH.setMergeStatus(tRakutenOrder.getCombineStatus());
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana End
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.06.02 kawana Start
				tEcOrderH.setDelivZipCd(toZipCdStringFormat(tRakutenOrder.getDelivZipCd1(), tRakutenOrder.getDelivZipCd2()));
				// [C-CWMS-0026] Amazon,Yahoo対応 2015.06.02 kawana End
				tEcOrderH.setDelivAddress1(tRakutenOrder.getDelivAddress1());
				tEcOrderH.setDelivAddress2(tRakutenOrder.getDelivAddress2());
				tEcOrderH.setDelivAddress3(tRakutenOrder.getDelivAddress3());
				tEcOrderH.setDelivCustomerNm((CU.nullToStr(tRakutenOrder.getDelivCustomerNm1()) + " " + CU.nullToStr(tRakutenOrder.getDelivCustomerNm2())).trim());
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana Start
				tEcOrderH.setDelivCustomerNmKana(CU.nullToStr(tRakutenOrder.getDelivCustomerKn1()) + " " + CU.nullToStr(tRakutenOrder.getDelivCustomerKn2()).trim());
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana End
				tEcOrderH.setDelivTelNo(CU.nullToStr(tRakutenOrder.getDelivTelNo1()) + CU.nullToStr(tRakutenOrder.getDelivTelNo2()) + CU.nullToStr(tRakutenOrder.getDelivTelNo3()));
				tEcOrderH.setDelivMethod(delivMethod);
				tEcOrderH.setDelivType(tRakutenOrder.getDelivType());
				tEcOrderH.setDelivCompany(tRakutenOrder.getDelivCompany());
				tEcOrderH.setPaymentMethod(paymentMethod);
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana Start
				tEcOrderH.setCardType(tRakutenOrder.getCardType());
				tEcOrderH.setTotal(tRakutenOrder.getTotal());
				tEcOrderH.setTax(tRakutenOrder.getTax());
				tEcOrderH.setCarriage(tRakutenOrder.getCarriage());
				tEcOrderH.setCod(tRakutenOrder.getCod());
				tEcOrderH.setTotalAmount(tRakutenOrder.getTotalAmount());
				tEcOrderH.setCouponDiscount(abs(tRakutenOrder.getCouponUse()));
				tEcOrderH.setPointDiscount(abs(tRakutenOrder.getPointUse()));
				tEcOrderH.setAmountBilled(tRakutenOrder.getAmountBilled());
				tEcOrderH.setMergeTotal(tRakutenOrder.getCombineTotal());
				tEcOrderH.setMergeCarriage(tRakutenOrder.getCombineCarriage());
				tEcOrderH.setMergeCod(tRakutenOrder.getCombineCod());
				tEcOrderH.setMergeTax(tRakutenOrder.getCombineTax());
				tEcOrderH.setMergeAmountBilled(tRakutenOrder.getCombineBilled());
				tEcOrderH.setMergeTotalAmount(tRakutenOrder.getCombineAmount());
				tEcOrderH.setMergeCouponDiscount(abs(tRakutenOrder.getCombineCouponUse()));
				tEcOrderH.setMergePointDiscount(abs(tRakutenOrder.getCombinePointUse()));
				tEcOrderH.setPackingQty(tRakutenOrder.getPackingQty());
				tEcOrderH.setSlipItemNm1(tRakutenOrder.getSlipItemNm1());
				tEcOrderH.setSlipItemNm2(tRakutenOrder.getSlipItemNm2());
				tEcOrderH.setSlipItemNm3(tRakutenOrder.getSlipItemNm3());
				tEcOrderH.setSlipItemNm4(tRakutenOrder.getSlipItemNm4());
				tEcOrderH.setSlipItemNm5(tRakutenOrder.getSlipItemNm5());
				tEcOrderH.setSlipItemCd1(tRakutenOrder.getSlipItemCd1());
				tEcOrderH.setSlipItemCd2(tRakutenOrder.getSlipItemCd2());
				tEcOrderH.setFreightHandling1(tRakutenOrder.getFreightHandling1());
				tEcOrderH.setFreightHandling2(tRakutenOrder.getFreightHandling2());
				tEcOrderH.setArticle(tRakutenOrder.getArticle());
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.15 kawana End
				tEcOrderH.setImportFlg_$0();
				tEcOrderH.setImportTypeId(ecOrderBulkInputDto.data.base.getImportTypeId());

				tEcOrderH.setReceiveId(receiveId);

				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana Start
				copyHValueList = new ArrayList<Object>();
				// 受注ヘッダのコピー列に設定
				for (int i = 0; i < copyHgetterList.size(); i++) {
					Method getter = copyHgetterList.get(i);
					Method setter = copyHsetterList.get(i);

					try {
						Object getValue = getter.invoke(tRakutenOrder);
						setter.invoke(tEcOrderH, getValue);

						copyHValueList.add(getValue);
					} catch (Exception e) {
						getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
						return;
					}
				}
				// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana End

				tEcOrderHBhv.insert(tEcOrderH);

				// EC受注帳票の追加
				tEcOrderR = new TEcOrderR();
				tEcOrderR.setEcOrderHId(tEcOrderH.getEcOrderHId());
				tEcOrderR.setStatementOutFlg_$0();
				tEcOrderR.setInvoiceCreateFlg_$0();

				tEcOrderRBhv.insert(tEcOrderR);
				orderNo = tRakutenOrder.getOrderNo();
			}

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana Start

			// EC受注ヘッダへのコピー項目が空の場合は現在の行の値を設定する
			boolean doUpdateHeader = false;
			for (int i = 0; i < copyHgetterList.size(); i++) {

				// 現在値
				Object getCurrentValue = copyHValueList.get(i);
				if (isNullOrEmpty(getCurrentValue)) {
					// 現在値が空の場合

					try {
						// 現在行の値を取得
						Method getter = copyHgetterList.get(i);
						Object getNewValue = getter.invoke(tRakutenOrder);
						if (!isNullOrEmpty(getNewValue)) {
							// 現在行の値が設定されている場合

							// 再設定
							Method setter = copyHsetterList.get(i);
							setter.invoke(tEcOrderH, getNewValue);

							// 現在値を更新
							copyHValueList.set(i, getNewValue);
							doUpdateHeader = true;
						}
					} catch (Exception e) {
						getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
						return;
					}
				}
			}

			//  EC受注ヘッダの変更あり
			if (doUpdateHeader) {

				// 更新実行
				tEcOrderHBhv.update(tEcOrderH);
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana End

			// EC受注ボディの作成
			tEcOrderB = new TEcOrderB();
			tEcOrderB.setEcOrderHId(tEcOrderH.getEcOrderHId());
			tEcOrderB.setProductCd(tRakutenOrder.getProductNo());
			tEcOrderB.setProductNm(tRakutenOrder.getProductNm());
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			tEcOrderB.setProductOption(tRakutenOrder.getItemChoice());
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
			tEcOrderB.setOrderNum(tRakutenOrder.getOrderNum());
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			tEcOrderB.setUnitPrice(tRakutenOrder.getUnitPrice());
			if (tEcOrderB.getOrderNum() != null && tEcOrderB.getUnitPrice() != null) {
				tEcOrderB.setUnitTotalPrice(tEcOrderB.getOrderNum() * tEcOrderB.getUnitPrice());
			}

			// 受注ボディのコピー列に設定
			for (int i = 0; i < copyBgetterList.size(); i++) {
				Method getter = copyBgetterList.get(i);
				Method setter = copyBsetterList.get(i);

				try {
					Object getValue = getter.invoke(tRakutenOrder);
					setter.invoke(tEcOrderB, getValue);
				} catch (Exception e) {
					getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
					return;
				}
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End

			tEcOrderBBhv.insert(tEcOrderB);

			// 楽天RMS受注を更新
			tRakutenOrder.setEcOrderBId(tEcOrderB.getEcOrderBId());
			tRakutenOrder.setImportFlg("1");

			tRakutenOrderBhv.update(tRakutenOrder);
		}
	}

	/**
	 * AMAZON受注テーブルからEC受注ヘッダ、EC受注ボディテーブルを登録する
	 *
	 * @param ecOrderBulkInputDto EC受注データ一括取込DTO
	 * @param receiveId 受信ID
	 * @param SystemDt システム日付
	 * @param copyHgetterList 楽天RMSからEC受注ヘッダへコピーする列のgetterリスト
	 * @param copyHsetterList 楽天RMSからEC受注ヘッダへコピーする列のsetterリスト
	 * @param copyBgetterList 楽天RMSからEC受注ボディへコピーする列のgetterリスト
	 * @param copyBsetterList 楽天RMSからEC受注ボディへコピーする列のsetterリスト
	 */
	private void register_ecOrder_amazon(EcOrderBulkInputDto ecOrderBulkInputDto, Long receiveId, String SystemDt, List<Method> copyHgetterList, List<Method> copyHsetterList,
			List<Method> copyBgetterList, List<Method> copyBsetterList) {

		TAmazonOrderCB orderCb = tAmazonOrderBhv.newConditionBean();
		orderCb.query().setReceiveId_Equal(receiveId);
		orderCb.query().setImportFlg_Equal("0");
		orderCb.query().addOrderBy_OrderId_Asc();
		orderCb.query().addOrderBy_RowNo_Asc();
		List<TAmazonOrder> orderList = tAmazonOrderBhv.selectList(orderCb);

		String importTypeCd = ecOrderBulkInputDto.data.base.getImportTypeCd();
		String matchingTypePayMethod = importTypeCd + "_PAY_METHOD";

		String beforeOrderId = null;
		TEcOrderH tEcOrderH = null;
		List<Object> copyHValueList = null;

		for (TAmazonOrder amazon : orderList) {

			// 注文ID
			String orderId = amazon.getOrderId();
			if (StringUtils.isEmpty(beforeOrderId) || !beforeOrderId.equals(orderId)) {

				// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana Start
				if (!StringUtils.isEmpty(beforeOrderId)) {

					// 合計を反映するために更新 (合計金額等)
					register_ecOrder_amazon_setTotalAmount(tEcOrderH);
					tEcOrderHBhv.update(tEcOrderH);
				}
				// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana End

				// 注文IDが変わったらEC受注ヘッダを作成
				tEcOrderH = new TEcOrderH();
				tEcOrderH.setClientId(ecOrderBulkInputDto.data.clientId);
				tEcOrderH.setCenterId(ecOrderBulkInputDto.data.centerId);
				tEcOrderH.setImportDt(SystemDt);
				tEcOrderH.setOrderNo(orderId);
				if (!CU.isNullOrEmpty(amazon.getPaymentsDate())) {
					String[] paymentsDates = splitStr(amazon.getPaymentsDate(), "T");
					tEcOrderH.setOrderDt(toDateStringFormat(paymentsDates[0]));
					if (paymentsDates.length > 1) {
						tEcOrderH.setOrderTime(paymentsDates[1].split("[+]")[0]);
					}
				}

				if (!CU.isNullOrEmpty(amazon.getScheduledDeliStDate())) {
					// お届け開始日時
					String[] scheduleStartDates = splitStr(amazon.getScheduledDeliStDate(), "T");
					String scheduleStartDt = toDateStringFormat(scheduleStartDates[0]);
					String scheduleStartTime = null;
					if (scheduleStartDates.length > 1) {
						scheduleStartTime = scheduleStartDates[1].split("[+]")[0];
					}

					tEcOrderH.setDelivDt(scheduleStartDt);
					String delivTz = null;
					if (!CU.isNullOrEmpty(amazon.getScheduledDeliEdDate())) {
						// お届け終了日時の設定あり

						String[] scheduleEndDates = splitStr(amazon.getScheduledDeliEdDate(), "T");
						String scheduleEndDt = toDateStringFormat(scheduleEndDates[0]);
						if (scheduleEndDates.length > 1) {
							String scheduleEndTime = scheduleEndDates[1].split("[+]")[0];

							if (scheduleStartDt.equals(scheduleEndDt)) {
								// 同じ日
								if (!CU.isNullOrEmpty(scheduleStartTime) && !CU.isNullOrEmpty(scheduleEndTime)) {
									delivTz = scheduleStartTime + "-" + scheduleEndTime;
								}
							}
						}
					}

					if (delivTz != null) {
						tEcOrderH.setDelivTz(delivTz);
					} else {
						tEcOrderH.setDelivTz(scheduleStartTime);
					}
				}

				tEcOrderH.setComment2(amazon.getGiftMassageText()); // コメント2にギフトメッセージ
				if (StringUtils.isNotEmpty(amazon.getGiftWrapType())) {
					tEcOrderH.setGiftFlg_$1();
				} else {
					tEcOrderH.setGiftFlg_$0();
				}
				tEcOrderH.setOrderCustomerNm(amazon.getBuyerName());
				tEcOrderH.setOrderTelNo(amazon.getBuyerPhoneNumber());
				// [#5672][v3.1] Amazonの送付先一致フラグは0ではなく「-」を設定 2018.11.21 kawana Start
				tEcOrderH.setDelivMatchFlg("-");
				// [#5672][v3.1] Amazonの送付先一致フラグは0ではなく「-」を設定 2018.11.21 kawana End
				tEcOrderH.setMergeId(orderId);
				tEcOrderH.setDelivZipCd(toZipCdStringFormat(amazon.getShipPostalCode()));
				tEcOrderH.setDelivAddress1(amazon.getShipState());
				tEcOrderH.setDelivAddress2(amazon.getShipCity());
				tEcOrderH.setDelivAddress3((CU.nullToStr(amazon.getShipAddress1()) + " " + CU.nullToStr(amazon.getShipAddress2()) + " " + CU.nullToStr(amazon.getShipAddress3())).trim());
				tEcOrderH.setDelivCustomerNm(amazon.getRecipientName());
				tEcOrderH.setDelivTelNo(amazon.getShipPhoneNumber());
				tEcOrderH.setDelivMethod(amazon.getShipServiceLevel());
				tEcOrderH.setPaymentMethod(machingTransformer.getTransformCd(matchingTypePayMethod, amazon.getPaymentMethod()));
				// [#6700][v3.1] Amazon受注の合計金額不正を修正(明細の合計項目の設定を削除) 2019.09.13 kawana Delete
				tEcOrderH.setCouponDiscount(abs(amazon.getAlreadyPaid()));
				// [#6700][v3.1] Amazon受注の合計金額不正を修正(明細の合計項目の設定を削除) 2019.09.13 kawana Delete
				tEcOrderH.setPackingQty(amazon.getPackingQty());
				tEcOrderH.setSlipItemNm1(amazon.getSlipItemNm1());
				tEcOrderH.setSlipItemNm2(amazon.getSlipItemNm2());
				tEcOrderH.setSlipItemNm3(amazon.getSlipItemNm3());
				tEcOrderH.setSlipItemNm4(amazon.getSlipItemNm4());
				tEcOrderH.setSlipItemNm5(amazon.getSlipItemNm5());
				tEcOrderH.setSlipItemCd1(amazon.getSlipItemCd1());
				tEcOrderH.setSlipItemCd2(amazon.getSlipItemCd2());
				tEcOrderH.setFreightHandling1(amazon.getFreightHandling1());
				tEcOrderH.setFreightHandling2(amazon.getFreightHandling2());
				tEcOrderH.setArticle(amazon.getArticle());
				tEcOrderH.setImportFlg_$0();
				tEcOrderH.setImportTypeId(ecOrderBulkInputDto.data.base.getImportTypeId());

				tEcOrderH.setReceiveId(receiveId);

				copyHValueList = new ArrayList<Object>();
				// 受注ヘッダのコピー列に設定
				for (int i = 0; i < copyHgetterList.size(); i++) {
					Method getter = copyHgetterList.get(i);
					Method setter = copyHsetterList.get(i);

					try {
						Object getValue = getter.invoke(amazon);
						setter.invoke(tEcOrderH, getValue);

						copyHValueList.add(getValue);
					} catch (Exception e) {
						getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
						return;
					}
				}

				tEcOrderHBhv.insert(tEcOrderH);

				// EC受注帳票の追加
				TEcOrderR tEcOrderR = new TEcOrderR();
				tEcOrderR.setEcOrderHId(tEcOrderH.getEcOrderHId());
				tEcOrderR.setStatementOutFlg_$0();
				tEcOrderR.setInvoiceCreateFlg_$0();

				tEcOrderRBhv.insert(tEcOrderR);
				beforeOrderId = orderId;
			}

			// EC受注ヘッダへのコピー項目が空の場合は現在の行の値を設定する
			boolean doUpdateHeader = false;
			for (int i = 0; i < copyHgetterList.size(); i++) {

				// 現在値
				Object getCurrentValue = copyHValueList.get(i);
				if (isNullOrEmpty(getCurrentValue)) {
					// 現在値が空の場合

					try {
						// 現在行の値を取得
						Method getter = copyHgetterList.get(i);
						Object getNewValue = getter.invoke(amazon);
						if (!isNullOrEmpty(getNewValue)) {
							// 現在行の値が設定されている場合

							// 再設定
							Method setter = copyHsetterList.get(i);
							setter.invoke(tEcOrderH, getNewValue);

							// 現在値を更新
							copyHValueList.set(i, getNewValue);
							doUpdateHeader = true;
						}
					} catch (Exception e) {
						getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
						return;
					}
				}
			}

			//  EC受注ヘッダの変更あり
			if (doUpdateHeader) {

				// 更新実行
				tEcOrderHBhv.update(tEcOrderH);
			}

			// EC受注ボディの作成
			TEcOrderB tEcOrderB = new TEcOrderB();
			tEcOrderB.setEcOrderHId(tEcOrderH.getEcOrderHId());
			tEcOrderB.setProductCd(amazon.getSku());
			tEcOrderB.setProductNm(amazon.getProductName());
			tEcOrderB.setOrderNum(amazon.getQuantityPurchased());


			// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana Start
			// EC受注ヘッダの合計列を加算
			tEcOrderH.setTotal(sum(tEcOrderH.getTotal(), amazon.getItemPrice(), amazon.getGiftWrapPrice()));
			tEcOrderH.setTax(sum(tEcOrderH.getTax(), amazon.getItemTax(), amazon.getGiftWrapTax()));
			tEcOrderH.setCarriage(sum(tEcOrderH.getCarriage(), amazon.getShippingPrice()));
			tEcOrderH.setCod(sum(tEcOrderH.getCod(), amazon.getPaymentMethodFee()));
			tEcOrderH.setOtherDiscount(sumDiscount(tEcOrderH.getOtherDiscount(), amazon.getItemPromotionDiscount(), amazon.getShipPromotionDiscount()));
			// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana End

			// 受注ボディのコピー列に設定
			for (int i = 0; i < copyBgetterList.size(); i++) {
				Method getter = copyBgetterList.get(i);
				Method setter = copyBsetterList.get(i);

				try {
					Object getValue = getter.invoke(amazon);
					setter.invoke(tEcOrderB, getValue);
				} catch (Exception e) {
					getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
					return;
				}
			}

			tEcOrderBBhv.insert(tEcOrderB);

			// Amazon受注を更新
			amazon.setEcOrderBId(tEcOrderB.getEcOrderBId());
			amazon.setImportFlg("1");

			tAmazonOrderBhv.update(amazon);
		}

		// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana Start
		// 合計を反映するために更新 (合計金額等)
		register_ecOrder_amazon_setTotalAmount(tEcOrderH);
		tEcOrderHBhv.update(tEcOrderH);
		// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana End
	}

	// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana Start

	/**
	 * AMAZON受注テーブルからEC受注ヘッダの登録 - 合計金額の設定
	 */
	private void register_ecOrder_amazon_setTotalAmount(TEcOrderH tEcOrderH) {
		// 合計金額 (合計 + 送料 + 代引料)
		tEcOrderH.setTotalAmount(sum(tEcOrderH.getTotal(), tEcOrderH.getCarriage(), tEcOrderH.getCod()));
		// 請求金額 (合計金額 - (クーポン利用額 + ポイント利用額 + その他値引))
		long totalDiscount = CU.nullToZero(sumDiscount(tEcOrderH.getCouponDiscount(), tEcOrderH.getPointDiscount(), tEcOrderH.getOtherDiscount()));
		tEcOrderH.setAmountBilled(CU.nullToZero(tEcOrderH.getTotalAmount()) - totalDiscount);
	}

	// [#6700][v3.1] Amazon受注の合計金額不正を修正 2019.09.13 kawana End

	/**
	 * YAHOO受注テーブルからEC受注ヘッダ、EC受注ボディテーブルを登録する
	 *
	 * @param ecOrderBulkInputDto EC受注データ一括取込DTO
	 * @param receiveId 受信ID
	 * @param SystemDt システム日付
	 * @param copyHgetterList 楽天RMSからEC受注ヘッダへコピーする列のgetterリスト
	 * @param copyHsetterList 楽天RMSからEC受注ヘッダへコピーする列のsetterリスト
	 * @param copyBgetterList 楽天RMSからEC受注ボディへコピーする列のgetterリスト
	 * @param copyBsetterList 楽天RMSからEC受注ボディへコピーする列のsetterリスト
	 */
	private void register_ecOrder_yahoo(EcOrderBulkInputDto ecOrderBulkInputDto, Long receiveId, String SystemDt, List<Method> copyHgetterList, List<Method> copyHsetterList,
			List<Method> copyBgetterList, List<Method> copyBsetterList) {

		TYahooOrderCB orderCb = tYahooOrderBhv.newConditionBean();
		orderCb.query().setReceiveId_Equal(receiveId);
		orderCb.query().setImportFlg_Equal("0");
		orderCb.query().addOrderBy_OrderId_Asc();
		orderCb.query().addOrderBy_RowNo_Asc();
		List<TYahooOrder> orderList = tYahooOrderBhv.selectList(orderCb);

		String importTypeCd = ecOrderBulkInputDto.data.base.getImportTypeCd();
		String matchingTypeDelivCompany = importTypeCd + "_DELIV_COMPANY";
		String matchingTypePayMethod = importTypeCd + "_PAY_METHOD";
		String matchingTypeCardType = importTypeCd + "_CARD_TYPE";

		String beforeOrderId = null;
		TEcOrderH tEcOrderH = null;
		List<Object> copyHValueList = null;

		for (TYahooOrder yahoo : orderList) {

			// 注文ID
			String orderId = yahoo.getOrderId();
			if (StringUtils.isEmpty(beforeOrderId) || !beforeOrderId.equals(orderId)) {
				// 注文IDが変わったらEC受注ヘッダを作成
				tEcOrderH = new TEcOrderH();
				tEcOrderH.setClientId(ecOrderBulkInputDto.data.clientId);
				tEcOrderH.setCenterId(ecOrderBulkInputDto.data.centerId);
				tEcOrderH.setImportDt(SystemDt);
				tEcOrderH.setOrderNo(orderId);
				if (!CU.isNullOrEmpty(yahoo.getOrderTime())) {
					String[] orderTimes = splitStr(yahoo.getOrderTime(), " ");
					tEcOrderH.setOrderDt(toDateStringFormat(orderTimes[0]));
					if (orderTimes.length > 1) {
						tEcOrderH.setOrderTime(orderTimes[1]);
					}
				}

				tEcOrderH.setDelivDt(toDateStringFormat(yahoo.getShipRequestDate()));
				tEcOrderH.setDelivTz(yahoo.getShipRequestTime());
				tEcOrderH.setComment1(yahoo.getBuyerComments());
				tEcOrderH.setComment2(yahoo.getGiftWrapMassage()); // コメント2にギフトメッセージ
				if (StringUtils.isNotEmpty(yahoo.getGiftWrapType())) {
					tEcOrderH.setGiftFlg_$1();
				} else {
					tEcOrderH.setGiftFlg_$0();
				}
				tEcOrderH.setNoshi(yahoo.getGiftWrapPaperType());
				tEcOrderH.setOrderZipCd(toZipCdStringFormat(yahoo.getBillZipCode()));
				tEcOrderH.setOrderAddress1(yahoo.getBillPrefecture());
				tEcOrderH.setOrderAddress2(yahoo.getBillCity());
				tEcOrderH.setOrderAddress3((CU.nullToStr(yahoo.getBillAddress1()) + " " + CU.nullToStr(yahoo.getBillAddress2())).trim());
				tEcOrderH.setOrderCustomerNm(yahoo.getBillName());
				tEcOrderH.setOrderCustomerNmKana(yahoo.getBillNameKana());
				tEcOrderH.setOrderTelNo(yahoo.getBillPhoneNumber());
				tEcOrderH.setMergeId(orderId);
				tEcOrderH.setDelivZipCd(toZipCdStringFormat(yahoo.getShipZipCode()));
				tEcOrderH.setDelivAddress1(yahoo.getShipPrefecture());
				tEcOrderH.setDelivAddress2(yahoo.getShipCity());
				tEcOrderH.setDelivAddress3((CU.nullToStr(yahoo.getShipAddress1()) + " " + CU.nullToStr(yahoo.getShipAddress2())).trim());
				tEcOrderH.setDelivCustomerNm(yahoo.getShipName());
				tEcOrderH.setDelivCustomerNmKana(yahoo.getShipNameKana());
				tEcOrderH.setDelivTelNo(yahoo.getShipPhoneNumber());
				// 送付先一致フラグ
				if (CU.equals(tEcOrderH.getOrderAddress1(), tEcOrderH.getDelivAddress1())
						&& CU.equals(tEcOrderH.getOrderAddress2(), tEcOrderH.getDelivAddress2())
						&& CU.equals(tEcOrderH.getOrderAddress3(), tEcOrderH.getDelivAddress3())
						&& CU.equals(tEcOrderH.getOrderCustomerNm(), tEcOrderH.getDelivCustomerNm())
						&& CU.equals(tEcOrderH.getOrderTelNo(), tEcOrderH.getDelivTelNo())) {
					tEcOrderH.setDelivMatchFlg_$1();
				} else {
					tEcOrderH.setDelivMatchFlg_$0();
				}
				tEcOrderH.setDelivMethod(yahoo.getShipMethod());
				tEcOrderH.setDelivCompany(machingTransformer.getTransformCdLikeMatch(matchingTypeDelivCompany, yahoo.getShipUrl()));
				tEcOrderH.setPaymentMethod(machingTransformer.getTransformCd(matchingTypePayMethod, yahoo.getPayMathod()));
				tEcOrderH.setCardType(machingTransformer.getTransformCd(matchingTypeCardType, yahoo.getCardPayType()));
				tEcOrderH.setTotal(yahoo.getTotalPrice());
				tEcOrderH.setCarriage(yahoo.getShipCharge());
				tEcOrderH.setCod(yahoo.getPayCharge());
				tEcOrderH.setTotalAmount(yahoo.getTotalPrice());
				tEcOrderH.setCouponDiscount(sumDiscount(yahoo.getShippingCDiscount(), yahoo.getItemCDiscount(), yahoo.getTotalMallCDiscount()));
				tEcOrderH.setPointDiscount(abs(yahoo.getUsePoint()));
				tEcOrderH.setAmountBilled(yahoo.getTotal());
				tEcOrderH.setPackingQty(yahoo.getPackingQty());
				tEcOrderH.setSlipItemNm1(yahoo.getSlipItemNm1());
				tEcOrderH.setSlipItemNm2(yahoo.getSlipItemNm2());
				tEcOrderH.setSlipItemNm3(yahoo.getSlipItemNm3());
				tEcOrderH.setSlipItemNm4(yahoo.getSlipItemNm4());
				tEcOrderH.setSlipItemNm5(yahoo.getSlipItemNm5());
				tEcOrderH.setSlipItemCd1(yahoo.getSlipItemCd1());
				tEcOrderH.setSlipItemCd2(yahoo.getSlipItemCd2());
				tEcOrderH.setFreightHandling1(yahoo.getFreightHandling1());
				tEcOrderH.setFreightHandling2(yahoo.getFreightHandling2());
				tEcOrderH.setArticle(yahoo.getArticle());
				tEcOrderH.setImportFlg_$0();
				tEcOrderH.setImportTypeId(ecOrderBulkInputDto.data.base.getImportTypeId());

				tEcOrderH.setReceiveId(receiveId);

				copyHValueList = new ArrayList<Object>();
				// 受注ヘッダのコピー列に設定
				for (int i = 0; i < copyHgetterList.size(); i++) {
					Method getter = copyHgetterList.get(i);
					Method setter = copyHsetterList.get(i);

					try {
						Object getValue = getter.invoke(yahoo);
						setter.invoke(tEcOrderH, getValue);

						copyHValueList.add(getValue);
					} catch (Exception e) {
						getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
						return;
					}
				}

				tEcOrderHBhv.insert(tEcOrderH);

				// EC受注帳票の追加
				TEcOrderR tEcOrderR = new TEcOrderR();
				tEcOrderR.setEcOrderHId(tEcOrderH.getEcOrderHId());
				tEcOrderR.setStatementOutFlg_$0();
				tEcOrderR.setInvoiceCreateFlg_$0();

				tEcOrderRBhv.insert(tEcOrderR);
				beforeOrderId = orderId;
			}

			// EC受注ヘッダへのコピー項目が空の場合は現在の行の値を設定する
			boolean doUpdateHeader = false;
			for (int i = 0; i < copyHgetterList.size(); i++) {

				// 現在値
				Object getCurrentValue = copyHValueList.get(i);
				if (isNullOrEmpty(getCurrentValue)) {
					// 現在値が空の場合

					try {
						// 現在行の値を取得
						Method getter = copyHgetterList.get(i);
						Object getNewValue = getter.invoke(yahoo);
						if (!isNullOrEmpty(getNewValue)) {
							// 現在行の値が設定されている場合

							// 再設定
							Method setter = copyHsetterList.get(i);
							setter.invoke(tEcOrderH, getNewValue);

							// 現在値を更新
							copyHValueList.set(i, getNewValue);
							doUpdateHeader = true;
						}
					} catch (Exception e) {
						getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
						return;
					}
				}
			}

			//  EC受注ヘッダの変更あり
			if (doUpdateHeader) {

				// 更新実行
				tEcOrderHBhv.update(tEcOrderH);
			}

			// EC受注ボディの作成
			TEcOrderB tEcOrderB = new TEcOrderB();
			tEcOrderB.setEcOrderHId(tEcOrderH.getEcOrderHId());
			tEcOrderB.setProductCd((CU.nullToStr(yahoo.getItemId()) + CU.nullToStr(yahoo.getSubCode())).trim());
			tEcOrderB.setProductNm(yahoo.getTitle());
			tEcOrderB.setProductOption(yahoo.getItemOptionValue());
			tEcOrderB.setOrderNum(yahoo.getQuantity());
			tEcOrderB.setUnitPrice(yahoo.getUnitPrice());
			tEcOrderB.setUnitTotalPrice(yahoo.getLineSubTotal());

			// 受注ボディのコピー列に設定
			for (int i = 0; i < copyBgetterList.size(); i++) {
				Method getter = copyBgetterList.get(i);
				Method setter = copyBsetterList.get(i);

				try {
					Object getValue = getter.invoke(yahoo);
					setter.invoke(tEcOrderB, getValue);
				} catch (Exception e) {
					getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
					return;
				}
			}

			tEcOrderBBhv.insert(tEcOrderB);

			// Yahoo受注を更新
			yahoo.setEcOrderBId(tEcOrderB.getEcOrderBId());
			yahoo.setImportFlg("1");

			tYahooOrderBhv.update(yahoo);
		}
	}

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.06.02 kawana End

	// [#483] 荷札の消費税が表示されない不具合を修正 2016.12.19 kawana Start

	/**
	 * <h2>出庫指示ヘッダに設定する請求金額、消費税を取得.</h2>
	 * <pre>
	 * 【名寄せ請求金額が設定されている場合】
	 *   EC受注ヘッダ.同梱IDが同じデータの請求金額、消費税を空に更新し、
	 *   名寄せ請求金額、名寄せ消費税を返却
	 *
	 * 【名寄せ請求金額が設定されていない場合】
	 *   EC受注ヘッダ.同梱IDが同じデータの名寄せ請求金額が設定されているデータを検索し、
	 *   見つかった場合は請求金額、消費税を空で返却
	 *
	 * 【上記以外】
	 *   通常の請求金額、消費税を返却 (名寄せではない方)
	 *
	 * </pre>
	 * @param ecOrderH 基となるEC受注ヘッダ
	 * @return 請求金額、消費税が設定された出荷指示ヘッダ
	 */
	private TShippingInstH getCodShippingInstH(TEcOrderH ecOrderH) {

		TShippingInstH result = new TShippingInstH();

		// 名寄せ請求金額
		long mergeAmountBilled = CU.nullToZero(ecOrderH.getMergeAmountBilled());
		// 名寄せID
		final String mergeId = ecOrderH.getMergeId();
		final long centerId = ecOrderH.getCenterId();
		final Long importTypeId = ecOrderH.getImportTypeId();

		if (CU.isNullOrEmpty(mergeId)) {
			// 名寄せIDの設定なし

			result.setCod(minusToNull(ecOrderH.getAmountBilled()));
			result.setCodTax(minusToNull(ecOrderH.getTax()));
			return result;
		}

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		List<CDef.ShippingStatus> errStatusList = new ArrayList<CDef.ShippingStatus>();
		errStatusList.add(CDef.ShippingStatus.$55);
		errStatusList.add(CDef.ShippingStatus.$90);
		errStatusList.add(CDef.ShippingStatus.$99);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End

		if (0 < mergeAmountBilled) {
			// 名寄せ請求金額の設定あり

			// 他データの請求金額の設定を空に更新
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			cb.query().setShippingStatus_NotInScope_AsShippingStatus(errStatusList);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			cb.query().existsTEcOrderHList(new SubQuery<TEcOrderHCB>() {
				@Override
				public void query(TEcOrderHCB ecOrderHCb) {
					ecOrderHCb.query().setCenterId_Equal(centerId);
					ecOrderHCb.query().setMergeId_Equal(mergeId);
					ecOrderHCb.query().setImportTypeId_Equal(importTypeId);
				}
			});

			TShippingInstH entity = new TShippingInstH();
			entity.setCod(null);
			entity.setCodTax(null);

			// 更新実行 (一括系なので排他用メソッドで更新)
			queryUpdateLogic.queryUpdateWithSelect(tShippingInstHBhv, entity, cb, queryUpdateSettingsLogic.getQuerySetter(tShippingInstHBhv));

			// 名寄せ請求金額、名寄せ消費税を設定
			result.setCod(mergeAmountBilled);
			result.setCodTax(minusToNull(ecOrderH.getMergeTax()));
			return result;

		} else {
			// 名寄せ請求金額の設定なし

			// 他データの請求金額の設定を空に更新
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			cb.query().setShippingStatus_NotInScope_AsShippingStatus(errStatusList);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			cb.query().existsTEcOrderHList(new SubQuery<TEcOrderHCB>() {
				@Override
				public void query(TEcOrderHCB ecOrderHCb) {
					ecOrderHCb.query().setCenterId_Equal(centerId);
					ecOrderHCb.query().setMergeId_Equal(mergeId);
					ecOrderHCb.query().setImportTypeId_Equal(importTypeId);
					ecOrderHCb.query().setMergeAmountBilled_GreaterThan(0L);
				}
			});

			int mergeCodCount = tShippingInstHBhv.selectCount(cb);

			if (0 < mergeCodCount) {
				// 他データで名寄せ請求金額あり

				// 既にnullだが明示的に
				result.setCod(null);
				result.setCodTax(null);
				return result;
			}
		}

		result.setCod(minusToNull(minusToNull(ecOrderH.getAmountBilled())));
		result.setCodTax(minusToNull(ecOrderH.getTax()));
		return result;
	}

	/**
	 * マイナスの場合はnullを返却
	 */
	private Long minusToNull(Long l) {
		if (l == null) {
			return l;
		}

		if (l.longValue() < 0) {
			return null;
		}

		return l;
	}

	// [#483] 荷札の消費税が表示されない不具合を修正 2016.12.19 kawana End

	/**
	 * <h2>日付を「yyyyMMdd」形式へ変換する</h2>
	 * <pre>
	 * 次の形式の日付文字列に対応
	 * yyyy/MM/dd
	 * yy/MM/dd
	 * yyyy-MM-dd
	 * yy-MM-dd
	 * yyyyMMdd
	 * yyyy/M/d
	 * yy/M/d
	 * yyyy-M-d
	 * yy-M-d
	 * </pre>
	 * @param dateString 日付文字列
	 * @return yyyyMMddに変換した文字列
	 */
	private String toDateStringFormat(String dateString) {
		if (StringUtils.isEmpty(dateString)) {
			return "";
		}
		dateString = dateString.trim();

		if (dateString.length() == 0) {
			return "";
		}

		String yyyy = null;
		String MM = null;
		String dd = null;
		if (dateString.indexOf("/") > -1) {
			String[] dateArray = dateString.split("/");
			if (dateArray.length < 3) {
				return "";
			}
			yyyy = dateArray[0];
			MM = dateArray[1];
			dd = dateArray[2];
		} else if (dateString.indexOf("-") > -1) {
			String[] dateArray = dateString.split("-");
			if (dateArray.length < 3) {
				return "";
			}
			yyyy = dateArray[0];
			MM = dateArray[1];
			dd = dateArray[2];
		} else {
			if (dateString.length() == 6) {
				yyyy = dateString.substring(0, 2);
				MM = dateString.substring(2, 4);
				dd = dateString.substring(4, 6);
			} else if (dateString.length() == 8) {
				yyyy = dateString.substring(0, 4);
				MM = dateString.substring(4, 6);
				dd = dateString.substring(6, 8);
			} else {
				return "";
			}
		}
		if (yyyy.trim().length() < 4) {
			yyyy = ("20".concat(yyyy)).substring(0, 4);
		}
		if (MM.trim().length() < 2) {
			MM = StringUtils.leftPad(MM, 2, "0");
		}
		if (dd.trim().length() < 2) {
			dd = StringUtils.leftPad(dd, 2, "0");
		}

		return yyyy + MM + dd;
	}

	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana Start

	/**
	 * <h2>郵便番号を7桁数字に変換する
	 * @param zipStrs 郵便番号文字列
	 */
	private String toZipCdStringFormat(String... zipStrs) {

		if (zipStrs == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		boolean isNull = true;
		for (String s : zipStrs) {
			if (s == null) {
				continue;
			}

			sb.append(s);
			isNull = false;
		}

		if (isNull) {
			return null;
		}

		String zipStr = sb.toString();

		String zipCd = "";
		String[] zipCds = zipStr.split("[-]");

		switch (zipCds.length) {
		case 1:
			if (StringUtils.isNumeric(zipCds[0])) {
				zipCd = StringUtils.leftPad(zipCds[0], 7, '0');
			} else {
				zipCd = zipStr;
			}
			break;
		case 2:
			if (StringUtils.isNumeric(zipCds[0]) && StringUtils.isNumeric(zipCds[1])) {
				zipCd = StringUtils.leftPad(zipCds[0], 3, '0') + StringUtils.leftPad(zipCds[1], 4, '0');
			} else {
				zipCd = zipStr;
			}
			break;
		default:
			zipCd = zipStr;
			break;
		}

		if (zipCd.equals("0000000")) {
			zipCd = null;
		}

		return zipCd;
	}

	/**
	 * 引数のobjectがnull、空かを判定する
	 * @param value
	 * @return null または 空の場合にtrueを返却
	 */
	private boolean isNullOrEmpty(Object value) {
		boolean isEmpty = false;
		if (value instanceof String) {
			if (CU.isNullOrEmpty((String) value)) {
				isEmpty = true;
			}
		} else {
			if (value == null) {
				isEmpty = true;
			}
		}

		return isEmpty;
	}

	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.14 kawana End

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start

	/**
	 * <pre>
	 * 指定した区切り文字で文字列を分割し配列にして返す。
	 * 分割した文字列は前後のスペースを取り除く。
	 * 分割した文字列が空文字の場合はリストに加えない。
	 *
	 * </pre>
	 * @param str 対象文字列
	 * @param regex 区切り文字
	 * @return 分割した文字列配列
	 */
	private String[] splitStr(String str, String regex) {

		if (str == null || regex == null) {
			return null;
		}

		String[] splitStrings = str.split(regex);
		List<String> resultList = new ArrayList<String>();
		for (String s : splitStrings) {
			s = s.trim();
			if (CU.isNullOrEmpty(s)) {
				continue;
			}

			resultList.add(s);
		}

		return (String[]) resultList.toArray(new String[resultList.size()]);
	}

	/**
	 * Long配列の合計値を返す。
	 * 全てnullの場合はnullを返す。
	 * @param values
	 * @return 合計値
	 */
	private Long sum(Long... values) {

		// 全てnullの場合はnullを返す
		boolean isAllNull = true;
		for (Long value : values) {
			if (value != null) {
				isAllNull = false;
				break;
			}
		}
		if (isAllNull) {
			return null;
		}

		return CU.sum(values);
	}

	/**
	 * Long配列の値引き合計値を返す。
	 * 全ての値の絶対値で合算し負の符号で返却する。
	 * 全てnullの場合はnullを返す。
	 * @param values
	 * @return 値引き合計値
	 */
	private Long sumDiscount(Long... values) {

		// 全てnullの場合はnullを返す
		boolean isAllNull = true;
		for (Long value : values) {
			if (value != null) {
				isAllNull = false;
				break;
			}
		}
		if (isAllNull) {
			return null;
		}

		long result = 0;
		for (Long value : values) {
			result = result + Math.abs(CU.nullToZero(value));
		}

		return result;
	}

	/**
	 * nullの場合はnull、その他は絶対値を返す
	 * @param value
	 */
	private Long abs(Long value) {
		if (value == null) {
			return null;
		}

		return Math.abs(value);
	}

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End
}
