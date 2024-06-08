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
 * The DB meta of M_PRODUCT_SHAPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MProductShapeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MProductShapeDbm _instance = new MProductShapeDbm();
    private MProductShapeDbm() {}
    public static MProductShapeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MProductShape)et).getProductShapeId(), (et, vl) -> ((MProductShape)et).setProductShapeId(ctl(vl)), "productShapeId");
        setupEpg(_epgMap, et -> ((MProductShape)et).getProductId(), (et, vl) -> ((MProductShape)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((MProductShape)et).getShapeGrpDtlId(), (et, vl) -> ((MProductShape)et).setShapeGrpDtlId(ctl(vl)), "shapeGrpDtlId");
        setupEpg(_epgMap, et -> ((MProductShape)et).getUnitNum(), (et, vl) -> ((MProductShape)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((MProductShape)et).getLength(), (et, vl) -> ((MProductShape)et).setLength(ctb(vl)), "length");
        setupEpg(_epgMap, et -> ((MProductShape)et).getWidth(), (et, vl) -> ((MProductShape)et).setWidth(ctb(vl)), "width");
        setupEpg(_epgMap, et -> ((MProductShape)et).getHeight(), (et, vl) -> ((MProductShape)et).setHeight(ctb(vl)), "height");
        setupEpg(_epgMap, et -> ((MProductShape)et).getVolume(), (et, vl) -> ((MProductShape)et).setVolume(ctb(vl)), "volume");
        setupEpg(_epgMap, et -> ((MProductShape)et).getNetWeight(), (et, vl) -> ((MProductShape)et).setNetWeight(ctb(vl)), "netWeight");
        setupEpg(_epgMap, et -> ((MProductShape)et).getGrossWeight(), (et, vl) -> ((MProductShape)et).setGrossWeight(ctb(vl)), "grossWeight");
        setupEpg(_epgMap, et -> ((MProductShape)et).getDelFlg(), (et, vl) -> ((MProductShape)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MProductShape)et).getVersionNo(), (et, vl) -> ((MProductShape)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MProductShape)et).getControlNo(), (et, vl) -> ((MProductShape)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MProductShape)et).getAddDt(), (et, vl) -> ((MProductShape)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MProductShape)et).getAddUser(), (et, vl) -> ((MProductShape)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MProductShape)et).getAddProcess(), (et, vl) -> ((MProductShape)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MProductShape)et).getUpdDt(), (et, vl) -> ((MProductShape)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MProductShape)et).getUpdUser(), (et, vl) -> ((MProductShape)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MProductShape)et).getUpdProcess(), (et, vl) -> ((MProductShape)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MProductShape)et).getMProduct(), (et, vl) -> ((MProductShape)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((MProductShape)et).getMShapeGrpDtl(), (et, vl) -> ((MProductShape)et).setMShapeGrpDtl((MShapeGrpDtl)vl), "MShapeGrpDtl");
        setupEfpg(_efpgMap, et -> ((MProductShape)et).getBClassDtlByDelFlg(), (et, vl) -> ((MProductShape)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_PRODUCT_SHAPE";
    protected final String _tableDispName = "M_PRODUCT_SHAPE";
    protected final String _tablePropertyName = "MProductShape";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_PRODUCT_SHAPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductShapeId = cci("PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", null, null, Long.class, "productShapeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MLocationByMaxStoreProductShapeIdList,MLocationByReplenishPProductShapeIdList", null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnShapeGrpDtlId = cci("SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", null, null, Long.class, "shapeGrpDtlId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MShapeGrpDtl", null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, java.math.BigDecimal.class, "length", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth = cci("WIDTH", "WIDTH", null, null, java.math.BigDecimal.class, "width", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight = cci("HEIGHT", "HEIGHT", null, null, java.math.BigDecimal.class, "height", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVolume = cci("VOLUME", "VOLUME", null, null, java.math.BigDecimal.class, "volume", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetWeight = cci("NET_WEIGHT", "NET_WEIGHT", null, null, java.math.BigDecimal.class, "netWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "grossWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductShapeId() { return _columnProductShapeId; }
    /**
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpDtlId() { return _columnShapeGrpDtlId; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * LENGTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * WIDTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth() { return _columnWidth; }
    /**
     * HEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight() { return _columnHeight; }
    /**
     * VOLUME: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVolume() { return _columnVolume; }
    /**
     * NET_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetWeight() { return _columnNetWeight; }
    /**
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
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
        ls.add(columnProductShapeId());
        ls.add(columnProductId());
        ls.add(columnShapeGrpDtlId());
        ls.add(columnUnitNum());
        ls.add(columnLength());
        ls.add(columnWidth());
        ls.add(columnHeight());
        ls.add(columnVolume());
        ls.add(columnNetWeight());
        ls.add(columnGrossWeight());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductShapeId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnProductId());
        ls.add(columnShapeGrpDtlId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_PRODUCT_SHAPE_FK2", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MProductShapeList", false);
    }
    /**
     * M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShapeGrpDtl() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpDtlId(), MShapeGrpDtlDbm.getInstance().columnShapeGrpDtlId());
        return cfi("M_PRODUCT_SHAPE_FK1", "MShapeGrpDtl", this, MShapeGrpDtlDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MProductShapeList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_SHAPE_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationByMaxStoreProductShapeIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductShapeId(), MLocationDbm.getInstance().columnMaxStoreProductShapeId());
        return cri("M_LOCATION_FK5", "MLocationByMaxStoreProductShapeIdList", this, MLocationDbm.getInstance(), mp, false, "MProductShapeByMaxStoreProductShapeId");
    }
    /**
     * M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationByReplenishPProductShapeIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductShapeId(), MLocationDbm.getInstance().columnReplenishPProductShapeId());
        return cri("M_LOCATION_FK6", "MLocationByReplenishPProductShapeIdList", this, MLocationDbm.getInstance(), mp, false, "MProductShapeByReplenishPProductShapeId");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MProductShape"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MProductShapeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MProductShapeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MProductShape> getEntityType() { return MProductShape.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MProductShape newEntity() { return new MProductShape(); }
    public MProductShape newMyEntity() { return new MProductShape(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MProductShape)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MProductShape)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
