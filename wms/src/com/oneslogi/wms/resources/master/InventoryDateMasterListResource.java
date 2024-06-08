package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlInventoryDateMasterListDtoMapper;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryDateMasterList;
import com.oneslogi.wms.dto.master.InventoryDateMasterListDto;
import com.oneslogi.wms.dto.master.InventoryDateMasterListDto.InventoryDateMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.master.InventoryDateMasterListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/inventoryDateMasterList")
public class InventoryDateMasterListResource extends AbstractWmsResource {

	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;
		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		//一覧データ取得異常
		protected static final int SEARCH_DATA_ERROR = 3;
//		//入力値エラー
		protected static final int INPUT_ERROR = 4;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private InventoryDateMasterListSelectLogic inventoryDateMasterListLogic;


	@GET
	@Path("/init")
	public InventoryDateMasterListDto init() {
		InventoryDateMasterListDto dto = new InventoryDateMasterListDto();
		return dto;
	}

	@GET
	@Path("/search")
	// throws Exception
	public InventoryDateMasterListDto search(InventoryDateMasterListDto dto) throws Exception {

		InventoryDateMasterListLogicSearchConditionDto cond = dto.data.cond;



		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		inventoryDateMasterListLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		//エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				//処理中止
				return null;
			}
		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlInventoryDateMasterList> sqlInventoryDateMasterList = inventoryDateMasterListLogic.select(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		//エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			//処理中止
			return null;
		}
		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////

		SqlInventoryDateMasterListDtoMapper sqlInventoryDateMasterListMapper = new SqlInventoryDateMasterListDtoMapper();

		dto.data.resultList = sqlInventoryDateMasterListMapper.mappingToDtoList(sqlInventoryDateMasterList);

		return dto;
	}
}
