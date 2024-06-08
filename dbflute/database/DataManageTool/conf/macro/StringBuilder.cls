VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "StringBuilder"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Private Const BUFFER_BLOCK_SIZE As Long = 1000000

Private m_buffer As String
Private m_lengthIndex As Long

Private Sub Initialize()
    m_lengthIndex = 0
    m_buffer = String(BUFFER_BLOCK_SIZE, " ")
End Sub

Public Sub Clear()
    Call Initialize
End Sub

Public Sub Append(value As String)
    Dim newLengthIndex As Long
    newLengthIndex = m_lengthIndex + Len(value)

    Do While (Len(m_buffer) < newLengthIndex)
        m_buffer = m_buffer & String(BUFFER_BLOCK_SIZE, " ")
    Loop

    Mid(m_buffer, m_lengthIndex + 1) = value
    m_lengthIndex = m_lengthIndex + Len(value)
End Sub

Public Property Get ToString() As String
    ToString = Left(m_buffer, m_lengthIndex)
End Property

Public Property Get Length() As Long
    Length = m_lengthIndex
End Property

