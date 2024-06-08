package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.HMoveBCB;
import com.oneslogi.base.dbflute.exbhv.HMoveBBhv;
import com.oneslogi.base.dbflute.exentity.HMoveB;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 在庫移動履歴検索データ取得ロジッククラス
 */
public class StockMoveHistorySelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private HMoveBBhv hMoveBBhv;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu Start
	// ===== 使用ロジック =====
	@Inject
	private LocationLogic locationLogic;
	// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.06.01 shimizu End

	/**
	 * <h2>在庫移動履歴検索データ取得。</h2>
	 * <pre>
	 * 在庫移動履歴検索データ取得する。
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・0件チェック
	 *
	 * 【データ取得テーブル】
	 * ・在庫移動ボディ履歴
	 * ・在庫移動ヘッダ履歴 - 在庫移動ボディ履歴
	 * ・在庫履歴           - 在庫移動ボディ履歴
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動ボディ履歴)
	 *  ・センタCD     : 必須
	 *  ・荷主CD       : 必須
	 *  ・処理区分ID
	 *  ・入出庫区分
	 *  ・商品CD
	 *  ・ロット
	 *  ・在庫区分ID
	 *  ・倉庫CD
	 *  ・預託CD
	 *  ・入庫ラベルNo.
	 *  ・元入庫ラベルNo.
	 *  (在庫移動履歴画面用DTO)
	 *  ・期限日(From)
	 *  ・期限日(To)
	 *  ・ロケーションCD(From)
	 *  ・ロケーションCD(To)
	 *  ・移動日(From)
	 *  ・移動日(To)
	 * </pre>
	 * @param hMoveB 在庫移動ボディ履歴
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<HMoveB> 在庫移動ボディ履歴リスト
	 */
	public PagingResultBean<HMoveB> select(HMoveB hMoveB, PagingData paging, ErrorStatus errSts) {

		// ===== 初期処理 =====
		PagingResultBean<HMoveB> resultHMoveB = null;

		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(hMoveB.getHStock().getLocationCdFrom());
		mLocationExentity.setLocationCdTo(hMoveB.getHStock().getLocationCdTo());
		// 最小・最大ロケーションを取得
		MLocation maxLocationCd = locationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = locationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End

		// ===== 在庫移動履歴データ取得処理 ====
		HMoveBCB cb = hMoveBBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_HMoveH().withMProcessType().withVDict(getCultureId());
		cb.setupSelect_HStock().withMStockType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		cb.setupSelect_BClassDtlByInoutType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End


		// ===== 検索条件 =====
		// センタ
		cb.query().queryHStock().setCenterCd_Equal(hMoveB.getHStock().getCenterCd());
		// 荷主ID
		cb.query().queryHStock().setClientCd_Equal(hMoveB.getHStock().getClientCd());
		// 処理区分
		cb.query().queryHMoveH().queryMProcessType().setProcessTypeId_Equal(hMoveB.getHMoveH().getProcessTypeId());
		// 入出庫区分
		cb.query().setInoutType_Equal(hMoveB.getInoutType());
		// 商品CD
		cb.query().queryHStock().setProductCd_PrefixSearch(hMoveB.getHStock().getProductCd());
		// ロット
		cb.query().queryHStock().setLot_PrefixSearch(hMoveB.getHStock().getLot());
		// 期限日(From)
		cb.query().queryHStock().setLimitDt_GreaterEqual(hMoveB.getHStock().getLimitDtFrom());
		// 期限日(To)
		cb.query().queryHStock().setLimitDt_LessEqual(hMoveB.getHStock().getLimitDtTo());
		// 在庫区分
		cb.query().queryHStock().setStockTypeId_Equal(hMoveB.getHStock().getMStockType().getStockTypeId());
		// 倉庫
		cb.query().queryHStock().setWarehouseCd_Equal(hMoveB.getHStock().getWarehouseCd());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto Start
		// ロケーション(From)
		cb.query().queryHStock().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// ロケーション(To)
		cb.query().queryHStock().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// [Ver3.0]{#4666]最小・最大ロケーションの設定値修正 2018.05.31 matsumoto End
		// 預託
		cb.query().queryHStock().setDepositCd_Equal(hMoveB.getHStock().getDepositCd());
		// 入庫ラベルNo
		cb.query().queryHStock().setStoreLabelNo_PrefixSearch(hMoveB.getHStock().getStoreLabelNo());
		// 元入庫ラベルNo
		cb.query().queryHStock().setOldStoreLabelNo_PrefixSearch(hMoveB.getHStock().getOldStoreLabelNo());
		// 移動日(From)
		cb.query().setMoveDt_GreaterEqual(hMoveB.getMoveDtFrom());
		// 移動日(To)
		cb.query().setMoveDt_LessEqual(hMoveB.getMoveDtTo());

		// ===== ソート順 =====
		// 履歴日
		cb.query().queryHMoveH().addOrderBy_HistDt_Asc();
		// 在庫移動指示ヘッダID
		cb.query().queryHMoveH().addOrderBy_MoveInstHId_Asc();
		// 在庫移動指示ボディID
		cb.query().addOrderBy_MoveRecordBId_Asc();

		// ===== 検索実行 =====
		resultHMoveB = selectPage(hMoveBBhv, cb, paging);

		// ===== ０件チェック =====
		if (resultHMoveB.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultHMoveB;
		}

		return resultHMoveB;
	}
}
