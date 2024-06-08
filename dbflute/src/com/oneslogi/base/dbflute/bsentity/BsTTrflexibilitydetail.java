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
 * The entity of T_TRFLEXIBILITYDETAIL as TABLE. <br>
 * 融通輸送明細情報
 * <pre>
 * [primary-key]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID, FLEXIBLE_TRANSPORT_INFO_ID, FLEXIBITYLINENO, PRODUCT_ID, STDDIFFLG, FLEXPICKLISTNO, PRINTEDFLG, COMPLETEFLG, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, HTQTYCASE, HTQTYBOWL, NV_EXTDATA1, CENTER_ID, CLIENT_ID, SOID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRFLEXIBILITY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrflexibility
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long flexibleTransportDetailInfoId = entity.getFlexibleTransportDetailInfoId();
 * Long flexibleTransportInfoId = entity.getFlexibleTransportInfoId();
 * java.math.BigDecimal flexibitylineno = entity.getFlexibitylineno();
 * Long productId = entity.getProductId();
 * java.math.BigDecimal stddifflg = entity.getStddifflg();
 * String flexpicklistno = entity.getFlexpicklistno();
 * String printedflg = entity.getPrintedflg();
 * java.math.BigDecimal completeflg = entity.getCompleteflg();
 * String manufacturedate = entity.getManufacturedate();
 * String designcd = entity.getDesigncd();
 * java.math.BigDecimal qtycase = entity.getQtycase();
 * java.math.BigDecimal qtybowl = entity.getQtybowl();
 * java.math.BigDecimal htqtycase = entity.getHtqtycase();
 * java.math.BigDecimal htqtybowl = entity.getHtqtybowl();
 * String nvExtdata1 = entity.getNvExtdata1();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long soid = entity.getSoid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setFlexibleTransportDetailInfoId(flexibleTransportDetailInfoId);
 * entity.setFlexibleTransportInfoId(flexibleTransportInfoId);
 * entity.setFlexibitylineno(flexibitylineno);
 * entity.setProductId(productId);
 * entity.setStddifflg(stddifflg);
 * entity.setFlexpicklistno(flexpicklistno);
 * entity.setPrintedflg(printedflg);
 * entity.setCompleteflg(completeflg);
 * entity.setManufacturedate(manufacturedate);
 * entity.setDesigncd(designcd);
 * entity.setQtycase(qtycase);
 * entity.setQtybowl(qtybowl);
 * entity.setHtqtycase(htqtycase);
 * entity.setHtqtybowl(htqtybowl);
 * entity.setNvExtdata1(nvExtdata1);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setSoid(soid);
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
public abstract class BsTTrflexibilitydetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _flexibleTransportDetailInfoId;

    /** FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY} */
    protected Long _flexibleTransportInfoId;

    /** FLEXIBITYLINENO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _flexibitylineno;

    /** PRODUCT_ID: {IX+, NotNull, bigint(19)} */
    protected Long _productId;

    /** STDDIFFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _stddifflg;

    /** FLEXPICKLISTNO: {IX, NotNull, varchar(30)} */
    protected String _flexpicklistno;

    /** PRINTEDFLG: {NotNull, char(1)} */
    protected String _printedflg;

    /** COMPLETEFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _completeflg;

    /** MANUFACTUREDATE: {varchar(8)} */
    protected String _manufacturedate;

    /** DESIGNCD: {varchar(30)} */
    protected String _designcd;

    /** QTYCASE: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _qtybowl;

    /** HTQTYCASE: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _htqtycase;

    /** HTQTYBOWL: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _htqtybowl;

    /** NV_EXTDATA1: {varchar(60)} */
    protected String _nvExtdata1;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** SOID: {bigint(19)} */
    protected Long _soid;

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
        return "T_TRFLEXIBILITYDETAIL";
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
        if (_flexibleTransportDetailInfoId == null) { return false; }
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
    /** T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'. */
    protected TTrflexibility _tTrflexibility;

    /**
     * [get] T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'. <br>
     * @return The entity of foreign property 'TTrflexibility'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrflexibility getTTrflexibility() {
        return _tTrflexibility;
    }

    /**
     * [set] T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'.
     * @param tTrflexibility The entity of foreign property 'TTrflexibility'. (NullAllowed)
     */
    public void setTTrflexibility(TTrflexibility tTrflexibility) {
        _tTrflexibility = tTrflexibility;
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
        if (obj instanceof BsTTrflexibilitydetail) {
            BsTTrflexibilitydetail other = (BsTTrflexibilitydetail)obj;
            if (!xSV(_flexibleTransportDetailInfoId, other._flexibleTransportDetailInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _flexibleTransportDetailInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrflexibility != null)
        { sb.append(li).append(xbRDS(_tTrflexibility, "tTrflexibility")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_flexibleTransportDetailInfoId));
        sb.append(dm).append(xfND(_flexibleTransportInfoId));
        sb.append(dm).append(xfND(_flexibitylineno));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_stddifflg));
        sb.append(dm).append(xfND(_flexpicklistno));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_completeflg));
        sb.append(dm).append(xfND(_manufacturedate));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_qtycase));
        sb.append(dm).append(xfND(_qtybowl));
        sb.append(dm).append(xfND(_htqtycase));
        sb.append(dm).append(xfND(_htqtybowl));
        sb.append(dm).append(xfND(_nvExtdata1));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_soid));
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
        if (_tTrflexibility != null)
        { sb.append(dm).append("tTrflexibility"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrflexibilitydetail clone() {
        return (TTrflexibilitydetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送明細情報ID
     * @return The value of the column 'FLEXIBLE_TRANSPORT_DETAIL_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFlexibleTransportDetailInfoId() {
        checkSpecifiedProperty("flexibleTransportDetailInfoId");
        return _flexibleTransportDetailInfoId;
    }

    /**
     * [set] FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送明細情報ID
     * @param flexibleTransportDetailInfoId The value of the column 'FLEXIBLE_TRANSPORT_DETAIL_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibleTransportDetailInfoId(Long flexibleTransportDetailInfoId) {
        registerModifiedProperty("flexibleTransportDetailInfoId");
        _flexibleTransportDetailInfoId = flexibleTransportDetailInfoId;
    }

    /**
     * [get] FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY} <br>
     * 融通輸送情報ID
     * @return The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFlexibleTransportInfoId() {
        checkSpecifiedProperty("flexibleTransportInfoId");
        return _flexibleTransportInfoId;
    }

    /**
     * [set] FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY} <br>
     * 融通輸送情報ID
     * @param flexibleTransportInfoId The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibleTransportInfoId(Long flexibleTransportInfoId) {
        registerModifiedProperty("flexibleTransportInfoId");
        _flexibleTransportInfoId = flexibleTransportInfoId;
    }

    /**
     * [get] FLEXIBITYLINENO: {NotNull, decimal(16, 6)} <br>
     * 融通行No.
     * @return The value of the column 'FLEXIBITYLINENO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getFlexibitylineno() {
        checkSpecifiedProperty("flexibitylineno");
        return _flexibitylineno;
    }

    /**
     * [set] FLEXIBITYLINENO: {NotNull, decimal(16, 6)} <br>
     * 融通行No.
     * @param flexibitylineno The value of the column 'FLEXIBITYLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibitylineno(java.math.BigDecimal flexibitylineno) {
        registerModifiedProperty("flexibitylineno");
        _flexibitylineno = flexibitylineno;
    }

    /**
     * [get] PRODUCT_ID: {IX+, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX+, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] STDDIFFLG: {NotNull, decimal(16, 6)} <br>
     * 通常異型品区分
     * @return The value of the column 'STDDIFFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getStddifflg() {
        checkSpecifiedProperty("stddifflg");
        return _stddifflg;
    }

    /**
     * [set] STDDIFFLG: {NotNull, decimal(16, 6)} <br>
     * 通常異型品区分
     * @param stddifflg The value of the column 'STDDIFFLG'. (basically NotNull if update: for the constraint)
     */
    public void setStddifflg(java.math.BigDecimal stddifflg) {
        registerModifiedProperty("stddifflg");
        _stddifflg = stddifflg;
    }

    /**
     * [get] FLEXPICKLISTNO: {IX, NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @return The value of the column 'FLEXPICKLISTNO'. (basically NotNull if selected: for the constraint)
     */
    public String getFlexpicklistno() {
        checkSpecifiedProperty("flexpicklistno");
        return convertEmptyToNull(_flexpicklistno);
    }

    /**
     * [set] FLEXPICKLISTNO: {IX, NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @param flexpicklistno The value of the column 'FLEXPICKLISTNO'. (basically NotNull if update: for the constraint)
     */
    public void setFlexpicklistno(String flexpicklistno) {
        registerModifiedProperty("flexpicklistno");
        _flexpicklistno = flexpicklistno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] COMPLETEFLG: {decimal(16, 6)} <br>
     * 完了ステータス
     * @return The value of the column 'COMPLETEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCompleteflg() {
        checkSpecifiedProperty("completeflg");
        return _completeflg;
    }

    /**
     * [set] COMPLETEFLG: {decimal(16, 6)} <br>
     * 完了ステータス
     * @param completeflg The value of the column 'COMPLETEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompleteflg(java.math.BigDecimal completeflg) {
        registerModifiedProperty("completeflg");
        _completeflg = completeflg;
    }

    /**
     * [get] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturedate() {
        checkSpecifiedProperty("manufacturedate");
        return convertEmptyToNull(_manufacturedate);
    }

    /**
     * [set] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturedate(String manufacturedate) {
        registerModifiedProperty("manufacturedate");
        _manufacturedate = manufacturedate;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @return The value of the column 'QTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQtycase() {
        checkSpecifiedProperty("qtycase");
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @param qtycase The value of the column 'QTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        registerModifiedProperty("qtycase");
        _qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @return The value of the column 'QTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getQtybowl() {
        checkSpecifiedProperty("qtybowl");
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @param qtybowl The value of the column 'QTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        registerModifiedProperty("qtybowl");
        _qtybowl = qtybowl;
    }

    /**
     * [get] HTQTYCASE: {NotNull, decimal(16, 6)} <br>
     * 実績数量（ケース）
     * @return The value of the column 'HTQTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getHtqtycase() {
        checkSpecifiedProperty("htqtycase");
        return _htqtycase;
    }

    /**
     * [set] HTQTYCASE: {NotNull, decimal(16, 6)} <br>
     * 実績数量（ケース）
     * @param htqtycase The value of the column 'HTQTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setHtqtycase(java.math.BigDecimal htqtycase) {
        registerModifiedProperty("htqtycase");
        _htqtycase = htqtycase;
    }

    /**
     * [get] HTQTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 実績数量（カートン）
     * @return The value of the column 'HTQTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getHtqtybowl() {
        checkSpecifiedProperty("htqtybowl");
        return _htqtybowl;
    }

    /**
     * [set] HTQTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 実績数量（カートン）
     * @param htqtybowl The value of the column 'HTQTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setHtqtybowl(java.math.BigDecimal htqtybowl) {
        registerModifiedProperty("htqtybowl");
        _htqtybowl = htqtybowl;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 画面更新者
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata1() {
        checkSpecifiedProperty("nvExtdata1");
        return convertEmptyToNull(_nvExtdata1);
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 画面更新者
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata1(String nvExtdata1) {
        registerModifiedProperty("nvExtdata1");
        _nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
