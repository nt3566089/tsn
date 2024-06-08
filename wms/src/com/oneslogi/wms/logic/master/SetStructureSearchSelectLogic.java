package com.oneslogi.wms.logic.master;

import java.util.Collections;
import java.util.Comparator;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MSetParentCB;
import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.exbhv.MSetParentBhv;
import com.oneslogi.base.dbflute.exentity.MSetParent;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * セット品構成マスタデータ取得ロジッククラス。
 */
public class SetStructureSearchSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MSetParentBhv mSetParentBhv;


	/**
	 * <h2>セット品構成マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにセット品親マスタからデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 商品マスタ - セット品親マスタ：荷主ID・商品CD・JANCD・商品名称・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MSetParent> セット品構成マスタリスト
	 */
	public PagingResultBean<MSetParent> selectByConditions(MSetParent header, PagingData paging, ErrorStatus errSts) {
		PagingResultBean<MSetParent> result = null;
		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== セット品構成マスタメンテナンス(一覧)データ取得 ======
		MSetParentCB cb = mSetParentBhv.newMyConditionBean();
		// ===== 取得テーブル  =====
		cb.setupSelect_MProduct();
		//荷主センタ変更対応 201７.02.13 sja Start
		cb.setupSelect_MProduct().withMClient();
		//荷主センタ変更対応 201７.02.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// ===== 検索条件 ======
		//荷主IDの設定
		cb.query().queryMProduct().setClientId_Equal(header.getMProduct().getClientId());
		//商品CDの設定
		cb.query().queryMProduct().setProductCd_PrefixSearch(header.getMProduct().getProductCd());
		//JANCDの設定
		cb.query().queryMProduct().setJanCd_PrefixSearch(header.getMProduct().getJanCd());
		//商品名称の設定
		cb.query().queryMProduct().setProductNm_LikeSearch(header.getMProduct().getProductNm(), new LikeSearchOption().likeContain());
		//削除フラグの設定
		cb.query().setDelFlg_Equal(header.getDelFlg());

		// ===== ソート順 ======
		// ソート順の設定
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();

		// ===== 検索実行 =====
		result = selectPage(mSetParentBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>セット品構成マスタデータを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件にセット品親マスタ、セット品構成マスタからデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header セット品親マスタ：親ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MSetParent ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MSetParent selectById(MSetParent header, ErrorStatus errSts) {
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== セット品構成マスタメンテナンス(編集)データ取得 =====
		MSetParentCB cb = mSetParentBhv.newMyConditionBean();
		// ===== 取得テーブル =====
		cb.setupSelect_MProduct();
		cb.setupSelect_MProduct().withMClient();
		// ===== 検索条件 =====
		// 親ID
		cb.query().setSetParentId_Equal(header.getSetParentId());
		// ===== 検索実行 =====
		MSetParent result = mSetParentBhv.selectEntity(cb);

		// ===== ０件チェック =====
		if (result== null) {
			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// セット品構成マスタデータを取得
		mSetParentBhv.loadMSetStructureList(result, new ConditionBeanSetupper<MSetStructureCB>() {
			@Override
			public void setup(MSetStructureCB arg0) {
				arg0.setupSelect_MProduct();
			}
		});

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ソート順
		if(result.getMSetStructureList().size() != 0){
			Collections.sort(result.getMSetStructureList(), new Comparator<MSetStructure>() {
				public int compare(MSetStructure arg0, MSetStructure arg1) {
					return arg0.getMProduct().getProductCd().compareTo(arg1.getMProduct().getProductCd());
				}
			});
		}

		return result;
	}
}
