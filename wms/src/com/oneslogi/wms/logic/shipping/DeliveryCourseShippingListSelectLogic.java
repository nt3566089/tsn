package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.AppCDef;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlDeliveryCourseShippingListPmb;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlDeliveryCourseShippingList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CarrierLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 配送コース別出庫指示一覧データ取得ロジッククラス
 */
public class DeliveryCourseShippingListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CenterLogic centerLogic;

	@Inject
	private CarrierLogic carrierLogic;

	/**
	 * <h2>配送コース別出庫指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し配送コース別出庫指示一覧データを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tShippingInstH 出荷指示ヘッダ：荷主CD・センタCD・配送コースCD・出庫指示バッチNo.・出荷日(From)・出荷日(To)
	 *                                     ・出荷ステータス・未出荷全件・緊急フラグ・キャンセルデータ表示有無
	 * @param mCarrier 運送業者マスタ：運送業者ID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlDeliveryCourseShippingList> 配送コース別出庫指示のリスト
	 */
	public PagingResultBean<SqlDeliveryCourseShippingList> select(TShippingInstH tShippingInstH, MCarrier mCarrier, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlDeliveryCourseShippingList> result = null;

		// ===== 配送コース別出庫指示一覧データ取得 =====

		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlDeliveryCourseShippingList;

		// 検索条件の設定
		SqlDeliveryCourseShippingListPmb pmb = setCondition(tShippingInstH, mCarrier);

		// 該当データ無し
		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlDeliveryCourseShippingList> entityType = SqlDeliveryCourseShippingList.class;
		result = selectPage(tShippingInstHBhv, path, pmb, entityType, paging);

		// 該当データ無し
		if (result.size() == 0 || (result.size() == 1 && result.get(0).getCenterId() == null)) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

//	// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana Start
//	/**
//	 * <h2>配送コース別出庫指示一覧データ取得。</h2>
//	 * <pre>
//	 * 以下のチェックを行う
//	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
//	 *
//	 * ・取得データが0件チェック
//	 *
//	 * 【データ取得テーブル】
//	 * サブクエリ A - サブクエリ A
//	 * サブクエリ A_1 - サブクエリ A
//	 * サブクエリ A_2 - サブクエリ A
//	 * 区分値マスタ - サブクエリ A
//	 * 区分値明細マスタ - 区分値マスタ
//	 * 辞書ビュー - 区分値明細マスタ
//	 *
//	 *   (サブクエリ A)
//	 *       サブクエリ B
//	 *       荷主マスタ - サブクエリ B
//	 *       センタマスタ - サブクエリ B
//	 *       配送コースマスタ - サブクエリ B
//	 *       運送業者マスタ - 配送コースマスタ
//	 *       サブクエリ C - サブクエリ B
//	 *       サブクエリ D - サブクエリ B
//	 *
//	 *   (サブクエリ B)
//	 *       出荷指示ヘッダ
//	 *       出荷指示ボディ - 出荷指示ヘッダ
//	 *       配送コースマスタ - 出荷指示ヘッダ
//	 *       運送業者マスタ - 配送コースマスタ
//	 *
//	 *   (サブクエリ C)
//	 *       梱包ヘッダ
//	 *       梱包帳票 - 梱包ヘッダ
//	 *
//	 *   (サブクエリ D)
//	 *       引当指示ヘッダ
//	 *       出庫ヘッダ - 引当指示ヘッダ
//	 *       出庫帳票 - 出庫ヘッダ
//	 *       出庫ボディ - 出庫ヘッダ
//	 *
//	 *   (サブクエリ A_1)
//	 *       出荷指示ボディ
//	 *       出荷指示ヘッダ - 出荷指示ボディ
//	 *       荷主マスタ - 出荷指示ヘッダ
//	 *       センタマスタ - 出荷指示ヘッダ
//	 *       配送コースマスタ - 出荷指示ヘッダ
//	 *
//	 *   (サブクエリ A_2)
//	 *       出荷指示ヘッダ
//	 *       出庫ヘッダ - 出荷指示ヘッダ
//	 *       出庫ボディ - 出庫ヘッダ
//	 *       荷主マスタ - 出荷指示ヘッダ
//	 *       センタマスタ - 出荷指示ヘッダ
//	 *       配送コースマスタ - 出荷指示ヘッダ
//	 *
//	 * 【パラメータの使用項目】
//	 *  (出荷指示ヘッダ)
//	 *  ・荷主ID
//	 *  ・センタID
//	 *  ・配送コースCD
//	 *  ・出庫指示バッチNo.
//	 *  ・出荷日(From)
//	 *  ・出荷日(To)
//	 *  ・出荷ステータス
//	 *  ・未出荷全件
//	 *  ・緊急フラグ
//	 *  (運送業者マスタ)
//	 *  ・運送業者ID
//	 * </pre>
//	 *
//	 * @param tShippingInstH 出荷指示ヘッダ
//	 * @param mCarrier 運送業者マスタ
//	 * @param errSts チェックがエラー時に設定するエラーステータス
//	 * @return PagingResultBean<SqlDeliveryCourseShippingList> 配送コース別出庫指示のリスト
//	 */
//	public ListResultBean<SqlDeliveryCourseShippingList> selectList(TShippingInstH tShippingInstH, MCarrier mCarrier, ErrorStatus errSts) {
//
//		ListResultBean<SqlDeliveryCourseShippingList> result = null;
//
//		// 外出しSQLの定義
//		String path = TShippingInstHBhv.PATH_selectSqlDeliveryCourseShippingList;
//
//		// 検索条件の設定
//		SqlDeliveryCourseShippingListPmb pmb = setCondition(tShippingInstH, mCarrier);
//		if (pmb == null) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			return result;
//		}
//
//		// 検索実行
//		Class<SqlDeliveryCourseShippingList> entityType = SqlDeliveryCourseShippingList.class;
//		result = tShippingInstHBhv.outsideSql().selectList(path, pmb, entityType);
//
//		// 存在チェック
//		if (result.size() == 0 || (result.size() == 1 && result.get(0).getCenterId() == null)) {
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			return result;
//		}
//
//		return result;
//	}
//	// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana End

	/**
	 * <h2>外出しSQL文の検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQL文の検索条件を設定する。
	 * </pre>
	 * @param tShippingInstH 出荷指示ヘッダ：荷主CD・センタCD・配送コースCD・出庫指示バッチNo.・出荷日(From)・出荷日(To)・出荷ステータス・未出荷全件・緊急フラグ・キャンセルデータ表示有無
	 * @param mCarrier 運送業者マスタ：運送業者CD
	 * @return SqlDeliveryCourseShippingListPmb 配送コース別出庫指示リスト
	 */
	protected SqlDeliveryCourseShippingListPmb setCondition(TShippingInstH tShippingInstH, MCarrier mCarrier) {
		SqlDeliveryCourseShippingListPmb pmb = new SqlDeliveryCourseShippingListPmb();
		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tShippingInstH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			return null;
		}
		long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tShippingInstH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntity(centerCondition);
		if (centerCondition == null) {
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 検索条件の設定
		//pmb.setCenterClassCondition(getCenterClassCondition());
		pmb.setClientId(clientId);//荷主ID
		pmb.setCenterId(centerId);//センタID
		pmb.setDeliveryCourseCd_PrefixSearch(tShippingInstH.getDeliveryCourseCd());//配送コースCD
		pmb.setPickingBatchNo(tShippingInstH.getPickingBatchNo());//出庫指示バッチNo.
		pmb.setShippingDtFrom(tShippingInstH.getShippingDtFrom());//出荷日(From)
		pmb.setShippingDtTo(tShippingInstH.getShippingDtTo());//出荷日(To)
		pmb.setShippingStatus(tShippingInstH.getShippingStatus());//出荷ステータス
		pmb.setNoAllcDisplayFlg(tShippingInstH.getNoAllcDisplayFlg());//未出荷全件
		pmb.setEmergencyFlg(tShippingInstH.getEmergencyFlg());//緊急フラグ
		if (mCarrier.getCarrierCd() != null) {
			// 運送業者IDの取得
			MCarrier carrierCondition = new MCarrier();
			carrierCondition.setCarrierCd(mCarrier.getCarrierCd());
			// [ON推-品向-264] センタID設定する  2014.11.27 zhouj start
			carrierCondition.setCenterId(centerId);
			// [ON推-品向-264] センタID設定する  2014.11.27 zhouj end
			long carrierId = carrierLogic.getUkEntity(carrierCondition).getCarrierId();
			pmb.setCarrierId(carrierId);//運送業者ID
		}
		//pmb.setShippingStatus01("10");//未出荷
		// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
		pmb.setCancelDisplay(tShippingInstH.getCancelDisplay());
		// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
		// [ON推-品向-588] 辞書カルチャマスタデータを入れた後、排他エラーになる現象を解消するため、カルチャIDを追加する 2015.03.06 kyo Start
		//pmb.setCultureId(getCultureId());//カルチャID
		// [ON推-品向-588] 辞書カルチャマスタデータを入れた後、排他エラーになる現象を解消するため、カルチャIDを追加する 2015.03.06 kyo End

		return pmb;
	}

	/**
	 * <h2>出荷指示ヘッダのコントロールNo.を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、
	 * 対象データのコントロールNo.を更新する。
	 * </pre>
	 * @param instHeaderList 出荷指示ヘッダリスト：荷主ID・センタID・作業日・出荷日・出荷ステータス・更新日時・出庫指示バッチNo.・配送コースCD
	 * @param header 出荷指示ヘッダ：コントロールNo.(更新用)
	 */
	public int updateControlNo(List<TShippingInstH> instHeaderList, TShippingInstH header, ErrorStatus errSts) {

		// ===== 出荷指示ヘッダデータ取得 =====
		int reUpdCnt = 0;
		/*ListResultBean<TShippingInstH> result = null;*/
		for (TShippingInstH tShippingInstH : instHeaderList) {
			// 検索条件の設定
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();

			//コントロールNo.の設定
			cb.query().setClientId_Equal(tShippingInstH.getClientId());//荷主ID
			cb.query().setCenterId_Equal(tShippingInstH.getCenterId());//センタID
			cb.query().setWorkDt_Equal(tShippingInstH.getWorkDt());//作業日
			cb.query().setShippingDt_Equal(tShippingInstH.getShippingDt());//出荷日
			if (tShippingInstH.isShippingStatus$10()) {
				// 出荷指示の場合、未出荷のみ
				cb.query().setShippingStatus_Equal(tShippingInstH.getShippingStatus());//出荷ステータス
			}else{
				// 出荷指示解除の場合、未出荷・エラー・キャンセル以外のみ
				List<String> statusList = new ArrayList<String>();
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				statusList.add(AppCDef.ShippingStatus.$10.code());
				statusList.add(AppCDef.ShippingStatus.$15.code());
				statusList.add(AppCDef.ShippingStatus.$90.code());
				statusList.add(AppCDef.ShippingStatus.$99.code());
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				cb.query().setShippingDt_NotInScope(statusList);
			}
			// [ON推-品向-1042] グルーピングを変更した為、緊急フラグは条件に含めない様に修正 2016-01-25 koseki Start
//			if(tShippingInstH.isEmergencyFlg$1()){
//				cb.query().setEmergencyFlg_Equal(tShippingInstH.getEmergencyFlg());//緊急フラグ
//			}
			// [ON推-品向-1042] グルーピングを変更した為、緊急フラグは条件に含めない様に修正 2016-01-25 koseki End
			cb.query().setUpdDt_LessEqual(tShippingInstH.getUpdDt());//更新日時
			if (tShippingInstH.getPickingBatchNo() == null) {
				cb.query().setPickingBatchNo_IsNull();//出庫指示バッチNo.
			} else {
				cb.query().setPickingBatchNo_Equal(tShippingInstH.getPickingBatchNo());//出庫指示バッチNo.
			}
			if (tShippingInstH.getDeliveryCourseCd() == null) {
				cb.query().setDeliveryCourseCd_IsNull();//配送コースCD
			} else {
				cb.query().queryMDeliveryCourse().setDeliveryCourseCd_Equal(tShippingInstH.getDeliveryCourseCd());//配送コースCD
			}
			TShippingInstH updateTShippingInstH = new TShippingInstH();
			updateTShippingInstH.setControlNo(header.getControlNo());
			int count = tShippingInstHBhv.queryUpdate(updateTShippingInstH, cb);

			reUpdCnt = reUpdCnt + count;
			/*result = tShippingInstHBhv.selectList(cb);

			if (result.size() > 0) {
				for (TShippingInstH tShippingInstHInner : result) {
					tShippingInstHInner.setControlNo(header.getControlNo());
				}

				int[] arrUpdateCnt = tShippingInstHBhv.batchUpdate(result);

				for (int i : arrUpdateCnt) {
					reUpdCnt = reUpdCnt + i;
				}
			}*/
		}
		return reUpdCnt;
	}

	// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana Start
	/**
	 * <h2>出荷指示ヘッダのコントロールNo.をクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、コントロールNo.をクリアする。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
	public int clearControlNo(TShippingInstH header, ErrorStatus errSts) {

		// 検索条件
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(header.getControlNo());

		// 更新内容(コントロールNo.のクリア)
		TShippingInstH entity = new TShippingInstH();
		entity.setControlNo(null);

		// 更新
		int count = tShippingInstHBhv.queryUpdate(entity, cb);

		return count;
	}
	// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana End

}
