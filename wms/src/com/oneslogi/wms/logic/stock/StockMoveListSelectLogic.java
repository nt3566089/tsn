package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstHCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstRCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 在庫移動一覧データ取得ロジッククラス
 */
public class StockMoveListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	//[ON推-品向-1081]修正対応 2016.4.12 chou Add Start
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
	//[Ver3.0] unit of measure対応 2017.11.28 REN Del
	//[Ver3.0] unit of measure対応 2017.11.28 REN Start
	@Inject
	private MProductBhv mProductBhv;
	//[Ver3.0] unit of measure対応 2017.11.28 REN END
	//[Ver3.0] unit of measure対応 2017.11.28 REN Del
	//[ON推-品向-1081]修正対応 2016.4.12 chou Add End
	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana Start
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana End

	/**
	 * <h2>在庫移動指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫移動指示ヘッダから在庫移動一覧データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * 取得したデータに倉庫CD、倉庫名称、指示総数、商品ID、商品CD、商品名称、指示ケース数、指示ピース数、発行状況名称を設定し、
	 * 引数の倉庫CDと商品CDに等しいデータのみを抽出する。
	 * </pre>
	 * @param tMoveInstH 在庫移動指示ヘッダ：センタID・荷主ID・指示日(From)・指示日(To)・WMS在庫移動伝票No.・処理区分ID・
	 *                                       在庫移動指示ステータス・未完了のみ表示・商品CD・倉庫ID・発行状況・倉庫CD
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TMoveInstH> 在庫移動指示ヘッダリスト
	 */
	public List<TMoveInstH> select(TMoveInstH tMoveInstH, PagingData paging, ErrorStatus errSts){
		// ===== 在庫移動一覧データ取得処理 ====
		TMoveInstHCB cb = tMoveInstHBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_MClient();
		cb.setupSelect_MCenter();
		cb.setupSelect_MProcessType();
		cb.setupSelect_MProcessType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		cb.setupSelect_BClassDtlByMoveInstStatus();
		cb.setupSelect_BClassDtlByMoveInstStatus().withVDict(getCultureId());

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End

		//[ON推-品向-1081]修正対応 2016.4.12 chou Mod Start

		cb.setupSelect_TMoveInstRAsOne();

		// 指示総数(入庫)
		cb.specify().derivedTMoveInstBList().sum(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().columnInstNum();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_instTotalNum);

		//指示総数(出庫)
		cb.specify().derivedTMoveInstBList().sum(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().columnInstNum();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_outInstTotalNum);

		// 出庫ロケーション名称
		cb.specify().derivedTMoveInstBList().min(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMLocation().columnLocationNm();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_pickingLocationNm);

		// 入庫ロケーション名称
		cb.specify().derivedTMoveInstBList().min(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMLocation().columnLocationNm();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_storeLocationNm);

		// 商品ID(入庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {

				arg0.specify().columnProductId();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_productId);

		// 商品CD(入庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().columnProductCd();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_productCd);

		// 商品名称(入庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMProduct().columnProductNm();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_productNm);

		// 商品ID(出庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().columnProductId();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_outProductId);

		// 商品CD(出庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().columnProductCd();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_outProductCd);

		// 商品名称(出庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMProduct().columnProductNm();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_outProductNm);


		//移動元入庫ラベルNo.
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().columnStoreLabelNo();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_moveSourceStoreLabelNo);

		// 倉庫CD(入庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMWarehouse().columnWarehouseCd();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_warehouseCd);

		// 倉庫名称(入庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMWarehouse().columnWarehouseNm();
				arg0.query().setInoutType_Equal_$0();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_warehouseNm);

		// 倉庫CD(出庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMWarehouse().columnWarehouseCd();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_outWarehouseCd);

		// 倉庫名称(出庫)
		cb.specify().derivedTMoveInstBList().max(new SubQuery<TMoveInstBCB>() {
			@Override
			public void query(TMoveInstBCB arg0) {
				arg0.specify().specifyMWarehouse().columnWarehouseNm();
				arg0.query().setInoutType_Equal_$1();
				setDelFlg(arg0);
			}
		}, TMoveInstH.ALIAS_outWarehouseNm);

		//[ON推-品向-1081]修正対応 2016.4.12 chou Mod End

		// ===== 検索条件 =====
		// センタID
		cb.query().queryMCenter().setCenterId_Equal(tMoveInstH.getCenterId());
		// 荷主ID
		cb.query().queryMClient().setClientId_Equal(tMoveInstH.getClientId());
		// 指示日From
		cb.query().setInstDt_GreaterEqual(tMoveInstH.getInstDtFrom());
		// 指示日To
		cb.query().setInstDt_LessEqual(tMoveInstH.getInstDtTo());
		// WMS在庫移動伝票No.
		cb.query().setMoveSlipNo_LikeSearch(tMoveInstH.getMoveSlipNo(), new LikeSearchOption().likePrefix());
		// 処理区分
		cb.query().queryMProcessType().setProcessTypeId_Equal(tMoveInstH.getProcessTypeId());
		// 在庫移動指示ステータス
		cb.query().setMoveInstStatus_Equal(tMoveInstH.getMoveInstStatus());

		// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		// 未完了のみ表示
		CDef.NotCompletedFlg notCompleteFlg = CDef.NotCompletedFlg.codeOf(tMoveInstH.getNotCompletedFlg());
		if (notCompleteFlg != null && notCompleteFlg == CDef.NotCompletedFlg.$1) {

			// 完了、取消 以外
			List<CDef.MoveInstStatus> notInStatusList = new ArrayList<CDef.MoveInstStatus>();
			notInStatusList.add(CDef.MoveInstStatus.$02);
			notInStatusList.add(CDef.MoveInstStatus.$99);
			cb.query().setMoveInstStatus_NotInScope_AsMoveInstStatus(notInStatusList);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		}
		// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana End

		//[ON推-品向-1081]修正対応 2016.4.12 chou Add Start

		// 商品CD
		final String productCd = tMoveInstH.getProductCd();
		// 倉庫ID
		final Long warehouesId = tMoveInstH.getWarehouseId();

		if (!CU.isNullOrEmpty(productCd) || warehouesId != null) {
			cb.query().existsTMoveInstBList(new SubQuery<TMoveInstBCB>(){
			    public void query(TMoveInstBCB subCB) {
			    	// 倉庫ID
			    	subCB.query().setWarehouseId_Equal(warehouesId);
			    	// 商品CD
			    	//[ON推-品向-1081]修正対応 2016.4.15 chou Mod Start
			        subCB.query().setProductCd_LikeSearch(productCd, new LikeSearchOption().likePrefix());//前方一致
			        //[ON推-品向-1081]修正対応 2016.4.15 chou Mod End
			        setDelFlg(subCB);
			    }
			});
		}

		//発行状況
		final String printCondition = tMoveInstH.getPrintCondition();
		if (!CU.isNullOrEmpty(printCondition) && !printCondition.equals("2")) {//発行状況が2:全件以外の場合
			cb.query().existsTMoveInstRAsOne(new SubQuery<TMoveInstRCB>(){
			    public void query(TMoveInstRCB subCB) {
			    	// 指示書出力フラグ
			        subCB.query().setInstOutFlg_Equal(printCondition);
			        setDelFlg(subCB);
			    }
			});
		}

		//[ON推-品向-1081]修正対応 2016.4.12 chou Add End

		// ===== ソート順 =====
		// 指示日
		cb.query().addOrderBy_InstDt_Asc();
		// WMS在庫移動伝票No.
		cb.query().addOrderBy_MoveSlipNo_Asc();
		// 処理区分CD
		cb.query().queryMProcessType().addOrderBy_ProcessTypeCd_Asc();

		// ===== 検索実行 =====
		List<TMoveInstH> list = selectPage(tMoveInstHBhv,cb,paging);

		//[ON推-品向-1081]修正対応 2016.4.12 chou Mod Start

		// [#1978] 在庫移動一覧画面検索条件に倉庫または商品CDを設定した場合、ページング不正の為不要ソースを削除 2017.7.27 nayzaw

		List<String> classCdList = new ArrayList<String>();
		classCdList.add("LIST_OUT_FLG");//リスト発行フラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
		// 区分値マスタより取得
		Map<String, Map<String, String>> bClassMap = this.getBClassInfo(classCdList);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
		// === ケース荷姿IDの取得 ===
		MClientCenter mc = new MClientCenter();
		mc.setClientId(tMoveInstH.getClientId());
		mc.setCenterId(tMoveInstH.getCenterId());

		// [Ver3.0] unit of measure対応 2017.11.28 REN Del
		//倉庫CD、倉庫名称、指示総数、商品ID、商品CD、商品名称、指示ケース数、指示ピース数、発行状況名称の設定
		for(TMoveInstH head: list){

			// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana Start
			if (head.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$31.code()) || head.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$23.code())) {
				//セット解除指示、在庫調整(-)のときは出庫
				// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana End

				//倉庫情報（出庫）に設定する
				head.setWarehouseCd(head.getOutWarehouseCd());
				head.setWarehouseNm(head.getOutWarehouseNm());
				//指示総数(出庫)に設定する
				head.setInstTotalNum(head.getOutInstTotalNum());
				//商品情報（出庫）に設定する
				head.setProductId(head.getOutProductId());
				head.setProductCd(head.getOutProductCd());
				head.setProductNm(head.getOutProductNm());
			}

			if (head.getTMoveInstRAsOne() != null) {
				MCenterClassDtl mccd = this.getMCenterClassDtl(bClassMap, "LIST_OUT_FLG", head.getTMoveInstRAsOne().getInstOutFlg());
				//発行状況名称
				head.setPrintCondition(mccd.getVDict().getDictNm());
			}
			// [Ver3.0] unit of measure対応 2017.11.28 REN Del

			// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start

			BigDecimal totalNum = CU.nullToZero(head.getInstTotalNum());
			//[ON推]指示総数がNull場合に、0を設定 2016.4.21 chou Add Start
			// 指示総数
			head.setInstTotalNum(totalNum);
			//[ON推]指示総数がNull場合に、0を設定 2016.4.21 chou Add End

			// [Ver3.0] unit of measure対応 2017.11.28 REN Del

			// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End

			// [#1978] 在庫移動一覧画面検索条件に倉庫または商品CDを設定した場合、ページング不正の為不要ソースを削除 2017.7.27 nayzaw

			// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana Start
			// 入庫ロケーション名称
			String recordStoreLocationNm = getMoveRecordStoreLocationNm(head.getMoveInstHId());
			if (!CU.isNullOrEmpty(recordStoreLocationNm)) {
				// 入庫実績ロケーション有

				head.setStoreLocationNm(recordStoreLocationNm);
			}
			// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana End
		}

		// [#1978] 在庫移動一覧画面検索条件に倉庫または商品CDを設定した場合、ページング不正の為不要ソースを削除 2017.7.27 nayzaw

		// ===== ０件チェック =====
		if (list.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		//[Ver3.0] unit of measure対応 2017.11.28 REN Start
		// 商品ID
		List<Long> productIdList = new ArrayList<Long>();
		// 商品IDリストの設定
		for (TMoveInstH head : list) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			if (head.getProductId() != null) {
				productIdList.add(head.getProductId());
			}
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		MProductCB productCb = mProductBhv.newMyConditionBean();
		productCb.setupSelect_MShapeGrp();

		productCb.query().setProductId_InScope(productIdList);
		// 指示日
		productCb.query().addOrderBy_ProductId_Asc();

		// ===== 検索実行 =====
		List<MProduct> mProductList = mProductBhv.selectList(productCb);

		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB subCB) {
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
				}
		});

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		Map<Long, MProduct> mProductMap = new HashMap<>();

		for (MProduct head : mProductList) {
			mProductMap.put(head.getProductId(), head);
		}

		for (TMoveInstH head : list){

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			MProduct mProduct = new MProduct() ;
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			if (head.getProductId() == null) {
				mProduct = null;
			} else {
				mProduct = mProductMap.get(head.getProductId()).clone();
			}
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProduct);
			/**商品単位*/
			head.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, mProduct));
			/**入数内訳*/
			head.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProduct));
			/**指示内訳*/
			head.setInstBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, head.getInstTotalNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, mProduct, WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		}
		//[Ver3.0] unit of measure対応 2017.11.28 REN END
		return list;
		//[ON推-品向-1081]修正対応 2016.4.12 chou Mod End
	}

	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana Start
	/**
	 * 在庫移動実績から入庫ロケーション名称を取得
	 * @param moveInstHId 在庫移動指示ヘッダID
	 * @return 入庫ロケーション名称
	 */
	private String getMoveRecordStoreLocationNm(long moveInstHId) {
		TMoveRecordBCB cb = tMoveRecordBBhv.newMyConditionBean();
		cb.setupSelect_MLocation();
		cb.specify().specifyMLocation().columnLocationNm();

		cb.query().setMoveInstHId_Equal(moveInstHId);
		cb.query().queryTMoveInstB().setInoutType_Equal_$0();
		// [Ver3.1][#5880] 入庫ロケーションをロケーション名称の昇順で取得する 2019.01.11 matsumoto Start
		cb.query().queryMLocation().addOrderBy_LocationNm_Asc();
		// [Ver3.1][#5880] 入庫ロケーションをロケーション名称の昇順で取得する 2019.01.11 matsumoto End
		cb.fetchFirst(1);

		TMoveRecordB entity = tMoveRecordBBhv.selectEntity(cb);

		if (entity == null) {
			return null;
		}

		return entity.getMLocation().getLocationNm();
	}

	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana End

	//[ON推-品向-1081] 修正対応 2016.4.12 chou Add Start
	/**
	 * <h2>区分値マスタ情報（コード・名称）を取得</h2>
	 *
	 * @param classCdList 区分値CDのリスト
	 * @return Map<String, Map<String, String>> 区分値マスタ情報のマップ
	 */
	private Map<String, Map<String, String>> getBClassInfo(List<String> classCdList) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
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

		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		String classCd = "";
		Map<String, String> bClassDtlMap = new HashMap<String, String>();

		for(int i = 0; i < bClassList.size(); i ++) {

			BClassDtl bClassDtl = bClassList.get(i);

			if(!classCd.equals(bClassDtl.getBClass().getClassCd())) {

				if(!bClassDtlMap.isEmpty()) {
					bClassMap.put(classCd, bClassDtlMap);
					bClassDtlMap = new HashMap<String, String>();
				}

				classCd = bClassDtl.getBClass().getClassCd();
			}

			bClassDtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());

			if(i == bClassList.size() - 1){
				bClassMap.put(classCd, bClassDtlMap);
			}
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
		}

		return bClassMap;

	}

	/**
	 * <h2>区分値CDでセンタ区分値明細の情報を取得</h2>
	 *
	 * @param centerClassMap センタ区分値マスタ情報のマップ
	 * @param classCd 区分値CD
	 * @param classDtlCd 区分値明細CD
	 * @return MCenterClassDtl センタ区分値明細の情報
	 */
	private MCenterClassDtl getMCenterClassDtl(Map<String, Map<String, String>> centerClassMap, String classCd, String classDtlCd) {

		MCenterClassDtl mCenterClassDtl = new MCenterClassDtl();
		VDict vDict = new VDict();

		if (centerClassMap != null && centerClassMap.containsKey(classCd)) {
			if (centerClassMap.get(classCd).containsKey(classDtlCd)) {
				vDict.setDictNm(centerClassMap.get(classCd).get(classDtlCd));
			}
		}

		mCenterClassDtl.setVDict(vDict);

		return mCenterClassDtl;

	}

	//[ON推-品向-1081] 修正対応 2016.4.12 chou Add End
}