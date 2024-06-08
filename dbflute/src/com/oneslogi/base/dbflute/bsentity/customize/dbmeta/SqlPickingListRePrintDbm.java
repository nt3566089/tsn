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
 * The DB meta of SqlPickingListRePrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPickingListRePrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPickingListRePrintDbm _instance = new SqlPickingListRePrintDbm();
    private SqlPickingListRePrintDbm() {}
    public static SqlPickingListRePrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getListkbnNm(), (et, vl) -> ((SqlPickingListRePrint)et).setListkbnNm((String)vl), "listkbnNm");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getCenterCd(), (et, vl) -> ((SqlPickingListRePrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getCenterAbbr(), (et, vl) -> ((SqlPickingListRePrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getShippingListPrintId(), (et, vl) -> ((SqlPickingListRePrint)et).setShippingListPrintId(ctl(vl)), "shippingListPrintId");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getPrintdatetime(), (et, vl) -> ((SqlPickingListRePrint)et).setPrintdatetime(cttp(vl)), "printdatetime");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getShipschdate(), (et, vl) -> ((SqlPickingListRePrint)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getWorkallocateid(), (et, vl) -> ((SqlPickingListRePrint)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getOwnerorderno(), (et, vl) -> ((SqlPickingListRePrint)et).setOwnerorderno((String)vl), "ownerorderno");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getOrdertypeNm(), (et, vl) -> ((SqlPickingListRePrint)et).setOrdertypeNm((String)vl), "ordertypeNm");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getCustorderno(), (et, vl) -> ((SqlPickingListRePrint)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getRmano(), (et, vl) -> ((SqlPickingListRePrint)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getOwnersono(), (et, vl) -> ((SqlPickingListRePrint)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getShiptocd(), (et, vl) -> ((SqlPickingListRePrint)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getDelivname(), (et, vl) -> ((SqlPickingListRePrint)et).setDelivname((String)vl), "delivname");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getTrsoliststsNm(), (et, vl) -> ((SqlPickingListRePrint)et).setTrsoliststsNm((String)vl), "trsoliststsNm");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getSopalletno(), (et, vl) -> ((SqlPickingListRePrint)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getLocationCd(), (et, vl) -> ((SqlPickingListRePrint)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getListkbn(), (et, vl) -> ((SqlPickingListRePrint)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getSokey(), (et, vl) -> ((SqlPickingListRePrint)et).setSokey(ctl(vl)), "sokey");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getSoid(), (et, vl) -> ((SqlPickingListRePrint)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getClientCd(), (et, vl) -> ((SqlPickingListRePrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlPickingListRePrint)et).getClientAbbr(), (et, vl) -> ((SqlPickingListRePrint)et).setClientAbbr((String)vl), "clientAbbr");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPickingListRePrint";
    protected final String _tableDispName = "SqlPickingListRePrint";
    protected final String _tablePropertyName = "sqlPickingListRePrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPickingListRePrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnListkbnNm = cci("LISTKBN_NM", "LISTKBN_NM", null, null, String.class, "listkbnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingListPrintId = cci("SHIPPING_LIST_PRINT_ID", "SHIPPING_LIST_PRINT_ID", null, null, Long.class, "shippingListPrintId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintdatetime = cci("PRINTDATETIME", "PRINTDATETIME", null, null, java.sql.Timestamp.class, "printdatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderno = cci("OWNERORDERNO", "OWNERORDERNO", null, null, String.class, "ownerorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertypeNm = cci("ORDERTYPE_NM", "ORDERTYPE_NM", null, null, String.class, "ordertypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivname = cci("DELIVNAME", "DELIVNAME", null, null, String.class, "delivname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsoliststsNm = cci("TRSOLISTSTS_NM", "TRSOLISTSTS_NM", null, null, String.class, "trsoliststsNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSokey = cci("SOKEY", "SOKEY", null, null, Long.class, "sokey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAbbr = cci("CLIENT_ABBR", "CLIENT_ABBR", null, null, String.class, "clientAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LISTKBN_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbnNm() { return _columnListkbnNm; }
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
     * SHIPPING_LIST_PRINT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingListPrintId() { return _columnShippingListPrintId; }
    /**
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintdatetime() { return _columnPrintdatetime; }
    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * WORKALLOCATEID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * OWNERORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderno() { return _columnOwnerorderno; }
    /**
     * ORDERTYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertypeNm() { return _columnOrdertypeNm; }
    /**
     * CUSTORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * SHIPTOCD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * DELIVNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivname() { return _columnDelivname; }
    /**
     * TRSOLISTSTS_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsoliststsNm() { return _columnTrsoliststsNm; }
    /**
     * SOPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LISTKBN: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * SOKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSokey() { return _columnSokey; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAbbr() { return _columnClientAbbr; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnListkbnNm());
        ls.add(columnCenterCd());
        ls.add(columnCenterAbbr());
        ls.add(columnShippingListPrintId());
        ls.add(columnPrintdatetime());
        ls.add(columnShipschdate());
        ls.add(columnWorkallocateid());
        ls.add(columnOwnerorderno());
        ls.add(columnOrdertypeNm());
        ls.add(columnCustorderno());
        ls.add(columnRmano());
        ls.add(columnOwnersono());
        ls.add(columnShiptocd());
        ls.add(columnDelivname());
        ls.add(columnTrsoliststsNm());
        ls.add(columnSopalletno());
        ls.add(columnLocationCd());
        ls.add(columnListkbn());
        ls.add(columnSokey());
        ls.add(columnSoid());
        ls.add(columnClientCd());
        ls.add(columnClientAbbr());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPickingListRePrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPickingListRePrint> getEntityType() { return SqlPickingListRePrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPickingListRePrint newEntity() { return new SqlPickingListRePrint(); }
    public SqlPickingListRePrint newMyEntity() { return new SqlPickingListRePrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPickingListRePrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPickingListRePrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
