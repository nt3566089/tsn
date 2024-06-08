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
 * The DB meta of E_SHOP_DOMESTIC_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShopDomesticSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShopDomesticSendDbm _instance = new EShopDomesticSendDbm();
    private EShopDomesticSendDbm() {}
    public static EShopDomesticSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getShopDomesticSendId(), (et, vl) -> ((EShopDomesticSend)et).setShopDomesticSendId(ctl(vl)), "shopDomesticSendId");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getSendCd(), (et, vl) -> ((EShopDomesticSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getSendRowCd(), (et, vl) -> ((EShopDomesticSend)et).setSendRowCd(ctl(vl)), "sendRowCd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getWorkFlg(), (et, vl) -> ((EShopDomesticSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getUsernum1(), (et, vl) -> ((EShopDomesticSend)et).setUsernum1((String)vl), "usernum1");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getTracekey(), (et, vl) -> ((EShopDomesticSend)et).setTracekey((String)vl), "tracekey");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getWarehousecd(), (et, vl) -> ((EShopDomesticSend)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getWarehousename(), (et, vl) -> ((EShopDomesticSend)et).setWarehousename((String)vl), "warehousename");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getFactorycd(), (et, vl) -> ((EShopDomesticSend)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getFactoryname(), (et, vl) -> ((EShopDomesticSend)et).setFactoryname((String)vl), "factoryname");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getProductCd(), (et, vl) -> ((EShopDomesticSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getItemname(), (et, vl) -> ((EShopDomesticSend)et).setItemname((String)vl), "itemname");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getSkucd(), (et, vl) -> ((EShopDomesticSend)et).setSkucd((String)vl), "skucd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getReceivecd(), (et, vl) -> ((EShopDomesticSend)et).setReceivecd((String)vl), "receivecd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getProductmark(), (et, vl) -> ((EShopDomesticSend)et).setProductmark((String)vl), "productmark");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getOrderno(), (et, vl) -> ((EShopDomesticSend)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getPrinterno(), (et, vl) -> ((EShopDomesticSend)et).setPrinterno((String)vl), "printerno");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getMakeno(), (et, vl) -> ((EShopDomesticSend)et).setMakeno((String)vl), "makeno");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getLot4(), (et, vl) -> ((EShopDomesticSend)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getMaketime(), (et, vl) -> ((EShopDomesticSend)et).setMaketime((String)vl), "maketime");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getTransportcd(), (et, vl) -> ((EShopDomesticSend)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getDistributioncd(), (et, vl) -> ((EShopDomesticSend)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getPalletid(), (et, vl) -> ((EShopDomesticSend)et).setPalletid((String)vl), "palletid");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getInitnum(), (et, vl) -> ((EShopDomesticSend)et).setInitnum((String)vl), "initnum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getCreatedatetime(), (et, vl) -> ((EShopDomesticSend)et).setCreatedatetime((String)vl), "createdatetime");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAssortdatetime(), (et, vl) -> ((EShopDomesticSend)et).setAssortdatetime((String)vl), "assortdatetime");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getTracetype(), (et, vl) -> ((EShopDomesticSend)et).setTracetype((String)vl), "tracetype");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getTracetypename(), (et, vl) -> ((EShopDomesticSend)et).setTracetypename((String)vl), "tracetypename");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getLineblock(), (et, vl) -> ((EShopDomesticSend)et).setLineblock((String)vl), "lineblock");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAssortedunit(), (et, vl) -> ((EShopDomesticSend)et).setAssortedunit((String)vl), "assortedunit");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAssortedindex(), (et, vl) -> ((EShopDomesticSend)et).setAssortedindex((String)vl), "assortedindex");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getOperationcode(), (et, vl) -> ((EShopDomesticSend)et).setOperationcode((String)vl), "operationcode");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getCaseinnum(), (et, vl) -> ((EShopDomesticSend)et).setCaseinnum((String)vl), "caseinnum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAssortnum(), (et, vl) -> ((EShopDomesticSend)et).setAssortnum((String)vl), "assortnum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAssortdifnum(), (et, vl) -> ((EShopDomesticSend)et).setAssortdifnum((String)vl), "assortdifnum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getDirectioncd(), (et, vl) -> ((EShopDomesticSend)et).setDirectioncd((String)vl), "directioncd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getPistontype(), (et, vl) -> ((EShopDomesticSend)et).setPistontype((String)vl), "pistontype");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getCustomercd(), (et, vl) -> ((EShopDomesticSend)et).setCustomercd((String)vl), "customercd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getDirectionnum(), (et, vl) -> ((EShopDomesticSend)et).setDirectionnum((String)vl), "directionnum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getDistwarehousecd(), (et, vl) -> ((EShopDomesticSend)et).setDistwarehousecd((String)vl), "distwarehousecd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getDistwarehousename(), (et, vl) -> ((EShopDomesticSend)et).setDistwarehousename((String)vl), "distwarehousename");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getInvNum(), (et, vl) -> ((EShopDomesticSend)et).setInvNum((String)vl), "invNum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getSortNum(), (et, vl) -> ((EShopDomesticSend)et).setSortNum((String)vl), "sortNum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAdoptNum(), (et, vl) -> ((EShopDomesticSend)et).setAdoptNum((String)vl), "adoptNum");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getWhItemcd(), (et, vl) -> ((EShopDomesticSend)et).setWhItemcd((String)vl), "whItemcd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getWhItemname(), (et, vl) -> ((EShopDomesticSend)et).setWhItemname((String)vl), "whItemname");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getWhDesigncd(), (et, vl) -> ((EShopDomesticSend)et).setWhDesigncd((String)vl), "whDesigncd");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getDelFlg(), (et, vl) -> ((EShopDomesticSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getVersionNo(), (et, vl) -> ((EShopDomesticSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getControlNo(), (et, vl) -> ((EShopDomesticSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAddDt(), (et, vl) -> ((EShopDomesticSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAddUser(), (et, vl) -> ((EShopDomesticSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getAddProcess(), (et, vl) -> ((EShopDomesticSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getUpdDt(), (et, vl) -> ((EShopDomesticSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getUpdUser(), (et, vl) -> ((EShopDomesticSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShopDomesticSend)et).getUpdProcess(), (et, vl) -> ((EShopDomesticSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHOP_DOMESTIC_SEND";
    protected final String _tableDispName = "E_SHOP_DOMESTIC_SEND";
    protected final String _tablePropertyName = "EShopDomesticSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHOP_DOMESTIC_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShopDomesticSendId = cci("SHOP_DOMESTIC_SEND_ID", "SHOP_DOMESTIC_SEND_ID", null, null, Long.class, "shopDomesticSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowCd = cci("SEND_ROW_CD", "SEND_ROW_CD", null, null, Long.class, "sendRowCd", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, String.class, "usernum1", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracekey = cci("TRACEKEY", "TRACEKEY", null, null, String.class, "tracekey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousename = cci("WAREHOUSENAME", "WAREHOUSENAME", null, null, String.class, "warehousename", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactoryname = cci("FACTORYNAME", "FACTORYNAME", null, null, String.class, "factoryname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemname = cci("ITEMNAME", "ITEMNAME", null, null, String.class, "itemname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucd = cci("SKUCD", "SKUCD", null, null, String.class, "skucd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivecd = cci("RECEIVECD", "RECEIVECD", null, null, String.class, "receivecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductmark = cci("PRODUCTMARK", "PRODUCTMARK", null, null, String.class, "productmark", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterno = cci("PRINTERNO", "PRINTERNO", null, null, String.class, "printerno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakeno = cci("MAKENO", "MAKENO", null, null, String.class, "makeno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaketime = cci("MAKETIME", "MAKETIME", null, null, String.class, "maketime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletid = cci("PALLETID", "PALLETID", null, null, String.class, "palletid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitnum = cci("INITNUM", "INITNUM", null, null, String.class, "initnum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, String.class, "createdatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortdatetime = cci("ASSORTDATETIME", "ASSORTDATETIME", null, null, String.class, "assortdatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetype = cci("TRACETYPE", "TRACETYPE", null, null, String.class, "tracetype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetypename = cci("TRACETYPENAME", "TRACETYPENAME", null, null, String.class, "tracetypename", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnDistwarehousename = cci("DISTWAREHOUSENAME", "DISTWAREHOUSENAME", null, null, String.class, "distwarehousename", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvNum = cci("INV_NUM", "INV_NUM", null, null, String.class, "invNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortNum = cci("SORT_NUM", "SORT_NUM", null, null, String.class, "sortNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdoptNum = cci("ADOPT_NUM", "ADOPT_NUM", null, null, String.class, "adoptNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWhItemcd = cci("WH_ITEMCD", "WH_ITEMCD", null, null, String.class, "whItemcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWhItemname = cci("WH_ITEMNAME", "WH_ITEMNAME", null, null, String.class, "whItemname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWhDesigncd = cci("WH_DESIGNCD", "WH_DESIGNCD", null, null, String.class, "whDesigncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopDomesticSendId() { return _columnShopDomesticSendId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowCd() { return _columnSendRowCd; }
    /**
     * WORK_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * USERNUM1: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
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
     * WAREHOUSENAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousename() { return _columnWarehousename; }
    /**
     * FACTORYCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * FACTORYNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactoryname() { return _columnFactoryname; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEMNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemname() { return _columnItemname; }
    /**
     * SKUCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkucd() { return _columnSkucd; }
    /**
     * RECEIVECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivecd() { return _columnReceivecd; }
    /**
     * PRODUCTMARK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductmark() { return _columnProductmark; }
    /**
     * ORDERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * PRINTERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterno() { return _columnPrinterno; }
    /**
     * MAKENO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakeno() { return _columnMakeno; }
    /**
     * LOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * MAKETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaketime() { return _columnMaketime; }
    /**
     * TRANSPORTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
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
     * TRACETYPENAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracetypename() { return _columnTracetypename; }
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
     * DISTWAREHOUSENAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistwarehousename() { return _columnDistwarehousename; }
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
     * WH_ITEMCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhItemcd() { return _columnWhItemcd; }
    /**
     * WH_ITEMNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhItemname() { return _columnWhItemname; }
    /**
     * WH_DESIGNCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhDesigncd() { return _columnWhDesigncd; }
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
        ls.add(columnShopDomesticSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowCd());
        ls.add(columnWorkFlg());
        ls.add(columnUsernum1());
        ls.add(columnTracekey());
        ls.add(columnWarehousecd());
        ls.add(columnWarehousename());
        ls.add(columnFactorycd());
        ls.add(columnFactoryname());
        ls.add(columnProductCd());
        ls.add(columnItemname());
        ls.add(columnSkucd());
        ls.add(columnReceivecd());
        ls.add(columnProductmark());
        ls.add(columnOrderno());
        ls.add(columnPrinterno());
        ls.add(columnMakeno());
        ls.add(columnLot4());
        ls.add(columnMaketime());
        ls.add(columnTransportcd());
        ls.add(columnDistributioncd());
        ls.add(columnPalletid());
        ls.add(columnInitnum());
        ls.add(columnCreatedatetime());
        ls.add(columnAssortdatetime());
        ls.add(columnTracetype());
        ls.add(columnTracetypename());
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
        ls.add(columnDistwarehousename());
        ls.add(columnInvNum());
        ls.add(columnSortNum());
        ls.add(columnAdoptNum());
        ls.add(columnWhItemcd());
        ls.add(columnWhItemname());
        ls.add(columnWhDesigncd());
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
    protected UniqueInfo cpui() { return hpcpui(columnShopDomesticSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShopDomesticSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShopDomesticSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShopDomesticSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShopDomesticSend> getEntityType() { return EShopDomesticSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShopDomesticSend newEntity() { return new EShopDomesticSend(); }
    public EShopDomesticSend newMyEntity() { return new EShopDomesticSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShopDomesticSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShopDomesticSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
