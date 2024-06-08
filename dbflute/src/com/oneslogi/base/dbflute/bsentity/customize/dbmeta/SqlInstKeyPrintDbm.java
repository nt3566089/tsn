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
 * The DB meta of SqlInstKeyPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInstKeyPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInstKeyPrintDbm _instance = new SqlInstKeyPrintDbm();
    private SqlInstKeyPrintDbm() {}
    public static SqlInstKeyPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getInventoryHId(), (et, vl) -> ((SqlInstKeyPrint)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getInventoryDt(), (et, vl) -> ((SqlInstKeyPrint)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getProductCd(), (et, vl) -> ((SqlInstKeyPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getProductNm(), (et, vl) -> ((SqlInstKeyPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getCggdid(), (et, vl) -> ((SqlInstKeyPrint)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getFcflg(), (et, vl) -> ((SqlInstKeyPrint)et).setFcflg((String)vl), "fcflg");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getUsernum4(), (et, vl) -> ((SqlInstKeyPrint)et).setUsernum4(ctl(vl)), "usernum4");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getUsernum3(), (et, vl) -> ((SqlInstKeyPrint)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getDiffqtyHenpin(), (et, vl) -> ((SqlInstKeyPrint)et).setDiffqtyHenpin(ctl(vl)), "diffqtyHenpin");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getDiffqtyTaxrefond(), (et, vl) -> ((SqlInstKeyPrint)et).setDiffqtyTaxrefond(ctl(vl)), "diffqtyTaxrefond");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getChargeNum(), (et, vl) -> ((SqlInstKeyPrint)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getSuffererQty(), (et, vl) -> ((SqlInstKeyPrint)et).setSuffererQty(ctl(vl)), "suffererQty");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getMonthStatussu(), (et, vl) -> ((SqlInstKeyPrint)et).setMonthStatussu(ctl(vl)), "monthStatussu");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getBlukRecivedQty(), (et, vl) -> ((SqlInstKeyPrint)et).setBlukRecivedQty(ctl(vl)), "blukRecivedQty");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getRefunditemQty(), (et, vl) -> ((SqlInstKeyPrint)et).setRefunditemQty(ctl(vl)), "refunditemQty");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getUnit1(), (et, vl) -> ((SqlInstKeyPrint)et).setUnit1(ctb(vl)), "unit1");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getUnit2(), (et, vl) -> ((SqlInstKeyPrint)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getCggdidNm(), (et, vl) -> ((SqlInstKeyPrint)et).setCggdidNm((String)vl), "cggdidNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyPrint)et).getFcflgNm(), (et, vl) -> ((SqlInstKeyPrint)et).setFcflgNm((String)vl), "fcflgNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInstKeyPrint";
    protected final String _tableDispName = "SqlInstKeyPrint";
    protected final String _tablePropertyName = "sqlInstKeyPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInstKeyPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFcflg = cci("FCFLG", "FCFLG", null, null, String.class, "fcflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum4 = cci("USERNUM4", "USERNUM4", null, null, Long.class, "usernum4", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffqtyHenpin = cci("DIFFQTY_HENPIN", "DIFFQTY_HENPIN", null, null, Long.class, "diffqtyHenpin", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffqtyTaxrefond = cci("DIFFQTY_TAXREFOND", "DIFFQTY_TAXREFOND", null, null, Long.class, "diffqtyTaxrefond", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuffererQty = cci("SUFFERER_QTY", "SUFFERER_QTY", null, null, Long.class, "suffererQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonthStatussu = cci("MONTH_STATUSSU", "MONTH_STATUSSU", null, null, Long.class, "monthStatussu", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlukRecivedQty = cci("BLUK_RECIVED_QTY", "BLUK_RECIVED_QTY", null, null, Long.class, "blukRecivedQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefunditemQty = cci("REFUNDITEM_QTY", "REFUNDITEM_QTY", null, null, Long.class, "refunditemQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, java.math.BigDecimal.class, "unit1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdidNm = cci("CGGDID_NM", "CGGDID_NM", null, null, String.class, "cggdidNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFcflgNm = cci("FCFLG_NM", "FCFLG_NM", null, null, String.class, "fcflgNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INVENTORY_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * INVENTORY_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * CGGDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * FCFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFcflg() { return _columnFcflg; }
    /**
     * USERNUM4: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum4() { return _columnUsernum4; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * DIFFQTY_HENPIN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffqtyHenpin() { return _columnDiffqtyHenpin; }
    /**
     * DIFFQTY_TAXREFOND: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffqtyTaxrefond() { return _columnDiffqtyTaxrefond; }
    /**
     * CHARGE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * SUFFERER_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuffererQty() { return _columnSuffererQty; }
    /**
     * MONTH_STATUSSU: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonthStatussu() { return _columnMonthStatussu; }
    /**
     * BLUK_RECIVED_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlukRecivedQty() { return _columnBlukRecivedQty; }
    /**
     * REFUNDITEM_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefunditemQty() { return _columnRefunditemQty; }
    /**
     * UNIT1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * CGGDID_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdidNm() { return _columnCggdidNm; }
    /**
     * FCFLG_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFcflgNm() { return _columnFcflgNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryHId());
        ls.add(columnInventoryDt());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnCggdid());
        ls.add(columnFcflg());
        ls.add(columnUsernum4());
        ls.add(columnUsernum3());
        ls.add(columnDiffqtyHenpin());
        ls.add(columnDiffqtyTaxrefond());
        ls.add(columnChargeNum());
        ls.add(columnSuffererQty());
        ls.add(columnMonthStatussu());
        ls.add(columnBlukRecivedQty());
        ls.add(columnRefunditemQty());
        ls.add(columnUnit1());
        ls.add(columnUnit2());
        ls.add(columnCggdidNm());
        ls.add(columnFcflgNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInstKeyPrint> getEntityType() { return SqlInstKeyPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInstKeyPrint newEntity() { return new SqlInstKeyPrint(); }
    public SqlInstKeyPrint newMyEntity() { return new SqlInstKeyPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInstKeyPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInstKeyPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
