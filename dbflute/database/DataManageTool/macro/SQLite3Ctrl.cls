VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "Sqlite3Ctrl"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Private Const BULK_COUNT As Long = 100
Private Const COLUMN_COUNT As Long = 2
Private Const COLUMN_COUNT_ALL As Long = 10

Private Const X64_FOLDER_NAME As String = "x64"
Private Const X86_FOLDER_NAME As String = "x86"

Private Const DATA_SHEET_NAME As String = "Data"

'���쌟�ؗp�e�X�g�R�[�h
'
'�������T���v�������ɁA
'�ėp�I�ȃ����o�ϐ��E���\�b�h�Q���쐬���鎖
'
'���������j��AppCtrl�Ȃǂ̃N���X���W���[�����Q�l�ɂ��鎖
'  �Ⴆ��xxxHandle�Ȃǂ𓖃N���X��ŊǗ�����@�\���K�v
'  �Ăяo�����Ɏ��K�v�����������͓��N���X���ŋz���A
'  ���ėp�I�ɗ��p�ł���悤����̎d�l�ɑ΂���ŗL�@�\�Ȃǂ́A
'  ���N���X�Ɏ������Ȃ��悤�ɒ��ӂ��鎖
Public Sub Test()

    Dim i As Integer
    Dim j As Integer

    Dim ret As Long
    Dim dbFile As String
    Dim value As Long

    #If Win64 Then
        'SQLiteDLL�ǂݍ���
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X64_FOLDER_NAME)
        '�R�l�N�V�����n���h����`
        Dim connHandle As LongPtr
        '�X�e�[�g�����g�n���h����`
        Dim stmtHandle As LongPtr
    #Else
        'SQLiteDLL�ǂݍ���
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X86_FOLDER_NAME)
        '�R�l�N�V�����n���h����`
        Dim connHandle As Long
        '�X�e�[�g�����g�n���h����`
        Dim stmtHandle As Long
    #End If

    If ret <> SQLITE_INIT_OK Then
        Exit Sub
    End If

    '�t�@�C�����擾
    dbFile = DataManageTool.dbPath & "\" & "test.db3"

    'DB�t�@�C���폜
    If Dir(dbFile) <> "" Then
        Kill dbFile
    End If

    'DB�t�@�C��Open
    ret = SQLite3Open(dbFile, connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "PRAGMA synchronous = OFF", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "PRAGMA journal_mode = PERSIST", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "CREATE TABLE KEY_VALUE (KEY TEXT PRIMARY KEY, VALUE INTEGER)", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "BEGIN", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    Dim bindSql As String
    bindSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "

    For i = 1 To BULK_COUNT
        If i <> 1 Then
            bindSql = bindSql & ","
        End If
        bindSql = bindSql & "(?,?)"
    Next

    'SQL���
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    Dim id As Long
    id = 0

    '�]���������BULK_COUNT���ł̃T���v�������i���̏ꍇ��100�񃋁[�v�j
    For i = 1 To 10000 \ BULK_COUNT

        For j = 1 To BULK_COUNT * COLUMN_COUNT Step COLUMN_COUNT

            id = id + 1

            ret = SQLite3BindText(stmtHandle, j, "str" & CStr(id))
            If ret <> SQLITE_OK Then
                Exit Sub
            End If

            ret = SQLite3BindInt32(stmtHandle, j + 1, id)
            If ret <> SQLITE_OK Then
                Exit Sub
            End If

        Next

        'SQL���s
        ret = SQLite3Step(stmtHandle)
        If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
            Exit Sub
        End If

        'SQL�ė��p
        ret = SQLite3Reset(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        '�o�C���h�ė��p
        ret = SQLite3ClearBindings(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

    Next

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    bindSql = "INSERT INTO KEY_VALUE (KEY, VALUE) VALUES "

    'BULK_COUNT�ɖ����Ȃ��c�������̃T���v�������i���̏ꍇ�͎c�肪10���j
    For i = 1 To 10
        If i <> 1 Then
            bindSql = bindSql & ","
        End If
        bindSql = bindSql & "(?,?)"
    Next

    'SQL���
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'BULK_COUNT�ɖ����Ȃ��c�������̃T���v�������i���̏ꍇ�͎c�肪10���j
    For j = 1 To 10 * COLUMN_COUNT Step COLUMN_COUNT

        id = id + 1

        ret = SQLite3BindText(stmtHandle, j, "str" & CStr(id))
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        ret = SQLite3BindInt32(stmtHandle, j + 1, id)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

    Next

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "COMMIT", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "SELECT VALUE FROM KEY_VALUE WHERE KEY = ?", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    '�ǉ�����10000����PK��1�s����10000�񒊏o����T���v������
    For i = 1 To 10000

        'SQL�o�C���h
        ret = SQLite3BindText(stmtHandle, 1, "str" & CStr(i))
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        'SQL���s
        ret = SQLite3Step(stmtHandle)

        '�t�F�b�`
        If ret = SQLITE_ROW Then
            value = SQLite3ColumnInt32(stmtHandle, 0)
        End If

        ret = SQLite3Step(stmtHandle)
        If ret <> SQLITE_DONE Then
            Exit Sub
        End If

        'SQL�ė��p
        ret = SQLite3Reset(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

        '�o�C���h�ė��p
        ret = SQLite3ClearBindings(stmtHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If

    Next

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'DB�t�@�C��Close
    ret = SQLite3Close(connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub


Public Sub openDb(ByVal target As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr, Optional ByVal delFlg As Boolean = False)
    On Error Resume Next
    Dim dbFile As String
    
    If InStr(target, "-") > 0 Then
        dbFile = Split(target, "-")(1)
    Else
        dbFile = target
    End If
    dbFile = DataManageTool.dbPath & "\" & dbFile & ".db3"
    If delFlg Then
        'DB�t�@�C���폜
        If Dir(dbFile) <> "" Then
            Kill dbFile
        End If
    End If
    'DB�t�@�C��Open
    ret = SQLite3Open(dbFile, connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "PRAGMA synchronous = OFF", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���
    ret = SQLite3PrepareV2(connHandle, "PRAGMA journal_mode = PERSIST", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub

Public Sub closeDb(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'DB�t�@�C��Close
    ret = SQLite3Close(connHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
    
End Sub

Public Sub createTable(ByVal bindSql As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)

    'SQL���
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub

Public Function selectTable(ByVal bindSql As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr) As Long

    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)

    '�t�F�b�`
    If ret = SQLITE_ROW Then
       selectTable = SQLite3ColumnInt32(stmtHandle, 0)
    End If
    
    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Function
    End If
    
End Function

Public Sub insertTable(ByVal bindSql As String, ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    
    ret = SQLite3PrepareV2(connHandle, bindSql, stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
    
    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        ret = SQLite3Finalize(stmtHandle)
        
        'DB�t�@�C��Close
        ret = SQLite3Close(connHandle)
        If ret <> SQLITE_OK Then
            Exit Sub
        End If
        'ADD BY YC_LI AT 2016/08/22 [S]
        ret = 19
        'ADD BY YC_LI AT 2016/08/22 [E]
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

End Sub


Public Sub updateTable()

End Sub

Public Sub deleteTable()

End Sub

Public Sub doBegin(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'SQL���
    ret = SQLite3PrepareV2(connHandle, "BEGIN", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
End Sub

Public Sub doCommit(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'SQL���
    ret = SQLite3PrepareV2(connHandle, "COMMIT", stmtHandle)
    If ret <> SQLITE_OK Then
        ret = SQLite3Finalize(stmtHandle)
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
End Sub

Public Sub doRollback(ByRef ret As Long, ByRef connHandle As LongPtr, ByRef stmtHandle As LongPtr)
    'SQL���
    ret = SQLite3PrepareV2(connHandle, "ROLLBACK", stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If

    'SQL���s
    ret = SQLite3Step(stmtHandle)
    If ret <> SQLITE_DONE And ret <> SQLITE_ROW Then
        Exit Sub
    End If

    '�X�e�[�g�����g�j��
    ret = SQLite3Finalize(stmtHandle)
    If ret <> SQLITE_OK Then
        Exit Sub
    End If
End Sub
'ADD BY YC_LI AT 2016/08/22 [S]

Public Function getValueBySql(ByVal target As String, ByVal sql As String) As String
 Dim ctrl As New Sqlite3Ctrl
 Dim ret As Long
 #If Win64 Then
        'SQLiteDLL�ǂݍ���
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X64_FOLDER_NAME)
        '�R�l�N�V�����n���h����`
        Dim connHandle As LongPtr
        '�X�e�[�g�����g�n���h����`
        Dim stmtHandle As LongPtr
    #Else
        'SQLiteDLL�ǂݍ���
        ret = SQLite3Initialize(DataManageTool.DllPath & "\" & X86_FOLDER_NAME)
        '�R�l�N�V�����n���h����`
        Dim connHandle2 As Long
        '�X�e�[�g�����g�n���h����`
        Dim stmtHandle2 As Long
  #End If
  If ret <> SQLITE_INIT_OK Then
     Exit Function
  End If
  Call ctrl.openDb(target, ret, connHandle2, stmtHandle2, False)
  If ret <> SQLITE_OK Then
     Exit Function
  End If
    'beginTrans
  Call ctrl.doBegin(ret, connHandle2, stmtHandle2)
  getValueBySql = ""
  getValueBySql = ctrl.selectTable(sql, ret, connHandle2, stmtHandle2)
  Call ctrl.closeDb(ret, connHandle2, stmtHandle2)
End Function
'ADD BY YC_LI AT 2016/08/22 [E]