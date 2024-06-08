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
 * The DB meta of T_STORE_RECORD_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStoreRecordHDbm _instance = new TStoreRecordHDbm();
    private TStoreRecordHDbm() {}
    public static TStoreRecordHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getStoreRecordHId(), (et, vl) -> ((TStoreRecordH)et).setStoreRecordHId(ctl(vl)), "storeRecordHId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getReceivePlanHId(), (et, vl) -> ((TStoreRecordH)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getClientId(), (et, vl) -> ((TStoreRecordH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getCenterId(), (et, vl) -> ((TStoreRecordH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getProcessTypeId(), (et, vl) -> ((TStoreRecordH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getStockTypeId(), (et, vl) -> ((TStoreRecordH)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getClientReceiveNo(), (et, vl) -> ((TStoreRecordH)et).setClientReceiveNo((String)vl), "clientReceiveNo");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getSupplierId(), (et, vl) -> ((TStoreRecordH)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getDepositId(), (et, vl) -> ((TStoreRecordH)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getStoreRecordHComment(), (et, vl) -> ((TStoreRecordH)et).setStoreRecordHComment((String)vl), "storeRecordHComment");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getDelFlg(), (et, vl) -> ((TStoreRecordH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getVersionNo(), (et, vl) -> ((TStoreRecordH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getControlNo(), (et, vl) -> ((TStoreRecordH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getAddDt(), (et, vl) -> ((TStoreRecordH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getAddUser(), (et, vl) -> ((TStoreRecordH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getAddProcess(), (et, vl) -> ((TStoreRecordH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getUpdDt(), (et, vl) -> ((TStoreRecordH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getUpdUser(), (et, vl) -> ((TStoreRecordH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStoreRecordH)et).getUpdProcess(), (et, vl) -> ((TStoreRecordH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getMCustomerByDepositId(), (et, vl) -> ((TStoreRecordH)et).setMCustomerByDepositId((MCustomer)vl), "MCustomerByDepositId");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getTReceivePlanH(), (et, vl) -> ((TStoreRecordH)et).setTReceivePlanH((TReceivePlanH)vl), "TReceivePlanH");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getMCenter(), (et, vl) -> ((TStoreRecordH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getMCustomerBySupplierId(), (et, vl) -> ((TStoreRecordH)et).setMCustomerBySupplierId((MCustomer)vl), "MCustomerBySupplierId");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getMProcessType(), (et, vl) -> ((TStoreRecordH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getMStockType(), (et, vl) -> ((TStoreRecordH)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getMClient(), (et, vl) -> ((TStoreRecordH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TStoreRecordH)et).getTStoreRecordRAsOne(), (et, vl) -> ((TStoreRecordH)et).setTStoreRecordRAsOne((TStoreRecordR)vl), "TStoreRecordRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_STORE_RECORD_H";
    protected final String _tableDispName = "T_STORE_RECORD_H";
    protected final String _tablePropertyName = "TStoreRecordH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_STORE_RECORD_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreRecordHId = cci("STORE_RECORD_H_ID", "STORE_RECORD_H_ID", null, null, Long.class, "storeRecordHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TStoreRecordBList", null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TReceivePlanH", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnClientReceiveNo = cci("CLIENT_RECEIVE_NO", "CLIENT_RECEIVE_NO", null, null, String.class, "clientReceiveNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerBySupplierId", null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByDepositId", null, null, false);
    protected final ColumnInfo _columnStoreRecordHComment = cci("STORE_RECORD_H_COMMENT", "STORE_RECORD_H_COMMENT", null, null, String.class, "storeRecordHComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordHId() { return _columnStoreRecordHId; }
    /**
     * RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * CLIENT_RECEIVE_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientReceiveNo() { return _columnClientReceiveNo; }
    /**
     * SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * STORE_RECORD_H_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordHComment() { return _columnStoreRecordHComment; }
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
        ls.add(columnStoreRecordHId());
        ls.add(columnReceivePlanHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProcessTypeId());
        ls.add(columnStockTypeId());
        ls.add(columnClientReceiveNo());
        ls.add(columnSupplierId());
        ls.add(columnDepositId());
        ls.add(columnStoreRecordHComment());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreRecordHId()); }
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
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByDepositId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_STORE_RECORD_H_FK6", "MCustomerByDepositId", this, MCustomerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStoreRecordHByDepositIdList", false);
    }
    /**
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanHDbm.getInstance().columnReceivePlanHId());
        return cfi("T_STORE_RECORD_H_FK7", "TReceivePlanH", this, TReceivePlanHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TStoreRecordHList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_STORE_RECORD_H_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TStoreRecordHList", false);
    }
    /**
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerBySupplierId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_STORE_RECORD_H_FK5", "MCustomerBySupplierId", this, MCustomerDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TStoreRecordHBySupplierIdList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_STORE_RECORD_H_FK4", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TStoreRecordHList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_STORE_RECORD_H_FK2", "MStockType", this, MStockTypeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TStoreRecordHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_STORE_RECORD_H_FK3", "MClient", this, MClientDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TStoreRecordHList", false);
    }
    /**
     * T_STORE_RECORD_R by STORE_RECORD_H_ID, named 'TStoreRecordRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTStoreRecordRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordHId(), TStoreRecordRDbm.getInstance().columnStoreRecordHId());
        return cfi("T_STORE_RECORD_R_FK1", "TStoreRecordRAsOne", this, TStoreRecordRDbm.getInstance(), mp, 7, null, true, false, true, false, null, null, false, "TStoreRecordH", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_STORE_RECORD_B by STORE_RECORD_H_ID, named 'TStoreRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordHId(), TStoreRecordBDbm.getInstance().columnStoreRecordHId());
        return cri("T_STORE_RECORD_B_FK3", "TStoreRecordBList", this, TStoreRecordBDbm.getInstance(), mp, false, "TStoreRecordH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStoreRecordH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStoreRecordHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStoreRecordH> getEntityType() { return TStoreRecordH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStoreRecordH newEntity() { return new TStoreRecordH(); }
    public TStoreRecordH newMyEntity() { return new TStoreRecordH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStoreRecordH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStoreRecordH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
