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
 * The entity of T_TREXAMRESULT as TABLE. <br>
 * 検査実績
 * <pre>
 * [primary-key]
 *     TREXAMRESULT_ID
 *
 * [column]
 *     TREXAMRESULT_ID, CLIENT_ID, CENTER_ID, SUPPLIERRCVNO, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOT_ID, EXAMSTS, EXAMENDSTS, ADDFLG, RECEIVEDATE, SENDFLG, EXAMQTY, RES40QTY, INFERIORQTY, NOTEXAMQTY, FIRSTEXAMSENDFLG, QUALITYEXAMFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TREXAMRESULT_ID
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
 * Long trexamresultId = entity.getTrexamresultId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String productCd = entity.getProductCd();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot5 = entity.getLot5();
 * String otherlot2 = entity.getOtherlot2();
 * String otherlot3 = entity.getOtherlot3();
 * String otherlot4 = entity.getOtherlot4();
 * java.math.BigDecimal otherlot5 = entity.getOtherlot5();
 * java.math.BigDecimal damageflg = entity.getDamageflg();
 * java.math.BigDecimal noshippingflg = entity.getNoshippingflg();
 * java.math.BigDecimal foreigncargoflg = entity.getForeigncargoflg();
 * java.math.BigDecimal customsreleaseflg = entity.getCustomsreleaseflg();
 * java.math.BigDecimal taxflg = entity.getTaxflg();
 * Long lotId = entity.getLotId();
 * String examsts = entity.getExamsts();
 * String examendsts = entity.getExamendsts();
 * String addflg = entity.getAddflg();
 * String receivedate = entity.getReceivedate();
 * String sendflg = entity.getSendflg();
 * java.math.BigDecimal examqty = entity.getExamqty();
 * java.math.BigDecimal res40qty = entity.getRes40qty();
 * java.math.BigDecimal inferiorqty = entity.getInferiorqty();
 * java.math.BigDecimal notexamqty = entity.getNotexamqty();
 * String firstexamsendflg = entity.getFirstexamsendflg();
 * String qualityexamflg = entity.getQualityexamflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrexamresultId(trexamresultId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setProductCd(productCd);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot5(lot5);
 * entity.setOtherlot2(otherlot2);
 * entity.setOtherlot3(otherlot3);
 * entity.setOtherlot4(otherlot4);
 * entity.setOtherlot5(otherlot5);
 * entity.setDamageflg(damageflg);
 * entity.setNoshippingflg(noshippingflg);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setCustomsreleaseflg(customsreleaseflg);
 * entity.setTaxflg(taxflg);
 * entity.setLotId(lotId);
 * entity.setExamsts(examsts);
 * entity.setExamendsts(examendsts);
 * entity.setAddflg(addflg);
 * entity.setReceivedate(receivedate);
 * entity.setSendflg(sendflg);
 * entity.setExamqty(examqty);
 * entity.setRes40qty(res40qty);
 * entity.setInferiorqty(inferiorqty);
 * entity.setNotexamqty(notexamqty);
 * entity.setFirstexamsendflg(firstexamsendflg);
 * entity.setQualityexamflg(qualityexamflg);
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
public abstract class BsTTrexamresult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trexamresultId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** SUPPLIERRCVNO: {varchar(60)} */
    protected String _supplierrcvno;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT5: {varchar(8)} */
    protected String _lot5;

    /** OTHERLOT2: {varchar(60)} */
    protected String _otherlot2;

    /** OTHERLOT3: {varchar(60)} */
    protected String _otherlot3;

    /** OTHERLOT4: {varchar(60)} */
    protected String _otherlot4;

    /** OTHERLOT5: {decimal(16, 6)} */
    protected java.math.BigDecimal _otherlot5;

    /** DAMAGEFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _damageflg;

    /** NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _noshippingflg;

    /** FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _customsreleaseflg;

    /** TAXFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _taxflg;

    /** LOT_ID: {bigint(19)} */
    protected Long _lotId;

    /** EXAMSTS: {char(1), default=[(0)]} */
    protected String _examsts;

    /** EXAMENDSTS: {char(1), default=[(0)]} */
    protected String _examendsts;

    /** ADDFLG: {char(1)} */
    protected String _addflg;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** SENDFLG: {char(1)} */
    protected String _sendflg;

    /** EXAMQTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _examqty;

    /** RES40QTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _res40qty;

    /** INFERIORQTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _inferiorqty;

    /** NOTEXAMQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _notexamqty;

    /** FIRSTEXAMSENDFLG: {char(1)} */
    protected String _firstexamsendflg;

    /** QUALITYEXAMFLG: {char(1), default=[(0)]} */
    protected String _qualityexamflg;

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
        return "T_TREXAMRESULT";
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
        if (_trexamresultId == null) { return false; }
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
        if (obj instanceof BsTTrexamresult) {
            BsTTrexamresult other = (BsTTrexamresult)obj;
            if (!xSV(_trexamresultId, other._trexamresultId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trexamresultId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trexamresultId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot5));
        sb.append(dm).append(xfND(_otherlot2));
        sb.append(dm).append(xfND(_otherlot3));
        sb.append(dm).append(xfND(_otherlot4));
        sb.append(dm).append(xfND(_otherlot5));
        sb.append(dm).append(xfND(_damageflg));
        sb.append(dm).append(xfND(_noshippingflg));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_customsreleaseflg));
        sb.append(dm).append(xfND(_taxflg));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_examsts));
        sb.append(dm).append(xfND(_examendsts));
        sb.append(dm).append(xfND(_addflg));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_sendflg));
        sb.append(dm).append(xfND(_examqty));
        sb.append(dm).append(xfND(_res40qty));
        sb.append(dm).append(xfND(_inferiorqty));
        sb.append(dm).append(xfND(_notexamqty));
        sb.append(dm).append(xfND(_firstexamsendflg));
        sb.append(dm).append(xfND(_qualityexamflg));
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
    public TTrexamresult clone() {
        return (TTrexamresult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績ID
     * @return The value of the column 'TREXAMRESULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrexamresultId() {
        checkSpecifiedProperty("trexamresultId");
        return _trexamresultId;
    }

    /**
     * [set] TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績ID
     * @param trexamresultId The value of the column 'TREXAMRESULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrexamresultId(Long trexamresultId) {
        registerModifiedProperty("trexamresultId");
        _trexamresultId = trexamresultId;
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
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
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
     * [get] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @return The value of the column 'LOT5'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot5() {
        checkSpecifiedProperty("lot5");
        return convertEmptyToNull(_lot5);
    }

    /**
     * [set] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @param lot5 The value of the column 'LOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot5(String lot5) {
        registerModifiedProperty("lot5");
        _lot5 = lot5;
    }

    /**
     * [get] OTHERLOT2: {varchar(60)} <br>
     * その他属性２
     * @return The value of the column 'OTHERLOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot2() {
        checkSpecifiedProperty("otherlot2");
        return convertEmptyToNull(_otherlot2);
    }

    /**
     * [set] OTHERLOT2: {varchar(60)} <br>
     * その他属性２
     * @param otherlot2 The value of the column 'OTHERLOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot2(String otherlot2) {
        registerModifiedProperty("otherlot2");
        _otherlot2 = otherlot2;
    }

    /**
     * [get] OTHERLOT3: {varchar(60)} <br>
     * その他属性３
     * @return The value of the column 'OTHERLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot3() {
        checkSpecifiedProperty("otherlot3");
        return convertEmptyToNull(_otherlot3);
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * その他属性３
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot3(String otherlot3) {
        registerModifiedProperty("otherlot3");
        _otherlot3 = otherlot3;
    }

    /**
     * [get] OTHERLOT4: {varchar(60)} <br>
     * その他属性４
     * @return The value of the column 'OTHERLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot4() {
        checkSpecifiedProperty("otherlot4");
        return convertEmptyToNull(_otherlot4);
    }

    /**
     * [set] OTHERLOT4: {varchar(60)} <br>
     * その他属性４
     * @param otherlot4 The value of the column 'OTHERLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot4(String otherlot4) {
        registerModifiedProperty("otherlot4");
        _otherlot4 = otherlot4;
    }

    /**
     * [get] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @return The value of the column 'OTHERLOT5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOtherlot5() {
        checkSpecifiedProperty("otherlot5");
        return _otherlot5;
    }

    /**
     * [set] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @param otherlot5 The value of the column 'OTHERLOT5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot5(java.math.BigDecimal otherlot5) {
        registerModifiedProperty("otherlot5");
        _otherlot5 = otherlot5;
    }

    /**
     * [get] DAMAGEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDamageflg() {
        checkSpecifiedProperty("damageflg");
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        registerModifiedProperty("damageflg");
        _damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        checkSpecifiedProperty("customsreleaseflg");
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        registerModifiedProperty("customsreleaseflg");
        _customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTaxflg() {
        checkSpecifiedProperty("taxflg");
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxflg(java.math.BigDecimal taxflg) {
        registerModifiedProperty("taxflg");
        _taxflg = taxflg;
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
     * [get] EXAMSTS: {char(1), default=[(0)]} <br>
     * 検査ステータス
     * @return The value of the column 'EXAMSTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamsts() {
        checkSpecifiedProperty("examsts");
        return convertEmptyToNull(_examsts);
    }

    /**
     * [set] EXAMSTS: {char(1), default=[(0)]} <br>
     * 検査ステータス
     * @param examsts The value of the column 'EXAMSTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamsts(String examsts) {
        registerModifiedProperty("examsts");
        _examsts = examsts;
    }

    /**
     * [get] EXAMENDSTS: {char(1), default=[(0)]} <br>
     * 完了ステータス
     * @return The value of the column 'EXAMENDSTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamendsts() {
        checkSpecifiedProperty("examendsts");
        return convertEmptyToNull(_examendsts);
    }

    /**
     * [set] EXAMENDSTS: {char(1), default=[(0)]} <br>
     * 完了ステータス
     * @param examendsts The value of the column 'EXAMENDSTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamendsts(String examendsts) {
        registerModifiedProperty("examendsts");
        _examendsts = examendsts;
    }

    /**
     * [get] ADDFLG: {char(1)} <br>
     * 作成区分
     * @return The value of the column 'ADDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddflg() {
        checkSpecifiedProperty("addflg");
        return convertEmptyToNull(_addflg);
    }

    /**
     * [set] ADDFLG: {char(1)} <br>
     * 作成区分
     * @param addflg The value of the column 'ADDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddflg(String addflg) {
        registerModifiedProperty("addflg");
        _addflg = addflg;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] SENDFLG: {char(1)} <br>
     * 送信フラグ
     * @return The value of the column 'SENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendflg() {
        checkSpecifiedProperty("sendflg");
        return convertEmptyToNull(_sendflg);
    }

    /**
     * [set] SENDFLG: {char(1)} <br>
     * 送信フラグ
     * @param sendflg The value of the column 'SENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendflg(String sendflg) {
        registerModifiedProperty("sendflg");
        _sendflg = sendflg;
    }

    /**
     * [get] EXAMQTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査予定数量（個装）
     * @return The value of the column 'EXAMQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExamqty() {
        checkSpecifiedProperty("examqty");
        return _examqty;
    }

    /**
     * [set] EXAMQTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査予定数量（個装）
     * @param examqty The value of the column 'EXAMQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamqty(java.math.BigDecimal examqty) {
        registerModifiedProperty("examqty");
        _examqty = examqty;
    }

    /**
     * [get] RES40QTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査済正常品数量（個装）
     * @return The value of the column 'RES40QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRes40qty() {
        checkSpecifiedProperty("res40qty");
        return _res40qty;
    }

    /**
     * [set] RES40QTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査済正常品数量（個装）
     * @param res40qty The value of the column 'RES40QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRes40qty(java.math.BigDecimal res40qty) {
        registerModifiedProperty("res40qty");
        _res40qty = res40qty;
    }

    /**
     * [get] INFERIORQTY: {decimal(16, 6), default=[(0)]} <br>
     * 不良品数量（個装）
     * @return The value of the column 'INFERIORQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInferiorqty() {
        checkSpecifiedProperty("inferiorqty");
        return _inferiorqty;
    }

    /**
     * [set] INFERIORQTY: {decimal(16, 6), default=[(0)]} <br>
     * 不良品数量（個装）
     * @param inferiorqty The value of the column 'INFERIORQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInferiorqty(java.math.BigDecimal inferiorqty) {
        registerModifiedProperty("inferiorqty");
        _inferiorqty = inferiorqty;
    }

    /**
     * [get] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @return The value of the column 'NOTEXAMQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNotexamqty() {
        checkSpecifiedProperty("notexamqty");
        return _notexamqty;
    }

    /**
     * [set] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @param notexamqty The value of the column 'NOTEXAMQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotexamqty(java.math.BigDecimal notexamqty) {
        registerModifiedProperty("notexamqty");
        _notexamqty = notexamqty;
    }

    /**
     * [get] FIRSTEXAMSENDFLG: {char(1)} <br>
     * １次検査開始送信フラグ
     * @return The value of the column 'FIRSTEXAMSENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstexamsendflg() {
        checkSpecifiedProperty("firstexamsendflg");
        return convertEmptyToNull(_firstexamsendflg);
    }

    /**
     * [set] FIRSTEXAMSENDFLG: {char(1)} <br>
     * １次検査開始送信フラグ
     * @param firstexamsendflg The value of the column 'FIRSTEXAMSENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstexamsendflg(String firstexamsendflg) {
        registerModifiedProperty("firstexamsendflg");
        _firstexamsendflg = firstexamsendflg;
    }

    /**
     * [get] QUALITYEXAMFLG: {char(1), default=[(0)]} <br>
     * 品質検査実施フラグ
     * @return The value of the column 'QUALITYEXAMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getQualityexamflg() {
        checkSpecifiedProperty("qualityexamflg");
        return convertEmptyToNull(_qualityexamflg);
    }

    /**
     * [set] QUALITYEXAMFLG: {char(1), default=[(0)]} <br>
     * 品質検査実施フラグ
     * @param qualityexamflg The value of the column 'QUALITYEXAMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQualityexamflg(String qualityexamflg) {
        registerModifiedProperty("qualityexamflg");
        _qualityexamflg = qualityexamflg;
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
