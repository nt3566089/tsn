package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.BaseConst;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingTagDataOutputDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlShippingTagDataOutputDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingTagDataOutput;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingTagDataOutputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsvFileLogic;
import com.oneslogi.wms.logic.common.MatchingLogic;
import com.oneslogi.wms.logic.shipping.ShippingTagDataOutputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.util.WCU;

/**
 * 送り状データ出力のリソースクラス。
 */
@Path("/shipping/shippingTagDataOutput")
public class ShippingTagDataOutputResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start
	public static final String CHARSETS = "MS932";
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.09 nayzaw Start
	public static final String FILE_IDENTIFICATION_CODE = "DENFD";

	public static final String BOX_SIZE_60 = "60";

	public static final String BOX_SIZE_060 = "060";

	public static final String BOX_SIZE_80 = "80";

	public static final String BOX_SIZE_080 = "080";

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.09 nayzaw End
	private enum CarrierType {
		YAMATO,
		SAGAWA,
		YOUPACK,
		OTHER
	}

	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End

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
		 * 送り状データ出力データ取得異常
		 */
		protected static final int ORDER_PICKING_DATA_SELECT_FAILED = 2;
		/**
		 * ヤマト送り状出力データ取得異常
		 */
		protected static final int TOTAL_PICKING_DATA_SELECT_FAILED = 3;
		/**
		 * 佐川送り状出力データ取得異常
		 */
		protected static final int PL_PICKING_DATA_SELECT_FAILED = 4;
		/**
		 * ゆうパック送り状出力データ取得異常
		 */
		protected static final int SL_PICKING_DATA_SELECT_FAILED = 5;
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 6;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int PICKING_DATA_SELECT_FAILED = 7;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingTagDataOutputSelectLogic<?> selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	// [EC-CT1-124] 送り状マスタは配送コースに結合して取得(M_CARRIER_SLIP_～の取得処理を削除) 2015.03.18 kawana
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	// [ON推-品向-422] 出力ファイル名のハードコーディングを修正 2015.01.08 kawana Start
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
//	@Inject
//	private MessageLogic messageLogic;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End
	// [ON推-品向-422] 出力ファイル名のハードコーディングを修正 2015.01.08 kawana End
	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start
	@Inject
	private MatchingLogic matchingLogic;
	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End
	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End
	// [#5111][v3.1] csvファイル作成ロジックを共通化 2018.08.30 kawana Start
	@Inject
	private CsvFileLogic csvFileLogic;
	// [#5111][v3.1] csvファイル作成ロジックを共通化 2018.08.30 kawana End

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return PickingListPrintDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingTagDataOutputDto init() {

		// 画面用DTO作成
		ShippingTagDataOutputDto shippingTagDataOutputDto = new ShippingTagDataOutputDto();

		return shippingTagDataOutputDto;
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・送り状データリスト出力データを取得する
	 * </pre>
	 * @param shippingTagDataOutputDto 送り状データ出力画面用DTO
	 * @return ShippingTagDataOutputDto 送り状データ出力画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingTagDataOutputDto search(ShippingTagDataOutputDto shippingTagDataOutputDto) {

		ShippingTagDataOutputDto resultShippingTagDataOutputDto = new ShippingTagDataOutputDto();

		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH tPickingH = headerMapper.mappingToEntity(shippingTagDataOutputDto.data.head);

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tPickingH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		tPickingH.setCenterId(centerId);

		// 荷主IDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tPickingH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		tPickingH.setClientId(clientId);

		// 出荷指示ヘッダ
		TShippingInstH tShippingInstH = new TShippingInstH();

		if (CU.equals(tPickingH.getEmergencyFlg(), "0")) {
			tShippingInstH.setEmergencyFlg(null);
		} else {
			tShippingInstH.setEmergencyFlg(tPickingH.getEmergencyFlg());
		}
		tShippingInstH.setClientShippingNo(tPickingH.getClientShippingNo());

		// 配送コースマスタ
		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
		mDeliveryCourse.setDeliveryCourseCd(tPickingH.chaseTAllocInstH().chaseMDeliveryCourse().getDeliveryCourseCd());

		// 運送業者マスタ
		MCarrier mCarrier = new MCarrier();
		mCarrier.setCarrierCd(tPickingH.chaseTAllocInstH().chaseMDeliveryCourse().chaseMCarrier().getCarrierCd());

		//納品先マスタ
		MCustomer mCustomer = new MCustomer();
		if (!CU.isNullOrEmpty(tPickingH.chaseTAllocInstH().getSupplyCustomerCd())) {
			String customerCd = tPickingH.chaseTAllocInstH().getSupplyCustomerCd();
			mCustomer.setCustomerCd(customerCd);
		}

		// 引当指示ヘッダ
		TAllocInstH tAllocInstH = new TAllocInstH();
		// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana Start
		// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
		if ("0".equals(tPickingH.getTakingShippingFlg())) {
			// 作業日
			tAllocInstH.setWorkDtFrom(tPickingH.getDtFrom());
			tAllocInstH.setWorkDtTo(tPickingH.getDtTo());
		} else if ("1".equals(tPickingH.getTakingShippingFlg())) {
			// 出荷日
			tAllocInstH.setShippingDtFrom(tPickingH.getDtFrom());
			tAllocInstH.setShippingDtTo(tPickingH.getDtTo());
		}
		// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End
		// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana End

		// 出庫帳票
		TPickingR tPickingR = new TPickingR();
		tPickingR.setInvoiceCreateFlg(tPickingH.chaseTPickingRAsOne().getInvoiceCreateFlg());

		// 送り状出力データ取得
		PagingResultBean<SqlShippingTagDataOutput> selectEntity = selectLogic.select(tAllocInstH, mDeliveryCourse, tPickingH, mCarrier, mCustomer, tShippingInstH,
				tPickingR, shippingTagDataOutputDto.paging, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));

		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Dto変換処理
		SqlShippingTagDataOutputDtoMapper mapper = new SqlShippingTagDataOutputDtoMapper();
		List<SqlShippingTagDataOutputDto> list = mapper.mappingToDtoList(selectEntity);

		//検索結果詰め替え処理
		resultShippingTagDataOutputDto.paging = shippingTagDataOutputDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		resultShippingTagDataOutputDto.data.list = list;

		return resultShippingTagDataOutputDto;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
	@POST
	@Path("/checkPrint")
	public StatusDto checkPrint(ShippingTagDataOutputDto shippingTagDataOutputDto) {

		// Entity変換
		//荷主センタ変更対応 201７.02.27 sja Start
//		TPickingHDtoMapper hMapper = new TPickingHDtoMapper();
//		TPickingH head = hMapper.mappingToEntity(shippingTagDataOutputDto.data.head);
		//荷主センタ変更対応 201７.02.27 sja End
		SqlShippingTagDataOutputDtoMapper mapper = new SqlShippingTagDataOutputDtoMapper();
		List<SqlShippingTagDataOutput> shippingTagDataList = mapper.mappingToEntityList(shippingTagDataOutputDto.data.list);

		// センタの取得
		MCenter centerCondition = new MCenter();
		//荷主センタ変更対応 201７.02.27 sja Start
		//centerCondition.setCenterCd(head.getMCenter().getCenterCd());
		centerCondition.setCenterCd(shippingTagDataList.get(0).getCenterCd());
		//荷主センタ変更対応 201７.02.27 sja End
		MCenter center = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (center == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 荷主の取得
		MClient clientCondition = new MClient();
		//荷主センタ変更対応 201７.02.27 sja Start
        //clientCondition.setClientCd(head.getMClient().getClientCd());
		clientCondition.setClientCd(shippingTagDataList.get(0).getClientCd());
		//荷主センタ変更対応 201７.02.27 sja End
		MClient client = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (client == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出庫ヘッダリスト作成
		List<TPickingH> pickingHList = new ArrayList<TPickingH>();
		for (SqlShippingTagDataOutput tagData : shippingTagDataList) {
			TPickingH pickingH = new TPickingH();
			//出庫作業No.
			pickingH.setPickingWorkNo(tagData.getPickingWorkNo());
			pickingHList.add(pickingH);
		}

		// ===== 出力データ存在チェック運送業者チェック =====
		List<TAllocInstH> selectAllocList = selectLogic.selectTAllocInstH(pickingHList, center, client, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 運送業者チェック =====
		// 取得データから運送業者を確認
		getCarrierType(selectAllocList, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== エラーなしのため確認メッセージを設定 =====
		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		return null;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

	/**
	 * <h2>送り状データリスト出力。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する。
	 * 帳票を出力する。
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 *
	 * ・コントロールNo
	 * ・送り状データ作成フラグ
	 * ・送り状データ作成日時
	 * </pre>
	 * @param shippingTagDataOutputDto 送り状データ出力画面用DTO
	 * @return ShippingTagDataOutputDto 送り状データ出力画面用DTO
	 */
	@GET
	@Path("/print")
	public ShippingTagDataOutputDto print(final ShippingTagDataOutputDto shippingTagDataOutputDto) throws Exception {

		// ===== コントロールNo.採番 =====

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo更新 =====

		// ヘッダ部Entity変換
		TPickingHDtoMapper mapper = new TPickingHDtoMapper();
		TPickingH head = mapper.mappingToEntity(shippingTagDataOutputDto.data.head);

		// 明細部Entity変換
		SqlShippingTagDataOutputDtoMapper bodyMapper = new SqlShippingTagDataOutputDtoMapper();
		List<SqlShippingTagDataOutput> bodyList = bodyMapper.mappingToEntityList(shippingTagDataOutputDto.data.list);

		// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部削除) 2015.03.18 kawana

		//コントロールNo更新
		TPickingR tPickingRUpdate = new TPickingR(); //出庫帳票(更新用)
		TPickingH tPickingH = new TPickingH(); //出庫ヘッダ
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>(); //出庫ヘッダリスト
		TPickingR tPickingRSearch = new TPickingR(); //出庫帳票(検索用)

		// エンティティ編集
		// 出庫帳票(更新用)
		tPickingRUpdate.setControlNo(controlNo);

		// 出庫ヘッダ
		tPickingH = head;

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		//荷主センタ変更対応 201７.02.27 sja Start
		//centerCondition.setCenterCd(tPickingH.getMCenter().getCenterCd());
		centerCondition.setCenterCd(bodyList.get(0).getCenterCd());
		//荷主センタ変更対応 201７.02.27 sja End
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		tPickingH.setCenterId(centerId);

		// 荷主IDの取得
		MClient clientCondition = new MClient();
		//荷主センタ変更対応 201７.02.27 sja Start
		//clientCondition.setClientCd(tPickingH.getMClient().getClientCd());
		clientCondition.setClientCd(bodyList.get(0).getClientCd());
		//荷主センタ変更対応 201７.02.27 sja End
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		tPickingH.setClientId(clientId);

		// 出庫ヘッダリスト
		for (SqlShippingTagDataOutput body : bodyList) {
			TPickingH pickingH = new TPickingH();
			pickingH.setPickingWorkNo(body.getPickingWorkNo()); //出庫作業No.
			tPickingHList.add(pickingH);
		}

		// 出庫帳票(検索用)
		tPickingRSearch.setControlNo(controlNo);

		// 送り状データリスト出力データ取得.コントロールNo更新メソッドを呼出し
		selectLogic.updateControlNo(tPickingHList, head, tPickingRUpdate, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));

		// ===== 取得データ組み立て =====

		// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start

		// ===== 送り状データ出力データ取得 =====
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
//		List<TAllocInstH> selectAllocList = selectLogic.selectTAllocInstH(tPickingRSearch, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		centerCondition.setCenterId(centerId);
		List<TAllocInstH> selectAllocList = selectLogic.selectTAllocInstH(tPickingRSearch, centerCondition, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 取得データから運送業者を確認
		CarrierType carrierType = getCarrierType(selectAllocList, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 出力データ作成 =====
		// 出力データ
		ArrayList<LinkedHashMap<String, String>> exportData = null;
		// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
		// 文字コード
		String exportCharsets = CHARSETS;
		// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana End
		switch (carrierType) {
		case YAMATO:
			exportData = getYmtEexportData(selectAllocList);
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
			String ymtCharsets = selectAllocList.get(0).chaseMDeliveryCourse().chaseMCarrierSlipYmt().getCharacterCd();
			if (!CU.isNullOrEmpty(ymtCharsets)) {
				exportCharsets = ymtCharsets;
			}
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana SEnd
			break;
		case SAGAWA:
			// [C-CWMS-0023] 佐川送り状対応 2015.03.28 kawana Start
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  Start
//			exportData = getSawgaEexportData(selectAllocList);
			if (selectAllocList.get(0).chaseMDeliveryCourse().isTagDataType$2()) {
				// 送り状データ種別が「2：E飛伝」の場合
				exportData = getSawgaEexportData(selectAllocList);
			}else {
				// 送り状データ種別が「3：E飛伝Pro」の場合
				exportData = getSawgaProEexportData(selectAllocList);
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  End
			// [C-CWMS-0023] 佐川送り状対応 2015.03.28 kawana End
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
			String sgwCharsets = selectAllocList.get(0).chaseMDeliveryCourse().chaseMCarrierSlipSgw().getCharacterCd();
			if (!CU.isNullOrEmpty(sgwCharsets)) {
				exportCharsets = sgwCharsets;
			}
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana SEnd
			break;
		case YOUPACK:
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  Start
//			exportData = getYupkEexportData(selectAllocList);
			if (selectAllocList.get(0).chaseMDeliveryCourse().isTagDataType$4()) {
				// 送り状データ種別が「4：ゆうパックプリントR（発送予定）」の場合
				exportData = getYupkEexportData(selectAllocList);
			}
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
			else if(selectAllocList.get(0).chaseMDeliveryCourse().isTagDataType$5()) {
				// 送り状データ種別が「5：ゆうパックプリントR(発送履歴)」の場合
				// ===== 送り状データ出力データ取得 =====
				List<TPackingH> selectPackingList = selectLogic.selectTPackingH(tPickingRSearch, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
				if (0 < getErrorManager().size()) {
					return null;
				}
				// ===== 出力データ作成 =====
				exportData = getHYupkEexportData(selectPackingList);
			}else if(selectAllocList.get(0).chaseMDeliveryCourse().isTagDataType$6()){
				// 送り状データ種別が「6：発送確定データフォーマット」の場合
				List<TPackingH> selectPackingList = selectLogic.selectTPackingH(tPickingRSearch, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
				// ===== 出力データ作成 =====
				exportData = getCYupkEexportData(selectPackingList);
			}else if(selectAllocList.get(0).chaseMDeliveryCourse().isTagDataType$7()){
				// 送り状データ種別が「7：大口FDデータフォーマット」の場合
				List<TPackingH> selectPackingList = selectLogic.selectTPackingH(tPickingRSearch, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
				// ===== 出力データ作成 =====
				exportData = getLargeFDYupkEexportData(selectPackingList);
			}
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  End
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
			String youpackCharsets = selectAllocList.get(0).chaseMDeliveryCourse().chaseMCarrierSlipYupk().getCharacterCd();
			if (!CU.isNullOrEmpty(youpackCharsets)) {
				exportCharsets = youpackCharsets;
			}
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana SEnd
			break;
		case OTHER:
			return null;
		}

		// ===== 帳票発行処理 =====

		// ファイル名を取得
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
//		String csvName = getFileName(carrierType);
		String csvName = getFileName(selectAllocList.get(0).chaseMDeliveryCourse());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End
		// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
		this.getFile(shippingTagDataOutputDto, exportData, csvName, exportCharsets);
		// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana End

		// ===== 出庫帳票更新 =====
		tPickingRUpdate.setControlNo(null);
		tPickingRUpdate.setInvoiceCreateFlg_$1();
		Timestamp time = new Timestamp(System.currentTimeMillis());
		tPickingRUpdate.setInvoiceCreateDt(time);

		// ピッキングリスト発行データ取得.出庫帳票更新メソッドを呼出し
		selectLogic.tPickingRUpdate(tPickingRUpdate, tPickingRSearch, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));

		// 完了メッセージを設定
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End
		return shippingTagDataOutputDto;
	}

	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start

	private CarrierType getCarrierType(List<TAllocInstH> list, ErrorStatus errSts) {
		CarrierType carrier = CarrierType.OTHER;
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
		String tagDataType = null;
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End

		boolean isFirst = true;
		for (TAllocInstH h : list) {

			CarrierType currentCarrier;
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
			String currentTagDataType = null;
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End

			if (h.chaseMDeliveryCourse().getCarrierSlipYmtId() != null) {
				currentCarrier = CarrierType.YAMATO;
			} else if (h.chaseMDeliveryCourse().getCarrierSlipSgwId() != null) {
				currentCarrier = CarrierType.SAGAWA;
			} else if (h.chaseMDeliveryCourse().getCarrierSlipYupkId() != null) {
				currentCarrier = CarrierType.YOUPACK;
			} else {
				// 配送コースに紐付く送り状データ定義が存在しない
				this.getErrorManager().add(errSts, WmsMessageConst.CARRIER_SLIP_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR);
				return CarrierType.OTHER;
			}

			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
			if (h.chaseMDeliveryCourse().getTagDataType() == null) {
				// 配送コースに紐付く送り状データ定義が存在しない
				this.getErrorManager().add(errSts, WmsMessageConst.CARRIER_SLIP_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR);
				return CarrierType.OTHER;
			}
			currentTagDataType = h.chaseMDeliveryCourse().getTagDataType();

			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End

			if (isFirst) {
				carrier = currentCarrier;
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
				tagDataType = currentTagDataType;
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End
				isFirst = false;
				continue;
			} else {
				// 異なる運送業者が選択されている
				if (carrier != currentCarrier) {
					this.getErrorManager().add(errSts, WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_CARRIER_TO_ERROR);
					return CarrierType.OTHER;
				}
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
				// 異なる送り状データ種別のデータが選択されている
				if (!tagDataType.equals(currentTagDataType)) {
					this.getErrorManager().add(errSts, WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_DATA_TYPE_ERROR);
					return CarrierType.OTHER;
				}
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End
			}

		}

		return carrier;
	}

	// [ON推-品向-422] ファイル名のハードコーディングを修正 2015.01.08 kawana Start
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
//	private String getFileName(CarrierType carrierType) {
//
//		String messageCd = null;
//		switch (carrierType) {
//		case YAMATO:
//			messageCd = WmsMessageConst.SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_YMT_INFORMATION;
//			break;
//		case SAGAWA:
//			messageCd = WmsMessageConst.SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_SGW_INFORMATION;
//			break;
//		case YOUPACK:
//			messageCd = WmsMessageConst.SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_YUPK_INFORMATION;
//			break;
//		default:
//			return "slipData";
//		}
//
//		BMessage message = new BMessage();
//		message.setMessageCd(messageCd);
//		BMessage fileNameMessage = messageLogic.getUkEntity(message);
//
//		if (fileNameMessage != null) {
//			return fileNameMessage.getMessageNm();
//		} else {
//			return "slipData";
//		}
//	}

    private String getFileName(MDeliveryCourse mDeliveryCourse) {
    	String csvName =  null;

		if (mDeliveryCourse.getTagDataType() != null) {
			csvName = mDeliveryCourse.chaseMCenterClassDtlByTagDataType().chaseVDict().getDictNm();
		} else {
			csvName = "slipData";
		}

		SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyyMMddHHmmss");
		Date curDate = new Date(System.currentTimeMillis());
		csvName = csvName + '_' + dateFormat.format(curDate);

		return csvName;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End
	// [ON推-品向-422] ファイル名のハードコーディングを修正 2015.01.08 kawana End

	private ArrayList<LinkedHashMap<String, String>> getYmtEexportData(List<TAllocInstH> listA) throws UnsupportedEncodingException {

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();

		for (TAllocInstH allocH : listA) {

			LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();

			// 出庫作業No.
			String pickingWorkNo = allocH.chaseTPickingH().getPickingWorkNo();

			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}

			// ヤマト送り状定義テーブル
			MCarrierSlipYmt mYamato = allocH.chaseMDeliveryCourse().chaseMCarrierSlipYmt();
			// 送り状種別
			String slipType = mYamato.getSlipType();

			// [EC-CT1-160] 住所3を32バイトまでを設定(ここから削除して下に移動) 2015.03.30 kawana

			// [EC-CT1-168] 下5桁からフル桁に変更 2015.04.01 kawana Start
			// お客様管理番号
			dataMap.put("1", pickingWorkNo);
			// [EC-CT1-168] 下5桁からフル桁に変更 2015.04.01 kawana End
			// 送り状種別
			dataMap.put("2", slipType);
			// クール区分
			dataMap.put("3", mYamato.getCoolCls());
			// 伝票番号
			dataMap.put("4", null);
			// [#3272] センタ別ロケール対応(帳票用Util使用をWCUに変更) 2018.01.17 kawana Start
			// 出荷予定日
			dataMap.put("5", WCU.stringToDateString(allocH.getShippingDt()));
			// お届け予定(指定)日
			dataMap.put("6", WCU.stringToDateString(allocH.getDelivDt()));
			// [#3272] センタ別ロケール対応(帳票用Util使用をWCUに変更) 2018.01.17 kawana End
			// 配達時間帯 (マッチングマスタより設定)
			MMatching delivTzC = new MMatching();
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana Start
			delivTzC.setMatchingType("WMS_TO_YAMATO_DELIV_TZ");
			delivTzC.setMatchingKeyword(allocH.getDelivTz());
			MMatching delivTzEntity = matchingLogic.getUkEntity(delivTzC);
			if (delivTzEntity == null) {
				dataMap.put("7", "");
			} else {
				dataMap.put("7", delivTzEntity.getTransformCd());
			}
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana End
			// お届け先コード
			dataMap.put("8", null);
			// お届け先電話番号
			if ("3".equals(slipType) || "6".equals(slipType)) {
				// メール便(送り状種別が3or6、ハードコーディングで問題無し)のみ出庫ヘッダ.出庫作業No.の下５桁
				dataMap.put("9", pickingWorkNoLastFive);
			} else {
				dataMap.put("9", allocH.getDelivTelNo());
			}
			// お届け先電話番号枝番
			dataMap.put("10", null);
			// お届け先郵便番号
			dataMap.put("11", allocH.getDelivZipCd());
			// [EC-CT1-160] 住所3を32バイトまでを設定 2015.03.30 kawana Start
			// 住所3を32バイトで分割
			String[] splitAddr3 = CU.splitBytes(CU.nullToStr(allocH.getDelivAddress3()), 32, CHARSETS);
			// お届け先住所
			String delivAddress1 = new StringBuilder()
					.append(CU.nullToStr(allocH.getDelivAddress1()))
					.append(CU.nullToStr(allocH.getDelivAddress2()))
					.append(splitAddr3[0]).toString();
			// お届け先住所(アパートマンション名)
			String delivAddress2 = null;
			if (1 < splitAddr3.length) {
				delivAddress2 = splitAddr3[1];
			}
			// お届け先住所
			dataMap.put("12", delivAddress1);
			// お届け先住所(アパートマンション名)
			dataMap.put("13", delivAddress2);
			// [EC-CT1-160] 住所3を32バイトまでを設定 2015.03.30 kawana End
			// お届け先会社・部門名１ 25文字
			dataMap.put("14", null);
			// お届け先会社・部門名２ 25文字
			String[] splitDelivSupply = CU.splitBytes(allocH.getDelivAddressSupply(), 25, CHARSETS);
			dataMap.put("15", splitDelivSupply[0]);
			// お届け先名 32バイト
			String[] splitDelivNm = CU.splitBytes(allocH.getDelivCustomerNm(), 32, CHARSETS);
			dataMap.put("16", splitDelivNm[0]);
			// お届け先名略称カナ
			dataMap.put("17", null);
			// 敬称 4バイト
			String[] splitHhonorific = CU.splitBytes(mYamato.getHonorific(), 4, CHARSETS);
			dataMap.put("18", splitHhonorific[0]);
			// ご依頼主コード
			dataMap.put("19", null);
			// ご依頼主電話番号
			dataMap.put("20", mYamato.getSlipClientTelNo());
			// ご依頼主電話番号枝番
			dataMap.put("21", null);
			// ご依頼主郵便番号
			dataMap.put("22", mYamato.getSlipClientZipCd());
			// [EC-CT1-160] ご依頼主住所を分割 2015.03.30 kawana Start
			// 住所3を32バイトで分割
			String[] splitClientAddr3 = CU.splitBytes(CU.nullToStr(mYamato.getSlipClientAddress3()), 32, CHARSETS);
			// ご依頼主住所
			String slipClientAddress1 = new StringBuilder()
					.append(CU.nullToStr(mYamato.getSlipClientAddress1()))
					.append(CU.nullToStr(mYamato.getSlipClientAddress2()))
					.append(splitClientAddr3[0]).toString();
			// ご依頼主住所(アパートマンション名)
			String[] splitClientAddr4 = CU.splitBytes(mYamato.getSlipClientAddress4(), 32, CHARSETS);
			String slipClientAddress2 = splitClientAddr4[0];
			// ご依頼主住所
			dataMap.put("23", slipClientAddress1);
			// ご依頼主住所
			dataMap.put("24", slipClientAddress2);
			// [EC-CT1-160] ご依頼主住所を分割 2015.03.30 kawana End
			// ご依頼主名 23バイト + 【 出庫作業No.の下５桁 】 (計 32バイト)
			String[] splitSlipClientNm = CU.splitBytes(mYamato.getSlipClientNm(), 23, CHARSETS);
			dataMap.put("25", CU.nullToStr(splitSlipClientNm[0]) + "【" + pickingWorkNoLastFive + "】");
			// ご依頼主略称カナ
			dataMap.put("26", null);
			// [EC-CT1-172] 品名コード1,品名コード2,品名2,荷扱い1,荷扱い2を「ヤマト送り状マスタ」から設定 2015.04.02 kawana Start
			// 品名コード１
			String[] splitItemCd1 = CU.splitBytes(mYamato.getSlipItemCd1(), 30, CHARSETS);
			dataMap.put("27", splitItemCd1[0]);
			// 品名１ 50バイト
			String[] splitItemNm1 = CU.splitBytes(mYamato.getSlipItemNm1(), 50, CHARSETS);
			dataMap.put("28", splitItemNm1[0]);
			// 品名コード２
			String[] splitItemCd2 = CU.splitBytes(mYamato.getSlipItemCd2(), 30, CHARSETS);
			dataMap.put("29", splitItemCd2[0]);
			// 品名２
			String[] splitItemNm2 = CU.splitBytes(mYamato.getSlipItemNm2(), 50, CHARSETS);
			dataMap.put("30", splitItemNm2[0]);
			// 荷扱い１
			String[] splitFreightHandling1 = CU.splitBytes(mYamato.getFreightHandling1(), 20, CHARSETS);
			dataMap.put("31", splitFreightHandling1[0]);
			// 荷扱い２
			String[] splitFreightHandling2 = CU.splitBytes(mYamato.getFreightHandling2(), 20, CHARSETS);
			dataMap.put("32", splitFreightHandling2[0]);
			// [EC-CT1-172] 品名コード1,品名コード2,品名2,荷扱い1,荷扱い2を「ヤマト送り状マスタ」から設定 2015.04.02 kawana End
			// 記事
			dataMap.put("33", allocH.getClientShippingNo());
			// [EC-CT1-178] コレクト代金引換額,消費税額は0を設定 2015.04.02 kawana Start
			if ("2".equals(slipType)) {
				// コレクト代金引換額(税込)
				dataMap.put("34", "0");
				// コレクト内消費税額等
				dataMap.put("35", "0");
			} else {
				// コレクト代金引換額(税込)
				dataMap.put("34", null);
				// コレクト内消費税額等
				dataMap.put("35", null);
			}
			// [EC-CT1-178] コレクト代金引換額,消費税額は0を設定 2015.04.02 kawana End
			// 営業所止置き 0固定
			dataMap.put("36", "0");
			// 営業所コード
			dataMap.put("37", null);
			// 発行枚数 梱包ヘッダ数
			int packingCount = allocH.getPackingCount();
			if (0 < packingCount) {
				dataMap.put("38", CU.convertNumberToString(packingCount));
			} else {
				dataMap.put("38", "1");
			}
			// 個数口枠の印字 2固定
			dataMap.put("39", "2");
			// ご請求先顧客コード
			dataMap.put("40", mYamato.getBillingCustomerCd());
			// ご請求先分類コード
			dataMap.put("41", null);
			// 運賃管理番号
			dataMap.put("42", mYamato.getFareNo());
			// 注文時カード払いデータ登録 0固定
			dataMap.put("43", "0");
			// 注文時カード払い加盟店番号
			dataMap.put("44", null);
			// 注文時カード払い申込受付番号１
			dataMap.put("45", null);
			// 注文時カード払い申込受付番号２
			dataMap.put("46", null);
			// 注文時カード払い申込受付番号３
			dataMap.put("47", null);
			// お届け予定eメール利用区分 0固定
			dataMap.put("48", "0");
			// お届け予定eメールe-mailアドレス
			dataMap.put("49", null);
			// 入力機種 1固定
			dataMap.put("50", "1");
			// お届け予定eメールメッセージ
			dataMap.put("51", null);
			// お届け完了eメール利用区分 0固定
			dataMap.put("52", "0");
			// お届け完了eメールe-mailアドレス
			dataMap.put("53", null);
			// お届け完了eメールメッセージ
			dataMap.put("54", null);
			// クロネコ収納代行利用区分 0固定
			dataMap.put("55", "0");
			// 収納代行決済ＱＲコード印刷
			dataMap.put("56", null);
			// 収納代行請求金額(税込)
			dataMap.put("57", null);
			// 収納代行内消費税額等
			dataMap.put("58", null);
			// 収納代行請求先郵便番号
			dataMap.put("59", null);
			// 収納代行請求先住所
			dataMap.put("60", null);
			// 収納代行請求先住所(アパートマンション名)
			dataMap.put("61", null);
			// 収納代行請求先会社・部門名１
			dataMap.put("62", null);
			// 収納代行請求先会社・部門名２
			dataMap.put("63", null);
			// 収納代行請求先名(漢字)
			dataMap.put("64", null);
			// 収納代行請求先名(カナ)
			dataMap.put("65", null);
			// 収納代行問合せ先名(漢字)
			dataMap.put("66", null);
			// 収納代行問合せ先郵便番号
			dataMap.put("67", null);
			// 収納代行問合せ先住所
			dataMap.put("68", null);
			// 収納代行問合せ先住所(アパートマンション名)
			dataMap.put("69", null);
			// 収納代行問合せ先電話番号
			dataMap.put("70", null);
			// 収納代行管理番号
			dataMap.put("71", null);
			// 収納代行品名
			dataMap.put("72", null);
			// 収納代行備考
			dataMap.put("73", null);

			exportData.add(dataMap);
		}

		return exportData;
	}

	// [C-CWMS-0023] 佐川送り状対応 2015.03.28 kawana Start
	private ArrayList<LinkedHashMap<String, String>> getSawgaEexportData(List<TAllocInstH> listA) {

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();

		for (TAllocInstH allocH : listA) {

			LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();

			// 佐川送り状定義テーブル
			MCarrierSlipSgw mSagawa = allocH.chaseMDeliveryCourse().chaseMCarrierSlipSgw();

			// 出庫作業No.
			String pickingWorkNo = allocH.chaseTPickingH().getPickingWorkNo();

			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}

			// 住所録コード
			dataMap.put("1", null);
			// お届け先電話番号
			dataMap.put("2", allocH.getDelivTelNo());
			// お届け先郵便番号
			dataMap.put("3", allocH.getDelivZipCd());
			// お届け先住所１（必頇）
			String delivAddress = new StringBuilder()
					.append(CU.nullToStr(allocH.getDelivAddress1()))
					.append(CU.nullToStr(allocH.getDelivAddress2()))
					.append(CU.nullToStr(allocH.getDelivAddress3()))
					.toString();
			delivAddress = CU.getFullString(delivAddress);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivAddr1 = CU.splitChars(delivAddress, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("4", splitDelivAddr1[0]);
			// お届け先住所２
			if (1 < splitDelivAddr1.length) {
				dataMap.put("5", splitDelivAddr1[1]);
			} else {
				dataMap.put("5", null);
			}
			// お届け先住所３
			if (2 < splitDelivAddr1.length) {
				dataMap.put("6", splitDelivAddr1[2]);
			} else {
				dataMap.put("6", null);
			}
			// お届け先名称１（必頇）
			String delivNm = CU.getFullString(allocH.getDelivCustomerNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivNm = CU.splitChars(delivNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("7", splitDelivNm[0]);
			// お届け先名称２
			if (1 < splitDelivNm.length) {
				dataMap.put("8", splitDelivNm[1]);
			} else {
				dataMap.put("8", null);
			}
			// [EC-CT1-169] 下5桁からフル桁に変更 2015.04.01 kawana Start
			// お客様管理ナンバー
			dataMap.put("9", pickingWorkNo);
			// [EC-CT1-169] 下5桁からフル桁に変更 2015.04.01 kawana End
			// お客様コード
			dataMap.put("10", mSagawa.getSlipCustomerCd());
			// 部署・担当者
			String consignorNm = CU.getFullString(mSagawa.getDeptConsignorNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitConsignorNm = CU.splitChars(consignorNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("11", splitConsignorNm[0]);
			// 荷送人電話番号
			dataMap.put("12", mSagawa.getConsignorTelNo());
			// ご依頼主電話番号
			dataMap.put("13", mSagawa.getSlipClientTelNo());
			// ご依頼主郵便番号
			dataMap.put("14", mSagawa.getSlipClientZipCd());
			// ご依頼主住所１
			String slipClientAddress1 = CU.getFullString(mSagawa.getSlipClientAddress1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress1 = CU.splitChars(slipClientAddress1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("15", splitSlipClientAddress1[0]);
			// ご依頼主住所２
			String slipClientAddress2 = CU.getFullString(mSagawa.getSlipClientAddress2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress2 = CU.splitChars(slipClientAddress2, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("16", splitSlipClientAddress2[0]);
			// ご依頼主名称１
			String SlipClientNm1 = CU.getFullString(mSagawa.getSlipClientNm1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm1 = CU.splitChars(SlipClientNm1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("17", splitSlipClientNm1[0]);
			// [EC-CT1-170] 依頼主名の後に【出庫作業No下5桁】を追加 2015.04.01 kawana Start
			// ご依頼主名称２
			String SlipClientNm2 = CU.getFullString(mSagawa.getSlipClientNm2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm2 = CU.splitChars(SlipClientNm2, 9);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("18", CU.nullToStr(splitSlipClientNm2[0]) + CU.getFullString("【" + pickingWorkNoLastFive + "】"));
			// [EC-CT1-170] 依頼主名の後に【出庫作業No下5桁】を追加 2015.04.01 kawana End
			// 荷姿コード
			// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #425] 荷姿コードを佐川送り状マスタから取得する方法に戻す 2016.12.15 nayzaw Start
			dataMap.put("19", mSagawa.getSlipShapeCd());
			// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #425] 荷姿コードを佐川送り状マスタから取得する方法に戻す 2016.12.15 nayzaw End
			// 品名１
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String slipItemNm1 = mSagawa.getSlipItemNm1();
			if (isSingleByteChars(slipItemNm1, 32, CHARSETS)) {
				dataMap.put("20", CU.splitChars(slipItemNm1, 32)[0]);
			} else {
				dataMap.put("20", CU.splitChars(slipItemNm1, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名２
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String slipItemNm2 = mSagawa.getSlipItemNm2();
			if (isSingleByteChars(slipItemNm2, 32, CHARSETS)) {
				dataMap.put("21", CU.splitChars(slipItemNm2, 32)[0]);
			} else {
				dataMap.put("21", CU.splitChars(slipItemNm2, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名３
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String slipItemNm3 = mSagawa.getSlipItemNm3();
			if (isSingleByteChars(slipItemNm3, 32, CHARSETS)) {
				dataMap.put("22", CU.splitChars(slipItemNm3, 32)[0]);
			} else {
				dataMap.put("22", CU.splitChars(slipItemNm3, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名４
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String slipItemNm4 = mSagawa.getSlipItemNm4();
			if (isSingleByteChars(slipItemNm4, 32, CHARSETS)) {
				dataMap.put("23", CU.splitChars(slipItemNm4, 32)[0]);
			} else {
				dataMap.put("23", CU.splitChars(slipItemNm4, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// [EC-CT1-174] 「佐川送り状マスタ」の品名5を優先する 2015.04.01 kawana Start
			// 品名５
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String slipItemNm5 = mSagawa.getSlipItemNm5();
			if (CU.isNullOrEmpty(slipItemNm5)) {
				slipItemNm5 = allocH.getClientShippingNo();
			}
			if (isSingleByteChars(slipItemNm5, 32, CHARSETS)) {
				dataMap.put("24", CU.splitChars(slipItemNm5, 32)[0]);
			} else {
				dataMap.put("24", CU.splitChars(slipItemNm5, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// [EC-CT1-174] 「佐川送り状マスタ」の品名5を優先する 2015.04.01 kawana End
			// 出荷個数
			int packingCount = allocH.getPackingCount();
			if (0 < packingCount) {
				dataMap.put("25", CU.convertNumberToString(packingCount));
			} else {
				dataMap.put("25", "1");
			}
			// 便種（スピードで選択）
			dataMap.put("26", mSagawa.getTransportTypeSpeed());
			// 便種（商品）
			dataMap.put("27", mSagawa.getTransportTypeItem());
			// 配達日
			dataMap.put("28", allocH.getDelivDt());
			// 配達指定時間帯 (マッチングマスタより設定)
			MMatching delivTzC = new MMatching();
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana Start
			delivTzC.setMatchingType("WMS_TO_SAGAWA_DELIV_TZ");
			delivTzC.setMatchingKeyword(allocH.getDelivTz());
			MMatching delivTzEntity = matchingLogic.getUkEntity(delivTzC);
			if (delivTzEntity == null) {
				dataMap.put("29", "");
			} else {
				dataMap.put("29", delivTzEntity.getTransformCd());
			}
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana End
			// 配達指定時間（時分）
			dataMap.put("30", null);
			// 代引金額
			dataMap.put("31", "0");
			// 消費税
			dataMap.put("32", "0");
			// [ON推-品向-789] 送り状マスタから設定 2015.04.20 kawana Start
			// 決済種別
			dataMap.put("33", mSagawa.getSettlementType());
			// [ON推-品向-789] 送り状マスタから設定 2015.04.20 kawana End
			// 保険金額
			dataMap.put("34", "0");
			// 保険金額印字
			dataMap.put("35", "0");
			// [ON推-品向-789] 送り状マスタから設定 2015.04.20 kawana Start
			// 指定シール①
			dataMap.put("36", mSagawa.getSealType1());
			// 指定シール②
			dataMap.put("37", mSagawa.getSealType2());
			// 指定シール③
			dataMap.put("38", mSagawa.getSealType3());
			// [ON推-品向-789] 送り状マスタから設定 2015.04.20 kawana End
			// 営業店止め
			dataMap.put("39", "0");
			// ＳＲＣ区分
			dataMap.put("40", "0");
			// 営業店コード
			dataMap.put("41", null);
			// [ON推-品向-789] 送り状マスタから設定 2015.04.20 kawana Start
			// 元着区分
			dataMap.put("42", mSagawa.getCodCls());
			// [ON推-品向-789] 送り状マスタから設定 2015.04.20 kawana End

			// データを追加
			exportData.add(dataMap);
		}

		return exportData;
	}

	// [C-CWMS-0023] 佐川送り状対応 2015.03.28 kawana End

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  Start
	private ArrayList<LinkedHashMap<String, String>> getSawgaProEexportData(List<TAllocInstH> listA) {

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();

		for (TAllocInstH allocH : listA) {

			LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();

			// 佐川送り状定義テーブル
			MCarrierSlipSgw mSagawa = allocH.chaseMDeliveryCourse().chaseMCarrierSlipSgw();

			// 出庫作業No.
			String pickingWorkNo = allocH.chaseTPickingH().getPickingWorkNo();

			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}

			//ご依頼主コード（必頇）
			dataMap.put("1", mSagawa.getSlipCustomerCd());
			//部署ご担当者コード
			dataMap.put("2", null);
			//部署ご担当者名
			String consignorNm = CU.getFullString(mSagawa.getDeptConsignorNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitConsignorNm = CU.splitChars(consignorNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("3", splitConsignorNm[0]);
			//ご依頼主電話
			dataMap.put("4", mSagawa.getSlipClientTelNo());
			//お届け先コード
			dataMap.put("5", null);
			//お届け先郵便番号
			dataMap.put("6", allocH.getDelivZipCd());
			// お届け先名称１（必頇）
			String delivNm = CU.getFullString(allocH.getDelivCustomerNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivNm = CU.splitChars(delivNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("7", splitDelivNm[0]);
			// お届け先名称２
			if (1 < splitDelivNm.length) {
				dataMap.put("8", splitDelivNm[1]);
			} else {
				dataMap.put("8", null);
			}
			// お届け先住所１（必頇）
			String delivAddress = new StringBuilder()
					.append(CU.nullToStr(allocH.getDelivAddress1()))
					.append(CU.nullToStr(allocH.getDelivAddress2()))
					.append(CU.nullToStr(allocH.getDelivAddress3()))
					.toString();
			delivAddress = CU.getFullString(delivAddress);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivAddr1 = CU.splitChars(delivAddress, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("9", splitDelivAddr1[0]);
			// お届け先住所２
			if (1 < splitDelivAddr1.length) {
				dataMap.put("10", splitDelivAddr1[1]);
			} else {
				dataMap.put("10", null);
			}
			// お届け先住所３
			if (2 < splitDelivAddr1.length) {
				dataMap.put("11", splitDelivAddr1[2]);
			} else {
				dataMap.put("11", null);
			}
			//お届け先電話
			dataMap.put("12", allocH.getDelivTelNo());
			//ご不在連絡先
			dataMap.put("13", null);
			//メールアドレス
			dataMap.put("14", null);
			//代行ご依頼主コード
			dataMap.put("15", mSagawa.getSlipCustomerCd());
			//代行ご依頼主郵便番号
			dataMap.put("16", mSagawa.getSlipClientZipCd());
			//代行ご依頼主名１
			String SlipClientNm1 = CU.getFullString(mSagawa.getSlipClientNm1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm1 = CU.splitChars(SlipClientNm1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("17", splitSlipClientNm1[0]);
			//代行ご依頼主名２
			String SlipClientNm2 = CU.getFullString(mSagawa.getSlipClientNm2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm2 = CU.splitChars(SlipClientNm2, 9);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("18", CU.nullToStr(splitSlipClientNm2[0]) + CU.getFullString("【" + pickingWorkNoLastFive + "】"));
			//代行ご依頼主住所１
			String slipClientAddress1 = CU.getFullString(mSagawa.getSlipClientAddress1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress1 = CU.splitChars(slipClientAddress1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("19", splitSlipClientAddress1[0]);
			//代行ご依頼主住所２
			String slipClientAddress2 = CU.getFullString(mSagawa.getSlipClientAddress2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress2 = CU.splitChars(slipClientAddress2, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			dataMap.put("20", splitSlipClientAddress2[0]);
			//代行ご依頼主住所３
			dataMap.put("21", null);
			//代行ご依頼主電話
			dataMap.put("22", mSagawa.getSlipClientTelNo());
			//出荷日
			dataMap.put("23", allocH.getShippingDt());
			//発送日
			dataMap.put("24", allocH.getShippingDt());
			//配達指定日
			dataMap.put("25", allocH.getDelivDt());
			//セット数
			dataMap.put("26", null);
			//個数
			int packingCount = allocH.getPackingCount();
			if (0 < packingCount) {
				dataMap.put("27", CU.convertNumberToString(packingCount));
			} else {
				dataMap.put("27", "1");
			}
			//元着区分
			dataMap.put("28", mSagawa.getCodCls());
			//保険金額
			dataMap.put("29", "0");
			//決済種別
			dataMap.put("30", mSagawa.getSettlementType());
			//代引金額
			if (mSagawa.isCodCls$2()) {
				// 着払
				dataMap.put("31", CU.convertNumberToString(CU.nullToZero(allocH.getCod())));
			} else {
				dataMap.put("31", "0");
			}
			//代引税金額
			dataMap.put("32", "0");
			//消費税区分
			dataMap.put("33", null);
			//問い合わせNo.
			dataMap.put("34", null);
			//旧問い合わせNo.
			dataMap.put("35", null);
			//顧客管理番号
			dataMap.put("36", null);
			//営止め区分
			dataMap.put("37", "0");
			//営止精算店コード
			dataMap.put("38", null);
			//クール指定区分
			dataMap.put("39", "0");
			//便種コード
			dataMap.put("40", mSagawa.getTransportTypeItem());
			//時間帯コード
			MMatching delivTzC = new MMatching();
			delivTzC.setMatchingType("WMS_TO_SAGAWA_DELIV_TZ");
			delivTzC.setMatchingKeyword(allocH.getDelivTz());
			MMatching delivTzEntity = matchingLogic.getUkEntity(delivTzC);
			if (delivTzEntity == null) {
				dataMap.put("41", "");
			} else {
				dataMap.put("41", delivTzEntity.getTransformCd());
			}
			//配達時間指定
			dataMap.put("42", null);
			//シールコード１
			dataMap.put("43", mSagawa.getSealType1());
			//シールコード２
			dataMap.put("44", mSagawa.getSealType2());
			//シールコード３
			dataMap.put("45", mSagawa.getSealType3());
			//シールコード４
			dataMap.put("46", null);
			//出荷区分
			dataMap.put("47", null);
			//出荷場印字区分
			dataMap.put("48", null);
			//保険金額印字区分
			dataMap.put("49", "0");
			//集約解除指定区分
			dataMap.put("50", null);
			//編集０１
			dataMap.put("51", null);
			//編集０２
			dataMap.put("52", null);
			//編集０３
			dataMap.put("53", null);
			//編集０４
			dataMap.put("54", null);
			//編集０５
			dataMap.put("55", null);
			//編集０６
			dataMap.put("56", null);
			//編集０７
			dataMap.put("57", null);
			//編集０８
			dataMap.put("58", null);
			//編集０９
			dataMap.put("59", null);
			//編集１０
			dataMap.put("60", null);
			//重量１個数
			dataMap.put("61", null);
			//重量２個数
			dataMap.put("62", null);
			//重量３個数
			dataMap.put("63", null);
			//重量４個数
			dataMap.put("64", null);
			//重量５個数
			dataMap.put("65", null);
			//重量６個数
			dataMap.put("66", null);
			//重量７（値）
			dataMap.put("67", null);
			//重量７単位
			dataMap.put("68", null);
			//重量７個数
			dataMap.put("69", null);
			//重量８（値）
			dataMap.put("70", null);
			//重量８単位
			dataMap.put("71", null);
			//重量８個数
			dataMap.put("72", null);

			// データを追加
			exportData.add(dataMap);
		}

		return exportData;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  End

	private ArrayList<LinkedHashMap<String, String>> getYupkEexportData(List<TAllocInstH> listA) {

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> row1 = new LinkedHashMap<String, String>();

		for (int i = 0; i < listA.size(); i++) {

			// ゆうぱっく送り状定義テーブル
			MCarrierSlipYupk mYoupack = listA.get(i).chaseMDeliveryCourse().chaseMCarrierSlipYupk();

			row1.put("1", null);
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana Start
			row1.put("2", listA.get(i).getShippingDt());
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana End
			row1.put("3", null);
			row1.put("4", null);
			// [ON推-品向-842] 到着期限日に納品日を設定 2015.07.02 kawana Start
			row1.put("5", listA.get(i).getDelivDt());
			// [ON推-品向-842] 到着期限日に納品日を設定 2015.07.02 kawana End
			row1.put("6", mYoupack.getPostType());
			row1.put("7", mYoupack.getCoolType());
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana Start
			row1.put("8", mYoupack.getCodType());
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana End
			row1.put("9", null);
			row1.put("10", null);
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana Start
			row1.put("11", CU.splitBytes(CU.nullToStr(mYoupack.getCarrierType()), 20, CHARSETS)[0]);
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana End
			row1.put("12", null);
			row1.put("13", listA.get(i).getDelivZipCd());
			row1.put("14", listA.get(i).getDelivAddress1());
			row1.put("15", listA.get(i).getDelivAddress2());
			row1.put("16", listA.get(i).getDelivAddress3());
			row1.put("17", listA.get(i).getDelivCustomerNm());
			row1.put("18", null);
			row1.put("19", null);
			row1.put("20", listA.get(i).getDelivTelNo());
			row1.put("21", null);
			row1.put("22", null);
			row1.put("23", null);
			row1.put("24", null);
			row1.put("25", null);
			row1.put("26", null);
			row1.put("27", null);
			row1.put("28", null);
			row1.put("29", null);
			row1.put("30", mYoupack.getSlipClientZipCd());
			row1.put("31", mYoupack.getSlipClientAddress1());
			row1.put("32", mYoupack.getSlipClientAddress2());
			row1.put("33", mYoupack.getSlipClientAddress3());
			row1.put("34", mYoupack.getSlipClientNm1());
			row1.put("35", null);
			row1.put("36", null);
			row1.put("37", mYoupack.getSlipClientTelNo());
			row1.put("38", mYoupack.getSlipClientMail());
			row1.put("39", null);
			row1.put("40", null);
			row1.put("41", null);
			row1.put("42", null);
			row1.put("43", null);
			row1.put("44", null);
			row1.put("45", null);
			row1.put("46", null);
			row1.put("47", null);
			row1.put("48", null);
			row1.put("49", null);
			row1.put("50", null);
			row1.put("51", null);
			row1.put("52", null);
			row1.put("53", null);
			row1.put("54", null);
			row1.put("55", null);
			row1.put("56", null);
			row1.put("57", null);
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana Start
			row1.put("58", mYoupack.getNoUpsideDownCls());
			row1.put("59", mYoupack.getNoStockCls());
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana End
			row1.put("60", mYoupack.getSlipProductSizeCls());
			row1.put("61", null);
			row1.put("62", null);
			row1.put("63", null);
			row1.put("64", null);
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana Start
			row1.put("65", listA.get(i).getDelivDt());
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana End

			// [#1867] 時間帯区分の変換をマッチングマスタを使用するように修正 2017.06.07 kawana Start
			// お届け希望時間
			MMatching delivTzC = new MMatching();
			delivTzC.setMatchingType("WMS_TO_YUPACK_DELIV_TZ");
			delivTzC.setMatchingKeyword(listA.get(i).getDelivTz());
			MMatching delivTzEntity = matchingLogic.getUkEntity(delivTzC);
			if (delivTzEntity == null) {
				row1.put("66", "00");
			} else {
				row1.put("66", delivTzEntity.getTransformCd());
			}
			// [#1867] 時間帯区分の変換をマッチングマスタを使用するように修正 2017.06.07 kawana End

			row1.put("67", null);
			row1.put("68", null);
			row1.put("69", null);
			row1.put("70", null);
			row1.put("71", null);
			row1.put("72", null);
			row1.put("73", null);
			row1.put("74", null);
			row1.put("75", null);
			row1.put("76", null);
			row1.put("77", null);
			row1.put("78", null);
			row1.put("79", null);
			row1.put("80", null);
			row1.put("81", null);
			row1.put("82", null);
			row1.put("83", null);
			row1.put("84", null);
			row1.put("85", null);
			row1.put("86", null);
			row1.put("87", null);
			row1.put("88", null);
			row1.put("89", null);
			row1.put("90", null);
			row1.put("91", null);
			row1.put("92", null);
			row1.put("93", null);
			row1.put("94", null);
			row1.put("95", null);
			row1.put("96", null);
			row1.put("97", null);
			row1.put("98", null);
			row1.put("99", null);
			row1.put("100", null);
			row1.put("101", null);
			row1.put("102", null);
			row1.put("103", mYoupack.getSlipProductNo());
			row1.put("104", mYoupack.getSlipItemNm());
			row1.put("105", null);
			row1.put("106", null);
			row1.put("107", null);
			row1.put("108", null);
			row1.put("109", null);
			row1.put("110", null);
			row1.put("111", null);
			row1.put("112", null);
			row1.put("113", null);
			row1.put("114", null);
			row1.put("115", null);
			row1.put("116", null);
			row1.put("117", null);
			row1.put("118", null);
			exportData.add(row1);
			row1 = new LinkedHashMap<String, String>();
		}
		return exportData;
	}

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  Start
	private ArrayList<LinkedHashMap<String, String>> getHYupkEexportData(List<TPackingH> listA) {

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> row1 = new LinkedHashMap<String, String>();

		String pickingWorkNo = null;
		String carrierTraceNum = null;
		String currentPickingWorkNo = null;
		String currentCarrierTraceNum = null;
		boolean isFirst = true;
		for (int i = 0; i < listA.size(); i++) {
			currentPickingWorkNo = listA.get(i).chaseTPickingH().getPickingWorkNo();
			currentCarrierTraceNum = CU.nullToStr(listA.get(i).getCarrierTraceNum());

			// 出庫作業No.、貨物追跡No.単位に出力
			if (isFirst || !pickingWorkNo.equals(currentPickingWorkNo) || !carrierTraceNum.equals(currentCarrierTraceNum)) {

				// お客様側管理番号
				row1.put("1", CU.getFullString(currentPickingWorkNo));
				// お問い合わせ番号
				row1.put("2", currentCarrierTraceNum);
				// 発送日;
				row1.put("3", listA.get(i).chaseTAllocInstH().getShippingDt());
				// 配達希望日
				row1.put("4", listA.get(i).chaseTAllocInstH().getDelivDt());
				// 配達時間帯区分
				MMatching delivTzC = new MMatching();
				// [品質検査 機能 #589] マッチング種類が間違っている為修正 2017.1.16 nayzaw Start
				delivTzC.setMatchingType("WMS_TO_YUPACK_DELIV_TZ");
				// [品質検査 機能 #589] マッチング種類が間違っている為修正 2017.1.16 nayzaw End
				delivTzC.setMatchingKeyword(listA.get(i).chaseTAllocInstH().getDelivTz());
				MMatching delivTzEntity = matchingLogic.getUkEntity(delivTzC);
				if (delivTzEntity == null) {
					row1.put("5", "");
				} else {
					row1.put("5", delivTzEntity.getTransformCd());
				}

				exportData.add(row1);
				row1 = new LinkedHashMap<String, String>();

				isFirst = false;
				pickingWorkNo = currentPickingWorkNo;
				carrierTraceNum = currentCarrierTraceNum;
            }

		}
		return exportData;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
	private ArrayList<LinkedHashMap<String, String>> getCYupkEexportData(List<TPackingH> listA){

		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> row1 = new LinkedHashMap<String, String>();

		for (int i = 0; i < listA.size(); i++) {

			MCarrierSlipYupk mYoupack = listA.get(i).getTAllocInstH().chaseMDeliveryCourse().getMCarrierSlipYupk();

			// ファイル識別コード
			row1.put("1", FILE_IDENTIFICATION_CODE);
			// 発送日
			row1.put("2",listA.get(i).getTAllocInstH().getShippingDt());
			// 発送時刻
			row1.put("3", null);
			// 商品種別コード
			row1.put("4", mYoupack.getProductTypeCode());
			// 注意コード
			row1.put("5", null);
			// 伝票個数
			row1.put("6", String.valueOf(listA.get(i).getShippingInstHCount()));
			// お問い合わせ番号
			if(listA.get(i).getCarrierTraceNum() == null){
				row1.put("7", "");
			}else{
				row1.put("7", listA.get(i).getCarrierTraceNum());
			}
			// お客様側管理番号
			row1.put("8", listA.get(i).getTPickingH().getPickingWorkNo());
			// 複数個口代表お問い合わせ番号
			// 出庫ヘッダに紐付く、出荷梱包ヘッダ.貨物追跡No.の最小値(複数個口の時のみ)
			if(listA.get(i).getPackingHCount() > 1 ){
				row1.put("9",listA.get(i).getMinCarrierTraceNum());
			}else{
				row1.put("9","");
			}
			// ゆうびんビズカードお客さま番号
			row1.put("10", mYoupack.getPostBizCardCustomerNo());
			// (旧ＪＰＥｘ顧客コード)
			row1.put("11", null);
			// ご依頼主名
			// 全角50文字もしくは半角100文字
			String[] slipClientNm = CU.splitBytes(CU.nullToStr(mYoupack.getSlipClientNm1()), 100, CHARSETS);
			row1.put("12",slipClientNm[0]);
			// （ご依頼主名１）
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			row1.put("13", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// （ご依頼主名２）
			row1.put("14", null);
			// ご依頼主電話番号
			row1.put("15", mYoupack.getSlipClientTelNo());
			// ご依頼主郵便番号
			row1.put("16", mYoupack.getSlipClientZipCd());
			// ご依頼主住所
			// 全半角150文字まで
			String slipClientAddress = new StringBuilder()
					.append(CU.nullToStr(mYoupack.getSlipClientAddress1()))
					.append(CU.nullToStr(mYoupack.getSlipClientAddress2()))
					.append(CU.nullToStr(mYoupack.getSlipClientAddress3())).toString();

			if(slipClientAddress != null && slipClientAddress.length() > 150){
				slipClientAddress = slipClientAddress.substring(0,150);
			}
			row1.put("17", slipClientAddress);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			// （ご依頼主住所１）
			row1.put("18", null);
			// （ご依頼主住所２）
			row1.put("19", null);
			// （ご依頼主住所３）
			row1.put("20", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// お届け先名
			// 全角50文字もしくは半角100文字
			String[] delivCustomerNm = CU.splitBytes(CU.nullToStr( listA.get(i).getTAllocInstH().getDelivCustomerNm()), 100, CHARSETS);
			row1.put("21", delivCustomerNm[0]);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			// （お届け先名１）
			row1.put("22", null);
			// （お届け先名２）
			row1.put("23", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// お届け先電話番号
			row1.put("24", listA.get(i).getTAllocInstH().getDelivTelNo());
			// お届け先郵便番号
			row1.put("25", listA.get(i).getTAllocInstH().getDelivZipCd());
			// お届け先住所
			// 全半角150文字まで
			String delivAddress = new StringBuilder()
			.append(CU.nullToStr(listA.get(i).getTAllocInstH().getDelivAddress1()))
			.append(CU.nullToStr(listA.get(i).getTAllocInstH().getDelivAddress2()))
			.append(CU.nullToStr(listA.get(i).getTAllocInstH().getDelivAddress3())).toString();

			if(delivAddress != null && delivAddress.length() > 150){
				delivAddress = delivAddress.substring(0, 150);
			}
			row1.put("26", delivAddress);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			// （お届け先住所１）
			row1.put("27", null);
			// （お届け先住所２）
			row1.put("28", null);
			// （お届け先住所３）
			row1.put("29", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// お届け先住所コード
			row1.put("30", null);
			// お届け希望年月日
			row1.put("31", listA.get(i).getTAllocInstH().getDelivDt());

			// [#1867] 時間帯区分の変換をマッチングマスタを使用するように修正 2017.06.07 kawana Start
			// お届け希望時間
			MMatching delivTzC = new MMatching();
			delivTzC.setMatchingType("WMS_TO_YUPACK_DELIV_TZ");
			delivTzC.setMatchingKeyword(listA.get(i).chaseTAllocInstH().getDelivTz());
			MMatching delivTzEntity = matchingLogic.getUkEntity(delivTzC);
			if (delivTzEntity == null) {
				row1.put("32", "00");
			} else {
				row1.put("32", delivTzEntity.getTransformCd());
			}
			// [#1867] 時間帯区分の変換をマッチングマスタを使用するように修正 2017.06.07 kawana End

			// 以降配達コード
			row1.put("33", null);
			// 代金引換金額
			if(listA.get(i).getMaxCod() != null){
				row1.put("34", listA.get(i).getMaxCod());
			}else{
				row1.put("34", "");
			}
			// 消費税額等
			if(listA.get(i).getMaxCodTax() != null){
				row1.put("35", listA.get(i).getMaxCodTax());
			}else{
				row1.put("35", "");
			}
			//品名
			String slipItemNm = mYoupack.getSlipItemNm();
			if(slipItemNm != null && slipItemNm.length() > 60){
				slipItemNm = slipItemNm.substring(0, 60);
			}
			row1.put("36", slipItemNm);
			// （品名１）
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			row1.put("37", null);
			// （品名２）
			row1.put("38", null);
			// （品名３）
			row1.put("39", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// 損害要償額
			row1.put("40", null);

			if(listA.get(i).getBoxId() != null && listA.get(i).getTAllocInstH().getMDeliveryCourse().getCarrierId() != null){
				String boxSizeCd = selectLogic.selectBoxSizeCd(listA.get(i).getTAllocInstH().getMDeliveryCourse().getCarrierId(), listA.get(i).getBoxId());
				if(boxSizeCd != null){
					if(boxSizeCd.equals(BOX_SIZE_60)){
						boxSizeCd = BOX_SIZE_060;
					}
					else if(boxSizeCd.equals(BOX_SIZE_80)){
						boxSizeCd = BOX_SIZE_080;
					}
				}
				row1.put("41", boxSizeCd);
			}else{
				row1.put("41", null);
			}
			// 記事
			row1.put("42", null);
			// （記事１）
			row1.put("43", null);
			// （記事２）
			row1.put("44", null);
			// 復路集荷先電話番号
			row1.put("45", null);
			// 復路集荷日
			row1.put("46", null);
			// 発送会社コード
			row1.put("47", mYoupack.getShippingCompanyCode());
			// 発送局コード
			row1.put("48", mYoupack.getShipmentCode());
			// 配達予告メールサービス
			row1.put("49", null);
			// 配達完了メールサービス
			row1.put("50", null);
			// 不在持戻メールサービス
			row1.put("51", null);
			// 郵便局留めメールサービス
			row1.put("52", null);
			// 配達予告メールアドレス
			row1.put("53", null);
			// 配達完了メールアドレス１
			row1.put("54", null);
			// 配達完了メールアドレス２
			row1.put("55", null);
			// 配達完了メールアドレス３
			row1.put("56", null);
			// 配達完了メールアドレス４
			row1.put("57", null);
			// 配達完了メールアドレス５
			row1.put("58", null);
			// 不在持戻通知先メールアドレス
			row1.put("59", null);
			// 郵便局留め通知メールアドレス１
			row1.put("60", null);
			// 郵便局留め通知メールアドレス２
			row1.put("61", null);
			// 配達希望日前倒し
			row1.put("62", null);
			// 商品表示
			row1.put("63", null);
			// 集荷持込区分
			row1.put("64", null);
			// プレー日／搭乗日
			row1.put("65", null);
			// 搭乗便名
			row1.put("66", null);
			// 割引パターン
			row1.put("67", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			// 受付店控え
			row1.put("68", "0");
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// 自由使用欄
			row1.put("69", null);
			exportData.add(row1);
			row1 = new LinkedHashMap<String, String>();
		}

		return exportData;
	}

	private ArrayList<LinkedHashMap<String, String>> getLargeFDYupkEexportData(List<TPackingH> listA){
		ArrayList<LinkedHashMap<String, String>> exportData = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> row1 = new LinkedHashMap<String, String>();
		for (int i = 0; i < listA.size(); i++) {

			MCarrierSlipYupk mYoupack = listA.get(i).getTAllocInstH().chaseMDeliveryCourse().getMCarrierSlipYupk();

			// ファイル識別コード
			row1.put("1", FILE_IDENTIFICATION_CODE );
			// 発送日
			row1.put("2", listA.get(i).getTAllocInstH().getShippingDt());
			// 発送時刻
			row1.put("3", null);
			// 郵便種別コード
			row1.put("4", null);
			// 特殊取扱コード
			row1.put("5", null);
			// お問い合わせ番号
			if(listA.get(i).getCarrierTraceNum() == null){
				row1.put("6", "");
			}else{
				row1.put("6", listA.get(i).getCarrierTraceNum());
			}
			// お客様側管理番号
			row1.put("7", listA.get(i).getTPickingH().getPickingWorkNo());
			// ゆうびんビズカードお客さま番号
			row1.put("8", mYoupack.getPostBizCardCustomerNo());
			// (旧ＪＰＥｘ顧客コード)
			row1.put("9", null);
			// お届け先名
			// 全角50文字もしくは半角100文字
			String[] delivCustomerNm = CU.splitBytes(CU.nullToStr( listA.get(i).getTAllocInstH().getDelivCustomerNm()), 100, CHARSETS);
			row1.put("10", delivCustomerNm[0]);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			// （お届け先名１）
			row1.put("11", null);
			// （お届け先名２）
			row1.put("12", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// お届け先電話番号
			row1.put("13", listA.get(i).getTAllocInstH().getDelivTelNo());
			// お届け先郵便番号
			row1.put("14", listA.get(i).getTAllocInstH().getDelivZipCd());
			// お届け先住所
			// 全角150文字もしくは半角150文字
			String delivAddress = new StringBuilder()
			.append(CU.nullToStr(listA.get(i).getTAllocInstH().getDelivAddress1()))
			.append(CU.nullToStr(listA.get(i).getTAllocInstH().getDelivAddress2()))
			.append(CU.nullToStr(listA.get(i).getTAllocInstH().getDelivAddress3())).toString();

			if(delivAddress != null && delivAddress.length() > 150){
				delivAddress = delivAddress.substring(0,150);
			}
			row1.put("15", delivAddress);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			// （お届け先住所１）
			row1.put("16", null);
			// （お届け先住所２）
			row1.put("17", null);
			// （お届け先住所３）
			row1.put("18", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			// 代金引換金額
			if(listA.get(i).getMaxCod() != null){
				row1.put("19", listA.get(i).getMaxCod());
			}else{
				row1.put("19", "");
			}
			// 損害要償額
			row1.put("20", null);
			// 発送会社コード
			row1.put("21", mYoupack.getShippingCompanyCode());
			// 発送局コード
			row1.put("22", mYoupack.getShipmentCode());

			row1.put("23", null);
			row1.put("24", null);
			row1.put("25", null);
			row1.put("26", null);
			row1.put("27", null);
			row1.put("28", null);
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw Start
			row1.put("29", "1");
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #495] 送り状データ出力 日本郵便からの指摘対応 2016.12.20 nayzaw End
			exportData.add(row1);
			row1 = new LinkedHashMap<String, String>();
		}
		return exportData;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/26  End
	// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End

	// [ON推-品向-470] ファイル出力の処理を共通処理の流れに踏襲(Linuxで動作しない問題を改修)のためcreateCSVFile関数を削除 2014.12.24 kawana

	// [ON推-品向-033] パスを選択の方法を削除 2014.11.20 xiangy

	// [ON推-品向-033] プロパティファイルの内容取得を修正 2014.11.20 xiangy Start

	// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
	public void getFile(ShippingTagDataOutputDto shippingTagDataOutputDto, ArrayList<LinkedHashMap<String, String>> exportData, String csvName, String exportCharsets) throws IOException {
		// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana End

		// [#5111][v3.1] csvファイル作成ロジックを共通化 2018.08.30 kawana Start
		String tempFileNm = csvFileLogic.writeTempFileFromListMap(exportData, exportCharsets);

		String mimeType = "text/comma-separated-values";

		shippingTagDataOutputDto.output.downloadUrl = this.getServletContext().getContextPath() + BaseConst.APP_RESOURCE_PATH + BaseConst.DOWNLOAD_RESOURCE_PATH + "/"
				+ URLEncoder.encode(csvName, StandardCharsets.UTF_8.name()) + CsvFileLogic.EXT + "?"
				+ BaseConst.DOWNLOAD_FILE_NAME + "=" + tempFileNm + "&" + BaseConst.DOWNLOAD_MIME_TYPE + "=" + URLEncoder.encode(mimeType, StandardCharsets.UTF_8.name());
		// [#5111][v3.1] csvファイル作成ロジックを共通化 2018.08.30 kawana End
	}
	// [ON推-品向-033] プロパティファイルの内容取得を修正 2014.11.20 xiangy End

	private boolean isSingleByteChars(String str, int len, String charset) {

		String w = CU.nullToStr(str);

		if (w.length() > len) {
			w = w.substring(0, len);
		}

		try {
			if (w.getBytes(charset).length != w.length()) {
				return false;
			} else {
				return true;
			}
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

	}

}
