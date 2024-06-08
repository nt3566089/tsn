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
 * The DB meta of T_PIC_MTHD_RCMD. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPicMthdRcmdDbm _instance = new TPicMthdRcmdDbm();
    private TPicMthdRcmdDbm() {}
    public static TPicMthdRcmdDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getPicMthdRcmdId(), (et, vl) -> ((TPicMthdRcmd)et).setPicMthdRcmdId(ctl(vl)), "picMthdRcmdId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getClientId(), (et, vl) -> ((TPicMthdRcmd)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getCenterId(), (et, vl) -> ((TPicMthdRcmd)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getPickingBatchNo(), (et, vl) -> ((TPicMthdRcmd)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getRcmdPickingCls(), (et, vl) -> ((TPicMthdRcmd)et).setRcmdPickingCls((String)vl), "rcmdPickingCls");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getPackingNum(), (et, vl) -> ((TPicMthdRcmd)et).setPackingNum(ctl(vl)), "packingNum");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getWorkVolume(), (et, vl) -> ((TPicMthdRcmd)et).setWorkVolume(ctb(vl)), "workVolume");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getDeliveryCourseCd(), (et, vl) -> ((TPicMthdRcmd)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getDeliveryCourseNm(), (et, vl) -> ((TPicMthdRcmd)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getCarrierCd(), (et, vl) -> ((TPicMthdRcmd)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getCarrierNm(), (et, vl) -> ((TPicMthdRcmd)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getEmergencyFlg(), (et, vl) -> ((TPicMthdRcmd)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getDelFlg(), (et, vl) -> ((TPicMthdRcmd)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getVersionNo(), (et, vl) -> ((TPicMthdRcmd)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getControlNo(), (et, vl) -> ((TPicMthdRcmd)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getAddDt(), (et, vl) -> ((TPicMthdRcmd)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getAddUser(), (et, vl) -> ((TPicMthdRcmd)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getAddProcess(), (et, vl) -> ((TPicMthdRcmd)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getUpdDt(), (et, vl) -> ((TPicMthdRcmd)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getUpdUser(), (et, vl) -> ((TPicMthdRcmd)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPicMthdRcmd)et).getUpdProcess(), (et, vl) -> ((TPicMthdRcmd)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmd)et).getMCenter(), (et, vl) -> ((TPicMthdRcmd)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmd)et).getMClient(), (et, vl) -> ((TPicMthdRcmd)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmd)et).getBClassDtlByRcmdPickingCls(), (et, vl) -> ((TPicMthdRcmd)et).setBClassDtlByRcmdPickingCls((BClassDtl)vl), "BClassDtlByRcmdPickingCls");
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmd)et).getBClassDtlByEmergencyFlg(), (et, vl) -> ((TPicMthdRcmd)et).setBClassDtlByEmergencyFlg((BClassDtl)vl), "BClassDtlByEmergencyFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PIC_MTHD_RCMD";
    protected final String _tableDispName = "T_PIC_MTHD_RCMD";
    protected final String _tablePropertyName = "TPicMthdRcmd";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PIC_MTHD_RCMD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPicMthdRcmdId = cci("PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", null, null, Long.class, "picMthdRcmdId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TPicMthdRcmdCartList,TPicMthdRcmdDataList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("PICKING_BATCH_NO", "PICKING_BATCH_NO", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcmdPickingCls = cci("RCMD_PICKING_CLS", "RCMD_PICKING_CLS", null, null, String.class, "rcmdPickingCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByRcmdPickingCls", null, CDef.DefMeta.RcmdPickingCls, false);
    protected final ColumnInfo _columnPackingNum = cci("PACKING_NUM", "PACKING_NUM", null, null, Long.class, "packingNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkVolume = cci("WORK_VOLUME", "WORK_VOLUME", null, null, java.math.BigDecimal.class, "workVolume", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByEmergencyFlg", null, CDef.DefMeta.EmergencyFlg, false);
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
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdId() { return _columnPicMthdRcmdId; }
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
     * PICKING_BATCH_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
    /**
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcmdPickingCls() { return _columnRcmdPickingCls; }
    /**
     * PACKING_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum() { return _columnPackingNum; }
    /**
     * WORK_VOLUME: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkVolume() { return _columnWorkVolume; }
    /**
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * CARRIER_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
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
        ls.add(columnPicMthdRcmdId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnPickingBatchNo());
        ls.add(columnRcmdPickingCls());
        ls.add(columnPackingNum());
        ls.add(columnWorkVolume());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnEmergencyFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnPicMthdRcmdId()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_PIC_MTHD_RCMD_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPicMthdRcmdList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_PIC_MTHD_RCMD_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPicMthdRcmdList", false);
    }
    /**
     * B_CLASS_DTL by my RCMD_PICKING_CLS, named 'BClassDtlByRcmdPickingCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByRcmdPickingCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRcmdPickingCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PIC_MTHD_RCMD_RCMD_PICKING_CLS", "BClassDtlByRcmdPickingCls", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RCMD_PICKING_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEmergencyFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEmergencyFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PIC_MTHD_RCMD_EMERGENCY_FLG", "BClassDtlByEmergencyFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'EMERGENCY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdCartList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdId(), TPicMthdRcmdCartDbm.getInstance().columnPicMthdRcmdId());
        return cri("T_PIC_MTHD_RCMD_CART_FK2", "TPicMthdRcmdCartList", this, TPicMthdRcmdCartDbm.getInstance(), mp, false, "TPicMthdRcmd");
    }
    /**
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdDataList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdId(), TPicMthdRcmdDataDbm.getInstance().columnPicMthdRcmdId());
        return cri("T_PIC_MTHD_RCMD_DATA_FK1", "TPicMthdRcmdDataList", this, TPicMthdRcmdDataDbm.getInstance(), mp, false, "TPicMthdRcmd");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPicMthdRcmd"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPicMthdRcmd> getEntityType() { return TPicMthdRcmd.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPicMthdRcmd newEntity() { return new TPicMthdRcmd(); }
    public TPicMthdRcmd newMyEntity() { return new TPicMthdRcmd(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPicMthdRcmd)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPicMthdRcmd)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
