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
 * The DB meta of W_SHIPPING_INTERRUPT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WShippingInterruptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WShippingInterruptDbm _instance = new WShippingInterruptDbm();
    private WShippingInterruptDbm() {}
    public static WShippingInterruptDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getShippingInstHId(), (et, vl) -> ((WShippingInterrupt)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getAllocInstHId(), (et, vl) -> ((WShippingInterrupt)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getClientId(), (et, vl) -> ((WShippingInterrupt)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getCenterId(), (et, vl) -> ((WShippingInterrupt)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getUserCd(), (et, vl) -> ((WShippingInterrupt)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getPickingWorkNo(), (et, vl) -> ((WShippingInterrupt)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getProductId(), (et, vl) -> ((WShippingInterrupt)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getInstNum(), (et, vl) -> ((WShippingInterrupt)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getSpgQtyOns(), (et, vl) -> ((WShippingInterrupt)et).setSpgQtyOns(ctb(vl)), "spgQtyOns");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getSpgQtyRemain(), (et, vl) -> ((WShippingInterrupt)et).setSpgQtyRemain(ctb(vl)), "spgQtyRemain");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getPieceNo(), (et, vl) -> ((WShippingInterrupt)et).setPieceNo(ctl(vl)), "pieceNo");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getBoxId(), (et, vl) -> ((WShippingInterrupt)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getDelFlg(), (et, vl) -> ((WShippingInterrupt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getVersionNo(), (et, vl) -> ((WShippingInterrupt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getControlNo(), (et, vl) -> ((WShippingInterrupt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getAddDt(), (et, vl) -> ((WShippingInterrupt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getAddUser(), (et, vl) -> ((WShippingInterrupt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getAddProcess(), (et, vl) -> ((WShippingInterrupt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getUpdDt(), (et, vl) -> ((WShippingInterrupt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getUpdUser(), (et, vl) -> ((WShippingInterrupt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WShippingInterrupt)et).getUpdProcess(), (et, vl) -> ((WShippingInterrupt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WShippingInterrupt)et).getMClient(), (et, vl) -> ((WShippingInterrupt)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WShippingInterrupt)et).getMBox(), (et, vl) -> ((WShippingInterrupt)et).setMBox((MBox)vl), "MBox");
        setupEfpg(_efpgMap, et -> ((WShippingInterrupt)et).getMProduct(), (et, vl) -> ((WShippingInterrupt)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((WShippingInterrupt)et).getMCenter(), (et, vl) -> ((WShippingInterrupt)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_SHIPPING_INTERRUPT";
    protected final String _tableDispName = "W_SHIPPING_INTERRUPT";
    protected final String _tablePropertyName = "WShippingInterrupt";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_SHIPPING_INTERRUPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpgQtyOns = cci("SPG_QTY_ONS", "SPG_QTY_ONS", null, null, java.math.BigDecimal.class, "spgQtyOns", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpgQtyRemain = cci("SPG_QTY_REMAIN", "SPG_QTY_REMAIN", null, null, java.math.BigDecimal.class, "spgQtyRemain", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPieceNo = cci("PIECE_NO", "PIECE_NO", null, null, Long.class, "pieceNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
    /**
     * ALLOC_INST_H_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * USER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * PICKING_WORK_NO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * INST_NUM: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * SPG_QTY_ONS: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpgQtyOns() { return _columnSpgQtyOns; }
    /**
     * SPG_QTY_REMAIN: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpgQtyRemain() { return _columnSpgQtyRemain; }
    /**
     * PIECE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPieceNo() { return _columnPieceNo; }
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
        ls.add(columnShippingInstHId());
        ls.add(columnAllocInstHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnUserCd());
        ls.add(columnPickingWorkNo());
        ls.add(columnProductId());
        ls.add(columnInstNum());
        ls.add(columnSpgQtyOns());
        ls.add(columnSpgQtyRemain());
        ls.add(columnPieceNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstHId()); }
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
        return cfi("W_SHIPPING_INTERRUPT_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WShippingInterruptList", false);
    }
    /**
     * M_BOX by my BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("W_SHIPPING_INTERRUPT_FK4", "MBox", this, MBoxDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WShippingInterruptList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_SHIPPING_INTERRUPT_FK3", "MProduct", this, MProductDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WShippingInterruptList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_SHIPPING_INTERRUPT_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WShippingInterruptList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WShippingInterrupt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WShippingInterruptCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WShippingInterrupt> getEntityType() { return WShippingInterrupt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WShippingInterrupt newEntity() { return new WShippingInterrupt(); }
    public WShippingInterrupt newMyEntity() { return new WShippingInterrupt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WShippingInterrupt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WShippingInterrupt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
