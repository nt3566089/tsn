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
 * The DB meta of SqlShippingPalleteDetailInfoList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingPalleteDetailInfoListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingPalleteDetailInfoListDbm _instance = new SqlShippingPalleteDetailInfoListDbm();
    private SqlShippingPalleteDetailInfoListDbm() {}
    public static SqlShippingPalleteDetailInfoListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getSymbollineno(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setSymbollineno(ctl(vl)), "symbollineno");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getRcvkey(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setRcvkey(ctl(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getSymbolmakeno(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setSymbolmakeno((String)vl), "symbolmakeno");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getProductCd(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getProductNm(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getLot1(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getLot4(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getLot3(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getLot2(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getStockTypeCd(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getMakercaseno(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setMakercaseno((String)vl), "makercaseno");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getReceivedate(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getTotalqty(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setTotalqty(ctb(vl)), "totalqty");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getForeigncargoflg(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getIfitemcd(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getCenterCd(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getCenterNm(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getClientCd(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteDetailInfoList)et).getClientNm(), (et, vl) -> ((SqlShippingPalleteDetailInfoList)et).setClientNm((String)vl), "clientNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingPalleteDetailInfoList";
    protected final String _tableDispName = "SqlShippingPalleteDetailInfoList";
    protected final String _tablePropertyName = "sqlShippingPalleteDetailInfoList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingPalleteDetailInfoList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSymbollineno = cci("SYMBOLLINENO", "SYMBOLLINENO", null, null, Long.class, "symbollineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, Long.class, "rcvkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolmakeno = cci("SYMBOLMAKENO", "SYMBOLMAKENO", null, null, String.class, "symbolmakeno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakercaseno = cci("MAKERCASENO", "MAKERCASENO", null, null, String.class, "makercaseno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalqty = cci("TOTALQTY", "TOTALQTY", null, null, java.math.BigDecimal.class, "totalqty", null, false, false, false, "decimal", 38, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SYMBOLLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbollineno() { return _columnSymbollineno; }
    /**
     * RCVKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * SYMBOLMAKENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolmakeno() { return _columnSymbolmakeno; }
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
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * MAKERCASENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakercaseno() { return _columnMakercaseno; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * TOTALQTY: {decimal(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalqty() { return _columnTotalqty; }
    /**
     * FOREIGNCARGOFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * IFITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
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
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSymbollineno());
        ls.add(columnRcvkey());
        ls.add(columnSymbolmakeno());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnLot3());
        ls.add(columnLot2());
        ls.add(columnStockTypeCd());
        ls.add(columnMakercaseno());
        ls.add(columnReceivedate());
        ls.add(columnTotalqty());
        ls.add(columnForeigncargoflg());
        ls.add(columnIfitemcd());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingPalleteDetailInfoList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingPalleteDetailInfoList> getEntityType() { return SqlShippingPalleteDetailInfoList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingPalleteDetailInfoList newEntity() { return new SqlShippingPalleteDetailInfoList(); }
    public SqlShippingPalleteDetailInfoList newMyEntity() { return new SqlShippingPalleteDetailInfoList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingPalleteDetailInfoList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingPalleteDetailInfoList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
