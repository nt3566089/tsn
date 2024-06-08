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
 * The DB meta of T_TRRCV. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrcvDbm _instance = new TTrrcvDbm();
    private TTrrcvDbm() {}
    public static TTrrcvDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrcv)et).getReceivePlanHId(), (et, vl) -> ((TTrrcv)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getPrekey(), (et, vl) -> ((TTrrcv)et).setPrekey(ctb(vl)), "prekey");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getTemplateflg(), (et, vl) -> ((TTrrcv)et).setTemplateflg(ctb(vl)), "templateflg");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getRcvinspectflg(), (et, vl) -> ((TTrrcv)et).setRcvinspectflg(ctb(vl)), "rcvinspectflg");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getSupplierrcvno(), (et, vl) -> ((TTrrcv)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getRmano(), (et, vl) -> ((TTrrcv)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getRcvtype(), (et, vl) -> ((TTrrcv)et).setRcvtype((String)vl), "rcvtype");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getItemcd(), (et, vl) -> ((TTrrcv)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getPartflg(), (et, vl) -> ((TTrrcv)et).setPartflg(ctb(vl)), "partflg");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getReceiveSts(), (et, vl) -> ((TTrrcv)et).setReceiveSts((String)vl), "receiveSts");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getPriorities(), (et, vl) -> ((TTrrcv)et).setPriorities(ctb(vl)), "priorities");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCompanycd(), (et, vl) -> ((TTrrcv)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getReceivedate(), (et, vl) -> ((TTrrcv)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getLogisticscd(), (et, vl) -> ((TTrrcv)et).setLogisticscd((String)vl), "logisticscd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getSuppliercd(), (et, vl) -> ((TTrrcv)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getSuppliername(), (et, vl) -> ((TTrrcv)et).setSuppliername((String)vl), "suppliername");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAddress1(), (et, vl) -> ((TTrrcv)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAddress2(), (et, vl) -> ((TTrrcv)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAddress3(), (et, vl) -> ((TTrrcv)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getPostno(), (et, vl) -> ((TTrrcv)et).setPostno((String)vl), "postno");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCountrycd(), (et, vl) -> ((TTrrcv)et).setCountrycd((String)vl), "countrycd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getPortcd(), (et, vl) -> ((TTrrcv)et).setPortcd((String)vl), "portcd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getDistrictcd(), (et, vl) -> ((TTrrcv)et).setDistrictcd((String)vl), "districtcd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getSupplierphone(), (et, vl) -> ((TTrrcv)et).setSupplierphone((String)vl), "supplierphone");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFax1(), (et, vl) -> ((TTrrcv)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getEmail(), (et, vl) -> ((TTrrcv)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getRefname(), (et, vl) -> ((TTrrcv)et).setRefname((String)vl), "refname");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromcd(), (et, vl) -> ((TTrrcv)et).setFromcd((String)vl), "fromcd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromsub(), (et, vl) -> ((TTrrcv)et).setFromsub((String)vl), "fromsub");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromname(), (et, vl) -> ((TTrrcv)et).setFromname((String)vl), "fromname");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromaddress1(), (et, vl) -> ((TTrrcv)et).setFromaddress1((String)vl), "fromaddress1");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromaddress2(), (et, vl) -> ((TTrrcv)et).setFromaddress2((String)vl), "fromaddress2");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromaddress3(), (et, vl) -> ((TTrrcv)et).setFromaddress3((String)vl), "fromaddress3");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFrompostno(), (et, vl) -> ((TTrrcv)et).setFrompostno((String)vl), "frompostno");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromcountrycd(), (et, vl) -> ((TTrrcv)et).setFromcountrycd((String)vl), "fromcountrycd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromportcd(), (et, vl) -> ((TTrrcv)et).setFromportcd((String)vl), "fromportcd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromdistrictcd(), (et, vl) -> ((TTrrcv)et).setFromdistrictcd((String)vl), "fromdistrictcd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromphone(), (et, vl) -> ((TTrrcv)et).setFromphone((String)vl), "fromphone");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromfax(), (et, vl) -> ((TTrrcv)et).setFromfax((String)vl), "fromfax");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromemail(), (et, vl) -> ((TTrrcv)et).setFromemail((String)vl), "fromemail");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFromrefname(), (et, vl) -> ((TTrrcv)et).setFromrefname((String)vl), "fromrefname");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCarriercd(), (et, vl) -> ((TTrrcv)et).setCarriercd((String)vl), "carriercd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCarriername(), (et, vl) -> ((TTrrcv)et).setCarriername((String)vl), "carriername");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCarrierwbno(), (et, vl) -> ((TTrrcv)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getDeliverycd(), (et, vl) -> ((TTrrcv)et).setDeliverycd((String)vl), "deliverycd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCarrierno(), (et, vl) -> ((TTrrcv)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCarriersname(), (et, vl) -> ((TTrrcv)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getCarrierseq(), (et, vl) -> ((TTrrcv)et).setCarrierseq(ctb(vl)), "carrierseq");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getExpectedtime(), (et, vl) -> ((TTrrcv)et).setExpectedtime((String)vl), "expectedtime");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getNotes(), (et, vl) -> ((TTrrcv)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getOtherrefno1(), (et, vl) -> ((TTrrcv)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getOtherrefno2(), (et, vl) -> ((TTrrcv)et).setOtherrefno2((String)vl), "otherrefno2");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getOtherrefno3(), (et, vl) -> ((TTrrcv)et).setOtherrefno3((String)vl), "otherrefno3");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAllocgroup(), (et, vl) -> ((TTrrcv)et).setAllocgroup((String)vl), "allocgroup");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getTracceptId(), (et, vl) -> ((TTrrcv)et).setTracceptId(ctl(vl)), "tracceptId");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAcceptusercd(), (et, vl) -> ((TTrrcv)et).setAcceptusercd((String)vl), "acceptusercd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getInspectedusercd(), (et, vl) -> ((TTrrcv)et).setInspectedusercd((String)vl), "inspectedusercd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getReceivedusercd(), (et, vl) -> ((TTrrcv)et).setReceivedusercd((String)vl), "receivedusercd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getMovekey(), (et, vl) -> ((TTrrcv)et).setMovekey(ctb(vl)), "movekey");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAssykey(), (et, vl) -> ((TTrrcv)et).setAssykey(ctb(vl)), "assykey");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getProducekey(), (et, vl) -> ((TTrrcv)et).setProducekey(ctb(vl)), "producekey");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getTerminalCd(), (et, vl) -> ((TTrrcv)et).setTerminalCd((String)vl), "terminalCd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getWarehouseCd(), (et, vl) -> ((TTrrcv)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getFcFlg(), (et, vl) -> ((TTrrcv)et).setFcFlg((String)vl), "fcFlg");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getDelFlg(), (et, vl) -> ((TTrrcv)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getVersionNo(), (et, vl) -> ((TTrrcv)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getControlNo(), (et, vl) -> ((TTrrcv)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAddDt(), (et, vl) -> ((TTrrcv)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAddUser(), (et, vl) -> ((TTrrcv)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getAddProcess(), (et, vl) -> ((TTrrcv)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getUpdDt(), (et, vl) -> ((TTrrcv)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getUpdUser(), (et, vl) -> ((TTrrcv)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrcv)et).getUpdProcess(), (et, vl) -> ((TTrrcv)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrrcv)et).getTReceivePlanH(), (et, vl) -> ((TTrrcv)et).setTReceivePlanH((TReceivePlanH)vl), "TReceivePlanH");
        setupEfpg(_efpgMap, et -> ((TTrrcv)et).getTTrrcvextendAsOne(), (et, vl) -> ((TTrrcv)et).setTTrrcvextendAsOne((TTrrcvextend)vl), "TTrrcvextendAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRRCV";
    protected final String _tableDispName = "T_TRRCV";
    protected final String _tablePropertyName = "TTrrcv";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRRCV", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, "TReceivePlanH,TTrrcvextendAsOne", "TTrrcvdetailList", null, false);
    protected final ColumnInfo _columnPrekey = cci("PREKEY", "PREKEY", null, null, java.math.BigDecimal.class, "prekey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemplateflg = cci("TEMPLATEFLG", "TEMPLATEFLG", null, null, java.math.BigDecimal.class, "templateflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvinspectflg = cci("RCVINSPECTFLG", "RCVINSPECTFLG", null, null, java.math.BigDecimal.class, "rcvinspectflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtype = cci("RCVTYPE", "RCVTYPE", null, null, String.class, "rcvtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPartflg = cci("PARTFLG", "PARTFLG", null, null, java.math.BigDecimal.class, "partflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveSts = cci("RECEIVE_STS", "RECEIVE_STS", null, null, String.class, "receiveSts", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriorities = cci("PRIORITIES", "PRIORITIES", null, null, java.math.BigDecimal.class, "priorities", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogisticscd = cci("LOGISTICSCD", "LOGISTICSCD", null, null, String.class, "logisticscd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnFromsub = cci("FROMSUB", "FROMSUB", null, null, String.class, "fromsub", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromname = cci("FROMNAME", "FROMNAME", null, null, String.class, "fromname", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierseq = cci("CARRIERSEQ", "CARRIERSEQ", null, null, java.math.BigDecimal.class, "carrierseq", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectedtime = cci("EXPECTEDTIME", "EXPECTEDTIME", null, null, String.class, "expectedtime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno2 = cci("OTHERREFNO2", "OTHERREFNO2", null, null, String.class, "otherrefno2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno3 = cci("OTHERREFNO3", "OTHERREFNO3", null, null, String.class, "otherrefno3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocgroup = cci("ALLOCGROUP", "ALLOCGROUP", null, null, String.class, "allocgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracceptId = cci("TRACCEPT_ID", "TRACCEPT_ID", null, null, Long.class, "tracceptId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptusercd = cci("ACCEPTUSERCD", "ACCEPTUSERCD", null, null, String.class, "acceptusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedusercd = cci("INSPECTEDUSERCD", "INSPECTEDUSERCD", null, null, String.class, "inspectedusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedusercd = cci("RECEIVEDUSERCD", "RECEIVEDUSERCD", null, null, String.class, "receivedusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMovekey = cci("MOVEKEY", "MOVEKEY", null, null, java.math.BigDecimal.class, "movekey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssykey = cci("ASSYKEY", "ASSYKEY", null, null, java.math.BigDecimal.class, "assykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProducekey = cci("PRODUCEKEY", "PRODUCEKEY", null, null, java.math.BigDecimal.class, "producekey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTerminalCd = cci("TERMINAL_CD", "TERMINAL_CD", null, null, String.class, "terminalCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFcFlg = cci("FC_FLG", "FC_FLG", null, null, String.class, "fcFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_H_ID: {PK, IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * PREKEY: {IX, decimal(16, 6)}
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
     * ITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
    /**
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartflg() { return _columnPartflg; }
    /**
     * RECEIVE_STS: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveSts() { return _columnReceiveSts; }
    /**
     * PRIORITIES: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriorities() { return _columnPriorities; }
    /**
     * COMPANYCD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * RECEIVEDATE: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogisticscd() { return _columnLogisticscd; }
    /**
     * SUPPLIERCD: {IX, varchar(30)}
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
     * FROMSUB: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromsub() { return _columnFromsub; }
    /**
     * FROMNAME: {NotNull, char(1), default=[0]}
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
     * CARRIERWBNO: {IX+, varchar(60)}
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
     * CARRIERSNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * CARRIERSEQ: {decimal(16, 6), default=[(0)]}
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
     * TRACCEPT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracceptId() { return _columnTracceptId; }
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
     * MOVEKEY: {IX, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMovekey() { return _columnMovekey; }
    /**
     * ASSYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssykey() { return _columnAssykey; }
    /**
     * PRODUCEKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProducekey() { return _columnProducekey; }
    /**
     * TERMINAL_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTerminalCd() { return _columnTerminalCd; }
    /**
     * WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * FC_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFcFlg() { return _columnFcFlg; }
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
        ls.add(columnReceivePlanHId());
        ls.add(columnPrekey());
        ls.add(columnTemplateflg());
        ls.add(columnRcvinspectflg());
        ls.add(columnSupplierrcvno());
        ls.add(columnRmano());
        ls.add(columnRcvtype());
        ls.add(columnItemcd());
        ls.add(columnPartflg());
        ls.add(columnReceiveSts());
        ls.add(columnPriorities());
        ls.add(columnCompanycd());
        ls.add(columnReceivedate());
        ls.add(columnLogisticscd());
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
        ls.add(columnTracceptId());
        ls.add(columnAcceptusercd());
        ls.add(columnInspectedusercd());
        ls.add(columnReceivedusercd());
        ls.add(columnMovekey());
        ls.add(columnAssykey());
        ls.add(columnProducekey());
        ls.add(columnTerminalCd());
        ls.add(columnWarehouseCd());
        ls.add(columnFcFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanHId()); }
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
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanHDbm.getInstance().columnReceivePlanHId());
        return cfi("T_TRRCV_FK1", "TReceivePlanH", this, TReceivePlanHDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TTrrcvAsOne", false);
    }
    /**
     * T_TRRCVEXTEND by RECEIVE_PLAN_H_ID, named 'TTrrcvextendAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTTrrcvextendAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TTrrcvextendDbm.getInstance().columnReceivePlanHId());
        return cfi("T_TRRCVEXTEND_FK1", "TTrrcvextendAsOne", this, TTrrcvextendDbm.getInstance(), mp, 1, null, true, false, true, false, null, null, false, "TTrrcv", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_TRRCVDETAIL by RECEIVE_PLAN_H_ID, named 'TTrrcvdetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrrcvdetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TTrrcvdetailDbm.getInstance().columnReceivePlanHId());
        return cri("T_TRRCVDETAIL_FK2", "TTrrcvdetailList", this, TTrrcvdetailDbm.getInstance(), mp, false, "TTrrcv");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrcv"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrcvCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrcvBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrcv> getEntityType() { return TTrrcv.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrcv newEntity() { return new TTrrcv(); }
    public TTrrcv newMyEntity() { return new TTrrcv(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrcv)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrcv)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
