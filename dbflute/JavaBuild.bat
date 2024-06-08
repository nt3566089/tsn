@ECHO OFF

REM jar.exeなどが見つからない場合、以下にJDKインストールパスを指定
REM 例）C:\Java\pleiades\java\8
SET SET_JDK_HOME=

REM Javaコンパイル時の最大メモリサイズ
SET SET_JAVA_COMPILE_MAX_MEMORY_SIZE=3000m

REM 値を指定した場合、デバッグ情報は作成しない
REM （エラー時のスタックトレースなどにエラー行が表示されなくなる）
SET JAVA_COMPILE_DEBUG_INFO_NONE=

REM 作成されるファイル名
SET MAKE_FILE_NAME=..\wms\WebContents\WEB-INF\lib\oneslogi-dbflute.jar

REM ビルド時に使用するJARファイルを指定
REM 例）ecj.jar
SET BUILD_FILE_NAME=..\wms\ecj.jar

REM ビルド時に参照するJAR配置パスを指定
REM 例）..\lib
SET LIB_FILE_PATH=..\wms\WebContents\WEB-INF\lib

REM ビルド時に参照するJARファイルを指定（複数指定可）
REM 例）..\oneslogi-report\oneslogi-report.jar;..\oneslogi-dbflute\oneslogi-dbflute.jar
SET LIB_FILE_NAME=

SET SRC_FILE_PATH=src
SET RESOURCE_FILE_PATH=resources
SET BUILD_FILE_PATH=bin
SET DIST_FILE_PATH=%BUILD_FILE_PATH%

PUSHD "%~dp0"
SET WORK_PATH=%CD%
SET WORK_NAME=%~n0

SET LOG_OUT_NAME=%WORK_NAME%.log
SET LOG_ERR_NAME=%WORK_NAME%Error.log
SET MF_FILE_NAME=%WORK_NAME%.mf

IF DEFINED SET_JDK_HOME SET PATH=%SET_JDK_HOME%\bin;%PATH%

IF EXIST "%MF_FILE_NAME%" (
  SET MF_FILE_FLG=m
) ELSE (
  SET MF_FILE_NAME=
)

ECHO.
ECHO ★★★Javaビルドツール★★★

ECHO.
ECHO コンパイル実行用JDKのバージョンをチェックします。
ECHO.

java > NUL 2>&1
IF "%ERRORLEVEL%"=="9009" (
  ECHO.
  ECHO java.exeが見つかりません。
  ECHO 本ツールの実行にはJDKが必要です。
  ECHO JDKをインストールし当バッチファイルのSET_JDK_HOMEを指定して下さい。
  PAUSE
  EXIT 1
)

jar > NUL 2>&1
IF "%ERRORLEVEL%"=="9009" (
  ECHO.
  ECHO jar.exeが見つかりません。
  ECHO 本ツールの実行にはJDKが必要です。
  ECHO JDKをインストールし当バッチファイルのSET_JDK_HOMEを指定して下さい。
  PAUSE
  EXIT 1
)

java -version
ECHO.

ECHO.
ECHO Javaのコンパイルを開始します。
ECHO.
ECHO 【注意】以下フォルダはコンパイル結果の出力先として、
ECHO 　　　　全てのファイルが一度削除されます。
ECHO "%CD%\%BUILD_FILE_PATH%"
IF DEFINED JAVA_COMPILE_DEBUG_INFO_NONE (
  ECHO.
  ECHO 【注意】コンパイル結果にはデバッグ情報が含まれません。
  ECHO 　　　　エラー時のスタックトレースにはエラー行が出力されなくなります。
) ELSE (
  ECHO.
  ECHO 【注意】コンパイル結果にはデバッグ情報が含まれます。
  ECHO 　　　　その為ファイルサイズが少し大きくなります。
)
ECHO.
PAUSE

TYPE NUL>%LOG_OUT_NAME%
TYPE NUL>%LOG_ERR_NAME%

ECHO.
ECHO Javaのコンパイル中...
IF EXIST "%BUILD_FILE_PATH%" (
  RD /S /Q "%BUILD_FILE_PATH%" > NUL
)
SET JAVA_COMPILE_MAX_MEMORY_SIZE=
IF DEFINED SET_JAVA_COMPILE_MAX_MEMORY_SIZE (
  SET JAVA_COMPILE_MAX_MEMORY_SIZE=-Xmx%SET_JAVA_COMPILE_MAX_MEMORY_SIZE%
)
SET JAVA_COMPILE_DEBUG_INFO=
IF DEFINED JAVA_COMPILE_DEBUG_INFO_NONE (
  SET JAVA_COMPILE_DEBUG_INFO=-g:none
) ELSE (
  SET JAVA_COMPILE_DEBUG_INFO=-g
)

REM コンパイル用一時ファイル作成
TYPE NUL>ecj_compile.dat
SET /P<NUL="src -encoding UTF-8 -8 -time %JAVA_COMPILE_DEBUG_INFO% -d %BUILD_FILE_PATH% -preserveAllLocals -proc:none -warn:-serial,unusedImport -cp ">>ecj_compile.dat
FOR /F "usebackq" %%i IN (`DIR "%LIB_FILE_PATH%" /B`) DO (
  SET /P<NUL="%LIB_FILE_PATH%\%%i;">>ecj_compile.dat
)

IF DEFINED LIB_FILE_NAME SET /P<NUL="%LIB_FILE_NAME%">>ecj_compile.dat

java %JAVA_COMPILE_MAX_MEMORY_SIZE% -jar "%BUILD_FILE_NAME%" @"ecj_compile.dat" >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF NOT "%ERRORLEVEL%"=="0" (
  DEL ecj_compile.dat > NUL
  ECHO.
  ECHO Javaのコンパイルでエラーが発生しました。
  PAUSE
  EXIT 1
)
DEL ecj_compile.dat > NUL

(ECHO .java) > exclude.txt
XCOPY %SRC_FILE_PATH% %BUILD_FILE_PATH% /EXCLUDE:exclude.txt /S /I /Y >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  DEL exclude.txt > NUL
  ECHO.
  ECHO Javaのコンパイル後のリソース系ファイルのコピーでエラーが発生しました。
  PAUSE
  EXIT 1
)
XCOPY %RESOURCE_FILE_PATH% %BUILD_FILE_PATH% /EXCLUDE:exclude.txt /S /I /Y >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  DEL exclude.txt > NUL
  ECHO.
  ECHO Javaのコンパイル後のリソース系ファイルのコピーでエラーが発生しました。
  PAUSE
  EXIT 1
)
DEL exclude.txt > NUL
ECHO.
ECHO Javaのコンパイルが完了しました。

ECHO.
ECHO 配布ファイル[%MAKE_FILE_NAME%]を作成します。
ECHO.
ECHO 配布ファイルの作成中...

jar cvf%MF_FILE_FLG% %MAKE_FILE_NAME% %MF_FILE_NAME% -C %DIST_FILE_PATH%/ . >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  ECHO.
  ECHO 配布ファイルの作成でエラーが発生しました。
  PAUSE
  EXIT 1
)

ECHO.
ECHO 配布ファイルの作成が完了しました。

ECHO.
ECHO 一連の処理が正常に終了しました。
PAUSE

POPD

