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
 * The DB meta of SqlReceiveStatusProgress. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlReceiveStatusProgressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlReceiveStatusProgressDbm _instance = new SqlReceiveStatusProgressDbm();
    private SqlReceiveStatusProgressDbm() {}
    public static SqlReceiveStatusProgressDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getClientId(), (et, vl) -> ((SqlReceiveStatusProgress)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getClientCd(), (et, vl) -> ((SqlReceiveStatusProgress)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getClientNm(), (et, vl) -> ((SqlReceiveStatusProgress)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getCenterId(), (et, vl) -> ((SqlReceiveStatusProgress)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getCenterCd(), (et, vl) -> ((SqlReceiveStatusProgress)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getCenterNm(), (et, vl) -> ((SqlReceiveStatusProgress)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getReceiveStatus(), (et, vl) -> ((SqlReceiveStatusProgress)et).setReceiveStatus((String)vl), "receiveStatus");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getReceiveStatusNm(), (et, vl) -> ((SqlReceiveStatusProgress)et).setReceiveStatusNm((String)vl), "receiveStatusNm");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getReceiveCnt(), (et, vl) -> ((SqlReceiveStatusProgress)et).setReceiveCnt(ctl(vl)), "receiveCnt");
        setupEpg(_epgMap, et -> ((SqlReceiveStatusProgress)et).getNum(), (et, vl) -> ((SqlReceiveStatusProgress)et).setNum(ctb(vl)), "num");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlReceiveStatusProgress";
    protected final String _tableDispName = "SqlReceiveStatusProgress";
    protected final String _tablePropertyName = "sqlReceiveStatusProgress";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlReceiveStatusProgress", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatus = cci("RECEIVE_STATUS", "RECEIVE_STATUS", null, null, String.class, "receiveStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatusNm = cci("RECEIVE_STATUS_NM", "RECEIVE_STATUS_NM", null, null, String.class, "receiveStatusNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCnt = cci("RECEIVE_CNT", "RECEIVE_CNT", null, null, Long.class, "receiveCnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, java.math.BigDecimal.class, "num", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
     * RECEIVE_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatus() { return _columnReceiveStatus; }
    /**
     * RECEIVE_STATUS_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatusNm() { return _columnReceiveStatusNm; }
    /**
     * RECEIVE_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCnt() { return _columnReceiveCnt; }
    /**
     * NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnReceiveStatus());
        ls.add(columnReceiveStatusNm());
        ls.add(columnReceiveCnt());
        ls.add(columnNum());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlReceiveStatusProgress"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlReceiveStatusProgress> getEntityType() { return SqlReceiveStatusProgress.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlReceiveStatusProgress newEntity() { return new SqlReceiveStatusProgress(); }
    public SqlReceiveStatusProgress newMyEntity() { return new SqlReceiveStatusProgress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlReceiveStatusProgress)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlReceiveStatusProgress)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
