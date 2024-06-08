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
 * The DB meta of W_CUSTOMER_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WCustomerInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WCustomerInputDbm _instance = new WCustomerInputDbm();
    private WCustomerInputDbm() {}
    public static WCustomerInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getCustomerInputId(), (et, vl) -> ((WCustomerInput)et).setCustomerInputId(ctl(vl)), "customerInputId");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getClientCd(), (et, vl) -> ((WCustomerInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getCustomerCd(), (et, vl) -> ((WCustomerInput)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getCustomerNm(), (et, vl) -> ((WCustomerInput)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getCustomerAbbr(), (et, vl) -> ((WCustomerInput)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getZipCd(), (et, vl) -> ((WCustomerInput)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getTelNo(), (et, vl) -> ((WCustomerInput)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAddress1(), (et, vl) -> ((WCustomerInput)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAddress2(), (et, vl) -> ((WCustomerInput)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAddress3(), (et, vl) -> ((WCustomerInput)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getVendorFlg(), (et, vl) -> ((WCustomerInput)et).setVendorFlg((String)vl), "vendorFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getDeliveryFlg(), (et, vl) -> ((WCustomerInput)et).setDeliveryFlg((String)vl), "deliveryFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getOnetimeFlg(), (et, vl) -> ((WCustomerInput)et).setOnetimeFlg((String)vl), "onetimeFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getDepositFlg(), (et, vl) -> ((WCustomerInput)et).setDepositFlg((String)vl), "depositFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAllocOrder(), (et, vl) -> ((WCustomerInput)et).setAllocOrder((String)vl), "allocOrder");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getLotReverseFlg(), (et, vl) -> ((WCustomerInput)et).setLotReverseFlg((String)vl), "lotReverseFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getLimitDtReverseFlg(), (et, vl) -> ((WCustomerInput)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getShippingStopFlg(), (et, vl) -> ((WCustomerInput)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getCenterCd(), (et, vl) -> ((WCustomerInput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getDeliveryCourseCd(), (et, vl) -> ((WCustomerInput)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getDeliveryOrder(), (et, vl) -> ((WCustomerInput)et).setDeliveryOrder((String)vl), "deliveryOrder");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getDeliveryReadTime(), (et, vl) -> ((WCustomerInput)et).setDeliveryReadTime((String)vl), "deliveryReadTime");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getLineNo(), (et, vl) -> ((WCustomerInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getWorkFlg(), (et, vl) -> ((WCustomerInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getErrorFlg(), (et, vl) -> ((WCustomerInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getErrorMsg(), (et, vl) -> ((WCustomerInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getDelFlg(), (et, vl) -> ((WCustomerInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getVersionNo(), (et, vl) -> ((WCustomerInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getControlNo(), (et, vl) -> ((WCustomerInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAddDt(), (et, vl) -> ((WCustomerInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAddUser(), (et, vl) -> ((WCustomerInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getAddProcess(), (et, vl) -> ((WCustomerInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getUpdDt(), (et, vl) -> ((WCustomerInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getUpdUser(), (et, vl) -> ((WCustomerInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WCustomerInput)et).getUpdProcess(), (et, vl) -> ((WCustomerInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_CUSTOMER_INPUT";
    protected final String _tableDispName = "W_CUSTOMER_INPUT";
    protected final String _tablePropertyName = "WCustomerInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_CUSTOMER_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCustomerInputId = cci("CUSTOMER_INPUT_ID", "CUSTOMER_INPUT_ID", null, null, Long.class, "customerInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVendorFlg = cci("VENDOR_FLG", "VENDOR_FLG", null, null, String.class, "vendorFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryFlg = cci("DELIVERY_FLG", "DELIVERY_FLG", null, null, String.class, "deliveryFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnetimeFlg = cci("ONETIME_FLG", "ONETIME_FLG", null, null, String.class, "onetimeFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositFlg = cci("DEPOSIT_FLG", "DEPOSIT_FLG", null, null, String.class, "depositFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, String.class, "allocOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotReverseFlg = cci("LOT_REVERSE_FLG", "LOT_REVERSE_FLG", null, null, String.class, "lotReverseFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryOrder = cci("DELIVERY_ORDER", "DELIVERY_ORDER", null, null, String.class, "deliveryOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryReadTime = cci("DELIVERY_READ_TIME", "DELIVERY_READ_TIME", null, null, String.class, "deliveryReadTime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * CUSTOMER_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerInputId() { return _columnCustomerInputId; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * CUSTOMER_ABBR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerAbbr() { return _columnCustomerAbbr; }
    /**
     * ZIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
    /**
     * ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * VENDOR_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorFlg() { return _columnVendorFlg; }
    /**
     * DELIVERY_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryFlg() { return _columnDeliveryFlg; }
    /**
     * ONETIME_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnetimeFlg() { return _columnOnetimeFlg; }
    /**
     * DEPOSIT_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositFlg() { return _columnDepositFlg; }
    /**
     * ALLOC_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * LOT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotReverseFlg() { return _columnLotReverseFlg; }
    /**
     * LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * SHIPPING_STOP_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * DELIVERY_COURSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryOrder() { return _columnDeliveryOrder; }
    /**
     * DELIVERY_READ_TIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryReadTime() { return _columnDeliveryReadTime; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnCustomerInputId());
        ls.add(columnClientCd());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnCustomerAbbr());
        ls.add(columnZipCd());
        ls.add(columnTelNo());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnVendorFlg());
        ls.add(columnDeliveryFlg());
        ls.add(columnOnetimeFlg());
        ls.add(columnDepositFlg());
        ls.add(columnAllocOrder());
        ls.add(columnLotReverseFlg());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnShippingStopFlg());
        ls.add(columnCenterCd());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryOrder());
        ls.add(columnDeliveryReadTime());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnCustomerInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WCustomerInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WCustomerInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WCustomerInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WCustomerInput> getEntityType() { return WCustomerInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WCustomerInput newEntity() { return new WCustomerInput(); }
    public WCustomerInput newMyEntity() { return new WCustomerInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WCustomerInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WCustomerInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
