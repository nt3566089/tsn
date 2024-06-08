package com.oneslogi.wms.logic.assist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 商品マスタデータ取得ロジッククラス
 */
public class ProductListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;

	/**
	 * <h2>商品マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから商品マスタと商品荷姿マスタデータを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 商品マスタ：荷主ID・商品CD・JANCD・商品名称
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MProduct> 商品マスタリスト
	 */
	public PagingResultBean<MProduct> select(MProduct header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MProduct> result = null;

		// ===== 商品データ取得 =====

		// 検索条件の設定
		MProductCB cb = mProductBhv.newMyConditionBean();

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		// 出荷停止フラグ
		cb.setupSelect_BClassDtlByShippingStopFlg();
		cb.setupSelect_BClassDtlByShippingStopFlg().withVDict(getCultureId());

		// 期限日管理フラグ
		cb.setupSelect_BClassDtlByLimitDtManagFlg();
		cb.setupSelect_BClassDtlByLimitDtManagFlg().withVDict(getCultureId());

		// ロット管理フラグ
		cb.setupSelect_BClassDtlByLotManagFlg();
		cb.setupSelect_BClassDtlByLotManagFlg().withVDict(getCultureId());

		// 入庫No.マージフラグ
		cb.setupSelect_BClassDtlByMergeCls();
		cb.setupSelect_BClassDtlByMergeCls().withVDict(getCultureId());

		// ロット逆転防止フラグ
		cb.setupSelect_BClassDtlByLotReverseFlg();
		cb.setupSelect_BClassDtlByLotReverseFlg().withVDict(getCultureId());

		// 期限日逆転防止フラグ
		cb.setupSelect_BClassDtlByLimitDtReverseFlg();
		cb.setupSelect_BClassDtlByLimitDtReverseFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		// 商品CDの設定
		cb.query().setProductCd_PrefixSearch(header.getProductCd());

		// JANCDの設定
		cb.query().setJanCd_PrefixSearch(header.getJanCd());

		// 商品名称の設定
		cb.query().setProductNm_LikeSearch(header.getProductNm(),new LikeSearchOption().likeContain());

		// [Ver3.0][#3569] 商品マスタアシスト画面に在庫管理単位を追加 2018.02.14 shimizu Start
		cb.setupSelect_MShapeGrp();
		// [Ver3.0][#3569] 商品マスタアシスト画面に在庫管理単位を追加 2018.02.14 shimizu End

		// ソート順の設定
		cb.query().addOrderBy_ProductCd_Asc();

		// 検索処理
		result = selectPage(mProductBhv, cb, paging);

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 不要ソース削除 2018.02.21 honma Delete

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		// [Ver3.0][#3569] 商品マスタアシスト画面に在庫管理単位を追加 2018.02.14 shimizu Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		mProductBhv.loadMProductShapeList(result, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB subCB) {
				subCB.setupSelect_MProduct().withMClient();//商品マスタ・荷主マスタ
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();//荷姿グループマスタ明細・荷姿グループマスタ
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());

				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		Map<Long, String> shapeGrpCdMap = new HashMap<>();
		Map<Long, String> shapeGrpNmMap = new HashMap<>();
		Map<Long, String> unitNmMap = new HashMap<>();

		for (MProduct mProduct : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProduct);

			// 荷姿グループCDのMapを作成
			shapeGrpCdMap.put(mProduct.getProductId(), mProduct.getMShapeGrp().getShapeGrpCd());

			// 荷姿グループ名称のMapを作成
			shapeGrpNmMap.put(mProduct.getProductId(), mProduct.getMShapeGrp().getShapeGrpName());

			// 在庫最小単位の荷姿名称のMapを作成
			WmsMultipleShapeUtil.getUnitNmMap(unitNmMap, mProduct);
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		for (int i = 0; i < result.size(); i++) {
			// 在庫管理単位CD
			result.get(i).setInventoryManagementUnitCd(shapeGrpCdMap.get(result.get(i).getProductId()));
			//在庫管理単位名称
			result.get(i).setInventoryManagementUnitNm((unitNmMap.get(result.get(i).getProductId()) + "(" + shapeGrpNmMap.get(result.get(i).getProductId())+")"));
	    }
		// [Ver3.0][#3569] 商品マスタアシスト画面に在庫管理単位を追加 2018.02.14 shimizu End

		return result;
	}
}