package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.cbean.MNumberingCenterCB;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ採番マスタ共通ロジッククラス
 */
public class NumberingCenterLogic extends AbstractWmsLogic {

	// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add Start
	protected static class StatusCode {
		/**
		 * 現在値桁数異常
		 */
		protected static final int PRESENT_NUMBER_LENGTH_OVER_ERROR = 2;
		/**
		 * 最小値桁数異常
		 */
		protected static final int MIN_NUMBER_LENGTH_OVER_ERROR = 3;
		/**
		 * 最大値桁数異常
		 */
		protected static final int MAX_NUMBER_LENGTH_OVER_ERROR = 4;
		/**
		 * 最小値最小異常
		 */
		protected static final int MIN_NUMBER_MIN_ABNORMALITIES_ERROR = 5;
		/**
		 * 最小値最大値以上異常
		 */
		protected static final int MIN_NUMBER_IS_GREATER_THAN_MAX_ERROR = 6;
		/**
		 * 現在値最大値超異常
		 */
		protected static final int PRESENT_NUMBER_MAX_OVER_ERROR = 7;
		/**
		 * 現在値最小値未満異常
		 */
		protected static final int PRESENT_NUMBER_IS_LESS_THAN_MIN_ERROR = 8;
	}

	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;
	// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add End
	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;

	/**
	 * <h2>センタ採番マスタに存在チェック</h2>
	 * <pre>
	 * </pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラーステータス
	 */
	public void checkNumberingCenterInsert(MNumberingCenter mNumberingCenter, ErrorStatus errSts){

		// 検索前の削除フラグ自動検索設定取得
		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		this.setBehaviorAutoDelFlg(false);
		MNumberingCenterCB cb = mNumberingCenterBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mNumberingCenter.getCenterId());
		cb.query().setBizCd_Equal(mNumberingCenter.getBizCd());

		int count = mNumberingCenterBhv.selectCount(cb);

		// 検索前の削除フラグ自動検索設定
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		if(count > 0){
			this.getErrorManager().add(errSts,WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}
	}

	/**
	 * <h2>センタ採番マスタに存在チェック</h2>
	 * <pre>
	 * </pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラーステータス
	 */
	public void checkNumberingCenterUpdate(MNumberingCenter mNumberingCenter, ErrorStatus errSts){
		// 検索前の削除フラグ自動検索設定取得
		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		this.setBehaviorAutoDelFlg(false);
		MNumberingCenterCB cb = mNumberingCenterBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mNumberingCenter.getCenterId());
		cb.query().setBizCd_Equal(mNumberingCenter.getBizCd());
		MNumberingCenter numberingCenter = mNumberingCenterBhv.selectEntity(cb);

		// 検索前の削除フラグ自動検索設定
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		if(numberingCenter != null &&
				!CU.isNotNullAndEquals(mNumberingCenter.getNumberingCenterId(), numberingCenter.getNumberingCenterId())){
			this.getErrorManager().add(errSts,WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
		}
	}

	// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe Start
	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
	/**
	 * <h2>入力値チェック</h2>
	 * <pre>
	 * 登録/更新データのチェックを行う。<br>
	 * 全行全項目に対するチェックを行う。<br>
	 * 桁数チェックでエラーがない場合、後続チェックを行う。<br>
	 * </pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラーステータス
	 * @param rowIndex 行番号
	 */
	public void checkNumberingCenterSize(MNumberingCenter mNumberingCenter, ErrorStatus errSts, int rowIndex){
		Long maxNumberFromLength = (long) (Math.pow(10, mNumberingCenter.getLength()) - 1);
		Long presentNumber = mNumberingCenter.getPresentNumber();
		Long maxNumber =mNumberingCenter.getMaxNumber();
		Long minNumber =mNumberingCenter.getMinNumber();
		boolean lengthError = false;

		// 桁数 < 現在値
		if (maxNumberFromLength < presentNumber) {
			this.getErrorManager().add(errRetSts(errSts, StatusCode.PRESENT_NUMBER_LENGTH_OVER_ERROR, rowIndex), WmsMessageConst.PRESENT_NUMBER_LENGTH_OVER_ERROR, mNumberingCenter.getLength().toString());
			lengthError = true;
		}
		// 桁数 < 最小値
		if (maxNumberFromLength < minNumber) {
			this.getErrorManager().add(errRetSts(errSts, StatusCode.MIN_NUMBER_LENGTH_OVER_ERROR, rowIndex), WmsMessageConst.MIN_NUMBER_LENGTH_OVER_ERROR, mNumberingCenter.getLength().toString());
			lengthError = true;
		}
		// 桁数 < 最大値
		if (maxNumberFromLength < maxNumber) {
			this.getErrorManager().add(errRetSts(errSts, StatusCode.MAX_NUMBER_LENGTH_OVER_ERROR, rowIndex), WmsMessageConst.MAX_NUMBER_LENGTH_OVER_ERROR, mNumberingCenter.getLength().toString());
			lengthError = true;
		}

		if (!lengthError) {
			// 最大値 <= 最小値
			if (maxNumber <= minNumber) {
				Long calcLimitMaxNumber = maxNumber -1L;
				this.getErrorManager().add(errRetSts(errSts, StatusCode.MIN_NUMBER_IS_GREATER_THAN_MAX_ERROR, rowIndex), WmsMessageConst.MAX_NUMBER_SMALLER_THAN_MIN_NUMBER_ERROR, calcLimitMaxNumber.toString());
			}
			// 最大値 < 現在値
			if (maxNumber < presentNumber) {
				this.getErrorManager().add(errRetSts(errSts, StatusCode.PRESENT_NUMBER_MAX_OVER_ERROR, rowIndex), WmsMessageConst.PRESENT_NUMBER_EXCEEDS_MAX_NUMBER_ERROR, maxNumber.toString());
			}
			// (最小値 -2) >= 現在値
			if ((minNumber -2L) >= presentNumber) {
				Long calcLimitMinNumber = minNumber -1L;
				this.getErrorManager().add(errRetSts(errSts, StatusCode.PRESENT_NUMBER_IS_LESS_THAN_MIN_ERROR, rowIndex), WmsMessageConst.PRESENT_NUMBER_LESS_THAN_SUBTRACT_MIN_NUMBER2_ERROR, calcLimitMinNumber.toString());
			}
		}
	}
	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End
	// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe End

	// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add Start
	/**
	 * <h2>配送コースマスタ全件取得</h2>
	 * <pre>
	 * 削除フラグ指定無しで配送コースマスタ全件取得する。<br>
	 * 検索結果が0件の場合でもエラーは設定しない。<br>
	 * </pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @return 検索結果の配送コースマスタリスト
	 */
	public List<MDeliveryCourse> selectDeliveryCourseListAll(MNumberingCenter mNumberingCenter) {

		List<MDeliveryCourse> result = null;

		// ==== 配送コースマスタデータ取得 =====

		// 検索前の削除フラグ自動検索設定取得
		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();
		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		//センタIDの設定
		cb.query().setCenterId_Equal(mNumberingCenter.getCenterId());
		//ソート順の設定
		cb.query().addOrderBy_DeliveryCourseCd_Asc();

		//==== 配送コースマスタ検索実行 =====
		result = selectList(mDeliveryCourseBhv, cb);

		// 検索前の削除フラグ自動検索設定
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		return result;
	}

	/**
	 * <h2>センタ採番マスタの削除チェック</h2>
	 * <pre>
	 * 配送コースマスタの追跡番号採番キーとして設定されている場合、削除不可<br>
	 * <pre>
	 * @param mNumberingCenter センタ採番マスタ
	 * @param deliveryCourseList 配送コースマスタリスト
	 * @param errSts エラーステータス
	 */
	public void checkNumberingCenterMasterDelete(MNumberingCenter mNumberingCenter, List<MDeliveryCourse> deliveryCourseList, ErrorStatus errSts){

		// 配送コースマスタの追跡番号採番キーとして設定されている場合、削除不可
		for (MDeliveryCourse mDeliveryCourse : deliveryCourseList) {
			if (mNumberingCenter.getBizCd().equals(mDeliveryCourse.getTrackingNumberingKey())
					|| mNumberingCenter.getBizCd().equals(mDeliveryCourse.getTrackingNumberingAfterKey())) {
				this.getErrorManager().add(errSts, WmsMessageConst.NUMBERING_CENTER_CANNOT_DELETE_USE_DELIVERY_COURSE_ERROR);
				return;
			}
		}
	}
	// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add End
}