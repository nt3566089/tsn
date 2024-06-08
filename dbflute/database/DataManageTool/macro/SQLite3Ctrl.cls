VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "Sqlite3Ctrl"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Private Const BULK_COUNT As Long = 100
Private Const COLUMN_COUNT As Long = 2
Private Const COLUMN_COUNT_ALL As Long = 10

Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"

Private Const DATA_SHEET_NAME As String = "Data"

'動作検証用テストコード
'
'当実装サンプルを元に、
'汎用的なメンバ変数・メソッド群を作成する事
'
'※実装方針はAppCtrlなどのクラスモジュールを参考にする事
'  例えばxxxHandleなどを当クラス上で管理する機構が必要
'  呼び出し元に持つ必要が無い実装は当クラス側で吸収、
'  かつ汎用的に利用できるよう今回の仕様に対する固有機能などは、
'  当クラスに実装しないように注意する事
Public Sub Test()

    Dim i As Integer
    Dim j As Integer

    Dim ret As Long
    Dim dbFile As String
    Dim value As Long

    #If Win64 Then
        'SQLiteDLL読み込み
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X64_FOLDER_NAME)
        'コネクションハンドラ定義
        Dim connHandle As LongPtr
        'ステートメントハンドラ定義
        Dim stmtHandle As LongPtr
    #Else
        'SQLiteDLL読み込み
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X86_FOLDER_NAME)
        'コネクションハンドラ定義
        Dim connHandle As Long
        'ステートメントハンドラ定義
        Dim stmtHandle As Long
    #End If

    If ret <> SQLITE_INIT_OK Then
        Exit Sub
    End If

    'ファイル名取得
    dbFile = DataManageTool.dbPath & "\" & "test.db3"

    'DBファイル削除
    If Dir(dbFile) <> "" Then
        Kill dbFile
    End If

    'DBファイルOpen
    ret = SQLite3Open(dbFile, connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "PRAGMA synchronous = OFF", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "PRAGMA journal_mode = PERSIST", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "CREATE TABLE KEY_VALUE (KEY TEXT PRIMARY KEY, VALUE INTEGER)", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "BEGIN", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    Dim bindSql As String
    bindSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "

    For i = 1 To BULK_COUNT
        If i <> 1 Then
            bindSql = bindSql & ","
        End If
        bindSql = bindSql & "(?,?)"
    Next

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    Dim id As Long
    id = 0

    '余りを除いたBULK_COUNT分でのサンプル実装（この場合は100回ループ）
    For i = 1 To 10000 \ BULK_COUNT

        For j = 1 To BULK_COUNT * COLUMN_COUNT Step COLUMN_COUNT

            id = id + 1

            ret = SQLite3BindText(stmtHandle, j, "str" & CStr(id))
            If ret <> SQLITE_OK Then
                Exit Sub
            End If

            ret = SQLite3BindInt32(stmtHandle, j + 1, id)
            If ret <> SQLITE_OK Then
                Exit Sub
            End If

        Next

        'SQL実行
        ret = SQLite3Step(stmtHandle)
        If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
            Exit Sub
        End If

        'SQL再利用
        ret = SQLite3Reset(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        'バインド再利用
        ret = SQLite3ClearBindings(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

    Next

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    bindSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "

    'BULK_COUNTに満たない残処理分のサンプル実装（この場合は残りが10件）
    For i = 1 To 10
        If i <> 1 Then
            bindSql = bindSql & ","
        End If
        bindSql = bindSql & "(?,?)"
    Next

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'BULK_COUNTに満たない残処理分のサンプル実装（この場合は残りが10件）
    For j = 1 To 10 * COLUMN_COUNT Step COLUMN_COUNT

        id = id + 1

        ret = SQLite3BindText(stmtHandle, j, "str" & CStr(id))
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        ret = SQLite3BindInt32(stmtHandle, j + 1, id)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

    Next

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "COMMIT", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "SELECT VALUE FROM KEY_VALUE WHERE KEY = ?", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    '追加した10000件をPKで1行ずつ10000回抽出するサンプル実装
    For i = 1 To 10000

        'SQLバインド
        ret = SQLite3BindText(stmtHandle, 1, "str" & CStr(i))
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        'SQL実行
        ret = SQLite3Step(stmtHandle)

        'フェッチ
        If ret = SQLITE_ROW Then
            value = SQLite3ColumnInt32(stmtHandle, 0)
        End If

        ret = SQLite3Step(stmtHandle)
        If ret <> SQLITE_DONE Then
            Exit Sub
        End If

        'SQL再利用
        ret = SQLite3Reset(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        'バインド再利用
        ret = SQLite3ClearBindings(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

    Next

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'DBファイルClose
    ret = SQLite3Close(connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub


Public Sub openDb(ByVal target As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr, Optional ByVal delFlg As Boolean = False)
    On Error Resume Next
    Dim dbFile As String
    
    If InStr(target, "-") > 0 Then
        dbFile = Split(target, "-")(1)
    Else
        dbFile = target
    End If
    dbFile = DataManageTool.dbPath & "\" & dbFile & ".db3"
    If delFlg Then
        'DBファイル削除
        If Dir(dbFile) <> "" Then
            Kill dbFile
        End If
    End If
    'DBファイルOpen
    ret = SQLite3Open(dbFile, connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "PRAGMA synchronous = OFF", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "PRAGMA journal_mode = PERSIST", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub

Public Sub closeDb(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'DBファイルClose
    ret = SQLite3Close(connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
    
End Sub

Public Sub createTable(ByVal bindSql As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub

Public Function selectTable(ByVal bindSql As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr) As Long

    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)

    'フェッチ
    If ret = SQLITE_ROW Then
       selectTable = SQLite3ColumnInt32(stmtHandle, 0)
    End If
    
    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If
    
End Function

Public Sub insertTable(ByVal bindSql As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
    
    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        ret = SQLite3Finalize(stmtHandle)
        
        'DBファイルClose
        ret = SQLite3Close(connHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If
        'ADD BY YC_LI AT 2016/08/22 [S]
        ret = 19
        'ADD BY YC_LI AT 2016/08/22 [E]
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub


Public Sub updateTable()

End Sub

Public Sub deleteTable()

End Sub

Public Sub doBegin(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "BEGIN", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
End Sub

Public Sub doCommit(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "COMMIT", stmtHandle)
    If ret <> SQLITE_OK Then
        ret = SQLite3Finalize(stmtHandle)
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
End Sub

Public Sub doRollback(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "ROLLBACK", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
End Sub
'ADD BY YC_LI AT 2016/08/22 [S]

Public Function getValueBySql(ByVal target As String, ByVal sql As String) As String
 Dim ctrl As New Sqlite3Ctrl
 Dim ret As Long
 #If Win64 Then
        'SQLiteDLL読み込み
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X64_FOLDER_NAME)
        'コネクションハンドラ定義
        Dim connHandle As LongPtr
        'ステートメントハンドラ定義
        Dim stmtHandle As LongPtr
    #Else
        'SQLiteDLL読み込み
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X86_FOLDER_NAME)
        'コネクションハンドラ定義
        Dim connHandle2 As Long
        'ステートメントハンドラ定義
        Dim stmtHandle2 As Long
  #End If
  If ret <> SQLITE_INIT_OK Then
     Exit Function
  End If
  Call ctrl.openDb(target, ret, connHandle2, stmtHandle2, False)
  If ret <> SQLITE_OK Then
     Exit Function
  End If
    'beginTrans
  Call ctrl.doBegin(ret, connHandle2, stmtHandle2)
  getValueBySql = ""
  getValueBySql = ctrl.selectTable(sql, ret, connHandle2, stmtHandle2)
  Call ctrl.closeDb(ret, connHandle2, stmtHandle2)
End Function
'ADD BY YC_LI AT 2016/08/22 [E]
