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
 * The entity of T_TRITEMCONVRESULT as TABLE. <br>
 * 銘柄コード組替指示情報
 * <pre>
 * [primary-key]
 *     TRITEMCONVRESULT_ID
 *
 * [column]
 *     TRITEMCONVRESULT_ID, ITEMCHGINSTKEY, JTTSFLG, COMPANYCD, PRODUCT_CD_FROM, PRODUCT_CD_TO, QTY, PALLET_ID, ITEMCHGINSTFLG, ITEMCHGINSTDATE, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRITEMCONVRESULT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tritemconvresultId = entity.getTritemconvresultId();
 * java.math.BigDecimal itemchginstkey = entity.getItemchginstkey();
 * String jttsflg = entity.getJttsflg();
 * String companycd = entity.getCompanycd();
 * String productCdFrom = entity.getProductCdFrom();
 * String productCdTo = entity.getProductCdTo();
 * java.math.BigDecimal qty = entity.getQty();
 * Long palletId = entity.getPalletId();
 * String itemchginstflg = entity.getItemchginstflg();
 * java.sql.Timestamp itemchginstdate = entity.getItemchginstdate();
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
 * entity.setTritemconvresultId(tritemconvresultId);
 * entity.setItemchginstkey(itemchginstkey);
 * entity.setJttsflg(jttsflg);
 * entity.setCompanycd(companycd);
 * entity.setProductCdFrom(productCdFrom);
 * entity.setProductCdTo(productCdTo);
 * entity.setQty(qty);
 * entity.setPalletId(palletId);
 * entity.setItemchginstflg(itemchginstflg);
 * entity.setItemchginstdate(itemchginstdate);
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
public abstract class BsTTritemconvresult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tritemconvresultId;

    /** ITEMCHGINSTKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _itemchginstkey;

    /** JTTSFLG: {char(1)} */
    protected String _jttsflg;

    /** COMPANYCD: {varchar(30)} */
    protected String _companycd;

    /** PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} */
    protected String _productCdFrom;

    /** PRODUCT_CD_TO: {varchar(30)} */
    protected String _productCdTo;

    /** QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _qty;

    /** PALLET_ID: {bigint(19)} */
    protected Long _palletId;

    /** ITEMCHGINSTFLG: {NotNull, varchar(30)} */
    protected String _itemchginstflg;

    /** ITEMCHGINSTDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _itemchginstdate;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
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
        return "T_TRITEMCONVRESULT";
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
        if (_tritemconvresultId == null) { return false; }
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
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
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
        if (obj instanceof BsTTritemconvresult) {
            BsTTritemconvresult other = (BsTTritemconvresult)obj;
            if (!xSV(_tritemconvresultId, other._tritemconvresultId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tritemconvresultId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tritemconvresultId));
        sb.append(dm).append(xfND(_itemchginstkey));
        sb.append(dm).append(xfND(_jttsflg));
        sb.append(dm).append(xfND(_companycd));
        sb.append(dm).append(xfND(_productCdFrom));
        sb.append(dm).append(xfND(_productCdTo));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_itemchginstflg));
        sb.append(dm).append(xfND(_itemchginstdate));
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
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTritemconvresult clone() {
        return (TTritemconvresult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄CD組替指示情報ID
     * @return The value of the column 'TRITEMCONVRESULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTritemconvresultId() {
        checkSpecifiedProperty("tritemconvresultId");
        return _tritemconvresultId;
    }

    /**
     * [set] TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄CD組替指示情報ID
     * @param tritemconvresultId The value of the column 'TRITEMCONVRESULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTritemconvresultId(Long tritemconvresultId) {
        registerModifiedProperty("tritemconvresultId");
        _tritemconvresultId = tritemconvresultId;
    }

    /**
     * [get] ITEMCHGINSTKEY: {NotNull, decimal(16, 6)} <br>
     * 組替指示情報順序キー
     * @return The value of the column 'ITEMCHGINSTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getItemchginstkey() {
        checkSpecifiedProperty("itemchginstkey");
        return _itemchginstkey;
    }

    /**
     * [set] ITEMCHGINSTKEY: {NotNull, decimal(16, 6)} <br>
     * 組替指示情報順序キー
     * @param itemchginstkey The value of the column 'ITEMCHGINSTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setItemchginstkey(java.math.BigDecimal itemchginstkey) {
        registerModifiedProperty("itemchginstkey");
        _itemchginstkey = itemchginstkey;
    }

    /**
     * [get] JTTSFLG: {char(1)} <br>
     * ＪＴ／ＴＳ区分
     * @return The value of the column 'JTTSFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getJttsflg() {
        checkSpecifiedProperty("jttsflg");
        return convertEmptyToNull(_jttsflg);
    }

    /**
     * [set] JTTSFLG: {char(1)} <br>
     * ＪＴ／ＴＳ区分
     * @param jttsflg The value of the column 'JTTSFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJttsflg(String jttsflg) {
        registerModifiedProperty("jttsflg");
        _jttsflg = jttsflg;
    }

    /**
     * [get] COMPANYCD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanycd() {
        checkSpecifiedProperty("companycd");
        return convertEmptyToNull(_companycd);
    }

    /**
     * [set] COMPANYCD: {varchar(30)} <br>
     * 組織CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanycd(String companycd) {
        registerModifiedProperty("companycd");
        _companycd = companycd;
    }

    /**
     * [get] PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} <br>
     * 組替前銘柄CD
     * @return The value of the column 'PRODUCT_CD_FROM'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCdFrom() {
        checkSpecifiedProperty("productCdFrom");
        return convertEmptyToNull(_productCdFrom);
    }

    /**
     * [set] PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} <br>
     * 組替前銘柄CD
     * @param productCdFrom The value of the column 'PRODUCT_CD_FROM'. (basically NotNull if update: for the constraint)
     */
    public void setProductCdFrom(String productCdFrom) {
        registerModifiedProperty("productCdFrom");
        _productCdFrom = productCdFrom;
    }

    /**
     * [get] PRODUCT_CD_TO: {varchar(30)} <br>
     * 組替後銘柄CD
     * @return The value of the column 'PRODUCT_CD_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCdTo() {
        checkSpecifiedProperty("productCdTo");
        return convertEmptyToNull(_productCdTo);
    }

    /**
     * [set] PRODUCT_CD_TO: {varchar(30)} <br>
     * 組替後銘柄CD
     * @param productCdTo The value of the column 'PRODUCT_CD_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCdTo(String productCdTo) {
        registerModifiedProperty("productCdTo");
        _productCdTo = productCdTo;
    }

    /**
     * [get] QTY: {decimal(16, 6)} <br>
     * 個装数量
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {decimal(16, 6)} <br>
     * 個装数量
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(java.math.BigDecimal qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPalletId() {
        checkSpecifiedProperty("palletId");
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletId(Long palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] ITEMCHGINSTFLG: {NotNull, varchar(30)} <br>
     * 組替指示送信フラグ
     * @return The value of the column 'ITEMCHGINSTFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getItemchginstflg() {
        checkSpecifiedProperty("itemchginstflg");
        return convertEmptyToNull(_itemchginstflg);
    }

    /**
     * [set] ITEMCHGINSTFLG: {NotNull, varchar(30)} <br>
     * 組替指示送信フラグ
     * @param itemchginstflg The value of the column 'ITEMCHGINSTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setItemchginstflg(String itemchginstflg) {
        registerModifiedProperty("itemchginstflg");
        _itemchginstflg = itemchginstflg;
    }

    /**
     * [get] ITEMCHGINSTDATE: {datetime2(26, 6)} <br>
     * 組替指示日時
     * @return The value of the column 'ITEMCHGINSTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getItemchginstdate() {
        checkSpecifiedProperty("itemchginstdate");
        return _itemchginstdate;
    }

    /**
     * [set] ITEMCHGINSTDATE: {datetime2(26, 6)} <br>
     * 組替指示日時
     * @param itemchginstdate The value of the column 'ITEMCHGINSTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemchginstdate(java.sql.Timestamp itemchginstdate) {
        registerModifiedProperty("itemchginstdate");
        _itemchginstdate = itemchginstdate;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
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
