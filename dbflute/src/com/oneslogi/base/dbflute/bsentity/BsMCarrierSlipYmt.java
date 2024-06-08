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
 * The entity of M_CARRIER_SLIP_YMT as TABLE. <br>
 * ヤマト送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_YMT_ID
 *
 * [column]
 *     CARRIER_SLIP_YMT_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_TYPE, COOL_CLS, HONORIFIC, PACKING_SHOW_FLG, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_ADDRESS4, SLIP_CLIENT_NM, SLIP_ITEM_CD1, SLIP_ITEM_NM1, SLIP_ITEM_CD2, SLIP_ITEM_NM2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, BILLING_CUSTOMER_CD, FARE_NO, SEND_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YMT_ID
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
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCoolCls, bClassDtlByDelFlg, bClassDtlByPackingShowFlg, bClassDtlBySlipType
 *
 * [referrer property]
 *     mDeliveryCourseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long carrierSlipYmtId = entity.getCarrierSlipYmtId();
 * Long centerId = entity.getCenterId();
 * String tagType = entity.getTagType();
 * String tagNm = entity.getTagNm();
 * String characterCd = entity.getCharacterCd();
 * String slipType = entity.getSlipType();
 * String coolCls = entity.getCoolCls();
 * String honorific = entity.getHonorific();
 * String packingShowFlg = entity.getPackingShowFlg();
 * String slipClientTelNo = entity.getSlipClientTelNo();
 * String slipClientZipCd = entity.getSlipClientZipCd();
 * String slipClientAddress1 = entity.getSlipClientAddress1();
 * String slipClientAddress2 = entity.getSlipClientAddress2();
 * String slipClientAddress3 = entity.getSlipClientAddress3();
 * String slipClientAddress4 = entity.getSlipClientAddress4();
 * String slipClientNm = entity.getSlipClientNm();
 * String slipItemCd1 = entity.getSlipItemCd1();
 * String slipItemNm1 = entity.getSlipItemNm1();
 * String slipItemCd2 = entity.getSlipItemCd2();
 * String slipItemNm2 = entity.getSlipItemNm2();
 * String freightHandling1 = entity.getFreightHandling1();
 * String freightHandling2 = entity.getFreightHandling2();
 * String article = entity.getArticle();
 * String billingCustomerCd = entity.getBillingCustomerCd();
 * String fareNo = entity.getFareNo();
 * String sendCd = entity.getSendCd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCarrierSlipYmtId(carrierSlipYmtId);
 * entity.setCenterId(centerId);
 * entity.setTagType(tagType);
 * entity.setTagNm(tagNm);
 * entity.setCharacterCd(characterCd);
 * entity.setSlipType(slipType);
 * entity.setCoolCls(coolCls);
 * entity.setHonorific(honorific);
 * entity.setPackingShowFlg(packingShowFlg);
 * entity.setSlipClientTelNo(slipClientTelNo);
 * entity.setSlipClientZipCd(slipClientZipCd);
 * entity.setSlipClientAddress1(slipClientAddress1);
 * entity.setSlipClientAddress2(slipClientAddress2);
 * entity.setSlipClientAddress3(slipClientAddress3);
 * entity.setSlipClientAddress4(slipClientAddress4);
 * entity.setSlipClientNm(slipClientNm);
 * entity.setSlipItemCd1(slipItemCd1);
 * entity.setSlipItemNm1(slipItemNm1);
 * entity.setSlipItemCd2(slipItemCd2);
 * entity.setSlipItemNm2(slipItemNm2);
 * entity.setFreightHandling1(freightHandling1);
 * entity.setFreightHandling2(freightHandling2);
 * entity.setArticle(article);
 * entity.setBillingCustomerCd(billingCustomerCd);
 * entity.setFareNo(fareNo);
 * entity.setSendCd(sendCd);
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
public abstract class BsMCarrierSlipYmt extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _carrierSlipYmtId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** TAG_TYPE: {+UQ, NotNull, varchar(30)} */
    protected String _tagType;

    /** TAG_NM: {varchar(60)} */
    protected String _tagNm;

    /** CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd} */
    protected String _characterCd;

    /** SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} */
    protected String _slipType;

    /** COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} */
    protected String _coolCls;

    /** HONORIFIC: {varchar(30)} */
    protected String _honorific;

    /** PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} */
    protected String _packingShowFlg;

    /** SLIP_CLIENT_TEL_NO: {varchar(30)} */
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_ZIP_CD: {varchar(30)} */
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS1: {varchar(60)} */
    protected String _slipClientAddress1;

    /** SLIP_CLIENT_ADDRESS2: {varchar(60)} */
    protected String _slipClientAddress2;

    /** SLIP_CLIENT_ADDRESS3: {varchar(60)} */
    protected String _slipClientAddress3;

    /** SLIP_CLIENT_ADDRESS4: {varchar(60)} */
    protected String _slipClientAddress4;

    /** SLIP_CLIENT_NM: {varchar(60)} */
    protected String _slipClientNm;

    /** SLIP_ITEM_CD1: {varchar(30)} */
    protected String _slipItemCd1;

    /** SLIP_ITEM_NM1: {varchar(60)} */
    protected String _slipItemNm1;

    /** SLIP_ITEM_CD2: {varchar(30)} */
    protected String _slipItemCd2;

    /** SLIP_ITEM_NM2: {varchar(60)} */
    protected String _slipItemNm2;

    /** FREIGHT_HANDLING1: {varchar(60)} */
    protected String _freightHandling1;

    /** FREIGHT_HANDLING2: {varchar(60)} */
    protected String _freightHandling2;

    /** ARTICLE: {varchar(255)} */
    protected String _article;

    /** BILLING_CUSTOMER_CD: {varchar(30)} */
    protected String _billingCustomerCd;

    /** FARE_NO: {varchar(30)} */
    protected String _fareNo;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

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
        return "M_CARRIER_SLIP_YMT";
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
        if (_carrierSlipYmtId == null) { return false; }
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
     * Get the value of slipType as the classification of SlipType. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SlipType getSlipTypeAsSlipType() {
        return CDef.SlipType.codeOf(getSlipType());
    }

    /**
     * Set the value of slipType as the classification of SlipType. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSlipTypeAsSlipType(CDef.SlipType cdef) {
        setSlipType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of coolCls as the classification of CoolCls. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CoolCls getCoolClsAsCoolCls() {
        return CDef.CoolCls.codeOf(getCoolCls());
    }

    /**
     * Set the value of coolCls as the classification of CoolCls. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCoolClsAsCoolCls(CDef.CoolCls cdef) {
        setCoolCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of packingShowFlg as the classification of PackingShowFlg. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingShowFlg getPackingShowFlgAsPackingShowFlg() {
        return CDef.PackingShowFlg.codeOf(getPackingShowFlg());
    }

    /**
     * Set the value of packingShowFlg as the classification of PackingShowFlg. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingShowFlgAsPackingShowFlg(CDef.PackingShowFlg cdef) {
        setPackingShowFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of slipType as $0 (0). <br>
     * $0: 発払い
     */
    public void setSlipType_$0() {
        setSlipTypeAsSlipType(CDef.SlipType.$0);
    }

    /**
     * Set the value of slipType as $2 (2). <br>
     * $2: コレクト
     */
    public void setSlipType_$2() {
        setSlipTypeAsSlipType(CDef.SlipType.$2);
    }

    /**
     * Set the value of slipType as $3 (3). <br>
     * $3: メール便
     */
    public void setSlipType_$3() {
        setSlipTypeAsSlipType(CDef.SlipType.$3);
    }

    /**
     * Set the value of slipType as $4 (4). <br>
     * $4: タイム
     */
    public void setSlipType_$4() {
        setSlipTypeAsSlipType(CDef.SlipType.$4);
    }

    /**
     * Set the value of slipType as $5 (5). <br>
     * $5: 着払い
     */
    public void setSlipType_$5() {
        setSlipTypeAsSlipType(CDef.SlipType.$5);
    }

    /**
     * Set the value of slipType as $6 (6). <br>
     * $6: メール便速達サービス
     */
    public void setSlipType_$6() {
        setSlipTypeAsSlipType(CDef.SlipType.$6);
    }

    /**
     * Set the value of coolCls as $0 (0). <br>
     * $0: 通常
     */
    public void setCoolCls_$0() {
        setCoolClsAsCoolCls(CDef.CoolCls.$0);
    }

    /**
     * Set the value of coolCls as $1 (1). <br>
     * $1: クール冷凍
     */
    public void setCoolCls_$1() {
        setCoolClsAsCoolCls(CDef.CoolCls.$1);
    }

    /**
     * Set the value of coolCls as $2 (2). <br>
     * $2: クール冷蔵
     */
    public void setCoolCls_$2() {
        setCoolClsAsCoolCls(CDef.CoolCls.$2);
    }

    /**
     * Set the value of packingShowFlg as $0 (0). <br>
     * $0: 表示する
     */
    public void setPackingShowFlg_$0() {
        setPackingShowFlgAsPackingShowFlg(CDef.PackingShowFlg.$0);
    }

    /**
     * Set the value of packingShowFlg as $1 (1). <br>
     * $1: 表示しない
     */
    public void setPackingShowFlg_$1() {
        setPackingShowFlgAsPackingShowFlg(CDef.PackingShowFlg.$1);
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
     * Is the value of slipType $0? <br>
     * $0: 発払い
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipType$0() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.equals(CDef.SlipType.$0) : false;
    }

    /**
     * Is the value of slipType $2? <br>
     * $2: コレクト
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipType$2() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.equals(CDef.SlipType.$2) : false;
    }

    /**
     * Is the value of slipType $3? <br>
     * $3: メール便
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipType$3() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.equals(CDef.SlipType.$3) : false;
    }

    /**
     * Is the value of slipType $4? <br>
     * $4: タイム
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipType$4() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.equals(CDef.SlipType.$4) : false;
    }

    /**
     * Is the value of slipType $5? <br>
     * $5: 着払い
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipType$5() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.equals(CDef.SlipType.$5) : false;
    }

    /**
     * Is the value of slipType $6? <br>
     * $6: メール便速達サービス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipType$6() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.equals(CDef.SlipType.$6) : false;
    }

    /**
     * Is the value of coolCls $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCoolCls$0() {
        CDef.CoolCls cdef = getCoolClsAsCoolCls();
        return cdef != null ? cdef.equals(CDef.CoolCls.$0) : false;
    }

    /**
     * Is the value of coolCls $1? <br>
     * $1: クール冷凍
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCoolCls$1() {
        CDef.CoolCls cdef = getCoolClsAsCoolCls();
        return cdef != null ? cdef.equals(CDef.CoolCls.$1) : false;
    }

    /**
     * Is the value of coolCls $2? <br>
     * $2: クール冷蔵
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCoolCls$2() {
        CDef.CoolCls cdef = getCoolClsAsCoolCls();
        return cdef != null ? cdef.equals(CDef.CoolCls.$2) : false;
    }

    /**
     * Is the value of packingShowFlg $0? <br>
     * $0: 表示する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingShowFlg$0() {
        CDef.PackingShowFlg cdef = getPackingShowFlgAsPackingShowFlg();
        return cdef != null ? cdef.equals(CDef.PackingShowFlg.$0) : false;
    }

    /**
     * Is the value of packingShowFlg $1? <br>
     * $1: 表示しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingShowFlg$1() {
        CDef.PackingShowFlg cdef = getPackingShowFlgAsPackingShowFlg();
        return cdef != null ? cdef.equals(CDef.PackingShowFlg.$1) : false;
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
     * Get the value of the column 'slipType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSlipTypeName() {
        CDef.SlipType cdef = getSlipTypeAsSlipType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'coolCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCoolClsName() {
        CDef.CoolCls cdef = getCoolClsAsCoolCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'packingShowFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingShowFlgName() {
        CDef.PackingShowFlg cdef = getPackingShowFlgAsPackingShowFlg();
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

    /** B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'. */
    protected BClassDtl _bClassDtlByCoolCls;

    /**
     * [get] B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'. <br>
     * @return The entity of foreign property 'BClassDtlByCoolCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCoolCls() {
        return _bClassDtlByCoolCls;
    }

    /**
     * [set] B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'.
     * @param bClassDtlByCoolCls The entity of foreign property 'BClassDtlByCoolCls'. (NullAllowed)
     */
    public void setBClassDtlByCoolCls(BClassDtl bClassDtlByCoolCls) {
        _bClassDtlByCoolCls = bClassDtlByCoolCls;
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

    /** B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'. */
    protected BClassDtl _bClassDtlByPackingShowFlg;

    /**
     * [get] B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingShowFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingShowFlg() {
        return _bClassDtlByPackingShowFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'.
     * @param bClassDtlByPackingShowFlg The entity of foreign property 'BClassDtlByPackingShowFlg'. (NullAllowed)
     */
    public void setBClassDtlByPackingShowFlg(BClassDtl bClassDtlByPackingShowFlg) {
        _bClassDtlByPackingShowFlg = bClassDtlByPackingShowFlg;
    }

    /** B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'. */
    protected BClassDtl _bClassDtlBySlipType;

    /**
     * [get] B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'. <br>
     * @return The entity of foreign property 'BClassDtlBySlipType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySlipType() {
        return _bClassDtlBySlipType;
    }

    /**
     * [set] B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'.
     * @param bClassDtlBySlipType The entity of foreign property 'BClassDtlBySlipType'. (NullAllowed)
     */
    public void setBClassDtlBySlipType(BClassDtl bClassDtlBySlipType) {
        _bClassDtlBySlipType = bClassDtlBySlipType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseList'. */
    protected List<MDeliveryCourse> _mDeliveryCourseList;

    /**
     * [get] M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseList'.
     * @return The entity list of referrer property 'MDeliveryCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDeliveryCourse> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = newReferrerList(); }
        return _mDeliveryCourseList;
    }

    /**
     * [set] M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseList'.
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
        if (obj instanceof BsMCarrierSlipYmt) {
            BsMCarrierSlipYmt other = (BsMCarrierSlipYmt)obj;
            if (!xSV(_carrierSlipYmtId, other._carrierSlipYmtId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _carrierSlipYmtId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_bClassDtlByCharacterCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCharacterCd, "bClassDtlByCharacterCd")); }
        if (_bClassDtlByCoolCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCoolCls, "bClassDtlByCoolCls")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByPackingShowFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingShowFlg, "bClassDtlByPackingShowFlg")); }
        if (_bClassDtlBySlipType != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySlipType, "bClassDtlBySlipType")); }
        if (_mDeliveryCourseList != null) { for (MDeliveryCourse et : _mDeliveryCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDeliveryCourseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_carrierSlipYmtId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_tagType));
        sb.append(dm).append(xfND(_tagNm));
        sb.append(dm).append(xfND(_characterCd));
        sb.append(dm).append(xfND(_slipType));
        sb.append(dm).append(xfND(_coolCls));
        sb.append(dm).append(xfND(_honorific));
        sb.append(dm).append(xfND(_packingShowFlg));
        sb.append(dm).append(xfND(_slipClientTelNo));
        sb.append(dm).append(xfND(_slipClientZipCd));
        sb.append(dm).append(xfND(_slipClientAddress1));
        sb.append(dm).append(xfND(_slipClientAddress2));
        sb.append(dm).append(xfND(_slipClientAddress3));
        sb.append(dm).append(xfND(_slipClientAddress4));
        sb.append(dm).append(xfND(_slipClientNm));
        sb.append(dm).append(xfND(_slipItemCd1));
        sb.append(dm).append(xfND(_slipItemNm1));
        sb.append(dm).append(xfND(_slipItemCd2));
        sb.append(dm).append(xfND(_slipItemNm2));
        sb.append(dm).append(xfND(_freightHandling1));
        sb.append(dm).append(xfND(_freightHandling2));
        sb.append(dm).append(xfND(_article));
        sb.append(dm).append(xfND(_billingCustomerCd));
        sb.append(dm).append(xfND(_fareNo));
        sb.append(dm).append(xfND(_sendCd));
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
        if (_bClassDtlByCoolCls != null)
        { sb.append(dm).append("bClassDtlByCoolCls"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByPackingShowFlg != null)
        { sb.append(dm).append("bClassDtlByPackingShowFlg"); }
        if (_bClassDtlBySlipType != null)
        { sb.append(dm).append("bClassDtlBySlipType"); }
        if (_mDeliveryCourseList != null && !_mDeliveryCourseList.isEmpty())
        { sb.append(dm).append("mDeliveryCourseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrierSlipYmt clone() {
        return (MCarrierSlipYmt)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YMT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierSlipYmtId() {
        checkSpecifiedProperty("carrierSlipYmtId");
        return _carrierSlipYmtId;
    }

    /**
     * [set] CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 送り状定義ID
     * @param carrierSlipYmtId The value of the column 'CARRIER_SLIP_YMT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierSlipYmtId(Long carrierSlipYmtId) {
        registerModifiedProperty("carrierSlipYmtId");
        _carrierSlipYmtId = carrierSlipYmtId;
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
     * [get] SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @return The value of the column 'SLIP_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipType() {
        checkSpecifiedProperty("slipType");
        return convertEmptyToNull(_slipType);
    }

    /**
     * [set] SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType} <br>
     * 送り状種別
     * @param slipType The value of the column 'SLIP_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipType(String slipType) {
        registerModifiedProperty("slipType");
        _slipType = slipType;
    }

    /**
     * [get] COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @return The value of the column 'COOL_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getCoolCls() {
        checkSpecifiedProperty("coolCls");
        return convertEmptyToNull(_coolCls);
    }

    /**
     * [set] COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls} <br>
     * クール区分
     * @param coolCls The value of the column 'COOL_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCoolCls(String coolCls) {
        registerModifiedProperty("coolCls");
        _coolCls = coolCls;
    }

    /**
     * [get] HONORIFIC: {varchar(30)} <br>
     * 敬称
     * @return The value of the column 'HONORIFIC'. (NullAllowed even if selected: for no constraint)
     */
    public String getHonorific() {
        checkSpecifiedProperty("honorific");
        return convertEmptyToNull(_honorific);
    }

    /**
     * [set] HONORIFIC: {varchar(30)} <br>
     * 敬称
     * @param honorific The value of the column 'HONORIFIC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHonorific(String honorific) {
        registerModifiedProperty("honorific");
        _honorific = honorific;
    }

    /**
     * [get] PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @return The value of the column 'PACKING_SHOW_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingShowFlg() {
        checkSpecifiedProperty("packingShowFlg");
        return convertEmptyToNull(_packingShowFlg);
    }

    /**
     * [set] PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg} <br>
     * 個数口表示フラグ
     * @param packingShowFlg The value of the column 'PACKING_SHOW_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingShowFlg(String packingShowFlg) {
        registerModifiedProperty("packingShowFlg");
        _packingShowFlg = packingShowFlg;
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
     * [get] SLIP_CLIENT_ADDRESS1: {varchar(60)} <br>
     * ご依頼主住所(都道府県)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress1() {
        checkSpecifiedProperty("slipClientAddress1");
        return convertEmptyToNull(_slipClientAddress1);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS1: {varchar(60)} <br>
     * ご依頼主住所(都道府県)
     * @param slipClientAddress1 The value of the column 'SLIP_CLIENT_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress1(String slipClientAddress1) {
        registerModifiedProperty("slipClientAddress1");
        _slipClientAddress1 = slipClientAddress1;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS2: {varchar(60)} <br>
     * ご依頼主住所(市区郡町村)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress2() {
        checkSpecifiedProperty("slipClientAddress2");
        return convertEmptyToNull(_slipClientAddress2);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS2: {varchar(60)} <br>
     * ご依頼主住所(市区郡町村)
     * @param slipClientAddress2 The value of the column 'SLIP_CLIENT_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress2(String slipClientAddress2) {
        registerModifiedProperty("slipClientAddress2");
        _slipClientAddress2 = slipClientAddress2;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS3: {varchar(60)} <br>
     * ご依頼主住所(町域)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress3() {
        checkSpecifiedProperty("slipClientAddress3");
        return convertEmptyToNull(_slipClientAddress3);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS3: {varchar(60)} <br>
     * ご依頼主住所(町域)
     * @param slipClientAddress3 The value of the column 'SLIP_CLIENT_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress3(String slipClientAddress3) {
        registerModifiedProperty("slipClientAddress3");
        _slipClientAddress3 = slipClientAddress3;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS4: {varchar(60)} <br>
     * ご依頼主住所(アパートマンション名)
     * @return The value of the column 'SLIP_CLIENT_ADDRESS4'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientAddress4() {
        checkSpecifiedProperty("slipClientAddress4");
        return convertEmptyToNull(_slipClientAddress4);
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS4: {varchar(60)} <br>
     * ご依頼主住所(アパートマンション名)
     * @param slipClientAddress4 The value of the column 'SLIP_CLIENT_ADDRESS4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientAddress4(String slipClientAddress4) {
        registerModifiedProperty("slipClientAddress4");
        _slipClientAddress4 = slipClientAddress4;
    }

    /**
     * [get] SLIP_CLIENT_NM: {varchar(60)} <br>
     * ご依頼主名
     * @return The value of the column 'SLIP_CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipClientNm() {
        checkSpecifiedProperty("slipClientNm");
        return convertEmptyToNull(_slipClientNm);
    }

    /**
     * [set] SLIP_CLIENT_NM: {varchar(60)} <br>
     * ご依頼主名
     * @param slipClientNm The value of the column 'SLIP_CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipClientNm(String slipClientNm) {
        registerModifiedProperty("slipClientNm");
        _slipClientNm = slipClientNm;
    }

    /**
     * [get] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @return The value of the column 'SLIP_ITEM_CD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemCd1() {
        checkSpecifiedProperty("slipItemCd1");
        return convertEmptyToNull(_slipItemCd1);
    }

    /**
     * [set] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @param slipItemCd1 The value of the column 'SLIP_ITEM_CD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemCd1(String slipItemCd1) {
        registerModifiedProperty("slipItemCd1");
        _slipItemCd1 = slipItemCd1;
    }

    /**
     * [get] SLIP_ITEM_NM1: {varchar(60)} <br>
     * 品名1
     * @return The value of the column 'SLIP_ITEM_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm1() {
        checkSpecifiedProperty("slipItemNm1");
        return convertEmptyToNull(_slipItemNm1);
    }

    /**
     * [set] SLIP_ITEM_NM1: {varchar(60)} <br>
     * 品名1
     * @param slipItemNm1 The value of the column 'SLIP_ITEM_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm1(String slipItemNm1) {
        registerModifiedProperty("slipItemNm1");
        _slipItemNm1 = slipItemNm1;
    }

    /**
     * [get] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @return The value of the column 'SLIP_ITEM_CD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemCd2() {
        checkSpecifiedProperty("slipItemCd2");
        return convertEmptyToNull(_slipItemCd2);
    }

    /**
     * [set] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @param slipItemCd2 The value of the column 'SLIP_ITEM_CD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemCd2(String slipItemCd2) {
        registerModifiedProperty("slipItemCd2");
        _slipItemCd2 = slipItemCd2;
    }

    /**
     * [get] SLIP_ITEM_NM2: {varchar(60)} <br>
     * 品名2
     * @return The value of the column 'SLIP_ITEM_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm2() {
        checkSpecifiedProperty("slipItemNm2");
        return convertEmptyToNull(_slipItemNm2);
    }

    /**
     * [set] SLIP_ITEM_NM2: {varchar(60)} <br>
     * 品名2
     * @param slipItemNm2 The value of the column 'SLIP_ITEM_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm2(String slipItemNm2) {
        registerModifiedProperty("slipItemNm2");
        _slipItemNm2 = slipItemNm2;
    }

    /**
     * [get] FREIGHT_HANDLING1: {varchar(60)} <br>
     * 荷扱い1
     * @return The value of the column 'FREIGHT_HANDLING1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightHandling1() {
        checkSpecifiedProperty("freightHandling1");
        return convertEmptyToNull(_freightHandling1);
    }

    /**
     * [set] FREIGHT_HANDLING1: {varchar(60)} <br>
     * 荷扱い1
     * @param freightHandling1 The value of the column 'FREIGHT_HANDLING1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightHandling1(String freightHandling1) {
        registerModifiedProperty("freightHandling1");
        _freightHandling1 = freightHandling1;
    }

    /**
     * [get] FREIGHT_HANDLING2: {varchar(60)} <br>
     * 荷扱い2
     * @return The value of the column 'FREIGHT_HANDLING2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightHandling2() {
        checkSpecifiedProperty("freightHandling2");
        return convertEmptyToNull(_freightHandling2);
    }

    /**
     * [set] FREIGHT_HANDLING2: {varchar(60)} <br>
     * 荷扱い2
     * @param freightHandling2 The value of the column 'FREIGHT_HANDLING2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightHandling2(String freightHandling2) {
        registerModifiedProperty("freightHandling2");
        _freightHandling2 = freightHandling2;
    }

    /**
     * [get] ARTICLE: {varchar(255)} <br>
     * 記事
     * @return The value of the column 'ARTICLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticle() {
        checkSpecifiedProperty("article");
        return convertEmptyToNull(_article);
    }

    /**
     * [set] ARTICLE: {varchar(255)} <br>
     * 記事
     * @param article The value of the column 'ARTICLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticle(String article) {
        registerModifiedProperty("article");
        _article = article;
    }

    /**
     * [get] BILLING_CUSTOMER_CD: {varchar(30)} <br>
     * ご請求先顧客CD
     * @return The value of the column 'BILLING_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillingCustomerCd() {
        checkSpecifiedProperty("billingCustomerCd");
        return convertEmptyToNull(_billingCustomerCd);
    }

    /**
     * [set] BILLING_CUSTOMER_CD: {varchar(30)} <br>
     * ご請求先顧客CD
     * @param billingCustomerCd The value of the column 'BILLING_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillingCustomerCd(String billingCustomerCd) {
        registerModifiedProperty("billingCustomerCd");
        _billingCustomerCd = billingCustomerCd;
    }

    /**
     * [get] FARE_NO: {varchar(30)} <br>
     * 運賃管理番号
     * @return The value of the column 'FARE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFareNo() {
        checkSpecifiedProperty("fareNo");
        return convertEmptyToNull(_fareNo);
    }

    /**
     * [set] FARE_NO: {varchar(30)} <br>
     * 運賃管理番号
     * @param fareNo The value of the column 'FARE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFareNo(String fareNo) {
        registerModifiedProperty("fareNo");
        _fareNo = fareNo;
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
