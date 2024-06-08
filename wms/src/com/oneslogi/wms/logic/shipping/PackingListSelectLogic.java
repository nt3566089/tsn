package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.AppCDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 梱包明細一覧データ取得ロジッククラス
 */
public class PackingListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>梱包明細一覧データ取得。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから梱包明細一覧データを取得する。
	 * 以下のチェックを行う。チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する。
	 * ・０件チェック
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・梱包ボディ（ベース）
	 * ・梱包ボディ - 梱包ヘッダ
	 * ・荷主マスタ - 梱包ヘッダ
	 * ・センタマスタ - 梱包ヘッダ
	 * ・引当指示ヘッダ - 梱包ヘッダ
	 * ・出庫ヘッダ - 引当指示ヘッダ
	 * ・取引先マスタ - 引当指示ヘッダ(納品先ID)
	 * ・取引先マスタ - 引当指示ヘッダ(届先ID)
	 * ・配送コースマスタ - 引当指示ヘッダ
	 * ・運送業者マスタ - 配送コースマスタ
	 * ・引当指示ボディ - 梱包ボディ -
	 * ・商品マスタ - 引当指示ボディ
	 *
	 * 【パラメータの使用項目】
	 *  (梱包ヘッダ)
	 *  ・センタCD
	 *  ・荷主CD
	 *  ・作業日/出荷日/納品指定日
	 *  ・日付(From)
	 *  ・日付(To)
	 *  ・配送コースCD
	 *  ・運送業者ID
	 *  ・納品先CD
	 *  ・届先CD
	 *  ・貨物追跡№
	 *  ・顧客出荷指示No.
	 * </pre>
	 * @param tPackingH 検索条件
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<TPackingB> 梱包ボディデータのリスト
	 */
	public PagingResultBean<TPackingB> select(TPackingH tPackingH, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TPackingB> result = null;

		//==== 梱包ボディデータ取得 =====

		//検索条件の設定
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		//梱包ヘッダ
		cb.setupSelect_TPackingH();
		//荷主マスタ
		cb.setupSelect_TPackingH().withMClient();
		//センタマスタ
		cb.setupSelect_TPackingH().withMCenter();
		//引当指示ヘッダ
		cb.setupSelect_TPackingH().withTAllocInstH();
		//荷材マスタ
		cb.setupSelect_TPackingH().withMBox();
		//出庫ヘッダ
		cb.setupSelect_TPackingH().withTPickingH();
		//納品先
		cb.setupSelect_TPackingH().withTAllocInstH().withMCustomerBySupplyCustomerId();
		//届先
		cb.setupSelect_TPackingH().withTAllocInstH().withMCustomerByDelivCustomerId();
		//配送コースマスタ
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse();
		//センタ運送業者マスタ
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse().withMCarrier();
		//引当指示ボディ
		cb.setupSelect_TAllocInstB();
		//商品マスタ
		cb.setupSelect_TAllocInstB().withMProduct();
		//出庫ボディ
		cb.setupSelect_TPickingB();

		//顧客出荷指示№
		final String clientShippingNo = tPackingH.getClientShippingNo();

		cb.specify().specifyTAllocInstB().derivedTShippingInstBList().min(new SubQuery<TShippingInstBCB>() {
			@Override
			public void query(TShippingInstBCB subCb) {
			subCb.specify().specifyTShippingInstH().columnClientShippingNo();
			subCb.query().queryTShippingInstH().setClientShippingNo_LikeSearch(clientShippingNo,new LikeSearchOption().likePrefix());
			}
		}, TPackingB.ALIAS_clientShippingNo);

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tPackingH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tPackingH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		//荷主IDの設定
		cb.query().queryTPackingH().setClientId_Equal(clientId);

		//センタの設定
		cb.query().queryTPackingH().setCenterId_Equal(centerId);

		//出庫作業No.の設定
		cb.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(tPackingH.getTPickingH().getPickingWorkNo());

		//作業日の設定
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (AppCDef.TakingShippingDtFlg.$0.code().equals(tPackingH.getTakingShippingDtFlg())) {
			cb.query().queryTAllocInstB().queryTAllocInstH().setWorkDt_GreaterEqual(tPackingH.getDtFrom());
			cb.query().queryTAllocInstB().queryTAllocInstH().setWorkDt_LessEqual(tPackingH.getDtTo());
		}
		//出荷日の設定
		else if (AppCDef.TakingShippingDtFlg.$1.code().equals(tPackingH.getTakingShippingDtFlg())) {
			cb.query().queryTAllocInstB().queryTAllocInstH().setShippingDt_GreaterEqual(tPackingH.getDtFrom());
			cb.query().queryTAllocInstB().queryTAllocInstH().setShippingDt_LessEqual(tPackingH.getDtTo());
		}
		//納品日の設定
		else if (AppCDef.TakingShippingDtFlg.$2.code().equals(tPackingH.getTakingShippingDtFlg())) {
			cb.query().queryTAllocInstB().queryTAllocInstH().setDelivDt_GreaterEqual(tPackingH.getDtFrom());
			cb.query().queryTAllocInstB().queryTAllocInstH().setDelivDt_LessEqual(tPackingH.getDtTo());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		//配送コースCDの設定
		cb.query().queryTAllocInstB().queryTAllocInstH().queryMDeliveryCourse().setDeliveryCourseCd_LikeSearch(tPackingH.getDeliveryCourseCd(),new LikeSearchOption().likePrefix());

		//運送業者の設定
		cb.query().queryTAllocInstB().queryTAllocInstH().queryMDeliveryCourse().queryMCarrier().setCarrierCd_Equal(tPackingH.getCarrierCd());

		//納品先CDの設定
		cb.query().queryTAllocInstB().queryTAllocInstH().setSupplyCustomerCd_LikeSearch(tPackingH.getTAllocInstH().getSupplyCustomerCd(),new LikeSearchOption().likePrefix());

		//届先CDの設定
		cb.query().queryTAllocInstB().queryTAllocInstH().setDelivCustomerCd_LikeSearch(tPackingH.getTAllocInstH().getDelivCustomerCd(),new LikeSearchOption().likePrefix());

		//貨物追跡№の設定
		cb.query().queryTPackingH().setCarrierTraceNum_Equal(tPackingH.getCarrierTraceNum());

		// [#4550] 顧客出荷指示Noの未入力でもIn句付で検索してしまい動作が重くなる問題を修正 2018.05.11 kawana Start

		// 顧客出荷指示№を抽出
		if (!CU.isNullOrEmpty(clientShippingNo)) {

			cb.query().queryTAllocInstB().existsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
				@Override
				public void query(TShippingInstBCB tShippingInstBCB) {
					tShippingInstBCB.query().queryTShippingInstH().setClientShippingNo_LikeSearch(clientShippingNo, new LikeSearchOption().likePrefix());
				}
			});
		}

		// [#4550] 顧客出荷指示Noの未入力でもIn句付で検索してしまい動作が重くなる問題を修正 2018.05.11 kawana End

		//ソート条件
		//出庫作業№
		cb.query().queryTPackingH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();

		//出荷梱包№
		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();

		//梱包ボディID
		cb.query().addOrderBy_PackingBId_Asc();

		//===== 梱包ボデ検索実行 =====
		// 検索実行
		result = selectPage(tPackingBBhv, cb, paging);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
		} else {
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
			classCdList.add("PICKING_STATUS");
			classCdList.add("MIXED_FLG");
			classCdList.add("LOADING_FLG");
			cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
			cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
			cbCCD.query().addOrderBy_ClassDtlCd_Asc();
			List<BClassDtl> bClassList = bClassDtlBhv.selectList(cbCCD);
			Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

			// センタ区分値をMapに変換
			String classCd = "";
			Map<String, String> dtlMap = null;
			for (BClassDtl mCenterClassDtl : bClassList) {
				if (classCd.equals(mCenterClassDtl.getBClass().getClassCd())) {
					dtlMap.put(mCenterClassDtl.getClassDtlCd() , mCenterClassDtl.getVDict().getDictNm());
				}else{
					if (classCd.length() > 0) {
						bClassMap.put(classCd, dtlMap);
					}
					dtlMap = new HashMap<String, String>();
					dtlMap.put(mCenterClassDtl.getClassDtlCd() , mCenterClassDtl.getVDict().getDictNm());
					classCd = mCenterClassDtl.getBClass().getClassCd();
				}
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}

			// 区分値マスタの名称の設定
			for (TPackingB tPackingB : result) {
				if (bClassMap.containsKey("PICKING_STATUS")) {
					if (bClassMap.get("PICKING_STATUS").containsKey(tPackingB.getTPackingH().getTPickingH().getPickingStatus())) {
						if (tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus() == null) {
							tPackingB.getTPackingH().getTPickingH().setBClassDtlByPickingStatus(new BClassDtl());
						}
						if (tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus().getVDict() == null) {
							tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus().setVDict(new VDict());
						}

						tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus().getVDict().setDictNm(bClassMap.get("PICKING_STATUS").get(tPackingB.getTPackingH().getTPickingH().getPickingStatus()));
					}
				}

				// [#248][2.1.0-CT-047]混載フラグと積込フラグを追加 2016.11.11 shimizu Start
				//混載フラグ
				if (bClassMap.containsKey("MIXED_FLG")) {
					if (bClassMap.get("MIXED_FLG").containsKey(tPackingB.getTPackingH().getMixedFlg())) {
						if (tPackingB.getTPackingH().getBClassDtlByMixedFlg() == null) {
							tPackingB.getTPackingH().setBClassDtlByMixedFlg(new BClassDtl());
						}
						if (tPackingB.getTPackingH().getBClassDtlByMixedFlg().getVDict() == null) {
							tPackingB.getTPackingH().getBClassDtlByMixedFlg().setVDict(new VDict());
						}

						tPackingB.getTPackingH().getBClassDtlByMixedFlg().getVDict().setDictNm(bClassMap.get("MIXED_FLG").get(tPackingB.getTPackingH().getMixedFlg()));
					}
				}

				//積込フラグ
				if (bClassMap.containsKey("LOADING_FLG")) {
					if (bClassMap.get("LOADING_FLG").containsKey(tPackingB.getTPackingH().getLoadingFlg())) {
						if (tPackingB.getTPackingH().getBClassDtlByLoadingFlg() == null) {
							tPackingB.getTPackingH().setBClassDtlByLoadingFlg(new BClassDtl());
						}
						if (tPackingB.getTPackingH().getBClassDtlByLoadingFlg().getVDict() == null) {
							tPackingB.getTPackingH().getBClassDtlByLoadingFlg().setVDict(new VDict());
						}

						tPackingB.getTPackingH().getBClassDtlByLoadingFlg().getVDict().setDictNm(bClassMap.get("LOADING_FLG").get(tPackingB.getTPackingH().getLoadingFlg()));
					}
				}
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
				// [#248][2.1.0-CT-047]混載フラグと積込フラグを追加 2016.11.11 shimizu End
			}
		}

		return result;
	}
}