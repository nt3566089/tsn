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
 * The entity of T_TRALLLASTWHINVDETAIL as TABLE. <br>
 * 拠点別在庫照会（保管場・仕分場・引取場）明細情報
 * <pre>
 * [primary-key]
 *     ALLLASTWHINVDETAILKEY
 *
 * [column]
 *     ALLLASTWHINVDETAILKEY, PRODUCT_CD, PRODUCTDATE, DESIGNCD, INVNUM, INVKBNCD, INVKBN, TRANSPORTCD, FIRMCARRYNO, ASSORTEDUNIT, LOCCD, SCHDATE, RECEIVEDATE, OUTPUTTYPE, OUTPUTORG, USETYPE, PROCFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLLASTWHINVDETAILKEY
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
 * Long alllastwhinvdetailkey = entity.getAlllastwhinvdetailkey();
 * String productCd = entity.getProductCd();
 * String productdate = entity.getProductdate();
 * String designcd = entity.getDesigncd();
 * java.math.BigDecimal invnum = entity.getInvnum();
 * String invkbncd = entity.getInvkbncd();
 * String invkbn = entity.getInvkbn();
 * String transportcd = entity.getTransportcd();
 * String firmcarryno = entity.getFirmcarryno();
 * String assortedunit = entity.getAssortedunit();
 * String loccd = entity.getLoccd();
 * String schdate = entity.getSchdate();
 * String receivedate = entity.getReceivedate();
 * java.math.BigDecimal outputtype = entity.getOutputtype();
 * Long outputorg = entity.getOutputorg();
 * Long usetype = entity.getUsetype();
 * Long procflg = entity.getProcflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setAlllastwhinvdetailkey(alllastwhinvdetailkey);
 * entity.setProductCd(productCd);
 * entity.setProductdate(productdate);
 * entity.setDesigncd(designcd);
 * entity.setInvnum(invnum);
 * entity.setInvkbncd(invkbncd);
 * entity.setInvkbn(invkbn);
 * entity.setTransportcd(transportcd);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setAssortedunit(assortedunit);
 * entity.setLoccd(loccd);
 * entity.setSchdate(schdate);
 * entity.setReceivedate(receivedate);
 * entity.setOutputtype(outputtype);
 * entity.setOutputorg(outputorg);
 * entity.setUsetype(usetype);
 * entity.setProcflg(procflg);
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
public abstract class BsTTralllastwhinvdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _alllastwhinvdetailkey;

    /** PRODUCT_CD: {IX+, varchar(30)} */
    protected String _productCd;

    /** PRODUCTDATE: {IX+, varchar(8)} */
    protected String _productdate;

    /** DESIGNCD: {IX+, varchar(30)} */
    protected String _designcd;

    /** INVNUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _invnum;

    /** INVKBNCD: {char(1)} */
    protected String _invkbncd;

    /** INVKBN: {varchar(30)} */
    protected String _invkbn;

    /** TRANSPORTCD: {varchar(30)} */
    protected String _transportcd;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** ASSORTEDUNIT: {varchar(30)} */
    protected String _assortedunit;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** SCHDATE: {varchar(8)} */
    protected String _schdate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** OUTPUTTYPE: {decimal(16, 6)} */
    protected java.math.BigDecimal _outputtype;

    /** OUTPUTORG: {bigint(19)} */
    protected Long _outputorg;

    /** USETYPE: {IX+, bigint(19)} */
    protected Long _usetype;

    /** PROCFLG: {bigint(19)} */
    protected Long _procflg;

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
        return "T_TRALLLASTWHINVDETAIL";
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
        if (_alllastwhinvdetailkey == null) { return false; }
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
        if (obj instanceof BsTTralllastwhinvdetail) {
            BsTTralllastwhinvdetail other = (BsTTralllastwhinvdetail)obj;
            if (!xSV(_alllastwhinvdetailkey, other._alllastwhinvdetailkey)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _alllastwhinvdetailkey);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_alllastwhinvdetailkey));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productdate));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_invnum));
        sb.append(dm).append(xfND(_invkbncd));
        sb.append(dm).append(xfND(_invkbn));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_assortedunit));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_outputtype));
        sb.append(dm).append(xfND(_outputorg));
        sb.append(dm).append(xfND(_usetype));
        sb.append(dm).append(xfND(_procflg));
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
    public TTralllastwhinvdetail clone() {
        return (TTralllastwhinvdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫照会（保管場・仕分場・引取場）明細キー
     * @return The value of the column 'ALLLASTWHINVDETAILKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getAlllastwhinvdetailkey() {
        checkSpecifiedProperty("alllastwhinvdetailkey");
        return _alllastwhinvdetailkey;
    }

    /**
     * [set] ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫照会（保管場・仕分場・引取場）明細キー
     * @param alllastwhinvdetailkey The value of the column 'ALLLASTWHINVDETAILKEY'. (basically NotNull if update: for the constraint)
     */
    public void setAlllastwhinvdetailkey(Long alllastwhinvdetailkey) {
        registerModifiedProperty("alllastwhinvdetailkey");
        _alllastwhinvdetailkey = alllastwhinvdetailkey;
    }

    /**
     * [get] PRODUCT_CD: {IX+, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {IX+, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCTDATE: {IX+, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'PRODUCTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductdate() {
        checkSpecifiedProperty("productdate");
        return convertEmptyToNull(_productdate);
    }

    /**
     * [set] PRODUCTDATE: {IX+, varchar(8)} <br>
     * 製造年月日
     * @param productdate The value of the column 'PRODUCTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductdate(String productdate) {
        registerModifiedProperty("productdate");
        _productdate = productdate;
    }

    /**
     * [get] DESIGNCD: {IX+, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {IX+, varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] INVNUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @return The value of the column 'INVNUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvnum() {
        checkSpecifiedProperty("invnum");
        return _invnum;
    }

    /**
     * [set] INVNUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @param invnum The value of the column 'INVNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvnum(java.math.BigDecimal invnum) {
        registerModifiedProperty("invnum");
        _invnum = invnum;
    }

    /**
     * [get] INVKBNCD: {char(1)} <br>
     * 情報元CD値
     * @return The value of the column 'INVKBNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvkbncd() {
        checkSpecifiedProperty("invkbncd");
        return convertEmptyToNull(_invkbncd);
    }

    /**
     * [set] INVKBNCD: {char(1)} <br>
     * 情報元CD値
     * @param invkbncd The value of the column 'INVKBNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvkbncd(String invkbncd) {
        registerModifiedProperty("invkbncd");
        _invkbncd = invkbncd;
    }

    /**
     * [get] INVKBN: {varchar(30)} <br>
     * 情報元
     * @return The value of the column 'INVKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvkbn() {
        checkSpecifiedProperty("invkbn");
        return convertEmptyToNull(_invkbn);
    }

    /**
     * [set] INVKBN: {varchar(30)} <br>
     * 情報元
     * @param invkbn The value of the column 'INVKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvkbn(String invkbn) {
        registerModifiedProperty("invkbn");
        _invkbn = invkbn;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
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
     * [get] ASSORTEDUNIT: {varchar(30)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedunit() {
        checkSpecifiedProperty("assortedunit");
        return convertEmptyToNull(_assortedunit);
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(30)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedunit(String assortedunit) {
        registerModifiedProperty("assortedunit");
        _assortedunit = assortedunit;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * 保管場ロケ
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * 保管場ロケ
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
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
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫実績日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫実績日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] OUTPUTTYPE: {decimal(16, 6)} <br>
     * 一般出力順
     * @return The value of the column 'OUTPUTTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOutputtype() {
        checkSpecifiedProperty("outputtype");
        return _outputtype;
    }

    /**
     * [set] OUTPUTTYPE: {decimal(16, 6)} <br>
     * 一般出力順
     * @param outputtype The value of the column 'OUTPUTTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutputtype(java.math.BigDecimal outputtype) {
        registerModifiedProperty("outputtype");
        _outputtype = outputtype;
    }

    /**
     * [get] OUTPUTORG: {bigint(19)} <br>
     * 出力順（組織）
     * @return The value of the column 'OUTPUTORG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOutputorg() {
        checkSpecifiedProperty("outputorg");
        return _outputorg;
    }

    /**
     * [set] OUTPUTORG: {bigint(19)} <br>
     * 出力順（組織）
     * @param outputorg The value of the column 'OUTPUTORG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutputorg(Long outputorg) {
        registerModifiedProperty("outputorg");
        _outputorg = outputorg;
    }

    /**
     * [get] USETYPE: {IX+, bigint(19)} <br>
     * 使用区分
     * @return The value of the column 'USETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsetype() {
        checkSpecifiedProperty("usetype");
        return _usetype;
    }

    /**
     * [set] USETYPE: {IX+, bigint(19)} <br>
     * 使用区分
     * @param usetype The value of the column 'USETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsetype(Long usetype) {
        registerModifiedProperty("usetype");
        _usetype = usetype;
    }

    /**
     * [get] PROCFLG: {bigint(19)} <br>
     * 処理区分
     * @return The value of the column 'PROCFLG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProcflg() {
        checkSpecifiedProperty("procflg");
        return _procflg;
    }

    /**
     * [set] PROCFLG: {bigint(19)} <br>
     * 処理区分
     * @param procflg The value of the column 'PROCFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcflg(Long procflg) {
        registerModifiedProperty("procflg");
        _procflg = procflg;
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
