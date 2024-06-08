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
 * The entity of W_REPLENISH_INST_INPUT as TABLE. <br>
 * 融通指示一括取込ワーク
 * <pre>
 * [primary-key]
 *     REPLENISH_INST_INPUT_ID
 *
 * [column]
 *     REPLENISH_INST_INPUT_ID, RECEIVE_CD, CENTER_CD, CLIENT_CD, FLEXLNS_NO, SCH_DATE, SUPPLIER_CD, RCV_DATE, SHIP_CD, ITEM_CD, MANUFACTURE_DATE, DESIGN_CD, QTY, FLEX_UPD_USER_CD, FLEXIBITYNO, TRANSPORTCD, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPLENISH_INST_INPUT_ID
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
 * Long replenishInstInputId = entity.getReplenishInstInputId();
 * String receiveCd = entity.getReceiveCd();
 * String centerCd = entity.getCenterCd();
 * String clientCd = entity.getClientCd();
 * String flexlnsNo = entity.getFlexlnsNo();
 * String schDate = entity.getSchDate();
 * String supplierCd = entity.getSupplierCd();
 * String rcvDate = entity.getRcvDate();
 * String shipCd = entity.getShipCd();
 * String itemCd = entity.getItemCd();
 * String manufactureDate = entity.getManufactureDate();
 * String designCd = entity.getDesignCd();
 * String qty = entity.getQty();
 * String flexUpdUserCd = entity.getFlexUpdUserCd();
 * Long flexibityno = entity.getFlexibityno();
 * String transportcd = entity.getTransportcd();
 * Long lineNo = entity.getLineNo();
 * String workFlg = entity.getWorkFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMsg = entity.getErrorMsg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReplenishInstInputId(replenishInstInputId);
 * entity.setReceiveCd(receiveCd);
 * entity.setCenterCd(centerCd);
 * entity.setClientCd(clientCd);
 * entity.setFlexlnsNo(flexlnsNo);
 * entity.setSchDate(schDate);
 * entity.setSupplierCd(supplierCd);
 * entity.setRcvDate(rcvDate);
 * entity.setShipCd(shipCd);
 * entity.setItemCd(itemCd);
 * entity.setManufactureDate(manufactureDate);
 * entity.setDesignCd(designCd);
 * entity.setQty(qty);
 * entity.setFlexUpdUserCd(flexUpdUserCd);
 * entity.setFlexibityno(flexibityno);
 * entity.setTransportcd(transportcd);
 * entity.setLineNo(lineNo);
 * entity.setWorkFlg(workFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMsg(errorMsg);
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
public abstract class BsWReplenishInstInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _replenishInstInputId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    protected String _receiveCd;

    /** CENTER_CD: {varchar(255)} */
    protected String _centerCd;

    /** CLIENT_CD: {varchar(255)} */
    protected String _clientCd;

    /** FLEXLNS_NO: {varchar(255)} */
    protected String _flexlnsNo;

    /** SCH_DATE: {varchar(255)} */
    protected String _schDate;

    /** SUPPLIER_CD: {varchar(255)} */
    protected String _supplierCd;

    /** RCV_DATE: {varchar(255)} */
    protected String _rcvDate;

    /** SHIP_CD: {varchar(255)} */
    protected String _shipCd;

    /** ITEM_CD: {varchar(255)} */
    protected String _itemCd;

    /** MANUFACTURE_DATE: {varchar(255)} */
    protected String _manufactureDate;

    /** DESIGN_CD: {varchar(255)} */
    protected String _designCd;

    /** QTY: {varchar(255)} */
    protected String _qty;

    /** FLEX_UPD_USER_CD: {varchar(255)} */
    protected String _flexUpdUserCd;

    /** FLEXIBITYNO: {bigint(19)} */
    protected Long _flexibityno;

    /** TRANSPORTCD: {varchar(255)} */
    protected String _transportcd;

    /** LINE_NO: {bigint(19)} */
    protected Long _lineNo;

    /** WORK_FLG: {char(1)} */
    protected String _workFlg;

    /** ERROR_FLG: {char(1)} */
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    protected String _errorMsg;

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
        return "W_REPLENISH_INST_INPUT";
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
        if (_replenishInstInputId == null) { return false; }
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
        if (obj instanceof BsWReplenishInstInput) {
            BsWReplenishInstInput other = (BsWReplenishInstInput)obj;
            if (!xSV(_replenishInstInputId, other._replenishInstInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _replenishInstInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_replenishInstInputId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_flexlnsNo));
        sb.append(dm).append(xfND(_schDate));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_rcvDate));
        sb.append(dm).append(xfND(_shipCd));
        sb.append(dm).append(xfND(_itemCd));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_designCd));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_flexUpdUserCd));
        sb.append(dm).append(xfND(_flexibityno));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMsg));
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
    public WReplenishInstInput clone() {
        return (WReplenishInstInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通指示一括取込ワークID
     * @return The value of the column 'REPLENISH_INST_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplenishInstInputId() {
        checkSpecifiedProperty("replenishInstInputId");
        return _replenishInstInputId;
    }

    /**
     * [set] REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通指示一括取込ワークID
     * @param replenishInstInputId The value of the column 'REPLENISH_INST_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplenishInstInputId(Long replenishInstInputId) {
        registerModifiedProperty("replenishInstInputId");
        _replenishInstInputId = replenishInstInputId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] FLEXLNS_NO: {varchar(255)} <br>
     * 指示No.
     * @return The value of the column 'FLEXLNS_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlexlnsNo() {
        checkSpecifiedProperty("flexlnsNo");
        return convertEmptyToNull(_flexlnsNo);
    }

    /**
     * [set] FLEXLNS_NO: {varchar(255)} <br>
     * 指示No.
     * @param flexlnsNo The value of the column 'FLEXLNS_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlexlnsNo(String flexlnsNo) {
        registerModifiedProperty("flexlnsNo");
        _flexlnsNo = flexlnsNo;
    }

    /**
     * [get] SCH_DATE: {varchar(255)} <br>
     * 発送予定日
     * @return The value of the column 'SCH_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchDate() {
        checkSpecifiedProperty("schDate");
        return convertEmptyToNull(_schDate);
    }

    /**
     * [set] SCH_DATE: {varchar(255)} <br>
     * 発送予定日
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchDate(String schDate) {
        registerModifiedProperty("schDate");
        _schDate = schDate;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(255)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierCd() {
        checkSpecifiedProperty("supplierCd");
        return convertEmptyToNull(_supplierCd);
    }

    /**
     * [set] SUPPLIER_CD: {varchar(255)} <br>
     * 発送元CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierCd(String supplierCd) {
        registerModifiedProperty("supplierCd");
        _supplierCd = supplierCd;
    }

    /**
     * [get] RCV_DATE: {varchar(255)} <br>
     * 受入予定日
     * @return The value of the column 'RCV_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvDate() {
        checkSpecifiedProperty("rcvDate");
        return convertEmptyToNull(_rcvDate);
    }

    /**
     * [set] RCV_DATE: {varchar(255)} <br>
     * 受入予定日
     * @param rcvDate The value of the column 'RCV_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvDate(String rcvDate) {
        registerModifiedProperty("rcvDate");
        _rcvDate = rcvDate;
    }

    /**
     * [get] SHIP_CD: {varchar(255)} <br>
     * 発送先CD
     * @return The value of the column 'SHIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCd() {
        checkSpecifiedProperty("shipCd");
        return convertEmptyToNull(_shipCd);
    }

    /**
     * [set] SHIP_CD: {varchar(255)} <br>
     * 発送先CD
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCd(String shipCd) {
        registerModifiedProperty("shipCd");
        _shipCd = shipCd;
    }

    /**
     * [get] ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemCd() {
        checkSpecifiedProperty("itemCd");
        return convertEmptyToNull(_itemCd);
    }

    /**
     * [set] ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCd(String itemCd) {
        registerModifiedProperty("itemCd");
        _itemCd = itemCd;
    }

    /**
     * [get] MANUFACTURE_DATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(255)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignCd() {
        checkSpecifiedProperty("designCd");
        return convertEmptyToNull(_designCd);
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignCd(String designCd) {
        registerModifiedProperty("designCd");
        _designCd = designCd;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * 数量（個数）
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty() {
        checkSpecifiedProperty("qty");
        return convertEmptyToNull(_qty);
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 数量（個数）
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(String qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * 画面更新者
     * @return The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlexUpdUserCd() {
        checkSpecifiedProperty("flexUpdUserCd");
        return convertEmptyToNull(_flexUpdUserCd);
    }

    /**
     * [set] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * 画面更新者
     * @param flexUpdUserCd The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlexUpdUserCd(String flexUpdUserCd) {
        registerModifiedProperty("flexUpdUserCd");
        _flexUpdUserCd = flexUpdUserCd;
    }

    /**
     * [get] FLEXIBITYNO: {bigint(19)} <br>
     * 融通No.
     * @return The value of the column 'FLEXIBITYNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFlexibityno() {
        checkSpecifiedProperty("flexibityno");
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {bigint(19)} <br>
     * 融通No.
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlexibityno(Long flexibityno) {
        registerModifiedProperty("flexibityno");
        _flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(255)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMsg() {
        checkSpecifiedProperty("errorMsg");
        return convertEmptyToNull(_errorMsg);
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMsg(String errorMsg) {
        registerModifiedProperty("errorMsg");
        _errorMsg = errorMsg;
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
