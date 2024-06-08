package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.bhv.BehaviorReadable;
import org.dbflute.dbmeta.info.ColumnInfo;

import com.oneslogi.base.dbflute.dto.MImportTypeBDto;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MImportTypeBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MImportTypeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TEcOrderBBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.MImportTypeB;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyB;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ImportTypeMasterEditDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ImportTypeLogic;
import com.oneslogi.wms.logic.master.ImportTypeBMasterSelectLogic;
import com.oneslogi.wms.logic.master.ImportTypeMasterInsertLogic;
import com.oneslogi.wms.logic.master.ImportTypeMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品マスタメンテナンス(編集)画面のリソースクラス。
 */
@Path("/master/importTypeMasterEdit")
public class ImportTypeMasterEditResource extends AbstractWmsResource {

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
		 * 荷主取得エラー
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 2;
		/**
		 * 取込種別CD重複エラー
		 */
		protected static final int CODE_DUPLICATE_ERROR = 3;
		/**
		 * 取込種別ボディ取得エラー
		 */
		protected static final int SELECT_BODY_ERROR = 4;
		/**
		 * 取込種別取得エラー
		 */
		protected static final int SELECT_HEADER_ERROR = 5;
		/**
		 * 取込種別登録エラー
		 */
		protected static final int INSERT_ERROR = 6;
		/**
		 * 取込種別更新エラー
		 */
		protected static final int UPDATE_ERROR = 7;
	}

	// ===== 使用テーブル =====
	// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana Start
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TEcOrderBBhv tEcOrderBBhv;
	// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ImportTypeLogic importTypeLogic;
	@Inject
	private ImportTypeBMasterSelectLogic selectLogic;
	@Inject
	private ImportTypeMasterInsertLogic insertLogic;
	@Inject
	private ImportTypeMasterUpdateLogic updateLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ImportTypeMasterEditDto initNew() {

		ImportTypeMasterEditDto dto = new ImportTypeMasterEditDto();
		return dto;
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/confirm")
	public ImportTypeMasterEditDto confirm(ImportTypeMasterEditDto inputDto) {

		// Entity変換
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		MImportType importType = mapper.mappingToEntity(inputDto.data.header);

		// 荷主の存在チェック
		String clientCd = importType.getMClient().getClientCd();
		MClient clientC = new MClient();
		clientC.setClientCd(clientCd);
		MClient client = clientLogic.getUkEntity(clientC);
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}
		if (client == null) {
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// 取込種別CDの重複チェック
		MImportType importTypeC = new MImportType();
		importTypeC.setClientId(client.getClientId());
		importTypeC.setImportTypeCd(importType.getImportTypeCd());
		importTypeLogic.checkCdInsert(importTypeC, errRetSts(StatusCode.CODE_DUPLICATE_ERROR));
		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// EDI項目マスタ、取込種別ボディマスタの検索
		List<MImportTypeB> bodyList = selectLogic.select(importType, errRetSts(StatusCode.SELECT_BODY_ERROR));
		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// Entity -> DTO変換
		// Entity変換
		MImportTypeBDtoMapper bodyMapper = new MImportTypeBDtoMapper();
		List<MImportTypeBDto> bodyDtoList = bodyMapper.mappingToDtoList(bodyList);

		// 結果を設定
		inputDto.data.bodyList = bodyDtoList;

		// アップロードテーブル名から列名リストの作成
		inputDto.data.columnList = getColumnList(importType.getUploadTableNm());

		return inputDto;
	}

	/**
	 * 引数のテーブルの列名リストを作成
	 * @param tableNm テーブル名
	 * @return 列名リスト
	 */
	private List<ImportTypeMasterEditDto.ColumnListData> getColumnList(String tableNm) {

		// テーブル名からDBFlute経由でメタデータの列情報リストを取得
		BehaviorReadable bhv = (BehaviorReadable) getBehaviorSelector().byName(tableNm);
		List<ColumnInfo> columnInfoList = bhv.asDBMeta().getColumnInfoList();

		ArrayList<ImportTypeMasterEditDto.ColumnListData> columnList = new ArrayList<ImportTypeMasterEditDto.ColumnListData>();
		for (ColumnInfo info : columnInfoList) {
			ImportTypeMasterEditDto.ColumnListData data = new ImportTypeMasterEditDto.ColumnListData();
			data.columnNm = info.getPropertyName();

			// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana Start
			if (info.isPrimary() ||
					info.isForeignKey() ||
					info.isCommonColumn() ||
					info.isAutoIncrement() ||
					info.isVersionNo()) {

				continue;
			}
			// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana End

			columnList.add(data);
		}

		return columnList;
	}

	/**
	 * <h2>初期処理（修正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @param importTypeId 取込種別ID
	 * @return productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public ImportTypeMasterEditDto initUpdate(@QueryParam("importTypeId") Long importTypeId) {

		// 取込種別マスタ取得
		MImportType entityC = new MImportType();
		entityC.setImportTypeId(importTypeId);
		MImportType importType = importTypeLogic.getPkEntitySetupClient(entityC, errRetSts(StatusCode.SELECT_HEADER_ERROR));
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// EDI項目マスタ、取込種別ボディマスタの検索
		List<MImportTypeB> bodyList = selectLogic.select(importType, errRetSts(StatusCode.SELECT_BODY_ERROR));
		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		// EC受注ヘッダ/ボディコピーマスタから表示文字列設定
		for (MImportTypeB body : bodyList) {

			List<String> copyHColumnNmList = new ArrayList<String>();
			for (MImportTypeBCopyH copyH : body.getMImportTypeBCopyHList()) {
				copyHColumnNmList.add(copyH.getCopyHColumnNm());
			}
			body.setCopyHColumnNm(CU.join(",", copyHColumnNmList));

			List<String> copyBColumnNmList = new ArrayList<String>();
			for (MImportTypeBCopyB copyB : body.getMImportTypeBCopyBList()) {
				copyBColumnNmList.add(copyB.getCopyBColumnNm());
			}
			body.setCopyBColumnNm(CU.join(",", copyBColumnNmList));
		}
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

		// Entity -> DTO変換
		// Entity変換
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		MImportTypeDto headerDto = mapper.mappingToDto(importType);
		MImportTypeBDtoMapper bodyMapper = new MImportTypeBDtoMapper();
		List<MImportTypeBDto> bodyDtoList = bodyMapper.mappingToDtoList(bodyList);

		// 結果を設定
		ImportTypeMasterEditDto dto = new ImportTypeMasterEditDto();
		dto.data.header = headerDto;
		dto.data.bodyList = bodyDtoList;

		// アップロードテーブル名から列名リストの作成
		dto.data.columnList = getColumnList(importType.getUploadTableNm());

		return dto;
	}

	/**
	 * <h2>登録前入力チェック。</h2>
	 * <pre>
	 * 次のチェックを行う。
	 * ・取込種別CD重複チェック(新規の場合のみ)
	 *
	 * </pre>
	 * @param inputDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ImportTypeMasterEditDto inputDto) {

		// Entity変換
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		MImportType importType = mapper.mappingToEntity(inputDto.data.header);

		if (importType.getImportTypeId() == null) {
			// 新規登録時のチェック

			// 荷主の存在チェック
			String clientCd = importType.getMClient().getClientCd();
			MClient clientC = new MClient();
			clientC.setClientCd(clientCd);
			MClient client = clientLogic.getUkEntity(clientC);
			if (0 < getErrorManager().size()) {
				// 処理終了
				return null;
			}
			if (client == null) {
				getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
				return null;
			}

			// 取込種別CDの重複チェック
			MImportType importTypeC = new MImportType();
			importTypeC.setClientId(client.getClientId());
			importTypeC.setImportTypeCd(importType.getImportTypeCd());
			importTypeLogic.checkCdInsert(importTypeC, errRetSts(StatusCode.CODE_DUPLICATE_ERROR));
			// エラーが存在する場合
			if (0 < getErrorManager().size()) {
				// 処理終了
				return null;
			}
		}

		// エラーなし - 確認メッセージを設定
		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>商品マスタ登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに商品マスタと商品荷姿マスタを登録し、完了メッセージを設定する
	 * </pre>
	 * @param inputDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ImportTypeMasterEditDto inputDto) {

		// Entity変換
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		MImportType importType = mapper.mappingToEntity(inputDto.data.header);
		MImportTypeBDtoMapper bodyMapper = new MImportTypeBDtoMapper();
		List<MImportTypeB> importTypeBList = bodyMapper.mappingToEntityList(inputDto.data.bodyList);

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		// EC受注ヘッダ/ボディコピーマスタを設定
		setCopyColumn(importTypeBList);
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

		if (importType.getImportTypeId() == null) {
			// 新規登録

			// 荷主ID設定
			String clientCd = importType.getMClient().getClientCd();
			MClient clientC = new MClient();
			clientC.setClientCd(clientCd);
			MClient client = clientLogic.getUkEntity(clientC);
			if (0 < getErrorManager().size()) {
				// 処理終了
				return null;
			}
			if (client == null) {
				getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
				return null;
			}
			importType.setClientId(client.getClientId());

			// 入力有りのリスト作成
			List<MImportTypeB> insertBodyList = new ArrayList<MImportTypeB>();
			for (MImportTypeB body : importTypeBList) {
				if ((body.getColumnNo() != null) &&
						!CU.isNullOrEmpty(body.getUploadColumnNm())) {
					// 入力有

					insertBodyList.add(body);
				}
			}

			insertLogic.insert(importType, insertBodyList, errRetSts(StatusCode.INSERT_ERROR));
			if (0 < getErrorManager().size()) {
				// 処理終了
				return null;
			}

		} else {
			// 更新登録

			// 登録・更新・削除リスト作成
			List<MImportTypeB> insertBodyList = new ArrayList<MImportTypeB>();
			List<MImportTypeB> updateBodyList = new ArrayList<MImportTypeB>();
			List<MImportTypeB> deleteBodyList = new ArrayList<MImportTypeB>();

			for (MImportTypeB body : importTypeBList) {

				if ((body.getColumnNo() != null) &&
						!CU.isNullOrEmpty(body.getUploadColumnNm())) {
					// 入力有

					if (body.getImportTypeBId() != null) {
						// IDあり 更新
						updateBodyList.add(body);
					} else {
						// IDなし 新規登録
						insertBodyList.add(body);
					}

				} else {
					// 入力無

					if (body.getImportTypeBId() != null) {
						// IDあり 削除
						deleteBodyList.add(body);
					}
				}
			}

			updateLogic.update(importType, updateBodyList, insertBodyList, deleteBodyList, errRetSts(StatusCode.UPDATE_ERROR));
			if (0 < getErrorManager().size()) {
				// 処理終了
				return null;
			}
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	/**
	 * EC受注ヘッダコピー列、EC受注ボディコピー列の設定
	 * @param importTypeBList
	 */
	private void setCopyColumn(List<MImportTypeB> importTypeBList) {

		for (MImportTypeB itb : importTypeBList) {
			Long importTypeBId = itb.getImportTypeBId(); // 新規行はnull

			List<MImportTypeBCopyH> copyHList = new ArrayList<MImportTypeBCopyH>();
			String[] inputCopyHStrList = CU.nullToStr(itb.getCopyHColumnNm()).split(",");
			for (String copyHStr : inputCopyHStrList) {

				copyHStr = copyHStr.trim();
				if (CU.isNullOrEmpty(copyHStr)) {
					continue;
				}

				MImportTypeBCopyH copyH = new MImportTypeBCopyH();
				copyH.setImportTypeBId(importTypeBId);
				copyH.setCopyHColumnNm(copyHStr);
				copyHList.add(copyH);
			}

			List<MImportTypeBCopyB> copyBList = new ArrayList<MImportTypeBCopyB>();
			String[] inputCopyBStrList = CU.nullToStr(itb.getCopyBColumnNm()).split(",");
			for (String copyBStr : inputCopyBStrList) {

				copyBStr = copyBStr.trim();
				if (CU.isNullOrEmpty(copyBStr)) {
					continue;
				}

				MImportTypeBCopyB copyB = new MImportTypeBCopyB();
				copyB.setImportTypeBId(importTypeBId);
				copyB.setCopyBColumnNm(copyBStr);
				copyBList.add(copyB);
			}

			itb.setMImportTypeBCopyHList(copyHList);
			itb.setMImportTypeBCopyBList(copyBList);
		}
	}
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

	// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana Start
	/**
	 * <h2>EC受注ヘッダ列名リストの取得</h2>
	 * @return ImportTypeMasterEditDto.ColumnListData EC受注ヘッダ列名リスト
	 */
	@GET
	@Path("/getEcOrderHColumnNmList")
	public List<ImportTypeMasterEditDto.ColumnListData> getEcOrderHColumnNmList() {

		// メタデータの列情報リストを取得
		List<ColumnInfo> columnInfoList = tEcOrderHBhv.asDBMeta().getColumnInfoList();

		ArrayList<ImportTypeMasterEditDto.ColumnListData> columnList = new ArrayList<ImportTypeMasterEditDto.ColumnListData>();
		for (ColumnInfo info : columnInfoList) {
			ImportTypeMasterEditDto.ColumnListData data = new ImportTypeMasterEditDto.ColumnListData();
			data.columnNm = info.getPropertyName();

			if (info.isPrimary() ||
					info.isForeignKey() ||
					info.isCommonColumn() ||
					info.isAutoIncrement() ||
					info.isVersionNo()) {

				continue;
			}

			columnList.add(data);
		}

		return columnList;
	}

	/**
	 * <h2>EC受注ヘッダ列名リストの取得</h2>
	 * @return ImportTypeMasterEditDto.ColumnListData EC受注ヘッダ列名リスト
	 */
	@GET
	@Path("/getEcOrderBColumnNmList")
	public List<ImportTypeMasterEditDto.ColumnListData> getEcOrderBColumnNmList() {

		// メタデータの列情報リストを取得
		List<ColumnInfo> columnInfoList = tEcOrderBBhv.asDBMeta().getColumnInfoList();

		ArrayList<ImportTypeMasterEditDto.ColumnListData> columnList = new ArrayList<ImportTypeMasterEditDto.ColumnListData>();
		for (ColumnInfo info : columnInfoList) {
			ImportTypeMasterEditDto.ColumnListData data = new ImportTypeMasterEditDto.ColumnListData();
			data.columnNm = info.getPropertyName();

			if (info.isPrimary() ||
					info.isForeignKey() ||
					info.isCommonColumn() ||
					info.isAutoIncrement() ||
					info.isVersionNo()) {

				continue;
			}

			columnList.add(data);
		}

		return columnList;
	}
	// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana End
}
