package com.oneslogi.wms.logic.daily;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.EBarcodeLabelCB;
import com.oneslogi.base.dbflute.cbean.ECustomerCB;
import com.oneslogi.base.dbflute.cbean.ELocationCB;
import com.oneslogi.base.dbflute.cbean.EProductCB;
import com.oneslogi.base.dbflute.cbean.EProductShapeCB;
import com.oneslogi.base.dbflute.cbean.EReceivePlanCB;
import com.oneslogi.base.dbflute.cbean.ESerialInputCB;
import com.oneslogi.base.dbflute.cbean.EShippingInstCB;
import com.oneslogi.base.dbflute.cbean.EZipCB;
import com.oneslogi.base.dbflute.exbhv.EBarcodeLabelBhv;
import com.oneslogi.base.dbflute.exbhv.ECustomerBhv;
import com.oneslogi.base.dbflute.exbhv.ELocationBhv;
import com.oneslogi.base.dbflute.exbhv.EProductBhv;
import com.oneslogi.base.dbflute.exbhv.EProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.EReceivePlanBhv;
import com.oneslogi.base.dbflute.exbhv.ESerialInputBhv;
import com.oneslogi.base.dbflute.exbhv.EShippingInstBhv;
import com.oneslogi.base.dbflute.exbhv.EZipBhv;
import com.oneslogi.base.dbflute.exentity.EBarcodeLabel;
import com.oneslogi.base.dbflute.exentity.ECustomer;
import com.oneslogi.base.dbflute.exentity.ELocation;
import com.oneslogi.base.dbflute.exentity.EProduct;
import com.oneslogi.base.dbflute.exentity.EProductShape;
import com.oneslogi.base.dbflute.exentity.EReceivePlan;
import com.oneslogi.base.dbflute.exentity.ESerialInput;
import com.oneslogi.base.dbflute.exentity.EShippingInst;
import com.oneslogi.base.dbflute.exentity.EZip;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;

/**
 * EDIデータ削除ロジッククラス(EDIデータ削除)
 */
public class DailyEdiDataDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private EProductBhv eProductBhv;
	@Inject
	private EProductShapeBhv eProductShapeBhv;
	@Inject
	private ECustomerBhv eCustomerBhv;
	@Inject
	private ELocationBhv eLocationBhv;
	@Inject
	private EReceivePlanBhv eReceivePlanBhv;
	@Inject
	private EShippingInstBhv eShippingInstBhv;
	@Inject
	private EBarcodeLabelBhv eBarcodeLabelBhv;
	// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start
	@Inject
	private ESerialInputBhv eSerialInputBhv;
	// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End
	//[Ver3.1][#5635] 追加されたワークテーブルの日次処理時の削除処理追加 2018.11.15 tanaka add Start
	@Inject
	private EZipBhv eZipBhv;
	//[Ver3.1][#5635] 追加されたワークテーブルの日次処理時の削除処理追加 2018.11.15 tanaka add End

	// ===== 使用ロジッククラス =====

	@Inject
	private DailyCommonLogic commonLogic;
	@Inject
	private QueryUpdateLogic queryUpdateLogic;

	/**
	 * <h2>EDIデータ削除処理.</h2>
	 * <pre>
	 * EDIデータの削除処理を行う。
	 * トランザクション保持期間を過ぎたEDIデータを削除する。
	 *
	 * 【削除テーブル】
	 *  ・商品マスタ受信テーブル
	 *  ・商品荷姿マスタ受信テーブル
	 *  ・取引先マスタ受信テーブル
	 *  ・ロケーションマスタ受信テーブル
	 *  ・入荷予定受信テーブル
	 *  ・出荷指示受信テーブル
	 *  ・バーコードラベル受信テーブル
	 *  ・シリアルNo.受信テーブル
	 *
	 * 【パラメータの使用項目】
	 *  (荷主センタマスタ)
	 *  ・荷主センタCD : 必須
	 *  ・システム管理日付 : 必須
	 *  (パラメータマスタ)
	 *  ・トランザクション保持期間 : 必須
	 * </pre>
	 * @param clientCenter 荷主センタマスタ
	 * @param param パラメータマスタ
	 */
	public void ediDataDelete(MClientCenter clientCenter, MParam param) {

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start

		// ===== 初期処理 =====

		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// トランザクション保持期間
		final long keepingDays = param.getTKeepingDays();

		// [#282][2.1.0-CT-053] 日付の計算方法に間違いがあったので修正 2016.11.28 kawana Start

		// ===== 対象日の計算 =====

		String delDay = null;
		Timestamp delDayTimestamp = null;

		if (0 < keepingDays) {
			try {
				// 削除対象日に荷主センタマスタ.前回システム管理日付 － パラメータ.トランザクション保持期間 を設定する
				delDay = commonLogic.getTargetDay(systemDt, keepingDays);
				// [#1834] 削除日が1日遅れる問題を修正 2017.05.24 kawana Start
				// ※※※ 更新日の23:59:59までのデータを消すため対象日1日加算する
				Calendar calendar = commonLogic.stringToCalendar(delDay);
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				delDayTimestamp = new Timestamp(calendar.getTimeInMillis());
				// [#1834] 削除日が1日遅れる問題を修正 2017.05.24 kawana End
			} catch (Exception e) {
				getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
			}
		}
		// [#282][2.1.0-CT-053] 日付の計算方法に間違いがあったので修正 2016.11.28 kawana End

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_EDI_DATA_DELETE
				// [#169] メッセージの重複を削除 2016.12.05 kawana Start
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS
				// [#169] メッセージの重複を削除 2016.12.05 kawana End
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

		// ===== EDI関連データ削除 =====

		final String centerCd = clientCenter.getMCenter().getCenterCd();
		final String clientCd = clientCenter.getMClient().getClientCd();

		ediDataDelete(delDayTimestamp, centerCd, clientCd);

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End

		// ===== 終了処理 =====

		// 削除フラグの条件付加を開始する
		setBehaviorAutoDelFlg(preAutoDelFlg);

		// 運用ログの終了
		commonLogic.endLogSection();
	}

	/**
	 * <h2>EDIデータ削除処理</h2>
	 * @param delDayTimestamp 削除対象日
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 */
	private void ediDataDelete(Timestamp delDayTimestamp, final String centerCd, final String clientCd) {

		// ===== 商品マスタ受信データ削除 =====

		{
			EProductCB eProductCB = eProductBhv.newMyConditionBean();
			// 荷主CD
			eProductCB.query().setClientCd_Equal(clientCd);
			// 更新日
			eProductCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eProductBhv, eProductCB, getQuerySetter(eProductBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eProductBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 商品荷姿マスタ受信データ削除 =====

		{
			EProductShapeCB eProductShapeCB = eProductShapeBhv.newMyConditionBean();
			// 荷主CD
			eProductShapeCB.query().setClientCd_Equal(clientCd);
			// 更新日
			eProductShapeCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eProductShapeBhv, eProductShapeCB, getQuerySetter(eProductShapeBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eProductShapeBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 取引先マスタ受信データ削除 =====

		{
			ECustomerCB eCustomerCB = eCustomerBhv.newMyConditionBean();
			// 荷主CD
			eCustomerCB.query().setClientCd_Equal(clientCd);
			// 更新日
			eCustomerCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eCustomerBhv, eCustomerCB, getQuerySetter(eCustomerBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eCustomerBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== ロケーションマスタ受信データ削除 =====

		{
			ELocationCB eLocationCB = eLocationBhv.newMyConditionBean();
			// 荷主CD
			eLocationCB.query().setClientCd_Equal(clientCd);
			// 更新日
			eLocationCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eLocationBhv, eLocationCB, getQuerySetter(eLocationBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eLocationBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 入荷予定受信データ削除 =====

		{
			EReceivePlanCB eReceivePlanCB = eReceivePlanBhv.newMyConditionBean();
			// 荷主CD
			eReceivePlanCB.query().setClientCd_Equal(clientCd);
			// 更新日
			eReceivePlanCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eReceivePlanBhv, eReceivePlanCB, getQuerySetter(eReceivePlanBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eReceivePlanBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 出荷指示受信データ削除 =====

		{
			EShippingInstCB eShippingInstCB = eShippingInstBhv.newMyConditionBean();
			// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma start
			// 荷主CD
			eShippingInstCB.query().setClientCd_Equal(clientCd);
			// センタCD
			eShippingInstCB.query().setCenterCd_Equal(centerCd);
			// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma end
			// 更新日
			eShippingInstCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eShippingInstBhv, eShippingInstCB, getQuerySetter(eShippingInstBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eShippingInstBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== バーコードラベル受信データ削除 =====

		{
			EBarcodeLabelCB eBarcodeLabelCB = eBarcodeLabelBhv.newMyConditionBean();
			// 更新日
			eBarcodeLabelCB.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eBarcodeLabelBhv, eBarcodeLabelCB, getQuerySetter(eBarcodeLabelBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eBarcodeLabelBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start

		// ===== シリアルNo.受信データ削除 =====

		{
			ESerialInputCB cb = eSerialInputBhv.newMyConditionBean();
			// 荷主CD
			cb.query().setClientCd_Equal(clientCd);
			// センタCD
			cb.query().setCenterCd_Equal(centerCd);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(eSerialInputBhv, cb, getQuerySetter(eSerialInputBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eSerialInputBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End

		//[Ver3.1][#5635] 追加されたワークテーブルの日次処理時の削除処理追加 2018.11.15 tanaka add Start
		// ===== 郵便番号一括取込ワーク削除 =====
		{
			EZipCB eZipcb = eZipBhv.newMyConditionBean();
			// 更新日
			eZipcb.query().setUpdDt_LessEqual(delDayTimestamp);
			// 削除実行
			int eZipDelCount = queryUpdateLogic.queryDeleteWithSelect(eZipBhv, eZipcb, getQuerySetter(eZipBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, eZipBhv.asTableDbName().toUpperCase(), String.valueOf(eZipDelCount));
		}

		//[Ver3.1][#5635] 追加されたワークテーブルの日次処理時の削除処理追加 2018.11.15 tanaka add End
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

		if (bhv instanceof EProductBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((EProductCB) cb).specify().columnProductId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eProductBhv.extractProductIdList((List<EProduct>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					EProductCB cb = eProductBhv.newMyConditionBean();
					cb.query().setProductId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof EProductShapeBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((EProductShapeCB) cb).specify().columnProductShapeId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eProductShapeBhv.extractProductShapeIdList((List<EProductShape>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					EProductShapeCB cb = eProductShapeBhv.newMyConditionBean();
					cb.query().setProductShapeId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof ECustomerBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((ECustomerCB) cb).specify().columnCustomerId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eCustomerBhv.extractCustomerIdList((List<ECustomer>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					ECustomerCB cb = eCustomerBhv.newMyConditionBean();
					cb.query().setCustomerId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof ELocationBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((ELocationCB) cb).specify().columnLocationId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eLocationBhv.extractLocationIdList((List<ELocation>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					ELocationCB cb = eLocationBhv.newMyConditionBean();
					cb.query().setLocationId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof EReceivePlanBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((EReceivePlanCB) cb).specify().columnReceivePlanId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eReceivePlanBhv.extractReceivePlanIdList((List<EReceivePlan>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					EReceivePlanCB cb = eReceivePlanBhv.newMyConditionBean();
					cb.query().setReceivePlanId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof EShippingInstBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((EShippingInstCB) cb).specify().columnShippingInstId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eShippingInstBhv.extractShippingInstIdList((List<EShippingInst>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					EShippingInstCB cb = eShippingInstBhv.newMyConditionBean();
					cb.query().setShippingInstId_InScope(pkList);
					return cb;
				}
			};
		}

		if (bhv instanceof EBarcodeLabelBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((EBarcodeLabelCB) cb).specify().columnBarcodeLabelId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eBarcodeLabelBhv.extractBarcodeLabelIdList((List<EBarcodeLabel>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					EBarcodeLabelCB cb = eBarcodeLabelBhv.newMyConditionBean();
					cb.query().setBarcodeLabelId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start

		if (bhv instanceof ESerialInputBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((ESerialInputCB) cb).specify().columnSerialInputId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eSerialInputBhv.extractSerialInputIdList((List<ESerialInput>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					ESerialInputCB cb = eSerialInputBhv.newMyConditionBean();
					cb.query().setSerialInputId_InScope(pkList);
					return cb;
				}
			};
		}

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End

		//[Ver3.1][#5635] 追加されたワークテーブルの日次処理時の削除処理追加 2018.11.20 tanaka add Start
		if (bhv instanceof EZipBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((EZipCB) cb).specify().columnZipCd();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return eZipBhv.extractZipIdList((List<EZip>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					EZipCB cb = eZipBhv.newMyConditionBean();
					cb.query().setZipId_InScope(pkList);
					return cb;
				}
			};
		}
		//[Ver3.1][#5635] 追加されたワークテーブルの日次処理時の削除処理追加 2018.11.20 tanaka add End

		getErrorManager().throwException(new IllegalArgumentException("querySetter not found"));
		return null;
	}
}
