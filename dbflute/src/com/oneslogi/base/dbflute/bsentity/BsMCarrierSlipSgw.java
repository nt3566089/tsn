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
 * The entity of M_CARRIER_SLIP_SGW as TABLE. <br>
 * 佐川送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_SGW_ID
 *
 * [column]
 *     CARRIER_SLIP_SGW_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_CUSTOMER_CD, WEB_API_REQUEST_URL, CUSTOMER_ID, LOGIN_PASSWORD, DEPT_CONSIGNOR_NM, CONSIGNOR_TEL_NO, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_NM1, SLIP_CLIENT_NM2, SLIP_SHAPE_CD, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, TRANSPORT_TYPE_SPEED, TRANSPORT_TYPE_ITEM, SETTLEMENT_TYPE, SEAL_TYPE1, SEAL_TYPE2, SEAL_TYPE3, COD_CLS, SEND_CD, API_OKURI_CODE, API_BINSYU_CODE, API_DAIBIKI_FLG, API_DAIBIKI_TYPE, API_WEIGHT_CD_1, API_WEIGHT_CD_2, API_EIDOME_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_SGW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CENTER_CLASS_DTL(ByApiBinsyuCode), B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer table]
 *     M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, mCenterClassDtlByApiBinsyuCode, mCenterClassDtlByApiDaibikiFlg, mCenterClassDtlByApiDaibikiType, mCenterClassDtlByApiEidomeFlg, mCenterClassDtlByApiWeightCd1, mCenterClassDtlByApiWeightCd2, bClassDtlByCharacterCd, bClassDtlByCodCls, bClassDtlByDelFlg, mCenterClassDtlBySealType1, mCenterClassDtlBySealType2, mCenterClassDtlBySealType3, bClassDtlBySettlementType, mCenterClassDtlBySlipShapeCd, mCenterClassDtlByTransportTypeItem, mCenterClassDtlByTransportTypeSpeed
 *
 * [referrer property]
 *     mDeliveryCourseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long carrierSlipSgwId = entity.getCarrierSlipSgwId();
 * Long centerId = entity.getCenterId();
 * String tagType = entity.getTagType();
 * String tagNm = entity.getTagNm();
 * String characterCd = entity.getCharacterCd();
 * String slipCustomerCd = entity.getSlipCustomerCd();
 * String webApiRequestUrl = entity.getWebApiRequestUrl();
 * String customerId = entity.getCustomerId();
 * String loginPassword = entity.getLoginPassword();
 * String deptConsignorNm = entity.getDeptConsignorNm();
 * String consignorTelNo = entity.getConsignorTelNo();
 * String slipClientTelNo = entity.getSlipClientTelNo();
 * String slipClientZipCd = entity.getSlipClientZipCd();
 * String slipClientAddress1 = entity.getSlipClientAddress1();
 * String slipClientAddress2 = entity.getSlipClientAddress2();
 * String slipClientNm1 = entity.getSlipClientNm1();
 * String slipClientNm2 = entity.getSlipClientNm2();
 * String slipShapeCd = entity.getSlipShapeCd();
 * String slipItemNm1 = entity.getSlipItemNm1();
 * String slipItemNm2 = entity.getSlipItemNm2();
 * String slipItemNm3 = entity.getSlipItemNm3();
 * String slipItemNm4 = entity.getSlipItemNm4();
 * String slipItemNm5 = entity.getSlipItemNm5();
 * String transportTypeSpeed = entity.getTransportTypeSpeed();
 * String transportTypeItem = entity.getTransportTypeItem();
 * String settlementType = entity.getSettlementType();
 * String sealType1 = entity.getSealType1();
 * String sealType2 = entity.getSealType2();
 * String sealType3 = entity.getSealType3();
 * String codCls = entity.getCodCls();
 * String sendCd = entity.getSendCd();
 * String apiOkuriCode = entity.getApiOkuriCode();
 * String apiBinsyuCode = entity.getApiBinsyuCode();
 * String apiDaibikiFlg = entity.getApiDaibikiFlg();
 * String apiDaibikiType = entity.getApiDaibikiType();
 * String apiWeightCd1 = entity.getApiWeightCd1();
 * String apiWeightCd2 = entity.getApiWeightCd2();
 * String apiEidomeFlg = entity.getApiEidomeFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCarrierSlipSgwId(carrierSlipSgwId);
 * entity.setCenterId(centerId);
 * entity.setTagType(tagType);
 * entity.setTagNm(tagNm);
 * entity.setCharacterCd(characterCd);
 * entity.setSlipCustomerCd(slipCustomerCd);
 * entity.setWebApiRequestUrl(webApiRequestUrl);
 * entity.setCustomerId(customerId);
 * entity.setLoginPassword(loginPassword);
 * entity.setDeptConsignorNm(deptConsignorNm);
 * entity.setConsignorTelNo(consignorTelNo);
 * entity.setSlipClientTelNo(slipClientTelNo);
 * entity.setSlipClientZipCd(slipClientZipCd);
 * entity.setSlipClientAddress1(slipClientAddress1);
 * entity.setSlipClientAddress2(slipClientAddress2);
 * entity.setSlipClientNm1(slipClientNm1);
 * entity.setSlipClientNm2(slipClientNm2);
 * entity.setSlipShapeCd(slipShapeCd);
 * entity.setSlipItemNm1(slipItemNm1);
 * entity.setSlipItemNm2(slipItemNm2);
 * entity.setSlipItemNm3(slipItemNm3);
 * entity.setSlipItemNm4(slipItemNm4);
 * entity.setSlipItemNm5(slipItemNm5);
 * entity.setTransportTypeSpeed(transportTypeSpeed);
 * entity.setTransportTypeItem(transportTypeItem);
 * entity.setSettlementType(settlementType);
 * entity.setSealType1(sealType1);
 * entity.setSealType2(sealType2);
 * entity.setSealType3(sealType3);
 * entity.setCodCls(codCls);
 * entity.setSendCd(sendCd);
 * entity.setApiOkuriCode(apiOkuriCode);
 * entity.setApiBinsyuCode(apiBinsyuCode);
 * entity.setApiDaibikiFlg(apiDaibikiFlg);
 * entity.setApiDaibikiType(apiDaibikiType);
 * entity.setApiWeightCd1(apiWeightCd1);
 * entity.setApiWeightCd2(apiWeightCd2);
 * entity.setApiEidomeFlg(apiEidomeFlg);
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
public abstract class BsMCarrierSlipSgw extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _carrierSlipSgwId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** TAG_TYPE: {+UQ, NotNull, varchar(30)} */
    protected String _tagType;

    /** TAG_NM: {varchar(60)} */
    protected String _tagNm;

    /** CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} */
    protected String _characterCd;

    /** SLIP_CUSTOMER_CD: {varchar(30)} */
    protected String _slipCustomerCd;

    /** WEB_API_REQUEST_URL: {varchar(100)} */
    protected String _webApiRequestUrl;

    /** CUSTOMER_ID: {varchar(30)} */
    protected String _customerId;

    /** LOGIN_PASSWORD: {varchar(30)} */
    protected String _loginPassword;

    /** DEPT_CONSIGNOR_NM: {varchar(255)} */
    protected String _deptConsignorNm;

    /** CONSIGNOR_TEL_NO: {varchar(30)} */
    protected String _consignorTelNo;

    /** SLIP_CLIENT_TEL_NO: {varchar(30)} */
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_ZIP_CD: {varchar(30)} */
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS1: {varchar(255)} */
    protected String _slipClientAddress1;

    /** SLIP_CLIENT_ADDRESS2: {varchar(255)} */
    protected String _slipClientAddress2;

    /** SLIP_CLIENT_NM1: {varchar(255)} */
    protected String _slipClientNm1;

    /** SLIP_CLIENT_NM2: {varchar(255)} */
    protected String _slipClientNm2;

    /** SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} */
    protected String _slipShapeCd;

    /** SLIP_ITEM_NM1: {varchar(255)} */
    protected String _slipItemNm1;

    /** SLIP_ITEM_NM2: {varchar(255)} */
    protected String _slipItemNm2;

    /** SLIP_ITEM_NM3: {varchar(255)} */
    protected String _slipItemNm3;

    /** SLIP_ITEM_NM4: {varchar(255)} */
    protected String _slipItemNm4;

    /** SLIP_ITEM_NM5: {varchar(255)} */
    protected String _slipItemNm5;

    /** TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} */
    protected String _transportTypeSpeed;

    /** TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} */
    protected String _transportTypeItem;

    /** SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} */
    protected String _settlementType;

    /** SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} */
    protected String _sealType1;

    /** SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} */
    protected String _sealType2;

    /** SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} */
    protected String _sealType3;

    /** COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} */
    protected String _codCls;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** API_OKURI_CODE: {varchar(30)} */
    protected String _apiOkuriCode;

    /** API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} */
    protected String _apiBinsyuCode;

    /** API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} */
    protected String _apiDaibikiFlg;

    /** API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} */
    protected String _apiDaibikiType;

    /** API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} */
    protected String _apiWeightCd1;

    /** API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} */
    protected String _apiWeightCd2;

    /** API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} */
    protected String _apiEidomeFlg;

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
        return "M_CARRIER_SLIP_SGW";
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
        if (_carrierSlipSgwId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param tagType : +UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String tagType) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("tagType");
        setCenterId(centerId);setTagType(tagType);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of characterCd as the classification of CharacterCd. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CharacterCd getCharacterCdAsCharacterCd() {
        return CDef.CharacterCd.codeOf(getCharacterCd());
    }

    /**
     * Set the value of characterCd as the classification of CharacterCd. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCharacterCdAsCharacterCd(CDef.CharacterCd cdef) {
        setCharacterCd(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of slipShapeCd as the classification of CenterSlipShapeCd. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterSlipShapeCd getSlipShapeCdAsCenterSlipShapeCd() {
        return CDef.CenterSlipShapeCd.codeOf(getSlipShapeCd());
    }

    /**
     * Set the value of slipShapeCd as the classification of CenterSlipShapeCd. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd cdef) {
        setSlipShapeCd(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of transportTypeSpeed as the classification of CenterTransportTypeSpeed. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTransportTypeSpeed getTransportTypeSpeedAsCenterTransportTypeSpeed() {
        return CDef.CenterTransportTypeSpeed.codeOf(getTransportTypeSpeed());
    }

    /**
     * Set the value of transportTypeSpeed as the classification of CenterTransportTypeSpeed. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed cdef) {
        setTransportTypeSpeed(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of transportTypeItem as the classification of CenterTransportTypeItem. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTransportTypeItem getTransportTypeItemAsCenterTransportTypeItem() {
        return CDef.CenterTransportTypeItem.codeOf(getTransportTypeItem());
    }

    /**
     * Set the value of transportTypeItem as the classification of CenterTransportTypeItem. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTransportTypeItemAsCenterTransportTypeItem(CDef.CenterTransportTypeItem cdef) {
        setTransportTypeItem(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of settlementType as the classification of SettlementType. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SettlementType getSettlementTypeAsSettlementType() {
        return CDef.SettlementType.codeOf(getSettlementType());
    }

    /**
     * Set the value of settlementType as the classification of SettlementType. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSettlementTypeAsSettlementType(CDef.SettlementType cdef) {
        setSettlementType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sealType1 as the classification of CenterSealType. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterSealType getSealType1AsCenterSealType() {
        return CDef.CenterSealType.codeOf(getSealType1());
    }

    /**
     * Set the value of sealType1 as the classification of CenterSealType. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSealType1AsCenterSealType(CDef.CenterSealType cdef) {
        setSealType1(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sealType2 as the classification of CenterSealType. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterSealType getSealType2AsCenterSealType() {
        return CDef.CenterSealType.codeOf(getSealType2());
    }

    /**
     * Set the value of sealType2 as the classification of CenterSealType. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSealType2AsCenterSealType(CDef.CenterSealType cdef) {
        setSealType2(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sealType3 as the classification of CenterSealType. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterSealType getSealType3AsCenterSealType() {
        return CDef.CenterSealType.codeOf(getSealType3());
    }

    /**
     * Set the value of sealType3 as the classification of CenterSealType. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSealType3AsCenterSealType(CDef.CenterSealType cdef) {
        setSealType3(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of codCls as the classification of CodCls. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CodCls getCodClsAsCodCls() {
        return CDef.CodCls.codeOf(getCodCls());
    }

    /**
     * Set the value of codCls as the classification of CodCls. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCodClsAsCodCls(CDef.CodCls cdef) {
        setCodCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of apiBinsyuCode as the classification of CenterApiBinsyuCode. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterApiBinsyuCode getApiBinsyuCodeAsCenterApiBinsyuCode() {
        return CDef.CenterApiBinsyuCode.codeOf(getApiBinsyuCode());
    }

    /**
     * Set the value of apiBinsyuCode as the classification of CenterApiBinsyuCode. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode cdef) {
        setApiBinsyuCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of apiDaibikiFlg as the classification of CenterApiDaibikiFlg. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterApiDaibikiFlg getApiDaibikiFlgAsCenterApiDaibikiFlg() {
        return CDef.CenterApiDaibikiFlg.codeOf(getApiDaibikiFlg());
    }

    /**
     * Set the value of apiDaibikiFlg as the classification of CenterApiDaibikiFlg. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setApiDaibikiFlgAsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg cdef) {
        setApiDaibikiFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of apiDaibikiType as the classification of CenterApiDaibikiType. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterApiDaibikiType getApiDaibikiTypeAsCenterApiDaibikiType() {
        return CDef.CenterApiDaibikiType.codeOf(getApiDaibikiType());
    }

    /**
     * Set the value of apiDaibikiType as the classification of CenterApiDaibikiType. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setApiDaibikiTypeAsCenterApiDaibikiType(CDef.CenterApiDaibikiType cdef) {
        setApiDaibikiType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of apiWeightCd1 as the classification of CenterApiWeightCd. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterApiWeightCd getApiWeightCd1AsCenterApiWeightCd() {
        return CDef.CenterApiWeightCd.codeOf(getApiWeightCd1());
    }

    /**
     * Set the value of apiWeightCd1 as the classification of CenterApiWeightCd. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd cdef) {
        setApiWeightCd1(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of apiWeightCd2 as the classification of CenterApiWeightCd. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterApiWeightCd getApiWeightCd2AsCenterApiWeightCd() {
        return CDef.CenterApiWeightCd.codeOf(getApiWeightCd2());
    }

    /**
     * Set the value of apiWeightCd2 as the classification of CenterApiWeightCd. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd cdef) {
        setApiWeightCd2(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of apiEidomeFlg as the classification of CenterApiEidomeFlg. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterApiEidomeFlg getApiEidomeFlgAsCenterApiEidomeFlg() {
        return CDef.CenterApiEidomeFlg.codeOf(getApiEidomeFlg());
    }

    /**
     * Set the value of apiEidomeFlg as the classification of CenterApiEidomeFlg. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setApiEidomeFlgAsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg cdef) {
        setApiEidomeFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of characterCd as $MS932 (MS932). <br>
     * $MS932: MS932
     */
    public void setCharacterCd_$MS932() {
        setCharacterCdAsCharacterCd(CDef.CharacterCd.$MS932);
    }

    /**
     * Set the value of characterCd as $UTF8 (UTF8). <br>
     * $UTF8: UTF8
     */
    public void setCharacterCd_$UTF8() {
        setCharacterCdAsCharacterCd(CDef.CharacterCd.$UTF8);
    }

    /**
     * Set the value of slipShapeCd as $001 (001). <br>
     * $001: 箱類
     */
    public void setSlipShapeCd_$001() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$001);
    }

    /**
     * Set the value of slipShapeCd as $002 (002). <br>
     * $002: バッグ類
     */
    public void setSlipShapeCd_$002() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$002);
    }

    /**
     * Set the value of slipShapeCd as $003 (003). <br>
     * $003: スーツケース
     */
    public void setSlipShapeCd_$003() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$003);
    }

    /**
     * Set the value of slipShapeCd as $004 (004). <br>
     * $004: 封筒類
     */
    public void setSlipShapeCd_$004() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$004);
    }

    /**
     * Set the value of slipShapeCd as $005 (005). <br>
     * $005: ゴルフバッグ
     */
    public void setSlipShapeCd_$005() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$005);
    }

    /**
     * Set the value of slipShapeCd as $006 (006). <br>
     * $006: スキー
     */
    public void setSlipShapeCd_$006() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$006);
    }

    /**
     * Set the value of slipShapeCd as $007 (007). <br>
     * $007: スノーボード
     */
    public void setSlipShapeCd_$007() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$007);
    }

    /**
     * Set the value of slipShapeCd as $008 (008). <br>
     * $008: その他
     */
    public void setSlipShapeCd_$008() {
        setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.$008);
    }

    /**
     * Set the value of transportTypeSpeed as $000 (000). <br>
     * $000: 飛脚宅配便
     */
    public void setTransportTypeSpeed_$000() {
        setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$000);
    }

    /**
     * Set the value of transportTypeSpeed as $001 (001). <br>
     * $001: 飛脚スーパー便
     */
    public void setTransportTypeSpeed_$001() {
        setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$001);
    }

    /**
     * Set the value of transportTypeSpeed as $002 (002). <br>
     * $002: 飛脚即配便
     */
    public void setTransportTypeSpeed_$002() {
        setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$002);
    }

    /**
     * Set the value of transportTypeSpeed as $003 (003). <br>
     * $003: 飛脚航空便(翌日中配達)
     */
    public void setTransportTypeSpeed_$003() {
        setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$003);
    }

    /**
     * Set the value of transportTypeSpeed as $004 (004). <br>
     * $004: 飛脚航空便(翌日午前中配達)
     */
    public void setTransportTypeSpeed_$004() {
        setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$004);
    }

    /**
     * Set the value of transportTypeSpeed as $005 (005). <br>
     * $005: 飛脚ジャストタイム便
     */
    public void setTransportTypeSpeed_$005() {
        setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.$005);
    }

    /**
     * Set the value of transportTypeItem as $001 (001). <br>
     * $001: 指定なし
     */
    public void setTransportTypeItem_$001() {
        setTransportTypeItemAsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$001);
    }

    /**
     * Set the value of transportTypeItem as $002 (002). <br>
     * $002: 飛脚クール便(冷蔵)
     */
    public void setTransportTypeItem_$002() {
        setTransportTypeItemAsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$002);
    }

    /**
     * Set the value of transportTypeItem as $003 (003). <br>
     * $003: 飛脚クール便(冷凍)
     */
    public void setTransportTypeItem_$003() {
        setTransportTypeItemAsCenterTransportTypeItem(CDef.CenterTransportTypeItem.$003);
    }

    /**
     * Set the value of settlementType as $0 (0). <br>
     * $0: 指定なし
     */
    public void setSettlementType_$0() {
        setSettlementTypeAsSettlementType(CDef.SettlementType.$0);
    }

    /**
     * Set the value of settlementType as $1 (1). <br>
     * $1: 全て可
     */
    public void setSettlementType_$1() {
        setSettlementTypeAsSettlementType(CDef.SettlementType.$1);
    }

    /**
     * Set the value of settlementType as $2 (2). <br>
     * $2: 現金のみ
     */
    public void setSettlementType_$2() {
        setSettlementTypeAsSettlementType(CDef.SettlementType.$2);
    }

    /**
     * Set the value of settlementType as $5 (5). <br>
     * $5: ﾃﾞﾋﾞｯﾄ･ｸﾚｼﾞｯﾄ
     */
    public void setSettlementType_$5() {
        setSettlementTypeAsSettlementType(CDef.SettlementType.$5);
    }

    /**
     * Set the value of sealType1 as $001 (001). <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType1_$001() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * Set the value of sealType1 as $002 (002). <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType1_$002() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * Set the value of sealType1 as $003 (003). <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType1_$003() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * Set the value of sealType1 as $004 (004). <br>
     * $004: 営止めサービス
     */
    public void setSealType1_$004() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * Set the value of sealType1 as $005 (005). <br>
     * $005: 配達指定日
     */
    public void setSealType1_$005() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * Set the value of sealType1 as $007 (007). <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType1_$007() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * Set the value of sealType1 as $008 (008). <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType1_$008() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * Set the value of sealType1 as $009 (009). <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType1_$009() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * Set the value of sealType1 as $010 (010). <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType1_$010() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * Set the value of sealType1 as $011 (011). <br>
     * $011: 取扱注意
     */
    public void setSealType1_$011() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * Set the value of sealType1 as $012 (012). <br>
     * $012: 貴重品
     */
    public void setSealType1_$012() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * Set the value of sealType1 as $013 (013). <br>
     * $013: 天地無用
     */
    public void setSealType1_$013() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * Set the value of sealType1 as $014 (014). <br>
     * $014: 飛脚即配便
     */
    public void setSealType1_$014() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * Set the value of sealType1 as $016 (016). <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType1_$016() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * Set the value of sealType1 as $017 (017). <br>
     * $017: 飛脚航空便
     */
    public void setSealType1_$017() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * Set the value of sealType1 as $018 (018). <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType1_$018() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * Set the value of sealType1 as $019 (019). <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType1_$019() {
        setSealType1AsCenterSealType(CDef.CenterSealType.$019);
    }

    /**
     * Set the value of sealType2 as $001 (001). <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType2_$001() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * Set the value of sealType2 as $002 (002). <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType2_$002() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * Set the value of sealType2 as $003 (003). <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType2_$003() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * Set the value of sealType2 as $004 (004). <br>
     * $004: 営止めサービス
     */
    public void setSealType2_$004() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * Set the value of sealType2 as $005 (005). <br>
     * $005: 配達指定日
     */
    public void setSealType2_$005() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * Set the value of sealType2 as $007 (007). <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType2_$007() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * Set the value of sealType2 as $008 (008). <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType2_$008() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * Set the value of sealType2 as $009 (009). <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType2_$009() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * Set the value of sealType2 as $010 (010). <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType2_$010() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * Set the value of sealType2 as $011 (011). <br>
     * $011: 取扱注意
     */
    public void setSealType2_$011() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * Set the value of sealType2 as $012 (012). <br>
     * $012: 貴重品
     */
    public void setSealType2_$012() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * Set the value of sealType2 as $013 (013). <br>
     * $013: 天地無用
     */
    public void setSealType2_$013() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * Set the value of sealType2 as $014 (014). <br>
     * $014: 飛脚即配便
     */
    public void setSealType2_$014() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * Set the value of sealType2 as $016 (016). <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType2_$016() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * Set the value of sealType2 as $017 (017). <br>
     * $017: 飛脚航空便
     */
    public void setSealType2_$017() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * Set the value of sealType2 as $018 (018). <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType2_$018() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * Set the value of sealType2 as $019 (019). <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType2_$019() {
        setSealType2AsCenterSealType(CDef.CenterSealType.$019);
    }

    /**
     * Set the value of sealType3 as $001 (001). <br>
     * $001: 飛脚クール便(冷蔵)
     */
    public void setSealType3_$001() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$001);
    }

    /**
     * Set the value of sealType3 as $002 (002). <br>
     * $002: 飛脚クール便(冷凍)
     */
    public void setSealType3_$002() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$002);
    }

    /**
     * Set the value of sealType3 as $003 (003). <br>
     * $003: 飛脚スーパー便
     */
    public void setSealType3_$003() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$003);
    }

    /**
     * Set the value of sealType3 as $004 (004). <br>
     * $004: 営止めサービス
     */
    public void setSealType3_$004() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$004);
    }

    /**
     * Set the value of sealType3 as $005 (005). <br>
     * $005: 配達指定日
     */
    public void setSealType3_$005() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$005);
    }

    /**
     * Set the value of sealType3 as $007 (007). <br>
     * $007: 時間帯指定(５時間帯)
     */
    public void setSealType3_$007() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$007);
    }

    /**
     * Set the value of sealType3 as $008 (008). <br>
     * $008: eコレクト(現金決済)
     */
    public void setSealType3_$008() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$008);
    }

    /**
     * Set the value of sealType3 as $009 (009). <br>
     * $009: eコレクト(デビット／クレジット決済)
     */
    public void setSealType3_$009() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$009);
    }

    /**
     * Set the value of sealType3 as $010 (010). <br>
     * $010: eコレクト(なんでも決済)
     */
    public void setSealType3_$010() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$010);
    }

    /**
     * Set the value of sealType3 as $011 (011). <br>
     * $011: 取扱注意
     */
    public void setSealType3_$011() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$011);
    }

    /**
     * Set the value of sealType3 as $012 (012). <br>
     * $012: 貴重品
     */
    public void setSealType3_$012() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$012);
    }

    /**
     * Set the value of sealType3 as $013 (013). <br>
     * $013: 天地無用
     */
    public void setSealType3_$013() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$013);
    }

    /**
     * Set the value of sealType3 as $014 (014). <br>
     * $014: 飛脚即配便
     */
    public void setSealType3_$014() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$014);
    }

    /**
     * Set the value of sealType3 as $016 (016). <br>
     * $016: 時間帯指定(午前中)
     */
    public void setSealType3_$016() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$016);
    }

    /**
     * Set the value of sealType3 as $017 (017). <br>
     * $017: 飛脚航空便
     */
    public void setSealType3_$017() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$017);
    }

    /**
     * Set the value of sealType3 as $018 (018). <br>
     * $018: 飛脚ジャストタイム便
     */
    public void setSealType3_$018() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$018);
    }

    /**
     * Set the value of sealType3 as $019 (019). <br>
     * $019: 時間帯指定(６時間帯(オプション)
     */
    public void setSealType3_$019() {
        setSealType3AsCenterSealType(CDef.CenterSealType.$019);
    }

    /**
     * Set the value of codCls as $1 (1). <br>
     * $1: 元払
     */
    public void setCodCls_$1() {
        setCodClsAsCodCls(CDef.CodCls.$1);
    }

    /**
     * Set the value of codCls as $2 (2). <br>
     * $2: 着払
     */
    public void setCodCls_$2() {
        setCodClsAsCodCls(CDef.CodCls.$2);
    }

    /**
     * Set the value of apiBinsyuCode as $000 (000). <br>
     * $000: 陸便
     */
    public void setApiBinsyuCode_$000() {
        setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$000);
    }

    /**
     * Set the value of apiBinsyuCode as $030 (030). <br>
     * $030: 航空便
     */
    public void setApiBinsyuCode_$030() {
        setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$030);
    }

    /**
     * Set the value of apiBinsyuCode as $140 (140). <br>
     * $140: クール冷蔵
     */
    public void setApiBinsyuCode_$140() {
        setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$140);
    }

    /**
     * Set the value of apiBinsyuCode as $141 (141). <br>
     * $141: クール冷蔵(航空便)
     */
    public void setApiBinsyuCode_$141() {
        setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$141);
    }

    /**
     * Set the value of apiBinsyuCode as $150 (150). <br>
     * $150: クール冷凍
     */
    public void setApiBinsyuCode_$150() {
        setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$150);
    }

    /**
     * Set the value of apiBinsyuCode as $151 (151). <br>
     * $151: クール冷凍(航空便)
     */
    public void setApiBinsyuCode_$151() {
        setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.$151);
    }

    /**
     * Set the value of apiDaibikiFlg as $0 (0). <br>
     * $0: 通常の送り状を発行
     */
    public void setApiDaibikiFlg_$0() {
        setApiDaibikiFlgAsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.$0);
    }

    /**
     * Set the value of apiDaibikiFlg as $1 (1). <br>
     * $1: 代金引換の送り状を発行
     */
    public void setApiDaibikiFlg_$1() {
        setApiDaibikiFlgAsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.$1);
    }

    /**
     * Set the value of apiDaibikiType as $0 (0). <br>
     * $0: なんでも決済
     */
    public void setApiDaibikiType_$0() {
        setApiDaibikiTypeAsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$0);
    }

    /**
     * Set the value of apiDaibikiType as $1 (1). <br>
     * $1: 現金
     */
    public void setApiDaibikiType_$1() {
        setApiDaibikiTypeAsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$1);
    }

    /**
     * Set the value of apiDaibikiType as $2 (2). <br>
     * $2: クレジットカード・デビットカード
     */
    public void setApiDaibikiType_$2() {
        setApiDaibikiTypeAsCenterApiDaibikiType(CDef.CenterApiDaibikiType.$2);
    }

    /**
     * Set the value of apiWeightCd1 as $60 (60). <br>
     * $60: 2Kg(サイズ60)
     */
    public void setApiWeightCd1_$60() {
        setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd.$60);
    }

    /**
     * Set the value of apiWeightCd1 as $80 (80). <br>
     * $80: 5Kg(サイズ80)
     */
    public void setApiWeightCd1_$80() {
        setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd.$80);
    }

    /**
     * Set the value of apiWeightCd1 as $100 (100). <br>
     * $100: 10Kg(サイズ100)
     */
    public void setApiWeightCd1_$100() {
        setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd.$100);
    }

    /**
     * Set the value of apiWeightCd1 as $140 (140). <br>
     * $140: 20Kg(サイズ140)
     */
    public void setApiWeightCd1_$140() {
        setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd.$140);
    }

    /**
     * Set the value of apiWeightCd1 as $160 (160). <br>
     * $160: 30Kg(サイズ160)
     */
    public void setApiWeightCd1_$160() {
        setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd.$160);
    }

    /**
     * Set the value of apiWeightCd2 as $60 (60). <br>
     * $60: 2Kg(サイズ60)
     */
    public void setApiWeightCd2_$60() {
        setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd.$60);
    }

    /**
     * Set the value of apiWeightCd2 as $80 (80). <br>
     * $80: 5Kg(サイズ80)
     */
    public void setApiWeightCd2_$80() {
        setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd.$80);
    }

    /**
     * Set the value of apiWeightCd2 as $100 (100). <br>
     * $100: 10Kg(サイズ100)
     */
    public void setApiWeightCd2_$100() {
        setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd.$100);
    }

    /**
     * Set the value of apiWeightCd2 as $140 (140). <br>
     * $140: 20Kg(サイズ140)
     */
    public void setApiWeightCd2_$140() {
        setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd.$140);
    }

    /**
     * Set the value of apiWeightCd2 as $160 (160). <br>
     * $160: 30Kg(サイズ160)
     */
    public void setApiWeightCd2_$160() {
        setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd.$160);
    }

    /**
     * Set the value of apiEidomeFlg as $0 (0). <br>
     * $0: 営業所止めを行いません
     */
    public void setApiEidomeFlg_$0() {
        setApiEidomeFlgAsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.$0);
    }

    /**
     * Set the value of apiEidomeFlg as $1 (1). <br>
     * $1: 営業所止めにします
     */
    public void setApiEidomeFlg_$1() {
        setApiEidomeFlgAsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.$1);
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
     * Is the value of characterCd $MS932? <br>
     * $MS932: MS932
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCharacterCd$MS932() {
        CDef.CharacterCd cdef = getCharacterCdAsCharacterCd();
        return cdef != null ? cdef.equals(CDef.CharacterCd.$MS932) : false;
    }

    /**
     * Is the value of characterCd $UTF8? <br>
     * $UTF8: UTF8
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCharacterCd$UTF8() {
        CDef.CharacterCd cdef = getCharacterCdAsCharacterCd();
        return cdef != null ? cdef.equals(CDef.CharacterCd.$UTF8) : false;
    }

    /**
     * Is the value of slipShapeCd $001? <br>
     * $001: 箱類
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$001() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$001) : false;
    }

    /**
     * Is the value of slipShapeCd $002? <br>
     * $002: バッグ類
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$002() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$002) : false;
    }

    /**
     * Is the value of slipShapeCd $003? <br>
     * $003: スーツケース
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$003() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$003) : false;
    }

    /**
     * Is the value of slipShapeCd $004? <br>
     * $004: 封筒類
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$004() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$004) : false;
    }

    /**
     * Is the value of slipShapeCd $005? <br>
     * $005: ゴルフバッグ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$005() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$005) : false;
    }

    /**
     * Is the value of slipShapeCd $006? <br>
     * $006: スキー
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$006() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$006) : false;
    }

    /**
     * Is the value of slipShapeCd $007? <br>
     * $007: スノーボード
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$007() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$007) : false;
    }

    /**
     * Is the value of slipShapeCd $008? <br>
     * $008: その他
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipShapeCd$008() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.equals(CDef.CenterSlipShapeCd.$008) : false;
    }

    /**
     * Is the value of transportTypeSpeed $000? <br>
     * $000: 飛脚宅配便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeSpeed$000() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeSpeed.$000) : false;
    }

    /**
     * Is the value of transportTypeSpeed $001? <br>
     * $001: 飛脚スーパー便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeSpeed$001() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeSpeed.$001) : false;
    }

    /**
     * Is the value of transportTypeSpeed $002? <br>
     * $002: 飛脚即配便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeSpeed$002() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeSpeed.$002) : false;
    }

    /**
     * Is the value of transportTypeSpeed $003? <br>
     * $003: 飛脚航空便(翌日中配達)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeSpeed$003() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeSpeed.$003) : false;
    }

    /**
     * Is the value of transportTypeSpeed $004? <br>
     * $004: 飛脚航空便(翌日午前中配達)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeSpeed$004() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeSpeed.$004) : false;
    }

    /**
     * Is the value of transportTypeSpeed $005? <br>
     * $005: 飛脚ジャストタイム便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeSpeed$005() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeSpeed.$005) : false;
    }

    /**
     * Is the value of transportTypeItem $001? <br>
     * $001: 指定なし
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeItem$001() {
        CDef.CenterTransportTypeItem cdef = getTransportTypeItemAsCenterTransportTypeItem();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeItem.$001) : false;
    }

    /**
     * Is the value of transportTypeItem $002? <br>
     * $002: 飛脚クール便(冷蔵)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeItem$002() {
        CDef.CenterTransportTypeItem cdef = getTransportTypeItemAsCenterTransportTypeItem();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeItem.$002) : false;
    }

    /**
     * Is the value of transportTypeItem $003? <br>
     * $003: 飛脚クール便(冷凍)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTransportTypeItem$003() {
        CDef.CenterTransportTypeItem cdef = getTransportTypeItemAsCenterTransportTypeItem();
        return cdef != null ? cdef.equals(CDef.CenterTransportTypeItem.$003) : false;
    }

    /**
     * Is the value of settlementType $0? <br>
     * $0: 指定なし
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSettlementType$0() {
        CDef.SettlementType cdef = getSettlementTypeAsSettlementType();
        return cdef != null ? cdef.equals(CDef.SettlementType.$0) : false;
    }

    /**
     * Is the value of settlementType $1? <br>
     * $1: 全て可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSettlementType$1() {
        CDef.SettlementType cdef = getSettlementTypeAsSettlementType();
        return cdef != null ? cdef.equals(CDef.SettlementType.$1) : false;
    }

    /**
     * Is the value of settlementType $2? <br>
     * $2: 現金のみ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSettlementType$2() {
        CDef.SettlementType cdef = getSettlementTypeAsSettlementType();
        return cdef != null ? cdef.equals(CDef.SettlementType.$2) : false;
    }

    /**
     * Is the value of settlementType $5? <br>
     * $5: ﾃﾞﾋﾞｯﾄ･ｸﾚｼﾞｯﾄ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSettlementType$5() {
        CDef.SettlementType cdef = getSettlementTypeAsSettlementType();
        return cdef != null ? cdef.equals(CDef.SettlementType.$5) : false;
    }

    /**
     * Is the value of sealType1 $001? <br>
     * $001: 飛脚クール便(冷蔵)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$001() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$001) : false;
    }

    /**
     * Is the value of sealType1 $002? <br>
     * $002: 飛脚クール便(冷凍)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$002() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$002) : false;
    }

    /**
     * Is the value of sealType1 $003? <br>
     * $003: 飛脚スーパー便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$003() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$003) : false;
    }

    /**
     * Is the value of sealType1 $004? <br>
     * $004: 営止めサービス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$004() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$004) : false;
    }

    /**
     * Is the value of sealType1 $005? <br>
     * $005: 配達指定日
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$005() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$005) : false;
    }

    /**
     * Is the value of sealType1 $007? <br>
     * $007: 時間帯指定(５時間帯)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$007() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$007) : false;
    }

    /**
     * Is the value of sealType1 $008? <br>
     * $008: eコレクト(現金決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$008() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$008) : false;
    }

    /**
     * Is the value of sealType1 $009? <br>
     * $009: eコレクト(デビット／クレジット決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$009() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$009) : false;
    }

    /**
     * Is the value of sealType1 $010? <br>
     * $010: eコレクト(なんでも決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$010() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$010) : false;
    }

    /**
     * Is the value of sealType1 $011? <br>
     * $011: 取扱注意
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$011() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$011) : false;
    }

    /**
     * Is the value of sealType1 $012? <br>
     * $012: 貴重品
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$012() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$012) : false;
    }

    /**
     * Is the value of sealType1 $013? <br>
     * $013: 天地無用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$013() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$013) : false;
    }

    /**
     * Is the value of sealType1 $014? <br>
     * $014: 飛脚即配便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$014() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$014) : false;
    }

    /**
     * Is the value of sealType1 $016? <br>
     * $016: 時間帯指定(午前中)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$016() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$016) : false;
    }

    /**
     * Is the value of sealType1 $017? <br>
     * $017: 飛脚航空便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$017() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$017) : false;
    }

    /**
     * Is the value of sealType1 $018? <br>
     * $018: 飛脚ジャストタイム便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$018() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$018) : false;
    }

    /**
     * Is the value of sealType1 $019? <br>
     * $019: 時間帯指定(６時間帯(オプション)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType1$019() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$019) : false;
    }

    /**
     * Is the value of sealType2 $001? <br>
     * $001: 飛脚クール便(冷蔵)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$001() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$001) : false;
    }

    /**
     * Is the value of sealType2 $002? <br>
     * $002: 飛脚クール便(冷凍)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$002() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$002) : false;
    }

    /**
     * Is the value of sealType2 $003? <br>
     * $003: 飛脚スーパー便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$003() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$003) : false;
    }

    /**
     * Is the value of sealType2 $004? <br>
     * $004: 営止めサービス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$004() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$004) : false;
    }

    /**
     * Is the value of sealType2 $005? <br>
     * $005: 配達指定日
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$005() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$005) : false;
    }

    /**
     * Is the value of sealType2 $007? <br>
     * $007: 時間帯指定(５時間帯)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$007() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$007) : false;
    }

    /**
     * Is the value of sealType2 $008? <br>
     * $008: eコレクト(現金決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$008() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$008) : false;
    }

    /**
     * Is the value of sealType2 $009? <br>
     * $009: eコレクト(デビット／クレジット決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$009() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$009) : false;
    }

    /**
     * Is the value of sealType2 $010? <br>
     * $010: eコレクト(なんでも決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$010() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$010) : false;
    }

    /**
     * Is the value of sealType2 $011? <br>
     * $011: 取扱注意
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$011() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$011) : false;
    }

    /**
     * Is the value of sealType2 $012? <br>
     * $012: 貴重品
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$012() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$012) : false;
    }

    /**
     * Is the value of sealType2 $013? <br>
     * $013: 天地無用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$013() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$013) : false;
    }

    /**
     * Is the value of sealType2 $014? <br>
     * $014: 飛脚即配便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$014() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$014) : false;
    }

    /**
     * Is the value of sealType2 $016? <br>
     * $016: 時間帯指定(午前中)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$016() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$016) : false;
    }

    /**
     * Is the value of sealType2 $017? <br>
     * $017: 飛脚航空便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$017() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$017) : false;
    }

    /**
     * Is the value of sealType2 $018? <br>
     * $018: 飛脚ジャストタイム便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$018() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$018) : false;
    }

    /**
     * Is the value of sealType2 $019? <br>
     * $019: 時間帯指定(６時間帯(オプション)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType2$019() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$019) : false;
    }

    /**
     * Is the value of sealType3 $001? <br>
     * $001: 飛脚クール便(冷蔵)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$001() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$001) : false;
    }

    /**
     * Is the value of sealType3 $002? <br>
     * $002: 飛脚クール便(冷凍)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$002() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$002) : false;
    }

    /**
     * Is the value of sealType3 $003? <br>
     * $003: 飛脚スーパー便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$003() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$003) : false;
    }

    /**
     * Is the value of sealType3 $004? <br>
     * $004: 営止めサービス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$004() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$004) : false;
    }

    /**
     * Is the value of sealType3 $005? <br>
     * $005: 配達指定日
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$005() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$005) : false;
    }

    /**
     * Is the value of sealType3 $007? <br>
     * $007: 時間帯指定(５時間帯)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$007() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$007) : false;
    }

    /**
     * Is the value of sealType3 $008? <br>
     * $008: eコレクト(現金決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$008() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$008) : false;
    }

    /**
     * Is the value of sealType3 $009? <br>
     * $009: eコレクト(デビット／クレジット決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$009() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$009) : false;
    }

    /**
     * Is the value of sealType3 $010? <br>
     * $010: eコレクト(なんでも決済)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$010() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$010) : false;
    }

    /**
     * Is the value of sealType3 $011? <br>
     * $011: 取扱注意
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$011() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$011) : false;
    }

    /**
     * Is the value of sealType3 $012? <br>
     * $012: 貴重品
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$012() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$012) : false;
    }

    /**
     * Is the value of sealType3 $013? <br>
     * $013: 天地無用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$013() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$013) : false;
    }

    /**
     * Is the value of sealType3 $014? <br>
     * $014: 飛脚即配便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$014() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$014) : false;
    }

    /**
     * Is the value of sealType3 $016? <br>
     * $016: 時間帯指定(午前中)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$016() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$016) : false;
    }

    /**
     * Is the value of sealType3 $017? <br>
     * $017: 飛脚航空便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$017() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$017) : false;
    }

    /**
     * Is the value of sealType3 $018? <br>
     * $018: 飛脚ジャストタイム便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$018() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$018) : false;
    }

    /**
     * Is the value of sealType3 $019? <br>
     * $019: 時間帯指定(６時間帯(オプション)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSealType3$019() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.equals(CDef.CenterSealType.$019) : false;
    }

    /**
     * Is the value of codCls $1? <br>
     * $1: 元払
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodCls$1() {
        CDef.CodCls cdef = getCodClsAsCodCls();
        return cdef != null ? cdef.equals(CDef.CodCls.$1) : false;
    }

    /**
     * Is the value of codCls $2? <br>
     * $2: 着払
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodCls$2() {
        CDef.CodCls cdef = getCodClsAsCodCls();
        return cdef != null ? cdef.equals(CDef.CodCls.$2) : false;
    }

    /**
     * Is the value of apiBinsyuCode $000? <br>
     * $000: 陸便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiBinsyuCode$000() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.equals(CDef.CenterApiBinsyuCode.$000) : false;
    }

    /**
     * Is the value of apiBinsyuCode $030? <br>
     * $030: 航空便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiBinsyuCode$030() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.equals(CDef.CenterApiBinsyuCode.$030) : false;
    }

    /**
     * Is the value of apiBinsyuCode $140? <br>
     * $140: クール冷蔵
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiBinsyuCode$140() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.equals(CDef.CenterApiBinsyuCode.$140) : false;
    }

    /**
     * Is the value of apiBinsyuCode $141? <br>
     * $141: クール冷蔵(航空便)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiBinsyuCode$141() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.equals(CDef.CenterApiBinsyuCode.$141) : false;
    }

    /**
     * Is the value of apiBinsyuCode $150? <br>
     * $150: クール冷凍
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiBinsyuCode$150() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.equals(CDef.CenterApiBinsyuCode.$150) : false;
    }

    /**
     * Is the value of apiBinsyuCode $151? <br>
     * $151: クール冷凍(航空便)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiBinsyuCode$151() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.equals(CDef.CenterApiBinsyuCode.$151) : false;
    }

    /**
     * Is the value of apiDaibikiFlg $0? <br>
     * $0: 通常の送り状を発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiDaibikiFlg$0() {
        CDef.CenterApiDaibikiFlg cdef = getApiDaibikiFlgAsCenterApiDaibikiFlg();
        return cdef != null ? cdef.equals(CDef.CenterApiDaibikiFlg.$0) : false;
    }

    /**
     * Is the value of apiDaibikiFlg $1? <br>
     * $1: 代金引換の送り状を発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiDaibikiFlg$1() {
        CDef.CenterApiDaibikiFlg cdef = getApiDaibikiFlgAsCenterApiDaibikiFlg();
        return cdef != null ? cdef.equals(CDef.CenterApiDaibikiFlg.$1) : false;
    }

    /**
     * Is the value of apiDaibikiType $0? <br>
     * $0: なんでも決済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiDaibikiType$0() {
        CDef.CenterApiDaibikiType cdef = getApiDaibikiTypeAsCenterApiDaibikiType();
        return cdef != null ? cdef.equals(CDef.CenterApiDaibikiType.$0) : false;
    }

    /**
     * Is the value of apiDaibikiType $1? <br>
     * $1: 現金
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiDaibikiType$1() {
        CDef.CenterApiDaibikiType cdef = getApiDaibikiTypeAsCenterApiDaibikiType();
        return cdef != null ? cdef.equals(CDef.CenterApiDaibikiType.$1) : false;
    }

    /**
     * Is the value of apiDaibikiType $2? <br>
     * $2: クレジットカード・デビットカード
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiDaibikiType$2() {
        CDef.CenterApiDaibikiType cdef = getApiDaibikiTypeAsCenterApiDaibikiType();
        return cdef != null ? cdef.equals(CDef.CenterApiDaibikiType.$2) : false;
    }

    /**
     * Is the value of apiWeightCd1 $60? <br>
     * $60: 2Kg(サイズ60)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd1$60() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd1AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$60) : false;
    }

    /**
     * Is the value of apiWeightCd1 $80? <br>
     * $80: 5Kg(サイズ80)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd1$80() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd1AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$80) : false;
    }

    /**
     * Is the value of apiWeightCd1 $100? <br>
     * $100: 10Kg(サイズ100)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd1$100() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd1AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$100) : false;
    }

    /**
     * Is the value of apiWeightCd1 $140? <br>
     * $140: 20Kg(サイズ140)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd1$140() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd1AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$140) : false;
    }

    /**
     * Is the value of apiWeightCd1 $160? <br>
     * $160: 30Kg(サイズ160)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd1$160() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd1AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$160) : false;
    }

    /**
     * Is the value of apiWeightCd2 $60? <br>
     * $60: 2Kg(サイズ60)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd2$60() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd2AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$60) : false;
    }

    /**
     * Is the value of apiWeightCd2 $80? <br>
     * $80: 5Kg(サイズ80)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd2$80() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd2AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$80) : false;
    }

    /**
     * Is the value of apiWeightCd2 $100? <br>
     * $100: 10Kg(サイズ100)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd2$100() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd2AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$100) : false;
    }

    /**
     * Is the value of apiWeightCd2 $140? <br>
     * $140: 20Kg(サイズ140)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd2$140() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd2AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$140) : false;
    }

    /**
     * Is the value of apiWeightCd2 $160? <br>
     * $160: 30Kg(サイズ160)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiWeightCd2$160() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd2AsCenterApiWeightCd();
        return cdef != null ? cdef.equals(CDef.CenterApiWeightCd.$160) : false;
    }

    /**
     * Is the value of apiEidomeFlg $0? <br>
     * $0: 営業所止めを行いません
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiEidomeFlg$0() {
        CDef.CenterApiEidomeFlg cdef = getApiEidomeFlgAsCenterApiEidomeFlg();
        return cdef != null ? cdef.equals(CDef.CenterApiEidomeFlg.$0) : false;
    }

    /**
     * Is the value of apiEidomeFlg $1? <br>
     * $1: 営業所止めにします
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isApiEidomeFlg$1() {
        CDef.CenterApiEidomeFlg cdef = getApiEidomeFlgAsCenterApiEidomeFlg();
        return cdef != null ? cdef.equals(CDef.CenterApiEidomeFlg.$1) : false;
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
     * Get the value of the column 'characterCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCharacterCdName() {
        CDef.CharacterCd cdef = getCharacterCdAsCharacterCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'slipShapeCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSlipShapeCdName() {
        CDef.CenterSlipShapeCd cdef = getSlipShapeCdAsCenterSlipShapeCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'transportTypeSpeed' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTransportTypeSpeedName() {
        CDef.CenterTransportTypeSpeed cdef = getTransportTypeSpeedAsCenterTransportTypeSpeed();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'transportTypeItem' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTransportTypeItemName() {
        CDef.CenterTransportTypeItem cdef = getTransportTypeItemAsCenterTransportTypeItem();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'settlementType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSettlementTypeName() {
        CDef.SettlementType cdef = getSettlementTypeAsSettlementType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'sealType1' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSealType1Name() {
        CDef.CenterSealType cdef = getSealType1AsCenterSealType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'sealType2' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSealType2Name() {
        CDef.CenterSealType cdef = getSealType2AsCenterSealType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'sealType3' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSealType3Name() {
        CDef.CenterSealType cdef = getSealType3AsCenterSealType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'codCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCodClsName() {
        CDef.CodCls cdef = getCodClsAsCodCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'apiBinsyuCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getApiBinsyuCodeName() {
        CDef.CenterApiBinsyuCode cdef = getApiBinsyuCodeAsCenterApiBinsyuCode();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'apiDaibikiFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getApiDaibikiFlgName() {
        CDef.CenterApiDaibikiFlg cdef = getApiDaibikiFlgAsCenterApiDaibikiFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'apiDaibikiType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getApiDaibikiTypeName() {
        CDef.CenterApiDaibikiType cdef = getApiDaibikiTypeAsCenterApiDaibikiType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'apiWeightCd1' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getApiWeightCd1Name() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd1AsCenterApiWeightCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'apiWeightCd2' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getApiWeightCd2Name() {
        CDef.CenterApiWeightCd cdef = getApiWeightCd2AsCenterApiWeightCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'apiEidomeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getApiEidomeFlgName() {
        CDef.CenterApiEidomeFlg cdef = getApiEidomeFlgAsCenterApiEidomeFlg();
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

    /** M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'. */
    protected MCenterClassDtl _mCenterClassDtlByApiBinsyuCode;

    /**
     * [get] M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByApiBinsyuCode'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByApiBinsyuCode() {
        return _mCenterClassDtlByApiBinsyuCode;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
     * @param mCenterClassDtlByApiBinsyuCode The entity of foreign property 'MCenterClassDtlByApiBinsyuCode'. (NullAllowed)
     */
    public void setMCenterClassDtlByApiBinsyuCode(MCenterClassDtl mCenterClassDtlByApiBinsyuCode) {
        _mCenterClassDtlByApiBinsyuCode = mCenterClassDtlByApiBinsyuCode;
    }

    /** M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'. */
    protected MCenterClassDtl _mCenterClassDtlByApiDaibikiFlg;

    /**
     * [get] M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByApiDaibikiFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByApiDaibikiFlg() {
        return _mCenterClassDtlByApiDaibikiFlg;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
     * @param mCenterClassDtlByApiDaibikiFlg The entity of foreign property 'MCenterClassDtlByApiDaibikiFlg'. (NullAllowed)
     */
    public void setMCenterClassDtlByApiDaibikiFlg(MCenterClassDtl mCenterClassDtlByApiDaibikiFlg) {
        _mCenterClassDtlByApiDaibikiFlg = mCenterClassDtlByApiDaibikiFlg;
    }

    /** M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'. */
    protected MCenterClassDtl _mCenterClassDtlByApiDaibikiType;

    /**
     * [get] M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByApiDaibikiType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByApiDaibikiType() {
        return _mCenterClassDtlByApiDaibikiType;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
     * @param mCenterClassDtlByApiDaibikiType The entity of foreign property 'MCenterClassDtlByApiDaibikiType'. (NullAllowed)
     */
    public void setMCenterClassDtlByApiDaibikiType(MCenterClassDtl mCenterClassDtlByApiDaibikiType) {
        _mCenterClassDtlByApiDaibikiType = mCenterClassDtlByApiDaibikiType;
    }

    /** M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'. */
    protected MCenterClassDtl _mCenterClassDtlByApiEidomeFlg;

    /**
     * [get] M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByApiEidomeFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByApiEidomeFlg() {
        return _mCenterClassDtlByApiEidomeFlg;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
     * @param mCenterClassDtlByApiEidomeFlg The entity of foreign property 'MCenterClassDtlByApiEidomeFlg'. (NullAllowed)
     */
    public void setMCenterClassDtlByApiEidomeFlg(MCenterClassDtl mCenterClassDtlByApiEidomeFlg) {
        _mCenterClassDtlByApiEidomeFlg = mCenterClassDtlByApiEidomeFlg;
    }

    /** M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'. */
    protected MCenterClassDtl _mCenterClassDtlByApiWeightCd1;

    /**
     * [get] M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByApiWeightCd1'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByApiWeightCd1() {
        return _mCenterClassDtlByApiWeightCd1;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
     * @param mCenterClassDtlByApiWeightCd1 The entity of foreign property 'MCenterClassDtlByApiWeightCd1'. (NullAllowed)
     */
    public void setMCenterClassDtlByApiWeightCd1(MCenterClassDtl mCenterClassDtlByApiWeightCd1) {
        _mCenterClassDtlByApiWeightCd1 = mCenterClassDtlByApiWeightCd1;
    }

    /** M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'. */
    protected MCenterClassDtl _mCenterClassDtlByApiWeightCd2;

    /**
     * [get] M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByApiWeightCd2'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByApiWeightCd2() {
        return _mCenterClassDtlByApiWeightCd2;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
     * @param mCenterClassDtlByApiWeightCd2 The entity of foreign property 'MCenterClassDtlByApiWeightCd2'. (NullAllowed)
     */
    public void setMCenterClassDtlByApiWeightCd2(MCenterClassDtl mCenterClassDtlByApiWeightCd2) {
        _mCenterClassDtlByApiWeightCd2 = mCenterClassDtlByApiWeightCd2;
    }

    /** B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'. */
    protected BClassDtl _bClassDtlByCharacterCd;

    /**
     * [get] B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'. <br>
     * @return The entity of foreign property 'BClassDtlByCharacterCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCharacterCd() {
        return _bClassDtlByCharacterCd;
    }

    /**
     * [set] B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * @param bClassDtlByCharacterCd The entity of foreign property 'BClassDtlByCharacterCd'. (NullAllowed)
     */
    public void setBClassDtlByCharacterCd(BClassDtl bClassDtlByCharacterCd) {
        _bClassDtlByCharacterCd = bClassDtlByCharacterCd;
    }

    /** B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'. */
    protected BClassDtl _bClassDtlByCodCls;

    /**
     * [get] B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'. <br>
     * @return The entity of foreign property 'BClassDtlByCodCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCodCls() {
        return _bClassDtlByCodCls;
    }

    /**
     * [set] B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'.
     * @param bClassDtlByCodCls The entity of foreign property 'BClassDtlByCodCls'. (NullAllowed)
     */
    public void setBClassDtlByCodCls(BClassDtl bClassDtlByCodCls) {
        _bClassDtlByCodCls = bClassDtlByCodCls;
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

    /** M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'. */
    protected MCenterClassDtl _mCenterClassDtlBySealType1;

    /**
     * [get] M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'. <br>
     * @return The entity of foreign property 'MCenterClassDtlBySealType1'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlBySealType1() {
        return _mCenterClassDtlBySealType1;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
     * @param mCenterClassDtlBySealType1 The entity of foreign property 'MCenterClassDtlBySealType1'. (NullAllowed)
     */
    public void setMCenterClassDtlBySealType1(MCenterClassDtl mCenterClassDtlBySealType1) {
        _mCenterClassDtlBySealType1 = mCenterClassDtlBySealType1;
    }

    /** M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'. */
    protected MCenterClassDtl _mCenterClassDtlBySealType2;

    /**
     * [get] M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'. <br>
     * @return The entity of foreign property 'MCenterClassDtlBySealType2'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlBySealType2() {
        return _mCenterClassDtlBySealType2;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
     * @param mCenterClassDtlBySealType2 The entity of foreign property 'MCenterClassDtlBySealType2'. (NullAllowed)
     */
    public void setMCenterClassDtlBySealType2(MCenterClassDtl mCenterClassDtlBySealType2) {
        _mCenterClassDtlBySealType2 = mCenterClassDtlBySealType2;
    }

    /** M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'. */
    protected MCenterClassDtl _mCenterClassDtlBySealType3;

    /**
     * [get] M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'. <br>
     * @return The entity of foreign property 'MCenterClassDtlBySealType3'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlBySealType3() {
        return _mCenterClassDtlBySealType3;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
     * @param mCenterClassDtlBySealType3 The entity of foreign property 'MCenterClassDtlBySealType3'. (NullAllowed)
     */
    public void setMCenterClassDtlBySealType3(MCenterClassDtl mCenterClassDtlBySealType3) {
        _mCenterClassDtlBySealType3 = mCenterClassDtlBySealType3;
    }

    /** B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'. */
    protected BClassDtl _bClassDtlBySettlementType;

    /**
     * [get] B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'. <br>
     * @return The entity of foreign property 'BClassDtlBySettlementType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySettlementType() {
        return _bClassDtlBySettlementType;
    }

    /**
     * [set] B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'.
     * @param bClassDtlBySettlementType The entity of foreign property 'BClassDtlBySettlementType'. (NullAllowed)
     */
    public void setBClassDtlBySettlementType(BClassDtl bClassDtlBySettlementType) {
        _bClassDtlBySettlementType = bClassDtlBySettlementType;
    }

    /** M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'. */
    protected MCenterClassDtl _mCenterClassDtlBySlipShapeCd;

    /**
     * [get] M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'. <br>
     * @return The entity of foreign property 'MCenterClassDtlBySlipShapeCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlBySlipShapeCd() {
        return _mCenterClassDtlBySlipShapeCd;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
     * @param mCenterClassDtlBySlipShapeCd The entity of foreign property 'MCenterClassDtlBySlipShapeCd'. (NullAllowed)
     */
    public void setMCenterClassDtlBySlipShapeCd(MCenterClassDtl mCenterClassDtlBySlipShapeCd) {
        _mCenterClassDtlBySlipShapeCd = mCenterClassDtlBySlipShapeCd;
    }

    /** M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'. */
    protected MCenterClassDtl _mCenterClassDtlByTransportTypeItem;

    /**
     * [get] M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByTransportTypeItem'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByTransportTypeItem() {
        return _mCenterClassDtlByTransportTypeItem;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
     * @param mCenterClassDtlByTransportTypeItem The entity of foreign property 'MCenterClassDtlByTransportTypeItem'. (NullAllowed)
     */
    public void setMCenterClassDtlByTransportTypeItem(MCenterClassDtl mCenterClassDtlByTransportTypeItem) {
        _mCenterClassDtlByTransportTypeItem = mCenterClassDtlByTransportTypeItem;
    }

    /** M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'. */
    protected MCenterClassDtl _mCenterClassDtlByTransportTypeSpeed;

    /**
     * [get] M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'. <br>
     * @return The entity of foreign property 'MCenterClassDtlByTransportTypeSpeed'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenterClassDtl getMCenterClassDtlByTransportTypeSpeed() {
        return _mCenterClassDtlByTransportTypeSpeed;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
     * @param mCenterClassDtlByTransportTypeSpeed The entity of foreign property 'MCenterClassDtlByTransportTypeSpeed'. (NullAllowed)
     */
    public void setMCenterClassDtlByTransportTypeSpeed(MCenterClassDtl mCenterClassDtlByTransportTypeSpeed) {
        _mCenterClassDtlByTransportTypeSpeed = mCenterClassDtlByTransportTypeSpeed;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'. */
    protected List<MDeliveryCourse> _mDeliveryCourseList;

    /**
     * [get] M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
     * @return The entity list of referrer property 'MDeliveryCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDeliveryCourse> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = newReferrerList(); }
        return _mDeliveryCourseList;
    }

    /**
     * [set] M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
     * @param mDeliveryCourseList The entity list of referrer property 'MDeliveryCourseList'. (NullAllowed)
     */
    public void setMDeliveryCourseList(List<MDeliveryCourse> mDeliveryCourseList) {
        _mDeliveryCourseList = mDeliveryCourseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCarrierSlipSgw) {
            BsMCarrierSlipSgw other = (BsMCarrierSlipSgw)obj;
            if (!xSV(_carrierSlipSgwId, other._carrierSlipSgwId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _carrierSlipSgwId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mCenterClassDtlByApiBinsyuCode != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByApiBinsyuCode, "mCenterClassDtlByApiBinsyuCode")); }
        if (_mCenterClassDtlByApiDaibikiFlg != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByApiDaibikiFlg, "mCenterClassDtlByApiDaibikiFlg")); }
        if (_mCenterClassDtlByApiDaibikiType != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByApiDaibikiType, "mCenterClassDtlByApiDaibikiType")); }
        if (_mCenterClassDtlByApiEidomeFlg != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByApiEidomeFlg, "mCenterClassDtlByApiEidomeFlg")); }
        if (_mCenterClassDtlByApiWeightCd1 != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByApiWeightCd1, "mCenterClassDtlByApiWeightCd1")); }
        if (_mCenterClassDtlByApiWeightCd2 != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByApiWeightCd2, "mCenterClassDtlByApiWeightCd2")); }
        if (_bClassDtlByCharacterCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCharacterCd, "bClassDtlByCharacterCd")); }
        if (_bClassDtlByCodCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCodCls, "bClassDtlByCodCls")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mCenterClassDtlBySealType1 != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlBySealType1, "mCenterClassDtlBySealType1")); }
        if (_mCenterClassDtlBySealType2 != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlBySealType2, "mCenterClassDtlBySealType2")); }
        if (_mCenterClassDtlBySealType3 != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlBySealType3, "mCenterClassDtlBySealType3")); }
        if (_bClassDtlBySettlementType != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySettlementType, "bClassDtlBySettlementType")); }
        if (_mCenterClassDtlBySlipShapeCd != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlBySlipShapeCd, "mCenterClassDtlBySlipShapeCd")); }
        if (_mCenterClassDtlByTransportTypeItem != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByTransportTypeItem, "mCenterClassDtlByTransportTypeItem")); }
        if (_mCenterClassDtlByTransportTypeSpeed != null)
        { sb.append(li).append(xbRDS(_mCenterClassDtlByTransportTypeSpeed, "mCenterClassDtlByTransportTypeSpeed")); }
        if (_mDeliveryCourseList != null) { for (MDeliveryCourse et : _mDeliveryCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDeliveryCourseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_carrierSlipSgwId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_tagType));
        sb.append(dm).append(xfND(_tagNm));
        sb.append(dm).append(xfND(_characterCd));
        sb.append(dm).append(xfND(_slipCustomerCd));
        sb.append(dm).append(xfND(_webApiRequestUrl));
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_loginPassword));
        sb.append(dm).append(xfND(_deptConsignorNm));
        sb.append(dm).append(xfND(_consignorTelNo));
        sb.append(dm).append(xfND(_slipClientTelNo));
        sb.append(dm).append(xfND(_slipClientZipCd));
        sb.append(dm).append(xfND(_slipClientAddress1));
        sb.append(dm).append(xfND(_slipClientAddress2));
        sb.append(dm).append(xfND(_slipClientNm1));
        sb.append(dm).append(xfND(_slipClientNm2));
        sb.append(dm).append(xfND(_slipShapeCd));
        sb.append(dm).append(xfND(_slipItemNm1));
        sb.append(dm).append(xfND(_slipItemNm2));
        sb.append(dm).append(xfND(_slipItemNm3));
        sb.append(dm).append(xfND(_slipItemNm4));
        sb.append(dm).append(xfND(_slipItemNm5));
        sb.append(dm).append(xfND(_transportTypeSpeed));
        sb.append(dm).append(xfND(_transportTypeItem));
        sb.append(dm).append(xfND(_settlementType));
        sb.append(dm).append(xfND(_sealType1));
        sb.append(dm).append(xfND(_sealType2));
        sb.append(dm).append(xfND(_sealType3));
        sb.append(dm).append(xfND(_codCls));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_apiOkuriCode));
        sb.append(dm).append(xfND(_apiBinsyuCode));
        sb.append(dm).append(xfND(_apiDaibikiFlg));
        sb.append(dm).append(xfND(_apiDaibikiType));
        sb.append(dm).append(xfND(_apiWeightCd1));
        sb.append(dm).append(xfND(_apiWeightCd2));
        sb.append(dm).append(xfND(_apiEidomeFlg));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mCenterClassDtlByApiBinsyuCode != null)
        { sb.append(dm).append("mCenterClassDtlByApiBinsyuCode"); }
        if (_mCenterClassDtlByApiDaibikiFlg != null)
        { sb.append(dm).append("mCenterClassDtlByApiDaibikiFlg"); }
        if (_mCenterClassDtlByApiDaibikiType != null)
        { sb.append(dm).append("mCenterClassDtlByApiDaibikiType"); }
        if (_mCenterClassDtlByApiEidomeFlg != null)
        { sb.append(dm).append("mCenterClassDtlByApiEidomeFlg"); }
        if (_mCenterClassDtlByApiWeightCd1 != null)
        { sb.append(dm).append("mCenterClassDtlByApiWeightCd1"); }
        if (_mCenterClassDtlByApiWeightCd2 != null)
        { sb.append(dm).append("mCenterClassDtlByApiWeightCd2"); }
        if (_bClassDtlByCharacterCd != null)
        { sb.append(dm).append("bClassDtlByCharacterCd"); }
        if (_bClassDtlByCodCls != null)
        { sb.append(dm).append("bClassDtlByCodCls"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mCenterClassDtlBySealType1 != null)
        { sb.append(dm).append("mCenterClassDtlBySealType1"); }
        if (_mCenterClassDtlBySealType2 != null)
        { sb.append(dm).append("mCenterClassDtlBySealType2"); }
        if (_mCenterClassDtlBySealType3 != null)
        { sb.append(dm).append("mCenterClassDtlBySealType3"); }
        if (_bClassDtlBySettlementType != null)
        { sb.append(dm).append("bClassDtlBySettlementType"); }
        if (_mCenterClassDtlBySlipShapeCd != null)
        { sb.append(dm).append("mCenterClassDtlBySlipShapeCd"); }
        if (_mCenterClassDtlByTransportTypeItem != null)
        { sb.append(dm).append("mCenterClassDtlByTransportTypeItem"); }
        if (_mCenterClassDtlByTransportTypeSpeed != null)
        { sb.append(dm).append("mCenterClassDtlByTransportTypeSpeed"); }
        if (_mDeliveryCourseList != null && !_mDeliveryCourseList.isEmpty())
        { sb.append(dm).append("mDeliveryCourseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrierSlipSgw clone() {
        return (MCarrierSlipSgw)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_SGW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierSlipSgwId() {
        checkSpecifiedProperty("carrierSlipSgwId");
        return _carrierSlipSgwId;
    }

    /**
     * [set] CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @param carrierSlipSgwId The value of the column 'CARRIER_SLIP_SGW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierSlipSgwId(Long carrierSlipSgwId) {
        registerModifiedProperty("carrierSlipSgwId");
        _carrierSlipSgwId = carrierSlipSgwId;
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
     * [get] TAG_TYPE: {+UQ, NotNull, varchar(30)} <br>
     * データ種別
     * @return The value of the column 'TAG_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getTagType() {
        checkSpecifiedProperty("tagType");
        return convertEmptyToNull(_tagType);
    }

    /**
     * [set] TAG_TYPE: {+UQ, NotNull, varchar(30)} <br>
     * データ種別
     * @param tagType The value of the column 'TAG_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setTagType(String tagType) {
        registerModifiedProperty("tagType");
        _tagType = tagType;
    }

    /**
     * [get] TAG_NM: {varchar(60)} <br>
     * データ種別名称
     * @return The value of the column 'TAG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagNm() {
        checkSpecifiedProperty("tagNm");
        return convertEmptyToNull(_tagNm);
    }

    /**
     * [set] TAG_NM: {varchar(60)} <br>
     * データ種別名称
     * @param tagNm The value of the column 'TAG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagNm(String tagNm) {
        registerModifiedProperty("tagNm");
        _tagNm = tagNm;
    }

    /**
     * [get] CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字CD
     * @return The value of the column 'CHARACTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacterCd() {
        checkSpecifiedProperty("characterCd");
        return convertEmptyToNull(_characterCd);
    }

    /**
     * [set] CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} <br>
     * 文字CD
     * @param characterCd The value of the column 'CHARACTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacterCd(String characterCd) {
        registerModifiedProperty("characterCd");
        _characterCd = characterCd;
    }

    /**
     * [get] SLIP_CUSTOMER_CD: {varchar(30)} <br>
     * お客様CD
     * @return The value of the column 'SLIP_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipCustomerCd() {
        checkSpecifiedProperty("slipCustomerCd");
        return convertEmptyToNull(_slipCustomerCd);
    }

    /**
     * [set] SLIP_CUSTOMER_CD: {varchar(30)} <br>
     * お客様CD
     * @param slipCustomerCd The value of the column 'SLIP_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipCustomerCd(String slipCustomerCd) {
        registerModifiedProperty("slipCustomerCd");
        _slipCustomerCd = slipCustomerCd;
    }

    /**
     * [get] WEB_API_REQUEST_URL: {varchar(100)} <br>
     * WebAPIリクエストURL
     * @return The value of the column 'WEB_API_REQUEST_URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getWebApiRequestUrl() {
        checkSpecifiedProperty("webApiRequestUrl");
        return convertEmptyToNull(_webApiRequestUrl);
    }

    /**
     * [set] WEB_API_REQUEST_URL: {varchar(100)} <br>
     * WebAPIリクエストURL
     * @param webApiRequestUrl The value of the column 'WEB_API_REQUEST_URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWebApiRequestUrl(String webApiRequestUrl) {
        registerModifiedProperty("webApiRequestUrl");
        _webApiRequestUrl = webApiRequestUrl;
    }

    /**
     * [get] CUSTOMER_ID: {varchar(30)} <br>
     * カスタマーID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerId() {
        checkSpecifiedProperty("customerId");
        return convertEmptyToNull(_customerId);
    }

    /**
     * [set] CUSTOMER_ID: {varchar(30)} <br>
     * カスタマーID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerId(String customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] LOGIN_PASSWORD: {varchar(30)} <br>
     * ログインパスワード
     * @return The value of the column 'LOGIN_PASSWORD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoginPassword() {
        checkSpecifiedProperty("loginPassword");
        return convertEmptyToNull(_loginPassword);
    }

    /**
     * [set] LOGIN_PASSWORD: {varchar(30)} <br>
     * ログインパスワード
     * @param loginPassword The value of the column 'LOGIN_PASSWORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoginPassword(String loginPassword) {
        registerModifiedProperty("loginPassword");
        _loginPassword = loginPassword;
    }

    /**
     * [get] DEPT_CONSIGNOR_NM: {varchar(255)} <br>
     * 部署・担当者
     * @return The value of the column 'DEPT_CONSIGNOR_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeptConsignorNm() {
        checkSpecifiedProperty("deptConsignorNm");
        return convertEmptyToNull(_deptConsignorNm);
    }

    /**
     * [set] DEPT_CONSIGNOR_NM: {varchar(255)} <br>
     * 部署・担当者
     * @param deptConsignorNm The value of the column 'DEPT_CONSIGNOR_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeptConsignorNm(String deptConsignorNm) {
        registerModifiedProperty("deptConsignorNm");
        _deptConsignorNm = deptConsignorNm;
    }

    /**
     * [get] CONSIGNOR_TEL_NO: {varchar(30)} <br>
     * 荷送人電話番号
     * @return The value of the column 'CONSIGNOR_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getConsignorTelNo() {
        checkSpecifiedProperty("consignorTelNo");
        return convertEmptyToNull(_consignorTelNo);
    }

    /**
     * [set] CONSIGNOR_TEL_NO: {varchar(30)} <br>
     * 荷送人電話番号
     * @param consignorTelNo The value of the column 'CONSIGNOR_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConsignorTelNo(String consignorTelNo) {
        registerModifiedProperty("consignorTelNo");
        _consignorTelNo = consignorTelNo;
    }

    /**
     * [get] SLIP_CLIENT_TEL_NO: {varchar(30)} <br>
     * ご依頼主電話番号
     * @return The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientTelNo() {
        checkSpecifiedProperty("slipClientTelNo");
        return convertEmptyToNull(_slipClientTelNo);
    }

    /**
     * [set] SLIP_CLIENT_TEL_NO: {varchar(30)} <br>
     * ご依頼主電話番号
     * @param slipClientTelNo The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientTelNo(String slipClientTelNo) {
        registerModifiedProperty("slipClientTelNo");
        _slipClientTelNo = slipClientTelNo;
    }

    /**
     * [get] SLIP_CLIENT_ZIP_CD: {varchar(30)} <br>
     * ご依頼主郵便番号
     * @return The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientZipCd() {
        checkSpecifiedProperty("slipClientZipCd");
        return convertEmptyToNull(_slipClientZipCd);
    }

    /**
     * [set] SLIP_CLIENT_ZIP_CD: {varchar(30)} <br>
     * ご依頼主郵便番号
     * @param slipClientZipCd The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientZipCd(String slipClientZipCd) {
        registerModifiedProperty("slipClientZipCd");
        _slipClientZipCd = slipClientZipCd;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS1: {varchar(255)} <br>
     * ご依頼主住所1
     * @return The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress1() {
        checkSpecifiedProperty("slipClientAddress1");
        return convertEmptyToNull(_slipClientAddress1);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS1: {varchar(255)} <br>
     * ご依頼主住所1
     * @param slipClientAddress1 The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress1(String slipClientAddress1) {
        registerModifiedProperty("slipClientAddress1");
        _slipClientAddress1 = slipClientAddress1;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS2: {varchar(255)} <br>
     * ご依頼主住所2
     * @return The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress2() {
        checkSpecifiedProperty("slipClientAddress2");
        return convertEmptyToNull(_slipClientAddress2);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS2: {varchar(255)} <br>
     * ご依頼主住所2
     * @param slipClientAddress2 The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress2(String slipClientAddress2) {
        registerModifiedProperty("slipClientAddress2");
        _slipClientAddress2 = slipClientAddress2;
    }

    /**
     * [get] SLIP_CLIENT_NM1: {varchar(255)} <br>
     * ご依頼主名称1
     * @return The value of the column 'SLIP_CLIENT_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientNm1() {
        checkSpecifiedProperty("slipClientNm1");
        return convertEmptyToNull(_slipClientNm1);
    }

    /**
     * [set] SLIP_CLIENT_NM1: {varchar(255)} <br>
     * ご依頼主名称1
     * @param slipClientNm1 The value of the column 'SLIP_CLIENT_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientNm1(String slipClientNm1) {
        registerModifiedProperty("slipClientNm1");
        _slipClientNm1 = slipClientNm1;
    }

    /**
     * [get] SLIP_CLIENT_NM2: {varchar(255)} <br>
     * ご依頼主名称2
     * @return The value of the column 'SLIP_CLIENT_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientNm2() {
        checkSpecifiedProperty("slipClientNm2");
        return convertEmptyToNull(_slipClientNm2);
    }

    /**
     * [set] SLIP_CLIENT_NM2: {varchar(255)} <br>
     * ご依頼主名称2
     * @param slipClientNm2 The value of the column 'SLIP_CLIENT_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientNm2(String slipClientNm2) {
        registerModifiedProperty("slipClientNm2");
        _slipClientNm2 = slipClientNm2;
    }

    /**
     * [get] SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿CD
     * @return The value of the column 'SLIP_SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipShapeCd() {
        checkSpecifiedProperty("slipShapeCd");
        return convertEmptyToNull(_slipShapeCd);
    }

    /**
     * [set] SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd} <br>
     * 荷姿CD
     * @param slipShapeCd The value of the column 'SLIP_SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipShapeCd(String slipShapeCd) {
        registerModifiedProperty("slipShapeCd");
        _slipShapeCd = slipShapeCd;
    }

    /**
     * [get] SLIP_ITEM_NM1: {varchar(255)} <br>
     * 品名1
     * @return The value of the column 'SLIP_ITEM_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm1() {
        checkSpecifiedProperty("slipItemNm1");
        return convertEmptyToNull(_slipItemNm1);
    }

    /**
     * [set] SLIP_ITEM_NM1: {varchar(255)} <br>
     * 品名1
     * @param slipItemNm1 The value of the column 'SLIP_ITEM_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm1(String slipItemNm1) {
        registerModifiedProperty("slipItemNm1");
        _slipItemNm1 = slipItemNm1;
    }

    /**
     * [get] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @return The value of the column 'SLIP_ITEM_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm2() {
        checkSpecifiedProperty("slipItemNm2");
        return convertEmptyToNull(_slipItemNm2);
    }

    /**
     * [set] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @param slipItemNm2 The value of the column 'SLIP_ITEM_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm2(String slipItemNm2) {
        registerModifiedProperty("slipItemNm2");
        _slipItemNm2 = slipItemNm2;
    }

    /**
     * [get] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @return The value of the column 'SLIP_ITEM_NM3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm3() {
        checkSpecifiedProperty("slipItemNm3");
        return convertEmptyToNull(_slipItemNm3);
    }

    /**
     * [set] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @param slipItemNm3 The value of the column 'SLIP_ITEM_NM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm3(String slipItemNm3) {
        registerModifiedProperty("slipItemNm3");
        _slipItemNm3 = slipItemNm3;
    }

    /**
     * [get] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @return The value of the column 'SLIP_ITEM_NM4'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm4() {
        checkSpecifiedProperty("slipItemNm4");
        return convertEmptyToNull(_slipItemNm4);
    }

    /**
     * [set] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @param slipItemNm4 The value of the column 'SLIP_ITEM_NM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm4(String slipItemNm4) {
        registerModifiedProperty("slipItemNm4");
        _slipItemNm4 = slipItemNm4;
    }

    /**
     * [get] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @return The value of the column 'SLIP_ITEM_NM5'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm5() {
        checkSpecifiedProperty("slipItemNm5");
        return convertEmptyToNull(_slipItemNm5);
    }

    /**
     * [set] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @param slipItemNm5 The value of the column 'SLIP_ITEM_NM5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm5(String slipItemNm5) {
        registerModifiedProperty("slipItemNm5");
        _slipItemNm5 = slipItemNm5;
    }

    /**
     * [get] TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @return The value of the column 'TRANSPORT_TYPE_SPEED'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportTypeSpeed() {
        checkSpecifiedProperty("transportTypeSpeed");
        return convertEmptyToNull(_transportTypeSpeed);
    }

    /**
     * [set] TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed} <br>
     * 便種(スピードで選択)
     * @param transportTypeSpeed The value of the column 'TRANSPORT_TYPE_SPEED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportTypeSpeed(String transportTypeSpeed) {
        registerModifiedProperty("transportTypeSpeed");
        _transportTypeSpeed = transportTypeSpeed;
    }

    /**
     * [get] TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @return The value of the column 'TRANSPORT_TYPE_ITEM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportTypeItem() {
        checkSpecifiedProperty("transportTypeItem");
        return convertEmptyToNull(_transportTypeItem);
    }

    /**
     * [set] TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem} <br>
     * 便種(商品)
     * @param transportTypeItem The value of the column 'TRANSPORT_TYPE_ITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportTypeItem(String transportTypeItem) {
        registerModifiedProperty("transportTypeItem");
        _transportTypeItem = transportTypeItem;
    }

    /**
     * [get] SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @return The value of the column 'SETTLEMENT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSettlementType() {
        checkSpecifiedProperty("settlementType");
        return convertEmptyToNull(_settlementType);
    }

    /**
     * [set] SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType} <br>
     * 決済種別
     * @param settlementType The value of the column 'SETTLEMENT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSettlementType(String settlementType) {
        registerModifiedProperty("settlementType");
        _settlementType = settlementType;
    }

    /**
     * [get] SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール1
     * @return The value of the column 'SEAL_TYPE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSealType1() {
        checkSpecifiedProperty("sealType1");
        return convertEmptyToNull(_sealType1);
    }

    /**
     * [set] SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール1
     * @param sealType1 The value of the column 'SEAL_TYPE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSealType1(String sealType1) {
        registerModifiedProperty("sealType1");
        _sealType1 = sealType1;
    }

    /**
     * [get] SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール2
     * @return The value of the column 'SEAL_TYPE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSealType2() {
        checkSpecifiedProperty("sealType2");
        return convertEmptyToNull(_sealType2);
    }

    /**
     * [set] SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール2
     * @param sealType2 The value of the column 'SEAL_TYPE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSealType2(String sealType2) {
        registerModifiedProperty("sealType2");
        _sealType2 = sealType2;
    }

    /**
     * [get] SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール3
     * @return The value of the column 'SEAL_TYPE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSealType3() {
        checkSpecifiedProperty("sealType3");
        return convertEmptyToNull(_sealType3);
    }

    /**
     * [set] SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType} <br>
     * 指定シール3
     * @param sealType3 The value of the column 'SEAL_TYPE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSealType3(String sealType3) {
        registerModifiedProperty("sealType3");
        _sealType3 = sealType3;
    }

    /**
     * [get] COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @return The value of the column 'COD_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodCls() {
        checkSpecifiedProperty("codCls");
        return convertEmptyToNull(_codCls);
    }

    /**
     * [set] COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls} <br>
     * 元着区分
     * @param codCls The value of the column 'COD_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodCls(String codCls) {
        registerModifiedProperty("codCls");
        _codCls = codCls;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 発店CD
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 発店CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] API_OKURI_CODE: {varchar(30)} <br>
     * WebAPI送り状CD
     * @return The value of the column 'API_OKURI_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiOkuriCode() {
        checkSpecifiedProperty("apiOkuriCode");
        return convertEmptyToNull(_apiOkuriCode);
    }

    /**
     * [set] API_OKURI_CODE: {varchar(30)} <br>
     * WebAPI送り状CD
     * @param apiOkuriCode The value of the column 'API_OKURI_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiOkuriCode(String apiOkuriCode) {
        registerModifiedProperty("apiOkuriCode");
        _apiOkuriCode = apiOkuriCode;
    }

    /**
     * [get] API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種CD
     * @return The value of the column 'API_BINSYU_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiBinsyuCode() {
        checkSpecifiedProperty("apiBinsyuCode");
        return convertEmptyToNull(_apiBinsyuCode);
    }

    /**
     * [set] API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode} <br>
     * WebAPI便種CD
     * @param apiBinsyuCode The value of the column 'API_BINSYU_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiBinsyuCode(String apiBinsyuCode) {
        registerModifiedProperty("apiBinsyuCode");
        _apiBinsyuCode = apiBinsyuCode;
    }

    /**
     * [get] API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @return The value of the column 'API_DAIBIKI_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiDaibikiFlg() {
        checkSpecifiedProperty("apiDaibikiFlg");
        return convertEmptyToNull(_apiDaibikiFlg);
    }

    /**
     * [set] API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg} <br>
     * WebAPI代引フラグ
     * @param apiDaibikiFlg The value of the column 'API_DAIBIKI_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiDaibikiFlg(String apiDaibikiFlg) {
        registerModifiedProperty("apiDaibikiFlg");
        _apiDaibikiFlg = apiDaibikiFlg;
    }

    /**
     * [get] API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @return The value of the column 'API_DAIBIKI_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiDaibikiType() {
        checkSpecifiedProperty("apiDaibikiType");
        return convertEmptyToNull(_apiDaibikiType);
    }

    /**
     * [set] API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType} <br>
     * WebAPI代引支払方法区分
     * @param apiDaibikiType The value of the column 'API_DAIBIKI_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiDaibikiType(String apiDaibikiType) {
        registerModifiedProperty("apiDaibikiType");
        _apiDaibikiType = apiDaibikiType;
    }

    /**
     * [get] API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD1
     * @return The value of the column 'API_WEIGHT_CD_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiWeightCd1() {
        checkSpecifiedProperty("apiWeightCd1");
        return convertEmptyToNull(_apiWeightCd1);
    }

    /**
     * [set] API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD1
     * @param apiWeightCd1 The value of the column 'API_WEIGHT_CD_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiWeightCd1(String apiWeightCd1) {
        registerModifiedProperty("apiWeightCd1");
        _apiWeightCd1 = apiWeightCd1;
    }

    /**
     * [get] API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD2
     * @return The value of the column 'API_WEIGHT_CD_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiWeightCd2() {
        checkSpecifiedProperty("apiWeightCd2");
        return convertEmptyToNull(_apiWeightCd2);
    }

    /**
     * [set] API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd} <br>
     * WebAPI重量CD2
     * @param apiWeightCd2 The value of the column 'API_WEIGHT_CD_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiWeightCd2(String apiWeightCd2) {
        registerModifiedProperty("apiWeightCd2");
        _apiWeightCd2 = apiWeightCd2;
    }

    /**
     * [get] API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @return The value of the column 'API_EIDOME_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getApiEidomeFlg() {
        checkSpecifiedProperty("apiEidomeFlg");
        return convertEmptyToNull(_apiEidomeFlg);
    }

    /**
     * [set] API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg} <br>
     * WebAPI営止フラグ
     * @param apiEidomeFlg The value of the column 'API_EIDOME_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setApiEidomeFlg(String apiEidomeFlg) {
        registerModifiedProperty("apiEidomeFlg");
        _apiEidomeFlg = apiEidomeFlg;
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
