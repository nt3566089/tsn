/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷実績リスト出力ロジッククラス
 */
public class ShippingRecordListOutputLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
	/**
	 * <h2>出荷実績リストデータ取得。</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する。
	 * 取得データが0件チェック
	 *
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・梱包ボディ
	 * ・梱包ヘッダ
	 * ・出庫ボディ
	 * ・出庫ヘッダ
	 * ・出庫帳票
	 * ・引当指示ボディ
	 * ・引当指示ヘッダ
	 * ・出荷指示ボディ
	 * ・出荷指示ヘッダ
	 * ・取引先マスタ
	 * ・商品マスタ
	 * ・荷材マスタ
	 * ・配送コースマスタ
	 * ・センタ運送業者マスタ
	 * ・センタ区分値明細
	 * ・辞書ビュー
	 *
	 * 【パラメータの使用項目】
	 *  (出庫帳票)
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param report 出庫帳票
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<TPackingB> 梱包ボディリスト
	 */
	public List<TPackingB> select(TPickingR report, ErrorStatus errSts){

		List<TPackingB> result = null;

		// ==== 梱包ボディデータ取得 =====

		// 検索条件の設定
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		// 梱包ヘッダ
		cb.setupSelect_TPackingH();
		// 荷主マスタ
		cb.setupSelect_TPackingH().withMClient();
		// センタマスタ
		cb.setupSelect_TPackingH().withMCenter();
		// 引当指示ヘッダ
		cb.setupSelect_TPackingH().withTAllocInstH();
		// 荷材マスタ
		cb.setupSelect_TPackingH().withMBox();
		// 出庫ヘッダ
		cb.setupSelect_TPackingH().withTPickingH();
		// 納品先
		cb.setupSelect_TPackingH().withTAllocInstH().withMCustomerBySupplyCustomerId();
		// 届先
		cb.setupSelect_TPackingH().withTAllocInstH().withMCustomerByDelivCustomerId();
		// 配送コースマスタ
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse();
		// センタ運送業者マスタ
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse().withMCarrier();
		// 引当指示ボディ
		cb.setupSelect_TAllocInstB();
		// 商品マスタ
		cb.setupSelect_TAllocInstB().withMProduct();
		// 出庫ボディ
		cb.setupSelect_TPickingB();
		// 出庫帳票
		cb.setupSelect_TPackingH().withTPickingH().withTPickingRAsOne();
		// 顧客出荷指示№
		cb.specify().specifyTAllocInstB().derivedTShippingInstBList().min(new SubQuery<TShippingInstBCB>() {
			@Override
			public void query(TShippingInstBCB subCb) {
				subCb.specify().specifyTShippingInstH().columnClientShippingNo();
			}
		}, TPackingB.ALIAS_clientShippingNo);

		// 検索条件の設定
		cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(report.getControlNo());

		// ソート条件
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start
		// 荷主CD
		cb.query().queryTPackingH().queryMClient().addOrderBy_ClientCd_Asc();
		// センタCD
		cb.query().queryTPackingH().queryMCenter().addOrderBy_CenterCd_Asc();
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add End
		// 出庫作業№
		cb.query().queryTPackingH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		// 出荷梱包№
		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();
		// 梱包ボディID
		cb.query().addOrderBy_PackingBId_Asc();

		result = selectList(tPackingBBhv, cb);

		// ===== ０件チェック =====
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
			cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
			cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
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
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
			// 区分値マスタの名称の設定
			for (TPackingB tPackingB : result) {
				if (bClassMap.containsKey("PICKING_STATUS")) {
					if (bClassMap.get("PICKING_STATUS").containsKey(tPackingB.getTPackingH().getTPickingH().getPickingStatus())) {
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
						if (tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus() == null) {
							tPackingB.getTPackingH().getTPickingH().setBClassDtlByPickingStatus(new BClassDtl());
						}
						if (tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus().getVDict() == null) {
							tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus().setVDict(new VDict());
						}

						tPackingB.getTPackingH().getTPickingH().getBClassDtlByPickingStatus().getVDict().setDictNm(bClassMap.get("PICKING_STATUS").get(tPackingB.getTPackingH().getTPickingH().getPickingStatus()));
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
					}
				}
				// [#3841]出荷実績抽出、入荷実績抽出における不具合 2018.03.07 sampei Start
				tPackingB.setPackingNum(WCC.toBigDecimal(WCC.stripTrailingZeros(tPackingB.getPackingNum())));
				// [#3841]出荷実績抽出、入荷実績抽出における不具合 2018.03.07 sampei End
			}

		}

		return result;
	}

	/**
	 * <h2>出庫帳票更新。</h2>
	 * <pre>
	 * 下記テーブルのデータを更新する。
	 * ・出庫帳票
	 *
	 * 【パラメータの使用項目】
	 *  (出庫帳票(更新用))
	 *
	 *  (出庫ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・出庫ステータス
	 *
	 *  (出帳票(検索用))
	 * ・出荷実績出力フラグ
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param header 出庫ヘッダ
	 * @param report 出庫帳票(検索用)
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateControlNo(TPickingR update, TPickingH header, TPickingR report, ErrorStatus errStatus) {

		// ===== 出庫帳票データ更新 =====
		TPickingRCB cb = tPickingRBhv.newConditionBean();
		cb.setupSelect_TPickingH();

		// 検索条件
		cb.query().queryTPickingH().setClientId_Equal(header.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(header.getCenterId());
		cb.query().queryTPickingH().setPickingStatus_Equal(header.getPickingStatus());
		cb.query().setShippingRecordOutFlg_Equal(report.getShippingRecordOutFlg());
		cb.query().setShippingRecordOutDt_DateFromTo(report.getShippingRecordOutDt(), report.getShippingRecordOutDt());

		// ===== 出庫帳票の更新 =====

		tPickingRBhv.queryUpdate(update, cb);

	}

	/**
	 * <h2>出荷実績出力フラグ更新。</h2>
	 * <pre>
	 * 下記テーブルのデータを更新する。
	 * ・出庫帳票
	 *
	 * 【パラメータの使用項目】
	 *  (出庫帳票(更新用))
	 *  ・コントロールNo.(NULL)
	 *
	 *  (出庫帳票(検索用))
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param report 出庫帳票(検索用)
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateShippingRecordOutFlg(TPickingR update, TPickingR report, ErrorStatus errStatus){

		// ===== 出庫帳票データ更新 =====

		// 更新条件を作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());
		// ===== 出庫帳票の更新 =====
		tPickingRBhv.queryUpdate(update, cb);

	}

}

