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
 * The entity of M_MFWHxITEM as TABLE. <br>
 * 拠点別銘柄制御マスタ
 * <pre>
 * [primary-key]
 *     MFWH_ITEM_ID
 *
 * [column]
 *     MFWH_ITEM_ID, CLIENT_ID, CENTER_ID, PRODUCT_CD, SLOTLOCNAME, PICKLOCNAME, PHYSICALTYPE, PHYSICALCYCLE, PHYSICALGROUP, PHYSICALDATE, REORDERTYPE, REORDERINTERVAL, REORDERPOINT, REORDERQTY, REORDERLEADTIME, REORDERLASTDAY, SUPPLIERCD, REPLENISHPOINT, MAXQTY, CAUSELOC, SHIPPINGTYPE, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, PROCESSWORKINGKEY, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, SERIALFLG, FULLPALLETFLG, PLSLOTLOCNAME, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFWH_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT, M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, mClient, mCenter
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long mfwhItemId = entity.getMfwhItemId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String productCd = entity.getProductCd();
 * String slotlocname = entity.getSlotlocname();
 * String picklocname = entity.getPicklocname();
 * String physicaltype = entity.getPhysicaltype();
 * java.math.BigDecimal physicalcycle = entity.getPhysicalcycle();
 * String physicalgroup = entity.getPhysicalgroup();
 * String physicaldate = entity.getPhysicaldate();
 * String reordertype = entity.getReordertype();
 * java.math.BigDecimal reorderinterval = entity.getReorderinterval();
 * java.math.BigDecimal reorderpoint = entity.getReorderpoint();
 * java.math.BigDecimal reorderqty = entity.getReorderqty();
 * java.math.BigDecimal reorderleadtime = entity.getReorderleadtime();
 * String reorderlastday = entity.getReorderlastday();
 * String suppliercd = entity.getSuppliercd();
 * java.math.BigDecimal replenishpoint = entity.getReplenishpoint();
 * java.math.BigDecimal maxqty = entity.getMaxqty();
 * String causeloc = entity.getCauseloc();
 * String shippingtype = entity.getShippingtype();
 * java.math.BigDecimal slotpolicykey = entity.getSlotpolicykey();
 * java.math.BigDecimal inworkingkey = entity.getInworkingkey();
 * java.math.BigDecimal outworkingkey = entity.getOutworkingkey();
 * java.math.BigDecimal processworkingkey = entity.getProcessworkingkey();
 * String useruse1 = entity.getUseruse1();
 * String useruse2 = entity.getUseruse2();
 * String useruse3 = entity.getUseruse3();
 * String useruse4 = entity.getUseruse4();
 * String useruse5 = entity.getUseruse5();
 * java.math.BigDecimal serialflg = entity.getSerialflg();
 * java.math.BigDecimal fullpalletflg = entity.getFullpalletflg();
 * String plslotlocname = entity.getPlslotlocname();
 * Long productId = entity.getProductId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMfwhItemId(mfwhItemId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProductCd(productCd);
 * entity.setSlotlocname(slotlocname);
 * entity.setPicklocname(picklocname);
 * entity.setPhysicaltype(physicaltype);
 * entity.setPhysicalcycle(physicalcycle);
 * entity.setPhysicalgroup(physicalgroup);
 * entity.setPhysicaldate(physicaldate);
 * entity.setReordertype(reordertype);
 * entity.setReorderinterval(reorderinterval);
 * entity.setReorderpoint(reorderpoint);
 * entity.setReorderqty(reorderqty);
 * entity.setReorderleadtime(reorderleadtime);
 * entity.setReorderlastday(reorderlastday);
 * entity.setSuppliercd(suppliercd);
 * entity.setReplenishpoint(replenishpoint);
 * entity.setMaxqty(maxqty);
 * entity.setCauseloc(causeloc);
 * entity.setShippingtype(shippingtype);
 * entity.setSlotpolicykey(slotpolicykey);
 * entity.setInworkingkey(inworkingkey);
 * entity.setOutworkingkey(outworkingkey);
 * entity.setProcessworkingkey(processworkingkey);
 * entity.setUseruse1(useruse1);
 * entity.setUseruse2(useruse2);
 * entity.setUseruse3(useruse3);
 * entity.setUseruse4(useruse4);
 * entity.setUseruse5(useruse5);
 * entity.setSerialflg(serialflg);
 * entity.setFullpalletflg(fullpalletflg);
 * entity.setPlslotlocname(plslotlocname);
 * entity.setProductId(productId);
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
public abstract class BsMMfwhxitem extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mfwhItemId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** SLOTLOCNAME: {varchar(255)} */
    protected String _slotlocname;

    /** PICKLOCNAME: {varchar(255)} */
    protected String _picklocname;

    /** PHYSICALTYPE: {NotNull, varchar(30)} */
    protected String _physicaltype;

    /** PHYSICALCYCLE: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _physicalcycle;

    /** PHYSICALGROUP: {varchar(60)} */
    protected String _physicalgroup;

    /** PHYSICALDATE: {varchar(8)} */
    protected String _physicaldate;

    /** REORDERTYPE: {NotNull, varchar(30)} */
    protected String _reordertype;

    /** REORDERINTERVAL: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _reorderinterval;

    /** REORDERPOINT: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _reorderpoint;

    /** REORDERQTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _reorderqty;

    /** REORDERLEADTIME: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _reorderleadtime;

    /** REORDERLASTDAY: {varchar(8)} */
    protected String _reorderlastday;

    /** SUPPLIERCD: {varchar(30)} */
    protected String _suppliercd;

    /** REPLENISHPOINT: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _replenishpoint;

    /** MAXQTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _maxqty;

    /** CAUSELOC: {varchar(255)} */
    protected String _causeloc;

    /** SHIPPINGTYPE: {varchar(30)} */
    protected String _shippingtype;

    /** SLOTPOLICYKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _slotpolicykey;

    /** INWORKINGKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _inworkingkey;

    /** OUTWORKINGKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _outworkingkey;

    /** PROCESSWORKINGKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _processworkingkey;

    /** USERUSE1: {varchar(60)} */
    protected String _useruse1;

    /** USERUSE2: {varchar(60)} */
    protected String _useruse2;

    /** USERUSE3: {varchar(60)} */
    protected String _useruse3;

    /** USERUSE4: {varchar(60)} */
    protected String _useruse4;

    /** USERUSE5: {varchar(60)} */
    protected String _useruse5;

    /** SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _serialflg;

    /** FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _fullpalletflg;

    /** PLSLOTLOCNAME: {varchar(255)} */
    protected String _plslotlocname;

    /** PRODUCT_ID: {bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

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
        return "M_MFWHxITEM";
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
        if (_mfwhItemId == null) { return false; }
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
        if (obj instanceof BsMMfwhxitem) {
            BsMMfwhxitem other = (BsMMfwhxitem)obj;
            if (!xSV(_mfwhItemId, other._mfwhItemId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfwhItemId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfwhItemId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_slotlocname));
        sb.append(dm).append(xfND(_picklocname));
        sb.append(dm).append(xfND(_physicaltype));
        sb.append(dm).append(xfND(_physicalcycle));
        sb.append(dm).append(xfND(_physicalgroup));
        sb.append(dm).append(xfND(_physicaldate));
        sb.append(dm).append(xfND(_reordertype));
        sb.append(dm).append(xfND(_reorderinterval));
        sb.append(dm).append(xfND(_reorderpoint));
        sb.append(dm).append(xfND(_reorderqty));
        sb.append(dm).append(xfND(_reorderleadtime));
        sb.append(dm).append(xfND(_reorderlastday));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_replenishpoint));
        sb.append(dm).append(xfND(_maxqty));
        sb.append(dm).append(xfND(_causeloc));
        sb.append(dm).append(xfND(_shippingtype));
        sb.append(dm).append(xfND(_slotpolicykey));
        sb.append(dm).append(xfND(_inworkingkey));
        sb.append(dm).append(xfND(_outworkingkey));
        sb.append(dm).append(xfND(_processworkingkey));
        sb.append(dm).append(xfND(_useruse1));
        sb.append(dm).append(xfND(_useruse2));
        sb.append(dm).append(xfND(_useruse3));
        sb.append(dm).append(xfND(_useruse4));
        sb.append(dm).append(xfND(_useruse5));
        sb.append(dm).append(xfND(_serialflg));
        sb.append(dm).append(xfND(_fullpalletflg));
        sb.append(dm).append(xfND(_plslotlocname));
        sb.append(dm).append(xfND(_productId));
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
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MMfwhxitem clone() {
        return (MMfwhxitem)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別銘柄制御ID
     * @return The value of the column 'MFWH_ITEM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMfwhItemId() {
        checkSpecifiedProperty("mfwhItemId");
        return _mfwhItemId;
    }

    /**
     * [set] MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別銘柄制御ID
     * @param mfwhItemId The value of the column 'MFWH_ITEM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMfwhItemId(Long mfwhItemId) {
        registerModifiedProperty("mfwhItemId");
        _mfwhItemId = mfwhItemId;
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
     * [get] SLOTLOCNAME: {varchar(255)} <br>
     * 保管ロケ名称
     * @return The value of the column 'SLOTLOCNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlotlocname() {
        checkSpecifiedProperty("slotlocname");
        return convertEmptyToNull(_slotlocname);
    }

    /**
     * [set] SLOTLOCNAME: {varchar(255)} <br>
     * 保管ロケ名称
     * @param slotlocname The value of the column 'SLOTLOCNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlotlocname(String slotlocname) {
        registerModifiedProperty("slotlocname");
        _slotlocname = slotlocname;
    }

    /**
     * [get] PICKLOCNAME: {varchar(255)} <br>
     * ピッキングロケ名称
     * @return The value of the column 'PICKLOCNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicklocname() {
        checkSpecifiedProperty("picklocname");
        return convertEmptyToNull(_picklocname);
    }

    /**
     * [set] PICKLOCNAME: {varchar(255)} <br>
     * ピッキングロケ名称
     * @param picklocname The value of the column 'PICKLOCNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklocname(String picklocname) {
        registerModifiedProperty("picklocname");
        _picklocname = picklocname;
    }

    /**
     * [get] PHYSICALTYPE: {NotNull, varchar(30)} <br>
     * 棚卸手段タイプ
     * @return The value of the column 'PHYSICALTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getPhysicaltype() {
        checkSpecifiedProperty("physicaltype");
        return convertEmptyToNull(_physicaltype);
    }

    /**
     * [set] PHYSICALTYPE: {NotNull, varchar(30)} <br>
     * 棚卸手段タイプ
     * @param physicaltype The value of the column 'PHYSICALTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setPhysicaltype(String physicaltype) {
        registerModifiedProperty("physicaltype");
        _physicaltype = physicaltype;
    }

    /**
     * [get] PHYSICALCYCLE: {decimal(16, 6), default=[(0)]} <br>
     * 循環棚卸日数
     * @return The value of the column 'PHYSICALCYCLE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPhysicalcycle() {
        checkSpecifiedProperty("physicalcycle");
        return _physicalcycle;
    }

    /**
     * [set] PHYSICALCYCLE: {decimal(16, 6), default=[(0)]} <br>
     * 循環棚卸日数
     * @param physicalcycle The value of the column 'PHYSICALCYCLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhysicalcycle(java.math.BigDecimal physicalcycle) {
        registerModifiedProperty("physicalcycle");
        _physicalcycle = physicalcycle;
    }

    /**
     * [get] PHYSICALGROUP: {varchar(60)} <br>
     * 循環棚卸グループ
     * @return The value of the column 'PHYSICALGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhysicalgroup() {
        checkSpecifiedProperty("physicalgroup");
        return convertEmptyToNull(_physicalgroup);
    }

    /**
     * [set] PHYSICALGROUP: {varchar(60)} <br>
     * 循環棚卸グループ
     * @param physicalgroup The value of the column 'PHYSICALGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhysicalgroup(String physicalgroup) {
        registerModifiedProperty("physicalgroup");
        _physicalgroup = physicalgroup;
    }

    /**
     * [get] PHYSICALDATE: {varchar(8)} <br>
     * 前回棚卸日
     * @return The value of the column 'PHYSICALDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhysicaldate() {
        checkSpecifiedProperty("physicaldate");
        return convertEmptyToNull(_physicaldate);
    }

    /**
     * [set] PHYSICALDATE: {varchar(8)} <br>
     * 前回棚卸日
     * @param physicaldate The value of the column 'PHYSICALDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhysicaldate(String physicaldate) {
        registerModifiedProperty("physicaldate");
        _physicaldate = physicaldate;
    }

    /**
     * [get] REORDERTYPE: {NotNull, varchar(30)} <br>
     * 自動発注タイプ
     * @return The value of the column 'REORDERTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getReordertype() {
        checkSpecifiedProperty("reordertype");
        return convertEmptyToNull(_reordertype);
    }

    /**
     * [set] REORDERTYPE: {NotNull, varchar(30)} <br>
     * 自動発注タイプ
     * @param reordertype The value of the column 'REORDERTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setReordertype(String reordertype) {
        registerModifiedProperty("reordertype");
        _reordertype = reordertype;
    }

    /**
     * [get] REORDERINTERVAL: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注間隔
     * @return The value of the column 'REORDERINTERVAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReorderinterval() {
        checkSpecifiedProperty("reorderinterval");
        return _reorderinterval;
    }

    /**
     * [set] REORDERINTERVAL: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注間隔
     * @param reorderinterval The value of the column 'REORDERINTERVAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReorderinterval(java.math.BigDecimal reorderinterval) {
        registerModifiedProperty("reorderinterval");
        _reorderinterval = reorderinterval;
    }

    /**
     * [get] REORDERPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注点
     * @return The value of the column 'REORDERPOINT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReorderpoint() {
        checkSpecifiedProperty("reorderpoint");
        return _reorderpoint;
    }

    /**
     * [set] REORDERPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注点
     * @param reorderpoint The value of the column 'REORDERPOINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReorderpoint(java.math.BigDecimal reorderpoint) {
        registerModifiedProperty("reorderpoint");
        _reorderpoint = reorderpoint;
    }

    /**
     * [get] REORDERQTY: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注数量
     * @return The value of the column 'REORDERQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReorderqty() {
        checkSpecifiedProperty("reorderqty");
        return _reorderqty;
    }

    /**
     * [set] REORDERQTY: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注数量
     * @param reorderqty The value of the column 'REORDERQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReorderqty(java.math.BigDecimal reorderqty) {
        registerModifiedProperty("reorderqty");
        _reorderqty = reorderqty;
    }

    /**
     * [get] REORDERLEADTIME: {decimal(16, 6), default=[(0)]} <br>
     * 調達リードタイム
     * @return The value of the column 'REORDERLEADTIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReorderleadtime() {
        checkSpecifiedProperty("reorderleadtime");
        return _reorderleadtime;
    }

    /**
     * [set] REORDERLEADTIME: {decimal(16, 6), default=[(0)]} <br>
     * 調達リードタイム
     * @param reorderleadtime The value of the column 'REORDERLEADTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReorderleadtime(java.math.BigDecimal reorderleadtime) {
        registerModifiedProperty("reorderleadtime");
        _reorderleadtime = reorderleadtime;
    }

    /**
     * [get] REORDERLASTDAY: {varchar(8)} <br>
     * 前回発注日
     * @return The value of the column 'REORDERLASTDAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getReorderlastday() {
        checkSpecifiedProperty("reorderlastday");
        return convertEmptyToNull(_reorderlastday);
    }

    /**
     * [set] REORDERLASTDAY: {varchar(8)} <br>
     * 前回発注日
     * @param reorderlastday The value of the column 'REORDERLASTDAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReorderlastday(String reorderlastday) {
        registerModifiedProperty("reorderlastday");
        _reorderlastday = reorderlastday;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] REPLENISHPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動補充点
     * @return The value of the column 'REPLENISHPOINT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReplenishpoint() {
        checkSpecifiedProperty("replenishpoint");
        return _replenishpoint;
    }

    /**
     * [set] REPLENISHPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動補充点
     * @param replenishpoint The value of the column 'REPLENISHPOINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishpoint(java.math.BigDecimal replenishpoint) {
        registerModifiedProperty("replenishpoint");
        _replenishpoint = replenishpoint;
    }

    /**
     * [get] MAXQTY: {decimal(16, 6), default=[(0)]} <br>
     * 最大保管数量
     * @return The value of the column 'MAXQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMaxqty() {
        checkSpecifiedProperty("maxqty");
        return _maxqty;
    }

    /**
     * [set] MAXQTY: {decimal(16, 6), default=[(0)]} <br>
     * 最大保管数量
     * @param maxqty The value of the column 'MAXQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxqty(java.math.BigDecimal maxqty) {
        registerModifiedProperty("maxqty");
        _maxqty = maxqty;
    }

    /**
     * [get] CAUSELOC: {varchar(255)} <br>
     * 補充元ロケ名称
     * @return The value of the column 'CAUSELOC'. (NullAllowed even if selected: for no constraint)
     */
    public String getCauseloc() {
        checkSpecifiedProperty("causeloc");
        return convertEmptyToNull(_causeloc);
    }

    /**
     * [set] CAUSELOC: {varchar(255)} <br>
     * 補充元ロケ名称
     * @param causeloc The value of the column 'CAUSELOC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCauseloc(String causeloc) {
        registerModifiedProperty("causeloc");
        _causeloc = causeloc;
    }

    /**
     * [get] SHIPPINGTYPE: {varchar(30)} <br>
     * 発送方法タイプ
     * @return The value of the column 'SHIPPINGTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingtype() {
        checkSpecifiedProperty("shippingtype");
        return convertEmptyToNull(_shippingtype);
    }

    /**
     * [set] SHIPPINGTYPE: {varchar(30)} <br>
     * 発送方法タイプ
     * @param shippingtype The value of the column 'SHIPPINGTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingtype(String shippingtype) {
        registerModifiedProperty("shippingtype");
        _shippingtype = shippingtype;
    }

    /**
     * [get] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 格納ルールキー
     * @return The value of the column 'SLOTPOLICYKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSlotpolicykey() {
        checkSpecifiedProperty("slotpolicykey");
        return _slotpolicykey;
    }

    /**
     * [set] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 格納ルールキー
     * @param slotpolicykey The value of the column 'SLOTPOLICYKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlotpolicykey(java.math.BigDecimal slotpolicykey) {
        registerModifiedProperty("slotpolicykey");
        _slotpolicykey = slotpolicykey;
    }

    /**
     * [get] INWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @return The value of the column 'INWORKINGKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInworkingkey() {
        checkSpecifiedProperty("inworkingkey");
        return _inworkingkey;
    }

    /**
     * [set] INWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @param inworkingkey The value of the column 'INWORKINGKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInworkingkey(java.math.BigDecimal inworkingkey) {
        registerModifiedProperty("inworkingkey");
        _inworkingkey = inworkingkey;
    }

    /**
     * [get] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @return The value of the column 'OUTWORKINGKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOutworkingkey() {
        checkSpecifiedProperty("outworkingkey");
        return _outworkingkey;
    }

    /**
     * [set] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @param outworkingkey The value of the column 'OUTWORKINGKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutworkingkey(java.math.BigDecimal outworkingkey) {
        registerModifiedProperty("outworkingkey");
        _outworkingkey = outworkingkey;
    }

    /**
     * [get] PROCESSWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @return The value of the column 'PROCESSWORKINGKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getProcessworkingkey() {
        checkSpecifiedProperty("processworkingkey");
        return _processworkingkey;
    }

    /**
     * [set] PROCESSWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @param processworkingkey The value of the column 'PROCESSWORKINGKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessworkingkey(java.math.BigDecimal processworkingkey) {
        registerModifiedProperty("processworkingkey");
        _processworkingkey = processworkingkey;
    }

    /**
     * [get] USERUSE1: {varchar(60)} <br>
     * ユーザ設定項目１
     * @return The value of the column 'USERUSE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse1() {
        checkSpecifiedProperty("useruse1");
        return convertEmptyToNull(_useruse1);
    }

    /**
     * [set] USERUSE1: {varchar(60)} <br>
     * ユーザ設定項目１
     * @param useruse1 The value of the column 'USERUSE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse1(String useruse1) {
        registerModifiedProperty("useruse1");
        _useruse1 = useruse1;
    }

    /**
     * [get] USERUSE2: {varchar(60)} <br>
     * ユーザ設定項目２
     * @return The value of the column 'USERUSE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse2() {
        checkSpecifiedProperty("useruse2");
        return convertEmptyToNull(_useruse2);
    }

    /**
     * [set] USERUSE2: {varchar(60)} <br>
     * ユーザ設定項目２
     * @param useruse2 The value of the column 'USERUSE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse2(String useruse2) {
        registerModifiedProperty("useruse2");
        _useruse2 = useruse2;
    }

    /**
     * [get] USERUSE3: {varchar(60)} <br>
     * ユーザ設定項目３
     * @return The value of the column 'USERUSE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse3() {
        checkSpecifiedProperty("useruse3");
        return convertEmptyToNull(_useruse3);
    }

    /**
     * [set] USERUSE3: {varchar(60)} <br>
     * ユーザ設定項目３
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse3(String useruse3) {
        registerModifiedProperty("useruse3");
        _useruse3 = useruse3;
    }

    /**
     * [get] USERUSE4: {varchar(60)} <br>
     * ユーザ設定項目４
     * @return The value of the column 'USERUSE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse4() {
        checkSpecifiedProperty("useruse4");
        return convertEmptyToNull(_useruse4);
    }

    /**
     * [set] USERUSE4: {varchar(60)} <br>
     * ユーザ設定項目４
     * @param useruse4 The value of the column 'USERUSE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse4(String useruse4) {
        registerModifiedProperty("useruse4");
        _useruse4 = useruse4;
    }

    /**
     * [get] USERUSE5: {varchar(60)} <br>
     * ユーザ設定項目５
     * @return The value of the column 'USERUSE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse5() {
        checkSpecifiedProperty("useruse5");
        return convertEmptyToNull(_useruse5);
    }

    /**
     * [set] USERUSE5: {varchar(60)} <br>
     * ユーザ設定項目５
     * @param useruse5 The value of the column 'USERUSE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse5(String useruse5) {
        registerModifiedProperty("useruse5");
        _useruse5 = useruse5;
    }

    /**
     * [get] SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * シリアル管理フラグ
     * @return The value of the column 'SERIALFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSerialflg() {
        checkSpecifiedProperty("serialflg");
        return _serialflg;
    }

    /**
     * [set] SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * シリアル管理フラグ
     * @param serialflg The value of the column 'SERIALFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSerialflg(java.math.BigDecimal serialflg) {
        registerModifiedProperty("serialflg");
        _serialflg = serialflg;
    }

    /**
     * [get] FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * フルパレット管理フラグ
     * @return The value of the column 'FULLPALLETFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getFullpalletflg() {
        checkSpecifiedProperty("fullpalletflg");
        return _fullpalletflg;
    }

    /**
     * [set] FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * フルパレット管理フラグ
     * @param fullpalletflg The value of the column 'FULLPALLETFLG'. (basically NotNull if update: for the constraint)
     */
    public void setFullpalletflg(java.math.BigDecimal fullpalletflg) {
        registerModifiedProperty("fullpalletflg");
        _fullpalletflg = fullpalletflg;
    }

    /**
     * [get] PLSLOTLOCNAME: {varchar(255)} <br>
     * フルパレット保管ロケ名称
     * @return The value of the column 'PLSLOTLOCNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlslotlocname() {
        checkSpecifiedProperty("plslotlocname");
        return convertEmptyToNull(_plslotlocname);
    }

    /**
     * [set] PLSLOTLOCNAME: {varchar(255)} <br>
     * フルパレット保管ロケ名称
     * @param plslotlocname The value of the column 'PLSLOTLOCNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlslotlocname(String plslotlocname) {
        registerModifiedProperty("plslotlocname");
        _plslotlocname = plslotlocname;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
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
