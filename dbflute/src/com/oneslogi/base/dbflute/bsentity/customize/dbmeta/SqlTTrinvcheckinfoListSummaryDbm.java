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
 * The DB meta of SqlTTrinvcheckinfoListSummary. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTTrinvcheckinfoListSummaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTTrinvcheckinfoListSummaryDbm _instance = new SqlTTrinvcheckinfoListSummaryDbm();
    private SqlTTrinvcheckinfoListSummaryDbm() {}
    public static SqlTTrinvcheckinfoListSummaryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getCenterCd(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getExecutedate(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setExecutedate((String)vl), "executedate");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInoutkbn(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getDualitemcd(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setDualitemcd((String)vl), "dualitemcd");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getCenterId(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getClientId(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getDualproductid(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setDualproductid(ctl(vl)), "dualproductid");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getCapitemflg(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setCapitemflg((String)vl), "capitemflg");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getSysinvtotalinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvesttotalinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvestkeeplocinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvestreceivelocinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvestdamageitem(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvestclssifylocinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvesttmplocinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getInvestautoinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getYdaytlequlytotalinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrinvcheckinfoListSummary)et).getTdayeqytotalinv(), (et, vl) -> ((SqlTTrinvcheckinfoListSummary)et).setTdayeqytotalinv(ctb(vl)), "tdayeqytotalinv");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTTrinvcheckinfoListSummary";
    protected final String _tableDispName = "SqlTTrinvcheckinfoListSummary";
    protected final String _tablePropertyName = "sqlTTrinvcheckinfoListSummary";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTTrinvcheckinfoListSummary", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExecutedate = cci("EXECUTEDATE", "EXECUTEDATE", null, null, String.class, "executedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualitemcd = cci("DUALITEMCD", "DUALITEMCD", null, null, String.class, "dualitemcd", null, false, false, false, "nvarchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualproductid = cci("DUALPRODUCTID", "DUALPRODUCTID", null, null, Long.class, "dualproductid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapitemflg = cci("CAPITEMFLG", "CAPITEMFLG", null, null, String.class, "capitemflg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtotalinv = cci("SYSINVTOTALINV", "SYSINVTOTALINV", null, null, java.math.BigDecimal.class, "sysinvtotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttotalinv = cci("INVESTTOTALINV", "INVESTTOTALINV", null, null, java.math.BigDecimal.class, "investtotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestkeeplocinv = cci("INVESTKEEPLOCINV", "INVESTKEEPLOCINV", null, null, java.math.BigDecimal.class, "investkeeplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestreceivelocinv = cci("INVESTRECEIVELOCINV", "INVESTRECEIVELOCINV", null, null, java.math.BigDecimal.class, "investreceivelocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestdamageitem = cci("INVESTDAMAGEITEM", "INVESTDAMAGEITEM", null, null, java.math.BigDecimal.class, "investdamageitem", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestclssifylocinv = cci("INVESTCLSSIFYLOCINV", "INVESTCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "investclssifylocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttmplocinv = cci("INVESTTMPLOCINV", "INVESTTMPLOCINV", null, null, java.math.BigDecimal.class, "investtmplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestautoinv = cci("INVESTAUTOINV", "INVESTAUTOINV", null, null, java.math.BigDecimal.class, "investautoinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlytotalinv = cci("YDAYTLEQULYTOTALINV", "YDAYTLEQULYTOTALINV", null, null, java.math.BigDecimal.class, "ydaytlequlytotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqytotalinv = cci("TDAYEQYTOTALINV", "TDAYEQYTOTALINV", null, null, java.math.BigDecimal.class, "tdayeqytotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * EXECUTEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExecutedate() { return _columnExecutedate; }
    /**
     * INOUTKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * DUALITEMCD: {nvarchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDualitemcd() { return _columnDualitemcd; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * DUALPRODUCTID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDualproductid() { return _columnDualproductid; }
    /**
     * CAPITEMFLG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapitemflg() { return _columnCapitemflg; }
    /**
     * SYSINVTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvtotalinv() { return _columnSysinvtotalinv; }
    /**
     * INVESTTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvesttotalinv() { return _columnInvesttotalinv; }
    /**
     * INVESTKEEPLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestkeeplocinv() { return _columnInvestkeeplocinv; }
    /**
     * INVESTRECEIVELOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestreceivelocinv() { return _columnInvestreceivelocinv; }
    /**
     * INVESTDAMAGEITEM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestdamageitem() { return _columnInvestdamageitem; }
    /**
     * INVESTCLSSIFYLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestclssifylocinv() { return _columnInvestclssifylocinv; }
    /**
     * INVESTTMPLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvesttmplocinv() { return _columnInvesttmplocinv; }
    /**
     * INVESTAUTOINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestautoinv() { return _columnInvestautoinv; }
    /**
     * YDAYTLEQULYTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlytotalinv() { return _columnYdaytlequlytotalinv; }
    /**
     * TDAYEQYTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqytotalinv() { return _columnTdayeqytotalinv; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterCd());
        ls.add(columnExecutedate());
        ls.add(columnInoutkbn());
        ls.add(columnDualitemcd());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnDualproductid());
        ls.add(columnCapitemflg());
        ls.add(columnSysinvtotalinv());
        ls.add(columnInvesttotalinv());
        ls.add(columnInvestkeeplocinv());
        ls.add(columnInvestreceivelocinv());
        ls.add(columnInvestdamageitem());
        ls.add(columnInvestclssifylocinv());
        ls.add(columnInvesttmplocinv());
        ls.add(columnInvestautoinv());
        ls.add(columnYdaytlequlytotalinv());
        ls.add(columnTdayeqytotalinv());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTTrinvcheckinfoListSummary"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTTrinvcheckinfoListSummary> getEntityType() { return SqlTTrinvcheckinfoListSummary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTTrinvcheckinfoListSummary newEntity() { return new SqlTTrinvcheckinfoListSummary(); }
    public SqlTTrinvcheckinfoListSummary newMyEntity() { return new SqlTTrinvcheckinfoListSummary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTTrinvcheckinfoListSummary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTTrinvcheckinfoListSummary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
