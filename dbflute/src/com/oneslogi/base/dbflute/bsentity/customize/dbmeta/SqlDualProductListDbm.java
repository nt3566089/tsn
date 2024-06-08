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
 * The DB meta of SqlDualProductList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlDualProductListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlDualProductListDbm _instance = new SqlDualProductListDbm();
    private SqlDualProductListDbm() {}
    public static SqlDualProductListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getCenterCd(), (et, vl) -> ((SqlDualProductList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getExecutedate(), (et, vl) -> ((SqlDualProductList)et).setExecutedate((String)vl), "executedate");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInoutkbn(), (et, vl) -> ((SqlDualProductList)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getProductId(), (et, vl) -> ((SqlDualProductList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvtotalinv(), (et, vl) -> ((SqlDualProductList)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvkeeplocinv(), (et, vl) -> ((SqlDualProductList)et).setSysinvkeeplocinv(ctb(vl)), "sysinvkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvreceivelocinv(), (et, vl) -> ((SqlDualProductList)et).setSysinvreceivelocinv(ctb(vl)), "sysinvreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvdamageitem(), (et, vl) -> ((SqlDualProductList)et).setSysinvdamageitem(ctb(vl)), "sysinvdamageitem");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvclssifylocinv(), (et, vl) -> ((SqlDualProductList)et).setSysinvclssifylocinv(ctb(vl)), "sysinvclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvtmplocinv(), (et, vl) -> ((SqlDualProductList)et).setSysinvtmplocinv(ctb(vl)), "sysinvtmplocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getSysinvautoinv(), (et, vl) -> ((SqlDualProductList)et).setSysinvautoinv(ctb(vl)), "sysinvautoinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvesttotalinv(), (et, vl) -> ((SqlDualProductList)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvestkeeplocinv(), (et, vl) -> ((SqlDualProductList)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvestreceivelocinv(), (et, vl) -> ((SqlDualProductList)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvestdamageitem(), (et, vl) -> ((SqlDualProductList)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvestclssifylocinv(), (et, vl) -> ((SqlDualProductList)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvesttmplocinv(), (et, vl) -> ((SqlDualProductList)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getInvestautoinv(), (et, vl) -> ((SqlDualProductList)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getYdaytlequlytotalinv(), (et, vl) -> ((SqlDualProductList)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getTdayeqytotalinv(), (et, vl) -> ((SqlDualProductList)et).setTdayeqytotalinv(ctb(vl)), "tdayeqytotalinv");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getCapitemflg(), (et, vl) -> ((SqlDualProductList)et).setCapitemflg((String)vl), "capitemflg");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getCenterId(), (et, vl) -> ((SqlDualProductList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getClientId(), (et, vl) -> ((SqlDualProductList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getDualproductid(), (et, vl) -> ((SqlDualProductList)et).setDualproductid(ctl(vl)), "dualproductid");
        setupEpg(_epgMap, et -> ((SqlDualProductList)et).getDualitemcd(), (et, vl) -> ((SqlDualProductList)et).setDualitemcd((String)vl), "dualitemcd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlDualProductList";
    protected final String _tableDispName = "SqlDualProductList";
    protected final String _tablePropertyName = "sqlDualProductList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlDualProductList", _tableDbName);
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
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtotalinv = cci("SYSINVTOTALINV", "SYSINVTOTALINV", null, null, java.math.BigDecimal.class, "sysinvtotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvkeeplocinv = cci("SYSINVKEEPLOCINV", "SYSINVKEEPLOCINV", null, null, java.math.BigDecimal.class, "sysinvkeeplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvreceivelocinv = cci("SYSINVRECEIVELOCINV", "SYSINVRECEIVELOCINV", null, null, java.math.BigDecimal.class, "sysinvreceivelocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvdamageitem = cci("SYSINVDAMAGEITEM", "SYSINVDAMAGEITEM", null, null, java.math.BigDecimal.class, "sysinvdamageitem", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvclssifylocinv = cci("SYSINVCLSSIFYLOCINV", "SYSINVCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "sysinvclssifylocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtmplocinv = cci("SYSINVTMPLOCINV", "SYSINVTMPLOCINV", null, null, java.math.BigDecimal.class, "sysinvtmplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvautoinv = cci("SYSINVAUTOINV", "SYSINVAUTOINV", null, null, java.math.BigDecimal.class, "sysinvautoinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttotalinv = cci("INVESTTOTALINV", "INVESTTOTALINV", null, null, java.math.BigDecimal.class, "investtotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestkeeplocinv = cci("INVESTKEEPLOCINV", "INVESTKEEPLOCINV", null, null, java.math.BigDecimal.class, "investkeeplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestreceivelocinv = cci("INVESTRECEIVELOCINV", "INVESTRECEIVELOCINV", null, null, java.math.BigDecimal.class, "investreceivelocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestdamageitem = cci("INVESTDAMAGEITEM", "INVESTDAMAGEITEM", null, null, java.math.BigDecimal.class, "investdamageitem", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestclssifylocinv = cci("INVESTCLSSIFYLOCINV", "INVESTCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "investclssifylocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttmplocinv = cci("INVESTTMPLOCINV", "INVESTTMPLOCINV", null, null, java.math.BigDecimal.class, "investtmplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestautoinv = cci("INVESTAUTOINV", "INVESTAUTOINV", null, null, java.math.BigDecimal.class, "investautoinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlytotalinv = cci("YDAYTLEQULYTOTALINV", "YDAYTLEQULYTOTALINV", null, null, java.math.BigDecimal.class, "ydaytlequlytotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqytotalinv = cci("TDAYEQYTOTALINV", "TDAYEQYTOTALINV", null, null, java.math.BigDecimal.class, "tdayeqytotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapitemflg = cci("CAPITEMFLG", "CAPITEMFLG", null, null, String.class, "capitemflg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualproductid = cci("DUALPRODUCTID", "DUALPRODUCTID", null, null, Long.class, "dualproductid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualitemcd = cci("DUALITEMCD", "DUALITEMCD", null, null, String.class, "dualitemcd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);

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
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvtotalinv() { return _columnSysinvtotalinv; }
    /**
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvkeeplocinv() { return _columnSysinvkeeplocinv; }
    /**
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvreceivelocinv() { return _columnSysinvreceivelocinv; }
    /**
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvdamageitem() { return _columnSysinvdamageitem; }
    /**
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvclssifylocinv() { return _columnSysinvclssifylocinv; }
    /**
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvtmplocinv() { return _columnSysinvtmplocinv; }
    /**
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvautoinv() { return _columnSysinvautoinv; }
    /**
     * INVESTTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvesttotalinv() { return _columnInvesttotalinv; }
    /**
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestkeeplocinv() { return _columnInvestkeeplocinv; }
    /**
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestreceivelocinv() { return _columnInvestreceivelocinv; }
    /**
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestdamageitem() { return _columnInvestdamageitem; }
    /**
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestclssifylocinv() { return _columnInvestclssifylocinv; }
    /**
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvesttmplocinv() { return _columnInvesttmplocinv; }
    /**
     * INVESTAUTOINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvestautoinv() { return _columnInvestautoinv; }
    /**
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlytotalinv() { return _columnYdaytlequlytotalinv; }
    /**
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqytotalinv() { return _columnTdayeqytotalinv; }
    /**
     * CAPITEMFLG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapitemflg() { return _columnCapitemflg; }
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
     * DUALITEMCD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDualitemcd() { return _columnDualitemcd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterCd());
        ls.add(columnExecutedate());
        ls.add(columnInoutkbn());
        ls.add(columnProductId());
        ls.add(columnSysinvtotalinv());
        ls.add(columnSysinvkeeplocinv());
        ls.add(columnSysinvreceivelocinv());
        ls.add(columnSysinvdamageitem());
        ls.add(columnSysinvclssifylocinv());
        ls.add(columnSysinvtmplocinv());
        ls.add(columnSysinvautoinv());
        ls.add(columnInvesttotalinv());
        ls.add(columnInvestkeeplocinv());
        ls.add(columnInvestreceivelocinv());
        ls.add(columnInvestdamageitem());
        ls.add(columnInvestclssifylocinv());
        ls.add(columnInvesttmplocinv());
        ls.add(columnInvestautoinv());
        ls.add(columnYdaytlequlytotalinv());
        ls.add(columnTdayeqytotalinv());
        ls.add(columnCapitemflg());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnDualproductid());
        ls.add(columnDualitemcd());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlDualProductList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlDualProductList> getEntityType() { return SqlDualProductList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlDualProductList newEntity() { return new SqlDualProductList(); }
    public SqlDualProductList newMyEntity() { return new SqlDualProductList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlDualProductList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlDualProductList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
