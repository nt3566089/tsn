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
 * The DB meta of T_TRSTOCKDIFFHISTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrstockdiffhistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrstockdiffhistoryDbm _instance = new TTrstockdiffhistoryDbm();
    private TTrstockdiffhistoryDbm() {}
    public static TTrstockdiffhistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getTrstockdiffhistoryId(), (et, vl) -> ((TTrstockdiffhistory)et).setTrstockdiffhistoryId(ctl(vl)), "trstockdiffhistoryId");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getCenterCd(), (et, vl) -> ((TTrstockdiffhistory)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getDiffaddDate(), (et, vl) -> ((TTrstockdiffhistory)et).setDiffaddDate((String)vl), "diffaddDate");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getDiffoccArea(), (et, vl) -> ((TTrstockdiffhistory)et).setDiffoccArea((String)vl), "diffoccArea");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getLocationCd(), (et, vl) -> ((TTrstockdiffhistory)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getInoutKbn(), (et, vl) -> ((TTrstockdiffhistory)et).setInoutKbn((String)vl), "inoutKbn");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getProductCd(), (et, vl) -> ((TTrstockdiffhistory)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getGoodItemKbn(), (et, vl) -> ((TTrstockdiffhistory)et).setGoodItemKbn((String)vl), "goodItemKbn");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getDamageRefundKbn(), (et, vl) -> ((TTrstockdiffhistory)et).setDamageRefundKbn((String)vl), "damageRefundKbn");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getDiffQty(), (et, vl) -> ((TTrstockdiffhistory)et).setDiffQty(ctb(vl)), "diffQty");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getCenterId(), (et, vl) -> ((TTrstockdiffhistory)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getClientId(), (et, vl) -> ((TTrstockdiffhistory)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getPrintedflg(), (et, vl) -> ((TTrstockdiffhistory)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getDelFlg(), (et, vl) -> ((TTrstockdiffhistory)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getVersionNo(), (et, vl) -> ((TTrstockdiffhistory)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getControlNo(), (et, vl) -> ((TTrstockdiffhistory)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getAddDt(), (et, vl) -> ((TTrstockdiffhistory)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getAddUser(), (et, vl) -> ((TTrstockdiffhistory)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getAddProcess(), (et, vl) -> ((TTrstockdiffhistory)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getUpdDt(), (et, vl) -> ((TTrstockdiffhistory)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getUpdUser(), (et, vl) -> ((TTrstockdiffhistory)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrstockdiffhistory)et).getUpdProcess(), (et, vl) -> ((TTrstockdiffhistory)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrstockdiffhistory)et).getMCenter(), (et, vl) -> ((TTrstockdiffhistory)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrstockdiffhistory)et).getMClient(), (et, vl) -> ((TTrstockdiffhistory)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSTOCKDIFFHISTORY";
    protected final String _tableDispName = "T_TRSTOCKDIFFHISTORY";
    protected final String _tablePropertyName = "TTrstockdiffhistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSTOCKDIFFHISTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrstockdiffhistoryId = cci("TRSTOCKDIFFHISTORY_ID", "TRSTOCKDIFFHISTORY_ID", null, null, Long.class, "trstockdiffhistoryId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffaddDate = cci("DIFFADD_DATE", "DIFFADD_DATE", null, null, String.class, "diffaddDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffoccArea = cci("DIFFOCC_AREA", "DIFFOCC_AREA", null, null, String.class, "diffoccArea", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutKbn = cci("INOUT_KBN", "INOUT_KBN", null, null, String.class, "inoutKbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGoodItemKbn = cci("GOOD_ITEM_KBN", "GOOD_ITEM_KBN", null, null, String.class, "goodItemKbn", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageRefundKbn = cci("DAMAGE_REFUND_KBN", "DAMAGE_REFUND_KBN", null, null, String.class, "damageRefundKbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffQty = cci("DIFF_QTY", "DIFF_QTY", null, null, java.math.BigDecimal.class, "diffQty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrstockdiffhistoryId() { return _columnTrstockdiffhistoryId; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffaddDate() { return _columnDiffaddDate; }
    /**
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffoccArea() { return _columnDiffoccArea; }
    /**
     * LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * INOUT_KBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutKbn() { return _columnInoutKbn; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGoodItemKbn() { return _columnGoodItemKbn; }
    /**
     * DAMAGE_REFUND_KBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageRefundKbn() { return _columnDamageRefundKbn; }
    /**
     * DIFF_QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffQty() { return _columnDiffQty; }
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
     * PRINTEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
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
        ls.add(columnTrstockdiffhistoryId());
        ls.add(columnCenterCd());
        ls.add(columnDiffaddDate());
        ls.add(columnDiffoccArea());
        ls.add(columnLocationCd());
        ls.add(columnInoutKbn());
        ls.add(columnProductCd());
        ls.add(columnGoodItemKbn());
        ls.add(columnDamageRefundKbn());
        ls.add(columnDiffQty());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnPrintedflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrstockdiffhistoryId()); }
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
        return cfi("T_TRSTOCKDIFFHISTORY_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrstockdiffhistoryList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRSTOCKDIFFHISTORY_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrstockdiffhistoryList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrstockdiffhistory"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrstockdiffhistoryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrstockdiffhistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrstockdiffhistory> getEntityType() { return TTrstockdiffhistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrstockdiffhistory newEntity() { return new TTrstockdiffhistory(); }
    public TTrstockdiffhistory newMyEntity() { return new TTrstockdiffhistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrstockdiffhistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrstockdiffhistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
