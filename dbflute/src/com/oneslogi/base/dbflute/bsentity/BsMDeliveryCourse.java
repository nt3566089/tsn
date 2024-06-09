package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_DELIVERY_COURSE as TABLE. <br>
 * 配送コースマスタ
 * <pre>
 * [primary-key]
 *     DELIVERY_COURSE_ID
 *
 * [column]
 *     DELIVERY_COURSE_ID, CENTER_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, CARRIER_SLIP_YMT_ID, CARRIER_SLIP_SGW_ID, CARRIER_SLIP_YUPK_ID, TRACKING_NUMBERING_KEY, TRACKING_NUMBERING_AFTER_KEY, TRACKING_NUMBERING_UNIT, TAG_TYPE, TAG_TYPE_AFTER, TAG_DATA_TYPE, PAYMENT_TERM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIVERY_COURSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CENTER, B_CLASS_DTL(ByDelFlg), M_CENTER_CLASS_DTL(ByTagDataType)
 *
 * [referrer table]
 *     M_CENTER_CUSTOMER, M_PARAM, T_ALLOC_INST_H, T_SHIPPING_INST_H, W_HT_LOADING
 *
 * [foreign property]
 *     mCarrier, mCarrierSlipSgw, mCarrierSlipYmt, mCarrierSlipYupk, mCenter, bClassDtlByDelFlg, mCenterClassDtlByTagDataType, mCenterClassDtlByTagType, mCenterClassDtlByTagTypeAfter, bClassDtlByTrackingNumberingUnit, bClassDtlByPaymentTerm
 *
 * [referrer property]
 *     mCenterCustomerList, mParamList, tAllocInstHList, tShippingInstHList, wHtLoadingList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * Long centerId = entity.getCenterId();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * Long carrierId = entity.getCarrierId();
 * String pickingTime = entity.getPickingTime();
 * String stowageTime = entity.getStowageTime();
 * String shippingTime = entity.getShippingTime();
 * Long carrierSlipYmtId = entity.getCarrierSlipYmtId();
 * Long carrierSlipSgwId = entity.getCarrierSlipSgwId();
 * Long carrierSlipYupkId = entity.getCarrierSlipYupkId();
 * String trackingNumberingKey = entity.getTrackingNumberingKey();
 * String trackingNumberingAfterKey = entity.getTrackingNumberingAfterKey();
 * String trackingNumberingUnit = entity.getTrackingNumberingUnit();
 * String tagType = entity.getTagType();
 * String tagTypeAfter = entity.getTagTypeAfter();
 * String tagDataType = entity.getTagDataType();
 * String paymentTerm = entity.getPaymentTerm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setCenterId(centerId);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierId(carrierId);
 * entity.setPickingTime(pickingTime);
 * entity.setStowageTime(stowageTime);
 * entity.setShippingTime(shippingTime);
 * entity.setCarrierSlipYmtId(carrierSlipYmtId);
 * entity.setCarrierSlipSgwId(carrierSlipSgwId);
 * entity.setCarrierSlipYupkId(carrierSlipYupkId);
 * entity.setTrackingNumberingKey(trackingNumberingKey);
 * entity.setTrackingNumberingAfterKey(trackingNumberingAfterKey);
 * entity.setTrackingNumberingUnit(trackingNumberingUnit);
 * entity.setTagType(tagType);
 * entity.setTagTypeAfter(tagTypeAfter);
 * entity.setTagDataType(tagDataType);
 * entity.setPaymentTerm(paymentTerm);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMDeliveryCourse extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _deliveryCourseId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {NotNull, varchar(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER} */
    protected Long _carrierId;

    /** PICKING_TIME: {varchar(60)} */
    protected String _pickingTime;

    /** STOWAGE_TIME: {varchar(60)} */
    protected String _stowageTime;

    /** SHIPPING_TIME: {varchar(60)} */
    protected String _shippingTime;

    /** CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT} */
    protected Long _carrierSlipYmtId;

    /** CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW} */
    protected Long _carrierSlipSgwId;

    /** CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK} */
    protected Long _carrierSlipYupkId;

    /** TRACKING_NUMBERING_KEY: {varchar(30)} */
    protected String _trackingNumberingKey;

    /** TRACKING_NUMBERING_AFTER_KEY: {varchar(30)} */
    protected String _trackingNumberingAfterKey;

    /** TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} */
    protected String _trackingNumberingUnit;

    /** TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} */
    protected String _tagType;

    /** TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} */
    protected String _tagTypeAfter;

    /** TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} */
    protected String _tagDataType;

    /** PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} */
    protected String _paymentTerm;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_DELIVERY_COURSE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_deliveryCourseId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param deliveryCourseCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String deliveryCourseCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("deliveryCourseCd");
        setCenterId(centerId);setDeliveryCourseCd(deliveryCourseCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of trackingNumberingUnit as the classification of TrackingNumberingUnit. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TrackingNumberingUnit getTrackingNumberingUnitAsTrackingNumberingUnit() {
        return CDef.TrackingNumberingUnit.codeOf(getTrackingNumberingUnit());
    }

    /**
     * Set the value of trackingNumberingUnit as the classification of TrackingNumberingUnit. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTrackingNumberingUnitAsTrackingNumberingUnit(CDef.TrackingNumberingUnit cdef) {
        setTrackingNumberingUnit(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of tagType as the classification of CenterTagType. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTagType getTagTypeAsCenterTagType() {
        return CDef.CenterTagType.codeOf(getTagType());
    }

    /**
     * Set the value of tagType as the classification of CenterTagType. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTagTypeAsCenterTagType(CDef.CenterTagType cdef) {
        setTagType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of tagTypeAfter as the classification of CenterTagTypeAfter. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTagTypeAfter getTagTypeAfterAsCenterTagTypeAfter() {
        return CDef.CenterTagTypeAfter.codeOf(getTagTypeAfter());
    }

    /**
     * Set the value of tagTypeAfter as the classification of CenterTagTypeAfter. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter cdef) {
        setTagTypeAfter(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of tagDataType as the classification of CenterTagDataType. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTagDataType getTagDataTypeAsCenterTagDataType() {
        return CDef.CenterTagDataType.codeOf(getTagDataType());
    }

    /**
     * Set the value of tagDataType as the classification of CenterTagDataType. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType cdef) {
        setTagDataType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of paymentTerm as the classification of PaymentTerm. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PaymentTerm getPaymentTermAsPaymentTerm() {
        return CDef.PaymentTerm.codeOf(getPaymentTerm());
    }

    /**
     * Set the value of paymentTerm as the classification of PaymentTerm. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentTermAsPaymentTerm(CDef.PaymentTerm cdef) {
        setPaymentTerm(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of trackingNumberingUnit as $1 (1). <br>
     * $1: 出庫作業No単位
     */
    public void setTrackingNumberingUnit_$1() {
        setTrackingNumberingUnitAsTrackingNumberingUnit(CDef.TrackingNumberingUnit.$1);
    }

    /**
     * Set the value of trackingNumberingUnit as $2 (2). <br>
     * $2: 梱包単位
     */
    public void setTrackingNumberingUnit_$2() {
        setTrackingNumberingUnitAsTrackingNumberingUnit(CDef.TrackingNumberingUnit.$2);
    }

    /**
     * Set the value of tagType as $1 (1). <br>
     * $1: 汎用荷札
     */
    public void setTagType_$1() {
        setTagTypeAsCenterTagType(CDef.CenterTagType.$1);
    }

    /**
     * Set the value of tagType as $2 (2). <br>
     * $2: ヤマト宅急便(発払)荷札
     */
    public void setTagType_$2() {
        setTagTypeAsCenterTagType(CDef.CenterTagType.$2);
    }

    /**
     * Set the value of tagType as $3 (3). <br>
     * $3: ヤマト宅急便(コレクト)荷札
     */
    public void setTagType_$3() {
        setTagTypeAsCenterTagType(CDef.CenterTagType.$3);
    }

    /**
     * Set the value of tagType as $4 (4). <br>
     * $4: 佐川荷札(WebAPI)
     */
    public void setTagType_$4() {
        setTagTypeAsCenterTagType(CDef.CenterTagType.$4);
    }

    /**
     * Set the value of tagType as $5 (5). <br>
     * $5: ゆうパック荷札
     */
    public void setTagType_$5() {
        setTagTypeAsCenterTagType(CDef.CenterTagType.$5);
    }

    /**
     * Set the value of tagType as $6 (6). <br>
     * $6: ゆうパケット荷札
     */
    public void setTagType_$6() {
        setTagTypeAsCenterTagType(CDef.CenterTagType.$6);
    }

    /**
     * Set the value of tagTypeAfter as $1 (1). <br>
     * $1: 汎用荷札
     */
    public void setTagTypeAfter_$1() {
        setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$1);
    }

    /**
     * Set the value of tagTypeAfter as $2 (2). <br>
     * $2: ヤマト宅急便(発払)荷札
     */
    public void setTagTypeAfter_$2() {
        setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$2);
    }

    /**
     * Set the value of tagTypeAfter as $3 (3). <br>
     * $3: ヤマト宅急便(コレクト)荷札
     */
    public void setTagTypeAfter_$3() {
        setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$3);
    }

    /**
     * Set the value of tagTypeAfter as $4 (4). <br>
     * $4: 佐川荷札(WebAPI)
     */
    public void setTagTypeAfter_$4() {
        setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$4);
    }

    /**
     * Set the value of tagTypeAfter as $5 (5). <br>
     * $5: ゆうパック荷札
     */
    public void setTagTypeAfter_$5() {
        setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$5);
    }

    /**
     * Set the value of tagTypeAfter as $6 (6). <br>
     * $6: ゆうパケット荷札
     */
    public void setTagTypeAfter_$6() {
        setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$6);
    }

    /**
     * Set the value of tagDataType as $1 (1). <br>
     * $1: B2
     */
    public void setTagDataType_$1() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$1);
    }

    /**
     * Set the value of tagDataType as $2 (2). <br>
     * $2: E飛伝2
     */
    public void setTagDataType_$2() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$2);
    }

    /**
     * Set the value of tagDataType as $3 (3). <br>
     * $3: E飛伝Pro
     */
    public void setTagDataType_$3() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$3);
    }

    /**
     * Set the value of tagDataType as $4 (4). <br>
     * $4: ゆうパックプリントR(発送予定)
     */
    public void setTagDataType_$4() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$4);
    }

    /**
     * Set the value of tagDataType as $5 (5). <br>
     * $5: ゆうパックプリントR(発送履歴)
     */
    public void setTagDataType_$5() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$5);
    }

    /**
     * Set the value of tagDataType as $6 (6). <br>
     * $6: 発送確定データフォーマット
     */
    public void setTagDataType_$6() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$6);
    }

    /**
     * Set the value of tagDataType as $7 (7). <br>
     * $7: 大口FDデータフォーマット
     */
    public void setTagDataType_$7() {
        setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.$7);
    }

    /**
     * Set the value of paymentTerm as $3PL (3PL). <br>
     * $3PL: 3rd Party
     */
    public void setPaymentTerm_$3PL() {
        setPaymentTermAsPaymentTerm(CDef.PaymentTerm.$3PL);
    }

    /**
     * Set the value of paymentTerm as $CO1 (CO1). <br>
     * $CO1: COD Bill FRT
     */
    public void setPaymentTerm_$CO1() {
        setPaymentTermAsPaymentTerm(CDef.PaymentTerm.$CO1);
    }

    /**
     * Set the value of paymentTerm as $CO2 (CO2). <br>
     * $CO2: COD NOT Bill FRT
     */
    public void setPaymentTerm_$CO2() {
        setPaymentTermAsPaymentTerm(CDef.PaymentTerm.$CO2);
    }

    /**
     * Set the value of paymentTerm as $COL (COL). <br>
     * $COL: Collect
     */
    public void setPaymentTerm_$COL() {
        setPaymentTermAsPaymentTerm(CDef.PaymentTerm.$COL);
    }

    /**
     * Set the value of paymentTerm as $PPB (PPB). <br>
     * $PPB: PrePaid &amp; Bill
     */
    public void setPaymentTerm_$PPB() {
        setPaymentTermAsPaymentTerm(CDef.PaymentTerm.$PPB);
    }

    /**
     * Set the value of paymentTerm as $PPD (PPD). <br>
     * $PPD: PrePaid
     */
    public void setPaymentTerm_$PPD() {
        setPaymentTermAsPaymentTerm(CDef.PaymentTerm.$PPD);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of trackingNumberingUnit $1? <br>
     * $1: 出庫作業No単位
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTrackingNumberingUnit$1() {
        CDef.TrackingNumberingUnit cdef = getTrackingNumberingUnitAsTrackingNumberingUnit();
        return cdef != null ? cdef.equals(CDef.TrackingNumberingUnit.$1) : false;
    }

    /**
     * Is the value of trackingNumberingUnit $2? <br>
     * $2: 梱包単位
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTrackingNumberingUnit$2() {
        CDef.TrackingNumberingUnit cdef = getTrackingNumberingUnitAsTrackingNumberingUnit();
        return cdef != null ? cdef.equals(CDef.TrackingNumberingUnit.$2) : false;
    }

    /**
     * Is the value of tagType $1? <br>
     * $1: 汎用荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagType$1() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.equals(CDef.CenterTagType.$1) : false;
    }

    /**
     * Is the value of tagType $2? <br>
     * $2: ヤマト宅急便(発払)荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagType$2() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.equals(CDef.CenterTagType.$2) : false;
    }

    /**
     * Is the value of tagType $3? <br>
     * $3: ヤマト宅急便(コレクト)荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagType$3() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.equals(CDef.CenterTagType.$3) : false;
    }

    /**
     * Is the value of tagType $4? <br>
     * $4: 佐川荷札(WebAPI)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagType$4() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.equals(CDef.CenterTagType.$4) : false;
    }

    /**
     * Is the value of tagType $5? <br>
     * $5: ゆうパック荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagType$5() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.equals(CDef.CenterTagType.$5) : false;
    }

    /**
     * Is the value of tagType $6? <br>
     * $6: ゆうパケット荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagType$6() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.equals(CDef.CenterTagType.$6) : false;
    }

    /**
     * Is the value of tagTypeAfter $1? <br>
     * $1: 汎用荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagTypeAfter$1() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.equals(CDef.CenterTagTypeAfter.$1) : false;
    }

    /**
     * Is the value of tagTypeAfter $2? <br>
     * $2: ヤマト宅急便(発払)荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagTypeAfter$2() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.equals(CDef.CenterTagTypeAfter.$2) : false;
    }

    /**
     * Is the value of tagTypeAfter $3? <br>
     * $3: ヤマト宅急便(コレクト)荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagTypeAfter$3() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.equals(CDef.CenterTagTypeAfter.$3) : false;
    }

    /**
     * Is the value of tagTypeAfter $4? <br>
     * $4: 佐川荷札(WebAPI)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagTypeAfter$4() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.equals(CDef.CenterTagTypeAfter.$4) : false;
    }

    /**
     * Is the value of tagTypeAfter $5? <br>
     * $5: ゆうパック荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagTypeAfter$5() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.equals(CDef.CenterTagTypeAfter.$5) : false;
    }

    /**
     * Is the value of tagTypeAfter $6? <br>
     * $6: ゆうパケット荷札
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagTypeAfter$6() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.equals(CDef.CenterTagTypeAfter.$6) : false;
    }

    /**
     * Is the value of tagDataType $1? <br>
     * $1: B2
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$1() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$1) : false;
    }

    /**
     * Is the value of tagDataType $2? <br>
     * $2: E飛伝2
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$2() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$2) : false;
    }

    /**
     * Is the value of tagDataType $3? <br>
     * $3: E飛伝Pro
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$3() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$3) : false;
    }

    /**
     * Is the value of tagDataType $4? <br>
     * $4: ゆうパックプリントR(発送予定)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$4() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$4) : false;
    }

    /**
     * Is the value of tagDataType $5? <br>
     * $5: ゆうパックプリントR(発送履歴)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$5() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$5) : false;
    }

    /**
     * Is the value of tagDataType $6? <br>
     * $6: 発送確定データフォーマット
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$6() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$6) : false;
    }

    /**
     * Is the value of tagDataType $7? <br>
     * $7: 大口FDデータフォーマット
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDataType$7() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.equals(CDef.CenterTagDataType.$7) : false;
    }

    /**
     * Is the value of paymentTerm $3PL? <br>
     * $3PL: 3rd Party
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentTerm$3PL() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.equals(CDef.PaymentTerm.$3PL) : false;
    }

    /**
     * Is the value of paymentTerm $CO1? <br>
     * $CO1: COD Bill FRT
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentTerm$CO1() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.equals(CDef.PaymentTerm.$CO1) : false;
    }

    /**
     * Is the value of paymentTerm $CO2? <br>
     * $CO2: COD NOT Bill FRT
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentTerm$CO2() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.equals(CDef.PaymentTerm.$CO2) : false;
    }

    /**
     * Is the value of paymentTerm $COL? <br>
     * $COL: Collect
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentTerm$COL() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.equals(CDef.PaymentTerm.$COL) : false;
    }

    /**
     * Is the value of paymentTerm $PPB? <br>
     * $PPB: PrePaid &amp; Bill
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentTerm$PPB() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.equals(CDef.PaymentTerm.$PPB) : false;
    }

    /**
     * Is the value of paymentTerm $PPD? <br>
     * $PPD: PrePaid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentTerm$PPD() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.equals(CDef.PaymentTerm.$PPD) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'trackingNumberingUnit' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTrackingNumberingUnitName() {
        CDef.TrackingNumberingUnit cdef = getTrackingNumberingUnitAsTrackingNumberingUnit();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'tagType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTagTypeName() {
        CDef.CenterTagType cdef = getTagTypeAsCenterTagType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'tagTypeAfter' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTagTypeAfterName() {
        CDef.CenterTagTypeAfter cdef = getTagTypeAfterAsCenterTagTypeAfter();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'tagDataType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTagDataTypeName() {
        CDef.CenterTagDataType cdef = getTagDataTypeAsCenterTagDataType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'paymentTerm' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentTermName() {
        CDef.PaymentTerm cdef = getPaymentTermAsPaymentTerm();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_CARRIER by my CARRIER_ID, named 'MCarrier'. */
    protected MCarrier _mCarrier;

    /**
     * [get] M_CARRIER by my CARRIER_ID, named 'MCarrier'. <br>
     * @return The entity of foreign property 'MCarrier'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrier getMCarrier() {
        return _mCarrier;
    }

    /**
     * [set] M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @param mCarrier The entity of foreign property 'MCarrier'. (NullAllowed)
     */
    public void setMCarrier(MCarrier mCarrier) {
        _mCarrier = mCarrier;
    }

    /** M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'. */
    protected MCarrierSlipSgw _mCarrierSlipSgw;

    /**
     * [get] M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'. <br>
     * @return The entity of foreign property 'MCarrierSlipSgw'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrierSlipSgw getMCarrierSlipSgw() {
        return _mCarrierSlipSgw;
    }

    /**
     * [set] M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * @param mCarrierSlipSgw The entity of foreign property 'MCarrierSlipSgw'. (NullAllowed)
     */
    public void setMCarrierSlipSgw(MCarrierSlipSgw mCarrierSlipSgw) {
        _mCarrierSlipSgw = mCarrierSlipSgw;
    }

    /** M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'. */
    protected MCarrierSlipYmt _mCarrierSlipYmt;

    /**
     * [get] M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'. <br>
     * @return The entity of foreign property 'MCarrierSlipYmt'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrierSlipYmt getMCarrierSlipYmt() {
        return _mCarrierSlipYmt;
    }

    /**
     * [set] M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * @param mCarrierSlipYmt The entity of foreign property 'MCarrierSlipYmt'. (NullAllowed)
     */
    public void setMCarrierSlipYmt(MCarrierSlipYmt mCarrierSlipYmt) {
        _mCarrierSlipYmt = mCarrierSlipYmt;
    }

    /** M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'. */
    protected MCarrierSlipYupk _mCarrierSlipYupk;

    /**
     * [get] M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'. <br>
     * @return The entity of foreign property 'MCarrierSlipYupk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrierSlipYupk getMCarrierSlipYupk() {
        return _mCarrierSlipYupk;
    }

    /**
     * [set] M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * @param mCarrierSlipYupk The entity of foreign property 'MCarrierSlipYupk'. (NullAllowed)
     */
    public void setMCarrierSlipYupk(MCarrierSlipYupk mCarrierSlipYupk) {
        _mCarrierSlipYupk = mCarrierSlipYupk;
    }

    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'. */
    protected MCenterClassDtl _mCenterClassDtlByTagDataType;

    /**
     * [get] M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByTagDataType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByTagDataType() {
        return _mCenterClassDtlByTagDataType;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
     * @param mCenterClassDtlByTagDataType The entity of foreign property 'MCenterClassDtlByTagDataType'. (NullAllowed)
     */
    public void setMCenterClassDtlByTagDataType(MCenterClassDtl mCenterClassDtlByTagDataType) {
        _mCenterClassDtlByTagDataType = mCenterClassDtlByTagDataType;
    }

    /** M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'. */
    protected MCenterClassDtl _mCenterClassDtlByTagType;

    /**
     * [get] M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByTagType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByTagType() {
        return _mCenterClassDtlByTagType;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
     * @param mCenterClassDtlByTagType The entity of foreign property 'MCenterClassDtlByTagType'. (NullAllowed)
     */
    public void setMCenterClassDtlByTagType(MCenterClassDtl mCenterClassDtlByTagType) {
        _mCenterClassDtlByTagType = mCenterClassDtlByTagType;
    }

    /** M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'. */
    protected MCenterClassDtl _mCenterClassDtlByTagTypeAfter;

    /**
     * [get] M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByTagTypeAfter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByTagTypeAfter() {
        return _mCenterClassDtlByTagTypeAfter;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
     * @param mCenterClassDtlByTagTypeAfter The entity of foreign property 'MCenterClassDtlByTagTypeAfter'. (NullAllowed)
     */
    public void setMCenterClassDtlByTagTypeAfter(MCenterClassDtl mCenterClassDtlByTagTypeAfter) {
        _mCenterClassDtlByTagTypeAfter = mCenterClassDtlByTagTypeAfter;
    }

    /** B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'. */
    protected BClassDtl _bClassDtlByTrackingNumberingUnit;

    /**
     * [get] B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'. <br>
     * @return The entity of foreign property 'BClassDtlByTrackingNumberingUnit'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTrackingNumberingUnit() {
        return _bClassDtlByTrackingNumberingUnit;
    }

    /**
     * [set] B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'.
     * @param bClassDtlByTrackingNumberingUnit The entity of foreign property 'BClassDtlByTrackingNumberingUnit'. (NullAllowed)
     */
    public void setBClassDtlByTrackingNumberingUnit(BClassDtl bClassDtlByTrackingNumberingUnit) {
        _bClassDtlByTrackingNumberingUnit = bClassDtlByTrackingNumberingUnit;
    }

    /** B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'. */
    protected BClassDtl _bClassDtlByPaymentTerm;

    /**
     * [get] B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'. <br>
     * @return The entity of foreign property 'BClassDtlByPaymentTerm'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPaymentTerm() {
        return _bClassDtlByPaymentTerm;
    }

    /**
     * [set] B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'.
     * @param bClassDtlByPaymentTerm The entity of foreign property 'BClassDtlByPaymentTerm'. (NullAllowed)
     */
    public void setBClassDtlByPaymentTerm(BClassDtl bClassDtlByPaymentTerm) {
        _bClassDtlByPaymentTerm = bClassDtlByPaymentTerm;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'. */
    protected List<MCenterCustomer> _mCenterCustomerList;

    /**
     * [get] M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
     * @return The entity list of referrer property 'MCenterCustomerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCustomer> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = newReferrerList(); }
        return _mCenterCustomerList;
    }

    /**
     * [set] M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
     * @param mCenterCustomerList The entity list of referrer property 'MCenterCustomerList'. (NullAllowed)
     */
    public void setMCenterCustomerList(List<MCenterCustomer> mCenterCustomerList) {
        _mCenterCustomerList = mCenterCustomerList;
    }

    /** M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'. */
    protected List<MParam> _mParamList;

    /**
     * [get] M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
     * @return The entity list of referrer property 'MParamList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MParam> getMParamList() {
        if (_mParamList == null) { _mParamList = newReferrerList(); }
        return _mParamList;
    }

    /**
     * [set] M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
     * @param mParamList The entity list of referrer property 'MParamList'. (NullAllowed)
     */
    public void setMParamList(List<MParam> mParamList) {
        _mParamList = mParamList;
    }

    /** T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'. */
    protected List<TAllocInstH> _tAllocInstHList;

    /**
     * [get] T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
     * @return The entity list of referrer property 'TAllocInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = newReferrerList(); }
        return _tAllocInstHList;
    }

    /**
     * [set] T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
     * @param tAllocInstHList The entity list of referrer property 'TAllocInstHList'. (NullAllowed)
     */
    public void setTAllocInstHList(List<TAllocInstH> tAllocInstHList) {
        _tAllocInstHList = tAllocInstHList;
    }

    /** T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    /** W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'. */
    protected List<WHtLoading> _wHtLoadingList;

    /**
     * [get] W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
     * @return The entity list of referrer property 'WHtLoadingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtLoading> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = newReferrerList(); }
        return _wHtLoadingList;
    }

    /**
     * [set] W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
     * @param wHtLoadingList The entity list of referrer property 'WHtLoadingList'. (NullAllowed)
     */
    public void setWHtLoadingList(List<WHtLoading> wHtLoadingList) {
        _wHtLoadingList = wHtLoadingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMDeliveryCourse) {
            BsMDeliveryCourse other = (BsMDeliveryCourse)obj;
            if (!xSV(_deliveryCourseId, other._deliveryCourseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deliveryCourseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCarrier != null)
        { sb.append(li).append(xbRDS(_mCarrier, "mCarrier")); }
        if (_mCarrierSlipSgw != null)
        { sb.append(li).append(xbRDS(_mCarrierSlipSgw, "mCarrierSlipSgw")); }
        if (_mCarrierSlipYmt != null)
        { sb.append(li).append(xbRDS(_mCarrierSlipYmt, "mCarrierSlipYmt")); }
        if (_mCarrierSlipYupk != null)
        { sb.append(li).append(xbRDS(_mCarrierSlipYupk, "mCarrierSlipYupk")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mCenterClassDtlByTagDataType != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByTagDataType, "mCenterClassDtlByTagDataType")); }
        if (_mCenterClassDtlByTagType != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByTagType, "mCenterClassDtlByTagType")); }
        if (_mCenterClassDtlByTagTypeAfter != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByTagTypeAfter, "mCenterClassDtlByTagTypeAfter")); }
        if (_bClassDtlByTrackingNumberingUnit != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTrackingNumberingUnit, "bClassDtlByTrackingNumberingUnit")); }
        if (_bClassDtlByPaymentTerm != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPaymentTerm, "bClassDtlByPaymentTerm")); }
        if (_mCenterCustomerList != null) { for (MCenterCustomer et : _mCenterCustomerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterCustomerList")); } } }
        if (_mParamList != null) { for (MParam et : _mParamList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mParamList")); } } }
        if (_tAllocInstHList != null) { for (TAllocInstH et : _tAllocInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHList")); } } }
        if (_tShippingInstHList != null) { for (TShippingInstH et : _tShippingInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHList")); } } }
        if (_wHtLoadingList != null) { for (WHtLoading et : _wHtLoadingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtLoadingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierId));
        sb.append(dm).append(xfND(_pickingTime));
        sb.append(dm).append(xfND(_stowageTime));
        sb.append(dm).append(xfND(_shippingTime));
        sb.append(dm).append(xfND(_carrierSlipYmtId));
        sb.append(dm).append(xfND(_carrierSlipSgwId));
        sb.append(dm).append(xfND(_carrierSlipYupkId));
        sb.append(dm).append(xfND(_trackingNumberingKey));
        sb.append(dm).append(xfND(_trackingNumberingAfterKey));
        sb.append(dm).append(xfND(_trackingNumberingUnit));
        sb.append(dm).append(xfND(_tagType));
        sb.append(dm).append(xfND(_tagTypeAfter));
        sb.append(dm).append(xfND(_tagDataType));
        sb.append(dm).append(xfND(_paymentTerm));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mCarrier != null)
        { sb.append(dm).append("mCarrier"); }
        if (_mCarrierSlipSgw != null)
        { sb.append(dm).append("mCarrierSlipSgw"); }
        if (_mCarrierSlipYmt != null)
        { sb.append(dm).append("mCarrierSlipYmt"); }
        if (_mCarrierSlipYupk != null)
        { sb.append(dm).append("mCarrierSlipYupk"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mCenterClassDtlByTagDataType != null)
        { sb.append(dm).append("mCenterClassDtlByTagDataType"); }
        if (_mCenterClassDtlByTagType != null)
        { sb.append(dm).append("mCenterClassDtlByTagType"); }
        if (_mCenterClassDtlByTagTypeAfter != null)
        { sb.append(dm).append("mCenterClassDtlByTagTypeAfter"); }
        if (_bClassDtlByTrackingNumberingUnit != null)
        { sb.append(dm).append("bClassDtlByTrackingNumberingUnit"); }
        if (_bClassDtlByPaymentTerm != null)
        { sb.append(dm).append("bClassDtlByPaymentTerm"); }
        if (_mCenterCustomerList != null && !_mCenterCustomerList.isEmpty())
        { sb.append(dm).append("mCenterCustomerList"); }
        if (_mParamList != null && !_mParamList.isEmpty())
        { sb.append(dm).append("mParamList"); }
        if (_tAllocInstHList != null && !_tAllocInstHList.isEmpty())
        { sb.append(dm).append("tAllocInstHList"); }
        if (_tShippingInstHList != null && !_tShippingInstHList.isEmpty())
        { sb.append(dm).append("tShippingInstHList"); }
        if (_wHtLoadingList != null && !_wHtLoadingList.isEmpty())
        { sb.append(dm).append("wHtLoadingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MDeliveryCourse clone() {
        return (MDeliveryCourse)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {NotNull, varchar(60)} <br>
     * 配送コース名称
     * @return The value of the column 'DELIVERY_COURSE_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {NotNull, varchar(60)} <br>
     * 配送コース名称
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (basically NotNull if update: for the constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierId() {
        checkSpecifiedProperty("carrierId");
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierId(Long carrierId) {
        registerModifiedProperty("carrierId");
        _carrierId = carrierId;
    }

    /**
     * [get] PICKING_TIME: {varchar(60)} <br>
     * 出庫開始時刻
     * @return The value of the column 'PICKING_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingTime() {
        checkSpecifiedProperty("pickingTime");
        return convertEmptyToNull(_pickingTime);
    }

    /**
     * [set] PICKING_TIME: {varchar(60)} <br>
     * 出庫開始時刻
     * @param pickingTime The value of the column 'PICKING_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingTime(String pickingTime) {
        registerModifiedProperty("pickingTime");
        _pickingTime = pickingTime;
    }

    /**
     * [get] STOWAGE_TIME: {varchar(60)} <br>
     * 積込予定時刻
     * @return The value of the column 'STOWAGE_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getStowageTime() {
        checkSpecifiedProperty("stowageTime");
        return convertEmptyToNull(_stowageTime);
    }

    /**
     * [set] STOWAGE_TIME: {varchar(60)} <br>
     * 積込予定時刻
     * @param stowageTime The value of the column 'STOWAGE_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStowageTime(String stowageTime) {
        registerModifiedProperty("stowageTime");
        _stowageTime = stowageTime;
    }

    /**
     * [get] SHIPPING_TIME: {varchar(60)} <br>
     * 出荷予定時刻
     * @return The value of the column 'SHIPPING_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingTime() {
        checkSpecifiedProperty("shippingTime");
        return convertEmptyToNull(_shippingTime);
    }

    /**
     * [set] SHIPPING_TIME: {varchar(60)} <br>
     * 出荷予定時刻
     * @param shippingTime The value of the column 'SHIPPING_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTime(String shippingTime) {
        registerModifiedProperty("shippingTime");
        _shippingTime = shippingTime;
    }

    /**
     * [get] CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT} <br>
     * ヤマト送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YMT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierSlipYmtId() {
        checkSpecifiedProperty("carrierSlipYmtId");
        return _carrierSlipYmtId;
    }

    /**
     * [set] CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT} <br>
     * ヤマト送り状定義ID
     * @param carrierSlipYmtId The value of the column 'CARRIER_SLIP_YMT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierSlipYmtId(Long carrierSlipYmtId) {
        registerModifiedProperty("carrierSlipYmtId");
        _carrierSlipYmtId = carrierSlipYmtId;
    }

    /**
     * [get] CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW} <br>
     * 佐川送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_SGW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierSlipSgwId() {
        checkSpecifiedProperty("carrierSlipSgwId");
        return _carrierSlipSgwId;
    }

    /**
     * [set] CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW} <br>
     * 佐川送り状定義ID
     * @param carrierSlipSgwId The value of the column 'CARRIER_SLIP_SGW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierSlipSgwId(Long carrierSlipSgwId) {
        registerModifiedProperty("carrierSlipSgwId");
        _carrierSlipSgwId = carrierSlipSgwId;
    }

    /**
     * [get] CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK} <br>
     * ゆうパック送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YUPK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierSlipYupkId() {
        checkSpecifiedProperty("carrierSlipYupkId");
        return _carrierSlipYupkId;
    }

    /**
     * [set] CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK} <br>
     * ゆうパック送り状定義ID
     * @param carrierSlipYupkId The value of the column 'CARRIER_SLIP_YUPK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierSlipYupkId(Long carrierSlipYupkId) {
        registerModifiedProperty("carrierSlipYupkId");
        _carrierSlipYupkId = carrierSlipYupkId;
    }

    /**
     * [get] TRACKING_NUMBERING_KEY: {varchar(30)} <br>
     * 追跡番号採番キー
     * @return The value of the column 'TRACKING_NUMBERING_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingNumberingKey() {
        checkSpecifiedProperty("trackingNumberingKey");
        return convertEmptyToNull(_trackingNumberingKey);
    }

    /**
     * [set] TRACKING_NUMBERING_KEY: {varchar(30)} <br>
     * 追跡番号採番キー
     * @param trackingNumberingKey The value of the column 'TRACKING_NUMBERING_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingNumberingKey(String trackingNumberingKey) {
        registerModifiedProperty("trackingNumberingKey");
        _trackingNumberingKey = trackingNumberingKey;
    }

    /**
     * [get] TRACKING_NUMBERING_AFTER_KEY: {varchar(30)} <br>
     * 追跡番号採番キー(代引時、2枚目以降)
     * @return The value of the column 'TRACKING_NUMBERING_AFTER_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingNumberingAfterKey() {
        checkSpecifiedProperty("trackingNumberingAfterKey");
        return convertEmptyToNull(_trackingNumberingAfterKey);
    }

    /**
     * [set] TRACKING_NUMBERING_AFTER_KEY: {varchar(30)} <br>
     * 追跡番号採番キー(代引時、2枚目以降)
     * @param trackingNumberingAfterKey The value of the column 'TRACKING_NUMBERING_AFTER_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingNumberingAfterKey(String trackingNumberingAfterKey) {
        registerModifiedProperty("trackingNumberingAfterKey");
        _trackingNumberingAfterKey = trackingNumberingAfterKey;
    }

    /**
     * [get] TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @return The value of the column 'TRACKING_NUMBERING_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrackingNumberingUnit() {
        checkSpecifiedProperty("trackingNumberingUnit");
        return convertEmptyToNull(_trackingNumberingUnit);
    }

    /**
     * [set] TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param trackingNumberingUnit The value of the column 'TRACKING_NUMBERING_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrackingNumberingUnit(String trackingNumberingUnit) {
        registerModifiedProperty("trackingNumberingUnit");
        _trackingNumberingUnit = trackingNumberingUnit;
    }

    /**
     * [get] TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @return The value of the column 'TAG_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagType() {
        checkSpecifiedProperty("tagType");
        return convertEmptyToNull(_tagType);
    }

    /**
     * [set] TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param tagType The value of the column 'TAG_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagType(String tagType) {
        registerModifiedProperty("tagType");
        _tagType = tagType;
    }

    /**
     * [get] TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @return The value of the column 'TAG_TYPE_AFTER'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagTypeAfter() {
        checkSpecifiedProperty("tagTypeAfter");
        return convertEmptyToNull(_tagTypeAfter);
    }

    /**
     * [set] TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param tagTypeAfter The value of the column 'TAG_TYPE_AFTER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagTypeAfter(String tagTypeAfter) {
        registerModifiedProperty("tagTypeAfter");
        _tagTypeAfter = tagTypeAfter;
    }

    /**
     * [get] TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @return The value of the column 'TAG_DATA_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagDataType() {
        checkSpecifiedProperty("tagDataType");
        return convertEmptyToNull(_tagDataType);
    }

    /**
     * [set] TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param tagDataType The value of the column 'TAG_DATA_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagDataType(String tagDataType) {
        registerModifiedProperty("tagDataType");
        _tagDataType = tagDataType;
    }

    /**
     * [get] PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @return The value of the column 'PAYMENT_TERM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentTerm() {
        checkSpecifiedProperty("paymentTerm");
        return convertEmptyToNull(_paymentTerm);
    }

    /**
     * [set] PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param paymentTerm The value of the column 'PAYMENT_TERM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentTerm(String paymentTerm) {
        registerModifiedProperty("paymentTerm");
        _paymentTerm = paymentTerm;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
