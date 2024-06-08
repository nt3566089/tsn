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
 * The entity of M_CARRIER_SLIP_YUPK as TABLE. <br>
 * ゆうパック送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [column]
 *     CARRIER_SLIP_YUPK_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, POST_TYPE, COOL_TYPE, COD_TYPE, CARRIER_TYPE, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_NM1, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_MAIL, NO_UPSIDE_DOWN_CLS, NO_STOCK_CLS, SLIP_PRODUCT_SIZE_CLS, SLIP_PRODUCT_NO, SLIP_ITEM_NM, SHIP_RESERVE_DATA_MARK, DELI_CERT_PRE_YEARS, SEND_NM, PRODUCT_TYPE_CODE, POST_BIZ_CARD_CUSTOMER_NO, SHIPPING_COMPANY_CODE, SHIPMENT_CODE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer table]
 *     M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCodType, bClassDtlByCoolType, bClassDtlByDelFlg, bClassDtlByNoStockCls, bClassDtlByNoUpsideDownCls, bClassDtlByPostType
 *
 * [referrer property]
 *     mDeliveryCourseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long carrierSlipYupkId = entity.getCarrierSlipYupkId();
 * Long centerId = entity.getCenterId();
 * String tagType = entity.getTagType();
 * String tagNm = entity.getTagNm();
 * String characterCd = entity.getCharacterCd();
 * String postType = entity.getPostType();
 * String coolType = entity.getCoolType();
 * String codType = entity.getCodType();
 * String carrierType = entity.getCarrierType();
 * String slipClientZipCd = entity.getSlipClientZipCd();
 * String slipClientAddress1 = entity.getSlipClientAddress1();
 * String slipClientAddress2 = entity.getSlipClientAddress2();
 * String slipClientAddress3 = entity.getSlipClientAddress3();
 * String slipClientNm1 = entity.getSlipClientNm1();
 * String slipClientTelNo = entity.getSlipClientTelNo();
 * String slipClientMail = entity.getSlipClientMail();
 * String noUpsideDownCls = entity.getNoUpsideDownCls();
 * String noStockCls = entity.getNoStockCls();
 * String slipProductSizeCls = entity.getSlipProductSizeCls();
 * String slipProductNo = entity.getSlipProductNo();
 * String slipItemNm = entity.getSlipItemNm();
 * String shipReserveDataMark = entity.getShipReserveDataMark();
 * Long deliCertPreYears = entity.getDeliCertPreYears();
 * String sendNm = entity.getSendNm();
 * String productTypeCode = entity.getProductTypeCode();
 * String postBizCardCustomerNo = entity.getPostBizCardCustomerNo();
 * String shippingCompanyCode = entity.getShippingCompanyCode();
 * String shipmentCode = entity.getShipmentCode();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCarrierSlipYupkId(carrierSlipYupkId);
 * entity.setCenterId(centerId);
 * entity.setTagType(tagType);
 * entity.setTagNm(tagNm);
 * entity.setCharacterCd(characterCd);
 * entity.setPostType(postType);
 * entity.setCoolType(coolType);
 * entity.setCodType(codType);
 * entity.setCarrierType(carrierType);
 * entity.setSlipClientZipCd(slipClientZipCd);
 * entity.setSlipClientAddress1(slipClientAddress1);
 * entity.setSlipClientAddress2(slipClientAddress2);
 * entity.setSlipClientAddress3(slipClientAddress3);
 * entity.setSlipClientNm1(slipClientNm1);
 * entity.setSlipClientTelNo(slipClientTelNo);
 * entity.setSlipClientMail(slipClientMail);
 * entity.setNoUpsideDownCls(noUpsideDownCls);
 * entity.setNoStockCls(noStockCls);
 * entity.setSlipProductSizeCls(slipProductSizeCls);
 * entity.setSlipProductNo(slipProductNo);
 * entity.setSlipItemNm(slipItemNm);
 * entity.setShipReserveDataMark(shipReserveDataMark);
 * entity.setDeliCertPreYears(deliCertPreYears);
 * entity.setSendNm(sendNm);
 * entity.setProductTypeCode(productTypeCode);
 * entity.setPostBizCardCustomerNo(postBizCardCustomerNo);
 * entity.setShippingCompanyCode(shippingCompanyCode);
 * entity.setShipmentCode(shipmentCode);
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
public abstract class BsMCarrierSlipYupk extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _carrierSlipYupkId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** TAG_TYPE: {+UQ, NotNull, varchar(30)} */
    protected String _tagType;

    /** TAG_NM: {varchar(60)} */
    protected String _tagNm;

    /** CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} */
    protected String _characterCd;

    /** POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} */
    protected String _postType;

    /** COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} */
    protected String _coolType;

    /** COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} */
    protected String _codType;

    /** CARRIER_TYPE: {varchar(30)} */
    protected String _carrierType;

    /** SLIP_CLIENT_ZIP_CD: {varchar(30)} */
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS1: {varchar(255)} */
    protected String _slipClientAddress1;

    /** SLIP_CLIENT_ADDRESS2: {varchar(255)} */
    protected String _slipClientAddress2;

    /** SLIP_CLIENT_ADDRESS3: {varchar(255)} */
    protected String _slipClientAddress3;

    /** SLIP_CLIENT_NM1: {varchar(255)} */
    protected String _slipClientNm1;

    /** SLIP_CLIENT_TEL_NO: {varchar(30)} */
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_MAIL: {varchar(255)} */
    protected String _slipClientMail;

    /** NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} */
    protected String _noUpsideDownCls;

    /** NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} */
    protected String _noStockCls;

    /** SLIP_PRODUCT_SIZE_CLS: {varchar(30)} */
    protected String _slipProductSizeCls;

    /** SLIP_PRODUCT_NO: {varchar(30)} */
    protected String _slipProductNo;

    /** SLIP_ITEM_NM: {varchar(255)} */
    protected String _slipItemNm;

    /** SHIP_RESERVE_DATA_MARK: {varchar(30)} */
    protected String _shipReserveDataMark;

    /** DELI_CERT_PRE_YEARS: {bigint(19)} */
    protected Long _deliCertPreYears;

    /** SEND_NM: {varchar(60)} */
    protected String _sendNm;

    /** PRODUCT_TYPE_CODE: {varchar(30)} */
    protected String _productTypeCode;

    /** POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} */
    protected String _postBizCardCustomerNo;

    /** SHIPPING_COMPANY_CODE: {varchar(30)} */
    protected String _shippingCompanyCode;

    /** SHIPMENT_CODE: {varchar(30)} */
    protected String _shipmentCode;

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
        return "M_CARRIER_SLIP_YUPK";
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
        if (_carrierSlipYupkId == null) { return false; }
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
     * Get the value of postType as the classification of PostType. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PostType getPostTypeAsPostType() {
        return CDef.PostType.codeOf(getPostType());
    }

    /**
     * Set the value of postType as the classification of PostType. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPostTypeAsPostType(CDef.PostType cdef) {
        setPostType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of coolType as the classification of CoolType. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CoolType getCoolTypeAsCoolType() {
        return CDef.CoolType.codeOf(getCoolType());
    }

    /**
     * Set the value of coolType as the classification of CoolType. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCoolTypeAsCoolType(CDef.CoolType cdef) {
        setCoolType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of codType as the classification of CodType. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引文字
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CodType getCodTypeAsCodType() {
        return CDef.CodType.codeOf(getCodType());
    }

    /**
     * Set the value of codType as the classification of CodType. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引文字
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCodTypeAsCodType(CDef.CodType cdef) {
        setCodType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of noUpsideDownCls as the classification of NoUpsideDownCls. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.NoUpsideDownCls getNoUpsideDownClsAsNoUpsideDownCls() {
        return CDef.NoUpsideDownCls.codeOf(getNoUpsideDownCls());
    }

    /**
     * Set the value of noUpsideDownCls as the classification of NoUpsideDownCls. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNoUpsideDownClsAsNoUpsideDownCls(CDef.NoUpsideDownCls cdef) {
        setNoUpsideDownCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of noStockCls as the classification of NoStockCls. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.NoStockCls getNoStockClsAsNoStockCls() {
        return CDef.NoStockCls.codeOf(getNoStockCls());
    }

    /**
     * Set the value of noStockCls as the classification of NoStockCls. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNoStockClsAsNoStockCls(CDef.NoStockCls cdef) {
        setNoStockCls(cdef != null ? cdef.code() : null);
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
     * Set the value of postType as $0 (0). <br>
     * $0: ゆうパック
     */
    public void setPostType_$0() {
        setPostTypeAsPostType(CDef.PostType.$0);
    }

    /**
     * Set the value of postType as $1 (1). <br>
     * $1: ゆうメール
     */
    public void setPostType_$1() {
        setPostTypeAsPostType(CDef.PostType.$1);
    }

    /**
     * Set the value of postType as $2 (2). <br>
     * $2: 通常(定型)
     */
    public void setPostType_$2() {
        setPostTypeAsPostType(CDef.PostType.$2);
    }

    /**
     * Set the value of postType as $3 (3). <br>
     * $3: 通常(定型外)
     */
    public void setPostType_$3() {
        setPostTypeAsPostType(CDef.PostType.$3);
    }

    /**
     * Set the value of postType as $5 (5). <br>
     * $5: ポスパケット
     */
    public void setPostType_$5() {
        setPostTypeAsPostType(CDef.PostType.$5);
    }

    /**
     * Set the value of postType as $6 (6). <br>
     * $6: 宛名ラベル
     */
    public void setPostType_$6() {
        setPostTypeAsPostType(CDef.PostType.$6);
    }

    /**
     * Set the value of coolType as $0 (0). <br>
     * $0: 保冷なし
     */
    public void setCoolType_$0() {
        setCoolTypeAsCoolType(CDef.CoolType.$0);
    }

    /**
     * Set the value of coolType as $1 (1). <br>
     * $1: チルド
     */
    public void setCoolType_$1() {
        setCoolTypeAsCoolType(CDef.CoolType.$1);
    }

    /**
     * Set the value of coolType as $2 (2). <br>
     * $2: 冷凍
     */
    public void setCoolType_$2() {
        setCoolTypeAsCoolType(CDef.CoolType.$2);
    }

    /**
     * Set the value of codType as $0 (0). <br>
     * $0: 元払
     */
    public void setCodType_$0() {
        setCodTypeAsCodType(CDef.CodType.$0);
    }

    /**
     * Set the value of codType as $1 (1). <br>
     * $1: 着払
     */
    public void setCodType_$1() {
        setCodTypeAsCodType(CDef.CodType.$1);
    }

    /**
     * Set the value of codType as $2 (2). <br>
     * $2: 代引
     */
    public void setCodType_$2() {
        setCodTypeAsCodType(CDef.CodType.$2);
    }

    /**
     * Set the value of noUpsideDownCls as $0 (0). <br>
     * $0: 無
     */
    public void setNoUpsideDownCls_$0() {
        setNoUpsideDownClsAsNoUpsideDownCls(CDef.NoUpsideDownCls.$0);
    }

    /**
     * Set the value of noUpsideDownCls as $1 (1). <br>
     * $1: 有
     */
    public void setNoUpsideDownCls_$1() {
        setNoUpsideDownClsAsNoUpsideDownCls(CDef.NoUpsideDownCls.$1);
    }

    /**
     * Set the value of noStockCls as $0 (0). <br>
     * $0: 無
     */
    public void setNoStockCls_$0() {
        setNoStockClsAsNoStockCls(CDef.NoStockCls.$0);
    }

    /**
     * Set the value of noStockCls as $1 (1). <br>
     * $1: 有
     */
    public void setNoStockCls_$1() {
        setNoStockClsAsNoStockCls(CDef.NoStockCls.$1);
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
     * Is the value of postType $0? <br>
     * $0: ゆうパック
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPostType$0() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.equals(CDef.PostType.$0) : false;
    }

    /**
     * Is the value of postType $1? <br>
     * $1: ゆうメール
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPostType$1() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.equals(CDef.PostType.$1) : false;
    }

    /**
     * Is the value of postType $2? <br>
     * $2: 通常(定型)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPostType$2() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.equals(CDef.PostType.$2) : false;
    }

    /**
     * Is the value of postType $3? <br>
     * $3: 通常(定型外)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPostType$3() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.equals(CDef.PostType.$3) : false;
    }

    /**
     * Is the value of postType $5? <br>
     * $5: ポスパケット
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPostType$5() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.equals(CDef.PostType.$5) : false;
    }

    /**
     * Is the value of postType $6? <br>
     * $6: 宛名ラベル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPostType$6() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.equals(CDef.PostType.$6) : false;
    }

    /**
     * Is the value of coolType $0? <br>
     * $0: 保冷なし
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCoolType$0() {
        CDef.CoolType cdef = getCoolTypeAsCoolType();
        return cdef != null ? cdef.equals(CDef.CoolType.$0) : false;
    }

    /**
     * Is the value of coolType $1? <br>
     * $1: チルド
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCoolType$1() {
        CDef.CoolType cdef = getCoolTypeAsCoolType();
        return cdef != null ? cdef.equals(CDef.CoolType.$1) : false;
    }

    /**
     * Is the value of coolType $2? <br>
     * $2: 冷凍
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCoolType$2() {
        CDef.CoolType cdef = getCoolTypeAsCoolType();
        return cdef != null ? cdef.equals(CDef.CoolType.$2) : false;
    }

    /**
     * Is the value of codType $0? <br>
     * $0: 元払
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodType$0() {
        CDef.CodType cdef = getCodTypeAsCodType();
        return cdef != null ? cdef.equals(CDef.CodType.$0) : false;
    }

    /**
     * Is the value of codType $1? <br>
     * $1: 着払
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodType$1() {
        CDef.CodType cdef = getCodTypeAsCodType();
        return cdef != null ? cdef.equals(CDef.CodType.$1) : false;
    }

    /**
     * Is the value of codType $2? <br>
     * $2: 代引
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodType$2() {
        CDef.CodType cdef = getCodTypeAsCodType();
        return cdef != null ? cdef.equals(CDef.CodType.$2) : false;
    }

    /**
     * Is the value of noUpsideDownCls $0? <br>
     * $0: 無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoUpsideDownCls$0() {
        CDef.NoUpsideDownCls cdef = getNoUpsideDownClsAsNoUpsideDownCls();
        return cdef != null ? cdef.equals(CDef.NoUpsideDownCls.$0) : false;
    }

    /**
     * Is the value of noUpsideDownCls $1? <br>
     * $1: 有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoUpsideDownCls$1() {
        CDef.NoUpsideDownCls cdef = getNoUpsideDownClsAsNoUpsideDownCls();
        return cdef != null ? cdef.equals(CDef.NoUpsideDownCls.$1) : false;
    }

    /**
     * Is the value of noStockCls $0? <br>
     * $0: 無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoStockCls$0() {
        CDef.NoStockCls cdef = getNoStockClsAsNoStockCls();
        return cdef != null ? cdef.equals(CDef.NoStockCls.$0) : false;
    }

    /**
     * Is the value of noStockCls $1? <br>
     * $1: 有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoStockCls$1() {
        CDef.NoStockCls cdef = getNoStockClsAsNoStockCls();
        return cdef != null ? cdef.equals(CDef.NoStockCls.$1) : false;
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
     * Get the value of the column 'postType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPostTypeName() {
        CDef.PostType cdef = getPostTypeAsPostType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'coolType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCoolTypeName() {
        CDef.CoolType cdef = getCoolTypeAsCoolType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'codType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCodTypeName() {
        CDef.CodType cdef = getCodTypeAsCodType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'noUpsideDownCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getNoUpsideDownClsName() {
        CDef.NoUpsideDownCls cdef = getNoUpsideDownClsAsNoUpsideDownCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'noStockCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getNoStockClsName() {
        CDef.NoStockCls cdef = getNoStockClsAsNoStockCls();
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

    /** B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'. */
    protected BClassDtl _bClassDtlByCodType;

    /**
     * [get] B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'. <br>
     * @return The entity of foreign property 'BClassDtlByCodType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCodType() {
        return _bClassDtlByCodType;
    }

    /**
     * [set] B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'.
     * @param bClassDtlByCodType The entity of foreign property 'BClassDtlByCodType'. (NullAllowed)
     */
    public void setBClassDtlByCodType(BClassDtl bClassDtlByCodType) {
        _bClassDtlByCodType = bClassDtlByCodType;
    }

    /** B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'. */
    protected BClassDtl _bClassDtlByCoolType;

    /**
     * [get] B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'. <br>
     * @return The entity of foreign property 'BClassDtlByCoolType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCoolType() {
        return _bClassDtlByCoolType;
    }

    /**
     * [set] B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'.
     * @param bClassDtlByCoolType The entity of foreign property 'BClassDtlByCoolType'. (NullAllowed)
     */
    public void setBClassDtlByCoolType(BClassDtl bClassDtlByCoolType) {
        _bClassDtlByCoolType = bClassDtlByCoolType;
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

    /** B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'. */
    protected BClassDtl _bClassDtlByNoStockCls;

    /**
     * [get] B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'. <br>
     * @return The entity of foreign property 'BClassDtlByNoStockCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByNoStockCls() {
        return _bClassDtlByNoStockCls;
    }

    /**
     * [set] B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'.
     * @param bClassDtlByNoStockCls The entity of foreign property 'BClassDtlByNoStockCls'. (NullAllowed)
     */
    public void setBClassDtlByNoStockCls(BClassDtl bClassDtlByNoStockCls) {
        _bClassDtlByNoStockCls = bClassDtlByNoStockCls;
    }

    /** B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'. */
    protected BClassDtl _bClassDtlByNoUpsideDownCls;

    /**
     * [get] B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'. <br>
     * @return The entity of foreign property 'BClassDtlByNoUpsideDownCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByNoUpsideDownCls() {
        return _bClassDtlByNoUpsideDownCls;
    }

    /**
     * [set] B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'.
     * @param bClassDtlByNoUpsideDownCls The entity of foreign property 'BClassDtlByNoUpsideDownCls'. (NullAllowed)
     */
    public void setBClassDtlByNoUpsideDownCls(BClassDtl bClassDtlByNoUpsideDownCls) {
        _bClassDtlByNoUpsideDownCls = bClassDtlByNoUpsideDownCls;
    }

    /** B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'. */
    protected BClassDtl _bClassDtlByPostType;

    /**
     * [get] B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'. <br>
     * @return The entity of foreign property 'BClassDtlByPostType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPostType() {
        return _bClassDtlByPostType;
    }

    /**
     * [set] B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'.
     * @param bClassDtlByPostType The entity of foreign property 'BClassDtlByPostType'. (NullAllowed)
     */
    public void setBClassDtlByPostType(BClassDtl bClassDtlByPostType) {
        _bClassDtlByPostType = bClassDtlByPostType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'. */
    protected List<MDeliveryCourse> _mDeliveryCourseList;

    /**
     * [get] M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
     * @return The entity list of referrer property 'MDeliveryCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDeliveryCourse> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = newReferrerList(); }
        return _mDeliveryCourseList;
    }

    /**
     * [set] M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
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
        if (obj instanceof BsMCarrierSlipYupk) {
            BsMCarrierSlipYupk other = (BsMCarrierSlipYupk)obj;
            if (!xSV(_carrierSlipYupkId, other._carrierSlipYupkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _carrierSlipYupkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_bClassDtlByCharacterCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCharacterCd, "bClassDtlByCharacterCd")); }
        if (_bClassDtlByCodType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCodType, "bClassDtlByCodType")); }
        if (_bClassDtlByCoolType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCoolType, "bClassDtlByCoolType")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByNoStockCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByNoStockCls, "bClassDtlByNoStockCls")); }
        if (_bClassDtlByNoUpsideDownCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByNoUpsideDownCls, "bClassDtlByNoUpsideDownCls")); }
        if (_bClassDtlByPostType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPostType, "bClassDtlByPostType")); }
        if (_mDeliveryCourseList != null) { for (MDeliveryCourse et : _mDeliveryCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDeliveryCourseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_carrierSlipYupkId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_tagType));
        sb.append(dm).append(xfND(_tagNm));
        sb.append(dm).append(xfND(_characterCd));
        sb.append(dm).append(xfND(_postType));
        sb.append(dm).append(xfND(_coolType));
        sb.append(dm).append(xfND(_codType));
        sb.append(dm).append(xfND(_carrierType));
        sb.append(dm).append(xfND(_slipClientZipCd));
        sb.append(dm).append(xfND(_slipClientAddress1));
        sb.append(dm).append(xfND(_slipClientAddress2));
        sb.append(dm).append(xfND(_slipClientAddress3));
        sb.append(dm).append(xfND(_slipClientNm1));
        sb.append(dm).append(xfND(_slipClientTelNo));
        sb.append(dm).append(xfND(_slipClientMail));
        sb.append(dm).append(xfND(_noUpsideDownCls));
        sb.append(dm).append(xfND(_noStockCls));
        sb.append(dm).append(xfND(_slipProductSizeCls));
        sb.append(dm).append(xfND(_slipProductNo));
        sb.append(dm).append(xfND(_slipItemNm));
        sb.append(dm).append(xfND(_shipReserveDataMark));
        sb.append(dm).append(xfND(_deliCertPreYears));
        sb.append(dm).append(xfND(_sendNm));
        sb.append(dm).append(xfND(_productTypeCode));
        sb.append(dm).append(xfND(_postBizCardCustomerNo));
        sb.append(dm).append(xfND(_shippingCompanyCode));
        sb.append(dm).append(xfND(_shipmentCode));
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
        if (_bClassDtlByCharacterCd != null)
        { sb.append(dm).append("bClassDtlByCharacterCd"); }
        if (_bClassDtlByCodType != null)
        { sb.append(dm).append("bClassDtlByCodType"); }
        if (_bClassDtlByCoolType != null)
        { sb.append(dm).append("bClassDtlByCoolType"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByNoStockCls != null)
        { sb.append(dm).append("bClassDtlByNoStockCls"); }
        if (_bClassDtlByNoUpsideDownCls != null)
        { sb.append(dm).append("bClassDtlByNoUpsideDownCls"); }
        if (_bClassDtlByPostType != null)
        { sb.append(dm).append("bClassDtlByPostType"); }
        if (_mDeliveryCourseList != null && !_mDeliveryCourseList.isEmpty())
        { sb.append(dm).append("mDeliveryCourseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrierSlipYupk clone() {
        return (MCarrierSlipYupk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YUPK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierSlipYupkId() {
        checkSpecifiedProperty("carrierSlipYupkId");
        return _carrierSlipYupkId;
    }

    /**
     * [set] CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @param carrierSlipYupkId The value of the column 'CARRIER_SLIP_YUPK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierSlipYupkId(Long carrierSlipYupkId) {
        registerModifiedProperty("carrierSlipYupkId");
        _carrierSlipYupkId = carrierSlipYupkId;
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
     * [get] POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @return The value of the column 'POST_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostType() {
        checkSpecifiedProperty("postType");
        return convertEmptyToNull(_postType);
    }

    /**
     * [set] POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType} <br>
     * 郵便種別
     * @param postType The value of the column 'POST_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostType(String postType) {
        registerModifiedProperty("postType");
        _postType = postType;
    }

    /**
     * [get] COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @return The value of the column 'COOL_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCoolType() {
        checkSpecifiedProperty("coolType");
        return convertEmptyToNull(_coolType);
    }

    /**
     * [set] COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType} <br>
     * 保冷種別
     * @param coolType The value of the column 'COOL_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCoolType(String coolType) {
        registerModifiedProperty("coolType");
        _coolType = coolType;
    }

    /**
     * [get] COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引
     * @return The value of the column 'COD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodType() {
        checkSpecifiedProperty("codType");
        return convertEmptyToNull(_codType);
    }

    /**
     * [set] COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType} <br>
     * 元／着払／代引
     * @param codType The value of the column 'COD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodType(String codType) {
        registerModifiedProperty("codType");
        _codType = codType;
    }

    /**
     * [get] CARRIER_TYPE: {varchar(30)} <br>
     * 送り状種別
     * @return The value of the column 'CARRIER_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierType() {
        checkSpecifiedProperty("carrierType");
        return convertEmptyToNull(_carrierType);
    }

    /**
     * [set] CARRIER_TYPE: {varchar(30)} <br>
     * 送り状種別
     * @param carrierType The value of the column 'CARRIER_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierType(String carrierType) {
        registerModifiedProperty("carrierType");
        _carrierType = carrierType;
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
     * [get] SLIP_CLIENT_ADDRESS3: {varchar(255)} <br>
     * ご依頼主住所3
     * @return The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress3() {
        checkSpecifiedProperty("slipClientAddress3");
        return convertEmptyToNull(_slipClientAddress3);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS3: {varchar(255)} <br>
     * ご依頼主住所3
     * @param slipClientAddress3 The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress3(String slipClientAddress3) {
        registerModifiedProperty("slipClientAddress3");
        _slipClientAddress3 = slipClientAddress3;
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
     * [get] SLIP_CLIENT_MAIL: {varchar(255)} <br>
     * ご依頼主メールアドレス1
     * @return The value of the column 'SLIP_CLIENT_MAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientMail() {
        checkSpecifiedProperty("slipClientMail");
        return convertEmptyToNull(_slipClientMail);
    }

    /**
     * [set] SLIP_CLIENT_MAIL: {varchar(255)} <br>
     * ご依頼主メールアドレス1
     * @param slipClientMail The value of the column 'SLIP_CLIENT_MAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientMail(String slipClientMail) {
        registerModifiedProperty("slipClientMail");
        _slipClientMail = slipClientMail;
    }

    /**
     * [get] NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @return The value of the column 'NO_UPSIDE_DOWN_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoUpsideDownCls() {
        checkSpecifiedProperty("noUpsideDownCls");
        return convertEmptyToNull(_noUpsideDownCls);
    }

    /**
     * [set] NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls} <br>
     * 逆さま厳禁区分
     * @param noUpsideDownCls The value of the column 'NO_UPSIDE_DOWN_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoUpsideDownCls(String noUpsideDownCls) {
        registerModifiedProperty("noUpsideDownCls");
        _noUpsideDownCls = noUpsideDownCls;
    }

    /**
     * [get] NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @return The value of the column 'NO_STOCK_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoStockCls() {
        checkSpecifiedProperty("noStockCls");
        return convertEmptyToNull(_noStockCls);
    }

    /**
     * [set] NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls} <br>
     * 下積み厳禁区分
     * @param noStockCls The value of the column 'NO_STOCK_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoStockCls(String noStockCls) {
        registerModifiedProperty("noStockCls");
        _noStockCls = noStockCls;
    }

    /**
     * [get] SLIP_PRODUCT_SIZE_CLS: {varchar(30)} <br>
     * 商品サイズ区分
     * @return The value of the column 'SLIP_PRODUCT_SIZE_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipProductSizeCls() {
        checkSpecifiedProperty("slipProductSizeCls");
        return convertEmptyToNull(_slipProductSizeCls);
    }

    /**
     * [set] SLIP_PRODUCT_SIZE_CLS: {varchar(30)} <br>
     * 商品サイズ区分
     * @param slipProductSizeCls The value of the column 'SLIP_PRODUCT_SIZE_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipProductSizeCls(String slipProductSizeCls) {
        registerModifiedProperty("slipProductSizeCls");
        _slipProductSizeCls = slipProductSizeCls;
    }

    /**
     * [get] SLIP_PRODUCT_NO: {varchar(30)} <br>
     * 商品番号(明細)
     * @return The value of the column 'SLIP_PRODUCT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipProductNo() {
        checkSpecifiedProperty("slipProductNo");
        return convertEmptyToNull(_slipProductNo);
    }

    /**
     * [set] SLIP_PRODUCT_NO: {varchar(30)} <br>
     * 商品番号(明細)
     * @param slipProductNo The value of the column 'SLIP_PRODUCT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipProductNo(String slipProductNo) {
        registerModifiedProperty("slipProductNo");
        _slipProductNo = slipProductNo;
    }

    /**
     * [get] SLIP_ITEM_NM: {varchar(255)} <br>
     * 品名(明細)
     * @return The value of the column 'SLIP_ITEM_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm() {
        checkSpecifiedProperty("slipItemNm");
        return convertEmptyToNull(_slipItemNm);
    }

    /**
     * [set] SLIP_ITEM_NM: {varchar(255)} <br>
     * 品名(明細)
     * @param slipItemNm The value of the column 'SLIP_ITEM_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm(String slipItemNm) {
        registerModifiedProperty("slipItemNm");
        _slipItemNm = slipItemNm;
    }

    /**
     * [get] SHIP_RESERVE_DATA_MARK: {varchar(30)} <br>
     * 発送予約データマーク
     * @return The value of the column 'SHIP_RESERVE_DATA_MARK'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipReserveDataMark() {
        checkSpecifiedProperty("shipReserveDataMark");
        return convertEmptyToNull(_shipReserveDataMark);
    }

    /**
     * [set] SHIP_RESERVE_DATA_MARK: {varchar(30)} <br>
     * 発送予約データマーク
     * @param shipReserveDataMark The value of the column 'SHIP_RESERVE_DATA_MARK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipReserveDataMark(String shipReserveDataMark) {
        registerModifiedProperty("shipReserveDataMark");
        _shipReserveDataMark = shipReserveDataMark;
    }

    /**
     * [get] DELI_CERT_PRE_YEARS: {bigint(19)} <br>
     * 配達証保存年数
     * @return The value of the column 'DELI_CERT_PRE_YEARS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliCertPreYears() {
        checkSpecifiedProperty("deliCertPreYears");
        return _deliCertPreYears;
    }

    /**
     * [set] DELI_CERT_PRE_YEARS: {bigint(19)} <br>
     * 配達証保存年数
     * @param deliCertPreYears The value of the column 'DELI_CERT_PRE_YEARS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliCertPreYears(Long deliCertPreYears) {
        registerModifiedProperty("deliCertPreYears");
        _deliCertPreYears = deliCertPreYears;
    }

    /**
     * [get] SEND_NM: {varchar(60)} <br>
     * 発店名称
     * @return The value of the column 'SEND_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendNm() {
        checkSpecifiedProperty("sendNm");
        return convertEmptyToNull(_sendNm);
    }

    /**
     * [set] SEND_NM: {varchar(60)} <br>
     * 発店名称
     * @param sendNm The value of the column 'SEND_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendNm(String sendNm) {
        registerModifiedProperty("sendNm");
        _sendNm = sendNm;
    }

    /**
     * [get] PRODUCT_TYPE_CODE: {varchar(30)} <br>
     * 商品種別CD
     * @return The value of the column 'PRODUCT_TYPE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductTypeCode() {
        checkSpecifiedProperty("productTypeCode");
        return convertEmptyToNull(_productTypeCode);
    }

    /**
     * [set] PRODUCT_TYPE_CODE: {varchar(30)} <br>
     * 商品種別CD
     * @param productTypeCode The value of the column 'PRODUCT_TYPE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductTypeCode(String productTypeCode) {
        registerModifiedProperty("productTypeCode");
        _productTypeCode = productTypeCode;
    }

    /**
     * [get] POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} <br>
     * ゆうびんビズカードお客さま番号
     * @return The value of the column 'POST_BIZ_CARD_CUSTOMER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostBizCardCustomerNo() {
        checkSpecifiedProperty("postBizCardCustomerNo");
        return convertEmptyToNull(_postBizCardCustomerNo);
    }

    /**
     * [set] POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)} <br>
     * ゆうびんビズカードお客さま番号
     * @param postBizCardCustomerNo The value of the column 'POST_BIZ_CARD_CUSTOMER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostBizCardCustomerNo(String postBizCardCustomerNo) {
        registerModifiedProperty("postBizCardCustomerNo");
        _postBizCardCustomerNo = postBizCardCustomerNo;
    }

    /**
     * [get] SHIPPING_COMPANY_CODE: {varchar(30)} <br>
     * 発送会社CD
     * @return The value of the column 'SHIPPING_COMPANY_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingCompanyCode() {
        checkSpecifiedProperty("shippingCompanyCode");
        return convertEmptyToNull(_shippingCompanyCode);
    }

    /**
     * [set] SHIPPING_COMPANY_CODE: {varchar(30)} <br>
     * 発送会社CD
     * @param shippingCompanyCode The value of the column 'SHIPPING_COMPANY_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingCompanyCode(String shippingCompanyCode) {
        registerModifiedProperty("shippingCompanyCode");
        _shippingCompanyCode = shippingCompanyCode;
    }

    /**
     * [get] SHIPMENT_CODE: {varchar(30)} <br>
     * 発送局CD
     * @return The value of the column 'SHIPMENT_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentCode() {
        checkSpecifiedProperty("shipmentCode");
        return convertEmptyToNull(_shipmentCode);
    }

    /**
     * [set] SHIPMENT_CODE: {varchar(30)} <br>
     * 発送局CD
     * @param shipmentCode The value of the column 'SHIPMENT_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentCode(String shipmentCode) {
        registerModifiedProperty("shipmentCode");
        _shipmentCode = shipmentCode;
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
