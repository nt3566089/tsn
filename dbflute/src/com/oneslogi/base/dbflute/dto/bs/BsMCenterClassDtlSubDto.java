package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CENTER_CLASS_DTL_SUB as TABLE. <br>
 * 拠点区分値明細マスタサブ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_DTL_ID, OTHERCD1, OTHERCD2, OTHERCD3, OTHERCD4, OTHERCD5, OTHER1_COMMENT, OTHER2_COMMENT, OTHER3_COMMENT, OTHER4_COMMENT, OTHER5_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * [foreign-table]
 *     M_CENTER_CLASS_DTL
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenterClassDtl
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCenterClassDtlSubDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} */
    @JsonKey
    protected Long _centerClassDtlId;

    /** OTHERCD1: {varchar(30)} */
    @JsonKey
    protected String _othercd1;

    /** OTHERCD2: {varchar(30)} */
    @JsonKey
    protected String _othercd2;

    /** OTHERCD3: {varchar(30)} */
    @JsonKey
    protected String _othercd3;

    /** OTHERCD4: {varchar(30)} */
    @JsonKey
    protected String _othercd4;

    /** OTHERCD5: {varchar(30)} */
    @JsonKey
    protected String _othercd5;

    /** OTHER1_COMMENT: {varchar(60)} */
    @JsonKey
    protected String _other1Comment;

    /** OTHER2_COMMENT: {varchar(60)} */
    @JsonKey
    protected String _other2Comment;

    /** OTHER3_COMMENT: {varchar(60)} */
    @JsonKey
    protected String _other3Comment;

    /** OTHER4_COMMENT: {varchar(60)} */
    @JsonKey
    protected String _other4Comment;

    /** OTHER5_COMMENT: {varchar(60)} */
    @JsonKey
    protected String _other5Comment;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterClassDtlSubDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MCenterClassDtlDto _mCenterClassDtl;

    public MCenterClassDtlDto getMCenterClassDtl() {
        return _mCenterClassDtl;
    }

    public void setMCenterClassDtl(MCenterClassDtlDto mCenterClassDtl) {
        this._mCenterClassDtl = mCenterClassDtl;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCenterClassDtlSubDto)) { return false; }
        final BsMCenterClassDtlSubDto otherEntity = (BsMCenterClassDtlSubDto)other;
        if (!helpComparingValue(getCenterClassDtlId(), otherEntity.getCenterClassDtlId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CENTER_CLASS_DTL_SUB");
        result = xCH(result, getCenterClassDtlId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getCenterClassDtlId());
        sb.append(c).append(getOthercd1());
        sb.append(c).append(getOthercd2());
        sb.append(c).append(getOthercd3());
        sb.append(c).append(getOthercd4());
        sb.append(c).append(getOthercd5());
        sb.append(c).append(getOther1Comment());
        sb.append(c).append(getOther2Comment());
        sb.append(c).append(getOther3Comment());
        sb.append(c).append(getOther4Comment());
        sb.append(c).append(getOther5Comment());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} <br>
     * 拠点区分値明細ID
     * @return The value of the column 'CENTER_CLASS_DTL_ID'. (NullAllowed)
     */
    public Long getCenterClassDtlId() {
        return _centerClassDtlId;
    }

    /**
     * [set] CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL} <br>
     * 拠点区分値明細ID
     * @param centerClassDtlId The value of the column 'CENTER_CLASS_DTL_ID'. (NullAllowed)
     */
    public void setCenterClassDtlId(Long centerClassDtlId) {
        __modifiedProperties.add("centerClassDtlId");
        this._centerClassDtlId = centerClassDtlId;
    }

    /**
     * [get] OTHERCD1: {varchar(30)} <br>
     * その他CD１
     * @return The value of the column 'OTHERCD1'. (NullAllowed)
     */
    public String getOthercd1() {
        return _othercd1;
    }

    /**
     * [set] OTHERCD1: {varchar(30)} <br>
     * その他CD１
     * @param othercd1 The value of the column 'OTHERCD1'. (NullAllowed)
     */
    public void setOthercd1(String othercd1) {
        __modifiedProperties.add("othercd1");
        this._othercd1 = othercd1;
    }

    /**
     * [get] OTHERCD2: {varchar(30)} <br>
     * その他CD２
     * @return The value of the column 'OTHERCD2'. (NullAllowed)
     */
    public String getOthercd2() {
        return _othercd2;
    }

    /**
     * [set] OTHERCD2: {varchar(30)} <br>
     * その他CD２
     * @param othercd2 The value of the column 'OTHERCD2'. (NullAllowed)
     */
    public void setOthercd2(String othercd2) {
        __modifiedProperties.add("othercd2");
        this._othercd2 = othercd2;
    }

    /**
     * [get] OTHERCD3: {varchar(30)} <br>
     * その他CD３
     * @return The value of the column 'OTHERCD3'. (NullAllowed)
     */
    public String getOthercd3() {
        return _othercd3;
    }

    /**
     * [set] OTHERCD3: {varchar(30)} <br>
     * その他CD３
     * @param othercd3 The value of the column 'OTHERCD3'. (NullAllowed)
     */
    public void setOthercd3(String othercd3) {
        __modifiedProperties.add("othercd3");
        this._othercd3 = othercd3;
    }

    /**
     * [get] OTHERCD4: {varchar(30)} <br>
     * その他CD４
     * @return The value of the column 'OTHERCD4'. (NullAllowed)
     */
    public String getOthercd4() {
        return _othercd4;
    }

    /**
     * [set] OTHERCD4: {varchar(30)} <br>
     * その他CD４
     * @param othercd4 The value of the column 'OTHERCD4'. (NullAllowed)
     */
    public void setOthercd4(String othercd4) {
        __modifiedProperties.add("othercd4");
        this._othercd4 = othercd4;
    }

    /**
     * [get] OTHERCD5: {varchar(30)} <br>
     * その他CD５
     * @return The value of the column 'OTHERCD5'. (NullAllowed)
     */
    public String getOthercd5() {
        return _othercd5;
    }

    /**
     * [set] OTHERCD5: {varchar(30)} <br>
     * その他CD５
     * @param othercd5 The value of the column 'OTHERCD5'. (NullAllowed)
     */
    public void setOthercd5(String othercd5) {
        __modifiedProperties.add("othercd5");
        this._othercd5 = othercd5;
    }

    /**
     * [get] OTHER1_COMMENT: {varchar(60)} <br>
     * その他CD１解説
     * @return The value of the column 'OTHER1_COMMENT'. (NullAllowed)
     */
    public String getOther1Comment() {
        return _other1Comment;
    }

    /**
     * [set] OTHER1_COMMENT: {varchar(60)} <br>
     * その他CD１解説
     * @param other1Comment The value of the column 'OTHER1_COMMENT'. (NullAllowed)
     */
    public void setOther1Comment(String other1Comment) {
        __modifiedProperties.add("other1Comment");
        this._other1Comment = other1Comment;
    }

    /**
     * [get] OTHER2_COMMENT: {varchar(60)} <br>
     * その他CD２解説
     * @return The value of the column 'OTHER2_COMMENT'. (NullAllowed)
     */
    public String getOther2Comment() {
        return _other2Comment;
    }

    /**
     * [set] OTHER2_COMMENT: {varchar(60)} <br>
     * その他CD２解説
     * @param other2Comment The value of the column 'OTHER2_COMMENT'. (NullAllowed)
     */
    public void setOther2Comment(String other2Comment) {
        __modifiedProperties.add("other2Comment");
        this._other2Comment = other2Comment;
    }

    /**
     * [get] OTHER3_COMMENT: {varchar(60)} <br>
     * その他CD３解説
     * @return The value of the column 'OTHER3_COMMENT'. (NullAllowed)
     */
    public String getOther3Comment() {
        return _other3Comment;
    }

    /**
     * [set] OTHER3_COMMENT: {varchar(60)} <br>
     * その他CD３解説
     * @param other3Comment The value of the column 'OTHER3_COMMENT'. (NullAllowed)
     */
    public void setOther3Comment(String other3Comment) {
        __modifiedProperties.add("other3Comment");
        this._other3Comment = other3Comment;
    }

    /**
     * [get] OTHER4_COMMENT: {varchar(60)} <br>
     * その他CD４解説
     * @return The value of the column 'OTHER4_COMMENT'. (NullAllowed)
     */
    public String getOther4Comment() {
        return _other4Comment;
    }

    /**
     * [set] OTHER4_COMMENT: {varchar(60)} <br>
     * その他CD４解説
     * @param other4Comment The value of the column 'OTHER4_COMMENT'. (NullAllowed)
     */
    public void setOther4Comment(String other4Comment) {
        __modifiedProperties.add("other4Comment");
        this._other4Comment = other4Comment;
    }

    /**
     * [get] OTHER5_COMMENT: {varchar(60)} <br>
     * その他CD５解説
     * @return The value of the column 'OTHER5_COMMENT'. (NullAllowed)
     */
    public String getOther5Comment() {
        return _other5Comment;
    }

    /**
     * [set] OTHER5_COMMENT: {varchar(60)} <br>
     * その他CD５解説
     * @param other5Comment The value of the column 'OTHER5_COMMENT'. (NullAllowed)
     */
    public void setOther5Comment(String other5Comment) {
        __modifiedProperties.add("other5Comment");
        this._other5Comment = other5Comment;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
