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
 * The DB meta of H_PACKING_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HPackingBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HPackingBDbm _instance = new HPackingBDbm();
    private HPackingBDbm() {}
    public static HPackingBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HPackingB)et).getPackingBId(), (et, vl) -> ((HPackingB)et).setPackingBId(ctl(vl)), "packingBId");
        setupEpg(_epgMap, et -> ((HPackingB)et).getPackingHId(), (et, vl) -> ((HPackingB)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((HPackingB)et).getShippingInstBId(), (et, vl) -> ((HPackingB)et).setShippingInstBId(ctl(vl)), "shippingInstBId");
        setupEpg(_epgMap, et -> ((HPackingB)et).getStockId(), (et, vl) -> ((HPackingB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((HPackingB)et).getPackingNum(), (et, vl) -> ((HPackingB)et).setPackingNum(ctb(vl)), "packingNum");
        setupEpg(_epgMap, et -> ((HPackingB)et).getDelFlg(), (et, vl) -> ((HPackingB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HPackingB)et).getVersionNo(), (et, vl) -> ((HPackingB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HPackingB)et).getControlNo(), (et, vl) -> ((HPackingB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HPackingB)et).getAddDt(), (et, vl) -> ((HPackingB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HPackingB)et).getAddUser(), (et, vl) -> ((HPackingB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HPackingB)et).getAddProcess(), (et, vl) -> ((HPackingB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HPackingB)et).getUpdDt(), (et, vl) -> ((HPackingB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HPackingB)et).getUpdUser(), (et, vl) -> ((HPackingB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HPackingB)et).getUpdProcess(), (et, vl) -> ((HPackingB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HPackingB)et).getHPackingH(), (et, vl) -> ((HPackingB)et).setHPackingH((HPackingH)vl), "HPackingH");
        setupEfpg(_efpgMap, et -> ((HPackingB)et).getHShippingB(), (et, vl) -> ((HPackingB)et).setHShippingB((HShippingB)vl), "HShippingB");
        setupEfpg(_efpgMap, et -> ((HPackingB)et).getHStock(), (et, vl) -> ((HPackingB)et).setHStock((HStock)vl), "HStock");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_PACKING_B";
    protected final String _tableDispName = "H_PACKING_B";
    protected final String _tablePropertyName = "HPackingB";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_PACKING_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingBId = cci("PACKING_B_ID", "PACKING_B_ID", null, null, Long.class, "packingBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HPackingH", null, null, false);
    protected final ColumnInfo _columnShippingInstBId = cci("SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", null, null, Long.class, "shippingInstBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "HShippingB", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HStock", null, null, false);
    protected final ColumnInfo _columnPackingNum = cci("PACKING_NUM", "PACKING_NUM", null, null, java.math.BigDecimal.class, "packingNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingBId() { return _columnPackingBId; }
    /**
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to H_PACKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * SHIPPING_INST_B_ID: {IX, bigint(19), FK to H_SHIPPING_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBId() { return _columnShippingInstBId; }
    /**
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * PACKING_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum() { return _columnPackingNum; }
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
        ls.add(columnPackingBId());
        ls.add(columnPackingHId());
        ls.add(columnShippingInstBId());
        ls.add(columnStockId());
        ls.add(columnPackingNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnPackingBId()); }
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
     * H_PACKING_H by my PACKING_H_ID, named 'HPackingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHPackingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), HPackingHDbm.getInstance().columnPackingHId());
        return cfi("H_PACKING_B_FK3", "HPackingH", this, HPackingHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HPackingBList", false);
    }
    /**
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHShippingB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), HShippingBDbm.getInstance().columnShippingInstBId());
        return cfi("H_PACKING_B_FK2", "HShippingB", this, HShippingBDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "HPackingBList", false);
    }
    /**
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockDbm.getInstance().columnStockId());
        return cfi("H_PACKING_B_FK1", "HStock", this, HStockDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "HPackingBList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HPackingB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HPackingBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HPackingBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HPackingB> getEntityType() { return HPackingB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HPackingB newEntity() { return new HPackingB(); }
    public HPackingB newMyEntity() { return new HPackingB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HPackingB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HPackingB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
