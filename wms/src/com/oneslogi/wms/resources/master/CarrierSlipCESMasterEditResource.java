package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCarrierSlipCesCB;
import com.oneslogi.base.dbflute.dtomapper.MCarrierSlipCesDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipCesBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipCes;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CarrierSlipCESMasterEditDto;
import com.oneslogi.wms.logic.master.CarrierSlipCESMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierSlipCESMasterSelectLogic;
import com.oneslogi.wms.logic.master.CarrierSlipCESMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * キャリアEDIシステム送り状マスタメンテナンス(編集)のリソースクラス。
 */
@Path("/master/carrierSlipCESMasterEdit")
public class CarrierSlipCESMasterEditResource extends AbstractWmsResource {

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
		 * 取引先CD重複
		 */
		protected static final int CUSTMOER_CD_CODE_DUPLICATE_ERROR = 2;
		/**
		 * キャリアEDIシステム送り状マスタメンテナンス(編集)データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int CARRIER_SLIP_CES_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CARRIER_SLIP_CES_UPDATE_FAILED = 5;
		/**
		 * 取引先マスタで未存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND_ERROR = 6;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK_ERROR = 7;


	}
	/**
	 * 登録フラグ
	 */
	protected static final String INS_FLG = "0";

	/**
	 * 更新フラグ
	 */
	protected static final String UPD_FLG = "1";

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierSlipCESMasterSelectLogic selectLogic;
	@Inject
	private CarrierSlipCESMasterUpdateLogic updateLogic;
	@Inject
	private CarrierSlipCESMasterInsertLogic insertLogic;
	@Inject
	private MCarrierSlipCesBhv mCarrierSlipCesBhv;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierMasterEditDto キャリアEDIシステム送り状マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CarrierSlipCESMasterEditDto initNew() {
		return new CarrierSlipCESMasterEditDto();
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・キャリアEDIシステム送り状マスタメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @return CarrierSlipCESMasterEditDto キャリアEDIシステム送り状マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public CarrierSlipCESMasterEditDto initUpdate(@QueryParam("customerId") Long customerId) {
		CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto = new CarrierSlipCESMasterEditDto();

		// エンティティ編集
		MCarrierSlipCes mCarrierSlipCes = new MCarrierSlipCes();
		mCarrierSlipCes.setCustomerId(customerId);

		// キャリアEDIシステム送り状マスタ(編集)データ取得
		MCarrierSlipCes result = selectLogic.selectById(mCarrierSlipCes, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// Dto変換処理6
		MCarrierSlipCesDtoMapper mCarrierSlipCesDtoMapper = new MCarrierSlipCesDtoMapper();

		// キャリアEDIシステム送り状マスタ更新画面用DTOデータセット
		carrierSlipCESMasterEditDto.data.head = mCarrierSlipCesDtoMapper.mappingToDto(result);

		return carrierSlipCESMasterEditDto;
	}

	/**
	 * <h2>入力チェック（新規と更新）。</h2>
	 * <pre>
	 * ・新規登録データのチェックを行う`
	 * ・エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param CarrierSlipCESMasterEditDto キャリアEDIシステム送り状マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto) {

		// 登録または更新チェック処理
		setupInputCheck(carrierSlipCESMasterEditDto, INS_FLG);

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
	 * <h2>入力チェック（更新）。</h2>
	 * <pre>
	 * ・更新登録データのチェックを行う`
	 * ・エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param CarrierSlipCESMasterEditDto キャリアEDIシステム送り状マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/updateCheck")
	public StatusDto updateCheck(CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto) {

		// 登録または更新チェック処理
		setupUpdateCheck(carrierSlipCESMasterEditDto, UPD_FLG);

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
	 *  ・取引先CDの存在チェック
	 *
	 * </pre>
	 * @param CarrierSlipCESMasterEditDto キャリアEDIシステム送り状マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected MCustomer setupUpdateCheck(CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto, String useFlg) {

		// Entity変換
		MCarrierSlipCesDtoMapper mapper = new MCarrierSlipCesDtoMapper();
		MCarrierSlipCes mCarrierSlipCes = mapper.mappingToEntity(carrierSlipCESMasterEditDto.data.head);

		// キャリアEDIシステム送り状マスタメンテナンス(編集)データ取得
		MCustomer result = insertLogic.selectByCd(mCarrierSlipCes);
		int count = 0;

		if (result.getCustomerCd() != null) {
			// ===== 取引先マスタ存在チェック =====
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);
			MCarrierSlipCesCB cb = mCarrierSlipCesBhv.newMyConditionBean();
			cb.setupSelect_MCustomer();
			cb.query().setCustomerId_Equal(result.getCustomerId());

			// 検索実行
			count = mCarrierSlipCesBhv.selectCount(cb);
			// 削除フラグの自動検索有効化
			this.setBehaviorAutoDelFlg(true);
			if ("1".equals(useFlg) && count == 0) {
				// 更新の場合
				// 取引先CDが取引先マスタに存在しません。
				this.getErrorManager().add(this.errRetSts(StatusCode.CUSTOMER_NOT_FOUND_ERROR), WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				return null;
			}

		}
		return result;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 * <pre>
	 *  【新規】
	 *  ・取引先CDの存在チェック
	 *
	 * </pre>
	 * @param shapeGroupMasterEditDto 荷姿グループメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected MCustomer setupInputCheck(CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto, String useFlg) {

		// Entity変換
		MCarrierSlipCesDtoMapper mapper = new MCarrierSlipCesDtoMapper();
		MCarrierSlipCes mCarrierSlipCes = mapper.mappingToEntity(carrierSlipCESMasterEditDto.data.head);

		// キャリアEDIシステム送り状マスタメンテナンス(編集)データ取得
		MCustomer result = insertLogic.selectByCd(mCarrierSlipCes);
		int count = 0;

		if (result == null) {
			// 取引先CDが取引先マスタに存在しません。
			this.getErrorManager().add(this.errRetSts(StatusCode.CUSTOMER_NOT_FOUND_ERROR), WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			return null;
		}

		if (result.getCustomerCd() != null) {
			// ===== 取引先マスタ存在チェック =====
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);
			MCarrierSlipCesCB cb = mCarrierSlipCesBhv.newMyConditionBean();
			cb.setupSelect_MCustomer();
			cb.query().setCustomerId_Equal(result.getCustomerId());

			// 検索実行
			count = mCarrierSlipCesBhv.selectCount(cb);
			// 削除フラグの自動検索有効化
			this.setBehaviorAutoDelFlg(true);
			// 登録の場合
			if ("0".equals(useFlg) && count > 0) {
				// 取引先CDが登録済みです。
				this.getErrorManager().add(this.errRetSts(StatusCode.CUSTMOER_CD_CODE_DUPLICATE_ERROR), WmsMessageConst.CUSTMOER_CD_CODE_DUPLICATE_ERROR);
				return null;
			}
			else if ("1".equals(useFlg) && count == 0) {
				// 更新の場合
				// 取引先CDが取引先マスタに存在しません。
				this.getErrorManager().add(this.errRetSts(StatusCode.CUSTOMER_NOT_FOUND_ERROR), WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				return null;
			}

		}
		return result;
	}

	/**
	 * <h2>キャリアEDIシステム送り状マスタ登録。</h2>
	 * <pre>
	 * ・エラーがない場合は、データベースにキャリアEDIシステム送り状マスタを登録し、完了メッセージを設定する。
	 * </pre>
	 * @param carrierMasterEditDto キャリアEDIシステム送り状マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto) {
		// Entity変換
		MCarrierSlipCesDtoMapper headMapper = new MCarrierSlipCesDtoMapper();
		MCarrierSlipCes mCarrierSlipCes = headMapper.mappingToEntity(carrierSlipCESMasterEditDto.data.head);

		//チェックメソッドを呼出し
		MCustomer mcustomer = setupInputCheck(carrierSlipCESMasterEditDto, INS_FLG);

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 取引先Id
		mCarrierSlipCes.setCustomerId(mcustomer.getCustomerId());

		// キャリアEDIシステム送り状マスタマスタ登録
		insertLogic.insert(mCarrierSlipCes, errRetSts(StatusCode.CARRIER_SLIP_CES_INSERT_FAILED));

		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>キャリアEDIシステム送り状マスタ更新。</h2>
	 * <pre>
	 * ・登録または更新チェックを行う
	 * ・エラーがない場合は、データベースにキャリアEDIシステム送り状マスタを更新し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param CarrierMasterEditDto キャリアEDIシステム送り状マスタ(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(CarrierSlipCESMasterEditDto carrierSlipCESMasterEditDto) {

		// Entity変換
		MCarrierSlipCesDtoMapper headMapper = new MCarrierSlipCesDtoMapper();
		MCarrierSlipCes mCarrierSlipCes = headMapper.mappingToEntity(carrierSlipCESMasterEditDto.data.head);

		//チェックメソッドを呼出し
		setupInputCheck(carrierSlipCESMasterEditDto, UPD_FLG);

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// キャリアEDIシステム送り状マスタ(編集)更新
		updateLogic.update(mCarrierSlipCes, errRetSts(StatusCode.CARRIER_SLIP_CES_UPDATE_FAILED));

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
