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
 * The DB meta of E_PRODUCT_TRACKING_DOMES. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EProductTrackingDomesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EProductTrackingDomesDbm _instance = new EProductTrackingDomesDbm();
    private EProductTrackingDomesDbm() {}
    public static EProductTrackingDomesDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getProductTrackingDomesId(), (et, vl) -> ((EProductTrackingDomes)et).setProductTrackingDomesId(ctl(vl)), "productTrackingDomesId");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getSendCd(), (et, vl) -> ((EProductTrackingDomes)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getSendRowId(), (et, vl) -> ((EProductTrackingDomes)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getWorkFlg(), (et, vl) -> ((EProductTrackingDomes)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getUsernum1(), (et, vl) -> ((EProductTrackingDomes)et).setUsernum1((String)vl), "usernum1");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getItemAdmin(), (et, vl) -> ((EProductTrackingDomes)et).setItemAdmin((String)vl), "itemAdmin");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getTracekey(), (et, vl) -> ((EProductTrackingDomes)et).setTracekey((String)vl), "tracekey");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getWarehousecd(), (et, vl) -> ((EProductTrackingDomes)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getFactorycd(), (et, vl) -> ((EProductTrackingDomes)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getProductCd(), (et, vl) -> ((EProductTrackingDomes)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getSkucd(), (et, vl) -> ((EProductTrackingDomes)et).setSkucd((String)vl), "skucd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDestinationcd(), (et, vl) -> ((EProductTrackingDomes)et).setDestinationcd((String)vl), "destinationcd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getManufacturecd(), (et, vl) -> ((EProductTrackingDomes)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getOrderno(), (et, vl) -> ((EProductTrackingDomes)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getMachinemo(), (et, vl) -> ((EProductTrackingDomes)et).setMachinemo((String)vl), "machinemo");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getCreateno(), (et, vl) -> ((EProductTrackingDomes)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getLimitdate(), (et, vl) -> ((EProductTrackingDomes)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDatetime(), (et, vl) -> ((EProductTrackingDomes)et).setDatetime((String)vl), "datetime");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDistributioncd(), (et, vl) -> ((EProductTrackingDomes)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getTransportcd(), (et, vl) -> ((EProductTrackingDomes)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getPalletid(), (et, vl) -> ((EProductTrackingDomes)et).setPalletid((String)vl), "palletid");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getInitnum(), (et, vl) -> ((EProductTrackingDomes)et).setInitnum((String)vl), "initnum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getCreatedatetime(), (et, vl) -> ((EProductTrackingDomes)et).setCreatedatetime((String)vl), "createdatetime");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAssortdatetime(), (et, vl) -> ((EProductTrackingDomes)et).setAssortdatetime((String)vl), "assortdatetime");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getTracetype(), (et, vl) -> ((EProductTrackingDomes)et).setTracetype((String)vl), "tracetype");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getLineblock(), (et, vl) -> ((EProductTrackingDomes)et).setLineblock((String)vl), "lineblock");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAssortedunit(), (et, vl) -> ((EProductTrackingDomes)et).setAssortedunit((String)vl), "assortedunit");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAssortedindex(), (et, vl) -> ((EProductTrackingDomes)et).setAssortedindex((String)vl), "assortedindex");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getOperationcode(), (et, vl) -> ((EProductTrackingDomes)et).setOperationcode((String)vl), "operationcode");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getCaseinnum(), (et, vl) -> ((EProductTrackingDomes)et).setCaseinnum((String)vl), "caseinnum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAssortnum(), (et, vl) -> ((EProductTrackingDomes)et).setAssortnum((String)vl), "assortnum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAssortdifnum(), (et, vl) -> ((EProductTrackingDomes)et).setAssortdifnum((String)vl), "assortdifnum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDirectioncd(), (et, vl) -> ((EProductTrackingDomes)et).setDirectioncd((String)vl), "directioncd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getPistontype(), (et, vl) -> ((EProductTrackingDomes)et).setPistontype((String)vl), "pistontype");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getCustomercd(), (et, vl) -> ((EProductTrackingDomes)et).setCustomercd((String)vl), "customercd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDirectionnum(), (et, vl) -> ((EProductTrackingDomes)et).setDirectionnum((String)vl), "directionnum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDistwarehousecd(), (et, vl) -> ((EProductTrackingDomes)et).setDistwarehousecd((String)vl), "distwarehousecd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getRcvkey(), (et, vl) -> ((EProductTrackingDomes)et).setRcvkey((String)vl), "rcvkey");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getItemcdWh(), (et, vl) -> ((EProductTrackingDomes)et).setItemcdWh((String)vl), "itemcdWh");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDesigncd(), (et, vl) -> ((EProductTrackingDomes)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getInvNum(), (et, vl) -> ((EProductTrackingDomes)et).setInvNum((String)vl), "invNum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getSortNum(), (et, vl) -> ((EProductTrackingDomes)et).setSortNum((String)vl), "sortNum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAdoptNum(), (et, vl) -> ((EProductTrackingDomes)et).setAdoptNum((String)vl), "adoptNum");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDtExtdata2(), (et, vl) -> ((EProductTrackingDomes)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getReservearea(), (et, vl) -> ((EProductTrackingDomes)et).setReservearea((String)vl), "reservearea");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getDelFlg(), (et, vl) -> ((EProductTrackingDomes)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getVersionNo(), (et, vl) -> ((EProductTrackingDomes)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getControlNo(), (et, vl) -> ((EProductTrackingDomes)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAddDt(), (et, vl) -> ((EProductTrackingDomes)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAddUser(), (et, vl) -> ((EProductTrackingDomes)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getAddProcess(), (et, vl) -> ((EProductTrackingDomes)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getUpdDt(), (et, vl) -> ((EProductTrackingDomes)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getUpdUser(), (et, vl) -> ((EProductTrackingDomes)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EProductTrackingDomes)et).getUpdProcess(), (et, vl) -> ((EProductTrackingDomes)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PRODUCT_TRACKING_DOMES";
    protected final String _tableDispName = "E_PRODUCT_TRACKING_DOMES";
    protected final String _tablePropertyName = "EProductTrackingDomes";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PRODUCT_TRACKING_DOMES", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductTrackingDomesId = cci("PRODUCT_TRACKING_DOMES_ID", "PRODUCT_TRACKING_DOMES_ID", null, null, Long.class, "productTrackingDomesId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, String.class, "usernum1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemAdmin = cci("ITEM_ADMIN", "ITEM_ADMIN", null, null, String.class, "itemAdmin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracekey = cci("TRACEKEY", "TRACEKEY", null, null, String.class, "tracekey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucd = cci("SKUCD", "SKUCD", null, null, String.class, "skucd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationcd = cci("DESTINATIONCD", "DESTINATIONCD", null, null, String.class, "destinationcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachinemo = cci("MACHINEMO", "MACHINEMO", null, null, String.class, "machinemo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatetime = cci("DATETIME", "DATETIME", null, null, String.class, "datetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletid = cci("PALLETID", "PALLETID", null, null, String.class, "palletid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitnum = cci("INITNUM", "INITNUM", null, null, String.class, "initnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, String.class, "createdatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortdatetime = cci("ASSORTDATETIME", "ASSORTDATETIME", null, null, String.class, "assortdatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetype = cci("TRACETYPE", "TRACETYPE", null, null, String.class, "tracetype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineblock = cci("LINEBLOCK", "LINEBLOCK", null, null, String.class, "lineblock", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedunit = cci("ASSORTEDUNIT", "ASSORTEDUNIT", null, null, String.class, "assortedunit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedindex = cci("ASSORTEDINDEX", "ASSORTEDINDEX", null, null, String.class, "assortedindex", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationcode = cci("OPERATIONCODE", "OPERATIONCODE", null, null, String.class, "operationcode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinnum = cci("CASEINNUM", "CASEINNUM", null, null, String.class, "caseinnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortnum = cci("ASSORTNUM", "ASSORTNUM", null, null, String.class, "assortnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortdifnum = cci("ASSORTDIFNUM", "ASSORTDIFNUM", null, null, String.class, "assortdifnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectioncd = cci("DIRECTIONCD", "DIRECTIONCD", null, null, String.class, "directioncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistontype = cci("PISTONTYPE", "PISTONTYPE", null, null, String.class, "pistontype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomercd = cci("CUSTOMERCD", "CUSTOMERCD", null, null, String.class, "customercd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionnum = cci("DIRECTIONNUM", "DIRECTIONNUM", null, null, String.class, "directionnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistwarehousecd = cci("DISTWAREHOUSECD", "DISTWAREHOUSECD", null, null, String.class, "distwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, String.class, "rcvkey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdWh = cci("ITEMCD_WH", "ITEMCD_WH", null, null, String.class, "itemcdWh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvNum = cci("INV_NUM", "INV_NUM", null, null, String.class, "invNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortNum = cci("SORT_NUM", "SORT_NUM", null, null, String.class, "sortNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdoptNum = cci("ADOPT_NUM", "ADOPT_NUM", null, null, String.class, "adoptNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservearea = cci("RESERVEAREA", "RESERVEAREA", null, null, String.class, "reservearea", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductTrackingDomesId() { return _columnProductTrackingDomesId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * WORK_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * USERNUM1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * ITEM_ADMIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemAdmin() { return _columnItemAdmin; }
    /**
     * TRACEKEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracekey() { return _columnTracekey; }
    /**
     * WAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * FACTORYCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
     * ORDERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * MACHINEMO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachinemo() { return _columnMachinemo; }
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
     * DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatetime() { return _columnDatetime; }
    /**
     * DISTRIBUTIONCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * TRANSPORTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * PALLETID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletid() { return _columnPalletid; }
    /**
     * INITNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitnum() { return _columnInitnum; }
    /**
     * CREATEDATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedatetime() { return _columnCreatedatetime; }
    /**
     * ASSORTDATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortdatetime() { return _columnAssortdatetime; }
    /**
     * TRACETYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracetype() { return _columnTracetype; }
    /**
     * LINEBLOCK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineblock() { return _columnLineblock; }
    /**
     * ASSORTEDUNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedunit() { return _columnAssortedunit; }
    /**
     * ASSORTEDINDEX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedindex() { return _columnAssortedindex; }
    /**
     * OPERATIONCODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationcode() { return _columnOperationcode; }
    /**
     * CASEINNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinnum() { return _columnCaseinnum; }
    /**
     * ASSORTNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortnum() { return _columnAssortnum; }
    /**
     * ASSORTDIFNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortdifnum() { return _columnAssortdifnum; }
    /**
     * DIRECTIONCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectioncd() { return _columnDirectioncd; }
    /**
     * PISTONTYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistontype() { return _columnPistontype; }
    /**
     * CUSTOMERCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomercd() { return _columnCustomercd; }
    /**
     * DIRECTIONNUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionnum() { return _columnDirectionnum; }
    /**
     * DISTWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistwarehousecd() { return _columnDistwarehousecd; }
    /**
     * RCVKEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * ITEMCD_WH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdWh() { return _columnItemcdWh; }
    /**
     * DESIGNCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * INV_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvNum() { return _columnInvNum; }
    /**
     * SORT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortNum() { return _columnSortNum; }
    /**
     * ADOPT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdoptNum() { return _columnAdoptNum; }
    /**
     * DT_EXTDATA2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * RESERVEAREA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservearea() { return _columnReservearea; }
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
        ls.add(columnProductTrackingDomesId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnUsernum1());
        ls.add(columnItemAdmin());
        ls.add(columnTracekey());
        ls.add(columnWarehousecd());
        ls.add(columnFactorycd());
        ls.add(columnProductCd());
        ls.add(columnSkucd());
        ls.add(columnDestinationcd());
        ls.add(columnManufacturecd());
        ls.add(columnOrderno());
        ls.add(columnMachinemo());
        ls.add(columnCreateno());
        ls.add(columnLimitdate());
        ls.add(columnDatetime());
        ls.add(columnDistributioncd());
        ls.add(columnTransportcd());
        ls.add(columnPalletid());
        ls.add(columnInitnum());
        ls.add(columnCreatedatetime());
        ls.add(columnAssortdatetime());
        ls.add(columnTracetype());
        ls.add(columnLineblock());
        ls.add(columnAssortedunit());
        ls.add(columnAssortedindex());
        ls.add(columnOperationcode());
        ls.add(columnCaseinnum());
        ls.add(columnAssortnum());
        ls.add(columnAssortdifnum());
        ls.add(columnDirectioncd());
        ls.add(columnPistontype());
        ls.add(columnCustomercd());
        ls.add(columnDirectionnum());
        ls.add(columnDistwarehousecd());
        ls.add(columnRcvkey());
        ls.add(columnItemcdWh());
        ls.add(columnDesigncd());
        ls.add(columnInvNum());
        ls.add(columnSortNum());
        ls.add(columnAdoptNum());
        ls.add(columnDtExtdata2());
        ls.add(columnReservearea());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductTrackingDomesId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EProductTrackingDomes"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EProductTrackingDomesCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EProductTrackingDomesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EProductTrackingDomes> getEntityType() { return EProductTrackingDomes.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EProductTrackingDomes newEntity() { return new EProductTrackingDomes(); }
    public EProductTrackingDomes newMyEntity() { return new EProductTrackingDomes(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EProductTrackingDomes)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EProductTrackingDomes)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
