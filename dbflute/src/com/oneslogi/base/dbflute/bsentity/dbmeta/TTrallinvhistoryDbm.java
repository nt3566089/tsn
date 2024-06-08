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
 * The DB meta of T_TRALLINVHISTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrallinvhistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrallinvhistoryDbm _instance = new TTrallinvhistoryDbm();
    private TTrallinvhistoryDbm() {}
    public static TTrallinvhistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTrallinvhistoryId(), (et, vl) -> ((TTrallinvhistory)et).setTrallinvhistoryId(ctl(vl)), "trallinvhistoryId");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getExecutedate(), (et, vl) -> ((TTrallinvhistory)et).setExecutedate((String)vl), "executedate");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInoutkbn(), (et, vl) -> ((TTrallinvhistory)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getProductId(), (et, vl) -> ((TTrallinvhistory)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvtotalinv(), (et, vl) -> ((TTrallinvhistory)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvkeeplocinv(), (et, vl) -> ((TTrallinvhistory)et).setSysinvkeeplocinv(ctb(vl)), "sysinvkeeplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvreceivelocinv(), (et, vl) -> ((TTrallinvhistory)et).setSysinvreceivelocinv(ctb(vl)), "sysinvreceivelocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvdamageitem(), (et, vl) -> ((TTrallinvhistory)et).setSysinvdamageitem(ctb(vl)), "sysinvdamageitem");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvclssifylocinv(), (et, vl) -> ((TTrallinvhistory)et).setSysinvclssifylocinv(ctb(vl)), "sysinvclssifylocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvtmplocinv(), (et, vl) -> ((TTrallinvhistory)et).setSysinvtmplocinv(ctb(vl)), "sysinvtmplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getSysinvautoinv(), (et, vl) -> ((TTrallinvhistory)et).setSysinvautoinv(ctb(vl)), "sysinvautoinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvesttotalinv(), (et, vl) -> ((TTrallinvhistory)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvestkeeplocinv(), (et, vl) -> ((TTrallinvhistory)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvestreceivelocinv(), (et, vl) -> ((TTrallinvhistory)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvestdamageitem(), (et, vl) -> ((TTrallinvhistory)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvestclssifylocinv(), (et, vl) -> ((TTrallinvhistory)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvesttmplocinv(), (et, vl) -> ((TTrallinvhistory)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getInvestautoinv(), (et, vl) -> ((TTrallinvhistory)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlytotalinv(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlykeeplocinv(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlykeeplocinv(ctb(vl)), "ydaytlequlykeeplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlyreceivelocinv(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlyreceivelocinv(ctb(vl)), "ydaytlequlyreceivelocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlydamageitem(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlydamageitem(ctb(vl)), "ydaytlequlydamageitem");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlyclssifylocinv(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlyclssifylocinv(ctb(vl)), "ydaytlequlyclssifylocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlytmplocinv(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlytmplocinv(ctb(vl)), "ydaytlequlytmplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getYdaytlequlyautoinv(), (et, vl) -> ((TTrallinvhistory)et).setYdaytlequlyautoinv(ctb(vl)), "ydaytlequlyautoinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqytotalinv(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqytotalinv(ctb(vl)), "tdayeqytotalinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqykeeplocinv(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqykeeplocinv(ctb(vl)), "tdayeqykeeplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqyreceivelocinv(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqyreceivelocinv(ctb(vl)), "tdayeqyreceivelocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqydamageitem(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqydamageitem(ctb(vl)), "tdayeqydamageitem");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqyclssifylocinv(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqyclssifylocinv(ctb(vl)), "tdayeqyclssifylocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqytmplocinv(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqytmplocinv(ctb(vl)), "tdayeqytmplocinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getTdayeqyautoinv(), (et, vl) -> ((TTrallinvhistory)et).setTdayeqyautoinv(ctb(vl)), "tdayeqyautoinv");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getCapitemflg(), (et, vl) -> ((TTrallinvhistory)et).setCapitemflg(ctl(vl)), "capitemflg");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getCenterId(), (et, vl) -> ((TTrallinvhistory)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getClientId(), (et, vl) -> ((TTrallinvhistory)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getDelFlg(), (et, vl) -> ((TTrallinvhistory)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getVersionNo(), (et, vl) -> ((TTrallinvhistory)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getControlNo(), (et, vl) -> ((TTrallinvhistory)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getAddDt(), (et, vl) -> ((TTrallinvhistory)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getAddUser(), (et, vl) -> ((TTrallinvhistory)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getAddProcess(), (et, vl) -> ((TTrallinvhistory)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getUpdDt(), (et, vl) -> ((TTrallinvhistory)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getUpdUser(), (et, vl) -> ((TTrallinvhistory)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrallinvhistory)et).getUpdProcess(), (et, vl) -> ((TTrallinvhistory)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrallinvhistory)et).getMCenter(), (et, vl) -> ((TTrallinvhistory)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrallinvhistory)et).getMClient(), (et, vl) -> ((TTrallinvhistory)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRALLINVHISTORY";
    protected final String _tableDispName = "T_TRALLINVHISTORY";
    protected final String _tablePropertyName = "TTrallinvhistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRALLINVHISTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrallinvhistoryId = cci("TRALLINVHISTORY_ID", "TRALLINVHISTORY_ID", null, null, Long.class, "trallinvhistoryId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExecutedate = cci("EXECUTEDATE", "EXECUTEDATE", null, null, String.class, "executedate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
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
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrallinvhistoryId() { return _columnTrallinvhistoryId; }
    /**
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExecutedate() { return _columnExecutedate; }
    /**
     * INOUTKBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnTrallinvhistoryId());
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
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrallinvhistoryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRALLINVHISTORY_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrallinvhistoryList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRALLINVHISTORY_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrallinvhistoryList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrallinvhistory"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrallinvhistoryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrallinvhistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrallinvhistory> getEntityType() { return TTrallinvhistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrallinvhistory newEntity() { return new TTrallinvhistory(); }
    public TTrallinvhistory newMyEntity() { return new TTrallinvhistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrallinvhistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrallinvhistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}