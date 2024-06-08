package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlCasePickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.CasePickingListDto;
import com.oneslogi.wms.util.WRMT;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * ケースピッキングリスト発行ロジッククラス
 */
public class CasePickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	// [1.1.4-CT-069] ケースピッキングリストを出力した時にケース分は検品済にする 2016.06.02 kawana Start

	// [Ver3.0] unit of measure対応 2017.11.24  NIU Start
	@Inject
	private MProductBhv mProductBhv;
	// [Ver3.0] unit of measure対応 2017.11.24  NIU End

	@Inject
	private TPackingBBhv tPackingBBhv;

	// ===== 使用ロジック =====
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [1.1.4-CT-069] ケースピッキングリストを出力した時にケース分は検品済にする 2016.06.02 kawana End

	// [#1503] SDピッキングの処理を共通化 2017.04.05 kawana Start

	// ===== 定数 =====

	public static final String REPORT_CD = "CasePickingReport";

	// [#1503] SDピッキングの処理を共通化 2017.04.05 kawana End

	/**
	 * <h2>ケースピッキングリストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しケースピッキングリストデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SqlCasePickingListPrint> ケースピッキングリスト発行データ取得のリスト
	 */
	public List<CasePickingListDto> selectPrintData(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		// ===== ケースピッキングリスト発行データ取得 =====

		// 外出しSQLの定義

		// [Ver3.0] unit of measure対応 2017.11.24  NIU Start
		String path = MProductBhv.PATH_selectSqlCasePickingListPrint;
		// [Ver3.0] unit of measure対応 2017.11.24  NIU End

		// 検索条件の設定
		SqlCasePickingListPrintPmb pmb = setCondition(tPickingR);

		// 検索実行
		Class<SqlCasePickingListPrint> entityType = SqlCasePickingListPrint.class;

		// [Ver3.0] unit of measure対応 2017.11.24  NIU Start
		List<SqlCasePickingListPrint> selectSqlList = selectListToReport(mProductBhv, path, pmb, entityType);
		// [Ver3.0] unit of measure対応 2017.11.24  NIU End

		if (selectSqlList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [Ver3.0] unit of measure対応 2017.11.24  NIU Start
		List<MProduct> pickingProductList = new ArrayList<>();
		for (SqlCasePickingListPrint pickingProduct : selectSqlList) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			if (pickingProduct.prepareDomain() != null) {
				pickingProductList.add(pickingProduct.prepareDomain());
			}
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		mProductBhv.loadMProductShapeList(pickingProductList, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB cb) {
				cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				cb.query().setDelFlg_Equal_$0();
				cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
			}
		});

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		for (SqlCasePickingListPrint pickingProduct : selectSqlList) {

			// ケースピッキング対象フラグ
			boolean flg =false;

			for (MProductShape mProductShape : pickingProduct.getMProductShapeList()) {

				// ケースピッキング対象フラグ1の場合
				if (!CU.isNullOrEmpty(mProductShape.getMShapeGrpDtl().getCasePickFlg()) &&
						"1".equals(mProductShape.getMShapeGrpDtl().getCasePickFlg())) {
					flg =true;
				}
			}

			//ケースピッキング対象が取得できない場合
			if (!flg ) {
				getErrorManager().add(errSts, WmsMessageConst.CASE_PICKING_FLG_NOT_FOUND_ERROR);
				return null;
			}

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getCaseParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, pickingProduct.prepareDomain());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.24  NIU End
		// [#1503] SDピッキングの処理を共通化 2017.04.05 kawana Start

		// ===== 帳票DTOへ変換 =====

		List<CasePickingListDto> printDtoList = convertPrintDto(selectSqlList, storeNoFlg, decimalExistFlgMap,
				minimumUnitMap, parentUnitNumMap, parentUnitMap);

		return printDtoList;
		// [#1503] SDピッキングの処理を共通化 2017.04.05 kawana End

	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @return SqlCasePickingListPrintPmb 検索条件pmb
	 */
	private SqlCasePickingListPrintPmb setCondition(TPickingR tPickingR) {
		// 検索条件の設定
		SqlCasePickingListPrintPmb pmb = new SqlCasePickingListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());
		pmb.setCultureId(getCultureId());

		return pmb;
	}

	// [#1503] SDピッキングの処理を共通化 2017.04.05 kawana Start

	/**
	 * SQLデータから帳票DTOへ変換
	 *
	 * @param printDataList 外出SQLで検索したデータリスト
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @return 帳票DTOのリスト
	 */
	private List<CasePickingListDto> convertPrintDto(List<SqlCasePickingListPrint> printDataList, String storeNoFlg,
			Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap,
			Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap) {

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.30 tanaka Start
		if (isReportMaxTest()) {
			return testMaxDtoList();
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.30 tanaka End

		List<CasePickingListDto> printDtoList = new ArrayList<CasePickingListDto>();
		for (SqlCasePickingListPrint sqlPrint : printDataList) {
			CasePickingListDto printDto = new CasePickingListDto();

			// [Ver3.0] unit of measure対応 2017.11.24  NIU Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			//入数
			printDto.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, sqlPrint.prepareDomain()));

			//ピック内訳
			printDto.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sqlPrint.getSumPickingNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap, sqlPrint.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));

			//総ピック内訳
			printDto.setTotalBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sqlPrint.getSumPickingNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap, sqlPrint.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));

			//最小梱包単位
			printDto.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, sqlPrint.prepareDomain()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.24  NIU End

			// [Ver3.0] unit of measure対応 2017.11.24  NIU Del
			printDto.setCultureId(getCultureId());
			printDto.setReportCd(REPORT_CD);
			printDto.setPrintFlg(sqlPrint.getCaseOutFlg());
			printDto.setClientCd(sqlPrint.getClientCd());
			printDto.setClientNm(sqlPrint.getClientNm());
			printDto.setWarehouseCd(sqlPrint.getWarehouseCd());
			printDto.setWarehouseNm(sqlPrint.getWarehouseNm());
			printDto.setCenterCd(sqlPrint.getCenterCd());
			printDto.setCenterNm(sqlPrint.getCenterNm());
			printDto.setWorkDt(sqlPrint.getWorkDt());
			// [Ver3.1][#5130]出庫指示バッチNo.を帳票から削除 2018.09.20 matsumoto Del
			printDto.setPickingWorkNo(sqlPrint.getPickingWorkNo());
			printDto.setStockTypeCd(sqlPrint.getStockTypeCd());
			printDto.setStockTypeNm(sqlPrint.getStockTypeNm());
			printDto.setZoneCd(sqlPrint.getZoneCd());
			printDto.setZoneNm(sqlPrint.getZoneNm());
			printDto.setLocationCd(sqlPrint.getLocationCd());
			printDto.setLocationNm(sqlPrint.getLocationNm());
			printDto.setStoreLabelNo(sqlPrint.getStoreLabelNo());
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
			printDto.setStoreDt(sqlPrint.getStoreDt());
			printDto.setStoreNoFlg(storeNoFlg);
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
			printDto.setProductCd(sqlPrint.getProductCd());
			printDto.setProductNm(sqlPrint.getProductNm());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			printDto.setJancd(sqlPrint.getJancd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
			printDto.setLimtDt(sqlPrint.getLimtDt());
			printDto.setLot(sqlPrint.getLot());
			printDto.setSumPickingNum(sqlPrint.getSumPickingNum());
			// [Ver3.0] unit of measure対応 2017.11.24  NIU Del
			//[Ver1.1.4][ON推-仕様変更] 2016.02.18 chou 削除、追加 Start
			//redto.setChargeNum(sqlPrintList.getChargeNum());
			// [Ver3.0] unit of measure対応 2017.11.24  NIU Del
			printDto.setCasePickingNo(sqlPrint.getCasePickingNo());
			printDto.setTotalPickNum(sqlPrint.getSumPickingNum());
			// [Ver3.0] unit of measure対応 2017.11.24  NIU Del
			//[Ver1.1.4][ON推-仕様変更] 2016.02.18 chou 削除、追加 End

			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			printDto.setFromShippingPackingNo(sqlPrint.getFromShippingPackingNo());
			printDto.setToShippingPackingNo(sqlPrint.getToShippingPackingNo());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End

			// [Ver3.0] unit of measure対応 2017.11.24  NIU Del
			printDtoList.add(printDto);
		}

		//[Ver1.1.4][ON推-仕様変更] 2016.02.18 chou 追加 Start
		// == 帳票の明細行に内容表示の要否を判定、表示フラグの設定及び数量の合計 ==

		if (printDtoList.size() == 0) {
			return printDtoList;
		} else {
			printDtoList.get(printDtoList.size() - 1).setPrintLineFlg("true");//最後尾の行も罫線表示を設定
		}

		for (int i = 0; i < printDtoList.size(); i++) {

			CasePickingListDto dto = printDtoList.get(i);
			if (dto.getPrintProductCdFlg().equals("false") && dto.getPrintProductCdElseFlg().equals("false")) {
				continue;
			}

			for (int j = i + 1; j < printDtoList.size(); j++) {
				CasePickingListDto temp = printDtoList.get(j);

				boolean comCondition = dto.getClientCd().equals(temp.getClientCd()) &&
						dto.getCenterCd().equals(temp.getCenterCd()) &&
						dto.getWarehouseCd().equals(temp.getWarehouseCd()) &&
						CU.nullToStr(dto.getWorkDt()).equals(CU.nullToStr(temp.getWorkDt())) &&
						// [Ver3.1][#5130]ピッキングリストから出庫指示バッチNo.を削除 2018.09.21 matsumoto Del
						dto.getStockTypeCd().equals(temp.getStockTypeCd()) &&
						CU.nullToStr(dto.getCasePickingNo()).equals(CU.nullToStr(temp.getCasePickingNo()));

				if (comCondition && dto.getProductCd().equals(temp.getProductCd())) {
					temp.setPrintProductCdFlg("false");//商品CD・名称を非表示を設定
				} else {
					printDtoList.get(j - 1).setPrintLineFlg("true");//罫線表示を設定
					break;
				}

				//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
				boolean storeNoCondition;
				if ("1".equals(storeNoFlg)) {//入庫No.管理ありの場合
					//入庫ラベルNOで判定条件を設定
					storeNoCondition = dto.getStoreLabelNo().equals(temp.getStoreLabelNo());
				} else {//入庫No.管理なしの場合
						//入庫日で判定条件を設定
					storeNoCondition = dto.getStoreDt().equals(temp.getStoreDt());
				}
				//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

				if (comCondition &&
						dto.getProductCd().equals(temp.getProductCd()) &&
						//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod Start
						storeNoCondition &&
						//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod End
						CU.nullToStr(dto.getLot()).equals(CU.nullToStr(temp.getLot())) &&
						CU.nullToStr(dto.getLimtDt()).equals(CU.nullToStr(temp.getLimtDt())) &&
						dto.getLocationCd().equals(temp.getLocationCd())) {

					temp.setPrintProductCdElseFlg("false");//JANCD、入庫ラベルNO(或は入庫日)、ロット、期限日、ロケーションなどを非表示を設定

					//総ケース数の合計
					// [Ver3.0] unit of measure対応 2017.11.24  NIU Del
					//総ピック数の合計
					dto.setTotalPickNum(WCC.add(dto.getTotalPickNum(), temp.getSumPickingNum()));
				} else {
					// [#5703][v3.1] ページング時の罫線不正を修正 2018.11.26 kawana Start
					printDtoList.get(j - 1).setPrintSubLineFlg("true");//罫線表示を設定
					// [#5703][v3.1] ページング時の罫線不正を修正 2018.11.26 kawana End
					break;
				}
			}
		}

		//[Ver1.1.4][ON推-仕様変更] 2016.02.18 chou 追加 End

		return printDtoList;
	}

	// [#1503] SDピッキングの処理を共通化 2017.04.05 kawana End

	// [1.1.4-CT-069] ケースピッキングリストを出力した時にケース分は検品済にする 2016.06.02 kawana Start

	/**
	 *<h2>ケースピッキングデータを更新する。</h2>
	 * <pre>
	 * ケースピッキングデータの検品フラグを検品済に更新する。
	 * 【出荷ステータス更新.出荷検品完了処理】を実行する。
	 *
	 * 【出荷ステータス更新.出荷検品完了処理】
	 * ・{@link ShipStatusUpdateLogic#inspected(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品完了ステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 変更行数
	 */
	public int updateInspectionFlg(TPickingR tPickingR, ErrorStatus errSts) {

		// ===== 検品フラグの変更 =====
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setMixedFlg_Equal_$0();
		cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		TPackingB tPackingB = tPackingBBhv.newEntity();
		// [#1503] HT/SDを使用しない場合、ピッキング済にならない問題を修正 2017.04.05 kawana Start
		tPackingB.setPickingFlg_$1();
		// [#1503] HT/SDを使用しない場合、ピッキング済にならない問題を修正 2017.04.05 kawana End
		tPackingB.setInspectionFlg_$1();

		int result = tPackingBBhv.queryUpdate(tPackingB, cb);

		// ===== 出荷ステータスの更新 =====
		if (0 < result) {

			TPickingHCB pickingHCb = tPickingHBhv.newMyConditionBean();
			pickingHCb.checkInvalidQuery();
			pickingHCb.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

			List<TPickingH> pickingHList = tPickingHBhv.selectList(pickingHCb);

			// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.25 kawana Start
			shipStatusUpdateLogic.casePickingListPrint(pickingHList, errSts);
			// [#2147] ピッキングと検品のステータス更新を共通化 2017.07.25 kawana End
			if (0 < getErrorManager().size()) {
				return 0;
			}
		}

		return result;
	}

	// [1.1.4-CT-069] ケースピッキングリストを出力した時にケース分は検品済にする 2016.06.02 kawana End

	// [#5456][v3.1] ケースピッキングリスト発行解除処理を追加 2018.10.18 kawana Start

	/**
	 *<h2>ケースピッキング解除処理。</h2>
	 * <pre>
	 * ケースピッキングデータの検品フラグを未検品に更新する。
	 * 【出荷ステータス更新.出荷検品完了処理】を実行する。
	 *
	 * 【出荷ステータス更新.出荷検品完了処理】
	 * ・{@link ShipStatusUpdateLogic#inspected(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品完了ステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 変更行数
	 */
	public int clearInspectionFlg(TPickingR tPickingR, ErrorStatus errSts) {

		// ===== 検品フラグの変更(未検品) =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setMixedFlg_Equal_$0();
		cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		TPackingB tPackingB = tPackingBBhv.newEntity();
		tPackingB.setPickingFlg_$0();
		tPackingB.setInspectionFlg_$0();

		int result = tPackingBBhv.queryUpdate(tPackingB, cb);

		// ===== 出荷ステータスの更新 =====

		if (0 < result) {

			TPickingHCB pickingHCb = tPickingHBhv.newMyConditionBean();
			pickingHCb.checkInvalidQuery();
			pickingHCb.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
			List<TPickingH> pickingHList = tPickingHBhv.selectList(pickingHCb);

			shipStatusUpdateLogic.casePickingListPrint(pickingHList, errSts);
			if (0 < getErrorManager().size()) {
				return 0;
			}
		}

		return result;
	}

	// [#5456][v3.1] ケースピッキングリスト発行解除処理を追加 2018.10.18 kawana End

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.30 tanaka Start

	/**
	 *<h2>最大桁テスト用</h2>
	 * <pre>
	 * 最大桁テストを行う場合に実行する。
	 * 本メソッドを使用する場合はB_PROPATYマスタの[reportMaxTestMode]を'test'に設定すること
	 * </pre>
	 * @param 無し
	 * @return List<CasePickingListDto> 出力用リスト
	 */
	public List<CasePickingListDto> testMaxDtoList() {

		List<CasePickingListDto> printDtoList = new ArrayList<CasePickingListDto>();

		for (int i = 0; i < 15; i++) {

			CasePickingListDto printDto = new CasePickingListDto();
			printDto.setReportCd("CasePickingReport");
			printDto.setStringUnitNum(WRMT.unitNum());
			printDto.setBreakdown(WRMT.breakDown());
			printDto.setTotalBreakdown(WRMT.breakDown());
			printDto.setMinimumPackingUnit(WRMT.minimumUnit());
			printDto.setCultureId(1);
			printDto.setPrintFlg("1");
			printDto.setClientCd(WRMT.clientCd());
			printDto.setClientNm(WRMT.clientAbbr());
			printDto.setWarehouseCd(WRMT.warehouseCd());
			printDto.setWarehouseNm(WRMT.warehouseAbbr());
			printDto.setCenterCd(WRMT.centerCd());
			printDto.setCenterNm(WRMT.centerAbbr());
			printDto.setWorkDt(WRMT.date());
			printDto.setPickingWorkNo(WRMT.pickingWorkNo());
			printDto.setStockTypeCd(WRMT.stockTypeCd());
			printDto.setStockTypeNm(WRMT.stockTypeNm());
			printDto.setZoneCd(WRMT.zoneCd());
			printDto.setZoneNm(WRMT.zoneNm());
			printDto.setLocationNm(WRMT.locationNm());
			printDto.setStoreLabelNo(WRMT.storeLabelNo());
			printDto.setStoreDt(WRMT.date());
			printDto.setStoreNoFlg("0");
			printDto.setProductCd(WRMT.productCd());
			printDto.setProductNm(WRMT.productAbbr());
			printDto.setJancd(WRMT.janCd());
			printDto.setLimtDt(WRMT.date());
			printDto.setSumPickingNum(WRMT.stockNum());
			printDto.setCasePickingNo(WRMT.casePickingNo());
			printDto.setTotalPickNum(WRMT.stockNum());
			printDto.setFromShippingPackingNo(WRMT.shippingPackingNo().replaceFirst("9", "0"));
			printDto.setToShippingPackingNo(WRMT.shippingPackingNo());
			printDto.setLot(WRMT.lot());
			printDto.setLocationCd(String.valueOf(i));

			if (i % 5 == 0) {
				printDto.setPrintProductCdElseFlg("true");
				if (i != 0) {
					printDtoList.get(i - 1).setPrintSubLineFlg("true");
				}

				if (i % 10 == 0) {
					printDto.setPrintProductCdFlg("true");
					if (i != 0) {
						printDtoList.get(i - 1).setPrintLineFlg("true");
					}
				} else {
					printDto.setPrintProductCdFlg("false");
				}
			} else {
				printDto.setPrintProductCdFlg("false");
				printDto.setPrintProductCdElseFlg("false");
			}

			printDtoList.add(printDto);
		}

		printDtoList.get(printDtoList.size() - 1).setPrintLineFlg("true");// 最後尾の罫線を表示

		return printDtoList;

	}
	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.30 tanaka End

}
