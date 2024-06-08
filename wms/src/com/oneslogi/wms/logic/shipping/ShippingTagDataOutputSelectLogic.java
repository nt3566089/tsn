package com.oneslogi.wms.logic.shipping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.MCarrierBoxCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBoxBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingTagDataOutputPmb;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingTagDataOutput;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 送り状データ出力のデータを取得ロジッククラス
 * @param <SqlPickingListPrint>
 */
public class ShippingTagDataOutputSelectLogic<SqlPickingListPrint> extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
	@Inject
	private MCarrierBoxBhv mCarrierBoxBhv;
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End

	/**
	 * <h2>出荷データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し送り状データの出力データを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tAllocInstH 引当指示ヘッダ：出荷日(From)・出荷日(To)・作業日(From)・作業日(To)・
	 * @param mDeliveryCourse 配送コースマスタ：配送コースCD
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param mCarrier 運送業者マスタ：運送業者CD
	 * @param mCustomer 取引先マスタ：納品先CD
	 * @param tShippingInstH 出荷指示ヘッダ：緊急フラグ：顧客出荷指示No.
	 * @param tPickingR 出庫帳票：送り状データ作成フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlShippingTagDataOutput> 送り状データの出力リストデータ
	 */
	public PagingResultBean<SqlShippingTagDataOutput> select(TAllocInstH tAllocInstH, MDeliveryCourse
			mDeliveryCourse, TPickingH tPickingH, MCarrier mCarrier, MCustomer mCustomer, final TShippingInstH tShippingInstH, TPickingR tPickingR, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlShippingTagDataOutput> result = null;

		// ===== 出庫指示一覧データ取得 =====

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlShippingTagDataOutput;

		// 検索条件の設定
		SqlShippingTagDataOutputPmb pmb = setCondition(tAllocInstH, mDeliveryCourse, tPickingH, mCarrier, mCustomer, tShippingInstH, tPickingR);

		// 検索実行
		Class<SqlShippingTagDataOutput> entityType = SqlShippingTagDataOutput.class;
		result = selectPage(tPickingHBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [ON推-品向-235] 検索データ方法を削除 2014.11.21 xiangy

		return result;
	}

	/**
	 * <h2>出庫帳票データを更新する。</h2>
	 * <pre>
	 * 出庫帳票を更新する。
	 * </pre>
	 * @param update 出庫帳票(更新用)：全項目
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
	 * <h2>出庫帳票データを更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫帳票データを更新する。
	 *
	 * </pre>
	 * @param tPickingHListList 出庫ヘッダリスト：出庫作業No.
	 * @param head 出庫ヘッダ：荷主ID・センタID
	 * @param update 出庫帳票(更新用)
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateControlNo(List<TPickingH> tPickingHListList, TPickingH head, TPickingR update, ErrorStatus errStatus) {

		// 出庫ヘッダリストのデータ件数分繰返
		for (final TPickingH tPickingH : tPickingHListList) {
			// ===== 出庫帳票データ更新 =====

			// 更新条件作成
			TPickingRCB cb = tPickingRBhv.newMyConditionBean();
			cb.setupSelect_TPickingH();
			cb.setupSelect_TPickingH().withTAllocInstH();
			cb.setupSelect_TPickingH().withTAllocInstH().withMDeliveryCourse();
			cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerBySupplyCustomerId();

			//検索条件
			cb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
			cb.query().queryTPickingH().setClientId_Equal(head.getClientId());
			cb.query().queryTPickingH().setCenterId_Equal(head.getCenterId());

			// ===== 出庫帳票の更新 =====
			tPickingRBhv.queryUpdate(update, cb);
		}
	}

	/**
	 * <h2>引当指示ヘッダデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから引当指示ヘッダデータを取得する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param center センタマスタ：センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TAllocInstH> 引当指示ヘッダリスト
	 */
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
	public List<TAllocInstH> selectTAllocInstH(final TPickingR tPickingR, MCenter center, ErrorStatus errSts) {
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End

		List<TAllocInstH> result = null;

		// ===== 引当指示ヘッダリストデータ取得 =====
		TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
		tAllocInstHCB.setupSelect_TPickingH();
		tAllocInstHCB.setupSelect_TPickingH().withTPickingRAsOne();
		// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrierSlipYmt();
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrierSlipSgw();
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrierSlipYupk();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCenterClassDtlByTagDataType(center.getCenterId()).withVDict(getCultureId());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End


		// 顧客出荷指示No.
		tAllocInstHCB.specify().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnClientShippingNo();
			}
		}, TAllocInstH.ALIAS_clientShippingNo);

		// 梱包数
		tAllocInstHCB.specify().specifyTPickingH().derivedTPackingHList().count(new SubQuery<TPackingHCB>() {
			@Override
			public void query(TPackingHCB cntCb) {
				cntCb.specify().columnPackingHId();
			}
		}, TAllocInstH.ALIAS_packingCount);
		// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End

		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana Start
		// 出庫指示バッチNo.
		tAllocInstHCB.specify().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnPickingBatchNo();
			}
		}, TAllocInstH.ALIAS_pickingBatchNo);
		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana End

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
		// 代引請求額
		tAllocInstHCB.specify().derivedTShippingInstHList().sum(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB sumCb) {
				sumCb.specify().columnCod();
			}
		}, TAllocInstH.ALIAS_cod);
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End

		// 検索条件の設定
		tAllocInstHCB.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana Start
		// ソート順
		tAllocInstHCB.query().queryTPickingH().queryMClient().addOrderBy_ClientCd_Asc();
		tAllocInstHCB.query().queryTPickingH().queryMCenter().addOrderBy_CenterCd_Asc();
		tAllocInstHCB.query().addOrderBy_WorkDt_Asc();
		tAllocInstHCB.query().addSpecifiedDerivedOrderBy_Asc(TAllocInstH.ALIAS_pickingBatchNo);
		tAllocInstHCB.query().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
		tAllocInstHCB.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana Start

		// 検索実行
		result = tAllocInstHBhv.selectList(tAllocInstHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * <h2>引当指示ヘッダデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから引当指示ヘッダデータを取得する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TAllocInstH> 引当指示ヘッダリスト
	 */
	public List<TPackingH> selectTPackingH(final TPickingR tPickingR, ErrorStatus errSts) {

		List<TPackingH> result = null;

		// ===== 梱包ヘッダリストデータ取得 =====
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.setupSelect_TPickingH();
		tPackingHCB.setupSelect_TPickingH().withTPickingRAsOne();
		tPackingHCB.setupSelect_TAllocInstH();

		tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrierSlipYmt();
		tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrierSlipSgw();
		tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrierSlipYupk();

		// 出庫指示バッチNo.
		tPackingHCB.specify().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnPickingBatchNo();
			}
		}, TPackingH.ALIAS_pickingBatchNo);

		// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
		// 出荷指示ヘッダ数
		tPackingHCB.specify().specifyTAllocInstH().derivedTShippingInstHList().count(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB countCb){
				countCb.specify().columnShippingInstHId();
			}
		},TPackingH.ALIAS_shippingInstHCount);

		// 貨物追跡Noの最小値
		tPackingHCB.specify().specifyTPickingH().derivedTPackingHList().min(new SubQuery<TPackingHCB>(){
			@Override
			public void query(TPackingHCB minCb){
				minCb.specify().columnCarrierTraceNum();
			}
		}, TPackingH.ALIAS_minCarrierTraceNum);

		// 代引請求額の最大値
		tPackingHCB.specify().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>(){
			@Override
			public void query(TShippingInstHCB maxCb){
				maxCb.specify().columnCod();
			}

		}, TPackingH.ALIAS_maxCod);

		// 代引消費税の最大値
		tPackingHCB.specify().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>(){
			@Override
			public void query(TShippingInstHCB maxCb){
				maxCb.specify().columnCodTax();
			}

		}, TPackingH.ALIAS_maxCodTax);

		tPackingHCB.specify().specifyTPickingH().derivedTPackingHList().count(new SubQuery<TPackingHCB>(){
			@Override
			public void query(TPackingHCB countHCb){
				countHCb.specify().columnPackingHId();
			}
		}, TPackingH.ALIAS_packingHCount);

		// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End

		// 検索条件の設定
		tPackingHCB.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// ソート順
		tPackingHCB.query().queryTPickingH().queryMClient().addOrderBy_ClientCd_Asc();
		tPackingHCB.query().queryTPickingH().queryMCenter().addOrderBy_CenterCd_Asc();
		tPackingHCB.query().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		tPackingHCB.query().queryTAllocInstH().addSpecifiedDerivedOrderBy_Asc(TPackingH.ALIAS_pickingBatchNo);
		tPackingHCB.query().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
		tPackingHCB.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		tPackingHCB.query().addOrderBy_CarrierTraceNum_Asc();

		// 検索実行
		result = tPackingHBhv.selectList(tPackingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
	/**
	 * <h2>引当指示ヘッダデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから引当指示ヘッダデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param pickingHList 出庫ヘッダリスト：出庫作業No.
	 * @param center センタマスタ：センタID
	 * @param client 荷主マスタ：荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TAllocInstH> 引当指示ヘッダリスト
	 */
	public List<TAllocInstH> selectTAllocInstH(List<TPickingH> pickingHList, MCenter center, MClient client, ErrorStatus errSts) {

		// 出庫作業No.を抜き出す
		Set<String> pickingWorkNoSet = new HashSet<String>();
		for (TPickingH h : pickingHList) {
			pickingWorkNoSet.add(h.getPickingWorkNo());
		}
		if (pickingWorkNoSet.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		List<TAllocInstH> result = null;

		// ===== 引当指示ヘッダリストデータ取得 =====
		TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
		tAllocInstHCB.setupSelect_TPickingH();
		tAllocInstHCB.setupSelect_TPickingH().withTPickingRAsOne();
		// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrierSlipYmt();
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrierSlipSgw();
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCarrierSlipYupk();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  Start
		tAllocInstHCB.setupSelect_MDeliveryCourse().withMCenterClassDtlByTagDataType(center.getCenterId()).withVDict(getCultureId());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/25  End

		// 顧客出荷指示No.
		tAllocInstHCB.specify().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnClientShippingNo();
			}
		}, TAllocInstH.ALIAS_clientShippingNo);

		// 梱包数
		tAllocInstHCB.specify().specifyTPickingH().derivedTPackingHList().count(new SubQuery<TPackingHCB>() {
			@Override
			public void query(TPackingHCB cntCb) {
				cntCb.specify().columnPackingHId();
			}
		}, TAllocInstH.ALIAS_packingCount);
		// [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End

		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana Start
		// 出庫指示バッチNo.
		tAllocInstHCB.specify().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnPickingBatchNo();
			}
		}, TAllocInstH.ALIAS_pickingBatchNo);
		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana End

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
		// 代引請求額
		tAllocInstHCB.specify().derivedTShippingInstHList().sum(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB sumCb) {
				sumCb.specify().columnCod();
			}
		}, TAllocInstH.ALIAS_cod);
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End

		// 検索条件の設定
		tAllocInstHCB.checkInvalidQuery();
		tAllocInstHCB.query().queryTPickingH().setPickingWorkNo_InScope(pickingWorkNoSet);
		tAllocInstHCB.query().queryTPickingH().setCenterId_Equal(center.getCenterId());
		tAllocInstHCB.query().queryTPickingH().setClientId_Equal(client.getClientId());

		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana Start
		// ソート順
		tAllocInstHCB.query().queryTPickingH().queryMClient().addOrderBy_ClientCd_Asc();
		tAllocInstHCB.query().queryTPickingH().queryMCenter().addOrderBy_CenterCd_Asc();
		tAllocInstHCB.query().addOrderBy_WorkDt_Asc();
		tAllocInstHCB.query().addSpecifiedDerivedOrderBy_Asc(TAllocInstH.ALIAS_pickingBatchNo);
		tAllocInstHCB.query().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
		tAllocInstHCB.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		// [EC-CT1-159] 送り状データ出力のソート順修正 2015.03.30 kawana Start

		// 検索実行
		result = tAllocInstHBhv.selectList(tAllocInstHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

	/**
	 *  <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：出荷日(From)・出荷日(To)・作業日(From)・作業日(To)・
	 * @param mDeliveryCourse 配送コースマスタ：配送コースCD
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param mCarrier 運送業者マスタ：運送業者CD
	 * @param mCustomer 取引先マスタ：納品先CD
	 * @param tShippingInstH 出荷指示ヘッダ：緊急フラグ：顧客出荷指示No.
	 * @param tPickingR 出庫帳票：送り状データ作成フラグ
	 * @return SqlPickingListPrintPmb 検索条件
	 */
	protected SqlShippingTagDataOutputPmb setCondition(TAllocInstH tAllocInstH, MDeliveryCourse mDeliveryCourse,
			TPickingH tPickingH, MCarrier mCarrier, MCustomer mCustomer, final TShippingInstH tShippingInstH, TPickingR tPickingR) {

		// 検索条件の設定
		SqlShippingTagDataOutputPmb pmb = new SqlShippingTagDataOutputPmb();
		// [ON推-品向-235] 検索条件の設定を修正 2014.11.21 xiangy Start
		pmb.setCenterClassCondition(getCenterClassCondition());
		// [ON推-品向-235] 検索条件の設定を修正 2014.11.21 xiangy End
		pmb.setClientId(tPickingH.getClientId()); //荷主ID
		pmb.setCenterId(tPickingH.getCenterId()); // センタID
		pmb.setEmergencyFlg(tShippingInstH.getEmergencyFlg()); // 緊急フラグ
		pmb.setShippingDtFrom(tAllocInstH.getShippingDtFrom()); // 出荷日(From)
		pmb.setShippingDtTo(tAllocInstH.getShippingDtTo()); // 出荷日(To)
		pmb.setWorkDtFrom(tAllocInstH.getWorkDtFrom()); // 出荷日(From)
		pmb.setWorkDtTo(tAllocInstH.getWorkDtTo()); // 出荷日(To)
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana Start
		pmb.setPickingWorkNo_SuffixSearch(tPickingH.getPickingWorkNo()); // 出庫作業No.
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana End
		pmb.setCustomerCd_PrefixSearch(mCustomer.getCustomerCd());//納品先CD
		pmb.setInvoiceCreateFlg(tPickingR.getInvoiceCreateFlg());// 送り状データ作成フラグ
		pmb.setDeliveryCourseCd_PrefixSearch(mDeliveryCourse.getDeliveryCourseCd());// 配送コースCD
		pmb.setClientShippingNo_PrefixSearch(tShippingInstH.getClientShippingNo());// 顧客出荷指示No.
		pmb.setCarrierCd(mCarrier.getCarrierCd());// 運送業者CD
		// [ON推-品向-607] 辞書カルチャマスタデータを入れた後、カルチャIDを追加する 2015.04.09 kyo Start
		pmb.setCultureId(getCultureId());//カルチャID
		// [ON推-品向-607] 辞書カルチャマスタデータを入れた後、カルチャIDを追加する 2015.04.09 kyo End
		return pmb;
	}

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
	/**
	 * <h2>荷材サイズCDを取得</h2>
	 * <pre>
	 * 運送業者IDおよび荷材IDで荷材サイズCDを取得する処理
	 * </pre>
	 * @param carrierId 運送業者ID
	 * @param boxId 荷材ID
	 * @return 荷材サイズCD
	 */
	public String selectBoxSizeCd(Long carrierId, Long boxId) {

		if (carrierId == null || boxId == null) {
			return "";
		}

		MCarrierBoxCB cb = mCarrierBoxBhv.newMyConditionBean();
		cb.specify().columnBoxSizeCd();
		cb.checkInvalidQuery();
		cb.query().setCarrierId_Equal(carrierId);
		cb.query().setBoxId_Equal(boxId);

		MCarrierBox cBox = mCarrierBoxBhv.selectEntity(cb);
		if (cBox == null) {
			return "";
		}

		return cBox.getBoxSizeCd();
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End
}
