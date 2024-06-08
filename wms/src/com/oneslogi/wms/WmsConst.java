package com.oneslogi.wms;

public class WmsConst {

	/**
	 * ステータスコード定義
	 */
	public static class StatusCode {
		/**
		 * 正常終了
		 */
		public static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		public static final int CONFIRMATION = 1;
		/**
		 * 日次実行中エラー
		 */
		public static final int DAILY_CHECK_ERROR = 101;
		/**
		 * 日次実行忘れ警告
		 */
		public static final int SYSTEM_DT_WARN = 102;
		// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu Start
		/**
		 * システム管理日付不一致エラー
		 */
		public static final int SYSTEM_DT_CHECK_ERROR = 103;
		// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu End
	}

	public static final String ONESLOGI_WMS_CLIENT_ID_KEY_NAME = "ONEsLOGI_WMS_ClientId";

	public static final String ONESLOGI_WMS_CLIENT_CD_KEY_NAME = "ONEsLOGI_WMS_ClientCd";

	public static final String ONESLOGI_WMS_CLIENT_NM_KEY_NAME = "ONEsLOGI_WMS_ClientNm";

	public static final String ONESLOGI_WMS_USER_CLIENT_ID_KEY_NAME = "ONEsLOGI_WMS_UserClientId";

	// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu Start
	public static final String ONESLOGI_WMS_SYSTEM_DT_KEY_NAME = "ONEsLOGI_WMS_SystemDt";
	// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu End

	public static final String ONESLOGI_WMS_CENTER_ID_KEY_NAME = "ONEsLOGI_WMS_CenterId";

	public static final String ONESLOGI_WMS_CENTER_CD_KEY_NAME = "ONEsLOGI_WMS_CenterCd";

	public static final String ONESLOGI_WMS_CENTER_NM_KEY_NAME = "ONEsLOGI_WMS_CenterNm";

	public static final String ONESLOGI_WMS_USER_CENTER_ID_KEY_NAME = "ONEsLOGI_WMS_UserCenterId";

	public static final String PRINT_CONDITION_ALL = "2";
}
