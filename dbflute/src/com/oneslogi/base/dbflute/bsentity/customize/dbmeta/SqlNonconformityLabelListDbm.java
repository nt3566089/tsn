package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlNonconformityLabelList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlNonconformityLabelListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlNonconformityLabelListDbm _instance = new SqlNonconformityLabelListDbm();
    private SqlNonconformityLabelListDbm() {}
    public static SqlNonconformityLabelListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getTrbaditemcaseId(), (et, vl) -> ((SqlNonconformityLabelList)et).setTrbaditemcaseId(ctl(vl)), "trbaditemcaseId");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getCreateddate(), (et, vl) -> ((SqlNonconformityLabelList)et).setCreateddate((String)vl), "createddate");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getTargetmon(), (et, vl) -> ((SqlNonconformityLabelList)et).setTargetmon((String)vl), "targetmon");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getItemcd(), (et, vl) -> ((SqlNonconformityLabelList)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getProductAbbr(), (et, vl) -> ((SqlNonconformityLabelList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getLblkbn(), (et, vl) -> ((SqlNonconformityLabelList)et).setLblkbn((String)vl), "lblkbn");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getInoutkbn(), (et, vl) -> ((SqlNonconformityLabelList)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getVaExtdata2(), (et, vl) -> ((SqlNonconformityLabelList)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getAllocpolicykey(), (et, vl) -> ((SqlNonconformityLabelList)et).setAllocpolicykey(ctb(vl)), "allocpolicykey");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getCaseNum(), (et, vl) -> ((SqlNonconformityLabelList)et).setCaseNum(ctb(vl)), "caseNum");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getBaditemcd(), (et, vl) -> ((SqlNonconformityLabelList)et).setBaditemcd(ctb(vl)), "baditemcd");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getTodayNum(), (et, vl) -> ((SqlNonconformityLabelList)et).setTodayNum(cti(vl)), "todayNum");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getCreatednum(), (et, vl) -> ((SqlNonconformityLabelList)et).setCreatednum(ctl(vl)), "creatednum");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getReprintedflg(), (et, vl) -> ((SqlNonconformityLabelList)et).setReprintedflg((String)vl), "reprintedflg");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getVaExtdata1(), (et, vl) -> ((SqlNonconformityLabelList)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getVersionNo(), (et, vl) -> ((SqlNonconformityLabelList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getUsernum3(), (et, vl) -> ((SqlNonconformityLabelList)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getCenterId(), (et, vl) -> ((SqlNonconformityLabelList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getCenterNm(), (et, vl) -> ((SqlNonconformityLabelList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getClientId(), (et, vl) -> ((SqlNonconformityLabelList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelList)et).getClientNm(), (et, vl) -> ((SqlNonconformityLabelList)et).setClientNm((String)vl), "clientNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlNonconformityLabelList";
    protected final String _tableDispName = "SqlNonconformityLabelList";
    protected final String _tablePropertyName = "sqlNonconformityLabelList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlNonconformityLabelList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrbaditemcaseId = cci("TRBADITEMCASE_ID", "TRBADITEMCASE_ID", null, null, Long.class, "trbaditemcaseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateddate = cci("CREATEDDATE", "CREATEDDATE", null, null, String.class, "createddate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetmon = cci("TARGETMON", "TARGETMON", null, null, String.class, "targetmon", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLblkbn = cci("LBLKBN", "LBLKBN", null, null, String.class, "lblkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocpolicykey = cci("ALLOCPOLICYKEY", "ALLOCPOLICYKEY", null, null, java.math.BigDecimal.class, "allocpolicykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseNum = cci("CASE_NUM", "CASE_NUM", null, null, java.math.BigDecimal.class, "caseNum", null, false, false, false, "decimal", 33, 12, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaditemcd = cci("BADITEMCD", "BADITEMCD", null, null, java.math.BigDecimal.class, "baditemcd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTodayNum = cci("TODAY_NUM", "TODAY_NUM", null, null, Integer.class, "todayNum", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatednum = cci("CREATEDNUM", "CREATEDNUM", null, null, Long.class, "creatednum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReprintedflg = cci("REPRINTEDFLG", "REPRINTEDFLG", null, null, String.class, "reprintedflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TRBADITEMCASE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrbaditemcaseId() { return _columnTrbaditemcaseId; }
    /**
     * CREATEDDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateddate() { return _columnCreateddate; }
    /**
     * TARGETMON: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetmon() { return _columnTargetmon; }
    /**
     * ITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * LBLKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLblkbn() { return _columnLblkbn; }
    /**
     * INOUTKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * VA_EXTDATA2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata2() { return _columnVaExtdata2; }
    /**
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocpolicykey() { return _columnAllocpolicykey; }
    /**
     * CASE_NUM: {decimal(33, 12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNum() { return _columnCaseNum; }
    /**
     * BADITEMCD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaditemcd() { return _columnBaditemcd; }
    /**
     * TODAY_NUM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTodayNum() { return _columnTodayNum; }
    /**
     * CREATEDNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatednum() { return _columnCreatednum; }
    /**
     * REPRINTEDFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReprintedflg() { return _columnReprintedflg; }
    /**
     * VA_EXTDATA1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrbaditemcaseId());
        ls.add(columnCreateddate());
        ls.add(columnTargetmon());
        ls.add(columnItemcd());
        ls.add(columnProductAbbr());
        ls.add(columnLblkbn());
        ls.add(columnInoutkbn());
        ls.add(columnVaExtdata2());
        ls.add(columnAllocpolicykey());
        ls.add(columnCaseNum());
        ls.add(columnBaditemcd());
        ls.add(columnTodayNum());
        ls.add(columnCreatednum());
        ls.add(columnReprintedflg());
        ls.add(columnVaExtdata1());
        ls.add(columnVersionNo());
        ls.add(columnUsernum3());
        ls.add(columnCenterId());
        ls.add(columnCenterNm());
        ls.add(columnClientId());
        ls.add(columnClientNm());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlNonconformityLabelList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlNonconformityLabelList> getEntityType() { return SqlNonconformityLabelList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlNonconformityLabelList newEntity() { return new SqlNonconformityLabelList(); }
    public SqlNonconformityLabelList newMyEntity() { return new SqlNonconformityLabelList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlNonconformityLabelList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlNonconformityLabelList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
