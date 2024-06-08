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
 * The DB meta of E_SHIPPING_RECORD_DATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShippingRecordDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShippingRecordDataDbm _instance = new EShippingRecordDataDbm();
    private EShippingRecordDataDbm() {}
    public static EShippingRecordDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getShippingRecordDataId(), (et, vl) -> ((EShippingRecordData)et).setShippingRecordDataId(ctl(vl)), "shippingRecordDataId");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getReceiveCd(), (et, vl) -> ((EShippingRecordData)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getReceiveRowId(), (et, vl) -> ((EShippingRecordData)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getImportFlg(), (et, vl) -> ((EShippingRecordData)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getErrorFlg(), (et, vl) -> ((EShippingRecordData)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getErrorMessageCd(), (et, vl) -> ((EShippingRecordData)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getDataFlg(), (et, vl) -> ((EShippingRecordData)et).setDataFlg((String)vl), "dataFlg");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getRecordData(), (et, vl) -> ((EShippingRecordData)et).setRecordData((String)vl), "recordData");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getTransportcd(), (et, vl) -> ((EShippingRecordData)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getItemcdH(), (et, vl) -> ((EShippingRecordData)et).setItemcdH((String)vl), "itemcdH");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getOrdernoH(), (et, vl) -> ((EShippingRecordData)et).setOrdernoH((String)vl), "ordernoH");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getCaseqty(), (et, vl) -> ((EShippingRecordData)et).setCaseqty((String)vl), "caseqty");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getFractqty(), (et, vl) -> ((EShippingRecordData)et).setFractqty((String)vl), "fractqty");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getShiptocd(), (et, vl) -> ((EShippingRecordData)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getFactorycd(), (et, vl) -> ((EShippingRecordData)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getItemcdM(), (et, vl) -> ((EShippingRecordData)et).setItemcdM((String)vl), "itemcdM");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getSkucd(), (et, vl) -> ((EShippingRecordData)et).setSkucd((String)vl), "skucd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getDestinationcd(), (et, vl) -> ((EShippingRecordData)et).setDestinationcd((String)vl), "destinationcd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getManufacturecd(), (et, vl) -> ((EShippingRecordData)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getOrdernoM(), (et, vl) -> ((EShippingRecordData)et).setOrdernoM((String)vl), "ordernoM");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getMachineno(), (et, vl) -> ((EShippingRecordData)et).setMachineno((String)vl), "machineno");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getCreateno(), (et, vl) -> ((EShippingRecordData)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getLimitdate(), (et, vl) -> ((EShippingRecordData)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getCaselot4(), (et, vl) -> ((EShippingRecordData)et).setCaselot4((String)vl), "caselot4");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getDistributioncd(), (et, vl) -> ((EShippingRecordData)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getPalletid(), (et, vl) -> ((EShippingRecordData)et).setPalletid((String)vl), "palletid");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getDelFlg(), (et, vl) -> ((EShippingRecordData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getVersionNo(), (et, vl) -> ((EShippingRecordData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getControlNo(), (et, vl) -> ((EShippingRecordData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getAddDt(), (et, vl) -> ((EShippingRecordData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getAddUser(), (et, vl) -> ((EShippingRecordData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getAddProcess(), (et, vl) -> ((EShippingRecordData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getUpdDt(), (et, vl) -> ((EShippingRecordData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getUpdUser(), (et, vl) -> ((EShippingRecordData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShippingRecordData)et).getUpdProcess(), (et, vl) -> ((EShippingRecordData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHIPPING_RECORD_DATA";
    protected final String _tableDispName = "E_SHIPPING_RECORD_DATA";
    protected final String _tablePropertyName = "EShippingRecordData";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHIPPING_RECORD_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingRecordDataId = cci("SHIPPING_RECORD_DATA_ID", "SHIPPING_RECORD_DATA_ID", null, null, Long.class, "shippingRecordDataId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataFlg = cci("DATA_FLG", "DATA_FLG", null, null, String.class, "dataFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecordData = cci("RECORD_DATA", "RECORD_DATA", null, null, String.class, "recordData", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdH = cci("ITEMCD_H", "ITEMCD_H", null, null, String.class, "itemcdH", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdernoH = cci("ORDERNO_H", "ORDERNO_H", null, null, String.class, "ordernoH", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseqty = cci("CASEQTY", "CASEQTY", null, null, String.class, "caseqty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFractqty = cci("FRACTQTY", "FRACTQTY", null, null, String.class, "fractqty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdM = cci("ITEMCD_M", "ITEMCD_M", null, null, String.class, "itemcdM", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucd = cci("SKUCD", "SKUCD", null, null, String.class, "skucd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationcd = cci("DESTINATIONCD", "DESTINATIONCD", null, null, String.class, "destinationcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdernoM = cci("ORDERNO_M", "ORDERNO_M", null, null, String.class, "ordernoM", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineno = cci("MACHINENO", "MACHINENO", null, null, String.class, "machineno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaselot4 = cci("CASELOT4", "CASELOT4", null, null, String.class, "caselot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletid = cci("PALLETID", "PALLETID", null, null, String.class, "palletid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordDataId() { return _columnShippingRecordDataId; }
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
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataFlg() { return _columnDataFlg; }
    /**
     * RECORD_DATA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecordData() { return _columnRecordData; }
    /**
     * TRANSPORTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * ITEMCD_H: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdH() { return _columnItemcdH; }
    /**
     * ORDERNO_H: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdernoH() { return _columnOrdernoH; }
    /**
     * CASEQTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseqty() { return _columnCaseqty; }
    /**
     * FRACTQTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFractqty() { return _columnFractqty; }
    /**
     * SHIPTOCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * FACTORYCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * ITEMCD_M: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdM() { return _columnItemcdM; }
    /**
     * SKUCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkucd() { return _columnSkucd; }
    /**
     * DESTINATIONCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationcd() { return _columnDestinationcd; }
    /**
     * MANUFACTURECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturecd() { return _columnManufacturecd; }
    /**
     * ORDERNO_M: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdernoM() { return _columnOrdernoM; }
    /**
     * MACHINENO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachineno() { return _columnMachineno; }
    /**
     * CREATENO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateno() { return _columnCreateno; }
    /**
     * LIMITDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * CASELOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaselot4() { return _columnCaselot4; }
    /**
     * DISTRIBUTIONCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * PALLETID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletid() { return _columnPalletid; }
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
        ls.add(columnShippingRecordDataId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnDataFlg());
        ls.add(columnRecordData());
        ls.add(columnTransportcd());
        ls.add(columnItemcdH());
        ls.add(columnOrdernoH());
        ls.add(columnCaseqty());
        ls.add(columnFractqty());
        ls.add(columnShiptocd());
        ls.add(columnFactorycd());
        ls.add(columnItemcdM());
        ls.add(columnSkucd());
        ls.add(columnDestinationcd());
        ls.add(columnManufacturecd());
        ls.add(columnOrdernoM());
        ls.add(columnMachineno());
        ls.add(columnCreateno());
        ls.add(columnLimitdate());
        ls.add(columnCaselot4());
        ls.add(columnDistributioncd());
        ls.add(columnPalletid());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingRecordDataId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShippingRecordData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShippingRecordDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShippingRecordDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShippingRecordData> getEntityType() { return EShippingRecordData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShippingRecordData newEntity() { return new EShippingRecordData(); }
    public EShippingRecordData newMyEntity() { return new EShippingRecordData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShippingRecordData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShippingRecordData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
