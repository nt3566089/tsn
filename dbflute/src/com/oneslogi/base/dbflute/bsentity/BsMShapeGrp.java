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
 * The entity of M_SHAPE_GRP as TABLE. <br>
 * 荷姿グループマスタ
 * <pre>
 * [primary-key]
 *     SHAPE_GRP_ID
 *
 * [column]
 *     SHAPE_GRP_ID, CLIENT_ID, SHAPE_GRP_CD, SHAPE_GRP_NAME, DECIMAL_EXIST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, B_CLASS_DTL(ByDecimalExistFlg)
 *
 * [referrer table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP_DTL
 *
 * [foreign property]
 *     mClient, bClassDtlByDecimalExistFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mClientList, mProductList, mShapeGrpDtlList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shapeGrpId = entity.getShapeGrpId();
 * Long clientId = entity.getClientId();
 * String shapeGrpCd = entity.getShapeGrpCd();
 * String shapeGrpName = entity.getShapeGrpName();
 * String decimalExistFlg = entity.getDecimalExistFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShapeGrpId(shapeGrpId);
 * entity.setClientId(clientId);
 * entity.setShapeGrpCd(shapeGrpCd);
 * entity.setShapeGrpName(shapeGrpName);
 * entity.setDecimalExistFlg(decimalExistFlg);
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
public abstract class BsMShapeGrp extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shapeGrpId;

    /** CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** SHAPE_GRP_CD: {NotNull, varchar(30)} */
    protected String _shapeGrpCd;

    /** SHAPE_GRP_NAME: {NotNull, varchar(255)} */
    protected String _shapeGrpName;

    /** DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} */
    protected String _decimalExistFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "M_SHAPE_GRP";
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
        if (_shapeGrpId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of decimalExistFlg as the classification of DecimalExistFlg. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DecimalExistFlg getDecimalExistFlgAsDecimalExistFlg() {
        return CDef.DecimalExistFlg.codeOf(getDecimalExistFlg());
    }

    /**
     * Set the value of decimalExistFlg as the classification of DecimalExistFlg. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg cdef) {
        setDecimalExistFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
     * Set the value of decimalExistFlg as $0 (0). <br>
     * $0: 小数を含まない
     */
    public void setDecimalExistFlg_$0() {
        setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg.$0);
    }

    /**
     * Set the value of decimalExistFlg as $1 (1). <br>
     * $1: 小数を含む
     */
    public void setDecimalExistFlg_$1() {
        setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg.$1);
    }

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
     * Is the value of decimalExistFlg $0? <br>
     * $0: 小数を含まない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDecimalExistFlg$0() {
        CDef.DecimalExistFlg cdef = getDecimalExistFlgAsDecimalExistFlg();
        return cdef != null ? cdef.equals(CDef.DecimalExistFlg.$0) : false;
    }

    /**
     * Is the value of decimalExistFlg $1? <br>
     * $1: 小数を含む
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDecimalExistFlg$1() {
        CDef.DecimalExistFlg cdef = getDecimalExistFlgAsDecimalExistFlg();
        return cdef != null ? cdef.equals(CDef.DecimalExistFlg.$1) : false;
    }

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
     * Get the value of the column 'decimalExistFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDecimalExistFlgName() {
        CDef.DecimalExistFlg cdef = getDecimalExistFlgAsDecimalExistFlg();
        return cdef != null ? cdef.name() : null;
    }

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

    /** B_CLASS_DTL by my DECIMAL_EXIST_FLG, named 'BClassDtlByDecimalExistFlg'. */
    protected BClassDtl _bClassDtlByDecimalExistFlg;

    /**
     * [get] B_CLASS_DTL by my DECIMAL_EXIST_FLG, named 'BClassDtlByDecimalExistFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDecimalExistFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDecimalExistFlg() {
        return _bClassDtlByDecimalExistFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DECIMAL_EXIST_FLG, named 'BClassDtlByDecimalExistFlg'.
     * @param bClassDtlByDecimalExistFlg The entity of foreign property 'BClassDtlByDecimalExistFlg'. (NullAllowed)
     */
    public void setBClassDtlByDecimalExistFlg(BClassDtl bClassDtlByDecimalExistFlg) {
        _bClassDtlByDecimalExistFlg = bClassDtlByDecimalExistFlg;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_CLIENT by SHAPE_GRP_ID, named 'MClientList'. */
    protected List<MClient> _mClientList;

    /**
     * [get] M_CLIENT by SHAPE_GRP_ID, named 'MClientList'.
     * @return The entity list of referrer property 'MClientList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClient> getMClientList() {
        if (_mClientList == null) { _mClientList = newReferrerList(); }
        return _mClientList;
    }

    /**
     * [set] M_CLIENT by SHAPE_GRP_ID, named 'MClientList'.
     * @param mClientList The entity list of referrer property 'MClientList'. (NullAllowed)
     */
    public void setMClientList(List<MClient> mClientList) {
        _mClientList = mClientList;
    }

    /** M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'. */
    protected List<MProduct> _mProductList;

    /**
     * [get] M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'.
     * @return The entity list of referrer property 'MProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProduct> getMProductList() {
        if (_mProductList == null) { _mProductList = newReferrerList(); }
        return _mProductList;
    }

    /**
     * [set] M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'.
     * @param mProductList The entity list of referrer property 'MProductList'. (NullAllowed)
     */
    public void setMProductList(List<MProduct> mProductList) {
        _mProductList = mProductList;
    }

    /** M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'. */
    protected List<MShapeGrpDtl> _mShapeGrpDtlList;

    /**
     * [get] M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'.
     * @return The entity list of referrer property 'MShapeGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShapeGrpDtl> getMShapeGrpDtlList() {
        if (_mShapeGrpDtlList == null) { _mShapeGrpDtlList = newReferrerList(); }
        return _mShapeGrpDtlList;
    }

    /**
     * [set] M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'.
     * @param mShapeGrpDtlList The entity list of referrer property 'MShapeGrpDtlList'. (NullAllowed)
     */
    public void setMShapeGrpDtlList(List<MShapeGrpDtl> mShapeGrpDtlList) {
        _mShapeGrpDtlList = mShapeGrpDtlList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMShapeGrp) {
            BsMShapeGrp other = (BsMShapeGrp)obj;
            if (!xSV(_shapeGrpId, other._shapeGrpId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shapeGrpId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_bClassDtlByDecimalExistFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDecimalExistFlg, "bClassDtlByDecimalExistFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mClientList != null) { for (MClient et : _mClientList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientList")); } } }
        if (_mProductList != null) { for (MProduct et : _mProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProductList")); } } }
        if (_mShapeGrpDtlList != null) { for (MShapeGrpDtl et : _mShapeGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShapeGrpDtlList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shapeGrpId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_shapeGrpCd));
        sb.append(dm).append(xfND(_shapeGrpName));
        sb.append(dm).append(xfND(_decimalExistFlg));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_bClassDtlByDecimalExistFlg != null)
        { sb.append(dm).append("bClassDtlByDecimalExistFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mClientList != null && !_mClientList.isEmpty())
        { sb.append(dm).append("mClientList"); }
        if (_mProductList != null && !_mProductList.isEmpty())
        { sb.append(dm).append("mProductList"); }
        if (_mShapeGrpDtlList != null && !_mShapeGrpDtlList.isEmpty())
        { sb.append(dm).append("mShapeGrpDtlList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MShapeGrp clone() {
        return (MShapeGrp)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeGrpId() {
        checkSpecifiedProperty("shapeGrpId");
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        registerModifiedProperty("shapeGrpId");
        _shapeGrpId = shapeGrpId;
    }

    /**
     * [get] CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] SHAPE_GRP_CD: {NotNull, varchar(30)} <br>
     * 荷姿グループCD
     * @return The value of the column 'SHAPE_GRP_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getShapeGrpCd() {
        checkSpecifiedProperty("shapeGrpCd");
        return convertEmptyToNull(_shapeGrpCd);
    }

    /**
     * [set] SHAPE_GRP_CD: {NotNull, varchar(30)} <br>
     * 荷姿グループCD
     * @param shapeGrpCd The value of the column 'SHAPE_GRP_CD'. (basically NotNull if update: for the constraint)
     */
    public void setShapeGrpCd(String shapeGrpCd) {
        registerModifiedProperty("shapeGrpCd");
        _shapeGrpCd = shapeGrpCd;
    }

    /**
     * [get] SHAPE_GRP_NAME: {NotNull, varchar(255)} <br>
     * 荷姿グループ名称
     * @return The value of the column 'SHAPE_GRP_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getShapeGrpName() {
        checkSpecifiedProperty("shapeGrpName");
        return convertEmptyToNull(_shapeGrpName);
    }

    /**
     * [set] SHAPE_GRP_NAME: {NotNull, varchar(255)} <br>
     * 荷姿グループ名称
     * @param shapeGrpName The value of the column 'SHAPE_GRP_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setShapeGrpName(String shapeGrpName) {
        registerModifiedProperty("shapeGrpName");
        _shapeGrpName = shapeGrpName;
    }

    /**
     * [get] DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @return The value of the column 'DECIMAL_EXIST_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDecimalExistFlg() {
        checkSpecifiedProperty("decimalExistFlg");
        return convertEmptyToNull(_decimalExistFlg);
    }

    /**
     * [set] DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param decimalExistFlg The value of the column 'DECIMAL_EXIST_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDecimalExistFlg(String decimalExistFlg) {
        registerModifiedProperty("decimalExistFlg");
        _decimalExistFlg = decimalExistFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
