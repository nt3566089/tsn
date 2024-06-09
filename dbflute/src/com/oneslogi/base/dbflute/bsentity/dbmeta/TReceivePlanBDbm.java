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
 * The DB meta of T_RECEIVE_PLAN_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReceivePlanBDbm _instance = new TReceivePlanBDbm();
    private TReceivePlanBDbm() {}
    public static TReceivePlanBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getReceivePlanBId(), (et, vl) -> ((TReceivePlanB)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getReceivePlanHId(), (et, vl) -> ((TReceivePlanB)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getLineNo(), (et, vl) -> ((TReceivePlanB)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getReceiveStatus(), (et, vl) -> ((TReceivePlanB)et).setReceiveStatus((String)vl), "receiveStatus");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanClientOrderNo(), (et, vl) -> ((TReceivePlanB)et).setPlanClientOrderNo((String)vl), "planClientOrderNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanWarehouseId(), (et, vl) -> ((TReceivePlanB)et).setPlanWarehouseId(ctl(vl)), "planWarehouseId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanWarehouseCd(), (et, vl) -> ((TReceivePlanB)et).setPlanWarehouseCd((String)vl), "planWarehouseCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getProductId(), (et, vl) -> ((TReceivePlanB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getProductCd(), (et, vl) -> ((TReceivePlanB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLot(), (et, vl) -> ((TReceivePlanB)et).setPlanLot((String)vl), "planLot");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLimitDt(), (et, vl) -> ((TReceivePlanB)et).setPlanLimitDt((String)vl), "planLimitDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLocationId(), (et, vl) -> ((TReceivePlanB)et).setPlanLocationId(ctl(vl)), "planLocationId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLocationCd(), (et, vl) -> ((TReceivePlanB)et).setPlanLocationCd((String)vl), "planLocationCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanStoreLabelNo(), (et, vl) -> ((TReceivePlanB)et).setPlanStoreLabelNo((String)vl), "planStoreLabelNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanNum(), (et, vl) -> ((TReceivePlanB)et).setPlanNum(ctb(vl)), "planNum");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getErrorFlg(), (et, vl) -> ((TReceivePlanB)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getErrorMessageCd(), (et, vl) -> ((TReceivePlanB)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getDelFlg(), (et, vl) -> ((TReceivePlanB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getVersionNo(), (et, vl) -> ((TReceivePlanB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getControlNo(), (et, vl) -> ((TReceivePlanB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getAddDt(), (et, vl) -> ((TReceivePlanB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getAddUser(), (et, vl) -> ((TReceivePlanB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getAddProcess(), (et, vl) -> ((TReceivePlanB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUpdDt(), (et, vl) -> ((TReceivePlanB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUpdUser(), (et, vl) -> ((TReceivePlanB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUpdProcess(), (et, vl) -> ((TReceivePlanB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getMLocation(), (et, vl) -> ((TReceivePlanB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getMWarehouse(), (et, vl) -> ((TReceivePlanB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getMProduct(), (et, vl) -> ((TReceivePlanB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getTReceivePlanH(), (et, vl) -> ((TReceivePlanB)et).setTReceivePlanH((TReceivePlanH)vl), "TReceivePlanH");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getBClassDtlByErrorFlg(), (et, vl) -> ((TReceivePlanB)et).setBClassDtlByErrorFlg((BClassDtl)vl), "BClassDtlByErrorFlg");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getBClassDtlByReceiveStatus(), (et, vl) -> ((TReceivePlanB)et).setBClassDtlByReceiveStatus((BClassDtl)vl), "BClassDtlByReceiveStatus");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getTReceivePlanSpareAsOne(), (et, vl) -> ((TReceivePlanB)et).setTReceivePlanSpareAsOne((TReceivePlanSpare)vl), "TReceivePlanSpareAsOne");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getTTrrcvdetailAsOne(), (et, vl) -> ((TReceivePlanB)et).setTTrrcvdetailAsOne((TTrrcvdetail)vl), "TTrrcvdetailAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_RECEIVE_PLAN_B";
    protected final String _tableDispName = "T_RECEIVE_PLAN_B";
    protected final String _tablePropertyName = "TReceivePlanB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_RECEIVE_PLAN_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TStoreRecordBList", null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TReceivePlanH", null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatus = cci("RECEIVE_STATUS", "RECEIVE_STATUS", null, null, String.class, "receiveStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByReceiveStatus", null, CDef.DefMeta.ReceiveStatus, false);
    protected final ColumnInfo _columnPlanClientOrderNo = cci("PLAN_CLIENT_ORDER_NO", "PLAN_CLIENT_ORDER_NO", null, null, String.class, "planClientOrderNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanWarehouseId = cci("PLAN_WAREHOUSE_ID", "PLAN_WAREHOUSE_ID", null, null, Long.class, "planWarehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnPlanWarehouseCd = cci("PLAN_WAREHOUSE_CD", "PLAN_WAREHOUSE_CD", null, null, String.class, "planWarehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLot = cci("PLAN_LOT", "PLAN_LOT", null, null, String.class, "planLot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLimitDt = cci("PLAN_LIMIT_DT", "PLAN_LIMIT_DT", null, null, String.class, "planLimitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLocationId = cci("PLAN_LOCATION_ID", "PLAN_LOCATION_ID", null, null, Long.class, "planLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnPlanLocationCd = cci("PLAN_LOCATION_CD", "PLAN_LOCATION_CD", null, null, String.class, "planLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanStoreLabelNo = cci("PLAN_STORE_LABEL_NO", "PLAN_STORE_LABEL_NO", null, null, String.class, "planStoreLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanNum = cci("PLAN_NUM", "PLAN_NUM", null, null, java.math.BigDecimal.class, "planNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByErrorFlg", null, CDef.DefMeta.ErrorFlg, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * RECEIVE_PLAN_H_ID: {IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatus() { return _columnReceiveStatus; }
    /**
     * PLAN_CLIENT_ORDER_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanClientOrderNo() { return _columnPlanClientOrderNo; }
    /**
     * PLAN_WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanWarehouseId() { return _columnPlanWarehouseId; }
    /**
     * PLAN_WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanWarehouseCd() { return _columnPlanWarehouseCd; }
    /**
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {IX, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PLAN_LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLot() { return _columnPlanLot; }
    /**
     * PLAN_LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLimitDt() { return _columnPlanLimitDt; }
    /**
     * PLAN_LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLocationId() { return _columnPlanLocationId; }
    /**
     * PLAN_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLocationCd() { return _columnPlanLocationCd; }
    /**
     * PLAN_STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanStoreLabelNo() { return _columnPlanStoreLabelNo; }
    /**
     * PLAN_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanNum() { return _columnPlanNum; }
    /**
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
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
        ls.add(columnReceivePlanBId());
        ls.add(columnReceivePlanHId());
        ls.add(columnLineNo());
        ls.add(columnReceiveStatus());
        ls.add(columnPlanClientOrderNo());
        ls.add(columnPlanWarehouseId());
        ls.add(columnPlanWarehouseCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnPlanLot());
        ls.add(columnPlanLimitDt());
        ls.add(columnPlanLocationId());
        ls.add(columnPlanLocationCd());
        ls.add(columnPlanStoreLabelNo());
        ls.add(columnPlanNum());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanBId()); }
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
     * M_LOCATION by my PLAN_LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlanLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_RECEIVE_PLAN_B_FK1", "MLocation", this, MLocationDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * M_WAREHOUSE by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlanWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_RECEIVE_PLAN_B_FK2", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_RECEIVE_PLAN_B_FK4", "MProduct", this, MProductDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanHDbm.getInstance().columnReceivePlanHId());
        return cfi("T_RECEIVE_PLAN_B_FK3", "TReceivePlanH", this, TReceivePlanHDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_B_ERROR_FLG", "BClassDtlByErrorFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ERROR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReceiveStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceiveStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_B_RECEIVE_STATUS", "BClassDtlByReceiveStatus", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RECEIVE_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_RECEIVE_PLAN_SPARE by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTReceivePlanSpareAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceivePlanSpareDbm.getInstance().columnReceivePlanBId());
        return cfi("T_RECEIVE_PLAN_SPARE_FK1", "TReceivePlanSpareAsOne", this, TReceivePlanSpareDbm.getInstance(), mp, 6, null, true, false, true, false, null, null, false, "TReceivePlanB", false);
    }
    /**
     * T_TRRCVDETAIL by RECEIVE_PLAN_B_ID, named 'TTrrcvdetailAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTTrrcvdetailAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TTrrcvdetailDbm.getInstance().columnReceivePlanBId());
        return cfi("T_TRRCVDETAIL_FK1", "TTrrcvdetailAsOne", this, TTrrcvdetailDbm.getInstance(), mp, 7, null, true, false, true, false, null, null, false, "TReceivePlanB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_STORE_RECORD_B by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TStoreRecordBDbm.getInstance().columnReceivePlanBId());
        return cri("T_STORE_RECORD_B_FK1", "TStoreRecordBList", this, TStoreRecordBDbm.getInstance(), mp, false, "TReceivePlanB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TReceivePlanB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TReceivePlanBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReceivePlanB> getEntityType() { return TReceivePlanB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReceivePlanB newEntity() { return new TReceivePlanB(); }
    public TReceivePlanB newMyEntity() { return new TReceivePlanB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReceivePlanB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReceivePlanB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
