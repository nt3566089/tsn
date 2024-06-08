package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of B_ITEM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BItemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BItemDbm _instance = new BItemDbm();
    private BItemDbm() {}
    public static BItemDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((BItem)et).getItemId(), (et, vl) -> ((BItem)et).setItemId(ctl(vl)), "itemId");
        setupEpg(_epgMap, et -> ((BItem)et).getScreenId(), (et, vl) -> ((BItem)et).setScreenId(ctl(vl)), "screenId");
        setupEpg(_epgMap, et -> ((BItem)et).getItemCd(), (et, vl) -> ((BItem)et).setItemCd((String)vl), "itemCd");
        setupEpg(_epgMap, et -> ((BItem)et).getDictId(), (et, vl) -> ((BItem)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BItem)et).getItemType(), (et, vl) -> ((BItem)et).setItemType((String)vl), "itemType");
        setupEpg(_epgMap, et -> ((BItem)et).getVisible(), (et, vl) -> ((BItem)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((BItem)et).getEditable(), (et, vl) -> ((BItem)et).setEditable((String)vl), "editable");
        setupEpg(_epgMap, et -> ((BItem)et).getTextAlign(), (et, vl) -> ((BItem)et).setTextAlign((String)vl), "textAlign");
        setupEpg(_epgMap, et -> ((BItem)et).getNecessary(), (et, vl) -> ((BItem)et).setNecessary((String)vl), "necessary");
        setupEpg(_epgMap, et -> ((BItem)et).getDisplayRequired(), (et, vl) -> ((BItem)et).setDisplayRequired((String)vl), "displayRequired");
        setupEpg(_epgMap, et -> ((BItem)et).getDelFlg(), (et, vl) -> ((BItem)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BItem)et).getVersionNo(), (et, vl) -> ((BItem)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BItem)et).getControlNo(), (et, vl) -> ((BItem)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BItem)et).getAddDt(), (et, vl) -> ((BItem)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BItem)et).getAddUser(), (et, vl) -> ((BItem)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BItem)et).getAddProcess(), (et, vl) -> ((BItem)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BItem)et).getUpdDt(), (et, vl) -> ((BItem)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BItem)et).getUpdUser(), (et, vl) -> ((BItem)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BItem)et).getUpdProcess(), (et, vl) -> ((BItem)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BItem)et).getBScreen(), (et, vl) -> ((BItem)et).setBScreen((BScreen)vl), "BScreen");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBDict(), (et, vl) -> ((BItem)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BItem)et).getVDict(), (et, vl) -> ((BItem)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BItem)et).getVHtDict(), (et, vl) -> ((BItem)et).setVHtDict((VHtDict)vl), "VHtDict");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBClassDtlByItemType(), (et, vl) -> ((BItem)et).setBClassDtlByItemType((BClassDtl)vl), "BClassDtlByItemType");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBClassDtlByVisible(), (et, vl) -> ((BItem)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBClassDtlByEditable(), (et, vl) -> ((BItem)et).setBClassDtlByEditable((BClassDtl)vl), "BClassDtlByEditable");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBClassDtlByTextAlign(), (et, vl) -> ((BItem)et).setBClassDtlByTextAlign((BClassDtl)vl), "BClassDtlByTextAlign");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBClassDtlByNecessary(), (et, vl) -> ((BItem)et).setBClassDtlByNecessary((BClassDtl)vl), "BClassDtlByNecessary");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBClassDtlByDisplayRequired(), (et, vl) -> ((BItem)et).setBClassDtlByDisplayRequired((BClassDtl)vl), "BClassDtlByDisplayRequired");
        setupEfpg(_efpgMap, et -> ((BItem)et).getBItemValidAsOne(), (et, vl) -> ((BItem)et).setBItemValidAsOne((BItemValid)vl), "BItemValidAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_ITEM";
    protected final String _tableDispName = "B_ITEM";
    protected final String _tablePropertyName = "BItem";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_ITEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnItemId = cci("ITEM_ID", "ITEM_ID", null, null, Long.class, "itemId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BColList,BColExtBaseList,BColExtUserList,BItemRoleList,MCenterItemList,MClientItemList", null, false);
    protected final ColumnInfo _columnScreenId = cci("SCREEN_ID", "SCREEN_ID", null, null, Long.class, "screenId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BScreen", null, null, false);
    protected final ColumnInfo _columnItemCd = cci("ITEM_CD", "ITEM_CD", null, null, String.class, "itemCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnItemType = cci("ITEM_TYPE", "ITEM_TYPE", null, null, String.class, "itemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByItemType", null, CDef.DefMeta.ItemType, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByVisible", null, CDef.DefMeta.Visible, false);
    protected final ColumnInfo _columnEditable = cci("EDITABLE", "EDITABLE", null, null, String.class, "editable", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByEditable", null, CDef.DefMeta.Editable, false);
    protected final ColumnInfo _columnTextAlign = cci("TEXT_ALIGN", "TEXT_ALIGN", null, null, String.class, "textAlign", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByTextAlign", null, CDef.DefMeta.TextAlign, false);
    protected final ColumnInfo _columnNecessary = cci("NECESSARY", "NECESSARY", null, null, String.class, "necessary", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByNecessary", null, CDef.DefMeta.Necessary, false);
    protected final ColumnInfo _columnDisplayRequired = cci("DISPLAY_REQUIRED", "DISPLAY_REQUIRED", null, null, String.class, "displayRequired", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByDisplayRequired", null, CDef.DefMeta.DisplayRequired, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemId() { return _columnItemId; }
    /**
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenId() { return _columnScreenId; }
    /**
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCd() { return _columnItemCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemType() { return _columnItemType; }
    /**
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisible() { return _columnVisible; }
    /**
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEditable() { return _columnEditable; }
    /**
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTextAlign() { return _columnTextAlign; }
    /**
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNecessary() { return _columnNecessary; }
    /**
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayRequired() { return _columnDisplayRequired; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnItemId());
        ls.add(columnScreenId());
        ls.add(columnItemCd());
        ls.add(columnDictId());
        ls.add(columnItemType());
        ls.add(columnVisible());
        ls.add(columnEditable());
        ls.add(columnTextAlign());
        ls.add(columnNecessary());
        ls.add(columnDisplayRequired());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnItemId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnItemCd());
        ls.add(columnScreenId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBScreen() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScreenId(), BScreenDbm.getInstance().columnScreenId());
        return cfi("B_ITEM_FK2", "BScreen", this, BScreenDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BItemList", false);
    }
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_ITEM_FK1", "BDict", this, BDictDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BItemList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_ITEM_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_B_ITEM_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my ITEM_TYPE, named 'BClassDtlByItemType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByItemType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_ITEM_TYPE", "BClassDtlByItemType", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ITEM_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEditable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEditable(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_EDITABLE", "BClassDtlByEditable", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'EDITABLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTextAlign() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTextAlign(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_TEXT_ALIGN", "BClassDtlByTextAlign", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'TEXT_ALIGN'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByNecessary() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNecessary(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_NECESSARY", "BClassDtlByNecessary", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'NECESSARY'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DISPLAY_REQUIRED, named 'BClassDtlByDisplayRequired'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDisplayRequired() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDisplayRequired(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_ITEM_DISPLAY_REQUIRED", "BClassDtlByDisplayRequired", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DISPLAY_REQUIRED'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBItemValidAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BItemValidDbm.getInstance().columnItemId());
        return cfi("B_ITEM_VALID_FK1", "BItemValidAsOne", this, BItemValidDbm.getInstance(), mp, 10, null, true, false, true, false, null, null, false, "BItem", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_COL by ITEM_ID, named 'BColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BColDbm.getInstance().columnItemId());
        return cri("B_COL_FK2", "BColList", this, BColDbm.getInstance(), mp, false, "BItem");
    }
    /**
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBColExtBaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BColExtBaseDbm.getInstance().columnItemId());
        return cri("B_COL_EXT_BASE_FK1", "BColExtBaseList", this, BColExtBaseDbm.getInstance(), mp, false, "BItem");
    }
    /**
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBColExtUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BColExtUserDbm.getInstance().columnItemId());
        return cri("B_COL_EXT_USER_FK1", "BColExtUserList", this, BColExtUserDbm.getInstance(), mp, false, "BItem");
    }
    /**
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBItemRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BItemRoleDbm.getInstance().columnItemId());
        return cri("B_ITEM_ROLE_FK2", "BItemRoleList", this, BItemRoleDbm.getInstance(), mp, false, "BItem");
    }
    /**
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), MCenterItemDbm.getInstance().columnItemId());
        return cri("M_CENTER_ITEM_FK3", "MCenterItemList", this, MCenterItemDbm.getInstance(), mp, false, "BItem");
    }
    /**
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), MClientItemDbm.getInstance().columnItemId());
        return cri("M_CLIENT_ITEM_FK1", "MClientItemList", this, MClientItemDbm.getInstance(), mp, false, "BItem");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BItem"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BItemCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BItemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BItem> getEntityType() { return BItem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BItem newEntity() { return new BItem(); }
    public BItem newMyEntity() { return new BItem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BItem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BItem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
