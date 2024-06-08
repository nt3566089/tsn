package com.oneslogi.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.receive.ReceivePlanInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanErrorCheckLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanInputSelectLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanInsertLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 入荷予定入力画面のリソースクラス。
 */
@Path("/receive/receivePlanInput")
public class ReceivePlanInputResource extends AbstractWmsResource {

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
		 * 入荷予定データ取得異常
		 */
		protected static final int RECEIVE_PLAN_SELECT_FAILED = 2;
		/**
		 * 仕入先マスタ存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND = 3;

		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND = 4;

		/**
		 * 入荷予定ボディ0件
		 */
		protected static final int BODY_DATA_NONE = 5;
		/**
		 * 入荷予定データ登録異常
		 */
		protected static final int RECEIVE_PLAN_INSERT_FAILED = 6;
		/**
		 * 入荷予定データ更新異常
		 */
		protected static final int RECEIVE_PLAN_UPDATE_FAILED = 7;
		/**
		 * 倉庫CDが同じでない
		 */
		protected static final int LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR = 8;
		/**
		 * 倉庫マスタ存在異常
		 */
		protected static final int WAREHOUSE_NOT_FOUND = 9;
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
		/**
		 * 予定数小数桁数異常
		 */
		protected static final int PLAN_NUM_DECIMAL_CHECK_FAILED = 10;
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceivePlanInputSelectLogic selectLogic;
	@Inject
	private ReceivePlanInsertLogic insertLogic;
	@Inject
	private ReceivePlanUpdateLogic updateLogic;
	@Inject
	private ReceivePlanErrorCheckLogic checkLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;

	// ===== メンバ変数 =====
	/**
	 * 入荷予定データ入力チェックの結果（登録）
	 */
	protected enum ResultSetupRegisterData {
		ALL_OK,
		ERROR,
		WARNING_PRODUCT_NOT_FOUND
	}

	/**
	 * 入荷予定データ入力チェックの結果（更新）
	 */
	protected enum ResultSetupUpdateData {
		ALL_OK,
		ERROR,
		WARNING_PRODUCT_NOT_FOUND,
		WARNING_BODY_DATA_NONE
	}

	/**
	 * 登録データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
		PRODUCT_NOT_FOUND,
		BODY_DATA_NONE
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・入荷予定明細の空行を新規作成
	 * ・追加用の空行を作成
	 * </pre>
	 * @return ReceivePlanInputDto 入荷予定登録画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReceivePlanInputDto initNew() {

		// 画面用DTO作成
		ReceivePlanInputDto receivePlanDto = new ReceivePlanInputDto();

		// [C-NIS-0008] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		// 入荷予定日デフォルト表示設定
		receivePlanDto.data.planDtDefFlg = getPropertyIntValue(WmsPropertyConst.RECEIVE_PLAN_INPUT_DT_DEF_FLG);
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End
		// [C-NIS-0008] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End

		return receivePlanDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・入荷予定ヘッダIDをキーに入荷予定データ取り出し
	 * ・入力予定ヘッダ部のデータを画面用DTOに設定
	 * ・入力予定ボディ部のデータを画面用DTOに設定
	 * </pre>
	 * @param receivePlanHId 入荷予定ヘッダID
	 * @return ReceivePlanInputDto 入荷予定登録画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public ReceivePlanInputDto initUpdate(@QueryParam("receivePlanHId") Long receivePlanHId) {

		TReceivePlanH headerDto = new TReceivePlanH();
		headerDto.setReceivePlanHId(receivePlanHId);

		// 入荷予定データ取得
		List<TReceivePlanB> selectEntity = selectLogic.select(headerDto, errRetSts(StatusCode.RECEIVE_PLAN_SELECT_FAILED));

		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// JSON通信のためにSimpleDTO変換
		TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanBDto> selectDto = mapper.mappingToDtoList(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		ReceivePlanInputDto receivePlanDto = new ReceivePlanInputDto();
		receivePlanDto.data.head = ReceivePlanInputDto.chaseTReceivePlanHDto(selectDto.get(0).getTReceivePlanH());

		// ===== 画面用DTO ボディの作成 =====
		for (TReceivePlanBDto selectBody : selectDto) {
			receivePlanDto.data.body.add(ReceivePlanInputDto.chaseTReceivePlanBDto(selectBody));
		}

		return receivePlanDto;
	}

	/**
	 * <h2>入力チェック（新規）。</h2>
	 * <pre>
	 * 新規登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・商品マスタ存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param receivePlanInputDto 入荷予定画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckRegister")
	public StatusDto inputCheckRegister(ReceivePlanInputDto receivePlanInputDto) {
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH header = headerMapper.mappingToEntity(receivePlanInputDto.data.head);

		TReceivePlanBDtoMapper bodyMapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> bodyList = bodyMapper.mappingToEntityList(receivePlanInputDto.data.body);

		// 登録データを組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(header, bodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		} else if (checkStatus == ResultSetupRegisterData.WARNING_PRODUCT_NOT_FOUND) {
			// 商品マスタ存在チェック警告表示
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_PLAN_REGISTERPRODUCT_CODE_NOT_FOUND_CONFIRMATION);
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>入荷予定登録。</h2>
	 * <pre>
	 * 新規登録データの組み立てを行う。
	 * エラーがない場合は、データベースに入荷予定データを登録し、完了メッセージを設定する。
	 *
	 * 登録データに次の値を設定する。
	 * ・入力区分
	 * ・納品ステータス
	 * </pre>
	 * @param receivePlanInputDto 入荷予定画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ReceivePlanInputDto receivePlanInputDto) {

		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH header = headerMapper.mappingToEntity(receivePlanInputDto.data.head);

		TReceivePlanBDtoMapper bodyMapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> bodyList = bodyMapper.mappingToEntityList(receivePlanInputDto.data.body);

		// 登録データ組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(header, bodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		}

		// DBに入荷予定を登録
		insertLogic.insert(header, bodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// エラーチェック処理追加 2016.4.5 NayZaw Start

		boolean isError = checkLogic.check(null, header.getReceivePlanHId(), errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));
		if(isError){
			//エラー存在場合
			getWarnManager().add(warnRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		}else{
			//エラー存在しない場合、完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.DOCUMENT_NUMBER_CONFIRMATION_INFORMATION, header.getReceiveSlipNo());
		}

		// エラーチェック処理追加 2016.4.5 NayZaw End

		return null;

	}

	/**
	 * <h2>新規登録データの組み立て。</h2>
	 * <pre>
	 * 各マスタより次のデータを取得し、登録データに設定する。
	 * 登録データに次の値を設定する。
	 * ・入力区分
	 * ・入荷納品ステータス
	 *
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する。
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 *
	 * 戻り値を下記のように設定する
	 *   ERROR : ボディ0件、仕入先マスタ存在異常、ロケーションマスタ存在異常
	 *   WARNING_PRODUCT_NOT_FOUND : 商品マスタのみ存在異常
	 *   ALL_OK : 正常
	 * </pre>
	 * @param header 入荷予定ヘッダ
	 * @param bodyList 入荷予定ボディのリスト
	 * @return CheckStatus 処理結果
	 *
	 */
	protected ResultSetupRegisterData setupRegisterData(TReceivePlanH header, List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		ResultSetupRegisterData checkStatus = null;

		// ===== 登録データの組み立て =====

		// 固定値の設定
		header.setReceiveDeliveryStatus_$00();
		header.setInputType_$00();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		header.setCenterTransitFlg_$0();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End

		// 登録または更新データの組み立て
		ResultSetupData resultSetup = setupData(header, bodyList, errSts);

		// 結果の詰め替え

		if (resultSetup == ResultSetupData.ALL_OK) {
			// チェック正常の場合
			checkStatus = ResultSetupRegisterData.ALL_OK;
		} else if (resultSetup == ResultSetupData.ERROR) {
			// チェックエラーの場合
			checkStatus = ResultSetupRegisterData.ERROR;

		} else if (resultSetup == ResultSetupData.PRODUCT_NOT_FOUND) {
			// 商品マスタ存在チェック警告の場合
			checkStatus = ResultSetupRegisterData.WARNING_PRODUCT_NOT_FOUND;
		}

		return checkStatus;
	}

	/**
	 * <h2>入力チェック（更新）。</h2>
	 * <pre>
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・商品マスタ存在チェックエラー用メッセージ
	 * ・ボディ無エラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param receivePlanInputDto 入荷予定画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckUpdate")
	public StatusDto inputCheckUpdate(ReceivePlanInputDto receivePlanInputDto) {

		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH header = headerMapper.mappingToEntity(receivePlanInputDto.data.head);

		TReceivePlanBDtoMapper bodyMapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> bodyList = bodyMapper.mappingToEntityList(receivePlanInputDto.data.body);

		// 更新データを組み立て
		ResultSetupUpdateData checkStatus = setupUpdateData(header, bodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupUpdateData.ERROR) {
			// 処理中止
			return null;
		} else if (checkStatus == ResultSetupUpdateData.WARNING_PRODUCT_NOT_FOUND) {
			// 商品マスタ存在チェック警告表示
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_PLAN_REGISTERPRODUCT_CODE_NOT_FOUND_CONFIRMATION);
		} else if (checkStatus == ResultSetupUpdateData.WARNING_BODY_DATA_NONE) {
			// 削除確認表示
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_PLAN_UPDATE_DETAIL_LINE_NOT_INPUT_CONFIRMATION);
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_UPDATE_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>入荷予定更新。</h2>
	 * <pre>
	 * 更新データの組み立てを行う。
	 * エラーがない場合は、データベースの入荷予定データを更新し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param receivePlanInputDto 入荷予定画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(ReceivePlanInputDto receivePlanInputDto) {

		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH header = headerMapper.mappingToEntity(receivePlanInputDto.data.head);

		TReceivePlanBDtoMapper bodyMapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> bodyList = bodyMapper.mappingToEntityList(receivePlanInputDto.data.body);

		// 更新データを組み立て
		ResultSetupUpdateData checkStatus = setupUpdateData(header, bodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupUpdateData.ERROR) {
			// 処理中止
			return null;
		}

		// DBに入荷予定を更新
		updateLogic.update(header, bodyList, errRetSts(StatusCode.RECEIVE_PLAN_UPDATE_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	/**
	 * <h2>更新データの組み立て。</h2>
	 * <pre>
	 * 各マスタより次のデータを取得し、更新データに設定する。
	 * センタIDについてはベースクラスから取得。
	 *
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する。
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 *
	 * 戻り値を下記のように設定する
	 *   ERROR : 仕入先マスタ存在異常、ロケーションマスタ存在異常
	 *   WARNING_BODY_DATA_NONE : ボディ0件
	 *   WARNING_PRODUCT_NOT_FOUND : 商品マスタのみ存在異常
	 *   ALL_OK : 正常
	 * </pre>
	 * @param header 入荷予定ヘッダ
	 * @param bodyList 入荷予定ボディのリスト
	 * @return CheckStatus 処理結果
	 *
	 */
	protected ResultSetupUpdateData setupUpdateData(TReceivePlanH header, List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		ResultSetupUpdateData checkStatus = null;

		// 登録または更新データの組み立て
		ResultSetupData resultSetup = setupData(header, bodyList, errSts);

		// 結果の詰め替え
		switch (resultSetup) {

		case ALL_OK:
			checkStatus = ResultSetupUpdateData.ALL_OK;
			break;

		case ERROR:
			checkStatus = ResultSetupUpdateData.ERROR;
			break;

		case BODY_DATA_NONE:
			// 更新では、明細0件はエラーとしない
			checkStatus = ResultSetupUpdateData.WARNING_BODY_DATA_NONE;
			break;

		case PRODUCT_NOT_FOUND:
			checkStatus = ResultSetupUpdateData.WARNING_PRODUCT_NOT_FOUND;
			break;
		}
		return checkStatus;
	}

	/**
	 * <h2>登録または更新データの組み立て。</h2>
	 * <pre>
	 * 画面で入力されたCDを元にIDを取得し、データに設定する。
	 * 設定時にマスタの存在有無を合わせてチェックする
	 * 【入荷予定ヘッダ】
	 * ・荷主ID
	 * ・センタID
	 * ・処理区分ID
	 * ・予定仕入先ID
	 * ・予定預託ID
	 *
	 * 【入荷予定ボディ】
	 * ・商品ID
	 * ・予定ロケーションID（ロケーションコードが入力されているときのみ）
	 * ・予定倉庫ID（ロケーションコードが入力されているときのみ）
	 * ・予定倉庫CD（ロケーションコードが入力されているときのみ）
	 *
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する。
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 *
	 * 戻り値を下記のように設定する
	 *   ERROR : ボディ0件、仕入先マスタ存在異常、ロケーションマスタ存在異常
	 *   WARNING_PRODUCT_NOT_FOUND : 商品マスタのみ存在異常
	 *   ALL_OK : 正常
	 * </pre>
	 * @param header 入荷予定ヘッダ
	 * @param bodyList 入荷予定ボディのリスト
	 * @return CheckStatus 処理結果
	 *
	 */
	protected ResultSetupData setupData(TReceivePlanH header, List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(header.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// エラーフラグ
		boolean isHeaderError = false;
		// エラーメッセージCD
		String headerErrMessageCd = null;
		// 登録されていない商品があるか
		boolean isNullProduct = false;

		// 処理区分IDの取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setProcessTypeCd(header.getMProcessType().getProcessTypeCd());
		MProcessType mProcessType = processTypeLogic.getUkEntityWithDeletedCheck(processTypeCondition);
		// 処理区分IDの設定
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		// [ON推-品向-125] 同一荷主、仕入先、予定顧客入荷指示No.存在チェックを修正 2014.11.24 fengc Start
		String strPlanClientreceiveNo = header.getPlanClientReceiveNo();
		if (!CU.isNullOrEmpty(strPlanClientreceiveNo)) {
			// 同一荷主、仕入先、予定顧客入荷指示No.存在チェック
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
			//センタID（Center_ID）
			header.setCenterId(centerId);
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

			header.setClientId(clientId);
			insertLogic.isPlanClientReceiveNoCheck(header, errSts);
			if (getErrorManager().size() == 0) {
				// 同一予定顧客入荷指No、同一仕入先、同一入荷予定日、同一処理区分の入荷予定ﾃﾞｰﾀが既に登録済の場合エラー
				insertLogic.isAlreadyRegisteredDataCheck(header, errSts);
			}
		}
		// [ON推-品向-125] 同一荷主、仕入先、予定顧客入荷指示No.存在チェックを修正 2014.11.24 fengc End

		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.10 hayashi Start
		// 在庫区分IDの取得
		MStockType mStockTypeCondition = new MStockType();
		mStockTypeCondition.setStockTypeCd(header.getMStockType().getStockTypeCd());
		MStockType mStockType = stockTypeLogic.getUkEntity(mStockTypeCondition);
		// 在庫区分IDの設定
		header.setStockTypeId(mStockType.getStockTypeId());
		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.10 hayashi End

		// =======================================================
		// =                     入荷予定ボディデータ組み立て                           =
		// =======================================================
		// ヘッダのエラーフラグ、ステータス、エラーメッセージＩＤを設定するため、ボディから組み立てる

		int rowIndex = -1;
		for (TReceivePlanB body : bodyList) {
			rowIndex++;

			// 商品IDを設定
			MProduct productCondition = new MProduct();
			productCondition.setClientId(clientId);
			productCondition.setProductCd(body.getProductCd());
			MProduct product = productLogic.getUkEntity(productCondition);

			if (product == null) {

				// ヘッダもエラーにする
				isHeaderError = true;
				// 登録されていない商品あり
				isNullProduct = true;

				// 商品IDを設定
				body.setProductId(null);

				// ステータスをエラーにする
				body.setReceiveStatus_$99();
				// エラーフラグをエラーにする
				body.setErrorFlg_$1();

				// エラーメッセージCD設定
				body.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);

			} else {

				// 商品IDを設定
				body.setProductId(product.getProductId());

				// ステータスを未入荷にする
				body.setReceiveStatus_$01();
				// エラーフラグをエラー無にする
				body.setErrorFlg_$0();

				// エラーメッセージCD設定
				body.setErrorMessageCd(null);

				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				product = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(product);
				if (product == null) {
					// ヘッダもエラーにする
					isHeaderError = true;
					// 登録されていない商品あり
					isNullProduct = true;

					// 商品IDを設定
					body.setProductId(null);

					// ステータスをエラーにする
					body.setReceiveStatus_$99();
					// エラーフラグをエラーにする
					body.setErrorFlg_$1();

					// エラーメッセージCD設定
					body.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				} else {
					String decimalExistFlg = product.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
					if (CU.isNullOrEmpty(decimalExistFlg)) {
						// ヘッダもエラーにする
						isHeaderError = true;
						// 登録されていない商品あり
						isNullProduct = true;

						// 商品IDを設定
						body.setProductId(null);

						// ステータスをエラーにする
						body.setReceiveStatus_$99();
						// エラーフラグをエラーにする
						body.setErrorFlg_$1();

						// エラーメッセージCD設定
						body.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
					} else if (decimalExistFlg.equals(CDef.DecimalExistFlg.$0.code())) {
						//小数有無フラグが無の場合
						if (!WmsCommonUtil.checkPatternInput("^\\d+$", WCC.stripTrailingZeros(body.getPlanNum()))) {
							// 小数0桁以内
							// ステータスをエラーにする
							body.setReceiveStatus_$99();
							// エラーフラグをエラーにする
							body.setErrorFlg_$1();

							// エラーメッセージCD設定
							body.setErrorMessageCd(WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
							this.getErrorManager().add(errRetSts(errSts, StatusCode.PLAN_NUM_DECIMAL_CHECK_FAILED, rowIndex), WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
							break;
						}
					} else {}
				}
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			}

			// ロケーションコードがある、倉庫がないの場合
			if (!CU.isNullOrEmpty(body.getPlanLocationCd()) && CU.isNullOrEmpty(body.getPlanWarehouseCd())) {

				// ロケーションの取得
				MLocation locationCondition = new MLocation();
				locationCondition.setCenterId(centerId);
				locationCondition.setLocationCd(body.getPlanLocationCd());

				MLocation location = locationLogic.getUkEntityWithWarehouse(locationCondition, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));

				if (location != null) {
					// 倉庫を取得
					MWarehouse warehouse = location.getMZone().getMWarehouse();
					if (warehouse != null) {
						body.setPlanLocationId(location.getLocationId());
						body.setPlanLocationCd(body.getPlanLocationCd());
						body.setPlanWarehouseId(warehouse.getWarehouseId());
						body.setPlanWarehouseCd(warehouse.getWarehouseCd());
					}
				}
			}

			//  倉庫CDがある、ロケーションコードがないの場合
			if (CU.isNullOrEmpty(body.getPlanLocationCd()) && !CU.isNullOrEmpty(body.getPlanWarehouseCd())) {

				// 倉庫の取得
				MWarehouse warehouseCondition = new MWarehouse();
				warehouseCondition.setCenterId(centerId);
				warehouseCondition.setWarehouseCd(body.getPlanWarehouseCd());
				MWarehouse warehouse = warehouseLogic.getUkEntity(warehouseCondition, errRetSts(errSts, StatusCode.WAREHOUSE_NOT_FOUND, rowIndex));

				if (warehouse != null) {
					body.setPlanLocationId(null);
					body.setPlanLocationCd(null);
					body.setPlanWarehouseId(warehouse.getWarehouseId());
					body.setPlanWarehouseCd(warehouse.getWarehouseCd());
				}
			}

			// 倉庫CDがある、ロケーションコードがあるの場合
			if (!CU.isNullOrEmpty(body.getPlanLocationCd()) && !CU.isNullOrEmpty(body.getPlanWarehouseCd())) {

				// 倉庫の取得
				MWarehouse warehouseCondition = new MWarehouse();
				warehouseCondition.setCenterId(centerId);
				warehouseCondition.setWarehouseCd(body.getPlanWarehouseCd());
				warehouseLogic.getUkEntity(warehouseCondition, errRetSts(errSts, StatusCode.WAREHOUSE_NOT_FOUND, rowIndex));

				// ロケーションの取得
				MLocation locationCondition = new MLocation();
				locationCondition.setCenterId(centerId);
				locationCondition.setLocationCd(body.getPlanLocationCd());

				MLocation location = locationLogic.getUkEntityWithWarehouse(locationCondition, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));

				// ロケーシュンコードがある 倉庫がある、しかし倉庫が同じでないの場合
				if (location != null && location.getMZone().getMWarehouse() != null) {
					if (!CU.equals(location.getMZone().getMWarehouse().getWarehouseCd(), body.getPlanWarehouseCd())) {
						this.getErrorManager().add(errRetSts(errSts, StatusCode.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR);
						break;
					} else {
						body.setPlanLocationId(location.getLocationId());
						body.setPlanLocationCd(body.getPlanLocationCd());
						body.setPlanWarehouseId(location.getMZone().getMWarehouse().getWarehouseId());
						body.setPlanWarehouseCd(location.getMZone().getMWarehouse().getWarehouseCd());
					}
				}
			}

			// 倉庫CDがない、ロケーションコードがないの場合
			if (CU.isNullOrEmpty(body.getPlanLocationCd()) && CU.isNullOrEmpty(body.getPlanWarehouseCd())) {
				body.setPlanLocationId(null);
				body.setPlanLocationCd(null);
				body.setPlanWarehouseId(null);
				body.setPlanWarehouseCd(null);
			}
		}

		// =======================================================
		// =                     入荷予定ヘッダデータ組み立て                              =
		// =======================================================

		//		// 処理区分IDの取得
		//		MProcessType processTypeCondition = new MProcessType();
		//		processTypeCondition.setProcessTypeCd(header.getMProcessType().getProcessTypeCd());
		//		MProcessType mProcessType = processTypeLogic.getUkEntityWithDeletedCheck(processTypeCondition);

		// 予定仕入先IDの取得
		MCustomer supplierCondition = new MCustomer();
		supplierCondition.setClientId(clientId);
		supplierCondition.setCustomerCd(header.getPlanSupplierCd());

		// 予定仕入先IDが取得できない場合、エラーメッセージをエラー管理クラスに登録
		//		MCustomer supplier = customerLogic.getUkEntity(supplierCondition, errRetSts(StatusCode.CUSTOMER_NOT_FOUND));
		MCustomer supplier = customerLogic.getVendorCustomerByClientCd(supplierCondition, errRetSts(StatusCode.CUSTOMER_NOT_FOUND));
		// 予定預託IDの取得
		MCustomer depositCondition = new MCustomer();
		depositCondition.setClientId(clientId);
		depositCondition.setCustomerCd(header.getPlanDepositCd());
		MCustomer deposit = customerLogic.getUkEntityWithDeletedCheck(depositCondition);

		// センタIDの設定
		header.setCenterId(centerId);
		// 荷主IDの設定
		header.setClientId(clientId);
		// 処理区分IDの設定
		header.setProcessTypeId(mProcessType.getProcessTypeId());
		// 予定仕入先IDの設定
		if (supplier != null) {
			header.setPlanSupplierId(supplier.getCustomerId());
		}
		// 予定預託IDの設定
		header.setPlanDepositId(deposit.getCustomerId());
		// ステータス
		if (isHeaderError) {
			// ステータスをエラーにする
			header.setReceiveStatus_$99();
			// エラーフラグをエラーにする
			header.setErrorFlg_$1();
			// エラーメッセージCD設定
			headerErrMessageCd = WmsMessageConst.DETAIL_LINE_FOUND_ERROR;
		} else {
			// ステータスを未入荷にする
			header.setReceiveStatus_$01();
			// エラーフラグをエラー無にする
			header.setErrorFlg_$0();
		}
		// エラーメッセージCDの設定
		header.setErrorMessageCd(headerErrMessageCd);

		// 結果の設定
		ResultSetupData checkStatus;
		if (getErrorManager().size() > 0) {
			checkStatus = ResultSetupData.ERROR;
		} else if (bodyList.size() == 0) { // 詳細データ0件
			checkStatus = ResultSetupData.BODY_DATA_NONE;
		} else if (isNullProduct) {
			checkStatus = ResultSetupData.PRODUCT_NOT_FOUND;
		} else {
			checkStatus = ResultSetupData.ALL_OK;
		}

		return checkStatus;
	}

}
