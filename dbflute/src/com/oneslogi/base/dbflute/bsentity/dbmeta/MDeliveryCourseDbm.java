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
 * The DB meta of M_DELIVERY_COURSE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MDeliveryCourseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MDeliveryCourseDbm _instance = new MDeliveryCourseDbm();
    private MDeliveryCourseDbm() {}
    public static MDeliveryCourseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getDeliveryCourseId(), (et, vl) -> ((MDeliveryCourse)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getCenterId(), (et, vl) -> ((MDeliveryCourse)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getDeliveryCourseCd(), (et, vl) -> ((MDeliveryCourse)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getDeliveryCourseNm(), (et, vl) -> ((MDeliveryCourse)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getCarrierId(), (et, vl) -> ((MDeliveryCourse)et).setCarrierId(ctl(vl)), "carrierId");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getPickingTime(), (et, vl) -> ((MDeliveryCourse)et).setPickingTime((String)vl), "pickingTime");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getStowageTime(), (et, vl) -> ((MDeliveryCourse)et).setStowageTime((String)vl), "stowageTime");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getShippingTime(), (et, vl) -> ((MDeliveryCourse)et).setShippingTime((String)vl), "shippingTime");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getCarrierSlipYmtId(), (et, vl) -> ((MDeliveryCourse)et).setCarrierSlipYmtId(ctl(vl)), "carrierSlipYmtId");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getCarrierSlipSgwId(), (et, vl) -> ((MDeliveryCourse)et).setCarrierSlipSgwId(ctl(vl)), "carrierSlipSgwId");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getCarrierSlipYupkId(), (et, vl) -> ((MDeliveryCourse)et).setCarrierSlipYupkId(ctl(vl)), "carrierSlipYupkId");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getTrackingNumberingKey(), (et, vl) -> ((MDeliveryCourse)et).setTrackingNumberingKey((String)vl), "trackingNumberingKey");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getTrackingNumberingAfterKey(), (et, vl) -> ((MDeliveryCourse)et).setTrackingNumberingAfterKey((String)vl), "trackingNumberingAfterKey");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getTrackingNumberingUnit(), (et, vl) -> ((MDeliveryCourse)et).setTrackingNumberingUnit((String)vl), "trackingNumberingUnit");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getTagType(), (et, vl) -> ((MDeliveryCourse)et).setTagType((String)vl), "tagType");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getTagTypeAfter(), (et, vl) -> ((MDeliveryCourse)et).setTagTypeAfter((String)vl), "tagTypeAfter");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getTagDataType(), (et, vl) -> ((MDeliveryCourse)et).setTagDataType((String)vl), "tagDataType");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getPaymentTerm(), (et, vl) -> ((MDeliveryCourse)et).setPaymentTerm((String)vl), "paymentTerm");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getDelFlg(), (et, vl) -> ((MDeliveryCourse)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getVersionNo(), (et, vl) -> ((MDeliveryCourse)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getControlNo(), (et, vl) -> ((MDeliveryCourse)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getAddDt(), (et, vl) -> ((MDeliveryCourse)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getAddUser(), (et, vl) -> ((MDeliveryCourse)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getAddProcess(), (et, vl) -> ((MDeliveryCourse)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getUpdDt(), (et, vl) -> ((MDeliveryCourse)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getUpdUser(), (et, vl) -> ((MDeliveryCourse)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MDeliveryCourse)et).getUpdProcess(), (et, vl) -> ((MDeliveryCourse)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCarrier(), (et, vl) -> ((MDeliveryCourse)et).setMCarrier((MCarrier)vl), "MCarrier");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCarrierSlipSgw(), (et, vl) -> ((MDeliveryCourse)et).setMCarrierSlipSgw((MCarrierSlipSgw)vl), "MCarrierSlipSgw");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCarrierSlipYmt(), (et, vl) -> ((MDeliveryCourse)et).setMCarrierSlipYmt((MCarrierSlipYmt)vl), "MCarrierSlipYmt");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCarrierSlipYupk(), (et, vl) -> ((MDeliveryCourse)et).setMCarrierSlipYupk((MCarrierSlipYupk)vl), "MCarrierSlipYupk");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCenter(), (et, vl) -> ((MDeliveryCourse)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getBClassDtlByDelFlg(), (et, vl) -> ((MDeliveryCourse)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCenterClassDtlByTagDataType(), (et, vl) -> ((MDeliveryCourse)et).setMCenterClassDtlByTagDataType((MCenterClassDtl)vl), "MCenterClassDtlByTagDataType");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCenterClassDtlByTagType(), (et, vl) -> ((MDeliveryCourse)et).setMCenterClassDtlByTagType((MCenterClassDtl)vl), "MCenterClassDtlByTagType");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getMCenterClassDtlByTagTypeAfter(), (et, vl) -> ((MDeliveryCourse)et).setMCenterClassDtlByTagTypeAfter((MCenterClassDtl)vl), "MCenterClassDtlByTagTypeAfter");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getBClassDtlByTrackingNumberingUnit(), (et, vl) -> ((MDeliveryCourse)et).setBClassDtlByTrackingNumberingUnit((BClassDtl)vl), "BClassDtlByTrackingNumberingUnit");
        setupEfpg(_efpgMap, et -> ((MDeliveryCourse)et).getBClassDtlByPaymentTerm(), (et, vl) -> ((MDeliveryCourse)et).setBClassDtlByPaymentTerm((BClassDtl)vl), "BClassDtlByPaymentTerm");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_DELIVERY_COURSE";
    protected final String _tableDispName = "M_DELIVERY_COURSE";
    protected final String _tablePropertyName = "MDeliveryCourse";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_DELIVERY_COURSE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MCenterCustomerList,MParamList,TAllocInstHList,TShippingInstHList,WHtLoadingList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierId = cci("CARRIER_ID", "CARRIER_ID", null, null, Long.class, "carrierId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCarrier", null, null, false);
    protected final ColumnInfo _columnPickingTime = cci("PICKING_TIME", "PICKING_TIME", null, null, String.class, "pickingTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStowageTime = cci("STOWAGE_TIME", "STOWAGE_TIME", null, null, String.class, "stowageTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTime = cci("SHIPPING_TIME", "SHIPPING_TIME", null, null, String.class, "shippingTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierSlipYmtId = cci("CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", null, null, Long.class, "carrierSlipYmtId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCarrierSlipYmt", null, null, false);
    protected final ColumnInfo _columnCarrierSlipSgwId = cci("CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", null, null, Long.class, "carrierSlipSgwId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCarrierSlipSgw", null, null, false);
    protected final ColumnInfo _columnCarrierSlipYupkId = cci("CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", null, null, Long.class, "carrierSlipYupkId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCarrierSlipYupk", null, null, false);
    protected final ColumnInfo _columnTrackingNumberingKey = cci("TRACKING_NUMBERING_KEY", "TRACKING_NUMBERING_KEY", null, null, String.class, "trackingNumberingKey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingNumberingAfterKey = cci("TRACKING_NUMBERING_AFTER_KEY", "TRACKING_NUMBERING_AFTER_KEY", null, null, String.class, "trackingNumberingAfterKey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingNumberingUnit = cci("TRACKING_NUMBERING_UNIT", "TRACKING_NUMBERING_UNIT", null, null, String.class, "trackingNumberingUnit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByTrackingNumberingUnit", null, CDef.DefMeta.TrackingNumberingUnit, false);
    protected final ColumnInfo _columnTagType = cci("TAG_TYPE", "TAG_TYPE", null, null, String.class, "tagType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByTagType", null, CDef.DefMeta.CenterTagType, false);
    protected final ColumnInfo _columnTagTypeAfter = cci("TAG_TYPE_AFTER", "TAG_TYPE_AFTER", null, null, String.class, "tagTypeAfter", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByTagTypeAfter", null, CDef.DefMeta.CenterTagTypeAfter, false);
    protected final ColumnInfo _columnTagDataType = cci("TAG_DATA_TYPE", "TAG_DATA_TYPE", null, null, String.class, "tagDataType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByTagDataType", null, CDef.DefMeta.CenterTagDataType, false);
    protected final ColumnInfo _columnPaymentTerm = cci("PAYMENT_TERM", "PAYMENT_TERM", null, null, String.class, "paymentTerm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPaymentTerm", null, CDef.DefMeta.PaymentTerm, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierId() { return _columnCarrierId; }
    /**
     * PICKING_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingTime() { return _columnPickingTime; }
    /**
     * STOWAGE_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStowageTime() { return _columnStowageTime; }
    /**
     * SHIPPING_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTime() { return _columnShippingTime; }
    /**
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipYmtId() { return _columnCarrierSlipYmtId; }
    /**
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipSgwId() { return _columnCarrierSlipSgwId; }
    /**
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipYupkId() { return _columnCarrierSlipYupkId; }
    /**
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingNumberingKey() { return _columnTrackingNumberingKey; }
    /**
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingNumberingAfterKey() { return _columnTrackingNumberingAfterKey; }
    /**
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingNumberingUnit() { return _columnTrackingNumberingUnit; }
    /**
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagType() { return _columnTagType; }
    /**
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagTypeAfter() { return _columnTagTypeAfter; }
    /**
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagDataType() { return _columnTagDataType; }
    /**
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentTerm() { return _columnPaymentTerm; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnDeliveryCourseId());
        ls.add(columnCenterId());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierId());
        ls.add(columnPickingTime());
        ls.add(columnStowageTime());
        ls.add(columnShippingTime());
        ls.add(columnCarrierSlipYmtId());
        ls.add(columnCarrierSlipSgwId());
        ls.add(columnCarrierSlipYupkId());
        ls.add(columnTrackingNumberingKey());
        ls.add(columnTrackingNumberingAfterKey());
        ls.add(columnTrackingNumberingUnit());
        ls.add(columnTagType());
        ls.add(columnTagTypeAfter());
        ls.add(columnTagDataType());
        ls.add(columnPaymentTerm());
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
    protected UniqueInfo cpui() { return hpcpui(columnDeliveryCourseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnDeliveryCourseCd());
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
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCarrier() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDbm.getInstance().columnCarrierId());
        return cfi("M_DELIVERY_COURSE_FK2", "MCarrier", this, MCarrierDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MDeliveryCourseList", false);
    }
    /**
     * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCarrierSlipSgw() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierSlipSgwId(), MCarrierSlipSgwDbm.getInstance().columnCarrierSlipSgwId());
        return cfi("M_DELIVERY_COURSE_FK1", "MCarrierSlipSgw", this, MCarrierSlipSgwDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MDeliveryCourseList", false);
    }
    /**
     * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCarrierSlipYmt() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierSlipYmtId(), MCarrierSlipYmtDbm.getInstance().columnCarrierSlipYmtId());
        return cfi("M_DELIVERY_COURSE_FK5", "MCarrierSlipYmt", this, MCarrierSlipYmtDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MDeliveryCourseList", false);
    }
    /**
     * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCarrierSlipYupk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierSlipYupkId(), MCarrierSlipYupkDbm.getInstance().columnCarrierSlipYupkId());
        return cfi("M_DELIVERY_COURSE_FK4", "MCarrierSlipYupk", this, MCarrierSlipYupkDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "MDeliveryCourseList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_DELIVERY_COURSE_FK3", "MCenter", this, MCenterDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "MDeliveryCourseList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_DELIVERY_COURSE_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByTagDataType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagDataType(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_DELIVERY_COURSE_TAG_DATA_TYPE", "MCenterClassDtlByTagDataType", this, MCenterClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'TAG_DATA_TYPE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByTagDataType.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByTagType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagType(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_DELIVERY_COURSE_TAG_TYPE", "MCenterClassDtlByTagType", this, MCenterClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'TAG_TYPE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByTagType.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByTagTypeAfter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagTypeAfter(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_DELIVERY_COURSE_TAG_TYPE_AFTER", "MCenterClassDtlByTagTypeAfter", this, MCenterClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'TAG_TYPE_AFTER'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByTagTypeAfter.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTrackingNumberingUnit() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrackingNumberingUnit(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_DELIVERY_COURSE_TRACKING_NUMBERING_UNIT", "BClassDtlByTrackingNumberingUnit", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'TRACKING_NUMBERING_UNIT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPaymentTerm() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPaymentTerm(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_DELIVERY_COURSE_PAYMENT_TERM", "BClassDtlByPaymentTerm", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PAYMENT_TERM'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), MCenterCustomerDbm.getInstance().columnDeliveryCourseId());
        return cri("M_CENTER_CUSTOMER_FK1", "MCenterCustomerList", this, MCenterCustomerDbm.getInstance(), mp, false, "MDeliveryCourse");
    }
    /**
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMParamList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), MParamDbm.getInstance().columnDeliveryCourseId());
        return cri("M_PARAM_FK5", "MParamList", this, MParamDbm.getInstance(), mp, false, "MDeliveryCourse");
    }
    /**
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), TAllocInstHDbm.getInstance().columnDeliveryCourseId());
        return cri("T_ALLOC_INST_H_FK2", "TAllocInstHList", this, TAllocInstHDbm.getInstance(), mp, false, "MDeliveryCourse");
    }
    /**
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), TShippingInstHDbm.getInstance().columnDeliveryCourseId());
        return cri("T_SHIPPING_INST_H_FK3", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "MDeliveryCourse");
    }
    /**
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtLoadingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), WHtLoadingDbm.getInstance().columnDeliveryCourseId());
        return cri("W_HT_LOADING_FK2", "WHtLoadingList", this, WHtLoadingDbm.getInstance(), mp, false, "MDeliveryCourse");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MDeliveryCourse"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MDeliveryCourse> getEntityType() { return MDeliveryCourse.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MDeliveryCourse newEntity() { return new MDeliveryCourse(); }
    public MDeliveryCourse newMyEntity() { return new MDeliveryCourse(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MDeliveryCourse)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MDeliveryCourse)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
