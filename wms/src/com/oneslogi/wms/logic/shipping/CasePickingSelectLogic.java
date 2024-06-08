package com.oneslogi.wms.logic.shipping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlCasePickingDataListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlCasePickingNoListPmb;
import com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingDataList;
import com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingNoList;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * ケースピッキング検索ロジッククラス
 */
public class CasePickingSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPackingBBhv packingBBhv;
	// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Add Start
	@Inject
	private MProductBhv mProductBhv;
	// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Add End

	// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana Start

	/**
	 * <h2>ケースピッキングの指示データ検索.</h2>
	 * <pre>
	 * 引数の条件を指定してケースピッキングデータを検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param condition 検索条件
	 * @param errSts エラー時に登録するエラーステータス
	 * @return 検索結果
	 */
	public List<SqlCasePickingNoList> selectPickingHeadDataList(SelectCondition condition, PagingDto.PagingData paging, ErrorStatus errSts) {

		final long centerId = condition.getCenterId();
		final long cultureId = getCultureId();

		// 外出しSQLの定義
		String sqlPath = TPackingBBhv.PATH_selectSqlCasePickingNoList;

		// ===== 検索条件の設定 =====

		SqlCasePickingNoListPmb pmb = new SqlCasePickingNoListPmb();
		pmb.setCenterId(centerId);
		pmb.setCultureId(cultureId);
		pmb.setClientId(condition.getClientId());
		pmb.setCasePickingNo(condition.getCasePickingNo());
		pmb.setUpdUserCd(condition.getUpdUserCd());
		pmb.setEmergencyFlg(condition.getEmergencyFlg());
		pmb.setStockOutFlg(condition.getStockOutFlg());
		pmb.setPickingBatchNo(condition.getPickingBatchNo());
		pmb.setPickingWorkNo_SuffixSearch(condition.getPickingWorkNoSuffix());
		pmb.setWorkDtFrom(condition.getWorkDtFrom());
		pmb.setWorkDtTo(condition.getWorkDtTo());
		pmb.setShippingDtFrom(condition.getShippingDtFrom());
		pmb.setShippingDtTo(condition.getShippingDtTo());
		pmb.setSupplyCustomerCd_PrefixSearch(condition.getSupplyCustomerCdPrefix());
		pmb.setDeliveryCourseCd_PrefixSearch(condition.getDeliveryCourseCdPrefix());

		// ===== 検索実行 =====

		// 検索実行
		List<SqlCasePickingNoList> selectList = selectPage(packingBBhv, sqlPath, pmb, SqlCasePickingNoList.class, paging);

		// ===== ０件チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return selectList;
	}

	/**
	 * <h2>ケースピッキングデータの検索.</h2>
	 * <pre>
	 * 引数の条件を指定してケースピッキングデータを検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param condition 検索条件
	 * @param errSts エラー時に登録するエラーステータス
	 * @return 検索結果
	 */
	public List<SqlCasePickingDataList> selectPickingDataList(SelectCondition condition, PagingDto.PagingData paging, ErrorStatus errSts) {

		final long centerId = condition.getCenterId();
		final long clientId = condition.getClientId();

		// 外出しSQLの定義
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod Start
		String sqlPath = MProductBhv.PATH_selectSqlCasePickingDataList;
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod End

		// ===== 検索条件の設定 =====

		SqlCasePickingDataListPmb pmb = new SqlCasePickingDataListPmb();
		pmb.setCenterId(centerId);
		pmb.setCultureId(getCultureId());
		pmb.setClientId(clientId);
		pmb.setCasePickingNo(condition.getCasePickingNo());

		// ===== 検索実行 =====

		// 検索実行
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod Start
		List<SqlCasePickingDataList> selectList = selectPage(mProductBhv, sqlPath, pmb, SqlCasePickingDataList.class, paging);
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod End

		// ===== ０件チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 件数設定 =====

		return selectList;
	}

	/**
	 * <h2>ケースピッキングデータの検索(1件).</h2>
	 * <pre>
	 * 引数の条件を指定してピッキングデータを検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 * @param stockId 在庫ID
	 * @param errSts エラーステータス
	 * @return ピッキングデータ
	 */
	public SqlCasePickingDataList selectPickingDataDetail(long centerId, long clientId, String casePickingNo, long stockId, ErrorStatus errSts) {

		// 外出しSQLの定義
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod Start
		String sqlPath = MProductBhv.PATH_selectSqlCasePickingDataList;
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod End

		// ===== 検索条件の設定 =====

		SqlCasePickingDataListPmb pmb = new SqlCasePickingDataListPmb();
		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setCultureId(getCultureId());
		pmb.setStockId(stockId);
		pmb.setCasePickingNo(casePickingNo);

		// ===== 検索実行 =====

		// 検索実行
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod Start
		List<SqlCasePickingDataList> selectList = selectList(mProductBhv, sqlPath, pmb, SqlCasePickingDataList.class);
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod End

		// ===== 件数チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		if (selectList.size() != 1) {
			this.getErrorManager().throwException(new IllegalStateException());
		}

		SqlCasePickingDataList resultEntity = selectList.get(0);

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start

		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod Start
		if (resultEntity.prepareDomain() != null) {
			mProductBhv.loadMProductShapeList(resultEntity.prepareDomain(), new ConditionBeanSetupper<MProductShapeCB>() {
				public void setup(MProductShapeCB cb) {
					cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
					cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
					cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
					cb.query().setDelFlg_Equal_$0();
					cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				}
			});
		}
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		WmsMultipleShapeUtil.getCaseParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, resultEntity.prepareDomain());

		resultEntity.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, resultEntity.prepareDomain()));
		resultEntity.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, resultEntity.prepareDomain()));
		// 予定内訳取得
		String planBreakdown = WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, resultEntity.getSumPickingNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap
				, resultEntity.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY);
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		// ピック数(ケース)取得
		resultEntity.setCaseBreakdown(WmsMultipleShapeUtil.getCasePickingBreakdown(planBreakdown, WmsMultipleShapeUtil.CasePickingDisplayMode.CASE));
		// ピック数(バラ)取得
		resultEntity.setBaraBreakdown(WmsMultipleShapeUtil.getCasePickingBreakdown(planBreakdown, WmsMultipleShapeUtil.CasePickingDisplayMode.BARA));
		// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Mod End

		return resultEntity;
	}

	// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End

	/**
	 * <h2>検索処理の引数クラス.</h2>
	 */
	public static class SelectCondition {
		private long centerId;
		private Long clientId;
		private String workDtFrom;
		private String workDtTo;
		private String shippingDtFrom;
		private String shippingDtTo;
		private String pickingBatchNo;
		private String pickingWorkNoSuffix;
		private String casePickingNo;
		private String supplyCustomerCdPrefix;
		private String emergencyFlg;
		private String stockOutFlg;
		private String deliveryCourseCdPrefix;
		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.16 kawana Start
		private String updUserCd;

		// [#1940] 検索条件のユーザCDが適用されていない問題を修正 2017.06.16 kawana End

		public SelectCondition(long centerId) {
			this.centerId = centerId;
		}

		public long getCenterId() {
			return centerId;
		}

		public Long getClientId() {
			return clientId;
		}

		public String getWorkDtFrom() {
			return workDtFrom;
		}

		public String getWorkDtTo() {
			return workDtTo;
		}

		public String getShippingDtFrom() {
			return shippingDtFrom;
		}

		public String getShippingDtTo() {
			return shippingDtTo;
		}

		public String getPickingBatchNo() {
			return pickingBatchNo;
		}

		public String getPickingWorkNoSuffix() {
			return pickingWorkNoSuffix;
		}

		public String getCasePickingNo() {
			return casePickingNo;
		}

		public String getSupplyCustomerCdPrefix() {
			return supplyCustomerCdPrefix;
		}

		public String getEmergencyFlg() {
			return emergencyFlg;
		}

		public String getStockOutFlg() {
			return stockOutFlg;
		}

		public String getDeliveryCourseCdPrefix() {
			return deliveryCourseCdPrefix;
		}

		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}

		public void setWorkDtFrom(String workDtFrom) {
			this.workDtFrom = workDtFrom;
		}

		public void setWorkDtTo(String workDtTo) {
			this.workDtTo = workDtTo;
		}

		public void setShippingDtFrom(String shippingDtFrom) {
			this.shippingDtFrom = shippingDtFrom;
		}

		public void setShippingDtTo(String shippingDtTo) {
			this.shippingDtTo = shippingDtTo;
		}

		public void setPickingBatchNo(String pickingBatchNo) {
			this.pickingBatchNo = pickingBatchNo;
		}

		public void setPickingWorkNoSuffix(String pickingWorkNoSuffix) {
			this.pickingWorkNoSuffix = pickingWorkNoSuffix;
		}

		public void setCasePickingNo(String casePickingNo) {
			this.casePickingNo = casePickingNo;
		}

		public void setSupplyCustomerCdPrefix(String supplyCustomerCdPrefix) {
			this.supplyCustomerCdPrefix = supplyCustomerCdPrefix;
		}

		public void setEmergencyFlg(String emergencyFlg) {
			this.emergencyFlg = emergencyFlg;
		}

		public void setStockOutFlg(String stockOutFlg) {
			this.stockOutFlg = stockOutFlg;
		}

		public void setDeliveryCourseCdPrefix(String deliveryCourseCdPrefix) {
			this.deliveryCourseCdPrefix = deliveryCourseCdPrefix;
		}

		public String getUpdUserCd() {
			return updUserCd;
		}

		public void setUpdUserCd(String updUserCd) {
			this.updUserCd = updUserCd;
		}
	}
}