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
 * The DB meta of W_SGL_ROW_SHIP_INSP_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WSglRowShipInspBDbm _instance = new WSglRowShipInspBDbm();
    private WSglRowShipInspBDbm() {}
    public static WSglRowShipInspBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getSglRowShipInspBId(), (et, vl) -> ((WSglRowShipInspB)et).setSglRowShipInspBId(ctl(vl)), "sglRowShipInspBId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getSglRowShipInspHId(), (et, vl) -> ((WSglRowShipInspB)et).setSglRowShipInspHId(ctl(vl)), "sglRowShipInspHId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getPickingHId(), (et, vl) -> ((WSglRowShipInspB)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getUserId(), (et, vl) -> ((WSglRowShipInspB)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getInspectedNum(), (et, vl) -> ((WSglRowShipInspB)et).setInspectedNum(ctl(vl)), "inspectedNum");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getInspectionFlg(), (et, vl) -> ((WSglRowShipInspB)et).setInspectionFlg((String)vl), "inspectionFlg");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getDelFlg(), (et, vl) -> ((WSglRowShipInspB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getVersionNo(), (et, vl) -> ((WSglRowShipInspB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getControlNo(), (et, vl) -> ((WSglRowShipInspB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getAddDt(), (et, vl) -> ((WSglRowShipInspB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getAddUser(), (et, vl) -> ((WSglRowShipInspB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getAddProcess(), (et, vl) -> ((WSglRowShipInspB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getUpdDt(), (et, vl) -> ((WSglRowShipInspB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getUpdUser(), (et, vl) -> ((WSglRowShipInspB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WSglRowShipInspB)et).getUpdProcess(), (et, vl) -> ((WSglRowShipInspB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspB)et).getTPickingH(), (et, vl) -> ((WSglRowShipInspB)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspB)et).getWSglRowShipInspH(), (et, vl) -> ((WSglRowShipInspB)et).setWSglRowShipInspH((WSglRowShipInspH)vl), "WSglRowShipInspH");
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspB)et).getBUser(), (et, vl) -> ((WSglRowShipInspB)et).setBUser((BUser)vl), "BUser");
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspB)et).getBClassDtlByInspectionFlg(), (et, vl) -> ((WSglRowShipInspB)et).setBClassDtlByInspectionFlg((BClassDtl)vl), "BClassDtlByInspectionFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_SGL_ROW_SHIP_INSP_B";
    protected final String _tableDispName = "W_SGL_ROW_SHIP_INSP_B";
    protected final String _tablePropertyName = "WSglRowShipInspB";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_SGL_ROW_SHIP_INSP_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSglRowShipInspBId = cci("SGL_ROW_SHIP_INSP_B_ID", "SGL_ROW_SHIP_INSP_B_ID", null, null, Long.class, "sglRowShipInspBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSglRowShipInspHId = cci("SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", null, null, Long.class, "sglRowShipInspHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "WSglRowShipInspH", null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUser", null, null, false);
    protected final ColumnInfo _columnInspectedNum = cci("INSPECTED_NUM", "INSPECTED_NUM", null, null, Long.class, "inspectedNum", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionFlg = cci("INSPECTION_FLG", "INSPECTION_FLG", null, null, String.class, "inspectionFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByInspectionFlg", null, CDef.DefMeta.InspectionFlg, false);
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
     * SGL_ROW_SHIP_INSP_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowShipInspBId() { return _columnSglRowShipInspBId; }
    /**
     * SGL_ROW_SHIP_INSP_H_ID: {UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowShipInspHId() { return _columnSglRowShipInspHId; }
    /**
     * PICKING_H_ID: {+UQ, IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * INSPECTED_NUM: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedNum() { return _columnInspectedNum; }
    /**
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionFlg() { return _columnInspectionFlg; }
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
        ls.add(columnSglRowShipInspBId());
        ls.add(columnSglRowShipInspHId());
        ls.add(columnPickingHId());
        ls.add(columnUserId());
        ls.add(columnInspectedNum());
        ls.add(columnInspectionFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnSglRowShipInspBId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnSglRowShipInspHId());
        ls.add(columnPickingHId());
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
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("W_SGL_ROW_SHIP_INSP_B_FK1", "TPickingH", this, TPickingHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WSglRowShipInspBList", false);
    }
    /**
     * W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWSglRowShipInspH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSglRowShipInspHId(), WSglRowShipInspHDbm.getInstance().columnSglRowShipInspHId());
        return cfi("W_SGL_ROW_SHIP_INSP_B_FK3", "WSglRowShipInspH", this, WSglRowShipInspHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WSglRowShipInspBList", false);
    }
    /**
     * B_USER by my USER_ID, named 'BUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("W_SGL_ROW_SHIP_INSP_B_FK2", "BUser", this, BUserDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WSglRowShipInspBList", false);
    }
    /**
     * B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInspectionFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspectionFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_W_SGL_ROW_SHIP_INSP_B_INSPECTION_FLG", "BClassDtlByInspectionFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSPECTION_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WSglRowShipInspB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WSglRowShipInspBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WSglRowShipInspBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WSglRowShipInspB> getEntityType() { return WSglRowShipInspB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WSglRowShipInspB newEntity() { return new WSglRowShipInspB(); }
    public WSglRowShipInspB newMyEntity() { return new WSglRowShipInspB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WSglRowShipInspB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WSglRowShipInspB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
