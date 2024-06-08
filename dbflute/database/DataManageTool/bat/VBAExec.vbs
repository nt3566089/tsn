Option Explicit

Dim shell
Dim curDir
Dim excel
Dim workbook
Const xlAutoOpen = 1
Dim excelFilePath
Dim excelFileName
Dim moduleName
Dim argument1
Dim argument2


'�����`�F�b�N
if (WScript.Arguments.Count <> 3) And (WScript.Arguments.Count <> 4) And (WScript.Arguments.Count <> 5) then
    WScript.echo("Arguments Error." & WScript.Arguments.Count)
    WScript.echo("Usage: excelFilePath excelFileName moduleName [argumentName1] [argumentName2]")
    WScript.Quit(-1)
end if

excelFilePath = WScript.Arguments(0)
excelFileName = WScript.Arguments(1)
moduleName = WScript.Arguments(2)

if WScript.Arguments.Count >= 4 then
	argument1 = WScript.Arguments(3)
end if
if WScript.Arguments.Count >= 5 then
	argument2 = WScript.Arguments(4)
end if



' �J�����g�f�B���N�g���擾.
Set shell = CreateObject( "WScript.Shell" )
curDir = shell.CurrentDirectory & excelFilePath

Set shell = Nothing


'Excel�I�u�W�F�N�g�擾
Set excel = WScript.CreateObject("Excel.Application")

'Workbook���J��
Set workbook = excel.Workbooks.Open(curDir & "\" & excelFileName, False, True)

'Excel�t�@�C����\��
excel.Visible = True

' �����N���}�N��(Auto_Open)���s
workbook.RunAutoMacros xlAutoOpen

'���s
if argument2 <> "" then
	excel.Run moduleName, argument1, argument2
elseif argument1 <> "" then
	excel.Run moduleName, argument1
else
	excel.Run moduleName
end if

'Excel���I��
excel.Quit
Set workbook = Nothing
Set excel = Nothing
