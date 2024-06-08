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
 * The DB meta of M_SHAPE_GRP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MShapeGrpDbm _instance = new MShapeGrpDbm();
    private MShapeGrpDbm() {}
    public static MShapeGrpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getShapeGrpId(), (et, vl) -> ((MShapeGrp)et).setShapeGrpId(ctl(vl)), "shapeGrpId");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getClientId(), (et, vl) -> ((MShapeGrp)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getShapeGrpCd(), (et, vl) -> ((MShapeGrp)et).setShapeGrpCd((String)vl), "shapeGrpCd");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getShapeGrpName(), (et, vl) -> ((MShapeGrp)et).setShapeGrpName((String)vl), "shapeGrpName");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getDecimalExistFlg(), (et, vl) -> ((MShapeGrp)et).setDecimalExistFlg((String)vl), "decimalExistFlg");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getDelFlg(), (et, vl) -> ((MShapeGrp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getVersionNo(), (et, vl) -> ((MShapeGrp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getControlNo(), (et, vl) -> ((MShapeGrp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getAddDt(), (et, vl) -> ((MShapeGrp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getAddUser(), (et, vl) -> ((MShapeGrp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getAddProcess(), (et, vl) -> ((MShapeGrp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getUpdDt(), (et, vl) -> ((MShapeGrp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getUpdUser(), (et, vl) -> ((MShapeGrp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MShapeGrp)et).getUpdProcess(), (et, vl) -> ((MShapeGrp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MShapeGrp)et).getMClient(), (et, vl) -> ((MShapeGrp)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MShapeGrp)et).getBClassDtlByDecimalExistFlg(), (et, vl) -> ((MShapeGrp)et).setBClassDtlByDecimalExistFlg((BClassDtl)vl), "BClassDtlByDecimalExistFlg");
        setupEfpg(_efpgMap, et -> ((MShapeGrp)et).getBClassDtlByDelFlg(), (et, vl) -> ((MShapeGrp)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_SHAPE_GRP";
    protected final String _tableDispName = "M_SHAPE_GRP";
    protected final String _tablePropertyName = "MShapeGrp";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_SHAPE_GRP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShapeGrpId = cci("SHAPE_GRP_ID", "SHAPE_GRP_ID", null, null, Long.class, "shapeGrpId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MClientList,MProductList,MShapeGrpDtlList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnShapeGrpCd = cci("SHAPE_GRP_CD", "SHAPE_GRP_CD", null, null, String.class, "shapeGrpCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeGrpName = cci("SHAPE_GRP_NAME", "SHAPE_GRP_NAME", null, null, String.class, "shapeGrpName", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDecimalExistFlg = cci("DECIMAL_EXIST_FLG", "DECIMAL_EXIST_FLG", null, null, String.class, "decimalExistFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByDecimalExistFlg", null, CDef.DefMeta.DecimalExistFlg, false);
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
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpId() { return _columnShapeGrpId; }
    /**
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpCd() { return _columnShapeGrpCd; }
    /**
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpName() { return _columnShapeGrpName; }
    /**
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDecimalExistFlg() { return _columnDecimalExistFlg; }
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
        ls.add(columnShapeGrpId());
        ls.add(columnClientId());
        ls.add(columnShapeGrpCd());
        ls.add(columnShapeGrpName());
        ls.add(columnDecimalExistFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnShapeGrpId()); }
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_SHAPE_GRP_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MShapeGrpList", false);
    }
    /**
     * B_CLASS_DTL by my DECIMAL_EXIST_FLG, named 'BClassDtlByDecimalExistFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDecimalExistFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDecimalExistFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_SHAPE_GRP_DECIMAL_EXIST_FLG", "BClassDtlByDecimalExistFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DECIMAL_EXIST_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_SHAPE_GRP_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MClientDbm.getInstance().columnShapeGrpId());
        return cri("M_CLIENT_FK1", "MClientList", this, MClientDbm.getInstance(), mp, false, "MShapeGrp");
    }
    /**
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MProductDbm.getInstance().columnShapeGrpId());
        return cri("M_PRODUCT_FK3", "MProductList", this, MProductDbm.getInstance(), mp, false, "MShapeGrp");
    }
    /**
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMShapeGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MShapeGrpDtlDbm.getInstance().columnShapeGrpId());
        return cri("M_SHAPE_GRP_DTL_FK2", "MShapeGrpDtlList", this, MShapeGrpDtlDbm.getInstance(), mp, false, "MShapeGrp");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MShapeGrp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MShapeGrpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MShapeGrp> getEntityType() { return MShapeGrp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MShapeGrp newEntity() { return new MShapeGrp(); }
    public MShapeGrp newMyEntity() { return new MShapeGrp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MShapeGrp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MShapeGrp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
