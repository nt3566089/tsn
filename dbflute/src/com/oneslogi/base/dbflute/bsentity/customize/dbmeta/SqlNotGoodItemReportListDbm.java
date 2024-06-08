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
 * The DB meta of SqlNotGoodItemReportList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlNotGoodItemReportListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlNotGoodItemReportListDbm _instance = new SqlNotGoodItemReportListDbm();
    private SqlNotGoodItemReportListDbm() {}
    public static SqlNotGoodItemReportListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getCenterCd(), (et, vl) -> ((SqlNotGoodItemReportList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getCenterNm(), (et, vl) -> ((SqlNotGoodItemReportList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getInvdate(), (et, vl) -> ((SqlNotGoodItemReportList)et).setInvdate((String)vl), "invdate");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getProductCd(), (et, vl) -> ((SqlNotGoodItemReportList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getProductNm(), (et, vl) -> ((SqlNotGoodItemReportList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getInadequacyarea(), (et, vl) -> ((SqlNotGoodItemReportList)et).setInadequacyarea((String)vl), "inadequacyarea");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getDiffqty(), (et, vl) -> ((SqlNotGoodItemReportList)et).setDiffqty(ctb(vl)), "diffqty");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getCggdid(), (et, vl) -> ((SqlNotGoodItemReportList)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getUserCd(), (et, vl) -> ((SqlNotGoodItemReportList)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getUserNm(), (et, vl) -> ((SqlNotGoodItemReportList)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getCggdidNm(), (et, vl) -> ((SqlNotGoodItemReportList)et).setCggdidNm((String)vl), "cggdidNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getInoutkbnNm(), (et, vl) -> ((SqlNotGoodItemReportList)et).setInoutkbnNm((String)vl), "inoutkbnNm");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getPrintcount(), (et, vl) -> ((SqlNotGoodItemReportList)et).setPrintcount(ctl(vl)), "printcount");
        setupEpg(_epgMap, et -> ((SqlNotGoodItemReportList)et).getEmtpyflag(), (et, vl) -> ((SqlNotGoodItemReportList)et).setEmtpyflag((String)vl), "emtpyflag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlNotGoodItemReportList";
    protected final String _tableDispName = "SqlNotGoodItemReportList";
    protected final String _tablePropertyName = "sqlNotGoodItemReportList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlNotGoodItemReportList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvdate = cci("INVDATE", "INVDATE", null, null, String.class, "invdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInadequacyarea = cci("INADEQUACYAREA", "INADEQUACYAREA", null, null, String.class, "inadequacyarea", null, false, false, false, "varchar", 2, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffqty = cci("DIFFQTY", "DIFFQTY", null, null, java.math.BigDecimal.class, "diffqty", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdidNm = cci("CGGDID_NM", "CGGDID_NM", null, null, String.class, "cggdidNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbnNm = cci("INOUTKBN_NM", "INOUTKBN_NM", null, null, String.class, "inoutkbnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintcount = cci("PRINTCOUNT", "PRINTCOUNT", null, null, Long.class, "printcount", null, false, false, false, "numeric", 11, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmtpyflag = cci("EMTPYFLAG", "EMTPYFLAG", null, null, String.class, "emtpyflag", null, false, false, false, "varchar", 19, 0, null, null, false, null, null, null, null, null, false);

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
     * INVDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvdate() { return _columnInvdate; }
    /**
     * PRODUCT_CD: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * INADEQUACYAREA: {varchar(2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInadequacyarea() { return _columnInadequacyarea; }
    /**
     * DIFFQTY: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffqty() { return _columnDiffqty; }
    /**
     * CGGDID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * CGGDID_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdidNm() { return _columnCggdidNm; }
    /**
     * INOUTKBN_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbnNm() { return _columnInoutkbnNm; }
    /**
     * PRINTCOUNT: {numeric(11)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintcount() { return _columnPrintcount; }
    /**
     * EMTPYFLAG: {varchar(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmtpyflag() { return _columnEmtpyflag; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnInvdate());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnInadequacyarea());
        ls.add(columnDiffqty());
        ls.add(columnCggdid());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
        ls.add(columnCggdidNm());
        ls.add(columnInoutkbnNm());
        ls.add(columnPrintcount());
        ls.add(columnEmtpyflag());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlNotGoodItemReportList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlNotGoodItemReportList> getEntityType() { return SqlNotGoodItemReportList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlNotGoodItemReportList newEntity() { return new SqlNotGoodItemReportList(); }
    public SqlNotGoodItemReportList newMyEntity() { return new SqlNotGoodItemReportList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlNotGoodItemReportList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlNotGoodItemReportList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
