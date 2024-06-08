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
 * The DB meta of M_WAREHOUSE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MWarehouseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MWarehouseDbm _instance = new MWarehouseDbm();
    private MWarehouseDbm() {}
    public static MWarehouseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MWarehouse)et).getWarehouseId(), (et, vl) -> ((MWarehouse)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getCenterId(), (et, vl) -> ((MWarehouse)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getWarehouseCd(), (et, vl) -> ((MWarehouse)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getWarehouseNm(), (et, vl) -> ((MWarehouse)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getWarehouseAbbr(), (et, vl) -> ((MWarehouse)et).setWarehouseAbbr((String)vl), "warehouseAbbr");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getForeignFlg(), (et, vl) -> ((MWarehouse)et).setForeignFlg((String)vl), "foreignFlg");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getDelFlg(), (et, vl) -> ((MWarehouse)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getVersionNo(), (et, vl) -> ((MWarehouse)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getControlNo(), (et, vl) -> ((MWarehouse)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getAddDt(), (et, vl) -> ((MWarehouse)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getAddUser(), (et, vl) -> ((MWarehouse)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getAddProcess(), (et, vl) -> ((MWarehouse)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getUpdDt(), (et, vl) -> ((MWarehouse)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getUpdUser(), (et, vl) -> ((MWarehouse)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MWarehouse)et).getUpdProcess(), (et, vl) -> ((MWarehouse)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MWarehouse)et).getMCenter(), (et, vl) -> ((MWarehouse)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MWarehouse)et).getBClassDtlByDelFlg(), (et, vl) -> ((MWarehouse)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MWarehouse)et).getBClassDtlByForeignFlg(), (et, vl) -> ((MWarehouse)et).setBClassDtlByForeignFlg((BClassDtl)vl), "BClassDtlByForeignFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_WAREHOUSE";
    protected final String _tableDispName = "M_WAREHOUSE";
    protected final String _tablePropertyName = "MWarehouse";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_WAREHOUSE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MWebHtInfoList,MZoneList,TAllocInstBList,TInventoryBList,TMoveInstBList,TReceivePlanBList,TShippingInstBList,TStockList,WHtInventoryInputProdList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseAbbr = cci("WAREHOUSE_ABBR", "WAREHOUSE_ABBR", null, null, String.class, "warehouseAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeignFlg = cci("FOREIGN_FLG", "FOREIGN_FLG", null, null, String.class, "foreignFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByForeignFlg", null, CDef.DefMeta.ForeignFlg, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * WAREHOUSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * WAREHOUSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * WAREHOUSE_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseAbbr() { return _columnWarehouseAbbr; }
    /**
     * FOREIGN_FLG: {char(1), FK to B_CLASS_DTL, classification=ForeignFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeignFlg() { return _columnForeignFlg; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnWarehouseId());
        ls.add(columnCenterId());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseNm());
        ls.add(columnWarehouseAbbr());
        ls.add(columnForeignFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnWarehouseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnWarehouseCd());
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_WAREHOUSE_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MWarehouseList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_WAREHOUSE_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FOREIGN_FLG, named 'BClassDtlByForeignFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByForeignFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnForeignFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_WAREHOUSE_FOREIGN_FLG", "BClassDtlByForeignFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'FOREIGN_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_WEB_HT_INFO by WAREHOUSE_ID, named 'MWebHtInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWebHtInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWebHtInfoDbm.getInstance().columnWarehouseId());
        return cri("M_WEB_HT_INFO_FK3", "MWebHtInfoList", this, MWebHtInfoDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * M_ZONE by WAREHOUSE_ID, named 'MZoneList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMZoneList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MZoneDbm.getInstance().columnWarehouseId());
        return cri("M_ZONE_FK1", "MZoneList", this, MZoneDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * T_ALLOC_INST_B by WAREHOUSE_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), TAllocInstBDbm.getInstance().columnWarehouseId());
        return cri("T_ALLOC_INST_B_FK9", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * T_INVENTORY_B by WAREHOUSE_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), TInventoryBDbm.getInstance().columnWarehouseId());
        return cri("T_INVENTORY_B_FK4", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * T_MOVE_INST_B by WAREHOUSE_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), TMoveInstBDbm.getInstance().columnWarehouseId());
        return cri("T_MOVE_INST_B_FK2", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * T_RECEIVE_PLAN_B by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), TReceivePlanBDbm.getInstance().columnPlanWarehouseId());
        return cri("T_RECEIVE_PLAN_B_FK2", "TReceivePlanBList", this, TReceivePlanBDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * T_SHIPPING_INST_B by WAREHOUSE_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), TShippingInstBDbm.getInstance().columnWarehouseId());
        return cri("T_SHIPPING_INST_B_FK6", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * T_STOCK by WAREHOUSE_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), TStockDbm.getInstance().columnWarehouseId());
        return cri("T_STOCK_FK4", "TStockList", this, TStockDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by WAREHOUSE_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), WHtInventoryInputProdDbm.getInstance().columnWarehouseId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK6", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * W_HT_RECEIVE_INSPECTION by WAREHOUSE_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), WHtReceiveInspectionDbm.getInstance().columnWarehouseId());
        return cri("W_HT_RECEIVE_INSPECTION_FK2", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), WHtReceiveNoPlanInspDbm.getInstance().columnWarehouseId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK3", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MWarehouse");
    }
    /**
     * W_HT_RECEIVE_STORE by WAREHOUSE_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), WHtReceiveStoreDbm.getInstance().columnWarehouseId());
        return cri("W_HT_RECEIVE_STORE_FK6", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MWarehouse");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MWarehouse"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MWarehouseCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MWarehouseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MWarehouse> getEntityType() { return MWarehouse.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MWarehouse newEntity() { return new MWarehouse(); }
    public MWarehouse newMyEntity() { return new MWarehouse(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MWarehouse)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MWarehouse)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
