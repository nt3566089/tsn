package com.oneslogi.wms.logic.common;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロット共通ロジッククラス
 */
public class LotLogic extends AbstractWmsLogic {

	@Inject
	private TLotBhv tLotBhv;

	/**
	 * <h2>ロットを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にロットデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ロット：ロットID
	 * @return TLot ロット
	 */
	public TLot getPkEntityWithDeletedCheck(TLot entity) {
		if (entity.getLotId() == null) {
			return null;
		}
		return tLotBhv.selectByPKValueWithDeletedCheck(entity.getLotId());
	}

	/**
	 * <h2>ロットを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にロットデータを取得する。
	 * </pre>
	 * @param entity ロット：ロットID
	 * @return TLot ロット
	 */
	public TLot getPkEntity(TLot entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
	 *
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ロット
	 */
	private TLot getPkEntity(TLot entity, ErrorStatus errSts) {
		TLot resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合

			// ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
			//			this.getErrorManager().add(errSts, "xxxxxxxxxxxxxxxxx");
		}
		return resultEntity;
	}

	/**
	 * <h2>ロットを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロットデータを取得する。
	 * 必須項目の検索条件がNULLの場合、NULLを返す。
	 * </pre>
	 * @param entity ロット：商品ID・ロット・期限日
	 * @return TLot ロット
	 */
	public TLot getUkEntityWithDeletedCheck(TLot entity) {

		if (entity.getProductId() == null) {
			return null;
		}

		TLotCB cb = tLotBhv.newMyConditionBean();
		cb.query().setProductId_Equal(entity.getProductId());
		if (CU.isNullOrEmpty(entity.getLot())) {
			cb.query().setLot_IsNullOrEmpty();
		} else {
			cb.query().setLot_Equal(entity.getLot());
		}
		if (CU.isNullOrEmpty(entity.getLimitDt())) {
			cb.query().setLimitDt_IsNullOrEmpty();
		} else {
			cb.query().setLimitDt_Equal(entity.getLimitDt());
		}

		return tLotBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>ロットを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロットデータを取得する。
	 * </pre>
	 * @param entity ロット：商品ID・ロット・期限日
	 * @return TLot ロット
	 */
	public TLot getUkEntity(TLot entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ロットを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロットデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ロット：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TLot ロット
	 */
	public TLot getUkEntity(TLot entity, ErrorStatus errSts) {
		TLot resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.LOT_NOT_FOUND_IN_LOT_MASTER_ERROR);
		}
		return resultEntity;
	}

	// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットマスタ取得を追加する  2015.03.27 kyo Start
	/**
	 * <h2>ロットリストを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロットデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ロット：商品ID・ロット・期限日
	 * @return List<TLot> ロットリスト
	 */
	public List<TLot> getUkEntityWithLotOrLimitDt(TLot entity) {
		List<TLot> resultList = new ArrayList<TLot>();
		if(entity == null){
			return null;
		}
		if (entity.getProductId() == null) {
			return null;
		}
		TLotCB cb = tLotBhv.newMyConditionBean();
		cb.query().setProductId_Equal(entity.getProductId());
		cb.query().setLot_Equal(entity.getLot());
		cb.query().setLimitDt_Equal(entity.getLimitDt());
		resultList = tLotBhv.selectList(cb);
		return resultList;
	}
	// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットマスタ取得を追加する  2015.03.27 kyo End
}
