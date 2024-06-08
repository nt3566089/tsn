package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dtomapper.TPicMthdRcmdDataDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TPicMthdRcmdDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmd;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.wms.dto.shipping.PickingMethodRecommendationDetailDto;
import com.oneslogi.wms.logic.shipping.PickingMethodRecommendationDetailSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/pickingMethodRecommendationDetail")
public class PickingMethodRecommendationDetailResource extends AbstractWmsResource {

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
	private PickingMethodRecommendationDetailSelectLogic selectLogic;
	@Inject
	private BClassDtlBhv bClassDtlBhv;

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return ShippingInstListDto 出庫指示一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public PickingMethodRecommendationDetailDto init() {
		PickingMethodRecommendationDetailDto dto = new PickingMethodRecommendationDetailDto();
		return dto;
	}

	/**
	 * <h2>ピッキング提案明細データ検索処理</h2>
	 * <pre>
	 * ピッキング提案画面より引き継いだピッキング提案IDを使用しピッキング提案明細データを取得する。
	 * </pre>
	 * @param picMthdRcmdId ピッキング提案ID
	 * @return PickingMethodRecommendationDetailDto ピッキング提案明細画面用DTO
	 */
	@GET
	@Path("/search")
	public PickingMethodRecommendationDetailDto search(PickingMethodRecommendationDetailDto pickingMethodRecommendationDetailDto) {

		// ピッキング提案明細データ取得の検索データ編集
		TPicMthdRcmdData tPicMthdRcmdData = new TPicMthdRcmdData();
		tPicMthdRcmdData.setPicMthdRcmdId(pickingMethodRecommendationDetailDto.data.header.getPicMthdRcmdId());

		// 検索実行
		List<TPicMthdRcmdData> selectList = selectLogic.select(tPicMthdRcmdData, pickingMethodRecommendationDetailDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// データが存在しない場合エラーを返す
		if (getErrorManager().size() > 0) {
			return null;
		}

		TPicMthdRcmd header = selectList.get(0).getTPicMthdRcmd();

		// ==== ピッキング提案明細画面用DTO ボディデータ作成 ====

		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<>();
		classCdList.add("RCMD_PICKING_CLS");
		classCdList.add("SHIPPING_STATUS");
		classCdList.add("LIST_OUT_FLG");
		classCdList.add("DELIV_TZ");
		classCdList.add("EMERGENCY_FLG");
		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// 区分値をMapに変換
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

		// 区分値マスタの設定
		for (TPicMthdRcmdData tpmrd : selectList) {

			// 提案ピッキング方法
			if (bClassMap.containsKey("RCMD_PICKING_CLS")) {

				if (bClassMap.get("RCMD_PICKING_CLS").containsKey(header.getRcmdPickingCls())) {
					header.setBClassDtlByRcmdPickingCls(new BClassDtl());
					header.getBClassDtlByRcmdPickingCls().setVDict(new VDict());
					header.getBClassDtlByRcmdPickingCls().getVDict().setDictNm(bClassMap.get("RCMD_PICKING_CLS").get(header.getRcmdPickingCls()));
				}
			}

			// 出荷ステータス取得
			if (bClassMap.containsKey("SHIPPING_STATUS")) {
				if (bClassMap.get("SHIPPING_STATUS").containsKey(tpmrd.getTPickingH().getPickingStatus())) {
					tpmrd.getTPickingH().setBClassDtlByPickingStatus(new BClassDtl());
					tpmrd.getTPickingH().getBClassDtlByPickingStatus().setVDict(new VDict());
					tpmrd.getTPickingH().getBClassDtlByPickingStatus().getVDict().setDictNm(bClassMap.get("SHIPPING_STATUS").get(tpmrd.getTPickingH().getPickingStatus()));
				}
				;
			}

			// 1次ピッキングリスト発行フラグ取得
			if (bClassMap.containsKey("LIST_OUT_FLG")) {
				if (bClassMap.get("LIST_OUT_FLG").containsKey(tpmrd.getTPickingH().getTPickingRAsOne().getPl1OutFlg())) {
					tpmrd.getTPickingH().getTPickingRAsOne().setBClassDtlByPl1OutFlg(new BClassDtl());
					tpmrd.getTPickingH().getTPickingRAsOne().getBClassDtlByPl1OutFlg().setVDict(new VDict());
					tpmrd.getTPickingH().getTPickingRAsOne().getBClassDtlByPl1OutFlg().getVDict().setDictNm(bClassMap.get("LIST_OUT_FLG").get(tpmrd.getTPickingH().getTPickingRAsOne().getPl1OutFlg()));
				}
			}

			// 納品時間帯取得
			if (bClassMap.containsKey("DELIV_TZ")) {
				if (bClassMap.get("DELIV_TZ").containsKey(tpmrd.getTPickingH().getTAllocInstH().getDelivTz())) {
					tpmrd.getTPickingH().getTAllocInstH().setBClassDtlByDelivTz(new BClassDtl());
					tpmrd.getTPickingH().getTAllocInstH().getBClassDtlByDelivTz().setVDict(new VDict());
					tpmrd.getTPickingH().getTAllocInstH().getBClassDtlByDelivTz().getVDict().setDictNm(bClassMap.get("DELIV_TZ").get(tpmrd.getTPickingH().getTAllocInstH().getDelivTz()));
				}
			}

			// 緊急フラグ
			if (bClassMap.containsKey("EMERGENCY_FLG")) {

				if (bClassMap.get("EMERGENCY_FLG").containsKey(header.getEmergencyFlg())) {
					header.setBClassDtlByEmergencyFlg(new BClassDtl());
					header.getBClassDtlByEmergencyFlg().setVDict(new VDict());
					header.getBClassDtlByEmergencyFlg().getVDict().setDictNm(bClassMap.get("EMERGENCY_FLG").get(header.getEmergencyFlg()));
				}

				if (bClassMap.get("EMERGENCY_FLG").containsKey(tpmrd.getEmergencyFlg())) {
					tpmrd.setEmergencyFlgNm(bClassMap.get("EMERGENCY_FLG").get(tpmrd.getEmergencyFlg()));
				}
			}
		}

		// ==== ピッキング提案明細画用DTOヘッダの作成 ====

		pickingMethodRecommendationDetailDto.data.header = new TPicMthdRcmdDtoMapper().mappingToDto(header);
		pickingMethodRecommendationDetailDto.data.list = new TPicMthdRcmdDataDtoMapper().mappingToDtoList(selectList);

		return pickingMethodRecommendationDetailDto;
	}

}
