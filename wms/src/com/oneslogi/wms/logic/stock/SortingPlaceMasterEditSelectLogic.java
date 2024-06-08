package com.oneslogi.wms.logic.stock;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlLineBrockSameProductPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlLineBrockSprprsidPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlSortingPlaceMasterEditBlkPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlSortingPlaceMasterEditLinPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlSortingPlaceMasterEditSrwPmb;
import com.oneslogi.base.dbflute.cbean.MCblkCB;
import com.oneslogi.base.dbflute.cbean.MClinCB;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterEditBlkDto;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterEditLinDto;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterEditSrwDto;
import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TCsrwhadm;
import com.oneslogi.base.dbflute.exentity.customize.SqlLineBrockSameProduct;
import com.oneslogi.base.dbflute.exentity.customize.SqlLineBrockSprprsid;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditBlk;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditLin;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditSrw;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CblkLogic;
import com.oneslogi.wms.logic.common.ClinLogic;

public class SortingPlaceMasterEditSelectLogic extends AbstractWmsLogic {



	private static final String SPRPRSID_1 = "1";

	private static final String LBC_MODE_LINE_INSERT = "1";
	private static final String LBC_MODE_BLOCK_INSERT = "2";
	private static final String LBC_MODE_LINE_UPDATE = "3";
	private static final String LBC_MODE_BLOCK_UPDATE = "4";


	// ===== 使用テーブル =====
	@Inject
	private TCsrwhadmBhv tCsrwhadmBhv;
	@Inject
	private MClinBhv mClinBhv;
	@Inject
	private MCblkBhv mCblkBhv;
	@Inject
	private MLocationBhv mLocationBhv;

	@Inject
	private CblkLogic cblkLogic;
	@Inject
	private ClinLogic clinLogic;


	public SqlSortingPlaceMasterEditSrw selectSrwByCd(Long centerId, ErrorStatus errSts) {

		// 引数チェック
		if (centerId == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}


		String path = TCsrwhadmBhv.PATH_selectSqlSortingPlaceMasterEditSrw;

		// 引数設定
		BsSqlSortingPlaceMasterEditSrwPmb pmb = new BsSqlSortingPlaceMasterEditSrwPmb();

		// 引数の値を設定
		pmb.setCenterId(centerId);

		// 検索実行
		Class<SqlSortingPlaceMasterEditSrw> entityType = SqlSortingPlaceMasterEditSrw.class;
		SqlSortingPlaceMasterEditSrw  entity = tCsrwhadmBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);

		// ０件チェック
		if (entity == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return entity;
	}



	public SqlSortingPlaceMasterEditLin selectLinByCd(Long centerId,String lincd, ErrorStatus errSts) {

		// 引数チェック
		if (centerId == null || lincd == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}


		String path = MClinBhv.PATH_selectSqlSortingPlaceMasterEditLin;

		// 引数設定
		BsSqlSortingPlaceMasterEditLinPmb pmb = new BsSqlSortingPlaceMasterEditLinPmb();

		// 引数の値を設定
		pmb.setCenterId(centerId);
		pmb.setLincd(lincd);

		// 検索実行
		Class<SqlSortingPlaceMasterEditLin> entityType = SqlSortingPlaceMasterEditLin.class;
		SqlSortingPlaceMasterEditLin  entity = mClinBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);

		// ０件チェック
		if (entity == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return entity;
	}


	public SqlSortingPlaceMasterEditBlk selectBlkByCd(Long centerId,String blkcd, ErrorStatus errSts) {

		// 引数チェック
		if (centerId == null || blkcd == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}


		String path = MCblkBhv.PATH_selectSqlSortingPlaceMasterEditBlk;

		// 引数設定
		BsSqlSortingPlaceMasterEditBlkPmb pmb = new BsSqlSortingPlaceMasterEditBlkPmb();

		// 引数の値を設定
		pmb.setCenterId(centerId);
		pmb.setBlkcd(blkcd);

		// 検索実行
		Class<SqlSortingPlaceMasterEditBlk> entityType = SqlSortingPlaceMasterEditBlk.class;
		SqlSortingPlaceMasterEditBlk  entity = mCblkBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);

		// ０件チェック
		if (entity == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return entity;
	}




	public TCsrwhadm tCsrwhadmMappingEntityAndCheck(SqlSortingPlaceMasterEditSrwDto dto, ErrorStatus errSts) {


		//////////////////////////////////////
		// entityへマッピング
		//////////////////////////////////////
		// インスタンス生成
		TCsrwhadm tCsrwhadm = new TCsrwhadm();

		// 項目マッピング
		tCsrwhadm.setSortPlaceManageId(dto.getSortPlaceManageId());
		tCsrwhadm.setLocidfrnk(dto.getLocidfrnk());
		tCsrwhadm.setLocidfbrctg1(dto.getLocidfbrctg1());
		tCsrwhadm.setLocidfbrctg2(dto.getLocidfbrctg2());
		tCsrwhadm.setLocidfbrctg3(dto.getLocidfbrctg3());
		tCsrwhadm.setLocidfbrctg4(dto.getLocidfbrctg4());
		tCsrwhadm.setLocidfbrctg5(dto.getLocidfbrctg5());
		tCsrwhadm.setLocidfbrctg6(dto.getLocidfbrctg6());
		tCsrwhadm.setLocidfbrctg7(dto.getLocidfbrctg7());
		tCsrwhadm.setLocidfbrctg8(dto.getLocidfbrctg8());
		tCsrwhadm.setLocidfbrctg9(dto.getLocidfbrctg9());
		tCsrwhadm.setLocidfbrctg10(dto.getLocidfbrctg10());


		if (tCsrwhadm.getSortPlaceManageId() == null) {
			tCsrwhadm.setDelFlg(CDef.DelFlg.$0.code());
		}
		tCsrwhadm.setVersionNo(dto.getVersionNo());



//		// 更新不要項目
//		tCsrwhadm.setCenterId(dto.getCenterId());
//		tCsrwhadm.setZzorgncd(dto.getZzorgncd());
//		tCsrwhadm.setSrymd(dto.getSrymd());
//		tCsrwhadm.setSroprtcnt(dto.getSroprtcnt());
//		tCsrwhadm.setPresplcnt(dto.getPresplcnt());
//		tCsrwhadm.setSrpmtfg(dto.getSrpmtfg());
//		tCsrwhadm.setMntpmtfg(dto.getMntpmtfg());
//		tCsrwhadm.setCordrcvcnt(dto.getCordrcvcnt());
//		tCsrwhadm.setRefvalue(dto.getRefvalue());
//		tCsrwhadm.setSftpclmgn(dto.getSftpclmgn());
//		tCsrwhadm.setTdayesrcompfg(dto.getTdayesrcompfg());
//		tCsrwhadm.setSortingFlg(dto.getSortingFlg());


		return tCsrwhadm;
	}


	public MClin mClinMappingEntityAndCheck(SqlSortingPlaceMasterEditLinDto dto, ErrorStatus errSts, String lineblockcommon) {

		if (Objects.equals(lineblockcommon,LBC_MODE_LINE_INSERT)) {
			////////////////////////////////////
			// ラインコード重複チェック
			////////////////////////////////////
			MClin mClin	= clinLogic.getUkEntity(dto.getCenterId(), dto.getLincd(), null, false);
			if(mClin != null) {
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return null;
			}


		}

		////////////////////////////////////
		// ライン名称重複チェック
		////////////////////////////////////
		MClin mClin	= clinLogic.getUkEntityByName(dto.getCenterId(), dto.getLinnm(), null, false);
		if(mClin != null ) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return null;
		}


		////////////////////////////////////
		// 対応ブロック１チェック
		////////////////////////////////////
		if(CU.isNullOrEmpty(dto.getLinblk1()) == false) {
			MCblk mCblk1 = cblkLogic.getUkEntity(dto.getCenterId(), dto.getLinblk1());
			if(mCblk1 == null) {
				this.getErrorManager().add(errSts, WmsMessageConst.BLOCK_NOT_ASSOCIATED_TO_BLOCK_TABLE_ERROR);
				return null;
			}
		}

		////////////////////////////////////
		// 対応ブロック２チェック
		////////////////////////////////////
		if(CU.isNullOrEmpty(dto.getLinblk2()) == false) {
			MCblk mCblk2 = cblkLogic.getUkEntity(dto.getCenterId(), dto.getLinblk2());
			if(mCblk2 == null) {
				this.getErrorManager().add(errSts, WmsMessageConst.BLOCK_NOT_ASSOCIATED_TO_BLOCK_TABLE_ERROR);
				return null;
			}
		}

		////////////////////////////////////
		// 対応ブロック３チェック
		////////////////////////////////////
		if(CU.isNullOrEmpty(dto.getLinblk3()) == false) {
			MCblk mCblk3 = cblkLogic.getUkEntity(dto.getCenterId(), dto.getLinblk3());
			if(mCblk3 == null) {
				this.getErrorManager().add(errSts, WmsMessageConst.BLOCK_NOT_ASSOCIATED_TO_BLOCK_TABLE_ERROR);
				return null;
			}
		}

		////////////////////////////////////
		// 対応ブロック全てが個口圧縮チェック
		////////////////////////////////////
		this.sprprsidCheck(dto.getCenterId(), dto.getLinblk1(), dto.getLinblk2(), dto.getLinblk3(), errSts);;
		if(getErrorManager().size() > 0 ) {
			return null;
		}

		////////////////////////////////////
		// 商品設定重複チェック
		////////////////////////////////////
		productSettingDuplicateCheck(dto.getCenterId(),dto.getLincd() , dto.getLinblk1(), dto.getLinblk2(), dto.getLinblk3(), errSts);;
		if(getErrorManager().size() > 0 ) {
			return null;
		}



		////////////////////////////////////
		// 削除登録時の他機能での利用有無チェック
		////////////////////////////////////
		if (Objects.equals(lineblockcommon,LBC_MODE_LINE_UPDATE)) {
			// 削除する場合
			if(Objects.equals(dto.getDelFlg(), CDef.DelFlg.$1.code())) {
				// ロケーションマスタの利用チェック
				mLocationUsedCheck(dto.getCenterId(), dto.getLincd(), errSts, WmsMessageConst.LOCATION_MASTER_NOT_LINE_CD_ERROR);
				if(getErrorManager().size() > 0 ) {
					return null;
				}
			}
		}


		//////////////////////////////////////
		// entityへマッピング
		//////////////////////////////////////
		// インスタンス生成
		MClin mClin1 = new MClin();

		// 項目マッピング
		mClin1.setClinId(dto.getClinId());
		mClin1.setLincd(dto.getLincd());
		mClin1.setLinnm(dto.getLinnm());
		mClin1.setLinblk1(dto.getLinblk1());
		mClin1.setLinblk2(dto.getLinblk2());
		mClin1.setLinblk3(dto.getLinblk3());
		mClin1.setHdrdboxrsfid(dto.getHdrdboxrsfid());
		mClin1.setPkgrt(dto.getPkgrt());
		mClin1.setSprprsid(dto.getSprprsid());
		mClin1.setCenterId(dto.getCenterId());

		if (mClin1.getClinId() == null) {
			mClin1.setDelFlg(CDef.DelFlg.$0.code());
		}

		mClin1.setVersionNo(dto.getVersionNo());


//		// 更新不要項目
//		mClin.setSplctg(dto.getSplctg());
//		mClin.setSftpclrsfid(dto.getSftpclrsfid());
//		mClin.setTsnboxrsfid(dto.getTsnboxrsfid());
//		mClin.setJtboxrsfid(dto.getJtboxrsfid());
//		mClin.setOdrdvrsfid(dto.getOdrdvrsfid());
//		mClin.setCenterId(dto.getCenterId());
//		mClin.setControlNo(dto.getControlNo());
//		mClin.setAddDt(dto.getAddDt());
//		mClin.setAddUser(dto.getAddUser());
//		mClin.setAddProcess(dto.getAddProcess());
//		mClin.setUpdDt(dto.getUpdDt());
//		mClin.setUpdUser(dto.getUpdUser());
//		mClin.setUpdProcess(dto.getUpdProcess());

		return mClin;
	}


	public MCblk mCblkMappingEntityAndCheck(SqlSortingPlaceMasterEditBlkDto dto, ErrorStatus errSts, String lineblockcommon) {

		if (Objects.equals(lineblockcommon,LBC_MODE_BLOCK_INSERT)) {
			////////////////////////////////////
			// ブロックコード重複チェック
			////////////////////////////////////
			MCblk mCblk	= cblkLogic.getUkEntity(dto.getCenterId(), dto.getBlkcd(), null, false);
			if(mCblk != null) {
				// TODO:エラーメッセージの表示
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return null;
			}

		}

		////////////////////////////////////
		// ブロック名称重複チェック
		////////////////////////////////////
		MCblk mCblk	=	cblkLogic.getUkEntityByName(dto.getCenterId(), dto.getBlknm(), null, false);
		if(mCblk != null) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return null;
		}

		if (Objects.equals(lineblockcommon,LBC_MODE_BLOCK_UPDATE)) {
			////////////////////////////////////
			// ロケーションマスタ・ライン/ブロック重複チェック
			////////////////////////////////////
			this.mLocationUsedCheck(dto.getCenterId(), dto.getBlkcd(), errSts, WmsMessageConst.LOCATION_MASTER_NOT_BLOCK_CD_ERROR);;
			if(getErrorManager().size() > 0 ) {
				return null;
			}
			////////////////////////////////////
			// ラインマスタ・ライン対応ブロック重複チェック
			////////////////////////////////////
			this.lineUsedCheck(dto.getCenterId(), dto.getBlkcd(), dto.getBlkcd(), dto.getBlkcd(), errSts);;
			if(getErrorManager().size() > 0 ) {
				return null;
			}

			////////////////////////////////////
			// 個口圧縮重複チェック
			////////////////////////////////////
			sprprsidSettingDuplicateCheck(dto.getCenterId(),dto.getBlkcd() , errSts);;
			if(getErrorManager().size() > 0 ) {
			return null;
			}

		}



		//////////////////////////////////////
		// entityへマッピング
		//////////////////////////////////////
		// インスタンス生成
		MCblk mCblk1 = new MCblk();

		// 項目マッピング
		mCblk1.setCblkId(dto.getCblkId());
		mCblk1.setBlkcd(dto.getBlkcd());
		mCblk1.setBlknm(dto.getBlknm());
		mCblk1.setLocidfrnk(dto.getLocidfrnk());
		mCblk1.setLocidfbrctg1(dto.getLocidfbrctg1());
		mCblk1.setLocidfbrctg2(dto.getLocidfbrctg2());
		mCblk1.setLocidfbrctg3(dto.getLocidfbrctg3());
		mCblk1.setLocidfbrctg4(dto.getLocidfbrctg4());
		mCblk1.setLocidfbrctg5(dto.getLocidfbrctg5());
		mCblk1.setLocidfbrctg6(dto.getLocidfbrctg6());
		mCblk1.setLocidfbrctg7(dto.getLocidfbrctg7());
		mCblk1.setLocidfbrctg8(dto.getLocidfbrctg8());
		mCblk1.setLocidfbrctg9(dto.getLocidfbrctg9());
		mCblk1.setLocidfbrctg10(dto.getLocidfbrctg10());
		mCblk1.setHdrdboxrsfid(dto.getHdrdboxrsfid());
		mCblk1.setPkgrt(dto.getPkgrt());
		mCblk1.setSprprsid(dto.getSprprsid());
		mCblk1.setCenterId(dto.getCenterId());


		if (mCblk1.getCblkId() == null) {
			mCblk1.setDelFlg(CDef.DelFlg.$0.code());
		}

		mCblk1.setVersionNo(dto.getVersionNo());


		return mCblk1;

	}


	//検索条件からブロックマスタを検索し、重複対象の個口圧縮区分を取得する。
	private void sprprsidCheck(Long centerId, String blkcd1, String blkcd2, String blkcd3, ErrorStatus errSts) {

		MCblkCB cb = mCblkBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.orScopeQuery(orCB -> {
			orCB.query().setBlkcd_Equal(blkcd1);
			orCB.query().setBlkcd_Equal(blkcd2);
			orCB.query().setBlkcd_Equal(blkcd3);
		});

		cb.query().setSprprsid_Equal(SPRPRSID_1);

		Integer mCblkCount = mCblkBhv.selectCount(cb);

		if (mCblkCount == 3) {
			//検索対象が０件の場合
			//this.getErrorManager().add(errSts, WmsMessageConst.BROCK_INDIVIDUAL_LOT_COMPRESSION_SUBJECT_ERROR);
			return;
		}

		return;
	}


	private void productSettingDuplicateCheck(Long centerId, String lincd, String blkcd1, String blkcd2, String blkcd3, ErrorStatus errSts) {

		String path = MLocationBhv.PATH_selectSqlLineBrockSameProduct;

		// 引数設定
		BsSqlLineBrockSameProductPmb pmb = new BsSqlLineBrockSameProductPmb();

		// 引数の値を設定
		pmb.setCenterId(centerId);
		pmb.setLincd(lincd);
		pmb.setBlkcd1(blkcd1);
		pmb.setBlkcd2(blkcd2);
		pmb.setBlkcd3(blkcd3);

		// 検索実行
		Class<SqlLineBrockSameProduct> entityType = SqlLineBrockSameProduct.class;
		List<SqlLineBrockSameProduct> entityList = mLocationBhv.outsideSql().selectList(path, pmb, entityType);

		// ０件チェック
		if (entityList != null && entityList.size() > 0) {
			//this.getErrorManager().add(errSts, WmsMessageConst.LINE_BROCK_SAME_PRODUCT_ERROR);
			return;
		}

		return;
	}


	private void mLocationUsedCheck(Long centerId, String linblk, ErrorStatus errSts, String errorMessageCd) {

		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setLinblk_Equal(linblk);
		cb.fetchFirst(1);


		MLocation mLocation = mLocationBhv.selectEntity(cb);

		if (mLocation != null) {
			this.getErrorManager().add(errSts, errorMessageCd);
			return;
		}

		return;
	}




	// TODO:(C)削除フラグ'1'(削除済)で登録しようとした場合、入力.ブロックCDからラインマスタを検索し、対象項目の件数を取得する。
	private void lineUsedCheck(Long centerId, String linblk1, String linblk2, String linblk3, ErrorStatus errSts) {

		MClinCB cb = mClinBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.orScopeQuery(orCB -> {
			orCB.query().setLinblk1_Equal(linblk1);
			orCB.query().setLinblk2_Equal(linblk2);
			orCB.query().setLinblk3_Equal(linblk3);
		});
		cb.fetchFirst(1);

		Integer mClinCount = mClinBhv.selectCount(cb);

		if (mClinCount != 0) {
			//this.getErrorManager().add(errSts, WmsMessageConst.CORRESPONDENCE_BLOCK_NOT_BROCK_CD_ERROR);
			return;
		}

		return;
	}

	private void sprprsidSettingDuplicateCheck(Long centerId, String blkcd, ErrorStatus errSts) {

		String path = MClinBhv.PATH_selectSqlLineBrockSprprsid;

		// 引数設定
		BsSqlLineBrockSprprsidPmb pmb = new BsSqlLineBrockSprprsidPmb();

		// 引数の値を設定
		pmb.setCenterId(centerId);
		pmb.setBlkcd(blkcd);

		// 検索実行
		Class<SqlLineBrockSprprsid> entityType = SqlLineBrockSprprsid.class;
		List<SqlLineBrockSprprsid> entityList = mClinBhv.outsideSql().selectList(path, pmb, entityType);

		// ０件チェック
		if (entityList != null && entityList.size() > 0) {
			//this.getErrorManager().add(errSts, WmsMessageConst.LINE_BROCK_SAME_PRODUCT_ERROR);
			return;
		}

		return;
	}

}
