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
 * The DB meta of M_STOCK_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MStockTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MStockTypeDbm _instance = new MStockTypeDbm();
    private MStockTypeDbm() {}
    public static MStockTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MStockType)et).getStockTypeId(), (et, vl) -> ((MStockType)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((MStockType)et).getStockTypeCd(), (et, vl) -> ((MStockType)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((MStockType)et).getDictId(), (et, vl) -> ((MStockType)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((MStockType)et).getReverseValidFlg(), (et, vl) -> ((MStockType)et).setReverseValidFlg((String)vl), "reverseValidFlg");
        setupEpg(_epgMap, et -> ((MStockType)et).getDelFlg(), (et, vl) -> ((MStockType)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MStockType)et).getVersionNo(), (et, vl) -> ((MStockType)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MStockType)et).getControlNo(), (et, vl) -> ((MStockType)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MStockType)et).getAddDt(), (et, vl) -> ((MStockType)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MStockType)et).getAddUser(), (et, vl) -> ((MStockType)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MStockType)et).getAddProcess(), (et, vl) -> ((MStockType)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MStockType)et).getUpdDt(), (et, vl) -> ((MStockType)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MStockType)et).getUpdUser(), (et, vl) -> ((MStockType)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MStockType)et).getUpdProcess(), (et, vl) -> ((MStockType)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MStockType)et).getBDict(), (et, vl) -> ((MStockType)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((MStockType)et).getVDict(), (et, vl) -> ((MStockType)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((MStockType)et).getBClassDtlByReverseValidFlg(), (et, vl) -> ((MStockType)et).setBClassDtlByReverseValidFlg((BClassDtl)vl), "BClassDtlByReverseValidFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_STOCK_TYPE";
    protected final String _tableDispName = "M_STOCK_TYPE";
    protected final String _tablePropertyName = "MStockType";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_STOCK_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HInventoryBList,HShippingBList,HStockList,MLocationList,MProcessTypeList,TAllocInstBList,TInventoryBList,TInventoryInstList,TMoveInstBList,TReceivePlanHList,TShippingInstBList,TStockList,TStoreRecordHList,WHtInventoryInputProdList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList", null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnReverseValidFlg = cci("REVERSE_VALID_FLG", "REVERSE_VALID_FLG", null, null, String.class, "reverseValidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByReverseValidFlg", null, CDef.DefMeta.ReverseValidFlg, false);
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
     * STOCK_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STOCK_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * REVERSE_VALID_FLG: {char(1), FK to B_CLASS_DTL, classification=ReverseValidFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReverseValidFlg() { return _columnReverseValidFlg; }
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
        ls.add(columnStockTypeId());
        ls.add(columnStockTypeCd());
        ls.add(columnDictId());
        ls.add(columnReverseValidFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockTypeId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnStockTypeCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("M_STOCK_TYPE_FK1", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MStockTypeList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_STOCK_TYPE_DICT_ID", "VDict", this, VDictDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my REVERSE_VALID_FLG, named 'BClassDtlByReverseValidFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReverseValidFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReverseValidFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_STOCK_TYPE_REVERSE_VALID_FLG", "BClassDtlByReverseValidFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'REVERSE_VALID_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_INVENTORY_B by STOCK_TYPE_ID, named 'HInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), HInventoryBDbm.getInstance().columnStockTypeId());
        return cri("H_INVENTORY_B_FK4", "HInventoryBList", this, HInventoryBDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * H_SHIPPING_B by STOCK_TYPE_ID, named 'HShippingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHShippingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), HShippingBDbm.getInstance().columnStockTypeId());
        return cri("H_SHIPPING_B_FK1", "HShippingBList", this, HShippingBDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * H_STOCK by STOCK_TYPE_ID, named 'HStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), HStockDbm.getInstance().columnStockTypeId());
        return cri("H_STOCK_FK2", "HStockList", this, HStockDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * M_LOCATION by REPLENISH_STOCK_TYPE_ID, named 'MLocationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MLocationDbm.getInstance().columnReplenishStockTypeId());
        return cri("M_LOCATION_FK3", "MLocationList", this, MLocationDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * M_PROCESS_TYPE by STOCK_TYPE_ID, named 'MProcessTypeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProcessTypeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MProcessTypeDbm.getInstance().columnStockTypeId());
        return cri("M_PROCESS_TYPE_FK1", "MProcessTypeList", this, MProcessTypeDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_ALLOC_INST_B by STOCK_TYPE_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TAllocInstBDbm.getInstance().columnStockTypeId());
        return cri("T_ALLOC_INST_B_FK3", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_INVENTORY_B by STOCK_TYPE_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TInventoryBDbm.getInstance().columnStockTypeId());
        return cri("T_INVENTORY_B_FK10", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_INVENTORY_INST by STOCK_TYPE_ID, named 'TInventoryInstList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryInstList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TInventoryInstDbm.getInstance().columnStockTypeId());
        return cri("T_INVENTORY_INST_FK3", "TInventoryInstList", this, TInventoryInstDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_MOVE_INST_B by STOCK_TYPE_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TMoveInstBDbm.getInstance().columnStockTypeId());
        return cri("T_MOVE_INST_B_FK10", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_RECEIVE_PLAN_H by STOCK_TYPE_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TReceivePlanHDbm.getInstance().columnStockTypeId());
        return cri("T_RECEIVE_PLAN_H_FK5", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_SHIPPING_INST_B by STOCK_TYPE_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TShippingInstBDbm.getInstance().columnStockTypeId());
        return cri("T_SHIPPING_INST_B_FK3", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_STOCK by STOCK_TYPE_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TStockDbm.getInstance().columnStockTypeId());
        return cri("T_STOCK_FK6", "TStockList", this, TStockDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * T_STORE_RECORD_H by STOCK_TYPE_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), TStoreRecordHDbm.getInstance().columnStockTypeId());
        return cri("T_STORE_RECORD_H_FK2", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by STOCK_TYPE_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), WHtInventoryInputProdDbm.getInstance().columnStockTypeId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK3", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * W_HT_RECEIVE_INSPECTION by STOCK_TYPE_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), WHtReceiveInspectionDbm.getInstance().columnStockTypeId());
        return cri("W_HT_RECEIVE_INSPECTION_FK3", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by STOCK_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), WHtReceiveNoPlanInspDbm.getInstance().columnStockTypeId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK9", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MStockType");
    }
    /**
     * W_HT_RECEIVE_STORE by STOCK_TYPE_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), WHtReceiveStoreDbm.getInstance().columnStockTypeId());
        return cri("W_HT_RECEIVE_STORE_FK4", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MStockType");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MStockType"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MStockTypeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MStockTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MStockType> getEntityType() { return MStockType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MStockType newEntity() { return new MStockType(); }
    public MStockType newMyEntity() { return new MStockType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MStockType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MStockType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
