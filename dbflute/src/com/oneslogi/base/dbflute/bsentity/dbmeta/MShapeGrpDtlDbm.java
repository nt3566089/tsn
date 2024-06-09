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
 * The DB meta of M_SHAPE_GRP_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MShapeGrpDtlDbm _instance = new MShapeGrpDtlDbm();
    private MShapeGrpDtlDbm() {}
    public static MShapeGrpDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getShapeGrpDtlId(), (et, vl) -> ((MShapeGrpDtl)et).setShapeGrpDtlId(ctl(vl)), "shapeGrpDtlId");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getShapeGrpId(), (et, vl) -> ((MShapeGrpDtl)et).setShapeGrpId(ctl(vl)), "shapeGrpId");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getShapeId(), (et, vl) -> ((MShapeGrpDtl)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getGtin14Symbol(), (et, vl) -> ((MShapeGrpDtl)et).setGtin14Symbol(ctl(vl)), "gtin14Symbol");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getCasePickFlg(), (et, vl) -> ((MShapeGrpDtl)et).setCasePickFlg((String)vl), "casePickFlg");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getShapeSort(), (et, vl) -> ((MShapeGrpDtl)et).setShapeSort(ctl(vl)), "shapeSort");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getEmReplenishShapeFlg(), (et, vl) -> ((MShapeGrpDtl)et).setEmReplenishShapeFlg((String)vl), "emReplenishShapeFlg");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getDelFlg(), (et, vl) -> ((MShapeGrpDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getVersionNo(), (et, vl) -> ((MShapeGrpDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getControlNo(), (et, vl) -> ((MShapeGrpDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getAddDt(), (et, vl) -> ((MShapeGrpDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getAddUser(), (et, vl) -> ((MShapeGrpDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getAddProcess(), (et, vl) -> ((MShapeGrpDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getUpdDt(), (et, vl) -> ((MShapeGrpDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getUpdUser(), (et, vl) -> ((MShapeGrpDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MShapeGrpDtl)et).getUpdProcess(), (et, vl) -> ((MShapeGrpDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MShapeGrpDtl)et).getMShapeGrp(), (et, vl) -> ((MShapeGrpDtl)et).setMShapeGrp((MShapeGrp)vl), "MShapeGrp");
        setupEfpg(_efpgMap, et -> ((MShapeGrpDtl)et).getMShape(), (et, vl) -> ((MShapeGrpDtl)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((MShapeGrpDtl)et).getBClassDtlByCasePickFlg(), (et, vl) -> ((MShapeGrpDtl)et).setBClassDtlByCasePickFlg((BClassDtl)vl), "BClassDtlByCasePickFlg");
        setupEfpg(_efpgMap, et -> ((MShapeGrpDtl)et).getBClassDtlByEmReplenishShapeFlg(), (et, vl) -> ((MShapeGrpDtl)et).setBClassDtlByEmReplenishShapeFlg((BClassDtl)vl), "BClassDtlByEmReplenishShapeFlg");
        setupEfpg(_efpgMap, et -> ((MShapeGrpDtl)et).getBClassDtlByDelFlg(), (et, vl) -> ((MShapeGrpDtl)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_SHAPE_GRP_DTL";
    protected final String _tableDispName = "M_SHAPE_GRP_DTL";
    protected final String _tablePropertyName = "MShapeGrpDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_SHAPE_GRP_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShapeGrpDtlId = cci("SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", null, null, Long.class, "shapeGrpDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MProductShapeList", null, false);
    protected final ColumnInfo _columnShapeGrpId = cci("SHAPE_GRP_ID", "SHAPE_GRP_ID", null, null, Long.class, "shapeGrpId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MShapeGrp", null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnGtin14Symbol = cci("GTIN14_SYMBOL", "GTIN14_SYMBOL", null, null, Long.class, "gtin14Symbol", null, false, false, false, "bigint", 19, 0, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePickFlg = cci("CASE_PICK_FLG", "CASE_PICK_FLG", null, null, String.class, "casePickFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByCasePickFlg", null, CDef.DefMeta.CasePickFlg, false);
    protected final ColumnInfo _columnShapeSort = cci("SHAPE_SORT", "SHAPE_SORT", null, null, Long.class, "shapeSort", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmReplenishShapeFlg = cci("EM_REPLENISH_SHAPE_FLG", "EM_REPLENISH_SHAPE_FLG", null, null, String.class, "emReplenishShapeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByEmReplenishShapeFlg", null, CDef.DefMeta.EmReplenishShapeFlg, false);
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
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpDtlId() { return _columnShapeGrpDtlId; }
    /**
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpId() { return _columnShapeGrpId; }
    /**
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGtin14Symbol() { return _columnGtin14Symbol; }
    /**
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePickFlg() { return _columnCasePickFlg; }
    /**
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeSort() { return _columnShapeSort; }
    /**
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmReplenishShapeFlg() { return _columnEmReplenishShapeFlg; }
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
        ls.add(columnShapeGrpDtlId());
        ls.add(columnShapeGrpId());
        ls.add(columnShapeId());
        ls.add(columnGtin14Symbol());
        ls.add(columnCasePickFlg());
        ls.add(columnShapeSort());
        ls.add(columnEmReplenishShapeFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnShapeGrpDtlId()); }
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
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShapeGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MShapeGrpDbm.getInstance().columnShapeGrpId());
        return cfi("M_SHAPE_GRP_DTL_FK2", "MShapeGrp", this, MShapeGrpDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MShapeGrpDtlList", false);
    }
    /**
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("M_SHAPE_GRP_DTL_FK1", "MShape", this, MShapeDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MShapeGrpDtlList", false);
    }
    /**
     * B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCasePickFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCasePickFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_SHAPE_GRP_DTL_CASE_PICK_FLG", "BClassDtlByCasePickFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CASE_PICK_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEmReplenishShapeFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEmReplenishShapeFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_SHAPE_GRP_DTL_EM_REPLENISH_SHAPE_FLG", "BClassDtlByEmReplenishShapeFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'EM_REPLENISH_SHAPE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_SHAPE_GRP_DTL_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProductShapeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpDtlId(), MProductShapeDbm.getInstance().columnShapeGrpDtlId());
        return cri("M_PRODUCT_SHAPE_FK1", "MProductShapeList", this, MProductShapeDbm.getInstance(), mp, false, "MShapeGrpDtl");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MShapeGrpDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MShapeGrpDtl> getEntityType() { return MShapeGrpDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MShapeGrpDtl newEntity() { return new MShapeGrpDtl(); }
    public MShapeGrpDtl newMyEntity() { return new MShapeGrpDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MShapeGrpDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MShapeGrpDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
