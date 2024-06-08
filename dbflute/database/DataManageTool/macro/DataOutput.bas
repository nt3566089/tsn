Attribute VB_Name = "DataOutput"
Option Explicit

Public Const COMMON_DATA_OUTPUT_FOLDER As String = "DataOutputFolder"
Public Const COMMON_DATA_OUTPUT_ENCODE As String = "DataOutputEncode"

Public Const CONFIG_DATA_INPUT_FOLDER As String = "DataInputFolder"
Public Const CONFIG_NUMBERING_COLUMNS As String = "NumberingColumns"
Public Const CONFIG_SPREAD_COLUMNS As String = "SpreadColumns"
Public Const CONFIG_VERTICAL_SPREAD_COLUMNS As String = "VerticalSpreadColumns"
Public Const CONFIG_DATA_INPUT_READ_TITLE_ROW As String = "DataInputReadTitleRow"
Public Const CONFIG_DATA_INPUT_READ_START_ROW As String = "DataInputReadStartRow"
Public Const CONFIG_DATA_OUTPUT_COLUMNS As String = "DataOutputColumns"
Public Const CONFIG_DATA_OUTPUT_CHANGE_COLUMNS As String = "DataOutputChangeColumns"
Public Const CONFIG_DATA_OUTPUT_CHANGE_KEY_NO_FOUND As String = "DataOutputChangeKeyNoFoundStop"
Public Const CONFIG_DATA_OUTPUT_UNIQUE_COLUMNS As String = "DataOutputUniqueColumns"
Public Const CONFIG_DATA_OUTPUT_SPREAD_COLUMNS As String = "DataOutputSpreadColumns"
Public Const CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS As String = "DataOutputVerticalSpreadColumns"
Public Const CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS As String = "DataOutputNullSkipColumns"
Public Const CONFIG_DATA_CONVERT_ID As String = "ConvertId"

Public Const DATA_OUTPUT_COLUMNS As String = "INCREMENT"
'ADD BY YC_LI AT 2016/09/01 [S]
Public Const NULL_SKIP_COLUMNS As String = "NullSkipColumns"
'ADD BY YC_LI AT 2016/09/01 [E]
'Add By NingQi At 2016/08/05 <S>
Public Const MANAGE_FLODER As String = "InitializeFolder"
Public Const MANAGE_COPY_COLUMNS As String = "InitializeCopyColumns"
Public Const MANAGE_SPREAD_COLUMNS As String = "InitializeSpreadColumns"
Public Const MANAGE_UNIQUE_COLUMNS As String = "InitializeUniqueColumns"
Public Const MANAGE_NULL_SKIP_COLUMNS As String = "InitializeNullSkipColumns"
Public Const MANAGE_READ_TITLE_ROW As String = "InitializeReadTitleRow"
Public Const MANAGE_READ_START_ROW As String = "InitializeReadStartRow"
'Add By NingQi At 2016/08/05 <E>

'ADD [#7195] マニュアル作成のため、CONFIG用Excelにパラメータを追加 2020.03.03 TANAKA[S]
Public Const CONFIG_MANUAL_OUTPUT_PATH As String = "ManualOutputPath"
'ADD [#7195] マニュアル作成のため、CONFIG用Excelにパラメータを追加 2020.03.03 TANAKA[E]

Public Const DBFLUTE_DFPROP_OUTPUT As String = "DBFluteDfpropOutput"

'ADD BY SJA_YIN AT 2016/12/14 [S]
Public Const ITEM_DOC_OUTPUT As String = "ItemDocOutput"
'ADD BY SJA_YIN AT 2016/12/14 [E]

Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"
Private Const BULK_COUNT As Long = 100
Private Const COLUMN_COUNT As Long = 2

Private Const DEFAULT_CHAR_SET1 As String = "UTF-8 (Non BOM)"
Private Const DEFAULT_CHAR_SET2 As String = "UTF-8"
Private Const DEFAULT_CHAR_SET3 As String = "Shift_JIS"

Private m_as As ADODB.Stream
Private m_sb() As StringBuilder
Private crementI As Long
'2017/12/08 ADD START
Private primaryI As Long
'2017/12/08 ADD END

Private inConfigName As String

Private data As Variant

Private cacheIds As Object

'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'Public Sub CreateDBFlute(ByVal intType As String)
Public Sub CreateDBFlute(ByVal intType As String, Optional ByVal isSuppressNormalEndMsgBox As String = "0")
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    
    'Dim output As New DBFluteDfpropOutput
    Dim conFilePath As String
    conFilePath = DataManageTool.configPath & "\" & DataOutput.DBFLUTE_DFPROP_OUTPUT & DataManageTool.XLSX_FILE_EXT
    If Dir(conFilePath) = "" Then
        MsgBox ("設定ファイルが存在しません(" & conFilePath & ")。")
        GoTo FinallyHandler
        Exit Sub
    End If
    
    Set config(0) = Common.GetConfig(DataManageTool.configPath, DataOutput.DBFLUTE_DFPROP_OUTPUT)
    Dim ListDataInputFolder, ClassInputFolder
    ListDataInputFolder = config(0)(DataManageTool.LIST_DATE_INPUT_FOLDER)
    ClassInputFolder = config(0)(DataManageTool.CLASS_INPUT_FOLDER)
    
    'ADD BY LYC AT 2016/11/29 [S]
    Dim CIFFlg As Boolean
    Dim arrClassInputFolder() As String
    Dim arrLenth
    CIFFlg = False
    
    If ClassInputFolder = "" Then
       CIFFlg = True
    End If
    If Not CIFFlg Then
       arrClassInputFolder() = Split(ClassInputFolder, ",")
       Dim tsvFolder As String
       Dim tsvFile As String
       For arrLenth = LBound(arrClassInputFolder) To UBound(arrClassInputFolder)
          tsvFolder = DataManageTool.TsvPath & "\" & arrClassInputFolder(arrLenth)
          tsvFile = tsvFolder & "\" & arrClassInputFolder(arrLenth) & DataManageTool.TSV_FILE_EXT
          If Dir(tsvFile) = "" Then
             MsgBox ("参照TSVファイルが存在しません(" & tsvFile & ")。")
             GoTo FinallyHandler
             Exit Sub
          End If
       Next
    End If
    'ADD BY LYC AT 2016/11/29 [E]
'    Dim tsvFolder As String
'    tsvFolder = DataManageTool.TsvPath & "\" & ClassInputFolder
'    Dim tsvFile As String
'    tsvFile = tsvFolder & "\" & ClassInputFolder & DataManageTool.TSV_FILE_EXT         '一時使用
    Dim tsvFolder2 As String
    tsvFolder2 = DataManageTool.TsvPath & "\" & ListDataInputFolder
    Dim tsvFile2 As String
    tsvFile2 = tsvFolder2 & "\" & ListDataInputFolder & DataManageTool.TSV_FILE_EXT         '一時使用
    
'    If Dir(tsvFile) = "" Then
'        MsgBox ("参照TSVファイルが存在しません(" & tsvFile & ")。")
'        GoTo FinallyHandler
'        Exit Sub
'    End If
     If Dir(tsvFile2) = "" Then
        MsgBox ("参照TSVファイルが存在しません(" & tsvFile2 & ")。")
        GoTo FinallyHandler
        Exit Sub
    End If
    
    'TSV作成 DataOutput
     Call DBFluteDfpropOutput.create_def_map("class", DataOutput.DBFLUTE_DFPROP_OUTPUT)
     Call DBFluteDfpropOutput.create_deploy_map("DBFluteDfpropOutput", DataOutput.DBFLUTE_DFPROP_OUTPUT)
     Call DBFluteDfpropOutput.create_fk_map("DBFluteDfpropOutput", DataOutput.DBFLUTE_DFPROP_OUTPUT)
     
      
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
    'MsgBox "Dfprop生成が正常終了しました。"
    If isSuppressNormalEndMsgBox = "0" Then
     MsgBox "Dfprop生成が正常終了しました。"
    End If
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'Public Sub CreateConstTxt()
Public Sub CreateConstTxt(Optional ByVal isSuppressNormalEndMsgBox As String = "0")
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]
    
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    'Dim output As New FileOutputCtrl
    
    'TSV作成 DataOutput
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
    'Call JavaConstOutput.CreateConstTxt("message", "JavaConstOutput")
    Call JavaConstOutput.CreateConstTxt("message", "JavaConstOutput", isSuppressNormalEndMsgBox)
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'ADD BY NINGQI AT 2016/0/06 [S]
'Public Sub createAllTsv(ByVal name As String)
Public Sub createAllTsv(ByVal name As String, Optional ByVal isSuppressNormalEndMsgBox As String = "0")
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]

    Application.ScreenUpdating = False
    Debug.Print "Debug Info--Start CreateAllTsv-----" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
    Dim errFlag As Boolean
    Dim title As Variant
    Dim list As Collection
    Set list = Common.getFileList(DataManageTool.configPath & "\" & DataManageTool.OUTPUT_FILE_PATH)
    
    If cacheIds Is Nothing Then
        Set cacheIds = CreateObject("Scripting.Dictionary")
    End If
    cacheIds.RemoveAll

    For Each title In list
        errFlag = False
        Call CreateTsv(title, errFlag, False)
        If errFlag = False Then
            'MsgBox "Create Tsv File:[" & title & "] falied!"
             MsgBox "TSVファイル生成が失敗しました。(ファイル：" & title & ")"
            Exit For
        End If
    Next
    Application.ScreenUpdating = True
    If errFlag = True Then
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'       MsgBox "TSV出力が正常終了しました。"
        If isSuppressNormalEndMsgBox = "0" Then
       MsgBox "TSV出力が正常終了しました。"
    End If
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]
    End If
    Debug.Print "Debug Info--End CreateAllTsv-----" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
End Sub
'ADD BY NINGQI AT 2016/09/06 [E]

'ADD BY SJA_YIN AT 2016/12/13 [S]
Public Sub CreateItemDoc(Optional ByVal outType As String = "")
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    '項目仕様自動出力
    Call ItemDocOutput.CreateItemDoc(outType)
    
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub
'ADD BY SJA_YIN AT 2016/12/13 [E]

Public Sub CreateTsv(ByVal target As String, Optional ByRef errFlag As Boolean = False, Optional ByRef showMsgFlag As Boolean = True)
    On Error GoTo ErrorHandler
    Application.ScreenUpdating = False
    Debug.Print "Debug Info--Start CreateTsv-----" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
    
    Dim ac As New AppCtrl
    ac.StartApp
    Dim commonConfig As Dictionary
    Set commonConfig = Common.GetConfig(DataManageTool.configPath, "DataManageTool")
    If commonConfig Is Nothing Then
        'MsgBox "Common configration file['DataManageTool.xlsx'] is not exists!"
        MsgBox "設定ファイルDataManageTool.xlsxが存在しません。"
        errFlag = False
        GoTo FinallyHandler
    End If
    
    If showMsgFlag Then
        If cacheIds Is Nothing Then
            Set cacheIds = CreateObject("Scripting.Dictionary")
        End If
        cacheIds.RemoveAll
    End If
    
    Dim tsvNm As String
    Dim i As Long
    Dim j As Long
    Dim m As Long
    Dim crementI As Long

    Dim m_sb As StringBuilder   '20160922
    
    Dim outputFile As String   '20160922
    Dim config As Dictionary   '20160922
    Dim strCsvFiles As String  '20160922
    crementI = 0
      
    strCsvFiles = target   '20160922

    Set config = Common.GetConfig(DataManageTool.configPath & "\" & DataManageTool.OUTPUT_FILE_PATH, strCsvFiles)
    If config Is Nothing Then
        MsgBox "設定ファイル" & DataManageTool.configPath & "\" & DataManageTool.OUTPUT_FILE_PATH & "\" & strCsvFiles & ".xlsx が存在しません。"
        errFlag = False
        GoTo FinallyHandler
    End If
    inConfigName = DataManageTool.configPath & "\" & DataManageTool.OUTPUT_FILE_PATH & "\" & strCsvFiles & ".xlsx"
      
    Dim startRow As Integer
    If config(CONFIG_DATA_INPUT_READ_START_ROW) = "" Then
        startRow = 2
    Else
        startRow = CInt(config(CONFIG_DATA_INPUT_READ_START_ROW))
    End If
     
    Dim titleRow As Integer
    If config(CONFIG_DATA_INPUT_READ_TITLE_ROW) = "" Then
        titleRow = 1
    Else
        titleRow = CInt(config(CONFIG_DATA_INPUT_READ_TITLE_ROW))
    End If
     
    'step--------------------------------
    Dim dataType As Integer
    Dim strColumns() As String
    Dim strSpreadColumns() As String
    Dim strVerSpreadColumns() As String
    Dim spreadFlag() As Boolean
    Dim verSpreadFlag() As Boolean
    
    Dim hasErr As Boolean
    dataType = getOutputColumnsType(config, strColumns, strSpreadColumns, strVerSpreadColumns, spreadFlag, verSpreadFlag, hasErr)
    If hasErr Then
        GoTo FinallyHandler
    End If
    
    Set m_sb = New StringBuilder
    Dim finalOutputFilePath, tempOutputFilePath As String
    Dim scount, tempCount As Integer
    
    finalOutputFilePath = commonConfig(COMMON_DATA_OUTPUT_FOLDER)
    scount = Common.StrCount(finalOutputFilePath, "..\")
    tempOutputFilePath = DataManageTool.RootPath
    For tempCount = 1 To scount
        tempOutputFilePath = Left(tempOutputFilePath, InStrRev(tempOutputFilePath, "\") - 1)
    Next
    finalOutputFilePath = Right(finalOutputFilePath, InStrRev(finalOutputFilePath, "\"))
    finalOutputFilePath = tempOutputFilePath & "\" & finalOutputFilePath
    If Dir(finalOutputFilePath, vbDirectory) = vbNullString Then
        Dim b As Boolean
        b = Common.createMultiLevelFolder(finalOutputFilePath & "\")
        If Not b Then
            MsgBox "出力のフォルダー生成が失敗しました。(パス：" & finalOutputFilePath & ")"
            errFlag = False
            GoTo FinallyHandler
        End If
    End If
    
    outputFile = finalOutputFilePath & "\" & strCsvFiles & DataManageTool.TSV_FILE_EXT

    'メイン処理
    Dim tsvFolder As String
    'ADD [#7195] マニュアル作成用に入力ファイル名がカンマで区切られると マニュアル入力対象 2020.03.03 TANAKA[S]
    Dim inputFolder As Variant
    inputFolder = Split(config(CONFIG_DATA_INPUT_FOLDER), ",")
    
    tsvFolder = DataManageTool.TsvPath & "\" & inputFolder(0)
    
    If UBound(inputFolder) = 1 Then
        Dim manualTsvFolder As String
        manualTsvFolder = DataManageTool.TsvPath & "\" & DataManageTool.MANUAL_TSV_FILE_PATH & "\" & inputFolder(0)
    End If
    
    tsvNm = inputFolder(0)
    'ADD [#7195] マニュアル作成用に入力ファイル名がカンマで区切られると マニュアル入力対象 2020.03.03 TANAKA[E]
    
    ''''''''''''''''''''''''''
    Debug.Print "Debug Info--Get Input Files<S>--" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
    
    Dim fileList As Collection
    Dim tsvFile As String
    Dim folders As Variant
    Dim files As Variant
    Dim list As Collection
    'Check add by ningqi at 20160830 <S>
    If Dir(tsvFolder, vbDirectory) = vbNullString Then
        MsgBox "フォルダ（" & tsvFolder & "）が存在しません。"
        errFlag = False
        GoTo FinallyHandler
    End If
    'Check add by ningqi at 20160830 <E>
     
    Set list = Common.getFolderList(tsvFolder)

    'Add by ningqi at 20160819<skipRowFlag>
    Dim skipRowFlag, findFileFlag As Boolean
    skipRowFlag = False
    findFileFlag = False
    
    Dim finalInputFiles As Collection
    Set finalInputFiles = New Collection
    Dim tempFile As Variant
    'Find all tsv file <S>
    If list.count <= 0 Then
        Set fileList = Common.getFileList(tsvFolder)
        For Each tempFile In fileList
            tsvFile = tsvFolder & "\" & tempFile & DataManageTool.TSV_FILE_EXT
            If Dir(tsvFile) <> "" Then
                finalInputFiles.Add tsvFile
            End If
        Next
    Else
        Set fileList = Common.getFileList(tsvFolder)
        For Each tempFile In fileList
            tsvFile = tsvFolder & "\" & tempFile & DataManageTool.TSV_FILE_EXT
            If Dir(tsvFile) <> "" Then
                finalInputFiles.Add tsvFile
            End If
        Next
        
        For Each folders In list
            Set fileList = Common.getFileList(tsvFolder & "\" & folders)
            For Each tempFile In fileList
                tsvFile = tsvFolder & "\" & folders & "\" & tempFile & DataManageTool.TSV_FILE_EXT
                If Dir(tsvFile) <> "" Then
                    finalInputFiles.Add tsvFile
                End If
            Next
        Next
    End If
    
    If finalInputFiles.count <= 0 Then
        MsgBox "参照TSVファイルが存在しません。(" & tsvFolder & ")"
        errFlag = False
        GoTo FinallyHandler
    End If
    'Find all tsv file <E>
    Debug.Print "Debug Info--Get Input Files<E>--" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
    
    For Each files In finalInputFiles
        Dim file As New FileInputCtrl
        Dim isFound As Boolean
        Dim data1 As Variant
        Dim rowCount As Long
        Dim rowIndex As Long
        Dim lineValue As String
        
        rowIndex = 0
        isFound = file.OpenFile(files)
        data = file.ReadFile

        Set m_as = New ADODB.Stream
        m_as.Type = adTypeText
        If commonConfig(COMMON_DATA_OUTPUT_ENCODE) = 3 Then
            m_as.Charset = DEFAULT_CHAR_SET3
        Else
            m_as.Charset = DEFAULT_CHAR_SET2
        End If
        
        m_as.LineSeparator = adCRLF
        m_as.Open
        
        '入力管理データをループする
        Debug.Print "Debug Info--Deal With Data<S>---" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
        Dim spreadCount As Integer
        Dim verSpreadCount As Integer
        If InStr(config(CONFIG_DATA_OUTPUT_COLUMNS), "<") > 0 Then
' -- MODIFY BY KAWANA 横展開の繰返数の計算ミスを修正 2017.02.22 [S]
            spreadCount = (UBound(data, 2) - (CInt(strSpreadColumns(0)) - 1)) / CInt(strSpreadColumns(1))
' -- MODIFY BY KAWANA 横展開の繰返数の計算ミスを修正 2017.02.22 [E]
        End If
        
        For i = titleRow To UBound(data, 1)
            lineValue = ""
            If i = titleRow And skipRowFlag Or (i > titleRow And i < startRow) Then
                GoTo skipCurrentRow
            End If
            
            If InStr(config(CONFIG_DATA_OUTPUT_COLUMNS), ">") <= 0 And InStr(config(CONFIG_DATA_OUTPUT_COLUMNS), "<") <= 0 Then
                If isColumnNullSkip(config, i, data1, 0) Then
                    GoTo skipCurrentRow
                End If
            End If
            
            If isUnqueSkip(config, i, data1) = False Then
                If dataType = 1 Or dataType = 3 Then
                    verSpreadCount = UBound(Split(data(i, strVerSpreadColumns(0)), ","))
                End If
                lineValue = getExpendValue(startRow, titleRow, strColumns, strSpreadColumns, strVerSpreadColumns, spreadCount, verSpreadCount, spreadFlag, verSpreadFlag, config, i, data1, tsvNm, hasErr)
                If hasErr = True Then
                    errFlag = False
                    GoTo FinallyHandler
                End If
                m_sb.Append (lineValue)
            End If
skipCurrentRow:
        Next i
        Debug.Print "Debug Info--Deal With Data<E>---" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
        skipRowFlag = True
    Next
    
   ' m_sb.Append (1)
    Dim sb_str As String

    If m_sb.Length > 0 Then
        sb_str = m_sb.ToString
        'sb_str = Replace(sb_str, Chr(34), Chr(34) & Chr(34))
        sb_str = Replace(sb_str, vbCrLf & vbCrLf, vbCrLf)
        'Call m_as.WriteText(m_sb(m).ToString, adWriteChar)
        Call m_as.WriteText(sb_str, adWriteChar)
    End If

    'ファイル保存
    If commonConfig(COMMON_DATA_OUTPUT_ENCODE) = 1 Then
        Call SaveToFile(sb_str, outputFile)
    Else
        Call m_as.SaveToFile(outputFile, adSaveCreateOverWrite)
    End If
          
    'クローズ
    file.CloseFile
    
    'ADD [#7195] マニュアル出力対象の場合はCOMMONだけでなくMANUALフォルダにも出力する 2020.03.03 TANAKA [S]
    '①マニュアル用のtsvを読込みオブジェクトへ設定
    '②設定用Excelの内容に従い、タイトル行と出力カラムをStringBuilderに追加
    '③tsvのデータを1行づつ読込みStringBuilderに追加していく
    '④ファイルを保存してオブジェクトをクローズ
    If UBound(inputFolder) = 1 Then

        skipRowFlag = False
        findFileFlag = False
    
        Set finalInputFiles = New Collection
        tsvFile = manualTsvFolder & "\" & inputFolder(0) & DataManageTool.TSV_FILE_EXT
        finalInputFiles.Add tsvFile
        
        finalOutputFilePath = config(CONFIG_MANUAL_OUTPUT_PATH)
        scount = Common.StrCount(finalOutputFilePath, "..\")
        tempOutputFilePath = DataManageTool.RootPath
        For tempCount = 1 To scount
            tempOutputFilePath = Left(tempOutputFilePath, InStrRev(tempOutputFilePath, "\") - 1)
        Next
        finalOutputFilePath = Right(finalOutputFilePath, InStrRev(finalOutputFilePath, "\"))
        finalOutputFilePath = tempOutputFilePath & "\" & finalOutputFilePath
        If Dir(finalOutputFilePath, vbDirectory) = vbNullString Then
            b = Common.createMultiLevelFolder(finalOutputFilePath & "\")
            If Not b Then
                MsgBox "出力のフォルダー生成が失敗しました。(パス：" & finalOutputFilePath & ")"
                errFlag = False
                GoTo FinallyHandler
            End If
        End If
        
        outputFile = finalOutputFilePath & "\" & strCsvFiles & DataManageTool.TSV_FILE_EXT
        
        Set m_sb = New StringBuilder
    
        For Each files In finalInputFiles
            Set file = New FileInputCtrl
            
            rowIndex = 0
            isFound = file.OpenFile(files)
            data = file.ReadFile
    
            Set m_as = New ADODB.Stream
            m_as.Type = adTypeText
            If commonConfig(COMMON_DATA_OUTPUT_ENCODE) = 3 Then
                m_as.Charset = DEFAULT_CHAR_SET3
            Else
                m_as.Charset = DEFAULT_CHAR_SET2
            End If
            
            m_as.LineSeparator = adCRLF
            m_as.Open
            
            '入力管理データをループする
            Debug.Print "Debug Info--Deal With Data<S>---" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
            If InStr(config(CONFIG_DATA_OUTPUT_COLUMNS), "<") > 0 Then
                spreadCount = (UBound(data, 2) - (CInt(strSpreadColumns(0)) - 1)) / CInt(strSpreadColumns(1))
            End If
            
            For i = titleRow To UBound(data, 1)
                lineValue = ""
                If i = titleRow And skipRowFlag Or (i > titleRow And i < startRow) Then
                    GoTo skipManualCurrentRow
                End If
                
                If InStr(config(CONFIG_DATA_OUTPUT_COLUMNS), ">") <= 0 And InStr(config(CONFIG_DATA_OUTPUT_COLUMNS), "<") <= 0 Then
                    If isColumnNullSkip(config, i, data1, 0) Then
                        GoTo skipManualCurrentRow
                    End If
                End If
                
                If isUnqueSkip(config, i, data1) = False Then
                    If dataType = 1 Or dataType = 3 Then
                        verSpreadCount = UBound(Split(data(i, strVerSpreadColumns(0)), ","))
                    End If
                    lineValue = getExpendValue(startRow, titleRow, strColumns, strSpreadColumns, strVerSpreadColumns, spreadCount, verSpreadCount, spreadFlag, verSpreadFlag, config, i, data1, tsvNm, hasErr)
                    If hasErr = True Then
                        errFlag = False
                        GoTo FinallyHandler
                    End If
                    m_sb.Append (lineValue)
                End If
skipManualCurrentRow:
            Next i
            Debug.Print "Debug Info--Deal With Data<E>---" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
            skipRowFlag = True
        Next
        
       ' m_sb.Append (1)
    
        If m_sb.Length > 0 Then
            sb_str = m_sb.ToString
            'sb_str = Replace(sb_str, Chr(34), Chr(34) & Chr(34))
            sb_str = Replace(sb_str, vbCrLf & vbCrLf, vbCrLf)
            'Call m_as.WriteText(m_sb(m).ToString, adWriteChar)
            Call m_as.WriteText(sb_str, adWriteChar)
        End If
    
        'ファイル保存
        If commonConfig(COMMON_DATA_OUTPUT_ENCODE) = 1 Then
            Call SaveToFile(sb_str, outputFile)
        Else
            Call m_as.SaveToFile(outputFile, adSaveCreateOverWrite)
        End If
    End If
    
    'ADD [#7195] マニュアル出力対象の場合はCOMMONだけでなくMANUALフォルダにも出力する 2020.03.03 TANAKA [E]
    
    Debug.Print "Debug Info--End CreateTsv-------" & Format(Date, "YYYY-MM-DD") & " " & Format(Time, "hh:mm:ss") & "." & Application.Text((Timer - Int(Timer)) * 1000, "000") & vbCrLf
    
    If showMsgFlag Then
        MsgBox "TSVデータ出力が正常終了しました。"
    End If
    errFlag = True
    Application.ScreenUpdating = True
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    file.CloseFile
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

Public Function isColumnNullSkip(ByVal config As Dictionary, ByVal i As String, ByVal data1 As Variant, ByVal plusNum As Integer) As Boolean
    Dim blnRet As Boolean
    Dim plusCount, temp As Integer
    Dim target() As String
    If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
        target() = Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")
        plusCount = target(1)
    Else
        plusCount = 0
    End If
    
    If Trim(config(CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS)) = "" Then
        'スキップ判定の列がない場合
        blnRet = False
    Else
        'スキップ判定の列があるけど、値がある場合.
        Dim k, j As Integer
        If InStr(config(CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS), ",") > 0 Or InStr(config(CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS), "-") > 0 Then
            blnRet = True
            Dim nullSkipCloumns() As String
            nullSkipCloumns = Split(config(CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS), ",")
            
            For k = 0 To UBound(nullSkipCloumns)
                If InStr(nullSkipCloumns(k), "-") > 0 Then
                    For j = CInt(Split(nullSkipCloumns(k), "-")(0)) To CInt(Split(nullSkipCloumns(k), "-")(1))
                        temp = j
                        If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
                            If isContainSpread(j, target) Then
                                temp = j + plusCount * plusNum
                            End If
                        End If
                        If Trim(data(i, temp) <> "") Then
                            isColumnNullSkip = False
                            Exit Function
                        End If
                    Next j
                Else
                    temp = nullSkipCloumns(k)
                    If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
                        If isContainSpread(nullSkipCloumns(k), target) Then
                            temp = nullSkipCloumns(k) + plusCount * plusNum
                        End If
                    End If
                    If Trim(data(i, temp)) <> "" Then
                        isColumnNullSkip = False
                        Exit Function
                    End If
                End If
            Next k
        Else
            temp = config(CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS)
            If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
                If isContainSpread(temp, target) Then
                    temp = config(CONFIG_DATA_OUTPUT_NULL_SKIP_COLUMNS) + plusCount * plusNum
                End If
            End If
            If Trim(data(i, temp) = "") Then
                blnRet = True
            Else
                blnRet = False
            End If
        End If
    End If
    
    isColumnNullSkip = blnRet
End Function


'Add By NingQi at 20160829<S>
Public Function isUnqueSkip(ByVal config As Dictionary, ByVal i As String, ByVal data1 As Variant) As Boolean
    Dim blnRet As Boolean
    blnRet = True
    Dim startRow As Integer
    If config(CONFIG_DATA_INPUT_READ_START_ROW) = "" Then
        startRow = 2
    Else
        startRow = CInt(config(CONFIG_DATA_INPUT_READ_START_ROW))
    End If
    
    If Trim(config(CONFIG_DATA_OUTPUT_UNIQUE_COLUMNS)) = "" Or i < startRow Then
        'スキップ判定の列がない場合
        blnRet = False
    Else
        'スキップ判定の列があるけど、値がある場合
        Dim uniques() As String
        uniques = Split(config(CONFIG_DATA_OUTPUT_UNIQUE_COLUMNS), ",")
        Dim k, j As Integer
        For k = LBound(uniques) To UBound(uniques)
           If InStr(uniques(k), "-") > 0 Then
               For j = CInt(Split(uniques(k), "-")(0)) To CInt(Split(uniques(k), "-")(1))
                   If Trim(data(i, j)) <> Trim(data(i - 1, j)) Then
                        isUnqueSkip = False
                        Exit Function
                    End If
               Next
           Else
               If Trim(data(i, uniques(k))) <> Trim(data(i - 1, uniques(k))) Then
                    isUnqueSkip = False
                    Exit Function
                End If
           End If
       Next
    End If
    
    isUnqueSkip = blnRet
End Function
'Add By NingQi at 20160829<E>

Public Function getExpendValue(ByVal startRow As String, ByVal titleRow As String, ByVal strColumns As Variant, ByVal strSpreadColumns As Variant, ByVal strVerSpreadColumns As Variant, ByVal spreadCount As Integer, ByVal verSpreadCount As Integer, ByVal spreadFlag As Variant, ByVal verSpreadFlag As Variant, ByVal config As Dictionary, ByVal rowNum As String, ByVal data1 As Variant, ByVal tsvNm As String, Optional ByRef hasErr As Boolean = False) As String
    Dim lineValue As String
    Dim strValue As String
    Dim v, s, m As Integer

    If spreadCount <= 0 Then
        spreadCount = 1
    End If
    If verSpreadCount <= 0 Then
        verSpreadCount = 0
    End If
    For s = 0 To spreadCount - 1
        If isColumnNullSkip(config, rowNum, data1, s) Then
            GoTo nextspreadforloop
        End If
        
        For v = 0 To verSpreadCount
            For m = LBound(strColumns) To UBound(strColumns)
                '2017/12/08 UPD START プライマリキーの自動採番対応
                'If InStr(strColumns(m), "-") > 0 Then
                If Mid(strColumns(m), 1, 1) Like "[a-zA-Z]" Or Mid(strColumns(m), 2, 1) Like "[a-zA-Z]" Then
                    'プライマリキーの列対象（英字含む場合）
                    strValue = getValue(config, "4", CLng(startRow), rowNum, m, strColumns(m), data1, tsvNm, hasErr)
                    If lineValue = "" Then
                        lineValue = strValue
                    Else
                        lineValue = lineValue & vbTab & strValue
                    End If
                ElseIf InStr(strColumns(m), "-") > 0 Then
                '2017/12/08 UPD END
                    '数字範囲の列対象
                    strValue = getValue(config, "1", CLng(v), rowNum, s, strColumns(m), data1, tsvNm, hasErr)
                    If lineValue = "" Then
                        lineValue = strValue
                    Else
                        lineValue = lineValue & vbTab & strValue
                    End If
                Else
                    If IsNumeric(strColumns(m)) Then
                        '単一数字の場合、普通の列対象
                        Dim temp As Integer
                        If spreadFlag(m) Then
                            temp = strColumns(m) + CLng(s * strSpreadColumns(1))
                        Else
                            temp = strColumns(m)
                        End If
                       
                        strValue = getValue(config, "2", CLng(startRow), rowNum, v, CLng(temp), data1, tsvNm, hasErr)
                        If lineValue = "" Then
                            lineValue = strValue
                        Else
                            lineValue = lineValue & vbTab & strValue
                        End If
                    Else
                        '縦展開 And 横展開
                        If spreadFlag(m) And verSpreadFlag(m) Then
                            strValue = getValue(config, "3", CLng(v), rowNum, CLng(s * strSpreadColumns(1)), strColumns(m), data1, tsvNm, hasErr)
                        '縦展開
                        ElseIf verSpreadFlag(m) Then
                            strValue = getValue(config, "3", CLng(startRow), rowNum, v, strColumns(m), data1, tsvNm, hasErr)
                        '横展開
                        ElseIf spreadFlag(m) Then
                            strValue = getValue(config, "3", CLng(startRow), rowNum, CLng(s * strSpreadColumns(1)), strColumns(m), data1, tsvNm, hasErr)
                        Else
                            strValue = getValue(config, "3", CLng(startRow), rowNum, m, strColumns(m), data1, tsvNm, hasErr)
                        End If
                        
                        If lineValue = "" Then
                            lineValue = strValue
                        Else
                            lineValue = lineValue & vbTab & strValue
                        End If
                    End If
                End If
            Next m
            lineValue = lineValue & vbCrLf
            lineValue = Replace(lineValue, vbCrLf & vbTab, vbCrLf)
        Next v

        If rowNum = titleRow Then
            Exit For
        End If
nextspreadforloop:
    Next s
    
    getExpendValue = Replace(lineValue, vbCrLf & vbTab, vbCrLf)
End Function


Public Function getValue(ByVal config As Dictionary, ByVal lnTpy As String, ByVal verNum As Long, ByVal row As Long, ByVal Col As Long, ByVal strColumns As String, ByVal data1 As Variant, ByVal target As String, Optional ByRef hasErr As Boolean = False) As String
    Dim startRow As String
    '### DataInputReadStartRow ###
    If config(CONFIG_DATA_INPUT_READ_START_ROW) = "" Then
       '未設定の場合は、ディフォルトは2行目から処理
        startRow = 2
    Else
        startRow = config(CONFIG_DATA_INPUT_READ_START_ROW)
    End If
     
    '### DataInputReadTitleRow ###
    Dim titleRow As String
    If config(CONFIG_DATA_INPUT_READ_TITLE_ROW) = "" Then
        titleRow = 1
    Else
        titleRow = config(CONFIG_DATA_INPUT_READ_TITLE_ROW)
    End If
    
    Dim strColumnsFromTo() As String
    Dim first As Boolean
    Dim j As Long

    If lnTpy = "1" Then
        '数字範囲の列対象
        ReDim Preserve strColumnsFromTo(1)
        strColumnsFromTo() = Split(strColumns, "-")

        first = True

        For j = strColumnsFromTo(0) To strColumnsFromTo(1)
            If first Then
                first = False
            Else
                getValue = getValue & vbTab
            End If

            If config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
                If Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")(0) = j And row >= CInt(startRow) Then
                    'getValue = getValue & Split(data(row, j), ",")(verNum)
                    'Add By NingQi At 2016.11.11
                    getValue = getValue & addChr34(Split(data(row, j), ",")(verNum))
                Else
                    'getValue = getValue & data(row, j)
                    'Add By NingQi At 2016.11.11
                    getValue = getValue & addChr34(data(row, j))
                End If
            ElseIf config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
                If isContainSpread(j, Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) Then
                    'getValue = getValue & (data(row, j + Col * CInt(Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")(1))))
                    'Add By NingQi At 2016.11.11
                    getValue = getValue & addChr34(data(row, j + Col * CInt(Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")(1))))
                End If
            Else
                'getValue = getValue & (data(row, j))
                'Add By NingQi At 2016.11.11
                getValue = getValue & addChr34(data(row, j))
            End If
        Next

    ElseIf lnTpy = "2" Then
        '単一数字の場合、普通の列対象
        If row < CInt(startRow) Then
            getValue = data(titleRow, strColumns)
            'Add By NingQi At 2016.11.11
            getValue = addChr34(getValue)
        Else
            '縦展開の列
            If config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
                If isContainVerSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")) Then
                    getValue = Split(data(row, strColumns), ",")(Col)
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                Else
                    getValue = data(row, strColumns)
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                End If
            Else
                getValue = data(row, strColumns)
                'Add By NingQi At 2016.11.11
                getValue = addChr34(getValue)
            End If
        End If

    ElseIf lnTpy = "3" Then
        '数字以外の場合、CDからID取得の対象
        If row < CInt(startRow) Then
            If InStr(strColumns, "#") > 0 Or InStr(strColumns, "<") > 0 Or InStr(strColumns, ">") > 0 Then
                If IsNumeric(Replace(Replace(Split(strColumns, "#")(0), "<", ""), ">", "")) Then
                    '数字 --> XXX_ID
                    getValue = replaceTo(data(row, Replace(Replace(Split(strColumns, "#")(0), "<", ""), ">", "")), InStr(strColumns, "#") > 0)
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                ElseIf InStr(strColumns, "|") > 0 Then
                    getValue = UCase(Replace(Replace(Replace(Replace(Split(strColumns, "#")(1), "[", ""), "]", ""), "<", ""), ">", ""))
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                Else
                    'XXX_NM --> XXX_ID
                    getValue = replaceTo(Split(strColumns, "#")(0), InStr(strColumns, "#") > 0)
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                End If
            Else
                getValue = replaceTo(Split(strColumns, "#")(0), InStr(strColumns, "#") > 0)
                'Add By NingQi At 2016.11.11
                getValue = addChr34(getValue)
            End If
        Else
            Dim zong() As String
            Dim zz As Integer
            Dim zNum As String
            Dim whereValue
            zNum = config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS)
           
            strColumns = Replace(Replace(Replace(Replace(strColumns, "[", ""), "]", ""), "<", ""), ">", "")
            zong = Split(Split(strColumns, "#")(0), "|")
            '横縦展開の列対象の有無判断
            If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" And config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
                If isContainSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) And isContainVerSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")) Then
                    For zz = LBound(zong) To UBound(zong)
                        If zong(zz) = CInt(zNum) Then
                            If whereValue = "" Then
                                whereValue = Split(data(row, zong(zz)), ",")(verNum)
                            Else
                                whereValue = whereValue & vbTab & Split(data(row, zong(zz)), ",")(verNum)
                            End If
                        ElseIf isContainSpread(zong(zz), Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) Then
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz) + Col)
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz) + Col)
                            End If
                        Else
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz))
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz))
                            End If
                        End If
                    Next
                    
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                ElseIf isContainVerSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")) Then
                    For zz = LBound(zong) To UBound(zong)
                        If zong(zz) = CInt(zNum) Then
                            If whereValue = "" Then
                                whereValue = Split(data(row, zong(zz)), ",")(Col)
                            Else
                                whereValue = whereValue & vbTab & Split(data(row, zong(zz)), ",")(Col)
                            End If
                        Else
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz))
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz))
                            End If
                        End If
                    Next
                    
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                ElseIf isContainSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) Then
                    For zz = LBound(zong) To UBound(zong)
                        If isContainSpread(zong(zz), Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) Then
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz) + Col)
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz) + Col)
                            End If
                        Else
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz))
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz))
                            End If
                        End If
                    Next
                
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                Else
                    For zz = LBound(zong) To UBound(zong)
                        If whereValue = "" Then
                            whereValue = data(row, zong(zz))
                        Else
                            whereValue = whereValue & vbTab & data(row, zong(zz))
                        End If
                    Next
                    
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                End If
            ElseIf config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
                If isContainVerSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")) Then
                    For zz = LBound(zong) To UBound(zong)
                        If zong(zz) = CInt(zNum) Then
                            If whereValue = "" Then
                                whereValue = Split(data(row, zong(zz)), ",")(Col)
                            Else
                                whereValue = whereValue & vbTab & Split(data(row, zong(zz)), ",")(Col)
                            End If
                        Else
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz))
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz))
                            End If
                        End If
                    Next
                    
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                Else
                    For zz = LBound(zong) To UBound(zong)
                        If whereValue = "" Then
                            whereValue = data(row, zong(zz))
                        Else
                            whereValue = whereValue & vbTab & data(row, zong(zz))
                        End If
                    Next
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                End If
            ElseIf config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
                If isContainSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) Then
                    For zz = LBound(zong) To UBound(zong)
                        If isContainSpread(zong(zz), Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")) Then
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz) + Col)
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz) + Col)
                            End If
                        Else
                            If whereValue = "" Then
                                whereValue = data(row, zong(zz))
                            Else
                                whereValue = whereValue & vbTab & data(row, zong(zz))
                            End If
                        End If
                    Next
                
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                Else
                    For zz = LBound(zong) To UBound(zong)
                        If whereValue = "" Then
                            whereValue = data(row, zong(zz))
                        Else
                            whereValue = whereValue & vbTab & data(row, zong(zz))
                        End If
                    Next
                    
                    If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                        'getValue = doGetId(target, strColumns, whereValue)
                        getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                    Else
                        getValue = whereValue
                        'Add By NingQi At 2016.11.11
                        getValue = addChr34(getValue)
                    End If
                End If
            Else
                For zz = LBound(zong) To UBound(zong)
                    If whereValue = "" Then
                        whereValue = data(row, zong(zz))
                    Else
                        whereValue = whereValue & vbTab & data(row, zong(zz))
                    End If
                Next
                
                If InStr(strColumns, "#") > 0 And whereValue <> "" Then
                    'getValue = doGetId(target, strColumns, whereValue)
                    getValue = doGetId(config, target, strColumns, whereValue, hasErr)
                Else
                    getValue = whereValue
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                End If
    
            End If
        End If
    '2017/12/08 ADD START プライマリキーの自動採番対応
    ElseIf lnTpy = "4" Then
        'プライマリキーの列対象（英字含む場合）
        If row < CInt(startRow) Then
            getValue = strColumns
            'Add By NingQi At 2016.11.11
            getValue = addChr34(getValue)
            primaryI = 0
        Else
            '縦展開の列
            If config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
                If isContainVerSpread(strColumns, Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")) Then
                    primaryI = primaryI + 1
                    getValue = primaryI
                    'getValue = Split(data(row, strColumns), ",")(Col)
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                Else
                    primaryI = primaryI + 1
                    getValue = primaryI
                    'getValue = data(row, strColumns)
                    'Add By NingQi At 2016.11.11
                    getValue = addChr34(getValue)
                End If
            Else
                primaryI = primaryI + 1
                getValue = primaryI
                'getValue = data(row, strColumns)
                'Add By NingQi At 2016.11.11
                getValue = addChr34(getValue)
            End If
        End If

    '2017/12/08 ADD END
    End If
End Function


Public Function replaceTo(ByVal str As String, ByVal flag As Boolean) As String
    replaceTo = str
    If flag Then
        If InStr(replaceTo, "_NM") > 0 Then
            replaceTo = Replace(replaceTo, "_NM", "_ID")
        End If
        
        If InStr(replaceTo, "_CD") > 0 Then
            replaceTo = Replace(replaceTo, "_CD", "_ID")
        End If
    End If
End Function

Public Function doGetId(ByVal config As Dictionary, ByVal target As String, ByVal strColumns As String, ByVal strCd As String, Optional ByRef errFlag As Boolean = False) As String
    On Error GoTo ErrorHandler
    
    Dim ac As New AppCtrl
    ac.StartApp
    
    'Add by NingQi at 20160912 <S>
    Dim outChangeKeys() As String
    Dim outChangeKeysNoFound() As String
    Dim errLoc As Integer
    Dim num As Integer
    
    If config(CONFIG_DATA_OUTPUT_CHANGE_COLUMNS) <> "" Then
        outChangeKeys = Split(config(CONFIG_DATA_OUTPUT_CHANGE_COLUMNS), ",")
        For num = LBound(outChangeKeys) To UBound(outChangeKeys)
            If outChangeKeys(num) = strColumns Then
                errLoc = num
                Exit For
            End If
        Next
    End If
    If config(CONFIG_DATA_OUTPUT_CHANGE_KEY_NO_FOUND) <> "" Then
        outChangeKeysNoFound = Split(config(CONFIG_DATA_OUTPUT_CHANGE_KEY_NO_FOUND), ",")
        For num = LBound(outChangeKeysNoFound) To UBound(outChangeKeysNoFound)
            If outChangeKeysNoFound(num) = "" Or (Not IsNumeric(outChangeKeysNoFound(num))) Then
                MsgBox "設定ファイルの項目DataOutputChangeKeyNoFoundStopが設定不正です（" & inConfigName & "）。"
                errFlag = True
                GoTo FinallyHandler
                Exit For
            End If
        Next
        
        If UBound(outChangeKeys) <> UBound(outChangeKeysNoFound) Then
            MsgBox "設定ファイルの項目DataOutputChangeKeyNoFoundStopが設定不正です（" & inConfigName & "）。"
            errFlag = True
            GoTo FinallyHandler
        End If
    End If
    'Add by NingQi at 20160912 <E>
    
    Dim strItems() As String
    Dim strWhere() As String
    Dim strFrom As String
    
    If InStr(strColumns, "#") > 0 Then
        strItems() = Split(strColumns, "#")
        
        strWhere() = Split(strItems(0), "|")

        If InStr(strItems(1), ".") > 0 Then
            strFrom = Split(Replace(Replace(strItems(1), "<", ""), ">", ""), ".")(0)
        Else
            strFrom = strItems(1)
        End If
        
        'doGetId = CStr(getIdByKey(target, strCd))
        'doGetId = CStr(getIdByKey(strFrom, strCd))
        doGetId = CStr(getIdByKey2(strFrom, strCd))
        If doGetId = 0 Then
            'Update by NingQi at 20160912 <S>
            If config(CONFIG_DATA_OUTPUT_CHANGE_KEY_NO_FOUND) <> "" Then
                If outChangeKeysNoFound(errLoc) = 0 Then
                    doGetId = ""
                Else
                    MsgBox "採番キー(" & strCd & ")がDB(" & strFrom & ")に存在しないので、処理を中止します。" & vbCrLf & "データの確認またDB作成してから再実行して ください｡"
                    errFlag = True
                    GoTo FinallyHandler
                End If
            Else
                MsgBox "採番キー(" & strCd & ")がDB(" & strFrom & ")に存在しないので、処理を中止します。" & vbCrLf & "データの確認またDB作成してから再実行して ください｡"
                errFlag = True
                GoTo FinallyHandler
            End If
            'Update by NingQi at 20160912 <E>
        End If
    ElseIf InStr(strColumns, DATA_OUTPUT_COLUMNS) > 0 Then
        ''横展開対象とする列番号は
        crementI = crementI + 1
        doGetId = crementI
    ElseIf InStr(strColumns, "<") > 0 Or InStr(strColumns, ">") > 0 Then
        doGetId = strCd
    Else
        '設定不正
    End If
    
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getIdByKey(ByVal target As String, ByVal strCd As String) As Long

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
        Exit Function
    End If
    
    If InStr(target, "-") > 0 Then
        dbFile = Split(target, "-")(1)
    Else
        dbFile = target
    End If

    'ファイル名取得
    dbFile = DataManageTool.dbPath & "\" & dbFile & ".db3"

    'DBファイルOpen
    ret = SQLite3Open(dbFile, connHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If
    
    Dim id As Long
    id = 0
    
    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "SELECT VALUE FROM KEY_VALUE WHERE KEY = ?", stmtHandle)
    If ret <> SQLITE_OK Then
        ret = SQLite3Finalize(stmtHandle)
       
    
        'DBファイルClose
        ret = SQLite3Close(connHandle)
       
        Exit Function
    End If
    
    ret = SQLite3BindText(stmtHandle, 1, strCd)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)

    'フェッチ
    If ret = SQLITE_ROW Then
        'Value = SQLite3ColumnInt32(stmtHandle, 0)
        getIdByKey = SQLite3ColumnInt32(stmtHandle, 0)
    End If

    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE Then
        Exit Function
    End If

    'SQL再利用
    ret = SQLite3Reset(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

    'バインド再利用
    ret = SQLite3ClearBindings(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If


    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

    'DBファイルClose
    ret = SQLite3Close(connHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

End Function

Public Function getIdByKey2(ByVal target As String, ByVal strCd As String) As Long

    Dim ret As Long
    Dim dbFile As String

    Dim key As String
    Dim value As Long

    If Not cacheIds.Exists(target) Then
        cacheIds.Add target, CreateObject("System.Collections.Hashtable")
    End If

    Dim objMap As Object
    Set objMap = cacheIds.item(target)
    If objMap.count() > 0 Then
        If objMap.ContainsKey(strCd) Then
            getIdByKey2 = objMap.item(strCd)
        End If
        Exit Function
    End If

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

    If InStr(target, "-") > 0 Then
        dbFile = Split(target, "-")(1)
    Else
        dbFile = target
    End If

    'ファイル名取得
    dbFile = DataManageTool.dbPath & "\" & dbFile & ".db3"

    'DBファイルOpen
    ret = SQLite3Open(dbFile, connHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

    'SQL解析
    ret = SQLite3PrepareV2(connHandle, "SELECT VALUE, KEY FROM KEY_VALUE", stmtHandle)
    If ret <> SQLITE_OK Then
        ret = SQLite3Finalize(stmtHandle)
        ret = SQLite3Close(connHandle)
        Exit Function
    End If

    'SQL実行
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_ROW And ret <> SQLITE_DONE Then
        ret = SQLite3Finalize(stmtHandle)
        ret = SQLite3Close(connHandle)
        Exit Function
    End If

    'フェッチ
    Do While ret = SQLITE_ROW
        value = SQLite3ColumnInt32(stmtHandle, 0)
        key = SQLite3ColumnText(stmtHandle, 1)
        objMap.Add key, value
        ret = SQLite3Step(stmtHandle)
    Loop

    If objMap.ContainsKey(strCd) Then
        getIdByKey2 = objMap.item(strCd)
    End If

    'SQL再利用
    ret = SQLite3Reset(stmtHandle)

    'バインド再利用
    ret = SQLite3ClearBindings(stmtHandle)

    'ステートメント破棄
    ret = SQLite3Finalize(stmtHandle)

    'DBファイルClose
    ret = SQLite3Close(connHandle)

End Function

'Add By NingQi At 20160825 <S>
Public Function isContainVerSpread(ByVal str As String, ByVal target As Variant) As Boolean
    Dim i, j As Integer
    Dim column() As String
    str = Replace(Replace(Replace(Replace(str, "[", ""), "]", ""), "<", ""), ">", "")
    column = Split(Split(str, "#")(0), "|")
    
    For j = LBound(column) To UBound(column)
        If column(j) = target(0) Then
            isContainVerSpread = True
            Exit Function
        End If
    Next
    
    isContainVerSpread = False
End Function

Public Function isContainSpread(ByVal str As String, ByVal target As Variant) As Boolean
    Dim i, j As Integer
    Dim column() As String
    str = Replace(Replace(Replace(Replace(str, "[", ""), "]", ""), "<", ""), ">", "")
    column = Split(Split(Replace(str, "", "["), "#")(0), "|")
    For i = CInt(target(0)) To CInt(target(0)) + CInt(target(1))
        For j = LBound(column) To UBound(column)
            If column(j) = i Then
                isContainSpread = True
                Exit Function
            End If
        Next
    Next
    isContainSpread = False
End Function
'Add By NingQi At 20160825 <E>

'Add By NingQi At 20160902 <E>
Sub SaveToFile(Content, FileName)
    Dim stm: Set stm = CreateObject("adodb.stream")
    stm.Type = 2
    stm.mode = 3
    stm.Charset = "utf-8"
    stm.Open
    stm.WriteText (Content)
    stm.Position = 3
    Dim newStream: Set newStream = CreateObject("adodb.stream")
    With newStream
        .mode = 3
        .Type = 1
        .Open
    End With
    stm.CopyTo (newStream)
    newStream.SaveToFile FileName, 2
    stm.Flush
    stm.Close
    Set stm = Nothing
    Set newStream = Nothing
End Sub
'Add By NingQi At 20160902 <E>

'Step
Public Function getOutputColumnsType(ByVal config As Dictionary, ByRef strColumns As Variant, ByRef strSpreadColumns As Variant, ByRef strVerSpreadColumns As Variant, ByRef spreadFlag As Variant, ByRef verSpreadFlag As Variant, Optional ByRef hasErr As Boolean = False) As Integer
    Dim charNum, m, outDataType As Integer
    charNum = 0
    Dim outputColumn As String
    
    If config(CONFIG_DATA_OUTPUT_COLUMNS) <> vbNullString Then
        outputColumn = config(CONFIG_DATA_OUTPUT_COLUMNS)
        strColumns = Split(outputColumn, ",")
    Else
       MsgBox ("TSV出力設定ファイルのDataOutputColumnsが設定不正です。")
       hasErr = True
       Exit Function
    End If
    
    For m = LBound(strColumns) To UBound(strColumns)
        strColumns(m) = Replace(Replace(Replace(Replace(strColumns(m), "[", ""), "]", ""), "<", ""), ">", "")
        '「*」の転換処理
        If Trim(strColumns(m)) = "*" Then
            charNum = charNum + 1
            If config(CONFIG_DATA_OUTPUT_CHANGE_COLUMNS) <> vbNullString Then
               strColumns(m) = Split(config(CONFIG_DATA_OUTPUT_CHANGE_COLUMNS), ",")(charNum - 1)
            Else
               MsgBox ("TSV出力設定ファイルのDataOutputChangeColumnsが設定不正です。")
               hasErr = True
               Exit Function
            End If
        End If
    Next
     
    If InStr(outputColumn, "<") > 0 And InStr(outputColumn, "[") > 0 Then
        If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" And config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
            strSpreadColumns = Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")
            strVerSpreadColumns = Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")
            
            outDataType = 1
        Else
            MsgBox ("TSV出力設定ファイルのDataOutputSpreadColumns,DataOutputVerticalSpreadColumnsが設定不正です。")
            hasErr = True
            Exit Function
        End If
    ElseIf InStr(outputColumn, "<") > 0 Then
        If config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS) <> "" Then
            strSpreadColumns = Split(config(CONFIG_DATA_OUTPUT_SPREAD_COLUMNS), ",")
            outDataType = 2
        Else
            MsgBox ("TSV出力設定ファイルのDataOutputSpreadColumnsが設定不正です。")
            hasErr = True
            Exit Function
        End If
    ElseIf InStr(outputColumn, "[") > 0 Then
        If config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS) <> "" Then
            strVerSpreadColumns = Split(config(CONFIG_DATA_OUTPUT_VERTICAL_SPREAD_COLUMNS), ",")
            outDataType = 3
        Else
            MsgBox ("TSV出力設定ファイルのDataOutputVerticalSpreadColumnsが設定不正です。")
            hasErr = True
            Exit Function
        End If
    Else
        outDataType = 0
    End If

    For m = LBound(strColumns) To UBound(strColumns)
        ReDim Preserve spreadFlag(m)
        ReDim Preserve verSpreadFlag(m)
        
        If outDataType = 1 Then
            If isContainSpread(strColumns(m), strSpreadColumns) Then
                spreadFlag(m) = True
            End If
            
            If isContainVerSpread(strColumns(m), strVerSpreadColumns) Then
                verSpreadFlag(m) = True
            End If
        ElseIf outDataType = 2 Then
            If isContainSpread(strColumns(m), strSpreadColumns) Then
                spreadFlag(m) = True
            End If
            verSpreadFlag(m) = False
        ElseIf outDataType = 3 Then
            spreadFlag(m) = False
            If isContainVerSpread(strColumns(m), strVerSpreadColumns) Then
                verSpreadFlag(m) = True
            End If
        End If
    Next
    
    getOutputColumnsType = outDataType
End Function

'Add By NingQi At 2016.11.11 <S>
Public Function addChr34(ByVal str As String) As String
   If InStr(str, Chr(34)) > 0 Then
       str = Replace(str, Chr(34), Chr(34) & Chr(34))
       str = Chr(34) & str & Chr(34)
   End If
   addChr34 = str
End Function
'Add By NingQi At 2016.11.11 <E>
