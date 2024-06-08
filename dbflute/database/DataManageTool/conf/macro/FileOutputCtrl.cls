VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "FileOutputCtrl"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Private Const DEFAULT_CHAR_SET As String = "UTF-8"
Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"

Private m_as As ADODB.Stream
Private m_filePath As String
Private m_sb As StringBuilder
Private crementI As Long

Public Sub AppendFile(ByVal filePath As String)
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Call Common.CheckParentFolder(filePath, True)

    Set m_as = New ADODB.Stream
    m_as.Type = adTypeText
    m_as.Charset = DEFAULT_CHAR_SET
    m_as.LineSeparator = adCRLF
    m_as.Open
    m_as.LoadFromFile (filePath)
    m_as.Position = m_as.Size

    m_filePath = filePath
    Set m_sb = New StringBuilder

    GoTo FinallyHandler

ErrorHandler:
'<UPD> SJA 20161222 START
'    ac.SetError
'    Resume FinallyHandler
    If Err.Number = 3002 Then
        Call m_as.SaveToFile(filePath, adSaveCreateOverWrite)
    Else
        ac.SetError
        Resume FinallyHandler
    End If
'<UPD> SJA 20161222 END

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Sub

Public Sub OverwriteFile(ByVal filePath As String)
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Call Common.CheckParentFolder(filePath, True)

    Set m_as = New ADODB.Stream
    m_as.Type = adTypeText
    m_as.Charset = DEFAULT_CHAR_SET
    m_as.LineSeparator = adCRLF
    m_as.Open

    Call m_as.SaveToFile(filePath, adSaveCreateOverWrite)

    m_filePath = filePath
    Set m_sb = New StringBuilder

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Sub

Public Sub CloseFile()
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Call m_as.SaveToFile(m_filePath, adSaveCreateOverWrite)

    Dim dataSize As Long
    dataSize = m_as.Size

    m_as.Close

    If dataSize > 0 Then
        Dim fso As New FileSystemObject

        If fso.FileExists(m_filePath & ".$$$") Then
            Call fso.DeleteFile(m_filePath & ".$$$")
        End If

        Call fso.MoveFile(m_filePath, m_filePath & ".$$$")

        Dim was As New ADODB.Stream
        was.Type = adTypeBinary
        was.Open
        was.LoadFromFile (m_filePath & ".$$$")
        was.Position = 3

        m_as.Type = adTypeBinary
        m_as.Open

        Call was.CopyTo(m_as)
        Call m_as.SaveToFile(m_filePath, adSaveCreateOverWrite)

        m_as.Close
        was.Close

        Call fso.DeleteFile(m_filePath & ".$$$")
    End If

    Set m_as = Nothing
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Sub

Public Function WriteFile(ByVal data As Variant) As Boolean
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Dim first As Boolean

    Dim i As Long
    Dim j As Long

    m_sb.Clear

    For i = LBound(data, 1) To UBound(data, 1)
        WriteFile = True
        first = True
        'ADD BY NINGQI AT 2016.11.11 <S>
        If data(i, 1) = "" Then
            GoTo skipFlag
        End If
        'ADD BY NINGQI AT 2016.11.11 <E>
        For j = LBound(data, 2) To UBound(data, 2)

            If first Then
                first = False
            Else
                m_sb.Append (vbTab)
            End If

            m_sb.Append (data(i, j))
        Next
        'If i <> UBound(data, 1) Then
        m_sb.Append (vbCrLf)
        'End If
skipFlag:
    Next

    If m_sb.Length > 0 Then
        Call m_as.WriteText(m_sb.ToString, adWriteChar)
    End If

    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Function

'<ADD> SJA 20161215 START
Public Function WriteHtmlFile(ByVal fileNm As String, ByRef data As Collection) As Boolean

    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    Dim item As Variant
    For Each item In data
        Call m_as.WriteText(item, adWriteChar)
    Next
    'ファイル保存
    Call m_as.SaveToFile(fileNm, adSaveCreateOverWrite)

    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage

End Function

Public Function WriteLogFile(ByVal fileNm As String, ByVal logMsg As String) As Boolean

    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    Call m_as.WriteText(logMsg, adWriteChar)
    'ファイル保存
    Call m_as.SaveToFile(fileNm, adSaveCreateOverWrite)
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage

End Function
'<ADD> SJA 20161215 END


