package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlMLocationMasterListDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlMLocationMasterOutputDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterList;
import com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterOutput;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.dto.master.LocationMasterDto;
import com.oneslogi.wms.dto.master.LocationMasterDto.LocationMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.master.LocationMasterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションマスタメンテナンス画面のリソースクラス。
 */
@Path("/master/locationMaster")
public class LocationMasterResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;
		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		// 入力値エラー
		protected static final int INPUT_ERROR = 3;
		// 入力値エラー
		protected static final int INPUT_ERRORxxx = 4;
	}

	// ===== 使用ロジッククラス =====

	@Inject
	private LocationMasterLogic locationMasterLogic;

	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;


	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;


	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return LocationMasterDto ロケーションマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public LocationMasterDto initNew() {

		// 画面用DTO作成
		LocationMasterDto dto = new LocationMasterDto();

		return dto;
	}

	@GET
	@Path("/check")
	public StatusDto check(LocationMasterDto dto){
		//初期化処理
		LocationMasterListLogicSearchConditionDto cond = dto.data.searchCondition;

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(cond.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.INPUT_ERROR));

		if (getErrorManager().size() > 0) {
			return null;
		}


		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(cond.getClientCd());
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		cond.setClientId(mClient.getClientId());


		csrwhadmSelectLogic.csrwhadmSelect(mClient.getClientId(),mCenter.getCenterId(), errRetSts(StatusCode.INPUT_ERRORxxx));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}



		return null;
	}

	@GET
	@Path("/search")
	public LocationMasterDto search(LocationMasterDto dto){
		//初期化処理
		LocationMasterListLogicSearchConditionDto cond = dto.data.searchCondition;


		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		locationMasterLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}


		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlMLocationMasterList> sqlLocationMasterList = locationMasterLogic.getLocationMasterListSelect(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}



		///////////////////////////////////////////
		// EntityToDtoマッピング
		///////////////////////////////////////////
		SqlMLocationMasterListDtoMapper sqlLocationMasterListMapper = new SqlMLocationMasterListDtoMapper();
		dto.data.resultList = sqlLocationMasterListMapper.mappingToDtoList(sqlLocationMasterList);

		return dto;
	}



	@GET
	@Path("/checkLocationManageList")
	public LocationMasterDto output(LocationMasterDto dto){
		//初期化処理
		LocationMasterListLogicSearchConditionDto cond = dto.data.searchCondition;

		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		locationMasterLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}


		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlMLocationMasterOutput> sqlLocationMasterOutput = locationMasterLogic.getLocationMasterOutputSelect(cond, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}



		///////////////////////////////////////////
		// EntityToDtoマッピング
		///////////////////////////////////////////
		SqlMLocationMasterOutputDtoMapper sqlLocationMasterOutputMapper = new SqlMLocationMasterOutputDtoMapper();
		dto.data.excelOutputData = sqlLocationMasterOutputMapper.mappingToDtoList(sqlLocationMasterOutput);

		return dto;
	}
}
