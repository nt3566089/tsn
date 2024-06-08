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
 * The DB meta of W_TRALLINV. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WTrallinvDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WTrallinvDbm _instance = new WTrallinvDbm();
    private WTrallinvDbm() {}
    public static WTrallinvDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WTrallinv)et).getTrallinvId(), (et, vl) -> ((WTrallinv)et).setTrallinvId(ctl(vl)), "trallinvId");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getCenterId(), (et, vl) -> ((WTrallinv)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getClientId(), (et, vl) -> ((WTrallinv)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getTagType(), (et, vl) -> ((WTrallinv)et).setTagType((String)vl), "tagType");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getInoutkbn(), (et, vl) -> ((WTrallinv)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getProductId(), (et, vl) -> ((WTrallinv)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getQty1(), (et, vl) -> ((WTrallinv)et).setQty1(ctb(vl)), "qty1");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getQty2(), (et, vl) -> ((WTrallinv)et).setQty2(ctb(vl)), "qty2");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getQty3(), (et, vl) -> ((WTrallinv)et).setQty3(ctb(vl)), "qty3");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getQty4(), (et, vl) -> ((WTrallinv)et).setQty4(ctb(vl)), "qty4");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getDelFlg(), (et, vl) -> ((WTrallinv)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getVersionNo(), (et, vl) -> ((WTrallinv)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getControlNo(), (et, vl) -> ((WTrallinv)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getAddDt(), (et, vl) -> ((WTrallinv)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getAddUser(), (et, vl) -> ((WTrallinv)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getAddProcess(), (et, vl) -> ((WTrallinv)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getUpdDt(), (et, vl) -> ((WTrallinv)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getUpdUser(), (et, vl) -> ((WTrallinv)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WTrallinv)et).getUpdProcess(), (et, vl) -> ((WTrallinv)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_TRALLINV";
    protected final String _tableDispName = "W_TRALLINV";
    protected final String _tablePropertyName = "WTrallinv";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_TRALLINV", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrallinvId = cci("TRALLINV_ID", "TRALLINV_ID", null, null, Long.class, "trallinvId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagType = cci("TAG_TYPE", "TAG_TYPE", null, null, String.class, "tagType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty1 = cci("QTY1", "QTY1", null, null, java.math.BigDecimal.class, "qty1", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty2 = cci("QTY2", "QTY2", null, null, java.math.BigDecimal.class, "qty2", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty3 = cci("QTY3", "QTY3", null, null, java.math.BigDecimal.class, "qty3", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty4 = cci("QTY4", "QTY4", null, null, java.math.BigDecimal.class, "qty4", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
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
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrallinvId() { return _columnTrallinvId; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * TAG_TYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagType() { return _columnTagType; }
    /**
     * INOUTKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty1() { return _columnQty1; }
    /**
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty2() { return _columnQty2; }
    /**
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty3() { return _columnQty3; }
    /**
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty4() { return _columnQty4; }
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
        ls.add(columnTrallinvId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnTagType());
        ls.add(columnInoutkbn());
        ls.add(columnProductId());
        ls.add(columnQty1());
        ls.add(columnQty2());
        ls.add(columnQty3());
        ls.add(columnQty4());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrallinvId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WTrallinv"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WTrallinvCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WTrallinvBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WTrallinv> getEntityType() { return WTrallinv.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WTrallinv newEntity() { return new WTrallinv(); }
    public WTrallinv newMyEntity() { return new WTrallinv(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WTrallinv)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WTrallinv)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
