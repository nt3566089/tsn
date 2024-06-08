package com.oneslogi.ht.wms.logic.shipping;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;


/**
 * 積込検品データチェックロジッククラス
 */
public class ShippingLoadingInspectionCheckLogic extends AbstractWmsLogic {

	@Inject
	TPackingHBhv tPackingHBhv;
	@Inject
	TAllocInstHBhv tAllocInstHBhv;
	@Inject
	TPickingBBhv tPickingBBhv;
	@Inject
	TPickingBBhv tPickingHBhv;
	@Inject
	TShippingInstHBhv tShippingInstHBhv;
	@Inject
	TShippingInstBBhv tShippingInstBBhv;
	//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 Start
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 End

	/**
	 * 貨物追跡No存在チェック
	 * @param wHtLoading 積込検品ワークテーブル
	 * @return true:データ存在;false:データ不在
	 */
	public TPackingH checkExistCarrierTraceNum(WHtLoading wHtLoading, String traceOrPackingNo){
		TPackingHCB tPackingHCb = tPackingHBhv.newMyConditionBean();
		tPackingHCb.setupSelect_TAllocInstH();
		tPackingHCb.setupSelect_TAllocInstH().withMDeliveryCourse();
		tPackingHCb.query().setCenterId_Equal(wHtLoading.getCenterId());
		tPackingHCb.query().setClientId_Equal(wHtLoading.getClientId());
		tPackingHCb.query().setCarrierTraceNum_Equal(traceOrPackingNo);
		tPackingHCb.query().addOrderBy_LoadingFlg_Asc();
		tPackingHCb.query().addOrderBy_PackingHId_Asc();
		tPackingHCb.fetchFirst(1);

		TPackingH tPackingH = tPackingHBhv.selectEntity(tPackingHCb);
		return tPackingH;
	}

	/**
	 * 出荷梱包No存在チェック
	 * @param wHtLoading 積込検品ワークテーブル
	 * @param traceOrPackingNo 読み込んだ貨物追跡Noまたは出荷梱包No
	 * @return true:データ存在;false:データ不在
	 */
	public TPackingH checkExistShippingPackingNo(WHtLoading wHtLoading, String traceOrPackingNo){

		TPackingHCB tPackingHCb = tPackingHBhv.newMyConditionBean();
		tPackingHCb.setupSelect_TAllocInstH();
		tPackingHCb.setupSelect_TAllocInstH().withMDeliveryCourse();
		tPackingHCb.query().setCenterId_Equal(wHtLoading.getCenterId());
		tPackingHCb.query().setClientId_Equal(wHtLoading.getClientId());
		tPackingHCb.query().setShippingPackingNo_Equal(traceOrPackingNo);

		TPackingH tPackingH = tPackingHBhv.selectEntity(tPackingHCb);
		return tPackingH;
	}

	/**
	 * 設定した配送コースと梱包データの配送コース同じかチェック
	 * @param wHtLoading 積込検品ワークテーブル
	 * @param mDeliveryCourse 配送コース
	 * @return
	 */
	public boolean checkDeliveryCourse(WHtLoading wHtLoading, MDeliveryCourse mDeliveryCourse){

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();
		cb.query().setCenterId_Equal(wHtLoading.getCenterId());
		cb.query().setClientId_Equal(wHtLoading.getClientId());
		cb.query().setCarrierTraceNum_Equal(wHtLoading.getCarrierTraceNum());
		cb.query().setShippingPackingNo_Equal(wHtLoading.getShippingPackingNo());
		cb.query().queryTAllocInstH().setDeliveryCourseId_Equal(mDeliveryCourse.getDeliveryCourseId());
		cb.query().setLoadingFlg_Equal_$0();
		cb.query().addOrderBy_PackingHId_Asc();
		cb.fetchFirst(1);
		TPackingH packingH = tPackingHBhv.selectEntity(cb);
		if(packingH != null){
			return true;
		}
		// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #524]対応 エラーメッセージ設定処理外す 2016.12.21 delete nayzaw
		return false;
	}

	/**
	 * 読み込んだデータと同じ出荷日、配送コースで
	 * 出荷ステータスが出庫指示済以降のすべてのデータが
	 * 積込検品完了かチェック
	 * @param wHtLoading 積込検品ワークテーブル
	 * @return true:全件完了;false:未完了件存在
	 */
	public boolean checkSameDeliveryDataComplete(WHtLoading wHtLoading){

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();
		cb.query().setCenterId_Equal(wHtLoading.getCenterId());
		cb.query().setClientId_Equal(wHtLoading.getClientId());
		cb.query().setCarrierTraceNum_Equal(wHtLoading.getCarrierTraceNum());
		cb.query().setShippingPackingNo_Equal(wHtLoading.getShippingPackingNo());
		cb.query().setLoadingFlg_Equal_$0();
		cb.query().addOrderBy_PackingHId_Asc();
		cb.fetchFirst(1);

		TPackingH tPackingH = tPackingHBhv.selectEntity(cb);

		List<String> pickingStatusList = Arrays.asList(new String[] { "25", "30", "35", "40", "45", "50","55","90","99" });

		TPackingHCB cb1 = tPackingHBhv.newMyConditionBean();
		cb1.setupSelect_TAllocInstH();
		cb1.setupSelect_TAllocInstH().withMDeliveryCourse();
		cb1.setupSelect_TPickingH();
		cb1.query().setCenterId_Equal(wHtLoading.getCenterId());
		cb1.query().setClientId_Equal(wHtLoading.getClientId());
		cb1.query().queryTAllocInstH().setShippingDt_Equal(tPackingH.getTAllocInstH().getShippingDt());
		cb1.query().queryTAllocInstH().setDeliveryCourseId_Equal(tPackingH.getTAllocInstH().getDeliveryCourseId());
		cb1.query().queryTPickingH().setPickingStatus_InScope(pickingStatusList);
		cb1.query().setLoadingFlg_Equal_$0();
		cb1.query().setPackingHId_NotEqual(tPackingH.getPackingHId());

		List<TPackingH> lstPackingH = tPackingHBhv.selectList(cb1);
		if(lstPackingH.size() > 0){
			// 未終了
			return false;
		}
		// 終了
		return true;
	}

	//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 Start
	/**
	 * <h2>出庫作業Noのチェックを行う。</h2>
	 * <pre>
	 *  引数を条件に、出庫ヘッダデータを取得し、検索対象が見つからない場合、falseを返す。
	 *
	 *  引数を条件に、引当指示ボディデータを取得し、検索対象が見つからない場合、falseを返す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】
	 * ・{@link ShippingLogic#checkShippingAllogNgFlg(TPickingH, List) 商品出荷停止及び引当禁止のチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tPackingH 出荷梱包ヘッダ
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingWorkNo(TPackingH tPackingH) {

		//出庫ヘッダ情報の取得
		TPackingHCB packingHCb = tPackingHBhv.newMyConditionBean();
		packingHCb.setupSelect_TPickingH();
		packingHCb.checkInvalidQuery();
		packingHCb.query().queryTPickingH().setCenterId_Equal(tPackingH.getCenterId());
		packingHCb.query().queryTPickingH().setClientId_Equal(tPackingH.getClientId());
		//[ver3.0][#2920] 検索条件の出庫ヘッダIDに梱包ヘッダIDがセットされていた不具合を修正 2017.11.30 miyabe Start
		packingHCb.query().queryTPickingH().setPickingHId_Equal(tPackingH.getPickingHId());
		//[ver3.0][#2920] 検索条件の出庫ヘッダIDに梱包ヘッダIDがセットされていた不具合を修正 2017.11.30 miyabe End
		// [#6735][v3.1] ケース出荷のみ伝票で該当データなしエラーが発生(混載フラグの検索条件を削除) 2019.10.04 kawana Delete
		List<TPackingH> packingHList = tPackingHBhv.selectList(packingHCb);

		if (packingHList.size() < 1) {

			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		TPickingH tPickingH = packingHList.get(0).getTPickingH();

        // 引当指示ボディ取得
		TAllocInstBCB allocInstBCB = tAllocInstBBhv.newMyConditionBean();
		allocInstBCB.query().setAllocInstHId_Equal(tPickingH.getAllocInstHId());
		List<TAllocInstB> lstTAllocInstB = tAllocInstBBhv.selectList(allocInstBCB);
		if(lstTAllocInstB.size() == 0){
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		//出荷停止フラグのチェック
		if(!shippingLogic.checkShippingAllogNgFlg(tPickingH, lstTAllocInstB)){
			return false;
		}
		return true;
	}

	/**
	 * <h2>出荷梱包Noのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、引当指示ボディデータを取得し、索対象が見つからない場合、falseを返す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】
	 * ・{@link ShippingLogic#checkShippingNgFlgByPackingNo(TPackingH, List) 商品出荷停止チェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tPackingH 出荷梱包ヘッダ
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkShippingPackingNo(TPackingH tPackingH){
		// 引当指示ボディ取得
		TAllocInstBCB allocInstBCB = tAllocInstBBhv.newMyConditionBean();
		allocInstBCB.query().setAllocInstHId_Equal(tPackingH.getAllocInstHId());
		List<TAllocInstB> lstTAllocInstB = tAllocInstBBhv.selectList(allocInstBCB);
		if(lstTAllocInstB.size() == 0){
			getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		// [#5439][v3.1] ロケーションの引当禁止チェックを削除 2018.10.24 kawana Start
		//出荷停止フラグのチェック
		if (!shippingLogic.checkShippingNgFlgByPackingNo(tPackingH, lstTAllocInstB)) {
			// [#5439][v3.1] ロケーションの引当禁止チェックを削除 2018.10.24 kawana End

			return false;
		}

		return true;
	}
	//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 End

}
