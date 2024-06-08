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
 * The DB meta of T_TRSO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsoDbm _instance = new TTrsoDbm();
    private TTrsoDbm() {}
    public static TTrsoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrso)et).getSoid(), (et, vl) -> ((TTrso)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrso)et).getSokey(), (et, vl) -> ((TTrso)et).setSokey(ctl(vl)), "sokey");
        setupEpg(_epgMap, et -> ((TTrso)et).getOwnersono(), (et, vl) -> ((TTrso)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((TTrso)et).getPreownersono(), (et, vl) -> ((TTrso)et).setPreownersono((String)vl), "preownersono");
        setupEpg(_epgMap, et -> ((TTrso)et).getSotype(), (et, vl) -> ((TTrso)et).setSotype((String)vl), "sotype");
        setupEpg(_epgMap, et -> ((TTrso)et).getPartflg(), (et, vl) -> ((TTrso)et).setPartflg((String)vl), "partflg");
        setupEpg(_epgMap, et -> ((TTrso)et).getSts(), (et, vl) -> ((TTrso)et).setSts((String)vl), "sts");
        setupEpg(_epgMap, et -> ((TTrso)et).getCompanycd(), (et, vl) -> ((TTrso)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((TTrso)et).getOrderkey(), (et, vl) -> ((TTrso)et).setOrderkey(ctl(vl)), "orderkey");
        setupEpg(_epgMap, et -> ((TTrso)et).getOwnerorderno(), (et, vl) -> ((TTrso)et).setOwnerorderno((String)vl), "ownerorderno");
        setupEpg(_epgMap, et -> ((TTrso)et).getOrdertype(), (et, vl) -> ((TTrso)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((TTrso)et).getCustorderno(), (et, vl) -> ((TTrso)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((TTrso)et).getCustomerCd(), (et, vl) -> ((TTrso)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((TTrso)et).getRmano(), (et, vl) -> ((TTrso)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((TTrso)et).getOrderdate(), (et, vl) -> ((TTrso)et).setOrderdate((String)vl), "orderdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getShipschdate(), (et, vl) -> ((TTrso)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getShipdate(), (et, vl) -> ((TTrso)et).setShipdate((String)vl), "shipdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getDelivschdate(), (et, vl) -> ((TTrso)et).setDelivschdate((String)vl), "delivschdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getDelivdate(), (et, vl) -> ((TTrso)et).setDelivdate((String)vl), "delivdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarryschdate(), (et, vl) -> ((TTrso)et).setCarryschdate((String)vl), "carryschdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarryoutdate(), (et, vl) -> ((TTrso)et).setCarryoutdate((String)vl), "carryoutdate");
        setupEpg(_epgMap, et -> ((TTrso)et).getTransportpriority(), (et, vl) -> ((TTrso)et).setTransportpriority(ctb(vl)), "transportpriority");
        setupEpg(_epgMap, et -> ((TTrso)et).getShiptocd(), (et, vl) -> ((TTrso)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((TTrso)et).getShiptosub(), (et, vl) -> ((TTrso)et).setShiptosub((String)vl), "shiptosub");
        setupEpg(_epgMap, et -> ((TTrso)et).getDelivname(), (et, vl) -> ((TTrso)et).setDelivname((String)vl), "delivname");
        setupEpg(_epgMap, et -> ((TTrso)et).getAddress1(), (et, vl) -> ((TTrso)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((TTrso)et).getAddress2(), (et, vl) -> ((TTrso)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((TTrso)et).getAddress3(), (et, vl) -> ((TTrso)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((TTrso)et).getPostno(), (et, vl) -> ((TTrso)et).setPostno((String)vl), "postno");
        setupEpg(_epgMap, et -> ((TTrso)et).getCountrycd(), (et, vl) -> ((TTrso)et).setCountrycd((String)vl), "countrycd");
        setupEpg(_epgMap, et -> ((TTrso)et).getPortcd(), (et, vl) -> ((TTrso)et).setPortcd((String)vl), "portcd");
        setupEpg(_epgMap, et -> ((TTrso)et).getDistrictcd(), (et, vl) -> ((TTrso)et).setDistrictcd((String)vl), "districtcd");
        setupEpg(_epgMap, et -> ((TTrso)et).getPhoneno(), (et, vl) -> ((TTrso)et).setPhoneno((String)vl), "phoneno");
        setupEpg(_epgMap, et -> ((TTrso)et).getFax1(), (et, vl) -> ((TTrso)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((TTrso)et).getEmail(), (et, vl) -> ((TTrso)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((TTrso)et).getRefname(), (et, vl) -> ((TTrso)et).setRefname((String)vl), "refname");
        setupEpg(_epgMap, et -> ((TTrso)et).getAreacd(), (et, vl) -> ((TTrso)et).setAreacd((String)vl), "areacd");
        setupEpg(_epgMap, et -> ((TTrso)et).getAllocgroup(), (et, vl) -> ((TTrso)et).setAllocgroup((String)vl), "allocgroup");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarriercd(), (et, vl) -> ((TTrso)et).setCarriercd((String)vl), "carriercd");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarriername(), (et, vl) -> ((TTrso)et).setCarriername((String)vl), "carriername");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarrierwbno(), (et, vl) -> ((TTrso)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((TTrso)et).getDeliverycd(), (et, vl) -> ((TTrso)et).setDeliverycd((String)vl), "deliverycd");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarrierno(), (et, vl) -> ((TTrso)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarriersname(), (et, vl) -> ((TTrso)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarcd(), (et, vl) -> ((TTrso)et).setCarcd((String)vl), "carcd");
        setupEpg(_epgMap, et -> ((TTrso)et).getCarrierseq(), (et, vl) -> ((TTrso)et).setCarrierseq(ctl(vl)), "carrierseq");
        setupEpg(_epgMap, et -> ((TTrso)et).getItemcd(), (et, vl) -> ((TTrso)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((TTrso)et).getNotes(), (et, vl) -> ((TTrso)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrso)et).getOtherrefno1(), (et, vl) -> ((TTrso)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((TTrso)et).getOtherrefno2(), (et, vl) -> ((TTrso)et).setOtherrefno2((String)vl), "otherrefno2");
        setupEpg(_epgMap, et -> ((TTrso)et).getOtherrefno3(), (et, vl) -> ((TTrso)et).setOtherrefno3((String)vl), "otherrefno3");
        setupEpg(_epgMap, et -> ((TTrso)et).getPickingInstId(), (et, vl) -> ((TTrso)et).setPickingInstId(ctl(vl)), "pickingInstId");
        setupEpg(_epgMap, et -> ((TTrso)et).getExeckey(), (et, vl) -> ((TTrso)et).setExeckey(ctl(vl)), "execkey");
        setupEpg(_epgMap, et -> ((TTrso)et).getCenterId(), (et, vl) -> ((TTrso)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrso)et).getClientId(), (et, vl) -> ((TTrso)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrso)et).getDelFlg(), (et, vl) -> ((TTrso)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrso)et).getVersionNo(), (et, vl) -> ((TTrso)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrso)et).getControlNo(), (et, vl) -> ((TTrso)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrso)et).getAddDt(), (et, vl) -> ((TTrso)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrso)et).getAddUser(), (et, vl) -> ((TTrso)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrso)et).getAddProcess(), (et, vl) -> ((TTrso)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrso)et).getUpdDt(), (et, vl) -> ((TTrso)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrso)et).getUpdUser(), (et, vl) -> ((TTrso)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrso)et).getUpdProcess(), (et, vl) -> ((TTrso)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSO";
    protected final String _tableDispName = "T_TRSO";
    protected final String _tablePropertyName = "TTrso";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSokey = cci("SOKEY", "SOKEY", null, null, Long.class, "sokey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPreownersono = cci("PREOWNERSONO", "PREOWNERSONO", null, null, String.class, "preownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotype = cci("SOTYPE", "SOTYPE", null, null, String.class, "sotype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPartflg = cci("PARTFLG", "PARTFLG", null, null, String.class, "partflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, String.class, "sts", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderkey = cci("ORDERKEY", "ORDERKEY", null, null, Long.class, "orderkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderno = cci("OWNERORDERNO", "OWNERORDERNO", null, null, String.class, "ownerorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderdate = cci("ORDERDATE", "ORDERDATE", null, null, String.class, "orderdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipdate = cci("SHIPDATE", "SHIPDATE", null, null, String.class, "shipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivschdate = cci("DELIVSCHDATE", "DELIVSCHDATE", null, null, String.class, "delivschdate", null, false, false, false, "varchar", 8, 0, null, "sysdatetime()", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivdate = cci("DELIVDATE", "DELIVDATE", null, null, String.class, "delivdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarryschdate = cci("CARRYSCHDATE", "CARRYSCHDATE", null, null, String.class, "carryschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarryoutdate = cci("CARRYOUTDATE", "CARRYOUTDATE", null, null, String.class, "carryoutdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptosub = cci("SHIPTOSUB", "SHIPTOSUB", null, null, String.class, "shiptosub", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivname = cci("DELIVNAME", "DELIVNAME", null, null, String.class, "delivname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostno = cci("POSTNO", "POSTNO", null, null, String.class, "postno", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountrycd = cci("COUNTRYCD", "COUNTRYCD", null, null, String.class, "countrycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPortcd = cci("PORTCD", "PORTCD", null, null, String.class, "portcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistrictcd = cci("DISTRICTCD", "DISTRICTCD", null, null, String.class, "districtcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneno = cci("PHONENO", "PHONENO", null, null, String.class, "phoneno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("EMAIL", "EMAIL", null, null, String.class, "email", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefname = cci("REFNAME", "REFNAME", null, null, String.class, "refname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAreacd = cci("AREACD", "AREACD", null, null, String.class, "areacd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocgroup = cci("ALLOCGROUP", "ALLOCGROUP", null, null, String.class, "allocgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriercd = cci("CARRIERCD", "CARRIERCD", null, null, String.class, "carriercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriername = cci("CARRIERNAME", "CARRIERNAME", null, null, String.class, "carriername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverycd = cci("DELIVERYCD", "DELIVERYCD", null, null, String.class, "deliverycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarcd = cci("CARCD", "CARCD", null, null, String.class, "carcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierseq = cci("CARRIERSEQ", "CARRIERSEQ", null, null, Long.class, "carrierseq", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno2 = cci("OTHERREFNO2", "OTHERREFNO2", null, null, String.class, "otherrefno2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno3 = cci("OTHERREFNO3", "OTHERREFNO3", null, null, String.class, "otherrefno3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingInstId = cci("PICKING_INST_ID", "PICKING_INST_ID", null, null, Long.class, "pickingInstId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExeckey = cci("EXECKEY", "EXECKEY", null, null, Long.class, "execkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * SOKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSokey() { return _columnSokey; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * PREOWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPreownersono() { return _columnPreownersono; }
    /**
     * SOTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotype() { return _columnSotype; }
    /**
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartflg() { return _columnPartflg; }
    /**
     * STS: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * COMPANYCD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * ORDERKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderkey() { return _columnOrderkey; }
    /**
     * OWNERORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderno() { return _columnOwnerorderno; }
    /**
     * ORDERTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * CUSTORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
    /**
     * CUSTOMER_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * ORDERDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderdate() { return _columnOrderdate; }
    /**
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * SHIPDATE: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipdate() { return _columnShipdate; }
    /**
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivschdate() { return _columnDelivschdate; }
    /**
     * DELIVDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivdate() { return _columnDelivdate; }
    /**
     * CARRYSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarryschdate() { return _columnCarryschdate; }
    /**
     * CARRYOUTDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarryoutdate() { return _columnCarryoutdate; }
    /**
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportpriority() { return _columnTransportpriority; }
    /**
     * SHIPTOCD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * SHIPTOSUB: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptosub() { return _columnShiptosub; }
    /**
     * DELIVNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivname() { return _columnDelivname; }
    /**
     * ADDRESS1: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ADDRESS2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * POSTNO: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostno() { return _columnPostno; }
    /**
     * COUNTRYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountrycd() { return _columnCountrycd; }
    /**
     * PORTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPortcd() { return _columnPortcd; }
    /**
     * DISTRICTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistrictcd() { return _columnDistrictcd; }
    /**
     * PHONENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneno() { return _columnPhoneno; }
    /**
     * FAX1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * EMAIL: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * REFNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefname() { return _columnRefname; }
    /**
     * AREACD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAreacd() { return _columnAreacd; }
    /**
     * ALLOCGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocgroup() { return _columnAllocgroup; }
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
     * DELIVERYCD: {IX, varchar(30)}
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
     * CARCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarcd() { return _columnCarcd; }
    /**
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierseq() { return _columnCarrierseq; }
    /**
     * ITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
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
     * PICKING_INST_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstId() { return _columnPickingInstId; }
    /**
     * EXECKEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExeckey() { return _columnExeckey; }
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
        ls.add(columnSoid());
        ls.add(columnSokey());
        ls.add(columnOwnersono());
        ls.add(columnPreownersono());
        ls.add(columnSotype());
        ls.add(columnPartflg());
        ls.add(columnSts());
        ls.add(columnCompanycd());
        ls.add(columnOrderkey());
        ls.add(columnOwnerorderno());
        ls.add(columnOrdertype());
        ls.add(columnCustorderno());
        ls.add(columnCustomerCd());
        ls.add(columnRmano());
        ls.add(columnOrderdate());
        ls.add(columnShipschdate());
        ls.add(columnShipdate());
        ls.add(columnDelivschdate());
        ls.add(columnDelivdate());
        ls.add(columnCarryschdate());
        ls.add(columnCarryoutdate());
        ls.add(columnTransportpriority());
        ls.add(columnShiptocd());
        ls.add(columnShiptosub());
        ls.add(columnDelivname());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnPostno());
        ls.add(columnCountrycd());
        ls.add(columnPortcd());
        ls.add(columnDistrictcd());
        ls.add(columnPhoneno());
        ls.add(columnFax1());
        ls.add(columnEmail());
        ls.add(columnRefname());
        ls.add(columnAreacd());
        ls.add(columnAllocgroup());
        ls.add(columnCarriercd());
        ls.add(columnCarriername());
        ls.add(columnCarrierwbno());
        ls.add(columnDeliverycd());
        ls.add(columnCarrierno());
        ls.add(columnCarriersname());
        ls.add(columnCarcd());
        ls.add(columnCarrierseq());
        ls.add(columnItemcd());
        ls.add(columnNotes());
        ls.add(columnOtherrefno1());
        ls.add(columnOtherrefno2());
        ls.add(columnOtherrefno3());
        ls.add(columnPickingInstId());
        ls.add(columnExeckey());
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
    protected UniqueInfo cpui() { return hpcpui(columnSoid()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrso"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrso> getEntityType() { return TTrso.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrso newEntity() { return new TTrso(); }
    public TTrso newMyEntity() { return new TTrso(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrso)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrso)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
