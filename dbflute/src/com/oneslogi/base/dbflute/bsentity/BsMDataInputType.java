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
 * The entity of M_DATA_INPUT_TYPE as TABLE. <br>
 * 初期データ取込種別マスタ
 * <pre>
 * [primary-key]
 *     DATA_INPUT_TYPE_ID
 *
 * [column]
 *     DATA_INPUT_TYPE_ID, DATA_INPUT_TYPE_CD, DATA_INPUT_TYPE_NM, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DATA_INPUT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByDataInputTypeCd)
 *
 * [referrer table]
 *     M_DATA_INPUT_TYPE_B
 *
 * [foreign property]
 *     bClassDtlByDataInputTypeCd
 *
 * [referrer property]
 *     mDataInputTypeBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long dataInputTypeId = entity.getDataInputTypeId();
 * String dataInputTypeCd = entity.getDataInputTypeCd();
 * String dataInputTypeNm = entity.getDataInputTypeNm();
 * String characterCd = entity.getCharacterCd();
 * String lineFeedCd = entity.getLineFeedCd();
 * String delimiter = entity.getDelimiter();
 * Long skippingRows = entity.getSkippingRows();
 * String uploadTableNm = entity.getUploadTableNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setDataInputTypeId(dataInputTypeId);
 * entity.setDataInputTypeCd(dataInputTypeCd);
 * entity.setDataInputTypeNm(dataInputTypeNm);
 * entity.setCharacterCd(characterCd);
 * entity.setLineFeedCd(lineFeedCd);
 * entity.setDelimiter(delimiter);
 * entity.setSkippingRows(skippingRows);
 * entity.setUploadTableNm(uploadTableNm);
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
public abstract class BsMDataInputType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _dataInputTypeId;

    /** DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} */
    protected String _dataInputTypeCd;

    /** DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} */
    protected String _dataInputTypeNm;

    /** CHARACTER_CD: {varchar(30)} */
    protected String _characterCd;

    /** LINE_FEED_CD: {varchar(30)} */
    protected String _lineFeedCd;

    /** DELIMITER: {varchar(30)} */
    protected String _delimiter;

    /** SKIPPING_ROWS: {bigint(19)} */
    protected Long _skippingRows;

    /** UPLOAD_TABLE_NM: {NotNull, varchar(100)} */
    protected String _uploadTableNm;

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
        return "M_DATA_INPUT_TYPE";
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
        if (_dataInputTypeId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of dataInputTypeCd as the classification of DataInputType. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 取込種類
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DataInputType getDataInputTypeCdAsDataInputType() {
        return CDef.DataInputType.codeOf(getDataInputTypeCd());
    }

    /**
     * Set the value of dataInputTypeCd as the classification of DataInputType. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 取込種類
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDataInputTypeCdAsDataInputType(CDef.DataInputType cdef) {
        setDataInputTypeCd(cdef != null ? cdef.code() : null);
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
     * Set the value of dataInputTypeCd as $01 (01). <br>
     * $01: 商品マスタ取込
     */
    public void setDataInputTypeCd_$01() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$01);
    }

    /**
     * Set the value of dataInputTypeCd as $02 (02). <br>
     * $02: 商品荷姿マスタ取込
     */
    public void setDataInputTypeCd_$02() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$02);
    }

    /**
     * Set the value of dataInputTypeCd as $03 (03). <br>
     * $03: 取引先マスタ取込
     */
    public void setDataInputTypeCd_$03() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$03);
    }

    /**
     * Set the value of dataInputTypeCd as $04 (04). <br>
     * $04: ロケーションマスタ取込
     */
    public void setDataInputTypeCd_$04() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$04);
    }

    /**
     * Set the value of dataInputTypeCd as $05 (05). <br>
     * $05: 在庫データ取込
     */
    public void setDataInputTypeCd_$05() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$05);
    }

    /**
     * Set the value of dataInputTypeCd as $06 (06). <br>
     * $06: 着店マスタ取込(ヤマト運輸)
     */
    public void setDataInputTypeCd_$06() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$06);
    }

    /**
     * Set the value of dataInputTypeCd as $07 (07). <br>
     * $07: 着店マスタ取込(日本郵政)
     */
    public void setDataInputTypeCd_$07() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$07);
    }

    /**
     * Set the value of dataInputTypeCd as $08 (08). <br>
     * $08: 郵便番号マスタ取込
     */
    public void setDataInputTypeCd_$08() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$08);
    }

    /**
     * Set the value of dataInputTypeCd as $09 (09). <br>
     * $09: 郵便番号マスタ(大口事業所)取込
     */
    public void setDataInputTypeCd_$09() {
        setDataInputTypeCdAsDataInputType(CDef.DataInputType.$09);
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
     * Is the value of dataInputTypeCd $01? <br>
     * $01: 商品マスタ取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$01() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$01) : false;
    }

    /**
     * Is the value of dataInputTypeCd $02? <br>
     * $02: 商品荷姿マスタ取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$02() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$02) : false;
    }

    /**
     * Is the value of dataInputTypeCd $03? <br>
     * $03: 取引先マスタ取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$03() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$03) : false;
    }

    /**
     * Is the value of dataInputTypeCd $04? <br>
     * $04: ロケーションマスタ取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$04() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$04) : false;
    }

    /**
     * Is the value of dataInputTypeCd $05? <br>
     * $05: 在庫データ取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$05() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$05) : false;
    }

    /**
     * Is the value of dataInputTypeCd $06? <br>
     * $06: 着店マスタ取込(ヤマト運輸)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$06() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$06) : false;
    }

    /**
     * Is the value of dataInputTypeCd $07? <br>
     * $07: 着店マスタ取込(日本郵政)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$07() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$07) : false;
    }

    /**
     * Is the value of dataInputTypeCd $08? <br>
     * $08: 郵便番号マスタ取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$08() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$08) : false;
    }

    /**
     * Is the value of dataInputTypeCd $09? <br>
     * $09: 郵便番号マスタ(大口事業所)取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDataInputTypeCd$09() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
        return cdef != null ? cdef.equals(CDef.DataInputType.$09) : false;
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
     * Get the value of the column 'dataInputTypeCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDataInputTypeCdName() {
        CDef.DataInputType cdef = getDataInputTypeCdAsDataInputType();
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
    /** B_CLASS_DTL by my DATA_INPUT_TYPE_CD, named 'BClassDtlByDataInputTypeCd'. */
    protected BClassDtl _bClassDtlByDataInputTypeCd;

    /**
     * [get] B_CLASS_DTL by my DATA_INPUT_TYPE_CD, named 'BClassDtlByDataInputTypeCd'. <br>
     * @return The entity of foreign property 'BClassDtlByDataInputTypeCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDataInputTypeCd() {
        return _bClassDtlByDataInputTypeCd;
    }

    /**
     * [set] B_CLASS_DTL by my DATA_INPUT_TYPE_CD, named 'BClassDtlByDataInputTypeCd'.
     * @param bClassDtlByDataInputTypeCd The entity of foreign property 'BClassDtlByDataInputTypeCd'. (NullAllowed)
     */
    public void setBClassDtlByDataInputTypeCd(BClassDtl bClassDtlByDataInputTypeCd) {
        _bClassDtlByDataInputTypeCd = bClassDtlByDataInputTypeCd;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'. */
    protected List<MDataInputTypeB> _mDataInputTypeBList;

    /**
     * [get] M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'.
     * @return The entity list of referrer property 'MDataInputTypeBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDataInputTypeB> getMDataInputTypeBList() {
        if (_mDataInputTypeBList == null) { _mDataInputTypeBList = newReferrerList(); }
        return _mDataInputTypeBList;
    }

    /**
     * [set] M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'.
     * @param mDataInputTypeBList The entity list of referrer property 'MDataInputTypeBList'. (NullAllowed)
     */
    public void setMDataInputTypeBList(List<MDataInputTypeB> mDataInputTypeBList) {
        _mDataInputTypeBList = mDataInputTypeBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMDataInputType) {
            BsMDataInputType other = (BsMDataInputType)obj;
            if (!xSV(_dataInputTypeId, other._dataInputTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dataInputTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByDataInputTypeCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDataInputTypeCd, "bClassDtlByDataInputTypeCd")); }
        if (_mDataInputTypeBList != null) { for (MDataInputTypeB et : _mDataInputTypeBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDataInputTypeBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dataInputTypeId));
        sb.append(dm).append(xfND(_dataInputTypeCd));
        sb.append(dm).append(xfND(_dataInputTypeNm));
        sb.append(dm).append(xfND(_characterCd));
        sb.append(dm).append(xfND(_lineFeedCd));
        sb.append(dm).append(xfND(_delimiter));
        sb.append(dm).append(xfND(_skippingRows));
        sb.append(dm).append(xfND(_uploadTableNm));
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
        if (_bClassDtlByDataInputTypeCd != null)
        { sb.append(dm).append("bClassDtlByDataInputTypeCd"); }
        if (_mDataInputTypeBList != null && !_mDataInputTypeBList.isEmpty())
        { sb.append(dm).append("mDataInputTypeBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MDataInputType clone() {
        return (MDataInputType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 初期データ取込種別ID
     * @return The value of the column 'DATA_INPUT_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDataInputTypeId() {
        checkSpecifiedProperty("dataInputTypeId");
        return _dataInputTypeId;
    }

    /**
     * [set] DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 初期データ取込種別ID
     * @param dataInputTypeId The value of the column 'DATA_INPUT_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDataInputTypeId(Long dataInputTypeId) {
        registerModifiedProperty("dataInputTypeId");
        _dataInputTypeId = dataInputTypeId;
    }

    /**
     * [get] DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 初期データ取込種別CD
     * @return The value of the column 'DATA_INPUT_TYPE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getDataInputTypeCd() {
        checkSpecifiedProperty("dataInputTypeCd");
        return convertEmptyToNull(_dataInputTypeCd);
    }

    /**
     * [set] DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 初期データ取込種別CD
     * @param dataInputTypeCd The value of the column 'DATA_INPUT_TYPE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setDataInputTypeCd(String dataInputTypeCd) {
        registerModifiedProperty("dataInputTypeCd");
        _dataInputTypeCd = dataInputTypeCd;
    }

    /**
     * [get] DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 初期データ取込種別名称
     * @return The value of the column 'DATA_INPUT_TYPE_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getDataInputTypeNm() {
        checkSpecifiedProperty("dataInputTypeNm");
        return convertEmptyToNull(_dataInputTypeNm);
    }

    /**
     * [set] DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 初期データ取込種別名称
     * @param dataInputTypeNm The value of the column 'DATA_INPUT_TYPE_NM'. (basically NotNull if update: for the constraint)
     */
    public void setDataInputTypeNm(String dataInputTypeNm) {
        registerModifiedProperty("dataInputTypeNm");
        _dataInputTypeNm = dataInputTypeNm;
    }

    /**
     * [get] CHARACTER_CD: {varchar(30)} <br>
     * 文字CD
     * @return The value of the column 'CHARACTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacterCd() {
        checkSpecifiedProperty("characterCd");
        return convertEmptyToNull(_characterCd);
    }

    /**
     * [set] CHARACTER_CD: {varchar(30)} <br>
     * 文字CD
     * @param characterCd The value of the column 'CHARACTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacterCd(String characterCd) {
        registerModifiedProperty("characterCd");
        _characterCd = characterCd;
    }

    /**
     * [get] LINE_FEED_CD: {varchar(30)} <br>
     * 改行CD
     * @return The value of the column 'LINE_FEED_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineFeedCd() {
        checkSpecifiedProperty("lineFeedCd");
        return convertEmptyToNull(_lineFeedCd);
    }

    /**
     * [set] LINE_FEED_CD: {varchar(30)} <br>
     * 改行CD
     * @param lineFeedCd The value of the column 'LINE_FEED_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineFeedCd(String lineFeedCd) {
        registerModifiedProperty("lineFeedCd");
        _lineFeedCd = lineFeedCd;
    }

    /**
     * [get] DELIMITER: {varchar(30)} <br>
     * 区切り文字
     * @return The value of the column 'DELIMITER'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelimiter() {
        checkSpecifiedProperty("delimiter");
        return convertEmptyToNull(_delimiter);
    }

    /**
     * [set] DELIMITER: {varchar(30)} <br>
     * 区切り文字
     * @param delimiter The value of the column 'DELIMITER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelimiter(String delimiter) {
        registerModifiedProperty("delimiter");
        _delimiter = delimiter;
    }

    /**
     * [get] SKIPPING_ROWS: {bigint(19)} <br>
     * 読み飛ばし行数
     * @return The value of the column 'SKIPPING_ROWS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSkippingRows() {
        checkSpecifiedProperty("skippingRows");
        return _skippingRows;
    }

    /**
     * [set] SKIPPING_ROWS: {bigint(19)} <br>
     * 読み飛ばし行数
     * @param skippingRows The value of the column 'SKIPPING_ROWS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkippingRows(Long skippingRows) {
        registerModifiedProperty("skippingRows");
        _skippingRows = skippingRows;
    }

    /**
     * [get] UPLOAD_TABLE_NM: {NotNull, varchar(100)} <br>
     * アップロードテーブル名
     * @return The value of the column 'UPLOAD_TABLE_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getUploadTableNm() {
        checkSpecifiedProperty("uploadTableNm");
        return convertEmptyToNull(_uploadTableNm);
    }

    /**
     * [set] UPLOAD_TABLE_NM: {NotNull, varchar(100)} <br>
     * アップロードテーブル名
     * @param uploadTableNm The value of the column 'UPLOAD_TABLE_NM'. (basically NotNull if update: for the constraint)
     */
    public void setUploadTableNm(String uploadTableNm) {
        registerModifiedProperty("uploadTableNm");
        _uploadTableNm = uploadTableNm;
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
