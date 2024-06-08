package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 商品マスタメンテナンス取得ロジッククラス。
 */
public class ProductMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;
	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(商品マスタ受信テーブル関連処理削除) 2016.09.09 honma
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	@Inject
	private MShapeGrpBhv mShapeGrpBhv;
	// [Ver3.0] unit of measure対応 2017.12.21 NING End

	/**
	 * <h2>商品マスタデータを取得する。</h2>
	 * <pre>
	 * 商品マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 商品マスタ：荷主ID・商品CD・JANCD・商品名称・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MProduct> 商品マスタリスト
	 */
	public PagingResultBean<MProduct> selectByConditions(MProduct header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MProduct> result = null;
		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MProductCB cb = mProductBhv.newMyConditionBean();
		//荷主センタ変更対応 201７.02.07 sja Start
		cb.setupSelect_MClient();
		//荷主センタ変更対応 201７.02.07 sja End

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		//ロット管理フラグ
		cb.setupSelect_BClassDtlByLotManagFlg();
		cb.setupSelect_BClassDtlByLotManagFlg().withVDict(getCultureId());

		//期限日管理フラグ
		cb.setupSelect_BClassDtlByLimitDtManagFlg();
		cb.setupSelect_BClassDtlByLimitDtManagFlg().withVDict(getCultureId());

		//期限日逆転防止フラグ
		cb.setupSelect_BClassDtlByLimitDtReverseFlg();
		cb.setupSelect_BClassDtlByLimitDtReverseFlg().withVDict(getCultureId());

		//ロット逆転防止フラグ
		cb.setupSelect_BClassDtlByLotReverseFlg();
		cb.setupSelect_BClassDtlByLotReverseFlg().withVDict(getCultureId());

		//入庫No.マージ区分
		cb.setupSelect_BClassDtlByMergeCls();
		cb.setupSelect_BClassDtlByMergeCls().withVDict(getCultureId());

		// 米国出荷ドキュメント追加対応 2018.01.03 LSW Start
		//Freight Class
		cb.setupSelect_BClassDtlByFreightCls();
		cb.setupSelect_BClassDtlByFreightCls().withVDict(getCultureId());
		// 米国出荷ドキュメント追加対応 2018.01.03 LSW End

		//出荷停止フラグ
		cb.setupSelect_BClassDtlByShippingStopFlg();
		cb.setupSelect_BClassDtlByShippingStopFlg().withVDict(getCultureId());
		// [横並-006] 削除フラグを追加 2014.11.26 taoys Start
		//削除フラグ
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [横並-006] 削除フラグを追加 2014.11.26 taoys End
		// [1.1.4-CT-001] ケース入数の表示不正を修正 2016.05.12 kawana Start
		// 商品荷姿(ケース荷姿)
		// [Ver3.0] unit of measure対応 2017.11.21 潘 Del
		// [1.1.4-CT-001] ケース入数の表示不正を修正 2016.05.12 kawana End

		// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
		cb.setupSelect_MShapeGrp();
		// [Ver3.0] unit of measure対応 2017.11.28 潘 End

		//荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());
		//商品CDの設定
		cb.query().setProductCd_PrefixSearch(header.getProductCd());
		//JANCDの設定
		cb.query().setJanCd_PrefixSearch(header.getJanCd());
		//商品名称の設定
		cb.query().setProductNm_LikeSearch(header.getProductNm(), new LikeSearchOption().likeContain());
		//削除フラグの設定
		cb.query().setDelFlg_Equal(header.getDelFlg());

		//ソート順の設定
		cb.query().addOrderBy_ProductCd_Asc();

		result = selectPage(mProductBhv, cb, paging);

		// [1.1.4-CT-001] ケース入数の表示不正を修正(不要な処理を削除) 2016.05.12 kawana

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [Ver3.0] unit of measure対応 2017.11.21 潘 Start
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
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

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

		for (int i = 0; i < result.size(); i++)

		{
			// 在庫管理単位CD
			result.get(i).setInventoryManagementUnitCd(shapeGrpCdMap.get(result.get(i).getProductId()));
			//在庫管理単位名称
			result.get(i).setInventoryManagementUnitNm((unitNmMap.get(result.get(i).getProductId()) + "(" + shapeGrpNmMap.get(result.get(i).getProductId())+")"));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 入数内訳
			result.get(i).setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, result.get(i)));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
	    }
		// [Ver3.0] unit of measure対応 2017.11.21 潘 End

		return result;
	}

	/**
	 * <h2>商品マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに商品マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 商品マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MProduct> 商品マスタリスト
	 */
	public List<MProduct> selectById(MProduct header, ErrorStatus errSts) {

		List<MProduct> result = null;

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MProductCB cb = mProductBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		cb.setupSelect_MShapeGrp();
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		//商品IDの設定
		cb.query().setProductId_Equal(header.getProductId());
		result = mProductBhv.selectList(cb);

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		} else {
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			// 商品荷姿マスタ
			mProductBhv.loadMProductShapeList(result, new ConditionBeanSetupper<MProductShapeCB>(){
				public void setup(MProductShapeCB pcb){
					pcb.setupSelect_MShapeGrpDtl().withMShapeGrp();
					pcb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add Start
					pcb.query().setDelFlg_Equal_$0();
					// [#3816][Ver3.0] 商品マスタメンテナンス(編集) - 削除済データを未削除データへ更新不可 2018.02.27 honma Add End
				}
			});
			// [Ver3.0] unit of measure対応 2017.12.14 NING End
		}
		return result;
	}

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
	/**
	 * <h2>区分値マスタにデータを取得する。</h2>
	 *<pre>
	 * 引数をキーに区分値マスタにデータを取得する。
	 * </pre>
	 * @param classCd 区分値CD
	 * @return ListResultBean<BClassDtl> センタ区分値明細マスタリスト
	 */
	public ListResultBean<BClassDtl> getBClassList(String classCd) {
		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		return bClassDtlBhv.selectList(cb);
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(商品マスタ受信テーブル関連処理削除) 2016.09.09 honma

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/14 Start
	/**
	 * <h2>商品ラベルデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに商品マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 商品マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MProduct> 商品マスタリスト
	 */
	public List<MProduct> selectReportInfo(MProduct header, ErrorStatus errSts) {

		List<MProduct> result = null;

		//検索条件の設定
		MProductCB cb = mProductBhv.newMyConditionBean();
		//商品IDの設定
		cb.query().setProductId_Equal(header.getProductId());
		result = mProductBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return result;
	}
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/14 End
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	/**
	 * <h2>商品に紐付く在庫管理単位の最小荷姿を取得する。</h2>
	 * <pre>
	 * 商品に紐付く在庫管理単位の最小荷姿を取得する。
	 * </pre>
	 * @param productCd 商品CD
	 * @param clientCd 荷主CD
	 * @return List<MProduct> 商品マスタリスト
	 */
	public List<MProduct> selectProductByCd(String productCd, String clientCd) {

		List<MProduct> result = null;

		//検索条件の設定
		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp().withMClient();

		cb.query().setProductCd_Equal(productCd);
		cb.query().queryMShapeGrp().queryMClient().setClientCd_Equal(clientCd);
		result = mProductBhv.selectList(cb);

		List<MShapeGrp> shapeGrpList = new ArrayList<MShapeGrp>();

		for (Iterator<MProduct> iterator = result.iterator(); iterator.hasNext();) {
			MProduct mProduct = iterator.next();
			shapeGrpList.add(mProduct.getMShapeGrp());
		}

		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		mShapeGrpBhv.loadMShapeGrpDtlList(shapeGrpList, new ConditionBeanSetupper<MShapeGrpDtlCB>() {
			public void setup(MShapeGrpDtlCB subCB) {
				subCB.setupSelect_MShapeGrp();
				subCB.query().setDelFlg_Equal_$0();
				subCB.query().setShapeSort_Equal(1l);
			}
		});

		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING End
}
