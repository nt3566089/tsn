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
 * The DB meta of B_COL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BColDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BColDbm _instance = new BColDbm();
    private BColDbm() {}
    public static BColDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BCol)et).getColId(), (et, vl) -> ((BCol)et).setColId(ctl(vl)), "colId");
        setupEpg(_epgMap, et -> ((BCol)et).getItemId(), (et, vl) -> ((BCol)et).setItemId(ctl(vl)), "itemId");
        setupEpg(_epgMap, et -> ((BCol)et).getColCd(), (et, vl) -> ((BCol)et).setColCd((String)vl), "colCd");
        setupEpg(_epgMap, et -> ((BCol)et).getDictId(), (et, vl) -> ((BCol)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BCol)et).getColOrder(), (et, vl) -> ((BCol)et).setColOrder(ctl(vl)), "colOrder");
        setupEpg(_epgMap, et -> ((BCol)et).getColType(), (et, vl) -> ((BCol)et).setColType((String)vl), "colType");
        setupEpg(_epgMap, et -> ((BCol)et).getVisible(), (et, vl) -> ((BCol)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((BCol)et).getEditable(), (et, vl) -> ((BCol)et).setEditable((String)vl), "editable");
        setupEpg(_epgMap, et -> ((BCol)et).getTextAlign(), (et, vl) -> ((BCol)et).setTextAlign((String)vl), "textAlign");
        setupEpg(_epgMap, et -> ((BCol)et).getNecessary(), (et, vl) -> ((BCol)et).setNecessary((String)vl), "necessary");
        setupEpg(_epgMap, et -> ((BCol)et).getColWidth(), (et, vl) -> ((BCol)et).setColWidth(ctl(vl)), "colWidth");
        setupEpg(_epgMap, et -> ((BCol)et).getInColIndex(), (et, vl) -> ((BCol)et).setInColIndex(ctl(vl)), "inColIndex");
        setupEpg(_epgMap, et -> ((BCol)et).getInColDefaultValue(), (et, vl) -> ((BCol)et).setInColDefaultValue((String)vl), "inColDefaultValue");
        setupEpg(_epgMap, et -> ((BCol)et).getDelFlg(), (et, vl) -> ((BCol)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BCol)et).getVersionNo(), (et, vl) -> ((BCol)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BCol)et).getControlNo(), (et, vl) -> ((BCol)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BCol)et).getAddDt(), (et, vl) -> ((BCol)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BCol)et).getAddUser(), (et, vl) -> ((BCol)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BCol)et).getAddProcess(), (et, vl) -> ((BCol)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BCol)et).getUpdDt(), (et, vl) -> ((BCol)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BCol)et).getUpdUser(), (et, vl) -> ((BCol)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BCol)et).getUpdProcess(), (et, vl) -> ((BCol)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BCol)et).getBDict(), (et, vl) -> ((BCol)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBItem(), (et, vl) -> ((BCol)et).setBItem((BItem)vl), "BItem");
        setupEfpg(_efpgMap, et -> ((BCol)et).getVDict(), (et, vl) -> ((BCol)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((BCol)et).getVHtDict(), (et, vl) -> ((BCol)et).setVHtDict((VHtDict)vl), "VHtDict");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBClassDtlByColType(), (et, vl) -> ((BCol)et).setBClassDtlByColType((BClassDtl)vl), "BClassDtlByColType");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBClassDtlByVisible(), (et, vl) -> ((BCol)et).setBClassDtlByVisible((BClassDtl)vl), "BClassDtlByVisible");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBClassDtlByEditable(), (et, vl) -> ((BCol)et).setBClassDtlByEditable((BClassDtl)vl), "BClassDtlByEditable");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBClassDtlByTextAlign(), (et, vl) -> ((BCol)et).setBClassDtlByTextAlign((BClassDtl)vl), "BClassDtlByTextAlign");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBClassDtlByNecessary(), (et, vl) -> ((BCol)et).setBClassDtlByNecessary((BClassDtl)vl), "BClassDtlByNecessary");
        setupEfpg(_efpgMap, et -> ((BCol)et).getBColValidAsOne(), (et, vl) -> ((BCol)et).setBColValidAsOne((BColValid)vl), "BColValidAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_COL";
    protected final String _tableDispName = "B_COL";
    protected final String _tablePropertyName = "BCol";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_COL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnColId = cci("COL_ID", "COL_ID", null, null, Long.class, "colId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BColRoleList,MCenterColList,MClientColList", null, false);
    protected final ColumnInfo _columnItemId = cci("ITEM_ID", "ITEM_ID", null, null, Long.class, "itemId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BItem", null, null, false);
    protected final ColumnInfo _columnColCd = cci("COL_CD", "COL_CD", null, null, String.class, "colCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict,VHtDict", null, null, false);
    protected final ColumnInfo _columnColOrder = cci("COL_ORDER", "COL_ORDER", null, null, Long.class, "colOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColType = cci("COL_TYPE", "COL_TYPE", null, null, String.class, "colType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByColType", null, CDef.DefMeta.ColType, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByVisible", null, CDef.DefMeta.Visible, false);
    protected final ColumnInfo _columnEditable = cci("EDITABLE", "EDITABLE", null, null, String.class, "editable", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByEditable", null, CDef.DefMeta.Editable, false);
    protected final ColumnInfo _columnTextAlign = cci("TEXT_ALIGN", "TEXT_ALIGN", null, null, String.class, "textAlign", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByTextAlign", null, CDef.DefMeta.TextAlign, false);
    protected final ColumnInfo _columnNecessary = cci("NECESSARY", "NECESSARY", null, null, String.class, "necessary", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByNecessary", null, CDef.DefMeta.Necessary, false);
    protected final ColumnInfo _columnColWidth = cci("COL_WIDTH", "COL_WIDTH", null, null, Long.class, "colWidth", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInColIndex = cci("IN_COL_INDEX", "IN_COL_INDEX", null, null, Long.class, "inColIndex", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInColDefaultValue = cci("IN_COL_DEFAULT_VALUE", "IN_COL_DEFAULT_VALUE", null, null, String.class, "inColDefaultValue", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColId() { return _columnColId; }
    /**
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemId() { return _columnItemId; }
    /**
     * COL_CD: {+UQ, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColCd() { return _columnColCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * COL_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColOrder() { return _columnColOrder; }
    /**
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColType() { return _columnColType; }
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
     * COL_WIDTH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColWidth() { return _columnColWidth; }
    /**
     * IN_COL_INDEX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInColIndex() { return _columnInColIndex; }
    /**
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInColDefaultValue() { return _columnInColDefaultValue; }
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
        ls.add(columnColId());
        ls.add(columnItemId());
        ls.add(columnColCd());
        ls.add(columnDictId());
        ls.add(columnColOrder());
        ls.add(columnColType());
        ls.add(columnVisible());
        ls.add(columnEditable());
        ls.add(columnTextAlign());
        ls.add(columnNecessary());
        ls.add(columnColWidth());
        ls.add(columnInColIndex());
        ls.add(columnInColDefaultValue());
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
    protected UniqueInfo cpui() { return hpcpui(columnColId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnItemId());
        ls.add(columnColCd());
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
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("B_COL_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BColList", false);
    }
    /**
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBItem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BItemDbm.getInstance().columnItemId());
        return cfi("B_COL_FK2", "BItem", this, BItemDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BColList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_B_COL_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVHtDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VHtDictDbm.getInstance().columnDictId());
        return cfi("FK_B_COL_TO_V_HT_DICT", "VHtDict", this, VHtDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVHtDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByColType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnColType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_COL_TYPE", "BClassDtlByColType", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COL_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVisible() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVisible(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_VISIBLE", "BClassDtlByVisible", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VISIBLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEditable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEditable(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_EDITABLE", "BClassDtlByEditable", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'EDITABLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTextAlign() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTextAlign(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_TEXT_ALIGN", "BClassDtlByTextAlign", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'TEXT_ALIGN'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByNecessary() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNecessary(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_COL_NECESSARY", "BClassDtlByNecessary", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'NECESSARY'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBColValidAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnColId(), BColValidDbm.getInstance().columnColId());
        return cfi("B_COL_VALID_FK1", "BColValidAsOne", this, BColValidDbm.getInstance(), mp, 9, null, true, false, true, false, null, null, false, "BCol", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_COL_ROLE by COL_ID, named 'BColRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBColRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnColId(), BColRoleDbm.getInstance().columnColId());
        return cri("B_COL_ROLE_FK1", "BColRoleList", this, BColRoleDbm.getInstance(), mp, false, "BCol");
    }
    /**
     * M_CENTER_COL by COL_ID, named 'MCenterColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnColId(), MCenterColDbm.getInstance().columnColId());
        return cri("M_CENTER_COL_FK1", "MCenterColList", this, MCenterColDbm.getInstance(), mp, false, "BCol");
    }
    /**
     * M_CLIENT_COL by COL_ID, named 'MClientColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnColId(), MClientColDbm.getInstance().columnColId());
        return cri("M_CLIENT_COL_FK1", "MClientColList", this, MClientColDbm.getInstance(), mp, false, "BCol");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BCol"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BColCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BColBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BCol> getEntityType() { return BCol.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BCol newEntity() { return new BCol(); }
    public BCol newMyEntity() { return new BCol(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BCol)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BCol)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
