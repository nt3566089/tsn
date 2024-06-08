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
 * The DB meta of E_SHIPPING_INOUT_PLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInoutPlanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShippingInoutPlanDbm _instance = new EShippingInoutPlanDbm();
    private EShippingInoutPlanDbm() {}
    public static EShippingInoutPlanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getShippingInoutPlanId(), (et, vl) -> ((EShippingInoutPlan)et).setShippingInoutPlanId(ctl(vl)), "shippingInoutPlanId");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getSendCd(), (et, vl) -> ((EShippingInoutPlan)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getSendLowCd(), (et, vl) -> ((EShippingInoutPlan)et).setSendLowCd(ctl(vl)), "sendLowCd");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getWorkFlg(), (et, vl) -> ((EShippingInoutPlan)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getCenterCd(), (et, vl) -> ((EShippingInoutPlan)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getSbwarehousecd(), (et, vl) -> ((EShippingInoutPlan)et).setSbwarehousecd((String)vl), "sbwarehousecd");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getSupplierrcvno(), (et, vl) -> ((EShippingInoutPlan)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getExamkbn(), (et, vl) -> ((EShippingInoutPlan)et).setExamkbn((String)vl), "examkbn");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getExamdate(), (et, vl) -> ((EShippingInoutPlan)et).setExamdate((String)vl), "examdate");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getExamend(), (et, vl) -> ((EShippingInoutPlan)et).setExamend((String)vl), "examend");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getProductCd(), (et, vl) -> ((EShippingInoutPlan)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getLot1(), (et, vl) -> ((EShippingInoutPlan)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getBefzaikoinv(), (et, vl) -> ((EShippingInoutPlan)et).setBefzaikoinv((String)vl), "befzaikoinv");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getBeflot4(), (et, vl) -> ((EShippingInoutPlan)et).setBeflot4((String)vl), "beflot4");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getBeflot3(), (et, vl) -> ((EShippingInoutPlan)et).setBeflot3((String)vl), "beflot3");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getAftzaikoinv(), (et, vl) -> ((EShippingInoutPlan)et).setAftzaikoinv((String)vl), "aftzaikoinv");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getAftlot4(), (et, vl) -> ((EShippingInoutPlan)et).setAftlot4((String)vl), "aftlot4");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getAftlot3(), (et, vl) -> ((EShippingInoutPlan)et).setAftlot3((String)vl), "aftlot3");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getQty(), (et, vl) -> ((EShippingInoutPlan)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getDelFlg(), (et, vl) -> ((EShippingInoutPlan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getVersionNo(), (et, vl) -> ((EShippingInoutPlan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getControlNo(), (et, vl) -> ((EShippingInoutPlan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getAddDt(), (et, vl) -> ((EShippingInoutPlan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getAddUser(), (et, vl) -> ((EShippingInoutPlan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getAddProcess(), (et, vl) -> ((EShippingInoutPlan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getUpdDt(), (et, vl) -> ((EShippingInoutPlan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getUpdUser(), (et, vl) -> ((EShippingInoutPlan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShippingInoutPlan)et).getUpdProcess(), (et, vl) -> ((EShippingInoutPlan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHIPPING_INOUT_PLAN";
    protected final String _tableDispName = "E_SHIPPING_INOUT_PLAN";
    protected final String _tablePropertyName = "EShippingInoutPlan";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHIPPING_INOUT_PLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInoutPlanId = cci("SHIPPING_INOUT_PLAN_ID", "SHIPPING_INOUT_PLAN_ID", null, null, Long.class, "shippingInoutPlanId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendLowCd = cci("SEND_LOW_CD", "SEND_LOW_CD", null, null, Long.class, "sendLowCd", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSbwarehousecd = cci("SBWAREHOUSECD", "SBWAREHOUSECD", null, null, String.class, "sbwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamkbn = cci("EXAMKBN", "EXAMKBN", null, null, String.class, "examkbn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamdate = cci("EXAMDATE", "EXAMDATE", null, null, String.class, "examdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamend = cci("EXAMEND", "EXAMEND", null, null, String.class, "examend", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBefzaikoinv = cci("BEFZAIKOINV", "BEFZAIKOINV", null, null, String.class, "befzaikoinv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBeflot4 = cci("BEFLOT4", "BEFLOT4", null, null, String.class, "beflot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBeflot3 = cci("BEFLOT3", "BEFLOT3", null, null, String.class, "beflot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAftzaikoinv = cci("AFTZAIKOINV", "AFTZAIKOINV", null, null, String.class, "aftzaikoinv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAftlot4 = cci("AFTLOT4", "AFTLOT4", null, null, String.class, "aftlot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAftlot3 = cci("AFTLOT3", "AFTLOT3", null, null, String.class, "aftlot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInoutPlanId() { return _columnShippingInoutPlanId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendLowCd() { return _columnSendLowCd; }
    /**
     * WORK_FLG: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * SBWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSbwarehousecd() { return _columnSbwarehousecd; }
    /**
     * SUPPLIERRCVNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * EXAMKBN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamkbn() { return _columnExamkbn; }
    /**
     * EXAMDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamdate() { return _columnExamdate; }
    /**
     * EXAMEND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamend() { return _columnExamend; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * BEFZAIKOINV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBefzaikoinv() { return _columnBefzaikoinv; }
    /**
     * BEFLOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeflot4() { return _columnBeflot4; }
    /**
     * BEFLOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeflot3() { return _columnBeflot3; }
    /**
     * AFTZAIKOINV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAftzaikoinv() { return _columnAftzaikoinv; }
    /**
     * AFTLOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAftlot4() { return _columnAftlot4; }
    /**
     * AFTLOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAftlot3() { return _columnAftlot3; }
    /**
     * QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
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
        ls.add(columnShippingInoutPlanId());
        ls.add(columnSendCd());
        ls.add(columnSendLowCd());
        ls.add(columnWorkFlg());
        ls.add(columnCenterCd());
        ls.add(columnSbwarehousecd());
        ls.add(columnSupplierrcvno());
        ls.add(columnExamkbn());
        ls.add(columnExamdate());
        ls.add(columnExamend());
        ls.add(columnProductCd());
        ls.add(columnLot1());
        ls.add(columnBefzaikoinv());
        ls.add(columnBeflot4());
        ls.add(columnBeflot3());
        ls.add(columnAftzaikoinv());
        ls.add(columnAftlot4());
        ls.add(columnAftlot3());
        ls.add(columnQty());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInoutPlanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShippingInoutPlan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShippingInoutPlanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShippingInoutPlanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShippingInoutPlan> getEntityType() { return EShippingInoutPlan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShippingInoutPlan newEntity() { return new EShippingInoutPlan(); }
    public EShippingInoutPlan newMyEntity() { return new EShippingInoutPlan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShippingInoutPlan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShippingInoutPlan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
