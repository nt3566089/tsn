package com.oneslogi.wms.logic.master;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlBrockBaseLineBrockSameProductCdCheckPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlLineBrockSameProductCdCheckPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlMLocationMasterEditPmb;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MMfwhxitemCB;
import com.oneslogi.base.dbflute.cbean.TYtrsoCB;
import com.oneslogi.base.dbflute.dto.customize.SqlMLocationMasterEditDto;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MMfwhxitemBhv;
import com.oneslogi.base.dbflute.exbhv.TYtrsoBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MMfwhxitem;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TYtrso;
import com.oneslogi.base.dbflute.exentity.customize.SqlBrockBaseLineBrockSameProductCdCheck;
import com.oneslogi.base.dbflute.exentity.customize.SqlLineBrockSameProductCdCheck;
import com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterEdit;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.TStockHandCheckLogic;
import com.oneslogi.wms.logic.common.TransactionDataCheckLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;

public class LocationMasterEditLogic extends AbstractWmsLogic {


	private static final String LINBLK_BLOCK = "B";

	private static final String LINBLK_LINE = "L";

	@Inject
	private MLocationBhv mLocationBhv;

	@Inject
	private ClientLogic clientLogic;
	@Inject
	private LocationLogic locationLogic;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private TStockHandCheckLogic tStockHandCheckLogic;
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	@Inject
	private MMfwhxitemBhv mMfwhxitemBhv;
	@Inject
	private TYtrsoBhv tYtrsoBhv;


	public SqlMLocationMasterEdit selectById(Long locationId, ErrorStatus errSts) {

		// 引数チェック
		if (locationId == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		String path = MLocationBhv.PATH_selectSqlMLocationMasterEdit;

		// 引数設定
		BsSqlMLocationMasterEditPmb pmb = new BsSqlMLocationMasterEditPmb();

		// 引数の値を設定(外だしSQLのWHERE)
		pmb.setLocationId(locationId);

		// 検索実行
		Class<SqlMLocationMasterEdit> entityType = SqlMLocationMasterEdit.class;
		SqlMLocationMasterEdit sqlMLocationMasterEdit = mLocationBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);

		// ０件チェック
		if (sqlMLocationMasterEdit == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return sqlMLocationMasterEdit;
	}
	// サンプルを踏襲するなら、こんな書き方もあるかも
	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;
	/**
	 * 以下の処理を実施
	 * ・dtoのentity変換
	 * ・○○チェック処理
	 * */
//	public MLocation errorCheck(SqlMLocationMasterEditDto dto, ErrorStatus errSts) {
//		// 荷主・センタの存在チェックを行う
//		MLocation mLocation = entityMapping(dto, errSts);
//		if (getErrorManager().size() > 0) {
//			return null;
//		}
//
//		return mLocation;
//	}
//

	public MLocation errorCheckAndEntityMapping(SqlMLocationMasterEditDto dto, ErrorStatus errSts) {
		///////////////////////////
		// センターマスタチェック
		///////////////////////////
		// 必須チェック
		if (CU.isNullOrEmpty(dto.getCenterCd()) == true) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
			return null;
		}

		// マスタ取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(dto.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
//		mLocation.setCenterId(mCenter.getCenterId()); //★後続で値設定するため不要


		///////////////////////////
		// 荷主マスタチェック
		///////////////////////////
		// 必須チェック
        if (dto.getClientCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
			return null;
		}

		// マスタ取得
        MClient mClient = new MClient();
		mClient.setClientCd(dto.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		///////////////////////////
		// 商品マスタチェック
		///////////////////////////
		MProduct mProduct = new MProduct();
		mProduct.setClientId(mClient.getClientId());
		mProduct.setProductCd(dto.getProductCd());
		mProduct = productLogic.getUkEntity(mProduct);
		if (mProduct == null) {
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_MF_RCV_DESIGN_NOT_FOUND_ERROR);
			return null;
		}

		///////////////////////////
		// 仕分状況チェック
		///////////////////////////
//		String systemDt = csrwhadmSelectLogic.gettingDate(mCenter.getCenterId(), mClient.getClientId(),errSts);
//		// エラー有りの場合は終了
//		if (getErrorManager().size() > 0) {
//			return null;
//		}
//
//		csrwhadmSelectLogic.csrwhadmSelect(mCenter.getCenterId(), mClient.getClientId(),errSts, systemDt);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (Objects.equals(dto.getLocGroup(), CDef.LocGroup.$06.code()) && Objects.equals(dto.getLocid(), CDef.Lockbn.$0.code()) ){
			///////////////////////////
			// 仕分場かつロケーション区分が'0'（固定ロケ）の場合のチェック
			///////////////////////////

			// 廃止状況チェック
//			if (mProduct.getUserdate3() != null && mProduct.getUserdate3().compareTo(systemDt) >= 0) {
//				getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_ABOLITION_PRODUCT_ERROR);
//				return null;
//
//			}

			// 銘柄重複チェック
			this.sameLineSameBrockSameProductCdCheck(mCenter.getCenterId(), mClient.getClientId(), dto.getLinblk(), dto.getProductCd(), errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}

			// ライン基点で銘柄重複チェック
			this.lineBaseLineBrockSameProductCdCheck(mCenter.getCenterId(), mClient.getClientId(), dto.getLinblk(), dto.getProductCd(), errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}

			// ブロック基点で銘柄重複チェック
			this.blockBaseLineBrockSameProductCdCheck(mCenter.getCenterId(), mClient.getClientId(), dto.getLinblk(), dto.getProductCd(), errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}

		}



		//////////////////////
		// 新規・複製の場合のチェック
		//////////////////////
		if (dto.getLocationId() == null) {
			if (Objects.equals(dto.getLocGroup(), CDef.LocGroup.$06.code())) {
				///////////////////////////
				// 仕分場の場合のチェック (入力.ライン/ブロック + 入力 + ロケーションCD)
				///////////////////////////
				this.duplicationLocationCd(mCenter.getCenterId(), dto.getLinblk() + dto.getLocationCd(), errSts);
				if (getErrorManager().size() > 0) {
					return null;
				}
			}else {
				///////////////////////////
				// 仕分場【以外】の場合のチェック
				///////////////////////////
				this.duplicationLocationCd(mCenter.getCenterId(), dto.getLocationCd(), errSts);
				if (getErrorManager().size() > 0) {
					return null;
				}
			}
		}



		//////////////////////
		// 修正の場合のチェック
		//////////////////////
		if(dto.getLocationId() != null) {
			this.centerProductControlCheck(mCenter.getCenterId(), dto.getLocationCd(), errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}

			//////////////////////
			// 共通処理
			//////////////////////


			//////////////////////
			// 引当て可能な在庫、移動中在庫、引き当て済み在庫存在チェック
			//////////////////////
            TStock tStock = new TStock();
            tStock.setLocationId(dto.getLocationId());

            // ロケーションIDがあればセンタ、倉庫は不要
            MWarehouse mWarehouse = new MWarehouse();
//            mWarehouse.setCenterId(dto.getCenterId());
//            mWarehouse.setWarehouseId(dto.getMZone().getWarehouseId());

            boolean hasStock = tStockHandCheckLogic.checkData(tStock, mWarehouse, errSts);
            if (hasStock) {
				getErrorManager().add(errSts, WmsMessageConst.STOCK_DATA_FOUND_ERROR);
				return null;
            }

            MLocation checkMLocation = new MLocation();
            checkMLocation.setLocationId(dto.getLocationId());
            boolean hasTran = transactionDataCheckLogic.existTran(checkMLocation);
            if (hasTran) {
				getErrorManager().add(errSts, WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
				return null;
            }


			//////////////////////
			// 拠点別銘柄制御マスタ検索 件数取得
			//////////////////////
            if(Objects.equals(dto.getDelFlg(), CDef.DelFlg.$1.code())) {
    			this.centerProductControlDelCheck(mCenter.getCenterId(), dto.getLocationCd(), errSts);
    			if (getErrorManager().size() > 0) {
    				return null;
    			}
            }





			//////////////////////
			// 山出しステータスチェック
			//////////////////////
			this.pickStatusCheck(mCenter.getCenterId(), mClient.getClientId(), errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}
		}

		///////////////////////////
		// 項目マッピング
		///////////////////////////
		MLocation mLocation = new MLocation();

		mLocation.setLocationId(dto.getLocationId());
		if (Objects.equals(dto.getLocGroup(), CDef.LocGroup.$06.code())) {
			mLocation.setLocationCd(dto.getLinblk() + dto.getLocationCd());
		}else {
			mLocation.setLocationCd(dto.getLocationCd());
		}
		mLocation.setLocationNm(dto.getLocationNm());
		mLocation.setDelFlg(dto.getDelFlg());
		mLocation.setAllocNgFlg(dto.getAllocNgFlg());
		mLocation.setPickingOrder(dto.getPickingOrder());
		mLocation.setReplenishPNum(dto.getReplenishPNum());
		mLocation.setReplenishProductId(mProduct.getProductId()); //★前方のマスタ取得処理でマスタ取得
		mLocation.setCenterId(mCenter.getCenterId()); //★前方のマスタ取得処理でマスタ取得
		mLocation.setZoneId(1L);

		// 項目マッピング
		mLocation.setLocgroup(dto.getLocGroup());
		mLocation.setPalletecapacity(dto.getPalletecapacity());
		mLocation.setMaxStoreNum(dto.getMaxStoreNum());
		mLocation.setLinblk(dto.getLinblk());
		mLocation.setLocid(dto.getLocid());
		mLocation.setTosplmd(dto.getTosplmd());
		mLocation.setPresplmd(dto.getPresplmd());
		mLocation.setSplrevun(dto.getSplrevun());
		mLocation.setSplrevctqa(dto.getSplrevctqa());
		mLocation.setBssplpt(dto.getBssplpt());
		mLocation.setZne(dto.getZone());
		mLocation.setFloor(StringUtils.substring(dto.getZone(),0,1));

		mLocation.setVersionNo(dto.getVersionNo());



//		// TODO:確認
//		// TODO:確認　指定が無いが更新なしでいいか？
//		mLocation.setPickingLocationFlg(dto.getPickingLocationFlg());
//		mLocation.setLocationType(dto.getLocationType());
//		mLocation.setAllocOrder(dto.getAllocOrder());
//		mLocation.setReplenishStockTypeId(dto.getReplenishStockTypeId());
//		mLocation.setReplenishDepositId(dto.getReplenishDepositId());
//		mLocation.setReplenishPProductShapeId(dto.getReplenishPProductShapeId());
//		mLocation.setMaxStoreProductShapeId(dto.getMaxStoreProductShapeId());
//		mLocation.setCapacity(dto.getMaxStoreNum());
//		mLocation.setProductId(dto.getProductId());
//		mLocation.setVirtuallocflg(dto.getVirtuallocflg());
//		mLocation.setRootoutseq(dto.getRootoutseq());

		return mLocation;

}


	private void sameLineSameBrockSameProductCdCheck(Long centerId, Long clientId, String linblk, String productCd, ErrorStatus errSts) {
		MLocationCB cb = mLocationBhv.newMyConditionBean();

		// 基点テーブル以外の取得があるテーブルの取得設定
		cb.setupSelect_MProduct();

		// 抽出項目
		cb.specify().columnLinblk();
		cb.specify().specifyMProduct().columnProductCd();

		// 抽出条件
		cb.query().setCenterId_Equal(centerId);
		cb.query().queryMProduct().setClientId_Equal(clientId);
		cb.query().queryMProduct().setProductCd_Equal(productCd);
		cb.query().setLinblk_Equal(linblk);

		cb.fetchFirst(1);

		// 検索実行
		Class<SqlLineBrockSameProductCdCheck> entityType = SqlLineBrockSameProductCdCheck.class;
		List<SqlLineBrockSameProductCdCheck> sqlSqlLineBrockSameProductCdCheck;

		MLocation mLocation = mLocationBhv.selectEntity(cb);
		if (mLocation == null) {
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CODE_DUPLICATE_ERROR);
			return;
		}


		return ;
	}

	private void lineBaseLineBrockSameProductCdCheck(Long centerId, Long clientId, String linblk, String productCd, ErrorStatus errSts) {

		// TODO:実装
		// Lから始まらない場合はスルー
		if (linblk.startsWith(LINBLK_LINE) == false) {
			return;
		}


		String path = MClinBhv.PATH_selectSqlLineBrockSameProductCdCheck;

		BsSqlLineBrockSameProductCdCheckPmb pmb = new BsSqlLineBrockSameProductCdCheckPmb();

		pmb.setCenterId(centerId);
		pmb.setLincd(linblk);
		pmb.setClientId(clientId);
		pmb.setProductCd(productCd);

		// 検索実行
		Class<SqlLineBrockSameProductCdCheck> entityType = SqlLineBrockSameProductCdCheck.class;
		List<SqlLineBrockSameProductCdCheck> sqlLineBrockSameProductCdCheck;

		if (pmb != null) {
			getErrorManager().add(errSts, WmsMessageConst.LINE_BLOCK_LOCATION_PRODUCT_CODE_DUPLICATE_ERROR);
			return;
		}


		return ;
	}

	private void blockBaseLineBrockSameProductCdCheck(Long centerId, Long clientId, String linblk, String productCd, ErrorStatus errSts) {

		// TODO:実装
		// Bから始まらない場合はスルー
		if (linblk.startsWith(LINBLK_BLOCK) == false) {
			return;
		}

		String path = MLocationBhv.PATH_selectSqlBrockBaseLineBrockSameProductCdCheck;

		BsSqlBrockBaseLineBrockSameProductCdCheckPmb pmb = new BsSqlBrockBaseLineBrockSameProductCdCheckPmb();

		pmb.setCenterId(centerId);
		pmb.setLinblk(linblk);
		pmb.setClientId(clientId);
		pmb.setProductCd(productCd);

		// 検索実行
		Class<SqlBrockBaseLineBrockSameProductCdCheck> entityType = SqlBrockBaseLineBrockSameProductCdCheck.class;
		List<SqlBrockBaseLineBrockSameProductCdCheck> sqlBrockBaseLineBrockSameProductCdCheck;



		if (pmb != null) {
			getErrorManager().add(errSts, WmsMessageConst.LINE_BLOCK_LOCATION_PRODUCT_CODE_DUPLICATE_ERROR);
			return;
		}


		return ;
	}



	///////////////////////////
	// SCREEN_MODE.Create, SCREEN_MODE.Copyの場合
	///////////////////////////
	private void duplicationLocationCd(Long centerId, String locationCd, ErrorStatus errSts) {
		MLocationCB cb = mLocationBhv.newMyConditionBean();

		// 抽出項目
		cb.specify().columnLocationCd();

		// 抽出条件
		cb.query().setCenterId_Equal(centerId);
		cb.query().setLocationCd_Equal(locationCd);

		cb.fetchFirst(1);


		MLocation mLocation = mLocationBhv.selectEntity(cb);
		if (mLocation == null) {
			getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}

		return;
	}



	///////////////////////////
	// (A)ロケーションCDから拠点別銘柄制御マスタ検索し取得
	///////////////////////////
	private void centerProductControlCheck(Long centerId, String locationCd, ErrorStatus errSts) {
		MMfwhxitemCB cb = mMfwhxitemBhv.newMyConditionBean();

		//抽出項目
		mMfwhxitemBhv.selectCount(cb);

		// 抽出条件
		cb.query().setCenterId_Equal(centerId);
		cb.query().setSlotlocname_Equal(locationCd);
		cb.query().setDelFlg_Equal_$0();

		cb.fetchFirst(1);


		MMfwhxitem mMfwhxitem = mMfwhxitemBhv.selectEntity(cb);
		if (mMfwhxitem != null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_PRODUCT_CONTROL_MASTER_ERROR);
			return;
		}

		return;
	}






	///////////////////////////
	// (F)削除フラグ１の場合、ロケーションCDから拠点別銘柄制御マスタ検索し取得
	///////////////////////////
	private void centerProductControlDelCheck(Long centerId, String locationCd, ErrorStatus errSts) {
		MMfwhxitemCB cb = mMfwhxitemBhv.newMyConditionBean();

		//抽出項目 count
		mMfwhxitemBhv.selectCount(cb);

		// 抽出条件
		cb.query().setCenterId_Equal(centerId);
		cb.query().setSlotlocname_Equal(locationCd);
		cb.query().setDelFlg_Equal_$0();

		cb.fetchFirst(1);


		MMfwhxitem mMfwhxitem = mMfwhxitemBhv.selectEntity(cb);
		if (mMfwhxitem == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_PRODUCT_CONTROL_MASTER_ERROR);
			return;
		}

		return;
	}



	///////////////////////////
	// 山出しステータスチェック
	///////////////////////////

	private void pickStatusCheck(Long centerId, Long clientId, ErrorStatus errSts) {
		TYtrsoCB cb = tYtrsoBhv.newMyConditionBean();

		// 抽出項目
		tYtrsoBhv.selectCount(cb);

		// 抽出条件
		cb.query().setCenterId_Equal(centerId);
		cb.query().setClientId_Equal(clientId);
		cb.query().setSrStatus_NotEqual("100");
		cb.query().setSrStatus_NotEqual("900");
		cb.query().setDelFlg_Equal_$0();



		cb.fetchFirst(1);


		TYtrso tYtrso = tYtrsoBhv.selectEntity(cb);
		if (tYtrso != null) {
			getErrorManager().add(errSts, WmsMessageConst.STOCK_TRANSFER_NOT_COMPLETED_ERROR);
			return;
		}

		return;
	}







	public void insert(MLocation mLocation,   ErrorStatus errSts) {
		mLocationBhv.insert(mLocation);

	}

	public void update(MLocation mLocation,  ErrorStatus errSts) {
		mLocationBhv.update(mLocation);
	}


}
