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
 * The DB meta of T_TRMANUFACTUREDATEDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrmanufacturedatedetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrmanufacturedatedetailDbm _instance = new TTrmanufacturedatedetailDbm();
    private TTrmanufacturedatedetailDbm() {}
    public static TTrmanufacturedatedetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getTrmanufacturedatedetailId(), (et, vl) -> ((TTrmanufacturedatedetail)et).setTrmanufacturedatedetailId(ctl(vl)), "trmanufacturedatedetailId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getCenterCd(), (et, vl) -> ((TTrmanufacturedatedetail)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getOwnerCd(), (et, vl) -> ((TTrmanufacturedatedetail)et).setOwnerCd((String)vl), "ownerCd");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getInventoryKbn(), (et, vl) -> ((TTrmanufacturedatedetail)et).setInventoryKbn((String)vl), "inventoryKbn");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getLineBlock(), (et, vl) -> ((TTrmanufacturedatedetail)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getProductCd(), (et, vl) -> ((TTrmanufacturedatedetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getInventoryKey(), (et, vl) -> ((TTrmanufacturedatedetail)et).setInventoryKey((String)vl), "inventoryKey");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getInventoryBId(), (et, vl) -> ((TTrmanufacturedatedetail)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getInventoryDate(), (et, vl) -> ((TTrmanufacturedatedetail)et).setInventoryDate((String)vl), "inventoryDate");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getBfManufactureDate(), (et, vl) -> ((TTrmanufacturedatedetail)et).setBfManufactureDate((String)vl), "bfManufactureDate");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getAfManufactureDate(), (et, vl) -> ((TTrmanufacturedatedetail)et).setAfManufactureDate((String)vl), "afManufactureDate");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getDesignFlg(), (et, vl) -> ((TTrmanufacturedatedetail)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getCenterId(), (et, vl) -> ((TTrmanufacturedatedetail)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getClientId(), (et, vl) -> ((TTrmanufacturedatedetail)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getPrintedflg(), (et, vl) -> ((TTrmanufacturedatedetail)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getInsideOutsideKbn(), (et, vl) -> ((TTrmanufacturedatedetail)et).setInsideOutsideKbn((String)vl), "insideOutsideKbn");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getRmano(), (et, vl) -> ((TTrmanufacturedatedetail)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getDelFlg(), (et, vl) -> ((TTrmanufacturedatedetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getVersionNo(), (et, vl) -> ((TTrmanufacturedatedetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getControlNo(), (et, vl) -> ((TTrmanufacturedatedetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getAddDt(), (et, vl) -> ((TTrmanufacturedatedetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getAddUser(), (et, vl) -> ((TTrmanufacturedatedetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getAddProcess(), (et, vl) -> ((TTrmanufacturedatedetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getUpdDt(), (et, vl) -> ((TTrmanufacturedatedetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getUpdUser(), (et, vl) -> ((TTrmanufacturedatedetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatedetail)et).getUpdProcess(), (et, vl) -> ((TTrmanufacturedatedetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrmanufacturedatedetail)et).getMCenter(), (et, vl) -> ((TTrmanufacturedatedetail)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrmanufacturedatedetail)et).getMClient(), (et, vl) -> ((TTrmanufacturedatedetail)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRMANUFACTUREDATEDETAIL";
    protected final String _tableDispName = "T_TRMANUFACTUREDATEDETAIL";
    protected final String _tablePropertyName = "TTrmanufacturedatedetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRMANUFACTUREDATEDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrmanufacturedatedetailId = cci("TRMANUFACTUREDATEDETAIL_ID", "TRMANUFACTUREDATEDETAIL_ID", null, null, Long.class, "trmanufacturedatedetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerCd = cci("OWNER_CD", "OWNER_CD", null, null, String.class, "ownerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKbn = cci("INVENTORY_KBN", "INVENTORY_KBN", null, null, String.class, "inventoryKbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKey = cci("INVENTORY_KEY", "INVENTORY_KEY", null, null, String.class, "inventoryKey", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDate = cci("INVENTORY_DATE", "INVENTORY_DATE", null, null, String.class, "inventoryDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBfManufactureDate = cci("BF_MANUFACTURE_DATE", "BF_MANUFACTURE_DATE", null, null, String.class, "bfManufactureDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAfManufactureDate = cci("AF_MANUFACTURE_DATE", "AF_MANUFACTURE_DATE", null, null, String.class, "afManufactureDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsideOutsideKbn = cci("INSIDE_OUTSIDE_KBN", "INSIDE_OUTSIDE_KBN", null, null, String.class, "insideOutsideKbn", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrmanufacturedatedetailId() { return _columnTrmanufacturedatedetailId; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * OWNER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerCd() { return _columnOwnerCd; }
    /**
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKbn() { return _columnInventoryKbn; }
    /**
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKey() { return _columnInventoryKey; }
    /**
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDate() { return _columnInventoryDate; }
    /**
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBfManufactureDate() { return _columnBfManufactureDate; }
    /**
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAfManufactureDate() { return _columnAfManufactureDate; }
    /**
     * DESIGN_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PRINTEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsideOutsideKbn() { return _columnInsideOutsideKbn; }
    /**
     * RMANO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
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
        ls.add(columnTrmanufacturedatedetailId());
        ls.add(columnCenterCd());
        ls.add(columnOwnerCd());
        ls.add(columnInventoryKbn());
        ls.add(columnLineBlock());
        ls.add(columnProductCd());
        ls.add(columnInventoryKey());
        ls.add(columnInventoryBId());
        ls.add(columnInventoryDate());
        ls.add(columnBfManufactureDate());
        ls.add(columnAfManufactureDate());
        ls.add(columnDesignFlg());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnPrintedflg());
        ls.add(columnInsideOutsideKbn());
        ls.add(columnRmano());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrmanufacturedatedetailId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRMANUFACTUREDATEDETAIL_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrmanufacturedatedetailList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRMANUFACTUREDATEDETAIL_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrmanufacturedatedetailList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrmanufacturedatedetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrmanufacturedatedetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrmanufacturedatedetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrmanufacturedatedetail> getEntityType() { return TTrmanufacturedatedetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrmanufacturedatedetail newEntity() { return new TTrmanufacturedatedetail(); }
    public TTrmanufacturedatedetail newMyEntity() { return new TTrmanufacturedatedetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrmanufacturedatedetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrmanufacturedatedetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
