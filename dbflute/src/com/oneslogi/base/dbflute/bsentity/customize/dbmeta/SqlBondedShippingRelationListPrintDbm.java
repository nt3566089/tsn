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
 * The DB meta of SqlBondedShippingRelationListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlBondedShippingRelationListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlBondedShippingRelationListPrintDbm _instance = new SqlBondedShippingRelationListPrintDbm();
    private SqlBondedShippingRelationListPrintDbm() {}
    public static SqlBondedShippingRelationListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getPickbatchkey(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setPickbatchkey(ctl(vl)), "pickbatchkey");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getWorkallocateid(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getPickdate(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setPickdate(cttp(vl)), "pickdate");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getListkbn(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getPrintedflg(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getListkbnNm(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setListkbnNm((String)vl), "listkbnNm");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getPrintedflgNm(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setPrintedflgNm((String)vl), "printedflgNm");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getCenterCd(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getCenterAbbr(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getClientCd(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlBondedShippingRelationListPrint)et).getClientAbbr(), (et, vl) -> ((SqlBondedShippingRelationListPrint)et).setClientAbbr((String)vl), "clientAbbr");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlBondedShippingRelationListPrint";
    protected final String _tableDispName = "SqlBondedShippingRelationListPrint";
    protected final String _tablePropertyName = "sqlBondedShippingRelationListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlBondedShippingRelationListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickbatchkey = cci("PICKBATCHKEY", "PICKBATCHKEY", null, null, Long.class, "pickbatchkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickdate = cci("PICKDATE", "PICKDATE", null, null, java.sql.Timestamp.class, "pickdate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbnNm = cci("LISTKBN_NM", "LISTKBN_NM", null, null, String.class, "listkbnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflgNm = cci("PRINTEDFLG_NM", "PRINTEDFLG_NM", null, null, String.class, "printedflgNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAbbr = cci("CLIENT_ABBR", "CLIENT_ABBR", null, null, String.class, "clientAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PICKBATCHKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickbatchkey() { return _columnPickbatchkey; }
    /**
     * WORKALLOCATEID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * PICKDATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickdate() { return _columnPickdate; }
    /**
     * LISTKBN: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * PRINTEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * LISTKBN_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbnNm() { return _columnListkbnNm; }
    /**
     * PRINTEDFLG_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflgNm() { return _columnPrintedflgNm; }
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
        ls.add(columnPickbatchkey());
        ls.add(columnWorkallocateid());
        ls.add(columnPickdate());
        ls.add(columnListkbn());
        ls.add(columnPrintedflg());
        ls.add(columnListkbnNm());
        ls.add(columnPrintedflgNm());
        ls.add(columnCenterCd());
        ls.add(columnCenterAbbr());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlBondedShippingRelationListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlBondedShippingRelationListPrint> getEntityType() { return SqlBondedShippingRelationListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlBondedShippingRelationListPrint newEntity() { return new SqlBondedShippingRelationListPrint(); }
    public SqlBondedShippingRelationListPrint newMyEntity() { return new SqlBondedShippingRelationListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlBondedShippingRelationListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlBondedShippingRelationListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
