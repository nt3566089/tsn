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
 * The DB meta of B_DICT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BDictDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BDictDbm _instance = new BDictDbm();
    private BDictDbm() {}
    public static BDictDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BDict)et).getDictId(), (et, vl) -> ((BDict)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((BDict)et).getDictNm(), (et, vl) -> ((BDict)et).setDictNm((String)vl), "dictNm");
        setupEpg(_epgMap, et -> ((BDict)et).getDataType(), (et, vl) -> ((BDict)et).setDataType((String)vl), "dataType");
        setupEpg(_epgMap, et -> ((BDict)et).getSystemType(), (et, vl) -> ((BDict)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((BDict)et).getDelFlg(), (et, vl) -> ((BDict)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BDict)et).getVersionNo(), (et, vl) -> ((BDict)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BDict)et).getControlNo(), (et, vl) -> ((BDict)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BDict)et).getAddDt(), (et, vl) -> ((BDict)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BDict)et).getAddUser(), (et, vl) -> ((BDict)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BDict)et).getAddProcess(), (et, vl) -> ((BDict)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BDict)et).getUpdDt(), (et, vl) -> ((BDict)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BDict)et).getUpdUser(), (et, vl) -> ((BDict)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BDict)et).getUpdProcess(), (et, vl) -> ((BDict)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BDict)et).getBClassDtlByDataType(), (et, vl) -> ((BDict)et).setBClassDtlByDataType((BClassDtl)vl), "BClassDtlByDataType");
        setupEfpg(_efpgMap, et -> ((BDict)et).getBDictValidAsOne(), (et, vl) -> ((BDict)et).setBDictValidAsOne((BDictValid)vl), "BDictValidAsOne");
        setupEfpg(_efpgMap, et -> ((BDict)et).getMHtDictAsOne(), (et, vl) -> ((BDict)et).setMHtDictAsOne((MHtDict)vl), "MHtDictAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_DICT";
    protected final String _tableDispName = "B_DICT";
    protected final String _tablePropertyName = "BDict";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_DICT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "BArgList,BClassDtlList,BColList,BCultureList,BDictCultureList,BItemList,BMenuList,BMenuGrpList,BRoleList,BRoleGrpList,BScreenList,MCenterClassDtlList,MCenterColList,MCenterItemList,MCenterScreenList,MClientColList,MClientItemList,MClientScreenList,MProcessTypeList,MShapeByShapeDictIdList,MShapeByShapeUnitDictIdList,MStockTypeList,PReportLayoutItemList,PSubrepLayoutItemList", null, false);
    protected final ColumnInfo _columnDictNm = cci("DICT_NM", "DICT_NM", null, null, String.class, "dictNm", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataType = cci("DATA_TYPE", "DATA_TYPE", null, null, String.class, "dataType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByDataType", null, CDef.DefMeta.DataType, false);
    protected final ColumnInfo _columnSystemType = cci("SYSTEM_TYPE", "SYSTEM_TYPE", null, null, String.class, "systemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictNm() { return _columnDictNm; }
    /**
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataType() { return _columnDataType; }
    /**
     * SYSTEM_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemType() { return _columnSystemType; }
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
        ls.add(columnDictId());
        ls.add(columnDictNm());
        ls.add(columnDataType());
        ls.add(columnSystemType());
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
    protected UniqueInfo cpui() { return hpcpui(columnDictId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnDictNm()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_CLASS_DTL by my DATA_TYPE, named 'BClassDtlByDataType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDataType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDataType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_DICT_DATA_TYPE", "BClassDtlByDataType", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DATA_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBDictValidAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictValidDbm.getInstance().columnDictId());
        return cfi("B_DICT_VALID_FK1", "BDictValidAsOne", this, BDictValidDbm.getInstance(), mp, 1, null, true, false, true, false, null, null, false, "BDict", false);
    }
    /**
     * M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMHtDictAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MHtDictDbm.getInstance().columnDictId());
        return cfi("M_HT_DICT_FK1", "MHtDictAsOne", this, MHtDictDbm.getInstance(), mp, 2, null, true, false, true, false, null, null, false, "BDict", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * B_ARG by DICT_ID, named 'BArgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBArgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BArgDbm.getInstance().columnDictId());
        return cri("B_ARG_FK2", "BArgList", this, BArgDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_CLASS_DTL by DICT_ID, named 'BClassDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBClassDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BClassDtlDbm.getInstance().columnDictId());
        return cri("B_CLASS_DTL_FK2", "BClassDtlList", this, BClassDtlDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_COL by DICT_ID, named 'BColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BColDbm.getInstance().columnDictId());
        return cri("B_COL_FK1", "BColList", this, BColDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_CULTURE by DICT_ID, named 'BCultureList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBCultureList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BCultureDbm.getInstance().columnDictId());
        return cri("B_CULTURE_FK1", "BCultureList", this, BCultureDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBDictCultureList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictCultureDbm.getInstance().columnDictId());
        return cri("B_DICT_CULTURE_FK1", "BDictCultureList", this, BDictCultureDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_ITEM by DICT_ID, named 'BItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BItemDbm.getInstance().columnDictId());
        return cri("B_ITEM_FK1", "BItemList", this, BItemDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_MENU by DICT_ID, named 'BMenuList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBMenuList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BMenuDbm.getInstance().columnDictId());
        return cri("B_MENU_FK1", "BMenuList", this, BMenuDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBMenuGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BMenuGrpDbm.getInstance().columnDictId());
        return cri("B_MENU_GRP_FK2", "BMenuGrpList", this, BMenuGrpDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_ROLE by DICT_ID, named 'BRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BRoleDbm.getInstance().columnDictId());
        return cri("B_ROLE_FK1", "BRoleList", this, BRoleDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBRoleGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BRoleGrpDbm.getInstance().columnDictId());
        return cri("B_ROLE_GRP_FK1", "BRoleGrpList", this, BRoleGrpDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * B_SCREEN by DICT_ID, named 'BScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BScreenDbm.getInstance().columnDictId());
        return cri("B_SCREEN_FK1", "BScreenList", this, BScreenDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterClassDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MCenterClassDtlDbm.getInstance().columnDictId());
        return cri("M_CENTER_CLASS_DTL_FK2", "MCenterClassDtlList", this, MCenterClassDtlDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CENTER_COL by DICT_ID, named 'MCenterColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MCenterColDbm.getInstance().columnDictId());
        return cri("M_CENTER_COL_FK2", "MCenterColList", this, MCenterColDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MCenterItemDbm.getInstance().columnDictId());
        return cri("M_CENTER_ITEM_FK2", "MCenterItemList", this, MCenterItemDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MCenterScreenDbm.getInstance().columnDictId());
        return cri("M_CENTER_SCREEN_FK3", "MCenterScreenList", this, MCenterScreenDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CLIENT_COL by DICT_ID, named 'MClientColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MClientColDbm.getInstance().columnDictId());
        return cri("M_CLIENT_COL_FK2", "MClientColList", this, MClientColDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MClientItemDbm.getInstance().columnDictId());
        return cri("M_CLIENT_ITEM_FK2", "MClientItemList", this, MClientItemDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MClientScreenDbm.getInstance().columnDictId());
        return cri("M_CLIENT_SCREEN_FK2", "MClientScreenList", this, MClientScreenDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProcessTypeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MProcessTypeDbm.getInstance().columnDictId());
        return cri("M_PROCESS_TYPE_FK2", "MProcessTypeList", this, MProcessTypeDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMShapeByShapeDictIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MShapeDbm.getInstance().columnShapeDictId());
        return cri("M_SHAPE_FK2", "MShapeByShapeDictIdList", this, MShapeDbm.getInstance(), mp, false, "BDictByShapeDictId");
    }
    /**
     * M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMShapeByShapeUnitDictIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MShapeDbm.getInstance().columnShapeUnitDictId());
        return cri("M_SHAPE_FK1", "MShapeByShapeUnitDictIdList", this, MShapeDbm.getInstance(), mp, false, "BDictByShapeUnitDictId");
    }
    /**
     * M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMStockTypeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), MStockTypeDbm.getInstance().columnDictId());
        return cri("M_STOCK_TYPE_FK1", "MStockTypeList", this, MStockTypeDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPReportLayoutItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), PReportLayoutItemDbm.getInstance().columnDictId());
        return cri("P_REPORT_LAYOUT_ITEM_FK1", "PReportLayoutItemList", this, PReportLayoutItemDbm.getInstance(), mp, false, "BDict");
    }
    /**
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPSubrepLayoutItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), PSubrepLayoutItemDbm.getInstance().columnDictId());
        return cri("P_SUBREP_LAYOUT_ITEM_FK1", "PSubrepLayoutItemList", this, PSubrepLayoutItemDbm.getInstance(), mp, false, "BDict");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BDict"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BDictCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BDictBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BDict> getEntityType() { return BDict.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BDict newEntity() { return new BDict(); }
    public BDict newMyEntity() { return new BDict(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BDict)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BDict)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
