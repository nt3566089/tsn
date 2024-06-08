package com.oneslogi.wms.resources.master;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.MCarrierSlipCesDto;
import com.oneslogi.base.dbflute.dtomapper.MCarrierSlipCesDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipCes;
import com.oneslogi.wms.dto.master.CarrierSlipCESMasterDto;
import com.oneslogi.wms.logic.master.CarrierSlipCESMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * キャリアEDIシステム送り状マスタメンテナンス(一覧)画面のリソースクラス。
 */
@Path("/master/carrierSlipCESMaster")
public class CarrierSlipCESMasterResource extends AbstractWmsResource {

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
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}
	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierSlipCESMasterSelectLogic CarrierSlipCESMasterSelectLogic;
	@Inject
	private BClassDtlBhv bClassDtlBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierSlipCESMasterDto キャリアEDIシステム送り状マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public CarrierSlipCESMasterDto init() {
		return new CarrierSlipCESMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・キャリアEDIシステム送り状マスタDTOをキャリアEDIシステム送り状マスタデータ取り出し
	 * </pre>
	 * @param CarrierSlipCESMasterDto キャリアEDIシステム送り状マスタ画面用DTO
	 * @return CarrierSlipCESMasterDto キャリアEDIシステム送り状マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CarrierSlipCESMasterDto search(CarrierSlipCESMasterDto CarrierSlipCESMasterDto) throws IOException {
		// Entity変換
		MCarrierSlipCesDtoMapper mapper = new MCarrierSlipCesDtoMapper();
		MCarrierSlipCes mCarrierSlipCes = mapper.mappingToEntity(CarrierSlipCESMasterDto.data.head);
		// 検索
		PagingResultBean<MCarrierSlipCes> page = CarrierSlipCESMasterSelectLogic.select(mCarrierSlipCes, CarrierSlipCESMasterDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		// 区分値マスタより取得
				BClassDtlCB cb = bClassDtlBhv.newConditionBean();
				cb.specify().columnClassDtlCd();
				cb.specify().columnDictId();
				cb.setupSelect_BClass();
				cb.specify().specifyBClass().columnClassCd();
				cb.setupSelect_VDict(getCultureId());
				cb.specify().specifyVDict().columnDictNm();
				List<String> classCdList = new ArrayList<String>();
				classCdList.add("SAT_DELIVERY_FLG");
				classCdList.add("RESIDENTIAL_DELIVERY_FLG");
				classCdList.add("COD_FLG");
				classCdList.add("SIGNATURE_REQUIRED_FLG");
				classCdList.add("SIGNATURE_RELEASE_FLG");
				classCdList.add("CALL_BEFORE_DELIVERY_FLG");
				classCdList.add("FREEZABLE_PROTECTION_FLG");
				classCdList.add("GUARANTEED_PLUS_FLG");
				classCdList.add("RESIDENTIAL_PICKUP_FLG");
				classCdList.add("DO_NOT_STACK_STACK_FLG");
				classCdList.add("LIMITED_ACCESS_DELIVERY_FLG");
				classCdList.add("LIMITED_ACCESS_PICKUP_FLG");
				classCdList.add("OVER_SIZED_FLG");
				classCdList.add("POISON_FLG");
				classCdList.add("FOOG_FLG");
				classCdList.add("LIFTGATE_DELIVERY_PREPAID_FLG");
				classCdList.add("LIFTGATE_DELIVERY_COLLECT_FLG");
				classCdList.add("LIFTGATE_PICKUP_PREPAID_FLG");
				classCdList.add("LIFTGATE_PICKUP_COLLECT_FLG");
				classCdList.add("INSIDE_DELIVERY_PREPAID_FLG");
				classCdList.add("INSIDE_DELIVERY_COLLECT_FLG");
				classCdList.add("INSIDE_PICKUP_PREPAID_FLG");
				classCdList.add("INSIDE_PICKUP_COLLECT_FLG");
				cb.query().queryBClass().setClassCd_InScope(classCdList);
				cb.query().queryBClass().addOrderBy_ClassCd_Asc();
				cb.query().addOrderBy_ClassDtlCd_Asc();
				List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
				Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

				// センタ区分値をMapに変換
				String classCd = "";
				Map<String, String> dtlMap = null;
				for (BClassDtl bClassDtl : bClassList) {
					if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
						dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
					} else {
						if (classCd.length() > 0) {
							bClassMap.put(classCd, dtlMap);
						}
						dtlMap = new HashMap<String, String>();
						dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
						classCd = bClassDtl.getBClass().getClassCd();
					}
				}
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}

				// 区分値マスタの名称の設定
				for (MCarrierSlipCes mCarrierSlipCesFlg : page) {
					if (bClassMap.containsKey("SAT_DELIVERY_FLG")) {
						if (bClassMap.get("SAT_DELIVERY_FLG").containsKey(mCarrierSlipCesFlg.getSatDeliveryFlg())) {
							mCarrierSlipCesFlg.setSatDeliveryFlgNm(bClassMap.get("SAT_DELIVERY_FLG").get(mCarrierSlipCesFlg.getSatDeliveryFlg()));
						}
					}
					if (bClassMap.containsKey("RESIDENTIAL_DELIVERY_FLG")) {
						if (bClassMap.get("RESIDENTIAL_DELIVERY_FLG").containsKey(mCarrierSlipCesFlg.getResidentialDeliveryFlg())) {
							mCarrierSlipCesFlg.setResidentialDeliveryFlgNm(bClassMap.get("RESIDENTIAL_DELIVERY_FLG").get(mCarrierSlipCesFlg.getResidentialDeliveryFlg()));
						}
					}
					if (bClassMap.containsKey("COD_FLG")) {
						if (bClassMap.get("COD_FLG").containsKey(mCarrierSlipCesFlg.getCodFlg())) {
							mCarrierSlipCesFlg.setCodFlgNm(bClassMap.get("COD_FLG").get(mCarrierSlipCesFlg.getCodFlg()));
						}
					}
					if (bClassMap.containsKey("SIGNATURE_REQUIRED_FLG")) {
						if (bClassMap.get("SIGNATURE_REQUIRED_FLG").containsKey(mCarrierSlipCesFlg.getSignatureRequiredFlg())) {
							mCarrierSlipCesFlg.setSignatureRequiredFlgNm(bClassMap.get("SIGNATURE_REQUIRED_FLG").get(mCarrierSlipCesFlg.getSignatureRequiredFlg()));
						}
					}
					if (bClassMap.containsKey("SIGNATURE_RELEASE_FLG")) {
						if (bClassMap.get("SIGNATURE_RELEASE_FLG").containsKey(mCarrierSlipCesFlg.getSignatureReleaseFlg())) {
							mCarrierSlipCesFlg.setSignatureReleaseFlgNm(bClassMap.get("SIGNATURE_RELEASE_FLG").get(mCarrierSlipCesFlg.getSignatureReleaseFlg()));
						}
					}
					if (bClassMap.containsKey("CALL_BEFORE_DELIVERY_FLG")) {
						if (bClassMap.get("CALL_BEFORE_DELIVERY_FLG").containsKey(mCarrierSlipCesFlg.getCallBeforeDeliveryFlg())) {
							mCarrierSlipCesFlg.setCallBeforeDeliveryFlgNm(bClassMap.get("CALL_BEFORE_DELIVERY_FLG").get(mCarrierSlipCesFlg.getCallBeforeDeliveryFlg()));
						}
					}
					if (bClassMap.containsKey("FREEZABLE_PROTECTION_FLG")) {
						if (bClassMap.get("FREEZABLE_PROTECTION_FLG").containsKey(mCarrierSlipCesFlg.getFreezableProtectionFlg())) {
							mCarrierSlipCesFlg.setFreezableProtectionFlgNm(bClassMap.get("FREEZABLE_PROTECTION_FLG").get(mCarrierSlipCesFlg.getFreezableProtectionFlg()));
						}
					}
					if (bClassMap.containsKey("GUARANTEED_PLUS_FLG")) {
						if (bClassMap.get("GUARANTEED_PLUS_FLG").containsKey(mCarrierSlipCesFlg.getGuaranteedPlusFlg())) {
							mCarrierSlipCesFlg.setGuaranteedPlusFlgNm(bClassMap.get("GUARANTEED_PLUS_FLG").get(mCarrierSlipCesFlg.getGuaranteedPlusFlg()));
						}
					}
					if (bClassMap.containsKey("RESIDENTIAL_PICKUP_FLG")) {
						if (bClassMap.get("RESIDENTIAL_PICKUP_FLG").containsKey(mCarrierSlipCesFlg.getResidentialPickupFlg())) {
							mCarrierSlipCesFlg.setResidentialPickupFlgNm(bClassMap.get("RESIDENTIAL_PICKUP_FLG").get(mCarrierSlipCesFlg.getResidentialPickupFlg()));
						}
					}
					if (bClassMap.containsKey("DO_NOT_STACK_STACK_FLG")) {
						if (bClassMap.get("DO_NOT_STACK_STACK_FLG").containsKey(mCarrierSlipCesFlg.getDoNotStackStackFlg())) {
							mCarrierSlipCesFlg.setDoNotStackPalletsFlgNm(bClassMap.get("DO_NOT_STACK_STACK_FLG").get(mCarrierSlipCesFlg.getDoNotStackStackFlg()));
						}
					}
					if (bClassMap.containsKey("LIMITED_ACCESS_DELIVERY_FLG")) {
						if (bClassMap.get("LIMITED_ACCESS_DELIVERY_FLG").containsKey(mCarrierSlipCesFlg.getLimitedAccessDeliveryFlg())) {
							mCarrierSlipCesFlg.setLimitedAccessDeliveryFlgNm(bClassMap.get("LIMITED_ACCESS_DELIVERY_FLG").get(mCarrierSlipCesFlg.getLimitedAccessDeliveryFlg()));
						}
					}
					if (bClassMap.containsKey("LIMITED_ACCESS_PICKUP_FLG")) {
						if (bClassMap.get("LIMITED_ACCESS_PICKUP_FLG").containsKey(mCarrierSlipCesFlg.getLimitedAccessPickupFlg())) {
							mCarrierSlipCesFlg.setLimitedAccessPickupFlgNm(bClassMap.get("LIMITED_ACCESS_PICKUP_FLG").get(mCarrierSlipCesFlg.getLimitedAccessPickupFlg()));
						}
					}
					if (bClassMap.containsKey("OVER_SIZED_FLG")) {
						if (bClassMap.get("OVER_SIZED_FLG").containsKey(mCarrierSlipCesFlg.getOverSizedFlg())) {
							mCarrierSlipCesFlg.setOverSizedFlgNm(bClassMap.get("OVER_SIZED_FLG").get(mCarrierSlipCesFlg.getOverSizedFlg()));
						}
					}
					if (bClassMap.containsKey("POISON_FLG")) {
						if (bClassMap.get("POISON_FLG").containsKey(mCarrierSlipCesFlg.getPoisonFlg())) {
							mCarrierSlipCesFlg.setPoisonFlgNm(bClassMap.get("POISON_FLG").get(mCarrierSlipCesFlg.getPoisonFlg()));
						}
					}
					if (bClassMap.containsKey("FOOG_FLG")) {
						if (bClassMap.get("FOOG_FLG").containsKey(mCarrierSlipCesFlg.getFoogFlg())) {
							mCarrierSlipCesFlg.setFoodFlgNm(bClassMap.get("FOOG_FLG").get(mCarrierSlipCesFlg.getFoogFlg()));
						}
					}
					if (bClassMap.containsKey("LIFTGATE_DELIVERY_PREPAID_FLG")) {
						if (bClassMap.get("LIFTGATE_DELIVERY_PREPAID_FLG").containsKey(mCarrierSlipCesFlg.getLiftgateDeliveryPrepaidFlg())) {
							mCarrierSlipCesFlg.setLiftgateDeliveryPrepaidFlgNm(bClassMap.get("LIFTGATE_DELIVERY_PREPAID_FLG").get(mCarrierSlipCesFlg.getLiftgateDeliveryPrepaidFlg()));
						}
					}
					if (bClassMap.containsKey("LIFTGATE_DELIVERY_COLLECT_FLG")) {
						if (bClassMap.get("LIFTGATE_DELIVERY_COLLECT_FLG").containsKey(mCarrierSlipCesFlg.getLiftgateDeliveryCollectFlg())) {
							mCarrierSlipCesFlg.setLiftgateDeliveryCollectFlgNm(bClassMap.get("LIFTGATE_DELIVERY_COLLECT_FLG").get(mCarrierSlipCesFlg.getLiftgateDeliveryCollectFlg()));
						}
					}
					if (bClassMap.containsKey("LIFTGATE_PICKUP_PREPAID_FLG")) {
						if (bClassMap.get("LIFTGATE_PICKUP_PREPAID_FLG").containsKey(mCarrierSlipCesFlg.getLiftgatePickupPrepaidFlg())) {
							mCarrierSlipCesFlg.setLiftgatePickupPrepaidFlgNm(bClassMap.get("LIFTGATE_PICKUP_PREPAID_FLG").get(mCarrierSlipCesFlg.getLiftgatePickupPrepaidFlg()));
						}
					}
					if (bClassMap.containsKey("LIFTGATE_PICKUP_COLLECT_FLG")) {
						if (bClassMap.get("LIFTGATE_PICKUP_COLLECT_FLG").containsKey(mCarrierSlipCesFlg.getLiftgatePickupCollectFlg())) {
							mCarrierSlipCesFlg.setLiftgatePickupCollectFlgNm(bClassMap.get("LIFTGATE_PICKUP_COLLECT_FLG").get(mCarrierSlipCesFlg.getLiftgatePickupCollectFlg()));
						}
					}
					if (bClassMap.containsKey("INSIDE_DELIVERY_PREPAID_FLG")) {
						if (bClassMap.get("INSIDE_DELIVERY_PREPAID_FLG").containsKey(mCarrierSlipCesFlg.getInsideDeliveryPrepaidFlg())) {
							mCarrierSlipCesFlg.setInsideDeliveryPrepaidFlgNm(bClassMap.get("INSIDE_DELIVERY_PREPAID_FLG").get(mCarrierSlipCesFlg.getInsideDeliveryPrepaidFlg()));
						}
					}
					if (bClassMap.containsKey("INSIDE_DELIVERY_COLLECT_FLG")) {
						if (bClassMap.get("INSIDE_DELIVERY_COLLECT_FLG").containsKey(mCarrierSlipCesFlg.getInsideDeliveryCollectFlg())) {
							mCarrierSlipCesFlg.setInsideDeliveryCollectFlgNm(bClassMap.get("INSIDE_DELIVERY_COLLECT_FLG").get(mCarrierSlipCesFlg.getInsideDeliveryCollectFlg()));
						}
					}
					if (bClassMap.containsKey("INSIDE_PICKUP_PREPAID_FLG")) {
						if (bClassMap.get("INSIDE_PICKUP_PREPAID_FLG").containsKey(mCarrierSlipCesFlg.getInsidePickupPrepaidFlg())) {
							mCarrierSlipCesFlg.setInsidePickupPrepaidFlgNm(bClassMap.get("INSIDE_PICKUP_PREPAID_FLG").get(mCarrierSlipCesFlg.getInsidePickupPrepaidFlg()));
						}
					}
					if (bClassMap.containsKey("INSIDE_PICKUP_COLLECT_FLG")) {
						if (bClassMap.get("INSIDE_PICKUP_COLLECT_FLG").containsKey(mCarrierSlipCesFlg.getInsidePickupCollectFlg())) {
							mCarrierSlipCesFlg.setInsidePickupCollectFlgNm(bClassMap.get("INSIDE_PICKUP_COLLECT_FLG").get(mCarrierSlipCesFlg.getInsidePickupCollectFlg()));
						}
					}
				}
		//Entity-Dto変換処理
		List<MCarrierSlipCesDto> list = mapper.mappingToDtoList(page);
		//検索結果詰込処理
		CarrierSlipCESMasterDto.data.carrierSlipCESMaster = list;

		return CarrierSlipCESMasterDto;
	}
}
