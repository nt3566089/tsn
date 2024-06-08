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
 * The DB meta of T_TRINVCHECKINFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrinvcheckinfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrinvcheckinfoDbm _instance = new TTrinvcheckinfoDbm();
    private TTrinvcheckinfoDbm() {}
    public static TTrinvcheckinfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getTrinvcheckinfoId(), (et, vl) -> ((TTrinvcheckinfo)et).setTrinvcheckinfoId(ctl(vl)), "trinvcheckinfoId");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getWarehousecd(), (et, vl) -> ((TTrinvcheckinfo)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getExecutedate(), (et, vl) -> ((TTrinvcheckinfo)et).setExecutedate((String)vl), "executedate");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInoutkbn(), (et, vl) -> ((TTrinvcheckinfo)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getProductId(), (et, vl) -> ((TTrinvcheckinfo)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getDualitemcdflg(), (et, vl) -> ((TTrinvcheckinfo)et).setDualitemcdflg(ctb(vl)), "dualitemcdflg");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getDualitemcd(), (et, vl) -> ((TTrinvcheckinfo)et).setDualitemcd((String)vl), "dualitemcd");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getYdaytlequlytotalinv(), (et, vl) -> ((TTrinvcheckinfo)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getTdayeqytotalinv(), (et, vl) -> ((TTrinvcheckinfo)et).setTdayeqytotalinv(ctb(vl)), "tdayeqytotalinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getSysinvtotalinv(), (et, vl) -> ((TTrinvcheckinfo)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvesttotalinv(), (et, vl) -> ((TTrinvcheckinfo)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvestkeeplocinv(), (et, vl) -> ((TTrinvcheckinfo)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvestreceivelocinv(), (et, vl) -> ((TTrinvcheckinfo)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvestdamageitem(), (et, vl) -> ((TTrinvcheckinfo)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvestclssifylocinv(), (et, vl) -> ((TTrinvcheckinfo)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvesttmplocinv(), (et, vl) -> ((TTrinvcheckinfo)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getInvestautoinv(), (et, vl) -> ((TTrinvcheckinfo)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getExcesstotalinv(), (et, vl) -> ((TTrinvcheckinfo)et).setExcesstotalinv(ctb(vl)), "excesstotalinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getDefecttotalinv(), (et, vl) -> ((TTrinvcheckinfo)et).setDefecttotalinv(ctb(vl)), "defecttotalinv");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getCapitemflg(), (et, vl) -> ((TTrinvcheckinfo)et).setCapitemflg((String)vl), "capitemflg");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getCenterId(), (et, vl) -> ((TTrinvcheckinfo)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getClientId(), (et, vl) -> ((TTrinvcheckinfo)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getDelFlg(), (et, vl) -> ((TTrinvcheckinfo)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getVersionNo(), (et, vl) -> ((TTrinvcheckinfo)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getControlNo(), (et, vl) -> ((TTrinvcheckinfo)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getAddDt(), (et, vl) -> ((TTrinvcheckinfo)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getAddUser(), (et, vl) -> ((TTrinvcheckinfo)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getAddProcess(), (et, vl) -> ((TTrinvcheckinfo)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getUpdDt(), (et, vl) -> ((TTrinvcheckinfo)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getUpdUser(), (et, vl) -> ((TTrinvcheckinfo)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrinvcheckinfo)et).getUpdProcess(), (et, vl) -> ((TTrinvcheckinfo)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrinvcheckinfo)et).getMCenter(), (et, vl) -> ((TTrinvcheckinfo)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrinvcheckinfo)et).getMClient(), (et, vl) -> ((TTrinvcheckinfo)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TTrinvcheckinfo)et).getMProduct(), (et, vl) -> ((TTrinvcheckinfo)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRINVCHECKINFO";
    protected final String _tableDispName = "T_TRINVCHECKINFO";
    protected final String _tablePropertyName = "TTrinvcheckinfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRINVCHECKINFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrinvcheckinfoId = cci("TRINVCHECKINFO_ID", "TRINVCHECKINFO_ID", null, null, Long.class, "trinvcheckinfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExecutedate = cci("EXECUTEDATE", "EXECUTEDATE", null, null, String.class, "executedate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnDualitemcdflg = cci("DUALITEMCDFLG", "DUALITEMCDFLG", null, null, java.math.BigDecimal.class, "dualitemcdflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualitemcd = cci("DUALITEMCD", "DUALITEMCD", null, null, String.class, "dualitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlytotalinv = cci("YDAYTLEQULYTOTALINV", "YDAYTLEQULYTOTALINV", null, null, java.math.BigDecimal.class, "ydaytlequlytotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayeqytotalinv = cci("TDAYEQYTOTALINV", "TDAYEQYTOTALINV", null, null, java.math.BigDecimal.class, "tdayeqytotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtotalinv = cci("SYSINVTOTALINV", "SYSINVTOTALINV", null, null, java.math.BigDecimal.class, "sysinvtotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttotalinv = cci("INVESTTOTALINV", "INVESTTOTALINV", null, null, java.math.BigDecimal.class, "investtotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestkeeplocinv = cci("INVESTKEEPLOCINV", "INVESTKEEPLOCINV", null, null, java.math.BigDecimal.class, "investkeeplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestreceivelocinv = cci("INVESTRECEIVELOCINV", "INVESTRECEIVELOCINV", null, null, java.math.BigDecimal.class, "investreceivelocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestdamageitem = cci("INVESTDAMAGEITEM", "INVESTDAMAGEITEM", null, null, java.math.BigDecimal.class, "investdamageitem", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestclssifylocinv = cci("INVESTCLSSIFYLOCINV", "INVESTCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "investclssifylocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttmplocinv = cci("INVESTTMPLOCINV", "INVESTTMPLOCINV", null, null, java.math.BigDecimal.class, "investtmplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestautoinv = cci("INVESTAUTOINV", "INVESTAUTOINV", null, null, java.math.BigDecimal.class, "investautoinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcesstotalinv = cci("EXCESSTOTALINV", "EXCESSTOTALINV", null, null, java.math.BigDecimal.class, "excesstotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefecttotalinv = cci("DEFECTTOTALINV", "DEFECTTOTALINV", null, null, java.math.BigDecimal.class, "defecttotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapitemflg = cci("CAPITEMFLG", "CAPITEMFLG", null, null, String.class, "capitemflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrinvcheckinfoId() { return _columnTrinvcheckinfoId; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDualitemcdflg() { return _columnDualitemcdflg; }
    /**
     * DUALITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDualitemcd() { return _columnDualitemcd; }
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
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSysinvtotalinv() { return _columnSysinvtotalinv; }
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
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExcesstotalinv() { return _columnExcesstotalinv; }
    /**
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefecttotalinv() { return _columnDefecttotalinv; }
    /**
     * CAPITEMFLG: {char(1)}
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
        ls.add(columnTrinvcheckinfoId());
        ls.add(columnWarehousecd());
        ls.add(columnExecutedate());
        ls.add(columnInoutkbn());
        ls.add(columnProductId());
        ls.add(columnDualitemcdflg());
        ls.add(columnDualitemcd());
        ls.add(columnYdaytlequlytotalinv());
        ls.add(columnTdayeqytotalinv());
        ls.add(columnSysinvtotalinv());
        ls.add(columnInvesttotalinv());
        ls.add(columnInvestkeeplocinv());
        ls.add(columnInvestreceivelocinv());
        ls.add(columnInvestdamageitem());
        ls.add(columnInvestclssifylocinv());
        ls.add(columnInvesttmplocinv());
        ls.add(columnInvestautoinv());
        ls.add(columnExcesstotalinv());
        ls.add(columnDefecttotalinv());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrinvcheckinfoId()); }
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
        return cfi("T_TRINVCHECKINFO_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrinvcheckinfoList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRINVCHECKINFO_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrinvcheckinfoList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_TRINVCHECKINFO_FK3", "MProduct", this, MProductDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TTrinvcheckinfoList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrinvcheckinfo"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrinvcheckinfoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrinvcheckinfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrinvcheckinfo> getEntityType() { return TTrinvcheckinfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrinvcheckinfo newEntity() { return new TTrinvcheckinfo(); }
    public TTrinvcheckinfo newMyEntity() { return new TTrinvcheckinfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrinvcheckinfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrinvcheckinfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
