package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MSetParentCB;
import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.dtomapper.MSetParentDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MSetStructureDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MSetParentBhv;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSetParent;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.SetStructureEditDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.master.SetStructureEditInsertLogic;
import com.oneslogi.wms.logic.master.SetStructureEditUpdateLogic;
import com.oneslogi.wms.logic.master.SetStructureSearchSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * セット品構成マスタメンテナンス(編集)のリソースクラス。
 */
@Path("/master/setStructureEdit")
public class SetStructureEditResource extends AbstractWmsResource {

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
		 * セット品構成マスタメンテナンス(編集)データ取得異常
		 */
		protected static final int SET_STRUCTURE_EDIT_SELECT_FAILED = 2;
		/**
		 * 登録異常
		 */
		protected static final int SET_STRUCTURE_EDIT_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int SET_STRUCTURE_EDIT_UPDATE_FAILED = 4;
		/**
		 * 親商品存在チェック異常
		 */
		protected static final int PRODUCT_EXIST_CHECK = 5;
		/**
		 * 構造品存在チェック異常
		 */
		protected static final int PRODUCT_EXIST_STRUCTURE_CHECK = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private SetStructureSearchSelectLogic setStructureSearchSelectLogic;
	@Inject
	private SetStructureEditInsertLogic setStructureEditInsertLogic;
	@Inject
	private SetStructureEditUpdateLogic setStructureEditUpdateLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private ClientLogic clientLogic;
	// ===== 使用テーブル =====
	@Inject
	private MSetStructureBhv mSetStructureBhv;
	@Inject
	private MSetParentBhv mSetParentBhv;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return SetStructureEditDto セット品構成マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public SetStructureEditDto initNew() {
		// 画面用DTO作成
		SetStructureEditDto setStructureEditDto = new SetStructureEditDto();

		return setStructureEditDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・セット品構成マスタメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @param  setParentId 親ID
	 * @return SetStructureEditDto セット品構成マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public SetStructureEditDto initUpdate(@QueryParam("setParentId") Long setParentId) {
		SetStructureEditDto setStructureEditDto = new SetStructureEditDto();

		// エンティティ編集
		MSetParent mSetParent = new MSetParent();
		mSetParent.setSetParentId(setParentId);

		// セット品構成マスタメンテナンス(編集)データ取得
		MSetParent result = setStructureSearchSelectLogic.selectById(mSetParent, errRetSts(StatusCode.SET_STRUCTURE_EDIT_SELECT_FAILED));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// Dto変換処理
		MSetParentDtoMapper parentDtoMapper = new MSetParentDtoMapper();
		MSetStructureDtoMapper structureDtoMapper = new MSetStructureDtoMapper();

		// セット品構成マスタ更新画面用DTOデータセット
		setStructureEditDto.data.head = parentDtoMapper.mappingToDto(result);
		setStructureEditDto.data.body = structureDtoMapper.mappingToDtoList(result.getMSetStructureList());

		return setStructureEditDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param setStructureEditDto セット品構成マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(SetStructureEditDto setStructureEditDto) {

		// 登録または更新チェック処理
		setupInputCheck(setStructureEditDto);

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
	 *  ・親商品CDの存在チェック
	 *  ・親商品重複チェック
	 *  ・別の構造品に存在チェック
	 *  ・構成品CDの存在チェック
	 *  ・別の親商品に存在チェック
	 *  【修正】
	 *  ・在庫移動指示に存在チェック
	 *  ・構成品CDの存在チェック
	 *  ・構成品CD重複チェック
	 *  ・別の親商品に存在チェック
	 *
	 * </pre>
	 * @param setStructureEditDto セット品構成マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupInputCheck(SetStructureEditDto setStructureEditDto) {

		// Entity変換
		MSetParentDtoMapper mapper = new MSetParentDtoMapper();
		MSetStructureDtoMapper bodyMapper = new MSetStructureDtoMapper();
		MSetParent mSetParent = mapper.mappingToEntity(setStructureEditDto.data.head);
		List<MSetStructure> mSetStructureList = bodyMapper.mappingToEntityList(setStructureEditDto.data.body);
		int rowIndex = -1;
		int count = 0;

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(mSetParent.getMProduct().getMClient().getClientCd());
		long clientId = clientLogic.getUkEntity(mClient).getClientId();

		if (mSetParent.getSetParentId() == null) {
			// ===== 新規の場合 =====
			// ===== 親商品CDの存在チェック =====
			MProduct mProduct = new MProduct();
			mProduct.setClientId(clientId);
			mProduct.setProductCd(mSetParent.getMProduct().getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);
			if (mProduct == null) {
				// 商品マスタに存在しません。
				this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_CHECK),WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				return null;
			}
			//[#3568][Ver3.0]小数有無フラグが『0:小数を含まない』の場合エラーとする処理追加 2018.02.27 miyabe add Start
			// ===== 小数有無フラグチェック =====
			if (mProduct.getMShapeGrp().isDecimalExistFlg$1() && mProduct.isDelFlg$0()) {
				// 小数有無フラグが「1：小数を含む」の場合、セット品の構成品として登録できません。
				this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_CHECK),WmsMessageConst.SET_STRUCTURE_DECIMAL_EXIST_FLG_ERROR);
				return null;
			}
			//[#3568][Ver3.0]小数有無フラグが『0:小数を含まない』の場合エラーとする処理追加 2018.02.27 miyabe add End

			// ===== 親商品重複チェック =====
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);
			MSetParentCB mspCB = mSetParentBhv.newConditionBean();
			mspCB.query().setProductId_Equal(mProduct.getProductId());
			// 検索実行
			count = mSetParentBhv.selectCount(mspCB);
			// 削除フラグの自動検索有効化
			this.setBehaviorAutoDelFlg(true);
			if (count > 0) {
				// 親商品CDが登録済みです。
				this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_CHECK),WmsMessageConst.PARENT_PRODUCT_CODE_DUPLICATE_ERROR);
				return null;
			}

			// ===== 別の構造品に存在チェック =====
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);
			MSetStructureCB cb = mSetStructureBhv.newMyConditionBean();
			cb.query().setProductId_Equal(mProduct.getProductId());
			// 検索実行
			count = mSetStructureBhv.selectCount(cb);
			// 削除フラグの自動検索有効化
			this.setBehaviorAutoDelFlg(true);
			if (count > 0) {
				// 親商品が別の親商品の構成品に使用済みです。
				this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_CHECK),WmsMessageConst.PARENT_PRODUCT_CANNOT_INPUT_ANOTHER_STRUCTURE_PRODUCT_ERROR);
				return null;
			}

			// 構成品件数分繰り返し
			for (MSetStructure mSetStructure : mSetStructureList) {
				rowIndex++;
				// ===== 構成品CDの存在チェック =====
				MProduct product = new MProduct();
				product.setClientId(clientId);
				product.setProductCd(mSetStructure.getMProduct().getProductCd());
				product = productLogic.getUkEntity(product);
				if (product == null) {
					// 商品マスタに存在しません。
					this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
					continue;
				}
				//[#3568][Ver3.0]小数有無フラグが『0:小数を含まない』の場合エラーとする処理追加 2018.02.26 miyabe add Start
				// ===== 小数有無フラグチェック =====
				if (product.getMShapeGrp().isDecimalExistFlg$1() && product.isDelFlg$0()) {
					// 小数有無フラグが「1：小数を含む」の場合、セット品の構成品として登録できません。
					this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.SET_STRUCTURE_DECIMAL_EXIST_FLG_ERROR);
					continue;
				}
				//[#3568][Ver3.0]小数有無フラグが『0:小数を含まない』の場合エラーとする処理追加 2018.02.26 miyabe add End

				// ===== 別の親商品に存在チェック =====
				// 削除フラグの自動検索無効化
				this.setBehaviorAutoDelFlg(false);
				mspCB = mSetParentBhv.newConditionBean();
				mspCB.query().setProductId_Equal(product.getProductId());
				// 検索実行
				count = mSetParentBhv.selectCount(mspCB);
				// 削除フラグの自動検索有効化
				this.setBehaviorAutoDelFlg(true);
				if (count > 0) {
					// 構成品が別の親商品に使用済みです。
					this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.STRUCTURE_CANNOT_INPUT_ANOTHER_PARENT_PRODUCT_ERROR);
					continue;
				}
			}
		} else {
			// ===== 修正の場合 =====
			// [ON推-CT113-023] チェック処理を削除する 2015.12.28 hayashi Start
			// ===== 在庫移動指示に存在チェック =====
//			TMoveInstBCB moveCB =  tMoveInstBBhv.newMyConditionBean();
//			moveCB.setupSelect_TMoveInstH();
//			moveCB.query().setProductId_Equal(mSetParent.getProductId());
//			moveCB.orScopeQuery(new OrQuery<TMoveInstBCB>() {
//				@Override
//				public void query(TMoveInstBCB arg0) {
//					arg0.query().setMoveInstStatus_Equal_$01();
//					arg0.query().queryTMoveInstH().setMoveInstStatus_Equal_$01();
//				}
//			});
//			count = tMoveInstBBhv.selectCount(moveCB);
//
//			if(count > 0){
//				// 該当商品に在庫データが存在するため変更できません。
//				this.getErrorManager().add(this.errRetSts(StatusCode.SET_STRUCTURE_EDIT_UPDATE_FAILED),WmsMessageConst.UPDATE_PRODUCT_STOCK_FOUND_ERROR);
//				return null;
//			}
			// [ON推-CT113-023] チェック処理を削除する 2015.12.28 hayashi End

			// 構成品件数分繰り返し
			for (MSetStructure mSetStructure : mSetStructureList) {
				rowIndex++;
				//[#3568][Ver3.0]小数有無フラグが『0:小数を含まない』の場合エラーとする処理追加 2018.02.20 miyabe add Start
				MProduct product = new MProduct();
				product.setClientId(mSetParent.getMProduct().getClientId());
				product.setProductCd(mSetStructure.getMProduct().getProductCd());
				product = productLogic.getUkEntity(product);
				// ===== 構成品CDの存在チェック =====
				if (product == null) {
					// 商品マスタに存在しません。
					this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
					continue;
				}
				// ===== 小数有無フラグチェック =====
				if (product.getMShapeGrp().isDecimalExistFlg$1() && product.isDelFlg$0()) {
					// 小数有無フラグが「1：小数を含む」の場合、セット品の構成品として登録できません。
					this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.SET_STRUCTURE_DECIMAL_EXIST_FLG_ERROR);
					continue;
				}
				//[#3568][Ver3.0]小数有無フラグが『0:小数を含まない』の場合エラーとする処理追加 2018.02.20 miyabe add End
				if(mSetStructure.getSetStructureId() == null){
					// ===== 構成品CD重複チェック =====
					// 削除フラグの自動検索無効化
					this.setBehaviorAutoDelFlg(false);
					MSetStructureCB structureCB = mSetStructureBhv.newMyConditionBean();
					structureCB.query().setSetParentId_Equal(mSetParent.getSetParentId());
					structureCB.query().setProductId_Equal(product.getProductId());
					// 検索実行
					count = mSetStructureBhv.selectCount(structureCB);
					// 削除フラグの自動検索有効化
					this.setBehaviorAutoDelFlg(true);
					if (count > 0) {
						// 構成品CDが重複しています。
						this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.STRUCTURE_CODE_DUPLICATE_ERROR);
						continue;
					}

					// ===== 別の親商品に存在チェック =====
					// 削除フラグの自動検索無効化
					this.setBehaviorAutoDelFlg(false);
					MSetParentCB mspCB = mSetParentBhv.newConditionBean();
					mspCB.query().setProductId_Equal(product.getProductId());
					// 検索実行
					count = mSetParentBhv.selectCount(mspCB);
					// 削除フラグの自動検索有効化
					this.setBehaviorAutoDelFlg(true);
					if (count > 0) {
						// 構成品が別の親商品に使用済みです。
						this.getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_EXIST_STRUCTURE_CHECK, rowIndex),WmsMessageConst.STRUCTURE_CANNOT_INPUT_ANOTHER_PARENT_PRODUCT_ERROR);
						continue;
					}
				}
			}
		}
		return null;
	}

	/**
	 * <h2>登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにセット品親マスタとセット品構成マスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param setStructureEditDto セット品構成マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(SetStructureEditDto setStructureEditDto) {

		// Entity変換
		MSetParentDtoMapper mapper = new MSetParentDtoMapper();
		MSetParent mSetParent = mapper.mappingToEntity(setStructureEditDto.data.head);

		MSetStructureDtoMapper bodyMapper = new MSetStructureDtoMapper();
		List<MSetStructure> mSetStructureList = bodyMapper.mappingToEntityList( setStructureEditDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(setStructureEditDto);

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		MClient mClient = new MClient();
		mClient.setClientCd(mSetParent.getMProduct().getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		mSetParent.getMProduct().setClientId(mClient.getClientId());

		// 親商品ID取得
		MProduct mProduct = new MProduct();
		mProduct.setClientId(mSetParent.getMProduct().getClientId());
		mProduct.setProductCd(mSetParent.getMProduct().getProductCd());
		mProduct = productLogic.getUkEntity(mProduct);
		mSetParent.setProductId(mProduct.getProductId());

		// セット品親マスタとセット品構成マスタ登録
		setStructureEditInsertLogic.insert(mSetParent, mSetStructureList, errRetSts(StatusCode.SET_STRUCTURE_EDIT_INSERT_FAILED));

		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにセット品親マスタを更新し。
	 * セット品構成マスタを更新または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param setStructureEditDto セット品構成マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(SetStructureEditDto setStructureEditDto) {

		// Entity変換
		MSetParentDtoMapper mapper = new MSetParentDtoMapper();
		MSetParent mSetParent = mapper.mappingToEntity(setStructureEditDto.data.head);

		MSetStructureDtoMapper bodyMapper = new MSetStructureDtoMapper();
		List<MSetStructure> mSetStructureList = bodyMapper.mappingToEntityList( setStructureEditDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(setStructureEditDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// セット品構成マスタメンテナンス(編集)更新
		setStructureEditUpdateLogic.update(mSetParent,mSetStructureList, errRetSts(StatusCode.SET_STRUCTURE_EDIT_UPDATE_FAILED));

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}