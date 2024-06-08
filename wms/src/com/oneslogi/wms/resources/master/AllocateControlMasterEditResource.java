package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlAllocateControlMasterEditDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MMfpickctl;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterEdit;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.AllocateControlMasterEditDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.master.AllocateControlMasterEditLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/allocateControlMasterEdit")
public class AllocateControlMasterEditResource extends AbstractWmsResource {

	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;


		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		// 入力チェック異常
		protected static final int INPUT_CHECK_ERROR = 3;
		// 登録異常
		protected static final int REGISTER_ERROR = 4;
		 //荷主CD未存在エラー
		protected static final int CLIENT_NOT_FOUND_ERROR = 5;
		 //銘柄CD未存在エラー
		protected static final int PRODUCT_CD_MF_RCV_DESIGN_NOT_FOUND_ERROR = 6;
		//既に登録されています
		protected static final int ALREADY_REGISTERED_CANNOT_REGISTER_ERROR = 14;
	}
	@Inject
	private MMfpickctlBhv mMfpickctlBhv;
	@Inject
	private AllocateControlMasterEditLogic allocateControlMasterEditLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProductLogic productLogic;

	@GET
	@Path("/initNew")
	public AllocateControlMasterEditDto initNew() {
		AllocateControlMasterEditDto dto = new AllocateControlMasterEditDto();

		return dto;
	}


	@GET
	@Path("/initUpdate")
	public AllocateControlMasterEditDto initUpdate(@QueryParam("mfpickctlId") Long mfpickctlId,@QueryParam("clientCd") String clientCd )throws Exception {

		AllocateControlMasterEditDto dto = new AllocateControlMasterEditDto();

		// 荷主マスタ存在チェック＆ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);

		// 共通関数側でエラー設定まで行う呼び方
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		SqlAllocateControlMasterEdit sqlAllocateControlMasterEdit = allocateControlMasterEditLogic.selectById( mfpickctlId,  errRetSts(StatusCode.NOT_FOUND_DATA));
		if (getErrorManager().size() > 0) {
			return null;
		}


		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////

		SqlAllocateControlMasterEditDtoMapper mapper = new SqlAllocateControlMasterEditDtoMapper();
		dto.data.head = mapper.mappingToDto(sqlAllocateControlMasterEdit);



		return dto;
	}


	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(AllocateControlMasterEditDto dto) throws Exception {

		// チェック処理
		allocateControlMasterEditLogic.inputCheckAndMapping(dto.data.head, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 登録確認メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	@POST
	@Path("/register")
	public StatusDto register(AllocateControlMasterEditDto dto) throws Exception {

		// チェック処理
		List<MMfpickctl> mMfpickctlList = allocateControlMasterEditLogic.inputCheckAndMapping(dto.data.head, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// ID有無で登録モード切替
		for (MMfpickctl mMfpickctl : mMfpickctlList) {
			if (mMfpickctl.getMfpickctlId() == null) {
				// 登録
				allocateControlMasterEditLogic.insert(mMfpickctl, errRetSts(StatusCode.REGISTER_ERROR));
			} else {
				// 修正
				allocateControlMasterEditLogic.update(mMfpickctl, errRetSts(StatusCode.REGISTER_ERROR));
			}
		}

		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 完了メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	@POST
	@Path("/update")
	public StatusDto update(AllocateControlMasterEditDto dto) throws Exception {

		// Entity変換
		//SqlAllocateControlMasterEditDtoMapper mapper = new SqlAllocateControlMasterEditDtoMapper();
		//List<SqlAllocateControlMasterEdit> sqlMMfpickctlResultList = mapper.mappingToEntityList(dto.data.head);


		// inputCheckAndMapping
		List<MMfpickctl> mMfpickctl = new ArrayList<MMfpickctl>();
		allocateControlMasterEditLogic.updatecheckAndMapping(dto , mMfpickctl,errRetSts(StatusCode.INPUT_CHECK_ERROR));

		if (0 < getErrorManager().size()) {
			return null;
		}

		// 引当制御マスタ 更新

		allocateControlMasterEditLogic.update(mMfpickctl,errRetSts(StatusCode.REGISTER_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}