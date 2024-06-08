package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlEZipList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ZIP_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZIP_CD, PUBLIC_CD, ZIP_CD5, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, COMPANY_KN, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, COMPANY_NM, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS, MESSAGE_NM, MZIP_ID, MVERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
 * Long zipId = entity.getZipId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String zipCd = entity.getZipCd();
 * String publicCd = entity.getPublicCd();
 * String zipCd5 = entity.getZipCd5();
 * String addressKn1 = entity.getAddressKn1();
 * String addressKn2 = entity.getAddressKn2();
 * String addressKn3 = entity.getAddressKn3();
 * String companyKn = entity.getCompanyKn();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String address4 = entity.getAddress4();
 * String companyNm = entity.getCompanyNm();
 * String flg1 = entity.getFlg1();
 * String flg2 = entity.getFlg2();
 * String flg3 = entity.getFlg3();
 * String flg4 = entity.getFlg4();
 * String updType = entity.getUpdType();
 * String reasonType = entity.getReasonType();
 * String handlingAddress = entity.getHandlingAddress();
 * String flg5 = entity.getFlg5();
 * String flg6 = entity.getFlg6();
 * String updCd = entity.getUpdCd();
 * String companyFlg = entity.getCompanyFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * String messageNm = entity.getMessageNm();
 * Long mzipId = entity.getMzipId();
 * Long mversionNo = entity.getMversionNo();
 * entity.setZipId(zipId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setZipCd(zipCd);
 * entity.setPublicCd(publicCd);
 * entity.setZipCd5(zipCd5);
 * entity.setAddressKn1(addressKn1);
 * entity.setAddressKn2(addressKn2);
 * entity.setAddressKn3(addressKn3);
 * entity.setCompanyKn(companyKn);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setAddress4(address4);
 * entity.setCompanyNm(companyNm);
 * entity.setFlg1(flg1);
 * entity.setFlg2(flg2);
 * entity.setFlg3(flg3);
 * entity.setFlg4(flg4);
 * entity.setUpdType(updType);
 * entity.setReasonType(reasonType);
 * entity.setHandlingAddress(handlingAddress);
 * entity.setFlg5(flg5);
 * entity.setFlg6(flg6);
 * entity.setUpdCd(updCd);
 * entity.setCompanyFlg(companyFlg);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * entity.setMessageNm(messageNm);
 * entity.setMzipId(mzipId);
 * entity.setMversionNo(mversionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlEZipList extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ZIP_ID: {bigint(19)} */
    protected Long _zipId;

    /** RECEIVE_CD: {varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** ZIP_CD: {varchar(255)} */
    protected String _zipCd;

    /** PUBLIC_CD: {varchar(255)} */
    protected String _publicCd;

    /** ZIP_CD5: {varchar(255)} */
    protected String _zipCd5;

    /** ADDRESS_KN1: {varchar(255)} */
    protected String _addressKn1;

    /** ADDRESS_KN2: {varchar(255)} */
    protected String _addressKn2;

    /** ADDRESS_KN3: {varchar(255)} */
    protected String _addressKn3;

    /** COMPANY_KN: {varchar(255)} */
    protected String _companyKn;

    /** ADDRESS1: {varchar(255)} */
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** ADDRESS4: {varchar(255)} */
    protected String _address4;

    /** COMPANY_NM: {varchar(255)} */
    protected String _companyNm;

    /** FLG1: {varchar(255)} */
    protected String _flg1;

    /** FLG2: {varchar(255)} */
    protected String _flg2;

    /** FLG3: {varchar(255)} */
    protected String _flg3;

    /** FLG4: {varchar(255)} */
    protected String _flg4;

    /** UPD_TYPE: {varchar(255)} */
    protected String _updType;

    /** REASON_TYPE: {varchar(255)} */
    protected String _reasonType;

    /** HANDLING_ADDRESS: {varchar(255)} */
    protected String _handlingAddress;

    /** FLG5: {varchar(255)} */
    protected String _flg5;

    /** FLG6: {varchar(255)} */
    protected String _flg6;

    /** UPD_CD: {varchar(255)} */
    protected String _updCd;

    /** COMPANY_FLG: {varchar(255)} */
    protected String _companyFlg;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
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

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** MZIP_ID: {bigint(19)} */
    protected Long _mzipId;

    /** MVERSION_NO: {bigint(19)} */
    protected Long _mversionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlEZipListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlEZipList";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
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
        if (obj instanceof BsSqlEZipList) {
            BsSqlEZipList other = (BsSqlEZipList)obj;
            if (!xSV(_zipId, other._zipId)) { return false; }
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_zipCd, other._zipCd)) { return false; }
            if (!xSV(_publicCd, other._publicCd)) { return false; }
            if (!xSV(_zipCd5, other._zipCd5)) { return false; }
            if (!xSV(_addressKn1, other._addressKn1)) { return false; }
            if (!xSV(_addressKn2, other._addressKn2)) { return false; }
            if (!xSV(_addressKn3, other._addressKn3)) { return false; }
            if (!xSV(_companyKn, other._companyKn)) { return false; }
            if (!xSV(_address1, other._address1)) { return false; }
            if (!xSV(_address2, other._address2)) { return false; }
            if (!xSV(_address3, other._address3)) { return false; }
            if (!xSV(_address4, other._address4)) { return false; }
            if (!xSV(_companyNm, other._companyNm)) { return false; }
            if (!xSV(_flg1, other._flg1)) { return false; }
            if (!xSV(_flg2, other._flg2)) { return false; }
            if (!xSV(_flg3, other._flg3)) { return false; }
            if (!xSV(_flg4, other._flg4)) { return false; }
            if (!xSV(_updType, other._updType)) { return false; }
            if (!xSV(_reasonType, other._reasonType)) { return false; }
            if (!xSV(_handlingAddress, other._handlingAddress)) { return false; }
            if (!xSV(_flg5, other._flg5)) { return false; }
            if (!xSV(_flg6, other._flg6)) { return false; }
            if (!xSV(_updCd, other._updCd)) { return false; }
            if (!xSV(_companyFlg, other._companyFlg)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_mzipId, other._mzipId)) { return false; }
            if (!xSV(_mversionNo, other._mversionNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _zipId);
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _zipCd);
        hs = xCH(hs, _publicCd);
        hs = xCH(hs, _zipCd5);
        hs = xCH(hs, _addressKn1);
        hs = xCH(hs, _addressKn2);
        hs = xCH(hs, _addressKn3);
        hs = xCH(hs, _companyKn);
        hs = xCH(hs, _address1);
        hs = xCH(hs, _address2);
        hs = xCH(hs, _address3);
        hs = xCH(hs, _address4);
        hs = xCH(hs, _companyNm);
        hs = xCH(hs, _flg1);
        hs = xCH(hs, _flg2);
        hs = xCH(hs, _flg3);
        hs = xCH(hs, _flg4);
        hs = xCH(hs, _updType);
        hs = xCH(hs, _reasonType);
        hs = xCH(hs, _handlingAddress);
        hs = xCH(hs, _flg5);
        hs = xCH(hs, _flg6);
        hs = xCH(hs, _updCd);
        hs = xCH(hs, _companyFlg);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _mzipId);
        hs = xCH(hs, _mversionNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_zipId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_publicCd));
        sb.append(dm).append(xfND(_zipCd5));
        sb.append(dm).append(xfND(_addressKn1));
        sb.append(dm).append(xfND(_addressKn2));
        sb.append(dm).append(xfND(_addressKn3));
        sb.append(dm).append(xfND(_companyKn));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_address4));
        sb.append(dm).append(xfND(_companyNm));
        sb.append(dm).append(xfND(_flg1));
        sb.append(dm).append(xfND(_flg2));
        sb.append(dm).append(xfND(_flg3));
        sb.append(dm).append(xfND(_flg4));
        sb.append(dm).append(xfND(_updType));
        sb.append(dm).append(xfND(_reasonType));
        sb.append(dm).append(xfND(_handlingAddress));
        sb.append(dm).append(xfND(_flg5));
        sb.append(dm).append(xfND(_flg6));
        sb.append(dm).append(xfND(_updCd));
        sb.append(dm).append(xfND(_companyFlg));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_mzipId));
        sb.append(dm).append(xfND(_mversionNo));
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
    public SqlEZipList clone() {
        return (SqlEZipList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ZIP_ID: {bigint(19)} <br>
     * @return The value of the column 'ZIP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZipId() {
        checkSpecifiedProperty("zipId");
        return _zipId;
    }

    /**
     * [set] ZIP_ID: {bigint(19)} <br>
     * @param zipId The value of the column 'ZIP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipId(Long zipId) {
        registerModifiedProperty("zipId");
        _zipId = zipId;
    }

    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] ZIP_CD: {varchar(255)} <br>
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {varchar(255)} <br>
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] PUBLIC_CD: {varchar(255)} <br>
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPublicCd() {
        checkSpecifiedProperty("publicCd");
        return convertEmptyToNull(_publicCd);
    }

    /**
     * [set] PUBLIC_CD: {varchar(255)} <br>
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublicCd(String publicCd) {
        registerModifiedProperty("publicCd");
        _publicCd = publicCd;
    }

    /**
     * [get] ZIP_CD5: {varchar(255)} <br>
     * @return The value of the column 'ZIP_CD5'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd5() {
        checkSpecifiedProperty("zipCd5");
        return convertEmptyToNull(_zipCd5);
    }

    /**
     * [set] ZIP_CD5: {varchar(255)} <br>
     * @param zipCd5 The value of the column 'ZIP_CD5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd5(String zipCd5) {
        registerModifiedProperty("zipCd5");
        _zipCd5 = zipCd5;
    }

    /**
     * [get] ADDRESS_KN1: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS_KN1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn1() {
        checkSpecifiedProperty("addressKn1");
        return convertEmptyToNull(_addressKn1);
    }

    /**
     * [set] ADDRESS_KN1: {varchar(255)} <br>
     * @param addressKn1 The value of the column 'ADDRESS_KN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn1(String addressKn1) {
        registerModifiedProperty("addressKn1");
        _addressKn1 = addressKn1;
    }

    /**
     * [get] ADDRESS_KN2: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS_KN2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn2() {
        checkSpecifiedProperty("addressKn2");
        return convertEmptyToNull(_addressKn2);
    }

    /**
     * [set] ADDRESS_KN2: {varchar(255)} <br>
     * @param addressKn2 The value of the column 'ADDRESS_KN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn2(String addressKn2) {
        registerModifiedProperty("addressKn2");
        _addressKn2 = addressKn2;
    }

    /**
     * [get] ADDRESS_KN3: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS_KN3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn3() {
        checkSpecifiedProperty("addressKn3");
        return convertEmptyToNull(_addressKn3);
    }

    /**
     * [set] ADDRESS_KN3: {varchar(255)} <br>
     * @param addressKn3 The value of the column 'ADDRESS_KN3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn3(String addressKn3) {
        registerModifiedProperty("addressKn3");
        _addressKn3 = addressKn3;
    }

    /**
     * [get] COMPANY_KN: {varchar(255)} <br>
     * @return The value of the column 'COMPANY_KN'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyKn() {
        checkSpecifiedProperty("companyKn");
        return convertEmptyToNull(_companyKn);
    }

    /**
     * [set] COMPANY_KN: {varchar(255)} <br>
     * @param companyKn The value of the column 'COMPANY_KN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyKn(String companyKn) {
        registerModifiedProperty("companyKn");
        _companyKn = companyKn;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] ADDRESS4: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS4'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress4() {
        checkSpecifiedProperty("address4");
        return convertEmptyToNull(_address4);
    }

    /**
     * [set] ADDRESS4: {varchar(255)} <br>
     * @param address4 The value of the column 'ADDRESS4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress4(String address4) {
        registerModifiedProperty("address4");
        _address4 = address4;
    }

    /**
     * [get] COMPANY_NM: {varchar(255)} <br>
     * @return The value of the column 'COMPANY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyNm() {
        checkSpecifiedProperty("companyNm");
        return convertEmptyToNull(_companyNm);
    }

    /**
     * [set] COMPANY_NM: {varchar(255)} <br>
     * @param companyNm The value of the column 'COMPANY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyNm(String companyNm) {
        registerModifiedProperty("companyNm");
        _companyNm = companyNm;
    }

    /**
     * [get] FLG1: {varchar(255)} <br>
     * @return The value of the column 'FLG1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg1() {
        checkSpecifiedProperty("flg1");
        return convertEmptyToNull(_flg1);
    }

    /**
     * [set] FLG1: {varchar(255)} <br>
     * @param flg1 The value of the column 'FLG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg1(String flg1) {
        registerModifiedProperty("flg1");
        _flg1 = flg1;
    }

    /**
     * [get] FLG2: {varchar(255)} <br>
     * @return The value of the column 'FLG2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg2() {
        checkSpecifiedProperty("flg2");
        return convertEmptyToNull(_flg2);
    }

    /**
     * [set] FLG2: {varchar(255)} <br>
     * @param flg2 The value of the column 'FLG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg2(String flg2) {
        registerModifiedProperty("flg2");
        _flg2 = flg2;
    }

    /**
     * [get] FLG3: {varchar(255)} <br>
     * @return The value of the column 'FLG3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg3() {
        checkSpecifiedProperty("flg3");
        return convertEmptyToNull(_flg3);
    }

    /**
     * [set] FLG3: {varchar(255)} <br>
     * @param flg3 The value of the column 'FLG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg3(String flg3) {
        registerModifiedProperty("flg3");
        _flg3 = flg3;
    }

    /**
     * [get] FLG4: {varchar(255)} <br>
     * @return The value of the column 'FLG4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg4() {
        checkSpecifiedProperty("flg4");
        return convertEmptyToNull(_flg4);
    }

    /**
     * [set] FLG4: {varchar(255)} <br>
     * @param flg4 The value of the column 'FLG4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg4(String flg4) {
        registerModifiedProperty("flg4");
        _flg4 = flg4;
    }

    /**
     * [get] UPD_TYPE: {varchar(255)} <br>
     * @return The value of the column 'UPD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdType() {
        checkSpecifiedProperty("updType");
        return convertEmptyToNull(_updType);
    }

    /**
     * [set] UPD_TYPE: {varchar(255)} <br>
     * @param updType The value of the column 'UPD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdType(String updType) {
        registerModifiedProperty("updType");
        _updType = updType;
    }

    /**
     * [get] REASON_TYPE: {varchar(255)} <br>
     * @return The value of the column 'REASON_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReasonType() {
        checkSpecifiedProperty("reasonType");
        return convertEmptyToNull(_reasonType);
    }

    /**
     * [set] REASON_TYPE: {varchar(255)} <br>
     * @param reasonType The value of the column 'REASON_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReasonType(String reasonType) {
        registerModifiedProperty("reasonType");
        _reasonType = reasonType;
    }

    /**
     * [get] HANDLING_ADDRESS: {varchar(255)} <br>
     * @return The value of the column 'HANDLING_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getHandlingAddress() {
        checkSpecifiedProperty("handlingAddress");
        return convertEmptyToNull(_handlingAddress);
    }

    /**
     * [set] HANDLING_ADDRESS: {varchar(255)} <br>
     * @param handlingAddress The value of the column 'HANDLING_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHandlingAddress(String handlingAddress) {
        registerModifiedProperty("handlingAddress");
        _handlingAddress = handlingAddress;
    }

    /**
     * [get] FLG5: {varchar(255)} <br>
     * @return The value of the column 'FLG5'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg5() {
        checkSpecifiedProperty("flg5");
        return convertEmptyToNull(_flg5);
    }

    /**
     * [set] FLG5: {varchar(255)} <br>
     * @param flg5 The value of the column 'FLG5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg5(String flg5) {
        registerModifiedProperty("flg5");
        _flg5 = flg5;
    }

    /**
     * [get] FLG6: {varchar(255)} <br>
     * @return The value of the column 'FLG6'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg6() {
        checkSpecifiedProperty("flg6");
        return convertEmptyToNull(_flg6);
    }

    /**
     * [set] FLG6: {varchar(255)} <br>
     * @param flg6 The value of the column 'FLG6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg6(String flg6) {
        registerModifiedProperty("flg6");
        _flg6 = flg6;
    }

    /**
     * [get] UPD_CD: {varchar(255)} <br>
     * @return The value of the column 'UPD_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdCd() {
        checkSpecifiedProperty("updCd");
        return convertEmptyToNull(_updCd);
    }

    /**
     * [set] UPD_CD: {varchar(255)} <br>
     * @param updCd The value of the column 'UPD_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdCd(String updCd) {
        registerModifiedProperty("updCd");
        _updCd = updCd;
    }

    /**
     * [get] COMPANY_FLG: {varchar(255)} <br>
     * @return The value of the column 'COMPANY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyFlg() {
        checkSpecifiedProperty("companyFlg");
        return convertEmptyToNull(_companyFlg);
    }

    /**
     * [set] COMPANY_FLG: {varchar(255)} <br>
     * @param companyFlg The value of the column 'COMPANY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyFlg(String companyFlg) {
        registerModifiedProperty("companyFlg");
        _companyFlg = companyFlg;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }

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
     * [get] MZIP_ID: {bigint(19)} <br>
     * @return The value of the column 'MZIP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMzipId() {
        checkSpecifiedProperty("mzipId");
        return _mzipId;
    }

    /**
     * [set] MZIP_ID: {bigint(19)} <br>
     * @param mzipId The value of the column 'MZIP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMzipId(Long mzipId) {
        registerModifiedProperty("mzipId");
        _mzipId = mzipId;
    }

    /**
     * [get] MVERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'MVERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMversionNo() {
        checkSpecifiedProperty("mversionNo");
        return _mversionNo;
    }

    /**
     * [set] MVERSION_NO: {bigint(19)} <br>
     * @param mversionNo The value of the column 'MVERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMversionNo(Long mversionNo) {
        registerModifiedProperty("mversionNo");
        _mversionNo = mversionNo;
    }
}
