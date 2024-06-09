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
 * The DB meta of T_TRMANUFACTUREDATEHISTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrmanufacturedatehistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrmanufacturedatehistoryDbm _instance = new TTrmanufacturedatehistoryDbm();
    private TTrmanufacturedatehistoryDbm() {}
    public static TTrmanufacturedatehistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getTrmanufacturedatehistoryId(), (et, vl) -> ((TTrmanufacturedatehistory)et).setTrmanufacturedatehistoryId(ctl(vl)), "trmanufacturedatehistoryId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getCenterCd(), (et, vl) -> ((TTrmanufacturedatehistory)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getOwnerCd(), (et, vl) -> ((TTrmanufacturedatehistory)et).setOwnerCd((String)vl), "ownerCd");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getInventoryKbn(), (et, vl) -> ((TTrmanufacturedatehistory)et).setInventoryKbn((String)vl), "inventoryKbn");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getLineBlock(), (et, vl) -> ((TTrmanufacturedatehistory)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getProductCd(), (et, vl) -> ((TTrmanufacturedatehistory)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getInventoryKey(), (et, vl) -> ((TTrmanufacturedatehistory)et).setInventoryKey((String)vl), "inventoryKey");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getInventoryBId(), (et, vl) -> ((TTrmanufacturedatehistory)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getInventoryDate(), (et, vl) -> ((TTrmanufacturedatehistory)et).setInventoryDate((String)vl), "inventoryDate");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getBfManufactureDate(), (et, vl) -> ((TTrmanufacturedatehistory)et).setBfManufactureDate((String)vl), "bfManufactureDate");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getAfManufactureDate(), (et, vl) -> ((TTrmanufacturedatehistory)et).setAfManufactureDate((String)vl), "afManufactureDate");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getDesignFlg(), (et, vl) -> ((TTrmanufacturedatehistory)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getCenterId(), (et, vl) -> ((TTrmanufacturedatehistory)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getClientId(), (et, vl) -> ((TTrmanufacturedatehistory)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getDelFlg(), (et, vl) -> ((TTrmanufacturedatehistory)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getVersionNo(), (et, vl) -> ((TTrmanufacturedatehistory)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getControlNo(), (et, vl) -> ((TTrmanufacturedatehistory)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getAddDt(), (et, vl) -> ((TTrmanufacturedatehistory)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getAddUser(), (et, vl) -> ((TTrmanufacturedatehistory)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getAddProcess(), (et, vl) -> ((TTrmanufacturedatehistory)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getUpdDt(), (et, vl) -> ((TTrmanufacturedatehistory)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getUpdUser(), (et, vl) -> ((TTrmanufacturedatehistory)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrmanufacturedatehistory)et).getUpdProcess(), (et, vl) -> ((TTrmanufacturedatehistory)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrmanufacturedatehistory)et).getMCenter(), (et, vl) -> ((TTrmanufacturedatehistory)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrmanufacturedatehistory)et).getMClient(), (et, vl) -> ((TTrmanufacturedatehistory)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRMANUFACTUREDATEHISTORY";
    protected final String _tableDispName = "T_TRMANUFACTUREDATEHISTORY";
    protected final String _tablePropertyName = "TTrmanufacturedatehistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRMANUFACTUREDATEHISTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrmanufacturedatehistoryId = cci("TRMANUFACTUREDATEHISTORY_ID", "TRMANUFACTUREDATEHISTORY_ID", null, null, Long.class, "trmanufacturedatehistoryId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRMANUFACTUREDATEHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrmanufacturedatehistoryId() { return _columnTrmanufacturedatehistoryId; }
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * INVENTORY_KEY: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKey() { return _columnInventoryKey; }
    /**
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * INVENTORY_DATE: {IX, NotNull, varchar(8)}
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
        ls.add(columnTrmanufacturedatehistoryId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrmanufacturedatehistoryId()); }
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
        return cfi("T_TRMANUFACTUREDATEHISTORY_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrmanufacturedatehistoryList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRMANUFACTUREDATEHISTORY_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrmanufacturedatehistoryList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrmanufacturedatehistory"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrmanufacturedatehistoryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrmanufacturedatehistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrmanufacturedatehistory> getEntityType() { return TTrmanufacturedatehistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrmanufacturedatehistory newEntity() { return new TTrmanufacturedatehistory(); }
    public TTrmanufacturedatehistory newMyEntity() { return new TTrmanufacturedatehistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrmanufacturedatehistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrmanufacturedatehistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
