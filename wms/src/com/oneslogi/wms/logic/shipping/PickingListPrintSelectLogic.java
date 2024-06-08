package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlMultiPickingListPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlSLPickingListPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlTotalPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.CasePickingListDto;
import com.oneslogi.wms.dto.report.MultiPickingListDto;
import com.oneslogi.wms.dto.report.OrderPickingListDto;
import com.oneslogi.wms.dto.report.PLPickingListDto;
import com.oneslogi.wms.dto.report.SLPickingListDto;
import com.oneslogi.wms.dto.report.TotalPickingListDto;
import com.oneslogi.wms.dto.shipping.PickingListPrintDto;
import com.oneslogi.wms.util.WRMT;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * ピッキングリスト発行データ取得ロジッククラス
 */
public class PickingListPrintSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.07.11 miyabe End
	// [1.1.4-CT-052] 1次ピッキングリスト出力済の条件を変更 2016.05.23 kawana Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [1.1.4-CT-052] 1次ピッキングリスト出力済の条件を変更 2016.05.23 kawana End
	// [Ver3.1][#5127] 発行解除処理追加 2018.08.22 matsumoto Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	// [Ver3.1][#5127] 発行解除処理追加 2018.08.22 matsumoto End

	//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe add Start
	@Inject
	private MProductBhv mProductBhv;

	// ===== 使用ロジック =====
	@Inject
	private OrderPickingListPrintLogic orderPickingListPrintLogic;
	@Inject
	private PLPickingListPrintLogic plPickingListPrintLogic;
	@Inject
	private TotalPickingListPrintLogic totalPickingListPrintLogic;
	@Inject
	private SLPickingListPrintLogic slPickingListPrintLogic;
	@Inject
	private CasePickingListPrintLogic casePickingListPrintLogic;
	@Inject
	private MultiPickingListPrintLogic multiPickingListPrintLogic;
	//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe add End

	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しピッキングリストの発行データを取得する。
	 * データ存在する場合、センタ区分値マスタより表示名称を設定する。
	 *
	 * 検索検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：納品先CD
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.・ピッキンググループNo.・作業日/出荷日区分・日付(From)・日付(To)・ピッキング方法・発行区分・配送コースCD
	 * @param tShippingInstH 出荷指示ヘッダ：緊急フラグ・出庫指示バッチNo.・欠品有無
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlPickingListPrint> ピッキングリスト発行データ
	 */
	public PagingResultBean<SqlPickingListPrint> select(TAllocInstH tAllocInstH, TPickingH tPickingH, TShippingInstH tShippingInstH,
			PickingListPrintDto.PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlPickingListPrint> result = null;

		// ===== 出庫指示一覧データ取得 =====

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlPickingListPrint;

		// 検索条件の設定
		SqlPickingListPrintPmb pmb = setCondition(tAllocInstH, tPickingH, tShippingInstH);

		// 検索実行
		Class<SqlPickingListPrint> entityType = SqlPickingListPrint.class;
		result = selectPage(tPickingHBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.06.06 miyabe Start
		// 区分値マスタより取得
		BClassDtlCB cbCCD = bClassDtlBhv.newConditionBean();
		cbCCD.specify().columnClassDtlCd();
		cbCCD.specify().columnDictId();
		cbCCD.setupSelect_BClass();
		cbCCD.specify().specifyBClass().columnClassCd();
		cbCCD.setupSelect_VDict(getCultureId());
		cbCCD.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("LIST_OUT_FLG");
		// [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示 2018.10.24 kawana Start
		classCdList.add("LIST_OUT_FLG_DISP");
		// [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示 2018.10.24 kawana End
		// [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana Start
		classCdList.add("MULTI_PIC_FLG");
		// [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana End
		//[Ver3.1][#5129] 検索結果にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add Start
		classCdList.add("CASE_PIC_TARGET");
		classCdList.add("SGL_ROW_PIC_TARGET");
		//[Ver3.1][#5129] 検索結果にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add End

		cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
		cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
		cbCCD.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cbCCD);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl mCenterClassDtl : bClassList) {
			if (classCd.equals(mCenterClassDtl.getBClass().getClassCd())) {
				dtlMap.put(mCenterClassDtl.getClassDtlCd() , mCenterClassDtl.getVDict().getDictNm());
			}else{
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(mCenterClassDtl.getClassDtlCd() , mCenterClassDtl.getVDict().getDictNm());
				classCd = mCenterClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			bClassMap.put(classCd, dtlMap);
		}
		// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.06.06 miyabe End
		// 区分値マスタの名称の設定
		for (SqlPickingListPrint sql : result) {
			if (bClassMap.containsKey("LIST_OUT_FLG")) {
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getOplOutFlg())) {
					sql.setOplOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getOplOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getMltOutFlg())) {
					sql.setMltOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getMltOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getTplOutFlg())) {
					sql.setTplOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getTplOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getCaseOutFlg())) {
					sql.setCaseOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getCaseOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getPlOutFlg())) {
					sql.setPlOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getPlOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getSlOutFlg())) {
					sql.setSlOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getSlOutFlg()));
				}

				// [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示(ここからTagOutFlgの処理を移動) 2018.10.24 kawana Delete

				// [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
//				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getSplOutFlg())) {
//					sql.setSplOutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getSplOutFlg()));
//				}
//				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getPl1OutFlg())) {
//					sql.setPl1OutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getPl1OutFlg()));
//				}
//				if (bClassMap.get("LIST_OUT_FLG").containsKey(sql.getPl2OutFlg())) {
//					sql.setPl2OutNm(bClassMap.get("LIST_OUT_FLG").get(sql.getPl2OutFlg()));
//				}
				// [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Rnd
			}

			// [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示 2018.10.24 kawana Start
			if (bClassMap.containsKey("LIST_OUT_FLG_DISP")) {

				// [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  Start
//				if (bClassMap.get("LIST_OUT_FLG_DISP").containsKey(sql.getTagOutFlg())) {
//					sql.setTagOutFlgNm(bClassMap.get("LIST_OUT_FLG_DISP").get(sql.getTagOutFlg()));
//				}
				// [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  End
			}
			// [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示 2018.10.24 kawana End

			// [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana Start
			if (bClassMap.containsKey("MULTI_PIC_FLG")) {
//				if (bClassMap.get("MULTI_PIC_FLG").containsKey(sql.getMultiPicFlg())) {
//					sql.setMultiPicFlgNm(bClassMap.get("MULTI_PIC_FLG").get(sql.getMultiPicFlg()));
//				}
			}
			//[Ver3.1][#5129] 検索結果にケースピックフラグ、単行ピックフラグ追加 2018.10.24 miyabe add Start
			if (bClassMap.containsKey("SGL_ROW_PIC_TARGET")) {
				if (bClassMap.get("SGL_ROW_PIC_TARGET").containsKey(sql.getSglRowPicFlg())) {
					sql.setSglRowPicNm(bClassMap.get("SGL_ROW_PIC_TARGET").get(sql.getSglRowPicFlg()));
				}
			}
			if (bClassMap.containsKey("CASE_PIC_TARGET")) {
				if (bClassMap.get("CASE_PIC_TARGET").containsKey(sql.getCasePicFlg())) {
					sql.setCasePicNm(bClassMap.get("CASE_PIC_TARGET").get(sql.getCasePicFlg()));
				}
			}
			//[Ver3.1][#5129] 検索結果にケースピックフラグ、単行ピックフラグ追加 2018.10.24 miyabe add End
		}
		return result;
	}

	/**
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQLの検索条件を設定する。
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：納品先CD
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.・ピッキンググループNo.・作業日/出荷日区分・日付(From)・日付(To)・ピッキング方法・発行区分・配送コースCD
	 * @param tShippingInstH 出荷指示ヘッダ：緊急フラグ・出庫指示バッチNo.・欠品有無
	 * @return SqlPickingListPrintPmb 検索条件
	 */
	protected SqlPickingListPrintPmb setCondition(TAllocInstH tAllocInstH, TPickingH tPickingH, TShippingInstH tShippingInstH) {

		// 検索条件の設定
		SqlPickingListPrintPmb pmb = new SqlPickingListPrintPmb();
		pmb.setClientId(tPickingH.getClientId()); //荷主ID
		pmb.setCenterId(tPickingH.getCenterId()); // センタID
		pmb.setEmergencyFlg(tShippingInstH.getEmergencyFlg()); // 緊急フラグ
		pmb.setPickingBatchNo(tShippingInstH.getPickingBatchNo()); // 出庫指示バッチNo.
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana Start
		pmb.setPickingWorkNo_SuffixSearch(tPickingH.getPickingWorkNo()); // 出庫作業No.
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana End
		pmb.setPickingGroupNo(tPickingH.getPickingGroupNo()); // ピッキンググループNo.
		pmb.setSupplyCustomerCd_PrefixSearch(tAllocInstH.getSupplyCustomerCd());//納品先CD
		pmb.setTakingShippingFlg(tPickingH.getTakingShippingFlg()); // 作業日/出荷日区分
		pmb.setDtFrom(tPickingH.getDtFrom()); //日付From
		pmb.setDtTo(tPickingH.getDtTo()); // 日付To
		pmb.setPicCls(tPickingH.getPicCls()); // ピッキング方法
		pmb.setListOutKbn(tPickingH.getListOutKbn()); // 発行区分
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
		pmb.setNoStockOutFlg(tShippingInstH.getNoStockOutFlg()); // 欠品有無のみ
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
		// [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana Start
		pmb.setCultureId(getCultureId());
		// [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana End
		// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa Start
		pmb.setDeliveryCourseCd_PrefixSearch(tPickingH.getDeliveryCourseCd()); // 配送コースCD
		// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa End
		//[Ver3.1][#5129] 検索条件、検索結果にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add Start
		pmb.setSglRowPicFlg(tPickingH.getSglRowPicFlg());
		pmb.setCasePicFlg(tPickingH.getCasePicFlg());
		//ケースピックフラグのパラメータを混載ピックフラグに変換
		if(pmb.getCasePicFlg() != null){
			//ケースピッキング対象「0:対象外」がセットされていた場合、梱包ヘッダ混載フラグ「1:混載」として検索
			if(pmb.getCasePicFlg().equals("0")){
				pmb.setCasePicFlg("1");
			//ケースピックフラグ「1:対象」がセットされていた場合、梱包ヘッダ混載フラグ「0:単品」として検索
			} else if(pmb.getCasePicFlg().equals("1")){
				pmb.setCasePicFlg("0");
			}
		}		//[Ver3.1][#5129] 検索条件、検索結果にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add End
		return pmb;
	}

	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 *
	 * 出庫帳票を更新する。
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param report 出庫帳票(検索用)：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void tPickingRUpdate(TPickingR update, TPickingR report, ErrorStatus errSts) {

		// ===== 出庫帳票更新 =====

		// 更新条件作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());
		// ===== 入荷予定帳票の更新 =====

		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫帳票を更新する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：リスト発行区分・発行状況
	 * @param tPackingH 梱包ヘッダ：混載フラグ
	 * @param tPickingHList 出庫ヘッダリスト：荷主ID, センタID, ピッキンググループNo., 出庫作業No.
	 * @param update 出庫帳票(更新用)：全項目
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
    // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja Start
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
	public int updateControlNo(final TPickingH tPickingH, final TPackingH tPackingH, List<TPickingH> tPickingHList, TPickingR update, ErrorStatus errStatus) {
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
	// [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja End

		// [#5129][#5133][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更、1次・2次ピッキングリスト出力フラグ 追加、発行区分にケースッキング追加 2018.08.23 kawana Start

		List<String> pickingStatusList = Arrays.asList(new String[] { "25", "30", "35", "40", "45", "50" });

		// 出荷指示ヘッダリストのデータ件数分繰返
		int updateCount = 0;
		for (final TPickingH pickingH : tPickingHList) {

			// ===== 出庫帳票データ更新 =====

			TPickingRCB cb = tPickingRBhv.newMyConditionBean();

			//検索条件
			cb.query().queryTPickingH().setClientId_Equal(pickingH.getClientId());
			cb.query().queryTPickingH().setCenterId_Equal(pickingH.getCenterId());
			cb.query().queryTPickingH().setPickingWorkNo_Equal(pickingH.getPickingWorkNo());
			cb.query().queryTPickingH().setPickingGroupNo_Equal(pickingH.getPickingGroupNo());
			cb.query().queryTPickingH().setSglRowPicFlg_Equal(tPickingH.getSglRowPicFlg());
			cb.query().queryTPickingH().setPickingStatus_InScope(pickingStatusList);

			// [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja Start
			cb.query().queryTPickingH().queryTAllocInstH().existsTPackingHList(new SubQuery<TPackingHCB>() {
				@Override
				public void query(TPackingHCB subCB) {
					subCB.query().setMixedFlg_Equal(tPackingH.getMixedFlg());
				}
			});
			// [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja End

			// リスト発行区分が"1"(一次ピッキング)の場合
			if (CU.equals(tPickingH.getPicCls(), "1")) {

				// 発行区分が"0"(未発行)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "0")) {
					cb.query().setPl1OutFlg_Equal_$0();
				}

				// 発行区分が"1"(発行済)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "1")) {
					cb.query().setPl1OutFlg_Equal_$1();
				}
			}

			// リスト発行区分が"2"(二次ピッキング)の場合
			if (CU.equals(tPickingH.getPicCls(), "2")) {

				// 発行区分が"0"(未発行)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "0")) {
					cb.query().setPl2OutFlg_Equal_$0();
				}

				// 発行区分が"1"(発行済)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "1")) {
					cb.query().setPl2OutFlg_Equal_$1();
				}
			}

			// リスト発行区分が"3"(ケースピッキング)の場合
			if (CU.equals(tPickingH.getPicCls(), "3")) {

				// 発行区分が"0"(未発行)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "0")) {
					cb.query().setCaseOutFlg_Equal_$0();
				}

				// 発行区分が"1"(発行済)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "1")) {
					cb.query().setCaseOutFlg_Equal_$1();
				}
			}

			// ===== 出庫帳票の更新 =====
			int updCnt = tPickingRBhv.queryUpdate(update, cb);
			updateCount = updateCount + updCnt;
		}

		// [#5129][#5133][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更、1次・2次ピッキングリスト出力フラグ 追加、発行区分にケースッキング追加 2018.08.23 kawana End

	    return updateCount;
	}

	// [1.1.4-CT-052] 1次ピッキングリスト出力済の条件を変更 2016.05.23 kawana Start

	// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新(updatePl1Outメソッド削除) 2018.08.24 kawana Delete

	/**
	 * <h2>コントロールNo.をクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫帳票のコントロールNo.をクリアする。
	 * </pre>
	 * @param controlNo コントロールNo.
	 */
	public void clearControlNo(long controlNo) {

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		TPickingR update = new TPickingR();
		update.setControlNo(null);

		tPickingRBhv.queryUpdate(update, cb);
	}

	// [1.1.4-CT-052] 1次ピッキングリスト出力済の条件を変更 2016.05.23 kawana End

	// [Ver3.1][#5127][#5456] 発行解除処理を追加 2018.10.18 matsumoto/kawana Start

	/**
	 * <h2>ピッキングリスト発行解除の出荷ステータスチェック.</h2>
	 * <pre>
	 * 対象データに以下の出庫ステータスが含まれているかをチェックする。
	 * 含まれていた場合は【true】を返却する。
	 *
	 * 【出庫ステータス】
	 * ・ピッキング中
	 * ・ピッキング済
	 * ・出荷検品中
	 * ・出荷検品中断
	 * ・出荷検品済
	 * </pre>
	 * @param controlNo 出庫帳票に設定されたコントロールNo.
	 * @return true : 注意する出荷ステータスが含まれている
	 */
	public boolean existsWarnShippingStatusForClearIssue(long controlNo) {

		List<String> pickingStatusList = Arrays.asList(new String[] { "30", "35", "40", "45", "50" });

		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.query().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		cb.query().setPickingStatus_InScope(pickingStatusList);

		int count = tPickingHBhv.selectCount(cb);
		if (0 < count) {
			return true;
		}

		return false;
	}

	/**
	 * <h2>ケースピッキングリスト発行解除の出荷ステータスチェック.</h2>
	 * <pre>
	 * 対象データに以下の梱包ステータスが含まれているかをチェックする。
	 * 含まれていた場合は【true】を返却する。
	 *
	 * 【梱包ステータス】
	 * ・ピッキング中
	 * ・ピッキング済
	 * ・出荷検品中
	 * ・出荷検品中断
	 * ・出荷検品済
	 * </pre>
	 * @param controlNo 出庫帳票に設定されたコントロールNo.
	 * @return true : 注意する出荷ステータスが含まれている
	 */
	public boolean existsWarnShippingStatusForClearIssueCase(long controlNo) {

		List<String> pickingStatusList = Arrays.asList(new String[] { "30", "35", "40", "45", "50" });

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		cb.query().setPackingStatus_InScope(pickingStatusList);

		int count = tPackingHBhv.selectCount(cb);
		if (0 < count) {
			return true;
		}

		return false;
	}

	/**
	 * <h2>ピッキングリスト発行解除。</h2>
	 * <pre>
	 * ピッキンググループNo.および関連する採番の削除。
	 * 1次ピッキング、2次ピッキングの出力状態を未出力に変更
	 * </pre>
	 * @param controlNo 出庫帳票に設定されたコントロールNo.
	 */
	public void clearIssue(long controlNo) {

		// コントロールNo.を条件に出庫ヘッダの更新をする。
		TPickingH updateEntityTPickingH = tPickingHBhv.newMyEntity();
		updateEntityTPickingH.setPickingGroupNo(null);

		TPickingHCB tPickingHCb = tPickingHBhv.newMyConditionBean();
		tPickingHCb.query().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		tPickingHBhv.queryUpdate(updateEntityTPickingH, tPickingHCb);

		// コントロールNo.を条件に出庫ボディを更新する。
		TPickingB updateEntityTPickingB = tPickingBBhv.newMyEntity();
		updateEntityTPickingB.setTempNo(null);

		TPickingBCB tPickingBCb = tPickingBBhv.newMyConditionBean();
		tPickingBCb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		tPickingBBhv.queryUpdate(updateEntityTPickingB, tPickingBCb);

		// コントロールNo.を条件に梱包ヘッダの更新をする。
		TPackingH updateEntityTPackingH = tPackingHBhv.newMyEntity();
		updateEntityTPackingH.setMultiPicFlg_$0();
		updateEntityTPackingH.setCartNo(null);
		updateEntityTPackingH.setBucketColNo(null);
		updateEntityTPackingH.setBucketRowNo(null);
		updateEntityTPackingH.setSeedingNo(null);

		TPackingHCB tPackingHCb = tPackingHBhv.newMyConditionBean();
		tPackingHCb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		tPackingHBhv.queryUpdate(updateEntityTPackingH, tPackingHCb);

		// コントロールNo.を条件に出庫帳票の更新をする。
		TPickingR updateEntityTPickingR = tPickingRBhv.newMyEntity();
		updateEntityTPickingR.setOplOutFlg_$0();
		updateEntityTPickingR.setTplOutFlg_$0();
		updateEntityTPickingR.setMltOutFlg_$0();
		updateEntityTPickingR.setSplOutFlg_$0();
		updateEntityTPickingR.setPl1OutFlg_$0();
		updateEntityTPickingR.setPl1OutUserId(null);
		updateEntityTPickingR.setPl1OutDt(null);
		updateEntityTPickingR.setPlOutFlg_$0();
		updateEntityTPickingR.setSlOutFlg_$0();
		updateEntityTPickingR.setPl2OutFlg_$0();
		updateEntityTPickingR.setPl2OutUserId(null);
		updateEntityTPickingR.setPl2OutDt(null);

		TPickingRCB tPickingRCB = tPickingRBhv.newMyConditionBean();
		tPickingRCB.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		tPickingRBhv.queryUpdate(updateEntityTPickingR, tPickingRCB);
	}


	/**
	 * <h2>ケースピッキングリスト発行解除。</h2>
	 * <pre>
	 * ケースピッキングNo.の削除。
	 * ケースピッキングの出力状態を未出力に変更
	 * </pre>
	 * @param controlNo 出庫帳票に設定されたコントロールNo.
	 */
	public void clearIssueCase(long controlNo, MParam param, ErrorStatus errSts) {

		if (!param.isUseHtShipFlg$1()) {
			// HT未使用の場合、ケース出庫分を未検品に変更

			TPickingR pickingR = new TPickingR();
			pickingR.setControlNo(controlNo);

			casePickingListPrintLogic.clearInspectionFlg(pickingR, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		}

		// コントロールNo.を条件に梱包ボディの更新をする。
		TPackingB updateEntityTPackingB = tPackingBBhv.newMyEntity();
		updateEntityTPackingB.setCasePickingNo(null);

		TPackingBCB tPackingBCb = tPackingBBhv.newConditionBean();
		tPackingBCb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		tPackingBBhv.queryUpdate(updateEntityTPackingB, tPackingBCb);

		// コントロールNo.を条件に出庫帳票の更新をする。
		TPickingR updateEntityTPickingR = tPickingRBhv.newMyEntity();
		updateEntityTPickingR.setCaseOutFlg_$0();
		updateEntityTPickingR.setCaseOutUserId(null);
		updateEntityTPickingR.setCaseOutDt(null);

		TPickingRCB tPickingRCB = tPickingRBhv.newMyConditionBean();
		tPickingRCB.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
		tPickingRBhv.queryUpdate(updateEntityTPickingR, tPickingRCB);
	}

	// [Ver3.1][#5127][#5456] 発行解除処理を追加 2018.10.18 matsumoto/kawana End

	//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe add Start

	/**
	 * <h2>オーダーピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param storeNoFlg
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<OrderPickingListDto> オーダーピッキングリストデータ取得用DTOリスト
	 */
	public List<OrderPickingListDto> getOrderDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod Start
		List<OrderPickingListDto> sqlOrderPickingListPrintList = orderPickingListPrintLogic.select(tPickingR, storeNoFlg, errSts);
		//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod End

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		return sqlOrderPickingListPrintList;
	}

	/**
	 * <h2>摘み取りピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<PLPickingListDto> 摘み取りピッキングリスト取得用DTOリスト
	 */
	public List<PLPickingListDto> getPLDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod Start
		List<PLPickingListDto> SqlPLPickingListPrintList = plPickingListPrintLogic.select(tPickingR, storeNoFlg, errSts);
		//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Mod End

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		return SqlPLPickingListPrintList;
	}

	/**
	 * <h2>トータルピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TotalPickingListDto> トータルピッキングリスト取得用DTOリスト
	 */
	public List<TotalPickingListDto> getTotalDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {
		// [ON推-CT4-240] 採番修正 2014.11.26 zhouj Start

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start
		if (isReportMaxTest()) {
			return testTotalPickingMaxDtoList();
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

		//[検査-131] ピッキンググループNo採番ルール変更 2014.12.05 KI Start
		tPickingR.setDelFlg_$0();
		//[検査-131] ピッキンググループNo採番ルール変更 2014.12.05 KI End
		List<SqlTotalPickingListPrint> totalPickingListPrintList = totalPickingListPrintLogic.selectProgressData(tPickingR, errSts);
		List<TotalPickingListDto> dataList = new ArrayList<TotalPickingListDto>();
		for (SqlTotalPickingListPrint sqlPrintList : totalPickingListPrintList) {
			TotalPickingListDto redto = new TotalPickingListDto();
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			redto.setCultureId(getCultureId());
			redto.setReportCd("TotalPickingList");
			redto.setPrintFlg(sqlPrintList.getTplOutFlg());
			redto.setClientCd(sqlPrintList.getClientCd());
			redto.setClientNm(sqlPrintList.getClientNm());
			redto.setWarehouseCd(sqlPrintList.getWarehouseCd());
			redto.setWarehouseNm(sqlPrintList.getWarehouseNm());
			redto.setCenterCd(sqlPrintList.getCenterCd());
			redto.setCenterNm(sqlPrintList.getCenterNm());
			redto.setWorkDt(sqlPrintList.getWorkDt());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
			redto.setPickingGroupNo(sqlPrintList.getPickingGroupNo());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
			redto.setStockTypeCd(sqlPrintList.getStockTypeCd());
			redto.setStockTypeNm(sqlPrintList.getStockTypeNm());
			redto.setZoneCd(sqlPrintList.getZoneCd());
			redto.setZoneNm(sqlPrintList.getZoneNm());
			redto.setLocationCd(sqlPrintList.getLocationCd());
			redto.setLocationNm(sqlPrintList.getLocationNm());
			redto.setStoreLabelNo(sqlPrintList.getStoreLabelNo());
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
			redto.setStoreDt(sqlPrintList.getStoreDt());
			redto.setStoreNoFlg(storeNoFlg);
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
			// [Ver3.0] unit of measure対応 2017.11.24 REN Start
			//内訳
			redto.setBreakdown(sqlPrintList.getBreakdown());
			//入数
			redto.setStringUnitNum(sqlPrintList.getStringUnitNum());
			//最小梱包単位
			redto.setMinimumPackingUnit(sqlPrintList.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.24 REN End
			redto.setProductCd(sqlPrintList.getProductCd());
			redto.setProductNm(sqlPrintList.getProductNm());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			redto.setJancd(sqlPrintList.getJancd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
			redto.setLimtDt(sqlPrintList.getLimtDt());
			redto.setLot(sqlPrintList.getLot());
			redto.setSumPickingNum(sqlPrintList.getSumPickingNum());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			redto.setTempNo(sqlPrintList.getTempNo());
			redto.setChargeNum(sqlPrintList.getChargeNum());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
			redto.setPickingGroupNo(sqlPrintList.getPickingGroupNo());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataList.add(redto);
		}

		return dataList;
		// [ON推-CT4-240] 採番修正  2014.11.26 zhouj end

	}

	/**
	 * <h2>種蒔きピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param tPickingH 出庫ヘッダ
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<SLPickingListDto> 種蒔きピッキングリスト取得用DTOリスト
	 */
	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja Start
	public List<SLPickingListDto> getSLDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {
	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja End

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start
		if (isReportMaxTest()) {
			return testSLPickingMaxDtoList();
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

		// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja Start
		List<SqlSLPickingListPrint> sqlSLPickingListPrintList = slPickingListPrintLogic.select(tPickingR, errSts);
		// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja End
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(種蒔きNoの設定を削除) 2016.01.28 kawana
		// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
		String pickingGroupNo = "";
		// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
		String workDt = "";
		String stockTypeCd = "";
		// 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(種蒔きNoの設定を削除) 2016.01.28 kawana
		String tempNo = "";
		String productCd = "";
		int linN = 0;

		// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start

		// 小計計算用
		SLPickingListDto.PickingNumSubTotal subTotal = null;
		// 荷姿計算用マップ
		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana End

		// 帳票出力データ取得処理
		List<SLPickingListDto> dataList = new ArrayList<SLPickingListDto>();
		for (SqlSLPickingListPrint sqlPrintList : sqlSLPickingListPrintList) {
			SLPickingListDto redto = new SLPickingListDto();
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			redto.setCultureId(getCultureId());
			redto.setReportCd("SLPickingReport");
			redto.setClientCd(sqlPrintList.getClientCd());
			redto.setClientNm(sqlPrintList.getClientNm());
			redto.setCenterCd(sqlPrintList.getCenterCd());
			redto.setCenterNm(sqlPrintList.getCenterNm());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
			redto.setPickingGroupNo(sqlPrintList.getPickingGroupNo());
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
			redto.setWorkDt(sqlPrintList.getWorkDt());
			redto.setSupplyCustomerCd(sqlPrintList.getSupplyCustomerCd());
			redto.setSupplyCustomerNm(sqlPrintList.getSupplyCustomerNm());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
			redto.setJancd(sqlPrintList.getJancd());
			// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
			redto.setLimitDt(sqlPrintList.getLimitDt());
			redto.setLocationCd(sqlPrintList.getLocationCd());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Start
			//内訳
			redto.setBreakdown(sqlPrintList.getBreakdown());
			//入数
			redto.setStringUnitNum(sqlPrintList.getStringUnitNum());
			//最小梱包単位
			redto.setMinimumPackingUnit(sqlPrintList.getMinimumPackingUnit());
			// [Ver3.0] unit of measure対応 2017.11.23 REN End
			redto.setLocationNm(sqlPrintList.getLocationNm());
			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			redto.setPrintFlg(sqlPrintList.getSlOutFlg());
			redto.setProductCd(sqlPrintList.getProductCd());
			redto.setProductNm(sqlPrintList.getProductNm());
			redto.setPickingWorkNo1(sqlPrintList.getPickingWorkNo1());
			redto.setPickingWorkNo2(sqlPrintList.getPickingWorkNo2());
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.04 sja Start
			redto.setShippingPackingNo1(sqlPrintList.getShippingPackingNo1());
			redto.setShippingPackingNo2(sqlPrintList.getShippingPackingNo2());
			redto.setPackingCalCls(sqlPrintList.getPackingCalCls());
			// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.04 sja End
			redto.setStockTypeCd(sqlPrintList.getStockTypeCd());
			redto.setStockTypeNm(sqlPrintList.getStockTypeNm());
			redto.setStoreLabelNo(sqlPrintList.getStoreLabelNo());
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
			redto.setStoreDt(sqlPrintList.getStoreDt());
			redto.setStoreNoFlg(storeNoFlg);
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
			redto.setSumPickingNum(sqlPrintList.getSumPickingNum());
			redto.setSlOutFlg(sqlPrintList.getSlOutFlg());
			redto.setTempNo(sqlPrintList.getTempNo());
			redto.setLot(sqlPrintList.getLot());

			// 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(種蒔きNoの設定を削除) 2016.01.28 kawana
			redto.setSeedingNo(sqlPrintList.getSeedingNo());

			// [ON推-CT4-251]  2014.11.24 zhouj end
			// [ON推-品向-461] No.項目の振り直しを帳票の改ページルールにあわせる 2015.01.08 kawana Start
			if (!CU.equals(redto.getWorkDt(), workDt) ||
					// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
					!CU.equals(redto.getPickingGroupNo(), pickingGroupNo) ||
					// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
					// 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(種蒔きNoの設定を削除) 2016.01.28 kawana
					!CU.equals(redto.getStockTypeCd(), stockTypeCd) ||
					!CU.equals(redto.getTempNo(), tempNo) ||
					!CU.equals(redto.getProductCd(), productCd)) {

				redto.setLineN(1);

				// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start

				// 前行までの小計内訳を設定
				setSubTotalBreakdown(subTotal, sqlPrintList.getProductId(), decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap);

				// 新規小計クラスを作成
				subTotal = new SLPickingListDto.PickingNumSubTotal();
				subTotal.setPickingNum(sqlPrintList.getSumPickingNum());

				redto.setPickingNumSubTotal(subTotal);

				// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana End

			} else if ((!CU.equals(redto.getProductCd(), productCd) || !CU.equals(redto.getTempNo(), tempNo))) {

				redto.setLineN(linN + 1);

				// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start

				// 前行までの小計内訳を設定
				setSubTotalBreakdown(subTotal, sqlPrintList.getProductId(), decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap);

				// 新規小計クラスを作成
				subTotal = new SLPickingListDto.PickingNumSubTotal();
				subTotal.setPickingNum(sqlPrintList.getSumPickingNum());

				redto.setPickingNumSubTotal(subTotal);

				// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana End
			} else {

				redto.setLineN(linN);
				// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start
				// 小計に加算
				subTotal.addPickingNum(sqlPrintList.getSumPickingNum());
				redto.setPickingNumSubTotal(subTotal);
				// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana End
			}
			// [ON推-品向-461] No.項目の振り直しを帳票の改ページルールにあわせる 2015.01.08 kawana End

			// [Ver3.0] unit of measure対応 2017.11.23 REN Del
			dataList.add(redto);
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
			pickingGroupNo = redto.getPickingGroupNo();
			// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
			workDt = redto.getWorkDt();
			stockTypeCd = redto.getStockTypeCd();
			productCd = redto.getProductCd();
			tempNo = redto.getTempNo();
			linN = redto.getLineN();

			// 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(種蒔きNoの設定を削除) 2016.01.28 kawana
		}

		// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start
		// 最終行までの小計の内訳を設定
		setSubTotalBreakdown(subTotal, sqlSLPickingListPrintList.get(sqlSLPickingListPrintList.size() - 1).getProductId(), decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap);
		// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana End

		return dataList;

	}

	/**
	 * 小計クラスの内訳を設定
	 */
	private void setSubTotalBreakdown(SLPickingListDto.PickingNumSubTotal subTotal, long productId, Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap,
			Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap) {
		if (subTotal != null) {
			// 前回までの行の小計の内訳を計算

			MProduct product = selectMProductWithShape(productId);
			// 荷姿要変数の設定
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, product);
			// 合計の入数内訳の取得
			String subTotalBreakdown = WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, subTotal.getPickingNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap, product,
					WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY);
			// 内訳を設定
			subTotal.setBreakdown(subTotalBreakdown);
		}
	}

	/**
	 * 荷姿を含む商品マスタを検索
	 */
	private MProduct selectMProductWithShape(long productId) {

		MProduct product = mProductBhv.selectByPKValueWithDeletedCheck(productId);

		mProductBhv.loadMProductShapeList(product, new ConditionBeanSetupper<MProductShapeCB>() {

			@Override
			public void setup(MProductShapeCB subCB) {
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().setDelFlg_Equal_$0();
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
			}
		});

		return product;
	}

	/**
	* <h2>ケースピッキングリストデータ取得。</h2>
	* @param tPickingR 出庫帳票(更新用)
	* @param errSts エラー時に登録するエラーステータス
	 * @param storeNoFlg 入庫No.管理フラグ
	* @return List<CasePickingListPrintDto> ケースピッキングリスト取得用DTOリスト
	*/
	public List<CasePickingListDto> getCaseDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {
		List<CasePickingListDto> printDtoList = casePickingListPrintLogic.selectPrintData(tPickingR, storeNoFlg, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}
		return printDtoList;
	}

	/**
	* <h2>マルチピッキングリストデータ取得。</h2>
	* @param tPickingR 出庫帳票(更新用)
	* @param storeNoFlg 入庫No.管理フラグ
	* @param errSts エラー時に登録するエラーステータス
	* @return List<MultiPickingListPrintDto> マルチピッキングリスト取得用DTOリスト
	*/
	public List<MultiPickingListDto> getMultiDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start
		if (isReportMaxTest()) {
			return testMultiPickingMaxDtoList();
		}
		// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

	tPickingR.setDelFlg_$0();
	List<SqlMultiPickingListPrint> multiPickingListPrintList = multiPickingListPrintLogic.selectProgressData(tPickingR, errSts);
	List<MultiPickingListDto> dataList = new ArrayList<MultiPickingListDto>();
	for (SqlMultiPickingListPrint sqlPrintList : multiPickingListPrintList) {
		MultiPickingListDto redto = new MultiPickingListDto();
		redto.setCultureId(getCultureId());
		redto.setReportCd("MultiPickingReport");
		redto.setPrintFlg(sqlPrintList.getMltOutFlg());
		redto.setClientCd(sqlPrintList.getClientCd());
		redto.setClientNm(sqlPrintList.getClientNm());
		redto.setWarehouseCd(sqlPrintList.getWarehouseCd());
		redto.setWarehouseNm(sqlPrintList.getWarehouseNm());
		redto.setWorkDt(sqlPrintList.getWorkDt());
		redto.setEmergencyFlg(sqlPrintList.getEmergencyFlg());
		// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
		redto.setPickingGroupNo(sqlPrintList.getPickingGroupNo());
		// [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
		redto.setCartNo(sqlPrintList.getCartNo());
		redto.setLocationCd(sqlPrintList.getLocationCd());
		redto.setLocationNm(sqlPrintList.getLocationNm());
		redto.setStoreLabelNo(sqlPrintList.getStoreLabelNo());
		//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
		redto.setStoreDt(sqlPrintList.getStoreDt());
		redto.setStoreNoFlg(storeNoFlg);
		//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
		redto.setProductCd(sqlPrintList.getProductCd());
		redto.setProductNm(sqlPrintList.getProductNm());
		// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
		redto.setJancd(sqlPrintList.getJancd());
		// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End
		redto.setLimtDt(sqlPrintList.getLimtDt());
		redto.setLot(sqlPrintList.getLot());
		redto.setBacketColNum(sqlPrintList.getBacketColNum());
		redto.setBacketRowNum(sqlPrintList.getBacketRowNum());
		redto.setSumPickingNum(sqlPrintList.getSumPickingNum());
		redto.setPackingNum11(sqlPrintList.getPackingNum11());
		redto.setPackingNum12(sqlPrintList.getPackingNum12());
		redto.setPackingNum13(sqlPrintList.getPackingNum13());
		redto.setPackingNum14(sqlPrintList.getPackingNum14());
		redto.setPackingNum15(sqlPrintList.getPackingNum15());
		redto.setPackingNum16(sqlPrintList.getPackingNum16());
		redto.setPackingNum21(sqlPrintList.getPackingNum21());
		redto.setPackingNum22(sqlPrintList.getPackingNum22());
		redto.setPackingNum23(sqlPrintList.getPackingNum23());
		redto.setPackingNum24(sqlPrintList.getPackingNum24());
		redto.setPackingNum25(sqlPrintList.getPackingNum25());
		redto.setPackingNum26(sqlPrintList.getPackingNum26());
		redto.setPackingNum31(sqlPrintList.getPackingNum31());
		redto.setPackingNum32(sqlPrintList.getPackingNum32());
		redto.setPackingNum33(sqlPrintList.getPackingNum33());
		redto.setPackingNum34(sqlPrintList.getPackingNum34());
		redto.setPackingNum35(sqlPrintList.getPackingNum35());
		redto.setPackingNum36(sqlPrintList.getPackingNum36());
		redto.setPackingNum41(sqlPrintList.getPackingNum41());
		redto.setPackingNum42(sqlPrintList.getPackingNum42());
		redto.setPackingNum43(sqlPrintList.getPackingNum43());
		redto.setPackingNum44(sqlPrintList.getPackingNum44());
		redto.setPackingNum45(sqlPrintList.getPackingNum45());
		redto.setPackingNum46(sqlPrintList.getPackingNum46());
		redto.setPackingNum51(sqlPrintList.getPackingNum51());
		redto.setPackingNum52(sqlPrintList.getPackingNum52());
		redto.setPackingNum53(sqlPrintList.getPackingNum53());
		redto.setPackingNum54(sqlPrintList.getPackingNum54());
		redto.setPackingNum55(sqlPrintList.getPackingNum55());
		redto.setPackingNum56(sqlPrintList.getPackingNum56());
		redto.setPackingNum61(sqlPrintList.getPackingNum61());
		redto.setPackingNum62(sqlPrintList.getPackingNum62());
		redto.setPackingNum63(sqlPrintList.getPackingNum63());
		redto.setPackingNum64(sqlPrintList.getPackingNum64());
		redto.setPackingNum65(sqlPrintList.getPackingNum65());
		redto.setPackingNum66(sqlPrintList.getPackingNum66());
		dataList.add(redto);
	}

	return dataList;

	}
	//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe add End

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka Start

	/**
	 *<h2>種蒔きリスト最大桁テスト用</h2>
	 * <pre>
	 * 最大桁テストを行う場合に実行する。
	 * 本メソッドを使用する場合はB_PROPATYマスタの[reportMaxTestMode]を'test'に設定すること
	 * </pre>
	 * @param なし
	 * @return List<SLPickingListDto> 出力用リスト
	 */
	public List<SLPickingListDto> testSLPickingMaxDtoList() {

		SLPickingListDto redto = new SLPickingListDto();
		redto.setCultureId(getCultureId());
		redto.setReportCd("SLPickingReport");
		redto.setClientCd(WRMT.clientCd());
		redto.setClientNm(WRMT.clientAbbr());
		redto.setCenterCd(WRMT.centerCd());
		redto.setCenterNm(WRMT.centerAbbr());
		redto.setPickingGroupNo(WRMT.pickingGroupNo());
		redto.setWorkDt(WRMT.date());
		redto.setSupplyCustomerCd(WRMT.customerCd());
		redto.setSupplyCustomerNm(WRMT.customerAbbr());
		redto.setJancd(WRMT.janCd());
		redto.setLimitDt(WRMT.date());
		redto.setLocationCd(WRMT.locationCd());
		redto.setBreakdown(WRMT.breakDown());
		redto.setStringUnitNum(WRMT.unitNum());
		redto.setMinimumPackingUnit(WRMT.minimumUnit());
		redto.setLocationNm(WRMT.locationNm());
		redto.setPrintFlg("1");
		redto.setProductCd(WRMT.productCd());
		redto.setProductNm(WRMT.productAbbr());
		redto.setPickingWorkNo1(WRMT.pickingWorkNo().substring(0, 6));
		redto.setPickingWorkNo2(WRMT.pickingWorkNo().substring(6));
		redto.setShippingPackingNo1(WRMT.shippingPackingNo().substring(0, 5));
		redto.setShippingPackingNo2(WRMT.shippingPackingNo().substring(6));
		redto.setPackingCalCls("0");
		redto.setStockTypeCd(WRMT.stockTypeCd());
		redto.setStockTypeNm(WRMT.stockTypeNm());
		redto.setStoreDt(WRMT.date());
		redto.setStoreNoFlg("0");
		redto.setSumPickingNum(WRMT.stockNum());
		redto.setSlOutFlg("1");
		redto.setTempNo(WRMT.tempNo());
		redto.setLot(WRMT.lot());
		redto.setSeedingNo(WRMT.seedingNo());
		redto.setLineN(1);

		SLPickingListDto.PickingNumSubTotal subTotal = new SLPickingListDto.PickingNumSubTotal();
		subTotal.setBreakdown(WRMT.breakDown());
		subTotal.setPickingNum(WRMT.stockNum());
		redto.setPickingNumSubTotal(subTotal);

		List<SLPickingListDto> dataList = new ArrayList<SLPickingListDto>();
		for (int i = 0; i < 1000; i++) {
			// 1000行作成 (総合計の10桁表示のため)
			dataList.add(redto);
		}

		return dataList;

	}

	/**
	 *<h2>トータルピッキングリスト最大桁テスト用</h2>
	 * <pre>
	 * 最大桁テストを行う場合に実行する。
	 * 本メソッドを使用する場合はB_PROPATYマスタの[reportMaxTestMode]を'test'に設定すること
	 * </pre>
	 * @param なし
	 * @return List<TotalPickingListDto> 出力用リスト
	 */
	public List<TotalPickingListDto> testTotalPickingMaxDtoList() {

		TotalPickingListDto redto = new TotalPickingListDto();
		redto.setCultureId(getCultureId());
		redto.setReportCd("TotalPickingList");
		redto.setPrintFlg("1");
		redto.setClientCd(WRMT.clientCd());
		redto.setClientNm(WRMT.clientAbbr());
		redto.setWarehouseCd(WRMT.warehouseCd());
		redto.setWarehouseNm(WRMT.warehouseAbbr());
		redto.setCenterCd(WRMT.centerCd());
		redto.setCenterNm(WRMT.centerAbbr());
		redto.setWorkDt(WRMT.date());
		redto.setPickingGroupNo(WRMT.pickingGroupNo());
		redto.setStockTypeCd(WRMT.stockTypeCd());
		redto.setStockTypeNm(WRMT.stockTypeNm());
		redto.setZoneCd(WRMT.zoneCd());
		redto.setZoneNm(WRMT.zoneNm());
		redto.setLocationCd(WRMT.locationCd());
		redto.setLocationNm(WRMT.locationNm());
		redto.setStoreLabelNo(WRMT.storeLabelNo());
		redto.setStoreDt(WRMT.date());
		redto.setStoreNoFlg("0");
		redto.setBreakdown(WRMT.breakDown());
		redto.setStringUnitNum(WRMT.unitNum());
		redto.setMinimumPackingUnit(WRMT.minimumUnit());
		redto.setProductCd(WRMT.productCd());
		redto.setProductNm(WRMT.productAbbr());
		redto.setJancd(WRMT.janCd());
		redto.setLimtDt(WRMT.date());
		redto.setLot(WRMT.lot());
		redto.setSumPickingNum(WRMT.stockNum());
		redto.setTempNo(WRMT.tempNo());
		redto.setChargeNum(WRMT.stockNum());

		List<TotalPickingListDto> dataList = new ArrayList<TotalPickingListDto>();
		for (int i = 0; i < 1000; i++) {
			// 1000行作成 (総合計の10桁表示のため)
			dataList.add(redto);
		}

		return dataList;
	}

	/**
	 *<h2>マルチピッキングリスト最大桁テスト用</h2>
	 * <pre>
	 * 最大桁テストを行う場合に実行する。
	 * 本メソッドを使用する場合はB_PROPATYマスタの[reportMaxTestMode]を'test'に設定すること
	 * </pre>
	 * @param なし
	 * @return List<MultiPickingListDto> 出力用リスト
	 */
	public List<MultiPickingListDto> testMultiPickingMaxDtoList() {

		MultiPickingListDto redto = new MultiPickingListDto();
		redto.setCultureId(getCultureId());
		redto.setReportCd("MultiPickingReport");
		redto.setPrintFlg("1");
		redto.setClientCd(WRMT.clientCd());
		redto.setClientNm(WRMT.clientAbbr());
		redto.setWarehouseCd(WRMT.warehouseCd());
		redto.setWarehouseNm(WRMT.warehouseAbbr());
		redto.setWorkDt(WRMT.date());
		redto.setEmergencyFlg("0");
		redto.setPickingGroupNo(WRMT.pickingGroupNo());
		redto.setCartNo(999L);
		redto.setLocationCd(WRMT.locationCd());
		redto.setLocationNm(WRMT.locationNm());
		redto.setStoreLabelNo(WRMT.storeLabelNo());
		redto.setStoreDt(WRMT.date());
		redto.setStoreNoFlg("0");
		redto.setProductCd(WRMT.productCd());
		redto.setProductNm(WRMT.productAbbr());
		redto.setJancd(WRMT.janCd());
		redto.setLimtDt(WRMT.date());
		redto.setLot(WRMT.lot());
		redto.setBacketColNum(6L);
		redto.setBacketRowNum(3L);
		redto.setSumPickingNum(WRMT.stockNum());
		redto.setPackingNum11(WRMT.stockNum());
		redto.setPackingNum12(WRMT.stockNum());
		redto.setPackingNum13(WRMT.stockNum());
		redto.setPackingNum14(WRMT.stockNum());
		redto.setPackingNum15(WRMT.stockNum());
		redto.setPackingNum16(WRMT.stockNum());
		redto.setPackingNum21(WRMT.stockNum());
		redto.setPackingNum22(WRMT.stockNum());
		redto.setPackingNum23(WRMT.stockNum());
		redto.setPackingNum24(WRMT.stockNum());
		redto.setPackingNum25(WRMT.stockNum());
		redto.setPackingNum26(WRMT.stockNum());
		redto.setPackingNum31(WRMT.stockNum());
		redto.setPackingNum32(WRMT.stockNum());
		redto.setPackingNum33(WRMT.stockNum());
		redto.setPackingNum34(WRMT.stockNum());
		redto.setPackingNum35(WRMT.stockNum());
		redto.setPackingNum36(WRMT.stockNum());
		redto.setPackingNum41(WRMT.stockNum());
		redto.setPackingNum42(WRMT.stockNum());
		redto.setPackingNum43(WRMT.stockNum());
		redto.setPackingNum44(WRMT.stockNum());
		redto.setPackingNum45(WRMT.stockNum());
		redto.setPackingNum46(WRMT.stockNum());
		redto.setPackingNum51(WRMT.stockNum());
		redto.setPackingNum52(WRMT.stockNum());
		redto.setPackingNum53(WRMT.stockNum());
		redto.setPackingNum54(WRMT.stockNum());
		redto.setPackingNum55(WRMT.stockNum());
		redto.setPackingNum56(WRMT.stockNum());
		redto.setPackingNum61(WRMT.stockNum());
		redto.setPackingNum62(WRMT.stockNum());
		redto.setPackingNum63(WRMT.stockNum());
		redto.setPackingNum64(WRMT.stockNum());
		redto.setPackingNum65(WRMT.stockNum());
		redto.setPackingNum66(WRMT.stockNum());

		List<MultiPickingListDto> dataList = new ArrayList<MultiPickingListDto>();
		for (int i = 0; i < 10; i++) {
			// 10行作成 (総合計がないため少ない)
			dataList.add(redto);
		}

		return dataList;

	}

	// [#5486][v3.1] 最大桁数のテスト用メソッドを追加 2018.10.31 tanaka End

}
