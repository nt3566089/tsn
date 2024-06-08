Attribute VB_Name = "DBFluteDfpropOutput"
Option Explicit

Private Const DEFAULT_CHAR_SET As String = "UTF-8"
Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"

Private m_as As ADODB.Stream
Private m_filePath As String
Private m_sb As StringBuilder

Function EmptyArr(ByRef x() As String) As Boolean
Dim tempStr As String
tempStr = Join(x, ",")
EmptyArr = LenB(tempStr) <= 0
End Function

'ADD BY YC_LI AT 2016/08/05 [S]
Public Sub create_def_map(ByVal tsvNm As String, ByVal target As String)
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    Dim outstrBase, outstrCenter, outstr
    'ADD BY LYC AT 2016/11/29 [S]
    Set config(0) = Common.GetConfig(DataManageTool.configPath, target)
    
    Dim ClassInputFolder
    Dim ClassificationDefinitionMapFile
    Dim ClassCd, ClassComment, ClassDtlCd, ClassDtlDictNm
    
    ClassInputFolder = config(0)(DataManageTool.CLASS_INPUT_FOLDER)

    ClassCd = config(0)(DataManageTool.CLASS_CD)
    ClassComment = config(0)(DataManageTool.CLASS_COMMENT)
    ClassDtlCd = config(0)(DataManageTool.CLASS_DTL_CD)
    ClassDtlDictNm = config(0)(DataManageTool.CLASS_DEL_DICT_NM)
    'check config
    Dim arrClassInputFolder() As String
    Dim arrClassCd() As String
    Dim arrClassComment() As String
    Dim arrClassDtlCd() As String
    Dim arrClassDtlDictNm() As String
    
    Dim arrLenth
    If ClassInputFolder = "" Then
       Exit Sub
    End If
    arrClassInputFolder() = Split(ClassInputFolder, ",")
    arrClassCd() = Split(ClassCd, ",")
    arrClassComment() = Split(ClassComment, ",")
    arrClassDtlCd() = Split(ClassDtlCd, ",")
    arrClassDtlDictNm() = Split(ClassDtlDictNm, ",")
    
    arrLenth = UBound(arrClassInputFolder)
    If arrLenth <> UBound(arrClassCd) Then
       MsgBox ("設定ファイルにClassCdの項目個数が間違います。(ClassInputFolderの個数と一致してください。)")
       Exit Sub
    End If
    If arrLenth <> UBound(arrClassComment) Then
       MsgBox ("設定ファイルにClassCommentの項目個数が間違います。(ClassInputFolderの個数と一致してください。)。")
       Exit Sub
    End If
    If arrLenth <> UBound(arrClassDtlCd) Then
       MsgBox ("設定ファイルにClassDtlCdの項目個数が間違います。(ClassInputFolderの個数と一致してください。)")
       Exit Sub
    End If
    If arrLenth <> UBound(arrClassDtlDictNm) Then
       MsgBox ("設定ファイルにClassDtlDictNmの項目個数が間違います。(ClassInputFolderの個数と一致してください。)")
       Exit Sub
    End If
    'check output file num
    Dim DataOutputFileName
    Dim hasMultipleFile As Boolean
    hasMultipleFile = False
    
    DataOutputFileName = config(0)(DataManageTool.CLASSIFICATION_DEFINITION_MAPFILE)
    If DataOutputFileName = vbNullString Then
       Exit Sub
    End If
    
    If UBound(Split(DataOutputFileName, ",")) > 0 Then
        If UBound(Split(DataOutputFileName, ",")) <> arrLenth Then
            MsgBox ("設定ファイルにDataOutputFileNameの項目個数が間違います。(ClassInputFolderの個数と一致してください。)")
           Exit Sub
        End If
        If Split(DataOutputFileName, ",")(0) = Split(DataOutputFileName, ",")(1) Then
           MsgBox ("設定ファイルのClassificationDefinitionMapFileにの出力ファイルが重複です。")
           Exit Sub
        End If
        hasMultipleFile = True
    End If
    
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana Start
    Dim startText, endText As String
    startText = Replace(config(0)(DataManageTool.CLASSIFICATION_DEFINITION_MAP_START_TEXT), vbLf, vbCrLf)
    endText = Replace(config(0)(DataManageTool.CLASSIFICATION_DEFINITION_MAP_END_TEXT), vbLf, vbCrLf)
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana End
    
    Dim DataOutputFolder
    DataOutputFolder = config(0)(DataManageTool.DATE_OUTPUT_FOLDER)
    Dim fileNm As String
    
    For arrLenth = LBound(arrClassInputFolder) To UBound(arrClassInputFolder)
        If hasMultipleFile = False Then
           outstrBase = outstrBase & createBaseOutput(arrClassInputFolder(arrLenth), arrClassCd(arrLenth), arrClassComment(arrLenth), arrClassDtlCd(arrLenth), arrClassDtlDictNm(arrLenth), target)
        Else
             outstrBase = createBaseOutput(arrClassInputFolder(arrLenth), arrClassCd(arrLenth), arrClassComment(arrLenth), arrClassDtlCd(arrLenth), arrClassDtlDictNm(arrLenth), target)
             If DataOutputFolder = "" Then
                fileNm = DataManageTool.RootPath & "\" & DataOutputFileName
             Else
                fileNm = DataManageTool.RootPath & "\" & DataOutputFolder & "\" & Split(DataOutputFileName, ",")(arrLenth)
             End If
             
             If Dir(fileNm, vbDirectory) = vbNullString Then
                If Not Common.createMultiLevelFolder(fileNm) Then
                   GoTo FinallyHandler
                End If
             End If
            
             Set m_as = New ADODB.Stream
             m_as.Type = adTypeText
             m_as.Charset = DEFAULT_CHAR_SET
             m_as.LineSeparator = adCRLF
             m_as.Open
             
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana Start
            outstrBase = startText + vbCrLf + vbCrLf + outstrBase + vbCrLf + endText
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana End

             Call m_as.WriteText(outstrBase, adWriteChar)
             'ファイル保存
             Call m_as.SaveToFile(fileNm, adSaveCreateOverWrite)
        End If
    Next
    If hasMultipleFile = False Then
        If DataOutputFolder = "" Then
           fileNm = DataManageTool.RootPath & "\" & DataOutputFileName
        Else
           fileNm = DataManageTool.RootPath & "\" & DataOutputFolder & "\" & DataOutputFileName
        End If

        If Dir(fileNm, vbDirectory) = vbNullString Then
           If Not Common.createMultiLevelFolder(fileNm) Then
              GoTo FinallyHandler
           End If
        End If
        Set m_as = New ADODB.Stream
        m_as.Type = adTypeText
        m_as.Charset = DEFAULT_CHAR_SET
        m_as.LineSeparator = adCRLF
        m_as.Open
    
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana Start
        outstrBase = startText + vbCrLf + vbCrLf + outstrBase + vbCrLf + endText
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana End

        Call m_as.WriteText(outstrBase, adWriteChar)
        'ファイル保存
        Call m_as.SaveToFile(fileNm, adSaveCreateOverWrite)
    End If
    
    'ADD BY LYC AT 2016/11/29 [E]

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub
Public Function createBaseOutput(ByVal ClassInputFolder As String, ByVal ClassCd As String, ByVal ClassComment As String, ByVal ClassDtlCd As String, ByVal ClassDtlDictNm As String, ByVal target As String) As String
 
    Set config(0) = Common.GetConfig(DataManageTool.configPath, target)
    
    Dim DataOutputFolder, ListDataInputFolder, AdditionalForeignKeyMapFile
    Dim ClassificationDefinitionMapFile, ClassificationDeploymentMapFile, ListDataInputReadStartRow, ClassDataInputReadStartRow
    Dim UseTableName, UseTable, UseColumn, UseClassCd, UseIdentify, CloumnPhysicalNm
    Dim dfpropOutputExcept, deploymentExceptFolder, excludeCd
    
    Dim arrDfpropOutputExcept() As String

'    ClassInputFolder = config(0)(DataManageTool.CLASS_INPUT_FOLDER)
    
    ClassDataInputReadStartRow = config(0)(DataManageTool.CLASS_DATE_INPUT_READ_STARTROW)
    
'    ClassCd = config(0)(DataManageTool.CLASS_CD)
'    ClassComment = config(0)(DataManageTool.CLASS_COMMENT)
'    ClassDtlCd = config(0)(DataManageTool.CLASS_DTL_CD)
'    ClassDtlDictNm = config(0)(DataManageTool.CLASS_DEL_DICT_NM)

    dfpropOutputExcept = config(0)(DataManageTool.DFPROP_OUTPUT_EXCEPT)
    If dfpropOutputExcept <> vbNullString Then
       arrDfpropOutputExcept() = Split(dfpropOutputExcept, ",")
    End If
    
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
    
    Dim list As Collection
    Set list = Common.getFolderList(tsvFolder)
    
    'メイン処理
    Dim isFound As Boolean
    Dim file As New FileInputCtrl
    isFound = file.OpenFile(tsvFile)

    If Not isFound Then
    '    GoTo FinallyHandler
    End If

    Dim data As Variant
    data = file.ReadFile
    
    Dim outstr
    
    Dim DEF_START_STR, DEF_END_STR, CENTER_DEF_START_STR, CENTER_DEF_END_STR
    Dim DEF_STR, DEF_VALUE_STR, FK_DEF_START_STR, FK_DEF_END_STR, CENTER_DEF_STR
    
    DEF_STR = _
    "    #区分値マスタ (((CLS_CD_T)))" + vbCrLf + _
    "    ; (((CLS_CD_CAMEL))) = list:{" + vbCrLf + _
    "        ; map:{topComment=(((CLS_CD_T))); codeType=String ; isCheckImplicitSet=false}" + vbCrLf + _
    "(((VALUE_AREA)))" + _
    "    }" + vbCrLf
    
    CENTER_DEF_STR = _
    "    #センタ区分値マスタ (((CLS_CD_T)))" + vbCrLf + _
    "    ; Center(((CLS_CD_CAMEL))) = list:{" + vbCrLf + _
    "        ; map:{topComment=(((CLS_CD_T))); codeType=String ; isCheckImplicitSet=false}" + vbCrLf + _
    "(((VALUE_AREA)))" + _
    "    }" + vbCrLf
    
    DEF_VALUE_STR = _
    "        ; map:{code=(((VALUE))); name=$(((VALUE))); comment=(((VALUE_T)))}" + vbCrLf
    
    DEF_START_STR = _
    "    ##########ここからは区分値マスタの区分値定義" + vbCrLf
    DEF_END_STR = _
    "    ##########ここまでは区分値マスタの区分値定義" + vbCrLf
    CENTER_DEF_START_STR = _
    "    ##########ここからはセンタ区分値マスタの区分値定義" + vbCrLf
    CENTER_DEF_END_STR = _
    "    ##########ここまではセンタ区分値マスタの区分値定義" + vbCrLf
      
    Dim no, cd, cdT, value, valueT
    Dim firstNo, lastNo
    
    If ClassInputFolder = "class" Then
       outstr = DEF_START_STR
    Else
       outstr = CENTER_DEF_START_STR
    End If
 
    Dim defStrMap
    Dim valueMap
    Dim valueList
    Dim keys
    Dim tmpStr, tmpStrV
    
    Set defStrMap = New Collection
    Set valueMap = New Collection
    Set keys = New Collection
    Dim i As Integer
    For i = LBound(data, 1) To UBound(data, 1)
    
    If i < CInt(ClassDataInputReadStartRow) Then GoTo continue1
    
        no = data(i, CInt(ClassCd))
        cd = data(i, CInt(ClassCd))
        cdT = data(i, CInt(ClassComment))
        value = data(i, CInt(ClassDtlCd))
        valueT = data(i, CInt(ClassDtlDictNm))
        
        If IsNull(cd) Or cd = "" Or _
          IsNull(cdT) Or cdT = "" Or _
          IsNull(value) Or value = "" Or _
          IsNull(valueT) Or valueT = "" Then
          
            Exit For
        End If
        ' --- 除外 ---
        If Not EmptyArr(arrDfpropOutputExcept()) Then
            For Each excludeCd In arrDfpropOutputExcept
                If excludeCd = cd Then
                    GoTo continue1
                End If
            Next
        End If
       
        
        tmpStrV = DEF_VALUE_STR
        tmpStrV = Replace(tmpStrV, "$(((VALUE)))", "$" + Replace(Replace(value, "-", "_"), " ", "hsp"), 1, 2)
        tmpStrV = Replace(tmpStrV, "(((VALUE)))", Replace(value, " ", "\u0020"), 1, 2)
        tmpStrV = Replace(tmpStrV, "(((VALUE_T)))", valueT, 1, 1)
        
        On Error Resume Next
        Set valueList = valueMap.item(cd)
        'エラーが有ればキーは存在しない
        If Err Then
            Set valueList = New Collection
            valueList.Add tmpStrV
            
            valueMap.Add valueList, cd
            If ClassInputFolder = "class" Then
               tmpStr = DEF_STR
            Else
               tmpStr = CENTER_DEF_STR
            End If

            tmpStr = Replace(tmpStr, "(((CLS_CD_CAMEL)))", Replace(StrConv(Replace(cd, "_", " "), vbProperCase), " ", ""), 1, 1)
            tmpStr = Replace(tmpStr, "(((CLS_CD_T)))", cdT, 1, 2)
            
            defStrMap.Add tmpStr, cd
            
            keys.Add cd
            
        Else
            valueList.Add tmpStrV
        End If
        On Error GoTo 0
        
        lastNo = no
continue1:
    Next i
    
    Dim valueAreaStr
    Dim k As Variant
    For Each k In keys
    
        'Set valueList = New Collection
        'valueList = valueMap.item(k)
        Set valueList = valueMap.item(k)
        tmpStr = defStrMap.item(k)
        
        valueAreaStr = ""
        Dim valueStr As Variant
        For Each valueStr In valueList
            valueAreaStr = valueAreaStr + valueStr
        Next
        
        tmpStr = Replace(tmpStr, "(((VALUE_AREA)))", valueAreaStr, 1, 1)
        
        outstr = outstr + tmpStr
    Next

    If ClassInputFolder = "class" Then
       outstr = outstr + DEF_END_STR
    Else
       outstr = outstr + CENTER_DEF_END_STR
    End If
   
    createBaseOutput = outstr
    
End Function

Public Sub create_deploy_map(ByVal tsvNm As String, ByVal target As String)
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    Dim FK_DEF_START_STR, FK_DEF_END_STR
    
    FK_DEF_START_STR = _
    "    ##########ここからは区分値マスタの使用テーブル定義" + vbCrLf
    FK_DEF_END_STR = _
    "    ##########ここまでは区分値マスタの使用テーブル定義" + vbCrLf

    Dim deployStrTableMap As Collection
    Dim deployStrColumnMap As Collection
    Dim deployStrMapKeys As Collection

    Set deployStrTableMap = New Collection
    Set deployStrColumnMap = New Collection
    Set deployStrMapKeys = New Collection
      
      
    ' ----- 基盤の区分値作成
    createBaseOutput2 deployStrTableMap, deployStrColumnMap, deployStrMapKeys, tsvNm, target
    'createBaseOutput2 tsvNm, target
    
    Dim outstr
    outstr = FK_DEF_START_STR
    
    Dim DEPLOY_STR, DEPLOY_VALUE_STR
    Dim tb, item, fkCd, tmpStr, tmpStrV
    Dim valueAreaStr
    Dim valueList
    Dim k As Variant
    For Each k In deployStrMapKeys
        
        Set valueList = deployStrColumnMap.item(k)
        
        tmpStr = deployStrTableMap.item(k)

        valueAreaStr = ""
        Dim valueStr As Variant
        For Each valueStr In valueList
            valueAreaStr = valueAreaStr + valueStr
        Next
        
        tmpStr = Replace(tmpStr, "(((VALUE_AREA)))", valueAreaStr, 1, 1)
        
        outstr = outstr + tmpStr
    Next

    outstr = outstr + FK_DEF_END_STR
    
    Dim DataOutputFolder
    DataOutputFolder = config(0)(DataManageTool.DATE_OUTPUT_FOLDER)
    Dim DataOutputFileName
    DataOutputFileName = config(0)(DataManageTool.CLASSIFICATION_DELOYMENT_MAPFILE)
    If DataOutputFileName = vbNullString Then
       Exit Sub
    End If
    
    Dim fileNm As String
    If DataOutputFolder = "" Then
       fileNm = DataManageTool.RootPath & "\" & DataOutputFileName
    Else
       fileNm = DataManageTool.RootPath & "\" & DataOutputFolder & "\" & DataOutputFileName
    End If
    
    If Dir(fileNm, vbDirectory) = vbNullString Then
       If Not Common.createMultiLevelFolder(fileNm) Then
          GoTo FinallyHandler
       End If
    End If
   
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana Start
    Dim startText, endText As String
    startText = Replace(config(0)(DataManageTool.CLASSIFICATION_DEPLOYMENT_MAP_START_TEXT), vbLf, vbCrLf)
    endText = Replace(config(0)(DataManageTool.CLASSIFICATION_DEPLOYMENT_MAP_END_TEXT), vbLf, vbCrLf)

    outstr = startText + vbCrLf + vbCrLf + outstr + vbCrLf + endText
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana End
   
    Set m_as = New ADODB.Stream
    m_as.Type = adTypeText
    m_as.Charset = DEFAULT_CHAR_SET
    m_as.LineSeparator = adCRLF
    m_as.Open
    
    Call m_as.WriteText(outstr, adWriteChar)
    'ファイル保存
    Call m_as.SaveToFile(fileNm, adSaveCreateOverWrite)
    
'    MsgBox "作成完了"
   
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

Public Function createBaseOutput2(ByRef deployStrMap As Collection, ByRef valueMap As Collection, ByRef keys As Collection, ByVal tsvNm As String, ByVal target As String)
   
    Set config(0) = Common.GetConfig(DataManageTool.configPath, target)
    
    Dim DataOutputFolder, ListDataInputFolder, ClassInputFolder, AdditionalForeignKeyMapFile
    Dim ClassificationDefinitionMapFile, ClassificationDeploymentMapFile, ListDataInputReadStartRow, ClassDataInputReadStartRow
    Dim ClassCd, ClassComment, ClassDtlCd, ClassDtlDictNm, UseTableName, UseTable, UseColumn, UseClassCd, UseIdentify, CloumnPhysicalNm
    Dim dfpropOutputExcept, deploymentExceptFolder, excludeCd, excludeDeploy
    Dim arrDfpropOutputExcept() As String
    
    DataOutputFolder = config(0)(DataManageTool.DATE_OUTPUT_FOLDER)
    ListDataInputFolder = config(0)(DataManageTool.LIST_DATE_INPUT_FOLDER)
    ClassInputFolder = config(0)(DataManageTool.CLASS_INPUT_FOLDER)
    AdditionalForeignKeyMapFile = config(0)(DataManageTool.ADDITIONAL_FOREIGNKEY_MAPFILE)
    ClassificationDefinitionMapFile = config(0)(DataManageTool.CLASSIFICATION_DEFINITION_MAPFILE)
    ClassificationDeploymentMapFile = config(0)(DataManageTool.CLASSIFICATION_DELOYMENT_MAPFILE)
    
    ListDataInputReadStartRow = config(0)(DataManageTool.LISTDATE_INPUTREAD_STARTROW)
    ClassDataInputReadStartRow = config(0)(DataManageTool.CLASS_DATE_INPUT_READ_STARTROW)
    ClassCd = config(0)(DataManageTool.CLASS_CD)
    ClassComment = config(0)(DataManageTool.CLASS_COMMENT)
    ClassDtlCd = config(0)(DataManageTool.CLASS_DTL_CD)
    ClassDtlDictNm = config(0)(DataManageTool.CLASS_DEL_DICT_NM)
    UseTableName = config(0)(DataManageTool.USER_TABLE_NAME)
    UseTable = config(0)(DataManageTool.USER_TABLE)
    UseColumn = config(0)(DataManageTool.USER_COLUMN)
    CloumnPhysicalNm = config(0)(DataManageTool.CLOUMN_PHYSICAL_NM)
    UseClassCd = config(0)(DataManageTool.USER_CLASS_CD)
    UseIdentify = config(0)(DataManageTool.USER_IDENTIFY)
    dfpropOutputExcept = config(0)(DataManageTool.DFPROP_OUTPUT_EXCEPT)
    deploymentExceptFolder = config(0)(DataManageTool.DEPLOYMENT_EXCEPT_FOLDER)
    
    Dim file2 As New FileInputCtrl
    If deploymentExceptFolder <> vbNullString Then
         'メイン処理
        Dim deploymentTsvFolder As String
        Dim deploymentTsvFile As String
        deploymentTsvFolder = DataManageTool.TsvPath & "\" & deploymentExceptFolder
        deploymentTsvFile = deploymentTsvFolder & "\" & deploymentExceptFolder & DataManageTool.TSV_FILE_EXT
        Dim isFound2 As Boolean
        isFound2 = file2.OpenFile(deploymentTsvFile)
    End If
    If isFound2 Then
       Dim data2 As Variant
       data2 = file2.ReadFile
    End If
   
    
    If dfpropOutputExcept <> vbNullString Then
       arrDfpropOutputExcept() = Split(dfpropOutputExcept, ",")
    End If
    
    If ListDataInputFolder = "" Then
       Exit Function
    End If
    If ListDataInputReadStartRow = "" Then
       ListDataInputReadStartRow = "2"
    End If

    'メイン処理
    Dim tsvFolder As String

    tsvFolder = DataManageTool.TsvPath & "\" & ListDataInputFolder

    Dim tsvFile As String
    tsvFile = tsvFolder & "\" & ListDataInputFolder & DataManageTool.TSV_FILE_EXT
    
    Dim list As Collection
    Set list = Common.getFolderList(tsvFolder)
    
    'メイン処理
    Dim isFound As Boolean

    Dim file As New FileInputCtrl
    isFound = file.OpenFile(tsvFile)

    If Not isFound Then
    '    GoTo FinallyHandler
    End If

    Dim data As Variant
    data = file.ReadFile
    
    Dim DEPLOY_STR, DEPLOY_VALUE_STR, FK_DEF_START_STR, FK_DEF_END_STR
    
    DEPLOY_STR = _
    "    # 区分値定義 (((TB_NM_T)))" + vbCrLf + _
    "    ; (((TB_NM))) = map:{" + vbCrLf + _
    "(((VALUE_AREA)))" + _
    "    }" + vbCrLf
    
    DEPLOY_VALUE_STR = "        ; (((CLM_NM))) = (((FK_CD_CAMEL)))" + vbCrLf
    
    Dim CENTER_DEPLOY_VALUE_STR
    
    CENTER_DEPLOY_VALUE_STR = "        ; (((CLM_NM))) = Center(((FK_CD_CAMEL)))" + vbCrLf
    
    On Error Resume Next


    Dim no, tb, tbT, item, fkCd, identify
    Dim valueList
    Dim tmpStr, tmpStrV
    
    Dim i As Integer
    For i = CInt(ListDataInputReadStartRow) To UBound(data, 1)
    
        no = CStr(data(i, CInt(UseTable)))
        tb = CStr(data(i, CInt(UseTable)))
        tbT = CStr(data(i, CInt(UseTableName)))
        item = CStr(data(i, CInt(CloumnPhysicalNm)))
        fkCd = CStr(data(i, CInt(UseClassCd)))
        identify = CStr(data(i, CInt(UseIdentify)))
        
       If IsNull(tb) Or tb = "" Or _
          IsNull(tbT) Or tbT = "" Or _
          IsNull(item) Or item = "" Or _
          IsNull(fkCd) Or fkCd = "" Then
          
            Exit For
        End If
         ' --- 除外 ---
        If Not EmptyArr(arrDfpropOutputExcept()) Then
            For Each excludeCd In arrDfpropOutputExcept
                If excludeCd = fkCd Then
                    GoTo continue1
                End If
            Next
        End If
        If isFound2 Then
            Dim j As Integer
            For j = 1 To UBound(data2, 1)
                If CStr(data2(j, 1)) = tb And CStr(data2(j, 2)) = item And CStr(data2(j, 3)) = fkCd Then
                    GoTo continue1
                End If
            Next
        End If
        If identify = "BASE" Then
           tmpStrV = DEPLOY_VALUE_STR
        Else
           tmpStrV = CENTER_DEPLOY_VALUE_STR
        End If
      
        tmpStrV = Replace(tmpStrV, "(((CLM_NM)))", item, 1, 1)
        tmpStrV = Replace(tmpStrV, "(((FK_CD_CAMEL)))", Replace(StrConv(Replace(fkCd, "_", " "), vbProperCase), " ", ""), 1, 1)
        
        On Error Resume Next
        Set valueList = valueMap.item(tb)
        'エラーが有ればキーは存在しない
        If Err Then
            Set valueList = New Collection
            valueList.Add tmpStrV
            
            valueMap.Add valueList, tb
            
            tmpStr = DEPLOY_STR
            tmpStr = Replace(tmpStr, "(((TB_NM)))", tb, 1, 1)
            tmpStr = Replace(tmpStr, "(((TB_NM_T)))", tbT, 1, 1)
            
            deployStrMap.Add tmpStr, tb
            
            keys.Add tb
            
        Else
            valueList.Add tmpStrV
        End If
        
continue1:
    Next i

endCreateBaseOutput:

End Function

Public Sub create_fk_map(ByVal tsvNm As String, ByVal target As String)
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim outstr As String
    outstr = createBaseOutput3(tsvNm, target)
    
    Dim DataOutputFolder
    DataOutputFolder = config(0)(DataManageTool.DATE_OUTPUT_FOLDER)
    Dim DataOutputFileName
    DataOutputFileName = config(0)(DataManageTool.ADDITIONAL_FOREIGNKEY_MAPFILE)
    
    If DataOutputFileName = vbNullString Then
       Exit Sub
    End If
    
    Dim fileNm As String
    If DataOutputFolder = "" Then
       fileNm = DataManageTool.RootPath & "\" & DataOutputFileName
    Else
       fileNm = DataManageTool.RootPath & "\" & DataOutputFolder & "\" & DataOutputFileName
    End If
    
    If Dir(fileNm, vbDirectory) = vbNullString Then
       If Not Common.createMultiLevelFolder(fileNm) Then
          GoTo FinallyHandler
       End If
    End If
    
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana Start
    Dim startText, endText As String
    startText = Replace(config(0)(DataManageTool.ADDITIONAL_FOREIGN_KEY_MAP_START_TEXT), vbLf, vbCrLf)
    endText = Replace(config(0)(DataManageTool.ADDITIONAL_FOREIGN_KEY_MAP_END_TEXT), vbLf, vbCrLf)

    outstr = startText + vbCrLf + vbCrLf + outstr + vbCrLf + endText
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana End
   
    Set m_as = New ADODB.Stream
    m_as.Type = adTypeText
    m_as.Charset = DEFAULT_CHAR_SET
    m_as.LineSeparator = adCRLF
    m_as.Open
    
    Call m_as.WriteText(outstr, adWriteChar)
    'ファイル保存
    Call m_as.SaveToFile(fileNm, adSaveCreateOverWrite)
    
'    MsgBox "作成完了"
   
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub
Public Function createBaseOutput3(ByVal tsvNm As String, ByVal target As String) As String
    Set config(0) = Common.GetConfig(DataManageTool.configPath, target)
    
    Dim DataOutputFolder, ListDataInputFolder, ClassInputFolder, AdditionalForeignKeyMapFile
    Dim ClassificationDefinitionMapFile, ClassificationDeploymentMapFile, ListDataInputReadStartRow, ClassDataInputReadStartRow
    Dim ClassCd, ClassComment, ClassDtlCd, ClassDtlDictNm, UseTableName, UseTable, UseColumn, UseClassCd, UseIdentify, CloumnPhysicalNm
    Dim dfpropOutputExcept, deploymentExceptFolder, excludeCd
    Dim arrDfpropOutputExcept() As String
    
    DataOutputFolder = config(0)(DataManageTool.DATE_OUTPUT_FOLDER)
    ListDataInputFolder = config(0)(DataManageTool.LIST_DATE_INPUT_FOLDER)
    ClassInputFolder = config(0)(DataManageTool.CLASS_INPUT_FOLDER)
    AdditionalForeignKeyMapFile = config(0)(DataManageTool.ADDITIONAL_FOREIGNKEY_MAPFILE)
    ClassificationDefinitionMapFile = config(0)(DataManageTool.CLASSIFICATION_DEFINITION_MAPFILE)
    ClassificationDeploymentMapFile = config(0)(DataManageTool.CLASSIFICATION_DELOYMENT_MAPFILE)
    
    ListDataInputReadStartRow = config(0)(DataManageTool.LISTDATE_INPUTREAD_STARTROW)
    ClassDataInputReadStartRow = config(0)(DataManageTool.CLASS_DATE_INPUT_READ_STARTROW)
    ClassCd = config(0)(DataManageTool.CLASS_CD)
    ClassComment = config(0)(DataManageTool.CLASS_COMMENT)
    ClassDtlCd = config(0)(DataManageTool.CLASS_DTL_CD)
    ClassDtlDictNm = config(0)(DataManageTool.CLASS_DEL_DICT_NM)
    UseTableName = config(0)(DataManageTool.USER_TABLE_NAME)
    UseTable = config(0)(DataManageTool.USER_TABLE)
    UseColumn = config(0)(DataManageTool.USER_COLUMN)
    CloumnPhysicalNm = config(0)(DataManageTool.CLOUMN_PHYSICAL_NM)
    UseClassCd = config(0)(DataManageTool.USER_CLASS_CD)
    UseIdentify = config(0)(DataManageTool.USER_IDENTIFY)
    dfpropOutputExcept = config(0)(DataManageTool.DFPROP_OUTPUT_EXCEPT)
    'DeploymentExceptFolder = config(0)(DataManageTool.DEPLOYMENT_EXCEPT_FOLDER)
    If dfpropOutputExcept <> vbNullString Then
       arrDfpropOutputExcept() = Split(dfpropOutputExcept, ",")
    End If
    If ListDataInputFolder = "" Then
       Exit Function
    End If
    If ListDataInputReadStartRow = "" Then
       ListDataInputReadStartRow = "2"
    End If

    'メイン処理
    Dim tsvFolder As String

    tsvFolder = DataManageTool.TsvPath & "\" & ListDataInputFolder

    Dim tsvFile As String
    tsvFile = tsvFolder & "\" & ListDataInputFolder & DataManageTool.TSV_FILE_EXT          '一時使用
    
    Dim list As Collection
    Set list = Common.getFolderList(tsvFolder)
    
    'メイン処理
    Dim isFound As Boolean

    Dim file As New FileInputCtrl
    isFound = file.OpenFile(tsvFile)

    If Not isFound Then
       Exit Function
    '    GoTo FinallyHandler
    End If

    Dim data As Variant
    data = file.ReadFile
    Dim outstr

    Dim FK_DEF_STR, FK_DEF_START_STR, FK_DEF_END_STR

' [#3861] Oracle対応 - IDスカラ検索で結合からEXISTSに変更 2018.03.01 kawana Start
' [#2213] FKMapの結合方法を変更 2017.08.03 kawana Start
    
    FK_DEF_STR = _
    "    # 区分値マスタ - (((TB_NM_T))).(((CLM_NM_T)))" + vbCrLf + _
    "    ; FK_(((TB_NM)))_(((CLM_NM))) = map:{" + vbCrLf + _
    "        ; localTableName  = (((TB_NM)))    ; foreignTableName  = B_CLASS_DTL" + vbCrLf + _
    "        ; localColumnName = (((CLM_NM)))    ; foreignColumnName = CLASS_DTL_CD" + vbCrLf + _
    "        ; fixedCondition  =" + vbCrLf + _
    "            $$foreignAlias$$.DEL_FLG = '0'" + vbCrLf + _
    "            AND EXISTS " + vbCrLf + _
    "              ($$sqbegin$$" + vbCrLf + _
    "                SELECT * " + vbCrLf + _
    "                  FROM B_CLASS C" + vbCrLf + _
    "                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID" + vbCrLf + _
    "                    AND C.CLASS_CD  = '(((FK_CD)))'" + vbCrLf + _
    "                    AND C.DEL_FLG   = '0'" + vbCrLf + _
    "              )$$sqend$$" + vbCrLf + _
    "        ; fixedSuffix     = By(((CLM_NM_CAMEL)))" + vbCrLf + _
    "    }" + vbCrLf

' [#2213] FKMapの結合方法を変更 2017.08.03 kawana End
' [#3861] Oracle対応 - IDスカラ検索で結合からEXISTSに変更 2018.03.01 kawana End

    FK_DEF_START_STR = _
    "    ##########ここからは区分値マスタの絞り込み条件付きの外部キー設定" + vbCrLf
    FK_DEF_END_STR = _
    "    ##########ここまでは区分値マスタの絞り込み条件付きの外部キー設定" + vbCrLf
    
    Dim CENTER_FK_DEF_STR, CENTER_FK_DEF_START_STR, CENTER_FK_DEF_END_STR

' [#3861] Oracle対応 - IDスカラ検索で結合からEXISTSに変更 2018.03.01 kawana Start
' [#2213] FKMapの結合方法を変更 2017.08.03 kawana Start

    CENTER_FK_DEF_STR = _
    "    # センタ区分値マスタ - (((TB_NM_T))).(((CLM_NM_T)))" + vbCrLf + _
    "    ; FK_CENTER_(((TB_NM)))_(((CLM_NM))) = map:{" + vbCrLf + _
    "        ; localTableName  = (((TB_NM)))    ; foreignTableName  = M_CENTER_CLASS_DTL" + vbCrLf + _
    "        ; localColumnName = (((CLM_NM)))    ; foreignColumnName = CLASS_DTL_CD" + vbCrLf + _
    "        ; fixedCondition  =" + vbCrLf + _
    "            $$foreignAlias$$.DEL_FLG = '0'" + vbCrLf + _
    "            AND EXISTS " + vbCrLf + _
    "              ($$sqbegin$$" + vbCrLf + _
    "                SELECT * " + vbCrLf + _
    "                  FROM M_CENTER_CLASS C" + vbCrLf + _
    "                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID" + vbCrLf + _
    "                    AND C.CLASS_CD  = '(((FK_CD)))'" + vbCrLf + _
    "                    AND C.CENTER_ID = /*centerId(Long)*/null" + vbCrLf + _
    "                    AND C.DEL_FLG   = '0'" + vbCrLf + _
    "              )$$sqend$$" + vbCrLf + _
    "        ; fixedSuffix     = By(((CLM_NM_CAMEL)))" + vbCrLf + _
    "    }" + vbCrLf

' [#2213] FKMapの結合方法を変更 2017.08.03 kawana End
' [#3861] Oracle対応 - IDスカラ検索で結合からEXISTSに変更 2018.03.01 kawana End

    CENTER_FK_DEF_START_STR = _
    "    ##########ここからはセンタ区分値マスタの絞り込み条件付きの外部キー設定" + vbCrLf
    CENTER_FK_DEF_END_STR = _
    "    ##########ここまではセンタ区分値マスタの絞り込み条件付きの外部キー設定" + vbCrLf
    
    On Error Resume Next
    
    Dim no, tb, tbT, item, itemT, identify, fkCd
    Dim firstNo, lastNo
    Dim tmpStr
    
   outstr = FK_DEF_START_STR
   Dim i As Integer
    For i = CInt(ListDataInputReadStartRow) To UBound(data, 1)
    
        no = CStr(data(i, CInt(UseTable)))
        tb = CStr(data(i, CInt(UseTable)))
        tbT = CStr(data(i, CInt(UseTableName)))
        item = CStr(data(i, CInt(CloumnPhysicalNm)))
        itemT = CStr(data(i, UseColumn))
        identify = CStr(data(i, UseIdentify))
        fkCd = CStr(data(i, UseClassCd))
        
        If IsNull(tb) Or tb = "" Or _
          IsNull(tbT) Or tbT = "" Or _
          IsNull(item) Or item = "" Or _
          IsNull(itemT) Or itemT = "" Or _
          IsNull(identify) Or identify = "" Then
          
            Exit For
        End If
         ' --- 除外 ---
        If Not EmptyArr(arrDfpropOutputExcept()) Then
            For Each excludeCd In arrDfpropOutputExcept
                If excludeCd = fkCd Then
                    GoTo continue1
                End If
            Next
        End If
        
        If identify = "BASE" Then
           tmpStr = FK_DEF_STR
        Else
           tmpStr = CENTER_FK_DEF_STR
        End If
        
        tmpStr = Replace(tmpStr, "(((TB_NM)))", tb, 1, 2)
        tmpStr = Replace(tmpStr, "(((TB_NM_T)))", tbT, 1, 1)
        tmpStr = Replace(tmpStr, "(((CLM_NM)))", item, 1, 2)
        tmpStr = Replace(tmpStr, "(((CLM_NM_T)))", itemT, 1, 1)
        tmpStr = Replace(tmpStr, "(((FK_CD)))", fkCd)
        'tmpStr = Replace(tmpStr, "(((FK_CD)))", item)
        tmpStr = Replace(tmpStr, "(((CLM_NM_CAMEL)))", Replace(StrConv(Replace(item, "_", " "), vbProperCase), " ", ""), 1, 1)
        
        outstr = outstr + tmpStr
       
continue1:
    Next i

    outstr = outstr + FK_DEF_END_STR
    createBaseOutput3 = outstr
End Function

'ADD BY YC_LI AT 2016/08/05 [E]

