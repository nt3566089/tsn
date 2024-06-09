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
 * The entity of B_ITEM as TABLE. <br>
 * 項目マスタ
 * <pre>
 * [primary-key]
 *     ITEM_ID
 *
 * [column]
 *     ITEM_ID, SCREEN_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, DISPLAY_REQUIRED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_SCREEN, V_DICT, V_HT_DICT, B_CLASS_DTL(ByItemType), B_ITEM_VALID(AsOne)
 *
 * [referrer table]
 *     B_COL, B_COL_EXT_BASE, B_COL_EXT_USER, B_ITEM_ROLE, M_CENTER_ITEM, M_CLIENT_ITEM, B_ITEM_VALID
 *
 * [foreign property]
 *     bDict, bScreen, vDict, vHtDict, bClassDtlByItemType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bClassDtlByDisplayRequired, bItemValidAsOne
 *
 * [referrer property]
 *     bColList, bColExtBaseList, bColExtUserList, bItemRoleList, mCenterItemList, mClientItemList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long itemId = entity.getItemId();
 * Long screenId = entity.getScreenId();
 * String itemCd = entity.getItemCd();
 * Long dictId = entity.getDictId();
 * String itemType = entity.getItemType();
 * String visible = entity.getVisible();
 * String editable = entity.getEditable();
 * String textAlign = entity.getTextAlign();
 * String necessary = entity.getNecessary();
 * String displayRequired = entity.getDisplayRequired();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setItemId(itemId);
 * entity.setScreenId(screenId);
 * entity.setItemCd(itemCd);
 * entity.setDictId(dictId);
 * entity.setItemType(itemType);
 * entity.setVisible(visible);
 * entity.setEditable(editable);
 * entity.setTextAlign(textAlign);
 * entity.setNecessary(necessary);
 * entity.setDisplayRequired(displayRequired);
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
public abstract class BsBItem extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ITEM_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _itemId;

    /** SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN} */
    protected Long _screenId;

    /** ITEM_CD: {UQ+, NotNull, varchar(100)} */
    protected String _itemCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    protected Long _dictId;

    /** ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} */
    protected String _itemType;

    /** VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} */
    protected String _visible;

    /** EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} */
    protected String _editable;

    /** TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} */
    protected String _textAlign;

    /** NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} */
    protected String _necessary;

    /** DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} */
    protected String _displayRequired;

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
        return "B_ITEM";
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
        if (_itemId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param itemCd : UQ+, NotNull, varchar(100). (NotNull)
     * @param screenId : +UQ, IX, NotNull, bigint(19), FK to B_SCREEN. (NotNull)
     */
    public void uniqueBy(String itemCd, Long screenId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("itemCd");
        __uniqueDrivenProperties.addPropertyName("screenId");
        setItemCd(itemCd);setScreenId(screenId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of itemType as the classification of ItemType. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ItemType getItemTypeAsItemType() {
        return CDef.ItemType.codeOf(getItemType());
    }

    /**
     * Set the value of itemType as the classification of ItemType. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setItemTypeAsItemType(CDef.ItemType cdef) {
        setItemType(cdef != null ? cdef.code() : null);
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
     * Get the value of displayRequired as the classification of DisplayRequired. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DisplayRequired getDisplayRequiredAsDisplayRequired() {
        return CDef.DisplayRequired.codeOf(getDisplayRequired());
    }

    /**
     * Set the value of displayRequired as the classification of DisplayRequired. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDisplayRequiredAsDisplayRequired(CDef.DisplayRequired cdef) {
        setDisplayRequired(cdef != null ? cdef.code() : null);
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
     * Set the value of itemType as $checkbox (checkbox). <br>
     * $checkbox: チェックボックス
     */
    public void setItemType_$checkbox() {
        setItemTypeAsItemType(CDef.ItemType.$checkbox);
    }

    /**
     * Set the value of itemType as $date (date). <br>
     * $date: 日付
     */
    public void setItemType_$date() {
        setItemTypeAsItemType(CDef.ItemType.$date);
    }

    /**
     * Set the value of itemType as $datetime (datetime). <br>
     * $datetime: 日時
     */
    public void setItemType_$datetime() {
        setItemTypeAsItemType(CDef.ItemType.$datetime);
    }

    /**
     * Set the value of itemType as $dropdown (dropdown). <br>
     * $dropdown: コンボボックス
     */
    public void setItemType_$dropdown() {
        setItemTypeAsItemType(CDef.ItemType.$dropdown);
    }

    /**
     * Set the value of itemType as $grid (grid). <br>
     * $grid: グリッド
     */
    public void setItemType_$grid() {
        setItemTypeAsItemType(CDef.ItemType.$grid);
    }

    /**
     * Set the value of itemType as $number (number). <br>
     * $number: 数値
     */
    public void setItemType_$number() {
        setItemTypeAsItemType(CDef.ItemType.$number);
    }

    /**
     * Set the value of itemType as $text (text). <br>
     * $text: テキスト
     */
    public void setItemType_$text() {
        setItemTypeAsItemType(CDef.ItemType.$text);
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
     * Set the value of displayRequired as $0 (0). <br>
     * $0: 任意
     */
    public void setDisplayRequired_$0() {
        setDisplayRequiredAsDisplayRequired(CDef.DisplayRequired.$0);
    }

    /**
     * Set the value of displayRequired as $1 (1). <br>
     * $1: 必須
     */
    public void setDisplayRequired_$1() {
        setDisplayRequiredAsDisplayRequired(CDef.DisplayRequired.$1);
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
     * Is the value of itemType $checkbox? <br>
     * $checkbox: チェックボックス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$checkbox() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$checkbox) : false;
    }

    /**
     * Is the value of itemType $date? <br>
     * $date: 日付
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$date() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$date) : false;
    }

    /**
     * Is the value of itemType $datetime? <br>
     * $datetime: 日時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$datetime() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$datetime) : false;
    }

    /**
     * Is the value of itemType $dropdown? <br>
     * $dropdown: コンボボックス
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$dropdown() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$dropdown) : false;
    }

    /**
     * Is the value of itemType $grid? <br>
     * $grid: グリッド
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$grid() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$grid) : false;
    }

    /**
     * Is the value of itemType $number? <br>
     * $number: 数値
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$number() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$number) : false;
    }

    /**
     * Is the value of itemType $text? <br>
     * $text: テキスト
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isItemType$text() {
        CDef.ItemType cdef = getItemTypeAsItemType();
        return cdef != null ? cdef.equals(CDef.ItemType.$text) : false;
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
     * Is the value of displayRequired $0? <br>
     * $0: 任意
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDisplayRequired$0() {
        CDef.DisplayRequired cdef = getDisplayRequiredAsDisplayRequired();
        return cdef != null ? cdef.equals(CDef.DisplayRequired.$0) : false;
    }

    /**
     * Is the value of displayRequired $1? <br>
     * $1: 必須
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDisplayRequired$1() {
        CDef.DisplayRequired cdef = getDisplayRequiredAsDisplayRequired();
        return cdef != null ? cdef.equals(CDef.DisplayRequired.$1) : false;
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
     * Get the value of the column 'itemType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getItemTypeName() {
        CDef.ItemType cdef = getItemTypeAsItemType();
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
     * Get the value of the column 'displayRequired' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDisplayRequiredName() {
        CDef.DisplayRequired cdef = getDisplayRequiredAsDisplayRequired();
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

    /** B_SCREEN by my SCREEN_ID, named 'BScreen'. */
    protected BScreen _bScreen;

    /**
     * [get] B_SCREEN by my SCREEN_ID, named 'BScreen'. <br>
     * @return The entity of foreign property 'BScreen'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BScreen getBScreen() {
        return _bScreen;
    }

    /**
     * [set] B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @param bScreen The entity of foreign property 'BScreen'. (NullAllowed)
     */
    public void setBScreen(BScreen bScreen) {
        _bScreen = bScreen;
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

    /** B_CLASS_DTL by my ITEM_TYPE, named 'BClassDtlByItemType'. */
    protected BClassDtl _bClassDtlByItemType;

    /**
     * [get] B_CLASS_DTL by my ITEM_TYPE, named 'BClassDtlByItemType'. <br>
     * @return The entity of foreign property 'BClassDtlByItemType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByItemType() {
        return _bClassDtlByItemType;
    }

    /**
     * [set] B_CLASS_DTL by my ITEM_TYPE, named 'BClassDtlByItemType'.
     * @param bClassDtlByItemType The entity of foreign property 'BClassDtlByItemType'. (NullAllowed)
     */
    public void setBClassDtlByItemType(BClassDtl bClassDtlByItemType) {
        _bClassDtlByItemType = bClassDtlByItemType;
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

    /** B_CLASS_DTL by my DISPLAY_REQUIRED, named 'BClassDtlByDisplayRequired'. */
    protected BClassDtl _bClassDtlByDisplayRequired;

    /**
     * [get] B_CLASS_DTL by my DISPLAY_REQUIRED, named 'BClassDtlByDisplayRequired'. <br>
     * @return The entity of foreign property 'BClassDtlByDisplayRequired'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDisplayRequired() {
        return _bClassDtlByDisplayRequired;
    }

    /**
     * [set] B_CLASS_DTL by my DISPLAY_REQUIRED, named 'BClassDtlByDisplayRequired'.
     * @param bClassDtlByDisplayRequired The entity of foreign property 'BClassDtlByDisplayRequired'. (NullAllowed)
     */
    public void setBClassDtlByDisplayRequired(BClassDtl bClassDtlByDisplayRequired) {
        _bClassDtlByDisplayRequired = bClassDtlByDisplayRequired;
    }

    /** B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'. */
    protected BItemValid _bItemValidAsOne;

    /**
     * [get] B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'BItemValidAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public BItemValid getBItemValidAsOne() {
        return _bItemValidAsOne;
    }

    /**
     * [set] B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'.
     * @param BItemValidAsOne The entity of foreign property(referrer-as-one) 'BItemValidAsOne'. (NullAllowed)
     */
    public void setBItemValidAsOne(BItemValid BItemValidAsOne) {
        _bItemValidAsOne = BItemValidAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** B_COL by ITEM_ID, named 'BColList'. */
    protected List<BCol> _bColList;

    /**
     * [get] B_COL by ITEM_ID, named 'BColList'.
     * @return The entity list of referrer property 'BColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BCol> getBColList() {
        if (_bColList == null) { _bColList = newReferrerList(); }
        return _bColList;
    }

    /**
     * [set] B_COL by ITEM_ID, named 'BColList'.
     * @param bColList The entity list of referrer property 'BColList'. (NullAllowed)
     */
    public void setBColList(List<BCol> bColList) {
        _bColList = bColList;
    }

    /** B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'. */
    protected List<BColExtBase> _bColExtBaseList;

    /**
     * [get] B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'.
     * @return The entity list of referrer property 'BColExtBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BColExtBase> getBColExtBaseList() {
        if (_bColExtBaseList == null) { _bColExtBaseList = newReferrerList(); }
        return _bColExtBaseList;
    }

    /**
     * [set] B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseList'.
     * @param bColExtBaseList The entity list of referrer property 'BColExtBaseList'. (NullAllowed)
     */
    public void setBColExtBaseList(List<BColExtBase> bColExtBaseList) {
        _bColExtBaseList = bColExtBaseList;
    }

    /** B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'. */
    protected List<BColExtUser> _bColExtUserList;

    /**
     * [get] B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'.
     * @return The entity list of referrer property 'BColExtUserList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BColExtUser> getBColExtUserList() {
        if (_bColExtUserList == null) { _bColExtUserList = newReferrerList(); }
        return _bColExtUserList;
    }

    /**
     * [set] B_COL_EXT_USER by ITEM_ID, named 'BColExtUserList'.
     * @param bColExtUserList The entity list of referrer property 'BColExtUserList'. (NullAllowed)
     */
    public void setBColExtUserList(List<BColExtUser> bColExtUserList) {
        _bColExtUserList = bColExtUserList;
    }

    /** B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'. */
    protected List<BItemRole> _bItemRoleList;

    /**
     * [get] B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'.
     * @return The entity list of referrer property 'BItemRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BItemRole> getBItemRoleList() {
        if (_bItemRoleList == null) { _bItemRoleList = newReferrerList(); }
        return _bItemRoleList;
    }

    /**
     * [set] B_ITEM_ROLE by ITEM_ID, named 'BItemRoleList'.
     * @param bItemRoleList The entity list of referrer property 'BItemRoleList'. (NullAllowed)
     */
    public void setBItemRoleList(List<BItemRole> bItemRoleList) {
        _bItemRoleList = bItemRoleList;
    }

    /** M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'. */
    protected List<MCenterItem> _mCenterItemList;

    /**
     * [get] M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'.
     * @return The entity list of referrer property 'MCenterItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterItem> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = newReferrerList(); }
        return _mCenterItemList;
    }

    /**
     * [set] M_CENTER_ITEM by ITEM_ID, named 'MCenterItemList'.
     * @param mCenterItemList The entity list of referrer property 'MCenterItemList'. (NullAllowed)
     */
    public void setMCenterItemList(List<MCenterItem> mCenterItemList) {
        _mCenterItemList = mCenterItemList;
    }

    /** M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'. */
    protected List<MClientItem> _mClientItemList;

    /**
     * [get] M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'.
     * @return The entity list of referrer property 'MClientItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientItem> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = newReferrerList(); }
        return _mClientItemList;
    }

    /**
     * [set] M_CLIENT_ITEM by ITEM_ID, named 'MClientItemList'.
     * @param mClientItemList The entity list of referrer property 'MClientItemList'. (NullAllowed)
     */
    public void setMClientItemList(List<MClientItem> mClientItemList) {
        _mClientItemList = mClientItemList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBItem) {
            BsBItem other = (BsBItem)obj;
            if (!xSV(_itemId, other._itemId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _itemId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_bScreen != null)
        { sb.append(li).append(xbRDS(_bScreen, "bScreen")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_vHtDict != null)
        { sb.append(li).append(xbRDS(_vHtDict, "vHtDict")); }
        if (_bClassDtlByItemType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByItemType, "bClassDtlByItemType")); }
        if (_bClassDtlByVisible != null)
        { sb.append(li).append(xbRDS(_bClassDtlByVisible, "bClassDtlByVisible")); }
        if (_bClassDtlByEditable != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEditable, "bClassDtlByEditable")); }
        if (_bClassDtlByTextAlign != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTextAlign, "bClassDtlByTextAlign")); }
        if (_bClassDtlByNecessary != null)
        { sb.append(li).append(xbRDS(_bClassDtlByNecessary, "bClassDtlByNecessary")); }
        if (_bClassDtlByDisplayRequired != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDisplayRequired, "bClassDtlByDisplayRequired")); }
        if (_bItemValidAsOne != null)
        { sb.append(li).append(xbRDS(_bItemValidAsOne, "bItemValidAsOne")); }
        if (_bColList != null) { for (BCol et : _bColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bColList")); } } }
        if (_bColExtBaseList != null) { for (BColExtBase et : _bColExtBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bColExtBaseList")); } } }
        if (_bColExtUserList != null) { for (BColExtUser et : _bColExtUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bColExtUserList")); } } }
        if (_bItemRoleList != null) { for (BItemRole et : _bItemRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bItemRoleList")); } } }
        if (_mCenterItemList != null) { for (MCenterItem et : _mCenterItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterItemList")); } } }
        if (_mClientItemList != null) { for (MClientItem et : _mClientItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientItemList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_itemId));
        sb.append(dm).append(xfND(_screenId));
        sb.append(dm).append(xfND(_itemCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_itemType));
        sb.append(dm).append(xfND(_visible));
        sb.append(dm).append(xfND(_editable));
        sb.append(dm).append(xfND(_textAlign));
        sb.append(dm).append(xfND(_necessary));
        sb.append(dm).append(xfND(_displayRequired));
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
        if (_bScreen != null)
        { sb.append(dm).append("bScreen"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_vHtDict != null)
        { sb.append(dm).append("vHtDict"); }
        if (_bClassDtlByItemType != null)
        { sb.append(dm).append("bClassDtlByItemType"); }
        if (_bClassDtlByVisible != null)
        { sb.append(dm).append("bClassDtlByVisible"); }
        if (_bClassDtlByEditable != null)
        { sb.append(dm).append("bClassDtlByEditable"); }
        if (_bClassDtlByTextAlign != null)
        { sb.append(dm).append("bClassDtlByTextAlign"); }
        if (_bClassDtlByNecessary != null)
        { sb.append(dm).append("bClassDtlByNecessary"); }
        if (_bClassDtlByDisplayRequired != null)
        { sb.append(dm).append("bClassDtlByDisplayRequired"); }
        if (_bItemValidAsOne != null)
        { sb.append(dm).append("bItemValidAsOne"); }
        if (_bColList != null && !_bColList.isEmpty())
        { sb.append(dm).append("bColList"); }
        if (_bColExtBaseList != null && !_bColExtBaseList.isEmpty())
        { sb.append(dm).append("bColExtBaseList"); }
        if (_bColExtUserList != null && !_bColExtUserList.isEmpty())
        { sb.append(dm).append("bColExtUserList"); }
        if (_bItemRoleList != null && !_bItemRoleList.isEmpty())
        { sb.append(dm).append("bItemRoleList"); }
        if (_mCenterItemList != null && !_mCenterItemList.isEmpty())
        { sb.append(dm).append("mCenterItemList"); }
        if (_mClientItemList != null && !_mClientItemList.isEmpty())
        { sb.append(dm).append("mClientItemList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BItem clone() {
        return (BItem)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getItemId() {
        checkSpecifiedProperty("itemId");
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setItemId(Long itemId) {
        registerModifiedProperty("itemId");
        _itemId = itemId;
    }

    /**
     * [get] SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getScreenId() {
        checkSpecifiedProperty("screenId");
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setScreenId(Long screenId) {
        registerModifiedProperty("screenId");
        _screenId = screenId;
    }

    /**
     * [get] ITEM_CD: {UQ+, NotNull, varchar(100)} <br>
     * 項目CD
     * @return The value of the column 'ITEM_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getItemCd() {
        checkSpecifiedProperty("itemCd");
        return convertEmptyToNull(_itemCd);
    }

    /**
     * [set] ITEM_CD: {UQ+, NotNull, varchar(100)} <br>
     * 項目CD
     * @param itemCd The value of the column 'ITEM_CD'. (basically NotNull if update: for the constraint)
     */
    public void setItemCd(String itemCd) {
        registerModifiedProperty("itemCd");
        _itemCd = itemCd;
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
     * [get] ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @return The value of the column 'ITEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemType() {
        checkSpecifiedProperty("itemType");
        return convertEmptyToNull(_itemType);
    }

    /**
     * [set] ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param itemType The value of the column 'ITEM_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemType(String itemType) {
        registerModifiedProperty("itemType");
        _itemType = itemType;
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
     * [get] DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @return The value of the column 'DISPLAY_REQUIRED'. (basically NotNull if selected: for the constraint)
     */
    public String getDisplayRequired() {
        checkSpecifiedProperty("displayRequired");
        return convertEmptyToNull(_displayRequired);
    }

    /**
     * [set] DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param displayRequired The value of the column 'DISPLAY_REQUIRED'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayRequired(String displayRequired) {
        registerModifiedProperty("displayRequired");
        _displayRequired = displayRequired;
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
