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
 * The DB meta of W_HT_SERIAL_RECEIVE_INSP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtSerialReceiveInspDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtSerialReceiveInspDbm _instance = new WHtSerialReceiveInspDbm();
    private WHtSerialReceiveInspDbm() {}
    public static WHtSerialReceiveInspDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getHtSerialReceiveInspId(), (et, vl) -> ((WHtSerialReceiveInsp)et).setHtSerialReceiveInspId(ctl(vl)), "htSerialReceiveInspId");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getMacAddress(), (et, vl) -> ((WHtSerialReceiveInsp)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getClientId(), (et, vl) -> ((WHtSerialReceiveInsp)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getCenterId(), (et, vl) -> ((WHtSerialReceiveInsp)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getReceiveSlipNo(), (et, vl) -> ((WHtSerialReceiveInsp)et).setReceiveSlipNo((String)vl), "receiveSlipNo");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getCustomerId(), (et, vl) -> ((WHtSerialReceiveInsp)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getJanCd(), (et, vl) -> ((WHtSerialReceiveInsp)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getProductCd(), (et, vl) -> ((WHtSerialReceiveInsp)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getProductNm(), (et, vl) -> ((WHtSerialReceiveInsp)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getSerialNo(), (et, vl) -> ((WHtSerialReceiveInsp)et).setSerialNo((String)vl), "serialNo");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getDelFlg(), (et, vl) -> ((WHtSerialReceiveInsp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getVersionNo(), (et, vl) -> ((WHtSerialReceiveInsp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getControlNo(), (et, vl) -> ((WHtSerialReceiveInsp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getAddDt(), (et, vl) -> ((WHtSerialReceiveInsp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getAddUser(), (et, vl) -> ((WHtSerialReceiveInsp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getAddProcess(), (et, vl) -> ((WHtSerialReceiveInsp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getUpdDt(), (et, vl) -> ((WHtSerialReceiveInsp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getUpdUser(), (et, vl) -> ((WHtSerialReceiveInsp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtSerialReceiveInsp)et).getUpdProcess(), (et, vl) -> ((WHtSerialReceiveInsp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtSerialReceiveInsp)et).getMClient(), (et, vl) -> ((WHtSerialReceiveInsp)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WHtSerialReceiveInsp)et).getMCustomer(), (et, vl) -> ((WHtSerialReceiveInsp)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((WHtSerialReceiveInsp)et).getMCenter(), (et, vl) -> ((WHtSerialReceiveInsp)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_HT_SERIAL_RECEIVE_INSP";
    protected final String _tableDispName = "W_HT_SERIAL_RECEIVE_INSP";
    protected final String _tablePropertyName = "WHtSerialReceiveInsp";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_HT_SERIAL_RECEIVE_INSP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtSerialReceiveInspId = cci("HT_SERIAL_RECEIVE_INSP_ID", "HT_SERIAL_RECEIVE_INSP_ID", null, null, Long.class, "htSerialReceiveInspId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnReceiveSlipNo = cci("RECEIVE_SLIP_NO", "RECEIVE_SLIP_NO", null, null, String.class, "receiveSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialNo = cci("SERIAL_NO", "SERIAL_NO", null, null, String.class, "serialNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * HT_SERIAL_RECEIVE_INSP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtSerialReceiveInspId() { return _columnHtSerialReceiveInspId; }
    /**
     * MAC_ADDRESS: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * RECEIVE_SLIP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveSlipNo() { return _columnReceiveSlipNo; }
    /**
     * CUSTOMER_ID: {bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * SERIAL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialNo() { return _columnSerialNo; }
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
        ls.add(columnHtSerialReceiveInspId());
        ls.add(columnMacAddress());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnReceiveSlipNo());
        ls.add(columnCustomerId());
        ls.add(columnJanCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnSerialNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtSerialReceiveInspId()); }
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_SERIAL_RECEIVE_INSP_FK3", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtSerialReceiveInspList", false);
    }
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("W_HT_SERIAL_RECEIVE_INSP_FK2", "MCustomer", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtSerialReceiveInspList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_HT_SERIAL_RECEIVE_INSP_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtSerialReceiveInspList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtSerialReceiveInspCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtSerialReceiveInspBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtSerialReceiveInsp> getEntityType() { return WHtSerialReceiveInsp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtSerialReceiveInsp newEntity() { return new WHtSerialReceiveInsp(); }
    public WHtSerialReceiveInsp newMyEntity() { return new WHtSerialReceiveInsp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtSerialReceiveInsp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtSerialReceiveInsp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
