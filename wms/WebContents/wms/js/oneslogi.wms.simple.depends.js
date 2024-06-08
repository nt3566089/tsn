/**
 * インジェクトする依存モジュールの設定
 * WMS機能、もしくはWMS機能への依存モジュールについては、下記のとおり「dependsModules.push」メソッドにモジュール名を渡してください。
 * ここで指定されたモジュール＋基盤モジュールがinjectされた状態でoneslogiWebMainモジュールのインスタンスが生成されます。
 * なお、このファイルをcommonに置かない理由ですが、common直下においてしまうとwar作成時に一つのファイルにまとめられてしまいます。
 * また、このインジェクト対象モジュールの定義はoneslogi.wms.jsの読み込みより前に実行される必要がある関係で、別ファイルかつ別ディレクトリにする必要があります。
 * ファイル名やパスはincludeDepends.jspで変更できます。
 * 2017/03/01 comment by inoue
 *
 */
dependsModules.push('oneslogiWms.AttendanceEntry');
dependsModules.push('oneslogiWms.ModalError');
