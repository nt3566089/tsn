package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MMfpickctlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlAllocateControlMasterEditDto;
import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exentity.MMfpickctl;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterEdit;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.AllocateControlMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.MostRecentRecordLogic;
import com.oneslogi.wms.logic.common.NearestFutureRecordLogic;
import com.oneslogi.wms.logic.common.ProductLogic;

public class AllocateControlMasterEditLogic extends AbstractWmsLogic {


	private static final java.lang.String LAST_DAY = "20991231";

	@Inject
	private MMfpickctlBhv mMfpickctlBhv;

	@Inject
	private MostRecentRecordLogic mostRecentRecordLogic;

	@Inject
	private NearestFutureRecordLogic nearestFutureRecordLogic;

	@Inject
	private CenterLogic centerLogic;

	@Inject
	private ClientCenterLogic clientCenterLogic;

	@Inject
	private ProductLogic productLogic;


	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;


	// 引数チェック＆荷主ID取得
//	public void mappingAndInputCheck(SqlAllocateControlMasterEditDto head, String clientCd, ErrorStatus errSts) {
//
//		/*荷主*/
//		//必須チェック
//		if(clientCd == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
//			return;
//		}
//		MClient mClientInput = new MClient();
//		mClientInput.setClientCd(clientCd);
//		MClient mClient = clientLogic.getUkEntity(mClientInput,errSts);
//		//エラー有りの場合は終了
//		if (getErrorManager().size() > 0) {
//			//処理中止
//			return;
//		}
//		head.setClientId(mClient.getClientId());
//
//
//		return;
//
//	}

	//引当制御マスタ登録・複製時の重複チェック
	public void duplicateCheck(MMfpickctl mMfpickctl, ErrorStatus errSts) {

		// 削除フラグの検索条件自動付加を無効化
		this.setBehaviorAutoDelFlg(false);
		MMfpickctlCB cb = mMfpickctlBhv.newMyConditionBean();

		cb.specify().columnMfpickctlId();

		cb.query().setClientId_Equal(mMfpickctl.getClientId());
		cb.query().setPickfrdate_Equal(mMfpickctl.getPickfrdate());
		cb.query().setProductCd_Equal(mMfpickctl.getProductCd());

		int count = mMfpickctlBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}

		// 削除フラグの検索条件自動付加を有効化
		this.setBehaviorAutoDelFlg(true);

		return;
	}



	public SqlAllocateControlMasterEdit selectById(Long mfpickctlId, ErrorStatus errSts) {

		// 引数チェック
		if (mfpickctlId == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

//		//////////////////////////////////
//		// SQL実行
//		//////////////////////////////////
//		// 外出しSQLの定義
//		String path = MMfpickctlBhv.PATH_selectSqlAllocateControlMasterEdit;
//
//		// 引数設定
//		BsSqlAllocateControlMasterEditPmb pmb = new BsSqlAllocateControlMasterEditPmb();
//
//
//		//引数の値を設定
//		pmb.setMfpickctlId(mfpickctlId);
//
//		// 検索実行
//		Class<SqlAllocateControlMasterEdit> entityType = SqlAllocateControlMasterEdit.class;
//		SqlAllocateControlMasterEdit SqlAllocateControlMasterEdit;
//
//		try {
//			SqlAllocateControlMasterEdit = mMfpickctlBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);
//		//データが存在しなかった場合の例外処理
//		}catch(Exception e) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			return null;
//		}
//		//上記例外をスルーした場合の処理
//		// ０件チェック
//		if (SqlAllocateControlMasterEdit == null) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			return null;
//		}
//
//		return SqlAllocateControlMasterEdit;
		return null;
	}


	public List<MMfpickctl> inputCheckAndMapping(SqlAllocateControlMasterEditDto dto, ErrorStatus errSts) throws Exception {

//		///////////////////////////
//		// 荷主マスタチェック
//			///////////////////////////
//		// 必須チェック
//		if (dto.getClientCd() == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
//			return null;
//		}
//
//		// マスタ取得
//        MClient mClient = new MClient();
//		mClient.setClientCd(dto.getClientCd());
//		mClient = clientLogic.getUkEntity(mClient);
//		if (mClient == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
//			return null;
//		}
//
//		///////////////////////////
//		// 商品マスタチェック
//		///////////////////////////
//		MProduct mProduct = new MProduct();
//		mProduct.setClientId(mClient.getClientId());
//		mProduct.setProductCd(dto.getProductCd());
//		mProduct = productLogic.getUkEntity(mProduct);
//		if (mProduct == null) {
//			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_MF_RCV_DESIGN_NOT_FOUND_ERROR);
//			return null;
//		}
//
//
//
//		///////////////////////////
//		// SCREEN_MODE.Create, SCREEN_MODE.Copyの場合
//		///////////////////////////
//		//重複エラーチェック
//		if (dto.getMfpickctlId() == null) {
//
//			MMfpickctl mMfpickctl = new MMfpickctl();
//			mMfpickctl.setMfpickctlId(dto.getMfpickctlId());
//			mMfpickctl.setClientId(dto.getClientId());
//			mMfpickctl.setPickfrdate(dto.getPickfrdate());
//			mMfpickctl.setProductCd(dto.getProductCd());
//
//			// 重複チェック
//			this.duplicateCheck(mMfpickctl,errSts);
//			if (getErrorManager().size() > 0) {
//				return null;
//			}
//		}
//
//
//		MCenter mCenterInput = new MCenter();
//		mCenterInput.setCenterCd(dto.getCenterCd());
//		MCenter mCenter = centerLogic.getUkEntity(mCenterInput, errSts);
//		if(getErrorManager().size() > 0) {
//			return null;
//		}
//
//
//		String systemDt = getSystemDt(mCenter.getCenterId(),mClient.getClientId());
//		if(getErrorManager().size() > 0) {
//			return null;
//		}
//
//
//		//////////////////////////////////////////////////
//		// 適用開始日＜入力値．開始日のデータを１件取得
//		//////////////////////////////////////////////////
//		dto.setClientId(mClient.getClientId());
//		SqlAllocateControlMasterLast mostRecentRecord = mostRecentRecordLogic.getMostRecentRecord(dto.getClientId(),dto.getProductCd(),dto.getPickfrdate());
//		if (getErrorManager().size() > 0) {
//			return null;
//		}
//
//
//		//////////////////////////////////////////////////
//		// 適用開始日＞入力値．開始日のデータを１件取得
//		//////////////////////////////////////////////////
//		SqlAllocateControlMasterEditNearestFuture nearestFutureRecord = nearestFutureRecordLogic.getNearestFutureRecord(dto);
//		if (getErrorManager().size() > 0) {
//			return null;
//		}


		List<MMfpickctl> mMfpickctlList = new ArrayList<>();
//		//////////////////////////////////////////
//		// 最新の過去情報のインスタンス生成
//		//////////////////////////////////////////
//		if (mostRecentRecord != null) {
//
//			MMfpickctl mostRecentMMfpickctl = new MMfpickctl();
//			mostRecentMMfpickctl.setMfpickctlId(mostRecentRecord.getMfpickctlId());
//			mostRecentMMfpickctl.setVersionNo(mostRecentRecord.getVersionNo());
//			mostRecentMMfpickctl.setPickfrdate(mostRecentRecord.getPickfrdate());
//			mostRecentMMfpickctl.setPicktodate(this.calcDate(dto.getPickfrdate(),-1));
//
////			if (mostRecentMMfpickctl.getMfpickctlId() == null) {
////				getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
////			}
//
//			//有効区分を設定
//			// 開始日　＞　処理日　→　未来
//			if(mostRecentMMfpickctl.getPickfrdate().compareTo(systemDt) > 0){
//				mostRecentMMfpickctl.setValidtype(CDef.Validtype.$2.code());
//			}
//			// 終了日　＜　処理日　→　過去
//			else if(mostRecentMMfpickctl.getPicktodate().compareTo(systemDt) < 0) {
//				mostRecentMMfpickctl.setValidtype(CDef.Validtype.$0.code());
//
//
//			// 上記以外　→　適用世代
//			}else {
//				mostRecentMMfpickctl.setValidtype(CDef.Validtype.$1.code());
//			}
//
//			mMfpickctlList.add(mostRecentMMfpickctl);
//		}
//
//		//////////////////////////////////////////
//		// 入力情報のインスタンス生成
//		//////////////////////////////////////////
//		MMfpickctl entity = new MMfpickctl();
//
//		entity.setMfpickctlId(dto.getMfpickctlId());
//		entity.setClientId(mClient.getClientId());
//		entity.setProductCd(dto.getProductCd());
//		entity.setPickfrdate(dto.getPickfrdate());
//		entity.setPickrank1(dto.getPickrank1());
//		entity.setPickrank2(dto.getPickrank2());
//		entity.setPickrank3(dto.getPickrank3());
//		entity.setPickrank4(dto.getPickrank4());
//		entity.setPickrank5(dto.getPickrank5());
//		entity.setDelFlg(CDef.DelFlg.$0.code());
//		entity.setVersionNo(dto.getVersionNo());
//
//		if (nearestFutureRecord != null) {
//			entity.setPicktodate(this.calcDate(nearestFutureRecord.getPickfrdate(),-1));
//		}else {
//			entity.setPicktodate(LAST_DAY);
//		}
//
//
//		//処理日と日付が＝＝の場合
//		if(Objects.equals(dto.getPickfrdate(), systemDt)) {
//			entity.setValidtype(CDef.Validtype.$1.code());
//
//
//			//処理日よりも先の日付が入力されたとき
//		}else if(dto.getPickfrdate().compareTo(systemDt) > 0){
//			entity.setValidtype(CDef.Validtype.$2.code());
//		}
//
//		mMfpickctlList.add(entity);



		return mMfpickctlList;

	}


	public void updatecheckAndMapping(AllocateControlMasterEditDto dto, List<MMfpickctl> mMfpickctlList, ErrorStatus errSts) {


		MMfpickctl mMfpickctl = new MMfpickctl();

		// MBox項目マッピング
//		mMfpickctl.setMfpickctlId(dto.data.head.getMfpickctlId());
//		mMfpickctl.setClientId(dto.data.head.getClientId());
//		mMfpickctl.setProductCd(dto.data.head.getProductCd());
//		mMfpickctl.setPickfrdate(dto.data.head.getPickfrdate());
//		mMfpickctl.setPicktodate(dto.data.head.getPicktodate());
//		mMfpickctl.setPickrank1(dto.data.head.getPickrank1());
//		mMfpickctl.setPickrank2(dto.data.head.getPickrank2());
//		mMfpickctl.setPickrank3(dto.data.head.getPickrank3());
//		mMfpickctl.setPickrank4(dto.data.head.getPickrank4());
//		mMfpickctl.setPickrank5(dto.data.head.getPickrank5());
//		mMfpickctl.setDelFlg(CDef.DelFlg.$0.code());
//		mMfpickctl.setVersionNo(dto.data.head.getVersionNo());

		mMfpickctlList.add(mMfpickctl);

		return;
	}


	public void update(List<MMfpickctl> mMfpickctlList, ErrorStatus errSts) {

		// 登録用の配列定義
		List<MMfpickctl> updateMMfpickctlList = new ArrayList<>();

		///////////////////////////////////
		// MMfpickctl
		///////////////////////////////////
		// 更新データに振り分け
		for (MMfpickctl mMfpickctl : mMfpickctlList) {
			if (mMfpickctl.getMfpickctlId() != null) {

				updateMMfpickctlList.add(mMfpickctl);
			}
		}

		// update対象があれば登録
		if (updateMMfpickctlList.size() > 0) {
			mMfpickctlBhv.batchUpdate(updateMMfpickctlList);
		}

		return;
	}


	public void insert(MMfpickctl entity, ErrorStatus errSts) {
		mMfpickctlBhv.insert(entity);
	}

	public void update(MMfpickctl entity, ErrorStatus errSts) {
		mMfpickctlBhv.update(entity);
	}

//	private String calcDate(String inDateStr, Integer amount) throws Exception {
//
//		Calendar calendar = Calendar.getInstance();
//
//		//calendar.setTime(CU.stringToDate(inDateStr));
//		calendar.add(Calendar.DATE, amount);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//
//		return sdf.format(calendar.getTime());
//	}
//
//	private String getSystemDt(Long centerId, Long clientId) {
//		MClientCenter conditionEntity = new MClientCenter();
//
//		conditionEntity.setClientId(clientId);
//		conditionEntity.setCenterId(centerId);
//
//		MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);
//
//		return entity.getSystemDt();
//	}

}
