@ECHO OFF

ECHO.
ECHO npmによるgrunt-cliのインストールを開始します。
ECHO ※管理者権限による実行が必要です
ECHO.
ECHO 実行にはインターネットへの接続が必要となる為、
ECHO 設定が未実施、または設定内容を確認したい場合などは、
ECHO [npmConfigSet.bat]を実行して下さい。
ECHO.

ECHO.
ECHO Node.jsのバージョンをチェックします。

ECHO.
ECHO Node.jsのバージョンチェック中...

SET NODE_VER=v6.10.0
FOR /F "usebackq delims=" %%i IN (`node -v`) DO SET NODE_CUR_VER=%%i
IF NOT "%NODE_CUR_VER%"=="%NODE_VER%" (
  ECHO.
  ECHO Node.jsのバージョンが不正です。
  ECHO 以下は現在のバージョンです。
  ECHO.
  ECHO %NODE_CUR_VER%
  ECHO.
  ECHO 以下は正しいバージョンです。
  ECHO.
  ECHO %NODE_VER%
  ECHO.
  ECHO 正しいバージョンをインストールし、node_modulesをインストールし直して下さい。
  PAUSE
  EXIT 1
)

ECHO.
ECHO Node.jsのバージョンチェックが完了しました。

ECHO.
ECHO npmのバージョンをチェックします。

ECHO.
ECHO npmのバージョンチェック中...


SET NPM_VER=3.10.10
FOR /F "usebackq delims=" %%i IN (`npm -v`) DO SET NPM_CUR_VER=%%i
IF NOT "%NPM_CUR_VER%"=="%NPM_VER%" (
  ECHO.
  ECHO npmのバージョンが不正です。
  ECHO 以下は現在のバージョンです。
  ECHO.
  ECHO %NPM_CUR_VER%
  ECHO.
  ECHO 以下は正しいバージョンです。
  ECHO.
  ECHO %NPM_VER%
  ECHO.
  ECHO 正しいバージョンをインストールし、node_modulesをインストールし直して下さい。
  PAUSE
  EXIT 1
)

ECHO.
ECHO npmのバージョンチェックが完了しました。

ECHO.
ECHO キャッシュを削除します。
PAUSE

ECHO.
ECHO キャッシュ削除中...

DIR "node_modules" /AD > NUL 2>&1
IF "%ERRORLEVEL%"=="0" RD /S /Q "node_modules"

CALL npm cache clean

ECHO.
ECHO キャッシュが削除されました。
ECHO 以下にキャッシュ情報を表示します。
ECHO.

CALL npm cache ls

ECHO.
ECHO インストールを開始します。
PAUSE

ECHO.
ECHO インストール中...

ECHO.
ECHO grunt-cliをグローバルインストール中...

CALL npm install -g grunt-cli@v1.3.2
IF ERRORLEVEL 1 (
  ECHO.
  ECHO エラーが発生しました。
  ECHO コンソールの出力内容を確認して下さい。
  PAUSE
  EXIT 1
)

ECHO.
ECHO インストールが完了しました。
PAUSE
