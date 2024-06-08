package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CLIN as TABLE. <br>
 * ラインマスタ
 * <pre>
 * [primary-key]
 *     CLIN_ID
 *
 * [column]
 *     CLIN_ID, LINCD, LINNM, SPLCTG, LINBLK1, LINBLK2, SFTPCLRSFID, TSNBOXRSFID, JTBOXRSFID, HDRDBOXRSFID, ODRDVRSFID, PKGRT, LINBLK3, SPRPRSID, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMClinDto implements Serializable {

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
    /** CLIN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _clinId;

    /** LINCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _lincd;

    /** LINNM: {NotNull, varchar(30)} */
    @JsonKey
    protected String _linnm;

    /** SPLCTG: {varchar(30)} */
    @JsonKey
    protected String _splctg;

    /** LINBLK1: {varchar(30)} */
    @JsonKey
    protected String _linblk1;

    /** LINBLK2: {varchar(30)} */
    @JsonKey
    protected String _linblk2;

    /** SFTPCLRSFID: {char(1)} */
    @JsonKey
    protected String _sftpclrsfid;

    /** TSNBOXRSFID: {char(1)} */
    @JsonKey
    protected String _tsnboxrsfid;

    /** JTBOXRSFID: {char(1)} */
    @JsonKey
    protected String _jtboxrsfid;

    /** HDRDBOXRSFID: {char(1)} */
    @JsonKey
    protected String _hdrdboxrsfid;

    /** ODRDVRSFID: {char(1)} */
    @JsonKey
    protected String _odrdvrsfid;

    /** PKGRT: {bigint(19)} */
    @JsonKey
    protected Long _pkgrt;

    /** LINBLK3: {varchar(30)} */
    @JsonKey
    protected String _linblk3;

    /** SPRPRSID: {varchar(30)} */
    @JsonKey
    protected String _sprprsid;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

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
    public BsMClinDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMClinDto)) { return false; }
        final BsMClinDto otherEntity = (BsMClinDto)other;
        if (!helpComparingValue(getClinId(), otherEntity.getClinId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CLIN");
        result = xCH(result, getClinId());
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
        sb.append(c).append(getClinId());
        sb.append(c).append(getLincd());
        sb.append(c).append(getLinnm());
        sb.append(c).append(getSplctg());
        sb.append(c).append(getLinblk1());
        sb.append(c).append(getLinblk2());
        sb.append(c).append(getSftpclrsfid());
        sb.append(c).append(getTsnboxrsfid());
        sb.append(c).append(getJtboxrsfid());
        sb.append(c).append(getHdrdboxrsfid());
        sb.append(c).append(getOdrdvrsfid());
        sb.append(c).append(getPkgrt());
        sb.append(c).append(getLinblk3());
        sb.append(c).append(getSprprsid());
        sb.append(c).append(getCenterId());
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
     * [get] CLIN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ラインID
     * @return The value of the column 'CLIN_ID'. (NullAllowed)
     */
    public Long getClinId() {
        return _clinId;
    }

    /**
     * [set] CLIN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ラインID
     * @param clinId The value of the column 'CLIN_ID'. (NullAllowed)
     */
    public void setClinId(Long clinId) {
        __modifiedProperties.add("clinId");
        this._clinId = clinId;
    }

    /**
     * [get] LINCD: {NotNull, varchar(30)} <br>
     * ラインCD
     * @return The value of the column 'LINCD'. (NullAllowed)
     */
    public String getLincd() {
        return _lincd;
    }

    /**
     * [set] LINCD: {NotNull, varchar(30)} <br>
     * ラインCD
     * @param lincd The value of the column 'LINCD'. (NullAllowed)
     */
    public void setLincd(String lincd) {
        __modifiedProperties.add("lincd");
        this._lincd = lincd;
    }

    /**
     * [get] LINNM: {NotNull, varchar(30)} <br>
     * ライン名称
     * @return The value of the column 'LINNM'. (NullAllowed)
     */
    public String getLinnm() {
        return _linnm;
    }

    /**
     * [set] LINNM: {NotNull, varchar(30)} <br>
     * ライン名称
     * @param linnm The value of the column 'LINNM'. (NullAllowed)
     */
    public void setLinnm(String linnm) {
        __modifiedProperties.add("linnm");
        this._linnm = linnm;
    }

    /**
     * [get] SPLCTG: {varchar(30)} <br>
     * 補充カテゴリ
     * @return The value of the column 'SPLCTG'. (NullAllowed)
     */
    public String getSplctg() {
        return _splctg;
    }

    /**
     * [set] SPLCTG: {varchar(30)} <br>
     * 補充カテゴリ
     * @param splctg The value of the column 'SPLCTG'. (NullAllowed)
     */
    public void setSplctg(String splctg) {
        __modifiedProperties.add("splctg");
        this._splctg = splctg;
    }

    /**
     * [get] LINBLK1: {varchar(30)} <br>
     * ライン対応ブロック(１)
     * @return The value of the column 'LINBLK1'. (NullAllowed)
     */
    public String getLinblk1() {
        return _linblk1;
    }

    /**
     * [set] LINBLK1: {varchar(30)} <br>
     * ライン対応ブロック(１)
     * @param linblk1 The value of the column 'LINBLK1'. (NullAllowed)
     */
    public void setLinblk1(String linblk1) {
        __modifiedProperties.add("linblk1");
        this._linblk1 = linblk1;
    }

    /**
     * [get] LINBLK2: {varchar(30)} <br>
     * ライン対応ブロック(２)
     * @return The value of the column 'LINBLK2'. (NullAllowed)
     */
    public String getLinblk2() {
        return _linblk2;
    }

    /**
     * [set] LINBLK2: {varchar(30)} <br>
     * ライン対応ブロック(２)
     * @param linblk2 The value of the column 'LINBLK2'. (NullAllowed)
     */
    public void setLinblk2(String linblk2) {
        __modifiedProperties.add("linblk2");
        this._linblk2 = linblk2;
    }

    /**
     * [get] SFTPCLRSFID: {char(1)} <br>
     * ソフトパーセル拒否区分
     * @return The value of the column 'SFTPCLRSFID'. (NullAllowed)
     */
    public String getSftpclrsfid() {
        return _sftpclrsfid;
    }

    /**
     * [set] SFTPCLRSFID: {char(1)} <br>
     * ソフトパーセル拒否区分
     * @param sftpclrsfid The value of the column 'SFTPCLRSFID'. (NullAllowed)
     */
    public void setSftpclrsfid(String sftpclrsfid) {
        __modifiedProperties.add("sftpclrsfid");
        this._sftpclrsfid = sftpclrsfid;
    }

    /**
     * [get] TSNBOXRSFID: {char(1)} <br>
     * ＴＳＮＢＯＸ拒否区分
     * @return The value of the column 'TSNBOXRSFID'. (NullAllowed)
     */
    public String getTsnboxrsfid() {
        return _tsnboxrsfid;
    }

    /**
     * [set] TSNBOXRSFID: {char(1)} <br>
     * ＴＳＮＢＯＸ拒否区分
     * @param tsnboxrsfid The value of the column 'TSNBOXRSFID'. (NullAllowed)
     */
    public void setTsnboxrsfid(String tsnboxrsfid) {
        __modifiedProperties.add("tsnboxrsfid");
        this._tsnboxrsfid = tsnboxrsfid;
    }

    /**
     * [get] JTBOXRSFID: {char(1)} <br>
     * ＪＴＢＯＸ拒否区分
     * @return The value of the column 'JTBOXRSFID'. (NullAllowed)
     */
    public String getJtboxrsfid() {
        return _jtboxrsfid;
    }

    /**
     * [set] JTBOXRSFID: {char(1)} <br>
     * ＪＴＢＯＸ拒否区分
     * @param jtboxrsfid The value of the column 'JTBOXRSFID'. (NullAllowed)
     */
    public void setJtboxrsfid(String jtboxrsfid) {
        __modifiedProperties.add("jtboxrsfid");
        this._jtboxrsfid = jtboxrsfid;
    }

    /**
     * [get] HDRDBOXRSFID: {char(1)} <br>
     * １００ＢＯＸ拒否区分
     * @return The value of the column 'HDRDBOXRSFID'. (NullAllowed)
     */
    public String getHdrdboxrsfid() {
        return _hdrdboxrsfid;
    }

    /**
     * [set] HDRDBOXRSFID: {char(1)} <br>
     * １００ＢＯＸ拒否区分
     * @param hdrdboxrsfid The value of the column 'HDRDBOXRSFID'. (NullAllowed)
     */
    public void setHdrdboxrsfid(String hdrdboxrsfid) {
        __modifiedProperties.add("hdrdboxrsfid");
        this._hdrdboxrsfid = hdrdboxrsfid;
    }

    /**
     * [get] ODRDVRSFID: {char(1)} <br>
     * オーダー分割拒否区分
     * @return The value of the column 'ODRDVRSFID'. (NullAllowed)
     */
    public String getOdrdvrsfid() {
        return _odrdvrsfid;
    }

    /**
     * [set] ODRDVRSFID: {char(1)} <br>
     * オーダー分割拒否区分
     * @param odrdvrsfid The value of the column 'ODRDVRSFID'. (NullAllowed)
     */
    public void setOdrdvrsfid(String odrdvrsfid) {
        __modifiedProperties.add("odrdvrsfid");
        this._odrdvrsfid = odrdvrsfid;
    }

    /**
     * [get] PKGRT: {bigint(19)} <br>
     * 梱包率
     * @return The value of the column 'PKGRT'. (NullAllowed)
     */
    public Long getPkgrt() {
        return _pkgrt;
    }

    /**
     * [set] PKGRT: {bigint(19)} <br>
     * 梱包率
     * @param pkgrt The value of the column 'PKGRT'. (NullAllowed)
     */
    public void setPkgrt(Long pkgrt) {
        __modifiedProperties.add("pkgrt");
        this._pkgrt = pkgrt;
    }

    /**
     * [get] LINBLK3: {varchar(30)} <br>
     * ライン対応ブロック(３)
     * @return The value of the column 'LINBLK3'. (NullAllowed)
     */
    public String getLinblk3() {
        return _linblk3;
    }

    /**
     * [set] LINBLK3: {varchar(30)} <br>
     * ライン対応ブロック(３)
     * @param linblk3 The value of the column 'LINBLK3'. (NullAllowed)
     */
    public void setLinblk3(String linblk3) {
        __modifiedProperties.add("linblk3");
        this._linblk3 = linblk3;
    }

    /**
     * [get] SPRPRSID: {varchar(30)} <br>
     * 個口圧縮区分
     * @return The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public String getSprprsid() {
        return _sprprsid;
    }

    /**
     * [set] SPRPRSID: {varchar(30)} <br>
     * 個口圧縮区分
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public void setSprprsid(String sprprsid) {
        __modifiedProperties.add("sprprsid");
        this._sprprsid = sprprsid;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
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
