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
 * The entity of T_TRINVCHECKINFO as TABLE. <br>
 * 在庫調査表情報
 * <pre>
 * [primary-key]
 *     TRINVCHECKINFO_ID
 *
 * [column]
 *     TRINVCHECKINFO_ID, WAREHOUSECD, EXECUTEDATE, INOUTKBN, PRODUCT_ID, DUALITEMCDFLG, DUALITEMCD, YDAYTLEQULYTOTALINV, TDAYEQYTOTALINV, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, EXCESSTOTALINV, DEFECTTOTALINV, CAPITEMFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVCHECKINFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_PRODUCT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient, mProduct
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trinvcheckinfoId = entity.getTrinvcheckinfoId();
 * String warehousecd = entity.getWarehousecd();
 * String executedate = entity.getExecutedate();
 * String inoutkbn = entity.getInoutkbn();
 * Long productId = entity.getProductId();
 * java.math.BigDecimal dualitemcdflg = entity.getDualitemcdflg();
 * String dualitemcd = entity.getDualitemcd();
 * java.math.BigDecimal ydaytlequlytotalinv = entity.getYdaytlequlytotalinv();
 * java.math.BigDecimal tdayeqytotalinv = entity.getTdayeqytotalinv();
 * java.math.BigDecimal sysinvtotalinv = entity.getSysinvtotalinv();
 * java.math.BigDecimal investtotalinv = entity.getInvesttotalinv();
 * java.math.BigDecimal investkeeplocinv = entity.getInvestkeeplocinv();
 * java.math.BigDecimal investreceivelocinv = entity.getInvestreceivelocinv();
 * java.math.BigDecimal investdamageitem = entity.getInvestdamageitem();
 * java.math.BigDecimal investclssifylocinv = entity.getInvestclssifylocinv();
 * java.math.BigDecimal investtmplocinv = entity.getInvesttmplocinv();
 * java.math.BigDecimal investautoinv = entity.getInvestautoinv();
 * java.math.BigDecimal excesstotalinv = entity.getExcesstotalinv();
 * java.math.BigDecimal defecttotalinv = entity.getDefecttotalinv();
 * String capitemflg = entity.getCapitemflg();
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
 * entity.setTrinvcheckinfoId(trinvcheckinfoId);
 * entity.setWarehousecd(warehousecd);
 * entity.setExecutedate(executedate);
 * entity.setInoutkbn(inoutkbn);
 * entity.setProductId(productId);
 * entity.setDualitemcdflg(dualitemcdflg);
 * entity.setDualitemcd(dualitemcd);
 * entity.setYdaytlequlytotalinv(ydaytlequlytotalinv);
 * entity.setTdayeqytotalinv(tdayeqytotalinv);
 * entity.setSysinvtotalinv(sysinvtotalinv);
 * entity.setInvesttotalinv(investtotalinv);
 * entity.setInvestkeeplocinv(investkeeplocinv);
 * entity.setInvestreceivelocinv(investreceivelocinv);
 * entity.setInvestdamageitem(investdamageitem);
 * entity.setInvestclssifylocinv(investclssifylocinv);
 * entity.setInvesttmplocinv(investtmplocinv);
 * entity.setInvestautoinv(investautoinv);
 * entity.setExcesstotalinv(excesstotalinv);
 * entity.setDefecttotalinv(defecttotalinv);
 * entity.setCapitemflg(capitemflg);
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
public abstract class BsTTrinvcheckinfo extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trinvcheckinfoId;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** EXECUTEDATE: {NotNull, varchar(8)} */
    protected String _executedate;

    /** INOUTKBN: {NotNull, varchar(30)} */
    protected String _inoutkbn;

    /** PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** DUALITEMCDFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _dualitemcdflg;

    /** DUALITEMCD: {varchar(30)} */
    protected String _dualitemcd;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAYEQYTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqytotalinv;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvtotalinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investautoinv;

    /** EXCESSTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _excesstotalinv;

    /** DEFECTTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _defecttotalinv;

    /** CAPITEMFLG: {char(1)} */
    protected String _capitemflg;

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
        return "T_TRINVCHECKINFO";
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
        if (_trinvcheckinfoId == null) { return false; }
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

    /** M_PRODUCT by my PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] M_PRODUCT by my PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
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
        if (obj instanceof BsTTrinvcheckinfo) {
            BsTTrinvcheckinfo other = (BsTTrinvcheckinfo)obj;
            if (!xSV(_trinvcheckinfoId, other._trinvcheckinfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trinvcheckinfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trinvcheckinfoId));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_executedate));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_dualitemcdflg));
        sb.append(dm).append(xfND(_dualitemcd));
        sb.append(dm).append(xfND(_ydaytlequlytotalinv));
        sb.append(dm).append(xfND(_tdayeqytotalinv));
        sb.append(dm).append(xfND(_sysinvtotalinv));
        sb.append(dm).append(xfND(_investtotalinv));
        sb.append(dm).append(xfND(_investkeeplocinv));
        sb.append(dm).append(xfND(_investreceivelocinv));
        sb.append(dm).append(xfND(_investdamageitem));
        sb.append(dm).append(xfND(_investclssifylocinv));
        sb.append(dm).append(xfND(_investtmplocinv));
        sb.append(dm).append(xfND(_investautoinv));
        sb.append(dm).append(xfND(_excesstotalinv));
        sb.append(dm).append(xfND(_defecttotalinv));
        sb.append(dm).append(xfND(_capitemflg));
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
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrinvcheckinfo clone() {
        return (TTrinvcheckinfo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査表情報ID
     * @return The value of the column 'TRINVCHECKINFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrinvcheckinfoId() {
        checkSpecifiedProperty("trinvcheckinfoId");
        return _trinvcheckinfoId;
    }

    /**
     * [set] TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査表情報ID
     * @param trinvcheckinfoId The value of the column 'TRINVCHECKINFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrinvcheckinfoId(Long trinvcheckinfoId) {
        registerModifiedProperty("trinvcheckinfoId");
        _trinvcheckinfoId = trinvcheckinfoId;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] EXECUTEDATE: {NotNull, varchar(8)} <br>
     * 在庫実績日
     * @return The value of the column 'EXECUTEDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getExecutedate() {
        checkSpecifiedProperty("executedate");
        return convertEmptyToNull(_executedate);
    }

    /**
     * [set] EXECUTEDATE: {NotNull, varchar(8)} <br>
     * 在庫実績日
     * @param executedate The value of the column 'EXECUTEDATE'. (basically NotNull if update: for the constraint)
     */
    public void setExecutedate(String executedate) {
        registerModifiedProperty("executedate");
        _executedate = executedate;
    }

    /**
     * [get] INOUTKBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUTKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] INOUTKBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inoutkbn The value of the column 'INOUTKBN'. (basically NotNull if update: for the constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] DUALITEMCDFLG: {NotNull, decimal(16, 6)} <br>
     * 庫内作業集約フラグ
     * @return The value of the column 'DUALITEMCDFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getDualitemcdflg() {
        checkSpecifiedProperty("dualitemcdflg");
        return _dualitemcdflg;
    }

    /**
     * [set] DUALITEMCDFLG: {NotNull, decimal(16, 6)} <br>
     * 庫内作業集約フラグ
     * @param dualitemcdflg The value of the column 'DUALITEMCDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setDualitemcdflg(java.math.BigDecimal dualitemcdflg) {
        registerModifiedProperty("dualitemcdflg");
        _dualitemcdflg = dualitemcdflg;
    }

    /**
     * [get] DUALITEMCD: {varchar(30)} <br>
     * 庫内作業集約CD
     * @return The value of the column 'DUALITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDualitemcd() {
        checkSpecifiedProperty("dualitemcd");
        return convertEmptyToNull(_dualitemcd);
    }

    /**
     * [set] DUALITEMCD: {varchar(30)} <br>
     * 庫内作業集約CD
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDualitemcd(String dualitemcd) {
        registerModifiedProperty("dualitemcd");
        _dualitemcd = dualitemcd;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * 前日までの過不足
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        checkSpecifiedProperty("ydaytlequlytotalinv");
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * 前日までの過不足
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        registerModifiedProperty("ydaytlequlytotalinv");
        _ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * 当日過不足
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        checkSpecifiedProperty("tdayeqytotalinv");
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * 当日過不足
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        registerModifiedProperty("tdayeqytotalinv");
        _tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * 台帳在庫
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        checkSpecifiedProperty("sysinvtotalinv");
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * 台帳在庫
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        registerModifiedProperty("sysinvtotalinv");
        _sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * 調査計
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        checkSpecifiedProperty("investtotalinv");
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * 調査計
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        registerModifiedProperty("investtotalinv");
        _investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * 保管場在庫_調査結果
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        checkSpecifiedProperty("investkeeplocinv");
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * 保管場在庫_調査結果
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        registerModifiedProperty("investkeeplocinv");
        _investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * 引取場在庫_調査結果
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        checkSpecifiedProperty("investreceivelocinv");
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * 引取場在庫_調査結果
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        registerModifiedProperty("investreceivelocinv");
        _investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * かし品置場在庫_調査結果
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        checkSpecifiedProperty("investdamageitem");
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * かし品置場在庫_調査結果
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        registerModifiedProperty("investdamageitem");
        _investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 仕分場在庫_調査結果
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        checkSpecifiedProperty("investclssifylocinv");
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 仕分場在庫_調査結果
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        registerModifiedProperty("investclssifylocinv");
        _investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * 仮置場在庫仕分済分_調査結果
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        checkSpecifiedProperty("investtmplocinv");
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * 仮置場在庫仕分済分_調査結果
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        registerModifiedProperty("investtmplocinv");
        _investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * 自動倉庫在庫_調査結果
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestautoinv() {
        checkSpecifiedProperty("investautoinv");
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * 自動倉庫在庫_調査結果
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        registerModifiedProperty("investautoinv");
        _investautoinv = investautoinv;
    }

    /**
     * [get] EXCESSTOTALINV: {decimal(16, 6)} <br>
     * 過剰
     * @return The value of the column 'EXCESSTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExcesstotalinv() {
        checkSpecifiedProperty("excesstotalinv");
        return _excesstotalinv;
    }

    /**
     * [set] EXCESSTOTALINV: {decimal(16, 6)} <br>
     * 過剰
     * @param excesstotalinv The value of the column 'EXCESSTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcesstotalinv(java.math.BigDecimal excesstotalinv) {
        registerModifiedProperty("excesstotalinv");
        _excesstotalinv = excesstotalinv;
    }

    /**
     * [get] DEFECTTOTALINV: {decimal(16, 6)} <br>
     * 不足
     * @return The value of the column 'DEFECTTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDefecttotalinv() {
        checkSpecifiedProperty("defecttotalinv");
        return _defecttotalinv;
    }

    /**
     * [set] DEFECTTOTALINV: {decimal(16, 6)} <br>
     * 不足
     * @param defecttotalinv The value of the column 'DEFECTTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefecttotalinv(java.math.BigDecimal defecttotalinv) {
        registerModifiedProperty("defecttotalinv");
        _defecttotalinv = defecttotalinv;
    }

    /**
     * [get] CAPITEMFLG: {char(1)} <br>
     * CAP銘柄区分
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCapitemflg() {
        checkSpecifiedProperty("capitemflg");
        return convertEmptyToNull(_capitemflg);
    }

    /**
     * [set] CAPITEMFLG: {char(1)} <br>
     * CAP銘柄区分
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapitemflg(String capitemflg) {
        registerModifiedProperty("capitemflg");
        _capitemflg = capitemflg;
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
