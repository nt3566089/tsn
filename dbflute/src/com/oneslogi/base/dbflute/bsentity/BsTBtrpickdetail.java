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
 * The entity of T_BTRPICKDETAIL as TABLE. <br>
 * ピッキング指示明細
 * <pre>
 * [primary-key]
 *     PICKING_INST_DETAIL_ID
 *
 * [column]
 *     PICKING_INST_DETAIL_ID, PICKING_INST_ID, PICKBATCHLINENO, SOID, SODETAILID, STS, PRODUCT_ID, IF_PRODUCT_ID, LOT_ID, LOCATION_ID, LOCGROUP, LOCTYPE, PICKTYPE, ALLOCTYPE, TAGCD, ACTUALTAGCD, FROM_LOCATION_ID, FROMTAGCD, TO_LOCATION_ID, TOTAGCD, EXPECTQTY1, PICKEDQTY1, PALLETTYPE, SORTEDQTY1, SHIPPEDQTY1, RCVKEY, RCVLINENO, PICKUSERCD, LOTRESERVEFLG, LABELPRINTEDFLG, ALLOCSTYLETYPE, FULLPALLETKEY, PICKINGUNIT, WORKALLOCATEID, WORKALLOCATENAME, ALERTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_DETAIL_ID
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
 * Long pickingInstDetailId = entity.getPickingInstDetailId();
 * Long pickingInstId = entity.getPickingInstId();
 * Long pickbatchlineno = entity.getPickbatchlineno();
 * Long soid = entity.getSoid();
 * Long sodetailid = entity.getSodetailid();
 * Long sts = entity.getSts();
 * Long productId = entity.getProductId();
 * Long ifProductId = entity.getIfProductId();
 * Long lotId = entity.getLotId();
 * Long locationId = entity.getLocationId();
 * String locgroup = entity.getLocgroup();
 * String loctype = entity.getLoctype();
 * String picktype = entity.getPicktype();
 * String alloctype = entity.getAlloctype();
 * String tagcd = entity.getTagcd();
 * String actualtagcd = entity.getActualtagcd();
 * Long fromLocationId = entity.getFromLocationId();
 * String fromtagcd = entity.getFromtagcd();
 * Long toLocationId = entity.getToLocationId();
 * String totagcd = entity.getTotagcd();
 * Long expectqty1 = entity.getExpectqty1();
 * Long pickedqty1 = entity.getPickedqty1();
 * Long pallettype = entity.getPallettype();
 * Long sortedqty1 = entity.getSortedqty1();
 * Long shippedqty1 = entity.getShippedqty1();
 * Long rcvkey = entity.getRcvkey();
 * Long rcvlineno = entity.getRcvlineno();
 * String pickusercd = entity.getPickusercd();
 * Long lotreserveflg = entity.getLotreserveflg();
 * Long labelprintedflg = entity.getLabelprintedflg();
 * Long allocstyletype = entity.getAllocstyletype();
 * Long fullpalletkey = entity.getFullpalletkey();
 * Long pickingunit = entity.getPickingunit();
 * Long workallocateid = entity.getWorkallocateid();
 * String workallocatename = entity.getWorkallocatename();
 * Long alertflg = entity.getAlertflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPickingInstDetailId(pickingInstDetailId);
 * entity.setPickingInstId(pickingInstId);
 * entity.setPickbatchlineno(pickbatchlineno);
 * entity.setSoid(soid);
 * entity.setSodetailid(sodetailid);
 * entity.setSts(sts);
 * entity.setProductId(productId);
 * entity.setIfProductId(ifProductId);
 * entity.setLotId(lotId);
 * entity.setLocationId(locationId);
 * entity.setLocgroup(locgroup);
 * entity.setLoctype(loctype);
 * entity.setPicktype(picktype);
 * entity.setAlloctype(alloctype);
 * entity.setTagcd(tagcd);
 * entity.setActualtagcd(actualtagcd);
 * entity.setFromLocationId(fromLocationId);
 * entity.setFromtagcd(fromtagcd);
 * entity.setToLocationId(toLocationId);
 * entity.setTotagcd(totagcd);
 * entity.setExpectqty1(expectqty1);
 * entity.setPickedqty1(pickedqty1);
 * entity.setPallettype(pallettype);
 * entity.setSortedqty1(sortedqty1);
 * entity.setShippedqty1(shippedqty1);
 * entity.setRcvkey(rcvkey);
 * entity.setRcvlineno(rcvlineno);
 * entity.setPickusercd(pickusercd);
 * entity.setLotreserveflg(lotreserveflg);
 * entity.setLabelprintedflg(labelprintedflg);
 * entity.setAllocstyletype(allocstyletype);
 * entity.setFullpalletkey(fullpalletkey);
 * entity.setPickingunit(pickingunit);
 * entity.setWorkallocateid(workallocateid);
 * entity.setWorkallocatename(workallocatename);
 * entity.setAlertflg(alertflg);
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
public abstract class BsTBtrpickdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _pickingInstDetailId;

    /** PICKING_INST_ID: {NotNull, bigint(19)} */
    protected Long _pickingInstId;

    /** PICKBATCHLINENO: {bigint(19)} */
    protected Long _pickbatchlineno;

    /** SOID: {NotNull, bigint(19)} */
    protected Long _soid;

    /** SODETAILID: {IX, NotNull, bigint(19)} */
    protected Long _sodetailid;

    /** STS: {IX, NotNull, bigint(19)} */
    protected Long _sts;

    /** PRODUCT_ID: {IX, NotNull, bigint(19)} */
    protected Long _productId;

    /** IF_PRODUCT_ID: {bigint(19)} */
    protected Long _ifProductId;

    /** LOT_ID: {IX, bigint(19)} */
    protected Long _lotId;

    /** LOCATION_ID: {IX, NotNull, bigint(19)} */
    protected Long _locationId;

    /** LOCGROUP: {varchar(60)} */
    protected String _locgroup;

    /** LOCTYPE: {varchar(30)} */
    protected String _loctype;

    /** PICKTYPE: {varchar(30)} */
    protected String _picktype;

    /** ALLOCTYPE: {varchar(30)} */
    protected String _alloctype;

    /** TAGCD: {NotNull, varchar(30)} */
    protected String _tagcd;

    /** ACTUALTAGCD: {varchar(30)} */
    protected String _actualtagcd;

    /** FROM_LOCATION_ID: {bigint(19)} */
    protected Long _fromLocationId;

    /** FROMTAGCD: {varchar(30)} */
    protected String _fromtagcd;

    /** TO_LOCATION_ID: {bigint(19)} */
    protected Long _toLocationId;

    /** TOTAGCD: {varchar(30)} */
    protected String _totagcd;

    /** EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectqty1;

    /** PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _pickedqty1;

    /** PALLETTYPE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _pallettype;

    /** SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _sortedqty1;

    /** SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _shippedqty1;

    /** RCVKEY: {IX+, bigint(19)} */
    protected Long _rcvkey;

    /** RCVLINENO: {bigint(19)} */
    protected Long _rcvlineno;

    /** PICKUSERCD: {varchar(30)} */
    protected String _pickusercd;

    /** LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]} */
    protected Long _lotreserveflg;

    /** LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]} */
    protected Long _labelprintedflg;

    /** ALLOCSTYLETYPE: {bigint(19)} */
    protected Long _allocstyletype;

    /** FULLPALLETKEY: {bigint(19)} */
    protected Long _fullpalletkey;

    /** PICKINGUNIT: {bigint(19)} */
    protected Long _pickingunit;

    /** WORKALLOCATEID: {IX, bigint(19)} */
    protected Long _workallocateid;

    /** WORKALLOCATENAME: {varchar(100)} */
    protected String _workallocatename;

    /** ALERTFLG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _alertflg;

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
        return "T_BTRPICKDETAIL";
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
        if (_pickingInstDetailId == null) { return false; }
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
        if (obj instanceof BsTBtrpickdetail) {
            BsTBtrpickdetail other = (BsTBtrpickdetail)obj;
            if (!xSV(_pickingInstDetailId, other._pickingInstDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingInstDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingInstDetailId));
        sb.append(dm).append(xfND(_pickingInstId));
        sb.append(dm).append(xfND(_pickbatchlineno));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_sodetailid));
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_ifProductId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locgroup));
        sb.append(dm).append(xfND(_loctype));
        sb.append(dm).append(xfND(_picktype));
        sb.append(dm).append(xfND(_alloctype));
        sb.append(dm).append(xfND(_tagcd));
        sb.append(dm).append(xfND(_actualtagcd));
        sb.append(dm).append(xfND(_fromLocationId));
        sb.append(dm).append(xfND(_fromtagcd));
        sb.append(dm).append(xfND(_toLocationId));
        sb.append(dm).append(xfND(_totagcd));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_pickedqty1));
        sb.append(dm).append(xfND(_pallettype));
        sb.append(dm).append(xfND(_sortedqty1));
        sb.append(dm).append(xfND(_shippedqty1));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_pickusercd));
        sb.append(dm).append(xfND(_lotreserveflg));
        sb.append(dm).append(xfND(_labelprintedflg));
        sb.append(dm).append(xfND(_allocstyletype));
        sb.append(dm).append(xfND(_fullpalletkey));
        sb.append(dm).append(xfND(_pickingunit));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_workallocatename));
        sb.append(dm).append(xfND(_alertflg));
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
    public TBtrpickdetail clone() {
        return (TBtrpickdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示明細ID
     * @return The value of the column 'PICKING_INST_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingInstDetailId() {
        checkSpecifiedProperty("pickingInstDetailId");
        return _pickingInstDetailId;
    }

    /**
     * [set] PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示明細ID
     * @param pickingInstDetailId The value of the column 'PICKING_INST_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingInstDetailId(Long pickingInstDetailId) {
        registerModifiedProperty("pickingInstDetailId");
        _pickingInstDetailId = pickingInstDetailId;
    }

    /**
     * [get] PICKING_INST_ID: {NotNull, bigint(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingInstId() {
        checkSpecifiedProperty("pickingInstId");
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {NotNull, bigint(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingInstId(Long pickingInstId) {
        registerModifiedProperty("pickingInstId");
        _pickingInstId = pickingInstId;
    }

    /**
     * [get] PICKBATCHLINENO: {bigint(19)} <br>
     * 引当バッチ行№
     * @return The value of the column 'PICKBATCHLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickbatchlineno() {
        checkSpecifiedProperty("pickbatchlineno");
        return _pickbatchlineno;
    }

    /**
     * [set] PICKBATCHLINENO: {bigint(19)} <br>
     * 引当バッチ行№
     * @param pickbatchlineno The value of the column 'PICKBATCHLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickbatchlineno(Long pickbatchlineno) {
        registerModifiedProperty("pickbatchlineno");
        _pickbatchlineno = pickbatchlineno;
    }

    /**
     * [get] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (basically NotNull if update: for the constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SODETAILID: {IX, NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSodetailid() {
        checkSpecifiedProperty("sodetailid");
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {IX, NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (basically NotNull if update: for the constraint)
     */
    public void setSodetailid(Long sodetailid) {
        registerModifiedProperty("sodetailid");
        _sodetailid = sodetailid;
    }

    /**
     * [get] STS: {IX, NotNull, bigint(19)} <br>
     * 出荷ステータス
     * @return The value of the column 'STS'. (basically NotNull if selected: for the constraint)
     */
    public Long getSts() {
        checkSpecifiedProperty("sts");
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, bigint(19)} <br>
     * 出荷ステータス
     * @param sts The value of the column 'STS'. (basically NotNull if update: for the constraint)
     */
    public void setSts(Long sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] IF_PRODUCT_ID: {bigint(19)} <br>
     * I/F銘柄ID
     * @return The value of the column 'IF_PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getIfProductId() {
        checkSpecifiedProperty("ifProductId");
        return _ifProductId;
    }

    /**
     * [set] IF_PRODUCT_ID: {bigint(19)} <br>
     * I/F銘柄ID
     * @param ifProductId The value of the column 'IF_PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfProductId(Long ifProductId) {
        registerModifiedProperty("ifProductId");
        _ifProductId = ifProductId;
    }

    /**
     * [get] LOT_ID: {IX, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOCATION_ID: {IX, NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCGROUP: {varchar(60)} <br>
     * ロケグループ
     * @return The value of the column 'LOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocgroup() {
        checkSpecifiedProperty("locgroup");
        return convertEmptyToNull(_locgroup);
    }

    /**
     * [set] LOCGROUP: {varchar(60)} <br>
     * ロケグループ
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocgroup(String locgroup) {
        registerModifiedProperty("locgroup");
        _locgroup = locgroup;
    }

    /**
     * [get] LOCTYPE: {varchar(30)} <br>
     * ロケタイプ
     * @return The value of the column 'LOCTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoctype() {
        checkSpecifiedProperty("loctype");
        return convertEmptyToNull(_loctype);
    }

    /**
     * [set] LOCTYPE: {varchar(30)} <br>
     * ロケタイプ
     * @param loctype The value of the column 'LOCTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoctype(String loctype) {
        registerModifiedProperty("loctype");
        _loctype = loctype;
    }

    /**
     * [get] PICKTYPE: {varchar(30)} <br>
     * ピッキングタイプ
     * @return The value of the column 'PICKTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicktype() {
        checkSpecifiedProperty("picktype");
        return convertEmptyToNull(_picktype);
    }

    /**
     * [set] PICKTYPE: {varchar(30)} <br>
     * ピッキングタイプ
     * @param picktype The value of the column 'PICKTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicktype(String picktype) {
        registerModifiedProperty("picktype");
        _picktype = picktype;
    }

    /**
     * [get] ALLOCTYPE: {varchar(30)} <br>
     * 引当タイプ
     * @return The value of the column 'ALLOCTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getAlloctype() {
        checkSpecifiedProperty("alloctype");
        return convertEmptyToNull(_alloctype);
    }

    /**
     * [set] ALLOCTYPE: {varchar(30)} <br>
     * 引当タイプ
     * @param alloctype The value of the column 'ALLOCTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAlloctype(String alloctype) {
        registerModifiedProperty("alloctype");
        _alloctype = alloctype;
    }

    /**
     * [get] TAGCD: {NotNull, varchar(30)} <br>
     * タグCD
     * @return The value of the column 'TAGCD'. (basically NotNull if selected: for the constraint)
     */
    public String getTagcd() {
        checkSpecifiedProperty("tagcd");
        return convertEmptyToNull(_tagcd);
    }

    /**
     * [set] TAGCD: {NotNull, varchar(30)} <br>
     * タグCD
     * @param tagcd The value of the column 'TAGCD'. (basically NotNull if update: for the constraint)
     */
    public void setTagcd(String tagcd) {
        registerModifiedProperty("tagcd");
        _tagcd = tagcd;
    }

    /**
     * [get] ACTUALTAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @return The value of the column 'ACTUALTAGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getActualtagcd() {
        checkSpecifiedProperty("actualtagcd");
        return convertEmptyToNull(_actualtagcd);
    }

    /**
     * [set] ACTUALTAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @param actualtagcd The value of the column 'ACTUALTAGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setActualtagcd(String actualtagcd) {
        registerModifiedProperty("actualtagcd");
        _actualtagcd = actualtagcd;
    }

    /**
     * [get] FROM_LOCATION_ID: {bigint(19)} <br>
     * ＦｒｏｍロケID
     * @return The value of the column 'FROM_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFromLocationId() {
        checkSpecifiedProperty("fromLocationId");
        return _fromLocationId;
    }

    /**
     * [set] FROM_LOCATION_ID: {bigint(19)} <br>
     * ＦｒｏｍロケID
     * @param fromLocationId The value of the column 'FROM_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromLocationId(Long fromLocationId) {
        registerModifiedProperty("fromLocationId");
        _fromLocationId = fromLocationId;
    }

    /**
     * [get] FROMTAGCD: {varchar(30)} <br>
     * ＦｒｏｍタグCD
     * @return The value of the column 'FROMTAGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromtagcd() {
        checkSpecifiedProperty("fromtagcd");
        return convertEmptyToNull(_fromtagcd);
    }

    /**
     * [set] FROMTAGCD: {varchar(30)} <br>
     * ＦｒｏｍタグCD
     * @param fromtagcd The value of the column 'FROMTAGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromtagcd(String fromtagcd) {
        registerModifiedProperty("fromtagcd");
        _fromtagcd = fromtagcd;
    }

    /**
     * [get] TO_LOCATION_ID: {bigint(19)} <br>
     * ＴｏロケID
     * @return The value of the column 'TO_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getToLocationId() {
        checkSpecifiedProperty("toLocationId");
        return _toLocationId;
    }

    /**
     * [set] TO_LOCATION_ID: {bigint(19)} <br>
     * ＴｏロケID
     * @param toLocationId The value of the column 'TO_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToLocationId(Long toLocationId) {
        registerModifiedProperty("toLocationId");
        _toLocationId = toLocationId;
    }

    /**
     * [get] TOTAGCD: {varchar(30)} <br>
     * ＴｏタグCD
     * @return The value of the column 'TOTAGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotagcd() {
        checkSpecifiedProperty("totagcd");
        return convertEmptyToNull(_totagcd);
    }

    /**
     * [set] TOTAGCD: {varchar(30)} <br>
     * ＴｏタグCD
     * @param totagcd The value of the column 'TOTAGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotagcd(String totagcd) {
        registerModifiedProperty("totagcd");
        _totagcd = totagcd;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量１（バラ）
     * @return The value of the column 'EXPECTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング予定数量１（バラ）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty1(Long expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @return The value of the column 'PICKEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedqty1() {
        checkSpecifiedProperty("pickedqty1");
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setPickedqty1(Long pickedqty1) {
        registerModifiedProperty("pickedqty1");
        _pickedqty1 = pickedqty1;
    }

    /**
     * [get] PALLETTYPE: {NotNull, bigint(19), default=[(0)]} <br>
     * 単品・端数区分
     * @return The value of the column 'PALLETTYPE'. (basically NotNull if selected: for the constraint)
     */
    public Long getPallettype() {
        checkSpecifiedProperty("pallettype");
        return _pallettype;
    }

    /**
     * [set] PALLETTYPE: {NotNull, bigint(19), default=[(0)]} <br>
     * 単品・端数区分
     * @param pallettype The value of the column 'PALLETTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setPallettype(Long pallettype) {
        registerModifiedProperty("pallettype");
        _pallettype = pallettype;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortedqty1() {
        checkSpecifiedProperty("sortedqty1");
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setSortedqty1(Long sortedqty1) {
        registerModifiedProperty("sortedqty1");
        _sortedqty1 = sortedqty1;
    }

    /**
     * [get] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @return The value of the column 'SHIPPEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippedqty1() {
        checkSpecifiedProperty("shippedqty1");
        return _shippedqty1;
    }

    /**
     * [set] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @param shippedqty1 The value of the column 'SHIPPEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setShippedqty1(Long shippedqty1) {
        registerModifiedProperty("shippedqty1");
        _shippedqty1 = shippedqty1;
    }

    /**
     * [get] RCVKEY: {IX+, bigint(19)} <br>
     * クロスドック入庫予定ヘッダID
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {IX+, bigint(19)} <br>
     * クロスドック入庫予定ヘッダID
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(Long rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] RCVLINENO: {bigint(19)} <br>
     * クロスドック入庫予定ボディID
     * @return The value of the column 'RCVLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {bigint(19)} <br>
     * クロスドック入庫予定ボディID
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] PICKUSERCD: {varchar(30)} <br>
     * ピッキング担当者
     * @return The value of the column 'PICKUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickusercd() {
        checkSpecifiedProperty("pickusercd");
        return convertEmptyToNull(_pickusercd);
    }

    /**
     * [set] PICKUSERCD: {varchar(30)} <br>
     * ピッキング担当者
     * @param pickusercd The value of the column 'PICKUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickusercd(String pickusercd) {
        registerModifiedProperty("pickusercd");
        _pickusercd = pickusercd;
    }

    /**
     * [get] LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * ロット指定フラグ
     * @return The value of the column 'LOTRESERVEFLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotreserveflg() {
        checkSpecifiedProperty("lotreserveflg");
        return _lotreserveflg;
    }

    /**
     * [set] LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * ロット指定フラグ
     * @param lotreserveflg The value of the column 'LOTRESERVEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLotreserveflg(Long lotreserveflg) {
        registerModifiedProperty("lotreserveflg");
        _lotreserveflg = lotreserveflg;
    }

    /**
     * [get] LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 棚出リスト出力済区分
     * @return The value of the column 'LABELPRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getLabelprintedflg() {
        checkSpecifiedProperty("labelprintedflg");
        return _labelprintedflg;
    }

    /**
     * [set] LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]} <br>
     * 棚出リスト出力済区分
     * @param labelprintedflg The value of the column 'LABELPRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setLabelprintedflg(Long labelprintedflg) {
        registerModifiedProperty("labelprintedflg");
        _labelprintedflg = labelprintedflg;
    }

    /**
     * [get] ALLOCSTYLETYPE: {bigint(19)} <br>
     * 引当単位タイプ
     * @return The value of the column 'ALLOCSTYLETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocstyletype() {
        checkSpecifiedProperty("allocstyletype");
        return _allocstyletype;
    }

    /**
     * [set] ALLOCSTYLETYPE: {bigint(19)} <br>
     * 引当単位タイプ
     * @param allocstyletype The value of the column 'ALLOCSTYLETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocstyletype(Long allocstyletype) {
        registerModifiedProperty("allocstyletype");
        _allocstyletype = allocstyletype;
    }

    /**
     * [get] FULLPALLETKEY: {bigint(19)} <br>
     * フルパレットキー
     * @return The value of the column 'FULLPALLETKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFullpalletkey() {
        checkSpecifiedProperty("fullpalletkey");
        return _fullpalletkey;
    }

    /**
     * [set] FULLPALLETKEY: {bigint(19)} <br>
     * フルパレットキー
     * @param fullpalletkey The value of the column 'FULLPALLETKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFullpalletkey(Long fullpalletkey) {
        registerModifiedProperty("fullpalletkey");
        _fullpalletkey = fullpalletkey;
    }

    /**
     * [get] PICKINGUNIT: {bigint(19)} <br>
     * ピッキング単位
     * @return The value of the column 'PICKINGUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingunit() {
        checkSpecifiedProperty("pickingunit");
        return _pickingunit;
    }

    /**
     * [set] PICKINGUNIT: {bigint(19)} <br>
     * ピッキング単位
     * @param pickingunit The value of the column 'PICKINGUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingunit(Long pickingunit) {
        registerModifiedProperty("pickingunit");
        _pickingunit = pickingunit;
    }

    /**
     * [get] WORKALLOCATEID: {IX, bigint(19)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {IX, bigint(19)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkallocateid(Long workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
    }

    /**
     * [get] WORKALLOCATENAME: {varchar(100)} <br>
     * 作業割付名称
     * @return The value of the column 'WORKALLOCATENAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkallocatename() {
        checkSpecifiedProperty("workallocatename");
        return convertEmptyToNull(_workallocatename);
    }

    /**
     * [set] WORKALLOCATENAME: {varchar(100)} <br>
     * 作業割付名称
     * @param workallocatename The value of the column 'WORKALLOCATENAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkallocatename(String workallocatename) {
        registerModifiedProperty("workallocatename");
        _workallocatename = workallocatename;
    }

    /**
     * [get] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @return The value of the column 'ALERTFLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getAlertflg() {
        checkSpecifiedProperty("alertflg");
        return _alertflg;
    }

    /**
     * [set] ALERTFLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング不足フラグ
     * @param alertflg The value of the column 'ALERTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setAlertflg(Long alertflg) {
        registerModifiedProperty("alertflg");
        _alertflg = alertflg;
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
