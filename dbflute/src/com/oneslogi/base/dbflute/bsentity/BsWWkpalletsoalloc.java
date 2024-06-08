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
 * The entity of W_WKPALLETSOALLOC as TABLE. <br>
 * 棚出引当用パレットはり紙情報ワークテーブル
 * <pre>
 * [primary-key]
 *     WKPALLETSOALLOC_ID
 *
 * [column]
 *     WKPALLETSOALLOC_ID, TRPALLET_ID, PALLETNO, LOT_ID, RECEIVE_PLAN_H_ID, RCVLINENO, PRINTEDFLG, PRINTINGDATE, FIRMCARRYNO, TRANSPORTNO, SOURCECD, SCHDATE, RECEIVECD, RCVDATE, RECEIVEDATE, LOCATION_ID, PRODUCT_CD, LOT3, LIMITDATE, BATARTICLESIGN, OTHERLOT1, RECEIVEQTYCASE, RECEIVEQTYBOWL, RECEIVEQTY, RESTQTYCASE, RESTQTYBOWL, RESTQTY, ALLOCQTY1, TEMPALLOCQTYCASE, TEMPALLOCQTYBOWL, FULLPALLETFLG, PALLETSTS, PLURALPRODUCTIONKBN, PALLETCUTTINGKBN, RCVPALLETNO, PALLETADDFLG, ACCEPTUSERCD, ACCEPTDATE, CLIENT_ID, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKPALLETSOALLOC_ID
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
 * Long wkpalletsoallocId = entity.getWkpalletsoallocId();
 * Long trpalletId = entity.getTrpalletId();
 * Long palletno = entity.getPalletno();
 * Long lotId = entity.getLotId();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long rcvlineno = entity.getRcvlineno();
 * String printedflg = entity.getPrintedflg();
 * String printingdate = entity.getPrintingdate();
 * String firmcarryno = entity.getFirmcarryno();
 * String transportno = entity.getTransportno();
 * String sourcecd = entity.getSourcecd();
 * String schdate = entity.getSchdate();
 * String receivecd = entity.getReceivecd();
 * String rcvdate = entity.getRcvdate();
 * String receivedate = entity.getReceivedate();
 * Long locationId = entity.getLocationId();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String limitdate = entity.getLimitdate();
 * String batarticlesign = entity.getBatarticlesign();
 * String otherlot1 = entity.getOtherlot1();
 * java.math.BigDecimal receiveqtycase = entity.getReceiveqtycase();
 * java.math.BigDecimal receiveqtybowl = entity.getReceiveqtybowl();
 * java.math.BigDecimal receiveqty = entity.getReceiveqty();
 * java.math.BigDecimal restqtycase = entity.getRestqtycase();
 * java.math.BigDecimal restqtybowl = entity.getRestqtybowl();
 * java.math.BigDecimal restqty = entity.getRestqty();
 * java.math.BigDecimal allocqty1 = entity.getAllocqty1();
 * java.math.BigDecimal tempallocqtycase = entity.getTempallocqtycase();
 * java.math.BigDecimal tempallocqtybowl = entity.getTempallocqtybowl();
 * String fullpalletflg = entity.getFullpalletflg();
 * String palletsts = entity.getPalletsts();
 * String pluralproductionkbn = entity.getPluralproductionkbn();
 * String palletcuttingkbn = entity.getPalletcuttingkbn();
 * String rcvpalletno = entity.getRcvpalletno();
 * String palletaddflg = entity.getPalletaddflg();
 * String acceptusercd = entity.getAcceptusercd();
 * java.sql.Timestamp acceptdate = entity.getAcceptdate();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWkpalletsoallocId(wkpalletsoallocId);
 * entity.setTrpalletId(trpalletId);
 * entity.setPalletno(palletno);
 * entity.setLotId(lotId);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setRcvlineno(rcvlineno);
 * entity.setPrintedflg(printedflg);
 * entity.setPrintingdate(printingdate);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setTransportno(transportno);
 * entity.setSourcecd(sourcecd);
 * entity.setSchdate(schdate);
 * entity.setReceivecd(receivecd);
 * entity.setRcvdate(rcvdate);
 * entity.setReceivedate(receivedate);
 * entity.setLocationId(locationId);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLimitdate(limitdate);
 * entity.setBatarticlesign(batarticlesign);
 * entity.setOtherlot1(otherlot1);
 * entity.setReceiveqtycase(receiveqtycase);
 * entity.setReceiveqtybowl(receiveqtybowl);
 * entity.setReceiveqty(receiveqty);
 * entity.setRestqtycase(restqtycase);
 * entity.setRestqtybowl(restqtybowl);
 * entity.setRestqty(restqty);
 * entity.setAllocqty1(allocqty1);
 * entity.setTempallocqtycase(tempallocqtycase);
 * entity.setTempallocqtybowl(tempallocqtybowl);
 * entity.setFullpalletflg(fullpalletflg);
 * entity.setPalletsts(palletsts);
 * entity.setPluralproductionkbn(pluralproductionkbn);
 * entity.setPalletcuttingkbn(palletcuttingkbn);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setPalletaddflg(palletaddflg);
 * entity.setAcceptusercd(acceptusercd);
 * entity.setAcceptdate(acceptdate);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
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
public abstract class BsWWkpalletsoalloc extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _wkpalletsoallocId;

    /** TRPALLET_ID: {NotNull, bigint(19)} */
    protected Long _trpalletId;

    /** PALLETNO: {NotNull, bigint(19)} */
    protected Long _palletno;

    /** LOT_ID: {bigint(19)} */
    protected Long _lotId;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    protected Long _receivePlanHId;

    /** RCVLINENO: {bigint(19)} */
    protected Long _rcvlineno;

    /** PRINTEDFLG: {NotNull, char(1)} */
    protected String _printedflg;

    /** PRINTINGDATE: {NotNull, varchar(8)} */
    protected String _printingdate;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** TRANSPORTNO: {varchar(30)} */
    protected String _transportno;

    /** SOURCECD: {varchar(30)} */
    protected String _sourcecd;

    /** SCHDATE: {varchar(8)} */
    protected String _schdate;

    /** RECEIVECD: {NotNull, varchar(30)} */
    protected String _receivecd;

    /** RCVDATE: {varchar(8)} */
    protected String _rcvdate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** LOT3: {NotNull, varchar(30)} */
    protected String _lot3;

    /** LIMITDATE: {NotNull, varchar(8)} */
    protected String _limitdate;

    /** BATARTICLESIGN: {varchar(30)} */
    protected String _batarticlesign;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receiveqtycase;

    /** RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receiveqtybowl;

    /** RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receiveqty;

    /** RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _restqtycase;

    /** RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _restqtybowl;

    /** RESTQTY: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _restqty;

    /** ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocqty1;

    /** TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _tempallocqtycase;

    /** TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _tempallocqtybowl;

    /** FULLPALLETFLG: {NotNull, char(1), default=[(0)]} */
    protected String _fullpalletflg;

    /** PALLETSTS: {NotNull, char(1), default=[(0)]} */
    protected String _palletsts;

    /** PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} */
    protected String _pluralproductionkbn;

    /** PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} */
    protected String _palletcuttingkbn;

    /** RCVPALLETNO: {varchar(30)} */
    protected String _rcvpalletno;

    /** PALLETADDFLG: {char(1), default=[(2)]} */
    protected String _palletaddflg;

    /** ACCEPTUSERCD: {varchar(30)} */
    protected String _acceptusercd;

    /** ACCEPTDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _acceptdate;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

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
        return "W_WKPALLETSOALLOC";
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
        if (_wkpalletsoallocId == null) { return false; }
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
        if (obj instanceof BsWWkpalletsoalloc) {
            BsWWkpalletsoalloc other = (BsWWkpalletsoalloc)obj;
            if (!xSV(_wkpalletsoallocId, other._wkpalletsoallocId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _wkpalletsoallocId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_wkpalletsoallocId));
        sb.append(dm).append(xfND(_trpalletId));
        sb.append(dm).append(xfND(_palletno));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_printingdate));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_transportno));
        sb.append(dm).append(xfND(_sourcecd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_receivecd));
        sb.append(dm).append(xfND(_rcvdate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_batarticlesign));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_receiveqtycase));
        sb.append(dm).append(xfND(_receiveqtybowl));
        sb.append(dm).append(xfND(_receiveqty));
        sb.append(dm).append(xfND(_restqtycase));
        sb.append(dm).append(xfND(_restqtybowl));
        sb.append(dm).append(xfND(_restqty));
        sb.append(dm).append(xfND(_allocqty1));
        sb.append(dm).append(xfND(_tempallocqtycase));
        sb.append(dm).append(xfND(_tempallocqtybowl));
        sb.append(dm).append(xfND(_fullpalletflg));
        sb.append(dm).append(xfND(_palletsts));
        sb.append(dm).append(xfND(_pluralproductionkbn));
        sb.append(dm).append(xfND(_palletcuttingkbn));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_palletaddflg));
        sb.append(dm).append(xfND(_acceptusercd));
        sb.append(dm).append(xfND(_acceptdate));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
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
    public WWkpalletsoalloc clone() {
        return (WWkpalletsoalloc)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報ワークID
     * @return The value of the column 'WKPALLETSOALLOC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWkpalletsoallocId() {
        checkSpecifiedProperty("wkpalletsoallocId");
        return _wkpalletsoallocId;
    }

    /**
     * [set] WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報ワークID
     * @param wkpalletsoallocId The value of the column 'WKPALLETSOALLOC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWkpalletsoallocId(Long wkpalletsoallocId) {
        registerModifiedProperty("wkpalletsoallocId");
        _wkpalletsoallocId = wkpalletsoallocId;
    }

    /**
     * [get] TRPALLET_ID: {NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrpalletId() {
        checkSpecifiedProperty("trpalletId");
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrpalletId(Long trpalletId) {
        registerModifiedProperty("trpalletId");
        _trpalletId = trpalletId;
    }

    /**
     * [get] PALLETNO: {NotNull, bigint(19)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (basically NotNull if selected: for the constraint)
     */
    public Long getPalletno() {
        checkSpecifiedProperty("palletno");
        return _palletno;
    }

    /**
     * [set] PALLETNO: {NotNull, bigint(19)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (basically NotNull if update: for the constraint)
     */
    public void setPalletno(Long palletno) {
        registerModifiedProperty("palletno");
        _palletno = palletno;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @return The value of the column 'RCVLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1)} <br>
     * はり紙印刷区分
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1)} <br>
     * はり紙印刷区分
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] PRINTINGDATE: {NotNull, varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PRINTINGDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintingdate() {
        checkSpecifiedProperty("printingdate");
        return convertEmptyToNull(_printingdate);
    }

    /**
     * [set] PRINTINGDATE: {NotNull, varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PRINTINGDATE'. (basically NotNull if update: for the constraint)
     */
    public void setPrintingdate(String printingdate) {
        registerModifiedProperty("printingdate");
        _printingdate = printingdate;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmcarryno() {
        checkSpecifiedProperty("firmcarryno");
        return convertEmptyToNull(_firmcarryno);
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmcarryno(String firmcarryno) {
        registerModifiedProperty("firmcarryno");
        _firmcarryno = firmcarryno;
    }

    /**
     * [get] TRANSPORTNO: {varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'TRANSPORTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportno() {
        checkSpecifiedProperty("transportno");
        return convertEmptyToNull(_transportno);
    }

    /**
     * [set] TRANSPORTNO: {varchar(30)} <br>
     * 整理番号
     * @param transportno The value of the column 'TRANSPORTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportno(String transportno) {
        registerModifiedProperty("transportno");
        _transportno = transportno;
    }

    /**
     * [get] SOURCECD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourcecd() {
        checkSpecifiedProperty("sourcecd");
        return convertEmptyToNull(_sourcecd);
    }

    /**
     * [set] SOURCECD: {varchar(30)} <br>
     * 発送元CD
     * @param sourcecd The value of the column 'SOURCECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourcecd(String sourcecd) {
        registerModifiedProperty("sourcecd");
        _sourcecd = sourcecd;
    }

    /**
     * [get] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] RECEIVECD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'RECEIVECD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceivecd() {
        checkSpecifiedProperty("receivecd");
        return convertEmptyToNull(_receivecd);
    }

    /**
     * [set] RECEIVECD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @param receivecd The value of the column 'RECEIVECD'. (basically NotNull if update: for the constraint)
     */
    public void setReceivecd(String receivecd) {
        registerModifiedProperty("receivecd");
        _receivecd = receivecd;
    }

    /**
     * [get] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvdate() {
        checkSpecifiedProperty("rcvdate");
        return convertEmptyToNull(_rcvdate);
    }

    /**
     * [set] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvdate(String rcvdate) {
        registerModifiedProperty("rcvdate");
        _rcvdate = rcvdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT3: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (basically NotNull if selected: for the constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (basically NotNull if update: for the constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LIMITDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (basically NotNull if update: for the constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] BATARTICLESIGN: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'BATARTICLESIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatarticlesign() {
        checkSpecifiedProperty("batarticlesign");
        return convertEmptyToNull(_batarticlesign);
    }

    /**
     * [set] BATARTICLESIGN: {varchar(30)} <br>
     * 製造記号
     * @param batarticlesign The value of the column 'BATARTICLESIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatarticlesign(String batarticlesign) {
        registerModifiedProperty("batarticlesign");
        _batarticlesign = batarticlesign;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（ケース）
     * @return The value of the column 'RECEIVEQTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceiveqtycase() {
        checkSpecifiedProperty("receiveqtycase");
        return _receiveqtycase;
    }

    /**
     * [set] RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（ケース）
     * @param receiveqtycase The value of the column 'RECEIVEQTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveqtycase(java.math.BigDecimal receiveqtycase) {
        registerModifiedProperty("receiveqtycase");
        _receiveqtycase = receiveqtycase;
    }

    /**
     * [get] RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（カートン）
     * @return The value of the column 'RECEIVEQTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceiveqtybowl() {
        checkSpecifiedProperty("receiveqtybowl");
        return _receiveqtybowl;
    }

    /**
     * [set] RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（カートン）
     * @param receiveqtybowl The value of the column 'RECEIVEQTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveqtybowl(java.math.BigDecimal receiveqtybowl) {
        registerModifiedProperty("receiveqtybowl");
        _receiveqtybowl = receiveqtybowl;
    }

    /**
     * [get] RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装入庫時数量
     * @return The value of the column 'RECEIVEQTY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceiveqty() {
        checkSpecifiedProperty("receiveqty");
        return _receiveqty;
    }

    /**
     * [set] RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装入庫時数量
     * @param receiveqty The value of the column 'RECEIVEQTY'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveqty(java.math.BigDecimal receiveqty) {
        registerModifiedProperty("receiveqty");
        _receiveqty = receiveqty;
    }

    /**
     * [get] RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（ケース）
     * @return The value of the column 'RESTQTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRestqtycase() {
        checkSpecifiedProperty("restqtycase");
        return _restqtycase;
    }

    /**
     * [set] RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（ケース）
     * @param restqtycase The value of the column 'RESTQTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setRestqtycase(java.math.BigDecimal restqtycase) {
        registerModifiedProperty("restqtycase");
        _restqtycase = restqtycase;
    }

    /**
     * [get] RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（カートン）
     * @return The value of the column 'RESTQTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRestqtybowl() {
        checkSpecifiedProperty("restqtybowl");
        return _restqtybowl;
    }

    /**
     * [set] RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（カートン）
     * @param restqtybowl The value of the column 'RESTQTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setRestqtybowl(java.math.BigDecimal restqtybowl) {
        registerModifiedProperty("restqtybowl");
        _restqtybowl = restqtybowl;
    }

    /**
     * [get] RESTQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装残数量
     * @return The value of the column 'RESTQTY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRestqty() {
        checkSpecifiedProperty("restqty");
        return _restqty;
    }

    /**
     * [set] RESTQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装残数量
     * @param restqty The value of the column 'RESTQTY'. (basically NotNull if update: for the constraint)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        registerModifiedProperty("restqty");
        _restqty = restqty;
    }

    /**
     * [get] ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当数量
     * @return The value of the column 'ALLOCQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAllocqty1() {
        checkSpecifiedProperty("allocqty1");
        return _allocqty1;
    }

    /**
     * [set] ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当数量
     * @param allocqty1 The value of the column 'ALLOCQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setAllocqty1(java.math.BigDecimal allocqty1) {
        registerModifiedProperty("allocqty1");
        _allocqty1 = allocqty1;
    }

    /**
     * [get] TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 仮引当数量(ケース)
     * @return The value of the column 'TEMPALLOCQTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTempallocqtycase() {
        checkSpecifiedProperty("tempallocqtycase");
        return _tempallocqtycase;
    }

    /**
     * [set] TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 仮引当数量(ケース)
     * @param tempallocqtycase The value of the column 'TEMPALLOCQTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setTempallocqtycase(java.math.BigDecimal tempallocqtycase) {
        registerModifiedProperty("tempallocqtycase");
        _tempallocqtycase = tempallocqtycase;
    }

    /**
     * [get] TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 仮引当数量(カートン)
     * @return The value of the column 'TEMPALLOCQTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTempallocqtybowl() {
        checkSpecifiedProperty("tempallocqtybowl");
        return _tempallocqtybowl;
    }

    /**
     * [set] TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 仮引当数量(カートン)
     * @param tempallocqtybowl The value of the column 'TEMPALLOCQTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setTempallocqtybowl(java.math.BigDecimal tempallocqtybowl) {
        registerModifiedProperty("tempallocqtybowl");
        _tempallocqtybowl = tempallocqtybowl;
    }

    /**
     * [get] FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * 単品パレットフラグ
     * @return The value of the column 'FULLPALLETFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getFullpalletflg() {
        checkSpecifiedProperty("fullpalletflg");
        return convertEmptyToNull(_fullpalletflg);
    }

    /**
     * [set] FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * 単品パレットフラグ
     * @param fullpalletflg The value of the column 'FULLPALLETFLG'. (basically NotNull if update: for the constraint)
     */
    public void setFullpalletflg(String fullpalletflg) {
        registerModifiedProperty("fullpalletflg");
        _fullpalletflg = fullpalletflg;
    }

    /**
     * [get] PALLETSTS: {NotNull, char(1), default=[(0)]} <br>
     * パレットはり紙ステータス
     * @return The value of the column 'PALLETSTS'. (basically NotNull if selected: for the constraint)
     */
    public String getPalletsts() {
        checkSpecifiedProperty("palletsts");
        return convertEmptyToNull(_palletsts);
    }

    /**
     * [set] PALLETSTS: {NotNull, char(1), default=[(0)]} <br>
     * パレットはり紙ステータス
     * @param palletsts The value of the column 'PALLETSTS'. (basically NotNull if update: for the constraint)
     */
    public void setPalletsts(String palletsts) {
        registerModifiedProperty("palletsts");
        _palletsts = palletsts;
    }

    /**
     * [get] PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * 複数製造月日区分
     * @return The value of the column 'PLURALPRODUCTIONKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getPluralproductionkbn() {
        checkSpecifiedProperty("pluralproductionkbn");
        return convertEmptyToNull(_pluralproductionkbn);
    }

    /**
     * [set] PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * 複数製造月日区分
     * @param pluralproductionkbn The value of the column 'PLURALPRODUCTIONKBN'. (basically NotNull if update: for the constraint)
     */
    public void setPluralproductionkbn(String pluralproductionkbn) {
        registerModifiedProperty("pluralproductionkbn");
        _pluralproductionkbn = pluralproductionkbn;
    }

    /**
     * [get] PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * パレット分割区分
     * @return The value of the column 'PALLETCUTTINGKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getPalletcuttingkbn() {
        checkSpecifiedProperty("palletcuttingkbn");
        return convertEmptyToNull(_palletcuttingkbn);
    }

    /**
     * [set] PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * パレット分割区分
     * @param palletcuttingkbn The value of the column 'PALLETCUTTINGKBN'. (basically NotNull if update: for the constraint)
     */
    public void setPalletcuttingkbn(String palletcuttingkbn) {
        registerModifiedProperty("palletcuttingkbn");
        _palletcuttingkbn = palletcuttingkbn;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（08需給）
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（08需給）
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] PALLETADDFLG: {char(1), default=[(2)]} <br>
     * はり紙作成フラグ
     * @return The value of the column 'PALLETADDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletaddflg() {
        checkSpecifiedProperty("palletaddflg");
        return convertEmptyToNull(_palletaddflg);
    }

    /**
     * [set] PALLETADDFLG: {char(1), default=[(2)]} <br>
     * はり紙作成フラグ
     * @param palletaddflg The value of the column 'PALLETADDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletaddflg(String palletaddflg) {
        registerModifiedProperty("palletaddflg");
        _palletaddflg = palletaddflg;
    }

    /**
     * [get] ACCEPTUSERCD: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @return The value of the column 'ACCEPTUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAcceptusercd() {
        checkSpecifiedProperty("acceptusercd");
        return convertEmptyToNull(_acceptusercd);
    }

    /**
     * [set] ACCEPTUSERCD: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @param acceptusercd The value of the column 'ACCEPTUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptusercd(String acceptusercd) {
        registerModifiedProperty("acceptusercd");
        _acceptusercd = acceptusercd;
    }

    /**
     * [get] ACCEPTDATE: {datetime2(26, 6)} <br>
     * 受入検品日時
     * @return The value of the column 'ACCEPTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAcceptdate() {
        checkSpecifiedProperty("acceptdate");
        return _acceptdate;
    }

    /**
     * [set] ACCEPTDATE: {datetime2(26, 6)} <br>
     * 受入検品日時
     * @param acceptdate The value of the column 'ACCEPTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptdate(java.sql.Timestamp acceptdate) {
        registerModifiedProperty("acceptdate");
        _acceptdate = acceptdate;
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
