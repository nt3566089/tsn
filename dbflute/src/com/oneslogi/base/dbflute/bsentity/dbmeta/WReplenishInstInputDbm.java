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
 * The DB meta of W_REPLENISH_INST_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WReplenishInstInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WReplenishInstInputDbm _instance = new WReplenishInstInputDbm();
    private WReplenishInstInputDbm() {}
    public static WReplenishInstInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getReplenishInstInputId(), (et, vl) -> ((WReplenishInstInput)et).setReplenishInstInputId(ctl(vl)), "replenishInstInputId");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getReceiveCd(), (et, vl) -> ((WReplenishInstInput)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getCenterCd(), (et, vl) -> ((WReplenishInstInput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getClientCd(), (et, vl) -> ((WReplenishInstInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getFlexlnsNo(), (et, vl) -> ((WReplenishInstInput)et).setFlexlnsNo((String)vl), "flexlnsNo");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getSchDate(), (et, vl) -> ((WReplenishInstInput)et).setSchDate((String)vl), "schDate");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getSupplierCd(), (et, vl) -> ((WReplenishInstInput)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getRcvDate(), (et, vl) -> ((WReplenishInstInput)et).setRcvDate((String)vl), "rcvDate");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getShipCd(), (et, vl) -> ((WReplenishInstInput)et).setShipCd((String)vl), "shipCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getItemCd(), (et, vl) -> ((WReplenishInstInput)et).setItemCd((String)vl), "itemCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getManufactureDate(), (et, vl) -> ((WReplenishInstInput)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getDesignCd(), (et, vl) -> ((WReplenishInstInput)et).setDesignCd((String)vl), "designCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getQty(), (et, vl) -> ((WReplenishInstInput)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getFlexUpdUserCd(), (et, vl) -> ((WReplenishInstInput)et).setFlexUpdUserCd((String)vl), "flexUpdUserCd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getFlexibityno(), (et, vl) -> ((WReplenishInstInput)et).setFlexibityno(ctl(vl)), "flexibityno");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getTransportcd(), (et, vl) -> ((WReplenishInstInput)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getLineNo(), (et, vl) -> ((WReplenishInstInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getWorkFlg(), (et, vl) -> ((WReplenishInstInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getErrorFlg(), (et, vl) -> ((WReplenishInstInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getErrorMsg(), (et, vl) -> ((WReplenishInstInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getDelFlg(), (et, vl) -> ((WReplenishInstInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getVersionNo(), (et, vl) -> ((WReplenishInstInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getControlNo(), (et, vl) -> ((WReplenishInstInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getAddDt(), (et, vl) -> ((WReplenishInstInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getAddUser(), (et, vl) -> ((WReplenishInstInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getAddProcess(), (et, vl) -> ((WReplenishInstInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getUpdDt(), (et, vl) -> ((WReplenishInstInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getUpdUser(), (et, vl) -> ((WReplenishInstInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WReplenishInstInput)et).getUpdProcess(), (et, vl) -> ((WReplenishInstInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_REPLENISH_INST_INPUT";
    protected final String _tableDispName = "W_REPLENISH_INST_INPUT";
    protected final String _tablePropertyName = "WReplenishInstInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_REPLENISH_INST_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReplenishInstInputId = cci("REPLENISH_INST_INPUT_ID", "REPLENISH_INST_INPUT_ID", null, null, Long.class, "replenishInstInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexlnsNo = cci("FLEXLNS_NO", "FLEXLNS_NO", null, null, String.class, "flexlnsNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchDate = cci("SCH_DATE", "SCH_DATE", null, null, String.class, "schDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvDate = cci("RCV_DATE", "RCV_DATE", null, null, String.class, "rcvDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCd = cci("SHIP_CD", "SHIP_CD", null, null, String.class, "shipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCd = cci("ITEM_CD", "ITEM_CD", null, null, String.class, "itemCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCd = cci("DESIGN_CD", "DESIGN_CD", null, null, String.class, "designCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexUpdUserCd = cci("FLEX_UPD_USER_CD", "FLEX_UPD_USER_CD", null, null, String.class, "flexUpdUserCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexibityno = cci("FLEXIBITYNO", "FLEXIBITYNO", null, null, Long.class, "flexibityno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishInstInputId() { return _columnReplenishInstInputId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * FLEXLNS_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexlnsNo() { return _columnFlexlnsNo; }
    /**
     * SCH_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchDate() { return _columnSchDate; }
    /**
     * SUPPLIER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * RCV_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvDate() { return _columnRcvDate; }
    /**
     * SHIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCd() { return _columnShipCd; }
    /**
     * ITEM_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCd() { return _columnItemCd; }
    /**
     * MANUFACTURE_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * DESIGN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCd() { return _columnDesignCd; }
    /**
     * QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * FLEX_UPD_USER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexUpdUserCd() { return _columnFlexUpdUserCd; }
    /**
     * FLEXIBITYNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibityno() { return _columnFlexibityno; }
    /**
     * TRANSPORTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * LINE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnReplenishInstInputId());
        ls.add(columnReceiveCd());
        ls.add(columnCenterCd());
        ls.add(columnClientCd());
        ls.add(columnFlexlnsNo());
        ls.add(columnSchDate());
        ls.add(columnSupplierCd());
        ls.add(columnRcvDate());
        ls.add(columnShipCd());
        ls.add(columnItemCd());
        ls.add(columnManufactureDate());
        ls.add(columnDesignCd());
        ls.add(columnQty());
        ls.add(columnFlexUpdUserCd());
        ls.add(columnFlexibityno());
        ls.add(columnTransportcd());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnReplenishInstInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WReplenishInstInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WReplenishInstInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WReplenishInstInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WReplenishInstInput> getEntityType() { return WReplenishInstInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WReplenishInstInput newEntity() { return new WReplenishInstInput(); }
    public WReplenishInstInput newMyEntity() { return new WReplenishInstInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WReplenishInstInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WReplenishInstInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
