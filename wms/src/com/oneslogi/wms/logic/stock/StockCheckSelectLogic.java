package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.PropertyConst;
import com.oneslogi.base.dbflute.exbhv.TTrhanbaiinvBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlStockCheckPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrhanbaiinv;
import com.oneslogi.base.dbflute.exentity.customize.SqlStockCheck;
import com.oneslogi.base.dbflute.exentity.customize.SqlStockCheckCnt;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 販売物流在庫情報データ取得ロジッククラス
 */
public class StockCheckSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrhanbaiinvBhv tTrhanbaiinvBhv;

	/**
	 * 適品・不適品区分:'0'(一致)
	 */
	private static final String MATCHES = "0";
	/**
	 * 適品・不適品区分:'9'(不適品)
	 */
	private static final String UNSUITABLE = "9";
	/**
	 * アンマッチ有:'0'(全件表示)
	 */
	private static final String ALLDISPLAY = "0";

	/**
	 * <h2>販売物流在庫情報データ取得</h2>
	 * <pre>
	 * 販売物流在庫情報データを取得する
	 * </pre>
	 * @param searchCondition ヘッダー情報
	 * @param paging ページング設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return stockCheckList 販売物流在庫情報
	 */
	public List<TTrhanbaiinv> select(TTrhanbaiinv searchCondition, PagingData paging, ErrorStatus errSts) {

		// 外だしSQLの実行(カウント)
		SqlStockCheckCnt sqlStockCheckCount = this.getStockCheckCount(searchCondition, paging);

		// データ未存在
		if (sqlStockCheckCount.getCnt().equals(0)) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// レコード数がプロパティマスタで設定された値を超過
		if (sqlStockCheckCount.getCnt() > getPropertyIntValue(PropertyConst.ALLOW_QUERY_COUNT)) {
			this.getErrorManager().add(errSts, WmsMessageConst.OVER_SAFETY_SIZE_ERROR,
					CU.convertNumberToString(getPropertyIntValue(PropertyConst.ALLOW_QUERY_COUNT)));
			return null;
		}

		// 外だしSQLの実行(検索)
		List<SqlStockCheck> sqlStockCheckResult = this.getStockCheck(searchCondition, paging);

		List<TTrhanbaiinv> stockCheckList = new ArrayList<TTrhanbaiinv>();
		for (SqlStockCheck sqlStockCheck : sqlStockCheckResult) {
			TTrhanbaiinv stockCheckResult = new TTrhanbaiinv();
			MClient mClient = new MClient();
			MCenter mCenter = new MCenter();

			//銘柄名称
			stockCheckResult.setSname(sqlStockCheck.getSname());
			//銘柄CD
			stockCheckResult.setProductCd(sqlStockCheck.getProductCd());
			//登録日時
			stockCheckResult.setAddDt(sqlStockCheck.getAddDt());
			//在庫数量
			stockCheckResult.setStockqty(sqlStockCheck.getStockqty());
			//一般出力順
			stockCheckResult.setUsernum3(sqlStockCheck.getUsernum3());
			//1ケース当カートン数
			Long unit1 = null;
			unit1 = WCC.longValue(sqlStockCheck.getUnit1());
			//1カートン当個数
			Long unit2 = null;
			unit2 = WCC.longValue(sqlStockCheck.getUnit2());
			//引当可能数
			stockCheckResult.setChargeNum(sqlStockCheck.getChargeNum());
			//棚卸数
			stockCheckResult.setInventoryNum(sqlStockCheck.getInventoryNum());
			//在庫調査指示キー
			stockCheckResult.setInventoryKey(sqlStockCheck.getInventoryKey());
			//拠点CD
			mCenter.setCenterCd(sqlStockCheck.getCenterCd());
			stockCheckResult.setMCenter(mCenter);
			//拠点名称
			mCenter.setCenterNm(sqlStockCheck.getCenterNm());
			stockCheckResult.setMCenter(mCenter);
			//荷主CD
			mClient.setClientCd(sqlStockCheck.getClientCd());
			stockCheckResult.setMClient(mClient);
			//荷主名称
			mClient.setClientNm(sqlStockCheck.getClientNm());
			stockCheckResult.setMClient(mClient);
			//[TSN］共通処理： BGL0103 販物在庫数量(ケース)を取得する処理 2024.04.01 Kimura Start
			//販物在庫数量(ケース)取得 (共通関数未作成の為適当な値を代入)
			Long stockQtyCase = null;
			stockQtyCase = 1000L;
			//[TSN］共通処理未作成 2024.04.01 Kimura
			//stockQtyCase = FX_QTYBYSTYLE1(sqlStockCheck.getStockqty(), unit1, unit2);
			stockCheckResult.setStockQtyCase(stockQtyCase);
			//[TSN］共通処理： BGL0103 販物在庫数量(ケース)を取得する処理 2024.04.01 Kimura End
			//[TSN］共通処理： BGL0104 販物在庫数量(カートン)を取得する処理 2024.04.01 Kimura Start
			//販物在庫数量(カートン)取得 (共通関数未作成の為適当な値を代入)
			Long stockQtyCarton = null;
			stockQtyCarton = 1000L;
			//[TSN］共通処理未作成 2024.04.01 Kimura
			//stockQtyCarton = FX_QTYBYSTYLE2(sqlStockCheck.getStockqty(), unit1, unit2);
			stockCheckResult.setStockQtyCarton(stockQtyCarton);
			//[TSN］共通処理： BGL0104 販物在庫数量(カートン)を取得する処理 2024.04.01 Kimura End
			//[TSN］共通処理： BGL0103 システム在庫数量(ケース)を取得する処理 2024.04.01 Kimura Start
			//システム在庫数量(ケース)取得 (共通関数未作成の為適当な値を代入)
			Long chargeNumCase = null;
			chargeNumCase = 100000L;
			//[TSN］共通処理未作成 2024.04.01 Kimura
			//chargeNumCase = FX_QTYBYSTYLE1(sqlStockCheck.getInvexpectqty1(), unit1, unit2);
			stockCheckResult.setChargeNumCase(chargeNumCase);
			//[TSN］共通処理： BGL0103 システム在庫数量(ケース)を取得する処理 2024.04.01 Kimura End
			//[TSN］共通処理： BGL0104 システム在庫数量(カートン)を取得する処理 2024.04.01 Kimura Start
			//システム在庫数量(カートン)取得 (共通関数未作成の為適当な値を代入)
			Long chargeNumCarton = null;
			chargeNumCarton = 100000L;
			//[TSN］共通処理未作成 2024.04.01 Kimura
			//invexpectQty1Carton = FX_QTYBYSTYLE2(sqlStockCheck.getInvexpectqty1(), unit1, unit2);
			stockCheckResult.setChargeNumCarton(chargeNumCarton);
			//[TSN］共通処理： BGL0104 システム在庫数量(カートン)を取得する処理 2024.04.01 Kimura End
			//[TSN］共通処理： BGL0103 調査数量(ケース)を取得する処理 2024.04.01 Kimura Start
			//調査数量(ケース)取得 (共通関数未作成の為適当な値を代入)
			Long inventoryNumCase = null;
			inventoryNumCase = 10000L;
			//[TSN］共通処理未作成 2024.04.01 Kimura
			//inventoryQty1Case = FX_QTYBYSTYLE1(sqlStockCheck.getInventoryqty1(), unit1, unit2);
			stockCheckResult.setInventoryNumCase(inventoryNumCase);
			//[TSN］共通処理： BGL0103 調査数量(ケース)を取得する処理 2024.04.01 Kimura End
			//[TSN］共通処理： BGL0104 調査数量(カートン)を取得する処理 2024.04.01 Kimura Start
			//調査数量(カートン)取得 (共通関数未作成の為適当な値を代入)
			Long inventoryNumCarton = null;
			inventoryNumCarton = 10000L;
			//[TSN］共通処理未作成 2024.04.01 Kimura
			//inventoryQty1Carton = FX_QTYBYSTYLE2(sqlStockCheck.getInventoryqty1(), unit1, unit2);
			stockCheckResult.setInventoryNumCarton(inventoryNumCarton);
			//[TSN］共通処理： BGL0104 調査数量(カートン)を取得する処理 2024.04.01 Kimura End
			//差異数量(システムｰ販物)(ケース)取得
			stockCheckResult.setDiffExpectHanCase(chargeNumCase - stockQtyCase);
			//差異数量(システムｰ販物)(カートン)取得
			stockCheckResult.setDiffExpectHanCarton(chargeNumCarton - stockQtyCarton);
			//差異数量(調査ｰ販物)(ケース)取得
			stockCheckResult.setDiffInvHanCase(inventoryNumCase - stockQtyCase);
			//差異数量(調査ｰ販物)(カートン)取得
			stockCheckResult.setDiffInvHanCarton(inventoryNumCarton - stockQtyCarton);
			//差異数量(調査ｰシステム)(ケース)取得
			stockCheckResult.setDiffInvExpectCase(inventoryNumCase - chargeNumCase);
			//差異数量(調査ｰシステム)(カートン)取得
			stockCheckResult.setDiffInvExpectCarton(inventoryNumCarton - chargeNumCarton);

			stockCheckList.add(stockCheckResult);
		}
		return stockCheckList;
	}

	/**
	 * <h2>外だしSQLの実行(検索)</h2>
	 * <pre>
	 * 外だしSQLの実行し検索結果を取得する
	 * </pre>
	 * @param searchCondition ヘッダー情報
	 * @param paging ページング設定
	 * @return sqlStockCheck 検索結果
	 */
	private List<SqlStockCheck> getStockCheck(TTrhanbaiinv searchCondition, PagingData paging) {
		// 外出しSQLの定義
		String path = TTrhanbaiinvBhv.PATH_selectSqlStockCheck;

		// 検索条件の設定
		SqlStockCheckPmb pmb = new SqlStockCheckPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setClientId(searchCondition.getClientId());
		pmb.setInventoryKey(searchCondition.getInventoryKey());
		pmb.setProductCd_PrefixSearch(searchCondition.getProductCd());
		if (searchCondition.getUnmatch() != null) {
			if (searchCondition.getUnmatch().equals(ALLDISPLAY)) {
				pmb.setGoodItemKbn(MATCHES);
			} else {
				pmb.setGoodItemKbn(UNSUITABLE);
			}
		}

		// 検索実行
		Class<SqlStockCheck> entityType = SqlStockCheck.class;
		List<SqlStockCheck> sqlStockCheck;
		sqlStockCheck = super.selectPage(tTrhanbaiinvBhv, path, pmb, entityType, paging);

		return sqlStockCheck;
	}

	/**
	 * <h2>外だしSQLの実行(カウント)</h2>
	 * <pre>
	 * 外だしSQLの実行し検索件数を取得する
	 * </pre>
	 * @param searchCondition ヘッダー情報
	 * @param paging ページング設定
	 * @return sqlStockCheck 検索件数
	 */
	private SqlStockCheckCnt getStockCheckCount(TTrhanbaiinv searchCondition, PagingData paging) {
		// 外出しSQLの定義
		String path = TTrhanbaiinvBhv.PATH_selectSqlStockCheckCnt;

		// 検索条件の設定
		SqlStockCheckPmb pmb = new SqlStockCheckPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setClientId(searchCondition.getClientId());
		pmb.setInventoryKey(searchCondition.getInventoryKey());
		pmb.setProductCd_PrefixSearch(searchCondition.getProductCd());
		if (searchCondition.getUnmatch() != null) {
			if (searchCondition.getUnmatch().equals(ALLDISPLAY)) {
				pmb.setGoodItemKbn(MATCHES);
			} else {
				pmb.setGoodItemKbn(UNSUITABLE);
			}
		}

		//1件目のみを表示する
		pmb.fetchFirst(1);

		// 検索実行
		Class<SqlStockCheckCnt> entityType = SqlStockCheckCnt.class;
		SqlStockCheckCnt sqlStockCheckCount = tTrhanbaiinvBhv.outsideSql().entityHandling().selectEntity(path, pmb,
				entityType);

		return sqlStockCheckCount;
	}
}