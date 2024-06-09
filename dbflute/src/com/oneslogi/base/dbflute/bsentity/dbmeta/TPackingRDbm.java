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
 * The DB meta of T_PACKING_R. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPackingRDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPackingRDbm _instance = new TPackingRDbm();
    private TPackingRDbm() {}
    public static TPackingRDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPackingR)et).getPackingHId(), (et, vl) -> ((TPackingR)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((TPackingR)et).getStwOutFlg(), (et, vl) -> ((TPackingR)et).setStwOutFlg((String)vl), "stwOutFlg");
        setupEpg(_epgMap, et -> ((TPackingR)et).getStwOutUserId(), (et, vl) -> ((TPackingR)et).setStwOutUserId(ctl(vl)), "stwOutUserId");
        setupEpg(_epgMap, et -> ((TPackingR)et).getStwOutDt(), (et, vl) -> ((TPackingR)et).setStwOutDt(cttp(vl)), "stwOutDt");
        setupEpg(_epgMap, et -> ((TPackingR)et).getTagOutFlg(), (et, vl) -> ((TPackingR)et).setTagOutFlg((String)vl), "tagOutFlg");
        setupEpg(_epgMap, et -> ((TPackingR)et).getTagOutUserId(), (et, vl) -> ((TPackingR)et).setTagOutUserId(ctl(vl)), "tagOutUserId");
        setupEpg(_epgMap, et -> ((TPackingR)et).getTagOutDt(), (et, vl) -> ((TPackingR)et).setTagOutDt(cttp(vl)), "tagOutDt");
        setupEpg(_epgMap, et -> ((TPackingR)et).getTagDlUrl(), (et, vl) -> ((TPackingR)et).setTagDlUrl((String)vl), "tagDlUrl");
        setupEpg(_epgMap, et -> ((TPackingR)et).getInspectionOutFlg(), (et, vl) -> ((TPackingR)et).setInspectionOutFlg((String)vl), "inspectionOutFlg");
        setupEpg(_epgMap, et -> ((TPackingR)et).getInspectionOutUserId(), (et, vl) -> ((TPackingR)et).setInspectionOutUserId(ctl(vl)), "inspectionOutUserId");
        setupEpg(_epgMap, et -> ((TPackingR)et).getInspectionOutDt(), (et, vl) -> ((TPackingR)et).setInspectionOutDt(cttp(vl)), "inspectionOutDt");
        setupEpg(_epgMap, et -> ((TPackingR)et).getDelFlg(), (et, vl) -> ((TPackingR)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPackingR)et).getVersionNo(), (et, vl) -> ((TPackingR)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPackingR)et).getControlNo(), (et, vl) -> ((TPackingR)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPackingR)et).getAddDt(), (et, vl) -> ((TPackingR)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPackingR)et).getAddUser(), (et, vl) -> ((TPackingR)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPackingR)et).getAddProcess(), (et, vl) -> ((TPackingR)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPackingR)et).getUpdDt(), (et, vl) -> ((TPackingR)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPackingR)et).getUpdUser(), (et, vl) -> ((TPackingR)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPackingR)et).getUpdProcess(), (et, vl) -> ((TPackingR)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getBUserByInspectionOutUserId(), (et, vl) -> ((TPackingR)et).setBUserByInspectionOutUserId((BUser)vl), "BUserByInspectionOutUserId");
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getTPackingH(), (et, vl) -> ((TPackingR)et).setTPackingH((TPackingH)vl), "TPackingH");
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getBUserByStwOutUserId(), (et, vl) -> ((TPackingR)et).setBUserByStwOutUserId((BUser)vl), "BUserByStwOutUserId");
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getBUserByTagOutUserId(), (et, vl) -> ((TPackingR)et).setBUserByTagOutUserId((BUser)vl), "BUserByTagOutUserId");
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getBClassDtlByStwOutFlg(), (et, vl) -> ((TPackingR)et).setBClassDtlByStwOutFlg((BClassDtl)vl), "BClassDtlByStwOutFlg");
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getBClassDtlByTagOutFlg(), (et, vl) -> ((TPackingR)et).setBClassDtlByTagOutFlg((BClassDtl)vl), "BClassDtlByTagOutFlg");
        setupEfpg(_efpgMap, et -> ((TPackingR)et).getBClassDtlByInspectionOutFlg(), (et, vl) -> ((TPackingR)et).setBClassDtlByInspectionOutFlg((BClassDtl)vl), "BClassDtlByInspectionOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PACKING_R";
    protected final String _tableDispName = "T_PACKING_R";
    protected final String _tablePropertyName = "TPackingR";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PACKING_R", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TPackingH", null, null, false);
    protected final ColumnInfo _columnStwOutFlg = cci("STW_OUT_FLG", "STW_OUT_FLG", null, null, String.class, "stwOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByStwOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnStwOutUserId = cci("STW_OUT_USER_ID", "STW_OUT_USER_ID", null, null, Long.class, "stwOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByStwOutUserId", null, null, false);
    protected final ColumnInfo _columnStwOutDt = cci("STW_OUT_DT", "STW_OUT_DT", null, null, java.sql.Timestamp.class, "stwOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutFlg = cci("TAG_OUT_FLG", "TAG_OUT_FLG", null, null, String.class, "tagOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByTagOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnTagOutUserId = cci("TAG_OUT_USER_ID", "TAG_OUT_USER_ID", null, null, Long.class, "tagOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByTagOutUserId", null, null, false);
    protected final ColumnInfo _columnTagOutDt = cci("TAG_OUT_DT", "TAG_OUT_DT", null, null, java.sql.Timestamp.class, "tagOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagDlUrl = cci("TAG_DL_URL", "TAG_DL_URL", null, null, String.class, "tagDlUrl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionOutFlg = cci("INSPECTION_OUT_FLG", "INSPECTION_OUT_FLG", null, null, String.class, "inspectionOutFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByInspectionOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnInspectionOutUserId = cci("INSPECTION_OUT_USER_ID", "INSPECTION_OUT_USER_ID", null, null, Long.class, "inspectionOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByInspectionOutUserId", null, null, false);
    protected final ColumnInfo _columnInspectionOutDt = cci("INSPECTION_OUT_DT", "INSPECTION_OUT_DT", null, null, java.sql.Timestamp.class, "inspectionOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStwOutFlg() { return _columnStwOutFlg; }
    /**
     * STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStwOutUserId() { return _columnStwOutUserId; }
    /**
     * STW_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStwOutDt() { return _columnStwOutDt; }
    /**
     * TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutFlg() { return _columnTagOutFlg; }
    /**
     * TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutUserId() { return _columnTagOutUserId; }
    /**
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutDt() { return _columnTagOutDt; }
    /**
     * TAG_DL_URL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagDlUrl() { return _columnTagDlUrl; }
    /**
     * INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionOutFlg() { return _columnInspectionOutFlg; }
    /**
     * INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionOutUserId() { return _columnInspectionOutUserId; }
    /**
     * INSPECTION_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionOutDt() { return _columnInspectionOutDt; }
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
        ls.add(columnStwOutFlg());
        ls.add(columnStwOutUserId());
        ls.add(columnStwOutDt());
        ls.add(columnTagOutFlg());
        ls.add(columnTagOutUserId());
        ls.add(columnTagOutDt());
        ls.add(columnTagDlUrl());
        ls.add(columnInspectionOutFlg());
        ls.add(columnInspectionOutUserId());
        ls.add(columnInspectionOutDt());
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
     * B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByInspectionOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspectionOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PACKING_R_FK1", "BUserByInspectionOutUserId", this, BUserDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPackingRByInspectionOutUserIdList", false);
    }
    /**
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPackingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), TPackingHDbm.getInstance().columnPackingHId());
        return cfi("T_PACKING_R_FK4", "TPackingH", this, TPackingHDbm.getInstance(), mp, 1, null, true, false, false, false, null, null, false, "TPackingRAsOne", false);
    }
    /**
     * B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByStwOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStwOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PACKING_R_FK3", "BUserByStwOutUserId", this, BUserDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPackingRByStwOutUserIdList", false);
    }
    /**
     * B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByTagOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PACKING_R_FK2", "BUserByTagOutUserId", this, BUserDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TPackingRByTagOutUserIdList", false);
    }
    /**
     * B_CLASS_DTL by my STW_OUT_FLG, named 'BClassDtlByStwOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStwOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStwOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_R_STW_OUT_FLG", "BClassDtlByStwOutFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my TAG_OUT_FLG, named 'BClassDtlByTagOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTagOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_R_TAG_OUT_FLG", "BClassDtlByTagOutFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSPECTION_OUT_FLG, named 'BClassDtlByInspectionOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInspectionOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspectionOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_R_INSPECTION_OUT_FLG", "BClassDtlByInspectionOutFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPackingR"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPackingRCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPackingRBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPackingR> getEntityType() { return TPackingR.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPackingR newEntity() { return new TPackingR(); }
    public TPackingR newMyEntity() { return new TPackingR(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPackingR)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPackingR)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
