package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlInventoryDateMasterEditDtoMapper;
import com.oneslogi.base.dbflute.exentity.MMfinvoperation;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryDateMasterEdit;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.InventoryDateMasterEditDto;
import com.oneslogi.wms.logic.master.InventoryDateMasterEditSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/inventoryDateMasterEdit")
public class InventoryDateMasterEditResource extends AbstractWmsResource {

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

		protected static final int REGISTER_ERROR = 5;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private InventoryDateMasterEditSelectLogic inventoryDateMasterEditLogic;


	@GET
	@Path("/initUpdate")
	public InventoryDateMasterEditDto initUpdate(@QueryParam("centerCd") String centerCd,@QueryParam("mfinvoperationId") Long mfinvoperationId) throws Exception {

		InventoryDateMasterEditDto dto = new InventoryDateMasterEditDto();
		//編集 拠点CD取得:初期表示(修正)
		//編集 引数.拠点CDから拠点マスタを単一検索、拠点IDを取得する。

		inventoryDateMasterEditLogic.mappingAndInputCheck(dto.data.head, centerCd,errRetSts(StatusCode.INPUT_ERROR));
		//エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			//処理中止
			return null;
		}
		SqlInventoryDateMasterEdit result = inventoryDateMasterEditLogic.select(dto.data.head, mfinvoperationId, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		//エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			//処理中止
			return null;
		}

		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////

		SqlInventoryDateMasterEditDtoMapper sqlInventoryDateMasterEditMapper = new SqlInventoryDateMasterEditDtoMapper();
		dto.data.head = sqlInventoryDateMasterEditMapper.mappingToDto(result);

		return dto;

	}

	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(InventoryDateMasterEditDto dto, ErrorStatus errSts) {

		// 登録確認メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	@POST
	@Path("/register")
	public StatusDto register(InventoryDateMasterEditDto dto, ErrorStatus errSts) {

		// チェック処理
		MMfinvoperation mMfinvoperation = inventoryDateMasterEditLogic.mappingAndInputCheckSelect(dto.data.head,errRetSts(StatusCode.INPUT_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 修正
		inventoryDateMasterEditLogic.update(mMfinvoperation, errRetSts(StatusCode.REGISTER_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		// 完了メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
