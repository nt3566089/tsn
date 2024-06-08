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
 * The DB meta of M_ZIP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MZipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MZipDbm _instance = new MZipDbm();
    private MZipDbm() {}
    public static MZipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MZip)et).getZipId(), (et, vl) -> ((MZip)et).setZipId(ctl(vl)), "zipId");
        setupEpg(_epgMap, et -> ((MZip)et).getPublicCd(), (et, vl) -> ((MZip)et).setPublicCd((String)vl), "publicCd");
        setupEpg(_epgMap, et -> ((MZip)et).getZipCd5(), (et, vl) -> ((MZip)et).setZipCd5((String)vl), "zipCd5");
        setupEpg(_epgMap, et -> ((MZip)et).getZipCd(), (et, vl) -> ((MZip)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((MZip)et).getAddressKn1(), (et, vl) -> ((MZip)et).setAddressKn1((String)vl), "addressKn1");
        setupEpg(_epgMap, et -> ((MZip)et).getAddressKn2(), (et, vl) -> ((MZip)et).setAddressKn2((String)vl), "addressKn2");
        setupEpg(_epgMap, et -> ((MZip)et).getAddressKn3(), (et, vl) -> ((MZip)et).setAddressKn3((String)vl), "addressKn3");
        setupEpg(_epgMap, et -> ((MZip)et).getCompanyKn(), (et, vl) -> ((MZip)et).setCompanyKn((String)vl), "companyKn");
        setupEpg(_epgMap, et -> ((MZip)et).getAddress1(), (et, vl) -> ((MZip)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MZip)et).getAddress2(), (et, vl) -> ((MZip)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MZip)et).getAddress3(), (et, vl) -> ((MZip)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((MZip)et).getAddress4(), (et, vl) -> ((MZip)et).setAddress4((String)vl), "address4");
        setupEpg(_epgMap, et -> ((MZip)et).getCompanyNm(), (et, vl) -> ((MZip)et).setCompanyNm((String)vl), "companyNm");
        setupEpg(_epgMap, et -> ((MZip)et).getFlg1(), (et, vl) -> ((MZip)et).setFlg1((String)vl), "flg1");
        setupEpg(_epgMap, et -> ((MZip)et).getFlg2(), (et, vl) -> ((MZip)et).setFlg2((String)vl), "flg2");
        setupEpg(_epgMap, et -> ((MZip)et).getFlg3(), (et, vl) -> ((MZip)et).setFlg3((String)vl), "flg3");
        setupEpg(_epgMap, et -> ((MZip)et).getFlg4(), (et, vl) -> ((MZip)et).setFlg4((String)vl), "flg4");
        setupEpg(_epgMap, et -> ((MZip)et).getUpdType(), (et, vl) -> ((MZip)et).setUpdType((String)vl), "updType");
        setupEpg(_epgMap, et -> ((MZip)et).getReasonType(), (et, vl) -> ((MZip)et).setReasonType((String)vl), "reasonType");
        setupEpg(_epgMap, et -> ((MZip)et).getHandlingAddress(), (et, vl) -> ((MZip)et).setHandlingAddress((String)vl), "handlingAddress");
        setupEpg(_epgMap, et -> ((MZip)et).getFlg5(), (et, vl) -> ((MZip)et).setFlg5((String)vl), "flg5");
        setupEpg(_epgMap, et -> ((MZip)et).getFlg6(), (et, vl) -> ((MZip)et).setFlg6((String)vl), "flg6");
        setupEpg(_epgMap, et -> ((MZip)et).getUpdCd(), (et, vl) -> ((MZip)et).setUpdCd((String)vl), "updCd");
        setupEpg(_epgMap, et -> ((MZip)et).getCompanyFlg(), (et, vl) -> ((MZip)et).setCompanyFlg((String)vl), "companyFlg");
        setupEpg(_epgMap, et -> ((MZip)et).getDelFlg(), (et, vl) -> ((MZip)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MZip)et).getVersionNo(), (et, vl) -> ((MZip)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MZip)et).getControlNo(), (et, vl) -> ((MZip)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MZip)et).getAddDt(), (et, vl) -> ((MZip)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MZip)et).getAddUser(), (et, vl) -> ((MZip)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MZip)et).getAddProcess(), (et, vl) -> ((MZip)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MZip)et).getUpdDt(), (et, vl) -> ((MZip)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MZip)et).getUpdUser(), (et, vl) -> ((MZip)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MZip)et).getUpdProcess(), (et, vl) -> ((MZip)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByFlg6(), (et, vl) -> ((MZip)et).setBClassDtlByFlg6((BClassDtl)vl), "BClassDtlByFlg6");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByFlg5(), (et, vl) -> ((MZip)et).setBClassDtlByFlg5((BClassDtl)vl), "BClassDtlByFlg5");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByCompanyFlg(), (et, vl) -> ((MZip)et).setBClassDtlByCompanyFlg((BClassDtl)vl), "BClassDtlByCompanyFlg");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByDelFlg(), (et, vl) -> ((MZip)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByReasonType(), (et, vl) -> ((MZip)et).setBClassDtlByReasonType((BClassDtl)vl), "BClassDtlByReasonType");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByUpdCd(), (et, vl) -> ((MZip)et).setBClassDtlByUpdCd((BClassDtl)vl), "BClassDtlByUpdCd");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByUpdType(), (et, vl) -> ((MZip)et).setBClassDtlByUpdType((BClassDtl)vl), "BClassDtlByUpdType");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByFlg1(), (et, vl) -> ((MZip)et).setBClassDtlByFlg1((BClassDtl)vl), "BClassDtlByFlg1");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByFlg2(), (et, vl) -> ((MZip)et).setBClassDtlByFlg2((BClassDtl)vl), "BClassDtlByFlg2");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByFlg3(), (et, vl) -> ((MZip)et).setBClassDtlByFlg3((BClassDtl)vl), "BClassDtlByFlg3");
        setupEfpg(_efpgMap, et -> ((MZip)et).getBClassDtlByFlg4(), (et, vl) -> ((MZip)et).setBClassDtlByFlg4((BClassDtl)vl), "BClassDtlByFlg4");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_ZIP";
    protected final String _tableDispName = "M_ZIP";
    protected final String _tablePropertyName = "MZip";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_ZIP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnZipId = cci("ZIP_ID", "ZIP_ID", null, null, Long.class, "zipId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MCarrierZipList", null, false);
    protected final ColumnInfo _columnPublicCd = cci("PUBLIC_CD", "PUBLIC_CD", null, null, String.class, "publicCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd5 = cci("ZIP_CD_5", "ZIP_CD_5", null, null, String.class, "zipCd5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, "TShippingInstHForDelivList", null, false);
    protected final ColumnInfo _columnAddressKn1 = cci("ADDRESS_KN1", "ADDRESS_KN1", null, null, String.class, "addressKn1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn2 = cci("ADDRESS_KN2", "ADDRESS_KN2", null, null, String.class, "addressKn2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn3 = cci("ADDRESS_KN3", "ADDRESS_KN3", null, null, String.class, "addressKn3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyKn = cci("COMPANY_KN", "COMPANY_KN", null, null, String.class, "companyKn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress4 = cci("ADDRESS4", "ADDRESS4", null, null, String.class, "address4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyNm = cci("COMPANY_NM", "COMPANY_NM", null, null, String.class, "companyNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg1 = cci("FLG1", "FLG1", null, null, String.class, "flg1", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFlg1", null, CDef.DefMeta.ZipFlg, false);
    protected final ColumnInfo _columnFlg2 = cci("FLG2", "FLG2", null, null, String.class, "flg2", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFlg2", null, CDef.DefMeta.ZipFlg, false);
    protected final ColumnInfo _columnFlg3 = cci("FLG3", "FLG3", null, null, String.class, "flg3", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFlg3", null, CDef.DefMeta.ZipFlg, false);
    protected final ColumnInfo _columnFlg4 = cci("FLG4", "FLG4", null, null, String.class, "flg4", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFlg4", null, CDef.DefMeta.ZipFlg, false);
    protected final ColumnInfo _columnUpdType = cci("UPD_TYPE", "UPD_TYPE", null, null, String.class, "updType", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByUpdType", null, CDef.DefMeta.UpdType, false);
    protected final ColumnInfo _columnReasonType = cci("REASON_TYPE", "REASON_TYPE", null, null, String.class, "reasonType", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByReasonType", null, CDef.DefMeta.ReasonType, false);
    protected final ColumnInfo _columnHandlingAddress = cci("HANDLING_ADDRESS", "HANDLING_ADDRESS", null, null, String.class, "handlingAddress", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg5 = cci("FLG5", "FLG5", null, null, String.class, "flg5", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFlg5", null, CDef.DefMeta.CodeType, false);
    protected final ColumnInfo _columnFlg6 = cci("FLG6", "FLG6", null, null, String.class, "flg6", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFlg6", null, CDef.DefMeta.CodeFlg, false);
    protected final ColumnInfo _columnUpdCd = cci("UPD_CD", "UPD_CD", null, null, String.class, "updCd", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByUpdCd", null, CDef.DefMeta.UpdCd, false);
    protected final ColumnInfo _columnCompanyFlg = cci("COMPANY_FLG", "COMPANY_FLG", null, null, String.class, "companyFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByCompanyFlg", null, CDef.DefMeta.CompanyFlg, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipId() { return _columnZipId; }
    /**
     * PUBLIC_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicCd() { return _columnPublicCd; }
    /**
     * ZIP_CD_5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd5() { return _columnZipCd5; }
    /**
     * ZIP_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * ADDRESS_KN1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddressKn1() { return _columnAddressKn1; }
    /**
     * ADDRESS_KN2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddressKn2() { return _columnAddressKn2; }
    /**
     * ADDRESS_KN3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddressKn3() { return _columnAddressKn3; }
    /**
     * COMPANY_KN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyKn() { return _columnCompanyKn; }
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
     * ADDRESS4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress4() { return _columnAddress4; }
    /**
     * COMPANY_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyNm() { return _columnCompanyNm; }
    /**
     * FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg1() { return _columnFlg1; }
    /**
     * FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg2() { return _columnFlg2; }
    /**
     * FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg3() { return _columnFlg3; }
    /**
     * FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg4() { return _columnFlg4; }
    /**
     * UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdType() { return _columnUpdType; }
    /**
     * REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReasonType() { return _columnReasonType; }
    /**
     * HANDLING_ADDRESS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandlingAddress() { return _columnHandlingAddress; }
    /**
     * FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg5() { return _columnFlg5; }
    /**
     * FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg6() { return _columnFlg6; }
    /**
     * UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdCd() { return _columnUpdCd; }
    /**
     * COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyFlg() { return _columnCompanyFlg; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnZipId());
        ls.add(columnPublicCd());
        ls.add(columnZipCd5());
        ls.add(columnZipCd());
        ls.add(columnAddressKn1());
        ls.add(columnAddressKn2());
        ls.add(columnAddressKn3());
        ls.add(columnCompanyKn());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnAddress4());
        ls.add(columnCompanyNm());
        ls.add(columnFlg1());
        ls.add(columnFlg2());
        ls.add(columnFlg3());
        ls.add(columnFlg4());
        ls.add(columnUpdType());
        ls.add(columnReasonType());
        ls.add(columnHandlingAddress());
        ls.add(columnFlg5());
        ls.add(columnFlg6());
        ls.add(columnUpdCd());
        ls.add(columnCompanyFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnZipId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnZipCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFlg6() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlg6(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_FLG6", "BClassDtlByFlg6", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CODE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFlg5() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlg5(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_FLG5", "BClassDtlByFlg5", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CODE_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCompanyFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCompanyFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_COMPANY_FLG", "BClassDtlByCompanyFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COMPANY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReasonType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReasonType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_REASON_TYPE", "BClassDtlByReasonType", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'REASON_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByUpdCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUpdCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_UPD_CD", "BClassDtlByUpdCd", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'UPD_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByUpdType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUpdType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_UPD_TYPE", "BClassDtlByUpdType", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'UPD_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFlg1() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlg1(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_FLG1", "BClassDtlByFlg1", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ZIP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFlg2() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlg2(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_FLG2", "BClassDtlByFlg2", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ZIP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFlg3() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlg3(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_FLG3", "BClassDtlByFlg3", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ZIP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFlg4() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlg4(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_ZIP_FLG4", "BClassDtlByFlg4", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ZIP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CARRIER_ZIP by ZIP_ID, named 'MCarrierZipList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierZipList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZipId(), MCarrierZipDbm.getInstance().columnZipId());
        return cri("M_CARRIER_ZIP_FK2", "MCarrierZipList", this, MCarrierZipDbm.getInstance(), mp, false, "MZip");
    }
    /**
     * T_SHIPPING_INST_H by DELIV_ZIP_CD, named 'TShippingInstHForDelivList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHForDelivList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZipCd(), TShippingInstHDbm.getInstance().columnDelivZipCd());
        return cri("FK_T_SHIPPING_INST_H_TO_M_ZIP_FOR_DELIV", "TShippingInstHForDelivList", this, TShippingInstHDbm.getInstance(), mp, false, "MZipForDeliv");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MZip"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MZipCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MZipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MZip> getEntityType() { return MZip.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MZip newEntity() { return new MZip(); }
    public MZip newMyEntity() { return new MZip(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MZip)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MZip)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
