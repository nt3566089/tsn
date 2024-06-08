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
 * The DB meta of T_TRSREPLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsreplanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsreplanDbm _instance = new TTrsreplanDbm();
    private TTrsreplanDbm() {}
    public static TTrsreplanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getTrsreplanId(), (et, vl) -> ((TTrsreplan)et).setTrsreplanId(ctl(vl)), "trsreplanId");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getPrekey(), (et, vl) -> ((TTrsreplan)et).setPrekey(ctb(vl)), "prekey");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getTemplateflg(), (et, vl) -> ((TTrsreplan)et).setTemplateflg(ctb(vl)), "templateflg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getRcvinspectflg(), (et, vl) -> ((TTrsreplan)et).setRcvinspectflg(ctb(vl)), "rcvinspectflg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSupplierrcvno(), (et, vl) -> ((TTrsreplan)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getRmano(), (et, vl) -> ((TTrsreplan)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getRcvtype(), (et, vl) -> ((TTrsreplan)et).setRcvtype((String)vl), "rcvtype");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getPartflg(), (et, vl) -> ((TTrsreplan)et).setPartflg(ctb(vl)), "partflg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getActflg(), (et, vl) -> ((TTrsreplan)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSts(), (et, vl) -> ((TTrsreplan)et).setSts(ctl(vl)), "sts");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getPriorities(), (et, vl) -> ((TTrsreplan)et).setPriorities(ctb(vl)), "priorities");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCompanycd(), (et, vl) -> ((TTrsreplan)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getRcvschdate(), (et, vl) -> ((TTrsreplan)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getReceivedate(), (et, vl) -> ((TTrsreplan)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getLogisticscd(), (et, vl) -> ((TTrsreplan)et).setLogisticscd((String)vl), "logisticscd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getWarehousecd(), (et, vl) -> ((TTrsreplan)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSuppliercd(), (et, vl) -> ((TTrsreplan)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSuppliername(), (et, vl) -> ((TTrsreplan)et).setSuppliername((String)vl), "suppliername");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAddress1(), (et, vl) -> ((TTrsreplan)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAddress2(), (et, vl) -> ((TTrsreplan)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAddress3(), (et, vl) -> ((TTrsreplan)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getPostno(), (et, vl) -> ((TTrsreplan)et).setPostno((String)vl), "postno");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCountrycd(), (et, vl) -> ((TTrsreplan)et).setCountrycd((String)vl), "countrycd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getPortcd(), (et, vl) -> ((TTrsreplan)et).setPortcd((String)vl), "portcd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getDistrictcd(), (et, vl) -> ((TTrsreplan)et).setDistrictcd((String)vl), "districtcd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSupplierphone(), (et, vl) -> ((TTrsreplan)et).setSupplierphone((String)vl), "supplierphone");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFax1(), (et, vl) -> ((TTrsreplan)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getEmail(), (et, vl) -> ((TTrsreplan)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getRefname(), (et, vl) -> ((TTrsreplan)et).setRefname((String)vl), "refname");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromcd(), (et, vl) -> ((TTrsreplan)et).setFromcd((String)vl), "fromcd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromsub(), (et, vl) -> ((TTrsreplan)et).setFromsub((String)vl), "fromsub");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromname(), (et, vl) -> ((TTrsreplan)et).setFromname((String)vl), "fromname");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromaddress1(), (et, vl) -> ((TTrsreplan)et).setFromaddress1((String)vl), "fromaddress1");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromaddress2(), (et, vl) -> ((TTrsreplan)et).setFromaddress2((String)vl), "fromaddress2");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromaddress3(), (et, vl) -> ((TTrsreplan)et).setFromaddress3((String)vl), "fromaddress3");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFrompostno(), (et, vl) -> ((TTrsreplan)et).setFrompostno((String)vl), "frompostno");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromcountrycd(), (et, vl) -> ((TTrsreplan)et).setFromcountrycd((String)vl), "fromcountrycd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromportcd(), (et, vl) -> ((TTrsreplan)et).setFromportcd((String)vl), "fromportcd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromdistrictcd(), (et, vl) -> ((TTrsreplan)et).setFromdistrictcd((String)vl), "fromdistrictcd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromphone(), (et, vl) -> ((TTrsreplan)et).setFromphone((String)vl), "fromphone");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromfax(), (et, vl) -> ((TTrsreplan)et).setFromfax((String)vl), "fromfax");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromemail(), (et, vl) -> ((TTrsreplan)et).setFromemail((String)vl), "fromemail");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getFromrefname(), (et, vl) -> ((TTrsreplan)et).setFromrefname((String)vl), "fromrefname");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCarriercd(), (et, vl) -> ((TTrsreplan)et).setCarriercd((String)vl), "carriercd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCarriername(), (et, vl) -> ((TTrsreplan)et).setCarriername((String)vl), "carriername");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCarrierwbno(), (et, vl) -> ((TTrsreplan)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getDeliverycd(), (et, vl) -> ((TTrsreplan)et).setDeliverycd((String)vl), "deliverycd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCarrierno(), (et, vl) -> ((TTrsreplan)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCarriersname(), (et, vl) -> ((TTrsreplan)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCarrierseq(), (et, vl) -> ((TTrsreplan)et).setCarrierseq(ctb(vl)), "carrierseq");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getExpectedtime(), (et, vl) -> ((TTrsreplan)et).setExpectedtime((String)vl), "expectedtime");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getNotes(), (et, vl) -> ((TTrsreplan)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getOtherrefno1(), (et, vl) -> ((TTrsreplan)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getOtherrefno2(), (et, vl) -> ((TTrsreplan)et).setOtherrefno2((String)vl), "otherrefno2");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getOtherrefno3(), (et, vl) -> ((TTrsreplan)et).setOtherrefno3((String)vl), "otherrefno3");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAllocgroup(), (et, vl) -> ((TTrsreplan)et).setAllocgroup((String)vl), "allocgroup");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAcceptkey(), (et, vl) -> ((TTrsreplan)et).setAcceptkey(ctb(vl)), "acceptkey");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAcceptusercd(), (et, vl) -> ((TTrsreplan)et).setAcceptusercd((String)vl), "acceptusercd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getInspectedusercd(), (et, vl) -> ((TTrsreplan)et).setInspectedusercd((String)vl), "inspectedusercd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getReceivedusercd(), (et, vl) -> ((TTrsreplan)et).setReceivedusercd((String)vl), "receivedusercd");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getMovekey(), (et, vl) -> ((TTrsreplan)et).setMovekey(ctb(vl)), "movekey");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAssykey(), (et, vl) -> ((TTrsreplan)et).setAssykey(ctb(vl)), "assykey");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getProducekey(), (et, vl) -> ((TTrsreplan)et).setProducekey(ctl(vl)), "producekey");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSyhnKbn(), (et, vl) -> ((TTrsreplan)et).setSyhnKbn((String)vl), "syhnKbn");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCggdid(), (et, vl) -> ((TTrsreplan)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getConfirmedFlg(), (et, vl) -> ((TTrsreplan)et).setConfirmedFlg((String)vl), "confirmedFlg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getSufferUsageFlg(), (et, vl) -> ((TTrsreplan)et).setSufferUsageFlg((String)vl), "sufferUsageFlg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getCenterId(), (et, vl) -> ((TTrsreplan)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getClientId(), (et, vl) -> ((TTrsreplan)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getDelFlg(), (et, vl) -> ((TTrsreplan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getVersionNo(), (et, vl) -> ((TTrsreplan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getControlNo(), (et, vl) -> ((TTrsreplan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAddDt(), (et, vl) -> ((TTrsreplan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAddUser(), (et, vl) -> ((TTrsreplan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getAddProcess(), (et, vl) -> ((TTrsreplan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getUpdDt(), (et, vl) -> ((TTrsreplan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getUpdUser(), (et, vl) -> ((TTrsreplan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsreplan)et).getUpdProcess(), (et, vl) -> ((TTrsreplan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSREPLAN";
    protected final String _tableDispName = "T_TRSREPLAN";
    protected final String _tablePropertyName = "TTrsreplan";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSREPLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsreplanId = cci("TRSREPLAN_ID", "TRSREPLAN_ID", null, null, Long.class, "trsreplanId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrekey = cci("PREKEY", "PREKEY", null, null, java.math.BigDecimal.class, "prekey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemplateflg = cci("TEMPLATEFLG", "TEMPLATEFLG", null, null, java.math.BigDecimal.class, "templateflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvinspectflg = cci("RCVINSPECTFLG", "RCVINSPECTFLG", null, null, java.math.BigDecimal.class, "rcvinspectflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtype = cci("RCVTYPE", "RCVTYPE", null, null, String.class, "rcvtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPartflg = cci("PARTFLG", "PARTFLG", null, null, java.math.BigDecimal.class, "partflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, Long.class, "sts", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriorities = cci("PRIORITIES", "PRIORITIES", null, null, java.math.BigDecimal.class, "priorities", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogisticscd = cci("LOGISTICSCD", "LOGISTICSCD", null, null, String.class, "logisticscd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliername = cci("SUPPLIERNAME", "SUPPLIERNAME", null, null, String.class, "suppliername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostno = cci("POSTNO", "POSTNO", null, null, String.class, "postno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountrycd = cci("COUNTRYCD", "COUNTRYCD", null, null, String.class, "countrycd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPortcd = cci("PORTCD", "PORTCD", null, null, String.class, "portcd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistrictcd = cci("DISTRICTCD", "DISTRICTCD", null, null, String.class, "districtcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierphone = cci("SUPPLIERPHONE", "SUPPLIERPHONE", null, null, String.class, "supplierphone", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("EMAIL", "EMAIL", null, null, String.class, "email", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefname = cci("REFNAME", "REFNAME", null, null, String.class, "refname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromcd = cci("FROMCD", "FROMCD", null, null, String.class, "fromcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromsub = cci("FROMSUB", "FROMSUB", null, null, String.class, "fromsub", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromname = cci("FROMNAME", "FROMNAME", null, null, String.class, "fromname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromaddress1 = cci("FROMADDRESS1", "FROMADDRESS1", null, null, String.class, "fromaddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromaddress2 = cci("FROMADDRESS2", "FROMADDRESS2", null, null, String.class, "fromaddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromaddress3 = cci("FROMADDRESS3", "FROMADDRESS3", null, null, String.class, "fromaddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFrompostno = cci("FROMPOSTNO", "FROMPOSTNO", null, null, String.class, "frompostno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromcountrycd = cci("FROMCOUNTRYCD", "FROMCOUNTRYCD", null, null, String.class, "fromcountrycd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromportcd = cci("FROMPORTCD", "FROMPORTCD", null, null, String.class, "fromportcd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromdistrictcd = cci("FROMDISTRICTCD", "FROMDISTRICTCD", null, null, String.class, "fromdistrictcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromphone = cci("FROMPHONE", "FROMPHONE", null, null, String.class, "fromphone", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromfax = cci("FROMFAX", "FROMFAX", null, null, String.class, "fromfax", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromemail = cci("FROMEMAIL", "FROMEMAIL", null, null, String.class, "fromemail", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromrefname = cci("FROMREFNAME", "FROMREFNAME", null, null, String.class, "fromrefname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriercd = cci("CARRIERCD", "CARRIERCD", null, null, String.class, "carriercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriername = cci("CARRIERNAME", "CARRIERNAME", null, null, String.class, "carriername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverycd = cci("DELIVERYCD", "DELIVERYCD", null, null, String.class, "deliverycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierseq = cci("CARRIERSEQ", "CARRIERSEQ", null, null, java.math.BigDecimal.class, "carrierseq", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectedtime = cci("EXPECTEDTIME", "EXPECTEDTIME", null, null, String.class, "expectedtime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno2 = cci("OTHERREFNO2", "OTHERREFNO2", null, null, String.class, "otherrefno2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno3 = cci("OTHERREFNO3", "OTHERREFNO3", null, null, String.class, "otherrefno3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocgroup = cci("ALLOCGROUP", "ALLOCGROUP", null, null, String.class, "allocgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptkey = cci("ACCEPTKEY", "ACCEPTKEY", null, null, java.math.BigDecimal.class, "acceptkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptusercd = cci("ACCEPTUSERCD", "ACCEPTUSERCD", null, null, String.class, "acceptusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedusercd = cci("INSPECTEDUSERCD", "INSPECTEDUSERCD", null, null, String.class, "inspectedusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedusercd = cci("RECEIVEDUSERCD", "RECEIVEDUSERCD", null, null, String.class, "receivedusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMovekey = cci("MOVEKEY", "MOVEKEY", null, null, java.math.BigDecimal.class, "movekey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssykey = cci("ASSYKEY", "ASSYKEY", null, null, java.math.BigDecimal.class, "assykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProducekey = cci("PRODUCEKEY", "PRODUCEKEY", null, null, Long.class, "producekey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSyhnKbn = cci("SYHN_KBN", "SYHN_KBN", null, null, String.class, "syhnKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConfirmedFlg = cci("CONFIRMED_FLG", "CONFIRMED_FLG", null, null, String.class, "confirmedFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSufferUsageFlg = cci("SUFFER_USAGE_FLG", "SUFFER_USAGE_FLG", null, null, String.class, "sufferUsageFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsreplanId() { return _columnTrsreplanId; }
    /**
     * PREKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrekey() { return _columnPrekey; }
    /**
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemplateflg() { return _columnTemplateflg; }
    /**
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvinspectflg() { return _columnRcvinspectflg; }
    /**
     * SUPPLIERRCVNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * RCVTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvtype() { return _columnRcvtype; }
    /**
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartflg() { return _columnPartflg; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
    /**
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * PRIORITIES: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriorities() { return _columnPriorities; }
    /**
     * COMPANYCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * RCVSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvschdate() { return _columnRcvschdate; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogisticscd() { return _columnLogisticscd; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * SUPPLIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * SUPPLIERNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliername() { return _columnSuppliername; }
    /**
     * ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * POSTNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostno() { return _columnPostno; }
    /**
     * COUNTRYCD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountrycd() { return _columnCountrycd; }
    /**
     * PORTCD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPortcd() { return _columnPortcd; }
    /**
     * DISTRICTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistrictcd() { return _columnDistrictcd; }
    /**
     * SUPPLIERPHONE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierphone() { return _columnSupplierphone; }
    /**
     * FAX1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * EMAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * REFNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefname() { return _columnRefname; }
    /**
     * FROMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromcd() { return _columnFromcd; }
    /**
     * FROMSUB: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromsub() { return _columnFromsub; }
    /**
     * FROMNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromname() { return _columnFromname; }
    /**
     * FROMADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromaddress1() { return _columnFromaddress1; }
    /**
     * FROMADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromaddress2() { return _columnFromaddress2; }
    /**
     * FROMADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromaddress3() { return _columnFromaddress3; }
    /**
     * FROMPOSTNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFrompostno() { return _columnFrompostno; }
    /**
     * FROMCOUNTRYCD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromcountrycd() { return _columnFromcountrycd; }
    /**
     * FROMPORTCD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromportcd() { return _columnFromportcd; }
    /**
     * FROMDISTRICTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromdistrictcd() { return _columnFromdistrictcd; }
    /**
     * FROMPHONE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromphone() { return _columnFromphone; }
    /**
     * FROMFAX: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromfax() { return _columnFromfax; }
    /**
     * FROMEMAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromemail() { return _columnFromemail; }
    /**
     * FROMREFNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromrefname() { return _columnFromrefname; }
    /**
     * CARRIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriercd() { return _columnCarriercd; }
    /**
     * CARRIERNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriername() { return _columnCarriername; }
    /**
     * CARRIERWBNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * DELIVERYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverycd() { return _columnDeliverycd; }
    /**
     * CARRIERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * CARRIERSEQ: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierseq() { return _columnCarrierseq; }
    /**
     * EXPECTEDTIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectedtime() { return _columnExpectedtime; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * OTHERREFNO1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * OTHERREFNO2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno2() { return _columnOtherrefno2; }
    /**
     * OTHERREFNO3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno3() { return _columnOtherrefno3; }
    /**
     * ALLOCGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocgroup() { return _columnAllocgroup; }
    /**
     * ACCEPTKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptkey() { return _columnAcceptkey; }
    /**
     * ACCEPTUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptusercd() { return _columnAcceptusercd; }
    /**
     * INSPECTEDUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedusercd() { return _columnInspectedusercd; }
    /**
     * RECEIVEDUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedusercd() { return _columnReceivedusercd; }
    /**
     * MOVEKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMovekey() { return _columnMovekey; }
    /**
     * ASSYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssykey() { return _columnAssykey; }
    /**
     * PRODUCEKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProducekey() { return _columnProducekey; }
    /**
     * SYHN_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSyhnKbn() { return _columnSyhnKbn; }
    /**
     * CGGDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * CONFIRMED_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConfirmedFlg() { return _columnConfirmedFlg; }
    /**
     * SUFFER_USAGE_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSufferUsageFlg() { return _columnSufferUsageFlg; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnTrsreplanId());
        ls.add(columnPrekey());
        ls.add(columnTemplateflg());
        ls.add(columnRcvinspectflg());
        ls.add(columnSupplierrcvno());
        ls.add(columnRmano());
        ls.add(columnRcvtype());
        ls.add(columnPartflg());
        ls.add(columnActflg());
        ls.add(columnSts());
        ls.add(columnPriorities());
        ls.add(columnCompanycd());
        ls.add(columnRcvschdate());
        ls.add(columnReceivedate());
        ls.add(columnLogisticscd());
        ls.add(columnWarehousecd());
        ls.add(columnSuppliercd());
        ls.add(columnSuppliername());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnPostno());
        ls.add(columnCountrycd());
        ls.add(columnPortcd());
        ls.add(columnDistrictcd());
        ls.add(columnSupplierphone());
        ls.add(columnFax1());
        ls.add(columnEmail());
        ls.add(columnRefname());
        ls.add(columnFromcd());
        ls.add(columnFromsub());
        ls.add(columnFromname());
        ls.add(columnFromaddress1());
        ls.add(columnFromaddress2());
        ls.add(columnFromaddress3());
        ls.add(columnFrompostno());
        ls.add(columnFromcountrycd());
        ls.add(columnFromportcd());
        ls.add(columnFromdistrictcd());
        ls.add(columnFromphone());
        ls.add(columnFromfax());
        ls.add(columnFromemail());
        ls.add(columnFromrefname());
        ls.add(columnCarriercd());
        ls.add(columnCarriername());
        ls.add(columnCarrierwbno());
        ls.add(columnDeliverycd());
        ls.add(columnCarrierno());
        ls.add(columnCarriersname());
        ls.add(columnCarrierseq());
        ls.add(columnExpectedtime());
        ls.add(columnNotes());
        ls.add(columnOtherrefno1());
        ls.add(columnOtherrefno2());
        ls.add(columnOtherrefno3());
        ls.add(columnAllocgroup());
        ls.add(columnAcceptkey());
        ls.add(columnAcceptusercd());
        ls.add(columnInspectedusercd());
        ls.add(columnReceivedusercd());
        ls.add(columnMovekey());
        ls.add(columnAssykey());
        ls.add(columnProducekey());
        ls.add(columnSyhnKbn());
        ls.add(columnCggdid());
        ls.add(columnConfirmedFlg());
        ls.add(columnSufferUsageFlg());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrsreplanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsreplan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsreplanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsreplanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsreplan> getEntityType() { return TTrsreplan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsreplan newEntity() { return new TTrsreplan(); }
    public TTrsreplan newMyEntity() { return new TTrsreplan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsreplan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsreplan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
