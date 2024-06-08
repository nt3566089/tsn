package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstB;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.BMessageCB;
import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.BMessageBhv;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
/**
 * 商品別出荷一覧データ取得ロジッククラス
 */
public class ProductShippingListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;

	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	// [SK2-005] リスト発行状況が表示されない問題を改修 2014.12.10 kawana Start
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	@Inject
	private BMessageBhv bMessageBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	// [SK2-005] リスト発行状況が表示されない問題を改修 2014.12.10 kawana End

	/**
	 * <h2>出荷指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件に出庫ボディ、倉庫、ロケーション、ロット、入庫No.、取引マスタ、処理区分マスタを連携して
	 * 出荷指示ボディデータを取得する。
	 * センタ区分値マスタ、処理区分マスタ、在庫区分マスタ、メッセージマスタに紐づく名称を取得し、
	 * 出荷指示ボディデータに設定する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tShippingInstH 出荷指示ヘッダ：センタCD・荷主CD・日付区分（作業日or出荷日）・日付（From）・日付(To)・配送コースCD・運送業者CD・出庫指示バッチNo.
	 *                                    ・WMS出荷伝票No.・顧客出荷指示No.・納品先CD・商品CD・出庫作業No.・欠品フラグ・出荷ステータス・キャンセルデータ表示有無・緊急フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TShippingInstB> 出荷指示ボデイリスト
	 */
	public PagingResultBean<TShippingInstB> select(TShippingInstH tShippingInstH, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TShippingInstB> result = null;

		//==== 出荷指示ヘッダデータ取得 =====

		//検索条件の設定a
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_TShippingInstH();
		//荷主マスタ
		cb.setupSelect_TShippingInstH().withMClient();
		//センタマスタ
		cb.setupSelect_TShippingInstH().withMCenter();
		//取引先マスタ(納品先)
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		//取引先マスタ(預託先)
		cb.setupSelect_MCustomer();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
//		//辞書ビュー(出荷ステータスと出荷ステータス名称)
//		cb.setupSelect_TShippingInstH().withMCenterClassDtlByShippingStatus(getCenterClassCondition()).withVDict(cultureId);
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 End
		//配送コースマスタ
		cb.setupSelect_TShippingInstH().withMDeliveryCourse();
		//運送業者マスタ
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrier();
		//処理区分マスタ
		cb.setupSelect_TShippingInstH().withMProcessType();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
//		//辞書ビュー(処理区分CDと処理区分名称)
//		cb.setupSelect_TShippingInstH().withMProcessType().withVDict(cultureId);
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 End
		//商品マスタ
		cb.setupSelect_MProduct();
		//在庫区分マスタ
		cb.setupSelect_MStockType();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
//		//辞書マスタビュー(在庫区分名称)
//		cb.setupSelect_MStockType().withVDict(cultureId);
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 End
		// [EC-CT1-151] 指定倉庫名称を一覧に表示 2015.03.27 kawana Start
		// 倉庫マスタ
		cb.setupSelect_MWarehouse();
		// [EC-CT1-151] 指定倉庫名称を一覧に表示 2015.03.27 kawana End
		//ロケーションマスタ
		cb.setupSelect_MLocation();
		//ロット
		cb.setupSelect_TLot();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
//		//辞書ビュー(納品時間帯と納品時間帯名称)
//		cb.setupSelect_TShippingInstH().withMCenterClassDtlByDelivTz(getCenterClassCondition()).withVDict(cultureId);
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 End
		//引当指示ヘッダ
		cb.setupSelect_TShippingInstH().withTAllocInstH();
		//出庫ヘッダ
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
//		//出庫帳票
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne();
//		//辞書ビュー(出庫帳票 オーダーピッキングリスト出力フラグ)
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne().withMCenterClassDtlByOplOutFlg(getCenterClassCondition()).withVDict(cultureId);
//		//辞書ビュー(出庫帳票 トータルピッキングリスト出力フラグ)
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne().withMCenterClassDtlByTplOutFlg(getCenterClassCondition()).withVDict(cultureId);
//		//辞書ビュー(出庫帳票 摘み取りリスト出力フラグ)
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne().withMCenterClassDtlByPlOutFlg(getCenterClassCondition()).withVDict(cultureId);
//		//辞書ビュー(出庫帳票 種蒔きリスト出力フラグ)
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne().withMCenterClassDtlBySlOutFlg(getCenterClassCondition()).withVDict(cultureId);
//		//辞書ビュー(出庫帳票 納品明細書出力フラグ)
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne().withMCenterClassDtlByPackingOutFlg(getCenterClassCondition()).withVDict(cultureId);
//		// [新ｿﾘ-024] 引当禁止フラグを削除 2014.11.21 wangb
//		//辞書ビュー(納品先出荷停止フラグ)
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId().withBClassDtlByShippingStopFlg();
		cb.setupSelect_TShippingInstH().withMCustomerByDelivCustomerId().withBClassDtlByShippingStopFlg();
//		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId().withMCenterClassDtlByShippingStopFlg(getCenterClassCondition()).withVDict(cultureId);
//		//辞書ビュー(商品出荷停止フラグ)
		cb.setupSelect_MProduct().withBClassDtlByShippingStopFlg();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
//		cb.setupSelect_MProduct().withMCenterClassDtlByShippingStopFlg(getCenterClassCondition()).withVDict(cultureId);
//		// [SK2-005] 送り状データ出力が表示されない問題を改修 2014.12.10 kawana Start
//		//辞書ビュー(送り状データ作成フラグ)
//		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH().withTPickingRAsOne().withMCenterClassDtlByInvoiceCreateFlg(getCenterClassCondition()).withVDict(cultureId);
//		// [SK2-005] 送り状データ出力が表示されない問題を改修 2014.12.10 kawana End
//		//積込リスト出力フラグ
//		cb.specify().specifyTShippingInstH().specifyTAllocInstH().specifyTPickingH().derivedTPackingHList().max(new SubQuery<TPackingHCB>() {
//			@Override
//			public void query(TPackingHCB subCB) {
//				//				subCB.specify().specifyTPackingRAsOne().specifyVDict(cultureId).columnDictNm();
//				//				subCB.specify().specifyTPackingRAsOne().specifyBClassDtlByStwOutFlg().specifyVDict(cultureId).columnDictNm();
//				subCB.specify().specifyTPackingRAsOne().specifyMCenterClassDtlByStwOutFlg(getCenterClassCondition()).specifyVDict(cultureId).columnDictNm();
//			}
//		}, TShippingInstB.ALIAS_stwOutFlg);
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 End

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tShippingInstH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tShippingInstH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		//荷主
		cb.query().queryTShippingInstH().setClientId_Equal(clientId);

		//センタ
		cb.query().queryTShippingInstH().setCenterId_Equal(centerId);

		//作業日
		if ("0".equals(tShippingInstH.getTakingShippingFlg())) {
			cb.query().queryTShippingInstH().setWorkDt_GreaterEqual(tShippingInstH.getDtFrom());
			cb.query().queryTShippingInstH().setWorkDt_LessEqual(tShippingInstH.getDtTo());
		}
		//出荷日
		else if ("1".equals(tShippingInstH.getTakingShippingFlg())) {
			cb.query().queryTShippingInstH().setShippingDt_GreaterEqual(tShippingInstH.getDtFrom());
			cb.query().queryTShippingInstH().setShippingDt_LessEqual(tShippingInstH.getDtTo());
		}

		//配送コースCD
		// [C-EC-013] 配送コースマスタ登録エラーのデータも検索する 2015.01.30 kawana Start
		cb.query().queryTShippingInstH().setDeliveryCourseCd_PrefixSearch(tShippingInstH.getDeliveryCourseCd());
		// [C-EC-013] 配送コースマスタ登録エラーのデータも検索する 2015.01.30 kawana End

		//運送業者
		cb.query().queryTShippingInstH().queryMDeliveryCourse().queryMCarrier().setCarrierCd_Equal(tShippingInstH.getCarrierCd());

		//出庫指示バッチNo.
		cb.query().queryTShippingInstH().setPickingBatchNo_Equal(tShippingInstH.getPickingBatchNo());

		//WMS出荷伝票No.
		cb.query().queryTShippingInstH().setShippingSlipNo_PrefixSearch(tShippingInstH.getShippingSlipNo());

		//納品先CD
		cb.query().queryTShippingInstH().queryMCustomerBySupplyCustomerId().setCustomerCd_PrefixSearch(tShippingInstH.getCustomerCd());

		// [品質-102-018] 商品CDは出荷指示ボディの商品CDで検索する(マスタ未登録を考慮) 2015.04.07 kawana Start
		//商品CD
		cb.query().setProductCd_Equal(tShippingInstH.getProductCd());
		// [品質-102-018] 商品CDは出荷指示ボディの商品CDで検索する(マスタ未登録を考慮) 2015.04.07 kawana End

		//顧客出荷指示No.
		cb.query().queryTShippingInstH().setClientShippingNo_PrefixSearch(tShippingInstH.getClientShippingNo());

		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana Start
		//出庫作業No.
		cb.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingWorkNo_LikeSearch(tShippingInstH.getPickingWorkNo(), new LikeSearchOption().likeSuffix());
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana End

		//欠品フラグ
		if ("1".equals(tShippingInstH.getStockOutFlg())) {
			// 欠品のみ

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
			cb.query().setStockOutNum_GreaterThan(WCC.ZERO);
			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
		}

		//出荷ステータス
		cb.query().queryTShippingInstH().setShippingStatus_Equal(tShippingInstH.getShippingStatus());

		//緊急のみ
		if (tShippingInstH.isEmergencyFlg$1()) {
			cb.query().queryTShippingInstH().setEmergencyFlg_Equal(tShippingInstH.getEmergencyFlg());
		}

		// [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
		if (!CU.isNullOrEmpty(tShippingInstH.getCancelDisplay())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.CancelDataDisplay cancelDisplay = CDef.CancelDataDisplay.codeOf(tShippingInstH.getCancelDisplay());
			if (cancelDisplay == CDef.CancelDataDisplay.$0) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				cb.query().queryTShippingInstH().setShippingStatus_NotEqual_$90();
			}
		}
		// [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

		//ORDER BY

		//荷主CD
		cb.query().queryTShippingInstH().queryMClient().addOrderBy_ClientCd_Asc();

		//センタCD
		cb.query().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();

		//作業日
		cb.query().queryTShippingInstH().addOrderBy_WorkDt_Asc();

		//出荷日
		cb.query().queryTShippingInstH().addOrderBy_ShippingDt_Asc();

		//納品先CD
		cb.query().queryTShippingInstH().addOrderBy_SupplyCustomerCd_Asc();

		//顧客出荷指示No.
		cb.query().queryTShippingInstH().addOrderBy_ClientShippingNo_Asc();

		//WMS出荷伝票No.
		cb.query().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc();

		//出庫指示バッチNo.
		cb.query().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();

		//納品予定日
		cb.query().queryTShippingInstH().addOrderBy_DelivPlanDt_Asc();

		//行No.
		cb.query().addOrderBy_LineNo_Asc();

		//商品CD
		cb.query().addOrderBy_ProductCd_Asc();

		//===== 出荷指示ボデー検索実行 =====
		// 検索実行
		result = selectPage(tShippingInstBBhv, cb, paging);

		tShippingInstBBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				//subCB.setupSelect_TStock().withMLocation();
				subCB.setupSelect_TStock().withMLocation().withMZone().withMWarehouse();
				subCB.setupSelect_TStock().withTLot();
				subCB.setupSelect_TStock().withTStoreNo();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
//				// [新ｿﾘ-024] 引当禁止フラグから出庫ボディを修正 2014.11.21 wangb Start
//				subCB.setupSelect_TStock().withMLocation().withMCenterClassDtlByAllocNgFlg(getCenterClassCondition()).withVDict(cultureId);
//				// [新ｿﾘ-024] 引当禁止フラグから出庫ボディを修正 2014.11.21 wangb End
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start

				// [検査-225] 出荷実績訂正に修正した情報は伝票別出荷一覧画面と出荷指示明細画面に表示するため、訂正した預託と在庫区分を追加 2014.12.08 許 Start
				subCB.setupSelect_TStock().withMCustomer();
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 Start
				subCB.setupSelect_TStock().withMStockType();
//				subCB.setupSelect_TStock().withMStockType().withVDict(cultureId);
// レスポンス対策 不要な取得を削除 koseki 2016-01-26 End
				// [検査-225] 出荷実績訂正に修正した情報は伝票別出荷一覧画面と出荷指示明細画面に表示するため、訂正した預託と在庫区分を追加 2014.12.08 許 End

				subCB.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
				subCB.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
				subCB.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
				subCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
				// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa Stert
				subCB.specify().derivedTPackingBList().max(new SubQuery<TPackingBCB>() {
					@Override
					public void query(TPackingBCB subCB) {
						subCB.specify().specifyTPackingH().columnMixedFlg();
					}
				}, TPickingB.ALIAS_mixedFlg);
				// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa End
			}
		});

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
		} else {

			  // [Ver3.0] unit of measure対応 2017.11.20 駱 Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
			tShippingInstBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
				@Override
				public void handle(LoaderOfTShippingInstB loader) {
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
			for (TShippingInstB instB : result) {
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, instB.getMProduct());
				// 商品最小荷姿単位名称
				instB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, instB.getMProduct()));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			}
		    // [Ver3.0] unit of measure対応 2017.11.20 駱 End

			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
			// 区分値マスタより取得
			BClassDtlCB cbCCD = bClassDtlBhv.newConditionBean();
			cbCCD.specify().columnClassDtlCd();
			cbCCD.specify().columnDictId();
			cbCCD.setupSelect_BClass();
			cbCCD.specify().specifyBClass().columnClassCd();
			cbCCD.setupSelect_VDict(getCultureId());
			cbCCD.specify().specifyVDict().columnDictNm();
			List<String> classCdList = new ArrayList<String>();
			classCdList.add("SHIPPING_STATUS");
			classCdList.add("DELIV_TZ");
			classCdList.add("SHIPPING_STOP_FLG");
			// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa Stert
			classCdList.add("MIXED_FLG");
			// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa End
			cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
			cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
			cbCCD.query().addOrderBy_ClassDtlCd_Asc();
			List<BClassDtl> bClassList = bClassDtlBhv.selectList(cbCCD);
			Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

			// 区分値をMapに変換
			String classCd = "";
			Map<String, String> dtlMap = null;
			for (BClassDtl bClassDtl : bClassList) {
				if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
					dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
				}else{
					if (classCd.length() > 0) {
						bClassMap.put(classCd, dtlMap);
					}
					dtlMap = new HashMap<String, String>();
					dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
					classCd = bClassDtl.getBClass().getClassCd();
				}
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
			// 処理区分マスタより取得
			MProcessTypeCB cbPT = mProcessTypeBhv.newConditionBean();
			cbPT.specify().columnProcessTypeCd();
			cbPT.specify().columnDictId();
			cbPT.setupSelect_VDict(getCultureId());
			cbPT.specify().specifyVDict(getCultureId()).columnDictNm();
			cbPT.query().addOrderBy_ProcessTypeCd_Asc();
			List<MProcessType> processTypeList = mProcessTypeBhv.selectList(cbPT);

			classCd = "PROCESS_TYPE";
			dtlMap = new HashMap<String, String>();
			for (MProcessType mProcessType : processTypeList) {
				//[ON推-1.1.4-CT-111]CT指摘の修正対応 2016.06.14 chou Add Start
				dtlMap.put(mProcessType.getProcessTypeCd() , mProcessType.getVDict() == null ? "" : mProcessType.getVDict().getDictNm());
				//[ON推-1.1.4-CT-111]CT指摘の修正対応 2016.06.14 chou Add End
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}

			// 在庫区分マスタより取得
			MStockTypeCB cbST = mStockTypeBhv.newConditionBean();
			cbST.specify().columnStockTypeCd();
			cbST.specify().columnDictId();
			cbST.setupSelect_VDict(getCultureId());
			cbST.specify().specifyVDict(getCultureId()).columnDictNm();
			cbST.query().addOrderBy_StockTypeCd_Asc();
			List<MStockType> stockTypeList = mStockTypeBhv.selectList(cbST);

			classCd = "STOCK_TYPE";
			dtlMap = new HashMap<String, String>();
			for (MStockType mStockType : stockTypeList) {
					dtlMap.put(mStockType.getStockTypeCd() , mStockType.getVDict().getDictNm());
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}

			// メッセージマスタの事前取得
			Map<String, String> mapMessage = new HashMap<String, String>();
			for (TShippingInstB tShippingInstB : result) {
				if (!CU.isNullOrEmpty(tShippingInstB.getErrorMessageCd())) {
					if (!mapMessage.containsKey(tShippingInstB.getErrorMessageCd())) {
						mapMessage.put(tShippingInstB.getErrorMessageCd(), null);
					}
				}
				if (!CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getErrorMessageCd())) {
					if (!mapMessage.containsKey(tShippingInstB.getTShippingInstH().getErrorMessageCd())) {
						mapMessage.put(tShippingInstB.getTShippingInstH().getErrorMessageCd(), null);
					}
				}
			}
			if (mapMessage.size() > 0) {
				BMessageCB cbM = bMessageBhv.newConditionBean();
				cbM.specify().columnMessageCd();
				cbM.specify().columnMessageNm();
				cbM.query().setCultureId_Equal(getCultureId());
				cbM.query().setMessageCd_InScope(mapMessage.keySet());
				cbM.query().addOrderBy_MessageCd_Asc();
				List<BMessage> messageList = bMessageBhv.selectList(cbM);
				for (BMessage bMessage : messageList) {
					mapMessage.put(bMessage.getMessageCd(), bMessage.getMessageNm());
				}

			}

			// 区分値マスタの名称の設定
			for (TShippingInstB tShippingInstB : result) {
				if (bClassMap.containsKey("SHIPPING_STATUS")) {
					if (bClassMap.get("SHIPPING_STATUS").containsKey(tShippingInstB.getTShippingInstH().getShippingStatus())) {
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
						if (tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus() == null) {
							tShippingInstB.getTShippingInstH().setBClassDtlByShippingStatus(new BClassDtl());
						}
						if (tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus().getVDict() == null) {
							tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus().setVDict(new VDict());
						}

						tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus().getVDict().setDictNm(bClassMap.get("SHIPPING_STATUS").get(tShippingInstB.getTShippingInstH().getShippingStatus()));
					}
				}
				if (bClassMap.containsKey("DELIV_TZ")) {
					if (bClassMap.get("DELIV_TZ").containsKey(tShippingInstB.getTShippingInstH().getDelivTz())) {
						if (tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz() == null) {
							tShippingInstB.getTShippingInstH().setBClassDtlByDelivTz(new BClassDtl());
						}
						if (tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz().getVDict() == null) {
							tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz().setVDict(new VDict());
						}
						tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz().getVDict().setDictNm(bClassMap.get("DELIV_TZ").get(tShippingInstB.getTShippingInstH().getDelivTz()));
					}
				}
				// [品質検査対応][Ver3.1][#5705]納品先が削除済みの場合にnullで落ちないようにする 2018.11.22 matsumoto Start
				// 納品先の出荷停止フラグが0の場合、届先の出荷停止フラグを設定
				if (CU.nullToStr(tShippingInstB.getTShippingInstH().chaseMCustomerBySupplyCustomerId().getShippingStopFlg()).equals("0")) {
					tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().setShippingStopFlg(tShippingInstB.getTShippingInstH().getMCustomerByDelivCustomerId().getShippingStopFlg());
				}
				// [品質検査対応][Ver3.1][#5705]納品先が削除済みの場合にnullで落ちないようにする 2018.11.22 matsumoto End
				if (bClassMap.containsKey("SHIPPING_STOP_FLG")) {
					if (tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId() != null) {
						if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getShippingStopFlg())) {
							if (tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg() == null) {
								tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().setBClassDtlByShippingStopFlg(new BClassDtl());
							}
							if (tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict() == null) {
								tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().setVDict(new VDict());
							}
							tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict().setDictNm(bClassMap.get("SHIPPING_STOP_FLG").get(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getShippingStopFlg()));
						}
					}
					if (tShippingInstB.getMProduct() != null) {
						if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(tShippingInstB.getMProduct().getShippingStopFlg())) {
							if (tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg() == null) {
								tShippingInstB.getMProduct().setBClassDtlByShippingStopFlg(new BClassDtl());
							}
							if (tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg().getVDict() == null) {
								tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg().setVDict(new VDict());
							}
							tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg().getVDict().setDictNm(bClassMap.get("SHIPPING_STOP_FLG").get(tShippingInstB.getMProduct().getShippingStopFlg()));
							// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
						}
					}
				}
				if (bClassMap.containsKey("PROCESS_TYPE")) {
					if (bClassMap.get("PROCESS_TYPE").containsKey(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd())) {
						if (tShippingInstB.getTShippingInstH().getMProcessType().getVDict() == null) {
							tShippingInstB.getTShippingInstH().getMProcessType().setVDict(new VDict());
						}
						tShippingInstB.getTShippingInstH().getMProcessType().getVDict().setDictNm(bClassMap.get("PROCESS_TYPE").get(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd()));
					}
				}
				// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa Stert
				if (bClassMap.containsKey("STOCK_TYPE") || bClassMap.containsKey("MIXED_FLG")) {
					// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa End
					if (tShippingInstB.getMStockType() != null) {
						if (bClassMap.get("STOCK_TYPE").containsKey(tShippingInstB.getMStockType().getStockTypeCd())) {
							if (tShippingInstB.getMStockType().getVDict() == null) {
								tShippingInstB.getMStockType().setVDict(new VDict());
							}
							tShippingInstB.getMStockType().getVDict().setDictNm(bClassMap.get("STOCK_TYPE").get(tShippingInstB.getMStockType().getStockTypeCd()));
						}
					}
					if (tShippingInstB.getTPickingBList().size() > 0) {
						for (TPickingB tPickingB : tShippingInstB.getTPickingBList()) {
							// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
							if (tPickingB.getTStock() != null) {
								if (bClassMap.get("STOCK_TYPE").containsKey(tPickingB.getTStock().getMStockType().getStockTypeCd())) {
									if (tPickingB.getTStock().getMStockType().getVDict() == null) {
										tPickingB.getTStock().getMStockType().setVDict(new VDict());
									}
									tPickingB.getTStock().getMStockType().getVDict().setDictNm(bClassMap.get("STOCK_TYPE").get(tPickingB.getTStock().getMStockType().getStockTypeCd()));
								}
							}
							// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
							// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa Stert
							if (bClassMap.get("MIXED_FLG").containsKey(tPickingB.getMixedFlg())) {
								tPickingB.setMixedFlgNm(bClassMap.get("MIXED_FLG").get(tPickingB.getMixedFlg()));
							}
							// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa End
						}
					}
				}

				// エラーメッセージ名称の取得
				if (mapMessage.size() > 0 && !CU.isNullOrEmpty(tShippingInstB.getErrorMessageCd())) {
					tShippingInstB.setBodyMessageNm(mapMessage.get(tShippingInstB.getErrorMessageCd()));
				}
				if (mapMessage.size() > 0 && !CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getErrorMessageCd())) {
					tShippingInstB.getTShippingInstH().setHeadMessageNm(mapMessage.get(tShippingInstB.getTShippingInstH().getErrorMessageCd()));
				}
			}

//			// [SK2-005] リスト発行状況が表示されない問題を改修 2014.12.10 kawana Start
//			// 帳票発行フラグの初期値を取得
//			MCenterClass listOutFlgClassC = new MCenterClass();
//			MCenterClassDtl listOutFlgClassDtlC = new MCenterClassDtl();
//			listOutFlgClassC.setClassCd("LIST_OUT_FLG");
//			listOutFlgClassDtlC.setClassDtlCd("0");
//			MCenterClassDtl listOutFlgDefaultClass = classLogic.getUkEntityWithDeletedCheck(listOutFlgClassC, listOutFlgClassDtlC);
//
//			// 送り状データ出力フラグの初期値を取得
//			MCenterClass invoiceCreateFlgClassC = new MCenterClass();
//			MCenterClassDtl invoiceCreateFlgClassDtlC = new MCenterClassDtl();
//			invoiceCreateFlgClassC.setClassCd("INVOICE_CREATE_FLG");
//			invoiceCreateFlgClassDtlC.setClassDtlCd("0");
//			MCenterClassDtl invoiceCreateFlgDefaultClass = classLogic.getUkEntityWithDeletedCheck(invoiceCreateFlgClassC, invoiceCreateFlgClassDtlC);
//			// [SK2-005] リスト発行状況が表示されない問題を改修 2014.12.10 kawana End
//
//			for (TShippingInstB tShippingInstB : result) {
//				// エラーメッセージCDの取得
//				String errorMessageCd = tShippingInstB.getErrorMessageCd();
//				if (!CU.isNullOrEmpty(errorMessageCd)) {
//					// メッセージCDの設定
//					BMessage message = new BMessage();
//					message.setMessageCd(errorMessageCd);
//					message = messageLogic.getUkEntity(message);
//					if (message != null) {
//						tShippingInstB.setBodyMessageNm(message.getMessageNm());
//					}
//				}
//
//				if (tShippingInstB != null) {
//					TShippingInstH tShippingInstHMessage = tShippingInstB.getTShippingInstH();
//					String headErrorMessageCd = null;
//					if (tShippingInstHMessage != null) {
//						headErrorMessageCd = tShippingInstHMessage.getErrorMessageCd();
//					}
//					if (!CU.isNullOrEmpty(headErrorMessageCd)) {
//						// メッセージCDの設定
//						BMessage message = new BMessage();
//						message.setMessageCd(headErrorMessageCd);
//						message = messageLogic.getUkEntity(message);
//						if (message != null) {
//							tShippingInstHMessage.setHeadMessageNm(message.getMessageNm());
//						}
//					}
//					tShippingInstB.setTShippingInstH(tShippingInstHMessage);
//				}
//
//				// [SK2-005] リスト発行状況が表示されない問題を改修 2014.12.10 kawana Start
//				TShippingInstH shippingInstH = tShippingInstB.chaseTShippingInstH();
//				TAllocInstH allocInstH = shippingInstH.chaseTAllocInstH();
//				TPickingH pickingH = allocInstH.chaseTPickingH();
//				TPickingR pickingR = pickingH.chaseTPickingRAsOne();
//				boolean modified = false;
//				// オーダーピッキングリスト発行フラグ
//				if (pickingR.getMCenterClassDtlByOplOutFlg() == null) {
//					pickingR.setOplOutFlg_$0();
//					pickingR.setMCenterClassDtlByOplOutFlg(listOutFlgDefaultClass);
//					modified = true;
//				}
//				// トータルピッキングリスト発行フラグ
//				if (pickingR.getMCenterClassDtlByTplOutFlg() == null) {
//					pickingR.setTplOutFlg_$0();
//					pickingR.setMCenterClassDtlByTplOutFlg(listOutFlgDefaultClass);
//					modified = true;
//				}
//				// 摘み取りリスト発行フラグ
//				if (pickingR.getMCenterClassDtlByPlOutFlg() == null) {
//					pickingR.setPlOutFlg_$0();
//					pickingR.setMCenterClassDtlByPlOutFlg(listOutFlgDefaultClass);
//					modified = true;
//				}
//				// 種蒔きリスト発行フラグ
//				if (pickingR.getMCenterClassDtlBySlOutFlg() == null) {
//					pickingR.setSlOutFlg_$0();
//					pickingR.setMCenterClassDtlBySlOutFlg(listOutFlgDefaultClass);
//					modified = true;
//				}
//				// 納品明細書発行フラグ
//				if (pickingR.getMCenterClassDtlByPackingOutFlg() == null) {
//					pickingR.setPackingOutFlg_$0();
//					pickingR.setMCenterClassDtlByPackingOutFlg(listOutFlgDefaultClass);
//					modified = true;
//				}
//				// 送り状データ出力フラグ
//				if (pickingR.getMCenterClassDtlByInvoiceCreateFlg() == null) {
//					pickingR.setInvoiceCreateFlg_$0();
//					pickingR.setMCenterClassDtlByInvoiceCreateFlg(invoiceCreateFlgDefaultClass);
//					modified = true;
//				}
//
//				// 変更がある場合は再設定
//				if (modified) {
//					pickingH.setTPickingRAsOne(pickingR);
//					allocInstH.setTPickingH(pickingH);
//					shippingInstH.setTAllocInstH(allocInstH);
//					tShippingInstB.setTShippingInstH(shippingInstH);
//				}
//
//				// 積込リスト発行
//				if (CU.isNullOrEmpty(tShippingInstB.getStwOutFlg())) {
//					tShippingInstB.setStwOutFlg(listOutFlgDefaultClass.getVDict().getDictNm());
//				}
//				// [SK2-005] リスト発行状況が表示されない問題を改修 2014.12.10 kawana End
//			}
		}

		PagingResultBean<TShippingInstB> lstShippingInstB = new PagingResultBean<TShippingInstB>();

		for (int i = 0; i < result.size(); i++) {

			TShippingInstB tShippingInstB = new TShippingInstB();
			// [SK2-004] キャンセル時の欠品数計算を見直します。 2014.12.08 KI Start

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutNum設定処理を削除) 2018.07.27 kawana Delete

			if (result.get(i).getTPickingBList().size() > 1) {

				for (int j = 0; j < result.get(i).getTPickingBList().size(); j++) {

					tShippingInstB = result.get(i).clone();

					TPickingB tPickingB = new TPickingB();
					List<TPickingB> tPickingBList = new ArrayList<TPickingB>();

					tPickingB = result.get(i).getTPickingBList().get(j).clone();
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
					tPickingB.getTStock().getMLocation().setLocationNm(result.get(i).getTPickingBList().get(j).getTStock().getMLocation().getLocationNm());
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
					tPickingB.setPickingNum(result.get(i).getTPickingBList().get(j).getPickingNum());
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
					tPickingB.getTStock().getTLot().setLot(result.get(i).getTPickingBList().get(j).getTStock().getTLot().getLot());
					tPickingB.getTStock().getTLot().setLimitDt(result.get(i).getTPickingBList().get(j).getTStock().getTLot().getLimitDt());
					tPickingB.getTStock().getTStoreNo().setStoreLabelNo(result.get(i).getTPickingBList().get(j).getTStock().getTStoreNo().getStoreLabelNo());
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
					// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa Stert
					tPickingB.setMixedFlg(result.get(i).getTPickingBList().get(j).getMixedFlg());
					// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa End
					tPickingBList.add(tPickingB);
					tShippingInstB.setTPickingBList(tPickingBList);

					if (j > 0) {
						tShippingInstB.setInstNum(null);
						tShippingInstB.setAllocNum(null);
						tShippingInstB.setStockOutNum(null);
						tShippingInstB.setLot(null);
						tShippingInstB.setLimitDt(null);
						// [SK2-036] 積込リスト発行は先頭行以外も同じものを表示するため空の設定を削除 2014.12.15 kawana
						tShippingInstB.setBodyMessageNm(null);
					}

					lstShippingInstB.add(tShippingInstB);
				}
			} else {
				lstShippingInstB.add(result.get(i).clone());
			}
		}

		return lstShippingInstB;
	}
}
// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End