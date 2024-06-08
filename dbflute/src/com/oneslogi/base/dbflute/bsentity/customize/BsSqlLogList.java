package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlLogList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MESSAGE_NM, DICT_NM, PROCESS_START_DT, PROCESS_END_DT, LOG_GROUP_CD, LOG_ID, LOG_GROUP_NM, PGM_CD, PGM_NM, ATTRIBUTE1, CENTER_NM, ATTRIBUTE2, CLIENT_NM, ATTRIBUTE3, ATTRIBUTE3_NM, ATTRIBUTE4, ATTRIBUTE4_NM, ATTRIBUTE5, ATTRIBUTE5_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String messageNm = entity.getMessageNm();
 * String dictNm = entity.getDictNm();
 * java.sql.Timestamp processStartDt = entity.getProcessStartDt();
 * java.sql.Timestamp processEndDt = entity.getProcessEndDt();
 * String logGroupCd = entity.getLogGroupCd();
 * Long logId = entity.getLogId();
 * String logGroupNm = entity.getLogGroupNm();
 * String pgmCd = entity.getPgmCd();
 * String pgmNm = entity.getPgmNm();
 * String attribute1 = entity.getAttribute1();
 * String centerNm = entity.getCenterNm();
 * String attribute2 = entity.getAttribute2();
 * String clientNm = entity.getClientNm();
 * String attribute3 = entity.getAttribute3();
 * String attribute3Nm = entity.getAttribute3Nm();
 * String attribute4 = entity.getAttribute4();
 * String attribute4Nm = entity.getAttribute4Nm();
 * String attribute5 = entity.getAttribute5();
 * String attribute5Nm = entity.getAttribute5Nm();
 * entity.setMessageNm(messageNm);
 * entity.setDictNm(dictNm);
 * entity.setProcessStartDt(processStartDt);
 * entity.setProcessEndDt(processEndDt);
 * entity.setLogGroupCd(logGroupCd);
 * entity.setLogId(logId);
 * entity.setLogGroupNm(logGroupNm);
 * entity.setPgmCd(pgmCd);
 * entity.setPgmNm(pgmNm);
 * entity.setAttribute1(attribute1);
 * entity.setCenterNm(centerNm);
 * entity.setAttribute2(attribute2);
 * entity.setClientNm(clientNm);
 * entity.setAttribute3(attribute3);
 * entity.setAttribute3Nm(attribute3Nm);
 * entity.setAttribute4(attribute4);
 * entity.setAttribute4Nm(attribute4Nm);
 * entity.setAttribute5(attribute5);
 * entity.setAttribute5Nm(attribute5Nm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlLogList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** DICT_NM: {varchar(100)} */
    protected String _dictNm;

    /** PROCESS_START_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _processStartDt;

    /** PROCESS_END_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _processEndDt;

    /** LOG_GROUP_CD: {varchar(100)} */
    protected String _logGroupCd;

    /** LOG_ID: {bigint(19)} */
    protected Long _logId;

    /** LOG_GROUP_NM: {varchar(4000)} */
    protected String _logGroupNm;

    /** PGM_CD: {varchar(100)} */
    protected String _pgmCd;

    /** PGM_NM: {varchar(4000)} */
    protected String _pgmNm;

    /** ATTRIBUTE1: {varchar(100)} */
    protected String _attribute1;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** ATTRIBUTE2: {varchar(100)} */
    protected String _attribute2;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** ATTRIBUTE3: {varchar(100)} */
    protected String _attribute3;

    /** ATTRIBUTE3_NM: {varchar(1)} */
    protected String _attribute3Nm;

    /** ATTRIBUTE4: {varchar(100)} */
    protected String _attribute4;

    /** ATTRIBUTE4_NM: {varchar(1)} */
    protected String _attribute4Nm;

    /** ATTRIBUTE5: {varchar(100)} */
    protected String _attribute5;

    /** ATTRIBUTE5_NM: {varchar(1)} */
    protected String _attribute5Nm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlLogListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlLogList";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsSqlLogList) {
            BsSqlLogList other = (BsSqlLogList)obj;
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_dictNm, other._dictNm)) { return false; }
            if (!xSV(_processStartDt, other._processStartDt)) { return false; }
            if (!xSV(_processEndDt, other._processEndDt)) { return false; }
            if (!xSV(_logGroupCd, other._logGroupCd)) { return false; }
            if (!xSV(_logId, other._logId)) { return false; }
            if (!xSV(_logGroupNm, other._logGroupNm)) { return false; }
            if (!xSV(_pgmCd, other._pgmCd)) { return false; }
            if (!xSV(_pgmNm, other._pgmNm)) { return false; }
            if (!xSV(_attribute1, other._attribute1)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_attribute2, other._attribute2)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_attribute3, other._attribute3)) { return false; }
            if (!xSV(_attribute3Nm, other._attribute3Nm)) { return false; }
            if (!xSV(_attribute4, other._attribute4)) { return false; }
            if (!xSV(_attribute4Nm, other._attribute4Nm)) { return false; }
            if (!xSV(_attribute5, other._attribute5)) { return false; }
            if (!xSV(_attribute5Nm, other._attribute5Nm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _dictNm);
        hs = xCH(hs, _processStartDt);
        hs = xCH(hs, _processEndDt);
        hs = xCH(hs, _logGroupCd);
        hs = xCH(hs, _logId);
        hs = xCH(hs, _logGroupNm);
        hs = xCH(hs, _pgmCd);
        hs = xCH(hs, _pgmNm);
        hs = xCH(hs, _attribute1);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _attribute2);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _attribute3);
        hs = xCH(hs, _attribute3Nm);
        hs = xCH(hs, _attribute4);
        hs = xCH(hs, _attribute4Nm);
        hs = xCH(hs, _attribute5);
        hs = xCH(hs, _attribute5Nm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_dictNm));
        sb.append(dm).append(xfND(_processStartDt));
        sb.append(dm).append(xfND(_processEndDt));
        sb.append(dm).append(xfND(_logGroupCd));
        sb.append(dm).append(xfND(_logId));
        sb.append(dm).append(xfND(_logGroupNm));
        sb.append(dm).append(xfND(_pgmCd));
        sb.append(dm).append(xfND(_pgmNm));
        sb.append(dm).append(xfND(_attribute1));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_attribute2));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_attribute3));
        sb.append(dm).append(xfND(_attribute3Nm));
        sb.append(dm).append(xfND(_attribute4));
        sb.append(dm).append(xfND(_attribute4Nm));
        sb.append(dm).append(xfND(_attribute5));
        sb.append(dm).append(xfND(_attribute5Nm));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlLogList clone() {
        return (SqlLogList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }

    /**
     * [get] DICT_NM: {varchar(100)} <br>
     * @return The value of the column 'DICT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDictNm() {
        checkSpecifiedProperty("dictNm");
        return convertEmptyToNull(_dictNm);
    }

    /**
     * [set] DICT_NM: {varchar(100)} <br>
     * @param dictNm The value of the column 'DICT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDictNm(String dictNm) {
        registerModifiedProperty("dictNm");
        _dictNm = dictNm;
    }

    /**
     * [get] PROCESS_START_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PROCESS_START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getProcessStartDt() {
        checkSpecifiedProperty("processStartDt");
        return _processStartDt;
    }

    /**
     * [set] PROCESS_START_DT: {datetime2(26, 6)} <br>
     * @param processStartDt The value of the column 'PROCESS_START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessStartDt(java.sql.Timestamp processStartDt) {
        registerModifiedProperty("processStartDt");
        _processStartDt = processStartDt;
    }

    /**
     * [get] PROCESS_END_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PROCESS_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getProcessEndDt() {
        checkSpecifiedProperty("processEndDt");
        return _processEndDt;
    }

    /**
     * [set] PROCESS_END_DT: {datetime2(26, 6)} <br>
     * @param processEndDt The value of the column 'PROCESS_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessEndDt(java.sql.Timestamp processEndDt) {
        registerModifiedProperty("processEndDt");
        _processEndDt = processEndDt;
    }

    /**
     * [get] LOG_GROUP_CD: {varchar(100)} <br>
     * @return The value of the column 'LOG_GROUP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogGroupCd() {
        checkSpecifiedProperty("logGroupCd");
        return convertEmptyToNull(_logGroupCd);
    }

    /**
     * [set] LOG_GROUP_CD: {varchar(100)} <br>
     * @param logGroupCd The value of the column 'LOG_GROUP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogGroupCd(String logGroupCd) {
        registerModifiedProperty("logGroupCd");
        _logGroupCd = logGroupCd;
    }

    /**
     * [get] LOG_ID: {bigint(19)} <br>
     * @return The value of the column 'LOG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLogId() {
        checkSpecifiedProperty("logId");
        return _logId;
    }

    /**
     * [set] LOG_ID: {bigint(19)} <br>
     * @param logId The value of the column 'LOG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogId(Long logId) {
        registerModifiedProperty("logId");
        _logId = logId;
    }

    /**
     * [get] LOG_GROUP_NM: {varchar(4000)} <br>
     * @return The value of the column 'LOG_GROUP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogGroupNm() {
        checkSpecifiedProperty("logGroupNm");
        return convertEmptyToNull(_logGroupNm);
    }

    /**
     * [set] LOG_GROUP_NM: {varchar(4000)} <br>
     * @param logGroupNm The value of the column 'LOG_GROUP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogGroupNm(String logGroupNm) {
        registerModifiedProperty("logGroupNm");
        _logGroupNm = logGroupNm;
    }

    /**
     * [get] PGM_CD: {varchar(100)} <br>
     * @return The value of the column 'PGM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPgmCd() {
        checkSpecifiedProperty("pgmCd");
        return convertEmptyToNull(_pgmCd);
    }

    /**
     * [set] PGM_CD: {varchar(100)} <br>
     * @param pgmCd The value of the column 'PGM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPgmCd(String pgmCd) {
        registerModifiedProperty("pgmCd");
        _pgmCd = pgmCd;
    }

    /**
     * [get] PGM_NM: {varchar(4000)} <br>
     * @return The value of the column 'PGM_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPgmNm() {
        checkSpecifiedProperty("pgmNm");
        return convertEmptyToNull(_pgmNm);
    }

    /**
     * [set] PGM_NM: {varchar(4000)} <br>
     * @param pgmNm The value of the column 'PGM_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPgmNm(String pgmNm) {
        registerModifiedProperty("pgmNm");
        _pgmNm = pgmNm;
    }

    /**
     * [get] ATTRIBUTE1: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute1() {
        checkSpecifiedProperty("attribute1");
        return convertEmptyToNull(_attribute1);
    }

    /**
     * [set] ATTRIBUTE1: {varchar(100)} <br>
     * @param attribute1 The value of the column 'ATTRIBUTE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute1(String attribute1) {
        registerModifiedProperty("attribute1");
        _attribute1 = attribute1;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] ATTRIBUTE2: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute2() {
        checkSpecifiedProperty("attribute2");
        return convertEmptyToNull(_attribute2);
    }

    /**
     * [set] ATTRIBUTE2: {varchar(100)} <br>
     * @param attribute2 The value of the column 'ATTRIBUTE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute2(String attribute2) {
        registerModifiedProperty("attribute2");
        _attribute2 = attribute2;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] ATTRIBUTE3: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute3() {
        checkSpecifiedProperty("attribute3");
        return convertEmptyToNull(_attribute3);
    }

    /**
     * [set] ATTRIBUTE3: {varchar(100)} <br>
     * @param attribute3 The value of the column 'ATTRIBUTE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute3(String attribute3) {
        registerModifiedProperty("attribute3");
        _attribute3 = attribute3;
    }

    /**
     * [get] ATTRIBUTE3_NM: {varchar(1)} <br>
     * @return The value of the column 'ATTRIBUTE3_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute3Nm() {
        checkSpecifiedProperty("attribute3Nm");
        return convertEmptyToNull(_attribute3Nm);
    }

    /**
     * [set] ATTRIBUTE3_NM: {varchar(1)} <br>
     * @param attribute3Nm The value of the column 'ATTRIBUTE3_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute3Nm(String attribute3Nm) {
        registerModifiedProperty("attribute3Nm");
        _attribute3Nm = attribute3Nm;
    }

    /**
     * [get] ATTRIBUTE4: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute4() {
        checkSpecifiedProperty("attribute4");
        return convertEmptyToNull(_attribute4);
    }

    /**
     * [set] ATTRIBUTE4: {varchar(100)} <br>
     * @param attribute4 The value of the column 'ATTRIBUTE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute4(String attribute4) {
        registerModifiedProperty("attribute4");
        _attribute4 = attribute4;
    }

    /**
     * [get] ATTRIBUTE4_NM: {varchar(1)} <br>
     * @return The value of the column 'ATTRIBUTE4_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute4Nm() {
        checkSpecifiedProperty("attribute4Nm");
        return convertEmptyToNull(_attribute4Nm);
    }

    /**
     * [set] ATTRIBUTE4_NM: {varchar(1)} <br>
     * @param attribute4Nm The value of the column 'ATTRIBUTE4_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute4Nm(String attribute4Nm) {
        registerModifiedProperty("attribute4Nm");
        _attribute4Nm = attribute4Nm;
    }

    /**
     * [get] ATTRIBUTE5: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute5() {
        checkSpecifiedProperty("attribute5");
        return convertEmptyToNull(_attribute5);
    }

    /**
     * [set] ATTRIBUTE5: {varchar(100)} <br>
     * @param attribute5 The value of the column 'ATTRIBUTE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute5(String attribute5) {
        registerModifiedProperty("attribute5");
        _attribute5 = attribute5;
    }

    /**
     * [get] ATTRIBUTE5_NM: {varchar(1)} <br>
     * @return The value of the column 'ATTRIBUTE5_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttribute5Nm() {
        checkSpecifiedProperty("attribute5Nm");
        return convertEmptyToNull(_attribute5Nm);
    }

    /**
     * [set] ATTRIBUTE5_NM: {varchar(1)} <br>
     * @param attribute5Nm The value of the column 'ATTRIBUTE5_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttribute5Nm(String attribute5Nm) {
        registerModifiedProperty("attribute5Nm");
        _attribute5Nm = attribute5Nm;
    }
}
