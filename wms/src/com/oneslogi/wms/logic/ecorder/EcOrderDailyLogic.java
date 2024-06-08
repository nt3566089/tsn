package com.oneslogi.wms.logic.ecorder;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TAmazonOrderCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderBCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderRCB;
import com.oneslogi.base.dbflute.cbean.TRakutenOrderCB;
import com.oneslogi.base.dbflute.cbean.TYahooOrderCB;
import com.oneslogi.base.dbflute.exbhv.TAmazonOrderBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderBBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv;
import com.oneslogi.base.dbflute.exbhv.TRakutenOrderBhv;
import com.oneslogi.base.dbflute.exbhv.TYahooOrderBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAmazonOrder;
import com.oneslogi.base.dbflute.exentity.TEcOrderB;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TRakutenOrder;
import com.oneslogi.base.dbflute.exentity.TYahooOrder;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ImportTypeLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;
import com.oneslogi.wms.logic.daily.DailyCommonLogic;

/**
 * EC受注 - 日次締処理ロジッククラス
 */
public class EcOrderDailyLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TEcOrderBBhv tEcOrderBBhv;
	@Inject
	private TEcOrderRBhv tEcOrderRBhv;
	@Inject
	private TRakutenOrderBhv tRakutenOrderBhv;
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
	@Inject
	private TAmazonOrderBhv tAmazonOrderBhv;
	@Inject
	private TYahooOrderBhv tYahooOrderBhv;
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	// ===== 使用ロジッククラス =====

	@Inject
	private ImportTypeLogic importTypeLogic;
	// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana Start
	@Inject
	private DailyCommonLogic commonLogic;
	@Inject
	private QueryUpdateLogic queryUpdateLogic;

	// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana End

	/**
	 * <h2>EC受注 - 日次処理実行チェックを行う。</h2>
	 * <pre>
	 * 引数をキーに取込み種別マスタからデータを検索し、
	 * EC受注関連の日次締処理が実行できるか下記のチェックを行う。
	 * ・受注保持期間がトランザクション保持期間以下であること
	 * ・受注保持期間が、削除（未処理）保持期間以下であること
	 *
	 * エラーの場合は、エラー管理クラスにエラーを登録しfalseを返却する。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID
	 * @param param パラメータマスタ：トランザクション保持期間・削除保持期間
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:実行可能 false:問題あり
	 */
	public boolean checkExecute(MClientCenter clientCenter, MParam param, ErrorStatus errSts) {

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);

		// 荷主ID
		long clientId = clientCenter.getClientId();
		// トランザクション保持期間
		long tKeepingDays = param.getTKeepingDays();
		// 未処理削除期間
		long dKeepingDay = param.getDKeepingDays();

		if (tKeepingDays == 0 && dKeepingDay == 0) {
			// トランザクションを削除しない
			return true;
		}

		// ===== 取込み種別マスタを取得 =====
		MImportType itEntity = new MImportType();
		itEntity.setClientId(clientId);
		List<MImportType> importTypeList = importTypeLogic.getEntityListByClientId(itEntity);

		// ===== 取込み種別マスタ分繰返し =====
		for (MImportType importType : importTypeList) {
			// 受注保持期間
			long keepingDays = importType.getOKeepingDays();

			if (tKeepingDays > 0) {
				// 削除設定

				if (keepingDays == 0) {
					// 削除しない設定の場合はエラー
					//[#7427][OSS] エラーメッセージ変更 2020/05/07 KAI MOD START
					//this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_ORDER_KEEPING_DAYS_ERROR);
					this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_T_KEEPING_DAYS_ERROR);
					//[#7427][OSS] エラーメッセージ変更 2020/05/07 KAI MOD END
					return false;
				}

				if (tKeepingDays < keepingDays) {
					// 受注データ保持期間の方が大きい場合はエラー

					this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_ORDER_KEEPING_DAYS_ERROR);
					return false;
				}
			}

			if (dKeepingDay > 0) {
				// 削除設定

				if (keepingDays == 0) {
					// 削除しない設定の場合はエラー
					//[#7427][OSS] エラーメッセージ変更 2020/05/07 KAI MOD START
					//this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_ORDER_KEEPING_DAYS_ERROR);
					this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_D_KEEPING_DAYS_ERROR);
					//[#7427][OSS] エラーメッセージ変更 2020/05/07 KAI MOD END
					return false;
				}

				if (dKeepingDay < keepingDays) {
					// 受注データ保持期間の方が大きい場合はエラー
					//[#7427][OSS] エラーメッセージ変更 2020/05/07 KAI MOD START
					//this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_ORDER_KEEPING_DAYS_ERROR);
					this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_UNPROCESS_KEEP_DAYS_ERROR);
					//[#7427][OSS] エラーメッセージ変更 2020/05/07 KAI MOD END
					return false;
				}
			}

		}

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		return true;
	}

	/**
	 * <h2>EC受注データを削除する(日次)。 </h2>
	 * <pre>
	 * 引数をキーに処理テーブルからデータを検索し、
	 * 取得した取込み種別マスタ分、以下の処理を繰返し行う。
	 * 【対象日の取得処理】で削除対象日を設定し、下記テーブルの削除対象日以前のデータを【条件指定での削除処理】する。
	 * ・楽天RMS受注
	 * ・Amazon受注
	 * ・Yahoo受注
	 * ・EC受注ボディ
	 * ・EC受注帳票
	 * ・EC受注ヘッダ
	 *
	 * 【運用ログの開始処理】、【運用ログの終了処理】、【運用ログ追加処理】を使用しログを記録する。
	 *
	 * 【運用ログの開始処理】
	 * ・{@link DailyCommonLogic#startLogSection(String) 運用ログの開始メソッド}を呼び出す。
	 *
	 * 【運用ログ追加処理】
	 * ・{@link DailyCommonLogic#addLog(String, String...) 運用ログ追加メソッド}を呼び出す。
	 *
	 * 【運用ログの終了処理】
	 * ・{@link DailyCommonLogic#endLogSection() 運用ログの終了メソッド}を呼び出す。
	 *
	 * 【対象日の取得処理】
	 * ・{@link DailyCommonLogic#getTargetDay(String, Long) 対象日の取得メソッド}を呼び出す。
	 *
	 * 【条件指定での削除処理】
	 * ・{@link DailyCommonLogic#queryDeleteWithSelect(AbstractBehaviorWritable, AbstractConditionBean, AbstractQuerySetter) 条件指定での削除メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID・センタID・前回システム管理日付
	 */
	public void deleteData(MClientCenter clientCenter) {

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_EC_DATA_DELETE);

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);

		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// 荷主ID
		final long clientId = clientCenter.getClientId();
		// センタID
		final long centerId = clientCenter.getCenterId();

		// ===== 取込み種別マスタを取得 =====
		MImportType itEntity = new MImportType();
		itEntity.setClientId(clientId);
		List<MImportType> importTypeList = importTypeLogic.getEntityListByClientId(itEntity);

		// ===== 取込み種別マスタ分繰返し =====
		for (MImportType importType : importTypeList) {

			// 取込種別ID
			long importTypeId = importType.getImportTypeId();
			// 取込み種別CD
			String importTypeCd = importType.getImportTypeCd();
			// 受注保持期間
			long keepingDays = importType.getOKeepingDays();

			// [#1530] 対象日をログ出力 2017.04.19 kawana Start

			String deleteDay = null;

			if (0 < keepingDays) {
				try {
					// 削除対象日の設定
					deleteDay = commonLogic.getTargetDay(systemDt, keepingDays);
				} catch (Exception e) {
					getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
				}
			}

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DAILY_PROCESS_PARAMETER_EC_DATA_DELETE, importTypeCd, commonLogic.getDateString(systemDt), String.valueOf(keepingDays), commonLogic.getDateString(deleteDay));

			// 保持期間が0の場合は削除しない
			if (keepingDays == 0) {
				continue;
			}

			// [#1530] 対象日をログ出力 2017.04.19 kawana End

			// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
			String logTableNm = "";
			int orderDeleteCount = 0;
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.UploadTableNm uploadTable = CDef.UploadTableNm.codeOf(importType.getUploadTableNm());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			switch (uploadTable) {
			case $tRakutenOrder:
				// ===== 楽天RMS受注の削除 =====
				TRakutenOrderCB roCb = tRakutenOrderBhv.newMyConditionBean();
				roCb.checkInvalidQuery();
				roCb.query().queryTEcOrderB().queryTEcOrderH().setImportTypeId_Equal(importTypeId);
				roCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setClientId_Equal(clientId);
				roCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setCenterId_Equal(centerId);
				roCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setShippingDt_LessEqual(deleteDay);
				// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
				orderDeleteCount = queryUpdateLogic.queryDeleteWithSelect(tRakutenOrderBhv, roCb, getQuerySetter(tRakutenOrderBhv));
				// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End
				logTableNm = tRakutenOrderBhv.asTableDbName().toUpperCase();
				break;
			case $tAmazonOrder:
				// ===== Amazon受注の削除 =====
				TAmazonOrderCB aoCb = tAmazonOrderBhv.newMyConditionBean();
				aoCb.checkInvalidQuery();
				aoCb.query().queryTEcOrderB().queryTEcOrderH().setImportTypeId_Equal(importTypeId);
				aoCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setClientId_Equal(clientId);
				aoCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setCenterId_Equal(centerId);
				aoCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setShippingDt_LessEqual(deleteDay);
				// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
				orderDeleteCount = queryUpdateLogic.queryDeleteWithSelect(tAmazonOrderBhv, aoCb, getQuerySetter(tAmazonOrderBhv));
				// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End
				logTableNm = tAmazonOrderBhv.asTableDbName().toUpperCase();
				break;
			case $tYahooOrder:
				// ===== Yahoo受注の削除 =====
				TYahooOrderCB yoCb = tYahooOrderBhv.newMyConditionBean();
				yoCb.checkInvalidQuery();
				yoCb.query().queryTEcOrderB().queryTEcOrderH().setImportTypeId_Equal(importTypeId);
				yoCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setClientId_Equal(clientId);
				yoCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setCenterId_Equal(centerId);
				yoCb.query().queryTEcOrderB().queryTEcOrderH().queryTShippingInstH().setShippingDt_LessEqual(deleteDay);
				// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
				orderDeleteCount = queryUpdateLogic.queryDeleteWithSelect(tYahooOrderBhv, yoCb, getQuerySetter(tYahooOrderBhv));
				// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End
				logTableNm = tYahooOrderBhv.asTableDbName().toUpperCase();
				break;
			}

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, logTableNm, String.valueOf(orderDeleteCount));
			// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

			// ===== EC受注ボディの削除 =====
			TEcOrderBCB ecbCb = tEcOrderBBhv.newMyConditionBean();
			ecbCb.checkInvalidQuery();
			ecbCb.query().queryTEcOrderH().setImportTypeId_Equal(importTypeId);
			ecbCb.query().queryTEcOrderH().queryTShippingInstH().setClientId_Equal(clientId);
			ecbCb.query().queryTEcOrderH().queryTShippingInstH().setCenterId_Equal(centerId);
			ecbCb.query().queryTEcOrderH().queryTShippingInstH().setShippingDt_LessEqual(deleteDay);

			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int ecbDelCount = queryUpdateLogic.queryDeleteWithSelect(tEcOrderBBhv, ecbCb, getQuerySetter(tEcOrderBBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tEcOrderBBhv.asTableDbName().toUpperCase(), String.valueOf(ecbDelCount));

			// ===== EC受注帳票の削除 =====
			TEcOrderRCB ecrCb = tEcOrderRBhv.newMyConditionBean();
			ecrCb.checkInvalidQuery();
			ecrCb.query().queryTEcOrderH().setImportTypeId_Equal(importTypeId);
			ecrCb.query().queryTEcOrderH().queryTShippingInstH().setClientId_Equal(clientId);
			ecrCb.query().queryTEcOrderH().queryTShippingInstH().setCenterId_Equal(centerId);
			ecrCb.query().queryTEcOrderH().queryTShippingInstH().setShippingDt_LessEqual(deleteDay);

			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int ecrDelCount = queryUpdateLogic.queryDeleteWithSelect(tEcOrderRBhv, ecrCb, getQuerySetter(tEcOrderRBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tEcOrderRBhv.asTableDbName().toUpperCase(), String.valueOf(ecrDelCount));

			// ===== EC受注ヘッダの削除 =====
			TEcOrderHCB echCb = tEcOrderHBhv.newMyConditionBean();
			echCb.checkInvalidQuery();
			echCb.query().setImportTypeId_Equal(importTypeId);
			echCb.query().queryTShippingInstH().setClientId_Equal(clientId);
			echCb.query().queryTShippingInstH().setCenterId_Equal(centerId);
			echCb.query().queryTShippingInstH().setShippingDt_LessEqual(deleteDay);

			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int echDelCount = queryUpdateLogic.queryDeleteWithSelect(tEcOrderHBhv, echCb, getQuerySetter(tEcOrderHBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tEcOrderHBhv.asTableDbName().toUpperCase(), String.valueOf(echDelCount));

		}

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		// 運用ログの終了
		commonLogic.endLogSection();
	}

	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start

	private AbstractQuerySetter getQuerySetter(AbstractBehaviorWritable<?, ?> bhv) {

		if (bhv instanceof TRakutenOrderBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TRakutenOrderCB) cb).specify().columnRakutenOrderId();
				}

				@SuppressWarnings("unchecked")
				@Override
				 protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tRakutenOrderBhv.extractRakutenOrderIdList((List<TRakutenOrder>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TRakutenOrderCB cb = tRakutenOrderBhv.newMyConditionBean();
					cb.query().setRakutenOrderId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TAmazonOrderBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TAmazonOrderCB) cb).specify().columnAmazonOrderId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tAmazonOrderBhv.extractAmazonOrderIdList((List<TAmazonOrder>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TAmazonOrderCB cb = tAmazonOrderBhv.newMyConditionBean();
					cb.query().setAmazonOrderId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TYahooOrderBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TYahooOrderCB) cb).specify().columnYahooOrderId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tYahooOrderBhv.extractYahooOrderIdList((List<TYahooOrder>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TYahooOrderCB cb = tYahooOrderBhv.newMyConditionBean();
					cb.query().setYahooOrderId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TEcOrderBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TEcOrderBCB) cb).specify().columnEcOrderBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tEcOrderBBhv.extractEcOrderBIdList((List<TEcOrderB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TEcOrderBCB cb = tEcOrderBBhv.newMyConditionBean();
					cb.query().setEcOrderBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TEcOrderRBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TEcOrderRCB) cb).specify().columnEcOrderHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tEcOrderRBhv.extractEcOrderHIdList((List<TEcOrderR>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TEcOrderRCB cb = tEcOrderRBhv.newMyConditionBean();
					cb.query().setEcOrderHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TEcOrderHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TEcOrderHCB) cb).specify().columnEcOrderHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tEcOrderHBhv.extractEcOrderHIdList((List<TEcOrderH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
					cb.query().setEcOrderHId_InScope(pkList);
					return cb;
				}
			};
		}

		getErrorManager().throwException(new IllegalArgumentException("querySetter not found"));
		return null;
	}

	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End
}
