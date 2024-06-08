Attribute VB_Name = "Common"
Option Explicit

Private Const CONFIG_START_ROW As Integer = 2
Private Const CONFIG_START_COL As Integer = 1

Private Const CONFIG_FILE_EXT As String = ".xlsx"
Private Const CONFIG_SHEET_NAME As String = "Config"

' -- ADD BY KAWANA デフォルト設定ファイルを親フォルダまでたどるように修正 2018.03.01 [S]
Private Const DEFAULT_CONFIG_FILE_NAME = "!default.xlsx"
Private Const CONFIG_FILE_ROOT_PATH = "DataManageTool\conf"
' -- ADD BY KAWANA デフォルト設定ファイルを親フォルダまでたどるように修正 2018.03.01 [E]


Public Function GetConfig(ByVal bookpath As String, ByVal bookName As String, Optional ByVal config As Dictionary = Nothing) As Dictionary
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    If config Is Nothing Then
        Set config = New Dictionary
    End If

    Dim index As Integer
    index = InStrRev(bookName, ".")

    Dim configFile As String

    If index > 0 Then
        configFile = Left(bookName, index - 1) & CONFIG_FILE_EXT
    Else
        configFile = bookName & CONFIG_FILE_EXT
    End If

    Dim isOpen As Boolean
    Dim wb As Workbook

    For Each wb In Workbooks
        If wb.name = configFile Then
            isOpen = True
            Exit For
        End If
    Next

    If Not isOpen Then
        Dim w As String
        w = bookpath & "\" & configFile

        Dim fso As New FileSystemObject

        ' -- MODIFY BY KAWANA デフォルト設定ファイルを親フォルダまでたどるように修正 2018.03.01 [S]
        If Not fso.FileExists(w) Then
            ' 設定ファイルなし ==> デフォルト設定ファイルを読込
            Dim i As Integer
            For i = 1 To 10
            ' 10階層までとする
                w = bookpath & "\" & DEFAULT_CONFIG_FILE_NAME
                If fso.FileExists(w) Then
                    ' デフォルト設定ファイルあり
                    Exit For
                End If
                ' 親階層へ
                bookpath = fso.GetParentFolderName(bookpath)
                If bookpath Like "*" & CONFIG_FILE_ROOT_PATH Then
                    ' 設定ファイルのルートフォルダまで来たので終了
                    Exit For
                End If
            Next
            
            If Not fso.FileExists(w) Then
                ' デフォルト設定ファイルもなし
                GoTo FinallyHandler
            End If
        End If
        ' -- MODIFY BY KAWANA デフォルト設定ファイルを親フォルダまでたどるように修正 2018.03.01 [E]

        Set wb = Workbooks.Open(w, False, True)
        wb.Windows(wb.name).Visible = False
    End If

    Dim ws As Worksheet
    Set ws = wb.Worksheets(CONFIG_SHEET_NAME)

    Dim sRg As Range
    Set sRg = ws.Cells(CONFIG_START_ROW, CONFIG_START_COL)

    Dim eRg As Range
    Set eRg = ws.Cells(ws.rows.count, CONFIG_START_COL).End(xlUp)

    Dim rg As Range

    If sRg.row <= eRg.row Then
        For Each rg In ws.Range(sRg, eRg)
            If rg.value <> "" Then
                Dim isFound As Boolean
                isFound = config.Exists(rg.value)
                If Not isFound Or (isFound And rg.Offset(0, 1).value <> "") Then
                    config(rg.value) = rg.Offset(0, 1).value
                End If
            End If
        Next
    End If

    If Not isOpen Then
        wb.Close (False)
    End If

    Set GetConfig = config
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function IsArrayEx(ByVal ary As Variant) As Boolean
    On Error GoTo ErrorHandler

    If IsArray(ary) Then
        If UBound(ary) >= 0 Then
            IsArrayEx = True
        End If
    End If

ErrorHandler:
    '何もしない

End Function

Public Function StrCount(ByVal source As String, ByVal target As String) As Long
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Dim n As Long, cnt As Long
    Do
        n = InStr(n + 1, source, target)
        If n = 0 Then
            Exit Do
        Else
            cnt = cnt + 1
        End If
    Loop
    StrCount = cnt

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Function

Public Sub CheckParentFolder(ByVal targetFolder As String, Optional ByVal isFile As Boolean = False)
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    
    Dim fso As New FileSystemObject

    Dim parentFolder As String
    parentFolder = fso.GetParentFolderName(targetFolder)

    If Not fso.FolderExists(parentFolder) Then
        Call CheckParentFolder(parentFolder, False)
    End If

    If Not isFile And Not fso.FileExists(targetFolder) And Not fso.FolderExists(targetFolder) Then
        fso.CreateFolder targetFolder
    End If

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Sub

Public Function getFileList(ByVal path As String) As Collection

    Dim fso As FileSystemObject
    Set fso = New FileSystemObject

    Dim ado As Object
    Set ado = CreateObject("ADODB.Recordset")

    '引数１：物理名
    '引数２：データ型（200:VarChar）
    '引数３：サイズ（300:300バイトの可変長文字列）
    '引数４：オプション（32:NULL許容）
    ado.Fields.Append "FILE_NAME", 200, 300, 32
    ado.Open

    Dim file As Variant
    For Each file In fso.GetFolder(path).files

        file = fso.GetBaseName(file)

        '制御ファイルは対象外
        If Len(file) < 3 Or Left(file, 2) <> "~$" Then
            ado.AddNew
            ado.Fields(0) = file
            ado.Update
        End If

    Next

    Dim list As Collection
    Set list = New Collection

    ado.Sort = "FILE_NAME ASC"
    '2016/08/01 UPD START
    'ado.MoveFirst
    If ado.EOF = True Or ado.RecordCount = 0 Then
    Else
        ado.MoveFirst
    End If
    '2016/08/01 UPD END

    Do Until ado.EOF
        list.Add ado.Fields(0).value
        ado.MoveNext
    Loop

    ado.Close
    Set ado = Nothing

    Set getFileList = list
End Function

Public Function getFolderList(ByVal path As String) As Collection

    Dim fso As FileSystemObject
    Set fso = New FileSystemObject

    Dim ado As Object
    Set ado = CreateObject("ADODB.Recordset")

    '引数１：物理名
    '引数２：データ型（200:VarChar）
    '引数３：サイズ（300:300バイトの可変長文字列）
    '引数４：オプション（32:NULL許容）
    ado.Fields.Append "FILE_NAME", 200, 300, 32
    ado.Open

    Dim folder As Variant
    For Each folder In fso.GetFolder(path).subFolders

        folder = fso.GetBaseName(folder)

        '制御ファイルは対象外
        If Len(folder) < 3 Or Left(folder, 2) <> "~$" Then
            ado.AddNew
            ado.Fields(0) = folder
            ado.Update
        End If

    Next

    Dim list As Collection
    Set list = New Collection

    ado.Sort = "FILE_NAME ASC"
    '2016/08/01 UPD START
    'ado.MoveFirst
    If ado.EOF = True Or ado.RecordCount = 0 Then
    Else
        ado.MoveFirst
    End If
    '2016/08/01 UPD END

    Do Until ado.EOF
        list.Add ado.Fields(0).value
        ado.MoveNext
    Loop

    ado.Close
    Set ado = Nothing

    Set getFolderList = list
End Function
'ADD BY YC_LI AT 2016/08/08 [S]
    Public Function createMultiLevelFolder(ByVal path As String) As Boolean
    On Error GoTo errHandler
    Dim index As Integer, tempPath As String
    createMultiLevelFolder = False
    If Len(Trim(path)) = 0 Then
        Exit Function
    End If
    index = InStr(1, path, "\")
    Do While index > 0
        tempPath = Left(path, index)
        If tempPath = "\\" Then
            index = InStr(index + 1, path, "\")
        Else
            If Dir(tempPath, vbDirectory) = "" Then
                MkDir tempPath
            End If
        End If
        index = InStr(index + 1, path, "\")
    Loop
    createMultiLevelFolder = True
errHandler:
    If Err.Number Then
        'MsgBox "Create Dir:" & path & "Failed " & Err.Description, vbInformation, "Error"
        MsgBox "フォルダー生成が失敗しました。(パス：" & path & ")（エラー：" & Err.Description & "）"
        createMultiLevelFolder = False
        Resume Next
    End If
End Function
'ADD BY YC_LI AT 2016/08/08 [E]
