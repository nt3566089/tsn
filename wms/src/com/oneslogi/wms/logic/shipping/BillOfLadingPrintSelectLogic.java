package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBillOfLadingPrintSelectPmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSelect;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.shipping.BillOfLadingPrintDto;

/**
 * Bill of Lading発行データ取得ロジッククラス
 */
public class BillOfLadingPrintSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.07.11 miyabe End
	// [1.1.4-CT-052] 1次Bill of Lading出力済の条件を変更 2016.05.23 kawana Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [1.1.4-CT-052] 1次Bill of Lading出力済の条件を変更 2016.05.23 kawana End


	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しBill of Ladingの発行データを取得する。
	 * データ存在する場合、センタ区分値マスタより表示名称を設定する。
	 *
	 * 検索検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：納品先CD・出荷日（From) ・出荷日（To）
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.・Bill of Lading No・配送コース
	 * @param tPickingR 出庫帳票：Bill of Lading出力フラグ
	 * @param mCommonCarrier 共通運送業者マスタ：Bill of Lading出力対象フラグ・運送業者
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlBillOfLadingPrintSelect> Bill of Lading発行データ
	 */
	public PagingResultBean<SqlBillOfLadingPrintSelect> select(TAllocInstH tAllocInstH, TPickingH tPickingH, TPickingR tPickingR, MCommonCarrier mCommonCarrier,
			BillOfLadingPrintDto.PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlBillOfLadingPrintSelect> result = null;

		// ===== Bill of Ladingデータ取得 =====

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlBillOfLadingPrintSelect;

		// 検索条件の設定
		SqlBillOfLadingPrintSelectPmb pmb = setCondition(tAllocInstH, tPickingH, tPickingR, mCommonCarrier);

		// 検索実行
		Class<SqlBillOfLadingPrintSelect> entityType = SqlBillOfLadingPrintSelect.class;
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
		classCdList.add("BOL_OUT_FLG");
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
		// 区分値マスタの名称の設定
		for (SqlBillOfLadingPrintSelect sql : result) {
			if (bClassMap.containsKey("BOL_OUT_FLG")) {
				if (bClassMap.get("BOL_OUT_FLG").containsKey(sql.getBolOutFlg())) {
					sql.setBolOutNm(bClassMap.get("BOL_OUT_FLG").get(sql.getBolOutFlg()));
				}
			}
		}

		return result;
	}

	/**
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQLの検索条件を設定する。
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：納品先CD・配送コースID・出荷日（From) ・出荷日（To）
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.・Bill of Lading No・配送コース
	 * @param tPickingR 出庫帳票：Bill of Lading出力フラグ
	 * @param mCommonCarrier 共通運送業者マスタ：Bill of Lading出力対象フラグ・運送業者
	 * @return SqlBillOfLadingPrintSelectPmb 検索条件
	 */
	protected SqlBillOfLadingPrintSelectPmb setCondition(TAllocInstH tAllocInstH, TPickingH tPickingH, TPickingR tPickingR, MCommonCarrier mCommonCarrier) {

		// 検索条件の設定
		SqlBillOfLadingPrintSelectPmb pmb = new SqlBillOfLadingPrintSelectPmb();
		pmb.setClientId(tPickingH.getClientId()); // 荷主ID
		pmb.setCenterId(tPickingH.getCenterId()); // センタID
		pmb.setDtFrom(tAllocInstH.getShippingDtFrom()); // 日付From
		pmb.setDtTo(tAllocInstH.getShippingDtTo()); // 日付To
		pmb.setBolOutputTargetFlg(mCommonCarrier.getBolOutputTargetFlg()); // 発行対象のみ表示
		pmb.setCarrierCd(mCommonCarrier.getCarrierCd()); // 運送業者
		pmb.setDeliveryCourseCd_PrefixSearch(tPickingH.getDeliveryCourseCd()); // 配送コースCD
		pmb.setSupplyCustomerCd_PrefixSearch(tAllocInstH.getSupplyCustomerCd());// 納品先CD
		pmb.setPickingWorkNo_SuffixSearch(tPickingH.getPickingWorkNo()); // 出庫作業No.
		pmb.setBolNo_PrefixSearch(tPickingH.getBolNo()); // Bill of Lading No
		pmb.setBolOutFlg(tPickingR.getBolOutFlg()); // Bill of Lading出力フラグ

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
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・リスト発行区分・発行区分
	 * @param tPackingH 梱包ヘッダ：混載フラグ
	 * @param mWarehouseList 倉庫マスタリスト
	 * @param tShippingInstHList 出荷指示ヘッダリスト：出庫指示バッチNo.・納品先CD・荷主ID・センタID
	 * @param tPickingHList 出庫ヘッダリスト：出庫作業No.
	 * @param update 出庫帳票(更新用)：全項目
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
    // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja Start
	//public int updateControlNo(TPickingH tPickingH, final List<MWarehouse> mWarehouseList, List<TShippingInstH> tShippingInstHList, List<TPickingH> tPickingHList, TPickingR update, ErrorStatus errStatus) {
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
//	public int updateControlNo(TPickingH tPickingH, final TPackingH tPackingH, final List<MWarehouse> mWarehouseList, List<TShippingInstH> tShippingInstHList, List<TPickingH> tPickingHList, TPickingR update, ErrorStatus errStatus) {
	public int updateControlNo(final TPickingH tPickingH, final TPackingH tPackingH, final List<MWarehouse> mWarehouseList, List<TShippingInstH> tShippingInstHList, List<TPickingH> tPickingHList, TPickingR update, ErrorStatus errStatus) {
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
        // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja End

		// 出荷指示ヘッダリストのデータ件数分繰返
		int reUpdCnt = 0;
		int rowIndex = -1;
		for (final TShippingInstH tShippingInstH : tShippingInstHList) {
			rowIndex++;
			// [新ｿﾘ-084] 明細項目に倉庫CD、倉庫名称を追加ので、変数rowを追加 2014.11.21 fengc Start
//			final int row  = rowIndex;
			// [新ｿﾘ-084] 明細項目に倉庫CD、倉庫名称を追加ので、変数rowを追加 2014.11.21 fengc End
			int updCnt = 0;
			List<String> pickingStatusList = Arrays.asList(new String[] { "25", "30", "35", "40", "45", "50" });

			// ===== 出庫帳票データ更新 =====
			// 更新条件作成
			TPickingRCB cb = tPickingRBhv.newMyConditionBean();
			cb.setupSelect_TPickingH();
			cb.setupSelect_TPickingH().withTAllocInstH();
			cb.query().queryTPickingH().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
				@Override
				public void query(TShippingInstHCB subCB) {
					subCB.query().setPickingBatchNo_Equal(tShippingInstH.getPickingBatchNo()); //出庫指示バッチNo.
					subCB.query().setSupplyCustomerCd_Equal(tShippingInstH.getSupplyCustomerCd()); //納品先CD
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/06/08 パン Start
					//センタＩＤ（Center_ID）
					subCB.query().setCenterId_Equal(tShippingInstH.getCenterId());
					//クライアントＩＤ（Client_ID）
					subCB.query().setClientId_Equal(tShippingInstH.getClientId());
				}
			});
	        // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja Start
			cb.query().queryTPickingH().queryTAllocInstH().existsTPackingHList(new SubQuery<TPackingHCB>() {
				@Override
				public void query(TPackingHCB subCB) {
					//センタＩＤ（Center_ID）
					subCB.query().setCenterId_Equal(tShippingInstH.getCenterId());
					//クライアントＩＤ（Client_ID）
					subCB.query().setClientId_Equal(tShippingInstH.getClientId());
					//混載フラグ(MIXED_FLG)
					subCB.query().setMixedFlg_Equal(tPackingH.getMixedFlg());
				}
			});
	        // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja End

			//検索条件
			cb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingHList.get(rowIndex).getPickingWorkNo());
			cb.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
			cb.query().queryTPickingH().setPickingStatus_InScope(pickingStatusList);
			cb.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
//			cb.query().setUpdDt_LessEqual(tShippingInstH.getUpdDt());

			// リスト発行区分が"1"(一次ピッキング)の場合
			if (CU.equals(tPickingH.getPicCls(), "1")) {

				// 発行区分が"0"(未発行)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "0")) {
					cb.query().setPl1OutDt_IsNull();
//					cb.query().setOplOutFlg_Equal_$0();
//					cb.query().setTplOutFlg_Equal_$0();
//					// [エンハンス PH2.0] ケースBill of Ladingを追加 2015.12.13 sja Start
//					cb.query().setCaseOutFlg_Equal_$0();
//					cb.query().setMltOutFlg_Equal_$0();
//					// [エンハンス PH2.0] ケースBill of Ladingを追加 2015.12.13 sja End
				}

				// 発行区分が"1"(発行済)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "1")) {
					cb.query().setPl1OutDt_IsNotNull();
//					cb.orScopeQuery(new OrQuery<TPickingRCB>() {
//						public void query(TPickingRCB orCB) {
//							orCB.query().setOplOutFlg_Equal_$1();
//							orCB.query().setTplOutFlg_Equal_$1();
//							// [エンハンス PH2.0] ケースBill of Ladingを追加 2015.12.13 sja Start
//							orCB.query().setCaseOutFlg_Equal_$1();
//							orCB.query().setMltOutFlg_Equal_$1();
//							// [エンハンス PH2.0] ケースBill of Ladingを追加 2015.12.13 sja End
//						}
//					});
				}
			}

			// リスト発行区分が"2"(二次ピッキング)の場合
			if (CU.equals(tPickingH.getPicCls(), "2")) {

				// 発行区分が"0"(未発行)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "0")) {
					cb.query().setPl2OutDt_IsNull();
//					cb.query().setPlOutFlg_Equal_$0();
//					cb.query().setSlOutFlg_Equal_$0();
				}

				// 発行区分が"1"(発行済)の場合
				if (CU.equals(tPickingH.getListOutKbn(), "1")) {
					cb.query().setPl2OutDt_IsNotNull();
//					cb.orScopeQuery(new OrQuery<TPickingRCB>() {
//						public void query(TPickingRCB orCB) {
//							orCB.query().setPlOutFlg_Equal_$1();
//							orCB.query().setSlOutFlg_Equal_$1();
//						}
//					});
				}
			}

			// ===== 出庫帳票の更新 =====
			updCnt = tPickingRBhv.queryUpdate(update, cb);
			reUpdCnt = reUpdCnt + updCnt;
		}

	    return reUpdCnt;
	}

	// [1.1.4-CT-052] 1次Bill of Lading出力済の条件を変更 2016.05.23 kawana Start

	/**
	 * <h2>1次Bill of Lading出力情報を更新する。</h2>
	 * <pre>
	 * 1次Bill of Lading出力者情報を更新する。
	 * ピース単位のBill of Ladingとケース単位のBill of Ladingの
	 * どちらも出力されている場合は1次Bill of Lading出力者ID、出力者日時を更新する。
	 * ※1次Bill of Lading出力済の場合は更新しない。
	 * </pre>
	 * @param controlNo 梱包ヘッダのコントロールNo.
	 */
	public void updatePl1Out(long controlNo) {

		// ===== 該当データを検索 =====
		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);

		List<TPackingH> selectPackingHList = tPackingHBhv.selectList(cb);

		// ===== 出庫ヘッダ単位にまとめる =====

		// 梱包ヘッダリストのマップ(キー：出庫ヘッダID)
		Map<Long, List<TPackingH>> packingMap = new HashMap<Long, List<TPackingH>>();
		for (TPackingH h : selectPackingHList) {
			long pickingHId = h.getPickingHId();

			if (packingMap.containsKey(pickingHId)) {
				packingMap.get(pickingHId).add(h);
			} else {
				List<TPackingH> list = new ArrayList<TPackingH>();
				list.add(h);

				packingMap.put(pickingHId, list);
			}
		}

		Timestamp time = new Timestamp(System.currentTimeMillis());

		// ===== 出庫ヘッダ単位に判定 =====
		for (List<TPackingH> packingHList : packingMap.values()) {

			// 全部ケースピッキングか
			boolean isAllCasePic = true;
			// 全部ピースピッキングか
			boolean isAllPiecePic = true;
			for (TPackingH packingH : packingHList) {
				if (packingH.isMixedFlg$0()) {
					isAllPiecePic = false;
				} else if (packingH.isMixedFlg$1()) {
					isAllCasePic = false;
				}
			}

			TPickingR pickingR = packingHList.get(0).getTPickingH().getTPickingRAsOne();

			// ピースBill of Ladingを出力済か
			boolean didOutPiecePic = false;
			if (isAllCasePic) {
				// 全部ケース
				didOutPiecePic = true;
			} else if (pickingR.isOplOutFlg$1() || pickingR.isTplOutFlg$1() || pickingR.isMltOutFlg$1()) {
				// オーダーBill of Lading、トータルBill of Lading、マルチBill of Ladingのいずれかを出力済
				didOutPiecePic = true;
			}

			// ケースBill of Ladingを出力済か
			boolean didOutCasePic = false;
			if (isAllPiecePic) {
				// 全部ピース
				didOutCasePic = true;
			} else if (pickingR.isCaseOutFlg$1()) {
				// ケースBill of Lading出力済
				didOutCasePic = true;
			}

			if (didOutPiecePic && didOutCasePic) {
				// ピース、ケースともにBill of Lading出力済

				// 出力者情報を設定して返却
				// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
				pickingR.setPl1OutFlg_$1();
				// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
				pickingR.setPl1OutUserId(this.getUserId());
				pickingR.setPl1OutDt(time);

				tPickingRBhv.update(pickingR);
			}
		}
	}

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

	// [1.1.4-CT-052] 1次Bill of Lading出力済の条件を変更 2016.05.23 kawana End
}
