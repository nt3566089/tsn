@ECHO OFF
ECHO.
ECHO Dfprop����
ECHO.
ECHO ***** DataManageTool�ŃG���[��������ADataManageTool�����bat���I�������Excel�v���Z�X���c��܂��B
ECHO ***** �K�v�ɉ����ă^�X�N�}�l�[�W���[����v���Z�X�I�������{���ĉ������B

cscript //nologo VBAExec.vbs "\.." "DataManageTool.xlam" "DataOutput.CreateDBFlute" "Dfprop����" "1"
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

