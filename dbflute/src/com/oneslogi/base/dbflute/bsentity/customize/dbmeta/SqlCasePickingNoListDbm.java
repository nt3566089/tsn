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
 * The DB meta of SqlCasePickingNoList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlCasePickingNoListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlCasePickingNoListDbm _instance = new SqlCasePickingNoListDbm();
    private SqlCasePickingNoListDbm() {}
    public static SqlCasePickingNoListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlCasePickingNoList)et).getCenterId(), (et, vl) -> ((SqlCasePickingNoList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlCasePickingNoList)et).getCasePickingNo(), (et, vl) -> ((SqlCasePickingNoList)et).setCasePickingNo((String)vl), "casePickingNo");
        setupEpg(_epgMap, et -> ((SqlCasePickingNoList)et).getPackingStatus(), (et, vl) -> ((SqlCasePickingNoList)et).setPackingStatus((String)vl), "packingStatus");
        setupEpg(_epgMap, et -> ((SqlCasePickingNoList)et).getPackingStatusNm(), (et, vl) -> ((SqlCasePickingNoList)et).setPackingStatusNm((String)vl), "packingStatusNm");
        setupEpg(_epgMap, et -> ((SqlCasePickingNoList)et).getUserCd(), (et, vl) -> ((SqlCasePickingNoList)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlCasePickingNoList)et).getUserNm(), (et, vl) -> ((SqlCasePickingNoList)et).setUserNm((String)vl), "userNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlCasePickingNoList";
    protected final String _tableDispName = "SqlCasePickingNoList";
    protected final String _tablePropertyName = "sqlCasePickingNoList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlCasePickingNoList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("center_id", "center_id", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePickingNo = cci("case_picking_no", "case_picking_no", null, null, String.class, "casePickingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingStatus = cci("packing_status", "packing_status", null, null, String.class, "packingStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingStatusNm = cci("packing_status_nm", "packing_status_nm", null, null, String.class, "packingStatusNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("user_cd", "user_cd", null, null, String.class, "userCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("user_nm", "user_nm", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * center_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * case_picking_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePickingNo() { return _columnCasePickingNo; }
    /**
     * packing_status: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingStatus() { return _columnPackingStatus; }
    /**
     * packing_status_nm: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingStatusNm() { return _columnPackingStatusNm; }
    /**
     * user_cd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * user_nm: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterId());
        ls.add(columnCasePickingNo());
        ls.add(columnPackingStatus());
        ls.add(columnPackingStatusNm());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlCasePickingNoList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlCasePickingNoList> getEntityType() { return SqlCasePickingNoList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlCasePickingNoList newEntity() { return new SqlCasePickingNoList(); }
    public SqlCasePickingNoList newMyEntity() { return new SqlCasePickingNoList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlCasePickingNoList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlCasePickingNoList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
