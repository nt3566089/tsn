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
 * The DB meta of W_SGL_ROW_SHIP_INSP_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WSglRowShipInspHDbm _instance = new WSglRowShipInspHDbm();
    private WSglRowShipInspHDbm() {}
    public static WSglRowShipInspHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getSglRowShipInspHId(), (et, vl) -> ((WSglRowShipInspH)et).setSglRowShipInspHId(ctl(vl)), "sglRowShipInspHId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getClientId(), (et, vl) -> ((WSglRowShipInspH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getCenterId(), (et, vl) -> ((WSglRowShipInspH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getPickingGroupNo(), (et, vl) -> ((WSglRowShipInspH)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getTempNo(), (et, vl) -> ((WSglRowShipInspH)et).setTempNo((String)vl), "tempNo");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getProductId(), (et, vl) -> ((WSglRowShipInspH)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getWorkInstNum(), (et, vl) -> ((WSglRowShipInspH)et).setWorkInstNum(ctl(vl)), "workInstNum");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getSlipNum(), (et, vl) -> ((WSglRowShipInspH)et).setSlipNum(ctl(vl)), "slipNum");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getInspectedSlipNum(), (et, vl) -> ((WSglRowShipInspH)et).setInspectedSlipNum(ctl(vl)), "inspectedSlipNum");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getBoxId(), (et, vl) -> ((WSglRowShipInspH)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getDelFlg(), (et, vl) -> ((WSglRowShipInspH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getVersionNo(), (et, vl) -> ((WSglRowShipInspH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getControlNo(), (et, vl) -> ((WSglRowShipInspH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getAddDt(), (et, vl) -> ((WSglRowShipInspH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getAddUser(), (et, vl) -> ((WSglRowShipInspH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getAddProcess(), (et, vl) -> ((WSglRowShipInspH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getUpdDt(), (et, vl) -> ((WSglRowShipInspH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getUpdUser(), (et, vl) -> ((WSglRowShipInspH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WSglRowShipInspH)et).getUpdProcess(), (et, vl) -> ((WSglRowShipInspH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspH)et).getMBox(), (et, vl) -> ((WSglRowShipInspH)et).setMBox((MBox)vl), "MBox");
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspH)et).getMCenter(), (et, vl) -> ((WSglRowShipInspH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspH)et).getMClient(), (et, vl) -> ((WSglRowShipInspH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WSglRowShipInspH)et).getMProduct(), (et, vl) -> ((WSglRowShipInspH)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_SGL_ROW_SHIP_INSP_H";
    protected final String _tableDispName = "W_SGL_ROW_SHIP_INSP_H";
    protected final String _tablePropertyName = "WSglRowShipInspH";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_SGL_ROW_SHIP_INSP_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSglRowShipInspHId = cci("SGL_ROW_SHIP_INSP_H_ID", "SGL_ROW_SHIP_INSP_H_ID", null, null, Long.class, "sglRowShipInspHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "WSglRowShipInspBList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempNo = cci("TEMP_NO", "TEMP_NO", null, null, String.class, "tempNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnWorkInstNum = cci("WORK_INST_NUM", "WORK_INST_NUM", null, null, Long.class, "workInstNum", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNum = cci("SLIP_NUM", "SLIP_NUM", null, null, Long.class, "slipNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedSlipNum = cci("INSPECTED_SLIP_NUM", "INSPECTED_SLIP_NUM", null, null, Long.class, "inspectedSlipNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MBox", null, null, false);
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
     * SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowShipInspHId() { return _columnSglRowShipInspHId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
    /**
     * TEMP_NO: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempNo() { return _columnTempNo; }
    /**
     * PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * WORK_INST_NUM: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkInstNum() { return _columnWorkInstNum; }
    /**
     * SLIP_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipNum() { return _columnSlipNum; }
    /**
     * INSPECTED_SLIP_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedSlipNum() { return _columnInspectedSlipNum; }
    /**
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
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
        ls.add(columnSglRowShipInspHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnPickingGroupNo());
        ls.add(columnTempNo());
        ls.add(columnProductId());
        ls.add(columnWorkInstNum());
        ls.add(columnSlipNum());
        ls.add(columnInspectedSlipNum());
        ls.add(columnBoxId());
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
    protected UniqueInfo cpui() { return hpcpui(columnSglRowShipInspHId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnPickingGroupNo());
        ls.add(columnTempNo());
        ls.add(columnProductId());
        ls.add(columnWorkInstNum());
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
     * M_BOX by my BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("W_SGL_ROW_SHIP_INSP_H_FK2", "MBox", this, MBoxDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WSglRowShipInspHList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_SGL_ROW_SHIP_INSP_H_FK4", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WSglRowShipInspHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_SGL_ROW_SHIP_INSP_H_FK3", "MClient", this, MClientDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WSglRowShipInspHList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_SGL_ROW_SHIP_INSP_H_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WSglRowShipInspHList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSglRowShipInspHId(), WSglRowShipInspBDbm.getInstance().columnSglRowShipInspHId());
        return cri("W_SGL_ROW_SHIP_INSP_B_FK3", "WSglRowShipInspBList", this, WSglRowShipInspBDbm.getInstance(), mp, false, "WSglRowShipInspH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WSglRowShipInspH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WSglRowShipInspHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WSglRowShipInspHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WSglRowShipInspH> getEntityType() { return WSglRowShipInspH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WSglRowShipInspH newEntity() { return new WSglRowShipInspH(); }
    public WSglRowShipInspH newMyEntity() { return new WSglRowShipInspH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WSglRowShipInspH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WSglRowShipInspH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
