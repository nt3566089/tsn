package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MShapeBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿マスタデータ取得ロジッククラス
 */
public class ShapeMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MShapeBhv mShapeBhv;
	// [Ver3.0] unit of measure対応 2017.12.14 潘 Del
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;
	// [Ver3.0] unit of measure対応 2017.12.04 NING End


	/**
	 * <h2>荷姿マスタデータを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件に荷姿マスタからデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mShape 荷姿マスタ：荷姿CD・削除フラグ、辞書マスタビュー：辞書名、荷主マスタ：荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MShape> 荷姿マスタデータのリスト
	 */
	public List<MShape> select(MShape mShape, ErrorStatus errSts) {

		List<MShape> result = null;

		// ===== 荷姿マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MShapeCB cb = mShapeBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
		cb.setupSelect_VDictByShapeDictId(getCultureId());
		cb.setupSelect_VDictByShapeUnitDictId(getCultureId());
		// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
		// 荷姿CDの設定
		cb.query().setShapeCd_PrefixSearch(mShape.getShapeCd());
		// 処理区分名称の設定
		if (mShape.getVDictByShapeDictId() != null) {
			cb.query().queryVDictByShapeDictId(getCultureId()).setDictNm_PrefixSearch(mShape.getVDictByShapeDictId().getDictNm());
		}
		//削除フラグの設定
		cb.query().setDelFlg_Equal(mShape.getDelFlg());
		// ソート順の設定
		cb.query().addOrderBy_ShapeCd_Asc();

		// ===== 荷姿マスタ検索実行 =====
		result = mShapeBhv.selectList(cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	// [Ver3.0] unit of measure対応 2017.12.04 NING Del

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>荷姿マスタと商品荷姿マスタデータを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件に荷姿マスタ、商品荷姿マスタ、パラメータマスタからデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param clientCd 荷主マスタ：荷主CD
	 * @param shapeGrpCd 荷姿グループマスタ：荷姿グループCD
	 * @param productCd 商品マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MShape> 荷姿マスタデータのリスト
	 */
	public List<MShapeGrpDtl> selectProductShapeList(final String clientCd, String shapeGrpCd, final String productCd, ErrorStatus errSts) {

		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newConditionBean();
		// 荷姿マスタ
		cb.setupSelect_MShape();
		cb.setupSelect_MShape().withVDictByShapeDictId(getCultureId());
		cb.setupSelect_MShape().withVDictByShapeUnitDictId(getCultureId());

		// 荷姿グループマスタ
		cb.setupSelect_MShapeGrp();
		// 荷主マスタ
		cb.setupSelect_MShapeGrp().withMClient();

		cb.query().queryMShapeGrp().setShapeGrpCd_Equal(shapeGrpCd);
		cb.query().queryMShapeGrp().queryMClient().setClientCd_Equal(clientCd);

		// ソート順の設定
		cb.query().addOrderBy_ShapeSort_Asc();

		// 荷姿グループ明細マスタ検索実行
		List<MShapeGrpDtl> shapeGrpDtlResult = mShapeGrpDtlBhv.selectList(cb);

		if (productCd != null) {
			// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add Start
			// 変更前の設定
			boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();
			// 削除フラグの自動設定を無効化
			this.setBehaviorAutoDelFlg(false);
			// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add End
			mShapeGrpDtlBhv.loadMProductShapeList(shapeGrpDtlResult, new ConditionBeanSetupper<MProductShapeCB>() {
				@Override
				public void setup(MProductShapeCB mProductShapeCB) {
					mProductShapeCB.setupSelect_MProduct();
					mProductShapeCB.query().queryMProduct().queryMClient().setClientCd_Equal(clientCd);
					mProductShapeCB.query().queryMProduct().setProductCd_Equal(productCd);
					// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add Start
					mProductShapeCB.query().setDelFlg_Equal_$0();
					// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add End
				}
			});
			// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add Start
			//削除フラグの自動設定を戻す
			this.setBehaviorAutoDelFlg(beforeAutoDelFlg);
			// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add End
		}

//		// 選択された商品の商品荷姿が不存在場合
		for (Iterator<MShapeGrpDtl> iterator = shapeGrpDtlResult.iterator(); iterator.hasNext();) {
			MShapeGrpDtl mShapeGrpDtl = iterator.next();
			if (mShapeGrpDtl.getMProductShapeList() == null || mShapeGrpDtl.getMProductShapeList().size() <= 0) {
				MProductShape mproductShape = new MProductShape();
				mproductShape.setUnitNum(0l);
				ArrayList<MProductShape> mProductShapeList = new ArrayList<MProductShape>();
				mProductShapeList.add(mproductShape);
				mShapeGrpDtl.setMProductShapeList(mProductShapeList);
			}
		}

		// 入数単位の取得処理
		// 上記取得結果をループする
		// 入数単位＝ループ回数-1行目の荷姿マスタ．荷姿単位と紐付く辞書名
		// ループ1行目の入数単位が空白とする
		if (shapeGrpDtlResult.size() > 1) {
			for (int i = 1; i < shapeGrpDtlResult.size(); i++) {
				MShapeGrpDtl childShapeGrpDtl = shapeGrpDtlResult.get(i);
				MShapeGrpDtl parentShapeGrpDtl = shapeGrpDtlResult.get(i - 1);

				MProductShape childProductShape = childShapeGrpDtl.getMProductShapeList().get(0);
//				MProductShape parentProductShape = parentShapeGrpDtl.getMProductShapeList().get(0);

				childProductShape.setUnitNumUnit(parentShapeGrpDtl.getMShape().getVDictByShapeUnitDictId().getDictNm());
			}
		}

		return shapeGrpDtlResult;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
}