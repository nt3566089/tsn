package com.oneslogi.wms.resources.master;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dtomapper.BClassDtlDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.exentity.BClass;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrpDtl;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.ClassLogic;
import com.oneslogi.base.logic.master.ClassDtlMasterSelectLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterRelatedCopyDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CarrierSlipSgwMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CarrierSlipSgwMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYmtMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYmtMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYupkMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYupkMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClassDtlMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterClassDtlMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpDtlMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpDtlMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClassMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterClassMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterColMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterColMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterItemMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterItemMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterRelatedCopyLogic;
import com.oneslogi.wms.logic.master.CenterScreenMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterScreenMasterInsertLogic;
import com.oneslogi.wms.logic.master.ClientCenterMasterInsertLogic;
import com.oneslogi.wms.logic.master.NumberingCenterMasterDeleteLogic;
import com.oneslogi.wms.logic.master.NumberingCenterMasterInsertLogic;
import com.oneslogi.wms.logic.master.ParamMasterInsertLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタ関連マスタ作成のリソースクラス
 */
@Path("/master/centerRelatedCopy")
public class CenterRelatedCopyResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * センタCDFromToエラー
		 */
		protected static final int CENTER_CODE_FROM_TO_ERROR = 2;
		/**
		 * 対象テーブル未定義エラー
		 */
		protected static final int NOT_FOUND_BODY_DATA = 3;
		/**
		 * センタマスタデータ取得異常
		 */
		protected static final int CENTER_MASTER_EDIT_SELECT_FAILED = 4;
		/**
		 * 登録異常
		 */
		protected static final int CENTER_MASTER_EDIT_INSERT_FAILED = 5;
		/**
		 * 入力チェックエラー
		 */
		protected static final int INPUT_CHECK_ERROR = 8;

		/**
		 * センタ権限エラー
		 */
		protected static final int CENTER_PERMISSION_ERROR = 15;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClassDtlMasterSelectLogic classDtlMasterSelectLogic;
	@Inject
	private CenterRelatedCopyLogic centerRelatedCopyLogic;
	@Inject
	private NumberingCenterMasterInsertLogic numberingCenterMasterInsertLogic;
	@Inject
	private NumberingCenterMasterDeleteLogic numberingCenterMasterDeleteLogic;
	@Inject
	private CenterClassMasterInsertLogic centerClassMasterInsertLogic;
	@Inject
	private CenterClassMasterDeleteLogic centerClassMasterDeleteLogic;
	@Inject
	private CenterClassDtlMasterInsertLogic centerClassDtlMasterInsertLogic;
	@Inject
	private CenterClassDtlMasterDeleteLogic centerClassDtlMasterDeleteLogic;
	@Inject
	private CenterClassGrpMasterInsertLogic centerClassGrpMasterInsertLogic;
	@Inject
	private CenterClassGrpMasterDeleteLogic centerClassGrpMasterDeleteLogic;
	@Inject
	private CenterClassGrpDtlMasterInsertLogic centerClassGrpDtlMasterInsertLogic;
	@Inject
	private CenterClassGrpDtlMasterDeleteLogic centerClassGrpDtlMasterDeleteLogic;
	// [#3347][Ver3.0] TODO残対応(UoM) - 荷姿マスタ登録関連処理削除 2018.01.15 honma Delete
	@Inject
	private ClientCenterMasterInsertLogic clientCenterMasterInsertLogic;
	@Inject
	private ParamMasterInsertLogic paramMasterInsertLogic;
	@Inject
	private CenterColMasterInsertLogic centerColMasterInsertLogic;
	@Inject
	private CenterColMasterDeleteLogic centerColMasterDeleteLogic;
	@Inject
	private CenterItemMasterInsertLogic centerItemMasterInsertLogic;
	@Inject
	private CenterItemMasterDeleteLogic centerItemMasterDeleteLogic;
	@Inject
	private CenterScreenMasterInsertLogic centerScreenMasterInsertLogic;
	@Inject
	private CenterScreenMasterDeleteLogic centerScreenMasterDeleteLogic;
	@Inject
	private CarrierSlipSgwMasterInsertLogic carrierSlipSgwMasterInsertLogic;
	@Inject
	private CarrierSlipSgwMasterDeleteLogic carrierSlipSgwMasterDeleteLogic;
	@Inject
	private CarrierSlipYmtMasterInsertLogic carrierSlipYmtMasterInsertLogic;
	@Inject
	private CarrierSlipYmtMasterDeleteLogic carrierSlipYmtMasterDeleteLogic;
	@Inject
	private CarrierSlipYupkMasterInsertLogic carrierSlipYupkMasterInsertLogic;
	@Inject
	private CarrierSlipYupkMasterDeleteLogic carrierSlipYupkMasterDeleteLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ClassLogic classLogic;

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
		CENTER_FROM_TO_ERROR
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterRelatedCopyDto センタ関連マスタ作成画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterRelatedCopyDto init() {

		// 画面用DTO作成
		CenterRelatedCopyDto centerRelatedCopyDto = new CenterRelatedCopyDto();

		return centerRelatedCopyDto;
	}

	/**
	 * <h2>センタ関連マスタ作成検索データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタ関連マスタ作成対象テーブルを取得する
	 * </pre>
	 * @param centerRelatedCopyDto センタ関連マスタ作成画面用DTO
	 * @return CenterRelatedCopyDto センタ関連マスタ作成画面用DTO
	 */
	@GET
	@Path("/search")
	public CenterRelatedCopyDto search(CenterRelatedCopyDto centerRelatedCopyDto) {
		CenterRelatedCopyDto result = new CenterRelatedCopyDto();

		// 区分値グループID取得
		BClass bClass = new BClass();
		bClass.setClassCd("COPY_TARGET_TABLE");
		bClass = classLogic.getUkEntity(bClass);

		List<BClassDtl> sqlData = classDtlMasterSelectLogic.selectById(bClass, errRetSts(StatusCode.NOT_FOUND_BODY_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取得できません
		if (sqlData.size() == 0) {
			return null;
		}

		// ===== Entity-Dto変換処理 =====
		BClassDtlDtoMapper bClassDtlDtoMapper = new BClassDtlDtoMapper();
		List<BClassDtlDto> body = bClassDtlDtoMapper.mappingToDtoList(sqlData);
		result.data.body = body;

		return result;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param centerRelatedCopyDto センタ関連マスタ作成画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterRelatedCopyDto centerRelatedCopyDto) {

		// Entity変換
		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MClientDtoMapper clientMapper = new MClientDtoMapper();
		MCenter mCenterFrom = centerMapper.mappingToEntity(centerRelatedCopyDto.data.mCenterFrom);
		MClient mClientFrom = clientMapper.mappingToEntity(centerRelatedCopyDto.data.mClientFrom.getMClient());
		MCenter mCenterTo = centerMapper.mappingToEntity(centerRelatedCopyDto.data.mCenterTo);
		MClient mClientTo = clientMapper.mappingToEntity(centerRelatedCopyDto.data.mClientTo);

		// 入力チェック処理
		ResultSetupData resultStatus = check(mCenterFrom, mClientFrom, mCenterTo, mClientTo, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		switch (resultStatus) {
		case ERROR:
			break;
		case CENTER_FROM_TO_ERROR:
			getInfoManager().add(infoRetSts(StatusCode.CENTER_CODE_FROM_TO_ERROR), WmsMessageConst.COPY_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR);
			break;
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		}

		return null;
	}

	/**
	 * <h2>センタマスタ登録。</h2>
	 * <pre>
	 * 登録データのチェックを行う
	 * エラーがない場合は、データベースにセンタマスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerRelatedCopyDto センタ関連マスタ作成画面用DTO
	 * @return CenterRelatedCopyDto センタ関連マスタ作成画面用DTO
	 */
	@POST
	@Path("/register")
	public CenterRelatedCopyDto register(CenterRelatedCopyDto centerRelatedCopyDto) {

		// Entity変換
		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MClientDtoMapper clientMapper = new MClientDtoMapper();
		MCenter mCenterFrom = centerMapper.mappingToEntity(centerRelatedCopyDto.data.mCenterFrom);
		MClient mClientFrom = clientMapper.mappingToEntity(centerRelatedCopyDto.data.mClientFrom.getMClient());
		MCenter mCenterTo = centerMapper.mappingToEntity(centerRelatedCopyDto.data.mCenterTo);
		MClient mClientTo = clientMapper.mappingToEntity(centerRelatedCopyDto.data.mClientTo);
		ResultSetupData resultStatus = check(mCenterFrom, mClientFrom, mCenterTo, mClientTo, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		String centerFromCd = mCenterFrom.getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerFromCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		long centerIdFrom = mCenter.getCenterId();

		String centerCdTo = mCenterTo.getCenterCd();
		mCenter.setCenterCd(centerCdTo);
		mCenter = centerLogic.getUkEntity(mCenter);
		long centerIdTo = mCenter.getCenterId();

		String clientFromCd = mClientFrom.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientFromCd);
		mClient = clientLogic.getUkEntity(mClient);
		long clientIdFrom = mClient.getClientId();

		String clientCdTo = mClientTo.getClientCd();
		mClient.setClientCd(clientCdTo);
		mClient = clientLogic.getUkEntity(mClient);
		long clientIdTo = mClient.getClientId();

		// 必須テーブル

		// 既存データの削除

		// センタ採番マスタ
		List<MNumberingCenter> numberingCenterDeleteList = centerRelatedCopyLogic.selectNumberingCenter(centerIdTo, true);
		for (MNumberingCenter numberingCenter : numberingCenterDeleteList) {
			numberingCenterMasterDeleteLogic.delete(numberingCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// センタ区分値グループ明細マスタ
		List<MCenterClassGrpDtl> centerClassGrpDtlDeleteList = centerRelatedCopyLogic.selectCenterClassGrpDtl(centerIdTo, true);
		for (MCenterClassGrpDtl centerClassGrpDtl : centerClassGrpDtlDeleteList) {
			centerClassGrpDtlMasterDeleteLogic.delete(centerClassGrpDtl, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// センタ区分値グループマスタ
		List<MCenterClassGrp> centerClassGrpDeleteList = centerRelatedCopyLogic.selectCenterClassGrp(centerIdTo, true);
		for (MCenterClassGrp centerClassGrp : centerClassGrpDeleteList) {
			centerClassGrpMasterDeleteLogic.delete(centerClassGrp, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// センタ区分値明細マスタ
		List<MCenterClassDtl> centerClassDtlDeleteList = centerRelatedCopyLogic.selectCenterClassDtl(centerIdTo, true);
		for (MCenterClassDtl centerClassDtl : centerClassDtlDeleteList) {
			centerClassDtlMasterDeleteLogic.delete(centerClassDtl, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// センタ区分値マスタ
		List<MCenterClass> centerClassDeleteList = centerRelatedCopyLogic.selectCenterClass(centerIdTo, true);
		for (MCenterClass centerClass : centerClassDeleteList) {
			centerClassMasterDeleteLogic.delete(centerClass, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// マスタコピー

		// センタ採番マスタ
		List<MNumberingCenter> numberingCenterInsertList = centerRelatedCopyLogic.selectNumberingCenter(centerIdFrom, false);

		for (MNumberingCenter numberingCenter : numberingCenterInsertList) {

			MNumberingCenter mNumberingCenter = new MNumberingCenter();
			mNumberingCenter.setCenterId(centerIdTo);
			mNumberingCenter.setBizCd(numberingCenter.getBizCd());
			mNumberingCenter.setBizNm(numberingCenter.getBizNm());
			mNumberingCenter.setLength(numberingCenter.getLength());
			mNumberingCenter.setFixedValue(numberingCenter.getFixedValue());
			mNumberingCenter.setFixedDtFormat(numberingCenter.getFixedDtFormat());
			mNumberingCenter.setPresentNumber(numberingCenter.getMinNumber() - numberingCenter.getIncNumber());
			mNumberingCenter.setIncNumber(numberingCenter.getIncNumber());
			mNumberingCenter.setMinNumber(numberingCenter.getMinNumber());
			mNumberingCenter.setMaxNumber(numberingCenter.getMaxNumber());
			mNumberingCenter.setCheckDigit(numberingCenter.getCheckDigit());
			mNumberingCenter.setCashCount(numberingCenter.getCashCount());
			mNumberingCenter.setUserEditable(numberingCenter.getUserEditable());

			numberingCenterMasterInsertLogic.insert(mNumberingCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// センタ区分値マスタ
		List<MCenterClass> centerClassInsertList = centerRelatedCopyLogic.selectCenterClass(centerIdFrom, false);

		HashMap<Long, Long> mapCenterClassDtlId = new HashMap<Long, Long>();
		HashMap<Long, Long> mapCenterClassGrpId = new HashMap<Long, Long>();
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete

		for (MCenterClass centerClass : centerClassInsertList) {
			long centerClassIdFrom = centerClass.getCenterClassId();

			MCenterClass mCenterClass = new MCenterClass();
			mCenterClass.setCenterId(centerIdTo);
			mCenterClass.setClassCd(centerClass.getClassCd());
			mCenterClass.setClassComment(centerClass.getClassComment());
			mCenterClass.setSystemType(centerClass.getSystemType());

			centerClassMasterInsertLogic.insert(mCenterClass, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}

			long centerClassIdTo = mCenterClass.getCenterClassId();

			// センタ区分値明細マスタ
			List<MCenterClassDtl> centerClassDtlInsertList = centerRelatedCopyLogic.selectCenterClassDtl(centerIdFrom, centerClassIdFrom);

			for (MCenterClassDtl centerClassDtl : centerClassDtlInsertList) {
				long centerFromClassDtlId = centerClassDtl.getCenterClassDtlId();

				MCenterClassDtl mCenterClassDtl = new MCenterClassDtl();
				mCenterClassDtl.setCenterClassId(centerClassIdTo);
				mCenterClassDtl.setClassDtlCd(centerClassDtl.getClassDtlCd());
				mCenterClassDtl.setDictId(centerClassDtl.getDictId());
				mCenterClassDtl.setViewOrder(centerClassDtl.getViewOrder());
				mCenterClassDtl.setDefaultFlg(centerClassDtl.getDefaultFlg());

				centerClassDtlMasterInsertLogic.insert(mCenterClassDtl, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

				// 結果判定
				if (0 < getErrorManager().size()) {
					return null;
				}

				long centerToClassDtlId = mCenterClassDtl.getCenterClassDtlId();

				if (!mapCenterClassDtlId.containsKey(centerFromClassDtlId)) {
					mapCenterClassDtlId.put(centerFromClassDtlId, centerToClassDtlId);
				}
			}

			// センタ区分値グループマスタ
			List<MCenterClassGrp> centerClassGrpInsertList = centerRelatedCopyLogic.selectCenterClassGrp(centerIdFrom, centerClassIdFrom);

			for (MCenterClassGrp centerClassGrp : centerClassGrpInsertList) {
				long centerClassGrpIdFrom = centerClassGrp.getCenterClassGrpId();

				MCenterClassGrp mCenterClassGrp = new MCenterClassGrp();
				mCenterClassGrp.setClassGrpCd(centerClassGrp.getClassGrpCd());
				mCenterClassGrp.setClassGrpComment(centerClassGrp.getClassGrpComment());
				mCenterClassGrp.setCenterClassId(centerClassIdTo);

				centerClassGrpMasterInsertLogic.insert(mCenterClassGrp, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

				// 結果判定
				if (0 < getErrorManager().size()) {
					return null;
				}

				long centerClassGrpIdTo = mCenterClassGrp.getCenterClassGrpId();

				if (!mapCenterClassGrpId.containsKey(centerClassGrpIdFrom)) {
					mapCenterClassGrpId.put(centerClassGrpIdFrom, centerClassGrpIdTo);
				}
			}
		}

		// センタ区分値グループ明細マスタ
		List<MCenterClassGrpDtl> centerClassGrpDtlList = centerRelatedCopyLogic.selectCenterClassGrpDtl(centerIdFrom, false);

		for (MCenterClassGrpDtl centerClassGrpDtl : centerClassGrpDtlList) {

			if (mapCenterClassGrpId.containsKey(centerClassGrpDtl.getCenterClassGrpId()) && mapCenterClassDtlId.containsKey(centerClassGrpDtl.getCenterClassDtlId())) {

				MCenterClassGrpDtl mCenterClassGrpDtl = new MCenterClassGrpDtl();
				mCenterClassGrpDtl.setCenterClassGrpId(mapCenterClassGrpId.get(centerClassGrpDtl.getCenterClassGrpId()));
				mCenterClassGrpDtl.setCenterClassDtlId(mapCenterClassDtlId.get(centerClassGrpDtl.getCenterClassDtlId()));
				mCenterClassGrpDtl.setDefaultFlg(centerClassGrpDtl.getDefaultFlg());

				centerClassGrpDtlMasterInsertLogic.insert(mCenterClassGrpDtl, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

				// 結果判定
				if (0 < getErrorManager().size()) {
					return null;
				}
			}
		}

		// [#3347][Ver3.0] TODO残対応(UoM) - 荷姿マスタ登録関連処理削除 2018.01.15 honma Delete

		// 荷主センタマスタ
		List<MClientCenter> clientCenterList = centerRelatedCopyLogic.selectClientCenter(centerIdTo, clientIdTo);

		long clientCenterIdFrom = 0;
		long clientCenterIdTo = 0;

		if (clientCenterList.size() > 0) {
			clientCenterIdTo = clientCenterList.get(0).getClientCenterId();
		}

		clientCenterList = centerRelatedCopyLogic.selectClientCenter(centerIdFrom, clientIdFrom);

		for (MClientCenter clientCenter : clientCenterList) {
			clientCenterIdFrom = clientCenter.getClientCenterId();

			if (clientCenterIdTo == 0) {
				MClientCenter mClientCenter = new MClientCenter();
				mClientCenter.setClientId(clientIdTo);
				mClientCenter.setCenterId(centerIdTo);
				mClientCenter.setSystemDt(clientCenter.getSystemDt());

				clientCenterMasterInsertLogic.insert(mClientCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

				// 結果判定
				if (0 < getErrorManager().size()) {
					return null;
				}

				clientCenterIdTo = mClientCenter.getClientCenterId();
			}
		}

		// パラメータマスタ
		List<MParam> paramMasterList = centerRelatedCopyLogic.selectParam(clientCenterIdTo, false);

		if (paramMasterList.size() == 0) {

			paramMasterList = centerRelatedCopyLogic.selectParam(clientCenterIdFrom, false);

			for (MParam param : paramMasterList) {

				MParam mParam = new MParam();
				mParam.setClientCenterId(clientCenterIdTo);
				mParam.setStoreDtFlg(param.getStoreDtFlg());
				mParam.setStoreNoFlg(param.getStoreNoFlg());
				mParam.setMergeCls(param.getMergeCls());
				mParam.setTKeepingDays(param.getTKeepingDays());
				mParam.setHKeepingDays(param.getHKeepingDays());
				mParam.setDKeepingDays(param.getDKeepingDays());
				mParam.setOverStoreNumFlg(param.getOverStoreNumFlg());
				mParam.setPastStoreDtFlg(param.getPastStoreDtFlg());
				mParam.setUseHtShipFlg(param.getUseHtShipFlg());
				mParam.setAllocSortKey(param.getAllocSortKey());
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
				mParam.setRgReplenishUnitCls(param.getRgReplenishUnitCls());
				mParam.setEmReplenishUnitCls(param.getEmReplenishUnitCls());
				mParam.setEmReplenishAllocCls(param.getEmReplenishAllocCls());
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
				mParam.setPackingCalCls(param.getPackingCalCls());
				mParam.setPackingProcessCls(param.getPackingProcessCls());
				mParam.setProductPartPacking(param.getProductPartPacking());
				mParam.setMultiPicCls(param.getMultiPicCls());
				mParam.setBacketColNum(param.getBacketColNum());
				mParam.setBacketRowNum(param.getBacketRowNum());
				mParam.setCasePicFlg(param.getCasePicFlg());
				mParam.setProductLabelOutUnit(param.getProductLabelOutUnit());
				mParam.setResultAfterProductLabel(param.getResultAfterProductLabel());
				mParam.setProductLabelJanBarcode(param.getProductLabelJanBarcode());
				mParam.setProductLabelProdBarcode(param.getProductLabelProdBarcode());
				mParam.setProductLabelJanStartbit(param.getProductLabelJanStartbit());
				mParam.setProductLabelJanEndbit(param.getProductLabelJanEndbit());
				mParam.setProductLabelProdStartbit(param.getProductLabelProdStartbit());
				mParam.setProductLabelProdEndbit(param.getProductLabelProdEndbit());
				mParam.setBoxSelectSkip(param.getBoxSelectSkip());
				mParam.setAfterTagOutFlg(param.getAfterTagOutFlg());
				mParam.setTagDeliveryOutFlg(param.getTagDeliveryOutFlg());
				mParam.setHtCharReadFlg(param.getHtCharReadFlg());
				mParam.setHtLotInputType(param.getHtLotInputType());
				mParam.setHtSerialInputType(param.getHtSerialInputType());

				paramMasterInsertLogic.insert(mParam, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

				// 結果判定
				if (0 < getErrorManager().size()) {
					return null;
				}

			}
		}

		// オプションテーブル

		BClassDtlDtoMapper mapper = new BClassDtlDtoMapper();
		List<BClassDtl> bClassDtlList = mapper.mappingToEntityList(centerRelatedCopyDto.data.body);

		// チェック処理
		for (BClassDtl bClassDtl : bClassDtlList) {

			switch (bClassDtl.getClassDtlCd()) {

			case "MCenterCol":

				// センタ列マスタ
				List<MCenterCol> centerColDeleteList = centerRelatedCopyLogic.selectCenterCol(centerIdTo, true);
				for (MCenterCol centerCol : centerColDeleteList) {
					centerColMasterDeleteLogic.delete(centerCol, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}
				}

				List<MCenterCol> centerColInsertList = centerRelatedCopyLogic.selectCenterCol(centerIdFrom, false);

				for (MCenterCol centerCol : centerColInsertList) {

					MCenterCol mCenterCol = new MCenterCol();
					mCenterCol.setCenterId(centerIdTo);
					mCenterCol.setColId(centerCol.getColId());
					mCenterCol.setDictId(centerCol.getDictId());
					mCenterCol.setVisible(centerCol.getVisible());
					mCenterCol.setEditable(centerCol.getEditable());
					mCenterCol.setNecessary(centerCol.getNecessary());

					centerColMasterInsertLogic.insert(mCenterCol, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}

				}

			case "MCenterItem":

				// センタ項目マスタ
				List<MCenterItem> centerItemDeleteList = centerRelatedCopyLogic.selectCenterItem(centerIdTo, true);
				for (MCenterItem centerItem : centerItemDeleteList) {
					centerItemMasterDeleteLogic.delete(centerItem, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}
				}

				List<MCenterItem> centerItemInsertList = centerRelatedCopyLogic.selectCenterItem(centerIdFrom, false);

				for (MCenterItem centerItem : centerItemInsertList) {

					MCenterItem mCenterItem = new MCenterItem();
					mCenterItem.setCenterId(centerIdTo);
					mCenterItem.setItemId(centerItem.getItemId());
					mCenterItem.setDictId(centerItem.getDictId());
					mCenterItem.setVisible(centerItem.getVisible());
					mCenterItem.setEditable(centerItem.getEditable());
					mCenterItem.setNecessary(centerItem.getNecessary());

					centerItemMasterInsertLogic.insert(mCenterItem, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}

				}

			case "MCenterScreen":

				// センタ画面マスタ
				List<MCenterScreen> centerScreenDeleteList = centerRelatedCopyLogic.selectCenterScreen(centerIdTo, true);
				for (MCenterScreen centerScreen : centerScreenDeleteList) {
					centerScreenMasterDeleteLogic.delete(centerScreen, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}
				}

				List<MCenterScreen> centerScreenInsertList = centerRelatedCopyLogic.selectCenterScreen(centerIdFrom, false);

				for (MCenterScreen centerScreen : centerScreenInsertList) {

					MCenterScreen mCenterScreen = new MCenterScreen();
					mCenterScreen.setCenterId(centerIdTo);
					mCenterScreen.setScreenId(centerScreen.getScreenId());
					mCenterScreen.setDictId(centerScreen.getDictId());
					mCenterScreen.setVisible(centerScreen.getVisible());

					centerScreenMasterInsertLogic.insert(mCenterScreen, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}

				}

			case "MCarrierSlipSgw":

				// 佐川送り状マスタ
				List<MCarrierSlipSgw> carrierSlipSgwDeleteList = centerRelatedCopyLogic.selectCarrierSlipSgw(centerIdTo, true);
				for (MCarrierSlipSgw carrierSlipSgw : carrierSlipSgwDeleteList) {
					carrierSlipSgwMasterDeleteLogic.delete(carrierSlipSgw, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}
				}

				List<MCarrierSlipSgw> carrierSlipSgwInsertList = centerRelatedCopyLogic.selectCarrierSlipSgw(centerIdFrom, false);

				HashMap<Long, Long> mapCarrierSlipSgwId = new HashMap<Long, Long>();

				for (MCarrierSlipSgw carrierSlipSgw : carrierSlipSgwInsertList) {
					long carrierSlipSgwIdFrom = carrierSlipSgw.getCarrierSlipSgwId();

					MCarrierSlipSgw mCarrierSlipSgw = new MCarrierSlipSgw();
					mCarrierSlipSgw.setCenterId(centerIdTo);
					mCarrierSlipSgw.setTagType(carrierSlipSgw.getTagType());
					mCarrierSlipSgw.setTagNm(carrierSlipSgw.getTagNm());
					mCarrierSlipSgw.setCharacterCd(carrierSlipSgw.getCharacterCd());
					mCarrierSlipSgw.setSlipCustomerCd(carrierSlipSgw.getSlipCustomerCd());
					mCarrierSlipSgw.setWebApiRequestUrl(carrierSlipSgw.getWebApiRequestUrl());
					mCarrierSlipSgw.setCustomerId(carrierSlipSgw.getCustomerId());
					mCarrierSlipSgw.setLoginPassword(carrierSlipSgw.getLoginPassword());
					mCarrierSlipSgw.setDeptConsignorNm(carrierSlipSgw.getDeptConsignorNm());
					mCarrierSlipSgw.setConsignorTelNo(carrierSlipSgw.getConsignorTelNo());
					mCarrierSlipSgw.setSlipClientTelNo(carrierSlipSgw.getSlipClientTelNo());
					mCarrierSlipSgw.setSlipClientZipCd(carrierSlipSgw.getSlipClientZipCd());
					mCarrierSlipSgw.setSlipClientAddress1(carrierSlipSgw.getSlipClientAddress1());
					mCarrierSlipSgw.setSlipClientAddress2(carrierSlipSgw.getSlipClientAddress2());
					mCarrierSlipSgw.setSlipClientNm1(carrierSlipSgw.getSlipClientNm1());
					mCarrierSlipSgw.setSlipClientNm2(carrierSlipSgw.getSlipClientNm2());
					mCarrierSlipSgw.setSlipShapeCd(carrierSlipSgw.getSlipShapeCd());
					mCarrierSlipSgw.setSlipItemNm1(carrierSlipSgw.getSlipItemNm1());
					mCarrierSlipSgw.setSlipItemNm2(carrierSlipSgw.getSlipItemNm2());
					mCarrierSlipSgw.setSlipItemNm3(carrierSlipSgw.getSlipItemNm3());
					mCarrierSlipSgw.setSlipItemNm4(carrierSlipSgw.getSlipItemNm4());
					mCarrierSlipSgw.setSlipItemNm5(carrierSlipSgw.getSlipItemNm5());
					mCarrierSlipSgw.setTransportTypeSpeed(carrierSlipSgw.getTransportTypeSpeed());
					mCarrierSlipSgw.setTransportTypeItem(carrierSlipSgw.getTransportTypeItem());
					mCarrierSlipSgw.setSettlementType(carrierSlipSgw.getSettlementType());
					mCarrierSlipSgw.setSealType1(carrierSlipSgw.getSealType1());
					mCarrierSlipSgw.setSealType2(carrierSlipSgw.getSealType2());
					mCarrierSlipSgw.setSealType3(carrierSlipSgw.getSealType3());
					mCarrierSlipSgw.setCodCls(carrierSlipSgw.getCodCls());
					mCarrierSlipSgw.setSendCd(carrierSlipSgw.getSendCd());
					mCarrierSlipSgw.setApiOkuriCode(carrierSlipSgw.getApiOkuriCode());
					mCarrierSlipSgw.setApiBinsyuCode(carrierSlipSgw.getApiBinsyuCode());
					mCarrierSlipSgw.setApiDaibikiFlg(carrierSlipSgw.getApiDaibikiFlg());
					mCarrierSlipSgw.setApiDaibikiType(carrierSlipSgw.getApiDaibikiType());
					mCarrierSlipSgw.setApiWeightCd1(carrierSlipSgw.getApiWeightCd1());
					mCarrierSlipSgw.setApiWeightCd2(carrierSlipSgw.getApiWeightCd2());
					mCarrierSlipSgw.setApiEidomeFlg(carrierSlipSgw.getApiEidomeFlg());

					carrierSlipSgwMasterInsertLogic.insert(mCarrierSlipSgw, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}

					long carrierSlipSgwtoId = mCarrierSlipSgw.getCarrierSlipSgwId();

					if (!mapCarrierSlipSgwId.containsKey(carrierSlipSgwIdFrom)) {
						mapCarrierSlipSgwId.put(carrierSlipSgwIdFrom, carrierSlipSgwtoId);
					}
				}

			case "MCarrierSlipYmt":

				// ヤマト送り状マスタ
				List<MCarrierSlipYmt> carrierSlipYmtDeleteList = centerRelatedCopyLogic.selectCarrierSlipYmt(centerIdTo, true);
				for (MCarrierSlipYmt carrierSlipYmt : carrierSlipYmtDeleteList) {
					carrierSlipYmtMasterDeleteLogic.delete(carrierSlipYmt, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}
				}

				List<MCarrierSlipYmt> carrierSlipYmtInsertList = centerRelatedCopyLogic.selectCarrierSlipYmt(centerIdFrom, false);

				HashMap<Long, Long> mapCarrierSlipYmtId = new HashMap<Long, Long>();

				for (MCarrierSlipYmt carrierSlipYmt : carrierSlipYmtInsertList) {
					long carrierSlipYmtIdFrom = carrierSlipYmt.getCarrierSlipYmtId();

					MCarrierSlipYmt mCarrierSlipYmt = new MCarrierSlipYmt();
					mCarrierSlipYmt.setCenterId(centerIdTo);
					mCarrierSlipYmt.setTagType(carrierSlipYmt.getTagType());
					mCarrierSlipYmt.setTagNm(carrierSlipYmt.getTagNm());
					mCarrierSlipYmt.setCharacterCd(carrierSlipYmt.getCharacterCd());
					mCarrierSlipYmt.setSlipType(carrierSlipYmt.getSlipType());
					mCarrierSlipYmt.setCoolCls(carrierSlipYmt.getCoolCls());
					mCarrierSlipYmt.setHonorific(carrierSlipYmt.getHonorific());
					mCarrierSlipYmt.setPackingShowFlg(carrierSlipYmt.getPackingShowFlg());
					mCarrierSlipYmt.setSlipClientTelNo(carrierSlipYmt.getSlipClientTelNo());
					mCarrierSlipYmt.setSlipClientZipCd(carrierSlipYmt.getSlipClientZipCd());
					mCarrierSlipYmt.setSlipClientAddress1(carrierSlipYmt.getSlipClientAddress1());
					mCarrierSlipYmt.setSlipClientAddress2(carrierSlipYmt.getSlipClientAddress2());
					mCarrierSlipYmt.setSlipClientAddress3(carrierSlipYmt.getSlipClientAddress3());
					mCarrierSlipYmt.setSlipClientAddress4(carrierSlipYmt.getSlipClientAddress4());
					mCarrierSlipYmt.setSlipClientNm(carrierSlipYmt.getSlipClientNm());
					mCarrierSlipYmt.setSlipItemCd1(carrierSlipYmt.getSlipItemCd1());
					mCarrierSlipYmt.setSlipItemNm1(carrierSlipYmt.getSlipItemNm1());
					mCarrierSlipYmt.setSlipItemCd2(carrierSlipYmt.getSlipItemCd2());
					mCarrierSlipYmt.setSlipItemNm2(carrierSlipYmt.getSlipItemNm2());
					mCarrierSlipYmt.setFreightHandling1(carrierSlipYmt.getFreightHandling1());
					mCarrierSlipYmt.setFreightHandling2(carrierSlipYmt.getFreightHandling2());
					mCarrierSlipYmt.setArticle(carrierSlipYmt.getArticle());
					mCarrierSlipYmt.setBillingCustomerCd(carrierSlipYmt.getBillingCustomerCd());
					mCarrierSlipYmt.setFareNo(carrierSlipYmt.getFareNo());
					mCarrierSlipYmt.setSendCd(carrierSlipYmt.getSendCd());

					carrierSlipYmtMasterInsertLogic.insert(mCarrierSlipYmt, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}

					long carrierSlipYmtIdTo = mCarrierSlipYmt.getCarrierSlipYmtId();

					if (!mapCarrierSlipYmtId.containsKey(carrierSlipYmtIdFrom)) {
						mapCarrierSlipYmtId.put(carrierSlipYmtIdFrom, carrierSlipYmtIdTo);
					}
				}

			case "MCarrierSlipYupk":

				// ゆうパック送り状マスタ
				List<MCarrierSlipYupk> carrierSlipYupkDeleteList = centerRelatedCopyLogic.selectCarrierSlipYupk(centerIdTo, true);
				for (MCarrierSlipYupk carrierSlipYupk : carrierSlipYupkDeleteList) {
					carrierSlipYupkMasterDeleteLogic.delete(carrierSlipYupk, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));
					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}
				}

				List<MCarrierSlipYupk> carrierSlipYupkInsertList = centerRelatedCopyLogic.selectCarrierSlipYupk(centerIdFrom, false);

				HashMap<Long, Long> mapCarrierSlipYupkId = new HashMap<Long, Long>();

				for (MCarrierSlipYupk carrierSlipYupk : carrierSlipYupkInsertList) {
					long carrierSlipYupkIdFrom = carrierSlipYupk.getCarrierSlipYupkId();

					MCarrierSlipYupk mCarrierSlipYupk = new MCarrierSlipYupk();
					mCarrierSlipYupk.setCenterId(centerIdTo);
					mCarrierSlipYupk.setTagType(carrierSlipYupk.getTagType());
					mCarrierSlipYupk.setTagNm(carrierSlipYupk.getTagNm());
					mCarrierSlipYupk.setCharacterCd(carrierSlipYupk.getCharacterCd());
					mCarrierSlipYupk.setPostType(carrierSlipYupk.getPostType());
					mCarrierSlipYupk.setCoolType(carrierSlipYupk.getCoolType());
					mCarrierSlipYupk.setCodType(carrierSlipYupk.getCodType());
					mCarrierSlipYupk.setCarrierType(carrierSlipYupk.getCarrierType());
					mCarrierSlipYupk.setSlipClientZipCd(carrierSlipYupk.getSlipClientZipCd());
					mCarrierSlipYupk.setSlipClientAddress1(carrierSlipYupk.getSlipClientAddress1());
					mCarrierSlipYupk.setSlipClientAddress2(carrierSlipYupk.getSlipClientAddress2());
					mCarrierSlipYupk.setSlipClientAddress3(carrierSlipYupk.getSlipClientAddress3());
					mCarrierSlipYupk.setSlipClientNm1(carrierSlipYupk.getSlipClientNm1());
					mCarrierSlipYupk.setSlipClientTelNo(carrierSlipYupk.getSlipClientTelNo());
					mCarrierSlipYupk.setSlipClientMail(carrierSlipYupk.getSlipClientMail());
					mCarrierSlipYupk.setNoUpsideDownCls(carrierSlipYupk.getNoUpsideDownCls());
					mCarrierSlipYupk.setNoStockCls(carrierSlipYupk.getNoStockCls());
					mCarrierSlipYupk.setSlipProductSizeCls(carrierSlipYupk.getSlipProductSizeCls());
					mCarrierSlipYupk.setSlipProductNo(carrierSlipYupk.getSlipProductNo());
					mCarrierSlipYupk.setSlipItemNm(carrierSlipYupk.getSlipItemNm());
					mCarrierSlipYupk.setShipReserveDataMark(carrierSlipYupk.getShipReserveDataMark());
					mCarrierSlipYupk.setDeliCertPreYears(carrierSlipYupk.getDeliCertPreYears());
					mCarrierSlipYupk.setSendNm(carrierSlipYupk.getSendNm());
					mCarrierSlipYupk.setProductTypeCode(carrierSlipYupk.getProductTypeCode());
					mCarrierSlipYupk.setPostBizCardCustomerNo(carrierSlipYupk.getPostBizCardCustomerNo());
					mCarrierSlipYupk.setShippingCompanyCode(carrierSlipYupk.getShippingCompanyCode());
					mCarrierSlipYupk.setShipmentCode(carrierSlipYupk.getShipmentCode());

					carrierSlipYupkMasterInsertLogic.insert(mCarrierSlipYupk, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

					// 結果判定
					if (0 < getErrorManager().size()) {
						return null;
					}

					long carrierSlipYupkIdTo = mCarrierSlipYupk.getCarrierSlipYupkId();

					if (!mapCarrierSlipYupkId.containsKey(carrierSlipYupkIdFrom)) {
						mapCarrierSlipYupkId.put(carrierSlipYupkIdFrom, carrierSlipYupkIdTo);
					}
				}
			}
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);

		centerRelatedCopyDto.data.mCenterTo = centerMapper.mappingToDto(mCenterTo);

		return centerRelatedCopyDto;
	}

	/**
	 * <h2>チェック処理。</h2>
	 *  新規登録データのチェックを行う。
	 *・センタコードで重複エラー用メッセージ
	 *・荷主マスタ存在チェックエラー用メッセージ
	 * @param mCenterFrom センタマスタ(From)
	 * @param mClientFrom パラメータマスタ(From)
	 * @param mCenterTo センタマスタ(To)
	 * @param mClientTo 荷主マスタ(To)
	 * @param errSts ErrorStatus
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupData check(MCenter mCenterFrom, MClient mClientFrom, MCenter mCenterTo, MClient mClientTo, ErrorStatus errSts) {

		boolean isFromToError = false;

		// センタCDFromToチェック
		if (mCenterFrom.getCenterCd().equals(mCenterTo.getCenterCd())) {
			isFromToError = true;
		}

		// 結果の設定
		ResultSetupData resultStatus;
		if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else if (isFromToError) {
			resultStatus = ResultSetupData.CENTER_FROM_TO_ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		return resultStatus;
	}

}