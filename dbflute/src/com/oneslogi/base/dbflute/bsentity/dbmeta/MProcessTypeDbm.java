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
 * The DB meta of M_PROCESS_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MProcessTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MProcessTypeDbm _instance = new MProcessTypeDbm();
    private MProcessTypeDbm() {}
    public static MProcessTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MProcessType)et).getProcessTypeId(), (et, vl) -> ((MProcessType)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((MProcessType)et).getProcessTypeCd(), (et, vl) -> ((MProcessType)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((MProcessType)et).getDictId(), (et, vl) -> ((MProcessType)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((MProcessType)et).getReceiveFlg(), (et, vl) -> ((MProcessType)et).setReceiveFlg((String)vl), "receiveFlg");
        setupEpg(_epgMap, et -> ((MProcessType)et).getShippingFlg(), (et, vl) -> ((MProcessType)et).setShippingFlg((String)vl), "shippingFlg");
        setupEpg(_epgMap, et -> ((MProcessType)et).getStockAdjustFlg(), (et, vl) -> ((MProcessType)et).setStockAdjustFlg((String)vl), "stockAdjustFlg");
        setupEpg(_epgMap, et -> ((MProcessType)et).getDefaultFlg(), (et, vl) -> ((MProcessType)et).setDefaultFlg((String)vl), "defaultFlg");
        setupEpg(_epgMap, et -> ((MProcessType)et).getStockTypeId(), (et, vl) -> ((MProcessType)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((MProcessType)et).getDelFlg(), (et, vl) -> ((MProcessType)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MProcessType)et).getVersionNo(), (et, vl) -> ((MProcessType)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MProcessType)et).getControlNo(), (et, vl) -> ((MProcessType)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MProcessType)et).getAddDt(), (et, vl) -> ((MProcessType)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MProcessType)et).getAddUser(), (et, vl) -> ((MProcessType)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MProcessType)et).getAddProcess(), (et, vl) -> ((MProcessType)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MProcessType)et).getUpdDt(), (et, vl) -> ((MProcessType)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MProcessType)et).getUpdUser(), (et, vl) -> ((MProcessType)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MProcessType)et).getUpdProcess(), (et, vl) -> ((MProcessType)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MProcessType)et).getBDict(), (et, vl) -> ((MProcessType)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((MProcessType)et).getMStockType(), (et, vl) -> ((MProcessType)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((MProcessType)et).getVDict(), (et, vl) -> ((MProcessType)et).setVDict((VDict)vl), "VDict");
        setupEfpg(_efpgMap, et -> ((MProcessType)et).getBClassDtlByReceiveFlg(), (et, vl) -> ((MProcessType)et).setBClassDtlByReceiveFlg((BClassDtl)vl), "BClassDtlByReceiveFlg");
        setupEfpg(_efpgMap, et -> ((MProcessType)et).getBClassDtlByShippingFlg(), (et, vl) -> ((MProcessType)et).setBClassDtlByShippingFlg((BClassDtl)vl), "BClassDtlByShippingFlg");
        setupEfpg(_efpgMap, et -> ((MProcessType)et).getBClassDtlByStockAdjustFlg(), (et, vl) -> ((MProcessType)et).setBClassDtlByStockAdjustFlg((BClassDtl)vl), "BClassDtlByStockAdjustFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_PROCESS_TYPE";
    protected final String _tableDispName = "M_PROCESS_TYPE";
    protected final String _tablePropertyName = "MProcessType";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_PROCESS_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HMoveHList,HReceiveHList,HShippingHList,HStockInoutList,TAllocInstHList,TMoveInstHList,TPackingHList,TPickingHList,TReceivePlanHList,TShippingInstHList,TStockInoutList,TStoreRecordHList,WHtReceiveNoPlanInspList", null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnReceiveFlg = cci("RECEIVE_FLG", "RECEIVE_FLG", null, null, String.class, "receiveFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByReceiveFlg", null, CDef.DefMeta.ReceiveFlg, false);
    protected final ColumnInfo _columnShippingFlg = cci("SHIPPING_FLG", "SHIPPING_FLG", null, null, String.class, "shippingFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByShippingFlg", null, CDef.DefMeta.ShippingFlg, false);
    protected final ColumnInfo _columnStockAdjustFlg = cci("STOCK_ADJUST_FLG", "STOCK_ADJUST_FLG", null, null, String.class, "stockAdjustFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByStockAdjustFlg", null, CDef.DefMeta.StockAdjustFlg, false);
    protected final ColumnInfo _columnDefaultFlg = cci("DEFAULT_FLG", "DEFAULT_FLG", null, null, String.class, "defaultFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
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
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeCd() { return _columnProcessTypeCd; }
    /**
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveFlg() { return _columnReceiveFlg; }
    /**
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingFlg() { return _columnShippingFlg; }
    /**
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockAdjustFlg() { return _columnStockAdjustFlg; }
    /**
     * DEFAULT_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultFlg() { return _columnDefaultFlg; }
    /**
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
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
        ls.add(columnProcessTypeId());
        ls.add(columnProcessTypeCd());
        ls.add(columnDictId());
        ls.add(columnReceiveFlg());
        ls.add(columnShippingFlg());
        ls.add(columnStockAdjustFlg());
        ls.add(columnDefaultFlg());
        ls.add(columnStockTypeId());
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
    protected UniqueInfo cpui() { return hpcpui(columnProcessTypeId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnProcessTypeCd()); }

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
        return cfi("M_PROCESS_TYPE_FK2", "BDict", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MProcessTypeList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("M_PROCESS_TYPE_FK1", "MStockType", this, MStockTypeDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MProcessTypeList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_PROCESS_TYPE_DICT_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my RECEIVE_FLG, named 'BClassDtlByReceiveFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReceiveFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceiveFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PROCESS_TYPE_RECEIVE_FLG", "BClassDtlByReceiveFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RECEIVE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SHIPPING_FLG, named 'BClassDtlByShippingFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByShippingFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PROCESS_TYPE_SHIPPING_FLG", "BClassDtlByShippingFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHIPPING_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockAdjustFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockAdjustFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PROCESS_TYPE_STOCK_ADJUST_FLG", "BClassDtlByStockAdjustFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_ADJUST_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_MOVE_H by PROCESS_TYPE_ID, named 'HMoveHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHMoveHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), HMoveHDbm.getInstance().columnProcessTypeId());
        return cri("H_MOVE_H_FK1", "HMoveHList", this, HMoveHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * H_RECEIVE_H by PROCESS_TYPE_ID, named 'HReceiveHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHReceiveHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), HReceiveHDbm.getInstance().columnProcessTypeId());
        return cri("H_RECEIVE_H_FK1", "HReceiveHList", this, HReceiveHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * H_SHIPPING_H by PROCESS_TYPE_ID, named 'HShippingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHShippingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), HShippingHDbm.getInstance().columnProcessTypeId());
        return cri("H_SHIPPING_H_FK1", "HShippingHList", this, HShippingHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * H_STOCK_INOUT by PROCESS_TYPE_ID, named 'HStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), HStockInoutDbm.getInstance().columnProcessTypeId());
        return cri("H_STOCK_INOUT_FK2", "HStockInoutList", this, HStockInoutDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_ALLOC_INST_H by PROCESS_TYPE_ID, named 'TAllocInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TAllocInstHDbm.getInstance().columnProcessTypeId());
        return cri("T_ALLOC_INST_H_FK6", "TAllocInstHList", this, TAllocInstHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_MOVE_INST_H by PROCESS_TYPE_ID, named 'TMoveInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TMoveInstHDbm.getInstance().columnProcessTypeId());
        return cri("T_MOVE_INST_H_FK1", "TMoveInstHList", this, TMoveInstHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_PACKING_H by PROCESS_TYPE_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TPackingHDbm.getInstance().columnProcessTypeId());
        return cri("T_PACKING_H_FK3", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_PICKING_H by PROCESS_TYPE_ID, named 'TPickingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TPickingHDbm.getInstance().columnProcessTypeId());
        return cri("T_PICKING_H_FK3", "TPickingHList", this, TPickingHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_RECEIVE_PLAN_H by PROCESS_TYPE_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TReceivePlanHDbm.getInstance().columnProcessTypeId());
        return cri("T_RECEIVE_PLAN_H_FK7", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_SHIPPING_INST_H by PROCESS_TYPE_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TShippingInstHDbm.getInstance().columnProcessTypeId());
        return cri("T_SHIPPING_INST_H_FK1", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_STOCK_INOUT by PROCESS_TYPE_ID, named 'TStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TStockInoutDbm.getInstance().columnProcessTypeId());
        return cri("T_STOCK_INOUT_FK1", "TStockInoutList", this, TStockInoutDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * T_STORE_RECORD_H by PROCESS_TYPE_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), TStoreRecordHDbm.getInstance().columnProcessTypeId());
        return cri("T_STORE_RECORD_H_FK4", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "MProcessType");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), WHtReceiveNoPlanInspDbm.getInstance().columnProcessTypeId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK2", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MProcessType");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MProcessType"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MProcessTypeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MProcessType> getEntityType() { return MProcessType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MProcessType newEntity() { return new MProcessType(); }
    public MProcessType newMyEntity() { return new MProcessType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MProcessType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MProcessType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
