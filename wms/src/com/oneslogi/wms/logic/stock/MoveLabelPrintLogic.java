package com.oneslogi.wms.logic.stock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTMoveInstB;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 搬送ラベル発行データ取得ロジッククラス
 */
public class MoveLabelPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
	// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外のため削除) 2018.04.03 honma Delete
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End

	@Inject
	private TMoveInstBBhv tMoveInstBBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	@Inject
	private TMoveInstRBhv tMoveInstRBhv;

	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana Start
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana End


	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
	/**
	 * <h2>在庫移動指示のデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫移動指示データを取得する。
	 * </pre>
	 * @param header 在庫移動指示ヘッダ：センタID・荷主ID・指示日・WMS在庫移動伝票No.
	 * @param body 在庫移動指示ボディ：登録ユーザ・発行条件
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TMoveInstB> 在庫移動指示データリスト
	 */
	public List<TMoveInstB> select(TMoveInstH header, TMoveInstB body, ErrorStatus errSts) {
		return this.select(header, body, null, errSts);
	}
	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End

	/**
	 * <h2>在庫移動指示データを取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫移動指示データを取得する(上限500件)。
	 * 取得したデータに下記の設定を行う。
	 * ・入数
	 * ・調整移動区分
	 * ・倉庫
	 * ・預託
	 * ・在庫区分
	 * ・入庫ラベルNo.
	 *
	 * 入出庫区分が"0：入庫"の場合、入庫ロケーションの設定を行う。
	 * 入出庫区分が"1：出庫"の場合、出庫と推奨ロケーションの設定を行う。

	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 在庫移動指示ヘッダ：センタID・荷主ID・指示日・WMS在庫移動伝票No.
	 * @param body 在庫移動指示ボディ：登録ユーザ・発行条件
	 * @param moveSlipNoList WMS在庫移動伝票No.のリスト
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TMoveInstB> 在庫移動指示データリスト
	 */
	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Mod Start
	public List<TMoveInstB> select(final TMoveInstH header, TMoveInstB body, Collection<String> moveSlipNoList, ErrorStatus errSts) {
	//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Mod End

		List<TMoveInstB> tStockList = null;

		// ===== 搬送ラベル発行データ取得  =====
		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();

		tMoveInstBCB.setupSelect_TMoveInstH();

		tMoveInstBCB.setupSelect_TMoveInstH().withTMoveInstRAsOne();

		tMoveInstBCB.setupSelect_TMoveInstH().withMClient();

		tMoveInstBCB.setupSelect_TMoveInstH().withMCenter();

		// [ON推-品向-1006] 検索条件（処理区分=「21:移動」）追加 2015.11.11 ki Start
		tMoveInstBCB.setupSelect_TMoveInstH().withMProcessType();
		// [ON推-品向-1006] 検索条件（処理区分=「21:移動」）追加 2015.11.11 ki End

		// [Ver3.0] unit of measure対応 2017.11.27 REN Del

		tMoveInstBCB.setupSelect_MStockType().withVDict(getCultureId());

		tMoveInstBCB.setupSelect_MWarehouse();

		tMoveInstBCB.setupSelect_MLocation();

		tMoveInstBCB.setupSelect_MLocation().withMZone();

		tMoveInstBCB.setupSelect_MCustomerByDepositId();

		tMoveInstBCB.setupSelect_MProduct();

		// ===== 検索条件 =====

		tMoveInstBCB.query().queryTMoveInstH().setClientId_Equal(header.getClientId());

		tMoveInstBCB.query().queryTMoveInstH().setCenterId_Equal(header.getCenterId());

		// tMoveInstBCB.query().setWarehouseId_Equal(body.getWarehouseId());

		tMoveInstBCB.query().queryTMoveInstH().setInstDt_Equal(header.getInstDt());

		//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Mod Start
		if (moveSlipNoList == null) {
			tMoveInstBCB.query().queryTMoveInstH().setMoveSlipNo_PrefixSearch(header.getMoveSlipNo());
		}else {
			tMoveInstBCB.query().queryTMoveInstH().setMoveSlipNo_InScope(moveSlipNoList);
		}
		//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Mod End

		// tMoveInstBCB.query().queryTStoreNo().setStoreLabelNo_Equal(body.getStoreLabelNo());

		// [ver3.0][#3595] 搬送ラベルに出力された入庫ラベルNoでのみ搬送ラベルを発行できるように修正 2018.02.16 matsumoto Start
		tMoveInstBCB.query().setStoreLabelNo_Equal(body.getStoreLabelNo());
		// [ver3.0][#3595] 搬送ラベルに出力された入庫ラベルNoでのみ搬送ラベルを発行できるように修正 2018.02.16 matsumoto End

		// [ver3.0][#3595] 搬送ラベルに出力された入庫ラベルNoでのみ搬送ラベルを発行できるように修正 2018.02.19 matsumoto Start
		tMoveInstBCB.query().setInoutType_Equal("0");
		// [ver3.0][#3595] 搬送ラベルに出力された入庫ラベルNoでのみ搬送ラベルを発行できるように修正 2018.02.19 matsumoto End

		tMoveInstBCB.query().setAddUser_Equal(body.getAddUser());

		tMoveInstBCB.query().setInstNum_GreaterThan(WCC.ZERO);

		tMoveInstBCB.query().queryTMoveInstH().queryTMoveInstRAsOne().setInstOutFlg_Equal(body.getPrintCondition());

		// [ON推-品向-1006] 検索条件（処理区分=「21:移動」）追加 2015.11.11 ki Start
		tMoveInstBCB.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal("21");
		// [ON推-品向-1006] 検索条件（処理区分=「21:移動」）追加 2015.11.11 ki End

		// [ver3.0][#3595] 搬送ラベルに出力された入庫ラベルNoでのみ搬送ラベルを発行できるように修正 2018.02.16 matsumoto Start
		List<TMoveInstB> tMoveInstBSelectList = tMoveInstBBhv.selectList(tMoveInstBCB);

		// 検索結果0件の場合エラーを返す
		if (tMoveInstBSelectList == null || tMoveInstBSelectList.size() == 0){
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 移動指示ヘッダのIDのリストを取得
		List<Long> tMoveInstHIdList = new ArrayList<>();
		for (TMoveInstB tMoveInstB : tMoveInstBSelectList) {
			tMoveInstHIdList.add(tMoveInstB.getMoveInstHId());
		}

		TMoveInstBCB tMoveInstBCB2 = tMoveInstBBhv.newMyConditionBean();

		// テーブル設定

		tMoveInstBCB2.setupSelect_TMoveInstH();

		tMoveInstBCB2.setupSelect_TMoveInstH().withTMoveInstRAsOne();

		tMoveInstBCB2.setupSelect_TMoveInstH().withMClient();

		tMoveInstBCB2.setupSelect_TMoveInstH().withMCenter();

		tMoveInstBCB2.setupSelect_TMoveInstH().withMProcessType();

		tMoveInstBCB2.setupSelect_MStockType().withVDict(getCultureId());

		tMoveInstBCB2.setupSelect_MWarehouse();

		tMoveInstBCB2.setupSelect_MLocation();

		tMoveInstBCB2.setupSelect_MLocation().withMZone();

		tMoveInstBCB2.setupSelect_MCustomerByDepositId();

		// [#4220][Ver3.0] 搬送ラベル - 表示不正 2018.04.03 honma Add Start
		tMoveInstBCB2.setupSelect_TStoreNo();
		// [#4220][Ver3.0] 搬送ラベル - 表示不正 2018.04.03 honma Add End

		tMoveInstBCB2.setupSelect_MProduct();

		// 検索条件
		tMoveInstBCB2.query().setMoveInstHId_InScope(tMoveInstHIdList);

		// ソート条件
		tMoveInstBCB2.query().queryTMoveInstH().queryMClient().addOrderBy_ClientCd_Asc();

		tMoveInstBCB2.query().queryTMoveInstH().queryMCenter().addOrderBy_CenterCd_Asc();

		tMoveInstBCB2.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();

		tMoveInstBCB2.query().queryTMoveInstH().addOrderBy_InstDt_Asc();

		tMoveInstBCB2.query().queryTMoveInstH().addOrderBy_MoveSlipNo_Asc();

		tMoveInstBCB2.query().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();

		// 搬送ラベル発行データ取得のリスト(上限500件)
		tStockList = selectListToReport(tMoveInstBBhv, tMoveInstBCB2, 500);
		// [ver3.0][#3595] 搬送ラベルに出力された入庫ラベルNoでのみ搬送ラベルを発行できるように修正 2018.02.16 matsumoto End

		// ===== ０件チェック =====
		if (tStockList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
		tMoveInstBBhv.load(tStockList, new ReferrerLoaderHandler<LoaderOfTMoveInstB>() {
			@Override
			public void handle(LoaderOfTMoveInstB pickLocaLoader) {
				pickLocaLoader.pulloutMProduct().loadMLocationList(new ConditionBeanSetupper<MLocationCB>() {
					@Override
					public void setup(MLocationCB pickLocaSubCB) {
						pickLocaSubCB.query().queryMCenter().setCenterId_Equal(header.getCenterId());
						pickLocaSubCB.query().setDelFlg_Equal_$0();
						pickLocaSubCB.query().addOrderBy_AllocOrder_Asc();
						pickLocaSubCB.query().addOrderBy_LocationCd_Asc();
					}
				});
			}
		});
		// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End

		// [Ver3.0] unit of measure対応 2017.11.27 REN Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tMoveInstBBhv.load(tStockList, new ReferrerLoaderHandler<LoaderOfTMoveInstB>() {
			@Override
			public void handle(LoaderOfTMoveInstB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
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

		for (TMoveInstB stock : tStockList) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, stock.getMProduct());
			//入数
			stock.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, stock.getMProduct()));
			//内訳
			stock.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, stock.getInstNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, stock.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			stock.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, stock.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.27 REN End

		List<TMoveInstB> stockList = new ArrayList<TMoveInstB>();
		List<TMoveInstB> tmpStockList = new ArrayList<TMoveInstB>();


		for (TMoveInstB stock : tStockList) {

			// ===== リターンの搬送ラベル発行データ取得のリスト編集 =====

			if (stock.getUnitNum() != null) {
				stock.setUnitNum(stock.getUnitNum());
			} else {
				stock.setUnitNum(0l);
			}

			TMoveInstB tmpStock = stock;
			if ("0".equals(tmpStock.getInoutType())) {
				// (入出庫区分:0入庫)の場合
				// 入庫ロケを設定

				// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana Start
				// 入庫ロケーション名称
				MLocation recordLocation = getMoveRecordLocation(stock.getMoveInstBId());
				if (recordLocation != null) {
					tmpStock.setInTLocationCd(recordLocation.getLocationCd());
					tmpStock.setInTLocationNm(recordLocation.getLocationNm());
				} else {
					tmpStock.setInTLocationCd(tmpStock.getLocationCd());
					if (tmpStock.getMLocation() != null) {
						tmpStock.setInTLocationNm(tmpStock.getMLocation().getLocationNm());
					}
				}
				// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana End

				tmpStockList.add(tmpStock);
			} else if ("1".equals(stock.getInoutType())) {
				// (入出庫区分:1出庫)の場合
				// 出庫ロケを設定
				stock.setOutTLocationCd(tmpStock.getLocationCd());
				if (stock.getMLocation() != null) {
					stock.setOutTLocationNm(tmpStock.getMLocation().getLocationNm());
				}

				// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
				// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象外のため削除) 2018.04.03 honma Delete
				// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End

				stockList.add(stock);
			}

		}

		// ===== ０件チェック =====
		if (stockList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

        Iterator<TMoveInstB> itStock = stockList.iterator();
        while(itStock.hasNext()){
        	TMoveInstB tBody = (TMoveInstB) itStock.next();
            Iterator<TMoveInstB> itTmpStock = tmpStockList.iterator();

    		// 調整移動区分(0:調整)
    		tBody.setClsMove("0");

    		// 倉庫
    		tBody.setMWarehouse(null);

    		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
    		cb.query().setMoveInstHId_Equal(tBody.getMoveInstHId());

    		// 検索実行
    		List<TMoveInstB> clsList = tMoveInstBBhv.selectList(cb);

    		if (1 < clsList.size()) {
        		// 調整移動区分(1:移動)
        		tBody.setClsMove("1");
    		}

            while(itTmpStock.hasNext()){
            	TMoveInstB tmpTBody = (TMoveInstB) itTmpStock.next();
            	if (tBody.getMoveInstHId().equals(tmpTBody.getMoveInstHId())) {
            		tBody.setInTLocationCd(tmpTBody.getInTLocationCd());
            		tBody.setInTLocationNm(tmpTBody.getInTLocationNm());
            		// 預託
            		tBody.setMCustomerByDepositId(tmpTBody.getMCustomerByDepositId());
            		// 在庫区分
            		tBody.setMStockType(tmpTBody.getMStockType());
            		// 入庫ラベルNo.
					// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
					//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.25 chou Mod Start
					if (!CU.isNullOrEmpty(tmpTBody.getStoreLabelNo())) {
						tBody.setStoreLabelNo(tmpTBody.getStoreLabelNo());
					}
					//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.25 chou Mod End
					// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End
            		// 倉庫
            		tBody.setMWarehouse(tmpTBody.getMWarehouse());
            		// [#4220][Ver3.0] 帳票 - 表示項目最新化(入庫ロケに紐づくゾーン表示) 2018.04.03 honma Add Start
            		// ゾーン
            		tBody.setMLocation(tmpTBody.getMLocation());
            		// [#4220][Ver3.0] 帳票 - 表示項目最新化(入庫ロケに紐づくゾーン表示) 2018.04.03 honma Add End
            	}
            }
        }

		return stockList;
	}

	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana Start

	/**
	 * 在庫移動実績から入庫ロケーションを取得
	 * @param moveInstBId 在庫移動指示ボディID
	 * @return 入庫ロケーション
	 */
	private MLocation getMoveRecordLocation(long moveInstBId) {
		TMoveRecordBCB cb = tMoveRecordBBhv.newMyConditionBean();
		cb.setupSelect_MLocation();

		cb.query().setMoveInstBId_Equal(moveInstBId);
		cb.addOrderBy_PK_Desc();
		cb.fetchFirst(1);

		TMoveRecordB entity = tMoveRecordBBhv.selectEntity(cb);

		if (entity == null) {
			return null;
		}

		return entity.getMLocation();
	}

	// [#186][2.1.0-CT-027] 入庫ロケーション名称を在庫移動実績テーブルから取得 2016.11.04 kawana End

	// [#3702][Ver3.0] 推奨ロケ出力異常 推奨ロケ取得ロジック共通化のため削除 2018.02.20 honma Delete

	/**
	 * <h2>在庫移動指示帳票の更新処理を行う。</h2>
	 * <pre>
	 * 引数で受け取った在庫移動指示帳票が出力フラグ、出力者、出力日時を設定後、更新する。
	 * </pre>
	 * @param tMoveInstR 在庫移動指示帳票：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(TMoveInstR tMoveInstR ,ErrorStatus errSts) {

		Timestamp time = new Timestamp(System.currentTimeMillis());

		tMoveInstR = tMoveInstRBhv.selectByPKValue(tMoveInstR.getMoveInstHId());

		tMoveInstR.setInstOutFlg_$1();
		tMoveInstR.setInstOutUserId(this.getUserId());
		tMoveInstR.setInstOutDt(time);

		// ===== 在庫移動指示帳票更新実行 =====
		tMoveInstRBhv.update(tMoveInstR);
	}
}