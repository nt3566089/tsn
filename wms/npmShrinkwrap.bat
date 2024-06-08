@ECHO OFF

ECHO.
ECHO モジュールダウンロード時のバージョンを固定化する、
ECHO [npm-shrinkwrap.json]ファイルを作成します。
ECHO.
ECHO この処理では現在ダウンロードされている
ECHO 各種モジュールのバージョンを取得し、
ECHO [npm-shrinkwrap.json]ファイルに保存させる事で、
ECHO 次回からのモジュールダウンロードでも、
ECHO 同じバージョンのモジュールがダウンロードされるようにします。
ECHO ※各環境でダウンロード時の最新を取得しないようにする
ECHO.
PAUSE

ECHO.
ECHO 固定化ファイル作成中...

IF EXIST "npm-shrinkwrap.json" DEL "npm-shrinkwrap.json"
CALL npm shrinkwrap --dev

ECHO.
ECHO 処理が完了しました。
PAUSE
