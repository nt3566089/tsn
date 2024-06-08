Attribute VB_Name = "UniqueIdManage"
Option Explicit

Private Const COLUMN_COUNT As Long = 2

Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"

'ADD BY YC_LI AT 2016/08/26 [S]
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'Public Sub createAllDb(ByVal name As String)
Public Sub createAllDb(ByVal name As String, Optional ByVal isSuppressNormalEndMsgBox As String = "0")
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]
   
    Dim errFlag As Boolean
    Dim title As Variant
    Dim list As Collection
    Set list = Common.getFileList(DataManageTool.configPath & "\" & DataManageTool.DB_FILE_PATH)
    For Each title In list
        errFlag = False
        Call UniqueIdManage.createDb(title, errFlag, True)
        If errFlag = True Then
        Exit For
        End If
    Next
    If errFlag = False Then
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
       'MsgBox "DB新規作成が正常終了しました。"
       If isSuppressNormalEndMsgBox = "0" Then
       MsgBox "DB新規作成が正常終了しました。"
       End If
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]
    End If
End Sub
'ADD BY YC_LI AT 2016/08/26 [E]

'指定されたデータのDBファイルを新規（上書き）モードで作成
Public Sub createDb(ByVal target As String, Optional ByRef errFlag As Boolean = False, Optional ByVal isAllFlg As Boolean = False)

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    Dim ctrl As New Sqlite3Ctrl
    Dim ret As Long
    Dim dbFile As String
    Dim dbFileSu As Long
    Dim config As Dictionary
    Set config = Common.GetConfig(DataManageTool.configPath & "\" & DataManageTool.DB_FILE_PATH, target)
    If config Is Nothing Then
        errFlag = True
        If isAllFlg = True Then
           MsgBox (target & vbCrLf & "DB作成の設定ファイルがありません。")
        Else
           MsgBox ("DB作成の設定ファイルがありません。")
        End If
        GoTo FinallyHandler
        Exit Sub
    End If
    If config.count = 0 Then
        errFlag = True
        If isAllFlg = True Then
           MsgBox (target & vbCrLf & "DB作成の設定ファイルがありません。")
        Else
           MsgBox ("DB作成の設定ファイルがありません。")
        End If
        GoTo FinallyHandler
        Exit Sub
    End If
    
    'メイン処理
    Dim tsvFolder As String
    'ADD [#7195] マニュアル作成する為に追加、入力フォルダ名がカンマで区切られるとマニュアル入力対象 2020.03.03 TANAKA [S]
    Dim inputFolder As Variant
    inputFolder = Split(config(CONFIG_DATA_INPUT_FOLDER), ",")
    
    tsvFolder = DataManageTool.TsvPath & "\" & inputFolder(0)
    If UBound(inputFolder) = 1 Then
        Dim manualTsvFolder As String
        manualTsvFolder = DataManageTool.TsvPath & "\" & DataManageTool.MANUAL_TSV_FILE_PATH & "\" & inputFolder(0)
    End If
    'ADD [#7195] マニュアル作成する為に追加、入力フォルダ名がカンマで区切られるとマニュアル入力対象 2020.03.03 TANAKA [E]
    
    Dim list, subList As Collection
    Dim folders, subFolders As Variant
    Dim files As Variant
    Dim isOpen As Boolean
    Dim maxVal As Long
    maxVal = 0
    dbFileSu = 0
    
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

    isOpen = False
    
     If Dir(tsvFolder, vbDirectory) = vbNullString Then
        errFlag = True
        MsgBox tsvFolder & vbCrLf & "Path not found。"
        GoTo FinallyHandler
        Exit Sub
     End If
     
    'TSVフォルダ直下にあるTSVファイル
    Call dbCreateByFile(target, tsvFolder, config, isOpen, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
    
    'TSVフォルダ直下にあるフォルダは繰替する
    Set list = Common.getFolderList(tsvFolder)
    For Each folders In list
        ' 2階層目
        
        'TSVフォルダにある各フォルダのTSVファイル
        Call dbCreateByFile(target, tsvFolder & "\" & folders, config, isOpen, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
        
        ' フォルダを3階層に拡張(元処理が再帰処理を使用していないので踏襲) 2017.10.10 kawana Start
        
        Set subList = Common.getFolderList(tsvFolder & "\" & folders)
        For Each subFolders In subList
            ' 3階層目
            
            Call dbCreateByFile(target, tsvFolder & "\" & folders & "\" & subFolders, config, isOpen, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
        Next
        
        ' フォルダを3階層に拡張(元処理が再帰処理を使用していないので踏襲) 2017.10.10 kawana End
    Next
    
    'ADD [#7195] 入力フォルダ名がカンマ区切りの場合、マニュアル用のTSVを追加で読込みDBへ登録 2020.03.03 TANAKA [S]
    If UBound(inputFolder) = 1 Then
        'TSVフォルダ直下にあるTSVファイル
        Call dbCreateByFile(target, manualTsvFolder, config, isOpen, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
        
        'TSVフォルダ直下にあるフォルダは繰替する
        Set list = Common.getFolderList(manualTsvFolder)
        For Each folders In list
            ' 2階層目
            
            'TSVフォルダにある各フォルダのTSVファイル
            Call dbCreateByFile(target, manualTsvFolder & "\" & folders, config, isOpen, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
            
            Set subList = Common.getFolderList(manualTsvFolder & "\" & folders)
            For Each subFolders In subList
                ' 3階層目
                
                Call dbCreateByFile(target, manualTsvFolder & "\" & folders & "\" & subFolders, config, isOpen, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
            Next
            
        Next
    End If
    'ADD [#7195] 入力フォルダ名がカンマ区切りの場合、マニュアル用のTSVを追加で読込みDBへ登録 2020.03.03 TANAKA [E]
    
    'コミット
    Call ctrl.doCommit(ret, connHandle, stmtHandle)
   If ret = SQLITE_ERROR Then
      errFlag = True
      If isAllFlg = True Then
          MsgBox target & vbCrLf & "別のプログラムがDBファイルを開いて いるので操作を完了できません。ファイルを閉じてから再実行して ください。"
      Else
          MsgBox "別のプログラムがDBファイルを開いて いるので操作を完了できません。ファイルを閉じてから再実行して ください。"
      End If
      
      GoTo FinallyHandler
      Exit Sub
   End If
    'DBファイルClose
    Call ctrl.closeDb(ret, connHandle, stmtHandle)
    If ret <> SQLITE_OK Then
        If ret = 21 Then
            errFlag = True
             If isAllFlg = True Then
                 MsgBox target & vbCrLf & "重複データが存在しています。ご確認下さい。"
             Else
                MsgBox "重複データが存在しています。ご確認下さい。"
             End If
           
             GoTo FinallyHandler
        End If
        Exit Sub
    End If
    
    If dbFileSu = 0 Then
        errFlag = True
        MsgBox target & vbCrLf & "TSVファイルがありません。"
        GoTo FinallyHandler
        Exit Sub
    End If
    If isAllFlg = False Then
       MsgBox "DB新規作成が正常終了しました。"
    End If
    
    errFlag = False

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub
'ADD BY YC_LI AT 2016/08/26 [S]
Public Sub mergeAllDb(ByVal name As String)
    Dim errFlag As Boolean
    Dim title As Variant
    Dim list As Collection
    Set list = Common.getFileList(DataManageTool.configPath & "\" & DataManageTool.DB_FILE_PATH)
    For Each title In list
        errFlag = False
        Call UniqueIdManage.MergeDb(title, errFlag, True)
        If errFlag = True Then
        Exit For
        End If
    Next
    If errFlag = False Then
       MsgBox "DBマージが正常終了しました。"
    End If
End Sub
'ADD BY YC_LI AT 2016/08/26 [E]
'指定されたデータのDBファイルを更新（マージ）モードで作成
'指定されたデータのDBファイルを更新（マージ）モードで作成
Public Sub MergeDb(ByVal target As String, Optional ByRef errFlag As Boolean = False, Optional ByVal isAllFlg As Boolean = False)

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
   'ADD BY YC_LI AT 2016/08/22 [S]
    Dim checkRlst As Boolean
    Dim renameRslt As Boolean
    Dim mergeDbRslt As Boolean
    Dim maxVal As String
    Dim tempTarget As String
    If target <> "" And InStr(target, "-") > 0 Then
       tempTarget = CStr(Split(target, "-")(1))
    End If
    renameRslt = rename(tempTarget, 1)
    If renameRslt = False Then
        errFlag = True
        GoTo FinallyHandler
        Exit Sub
    End If
    checkRlst = checkData(target)
    If checkRlst = False Then
       renameRslt = rename(tempTarget, 2)
       errFlag = True
       GoTo FinallyHandler
       Exit Sub
    Else
       renameRslt = rename(tempTarget, 2)
       mergeDbRslt = mergeDbImp(target)
    End If
    If isAllFlg = False Then
        If mergeDbRslt = True Then
         renameRslt = rename(tempTarget, 2)
         MsgBox "DBマージが正常終了しました。"
        Else
         MsgBox "DBマージエラーあり、中止します"
        End If
    Else
     If mergeDbRslt = True Then
         renameRslt = rename(tempTarget, 2)
         errFlag = False
      Else
         errFlag = True
      End If
    End If
    
    'ADD BY YC_LI AT 2016/08/22 [E]
    GoTo FinallyHandler

ErrorHandler:
    renameRslt = rename(tempTarget, 2)
    errFlag = False
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub
'ADD BY YC_LI AT 2016/08/22 [S]
Public Function checkData(ByVal target As String) As Boolean

    Dim ctrl As New Sqlite3Ctrl
    Dim ret As Long
    Dim dbFile As String
    Dim dbFileSu As Long
    Dim config As Dictionary
    Set config = Common.GetConfig(DataManageTool.configPath & "\" & DataManageTool.DB_FILE_PATH, target)
    If config Is Nothing Then
       MsgBox (target & vbCrLf & "DB作成の設定ファイルがありません。")
       checkData = False
       Exit Function
    End If
    If config.count = 0 Then
       MsgBox (target & vbCrLf & "DB作成の設定ファイルがありません。")
       checkData = False
       Exit Function
    End If
    'メイン処理
    Dim tsvFolder As String
    tsvFolder = DataManageTool.TsvPath & "\" & config(CONFIG_DATA_INPUT_FOLDER)
    Dim list As Collection
    Dim subList As Collection
    Dim folders As Variant
    Dim subFolders As Variant
    Dim files As Variant
    Dim isOpen As Boolean
    Dim isMerge As Boolean
    isMerge = False
    Dim maxVal As Long
    maxVal = 0
    dbFileSu = 0
    
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
        Exit Function
    End If
    If Dir(tsvFolder, vbDirectory) = vbNullString Then
        MsgBox tsvFolder & vbCrLf & "Path not found。"
        checkData = False
        Exit Function
    End If
    'TSVフォルダ直下にあるTSVファイル
    Dim inserSql As String
    inserSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "
    Dim resultSqlVal As String
    Dim tempSqlVal As String
    tempSqlVal = CreateDbByFile(target, tsvFolder, config, isOpen, isMerge, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
    If tempSqlVal <> "" Then
      Call ctrl.insertTable(inserSql & tempSqlVal, ret, connHandle, stmtHandle)
      If ret <> SQLITE_OK Then
         If ret = 19 Then
            MsgBox target & "重複データが存在しています。ご確認下さい。"
         End If
         checkData = False
         Exit Function
       End If
    End If
    tempSqlVal = ""

    'TSVフォルダ直下にあるフォルダは繰替する
    Set list = Common.getFolderList(tsvFolder)
    For Each folders In list
        ' 2階層目

        'TSVフォルダにある各フォルダのTSVファイル
        tempSqlVal = CreateDbByFile(target, tsvFolder & "\" & folders, config, isOpen, isMerge, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
        If tempSqlVal <> "" Then
           Call ctrl.insertTable(inserSql & tempSqlVal, ret, connHandle, stmtHandle)
           If ret = 19 Then
              checkData = False
              MsgBox target & "重複データが存在しています。ご確認下さい。"
              Exit Function
           End If
        End If
        tempSqlVal = ""

        Set subList = Common.getFolderList(tsvFolder & "\" & folders)
        For Each subFolders In subList
            ' 3階層目

            tempSqlVal = CreateDbByFile(target, tsvFolder & "\" & folders & "\" & subFolders, config, isOpen, isMerge, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
            If tempSqlVal <> "" Then
               Call ctrl.insertTable(inserSql & tempSqlVal, ret, connHandle, stmtHandle)
               If ret = 19 Then
                  checkData = False
                  MsgBox target & "重複データが存在しています。ご確認下さい。"
                  Exit Function
               End If
            End If
            tempSqlVal = ""
        Next
    Next

    'コミット
    Call ctrl.doCommit(ret, connHandle, stmtHandle)
    'DBファイルClose
    Call ctrl.closeDb(ret, connHandle, stmtHandle)
    If ret <> SQLITE_OK Then
        If ret = 21 Then
            MsgBox target & "重複データが存在しています。ご確認下さい。"
        End If
        checkData = False
        Exit Function
    End If
    If dbFileSu = 0 Then
        MsgBox target & "TSVファイルがありません。"
        checkData = False
        Exit Function
    End If
    checkData = True
End Function
Public Function mergeDbImp(ByVal target As String) As Boolean

    Dim ctrl As New Sqlite3Ctrl
    Dim ret As Long
    Dim dbFile As String
    Dim dbFileSu As Long
    Dim config As Dictionary
    Set config = Common.GetConfig(DataManageTool.configPath & "\" & DataManageTool.DB_FILE_PATH, target)
    'メイン処理
    Dim tsvFolder As String
    tsvFolder = DataManageTool.TsvPath & "\" & config(CONFIG_DATA_INPUT_FOLDER)
    Dim list As Collection
    Dim subList As Collection
    Dim folders As Variant
    Dim subFolders As Variant
    Dim files As Variant
    Dim isOpen As Boolean
    Dim maxVal As Long
    Dim isMerge As Boolean
    isMerge = True
    maxVal = 0
    dbFileSu = 0
    
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
        Exit Function
    End If
    
    If Dir(tsvFolder, vbDirectory) = vbNullString Then
        MsgBox tsvFolder & vbCrLf & "Path not found。"
        mergeDbImp = False
        Exit Function
    End If
    'TSVフォルダ直下にあるTSVファイル
    Dim inserSql As String
    inserSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "
    Dim resultSqlVal As String
    Dim tempSqlVal As String
    tempSqlVal = CreateDbByFile(target, tsvFolder, config, isOpen, isMerge, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
    If tempSqlVal <> "" Then
       Call ctrl.insertTable(inserSql & tempSqlVal, ret, connHandle, stmtHandle)
    End If
    tempSqlVal = ""
    'TSVフォルダ直下にあるフォルダは繰替する
    Set list = Common.getFolderList(tsvFolder)
    For Each folders In list
        ' 2階層目

        'TSVフォルダにある各フォルダのTSVファイル
        tempSqlVal = CreateDbByFile(target, tsvFolder & "\" & folders, config, isOpen, isMerge, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
        If tempSqlVal <> "" Then
           Call ctrl.insertTable(inserSql & tempSqlVal, ret, connHandle, stmtHandle)
        End If
        tempSqlVal = ""

        Set subList = Common.getFolderList(tsvFolder & "\" & folders)
        For Each subFolders In subList
            ' 3階層目

            tempSqlVal = CreateDbByFile(target, tsvFolder & "\" & folders & "\" & subFolders, config, isOpen, isMerge, maxVal, ctrl, ret, connHandle, stmtHandle, dbFileSu)
            If tempSqlVal <> "" Then
               Call ctrl.insertTable(inserSql & tempSqlVal, ret, connHandle, stmtHandle)
            End If
            tempSqlVal = ""
        Next
    Next

    'コミット
    Call ctrl.doCommit(ret, connHandle, stmtHandle)
    'DBファイルClose
    Call ctrl.closeDb(ret, connHandle, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If
    If dbFileSu = 0 Then
        MsgBox target & "TSVファイルがありません。"
        Exit Function
    End If
    mergeDbImp = True
End Function

Public Function rename(ByVal target As String, ByVal model As Long) As Boolean
 On Error GoTo ErrorHandler
  Dim dbPath As String
  Dim newFileNm As String
  Dim oldFileNm As String
  Dim newJournalFileNm As String
  Dim oldJournalFileNm As String
  rename = False
    
  dbPath = DataManageTool.dbPath
  newFileNm = dbPath & "\" & target & "$$$.db3"
  oldFileNm = dbPath & "\" & target & ".db3"

  newJournalFileNm = dbPath & "\" & target & "$$$.db3-journal"
  oldJournalFileNm = dbPath & "\" & target & ".db3-journal"
  
  If Dir(oldFileNm) = "" And model = 1 Then
     rename = False
     MsgBox ("マージ先" & oldFileNm & "DBファイルが存在しません。DBの新規作成を実行してください。")
     Exit Function
  End If
  If model = 1 Then
     Name oldFileNm As newFileNm
     rename = True
     Exit Function
  Else
     If Dir(oldFileNm) <> "" Then
        Kill oldFileNm
     End If
     Name newFileNm As oldFileNm
     
     If Dir(newJournalFileNm) <> "" Then
         If Dir(oldJournalFileNm) <> "" Then
            Kill oldJournalFileNm
         End If
        Name newJournalFileNm As oldJournalFileNm
     End If
     
     rename = True
     Exit Function
  End If
ErrorHandler:
    rename = False
    MsgBox ("別のプログラムがDBファイルを開いているので操作を完了できません。ファイルを閉じてから再実行してください。")
End Function

Public Function getInsertSql(ByVal target As String, ByVal ctrl As Sqlite3Ctrl, ByVal config As Dictionary, ByVal data As Variant, ByVal isMerge As Boolean, ByVal intValue As Long, ByRef maxVal As Long) As String
    Dim i As Integer
    Dim j As Integer
    Dim k As Integer
    Dim z As Integer

    Dim bindSql As String
    Dim bindSqlVal As String
    Dim tenkaiYk As Integer
    Dim tenkaiTt As Integer
    Dim mode As Integer
    Dim rowCount As Long
    Dim value As Long

    '500件対応 [S]
    Dim countSu As Integer
    Dim countSu1 As Integer
    Dim insertMaxSu As Integer
    Dim insertMaxSu1 As Integer
    Dim ykSkip As Boolean
    Dim ykSu As Long
    Dim intJ As Long
    Dim isOver As Boolean
    bindSqlVal = ""
    'ADD BY YC_LI AT 2016/09/01 [S]
    Dim nullSkipColumns As String

    Dim insertId As String
    Dim convertStr As String
    Dim keyCol As Integer
    Dim dbNm, dbKey As String

    nullSkipColumns = config(NULL_SKIP_COLUMNS)
    'ADD BY YC_LI AT 2016/09/01 [E]
    countSu = 0
    countSu1 = 0
    tenkaiYk = 1
    tenkaiTt = 1
    rowCount = UBound(data) - LBound(data) + 1

    Do
        If countSu1 + config(CONFIG_DATA_INPUT_READ_START_ROW) > rowCount Then
            Exit Do
        End If
        '採番対象
        If InStr(config(CONFIG_NUMBERING_COLUMNS), ",") > 0 And (InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 Or InStr(config(CONFIG_NUMBERING_COLUMNS), "[") > 0) Then
            '採番対象が複数列で結合する 且つ 横展開OR縦展開必要の列がある
            mode = 1
            '横展開がある場合
            If InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 Then
                If InStr(config(CONFIG_SPREAD_COLUMNS), ",") > 0 Then
                    '横展開の回数を算出
                    tenkaiYk = (UBound(data, 2) - CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + 1) / CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))
                Else
                    '横展開の回数を算出
                    tenkaiYk = UBound(data, 2) - CInt(config(CONFIG_SPREAD_COLUMNS)) + 1
                End If
            End If

        ElseIf InStr(config(CONFIG_NUMBERING_COLUMNS), ",") > 0 Then
            '採番対象が複数列で結合する
            mode = 2
        Else
            '一つの項目
            mode = 3
        End If
        insertMaxSu = 0
        insertMaxSu1 = 0
        If countSu = 0 Then
            countSu = countSu + config(CONFIG_DATA_INPUT_READ_START_ROW)
        End If

        Dim strValue As String
        Dim strValueBef As String
        Dim id As Long
        id = 0
        If countSu1 > 0 Then
            id = countSu1
        End If
        intJ = 0

        convertStr = config(CONFIG_DATA_CONVERT_ID)

        'BULK_COUNTに満たない残処理分のサンプル実装（この場合は残りが10件）
        For j = 1 To (rowCount - countSu1 - config(CONFIG_DATA_INPUT_READ_START_ROW) + 1) * COLUMN_COUNT Step COLUMN_COUNT
            id = id + 1
            countSu1 = countSu1 + 1
            'ADD BY YC_LI AT 2016/09/01 [S]
            If nullSkipColumns <> vbNullString Then

                Dim arrNullSkip() As String
                Dim tempNullSkip() As String
                Dim skipIndex
                Dim splitIndex
                Dim skipFlag As Boolean
                skipFlag = False
                arrNullSkip() = Split(nullSkipColumns, ",")
                For skipIndex = LBound(arrNullSkip) To UBound(arrNullSkip)
                    If InStr(arrNullSkip(skipIndex), "-") > 0 Then
                        tempNullSkip() = Split(arrNullSkip(skipIndex), "-")
                        For splitIndex = tempNullSkip(0) To tempNullSkip(1)
                            If data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), splitIndex) = vbNullString Then
                                skipFlag = True
                            End If
                        Next
                    Else
                        If data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Trim(arrNullSkip(skipIndex)))) = vbNullString Then
                            skipFlag = True
                        End If
                    End If
                Next
                If skipFlag = True Then
                    Exit For
                End If
            End If
            'ADD BY YC_LI AT 2016/09/01 [E]
            If InStr(config(CONFIG_NUMBERING_COLUMNS), "[") > 0 Then
                '縦展開がある場合
                If id < config(CONFIG_DATA_INPUT_READ_START_ROW) Then
                    tenkaiTt = (UBound(Split(data(config(CONFIG_DATA_INPUT_READ_START_ROW), config(CONFIG_VERTICAL_SPREAD_COLUMNS)), ",")) + 1)
                Else
                    tenkaiTt = (UBound(Split(data(id, config(CONFIG_VERTICAL_SPREAD_COLUMNS)), ",")) + 1)
                End If
            Else
                '縦展開がない場合
                tenkaiTt = 1
            End If


            For z = 1 To tenkaiYk * tenkaiTt

                ykSkip = False

                If mode = 1 Then
                    '採番対象が複数列で結合する 且つ 横展開OR縦展開必要の列がある
                    If InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 And InStr(config(CONFIG_NUMBERING_COLUMNS), "[") > 0 Then
                        '横展開、縦展開両方がある場合
                        strValue = ""
                        For k = 1 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ",")) + 1

                            If repVal(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)) = config(CONFIG_VERTICAL_SPREAD_COLUMNS) Then
                                '縦対象の場合
                                If strValue = "" Then
                                    strValue = Split(CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), config(CONFIG_VERTICAL_SPREAD_COLUMNS))), ",")((z - 1) Mod tenkaiTt)
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)))
                                End If
                            ElseIf InStr(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1), "<") > 0 Then
                                '横展開対象の場合
                                If Trim(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1)))) = "" Then
                                    '横展開対象が空の場合、処理をスキップ
                                    ykSkip = True
                                End If
                                If strValue = "" Then
                                    strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                                Else
                                    'strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (z - 1) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                                End If
                            Else
                                '普通対象の場合
                                If strValue = "" Then
                                    strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k))
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k))
                                End If
                            End If
                        Next

                        '※行スキップ判断
                        If j > 1 And z = 1 Then
                            '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                            If strValueBef = lineValue(data, id, config) Then
                                Exit For
                            End If
                        End If
                        If z = 1 Then
                            'strValueBef = strValue
                            strValueBef = lineValue(data, id, config)
                        End If
                    ElseIf InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 Then
                        '横展開だけがある場合
                        If Trim(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1)))) = "" Then
                            '横展開対象が空の場合、処理をスキップ
                            ykSkip = True
                        End If

                        For k = 0 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ","))
                            If k = 0 Then
                                strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
                            Else
                                'strValue = strValue & "," & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Replace(Replace(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(l), "<", ""), ">", "")))
                                strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (z - 1) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                            End If
                        Next

                        '※行スキップ判断
                        If j > 1 Then
                            '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                            If strValueBef = strValue Then
                                Exit For
                            End If
                        End If
                        If z = 1 Then
                            strValueBef = strValue
                        End If
                    Else
                        '縦展開だけがある場合
                        'strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (z - 1) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                        strValue = ""
                        For k = 1 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ",")) + 1
                            If repVal(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)) = config(CONFIG_VERTICAL_SPREAD_COLUMNS) Then
                                If strValue = "" Then
                                    strValue = Split(CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k)), ",")(z - 1)
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)))
                                End If
                            Else
                                If strValue = "" Then
                                    strValue = Split(CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k)), ",")(z - 1)
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)))
                                End If
                            End If
                        Next

                        '※行スキップ判断
                        If j > 1 Then
                            '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                            If strValueBef = strValue Then
                                Exit For
                            End If
                        End If
                        If z = 1 Then
                            strValueBef = strValue
                        End If

                    End If

                    '横展開対象が空の場合､処理をスキップ
                    If ykSkip = False Then
                        intJ = intJ + 1
                        'ret = SQLite3BindText(stmtHandle, intJ, strValue)
                        If bindSqlVal = "" Then
                            bindSqlVal = "('" & strValue
                        Else
                            bindSqlVal = bindSqlVal & ",('" & strValue
                        End If
                    End If

                ElseIf mode = 2 Then
                    '採番対象が複数列で結合する
                    For k = 0 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ","))
                        If k = 0 Then
                            strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
                        Else
                            strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
                        End If
                    Next

                    '※行スキップ判断
                    If j > 1 Then
                        '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                        If strValueBef = strValue Then
                            Exit For
                        End If
                    End If

                    intJ = intJ + 1
                    If bindSqlVal = "" Then
                        bindSqlVal = "('" & strValue
                    Else
                        bindSqlVal = bindSqlVal & ",('" & strValue
                    End If
                    strValueBef = strValue
                Else
                    '一つの項目
                    strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(config(CONFIG_NUMBERING_COLUMNS))))

                    '※行スキップ判断
                    If j > 1 Then
                        '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                        If strValueBef = strValue Then
                            Exit For
                        End If
                    End If

                    intJ = intJ + 1
                    If bindSqlVal = "" Then
                        bindSqlVal = "('" & strValue
                    Else
                        bindSqlVal = bindSqlVal & ",('" & strValue
                    End If
                    strValueBef = strValue
                End If

                '横展開対象が空の場合､処理をスキップ
                If ykSkip = False Then
                    If InStr(convertStr, "#") > 0 Then
                        ' 別DBのID使用

                        keyCol = CInt(Split(convertStr, "#")(0))
                        dbNm = Split(convertStr, "#")(1)
                        dbKey = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), keyCol))

                        ' 別DBのID取得
                        insertId = CStr(getIdByKey(dbNm, dbKey))
                        bindSqlVal = bindSqlVal & "','" & insertId & "')"

                    ElseIf isMerge = True Then
                        Dim oldVal As String
                        oldVal = ctrl.getValueBySql(target, "SELECT VALUE FROM KEY_VALUE WHERE KEY = '" & strValue & "'")
                        If oldVal <> "0" Then
                            bindSqlVal = bindSqlVal & "','" & oldVal & "')"
                        Else
                            intValue = intValue + 1
                            bindSqlVal = bindSqlVal & "','" & maxVal + intValue & "')"
                        End If
                    Else
                        insertMaxSu1 = insertMaxSu1 + 1
                        intJ = intJ + 1
                        intValue = intValue + 1
                        bindSqlVal = bindSqlVal & "','" & (maxVal + intValue) & "')"
                    End If
                End If
            Next
        Next
    Loop
    If intValue > maxVal Then
        maxVal = intValue
    End If
    getInsertSql = bindSqlVal
    bindSqlVal = ""
End Function
Public Function CreateDbByFile(ByVal target As String, ByVal path As String, ByVal config As Dictionary, ByRef isOpen As Boolean, ByVal isMerge As Boolean, ByRef maxVal As Long, ByVal ctrl As Sqlite3Ctrl, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr, ByRef dbFileSu As Long) As String
    Dim files As Variant
    Dim tsvFile As String
    Dim resultSql As String
    Dim intValue As Long
    Dim wkValue As Long
    Dim fileList As Collection
    Set fileList = Common.getFileList(path)
    
    intValue = 0
    For Each files In fileList
        Dim file As New FileInputCtrl
        Dim isFound As Boolean
        
        tsvFile = path & "\" & files & DataManageTool.TSV_FILE_EXT
        isFound = file.OpenFile(tsvFile)

        If isFound Then
            dbFileSu = dbFileSu + 1
            Dim data As Variant
            Dim rowIndex As Long
            rowIndex = 0
            data = file.ReadFile
            
            If isOpen = False Then
                'DBをOPENして作成
                If isMerge = True Then
                   Call ctrl.openDb(target & "$$$", ret, connHandle, stmtHandle, False)
                Else
                   Call ctrl.openDb(target, ret, connHandle, stmtHandle, False)
                End If
                If ret <> SQLITE_OK Then
                    Exit Function
                End If
                
                'テーブル作成
                Call ctrl.createTable("CREATE TABLE KEY_VALUE (KEY TEXT PRIMARY KEY, VALUE INTEGER)", ret, connHandle, stmtHandle)
                If ret <> SQLITE_OK Then
                    Exit Function
                End If
                'beginTrans
                Call ctrl.doBegin(ret, connHandle, stmtHandle)
                If isMerge = True Then
                   intValue = ctrl.getValueBySql(target, "SELECT MAX(VALUE) FROM KEY_VALUE")
                End If
                isOpen = True
            Else
                'MAX VALUE値の取得
                wkValue = ctrl.selectTable("SELECT MAX(VALUE) FROM KEY_VALUE", ret, connHandle, stmtHandle)
                If wkValue > maxVal Then
                    maxVal = wkValue
                End If
            End If
            '### DataInputReadStartRow ###
            If config(CONFIG_DATA_INPUT_READ_START_ROW) = "" Then
                '未設定の場合は、ディフォルトは2行目から処理
                config(CONFIG_DATA_INPUT_READ_START_ROW) = 2
            End If
            'インサート処理
            Dim insertSql As String
            insertSql = getInsertSql(target, ctrl, config, data, isMerge, intValue, maxVal)
            If resultSql = "" Then
               resultSql = resultSql & insertSql
            Else
            'ADD BY LYC AT 2016/11/18 [S]
            If insertSql <> "" Then
               resultSql = resultSql & "," & insertSql
            End If
            'ADD BY LYC AT 2016/11/18 [S]
            End If
            file.CloseFile
        End If
    Next
    CreateDbByFile = resultSql
End Function
'ADD BY YC_LI AT 2016/08/22 [E]

Public Sub dbCreateByFile(ByVal target As String, ByVal path As String, ByVal config As Dictionary, ByRef isOpen As Boolean, ByRef maxVal As Long, ByVal ctrl As Sqlite3Ctrl, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr, ByRef dbFileSu As Long)
    Dim files As Variant
    Dim tsvFile As String
    Dim intValue As Long
    Dim fileList As Collection
    Set fileList = Common.getFileList(path)
    
    intValue = 0
        
    For Each files In fileList
        Dim file As New FileInputCtrl
        Dim isFound As Boolean
        
        tsvFile = path & "\" & files & DataManageTool.TSV_FILE_EXT
        isFound = file.OpenFile(tsvFile)

        If isFound Then
        
            dbFileSu = dbFileSu + 1
            
            Dim data As Variant
            Dim rowIndex As Long
            rowIndex = 0

            data = file.ReadFile
            
            If isOpen = False Then
    
                'DBをOPENして作成
                Call ctrl.openDb(target, ret, connHandle, stmtHandle, True)
                If ret <> SQLITE_OK Then
                    Exit Sub
                End If
                
                'テーブル作成
                Call ctrl.createTable("CREATE TABLE KEY_VALUE (KEY TEXT PRIMARY KEY, VALUE INTEGER)", ret, connHandle, stmtHandle)
                If ret <> SQLITE_OK Then
                    Exit Sub
                End If
                
                'beginTrans
                Call ctrl.doBegin(ret, connHandle, stmtHandle)

                isOpen = True
            Else
                
                'MAX VALUE値の取得
                maxVal = ctrl.selectTable("SELECT MAX(VALUE) FROM KEY_VALUE", ret, connHandle, stmtHandle)

            End If

            '### DataInputReadStartRow ###
            If config(CONFIG_DATA_INPUT_READ_START_ROW) = "" Then
                '未設定の場合は、ディフォルトは2行目から処理
                config(CONFIG_DATA_INPUT_READ_START_ROW) = 2
            End If
            
            'インサート処理
            Call doInsert(config, data, intValue, maxVal, ctrl, ret, connHandle, stmtHandle)
            
            If ret <> SQLITE_OK Then
                Exit Sub
            Else
            
            End If
            
            file.CloseFile
        End If
    Next
End Sub


Public Sub doInsert(ByVal config As Dictionary, ByVal data As Variant, ByVal intValue As Long, ByVal maxVal As Long, ByVal ctrl As Sqlite3Ctrl, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    Dim i As Integer
    Dim j As Integer
    Dim k As Integer
    Dim z As Integer
    
    Dim bindSql As String
    Dim bindSqlVal As String
    Dim tenkaiYk As Integer
    Dim tenkaiTt As Integer
    Dim mode As Integer
    Dim rowCount As Long
    Dim value As Long

    '500件対応 [S]
    Dim countSu As Integer
    Dim countSu1 As Integer
    Dim insertMaxSu As Integer
    Dim insertMaxSu1 As Integer
    Dim ykSkip As Boolean
    Dim ykSu As Long
    Dim intJ As Long
    Dim isOver As Boolean
    bindSqlVal = ""
    
    'ADD BY YC_LI AT 2016/09/01 [S]
    Dim nullSkipColumns As String
    
    Dim insertId As String
    Dim convertStr As String
    Dim keyCol As Integer
    Dim dbNm, dbKey As String
    
    nullSkipColumns = config(NULL_SKIP_COLUMNS)
    'ADD BY YC_LI AT 2016/09/01 [E]
    
    countSu = 0
    countSu1 = 0
    tenkaiYk = 1
    tenkaiTt = 1
    rowCount = UBound(data) - LBound(data) + 1
    
    Do
        If countSu1 + config(CONFIG_DATA_INPUT_READ_START_ROW) > rowCount Then
            Exit Do
        End If
        
        '採番対象
        If InStr(config(CONFIG_NUMBERING_COLUMNS), ",") > 0 And (InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 Or InStr(config(CONFIG_NUMBERING_COLUMNS), "[") > 0) Then
            '採番対象が複数列で結合する 且つ 横展開OR縦展開必要の列がある
            mode = 1
            
            '横展開がある場合
            If InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 Then
                If InStr(config(CONFIG_SPREAD_COLUMNS), ",") > 0 Then
                    '横展開の回数を算出
                    tenkaiYk = (UBound(data, 2) - CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + 1) / CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))
                Else
                    '横展開の回数を算出
                    tenkaiYk = UBound(data, 2) - CInt(config(CONFIG_SPREAD_COLUMNS)) + 1
                End If
            End If
        ElseIf InStr(config(CONFIG_NUMBERING_COLUMNS), ",") > 0 Then
            '採番対象が複数列で結合する
            mode = 2
        Else
            '一つの項目
            mode = 3
        End If
    
        insertMaxSu = 0
        insertMaxSu1 = 0
        
        bindSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "
        
        If countSu = 0 Then
           countSu = countSu + config(CONFIG_DATA_INPUT_READ_START_ROW)
        End If
  
        Dim strValue As String
        Dim strValueBef As String
        Dim id As Long
        id = 0
        
        If countSu1 > 0 Then
           id = countSu1
        End If

        intJ = 0
        
        'BULK_COUNTに満たない残処理分のサンプル実装（この場合は残りが10件）
        For j = 1 To (rowCount - countSu1 - config(CONFIG_DATA_INPUT_READ_START_ROW) + 1) * COLUMN_COUNT Step COLUMN_COUNT
          
            id = id + 1
            countSu1 = countSu1 + 1
          'ADD BY YC_LI AT 2016/09/01 [S]
           If nullSkipColumns <> vbNullString Then
           
           Dim arrNullSkip() As String
           Dim tempNullSkip() As String
           Dim skipIndex
           Dim splitIndex
           Dim skipFlag As Boolean
           skipFlag = False
           arrNullSkip() = Split(nullSkipColumns, ",")
           For skipIndex = LBound(arrNullSkip) To UBound(arrNullSkip)
             If InStr(arrNullSkip(skipIndex), "-") > 0 Then
                  tempNullSkip() = Split(arrNullSkip(skipIndex), "-")
                  For splitIndex = tempNullSkip(0) To tempNullSkip(1)
                      If data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), splitIndex) = vbNullString Then
                         skipFlag = True
                      End If
                  Next
             Else
                If data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Trim(arrNullSkip(skipIndex)))) = vbNullString Then
                   skipFlag = True
                End If
             End If
           Next
           If skipFlag = True Then
              Exit For
           End If
           End If
            'ADD BY YC_LI AT 2016/09/01 [E]
            If InStr(config(CONFIG_NUMBERING_COLUMNS), "[") > 0 Then
                '縦展開がある場合
                If id < config(CONFIG_DATA_INPUT_READ_START_ROW) Then
                    tenkaiTt = (UBound(Split(data(config(CONFIG_DATA_INPUT_READ_START_ROW), config(CONFIG_VERTICAL_SPREAD_COLUMNS)), ",")) + 1)
                Else
                    tenkaiTt = (UBound(Split(data(id, config(CONFIG_VERTICAL_SPREAD_COLUMNS)), ",")) + 1)
                End If
            Else
                '縦展開がない場合
                tenkaiTt = 1
            End If

            For z = 1 To tenkaiYk * tenkaiTt

                ykSkip = False

                If mode = 1 Then
                    '採番対象が複数列で結合する 且つ 横展開OR縦展開必要の列がある
                    If InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 And InStr(config(CONFIG_NUMBERING_COLUMNS), "[") > 0 Then
                        '横展開、縦展開両方がある場合
                        strValue = ""
                        For k = 1 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ",")) + 1
                            
                            If repVal(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)) = config(CONFIG_VERTICAL_SPREAD_COLUMNS) Then
                                '縦対象の場合
                                If strValue = "" Then
                                    strValue = Split(CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), config(CONFIG_VERTICAL_SPREAD_COLUMNS))), ",")((z - 1) Mod tenkaiTt)
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)))
                                End If
                            ElseIf InStr(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1), "<") > 0 Then
                                '横展開対象の場合
                                If Trim(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1)))) = "" Then
                                    '横展開対象が空の場合、処理をスキップ
                                    ykSkip = True
                                End If
                                If strValue = "" Then
                                    strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                                Else
                                    'strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (z - 1) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                                End If
                            Else
                                '普通対象の場合
                                If strValue = "" Then
                                    strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k))
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k))
                                End If
                            End If
                        Next
                        
                        '※行スキップ判断
                        If j > 1 And z = 1 Then
                            '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                            If strValueBef = lineValue(data, id, config) Then
                                Exit For
                            End If
                        End If
                        If z = 1 Then
                            'strValueBef = strValue
                            strValueBef = lineValue(data, id, config)
                        End If
                    ElseIf InStr(config(CONFIG_NUMBERING_COLUMNS), "<") > 0 Then
                        '横展開だけがある場合
                        If Trim(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (Int((z - 1) / tenkaiTt) Mod tenkaiYk) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1)))) = "" Then
                            '横展開対象が空の場合、処理をスキップ
                            ykSkip = True
                        End If

                        For k = 0 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ","))
                            If k = 0 Then
                                strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
                            Else
                                'strValue = strValue & "," & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Replace(Replace(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(l), "<", ""), ">", "")))
                                strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (z - 1) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                            End If
                        Next
                        
                        '※行スキップ判断
                        If j > 1 Then
                            '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                            If strValueBef = strValue Then
                                Exit For
                            End If
                        End If
                        If z = 1 Then
                            strValueBef = strValue
                        End If
                    Else
                        '縦展開だけがある場合
                        'strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)) + (z - 1) * CInt(Split(config(CONFIG_SPREAD_COLUMNS), ",")(1))))
                        strValue = ""
                        For k = 1 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ",")) + 1
                            If repVal(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)) = config(CONFIG_VERTICAL_SPREAD_COLUMNS) Then
                                If strValue = "" Then
                                    strValue = Split(CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k)), ",")(z - 1)
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)))
                                End If
                            Else
                                If strValue = "" Then
                                    strValue = Split(CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), k)), ",")(z - 1)
                                Else
                                    strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k - 1)))
                                End If
                            End If
                        Next
                        
                        '※行スキップ判断
                        If j > 1 Then
                            '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                            If strValueBef = strValue Then
                                Exit For
                            End If
                        End If
                        If z = 1 Then
                            strValueBef = strValue
                        End If
                        
                    End If
                    
                    '横展開対象が空の場合､処理をスキップ
                    If ykSkip = False Then
                        intJ = intJ + 1
                        'ret = SQLite3BindText(stmtHandle, intJ, strValue)
                        If bindSqlVal = "" Then
                            bindSqlVal = "('" & strValue
                        Else
                            bindSqlVal = bindSqlVal & ",('" & strValue
                        End If
                    End If
                    
                ElseIf mode = 2 Then
                    '採番対象が複数列で結合する
                    For k = 0 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ","))
                        If k = 0 Then
                            strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
                        Else
                            strValue = strValue & vbTab & CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
                        End If
                    Next
                    
                    '※行スキップ判断
                    If j > 1 Then
                        '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                        If strValueBef = strValue Then
                            Exit For
                        End If
                    End If

                    intJ = intJ + 1
                    If bindSqlVal = "" Then
                        bindSqlVal = "('" & strValue
                    Else
                        bindSqlVal = bindSqlVal & ",('" & strValue
                    End If
                    strValueBef = strValue
                Else
                    '一つの項目
                    strValue = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), CInt(config(CONFIG_NUMBERING_COLUMNS))))
                    '※行スキップ判断
                    If j > 1 Then
                        '前行と現行の対象列の値が全て一致した場合、現行は処理をスキップし次行を移る
                        If strValueBef = strValue Then
                            Exit For
                        End If
                    End If

                    intJ = intJ + 1
                    If bindSqlVal = "" Then
                        bindSqlVal = "('" & strValue
                    Else
                        bindSqlVal = bindSqlVal & ",('" & strValue
                    End If
                    strValueBef = strValue
                End If
                '横展開対象が空の場合､処理をスキップ
                If ykSkip = False Then
                    insertMaxSu1 = insertMaxSu1 + 1
                    intJ = intJ + 1
                    intValue = intValue + 1

                    ' IDを別DBのIDに変更 2017.10.06 kawana Start
                    
                    ' 別DBのIDを使用する場合の設定
                    convertStr = config(CONFIG_DATA_CONVERT_ID)
                    
                    If InStr(convertStr, "#") > 0 Then
                        ' 別DBのID使用
                    
                        keyCol = CInt(Split(convertStr, "#")(0))
                        dbNm = Split(convertStr, "#")(1)
                        dbKey = CStr(data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), keyCol))
                        
                        ' 別DBのID取得
                        insertId = CStr(getIdByKey(dbNm, dbKey))
                    Else
                        ' 通常

                        ' IDはインクリメント
                        insertId = (maxVal + intValue)
                    End If
                    
                    bindSqlVal = bindSqlVal & "','" & insertId & "')"
                    ' IDを別DBのIDに変更 2017.10.06 kawana End
                End If
            Next
        Next
    
    Loop
    If bindSql = "" Or bindSqlVal = "" Then
       Exit Sub
    Else
       Call ctrl.insertTable(bindSql & bindSqlVal, ret, connHandle, stmtHandle)
    End If
    
    bindSqlVal = ""

End Sub

Public Function isSkip(ByVal data As Variant, ByVal startRow As Long, ByVal row As Long, ByVal numberingCol As String, ByVal mode As Integer) As Boolean
    Dim k As Integer

    If row <= startRow Then
        isSkip = False
        Exit Function
    End If

    If mode = 1 Then
        '前行と現行の対象列の値が全て一致したかチェック
        If InStr(numberingCol, "<") > 0 And InStr(numberingCol, "[") > 0 Then
            numberingCol = Replace(Replace(numberingCol, "<", ""), ">", "")
            numberingCol = Replace(Replace(numberingCol, "[", ""), "]", "")
            
        ElseIf InStr(numberingCol, "<") > 0 Then
            numberingCol = Replace(Replace(numberingCol, "<", ""), ">", "")
        ElseIf InStr(numberingCol, "[") > 0 Then
            numberingCol = Replace(Replace(numberingCol, "[", ""), "]", "")
        End If
        
        For k = 0 To UBound(Split(numberingCol, ","))
            If data(row, Split(numberingCol, ",")(k)) <> data(row - 1, Split(numberingCol, ",")(k)) Then
                isSkip = False
                Exit Function
            End If
        Next
        isSkip = True
        
    ElseIf mode = 2 Then
        '前行と現行の対象列の値が全て一致したかチェック
        For k = 0 To UBound(Split(numberingCol, ","))
            If data(row, Split(numberingCol, ",")(k)) <> data(row - 1, Split(numberingCol, ",")(k)) Then
                isSkip = False
                Exit Function
            End If
        Next
        isSkip = True
        
    ElseIf mode = 3 Then
        '前行と現行の対象列の値が全て一致したかチェック
        If data(row, numberingCol) = data(row - 1, numberingCol) Then
            isSkip = True
        Else
            isSkip = False
        End If
    End If

End Function

Public Function repVal(ByVal str As String) As String
    repVal = str
    If InStr(repVal, "<") > 0 Then
        repVal = Replace(repVal, "<", "")
    End If
    
    If InStr(repVal, ">") > 0 Then
        repVal = Replace(repVal, ">", "")
    End If
    
    If InStr(repVal, "[") > 0 Then
        repVal = Replace(repVal, "[", "")
    End If
    
    If InStr(repVal, "]") > 0 Then
        repVal = Replace(repVal, "]", "")
    End If
End Function

Public Function lineValue(ByVal data As Variant, ByVal id As Long, ByVal config As Dictionary) As String
    Dim k As Integer
    Dim strValue As String
    
    strValue = ""
    
    For k = 0 To UBound(Split(config(CONFIG_NUMBERING_COLUMNS), ","))
        If strValue = "" Then
            strValue = data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), repVal(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
        Else
            strValue = strValue & vbTab & data(id - 1 + config(CONFIG_DATA_INPUT_READ_START_ROW), repVal(Split(config(CONFIG_NUMBERING_COLUMNS), ",")(k)))
        End If
    Next
    
    lineValue = strValue
    
End Function

Public Function ykNotNull(ByVal data As Variant, ByVal row As Long, ByVal config As Dictionary) As Long
    Dim i As Long
    Dim startCol As Long
    Dim addCol As Long
    
    i = 0
    
    If config(CONFIG_SPREAD_COLUMNS) <> "" Then
        If InStr(config(CONFIG_SPREAD_COLUMNS), ",") > 0 Then
            startCol = Split(config(CONFIG_SPREAD_COLUMNS), ",")(0)
            addCol = Split(config(CONFIG_SPREAD_COLUMNS), ",")(1)
        Else
            startCol = config(CONFIG_SPREAD_COLUMNS)
            addCol = 1
        End If
    End If
    
    Do Until startCol > UBound(data, 2)
        If Trim(data(row, startCol)) <> "" Then
            i = i + 1
        End If
        
        startCol = startCol + addCol
    Loop
    
    ykNotNull = i
    
End Function

Public Sub Test()
    Dim ctrl As New Sqlite3Ctrl
    ctrl.Test
End Sub

