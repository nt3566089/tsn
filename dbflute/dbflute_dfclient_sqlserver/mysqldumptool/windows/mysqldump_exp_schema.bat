@SET MAIN_NM=mysqldump_exp
@IF "%~n0.bat"=="%MAIN_NM%.bat" (@ECHO ���s���o�b�`�̃t�@�C�����̂�[%MAIN_NM%.bat]�͎w��ł��܂���B & @PAUSE & @EXIT)
@PUSHD "%~dp0"
@COPY %MAIN_NM%.dat %MAIN_NM%.bat>nul
@CALL %MAIN_NM%.bat "%~n0" || (@PAUSE & @EXIT)
@DEL %MAIN_NM%.bat>nul
@POPD
@ECHO.
@ECHO ����������ɏI�����܂����B
@PAUSE
