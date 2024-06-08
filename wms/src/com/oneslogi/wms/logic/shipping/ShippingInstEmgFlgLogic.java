package com.oneslogi.wms.logic.shipping;

import java.util.Calendar;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷指示緊急フラグロジッククラス
 */
public class ShippingInstEmgFlgLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	/**
	 * <h2>緊急フラグ設定.</h2>
	 * <pre>
	 * パラメータマスタの以下の設定に従い引数の出荷指示ヘッダに緊急フラグを設定する。
	 * DB更新はしない。
	 * ・自動緊急フラグ設定フラグ
	 * ・自動緊急フラグ設定対象
	 * ・自動緊急フラグ判断時間(分)
	 *
	 * </pre>
	 * @param header 設定対象の出荷指示ヘッダ:出荷日、緊急フラグ(設定)
	 * @param deliveryCourse 配送コースマスタ:積込予定時刻、出荷予定時刻
	 * @param param パラメータマスタ:
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void setEmergencyFlg(TShippingInstH header, MDeliveryCourse deliveryCourse, MParam param, ErrorStatus errSts) {

		if (!param.isAutoEmgSetFlg$1()) {
			// 自動緊急フラグ設定しない
			return;
		}

		if (header.isEmergencyFlg$1()) {
			// 既に 緊急フラグ = 1
			return;
		}

		// 判断対象時刻

		CDef.AutoEmgSetTgt autoEmgSetTgt = param.getAutoEmgSetTgtAsAutoEmgSetTgt();

		String tgtTime = null;
		switch (autoEmgSetTgt) {
		case $1:
			// 積込予定時刻
			tgtTime = deliveryCourse.getStowageTime();
			break;
		case $2:
			// 出荷予定時刻
			tgtTime = deliveryCourse.getShippingTime();
			break;
		default:
			return;
		}

		if (CU.isNullOrEmpty(tgtTime)) {
			// 対象時刻 未設定
			return;
		}

		// 判断時間(分)

		Long autoEmgSetMinute = param.getAutoEmgSetMinute();
		if (autoEmgSetMinute == null) {
			return;
		}

		// 現在の日付

		String systemDt = param.chaseMClientCenter().getSystemDt();
		if (CU.isNullOrEmpty(systemDt)) {
			// システム管理日付

			MClientCenter clientCenter = mClientCenterBhv.selectByPKValue(param.getClientCenterId());
			systemDt = clientCenter.getSystemDt();

			if (CU.isNullOrEmpty(systemDt)) {
				// システム管理日付未設定
				return;
			}
		}

		// 出荷日
		String shippingDt = header.getShippingDt();

		// ===== 時刻の判定 =====

		String[] tgtTimes = tgtTime.split(":");
		if (tgtTimes.length != 2) {
			return;
		}

		Calendar tgtTimeCal = Calendar.getInstance();
		Calendar nowTimeCal = Calendar.getInstance();
		try {
			// 不正な設定値の場合を考慮してcatch節を使用

			int tgtHour = Integer.valueOf(tgtTimes[0]);
			int tgtMinute = Integer.valueOf(tgtTimes[1]);

			// 出荷時刻 (出荷日 + 出荷時刻)
			tgtTimeCal.setTime(CU.stringToDate(shippingDt));
			tgtTimeCal.set(Calendar.HOUR_OF_DAY, tgtHour);
			tgtTimeCal.set(Calendar.MINUTE, tgtMinute);

			int nowHour = nowTimeCal.get(Calendar.HOUR_OF_DAY);
			int nowMinute = nowTimeCal.get(Calendar.MINUTE);

			// 現在時刻 (システム稼働日 + サーバ時刻)
			nowTimeCal.setTime(CU.stringToDate(systemDt));
			nowTimeCal.set(Calendar.HOUR_OF_DAY, nowHour);
			nowTimeCal.set(Calendar.MINUTE, nowMinute);
			// 判定時刻を加算
			nowTimeCal.add(Calendar.MINUTE, autoEmgSetMinute.intValue());
		} catch (Exception e) {
			// 不正値の場合は緊急フラグの設定をしない (自由フォーマットなのでエラーにはしない)

			return;
		}

		if (0 < nowTimeCal.compareTo(tgtTimeCal)) {
			// 時刻を過ぎている

			// 緊急フラグ設定
			header.setEmergencyFlg_$1();
			return;
		}
	}
}