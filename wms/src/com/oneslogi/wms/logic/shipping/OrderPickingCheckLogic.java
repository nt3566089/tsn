package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * オーダーピッキングチェックロジッククラス
 */
public class OrderPickingCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPackingBBhv tPackingBBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private PickingCommonLogic commonLogic;

	/**
	 * <h2>出荷梱包No.のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件にデータを検索し
	 * 検索対象が見つからない場合、エラーを登録してfalseを返す。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:存在あり / false:存在なし
	 */
	public boolean checkExistShippingPackingNo(long centerId, long clientId, String shippingPackingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TPackingH();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);

		int count = tPackingBBhv.selectCount(cb);

		if (count < 1) {
			//該当データが存在しません。
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

		return true;
	}

	/**
	 * <h2>オーダーピッキング開始チェックを行う。</h2>
	 * <pre>
	 * 出荷梱包No.のデータを検索し、次の場合はfalseを返す。
	 *
	 * ・検索対象が見つからない場合
	 * ・梱包ステータスが出庫指示済、ピッキング中以外の場合
	 * ・全てピッキング済の場合
	 * ・他ユーザがピッキング中の場合
	 * ・納品先が出荷停止状態の場合
	 * ・出荷指示に出荷停止商品が含まれている場合
	 * ・引当指示に引当禁止ロケーションが含まれている場合
	 *
	 * 上記以外の場合、trueを返す。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingStart(long centerId, long clientId, String shippingPackingNo) {

		return checkPickingStart(centerId, clientId, shippingPackingNo, null);
	}

	/**
	 * <h2>オーダーピッキング開始チェックを行う。</h2>
	 * <pre>
	 * 出荷梱包No.のデータを検索し、次の場合はエラーを登録後にfalseを返す。
	 *
	 * ・検索対象が見つからない場合
	 * ・梱包ステータスが出庫指示済、ピッキング中以外の場合
	 * ・全てピッキング済の場合
	 * ・他ユーザがピッキング中の場合
	 * ・納品先が出荷停止状態の場合
	 * ・出荷指示に出荷停止商品が含まれている場合
	 * ・引当指示に引当禁止ロケーションが含まれている場合
	 *
	 * 上記以外の場合、trueを返す。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingStart(long centerId, long clientId, String shippingPackingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TPackingH();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		// ===== データ存在チェック =====

		if (packingBList.size() < 1) {
			//該当データが存在しません。
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

		// ===== ステータスチェック =====

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);
		shipStatusCheckLogic.piecePickingStart(packingHList, errSts);
		if (0 < getErrorManager().size()) {
			return false;
		}

		// ===== 共通ピッキング開始チェック =====

		if (!commonLogic.checkPickingStart(packingBList, errSts)) {
			return false;
		}

		return true;
	}

	/**
	 * <h2>オーダーピッキング解除チェックを行う。</h2>
	 * <pre>
	 * 出荷梱包No.のデータを検索し、次の場合はエラーを登録後にfalseを返す。
	 *
	 * ・検索対象が見つからない場合
	 * ・梱包ステータスがピッキング中以外の場合
	 *
	 * 上記以外の場合、trueを返す。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param shippingPackingNo 出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingCancel(long centerId, long clientId, String shippingPackingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPackingH().setShippingPackingNo_Equal(shippingPackingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		// ===== データ存在チェック =====

		if (packingBList.size() < 1) {
			//該当データが存在しません。
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

		// ===== ステータスチェック =====

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);
		shipStatusCheckLogic.piecePickingCancel(packingHList, errSts);
		if (0 < getErrorManager().size()) {
			return false;
		}

		return true;
	}
}