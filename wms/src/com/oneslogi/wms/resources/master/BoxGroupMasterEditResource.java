package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MBoxGrpCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.dtomapper.MBoxGrpDtlDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MBoxGrpDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.base.dbflute.exentity.MBoxGrpDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.BoxGroupMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.BoxGroupMasterEditInsertLogic;
import com.oneslogi.wms.logic.master.BoxGroupMasterEditUpdateLogic;
import com.oneslogi.wms.logic.master.BoxGroupMasterSearchSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷材グループメンテナンス(編集)のリソースクラス。
 */
@Path("/master/boxGroupMasterEdit")
public class BoxGroupMasterEditResource extends AbstractWmsResource {

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
		 * 荷材グループメンテナンス(編集)データ取得異常
		 */
		protected static final int M_BOX_GRP_EDIT_SELECT_FAILED = 2;
		/**
		 * 登録異常
		 */
		protected static final int M_BOX_GRP_EDIT_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int M_BOX_GRP_EDIT_UPDATE_FAILED = 4;
		/**
		 * 荷材グループCD存在チェック異常
		 */
		protected static final int BOX_EXIST_CHECK = 5;
		// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start
		/**
		 * パラメータマスタ使用中チェック異常
		 */
		protected static final int USE_PARAMETER_MASTER_ERR = 6;
		// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private BoxGroupMasterSearchSelectLogic boxGroupMasterSearchSelectLogic;
	@Inject
	private BoxGroupMasterEditInsertLogic boxGroupMasterEditInsertLogic;
	@Inject
	private BoxGroupMasterEditUpdateLogic boxGroupMasterEditUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	// ===== 使用テーブル =====
	@Inject
	private MBoxGrpBhv mBoxGrpBhv;
	// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start
	@Inject
	private MParamBhv mParamBhv;
	// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana End

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return boxGroupMasterEditDto 荷材グループメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public BoxGroupMasterEditDto initNew() {
		// 画面用DTO作成
		BoxGroupMasterEditDto boxGroupMasterEditDto = new BoxGroupMasterEditDto();

		return boxGroupMasterEditDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・荷材グループメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @param  setBoxGrpId 荷材グループID
	 * @return BoxGroupMasterEditDto 荷材グループメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public BoxGroupMasterEditDto initUpdate(@QueryParam("setBoxGrpId") Long setBoxGrpId) {
		BoxGroupMasterEditDto boxGroupMasterEditDto = new BoxGroupMasterEditDto();

		// エンティティ編集
		MBoxGrp mBoxGrp = new MBoxGrp();
		mBoxGrp.setBoxGrpId(setBoxGrpId);

		// 荷材グループメンテナンス(編集)データ取得
		MBoxGrp result = boxGroupMasterSearchSelectLogic.selectById(mBoxGrp, errRetSts(StatusCode.M_BOX_GRP_EDIT_SELECT_FAILED));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// Dto変換処理
		MBoxGrpDtoMapper mBoxGrpDtoMapper = new MBoxGrpDtoMapper();
		MBoxGrpDtlDtoMapper mBoxGrpDtlDtoMapper = new MBoxGrpDtlDtoMapper();

		// 荷材グループマスタ更新画面用DTOデータセット
		boxGroupMasterEditDto.data.head = mBoxGrpDtoMapper.mappingToDto(result);
		boxGroupMasterEditDto.data.body = mBoxGrpDtlDtoMapper.mappingToDtoList(result.getMBoxGrpDtlList());

		return boxGroupMasterEditDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param boxGroupMasterEditDto 荷材グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(BoxGroupMasterEditDto boxGroupMasterEditDto) {

		// 登録または更新チェック処理
		setupInputCheck(boxGroupMasterEditDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== 確認メッセージの設定 =====
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 * <pre>
	 *  【新規】
	 *  ・荷材グループCDの存在チェック
	 *
	 * </pre>
	 * @param boxGroupMasterEditDto 荷材グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupInputCheck(BoxGroupMasterEditDto boxGroupMasterEditDto) {

		// Entity変換
		MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper();
		MBoxGrp mBoxGrp = mapper.mappingToEntity(boxGroupMasterEditDto.data.head);

		int count = 0;

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mBoxGrp.getMBox().getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();


		// ===== 荷材グループ重複チェック =====
		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MBoxGrpCB mbgCB =mBoxGrpBhv.newConditionBean();
		mbgCB.query().setCenterId_Equal(centerId);
		mbgCB.query().setBoxGrpCd_Equal(mBoxGrp.getBoxGrpCd());

		// 検索実行
		count = mBoxGrpBhv.selectCount(mbgCB);
		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		if (mBoxGrp.getBoxGrpId() == null) {
			if (count > 0) {
				// 荷材グループCDが登録済みです。
				this.getErrorManager().add(this.errRetSts(StatusCode.BOX_EXIST_CHECK), WmsMessageConst.BOX_GRP_CD_CODE_DUPLICATE_ERROR);
				return null;
			}
		}

		// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start

		if (mBoxGrp.getBoxGrpId() != null && mBoxGrp.isDelFlg$1()) {
			// 更新登録 かつ 削除

			// ===== 梱包荷材グループ使用中チェック =====
			if (useParam(mBoxGrp.getBoxGrpId())) {
				getErrorManager().add(errRetSts(StatusCode.USE_PARAMETER_MASTER_ERR), WmsMessageConst.BOX_GRP_CANNOT_DELETE_USE_PARAMETER_MASTER_ERROR);
				return null;
			}
		}

		// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana End

		return null;
	}

	// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start

	/**
	 * パラメータマスタ使用中チェック
	 * @param boxGrpId 荷材グループID
	 * @return true : 使用中
	 */
	private boolean useParam(long boxGrpId) {

		MParamCB cb = mParamBhv.newConditionBean();
		cb.checkInvalidQuery();
		cb.query().setPackingBoxGroupId_Equal(boxGrpId);

		int count = mParamBhv.selectCount(cb);
		if (0 < count) {
			return true;
		} else {
			return false;
		}
	}

	// [新ｿﾘV2-001] 削除する場合にパラメータマスタに登録されていないことのチェックを追加 2016.07.06 kawana End

	/**
	 * <h2>登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに荷材グループマスタと荷材グループ明細マスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param boxGroupMasterEditDto 荷材グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(BoxGroupMasterEditDto boxGroupMasterEditDto) {

		// Entity変換
		MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper();
		MBoxGrpDtlDtoMapper bodyMapper = new MBoxGrpDtlDtoMapper();
		MBoxGrp mBoxGrp = mapper.mappingToEntity(boxGroupMasterEditDto.data.head);
		List<MBoxGrpDtl> mBoxGrpDtlList = bodyMapper.mappingToEntityList(boxGroupMasterEditDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(boxGroupMasterEditDto);

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}


		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mBoxGrp.getMBox().getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();
		mBoxGrp.setCenterId(centerId);

		// 荷材グループマスタと荷材グループ明細マスタ登録
		boxGroupMasterEditInsertLogic.insert(mBoxGrp, mBoxGrpDtlList, errRetSts(StatusCode.M_BOX_GRP_EDIT_INSERT_FAILED));

		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに荷材グループマスタを更新し。
	 * 荷材グループ明細マスタを更新または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param boxGroupMasterEditDto 荷材グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(BoxGroupMasterEditDto boxGroupMasterEditDto) {

		// Entity変換
	    MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper();
		MBoxGrpDtlDtoMapper bodyMapper = new MBoxGrpDtlDtoMapper();
		MBoxGrp mBoxGrp = mapper.mappingToEntity(boxGroupMasterEditDto.data.head);
		List<MBoxGrpDtl> mBoxGrpDtlList = bodyMapper.mappingToEntityList(boxGroupMasterEditDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(boxGroupMasterEditDto);
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mBoxGrp.getMBox().getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();
		mBoxGrp.setCenterId(centerId);

		// 荷材グループメンテナンス(編集)更新
		boxGroupMasterEditUpdateLogic.update(mBoxGrp, mBoxGrpDtlList, errRetSts(StatusCode.M_BOX_GRP_EDIT_UPDATE_FAILED));

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}