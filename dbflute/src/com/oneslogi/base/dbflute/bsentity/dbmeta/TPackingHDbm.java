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
 * The DB meta of T_PACKING_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPackingHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPackingHDbm _instance = new TPackingHDbm();
    private TPackingHDbm() {}
    public static TPackingHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPackingH)et).getPackingHId(), (et, vl) -> ((TPackingH)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getClientId(), (et, vl) -> ((TPackingH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getCenterId(), (et, vl) -> ((TPackingH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getProcessTypeId(), (et, vl) -> ((TPackingH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getPackingStatus(), (et, vl) -> ((TPackingH)et).setPackingStatus((String)vl), "packingStatus");
        setupEpg(_epgMap, et -> ((TPackingH)et).getAllocInstHId(), (et, vl) -> ((TPackingH)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getPickingHId(), (et, vl) -> ((TPackingH)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getShippingPackingNo(), (et, vl) -> ((TPackingH)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getCarrierTraceNum(), (et, vl) -> ((TPackingH)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((TPackingH)et).getBoxId(), (et, vl) -> ((TPackingH)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((TPackingH)et).getGrossWeight(), (et, vl) -> ((TPackingH)et).setGrossWeight(ctb(vl)), "grossWeight");
        setupEpg(_epgMap, et -> ((TPackingH)et).getTotalVolume(), (et, vl) -> ((TPackingH)et).setTotalVolume(ctb(vl)), "totalVolume");
        setupEpg(_epgMap, et -> ((TPackingH)et).getMixedFlg(), (et, vl) -> ((TPackingH)et).setMixedFlg((String)vl), "mixedFlg");
        setupEpg(_epgMap, et -> ((TPackingH)et).getMultiPicFlg(), (et, vl) -> ((TPackingH)et).setMultiPicFlg((String)vl), "multiPicFlg");
        setupEpg(_epgMap, et -> ((TPackingH)et).getCartNo(), (et, vl) -> ((TPackingH)et).setCartNo(ctl(vl)), "cartNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getBucketColNo(), (et, vl) -> ((TPackingH)et).setBucketColNo(ctl(vl)), "bucketColNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getBucketRowNo(), (et, vl) -> ((TPackingH)et).setBucketRowNo(ctl(vl)), "bucketRowNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getSeedingNo(), (et, vl) -> ((TPackingH)et).setSeedingNo((String)vl), "seedingNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getLoadingFlg(), (et, vl) -> ((TPackingH)et).setLoadingFlg((String)vl), "loadingFlg");
        setupEpg(_epgMap, et -> ((TPackingH)et).getDelFlg(), (et, vl) -> ((TPackingH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPackingH)et).getVersionNo(), (et, vl) -> ((TPackingH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getControlNo(), (et, vl) -> ((TPackingH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPackingH)et).getAddDt(), (et, vl) -> ((TPackingH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPackingH)et).getAddUser(), (et, vl) -> ((TPackingH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPackingH)et).getAddProcess(), (et, vl) -> ((TPackingH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPackingH)et).getUpdDt(), (et, vl) -> ((TPackingH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPackingH)et).getUpdUser(), (et, vl) -> ((TPackingH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPackingH)et).getUpdProcess(), (et, vl) -> ((TPackingH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getTAllocInstH(), (et, vl) -> ((TPackingH)et).setTAllocInstH((TAllocInstH)vl), "TAllocInstH");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getMBox(), (et, vl) -> ((TPackingH)et).setMBox((MBox)vl), "MBox");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getMCenter(), (et, vl) -> ((TPackingH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getMClient(), (et, vl) -> ((TPackingH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getTPickingH(), (et, vl) -> ((TPackingH)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getMProcessType(), (et, vl) -> ((TPackingH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getBUserByUpdUser(), (et, vl) -> ((TPackingH)et).setBUserByUpdUser((BUser)vl), "BUserByUpdUser");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getBClassDtlByLoadingFlg(), (et, vl) -> ((TPackingH)et).setBClassDtlByLoadingFlg((BClassDtl)vl), "BClassDtlByLoadingFlg");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getBClassDtlByMixedFlg(), (et, vl) -> ((TPackingH)et).setBClassDtlByMixedFlg((BClassDtl)vl), "BClassDtlByMixedFlg");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getBClassDtlByMultiPicFlg(), (et, vl) -> ((TPackingH)et).setBClassDtlByMultiPicFlg((BClassDtl)vl), "BClassDtlByMultiPicFlg");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getBClassDtlByPackingStatus(), (et, vl) -> ((TPackingH)et).setBClassDtlByPackingStatus((BClassDtl)vl), "BClassDtlByPackingStatus");
        setupEfpg(_efpgMap, et -> ((TPackingH)et).getTPackingRAsOne(), (et, vl) -> ((TPackingH)et).setTPackingRAsOne((TPackingR)vl), "TPackingRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PACKING_H";
    protected final String _tableDispName = "T_PACKING_H";
    protected final String _tablePropertyName = "TPackingH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PACKING_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TPackingBList,TPicMthdRcmdCartList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnPackingStatus = cci("PACKING_STATUS", "PACKING_STATUS", null, null, String.class, "packingStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPackingStatus", null, CDef.DefMeta.PackingStatus, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TAllocInstH", null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("SHIPPING_PACKING_NO", "SHIPPING_PACKING_NO", null, null, String.class, "shippingPackingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MBox", null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "grossWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalVolume = cci("TOTAL_VOLUME", "TOTAL_VOLUME", null, null, java.math.BigDecimal.class, "totalVolume", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedFlg = cci("MIXED_FLG", "MIXED_FLG", null, null, String.class, "mixedFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByMixedFlg", null, CDef.DefMeta.MixedFlg, false);
    protected final ColumnInfo _columnMultiPicFlg = cci("MULTI_PIC_FLG", "MULTI_PIC_FLG", null, null, String.class, "multiPicFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByMultiPicFlg", null, CDef.DefMeta.MultiPicFlg, false);
    protected final ColumnInfo _columnCartNo = cci("CART_NO", "CART_NO", null, null, Long.class, "cartNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBucketColNo = cci("BUCKET_COL_NO", "BUCKET_COL_NO", null, null, Long.class, "bucketColNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBucketRowNo = cci("BUCKET_ROW_NO", "BUCKET_ROW_NO", null, null, Long.class, "bucketRowNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeedingNo = cci("SEEDING_NO", "SEEDING_NO", null, null, String.class, "seedingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadingFlg = cci("LOADING_FLG", "LOADING_FLG", null, null, String.class, "loadingFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLoadingFlg", null, CDef.DefMeta.LoadingFlg, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, "BUserByUpdUser", null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
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
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingStatus() { return _columnPackingStatus; }
    /**
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
    /**
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalVolume() { return _columnTotalVolume; }
    /**
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedFlg() { return _columnMixedFlg; }
    /**
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiPicFlg() { return _columnMultiPicFlg; }
    /**
     * CART_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCartNo() { return _columnCartNo; }
    /**
     * BUCKET_COL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBucketColNo() { return _columnBucketColNo; }
    /**
     * BUCKET_ROW_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBucketRowNo() { return _columnBucketRowNo; }
    /**
     * SEEDING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeedingNo() { return _columnSeedingNo; }
    /**
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadingFlg() { return _columnLoadingFlg; }
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
     * UPD_USER: {varchar(255), FK to B_USER}
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
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProcessTypeId());
        ls.add(columnPackingStatus());
        ls.add(columnAllocInstHId());
        ls.add(columnPickingHId());
        ls.add(columnShippingPackingNo());
        ls.add(columnCarrierTraceNum());
        ls.add(columnBoxId());
        ls.add(columnGrossWeight());
        ls.add(columnTotalVolume());
        ls.add(columnMixedFlg());
        ls.add(columnMultiPicFlg());
        ls.add(columnCartNo());
        ls.add(columnBucketColNo());
        ls.add(columnBucketRowNo());
        ls.add(columnSeedingNo());
        ls.add(columnLoadingFlg());
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
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TAllocInstHDbm.getInstance().columnAllocInstHId());
        return cfi("T_PACKING_H_FK1", "TAllocInstH", this, TAllocInstHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPackingHList", false);
    }
    /**
     * M_BOX by my BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("T_PACKING_H_FK2", "MBox", this, MBoxDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPackingHList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_PACKING_H_FK5", "MCenter", this, MCenterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPackingHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_PACKING_H_FK6", "MClient", this, MClientDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TPackingHList", false);
    }
    /**
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("T_PACKING_H_FK4", "TPickingH", this, TPickingHDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TPackingHList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_PACKING_H_FK3", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TPackingHList", false);
    }
    /**
     * B_USER by my UPD_USER, named 'BUserByUpdUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByUpdUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUpdUser(), BUserDbm.getInstance().columnUserCd());
        return cfi("FK_T_PACKING_H_TO_B_USER_BY_UPD", "BUserByUpdUser", this, BUserDbm.getInstance(), mp, 6, null, false, false, false, true, null, null, false, "TPackingHByUpdUserList", false);
    }
    /**
     * B_CLASS_DTL by my LOADING_FLG, named 'BClassDtlByLoadingFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLoadingFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoadingFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_H_LOADING_FLG", "BClassDtlByLoadingFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOADING_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MIXED_FLG, named 'BClassDtlByMixedFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMixedFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMixedFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_H_MIXED_FLG", "BClassDtlByMixedFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MIXED_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MULTI_PIC_FLG, named 'BClassDtlByMultiPicFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMultiPicFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMultiPicFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_H_MULTI_PIC_FLG", "BClassDtlByMultiPicFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MULTI_PIC_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_STATUS, named 'BClassDtlByPackingStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_H_PACKING_STATUS", "BClassDtlByPackingStatus", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PACKING_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTPackingRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), TPackingRDbm.getInstance().columnPackingHId());
        return cfi("T_PACKING_R_FK4", "TPackingRAsOne", this, TPackingRDbm.getInstance(), mp, 11, null, true, false, true, false, null, null, false, "TPackingH", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), TPackingBDbm.getInstance().columnPackingHId());
        return cri("T_PACKING_B_FK3", "TPackingBList", this, TPackingBDbm.getInstance(), mp, false, "TPackingH");
    }
    /**
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdCartList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), TPicMthdRcmdCartDbm.getInstance().columnPackingHId());
        return cri("T_PIC_MTHD_RCMD_CART_FK1", "TPicMthdRcmdCartList", this, TPicMthdRcmdCartDbm.getInstance(), mp, false, "TPackingH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPackingH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPackingHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPackingHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPackingH> getEntityType() { return TPackingH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPackingH newEntity() { return new TPackingH(); }
    public TPackingH newMyEntity() { return new TPackingH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPackingH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPackingH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
