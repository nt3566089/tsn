package com.oneslogi.wms.logic.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.BUserAuthCB;
import com.oneslogi.base.dbflute.cbean.WWorkCB;
import com.oneslogi.base.dbflute.exbhv.BUserAuthBhv;
import com.oneslogi.base.dbflute.exbhv.WWorkBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.BUserAuth;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.AttendanceEntryHead;
import com.oneslogi.wms.logic.common.UserLogic;

public class AttendanceEntrySelectLogic extends AbstractWmsLogic {

	@Inject
	private WWorkBhv wWorkBhv;
	@Inject
	private BUserAuthBhv bUserAuthBhv;

	@Inject
	private MessageLogic messageLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * <h2>ユーザマスタのユニークキー検索。</h2>
	 *
	 * @param userCd
	 * @return ユーザマスタのEntity
	 */
	public BUser getBUserEntityByUserCd(String userCd) {
		BUser entity = new BUser();
		entity.setUserCd(userCd);

		BUser result = new BUser();
		result = userLogic.getUkEntity(entity);

		return result;
	}

	/**
	 * <h2>
	 * 出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @return 条件にあてはまった情報の数
	 */
	public int getAttendanceCntByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setClockInFlg_Equal("1");
		cb.query().setClockOutFlg_Equal("0");
		cb.query().setEntryStartDt_Equal(workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		int cnt = wWorkBhv.selectCount(cb);

		return cnt;
	}

	/**
	 * <h2>
	 * 出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @return 条件にあてはまった情報の数
	 */
	public WWork getAttendanceEntityByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setClockInFlg_Equal("1");
		cb.query().setClockOutFlg_Equal("0");
		cb.query().setEntryStartDt_Equal(workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		WWork wWork = wWorkBhv.selectEntity(cb);

		return wWork;
	}

	/**
	 * <h2>
	 * 退勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @return 条件にあてはまった情報の数
	 */
	public int getLeavingCntByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setClockInFlg_Equal("0");
		cb.query().setClockOutFlg_Equal("1");
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		cb.query().setEntryEndDt_GreaterEqual(workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		int cnt = wWorkBhv.selectCount(cb);

		return cnt;
	}

	/**
	 * <h2>
	 * 退勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @return 条件にあてはまった情報の数
	 */
	public List<WWork> getLeavingListByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setClockInFlg_Equal("0");
		cb.query().setClockOutFlg_Equal("1");
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		cb.query().setEntryEndDt_GreaterEqual(workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		List<WWork> wWorkList = wWorkBhv.selectList(cb);

		return wWorkList;
	}

	/**
	 * <h2>
	 * 休憩開始での勤務実績ワーク情報のentityを取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに勤務実績ワーク情報のentityを取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @param workDt 作業日
	 * @return 勤務実績ワーク情報のentity
	 */
	public int getStartRestCntByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB startCb = wWorkBhv.newMyConditionBean();
		startCb.query().setWorkUserCd_Equal(workUserCd);
		startCb.query().setClockInFlg_Equal("0");
		startCb.query().setClockOutFlg_Equal("0");
		startCb.query().setBreakStartFlg_Equal("1");
		startCb.query().setBreakStartDt_GreaterEqual(workDt);

		int startCnt = wWorkBhv.selectCount(startCb);

		return startCnt;
	}

	/**
	 * <h2>
	 * 休憩開始での勤務実績ワーク情報のentityを取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに勤務実績ワーク情報のentityを取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @param workDt 作業日
	 * @return 勤務実績ワーク情報のentity
	 */
	public List<WWork> getStartRestListByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB startCb = wWorkBhv.newMyConditionBean();
		startCb.query().setWorkUserCd_Equal(workUserCd);
		startCb.query().setClockInFlg_Equal("0");
		startCb.query().setClockOutFlg_Equal("0");
		startCb.query().setBreakStartFlg_Equal("1");
		startCb.query().setBreakStartDt_GreaterEqual(workDt);

		List<WWork> startList = wWorkBhv.selectList(startCb);

		return startList;
	}

	/**
	 * <h2>休憩開始での勤務実績ワーク1件検索。</h2>
	 *
	 * @param head
	 * @return 休憩開始での勤務実績ワーク
	 */
	public WWork getWWorkByBreakStart(AttendanceEntryHead head) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();

		final String systemDt = head.systemDt;

		cb.query().setWorkUserCd_Equal(head.workUserCd);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		cb.orScopeQuery(new OrQuery<WWorkCB>() {
			public void query(WWorkCB orCb) {
				orCb.query().setWorkDt_Equal(systemDt);
				orCb.query().setWorkDt_Equal(beforeWorkDt(systemDt));
			}
		});
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End
		cb.query().setBreakStartFlg_Equal("1");

		List<WWork> resultList = wWorkBhv.selectList(cb);

		return resultList.get(resultList.size() - 1);
	}

	/**
	 * <h2>休憩開始での勤務実績ワーク複数件検索。</h2>
	 *
	 * @param head
	 * @return 休憩開始での勤務実績ワークリスト
	 */
	public List<WWork> getWWorkListByBreakStart(AttendanceEntryHead head) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();

		cb.query().setWorkUserCd_Equal(head.workUserCd);
		cb.query().setWorkDt_Equal(head.workDt);
		cb.query().setBreakStartFlg_Equal("1");

		cb.query().addOrderBy_BreakStartTm_Asc();

		List<WWork> resultList = wWorkBhv.selectList(cb);

		return resultList;
	}

	/**
	 * <h2>未処理のワークデータを取得。</h2>
	 * <pre>
	 * ユーザCDと作業日から、未処理のデータを取得する。
	 * </pre>
	 *
	 * @param workUserCd
	 * @param workDt
	 * @return 未処理のワークデータ
	 */
	public List<WWork> findByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setWorkDt_Equal(workDt);
		cb.query().setWorkFlg_Equal("0");

		cb.query().addOrderBy_WorkId_Asc();

		List<WWork> wWorkList = wWorkBhv.selectList(cb);

		return wWorkList;
	}

	/**
	 * <h2>
	 * ログに出力するためのメッセージコメントを取得する。
	 * </h2>
	 * @param messageCd メッセージCD
	 * @param head ヘッダ情報
	 * @return ログコメント
	 */
	public String getLogComment(String messageCd, AttendanceEntryHead head) {
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		String logMessage = messageLogic.getMessageNm(messageCd, head.centerCd, head.workUserCd);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End

		// [ONEsLOGI 労務管理][#6701]ログに日付も表示されるように修正 2019.09.13 tsuboi Start
		StringBuilder workDtTmBuilder = new StringBuilder(head.workDt);
		workDtTmBuilder.insert(4, "/");
		workDtTmBuilder.insert(7, "/");
		workDtTmBuilder.append(" ");
		workDtTmBuilder.append(head.workTm);
		String workDtTm = workDtTmBuilder.toString();

		String logComment = String.format("%s -> %s\n", workDtTm, logMessage);
		// [ONEsLOGI 労務管理][#6701]ログに日付も表示されるように修正 2019.09.13 tsuboi End

		return logComment;
	}

	/**
	 * <h2>
	 * 自センタで出勤ではない場合、他センタでは出勤しているか取得
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @return 条件にあてはまった情報の数
	 */
	public int getAttendanceCntAnotherCenter(AttendanceEntryDto inputDto, String entryStartDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		cb.query().setWorkUserCd_Equal(inputDto.data.head.workUserCd);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		cb.query().setEntryStartDt_Equal(entryStartDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End
		cb.query().setClockInFlg_Equal("1");
		cb.query().setCenterCd_NotEqual(inputDto.data.head.centerCd);

		int cnt = wWorkBhv.selectCount(cb);

		return cnt;
	}

	/**
	 * <h2>ユーザ認証マスタEntityを取得する。</h2>
	 *
	 * @param userCd ユーザCD
	 * @return ユーザ認証マスタ
	 */
	public BUserAuth getBUserAuth(String userCd) {

		BUserAuthCB cb = bUserAuthBhv.newMyConditionBean();

		cb.setupSelect_BUser();
		cb.query().queryBUser().setUserCd_Equal(userCd);

		BUserAuth result = bUserAuthBhv.selectEntity(cb);

		return result;
	}

	/**
	 * <h2>前日のシステム管理日付を取得</h2>
	 * <pre>
	 * 当日のシステム管理日付を受け取り、前日のシステム管理日付を計算
	 * </pre>
	 *
	 * @param inputDto 作業時間登録画面用DTO
	 * @return String 前日のシステム管理日付
	 * @throws ParseException
	 */
	public String beforeWorkDt(String workDt) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		//昨日のシステム管理日付を取得し設定
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(workDt.substring(0,4)));
		cal.set(Calendar.MONTH, Integer.parseInt(workDt.substring(4,6)) - 1);
		cal.set(Calendar.DATE, Integer.parseInt(workDt.substring(6)));
		cal.add(Calendar.DATE, -1);
		return dateFormat.format(cal.getTime());
	}

}
