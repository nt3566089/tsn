@ECHO OFF
ECHO.
ECHO データ出力(全て)
ECHO.
ECHO ***** DataManageToolでエラー発生時や、DataManageToolより先にbatを終了するとExcelプロセスが残ります。
ECHO ***** 必要に応じてタスクマネージャーからプロセス終了を実施して下さい。

cscript //nologo VBAExec.vbs "\.." "DataManageTool.xlam" "DataOutput.CreateAllTsv" "全て" "1"
rem cscript VBARun.vbs "\.." "DataManageTool.xlam" "DataOutput.CreateTsv" "01-b_dict"
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


