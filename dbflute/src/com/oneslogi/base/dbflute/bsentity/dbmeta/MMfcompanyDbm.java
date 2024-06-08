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
 * The DB meta of M_MFCOMPANY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MMfcompanyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MMfcompanyDbm _instance = new MMfcompanyDbm();
    private MMfcompanyDbm() {}
    public static MMfcompanyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MMfcompany)et).getCompanyId(), (et, vl) -> ((MMfcompany)et).setCompanyId(ctl(vl)), "companyId");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getCompanyCd(), (et, vl) -> ((MMfcompany)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getCompanygroup(), (et, vl) -> ((MMfcompany)et).setCompanygroup((String)vl), "companygroup");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getName(), (et, vl) -> ((MMfcompany)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getSname(), (et, vl) -> ((MMfcompany)et).setSname((String)vl), "sname");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAname(), (et, vl) -> ((MMfcompany)et).setAname((String)vl), "aname");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAddress1(), (et, vl) -> ((MMfcompany)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAddress2(), (et, vl) -> ((MMfcompany)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAddress3(), (et, vl) -> ((MMfcompany)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getPostno(), (et, vl) -> ((MMfcompany)et).setPostno((String)vl), "postno");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getCountrycd(), (et, vl) -> ((MMfcompany)et).setCountrycd((String)vl), "countrycd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getPortcd(), (et, vl) -> ((MMfcompany)et).setPortcd((String)vl), "portcd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getDistrictcd(), (et, vl) -> ((MMfcompany)et).setDistrictcd((String)vl), "districtcd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getPhone1(), (et, vl) -> ((MMfcompany)et).setPhone1((String)vl), "phone1");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getPhone2(), (et, vl) -> ((MMfcompany)et).setPhone2((String)vl), "phone2");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFax1(), (et, vl) -> ((MMfcompany)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFax2(), (et, vl) -> ((MMfcompany)et).setFax2((String)vl), "fax2");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getRefname(), (et, vl) -> ((MMfcompany)et).setRefname((String)vl), "refname");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getEmail(), (et, vl) -> ((MMfcompany)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getUrl(), (et, vl) -> ((MMfcompany)et).setUrl((String)vl), "url");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypeowner(), (et, vl) -> ((MMfcompany)et).setTypeowner(ctb(vl)), "typeowner");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypecustomer(), (et, vl) -> ((MMfcompany)et).setTypecustomer(ctb(vl)), "typecustomer");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypeshipto(), (et, vl) -> ((MMfcompany)et).setTypeshipto(ctb(vl)), "typeshipto");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypesupplier(), (et, vl) -> ((MMfcompany)et).setTypesupplier(ctb(vl)), "typesupplier");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypewarehouse(), (et, vl) -> ((MMfcompany)et).setTypewarehouse(ctb(vl)), "typewarehouse");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypecarrier(), (et, vl) -> ((MMfcompany)et).setTypecarrier(ctb(vl)), "typecarrier");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTypeetc(), (et, vl) -> ((MMfcompany)et).setTypeetc(ctb(vl)), "typeetc");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getOwnoranotherflg(), (et, vl) -> ((MMfcompany)et).setOwnoranotherflg(ctb(vl)), "ownoranotherflg");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getNotes(), (et, vl) -> ((MMfcompany)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFUser1(), (et, vl) -> ((MMfcompany)et).setFUser1((String)vl), "FUser1");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFUser2(), (et, vl) -> ((MMfcompany)et).setFUser2((String)vl), "FUser2");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFUser3(), (et, vl) -> ((MMfcompany)et).setFUser3((String)vl), "FUser3");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFUser4(), (et, vl) -> ((MMfcompany)et).setFUser4((String)vl), "FUser4");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getFUser5(), (et, vl) -> ((MMfcompany)et).setFUser5((String)vl), "FUser5");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getTransportpriority(), (et, vl) -> ((MMfcompany)et).setTransportpriority(ctb(vl)), "transportpriority");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getPurchasetype(), (et, vl) -> ((MMfcompany)et).setPurchasetype((String)vl), "purchasetype");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getCalendarcd(), (et, vl) -> ((MMfcompany)et).setCalendarcd((String)vl), "calendarcd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getOwnercustomercd(), (et, vl) -> ((MMfcompany)et).setOwnercustomercd((String)vl), "ownercustomercd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getOwnersuppliercd(), (et, vl) -> ((MMfcompany)et).setOwnersuppliercd((String)vl), "ownersuppliercd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getOwnerrefflg(), (et, vl) -> ((MMfcompany)et).setOwnerrefflg(ctb(vl)), "ownerrefflg");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getWarehouseFuncKbn(), (et, vl) -> ((MMfcompany)et).setWarehouseFuncKbn(ctl(vl)), "warehouseFuncKbn");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getDpcd(), (et, vl) -> ((MMfcompany)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getDelFlg(), (et, vl) -> ((MMfcompany)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getVersionNo(), (et, vl) -> ((MMfcompany)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getControlNo(), (et, vl) -> ((MMfcompany)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAddDt(), (et, vl) -> ((MMfcompany)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAddUser(), (et, vl) -> ((MMfcompany)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getAddProcess(), (et, vl) -> ((MMfcompany)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getUpdDt(), (et, vl) -> ((MMfcompany)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getUpdUser(), (et, vl) -> ((MMfcompany)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MMfcompany)et).getUpdProcess(), (et, vl) -> ((MMfcompany)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_MFCOMPANY";
    protected final String _tableDispName = "M_MFCOMPANY";
    protected final String _tablePropertyName = "MMfcompany";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_MFCOMPANY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCompanyId = cci("COMPANY_ID", "COMPANY_ID", null, null, Long.class, "companyId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanygroup = cci("COMPANYGROUP", "COMPANYGROUP", null, null, String.class, "companygroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSname = cci("SNAME", "SNAME", null, null, String.class, "sname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAname = cci("ANAME", "ANAME", null, null, String.class, "aname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostno = cci("POSTNO", "POSTNO", null, null, String.class, "postno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountrycd = cci("COUNTRYCD", "COUNTRYCD", null, null, String.class, "countrycd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPortcd = cci("PORTCD", "PORTCD", null, null, String.class, "portcd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistrictcd = cci("DISTRICTCD", "DISTRICTCD", null, null, String.class, "districtcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone1 = cci("PHONE1", "PHONE1", null, null, String.class, "phone1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone2 = cci("PHONE2", "PHONE2", null, null, String.class, "phone2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax2 = cci("FAX2", "FAX2", null, null, String.class, "fax2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefname = cci("REFNAME", "REFNAME", null, null, String.class, "refname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("EMAIL", "EMAIL", null, null, String.class, "email", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUrl = cci("URL", "URL", null, null, String.class, "url", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeowner = cci("TYPEOWNER", "TYPEOWNER", null, null, java.math.BigDecimal.class, "typeowner", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypecustomer = cci("TYPECUSTOMER", "TYPECUSTOMER", null, null, java.math.BigDecimal.class, "typecustomer", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeshipto = cci("TYPESHIPTO", "TYPESHIPTO", null, null, java.math.BigDecimal.class, "typeshipto", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypesupplier = cci("TYPESUPPLIER", "TYPESUPPLIER", null, null, java.math.BigDecimal.class, "typesupplier", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypewarehouse = cci("TYPEWAREHOUSE", "TYPEWAREHOUSE", null, null, java.math.BigDecimal.class, "typewarehouse", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypecarrier = cci("TYPECARRIER", "TYPECARRIER", null, null, java.math.BigDecimal.class, "typecarrier", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeetc = cci("TYPEETC", "TYPEETC", null, null, java.math.BigDecimal.class, "typeetc", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnoranotherflg = cci("OWNORANOTHERFLG", "OWNORANOTHERFLG", null, null, java.math.BigDecimal.class, "ownoranotherflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser1 = cci("F_USER1", "F_USER1", null, null, String.class, "FUser1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser2 = cci("F_USER2", "F_USER2", null, null, String.class, "FUser2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser3 = cci("F_USER3", "F_USER3", null, null, String.class, "FUser3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser4 = cci("F_USER4", "F_USER4", null, null, String.class, "FUser4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser5 = cci("F_USER5", "F_USER5", null, null, String.class, "FUser5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchasetype = cci("PURCHASETYPE", "PURCHASETYPE", null, null, String.class, "purchasetype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCalendarcd = cci("CALENDARCD", "CALENDARCD", null, null, String.class, "calendarcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnercustomercd = cci("OWNERCUSTOMERCD", "OWNERCUSTOMERCD", null, null, String.class, "ownercustomercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersuppliercd = cci("OWNERSUPPLIERCD", "OWNERSUPPLIERCD", null, null, String.class, "ownersuppliercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerrefflg = cci("OWNERREFFLG", "OWNERREFFLG", null, null, java.math.BigDecimal.class, "ownerrefflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseFuncKbn = cci("WAREHOUSE_FUNC_KBN", "WAREHOUSE_FUNC_KBN", null, null, Long.class, "warehouseFuncKbn", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyId() { return _columnCompanyId; }
    /**
     * COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
    /**
     * COMPANYGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanygroup() { return _columnCompanygroup; }
    /**
     * NAME: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * SNAME: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSname() { return _columnSname; }
    /**
     * ANAME: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAname() { return _columnAname; }
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
     * POSTNO: {NotNull, varchar(30)}
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
     * PHONE1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone1() { return _columnPhone1; }
    /**
     * PHONE2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone2() { return _columnPhone2; }
    /**
     * FAX1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * FAX2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax2() { return _columnFax2; }
    /**
     * REFNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefname() { return _columnRefname; }
    /**
     * EMAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * URL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrl() { return _columnUrl; }
    /**
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeowner() { return _columnTypeowner; }
    /**
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypecustomer() { return _columnTypecustomer; }
    /**
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeshipto() { return _columnTypeshipto; }
    /**
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypesupplier() { return _columnTypesupplier; }
    /**
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypewarehouse() { return _columnTypewarehouse; }
    /**
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypecarrier() { return _columnTypecarrier; }
    /**
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeetc() { return _columnTypeetc; }
    /**
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnoranotherflg() { return _columnOwnoranotherflg; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * F_USER1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser1() { return _columnFUser1; }
    /**
     * F_USER2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser2() { return _columnFUser2; }
    /**
     * F_USER3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser3() { return _columnFUser3; }
    /**
     * F_USER4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser4() { return _columnFUser4; }
    /**
     * F_USER5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser5() { return _columnFUser5; }
    /**
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportpriority() { return _columnTransportpriority; }
    /**
     * PURCHASETYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasetype() { return _columnPurchasetype; }
    /**
     * CALENDARCD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCalendarcd() { return _columnCalendarcd; }
    /**
     * OWNERCUSTOMERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercustomercd() { return _columnOwnercustomercd; }
    /**
     * OWNERSUPPLIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersuppliercd() { return _columnOwnersuppliercd; }
    /**
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerrefflg() { return _columnOwnerrefflg; }
    /**
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseFuncKbn() { return _columnWarehouseFuncKbn; }
    /**
     * DPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
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
        ls.add(columnCompanyId());
        ls.add(columnCompanyCd());
        ls.add(columnCompanygroup());
        ls.add(columnName());
        ls.add(columnSname());
        ls.add(columnAname());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnPostno());
        ls.add(columnCountrycd());
        ls.add(columnPortcd());
        ls.add(columnDistrictcd());
        ls.add(columnPhone1());
        ls.add(columnPhone2());
        ls.add(columnFax1());
        ls.add(columnFax2());
        ls.add(columnRefname());
        ls.add(columnEmail());
        ls.add(columnUrl());
        ls.add(columnTypeowner());
        ls.add(columnTypecustomer());
        ls.add(columnTypeshipto());
        ls.add(columnTypesupplier());
        ls.add(columnTypewarehouse());
        ls.add(columnTypecarrier());
        ls.add(columnTypeetc());
        ls.add(columnOwnoranotherflg());
        ls.add(columnNotes());
        ls.add(columnFUser1());
        ls.add(columnFUser2());
        ls.add(columnFUser3());
        ls.add(columnFUser4());
        ls.add(columnFUser5());
        ls.add(columnTransportpriority());
        ls.add(columnPurchasetype());
        ls.add(columnCalendarcd());
        ls.add(columnOwnercustomercd());
        ls.add(columnOwnersuppliercd());
        ls.add(columnOwnerrefflg());
        ls.add(columnWarehouseFuncKbn());
        ls.add(columnDpcd());
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
    protected UniqueInfo cpui() { return hpcpui(columnCompanyId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MMfcompany"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MMfcompanyCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MMfcompanyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MMfcompany> getEntityType() { return MMfcompany.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MMfcompany newEntity() { return new MMfcompany(); }
    public MMfcompany newMyEntity() { return new MMfcompany(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MMfcompany)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MMfcompany)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
