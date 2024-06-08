package com.oneslogi.wms.resources.stock;

import java.util.Objects;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlSortingPlaceMasterEditBlkDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlSortingPlaceMasterEditLinDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlSortingPlaceMasterEditSrwDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.base.dbflute.exentity.TCsrwhadm;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditBlk;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditLin;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditSrw;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.stock.SortingPlaceMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.stock.SortingPlaceMasterEditInsertLogic;
import com.oneslogi.wms.logic.stock.SortingPlaceMasterEditSelectLogic;
import com.oneslogi.wms.logic.stock.SortingPlaceMasterEditUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/stock/sortingPlaceMasterEdit")
public class SortingPlaceMasterEditResource extends AbstractWmsResource {

	private static final String LBC_MODE_LINE_INSERT = "1";
	private static final String LBC_MODE_BLOCK_INSERT = "2";
	private static final String LBC_MODE_LINE_UPDATE = "3";
	private static final String LBC_MODE_BLOCK_UPDATE = "4";
	private static final String LBC_MODE_COMMON_UPDATE = "5";

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
	}

	@Inject
	private SortingPlaceMasterEditSelectLogic sortingPlaceMasterEditSelectLogic;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;
	@Inject
	private SortingPlaceMasterEditInsertLogic sortingPlaceMasterEditInsertLogic;
	@Inject
	private SortingPlaceMasterEditUpdateLogic sortingPlaceMasterEditUpdateLogic;



	@GET
	@Path("/initNew")
	public SortingPlaceMasterEditDto initNew(
			@QueryParam("centerCd") String centerCd,
			@QueryParam("clientCd") String clientCd
			) {
		SortingPlaceMasterEditDto dto = new SortingPlaceMasterEditDto();


		// マスタ存在チェック＆ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);

		// 共通関数側でエラー設定まで行う呼び方
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}


		// 共通部
		SqlSortingPlaceMasterEditSrw srw = sortingPlaceMasterEditSelectLogic.selectSrwByCd(mCenter.getCenterId(), errRetSts(StatusCode.NOT_FOUND_DATA));
		if (getErrorManager().size() > 0) {
			return null;
		}
		SqlSortingPlaceMasterEditSrwDtoMapper zneMapper = new SqlSortingPlaceMasterEditSrwDtoMapper();
		dto.data.srw = zneMapper.mappingToDto(srw);

		return dto;
	}

	@GET
	@Path("/initUpdate")
	public SortingPlaceMasterEditDto initUpdate(
			@QueryParam("lineBlockCommon") String lineBlockCommon,
			@QueryParam("centerCd") String centerCd,
			@QueryParam("clientCd") String clientCd,
			@QueryParam("linCd") String linCd,
			@QueryParam("blkCd") String blkCd
			) {
		SortingPlaceMasterEditDto dto = new SortingPlaceMasterEditDto();


		// 拠点マスタ存在チェック＆ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);

		// 共通関数側でエラー設定まで行う呼び方
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 荷主マスタ存在チェック＆ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);

		// 共通関数側でエラー設定まで行う呼び方
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

//		if (Objects.equals(lineBlockCommon, LBC_MODE_COMMON_UPDATE)) {
			// 共通部
			SqlSortingPlaceMasterEditSrw srw = sortingPlaceMasterEditSelectLogic.selectSrwByCd(mCenter.getCenterId(), errRetSts(StatusCode.NOT_FOUND_DATA));
			if (getErrorManager().size() > 0) {
				return null;
			}
			SqlSortingPlaceMasterEditSrwDtoMapper zneMapper = new SqlSortingPlaceMasterEditSrwDtoMapper();
			dto.data.srw = zneMapper.mappingToDto(srw);

//		}
//		else if (Objects.equals(lineBlockCommon, LBC_MODE_LINE_UPDATE)) {
			if (Objects.equals(lineBlockCommon, LBC_MODE_LINE_UPDATE)) {
			// ライン
			SqlSortingPlaceMasterEditLin lin = sortingPlaceMasterEditSelectLogic.selectLinByCd(mCenter.getCenterId(), linCd, errRetSts(StatusCode.NOT_FOUND_DATA));
			if (getErrorManager().size() > 0) {
				return null;
			}
			SqlSortingPlaceMasterEditLinDtoMapper linMapper = new SqlSortingPlaceMasterEditLinDtoMapper();
			dto.data.lin = linMapper.mappingToDto(lin);

		}
		else if (Objects.equals(lineBlockCommon, LBC_MODE_BLOCK_UPDATE)) {
			// ブロック
			SqlSortingPlaceMasterEditBlk blk = sortingPlaceMasterEditSelectLogic.selectBlkByCd(mCenter.getCenterId(), blkCd, errRetSts(StatusCode.NOT_FOUND_DATA));
			if (getErrorManager().size() > 0) {
				return null;
			}
			SqlSortingPlaceMasterEditBlkDtoMapper blkMapper = new SqlSortingPlaceMasterEditBlkDtoMapper();
			dto.data.blk = blkMapper.mappingToDto(blk);
		}


		return dto;
	}

	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(SortingPlaceMasterEditDto dto) {

		////////////////////////////////////
		// センタ
		//////////////////////////////////////
		// マスタ存在チェック＆ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(dto.data.srw.getCenterCd());

		// 共通関数側でエラー設定まで行う呼び方
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		//////////////////////////////////////
		// 荷主
		//////////////////////////////////////
		// マスタ存在チェック＆ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(dto.data.srw.getClientCd());
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		///////////////////////////////////////////
		// 仕分拠点管理
		///////////////////////////////////////////
		csrwhadmSelectLogic.csrwhadmSelect(mCenter.getCenterId(), mClient.getClientId(), errRetSts(StatusCode.INPUT_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}



		String lineblockcommon = dto.data.lineBlockCommon;
		if(lineblockcommon.equals(LBC_MODE_LINE_INSERT) || lineblockcommon.equals(LBC_MODE_LINE_UPDATE)){
			// チェック処理
			sortingPlaceMasterEditSelectLogic.mClinMappingEntityAndCheck(dto.data.lin, errRetSts(StatusCode.INPUT_CHECK_ERROR), lineblockcommon);
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		if(lineblockcommon.equals(LBC_MODE_BLOCK_INSERT) || lineblockcommon.equals(LBC_MODE_BLOCK_UPDATE)){
			// チェック処理
			sortingPlaceMasterEditSelectLogic.mCblkMappingEntityAndCheck(dto.data.blk, errRetSts(StatusCode.INPUT_CHECK_ERROR), lineblockcommon);
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

//		// チェック処理
//		sortingPlaceMasterEditLogic.tCsrwhadmMappingEntityAndCheck(dto.data.srw, errRetSts(StatusCode.INPUT_CHECK_ERROR));
//		if (getErrorManager().size() > 0) {
//			return null;
//		}


		// 登録確認メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	@POST
	@Path("/register")
	public StatusDto register(SortingPlaceMasterEditDto dto, ErrorStatus errSts) {

		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(dto.data.srw.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.INPUT_CHECK_ERROR));
		dto.data.lin.setCenterId(mCenter.getCenterId());
		dto.data.blk.setCenterId(mCenter.getCenterId());

		String lineblockcommon = dto.data.lineBlockCommon;
		if(lineblockcommon.equals(LBC_MODE_LINE_INSERT)){
			// チェック処理
			MClin entity = sortingPlaceMasterEditSelectLogic.mClinMappingEntityAndCheck(dto.data.lin, errRetSts(StatusCode.INPUT_CHECK_ERROR), lineblockcommon);
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 登録
			sortingPlaceMasterEditInsertLogic.mClinInsert(entity, errRetSts(StatusCode.REGISTER_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}


		}
		else if(lineblockcommon.equals(LBC_MODE_BLOCK_INSERT)){
			// チェック処理
			MCblk entity = sortingPlaceMasterEditSelectLogic.mCblkMappingEntityAndCheck(dto.data.blk, errRetSts(StatusCode.INPUT_CHECK_ERROR), lineblockcommon);
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 登録
			sortingPlaceMasterEditInsertLogic.mCblkInsert(entity, errRetSts(StatusCode.REGISTER_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}
		}

		// 登録完了メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;

	}


	@POST
	@Path("/update")
	public StatusDto update(SortingPlaceMasterEditDto dto, ErrorStatus errSts) {

		String lineblockcommon = dto.data.lineBlockCommon;
		if(lineblockcommon.equals(LBC_MODE_COMMON_UPDATE)){

			// チェック処理
			TCsrwhadm entity = sortingPlaceMasterEditSelectLogic.tCsrwhadmMappingEntityAndCheck(dto.data.srw, errRetSts(StatusCode.INPUT_CHECK_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 修正
			sortingPlaceMasterEditUpdateLogic.tCsrwhadmUpdate(entity, errRetSts(StatusCode.REGISTER_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}

		}
		else if(lineblockcommon.equals(LBC_MODE_LINE_UPDATE)){
			// チェック処理
			MClin entity = sortingPlaceMasterEditSelectLogic.mClinMappingEntityAndCheck(dto.data.lin, errRetSts(StatusCode.INPUT_CHECK_ERROR), lineblockcommon);
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 修正
			sortingPlaceMasterEditUpdateLogic.mClinUpdate(entity, errRetSts(StatusCode.REGISTER_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}

		}
		else if(lineblockcommon.equals(LBC_MODE_BLOCK_UPDATE)){
			// チェック処理
			MCblk entity = sortingPlaceMasterEditSelectLogic.mCblkMappingEntityAndCheck(dto.data.blk, errRetSts(StatusCode.INPUT_CHECK_ERROR), lineblockcommon);
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 修正
			sortingPlaceMasterEditUpdateLogic.mCblkUpdate(entity, errRetSts(StatusCode.REGISTER_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// 完了メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

}
