package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 倉庫マスタメンテナンスデータ取得ロジッククラス
 */
public class WarehouseMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MWarehouseBhv mWarehouseBhv;

	/**
	 * <h2>倉庫マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに倉庫マスタからデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：センタID・倉庫CD・倉庫名称・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MWarehouse> 倉庫マスタデータのリスト
	 */
	public List<MWarehouse> select(MWarehouse mWarehouse, ErrorStatus errSts) {

		List<MWarehouse> result = null;

		//==== 倉庫マスタデータ取得 =====

		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		//検索条件の設定
		MWarehouseCB cb = mWarehouseBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		//センタIDの設定
		cb.query().setCenterId_Equal(mWarehouse.getCenterId());
		//倉庫CDの設定
		cb.query().setWarehouseCd_PrefixSearch(mWarehouse.getWarehouseCd());
		//倉庫名称の設定
		cb.query().setWarehouseNm_LikeSearch(mWarehouse.getWarehouseNm(), new LikeSearchOption().likeContain());
		//削除フラグの設定
		cb.query().setDelFlg_Equal(mWarehouse.getDelFlg());
		//ソート順の設定
		cb.query().addOrderBy_WarehouseCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		//===== 倉庫マスタ検索実行 =====
		result = selectList(mWarehouseBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}
}