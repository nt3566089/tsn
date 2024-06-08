Attribute VB_Name = "DataManageTool"
Option Explicit

Public Const CONFIG_FILE_PATH As String = "conf"
Public Const DB_FILE_PATH As String = "db"
Public Const DLL_FILE_PATH As String = "dll"
Public Const EXCEL_FILE_PATH As String = "excel"
Public Const TSV_FILE_PATH As String = "tsv"
Public Const OUTPUT_FILE_PATH As String = "output"
'ADD マニュアル作成用に追加 2020.03.03 TANAKA [S]
Public Const MANUAL_TSV_FILE_PATH As String = "manual"
'ADD マニュアル作成用に追加 2020.03.03 TANAKA [E]

Public Const TSV_FILE_EXT As String = ".tsv"

Public Const CONFIG_DATA_OUTPUT_FOLDER_NAME As String = "DataOutputFolder"

Private Const MAIN_MENU_NAME As String = "データ管理"
Private Const DB_MENU_NAME As String = "１、ＤＢ作成"
Private Const OUTPUT_MENU_NAME As String = "２、データ出力"
Private Const DB_NEW_MENU_NAME As String = "新規作成"
Private Const DB_MAJI_MENU_NAME As String = "マージ"
Private Const DBFLUTE_MENU_NAME As String = "３、Dfprop生成"
Private Const JAVACONST_MENU_NAME As String = "４、メッセージConst生成"
'ADD BY SJA_YIN AT 2016/12/13 [S]
Private Const ITEMDOC_MENU_NAME As String = "５、項目仕様自動出力"
'ADD BY SJA_YIN AT 2016/12/13 [E]
'ADD BY YC_LI AT 2016/08/05 [S]
Private Const ALL_CREATE_DB_MENU_NAME As String = "全て"
Public Const PROP_FILE_EXT As String = ".dfprop"
Public Const DATE_OUTPUT_FOLDER As String = "DataOutputFolder"
Public Const LIST_DATE_INPUT_FOLDER As String = "ListDataInputFolder"
Public Const CLASS_INPUT_FOLDER As String = "ClassInputFolder"
Public Const ADDITIONAL_FOREIGNKEY_MAPFILE As String = "AdditionalForeignKeyMapFile"
Public Const CLASSIFICATION_DEFINITION_MAPFILE As String = "ClassificationDefinitionMapFile"
Public Const CLASSIFICATION_DELOYMENT_MAPFILE As String = "ClassificationDeploymentMapFile"
Public Const LISTDATE_INPUTREAD_STARTROW As String = "ListDataInputReadStartRow"
Public Const CLASS_DATE_INPUT_READ_STARTROW As String = "ClassDataInputReadStartRow"
Public Const CLASS_CD As String = "ClassCd"
Public Const CLASS_COMMENT As String = "ClassComment"
Public Const CLASS_DTL_CD As String = "ClassDtlCd"
Public Const CLASS_DEL_DICT_NM As String = "ClassDtlDictNm"
Public Const USER_TABLE_NAME As String = "UseTableName"
Public Const USER_TABLE As String = "UseTable"
Public Const USER_COLUMN As String = "UseColumn"
Public Const USER_IDENTIFY As String = "UseIdentify"
Public Const USER_CLASS_CD As String = "UseClassCd"
Public Const CLOUMN_PHYSICAL_NM As String = "ColumnPhysicalNm"
'ADD BY YC_LI AT 2016/09/06 [S]
Public Const DFPROP_OUTPUT_EXCEPT As String = "DfpropOutputExcept"
Public Const DEPLOYMENT_EXCEPT_FOLDER As String = "DeploymentExceptFolder"
'ADD BY YC_LI AT 2016/09/06 [E]
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana Start
Public Const ADDITIONAL_FOREIGN_KEY_MAP_START_TEXT As String = "AdditionalForeignKeyMapStartText"
Public Const ADDITIONAL_FOREIGN_KEY_MAP_END_TEXT As String = "AdditionalForeignKeyMapEndText"
Public Const CLASSIFICATION_DEFINITION_MAP_START_TEXT As String = "ClassificationDefinitionMapStartText"
Public Const CLASSIFICATION_DEFINITION_MAP_END_TEXT As String = "ClassificationDefinitionMapEndText"
Public Const CLASSIFICATION_DEPLOYMENT_MAP_START_TEXT As String = "ClassificationDeploymentMapStartText"
Public Const CLASSIFICATION_DEPLOYMENT_MAP_END_TEXT As String = "ClassificationDeploymentMapEndText"
' [#2213] 区分値用dfprop分割対応 2017.08.03 kawana End

Public Const XLSX_FILE_EXT As String = ".xlsx"
Public Const XLSM_FILE_EXT As String = ".xlsm"

Public Const READ_START_ROW As String = "ReadStartRow"
Public Const COL_NOT_NULL As String = "ColNotNull"
Public Const COL_NUMBER_TYPE As String = "ColNumberType"
Public Const COL_DATE_TYPE As String = "ColDateType"
Public Const COL_DATETIME_TYPE As String = "ColDateTimeType"
Public Const COL_DUPLICATE_CHECK As String = "ColDuplicateCheck"

'ADD BY SJA_YIN AT 2016/12/14 [S]
Public Const ITEM_DOC_OUTPUT_FOLDER As String = "ItemDocOutputFolder"
Public Const HTML_INPUT_FOLDER As String = "HtmlInputFolder"
Public Const HTML_LIST_INPUT_FOLDER As String = "HtmlListInputFolder"
Public Const DATA_INPUT_FOLDER As String = "Data_InputFolder"
Public Const SCREEN_LIST_DATA_INPUT_FOLDER As String = "ScreenListDataInputFolder"
Public Const DICT_DATA_INPUT_FOLDER As String = "DictDataInputFolder"
Public Const CLASS_DATA_INPUT_FOLDER As String = "ClassDataInputFolder"
Public Const SCREEN_LIST_DATA_INPUT_READ_START_ROW As String = "ScreenListDataInputReadStartRow"
Public Const DICT_DATA_INPUT_READ_START_ROW As String = "DictDataInputReadStartRow"
Public Const CLASS_DATA_INPUT_READ_START_ROW As String = "ClassDataInputReadStartRow"
Public Const CLASS_DTL_DICT_NM As String = "ClassDtlDictNm"
Public Const DICT_NM As String = "DictNm"
Public Const INPUT_LIMIT As String = "InputLimit"
Public Const MAX_CHARS As String = "MaxChars"
Public Const MIN_NUMBER As String = "MinNumber"
Public Const MAX_NUMBER As String = "MaxNumber"
Public Const INTEGER_LENGTH As String = "IntegerLength"
Public Const DECIMAL_LENGTH As String = "DecimalLength"
Public Const SCREEN_CD As String = "ScreenCd"
Public Const SCREEN_NM As String = "ScreenNm"
Public Const ITEM_CD As String = "ItemCd"
Public Const ITEM_NM As String = "ItemNm"
Public Const ITEM_TYPE As String = "ItemType"
Public Const ITEM_EDITABLE As String = "ItemEditable"
Public Const ITEM_NECESSARY As String = "ItemNecessary"
Public Const COL_CD As String = "ColCd"
Public Const COL_NM As String = "ColNm"
Public Const COL_ORDER As String = "ColOrder"
Public Const COL_TYPE As String = "ColType"
Public Const COL_EDITABLE As String = "ColEditable"
Public Const COL_NECESSARY As String = "ColNecessary"
Public Const DATA_OUTPUT_TEMPLATE_SHEET As String = "DataOutputTemplateSheet"
Public Const DATA_OUTPUT_SCREEN_CD As String = "DataOutputScreenCd"
Public Const DATA_OUTPUT_SCREEN_NM As String = "DataOutputScreenNm"
Public Const DATA_OUTPUT_ITEM_POSITION As String = "DataOutputItemPosition"
Public Const DATA_OUTPUT_ITEM_NM As String = "DataOutputItemNm"
Public Const DATA_OUTPUT_TYPE As String = "DataOutputType"
Public Const DATA_OUTPUT_EDITABLE As String = "DataOutputEditable"
Public Const DATA_OUTPUT_NECESSARY As String = "DataOutputNecessary"
Public Const DATA_OUTPUT_INPUT_TYPE As String = "DataOutputInputType"
Public Const DATA_OUTPUT_MAX_CHARS As String = "DataOutputMaxChars"
Public Const DATA_OUTPUT_INTEGER_LENGTH As String = "DataOutputIntegerLength"
Public Const DATA_OUTPUT_DECIMAL_LENGTH As String = "DataOutputDecimalLength"
Public Const DATA_OUTPUT_MIN_NUMBER As String = "DataOutputMinNumber"
Public Const DATA_OUTPUT_MAX_NUMBER As String = "DataOutputMaxNumber"
Public Const BASE_HTML_EXCEPT_FOLDER As String = "BaseHtmlExceptFolder"
Public Const WMS_HTML_EXCEPT_FOLDER As String = "WmsHtmlExceptFolder"
Public Const HTML_TO_TSV_SHEET As String = "HtmlToTsvSheet"
Public Const LOG_OUTPUT_FOLDER As String = "LogOutputFolder"
Public Const HTML_REPLACE_STRING As String = "HtmlReplaceString"
Public Const TOTAL_ITEM_DOC_OUTPUT_FILE As String = "TotalItemDocOutputFile"
Public Const LOG_FILE_NM As String = "Log.txt"
Public Const HTML_FILE_PATH As String = "partials"
Public Const JS_FILE_PATH As String = "js"
Public Const HTML_FILE_EXT As String = ".html"
Public Const JS_FILE_EXT As String = ".js"
'ADD BY SJA_YIN AT 2016/12/14 [E]
'ADD BY SJA_YIN AT 2017/03/13 <S>
Public Const HTML_EXCEPT_FILE As String = "HtmlExceptFile"
'ADD BY SJA_YIN AT 2017/03/13 <E>

'Public Const FOREIGN_TABLE_NAME_COLUMN As String = "ForeignTableNameColumn"

'ADD BY YC_LI AT 2016/08/05 [E]
Private m_rootPath As String

Private m_configPath As String
Private m_dbPath As String
Private m_dllPath As String
Private m_excelPath As String
Private m_tsvPath As String

Private m_config As Dictionary

Public Property Get RootPath() As String
    RootPath = m_rootPath
End Property

Public Property Get configPath() As String
    configPath = m_configPath
End Property

Public Property Get dbPath() As String
    dbPath = m_dbPath
End Property

Public Property Get DllPath() As String
    DllPath = m_dllPath
End Property

Public Property Get ExcelPath() As String
    ExcelPath = m_excelPath
End Property

Public Property Get TsvPath() As String
    TsvPath = m_tsvPath
End Property

Public Property Get config() As Dictionary
    Set config = m_config
End Property

Private Sub Auto_Open()
    Initialize
End Sub

Public Sub Initialize()
    On Error GoTo ErrorHandler

    Dim ac As New AppCtrl
    ac.StartApp

    m_rootPath = ThisWorkbook.path

    m_configPath = m_rootPath & "\" & CONFIG_FILE_PATH
    m_dbPath = m_rootPath & "\" & DB_FILE_PATH
    m_dllPath = m_rootPath & "\" & DLL_FILE_PATH
    m_excelPath = m_rootPath & "\" & EXCEL_FILE_PATH
    m_tsvPath = m_rootPath & "\" & TSV_FILE_PATH

    Set m_config = Common.GetConfig(m_configPath, ThisWorkbook.name)

    '各種マクロを実行する為のメニューを作成（自身の設定ファイルを元に）
    Dim menuMain As Menu
    Set menuMain = MenuBars(xlWorksheet).Menus.Add(MAIN_MENU_NAME)

    Dim menuSub As Menu
    Dim list As Collection
    Dim title As Variant
    'ＤＢ作成 -> 新規作成
    Dim menuSub11 As Menu
    'ＤＢ作成 -> マージ
    Dim menuSub12 As Menu
    'DBFLUTEDFPROP
    Dim menuSubDBFLUTED As Menu
    'JAVACONST
    Dim menuSubJAVACONST As Menu
    'ADD BY SJA_YIN AT 2016/12/13 [S]
    'ITEMDOC
    Dim menuSubITEMDOC As Menu
    'ADD BY SJA_YIN AT 2016/12/13 [E]

    Set menuSub = menuMain.MenuItems.AddMenu(DB_MENU_NAME)
    'ＤＢ作成 -> 新規作成
    Set menuSub11 = menuSub.MenuItems.AddMenu(DB_NEW_MENU_NAME)
    'ＤＢ作成 -> マージ
    Set menuSub12 = menuSub.MenuItems.AddMenu(DB_MAJI_MENU_NAME)

    Set list = Common.getFileList(m_configPath & "\" & DB_FILE_PATH)
   'ADD BY YC_LI AT 2016/08/26 [S]
    Call menuSub11.MenuItems.Add(ALL_CREATE_DB_MENU_NAME, "'UniqueIdManage.createAllDb """ & ALL_CREATE_DB_MENU_NAME & """'")
   'ADD BY YC_LI AT 2016/08/26 [E]

    For Each title In list
        Call menuSub11.MenuItems.Add(title, "'UniqueIdManage.CreateDb """ & title & """'")
    Next
    'ADD BY YC_LI AT 2016/08/26 [S]
    Call menuSub12.MenuItems.Add(ALL_CREATE_DB_MENU_NAME, "'UniqueIdManage.mergeAllDb """ & ALL_CREATE_DB_MENU_NAME & """'")
    'ADD BY YC_LI AT 2016/08/26 [E]
    For Each title In list
        Call menuSub12.MenuItems.Add(title, "'UniqueIdManage.MergeDb """ & title & """'")
    Next
   
   
    Set menuSub = menuMain.MenuItems.AddMenu(OUTPUT_MENU_NAME)
    Set list = Common.getFileList(m_configPath & "\" & OUTPUT_FILE_PATH)
    
    'Add By NingQi At 2016/09/06 <S>
    Call menuSub.MenuItems.Add(ALL_CREATE_DB_MENU_NAME, "'DataOutput.CreateAllTsv """ & title & """'")
    'Add By NingQi At 2016/09/06 <S>
    
    For Each title In list
        Call menuSub.MenuItems.Add(title, "'DataOutput.CreateTsv """ & title & """'")
    Next
    
    'DBFLUTEDFPROP
    Set menuSubDBFLUTED = menuMain.MenuItems.AddMenu(DBFLUTE_MENU_NAME)
    Set list = New Collection
    list.Add "Dfprop生成"
'    list.Add "AdditionalForeignKeyMap 生成"
'    list.Add "ClassificationDefinitionMap 生成"
'    list.Add "ClassificationDeploymentMap 生成"

    For Each title In list
        Call menuSubDBFLUTED.MenuItems.Add(title, "'DataOutput.CreateDBFlute """ & title & """'")
    Next

    'JAVACONST
    Set menuSubJAVACONST = menuMain.MenuItems.AddMenu(JAVACONST_MENU_NAME)
    Set list = New Collection
    list.Add "メッセージConst生成"
    For Each title In list
        Call menuSubJAVACONST.MenuItems.Add(title, "'DataOutput.CreateConstTxt'")
    Next

    'ADD BY SJA_YIN AT 2016/12/13 [S]
    'ITEMDOC
    Set menuSubITEMDOC = menuMain.MenuItems.AddMenu(ITEMDOC_MENU_NAME)
    Call menuSubITEMDOC.MenuItems.Add(ALL_CREATE_DB_MENU_NAME, "'DataOutput.CreateItemDoc'")
    Set list = New Collection
    list.Add "画面毎に生成"

    For Each title In list
        Call menuSubITEMDOC.MenuItems.Add(title, "'DataOutput.CreateItemDoc """ & title & """'")
    Next
    'ADD BY SJA_YIN AT 2016/12/13 [E]
    
    GoTo FinallyHandler

ErrorHandler:
    ac.SetError
    Resume FinallyHandler

FinallyHandler:
    On Error Resume Next
    Call ac.EndApp
    Call ac.ShowMessage
End Sub
