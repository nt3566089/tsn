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
 * The DB meta of T_PICKING_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPickingHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPickingHDbm _instance = new TPickingHDbm();
    private TPickingHDbm() {}
    public static TPickingHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPickingH)et).getPickingHId(), (et, vl) -> ((TPickingH)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TPickingH)et).getClientId(), (et, vl) -> ((TPickingH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TPickingH)et).getCenterId(), (et, vl) -> ((TPickingH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TPickingH)et).getProcessTypeId(), (et, vl) -> ((TPickingH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TPickingH)et).getPickingStatus(), (et, vl) -> ((TPickingH)et).setPickingStatus((String)vl), "pickingStatus");
        setupEpg(_epgMap, et -> ((TPickingH)et).getDelivUnitNo(), (et, vl) -> ((TPickingH)et).setDelivUnitNo((String)vl), "delivUnitNo");
        setupEpg(_epgMap, et -> ((TPickingH)et).getPickingWorkNo(), (et, vl) -> ((TPickingH)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((TPickingH)et).getAllocInstHId(), (et, vl) -> ((TPickingH)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((TPickingH)et).getForceFixedFlg(), (et, vl) -> ((TPickingH)et).setForceFixedFlg((String)vl), "forceFixedFlg");
        setupEpg(_epgMap, et -> ((TPickingH)et).getPickingGroupNo(), (et, vl) -> ((TPickingH)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((TPickingH)et).getSglRowPicFlg(), (et, vl) -> ((TPickingH)et).setSglRowPicFlg((String)vl), "sglRowPicFlg");
        setupEpg(_epgMap, et -> ((TPickingH)et).getShippingFixedDt(), (et, vl) -> ((TPickingH)et).setShippingFixedDt((String)vl), "shippingFixedDt");
        setupEpg(_epgMap, et -> ((TPickingH)et).getCenterTransitFlg(), (et, vl) -> ((TPickingH)et).setCenterTransitFlg((String)vl), "centerTransitFlg");
        setupEpg(_epgMap, et -> ((TPickingH)et).getPackingCalCls(), (et, vl) -> ((TPickingH)et).setPackingCalCls((String)vl), "packingCalCls");
        setupEpg(_epgMap, et -> ((TPickingH)et).getBolNo(), (et, vl) -> ((TPickingH)et).setBolNo((String)vl), "bolNo");
        setupEpg(_epgMap, et -> ((TPickingH)et).getDelFlg(), (et, vl) -> ((TPickingH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPickingH)et).getVersionNo(), (et, vl) -> ((TPickingH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPickingH)et).getControlNo(), (et, vl) -> ((TPickingH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPickingH)et).getAddDt(), (et, vl) -> ((TPickingH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPickingH)et).getAddUser(), (et, vl) -> ((TPickingH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPickingH)et).getAddProcess(), (et, vl) -> ((TPickingH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPickingH)et).getUpdDt(), (et, vl) -> ((TPickingH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPickingH)et).getUpdUser(), (et, vl) -> ((TPickingH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPickingH)et).getUpdProcess(), (et, vl) -> ((TPickingH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getMProcessType(), (et, vl) -> ((TPickingH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getMCenter(), (et, vl) -> ((TPickingH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getMClient(), (et, vl) -> ((TPickingH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getTAllocInstH(), (et, vl) -> ((TPickingH)et).setTAllocInstH((TAllocInstH)vl), "TAllocInstH");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getBClassDtlByCenterTransitFlg(), (et, vl) -> ((TPickingH)et).setBClassDtlByCenterTransitFlg((BClassDtl)vl), "BClassDtlByCenterTransitFlg");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getBClassDtlByForceFixedFlg(), (et, vl) -> ((TPickingH)et).setBClassDtlByForceFixedFlg((BClassDtl)vl), "BClassDtlByForceFixedFlg");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getBClassDtlByPackingCalCls(), (et, vl) -> ((TPickingH)et).setBClassDtlByPackingCalCls((BClassDtl)vl), "BClassDtlByPackingCalCls");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getBClassDtlByPickingStatus(), (et, vl) -> ((TPickingH)et).setBClassDtlByPickingStatus((BClassDtl)vl), "BClassDtlByPickingStatus");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getBClassDtlBySglRowPicFlg(), (et, vl) -> ((TPickingH)et).setBClassDtlBySglRowPicFlg((BClassDtl)vl), "BClassDtlBySglRowPicFlg");
        setupEfpg(_efpgMap, et -> ((TPickingH)et).getTPickingRAsOne(), (et, vl) -> ((TPickingH)et).setTPickingRAsOne((TPickingR)vl), "TPickingRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PICKING_H";
    protected final String _tableDispName = "T_PICKING_H";
    protected final String _tablePropertyName = "TPickingH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PICKING_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TPackingHList,TPickingBList,TPicMthdRcmdDataList,TReceivePlanHList,WSglRowShipInspBList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnPickingStatus = cci("PICKING_STATUS", "PICKING_STATUS", null, null, String.class, "pickingStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPickingStatus", null, CDef.DefMeta.PickingStatus, false);
    protected final ColumnInfo _columnDelivUnitNo = cci("DELIV_UNIT_NO", "DELIV_UNIT_NO", null, null, String.class, "delivUnitNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TAllocInstH", null, null, false);
    protected final ColumnInfo _columnForceFixedFlg = cci("FORCE_FIXED_FLG", "FORCE_FIXED_FLG", null, null, String.class, "forceFixedFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByForceFixedFlg", null, CDef.DefMeta.ForceFixedFlg, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSglRowPicFlg = cci("SGL_ROW_PIC_FLG", "SGL_ROW_PIC_FLG", null, null, String.class, "sglRowPicFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySglRowPicFlg", null, CDef.DefMeta.SglRowPicFlg, false);
    protected final ColumnInfo _columnShippingFixedDt = cci("SHIPPING_FIXED_DT", "SHIPPING_FIXED_DT", null, null, String.class, "shippingFixedDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterTransitFlg = cci("CENTER_TRANSIT_FLG", "CENTER_TRANSIT_FLG", null, null, String.class, "centerTransitFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByCenterTransitFlg", null, CDef.DefMeta.CenterTransitFlg, false);
    protected final ColumnInfo _columnPackingCalCls = cci("PACKING_CAL_CLS", "PACKING_CAL_CLS", null, null, String.class, "packingCalCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPackingCalCls", null, CDef.DefMeta.PackingCalCls, false);
    protected final ColumnInfo _columnBolNo = cci("BOL_NO", "BOL_NO", null, null, String.class, "bolNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
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
     * PICKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingStatus() { return _columnPickingStatus; }
    /**
     * DELIV_UNIT_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivUnitNo() { return _columnDelivUnitNo; }
    /**
     * PICKING_WORK_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * FORCE_FIXED_FLG: {char(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceFixedFlg() { return _columnForceFixedFlg; }
    /**
     * PICKING_GROUP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
    /**
     * SGL_ROW_PIC_FLG: {char(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowPicFlg() { return _columnSglRowPicFlg; }
    /**
     * SHIPPING_FIXED_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingFixedDt() { return _columnShippingFixedDt; }
    /**
     * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterTransitFlg() { return _columnCenterTransitFlg; }
    /**
     * PACKING_CAL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingCalCls() { return _columnPackingCalCls; }
    /**
     * BOL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolNo() { return _columnBolNo; }
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
        ls.add(columnPickingHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProcessTypeId());
        ls.add(columnPickingStatus());
        ls.add(columnDelivUnitNo());
        ls.add(columnPickingWorkNo());
        ls.add(columnAllocInstHId());
        ls.add(columnForceFixedFlg());
        ls.add(columnPickingGroupNo());
        ls.add(columnSglRowPicFlg());
        ls.add(columnShippingFixedDt());
        ls.add(columnCenterTransitFlg());
        ls.add(columnPackingCalCls());
        ls.add(columnBolNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingHId()); }
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
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_PICKING_H_FK3", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPickingHList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_PICKING_H_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPickingHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_PICKING_H_FK4", "MClient", this, MClientDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPickingHList", false);
    }
    /**
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstHId(), TAllocInstHDbm.getInstance().columnAllocInstHId());
        return cfi("T_PICKING_H_FK2", "TAllocInstH", this, TAllocInstHDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TPickingHList", false);
    }
    /**
     * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCenterTransitFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterTransitFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_H_CENTER_TRANSIT_FLG", "BClassDtlByCenterTransitFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CENTER_TRANSIT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByForceFixedFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnForceFixedFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_H_FORCE_FIXED_FLG", "BClassDtlByForceFixedFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'FORCE_FIXED_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingCalCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingCalCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_H_PACKING_CAL_CLS", "BClassDtlByPackingCalCls", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PACKING_CAL_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PICKING_STATUS, named 'BClassDtlByPickingStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPickingStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_H_PICKING_STATUS", "BClassDtlByPickingStatus", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PICKING_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySglRowPicFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSglRowPicFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_H_SGL_ROW_PIC_FLG", "BClassDtlBySglRowPicFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SGL_ROW_PIC_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_PICKING_R by PICKING_H_ID, named 'TPickingRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTPickingRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingRDbm.getInstance().columnPickingHId());
        return cfi("T_PICKING_R_FK1", "TPickingRAsOne", this, TPickingRDbm.getInstance(), mp, 9, null, true, false, true, false, null, null, false, "TPickingH", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPackingHDbm.getInstance().columnPickingHId());
        return cri("T_PACKING_H_FK4", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "TPickingH");
    }
    /**
     * T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingBDbm.getInstance().columnPickingHId());
        return cri("T_PICKING_B_FK4", "TPickingBList", this, TPickingBDbm.getInstance(), mp, false, "TPickingH");
    }
    /**
     * T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdDataList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPicMthdRcmdDataDbm.getInstance().columnPickingHId());
        return cri("T_PIC_MTHD_RCMD_DATA_FK2", "TPicMthdRcmdDataList", this, TPicMthdRcmdDataDbm.getInstance(), mp, false, "TPickingH");
    }
    /**
     * T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TReceivePlanHDbm.getInstance().columnPickingHId());
        return cri("T_RECEIVE_PLAN_H_FK4", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "TPickingH");
    }
    /**
     * W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), WSglRowShipInspBDbm.getInstance().columnPickingHId());
        return cri("W_SGL_ROW_SHIP_INSP_B_FK1", "WSglRowShipInspBList", this, WSglRowShipInspBDbm.getInstance(), mp, false, "TPickingH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPickingH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPickingHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPickingHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPickingH> getEntityType() { return TPickingH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPickingH newEntity() { return new TPickingH(); }
    public TPickingH newMyEntity() { return new TPickingH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPickingH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPickingH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
