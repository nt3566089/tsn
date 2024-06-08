package com.oneslogi.ht.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.THtComctlCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.WHtLoadingCB;
import com.oneslogi.base.dbflute.cbean.WHtSerialShippingInspCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.THtComctlBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.WHtLoadingBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialShippingInspBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.THtComctl;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusUpdateLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * 出荷共通ロジッククラス
 */
public class ShippingLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	/* 出荷検品ワーク     */
	@Inject
	private WHtShippingBhv wHtShippingBhv;

	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	/* HT通信制御         */
	@Inject
	private THtComctlBhv tHtComctlBhv;

	// [SK2-033] 引当指示ヘッダテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	// [SK2-033] 引当指示ヘッダテーブル取得処理の追加 2014.12.11 watanabe End

	// [SK2-033] 商品マスタテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private MProductBhv mProductBhv;
	// [SK2-033] 商品マスタテーブル取得処理の追加 2014.12.11 watanabe End

	// [SK2-033] 顧客マスタテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private MCustomerBhv mCustomerBhv;
	// [SK2-033] 顧客マスタテーブル取得処理の追加 2014.12.11 watanabe End

	// [SK2-033] 在庫テーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private TStockBhv tStockBhv;
	// [SK2-033] 在庫テーブル取得処理の追加 2014.12.11 watanabe End

	// [SK2-033] 在庫受払テーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	// [SK2-033] 在庫受払テーブル取得処理の追加 2014.12.11 watanabe End

	// [SK2-033] ロケーションマスタテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private MLocationBhv mLocationBhv;
	// [SK2-033] ロケーションマスタテーブル取得処理の追加 2014.12.11 watanabe End

	// [ON推-品向-434] 出庫ヘッダテーブル取得処理の追加 2014.12.12 watanabe Start
	@Inject
	private TPickingHBhv tPickingHBhv;
	// [ON推-品向-434] 出庫ヘッダテーブル取得処理の追加 2014.12.12 watanabe End

	/* 出荷指示ヘッダ 2015/03/31 KAI ADD */
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// [C-CWMS-0051] 出庫作業No.と出荷梱包No.の固定値取得 2015.12.09 NayZaw Start

	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

	@Inject
	private TPackingHBhv tPackingHBhv;
	// [C-CWMS-0051] 出庫作業No.と出荷梱包No.の固定値取得 2015.12.09 NayZaw End

	// [C-CWMS-0059] 積込検品ワーク追加 2016.08.21 NayZaw Start
	@Inject
	private WHtLoadingBhv wHtLoadingBhv;

	// [C-CWMS-0059] 積込検品ワーク追加 2016.08.21 NayZaw End

	// ===== 使用ロジッククラス =====

	/* 出荷ステータス更新ロジッククラス     */
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private ShipStatusCheckLogic checkLogic;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End


	// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start

	// ===== enum =====

	/** ピース・ケース区分 */
	public enum PieceCaseCls {
		PIECE,
		CASE,
		ALL
	}

	// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End

	// [エンハンス（16下）Source2.3] シリアル登録(出荷) 2017.02.10 sja Start
	@Inject
	private WHtSerialShippingInspBhv wHtSerialShippingInspBhv;
	// [エンハンス（16下）Source2.3] シリアル登録(出荷) 2017.02.10 sja End

	/**
	 * <h2>出荷検品ワークのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、以下の処理を行い、trueを返す。
	 * 対象データの出庫ステータスが"25"(出庫指示済)の場合、出庫フラグをクリアする。
	 * 対象データの出庫ステータスが"35"(ピッキング済)の場合、検品フラグをクリアする。
	 * 出荷検品ワークテーブルをクリアする。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD・出庫作業No.
	 * @param pickingStatus 出庫ステータス
	 * @return boolean true:出荷検品ワーク存在;false:出荷検品ワーク存在しない
	 */
	public boolean checkWHtShipping(WHtShipping wHtShipping, PieceCaseCls pieceCaseCls) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.setupSelect_MProduct();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start

		if (lstWHtShipping.size() == 0) {

			//他で出荷ピッキング中チェック
			THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
			tHtComctlCB.query().setCenterCd_Equal(wHtShipping.chaseMCenter().getCenterCd());
			tHtComctlCB.query().setClientCd_Equal(wHtShipping.chaseMClient().getClientCd());
			//2015/03/20 KAI UPDATE START バラピッキング(商品)追加に伴い検索条件を変更
			//tHtComctlCB.query().setHtDataKbn_Equal("ShippingPicking");
			tHtComctlCB.query().setHtDataKbn_LikeSearch("ShippingPicking", new LikeSearchOption().likePrefix());
			//2015/03/20 KAI UPDATE END
			tHtComctlCB.query().setSgyKey_Equal(wHtShipping.getPickingWorkNo());

			List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);

			if (lstTHtComctl.size() > 0) {
				for (THtComctl tHtComctl : lstTHtComctl) {
					if (!tHtComctl.getMacAddress().equals(wHtShipping.getMacAddress())) {
						return false;
					}
				}
			}
			lstWHtShipping.add(wHtShipping);
		}

		WHtShipping entity = lstWHtShipping.get(0);

		//検品フラグをクリア
		clearInspectionFlg(entity, pieceCaseCls);
		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End

		//出荷検品ワークテーブルをクリア
		clearWHtShipping(wHtShipping);

		return true;
	}
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.09 NayZaw Start
	/**
	 * <h2>出荷検品ワークのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、以下の処理を行い、trueを返す。
	 * 対象データの出庫ステータスが"25"(出庫指示済)の場合、出庫フラグをクリアする。
	 * 対象データの出庫ステータスが"35"(ピッキング済)の場合、検品フラグをクリアする。
	 * 出荷検品ワークテーブルをクリアする。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD・出庫作業No.
	 * @param packingStatus 梱包ステータス
	 * @return boolean true:出荷検品ワーク存在;false:出荷検品ワーク存在しない
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public boolean checkWHtShipping(WHtShipping wHtShipping, CDef.PackingStatus packingStatus) {
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.setupSelect_MProduct();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		if (lstWHtShipping.size() == 0) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (packingStatus.equals(CDef.PackingStatus.$25)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				//他で出荷ピッキング中チェック
				THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
				tHtComctlCB.query().setCenterCd_Equal(wHtShipping.chaseMCenter().getCenterCd());
				tHtComctlCB.query().setClientCd_Equal(wHtShipping.chaseMClient().getClientCd());
				tHtComctlCB.query().setHtDataKbn_LikeSearch("ShippingPicking", new LikeSearchOption().likePrefix());
				tHtComctlCB.query().setSgyKey_Equal(wHtShipping.getPickingWorkNo());
				List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);

				if (lstTHtComctl.size() > 0) {
					for (THtComctl tHtComctl : lstTHtComctl){
						if (!tHtComctl.getMacAddress().equals(wHtShipping.getMacAddress())) {
							return false;
						}
					}
				}
				lstWHtShipping.add(wHtShipping);
			} else {
				return false;
			}
		}

		WHtShipping entity = lstWHtShipping.get(0);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (packingStatus.equals(CDef.PackingStatus.$25)) {
			//出庫フラグをクリア
			clearPickingFlgByPackingNo(entity);
		}

		if (packingStatus.equals(CDef.PackingStatus.$35)) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			//検品フラグをクリア
			clearInspectionFlgByPackingNo(entity);
		}
		//出荷検品ワークテーブルをクリア
		clearWHtShipping(wHtShipping);

		return true;
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.09 NayZaw End

	//【C-CWMS-0041】出荷ピッキングワークのチェック 2105/09/14 Nay Zaw ADD
	/**
	 * <h2>出荷ピッキングワークのチェック。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、trueを返す。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD・出庫作業No.
	 * @param pickingStatus 出庫ステータス
	 * @return boolean true:出荷ピッキングワーク存在;false:出荷ピッキングワーク存在しない
	 */
	public boolean checkWHtShippingPicking(WHtShippingPicking wHtShippingPicking) {
		//出荷ピッキングワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.setupSelect_MProduct();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start
			//他で出荷ピッキング中チェック
			THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
			tHtComctlCB.query().setCenterCd_Equal(wHtShippingPicking.chaseMCenter().getCenterCd());
			tHtComctlCB.query().setClientCd_Equal(wHtShippingPicking.chaseMClient().getClientCd());
			//2015/03/20 KAI UPDATE START バラピッキング(商品)追加に伴い検索条件を変更
			tHtComctlCB.query().setHtDataKbn_LikeSearch("ShippingPicking", new LikeSearchOption().likePrefix());
			//2015/03/20 KAI UPDATE END
			tHtComctlCB.query().setSgyKey_Equal(wHtShippingPicking.getPickingWorkNo());

			List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);

			if (lstTHtComctl.size() > 0) {
				for (THtComctl tHtComctl : lstTHtComctl) {
					if (!tHtComctl.getMacAddress().equals(wHtShippingPicking.getMacAddress())) {
						return false;
					}
				}
			}
			lstWHtShippingPicking.add(wHtShippingPicking);
			// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End
		}
		//[ON推-品向-1134] 修正対応(不要なコード削除) 2016.4.20 chou
		return true;
	}

	//[ON推-HTケースピッキング画面の新規作成] ピッキンググループNo.で出荷ピッキングワークのチェック 追加 2016.03.15 chou Start
	/**
	 * <h2>ケースピッキングNo.で出荷ピッキングワークのチェック。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、trueを返す。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD
	 * @param pickingStatus 出庫ステータス
	 * @param casePickingNo ケースピッキングNo.
	 * @return boolean true:出荷ピッキングワーク存在;false:出荷ピッキングワーク存在しない
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public boolean checkWHtShippingPicking(WHtShippingPicking wHtShippingPicking, CDef.PickingStatus pickingStatus, String casePickingNo) {
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		//出荷ピッキングワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (pickingStatus.equals(CDef.PickingStatus.$25)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				//他で出荷ピッキング中チェック
				THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
				tHtComctlCB.query().setCenterCd_Equal(wHtShippingPicking.chaseMCenter().getCenterCd());
				tHtComctlCB.query().setClientCd_Equal(wHtShippingPicking.chaseMClient().getClientCd());
				tHtComctlCB.query().setHtDataKbn_LikeSearch("ShippingCasePicking", new LikeSearchOption().likePrefix());

				tHtComctlCB.query().setSgyKey_Equal(casePickingNo);

				List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);

				if (lstTHtComctl.size() > 0) {
					for (THtComctl tHtComctl : lstTHtComctl){
						if (!tHtComctl.getMacAddress().equals(wHtShippingPicking.getMacAddress())) {
							return false;
						}
					}
				}
				lstWHtShippingPicking.add(wHtShippingPicking);
			} else {
				return false;
			}
		}
		//[ON推-品向-1134] 修正対応 2016.4.20 chou Del Start
//		WHtShippingPicking entity = lstWHtShippingPicking.get(0);
//
//		if (pickingStatus.equals(CDef.CenterPickingStatus.$25)) {
//			//出庫フラグをクリア
//			clearPickingFlg(entity);
//		}
//
//		if (pickingStatus.equals(CDef.CenterPickingStatus.$35)) {
//			//検品フラグをクリア
//			clearInspectionFlg(entity);
//		}
//
//		//出荷検品ワークテーブルをクリア
//		clearWHtShippingPicking(wHtShippingPicking);
		//[ON推-品向-1134] 修正対応 2016.4.20 chou Del End
		return true;
	}
	//[ON推-HTケースピッキング画面の新規作成] ピッキンググループNo.で出荷ピッキングワークのチェック 追加 2016.03.15 chou End

	//[C-CWMS-0051] 出荷梱包No.でピッキングする場合、出荷ピッキングワークテーブルをチェック 2015.12.14 NayZaw Start
	/**
	 * <h2>出荷ピッキングワークのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、trueを返す。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD・出庫作業No.
	 * @param packingStatus 梱包ステータス
	 * @return boolean true:出荷ピッキングワーク存在;false:出荷ピッキングワーク存在しない
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public boolean checkWHtShippingPicking(WHtShippingPicking wHtShippingPicking, CDef.PackingStatus packingStatus) {
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//出荷検品ワークテーブルのデータ取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		wHtShippingPickingCB.setupSelect_MProduct();
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		if (lstWHtShippingPicking.size() == 0) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (packingStatus.equals(CDef.PackingStatus.$25)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				//他で出荷ピッキング中チェック
				THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
				tHtComctlCB.query().setCenterCd_Equal(wHtShippingPicking.chaseMCenter().getCenterCd());
				tHtComctlCB.query().setClientCd_Equal(wHtShippingPicking.chaseMClient().getClientCd());
				//2015/03/20 KAI UPDATE START バラピッキング(商品)追加に伴い検索条件を変更
				//tHtComctlCB.query().setHtDataKbn_Equal("ShippingPicking");
				tHtComctlCB.query().setHtDataKbn_LikeSearch("ShippingPicking", new LikeSearchOption().likePrefix());
				//2015/03/20 KAI UPDATE END
				tHtComctlCB.query().setSgyKey_Equal(wHtShippingPicking.getPickingWorkNo());

				List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);

				if (lstTHtComctl.size() > 0) {
					for (THtComctl tHtComctl : lstTHtComctl){
						if (!tHtComctl.getMacAddress().equals(wHtShippingPicking.getMacAddress())) {
							return false;
						}
					}
				}
				lstWHtShippingPicking.add(wHtShippingPicking);
			} else {
				return false;
			}
		}
		//[ON推-品向-1134] 修正対応(不要なコード削除) 2016.4.20 chou
		return true;
	}
	//[C-CWMS-0051] 出荷梱包No.でピッキングする場合、出荷ピッキングワークテーブルをチェック 2015.12.14 NayZaw End

	/**
	 * <h2>出庫フラグをクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの出庫フラグを"0"(未出庫)で更新する。
	 * 【出荷ステータス更新】（出庫ステータス：出庫指示済）を実行する。
	 *
	 * 【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShipping, CDef.PickingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：センタID・荷主ID・出庫作業No.
	 */
	public void clearPickingFlg(WHtShipping wHtShipping, PieceCaseCls pieceCaseCls) {

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

		// ===== ピッキングフラグを未ピッキングに変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();

		packingBCb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		packingBCb.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		packingBCb.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start
		switch (pieceCaseCls) {
		case PIECE:
			packingBCb.query().queryTPackingH().setMixedFlg_Equal_$1();
			break;
		case CASE:
			packingBCb.query().queryTPackingH().setMixedFlg_Equal_$0();
			break;
		case ALL:
			break;
		}
		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End

		// 更新値(ピッキングフラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$0();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//[C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

		//出庫ステータスの更新
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		updatePickingStatus(wHtShipping, CDef.PickingStatus.$25);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	}

	//[C-CWMS-0051] 出荷梱包Noで検品する場合出庫フラグをクリアするの為処理追加 2015.12.11 NayZaw Start
	/**
	 * <h2>出庫フラグをクリアする。（出荷梱包No.で検品時）</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの出庫フラグを"0"(未出庫)で更新する。
	 * 【出荷ステータス更新】（梱包ステータス：出庫指示済）を実行する。
	 *
	 * 【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShipping, CDef.CenterPackingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：センタID・荷主ID・出庫作業No.
	 */
	public void clearPickingFlgByPackingNo(WHtShipping wHtShipping) {

		// ===== ピッキングフラグを未ピッキングに変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();

		packingBCb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		packingBCb.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		packingBCb.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());

		// 更新値(ピッキングフラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$0();
		// 梱包ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//出庫ステータスの更新
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		updatePackingStatus(wHtShipping, CDef.PackingStatus.$25);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	}
	//[C-CWMS-0051] 出荷梱包Noで検品する場合出庫フラグをクリアするの為処理追加 2015.12.11 NayZaw End

	// 【C-CWMS-0041】 ピッキングフラグをクリアする処理で引数を「出荷検品ワーク」から「出荷ピッキングワーク」テーブルに変更  2015/09/14 Nay Zaw
	/**
	 * <h2>出庫フラグをクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの出庫フラグを"0"(未出庫)で更新する。
	 * 【出荷ステータス更新】（出庫ステータス：出庫指示済）を実行する。
	 *
	 * 【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShipping, CDef.PickingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・出庫作業No.
	 */
	public void clearPickingFlg(WHtShippingPicking wHtShippingPicking, PieceCaseCls pieceCaseCls) {

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

		// ===== 出庫フラグを未出庫に変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();

		packingBCb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingBCb.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		packingBCb.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());

		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start
		switch (pieceCaseCls) {
		case PIECE:
			packingBCb.query().queryTPackingH().setMixedFlg_Equal_$1();
			break;
		case CASE:
			packingBCb.query().queryTPackingH().setMixedFlg_Equal_$0();
			break;
		case ALL:
			break;
		}
		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End

		// 更新値(出庫フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$0();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//[C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

		//出庫ステータスの更新
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		updatePickingStatus(wHtShippingPicking, CDef.PickingStatus.$25);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	}

	// [C-CWMS-0051] 出荷梱包No.でピッキングする場合、出庫フラグをクリアする処理 2015.12.14 NayZaw Start
	/**
	 * <h2>出庫フラグをクリアする。（出荷梱包No.で検品時）</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの出庫フラグを"0"(未出庫)で更新する。
	 * 【出荷ステータス更新】（梱包ステータス：出庫指示済）を実行する。
	 *
	 * 【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShipping, CDef.CenterPackingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・出庫作業No.
	 */
	public void clearPickingFlgByPackingNo(WHtShippingPicking wHtShippingPicking) {

		// ===== 出庫フラグを未出庫に変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();

		packingBCb.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingBCb.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		packingBCb.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());

		// 更新値(出庫フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$0();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//出庫ステータスの更新
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		updatePackingStatus(wHtShippingPicking, CDef.PackingStatus.$25);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	}
	// [C-CWMS-0051] 出荷梱包No.でピッキングする場合、出庫フラグをクリアする処理 2015.12.14 NayZaw End

	// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正(不要なメソッドを削除) 2016.11.22 kawana

	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Add Start
	/**
	 * <h2>出庫フラグ、検品フラグをクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの出庫フラグを"0"(未出庫)、
	 * 検品フラグを"0"(未検品)で更新する。
	 *【出荷ステータス更新】（出庫ステータス：出庫指示済）を実行する。
	 *
	 * 同じケースピッキングNo.に出荷確定済のデータが含まれる場合、エラーとする。
	 *
	 *【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePickingStatusByCasePickingNo(WHtShippingPicking, String, CDef.PickingStatus) 出荷ステータス更新メソッド}を呼び出す。」
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 */
	public void clearPickingFlgAndInspectionFlgByCasePickingNo(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final long clientId = wHtShippingPicking.getClientId();

		// ===== 出荷確定済データ存在確認 =====

		checkLogic.checkExistShippingFixedData(centerId, clientId, casePickingNo, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return;
		}

		// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana End


		// ===== 出庫フラグを未出庫に変更 =====
		// ===== 検品フラグを未検品に変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		packingBCb.query().queryTPackingH().setCenterId_Equal(centerId);
		packingBCb.query().queryTPackingH().setClientId_Equal(clientId);
		packingBCb.query().setCasePickingNo_Equal(casePickingNo);
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

		// 更新値(出庫フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$0();
		updatePackingB.setInspectionFlg_$0();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//出庫ステータスの更新
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		updatePickingStatusByCasePickingNo(wHtShippingPicking, casePickingNo, CDef.PickingStatus.$25);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe ENd
	}

	// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正(不要なメソッドを削除) 2016.11.22 kawana

	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Add End

	/**
	 * <h2>検品フラグをクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの検品フラグを"0"(未検品)で更新する。
	 * 引数を条件に梱包ヘッダデータを取得し、検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 【全てピッキング済の判定】を行い、
	 * 全てピッキング済の場合、【出荷ステータス更新】（出庫ステータス：ピッキング済）を実行する。
	 * 未ピッキングありの場合、【出荷ステータス更新】（出庫ステータス：出庫指示済）を実行する。
	 *
	 * 【全てピッキング済の判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(long) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShipping, CDef.PickingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 */
	public void clearInspectionFlg(WHtShipping wHtShipping, PieceCaseCls pieceCaseCls) {

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

		// ===== 検品フラグを未検品に変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();

		packingBCb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		packingBCb.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		packingBCb.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start
		switch (pieceCaseCls) {
		case PIECE:
			packingBCb.query().queryTPackingH().setMixedFlg_Equal_$1();
			break;
		case CASE:
			packingBCb.query().queryTPackingH().setMixedFlg_Equal_$0();
			break;
		case ALL:
			break;
		}
		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End

		// 更新値(検品フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setInspectionFlg_$0();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//[C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

		//出庫ステータスの更新
		// [ON推-品向-434] ピッキング処理を行わないまま出荷検品を行う場合に対応 2014.12.12 watanabe Start
		//出庫ヘッダテーブル取得
		TPickingHCB pickingHCB = tPickingHBhv.newMyConditionBean();
		pickingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		pickingHCB.query().setClientId_Equal(wHtShipping.getClientId());
		pickingHCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		TPickingH pickEntity = tPickingHBhv.selectEntity(pickingHCB);
		if (pickEntity == null) {
			//データが存在しないためエラー
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

		// ピッキング済かの判定
		if (checkLogic.isCompletedPicking(pickEntity.getPickingHId())) {

			// ステータスをピッキング済に更新
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			updatePickingStatus(wHtShipping, CDef.PickingStatus.$35);
		} else {

			// ステータスを出庫指示済に更新
			updatePickingStatus(wHtShipping, CDef.PickingStatus.$25);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
		// [ON推-品向-434] ピッキング処理を行わないまま出荷検品を行う場合に対応 2014.12.12 watanabe End
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
	/**
	 * <h2>検品フラグをクリアする(出荷梱包No.で検品)。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、梱包ボディの検品フラグを"0"(未検品)で更新する。
	 * 引数を条件に梱包ヘッダデータを取得し、検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 【全てピッキング済の判定】を行い、
	 * 全てピッキング済の場合、【出荷ステータス更新】（梱包ステータス：ピッキング済）を実行する。
	 * 未ピッキングありの場合、【出荷ステータス更新】（梱包ステータス：出庫指示済）を実行する。
	 *
	 * 【全てピッキング済の判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShipping, CDef.CenterPackingStatus) 出荷ステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 */
	public void clearInspectionFlgByPackingNo(WHtShipping wHtShipping){
		// ===== 検品フラグを未検品に変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();

		packingBCb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		packingBCb.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		packingBCb.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());

		// 更新値(検品フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setInspectionFlg_$0();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		TPackingHCB packingHCB = tPackingHBhv.newMyConditionBean();
		packingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		packingHCB.query().setClientId_Equal(wHtShipping.getClientId());
		packingHCB.query().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
		TPackingH packEntity = tPackingHBhv.selectEntity(packingHCB);
		List<TPackingB> lstPackingB = packEntity.getTPackingBList();
		// ピッキング済かの判定
		if (checkLogic.isCompletedPicking(lstPackingB)) {
			// ステータスをピッキング済に更新
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			updatePackingStatus(wHtShipping, CDef.PackingStatus.$35);
		} else {
			// ステータスを出庫指示済に更新
			updatePackingStatus(wHtShipping, CDef.PackingStatus.$25);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}

	}
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End

	// 【C-CWMS-0041】 ピッキングフラグをクリアする処理で引数を「出荷検品ワーク」から「出荷ピッキングワーク」テーブルに変更  2015/09/14 Nay Zaw

	// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正(不要なコードを削除) 2016.11.22 kawana

	/**
	 * <h2>出荷ステータスを更新する。</h2>
	 * <pre>
	 * 引数を条件に出庫ヘッダ情報を取得し、
	 * 出庫ステータスが出庫指示済の場合、【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出庫作業No.でバラ検品)】を実行する。
	 * 出庫ステータスがピッキング中の場合、【出荷ステータス更新.出庫検品開始のステータス更新(出庫作業No.でバラ検品)】を実行する。
	 * 出庫ステータスがピッキング済の場合、【出荷ステータス更新.出庫検品完了処理のステータス更新】を実行する。
	 * 出庫ステータスが出荷検品中の場合、【出荷ステータス更新.出荷検品開始のステータス更新】を実行する。
	 * 出庫ステータスが出荷検品中断の場合、【出荷ステータス更新.出荷検品中断処理のステータス更新】を実行する。
	 *
	 * 【出荷ステータス更新.出庫検品キャンセル処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#shipPickCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品キャンセル処理のステータス更新(出庫作業No.でバラ検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#shipPickStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品開始のステータス更新(出庫作業No.でバラ検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品完了処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#shipPicked(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品完了処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#inspectStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品中断処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#inspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @param pickingStatus 出庫ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public void updatePickingStatus(WHtShipping wHtShipping, CDef.PickingStatus pickingStatus) {
		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TPickingH();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		TPickingB tPickingB = lstTPickingB.get(0);
		TPickingH tPickingH = tPickingB.chaseTPickingH();

		List<TPickingH> lstTPickingH = new ArrayList<TPickingH>();
		lstTPickingH.add(tPickingH);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (pickingStatus.equals(CDef.PickingStatus.$25)) {
			shipStatusUpdateLogic.shipPickCancel(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$30)) {
			shipStatusUpdateLogic.shipPickStart(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$35)) {
			shipStatusUpdateLogic.shipPicked(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$40)) {
			shipStatusUpdateLogic.inspectStart(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$45)) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			shipStatusUpdateLogic.inspectInterrupt(lstTPickingH, new ErrorStatus());
		}
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw Start
	/**
	 * <h2>出荷ステータスを更新する。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダ情報を取得し、
	 * 梱包ステータスが出庫指示済の場合、【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出荷梱包No.で検品)】を実行する。
	 * 梱包ステータスがピッキング中の場合、【出荷ステータス更新.出庫検品開始のステータス更新(出荷梱包No.で検品)】を実行する。
	 * 梱包ステータスがピッキング済の場合、【出荷ステータス更新.出庫検品完了処理のステータス更新(出荷梱包No.で検品)】を実行する。
	 * 梱包ステータスが出荷検品中の場合、【出荷ステータス更新.出荷検品開始のステータス更新(出荷梱包No.で検品)】を実行する。
	 * 梱包ステータスが出荷検品中断の場合、【出荷ステータス更新.出荷検品中断処理のステータス更新(出荷梱包No.で検品)】を実行する。
	 *
	 * 【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品キャンセル処理のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品開始のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品開始のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品完了処理のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingShipPicked(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品完了処理のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品開始のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingInspectStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品中断処理のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingInspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @param packingStatus 梱包ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public void updatePackingStatus(WHtShipping wHtShipping, CDef.PackingStatus packingStatus){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//梱包ヘッダ情報取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPackingH();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShipping.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		TPackingB tPackingB = lstTPackingB.get(0);
		TPackingH tPackingH = tPackingB.chaseTPackingH();

		List<TPackingH> lstTPackingH = new ArrayList<TPackingH>();
		lstTPackingH.add(tPackingH);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if(packingStatus.equals(CDef.PackingStatus.$25)){
			shipStatusUpdateLogic.packingShipPickCancel(lstTPackingH, new ErrorStatus());
		}
		if(packingStatus.equals(CDef.PackingStatus.$30)){
			shipStatusUpdateLogic.packingShipPickStart(lstTPackingH, new ErrorStatus());
		}
		if (packingStatus.equals(CDef.PackingStatus.$35)) {
			shipStatusUpdateLogic.packingShipPicked(lstTPackingH, new ErrorStatus());
		}
		if (packingStatus.equals(CDef.PackingStatus.$40)) {
			shipStatusUpdateLogic.packingInspectStart(lstTPackingH, new ErrorStatus());
		}
		if (packingStatus.equals(CDef.PackingStatus.$45)) {
			shipStatusUpdateLogic.packingInspectInterrupt(lstTPackingH, new ErrorStatus());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw End


	//【C-CWMS-0041】「出庫ステータスの更新」作業で出荷ピッキングワークを使用する処理追加。 2015/09/14 NayZaw ADD Start
	/**
	 * <h2>出荷ステータスを更新する。</h2>
	 * <pre>
	 * 引数を条件に出庫ヘッダ情報を取得し、
	 * 出庫ステータスが出庫指示済の場合、【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出庫作業No.でバラ検品)】を実行する。
	 * 出庫ステータスがピッキング中の場合、【出荷ステータス更新.出庫検品開始のステータス更新(出庫作業No.でバラ検品)】を実行する。
	 * 出庫ステータスがピッキング済の場合、【出荷ステータス更新.出庫検品完了処理のステータス更新】を実行する。
	 * 出庫ステータスが出荷検品中の場合、【出荷ステータス更新.出荷検品開始のステータス更新】を実行する。
	 * 出庫ステータスが出荷検品中断の場合、【出荷ステータス更新.出荷検品中断処理のステータス更新】を実行する。
	 *
	 * 【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出庫作業No.でバラ検品)】
	 * ・{@link ShipStatusUpdateLogic#shipPickCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品キャンセル処理のステータス更新(出庫作業No.でバラ検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品開始のステータス更新(出庫作業No.でバラ検品)】
	 * ・{@link ShipStatusUpdateLogic#shipPickStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品開始のステータス更新(出庫作業No.でバラ検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品完了処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#shipPicked(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品完了処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#inspectStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品中断処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#inspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・出庫作業No.
	 * @param pickingStatus 出庫ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public void updatePickingStatus(WHtShippingPicking wHtShippingPicking, CDef.PickingStatus pickingStatus) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TPickingH();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		TPickingB tPickingB = lstTPickingB.get(0);
		TPickingH tPickingH = tPickingB.chaseTPickingH();

		List<TPickingH> lstTPickingH = new ArrayList<TPickingH>();
		lstTPickingH.add(tPickingH);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (pickingStatus.equals(CDef.PickingStatus.$25)) {
			shipStatusUpdateLogic.shipPickCancel(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$30)) {
			shipStatusUpdateLogic.shipPickStart(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$35)) {
			shipStatusUpdateLogic.shipPicked(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$40)) {
			shipStatusUpdateLogic.inspectStart(lstTPickingH, new ErrorStatus());
		}
		if (pickingStatus.equals(CDef.PickingStatus.$45)) {
			shipStatusUpdateLogic.inspectInterrupt(lstTPickingH, new ErrorStatus());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}
	}
	//【C-CWMS-0041】「出庫ステータスの更新」作業で出荷ピッキングワークを使用する処理追加。 2015/09/14 NayZaw ADD End

	// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana Start

	// [ON推-HTケースピッキング画面の新規作成] ピッキンググループNo.で出庫ステータスの更新 追加 2016.03.03 chou Start
	/**
	 * <h2>梱包ステータス、出庫ステータス、出荷ステータスを更新する。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダを取得し、ステータスを更新する。
	 * 下記の場合はエラーとする。
	 * ・同じケースピッキングNo.に出荷確定済のデータが含まれる場合
	 * ・取得した梱包ヘッダが0件の場合
	 *
	 * 出庫ステータスが出庫指示済の場合、【出荷ステータス更新.出庫検品キャンセル処理のステータス更新】を実行する。
	 * 出庫ステータスがピッキング中の場合、【出荷ステータス更新.出庫検品開始のステータス更新】を実行する。
	 * 出庫ステータスがピッキング済の場合、【出荷ステータス更新.出庫検品完了処理のステータス更新(出庫作業No.で検品)】を実行する。
	 * 出庫ステータスが出荷検品中の場合、【出荷ステータス更新.出荷検品開始のステータス更新(出庫作業No.で検品)】を実行する。
	 * 出庫ステータスが出荷検品中断の場合、【出荷ステータス更新.出荷検品中断処理のステータス更新】を実行する。
	 * 出庫ステータスが出荷検品済の場合、【出荷ステータス更新.ピッキング検品完了のステータス更新】を実行する。
	 *
	 * 【出荷ステータス更新.出庫検品キャンセル処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品キャンセル処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品開始のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品完了処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingShipPicked(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品完了処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingInspectStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品中断処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingInspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.ピッキング検品完了のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingInspected(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID
	 * @param casePickingNo ケースピッキングNo.
	 * @param pickingStatus 出庫ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public void updatePickingStatusByCasePickingNo(WHtShippingPicking wHtShippingPicking, String casePickingNo, CDef.PickingStatus pickingStatus) {
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

		if (casePickingNo == null || casePickingNo.equals("")) {
			return;
		}

		// ===== 対象の梱包ヘッダを検索 =====

		final long centerId = wHtShippingPicking.getCenterId();
		final long clientId = wHtShippingPicking.getClientId();

		// 梱包ボディ検索

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() < 1) {
			// 該当データなし

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// 梱包ヘッダ取得

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

		// ===== 各ステータスの更新 =====

		updatePickingStatusByCasePickingNo(wHtShippingPicking, casePickingNo, packingHList, pickingStatus);

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	}

	// [ON推-HTケースピッキング画面の新規作成] ピッキンググループNo.で出庫ステータスの更新 追加 2016.03.03 chou End

	// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana Start

	/**
	 * <h2>梱包ステータス、出庫ステータス、出荷ステータスを更新する。</h2>
	 * <pre>
	 *
	 * 引数の梱包ヘッダを対象に梱包ステータスを変更し、関連する出庫ステータスと出荷ステータスを更新する。
	 * 下記の場合はエラーとする。
	 * ・同じケースピッキングNo.に出荷確定済のデータが含まれる場合
	 * ・引数の梱包ヘッダが0件の場合
	 *
	 * 出庫ステータスが出庫指示済の場合、【出荷ステータス更新.出庫検品キャンセル処理のステータス更新】を実行する。
	 * 出庫ステータスがピッキング中の場合、【出荷ステータス更新.出庫検品開始のステータス更新】を実行する。
	 * 出庫ステータスがピッキング済の場合、【出荷ステータス更新.出庫検品完了処理のステータス更新(出庫作業No.で検品)】を実行する。
	 * 出庫ステータスが出荷検品中の場合、【出荷ステータス更新.出荷検品開始のステータス更新(出庫作業No.で検品)】を実行する。
	 * 出庫ステータスが出荷検品中断の場合、【出荷ステータス更新.出荷検品中断処理のステータス更新】を実行する。
	 * 出庫ステータスが出荷検品済の場合、【出荷ステータス更新.ピッキング検品完了のステータス更新】を実行する。
	 *
	 * 【出荷ステータス更新.出庫検品キャンセル処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品キャンセル処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品開始のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品完了処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingShipPicked(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品完了処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品開始のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingInspectStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品中断処理のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingInspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.ピッキング検品完了のステータス更新】
	 * ・{@link ShipStatusUpdateLogic#packingInspected(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID
	 * @param packingHList 梱包ヘッダリスト：梱包ヘッダID・センタID・荷主ID・出庫ヘッダID
	 * @param pickingStatus 出庫ステータス
	 */
	public void updatePickingStatusByCasePickingNo(WHtShippingPicking wHtShippingPicking, String casePickingNo, List<TPackingH> packingHList, CDef.PickingStatus pickingStatus) {

		// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final long clientId = wHtShippingPicking.getClientId();

		// ===== 出荷確定済データ存在確認 =====

		checkLogic.checkExistShippingFixedData(centerId, clientId, casePickingNo, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return;
		}

		// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana End

		if (packingHList.size() < 1) {
			// 該当データなし

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		switch (pickingStatus) {
		case $25:
			// キャンセル (出庫指示済に変更)
			shipStatusUpdateLogic.packingShipPickCancel(packingHList, new ErrorStatus());
			break;
		case $30:
			// ピッキング中に変更
			shipStatusUpdateLogic.packingShipPickStart(packingHList, new ErrorStatus());
			break;
		case $35:
			// ピッキング済に変更
			shipStatusUpdateLogic.packingShipPicked(packingHList, new ErrorStatus());
			break;
		case $40:
			// 検品中に変更
			shipStatusUpdateLogic.packingInspectStart(packingHList, new ErrorStatus());
			break;
		case $45:
			// 検品中断に変更
			shipStatusUpdateLogic.packingInspectInterrupt(packingHList, new ErrorStatus());
			break;
		case $50:
			// 検品済に変更
			shipStatusUpdateLogic.packingInspected(packingHList, new ErrorStatus());
			break;
		default:
			break;
		}
	}

	// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana End

	// [C-CWMS-0051] 出荷梱包No.で検品する場合、梱包ステータスを更新する処理追加 2015.12.14 NayZaw Start
	/**
	 * <h2>出荷ステータスを更新する。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダ情報を取得し、
	 * 梱包ステータスが出庫指示済の場合、【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出荷梱包No.で検品)】を実行する。
	 * 梱包ステータスがピッキング中の場合、【出荷ステータス更新.出庫検品開始のステータス更新(出庫作業No.で検品)】を実行する。
	 * 梱包ステータスがピッキング済の場合、【出荷ステータス更新.出庫検品完了処理のステータス更新(出庫作業No.で検品)】を実行する。
	 * 梱包ステータスが出荷検品中の場合、【出荷ステータス更新.出荷検品開始のステータス更新(出庫作業No.で検品)】を実行する。
	 * 梱包ステータスが出荷検品中断の場合、【出荷ステータス更新.出荷検品中断処理のステータス更新(出庫作業No.で検品)】を実行する。
	 *
	 * 【出荷ステータス更新.出庫検品キャンセル処理のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品キャンセル処理のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品開始のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingShipPickStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品開始のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出庫検品完了処理のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingShipPicked(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫検品完了処理のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品開始のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingInspectStart(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品開始のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.出荷検品中断処理のステータス更新(出荷梱包No.で検品)】
	 * ・{@link ShipStatusUpdateLogic#packingInspectInterrupt(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品中断処理のステータス更新(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・出庫作業No.
	 * @param packingStatus 梱包ステータス
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public void updatePackingStatus(WHtShippingPicking wHtShippingPicking, CDef.PackingStatus packingStatus){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//梱包ヘッダ情報取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPackingH();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		TPackingB tPackingB = lstTPackingB.get(0);
		TPackingH tPackingH = tPackingB.chaseTPackingH();

		List<TPackingH> lstTPackingH = new ArrayList<TPackingH>();
		lstTPackingH.add(tPackingH);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if(packingStatus.equals(CDef.PackingStatus.$25)){
			shipStatusUpdateLogic.packingShipPickCancel(lstTPackingH, new ErrorStatus());
		}
		if(packingStatus.equals(CDef.PackingStatus.$30)){
			shipStatusUpdateLogic.packingShipPickStart(lstTPackingH, new ErrorStatus());
		}
		if (packingStatus.equals(CDef.PackingStatus.$35)) {
			shipStatusUpdateLogic.packingShipPicked(lstTPackingH, new ErrorStatus());
		}
		if (packingStatus.equals(CDef.PackingStatus.$40)) {
			shipStatusUpdateLogic.packingInspectStart(lstTPackingH, new ErrorStatus());
		}
		if (packingStatus.equals(CDef.PackingStatus.$45)) {
			shipStatusUpdateLogic.packingInspectInterrupt(lstTPackingH, new ErrorStatus());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	}
	// [C-CWMS-0051] 出荷梱包No.で検品する場合、梱包ステータスを更新する処理追加 2015.12.14 NayZaw End

	/**
	 * <h2>出荷検品ワークデータを削除する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークデータを取得し、該当データを削除する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・MACアドレス
	 */
	public void clearWHtShipping(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルの取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());  //DBの出荷検品ワークテーブルから削除した為いらない 2015/09/11 Nay Zaw
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		//出荷検品ワークテーブルのクリア
		wHtShippingBhv.batchDelete(lstWHtShipping);
	}

	// 【C-CWMS-0041】 ピッキングフラグをクリアする処理で引数を「出荷検品ワーク」から「出荷ピッキングワーク」テーブルに変更  2015/09/14 Start Nay Zaw

	/**
	 * <h2>出荷ピッキングワークデータを削除する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークデータを取得し、該当データを削除する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・MACアドレス
	 */
	public void clearWHtShippingPicking(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());  //DBの出荷検品ワークテーブルから削除した為いらない 2015/09/11 Nay Zaw
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		//出荷検品ワークテーブルのクリア
		wHtShippingPickingBhv.batchDelete(lstWHtShippingPicking);
	}

	/**
	 * <h2>出庫作業Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数の出庫作業Noを条件に出庫ヘッダ、出庫ボディのデータを取得し、
	 * 検索対象が見つからない場合、出庫作業No削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:出庫作業No存在;false:出庫作業No存在しない
	 */
	public boolean checkExistPickingWorkNo(WHtShipping wHtShipping) {
		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		if (lstTPickingB.size() > 0) {
			return true;
		}

		//出庫作業Noが他で削除しました。
		getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PICKING_WORK_NO_DELETED);
		return false;
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為出荷梱包No存在チェック処理追加 2015.12.10 NayZaw Start
	/**<h2>出荷梱包No.の存在チェックを行う。</h2>
	 * <pre>
	 * 引数の出荷梱包Noを条件に梱包ヘッダ、梱包ボディのデータを取得し、
	 * 検索対象が見つからない場合、出荷梱包No削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:出荷梱包No存在;false:出荷梱包No存在しない
	 */
	public boolean checkExistShippingPackingNo(WHtShipping wHtShipping){
		//梱包ヘッダ情報取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShipping.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);
		if(lstTPackingB.size() > 0){
			return true;
		}
		//出荷梱包No.が他で削除しました。
		getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_SHIPPING_PACKING_NO_DELETED);
		return false;
	}
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為出荷梱包No存在チェック処理追加 2015.12.10 NayZaw End

	/**
	 * <h2>出庫作業Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数の出庫作業No.を条件に出庫ヘッダ、出庫ボディのデータを取得し、
	 * 検索対象が見つからない場合、出庫作業No.削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:出庫作業No存在;false:出庫作業No存在しない
	 */
	public boolean checkExistPickingWorkNo(WHtShippingPicking wHtShippingPicking) {
		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		if (lstTPickingB.size() > 0) {
			return true;
		}

		//出庫作業Noが他で削除しました。
		getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PICKING_WORK_NO_DELETED);
		return false;
	}
	// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為出荷梱包No存在チェック処理追加 2015.12.14 NayZaw Start
	/**
	 * <h2>出荷梱包Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数の出庫作業No.を条件に梱包ヘッダ、梱包ボディのデータを取得し、
	 * 検索対象が見つからない場合、出荷梱包No削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:出荷梱包No存在;false:出荷梱包No存在しない
	 */
	public boolean checkExistShippingPackingNo(WHtShippingPicking wHtShippingPicking) {
		//出庫ヘッダ情報の取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		if (lstTPackingB.size() > 0) {
			return true;
		}

		//出庫作業Noが他で削除しました。
		getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NO_DELETED);
		return false;
	}
	// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為出荷梱包No存在チェック処理追加 2015.12.14 NayZaw End

	// [ON推-HTケースピッキング画面の新規作成] ピッキンググループNo.存在チェック 追加 2016.03.04 chou Start
	/**
	 * <h2>ピッキンググループNoの存在チェックを行う。</h2>
	 * <pre>
	 * 引数のピッキンググループNo.を条件に出庫ヘッダ、出庫ボディのデータを取得し、
	 * 検索対象が見つからない場合、出庫作業No削除済エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID
	 * @param casePickingNo ケースピッキングNo.
	 * @return boolean true:ケースピッキングNo存在 ; false:ケースピッキングNo存在しない
	 */
	public boolean checkExistCasePickingNo(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

		// 梱包ボディ検索

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		cb.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		cb.query().setCasePickingNo_Equal(casePickingNo);

		int count = tPackingBBhv.selectCount(cb);

		if (count < 1) {
			// ケースピッキングNo.での登録なし

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PICKING_CASE_PICKING_NO_DELETED);
			return false;
		}

		return true;

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	}
	// [ON推-HTケースピッキング画面の新規作成] ピッキンググループNo.存在チェック 追加 2016.03.04 chou End

	// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 2014.12.11 watanabe Start
	/**
	 * <h2>出荷停止と引当禁止のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * 受払と紐付けロケーションが引当禁止の場合、ロケーションが引当禁止のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @return boolean true:出荷停止並びに引当禁止ではない;false:出荷停止または引当禁止
	 */
	public boolean checkShippingAllogNgFlg(TPickingH tPickingH, List<TAllocInstB> lstTAllocInstB){
		// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto Start
		return checkShippingAllogNgFlg(tPickingH, lstTAllocInstB, true);
		// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加  2018.09.18 matsumoto End
	}
	// [C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw Start
	/**
	 * <h2>出荷停止と引当禁止のチェックを行う(出荷梱包No.で検品)。</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * 受払と紐付けロケーションが引当禁止の場合、ロケーションが引当禁止のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPackingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @return boolean true:出荷停止並びに引当禁止ではない;false:出荷停止または引当禁止
	 */
	public boolean checkShippingAllogNgFlgByPackingNo(TPackingH tPackingH,List<TAllocInstB> lstTAllocInstB){
		// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加  2018.09.18 matsumoto Start
		return checkShippingAllogNgFlgByPackingNo(tPackingH, lstTAllocInstB, true);
		// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加  2018.09.18 matsumoto End
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw End

	// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 2014.12.11 watanabe End

	// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto Start
	/**
	 * <h2>出荷停止と引当禁止のチェックを行う(出庫作業No.で検品)</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * 受払と紐付けロケーションが引当禁止の場合、ロケーションが引当禁止のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @param locationCheckFlg true:ロケ引当禁止チェックを行う;false:ロケ引当禁止チェックしない
	 * @return boolean true:出荷可能;false:出荷停止または引当禁止
	 */
	private boolean checkShippingAllogNgFlg(TPickingH tPickingH, List<TAllocInstB> lstTAllocInstB, boolean locationCheckFlg){
		TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
		tAllocInstHCB.query().setCenterId_Equal(tPickingH.getCenterId());
		tAllocInstHCB.query().setClientId_Equal(tPickingH.getClientId());
		tAllocInstHCB.query().setAllocInstHId_Equal(tPickingH.getAllocInstHId());
		TAllocInstH tAllocInstH = new TAllocInstH();
		// 引当指示ヘッダ
		tAllocInstH = tAllocInstHBhv.selectEntity(tAllocInstHCB);
		// ===== 取引先出荷停止のチェック =====
		MCustomer mCustomer = new MCustomer();
		mCustomer = mCustomerBhv.selectByPKValue(tAllocInstH.getSupplyCustomerId());
		if (mCustomer == null){
			this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return false;
		}
		if (mCustomer.isShippingStopFlg$1()){
			this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return false;
		}

		for(TAllocInstB tmpB:lstTAllocInstB){
			// ===== 商品出荷停止のチェック =====
			MProduct prodEntity = mProductBhv.selectByPKValue(tmpB.getProductId());
			if(prodEntity==null){
				this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				return false;
			}
			if(prodEntity.isShippingStopFlg$1()){
				// [ON推-品向-477] 欠品データの引当数0の場合に、検品を可能とするよう修正 2014.12.25 watanabe Start
				if(WCC.isPositive(tmpB.getAllocNum())){
					this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
					return false;
				}
				// [ON推-品向-477] 欠品データの引当数0の場合に、検品を可能とするよう修正 2014.12.25 watanabe End
			}

			if (locationCheckFlg) {
				//引当禁止チェック
				List<TStockInout> stockInoutList = new ArrayList<TStockInout>();
				TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
				tStockInoutCB.query().setAllocInstBId_Equal(tmpB.getAllocInstBId());
				stockInoutList = tStockInoutBhv.selectList(tStockInoutCB);
				if(stockInoutList.size() > 0) {
					for(TStockInout tStockInout : stockInoutList) {
						if (tStockInout != null){
							MLocation mLocation = new MLocation();
							mLocation = mLocationBhv.selectByPKValue(tStockBhv.selectByPKValue(tStockInout.getStockId()).getLocationId());
							if (mLocation == null){
								this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
								return false;
							}
							if ( mLocation.isAllocNgFlg$1()){
								this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}
	// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto End

	// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto Start
	/**
	 * <h2>出荷停止と引当禁止のチェックを行う(出荷梱包No.で検品)</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * 受払と紐付けロケーションが引当禁止の場合、ロケーションが引当禁止のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPackingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @param locationCheckFlg true:ロケ引当禁止チェックを行う;false:ロケ引当禁止チェックしない
	 * @return boolean true:出荷可能;false:出荷停止または引当禁止
	 */
	private boolean checkShippingAllogNgFlgByPackingNo(TPackingH tPackingH, List<TAllocInstB> lstTAllocInstB, boolean locationCheckFlg){
		TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
		tAllocInstHCB.query().setCenterId_Equal(tPackingH.getCenterId());
		tAllocInstHCB.query().setClientId_Equal(tPackingH.getClientId());
		tAllocInstHCB.query().setAllocInstHId_Equal(tPackingH.getAllocInstHId());
		TAllocInstH tAllocInstH = new TAllocInstH();
		// 引当指示ヘッダ
		tAllocInstH = tAllocInstHBhv.selectEntity(tAllocInstHCB);
		// ===== 取引先出荷停止のチェック =====
		MCustomer mCustomer = new MCustomer();
		mCustomer = mCustomerBhv.selectByPKValue(tAllocInstH.getSupplyCustomerId());
		if (mCustomer == null){
			this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return false;
		}
		if (mCustomer.isShippingStopFlg$1()){
			this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return false;
		}

		for(TAllocInstB tmpB:lstTAllocInstB){
			// ===== 商品出荷停止のチェック =====
			MProduct prodEntity = mProductBhv.selectByPKValue(tmpB.getProductId());
			if(prodEntity==null){
				this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				return false;
			}
			if(prodEntity.isShippingStopFlg$1()){
				// [ON推-品向-477] 欠品データの引当数0の場合に、検品を可能とするよう修正 2014.12.25 watanabe Start
				if(WCC.isPositive(tmpB.getAllocNum())){
					this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
					return false;
				}
				// [ON推-品向-477] 欠品データの引当数0の場合に、検品を可能とするよう修正 2014.12.25 watanabe End
			}

			if (locationCheckFlg) {
				//引当禁止チェック
				List<TStockInout> stockInoutList = new ArrayList<TStockInout>();
				TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
				tStockInoutCB.query().setAllocInstBId_Equal(tmpB.getAllocInstBId());
				stockInoutList = tStockInoutBhv.selectList(tStockInoutCB);
				if(stockInoutList.size() > 0) {
					for(TStockInout tStockInout : stockInoutList) {
						if (tStockInout != null){
							MLocation mLocation = new MLocation();
							mLocation = mLocationBhv.selectByPKValue(tStockBhv.selectByPKValue(tStockInout.getStockId()).getLocationId());
							if (mLocation == null){
								this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
								return false;
							}
							if ( mLocation.isAllocNgFlg$1()){
								this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}
	// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto End

	// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto Start
	/**
	 * <h2>出荷停止チェックを行う(出庫作業No.で検品)</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @return boolean true:出荷可能;false:出荷停止
	 */
	public boolean checkShippingNgFlg(TPickingH tPickingH, List<TAllocInstB> lstTAllocInstB) {

		return checkShippingAllogNgFlg(tPickingH, lstTAllocInstB, false);
	}

	/**
	 * <h2>出荷停止チェックを行う(出荷梱包No.で検品)</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPackingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @return boolean true:出荷可能;false:出荷停止
	 */
	public boolean checkShippingNgFlgByPackingNo(TPackingH tPackingH, List<TAllocInstB> lstTAllocInstB) {

		return checkShippingAllogNgFlgByPackingNo(tPackingH, lstTAllocInstB, false);
	}
	// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto End

	// 2015/03/31 KAI ADD START 顧客出荷指示Noでもピッキング及び出荷検品ができるよう機能追加
	/**
	 * <h2>顧客出荷指示Noのチェックを行う。</h2>
	 * <pre>
	 * 引数が出庫作業No.か出荷梱包No.かをチェックし、
	 * 出庫作業No.の場合、出庫ヘッダ情報を取得する。
	 * 出荷梱包No.の場合、梱包ヘッダ情報を取得する。
	 * 出庫作業No.と出荷梱包No.以外の場合、未存在エラーをエラーステータスに設定する。
	 * 出庫ヘッダからも梱包ヘッダからもデータが取得できない場合は出荷指示ヘッダから取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定する。
	 *
	 * 取得できた場合は出荷指示ヘッダから取得した出庫作業Noをセットして返却する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @return WHtShipping 出荷検品ワーク
	 */
	public WHtShipping checkClientShippingNo(WHtShipping wHtShipping) {
		// [C-CWMS-0051] 梱包No.で検品する場合の為処理追加 2015.12.09 NayZaw Start
		TPickingH tPickingH = null;
		TPackingH tPackingH = null;

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫ヘッダ情報の取得
			TPickingHCB tpickingHCB = tPickingHBhv.newMyConditionBean();
			tpickingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
			tpickingHCB.query().setClientId_Equal(wHtShipping.getClientId());
			tpickingHCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
			tPickingH = tPickingHBhv.selectEntity(tpickingHCB);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//梱包ヘッダ情報の取得
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
			tPackingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
			tPackingHCB.query().setClientId_Equal(wHtShipping.getClientId());
			tPackingHCB.query().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else {
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return null;
		}

		//出庫ヘッダからも梱包ヘッダからもデータが取得できない場合は出荷指示ヘッダから取得
		if((tPickingH==null || tPickingH.getPickingHId()==null) && (tPackingH == null || tPackingH.getPackingHId() == null)){
			//出庫ヘッダ情報の取得
			TShippingInstHCB tshippingInstHCB = tShippingInstHBhv.newMyConditionBean();
			tshippingInstHCB.setupSelect_TAllocInstH();
			tshippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
			tshippingInstHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
			tshippingInstHCB.query().setClientId_Equal(wHtShipping.getClientId());
			tshippingInstHCB.query().setClientShippingNo_Equal(wHtShipping.getPickingWorkNo());
			TShippingInstH tShippingInstH = tShippingInstHBhv.selectEntity(tshippingInstHCB);
			//それでも取得できない場合は該当データなし
			if(tShippingInstH==null || tShippingInstH.getShippingInstHId()==null){
				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return null;
			} else {
				//取得できた場合は顧客出荷指示Noから取得した出庫作業Noをセット
				wHtShipping.setPickingWorkNo(tShippingInstH.getTAllocInstH().getTPickingH().getPickingWorkNo());
			}
		}
		return wHtShipping;
		// [C-CWMS-0051] 梱包No.で検品する場合の為処理追加 2015.12.09 NayZaw End
	}
	// 2015/03/31 KAI ADD END 顧客出荷指示Noでもピッキング及び出荷検品ができるよう機能追加


	//2015/09/14 Nay Zaw ADD START 顧客出荷指示Noを出荷ピッキングワークテーブルにチェックするよう機能追加
	/**
	 * <h2>顧客出荷指示Noのチェックを行う。</h2>
	 * <pre>
	 * 引数が出庫作業No.か出荷梱包No.かをチェックし、
	 * 出庫作業No.の場合、出庫ヘッダ情報を取得する。
	 * 出荷梱包No.の場合、梱包ヘッダ情報を取得する。
	 * 出庫作業No.と出荷梱包No.以外の場合、未存在エラーをエラーステータスに設定する。
	 * 出庫ヘッダからも梱包ヘッダからもデータが取得できない場合は出荷指示ヘッダから取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定する。
	 *
	 * 取得できた場合は出荷指示ヘッダから取得した出庫作業Noをセットして返却する。
	 * </pre>
	 * @param wHtShippingPicking 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @return WHtShippingPicking 出荷ピッキングワーク
	 */
	public WHtShippingPicking checkClientShippingNo(WHtShippingPicking wHtShippingPicking) {

		// [C-CWMS-0051] 梱包No.でピッキング検品する場合の為処理追加 2015.12.14 NayZaw Start
		TPickingH tPickingH=null;
		TPackingH tPackingH=null;
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//出庫ヘッダ情報の取得
			TPickingHCB tpickingHCB = tPickingHBhv.newMyConditionBean();
			tpickingHCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tpickingHCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
			tpickingHCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
			tPickingH = tPickingHBhv.selectEntity(tpickingHCB);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//梱包ヘッダ情報の取得
			TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
			tPackingHCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tPackingHCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
			tPackingHCB.query().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
			tPackingH = tPackingHBhv.selectEntity(tPackingHCB);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else {
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return null;
		}

		//出庫ヘッダからも梱包ヘッダからもデータが取得できない場合は出荷指示ヘッダから取得
		if((tPickingH==null || tPickingH.getPickingHId()==null) && (tPackingH == null || tPackingH.getPackingHId() == null)){
			//出庫ヘッダ情報の取得
			TShippingInstHCB tshippingInstHCB = tShippingInstHBhv.newMyConditionBean();
			tshippingInstHCB.setupSelect_TAllocInstH();
			tshippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
			tshippingInstHCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tshippingInstHCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
			tshippingInstHCB.query().setClientShippingNo_Equal(wHtShippingPicking.getPickingWorkNo());
			TShippingInstH tShippingInstH = tShippingInstHBhv.selectEntity(tshippingInstHCB);
			//それでも取得できない場合は該当データなし
			if(tShippingInstH==null || tShippingInstH.getShippingInstHId()==null){
				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return null;
			} else {
				//取得できた場合は顧客出荷指示Noから取得した出庫作業Noをセット
				wHtShippingPicking.setPickingWorkNo(tShippingInstH.getTAllocInstH().getTPickingH().getPickingWorkNo());
			}
		}
		return wHtShippingPicking;
		// [C-CWMS-0051] 梱包No.でピッキング検品する場合の為処理追加 2015.12.14 NayZaw End
	}
	//2015/09/14 Nay Zaw ADD END 顧客出荷指示Noを出荷ピッキングワークテーブルにチェックするよう機能追加

	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

	// [C-CWMS-0059] 積込検品ワークテーブルクリア処理追加 2016.08.21 NayZaw Start
	/**
	 * 積込検品ワークテーブルクリア処理
	 * @param wHtLoading 積込検品ワークテーブル
	 */
	public void clearWHtLoading(WHtLoading wHtLoading){

		WHtLoadingCB wHtLoadingCb = wHtLoadingBhv.newMyConditionBean();
		wHtLoadingCb.query().setCenterId_Equal(wHtLoading.getCenterId());
		wHtLoadingCb.query().setClientId_Equal(wHtLoading.getClientId());
		wHtLoadingCb.query().setCarrierTraceNum_Equal(wHtLoading.getCarrierTraceNum());
		wHtLoadingCb.query().setMacAddress_Equal(wHtLoading.getMacAddress());

		List<WHtLoading> lstWHtLoading = wHtLoadingBhv.selectList(wHtLoadingCb);

		wHtLoadingBhv.batchDelete(lstWHtLoading);
	}

	// [C-CWMS-0059] 積込検品ワークテーブルクリア処理追加  2016.08.21 NayZaw End

	// [エンハンス（16下）Source2.3] シリアル登録(出荷) 2017.02.10 sja Start
	// [#1808] シリアル登録(出荷)削除 - 商品CD指定でワークテーブル削除を追加 2017.05.22 kawana Start

	/**
	 * <h2>シリアル登録(出荷)ワークデータ削除(全て)。</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(出荷)ワークデータを取得し、該当データを削除する。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：荷主ID・センタID・MACアドレス
	 */
	public void clearWHtSerialShippingInsp(WHtSerialShippingInsp wHtSerialShippingInsp) {

		WHtSerialShippingInspCB cb = wHtSerialShippingInspBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		cb.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		cb.query().setMacAddress_Equal(wHtSerialShippingInsp.getMacAddress());

		wHtSerialShippingInspBhv.queryDelete(cb);
	}

	/**
	 * <h2>シリアル登録(出荷)ワークデータ削除(商品)。</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(出荷)ワークデータを取得し、該当データを削除する。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：荷主ID・センタID・MACアドレス・商品CD
	 */
	public void clearWHtSerialShippingInspProduct(WHtSerialShippingInsp wHtSerialShippingInsp) {

		WHtSerialShippingInspCB cb = wHtSerialShippingInspBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		cb.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		cb.query().setMacAddress_Equal(wHtSerialShippingInsp.getMacAddress());
		cb.query().setProductCd_Equal(wHtSerialShippingInsp.getProductCd());

		wHtSerialShippingInspBhv.queryDelete(cb);
	}

	// [#1808] シリアル登録(出荷)削除 - 商品CD指定でワークテーブル削除を追加 2017.05.22 kawana End


	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化(該当の処理を削除) 2017.05.18 kawana

	/**
	 * <h2>出庫作業Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数の出庫作業No.を条件に出庫ヘッダ、出庫ボディのデータを取得し、
	 * 検索対象が見つからない場合、出庫作業No.削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:出庫作業No存在;false:出庫作業No存在しない
	 */
	public boolean checkExistPickingWorkNo(WHtSerialShippingInsp wHtSerialShippingInsp) {
		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtSerialShippingInsp.getPickingWorkNo());

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		if (lstTPickingB.size() > 0) {
			return true;
		}

		//出庫作業Noが他で削除しました。
		getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PICKING_WORK_NO_DELETED);
		return false;
	}
	/**
	 * <h2>出荷梱包Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数の出庫作業No.を条件に梱包ヘッダ、梱包ボディのデータを取得し、
	 * 検索対象が見つからない場合、出荷梱包No削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:出荷梱包No存在;false:出荷梱包No存在しない
	 */
	public boolean checkExistShippingPackingNo(WHtSerialShippingInsp wHtSerialShippingInsp) {
		//出庫ヘッダ情報の取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtSerialShippingInsp.getPickingWorkNo());

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		if (lstTPackingB.size() > 0) {
			return true;
		}

		//出庫作業Noが他で削除しました。
		getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NO_DELETED);
		return false;
	}

	/**
	 * <h2>シリアル登録(出荷)ワークのチェック。</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(出荷)ワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、trueを返す。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD・出庫作業No.
	 * @param pickingStatus 出庫ステータス
	 * @return boolean true:出荷ピッキングワーク存在;false:出荷ピッキングワーク存在しない
	 */
	public boolean checkWHtSerialShippingInsp(WHtSerialShippingInsp wHtSerialShippingInsp) {
		//シリアル登録(出荷)ワークテーブルのデータ取得
		WHtSerialShippingInspCB wHtSerialShippingInspCB = wHtSerialShippingInspBhv.newMyConditionBean();
		wHtSerialShippingInspCB.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		wHtSerialShippingInspCB.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		wHtSerialShippingInspCB.query().setMacAddress_Equal(wHtSerialShippingInsp.getMacAddress());

		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = wHtSerialShippingInspBhv.selectList(wHtSerialShippingInspCB);
		if (lstWHtSerialShippingInsp.size() == 0) {
//			//他で出荷ピッキング中チェック
//			THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
//			tHtComctlCB.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
//			tHtComctlCB.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
//			tHtComctlCB.query().setHtDataKbn_LikeSearch("SerialShippingInspection", new LikeSearchOption().likePrefix());
//			tHtComctlCB.query().setSgyKey_Equal(wHtSerialShippingInsp.getPickingWorkNo());
//
//			List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);
//			if (lstTHtComctl.size() > 0) {
//				for (THtComctl tHtComctl : lstTHtComctl) {
//					if (!tHtComctl.getMacAddress().equals(wHtSerialShippingInsp.getMacAddress())) {
//						return false;
//					}
//				}
//			}
//			lstWHtSerialShippingInsp.add(wHtSerialShippingInsp);
		}
		return true;
	}

	/**
	 * <h2>シリアル登録(出荷)ワークのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークのデータを取得する。
	 * 対象データが存在しない、且つ出庫ステータスが"25"(出庫指示済)以外の場合は、falseを返す。
	 * 対象データが存在しない、出庫ステータスが"25"(出庫指示済)、且つ他でピッキング中の場合は、falseを返す。
	 * 上記以外の場合は、trueを返す。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：荷主ID・センタID・MACアドレス・センタCD・荷主CD・出庫作業No.
	 * @param packingStatus 梱包ステータス
	 * @return boolean true:シリアル登録(出荷)ワーク存在;false:シリアル登録(出荷)ワーク存在しない
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public boolean checkWHtSerialShippingInsp(WHtSerialShippingInsp wHtSerialShippingInsp, CDef.PackingStatus packingStatus) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe E
		//出荷検品ワークテーブルのデータ取得
		WHtSerialShippingInspCB wHtSerialShippingInspCB = wHtSerialShippingInspBhv.newMyConditionBean();
		wHtSerialShippingInspCB.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		wHtSerialShippingInspCB.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		wHtSerialShippingInspCB.query().setMacAddress_Equal(wHtSerialShippingInsp.getMacAddress());

		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = wHtSerialShippingInspBhv.selectList(wHtSerialShippingInspCB);
		if (lstWHtSerialShippingInsp.size() == 0) {
//			if (packingStatus.equals(CDef.CenterPackingStatus.$25)) {
//				//他で出荷ピッキング中チェック
//				THtComctlCB tHtComctlCB = tHtComctlBhv.newMyConditionBean();
//				tHtComctlCB.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
//				tHtComctlCB.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
//				tHtComctlCB.query().setHtDataKbn_LikeSearch("SerialShippingInspection", new LikeSearchOption().likePrefix());
//				tHtComctlCB.query().setSgyKey_Equal(wHtSerialShippingInsp.getPickingWorkNo());
//
//				List<THtComctl> lstTHtComctl = tHtComctlBhv.selectList(tHtComctlCB);
//				if (lstTHtComctl.size() > 0) {
//					for (THtComctl tHtComctl : lstTHtComctl){
//						if (!tHtComctl.getMacAddress().equals(wHtSerialShippingInsp.getMacAddress())) {
//							return false;
//						}
//					}
//				}
//				lstWHtSerialShippingInsp.add(wHtSerialShippingInsp);
//			} else {
//				return false;
//			}
		}
		return true;
	}
	// [エンハンス（16下）Source2.3] シリアル登録(出荷) 2017.02.10 sja End
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
