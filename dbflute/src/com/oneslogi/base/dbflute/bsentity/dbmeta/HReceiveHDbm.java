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
 * The DB meta of H_RECEIVE_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HReceiveHDbm _instance = new HReceiveHDbm();
    private HReceiveHDbm() {}
    public static HReceiveHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HReceiveH)et).getStoreRecordHId(), (et, vl) -> ((HReceiveH)et).setStoreRecordHId(ctl(vl)), "storeRecordHId");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getHistDt(), (et, vl) -> ((HReceiveH)et).setHistDt((String)vl), "histDt");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getClientId(), (et, vl) -> ((HReceiveH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getClientCd(), (et, vl) -> ((HReceiveH)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getClientNm(), (et, vl) -> ((HReceiveH)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getCenterId(), (et, vl) -> ((HReceiveH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getCenterCd(), (et, vl) -> ((HReceiveH)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getCenterNm(), (et, vl) -> ((HReceiveH)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getProcessTypeId(), (et, vl) -> ((HReceiveH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getReceivePlanDt(), (et, vl) -> ((HReceiveH)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getClientReceiveNo(), (et, vl) -> ((HReceiveH)et).setClientReceiveNo((String)vl), "clientReceiveNo");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getReceiveSlipNo(), (et, vl) -> ((HReceiveH)et).setReceiveSlipNo((String)vl), "receiveSlipNo");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getSupplierId(), (et, vl) -> ((HReceiveH)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getSupplierCd(), (et, vl) -> ((HReceiveH)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getSupplierNm(), (et, vl) -> ((HReceiveH)et).setSupplierNm((String)vl), "supplierNm");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getDepositId(), (et, vl) -> ((HReceiveH)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getDepositCd(), (et, vl) -> ((HReceiveH)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getDepositNm(), (et, vl) -> ((HReceiveH)et).setDepositNm((String)vl), "depositNm");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getReceiveDeliveryStatus(), (et, vl) -> ((HReceiveH)et).setReceiveDeliveryStatus((String)vl), "receiveDeliveryStatus");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getDelFlg(), (et, vl) -> ((HReceiveH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getVersionNo(), (et, vl) -> ((HReceiveH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getControlNo(), (et, vl) -> ((HReceiveH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getAddDt(), (et, vl) -> ((HReceiveH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getAddUser(), (et, vl) -> ((HReceiveH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getAddProcess(), (et, vl) -> ((HReceiveH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getUpdDt(), (et, vl) -> ((HReceiveH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getUpdUser(), (et, vl) -> ((HReceiveH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HReceiveH)et).getUpdProcess(), (et, vl) -> ((HReceiveH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HReceiveH)et).getMProcessType(), (et, vl) -> ((HReceiveH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((HReceiveH)et).getBClassDtlByReceiveDeliveryStatus(), (et, vl) -> ((HReceiveH)et).setBClassDtlByReceiveDeliveryStatus((BClassDtl)vl), "BClassDtlByReceiveDeliveryStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_RECEIVE_H";
    protected final String _tableDispName = "H_RECEIVE_H";
    protected final String _tablePropertyName = "HReceiveH";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_RECEIVE_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreRecordHId = cci("STORE_RECORD_H_ID", "STORE_RECORD_H_ID", null, null, Long.class, "storeRecordHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HReceiveBList", null, false);
    protected final ColumnInfo _columnHistDt = cci("HIST_DT", "HIST_DT", null, null, String.class, "histDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("RECEIVE_PLAN_DT", "RECEIVE_PLAN_DT", null, null, String.class, "receivePlanDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientReceiveNo = cci("CLIENT_RECEIVE_NO", "CLIENT_RECEIVE_NO", null, null, String.class, "clientReceiveNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveSlipNo = cci("RECEIVE_SLIP_NO", "RECEIVE_SLIP_NO", null, null, String.class, "receiveSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm = cci("SUPPLIER_NM", "SUPPLIER_NM", null, null, String.class, "supplierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositNm = cci("DEPOSIT_NM", "DEPOSIT_NM", null, null, String.class, "depositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDeliveryStatus = cci("RECEIVE_DELIVERY_STATUS", "RECEIVE_DELIVERY_STATUS", null, null, String.class, "receiveDeliveryStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByReceiveDeliveryStatus", null, CDef.DefMeta.ReceiveDeliveryStatus, false);
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
     * STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordHId() { return _columnStoreRecordHId; }
    /**
     * HIST_DT: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistDt() { return _columnHistDt; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * RECEIVE_PLAN_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDt() { return _columnReceivePlanDt; }
    /**
     * CLIENT_RECEIVE_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientReceiveNo() { return _columnClientReceiveNo; }
    /**
     * RECEIVE_SLIP_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveSlipNo() { return _columnReceiveSlipNo; }
    /**
     * SUPPLIER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * SUPPLIER_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SUPPLIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierNm() { return _columnSupplierNm; }
    /**
     * DEPOSIT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositNm() { return _columnDepositNm; }
    /**
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDeliveryStatus() { return _columnReceiveDeliveryStatus; }
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
        ls.add(columnStoreRecordHId());
        ls.add(columnHistDt());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnProcessTypeId());
        ls.add(columnReceivePlanDt());
        ls.add(columnClientReceiveNo());
        ls.add(columnReceiveSlipNo());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnSupplierNm());
        ls.add(columnDepositId());
        ls.add(columnDepositCd());
        ls.add(columnDepositNm());
        ls.add(columnReceiveDeliveryStatus());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreRecordHId()); }
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
        return cfi("H_RECEIVE_H_FK1", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HReceiveHList", false);
    }
    /**
     * B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReceiveDeliveryStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceiveDeliveryStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_H_RECEIVE_H_RECEIVE_DELIVERY_STATUS", "BClassDtlByReceiveDeliveryStatus", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RECEIVE_DELIVERY_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_RECEIVE_B by STORE_RECORD_H_ID, named 'HReceiveBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHReceiveBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordHId(), HReceiveBDbm.getInstance().columnStoreRecordHId());
        return cri("H_RECEIVE_B_FK2", "HReceiveBList", this, HReceiveBDbm.getInstance(), mp, false, "HReceiveH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HReceiveH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HReceiveHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HReceiveHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HReceiveH> getEntityType() { return HReceiveH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HReceiveH newEntity() { return new HReceiveH(); }
    public HReceiveH newMyEntity() { return new HReceiveH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HReceiveH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HReceiveH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
