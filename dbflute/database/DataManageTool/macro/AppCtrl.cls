VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "AppCtrl"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Private m_start As Boolean
Private m_startTime As Single
Private m_endTime As Single
Private m_screenUpdating As Boolean
Private m_displayAlerts As Boolean
Private m_calculation As XlCalculation
Private m_enableEvents As Boolean
Private m_displayStatusBar As Boolean
Private m_statusBar As Variant

Private m_errorMessage As String

Public Sub StartApp(Optional ByVal message As String = "ただいま処理中てす・・・")
    On Error Resume Next

    m_start = True
    m_startTime = Timer
    m_screenUpdating = Application.ScreenUpdating
    m_displayAlerts = Application.DisplayAlerts
    m_calculation = Application.Calculation
    m_enableEvents = Application.EnableEvents
    m_displayStatusBar = Application.DisplayStatusBar
    m_statusBar = Application.StatusBar

    If Application.ScreenUpdating <> False Then
        Application.ScreenUpdating = False
    End If

    If Application.DisplayAlerts <> False Then
        Application.DisplayAlerts = False
    End If

    If Application.Calculation <> xlCalculationManual Then
        Application.Calculation = xlCalculationManual
    End If

    If Application.EnableEvents <> False Then
        Application.EnableEvents = False
    End If

    If Application.DisplayStatusBar <> True Then
        Application.DisplayStatusBar = True
    End If

    If Application.StatusBar <> message Then
        Application.StatusBar = message
    End If

End Sub

Public Sub EndApp()
    On Error Resume Next

    If m_start Then

        If Application.StatusBar <> m_statusBar Then
            If m_statusBar = "FALSE" Then
                Application.StatusBar = False
            Else
                Application.StatusBar = m_statusBar
            End If
        End If

        If Application.DisplayStatusBar <> m_displayStatusBar Then
            Application.DisplayStatusBar = m_displayStatusBar
        End If

        If Application.EnableEvents <> m_enableEvents Then
            Application.EnableEvents = m_enableEvents
        End If

        If Application.Calculation <> m_calculation Then
            Application.Calculation = m_calculation
        End If

        If Application.DisplayAlerts <> m_displayAlerts Then
            Application.DisplayAlerts = m_displayAlerts
        End If

        If Application.ScreenUpdating <> m_screenUpdating Then
            Application.ScreenUpdating = m_screenUpdating
        End If

        If m_startTime > m_endTime Then
            m_endTime = m_endTime + (60 * 60 * 24)
        End If

    Else
        If Application.EnableEvents <> True Then
            Application.EnableEvents = True
        End If

        If Application.DisplayAlerts <> True Then
            Application.DisplayAlerts = True
        End If

        If Application.ScreenUpdating <> True Then
            Application.ScreenUpdating = True
        End If
    End If

End Sub

Public Function AppTime() As Single
    AppTime = m_endTime - m_startTime
End Function

Public Sub SetError()
    m_errorMessage = "エラーが発生しました。" & vbCrLf & vbCrLf & "エラー番号：" & Err.Number & vbCrLf & "エラー内容：" & Err.Description
End Sub

Public Function ShowMessage(Optional ByVal errorMessage As String = "", Optional ByVal style As VbMsgBoxStyle = vbOKOnly) As VbMsgBoxResult
    On Error Resume Next

    Dim msg As String
    msg = errorMessage

    If msg = "" Then
        If m_errorMessage = "" Then
            Exit Function
        End If

        msg = m_errorMessage
        m_errorMessage = ""
    End If

    Dim upd As Boolean
    upd = Application.ScreenUpdating

    If Application.ScreenUpdating <> True Then
        Application.ScreenUpdating = True
    End If

    ShowMessage = MsgBox(msg, style)

    If Application.ScreenUpdating <> upd Then
        Application.ScreenUpdating = upd
    End If
End Function
