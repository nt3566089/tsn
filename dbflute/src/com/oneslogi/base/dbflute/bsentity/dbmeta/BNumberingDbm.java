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
 * The DB meta of B_NUMBERING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BNumberingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BNumberingDbm _instance = new BNumberingDbm();
    private BNumberingDbm() {}
    public static BNumberingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BNumbering)et).getNumberingId(), (et, vl) -> ((BNumbering)et).setNumberingId(ctl(vl)), "numberingId");
        setupEpg(_epgMap, et -> ((BNumbering)et).getBizCd(), (et, vl) -> ((BNumbering)et).setBizCd((String)vl), "bizCd");
        setupEpg(_epgMap, et -> ((BNumbering)et).getBizNm(), (et, vl) -> ((BNumbering)et).setBizNm((String)vl), "bizNm");
        setupEpg(_epgMap, et -> ((BNumbering)et).getLength(), (et, vl) -> ((BNumbering)et).setLength(ctl(vl)), "length");
        setupEpg(_epgMap, et -> ((BNumbering)et).getFixedValue(), (et, vl) -> ((BNumbering)et).setFixedValue((String)vl), "fixedValue");
        setupEpg(_epgMap, et -> ((BNumbering)et).getFixedDtFormat(), (et, vl) -> ((BNumbering)et).setFixedDtFormat((String)vl), "fixedDtFormat");
        setupEpg(_epgMap, et -> ((BNumbering)et).getPresentNumber(), (et, vl) -> ((BNumbering)et).setPresentNumber(ctl(vl)), "presentNumber");
        setupEpg(_epgMap, et -> ((BNumbering)et).getIncNumber(), (et, vl) -> ((BNumbering)et).setIncNumber(ctl(vl)), "incNumber");
        setupEpg(_epgMap, et -> ((BNumbering)et).getMinNumber(), (et, vl) -> ((BNumbering)et).setMinNumber(ctl(vl)), "minNumber");
        setupEpg(_epgMap, et -> ((BNumbering)et).getMaxNumber(), (et, vl) -> ((BNumbering)et).setMaxNumber(ctl(vl)), "maxNumber");
        setupEpg(_epgMap, et -> ((BNumbering)et).getCheckDigit(), (et, vl) -> ((BNumbering)et).setCheckDigit((String)vl), "checkDigit");
        setupEpg(_epgMap, et -> ((BNumbering)et).getSystemType(), (et, vl) -> ((BNumbering)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((BNumbering)et).getCashCount(), (et, vl) -> ((BNumbering)et).setCashCount(ctl(vl)), "cashCount");
        setupEpg(_epgMap, et -> ((BNumbering)et).getDelFlg(), (et, vl) -> ((BNumbering)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BNumbering)et).getVersionNo(), (et, vl) -> ((BNumbering)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BNumbering)et).getControlNo(), (et, vl) -> ((BNumbering)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BNumbering)et).getAddDt(), (et, vl) -> ((BNumbering)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BNumbering)et).getAddUser(), (et, vl) -> ((BNumbering)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BNumbering)et).getAddProcess(), (et, vl) -> ((BNumbering)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BNumbering)et).getUpdDt(), (et, vl) -> ((BNumbering)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BNumbering)et).getUpdUser(), (et, vl) -> ((BNumbering)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BNumbering)et).getUpdProcess(), (et, vl) -> ((BNumbering)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BNumbering)et).getBClassDtlByCheckDigit(), (et, vl) -> ((BNumbering)et).setBClassDtlByCheckDigit((BClassDtl)vl), "BClassDtlByCheckDigit");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_NUMBERING";
    protected final String _tableDispName = "B_NUMBERING";
    protected final String _tablePropertyName = "BNumbering";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_NUMBERING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNumberingId = cci("NUMBERING_ID", "NUMBERING_ID", null, null, Long.class, "numberingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizCd = cci("BIZ_CD", "BIZ_CD", null, null, String.class, "bizCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizNm = cci("BIZ_NM", "BIZ_NM", null, null, String.class, "bizNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, Long.class, "length", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFixedValue = cci("FIXED_VALUE", "FIXED_VALUE", null, null, String.class, "fixedValue", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFixedDtFormat = cci("FIXED_DT_FORMAT", "FIXED_DT_FORMAT", null, null, String.class, "fixedDtFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresentNumber = cci("PRESENT_NUMBER", "PRESENT_NUMBER", null, null, Long.class, "presentNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncNumber = cci("INC_NUMBER", "INC_NUMBER", null, null, Long.class, "incNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinNumber = cci("MIN_NUMBER", "MIN_NUMBER", null, null, Long.class, "minNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxNumber = cci("MAX_NUMBER", "MAX_NUMBER", null, null, Long.class, "maxNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCheckDigit = cci("CHECK_DIGIT", "CHECK_DIGIT", null, null, String.class, "checkDigit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCheckDigit", null, CDef.DefMeta.CheckDigit, false);
    protected final ColumnInfo _columnSystemType = cci("SYSTEM_TYPE", "SYSTEM_TYPE", null, null, String.class, "systemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCashCount = cci("CASH_COUNT", "CASH_COUNT", null, null, Long.class, "cashCount", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * NUMBERING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberingId() { return _columnNumberingId; }
    /**
     * BIZ_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizCd() { return _columnBizCd; }
    /**
     * BIZ_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizNm() { return _columnBizNm; }
    /**
     * LENGTH: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * FIXED_VALUE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedValue() { return _columnFixedValue; }
    /**
     * FIXED_DT_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedDtFormat() { return _columnFixedDtFormat; }
    /**
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresentNumber() { return _columnPresentNumber; }
    /**
     * INC_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncNumber() { return _columnIncNumber; }
    /**
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinNumber() { return _columnMinNumber; }
    /**
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxNumber() { return _columnMaxNumber; }
    /**
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCheckDigit() { return _columnCheckDigit; }
    /**
     * SYSTEM_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemType() { return _columnSystemType; }
    /**
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCashCount() { return _columnCashCount; }
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
        ls.add(columnNumberingId());
        ls.add(columnBizCd());
        ls.add(columnBizNm());
        ls.add(columnLength());
        ls.add(columnFixedValue());
        ls.add(columnFixedDtFormat());
        ls.add(columnPresentNumber());
        ls.add(columnIncNumber());
        ls.add(columnMinNumber());
        ls.add(columnMaxNumber());
        ls.add(columnCheckDigit());
        ls.add(columnSystemType());
        ls.add(columnCashCount());
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
    protected UniqueInfo cpui() { return hpcpui(columnNumberingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnBizCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCheckDigit() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCheckDigit(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_NUMBERING_CHECK_DIGIT", "BClassDtlByCheckDigit", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CHECK_DIGIT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BNumbering"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BNumberingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BNumberingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BNumbering> getEntityType() { return BNumbering.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BNumbering newEntity() { return new BNumbering(); }
    public BNumbering newMyEntity() { return new BNumbering(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BNumbering)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BNumbering)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
