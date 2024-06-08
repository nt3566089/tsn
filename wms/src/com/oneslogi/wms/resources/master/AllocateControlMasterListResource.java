package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MMfpickctlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlAllocateControlMasterListDto;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlAllocateControlMasterListDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MMfpickctl;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterLast;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterList;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.AllocateControlMasterListDto;
import com.oneslogi.wms.dto.master.AllocateControlMasterListDto.AllocateControlMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.MostRecentRecordLogic;
import com.oneslogi.wms.logic.master.AllocateControlMasterListLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/master/allocateControlMasterList")
public class AllocateControlMasterListResource extends AbstractWmsResource {

	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;
		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		// 入力値エラー
		protected static final int INPUT_ERROR = 3;
		//削除項目チェックエラー
		protected static final int PAST_GENERATION_APPLICABLE_GENERATION_ERROR = 4;
	}

	@Inject
	private ClientCenterLogic clientCenterLogic;

	@Inject
	private AllocateControlMasterListLogic allocateControlMasterListLogic;

	@Inject
	private MostRecentRecordLogic mostRecentRecordLogic;

	@Inject
	private MMfpickctlBhv mMfpickctlBhv;

	@GET
	@Path("/init")
	public AllocateControlMasterListDto init() {
		AllocateControlMasterListDto dto = new AllocateControlMasterListDto();

		return dto;
	}

	@GET
	@Path("/search")
	public AllocateControlMasterListDto search(AllocateControlMasterListDto dto) {

		AllocateControlMasterListLogicSearchConditionDto cond = dto.data.searchCondition;

		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		allocateControlMasterListLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlAllocateControlMasterList> sqlAllocateControlMasterList = allocateControlMasterListLogic.getAllocateControlMasterListSelect(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////

		SqlAllocateControlMasterListDtoMapper sqlAllocateControlMasterListDtoMapper = new SqlAllocateControlMasterListDtoMapper();
		dto.data.resultList = sqlAllocateControlMasterListDtoMapper.mappingToDtoList(sqlAllocateControlMasterList);

		return dto;
	}
	@POST
	@Path("/checkDelete")
	public StatusDto checkDelete(AllocateControlMasterListDto allocateControlMasterListDto,ErrorStatus errSts) {


		List<SqlAllocateControlMasterListDto> dtoList=allocateControlMasterListDto.data.resultList;

		MClientCenter conditionEntity = new MClientCenter();

		conditionEntity.setClientId(allocateControlMasterListDto.data.searchCondition.getClientId());

		conditionEntity.setCenterId(allocateControlMasterListDto.data.searchCondition.getCenterId());

		MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);

		String systemDt=entity.getSystemDt();

		for (SqlAllocateControlMasterListDto SqlAllocateControlMasterList : dtoList) {

			// 必要項目設定
			if(CU.isNullOrEmpty(SqlAllocateControlMasterList.getPickfrdate()) == false) {
				if (systemDt.compareTo(SqlAllocateControlMasterList.getPickfrdate()) >= 0) {
					getErrorManager().add(new ErrorStatus(errSts,StatusCode.PAST_GENERATION_APPLICABLE_GENERATION_ERROR),WmsMessageConst.PAST_GENERATION_APPLICABLE_GENERATION_ERROR);
					return null;
				}

			}
		}
		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_DELETE_CONFIRMATION);
		return null;
	}
	@POST
	@Path("/delete")
	public StatusDto delete(AllocateControlMasterListDto allocateControlMasterListDto) {

		 //エンティティ編集
		SqlAllocateControlMasterListDtoMapper mapper = new SqlAllocateControlMasterListDtoMapper();
		List<SqlAllocateControlMasterList> sqlAllocateControlMasterListList = mapper.mappingToEntityList(allocateControlMasterListDto.data.resultList);

		// 初期化
		List<MMfpickctl> mMfpickctlList = new ArrayList<>();

		// ループ
		for (SqlAllocateControlMasterList SqlAllocateControlMasterList : sqlAllocateControlMasterListList) {

			// 適応開始日より古い日付の最新１件を取得して更新
			SqlAllocateControlMasterLast mostRecent = null;//mostRecentRecordLogic.getMostRecentRecord(SqlAllocateControlMasterList.getClientId(), SqlAllocateControlMasterList.getProductCd(), SqlAllocateControlMasterList.getPickfrdate());


			/////////////////////////////////
			// 適応開始日が新しい最新１件を更新
			/////////////////////////////////
			// 検索条件の指定
			MMfpickctlCB cb = mMfpickctlBhv.newMyConditionBean();
			cb.query().setMfpickctlId_Equal(mostRecent.getMfpickctlId());

			// 更新内容
			MMfpickctl mMfpickctl = new MMfpickctl();

			// 更新条件
			mMfpickctl.setMfpickctlId(mostRecent.getMfpickctlId());
			mMfpickctl.setVersionNo(mostRecent.getVersionNo());

			// 更新値
			mMfpickctl.setPicktodate(SqlAllocateControlMasterList.getPicktodate());

			// 更新実行
			mMfpickctlBhv.update(mMfpickctl);




			/////////////////////////////////
			// 対象行を削除
			/////////////////////////////////
			// インスタンス生成
			MMfpickctl mMfpickctldelete = new MMfpickctl();

			// 必要項目設定
			mMfpickctldelete.setMfpickctlId(SqlAllocateControlMasterList.getMfpickctlId());
			mMfpickctldelete.setVersionNo(SqlAllocateControlMasterList.getVersionNo());

			// 配列に追加
			mMfpickctlList.add(mMfpickctldelete);

		}

		mMfpickctlBhv.batchDelete(mMfpickctlList);

		// ===== 完了メッセージをエラー管理クラスに登録 =====
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.PROCESS_COMPLETE_INFORMATION);

		return null;
	}
}
