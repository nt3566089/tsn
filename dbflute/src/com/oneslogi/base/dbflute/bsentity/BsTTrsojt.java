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
 * The entity of T_TRSOJT as TABLE. <br>
 * 出庫指図
 * <pre>
 * [primary-key]
 *     SOJTID
 *
 * [column]
 *     SOJTID, SOJTKEY, OWNERSONO, CUSTOMER_CD, ORDERDATE, PLANSEQ, PLANRCVDATETIME, BEFOREPLANSEQ, PLANRCVFLG, HTOPEFLG, TRSOADDDATE, TRSOADDFLG, SOID, PLANNAME, PLANPOST, PLANADDRESS, PLANWAREHOUSENAME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTID
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
 * Long sojtid = entity.getSojtid();
 * java.math.BigDecimal sojtkey = entity.getSojtkey();
 * String ownersono = entity.getOwnersono();
 * String customerCd = entity.getCustomerCd();
 * String orderdate = entity.getOrderdate();
 * Long planseq = entity.getPlanseq();
 * java.sql.Timestamp planrcvdatetime = entity.getPlanrcvdatetime();
 * Long beforeplanseq = entity.getBeforeplanseq();
 * String planrcvflg = entity.getPlanrcvflg();
 * String htopeflg = entity.getHtopeflg();
 * java.sql.Timestamp trsoadddate = entity.getTrsoadddate();
 * String trsoaddflg = entity.getTrsoaddflg();
 * Long soid = entity.getSoid();
 * String planname = entity.getPlanname();
 * String planpost = entity.getPlanpost();
 * String planaddress = entity.getPlanaddress();
 * String planwarehousename = entity.getPlanwarehousename();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSojtid(sojtid);
 * entity.setSojtkey(sojtkey);
 * entity.setOwnersono(ownersono);
 * entity.setCustomerCd(customerCd);
 * entity.setOrderdate(orderdate);
 * entity.setPlanseq(planseq);
 * entity.setPlanrcvdatetime(planrcvdatetime);
 * entity.setBeforeplanseq(beforeplanseq);
 * entity.setPlanrcvflg(planrcvflg);
 * entity.setHtopeflg(htopeflg);
 * entity.setTrsoadddate(trsoadddate);
 * entity.setTrsoaddflg(trsoaddflg);
 * entity.setSoid(soid);
 * entity.setPlanname(planname);
 * entity.setPlanpost(planpost);
 * entity.setPlanaddress(planaddress);
 * entity.setPlanwarehousename(planwarehousename);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
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
public abstract class BsTTrsojt extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SOJTID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sojtid;

    /** SOJTKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _sojtkey;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** CUSTOMER_CD: {varchar(60)} */
    protected String _customerCd;

    /** ORDERDATE: {varchar(8)} */
    protected String _orderdate;

    /** PLANSEQ: {bigint(19)} */
    protected Long _planseq;

    /** PLANRCVDATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _planrcvdatetime;

    /** BEFOREPLANSEQ: {bigint(19)} */
    protected Long _beforeplanseq;

    /** PLANRCVFLG: {char(1)} */
    protected String _planrcvflg;

    /** HTOPEFLG: {char(1)} */
    protected String _htopeflg;

    /** TRSOADDDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _trsoadddate;

    /** TRSOADDFLG: {char(1)} */
    protected String _trsoaddflg;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    /** PLANNAME: {varchar(60)} */
    protected String _planname;

    /** PLANPOST: {varchar(30)} */
    protected String _planpost;

    /** PLANADDRESS: {varchar(100)} */
    protected String _planaddress;

    /** PLANWAREHOUSENAME: {varchar(60)} */
    protected String _planwarehousename;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

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
        return "T_TRSOJT";
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
        if (_sojtid == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
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
        if (obj instanceof BsTTrsojt) {
            BsTTrsojt other = (BsTTrsojt)obj;
            if (!xSV(_sojtid, other._sojtid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sojtid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sojtid));
        sb.append(dm).append(xfND(_sojtkey));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_orderdate));
        sb.append(dm).append(xfND(_planseq));
        sb.append(dm).append(xfND(_planrcvdatetime));
        sb.append(dm).append(xfND(_beforeplanseq));
        sb.append(dm).append(xfND(_planrcvflg));
        sb.append(dm).append(xfND(_htopeflg));
        sb.append(dm).append(xfND(_trsoadddate));
        sb.append(dm).append(xfND(_trsoaddflg));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_planname));
        sb.append(dm).append(xfND(_planpost));
        sb.append(dm).append(xfND(_planaddress));
        sb.append(dm).append(xfND(_planwarehousename));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
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
        return "";
    }

    @Override
    public TTrsojt clone() {
        return (TTrsojt)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SOJTID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図ID
     * @return The value of the column 'SOJTID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSojtid() {
        checkSpecifiedProperty("sojtid");
        return _sojtid;
    }

    /**
     * [set] SOJTID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図ID
     * @param sojtid The value of the column 'SOJTID'. (basically NotNull if update: for the constraint)
     */
    public void setSojtid(Long sojtid) {
        registerModifiedProperty("sojtid");
        _sojtid = sojtid;
    }

    /**
     * [get] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @return The value of the column 'SOJTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSojtkey() {
        checkSpecifiedProperty("sojtkey");
        return _sojtkey;
    }

    /**
     * [set] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @param sojtkey The value of the column 'SOJTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSojtkey(java.math.BigDecimal sojtkey) {
        registerModifiedProperty("sojtkey");
        _sojtkey = sojtkey;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @return The value of the column 'ORDERDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderdate() {
        checkSpecifiedProperty("orderdate");
        return convertEmptyToNull(_orderdate);
    }

    /**
     * [set] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @param orderdate The value of the column 'ORDERDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderdate(String orderdate) {
        registerModifiedProperty("orderdate");
        _orderdate = orderdate;
    }

    /**
     * [get] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @return The value of the column 'PLANSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanseq() {
        checkSpecifiedProperty("planseq");
        return _planseq;
    }

    /**
     * [set] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @param planseq The value of the column 'PLANSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanseq(Long planseq) {
        registerModifiedProperty("planseq");
        _planseq = planseq;
    }

    /**
     * [get] PLANRCVDATETIME: {datetime2(26, 6)} <br>
     * 計画受信日時
     * @return The value of the column 'PLANRCVDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPlanrcvdatetime() {
        checkSpecifiedProperty("planrcvdatetime");
        return _planrcvdatetime;
    }

    /**
     * [set] PLANRCVDATETIME: {datetime2(26, 6)} <br>
     * 計画受信日時
     * @param planrcvdatetime The value of the column 'PLANRCVDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanrcvdatetime(java.sql.Timestamp planrcvdatetime) {
        registerModifiedProperty("planrcvdatetime");
        _planrcvdatetime = planrcvdatetime;
    }

    /**
     * [get] BEFOREPLANSEQ: {bigint(19)} <br>
     * 前回計画受信回数
     * @return The value of the column 'BEFOREPLANSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBeforeplanseq() {
        checkSpecifiedProperty("beforeplanseq");
        return _beforeplanseq;
    }

    /**
     * [set] BEFOREPLANSEQ: {bigint(19)} <br>
     * 前回計画受信回数
     * @param beforeplanseq The value of the column 'BEFOREPLANSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBeforeplanseq(Long beforeplanseq) {
        registerModifiedProperty("beforeplanseq");
        _beforeplanseq = beforeplanseq;
    }

    /**
     * [get] PLANRCVFLG: {char(1)} <br>
     * 計画受信フラグ
     * @return The value of the column 'PLANRCVFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanrcvflg() {
        checkSpecifiedProperty("planrcvflg");
        return convertEmptyToNull(_planrcvflg);
    }

    /**
     * [set] PLANRCVFLG: {char(1)} <br>
     * 計画受信フラグ
     * @param planrcvflg The value of the column 'PLANRCVFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanrcvflg(String planrcvflg) {
        registerModifiedProperty("planrcvflg");
        _planrcvflg = planrcvflg;
    }

    /**
     * [get] HTOPEFLG: {char(1)} <br>
     * HT操作フラグ
     * @return The value of the column 'HTOPEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtopeflg() {
        checkSpecifiedProperty("htopeflg");
        return convertEmptyToNull(_htopeflg);
    }

    /**
     * [set] HTOPEFLG: {char(1)} <br>
     * HT操作フラグ
     * @param htopeflg The value of the column 'HTOPEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtopeflg(String htopeflg) {
        registerModifiedProperty("htopeflg");
        _htopeflg = htopeflg;
    }

    /**
     * [get] TRSOADDDATE: {datetime2(26, 6)} <br>
     * 出庫予定作成日
     * @return The value of the column 'TRSOADDDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTrsoadddate() {
        checkSpecifiedProperty("trsoadddate");
        return _trsoadddate;
    }

    /**
     * [set] TRSOADDDATE: {datetime2(26, 6)} <br>
     * 出庫予定作成日
     * @param trsoadddate The value of the column 'TRSOADDDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsoadddate(java.sql.Timestamp trsoadddate) {
        registerModifiedProperty("trsoadddate");
        _trsoadddate = trsoadddate;
    }

    /**
     * [get] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @return The value of the column 'TRSOADDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrsoaddflg() {
        checkSpecifiedProperty("trsoaddflg");
        return convertEmptyToNull(_trsoaddflg);
    }

    /**
     * [set] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @param trsoaddflg The value of the column 'TRSOADDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsoaddflg(String trsoaddflg) {
        registerModifiedProperty("trsoaddflg");
        _trsoaddflg = trsoaddflg;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] PLANNAME: {varchar(60)} <br>
     * 特約店名称
     * @return The value of the column 'PLANNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanname() {
        checkSpecifiedProperty("planname");
        return convertEmptyToNull(_planname);
    }

    /**
     * [set] PLANNAME: {varchar(60)} <br>
     * 特約店名称
     * @param planname The value of the column 'PLANNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanname(String planname) {
        registerModifiedProperty("planname");
        _planname = planname;
    }

    /**
     * [get] PLANPOST: {varchar(30)} <br>
     * 郵便番号
     * @return The value of the column 'PLANPOST'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanpost() {
        checkSpecifiedProperty("planpost");
        return convertEmptyToNull(_planpost);
    }

    /**
     * [set] PLANPOST: {varchar(30)} <br>
     * 郵便番号
     * @param planpost The value of the column 'PLANPOST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanpost(String planpost) {
        registerModifiedProperty("planpost");
        _planpost = planpost;
    }

    /**
     * [get] PLANADDRESS: {varchar(100)} <br>
     * 住所
     * @return The value of the column 'PLANADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanaddress() {
        checkSpecifiedProperty("planaddress");
        return convertEmptyToNull(_planaddress);
    }

    /**
     * [set] PLANADDRESS: {varchar(100)} <br>
     * 住所
     * @param planaddress The value of the column 'PLANADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanaddress(String planaddress) {
        registerModifiedProperty("planaddress");
        _planaddress = planaddress;
    }

    /**
     * [get] PLANWAREHOUSENAME: {varchar(60)} <br>
     * 倉庫名
     * @return The value of the column 'PLANWAREHOUSENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanwarehousename() {
        checkSpecifiedProperty("planwarehousename");
        return convertEmptyToNull(_planwarehousename);
    }

    /**
     * [set] PLANWAREHOUSENAME: {varchar(60)} <br>
     * 倉庫名
     * @param planwarehousename The value of the column 'PLANWAREHOUSENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanwarehousename(String planwarehousename) {
        registerModifiedProperty("planwarehousename");
        _planwarehousename = planwarehousename;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
