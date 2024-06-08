package com.oneslogi.wms.resources.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.supercsv.io.CsvListReader;
import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvListReader;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;

import com.oneslogi.base.BaseConst;
import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MDataInputTypeBCB;
import com.oneslogi.base.dbflute.cbean.MDataInputTypeCB;
import com.oneslogi.base.dbflute.dto.MDataInputTypeBDto;
import com.oneslogi.base.dbflute.dto.MDataInputTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MDataInputTypeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MDataInputTypeBhv;
import com.oneslogi.base.dbflute.exentity.MDataInputType;
import com.oneslogi.base.dbflute.exentity.WCarrierZipInput;
import com.oneslogi.base.dbflute.exentity.WCustomerInput;
import com.oneslogi.base.dbflute.exentity.WLocationInput;
import com.oneslogi.base.dbflute.exentity.WProductInput;
import com.oneslogi.base.dbflute.exentity.WProductShapeInput;
import com.oneslogi.base.dbflute.exentity.WStockInput;
import com.oneslogi.base.dbflute.exentity.WZipCompanyInput;
import com.oneslogi.base.dbflute.exentity.WZipInput;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.UploadException;
import com.oneslogi.base.exception.WarnManager.WarnStatus;
import com.oneslogi.base.util.AbstractInput;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.dto.common.DataInputDto.ColumnDefs;
import com.oneslogi.wms.dto.common.DataInputDto.InputDefs;
import com.oneslogi.wms.dto.common.DataInputTypeDto;
import com.oneslogi.wms.dto.master.CarrierZipInputDto;
import com.oneslogi.wms.dto.master.CustomerInputDto;
import com.oneslogi.wms.dto.master.LocationInputDto;
import com.oneslogi.wms.dto.master.ProductInputDto;
import com.oneslogi.wms.dto.master.ProductShapeInputDto;
import com.oneslogi.wms.dto.master.ZipCompanyInputDto;
import com.oneslogi.wms.dto.master.ZipInputDto;
import com.oneslogi.wms.dto.stock.StockInputDto;
import com.oneslogi.wms.logic.common.DataInputCommonLogic;
import com.oneslogi.wms.logic.common.DataInputTypeLogic;
import com.oneslogi.wms.logic.master.CarrierZipInputLogic;
import com.oneslogi.wms.logic.master.CarrierZipInputSubLogic;
import com.oneslogi.wms.logic.master.CustomerInputLogic;
import com.oneslogi.wms.logic.master.CustomerInputSubLogic;
import com.oneslogi.wms.logic.master.LocationInputLogic;
import com.oneslogi.wms.logic.master.LocationInputSubLogic;
import com.oneslogi.wms.logic.master.ProductInputLogic;
import com.oneslogi.wms.logic.master.ProductInputSubLogic;
import com.oneslogi.wms.logic.master.ProductShapeInputLogic;
import com.oneslogi.wms.logic.master.ProductShapeInputSubLogic;
import com.oneslogi.wms.logic.master.ZipCompanyInputLogic;
import com.oneslogi.wms.logic.master.ZipCompanyInputSubLogic;
import com.oneslogi.wms.logic.master.ZipInputLogic;
import com.oneslogi.wms.logic.master.ZipInputSubLogic;
import com.oneslogi.wms.logic.stock.StockInputLogic;
import com.oneslogi.wms.logic.stock.StockInputSubLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 初期データ取込のリソースクラス。
 */
@Path("/common/dataInput")
public class DataInputResource extends AbstractWmsResource {

	// [EC-CT1-193] app.propertiesの読込みをbaseクラスに集約 2015.04.10 kawana

	private static Object syncLock = new Object();

	// ===== 定数定義 =====
	private enum FileType {
		csv, tsv
	}

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
		 * ワークテーブル検索異常
		 */
		protected static final int SELECT_WORK_FAILED = 2;
		/**
		 * ワークテーブル登録異常
		 */
		protected static final int INPUT_WORK_FAILED = 3;
		/**
		 * 移行処理異常
		 */
		protected static final int REGISTER_FAILED = 4;
		/**
		 * 取込み種別マスタ設定異常
		 */
		protected static final int IMPORT_TYPE_ERROR_SETTING = 5;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockInputLogic stockInputLogic;
	@Inject
	private ProductInputLogic productInputLogic;
	@Inject
	private CustomerInputLogic customerInputLogic;
	@Inject
	private LocationInputLogic locationInputLogic;


	/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
	@Inject
	private StockInputSubLogic stockInputSubLogic;
	@Inject
	private ProductInputSubLogic productInputSubLogic;
	@Inject
	private CustomerInputSubLogic customerInputSubLogic;
	@Inject
	private LocationInputSubLogic locationInputSubLogic;
	@Inject
	private DataInputCommonLogic commonLogic;
	/* 2015/09/24 INOUE ADD END */

	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	@Inject
	private ProductShapeInputLogic productShapeInputLogic;
	@Inject
	private ProductShapeInputSubLogic productShapeInputSubLogic;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

	//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
	@Inject
	private CarrierZipInputLogic carrierZipInputLogic;
	@Inject
	private CarrierZipInputSubLogic carrierZipInputSubLogic;
	@Inject
	private ZipInputLogic zipInputLogic;
	@Inject
	private ZipInputSubLogic zipInputSubLogic;
	@Inject
	private ZipCompanyInputLogic zipCompanyInputLogic;
	@Inject
	private ZipCompanyInputSubLogic zipCompanyInputSubLogic;
	@Inject
	private MDataInputTypeBhv mDatainputTypeBhv;
	@Inject
	private DataInputTypeLogic dataInputTypeLogic;

	private String unescapeChar(String val) {
		val = val.replace("\\t", "\t");
		val = val.replace("\\n", "\n");
		val = val.replace("\\r", "\r");
		return val;
	}
	//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return DataInputDto データ取込画面用DTO
	 */
	@GET
	@Path("/init")
	public DataInputDto init() {

		// 画面用DTO作成
		DataInputDto dataInputDto = new DataInputDto();

		return dataInputDto;
	}
	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
	@GET
	@Path("/dataInputTypeList")
	public DataInputTypeDto getKeyValueList() {

		MDataInputTypeCB cb = mDatainputTypeBhv.newMyConditionBean();
		cb.query().addOrderBy_DataInputTypeId_Asc();
		ListResultBean<MDataInputType> mDataInputTypeList = mDatainputTypeBhv.selectList(cb);

		mDatainputTypeBhv.loadMDataInputTypeBList(mDataInputTypeList, new ConditionBeanSetupper<MDataInputTypeBCB>() {
			@Override
			public void setup(MDataInputTypeBCB cbBody) {
				cbBody.setupSelect_MDataInputType();
				cbBody.query().addOrderBy_ColNo_Asc();
			}
		});

		MDataInputTypeDtoMapper mapper = new MDataInputTypeDtoMapper();
		List<MDataInputTypeDto> resultList =mapper.mappingToDtoList(mDataInputTypeList);

		DataInputTypeDto dto = new DataInputTypeDto();
		dto.data.mDataInputType = resultList;
		return dto;
	}
	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End

	/**
	 * <h2>アップロード処理。</h2>
	 * <pre>
	 * ・取込アップロードしたファイルを保存
	 * </pre>
	 * @param input
	 * @return StatusDto 状態DTO
	 * @throws Exception
	 */
	@POST
	@Path("/upload")
	//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//	public StatusDto upload(MultipartFormDataInput input, @QueryParam("inputType") String inputType) throws Exception {
	public StatusDto upload(MultipartFormDataInput input, @QueryParam("dataInputTypeCd") String dataInputTypeCd) throws Exception {
	//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
		LinkedHashMap<String, byte[]> uploads = getUploadFiles(input);
		Iterator<String> upIte = uploads.keySet().iterator();
		while (upIte.hasNext()) {
			String tmpKey = upIte.next();
			byte[] tmpByte = uploads.get(tmpKey);
			//ファイルを保存
			//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//			File subFile = new File(getUploadTempFileName(inputType));
			File subFile = new File(getUploadTempFileName(dataInputTypeCd));
			//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
			FileOutputStream ous = new FileOutputStream(subFile);
			ous.write(tmpByte);
			ous.flush();
			ous.close();
		}

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return null;
	}

	/**
	 * <h2>ワーク取込処理。</h2>
	 * <pre>
	 * ・取込アップロードしたファイルを取込ワークテーブルへ登録
	 * </pre>
	 * @param dataInputDto
	 * @return DataInputDto データ取込画面用DTO
	 * @throws Exception
	 */
	@POST
	@Path("/registerWork")
	public DataInputDto registerWork(DataInputDto dataInputDto) throws Exception {

		// [ON推-品向-845] システム設定テーブルを作成 2015.2.3 ichikawa Start
		// 初期データ取込エラー許容件数
		dataInputDto.data.cntErrorLimit = getPropertyIntValue(WmsPropertyConst.ALLOW_DATA_INPUT_ERROR_COUNT);
		// 初期データ取込コミット単位件数
		dataInputDto.data.commitUnitNum = getPropertyLongValue(WmsPropertyConst.DATA_INPUT_COMMIT_UNIT_NUM);
		//「ファイル⇒ワークテーブル」の取込種別が全削除後追記を固定
		dataInputDto.data.processType = CDef.DataInputProcessType.$1.code();
		// [ON推-品向-845] システム設定テーブルを作成 2015.2.3 ichikawa End

		//Ver２．１向けエンハンス 荷札出力対応2016.8.22 SJA Start
		MDataInputType mDataInputType = new MDataInputType();
		mDataInputType.setDataInputTypeCd(dataInputDto.data.dataInputTypeCd);
		mDataInputType = dataInputTypeLogic.getUkEntity(mDataInputType);
		char chrDelimiter = this.unescapeChar(mDataInputType.getDelimiter()).charAt(0);
		int intSkippingRows = Integer.parseInt(mDataInputType.getSkippingRows().toString()) + 1;
		String strLineFeedCd = null;
		if (mDataInputType.getLineFeedCd().equals("1")) {
			strLineFeedCd = "\r\n";
		} else if (mDataInputType.getLineFeedCd().equals("2")) {
			strLineFeedCd = "\r";
		} else if (mDataInputType.getLineFeedCd().equals("3")) {
			strLineFeedCd = "\n";
		}
		//Ver２．１向けエンハンス 荷札出力対応2016.8.22 SJA End

		/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
		// InputUploadFileを抽象クラス化した関係で生成処理は個々の取込種別毎の分岐の中に移動。
//		// ファイルオープン
//		InputUploadFile conv = new InputUploadFile();
//		conv.open(getUploadTempFileName(dataInputDto.data.inputType), "MS932", '\t', "\r\n", 2);
		/* 2015/09/24 INOUE DELETE END */

		// 在庫データ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$04.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$05.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$05.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// ファイルよりDTOに格納
			StockInputDto dto = new StockInputDto();

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			InputUploadFile<WStockInput> conv = new InputUploadFile<WStockInput>(){
				@Override
				public void afterEntityInitialilze(WStockInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					stockInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WStockInput> entityList) throws Exception {
					stockInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WStockInput> entityList) throws Exception {
					stockInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//			conv.open(getUploadTempFileName(dataInputDto.data.inputType), "MS932", '\t', "\r\n", 2);
			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			/* 2015/09/24 INOUE ADD END */

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 開始ログ
			commonLogic.startLog(WmsMessageConst.STOCK_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
			/* 2015/09/24 INOUE ADD END */

			conv.setData(dto, dataInputDto);

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 終了ログ
			commonLogic.endLog(dataInputDto);
			/* 2015/09/24 INOUE ADD END */

			// 取得件数チェック
			/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			if (dto.data.dataRows.size() == 0) {
			if (dataInputDto.data.cntAll == 0) {
			/* 2015/09/24 INOUE UPDATE END */
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}

			/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			// ワークテーブルに登録
//			WStockInputDtoMapper mapper = new WStockInputDtoMapper();
//			List<WStockInput> lstWStockInputAll = mapper.mappingToEntityList(dto.data.dataRows);
//			stockInputLogic.registerWork(dataInputDto, lstWStockInputAll, errRetSts(StatusCode.INPUT_WORK_FAILED));
			/* 2015/09/24 INOUE DELETE END */
		}

		// 商品マスタ取込の場合
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$01.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// ファイルよりDTOに格納
			ProductInputDto dto = new ProductInputDto();

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			InputUploadFile<WProductInput> conv = new InputUploadFile<WProductInput>(){
				@Override
				public void afterEntityInitialilze(WProductInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					productInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WProductInput> entityList) throws Exception {
					productInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WProductInput> entityList) throws Exception {
					productInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//			conv.open(getUploadTempFileName(dataInputDto.data.inputType), "MS932", '\t', "\r\n", 2);
			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			/* 2015/09/24 INOUE ADD END */

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 開始ログ
			commonLogic.startLog(WmsMessageConst.PRODUCT_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
			/* 2015/09/24 INOUE ADD END */

			conv.setData(dto, dataInputDto);

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 終了ログ
			commonLogic.endLog(dataInputDto);
			/* 2015/09/24 INOUE ADD END */

			// 取得件数チェック
			/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			if (dto.data.dataRows.size() == 0) {
			if (dataInputDto.data.cntAll == 0) {
			/* 2015/09/24 INOUE UPDATE END */
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}

			/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			// ワークテーブルに登録
//			WProductInputDtoMapper mapper = new WProductInputDtoMapper();
//			List<WProductInput> lstWProductInputAll = mapper.mappingToEntityList(dto.data.dataRows);
//			productInputLogic.registerWork(dataInputDto, lstWProductInputAll, errRetSts(StatusCode.INPUT_WORK_FAILED));
			/* 2015/09/24 INOUE DELETE END */
		}

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// 商品荷姿マスタ取込の場合
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$02.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$02.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			// ファイルよりDTOに格納
			ProductShapeInputDto dto = new ProductShapeInputDto();

			InputUploadFile<WProductShapeInput> conv = new InputUploadFile<WProductShapeInput>(){
				@Override
				public void afterEntityInitialilze(WProductShapeInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					productShapeInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WProductShapeInput> entityList) throws Exception {
					productShapeInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WProductShapeInput> entityList) throws Exception {
					productShapeInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//			conv.open(getUploadTempFileName(dataInputDto.data.inputType), "MS932", '\t', "\r\n", 2);
			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End

			// 開始ログ
			commonLogic.startLog(WmsMessageConst.PRODUCT_SHAPE_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);

			conv.setData(dto, dataInputDto);

			// 終了ログ
			commonLogic.endLog(dataInputDto);

			// 取得件数チェック
			if (dataInputDto.data.cntAll == 0) {
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}

		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// 取引先マスタ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$02.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$03.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$03.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// ファイルよりDTOに格納
			CustomerInputDto dto = new CustomerInputDto();

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			InputUploadFile<WCustomerInput> conv = new InputUploadFile<WCustomerInput>(){
				@Override
				public void afterEntityInitialilze(WCustomerInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					customerInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WCustomerInput> entityList) throws Exception {
					customerInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WCustomerInput> entityList) throws Exception {
					customerInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//			conv.open(getUploadTempFileName(dataInputDto.data.inputType), "MS932", '\t', "\r\n", 2);
			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			/* 2015/09/24 INOUE ADD END */

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 開始ログ
			commonLogic.startLog(WmsMessageConst.CUSTOMER_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
			/* 2015/09/24 INOUE ADD END */

			conv.setData(dto, dataInputDto);

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 終了ログ
			commonLogic.endLog(dataInputDto);
			/* 2015/09/24 INOUE ADD END */

			// 取得件数チェック
			/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			if (dto.data.dataRows.size() == 0) {
			if (dataInputDto.data.cntAll == 0) {
			/* 2015/09/24 INOUE UPDATE END */
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}

			/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			// ワークテーブルに登録
//			WCustomerInputDtoMapper mapper = new WCustomerInputDtoMapper();
//			List<WCustomerInput> lstWCustomerInputAll = mapper.mappingToEntityList(dto.data.dataRows);
//			customerInputLogic.registerWork(dataInputDto, lstWCustomerInputAll, errRetSts(StatusCode.INPUT_WORK_FAILED));
			/* 2015/09/24 INOUE DELETE END */
		}

		// ロケーションマスタ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$03.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$04.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$04.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// ファイルよりDTOに格納
			LocationInputDto dto = new LocationInputDto();

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			InputUploadFile<WLocationInput> conv = new InputUploadFile<WLocationInput>(){
				@Override
				public void afterEntityInitialilze(WLocationInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					locationInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WLocationInput> entityList) throws Exception {
					locationInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WLocationInput> entityList) throws Exception {
					locationInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//			conv.open(getUploadTempFileName(dataInputDto.data.inputType), "MS932", '\t', "\r\n", 2);
			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			/* 2015/09/24 INOUE ADD END */

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 開始ログ
			commonLogic.startLog(WmsMessageConst.LOCATION_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
			/* 2015/09/24 INOUE ADD END */

			conv.setData(dto, dataInputDto);

			/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
			// 終了ログ
			commonLogic.endLog(dataInputDto);
			/* 2015/09/24 INOUE ADD END */

			// 取得件数チェック
			/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			if (dto.data.dataRows.size() == 0) {
			if (dataInputDto.data.cntAll == 0) {
			/* 2015/09/24 INOUE UPDATE END */
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}

			/* 2015/09/24 INOUE DELETE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//			// ワークテーブルに登録
//			WLocationInputDtoMapper mapper = new WLocationInputDtoMapper();
//			List<WLocationInput> lstWLocationInputAll = mapper.mappingToEntityList(dto.data.dataRows);
//			locationInputLogic.registerWork(dataInputDto, lstWLocationInputAll, errRetSts(StatusCode.INPUT_WORK_FAILED));
			/* 2015/09/24 INOUE DELETE END */
		}

		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
		// ヤマト着店マスタ取込、日本郵政着店マスタ取込の場合
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$06.code()) ||
				CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$07.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			// ファイルよりDTOに格納
			CarrierZipInputDto dto = new CarrierZipInputDto();

			InputUploadFile<WCarrierZipInput> conv = new InputUploadFile<WCarrierZipInput>(){
				@Override
				public void afterEntityInitialilze(WCarrierZipInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
					// 処理済フラグの設定
					if (CU.isNullOrEmpty(entity.getWorkFlg())) {
						entity.setWorkFlg(CDef.WorkFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					carrierZipInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WCarrierZipInput> entityList) throws Exception {
					carrierZipInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WCarrierZipInput> entityList) throws Exception {
					carrierZipInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);

			// 開始ログ
			if(dataInputDto.data.dataInputTypeCd.equals("06") ){
				commonLogic.startLog(WmsMessageConst.YMT_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
			}else if (dataInputDto.data.dataInputTypeCd.equals("07")){
				commonLogic.startLog(WmsMessageConst.JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);
			}
			conv.setData(dto, dataInputDto);

			// 終了ログ
			commonLogic.endLog(dataInputDto);

			// 取得件数チェック
			if (dataInputDto.data.cntAll == 0) {
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}
		}
		// 郵便番号マスタ取込の場合
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$08.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			// ファイルよりDTOに格納
			ZipInputDto dto = new ZipInputDto();

			InputUploadFile<WZipInput> conv = new InputUploadFile<WZipInput>(){
				@Override
				public void afterEntityInitialilze(WZipInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
					// 処理済フラグの設定
					if (CU.isNullOrEmpty(entity.getWorkFlg())) {
						entity.setWorkFlg(CDef.WorkFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					zipInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WZipInput> entityList) throws Exception {
					zipInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WZipInput> entityList) throws Exception {
					zipInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);

			// 開始ログ
			commonLogic.startLog(WmsMessageConst.ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);

			conv.setData(dto, dataInputDto);

			// 終了ログ
			commonLogic.endLog(dataInputDto);

			// 取得件数チェック
			if (dataInputDto.data.cntAll == 0) {
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}
		}
		//郵便番号マスタ(大口事業所)取込の場合
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$09.code())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			// ファイルよりDTOに格納
			ZipCompanyInputDto dto = new ZipCompanyInputDto();

			InputUploadFile<WZipCompanyInput> conv = new InputUploadFile<WZipCompanyInput>(){
				@Override
				public void afterEntityInitialilze(WZipCompanyInput entity, long lineNo) {
					// 行Noの設定
					entity.setLineNo(lineNo);
					// エラーフラグの設定
					if (CU.isNullOrEmpty(entity.getErrorFlg())) {
						entity.setErrorFlg(CDef.ErrorFlg.$0.code());
					}
					// 処理済フラグの設定
					if (CU.isNullOrEmpty(entity.getWorkFlg())) {
						entity.setWorkFlg(CDef.WorkFlg.$0.code());
					}
				}

				@Override
				public void deleteWorkWithCommit() {
					zipCompanyInputSubLogic.deleteWorkWithCommit(errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWorkWithCommit(DataInputDto dataInputDto, List<WZipCompanyInput> entityList) throws Exception {
					zipCompanyInputSubLogic.registerWorkWithCommit(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}

				@Override
				public void registerWork(DataInputDto dataInputDto, List<WZipCompanyInput> entityList) throws Exception {
					zipCompanyInputSubLogic.registerWork(dataInputDto, entityList, errRetSts(StatusCode.INPUT_WORK_FAILED));
				}
			};

			conv.open(getUploadTempFileName(dataInputDto.data.dataInputTypeCd), mDataInputType.getCharacterCd(), chrDelimiter, strLineFeedCd, intSkippingRows);

			// 開始ログ
			commonLogic.startLog(WmsMessageConst.ZIP_COMPANY_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION);

			conv.setData(dto, dataInputDto);

			// 終了ログ
			commonLogic.endLog(dataInputDto);

			// 取得件数チェック
			if (dataInputDto.data.cntAll == 0) {
				getErrorManager().add(errRetSts(StatusCode.INPUT_WORK_FAILED), WmsMessageConst.NO_DETAILS_ERROR);
				return null;
			}
		}

		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End

		if (getErrorManager().size() > 0) {
			return null;
		}

		// 処理終了メッセージ
		setCompleteMessage(dataInputDto, warnRetSts(StatusCode.INPUT_WORK_FAILED));

		return null;
	}

	/**
	 * <h2>データ移行処理。</h2>
	 * <pre>
	 * ・取込ワークテーブルから業務テーブルに登録
	 * </pre>
	 * @param dataInputDto
	 * @return DataInputDto データ取込画面用DTO
	 * @throws Exception
	 */
	@POST
	@Path("/register")
	public DataInputDto register(DataInputDto dataInputDto) throws Exception {

		// [ON推-品向-845] システム設定テーブルを作成 2015.2.3 ichikawa Start
		// 初期データ取込エラー許容件数
		dataInputDto.data.cntErrorLimit = getPropertyIntValue(WmsPropertyConst.ALLOW_DATA_INPUT_ERROR_COUNT);
		// 初期データ取込コミット単位件数
		dataInputDto.data.commitUnitNum = getPropertyLongValue(WmsPropertyConst.DATA_INPUT_COMMIT_UNIT_NUM);
		//「ワークテーブル⇒移行先テーブル」の初期対象が未設定（未処理かつエラーなし）
		dataInputDto.data.dataRange = null;
		// [ON推-品向-845] システム設定テーブルを作成 2015.2.3 ichikawa End

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		// 在庫データ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$04.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$05.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$05.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// 移行先テーブルに登録
			stockInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}

		// 商品マスタ取込の場合
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$01.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$01.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// 移行先テーブルに登録
			productInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// 商品荷姿マスタ取込の場合
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$02.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$02.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// 移行先テーブルに登録
			productShapeInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// 取引先マスタ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$02.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$03.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$03.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// 移行先テーブルに登録
			customerInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}

		// ロケーションマスタ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$03.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$04.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$04.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// 移行先テーブルに登録
			locationInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}

		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
		//ヤマト着店マスタ取込の場合
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$06.code())) {
			// 移行先テーブルに登録
			carrierZipInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}
		//日本郵政着店マスタ取込の場合
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$07.code())) {
			// 移行先テーブルに登録
			carrierZipInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}
		//郵便番号マスタ取込の場合
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$08.code())) {
			// 移行先テーブルに登録
			zipInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}
		//郵便番号マスタ(大口事業所)取込の場合
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$09.code())) {
			// 移行先テーブルに登録
			zipCompanyInputLogic.register(dataInputDto, errRetSts(StatusCode.REGISTER_FAILED));
		}
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End

		if (getErrorManager().size() > 0) {
			return null;
		}

		// 処理終了メッセージ
		setCompleteMessage(dataInputDto, warnRetSts(StatusCode.REGISTER_FAILED));

		return null;
	}

	/**
	 * <h2>取込ワークダウンロード処理。</h2>
	 * <pre>
	 * ・取込ワークテーブルの内容をタブ区切りファイルでダウンロード
	 * </pre>
	 * @param dataInputDto
	 * @return DataInputDto データ取込画面用DTO
	 * @throws Exception
	 */
	@POST
	@Path("/download")
	public DataInputDto download(DataInputDto dataInputDto) throws Exception {
		// 在庫データ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$04.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$05.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$05.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// ワークテーブルのデータの取得
			List<WStockInput> lstWStockInputAll = stockInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
//			ArrayList<LinkedHashMap<String, String>> exportData = getStockExportData(lstWStockInputAll);
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWStockInputAll,dataInputDto.data.dataInputTypeCd);
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WStockInput");
		}

		// 商品マスタ取込の場合
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$01.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$01.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// ワークテーブルのデータの取得
			List<WProductInput> lstWProductInputAll = productInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
//			ArrayList<LinkedHashMap<String, String>> exportData = getProductExportData(lstWProductInputAll);
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWProductInputAll,dataInputDto.data.dataInputTypeCd);
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WProductInput");
		}

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// 商品荷姿マスタ取込の場合
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$02.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$02.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// ワークテーブルのデータの取得
			List<WProductShapeInput> lstWProductShapeInputAll = productShapeInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
//			ArrayList<LinkedHashMap<String, String>> exportData = getProductShapeExportData(lstWProductShapeInputAll);
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWProductShapeInputAll,dataInputDto.data.dataInputTypeCd);
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WProductShapeInput");
		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// 取引先マスタ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$02.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$03.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$03.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// ワークテーブルのデータの取得
			List<WCustomerInput> lstWCustomerInputAll = customerInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
//			ArrayList<LinkedHashMap<String, String>> exportData = getCustomerExportData(lstWCustomerInputAll);
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWCustomerInputAll,dataInputDto.data.dataInputTypeCd);
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WCustomerInput");
		}

		// ロケーションマスタ取込の場合
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$03.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		if (CU.equals(dataInputDto.data.inputType, CDef.CenterDataInputType.$04.code())) {
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$04.code())) {
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
			// ワークテーブルのデータの取得
			List<WLocationInput> lstWLocationInputAll = locationInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
//			ArrayList<LinkedHashMap<String, String>> exportData = getLocationExportData(lstWLocationInputAll);
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWLocationInputAll,dataInputDto.data.dataInputTypeCd);
			//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WLocationInput");
		}

		//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$06.code())) {
			// ワークテーブルのデータの取得
			List<WCarrierZipInput> lstWCarrierZipInputAll = carrierZipInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));
			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWCarrierZipInputAll, dataInputDto.data.dataInputTypeCd);
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WCarrierZipInput");
		}
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$07.code())) {
			// ワークテーブルのデータの取得
			List<WCarrierZipInput> lstWCarrierZipInputAll = carrierZipInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWCarrierZipInputAll,dataInputDto.data.dataInputTypeCd);
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WCarrierZipInput");
		}
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$08.code())) {
			// ワークテーブルのデータの取得
			List<WZipInput> lstWZipInputAll = zipInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWZipInputAll,dataInputDto.data.dataInputTypeCd);
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WZipInput");
		}
		if (CU.equals(dataInputDto.data.dataInputTypeCd, CDef.DataInputType.$09.code())) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			// ワークテーブルのデータの取得
			List<WZipCompanyInput> lstWZipCompanyInputAll = zipCompanyInputLogic.selectWork(dataInputDto, errRetSts(StatusCode.SELECT_WORK_FAILED));

			if (getErrorManager().size() > 0) {
				return null;
			}

			// ダウンロードファイルの編集
			ArrayList<LinkedHashMap<String, String>> exportData = getExportData(lstWZipCompanyInputAll,dataInputDto.data.dataInputTypeCd);
			// ダウンロードファイルの作成
			writeDownloadFile(dataInputDto, exportData, "WZipCompanyInput");
		}
		//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End

		if (getErrorManager().size() > 0) {
			return null;
		}

		// 処理終了メッセージ
		setCompleteMessage(dataInputDto, warnRetSts(StatusCode.SELECT_WORK_FAILED));

		return dataInputDto;
	}

	// 処理終了メッセージ
	private void setCompleteMessage(DataInputDto dataInputDto, WarnStatus warnSts) {
		if (dataInputDto.hasError()) {
			getWarnManager().add(warnSts, WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		} else {
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		}
	}

	// 一時ファイル名を取得
	private String getUploadTempFileName(String inputType) {
		String fileName = "\\tmpDataInput{0}.tsv".replace("{0}", inputType);
		return System.getProperty("java.io.tmpdir") + fileName;
	}

	/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
	/**
	 * ワーク取込の共通処理
	 * 抽象クラスになっているので、取込種別ごとに継承して必須メソッドを実装する。
	 * open⇒setDataでワーク取込実行。
	 * @author at.inoue.hx
	 *
	 * @param <E> entityを指定
	 */
//	private class InputUploadFile extends AbstractInput {
	private abstract class InputUploadFile<E> extends AbstractInput {
	/* 2015/09/24 INOUE ADD END */

		private FileType fileType = null;
		private String fileName = null;
		private String encoding = null;
		private char delimiterChar;
		private String lineCode = null;

		private InputStream is;
		private Reader isr;
		private Reader br;
		private ICsvListReader cr;

		private int uploadRows;
		private int readStartLine;

		public void open(String file, String encoding, char delimiterChar, String lineCode, int readStartLine) throws Exception {

			this.fileType = null;
			this.fileName = null;
			this.encoding = encoding;
			this.delimiterChar = delimiterChar;
			this.lineCode = lineCode;
			this.readStartLine = readStartLine;
			this.uploadRows = 0;

			String ext = FilenameUtils.getExtension(file);

			for (FileType type : FileType.values()) {
				if (CU.equals(type.name(), ext)) {
					fileType = type;
					fileName = file;
					break;
				}
			}

			if (fileName == null) {
				throw new RuntimeException("ext error.");
			}

		}

		public void openFile(String file, String encoding, char delimiterChar, String lineCode, int readStartLine) throws Exception {
			try {
				CsvPreference.Builder csvPref = new CsvPreference.Builder('"', delimiterChar, lineCode);

				is = new FileInputStream(file);
				isr = new InputStreamReader(is, encoding);
				br = new BufferedReader(isr);
				cr = new CsvListReader(br, csvPref.build());

				this.uploadRows = 0;
				this.readStartLine = readStartLine;
			} catch (Exception e) {
				throw new UploadException(e, BaseMessageConst.FILE_UPLOAD_OPEN_ERROR);
			}
		}

		public void setData(BaseDto dto, DataInputDto dataInputDto) throws Exception {
			setData(dto, dataInputDto, null);
		}

		public void setData(BaseDto dto, DataInputDto dataInputDto, Class<?> clazz) throws Exception {

			if (fileName == null) {
				throw new RuntimeException("ext error.");
			}

			if (fileType == FileType.csv) {
				inputCsvData(dto, dataInputDto, clazz);
			} else if (fileType == FileType.tsv) {
				inputCsvData(dto, dataInputDto, clazz);
			}
		}

		private void inputCsvData(BaseDto dto, DataInputDto dataInputDto, Class<?> clazz) throws Exception {
			synchronized (syncLock) {
				openFile(fileName, encoding, delimiterChar, lineCode, readStartLine);

				dataInputDto.initProcess(0);
				setCsvData(dto, dataInputDto, clazz);
				dataInputDto.data.cntAll = getUploadRows();

				closeFile();

				try {
					Files.deleteIfExists(Paths.get(fileName));
				} catch (IOException e) {
					// 何もしない
				}
			}
		}

		public void setCsvData(BaseDto baseDto, DataInputDto dataInputDto, Class<?> clazz) throws Exception {

			List<ColumnDefs> columnDefs;
			Object inputData;

			Object rootData;
			Field rowField;

			try {
				InputDefs inputDefs = dataInputDto.data.inputDefs;

				// 有効な列情報を退避
				columnDefs = new ArrayList<ColumnDefs>(inputDefs.columnDefs.size());
				for (ColumnDefs c : inputDefs.columnDefs) {
					if (!CU.isNullOrEmpty(c.field) && c.inColIndex > 0) {
						columnDefs.add(c);
					}
				}

				if (columnDefs.size() == 0) {
					throw new UploadException(BaseMessageConst.FILE_UPLOAD_DEFINE_ERROR);
				}

				// メインデータを取得
				Field inputField = baseDto.getClass().getField(ROOT_DATA_NAME);
				inputData = inputField.get(baseDto);

				rootData = inputData;
				try {
					rowField = rootData.getClass().getField(ROW_BLANK_DATA_NAME);
				} catch (NoSuchFieldException ex) {
					if (clazz == null) {
						throw ex;
					}
					rowField = null;
				}
				// メインデータより対象となるグリッド用データを取得
				inputField = inputData.getClass().getField(inputDefs.inputField);
				inputData = inputField.get(inputData);

			} catch (Exception e) {
				throw new UploadException(e, BaseMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			}

			try {
				/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
				// 全削除後追記の場合、事前に削除
				if (dataInputDto.isRewrite()) {
					// ロケーションマスタ取込ワークテーブルの削除
					deleteWorkWithCommit();
				}
				/* 2015/09/24 INOUE ADD END */

				List<String> row;
				Object value;

				/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
				int lineNo = 0;
				/* 2015/09/24 INOUE ADD END */

				// Excel行でループ
				for (int j = 0; (row = cr.read()) != null; j++) {

					if (j < (readStartLine - 1)) {
						continue;
					}

					uploadRows++;
					if (dataInputDto.isOverErrorLimit()) {
						continue;
					}

					short lastCol = (short) row.size();

					Object inputRow;
					if (rowField == null) {
						inputRow = clazz.newInstance();
					} else {
						inputRow = rowField.get(rootData.getClass().newInstance());
					}

					boolean hasError = false;
					// グリッド列定義でループ
					for (ColumnDefs columnDef : columnDefs) {

						// マスタ定義がExcel側の最終列を上回る場合は無視
						if (columnDef.inColIndex > lastCol) {
							continue;
						}

						try {
							// マスタ定義に従いマッピングする列を特定
							value = row.get(columnDef.inColIndex - 1);

							setValue(inputRow, columnDef.field.split(FIELD_REGEX_SEP_VALUE), value);

						} catch (Exception e) {
							if (e instanceof UploadException) {
								throw e;
							}
							if (rowField == null) {
								inputRow = clazz.newInstance();
							} else {
								inputRow = rowField.get(rootData.getClass().newInstance());
							}
							String idxRow = String.valueOf((j + 1) - (readStartLine - 1));
							String idxCol = String.valueOf(columnDef.inColIndex);

							/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
//							stockInputLogic.setErrorMessage(inputRow, BaseMessageConst.FILE_UPLOAD_SET_ERROR, new String[] { "", idxRow, idxCol });
							// 実行される処理は基底クラスのものなのでstockInputLogicのままでも問題ないのだが、新たにcommonLogicを定義したのでそちらを使う。
							commonLogic.setErrorMessage(inputRow, BaseMessageConst.FILE_UPLOAD_SET_ERROR, new String[] { "", idxRow, idxCol });
							/* 2015/09/24 INOUE UPDATE END */

							dataInputDto.addError();
							hasError = true;
							break;
						}

					}
					if (!hasError) {
						dataInputDto.addSuccess();
					}

					/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
					afterEntityInitialilze(CU.<E>castObject(inputRow), (long)++lineNo);
					/* 2015/09/24 INOUE ADD END */

					CU.castList(inputData).add(inputRow);

					/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
					// コミット件数に達していればコミットする
					if (dataInputDto.isOverCommitUnitNum(CU.castList(inputData).size())) {
						// 登録実行
						doRegisterWork(dataInputDto, inputData);

						// リストをクリアする。
						CU.castList(inputData).clear();
					}
					/* 2015/09/24 INOUE ADD END */
				}

				/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
				// 残り分の登録を実行
				doRegisterWork(dataInputDto, inputData);
				/* 2015/09/24 INOUE ADD END */
			} catch (Exception e) {
				if (e instanceof UploadException) {
					throw e;
				}
				throw new UploadException(e, BaseMessageConst.FILE_UPLOAD_SET_ERROR, "");
			}

			return;
		}

		/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
		private void doRegisterWork(DataInputDto dataInputDto, Object inputData) throws Exception {
			// 随時コミットか？
			if (dataInputDto.isCommitBlock()) {
				// リストが空ではない場合、コミットありの登録メソッドを実行する。
				if (CU.castList(inputData).size() > 0) {
					registerWorkWithCommit(dataInputDto, CU.<E>castList(inputData));
				}
			}

			// 一括コミットか？
			if (dataInputDto.isCommitAll()) {
				// リストが空ではない場合、コミットなしの登録メソッドを実行する。
				if (CU.castList(inputData).size() > 0) {
					registerWork(dataInputDto, CU.<E>castList(inputData));
				}
			}
		}
		/* 2015/09/24 INOUE ADD END */

		public void closeFile() throws Exception {
			if (cr != null) {
				try {
					cr.close();
				} catch (IOException e) {
					// 何もしない
				}
				cr = null;
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// 何もしない
				}
				br = null;
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					// 何もしない
				}
				isr = null;
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// 何もしない
				}
				is = null;
			}
			uploadRows = 0;
		}

		public int getUploadRows() {
			return uploadRows;
		}

		/* 2015/09/24 INOUE ADD START [ON推-品向-906]初期データ取込メモリリーク対応 */
		/**
		 * ワークテーブルの事前削除処理
		 */
		public abstract void deleteWorkWithCommit();
		/**
		 * csvのentityへのマッピング完了後
		 * @param entity
		 * @param lineNo
		 */
		public abstract void afterEntityInitialilze(E entity, long lineNo);
		/**
		 * ワークテーブルへの登録処理（コミットあり）
		 * @param dataInputDto
		 * @param entityList
		 */
		public abstract void registerWorkWithCommit(DataInputDto dataInputDto, List<E> entityList) throws Exception;
		/**
		 * ワークテーブルへの登録処理（コミットなし）
		 * @param dataInputDto
		 * @param entityList
		 */
		public abstract void registerWork(DataInputDto dataInputDto, List<E> entityList) throws Exception;
		/* 2015/09/24 INOUE ADD END */
	}

	// タブ区切りダウンロードファイルを作成
	private void writeDownloadFile(DataInputDto dataInputDto, ArrayList<LinkedHashMap<String, String>> exportData, String fileName) throws IOException {

		//プロパティファイルの内容取得
		ServletContext context = getServletContext();

		String extName = ".tsv";
		String downloadTempFileNm = null;

		File tempDir = FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(context.getContextPath()));

		File tempFile = null;

		while (downloadTempFileNm == null) {
			downloadTempFileNm = UUID.randomUUID().toString();
			tempFile = new File(tempDir, downloadTempFileNm + extName);
			if (tempFile.exists()) {
				downloadTempFileNm = null;
			}
		}

		ICsvListWriter listWriter = null;
		try {

			// 出力ファイルを作成
			String tempFileNm = tempFile.getPath();
			FileOutputStream fos = new FileOutputStream(tempFileNm, false);

			// BOM付与
			fos.write(0xef);
			fos.write(0xbb);
			fos.write(0xbf);
			fos.flush();

			OutputStreamWriter fileWriter = new OutputStreamWriter(fos, StandardCharsets.UTF_8.name());
			listWriter = new CsvListWriter(fileWriter, CsvPreference.TAB_PREFERENCE);

			for (LinkedHashMap<String, String> rowMap : exportData) {

				List<Object> csvData = new ArrayList<Object>();

				for (Map.Entry<String, String> entry : rowMap.entrySet()) {

					String value = entry.getValue();
					if (value == null) {
						csvData.add("");
					} else {
						csvData.add(value);
					}
				}
				listWriter.write(csvData);
			}

			// [ON推-品向-792] 例外のcatchを削除 2015.04.22 kawana
		} finally {
			if (listWriter != null) {
				try {
					listWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		String mimeType = "text/comma-separated-values";
		String downloadFileNm = fileName;

		dataInputDto.data.downloadUrl = context.getContextPath() + BaseConst.APP_RESOURCE_PATH + BaseConst.DOWNLOAD_RESOURCE_PATH + "/"
				+ URLEncoder.encode(downloadFileNm, StandardCharsets.UTF_8.name()) + extName
				+ "?" + BaseConst.DOWNLOAD_FILE_NAME + "=" + downloadTempFileNm + extName
				+ "&" + BaseConst.DOWNLOAD_MIME_TYPE + "=" + URLEncoder.encode(mimeType, StandardCharsets.UTF_8.name());

		// [ON推-品向-792] 例外のcatchを削除 2015.04.22 kawana
	}

	//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA Start
	// 在庫取込ワークのタブ区切りダウンロードファイルのヘッダ編集
//	private LinkedHashMap<String, String> getStockExportHead() throws UnsupportedEncodingException {
//		LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//		row.put("1", "在庫取込ワークID");
//		row.put("2", "荷主CD");
//		row.put("3", "センタCD");
//		row.put("4", "倉庫CD");
//		row.put("5", "商品CD");
//		row.put("6", "在庫区分CD");
//		row.put("7", "ロケーションCD");
//		row.put("8", "預託CD");
//		row.put("9", "処理区分CD");
//		row.put("10", "ロットCD");
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//		row.put("11", "荷姿CD");
//		row.put("12", "入庫ラベルNo.");
//		row.put("13", "仕入先CD");
//		row.put("14", "期限日");
//		row.put("15", "入数");
//		row.put("16", "指示数");
//		row.put("17", "備考");
//		row.put("18", "行NO.");
//		row.put("19", "処理済フラグ");
//		row.put("20", "エラーフラグ");
//		row.put("21", "エラー内容");
//		row.put("22", "削除フラグ");
//		row.put("23", "バージョンNo.");
//		row.put("24", "コントロールNo.");
//		row.put("25", "登録日時");
//		row.put("26", "登録ユーザ");
//		row.put("27", "登録プロセス");
//		row.put("28", "更新日時");
//		row.put("29", "更新ユーザ");
//		row.put("30", "更新プロセス");

//		row.put("11", "入庫ラベルNo.");
//		row.put("12", "仕入先CD");
//		row.put("13", "期限日");
//		row.put("14", "指示数");
//		row.put("15", "備考");
//		row.put("16", "行NO.");
//		row.put("17", "処理済フラグ");
//		row.put("18", "エラーフラグ");
//		row.put("19", "エラー内容");
//		row.put("20", "削除フラグ");
//		row.put("21", "バージョンNo.");
//		row.put("22", "コントロールNo.");
//		row.put("23", "登録日時");
//		row.put("24", "登録ユーザ");
//		row.put("25", "登録プロセス");
//		row.put("26", "更新日時");
//		row.put("27", "更新ユーザ");
//		row.put("28", "更新プロセス");
//		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
//		return row;
//	}

	// 在庫取込ワークのタブ区切りダウンロードファイルのデータ編集
//	private ArrayList<LinkedHashMap<String, String>> getStockExportData(List<WStockInput> lstWStockInput) throws UnsupportedEncodingException {
//
//		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
//
//		LinkedHashMap<String, String> head = getStockExportHead();
//		exportData.add(head);
//
//		for (WStockInput wStockInput : lstWStockInput) {
//			LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//
//			row.put("1", wStockInput.getStockInputId().toString());
//			row.put("2", wStockInput.getClientCd());
//			row.put("3", wStockInput.getCenterCd());
//			row.put("4", wStockInput.getWarehouseCd());
//			row.put("5", wStockInput.getProductCd());
//			row.put("6", wStockInput.getStockTypeCd());
//			row.put("7", wStockInput.getLocationCd());
//			row.put("8", wStockInput.getDepositCd());
//			row.put("9", wStockInput.getProcessTypeCd());
//			row.put("10", wStockInput.getLotCd());
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//			row.put("11", wStockInput.getShapeCd());
//			row.put("12", wStockInput.getStoreLabelNo());
//			row.put("13", wStockInput.getSupplierCd());
//			row.put("14", wStockInput.getLimitDt());
//			row.put("15", CU.nullToZero(wStockInput.getUnitNum()).toString());
//			row.put("16", CU.nullToZero(wStockInput.getInstNum()).toString());
//			row.put("17", wStockInput.getStockInputComment());
//			row.put("18", CU.nullToZero(wStockInput.getLineNo()).toString());
//			row.put("19", wStockInput.getWorkFlg());
//			row.put("20", wStockInput.getErrorFlg());
//			row.put("21", wStockInput.getErrorMsg());
//			row.put("22", wStockInput.getDelFlg());
//			row.put("23", CU.nullToZero(wStockInput.getVersionNo()).toString());
//			row.put("24", CU.nullToZero(wStockInput.getControlNo()).toString());
//			row.put("25", wStockInput.getAddDt().toString());
//			row.put("26", wStockInput.getAddUser());
//			row.put("27", wStockInput.getAddProcess());
//			row.put("28", wStockInput.getUpdDt().toString());
//			row.put("29", wStockInput.getUpdUser());
//			row.put("30", wStockInput.getUpdProcess());

//			row.put("11", wStockInput.getStoreLabelNo());
//			row.put("12", wStockInput.getSupplierCd());
//			row.put("13", wStockInput.getLimitDt());
//			row.put("14", CU.nullToZero(wStockInput.getInstNum()).toString());
//			row.put("15", wStockInput.getStockInputComment());
//			row.put("16", CU.nullToZero(wStockInput.getLineNo()).toString());
//			row.put("17", wStockInput.getWorkFlg());
//			row.put("18", wStockInput.getErrorFlg());
//			row.put("19", wStockInput.getErrorMsg());
//			row.put("20", wStockInput.getDelFlg());
//			row.put("21", CU.nullToZero(wStockInput.getVersionNo()).toString());
//			row.put("22", CU.nullToZero(wStockInput.getControlNo()).toString());
//			row.put("23", wStockInput.getAddDt().toString());
//			row.put("24", wStockInput.getAddUser());
//			row.put("25", wStockInput.getAddProcess());
//			row.put("26", wStockInput.getUpdDt().toString());
//			row.put("27", wStockInput.getUpdUser());
//			row.put("28", wStockInput.getUpdProcess());
//			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
//
//			exportData.add(row);
//		}
//		return exportData;
//	}

	// 商品マスタ取込ワークのタブ区切りダウンロードファイルのヘッダ編集
//	private LinkedHashMap<String, String> getProductExportHead() throws UnsupportedEncodingException {
//		LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//		row.put("1", "商品マスタ取込ワークID");
//		row.put("2", "荷主CD");
//		row.put("3", "商品CD");
//		row.put("4", "商品名称");
//		row.put("5", "商品略称");
//		row.put("6", "JANCD");
//		row.put("7", "ロット管理フラグ");
//		row.put("8", "期限日管理フラグ");
//		row.put("9", "入荷期限日数");
//		row.put("10", "出荷期限日数");
//		row.put("11", "入庫No.マージ区分");
//		row.put("12", "ロット逆転防止フラグ");
//		row.put("13", "期限日逆転防止フラグ");
//		row.put("14", "出荷停止フラグ");
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//		row.put("15", "荷姿CD");
//		row.put("16", "入数");
//		row.put("17", "縦(mm)");
//		row.put("18", "横(mm)");
//		row.put("19", "高さ(mm)");
//		row.put("20", "容積(mm3)");
//		row.put("21", "商品重量(g)");
//		row.put("22", "総重量(g)");
//		row.put("23", "行NO.");
//		row.put("24", "処理済フラグ");
//		row.put("25", "エラーフラグ");
//		row.put("26", "エラー内容");
//		row.put("27", "削除フラグ");
//		row.put("28", "バージョンNo.");
//		row.put("29", "コントロールNo.");
//		row.put("30", "登録日時");
//		row.put("31", "登録ユーザ");
//		row.put("32", "登録プロセス");
//		row.put("33", "更新日時");
//		row.put("34", "更新ユーザ");
//		row.put("35", "更新プロセス");

//		row.put("15", "ピース縦(mm)");
//		row.put("16", "ピース横(mm)");
//		row.put("17", "ピース高さ(mm)");
//		row.put("18", "ピース容積(mm3)");
//		row.put("19", "ピース商品重量(g)");
//		row.put("20", "ピース総重量(g)");
//		row.put("21", "行NO.");
//		row.put("22", "処理済フラグ");
//		row.put("23", "エラーフラグ");
//		row.put("24", "エラー内容");
//		row.put("25", "削除フラグ");
//		row.put("26", "バージョンNo.");
//		row.put("27", "コントロールNo.");
//		row.put("28", "登録日時");
//		row.put("29", "登録ユーザ");
//		row.put("30", "登録プロセス");
//		row.put("31", "更新日時");
//		row.put("32", "更新ユーザ");
//		row.put("33", "更新プロセス");
//		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
//		return row;
//	}

	// 商品マスタ取込ワークのタブ区切りダウンロードファイルのデータ編集
//	private ArrayList<LinkedHashMap<String, String>> getProductExportData(List<WProductInput> lstWProductInput) throws UnsupportedEncodingException {
//
//		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
//
//		LinkedHashMap<String, String> head = getProductExportHead();
//		exportData.add(head);
//
//		for (WProductInput wProductInput : lstWProductInput) {
//			LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//
//			row.put("1", wProductInput.getProductInputId().toString());
//			row.put("2", wProductInput.getClientCd());
//			row.put("3", wProductInput.getProductCd());
//			row.put("4", wProductInput.getProductNm());
//			row.put("5", wProductInput.getProductAbbr());
//			row.put("6", wProductInput.getJanCd());
//			row.put("7", wProductInput.getLotManagFlg());
//			row.put("8", wProductInput.getLimitDtManagFlg());
//			row.put("9", CU.nullToZero(wProductInput.getReceiveLimitNum()).toString());
//			row.put("10", CU.nullToZero(wProductInput.getShippingLimitNum()).toString());
//			row.put("11", wProductInput.getMergeCls());
//			row.put("12", wProductInput.getLotReverseFlg());
//			row.put("13", wProductInput.getLimitDtReverseFlg());
//			row.put("14", wProductInput.getShippingStopFlg());
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//			row.put("15", wProductInput.getShapeCd());
//			row.put("16", CU.nullToZero(wProductInput.getUnitNum()).toString());
//			row.put("17", CU.nullToZero(wProductInput.getLength()).toString());
//			row.put("18", CU.nullToZero(wProductInput.getWidth()).toString());
//			row.put("19", CU.nullToZero(wProductInput.getHeight()).toString());
//			row.put("20", CU.nullToZero(wProductInput.getVolume()).toString());
//			row.put("21", CU.nullToZero(wProductInput.getNetWeight()).toString());
//			row.put("22", CU.nullToZero(wProductInput.getGrossWeight()).toString());
//			row.put("23", CU.nullToZero(wProductInput.getLineNo()).toString());
//			row.put("24", wProductInput.getWorkFlg());
//			row.put("25", wProductInput.getErrorFlg());
//			row.put("26", wProductInput.getErrorMsg());
//			row.put("27", wProductInput.getDelFlg());
//			row.put("28", CU.nullToZero(wProductInput.getVersionNo()).toString());
//			row.put("29", CU.nullToZero(wProductInput.getControlNo()).toString());
//			row.put("30", wProductInput.getAddDt().toString());
//			row.put("31", wProductInput.getAddUser());
//			row.put("32", wProductInput.getAddProcess());
//			row.put("33", wProductInput.getUpdDt().toString());
//			row.put("34", wProductInput.getUpdUser());
//			row.put("35", wProductInput.getUpdProcess());

//			row.put("15", CU.nullToZero(wProductInput.getLength()).toString());
//			row.put("16", CU.nullToZero(wProductInput.getWidth()).toString());
//			row.put("17", CU.nullToZero(wProductInput.getHeight()).toString());
//			row.put("18", CU.nullToZero(wProductInput.getVolume()).toString());
//			row.put("19", CU.nullToZero(wProductInput.getNetWeight()).toString());
//			row.put("20", CU.nullToZero(wProductInput.getGrossWeight()).toString());
//			row.put("21", CU.nullToZero(wProductInput.getLineNo()).toString());
//			row.put("22", wProductInput.getWorkFlg());
//			row.put("23", wProductInput.getErrorFlg());
//			row.put("24", wProductInput.getErrorMsg());
//			row.put("25", wProductInput.getDelFlg());
//			row.put("26", CU.nullToZero(wProductInput.getVersionNo()).toString());
//			row.put("27", CU.nullToZero(wProductInput.getControlNo()).toString());
//			row.put("28", wProductInput.getAddDt().toString());
//			row.put("29", wProductInput.getAddUser());
//			row.put("30", wProductInput.getAddProcess());
//			row.put("31", wProductInput.getUpdDt().toString());
//			row.put("32", wProductInput.getUpdUser());
//			row.put("33", wProductInput.getUpdProcess());
//			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
//
//			exportData.add(row);
//		}
//		return exportData;
//	}

	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	// 商品荷姿マスタ取込ワークのタブ区切りダウンロードファイルのヘッダ編集
//	private LinkedHashMap<String, String> getProductShapeExportHead() throws UnsupportedEncodingException {
//		LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//		row.put("1", "商品荷姿マスタ取込ワークID");
//		row.put("2", "荷主CD");
//		row.put("3", "商品CD");
//		row.put("4", "荷姿CD");
//		row.put("5", "入数");
//		row.put("6", "縦(mm)");
//		row.put("7", "横(mm)");
//		row.put("8", "高さ(mm)");
//		row.put("9", "容積(mm3)");
//		row.put("10", "商品重量(g)");
//		row.put("11", "総重量(g)");
//		row.put("12", "行NO.");
//		row.put("13", "処理済フラグ");
//		row.put("14", "エラーフラグ");
//		row.put("15", "エラー内容");
//		row.put("16", "削除フラグ");
//		row.put("17", "バージョンNo.");
//		row.put("18", "コントロールNo.");
//		row.put("19", "登録日時");
//		row.put("20", "登録ユーザ");
//		row.put("21", "登録プロセス");
//		row.put("22", "更新日時");
//		row.put("23", "更新ユーザ");
//		row.put("24", "更新プロセス");
//		return row;
//	}

	// 商品荷姿マスタ取込ワークのタブ区切りダウンロードファイルのデータ編集
//	private ArrayList<LinkedHashMap<String, String>> getProductShapeExportData(List<WProductShapeInput> lstWProductShapeInput) throws UnsupportedEncodingException {
//
//		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
//
//		LinkedHashMap<String, String> head = getProductShapeExportHead();
//		exportData.add(head);
//
//		for (WProductShapeInput wProductShapeInput : lstWProductShapeInput) {
//			LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//
//			row.put("1", wProductShapeInput.getProductShapeInputId().toString());
//			row.put("2", wProductShapeInput.getClientCd());
//			row.put("3", wProductShapeInput.getProductCd());
//			row.put("4", wProductShapeInput.getShapeCd());
//			row.put("5", CU.nullToZero(wProductShapeInput.getUnitNum()).toString());
//			row.put("6", CU.nullToZero(wProductShapeInput.getLength()).toString());
//			row.put("7", CU.nullToZero(wProductShapeInput.getWidth()).toString());
//			row.put("8", CU.nullToZero(wProductShapeInput.getHeight()).toString());
//			row.put("9", CU.nullToZero(wProductShapeInput.getVolume()).toString());
//			row.put("10", CU.nullToZero(wProductShapeInput.getNetWeight()).toString());
//			row.put("11", CU.nullToZero(wProductShapeInput.getGrossWeight()).toString());
//			row.put("12", CU.nullToZero(wProductShapeInput.getLineNo()).toString());
//			row.put("13", wProductShapeInput.getWorkFlg());
//			row.put("14", wProductShapeInput.getErrorFlg());
//			row.put("15", wProductShapeInput.getErrorMsg());
//			row.put("16", wProductShapeInput.getDelFlg());
//			row.put("17", CU.nullToZero(wProductShapeInput.getVersionNo()).toString());
//			row.put("18", CU.nullToZero(wProductShapeInput.getControlNo()).toString());
//			row.put("19", wProductShapeInput.getAddDt().toString());
//			row.put("20", wProductShapeInput.getAddUser());
//			row.put("21", wProductShapeInput.getAddProcess());
//			row.put("22", wProductShapeInput.getUpdDt().toString());
//			row.put("23", wProductShapeInput.getUpdUser());
//			row.put("24", wProductShapeInput.getUpdProcess());
//			exportData.add(row);
//		}
//		return exportData;
//	}
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

	// 取引先マスタ取込ワークのタブ区切りダウンロードファイルのヘッダ編集
//	private LinkedHashMap<String, String> getCustomerExportHead() throws UnsupportedEncodingException {
//		LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//		row.put("1", "取引先マスタ取込ワークID");
//		row.put("2", "荷主CD");
//		row.put("3", "取引先CD");
//		row.put("4", "取引先名称");
//		row.put("5", "取引先略称");
//		row.put("6", "郵便番号");
//		row.put("7", "電話番号");
//		row.put("8", "住所1");
//		row.put("9", "住所2");
//		row.put("10", "住所3");
//		row.put("11", "仕入先フラグ");
//		row.put("12", "納品先フラグ");
//		row.put("13", "ワンタイムフラグ");
//		row.put("14", "預託先フラグ");
//		row.put("15", "引当順序");
//		row.put("16", "ロット逆転防止フラグ");
//		row.put("17", "期限日逆転防止フラグ");
//		row.put("18", "出荷停止フラグ");
//		row.put("19", "センタCD");
//		row.put("20", "配送コースCD");
//		row.put("21", "配送順");
//		row.put("22", "配送リードタイム");
//		row.put("23", "行NO.");
//		row.put("24", "処理済フラグ");
//		row.put("25", "エラーフラグ");
//		row.put("26", "エラー内容");
//		row.put("27", "削除フラグ");
//		row.put("28", "バージョンNo.");
//		row.put("29", "コントロールNo.");
//		row.put("30", "登録日時");
//		row.put("31", "登録ユーザ");
//		row.put("32", "登録プロセス");
//		row.put("33", "更新日時");
//		row.put("34", "更新ユーザ");
//		row.put("35", "更新プロセス");
//		return row;
//	}

	// 取引先マスタ取込ワークのタブ区切りダウンロードファイルのデータ編集
//	private ArrayList<LinkedHashMap<String, String>> getCustomerExportData(List<WCustomerInput> lstWCustomerInput) throws UnsupportedEncodingException {
//
//		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
//
//		LinkedHashMap<String, String> head = getCustomerExportHead();
//		exportData.add(head);
//
//		for (WCustomerInput wCustomerInput : lstWCustomerInput) {
//			LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//
//			row.put("1", wCustomerInput.getCustomerInputId().toString());
//			row.put("2", wCustomerInput.getClientCd());
//			row.put("3", wCustomerInput.getCustomerCd());
//			row.put("4", wCustomerInput.getCustomerNm());
//			row.put("5", wCustomerInput.getCustomerAbbr());
//			row.put("6", wCustomerInput.getZipCd());
//			row.put("7", wCustomerInput.getTelNo());
//			row.put("8", wCustomerInput.getAddress1());
//			row.put("9", wCustomerInput.getAddress2());
//			row.put("10", wCustomerInput.getAddress3());
//			row.put("11", wCustomerInput.getVendorFlg());
//			row.put("12", wCustomerInput.getDeliveryFlg());
//			row.put("13", wCustomerInput.getOnetimeFlg());
//			row.put("14", wCustomerInput.getDepositFlg());
//			row.put("15", CU.nullToZero(wCustomerInput.getAllocOrder()).toString());
//			row.put("16", wCustomerInput.getLotReverseFlg());
//			row.put("17", wCustomerInput.getLimitDtReverseFlg());
//			row.put("18", wCustomerInput.getShippingStopFlg());
//			row.put("19", wCustomerInput.getCenterCd());
//			row.put("20", wCustomerInput.getDeliveryCourseCd());
//			row.put("21", CU.nullToZero(wCustomerInput.getDeliveryOrder()).toString());
//			row.put("22", CU.nullToZero(wCustomerInput.getDeliveryReadTime()).toString());
//			row.put("23", CU.nullToZero(wCustomerInput.getLineNo()).toString());
//			row.put("24", wCustomerInput.getWorkFlg());
//			row.put("25", wCustomerInput.getErrorFlg());
//			row.put("26", wCustomerInput.getErrorMsg());
//			row.put("27", wCustomerInput.getDelFlg());
//			row.put("28", CU.nullToZero(wCustomerInput.getVersionNo()).toString());
//			row.put("29", CU.nullToZero(wCustomerInput.getControlNo()).toString());
//			row.put("30", wCustomerInput.getAddDt().toString());
//			row.put("31", wCustomerInput.getAddUser());
//			row.put("32", wCustomerInput.getAddProcess());
//			row.put("33", wCustomerInput.getUpdDt().toString());
//			row.put("34", wCustomerInput.getUpdUser());
//			row.put("35", wCustomerInput.getUpdProcess());
//
//			exportData.add(row);
//		}
//		return exportData;
//	}

	// ロケーションマスタ取込ワークのタブ区切りダウンロードファイルのヘッダ編集
//	private LinkedHashMap<String, String> getLocationExportHead() throws UnsupportedEncodingException {
//		LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//		row.put("1", "ロケーションマスタ取込ワークID");
//		row.put("2", "センタCD");
//		row.put("3", "倉庫CD");
//		row.put("4", "ゾーンCD");
//		row.put("5", "ロケーションCD");
//		row.put("6", "ロケーション名称");
//		row.put("7", "ピックロケフラグ");
//		row.put("8", "ピッキング順序");
//		row.put("9", "ロケーション種別");
//		row.put("10", "引当順序");
//		row.put("11", "引当禁止フラグ");
//		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//		row.put("12", "補充商品CD");
//		row.put("13", "補充点荷姿CD");
//		row.put("14", "補充点");
//		row.put("15", "最大格納数商品荷姿CD");
//		row.put("16", "最大格納数");
//		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
//		row.put("17", "行NO.");
//		row.put("18", "処理済フラグ");
//		row.put("19", "エラーフラグ");
//		row.put("20", "エラー内容");
//		row.put("21", "削除フラグ");
//		row.put("22", "バージョンNo.");
//		row.put("23", "コントロールNo.");
//		row.put("24", "登録日時");
//		row.put("25", "登録ユーザ");
//		row.put("26", "登録プロセス");
//		row.put("27", "更新日時");
//		row.put("28", "更新ユーザ");
//		row.put("29", "更新プロセス");
//		return row;
//	}

	// ロケーションマスタ取込ワークのタブ区切りダウンロードファイルのデータ編集
//	private ArrayList<LinkedHashMap<String, String>> getLocationExportData(List<WLocationInput> lstWLocationInput) throws UnsupportedEncodingException {
//
//		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
//
//		LinkedHashMap<String, String> head = getLocationExportHead();
//		exportData.add(head);
//
//		for (WLocationInput wLocationInput : lstWLocationInput) {
//			LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
//
//			row.put("1", wLocationInput.getLocationInputId().toString());
//			row.put("2", wLocationInput.getCenterCd());
//			row.put("3", wLocationInput.getWarehouseCd());
//			row.put("4", wLocationInput.getZoneCd());
//			row.put("5", wLocationInput.getLocationCd());
//			row.put("6", wLocationInput.getLocationNm());
//			row.put("7", wLocationInput.getPickingLocationFlg());
//			row.put("8", CU.nullToZero(wLocationInput.getPickingOrder()).toString());
//			row.put("9", wLocationInput.getLocationType());
//			row.put("10", CU.nullToZero(wLocationInput.getAllocOrder()).toString());
//			row.put("11", wLocationInput.getAllocNgFlg());
//			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//			row.put("12", wLocationInput.getRestockProductCd());
//			row.put("13", wLocationInput.getRestockShapeCd());
//			row.put("14", CU.nullToZero(wLocationInput.getRestockPointNum()).toString());
//			row.put("15", wLocationInput.getMaxStoreShapeCd());
//			row.put("16", CU.nullToZero(wLocationInput.getMaxStoreNum()).toString());
//			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
//			row.put("17", CU.nullToZero(wLocationInput.getLineNo()).toString());
//			row.put("18", wLocationInput.getWorkFlg());
//			row.put("19", wLocationInput.getErrorFlg());
//			row.put("20", wLocationInput.getErrorMsg());
//			row.put("21", wLocationInput.getDelFlg());
//			row.put("22", CU.nullToZero(wLocationInput.getVersionNo()).toString());
//			row.put("23", CU.nullToZero(wLocationInput.getControlNo()).toString());
//			row.put("24", wLocationInput.getAddDt().toString());
//			row.put("25", wLocationInput.getAddUser());
//			row.put("26", wLocationInput.getAddProcess());
//			row.put("27", wLocationInput.getUpdDt().toString());
//			row.put("28", wLocationInput.getUpdUser());
//			row.put("29", wLocationInput.getUpdProcess());
//
//			exportData.add(row);
//		}
//		return exportData;
//	}


	// 初期データ取込種別
	private LinkedHashMap<String, String> getExportHead(String inputType) throws UnsupportedEncodingException {
		LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();

		MDataInputTypeCB cb = mDatainputTypeBhv.newMyConditionBean();
		cb.query().setDataInputTypeCd_Equal(inputType);
		cb.query().addOrderBy_DataInputTypeId_Asc();
		ListResultBean<MDataInputType> mDataInputTypeList = mDatainputTypeBhv.selectList(cb);

		mDatainputTypeBhv.loadMDataInputTypeBList(mDataInputTypeList, new ConditionBeanSetupper<MDataInputTypeBCB>() {
			@Override
			public void setup(MDataInputTypeBCB cbBody) {
				cbBody.setupSelect_MDataInputType();
				cbBody.query().addOrderBy_ColNo_Asc();
			}
		});

		MDataInputTypeDtoMapper mapper = new MDataInputTypeDtoMapper();
		List<MDataInputTypeDto> resultList =mapper.mappingToDtoList(mDataInputTypeList);
		row.put( "0", "取込ワークID");
		for (MDataInputTypeBDto result : resultList.get(0).getMDataInputTypeBList()) {
			row.put( result.getColNo().toString(), result.getColNm());
		}
		String rowNo = Integer.toString(resultList.get(0).getMDataInputTypeBList().size()+1);
		row.put(rowNo, "処理済フラグ");
		rowNo = rowNo + 1;
		row.put(rowNo, "エラーフラグ");
		rowNo = rowNo + 1;
		row.put(rowNo, "エラー内容");
		rowNo = rowNo + 1;
		row.put(rowNo, "削除フラグ");
		rowNo = rowNo + 1;
		row.put(rowNo, "バージョンNo");
		rowNo = rowNo + 1;
		row.put(rowNo, "コントロールNo");
		rowNo = rowNo + 1;
		row.put(rowNo, "登録日時");
		rowNo = rowNo + 1;
		row.put(rowNo, "登録ユーザ");
		rowNo = rowNo + 1;
		row.put(rowNo, "登録プロセス");
		rowNo = rowNo + 1;
		row.put(rowNo, "修正日時");
		rowNo = rowNo + 1;
		row.put(rowNo, "修正ユーザ");
		rowNo = rowNo + 1;
		row.put(rowNo, "修正プロセス");
		return row;
	}

	//初期データ取込種別マスタと初期データ取込種別ボディマスタよりフィールドを取得する
     @SuppressWarnings("unchecked")
	private ArrayList<LinkedHashMap<String, String>> getExportData(Object lstWInput,String inputType) throws Exception {

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> head = getExportHead(inputType);
		exportData.add(head);

		MDataInputTypeCB cb = mDatainputTypeBhv.newMyConditionBean();
		cb.query().setDataInputTypeCd_Equal(inputType);
		cb.query().addOrderBy_DataInputTypeId_Asc();
		ListResultBean<MDataInputType> mDataInputTypeList = mDatainputTypeBhv.selectList(cb);

		mDatainputTypeBhv.loadMDataInputTypeBList(mDataInputTypeList, new ConditionBeanSetupper<MDataInputTypeBCB>() {
			@Override
			public void setup(MDataInputTypeBCB cbBody) {
				cbBody.setupSelect_MDataInputType();
				cbBody.query().addOrderBy_ColNo_Asc();
			}
		});

		MDataInputTypeDtoMapper mapper = new MDataInputTypeDtoMapper();
		List<MDataInputTypeDto> resultList =mapper.mappingToDtoList(mDataInputTypeList);
		String uploadTable = resultList.get(0).getUploadTableNm();
		// 取込クラス
		Class<?> importClass;
		try {
			importClass = Class.forName("com.oneslogi.base.dbflute.exentity." + StringUtils.capitalize(uploadTable));
		} catch (ClassNotFoundException e) {
			getErrorManager().add(errRetSts(StatusCode.IMPORT_TYPE_ERROR_SETTING), WmsMessageConst.FILE_UPLOAD_DEFINE_ERROR);
			return null;
		}
		List<Method> getterList = new ArrayList<Method>();
		List<String> colNoList = new ArrayList<String>();
		for (MDataInputTypeBDto result : resultList.get(0).getMDataInputTypeBList()) {
			String UploadColumnNm = result.getUploadColumnNm();
			Method getter = importClass.getMethod("get" + StringUtils.capitalize(UploadColumnNm));
			colNoList.add(result.getColNo().toString());
			getterList.add(getter);
		}
		String rowNo = Integer.toString(resultList.get(0).getMDataInputTypeBList().size()+1);
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getWorkFlg"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getErrorFlg"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getErrorMsg"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getDelFlg"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getVersionNo"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getControlNo"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getAddDt"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getAddUser"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getAddProcess"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getUpdDt"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getUpdUser"));
		rowNo = rowNo + 1;
		colNoList.add(rowNo);
		getterList.add(importClass.getMethod("getUpdProcess"));

		for (Object wInput : (List<Object>)lstWInput) {
			LinkedHashMap<String, String> row = new LinkedHashMap<String, String>();
			if(inputType.equals("01")){
				WProductInput temp = (WProductInput)wInput;
				row.put("0",temp.getProductInputId().toString());
			}else if(inputType.equals("02")){
				WProductShapeInput temp = (WProductShapeInput)wInput;
				row.put("0",temp.getProductShapeInputId().toString());
			}else if(inputType.equals("03")){
				WCustomerInput temp = (WCustomerInput)wInput;
				row.put("0",temp.getCustomerInputId().toString());
			}else if(inputType.equals("04")){
				WLocationInput temp = (WLocationInput)wInput;
				row.put("0",temp.getLocationInputId().toString());
			}else if(inputType.equals("05")){
				WStockInput temp = (WStockInput)wInput;
				row.put("0",temp.getStockInputId().toString());
			}else if(inputType.equals("06")){
				WCarrierZipInput temp = (WCarrierZipInput)wInput;
				row.put("0",temp.getCarrierZipInputId().toString());
			}else if(inputType.equals("07")){
				WCarrierZipInput temp = (WCarrierZipInput)wInput;
				row.put("0",temp.getCarrierZipInputId().toString());
			}else if(inputType.equals("08")){
				WZipInput temp = (WZipInput)wInput;
				row.put("0",temp.getZipInputId().toString());
			}else if(inputType.equals("09")){
				WZipCompanyInput temp = (WZipCompanyInput)wInput;
				row.put("0",temp.getZipCompanyInputId().toString());
			}
			for (int i = 0; i < getterList.size(); i++) {
				Method getter = getterList.get(i);
				Object getValue = getter.invoke(wInput);
				if(getValue != null){
					// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
					if (getValue instanceof BigDecimal) {
						row.put( colNoList.get(i).toString(), WCC.stripTrailingZeros(getValue));
					} else {
						row.put( colNoList.get(i).toString(), getValue.toString());
					}
					// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				}else{
					row.put( colNoList.get(i).toString(), "");
				}
			}
			exportData.add(row);
		}
		return exportData;
	}
 	//Ver２．１向けエンハンス 荷札出力対応2016.08.02 SJA End
}