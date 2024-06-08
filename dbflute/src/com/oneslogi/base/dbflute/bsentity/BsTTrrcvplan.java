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
 * The entity of T_TRRCVPLAN as TABLE. <br>
 * 格納指示情報
 * <pre>
 * [primary-key]
 *     TRRCVPLAN_ID
 *
 * [column]
 *     TRRCVPLAN_ID, RECEIVE_PLAN_H_ID, RCVLINENO, RCVPLANSTS, PRODUCT_CD, LOT1, LOT3, LOT4, LOT2, WAREHOUSECD, TOLOCCD, TRRCVQTY1, RCVINNO, PRINTEDFLG, LOADQTY1, RECEIVEDQTY1, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVPLAN_ID
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
 * Long trrcvplanId = entity.getTrrcvplanId();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long rcvlineno = entity.getRcvlineno();
 * java.math.BigDecimal rcvplansts = entity.getRcvplansts();
 * String productCd = entity.getProductCd();
 * String lot1 = entity.getLot1();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot2 = entity.getLot2();
 * String warehousecd = entity.getWarehousecd();
 * String toloccd = entity.getToloccd();
 * java.math.BigDecimal trrcvqty1 = entity.getTrrcvqty1();
 * String rcvinno = entity.getRcvinno();
 * java.math.BigDecimal printedflg = entity.getPrintedflg();
 * java.math.BigDecimal loadqty1 = entity.getLoadqty1();
 * java.math.BigDecimal receivedqty1 = entity.getReceivedqty1();
 * java.math.BigDecimal receivePlanBId = entity.getReceivePlanBId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrrcvplanId(trrcvplanId);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setRcvlineno(rcvlineno);
 * entity.setRcvplansts(rcvplansts);
 * entity.setProductCd(productCd);
 * entity.setLot1(lot1);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot2(lot2);
 * entity.setWarehousecd(warehousecd);
 * entity.setToloccd(toloccd);
 * entity.setTrrcvqty1(trrcvqty1);
 * entity.setRcvinno(rcvinno);
 * entity.setPrintedflg(printedflg);
 * entity.setLoadqty1(loadqty1);
 * entity.setReceivedqty1(receivedqty1);
 * entity.setReceivePlanBId(receivePlanBId);
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
public abstract class BsTTrrcvplan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trrcvplanId;

    /** RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)} */
    protected Long _receivePlanHId;

    /** RCVLINENO: {NotNull, bigint(19)} */
    protected Long _rcvlineno;

    /** RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _rcvplansts;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** WAREHOUSECD: {varchar(30)} */
    protected String _warehousecd;

    /** TOLOCCD: {IX+, varchar(30)} */
    protected String _toloccd;

    /** TRRCVQTY1: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _trrcvqty1;

    /** RCVINNO: {varchar(30)} */
    protected String _rcvinno;

    /** PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _printedflg;

    /** LOADQTY1: {decimal(16, 6)} */
    protected java.math.BigDecimal _loadqty1;

    /** RECEIVEDQTY1: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receivedqty1;

    /** RECEIVE_PLAN_B_ID: {decimal(16, 6)} */
    protected java.math.BigDecimal _receivePlanBId;

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
        return "T_TRRCVPLAN";
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
        if (_trrcvplanId == null) { return false; }
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
        if (obj instanceof BsTTrrcvplan) {
            BsTTrrcvplan other = (BsTTrrcvplan)obj;
            if (!xSV(_trrcvplanId, other._trrcvplanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trrcvplanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trrcvplanId));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_rcvplansts));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_toloccd));
        sb.append(dm).append(xfND(_trrcvqty1));
        sb.append(dm).append(xfND(_rcvinno));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_loadqty1));
        sb.append(dm).append(xfND(_receivedqty1));
        sb.append(dm).append(xfND(_receivePlanBId));
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
    public TTrrcvplan clone() {
        return (TTrrcvplan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 格納指示キー
     * @return The value of the column 'TRRCVPLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrrcvplanId() {
        checkSpecifiedProperty("trrcvplanId");
        return _trrcvplanId;
    }

    /**
     * [set] TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 格納指示キー
     * @param trrcvplanId The value of the column 'TRRCVPLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrrcvplanId(Long trrcvplanId) {
        registerModifiedProperty("trrcvplanId");
        _trrcvplanId = trrcvplanId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @return The value of the column 'RCVLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @param rcvlineno The value of the column 'RCVLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ステータス
     * @return The value of the column 'RCVPLANSTS'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvplansts() {
        checkSpecifiedProperty("rcvplansts");
        return _rcvplansts;
    }

    /**
     * [set] RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ステータス
     * @param rcvplansts The value of the column 'RCVPLANSTS'. (basically NotNull if update: for the constraint)
     */
    public void setRcvplansts(java.math.BigDecimal rcvplansts) {
        registerModifiedProperty("rcvplansts");
        _rcvplansts = rcvplansts;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] TOLOCCD: {IX+, varchar(30)} <br>
     * 格納予定ロケーションCD
     * @return The value of the column 'TOLOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getToloccd() {
        checkSpecifiedProperty("toloccd");
        return convertEmptyToNull(_toloccd);
    }

    /**
     * [set] TOLOCCD: {IX+, varchar(30)} <br>
     * 格納予定ロケーションCD
     * @param toloccd The value of the column 'TOLOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToloccd(String toloccd) {
        registerModifiedProperty("toloccd");
        _toloccd = toloccd;
    }

    /**
     * [get] TRRCVQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量１（バラ）
     * @return The value of the column 'TRRCVQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTrrcvqty1() {
        checkSpecifiedProperty("trrcvqty1");
        return _trrcvqty1;
    }

    /**
     * [set] TRRCVQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量１（バラ）
     * @param trrcvqty1 The value of the column 'TRRCVQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrrcvqty1(java.math.BigDecimal trrcvqty1) {
        registerModifiedProperty("trrcvqty1");
        _trrcvqty1 = trrcvqty1;
    }

    /**
     * [get] RCVINNO: {varchar(30)} <br>
     * 格納順
     * @return The value of the column 'RCVINNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvinno() {
        checkSpecifiedProperty("rcvinno");
        return convertEmptyToNull(_rcvinno);
    }

    /**
     * [set] RCVINNO: {varchar(30)} <br>
     * 格納順
     * @param rcvinno The value of the column 'RCVINNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvinno(String rcvinno) {
        registerModifiedProperty("rcvinno");
        _rcvinno = rcvinno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納予定リスト発行済フラグ
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納予定リスト発行済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(java.math.BigDecimal printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] LOADQTY1: {decimal(16, 6)} <br>
     * パレット作成済数量１（バラ）
     * @return The value of the column 'LOADQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getLoadqty1() {
        checkSpecifiedProperty("loadqty1");
        return _loadqty1;
    }

    /**
     * [set] LOADQTY1: {decimal(16, 6)} <br>
     * パレット作成済数量１（バラ）
     * @param loadqty1 The value of the column 'LOADQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoadqty1(java.math.BigDecimal loadqty1) {
        registerModifiedProperty("loadqty1");
        _loadqty1 = loadqty1;
    }

    /**
     * [get] RECEIVEDQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納実績数量１（バラ）
     * @return The value of the column 'RECEIVEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceivedqty1() {
        checkSpecifiedProperty("receivedqty1");
        return _receivedqty1;
    }

    /**
     * [set] RECEIVEDQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納実績数量１（バラ）
     * @param receivedqty1 The value of the column 'RECEIVEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedqty1(java.math.BigDecimal receivedqty1) {
        registerModifiedProperty("receivedqty1");
        _receivedqty1 = receivedqty1;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanBId(java.math.BigDecimal receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
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
