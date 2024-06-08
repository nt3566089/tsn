package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ケースピッキングチェックロジッククラス
 */
public class CasePickingCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	/** 梱包ボディ */
	@Inject
	private TPackingBBhv tPackingBBhv;

	// ===== 使用ロジック =====

	/** 出荷共通ロジッククラス */
	@Inject
	private PickingCommonLogic commonLogic;
	/** 出荷状態チェックロジッククラス */
	@Inject
	private ShipStatusCheckLogic statusCheckLogic;

	/**
	 * <h2>ケースピッキングNoの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件にデータを検索し
	 * 検索対象が見つからない場合、エラーを登録してfalseを返す。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:存在あり / false:存在なし
	 */
	public boolean checkExistCasePickingNo(long centerId, long clientId, String casePickingNo, ErrorStatus errSts) {

		// 梱包ボディ情報の取得
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		int count = tPackingBBhv.selectCount(cb);

		if (count < 1) {
			//該当データが存在しません。
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

		return true;
	}

	/**
	 * <h2>ケースピッキング開始チェックを行う。</h2>
	 * <pre>
	 * ケースピッキングNo.のデータを検索し、次の場合はfalseを返す。
	 *
	 * ・検索対象が見つからない場合
	 * ・出荷確定済のデータが含まれる場合
	 * ・全てピッキング済の場合
	 * ・他ユーザが出庫フラグを出庫作業中(7)または出庫済(1)に更新している場合
	 * ・【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】がfalseの場合
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo
	 * @return boolean true:エラーなし / false:エラーあり
	 */
	public boolean checkCasePickingStart(long centerId, long clientId, String casePickingNo) {
		return checkCasePickingStart(centerId, clientId, casePickingNo, null);
	}

	/**
	 * <h2>ケースピッキング開始チェックを行う。</h2>
	 * <pre>
	 * ケースピッキングNo.のデータを検索し、次の場合はエラーを登録後にfalseを返す。
	 *
	 * ・検索対象が見つからない場合
	 * ・出荷確定済のデータが含まれる場合
	 * ・全てピッキング済の場合
	 * ・ステータスが出庫指示済・ピッキング中・検品中以外の場合
	 * ・他ユーザがピッキング中の場合
	 * ・納品先が出荷停止状態の場合
	 * ・出荷指示に出荷停止商品が含まれている場合
	 * ・引当指示に引当禁止ロケーションが含まれている場合
	 *
	 * 上記以外の場合、trueを返す。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkCasePickingStart(long centerId, long clientId, String casePickingNo, ErrorStatus errSts) {

		// ===== 出荷確定済データ存在確認 =====

		statusCheckLogic.checkExistShippingFixedData(centerId, clientId, casePickingNo, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return false;
		}

		// ===== 対象データ取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstB();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		// ===== データ存在チェック =====

		if (packingBList.size() < 1) {
			//該当データが存在しません。
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

		// ===== ステータスチェック =====

		statusCheckLogic.casePickingStart(packingBList, errSts);
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
	 * <h2>ケースピッキング解除チェックを行う。</h2>
	 * <pre>
	 * ケースピッキングNo.のデータを検索し、次の場合はエラーを登録後にfalseを返す。
	 *
	 * ・検索対象が見つからない場合
	 * ・ステータスがピッキング中・検品中以外の場合
	 *
	 * 上記以外の場合、trueを返す。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param casePickingNo ケースピッキングNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingCancel(long centerId, long clientId, String casePickingNo, ErrorStatus errSts) {

		// ===== 対象データ取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		// ===== データ存在チェック =====

		if (packingBList.size() < 1) {
			//該当データが存在しません。
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return false;
		}

		// ===== ステータスチェック =====

		statusCheckLogic.casePickingCancel(packingBList, errSts);
		if (0 < getErrorManager().size()) {
			return false;
		}

		return true;
	}
}