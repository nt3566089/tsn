
/**
 * デフォルト表示する画面のURL
 */
var commonRedirectUrl = "/base/menu/MainMenu";

/**
 * 帳票プレビュー準備中に表示する画面のURL
 */
var commonPreviewUrl = "Preview.html";

/**
 * 初期表示の際に作成する行数を定義
 * プログラム側では以下設定値を読み取る、
 * getInitRowNumメソッドをコールし行を生成する事
 */
var commonInitRowNum = {
		common: 20
};

/**
 * グリッドの高さ調整要否を設定するフラグ
 */
var gridAdjustFlg = true;

/**
 * リクエストデータ圧縮要否を設定するフラグ
 */
var requestDataCompressFlg = false;

/**
 * リクエストデータ圧縮のデバッグ情報出力要否を設定するフラグ
 */
var requestDataCompressDebugFlg = false;

// [#2225] parametar.jsにページサイズ定義を移動 2017.08.04 kawana Start

/**
 * 明細(グリッド)の表示件数リスト
 */
var gridPageSizes = [30, 50, 100];
/**
 * 明細(グリッド)の表示件数の初期値
 */
var gridPageSize = 50;

/**
 * 大きい明細(グリッド)の表示件数リスト
 */
var gridLargePageSizes = [30, 50, 100, 300, 500];
/**
 * 大きい明細(グリッド)の表示件数の初期値
 */
var gridLargePageSize = 100;

/**
 * SD一覧系画面で一度に読込む件数
 */
var sdListLoadSize = 20;

//[#2225] parametar.jsにページサイズ定義を移動 2017.08.04 kawana End
// [#3487] 拡張アコーディオンの表示制御 2018.01.29 kawana Start
/**
 * 拡張アコーディオンの表示フラグ (true:表示、false:非表示)
 */
var showOwdAccordion = false;
//[#3487] 拡張アコーディオンの表示制御 2018.01.29 kawana End
//[#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
/**
 * サブテキストの編集モード(true:編集可、false:編集不可)
 * デフォルト設定:(true:編集可)
 */
var multiTextEditableMode = true;
//[#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End

/**
 * 帳票印刷時にプレビューを強制する機能（暫定版）
 */
var reportForcePreview = false;

/**
 * Grid一覧（編集なし）の高さ
 */
var gridViewRowHeight = 30;
/**
 * Grid一覧（編集あり）の高さ
 */
var gridEntryRowHeight = 60;

/**
 * Grid一覧の数値列小数部の拡張表示（小数桁数に応じた0埋め表示制御）
 */
var gridNumColExtView = false;

