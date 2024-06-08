package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.cdi.annotation.Authentication;
import com.oneslogi.base.cdi.annotation.Authentication.Mode;
import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.AppCDef;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.SdsCooperationDto;
import com.oneslogi.wms.dto.shipping.ShippingPlanBulkInputDto;
import com.oneslogi.wms.dto.shipping.ShippingSendFromSdsDto;
import com.oneslogi.wms.dto.shipping.ShippingSendFromSdsDtoBody;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.MatchingLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputCheckStatusLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputRegisterLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanDeleteLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * SDS出荷指示取込のリソースクラス。
 */
@Path("/shipping/shippingInstSds")
public class ShippingInstSdsResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
		/**
		 * 異常終了
		 */
		protected static final int ERR = 2;
		/**
		 * マッチングマスタ存在異常
		 */
		protected static final int MATCHING_NOT_FOUND = 6;
		// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
		/**
		 * 出庫指示済みデータ存在異常
		 */
		protected static final int PICKING_DATA_FOUND = 7;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 8;
		// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End
		/**
		 * 出荷日警告
		 */
		protected static final int SHIPPINGDT_CAVEAT = 9;
		// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama End

	}

	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ShippingPlanBulkInputCheckStatusLogic shippingPlanBulkInputCheckStatusLogic;
	@Inject
	private ShippingPlanBulkInputRegisterLogic shippingPlanBulkInputRegisterLogic;
	@Inject
	private MatchingLogic matchingLogic;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	@Inject
	private ShippingPlanDeleteLogic deleteLogic;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * </pre>
	 * @param sdsCooperationDto SDS連携DTO
	 * @return Response
	 */
	@POST
	@Path("/sdsSendFromSdsCheck")
	@Authentication(Mode.OFF)
	@CheckBase(CheckMode.TYPE_NOT_CHECK)
	public Response sdsSendFromSdsCheck(SdsCooperationDto sdsCooperationDto) {

		try{
			// マッチングマスタ確認用
			HashMap<String, String> matchingKeyWordList = new HashMap<String, String>();

			// データチェック
			inputCheck(sdsCooperationDto, matchingKeyWordList, null);

			// データチェックが正常の場合
			if(sdsCooperationDto.getErrCd() == 0){

				// システム日付取得
				MClientCenter condition = new MClientCenter();
				condition.setClientId(sdsCooperationDto.getResultList().get(0).getClientId());
				condition.setCenterId(sdsCooperationDto.getResultList().get(0).getCenterId());
				String systemDate = clientCenterLogic.getUkEntityWithDeletedCheck(condition).getSystemDt();

				// 出荷日チェック
				if(CU.isNullOrEmpty(systemDate)){
					sdsCooperationDto.setErrCd(StatusCode.ERR);
				} else if (systemDate.compareTo(sdsCooperationDto.getResultList().get(0).getShippingDt()) > 0) {
					sdsCooperationDto.setErrCd(StatusCode.SHIPPINGDT_CAVEAT);
				}else{
					sdsCooperationDto.setErrCd(StatusCode.SUCCESS);
				}
			}
			managerClear();
			return Response.ok(sdsCooperationDto).build();

		}catch (Exception e) {

			managerClear();
			sdsCooperationDto.setErrCd(StatusCode.ERR);
			return Response.ok(sdsCooperationDto).build();
		}
	}
	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama End

	// コメント追加 2016.02.04 koyama Start
	/**
	 * <h2>出荷指示登録。</h2>
	 * <pre>
	 * データベースにデータを登録する。
	 * </pre>
	 * @param SdsCooperationDto SDS連携DTO
	 * @return Response
	 */
	// コメント追加 2016.02.04 koyama End
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	@POST
	@Path("/sdsSendFromSds")
	@Authentication(Mode.OFF)
	@CheckBase(CheckMode.TYPE_NOT_CHECK)
	public Response sdsSendFromSds(SdsCooperationDto sdsCooperationDto) throws Exception {

		try {
			// マッチングマスタ確認用
			HashMap<String, String> matchingKeyWordList = new HashMap<String, String>();
			// 出荷データ削除用
			List<TShippingInstH> deleteListTShippingInstH = new ArrayList<TShippingInstH>();

			// データチェック
			inputCheck(sdsCooperationDto, matchingKeyWordList, deleteListTShippingInstH);

			// 受信用Dto設定
			List<ShippingSendFromSdsDto> shippingSendFromSdsDtoList = new ArrayList<ShippingSendFromSdsDto>();
			shippingSendFromSdsDtoList = sdsCooperationDto.getResultList();

			// USER設定
			if (AccessContext.isExistAccessContextOnThread()) {
				AccessContext context = AccessContext.getAccessContextOnThread();
				context.setAccessUser(matchingKeyWordList.get("LOGIN_USER"));
				AccessContext.setAccessContextOnThread(context);
			}

			// 削除処理
			if (deleteListTShippingInstH.size() != 0) {
				// コントロールNo.を採番（ロジッククラスを呼ぶ）
				Long controlNo = numberingCenterLogic.getControlNo();

				//コントロールNo.更新
				int updateCnt = updateControlNoLogic.update(deleteListTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

				if (updateCnt != deleteListTShippingInstH.size()) {
					managerClear();
					sdsCooperationDto.setErrCd(StatusCode.ERR);
					return Response.ok(sdsCooperationDto).build();
				}

				// [ON推-CT113-024] SDS連携修正(キャンセル処理追加) 2016.01.25 koyama Start
				// 出荷指示キャンセル処理
				deleteLogic.Cancel(controlNo);
				// [ON推-CT113-024] SDS連携修正(キャンセル処理追加) 2016.01.25 koyama End

				// 出荷指示データ削除処理
				deleteLogic.delete(controlNo);

				//コントロールNo.のクリア処理
				for (TShippingInstH list : deleteListTShippingInstH) {
					list.setControlNo(controlNo);
				}
				controlNo = null;

				// 削除フラグの条件付加を停止する
				this.setBehaviorAutoDelFlg(false);

				//コントロールNo.更新
				updateControlNoLogic.update(deleteListTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

				// 削除フラグの条件付加を開始する
				this.setBehaviorAutoDelFlg(true);

			}

			// 出荷指示予定Dto
			ShippingPlanBulkInputDto shippingPlanBulkInputDto = new ShippingPlanBulkInputDto();

			// 荷主
			Long clientId = shippingSendFromSdsDtoList.get(0).getClientId();
			String clientCd = shippingSendFromSdsDtoList.get(0).getClientCd();
			shippingPlanBulkInputDto.data.head.getMClient().setClientCd(clientCd);

			// センタマスタ存在チェック
			Long centerId = shippingSendFromSdsDtoList.get(0).getCenterId();
			String centerCd = shippingSendFromSdsDtoList.get(0).getCenterCd();
			shippingPlanBulkInputDto.data.head.getMCenter().setCenterCd(centerCd);

			// システム日付取得
			MClientCenter condition = new MClientCenter();
			condition.setClientId(clientId);
			condition.setCenterId(centerId);
			String systemDate = clientCenterLogic.getUkEntityWithDeletedCheck(condition).getSystemDt();


			int shippingRow = 0;
			// 出荷指示ヘッダループ
			for (ShippingSendFromSdsDto shippingSendFromSds : shippingSendFromSdsDtoList) {
				// 出荷指示ボディループ
				for (ShippingSendFromSdsDtoBody shippingSendFromSdsDtoBody : shippingSendFromSds.getTShippingInstBDtoList()) {

					// 使用DTO生成
					TShippingInstBDto tShippingInstBDto = new TShippingInstBDto();
					TShippingInstHDto tShippingInstHDtoIn = new TShippingInstHDto();
					MProcessTypeDto mProcessTypeDtoIn = new MProcessTypeDto();
					MCustomerDto mCustomerDtoIn = new MCustomerDto();
					MProductDto mProductDtoIn = new MProductDto();
					MDeliveryCourseDto mDeliveryCourseDtoIn = new MDeliveryCourseDto();

					// 出荷指示DTO生成
					tShippingInstBDto.setTShippingInstH(tShippingInstHDtoIn);
					tShippingInstBDto.getTShippingInstH().setMProcessType(mProcessTypeDtoIn);
					tShippingInstBDto.getTShippingInstH().setMCustomerBySupplyCustomerId(mCustomerDtoIn);
					tShippingInstBDto.setMProduct(mProductDtoIn);
					tShippingInstBDto.getTShippingInstH().setMDeliveryCourse(mDeliveryCourseDtoIn);

					// 緊急フラグ
					tShippingInstBDto.getTShippingInstH().setEmergencyFlg(matchingKeyWordList.get("EMERGENCY_FLG"));

					// 顧客出荷指示No.
					tShippingInstBDto.getTShippingInstH().setClientShippingNo(shippingSendFromSds.getClientShippingNo());

					// 納品先情報
					MCustomer mSupplyCustomerEntity = new MCustomer();
					mSupplyCustomerEntity.setClientId(clientId);
					mSupplyCustomerEntity.setCustomerCd(shippingSendFromSds.getSupplyCustomerCd());
					MCustomer resultMSupplyCustomerEntity = customerLogic.getUkEntity(mSupplyCustomerEntity);
					tShippingInstBDto.getTShippingInstH().getMCustomerBySupplyCustomerId().setCustomerCd(shippingSendFromSds.getSupplyCustomerCd());
					if (resultMSupplyCustomerEntity != null) {
						MCustomerDtoMapper mapperMSupplyCustomer = new MCustomerDtoMapper();
						MCustomerDto mSupplyCustomerDto = mapperMSupplyCustomer.mappingToDto(resultMSupplyCustomerEntity);
						tShippingInstBDto.getTShippingInstH().getMCustomerBySupplyCustomerId().setCustomerNm(mSupplyCustomerDto.getCustomerNm());
						tShippingInstBDto.getTShippingInstH().getMCustomerBySupplyCustomerId().setCustomerAbbr(mSupplyCustomerDto.getCustomerAbbr());
						// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start
						tShippingInstBDto.getTShippingInstH().getMCustomerBySupplyCustomerId().setOnetimeFlg(mSupplyCustomerDto.getOnetimeFlg());
						// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End
					}

					// 処理区分
					tShippingInstBDto.getTShippingInstH().getMProcessType().setProcessTypeCd(matchingKeyWordList.get("PROCESS_TYPE"));

					// 作業日
					if (systemDate != null) {
						tShippingInstBDto.getTShippingInstH().setWorkDt(systemDate);
					}

					// 出荷日
					tShippingInstBDto.getTShippingInstH().setShippingDt(shippingSendFromSds.shippingDt);

					// 商品情報
					MProduct mProductEntity = new MProduct();
					mProductEntity.setClientId(clientId);
					mProductEntity.setProductCd(shippingSendFromSdsDtoBody.getProductCd());
					MProduct resultMProductEntity = productLogic.getUkEntity(mProductEntity);
					tShippingInstBDto.getMProduct().setProductCd(shippingSendFromSdsDtoBody.getProductCd());
					if (resultMProductEntity != null) {
						MProductDtoMapper mapperMProduct = new MProductDtoMapper();
						MProductDto mProductDto = mapperMProduct.mappingToDto(resultMProductEntity);

						tShippingInstBDto.getMProduct().setProductNm(mProductDto.getProductNm());
						tShippingInstBDto.getMProduct().setProductAbbr(mProductDto.getProductAbbr());
						tShippingInstBDto.getMProduct().setJanCd(mProductDto.getJanCd());
					}

					// 預託情報
					tShippingInstBDto.setDepositCd(matchingKeyWordList.get("DEPOSIT_CD"));

					// 在庫区分
					tShippingInstBDto.setStockTypeCd(matchingKeyWordList.get("STOCK_TYPE_CD"));

					// 指示数
					if (shippingSendFromSdsDtoBody.getInstNum() != null) {
						tShippingInstBDto.setInstNum(shippingSendFromSdsDtoBody.getInstNum());
					}

					// 届先情報
					MCustomer mDeliveryCustomerEntity = new MCustomer();
					mDeliveryCustomerEntity.setClientId(clientId);
					mDeliveryCustomerEntity.setCustomerCd(shippingSendFromSds.getDelivCustomerCd());
					MCustomer resultMDeliveryCustomerEntity = customerLogic.getUkEntity(mDeliveryCustomerEntity);
					tShippingInstBDto.getTShippingInstH().setDelivCustomerCd(shippingSendFromSds.getDelivCustomerCd());
					if (resultMDeliveryCustomerEntity != null) {
						MCustomerDtoMapper mapperMDeliveryCustomer = new MCustomerDtoMapper();
						MCustomerDto mDeliveryCustomerDto = mapperMDeliveryCustomer.mappingToDto(resultMDeliveryCustomerEntity);

						// ワンタイム判定処理
						MCustomerDto deliveryCustomer = new MCustomerDto();
						deliveryCustomer.setOnetimeFlg(mDeliveryCustomerDto.getOnetimeFlg());
						MCustomerDtoMapper mapper = new MCustomerDtoMapper();
						MCustomer deliveryCustomerEntity = mapper.mappingToEntity(deliveryCustomer);

						// ワンタイムフラグの場合
						if (deliveryCustomerEntity.isOnetimeFlg$1()) {
							tShippingInstBDto.getTShippingInstH().setDelivCustomerNm(shippingSendFromSds.getDelivCustomerNm());
							tShippingInstBDto.getTShippingInstH().setDelivAddress1(shippingSendFromSds.getDelivAddress1());
							tShippingInstBDto.getTShippingInstH().setDelivAddress2(shippingSendFromSds.getDelivAddress2());
							tShippingInstBDto.getTShippingInstH().setDelivAddress3(shippingSendFromSds.getDelivAddress3());
							tShippingInstBDto.getTShippingInstH().setDelivTelNo(shippingSendFromSds.getDelivTelNo());
							tShippingInstBDto.getTShippingInstH().setDelivZipCd(shippingSendFromSds.getDelivZipCd());
						}
					}

					// 出荷指示予定Dtoに追加
					shippingPlanBulkInputDto.data.shippingPlan.add(tShippingInstBDto);
				}

				// 登録データの組み立て
				shippingPlanBulkInputCheckStatusLogic.CheckStatus(shippingPlanBulkInputDto, null);

				getErrorManager().clear();

				// 登録
				//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Mod Start
				shippingPlanBulkInputRegisterLogic.register(shippingPlanBulkInputDto, centerCd, clientCd,  null);
				//[ON推-1.1.4-CT-047]CT指摘の修正対応 2016.06.01 chou Mod End

				// 出荷指示ヘッダID設定
				sdsCooperationDto.getResultList().get(shippingRow).setShippingInstHId(shippingPlanBulkInputDto.data.shippingPlan.get(0).getTShippingInstH().getShippingInstHId());

				shippingPlanBulkInputDto.data.shippingPlan.clear();
				shippingRow++;
			}

			// 修正 2016.02.04 koyama Start
			managerClear();
			sdsCooperationDto.setErrCd(StatusCode.SUCCESS);
			return Response.ok(sdsCooperationDto).build();
			// 修正 2016.02.04 koyama End

		} catch (Exception e) {
			managerClear();
			sdsCooperationDto.setErrCd(StatusCode.ERR);
			return Response.ok(sdsCooperationDto).build();
		}
		// 削除修正 2016.02.04 koyama Start

	}
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
	/**
	 * <h2>データチェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * </pre>
	 * @param sdsCooperationDto SDS連携DTO
	 * @return sdsCooperationDto SDS連携DTO
	 */
	private void inputCheck(SdsCooperationDto sdsCooperationDto, HashMap<String, String> matchingKeyWordList, List<TShippingInstH> deleteListTShippingInstH) {

		// 受信用Dto設定
		List<ShippingSendFromSdsDto> shippingSendFromSdsDtoList = new ArrayList<ShippingSendFromSdsDto>();
		shippingSendFromSdsDtoList = sdsCooperationDto.getResultList();

		// マッチングマスタ確認CD一覧
		matchingKeyWordList.put("EMERGENCY_FLG", "");
		matchingKeyWordList.put("PROCESS_TYPE", "");
		matchingKeyWordList.put("DEPOSIT_CD", "");
		matchingKeyWordList.put("STOCK_TYPE_CD", "");
		matchingKeyWordList.put("LOGIN_USER", "");

		// マッチングマスタ存在チェック
		String matchingType = "SDS";
		for (String matchingKeyWord : matchingKeyWordList.keySet()) {
			MMatching mMatching = new MMatching();
			mMatching.setMatchingType(matchingType);
			mMatching.setMatchingKeyword(matchingKeyWord);
			MMatching transFormCd = matchingLogic.getUkEntity(mMatching);

			if (transFormCd == null) {
				// [ON推-CT113-024] SDS連携修正 2016.01.26 koyama Start
				sdsCooperationDto.setErrCd(StatusCode.MATCHING_NOT_FOUND);
				// [ON推-CT113-024] SDS連携修正 2016.01.26 koyama End
				return;
			}
			matchingKeyWordList.put(matchingKeyWord, transFormCd.getTransformCd());
		}

		// 荷主マスタ存在チェック
		MClient clientEntity = new MClient();
		clientEntity.setClientCd(shippingSendFromSdsDtoList.get(0).getClientCd());
		MClient resultClientEntity = clientLogic.getUkEntity(clientEntity);

		if(resultClientEntity == null){
			sdsCooperationDto.setErrCd(StatusCode.ERR);
			return;
		}
		sdsCooperationDto.getResultList().get(0).setClientId(resultClientEntity.getClientId());
		sdsCooperationDto.getResultList().get(0).setClientCd(resultClientEntity.getClientCd());

		// センタマスタ存在チェック
		MCenter centerEntity = new MCenter();
		centerEntity.setCenterCd(shippingSendFromSdsDtoList.get(0).getCenterCd());
		MCenter resultCenterEntity = centerLogic.getUkEntity(centerEntity);
		if(resultCenterEntity == null){
			sdsCooperationDto.setErrCd(StatusCode.ERR);
			return;
		}
		sdsCooperationDto.getResultList().get(0).setCenterId(resultCenterEntity.getCenterId());
		sdsCooperationDto.getResultList().get(0).setCenterCd(resultCenterEntity.getCenterCd());

		// データのステータスチェック
		int countTShippingInstH = 0;
		for (int row = 0; row < shippingSendFromSdsDtoList.size(); row++) {

			// 送信済データの場合
			if (shippingSendFromSdsDtoList.get(row).getShippingInstHId() != null) {
				// 検索
				TShippingInstH tShippingInstH = tShippingInstHBhv.selectByPKValue(shippingSendFromSdsDtoList.get(row).getShippingInstHId());

				if (tShippingInstH != null) {
					// 未削除データの場合
					if (AppCDef.ErrorFlg.$0.code().equals(tShippingInstH.getDelFlg())) {
						// ステータス 10:未出荷 または 99:エラー有 の場合
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
						if (AppCDef.PickingStatus.$10.code().equals(tShippingInstH.getShippingStatus())
								|| AppCDef.PickingStatus.$90.code().equals(tShippingInstH.getShippingStatus())
								|| AppCDef.PickingStatus.$99.code().equals(tShippingInstH.getShippingStatus())) {
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
							// 削除処理設定
							TShippingInstH deleteTShippingInstH = new TShippingInstH();
							deleteTShippingInstH.setShippingInstHId(tShippingInstH.getShippingInstHId());
							deleteTShippingInstH.setClientId(tShippingInstH.getClientId());
							deleteTShippingInstH.setCenterId(tShippingInstH.getCenterId());
							deleteTShippingInstH.setShippingSlipNo(tShippingInstH.getShippingSlipNo());
							deleteTShippingInstH.setShippingStatus(tShippingInstH.getShippingStatus());
							deleteTShippingInstH.setUpdDt(tShippingInstH.getUpdDt());
							countTShippingInstH = countTShippingInstH + 1;

							if(deleteListTShippingInstH != null){
								deleteListTShippingInstH.add(deleteTShippingInstH);
							}

						} else {
							// 出庫済データ存在
							sdsCooperationDto.getResultList().get(row).setErrFlg(AppCDef.ErrorFlg.$1.code());
							sdsCooperationDto.setErrCd(StatusCode.PICKING_DATA_FOUND);
							return;
						}
					}
				}
			}
		}
	}
	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama End

	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
	/**
	 * <h2>リターン前処理。</h2>
	 * <pre>
	 *InfoManagerをクリアする。
	 *WarnManagerをクリアする。
	 *ErrorManagerをクリアする。
	 * </pre>
	 */
	private void managerClear() {
		getInfoManager().clear();
		getWarnManager().clear();
		getErrorManager().clear();
	}
	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama End
}
