/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPackingListUpdatePmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;
/**
 * 梱包明細修正データ取得ジッククラス
 */
public class PackingUpdateSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL
	//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
	@Inject
	private MProductBhv mProductBhv;
	//[Ver3.0] unit of measure対応 2017.11.22 ライ END
	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しデータベースから梱包データを取得する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：センタID・荷主ID・出庫作業No.
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlPackingListUpdate> 梱包明細リスト
	 */
	public PagingResultBean<SqlPackingListUpdate> select(TPickingH tPickingH, PagingData paging, ErrorStatus errSts) {
		PagingResultBean<SqlPackingListUpdate> result = null;

		// 外出しSQLの定義
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		String path = MProductBhv.PATH_selectSqlPackingListUpdate;
		//[Ver3.0] unit of measure対応 2017.11.22 ライ END
		// 検索条件の設定
		SqlPackingListUpdatePmb pmb = setCondition(tPickingH);

		// 検索実行
		Class<SqlPackingListUpdate> entityType = SqlPackingListUpdate.class;
		result = selectPage(mProductBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			return result;
		}
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		List<MProduct> mProductList = new ArrayList<MProduct>();
		for (SqlPackingListUpdate sqlReuslt : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			if (sqlReuslt.prepareDomain() != null) {
				mProductList.add(sqlReuslt.prepareDomain());
			}
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB cb) {
				cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				cb.query().setDelFlg_Equal_$0();
			}
		});

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		//[Ver3.0] unit of measure対応 2017.11.22 ライ END
		// 荷材No.設定
		Long tPackingH = null;
		int boxNo = 0;
		for (SqlPackingListUpdate body : result){

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, body.prepareDomain());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			if (body.getPackingHId().equals(tPackingH) == false) {
				boxNo++;
				body.setBoxNo(String.valueOf(boxNo));
			} else {
				body.setBoxNo(String.valueOf(boxNo));
			}
            body.setUpdateRow("0");
			tPackingH = body.getPackingHId();

			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 入数内訳
			body.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, body.prepareDomain()));
			// [Ver3.0] unit of measure対応 2017.11.22 ライ Start
			//商品单位
			body.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, body.prepareDomain()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.22 ライ Start
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
		}

		return result;
	}

	/**
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param header 出庫ヘッダ
	 * @return SqlPackingListUpdatePmb 梱包明細リスト
	 */
	private SqlPackingListUpdatePmb setCondition(TPickingH header) {
		// 検索条件の設定
		SqlPackingListUpdatePmb pmb = new SqlPackingListUpdatePmb();
		pmb.setCenterCd(String.valueOf(header.getCenterId()));
		pmb.setClientCd(String.valueOf(header.getClientId()));
		pmb.setPickingWorkNo(header.getPickingWorkNo());
		return pmb;
	}
}

