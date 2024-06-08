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
 * The DB meta of M_SHAPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MShapeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MShapeDbm _instance = new MShapeDbm();
    private MShapeDbm() {}
    public static MShapeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MShape)et).getShapeId(), (et, vl) -> ((MShape)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((MShape)et).getShapeCd(), (et, vl) -> ((MShape)et).setShapeCd((String)vl), "shapeCd");
        setupEpg(_epgMap, et -> ((MShape)et).getShapeDictId(), (et, vl) -> ((MShape)et).setShapeDictId(ctl(vl)), "shapeDictId");
        setupEpg(_epgMap, et -> ((MShape)et).getShapeUnitDictId(), (et, vl) -> ((MShape)et).setShapeUnitDictId(ctl(vl)), "shapeUnitDictId");
        setupEpg(_epgMap, et -> ((MShape)et).getDelFlg(), (et, vl) -> ((MShape)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MShape)et).getVersionNo(), (et, vl) -> ((MShape)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MShape)et).getControlNo(), (et, vl) -> ((MShape)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MShape)et).getAddDt(), (et, vl) -> ((MShape)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MShape)et).getAddUser(), (et, vl) -> ((MShape)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MShape)et).getAddProcess(), (et, vl) -> ((MShape)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MShape)et).getUpdDt(), (et, vl) -> ((MShape)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MShape)et).getUpdUser(), (et, vl) -> ((MShape)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MShape)et).getUpdProcess(), (et, vl) -> ((MShape)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MShape)et).getBDictByShapeDictId(), (et, vl) -> ((MShape)et).setBDictByShapeDictId((BDict)vl), "BDictByShapeDictId");
        setupEfpg(_efpgMap, et -> ((MShape)et).getBDictByShapeUnitDictId(), (et, vl) -> ((MShape)et).setBDictByShapeUnitDictId((BDict)vl), "BDictByShapeUnitDictId");
        setupEfpg(_efpgMap, et -> ((MShape)et).getVDictByShapeDictId(), (et, vl) -> ((MShape)et).setVDictByShapeDictId((VDict)vl), "VDictByShapeDictId");
        setupEfpg(_efpgMap, et -> ((MShape)et).getVDictByShapeUnitDictId(), (et, vl) -> ((MShape)et).setVDictByShapeUnitDictId((VDict)vl), "VDictByShapeUnitDictId");
        setupEfpg(_efpgMap, et -> ((MShape)et).getBClassDtlByDelFlg(), (et, vl) -> ((MShape)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_SHAPE";
    protected final String _tableDispName = "M_SHAPE";
    protected final String _tablePropertyName = "MShape";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_SHAPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HInventoryBList,HStockList,MShapeGrpDtlList,TAllocInstBList,TInventoryBList,TMoveInstBList,TPickingBList,TShippingInstBList,TStockList", null, false);
    protected final ColumnInfo _columnShapeCd = cci("SHAPE_CD", "SHAPE_CD", null, null, String.class, "shapeCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeDictId = cci("SHAPE_DICT_ID", "SHAPE_DICT_ID", null, null, Long.class, "shapeDictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDictByShapeDictId,VDictByShapeDictId", null, null, false);
    protected final ColumnInfo _columnShapeUnitDictId = cci("SHAPE_UNIT_DICT_ID", "SHAPE_UNIT_DICT_ID", null, null, Long.class, "shapeUnitDictId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BDictByShapeUnitDictId,VDictByShapeUnitDictId", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * SHAPE_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeCd() { return _columnShapeCd; }
    /**
     * SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeDictId() { return _columnShapeDictId; }
    /**
     * SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeUnitDictId() { return _columnShapeUnitDictId; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnShapeId());
        ls.add(columnShapeCd());
        ls.add(columnShapeDictId());
        ls.add(columnShapeUnitDictId());
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
    protected UniqueInfo cpui() { return hpcpui(columnShapeId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnShapeCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_DICT by my SHAPE_DICT_ID, named 'BDictByShapeDictId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDictByShapeDictId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("M_SHAPE_FK2", "BDictByShapeDictId", this, BDictDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MShapeByShapeDictIdList", false);
    }
    /**
     * B_DICT by my SHAPE_UNIT_DICT_ID, named 'BDictByShapeUnitDictId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDictByShapeUnitDictId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeUnitDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("M_SHAPE_FK1", "BDictByShapeUnitDictId", this, BDictDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MShapeByShapeUnitDictIdList", false);
    }
    /**
     * V_DICT by my SHAPE_DICT_ID, named 'VDictByShapeDictId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDictByShapeDictId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_SHAPE_DICT_ID", "VDictByShapeDictId", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDictByShapeDictId.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * V_DICT by my SHAPE_UNIT_DICT_ID, named 'VDictByShapeUnitDictId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDictByShapeUnitDictId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeUnitDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_SHAPE_UNIT_DICT_ID", "VDictByShapeUnitDictId", this, VDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDictByShapeUnitDictId.cultureId*/null", newArrayList("cultureId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_SHAPE_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), HInventoryBDbm.getInstance().columnShapeId());
        return cri("H_INVENTORY_B_FK3", "HInventoryBList", this, HInventoryBDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * H_STOCK by SHAPE_ID, named 'HStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), HStockDbm.getInstance().columnShapeId());
        return cri("H_STOCK_FK1", "HStockList", this, HStockDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMShapeGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeGrpDtlDbm.getInstance().columnShapeId());
        return cri("M_SHAPE_GRP_DTL_FK1", "MShapeGrpDtlList", this, MShapeGrpDtlDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), TAllocInstBDbm.getInstance().columnShapeId());
        return cri("T_ALLOC_INST_B_FK6", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), TInventoryBDbm.getInstance().columnShapeId());
        return cri("T_INVENTORY_B_FK5", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), TMoveInstBDbm.getInstance().columnShapeId());
        return cri("T_MOVE_INST_B_FK7", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * T_PICKING_B by SHAPE_ID, named 'TPickingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), TPickingBDbm.getInstance().columnShapeId());
        return cri("T_PICKING_B_FK1", "TPickingBList", this, TPickingBDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), TShippingInstBDbm.getInstance().columnShapeId());
        return cri("T_SHIPPING_INST_B_FK2", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MShape");
    }
    /**
     * T_STOCK by SHAPE_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), TStockDbm.getInstance().columnShapeId());
        return cri("T_STOCK_FK2", "TStockList", this, TStockDbm.getInstance(), mp, false, "MShape");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MShape"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MShapeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MShapeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MShape> getEntityType() { return MShape.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MShape newEntity() { return new MShape(); }
    public MShape newMyEntity() { return new MShape(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MShape)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MShape)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
