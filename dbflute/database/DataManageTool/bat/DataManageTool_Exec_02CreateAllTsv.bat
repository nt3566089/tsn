@ECHO OFF
ECHO.
ECHO �f�[�^�o��(�S��)
ECHO.
ECHO ***** DataManageTool�ŃG���[��������ADataManageTool�����bat���I�������Excel�v���Z�X���c��܂��B
ECHO ***** �K�v�ɉ����ă^�X�N�}�l�[�W���[����v���Z�X�I�������{���ĉ������B

cscript //nologo VBAExec.vbs "\.." "DataManageTool.xlam" "DataOutput.CreateAllTsv" "�S��" "1"
rem cscript VBARun.vbs "\.." "DataManageTool.xlam" "DataOutput.CreateTsv" "01-b_dict"
if %ERRORLEVEL% neq 0 (
  ECHO.
  ECHO �ُ�I�����܂����B
  PAUSE
  GOTO :EOF
)

ECHO.
ECHO �������I�����܂����B
ECHO.

if "%1" == "" (
  PAUSE
)


