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
 * The DB meta of SqlTTrallinvList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTTrallinvListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTTrallinvListDbm _instance = new SqlTTrallinvListDbm();
    private SqlTTrallinvListDbm() {}
    public static SqlTTrallinvListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTrallinvId(), (et, vl) -> ((SqlTTrallinvList)et).setTrallinvId(ctl(vl)), "trallinvId");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getCenterId(), (et, vl) -> ((SqlTTrallinvList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getClientId(), (et, vl) -> ((SqlTTrallinvList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getExecutedate(), (et, vl) -> ((SqlTTrallinvList)et).setExecutedate((String)vl), "executedate");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInoutkbn(), (et, vl) -> ((SqlTTrallinvList)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvtotalinv(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvkeeplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvkeeplocinv(ctb(vl)), "sysinvkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvreceivelocinv(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvreceivelocinv(ctb(vl)), "sysinvreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvdamageitem(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvdamageitem(ctb(vl)), "sysinvdamageitem");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvclssifylocinv(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvclssifylocinv(ctb(vl)), "sysinvclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvtmplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvtmplocinv(ctb(vl)), "sysinvtmplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getSysinvautoinv(), (et, vl) -> ((SqlTTrallinvList)et).setSysinvautoinv(ctb(vl)), "sysinvautoinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvesttotalinv(), (et, vl) -> ((SqlTTrallinvList)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvestkeeplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvestreceivelocinv(), (et, vl) -> ((SqlTTrallinvList)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvestdamageitem(), (et, vl) -> ((SqlTTrallinvList)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvestclssifylocinv(), (et, vl) -> ((SqlTTrallinvList)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvesttmplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getInvestautoinv(), (et, vl) -> ((SqlTTrallinvList)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlytotalinv(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlykeeplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlykeeplocinv(ctb(vl)), "ydaytlequlykeeplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlyreceivelocinv(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlyreceivelocinv(ctb(vl)), "ydaytlequlyreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlydamageitem(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlydamageitem(ctb(vl)), "ydaytlequlydamageitem");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlyclssifylocinv(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlyclssifylocinv(ctb(vl)), "ydaytlequlyclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlytmplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlytmplocinv(ctb(vl)), "ydaytlequlytmplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getYdaytlequlyautoinv(), (et, vl) -> ((SqlTTrallinvList)et).setYdaytlequlyautoinv(ctb(vl)), "ydaytlequlyautoinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqytotalinv(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqytotalinv(ctb(vl)), "tdayeqytotalinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqykeeplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqykeeplocinv(ctb(vl)), "tdayeqykeeplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqyreceivelocinv(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqyreceivelocinv(ctb(vl)), "tdayeqyreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqydamageitem(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqydamageitem(ctb(vl)), "tdayeqydamageitem");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqyclssifylocinv(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqyclssifylocinv(ctb(vl)), "tdayeqyclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqytmplocinv(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqytmplocinv(ctb(vl)), "tdayeqytmplocinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getTdayeqyautoinv(), (et, vl) -> ((SqlTTrallinvList)et).setTdayeqyautoinv(ctb(vl)), "tdayeqyautoinv");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getCapitemflg(), (et, vl) -> ((SqlTTrallinvList)et).setCapitemflg(ctl(vl)), "capitemflg");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getProductId(), (et, vl) -> ((SqlTTrallinvList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getDelFlg(), (et, vl) -> ((SqlTTrallinvList)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getVersionNo(), (et, vl) -> ((SqlTTrallinvList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getControlNo(), (et, vl) -> ((SqlTTrallinvList)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getAddDt(), (et, vl) -> ((SqlTTrallinvList)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getAddUser(), (et, vl) -> ((SqlTTrallinvList)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getAddProcess(), (et, vl) -> ((SqlTTrallinvList)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getUpdDt(), (et, vl) -> ((SqlTTrallinvList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getUpdUser(), (et, vl) -> ((SqlTTrallinvList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlTTrallinvList)et).getUpdProcess(), (et, vl) -> ((SqlTTrallinvList)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTTrallinvList";
    protected final String _tableDispName = "SqlTTrallinvList";
    protected final String _tablePropertyName = "sqlTTrallinvList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTTrallinvList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrallinvId = cci("TRALLINV_ID", "TRALLINV_ID", null, null, Long.class, "trallinvId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExecutedate = cci("EXECUTEDATE", "EXECUTEDATE", null, null, String.class, "executedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnYdaytlequlykeeplocinv = cci("YDAYTLEQULYKEEPLOCINV", "YDAYTLEQULYKEEPLOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlykeeplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlyreceivelocinv = cci("YDAYTLEQULYRECEIVELOCINV", "YDAYTLEQULYRECEIVELOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlyreceivelocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlydamageitem = cci("YDAYTLEQULYDAMAGEITEM", "YDAYTLEQULYDAMAGEITEM", null, null, java.math.BigDecimal.class, "ydaytlequlydamageitem", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlyclssifylocinv = cci("YDAYTLEQULYCLSSIFYLOCINV", "YDAYTLEQULYCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlyclssifylocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlytmplocinv = cci("YDAYTLEQULYTMPLOCINV", "YDAYTLEQULYTMPLOCINV", null, null, java.math.BigDecimal.class, "ydaytlequlytmplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlyautoinv = cci("YDAYTLEQULYAUTOINV", "YDAYTLEQULYAUTOINV", null, null, java.math.BigDecimal.class, "ydaytlequlyautoinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqytotalinv = cci("TDAYEQYTOTALINV", "TDAYEQYTOTALINV", null, null, java.math.BigDecimal.class, "tdayeqytotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqykeeplocinv = cci("TDAYEQYKEEPLOCINV", "TDAYEQYKEEPLOCINV", null, null, java.math.BigDecimal.class, "tdayeqykeeplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqyreceivelocinv = cci("TDAYEQYRECEIVELOCINV", "TDAYEQYRECEIVELOCINV", null, null, java.math.BigDecimal.class, "tdayeqyreceivelocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqydamageitem = cci("TDAYEQYDAMAGEITEM", "TDAYEQYDAMAGEITEM", null, null, java.math.BigDecimal.class, "tdayeqydamageitem", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqyclssifylocinv = cci("TDAYEQYCLSSIFYLOCINV", "TDAYEQYCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "tdayeqyclssifylocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqytmplocinv = cci("TDAYEQYTMPLOCINV", "TDAYEQYTMPLOCINV", null, null, java.math.BigDecimal.class, "tdayeqytmplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqyautoinv = cci("TDAYEQYAUTOINV", "TDAYEQYAUTOINV", null, null, java.math.BigDecimal.class, "tdayeqyautoinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapitemflg = cci("CAPITEMFLG", "CAPITEMFLG", null, null, Long.class, "capitemflg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * TRALLINV_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrallinvId() { return _columnTrallinvId; }
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
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlykeeplocinv() { return _columnYdaytlequlykeeplocinv; }
    /**
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlyreceivelocinv() { return _columnYdaytlequlyreceivelocinv; }
    /**
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlydamageitem() { return _columnYdaytlequlydamageitem; }
    /**
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlyclssifylocinv() { return _columnYdaytlequlyclssifylocinv; }
    /**
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlytmplocinv() { return _columnYdaytlequlytmplocinv; }
    /**
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYdaytlequlyautoinv() { return _columnYdaytlequlyautoinv; }
    /**
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqytotalinv() { return _columnTdayeqytotalinv; }
    /**
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqykeeplocinv() { return _columnTdayeqykeeplocinv; }
    /**
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqyreceivelocinv() { return _columnTdayeqyreceivelocinv; }
    /**
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqydamageitem() { return _columnTdayeqydamageitem; }
    /**
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqyclssifylocinv() { return _columnTdayeqyclssifylocinv; }
    /**
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqytmplocinv() { return _columnTdayeqytmplocinv; }
    /**
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayeqyautoinv() { return _columnTdayeqyautoinv; }
    /**
     * CAPITEMFLG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapitemflg() { return _columnCapitemflg; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {bigint(19)}
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
        ls.add(columnTrallinvId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnExecutedate());
        ls.add(columnInoutkbn());
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
        ls.add(columnYdaytlequlykeeplocinv());
        ls.add(columnYdaytlequlyreceivelocinv());
        ls.add(columnYdaytlequlydamageitem());
        ls.add(columnYdaytlequlyclssifylocinv());
        ls.add(columnYdaytlequlytmplocinv());
        ls.add(columnYdaytlequlyautoinv());
        ls.add(columnTdayeqytotalinv());
        ls.add(columnTdayeqykeeplocinv());
        ls.add(columnTdayeqyreceivelocinv());
        ls.add(columnTdayeqydamageitem());
        ls.add(columnTdayeqyclssifylocinv());
        ls.add(columnTdayeqytmplocinv());
        ls.add(columnTdayeqyautoinv());
        ls.add(columnCapitemflg());
        ls.add(columnProductId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTTrallinvList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTTrallinvList> getEntityType() { return SqlTTrallinvList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTTrallinvList newEntity() { return new SqlTTrallinvList(); }
    public SqlTTrallinvList newMyEntity() { return new SqlTTrallinvList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTTrallinvList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTTrallinvList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}