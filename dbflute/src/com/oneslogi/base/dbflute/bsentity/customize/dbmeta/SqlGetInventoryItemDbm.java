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
 * The DB meta of SqlGetInventoryItem. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlGetInventoryItemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlGetInventoryItemDbm _instance = new SqlGetInventoryItemDbm();
    private SqlGetInventoryItemDbm() {}
    public static SqlGetInventoryItemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getCenterCd(), (et, vl) -> ((SqlGetInventoryItem)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getCenterNm(), (et, vl) -> ((SqlGetInventoryItem)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getStockdate(), (et, vl) -> ((SqlGetInventoryItem)et).setStockdate((String)vl), "stockdate");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getProductCd(), (et, vl) -> ((SqlGetInventoryItem)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getItemName(), (et, vl) -> ((SqlGetInventoryItem)et).setItemName((String)vl), "itemName");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getDualitemcdflg(), (et, vl) -> ((SqlGetInventoryItem)et).setDualitemcdflg(ctb(vl)), "dualitemcdflg");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getDualitemcd(), (et, vl) -> ((SqlGetInventoryItem)et).setDualitemcd((String)vl), "dualitemcd");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getYdaytlequlytotalinv(), (et, vl) -> ((SqlGetInventoryItem)et).setYdaytlequlytotalinv(ctb(vl)), "ydaytlequlytotalinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getTdayDiff(), (et, vl) -> ((SqlGetInventoryItem)et).setTdayDiff(ctb(vl)), "tdayDiff");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getSysinvtotalinv(), (et, vl) -> ((SqlGetInventoryItem)et).setSysinvtotalinv(ctb(vl)), "sysinvtotalinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvesttotalinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInvesttotalinv(ctb(vl)), "investtotalinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvestkeeplocinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInvestkeeplocinv(ctb(vl)), "investkeeplocinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvestreceivelocinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInvestreceivelocinv(ctb(vl)), "investreceivelocinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvestdamageitem(), (et, vl) -> ((SqlGetInventoryItem)et).setInvestdamageitem(ctb(vl)), "investdamageitem");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvestclssifylocinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInvestclssifylocinv(ctb(vl)), "investclssifylocinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvesttmplocinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInvesttmplocinv(ctb(vl)), "investtmplocinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInvestautoinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInvestautoinv(ctb(vl)), "investautoinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getExcesstotalinv(), (et, vl) -> ((SqlGetInventoryItem)et).setExcesstotalinv(ctb(vl)), "excesstotalinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getDefecttotalinv(), (et, vl) -> ((SqlGetInventoryItem)et).setDefecttotalinv(ctb(vl)), "defecttotalinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getCapitemflg(), (et, vl) -> ((SqlGetInventoryItem)et).setCapitemflg((String)vl), "capitemflg");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getUserCd(), (et, vl) -> ((SqlGetInventoryItem)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getUserNm(), (et, vl) -> ((SqlGetInventoryItem)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getCggdidNm(), (et, vl) -> ((SqlGetInventoryItem)et).setCggdidNm((String)vl), "cggdidNm");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getInventoryreportinv(), (et, vl) -> ((SqlGetInventoryItem)et).setInventoryreportinv((String)vl), "inventoryreportinv");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getUsernum3(), (et, vl) -> ((SqlGetInventoryItem)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlGetInventoryItem)et).getCggdid(), (et, vl) -> ((SqlGetInventoryItem)et).setCggdid((String)vl), "cggdid");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlGetInventoryItem";
    protected final String _tableDispName = "SqlGetInventoryItem";
    protected final String _tablePropertyName = "sqlGetInventoryItem";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlGetInventoryItem", _tableDbName);
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
    protected final ColumnInfo _columnStockdate = cci("STOCKDATE", "STOCKDATE", null, null, String.class, "stockdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemName = cci("ITEM_NAME", "ITEM_NAME", null, null, String.class, "itemName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualitemcdflg = cci("DUALITEMCDFLG", "DUALITEMCDFLG", null, null, java.math.BigDecimal.class, "dualitemcdflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDualitemcd = cci("DUALITEMCD", "DUALITEMCD", null, null, String.class, "dualitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYdaytlequlytotalinv = cci("YDAYTLEQULYTOTALINV", "YDAYTLEQULYTOTALINV", null, null, java.math.BigDecimal.class, "ydaytlequlytotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayDiff = cci("TDAY_DIFF", "TDAY_DIFF", null, null, java.math.BigDecimal.class, "tdayDiff", null, false, false, false, "decimal", 17, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSysinvtotalinv = cci("SYSINVTOTALINV", "SYSINVTOTALINV", null, null, java.math.BigDecimal.class, "sysinvtotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttotalinv = cci("INVESTTOTALINV", "INVESTTOTALINV", null, null, java.math.BigDecimal.class, "investtotalinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestkeeplocinv = cci("INVESTKEEPLOCINV", "INVESTKEEPLOCINV", null, null, java.math.BigDecimal.class, "investkeeplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestreceivelocinv = cci("INVESTRECEIVELOCINV", "INVESTRECEIVELOCINV", null, null, java.math.BigDecimal.class, "investreceivelocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestdamageitem = cci("INVESTDAMAGEITEM", "INVESTDAMAGEITEM", null, null, java.math.BigDecimal.class, "investdamageitem", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestclssifylocinv = cci("INVESTCLSSIFYLOCINV", "INVESTCLSSIFYLOCINV", null, null, java.math.BigDecimal.class, "investclssifylocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvesttmplocinv = cci("INVESTTMPLOCINV", "INVESTTMPLOCINV", null, null, java.math.BigDecimal.class, "investtmplocinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvestautoinv = cci("INVESTAUTOINV", "INVESTAUTOINV", null, null, java.math.BigDecimal.class, "investautoinv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcesstotalinv = cci("EXCESSTOTALINV", "EXCESSTOTALINV", null, null, java.math.BigDecimal.class, "excesstotalinv", null, false, false, false, "decimal", 17, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefecttotalinv = cci("DEFECTTOTALINV", "DEFECTTOTALINV", null, null, java.math.BigDecimal.class, "defecttotalinv", null, false, false, false, "decimal", 17, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapitemflg = cci("CAPITEMFLG", "CAPITEMFLG", null, null, String.class, "capitemflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdidNm = cci("CGGDID_NM", "CGGDID_NM", null, null, String.class, "cggdidNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryreportinv = cci("INVENTORYREPORTINV", "INVENTORYREPORTINV", null, null, String.class, "inventoryreportinv", null, false, false, false, "varchar", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

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
     * STOCKDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockdate() { return _columnStockdate; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEM_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemName() { return _columnItemName; }
    /**
     * DUALITEMCDFLG: {decimal(16, 6)}
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
     * TDAY_DIFF: {decimal(17, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayDiff() { return _columnTdayDiff; }
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
     * EXCESSTOTALINV: {decimal(17, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExcesstotalinv() { return _columnExcesstotalinv; }
    /**
     * DEFECTTOTALINV: {decimal(17, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefecttotalinv() { return _columnDefecttotalinv; }
    /**
     * CAPITEMFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapitemflg() { return _columnCapitemflg; }
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
     * INVENTORYREPORTINV: {varchar(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryreportinv() { return _columnInventoryreportinv; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * CGGDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnStockdate());
        ls.add(columnProductCd());
        ls.add(columnItemName());
        ls.add(columnDualitemcdflg());
        ls.add(columnDualitemcd());
        ls.add(columnYdaytlequlytotalinv());
        ls.add(columnTdayDiff());
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
        ls.add(columnUserCd());
        ls.add(columnUserNm());
        ls.add(columnCggdidNm());
        ls.add(columnInventoryreportinv());
        ls.add(columnUsernum3());
        ls.add(columnCggdid());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlGetInventoryItem"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlGetInventoryItem> getEntityType() { return SqlGetInventoryItem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlGetInventoryItem newEntity() { return new SqlGetInventoryItem(); }
    public SqlGetInventoryItem newMyEntity() { return new SqlGetInventoryItem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlGetInventoryItem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlGetInventoryItem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
