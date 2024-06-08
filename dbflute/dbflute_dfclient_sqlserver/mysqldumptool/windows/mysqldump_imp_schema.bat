@SET MAIN_NM=mysqldump_imp
@IF "%~n0.bat"=="%MAIN_NM%.bat" (@ECHO 実行元バッチのファイル名称に[%MAIN_NM%.bat]は指定できません。 & @PAUSE & @EXIT)
@PUSHD "%~dp0"
@COPY %MAIN_NM%.dat %MAIN_NM%.bat>nul
@CALL %MAIN_NM%.bat "%~n0" "%~1" || (@PAUSE & @EXIT)
@DEL %MAIN_NM%.bat>nul
@POPD
@ECHO.
@ECHO 処理が正常に終了しました。
@PAUSE
