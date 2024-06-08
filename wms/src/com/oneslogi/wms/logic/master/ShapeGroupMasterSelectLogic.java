////////////////////////////////////////////////////////////////////////////////
// Date:
//     Wed Nov 18 13:27:58 CST 2015
// changed by:coverage tool (Language:Java, Version :08-02)
////////////////////////////////////////////////////////////////////////////////
package com.oneslogi.wms.logic.master;
import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿グループマスタメンテナンス取得ロジッククラス
 */
public class ShapeGroupMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MShapeGrpBhv mshapegrpBhv;
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;
	// [Ver3.0] unit of measure対応 2017.12.14 NING End

	/**
	 * <h2>荷姿グループマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷姿グループマスタメンテナンス情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mShapeGrp 荷姿グループマスタ：削除フラグ・センタID・荷姿グループCD・荷姿グループ名称
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MShapeGrp> 荷姿グループマスタリスト
	 */
	public PagingResultBean<MShapeGrp> select(MShapeGrp mShapeGrp, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MShapeGrp> result = null;
		//==== 荷姿グループメンテナンスデータ取得 =====
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MShapeGrpCB cb = mshapegrpBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		//小数有無フラグ
		cb.setupSelect_BClassDtlByDecimalExistFlg();
		cb.setupSelect_BClassDtlByDecimalExistFlg().withVDict(getCultureId());
		//削除フラグ
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		//削除フラグ
		cb.query().setDelFlg_Equal(mShapeGrp.getDelFlg());
		//小数有無フラグ
		cb.query().setDecimalExistFlg_Equal(mShapeGrp.getDecimalExistFlg());
		// 荷主IDの設定
		cb.query().setClientId_Equal(mShapeGrp.getClientId());
		// 荷姿グループCDの設定
		cb.query().setShapeGrpCd_PrefixSearch(mShapeGrp.getShapeGrpCd());
		// 荷姿グループ名称の設定
		cb.query().setShapeGrpName_LikeSearch(mShapeGrp.getShapeGrpName(), new LikeSearchOption().likeContain());
		cb.query().setDelFlg_Equal(mShapeGrp.getDelFlg());

		// ソート順の設定
		cb.query().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().addOrderBy_ShapeGrpCd_Asc();

		// ===== 荷姿グループメンテナンスマスタ検索実行 =====
		result = selectPage(mshapegrpBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}else{
			return result;
		}
  	}

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>荷姿グループマスタを取得する。</h2>
	 * <pre>
	 * 引数によりデータベースから荷姿グループマスタメンテナンス情報を取得する。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param shapeGrpCd 荷姿グループCD
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public MShapeGrp selectByClientIdAndGrpCd(Long clientId, String shapeGrpCd) {
		MShapeGrp result = null;
		// 検索条件の設定
		MShapeGrpCB cb = mshapegrpBhv.newMyConditionBean();
		cb.query().setClientId_Equal(clientId);
		cb.query().setShapeGrpCd_Equal(shapeGrpCd);
		result = mshapegrpBhv.selectEntity(cb);
		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End

	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	/**
	 * <h2>荷姿グループ詳細マスタを取得する。</h2>
	 *
	 * <pre>
	 * 引数によりデータベースから荷姿グループ詳細マスタ情報を取得する。
	 * </pre>
	 *
	 * @param clientCd 荷主CD
	 * @param shapeGrpCd 荷姿グループCD
	 *
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public ListResultBean<MShapeGrpDtl> selectDtlByClientCdAndProductCd(String clientCd, String shapeGrpCd) {

		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();

		cb.setupSelect_MShapeGrp();
		cb.setupSelect_MShapeGrp().withMClient();
		cb.setupSelect_MShape().withVDictByShapeDictId(getCultureId());

		cb.query().queryMShapeGrp().setShapeGrpCd_Equal(shapeGrpCd);
		cb.query().queryMShapeGrp().queryMClient().setClientCd_Equal(clientCd);
		cb.query().setShapeSort_Equal(new Long(1));

		ListResultBean<MShapeGrpDtl> mShapeGrpDtl = mShapeGrpDtlBhv.selectList(cb);

		return mShapeGrpDtl;
	}

	/**
	 * <h2>荷姿グループマスタを取得する。</h2>
	 *
	 * <pre>
	 * 引数によりデータベースから荷姿グループマスタ情報を取得する。
	 * </pre>
	 *
	 * @param shapeGrpId 荷姿グループID
	 *
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public MShapeGrp selectShapeGrpById(Long shapeGrpId) {

		MShapeGrp shapeGrp = mshapegrpBhv.selectByPKValue(shapeGrpId);

		return shapeGrp;
	}

	/**
	 * <h2>荷姿グループ詳細マスタを取得する。</h2>
	 *
	 * <pre>
	 * 引数によりデータベースから荷姿グループ詳細マスタ情報を取得する。
	 * </pre>
	 *
	 * @param clientCd 荷主CD
	 * @param productCd 商品CD
	 * @param shapeGrpCd 荷姿CD
	 *
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public ListResultBean<MShapeGrpDtl> selectShapeGrpDtlByCd(final String clientCd, final String productCd, String shapeCd) {

		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();

		cb.setupSelect_MShape();
		cb.setupSelect_MShapeGrp();
		cb.setupSelect_MShapeGrp().withMClient();

		cb.query().queryMShape().setShapeCd_Equal(shapeCd);
		cb.query().queryMShapeGrp().queryMClient().setClientCd_Equal(clientCd);

		ListResultBean<MShapeGrpDtl> shapeGrpDtlResult = mShapeGrpDtlBhv.selectList(cb);

		if (productCd != null) {
			mShapeGrpDtlBhv.loadMProductShapeList(shapeGrpDtlResult, new ConditionBeanSetupper<MProductShapeCB>() {
				@Override
				public void setup(MProductShapeCB mProductShapeCB) {
					mProductShapeCB.setupSelect_MProduct();
					mProductShapeCB.query().queryMProduct().queryMClient().setClientCd_Equal(clientCd);
					mProductShapeCB.query().queryMProduct().setProductCd_Equal(productCd);
				}
			});
		}

		return shapeGrpDtlResult;
	}
	// [Ver3.0] unit of measure対応 2017.12.14 NING End
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	/**
	 * <h2>すべて最小荷姿グループ詳細マスタを取得する。</h2>
	 *
	 * <pre>
	 * 引数によりデータベースからすべて最小荷姿情報を取得する。
	 * </pre>
	 *
	 * @param clientCd 荷主CD
	 *
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public ListResultBean<MShapeGrpDtl> selectAllShapeGrpDtl(final String clientCd, final String productCd) {

		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();

		cb.query().queryMShapeGrp().queryMClient().setClientCd_Equal(clientCd);
		cb.query().setShapeSort_Equal(1l);

		ListResultBean<MShapeGrpDtl> shapeGrpDtlResult = mShapeGrpDtlBhv.selectList(cb);

		if (productCd != null) {
			mShapeGrpDtlBhv.loadMProductShapeList(shapeGrpDtlResult, new ConditionBeanSetupper<MProductShapeCB>() {
				@Override
				public void setup(MProductShapeCB mProductShapeCB) {
					mProductShapeCB.setupSelect_MProduct();
					mProductShapeCB.query().queryMProduct().queryMClient().setClientCd_Equal(clientCd);
					mProductShapeCB.query().queryMProduct().setProductCd_Equal(productCd);
				}
			});
		}

		return shapeGrpDtlResult;
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING End
}
