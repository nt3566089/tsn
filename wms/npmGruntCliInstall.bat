@ECHO OFF

ECHO.
ECHO npm�ɂ��grunt-cli�̃C���X�g�[�����J�n���܂��B
ECHO ���Ǘ��Ҍ����ɂ����s���K�v�ł�
ECHO.
ECHO ���s�ɂ̓C���^�[�l�b�g�ւ̐ڑ����K�v�ƂȂ�ׁA
ECHO �ݒ肪�����{�A�܂��͐ݒ���e���m�F�������ꍇ�Ȃǂ́A
ECHO [npmConfigSet.bat]�����s���ĉ������B
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
ECHO �L���b�V�����폜���܂��B
PAUSE

ECHO.
ECHO �L���b�V���폜��...

DIR "node_modules" /AD > NUL 2>&1
IF "%ERRORLEVEL%"=="0" RD /S /Q "node_modules"

CALL npm cache clean

ECHO.
ECHO �L���b�V�����폜����܂����B
ECHO �ȉ��ɃL���b�V������\�����܂��B
ECHO.

CALL npm cache ls

ECHO.
ECHO �C���X�g�[�����J�n���܂��B
PAUSE

ECHO.
ECHO �C���X�g�[����...

ECHO.
ECHO grunt-cli���O���[�o���C���X�g�[����...

CALL npm install -g grunt-cli@v1.3.2
IF ERRORLEVEL 1 (
  ECHO.
  ECHO �G���[���������܂����B
  ECHO �R���\�[���̏o�͓��e���m�F���ĉ������B
  PAUSE
  EXIT 1
)

ECHO.
ECHO �C���X�g�[�����������܂����B
PAUSE
