package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゾーンマスタデータ取得ロジッククラス
 */
public class ZoneMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * <h2>ゾーンマスタデータを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースからゾーンマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mZone ゾーンマスタ：倉庫ID・ゾーンCD・削除フラグ、倉庫マスタ：センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MZone> ゾーンマスタリスト
	 */
	public List<MZone> select(MZone mZone, ErrorStatus errSts) {

		List<MZone> result = null;

		// ===== ゾーンマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MZoneCB cb = mZoneBhv.newMyConditionBean();
		cb.setupSelect_MWarehouse();
		//荷主センタ変更対応 201７.04.06 sja Start
		cb.setupSelect_MWarehouse().withMCenter();
		//荷主センタ変更対応 201７.04.06 sja End

		// 倉庫IDの設定
		cb.query().setWarehouseId_Equal(mZone.getWarehouseId());
		// ゾーンCDの設定
		cb.query().setZoneCd_PrefixSearch(mZone.getZoneCd());
		//センタIDの設定
		cb.query().queryMWarehouse().setCenterId_Equal(mZone.getMWarehouse().getCenterId());
		//削除フラグの設定
		cb.query().setDelFlg_Equal(mZone.getDelFlg());
		// ソート順の設定
		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().addOrderBy_ZoneCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== ゾーンマスタ検索実行 =====
		result = selectList(mZoneBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}
}