@ECHO OFF

ECHO.
ECHO �C���^�[�l�b�g�ڑ�����ݒ肵�܂��B
ECHO.
ECHO �Ȃ��ȉ��̏�񂪌��ݐݒ肳��Ă��܂��B
ECHO.
ECHO �ݒ�\����...

CALL npm config list

ECHO.
ECHO �ݒ�ύX���K�v�ȏꍇ�A�ȉ��ē��ɏ]���ݒ肵�ĉ������B

ECHO.
ECHO �v���L�V�T�[�o�̎w��y��-^>192.168.1.2:8080�z
SET /P PROXY_HOST=-^>

ECHO.
ECHO �ݒ蒆...

CALL npm config set proxy http://%PROXY_HOST%
CALL npm config set https-proxy http://%PROXY_HOST%
CALL npm config set registry http://registry.npmjs.org/
CALL npm config set strict-ssl false

ECHO.
ECHO �ݒ肪�������܂����B
ECHO.
ECHO �ŐV�̐ݒ�͈ȉ��̂悤�ɂȂ��Ă��܂��B

ECHO.
ECHO �ݒ�\����...

CALL npm config list

ECHO.
ECHO �������������܂����B
PAUSE
