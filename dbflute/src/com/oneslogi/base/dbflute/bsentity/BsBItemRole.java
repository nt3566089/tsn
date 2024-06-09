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
 * The entity of B_ITEM_ROLE as TABLE. <br>
 * 項目権限マスタ
 * <pre>
 * [primary-key]
 *     ITEM_ROLE_ID
 *
 * [column]
 *     ITEM_ROLE_ID, ROLE_ID, ITEM_ID, VISIBLE, EDITABLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ITEM, B_ROLE, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bItem, bRole, bClassDtlByVisible, bClassDtlByEditable
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long itemRoleId = entity.getItemRoleId();
 * Long roleId = entity.getRoleId();
 * Long itemId = entity.getItemId();
 * String visible = entity.getVisible();
 * String editable = entity.getEditable();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setItemRoleId(itemRoleId);
 * entity.setRoleId(roleId);
 * entity.setItemId(itemId);
 * entity.setVisible(visible);
 * entity.setEditable(editable);
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
public abstract class BsBItemRole extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _itemRoleId;

    /** ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE} */
    protected Long _roleId;

    /** ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM} */
    protected Long _itemId;

    /** VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} */
    protected String _visible;

    /** EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} */
    protected String _editable;

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
        return "B_ITEM_ROLE";
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
        if (_itemRoleId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param roleId : UQ+, IX, NotNull, bigint(19), FK to B_ROLE. (NotNull)
     * @param itemId : +UQ, IX, NotNull, bigint(19), FK to B_ITEM. (NotNull)
     */
    public void uniqueBy(Long roleId, Long itemId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("roleId");
        __uniqueDrivenProperties.addPropertyName("itemId");
        setRoleId(roleId);setItemId(itemId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of visible as the classification of Visible. <br>
     * VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Visible getVisibleAsVisible() {
        return CDef.Visible.codeOf(getVisible());
    }

    /**
     * Set the value of visible as the classification of Visible. <br>
     * VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setVisibleAsVisible(CDef.Visible cdef) {
        setVisible(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of editable as the classification of Editable. <br>
     * EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Editable getEditableAsEditable() {
        return CDef.Editable.codeOf(getEditable());
    }

    /**
     * Set the value of editable as the classification of Editable. <br>
     * EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEditableAsEditable(CDef.Editable cdef) {
        setEditable(cdef != null ? cdef.code() : null);
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

    /** B_ROLE by my ROLE_ID, named 'BRole'. */
    protected BRole _bRole;

    /**
     * [get] B_ROLE by my ROLE_ID, named 'BRole'. <br>
     * @return The entity of foreign property 'BRole'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BRole getBRole() {
        return _bRole;
    }

    /**
     * [set] B_ROLE by my ROLE_ID, named 'BRole'.
     * @param bRole The entity of foreign property 'BRole'. (NullAllowed)
     */
    public void setBRole(BRole bRole) {
        _bRole = bRole;
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
        if (obj instanceof BsBItemRole) {
            BsBItemRole other = (BsBItemRole)obj;
            if (!xSV(_itemRoleId, other._itemRoleId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _itemRoleId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bItem != null)
        { sb.append(li).append(xbRDS(_bItem, "bItem")); }
        if (_bRole != null)
        { sb.append(li).append(xbRDS(_bRole, "bRole")); }
        if (_bClassDtlByVisible != null)
        { sb.append(li).append(xbRDS(_bClassDtlByVisible, "bClassDtlByVisible")); }
        if (_bClassDtlByEditable != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEditable, "bClassDtlByEditable")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_itemRoleId));
        sb.append(dm).append(xfND(_roleId));
        sb.append(dm).append(xfND(_itemId));
        sb.append(dm).append(xfND(_visible));
        sb.append(dm).append(xfND(_editable));
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
        if (_bItem != null)
        { sb.append(dm).append("bItem"); }
        if (_bRole != null)
        { sb.append(dm).append("bRole"); }
        if (_bClassDtlByVisible != null)
        { sb.append(dm).append("bClassDtlByVisible"); }
        if (_bClassDtlByEditable != null)
        { sb.append(dm).append("bClassDtlByEditable"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BItemRole clone() {
        return (BItemRole)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目権限ID
     * @return The value of the column 'ITEM_ROLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getItemRoleId() {
        checkSpecifiedProperty("itemRoleId");
        return _itemRoleId;
    }

    /**
     * [set] ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目権限ID
     * @param itemRoleId The value of the column 'ITEM_ROLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setItemRoleId(Long itemRoleId) {
        registerModifiedProperty("itemRoleId");
        _itemRoleId = itemRoleId;
    }

    /**
     * [get] ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE} <br>
     * 権限ID
     * @return The value of the column 'ROLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRoleId() {
        checkSpecifiedProperty("roleId");
        return _roleId;
    }

    /**
     * [set] ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE} <br>
     * 権限ID
     * @param roleId The value of the column 'ROLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRoleId(Long roleId) {
        registerModifiedProperty("roleId");
        _roleId = roleId;
    }

    /**
     * [get] ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getItemId() {
        checkSpecifiedProperty("itemId");
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setItemId(Long itemId) {
        registerModifiedProperty("itemId");
        _itemId = itemId;
    }

    /**
     * [get] VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getVisible() {
        checkSpecifiedProperty("visible");
        return convertEmptyToNull(_visible);
    }

    /**
     * [set] VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVisible(String visible) {
        registerModifiedProperty("visible");
        _visible = visible;
    }

    /**
     * [get] EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @return The value of the column 'EDITABLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getEditable() {
        checkSpecifiedProperty("editable");
        return convertEmptyToNull(_editable);
    }

    /**
     * [set] EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param editable The value of the column 'EDITABLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEditable(String editable) {
        registerModifiedProperty("editable");
        _editable = editable;
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
