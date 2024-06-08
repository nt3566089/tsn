#!/bin/sh

MAIN_NM="mysqldump_imp"

if [ "`basename $0`" = "$MAIN_NM.sh" ]; then
  echo
  echo "実行元バッチのファイル名称に[$MAIN_NM.sh]は指定できません。"
  echo "Enterキーを押してください。"
  read Wait
  exit
fi

ARG0="$0"

while [ -h "$ARG0" ]; do
  ls=`ls -ld "$ARG0"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    ARG0="$link"
  else
    ARG0="`dirname $ARG0`/$link"
  fi
done

DIRNAME="`dirname $ARG0`"
PROGRAM="`basename $ARG0`"

export MAIN_NM
export ARG0
export DIRNAME
export PROGRAM

pushd "$DIRNAME">/dev/null

cp $MAIN_NM.dat $MAIN_NM.sh>/dev/null
chmod 755 $MAIN_NM.sh

sh $MAIN_NM.sh "`basename $0 .sh`"
if [ ! $? -eq 0 ]; then
  exit
fi

rm $MAIN_NM.sh>/dev/null

popd>/dev/null

echo
echo "処理が正常に終了しました。"
echo "Enterキーを押してください。"
read Wait

