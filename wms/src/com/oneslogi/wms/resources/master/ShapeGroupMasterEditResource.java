package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpCB;
import com.oneslogi.base.dbflute.dtomapper.MShapeGrpDtlDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MShapeGrpDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MShapeBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.dto.master.ShapeGroupMasterEditDto;
import com.oneslogi.wms.logic.master.ShapeGroupMasterEditInsertLogic;
import com.oneslogi.wms.logic.master.ShapeGroupMasterEditUpdateLogic;
import com.oneslogi.wms.logic.master.ShapeGroupMasterSearchSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷姿グループメンテナンス(編集)のリソースクラス。
 */
@Path("/master/ShapeGroupMasterEdit")
public class ShapeGroupMasterEditResource extends AbstractWmsResource {

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
		 * 荷姿グループメンテナンス(編集)データ取得異常
		 */
		protected static final int M_SHAPE_GRP_EDIT_SELECT_FAILED = 2;
		/**
		 * 登録異常
		 */
		protected static final int M_SHAPE_GRP_EDIT_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int M_SHAPE_GRP_EDIT_UPDATE_FAILED = 4;
		/**
		 * 荷姿グループに紐付く商品の在庫存在チェック異常
		 */
		protected static final int STOCK_EXIST_CHECK = 5;
		/**
		 * パラメータマスタ使用中チェック異常
		 */
		protected static final int USE_PARAMETER_MASTER_ERR = 6;
		/**
		 * 荷姿グループに紐付く商品存在チェック異常
		 */
		protected static final int SHAPEGRP_CANNOT_DELETE_USED_BY_PRODUCT = 7;
		/**
		 * 荷姿グループ明細に紐付く商品変更チェック異常
		 */
		protected static final int SHAPEGRPDTL_CANNOT_UPDATE_USED_BY_PRODUCT = 8;
		/**
		 * 荷姿グループ明細に紐付く商品存在チェック異常
		 */
		protected static final int SHAPEGRPDTL_CANNOT_DELETE_USED_BY_PRODUCT = 9;
		/**
		 * 荷姿グループ存在チェック異常
		 */
		protected static final int SHAPECD_EXIST_CHECK = 10;
		/**
		 * 荷姿マスタ存在チェック異常
		 */
		protected static final int SHAPE_MASTER_EXIST_CHECK = 11;
		/**
		 * 荷姿グループ明細に紐付く商品追加チェック異常
		 */
		protected static final int SHAPEGRPDTL_CANNOT_INSERT_USED_BY_PRODUCT = 12;
		/**
		 * 荷姿グループ明細に紐付く商品変更チェック異常
		 */
		protected static final int SHAPEGRPDTL_CANNOT_CHANGE_USED_BY_PRODUCT = 13;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShapeGroupMasterSearchSelectLogic shapeGroupMasterSearchSelectLogic;
	@Inject
	private ShapeGroupMasterEditInsertLogic shapeGroupMasterEditInsertLogic;
	@Inject
	private ShapeGroupMasterEditUpdateLogic shapeGroupMasterEditUpdateLogic;

	// ===== 使用テーブル =====
	@Inject
	private MShapeBhv mShapeBhv;
	@Inject
	private MShapeGrpBhv mShapeGrpBhv;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return shapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ShapeGroupMasterEditDto initNew() {
		// 画面用DTO作成
		ShapeGroupMasterEditDto shapeGroupMasterEditDto = new ShapeGroupMasterEditDto();
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add Start
		shapeGroupMasterEditDto.data.maxShapeCount = getPropertyIntValue(WmsPropertyConst.MAX_SHAPE_COUNT);
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add End

		return shapeGroupMasterEditDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・荷姿グループメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @param  setShapeGrpId 荷姿グループID
	 * @return ShapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public ShapeGroupMasterEditDto initUpdate(@QueryParam("setShapeGrpId") Long setShapeGrpId) {
		ShapeGroupMasterEditDto shapeGroupMasterEditDto = new ShapeGroupMasterEditDto();

		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add Start
		shapeGroupMasterEditDto.data.maxShapeCount = getPropertyIntValue(WmsPropertyConst.MAX_SHAPE_COUNT);
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add End

		// エンティティ編集
		MShapeGrp mShapeGrp = new MShapeGrp();
		mShapeGrp.setShapeGrpId(setShapeGrpId);

		// 荷姿グループメンテナンス(編集)データ取得
		MShapeGrp result = shapeGroupMasterSearchSelectLogic.selectById(mShapeGrp, errRetSts(StatusCode.M_SHAPE_GRP_EDIT_SELECT_FAILED));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// Dto変換処理
		MShapeGrpDtoMapper mShapeGrpDtoMapper = new MShapeGrpDtoMapper();
		MShapeGrpDtlDtoMapper mShapeGrpDtlDtoMapper = new MShapeGrpDtlDtoMapper();

		// 荷姿グループマスタ更新画面用DTOデータセット
		shapeGroupMasterEditDto.data.head = mShapeGrpDtoMapper.mappingToDto(result);
		shapeGroupMasterEditDto.data.body = mShapeGrpDtlDtoMapper.mappingToDtoList(result.getMShapeGrpDtlList());

		return shapeGroupMasterEditDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param shapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ShapeGroupMasterEditDto shapeGroupMasterEditDto) {

		// 登録または更新チェック処理
		setupInputCheck(shapeGroupMasterEditDto,"0");

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
	 *  ・荷姿グループCDの存在チェック
	 *
	 * </pre>
	 * @param shapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupInputCheck(ShapeGroupMasterEditDto shapeGroupMasterEditDto,String useFlg) {

		// Entity変換
		MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper();
		MShapeGrp mShapeGrp = mapper.mappingToEntity(shapeGroupMasterEditDto.data.head);
		MShapeGrpDtlDtoMapper mapperDtl = new MShapeGrpDtlDtoMapper();

		int count = 0;
		if (mShapeGrp.getShapeGrpId() != null) {
        // =====荷姿グループに紐付く商品存在チェック=====
		if (mShapeGrp.isDelFlg$1()) {
			if (shapeGroupMasterSearchSelectLogic.selectMProductCount(mShapeGrp).equals("2")) {
				// 荷姿グループに紐付く商品が存在するため削除できません。
				this.getErrorManager().add(this.errRetSts(StatusCode.SHAPEGRP_CANNOT_DELETE_USED_BY_PRODUCT), "shapeGroupCannotDeleteUsedByProductError");
				return null;
			}
		} else {

			// =====荷姿グループ明細に紐付く商品存在チェック=====
			for (int i = 0; i < shapeGroupMasterEditDto.data.body.size(); i++) {
				MShapeGrpDtl mShapeGrpDtl = mapperDtl.mappingToEntity(shapeGroupMasterEditDto.data.body.get(i));

				if (mShapeGrp.getShapeGrpId() != null && mShapeGrpDtl.isDelFlg$1()) {
					if (shapeGroupMasterSearchSelectLogic.selectMProductCount(mShapeGrp).equals("2")) {
						if (useFlg.equals("0")){
							// 荷姿グループ明細に紐付く商品が存在するため削除できません。
							this.getErrorManager().add(this.errRetSts(StatusCode.SHAPEGRPDTL_CANNOT_DELETE_USED_BY_PRODUCT), "shapeGroupDtlCannotDeletetUsedByProductError");
							return null;
						}
					}
				} else {
					// ===== 荷姿荷姿マスタ存在チェック =====
					// 削除フラグの自動検索有効化
					this.setBehaviorAutoDelFlg(true);
					MShapeCB mSCB =mShapeBhv.newConditionBean();
					mSCB.query().setShapeCd_Equal(mShapeGrpDtl.getMShape().getShapeCd());

					// 検索実行
					count = mShapeBhv.selectCount(mSCB);
					if (count == 0) {
						// 荷姿CDが荷姿マスタに存在しません。
						this.getErrorManager().add(this.errRetSts(StatusCode.SHAPE_MASTER_EXIST_CHECK), String.valueOf(i));
						return null;
					}
					if (mShapeGrpDtl.getShapeGrpDtlId() == null) {
						//新規データ（行追加）が存在する場合
						if (mShapeGrp.getShapeGrpId() != null && shapeGroupMasterSearchSelectLogic.selectMProductCount(mShapeGrp).equals("2")) {
							// 荷姿グループに紐付く商品が存在するため、荷姿は追加できません。
							this.getErrorManager().add(this.errRetSts(StatusCode.SHAPEGRPDTL_CANNOT_INSERT_USED_BY_PRODUCT), "shapeGroupDtlCannotInsertUsedByProductError");
							return null;
						}
					} else {
						//荷姿ソート順が変更する場合
						if (mShapeGrp.getShapeGrpId() != null && shapeGroupMasterSearchSelectLogic.selectMShapeGrpDtlChange(mShapeGrp,mShapeGrpDtl).equals("1")) {
							// 荷姿グループに紐付く商品が存在するため、荷姿の親子関係は更新できません。
							this.getErrorManager().add(this.errRetSts(StatusCode.SHAPEGRPDTL_CANNOT_UPDATE_USED_BY_PRODUCT), "shapeGroupDtlCannotUpdateUsedByProductError");
							return null;
						}

					}
				}
			}
			for (int i = 0; i < shapeGroupMasterEditDto.data.body.size(); i++) {
				MShapeGrpDtl mShapeGrpDtl = mapperDtl.mappingToEntity(shapeGroupMasterEditDto.data.body.get(i));
				if (mShapeGrp.getShapeGrpId() != null && mShapeGrpDtl.isDelFlg$1()) {

				} else {
					if (mShapeGrpDtl.getShapeGrpDtlId() != null) {
						//荷姿と親荷姿の関係以外が更新の場合
						if (mShapeGrp.getShapeGrpId() != null && shapeGroupMasterSearchSelectLogic.selectMShapeGrpDtlChange(mShapeGrp,mShapeGrpDtl).equals("2")) {
							if (useFlg.equals("0")){
								// 荷姿グループに紐付く商品が存在します、荷姿は更新してよろしいですか？
								this.getWarnManager().add(this.warnRetSts(StatusCode.SHAPEGRPDTL_CANNOT_CHANGE_USED_BY_PRODUCT), "shapeGroupDtlCannotChangeUsedByProductError");
								return null;
							}
						}
					}
				}
			}
		}
		}

		// ===== 荷姿グループ重複チェック =====
		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MShapeGrpCB mbgCB =mShapeGrpBhv.newConditionBean();
		//[#3768][Ver3.0]荷主IDの取得先を変更 2018.02.16 miyabe upd Start
		mbgCB.query().setClientId_Equal(mShapeGrp.getMClient().getClientId());
		//[#3768][Ver3.0]荷主IDの取得先を変更 2018.02.16 miyabe upd End
		mbgCB.query().setShapeGrpCd_Equal(mShapeGrp.getShapeGrpCd());

		// 検索実行
		count = mShapeGrpBhv.selectCount(mbgCB);
		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		if (mShapeGrp.getShapeGrpId() == null) {
			if (count > 0) {
				// 荷姿グループCDが登録済みです。
				this.getErrorManager().add(this.errRetSts(StatusCode.SHAPECD_EXIST_CHECK), WmsMessageConst.SHAPE_GRP_CD_CODE_DUPLICATE_ERROR);
				return null;
			}
		}

		return null;
	}

	/**
	 * <h2>登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに荷姿グループマスタと荷姿グループ明細マスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param shapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ShapeGroupMasterEditDto shapeGroupMasterEditDto) {

		// Entity変換
		MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper();
		MShapeGrpDtlDtoMapper bodyMapper = new MShapeGrpDtlDtoMapper();
		MShapeGrp mShapeGrp = mapper.mappingToEntity(shapeGroupMasterEditDto.data.head);
		List<MShapeGrpDtl> mShapeGrpDtlList = bodyMapper.mappingToEntityList(shapeGroupMasterEditDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(shapeGroupMasterEditDto,"1");

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 荷姿グループマスタと荷姿グループ明細マスタ登録
		shapeGroupMasterEditInsertLogic.insert(mShapeGrp, mShapeGrpDtlList, errRetSts(StatusCode.M_SHAPE_GRP_EDIT_INSERT_FAILED));

		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに荷姿グループマスタを更新し。
	 * 荷姿グループ明細マスタを更新または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param shapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(ShapeGroupMasterEditDto shapeGroupMasterEditDto) {

		// Entity変換
	    MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper();
		MShapeGrpDtlDtoMapper bodyMapper = new MShapeGrpDtlDtoMapper();
		MShapeGrp mShapeGrp = mapper.mappingToEntity(shapeGroupMasterEditDto.data.head);
		List<MShapeGrpDtl> mShapeGrpDtlList = bodyMapper.mappingToEntityList(shapeGroupMasterEditDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(shapeGroupMasterEditDto,"1");
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// 荷姿グループメンテナンス(編集)更新
		shapeGroupMasterEditUpdateLogic.update(mShapeGrp, mShapeGrpDtlList, errRetSts(StatusCode.M_SHAPE_GRP_EDIT_UPDATE_FAILED));

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}