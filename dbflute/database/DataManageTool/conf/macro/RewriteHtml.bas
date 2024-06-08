Attribute VB_Name = "RewriteHtml"
Option Explicit
Public replaceCode() As String
Public jsGrid As Dictionary

'UPD BY SJA_YIN AT 2017/03/13 <S>
'Public Function ReadJs(ByVal path As String) As Boolean
Public Function ReadJs(ByVal path As String, ByVal logFileNm As String) As Boolean
'UPD BY SJA_YIN AT 2017/03/13 <E>
    On Error GoTo ErrorHandler
    
    'jsファイルを読み込む
    Dim ac As New AppCtrl, i As Integer
    ac.StartApp
    
    Dim fileOutput As New FileOutputCtrl
    Dim isFound As Boolean
    Dim fileInput As New FileInputCtrl
    isFound = fileInput.OpenFile(path)
    If Not isFound Then
        'ADD BY SJA_YIN AT 2017/03/13 <S>
        fileOutput.AppendFile (logFileNm)
        fileOutput.WriteLogFile logFileNm, _
                   "LogTime :" & Now & vbCrLf & _
                   "ErrorFileName :" & path & vbCrLf & _
                   "ErrorMsg :" & "JSファイルが存在しません。" & vbCrLf & vbCrLf
        Set jsGrid = New Dictionary
        'ADD BY SJA_YIN AT 2017/03/13 <E>
        ReadJs = False
        GoTo FinallyHandler
    End If
    
    'jsの内容を取得
    Dim inputData As Collection
    Set inputData = fileInput.ReadHtmlJsFile
    fileInput.CloseFile
    
    Set jsGrid = New Dictionary
    jsGrid.CompareMode = TextCompare
    
    Dim item As Variant
    For Each item In inputData
        If InStr(item, "mergeEntryGridOptions") > 0 Or _
           InStr(item, "mergePagingMultiSelectGridOptions") > 0 Or _
           InStr(item, "mergeMultiSelectGridOptions") > 0 Then
           jsGrid.Add Trim(Replace(Replace(Split(item, "=")(0), "$scope.", ""), vbTab, "")), "1"
        End If
    Next
    ReadJs = True
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler
FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
    
End Function

Public Sub copyFiles(ByVal copyFromFile As String, ByVal copyToFile As String)
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim x As Integer
    For x = 1 To Windows.count
        If Windows(x).Parent.FullName = copyFromFile Then
            Workbooks(Windows(x).Caption).Close (True)
            Exit For
        End If
    Next
    
    FileCopy copyFromFile, copyToFile
    
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Sub

Sub DeleteFile(outFileNm)
    If outFileNm <> "" Then
        Dim fso As Object
        Set fso = CreateObject("Scripting.FileSystemObject")
        If fso.FileExists(outFileNm) Then
            fso.DeleteFile (outFileNm)
        End If
    End If
End Sub

'UPD BY SJA_YIN AT 2017/03/13 <S>
'Public Function rewriteHtmlFile(ByVal fileNm As String, ByVal logFileNm As String) As Boolean
Public Function rewriteHtmlFile(ByVal fileNm As String, ByVal logFileNm As String, ByVal htmlFileNm As String) As Boolean
'UPD BY SJA_YIN AT 2017/03/13 <E>
    On Error GoTo ErrorHandler
    
    Dim ac As New AppCtrl, i As Integer
    ac.StartApp
    
    'Htmlファイルを読み込む
    Dim isFound As Boolean
    Dim fileInput As New FileInputCtrl
    isFound = fileInput.OpenFile(fileNm)
    
    If Not isFound Then
        GoTo FinallyHandler
    End If
    Dim inputData As Collection
    Set inputData = fileInput.ReadHtmlJsFile
    fileInput.CloseFile
    Dim outputData As Collection
    Set outputData = New Collection
        
    Dim item As Variant
    outputData.Add "<div>"
    For Each item In inputData
        For i = LBound(replaceCode) To UBound(replaceCode)
            item = Replace(item, Trim(replaceCode(i)), "")
        Next
        item = Replace(item, """", " "" ")
        item = Replace(item, "-system-option", "system-option")
        
        outputData.Add item
    Next
    outputData.Add "</div>"
    
    Dim fileOutput As New FileOutputCtrl
    fileOutput.OverwriteFile (fileNm)
    fileOutput.WriteHtmlFile fileNm, outputData
    
    Dim xmlfile
    Set xmlfile = CreateObject("MSXml2.DOMDocument.6.0")
    xmlfile.async = False
    xmlfile.Load (fileNm)
    
    If xmlfile.parseError.ErrorCode <> 0 Then
        fileOutput.AppendFile (logFileNm)
        'UPD BY SJA_YIN AT 2017/03/13 <S>
'        fileOutput.WriteLogFile logFileNm, _
'                   "LogTime :" & Now & vbCrLf & _
'                   "ErrorFileName :" & fileNm & vbCrLf & _
'                   "ErrorMsg :" & xmlfile.parseError.reason & _
'                   "ErrorLineNo :" & xmlfile.parseError.line & vbCrLf & _
'                   "ErrorSource :" & Trim(Replace(xmlfile.parseError.srcText, vbTab, "")) & vbCrLf & vbCrLf
        fileOutput.WriteLogFile logFileNm, _
                   "LogTime :" & Now & vbCrLf & _
                   "ErrorFileName :" & htmlFileNm & vbCrLf & _
                   "ErrorMsg :" & xmlfile.parseError.reason & _
                   "ErrorLineNo :" & xmlfile.parseError.line & vbCrLf & _
                   "ErrorSource :" & Trim(Replace(xmlfile.parseError.srcText, vbTab, "")) & vbCrLf & vbCrLf
        'UPD BY SJA_YIN AT 2017/03/13 <E>
        rewriteHtmlFile = False
        GoTo FinallyHandler
    End If
    rewriteHtmlFile = True
    GoTo FinallyHandler
ErrorHandler:
    ac.SetError
    Resume FinallyHandler
FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Function loadHtmlFile(ByVal fileNm As String, ByRef listGridNm As Dictionary) As Collection

    On Error GoTo ErrorHandler
    
    Dim ac As New AppCtrl
    ac.StartApp
    
    Dim xmlfile, n, nodes As Object, ns, i, j, xmlRootNode
    Dim xmlItemKey As Collection, xmlItemValue As Collection
    Set xmlItemKey = New Collection
    Set xmlItemValue = New Collection

    Set xmlfile = CreateObject("MSXml2.DOMDocument.6.0")
    xmlfile.async = False
    xmlfile.Load (fileNm)

    Set xmlRootNode = xmlfile.DocumentElement
    With xmlRootNode
        If .Attributes.Length > 0 Then
            For i = 0 To .Attributes.Length - 1
                If InStr(1, .Attributes(i).BaseName, "owd-select", vbTextCompare) > 0 Then
                    xmlItemKey.Add Trim(.Attributes(i).nodeTypedValue)
                    xmlItemValue.Add "dropdown", Trim(.Attributes(i).nodeTypedValue)
                End If
                'UPD BY SJA_YIN AT 2017/03/14 <S>
'                If InStr(1, .Attributes(i).BaseName, "owd-text", vbTextCompare) > 0 Or _
'                   InStr(1, .Attributes(i).BaseName, "owd-span", vbTextCompare) > 0 Or _
'                   InStr(1, .Attributes(i).BaseName, "owd-label", vbTextCompare) > 0 Or _
'                   InStr(1, .Attributes(i).BaseName, "owd-button", vbTextCompare) > 0 Then
                If InStr(1, .Attributes(i).BaseName, "owd-text", vbTextCompare) > 0 Or _
                   InStr(1, .Attributes(i).BaseName, "owd-span", vbTextCompare) > 0 Or _
                   InStr(1, .Attributes(i).BaseName, "owd-label", vbTextCompare) > 0 Or _
                   InStr(1, .Attributes(i).BaseName, "owd-number", vbTextCompare) > 0 Or _
                   InStr(1, .Attributes(i).BaseName, "owd-date", vbTextCompare) > 0 Or _
                   InStr(1, .Attributes(i).BaseName, "button", vbTextCompare) > 0 Or _
                   InStr(1, .Attributes(i).BaseName, "owd-button", vbTextCompare) > 0 Then
                'UPD BY SJA_YIN AT 2017/03/14 <E>
                    xmlItemKey.Add Trim(.Attributes(i).nodeTypedValue)
                    xmlItemValue.Add Replace(.BaseName, "owd-", ""), Trim(.Attributes(i).nodeTypedValue)
                End If
                If InStr(1, .Attributes(i).BaseName, "system-password", vbTextCompare) > 0 Then
                    xmlItemKey.Add Trim(.Attributes(i).nodeTypedValue)
                    xmlItemValue.Add "password", Trim(.Attributes(i).nodeTypedValue)
                End If
                If InStr(1, .Attributes(i).BaseName, "owd-checkbutton", vbTextCompare) > 0 Then
                    xmlItemKey.Add Trim(.Attributes(i).nodeTypedValue)
                    xmlItemValue.Add "checkbox", Trim(.Attributes(i).nodeTypedValue)
                End If
                'ADD BY SJA_YIN AT 2017/03/14 <S>
                If InStr(1, .Attributes(i).BaseName, "owd-file", vbTextCompare) > 0 Then
                    xmlItemKey.Add Trim(.Attributes(i).nodeTypedValue)
                    xmlItemValue.Add "button", Trim(.Attributes(i).nodeTypedValue)
                End If
                'ADD BY SJA_YIN AT 2017/03/14 <E>
            Next
        End If
        If .ChildNodes.Length > 0 Then
            Call setItemNodes(xmlRootNode.ChildNodes, xmlItemKey, xmlItemValue, listGridNm)
        End If
        
    End With
    
'    MsgBox xmlItemValue.item(xmlItemKey.item(1))
'    MsgBox xmlItemKey.item(1)

    Dim xmlItemDoc As Collection
    Set xmlItemDoc = New Collection
    xmlItemDoc.Add xmlItemKey
    xmlItemDoc.Add xmlItemValue
    
    Set loadHtmlFile = xmlItemDoc

    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler
    
FinallyHandler:
    On Error Resume Next
    ac.EndApp
    ac.ShowMessage
End Function

Public Sub setItemNodes(ByVal xmlRootNode As Object, ByRef xmlItemKey As Collection, ByRef xmlItemValue As Collection, ByRef listGridNm As Dictionary)
    Dim xmlNode, i
    For Each xmlNode In xmlRootNode
        With xmlNode
            Dim key, value
            'UPD BY SJA_YIN AT 2017/03/14 <S>
'            If InStr(1, .BaseName, "owd-select", vbTextCompare) > 0 Or _
'               InStr(1, .BaseName, "owd-text", vbTextCompare) > 0 Or _
'               InStr(1, .BaseName, "owd-button", vbTextCompare) > 0 Or _
'               InStr(1, .BaseName, "owd-span", vbTextCompare) > 0 Or _
'               InStr(1, .BaseName, "owd-label", vbTextCompare) > 0 Or _
'               InStr(1, .BaseName, "system-password", vbTextCompare) > 0 Or _
'               InStr(1, .BaseName, "owd-checkbutton", vbTextCompare) > 0 Then
            If InStr(1, .BaseName, "owd-select", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-text", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-button", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-span", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-label", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-number", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-date", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-file", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "button", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "system-password", vbTextCompare) > 0 Or _
               InStr(1, .BaseName, "owd-checkbutton", vbTextCompare) > 0 Then
            'UPD BY SJA_YIN AT 2017/03/14 <E>
               If .Attributes.Length > 0 Then
                    For i = 0 To .Attributes.Length - 1
                        If .Attributes(i).BaseName = "id" Then
                            'ADD BY SJA_YIN AT 2017/03/16 <S>
                            If isExitItemKey(xmlItemKey, Trim(.Attributes(i).nodeTypedValue)) Then
                                Exit For
                            End If
                            'ADD BY SJA_YIN AT 2017/03/16 <E>
                            xmlItemKey.Add Trim(.Attributes(i).nodeTypedValue)
                            value = Trim(.BaseName)
                            If .BaseName = "owd-select" Then
                                value = "dropdown"
                            End If
                            If .BaseName = "system-password" Then
                                value = "password"
                            End If
                            If .BaseName = "owd-checkbutton" Then
                                value = "checkbox"
                            End If
                            'ADD BY SJA_YIN AT 2017/03/14 <S>
                            If .BaseName = "owd-file" Then
                                value = "button"
                            End If
                            'ADD BY SJA_YIN AT 2017/03/14 <E>
                            value = Replace(value, "owd-", "")
                            xmlItemValue.Add value, Trim(.Attributes(i).nodeTypedValue)
                            Exit For
                        End If
                    Next
                End If
            ElseIf .Attributes Is Nothing Then
            ElseIf .Attributes.Length > 0 Then
                Dim ngGridFlg As Boolean
                ngGridFlg = False
                For i = 0 To .Attributes.Length - 1
                    If .Attributes(i).BaseName = "id" Then
                        key = Trim(.Attributes(i).nodeTypedValue)
                    End If
                    If .Attributes(i).BaseName = "ng-grid" Then
                        value = Trim(.Attributes(i).nodeTypedValue)
                        ngGridFlg = True
                    End If
                Next
                
                'UPD BY SJA_YIN AT 2017/03/16 <S>
                'If ngGridFlg Then
                If ngGridFlg And Not isExitItemKey(xmlItemKey, key) Then
                'UPD BY SJA_YIN AT 2017/03/16 <E>
                    xmlItemKey.Add key
                    'UPD BY SJA_YIN AT 2017/03/13 <S>
                    'If jsGrid Is Nothing Then
                    If jsGrid Is Nothing Or jsGrid.count = 0 Then
                    'UPD BY SJA_YIN AT 2017/03/13 <E>
                        xmlItemValue.Add "grid,0", key
                        listGridNm.Add key, listGridNm.count + 1
                    ElseIf jsGrid.Exists(value) = True Then
                        xmlItemValue.Add "grid,1", key
                        listGridNm.Add key, listGridNm.count + 1
                    Else
                        xmlItemValue.Add "grid,0", key
                        listGridNm.Add key, listGridNm.count + 1
                    End If
                End If
            End If
            If .ChildNodes.Length > 0 Then
                Call setItemNodes(xmlNode.ChildNodes, xmlItemKey, xmlItemValue, listGridNm)
            End If
        End With
    Next
End Sub

'ADD BY SJA_YIN AT 2017/03/16 <S>
Public Function isExitItemKey(ByVal xmlItemKey As Collection, ByVal key As String) As Boolean
    On Error GoTo ErrorHandler
    
    Dim idx As Integer
    
    For idx = 1 To xmlItemKey.count
        If key = xmlItemKey(idx) Then
            isExitItemKey = True
            GoTo FinallyHandler
        End If
    Next idx
    
ErrorHandler:
    isExitItemKey = False

FinallyHandler:

End Function
'ADD BY SJA_YIN AT 2017/03/16 <E>

Public Function ReadHtml(ByVal htmlFileNm As String, ByVal copyToFile As String, ByVal HtmlReplaceString As String, ByVal logFileNm As String, ByRef listGridNm As Dictionary) As Collection
    If Not (IsNull(HtmlReplaceString) Or HtmlReplaceString = "") Then
        replaceCode = Split(HtmlReplaceString, ",")
    End If
    Set listGridNm = New Dictionary
    Call copyFiles(htmlFileNm, copyToFile)
    'UPD BY SJA_YIN AT 2017/03/13 <S>
    'If rewriteHtmlFile(copyToFile, logFileNm) Then
    If rewriteHtmlFile(copyToFile, logFileNm, htmlFileNm) Then
    'UPD BY SJA_YIN AT 2017/03/13 <E>
        Set ReadHtml = loadHtmlFile(copyToFile, listGridNm)
    Else
        Set ReadHtml = New Collection
    End If
End Function
