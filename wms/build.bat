@ECHO OFF

REM jar.exe�Ȃǂ�������Ȃ��ꍇ�A�ȉ���JDK�C���X�g�[���p�X���w��
REM ��jC:\Java\pleiades\java\8
SET SET_JDK_HOME=

REM �Œ�ʒu�̃��[�J��node_modules��ǂݍ��݂����ꍇ�Ɏw��
REM ��jC:\nodeWork\node_modules\WMS\Ver2.2\node_modules
SET SET_NODE_PATH=

REM Java�R���p�C�����̍ő僁�����T�C�Y
SET SET_JAVA_COMPILE_MAX_MEMORY_SIZE=1024m

REM �l���w�肵���ꍇ�A�f�o�b�O���͍쐬���Ȃ�
REM �i�G���[���̃X�^�b�N�g���[�X�ȂǂɃG���[�s���\������Ȃ��Ȃ�j
SET JAVA_COMPILE_DEBUG_INFO_NONE=

REM �쐬�����t�@�C����
SET MAKE_FILE_NAME=wms.war

REM �r���h���Ɏg�p����JAR�t�@�C�����w��
REM ��jecj.jar
SET BUILD_FILE_NAME=ecj.jar

REM �r���h���ɎQ�Ƃ���JAR�z�u�p�X���w��
REM ��j..\lib
SET LIB_FILE_PATH=WebContents\WEB-INF\lib

REM �r���h���ɎQ�Ƃ���JAR�t�@�C�����w��i�����w��j
REM ��j..\oneslogi-report\oneslogi-report.jar;..\oneslogi-dbflute\oneslogi-dbflute.jar
SET LIB_FILE_NAME=

SET SRC_FILE_PATH=src
SET RESOURCE_FILE_PATH=resources
SET BUILD_FILE_PATH=WebContents\WEB-INF\classes
SET DIST_FILE_PATH=dist

PUSHD "%~dp0"
SET WORK_PATH=%CD%
SET WORK_NAME=%~n0

SET LOG_OUT_NAME=%WORK_NAME%.log
SET LOG_ERR_NAME=%WORK_NAME%Error.log
SET MF_FILE_NAME=%WORK_NAME%.mf

IF DEFINED SET_JDK_HOME SET PATH=%SET_JDK_HOME%\bin;%PATH%

IF DEFINED SET_NODE_PATH (
  SET NODE_PATH=%SET_NODE_PATH%
  SET OPT_NODE_PATH=--setNodeModules=%SET_NODE_PATH%
)

IF EXIST "%MF_FILE_NAME%" (
  SET MF_FILE_FLG=m
) ELSE (
  SET MF_FILE_NAME=
)

ECHO.
ECHO �������ꊇ�r���h�c�[��������

ECHO.
ECHO �R���p�C�����s�pJDK�̃o�[�W�������`�F�b�N���܂��B
ECHO.

java > NUL 2>&1
IF "%ERRORLEVEL%"=="9009" (
  ECHO.
  ECHO java.exe��������܂���B
  ECHO �{�c�[���̎��s�ɂ�JDK���K�v�ł��B
  ECHO JDK���C���X�g�[�������o�b�`�t�@�C����SET_JDK_HOME���w�肵�ĉ������B
  PAUSE
  EXIT 1
)

jar > NUL 2>&1
IF "%ERRORLEVEL%"=="9009" (
  ECHO.
  ECHO jar.exe��������܂���B
  ECHO �{�c�[���̎��s�ɂ�JDK���K�v�ł��B
  ECHO JDK���C���X�g�[�������o�b�`�t�@�C����SET_JDK_HOME���w�肵�ĉ������B
  PAUSE
  EXIT 1
)

java -version
ECHO.

ECHO.
ECHO Node.js�̃o�[�W�������`�F�b�N���܂��B

ECHO.
ECHO Node.js�̃o�[�W�����`�F�b�N��...

SET NODE_VER=v6.10.0
FOR /F "usebackq delims=" %%i IN (`node -v`) DO SET NODE_CUR_VER=%%i
IF NOT "%NODE_CUR_VER%"=="%NODE_VER%" (
  ECHO.
  ECHO Node.js�̃o�[�W�������s���ł��B
  ECHO �ȉ��͌��݂̃o�[�W�����ł��B
  ECHO.
  ECHO %NODE_CUR_VER%
  ECHO.
  ECHO �ȉ��͐������o�[�W�����ł��B
  ECHO.
  ECHO %NODE_VER%
  ECHO.
  ECHO �������o�[�W�������C���X�g�[�����Anode_modules���C���X�g�[���������ĉ������B
  PAUSE
  EXIT 1
)

ECHO.
ECHO Node.js�̃o�[�W�����`�F�b�N���������܂����B

ECHO.
ECHO npm�̃o�[�W�������`�F�b�N���܂��B

ECHO.
ECHO npm�̃o�[�W�����`�F�b�N��...

SET NPM_VER=3.10.10
FOR /F "usebackq delims=" %%i IN (`npm -v`) DO SET NPM_CUR_VER=%%i
IF NOT "%NPM_CUR_VER%"=="%NPM_VER%" (
  ECHO.
  ECHO npm�̃o�[�W�������s���ł��B
  ECHO �ȉ��͌��݂̃o�[�W�����ł��B
  ECHO.
  ECHO %NPM_CUR_VER%
  ECHO.
  ECHO �ȉ��͐������o�[�W�����ł��B
  ECHO.
  ECHO %NPM_VER%
  ECHO.
  ECHO �������o�[�W�������C���X�g�[�����Anode_modules���C���X�g�[���������ĉ������B
  PAUSE
  EXIT 1
)

ECHO.
ECHO npm�̃o�[�W�����`�F�b�N���������܂����B

ECHO.
ECHO Java�̃R���p�C�����J�n���܂��B
ECHO.
ECHO �y���Ӂz�ȉ��t�H���_�̓R���p�C�����ʂ̏o�͐�Ƃ��āA
ECHO �@�@�@�@�S�Ẵt�@�C������x�폜����܂��B
ECHO "%CD%\%BUILD_FILE_PATH%"
IF DEFINED JAVA_COMPILE_DEBUG_INFO_NONE (
  ECHO.
  ECHO �y���Ӂz�R���p�C�����ʂɂ̓f�o�b�O��񂪊܂܂�܂���B
  ECHO �@�@�@�@�G���[���̃X�^�b�N�g���[�X�ɂ̓G���[�s���o�͂���Ȃ��Ȃ�܂��B
) ELSE (
  ECHO.
  ECHO �y���Ӂz�R���p�C�����ʂɂ̓f�o�b�O��񂪊܂܂�܂��B
  ECHO �@�@�@�@���̈׃t�@�C���T�C�Y�������傫���Ȃ�܂��B
)
ECHO.
PAUSE

TYPE NUL>%LOG_OUT_NAME%
TYPE NUL>%LOG_ERR_NAME%

ECHO.
ECHO Java�̃R���p�C����...
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

REM �R���p�C���p�ꎞ�t�@�C���쐬
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
  ECHO Java�̃R���p�C���ŃG���[���������܂����B
  PAUSE
  EXIT 1
)
DEL ecj_compile.dat > NUL

(ECHO .java) > exclude.txt
XCOPY %SRC_FILE_PATH% %BUILD_FILE_PATH% /EXCLUDE:exclude.txt /S /I /Y >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  DEL exclude.txt > NUL
  ECHO.
  ECHO Java�̃R���p�C����̃��\�[�X�n�t�@�C���̃R�s�[�ŃG���[���������܂����B
  PAUSE
  EXIT 1
)
XCOPY %RESOURCE_FILE_PATH% %BUILD_FILE_PATH% /EXCLUDE:exclude.txt /S /I /Y >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  DEL exclude.txt > NUL
  ECHO.
  ECHO Java�̃R���p�C����̃��\�[�X�n�t�@�C���̃R�s�[�ŃG���[���������܂����B
  PAUSE
  EXIT 1
)
DEL exclude.txt > NUL
ECHO.
ECHO Java�̃R���p�C�����������܂����B

ECHO.
ECHO Web���\�[�X�̍œK�����J�n���܂��B
ECHO.
ECHO Web���\�[�X�̍œK����...
cmd /c "grunt build %OPT_NODE_PATH%" >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  ECHO.
  ECHO Web���\�[�X�̍œK���ŃG���[���������܂����B
  PAUSE
  EXIT 1
)
ECHO.
ECHO Web���\�[�X�̍œK�����������܂����B

ECHO.
ECHO �z�z�t�@�C��[%MAKE_FILE_NAME%]���쐬���܂��B
ECHO.
ECHO �z�z�t�@�C���̍쐬��...

jar cvf%MF_FILE_FLG% %MAKE_FILE_NAME% %MF_FILE_NAME% -C %DIST_FILE_PATH%/ . >> %LOG_OUT_NAME% 2>> %LOG_ERR_NAME%
IF ERRORLEVEL 1 (
  ECHO.
  ECHO �z�z�t�@�C���̍쐬�ŃG���[���������܂����B
  PAUSE
  EXIT 1
)

ECHO.
ECHO �z�z�t�@�C���̍쐬���������܂����B

ECHO.
ECHO ��A�̏���������ɏI�����܂����B
PAUSE

POPD

