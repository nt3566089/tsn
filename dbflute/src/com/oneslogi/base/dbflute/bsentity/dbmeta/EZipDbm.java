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
 * The DB meta of E_ZIP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EZipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EZipDbm _instance = new EZipDbm();
    private EZipDbm() {}
    public static EZipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EZip)et).getZipId(), (et, vl) -> ((EZip)et).setZipId(ctl(vl)), "zipId");
        setupEpg(_epgMap, et -> ((EZip)et).getReceiveCd(), (et, vl) -> ((EZip)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EZip)et).getReceiveRowId(), (et, vl) -> ((EZip)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EZip)et).getImportFlg(), (et, vl) -> ((EZip)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EZip)et).getErrorFlg(), (et, vl) -> ((EZip)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EZip)et).getErrorMessageCd(), (et, vl) -> ((EZip)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EZip)et).getZipCd(), (et, vl) -> ((EZip)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((EZip)et).getPublicCd(), (et, vl) -> ((EZip)et).setPublicCd((String)vl), "publicCd");
        setupEpg(_epgMap, et -> ((EZip)et).getZipCd5(), (et, vl) -> ((EZip)et).setZipCd5((String)vl), "zipCd5");
        setupEpg(_epgMap, et -> ((EZip)et).getAddressKn1(), (et, vl) -> ((EZip)et).setAddressKn1((String)vl), "addressKn1");
        setupEpg(_epgMap, et -> ((EZip)et).getAddressKn2(), (et, vl) -> ((EZip)et).setAddressKn2((String)vl), "addressKn2");
        setupEpg(_epgMap, et -> ((EZip)et).getAddressKn3(), (et, vl) -> ((EZip)et).setAddressKn3((String)vl), "addressKn3");
        setupEpg(_epgMap, et -> ((EZip)et).getCompanyKn(), (et, vl) -> ((EZip)et).setCompanyKn((String)vl), "companyKn");
        setupEpg(_epgMap, et -> ((EZip)et).getAddress1(), (et, vl) -> ((EZip)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((EZip)et).getAddress2(), (et, vl) -> ((EZip)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((EZip)et).getAddress3(), (et, vl) -> ((EZip)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((EZip)et).getAddress4(), (et, vl) -> ((EZip)et).setAddress4((String)vl), "address4");
        setupEpg(_epgMap, et -> ((EZip)et).getCompanyNm(), (et, vl) -> ((EZip)et).setCompanyNm((String)vl), "companyNm");
        setupEpg(_epgMap, et -> ((EZip)et).getFlg1(), (et, vl) -> ((EZip)et).setFlg1((String)vl), "flg1");
        setupEpg(_epgMap, et -> ((EZip)et).getFlg2(), (et, vl) -> ((EZip)et).setFlg2((String)vl), "flg2");
        setupEpg(_epgMap, et -> ((EZip)et).getFlg3(), (et, vl) -> ((EZip)et).setFlg3((String)vl), "flg3");
        setupEpg(_epgMap, et -> ((EZip)et).getFlg4(), (et, vl) -> ((EZip)et).setFlg4((String)vl), "flg4");
        setupEpg(_epgMap, et -> ((EZip)et).getUpdType(), (et, vl) -> ((EZip)et).setUpdType((String)vl), "updType");
        setupEpg(_epgMap, et -> ((EZip)et).getReasonType(), (et, vl) -> ((EZip)et).setReasonType((String)vl), "reasonType");
        setupEpg(_epgMap, et -> ((EZip)et).getHandlingAddress(), (et, vl) -> ((EZip)et).setHandlingAddress((String)vl), "handlingAddress");
        setupEpg(_epgMap, et -> ((EZip)et).getFlg5(), (et, vl) -> ((EZip)et).setFlg5((String)vl), "flg5");
        setupEpg(_epgMap, et -> ((EZip)et).getFlg6(), (et, vl) -> ((EZip)et).setFlg6((String)vl), "flg6");
        setupEpg(_epgMap, et -> ((EZip)et).getUpdCd(), (et, vl) -> ((EZip)et).setUpdCd((String)vl), "updCd");
        setupEpg(_epgMap, et -> ((EZip)et).getCompanyFlg(), (et, vl) -> ((EZip)et).setCompanyFlg((String)vl), "companyFlg");
        setupEpg(_epgMap, et -> ((EZip)et).getDelFlg(), (et, vl) -> ((EZip)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EZip)et).getVersionNo(), (et, vl) -> ((EZip)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EZip)et).getControlNo(), (et, vl) -> ((EZip)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EZip)et).getAddDt(), (et, vl) -> ((EZip)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EZip)et).getAddUser(), (et, vl) -> ((EZip)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EZip)et).getAddProcess(), (et, vl) -> ((EZip)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EZip)et).getUpdDt(), (et, vl) -> ((EZip)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EZip)et).getUpdUser(), (et, vl) -> ((EZip)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EZip)et).getUpdProcess(), (et, vl) -> ((EZip)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_ZIP";
    protected final String _tableDispName = "E_ZIP";
    protected final String _tablePropertyName = "EZip";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_ZIP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnZipId = cci("ZIP_ID", "ZIP_ID", null, null, Long.class, "zipId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublicCd = cci("PUBLIC_CD", "PUBLIC_CD", null, null, String.class, "publicCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd5 = cci("ZIP_CD5", "ZIP_CD5", null, null, String.class, "zipCd5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn1 = cci("ADDRESS_KN1", "ADDRESS_KN1", null, null, String.class, "addressKn1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn2 = cci("ADDRESS_KN2", "ADDRESS_KN2", null, null, String.class, "addressKn2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn3 = cci("ADDRESS_KN3", "ADDRESS_KN3", null, null, String.class, "addressKn3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyKn = cci("COMPANY_KN", "COMPANY_KN", null, null, String.class, "companyKn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress4 = cci("ADDRESS4", "ADDRESS4", null, null, String.class, "address4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyNm = cci("COMPANY_NM", "COMPANY_NM", null, null, String.class, "companyNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg1 = cci("FLG1", "FLG1", null, null, String.class, "flg1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg2 = cci("FLG2", "FLG2", null, null, String.class, "flg2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg3 = cci("FLG3", "FLG3", null, null, String.class, "flg3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg4 = cci("FLG4", "FLG4", null, null, String.class, "flg4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdType = cci("UPD_TYPE", "UPD_TYPE", null, null, String.class, "updType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReasonType = cci("REASON_TYPE", "REASON_TYPE", null, null, String.class, "reasonType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHandlingAddress = cci("HANDLING_ADDRESS", "HANDLING_ADDRESS", null, null, String.class, "handlingAddress", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg5 = cci("FLG5", "FLG5", null, null, String.class, "flg5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg6 = cci("FLG6", "FLG6", null, null, String.class, "flg6", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdCd = cci("UPD_CD", "UPD_CD", null, null, String.class, "updCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyFlg = cci("COMPANY_FLG", "COMPANY_FLG", null, null, String.class, "companyFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
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
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipId() { return _columnZipId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * ZIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * PUBLIC_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicCd() { return _columnPublicCd; }
    /**
     * ZIP_CD5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd5() { return _columnZipCd5; }
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
     * FLG1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg1() { return _columnFlg1; }
    /**
     * FLG2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg2() { return _columnFlg2; }
    /**
     * FLG3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg3() { return _columnFlg3; }
    /**
     * FLG4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg4() { return _columnFlg4; }
    /**
     * UPD_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdType() { return _columnUpdType; }
    /**
     * REASON_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReasonType() { return _columnReasonType; }
    /**
     * HANDLING_ADDRESS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandlingAddress() { return _columnHandlingAddress; }
    /**
     * FLG5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg5() { return _columnFlg5; }
    /**
     * FLG6: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg6() { return _columnFlg6; }
    /**
     * UPD_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdCd() { return _columnUpdCd; }
    /**
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyFlg() { return _columnCompanyFlg; }
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
        ls.add(columnZipId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnZipCd());
        ls.add(columnPublicCd());
        ls.add(columnZipCd5());
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
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        return hpcui(ls);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EZip"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EZipCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EZipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EZip> getEntityType() { return EZip.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EZip newEntity() { return new EZip(); }
    public EZip newMyEntity() { return new EZip(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EZip)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EZip)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
