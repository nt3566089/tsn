	package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.dto.MMfwhxitemDto;
import com.oneslogi.base.dbflute.dtomapper.MMfwhxitemDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MMfwhxitem;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterProductControlMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CenterProductControlMasterEditSelectLogic;
import com.oneslogi.wms.logic.master.CenterProductControlMasterEditUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 特約店マスタメンテナンス(編集)画面のリソースクラス。
 */
@Path("/master/CenterProductControlMasterEdit")
public class CenterProductControlMasterEditResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int INSERT_PROCESS_NORMAL_END_INFORMATION = 0;
		protected static final int UPDATE_PROCESS_NORMAL_END_INFORMATION = 0;
		protected static final int SUCCESS = 0;

		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;

		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 2;

		/**
		 * 荷主CD未存在エラー
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 3;

		/**
		 * ユーザマスタ一覧データ取得異常
		 */
		protected static final int USER_SELECT_FAILED = 4;

		/**
		 * 該当データが存在しません。
		 */
		protected static final int DATA_NOT_FOUND_ERROR = 5;

		/**
		 * 既に登録されています。
		 */
		protected static final int ALREADAY_REGISTERED_CANNOT_REGISTER_ERROR = 6;

		/**
		 * 他のユーザに変更された可能性があります。内容を確認して下さい。
		 */
		protected static final int ENTITY_ALREADY_UPDATE_ERROR = 7;

		/**
		 * センタマスタに存在しません。
		 */
		public static final int CENTER_NOT_FOUND_ERROR = 8;

		/**
		 * 入力したロケーションはロケーションマスタに存在しません。/ ロケーションマスタに存在しません。
		 */
		public static final int LOCATION_NOT_FOUND_ERROR = 9;

		public static final int CUSTOMER_MASTER_INSERT_FAILED = 10;


	}

	// ===== 使用ロジッククラス =====

	@Inject
	private CenterProductControlMasterEditSelectLogic centerProductControlMasterEditSelectLogic;
	@Inject
	private CenterProductControlMasterEditUpdateLogic centerProductControlMasterEditUpdateLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private MLocationBhv mLocationBhv;


	/**
	 * <h2>初期処理（修正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return MStopListDto 拠点別銘柄制御マスタメンテナンス(編集)画面用DTO
	 * @param MfwhItemId  拠点別銘柄制御ID
	 */
	@GET
	@Path("/initUpdate")
	public CenterProductControlMasterEditDto initUpdate(@QueryParam("mfwhItemId") Long mfwhItemId ) {

		CenterProductControlMasterEditDto CenterProductControlMasterEditDto = new CenterProductControlMasterEditDto();

		//拠点別銘柄制御IDを条件に設定して検索実行
		MMfwhxitem condition = new MMfwhxitem();
		condition.setMfwhItemId(mfwhItemId);

		//リスト検索実行
		MMfwhxitem mfwhxitem =
				centerProductControlMasterEditSelectLogic.selectByEdit(condition, errRetSts(StatusCode.DATA_NOT_FOUND_ERROR));

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		if (getErrorManager().size() > 0) {
			// エラーあり
			return CenterProductControlMasterEditDto;
		}

		// ===== 画面用DTO作成 =====
		 MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper();
		 MMfwhxitemDto mmfwhxitemDto = mapper.mappingToDto(mfwhxitem);
		 CenterProductControlMasterEditDto.data.head = mmfwhxitemDto;//customerMasterEditDto

		return CenterProductControlMasterEditDto;
	}

	/**
	 * <h2>拠点別銘柄制御マスタ登録。</h2>
	 * <pre>
	 * データの登録処理。
	 * エラーがない場合は、データベースに拠点別銘柄制御マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param CenterProductControlMasterEditDto 拠点別銘柄制御マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CenterProductControlMasterEditDto dto, ErrorStatus errSts, @QueryParam("clientCd") String clientCd , @QueryParam("locationCd") String locationCd , MMfwhxitem header) {

		//Dto-Entity変換
		 MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper();
		 MMfwhxitem mMfwhxitem = mapper.mappingToEntity(dto.data.head);

		//センタID取得
		MCenter CenterCondition = new MCenter();
		CenterCondition.setCenterCd(mMfwhxitem.getMCenter().getCenterCd());
		MCenter center = centerLogic.getUkEntity(CenterCondition);
		if (center == null) {
			 getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			 return null;
		 }

		//荷主ID取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(mMfwhxitem.getMClient().getClientCd());
		MClient client = clientLogic.getUkEntity(clientCondition);
		if (client == null) {
			 getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			 return null;
		 }

		//ロケーションID取得
		 MLocationCB mLocationCb = mLocationBhv.newMyConditionBean();
	 	 mLocationCb.query().setLocationCd_Equal(mMfwhxitem.getSlotlocname());
	 	 mLocationCb.query().setDelFlg_Equal_$0();
	 	 MLocation mLocation = mLocationBhv.selectEntity(mLocationCb);
		 if (mLocation == null) {
			 getErrorManager().add(errRetSts(StatusCode.LOCATION_NOT_FOUND_ERROR), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			 return null;
		 }

		//ロケーションID取得
		 MLocationCB mPickLocationCb = mLocationBhv.newMyConditionBean();
		 mPickLocationCb.query().setLocationCd_Equal(mMfwhxitem.getPicklocname());
		 mPickLocationCb.query().setDelFlg_Equal_$0();
	 	 MLocation mPickLocation = mLocationBhv.selectEntity(mPickLocationCb);
		 if (mPickLocation == null) {
			 getErrorManager().add(errRetSts(StatusCode.LOCATION_NOT_FOUND_ERROR), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			 return null;
		 }

		// 登録実行
		 centerProductControlMasterEditUpdateLogic.update(mMfwhxitem, errRetSts(StatusCode.CUSTOMER_MASTER_INSERT_FAILED));

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}


}
