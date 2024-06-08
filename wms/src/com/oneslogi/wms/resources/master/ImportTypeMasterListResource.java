package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MImportTypeDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ImportTypeMasterListDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.ImportTypeMasterDeleteLogic;
import com.oneslogi.wms.logic.master.ImportTypeMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 取込み種別マスタメンテナンス画面のリソースクラス。
 */
@Path("/master/importTypeMasterList")
public class ImportTypeMasterListResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_FAILED = 2;
		/**
		 * 取込種別マスタ削除異常
		 */
		protected static final int DELETE_ERROR = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ImportTypeMasterSelectLogic selectLogic;
	@Inject
	private ImportTypeMasterDeleteLogic deleteLogic;
	// [ON推-品向-801] 検索条件の「荷主」が条件に設定されない 2015.05.11 kawana Start
	@Inject
	private ClientLogic clientLogic;
	// [ON推-品向-801] 検索条件の「荷主」が条件に設定されない 2015.05.11 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return mMatchDto 取込み種別マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public ImportTypeMasterListDto init() {

		// 画面用DTO作成
		ImportTypeMasterListDto dto = new ImportTypeMasterListDto();

		return dto;
	}

	/**
	 * <h2>取込み種別マスタメンテナンスデータ取得。</h2>
	 * @param inputDto 取込み種別マスタメンテナンス画面用DTO
	 * @return MatchMasterDto 取込み種別マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public ImportTypeMasterListDto search(ImportTypeMasterListDto inputDto) {

		// Entity変換
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		MImportType importType = mapper.mappingToEntity(inputDto.data.search);

		// [ON推-品向-801] 検索条件の「荷主」が条件に設定されない 2015.05.11 kawana Start
		//荷主ID取得
		String clientCd = importType.chaseMClient().getClientCd();
		MClient clientCb = new MClient();
		clientCb.setClientCd(clientCd);
		MClient client = clientLogic.getUkEntityWithDeletedCheck(clientCb);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		importType.setClientId(client.getClientId());
		// [ON推-品向-801] 検索条件の「荷主」が条件に設定されない 2015.05.11 kawana End

		// 取込み種別マスタ取得用
		List<MImportType> selectList = selectLogic.select(importType, errRetSts(StatusCode.SEARCH_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Entity-Dto変換処理
		List<MImportTypeDto> list = mapper.mappingToDtoList(selectList);

		//検索結果詰込処理
		inputDto.data.list = list;

		return inputDto;
	}


	/**
	 * <h2>削除前チェック。</h2>
	 * @param inputDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDelete")
	public StatusDto checkDelete(ImportTypeMasterListDto inputDto) {

		// チェックなし

		// エラーなし - 確認メッセージを設定
		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_DELETE_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>削除前チェック。</h2>
	 * @param inputDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/delete")
	public StatusDto delete(ImportTypeMasterListDto inputDto) {

		// Entity変換
		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		List<MImportType> importTypeList = mapper.mappingToEntityList(inputDto.data.list);

		deleteLogic.delete(importTypeList, errRetSts(StatusCode.DELETE_ERROR));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

}
