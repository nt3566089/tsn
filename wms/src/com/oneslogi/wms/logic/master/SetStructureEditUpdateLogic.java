package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.exbhv.MSetParentBhv;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSetParent;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ProductLogic;

/**
 * セット品構成マスタメンテナンス更新ロジッククラス
 */
public class SetStructureEditUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MSetParentBhv mSetParentBhv;
	@Inject
	private MSetStructureBhv mSetStructureBhv;
	@Inject
	private ProductLogic productLogic;

	/**
	 * <h2>セット品構成マスタを更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータでセット品親マスタに更新する。
	 * 引数で受け取ったデータでセット品構成マスタに登録、更新する。
	 * 更新後データ存在しない場合、構成品の削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mSetParent セット品親マスタ：全項目
	 * @param mSetStructureList セット品構成マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MSetParent mSetParent, List<MSetStructure> mSetStructureList, ErrorStatus errSts) {

		// セット品親マスタの更新実行
		mSetParentBhv.update(mSetParent);

		if(mSetParent.isDelFlg$1()){
			return;
		}

		// セット品構成マスタリストのデータ件数分繰返
		for (MSetStructure MSetStructureEnt : mSetStructureList) {
			if (MSetStructureEnt.getSetStructureId() == null) {
				// 商品ID取得
				MProduct mProduct = new MProduct();
				mProduct.setClientId(mSetParent.getMProduct().getClientId());
				mProduct.setProductCd(MSetStructureEnt.getMProduct().getProductCd());
				mProduct = productLogic.getUkEntity(mProduct);
				// 親ID
				MSetStructureEnt.setSetParentId(mSetParent.getSetParentId());
				// 商品ID
				MSetStructureEnt.setProductId(mProduct.getProductId());

				// 登録実行
				mSetStructureBhv.insert(MSetStructureEnt);
			} else {
				// 更新実行
				mSetStructureBhv.update(MSetStructureEnt);
			}
		}

		// 更新後チェック
		MSetStructureCB cb = mSetStructureBhv.newMyConditionBean();
		cb.query().setSetParentId_Equal(mSetParent.getSetParentId());
		int count = mSetStructureBhv.selectCount(cb);
		if(count == 0){
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.ALL_STRUCTURE_CANNOT_DELETE_ERROR);
			return;
		}


	}
}
