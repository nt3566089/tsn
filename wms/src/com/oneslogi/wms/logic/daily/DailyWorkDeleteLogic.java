package com.oneslogi.wms.logic.daily;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCartCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB;
import com.oneslogi.base.dbflute.cbean.WCarrierZipInputCB;
import com.oneslogi.base.dbflute.cbean.WCustomerInputCB;
import com.oneslogi.base.dbflute.cbean.WHtInventoryInputProdCB;
import com.oneslogi.base.dbflute.cbean.WHtLoadingCB;
import com.oneslogi.base.dbflute.cbean.WHtReceiveInspectionCB;
import com.oneslogi.base.dbflute.cbean.WHtReceiveNoPlanInspCB;
import com.oneslogi.base.dbflute.cbean.WHtReceiveStoreCB;
import com.oneslogi.base.dbflute.cbean.WHtSerialReceiveInspCB;
import com.oneslogi.base.dbflute.cbean.WHtSerialShippingInspCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.cbean.WLocationInputCB;
import com.oneslogi.base.dbflute.cbean.WProductInputCB;
import com.oneslogi.base.dbflute.cbean.WProductShapeInputCB;
import com.oneslogi.base.dbflute.cbean.WSglRowShipInspBCB;
import com.oneslogi.base.dbflute.cbean.WSglRowShipInspHCB;
import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.cbean.WStockInputCB;
import com.oneslogi.base.dbflute.cbean.WZipCompanyInputCB;
import com.oneslogi.base.dbflute.cbean.WZipInputCB;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdCartBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv;
import com.oneslogi.base.dbflute.exbhv.WCarrierZipInputBhv;
import com.oneslogi.base.dbflute.exbhv.WCustomerInputBhv;
import com.oneslogi.base.dbflute.exbhv.WHtInventoryInputProdBhv;
import com.oneslogi.base.dbflute.exbhv.WHtLoadingBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveInspectionBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveNoPlanInspBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveStoreBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialReceiveInspBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialShippingInspBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exbhv.WLocationInputBhv;
import com.oneslogi.base.dbflute.exbhv.WProductInputBhv;
import com.oneslogi.base.dbflute.exbhv.WProductShapeInputBhv;
import com.oneslogi.base.dbflute.exbhv.WSglRowShipInspBBhv;
import com.oneslogi.base.dbflute.exbhv.WSglRowShipInspHBhv;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exbhv.WStockInputBhv;
import com.oneslogi.base.dbflute.exbhv.WZipCompanyInputBhv;
import com.oneslogi.base.dbflute.exbhv.WZipInputBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmd;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdCart;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dbflute.exentity.WCarrierZipInput;
import com.oneslogi.base.dbflute.exentity.WCustomerInput;
import com.oneslogi.base.dbflute.exentity.WHtInventoryInputProd;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.dbflute.exentity.WLocationInput;
import com.oneslogi.base.dbflute.exentity.WProductInput;
import com.oneslogi.base.dbflute.exentity.WProductShapeInput;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.dbflute.exentity.WShippingInterrupt;
import com.oneslogi.base.dbflute.exentity.WStockInput;
import com.oneslogi.base.dbflute.exentity.WZipCompanyInput;
import com.oneslogi.base.dbflute.exentity.WZipInput;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;

/**
 * ワークテーブルデータ削除ロジッククラス
 */
public class DailyWorkDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private WCarrierZipInputBhv wCarrierZipInputBhv;
	@Inject
	private WCustomerInputBhv wCustomerInputBhv;
	@Inject
	private WLocationInputBhv wLocationInputBhv;
	@Inject
	private WProductInputBhv wProductInputBhv;
	@Inject
	private WProductShapeInputBhv wProductShapeInputBhv;
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;
	@Inject
	private WStockInputBhv wStockInputBhv;
	@Inject
	private WZipCompanyInputBhv wZipCompanyInputBhv;
	@Inject
	private WZipInputBhv wZipInputBhv;
	@Inject
	private WHtInventoryInputProdBhv wHtInventoryInputProductBhv;
	@Inject
	private WHtLoadingBhv wHtLoadingBhv;
	@Inject
	private WHtReceiveInspectionBhv wHtReceiveInspectionBhv;
	@Inject
	private WHtReceiveNoPlanInspBhv wHtReceiveNoPlanInspecBhv;
	@Inject
	private WHtReceiveStoreBhv wHtReceiveStoreBhv;
	@Inject
	private WHtSerialReceiveInspBhv wHtSerialReceiveInspBhv;
	@Inject
	private WHtSerialShippingInspBhv wHtSerialShippingInspBhv;
	@Inject
	private WHtShippingBhv wHtShippingBhv;
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;
	//[Ver3.1][#5126] 追加されたワークテーブルの日次処理時の削除処理追加 2018.09.05 miyabe add Start
	@Inject
	private WSglRowShipInspHBhv wSglRowShipInspHBhv;
	@Inject
	private WSglRowShipInspBBhv wSglRowShipInspBBhv;
	@Inject
	private TPicMthdRcmdDataBhv tPicMthdRcmdDataBhv;
	@Inject
	private TPicMthdRcmdCartBhv tPicMthdRcmdCartBhv;
	@Inject
	private TPicMthdRcmdBhv tPicMthdRcmdBhv;
	//[Ver3.1][#5126] 追加されたワークテーブルの日次処理時の削除処理追加 2018.09.05 miyabe add End

	// ===== 使用ロジッククラス =====

	@Inject
	private DailyCommonLogic commonLogic;
	@Inject
	private QueryUpdateLogic queryUpdateLogic;

	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start

	/**
	 * <h2>ワークデータ削除処理.</h2>
	 * <pre>
	 * ワークデータの削除処理を行う。
	 * トランザクション保持期間を過ぎたワークデータを削除する。
	 *
	 * 【削除テーブル】
	 *  ・出荷検品中断ワークデータ削除
	 *  ・商品マスタ取込ワークデータ削除
	 *  ・商品荷姿マスタ取込ワークデータ削除
	 *  ・取引先マスタ取込ワークデータ削除
	 *  ・ロケーションマスタ取込ワークデータ削除
	 *  ・在庫取込ワークデータ削除
	 *  ・運送業者郵便番号マスタ取込ワークデータ削除
	 *  ・郵便番号マスタ(大口事業所)取込ワークデータ削除
	 *  ・郵便番号マスタ取込ワークデータ削除
	 *  ・HT入荷検品ワークデータ削除
	 *  ・HT入庫格納ワークデータ削除
	 *  ・HT予定無し入荷ワークデータ削除
	 *  ・HTシリアル登録(入荷)ワークデータ削除
	 *  ・HT出荷ピッキングワークデータ削除
	 *  ・HT出荷検品ワークデータ削除
	 *  ・HT積込検品ワークデータ削除
	 *  ・HTシリアル登録(出荷)ワークデータ削除
	 *  ・HT商品棚卸ワークデータ削除
	 *
	 * 【パラメータの使用項目】
	 *  (荷主センタマスタ)
	 *  ・センタID : 必須
	 *  ・荷主ID : 必須
	 *  ・センタマスタ.センタCD : 必須
	 *  ・荷主マスタ.荷主CD : 必須
	 *  ・システム管理日付 : 必須
	 *  (パラメータマスタ)
	 *  ・トランザクション保持期間 : 必須
	 * </pre>
	 * @param clientCenter 荷主センタマスタ
	 * @param param パラメータマスタ
	 */
	public void delete(MClientCenter clientCenter, MParam param) {

		// ===== 初期処理 =====

		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// トランザクション保持期間
		final long keepingDays = param.getTKeepingDays();

		// ===== 対象日の計算 =====

		String delDay = null;
		Timestamp delDayTimestamp = null;

		if (0 < keepingDays) {
			try {
				// 削除対象日に荷主センタマスタ.前回システム管理日付 － パラメータ.トランザクション保持期間 を設定する
				delDay = commonLogic.getTargetDay(systemDt, keepingDays);
				// ※※※ 更新日の23:59:59までのデータを消すため対象日1日加算する
				Calendar calendar = commonLogic.stringToCalendar(delDay);
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				delDayTimestamp = new Timestamp(calendar.getTimeInMillis());
			} catch (Exception e) {
				getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
			}
		}

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_WORK_DELETE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS
				, new String[] { commonLogic.getDateString(systemDt), String.valueOf(keepingDays), commonLogic.getDateString(delDay) });

		// トランザクション保持期間のチェック
		if (keepingDays < 1) {

			// 運用ログの終了
			commonLogic.endLogSection();
			return;
		}

		// 削除フラグの条件付加を停止する
		boolean preAutoDelFlg = getBehaviorAutoDelFlg();
		setBehaviorAutoDelFlg(false);

		// ===== ワークデータ削除 =====

		final long centerId = clientCenter.getCenterId();
		final long clientId = clientCenter.getClientId();
		final String centerCd = clientCenter.getMCenter().getCenterCd();
		final String clientCd = clientCenter.getMClient().getClientCd();

		workDataDelete(delDayTimestamp, centerId, clientId, centerCd, clientCd);

		// ===== 終了処理 =====

		// 削除フラグの条件付加を開始する
		setBehaviorAutoDelFlg(preAutoDelFlg);

		// 運用ログの終了
		commonLogic.endLogSection();
	}

	/**
	 * <h2>ワークデータ削除処理</h2>
	 */
	private void workDataDelete(Timestamp delDayTimestamp, final long centerId, final long clientId, final String centerCd, final String clientCd) {

		// ===== 出荷検品中断ワークデータ削除 =====

		{
			WShippingInterruptCB cb = wShippingInterruptBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wShippingInterruptBhv, cb, getQuerySetter(wShippingInterruptBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wShippingInterruptBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 商品マスタ取込ワークデータ削除 =====

		{
			WProductInputCB cb = wProductInputBhv.newMyConditionBean();
			// 荷主CD
			cb.query().setClientCd_Equal(clientCd);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wProductInputBhv, cb, getQuerySetter(wProductInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wProductInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 商品荷姿マスタ取込ワークデータ削除 =====

		{
			WProductShapeInputCB cb = wProductShapeInputBhv.newMyConditionBean();
			// 荷主CD
			cb.query().setClientCd_Equal(clientCd);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wProductShapeInputBhv, cb, getQuerySetter(wProductShapeInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wProductShapeInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 取引先マスタ取込ワークデータ削除 =====

		{
			WCustomerInputCB cb = wCustomerInputBhv.newMyConditionBean();
			// 荷主CD
			cb.query().setClientCd_Equal(clientCd);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wCustomerInputBhv, cb, getQuerySetter(wCustomerInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wCustomerInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== ロケーションマスタ取込ワークデータ削除 =====

		{
			WLocationInputCB cb = wLocationInputBhv.newMyConditionBean();
			// センタCD
			cb.query().setCenterCd_Equal(centerCd);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wLocationInputBhv, cb, getQuerySetter(wLocationInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wLocationInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 在庫取込ワークデータ削除 =====

		{
			WStockInputCB cb = wStockInputBhv.newMyConditionBean();
			// センタCD
			cb.query().setCenterCd_Equal(centerCd);
			// 荷主CD
			cb.query().setClientCd_Equal(clientCd);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wStockInputBhv, cb, getQuerySetter(wStockInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wStockInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 運送業者郵便番号マスタ取込ワークデータ削除 =====

		{
			WCarrierZipInputCB cb = wCarrierZipInputBhv.newMyConditionBean();
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wCarrierZipInputBhv, cb, getQuerySetter(wCarrierZipInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wCarrierZipInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 郵便番号マスタ(大口事業所)取込ワークデータ削除 =====

		{
			WZipCompanyInputCB cb = wZipCompanyInputBhv.newMyConditionBean();
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wZipCompanyInputBhv, cb, getQuerySetter(wZipCompanyInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wZipCompanyInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== 郵便番号マスタ取込ワークデータ削除 =====

		{
			WZipInputCB cb = wZipInputBhv.newMyConditionBean();
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wZipInputBhv, cb, getQuerySetter(wZipInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wZipInputBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT入荷検品ワークデータ削除 =====

		{
			WHtReceiveInspectionCB cb = wHtReceiveInspectionBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtReceiveInspectionBhv, cb, getQuerySetter(wHtReceiveInspectionBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtReceiveInspectionBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT入庫格納ワークデータ削除 =====

		{
			WHtReceiveStoreCB cb = wHtReceiveStoreBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtReceiveStoreBhv, cb, getQuerySetter(wHtReceiveStoreBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtReceiveStoreBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT予定無し入荷ワークデータ削除 =====

		{
			WHtReceiveNoPlanInspCB cb = wHtReceiveNoPlanInspecBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtReceiveNoPlanInspecBhv, cb, getQuerySetter(wHtReceiveNoPlanInspecBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtReceiveNoPlanInspecBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HTシリアル登録(入荷)ワークデータ削除 =====

		{
			WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtSerialReceiveInspBhv, cb, getQuerySetter(wHtSerialReceiveInspBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtSerialReceiveInspBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT出荷ピッキングワークデータ削除 =====

		{
			WHtShippingPickingCB cb = wHtShippingPickingBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtShippingPickingBhv, cb, getQuerySetter(wHtShippingPickingBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtShippingPickingBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT出荷検品ワークデータ削除 =====

		{
			WHtShippingCB cb = wHtShippingBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtShippingBhv, cb, getQuerySetter(wHtShippingBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtShippingBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT積込検品ワークデータ削除 =====

		{
			WHtLoadingCB cb = wHtLoadingBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtLoadingBhv, cb, getQuerySetter(wHtLoadingBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtLoadingBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HTシリアル登録(出荷)ワークデータ削除 =====

		{
			WHtSerialShippingInspCB cb = wHtSerialShippingInspBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtSerialShippingInspBhv, cb, getQuerySetter(wHtSerialShippingInspBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtSerialShippingInspBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		// ===== HT商品棚卸ワークデータ削除 =====

		{
			WHtInventoryInputProdCB cb = wHtInventoryInputProductBhv.newMyConditionBean();
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delCount = queryUpdateLogic.queryDeleteWithSelect(wHtInventoryInputProductBhv, cb, getQuerySetter(wHtInventoryInputProductBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wHtInventoryInputProductBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		}

		//[Ver3.1][#5126] 追加されたワークテーブルの日次処理時の削除処理追加 2018.09.05 miyabe add Start

		// ===== 単行出荷検品ワークデータ削除 =====
		{

			//単行出荷検品ワークボディデータ削除
			WSglRowShipInspBCB wSglRowShipInspBcb = wSglRowShipInspBBhv.newMyConditionBean();
			// センタID
			wSglRowShipInspBcb.query().queryWSglRowShipInspH().setCenterId_Equal(centerId);
			// 荷主ID
			wSglRowShipInspBcb.query().queryWSglRowShipInspH().setClientId_Equal(clientId);
			// 更新日
			wSglRowShipInspBcb.query().queryWSglRowShipInspH().setUpdDt_LessEqual(delDayTimestamp);

			// 削除実行
			int wSglRowShipInspBDelCount = queryUpdateLogic.queryDeleteWithSelect(wSglRowShipInspBBhv, wSglRowShipInspBcb, getQuerySetter(wSglRowShipInspBBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wSglRowShipInspBBhv.asTableDbName().toUpperCase(), String.valueOf(wSglRowShipInspBDelCount));

			//単行出荷検品ワークヘッダデータ削除
			WSglRowShipInspHCB wSglRowShipInspHcb = wSglRowShipInspHBhv.newMyConditionBean();
			// センタID
			wSglRowShipInspHcb.query().setCenterId_Equal(centerId);
			// 荷主ID
			wSglRowShipInspHcb.query().setClientId_Equal(clientId);
			// 更新日
			wSglRowShipInspHcb.query().setUpdDt_LessEqual(delDayTimestamp);

			// 削除実行
			int wSglRowShipInspHDelCount = queryUpdateLogic.queryDeleteWithSelect(wSglRowShipInspHBhv, wSglRowShipInspHcb, getQuerySetter(wSglRowShipInspHBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, wSglRowShipInspHBhv.asTableDbName().toUpperCase(), String.valueOf(wSglRowShipInspHDelCount));
		}

		// ===== ピッキング提案ワーク削除 =====
		{
			//ピッキング提案データ削除
			TPicMthdRcmdDataCB tPicMthdRcmdDatacb = tPicMthdRcmdDataBhv.newMyConditionBean();
			// センタID
			tPicMthdRcmdDatacb.query().queryTPicMthdRcmd().setCenterId_Equal(centerId);
			// 荷主ID
			tPicMthdRcmdDatacb.query().queryTPicMthdRcmd().setClientId_Equal(clientId);
			// 更新日
			tPicMthdRcmdDatacb.query().queryTPicMthdRcmd().setUpdDt_LessEqual(delDayTimestamp);

			// 削除実行
			int tPicMthdRcmdDataDelCount = queryUpdateLogic.queryDeleteWithSelect(tPicMthdRcmdDataBhv, tPicMthdRcmdDatacb, getQuerySetter(tPicMthdRcmdDataBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPicMthdRcmdDataBhv.asTableDbName().toUpperCase(), String.valueOf(tPicMthdRcmdDataDelCount));

			//ピッキング提案台車削除
			TPicMthdRcmdCartCB tPicMthdRcmdCartcb = tPicMthdRcmdCartBhv.newMyConditionBean();
			// センタID
			tPicMthdRcmdCartcb.query().queryTPicMthdRcmd().setCenterId_Equal(centerId);
			// 荷主ID
			tPicMthdRcmdCartcb.query().queryTPicMthdRcmd().setClientId_Equal(clientId);
			// 更新日
			tPicMthdRcmdCartcb.query().queryTPicMthdRcmd().setUpdDt_LessEqual(delDayTimestamp);

			// 削除実行
			int tPicMthdRcmdCartDelCount = queryUpdateLogic.queryDeleteWithSelect(tPicMthdRcmdCartBhv, tPicMthdRcmdCartcb, getQuerySetter(tPicMthdRcmdCartBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPicMthdRcmdCartBhv.asTableDbName().toUpperCase(), String.valueOf(tPicMthdRcmdCartDelCount));

			//ピッキング提案削除
			TPicMthdRcmdCB tPicMthdRcmdcb = tPicMthdRcmdBhv.newMyConditionBean();
			// センタID
			tPicMthdRcmdcb.query().setCenterId_Equal(centerId);
			// 荷主ID
			tPicMthdRcmdcb.query().setClientId_Equal(clientId);
			// 更新日
			tPicMthdRcmdcb.query().setUpdDt_LessEqual(delDayTimestamp);

			// 削除実行
			int tPicMthdRcmdDelCount = queryUpdateLogic.queryDeleteWithSelect(tPicMthdRcmdBhv, tPicMthdRcmdcb, getQuerySetter(tPicMthdRcmdBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPicMthdRcmdBhv.asTableDbName().toUpperCase(), String.valueOf(tPicMthdRcmdDelCount));
		}
		//[Ver3.1][#5126] 追加されたワークテーブルの日次処理時の削除処理追加 2018.09.05 miyabe add End
	}

	/**
	 * <h2>QueryDelete , QueryUpdateの引数を取得.</h2>
	 * <pre>
	 * 日次締処理共通ロジッククラスの QueryDelete , QueryUpdate メソッドの引数、
	 * QuerySetterクラスを作成して返却する。
	 * </pre>
	 * @param bhv 処理対象テーブルの操作クラス
	 * @return 処理対象テーブル用のQuerySetterクラス
	 */
	private AbstractQuerySetter getQuerySetter(AbstractBehaviorWritable<?, ?> bhv) {

		if (bhv instanceof WCarrierZipInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WCarrierZipInputCB) cb).specify().columnCarrierZipInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wCarrierZipInputBhv.extractCarrierZipInputIdList((List<WCarrierZipInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WCarrierZipInputCB cb = wCarrierZipInputBhv.newMyConditionBean();
					cb.query().setCarrierZipInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WCustomerInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WCustomerInputCB) cb).specify().columnCustomerInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wCustomerInputBhv.extractCustomerInputIdList((List<WCustomerInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WCustomerInputCB cb = wCustomerInputBhv.newMyConditionBean();
					cb.query().setCustomerInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtInventoryInputProdBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtInventoryInputProdCB) cb).specify().columnHtInventoryInputProdId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtInventoryInputProductBhv.extractHtInventoryInputProdIdList((List<WHtInventoryInputProd>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtInventoryInputProdCB cb = wHtInventoryInputProductBhv.newMyConditionBean();
					cb.query().setHtInventoryInputProdId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtLoadingBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtLoadingCB) cb).specify().columnHtLoadingId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtLoadingBhv.extractHtLoadingIdList((List<WHtLoading>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtLoadingCB cb = wHtLoadingBhv.newMyConditionBean();
					cb.query().setHtLoadingId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtReceiveInspectionBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtReceiveInspectionCB) cb).specify().columnHtReceiveInspectionId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtReceiveInspectionBhv.extractHtReceiveInspectionIdList((List<WHtReceiveInspection>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtReceiveInspectionCB cb = wHtReceiveInspectionBhv.newMyConditionBean();
					cb.query().setHtReceiveInspectionId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtReceiveNoPlanInspBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtReceiveNoPlanInspCB) cb).specify().columnHtReceiveNoPlanInspId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtReceiveNoPlanInspecBhv.extractHtReceiveNoPlanInspIdList((List<WHtReceiveNoPlanInsp>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtReceiveNoPlanInspCB cb = wHtReceiveNoPlanInspecBhv.newMyConditionBean();
					cb.query().setHtReceiveNoPlanInspId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtReceiveStoreBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtReceiveStoreCB) cb).specify().columnHtReceiveStoreId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtReceiveStoreBhv.extractHtReceiveStoreIdList((List<WHtReceiveStore>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtReceiveStoreCB cb = wHtReceiveStoreBhv.newMyConditionBean();
					cb.query().setHtReceiveStoreId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtSerialReceiveInspBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtSerialReceiveInspCB) cb).specify().columnHtSerialReceiveInspId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtSerialReceiveInspBhv.extractHtSerialReceiveInspIdList((List<WHtSerialReceiveInsp>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newMyConditionBean();
					cb.query().setHtSerialReceiveInspId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtSerialShippingInspBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtSerialShippingInspCB) cb).specify().columnHtSerialShippingInspId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtSerialShippingInspBhv.extractHtSerialShippingInspIdList((List<WHtSerialShippingInsp>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtSerialShippingInspCB cb = wHtSerialShippingInspBhv.newMyConditionBean();
					cb.query().setHtSerialShippingInspId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtShippingBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtShippingCB) cb).specify().columnHtShippingId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtShippingBhv.extractHtShippingIdList((List<WHtShipping>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtShippingCB cb = wHtShippingBhv.newMyConditionBean();
					cb.query().setHtShippingId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WHtShippingPickingBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WHtShippingPickingCB) cb).specify().columnHtShippingPickingId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wHtShippingPickingBhv.extractHtShippingPickingIdList((List<WHtShippingPicking>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WHtShippingPickingCB cb = wHtShippingPickingBhv.newMyConditionBean();
					cb.query().setHtShippingPickingId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WLocationInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WLocationInputCB) cb).specify().columnLocationInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wLocationInputBhv.extractLocationInputIdList((List<WLocationInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WLocationInputCB cb = wLocationInputBhv.newMyConditionBean();
					cb.query().setLocationInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WProductInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WProductInputCB) cb).specify().columnProductInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wProductInputBhv.extractProductInputIdList((List<WProductInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WProductInputCB cb = wProductInputBhv.newMyConditionBean();
					cb.query().setProductInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WProductShapeInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WProductShapeInputCB) cb).specify().columnProductShapeInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wProductShapeInputBhv.extractProductShapeInputIdList((List<WProductShapeInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WProductShapeInputCB cb = wProductShapeInputBhv.newMyConditionBean();
					cb.query().setProductShapeInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WShippingInterruptBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WShippingInterruptCB) cb).specify().columnShippingInstHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wShippingInterruptBhv.extractShippingInstHIdList((List<WShippingInterrupt>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WShippingInterruptCB cb = wShippingInterruptBhv.newMyConditionBean();
					cb.query().setShippingInstHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WStockInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WStockInputCB) cb).specify().columnStockInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wStockInputBhv.extractStockInputIdList((List<WStockInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WStockInputCB cb = wStockInputBhv.newMyConditionBean();
					cb.query().setStockInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WZipCompanyInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WZipCompanyInputCB) cb).specify().columnZipCompanyInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wZipCompanyInputBhv.extractZipCompanyInputIdList((List<WZipCompanyInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WZipCompanyInputCB cb = wZipCompanyInputBhv.newMyConditionBean();
					cb.query().setZipCompanyInputId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WZipInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WZipInputCB) cb).specify().columnZipInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wZipInputBhv.extractZipInputIdList((List<WZipInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WZipInputCB cb = wZipInputBhv.newMyConditionBean();
					cb.query().setZipInputId_InScope(pkList);
					return cb;
				}
			};
		}

		//[Ver3.1][#5126] 追加されたワークテーブルの日次処理時の削除処理追加 2018.09.05 miyabe add Start
		if (bhv instanceof WSglRowShipInspHBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WSglRowShipInspHCB) cb).specify().columnSglRowShipInspHId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wSglRowShipInspHBhv.extractSglRowShipInspHIdList((List<WSglRowShipInspH>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WSglRowShipInspHCB cb = wSglRowShipInspHBhv.newMyConditionBean();
					cb.query().setSglRowShipInspHId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof WSglRowShipInspBBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((WSglRowShipInspBCB) cb).specify().columnSglRowShipInspBId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return wSglRowShipInspBBhv.extractSglRowShipInspBIdList((List<WSglRowShipInspB>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();
					cb.query().setSglRowShipInspBId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPicMthdRcmdDataBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPicMthdRcmdDataCB) cb).specify().columnPicMthdRcmdDataId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPicMthdRcmdDataBhv.extractPicMthdRcmdDataIdList((List<TPicMthdRcmdData>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPicMthdRcmdDataCB cb = tPicMthdRcmdDataBhv.newMyConditionBean();
					cb.query().setPicMthdRcmdDataId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPicMthdRcmdCartBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPicMthdRcmdCartCB) cb).specify().columnPicMthdRcmdCartId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPicMthdRcmdCartBhv.extractPicMthdRcmdCartIdList((List<TPicMthdRcmdCart>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPicMthdRcmdCartCB cb = tPicMthdRcmdCartBhv.newMyConditionBean();
					cb.query().setPicMthdRcmdCartId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof TPicMthdRcmdBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TPicMthdRcmdCB) cb).specify().columnPicMthdRcmdId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tPicMthdRcmdBhv.extractPicMthdRcmdIdList((List<TPicMthdRcmd>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TPicMthdRcmdCB cb = tPicMthdRcmdBhv.newMyConditionBean();
					cb.query().setPicMthdRcmdId_InScope(pkList);
					return cb;
				}
			};
		}
		//[Ver3.1][#5126] 追加されたワークテーブルの日次処理時の削除処理追加 2018.09.05 miyabe add End

		getErrorManager().throwException(new IllegalArgumentException("querySetter not found"));
		return null;

		// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End

	}
}
