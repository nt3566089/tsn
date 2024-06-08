
★mysqldump_exp

指定された接続先のスキーマ（データベース）より、
テーブル単位にエクスポートを実行するツールです。

なお生成されるスクリプトファイルには、
Create文やTruncate文は含まれません。

ReplaceSchema後に一部データを移行する為のツールとなります。

対となるmysqldump_imp側で生成されたスクリプトを実行する前に、
Truncate文を実行するようになっています。

ファイル構成は以下のようになります。

・mysqldump_exp.dat　　　処理が実装されているシェルファイル
・mysqldump_exp.ign　　　エクスポート時に除外したいテーブルをリストで指定するファイル
・mysqldump_exp_xxx.sh 　mysqldump_expを起動する為のシェルファイル
・mysqldump.env　　　　　既定の接続先を指定するファイル
・mysqldump_exp_xxx.env　mysqldump_exp_xxx.sh単位で接続先を指定する際に準備するファイル
                         ※shファイルと同じ名前のenvファイルは優先される

※mysqldump_exp_xxx.shとmysqldump_exp_xxx.envは複数環境に対応する為に、
　コピーしxxxを変える事でその単位で管理する事が可能になっています。

※mysqldump_imp側でも対象テーブルを除外する事が可能な為、
　mysqldump_expでは除外せずに全テーブルをエクスポートする事を推奨します。


★mysqldump_imp

mysqldump_expで生成したスクリプトを、
フォルダ指定で実行するツールです。

テーブル単位のスクリプトを実行する前に、
ファイル名からTruncateを実行するようになっています。

ReplaceSchema後に一部データを移行する為のツールとなります。

移行対象外としたい基盤系マスタなどについては、
mysqldump_imp.ignに指定する事で移行対象外とできます。

ファイル構成は以下のようになります。

・mysqldump_imp.dat　　　処理が実装されているシェルファイル
・mysqldump_imp.ign　　　インポート時に除外したいテーブルをリストで指定するファイル
・mysqldump_imp_xxx.sh 　mysqldump_impを起動する為のシェルファイル
・mysqldump.env　　　　　既定の接続先を指定するファイル
・mysqldump_imp_xxx.env　mysqldump_imp_xxx.sh単位で接続先を指定する際に準備するファイル
                         ※shファイルと同じ名前のenvファイルは優先される

※mysqldump_imp_xxx.shとmysqldump_imp_xxx.envは複数環境に対応する為に、
　コピーしxxxを変える事でその単位で管理する事が可能になっています。

