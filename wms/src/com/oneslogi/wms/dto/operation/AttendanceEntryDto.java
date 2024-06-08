package com.oneslogi.wms.dto.operation;

import java.io.Serializable;

import com.oneslogi.base.dto.BaseDto;

public class AttendanceEntryDto extends BaseDto {

	public static class AttendanceEntryHead implements Serializable {
		// センタCD
		public String centerCd = null;
		// 荷主ID
		public Long clientId = null;
		// システム日付
		public String systemDt = null;
		// 作業者CD
		public String workUserCd = null;
		// 作業日
		public String workDt = null;
		// 作業時間
		public String workTm = null;
		// パスワード
		public String passWord = null;
		//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka Start
		// パスワード入力有無
		public String passwordFlg = null;
		//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka End
	}

	// 出勤情報
	public static class Attendance implements Serializable {
		// 打刻開始日付
		public String entryStartDt = null;
		// 打刻開始時刻
		public String entryStartTm = null;
	}

	// 退勤情報
	public static class Leaving implements Serializable {
		// 打刻終了日付
		public String entryEndDt = null;
		// 打刻終了時刻
		public String entryEndTm = null;
	}

	// 休憩開始情報
	public static class StartRest implements Serializable {
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		// 休憩開始日
		public String breakStartDt = null;
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End
		// 休憩開始時刻
		public String breakStartTm = null;
	}

	// 休憩終了情報
	public static class EndRest implements Serializable {
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		// 休憩終了日
		public String breakEndDt = null;
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End
		// 休憩終了時刻
		public String breakEndTm = null;
	}

	public static class Log implements Serializable {
		// ログコメント
		public String logComment = null;
	}

	public static class AttendanceEntryData implements Serializable {

		public AttendanceEntryHead head = new AttendanceEntryHead();

		public Attendance attendance = new Attendance();

		public Leaving leaving = new Leaving();

		public StartRest startRest = new StartRest();

		public EndRest endRest = new EndRest();

		public Log log = new Log();
	}

	public AttendanceEntryData data = new AttendanceEntryData();

}
