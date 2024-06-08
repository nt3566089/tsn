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
 * The entity of B_COL as TABLE. <br>
 * 列マスタ
 * <pre>
 * [primary-key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, ITEM_ID, COL_CD, DICT_ID, COL_ORDER, COL_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, COL_WIDTH, IN_COL_INDEX, IN_COL_DEFAULT_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_ITEM, V_DICT, V_HT_DICT, B_CLASS_DTL(ByColType), B_COL_VALID(AsOne)
 *
 * [referrer table]
 *     B_COL_ROLE, M_CENTER_COL, M_CLIENT_COL, B_COL_VALID
 *
 * [foreign property]
 *     bDict, bItem, vDict, vHtDict, bClassDtlByColType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bColValidAsOne
 *
 * [referrer property]
 *     bColRoleList, mCenterColList, mClientColList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long colId = entity.getColId();
 * Long itemId = entity.getItemId();
 * String colCd = entity.getColCd();
 * Long dictId = entity.getDictId();
 * Long colOrder = entity.getColOrder();
 * String colType = entity.getColType();
 * String visible = entity.getVisible();
 * String editable = entity.getEditable();
 * String textAlign = entity.getTextAlign();
 * String necessary = entity.getNecessary();
 * Long colWidth = entity.getColWidth();
 * Long inColIndex = entity.getInColIndex();
 * String inColDefaultValue = entity.getInColDefaultValue();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setColId(colId);
 * entity.setItemId(itemId);
 * entity.setColCd(colCd);
 * entity.setDictId(dictId);
 * entity.setColOrder(colOrder);
 * entity.setColType(colType);
 * entity.setVisible(visible);
 * entity.setEditable(editable);
 * entity.setTextAlign(textAlign);
 * entity.setNecessary(necessary);
 * entity.setColWidth(colWidth);
 * entity.setInColIndex(inColIndex);
 * entity.setInColDefaultValue(inColDefaultValue);
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
public abstract class BsBCol extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _colId;

    /** ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM} */
    protected Long _itemId;

    /** COL_CD: {+UQ, varchar(100)} */
    protected String _colCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** COL_ORDER: {bigint(19)} */
    protected Long _colOrder;

    /** COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} */
    protected String _colType;

    /** VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} */
    protected String _visible;

    /** EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} */
    protected String _editable;

    /** TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} */
    protected String _textAlign;

    /** NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} */
    protected String _necessary;

    /** COL_WIDTH: {bigint(19)} */
    protected Long _colWidth;

    /** IN_COL_INDEX: {bigint(19)} */
    protected Long _inColIndex;

    /** IN_COL_DEFAULT_VALUE: {varchar(255)} */
    protected String _inColDefaultValue;

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
        return "B_COL";
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
        if (_colId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param itemId : UQ+, IX, NotNull, bigint(19), FK to B_ITEM. (NotNull)
     * @param colCd : +UQ, varchar(100). (NotNull)
     */
    public void uniqueBy(Long itemId, String colCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("itemId");
        __uniqueDrivenProperties.addPropertyName("colCd");
        setItemId(itemId);setColCd(colCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of colType as the classification of ColType. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ColType getColTypeAsColType() {
        return CDef.ColType.codeOf(getColType());
    }

    /**
     * Set the value of colType as the classification of ColType. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setColTypeAsColType(CDef.ColType cdef) {
        setColType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of visible as the classification of Visible. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Visible getVisibleAsVisible() {
        return CDef.Visible.codeOf(getVisible());
    }

    /**
     * Set the value of visible as the classification of Visible. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setVisibleAsVisible(CDef.Visible cdef) {
        setVisible(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of editable as the classification of Editable. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Editable getEditableAsEditable() {
        return CDef.Editable.codeOf(getEditable());
    }

    /**
     * Set the value of editable as the classification of Editable. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEditableAsEditable(CDef.Editable cdef) {
        setEditable(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of textAlign as the classification of TextAlign. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TextAlign getTextAlignAsTextAlign() {
        return CDef.TextAlign.codeOf(getTextAlign());
    }

    /**
     * Set the value of textAlign as the classification of TextAlign. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTextAlignAsTextAlign(CDef.TextAlign cdef) {
        setTextAlign(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of necessary as the classification of Necessary. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Necessary getNecessaryAsNecessary() {
        return CDef.Necessary.codeOf(getNecessary());
    }

    /**
     * Set the value of necessary as the classification of Necessary. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNecessaryAsNecessary(CDef.Necessary cdef) {
        setNecessary(cdef != null ? cdef.code() : null);
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
     * Set the value of colType as $calcnumber (calcnumber). <br>
     * $calcnumber: 計算数値
     */
    public void setColType_$calcnumber() {
        setColTypeAsColType(CDef.ColType.$calcnumber);
    }

    /**
     * Set the value of colType as $checkbox (checkbox). <br>
     * $checkbox: チェックボックス
     */
    public void setColType_$checkbox() {
        setColTypeAsColType(CDef.ColType.$checkbox);
    }

    /**
     * Set the value of colType as $date (date). <br>
     * $date: 日付
     */
    public void setColType_$date() {
        setColTypeAsColType(CDef.ColType.$date);
    }

    /**
     * Set the value of colType as $datetime (datetime). <br>
     * $datetime: 日時
     */
    public void setColType_$datetime() {
        setColTypeAsColType(CDef.ColType.$datetime);
    }

    /**
     * Set the value of colType as $dropdown (dropdown). <br>
     * $dropdown: コンボボックス
     */
    public void setColType_$dropdown() {
        setColTypeAsColType(CDef.ColType.$dropdown);
    }

    /**
     * Set the value of colType as $number (number). <br>
     * $number: 数値
     */
    public void setColType_$number() {
        setColTypeAsColType(CDef.ColType.$number);
    }

    /**
     * Set the value of colType as $text (text). <br>
     * $text: テキスト
     */
    public void setColType_$text() {
        setColTypeAsColType(CDef.ColType.$text);
    }

    /**
     * Set the value of visible as $0 (0). <br>
     * $0: 非表示
     */
    public void setVisible_$0() {
        setVisibleAsVisible(CDef.Visible.$0);
    }

    /**
     * Set the value of visible as $1 (1). <br>
     * $1: 表示
     */
    public void setVisible_$1() {
        setVisibleAsVisible(CDef.Visible.$1);
    }

    /**
     * Set the value of editable as $0 (0). <br>
     * $0: 編集不可
     */
    public void setEditable_$0() {
        setEditableAsEditable(CDef.Editable.$0);
    }

    /**
     * Set the value of editable as $1 (1). <br>
     * $1: 編集可
     */
    public void setEditable_$1() {
        setEditableAsEditable(CDef.Editable.$1);
    }

    /**
     * Set the value of textAlign as $center (center). <br>
     * $center: 中央揃え
     */
    public void setTextAlign_$center() {
        setTextAlignAsTextAlign(CDef.TextAlign.$center);
    }

    /**
     * Set the value of textAlign as $left (left). <br>
     * $left: 左寄せ
     */
    public void setTextAlign_$left() {
        setTextAlignAsTextAlign(CDef.TextAlign.$left);
    }

    /**
     * Set the value of textAlign as $right (right). <br>
     * $right: 右寄せ
     */
    public void setTextAlign_$right() {
        setTextAlignAsTextAlign(CDef.TextAlign.$right);
    }

    /**
     * Set the value of necessary as $0 (0). <br>
     * $0: 任意
     */
    public void setNecessary_$0() {
        setNecessaryAsNecessary(CDef.Necessary.$0);
    }

    /**
     * Set the value of necessary as $1 (1). <br>
     * $1: 必須
     */
    public void setNecessary_$1() {
        setNecessaryAsNecessary(CDef.Necessary.$1);
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
     * Is the value of colType $calcnumber? <br>
     * $calcnumber: 計算数値
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$calcnumber() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$calcnumber) : false;
    }

    /**
     * Is the value of colType $checkbox? <br>
     * $checkbox: チェックボックス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$checkbox() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$checkbox) : false;
    }

    /**
     * Is the value of colType $date? <br>
     * $date: 日付
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$date() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$date) : false;
    }

    /**
     * Is the value of colType $datetime? <br>
     * $datetime: 日時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$datetime() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$datetime) : false;
    }

    /**
     * Is the value of colType $dropdown? <br>
     * $dropdown: コンボボックス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$dropdown() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$dropdown) : false;
    }

    /**
     * Is the value of colType $number? <br>
     * $number: 数値
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$number() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$number) : false;
    }

    /**
     * Is the value of colType $text? <br>
     * $text: テキスト
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isColType$text() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.equals(CDef.ColType.$text) : false;
    }

    /**
     * Is the value of visible $0? <br>
     * $0: 非表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVisible$0() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.equals(CDef.Visible.$0) : false;
    }

    /**
     * Is the value of visible $1? <br>
     * $1: 表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVisible$1() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.equals(CDef.Visible.$1) : false;
    }

    /**
     * Is the value of editable $0? <br>
     * $0: 編集不可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEditable$0() {
        CDef.Editable cdef = getEditableAsEditable();
        return cdef != null ? cdef.equals(CDef.Editable.$0) : false;
    }

    /**
     * Is the value of editable $1? <br>
     * $1: 編集可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEditable$1() {
        CDef.Editable cdef = getEditableAsEditable();
        return cdef != null ? cdef.equals(CDef.Editable.$1) : false;
    }

    /**
     * Is the value of textAlign $center? <br>
     * $center: 中央揃え
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTextAlign$center() {
        CDef.TextAlign cdef = getTextAlignAsTextAlign();
        return cdef != null ? cdef.equals(CDef.TextAlign.$center) : false;
    }

    /**
     * Is the value of textAlign $left? <br>
     * $left: 左寄せ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTextAlign$left() {
        CDef.TextAlign cdef = getTextAlignAsTextAlign();
        return cdef != null ? cdef.equals(CDef.TextAlign.$left) : false;
    }

    /**
     * Is the value of textAlign $right? <br>
     * $right: 右寄せ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTextAlign$right() {
        CDef.TextAlign cdef = getTextAlignAsTextAlign();
        return cdef != null ? cdef.equals(CDef.TextAlign.$right) : false;
    }

    /**
     * Is the value of necessary $0? <br>
     * $0: 任意
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNecessary$0() {
        CDef.Necessary cdef = getNecessaryAsNecessary();
        return cdef != null ? cdef.equals(CDef.Necessary.$0) : false;
    }

    /**
     * Is the value of necessary $1? <br>
     * $1: 必須
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNecessary$1() {
        CDef.Necessary cdef = getNecessaryAsNecessary();
        return cdef != null ? cdef.equals(CDef.Necessary.$1) : false;
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
     * Get the value of the column 'colType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getColTypeName() {
        CDef.ColType cdef = getColTypeAsColType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'visible' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getVisibleName() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'editable' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEditableName() {
        CDef.Editable cdef = getEditableAsEditable();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'textAlign' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTextAlignName() {
        CDef.TextAlign cdef = getTextAlignAsTextAlign();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'necessary' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getNecessaryName() {
        CDef.Necessary cdef = getNecessaryAsNecessary();
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
    /** B_DICT by my DICT_ID, named 'BDict'. */
    protected BDict _bDict;

    /**
     * [get] B_DICT by my DICT_ID, named 'BDict'. <br>
     * @return The entity of foreign property 'BDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BDict getBDict() {
        return _bDict;
    }

    /**
     * [set] B_DICT by my DICT_ID, named 'BDict'.
     * @param bDict The entity of foreign property 'BDict'. (NullAllowed)
     */
    public void setBDict(BDict bDict) {
        _bDict = bDict;
    }

    /** B_ITEM by my ITEM_ID, named 'BItem'. */
    protected BItem _bItem;

    /**
     * [get] B_ITEM by my ITEM_ID, named 'BItem'. <br>
     * @return The entity of foreign property 'BItem'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BItem getBItem() {
        return _bItem;
    }

    /**
     * [set] B_ITEM by my ITEM_ID, named 'BItem'.
     * @param bItem The entity of foreign property 'BItem'. (NullAllowed)
     */
    public void setBItem(BItem bItem) {
        _bItem = bItem;
    }

    /** V_DICT by my DICT_ID, named 'VDict'. */
    protected VDict _vDict;

    /**
     * [get] V_DICT by my DICT_ID, named 'VDict'. <br>
     * @return The entity of foreign property 'VDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VDict getVDict() {
        return _vDict;
    }

    /**
     * [set] V_DICT by my DICT_ID, named 'VDict'.
     * @param vDict The entity of foreign property 'VDict'. (NullAllowed)
     */
    public void setVDict(VDict vDict) {
        _vDict = vDict;
    }

    /** V_HT_DICT by my DICT_ID, named 'VHtDict'. */
    protected VHtDict _vHtDict;

    /**
     * [get] V_HT_DICT by my DICT_ID, named 'VHtDict'. <br>
     * @return The entity of foreign property 'VHtDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VHtDict getVHtDict() {
        return _vHtDict;
    }

    /**
     * [set] V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @param vHtDict The entity of foreign property 'VHtDict'. (NullAllowed)
     */
    public void setVHtDict(VHtDict vHtDict) {
        _vHtDict = vHtDict;
    }

    /** B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'. */
    protected BClassDtl _bClassDtlByColType;

    /**
     * [get] B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'. <br>
     * @return The entity of foreign property 'BClassDtlByColType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByColType() {
        return _bClassDtlByColType;
    }

    /**
     * [set] B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'.
     * @param bClassDtlByColType The entity of foreign property 'BClassDtlByColType'. (NullAllowed)
     */
    public void setBClassDtlByColType(BClassDtl bClassDtlByColType) {
        _bClassDtlByColType = bClassDtlByColType;
    }

    /** B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'. */
    protected BClassDtl _bClassDtlByVisible;

    /**
     * [get] B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'. <br>
     * @return The entity of foreign property 'BClassDtlByVisible'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByVisible() {
        return _bClassDtlByVisible;
    }

    /**
     * [set] B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @param bClassDtlByVisible The entity of foreign property 'BClassDtlByVisible'. (NullAllowed)
     */
    public void setBClassDtlByVisible(BClassDtl bClassDtlByVisible) {
        _bClassDtlByVisible = bClassDtlByVisible;
    }

    /** B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'. */
    protected BClassDtl _bClassDtlByEditable;

    /**
     * [get] B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'. <br>
     * @return The entity of foreign property 'BClassDtlByEditable'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEditable() {
        return _bClassDtlByEditable;
    }

    /**
     * [set] B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @param bClassDtlByEditable The entity of foreign property 'BClassDtlByEditable'. (NullAllowed)
     */
    public void setBClassDtlByEditable(BClassDtl bClassDtlByEditable) {
        _bClassDtlByEditable = bClassDtlByEditable;
    }

    /** B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'. */
    protected BClassDtl _bClassDtlByTextAlign;

    /**
     * [get] B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'. <br>
     * @return The entity of foreign property 'BClassDtlByTextAlign'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTextAlign() {
        return _bClassDtlByTextAlign;
    }

    /**
     * [set] B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * @param bClassDtlByTextAlign The entity of foreign property 'BClassDtlByTextAlign'. (NullAllowed)
     */
    public void setBClassDtlByTextAlign(BClassDtl bClassDtlByTextAlign) {
        _bClassDtlByTextAlign = bClassDtlByTextAlign;
    }

    /** B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'. */
    protected BClassDtl _bClassDtlByNecessary;

    /**
     * [get] B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'. <br>
     * @return The entity of foreign property 'BClassDtlByNecessary'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByNecessary() {
        return _bClassDtlByNecessary;
    }

    /**
     * [set] B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
     * @param bClassDtlByNecessary The entity of foreign property 'BClassDtlByNecessary'. (NullAllowed)
     */
    public void setBClassDtlByNecessary(BClassDtl bClassDtlByNecessary) {
        _bClassDtlByNecessary = bClassDtlByNecessary;
    }

    /** B_COL_VALID by COL_ID, named 'BColValidAsOne'. */
    protected BColValid _bColValidAsOne;

    /**
     * [get] B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'BColValidAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public BColValid getBColValidAsOne() {
        return _bColValidAsOne;
    }

    /**
     * [set] B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * @param BColValidAsOne The entity of foreign property(referrer-as-one) 'BColValidAsOne'. (NullAllowed)
     */
    public void setBColValidAsOne(BColValid BColValidAsOne) {
        _bColValidAsOne = BColValidAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_COL_ROLE by COL_ID, named 'BColRoleList'. */
    protected List<BColRole> _bColRoleList;

    /**
     * [get] B_COL_ROLE by COL_ID, named 'BColRoleList'.
     * @return The entity list of referrer property 'BColRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BColRole> getBColRoleList() {
        if (_bColRoleList == null) { _bColRoleList = newReferrerList(); }
        return _bColRoleList;
    }

    /**
     * [set] B_COL_ROLE by COL_ID, named 'BColRoleList'.
     * @param bColRoleList The entity list of referrer property 'BColRoleList'. (NullAllowed)
     */
    public void setBColRoleList(List<BColRole> bColRoleList) {
        _bColRoleList = bColRoleList;
    }

    /** M_CENTER_COL by COL_ID, named 'MCenterColList'. */
    protected List<MCenterCol> _mCenterColList;

    /**
     * [get] M_CENTER_COL by COL_ID, named 'MCenterColList'.
     * @return The entity list of referrer property 'MCenterColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCol> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = newReferrerList(); }
        return _mCenterColList;
    }

    /**
     * [set] M_CENTER_COL by COL_ID, named 'MCenterColList'.
     * @param mCenterColList The entity list of referrer property 'MCenterColList'. (NullAllowed)
     */
    public void setMCenterColList(List<MCenterCol> mCenterColList) {
        _mCenterColList = mCenterColList;
    }

    /** M_CLIENT_COL by COL_ID, named 'MClientColList'. */
    protected List<MClientCol> _mClientColList;

    /**
     * [get] M_CLIENT_COL by COL_ID, named 'MClientColList'.
     * @return The entity list of referrer property 'MClientColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCol> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = newReferrerList(); }
        return _mClientColList;
    }

    /**
     * [set] M_CLIENT_COL by COL_ID, named 'MClientColList'.
     * @param mClientColList The entity list of referrer property 'MClientColList'. (NullAllowed)
     */
    public void setMClientColList(List<MClientCol> mClientColList) {
        _mClientColList = mClientColList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBCol) {
            BsBCol other = (BsBCol)obj;
            if (!xSV(_colId, other._colId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _colId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_bItem != null)
        { sb.append(li).append(xbRDS(_bItem, "bItem")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_vHtDict != null)
        { sb.append(li).append(xbRDS(_vHtDict, "vHtDict")); }
        if (_bClassDtlByColType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByColType, "bClassDtlByColType")); }
        if (_bClassDtlByVisible != null)
        { sb.append(li).append(xbRDS(_bClassDtlByVisible, "bClassDtlByVisible")); }
        if (_bClassDtlByEditable != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEditable, "bClassDtlByEditable")); }
        if (_bClassDtlByTextAlign != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTextAlign, "bClassDtlByTextAlign")); }
        if (_bClassDtlByNecessary != null)
        { sb.append(li).append(xbRDS(_bClassDtlByNecessary, "bClassDtlByNecessary")); }
        if (_bColValidAsOne != null)
        { sb.append(li).append(xbRDS(_bColValidAsOne, "bColValidAsOne")); }
        if (_bColRoleList != null) { for (BColRole et : _bColRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bColRoleList")); } } }
        if (_mCenterColList != null) { for (MCenterCol et : _mCenterColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterColList")); } } }
        if (_mClientColList != null) { for (MClientCol et : _mClientColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientColList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_colId));
        sb.append(dm).append(xfND(_itemId));
        sb.append(dm).append(xfND(_colCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_colOrder));
        sb.append(dm).append(xfND(_colType));
        sb.append(dm).append(xfND(_visible));
        sb.append(dm).append(xfND(_editable));
        sb.append(dm).append(xfND(_textAlign));
        sb.append(dm).append(xfND(_necessary));
        sb.append(dm).append(xfND(_colWidth));
        sb.append(dm).append(xfND(_inColIndex));
        sb.append(dm).append(xfND(_inColDefaultValue));
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
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_bItem != null)
        { sb.append(dm).append("bItem"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_vHtDict != null)
        { sb.append(dm).append("vHtDict"); }
        if (_bClassDtlByColType != null)
        { sb.append(dm).append("bClassDtlByColType"); }
        if (_bClassDtlByVisible != null)
        { sb.append(dm).append("bClassDtlByVisible"); }
        if (_bClassDtlByEditable != null)
        { sb.append(dm).append("bClassDtlByEditable"); }
        if (_bClassDtlByTextAlign != null)
        { sb.append(dm).append("bClassDtlByTextAlign"); }
        if (_bClassDtlByNecessary != null)
        { sb.append(dm).append("bClassDtlByNecessary"); }
        if (_bColValidAsOne != null)
        { sb.append(dm).append("bColValidAsOne"); }
        if (_bColRoleList != null && !_bColRoleList.isEmpty())
        { sb.append(dm).append("bColRoleList"); }
        if (_mCenterColList != null && !_mCenterColList.isEmpty())
        { sb.append(dm).append("mCenterColList"); }
        if (_mClientColList != null && !_mClientColList.isEmpty())
        { sb.append(dm).append("mClientColList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BCol clone() {
        return (BCol)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 列ID
     * @return The value of the column 'COL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getColId() {
        checkSpecifiedProperty("colId");
        return _colId;
    }

    /**
     * [set] COL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 列ID
     * @param colId The value of the column 'COL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setColId(Long colId) {
        registerModifiedProperty("colId");
        _colId = colId;
    }

    /**
     * [get] ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getItemId() {
        checkSpecifiedProperty("itemId");
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setItemId(Long itemId) {
        registerModifiedProperty("itemId");
        _itemId = itemId;
    }

    /**
     * [get] COL_CD: {+UQ, varchar(100)} <br>
     * 列CD
     * @return The value of the column 'COL_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getColCd() {
        checkSpecifiedProperty("colCd");
        return convertEmptyToNull(_colCd);
    }

    /**
     * [set] COL_CD: {+UQ, varchar(100)} <br>
     * 列CD
     * @param colCd The value of the column 'COL_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColCd(String colCd) {
        registerModifiedProperty("colCd");
        _colCd = colCd;
    }

    /**
     * [get] DICT_ID: {IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] COL_ORDER: {bigint(19)} <br>
     * 列順序
     * @return The value of the column 'COL_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getColOrder() {
        checkSpecifiedProperty("colOrder");
        return _colOrder;
    }

    /**
     * [set] COL_ORDER: {bigint(19)} <br>
     * 列順序
     * @param colOrder The value of the column 'COL_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColOrder(Long colOrder) {
        registerModifiedProperty("colOrder");
        _colOrder = colOrder;
    }

    /**
     * [get] COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @return The value of the column 'COL_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getColType() {
        checkSpecifiedProperty("colType");
        return convertEmptyToNull(_colType);
    }

    /**
     * [set] COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param colType The value of the column 'COL_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColType(String colType) {
        registerModifiedProperty("colType");
        _colType = colType;
    }

    /**
     * [get] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (basically NotNull if selected: for the constraint)
     */
    public String getVisible() {
        checkSpecifiedProperty("visible");
        return convertEmptyToNull(_visible);
    }

    /**
     * [set] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (basically NotNull if update: for the constraint)
     */
    public void setVisible(String visible) {
        registerModifiedProperty("visible");
        _visible = visible;
    }

    /**
     * [get] EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @return The value of the column 'EDITABLE'. (basically NotNull if selected: for the constraint)
     */
    public String getEditable() {
        checkSpecifiedProperty("editable");
        return convertEmptyToNull(_editable);
    }

    /**
     * [set] EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param editable The value of the column 'EDITABLE'. (basically NotNull if update: for the constraint)
     */
    public void setEditable(String editable) {
        registerModifiedProperty("editable");
        _editable = editable;
    }

    /**
     * [get] TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @return The value of the column 'TEXT_ALIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getTextAlign() {
        checkSpecifiedProperty("textAlign");
        return convertEmptyToNull(_textAlign);
    }

    /**
     * [set] TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param textAlign The value of the column 'TEXT_ALIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTextAlign(String textAlign) {
        registerModifiedProperty("textAlign");
        _textAlign = textAlign;
    }

    /**
     * [get] NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @return The value of the column 'NECESSARY'. (basically NotNull if selected: for the constraint)
     */
    public String getNecessary() {
        checkSpecifiedProperty("necessary");
        return convertEmptyToNull(_necessary);
    }

    /**
     * [set] NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param necessary The value of the column 'NECESSARY'. (basically NotNull if update: for the constraint)
     */
    public void setNecessary(String necessary) {
        registerModifiedProperty("necessary");
        _necessary = necessary;
    }

    /**
     * [get] COL_WIDTH: {bigint(19)} <br>
     * 列幅
     * @return The value of the column 'COL_WIDTH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getColWidth() {
        checkSpecifiedProperty("colWidth");
        return _colWidth;
    }

    /**
     * [set] COL_WIDTH: {bigint(19)} <br>
     * 列幅
     * @param colWidth The value of the column 'COL_WIDTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColWidth(Long colWidth) {
        registerModifiedProperty("colWidth");
        _colWidth = colWidth;
    }

    /**
     * [get] IN_COL_INDEX: {bigint(19)} <br>
     * 入力ファイル列位置
     * @return The value of the column 'IN_COL_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInColIndex() {
        checkSpecifiedProperty("inColIndex");
        return _inColIndex;
    }

    /**
     * [set] IN_COL_INDEX: {bigint(19)} <br>
     * 入力ファイル列位置
     * @param inColIndex The value of the column 'IN_COL_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInColIndex(Long inColIndex) {
        registerModifiedProperty("inColIndex");
        _inColIndex = inColIndex;
    }

    /**
     * [get] IN_COL_DEFAULT_VALUE: {varchar(255)} <br>
     * 入力ファイル列規定値
     * @return The value of the column 'IN_COL_DEFAULT_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInColDefaultValue() {
        checkSpecifiedProperty("inColDefaultValue");
        return convertEmptyToNull(_inColDefaultValue);
    }

    /**
     * [set] IN_COL_DEFAULT_VALUE: {varchar(255)} <br>
     * 入力ファイル列規定値
     * @param inColDefaultValue The value of the column 'IN_COL_DEFAULT_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInColDefaultValue(String inColDefaultValue) {
        registerModifiedProperty("inColDefaultValue");
        _inColDefaultValue = inColDefaultValue;
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
