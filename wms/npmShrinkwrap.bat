@ECHO OFF

ECHO.
ECHO ���W���[���_�E�����[�h���̃o�[�W�������Œ艻����A
ECHO [npm-shrinkwrap.json]�t�@�C�����쐬���܂��B
ECHO.
ECHO ���̏����ł͌��݃_�E�����[�h����Ă���
ECHO �e�탂�W���[���̃o�[�W�������擾���A
ECHO [npm-shrinkwrap.json]�t�@�C���ɕۑ������鎖�ŁA
ECHO ���񂩂�̃��W���[���_�E�����[�h�ł��A
ECHO �����o�[�W�����̃��W���[�����_�E�����[�h�����悤�ɂ��܂��B
ECHO ���e���Ń_�E�����[�h���̍ŐV���擾���Ȃ��悤�ɂ���
ECHO.
PAUSE

ECHO.
ECHO �Œ艻�t�@�C���쐬��...

IF EXIST "npm-shrinkwrap.json" DEL "npm-shrinkwrap.json"
CALL npm shrinkwrap --dev

ECHO.
ECHO �������������܂����B
PAUSE
