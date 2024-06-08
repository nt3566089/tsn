@ECHO OFF
call DataManageTool_Exec_01CreateAllDb.bat "1"
if %ERRORLEVEL% neq 0 (
  GOTO :EOF
)
call DataManageTool_Exec_02CreateAllTsv.bat "1"
if %ERRORLEVEL% neq 0 (
  GOTO :EOF
)
call DataManageTool_Exec_03CreateDBFlute.bat "1"
if %ERRORLEVEL% neq 0 (
  GOTO :EOF
)
call DataManageTool_Exec_04CreateConstTxt.bat "1"
if %ERRORLEVEL% neq 0 (
  GOTO :EOF
)
PAUSE