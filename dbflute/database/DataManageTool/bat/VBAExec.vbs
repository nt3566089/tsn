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


'引数チェック
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



' カレントディレクトリ取得.
Set shell = CreateObject( "WScript.Shell" )
curDir = shell.CurrentDirectory & excelFilePath

Set shell = Nothing


'Excelオブジェクト取得
Set excel = WScript.CreateObject("Excel.Application")

'Workbookを開く
Set workbook = excel.Workbooks.Open(curDir & "\" & excelFileName, False, True)

'Excelファイルを表示
excel.Visible = True

' 自動起動マクロ(Auto_Open)実行
workbook.RunAutoMacros xlAutoOpen

'実行
if argument2 <> "" then
	excel.Run moduleName, argument1, argument2
elseif argument1 <> "" then
	excel.Run moduleName, argument1
else
	excel.Run moduleName
end if

'Excelを終了
excel.Quit
Set workbook = Nothing
Set excel = Nothing
