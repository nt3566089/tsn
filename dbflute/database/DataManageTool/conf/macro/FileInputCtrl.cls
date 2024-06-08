VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "FileInputCtrl"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Private Const DEFAULT_CHAR_SET As String = "UTF-8"
Private Const DEFAULT_FETCH_SIZE As Long = 10000      '1000->10000 08/05

Private m_as As ADODB.Stream
Private m_sb As StringBuilder

Private m_countColumn As Long

Public Function OpenFile(ByVal filePath As String) As Boolean
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Dim fso As New FileSystemObject
    If Not fso.FileExists(filePath) Then
        Exit Function
    End If

    Set m_as = New ADODB.Stream
    m_as.Type = adTypeText
    m_as.Charset = DEFAULT_CHAR_SET
    m_as.LineSeparator = adCRLF
    m_as.Open
    m_as.LoadFromFile (filePath)

    Set m_sb = New StringBuilder

    OpenFile = True
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Function

Public Sub CloseFile()
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    m_as.Close
    Set m_as = Nothing

    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Sub

Public Function ReadFile(Optional fetchSize As Long = DEFAULT_FETCH_SIZE) As Variant
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl

    Dim rowCnt As Long
    rowCnt = 0

    m_sb.Clear

    Do While Not m_as.EOS
        rowCnt = rowCnt + 1

        m_sb.Append (m_as.ReadText(adReadLine))
        m_sb.Append (vbCrLf)

        If rowCnt >= fetchSize Then
            Exit Do
        End If
    Loop

    If m_sb.Length = 0 Then
        Exit Function
    End If

    Dim rows() As String
    rows = Split(m_sb.ToString, vbCrLf)

    Dim colCnt As Long
    colCnt = StrCount(rows(0), vbTab) + 1

    m_countColumn = colCnt

    ReDim ret(1 To rowCnt, 1 To colCnt) As Variant

    Dim cols As Variant
' -- MODIFY BY KAWANA TABが1個でも多い行があると開けない問題を修正 2017.02.23 [S]
    Dim colsLen As Integer
' -- MODIFY BY KAWANA TABが1個でも多い行があると開けない問題を修正 2017.02.23 [E]

    Dim i As Long
    Dim j As Long

    For i = 0 To rowCnt - 1
        cols = Split(rows(i), vbTab)
' -- MODIFY BY KAWANA TABが1個でも多い行があると開けない問題を修正 2017.02.23 [S]
        colsLen = UBound(cols) + 1
' -- MODIFY BY KAWANA TABが1個でも多い行があると開けない問題を修正 2017.02.23 [E]
        For j = 0 To colCnt - 1
' -- MODIFY BY KAWANA TABが1個でも多い行があると開けない問題を修正 2017.02.23 [S]
            If j < colsLen Then
                ret(i + 1, j + 1) = cols(j)
            End If
' -- MODIFY BY KAWANA TABが1個でも多い行があると開けない問題を修正 2017.02.23 [E]
        Next
    Next

    ReadFile = ret

    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    ac.ShowMessage
End Function

Public Function CountColumn() As Long
    CountColumn = m_countColumn
End Function

'<ADD> SJA 20161215 START
Public Function ReadHtmlJsFile() As Collection
    On Error GoTo ErrorHandler
    Dim ac As New AppCtrl
    Dim data As Collection
    Set data = New Collection
    Dim oldLineSeparator
    
    oldLineSeparator = m_as.LineSeparator
    m_as.LineSeparator = adLF
    Do While Not m_as.EOS
        data.Add (m_as.ReadText(adReadLine) & vbCrLf)
    Loop
    
    Set ReadHtmlJsFile = data
    
    GoTo FinallyHandler
    
ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    m_as.LineSeparator = oldLineSeparator
    ac.ShowMessage
End Function
'<ADD> SJA 20161215 END

