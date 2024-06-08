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
 * The entity of B_DICT as TABLE. <br>
 * 辞書マスタ
 * <pre>
 * [primary-key]
 *     DICT_ID
 *
 * [column]
 *     DICT_ID, DICT_NM, DATA_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByDataType), B_DICT_VALID(AsOne), M_HT_DICT(AsOne)
 *
 * [referrer table]
 *     B_ARG, B_CLASS_DTL, B_COL, B_CULTURE, B_DICT_CULTURE, B_ITEM, B_MENU, B_MENU_GRP, B_ROLE, B_ROLE_GRP, B_SCREEN, M_CENTER_CLASS_DTL, M_CENTER_COL, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_PROCESS_TYPE, M_SHAPE, M_STOCK_TYPE, P_REPORT_LAYOUT_ITEM, P_SUBREP_LAYOUT_ITEM, B_DICT_VALID, M_HT_DICT
 *
 * [foreign property]
 *     bClassDtlByDataType, bDictValidAsOne, mHtDictAsOne
 *
 * [referrer property]
 *     bArgList, bClassDtlList, bColList, bCultureList, bDictCultureList, bItemList, bMenuList, bMenuGrpList, bRoleList, bRoleGrpList, bScreenList, mCenterClassDtlList, mCenterColList, mCenterItemList, mCenterScreenList, mClientColList, mClientItemList, mClientScreenList, mProcessTypeList, mShapeByShapeDictIdList, mShapeByShapeUnitDictIdList, mStockTypeList, pReportLayoutItemList, pSubrepLayoutItemList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long dictId = entity.getDictId();
 * String dictNm = entity.getDictNm();
 * String dataType = entity.getDataType();
 * String systemType = entity.getSystemType();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setDictId(dictId);
 * entity.setDictNm(dictNm);
 * entity.setDataType(dataType);
 * entity.setSystemType(systemType);
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
public abstract class BsBDict extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DICT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _dictId;

    /** DICT_NM: {UQ, NotNull, varchar(100)} */
    protected String _dictNm;

    /** DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} */
    protected String _dataType;

    /** SYSTEM_TYPE: {varchar(30)} */
    protected String _systemType;

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
        return "B_DICT";
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
        if (_dictId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param dictNm : UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(String dictNm) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("dictNm");
        setDictNm(dictNm);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of dataType as the classification of DataType. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DataType getDataTypeAsDataType() {
        return CDef.DataType.codeOf(getDataType());
    }

    /**
     * Set the value of dataType as the classification of DataType. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDataTypeAsDataType(CDef.DataType cdef) {
        setDataType(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of dataType as $date (date). <br>
     * $date: 日付
     */
    public void setDataType_$date() {
        setDataTypeAsDataType(CDef.DataType.$date);
    }

    /**
     * Set the value of dataType as $datetime (datetime). <br>
     * $datetime: 日時
     */
    public void setDataType_$datetime() {
        setDataTypeAsDataType(CDef.DataType.$datetime);
    }

    /**
     * Set the value of dataType as $number (number). <br>
     * $number: 数値
     */
    public void setDataType_$number() {
        setDataTypeAsDataType(CDef.DataType.$number);
    }

    /**
     * Set the value of dataType as $text (text). <br>
     * $text: テキスト
     */
    public void setDataType_$text() {
        setDataTypeAsDataType(CDef.DataType.$text);
    }

    /**
     * Set the value of dataType as $time (time). <br>
     * $time: 時刻
     */
    public void setDataType_$time() {
        setDataTypeAsDataType(CDef.DataType.$time);
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
     * Is the value of dataType $date? <br>
     * $date: 日付
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataType$date() {
        CDef.DataType cdef = getDataTypeAsDataType();
        return cdef != null ? cdef.equals(CDef.DataType.$date) : false;
    }

    /**
     * Is the value of dataType $datetime? <br>
     * $datetime: 日時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataType$datetime() {
        CDef.DataType cdef = getDataTypeAsDataType();
        return cdef != null ? cdef.equals(CDef.DataType.$datetime) : false;
    }

    /**
     * Is the value of dataType $number? <br>
     * $number: 数値
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataType$number() {
        CDef.DataType cdef = getDataTypeAsDataType();
        return cdef != null ? cdef.equals(CDef.DataType.$number) : false;
    }

    /**
     * Is the value of dataType $text? <br>
     * $text: テキスト
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataType$text() {
        CDef.DataType cdef = getDataTypeAsDataType();
        return cdef != null ? cdef.equals(CDef.DataType.$text) : false;
    }

    /**
     * Is the value of dataType $time? <br>
     * $time: 時刻
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataType$time() {
        CDef.DataType cdef = getDataTypeAsDataType();
        return cdef != null ? cdef.equals(CDef.DataType.$time) : false;
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
     * Get the value of the column 'dataType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDataTypeName() {
        CDef.DataType cdef = getDataTypeAsDataType();
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
    /** B_CLASS_DTL by my DATA_TYPE, named 'BClassDtlByDataType'. */
    protected BClassDtl _bClassDtlByDataType;

    /**
     * [get] B_CLASS_DTL by my DATA_TYPE, named 'BClassDtlByDataType'. <br>
     * @return The entity of foreign property 'BClassDtlByDataType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDataType() {
        return _bClassDtlByDataType;
    }

    /**
     * [set] B_CLASS_DTL by my DATA_TYPE, named 'BClassDtlByDataType'.
     * @param bClassDtlByDataType The entity of foreign property 'BClassDtlByDataType'. (NullAllowed)
     */
    public void setBClassDtlByDataType(BClassDtl bClassDtlByDataType) {
        _bClassDtlByDataType = bClassDtlByDataType;
    }

    /** B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'. */
    protected BDictValid _bDictValidAsOne;

    /**
     * [get] B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'BDictValidAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public BDictValid getBDictValidAsOne() {
        return _bDictValidAsOne;
    }

    /**
     * [set] B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * @param BDictValidAsOne The entity of foreign property(referrer-as-one) 'BDictValidAsOne'. (NullAllowed)
     */
    public void setBDictValidAsOne(BDictValid BDictValidAsOne) {
        _bDictValidAsOne = BDictValidAsOne;
    }

    /** M_HT_DICT by DICT_ID, named 'MHtDictAsOne'. */
    protected MHtDict _mHtDictAsOne;

    /**
     * [get] M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MHtDictAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MHtDict getMHtDictAsOne() {
        return _mHtDictAsOne;
    }

    /**
     * [set] M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * @param MHtDictAsOne The entity of foreign property(referrer-as-one) 'MHtDictAsOne'. (NullAllowed)
     */
    public void setMHtDictAsOne(MHtDict MHtDictAsOne) {
        _mHtDictAsOne = MHtDictAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_ARG by DICT_ID, named 'BArgList'. */
    protected List<BArg> _bArgList;

    /**
     * [get] B_ARG by DICT_ID, named 'BArgList'.
     * @return The entity list of referrer property 'BArgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BArg> getBArgList() {
        if (_bArgList == null) { _bArgList = newReferrerList(); }
        return _bArgList;
    }

    /**
     * [set] B_ARG by DICT_ID, named 'BArgList'.
     * @param bArgList The entity list of referrer property 'BArgList'. (NullAllowed)
     */
    public void setBArgList(List<BArg> bArgList) {
        _bArgList = bArgList;
    }

    /** B_CLASS_DTL by DICT_ID, named 'BClassDtlList'. */
    protected List<BClassDtl> _bClassDtlList;

    /**
     * [get] B_CLASS_DTL by DICT_ID, named 'BClassDtlList'.
     * @return The entity list of referrer property 'BClassDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BClassDtl> getBClassDtlList() {
        if (_bClassDtlList == null) { _bClassDtlList = newReferrerList(); }
        return _bClassDtlList;
    }

    /**
     * [set] B_CLASS_DTL by DICT_ID, named 'BClassDtlList'.
     * @param bClassDtlList The entity list of referrer property 'BClassDtlList'. (NullAllowed)
     */
    public void setBClassDtlList(List<BClassDtl> bClassDtlList) {
        _bClassDtlList = bClassDtlList;
    }

    /** B_COL by DICT_ID, named 'BColList'. */
    protected List<BCol> _bColList;

    /**
     * [get] B_COL by DICT_ID, named 'BColList'.
     * @return The entity list of referrer property 'BColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BCol> getBColList() {
        if (_bColList == null) { _bColList = newReferrerList(); }
        return _bColList;
    }

    /**
     * [set] B_COL by DICT_ID, named 'BColList'.
     * @param bColList The entity list of referrer property 'BColList'. (NullAllowed)
     */
    public void setBColList(List<BCol> bColList) {
        _bColList = bColList;
    }

    /** B_CULTURE by DICT_ID, named 'BCultureList'. */
    protected List<BCulture> _bCultureList;

    /**
     * [get] B_CULTURE by DICT_ID, named 'BCultureList'.
     * @return The entity list of referrer property 'BCultureList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BCulture> getBCultureList() {
        if (_bCultureList == null) { _bCultureList = newReferrerList(); }
        return _bCultureList;
    }

    /**
     * [set] B_CULTURE by DICT_ID, named 'BCultureList'.
     * @param bCultureList The entity list of referrer property 'BCultureList'. (NullAllowed)
     */
    public void setBCultureList(List<BCulture> bCultureList) {
        _bCultureList = bCultureList;
    }

    /** B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'. */
    protected List<BDictCulture> _bDictCultureList;

    /**
     * [get] B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'.
     * @return The entity list of referrer property 'BDictCultureList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BDictCulture> getBDictCultureList() {
        if (_bDictCultureList == null) { _bDictCultureList = newReferrerList(); }
        return _bDictCultureList;
    }

    /**
     * [set] B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'.
     * @param bDictCultureList The entity list of referrer property 'BDictCultureList'. (NullAllowed)
     */
    public void setBDictCultureList(List<BDictCulture> bDictCultureList) {
        _bDictCultureList = bDictCultureList;
    }

    /** B_ITEM by DICT_ID, named 'BItemList'. */
    protected List<BItem> _bItemList;

    /**
     * [get] B_ITEM by DICT_ID, named 'BItemList'.
     * @return The entity list of referrer property 'BItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BItem> getBItemList() {
        if (_bItemList == null) { _bItemList = newReferrerList(); }
        return _bItemList;
    }

    /**
     * [set] B_ITEM by DICT_ID, named 'BItemList'.
     * @param bItemList The entity list of referrer property 'BItemList'. (NullAllowed)
     */
    public void setBItemList(List<BItem> bItemList) {
        _bItemList = bItemList;
    }

    /** B_MENU by DICT_ID, named 'BMenuList'. */
    protected List<BMenu> _bMenuList;

    /**
     * [get] B_MENU by DICT_ID, named 'BMenuList'.
     * @return The entity list of referrer property 'BMenuList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BMenu> getBMenuList() {
        if (_bMenuList == null) { _bMenuList = newReferrerList(); }
        return _bMenuList;
    }

    /**
     * [set] B_MENU by DICT_ID, named 'BMenuList'.
     * @param bMenuList The entity list of referrer property 'BMenuList'. (NullAllowed)
     */
    public void setBMenuList(List<BMenu> bMenuList) {
        _bMenuList = bMenuList;
    }

    /** B_MENU_GRP by DICT_ID, named 'BMenuGrpList'. */
    protected List<BMenuGrp> _bMenuGrpList;

    /**
     * [get] B_MENU_GRP by DICT_ID, named 'BMenuGrpList'.
     * @return The entity list of referrer property 'BMenuGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BMenuGrp> getBMenuGrpList() {
        if (_bMenuGrpList == null) { _bMenuGrpList = newReferrerList(); }
        return _bMenuGrpList;
    }

    /**
     * [set] B_MENU_GRP by DICT_ID, named 'BMenuGrpList'.
     * @param bMenuGrpList The entity list of referrer property 'BMenuGrpList'. (NullAllowed)
     */
    public void setBMenuGrpList(List<BMenuGrp> bMenuGrpList) {
        _bMenuGrpList = bMenuGrpList;
    }

    /** B_ROLE by DICT_ID, named 'BRoleList'. */
    protected List<BRole> _bRoleList;

    /**
     * [get] B_ROLE by DICT_ID, named 'BRoleList'.
     * @return The entity list of referrer property 'BRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BRole> getBRoleList() {
        if (_bRoleList == null) { _bRoleList = newReferrerList(); }
        return _bRoleList;
    }

    /**
     * [set] B_ROLE by DICT_ID, named 'BRoleList'.
     * @param bRoleList The entity list of referrer property 'BRoleList'. (NullAllowed)
     */
    public void setBRoleList(List<BRole> bRoleList) {
        _bRoleList = bRoleList;
    }

    /** B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'. */
    protected List<BRoleGrp> _bRoleGrpList;

    /**
     * [get] B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'.
     * @return The entity list of referrer property 'BRoleGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BRoleGrp> getBRoleGrpList() {
        if (_bRoleGrpList == null) { _bRoleGrpList = newReferrerList(); }
        return _bRoleGrpList;
    }

    /**
     * [set] B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'.
     * @param bRoleGrpList The entity list of referrer property 'BRoleGrpList'. (NullAllowed)
     */
    public void setBRoleGrpList(List<BRoleGrp> bRoleGrpList) {
        _bRoleGrpList = bRoleGrpList;
    }

    /** B_SCREEN by DICT_ID, named 'BScreenList'. */
    protected List<BScreen> _bScreenList;

    /**
     * [get] B_SCREEN by DICT_ID, named 'BScreenList'.
     * @return The entity list of referrer property 'BScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BScreen> getBScreenList() {
        if (_bScreenList == null) { _bScreenList = newReferrerList(); }
        return _bScreenList;
    }

    /**
     * [set] B_SCREEN by DICT_ID, named 'BScreenList'.
     * @param bScreenList The entity list of referrer property 'BScreenList'. (NullAllowed)
     */
    public void setBScreenList(List<BScreen> bScreenList) {
        _bScreenList = bScreenList;
    }

    /** M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'. */
    protected List<MCenterClassDtl> _mCenterClassDtlList;

    /**
     * [get] M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'.
     * @return The entity list of referrer property 'MCenterClassDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterClassDtl> getMCenterClassDtlList() {
        if (_mCenterClassDtlList == null) { _mCenterClassDtlList = newReferrerList(); }
        return _mCenterClassDtlList;
    }

    /**
     * [set] M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'.
     * @param mCenterClassDtlList The entity list of referrer property 'MCenterClassDtlList'. (NullAllowed)
     */
    public void setMCenterClassDtlList(List<MCenterClassDtl> mCenterClassDtlList) {
        _mCenterClassDtlList = mCenterClassDtlList;
    }

    /** M_CENTER_COL by DICT_ID, named 'MCenterColList'. */
    protected List<MCenterCol> _mCenterColList;

    /**
     * [get] M_CENTER_COL by DICT_ID, named 'MCenterColList'.
     * @return The entity list of referrer property 'MCenterColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCol> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = newReferrerList(); }
        return _mCenterColList;
    }

    /**
     * [set] M_CENTER_COL by DICT_ID, named 'MCenterColList'.
     * @param mCenterColList The entity list of referrer property 'MCenterColList'. (NullAllowed)
     */
    public void setMCenterColList(List<MCenterCol> mCenterColList) {
        _mCenterColList = mCenterColList;
    }

    /** M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'. */
    protected List<MCenterItem> _mCenterItemList;

    /**
     * [get] M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'.
     * @return The entity list of referrer property 'MCenterItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterItem> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = newReferrerList(); }
        return _mCenterItemList;
    }

    /**
     * [set] M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'.
     * @param mCenterItemList The entity list of referrer property 'MCenterItemList'. (NullAllowed)
     */
    public void setMCenterItemList(List<MCenterItem> mCenterItemList) {
        _mCenterItemList = mCenterItemList;
    }

    /** M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'. */
    protected List<MCenterScreen> _mCenterScreenList;

    /**
     * [get] M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'.
     * @return The entity list of referrer property 'MCenterScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterScreen> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = newReferrerList(); }
        return _mCenterScreenList;
    }

    /**
     * [set] M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'.
     * @param mCenterScreenList The entity list of referrer property 'MCenterScreenList'. (NullAllowed)
     */
    public void setMCenterScreenList(List<MCenterScreen> mCenterScreenList) {
        _mCenterScreenList = mCenterScreenList;
    }

    /** M_CLIENT_COL by DICT_ID, named 'MClientColList'. */
    protected List<MClientCol> _mClientColList;

    /**
     * [get] M_CLIENT_COL by DICT_ID, named 'MClientColList'.
     * @return The entity list of referrer property 'MClientColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCol> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = newReferrerList(); }
        return _mClientColList;
    }

    /**
     * [set] M_CLIENT_COL by DICT_ID, named 'MClientColList'.
     * @param mClientColList The entity list of referrer property 'MClientColList'. (NullAllowed)
     */
    public void setMClientColList(List<MClientCol> mClientColList) {
        _mClientColList = mClientColList;
    }

    /** M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'. */
    protected List<MClientItem> _mClientItemList;

    /**
     * [get] M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'.
     * @return The entity list of referrer property 'MClientItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientItem> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = newReferrerList(); }
        return _mClientItemList;
    }

    /**
     * [set] M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'.
     * @param mClientItemList The entity list of referrer property 'MClientItemList'. (NullAllowed)
     */
    public void setMClientItemList(List<MClientItem> mClientItemList) {
        _mClientItemList = mClientItemList;
    }

    /** M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'. */
    protected List<MClientScreen> _mClientScreenList;

    /**
     * [get] M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'.
     * @return The entity list of referrer property 'MClientScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientScreen> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = newReferrerList(); }
        return _mClientScreenList;
    }

    /**
     * [set] M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'.
     * @param mClientScreenList The entity list of referrer property 'MClientScreenList'. (NullAllowed)
     */
    public void setMClientScreenList(List<MClientScreen> mClientScreenList) {
        _mClientScreenList = mClientScreenList;
    }

    /** M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'. */
    protected List<MProcessType> _mProcessTypeList;

    /**
     * [get] M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'.
     * @return The entity list of referrer property 'MProcessTypeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProcessType> getMProcessTypeList() {
        if (_mProcessTypeList == null) { _mProcessTypeList = newReferrerList(); }
        return _mProcessTypeList;
    }

    /**
     * [set] M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'.
     * @param mProcessTypeList The entity list of referrer property 'MProcessTypeList'. (NullAllowed)
     */
    public void setMProcessTypeList(List<MProcessType> mProcessTypeList) {
        _mProcessTypeList = mProcessTypeList;
    }

    /** M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'. */
    protected List<MShape> _mShapeByShapeDictIdList;

    /**
     * [get] M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'.
     * @return The entity list of referrer property 'MShapeByShapeDictIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShape> getMShapeByShapeDictIdList() {
        if (_mShapeByShapeDictIdList == null) { _mShapeByShapeDictIdList = newReferrerList(); }
        return _mShapeByShapeDictIdList;
    }

    /**
     * [set] M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'.
     * @param mShapeByShapeDictIdList The entity list of referrer property 'MShapeByShapeDictIdList'. (NullAllowed)
     */
    public void setMShapeByShapeDictIdList(List<MShape> mShapeByShapeDictIdList) {
        _mShapeByShapeDictIdList = mShapeByShapeDictIdList;
    }

    /** M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'. */
    protected List<MShape> _mShapeByShapeUnitDictIdList;

    /**
     * [get] M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'.
     * @return The entity list of referrer property 'MShapeByShapeUnitDictIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShape> getMShapeByShapeUnitDictIdList() {
        if (_mShapeByShapeUnitDictIdList == null) { _mShapeByShapeUnitDictIdList = newReferrerList(); }
        return _mShapeByShapeUnitDictIdList;
    }

    /**
     * [set] M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'.
     * @param mShapeByShapeUnitDictIdList The entity list of referrer property 'MShapeByShapeUnitDictIdList'. (NullAllowed)
     */
    public void setMShapeByShapeUnitDictIdList(List<MShape> mShapeByShapeUnitDictIdList) {
        _mShapeByShapeUnitDictIdList = mShapeByShapeUnitDictIdList;
    }

    /** M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'. */
    protected List<MStockType> _mStockTypeList;

    /**
     * [get] M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'.
     * @return The entity list of referrer property 'MStockTypeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MStockType> getMStockTypeList() {
        if (_mStockTypeList == null) { _mStockTypeList = newReferrerList(); }
        return _mStockTypeList;
    }

    /**
     * [set] M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'.
     * @param mStockTypeList The entity list of referrer property 'MStockTypeList'. (NullAllowed)
     */
    public void setMStockTypeList(List<MStockType> mStockTypeList) {
        _mStockTypeList = mStockTypeList;
    }

    /** P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'. */
    protected List<PReportLayoutItem> _pReportLayoutItemList;

    /**
     * [get] P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'.
     * @return The entity list of referrer property 'PReportLayoutItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PReportLayoutItem> getPReportLayoutItemList() {
        if (_pReportLayoutItemList == null) { _pReportLayoutItemList = newReferrerList(); }
        return _pReportLayoutItemList;
    }

    /**
     * [set] P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'.
     * @param pReportLayoutItemList The entity list of referrer property 'PReportLayoutItemList'. (NullAllowed)
     */
    public void setPReportLayoutItemList(List<PReportLayoutItem> pReportLayoutItemList) {
        _pReportLayoutItemList = pReportLayoutItemList;
    }

    /** P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'. */
    protected List<PSubrepLayoutItem> _pSubrepLayoutItemList;

    /**
     * [get] P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'.
     * @return The entity list of referrer property 'PSubrepLayoutItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PSubrepLayoutItem> getPSubrepLayoutItemList() {
        if (_pSubrepLayoutItemList == null) { _pSubrepLayoutItemList = newReferrerList(); }
        return _pSubrepLayoutItemList;
    }

    /**
     * [set] P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'.
     * @param pSubrepLayoutItemList The entity list of referrer property 'PSubrepLayoutItemList'. (NullAllowed)
     */
    public void setPSubrepLayoutItemList(List<PSubrepLayoutItem> pSubrepLayoutItemList) {
        _pSubrepLayoutItemList = pSubrepLayoutItemList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBDict) {
            BsBDict other = (BsBDict)obj;
            if (!xSV(_dictId, other._dictId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dictId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByDataType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDataType, "bClassDtlByDataType")); }
        if (_bDictValidAsOne != null)
        { sb.append(li).append(xbRDS(_bDictValidAsOne, "bDictValidAsOne")); }
        if (_mHtDictAsOne != null)
        { sb.append(li).append(xbRDS(_mHtDictAsOne, "mHtDictAsOne")); }
        if (_bArgList != null) { for (BArg et : _bArgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bArgList")); } } }
        if (_bClassDtlList != null) { for (BClassDtl et : _bClassDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bClassDtlList")); } } }
        if (_bColList != null) { for (BCol et : _bColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bColList")); } } }
        if (_bCultureList != null) { for (BCulture et : _bCultureList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bCultureList")); } } }
        if (_bDictCultureList != null) { for (BDictCulture et : _bDictCultureList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bDictCultureList")); } } }
        if (_bItemList != null) { for (BItem et : _bItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bItemList")); } } }
        if (_bMenuList != null) { for (BMenu et : _bMenuList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bMenuList")); } } }
        if (_bMenuGrpList != null) { for (BMenuGrp et : _bMenuGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bMenuGrpList")); } } }
        if (_bRoleList != null) { for (BRole et : _bRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bRoleList")); } } }
        if (_bRoleGrpList != null) { for (BRoleGrp et : _bRoleGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bRoleGrpList")); } } }
        if (_bScreenList != null) { for (BScreen et : _bScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bScreenList")); } } }
        if (_mCenterClassDtlList != null) { for (MCenterClassDtl et : _mCenterClassDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterClassDtlList")); } } }
        if (_mCenterColList != null) { for (MCenterCol et : _mCenterColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterColList")); } } }
        if (_mCenterItemList != null) { for (MCenterItem et : _mCenterItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterItemList")); } } }
        if (_mCenterScreenList != null) { for (MCenterScreen et : _mCenterScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterScreenList")); } } }
        if (_mClientColList != null) { for (MClientCol et : _mClientColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientColList")); } } }
        if (_mClientItemList != null) { for (MClientItem et : _mClientItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientItemList")); } } }
        if (_mClientScreenList != null) { for (MClientScreen et : _mClientScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientScreenList")); } } }
        if (_mProcessTypeList != null) { for (MProcessType et : _mProcessTypeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProcessTypeList")); } } }
        if (_mShapeByShapeDictIdList != null) { for (MShape et : _mShapeByShapeDictIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShapeByShapeDictIdList")); } } }
        if (_mShapeByShapeUnitDictIdList != null) { for (MShape et : _mShapeByShapeUnitDictIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShapeByShapeUnitDictIdList")); } } }
        if (_mStockTypeList != null) { for (MStockType et : _mStockTypeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mStockTypeList")); } } }
        if (_pReportLayoutItemList != null) { for (PReportLayoutItem et : _pReportLayoutItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pReportLayoutItemList")); } } }
        if (_pSubrepLayoutItemList != null) { for (PSubrepLayoutItem et : _pSubrepLayoutItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pSubrepLayoutItemList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_dictNm));
        sb.append(dm).append(xfND(_dataType));
        sb.append(dm).append(xfND(_systemType));
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
        if (_bClassDtlByDataType != null)
        { sb.append(dm).append("bClassDtlByDataType"); }
        if (_bDictValidAsOne != null)
        { sb.append(dm).append("bDictValidAsOne"); }
        if (_mHtDictAsOne != null)
        { sb.append(dm).append("mHtDictAsOne"); }
        if (_bArgList != null && !_bArgList.isEmpty())
        { sb.append(dm).append("bArgList"); }
        if (_bClassDtlList != null && !_bClassDtlList.isEmpty())
        { sb.append(dm).append("bClassDtlList"); }
        if (_bColList != null && !_bColList.isEmpty())
        { sb.append(dm).append("bColList"); }
        if (_bCultureList != null && !_bCultureList.isEmpty())
        { sb.append(dm).append("bCultureList"); }
        if (_bDictCultureList != null && !_bDictCultureList.isEmpty())
        { sb.append(dm).append("bDictCultureList"); }
        if (_bItemList != null && !_bItemList.isEmpty())
        { sb.append(dm).append("bItemList"); }
        if (_bMenuList != null && !_bMenuList.isEmpty())
        { sb.append(dm).append("bMenuList"); }
        if (_bMenuGrpList != null && !_bMenuGrpList.isEmpty())
        { sb.append(dm).append("bMenuGrpList"); }
        if (_bRoleList != null && !_bRoleList.isEmpty())
        { sb.append(dm).append("bRoleList"); }
        if (_bRoleGrpList != null && !_bRoleGrpList.isEmpty())
        { sb.append(dm).append("bRoleGrpList"); }
        if (_bScreenList != null && !_bScreenList.isEmpty())
        { sb.append(dm).append("bScreenList"); }
        if (_mCenterClassDtlList != null && !_mCenterClassDtlList.isEmpty())
        { sb.append(dm).append("mCenterClassDtlList"); }
        if (_mCenterColList != null && !_mCenterColList.isEmpty())
        { sb.append(dm).append("mCenterColList"); }
        if (_mCenterItemList != null && !_mCenterItemList.isEmpty())
        { sb.append(dm).append("mCenterItemList"); }
        if (_mCenterScreenList != null && !_mCenterScreenList.isEmpty())
        { sb.append(dm).append("mCenterScreenList"); }
        if (_mClientColList != null && !_mClientColList.isEmpty())
        { sb.append(dm).append("mClientColList"); }
        if (_mClientItemList != null && !_mClientItemList.isEmpty())
        { sb.append(dm).append("mClientItemList"); }
        if (_mClientScreenList != null && !_mClientScreenList.isEmpty())
        { sb.append(dm).append("mClientScreenList"); }
        if (_mProcessTypeList != null && !_mProcessTypeList.isEmpty())
        { sb.append(dm).append("mProcessTypeList"); }
        if (_mShapeByShapeDictIdList != null && !_mShapeByShapeDictIdList.isEmpty())
        { sb.append(dm).append("mShapeByShapeDictIdList"); }
        if (_mShapeByShapeUnitDictIdList != null && !_mShapeByShapeUnitDictIdList.isEmpty())
        { sb.append(dm).append("mShapeByShapeUnitDictIdList"); }
        if (_mStockTypeList != null && !_mStockTypeList.isEmpty())
        { sb.append(dm).append("mStockTypeList"); }
        if (_pReportLayoutItemList != null && !_pReportLayoutItemList.isEmpty())
        { sb.append(dm).append("pReportLayoutItemList"); }
        if (_pSubrepLayoutItemList != null && !_pSubrepLayoutItemList.isEmpty())
        { sb.append(dm).append("pSubrepLayoutItemList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BDict clone() {
        return (BDict)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DICT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] DICT_NM: {UQ, NotNull, varchar(100)} <br>
     * 辞書名
     * @return The value of the column 'DICT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getDictNm() {
        checkSpecifiedProperty("dictNm");
        return convertEmptyToNull(_dictNm);
    }

    /**
     * [set] DICT_NM: {UQ, NotNull, varchar(100)} <br>
     * 辞書名
     * @param dictNm The value of the column 'DICT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setDictNm(String dictNm) {
        registerModifiedProperty("dictNm");
        _dictNm = dictNm;
    }

    /**
     * [get] DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @return The value of the column 'DATA_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataType() {
        checkSpecifiedProperty("dataType");
        return convertEmptyToNull(_dataType);
    }

    /**
     * [set] DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param dataType The value of the column 'DATA_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataType(String dataType) {
        registerModifiedProperty("dataType");
        _dataType = dataType;
    }

    /**
     * [get] SYSTEM_TYPE: {varchar(30)} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSystemType() {
        checkSpecifiedProperty("systemType");
        return convertEmptyToNull(_systemType);
    }

    /**
     * [set] SYSTEM_TYPE: {varchar(30)} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSystemType(String systemType) {
        registerModifiedProperty("systemType");
        _systemType = systemType;
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
