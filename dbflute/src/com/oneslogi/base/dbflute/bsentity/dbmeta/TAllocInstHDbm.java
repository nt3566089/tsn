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
 * The DB meta of T_ALLOC_INST_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TAllocInstHDbm _instance = new TAllocInstHDbm();
    private TAllocInstHDbm() {}
    public static TAllocInstHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getAllocInstHId(), (et, vl) -> ((TAllocInstH)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getClientId(), (et, vl) -> ((TAllocInstH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getCenterId(), (et, vl) -> ((TAllocInstH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getProcessTypeId(), (et, vl) -> ((TAllocInstH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getShippingDt(), (et, vl) -> ((TAllocInstH)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getWorkDt(), (et, vl) -> ((TAllocInstH)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivPlanDt(), (et, vl) -> ((TAllocInstH)et).setDelivPlanDt((String)vl), "delivPlanDt");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivDt(), (et, vl) -> ((TAllocInstH)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivTz(), (et, vl) -> ((TAllocInstH)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getSupplyCustomerId(), (et, vl) -> ((TAllocInstH)et).setSupplyCustomerId(ctl(vl)), "supplyCustomerId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getSupplyCustomerCd(), (et, vl) -> ((TAllocInstH)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getSupplyCustomerNm(), (et, vl) -> ((TAllocInstH)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivCustomerId(), (et, vl) -> ((TAllocInstH)et).setDelivCustomerId(ctl(vl)), "delivCustomerId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivCustomerCd(), (et, vl) -> ((TAllocInstH)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivZipCd(), (et, vl) -> ((TAllocInstH)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivAddress1(), (et, vl) -> ((TAllocInstH)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivAddress2(), (et, vl) -> ((TAllocInstH)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivAddress3(), (et, vl) -> ((TAllocInstH)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivAddressSupply(), (et, vl) -> ((TAllocInstH)et).setDelivAddressSupply((String)vl), "delivAddressSupply");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivCustomerNm(), (et, vl) -> ((TAllocInstH)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelivTelNo(), (et, vl) -> ((TAllocInstH)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDeliveryCourseId(), (et, vl) -> ((TAllocInstH)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getDelFlg(), (et, vl) -> ((TAllocInstH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getVersionNo(), (et, vl) -> ((TAllocInstH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getControlNo(), (et, vl) -> ((TAllocInstH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getAddDt(), (et, vl) -> ((TAllocInstH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getAddUser(), (et, vl) -> ((TAllocInstH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getAddProcess(), (et, vl) -> ((TAllocInstH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getUpdDt(), (et, vl) -> ((TAllocInstH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getUpdUser(), (et, vl) -> ((TAllocInstH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TAllocInstH)et).getUpdProcess(), (et, vl) -> ((TAllocInstH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMCenter(), (et, vl) -> ((TAllocInstH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMClient(), (et, vl) -> ((TAllocInstH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMDeliveryCourse(), (et, vl) -> ((TAllocInstH)et).setMDeliveryCourse((MDeliveryCourse)vl), "MDeliveryCourse");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMCustomerByDelivCustomerId(), (et, vl) -> ((TAllocInstH)et).setMCustomerByDelivCustomerId((MCustomer)vl), "MCustomerByDelivCustomerId");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMProcessType(), (et, vl) -> ((TAllocInstH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMCustomerBySupplyCustomerId(), (et, vl) -> ((TAllocInstH)et).setMCustomerBySupplyCustomerId((MCustomer)vl), "MCustomerBySupplyCustomerId");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getTPickingH(), (et, vl) -> ((TAllocInstH)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMCenterCustomerByDelivCustomerId(), (et, vl) -> ((TAllocInstH)et).setMCenterCustomerByDelivCustomerId((MCenterCustomer)vl), "MCenterCustomerByDelivCustomerId");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getMCenterCustomerBySupplyCustomerId(), (et, vl) -> ((TAllocInstH)et).setMCenterCustomerBySupplyCustomerId((MCenterCustomer)vl), "MCenterCustomerBySupplyCustomerId");
        setupEfpg(_efpgMap, et -> ((TAllocInstH)et).getBClassDtlByDelivTz(), (et, vl) -> ((TAllocInstH)et).setBClassDtlByDelivTz((BClassDtl)vl), "BClassDtlByDelivTz");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_ALLOC_INST_H";
    protected final String _tableDispName = "T_ALLOC_INST_H";
    protected final String _tablePropertyName = "TAllocInstH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_ALLOC_INST_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TPickingH", "TAllocInstBList,TPackingHList,TPickingHList,TShippingInstHList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter,MCenterCustomerByDelivCustomerId,MCenterCustomerBySupplyCustomerId", null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivPlanDt = cci("DELIV_PLAN_DT", "DELIV_PLAN_DT", null, null, String.class, "delivPlanDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByDelivTz", null, CDef.DefMeta.DelivTz, false);
    protected final ColumnInfo _columnSupplyCustomerId = cci("SUPPLY_CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", null, null, Long.class, "supplyCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerBySupplyCustomerId,MCenterCustomerBySupplyCustomerId", null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerId = cci("DELIV_CUSTOMER_ID", "DELIV_CUSTOMER_ID", null, null, Long.class, "delivCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByDelivCustomerId,MCenterCustomerByDelivCustomerId", null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddressSupply = cci("DELIV_ADDRESS_SUPPLY", "DELIV_ADDRESS_SUPPLY", null, null, String.class, "delivAddressSupply", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MDeliveryCourse,MCenterCustomerByDelivCustomerId,MCenterCustomerBySupplyCustomerId", null, null, false);
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
     * ALLOC_INST_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
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
     * SHIPPING_DT: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * WORK_DT: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * DELIV_PLAN_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivPlanDt() { return _columnDelivPlanDt; }
    /**
     * DELIV_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * SUPPLY_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerId() { return _columnSupplyCustomerId; }
    /**
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerId() { return _columnDelivCustomerId; }
    /**
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerCd() { return _columnDelivCustomerCd; }
    /**
     * DELIV_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * DELIV_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress1() { return _columnDelivAddress1; }
    /**
     * DELIV_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress2() { return _columnDelivAddress2; }
    /**
     * DELIV_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress3() { return _columnDelivAddress3; }
    /**
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddressSupply() { return _columnDelivAddressSupply; }
    /**
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * DELIV_TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
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
        ls.add(columnAllocInstHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProcessTypeId());
        ls.add(columnShippingDt());
        ls.add(columnWorkDt());
        ls.add(columnDelivPlanDt());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnSupplyCustomerId());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDelivCustomerId());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivZipCd());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivAddressSupply());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivTelNo());
        ls.add(columnDeliveryCourseId());
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
    protected UniqueInfo cpui() { return hpcpui(columnAllocInstHId()); }
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
        return cfi("T_ALLOC_INST_H_FK3", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TAllocInstHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_ALLOC_INST_H_FK5", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TAllocInstHList", false);
    }
    /**
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMDeliveryCourse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), MDeliveryCourseDbm.getInstance().columnDeliveryCourseId());
        return cfi("T_ALLOC_INST_H_FK2", "MDeliveryCourse", this, MDeliveryCourseDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TAllocInstHList", false);
    }
    /**
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByDelivCustomerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelivCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_ALLOC_INST_H_FK1", "MCustomerByDelivCustomerId", this, MCustomerDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TAllocInstHByDelivCustomerIdList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_ALLOC_INST_H_FK6", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TAllocInstHList", false);
    }
    /**
     * M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerBySupplyCustomerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplyCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_ALLOC_INST_H_FK4", "MCustomerBySupplyCustomerId", this, MCustomerDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TAllocInstHBySupplyCustomerIdList", false);
    }
    /**
     * T_PICKING_H by my ALLOC_INST_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TPickingHDbm.getInstance().columnAllocInstHId());
        return cfi("FK_T_ALLOC_INST_H_ALLOC_INST_H_ID", "TPickingH", this, TPickingHDbm.getInstance(), mp, 6, null, true, true, false, true, "(1 = 1)", null, false, null, false);
    }
    /**
     * M_CENTER_CUSTOMER by my CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerByDelivCustomerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterCustomerByDelivCustomerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCenterId(), MCenterCustomerDbm.getInstance().columnCenterId());
        mp.put(columnDelivCustomerId(), MCenterCustomerDbm.getInstance().columnCustomerId());
        mp.put(columnDeliveryCourseId(), MCenterCustomerDbm.getInstance().columnDeliveryCourseId());
        return cfi("FK_T_ALLOC_INST_H_TO_M_CENTER_CUSTOMER_BY_DELIV", "MCenterCustomerByDelivCustomerId", this, MCenterCustomerDbm.getInstance(), mp, 7, null, false, false, false, true, null, null, false, "TAllocInstHByDelivCustomerIdList", false);
    }
    /**
     * M_CENTER_CUSTOMER by my CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerBySupplyCustomerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterCustomerBySupplyCustomerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCenterId(), MCenterCustomerDbm.getInstance().columnCenterId());
        mp.put(columnSupplyCustomerId(), MCenterCustomerDbm.getInstance().columnCustomerId());
        mp.put(columnDeliveryCourseId(), MCenterCustomerDbm.getInstance().columnDeliveryCourseId());
        return cfi("FK_T_ALLOC_INST_H_TO_M_CENTER_CUSTOMER_BY_SUPPLY", "MCenterCustomerBySupplyCustomerId", this, MCenterCustomerDbm.getInstance(), mp, 8, null, false, false, false, true, null, null, false, "TAllocInstHBySupplyCustomerIdList", false);
    }
    /**
     * B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelivTz() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelivTz(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_ALLOC_INST_H_DELIV_TZ", "BClassDtlByDelivTz", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DELIV_TZ'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_ALLOC_INST_B by ALLOC_INST_H_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TAllocInstBDbm.getInstance().columnAllocInstHId());
        return cri("T_ALLOC_INST_B_FK1", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "TAllocInstH");
    }
    /**
     * T_PACKING_H by ALLOC_INST_H_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TPackingHDbm.getInstance().columnAllocInstHId());
        return cri("T_PACKING_H_FK1", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "TAllocInstH");
    }
    /**
     * T_PICKING_H by ALLOC_INST_H_ID, named 'TPickingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TPickingHDbm.getInstance().columnAllocInstHId());
        return cri("T_PICKING_H_FK2", "TPickingHList", this, TPickingHDbm.getInstance(), mp, false, "TAllocInstH");
    }
    /**
     * T_SHIPPING_INST_H by ALLOC_INST_H_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TShippingInstHDbm.getInstance().columnAllocInstHId());
        return cri("T_SHIPPING_INST_H_FK7", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "TAllocInstH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TAllocInstH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TAllocInstHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAllocInstH> getEntityType() { return TAllocInstH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TAllocInstH newEntity() { return new TAllocInstH(); }
    public TAllocInstH newMyEntity() { return new TAllocInstH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TAllocInstH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TAllocInstH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
