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
 * The DB meta of T_RECEIVE_PLAN_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReceivePlanHDbm _instance = new TReceivePlanHDbm();
    private TReceivePlanHDbm() {}
    public static TReceivePlanHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getReceivePlanHId(), (et, vl) -> ((TReceivePlanH)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getClientId(), (et, vl) -> ((TReceivePlanH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getCenterId(), (et, vl) -> ((TReceivePlanH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getProcessTypeId(), (et, vl) -> ((TReceivePlanH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getStockTypeId(), (et, vl) -> ((TReceivePlanH)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getReceivePlanDt(), (et, vl) -> ((TReceivePlanH)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getPlanClientReceiveNo(), (et, vl) -> ((TReceivePlanH)et).setPlanClientReceiveNo((String)vl), "planClientReceiveNo");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getReceiveSlipNo(), (et, vl) -> ((TReceivePlanH)et).setReceiveSlipNo((String)vl), "receiveSlipNo");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getPlanSupplierId(), (et, vl) -> ((TReceivePlanH)et).setPlanSupplierId(ctl(vl)), "planSupplierId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getPlanSupplierCd(), (et, vl) -> ((TReceivePlanH)et).setPlanSupplierCd((String)vl), "planSupplierCd");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getPlanDepositId(), (et, vl) -> ((TReceivePlanH)et).setPlanDepositId(ctl(vl)), "planDepositId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getPlanDepositCd(), (et, vl) -> ((TReceivePlanH)et).setPlanDepositCd((String)vl), "planDepositCd");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getReceiveStatus(), (et, vl) -> ((TReceivePlanH)et).setReceiveStatus((String)vl), "receiveStatus");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getInputType(), (et, vl) -> ((TReceivePlanH)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getReceiveDeliveryStatus(), (et, vl) -> ((TReceivePlanH)et).setReceiveDeliveryStatus((String)vl), "receiveDeliveryStatus");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getOldReceivePlanHId(), (et, vl) -> ((TReceivePlanH)et).setOldReceivePlanHId(ctl(vl)), "oldReceivePlanHId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getErrorFlg(), (et, vl) -> ((TReceivePlanH)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getErrorMessageCd(), (et, vl) -> ((TReceivePlanH)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getCenterTransitFlg(), (et, vl) -> ((TReceivePlanH)et).setCenterTransitFlg((String)vl), "centerTransitFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getPickingHId(), (et, vl) -> ((TReceivePlanH)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getDelFlg(), (et, vl) -> ((TReceivePlanH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getVersionNo(), (et, vl) -> ((TReceivePlanH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getControlNo(), (et, vl) -> ((TReceivePlanH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getAddDt(), (et, vl) -> ((TReceivePlanH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getAddUser(), (et, vl) -> ((TReceivePlanH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getAddProcess(), (et, vl) -> ((TReceivePlanH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getUpdDt(), (et, vl) -> ((TReceivePlanH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getUpdUser(), (et, vl) -> ((TReceivePlanH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TReceivePlanH)et).getUpdProcess(), (et, vl) -> ((TReceivePlanH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getTReceivePlanHSelf(), (et, vl) -> ((TReceivePlanH)et).setTReceivePlanHSelf((TReceivePlanH)vl), "TReceivePlanHSelf");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getMCustomerByPlanDepositId(), (et, vl) -> ((TReceivePlanH)et).setMCustomerByPlanDepositId((MCustomer)vl), "MCustomerByPlanDepositId");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getMClient(), (et, vl) -> ((TReceivePlanH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getMStockType(), (et, vl) -> ((TReceivePlanH)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getMCenter(), (et, vl) -> ((TReceivePlanH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getMProcessType(), (et, vl) -> ((TReceivePlanH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getMCustomerByPlanSupplierId(), (et, vl) -> ((TReceivePlanH)et).setMCustomerByPlanSupplierId((MCustomer)vl), "MCustomerByPlanSupplierId");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getTPickingH(), (et, vl) -> ((TReceivePlanH)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getBClassDtlByCenterTransitFlg(), (et, vl) -> ((TReceivePlanH)et).setBClassDtlByCenterTransitFlg((BClassDtl)vl), "BClassDtlByCenterTransitFlg");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getBClassDtlByErrorFlg(), (et, vl) -> ((TReceivePlanH)et).setBClassDtlByErrorFlg((BClassDtl)vl), "BClassDtlByErrorFlg");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getBClassDtlByInputType(), (et, vl) -> ((TReceivePlanH)et).setBClassDtlByInputType((BClassDtl)vl), "BClassDtlByInputType");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getBClassDtlByReceiveDeliveryStatus(), (et, vl) -> ((TReceivePlanH)et).setBClassDtlByReceiveDeliveryStatus((BClassDtl)vl), "BClassDtlByReceiveDeliveryStatus");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getBClassDtlByReceiveStatus(), (et, vl) -> ((TReceivePlanH)et).setBClassDtlByReceiveStatus((BClassDtl)vl), "BClassDtlByReceiveStatus");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getTReceivePlanRAsOne(), (et, vl) -> ((TReceivePlanH)et).setTReceivePlanRAsOne((TReceivePlanR)vl), "TReceivePlanRAsOne");
        setupEfpg(_efpgMap, et -> ((TReceivePlanH)et).getTTrrcvAsOne(), (et, vl) -> ((TReceivePlanH)et).setTTrrcvAsOne((TTrrcv)vl), "TTrrcvAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_RECEIVE_PLAN_H";
    protected final String _tableDispName = "T_RECEIVE_PLAN_H";
    protected final String _tablePropertyName = "TReceivePlanH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_RECEIVE_PLAN_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TReceivePlanBList,TReceivePlanHSelfList,TStoreRecordHList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("RECEIVE_PLAN_DT", "RECEIVE_PLAN_DT", null, null, String.class, "receivePlanDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanClientReceiveNo = cci("PLAN_CLIENT_RECEIVE_NO", "PLAN_CLIENT_RECEIVE_NO", null, null, String.class, "planClientReceiveNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveSlipNo = cci("RECEIVE_SLIP_NO", "RECEIVE_SLIP_NO", null, null, String.class, "receiveSlipNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanSupplierId = cci("PLAN_SUPPLIER_ID", "PLAN_SUPPLIER_ID", null, null, Long.class, "planSupplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByPlanSupplierId", null, null, false);
    protected final ColumnInfo _columnPlanSupplierCd = cci("PLAN_SUPPLIER_CD", "PLAN_SUPPLIER_CD", null, null, String.class, "planSupplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanDepositId = cci("PLAN_DEPOSIT_ID", "PLAN_DEPOSIT_ID", null, null, Long.class, "planDepositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByPlanDepositId", null, null, false);
    protected final ColumnInfo _columnPlanDepositCd = cci("PLAN_DEPOSIT_CD", "PLAN_DEPOSIT_CD", null, null, String.class, "planDepositCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatus = cci("RECEIVE_STATUS", "RECEIVE_STATUS", null, null, String.class, "receiveStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByReceiveStatus", null, CDef.DefMeta.ReceiveStatus, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByInputType", null, CDef.DefMeta.InputType, false);
    protected final ColumnInfo _columnReceiveDeliveryStatus = cci("RECEIVE_DELIVERY_STATUS", "RECEIVE_DELIVERY_STATUS", null, null, String.class, "receiveDeliveryStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByReceiveDeliveryStatus", null, CDef.DefMeta.ReceiveDeliveryStatus, false);
    protected final ColumnInfo _columnOldReceivePlanHId = cci("OLD_RECEIVE_PLAN_H_ID", "OLD_RECEIVE_PLAN_H_ID", null, null, Long.class, "oldReceivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TReceivePlanHSelf", null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByErrorFlg", null, CDef.DefMeta.ErrorFlg, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterTransitFlg = cci("CENTER_TRANSIT_FLG", "CENTER_TRANSIT_FLG", null, null, String.class, "centerTransitFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByCenterTransitFlg", null, CDef.DefMeta.CenterTransitFlg, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
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
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
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
     * PROCESS_TYPE_ID: {IX, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * RECEIVE_PLAN_DT: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDt() { return _columnReceivePlanDt; }
    /**
     * PLAN_CLIENT_RECEIVE_NO: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanClientReceiveNo() { return _columnPlanClientReceiveNo; }
    /**
     * RECEIVE_SLIP_NO: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveSlipNo() { return _columnReceiveSlipNo; }
    /**
     * PLAN_SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanSupplierId() { return _columnPlanSupplierId; }
    /**
     * PLAN_SUPPLIER_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanSupplierCd() { return _columnPlanSupplierCd; }
    /**
     * PLAN_DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanDepositId() { return _columnPlanDepositId; }
    /**
     * PLAN_DEPOSIT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanDepositCd() { return _columnPlanDepositCd; }
    /**
     * RECEIVE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatus() { return _columnReceiveStatus; }
    /**
     * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputType() { return _columnInputType; }
    /**
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDeliveryStatus() { return _columnReceiveDeliveryStatus; }
    /**
     * OLD_RECEIVE_PLAN_H_ID: {IX, bigint(19), FK to T_RECEIVE_PLAN_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldReceivePlanHId() { return _columnOldReceivePlanHId; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CENTER_TRANSIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterTransitFlg() { return _columnCenterTransitFlg; }
    /**
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
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
        ls.add(columnReceivePlanHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProcessTypeId());
        ls.add(columnStockTypeId());
        ls.add(columnReceivePlanDt());
        ls.add(columnPlanClientReceiveNo());
        ls.add(columnReceiveSlipNo());
        ls.add(columnPlanSupplierId());
        ls.add(columnPlanSupplierCd());
        ls.add(columnPlanDepositId());
        ls.add(columnPlanDepositCd());
        ls.add(columnReceiveStatus());
        ls.add(columnInputType());
        ls.add(columnReceiveDeliveryStatus());
        ls.add(columnOldReceivePlanHId());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnCenterTransitFlg());
        ls.add(columnPickingHId());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanHId()); }
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
     * T_RECEIVE_PLAN_H by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanHSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOldReceivePlanHId(), TReceivePlanHDbm.getInstance().columnReceivePlanHId());
        return cfi("T_RECEIVE_PLAN_H_FK2", "TReceivePlanHSelf", this, TReceivePlanHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TReceivePlanHSelfList", false);
    }
    /**
     * M_CUSTOMER by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByPlanDepositId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlanDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_RECEIVE_PLAN_H_FK3", "MCustomerByPlanDepositId", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TReceivePlanHByPlanDepositIdList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_RECEIVE_PLAN_H_FK6", "MClient", this, MClientDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TReceivePlanHList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_RECEIVE_PLAN_H_FK5", "MStockType", this, MStockTypeDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TReceivePlanHList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_RECEIVE_PLAN_H_FK8", "MCenter", this, MCenterDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TReceivePlanHList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_RECEIVE_PLAN_H_FK7", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TReceivePlanHList", false);
    }
    /**
     * M_CUSTOMER by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByPlanSupplierId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlanSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_RECEIVE_PLAN_H_FK1", "MCustomerByPlanSupplierId", this, MCustomerDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TReceivePlanHByPlanSupplierIdList", false);
    }
    /**
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("T_RECEIVE_PLAN_H_FK4", "TPickingH", this, TPickingHDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TReceivePlanHList", false);
    }
    /**
     * B_CLASS_DTL by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCenterTransitFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterTransitFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_H_CENTER_TRANSIT_FLG", "BClassDtlByCenterTransitFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CENTER_TRANSIT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_H_ERROR_FLG", "BClassDtlByErrorFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ERROR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInputType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_H_INPUT_TYPE", "BClassDtlByInputType", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReceiveDeliveryStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceiveDeliveryStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_H_RECEIVE_DELIVERY_STATUS", "BClassDtlByReceiveDeliveryStatus", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RECEIVE_DELIVERY_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReceiveStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceiveStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_H_RECEIVE_STATUS", "BClassDtlByReceiveStatus", this, BClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RECEIVE_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_RECEIVE_PLAN_R by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTReceivePlanRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanRDbm.getInstance().columnReceivePlanHId());
        return cfi("T_RECEIVE_PLAN_R_FK1", "TReceivePlanRAsOne", this, TReceivePlanRDbm.getInstance(), mp, 13, null, true, false, true, false, null, null, false, "TReceivePlanH", false);
    }
    /**
     * T_TRRCV by RECEIVE_PLAN_H_ID, named 'TTrrcvAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTTrrcvAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TTrrcvDbm.getInstance().columnReceivePlanHId());
        return cfi("T_TRRCV_FK1", "TTrrcvAsOne", this, TTrrcvDbm.getInstance(), mp, 14, null, true, false, true, false, null, null, false, "TReceivePlanH", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_RECEIVE_PLAN_B by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanBDbm.getInstance().columnReceivePlanHId());
        return cri("T_RECEIVE_PLAN_B_FK3", "TReceivePlanBList", this, TReceivePlanBDbm.getInstance(), mp, false, "TReceivePlanH");
    }
    /**
     * T_RECEIVE_PLAN_H by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanHDbm.getInstance().columnOldReceivePlanHId());
        return cri("T_RECEIVE_PLAN_H_FK2", "TReceivePlanHSelfList", this, TReceivePlanHDbm.getInstance(), mp, false, "TReceivePlanHSelf");
    }
    /**
     * T_STORE_RECORD_H by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TStoreRecordHDbm.getInstance().columnReceivePlanHId());
        return cri("T_STORE_RECORD_H_FK7", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "TReceivePlanH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TReceivePlanH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TReceivePlanHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReceivePlanH> getEntityType() { return TReceivePlanH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReceivePlanH newEntity() { return new TReceivePlanH(); }
    public TReceivePlanH newMyEntity() { return new TReceivePlanH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReceivePlanH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReceivePlanH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
