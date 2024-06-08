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
 * The DB meta of T_TRFLEXIBILITYPRODUCT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilityproductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrflexibilityproductDbm _instance = new TTrflexibilityproductDbm();
    private TTrflexibilityproductDbm() {}
    public static TTrflexibilityproductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getTrflexibilityproductId(), (et, vl) -> ((TTrflexibilityproduct)et).setTrflexibilityproductId(ctl(vl)), "trflexibilityproductId");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getSuppliercd(), (et, vl) -> ((TTrflexibilityproduct)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getShipcd(), (et, vl) -> ((TTrflexibilityproduct)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getSchdate(), (et, vl) -> ((TTrflexibilityproduct)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getFlexibityno(), (et, vl) -> ((TTrflexibilityproduct)et).setFlexibityno(ctb(vl)), "flexibityno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getTransportcd(), (et, vl) -> ((TTrflexibilityproduct)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getRcvdate(), (et, vl) -> ((TTrflexibilityproduct)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getOwnercd(), (et, vl) -> ((TTrflexibilityproduct)et).setOwnercd((String)vl), "ownercd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getInstractdatetime(), (et, vl) -> ((TTrflexibilityproduct)et).setInstractdatetime((String)vl), "instractdatetime");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getRcvmakeflg(), (et, vl) -> ((TTrflexibilityproduct)et).setRcvmakeflg(ctb(vl)), "rcvmakeflg");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getReflineno(), (et, vl) -> ((TTrflexibilityproduct)et).setReflineno(ctl(vl)), "reflineno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getProductCd(), (et, vl) -> ((TTrflexibilityproduct)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getManufacturedate(), (et, vl) -> ((TTrflexibilityproduct)et).setManufacturedate((String)vl), "manufacturedate");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDesigncd(), (et, vl) -> ((TTrflexibilityproduct)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getQtycase(), (et, vl) -> ((TTrflexibilityproduct)et).setQtycase(ctb(vl)), "qtycase");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getQtybowl(), (et, vl) -> ((TTrflexibilityproduct)et).setQtybowl(ctb(vl)), "qtybowl");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getCaseinfoflg(), (et, vl) -> ((TTrflexibilityproduct)et).setCaseinfoflg(ctb(vl)), "caseinfoflg");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getFactorycd(), (et, vl) -> ((TTrflexibilityproduct)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getItemcdCase(), (et, vl) -> ((TTrflexibilityproduct)et).setItemcdCase((String)vl), "itemcdCase");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getSkucd(), (et, vl) -> ((TTrflexibilityproduct)et).setSkucd((String)vl), "skucd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDestinationcd(), (et, vl) -> ((TTrflexibilityproduct)et).setDestinationcd((String)vl), "destinationcd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getManufacturecd(), (et, vl) -> ((TTrflexibilityproduct)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getOrderno(), (et, vl) -> ((TTrflexibilityproduct)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getMachineno(), (et, vl) -> ((TTrflexibilityproduct)et).setMachineno((String)vl), "machineno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getCreateno(), (et, vl) -> ((TTrflexibilityproduct)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getLimitdate(), (et, vl) -> ((TTrflexibilityproduct)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDatetime(), (et, vl) -> ((TTrflexibilityproduct)et).setDatetime((String)vl), "datetime");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDistributioncd(), (et, vl) -> ((TTrflexibilityproduct)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getOperationnum(), (et, vl) -> ((TTrflexibilityproduct)et).setOperationnum(ctl(vl)), "operationnum");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getRcvkey(), (et, vl) -> ((TTrflexibilityproduct)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getFirmcarryno(), (et, vl) -> ((TTrflexibilityproduct)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getBatjproductionym(), (et, vl) -> ((TTrflexibilityproduct)et).setBatjproductionym((String)vl), "batjproductionym");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getCometodate(), (et, vl) -> ((TTrflexibilityproduct)et).setCometodate((String)vl), "cometodate");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getReceivedate(), (et, vl) -> ((TTrflexibilityproduct)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getCardboardno(), (et, vl) -> ((TTrflexibilityproduct)et).setCardboardno((String)vl), "cardboardno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getRcvpalletno(), (et, vl) -> ((TTrflexibilityproduct)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getTaxpalletno(), (et, vl) -> ((TTrflexibilityproduct)et).setTaxpalletno((String)vl), "taxpalletno");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getItemcdIn(), (et, vl) -> ((TTrflexibilityproduct)et).setItemcdIn((String)vl), "itemcdIn");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getItemcdWh(), (et, vl) -> ((TTrflexibilityproduct)et).setItemcdWh((String)vl), "itemcdWh");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDesigncdIn(), (et, vl) -> ((TTrflexibilityproduct)et).setDesigncdIn((String)vl), "designcdIn");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDesigncdWh(), (et, vl) -> ((TTrflexibilityproduct)et).setDesigncdWh((String)vl), "designcdWh");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getVaExtdata1(), (et, vl) -> ((TTrflexibilityproduct)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getVaExtdata2(), (et, vl) -> ((TTrflexibilityproduct)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getVaExtdata3(), (et, vl) -> ((TTrflexibilityproduct)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getNvExtdata1(), (et, vl) -> ((TTrflexibilityproduct)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getNvExtdata2(), (et, vl) -> ((TTrflexibilityproduct)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getNvExtdata3(), (et, vl) -> ((TTrflexibilityproduct)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getNmExtdata1(), (et, vl) -> ((TTrflexibilityproduct)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getNmExtdata2(), (et, vl) -> ((TTrflexibilityproduct)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getNmExtdata3(), (et, vl) -> ((TTrflexibilityproduct)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDtExtdata1(), (et, vl) -> ((TTrflexibilityproduct)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDtExtdata2(), (et, vl) -> ((TTrflexibilityproduct)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDtExtdata3(), (et, vl) -> ((TTrflexibilityproduct)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getDelFlg(), (et, vl) -> ((TTrflexibilityproduct)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getVersionNo(), (et, vl) -> ((TTrflexibilityproduct)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getControlNo(), (et, vl) -> ((TTrflexibilityproduct)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getAddDt(), (et, vl) -> ((TTrflexibilityproduct)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getAddUser(), (et, vl) -> ((TTrflexibilityproduct)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getAddProcess(), (et, vl) -> ((TTrflexibilityproduct)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getUpdDt(), (et, vl) -> ((TTrflexibilityproduct)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getUpdUser(), (et, vl) -> ((TTrflexibilityproduct)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrflexibilityproduct)et).getUpdProcess(), (et, vl) -> ((TTrflexibilityproduct)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRFLEXIBILITYPRODUCT";
    protected final String _tableDispName = "T_TRFLEXIBILITYPRODUCT";
    protected final String _tablePropertyName = "TTrflexibilityproduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRFLEXIBILITYPRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrflexibilityproductId = cci("TRFLEXIBILITYPRODUCT_ID", "TRFLEXIBILITYPRODUCT_ID", null, null, Long.class, "trflexibilityproductId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SCHDATE", "SCHDATE", null, null, String.class, "schdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexibityno = cci("FLEXIBITYNO", "FLEXIBITYNO", null, null, java.math.BigDecimal.class, "flexibityno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdate = cci("RCVDATE", "RCVDATE", null, null, String.class, "rcvdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnercd = cci("OWNERCD", "OWNERCD", null, null, String.class, "ownercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstractdatetime = cci("INSTRACTDATETIME", "INSTRACTDATETIME", null, null, String.class, "instractdatetime", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvmakeflg = cci("RCVMAKEFLG", "RCVMAKEFLG", null, null, java.math.BigDecimal.class, "rcvmakeflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReflineno = cci("REFLINENO", "REFLINENO", null, null, Long.class, "reflineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturedate = cci("MANUFACTUREDATE", "MANUFACTUREDATE", null, null, String.class, "manufacturedate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtycase = cci("QTYCASE", "QTYCASE", null, null, java.math.BigDecimal.class, "qtycase", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtybowl = cci("QTYBOWL", "QTYBOWL", null, null, java.math.BigDecimal.class, "qtybowl", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinfoflg = cci("CASEINFOFLG", "CASEINFOFLG", null, null, java.math.BigDecimal.class, "caseinfoflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdCase = cci("ITEMCD_CASE", "ITEMCD_CASE", null, null, String.class, "itemcdCase", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucd = cci("SKUCD", "SKUCD", null, null, String.class, "skucd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationcd = cci("DESTINATIONCD", "DESTINATIONCD", null, null, String.class, "destinationcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineno = cci("MACHINENO", "MACHINENO", null, null, String.class, "machineno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatetime = cci("DATETIME", "DATETIME", null, null, String.class, "datetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationnum = cci("OPERATIONNUM", "OPERATIONNUM", null, null, Long.class, "operationnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjproductionym = cci("BATJPRODUCTIONYM", "BATJPRODUCTIONYM", null, null, String.class, "batjproductionym", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCometodate = cci("COMETODATE", "COMETODATE", null, null, String.class, "cometodate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardboardno = cci("CARDBOARDNO", "CARDBOARDNO", null, null, String.class, "cardboardno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RCVPALLETNO", "RCVPALLETNO", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxpalletno = cci("TAXPALLETNO", "TAXPALLETNO", null, null, String.class, "taxpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdIn = cci("ITEMCD_IN", "ITEMCD_IN", null, null, String.class, "itemcdIn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdWh = cci("ITEMCD_WH", "ITEMCD_WH", null, null, String.class, "itemcdWh", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdIn = cci("DESIGNCD_IN", "DESIGNCD_IN", null, null, String.class, "designcdIn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdWh = cci("DESIGNCD_WH", "DESIGNCD_WH", null, null, String.class, "designcdWh", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata3 = cci("VA_EXTDATA3", "VA_EXTDATA3", null, null, String.class, "vaExtdata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata1 = cci("NV_EXTDATA1", "NV_EXTDATA1", null, null, String.class, "nvExtdata1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata2 = cci("NV_EXTDATA2", "NV_EXTDATA2", null, null, String.class, "nvExtdata2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata3 = cci("NV_EXTDATA3", "NV_EXTDATA3", null, null, String.class, "nvExtdata3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata1 = cci("NM_EXTDATA1", "NM_EXTDATA1", null, null, Long.class, "nmExtdata1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata2 = cci("NM_EXTDATA2", "NM_EXTDATA2", null, null, Long.class, "nmExtdata2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata3 = cci("NM_EXTDATA3", "NM_EXTDATA3", null, null, Long.class, "nmExtdata3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata1 = cci("DT_EXTDATA1", "DT_EXTDATA1", null, null, String.class, "dtExtdata1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata3 = cci("DT_EXTDATA3", "DT_EXTDATA3", null, null, String.class, "dtExtdata3", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrflexibilityproductId() { return _columnTrflexibilityproductId; }
    /**
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * SHIPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SCHDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibityno() { return _columnFlexibityno; }
    /**
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdate() { return _columnRcvdate; }
    /**
     * OWNERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercd() { return _columnOwnercd; }
    /**
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstractdatetime() { return _columnInstractdatetime; }
    /**
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvmakeflg() { return _columnRcvmakeflg; }
    /**
     * REFLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReflineno() { return _columnReflineno; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturedate() { return _columnManufacturedate; }
    /**
     * DESIGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtycase() { return _columnQtycase; }
    /**
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtybowl() { return _columnQtybowl; }
    /**
     * CASEINFOFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinfoflg() { return _columnCaseinfoflg; }
    /**
     * FACTORYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * ITEMCD_CASE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdCase() { return _columnItemcdCase; }
    /**
     * SKUCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkucd() { return _columnSkucd; }
    /**
     * DESTINATIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationcd() { return _columnDestinationcd; }
    /**
     * MANUFACTURECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturecd() { return _columnManufacturecd; }
    /**
     * ORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * MACHINENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachineno() { return _columnMachineno; }
    /**
     * CREATENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateno() { return _columnCreateno; }
    /**
     * LIMITDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * DATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatetime() { return _columnDatetime; }
    /**
     * DISTRIBUTIONCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * OPERATIONNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationnum() { return _columnOperationnum; }
    /**
     * RCVKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * FIRMCARRYNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * BATJPRODUCTIONYM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjproductionym() { return _columnBatjproductionym; }
    /**
     * COMETODATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCometodate() { return _columnCometodate; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * CARDBOARDNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardboardno() { return _columnCardboardno; }
    /**
     * RCVPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpalletno() { return _columnRcvpalletno; }
    /**
     * TAXPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxpalletno() { return _columnTaxpalletno; }
    /**
     * ITEMCD_IN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdIn() { return _columnItemcdIn; }
    /**
     * ITEMCD_WH: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdWh() { return _columnItemcdWh; }
    /**
     * DESIGNCD_IN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdIn() { return _columnDesigncdIn; }
    /**
     * DESIGNCD_WH: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdWh() { return _columnDesigncdWh; }
    /**
     * VA_EXTDATA1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * VA_EXTDATA2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata2() { return _columnVaExtdata2; }
    /**
     * VA_EXTDATA3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata3() { return _columnVaExtdata3; }
    /**
     * NV_EXTDATA1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata1() { return _columnNvExtdata1; }
    /**
     * NV_EXTDATA2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata2() { return _columnNvExtdata2; }
    /**
     * NV_EXTDATA3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata3() { return _columnNvExtdata3; }
    /**
     * NM_EXTDATA1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata1() { return _columnNmExtdata1; }
    /**
     * NM_EXTDATA2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata2() { return _columnNmExtdata2; }
    /**
     * NM_EXTDATA3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata3() { return _columnNmExtdata3; }
    /**
     * DT_EXTDATA1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata1() { return _columnDtExtdata1; }
    /**
     * DT_EXTDATA2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * DT_EXTDATA3: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata3() { return _columnDtExtdata3; }
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
        ls.add(columnTrflexibilityproductId());
        ls.add(columnSuppliercd());
        ls.add(columnShipcd());
        ls.add(columnSchdate());
        ls.add(columnFlexibityno());
        ls.add(columnTransportcd());
        ls.add(columnRcvdate());
        ls.add(columnOwnercd());
        ls.add(columnInstractdatetime());
        ls.add(columnRcvmakeflg());
        ls.add(columnReflineno());
        ls.add(columnProductCd());
        ls.add(columnManufacturedate());
        ls.add(columnDesigncd());
        ls.add(columnQtycase());
        ls.add(columnQtybowl());
        ls.add(columnCaseinfoflg());
        ls.add(columnFactorycd());
        ls.add(columnItemcdCase());
        ls.add(columnSkucd());
        ls.add(columnDestinationcd());
        ls.add(columnManufacturecd());
        ls.add(columnOrderno());
        ls.add(columnMachineno());
        ls.add(columnCreateno());
        ls.add(columnLimitdate());
        ls.add(columnDatetime());
        ls.add(columnDistributioncd());
        ls.add(columnOperationnum());
        ls.add(columnRcvkey());
        ls.add(columnFirmcarryno());
        ls.add(columnBatjproductionym());
        ls.add(columnCometodate());
        ls.add(columnReceivedate());
        ls.add(columnCardboardno());
        ls.add(columnRcvpalletno());
        ls.add(columnTaxpalletno());
        ls.add(columnItemcdIn());
        ls.add(columnItemcdWh());
        ls.add(columnDesigncdIn());
        ls.add(columnDesigncdWh());
        ls.add(columnVaExtdata1());
        ls.add(columnVaExtdata2());
        ls.add(columnVaExtdata3());
        ls.add(columnNvExtdata1());
        ls.add(columnNvExtdata2());
        ls.add(columnNvExtdata3());
        ls.add(columnNmExtdata1());
        ls.add(columnNmExtdata2());
        ls.add(columnNmExtdata3());
        ls.add(columnDtExtdata1());
        ls.add(columnDtExtdata2());
        ls.add(columnDtExtdata3());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrflexibilityproductId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrflexibilityproduct"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrflexibilityproductCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrflexibilityproductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrflexibilityproduct> getEntityType() { return TTrflexibilityproduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrflexibilityproduct newEntity() { return new TTrflexibilityproduct(); }
    public TTrflexibilityproduct newMyEntity() { return new TTrflexibilityproduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrflexibilityproduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrflexibilityproduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
