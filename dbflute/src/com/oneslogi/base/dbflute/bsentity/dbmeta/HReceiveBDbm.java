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
 * The DB meta of H_RECEIVE_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HReceiveBDbm _instance = new HReceiveBDbm();
    private HReceiveBDbm() {}
    public static HReceiveBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreRecordBId(), (et, vl) -> ((HReceiveB)et).setStoreRecordBId(ctl(vl)), "storeRecordBId");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreRecordHId(), (et, vl) -> ((HReceiveB)et).setStoreRecordHId(ctl(vl)), "storeRecordHId");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStockId(), (et, vl) -> ((HReceiveB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getPlanNum(), (et, vl) -> ((HReceiveB)et).setPlanNum(ctb(vl)), "planNum");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getProcessNo(), (et, vl) -> ((HReceiveB)et).setProcessNo((String)vl), "processNo");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreDt(), (et, vl) -> ((HReceiveB)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreNum(), (et, vl) -> ((HReceiveB)et).setStoreNum(ctb(vl)), "storeNum");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreFlg(), (et, vl) -> ((HReceiveB)et).setStoreFlg((String)vl), "storeFlg");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreLocationId(), (et, vl) -> ((HReceiveB)et).setStoreLocationId(ctl(vl)), "storeLocationId");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreLocationCd(), (et, vl) -> ((HReceiveB)et).setStoreLocationCd((String)vl), "storeLocationCd");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getStoreLocationNm(), (et, vl) -> ((HReceiveB)et).setStoreLocationNm((String)vl), "storeLocationNm");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getDelFlg(), (et, vl) -> ((HReceiveB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getVersionNo(), (et, vl) -> ((HReceiveB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getControlNo(), (et, vl) -> ((HReceiveB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getAddDt(), (et, vl) -> ((HReceiveB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getAddUser(), (et, vl) -> ((HReceiveB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getAddProcess(), (et, vl) -> ((HReceiveB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getUpdDt(), (et, vl) -> ((HReceiveB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getUpdUser(), (et, vl) -> ((HReceiveB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HReceiveB)et).getUpdProcess(), (et, vl) -> ((HReceiveB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HReceiveB)et).getHStock(), (et, vl) -> ((HReceiveB)et).setHStock((HStock)vl), "HStock");
        setupEfpg(_efpgMap, et -> ((HReceiveB)et).getHReceiveH(), (et, vl) -> ((HReceiveB)et).setHReceiveH((HReceiveH)vl), "HReceiveH");
        setupEfpg(_efpgMap, et -> ((HReceiveB)et).getBClassDtlByStoreFlg(), (et, vl) -> ((HReceiveB)et).setBClassDtlByStoreFlg((BClassDtl)vl), "BClassDtlByStoreFlg");
        setupEfpg(_efpgMap, et -> ((HReceiveB)et).getHReceiveSpareAsOne(), (et, vl) -> ((HReceiveB)et).setHReceiveSpareAsOne((HReceiveSpare)vl), "HReceiveSpareAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_RECEIVE_B";
    protected final String _tableDispName = "H_RECEIVE_B";
    protected final String _tablePropertyName = "HReceiveB";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_RECEIVE_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreRecordBId = cci("STORE_RECORD_B_ID", "STORE_RECORD_B_ID", null, null, Long.class, "storeRecordBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "", null, false);
    protected final ColumnInfo _columnStoreRecordHId = cci("STORE_RECORD_H_ID", "STORE_RECORD_H_ID", null, null, Long.class, "storeRecordHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HReceiveH", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HStock", null, null, false);
    protected final ColumnInfo _columnPlanNum = cci("PLAN_NUM", "PLAN_NUM", null, null, java.math.BigDecimal.class, "planNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessNo = cci("PROCESS_NO", "PROCESS_NO", null, null, String.class, "processNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNum = cci("STORE_NUM", "STORE_NUM", null, null, java.math.BigDecimal.class, "storeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreFlg = cci("STORE_FLG", "STORE_FLG", null, null, String.class, "storeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByStoreFlg", null, CDef.DefMeta.StoreFlg, false);
    protected final ColumnInfo _columnStoreLocationId = cci("STORE_LOCATION_ID", "STORE_LOCATION_ID", null, null, Long.class, "storeLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLocationCd = cci("STORE_LOCATION_CD", "STORE_LOCATION_CD", null, null, String.class, "storeLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLocationNm = cci("STORE_LOCATION_NM", "STORE_LOCATION_NM", null, null, String.class, "storeLocationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordBId() { return _columnStoreRecordBId; }
    /**
     * STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordHId() { return _columnStoreRecordHId; }
    /**
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * PLAN_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanNum() { return _columnPlanNum; }
    /**
     * PROCESS_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessNo() { return _columnProcessNo; }
    /**
     * STORE_DT: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * STORE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNum() { return _columnStoreNum; }
    /**
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreFlg() { return _columnStoreFlg; }
    /**
     * STORE_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLocationId() { return _columnStoreLocationId; }
    /**
     * STORE_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLocationCd() { return _columnStoreLocationCd; }
    /**
     * STORE_LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLocationNm() { return _columnStoreLocationNm; }
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
        ls.add(columnStoreRecordBId());
        ls.add(columnStoreRecordHId());
        ls.add(columnStockId());
        ls.add(columnPlanNum());
        ls.add(columnProcessNo());
        ls.add(columnStoreDt());
        ls.add(columnStoreNum());
        ls.add(columnStoreFlg());
        ls.add(columnStoreLocationId());
        ls.add(columnStoreLocationCd());
        ls.add(columnStoreLocationNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreRecordBId()); }
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
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockDbm.getInstance().columnStockId());
        return cfi("H_RECEIVE_B_FK1", "HStock", this, HStockDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HReceiveBList", false);
    }
    /**
     * H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHReceiveH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordHId(), HReceiveHDbm.getInstance().columnStoreRecordHId());
        return cfi("H_RECEIVE_B_FK2", "HReceiveH", this, HReceiveHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "HReceiveBList", false);
    }
    /**
     * B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStoreFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_H_RECEIVE_B_STORE_FLG", "BClassDtlByStoreFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STORE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignHReceiveSpareAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordBId(), HReceiveSpareDbm.getInstance().columnStoreRecordBId());
        return cfi("H_RECEIVE_SPARE_FK1", "HReceiveSpareAsOne", this, HReceiveSpareDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "HReceiveB", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HReceiveB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HReceiveBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HReceiveBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HReceiveB> getEntityType() { return HReceiveB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HReceiveB newEntity() { return new HReceiveB(); }
    public HReceiveB newMyEntity() { return new HReceiveB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HReceiveB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HReceiveB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
