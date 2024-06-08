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
 * The entity of T_TRSHIPINSPECTRMDR as TABLE. <br>
 * 出庫検品残
 * <pre>
 * [primary-key]
 *     SHIPPING_INSPECTION_REMAINING_ID
 *
 * [column]
 *     SHIPPING_INSPECTION_REMAINING_ID, SHIPINSPECTRMDRKEY, PICKING_INST_DETAIL_ID, TAGCD, ROOTPACKKEY, PACKKEY, SOID, SODETAILID, DELIVERYGROUPKEY, WBKEY, WAREHOUSECD, PRODUCT_ID, LOT_ID, INSPECTEDQTY1, EXPECTQTY1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INSPECTION_REMAINING_ID
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
 * Long shippingInspectionRemainingId = entity.getShippingInspectionRemainingId();
 * Long shipinspectrmdrkey = entity.getShipinspectrmdrkey();
 * Long pickingInstDetailId = entity.getPickingInstDetailId();
 * String tagcd = entity.getTagcd();
 * Long rootpackkey = entity.getRootpackkey();
 * Long packkey = entity.getPackkey();
 * Long soid = entity.getSoid();
 * Long sodetailid = entity.getSodetailid();
 * Long deliverygroupkey = entity.getDeliverygroupkey();
 * Long wbkey = entity.getWbkey();
 * String warehousecd = entity.getWarehousecd();
 * Long productId = entity.getProductId();
 * Long lotId = entity.getLotId();
 * Long inspectedqty1 = entity.getInspectedqty1();
 * Long expectqty1 = entity.getExpectqty1();
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
 * entity.setShippingInspectionRemainingId(shippingInspectionRemainingId);
 * entity.setShipinspectrmdrkey(shipinspectrmdrkey);
 * entity.setPickingInstDetailId(pickingInstDetailId);
 * entity.setTagcd(tagcd);
 * entity.setRootpackkey(rootpackkey);
 * entity.setPackkey(packkey);
 * entity.setSoid(soid);
 * entity.setSodetailid(sodetailid);
 * entity.setDeliverygroupkey(deliverygroupkey);
 * entity.setWbkey(wbkey);
 * entity.setWarehousecd(warehousecd);
 * entity.setProductId(productId);
 * entity.setLotId(lotId);
 * entity.setInspectedqty1(inspectedqty1);
 * entity.setExpectqty1(expectqty1);
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
public abstract class BsTTrshipinspectrmdr extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INSPECTION_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shippingInspectionRemainingId;

    /** SHIPINSPECTRMDRKEY: {NotNull, bigint(19)} */
    protected Long _shipinspectrmdrkey;

    /** PICKING_INST_DETAIL_ID: {IX, bigint(19)} */
    protected Long _pickingInstDetailId;

    /** TAGCD: {varchar(30)} */
    protected String _tagcd;

    /** ROOTPACKKEY: {bigint(19)} */
    protected Long _rootpackkey;

    /** PACKKEY: {bigint(19)} */
    protected Long _packkey;

    /** SOID: {IX+, NotNull, bigint(19)} */
    protected Long _soid;

    /** SODETAILID: {NotNull, bigint(19)} */
    protected Long _sodetailid;

    /** DELIVERYGROUPKEY: {IX, bigint(19)} */
    protected Long _deliverygroupkey;

    /** WBKEY: {IX, bigint(19)} */
    protected Long _wbkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    protected Long _productId;

    /** LOT_ID: {IX, NotNull, bigint(19)} */
    protected Long _lotId;

    /** INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _inspectedqty1;

    /** EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectqty1;

    /** CENTER_ID: {IX+, NotNull, bigint(19)} */
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
        return "T_TRSHIPINSPECTRMDR";
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
        if (_shippingInspectionRemainingId == null) { return false; }
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
        if (obj instanceof BsTTrshipinspectrmdr) {
            BsTTrshipinspectrmdr other = (BsTTrshipinspectrmdr)obj;
            if (!xSV(_shippingInspectionRemainingId, other._shippingInspectionRemainingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInspectionRemainingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInspectionRemainingId));
        sb.append(dm).append(xfND(_shipinspectrmdrkey));
        sb.append(dm).append(xfND(_pickingInstDetailId));
        sb.append(dm).append(xfND(_tagcd));
        sb.append(dm).append(xfND(_rootpackkey));
        sb.append(dm).append(xfND(_packkey));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_sodetailid));
        sb.append(dm).append(xfND(_deliverygroupkey));
        sb.append(dm).append(xfND(_wbkey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_inspectedqty1));
        sb.append(dm).append(xfND(_expectqty1));
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
    public TTrshipinspectrmdr clone() {
        return (TTrshipinspectrmdr)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INSPECTION_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫検品残ID
     * @return The value of the column 'SHIPPING_INSPECTION_REMAINING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInspectionRemainingId() {
        checkSpecifiedProperty("shippingInspectionRemainingId");
        return _shippingInspectionRemainingId;
    }

    /**
     * [set] SHIPPING_INSPECTION_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫検品残ID
     * @param shippingInspectionRemainingId The value of the column 'SHIPPING_INSPECTION_REMAINING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInspectionRemainingId(Long shippingInspectionRemainingId) {
        registerModifiedProperty("shippingInspectionRemainingId");
        _shippingInspectionRemainingId = shippingInspectionRemainingId;
    }

    /**
     * [get] SHIPINSPECTRMDRKEY: {NotNull, bigint(19)} <br>
     * 出庫検品残Ｋｅｙ
     * @return The value of the column 'SHIPINSPECTRMDRKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getShipinspectrmdrkey() {
        checkSpecifiedProperty("shipinspectrmdrkey");
        return _shipinspectrmdrkey;
    }

    /**
     * [set] SHIPINSPECTRMDRKEY: {NotNull, bigint(19)} <br>
     * 出庫検品残Ｋｅｙ
     * @param shipinspectrmdrkey The value of the column 'SHIPINSPECTRMDRKEY'. (basically NotNull if update: for the constraint)
     */
    public void setShipinspectrmdrkey(Long shipinspectrmdrkey) {
        registerModifiedProperty("shipinspectrmdrkey");
        _shipinspectrmdrkey = shipinspectrmdrkey;
    }

    /**
     * [get] PICKING_INST_DETAIL_ID: {IX, bigint(19)} <br>
     * ピッキング指示明細ID
     * @return The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingInstDetailId() {
        checkSpecifiedProperty("pickingInstDetailId");
        return _pickingInstDetailId;
    }

    /**
     * [set] PICKING_INST_DETAIL_ID: {IX, bigint(19)} <br>
     * ピッキング指示明細ID
     * @param pickingInstDetailId The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingInstDetailId(Long pickingInstDetailId) {
        registerModifiedProperty("pickingInstDetailId");
        _pickingInstDetailId = pickingInstDetailId;
    }

    /**
     * [get] TAGCD: {varchar(30)} <br>
     * 仕分タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagcd() {
        checkSpecifiedProperty("tagcd");
        return convertEmptyToNull(_tagcd);
    }

    /**
     * [set] TAGCD: {varchar(30)} <br>
     * 仕分タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagcd(String tagcd) {
        registerModifiedProperty("tagcd");
        _tagcd = tagcd;
    }

    /**
     * [get] ROOTPACKKEY: {bigint(19)} <br>
     * ルート梱包Ｋｅｙ
     * @return The value of the column 'ROOTPACKKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRootpackkey() {
        checkSpecifiedProperty("rootpackkey");
        return _rootpackkey;
    }

    /**
     * [set] ROOTPACKKEY: {bigint(19)} <br>
     * ルート梱包Ｋｅｙ
     * @param rootpackkey The value of the column 'ROOTPACKKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRootpackkey(Long rootpackkey) {
        registerModifiedProperty("rootpackkey");
        _rootpackkey = rootpackkey;
    }

    /**
     * [get] PACKKEY: {bigint(19)} <br>
     * 梱包Ｋｅｙ
     * @return The value of the column 'PACKKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackkey() {
        checkSpecifiedProperty("packkey");
        return _packkey;
    }

    /**
     * [set] PACKKEY: {bigint(19)} <br>
     * 梱包Ｋｅｙ
     * @param packkey The value of the column 'PACKKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackkey(Long packkey) {
        registerModifiedProperty("packkey");
        _packkey = packkey;
    }

    /**
     * [get] SOID: {IX+, NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {IX+, NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (basically NotNull if update: for the constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SODETAILID: {NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSodetailid() {
        checkSpecifiedProperty("sodetailid");
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {NotNull, bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (basically NotNull if update: for the constraint)
     */
    public void setSodetailid(Long sodetailid) {
        registerModifiedProperty("sodetailid");
        _sodetailid = sodetailid;
    }

    /**
     * [get] DELIVERYGROUPKEY: {IX, bigint(19)} <br>
     * 配送グループＫｅｙ
     * @return The value of the column 'DELIVERYGROUPKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliverygroupkey() {
        checkSpecifiedProperty("deliverygroupkey");
        return _deliverygroupkey;
    }

    /**
     * [set] DELIVERYGROUPKEY: {IX, bigint(19)} <br>
     * 配送グループＫｅｙ
     * @param deliverygroupkey The value of the column 'DELIVERYGROUPKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverygroupkey(Long deliverygroupkey) {
        registerModifiedProperty("deliverygroupkey");
        _deliverygroupkey = deliverygroupkey;
    }

    /**
     * [get] WBKEY: {IX, bigint(19)} <br>
     * 送り状Ｋｅｙ
     * @return The value of the column 'WBKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWbkey() {
        checkSpecifiedProperty("wbkey");
        return _wbkey;
    }

    /**
     * [set] WBKEY: {IX, bigint(19)} <br>
     * 送り状Ｋｅｙ
     * @param wbkey The value of the column 'WBKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWbkey(Long wbkey) {
        registerModifiedProperty("wbkey");
        _wbkey = wbkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
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
     * [get] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @return The value of the column 'INSPECTEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getInspectedqty1() {
        checkSpecifiedProperty("inspectedqty1");
        return _inspectedqty1;
    }

    /**
     * [set] INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @param inspectedqty1 The value of the column 'INSPECTEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setInspectedqty1(Long inspectedqty1) {
        registerModifiedProperty("inspectedqty1");
        _inspectedqty1 = inspectedqty1;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品予定数量１（バラ）
     * @return The value of the column 'EXPECTQTY1'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品予定数量１（バラ）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty1(Long expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] CENTER_ID: {IX+, NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX+, NotNull, bigint(19)} <br>
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
