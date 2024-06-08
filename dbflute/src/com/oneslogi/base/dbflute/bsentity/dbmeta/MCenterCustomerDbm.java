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
 * The DB meta of M_CENTER_CUSTOMER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterCustomerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterCustomerDbm _instance = new MCenterCustomerDbm();
    private MCenterCustomerDbm() {}
    public static MCenterCustomerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getCenterCustomerId(), (et, vl) -> ((MCenterCustomer)et).setCenterCustomerId(ctl(vl)), "centerCustomerId");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getCenterId(), (et, vl) -> ((MCenterCustomer)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getCustomerId(), (et, vl) -> ((MCenterCustomer)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getDeliveryCourseId(), (et, vl) -> ((MCenterCustomer)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getDeliveryOrder(), (et, vl) -> ((MCenterCustomer)et).setDeliveryOrder(ctl(vl)), "deliveryOrder");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getDeliveryReadTime(), (et, vl) -> ((MCenterCustomer)et).setDeliveryReadTime(ctl(vl)), "deliveryReadTime");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getDelFlg(), (et, vl) -> ((MCenterCustomer)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getVersionNo(), (et, vl) -> ((MCenterCustomer)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getControlNo(), (et, vl) -> ((MCenterCustomer)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getAddDt(), (et, vl) -> ((MCenterCustomer)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getAddUser(), (et, vl) -> ((MCenterCustomer)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getAddProcess(), (et, vl) -> ((MCenterCustomer)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getUpdDt(), (et, vl) -> ((MCenterCustomer)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getUpdUser(), (et, vl) -> ((MCenterCustomer)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenterCustomer)et).getUpdProcess(), (et, vl) -> ((MCenterCustomer)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenterCustomer)et).getMCenter(), (et, vl) -> ((MCenterCustomer)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCenterCustomer)et).getMCustomer(), (et, vl) -> ((MCenterCustomer)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MCenterCustomer)et).getMDeliveryCourse(), (et, vl) -> ((MCenterCustomer)et).setMDeliveryCourse((MDeliveryCourse)vl), "MDeliveryCourse");
        setupEfpg(_efpgMap, et -> ((MCenterCustomer)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCenterCustomer)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CENTER_CUSTOMER";
    protected final String _tableDispName = "M_CENTER_CUSTOMER";
    protected final String _tablePropertyName = "MCenterCustomer";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CENTER_CUSTOMER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterCustomerId = cci("CENTER_CUSTOMER_ID", "CENTER_CUSTOMER_ID", null, null, Long.class, "centerCustomerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", "TAllocInstHByDelivCustomerIdList,TAllocInstHBySupplyCustomerIdList", null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCustomer", "TAllocInstHByDelivCustomerIdList,TAllocInstHBySupplyCustomerIdList", null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MDeliveryCourse", "TAllocInstHByDelivCustomerIdList,TAllocInstHBySupplyCustomerIdList", null, false);
    protected final ColumnInfo _columnDeliveryOrder = cci("DELIVERY_ORDER", "DELIVERY_ORDER", null, null, Long.class, "deliveryOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryReadTime = cci("DELIVERY_READ_TIME", "DELIVERY_READ_TIME", null, null, Long.class, "deliveryReadTime", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCustomerId() { return _columnCenterCustomerId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
    /**
     * DELIVERY_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryOrder() { return _columnDeliveryOrder; }
    /**
     * DELIVERY_READ_TIME: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryReadTime() { return _columnDeliveryReadTime; }
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
        ls.add(columnCenterCustomerId());
        ls.add(columnCenterId());
        ls.add(columnCustomerId());
        ls.add(columnDeliveryCourseId());
        ls.add(columnDeliveryOrder());
        ls.add(columnDeliveryReadTime());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterCustomerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnCustomerId());
        ls.add(columnDeliveryCourseId());
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
        return cfi("M_CENTER_CUSTOMER_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCenterCustomerList", false);
    }
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_CENTER_CUSTOMER_FK3", "MCustomer", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCenterCustomerList", false);
    }
    /**
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMDeliveryCourse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), MDeliveryCourseDbm.getInstance().columnDeliveryCourseId());
        return cfi("M_CENTER_CUSTOMER_FK1", "MDeliveryCourse", this, MDeliveryCourseDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MCenterCustomerList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CENTER_CUSTOMER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHByDelivCustomerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCenterId(), TAllocInstHDbm.getInstance().columnCenterId());
        mp.put(columnCustomerId(), TAllocInstHDbm.getInstance().columnDelivCustomerId());
        mp.put(columnDeliveryCourseId(), TAllocInstHDbm.getInstance().columnDeliveryCourseId());
        return cri("FK_T_ALLOC_INST_H_TO_M_CENTER_CUSTOMER_BY_DELIV", "TAllocInstHByDelivCustomerIdList", this, TAllocInstHDbm.getInstance(), mp, false, "MCenterCustomerByDelivCustomerId");
    }
    /**
     * T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHBySupplyCustomerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCenterId(), TAllocInstHDbm.getInstance().columnCenterId());
        mp.put(columnCustomerId(), TAllocInstHDbm.getInstance().columnSupplyCustomerId());
        mp.put(columnDeliveryCourseId(), TAllocInstHDbm.getInstance().columnDeliveryCourseId());
        return cri("FK_T_ALLOC_INST_H_TO_M_CENTER_CUSTOMER_BY_SUPPLY", "TAllocInstHBySupplyCustomerIdList", this, TAllocInstHDbm.getInstance(), mp, false, "MCenterCustomerBySupplyCustomerId");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenterCustomer"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterCustomerCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenterCustomer> getEntityType() { return MCenterCustomer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenterCustomer newEntity() { return new MCenterCustomer(); }
    public MCenterCustomer newMyEntity() { return new MCenterCustomer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenterCustomer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenterCustomer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
