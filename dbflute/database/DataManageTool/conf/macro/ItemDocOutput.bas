Attribute VB_Name = "ItemDocOutput"
Option Explicit
Public Const CLASS_INPUT_LIMIT As String = "INPUT_LIMIT"
Public Const CLASS_EDITABLE As String = "EDITABLE"
Public Const CLASS_NECESSARY As String = "NECESSARY"

Public Const OUTPUT_ITEM_HEAD As String = "ヘッダ"
Public Const OUTPUT_ITEM_BODY As String = "明細"
Public Const OUTPUT_ITEM_FOOT As String = "フッタ"
Public Const OUTPUT_ITEM_SPAN As String = "凡例"
Public Const OUTPUT_BODY_SEL As String = "選択"

Private Const CONFIG_START_ROW As Integer = 2
Private Const CONFIG_START_COL As Integer = 1

Private Const CONFIG_FILE_EXT As String = ".xlsx"

Private Const OUTPUT_COPY_ROW As Integer = 4
Private Const OUTPUT_START_ROW As Integer = 5

Public Sub CreateItemDoc(ByVal outType As String)
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    'Get Config File
    Dim conFilePath As String
    conFilePath = DataManageTool.configPath & "\" & DataOutput.ITEM_DOC_OUTPUT & DataManageTool.XLSX_FILE_EXT
    If Dir(conFilePath) = "" Then
        MsgBox ("設定ファイルが存在しません(" & conFilePath & ")。")
        GoTo FinallyHandler
    End If
    Set config(0) = Common.GetConfig(DataManageTool.configPath, DataOutput.ITEM_DOC_OUTPUT)
    
    'Configuration Information
    Dim ItemDocOutputFolder, HtmlInputFolder, HtmlListInputFolder, LogOutputFolder As String
    Dim BaseHtmlExceptFolder, WmsHtmlExceptFolder As String   '強制除外定義のフォルダ指定
    'ADD BY SJA_YIN AT 2017/03/13 <S>
    Dim HtmlExceptFile As String
    'ADD BY SJA_YIN AT 2017/03/13 <E>
    Dim HtmlReplaceString, DataOutputTemplateSheet, HtmlToTsvSheet As String
    Dim TotalItemDocOutputFile As String
    ItemDocOutputFolder = config(0)(DataManageTool.ITEM_DOC_OUTPUT_FOLDER)
    HtmlToTsvSheet = config(0)(DataManageTool.HTML_TO_TSV_SHEET)
    HtmlInputFolder = config(0)(DataManageTool.HTML_INPUT_FOLDER)
    HtmlListInputFolder = config(0)(DataManageTool.HTML_LIST_INPUT_FOLDER)
    BaseHtmlExceptFolder = config(0)(DataManageTool.BASE_HTML_EXCEPT_FOLDER)
    WmsHtmlExceptFolder = config(0)(DataManageTool.WMS_HTML_EXCEPT_FOLDER)
    DataOutputTemplateSheet = config(0)(DataManageTool.DATA_OUTPUT_TEMPLATE_SHEET)
    HtmlReplaceString = config(0)(DataManageTool.HTML_REPLACE_STRING)
    LogOutputFolder = config(0)(DataManageTool.LOG_OUTPUT_FOLDER)
    TotalItemDocOutputFile = config(0)(DataManageTool.TOTAL_ITEM_DOC_OUTPUT_FILE)
    'ADD BY SJA_YIN AT 2017/03/13 <S>
    HtmlExceptFile = config(0)(DataManageTool.HTML_EXCEPT_FILE)
    'ADD BY SJA_YIN AT 2017/03/13 <E>
  
    '項目仕様自動出力パス取込
    If ItemDocOutputFolder = "" Then
       ItemDocOutputFolder = DataManageTool.RootPath
    Else
       ItemDocOutputFolder = DataManageTool.RootPath & "\" & ItemDocOutputFolder
    End If
    Call Common.CheckParentFolder(ItemDocOutputFolder)
    
    'TSVファイルリスト取り込み
    Dim classData, dictData, screenData, htmlData As Collection
    Set classData = ItemDocOutput.getClassData("class", DataOutput.ITEM_DOC_OUTPUT)
    Set dictData = ItemDocOutput.getDictData("dict", DataOutput.ITEM_DOC_OUTPUT)
    
    'logファイルパス取込
    Dim logFileNm As String
    If LogOutputFolder = "" Then
       LogOutputFolder = DataManageTool.RootPath
    Else
       LogOutputFolder = DataManageTool.RootPath & "\" & LogOutputFolder
    End If
    Call Common.CheckParentFolder(LogOutputFolder)
    logFileNm = LogOutputFolder & "\" & DataManageTool.LOG_FILE_NM
    
    'htmlファイルパス取込
    Dim tempHtmlInputFolder As String
    Dim scount, tempCount As Integer
    Dim arrHtmlInputFolder() As String
    Dim arrLenth As Integer
    Dim HtmlFolder, jsFolder, copyToPath, tempHtmlExceptFolder As String
    Dim htmlFileList As Collection
    Dim htmlFile, jsFile, copyToFile As String
    Dim listGridNm As Dictionary
    Dim fso As FileSystemObject
    Dim fileOutput As New FileOutputCtrl
    Dim fileNm As Variant
    Dim excelFile As String
    Dim outputData As Collection
    Dim blnErr As Boolean
    Dim jsFlg As Boolean
    Dim outStartRow As Long
    scount = Common.StrCount(HtmlInputFolder, "..\")
    tempHtmlInputFolder = DataManageTool.RootPath
    For tempCount = 1 To scount
        tempHtmlInputFolder = Left(tempHtmlInputFolder, InStrRev(tempHtmlInputFolder, "\") - 1)
    Next
    HtmlInputFolder = Right(HtmlInputFolder, Len(HtmlInputFolder) - InStrRev(HtmlInputFolder, "..\") - 2)
    HtmlInputFolder = tempHtmlInputFolder & "\" & HtmlInputFolder
    copyToPath = ItemDocOutputFolder & "\" & DataManageTool.HTML_FILE_PATH
    Call Common.CheckParentFolder(copyToPath)
    arrHtmlInputFolder() = Split(HtmlListInputFolder, ",")
    
    'htmlファイル名称=>TSVファイル名称（画面・項目・列マスタデータ）のリスト取り込み
    Dim htmlToTsvData As Dictionary
    Set htmlToTsvData = ItemDocOutput.GetSheetData(DataManageTool.configPath, DataOutput.ITEM_DOC_OUTPUT, HtmlToTsvSheet)

    'ログファイル削除
    Call RewriteHtml.DeleteFile(logFileNm)
    
    If IsNull(outType) Or outType = "" Then
        'ログファイル削除
        Call RewriteHtml.DeleteFile(ItemDocOutputFolder & "\" & TotalItemDocOutputFile & DataManageTool.XLSX_FILE_EXT)
    End If
    
    'メイン処理
    blnErr = False
    outStartRow = OUTPUT_START_ROW
    For arrLenth = LBound(arrHtmlInputFolder) To UBound(arrHtmlInputFolder)
        HtmlFolder = HtmlInputFolder & "\" & arrHtmlInputFolder(arrLenth) & "\" & DataManageTool.HTML_FILE_PATH
        jsFolder = HtmlInputFolder & "\" & arrHtmlInputFolder(arrLenth) & "\" & DataManageTool.JS_FILE_PATH
        
        If arrHtmlInputFolder(arrLenth) = "base" Then
            tempHtmlExceptFolder = BaseHtmlExceptFolder
        Else
            tempHtmlExceptFolder = WmsHtmlExceptFolder
        End If
        
        'HTMLファイル名称取得
        'UPD BY SJA_YIN AT 2017/03/13 <S>
        'Set htmlFileList = ItemDocOutput.getHtmlFiles(HtmlFolder, tempHtmlExceptFolder)
        Set htmlFileList = ItemDocOutput.getHtmlFiles(HtmlFolder, tempHtmlExceptFolder, HtmlExceptFile)
        'UPD BY SJA_YIN AT 2017/03/13 <E>
        If htmlFileList.count <= 0 Then
            MsgBox ("参照HTMLファイルが存在しません(" & HtmlInputFolder & ")。")
            GoTo FinallyHandler
        End If
    
        For Each htmlFile In htmlFileList
            Set fso = New FileSystemObject
            fileNm = fso.GetBaseName(htmlFile)

            'HTMLファイル内容取り込み
            jsFile = Replace(htmlFile, HtmlFolder, jsFolder)
            jsFile = Replace(jsFile, DataManageTool.HTML_FILE_EXT, DataManageTool.JS_FILE_EXT)
            copyToFile = copyToPath & "\" & fileNm & DataManageTool.HTML_FILE_EXT
            'UPD BY SJA_YIN AT 2017/03/13 <S>
'            If RewriteHtml.ReadJs(jsFile) Then
            jsFlg = RewriteHtml.ReadJs(jsFile, logFileNm)
            If Not jsFlg Then
                blnErr = True
            End If
            'UPD BY SJA_YIN AT 2017/03/13 <E>
            
            Set htmlData = RewriteHtml.ReadHtml(htmlFile, copyToFile, HtmlReplaceString, logFileNm, listGridNm)
            If htmlData Is Nothing Or htmlData.count = 0 Then
                blnErr = True
                GoTo continue1
            End If
            'DEL BY SJA_YIN AT 2017/03/13 <S>
'            Else
'                fileOutput.AppendFile (logFileNm)
'                fileOutput.WriteLogFile logFileNm, _
'                           "LogTime :" & Now & vbCrLf & _
'                           "ErrorFileName :" & fileNm & vbCrLf & _
'                           "ErrorMsg :" & "JSファイルが存在しません。" & vbCrLf & vbCrLf
'                blnErr = True
'                GoTo continue1
'            End If
            'DEL BY SJA_YIN AT 2017/03/13 <E>
            
            'TSVファイル（画面・項目・列マスタ）内容取り込み
            Dim screenTsvNm As String
            screenTsvNm = ItemDocOutput.getScreenTsvNm(fileNm, htmlToTsvData)
            Set screenData = ItemDocOutput.getScreenData("screen", DataOutput.ITEM_DOC_OUTPUT, arrHtmlInputFolder(arrLenth), screenTsvNm, listGridNm)
            If screenData Is Nothing Or screenData.count = 0 Then
                blnErr = True
                fileOutput.AppendFile (logFileNm)
                fileOutput.WriteLogFile logFileNm, _
                           "LogTime :" & Now & vbCrLf & _
                           "ErrorFileName :" & fileNm & vbCrLf & _
                           "ErrorMsg :" & "TSVファイル（画面・項目・列マスタ）の取込が失敗しました。" & vbCrLf & vbCrLf
                GoTo continue1
            End If
            
            '項目仕様自動出力データコンバイン
            Set outputData = ItemDocOutput.getOutputData(screenTsvNm, htmlData, screenData, classData, dictData, listGridNm)
            
            '項目仕様自動出力
            If IsNull(outType) Or outType = "" Then
                excelFile = ItemDocOutputFolder & "\" & TotalItemDocOutputFile & DataManageTool.XLSX_FILE_EXT
            Else
                excelFile = ItemDocOutputFolder & "\" & fileNm & DataManageTool.XLSX_FILE_EXT
            End If
            Call ItemDocOutput.makeExcel(DataOutput.ITEM_DOC_OUTPUT, outType, conFilePath, excelFile, outputData, outStartRow)
continue1:
        Next
    Next arrLenth
    
    If IsNull(outType) Or outType = "" Then
        'copy行削除
        Call DeleteCopyRow(ItemDocOutputFolder & "\" & TotalItemDocOutputFile & DataManageTool.XLSX_FILE_EXT)
    End If
    
    'copyのHTMLファイル削除
    If fso.FolderExists(copyToPath) Then
        fso.DeleteFolder (copyToPath)
    End If

    If blnErr = True Then
        MsgBox "項目仕様自動出力が終了しました。" & vbCrLf _
            & "参照ファイルにエラーが存在しますが、ログファイルを確認してください。" & vbCrLf _
            & "(ファイル：" & logFileNm & ")"
    Else
        MsgBox "項目仕様自動出力が正常終了しました。"
    End If
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

Public Function getClassData(ByVal tsvNm As String, ByVal target As String) As Collection

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim ClassInputFolder
    Dim ClassDataInputReadStartRow
    Dim ClassCd, ClassDtlCd, ClassDtlDictNm
    
    ClassInputFolder = config(0)(DataManageTool.CLASS_DATA_INPUT_FOLDER)
    ClassDataInputReadStartRow = config(0)(DataManageTool.CLASS_DATE_INPUT_READ_STARTROW)

    ClassCd = config(0)(DataManageTool.CLASS_CD)
    ClassDtlCd = config(0)(DataManageTool.CLASS_DTL_CD)
    ClassDtlDictNm = config(0)(DataManageTool.CLASS_DTL_DICT_NM)
    
    If ClassInputFolder = "" Then
       Exit Function
    End If
    If ClassDataInputReadStartRow = "" Then
       ClassDataInputReadStartRow = "2"
    End If
    
    'メイン処理
    Dim tsvFolder As String

    tsvFolder = DataManageTool.TsvPath & "\" & ClassInputFolder

    Dim tsvFile As String
    tsvFile = tsvFolder & "\" & ClassInputFolder & DataManageTool.TSV_FILE_EXT         '一時使用
    
    'メイン処理
    Dim isFound As Boolean
    Dim file As New FileInputCtrl
    isFound = file.OpenFile(tsvFile)

    If Not isFound Then
    '    GoTo FinallyHandler
    End If

    Dim data As Variant
    data = file.ReadFile
    
    Dim inputLimtMap, editableMap, necessaryMap, classDataMap As Collection
    
    Set inputLimtMap = New Collection
    Set editableMap = New Collection
    Set necessaryMap = New Collection
    inputLimtMap.Add "", ""
    editableMap.Add "", ""
    necessaryMap.Add "", ""
    Dim i As Integer
    Dim cd, value, valueT As String
    For i = LBound(data, 1) To UBound(data, 1)
    
        If i >= CInt(ClassDataInputReadStartRow) Then
        
            cd = data(i, CInt(ClassCd))
            value = data(i, CInt(ClassDtlCd))
            valueT = data(i, CInt(ClassDtlDictNm))
            
            If IsNull(cd) Or cd = "" Or _
              IsNull(value) Or value = "" Or _
              IsNull(valueT) Or valueT = "" Then
                Exit For
            End If
            
            If cd = CLASS_INPUT_LIMIT Then
                inputLimtMap.Add valueT, value
            ElseIf cd = CLASS_EDITABLE Then
                editableMap.Add valueT, value
            ElseIf cd = CLASS_NECESSARY Then
                necessaryMap.Add valueT, value
            End If
        End If
    Next i
    
    Set classDataMap = New Collection
    classDataMap.Add inputLimtMap, CLASS_INPUT_LIMIT
    classDataMap.Add editableMap, CLASS_EDITABLE
    classDataMap.Add necessaryMap, CLASS_NECESSARY
    
    Set getClassData = classDataMap
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getDictData(ByVal tsvNm As String, ByVal target As String) As Collection

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim DictInputFolder
    Dim DictDataInputReadStartRow
    Dim DictNm, InputLimit, MaxChars, MinNumber, MaxNumber, IntegerLength, DecimalLength
    
    DictInputFolder = config(0)(DataManageTool.DICT_DATA_INPUT_FOLDER)
    DictDataInputReadStartRow = config(0)(DataManageTool.DICT_DATA_INPUT_READ_START_ROW)
   
    DictNm = config(0)(DataManageTool.DICT_NM)
    InputLimit = config(0)(DataManageTool.INPUT_LIMIT)
    MaxChars = config(0)(DataManageTool.MAX_CHARS)
    MinNumber = config(0)(DataManageTool.MIN_NUMBER)
    MaxNumber = config(0)(DataManageTool.MAX_NUMBER)
    IntegerLength = config(0)(DataManageTool.INTEGER_LENGTH)
    DecimalLength = config(0)(DataManageTool.DECIMAL_LENGTH)
    
    If DictInputFolder = "" Then
       Exit Function
    End If
    If DictDataInputReadStartRow = "" Then
       DictDataInputReadStartRow = "2"
    End If

    Dim dictDataMap As Collection
    Dim dictValueMap As Collection
    Set dictDataMap = New Collection
    
    Dim arrDictInputFolder() As String
    Dim arrLenth As Integer
    arrDictInputFolder = Split(DictInputFolder, ",")
    For arrLenth = LBound(arrDictInputFolder) To UBound(arrDictInputFolder)
        'メイン処理
        Dim tsvFolder As String
    
        tsvFolder = DataManageTool.TsvPath & "\" & tsvNm & "\" & arrDictInputFolder(arrLenth)
    
        Dim tsvFile As String
        tsvFile = tsvFolder & "\" & tsvNm & DataManageTool.TSV_FILE_EXT         '一時使用
        
        'メイン処理
        Dim isFound As Boolean
        Dim file As New FileInputCtrl
        isFound = file.OpenFile(tsvFile)
    
        If Not isFound Then
        '    GoTo FinallyHandler
        End If
    
        Dim data As Variant
        data = file.ReadFile
        
        Dim i As Integer
        Dim nm, strInputLimit, strMaxChars, strMinNumber, strMaxNumber, strIntegerLength, strDecimalLength As String
        For i = LBound(data, 1) To UBound(data, 1)
        
            If i >= CInt(DictDataInputReadStartRow) Then
               
                nm = data(i, CInt(DictNm))
                strInputLimit = data(i, CInt(InputLimit))
                strMaxChars = data(i, CInt(MaxChars))
                strMinNumber = data(i, CInt(MinNumber))
                strMaxNumber = data(i, CInt(MaxNumber))
                strIntegerLength = data(i, CInt(IntegerLength))
                strDecimalLength = data(i, CInt(DecimalLength))
                
                If IsNull(nm) Or nm = "" Then
                    Exit For
                End If
                
                Set dictValueMap = New Collection
                dictValueMap.Add nm, DataManageTool.DICT_NM
                dictValueMap.Add strInputLimit, DataManageTool.INPUT_LIMIT
                dictValueMap.Add strMaxChars, DataManageTool.MAX_CHARS
                dictValueMap.Add strMinNumber, DataManageTool.MIN_NUMBER
                dictValueMap.Add strMaxNumber, DataManageTool.MAX_NUMBER
                dictValueMap.Add strIntegerLength, DataManageTool.INTEGER_LENGTH
                dictValueMap.Add strDecimalLength, DataManageTool.DECIMAL_LENGTH
                
                dictDataMap.Add dictValueMap, nm
            End If
        Next i
    Next arrLenth
    
    Set getDictData = dictDataMap
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getScreenData(ByVal tsvNm As String, ByVal target As String, ByVal fileFolder As String, ByVal fileNm As String, ByVal listGridNm As Dictionary) As Collection

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim ScreenDataInputReadStartRow
    Dim screenCd, screenNm, itemCd, itemNm, itemType, ItemEditable, ItemNecessary, ColCd, ColNm, ColOrder, ColType, ColEditable, ColNecessary
    
    ScreenDataInputReadStartRow = config(0)(DataManageTool.SCREEN_LIST_DATA_INPUT_READ_START_ROW)
   
    screenCd = config(0)(DataManageTool.SCREEN_CD)
    screenNm = config(0)(DataManageTool.SCREEN_NM)
    itemCd = config(0)(DataManageTool.ITEM_CD)
    itemNm = config(0)(DataManageTool.ITEM_NM)
    itemType = config(0)(DataManageTool.ITEM_TYPE)
    ItemEditable = config(0)(DataManageTool.ITEM_EDITABLE)
    ItemNecessary = config(0)(DataManageTool.ITEM_NECESSARY)
    ColCd = config(0)(DataManageTool.COL_CD)
    ColNm = config(0)(DataManageTool.COL_NM)
    ColOrder = config(0)(DataManageTool.COL_ORDER)
    ColType = config(0)(DataManageTool.COL_TYPE)
    ColEditable = config(0)(DataManageTool.COL_EDITABLE)
    ColNecessary = config(0)(DataManageTool.COL_NECESSARY)
    
    If ScreenDataInputReadStartRow = "" Then
       ScreenDataInputReadStartRow = "2"
    End If

    Dim screenDataMap As Collection
    Dim screenValueMap As Collection
    Set screenDataMap = New Collection
    
    'メイン処理
    Dim tsvFolder As String

    tsvFolder = DataManageTool.TsvPath & "\" & tsvNm & "\" & fileFolder

    Dim tsvFile As String
    tsvFile = tsvFolder & "\" & fileNm & DataManageTool.TSV_FILE_EXT         '一時使用
    
    'メイン処理
    Dim isFound As Boolean
    Dim file As New FileInputCtrl
    isFound = file.OpenFile(tsvFile)

    If Not isFound Then
        Set getScreenData = New Collection
        GoTo FinallyHandler
    End If

    Dim data As Variant
    data = file.ReadFile
    
    Dim i As Integer
    Dim strScreenCd, strScreenNm, strItemCd, strItemNm, strItemType, strItemEditable, strItemNecessary, strColCd, strColNm, strColOrder, strColType, strColEditable, strColNecessary
    Dim ado As Object
    Set ado = CreateObject("ADODB.Recordset")

    '引数１：物理名
    '引数２：データ型（200:VarChar）
    '引数３：サイズ（300:300バイトの可変長文字列）
    '引数４：オプション（32:NULL許容）
    ado.Fields.Append "SCREEN_CD", 200, 300, 32
    ado.Fields.Append "SCREEN_NM", 200, 300, 32
    ado.Fields.Append "ITEM_CD", 200, 300, 32
    ado.Fields.Append "ITEM_NM", 200, 300, 32
    ado.Fields.Append "ITEM_TYPE", 200, 300, 32
    ado.Fields.Append "ITEM_EDITABLE", 200, 300, 32
    ado.Fields.Append "ITEM_NECESSARY", 200, 300, 32
    ado.Fields.Append "COL_CD", 200, 300, 32
    ado.Fields.Append "COL_NM", 200, 300, 32
    ado.Fields.Append "COL_ORDER", 200, 100, 32
    ado.Fields.Append "COL_TYPE", 200, 300, 32
    ado.Fields.Append "COL_EDITABLE", 200, 300, 32
    ado.Fields.Append "COL_NECESSARY", 200, 300, 32
    ado.Open
    
    For i = LBound(data, 1) To UBound(data, 1)
    
        If i >= CInt(ScreenDataInputReadStartRow) Then
           
            strScreenCd = data(i, CInt(screenCd))
            strScreenNm = data(i, CInt(screenNm))
            strItemCd = data(i, CInt(itemCd))
            strItemNm = data(i, CInt(itemNm))
            strItemType = data(i, CInt(itemType))
            If IsNull(strItemType) Or strItemType = "" Then
                If Not (listGridNm Is Nothing Or listGridNm.count = 0) Then
                    If listGridNm.Exists(strItemCd) Then
                        strItemType = "grid"
                    End If
                End If
            End If
            
            strItemEditable = data(i, CInt(ItemEditable))
            strItemNecessary = data(i, CInt(ItemNecessary))
            strColCd = data(i, CInt(ColCd))
            strColNm = data(i, CInt(ColNm))
            strColOrder = data(i, CInt(ColOrder))
            strColOrder = IIf(strColOrder = "", "0", strColOrder)
            strColOrder = String(6 - Len(strColOrder), "0") & strColOrder
            strColType = data(i, CInt(ColType))
            strColEditable = data(i, CInt(ColEditable))
            strColNecessary = data(i, CInt(ColNecessary))
           
            If IsNull(strScreenCd) Or strScreenCd = "" Then
                Exit For
            End If
            
            ado.AddNew
            ado.Fields(0) = strScreenCd
            ado.Fields(1) = strScreenNm
            ado.Fields(2) = strItemCd
            ado.Fields(3) = strItemNm
            ado.Fields(4) = strItemType
            ado.Fields(5) = strItemEditable
            ado.Fields(6) = strItemNecessary
            ado.Fields(7) = strColCd
            ado.Fields(8) = strColNm
            ado.Fields(9) = strColOrder
            ado.Fields(10) = strColType
            ado.Fields(11) = strColEditable
            ado.Fields(12) = strColNecessary
            ado.Update

        End If
    Next i
    
    ado.Sort = "ITEM_CD ASC, COL_ORDER ASC "

    If ado.EOF = True Or ado.RecordCount = 0 Then
    Else
        ado.MoveFirst
    End If

    Dim itemCdOld As String
    itemCdOld = ""
    Dim intColsCnt As Integer
    Do Until ado.EOF
        Set screenValueMap = New Collection
        
        If Not IsNull(ado.Fields(4).value) And ado.Fields(4).value = "grid" Then
            screenValueMap.Add ado.Fields(1).value, DataManageTool.SCREEN_NM
            If IsNull(itemCdOld) Or itemCdOld = "" Then
                intColsCnt = 0
                screenDataMap.Add intColsCnt, ado.Fields(2).value
            ElseIf itemCdOld <> ado.Fields(2).value Then
                intColsCnt = 0
                screenDataMap.Add intColsCnt, ado.Fields(2).value
            End If
            
            screenValueMap.Add ado.Fields(2).value, DataManageTool.ITEM_CD
            screenValueMap.Add ado.Fields(3).value, DataManageTool.ITEM_NM
            screenValueMap.Add ado.Fields(8).value, DataManageTool.COL_NM
            screenValueMap.Add ado.Fields(10).value, DataManageTool.COL_TYPE
            screenValueMap.Add ado.Fields(11).value, DataManageTool.COL_EDITABLE
            screenValueMap.Add ado.Fields(12).value, DataManageTool.COL_NECESSARY
    
            screenDataMap.Add screenValueMap, ado.Fields(2).value & "#" & intColsCnt
            
            intColsCnt = intColsCnt + 1
            screenDataMap.Remove ado.Fields(2).value
            screenDataMap.Add intColsCnt, ado.Fields(2).value
            itemCdOld = ado.Fields(2).value
        Else
            screenValueMap.Add ado.Fields(1).value, DataManageTool.SCREEN_NM
            screenValueMap.Add ado.Fields(2).value, DataManageTool.ITEM_CD
            screenValueMap.Add ado.Fields(3).value, DataManageTool.ITEM_NM
            screenValueMap.Add ado.Fields(5).value, DataManageTool.ITEM_EDITABLE
            screenValueMap.Add ado.Fields(6).value, DataManageTool.ITEM_NECESSARY
    
            screenDataMap.Add screenValueMap, ado.Fields(2).value
        End If
        
        ado.MoveNext
    Loop

    ado.Close
    Set ado = Nothing
    
    Set getScreenData = screenDataMap
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getOutputData(ByVal screenCd As String, ByVal htmlDataList As Collection, ByVal screenData As Collection, ByVal classData As Collection, ByVal dictData As Collection, ByVal listGridNm As Dictionary) As Collection

    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    Dim excelData As Collection
    Set excelData = New Collection
    
    Dim htmlDataKey, htmlDataValue As Collection
    Dim inputLimtData, editableData, necessaryData, dictDataValue, screenDataValue As Collection
    Dim outputValue As Collection
    Dim screenNm, itemCd, itemNm, itemPosition, itemType As String
    Dim colsCnt, idxCol As Integer
    Dim editableCd, necessaryCd, inputTypeCd As String
    Dim lblGridNm As String
    
    Set inputLimtData = classData(CLASS_INPUT_LIMIT)
    Set editableData = classData(CLASS_EDITABLE)
    Set necessaryData = classData(CLASS_NECESSARY)

    Dim itemData
    Dim idxItem As Integer
    
    Set htmlDataKey = htmlDataList(1)
    Set htmlDataValue = htmlDataList(2)
    itemPosition = OUTPUT_ITEM_HEAD

    For idxItem = 1 To htmlDataKey.count
        itemCd = htmlDataKey(idxItem)
        itemType = htmlDataValue(itemCd)
        
        Dim arrItemType() As String
        arrItemType = Split(itemType, ",")
        itemType = arrItemType(0)
        If itemType = "grid" Then
            If listGridNm.count > 1 Then
                itemPosition = OUTPUT_ITEM_BODY & listGridNm.item(itemCd)
            Else
                itemPosition = OUTPUT_ITEM_BODY
            End If
            If arrItemType(1) = "1" Then
                Set outputValue = New Collection
                'ADD BY SJA_YIN AT 2017/03/14 <S>
                If Not isExitScreenData(screenData, itemCd & "#0") Then
                    GoTo continue1
                End If
                'ADD BY SJA_YIN AT 2017/03/14 <E>
                Set screenDataValue = screenData(itemCd & "#0")
                
                outputValue.Add screenCd, DataManageTool.DATA_OUTPUT_SCREEN_CD
                outputValue.Add screenDataValue(DataManageTool.SCREEN_NM), DataManageTool.DATA_OUTPUT_SCREEN_NM
                outputValue.Add itemPosition, DataManageTool.DATA_OUTPUT_ITEM_POSITION
                outputValue.Add OUTPUT_BODY_SEL, DataManageTool.DATA_OUTPUT_ITEM_NM
                outputValue.Add "", DataManageTool.DATA_OUTPUT_TYPE
                outputValue.Add "", DataManageTool.DATA_OUTPUT_EDITABLE
                outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
                outputValue.Add "", DataManageTool.DATA_OUTPUT_INPUT_TYPE
                outputValue.Add "", DataManageTool.DATA_OUTPUT_MAX_CHARS
                outputValue.Add "", DataManageTool.DATA_OUTPUT_MIN_NUMBER
                outputValue.Add "", DataManageTool.DATA_OUTPUT_MAX_NUMBER
                outputValue.Add "", DataManageTool.DATA_OUTPUT_INTEGER_LENGTH
                outputValue.Add "", DataManageTool.DATA_OUTPUT_DECIMAL_LENGTH
                
                excelData.Add outputValue
            End If
            If TypeName(screenData(itemCd)) = "Collection" Then
                GoTo formatOutputItem
            End If
            colsCnt = CInt(screenData(itemCd))
            
            For idxCol = 0 To colsCnt - 1
                Set outputValue = New Collection
                Set screenDataValue = screenData(itemCd & "#" & idxCol)
                
                outputValue.Add screenCd, DataManageTool.DATA_OUTPUT_SCREEN_CD
                outputValue.Add screenDataValue(DataManageTool.SCREEN_NM), DataManageTool.DATA_OUTPUT_SCREEN_NM
                outputValue.Add itemPosition, DataManageTool.DATA_OUTPUT_ITEM_POSITION
                itemNm = screenDataValue(DataManageTool.COL_NM)
                outputValue.Add itemNm, DataManageTool.DATA_OUTPUT_ITEM_NM
                outputValue.Add screenDataValue(DataManageTool.COL_TYPE), DataManageTool.DATA_OUTPUT_TYPE
                editableCd = screenDataValue(DataManageTool.COL_EDITABLE)
                necessaryCd = screenDataValue(DataManageTool.COL_NECESSARY)
                If itemType = "info" Or itemType = "span" Or itemType = "label" Or itemType = "canvas" Then
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_EDITABLE
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
                ElseIf itemType = "button" Or itemType = "file" Then
                    outputValue.Add editableData(editableCd), DataManageTool.DATA_OUTPUT_EDITABLE
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
                Else
                    outputValue.Add editableData(editableCd), DataManageTool.DATA_OUTPUT_EDITABLE
                    If editableCd = "0" Then
                        outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
                    Else
                        outputValue.Add necessaryData(necessaryCd), DataManageTool.DATA_OUTPUT_NECESSARY
                    End If
                End If
                If IsNull(itemNm) Or itemNm = "" Then
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_INPUT_TYPE
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_MAX_CHARS
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_MIN_NUMBER
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_MAX_NUMBER
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_INTEGER_LENGTH
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_DECIMAL_LENGTH
                Else
                    Set dictDataValue = dictData(itemNm)
                    inputTypeCd = dictDataValue(DataManageTool.INPUT_LIMIT)
                    outputValue.Add inputLimtData(inputTypeCd), DataManageTool.DATA_OUTPUT_INPUT_TYPE
                    outputValue.Add dictDataValue(DataManageTool.MAX_CHARS), DataManageTool.DATA_OUTPUT_MAX_CHARS
                    outputValue.Add dictDataValue(DataManageTool.MIN_NUMBER), DataManageTool.DATA_OUTPUT_MIN_NUMBER
                    outputValue.Add dictDataValue(DataManageTool.MAX_NUMBER), DataManageTool.DATA_OUTPUT_MAX_NUMBER
                    outputValue.Add dictDataValue(DataManageTool.INTEGER_LENGTH), DataManageTool.DATA_OUTPUT_INTEGER_LENGTH
                    outputValue.Add dictDataValue(DataManageTool.DECIMAL_LENGTH), DataManageTool.DATA_OUTPUT_DECIMAL_LENGTH
                End If
                
                excelData.Add outputValue
            Next idxCol
            
            If listGridNm.item(itemCd) = listGridNm.count Then
                itemPosition = OUTPUT_ITEM_FOOT
            End If
        Else
formatOutputItem:
            If itemType = "label" Then
                If listGridNm.count > 1 Then
                    GoTo continue1
                End If
            End If
            Set outputValue = New Collection
            'ADD BY SJA_YIN AT 2017/03/14 <S>
            If Not isExitScreenData(screenData, itemCd) Then
                GoTo continue1
            End If
            'ADD BY SJA_YIN AT 2017/03/14 <E>
            Set screenDataValue = screenData(itemCd)
            outputValue.Add screenCd, DataManageTool.DATA_OUTPUT_SCREEN_CD
            outputValue.Add screenDataValue(DataManageTool.SCREEN_NM), DataManageTool.DATA_OUTPUT_SCREEN_NM
            If htmlDataValue(itemCd) = "span" Then
                outputValue.Add OUTPUT_ITEM_SPAN, DataManageTool.DATA_OUTPUT_ITEM_POSITION
            Else
                outputValue.Add itemPosition, DataManageTool.DATA_OUTPUT_ITEM_POSITION
            End If
            itemNm = screenDataValue(DataManageTool.ITEM_NM)
            outputValue.Add itemNm, DataManageTool.DATA_OUTPUT_ITEM_NM
            outputValue.Add itemType, DataManageTool.DATA_OUTPUT_TYPE
            editableCd = screenDataValue(DataManageTool.ITEM_EDITABLE)
            necessaryCd = screenDataValue(DataManageTool.ITEM_NECESSARY)
            If itemType = "info" Or itemType = "span" Or itemType = "label" Or itemType = "canvas" Then
                outputValue.Add "", DataManageTool.DATA_OUTPUT_EDITABLE
                outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
            ElseIf itemType = "button" Or itemType = "file" Then
                outputValue.Add editableData(editableCd), DataManageTool.DATA_OUTPUT_EDITABLE
                outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
            Else
                outputValue.Add editableData(editableCd), DataManageTool.DATA_OUTPUT_EDITABLE
                If editableCd = "0" Then
                    outputValue.Add "", DataManageTool.DATA_OUTPUT_NECESSARY
                Else
                    outputValue.Add necessaryData(necessaryCd), DataManageTool.DATA_OUTPUT_NECESSARY
                End If
            End If
            Set dictDataValue = dictData(itemNm)
            inputTypeCd = dictDataValue(DataManageTool.INPUT_LIMIT)
            outputValue.Add inputLimtData(inputTypeCd), DataManageTool.DATA_OUTPUT_INPUT_TYPE
            outputValue.Add dictDataValue(DataManageTool.MAX_CHARS), DataManageTool.DATA_OUTPUT_MAX_CHARS
            outputValue.Add dictDataValue(DataManageTool.MIN_NUMBER), DataManageTool.DATA_OUTPUT_MIN_NUMBER
            outputValue.Add dictDataValue(DataManageTool.MAX_NUMBER), DataManageTool.DATA_OUTPUT_MAX_NUMBER
            outputValue.Add dictDataValue(DataManageTool.INTEGER_LENGTH), DataManageTool.DATA_OUTPUT_INTEGER_LENGTH
            outputValue.Add dictDataValue(DataManageTool.DECIMAL_LENGTH), DataManageTool.DATA_OUTPUT_DECIMAL_LENGTH
        
            excelData.Add outputValue
        End If
continue1:
    Next idxItem
    
    Set getOutputData = excelData
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

'UPD BY SJA_YIN AT 2017/03/13 <S>
'Public Function getHtmlFiles(ByVal HtmlFolder As String, ByVal htmlExceptFolder As String) As Collection
Public Function getHtmlFiles(ByVal HtmlFolder As String, ByVal htmlExceptFolder As String, ByVal HtmlExceptFile As String) As Collection
'UPD BY SJA_YIN AT 2017/03/13 <E>
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    
    '強制除外定義のフォルダ指定
    Dim arrHtmlExceptFolder() As String
    Dim arrLenth As Integer
    Dim htmlExceptFolderMap As Dictionary
    Set htmlExceptFolderMap = New Dictionary
    htmlExceptFolderMap.CompareMode = TextCompare
    If htmlExceptFolder <> vbNullString Then
        arrHtmlExceptFolder() = Split(htmlExceptFolder, ",")
        For arrLenth = LBound(arrHtmlExceptFolder) To UBound(arrHtmlExceptFolder)
            htmlExceptFolderMap.Add arrHtmlExceptFolder(arrLenth), "1"
        Next arrLenth
    End If
    
    'ADD BY SJA_YIN AT 2017/03/13 <S>
    '強制除外定義のファイル指定
    Dim arrHtmlExceptFile() As String
    Dim arrFileLenth As Integer
    Dim htmlExceptFileMap As Dictionary
    Set htmlExceptFileMap = New Dictionary
    htmlExceptFileMap.CompareMode = TextCompare
    If HtmlExceptFile <> vbNullString Then
        arrHtmlExceptFile() = Split(HtmlExceptFile, ",")
        For arrFileLenth = LBound(arrHtmlExceptFile) To UBound(arrHtmlExceptFile)
            htmlExceptFileMap.Add arrHtmlExceptFile(arrFileLenth), "1"
        Next arrFileLenth
    End If
    'ADD BY SJA_YIN AT 2017/03/13 <E>
    
    'HTMLファイルリスト取り込み
    Dim fileList As Collection
    Dim htmlFile As String
    Dim folders As Variant
    Dim finalInputFiles As Collection
    Set finalInputFiles = New Collection
    Dim tempFile As Variant
        
    Dim list As Collection
    Set list = Common.getFolderList(HtmlFolder)
    
    If list.count <= 0 Then
        Set fileList = Common.getFileList(HtmlFolder)
        For Each tempFile In fileList
            htmlFile = HtmlFolder & "\" & tempFile & DataManageTool.HTML_FILE_EXT
            If Dir(htmlFile) <> "" Then
                'UPD BY SJA_YIN AT 2017/03/13 <S>
                'finalInputFiles.Add htmlFile
                If isNotExceptFile(tempFile, htmlExceptFileMap) Then
                    finalInputFiles.Add htmlFile
                End If
               'UPD BY SJA_YIN AT 2017/03/13 <E>
            End If
        Next
    Else
        Set fileList = Common.getFileList(HtmlFolder)
        For Each tempFile In fileList
            htmlFile = HtmlFolder & "\" & tempFile & DataManageTool.HTML_FILE_EXT
            If Dir(htmlFile) <> "" Then
                'UPD BY SJA_YIN AT 2017/03/13 <S>
                'finalInputFiles.Add htmlFile
                If isNotExceptFile(tempFile, htmlExceptFileMap) Then
                    finalInputFiles.Add htmlFile
                End If
               'UPD BY SJA_YIN AT 2017/03/13 <E>
            End If
        Next
        
        For Each folders In list
            '強制除外定義のフォルダ指定
            If Not (htmlExceptFolderMap Is Nothing Or htmlExceptFolderMap.count = 0) Then
                If htmlExceptFolderMap.Exists(folders) Then GoTo continue1
            End If
            
            Set fileList = Common.getFileList(HtmlFolder & "\" & folders)
            For Each tempFile In fileList
                htmlFile = HtmlFolder & "\" & folders & "\" & tempFile & DataManageTool.HTML_FILE_EXT
                If Dir(htmlFile) <> "" Then
                    'UPD BY SJA_YIN AT 2017/03/13 <S>
                    'finalInputFiles.Add htmlFile
                    If isNotExceptFile(tempFile, htmlExceptFileMap) Then
                        finalInputFiles.Add htmlFile
                    End If
                   'UPD BY SJA_YIN AT 2017/03/13 <E>
                End If
            Next
continue1:
        Next
    End If
    
    Set getHtmlFiles = finalInputFiles
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Sub makeExcel(ByVal target As String, ByVal outType As String, ByVal templateFile As String, ByVal excelFile As String, ByVal excelData As Collection, ByRef outStartRow As Long)
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim OutputScreenCd, OutputScreenNm, OutputItemPosition, OutputItemNm, OutputType, OutputEditable, OutputNecessary As String
    Dim OutputInputType, OutputMaxChars, OutputIntegerLength, OutputDecimalLength, OutputMinNumber, OutputMaxNumber As String
    Dim TemplateSheetName As String
    Dim fso As New FileSystemObject
  
    TemplateSheetName = config(0)(DataManageTool.DATA_OUTPUT_TEMPLATE_SHEET)
    OutputScreenCd = config(0)(DataManageTool.DATA_OUTPUT_SCREEN_CD)
    OutputScreenNm = config(0)(DataManageTool.DATA_OUTPUT_SCREEN_NM)
    OutputItemPosition = config(0)(DataManageTool.DATA_OUTPUT_ITEM_POSITION)
    OutputItemNm = config(0)(DataManageTool.DATA_OUTPUT_ITEM_NM)
    OutputType = config(0)(DataManageTool.DATA_OUTPUT_TYPE)
    OutputEditable = config(0)(DataManageTool.DATA_OUTPUT_EDITABLE)
    OutputNecessary = config(0)(DataManageTool.DATA_OUTPUT_NECESSARY)
    OutputInputType = config(0)(DataManageTool.DATA_OUTPUT_INPUT_TYPE)
    OutputMaxChars = config(0)(DataManageTool.DATA_OUTPUT_MAX_CHARS)
    OutputIntegerLength = config(0)(DataManageTool.DATA_OUTPUT_INTEGER_LENGTH)
    OutputDecimalLength = config(0)(DataManageTool.DATA_OUTPUT_DECIMAL_LENGTH)
    OutputMinNumber = config(0)(DataManageTool.DATA_OUTPUT_MIN_NUMBER)
    OutputMaxNumber = config(0)(DataManageTool.DATA_OUTPUT_MAX_NUMBER)
    
    Dim lineData As Collection
    Dim idxSheet, intRow  As Long
    
    If IsNull(outType) Or outType = "" Then
        If Not fso.FileExists(excelFile) Then
            'open template file
            Call RewriteHtml.copyFiles(templateFile, excelFile)
        End If
    Else
        'open template file
        Call RewriteHtml.copyFiles(templateFile, excelFile)
    End If
    
    'open excelFile
    Dim wb As Workbook
    Set wb = Workbooks.Open(excelFile)
    
    For idxSheet = wb.Sheets.count To 1 Step -1
        If Not wb.Sheets(idxSheet).name = TemplateSheetName Then
            wb.Sheets(idxSheet).Delete
        End If
    Next idxSheet
    
    Dim ws As Worksheet
    Set ws = wb.Sheets(TemplateSheetName)
    
    'write excelFile
    intRow = OUTPUT_START_ROW
    If IsNull(outType) Or outType = "" Then
        intRow = outStartRow
    End If
    For Each lineData In excelData
        ws.rows(OUTPUT_COPY_ROW).Copy ws.rows(intRow)
        
        ws.Cells(intRow, CInt(OutputScreenCd)).value = lineData(DataManageTool.DATA_OUTPUT_SCREEN_CD)
        ws.Cells(intRow, CInt(OutputScreenNm)).value = lineData(DataManageTool.DATA_OUTPUT_SCREEN_NM)
        
        ws.Cells(intRow, CInt(OutputItemPosition)).value = lineData(DataManageTool.DATA_OUTPUT_ITEM_POSITION)
        ws.Cells(intRow, CInt(OutputItemNm)).value = lineData(DataManageTool.DATA_OUTPUT_ITEM_NM)
        ws.Cells(intRow, CInt(OutputType)).value = lineData(DataManageTool.DATA_OUTPUT_TYPE)
        ws.Cells(intRow, CInt(OutputEditable)).value = Replace(lineData(DataManageTool.DATA_OUTPUT_EDITABLE), "編集", "")
        ws.Cells(intRow, CInt(OutputNecessary)).value = lineData(DataManageTool.DATA_OUTPUT_NECESSARY)
        ws.Cells(intRow, CInt(OutputInputType)).value = lineData(DataManageTool.DATA_OUTPUT_INPUT_TYPE)
        ws.Cells(intRow, CInt(OutputMaxChars)).value = lineData(DataManageTool.DATA_OUTPUT_MAX_CHARS)
        ws.Cells(intRow, CInt(OutputIntegerLength)).value = lineData(DataManageTool.DATA_OUTPUT_INTEGER_LENGTH)
        ws.Cells(intRow, CInt(OutputDecimalLength)).value = lineData(DataManageTool.DATA_OUTPUT_DECIMAL_LENGTH)
        ws.Cells(intRow, CInt(OutputMinNumber)).value = lineData(DataManageTool.DATA_OUTPUT_MIN_NUMBER)
        ws.Cells(intRow, CInt(OutputMaxNumber)).value = lineData(DataManageTool.DATA_OUTPUT_MAX_NUMBER)
    
        intRow = intRow + 1
    Next
    
    outStartRow = intRow
    
    'copy行削除
    If IsNull(outType) Or outType = "" Then
    Else
        ws.rows(OUTPUT_COPY_ROW).Delete
    End If
    
    Application.CutCopyMode = False
    
    'close excelFile
    wb.Close (True)

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage

End Sub

Public Sub DeleteCopyRow(ByVal excelFile As String)
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim TemplateSheetName As String
    Dim fso As New FileSystemObject
  
    TemplateSheetName = config(0)(DataManageTool.DATA_OUTPUT_TEMPLATE_SHEET)
    
    If Not fso.FileExists(excelFile) Then
        GoTo FinallyHandler
    End If
    
    'open excelFile
    Dim wb As Workbook
    Set wb = Workbooks.Open(excelFile)
    Dim ws As Worksheet
    Set ws = wb.Sheets(TemplateSheetName)
    
    'copy行削除
    ws.rows(OUTPUT_COPY_ROW).Delete
    
    'close excelFile
    wb.Close (True)

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage

End Sub

Public Function GetSheetData(ByVal bookpath As String, ByVal bookName As String, ByVal sheetName As String, Optional ByVal sheetData As Dictionary = Nothing) As Dictionary
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    If sheetData Is Nothing Then
        Set sheetData = New Dictionary
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

        If Not fso.FileExists(w) Then
            GoTo FinallyHandler
        End If

        Set wb = Workbooks.Open(w, False, True)
        wb.Windows(wb.name).Visible = False
    End If

    Dim ws As Worksheet
    Set ws = wb.Worksheets(sheetName)

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
                    sheetData(rg.value) = rg.Offset(0, 1).value
                End If
            End If
        Next
    End If

    If Not isOpen Then
        wb.Close (False)
    End If

    Set GetSheetData = sheetData
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getScreenTsvNm(ByVal htmlFileName As String, ByVal htmlToTsvData As Dictionary) As String
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim screenTsvNm As String

    If htmlToTsvData Is Nothing Then
        getScreenTsvNm = htmlFileName
        GoTo FinallyHandler
    End If
    
    If htmlToTsvData.Exists(htmlFileName) Then
        screenTsvNm = htmlToTsvData(htmlFileName)
    Else
        screenTsvNm = htmlFileName
    End If
    
    getScreenTsvNm = screenTsvNm
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

'ADD BY SJA_YIN AT 2017/03/13 <S>
Public Function isNotExceptFile(ByVal htmlFileName As String, ByVal htmlExceptFileMap As Dictionary) As Boolean
    
    On Error Resume Next
    
    '強制除外定義のファイル指定
    If Not (htmlExceptFileMap Is Nothing Or htmlExceptFileMap.count = 0) Then
        If htmlExceptFileMap.Exists(htmlFileName) Then
            isNotExceptFile = False
            Exit Function
        End If
    End If
    
    isNotExceptFile = True

End Function

Public Function isExitScreenData(ByVal screenData As Collection, ByVal itemCd As String) As Boolean
    On Error GoTo ErrorHandler
    
    Dim screenDataValue As Collection
    Set screenDataValue = screenData(itemCd)
    
    isExitScreenData = True
    GoTo FinallyHandler
    
ErrorHandler:
    isExitScreenData = False

FinallyHandler:

End Function
'ADD BY SJA_YIN AT 2017/03/13 <E>

