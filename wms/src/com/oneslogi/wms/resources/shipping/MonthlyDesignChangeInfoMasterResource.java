package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlMonthlyDesignChangeInfoMasterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MMfmonthchg;
import com.oneslogi.base.dbflute.exentity.customize.SqlMonthlyDesignChangeInfoMaster;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.shipping.MonthlyDesignChangeInfoMasterDto;
import com.oneslogi.wms.dto.shipping.MonthlyDesignChangeInfoMasterDto.MonthlyDesignChangeInfoMasterLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.shipping.MonthlyDesignChangeInfoMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;


/**
 * 月替り・デザイン変更情報マスタメンテナンス画面のリソースクラス。
 */
@Path("/shipping/monthlyDesignChangeInfoMaster")
public class MonthlyDesignChangeInfoMasterResource extends AbstractWmsResource {
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
		 * 一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 月替り・デ変情報マスタ登録異常
		 */
		protected static final int MFMONTHCHG_MASTER_INSERT_FAILED = 3;
		/**
		 * 月替り・デ変情報マスタ更新異常
		 */
		protected static final int MFMONTHCHG_MASTER_UPDATE_FAILED = 4;
		/**
		 * 月替り・デ変情報マスタデータチェック異常
		 */
		protected static final int MFMONTHCHG_MASTER_CHECK_FAILED = 6;
		/**
		 * 月替り・デ変情報マスタデータチェック異常
		 */
		protected static final int MFMONTHCHG_MASTER_REGISTER_ERROR = 7;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private MonthlyDesignChangeInfoMasterSelectLogic monthlyDesignChangeInfoMasterSelectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;
	@Inject
	private ClientCenterLogic clientcenterLogic;
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return MonthlyDesignChangeInfoMasterDto 月替り・デザイン変更情報マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public MonthlyDesignChangeInfoMasterDto init() {
		MonthlyDesignChangeInfoMasterDto dto = new MonthlyDesignChangeInfoMasterDto();

		return dto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・月替り・デザイン変更情報マスタDTOをキーに月替り・デザイン変更情報マスタデータ取り出し
	 * </pre>
	 * @param dto 月替り・デザイン変更情報マスタ画面用DTO
	 * @return MonthlyDesignChangeInfoMasterDto 月替り・デザイン変更情報マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public MonthlyDesignChangeInfoMasterDto search(MonthlyDesignChangeInfoMasterDto dto) {

		MonthlyDesignChangeInfoMasterLogicSearchConditionDto cond = dto.data.searchCondition;

		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		monthlyDesignChangeInfoMasterSelectLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.NOT_FOUND_DATA));
		//エラー有の場合は終了
		if(getErrorManager().size() > 0) {
			//処理中止
			return null;
		}

		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlMonthlyDesignChangeInfoMaster> sqlMonthlyDesignChangeInfoMasterList = monthlyDesignChangeInfoMasterSelectLogic.getMonthlyDesignChangeInfoMasterListSelect(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		///////////////////////////////////////////
		// EntityToDtoマッピング SQL実行型から、画面表示ができる型に変換。
		///////////////////////////////////////////
		SqlMonthlyDesignChangeInfoMasterDtoMapper sqlMonthlyDesignChangeInfoMasterMapper = new SqlMonthlyDesignChangeInfoMasterDtoMapper();
		dto.data.resultList = sqlMonthlyDesignChangeInfoMasterMapper.mappingToDtoList(sqlMonthlyDesignChangeInfoMasterList);

		return dto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・センタCD存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param boxMasterDto 荷材マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */

	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(MonthlyDesignChangeInfoMasterDto dto, ErrorStatus errSts) {

//		// Entity変換 DBテーブルのDTO表→DBテーブルの行
//		SqlMonthlyDesignChangeInfoMasterDtoMapper mapper = new SqlMonthlyDesignChangeInfoMasterDtoMapper();
//		List<SqlMonthlyDesignChangeInfoMaster> sqlMonthlyDesignChangeInfoMasterList = mapper.mappingToEntityList(dto.data.resultList);
//
//		// チェック処理
//		List<MMfmonthchg> mMfmonthchgList = null;
//		//boxMasterSelectLogic.inputCheckAndMapping2(sqlBoxMasterList, mBoxList, mBoxSubList);
//		if (getErrorManager().size() > 0) {
//			return null;
//		}

		MonthlyDesignChangeInfoMasterLogicSearchConditionDto cond = dto.data.searchCondition;

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(cond.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.NOT_FOUND_DATA));
		if(getErrorManager().size() > 0) {
			return null;
		}

//		if (mCenter == null) {
//			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
//			return null;
//		}
//		cond.setCenterId(mCenter.getCenterId());

		// 荷主ID取得
		// マスタ取得
        MClient mClient = new MClient();
		mClient.setClientCd(cond.getClientCd());
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.NOT_FOUND_DATA));
		if(getErrorManager().size() > 0) {
			return null;
		}
//		if (mClient == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
//			return null;
//		}
//		cond.setClientId(mClient.getClientId());

		//同一の拠点CD,銘柄CD,補充先が月替りデ変マスタに登録されている場合
		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		boolean checkList = monthlyDesignChangeInfoMasterSelectLogic.checkInsert(dto.data , errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}





		// 登録確認メッセージ設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}


	/**
	 * <h2>月替り・デザイン変更情報マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに月替り・デザイン変更情報マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックは結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param boxMasterDto 梱包箱情報マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */

	@POST
	@Path("/register")
	public StatusDto register(MonthlyDesignChangeInfoMasterDto dto) {

		// Entity変換 DBテーブルのDTO表→DBテーブルの行   <既存行>
		SqlMonthlyDesignChangeInfoMasterDtoMapper mapper = new SqlMonthlyDesignChangeInfoMasterDtoMapper();
		List<SqlMonthlyDesignChangeInfoMaster> sqlMonthlyDesignChangeInfoMasterResultList = mapper.mappingToEntityList(dto.data.resultList);
		MonthlyDesignChangeInfoMasterLogicSearchConditionDto cond = dto.data.searchCondition;
		// 荷主ID取得
		// マスタ取得
		MClient mClient = new MClient();
		mClient.setClientCd(cond.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(null	, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(cond.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(null , WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		///////////////////////////
		// 仕分状況チェック
		///////////////////////////
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mClient.getClientId());
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter = clientcenterLogic.getUkEntity(mClientCenter);
//		String systemDt = csrwhadmSelectLogic.gettingDate(mCenter.getCenterId(), mClient.getClientId(), null);
		// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}
		String systemDt = mClientCenter.getSystemDt();

		// inputCheckAndMapping
		List<MMfmonthchg> mMfmonthchgList = new ArrayList<MMfmonthchg>();
		monthlyDesignChangeInfoMasterSelectLogic.inputCheckAndMapping(sqlMonthlyDesignChangeInfoMasterResultList , mMfmonthchgList,mClient,systemDt,errRetSts(StatusCode.MFMONTHCHG_MASTER_CHECK_FAILED));


		if (0 < getErrorManager().size()) {
			return null;
		}


		// MMfmonthchg	登録 or 更新


		monthlyDesignChangeInfoMasterSelectLogic.registerMain(mMfmonthchgList,errRetSts(StatusCode.MFMONTHCHG_MASTER_REGISTER_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);


		// 結果の設定
		return null;
	}
}