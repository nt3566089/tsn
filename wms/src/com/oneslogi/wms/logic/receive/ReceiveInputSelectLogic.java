package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTReceivePlanB;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTStoreRecordB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlReceiveDataListPmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveDataList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 入荷実績入力データ取得ロジッククラス
 */
public class ReceiveInputSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;

	// [エンハンス PH2.0] 入数取得(不要な変数mProductShapeBhv削除) 2015.11.23 sja

	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana Start
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana End

	@Inject
	private CenterClassLogic centerClassLogic;

	/**
	 * <h2>入荷実績入力データを取得する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定テーブルからデータを検索し、
	 * 入荷実績データがある場合、入荷実績のデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	public List<TStoreRecordB> select(TReceivePlanH header, ErrorStatus errSts) {

		// ===== 入荷予定入力データ取得 =====
		List<TReceivePlanB> PlanBList = new ArrayList<TReceivePlanB>();
		TReceivePlanBCB planBcb = tReceivePlanBBhv.newMyConditionBean();
		// [ON推-品向-795] URL直接入力で登録まで出来てしまう問題を修正 2015.04.27 kawana Start
		planBcb.checkInvalidQuery();
		// [ON推-品向-795] URL直接入力で登録まで出来てしまう問題を修正 2015.04.27 kawana End
		planBcb.setupSelect_TReceivePlanH();
		planBcb.setupSelect_MProduct();
		// [Ver3.0] unit of measure対応 2017.11.22 潘 Del
		planBcb.setupSelect_TReceivePlanH().withMCustomerByPlanSupplierId();
		planBcb.setupSelect_TReceivePlanH().withMCustomerByPlanDepositId();
		planBcb.setupSelect_MLocation();
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi Start
		planBcb.setupSelect_TReceivePlanH().withMStockType();
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi End
		planBcb.query().queryTReceivePlanH().setReceivePlanHId_Equal(header.getReceivePlanHId());
		planBcb.query().addOrderBy_LineNo_Asc();// 入荷予定ボディ.行No
		planBcb.addOrderBy_PK_Asc();// 入荷予定ボディ.入荷予定ボディID

		// 検索実行
		PlanBList = tReceivePlanBBhv.selectList(planBcb);

		if (PlanBList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [#1750] 検索後の処理を共通化 2017.05.08 kawana Start

		// ===== 検索結果から返信用にデータを作成 =====
		List<TStoreRecordB> result = createResultList(PlanBList);

		// [#1750] 検索後の処理を共通化 2017.05.08 kawana End

		// [Ver3.0] unit of measure対応 2017.11.22 潘 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		tStoreRecordBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTStoreRecordB>() {
			@Override
			public void handle(LoaderOfTStoreRecordB loader) {
				loader.pulloutTReceivePlanB().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		for (TStoreRecordB recordB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, recordB.getTReceivePlanB().getMProduct());
			// 入数内訳
			recordB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, recordB.getTReceivePlanB().getMProduct()));
			// 商品最小荷姿単位名称
			recordB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, recordB.getTReceivePlanB().getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.22 潘 End
		return result;
	}

	// [#1750] 検索後の処理を共通化 2017.05.08 kawana Start

	/**
	 * 検索結果から返信用にデータを作成
	 */
	private List<TStoreRecordB> createResultList(List<TReceivePlanB> PlanBList) {

		// [#1750] 検索後の処理を共通化 2017.05.08 kawana Start

		Map<String, String> receiveStatusMap = centerClassLogic.getClassMapByCd("RECEIVE_STATUS");

		// [#1750] 検索後の処理を共通化 2017.05.08 kawana End

		// 入荷予定ボディ => 入庫実績ボディ
		List<TStoreRecordB> planResult = new ArrayList<TStoreRecordB>();

		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tReceivePlanBBhv.load(PlanBList, new ReferrerLoaderHandler<LoaderOfTReceivePlanB>(){
			public void handle(LoaderOfTReceivePlanB loader){
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>(){
					public void setup(MProductShapeCB subCB){
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

		for (TReceivePlanB tReceivePlanB : PlanBList) {

			// [#1750] 検索後の処理を共通化 2017.05.08 kawana Start

			// === 区分値マスタの名称の設定 ===
			//入荷ステータス
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			tReceivePlanB.setBClassDtlByReceiveStatus(getBClassDtl(receiveStatusMap, tReceivePlanB.getReceiveStatus()));
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

			// [#1750] 検索後の処理を共通化 2017.05.08 kawana End

			TStoreRecordH tStoreRecordH = new TStoreRecordH();
			TStoreRecordB tStoreRecordB = new TStoreRecordB();

			// 入荷予定ヘッダデータの取得
			tStoreRecordH.setTReceivePlanH(tReceivePlanB.getTReceivePlanH());
			// センタ
			tStoreRecordH.setCenterId(tReceivePlanB.getTReceivePlanH().getCenterId());
			//荷主
			tStoreRecordH.setClientId(tReceivePlanB.getTReceivePlanH().getClientId());

			//処理区分
			tStoreRecordH.setProcessTypeId(tReceivePlanB.getTReceivePlanH().getProcessTypeId());

			//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi Start
			// 在庫区分
			tStoreRecordH.setStockTypeId(tReceivePlanB.getTReceivePlanH().getStockTypeId());
			//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi end

			// 入荷予定ヘッダIDの取得
			tStoreRecordH.setReceivePlanHId(tReceivePlanB.getTReceivePlanH().getReceivePlanHId());

			tStoreRecordB.setTStoreRecordH(tStoreRecordH);

			// 入荷予定ボディデータの取得
			tStoreRecordB.setTReceivePlanB(tReceivePlanB);

			// ロケーションの取得
			tStoreRecordB.setMLocation(tReceivePlanB.getMLocation());

			// [Ver3.0] unit of measure対応 2017.12.1 潘 Del

			// 期限日
			tStoreRecordB.setLimitDt(tReceivePlanB.getPlanLimitDt());

			// ロット
			tStoreRecordB.setLot(tReceivePlanB.getPlanLot());

			// 入荷予定ボディID
			tStoreRecordB.setReceivePlanBId(tReceivePlanB.getReceivePlanBId());

			// 顧客発注No.
			tStoreRecordB.setClientOrderNo(tReceivePlanB.getPlanClientOrderNo());

			// 入力区分
			tStoreRecordB.setInputType(tReceivePlanB.getTReceivePlanH().getInputType());

			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、予定入庫ラベルNoを設定 2014.11.21 fengc Start
			//入庫ラベルNO
			tStoreRecordB.setStoreLabelNo(tReceivePlanB.getPlanStoreLabelNo());
			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、予定入庫ラベルNoを設定 2014.11.21 fengc End

			planResult.add(tStoreRecordB);
		}

		// 入荷予定ボディ件数のループ
		List<TStoreRecordB> result = new ArrayList<TStoreRecordB>();
		List<TStoreRecordB> subResult = new ArrayList<TStoreRecordB>();
		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
		List<TStoreRecordB> checkStoreBList = new ArrayList<TStoreRecordB>();
		List<TStoreRecordB> setStoreBList = new ArrayList<TStoreRecordB>();
		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
		for (TStoreRecordB tStoreRecordB : planResult) {
			subResult = new ArrayList<TStoreRecordB>();

			//入庫実績ボディデータ取得
			List<TStoreRecordB> recordResult = new ArrayList<TStoreRecordB>();

			TStoreRecordBCB recordBcb = tStoreRecordBBhv.newMyConditionBean();
			recordBcb.query().setReceivePlanBId_Equal(tStoreRecordB.getReceivePlanBId());
			// 検索実行
			recordResult = tStoreRecordBBhv.selectList(recordBcb);

			if (recordResult.size() > 0) {
				// ===== 入荷実績入力データ取得 =====
				// データ取得テーブル
				TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();

				cb.setupSelect_TStoreRecordH();
				cb.setupSelect_MLocation();
				cb.setupSelect_TReceivePlanB();
				cb.setupSelect_TReceivePlanB().withMProduct();
				cb.setupSelect_TReceivePlanB().withTReceivePlanH();
				cb.setupSelect_TReceivePlanB().withTReceivePlanH().withMCustomerByPlanSupplierId();
				cb.setupSelect_TReceivePlanB().withTReceivePlanH().withMCustomerByPlanDepositId();
				cb.setupSelect_TStoreRecordH().withMCustomerBySupplierId();
				cb.setupSelect_TStoreRecordH().withMCustomerByDepositId();
				//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi Start
				cb.setupSelect_TStoreRecordH().withMStockType();
				//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi End

				// ===== 検索条件の設定 =====
				cb.query().setReceivePlanBId_Equal(tStoreRecordB.getReceivePlanBId());
				//				cb.query().queryTReceivePlanB().queryTReceivePlanH().setReceivePlanHId_Equal(header.getReceivePlanHId());

				// ===== ソート条件 =====
				cb.query().queryTReceivePlanB().addOrderBy_LineNo_Asc();// 入荷予定ボディ.行No
				cb.addOrderBy_PK_Asc();// 入庫実績ボディ.入庫実績ボディID

				// 検索実行
				subResult = tStoreRecordBBhv.selectList(cb);

				tStoreRecordBBhv.loadTStockInoutList(subResult, new ConditionBeanSetupper<TStockInoutCB>() {
					public void setup(TStockInoutCB tStockInoutCB) {
						tStockInoutCB.setupSelect_TStock();
						tStockInoutCB.setupSelect_TStock().withTStoreNo();
					}
				});

				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				tStoreRecordBBhv.load(subResult, new ReferrerLoaderHandler<LoaderOfTStoreRecordB>() {
					@Override
					public void handle(LoaderOfTStoreRecordB loader) {
						loader.pulloutTReceivePlanB().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

				// ===== リターンの入庫実績ボディリスト編集 =====

				// リターンの入庫実績ボディリストのデータ件数分繰返
				for (TStoreRecordB record : subResult) {

					// [#1750] 検索後の処理を共通化 2017.05.08 kawana Start

					// === 区分値マスタの名称の設定 ===
					//入荷ステータス
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
					record.getTReceivePlanB().setBClassDtlByReceiveStatus(getBClassDtl(receiveStatusMap, record.getTReceivePlanB().getReceiveStatus()));
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
					// [#1750] 検索後の処理を共通化 2017.05.08 kawana End

					// [エンハンス PH2.0] 入数取得 2015.11.23 sja Start

					record.setUnitNum(CU.nullToZero(tStoreRecordB.getUnitNum()));
					// [エンハンス PH2.0] 入数取得 2015.11.23 sja End

					// 入庫Noの入庫ラベルNo設定
					List<TStockInout> tStockInoutList = new ArrayList<TStockInout>();
					if (record.getStoreRecordBId() != null) {
						TStockInoutCB mCb = tStockInoutBhv.newMyConditionBean();
						mCb.setupSelect_TStock();
						mCb.setupSelect_TStock().withTStoreNo();
						mCb.query().setStoreRecordBId_Equal(record.getStoreRecordBId());
						tStockInoutList = tStockInoutBhv.selectList(mCb);
					}
					if (tStockInoutList.size() != 0) {
						record.setStoreLabelNo(tStockInoutList.get(0).getTStock().getTStoreNo().getStoreLabelNo());
					}

					//[Ver3.0][#3113] 複数荷姿対応に伴い不要となった処理を削除 2017.12.06 miyabe

					// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
					if (!CU.isNullOrEmpty(record.getLimitDt())) {

						// 期限日が設定されている場合は、入荷限界期限日のチェックをする
						checkStoreBList.add(record);
					}
					// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
				}

				result.addAll(subResult);
			}

			if (recordResult.size() == 0) {
				result.add(tStoreRecordB);
				// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
				setStoreBList.add(tStoreRecordB);
				// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
			}

		}

		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start

		// ===== 入荷限界期限日チェック =====

		if (0 < setStoreBList.size()) {
			stockUpdateCheckLogic.setReceiveLimitDate(PlanBList.get(0).getTReceivePlanH(), PlanBList, result.get(0).chaseTStoreRecordH(), setStoreBList);
		}
		if (0 < checkStoreBList.size()) {
			stockUpdateCheckLogic.receiveLimitDateCheck(PlanBList.get(0).getTReceivePlanH(), PlanBList, result.get(0).chaseTStoreRecordH(), checkStoreBList);
		}

		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

		return result;
	}

	// [#1750] 検索後の処理を共通化 2017.05.08 kawana End
	// [#1942] ページング不正を修正 2017.06.23 kawana Start

	//[SLSA] スマートデバイス用に、検索条件を増やしたぺジネーション付き検索を実装 2016.12.16 Dario Add Start
	/**
	 * <h2>入荷実績入力データを取得する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定テーブルからデータを検索し、
	 * 入荷実績データがある場合、入荷実績のデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	public List<TStoreRecordB> selectPage(TReceivePlanH header, TStoreRecordB recordBody, TReceivePlanB planBody, PagingData paging, ErrorStatus errSts) {

		final long centerId = header.getCenterId();
		final long clientId = header.getClientId();

		// ===== 入荷データ取得 =====

		// ※※ SDの明細一覧はページングがあるため、検索後のデータ増減NG。
		// ※※ 共通処理の検索処理が使用できないので外出SQLを使用する。
		// ※※ 今後、共通化を行う場合はPC、HT側の処理を外出SQLに統一すること

		// 外出しSQLの定義
		String sqlPath = TReceivePlanBBhv.PATH_selectSqlReceiveDataList;

		// ===== 検索条件の設定 =====

		SqlReceiveDataListPmb pmb = new SqlReceiveDataListPmb();
		pmb.setCenterId(centerId);
		pmb.setCultureId(getCultureId());
		pmb.setClientId(clientId);
		pmb.setReceivePlanDtFrom(header.getReceivePlanDtFrom());
		pmb.setReceivePlanDtTo(header.getReceivePlanDtTo());
		pmb.setReceiveStatus(header.getReceiveStatus());
		pmb.setSupplierCd_PrefixSearch(header.getPlanSupplierCd());
		pmb.setReceiveSlipNo_PrefixSearch(header.getReceiveSlipNo());
		pmb.setPlanClientReceiveNo_PrefixSearch(header.getPlanClientReceiveNo());
		pmb.setPlanClientOrderNo_PrefixSearch(planBody.getPlanClientOrderNo());
		pmb.setProductCd_PrefixSearch(planBody.getProductCd());

		// ===== 検索実行 =====

		// 検索実行
		List<SqlReceiveDataList> selectList = selectPage(tReceivePlanBBhv, sqlPath, pmb, SqlReceiveDataList.class, paging);

		// ===== ０件チェック =====

		if (selectList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== データの詰替と入荷限界期限日の設定 =====

		List<TStoreRecordB> resultList = new ArrayList<TStoreRecordB>();

		for (SqlReceiveDataList data : selectList) {

			// 出力項目を取得
			Long receivePlanHId = data.getReceivePlanHId();
			Long receivePlanBId = data.getReceivePlanBId();
			String receiveStatus = data.getReceiveStatus();
			Long productId = data.getProductId();
			String productCd = data.getProductCd();
			BigDecimal planNum = data.getPlanNum();
			String planLimitDt = data.getPlanLimitDt();

			Long storeRecordHId = data.getStoreRecordHId();
			Long storeRecordBId = data.getStoreRecordBId();
			String storeDt = data.getStoreDt();
			String storeLimitDt = data.getLimitDt();
			String productNm = data.getProductNm();
			String productAbbr = data.getProductAbbr();
			String receiveStatusNm = data.getReceiveStatusNm();
			Long lineNo = data.getLineNo();

			TStoreRecordB storeB = new TStoreRecordB();
			TStoreRecordH storeH = new TStoreRecordH();

			TReceivePlanB planB = new TReceivePlanB();
			TReceivePlanH planH = new TReceivePlanH();;

			MProduct product = new MProduct();

			storeB.setStoreRecordBId(storeRecordBId);
			storeB.setStoreRecordHId(storeRecordHId);
			storeB.setReceivePlanBId(receivePlanBId);
			String limitDt = CU.coalesce(storeLimitDt, planLimitDt);
			storeB.setLimitDt(limitDt);
			storeB.setStoreDt(storeDt);
			storeB.setTReceivePlanB(planB);
			storeB.setTStoreRecordH(storeH);

			planB.setReceivePlanBId(receivePlanBId);
			planB.setReceivePlanHId(receivePlanHId);
			planB.setProductId(productId);
			planB.setProductCd(productCd);
			planB.setPlanNum(planNum);
			planB.setPlanLimitDt(planLimitDt);
			planB.setReceiveStatus(receiveStatus);
			planB.setLineNo(lineNo);
			planB.setMProduct(product);
			planB.setTReceivePlanH(planH);

			storeH.setStoreRecordHId(storeRecordHId);
			storeH.setReceivePlanHId(receivePlanHId);
			storeH.setCenterId(centerId);
			storeH.setClientId(clientId);
			storeH.setTReceivePlanH(planH);

			planH.setReceivePlanHId(receivePlanHId);
			planH.setCenterId(centerId);
			planH.setClientId(clientId);

			product.setProductId(productId);
			product.setProductNm(productNm);
			product.setProductAbbr(productAbbr);

			BClassDtl receiveStatusClassDtl = new BClassDtl();
			VDict receiveStatusDict = new VDict();
			receiveStatusDict.setDictNm(receiveStatusNm);
			receiveStatusClassDtl.setVDict(receiveStatusDict);
			planB.setBClassDtlByReceiveStatus(receiveStatusClassDtl);


			List<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
			planBList.add(planB);

			List<TStoreRecordB> storeBList = new ArrayList<TStoreRecordB>();
			storeBList.add(storeB);

			if (CU.isNullOrEmpty(limitDt)) {
				stockUpdateCheckLogic.setReceiveLimitDate(planH, planBList, storeH, storeBList);
			} else {
				stockUpdateCheckLogic.receiveLimitDateCheck(planH, planBList, storeH, storeBList);
			}

			resultList.add(storeB);
		}

		return resultList;
	}

	// [#1942] ページング不正を修正 2017.06.23 kawana End

	/**
	 * <h2>区分値区分値明細の情報を取得</h2>
	 *
	 * @param bClassMap センタ区分値マスタ情報のマップ
	 * @param classDtlCd 区分値明細CD
	 * @return BClassDtl センタ区分値明細の情報
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	private BClassDtl getBClassDtl(Map<String, String> bClassMap, String classDtlCd) {

		BClassDtl bClassDtl = new BClassDtl();
		VDict vDict = new VDict();

		if (bClassMap != null) {
			if (bClassMap.containsKey(classDtlCd)) {
				vDict.setDictNm(bClassMap.get(classDtlCd));
			}
		}

		bClassDtl.setVDict(vDict);

		return bClassDtl;

	}

	// [#1750] SD明細を表示前にデータを再検索して設定する 2017.05.08 kawana Start

	/**
	 * <h2>入荷実績入力データ(明細)を取得する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定テーブルからデータを検索し、
	 * 入荷実績データがある場合、入荷実績のデータを取得する。
	 * 次の場合はエラーとする。
	 * ・入荷予定が0件の場合
	 * ・入庫実績ボディIDが指定されているのに該当の入庫実績ボディがない場合
	 * ・入庫実績ボディIDが指定されていないのに入庫実績ボディが存在する場合
	 *
	 * </pre>
	 * @param header 入荷予定ヘッダ : センタID (必須)
	 * @param recordBody 入庫実績ボディ : 入庫実績ボディID
	 * @param planBody 入荷予定ボディ : 入荷予定ボディID (必須)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 指定されたIDで検索した入庫実績ボディ
	 */
	public TStoreRecordB selectDetail(TReceivePlanH header, TStoreRecordB recordBody, TReceivePlanB planBody, ErrorStatus errSts) {

		// ===== 入荷予定入力データ取得 =====

		TReceivePlanBCB planBcb = tReceivePlanBBhv.newMyConditionBean();

		planBcb.setupSelect_TReceivePlanH();
		planBcb.setupSelect_MProduct();
		// [Ver3.0] unit of measure対応 2017.11.22 潘 Del
		planBcb.setupSelect_TReceivePlanH().withMClient();
		planBcb.setupSelect_TReceivePlanH().withMCenter();
		planBcb.setupSelect_TReceivePlanH().withMCustomerByPlanSupplierId();
		planBcb.setupSelect_TReceivePlanH().withMCustomerByPlanDepositId();
		planBcb.setupSelect_TReceivePlanH().withTReceivePlanRAsOne();
		planBcb.setupSelect_TReceivePlanH().withMProcessType();
		planBcb.setupSelect_TReceivePlanH().withMProcessType().withVDict(getCultureId());
		planBcb.setupSelect_MLocation();
		planBcb.setupSelect_TReceivePlanH().withMStockType();
		planBcb.setupSelect_TReceivePlanH().withMStockType().withVDict(getCultureId());
		// [Ver3.0] unit of measure対応 2017.11.22 潘 Del

		planBcb.checkInvalidQuery();
		planBcb.query().setReceivePlanBId_Equal(planBody.getReceivePlanBId());

		// 検索実行
		List<TReceivePlanB> PlanBList = tReceivePlanBBhv.selectList(planBcb);
		if (PlanBList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		//[Ver3.0][#3113]複数荷姿対応 2017.12.05 miyabe Start
		//商品荷姿取得
		tReceivePlanBBhv.load(PlanBList, new ReferrerLoaderHandler<LoaderOfTReceivePlanB>(){
			public void handle(LoaderOfTReceivePlanB loader){
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>(){
					public void setup(MProductShapeCB mProductShapeCB){
						mProductShapeCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						mProductShapeCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						mProductShapeCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						mProductShapeCB.query().setDelFlg_Equal_$0();
						mProductShapeCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});

		// ===== 検索結果から返信用にデータを作成 =====

		List<TStoreRecordB> recordBList = createResultList(PlanBList);

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		for (TStoreRecordB tStoreRecordB : recordBList) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStoreRecordB.getTReceivePlanB().getMProduct());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		for (TStoreRecordB tStoreRecordB : recordBList) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			tStoreRecordB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap
					, tStoreRecordB.getTReceivePlanB().getMProduct()));
			tStoreRecordB.setPlanBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tStoreRecordB.getTReceivePlanB().getPlanNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap
					, tStoreRecordB.getTReceivePlanB().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			tStoreRecordB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tStoreRecordB.getTReceivePlanB().getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		//[Ver3.0][#3113]複数荷姿対応 2017.12.05 miyabe End
		// ===== 該当行を返却 =====

		Long recordBId = recordBody.getStoreRecordBId();
		if (recordBId == null) {
			// 実績登録なし

			if (recordBList.size() != 1) {
				// 誰かが実績登録

				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return null;
			}

			if (recordBList.get(0).getStoreRecordBId() != null) {
				// 誰かが実績登録

				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return null;
			}

			return recordBList.get(0);
		}

		for (TStoreRecordB selectRecordB : recordBList) {

			// [#1795][Ver2.2.0] SD側で検索後に入荷済伝票をPC側で修正、同伝票をSD側で明細選択で致命的エラーへの対応 2017.05.17 honma Mod Start
			if (selectRecordB.getStoreRecordBId() != null) {
				// 実績登録あり

				if (selectRecordB.getStoreRecordBId().longValue() == recordBId.longValue()) {
					// 該当の実績

					return selectRecordB;
				}
			}
			// [#1795][Ver2.2.0] SD側で検索後に入荷済伝票をPC側で修正、同伝票をSD側で明細選択で致命的エラーへの対応 2017.05.17 honma Mod End
		}

		// 誰かが実績変更
		// [#1795][Ver2.2.0] SD側で検索後に入荷済伝票をPC側で修正、同伝票をSD側で明細選択で致命的エラーへの対応 2017.05.17 honma Mod Start
		this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
		// [#1795][Ver2.2.0] SD側で検索後に入荷済伝票をPC側で修正、同伝票をSD側で明細選択で致命的エラーへの対応 2017.05.17 honma Mod End
		return null;
	}

	// [#1750] SD明細を表示前にデータを再検索して設定する 2017.05.08 kawana End

	/**
	 * <h2>入荷予定ヘッダを取得する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定ヘッダからデータを取得する。
	 * </pre>
	 * @param entity 入荷予定ヘッダ：入荷予定ヘッダID
	 * @return TReceivePlanH 入荷予定ヘッダ
	 */
	public TReceivePlanH getPkEntityWithDeletedCheck(TReceivePlanH entity) {
		if (entity.getReceivePlanHId() == null) {
			return null;
		}

		TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
		cb.query().setReceivePlanHId_Equal(entity.getReceivePlanHId());
		cb.lockForUpdate();
		return tReceivePlanHBhv.selectEntityWithDeletedCheck(cb);
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/08 Start
	/**
	 * <h2>商品ラベル発行データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから商品ラベル発行データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * 検索対象が見つかった場合、入数を取得する。
	 * </pre>
	 * @param head 入庫実績ヘッダ：入庫実績ヘッダID
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	public List<TStoreRecordB> selectReportInfo(TStoreRecordH head, ErrorStatus errSts) {

		List<TStoreRecordB> result = null;

		// ===== 商品ラベル発行データ取得 =====
		TStoreRecordBCB tStoreRecordBCB = tStoreRecordBBhv.newMyConditionBean();
		tStoreRecordBCB.setupSelect_TStoreRecordH();
		tStoreRecordBCB.setupSelect_TReceivePlanB();
		tStoreRecordBCB.setupSelect_TStoreRecordH().withMClient();
		tStoreRecordBCB.setupSelect_TStoreRecordH().withMCenter();
		tStoreRecordBCB.setupSelect_TReceivePlanB().withMProduct();

		//入数取得
		// [Ver3.0] unit of measure対応 2017.11.22 潘 Del

		// 検索条件の設定
		tStoreRecordBCB.query().queryTStoreRecordH().setStoreRecordHId_Equal(head.getStoreRecordHId());
		tStoreRecordBCB.query().setStoreNum_GreaterThan(WCC.ZERO);

		//ソート条件
		tStoreRecordBCB.query().queryTReceivePlanB().queryMProduct().addOrderBy_ProductCd_Asc();

		// 検索実行
		result = selectListToReport(tStoreRecordBBhv, tStoreRecordBCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [Ver3.0] unit of measure対応 2017.11.22 潘 Del

		return result;
	}
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/08 End
}
