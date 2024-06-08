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
 * The DB meta of SqlGoodItemDiffReportListCenter. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlGoodItemDiffReportListCenterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlGoodItemDiffReportListCenterDbm _instance = new SqlGoodItemDiffReportListCenterDbm();
    private SqlGoodItemDiffReportListCenterDbm() {}
    public static SqlGoodItemDiffReportListCenterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getCenterCd(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getCenterAbbr(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getInvdate(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setInvdate((String)vl), "invdate");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getProductCd(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getProductNm(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getDamageRefundKbn(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setDamageRefundKbn((String)vl), "damageRefundKbn");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getDiffoccarea(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setDiffoccarea((String)vl), "diffoccarea");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getCggdid(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getDiffQty(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setDiffQty(ctb(vl)), "diffQty");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getUserCd(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getUserNm(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getCggdidNm(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setCggdidNm((String)vl), "cggdidNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getInoutkbnNm(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setInoutkbnNm((String)vl), "inoutkbnNm");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getPrintcount(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setPrintcount(ctl(vl)), "printcount");
        setupEpg(_epgMap, et -> ((SqlGoodItemDiffReportListCenter)et).getEmtpyflag(), (et, vl) -> ((SqlGoodItemDiffReportListCenter)et).setEmtpyflag((String)vl), "emtpyflag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlGoodItemDiffReportListCenter";
    protected final String _tableDispName = "SqlGoodItemDiffReportListCenter";
    protected final String _tablePropertyName = "sqlGoodItemDiffReportListCenter";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlGoodItemDiffReportListCenter", _tableDbName);
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
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageRefundKbn = cci("DAMAGE_REFUND_KBN", "DAMAGE_REFUND_KBN", null, null, String.class, "damageRefundKbn", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffoccarea = cci("DIFFOCCAREA", "DIFFOCCAREA", null, null, String.class, "diffoccarea", null, false, false, false, "varchar", 2, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffQty = cci("DIFF_QTY", "DIFF_QTY", null, null, java.math.BigDecimal.class, "diffQty", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
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
     * DAMAGE_REFUND_KBN: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageRefundKbn() { return _columnDamageRefundKbn; }
    /**
     * DIFFOCCAREA: {varchar(2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffoccarea() { return _columnDiffoccarea; }
    /**
     * CGGDID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * DIFF_QTY: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffQty() { return _columnDiffQty; }
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
        ls.add(columnCenterAbbr());
        ls.add(columnInvdate());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnDamageRefundKbn());
        ls.add(columnDiffoccarea());
        ls.add(columnCggdid());
        ls.add(columnDiffQty());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportListCenter"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlGoodItemDiffReportListCenter> getEntityType() { return SqlGoodItemDiffReportListCenter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlGoodItemDiffReportListCenter newEntity() { return new SqlGoodItemDiffReportListCenter(); }
    public SqlGoodItemDiffReportListCenter newMyEntity() { return new SqlGoodItemDiffReportListCenter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlGoodItemDiffReportListCenter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlGoodItemDiffReportListCenter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
