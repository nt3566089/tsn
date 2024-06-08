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
 * The DB meta of SqlWTrallinvList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlWTrallinvListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlWTrallinvListDbm _instance = new SqlWTrallinvListDbm();
    private SqlWTrallinvListDbm() {}
    public static SqlWTrallinvListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getCenterId(), (et, vl) -> ((SqlWTrallinvList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getClientId(), (et, vl) -> ((SqlWTrallinvList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInoutkbn(), (et, vl) -> ((SqlWTrallinvList)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getProductId(), (et, vl) -> ((SqlWTrallinvList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvtotalinv(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvkeeplocinv(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvkeeplocinv(ctb(vl)), "sysinvkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvreceivelocinv(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvreceivelocinv(ctb(vl)), "sysinvreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvdamageitem(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvdamageitem(ctb(vl)), "sysinvdamageitem");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvclssifylocinv(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvclssifylocinv(ctb(vl)), "sysinvclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvtmplocinv(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvtmplocinv(ctb(vl)), "sysinvtmplocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getSysinvautoinv(), (et, vl) -> ((SqlWTrallinvList)et).setSysinvautoinv(ctb(vl)), "sysinvautoinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvesttotalinv(), (et, vl) -> ((SqlWTrallinvList)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvestkeeplocinv(), (et, vl) -> ((SqlWTrallinvList)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvestreceivelocinv(), (et, vl) -> ((SqlWTrallinvList)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvestdamageitem(), (et, vl) -> ((SqlWTrallinvList)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvestclssifylocinv(), (et, vl) -> ((SqlWTrallinvList)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvesttmplocinv(), (et, vl) -> ((SqlWTrallinvList)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getInvestautoinv(), (et, vl) -> ((SqlWTrallinvList)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getTdayeqytotalinv(), (et, vl) -> ((SqlWTrallinvList)et).setTdayeqytotalinv(ctb(vl)), "tdayeqytotalinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getTdayeqykeeplocinv(), (et, vl) -> ((SqlWTrallinvList)et).setTdayeqykeeplocinv(ctb(vl)), "tdayeqykeeplocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getTdayeqyreceivelocinv(), (et, vl) -> ((SqlWTrallinvList)et).setTdayeqyreceivelocinv(ctb(vl)), "tdayeqyreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getTdayeqydamageitem(), (et, vl) -> ((SqlWTrallinvList)et).setTdayeqydamageitem(ctb(vl)), "tdayeqydamageitem");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getTdayeqyclssifylocinv(), (et, vl) -> ((SqlWTrallinvList)et).setTdayeqyclssifylocinv(ctb(vl)), "tdayeqyclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getYdaytlequlytotalinv(), (et, vl) -> ((SqlWTrallinvList)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getYdaytlequlykeeplocinv(), (et, vl) -> ((SqlWTrallinvList)et).setYdaytlequlykeeplocinv(ctb(vl)), "ydaytlequlykeeplocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getYdaytlequlyreceivelocinv(), (et, vl) -> ((SqlWTrallinvList)et).setYdaytlequlyreceivelocinv(ctb(vl)), "ydaytlequlyreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getYdaytlequlydamageitem(), (et, vl) -> ((SqlWTrallinvList)et).setYdaytlequlydamageitem(ctb(vl)), "ydaytlequlydamageitem");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getYdaytlequlyclssifylocinv(), (et, vl) -> ((SqlWTrallinvList)et).setYdaytlequlyclssifylocinv(ctb(vl)), "ydaytlequlyclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getProductCd(), (et, vl) -> ((SqlWTrallinvList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlWTrallinvList)et).getUsernum4(), (et, vl) -> ((SqlWTrallinvList)et).setUsernum4(ctl(vl)), "usernum4");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlWTrallinvList";
    protected final String _tableDispName = "SqlWTrallinvList";
    protected final String _tablePropertyName = "sqlWTrallinvList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlWTrallinvList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtotalinv = cci("SYSINVTOTALINV", "SYSINVTOTALINV", null, null, java.math.BigDecimal.class, "sysinvtotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvkeeplocinv = cci("SYSINVKEEPLOCINV", "SYSINVKEEPLOCINV", null, null, java.math.BigDecimal.class, "sysinvkeeplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvreceivelocinv = cci("SYSINVRECEIVELOCINV", "SYSINVRECEIVELOCINV", null, null, java.math.BigDecimal.class, "sysinvreceivelocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvdamageitem = cci("SYSINVDAMAGEITEM", "SYSINVDAMAGEITEM", null, null, java.math.BigDecimal.class, "sysinvdamageitem", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvclssifylocinv = cci("SYSINVCLSSIFYLOCINV", "SYSINVCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "sysinvclssifylocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtmplocinv = cci("SYSINVTMPLOCINV", "SYSINVTMPLOCINV", null, null, java.math.BigDecimal.class, "sysinvtmplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvautoinv = cci("SYSINVAUTOINV", "SYSINVAUTOINV", null, null, java.math.BigDecimal.class, "sysinvautoinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttotalinv = cci("INVESTTOTALINV", "INVESTTOTALINV", null, null, java.math.BigDecimal.class, "investtotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestkeeplocinv = cci("INVESTKEEPLOCINV", "INVESTKEEPLOCINV", null, null, java.math.BigDecimal.class, "investkeeplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestreceivelocinv = cci("INVESTRECEIVELOCINV", "INVESTRECEIVELOCINV", null, null, java.math.BigDecimal.class, "investreceivelocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestdamageitem = cci("INVESTDAMAGEITEM", "INVESTDAMAGEITEM", null, null, java.math.BigDecimal.class, "investdamageitem", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestclssifylocinv = cci("INVESTCLSSIFYLOCINV", "INVESTCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "investclssifylocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttmplocinv = cci("INVESTTMPLOCINV", "INVESTTMPLOCINV", null, null, java.math.BigDecimal.class, "investtmplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestautoinv = cci("INVESTAUTOINV", "INVESTAUTOINV", null, null, java.math.BigDecimal.class, "investautoinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqytotalinv = cci("TDAYEQYTOTALINV", "TDAYEQYTOTALINV", null, null, java.math.BigDecimal.class, "tdayeqytotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqykeeplocinv = cci("TDAYEQYKEEPLOCINV", "TDAYEQYKEEPLOCINV", null, null, java.math.BigDecimal.class, "tdayeqykeeplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqyreceivelocinv = cci("TDAYEQYRECEIVELOCINV", "TDAYEQYRECEIVELOCINV", null, null, java.math.BigDecimal.class, "tdayeqyreceivelocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqydamageitem = cci("TDAYEQYDAMAGEITEM", "TDAYEQYDAMAGEITEM", null, null, java.math.BigDecimal.class, "tdayeqydamageitem", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqyclssifylocinv = cci("TDAYEQYCLSSIFYLOCINV", "TDAYEQYCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "tdayeqyclssifylocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlytotalinv = cci("YDAYTLEQULYTOTALINV", "YDAYTLEQULYTOTALINV", null, null, java.math.BigDecimal.class, "ydaytlequlytotalinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlykeeplocinv = cci("YDAYTLEQULYKEEPLOCINV", "YDAYTLEQULYKEEPLOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlykeeplocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlyreceivelocinv = cci("YDAYTLEQULYRECEIVELOCINV", "YDAYTLEQULYRECEIVELOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlyreceivelocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlydamageitem = cci("YDAYTLEQULYDAMAGEITEM", "YDAYTLEQULYDAMAGEITEM", null, null, java.math.BigDecimal.class, "ydaytlequlydamageitem", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlyclssifylocinv = cci("YDAYTLEQULYCLSSIFYLOCINV", "YDAYTLEQULYCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlyclssifylocinv", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum4 = cci("USERNUM4", "USERNUM4", null, null, Long.class, "usernum4", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

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
     * SYSINVTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvtotalinv() { return _columnSysinvtotalinv; }
    /**
     * SYSINVKEEPLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvkeeplocinv() { return _columnSysinvkeeplocinv; }
    /**
     * SYSINVRECEIVELOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvreceivelocinv() { return _columnSysinvreceivelocinv; }
    /**
     * SYSINVDAMAGEITEM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvdamageitem() { return _columnSysinvdamageitem; }
    /**
     * SYSINVCLSSIFYLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvclssifylocinv() { return _columnSysinvclssifylocinv; }
    /**
     * SYSINVTMPLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvtmplocinv() { return _columnSysinvtmplocinv; }
    /**
     * SYSINVAUTOINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvautoinv() { return _columnSysinvautoinv; }
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
     * TDAYEQYTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqytotalinv() { return _columnTdayeqytotalinv; }
    /**
     * TDAYEQYKEEPLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqykeeplocinv() { return _columnTdayeqykeeplocinv; }
    /**
     * TDAYEQYRECEIVELOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqyreceivelocinv() { return _columnTdayeqyreceivelocinv; }
    /**
     * TDAYEQYDAMAGEITEM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqydamageitem() { return _columnTdayeqydamageitem; }
    /**
     * TDAYEQYCLSSIFYLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqyclssifylocinv() { return _columnTdayeqyclssifylocinv; }
    /**
     * YDAYTLEQULYTOTALINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlytotalinv() { return _columnYdaytlequlytotalinv; }
    /**
     * YDAYTLEQULYKEEPLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlykeeplocinv() { return _columnYdaytlequlykeeplocinv; }
    /**
     * YDAYTLEQULYRECEIVELOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlyreceivelocinv() { return _columnYdaytlequlyreceivelocinv; }
    /**
     * YDAYTLEQULYDAMAGEITEM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlydamageitem() { return _columnYdaytlequlydamageitem; }
    /**
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlyclssifylocinv() { return _columnYdaytlequlyclssifylocinv; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * USERNUM4: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum4() { return _columnUsernum4; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
        ls.add(columnTdayeqytotalinv());
        ls.add(columnTdayeqykeeplocinv());
        ls.add(columnTdayeqyreceivelocinv());
        ls.add(columnTdayeqydamageitem());
        ls.add(columnTdayeqyclssifylocinv());
        ls.add(columnYdaytlequlytotalinv());
        ls.add(columnYdaytlequlykeeplocinv());
        ls.add(columnYdaytlequlyreceivelocinv());
        ls.add(columnYdaytlequlydamageitem());
        ls.add(columnYdaytlequlyclssifylocinv());
        ls.add(columnProductCd());
        ls.add(columnUsernum4());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlWTrallinvList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlWTrallinvList> getEntityType() { return SqlWTrallinvList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlWTrallinvList newEntity() { return new SqlWTrallinvList(); }
    public SqlWTrallinvList newMyEntity() { return new SqlWTrallinvList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlWTrallinvList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlWTrallinvList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
