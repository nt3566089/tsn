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
 * The DB meta of T_TRLEAVERESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrleaveresultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrleaveresultDbm _instance = new TTrleaveresultDbm();
    private TTrleaveresultDbm() {}
    public static TTrleaveresultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getTrleaveresultId(), (et, vl) -> ((TTrleaveresult)et).setTrleaveresultId(ctl(vl)), "trleaveresultId");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getLeaveresultkey(), (et, vl) -> ((TTrleaveresult)et).setLeaveresultkey(ctb(vl)), "leaveresultkey");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getRefno(), (et, vl) -> ((TTrleaveresult)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getTaxpalletno(), (et, vl) -> ((TTrleaveresult)et).setTaxpalletno((String)vl), "taxpalletno");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getFactorycd(), (et, vl) -> ((TTrleaveresult)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getProductCd(), (et, vl) -> ((TTrleaveresult)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getMachineno(), (et, vl) -> ((TTrleaveresult)et).setMachineno((String)vl), "machineno");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getCreateno(), (et, vl) -> ((TTrleaveresult)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getRcvkey(), (et, vl) -> ((TTrleaveresult)et).setRcvkey((String)vl), "rcvkey");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getCaseflg(), (et, vl) -> ((TTrleaveresult)et).setCaseflg((String)vl), "caseflg");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getFirmcarryno(), (et, vl) -> ((TTrleaveresult)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getLimitdate(), (et, vl) -> ((TTrleaveresult)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getDesigncd(), (et, vl) -> ((TTrleaveresult)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getBatjmfym(), (et, vl) -> ((TTrleaveresult)et).setBatjmfym((String)vl), "batjmfym");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getQty(), (et, vl) -> ((TTrleaveresult)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getLastitemcd(), (et, vl) -> ((TTrleaveresult)et).setLastitemcd((String)vl), "lastitemcd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getLastdesigncd(), (et, vl) -> ((TTrleaveresult)et).setLastdesigncd((String)vl), "lastdesigncd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getShipcd(), (et, vl) -> ((TTrleaveresult)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getCarryoutdate(), (et, vl) -> ((TTrleaveresult)et).setCarryoutdate((String)vl), "carryoutdate");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getShiptocd(), (et, vl) -> ((TTrleaveresult)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getRcvdate(), (et, vl) -> ((TTrleaveresult)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getShtypecd(), (et, vl) -> ((TTrleaveresult)et).setShtypecd((String)vl), "shtypecd");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getTplqty(), (et, vl) -> ((TTrleaveresult)et).setTplqty((String)vl), "tplqty");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getRcvpalletno(), (et, vl) -> ((TTrleaveresult)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getCaseqty(), (et, vl) -> ((TTrleaveresult)et).setCaseqty((String)vl), "caseqty");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getVaExtdata1(), (et, vl) -> ((TTrleaveresult)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getVaExtdata2(), (et, vl) -> ((TTrleaveresult)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getVaExtdata3(), (et, vl) -> ((TTrleaveresult)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getNvExtdata1(), (et, vl) -> ((TTrleaveresult)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getNvExtdata2(), (et, vl) -> ((TTrleaveresult)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getNvExtdata3(), (et, vl) -> ((TTrleaveresult)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getNmExtdata1(), (et, vl) -> ((TTrleaveresult)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getNmExtdata2(), (et, vl) -> ((TTrleaveresult)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getNmExtdata3(), (et, vl) -> ((TTrleaveresult)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getDtExtdata1(), (et, vl) -> ((TTrleaveresult)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getDtExtdata2(), (et, vl) -> ((TTrleaveresult)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getDtExtdata3(), (et, vl) -> ((TTrleaveresult)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getDelFlg(), (et, vl) -> ((TTrleaveresult)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getVersionNo(), (et, vl) -> ((TTrleaveresult)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getControlNo(), (et, vl) -> ((TTrleaveresult)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getAddDt(), (et, vl) -> ((TTrleaveresult)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getAddUser(), (et, vl) -> ((TTrleaveresult)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getAddProcess(), (et, vl) -> ((TTrleaveresult)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getUpdDt(), (et, vl) -> ((TTrleaveresult)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getUpdUser(), (et, vl) -> ((TTrleaveresult)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrleaveresult)et).getUpdProcess(), (et, vl) -> ((TTrleaveresult)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRLEAVERESULT";
    protected final String _tableDispName = "T_TRLEAVERESULT";
    protected final String _tablePropertyName = "TTrleaveresult";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRLEAVERESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrleaveresultId = cci("TRLEAVERESULT_ID", "TRLEAVERESULT_ID", null, null, Long.class, "trleaveresultId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLeaveresultkey = cci("LEAVERESULTKEY", "LEAVERESULTKEY", null, null, java.math.BigDecimal.class, "leaveresultkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxpalletno = cci("TAXPALLETNO", "TAXPALLETNO", null, null, String.class, "taxpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineno = cci("MACHINENO", "MACHINENO", null, null, String.class, "machineno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, String.class, "rcvkey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseflg = cci("CASEFLG", "CASEFLG", null, null, String.class, "caseflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjmfym = cci("BATJMFYM", "BATJMFYM", null, null, String.class, "batjmfym", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastitemcd = cci("LASTITEMCD", "LASTITEMCD", null, null, String.class, "lastitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastdesigncd = cci("LASTDESIGNCD", "LASTDESIGNCD", null, null, String.class, "lastdesigncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarryoutdate = cci("CARRYOUTDATE", "CARRYOUTDATE", null, null, String.class, "carryoutdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdate = cci("RCVDATE", "RCVDATE", null, null, String.class, "rcvdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShtypecd = cci("SHTYPECD", "SHTYPECD", null, null, String.class, "shtypecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTplqty = cci("TPLQTY", "TPLQTY", null, null, String.class, "tplqty", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RCVPALLETNO", "RCVPALLETNO", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseqty = cci("CASEQTY", "CASEQTY", null, null, String.class, "caseqty", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrleaveresultId() { return _columnTrleaveresultId; }
    /**
     * LEAVERESULTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLeaveresultkey() { return _columnLeaveresultkey; }
    /**
     * REFNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * TAXPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxpalletno() { return _columnTaxpalletno; }
    /**
     * FACTORYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
     * RCVKEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * CASEFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseflg() { return _columnCaseflg; }
    /**
     * FIRMCARRYNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * LIMITDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * DESIGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * BATJMFYM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjmfym() { return _columnBatjmfym; }
    /**
     * QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * LASTITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastitemcd() { return _columnLastitemcd; }
    /**
     * LASTDESIGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastdesigncd() { return _columnLastdesigncd; }
    /**
     * SHIPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * CARRYOUTDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarryoutdate() { return _columnCarryoutdate; }
    /**
     * SHIPTOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * RCVDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdate() { return _columnRcvdate; }
    /**
     * SHTYPECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShtypecd() { return _columnShtypecd; }
    /**
     * TPLQTY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplqty() { return _columnTplqty; }
    /**
     * RCVPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpalletno() { return _columnRcvpalletno; }
    /**
     * CASEQTY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseqty() { return _columnCaseqty; }
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
        ls.add(columnTrleaveresultId());
        ls.add(columnLeaveresultkey());
        ls.add(columnRefno());
        ls.add(columnTaxpalletno());
        ls.add(columnFactorycd());
        ls.add(columnProductCd());
        ls.add(columnMachineno());
        ls.add(columnCreateno());
        ls.add(columnRcvkey());
        ls.add(columnCaseflg());
        ls.add(columnFirmcarryno());
        ls.add(columnLimitdate());
        ls.add(columnDesigncd());
        ls.add(columnBatjmfym());
        ls.add(columnQty());
        ls.add(columnLastitemcd());
        ls.add(columnLastdesigncd());
        ls.add(columnShipcd());
        ls.add(columnCarryoutdate());
        ls.add(columnShiptocd());
        ls.add(columnRcvdate());
        ls.add(columnShtypecd());
        ls.add(columnTplqty());
        ls.add(columnRcvpalletno());
        ls.add(columnCaseqty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrleaveresultId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrleaveresult"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrleaveresultCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrleaveresultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrleaveresult> getEntityType() { return TTrleaveresult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrleaveresult newEntity() { return new TTrleaveresult(); }
    public TTrleaveresult newMyEntity() { return new TTrleaveresult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrleaveresult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrleaveresult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
