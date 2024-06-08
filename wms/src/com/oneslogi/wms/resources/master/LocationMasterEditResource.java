package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlMLocationMasterEditDtoMapper;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterEdit;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.LocationMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.master.LocationMasterEditLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/locationMasterEdit")
public class LocationMasterEditResource extends AbstractWmsResource {

	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;
		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		// 入力チェック異常
		protected static final int INPUT_ERROR = 3;
		// 登録異常
		protected static final int REGISTER_ERROR = 4;
		// 登録異常
		protected static final int INPUT_ERRORxx = 4;
	}

	@Inject
	private LocationMasterEditLogic locationMasterEditLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;
	@Inject
	private ClientLogic clientLogic;

	@GET
	@Path("/initNew")
	public LocationMasterEditDto initNew() {
		LocationMasterEditDto dto = new LocationMasterEditDto();

		return dto;
	}

	@GET
	@Path("/initUpdate")
	public LocationMasterEditDto initUpdate(@QueryParam("locationId") Long locationId) {
		LocationMasterEditDto dto = new LocationMasterEditDto();

		SqlMLocationMasterEdit entity = locationMasterEditLogic.selectById(locationId, errRetSts(StatusCode.NOT_FOUND_DATA));
		if (getErrorManager().size() > 0) {
			return null;
		}

		///////////////////////////////////////////
		// EntityToDtoマッピング
		///////////////////////////////////////////
		SqlMLocationMasterEditDtoMapper mapper = new SqlMLocationMasterEditDtoMapper();
		dto.data.head = mapper.mappingToDto(entity);


		return dto;
	}

	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(LocationMasterEditDto dto, ErrorStatus errSts) {
		// チェック処理
		locationMasterEditLogic.errorCheckAndEntityMapping(dto.data.head, errRetSts(StatusCode.INPUT_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 登録確認メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	@POST
	@Path("/register")
	public StatusDto register(LocationMasterEditDto dto, ErrorStatus errSts) {
		// チェック処理
		MLocation mLocation =locationMasterEditLogic.errorCheckAndEntityMapping(dto.data.head, errRetSts(StatusCode.INPUT_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// ID有無で登録モード切替
		if (mLocation.getLocationId() == null) {
			// 登録
			locationMasterEditLogic.insert(mLocation,  errRetSts(StatusCode.REGISTER_ERROR));
		} else {
			// 修正
			locationMasterEditLogic.update(mLocation, errRetSts(StatusCode.REGISTER_ERROR));
		}

		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 完了メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
