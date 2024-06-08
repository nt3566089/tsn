package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MSetParentBhv;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSetParent;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ProductLogic;

/**
 * セット品構成マスタメンテナンス登録ロジッククラス
 */
public class SetStructureEditInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MSetParentBhv mSetParentBhv;
	@Inject
	private MSetStructureBhv mSetStructureBhv;
	@Inject
	private ProductLogic productLogic;

	/**
	 * <h2>セット品構成マスタを登録する。</h2>
	 * <pre>
	 * 引数で受け取ったデータをセット品親マスタ、セット品構成マスタに登録する。
	 * </pre>
	 * @param mSetParent セット品親マスタ：全項目
	 * @param mSetStructureList セット品構造マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MSetParent mSetParent, List<MSetStructure> mSetStructureList, ErrorStatus errSts) {
		//セット品親マスタの登録実行
		mSetParentBhv.insert(mSetParent);

		// =====  セット品構成マスタ登録実行 =====
		for(MSetStructure mSetStructureEnt : mSetStructureList){
			// 商品ID取得
			MProduct mProduct = new MProduct();
			mProduct.setClientId(mSetParent.getMProduct().getClientId());
			mProduct.setProductCd(mSetStructureEnt.getMProduct().getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);

			// 親ID
			mSetStructureEnt.setSetParentId(mSetParent.getSetParentId());
			// 商品ID
			mSetStructureEnt.setProductId(mProduct.getProductId());
			mSetStructureBhv.insert(mSetStructureEnt);
		}
	}
}