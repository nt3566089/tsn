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
 * The DB meta of E_BONDED_WMS_RECEIVE_PLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EBondedWmsReceivePlanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EBondedWmsReceivePlanDbm _instance = new EBondedWmsReceivePlanDbm();
    private EBondedWmsReceivePlanDbm() {}
    public static EBondedWmsReceivePlanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBondedWmsReceivePlanId(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBondedWmsReceivePlanId(ctl(vl)), "bondedWmsReceivePlanId");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getReceiveCd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getReceiveRowId(), (et, vl) -> ((EBondedWmsReceivePlan)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getImportFlg(), (et, vl) -> ((EBondedWmsReceivePlan)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getErrorFlg(), (et, vl) -> ((EBondedWmsReceivePlan)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getErrorMessageCd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getNotes(), (et, vl) -> ((EBondedWmsReceivePlan)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getSbwarehousecd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setSbwarehousecd((String)vl), "sbwarehousecd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getSupplierrcvno(), (et, vl) -> ((EBondedWmsReceivePlan)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getRcvschdate(), (et, vl) -> ((EBondedWmsReceivePlan)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getCarrierno(), (et, vl) -> ((EBondedWmsReceivePlan)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getShiptocd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getOtherrefno1(), (et, vl) -> ((EBondedWmsReceivePlan)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getProductCd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getLot3(), (et, vl) -> ((EBondedWmsReceivePlan)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getLot4(), (et, vl) -> ((EBondedWmsReceivePlan)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getLot1(), (et, vl) -> ((EBondedWmsReceivePlan)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getExpectqty1(), (et, vl) -> ((EBondedWmsReceivePlan)et).setExpectqty1((String)vl), "expectqty1");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getFromfax(), (et, vl) -> ((EBondedWmsReceivePlan)et).setFromfax((String)vl), "fromfax");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatjmfym(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatjmfym((String)vl), "batjmfym");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getCarriersname(), (et, vl) -> ((EBondedWmsReceivePlan)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getCarrierwbno(), (et, vl) -> ((EBondedWmsReceivePlan)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getForeigncargoflg(), (et, vl) -> ((EBondedWmsReceivePlan)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBlNo(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBlNo((String)vl), "blNo");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getCarriername(), (et, vl) -> ((EBondedWmsReceivePlan)et).setCarriername((String)vl), "carriername");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getFromemail(), (et, vl) -> ((EBondedWmsReceivePlan)et).setFromemail((String)vl), "fromemail");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getArrivalportdate(), (et, vl) -> ((EBondedWmsReceivePlan)et).setArrivalportdate((String)vl), "arrivalportdate");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getShipname(), (et, vl) -> ((EBondedWmsReceivePlan)et).setShipname((String)vl), "shipname");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatdelino(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatdelino((String)vl), "batdelino");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatdelidetailno(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatdelidetailno((String)vl), "batdelidetailno");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatwarehousecd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatwarehousecd((String)vl), "batwarehousecd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatkeepwarehousecd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatkeepwarehousecd((String)vl), "batkeepwarehousecd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatpartnernorcv(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatpartnernorcv((String)vl), "batpartnernorcv");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatpartnernosnd(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatpartnernosnd((String)vl), "batpartnernosnd");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getBatdelidetailnum(), (et, vl) -> ((EBondedWmsReceivePlan)et).setBatdelidetailnum((String)vl), "batdelidetailnum");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getDelFlg(), (et, vl) -> ((EBondedWmsReceivePlan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getVersionNo(), (et, vl) -> ((EBondedWmsReceivePlan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getControlNo(), (et, vl) -> ((EBondedWmsReceivePlan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getAddDt(), (et, vl) -> ((EBondedWmsReceivePlan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getAddUser(), (et, vl) -> ((EBondedWmsReceivePlan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getAddProcess(), (et, vl) -> ((EBondedWmsReceivePlan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getUpdDt(), (et, vl) -> ((EBondedWmsReceivePlan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getUpdUser(), (et, vl) -> ((EBondedWmsReceivePlan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EBondedWmsReceivePlan)et).getUpdProcess(), (et, vl) -> ((EBondedWmsReceivePlan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_BONDED_WMS_RECEIVE_PLAN";
    protected final String _tableDispName = "E_BONDED_WMS_RECEIVE_PLAN";
    protected final String _tablePropertyName = "EBondedWmsReceivePlan";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_BONDED_WMS_RECEIVE_PLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBondedWmsReceivePlanId = cci("BONDED_WMS_RECEIVE_PLAN_ID", "BONDED_WMS_RECEIVE_PLAN_ID", null, null, Long.class, "bondedWmsReceivePlanId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSbwarehousecd = cci("SBWAREHOUSECD", "SBWAREHOUSECD", null, null, String.class, "sbwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, String.class, "expectqty1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromfax = cci("FROMFAX", "FROMFAX", null, null, String.class, "fromfax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjmfym = cci("BATJMFYM", "BATJMFYM", null, null, String.class, "batjmfym", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlNo = cci("BL_NO", "BL_NO", null, null, String.class, "blNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriername = cci("CARRIERNAME", "CARRIERNAME", null, null, String.class, "carriername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromemail = cci("FROMEMAIL", "FROMEMAIL", null, null, String.class, "fromemail", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalportdate = cci("ARRIVALPORTDATE", "ARRIVALPORTDATE", null, null, String.class, "arrivalportdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipname = cci("SHIPNAME", "SHIPNAME", null, null, String.class, "shipname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatdelino = cci("BATDELINO", "BATDELINO", null, null, String.class, "batdelino", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatdelidetailno = cci("BATDELIDETAILNO", "BATDELIDETAILNO", null, null, String.class, "batdelidetailno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatwarehousecd = cci("BATWAREHOUSECD", "BATWAREHOUSECD", null, null, String.class, "batwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatkeepwarehousecd = cci("BATKEEPWAREHOUSECD", "BATKEEPWAREHOUSECD", null, null, String.class, "batkeepwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatpartnernorcv = cci("BATPARTNERNORCV", "BATPARTNERNORCV", null, null, String.class, "batpartnernorcv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatpartnernosnd = cci("BATPARTNERNOSND", "BATPARTNERNOSND", null, null, String.class, "batpartnernosnd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatdelidetailnum = cci("BATDELIDETAILNUM", "BATDELIDETAILNUM", null, null, String.class, "batdelidetailnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBondedWmsReceivePlanId() { return _columnBondedWmsReceivePlanId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
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
     * RCVSCHDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvschdate() { return _columnRcvschdate; }
    /**
     * CARRIERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * SHIPTOCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * OTHERREFNO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * EXPECTQTY1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * FROMFAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromfax() { return _columnFromfax; }
    /**
     * BATJMFYM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjmfym() { return _columnBatjmfym; }
    /**
     * CARRIERSNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * CARRIERWBNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * FOREIGNCARGOFLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * BL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlNo() { return _columnBlNo; }
    /**
     * CARRIERNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriername() { return _columnCarriername; }
    /**
     * FROMEMAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromemail() { return _columnFromemail; }
    /**
     * ARRIVALPORTDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalportdate() { return _columnArrivalportdate; }
    /**
     * SHIPNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipname() { return _columnShipname; }
    /**
     * BATDELINO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatdelino() { return _columnBatdelino; }
    /**
     * BATDELIDETAILNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatdelidetailno() { return _columnBatdelidetailno; }
    /**
     * BATWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatwarehousecd() { return _columnBatwarehousecd; }
    /**
     * BATKEEPWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatkeepwarehousecd() { return _columnBatkeepwarehousecd; }
    /**
     * BATPARTNERNORCV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatpartnernorcv() { return _columnBatpartnernorcv; }
    /**
     * BATPARTNERNOSND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatpartnernosnd() { return _columnBatpartnernosnd; }
    /**
     * BATDELIDETAILNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatdelidetailnum() { return _columnBatdelidetailnum; }
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
        ls.add(columnBondedWmsReceivePlanId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnNotes());
        ls.add(columnSbwarehousecd());
        ls.add(columnSupplierrcvno());
        ls.add(columnRcvschdate());
        ls.add(columnCarrierno());
        ls.add(columnShiptocd());
        ls.add(columnOtherrefno1());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot1());
        ls.add(columnExpectqty1());
        ls.add(columnFromfax());
        ls.add(columnBatjmfym());
        ls.add(columnCarriersname());
        ls.add(columnCarrierwbno());
        ls.add(columnForeigncargoflg());
        ls.add(columnBlNo());
        ls.add(columnCarriername());
        ls.add(columnFromemail());
        ls.add(columnArrivalportdate());
        ls.add(columnShipname());
        ls.add(columnBatdelino());
        ls.add(columnBatdelidetailno());
        ls.add(columnBatwarehousecd());
        ls.add(columnBatkeepwarehousecd());
        ls.add(columnBatpartnernorcv());
        ls.add(columnBatpartnernosnd());
        ls.add(columnBatdelidetailnum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBondedWmsReceivePlanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EBondedWmsReceivePlan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EBondedWmsReceivePlanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EBondedWmsReceivePlanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EBondedWmsReceivePlan> getEntityType() { return EBondedWmsReceivePlan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EBondedWmsReceivePlan newEntity() { return new EBondedWmsReceivePlan(); }
    public EBondedWmsReceivePlan newMyEntity() { return new EBondedWmsReceivePlan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EBondedWmsReceivePlan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EBondedWmsReceivePlan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
