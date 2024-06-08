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
 * The entity of T_PICKLIST as TABLE. <br>
 * 棚出リスト
 * <pre>
 * [primary-key]
 *     T_PICKLIST_ID
 *
 * [column]
 *     T_PICKLIST_ID, PICKLISTKEY, WORKALLOCATEID, FLOOR, LISTKBN, LOCATION_ID, LOT_ID, PRODUCT_ID, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, NOSHIPPINGFLG, PICKSCHDATE, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, PICKEDQTY1, PICKEDQTY2, PICKEDQTY3, SORTRECIEVEDQTY1, SORTRECIEVEDQTY2, SORTRECIEVEDQTY3, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_PICKLIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tPicklistId = entity.getTPicklistId();
 * Long picklistkey = entity.getPicklistkey();
 * Long workallocateid = entity.getWorkallocateid();
 * String floor = entity.getFloor();
 * String listkbn = entity.getListkbn();
 * Long locationId = entity.getLocationId();
 * Long lotId = entity.getLotId();
 * Long productId = entity.getProductId();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String otherlot1 = entity.getOtherlot1();
 * Long noshippingflg = entity.getNoshippingflg();
 * String pickschdate = entity.getPickschdate();
 * Long expectqty1 = entity.getExpectqty1();
 * Long expectqty2 = entity.getExpectqty2();
 * Long expectqty3 = entity.getExpectqty3();
 * Long pickedqty1 = entity.getPickedqty1();
 * Long pickedqty2 = entity.getPickedqty2();
 * Long pickedqty3 = entity.getPickedqty3();
 * Long sortrecievedqty1 = entity.getSortrecievedqty1();
 * Long sortrecievedqty2 = entity.getSortrecievedqty2();
 * Long sortrecievedqty3 = entity.getSortrecievedqty3();
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
 * entity.setTPicklistId(tPicklistId);
 * entity.setPicklistkey(picklistkey);
 * entity.setWorkallocateid(workallocateid);
 * entity.setFloor(floor);
 * entity.setListkbn(listkbn);
 * entity.setLocationId(locationId);
 * entity.setLotId(lotId);
 * entity.setProductId(productId);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setOtherlot1(otherlot1);
 * entity.setNoshippingflg(noshippingflg);
 * entity.setPickschdate(pickschdate);
 * entity.setExpectqty1(expectqty1);
 * entity.setExpectqty2(expectqty2);
 * entity.setExpectqty3(expectqty3);
 * entity.setPickedqty1(pickedqty1);
 * entity.setPickedqty2(pickedqty2);
 * entity.setPickedqty3(pickedqty3);
 * entity.setSortrecievedqty1(sortrecievedqty1);
 * entity.setSortrecievedqty2(sortrecievedqty2);
 * entity.setSortrecievedqty3(sortrecievedqty3);
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
public abstract class BsTPicklist extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tPicklistId;

    /** PICKLISTKEY: {NotNull, bigint(19)} */
    protected Long _picklistkey;

    /** WORKALLOCATEID: {NotNull, bigint(19)} */
    protected Long _workallocateid;

    /** FLOOR: {NotNull, varchar(30)} */
    protected String _floor;

    /** LISTKBN: {NotNull, char(1)} */
    protected String _listkbn;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    protected Long _locationId;

    /** LOT_ID: {NotNull, bigint(19)} */
    protected Long _lotId;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    protected Long _productId;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** NOSHIPPINGFLG: {NotNull, bigint(19)} */
    protected Long _noshippingflg;

    /** PICKSCHDATE: {NotNull, varchar(8)} */
    protected String _pickschdate;

    /** EXPECTQTY1: {NotNull, bigint(19)} */
    protected Long _expectqty1;

    /** EXPECTQTY2: {NotNull, bigint(19)} */
    protected Long _expectqty2;

    /** EXPECTQTY3: {NotNull, bigint(19)} */
    protected Long _expectqty3;

    /** PICKEDQTY1: {NotNull, bigint(19)} */
    protected Long _pickedqty1;

    /** PICKEDQTY2: {NotNull, bigint(19)} */
    protected Long _pickedqty2;

    /** PICKEDQTY3: {NotNull, bigint(19)} */
    protected Long _pickedqty3;

    /** SORTRECIEVEDQTY1: {NotNull, bigint(19)} */
    protected Long _sortrecievedqty1;

    /** SORTRECIEVEDQTY2: {NotNull, bigint(19)} */
    protected Long _sortrecievedqty2;

    /** SORTRECIEVEDQTY3: {NotNull, bigint(19)} */
    protected Long _sortrecievedqty3;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
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
        return "T_PICKLIST";
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
        if (_tPicklistId == null) { return false; }
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
        if (obj instanceof BsTPicklist) {
            BsTPicklist other = (BsTPicklist)obj;
            if (!xSV(_tPicklistId, other._tPicklistId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tPicklistId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tPicklistId));
        sb.append(dm).append(xfND(_picklistkey));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_noshippingflg));
        sb.append(dm).append(xfND(_pickschdate));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_expectqty2));
        sb.append(dm).append(xfND(_expectqty3));
        sb.append(dm).append(xfND(_pickedqty1));
        sb.append(dm).append(xfND(_pickedqty2));
        sb.append(dm).append(xfND(_pickedqty3));
        sb.append(dm).append(xfND(_sortrecievedqty1));
        sb.append(dm).append(xfND(_sortrecievedqty2));
        sb.append(dm).append(xfND(_sortrecievedqty3));
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
        return "";
    }

    @Override
    public TPicklist clone() {
        return (TPicklist)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出リストID
     * @return The value of the column 'T_PICKLIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTPicklistId() {
        checkSpecifiedProperty("TPicklistId");
        return _tPicklistId;
    }

    /**
     * [set] T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出リストID
     * @param tPicklistId The value of the column 'T_PICKLIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTPicklistId(Long tPicklistId) {
        registerModifiedProperty("TPicklistId");
        _tPicklistId = tPicklistId;
    }

    /**
     * [get] PICKLISTKEY: {NotNull, bigint(19)} <br>
     * 棚出キー
     * @return The value of the column 'PICKLISTKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPicklistkey() {
        checkSpecifiedProperty("picklistkey");
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {NotNull, bigint(19)} <br>
     * 棚出キー
     * @param picklistkey The value of the column 'PICKLISTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPicklistkey(Long picklistkey) {
        registerModifiedProperty("picklistkey");
        _picklistkey = picklistkey;
    }

    /**
     * [get] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (basically NotNull if update: for the constraint)
     */
    public void setWorkallocateid(Long workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
    }

    /**
     * [get] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (basically NotNull if selected: for the constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (basically NotNull if update: for the constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @return The value of the column 'LISTKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getListkbn() {
        checkSpecifiedProperty("listkbn");
        return convertEmptyToNull(_listkbn);
    }

    /**
     * [set] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @param listkbn The value of the column 'LISTKBN'. (basically NotNull if update: for the constraint)
     */
    public void setListkbn(String listkbn) {
        registerModifiedProperty("listkbn");
        _listkbn = listkbn;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, bigint(19)} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, bigint(19)} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (basically NotNull if update: for the constraint)
     */
    public void setNoshippingflg(Long noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] PICKSCHDATE: {NotNull, varchar(8)} <br>
     * 棚出し予定日
     * @return The value of the column 'PICKSCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPickschdate() {
        checkSpecifiedProperty("pickschdate");
        return convertEmptyToNull(_pickschdate);
    }

    /**
     * [set] PICKSCHDATE: {NotNull, varchar(8)} <br>
     * 棚出し予定日
     * @param pickschdate The value of the column 'PICKSCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setPickschdate(String pickschdate) {
        registerModifiedProperty("pickschdate");
        _pickschdate = pickschdate;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（パレット）
     * @return The value of the column 'EXPECTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（パレット）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty1(Long expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（ケース）
     * @return The value of the column 'EXPECTQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty2() {
        checkSpecifiedProperty("expectqty2");
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（ケース）
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty2(Long expectqty2) {
        registerModifiedProperty("expectqty2");
        _expectqty2 = expectqty2;
    }

    /**
     * [get] EXPECTQTY3: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（カートン）
     * @return The value of the column 'EXPECTQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty3() {
        checkSpecifiedProperty("expectqty3");
        return _expectqty3;
    }

    /**
     * [set] EXPECTQTY3: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（カートン）
     * @param expectqty3 The value of the column 'EXPECTQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty3(Long expectqty3) {
        registerModifiedProperty("expectqty3");
        _expectqty3 = expectqty3;
    }

    /**
     * [get] PICKEDQTY1: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（パレット）
     * @return The value of the column 'PICKEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedqty1() {
        checkSpecifiedProperty("pickedqty1");
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（パレット）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqty1(Long pickedqty1) {
        registerModifiedProperty("pickedqty1");
        _pickedqty1 = pickedqty1;
    }

    /**
     * [get] PICKEDQTY2: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（ケース）
     * @return The value of the column 'PICKEDQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedqty2() {
        checkSpecifiedProperty("pickedqty2");
        return _pickedqty2;
    }

    /**
     * [set] PICKEDQTY2: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（ケース）
     * @param pickedqty2 The value of the column 'PICKEDQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqty2(Long pickedqty2) {
        registerModifiedProperty("pickedqty2");
        _pickedqty2 = pickedqty2;
    }

    /**
     * [get] PICKEDQTY3: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（カートン）
     * @return The value of the column 'PICKEDQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedqty3() {
        checkSpecifiedProperty("pickedqty3");
        return _pickedqty3;
    }

    /**
     * [set] PICKEDQTY3: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（カートン）
     * @param pickedqty3 The value of the column 'PICKEDQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqty3(Long pickedqty3) {
        registerModifiedProperty("pickedqty3");
        _pickedqty3 = pickedqty3;
    }

    /**
     * [get] SORTRECIEVEDQTY1: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（パレット）
     * @return The value of the column 'SORTRECIEVEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortrecievedqty1() {
        checkSpecifiedProperty("sortrecievedqty1");
        return _sortrecievedqty1;
    }

    /**
     * [set] SORTRECIEVEDQTY1: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（パレット）
     * @param sortrecievedqty1 The value of the column 'SORTRECIEVEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setSortrecievedqty1(Long sortrecievedqty1) {
        registerModifiedProperty("sortrecievedqty1");
        _sortrecievedqty1 = sortrecievedqty1;
    }

    /**
     * [get] SORTRECIEVEDQTY2: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（ケース）
     * @return The value of the column 'SORTRECIEVEDQTY2'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortrecievedqty2() {
        checkSpecifiedProperty("sortrecievedqty2");
        return _sortrecievedqty2;
    }

    /**
     * [set] SORTRECIEVEDQTY2: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（ケース）
     * @param sortrecievedqty2 The value of the column 'SORTRECIEVEDQTY2'. (basically NotNull if update: for the constraint)
     */
    public void setSortrecievedqty2(Long sortrecievedqty2) {
        registerModifiedProperty("sortrecievedqty2");
        _sortrecievedqty2 = sortrecievedqty2;
    }

    /**
     * [get] SORTRECIEVEDQTY3: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（カートン）
     * @return The value of the column 'SORTRECIEVEDQTY3'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortrecievedqty3() {
        checkSpecifiedProperty("sortrecievedqty3");
        return _sortrecievedqty3;
    }

    /**
     * [set] SORTRECIEVEDQTY3: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（カートン）
     * @param sortrecievedqty3 The value of the column 'SORTRECIEVEDQTY3'. (basically NotNull if update: for the constraint)
     */
    public void setSortrecievedqty3(Long sortrecievedqty3) {
        registerModifiedProperty("sortrecievedqty3");
        _sortrecievedqty3 = sortrecievedqty3;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
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
