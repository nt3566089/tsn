@ECHO OFF
ECHO.
ECHO Dfprop生成
ECHO.
ECHO ***** DataManageToolでエラー発生時や、DataManageToolより先にbatを終了するとExcelプロセスが残ります。
ECHO ***** 必要に応じてタスクマネージャーからプロセス終了を実施して下さい。

cscript //nologo VBAExec.vbs "\.." "DataManageTool.xlam" "DataOutput.CreateDBFlute" "Dfprop生成" "1"
if %ERRORLEVEL% neq 0 (
  ECHO.
  ECHO 異常終了しました。
  PAUSE
  GOTO :EOF
)

ECHO.
ECHO 処理が終了しました。
ECHO.

if "%1" == "" (
  PAUSE
)

