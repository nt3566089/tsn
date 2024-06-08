package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlInventoryDateMasterEditPmb;
import com.oneslogi.base.dbflute.dto.customize.SqlInventoryDateMasterEditDto;
import com.oneslogi.base.dbflute.exbhv.MMfinvoperationBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MMfinvoperation;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryDateMasterEdit;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

public class InventoryDateMasterEditSelectLogic extends AbstractWmsLogic {



	/** エラーデータ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** エラーデータのみ検索 */
		ERROR_ONLY,
		/** エラー無データのみ検索 */
		NO_ERROR_ONLY
	}

	//===== 使用テーブル =====
	@Inject
	private MMfinvoperationBhv mMfinvoperationBhv;
	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;



	// ===== 定数定義 =====


	public static final String PROPERTY_NM = "allowQueryCount";



	// 引数チェック＆拠点ID取得
	public void mappingAndInputCheck(SqlInventoryDateMasterEditDto head, String centerCd, ErrorStatus errSts) {

		/*センター*/
		//必須チェック
		if(centerCd == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
			return;
		}
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(centerCd);
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput,errSts);
		//エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			//処理中止
			return;
		}
		head.setCenterId(mCenter.getCenterId());


		return;

	}


	public SqlInventoryDateMasterEdit select(SqlInventoryDateMasterEditDto head, Long mfinvoperationId, PagingData paging, ErrorStatus errSts) throws Exception {


		//検索条件の設定

		SqlInventoryDateMasterEdit sqlInventoryDateMasterEdit = this.getInventoryDateMasterEdit(head, mfinvoperationId,paging, errSts);

		// データ未存在
		if (sqlInventoryDateMasterEdit == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;

		}

		return sqlInventoryDateMasterEdit;

		}

	/**
	 * 検索条件を元にデータベースからデータを取得する。
	 */
	public SqlInventoryDateMasterEdit getInventoryDateMasterEdit(SqlInventoryDateMasterEditDto head,Long mfinvoperationId,PagingData paging, ErrorStatus errSts) {


		//////////////////////////////////
		// SQL実行
		//////////////////////////////////
		// 外出しSQLの定義
		String path = MMfinvoperationBhv.PATH_selectSqlInventoryDateMasterEdit;

		//引数定義
		BsSqlInventoryDateMasterEditPmb pmb = new BsSqlInventoryDateMasterEditPmb();

		//引数の値を設定

		pmb.setCenterId(head.getCenterId());
		pmb.setMfinvoperationId(mfinvoperationId);

		// 検索実行
		Class<SqlInventoryDateMasterEdit> entityType = SqlInventoryDateMasterEdit.class;
		SqlInventoryDateMasterEdit sqlInventoryDateMasterEdit;

		sqlInventoryDateMasterEdit = mMfinvoperationBhv.outsideSql().entityHandling().selectEntity(path,pmb,entityType);
		return sqlInventoryDateMasterEdit;
	}

	/*チェック処理まとめ*/
	public MMfinvoperation mappingAndInputCheckSelect(SqlInventoryDateMasterEditDto head, ErrorStatus errSts) {

		////////////////////////////
		//センタ
		////////////////////////////
		//必須チェック
		if(head.getCenterCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
			return null;
		}
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(head.getCenterCd());
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput,errSts);
		if (mCenter == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
//			//処理中止
			return null;
		}


		////////////////////////////
		//荷主
		////////////////////////////
		//必須チェック
		if (head.getClientCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
			return null;
		}

		//マスタ存在チェック＆ID取得
		MClient mClientInput = new MClient();
		mClientInput.setClientCd(head.getClientCd());
		MClient mClient = clientLogic.getUkEntity(mClientInput);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}


		// インスタンス生成
		MMfinvoperation mMfinvoperation = new MMfinvoperation();

		mMfinvoperation.setMfinvoperationId(head.getMfinvoperationId());
		mMfinvoperation.setVersionNo(head.getVersionNo());


		mMfinvoperation.setInvDate(head.getInvDate());

		return mMfinvoperation;

		}


	public void update(MMfinvoperation mMfinvoperation, ErrorStatus errSts) {

		mMfinvoperationBhv.update(mMfinvoperation);
	}
}