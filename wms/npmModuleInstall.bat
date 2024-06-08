@ECHO OFF

ECHO.
ECHO npmによるモジュール群のインストールを開始します。
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
ECHO インストールを開始します。
PAUSE

ECHO.
ECHO インストール中...

ECHO.
ECHO 各種モジュールをローカルインストール中...

CALL npm install
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
