package com.oneslogi.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlSortingPlaceMasterListBlkDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlSortingPlaceMasterListLinDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlSortingPlaceMasterListSrwDtoMapper;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListBlk;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListLin;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListSrw;
import com.oneslogi.wms.dto.stock.SortingPlaceMasterListDto;
import com.oneslogi.wms.dto.stock.SortingPlaceMasterListDto.SortingPlaceMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.stock.SortingPlaceMasterListLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/stock/sortingPlaceMasterList")
public class SortingPlaceMasterListResource extends AbstractWmsResource {


	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;
		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		// 入力値エラー
		protected static final int INPUT_ERROR = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private SortingPlaceMasterListLogic sortingPlaceMasterListLogic;

	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;


	@GET
	@Path("/init")
	public SortingPlaceMasterListDto init() {
		SortingPlaceMasterListDto dto = new SortingPlaceMasterListDto();

		return dto;
	}

	@GET
	@Path("/search")
	public SortingPlaceMasterListDto search(SortingPlaceMasterListDto dto) {

		SortingPlaceMasterListLogicSearchConditionDto cond = dto.data.searchCondition;

		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		sortingPlaceMasterListLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}


		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////

		//共通
		SqlSortingPlaceMasterListSrw sqlSortingPlaceMasterListSrw = sortingPlaceMasterListLogic.getSortingPlaceMasterListSrwSelect(cond, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//ライン
		List<SqlSortingPlaceMasterListLin> sqlSortingPlaceMasterListLin = sortingPlaceMasterListLogic.getSortingPlaceMasterListLinSelect(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//ブロック
		List<SqlSortingPlaceMasterListBlk> sqlSortingPlaceMasterListBlk = sortingPlaceMasterListLogic.getSortingPlaceMasterListBlkSelect(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}


		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////
		SqlSortingPlaceMasterListSrwDtoMapper sqlSortingPlaceMasterListSrwMapper = new SqlSortingPlaceMasterListSrwDtoMapper();
		dto.data.resultSrw = sqlSortingPlaceMasterListSrwMapper.mappingToDto(sqlSortingPlaceMasterListSrw);
		SqlSortingPlaceMasterListLinDtoMapper sqlSortingPlaceMasterListLinMapper = new SqlSortingPlaceMasterListLinDtoMapper();
		dto.data.resultListLin = sqlSortingPlaceMasterListLinMapper.mappingToDtoList(sqlSortingPlaceMasterListLin);
		SqlSortingPlaceMasterListBlkDtoMapper sqlSortingPlaceMasterListBlkMapper = new SqlSortingPlaceMasterListBlkDtoMapper();
		dto.data.resultListBlk = sqlSortingPlaceMasterListBlkMapper.mappingToDtoList(sqlSortingPlaceMasterListBlk);

		return dto;
	}


	@GET
	@Path("/checkUpdate")
	public SortingPlaceMasterListDto checkUpdate(SortingPlaceMasterListDto dto) {
		SortingPlaceMasterListLogicSearchConditionDto cond = dto.data.searchCondition;



		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		sortingPlaceMasterListLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}


		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		csrwhadmSelectLogic.csrwhadmSelect(cond.getCenterId(), cond.getClientId(), errRetSts(StatusCode.INPUT_ERROR));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}


		return dto;
	}





}
