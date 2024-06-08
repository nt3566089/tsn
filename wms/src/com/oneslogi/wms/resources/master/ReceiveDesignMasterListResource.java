package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlReceiveDesignMasterListDtoMapper;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveDesignMasterList;
import com.oneslogi.wms.dto.master.ReceiveDesignMasterListDto;
import com.oneslogi.wms.dto.master.ReceiveDesignMasterListDto.ReceiveDesignMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.master.ReceiveDesignMasterListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/receiveDesignMasterList")
public class ReceiveDesignMasterListResource extends AbstractWmsResource {

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
	private ReceiveDesignMasterListSelectLogic receiveDesignMasterListLogic;


	@GET
	@Path("/init")
	public ReceiveDesignMasterListDto init() {
		ReceiveDesignMasterListDto dto = new ReceiveDesignMasterListDto();
		return dto;
	}

	@GET
	@Path("/search")
	// throws Exception
	public ReceiveDesignMasterListDto search(ReceiveDesignMasterListDto dto) throws Exception {

		ReceiveDesignMasterListLogicSearchConditionDto cond = dto.data.cond;



		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		receiveDesignMasterListLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		//エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				//処理中止
				return null;
			}
		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlReceiveDesignMasterList> sqlReceiveDesignMasterList = receiveDesignMasterListLogic.select(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		//エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			//処理中止
			return null;
		}
		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////

		SqlReceiveDesignMasterListDtoMapper sqlReceiveDesignMasterListMapper = new SqlReceiveDesignMasterListDtoMapper();

		dto.data.resultList = sqlReceiveDesignMasterListMapper.mappingToDtoList(sqlReceiveDesignMasterList);

		return dto;
	}
}
