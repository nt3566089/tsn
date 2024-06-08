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
 * The DB meta of W_STOCK_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WStockInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WStockInputDbm _instance = new WStockInputDbm();
    private WStockInputDbm() {}
    public static WStockInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WStockInput)et).getStockInputId(), (et, vl) -> ((WStockInput)et).setStockInputId(ctl(vl)), "stockInputId");
        setupEpg(_epgMap, et -> ((WStockInput)et).getClientCd(), (et, vl) -> ((WStockInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getCenterCd(), (et, vl) -> ((WStockInput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getWarehouseCd(), (et, vl) -> ((WStockInput)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getProductCd(), (et, vl) -> ((WStockInput)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getStockTypeCd(), (et, vl) -> ((WStockInput)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getLocationCd(), (et, vl) -> ((WStockInput)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getDepositCd(), (et, vl) -> ((WStockInput)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getProcessTypeCd(), (et, vl) -> ((WStockInput)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getLotCd(), (et, vl) -> ((WStockInput)et).setLotCd((String)vl), "lotCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getStoreLabelNo(), (et, vl) -> ((WStockInput)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((WStockInput)et).getSupplierCd(), (et, vl) -> ((WStockInput)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((WStockInput)et).getLimitDt(), (et, vl) -> ((WStockInput)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((WStockInput)et).getInstNum(), (et, vl) -> ((WStockInput)et).setInstNum((String)vl), "instNum");
        setupEpg(_epgMap, et -> ((WStockInput)et).getStockInputComment(), (et, vl) -> ((WStockInput)et).setStockInputComment((String)vl), "stockInputComment");
        setupEpg(_epgMap, et -> ((WStockInput)et).getLineNo(), (et, vl) -> ((WStockInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WStockInput)et).getWorkFlg(), (et, vl) -> ((WStockInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WStockInput)et).getErrorFlg(), (et, vl) -> ((WStockInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WStockInput)et).getErrorMsg(), (et, vl) -> ((WStockInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WStockInput)et).getDelFlg(), (et, vl) -> ((WStockInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WStockInput)et).getVersionNo(), (et, vl) -> ((WStockInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WStockInput)et).getControlNo(), (et, vl) -> ((WStockInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WStockInput)et).getAddDt(), (et, vl) -> ((WStockInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WStockInput)et).getAddUser(), (et, vl) -> ((WStockInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WStockInput)et).getAddProcess(), (et, vl) -> ((WStockInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WStockInput)et).getUpdDt(), (et, vl) -> ((WStockInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WStockInput)et).getUpdUser(), (et, vl) -> ((WStockInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WStockInput)et).getUpdProcess(), (et, vl) -> ((WStockInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_STOCK_INPUT";
    protected final String _tableDispName = "W_STOCK_INPUT";
    protected final String _tablePropertyName = "WStockInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_STOCK_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockInputId = cci("STOCK_INPUT_ID", "STOCK_INPUT_ID", null, null, Long.class, "stockInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotCd = cci("LOT_CD", "LOT_CD", null, null, String.class, "lotCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, String.class, "instNum", null, false, false, false, "varchar", 255, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockInputComment = cci("STOCK_INPUT_COMMENT", "STOCK_INPUT_COMMENT", null, null, String.class, "stockInputComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * STOCK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockInputId() { return _columnStockInputId; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeCd() { return _columnProcessTypeCd; }
    /**
     * LOT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotCd() { return _columnLotCd; }
    /**
     * STORE_LABEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * SUPPLIER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * LIMIT_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * INST_NUM: {varchar(255), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * STOCK_INPUT_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockInputComment() { return _columnStockInputComment; }
    /**
     * LINE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1), default=[(0)]}
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
        ls.add(columnStockInputId());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnWarehouseCd());
        ls.add(columnProductCd());
        ls.add(columnStockTypeCd());
        ls.add(columnLocationCd());
        ls.add(columnDepositCd());
        ls.add(columnProcessTypeCd());
        ls.add(columnLotCd());
        ls.add(columnStoreLabelNo());
        ls.add(columnSupplierCd());
        ls.add(columnLimitDt());
        ls.add(columnInstNum());
        ls.add(columnStockInputComment());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WStockInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WStockInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WStockInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WStockInput> getEntityType() { return WStockInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WStockInput newEntity() { return new WStockInput(); }
    public WStockInput newMyEntity() { return new WStockInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WStockInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WStockInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
