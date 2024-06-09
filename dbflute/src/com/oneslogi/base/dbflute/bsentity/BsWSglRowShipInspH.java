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
 * The entity of W_SGL_ROW_SHIP_INSP_H as TABLE. <br>
 * 単行出荷検品ワークヘッダ
 * <pre>
 * [primary-key]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_H_ID, CLIENT_ID, CENTER_ID, PICKING_GROUP_NO, TEMP_NO, PRODUCT_ID, WORK_INST_NUM, SLIP_NUM, INSPECTED_SLIP_NUM, BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_BOX, M_CENTER, M_CLIENT, M_PRODUCT
 *
 * [referrer table]
 *     W_SGL_ROW_SHIP_INSP_B
 *
 * [foreign property]
 *     mBox, mCenter, mClient, mProduct
 *
 * [referrer property]
 *     wSglRowShipInspBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long sglRowShipInspHId = entity.getSglRowShipInspHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String pickingGroupNo = entity.getPickingGroupNo();
 * String tempNo = entity.getTempNo();
 * Long productId = entity.getProductId();
 * Long workInstNum = entity.getWorkInstNum();
 * Long slipNum = entity.getSlipNum();
 * Long inspectedSlipNum = entity.getInspectedSlipNum();
 * Long boxId = entity.getBoxId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSglRowShipInspHId(sglRowShipInspHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setPickingGroupNo(pickingGroupNo);
 * entity.setTempNo(tempNo);
 * entity.setProductId(productId);
 * entity.setWorkInstNum(workInstNum);
 * entity.setSlipNum(slipNum);
 * entity.setInspectedSlipNum(inspectedSlipNum);
 * entity.setBoxId(boxId);
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
public abstract class BsWSglRowShipInspH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sglRowShipInspHId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} */
    protected String _pickingGroupNo;

    /** TEMP_NO: {+UQ, NotNull, varchar(30)} */
    protected String _tempNo;

    /** PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** WORK_INST_NUM: {+UQ, NotNull, bigint(19)} */
    protected Long _workInstNum;

    /** SLIP_NUM: {bigint(19)} */
    protected Long _slipNum;

    /** INSPECTED_SLIP_NUM: {bigint(19)} */
    protected Long _inspectedSlipNum;

    /** BOX_ID: {IX, bigint(19), FK to M_BOX} */
    protected Long _boxId;

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
        return "W_SGL_ROW_SHIP_INSP_H";
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
        if (_sglRowShipInspHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param centerId : +UQ, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param pickingGroupNo : +UQ, NotNull, varchar(30). (NotNull)
     * @param tempNo : +UQ, NotNull, varchar(30). (NotNull)
     * @param productId : +UQ, IX, NotNull, bigint(19), FK to M_PRODUCT. (NotNull)
     * @param workInstNum : +UQ, NotNull, bigint(19). (NotNull)
     */
    public void uniqueBy(Long clientId, Long centerId, String pickingGroupNo, String tempNo, Long productId, Long workInstNum) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("pickingGroupNo");
        __uniqueDrivenProperties.addPropertyName("tempNo");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("workInstNum");
        setClientId(clientId);setCenterId(centerId);setPickingGroupNo(pickingGroupNo);setTempNo(tempNo);setProductId(productId);setWorkInstNum(workInstNum);
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
    /** M_BOX by my BOX_ID, named 'MBox'. */
    protected MBox _mBox;

    /**
     * [get] M_BOX by my BOX_ID, named 'MBox'. <br>
     * @return The entity of foreign property 'MBox'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MBox getMBox() {
        return _mBox;
    }

    /**
     * [set] M_BOX by my BOX_ID, named 'MBox'.
     * @param mBox The entity of foreign property 'MBox'. (NullAllowed)
     */
    public void setMBox(MBox mBox) {
        _mBox = mBox;
    }

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

    /** M_PRODUCT by my PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] M_PRODUCT by my PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'. */
    protected List<WSglRowShipInspB> _wSglRowShipInspBList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'.
     * @return The entity list of referrer property 'WSglRowShipInspBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspB> getWSglRowShipInspBList() {
        if (_wSglRowShipInspBList == null) { _wSglRowShipInspBList = newReferrerList(); }
        return _wSglRowShipInspBList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'.
     * @param wSglRowShipInspBList The entity list of referrer property 'WSglRowShipInspBList'. (NullAllowed)
     */
    public void setWSglRowShipInspBList(List<WSglRowShipInspB> wSglRowShipInspBList) {
        _wSglRowShipInspBList = wSglRowShipInspBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWSglRowShipInspH) {
            BsWSglRowShipInspH other = (BsWSglRowShipInspH)obj;
            if (!xSV(_sglRowShipInspHId, other._sglRowShipInspHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sglRowShipInspHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mBox != null)
        { sb.append(li).append(xbRDS(_mBox, "mBox")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_wSglRowShipInspBList != null) { for (WSglRowShipInspB et : _wSglRowShipInspBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sglRowShipInspHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_pickingGroupNo));
        sb.append(dm).append(xfND(_tempNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_workInstNum));
        sb.append(dm).append(xfND(_slipNum));
        sb.append(dm).append(xfND(_inspectedSlipNum));
        sb.append(dm).append(xfND(_boxId));
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
        if (_mBox != null)
        { sb.append(dm).append("mBox"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_wSglRowShipInspBList != null && !_wSglRowShipInspBList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WSglRowShipInspH clone() {
        return (WSglRowShipInspH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークヘッダID
     * @return The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSglRowShipInspHId() {
        checkSpecifiedProperty("sglRowShipInspHId");
        return _sglRowShipInspHId;
    }

    /**
     * [set] SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークヘッダID
     * @param sglRowShipInspHId The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSglRowShipInspHId(Long sglRowShipInspHId) {
        registerModifiedProperty("sglRowShipInspHId");
        _sglRowShipInspHId = sglRowShipInspHId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} <br>
     * ピッキンググループNo.
     * @return The value of the column 'PICKING_GROUP_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getPickingGroupNo() {
        checkSpecifiedProperty("pickingGroupNo");
        return convertEmptyToNull(_pickingGroupNo);
    }

    /**
     * [set] PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} <br>
     * ピッキンググループNo.
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (basically NotNull if update: for the constraint)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        registerModifiedProperty("pickingGroupNo");
        _pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] TEMP_NO: {+UQ, NotNull, varchar(30)} <br>
     * 仮置きNo.
     * @return The value of the column 'TEMP_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getTempNo() {
        checkSpecifiedProperty("tempNo");
        return convertEmptyToNull(_tempNo);
    }

    /**
     * [set] TEMP_NO: {+UQ, NotNull, varchar(30)} <br>
     * 仮置きNo.
     * @param tempNo The value of the column 'TEMP_NO'. (basically NotNull if update: for the constraint)
     */
    public void setTempNo(String tempNo) {
        registerModifiedProperty("tempNo");
        _tempNo = tempNo;
    }

    /**
     * [get] PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] WORK_INST_NUM: {+UQ, NotNull, bigint(19)} <br>
     * 作業指示数
     * @return The value of the column 'WORK_INST_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Long getWorkInstNum() {
        checkSpecifiedProperty("workInstNum");
        return _workInstNum;
    }

    /**
     * [set] WORK_INST_NUM: {+UQ, NotNull, bigint(19)} <br>
     * 作業指示数
     * @param workInstNum The value of the column 'WORK_INST_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setWorkInstNum(Long workInstNum) {
        registerModifiedProperty("workInstNum");
        _workInstNum = workInstNum;
    }

    /**
     * [get] SLIP_NUM: {bigint(19)} <br>
     * 伝票数
     * @return The value of the column 'SLIP_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlipNum() {
        checkSpecifiedProperty("slipNum");
        return _slipNum;
    }

    /**
     * [set] SLIP_NUM: {bigint(19)} <br>
     * 伝票数
     * @param slipNum The value of the column 'SLIP_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipNum(Long slipNum) {
        registerModifiedProperty("slipNum");
        _slipNum = slipNum;
    }

    /**
     * [get] INSPECTED_SLIP_NUM: {bigint(19)} <br>
     * 検品済伝票数
     * @return The value of the column 'INSPECTED_SLIP_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInspectedSlipNum() {
        checkSpecifiedProperty("inspectedSlipNum");
        return _inspectedSlipNum;
    }

    /**
     * [set] INSPECTED_SLIP_NUM: {bigint(19)} <br>
     * 検品済伝票数
     * @param inspectedSlipNum The value of the column 'INSPECTED_SLIP_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectedSlipNum(Long inspectedSlipNum) {
        registerModifiedProperty("inspectedSlipNum");
        _inspectedSlipNum = inspectedSlipNum;
    }

    /**
     * [get] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxId() {
        checkSpecifiedProperty("boxId");
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxId(Long boxId) {
        registerModifiedProperty("boxId");
        _boxId = boxId;
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
