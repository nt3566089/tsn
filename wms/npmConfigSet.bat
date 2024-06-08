@ECHO OFF

ECHO.
ECHO インターネット接続情報を設定します。
ECHO.
ECHO なお以下の情報が現在設定されています。
ECHO.
ECHO 設定表示中...

CALL npm config list

ECHO.
ECHO 設定変更が必要な場合、以下案内に従い設定して下さい。

ECHO.
ECHO プロキシサーバの指定【例-^>192.168.1.2:8080】
SET /P PROXY_HOST=-^>

ECHO.
ECHO 設定中...

CALL npm config set proxy http://%PROXY_HOST%
CALL npm config set https-proxy http://%PROXY_HOST%
CALL npm config set registry http://registry.npmjs.org/
CALL npm config set strict-ssl false

ECHO.
ECHO 設定が完了しました。
ECHO.
ECHO 最新の設定は以下のようになっています。

ECHO.
ECHO 設定表示中...

CALL npm config list

ECHO.
ECHO 処理が完了しました。
PAUSE
