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
 * The entity of E_STORE_WORK_INFO_SEND as TABLE. <br>
 * 入庫作業情報送信テーブル(シンボル貼付)
 * <pre>
 * [primary-key]
 *     STORE_WORK_INFO_SEND_ID
 *
 * [column]
 *     STORE_WORK_INFO_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, WarehouseGroup, SUPPLIERRCVNO, WAREHOUSE_CD, RECEIVE_PLAN_DT, OTHERREFNO1, CARRIERNO, PRODUCT_CD, LOT3, LOT4, LOT1, FROMFAX, LOT2, CARRIERSNAME, FOREIGNCARGOFLG, CARRIERWBNO, FROMPHONE, RCVKEY, EXPECTQTY1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_WORK_INFO_SEND_ID
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
 * Long storeWorkInfoSendId = entity.getStoreWorkInfoSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String warehousegroup = entity.getWarehousegroup();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String warehouseCd = entity.getWarehouseCd();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String otherrefno1 = entity.getOtherrefno1();
 * String carrierno = entity.getCarrierno();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot1 = entity.getLot1();
 * String fromfax = entity.getFromfax();
 * String lot2 = entity.getLot2();
 * String carriersname = entity.getCarriersname();
 * String foreigncargoflg = entity.getForeigncargoflg();
 * String carrierwbno = entity.getCarrierwbno();
 * String fromphone = entity.getFromphone();
 * String rcvkey = entity.getRcvkey();
 * String expectqty1 = entity.getExpectqty1();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStoreWorkInfoSendId(storeWorkInfoSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setWarehousegroup(warehousegroup);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setCarrierno(carrierno);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot1(lot1);
 * entity.setFromfax(fromfax);
 * entity.setLot2(lot2);
 * entity.setCarriersname(carriersname);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setFromphone(fromphone);
 * entity.setRcvkey(rcvkey);
 * entity.setExpectqty1(expectqty1);
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
public abstract class BsEStoreWorkInfoSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _storeWorkInfoSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1)} */
    protected String _workFlg;

    /** WarehouseGroup: {NotNull, varchar(30)} */
    protected String _warehousegroup;

    /** SUPPLIERRCVNO: {varchar(255)} */
    protected String _supplierrcvno;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    protected String _receivePlanDt;

    /** OTHERREFNO1: {varchar(255)} */
    protected String _otherrefno1;

    /** CARRIERNO: {varchar(255)} */
    protected String _carrierno;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** LOT3: {varchar(255)} */
    protected String _lot3;

    /** LOT4: {varchar(255)} */
    protected String _lot4;

    /** LOT1: {varchar(255)} */
    protected String _lot1;

    /** FROMFAX: {varchar(255)} */
    protected String _fromfax;

    /** LOT2: {varchar(255)} */
    protected String _lot2;

    /** CARRIERSNAME: {varchar(255)} */
    protected String _carriersname;

    /** FOREIGNCARGOFLG: {varchar(255)} */
    protected String _foreigncargoflg;

    /** CARRIERWBNO: {varchar(255)} */
    protected String _carrierwbno;

    /** FROMPHONE: {varchar(255)} */
    protected String _fromphone;

    /** RCVKEY: {varchar(255)} */
    protected String _rcvkey;

    /** EXPECTQTY1: {varchar(255)} */
    protected String _expectqty1;

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
        return "E_STORE_WORK_INFO_SEND";
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
        if (_storeWorkInfoSendId == null) { return false; }
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
        if (obj instanceof BsEStoreWorkInfoSend) {
            BsEStoreWorkInfoSend other = (BsEStoreWorkInfoSend)obj;
            if (!xSV(_storeWorkInfoSendId, other._storeWorkInfoSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _storeWorkInfoSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_storeWorkInfoSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_warehousegroup));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_fromfax));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_fromphone));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_expectqty1));
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
    public EStoreWorkInfoSend clone() {
        return (EStoreWorkInfoSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫作業情報送信ID
     * @return The value of the column 'STORE_WORK_INFO_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreWorkInfoSendId() {
        checkSpecifiedProperty("storeWorkInfoSendId");
        return _storeWorkInfoSendId;
    }

    /**
     * [set] STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫作業情報送信ID
     * @param storeWorkInfoSendId The value of the column 'STORE_WORK_INFO_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreWorkInfoSendId(Long storeWorkInfoSendId) {
        registerModifiedProperty("storeWorkInfoSendId");
        _storeWorkInfoSendId = storeWorkInfoSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] WarehouseGroup: {NotNull, varchar(30)} <br>
     * 拠点グループ
     * @return The value of the column 'WarehouseGroup'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousegroup() {
        checkSpecifiedProperty("warehousegroup");
        return convertEmptyToNull(_warehousegroup);
    }

    /**
     * [set] WarehouseGroup: {NotNull, varchar(30)} <br>
     * 拠点グループ
     * @param warehousegroup The value of the column 'WarehouseGroup'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousegroup(String warehousegroup) {
        registerModifiedProperty("warehousegroup");
        _warehousegroup = warehousegroup;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 受地CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 受地CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 受入予定年月日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 受入予定年月日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] CARRIERNO: {varchar(255)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(255)} <br>
     * コンテナNo
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(255)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] FROMFAX: {varchar(255)} <br>
     * 印刷機番号
     * @return The value of the column 'FROMFAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromfax() {
        checkSpecifiedProperty("fromfax");
        return convertEmptyToNull(_fromfax);
    }

    /**
     * [set] FROMFAX: {varchar(255)} <br>
     * 印刷機番号
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromfax(String fromfax) {
        registerModifiedProperty("fromfax");
        _fromfax = fromfax;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * BAT製造月記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * BAT製造月記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] CARRIERSNAME: {varchar(255)} <br>
     * SRC_CD
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(255)} <br>
     * SRC_CD
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return convertEmptyToNull(_foreigncargoflg);
    }

    /**
     * [set] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CARRIERWBNO: {varchar(255)} <br>
     * OrderNo
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(255)} <br>
     * OrderNo
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] FROMPHONE: {varchar(255)} <br>
     * 搬入順
     * @return The value of the column 'FROMPHONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromphone() {
        checkSpecifiedProperty("fromphone");
        return convertEmptyToNull(_fromphone);
    }

    /**
     * [set] FROMPHONE: {varchar(255)} <br>
     * 搬入順
     * @param fromphone The value of the column 'FROMPHONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromphone(String fromphone) {
        registerModifiedProperty("fromphone");
        _fromphone = fromphone;
    }

    /**
     * [get] RCVKEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return convertEmptyToNull(_rcvkey);
    }

    /**
     * [set] RCVKEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(String rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] EXPECTQTY1: {varchar(255)} <br>
     * 個数(個装)
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public String getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return convertEmptyToNull(_expectqty1);
    }

    /**
     * [set] EXPECTQTY1: {varchar(255)} <br>
     * 個数(個装)
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1(String expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
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
