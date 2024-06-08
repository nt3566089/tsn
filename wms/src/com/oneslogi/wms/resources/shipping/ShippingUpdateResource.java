package com.oneslogi.wms.resources.shipping;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.shipping.ShippingUpdateDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.shipping.ShipResultUpdateLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingUpdateSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷実績訂正画面のリソースクラス。
 */
@Path("/shipping/shippingUpdate")
public class ShippingUpdateResource extends AbstractWmsResource {

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
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_FAILED = 2;
		/**
		 * 引当可能な在庫異常
		 */
		protected static final int ALLOC_CHARGE_NUM_FAILED = 3;
		/**
		 * 出荷実績訂正処理異常
		 */
		protected static final int SHIPPING_UPDATE_FAILED = 4;
		/**
		 * 出荷実績訂正データ取得異常
		 */
		protected static final int SHIPPING_UPDATE_SELECT_FAILED = 5;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND = 6;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND_ERROR =7;
		// [ON推-品向-1144] 実績訂正の完了メッセージのポップアップ表示を修正 2016.07.01 kawana Start
		/**
		 * 正常終了(変更有り)
		 */
		protected static final int SUCCESS_UPDATE = 8;
		// [ON推-品向-1144] 実績訂正の完了メッセージのポップアップ表示を修正 2016.07.01 kawana End
	}

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana Start

	// ===== 使用テーブル =====

	@Inject
	private TPackingBBhv tPackingBBhv;

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana End

	// ===== 使用ロジッククラス =====

	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private ShippingUpdateSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;
	// [1.1.4-CT-055] 出荷実績訂正の再登録を変更(不要な処理を削除) 2016.05.30 kawana
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private ShipResultUpdateLogic shipResultUpdateLogic;
	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana Start
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private MessageLogic messageLogic;
	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana End

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
	 * <h2>初期処理(検索)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @param shippingInstBId 出荷指示ボディID
	 * @return ShippingUpdateDto 出荷実績訂正画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingUpdateDto init(@QueryParam("shippingInstBId") Long shippingInstBId) {
		// ===== 画面用DTO ヘッダの作成 =====
		ShippingUpdateDto shippingUpdateDto = new ShippingUpdateDto();

		TShippingInstB tShippingInstB = new TShippingInstB();
		tShippingInstB.setShippingInstBId(shippingInstBId);

		// 出荷実績訂正データ取得
		List<TShippingInstB> selectEntity = selectLogic.select(tShippingInstB, errRetSts(StatusCode.SHIPPING_UPDATE_SELECT_FAILED));

		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		List<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();
		tShippingInstHList.add(selectEntity.get(0).getTShippingInstH());
		//出荷状態チェック.出荷実績訂正
		shipStatusCheckLogic.shipResultUpdate(tShippingInstHList, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [#3018] グリッドに混載フラグ名称を表示 2018.02.16 kawana Start
		// 混載フラグ名称を取得
		Map<String,String> mixedFlgNmMap = centerClassLogic.getClassMapByCd("MIXED_FLG");
		// [#3018] グリッドに混載フラグ名称を表示 2018.02.16 kawana End

		for (TShippingInstB bodyEntity : selectEntity) {
			if (bodyEntity.getTAllocInstB() != null)
			{
				if (bodyEntity.getTAllocInstB().getTPickingBList().size() > 0)
				{
					bodyEntity.setOldPickingNum(bodyEntity.getTAllocInstB().getTPickingBList().get(0).getPickingNum());

					// [#3018] グリッドに混載フラグ名称を表示 2018.02.16 kawana Start

					for (TPickingB pickingB : bodyEntity.getTAllocInstB().getTPickingBList()) {

						// 混載フラグ設定
						if (pickingB.getShapeId() != null) {
							// ケース出庫

							pickingB.setMixedFlg("0");

							if (existsMixedPacking(pickingB.getPickingBId())) {
								// 表示上は「単品, 混載」
								pickingB.setMixedFlgNm(CU.join(", ", mixedFlgNmMap.get("0"), mixedFlgNmMap.get("1")));
							} else {
								pickingB.setMixedFlgNm(mixedFlgNmMap.get("0"));
							}
						} else {
							// バラ出庫

							pickingB.setMixedFlg("1");
							pickingB.setMixedFlgNm(mixedFlgNmMap.get("1"));
						}
					}

					// [#3018] グリッドに混載フラグ名称を表示 2018.02.16 kawana End
				}
			}
		}

		// JSON通信のためにSimpleDTO変換
		TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper();
		List<TShippingInstBDto> selectDto = mapper.mappingToDtoList(selectEntity);

		shippingUpdateDto.data.head = ShippingUpdateDto.chaseTShippingInstBDto(selectDto.get(0));

		// ===== 画面用DTO ボディの作成 =====
		for (TShippingInstBDto selectBody : selectDto) {
			shippingUpdateDto.data.body.add(ShippingUpdateDto.chaseTShippingInstBDto(selectBody));
		}

		shippingUpdateDto.data.blankRow.setInstNum(WCC.ZERO);
		shippingUpdateDto.data.blankRow.setAllocNum(WCC.ZERO);
		shippingUpdateDto.data.blankRow.setOldPickingNum(WCC.ZERO);
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		shippingUpdateDto.data.blankRow.getTAllocInstB().getTPickingBList().get(0).getTStock().setUnitNum(selectDto.get(0).getTAllocInstB().getTPickingBList().get(0).getTStock().getUnitNum());
		shippingUpdateDto.data.blankRow.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().setAllocNgFlg(selectDto.get(0).getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getAllocNgFlg());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		shippingUpdateDto.data.blankRow.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getBClassDtlByAllocNgFlg().getVDict().setDictNm(selectDto.get(0).getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getBClassDtlByAllocNgFlg().getVDict().getDictNm());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		shippingUpdateDto.data.blankRow.getTShippingInstH().getMCustomerBySupplyCustomerId().setShippingStopFlg(selectDto.get(0).getTShippingInstH().getMCustomerBySupplyCustomerId().getShippingStopFlg());
		shippingUpdateDto.data.blankRow.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict().setDictNm(selectDto.get(0).getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict().getDictNm());
		shippingUpdateDto.data.blankRow.getMProduct().setShippingStopFlg(selectDto.get(0).getMProduct().getShippingStopFlg());
		shippingUpdateDto.data.blankRow.getMProduct().getBClassDtlByShippingStopFlg().getVDict().setDictNm(selectDto.get(0).getMProduct().getBClassDtlByShippingStopFlg().getVDict().getDictNm());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
		// [#3018] グリッドに混載フラグ名称を表示 2018.02.16 kawana Start
		shippingUpdateDto.data.blankRow.getTAllocInstB().getTPickingBList().get(0).setMixedFlg("1");
		shippingUpdateDto.data.blankRow.getTAllocInstB().getTPickingBList().get(0).setMixedFlgNm(mixedFlgNmMap.get("1"));
		// [#3018] グリッドに混載フラグ名称を表示 2018.02.16 kawana End

		return shippingUpdateDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 出荷状態チェックを行う。
	 * </pre>
	 * @param shippingUpdateDto 出荷実績訂正画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws Exception
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ShippingUpdateDto shippingUpdateDto) throws Exception {

		shippingUpdateDto = decodeString(shippingUpdateDto);

		// 入力チェック処理
		setupRegisterData(shippingUpdateDto, errRetSts(StatusCode.SHIPPING_STATUS_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>出荷実績訂正処理。</h2>
	 * <pre>
	 * エラーがない場合は、出荷指示ヘッダと出荷指示ボディを更新し、完了メッセージを設定する。
	 * </pre>
	 * @param shippingUpdateDto 出荷実績訂正画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws Exception
	 */
	@POST
	@Path("/update")
	public StatusDto update(ShippingUpdateDto shippingUpdateDto) throws Exception {

		shippingUpdateDto = decodeString(shippingUpdateDto);

		// 入力チェック処理
		setupRegisterData(shippingUpdateDto, errRetSts(StatusCode.SHIPPING_UPDATE_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> bodyList = bodyMapper.mappingToEntityList(shippingUpdateDto.data.body);
		TShippingInstB header = bodyMapper.mappingToEntity(shippingUpdateDto.data.head);

		//荷主ID取得
		String clientCd = header.getTShippingInstH().getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		header.getTShippingInstH().setClientId(mClient.getClientId());

		//センタID取得
		String centerCd = header.getTShippingInstH().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		header.getTShippingInstH().setCenterId(mCenter.getCenterId());

		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana Start

		List<TPickingB> pickingBList = new ArrayList<TPickingB>();

		for (TShippingInstB body : bodyList) {
			// 出庫ボディを抜出
			pickingBList.add(body.getTAllocInstB().getTPickingBList().get(0));

		}

		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana End

		TShippingInstH entity = tShippingInstHBhv.newMyEntity();
		entity.setShippingInstHId(header.getTShippingInstH().getShippingInstHId());
		entity.setVersionNo(header.getTShippingInstH().getVersionNo());
		tShippingInstHBhv.update(entity);

		// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana Start
		// [ON推-品向-1144] 実績訂正の完了メッセージのポップアップ表示を修正 2016.07.01 kawana Start

		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana Start
		//出荷実績訂正.出荷実績訂正
		ShipResultUpdateLogic.UpdateInfo updateInfo =
				shipResultUpdateLogic.update(header.getTShippingInstH(), header, header.getTAllocInstB().getTAllocInstH().getTPickingH(), pickingBList, errRetSts(StatusCode.SHIPPING_UPDATE_FAILED));
		// [1.1.4-CT-055] 出荷実績訂正の再登録を変更 2016.05.30 kawana End
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 完了メッセージの設定
		addUpdateSuccessMessage(updateInfo);

		// [ON推-品向-1144] 実績訂正の完了メッセージのポップアップ表示を修正 2016.07.01 kawana End
		// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana End

		return null;
	}

	/**
	 * <h2>入力チェック処理。</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * ロケーションマスタ存在チェックを行う
	 * </pre>
	 * @param shippingUpdateDto 出荷実績訂正画面用DTO
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return StatusDto 処理結果DTO
	 * @throws Exception
	 */
	protected StatusDto setupRegisterData(ShippingUpdateDto shippingUpdateDto, ErrorStatus errSts) throws Exception {

		shippingUpdateDto = decodeString(shippingUpdateDto);

		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> bodyList = bodyMapper.mappingToEntityList(shippingUpdateDto.data.body);
		TShippingInstB header = bodyMapper.mappingToEntity(shippingUpdateDto.data.head);

		List<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();
		List<TShippingInstB> tShippingInstBList = new ArrayList<TShippingInstB>();
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>();
		List<TPickingB> tPickingBList = new ArrayList<TPickingB>();

		tShippingInstBList.add(header);
		tShippingInstHList.add(header.getTShippingInstH());

		//出荷状態チェック.出荷実績訂正
		shipStatusCheckLogic.shipResultUpdate(tShippingInstHList, tShippingInstBList, tPickingHList, tPickingBList, errSts);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//センタID取得
		String centerCd = header.getTShippingInstH().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		header.getTShippingInstH().setCenterId(mCenter.getCenterId());

		//荷主ID取得
		String clientCd = header.getTShippingInstH().getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		header.getTShippingInstH().setClientId(mClient.getClientId());

		MCustomer mCustomer = new MCustomer();
		mCustomer.setClientId(mClient.getClientId());
		mCustomer.setCustomerCd(header.getTShippingInstH().getSupplyCustomerCd());
		mCustomer = customerLogic.getUkEntity(mCustomer,errRetSts(errSts, StatusCode.CUSTOMER_NOT_FOUND_ERROR));
		if (mCustomer == null) {
			return null;
		}

		for (int row = 0; row < bodyList.size(); row++) {

			// ロケーションの設定
			MLocation mLocation = new MLocation();
			mLocation.setCenterId(mCenter.getCenterId());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			mLocation.setLocationCd(bodyList.get(row).getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getLocationCd());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			mLocation = locationLogic.getUkEntity(mLocation, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, row));

			if (mLocation == null) {
				return null;
			}
			if(mLocation.isAllocNgFlg$1()&&WCC.isPositive(bodyList.get(row).getTAllocInstB().getTPickingBList().get(0).getPickingNum()))
			{
				getErrorManager().add(new ErrorStatus(StatusCode.SHIPPING_UPDATE_FAILED), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
				return null;
			}

		}

		return null;
	}

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.20 kawana Start

	/**
	 * 出荷実績訂正の完了メッセージの登録
	 */
	private void addUpdateSuccessMessage(ShipResultUpdateLogic.UpdateInfo updateInfo) {

		if (!updateInfo.doUpdate) {
			// 更新なし

			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
			return;
		}

		// ===== 置換文字列の作成 =====

		StringBuilder replaceSb = new StringBuilder();

		if (updateInfo.doChangePacking) {
			// 梱包明細修正あり

			String message = messageLogic.getMessageNm(WmsMessageConst.SHIPPING_UPDATE_COMPLETE_CHANGE_PACKING);
			replaceSb.append(message);
		}

		// 帳票の再発行
		List<String> reportNameList = new ArrayList<String>();

		if (updateInfo.doClearPackingOut) {
			// 納品明細書
			String reportName = messageLogic.getMessageNm(WmsMessageConst.REPORT_NAME_PACKING);
			reportNameList.add(reportName);
		}

		if (updateInfo.doClearTagOut) {
			// 荷札
			String reportName = messageLogic.getMessageNm(WmsMessageConst.REPORT_NAME_TAG);
			reportNameList.add(reportName);
		}

		if (updateInfo.doAddPacking && !updateInfo.doClearTagOut) {
			// 梱包が追加されているけど荷札の再出力はなし

			// 荷札
			String reportName = messageLogic.getMessageNm(WmsMessageConst.REPORT_NAME_TAG);
			reportNameList.add(reportName);
		}

		if (updateInfo.doClearSlipOut) {
			// 送り状
			String reportName = messageLogic.getMessageNm(WmsMessageConst.REPORT_NAME_SLIP);
			reportNameList.add(reportName);
		}

		if (updateInfo.doClearInvoiceCreate) {
			// 送り状データ
			String reportName = messageLogic.getMessageNm(WmsMessageConst.REPORT_NAME_INVOICE);
			reportNameList.add(reportName);
		}

		if (updateInfo.doClearStwOut) {
			// 積込リスト
			String reportName = messageLogic.getMessageNm(WmsMessageConst.REPORT_NAME_STW);
			reportNameList.add(reportName);
		}

		if (!reportNameList.isEmpty()) {
			// 帳票のクリアあり

			String reportNames = CU.join(", ", reportNameList);

			String message = messageLogic.getMessageNm(WmsMessageConst.SHIPPING_UPDATE_COMPLETE_REPRINT_REPORT, reportNames);
			replaceSb.append(message);
		}

		// ===== メッセージの登録 =====

		if (0 < replaceSb.length()) {
			getWarnManager().add(warnRetSts(StatusCode.SUCCESS_UPDATE), WmsMessageConst.SHIPPING_UPDATE_COMPLETE, replaceSb.toString());
		} else {
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.SHIPPING_UPDATE_COMPLETE, replaceSb.toString());
		}
	}

	/**
	 * 混載の梱包が存在するか
	 */
	private boolean existsMixedPacking(long pickingBId) {

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.query().setPickingBId_Equal(pickingBId);
		cb.query().queryTPackingH().setMixedFlg_Equal_$1();

		int count = tPackingBBhv.selectCount(cb);

		if (0 < count) {
			return true;
		} else {
			return false;
		}
	}

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.20 kawana End

	/**
	 * Base64で受け取ったリクエストデータを本来のDtoに変換する。
	 * ※JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為、送信データをコンバートし対応
	 */
	private ShippingUpdateDto decodeString(ShippingUpdateDto dto) throws Exception {

		if (dto.data.headBase64 == null) {
			return dto;
		}

		ShippingUpdateDto retDto = new ShippingUpdateDto();
		ObjectMapper mapper = new ObjectMapper();

		String head = new String(Base64.decodeBase64(dto.data.headBase64), StandardCharsets.UTF_8);
		retDto.data.head = mapper.readValue(head, TShippingInstBDto.class);
		dto.data.headBase64 = null;

		String body = new String(Base64.decodeBase64(dto.data.bodyBase64), StandardCharsets.UTF_8);
		retDto.data.body = mapper.readValue(body, mapper.getTypeFactory().constructCollectionType(List.class, TShippingInstBDto.class));
		dto.data.bodyBase64 = null;

		return retDto;
	}

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動により不要な処理を削除 2015.10.30 kawana

}
