Attribute VB_Name = "DataInoutManage"
Option Explicit

Private Const DATA_SHEET_NAME As String = "Data"

Private Const BULK_ROW_COUNT As Long = 1000

'設定ファイルを軸とした初回限定処理が必要（項目検証・列検証マスタ、画面権限・項目権限・列権限マスタにおいて必要）
Public Sub OpenBook(ByVal book As Workbook)
    On Error GoTo ErrorHandler
  
    Dim ac As New AppCtrl
    ac.StartApp

    Dim configPath As String
    configPath = Replace(book.path, DataManageTool.RootPath, "")
    configPath = Replace(configPath, "\" & DataManageTool.EXCEL_FILE_PATH & "\", "\" & DataManageTool.CONFIG_FILE_PATH & "\" & DataManageTool.EXCEL_FILE_PATH & "\", 1, 1)
    configPath = DataManageTool.RootPath & configPath

    Dim config As Dictionary
    Set config = Common.GetConfig(configPath, book.name)

    'メイン処理
    Dim bookpath As String
    bookpath = Replace(book.path, DataManageTool.RootPath, "")
    bookpath = Replace(bookpath, "\" & DataManageTool.EXCEL_FILE_PATH & "\", "\" & DataManageTool.TSV_FILE_PATH & "\", 1, 1)
    bookpath = DataManageTool.RootPath & bookpath

    Dim tsvFile As String
    tsvFile = bookpath & "\" & Left(book.name, InStrRev(book.name, ".") - 1) & DataManageTool.TSV_FILE_EXT

    Dim isFound As Boolean

    Dim file As New FileInputCtrl
    isFound = file.OpenFile(tsvFile)
    Dim file_c As Collection    'input files collection
    Set file_c = New Collection
                
    If Not isFound Then
        If config Is Nothing Then
            'MsgBox "Configration File is not exist!"
            MsgBox "EXCELの設定ファイルがありません｡"
            GoTo FinallyHandler
        Else
            Dim iniFolder As String
            iniFolder = config(DataOutput.MANAGE_FLODER)
            If iniFolder = "" Then
                'MsgBox "Confgration is incorrect!"
                GoTo FinallyHandler
            Else
                Dim iniFolders() As String
                iniFolders() = Split(Replace(Replace(iniFolder, "<", ""), ">", ""), ",")
                'Step1 Get input Tsv Files
                Set file_c = getTsvFiles(iniFolders, bookpath, book)
                If file_c Is Nothing Then
                    GoTo FinallyHandler
                End If

                'Step2 Get output Columns
                Dim finalColumns As Collection
                Set finalColumns = getOutputColumns(config, iniFolders)
                If finalColumns Is Nothing Then
                    GoTo FinallyHandler
                End If
                
                'Step3 Get the column that needs to be spreaded
                Dim strSpreadValue() As String
                Dim isSpreadFlag As Boolean
                isSpreadFlag = False
                Dim temp As String
                If InStr(config(DataOutput.MANAGE_COPY_COLUMNS), ">") > 0 Or InStr(config(DataOutput.MANAGE_COPY_COLUMNS), "<") > 0 Then
                    temp = Mid(config(DataOutput.MANAGE_COPY_COLUMNS), InStr(config(DataOutput.MANAGE_COPY_COLUMNS), "<") + 1, InStr(config(DataOutput.MANAGE_COPY_COLUMNS), ">") - InStr(config(DataOutput.MANAGE_COPY_COLUMNS), "<") - 1)
                    isSpreadFlag = True
                    strSpreadValue = Split(temp, ",")
                End If
                
                'Step4 Get the output data collection
                Dim sheetValue As Collection
                Set sheetValue = getSheetValue(iniFolder, config, isSpreadFlag, finalColumns, file_c)
                If sheetValue Is Nothing Then
                    GoTo FinallyHandler
                End If
           End If
        End If
        
        'Step5 Get the column that needs to be checked for uniqueness
        Dim uniqueColumnsNo As Collection
        Set uniqueColumnsNo = getColumnsNo(config(DataOutput.MANAGE_UNIQUE_COLUMNS), iniFolders, finalColumns)
        
        'Step6 Get the column that needs to be skiped for null value
        Dim nullSkipColumnsNo As Collection
        Set nullSkipColumnsNo = getColumnsNo(config(DataOutput.MANAGE_NULL_SKIP_COLUMNS), iniFolders, finalColumns)

        'Step7 Get the output sheet
        Dim successFlag As Boolean
        successFlag = createIniData(sheetValue, uniqueColumnsNo, nullSkipColumnsNo, book)
        If Not successFlag Then
           ' MsgBox "Failed to initialize data !"
            MsgBox "初回起動時、参照データの表示が失敗しました。"
            GoTo FinallyHandler
        End If
        
        GoTo FinallyHandler
    Else 'File exist

        Dim data As Variant
        Dim rg As Range
    
        Dim ws As Worksheet
        Set ws = book.Sheets(DATA_SHEET_NAME)
        
        ws.UsedRange.NumberFormatLocal = "@"
        ws.Columns.AutoFit
        ws.rows.AutoFit
        ws.Columns.Clear
        Dim rowCount As Long
    
        Dim rowIndex As Long
        rowIndex = 1
    
        Do
            data = file.ReadFile
    
            If Not IsArrayEx(data) Then
                Exit Do
            End If
    
            rowCount = UBound(data) - LBound(data) + 1
    
            Set rg = ws.Range(ws.Cells(rowIndex, 1), ws.Cells(rowIndex + rowCount - 1, file.CountColumn))
            ws.Range(ws.Cells(rowIndex, 1), ws.Cells(rowIndex + rowCount - 1, file.CountColumn)).NumberFormatLocal = "@"
            rg = data
    
            rowIndex = rowIndex + rowCount
        Loop
        ws.Columns.AutoFit
        ws.rows.AutoFit
        file.CloseFile
        '2017/12/05 ADD START
        If config Is Nothing Then
            'MsgBox "Configration File is not exist!"
            MsgBox "EXCELの設定ファイルがありません｡"
            GoTo FinallyHandler
        End If
        '2017/12/05 ADD END
        GoTo FinallyHandler
    End If

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

'設定ファイルを軸とした必須・重複チェック処理などが必要
Public Function SaveBook(ByVal book As Workbook, Optional ByRef errFlag As Boolean = False) As Boolean
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    Dim configPath As String
    configPath = Replace(book.path, DataManageTool.RootPath, "")
    configPath = Replace(configPath, "\" & DataManageTool.EXCEL_FILE_PATH & "\", "\" & DataManageTool.CONFIG_FILE_PATH & "\" & DataManageTool.EXCEL_FILE_PATH & "\", 1, 1)
    configPath = DataManageTool.RootPath & configPath

    Dim config As Dictionary
    Set config = Common.GetConfig(configPath, book.name)
    
    'メイン処理
    Dim ws As Worksheet
    Set ws = book.Sheets(DATA_SHEET_NAME)

    Dim sRg As Range
    Set sRg = ws.Cells(1, 1)

    Dim eRg As Range
    Set eRg = sRg.SpecialCells(xlLastCell)

    'TODO:最終行列判定が甘い為データを消してもTab埋めされてTSVに保存されてしまう
    '     その為Replace-Schema用のTSV出力処理では、タブのみの行は出力対象外とする必要がある
    '     更に上記eRg変数の位置から最終行、最終列を算出する処理を別途実行する事が望まれる
'ADD BY YC_LI AT 2016/08/10 [S]
    'get config
    If Not config Is Nothing Then
    Dim ColNotNull, ColNumberType, ColDateType, ColDateTimeType, ColDuplicateCheck, readStartRow
    Set config(0) = Common.GetConfig(configPath, Replace(book.name, DataManageTool.XLSM_FILE_EXT, DataManageTool.XLSX_FILE_EXT))
    readStartRow = config(0)(DataManageTool.READ_START_ROW)
    ColNotNull = config(0)(DataManageTool.COL_NOT_NULL)
    ColNumberType = config(0)(DataManageTool.COL_NUMBER_TYPE)
    ColDateType = config(0)(DataManageTool.COL_DATE_TYPE)
    ColDateTimeType = config(0)(DataManageTool.COL_DATETIME_TYPE)
    ColDuplicateCheck = config(0)(DataManageTool.COL_DUPLICATE_CHECK)
    'get range rows and columns
    Dim rowNum
    Dim colnum
' -- MODIFY BY KAWANA 関数の使い方ミス修正 2017.02.16 [S]
    rowNum = ws.Cells.SpecialCells(xlLastCell).row
    colnum = ws.Cells.SpecialCells(xlLastCell).column
' -- MODIFY BY KAWANA 関数の使い方ミス修正 2017.02.16 [E]
    'get max row
    Dim rowCount
    Dim colcount
    Dim maxline
' -- ADD BY KAWANA 最終列のタブが保存される不具合を修正 2017.02.16 [S]
    Dim maxCol
    maxCol = 0
' -- ADD BY KAWANA 最終列のタブが保存される不具合を修正 2017.02.16 [E]
    For rowCount = 1 To rowNum
        For colcount = 1 To colnum
            If ws.Cells(rowCount, colcount) <> "" Then
                maxline = rowCount
' -- ADD BY KAWANA 最終列のタブが保存される不具合を修正 2017.02.16 [S]
                If maxCol < colcount Then
                    maxCol = colcount
                End If
' -- ADD BY KAWANA 最終列のタブが保存される不具合を修正 2017.02.16 [E]
            End If
        Next
    Next
    'check data
    Dim arrNotNull() As String
    Dim tempNotNull() As String
    Dim arrNumberType() As String
    Dim tempNumberType() As String
    Dim arrDateType() As String
    Dim tempDateType() As String
    Dim arrDateTimeType() As String
    Dim tempDateTimeType() As String
    Dim arrDuplicateCheck() As String
    Dim tempDuplicateCheck() As String
    
    'Dim isFound As Boolean
    Dim keys As Dictionary
    Set keys = New Dictionary
    
    Dim line
    If readStartRow = "" Then
       readStartRow = 2
    End If
    For line = readStartRow To maxline
      Dim m
      Dim n
      Dim y
      'ColNotNull process
      If ColNotNull <> "" Then
           arrNotNull() = Split(ColNotNull, ",")
           For m = LBound(arrNotNull) To UBound(arrNotNull)
             If InStr(arrNotNull(m), "-") > 0 Then
                  tempNotNull() = Split(arrNotNull(m), "-")
                  For n = tempNotNull(0) To tempNotNull(1)
                    Dim tempSRg1 As Range
                    Set tempSRg1 = ws.Cells(line, n)
                    If tempSRg1 = vbNullString Then
                       'MsgBox ("At Row" & line & "Col" & n & " is null!")
                       ActiveSheet.Cells(line, n).Select
                       MsgBox (line & "行目、" & n & "列目を入力してください。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                       Exit Function
                    End If
                 Next
             Else
                 Dim tempSRg2 As Range
                 Set tempSRg2 = ws.Cells(line, CInt(Trim(arrNotNull(m))))
                 If tempSRg2 = vbNullString Then
                    'MsgBox ("At Row" & line & "Col" & arrNotNull(m) & " is null!")
                    ActiveSheet.Cells(line, CInt(arrNotNull(m))).Select
                    MsgBox (line & "行目、" & arrNotNull(m) & "列目を入力してください。")
                    errFlag = True
                    SaveBook = True
                    GoTo FinallyHandler
                    Exit Function
                 End If
             End If
           Next
      End If
      'ColNumberType process
      If ColNumberType <> "" Then
           arrNumberType() = Split(ColNumberType, ",")
           For m = LBound(arrNumberType) To UBound(arrNumberType)
             If InStr(arrNumberType(m), "-") > 0 Then
                  tempNumberType() = Split(arrNumberType(m), "-")
                  For n = tempNumberType(0) To tempNumberType(1)
                    Dim tempSRg3 As Range
                    Set tempSRg3 = ws.Cells(line, n)
                    If tempSRg3 <> vbNullString Then
                     If Not IsNumeric(tempSRg3) Then
                       'MsgBox ("At Row" & line & "Col" & n & " is not number!")
                       ActiveSheet.Cells(line, n).Select
                       MsgBox (line & "行目、" & n & "列目に数字を入力してください。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                       Exit Function
                     End If
                    End If
                 Next
             Else
                 Dim tempSRg4 As Range
                 Set tempSRg4 = ws.Cells(line, CInt(Trim(arrNumberType(m))))
                 If tempSRg4 <> vbNullString Then
                    If Not IsNumeric(tempSRg4) Then
                    'MsgBox ("At Row" & line & "Col" & n & " is not number!")
                    ActiveSheet.Cells(line, CInt(arrNumberType(m))).Select
                    MsgBox (line & "行目、" & arrNumberType(m) & "列目に数字を入力してください。")
                    errFlag = True
                    SaveBook = True
                    GoTo FinallyHandler
                    Exit Function
                    End If
                 End If
             End If
           Next
      End If
      'ColDateType process
      If ColDateType <> "" Then
           arrDateType() = Split(ColDateType, ",")
           For m = LBound(arrDateType) To UBound(arrDateType)
             If InStr(arrDateType(m), "-") > 0 Then
                  tempDateType() = Split(arrDateType(m), "-")
                  For n = tempDateType(0) To tempDateType(1)
                    Dim tempSRg5 As Range
'                    Dim ttt
'                    ttt = Format(tempSRg5, "hh:mm:ss")
                    Set tempSRg5 = ws.Cells(line, n)
                    If tempSRg5 <> vbNullString Then
                      If Not isDateType(tempSRg5) Then
                       'MsgBox ("At Row" & line & "Col" & n & " is not date!")
                       ActiveSheet.Cells(line, n).Select
                       MsgBox (line & "行目、" & n & "列目に日付（YYYYMMDD）を入力してください。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                       Exit Function
                      End If
                    End If
                    
                 Next
             Else
                 Dim tempSRg6 As Range
                 Set tempSRg6 = ws.Cells(line, CInt(Trim(arrDateType(m))))
                 If tempSRg6 <> vbNullString Then
                   If Not isDateType(tempSRg6) Then
                    'MsgBox ("At Row" & line & "Col" & arrDateType(m) & " is not date!")
                    ActiveSheet.Cells(line, CInt(arrDateType(m))).Select
                    MsgBox (line & "行目、" & arrDateType(m) & "列目に日付（YYYYMMDD）を入力してください。")
                    errFlag = True
                    SaveBook = True
                    GoTo FinallyHandler
                    Exit Function
                   End If
                 End If
                 
             End If
           Next
      End If
      'ColDateTimeType
      If ColDateTimeType <> "" Then
           arrDateTimeType() = Split(ColDateTimeType, ",")
           For m = LBound(arrDateTimeType) To UBound(arrDateTimeType)
             If InStr(arrDateTimeType(m), "-") > 0 Then
                  tempDateTimeType() = Split(arrDateTimeType(m), "-")
                  For n = tempDateTimeType(0) To tempDateTimeType(1)
                    Dim tempSRg7 As Range
                    Set tempSRg7 = ws.Cells(line, n)
                    If tempSRg7 <> vbNullString Then
                      If Not isDateTimeType(tempSRg7) Then
                       'MsgBox ("At Row" & line & "Col" & m & " is not date time!")
                       ActiveSheet.Cells(line, n).Select
                       MsgBox (line & "行目、" & n & "列目に日時（yyyy/mm/dd hh:mm:ss）を入力してください。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                       Exit Function
                      End If
                    End If
                    
                 Next
             Else
                 Dim tempSRg8 As Range
                 Set tempSRg8 = ws.Cells(line, CInt(Trim(arrDateTimeType(m))))
                 If tempSRg7 <> vbNullString Then
                    If Not isDateTimeType(tempSRg8) Then
                        'MsgBox ("At Row" & line & "Col" & arrDateTimeType(m) & " is not date time!")
                        ActiveSheet.Cells(line, CInt(arrDateTimeType(m))).Select
                        MsgBox (line & "行目、" & arrDateTimeType(m) & "列目に日時（yyyy/mm/dd hh:mm:ss）を入力してください。")
                        errFlag = True
                        SaveBook = True
                        GoTo FinallyHandler
                        Exit Function
                    End If
                 End If
                
             End If
           Next
      End If
      'ColDuplicateCheck
      If ColDuplicateCheck <> "" Then
           arrDuplicateCheck() = Split(ColDuplicateCheck, ",")
           For m = LBound(arrDuplicateCheck) To UBound(arrDuplicateCheck)
             If InStr(arrDuplicateCheck(m), "-") > 0 Then
                  tempDuplicateCheck() = Split(arrDuplicateCheck(m), "-")
                  For n = tempDuplicateCheck(0) To tempDuplicateCheck(1)
                    Dim tempSRg9 As Range
                    Set tempSRg9 = ws.Cells(line, n)
                    If tempSRg9 <> vbNullString Then
                      If keys.Exists(CStr(tempSRg9) & CStr(n)) Then
                       'MsgBox ("At Row" & line & "Col" & n & " repeat!")
                       ActiveSheet.Cells(line, n).Select
                       MsgBox (line & "行目、" & n & "列目に重複データが存在します。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                       Exit Function
                      Else
                       If CStr(tempSRg9) <> vbNullString Then
                          keys.Add CStr(tempSRg9) & CStr(n), CStr(tempSRg9)
                       End If
                      End If
                    End If
                    
                  Next

             ElseIf InStr(arrDuplicateCheck(m), "|") > 0 Then
                  Dim tempStr As String
                  tempDuplicateCheck() = Split(arrDuplicateCheck(m), "|")
                  For y = LBound(tempDuplicateCheck) To UBound(tempDuplicateCheck)
                    Dim tempSRg11 As Range
                    Set tempSRg11 = ws.Cells(line, CInt(Trim(tempDuplicateCheck(y))))
                    If CStr(tempSRg11) <> vbNullString Then
                       tempStr = tempStr + CStr(tempSRg11)
                    End If
                  Next
                  If tempStr <> vbNullString Then
                    If keys.Exists(tempStr) Then
                      'MsgBox ("At Row" & line & " repeat!")
                       'upd by yc_li at 2016/09/02 [s]
                       ActiveSheet.rows(line & ":" & line).Select
                       'upd by yc_li at 2016/09/02 [e]
                       MsgBox (line & "行目に重複データが存在します。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                      Exit Function
                    Else
                      If tempStr <> vbNullString Then
                         keys.Add tempStr, tempStr
                         tempStr = ""
                      End If
                    End If
                  End If
                  
             Else
                 Dim tempSRg10 As Range
                 Set tempSRg10 = ws.Cells(line, CInt(Trim(arrDuplicateCheck(m))))
                 If tempSRg10 <> vbNullString Then
                    If keys.Exists(CStr(tempSRg10) & Trim(arrDuplicateCheck(m))) Then
                       'MsgBox ("At Row" & line & "Col" & arrDuplicateCheck(m) & " repeat!")
                       ActiveSheet.Cells(line, CInt(arrDuplicateCheck(m))).Select
                       MsgBox (line & "行目、" & arrDuplicateCheck(m) & "列目に重複データが存在します。")
                       errFlag = True
                       SaveBook = True
                       GoTo FinallyHandler
                       Exit Function
                    Else
                       If CStr(tempSRg10) <> vbNullString Then
                          keys.Add CStr(tempSRg10) & Trim(arrDuplicateCheck(m)), CStr(tempSRg10)
                       End If
                    End If
                 End If
                 
             End If
           Next
      End If

    Next
    
    End If
    'ADD BY YC_LI AT 2016/08/10 [E]
    Dim lastColIndex As Long
' -- MODIFY BY KAWANA 最終列のタブが保存される不具合を修正 2017.02.16 [S]
    lastColIndex = maxCol
' -- MODIFY BY KAWANA 最終列のタブが保存される不具合を修正 2017.02.16 [E]

    Dim bookpath As String
    bookpath = Replace(book.path, DataManageTool.RootPath, "")
    bookpath = Replace(bookpath, "\" & DataManageTool.EXCEL_FILE_PATH & "\", "\" & DataManageTool.TSV_FILE_PATH & "\", 1, 1)
    bookpath = DataManageTool.RootPath & bookpath

    Dim tsvFile As String
    tsvFile = bookpath & "\" & Left(book.name, InStrRev(book.name, ".") - 1) & DataManageTool.TSV_FILE_EXT
    
    Dim file As New FileOutputCtrl
    file.OverwriteFile (tsvFile)

    Dim data As Variant

    Dim i As Long
    Dim j As Long

    Dim rg As Range
    Dim isFound As Boolean

    For i = 1 To eRg.row Step BULK_ROW_COUNT
        j = i + BULK_ROW_COUNT - 1

        If j > eRg.row Then
            j = eRg.row
        End If

        Set rg = ws.Range(ws.Cells(i, 1), ws.Cells(j, lastColIndex))
        data = rg

        If Not Common.IsArrayEx(data) Then

            If data = "" Then
                Exit For
            End If

            Dim wData(0, 0) As Variant
            wData(0, 0) = data
            data = wData
        End If

        isFound = file.WriteFile(data)

        If Not isFound Then
            Exit For
        End If
    Next

    file.CloseFile

    SaveBook = True
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function
'ADD BY YC_LI AT 2016/08/11 [S]
Public Function isDateType(ByVal str As String) As Boolean
   If Len(str) = 8 And IsNumeric(str) Then
     isDateType = True
   Else
     isDateType = False
   End If
End Function

Public Function isDateTimeType(ByVal str As String) As Boolean
    Dim arrSplit() As String
    arrSplit() = Split(str, " ")
    Dim arrDate() As String
    Dim arrTime() As String
    If Len(str) = 19 And UBound(Split(str, "/")) = 2 And UBound(Split(str, ":")) = 2 And UBound(arrSplit) = 1 Then
       arrDate() = Split(arrSplit(0), "/")
       arrTime() = Split(arrSplit(1), ":")
       If UBound(arrDate) = 2 And UBound(arrTime) = 2 Then
         Dim i
         For i = 0 To 2
            If Not (IsNumeric(arrDate(i)) And IsNumeric(arrTime(i))) Then
               isDateTimeType = False
               Exit Function
            End If
         Next
       Else
        isDateTimeType = False
        Exit Function
       End If
    Else
       isDateTimeType = False
       Exit Function
    End If
      isDateTimeType = True
End Function
'ADD BY YC_LI AT 2016/08/11 [E]
Public Function CloseBook(ByVal book As Workbook) As VbMsgBoxResult
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    Dim configPath As String
    configPath = Replace(book.path, DataManageTool.RootPath, "")
    configPath = Replace(configPath, "\" & DataManageTool.EXCEL_FILE_PATH & "\", "\" & DataManageTool.CONFIG_FILE_PATH & "\" & DataManageTool.EXCEL_FILE_PATH & "\", 1, 1)
    configPath = DataManageTool.RootPath & configPath

    Dim config As Dictionary
    Set config = Common.GetConfig(configPath, book.name)
    
    'メイン処理
    Dim ret As VbMsgBoxResult
    ret = ac.ShowMessage("閉じる前にTSVデータを保存しますか？" & vbCrLf & _
                         "はい を押した場合、データのみがテキストファイルで保存されます。" & vbCrLf & _
                         "Excelファイルとして保存する必要がある場合は いいえ を押して下さい。", vbYesNoCancel)

    If ret = vbYes Then
        Dim errFlag As Boolean
        errFlag = False
        Call SaveBook(book, errFlag)
        If errFlag = True Then
           ret = vbCancel
        End If

    ElseIf ret = vbNo Then
        ret = ac.ShowMessage("Excelファイルとして保存しますか？", vbYesNoCancel)

        If ret = vbYes Then
            Dim file As Variant
            file = Application.GetSaveAsFilename(book.FullName)

            If file = False Then
                ret = vbCancel

            Else
                Dim fso As Object
                Set fso = CreateObject("Scripting.FileSystemObject")

                If fso.FileExists(file) Then
                    ret = ac.ShowMessage("ファイルを上書きしますか？", vbOKCancel)

                    If ret = vbOK Then
                        book.SaveAs (file)
                    End If
                Else
                    book.SaveCopyAs (file)
                End If
            End If

        End If
    End If

    CloseBook = ret
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getTsvFiles(ByVal iniFolders As Variant, ByVal bookpath As String, ByVal book As Workbook) As Collection
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    
    'Getgonfigration tsv file
    Dim f_num As Integer
    Dim file As New FileInputCtrl
    Dim isFound As Boolean
    Dim file_c As Collection    'input files collection
    Set file_c = New Collection
    
    For f_num = LBound(iniFolders) To UBound(iniFolders)
        bookpath = ThisWorkbook.path & "\" & DataManageTool.TSV_FILE_PATH & "\" & iniFolders(f_num)
        Dim folders As Collection
        Dim files As Collection
        Dim n, m As Integer
        Dim configTsvName As String
        Set folders = Common.getFolderList(bookpath)
        If folders.count <= 0 Then
            Set files = Common.getFileList(bookpath)
            For m = 1 To files.count
                If (Left(book.name, InStrRev(book.name, ".") - 1) = files(m)) Or InStr(files(m), "role") > 0 Then     ' ("role" = files(m))
                    configTsvName = files(m)
                    bookpath = bookpath & "\" & configTsvName & DataManageTool.TSV_FILE_EXT
                    GoTo outflag
                End If
            Next m
        Else
            For n = 1 To folders.count
                bookpath = ThisWorkbook.path & "\" & DataManageTool.TSV_FILE_PATH & "\" & iniFolders(f_num)
                bookpath = bookpath & "\" & folders(n)
                Set files = Common.getFileList(bookpath)
                For m = 1 To files.count
                    If (Left(book.name, InStrRev(book.name, ".") - 1) = files(m)) Or InStr(files(m), "role") > 0 Then     ' ("role" = files(m))
                        configTsvName = files(m)
                        bookpath = bookpath & "\" & configTsvName & DataManageTool.TSV_FILE_EXT
                        GoTo outflag
                    End If
                Next m
            Next n
        End If
outflag:
        isFound = file.OpenFile(bookpath)
        If isFound Then
            Dim data1 As Variant
            data1 = file.ReadFile
            file_c.Add data1, iniFolders(f_num)
        Else
            'MsgBox "Open File:['" & bookpath & "'] Failed!"
            MsgBox "TSV参照ファイルが存在しません。"
            GoTo FinallyHandler
        End If
    Next
    Set getTsvFiles = file_c
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getOutputColumns(ByVal config As Dictionary, ByVal iniFolders As Variant) As Collection
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    
    Dim strColumns() As String
    Dim finalColumns As Collection
    Set finalColumns = New Collection
    Dim m, n As Integer
        
    Dim strSpreadValue() As String
    Dim isSpreadFlag As Boolean
    isSpreadFlag = False
    Dim temp As String
    If InStr(config(DataOutput.MANAGE_COPY_COLUMNS), ">") > 0 Or InStr(config(DataOutput.MANAGE_COPY_COLUMNS), "<") > 0 Then
        temp = Mid(config(DataOutput.MANAGE_COPY_COLUMNS), InStr(config(DataOutput.MANAGE_COPY_COLUMNS), "<") + 1, InStr(config(DataOutput.MANAGE_COPY_COLUMNS), ">") - InStr(config(DataOutput.MANAGE_COPY_COLUMNS), "<") - 1)
        isSpreadFlag = True
        strSpreadValue = Split(temp, ",")
    End If
    
    Dim folderName As String
        
    If Not isSpreadFlag Then
        strColumns = Split(config(DataOutput.MANAGE_COPY_COLUMNS), ",")
        If UBound(iniFolders) > 0 Then
            For m = LBound(strColumns) To UBound(strColumns)
                If InStr(strColumns(m), ".") <= 0 And InStr(strColumns(m), """") <= 0 Then
                    'MsgBox "The cofigration of ""InitializeCopyColumns"" is Incorrect!"
                    MsgBox "設定ファイルの""InitializeCopyColumns""が不正です。"
                    GoTo FinallyHandler
                ElseIf InStr(strColumns(m), "-") Then
                    folderName = Split(strColumns(m), ".")(0)
                    For n = CInt(Split(Split(strColumns(m), ".")(1), "-")(0)) To CInt(Split(Split(strColumns(m), ".")(1), "-")(1))
                        finalColumns.Add folderName & "." & n
                    Next
                Else
                    finalColumns.Add strColumns(m)
                End If
            Next
        Else
            For m = LBound(strColumns) To UBound(strColumns)
                If IsNumeric(strColumns(m)) Then
                    finalColumns.Add iniFolders(0) & "." & strColumns(m)
                ElseIf InStr(strColumns(m), "-") Then
                    For n = CInt(Split(Split(strColumns(m), ".")(1), "-")(0)) To CInt(Split(Split(strColumns(m), ".")(1), "-")(1))
                        finalColumns.Add iniFolders(0) & "." & n
                    Next
                Else
                    finalColumns.Add Replace(strColumns(m), """", "")
                End If
            Next
        End If
    Else
        strColumns = Split(Split(config(DataOutput.MANAGE_COPY_COLUMNS), ",<")(0), ",")
    
        For m = LBound(strColumns) To UBound(strColumns)
            If InStr(strColumns(m), ".") <= 0 And InStr(strColumns(m), """") <= 0 Then
                'MsgBox "The cofigration of ""InitializeCopyColumns"" is Incorrect!"
                MsgBox "設定ファイルの""InitializeUinqueColumns""が不正です。"
                GoTo FinallyHandler
            ElseIf InStr(strColumns(m), "-") Then
                folderName = Split(strColumns(m), ".")(0)
                For n = CInt(Split(Split(strColumns(m), ".")(1), "-")(0)) To CInt(Split(Split(strColumns(m), ".")(1), "-")(1))
                    finalColumns.Add folderName & "." & n
                Next
            Else
                finalColumns.Add Replace(strColumns(m), """", "")
            End If
        Next
        
        'Check Config SpreadColumns' Format
        Dim spreadNum As String
        spreadNum = Split(config(DataOutput.MANAGE_SPREAD_COLUMNS), ",")(1)
        folderName = Split(temp, ".")(0)
        Dim splitNum As Integer
        splitNum = 0
        For m = LBound(strSpreadValue) To UBound(strSpreadValue)
            If InStr(strSpreadValue(m), "-") Then
                For n = CInt(Split(Split(strSpreadValue(m), ".")(1), "-")(0)) To CInt(Split(Split(strSpreadValue(m), ".")(1), "-")(1))
                    finalColumns.Add folderName & "." & n
                    splitNum = splitNum + 1
                Next
            ElseIf InStr(strSpreadValue(m), ".") Then
                finalColumns.Add strSpreadValue(m)
                splitNum = splitNum + 1
            ElseIf InStr(strSpreadValue(m), """") Then
                finalColumns.Add Replace(strSpreadValue(m), """", "")
                splitNum = splitNum + 1
            Else
                finalColumns.Add folderName & "." & strSpreadValue(m)
                splitNum = splitNum + 1
            End If
        Next
        If CInt(spreadNum) <> splitNum Then
           'MsgBox "The cofigration of ""InitializeCopyColumns"" and ""InitializeSpreadColumns"" is not match!"
           MsgBox "設定ファイルの ""InitializeCopyColumns""、""InitializeSpreadColumns"" が不正です。"
           GoTo FinallyHandler
        End If
    End If
    Set getOutputColumns = finalColumns
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function getSheetValue(ByVal iniFolder As String, ByVal config As Dictionary, ByVal isSpreadFlag As Boolean, ByVal finalColumns As Variant, ByVal file_c As Collection) As Collection
    Dim sheetRowValue As Collection
    Dim sheetValue As Collection
    Dim readTitleRow As Integer
    If config(DataOutput.MANAGE_READ_TITLE_ROW) = "" Then
        readTitleRow = 1
    Else
        readTitleRow = config(DataOutput.MANAGE_READ_TITLE_ROW)
    End If
    Dim readStartRow As Integer
    If config(DataOutput.MANAGE_READ_START_ROW) = "" Then
        readStartRow = 2
    Else
        readStartRow = config(DataOutput.MANAGE_READ_START_ROW)
    End If
    
    Set sheetValue = New Collection
    
    Dim data2, data3 As Variant
    Dim m, n, x, y, spreadColumnBegin, spreadColumnEnd As Integer
    data2 = file_c(Split(iniFolder, ",")(0))
    'For m = LBound(data2) To UBound(data2)
     For m = readTitleRow To UBound(data2)
        If m > readTitleRow And m < readStartRow Then
            GoTo nextRow
        End If
        Set sheetRowValue = New Collection
        For n = 1 To finalColumns.count
            If isSpreadFlag Then
                spreadColumnBegin = CInt(Split(config(DataOutput.MANAGE_SPREAD_COLUMNS), ",")(0))
                spreadColumnEnd = CInt(Split(config(DataOutput.MANAGE_SPREAD_COLUMNS), ",")(1)) + spreadColumnBegin - 1
                If n >= spreadColumnBegin And n <= spreadColumnEnd Then
                    data3 = file_c(Split(finalColumns(spreadColumnBegin), ".")(0))
                    'For x = LBound(data3) + 1 To UBound(data3)
                    For x = readStartRow To UBound(data3)
                        For y = spreadColumnBegin To spreadColumnEnd
                            If InStr(finalColumns(y), ".") > 0 Then
                                'If m = 1 Then
                                If m = readTitleRow Then
                                    sheetRowValue.Add data3(m, CInt(Split(finalColumns(y), ".")(1)))
                                    n = y
                                Else
                                    sheetRowValue.Add data3(x, CInt(Split(finalColumns(y), ".")(1)))
                                    n = y
                                End If
                            Else
                                'If m = 1 Then
                                If m = readTitleRow Then
                                    sheetRowValue.Add finalColumns(y)
                                    n = y
                                Else
                                    sheetRowValue.Add ""
                                    n = y
                                End If
                            End If
                        Next y
                    Next x
                Else
                    If InStr(finalColumns.item(n), ".") > 0 Then
                        sheetRowValue.Add data2(m, CInt(Split(finalColumns(n), ".")(1)))
                    Else
                        'If m = 1 Then
                                If m = readTitleRow Then
                            sheetRowValue.Add finalColumns(n)
                        Else
                            sheetRowValue.Add ""
                        End If
                    End If
                End If
            Else
               
                If InStr(finalColumns(n), ".") > 0 Then
                    sheetRowValue.Add data2(m, CInt(Split(finalColumns(n), ".")(1)))
                Else
                    If m = 1 Then
                        sheetRowValue.Add finalColumns(n)
                    Else
                        sheetRowValue.Add ""
                    End If
                End If
            End If
        Next n
        sheetValue.Add sheetRowValue
nextRow:
    Next m
    Set getSheetValue = sheetValue
End Function


Public Function getColumnsNo(ByVal configValue As String, ByVal iniFolders As Variant, ByVal finalColumns As Collection) As Collection
    'Get Configration of unique colunms
    Dim tempUniqueColumns() As String
    Dim uniqueColumns As Collection
    Dim uniqueColumnsNo As Collection
    Set uniqueColumns = New Collection
    Set uniqueColumnsNo = New Collection
    Dim m, n, num1 As Integer
    Dim num2 As Integer
    Dim uniqueFlag As Boolean
    uniqueFlag = False
    Dim folderName As String
    tempUniqueColumns = Split(configValue, ",")   'Split(config(DataOutput.MANAGE_UNIQUE_COLUMNS), ",")
    If UBound(tempUniqueColumns) >= 0 Then
        If UBound(iniFolders) > 0 Then
            For m = LBound(tempUniqueColumns) To UBound(tempUniqueColumns)
                If InStr(tempUniqueColumns(m), ".") <= 0 Then
                    'MsgBox "The cofigration of ""InitializeUinqueColumns"" is Incorrect!"
                    MsgBox "設定ファイルの""InitializeUinqueColumns""が不正です。"
                    Exit For
                ElseIf InStr(tempUniqueColumns(m), "-") Then
                    folderName = Split(tempUniqueColumns(m), ".")(0)
                    For n = CInt(Split(Split(tempUniqueColumns(m), ".")(1), "-")(0)) To CInt(Split(Split(tempUniqueColumns(m), ".")(1), "-")(1))
                        uniqueColumns.Add folderName & "." & n
                    Next
                Else
                    uniqueColumns.Add tempUniqueColumns(m)
                End If
            Next
        Else
           
            For m = LBound(tempUniqueColumns) To UBound(tempUniqueColumns)
                If IsNumeric(tempUniqueColumns(m)) Then
                    uniqueColumns.Add iniFolders(0) & "." & tempUniqueColumns(m)
                ElseIf InStr(tempUniqueColumns(m), "-") Then
                    For n = CInt(Split(Split(tempUniqueColumns(m), ".")(1), "-")(0)) To CInt(Split(Split(tempUniqueColumns(m), ".")(1), "-")(1))
                        uniqueColumns.Add iniFolders(0) & "." & n
                    Next
                Else
                    uniqueColumns.Add tempUniqueColumns(m)
                End If
            Next
        End If
        For num1 = 1 To finalColumns.count
            For num2 = 1 To uniqueColumns.count
                If uniqueColumns(num2) = finalColumns(num1) Then
                    uniqueColumnsNo.Add num1
                End If
            Next num2
        Next num1
        uniqueFlag = True
    End If
    
    Set getColumnsNo = uniqueColumnsNo
End Function

Public Function createIniData(ByVal sheetValue As Collection, ByVal uniqueColumnsNo As Collection, ByVal nullSkipColumnsNo As Collection, ByVal book As Workbook) As Boolean
    Dim ws1 As Worksheet
    Set ws1 = book.Sheets(DATA_SHEET_NAME)
    ws1.Columns.AutoFit
    ws1.rows.AutoFit
    
    ws1.Columns.Clear
    
    
    Dim rowCount1, num1, num2 As Integer
    Dim realCount As Integer
    realCount = 2
    Dim colCount1 As Integer
    Dim skipUniqueFlag, skipNullFlag As Boolean
    skipUniqueFlag = True
    skipNullFlag = True
    
    For rowCount1 = 1 To sheetValue.count
        If Not skipUniqueFlag And Not skipNullFlag Then
            realCount = realCount + 1
        End If
        
        skipUniqueFlag = True
        skipNullFlag = True
        For colCount1 = 1 To sheetValue(rowCount1).count
           If (uniqueColumnsNo.count > 0 Or nullSkipColumnsNo.count > 0) And rowCount1 > 1 Then
               If uniqueColumnsNo.count > 0 Then
                   For num1 = 1 To uniqueColumnsNo.count
                       If sheetValue(rowCount1)(uniqueColumnsNo(num1)) <> sheetValue(rowCount1 - 1)(uniqueColumnsNo(num1)) Then
                           skipUniqueFlag = False
                           Exit For
                        End If
                    Next num1
                Else
                    skipUniqueFlag = False
                End If
                If nullSkipColumnsNo.count > 0 Then
                   For num2 = 1 To nullSkipColumnsNo.count
                       'If rowCount1 > 1 Then
                        If sheetValue(rowCount1)(nullSkipColumnsNo(num2)) <> "" Then
                            skipNullFlag = False
                            Exit For
                        End If
                       'End If
                    Next num2
                Else
                    skipNullFlag = False
                End If
                If skipUniqueFlag Or skipNullFlag Then
                    GoTo nextRow
                Else
                    ws1.Cells(realCount, colCount1).value = sheetValue(rowCount1)(colCount1)
                   
                End If
            Else
                ws1.Cells(rowCount1, colCount1).value = sheetValue(rowCount1)(colCount1)
                 
            End If
        Next colCount1
nextRow:
    Next rowCount1
    ws1.Columns.AutoFit
    ws1.rows.AutoFit
    createIniData = True
    
End Function


