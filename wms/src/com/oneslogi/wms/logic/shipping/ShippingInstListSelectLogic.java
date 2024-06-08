package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingInstListPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingInstList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 出庫指示一覧データ取得ロジッククラス
 */
public class ShippingInstListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
	@Inject
	private PickingWorkMessageSelectLogic pickingWorkMessageSelectLogic;
	// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End


	/**
	 * <h2>出庫指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し出庫指示一覧のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param header 出荷指示ヘッダ：作業日/出荷日区分・荷主CD・センタCD・未出荷全件・納品先CD・出庫指示バッチNo.・出荷ステータス
	 *                        ・顧客出荷指示No.・WMS出荷伝票No.・緊急のみ・配送コースCD・運送業者・出庫作業No.・作業日(From)・作業日(To)・出荷日(From)・出荷日(To)・欠品有無・キャンセルデータ表示有無・出庫作業メッセージ有無・出庫作業メッセージ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlShippingInstList> 出庫指示一覧リスト
	 */
	public PagingResultBean<SqlShippingInstList> select(TShippingInstH header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlShippingInstList> result = null;

		// ===== 出庫指示一覧データ取得 =====

		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlShippingInstList;

		// 検索条件の設定
		SqlShippingInstListPmb pmb = setCondition(header);

		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlShippingInstList> entityType = SqlShippingInstList.class;
		result = selectPage(tShippingInstHBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start

		for (SqlShippingInstList entity : result) {

			if (1 < CU.nullToZero(entity.getPickingWorkMessageCount()).longValue()) {
				// 出庫作業メッセージが複数件あり ※ 未出荷でも複数商品の場合は1以上になる(同じメッセージが取得される)

				String pickingWorkNo = entity.getPickingWorkNo();
				if (CU.isNullOrEmpty(pickingWorkNo)) {
					// 出庫作業No.なし(未出荷)
					continue;
				}
				entity.setPickingWorkMessage(pickingWorkMessageSelectLogic.selectPickingWorkMessage(pickingWorkNo));
			}
		}

		// [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End

		return result;
	}

//	// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana Start
//	/**
//	 * <h2>出庫指示一覧データ取得。</h2>
//	 * <pre>
//	 * 出庫指示一覧データ取得
//	 * 以下のチェックを行う
//	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
//	 * ・取得データが0件チェック定した範囲の件数を戻り値に設定する。
//	 *
//	 * 戻り値には次のテーブルが結合された結果が設定される。
//	 *
//	 * 【データ取得テーブル】
//	 * ・出荷指示ヘッダ
//	 * ・出荷指示ボディ
//	 * ・引当指示ヘッダ
//	 * ・出庫ヘッダ
//	 * ・梱包ヘッダ
//	 * ・梱包帳票
//	 *
//	 * 【パラメータの使用項目】
//	 *  (出荷指示ヘッダ)
//	 *  ・荷主ID
//	 *  ・センタID
//	 *  ・作業日/出荷日
//	 *  ・日付(From)
//	 *  ・日付(To)
//	 *  ・配送コースCD
//	 *  ・納品先CD
//	 *  ・出庫指示バッチNo.
//	 *  ・出庫作業No.
//	 *  ・顧客出荷指示No.
//	 *  ・出荷ステータス
//	 *  ・未出荷全件
//	 *  ・緊急フラグ
//	 *  ・WMS出荷伝票No
//	 *  ・未引当フラグ
//	 *  (運送業者マスタ)
//	 *  ・運送業者ID
//	 * </pre>
//	 *
//	 * @param header 出荷指示ヘッダ
//	 * @param errSts チェックがエラー時に設定するエラーステータス
//	 * @return List<SqlShippingInstList> 出庫指示一覧データリスト
//	 */
//	public ListResultBean<SqlShippingInstList> selectList(TShippingInstH header, ErrorStatus errSts) {
//
//		ListResultBean<SqlShippingInstList> result = null;
//
//		// 外出しSQLの定義
//		String path = TShippingInstHBhv.PATH_selectSqlShippingInstList;
//
//		// 検索条件の設定
//		SqlShippingInstListPmb pmb = setCondition(header);
//		if (pmb == null) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			return result;
//		}
//
//		// 検索実行
//		Class<SqlShippingInstList> entityType = SqlShippingInstList.class;
//		result = tShippingInstHBhv.outsideSql().selectList(path, pmb, entityType);
//
//		// ===== ０件チェック =====
//		if (result.size() == 0) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			return result;
//		}
//
//		return result;
//	}
//	// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana End

	/**
	 * 検索条件の設定
	 * @param header 出荷指示ヘッダ：作業日/出荷日区分・荷主CD・センタCD・未出荷全件・納品先CD・出庫指示バッチNo.・出荷ステータス・
	 *                               顧客出荷指示No.・WMS出荷伝票No.・緊急のみ・配送コースCD・運送業者・出庫作業No.・作業日(From)・作業日(To)
	 *                               ・出荷日(From)・出荷日(To)・欠品有無・キャンセルデータ表示有無・出庫作業メッセージ有無・出庫作業メッセージ
	 * @return SqlShippingInstListPmb 出荷指示ヘッダのリスト
	 */
	private SqlShippingInstListPmb setCondition(TShippingInstH header) {
		SqlShippingInstListPmb pmb = new SqlShippingInstListPmb();
		// 荷主IDを取得
				MClient clientCondition = new MClient();
				clientCondition.setClientCd(header.getMClient().getClientCd());
				long clientId = clientLogic.getUkEntity(clientCondition).getClientId();
		// センタIDの取得
				MCenter centerCondition = new MCenter();
				centerCondition.setCenterCd(header.getMCenter().getCenterCd());
				centerCondition = centerLogic.getUkEntity(centerCondition);
				if (centerCondition == null) {
					return null;
				}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		// 検索条件の設定
		pmb.setCultureId(getCultureId());
		//pmb.setCenterClassCondition(getCenterClassCondition());
		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setTakingShippingFlg(header.getTakingShippingFlg());
		pmb.setNoAllcDisplayFlg(header.getNoAllcDisplayFlg());
		pmb.setSupplyCustomerCd_PrefixSearch(header.getSupplyCustomerCd());
		pmb.setPickingBatchNo(header.getPickingBatchNo());
		pmb.setShippingStatus(header.getShippingStatus());
		pmb.setClientShippingNo_PrefixSearch(header.getClientShippingNo());
		pmb.setShippingSlipNo_PrefixSearch(header.getShippingSlipNo());
		pmb.setEmergencyFlg(header.getEmergencyFlg());
		pmb.setDeliveryCourseCd_PrefixSearch(header.getDeliveryCourseCd());
		pmb.setCarrierCd(header.getCarrierCd());
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana Start
		pmb.setPickingWorkNo_SuffixSearch(header.getPickingWorkNo());
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana End
		pmb.setShippingDtFrom(header.getDtFrom());
		pmb.setShippingDtTo(header.getDtTo());
		pmb.setWorkDtFrom(header.getDtFrom());
		pmb.setWorkDtTo(header.getDtTo());
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
		pmb.setNoStockOutFlg(header.getNoStockOutFlg());
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End
		// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
		pmb.setCancelDisplay(header.getCancelDisplay());
		// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
		// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
		pmb.setPickingWorkMessageFlg(header.getPickingWorkMessageFlg());
		pmb.setPickingWorkMessage_ContainSearch(header.getPickingWorkMessage());
		// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End
		return pmb;
	}

	/**
	 * <h2>複数伝票の存在チェックを行う。</h2>
	 * <pre>
	 * 引数のリスト件数が０件の場合、異常エラーをスローする。
	 * 出荷指示ヘッダのデータを検索して、複数伝票の存在チェックを行う。
	 * 複数件データが存在する場合、tureを返す。
	 * それ以外の場合、falseを返す。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出庫作業No.・荷主ID・センタID
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @return boolean true：複数件/false：複数件ではない
	 */
	public boolean workOrderCancelCheck(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList) {

		boolean blnFlg = false;

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return false;
		}

		// ===== 出庫指示解除起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		ListResultBean<TShippingInstH> result = null;
		for (TShippingInstH tShippingInstH : sShipInstHeaderList) {
			// 検索条件の設定
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();

			//コントロールNo.の設定
			cb.query().setClientId_Equal(tShippingInstH.getClientId());
			cb.query().setCenterId_Equal(tShippingInstH.getCenterId());
			cb.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(tShippingInstH.getPickingWorkNo());
			result = tShippingInstHBhv.selectList(cb);

			if (result.size() > 1) {
				// 確認表示
				blnFlg = true;
			}
		}
		return blnFlg;
	}
}
