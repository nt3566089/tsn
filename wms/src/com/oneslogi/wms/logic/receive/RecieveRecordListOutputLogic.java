/**
 * 入荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordRCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷実績リスト出力ロジッククラス
 */
public class RecieveRecordListOutputLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreRecordRBhv tStoreRecordRBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.27 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.27 miyabe End

	/**
	 * <h2>入荷実績リストデータ取得。</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する。
	 * 取得データが0件チェック
	 *
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・入庫実績ボディ
	 * ・入庫実績ヘッダ
	 * ・入荷予定ボディ
	 * ・入荷予定ヘッダ
	 * ・入庫実績帳票
	 * ・取引先マスタ
	 * ・商品マスタ
	 * ・在庫区分マスタ
	 * ・処理区分マスタ
	 * ・ロケーションマスタ
	 * ・ゾーンマスタ
	 * ・倉庫マスタ
	 * ・入庫№
	 * ・センタ区分値明細
	 * ・辞書ビュー
	 *
	 * 【パラメータの使用項目】
	 *  (入庫実績帳票)
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param report 入庫実績帳票
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	public List<TStoreRecordB> select(TStoreRecordR report, ErrorStatus errSts){

		List<TStoreRecordB> result = null;

		//==== 入庫実績ボディデータ取得 =====

		// 検索条件の設定
		TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();

		// 入庫実績ヘッダ
		cb.setupSelect_TStoreRecordH();
		// 入庫実績帳票
		cb.setupSelect_TStoreRecordH().withTStoreRecordRAsOne();
		// 入荷予定ヘッダ
		cb.setupSelect_TStoreRecordH().withTReceivePlanH();
		// 入荷予定ボディ
		cb.setupSelect_TReceivePlanB();
		// 取引先マスタ（仕入先）
		cb.setupSelect_TStoreRecordH().withMCustomerBySupplierId();
		// 取引先マスタ（預託先）
		cb.setupSelect_TStoreRecordH().withMCustomerByDepositId();
		// 処理区分マスタ
		cb.setupSelect_TStoreRecordH().withMProcessType();
		// 辞書ビュー（処理区分名称）
		cb.setupSelect_TStoreRecordH().withMProcessType().withVDict(this.getCultureId());
		// 商品マスタ
		cb.setupSelect_TReceivePlanB().withMProduct();
		// 在庫区分マスタ
		cb.setupSelect_TStoreRecordH().withMStockType();
		// 在庫区分マスタ（在庫区分名称）
		cb.setupSelect_TStoreRecordH().withMStockType().withVDict(this.getCultureId());
		// ロケーションマスタ
		cb.setupSelect_MLocation();
		// ゾーンマスタ
		cb.setupSelect_MLocation().withMZone();
		// 倉庫マスタ
		cb.setupSelect_MLocation().withMZone().withMWarehouse();
		// 入庫№
		cb.specify().derivedTStockInoutList().max(new SubQuery<TStockInoutCB>() {
			@Override
			public void query(TStockInoutCB subCB) {
				// 入庫ラベルNo.
				subCB.specify().specifyTStock().specifyTStoreNo().columnStoreLabelNo();
				setDelFlg(subCB);
			}
		}, TStoreRecordB.ALIAS_storeLabelNo);
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start
		// 荷主
		cb.setupSelect_TStoreRecordH().withMClient();
		// センタ
		cb.setupSelect_TStoreRecordH().withMCenter();
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add End
		// 検索条件の設定
		cb.query().queryTStoreRecordH().queryTStoreRecordRAsOne().setControlNo_Equal(report.getControlNo());

		// ソート順の設定
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start
		cb.query().queryTStoreRecordH().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryTStoreRecordH().queryMCenter().addOrderBy_CenterCd_Asc();
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start
		cb.query().queryTReceivePlanB().queryTReceivePlanH().addOrderBy_ReceivePlanDt_Asc();
		cb.query().queryTReceivePlanB().queryTReceivePlanH().addOrderBy_PlanClientReceiveNo_Asc();
		cb.query().queryTReceivePlanB().queryTReceivePlanH().addOrderBy_ReceiveSlipNo_Asc();
		cb.query().queryTReceivePlanB().queryTReceivePlanH().addOrderBy_ReceiveDeliveryStatus_Asc();
		cb.query().queryTReceivePlanB().addOrderBy_LineNo_Asc();
		cb.query().queryTReceivePlanB().addOrderBy_ProductCd_Asc();

		result = selectList(tStoreRecordBBhv, cb);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
		} else {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.27 miyabe Start
			// 区分値明細マスタより取得
			BClassDtlCB cbCCD = bClassDtlBhv.newConditionBean();
			cbCCD.specify().columnClassDtlCd();
			cbCCD.specify().columnDictId();
			// 区分値マスタ
			cbCCD.setupSelect_BClass();
			cbCCD.specify().specifyBClass().columnClassCd();
			cbCCD.setupSelect_VDict(this.getCultureId());
			cbCCD.specify().specifyVDict().columnDictNm();
			// 検索条件
			List<String> classCdList = new ArrayList<String>();
			classCdList.add("RECEIVE_DELIVERY_STATUS");//入荷納品ステータス
			classCdList.add("STORE_FLG");//入庫格納フラグ
			cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
			cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
			// ソート条件
			cbCCD.query().addOrderBy_ClassDtlCd_Asc();
			List<BClassDtl> bClassList = bClassDtlBhv.selectList(cbCCD);
			Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

			// センタ区分値をMapに変換
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
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.27 miyabe End

			// 区分値マスタの名称の設定
			for (TStoreRecordB tStoreRecordB : result) {
				if (bClassMap.containsKey("RECEIVE_DELIVERY_STATUS")) {
					if (bClassMap.get("RECEIVE_DELIVERY_STATUS").containsKey(tStoreRecordB.getTStoreRecordH().getTReceivePlanH().getReceiveDeliveryStatus())) {
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
						if (tStoreRecordB.getTStoreRecordH().getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus() == null) {
							tStoreRecordB.getTStoreRecordH().getTReceivePlanH().setBClassDtlByReceiveDeliveryStatus(new BClassDtl());
						}
						if (tStoreRecordB.getTStoreRecordH().getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().getVDict() == null) {
							tStoreRecordB.getTStoreRecordH().getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().setVDict(new VDict());
						}
						tStoreRecordB.getTStoreRecordH().getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().getVDict().setDictNm(bClassMap.get("RECEIVE_DELIVERY_STATUS").get(tStoreRecordB.getTStoreRecordH().getTReceivePlanH().getReceiveDeliveryStatus()));
					}
				}
				if (bClassMap.containsKey("STORE_FLG")) {
					if (bClassMap.get("STORE_FLG").containsKey(tStoreRecordB.getStoreFlg())) {
						if (tStoreRecordB.getBClassDtlByStoreFlg() == null) {
							tStoreRecordB.setBClassDtlByStoreFlg(new BClassDtl());
						}
						if (tStoreRecordB.getBClassDtlByStoreFlg().getVDict() == null) {
							tStoreRecordB.getBClassDtlByStoreFlg().setVDict(new VDict());
						}
						tStoreRecordB.getBClassDtlByStoreFlg().getVDict().setDictNm(bClassMap.get("STORE_FLG").get(tStoreRecordB.getStoreFlg()));
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
					}
				}
				// [#3841]出荷実績抽出、入荷実績抽出における不具合 2018.03.07 sampei Start
				tStoreRecordB.setStoreNum(WCC.toBigDecimal(WCC.stripTrailingZeros(tStoreRecordB.getStoreNum())));
				tStoreRecordB.getTReceivePlanB().setPlanNum(WCC.toBigDecimal(WCC.stripTrailingZeros(tStoreRecordB.getTReceivePlanB().getPlanNum())));
				// [#3841]出荷実績抽出、入荷実績抽出における不具合 2018.03.07 sampei End

			}

		}

		return result;
	}

	/**
	 * <h2>入庫実績帳票更新。</h2>
	 * <pre>
	 * 下記テーブルのデータを更新する。
	 * ・入庫実績帳票
	 *
	 * 【パラメータの使用項目】
	 *  (入庫実績帳票(更新用))
	 *
	 *  (入荷予定ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・入荷ステータス
	 *
	 *  (入庫実績帳票(検索用))
	 * ・出荷実績出力フラグ
	 *
	 * </pre>
	 * @param update 入庫実績帳票(更新用)
	 * @param header 入荷予定ヘッダ
	 * @param report 入庫実績帳票(検索用)
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateControlNo(TStoreRecordR update, TReceivePlanH header, TStoreRecordR report, ErrorStatus errStatus) {

		// ===== 入庫実績帳票データ更新 =====
		TStoreRecordRCB cb = tStoreRecordRBhv.newConditionBean();
		// 入庫実績ヘッダ
		cb.setupSelect_TStoreRecordH();
		// 入荷予定ヘッダ
		cb.setupSelect_TStoreRecordH().withTReceivePlanH();

		// 検索条件
		cb.query().queryTStoreRecordH().setClientId_Equal(header.getClientId());
		cb.query().queryTStoreRecordH().setCenterId_Equal(header.getCenterId());
		cb.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveStatus_Equal(header.getReceiveStatus());
		cb.query().setReceiveRecordOutFlg_Equal(report.getReceiveRecordOutFlg());
		cb.query().setReceiveRecordOutDt_DateFromTo(report.getReceiveRecordOutDt(), report.getReceiveRecordOutDt());

		// ===== 入庫実績帳票の更新 =====
		tStoreRecordRBhv.queryUpdate(update, cb);

	}

	/**
	 * <h2>入荷実績出力フラグ更新。</h2>
	 * <pre>
	 * 下記テーブルのデータを更新する。
	 * ・入庫実績帳票
	 *
	 * 【パラメータの使用項目】
	 *  (入庫実績帳票(更新用))
	 *  ・コントロールNo.(NULL)
	 *
	 *  (入庫実績帳票(検索用))
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param update 入庫実績帳票(更新用)
	 * @param report 入庫実績帳票(検索用)
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateReceiveRecordOutFlg(TStoreRecordR update, TStoreRecordR report, ErrorStatus errStatus){

		// ===== 入庫実績帳票データ更新 =====

		// 更新条件を作成
		TStoreRecordRCB cb = tStoreRecordRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());
		// ===== 出庫帳票の更新 =====
		tStoreRecordRBhv.queryUpdate(update, cb);

	}

}

