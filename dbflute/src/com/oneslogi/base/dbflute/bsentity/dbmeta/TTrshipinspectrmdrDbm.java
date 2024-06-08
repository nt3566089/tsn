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
 * The DB meta of T_TRSHIPINSPECTRMDR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrshipinspectrmdrDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrshipinspectrmdrDbm _instance = new TTrshipinspectrmdrDbm();
    private TTrshipinspectrmdrDbm() {}
    public static TTrshipinspectrmdrDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getShippingInspectionRemainingId(), (et, vl) -> ((TTrshipinspectrmdr)et).setShippingInspectionRemainingId(ctl(vl)), "shippingInspectionRemainingId");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getShipinspectrmdrkey(), (et, vl) -> ((TTrshipinspectrmdr)et).setShipinspectrmdrkey(ctl(vl)), "shipinspectrmdrkey");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getPickingInstDetailId(), (et, vl) -> ((TTrshipinspectrmdr)et).setPickingInstDetailId(ctl(vl)), "pickingInstDetailId");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getTagcd(), (et, vl) -> ((TTrshipinspectrmdr)et).setTagcd((String)vl), "tagcd");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getRootpackkey(), (et, vl) -> ((TTrshipinspectrmdr)et).setRootpackkey(ctl(vl)), "rootpackkey");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getPackkey(), (et, vl) -> ((TTrshipinspectrmdr)et).setPackkey(ctl(vl)), "packkey");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getSoid(), (et, vl) -> ((TTrshipinspectrmdr)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getSodetailid(), (et, vl) -> ((TTrshipinspectrmdr)et).setSodetailid(ctl(vl)), "sodetailid");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getDeliverygroupkey(), (et, vl) -> ((TTrshipinspectrmdr)et).setDeliverygroupkey(ctl(vl)), "deliverygroupkey");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getWbkey(), (et, vl) -> ((TTrshipinspectrmdr)et).setWbkey(ctl(vl)), "wbkey");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getWarehousecd(), (et, vl) -> ((TTrshipinspectrmdr)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getProductId(), (et, vl) -> ((TTrshipinspectrmdr)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getLotId(), (et, vl) -> ((TTrshipinspectrmdr)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getInspectedqty1(), (et, vl) -> ((TTrshipinspectrmdr)et).setInspectedqty1(ctl(vl)), "inspectedqty1");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getExpectqty1(), (et, vl) -> ((TTrshipinspectrmdr)et).setExpectqty1(ctl(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getCenterId(), (et, vl) -> ((TTrshipinspectrmdr)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getClientId(), (et, vl) -> ((TTrshipinspectrmdr)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getDelFlg(), (et, vl) -> ((TTrshipinspectrmdr)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getVersionNo(), (et, vl) -> ((TTrshipinspectrmdr)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getControlNo(), (et, vl) -> ((TTrshipinspectrmdr)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getAddDt(), (et, vl) -> ((TTrshipinspectrmdr)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getAddUser(), (et, vl) -> ((TTrshipinspectrmdr)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getAddProcess(), (et, vl) -> ((TTrshipinspectrmdr)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getUpdDt(), (et, vl) -> ((TTrshipinspectrmdr)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getUpdUser(), (et, vl) -> ((TTrshipinspectrmdr)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrshipinspectrmdr)et).getUpdProcess(), (et, vl) -> ((TTrshipinspectrmdr)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSHIPINSPECTRMDR";
    protected final String _tableDispName = "T_TRSHIPINSPECTRMDR";
    protected final String _tablePropertyName = "TTrshipinspectrmdr";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSHIPINSPECTRMDR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInspectionRemainingId = cci("SHIPPING_INSPECTION_REMAINING_ID", "SHIPPING_INSPECTION_REMAINING_ID", null, null, Long.class, "shippingInspectionRemainingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipinspectrmdrkey = cci("SHIPINSPECTRMDRKEY", "SHIPINSPECTRMDRKEY", null, null, Long.class, "shipinspectrmdrkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingInstDetailId = cci("PICKING_INST_DETAIL_ID", "PICKING_INST_DETAIL_ID", null, null, Long.class, "pickingInstDetailId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagcd = cci("TAGCD", "TAGCD", null, null, String.class, "tagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRootpackkey = cci("ROOTPACKKEY", "ROOTPACKKEY", null, null, Long.class, "rootpackkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackkey = cci("PACKKEY", "PACKKEY", null, null, Long.class, "packkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSodetailid = cci("SODETAILID", "SODETAILID", null, null, Long.class, "sodetailid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverygroupkey = cci("DELIVERYGROUPKEY", "DELIVERYGROUPKEY", null, null, Long.class, "deliverygroupkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWbkey = cci("WBKEY", "WBKEY", null, null, Long.class, "wbkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty1 = cci("INSPECTEDQTY1", "INSPECTEDQTY1", null, null, Long.class, "inspectedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, Long.class, "expectqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INSPECTION_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInspectionRemainingId() { return _columnShippingInspectionRemainingId; }
    /**
     * SHIPINSPECTRMDRKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipinspectrmdrkey() { return _columnShipinspectrmdrkey; }
    /**
     * PICKING_INST_DETAIL_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstDetailId() { return _columnPickingInstDetailId; }
    /**
     * TAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagcd() { return _columnTagcd; }
    /**
     * ROOTPACKKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRootpackkey() { return _columnRootpackkey; }
    /**
     * PACKKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackkey() { return _columnPackkey; }
    /**
     * SOID: {IX+, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * SODETAILID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSodetailid() { return _columnSodetailid; }
    /**
     * DELIVERYGROUPKEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverygroupkey() { return _columnDeliverygroupkey; }
    /**
     * WBKEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWbkey() { return _columnWbkey; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty1() { return _columnInspectedqty1; }
    /**
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * CENTER_ID: {IX+, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnShippingInspectionRemainingId());
        ls.add(columnShipinspectrmdrkey());
        ls.add(columnPickingInstDetailId());
        ls.add(columnTagcd());
        ls.add(columnRootpackkey());
        ls.add(columnPackkey());
        ls.add(columnSoid());
        ls.add(columnSodetailid());
        ls.add(columnDeliverygroupkey());
        ls.add(columnWbkey());
        ls.add(columnWarehousecd());
        ls.add(columnProductId());
        ls.add(columnLotId());
        ls.add(columnInspectedqty1());
        ls.add(columnExpectqty1());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInspectionRemainingId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrshipinspectrmdr"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrshipinspectrmdrCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrshipinspectrmdrBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrshipinspectrmdr> getEntityType() { return TTrshipinspectrmdr.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrshipinspectrmdr newEntity() { return new TTrshipinspectrmdr(); }
    public TTrshipinspectrmdr newMyEntity() { return new TTrshipinspectrmdr(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrshipinspectrmdr)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrshipinspectrmdr)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
