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
 * The DB meta of SqlNonconformityLabelPrintList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlNonconformityLabelPrintListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlNonconformityLabelPrintListDbm _instance = new SqlNonconformityLabelPrintListDbm();
    private SqlNonconformityLabelPrintListDbm() {}
    public static SqlNonconformityLabelPrintListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getTrbaditemcaseId(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setTrbaditemcaseId(ctl(vl)), "trbaditemcaseId");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getTargetmon(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setTargetmon((String)vl), "targetmon");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getBaditemcd(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setBaditemcd(ctb(vl)), "baditemcd");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getItemcd(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getCreateddate(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setCreateddate((String)vl), "createddate");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getInoutkbn(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getVaExtdata2(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getCenterCd(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getCenterNm(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getProductAbbr(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getCaseNum(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setCaseNum(ctb(vl)), "caseNum");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getAllocpolicykey(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setAllocpolicykey(ctb(vl)), "allocpolicykey");
        setupEpg(_epgMap, et -> ((SqlNonconformityLabelPrintList)et).getUsernum3(), (et, vl) -> ((SqlNonconformityLabelPrintList)et).setUsernum3(ctl(vl)), "usernum3");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlNonconformityLabelPrintList";
    protected final String _tableDispName = "SqlNonconformityLabelPrintList";
    protected final String _tablePropertyName = "sqlNonconformityLabelPrintList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlNonconformityLabelPrintList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrbaditemcaseId = cci("TRBADITEMCASE_ID", "TRBADITEMCASE_ID", null, null, Long.class, "trbaditemcaseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetmon = cci("TARGETMON", "TARGETMON", null, null, String.class, "targetmon", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaditemcd = cci("BADITEMCD", "BADITEMCD", null, null, java.math.BigDecimal.class, "baditemcd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateddate = cci("CREATEDDATE", "CREATEDDATE", null, null, String.class, "createddate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseNum = cci("CASE_NUM", "CASE_NUM", null, null, java.math.BigDecimal.class, "caseNum", null, false, false, false, "decimal", 33, 12, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocpolicykey = cci("ALLOCPOLICYKEY", "ALLOCPOLICYKEY", null, null, java.math.BigDecimal.class, "allocpolicykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TRBADITEMCASE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrbaditemcaseId() { return _columnTrbaditemcaseId; }
    /**
     * TARGETMON: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetmon() { return _columnTargetmon; }
    /**
     * BADITEMCD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaditemcd() { return _columnBaditemcd; }
    /**
     * ITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
    /**
     * CREATEDDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateddate() { return _columnCreateddate; }
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
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * CASE_NUM: {decimal(33, 12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNum() { return _columnCaseNum; }
    /**
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocpolicykey() { return _columnAllocpolicykey; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrbaditemcaseId());
        ls.add(columnTargetmon());
        ls.add(columnBaditemcd());
        ls.add(columnItemcd());
        ls.add(columnCreateddate());
        ls.add(columnInoutkbn());
        ls.add(columnVaExtdata2());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnProductAbbr());
        ls.add(columnCaseNum());
        ls.add(columnAllocpolicykey());
        ls.add(columnUsernum3());
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlNonconformityLabelPrintList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlNonconformityLabelPrintList> getEntityType() { return SqlNonconformityLabelPrintList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlNonconformityLabelPrintList newEntity() { return new SqlNonconformityLabelPrintList(); }
    public SqlNonconformityLabelPrintList newMyEntity() { return new SqlNonconformityLabelPrintList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlNonconformityLabelPrintList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlNonconformityLabelPrintList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
