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
 * The DB meta of M_BOX_GRP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MBoxGrpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MBoxGrpDbm _instance = new MBoxGrpDbm();
    private MBoxGrpDbm() {}
    public static MBoxGrpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getBoxGrpId(), (et, vl) -> ((MBoxGrp)et).setBoxGrpId(ctl(vl)), "boxGrpId");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getCenterId(), (et, vl) -> ((MBoxGrp)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getBoxGrpCd(), (et, vl) -> ((MBoxGrp)et).setBoxGrpCd((String)vl), "boxGrpCd");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getBoxGrpNm(), (et, vl) -> ((MBoxGrp)et).setBoxGrpNm((String)vl), "boxGrpNm");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getStandardBoxId(), (et, vl) -> ((MBoxGrp)et).setStandardBoxId(ctl(vl)), "standardBoxId");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getDelFlg(), (et, vl) -> ((MBoxGrp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getVersionNo(), (et, vl) -> ((MBoxGrp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getControlNo(), (et, vl) -> ((MBoxGrp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getAddDt(), (et, vl) -> ((MBoxGrp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getAddUser(), (et, vl) -> ((MBoxGrp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getAddProcess(), (et, vl) -> ((MBoxGrp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getUpdDt(), (et, vl) -> ((MBoxGrp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getUpdUser(), (et, vl) -> ((MBoxGrp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MBoxGrp)et).getUpdProcess(), (et, vl) -> ((MBoxGrp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MBoxGrp)et).getMCenter(), (et, vl) -> ((MBoxGrp)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MBoxGrp)et).getMBox(), (et, vl) -> ((MBoxGrp)et).setMBox((MBox)vl), "MBox");
        setupEfpg(_efpgMap, et -> ((MBoxGrp)et).getBClassDtlByDelFlg(), (et, vl) -> ((MBoxGrp)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_BOX_GRP";
    protected final String _tableDispName = "M_BOX_GRP";
    protected final String _tablePropertyName = "MBoxGrp";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_BOX_GRP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBoxGrpId = cci("BOX_GRP_ID", "BOX_GRP_ID", null, null, Long.class, "boxGrpId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MBoxGrpDtlList,MParamList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnBoxGrpCd = cci("BOX_GRP_CD", "BOX_GRP_CD", null, null, String.class, "boxGrpCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxGrpNm = cci("BOX_GRP_NM", "BOX_GRP_NM", null, null, String.class, "boxGrpNm", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStandardBoxId = cci("STANDARD_BOX_ID", "STANDARD_BOX_ID", null, null, Long.class, "standardBoxId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MBox", null, null, false);
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
     * BOX_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxGrpId() { return _columnBoxGrpId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * BOX_GRP_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxGrpCd() { return _columnBoxGrpCd; }
    /**
     * BOX_GRP_NM: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxGrpNm() { return _columnBoxGrpNm; }
    /**
     * STANDARD_BOX_ID: {IX, NotNull, bigint(19), FK to M_BOX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStandardBoxId() { return _columnStandardBoxId; }
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
        ls.add(columnBoxGrpId());
        ls.add(columnCenterId());
        ls.add(columnBoxGrpCd());
        ls.add(columnBoxGrpNm());
        ls.add(columnStandardBoxId());
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
    protected UniqueInfo cpui() { return hpcpui(columnBoxGrpId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnBoxGrpCd());
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_BOX_GRP_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MBoxGrpList", false);
    }
    /**
     * M_BOX by my STANDARD_BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStandardBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("M_BOX_GRP_FK1", "MBox", this, MBoxDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MBoxGrpList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_BOX_GRP_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxGrpId(), MBoxGrpDtlDbm.getInstance().columnBoxGrpId());
        return cri("M_BOX_GRP_DTL_FK1", "MBoxGrpDtlList", this, MBoxGrpDtlDbm.getInstance(), mp, false, "MBoxGrp");
    }
    /**
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMParamList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxGrpId(), MParamDbm.getInstance().columnPackingBoxGroupId());
        return cri("M_PARAM_FK4", "MParamList", this, MParamDbm.getInstance(), mp, false, "MBoxGrp");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MBoxGrp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MBoxGrpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MBoxGrp> getEntityType() { return MBoxGrp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MBoxGrp newEntity() { return new MBoxGrp(); }
    public MBoxGrp newMyEntity() { return new MBoxGrp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MBoxGrp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MBoxGrp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
