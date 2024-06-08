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
 * The entity of T_TRMANUFACTUREDATEDETAIL as TABLE. <br>
 * 製造年月日明細
 * <pre>
 * [primary-key]
 *     TRMANUFACTUREDATEDETAIL_ID
 *
 * [column]
 *     TRMANUFACTUREDATEDETAIL_ID, CENTER_CD, OWNER_CD, INVENTORY_KBN, LINE_BLOCK, PRODUCT_CD, INVENTORY_KEY, INVENTORY_B_ID, INVENTORY_DATE, BF_MANUFACTURE_DATE, AF_MANUFACTURE_DATE, DESIGN_FLG, CENTER_ID, CLIENT_ID, PRINTEDFLG, INSIDE_OUTSIDE_KBN, RMANO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRMANUFACTUREDATEDETAIL_ID
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
 * Long trmanufacturedatedetailId = entity.getTrmanufacturedatedetailId();
 * String centerCd = entity.getCenterCd();
 * String ownerCd = entity.getOwnerCd();
 * String inventoryKbn = entity.getInventoryKbn();
 * String lineBlock = entity.getLineBlock();
 * String productCd = entity.getProductCd();
 * String inventoryKey = entity.getInventoryKey();
 * Long inventoryBId = entity.getInventoryBId();
 * String inventoryDate = entity.getInventoryDate();
 * String bfManufactureDate = entity.getBfManufactureDate();
 * String afManufactureDate = entity.getAfManufactureDate();
 * String designFlg = entity.getDesignFlg();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String printedflg = entity.getPrintedflg();
 * String insideOutsideKbn = entity.getInsideOutsideKbn();
 * String rmano = entity.getRmano();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrmanufacturedatedetailId(trmanufacturedatedetailId);
 * entity.setCenterCd(centerCd);
 * entity.setOwnerCd(ownerCd);
 * entity.setInventoryKbn(inventoryKbn);
 * entity.setLineBlock(lineBlock);
 * entity.setProductCd(productCd);
 * entity.setInventoryKey(inventoryKey);
 * entity.setInventoryBId(inventoryBId);
 * entity.setInventoryDate(inventoryDate);
 * entity.setBfManufactureDate(bfManufactureDate);
 * entity.setAfManufactureDate(afManufactureDate);
 * entity.setDesignFlg(designFlg);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setPrintedflg(printedflg);
 * entity.setInsideOutsideKbn(insideOutsideKbn);
 * entity.setRmano(rmano);
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
public abstract class BsTTrmanufacturedatedetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trmanufacturedatedetailId;

    /** CENTER_CD: {NotNull, varchar(30)} */
    protected String _centerCd;

    /** OWNER_CD: {NotNull, varchar(30)} */
    protected String _ownerCd;

    /** INVENTORY_KBN: {NotNull, varchar(30)} */
    protected String _inventoryKbn;

    /** LINE_BLOCK: {NotNull, varchar(30)} */
    protected String _lineBlock;

    /** PRODUCT_CD: {IX+, NotNull, varchar(30)} */
    protected String _productCd;

    /** INVENTORY_KEY: {IX+, NotNull, varchar(30)} */
    protected String _inventoryKey;

    /** INVENTORY_B_ID: {NotNull, bigint(19)} */
    protected Long _inventoryBId;

    /** INVENTORY_DATE: {IX+, NotNull, varchar(8)} */
    protected String _inventoryDate;

    /** BF_MANUFACTURE_DATE: {varchar(8)} */
    protected String _bfManufactureDate;

    /** AF_MANUFACTURE_DATE: {varchar(8)} */
    protected String _afManufactureDate;

    /** DESIGN_FLG: {varchar(30)} */
    protected String _designFlg;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** PRINTEDFLG: {char(1)} */
    protected String _printedflg;

    /** INSIDE_OUTSIDE_KBN: {varchar(60)} */
    protected String _insideOutsideKbn;

    /** RMANO: {varchar(30)} */
    protected String _rmano;

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
        return "T_TRMANUFACTUREDATEDETAIL";
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
        if (_trmanufacturedatedetailId == null) { return false; }
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
        if (obj instanceof BsTTrmanufacturedatedetail) {
            BsTTrmanufacturedatedetail other = (BsTTrmanufacturedatedetail)obj;
            if (!xSV(_trmanufacturedatedetailId, other._trmanufacturedatedetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trmanufacturedatedetailId);
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
        sb.append(dm).append(xfND(_trmanufacturedatedetailId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_ownerCd));
        sb.append(dm).append(xfND(_inventoryKbn));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_inventoryKey));
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_inventoryDate));
        sb.append(dm).append(xfND(_bfManufactureDate));
        sb.append(dm).append(xfND(_afManufactureDate));
        sb.append(dm).append(xfND(_designFlg));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_insideOutsideKbn));
        sb.append(dm).append(xfND(_rmano));
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
    public TTrmanufacturedatedetail clone() {
        return (TTrmanufacturedatedetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製造年月日明細ID
     * @return The value of the column 'TRMANUFACTUREDATEDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrmanufacturedatedetailId() {
        checkSpecifiedProperty("trmanufacturedatedetailId");
        return _trmanufacturedatedetailId;
    }

    /**
     * [set] TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製造年月日明細ID
     * @param trmanufacturedatedetailId The value of the column 'TRMANUFACTUREDATEDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrmanufacturedatedetailId(Long trmanufacturedatedetailId) {
        registerModifiedProperty("trmanufacturedatedetailId");
        _trmanufacturedatedetailId = trmanufacturedatedetailId;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] OWNER_CD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnerCd() {
        checkSpecifiedProperty("ownerCd");
        return convertEmptyToNull(_ownerCd);
    }

    /**
     * [set] OWNER_CD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownerCd The value of the column 'OWNER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setOwnerCd(String ownerCd) {
        registerModifiedProperty("ownerCd");
        _ownerCd = ownerCd;
    }

    /**
     * [get] INVENTORY_KBN: {NotNull, varchar(30)} <br>
     * 棚卸区分
     * @return The value of the column 'INVENTORY_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getInventoryKbn() {
        checkSpecifiedProperty("inventoryKbn");
        return convertEmptyToNull(_inventoryKbn);
    }

    /**
     * [set] INVENTORY_KBN: {NotNull, varchar(30)} <br>
     * 棚卸区分
     * @param inventoryKbn The value of the column 'INVENTORY_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryKbn(String inventoryKbn) {
        registerModifiedProperty("inventoryKbn");
        _inventoryKbn = inventoryKbn;
    }

    /**
     * [get] LINE_BLOCK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINE_BLOCK'. (basically NotNull if selected: for the constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (basically NotNull if update: for the constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] PRODUCT_CD: {IX+, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {IX+, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] INVENTORY_KEY: {IX+, NotNull, varchar(30)} <br>
     * 在庫調査指示キー
     * @return The value of the column 'INVENTORY_KEY'. (basically NotNull if selected: for the constraint)
     */
    public String getInventoryKey() {
        checkSpecifiedProperty("inventoryKey");
        return convertEmptyToNull(_inventoryKey);
    }

    /**
     * [set] INVENTORY_KEY: {IX+, NotNull, varchar(30)} <br>
     * 在庫調査指示キー
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryKey(String inventoryKey) {
        registerModifiedProperty("inventoryKey");
        _inventoryKey = inventoryKey;
    }

    /**
     * [get] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_DATE: {IX+, NotNull, varchar(8)} <br>
     * 在庫調査日
     * @return The value of the column 'INVENTORY_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getInventoryDate() {
        checkSpecifiedProperty("inventoryDate");
        return convertEmptyToNull(_inventoryDate);
    }

    /**
     * [set] INVENTORY_DATE: {IX+, NotNull, varchar(8)} <br>
     * 在庫調査日
     * @param inventoryDate The value of the column 'INVENTORY_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryDate(String inventoryDate) {
        registerModifiedProperty("inventoryDate");
        _inventoryDate = inventoryDate;
    }

    /**
     * [get] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 前回製造年月日
     * @return The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBfManufactureDate() {
        checkSpecifiedProperty("bfManufactureDate");
        return convertEmptyToNull(_bfManufactureDate);
    }

    /**
     * [set] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 前回製造年月日
     * @param bfManufactureDate The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBfManufactureDate(String bfManufactureDate) {
        registerModifiedProperty("bfManufactureDate");
        _bfManufactureDate = bfManufactureDate;
    }

    /**
     * [get] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 今回製造年月日
     * @return The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getAfManufactureDate() {
        checkSpecifiedProperty("afManufactureDate");
        return convertEmptyToNull(_afManufactureDate);
    }

    /**
     * [set] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 今回製造年月日
     * @param afManufactureDate The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAfManufactureDate(String afManufactureDate) {
        registerModifiedProperty("afManufactureDate");
        _afManufactureDate = afManufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
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
     * [get] PRINTEDFLG: {char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * 内外区分
     * @return The value of the column 'INSIDE_OUTSIDE_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsideOutsideKbn() {
        checkSpecifiedProperty("insideOutsideKbn");
        return convertEmptyToNull(_insideOutsideKbn);
    }

    /**
     * [set] INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * 内外区分
     * @param insideOutsideKbn The value of the column 'INSIDE_OUTSIDE_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsideOutsideKbn(String insideOutsideKbn) {
        registerModifiedProperty("insideOutsideKbn");
        _insideOutsideKbn = insideOutsideKbn;
    }

    /**
     * [get] RMANO: {varchar(30)} <br>
     * 補充先ソートキー
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(30)} <br>
     * 補充先ソートキー
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
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
