Attribute VB_Name = "JavaConstOutput"
Option Explicit

Private Const DEFAULT_CHAR_SET As String = "UTF-8"
' javaファイル直接書込対応 2017.08.03 kawana Start
Private Const BOM_FLG As Integer = 1
' javaファイル直接書込対応 2017.08.03 kawana End
Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"

'Add By NingQi At 2016/08/05 <S>
Private Const CONFIG_DATA_OUTPUT_FOLDER As String = "DataOutputFolder"
Private Const CONFIG_CREATE_FILE As String = "CreateFile"
Private Const CONFIG_MESSAGE_CD_COLUMN As String = "MessageCd"
Private Const CONFIG_MESSAGE_NM_COLUMN As String = "MessageNm"
'Add By NingQi At 2016/08/05 <E>
' javaファイル直接書込対応 2017.08.03 kawana Start
Private Const CONFIG_START_TEXT As String = "StartText"
Private Const CONFIG_END_TEXT As String = "EndText"
' javaファイル直接書込対応 2017.08.03 kawana End

Private m_as As ADODB.Stream
Private m_filePath As String
Private m_sb As StringBuilder


Function EmptyArr(ByRef x() As String) As Boolean
Dim tempStr As String
tempStr = Join(x, ",")
EmptyArr = LenB(tempStr) <= 0
End Function
'Add By NingQi At 2016/08/05 <S>
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'Public Sub CreateConstTxt(ByVal tsvNm As String, ByVal configFileNm As String)
Public Sub CreateConstTxt(ByVal tsvNm As String, ByVal configFileNm As String, Optional ByVal isSuppressNormalEndMsgBox As String = "0")
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [e]
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim config As Dictionary
    Dim strCsvFiles As String
    Dim inputFloder As String
    Dim outputFloder As String
    Dim outputFile As String
    Dim messageCdColumn As String
    Dim messageNmColumn As String
    Dim createFile  As String
    ' 開始行、終了行
    Dim rowStart, rowLast As Integer
    
    'Get Config File
    Set config = Common.GetConfig(DataManageTool.configPath, configFileNm)
    
    Dim conFilePath As String
    conFilePath = DataManageTool.configPath & "\" & configFileNm & DataManageTool.XLSX_FILE_EXT
    If Dir(conFilePath) = "" Then
        MsgBox ("設定ファイルが存在しません(" & conFilePath & ")。")
        GoTo FinallyHandler
        Exit Sub
    End If
    
    'Configuration Information
    outputFloder = config(CONFIG_DATA_OUTPUT_FOLDER)
    inputFloder = config(CONFIG_DATA_INPUT_FOLDER)
    rowStart = config(CONFIG_DATA_INPUT_READ_START_ROW)
    createFile = config(CONFIG_CREATE_FILE)
    messageCdColumn = config(CONFIG_MESSAGE_CD_COLUMN)
    messageNmColumn = config(CONFIG_MESSAGE_NM_COLUMN)
    If rowStart = vbNullString Then
       rowStart = 2
    End If
    
    If inputFloder = "" Or IsNull(inputFloder) Then
        GoTo FinallyHandler
    End If
    
    Dim tsvFolder As String
    tsvFolder = DataManageTool.TsvPath & "\" & tsvNm & "\" & inputFloder
 
    Dim myFile As String
   
    Dim num As Integer
    myFile = Dir(tsvFolder & "\" & "*.tsv")
    Dim TsvFiles() As String

    Do While myFile <> ""
        If num = 0 Then
            ReDim Preserve TsvFiles(num)
            TsvFiles(num) = myFile
        End If
        myFile = Dir
        If myFile = "" Then
            Exit Do
        End If
        num = num + 1
        ReDim Preserve TsvFiles(num)
    
        TsvFiles(num) = myFile
    Loop

    'メイン処理
    Dim isFound As Boolean
    Dim n As Integer
    Dim messageCd, messageNm, systemType, snakeMessageCd As String
                
    Dim commentStr, mainStr As String
    
    Dim outputStr As String
    outputStr = ""
    
    Dim COMMENT_STR, MAIN_STR As String
        
    COMMENT_STR = _
    vbTab + "/** (((comment))) */" + vbCrLf
    
    MAIN_STR = _
    vbTab + "public static final String (((variable))) = ""(((messageCd)))"";" ' + vbCrLf
    
    'Create Output Folder
    Dim outFileFolder, outFileNm, outFilePath As String
    'default path
    If outputFloder = "" Or IsNull(outputFloder) Then
        outFileFolder = DataManageTool.RootPath
    Else
    'config path
        outFileFolder = DataManageTool.RootPath & "\" & outputFloder
    End If
    
    outFilePath = outFileFolder & "\" & createFile
    
    If Dir(outFileFolder, vbDirectory) = vbNullString Then
        Dim b As Boolean
        b = Common.createMultiLevelFolder(outFilePath)
        If Not b Then
            'MsgBox "Create Folder Failed!"
            MsgBox "出力のフォルダー生成が失敗しました。(パス：" & outFilePath & ")"
            GoTo FinallyHandler
        End If
     Else
        Dim findFile As String
        findFile = Dir(outFilePath, vbNormal)
        Do While findFile <> ""
            Kill outFilePath
            findFile = Dir
        Loop
    End If
    
    Dim tsvFile As String
    'Dim m As Integer
    Dim outputAllstr, tempStr As String
    outputAllstr = ""
    tempStr = ""
    
    If EmptyArr(TsvFiles()) Then
        MsgBox ("参照TSVファイルが存在しません。")
        GoTo FinallyHandler
        Exit Sub
    End If
    
' javaファイル直接書込対応 2017.08.03 kawana Start
'    Dim startText As String
'    startText = Replace(config(CONFIG_START_TEXT), vbLf, vbCrLf)
'
'    'Write to file
'    Open outFilePath For Append As #1
'    Print #1, (startText + vbCrLf)
'    Close
' javaファイル直接書込対応 2017.08.03 kawana End
    
    For n = LBound(TsvFiles) To UBound(TsvFiles)
        tsvFile = tsvFolder & "\" & TsvFiles(n)
        
        If Dir(tsvFile) = "" Then
           MsgBox ("参照TSVファイルが存在しません(" & tsvFile & ")。")
           GoTo FinallyHandler
           Exit Sub
        End If
        
        Dim file As New FileInputCtrl
        isFound = file.OpenFile(tsvFile)
    
        If Not isFound Then
            GoTo FinallyHandler
        End If
        
        Dim data As Variant
        Dim rowCount As Long
    
        Dim rowIndex As Long
        rowIndex = 0
    
        data = file.ReadFile
        
        'Tsv File Check
        If Left(UCase(data(rowStart - 1, CInt(messageCdColumn))), 10) <> "MESSAGE_CD" Or Left(UCase(data(rowStart - 1, CInt(messageNmColumn))), 10) <> "MESSAGE_NM" Then
            'MsgBox "The input file format is incorrect.  "
            MsgBox "参照TSVのフォーマットが不正です。"
            GoTo FinallyHandler 'FinallyHandler
        End If
        
        rowCount = UBound(data) - LBound(data) + 1
        
        Dim count, i As Integer
        count = 0
        
        rowLast = UBound(data) - LBound(data) + 1
        ' 最終行まで繰返
        For i = rowStart To rowLast
            '値の読込
            outputStr = ""
            messageCd = Trim(data(i, CInt(messageCdColumn)))
            messageNm = Trim(data(i, CInt(messageNmColumn)))
            'systemType = Trim(data(i, 3))
            snakeMessageCd = toSnakeCase(Trim(data(i, CInt(messageCdColumn))))
            
            If IsNull(messageCd) Or messageCd = "" Then
                GoTo FinallyHandler
            End If
            
            'If systemType = "base" Then
            commentStr = COMMENT_STR
            mainStr = MAIN_STR
            
            commentStr = Replace(commentStr, "(((comment)))", messageNm)
            mainStr = Replace(mainStr, "(((variable)))", snakeMessageCd)
            mainStr = Replace(mainStr, "(((messageCd)))", messageCd)
            
            outputStr = outputStr + commentStr + mainStr
            
            count = count + 1
            
            outputAllstr = outputAllstr + outputStr + vbCrLf
            
            'Write to file
            'Open outFilePath For Append As #1
            'Print #1, outputStr
            'Close
            'End if
        Next i
    Next
    
' javaファイル直接書込対応 2017.08.03 kawana Start
    Dim startText, endText As String
    startText = Replace(config(CONFIG_START_TEXT), vbLf, vbCrLf)
    endText = Replace(config(CONFIG_END_TEXT), vbLf, vbCrLf)
    
    'Write to file
'    Open outFilePath For Append As #1
'    Print #1, (vbCrLf + endText)
'    Close
    
    Set m_as = New ADODB.Stream
    m_as.Type = adTypeText
    m_as.Charset = DEFAULT_CHAR_SET
    m_as.LineSeparator = adCRLF
    m_as.Open
             
    outputAllstr = startText + vbCrLf + vbCrLf + outputAllstr + vbCrLf + endText

    Call m_as.WriteText(outputAllstr, adWriteChar)
    
    If DEFAULT_CHAR_SET = "UTF-8" And BOM_FLG = 1 Then
    
'       BOM削除
        m_as.Position = 0
        m_as.Type = adTypeBinary
        m_as.Position = 3

        Dim byteData() As Byte
        byteData = m_as.Read

        m_as.Close

        m_as.Open
        m_as.Write byteData
        

        'ファイル保存
        Call m_as.SaveToFile(outFilePath, adSaveCreateOverWrite)
    Else
        'ファイル保存
        Call m_as.SaveToFile(outFilePath, adSaveCreateOverWrite)
    End If
    
    m_as.Close
    
' javaファイル直接書込対応 2017.08.03 kawana End
    
    
'#19804 バッチ起動処理を追加 2022/05/06 yu-fujii [s]
'    MsgBox "メッセージConst生成が正常終了しました。"
    If isSuppressNormalEndMsgBox = "0" Then
    MsgBox "メッセージConst生成が正常終了しました。"
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

' ----------------------------------------------
' 文字列をスネークケースへ変換
' ----------------------------------------------
Function toSnakeCase(ByVal str) As String
    
    str = Replace(str, "A", "_A")
    str = Replace(str, "B", "_B")
    str = Replace(str, "C", "_C")
    str = Replace(str, "D", "_D")
    str = Replace(str, "E", "_E")
    str = Replace(str, "F", "_F")
    str = Replace(str, "G", "_G")
    str = Replace(str, "H", "_H")
    str = Replace(str, "I", "_I")
    str = Replace(str, "J", "_J")
    str = Replace(str, "K", "_K")
    str = Replace(str, "L", "_L")
    str = Replace(str, "M", "_M")
    str = Replace(str, "N", "_N")
    str = Replace(str, "O", "_O")
    str = Replace(str, "P", "_P")
    str = Replace(str, "Q", "_Q")
    str = Replace(str, "R", "_R")
    str = Replace(str, "S", "_S")
    str = Replace(str, "T", "_T")
    str = Replace(str, "U", "_U")
    str = Replace(str, "V", "_V")
    str = Replace(str, "W", "_W")
    str = Replace(str, "X", "_X")
    str = Replace(str, "Y", "_Y")
    str = Replace(str, "Z", "_Z")
    
    str = Replace(str, "__", "_")
    
    Dim fisrtStr
    fisrtStr = Left(str, 1)
    
    If fisrtStr = "_" Then
        str = Mid(str, 2)
    End If
    
    str = StrConv(str, vbUpperCase)
    
    toSnakeCase = str

End Function

'Add By NingQi At 2016/08/05 <E>

