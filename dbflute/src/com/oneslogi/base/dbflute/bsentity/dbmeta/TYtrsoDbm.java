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
 * The DB meta of T_YTRSO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TYtrsoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TYtrsoDbm _instance = new TYtrsoDbm();
    private TYtrsoDbm() {}
    public static TYtrsoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TYtrso)et).getTrsrId(), (et, vl) -> ((TYtrso)et).setTrsrId(ctl(vl)), "trsrId");
        setupEpg(_epgMap, et -> ((TYtrso)et).getCenterId(), (et, vl) -> ((TYtrso)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TYtrso)et).getClientId(), (et, vl) -> ((TYtrso)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TYtrso)et).getSoKey(), (et, vl) -> ((TYtrso)et).setSoKey(ctl(vl)), "soKey");
        setupEpg(_epgMap, et -> ((TYtrso)et).getSrStatus(), (et, vl) -> ((TYtrso)et).setSrStatus((String)vl), "srStatus");
        setupEpg(_epgMap, et -> ((TYtrso)et).getRestockNumber(), (et, vl) -> ((TYtrso)et).setRestockNumber(ctl(vl)), "restockNumber");
        setupEpg(_epgMap, et -> ((TYtrso)et).getRestockKbn(), (et, vl) -> ((TYtrso)et).setRestockKbn((String)vl), "restockKbn");
        setupEpg(_epgMap, et -> ((TYtrso)et).getSortingRackNo(), (et, vl) -> ((TYtrso)et).setSortingRackNo((String)vl), "sortingRackNo");
        setupEpg(_epgMap, et -> ((TYtrso)et).getRestockSortKey(), (et, vl) -> ((TYtrso)et).setRestockSortKey((String)vl), "restockSortKey");
        setupEpg(_epgMap, et -> ((TYtrso)et).getShipSchDate(), (et, vl) -> ((TYtrso)et).setShipSchDate((String)vl), "shipSchDate");
        setupEpg(_epgMap, et -> ((TYtrso)et).getShipDate(), (et, vl) -> ((TYtrso)et).setShipDate((String)vl), "shipDate");
        setupEpg(_epgMap, et -> ((TYtrso)et).getCenterCd(), (et, vl) -> ((TYtrso)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TYtrso)et).getSortRestockFlg(), (et, vl) -> ((TYtrso)et).setSortRestockFlg((String)vl), "sortRestockFlg");
        setupEpg(_epgMap, et -> ((TYtrso)et).getDeliveryCenterCd(), (et, vl) -> ((TYtrso)et).setDeliveryCenterCd((String)vl), "deliveryCenterCd");
        setupEpg(_epgMap, et -> ((TYtrso)et).getLineBlock(), (et, vl) -> ((TYtrso)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((TYtrso)et).getDeliveryDirection(), (et, vl) -> ((TYtrso)et).setDeliveryDirection((String)vl), "deliveryDirection");
        setupEpg(_epgMap, et -> ((TYtrso)et).getPickBatchKey(), (et, vl) -> ((TYtrso)et).setPickBatchKey(ctl(vl)), "pickBatchKey");
        setupEpg(_epgMap, et -> ((TYtrso)et).getPicklistComment(), (et, vl) -> ((TYtrso)et).setPicklistComment((String)vl), "picklistComment");
        setupEpg(_epgMap, et -> ((TYtrso)et).getFromPicklistNo(), (et, vl) -> ((TYtrso)et).setFromPicklistNo(ctl(vl)), "fromPicklistNo");
        setupEpg(_epgMap, et -> ((TYtrso)et).getToPicklistNo(), (et, vl) -> ((TYtrso)et).setToPicklistNo(ctl(vl)), "toPicklistNo");
        setupEpg(_epgMap, et -> ((TYtrso)et).getDelFlg(), (et, vl) -> ((TYtrso)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TYtrso)et).getVersionNo(), (et, vl) -> ((TYtrso)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TYtrso)et).getControlNo(), (et, vl) -> ((TYtrso)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TYtrso)et).getAddDt(), (et, vl) -> ((TYtrso)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TYtrso)et).getAddUser(), (et, vl) -> ((TYtrso)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TYtrso)et).getAddProcess(), (et, vl) -> ((TYtrso)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TYtrso)et).getUpdDt(), (et, vl) -> ((TYtrso)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TYtrso)et).getUpdUser(), (et, vl) -> ((TYtrso)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TYtrso)et).getUpdProcess(), (et, vl) -> ((TYtrso)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TYtrso)et).getMClient(), (et, vl) -> ((TYtrso)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TYtrso)et).getMCenter(), (et, vl) -> ((TYtrso)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_YTRSO";
    protected final String _tableDispName = "T_YTRSO";
    protected final String _tablePropertyName = "TYtrso";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_YTRSO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsrId = cci("TRSR_ID", "TRSR_ID", null, null, Long.class, "trsrId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TYtrsodetailList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnSoKey = cci("SO_KEY", "SO_KEY", null, null, Long.class, "soKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrStatus = cci("SR_STATUS", "SR_STATUS", null, null, String.class, "srStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockNumber = cci("RESTOCK_NUMBER", "RESTOCK_NUMBER", null, null, Long.class, "restockNumber", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockKbn = cci("RESTOCK_KBN", "RESTOCK_KBN", null, null, String.class, "restockKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortingRackNo = cci("SORTING_RACK_NO", "SORTING_RACK_NO", null, null, String.class, "sortingRackNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestockSortKey = cci("RESTOCK_SORT_KEY", "RESTOCK_SORT_KEY", null, null, String.class, "restockSortKey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSchDate = cci("SHIP_SCH_DATE", "SHIP_SCH_DATE", null, null, String.class, "shipSchDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipDate = cci("SHIP_DATE", "SHIP_DATE", null, null, String.class, "shipDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortRestockFlg = cci("SORT_RESTOCK_FLG", "SORT_RESTOCK_FLG", null, null, String.class, "sortRestockFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCenterCd = cci("DELIVERY_CENTER_CD", "DELIVERY_CENTER_CD", null, null, String.class, "deliveryCenterCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryDirection = cci("DELIVERY_DIRECTION", "DELIVERY_DIRECTION", null, null, String.class, "deliveryDirection", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickBatchKey = cci("PICK_BATCH_KEY", "PICK_BATCH_KEY", null, null, Long.class, "pickBatchKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistComment = cci("PICKLIST_COMMENT", "PICKLIST_COMMENT", null, null, String.class, "picklistComment", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromPicklistNo = cci("FROM_PICKLIST_NO", "FROM_PICKLIST_NO", null, null, Long.class, "fromPicklistNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToPicklistNo = cci("TO_PICKLIST_NO", "TO_PICKLIST_NO", null, null, Long.class, "toPicklistNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsrId() { return _columnTrsrId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * SO_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoKey() { return _columnSoKey; }
    /**
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrStatus() { return _columnSrStatus; }
    /**
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockNumber() { return _columnRestockNumber; }
    /**
     * RESTOCK_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockKbn() { return _columnRestockKbn; }
    /**
     * SORTING_RACK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingRackNo() { return _columnSortingRackNo; }
    /**
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestockSortKey() { return _columnRestockSortKey; }
    /**
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipSchDate() { return _columnShipSchDate; }
    /**
     * SHIP_DATE: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipDate() { return _columnShipDate; }
    /**
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortRestockFlg() { return _columnSortRestockFlg; }
    /**
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCenterCd() { return _columnDeliveryCenterCd; }
    /**
     * LINE_BLOCK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * DELIVERY_DIRECTION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryDirection() { return _columnDeliveryDirection; }
    /**
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickBatchKey() { return _columnPickBatchKey; }
    /**
     * PICKLIST_COMMENT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistComment() { return _columnPicklistComment; }
    /**
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromPicklistNo() { return _columnFromPicklistNo; }
    /**
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToPicklistNo() { return _columnToPicklistNo; }
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
        ls.add(columnTrsrId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnSoKey());
        ls.add(columnSrStatus());
        ls.add(columnRestockNumber());
        ls.add(columnRestockKbn());
        ls.add(columnSortingRackNo());
        ls.add(columnRestockSortKey());
        ls.add(columnShipSchDate());
        ls.add(columnShipDate());
        ls.add(columnCenterCd());
        ls.add(columnSortRestockFlg());
        ls.add(columnDeliveryCenterCd());
        ls.add(columnLineBlock());
        ls.add(columnDeliveryDirection());
        ls.add(columnPickBatchKey());
        ls.add(columnPicklistComment());
        ls.add(columnFromPicklistNo());
        ls.add(columnToPicklistNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrsrId()); }
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
        return cfi("T_YTRSO_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TYtrsoList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_YTRSO_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TYtrsoList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTYtrsodetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsrId(), TYtrsodetailDbm.getInstance().columnTrsoId());
        return cri("T_YTRSODETAIL_FK2", "TYtrsodetailList", this, TYtrsodetailDbm.getInstance(), mp, false, "TYtrso");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TYtrso"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TYtrsoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TYtrsoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TYtrso> getEntityType() { return TYtrso.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TYtrso newEntity() { return new TYtrso(); }
    public TYtrso newMyEntity() { return new TYtrso(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TYtrso)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TYtrso)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
