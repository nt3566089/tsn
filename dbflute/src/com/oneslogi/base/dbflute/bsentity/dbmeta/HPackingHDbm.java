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
 * The DB meta of H_PACKING_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HPackingHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HPackingHDbm _instance = new HPackingHDbm();
    private HPackingHDbm() {}
    public static HPackingHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HPackingH)et).getPackingHId(), (et, vl) -> ((HPackingH)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((HPackingH)et).getShippingInstHId(), (et, vl) -> ((HPackingH)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((HPackingH)et).getProcessTypeId(), (et, vl) -> ((HPackingH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((HPackingH)et).getCarrierTraceNum(), (et, vl) -> ((HPackingH)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((HPackingH)et).getBoxId(), (et, vl) -> ((HPackingH)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((HPackingH)et).getBoxCd(), (et, vl) -> ((HPackingH)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((HPackingH)et).getBoxNm(), (et, vl) -> ((HPackingH)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((HPackingH)et).getGrossWeight(), (et, vl) -> ((HPackingH)et).setGrossWeight(ctb(vl)), "grossWeight");
        setupEpg(_epgMap, et -> ((HPackingH)et).getTotalVolume(), (et, vl) -> ((HPackingH)et).setTotalVolume(ctb(vl)), "totalVolume");
        setupEpg(_epgMap, et -> ((HPackingH)et).getDelFlg(), (et, vl) -> ((HPackingH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HPackingH)et).getVersionNo(), (et, vl) -> ((HPackingH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HPackingH)et).getControlNo(), (et, vl) -> ((HPackingH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HPackingH)et).getAddDt(), (et, vl) -> ((HPackingH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HPackingH)et).getAddUser(), (et, vl) -> ((HPackingH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HPackingH)et).getAddProcess(), (et, vl) -> ((HPackingH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HPackingH)et).getUpdDt(), (et, vl) -> ((HPackingH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HPackingH)et).getUpdUser(), (et, vl) -> ((HPackingH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HPackingH)et).getUpdProcess(), (et, vl) -> ((HPackingH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HPackingH)et).getHShippingH(), (et, vl) -> ((HPackingH)et).setHShippingH((HShippingH)vl), "HShippingH");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_PACKING_H";
    protected final String _tableDispName = "H_PACKING_H";
    protected final String _tablePropertyName = "HPackingH";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_PACKING_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HPackingBList", null, false);
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HShippingH", null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "grossWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalVolume = cci("TOTAL_VOLUME", "TOTAL_VOLUME", null, null, java.math.BigDecimal.class, "totalVolume", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
    /**
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * BOX_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
    /**
     * BOX_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalVolume() { return _columnTotalVolume; }
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
        ls.add(columnPackingHId());
        ls.add(columnShippingInstHId());
        ls.add(columnProcessTypeId());
        ls.add(columnCarrierTraceNum());
        ls.add(columnBoxId());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnGrossWeight());
        ls.add(columnTotalVolume());
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
    protected UniqueInfo cpui() { return hpcpui(columnPackingHId()); }
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
     * H_SHIPPING_H by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHShippingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstHId(), HShippingHDbm.getInstance().columnShippingInstHId());
        return cfi("H_PACKING_H_FK1", "HShippingH", this, HShippingHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HPackingHList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_PACKING_B by PACKING_H_ID, named 'HPackingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHPackingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), HPackingBDbm.getInstance().columnPackingHId());
        return cri("H_PACKING_B_FK3", "HPackingBList", this, HPackingBDbm.getInstance(), mp, false, "HPackingH");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HPackingH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HPackingHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HPackingHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HPackingH> getEntityType() { return HPackingH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HPackingH newEntity() { return new HPackingH(); }
    public HPackingH newMyEntity() { return new HPackingH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HPackingH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HPackingH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
