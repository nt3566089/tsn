package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTReceivePlanB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 入荷予定入力データ取得ロジッククラス
 */
public class ReceivePlanInputSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveStatusCheckLogic checkLogic;

	/**
	 * <h2>入荷予定入力データを取得する。</h2>
	 * <pre>
	 * 引数のヘッダIDをキーにデータベースから入荷予定データを取得し、
	 * 【入荷状態のチェック】を行う。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 【入荷状態のチェック】
	 * ・{@link ReceiveStatusCheckLogic#receivePlanUpdate(List, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷状態のチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header 入荷予定ヘッダ：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TReceivePlanB> 入荷予定ボディリスト
	 */
	public List<TReceivePlanB>select(TReceivePlanH header,ErrorStatus errSts) {

		List<TReceivePlanB> result = null;

		// ===== 入荷予定入力データ取得 =====

		// 検索条件の設定
		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();

		cb.setupSelect_TReceivePlanH();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_TReceivePlanH().withTReceivePlanRAsOne();
		cb.setupSelect_TReceivePlanH().withMClient();
		cb.setupSelect_TReceivePlanH().withMCenter();
		cb.setupSelect_TReceivePlanH().withMProcessType();
		cb.setupSelect_TReceivePlanH().withMCustomerByPlanSupplierId();

		cb.setupSelect_TReceivePlanH().withMProcessType().withVDict(getCultureId());

		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.10 hayashi Start
		cb.setupSelect_TReceivePlanH().withMStockType();
		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.10 hayashi End

		// [#2253]予備項目対応 2017.08.18 sampei Start
		cb.setupSelect_TReceivePlanSpareAsOne();
		// [#2253]予備項目対応 2017.08.18 sampei End

		//ヘッダIDの設定
		cb.query().queryTReceivePlanH().setReceivePlanHId_Equal(header.getReceivePlanHId());

		// ソート条件：行No
		cb.query().addOrderBy_LineNo_Asc();

		// 検索実行
		result = tReceivePlanBBhv.selectList(cb);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tReceivePlanBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTReceivePlanB>() {
			public void handle(LoaderOfTReceivePlanB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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
		for (TReceivePlanB receivePlanB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, receivePlanB.getMProduct());
			// 入数内訳
			receivePlanB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, receivePlanB.getMProduct()));
			// 商品最小荷姿単位名称
			receivePlanB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, receivePlanB.getMProduct()));
		}
		// [Ver3.0] unit of measure対応 2017.11.28 潘 End

		// ===== 入荷状態チェック =====
        List<TReceivePlanH> headerList = new ArrayList<TReceivePlanH>();
        headerList.add(result.get(0).getTReceivePlanH());
        checkLogic.receivePlanUpdate(headerList,null,null,errSts);

		return result;
	}

}
