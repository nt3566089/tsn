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
 * The DB meta of SqlGoodItemDiffReportList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlGoodItemDiffReportListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlGoodItemDiffReportListDbm _instance = new SqlGoodItemDiffReportListDbm();
    private SqlGoodItemDiffReportListDbm() {}
    public static SqlGoodItemDiffReportListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getCenterCd(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getCenterAbbr(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getInvdate(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setInvdate((String)vl), "invdate");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getProductCd(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getProductAbbr(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getDamageRefundKbn(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setDamageRefundKbn((String)vl), "damageRefundKbn");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getDiffoccArea(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setDiffoccArea((String)vl), "diffoccArea");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getDiffQty(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setDiffQty(ctb(vl)), "diffQty");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getCggdid(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getUserCd(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getUserNm(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getCggdidNm(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setCggdidNm((String)vl), "cggdidNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getInoutkbnNm(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setInoutkbnNm((String)vl), "inoutkbnNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getPrintcount(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setPrintcount(ctl(vl)), "printcount");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportList)et).getEmtpyflag(), (et, vl) -> ((SqlGoodItemDiffReportList)et).setEmtpyflag((String)vl), "emtpyflag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlGoodItemDiffReportList";
    protected final String _tableDispName = "SqlGoodItemDiffReportList";
    protected final String _tablePropertyName = "sqlGoodItemDiffReportList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlGoodItemDiffReportList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvdate = cci("INVDATE", "INVDATE", null, null, String.class, "invdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageRefundKbn = cci("DAMAGE_REFUND_KBN", "DAMAGE_REFUND_KBN", null, null, String.class, "damageRefundKbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffoccArea = cci("DIFFOCC_AREA", "DIFFOCC_AREA", null, null, String.class, "diffoccArea", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffQty = cci("DIFF_QTY", "DIFF_QTY", null, null, java.math.BigDecimal.class, "diffQty", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdidNm = cci("CGGDID_NM", "CGGDID_NM", null, null, String.class, "cggdidNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbnNm = cci("INOUTKBN_NM", "INOUTKBN_NM", null, null, String.class, "inoutkbnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintcount = cci("PRINTCOUNT", "PRINTCOUNT", null, null, Long.class, "printcount", null, false, false, false, "numeric", 11, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmtpyflag = cci("EMTPYFLAG", "EMTPYFLAG", null, null, String.class, "emtpyflag", null, false, false, false, "varchar", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * INVDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvdate() { return _columnInvdate; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * DAMAGE_REFUND_KBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageRefundKbn() { return _columnDamageRefundKbn; }
    /**
     * DIFFOCC_AREA: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffoccArea() { return _columnDiffoccArea; }
    /**
     * DIFF_QTY: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffQty() { return _columnDiffQty; }
    /**
     * CGGDID: {varchar(30)}
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
     * CGGDID_NM: {varchar(100)}
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
        ls.add(columnCenterAbbr());
        ls.add(columnInvdate());
        ls.add(columnProductCd());
        ls.add(columnProductAbbr());
        ls.add(columnDamageRefundKbn());
        ls.add(columnDiffoccArea());
        ls.add(columnDiffQty());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlGoodItemDiffReportList> getEntityType() { return SqlGoodItemDiffReportList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlGoodItemDiffReportList newEntity() { return new SqlGoodItemDiffReportList(); }
    public SqlGoodItemDiffReportList newMyEntity() { return new SqlGoodItemDiffReportList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlGoodItemDiffReportList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlGoodItemDiffReportList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
