package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTReceivePlanB;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 入荷未完了一覧データ取得ロジッククラス
 */
public class ReceivePartListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	// [エンハンス PH2.0] 商品別入荷一覧入数内容を変更 2015.12.1 sja Start
//	@Inject
//	private MProductBhv mProductBhv;
	// [エンハンス PH2.0] 商品別入荷一覧入数内容を変更 2015.12.1 sja End
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	/**
	 * <h2>入荷未完了一覧データを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースから入荷未完了一覧データを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param planHeader 入荷予定ヘッダ：荷主ID・センタID・入荷予定日(From)・入荷予定日(To)・入荷納品ステータス・
	 *                                   予定仕入先CD・入荷予定ヘッダID・予定顧客入荷指示No.・WMS入荷伝票No.
	 * @param body 入荷予定ボディ：商品CD、入荷予定ボディID
	 * @param recordHeader 入庫実績ボディ：入庫日(From)・入庫日(To)
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TReceivePlanB> 入荷予定ボディリスト
	 */
	public PagingResultBean<TReceivePlanB> select(TReceivePlanH planHeader, final TReceivePlanB body, final TStoreRecordB recordHeader, final TStoreRecordH head, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TReceivePlanB> result = null;

		// ===== 伝票別入荷一覧データ取得 =====

		// 検索条件の設定
		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();

		// 入荷予定ヘッダ
		cb.setupSelect_TReceivePlanH();
		// 入荷予定ヘッダ
		cb.setupSelect_TReceivePlanH().withTReceivePlanHSelf();
		// 荷主マスタ
		cb.setupSelect_TReceivePlanH().withMClient();
		// センタマスタ
		cb.setupSelect_TReceivePlanH().withMCenter();
		// 取引先マスタ(仕入先ID)
		cb.setupSelect_TReceivePlanH().withMCustomerByPlanSupplierId();
		// 取引先マスタ(予定預託ID)
		cb.setupSelect_TReceivePlanH().withMCustomerByPlanDepositId();
		// 商品マスタ
		cb.setupSelect_MProduct();
		// 処理区分マス
		cb.setupSelect_TReceivePlanH().withMProcessType();
		cb.setupSelect_TReceivePlanH().withMProcessType().withVDict(getCultureId());
		// 区分値マスタ
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 削除 Start
		//cb.setupSelect_TReceivePlanH().withMCenterClassDtlByReceiveDeliveryStatus(getCenterClassCondition());

		//cb.setupSelect_TReceivePlanH().withMCenterClassDtlByReceiveDeliveryStatus(getCenterClassCondition()).withVDict(getCultureId());
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 削除 End

		//add by yangn 20140901 start
		cb.setupSelect_MLocation();
		//add by yangn 20140901 end

		// 荷主IDの設定
		cb.query().queryTReceivePlanH().setClientId_Equal(planHeader.getClientId());

		// センタIDの設定
		cb.query().queryTReceivePlanH().setCenterId_Equal(planHeader.getCenterId());

		// 入荷予定日の設定
		cb.query().queryTReceivePlanH().setReceivePlanDt_GreaterEqual(planHeader.getReceivePlanDtFrom());

		// 入荷予定日の設定
		cb.query().queryTReceivePlanH().setReceivePlanDt_LessEqual(planHeader.getReceivePlanDtTo());

		// 入荷納品ステータスの設定
		cb.query().queryTReceivePlanH().setReceiveDeliveryStatus_Equal(planHeader.getReceiveDeliveryStatus());

		// 予定仕入先CDの設定
		cb.query().queryTReceivePlanH().setPlanSupplierCd_PrefixSearch(planHeader.getPlanSupplierCd());

		// 入荷予定ヘッダID
		cb.query().queryTReceivePlanH().setReceivePlanHId_Equal(planHeader.getReceivePlanHId());

		// WMS入荷伝票No.の設定
		cb.query().queryTReceivePlanH().setReceiveSlipNo_PrefixSearch(planHeader.getReceiveSlipNo());

		// 予定顧客入荷指示No.の設定
		cb.query().queryTReceivePlanH().setPlanClientReceiveNo_PrefixSearch(planHeader.getPlanClientReceiveNo());

		// 商品CDの設定
		cb.query().setProductCd_PrefixSearch(body.getProductCd());

		// 入荷ステータスの設定
		// mod by zhouj 2014/07/31 start
		//cb.query().setReceiveStatus_Equal_$03();
		cb.query().queryTReceivePlanH().setReceiveStatus_Equal_$03();
		// mod by zhouj 2014/07/31 end

		// 顧客入荷指示No.の設定
		if (!CU.isNullOrEmpty(head.getClientReceiveNo())) {
			cb.query().queryTReceivePlanH().existsTStoreRecordHList(new SubQuery<TStoreRecordHCB>() {
				@Override
				public void query(TStoreRecordHCB subCB) {
					subCB.query().setClientReceiveNo_PrefixSearch(head.getClientReceiveNo());
					setDelFlg(subCB);
				}
			});
		}

		// 入庫日絞り込み条件指定
		if (!CU.isNullOrEmpty(recordHeader.getStoreDtFrom()) || !CU.isNullOrEmpty(recordHeader.getStoreDtTo())) {
			cb.query().existsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
				@Override
				public void query(TStoreRecordBCB subCB) {
					subCB.query().setStoreDt_GreaterEqual(recordHeader.getStoreDtFrom());
					subCB.query().setStoreDt_LessEqual(recordHeader.getStoreDtTo());
					setDelFlg(subCB);
				}
			});
		}

		//入庫実績ボディの入庫日の最大値を抽出
		cb.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
			@Override
			public void query(TStoreRecordBCB subCB) {

				// 入庫日の設定
				subCB.query().setStoreDt_GreaterEqual(recordHeader.getStoreDtFrom());
				subCB.query().setStoreDt_LessEqual(recordHeader.getStoreDtTo());
				subCB.specify().columnStoreDt();
				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_lastStoreDt);

		//入庫実績ボディの入庫数の合計値を抽出
		cb.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
			@Override
			public void query(TStoreRecordBCB subCB) {

				// 入庫日の設定
				subCB.query().setStoreDt_GreaterEqual(recordHeader.getStoreDtFrom());
				subCB.query().setStoreDt_LessEqual(recordHeader.getStoreDtTo());
				subCB.specify().columnStoreNum();
				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_sumStoreNum, op -> op.coalesce(0));

		// 辞書マスタビューの辞書名称の最大値を抽出
		cb.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {

			public void query(TStoreRecordBCB subCB) {
				subCB.specify().derivedTStockInoutList().max(new SubQuery<TStockInoutCB>() {
					@Override
					public void query(TStockInoutCB subCB) {
						subCB.specify().specifyTStock().specifyMStockType().columnStockTypeId();
						setDelFlg(subCB);
					}

				}, null);

				setDelFlg(subCB);
			}
		}, TReceivePlanB.TRPB_maxStockTypeId);

		cb.columnQuery(new SpecifyQuery<TReceivePlanBCB>() {
		    public void specify(TReceivePlanBCB cb) {
		        cb.specify().columnPlanNum();
		    }
		}).greaterThan(new SpecifyQuery<TReceivePlanBCB>() {
		    public void specify(TReceivePlanBCB cb) {
		    	cb.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
					public void query(TStoreRecordBCB subCB) {

						// 入庫日の設定
						subCB.query().setStoreDt_GreaterEqual(recordHeader.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(recordHeader.getStoreDtTo());
						subCB.specify().columnStoreNum();
						setDelFlg(subCB);
					}
				}, null); // エリアス名は利用しないので null 固定
		    }
		});

		// [Ver3.0] unit of measure対応 2017.11.20 駱 Del

		// ソート条件：行No
		cb.query().queryTReceivePlanH().addOrderBy_ReceivePlanDt_Asc();
		cb.query().queryTReceivePlanH().addOrderBy_PlanClientReceiveNo_Asc();
		cb.query().queryTReceivePlanH().addOrderBy_ReceiveSlipNo_Asc();

		cb.query().addOrderBy_LineNo_Asc();
		cb.query().addOrderBy_ReceiveStatus_Asc();
		cb.query().addOrderBy_ProductCd_Asc();

		// 検索実行
		result = selectPage(tReceivePlanBBhv, cb, paging);

		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("RECEIVE_DELIVERY_STATUS");//入荷納品ステータス

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
		// 区分値マスタより取得
		Map<String, Map<String, String>> bClassMap = this.getBClassInfo(classCdList);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End



		tReceivePlanBBhv.loadTStoreRecordBList(result, new ConditionBeanSetupper<TStoreRecordBCB>() {
			public void setup(TStoreRecordBCB subCB) {
				subCB.query().setReceivePlanBId_Equal(body.getReceivePlanBId());
			}
		});

		// [エンハンス PH2.0] 入荷未完了一覧入数内容を変更 2015.12.1 sja Start
//		// 商品リスト
//		List<MProduct> mProductList = new ArrayList<MProduct>();
//
//		for (TReceivePlanB receivePlanB : result) {
//			mProductList.add(receivePlanB.getMProduct());
//		}
//		if (mProductList.size() > 0) {
//			// 商品荷姿マスタ
//			mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>() {
//				public void setup(MProductShapeCB pcb) {
//				}
//			});
//			int i = -1;
//
//			for (TReceivePlanB receivePlanB : result) {
//				i++;
//				receivePlanB.setMProduct(mProductList.get(i));
//			}
//
//		}
		// [エンハンス PH2.0] 入荷未完了一覧入数内容を変更 2015.12.1 sja End

		// ===== ０件チェック =====
		PagingResultBean<TReceivePlanB> tReceivePlanBList = new PagingResultBean<TReceivePlanB>();
		if(result.size() != 0){
			// [Ver3.0] unit of measure対応 2017.11.20 駱 Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
			tReceivePlanBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTReceivePlanB>() {
				public void handle(LoaderOfTReceivePlanB loader) {
					loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
						public void setup(MProductShapeCB subCB) {
							subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
							subCB.query().setDelFlg_Equal_$0();
							subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						}
					});
				}
			});

			Map<Long, String> decimalExistFlgMap = new HashMap<>();
			Map<Long, String> minimumUnitMap = new HashMap<>();
			Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
			Map<Long, List<String>> parentUnitMap = new HashMap<>();
			for (TReceivePlanB tReceivePlanB : result) {

				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tReceivePlanB.getMProduct());
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
				// === 区分値マスタの名称の設定 ===
				//入荷納品ステータス
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				tReceivePlanB.getTReceivePlanH().setBClassDtlByReceiveDeliveryStatus(this.getBClassDtl(bClassMap, "RECEIVE_DELIVERY_STATUS", tReceivePlanB.getTReceivePlanH().getReceiveDeliveryStatus()));
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End

				// 予定数の取得
				BigDecimal planNum = tReceivePlanB.getPlanNum();
				BigDecimal SumStoreNum = tReceivePlanB.getSumStoreNum();
				if (planNum != null && SumStoreNum != null) {
					// [Ver3.0] unit of measure対応 2017.11.20 駱 Del
				    // [Ver3.0] unit of measure対応 2017.11.20 駱 Start
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					// 商品最小荷姿単位名称
					tReceivePlanB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tReceivePlanB.getMProduct()));
					// 入数内訳
					tReceivePlanB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tReceivePlanB.getMProduct()));
					// 予定内訳
					tReceivePlanB.setPlanBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, planNum, minimumUnitMap, parentUnitNumMap
							, parentUnitMap, tReceivePlanB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 入庫内訳
					tReceivePlanB.setStoreBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, SumStoreNum, minimumUnitMap, parentUnitNumMap
							, parentUnitMap, tReceivePlanB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// [Ver3.0] unit of measure対応 2017.11.20 駱 End
					tReceivePlanBList.add(tReceivePlanB);
				}

				// [新ｿﾘV2-005] 入荷未完了一覧 - 検索時の入荷予定日と指示日を比較 2016.07.15 kawana Start
				// 変更前入荷予定日
				tReceivePlanB.getTReceivePlanH().setPreReceivePlanDt(tReceivePlanB.getTReceivePlanH().getReceivePlanDt());
				// [新ｿﾘV2-005] 入荷未完了一覧 - 検索時の入荷予定日と指示日を比較 2016.07.15 kawana End
			}
		}
		if (tReceivePlanBList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return tReceivePlanBList;

	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
	/**
	 * <h2>センタ区分値マスタ情報（コード・名称）を取得</h2>
	 *
	 * @param classCdList 区分値CDのリスト
	 * @return Map<String, Map<String, String>> センタ区分値マスタ情報のマップ
	 */
	private Map<String, Map<String, String>> getBClassInfo(List<String> classCdList) {

		// 区分値マスタより取得
		if(classCdList == null || classCdList.isEmpty()){
			return null;
		}
		BClassDtlCB bClassDtlCB = bClassDtlBhv.newConditionBean();
		bClassDtlCB.specify().columnClassDtlCd();
		bClassDtlCB.specify().columnDictId();
		bClassDtlCB.setupSelect_BClass();
		bClassDtlCB.specify().specifyBClass().columnClassCd();
		bClassDtlCB.setupSelect_VDict(getCultureId());
		bClassDtlCB.specify().specifyVDict().columnDictNm();
		bClassDtlCB.query().queryBClass().setClassCd_InScope(classCdList);
		bClassDtlCB.query().queryBClass().addOrderBy_ClassCd_Asc();
		bClassDtlCB.query().addOrderBy_ClassDtlCd_Asc();

		List<BClassDtl> bClassList = bClassDtlBhv.selectList(bClassDtlCB);

		Map<String, Map<String, String>> centerClassMap = new HashMap<String, Map<String, String>>();

		String classCd = "";
		Map<String, String> bClassDtlMap = new HashMap<String, String>();

		for(int i = 0; i < bClassList.size(); i ++) {

			BClassDtl bClassDtl = bClassList.get(i);

			if(!classCd.equals(bClassDtl.getBClass().getClassCd())) {

				if(!bClassDtlMap.isEmpty()) {
					centerClassMap.put(classCd, bClassDtlMap);
					bClassDtlMap = new HashMap<String, String>();
				}

				classCd = bClassDtl.getBClass().getClassCd();
			}

			bClassDtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());

			if(i == bClassList.size() - 1){
				centerClassMap.put(classCd, bClassDtlMap);
			}

		}

		return centerClassMap;

	}

	/**
	 * <h2>区分値CDで区分値明細の情報を取得</h2>
	 *
	 * @param bClassMap 区分値マスタ情報のマップ
	 * @param classCd 区分値CD
	 * @param classDtlCd 区分値明細CD
	 * @return bClassDtl 区分値明細の情報
	 */
	private BClassDtl getBClassDtl(Map<String, Map<String, String>> bClassMap, String classCd, String classDtlCd) {

		BClassDtl bClassDtl = new BClassDtl();
		VDict vDict = new VDict();

		if (bClassMap != null && bClassMap.containsKey(classCd)) {
			if (bClassMap.get(classCd).containsKey(classDtlCd)) {
				vDict.setDictNm(bClassMap.get(classCd).get(classDtlCd));
			}
		}

		bClassDtl.setVDict(vDict);

		return bClassDtl;
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	}
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End
}
