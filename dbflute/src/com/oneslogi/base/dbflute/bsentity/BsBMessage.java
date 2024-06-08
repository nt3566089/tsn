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
 * The entity of B_MESSAGE as TABLE. <br>
 * メッセージマスタ
 * <pre>
 * [primary-key]
 *     MESSAGE_ID
 *
 * [column]
 *     MESSAGE_ID, MESSAGE_CD, MESSAGE_NM, MESSAGE_ABBR, MESSAGE_TYPE, SYSTEM_TYPE, CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MESSAGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CULTURE, B_CLASS_DTL(ByMessageType), M_HT_MESSAGE(AsOne)
 *
 * [referrer table]
 *     M_HT_MESSAGE
 *
 * [foreign property]
 *     bCulture, bClassDtlByMessageType, bClassDtlBySystemType, mHtMessageAsOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long messageId = entity.getMessageId();
 * String messageCd = entity.getMessageCd();
 * String messageNm = entity.getMessageNm();
 * String messageAbbr = entity.getMessageAbbr();
 * String messageType = entity.getMessageType();
 * String systemType = entity.getSystemType();
 * Long cultureId = entity.getCultureId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMessageId(messageId);
 * entity.setMessageCd(messageCd);
 * entity.setMessageNm(messageNm);
 * entity.setMessageAbbr(messageAbbr);
 * entity.setMessageType(messageType);
 * entity.setSystemType(systemType);
 * entity.setCultureId(cultureId);
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
public abstract class BsBMessage extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _messageId;

    /** MESSAGE_CD: {UQ+, varchar(100)} */
    protected String _messageCd;

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** MESSAGE_ABBR: {varchar(4000)} */
    protected String _messageAbbr;

    /** MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} */
    protected String _messageType;

    /** SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} */
    protected String _systemType;

    /** CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} */
    protected Long _cultureId;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
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
        return "B_MESSAGE";
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
        if (_messageId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param messageCd : UQ+, varchar(100). (NotNull)
     * @param cultureId : +UQ, IX, NotNull, bigint(19), FK to B_CULTURE. (NotNull)
     */
    public void uniqueBy(String messageCd, Long cultureId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("messageCd");
        __uniqueDrivenProperties.addPropertyName("cultureId");
        setMessageCd(messageCd);setCultureId(cultureId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of messageType as the classification of MessageType. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MessageType getMessageTypeAsMessageType() {
        return CDef.MessageType.codeOf(getMessageType());
    }

    /**
     * Set the value of messageType as the classification of MessageType. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMessageTypeAsMessageType(CDef.MessageType cdef) {
        setMessageType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of systemType as the classification of SystemType. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SystemType getSystemTypeAsSystemType() {
        return CDef.SystemType.codeOf(getSystemType());
    }

    /**
     * Set the value of systemType as the classification of SystemType. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSystemTypeAsSystemType(CDef.SystemType cdef) {
        setSystemType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
     * Set the value of messageType as $confirm (confirm). <br>
     * $confirm: 確認
     */
    public void setMessageType_$confirm() {
        setMessageTypeAsMessageType(CDef.MessageType.$confirm);
    }

    /**
     * Set the value of messageType as $error (error). <br>
     * $error: エラー
     */
    public void setMessageType_$error() {
        setMessageTypeAsMessageType(CDef.MessageType.$error);
    }

    /**
     * Set the value of messageType as $info (info). <br>
     * $info: 情報
     */
    public void setMessageType_$info() {
        setMessageTypeAsMessageType(CDef.MessageType.$info);
    }

    /**
     * Set the value of messageType as $warn (warn). <br>
     * $warn: 警告
     */
    public void setMessageType_$warn() {
        setMessageTypeAsMessageType(CDef.MessageType.$warn);
    }

    /**
     * Set the value of systemType as $base (base). <br>
     * $base: 基盤
     */
    public void setSystemType_$base() {
        setSystemTypeAsSystemType(CDef.SystemType.$base);
    }

    /**
     * Set the value of systemType as $wms (wms). <br>
     * $wms: WMS
     */
    public void setSystemType_$wms() {
        setSystemTypeAsSystemType(CDef.SystemType.$wms);
    }

    /**
     * Set the value of systemType as $tsn (tsn). <br>
     * $tsn: tsn
     */
    public void setSystemType_$tsn() {
        setSystemTypeAsSystemType(CDef.SystemType.$tsn);
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
     * Is the value of messageType $confirm? <br>
     * $confirm: 確認
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMessageType$confirm() {
        CDef.MessageType cdef = getMessageTypeAsMessageType();
        return cdef != null ? cdef.equals(CDef.MessageType.$confirm) : false;
    }

    /**
     * Is the value of messageType $error? <br>
     * $error: エラー
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMessageType$error() {
        CDef.MessageType cdef = getMessageTypeAsMessageType();
        return cdef != null ? cdef.equals(CDef.MessageType.$error) : false;
    }

    /**
     * Is the value of messageType $info? <br>
     * $info: 情報
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMessageType$info() {
        CDef.MessageType cdef = getMessageTypeAsMessageType();
        return cdef != null ? cdef.equals(CDef.MessageType.$info) : false;
    }

    /**
     * Is the value of messageType $warn? <br>
     * $warn: 警告
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMessageType$warn() {
        CDef.MessageType cdef = getMessageTypeAsMessageType();
        return cdef != null ? cdef.equals(CDef.MessageType.$warn) : false;
    }

    /**
     * Is the value of systemType $base? <br>
     * $base: 基盤
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemType$base() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
        return cdef != null ? cdef.equals(CDef.SystemType.$base) : false;
    }

    /**
     * Is the value of systemType $wms? <br>
     * $wms: WMS
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemType$wms() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
        return cdef != null ? cdef.equals(CDef.SystemType.$wms) : false;
    }

    /**
     * Is the value of systemType $tsn? <br>
     * $tsn: tsn
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSystemType$tsn() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
        return cdef != null ? cdef.equals(CDef.SystemType.$tsn) : false;
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
     * Get the value of the column 'messageType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMessageTypeName() {
        CDef.MessageType cdef = getMessageTypeAsMessageType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'systemType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSystemTypeName() {
        CDef.SystemType cdef = getSystemTypeAsSystemType();
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
    /** B_CULTURE by my CULTURE_ID, named 'BCulture'. */
    protected BCulture _bCulture;

    /**
     * [get] B_CULTURE by my CULTURE_ID, named 'BCulture'. <br>
     * @return The entity of foreign property 'BCulture'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCulture() {
        return _bCulture;
    }

    /**
     * [set] B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param bCulture The entity of foreign property 'BCulture'. (NullAllowed)
     */
    public void setBCulture(BCulture bCulture) {
        _bCulture = bCulture;
    }

    /** B_CLASS_DTL by my MESSAGE_TYPE, named 'BClassDtlByMessageType'. */
    protected BClassDtl _bClassDtlByMessageType;

    /**
     * [get] B_CLASS_DTL by my MESSAGE_TYPE, named 'BClassDtlByMessageType'. <br>
     * @return The entity of foreign property 'BClassDtlByMessageType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMessageType() {
        return _bClassDtlByMessageType;
    }

    /**
     * [set] B_CLASS_DTL by my MESSAGE_TYPE, named 'BClassDtlByMessageType'.
     * @param bClassDtlByMessageType The entity of foreign property 'BClassDtlByMessageType'. (NullAllowed)
     */
    public void setBClassDtlByMessageType(BClassDtl bClassDtlByMessageType) {
        _bClassDtlByMessageType = bClassDtlByMessageType;
    }

    /** B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'. */
    protected BClassDtl _bClassDtlBySystemType;

    /**
     * [get] B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'. <br>
     * @return The entity of foreign property 'BClassDtlBySystemType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySystemType() {
        return _bClassDtlBySystemType;
    }

    /**
     * [set] B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @param bClassDtlBySystemType The entity of foreign property 'BClassDtlBySystemType'. (NullAllowed)
     */
    public void setBClassDtlBySystemType(BClassDtl bClassDtlBySystemType) {
        _bClassDtlBySystemType = bClassDtlBySystemType;
    }

    /** M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'. */
    protected MHtMessage _mHtMessageAsOne;

    /**
     * [get] M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MHtMessageAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MHtMessage getMHtMessageAsOne() {
        return _mHtMessageAsOne;
    }

    /**
     * [set] M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * @param MHtMessageAsOne The entity of foreign property(referrer-as-one) 'MHtMessageAsOne'. (NullAllowed)
     */
    public void setMHtMessageAsOne(MHtMessage MHtMessageAsOne) {
        _mHtMessageAsOne = MHtMessageAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBMessage) {
            BsBMessage other = (BsBMessage)obj;
            if (!xSV(_messageId, other._messageId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _messageId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bCulture != null)
        { sb.append(li).append(xbRDS(_bCulture, "bCulture")); }
        if (_bClassDtlByMessageType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMessageType, "bClassDtlByMessageType")); }
        if (_bClassDtlBySystemType != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySystemType, "bClassDtlBySystemType")); }
        if (_mHtMessageAsOne != null)
        { sb.append(li).append(xbRDS(_mHtMessageAsOne, "mHtMessageAsOne")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_messageId));
        sb.append(dm).append(xfND(_messageCd));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_messageAbbr));
        sb.append(dm).append(xfND(_messageType));
        sb.append(dm).append(xfND(_systemType));
        sb.append(dm).append(xfND(_cultureId));
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
        if (_bCulture != null)
        { sb.append(dm).append("bCulture"); }
        if (_bClassDtlByMessageType != null)
        { sb.append(dm).append("bClassDtlByMessageType"); }
        if (_bClassDtlBySystemType != null)
        { sb.append(dm).append("bClassDtlBySystemType"); }
        if (_mHtMessageAsOne != null)
        { sb.append(dm).append("mHtMessageAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BMessage clone() {
        return (BMessage)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メッセージID
     * @return The value of the column 'MESSAGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMessageId() {
        checkSpecifiedProperty("messageId");
        return _messageId;
    }

    /**
     * [set] MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メッセージID
     * @param messageId The value of the column 'MESSAGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMessageId(Long messageId) {
        registerModifiedProperty("messageId");
        _messageId = messageId;
    }

    /**
     * [get] MESSAGE_CD: {UQ+, varchar(100)} <br>
     * メッセージCD
     * @return The value of the column 'MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageCd() {
        checkSpecifiedProperty("messageCd");
        return convertEmptyToNull(_messageCd);
    }

    /**
     * [set] MESSAGE_CD: {UQ+, varchar(100)} <br>
     * メッセージCD
     * @param messageCd The value of the column 'MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageCd(String messageCd) {
        registerModifiedProperty("messageCd");
        _messageCd = messageCd;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * メッセージ
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * メッセージ
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }

    /**
     * [get] MESSAGE_ABBR: {varchar(4000)} <br>
     * メッセージ略称
     * @return The value of the column 'MESSAGE_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageAbbr() {
        checkSpecifiedProperty("messageAbbr");
        return convertEmptyToNull(_messageAbbr);
    }

    /**
     * [set] MESSAGE_ABBR: {varchar(4000)} <br>
     * メッセージ略称
     * @param messageAbbr The value of the column 'MESSAGE_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageAbbr(String messageAbbr) {
        registerModifiedProperty("messageAbbr");
        _messageAbbr = messageAbbr;
    }

    /**
     * [get] MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @return The value of the column 'MESSAGE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageType() {
        checkSpecifiedProperty("messageType");
        return convertEmptyToNull(_messageType);
    }

    /**
     * [set] MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param messageType The value of the column 'MESSAGE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageType(String messageType) {
        registerModifiedProperty("messageType");
        _messageType = messageType;
    }

    /**
     * [get] SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSystemType() {
        checkSpecifiedProperty("systemType");
        return convertEmptyToNull(_systemType);
    }

    /**
     * [set] SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSystemType(String systemType) {
        registerModifiedProperty("systemType");
        _systemType = systemType;
    }

    /**
     * [get] CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
