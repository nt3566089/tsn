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
 * The entity of T_TRMAKERCASECD as TABLE. <br>
 * メーカーケースコード情報
 * <pre>
 * [primary-key]
 *     TRMAKERCASECD_ID
 *
 * [column]
 *     TRMAKERCASECD_ID, SEQNO, RECEIVE_PLAN_H_ID, WAREHOUSECD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, CARRIERNO, CARRIERWBNO, NUMBER_OF_PALLETS, SSCC, CASENO, MAKERCASENO, LOT4, RESULTFLG, RECEIVEDFLG, IFRECEIVEDFLG, SYMBOLNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRMAKERCASECD_ID
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
 * Long trmakercasecdId = entity.getTrmakercasecdId();
 * Long seqno = entity.getSeqno();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * String warehousecd = entity.getWarehousecd();
 * String senderLocation = entity.getSenderLocation();
 * String receiverLocation = entity.getReceiverLocation();
 * String shipmentId = entity.getShipmentId();
 * String shipmentDate = entity.getShipmentDate();
 * String carrierno = entity.getCarrierno();
 * String carrierwbno = entity.getCarrierwbno();
 * String numberOfPallets = entity.getNumberOfPallets();
 * String sscc = entity.getSscc();
 * String caseno = entity.getCaseno();
 * String makercaseno = entity.getMakercaseno();
 * String lot4 = entity.getLot4();
 * String resultflg = entity.getResultflg();
 * String receivedflg = entity.getReceivedflg();
 * String ifreceivedflg = entity.getIfreceivedflg();
 * Long symbolno = entity.getSymbolno();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrmakercasecdId(trmakercasecdId);
 * entity.setSeqno(seqno);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setWarehousecd(warehousecd);
 * entity.setSenderLocation(senderLocation);
 * entity.setReceiverLocation(receiverLocation);
 * entity.setShipmentId(shipmentId);
 * entity.setShipmentDate(shipmentDate);
 * entity.setCarrierno(carrierno);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setNumberOfPallets(numberOfPallets);
 * entity.setSscc(sscc);
 * entity.setCaseno(caseno);
 * entity.setMakercaseno(makercaseno);
 * entity.setLot4(lot4);
 * entity.setResultflg(resultflg);
 * entity.setReceivedflg(receivedflg);
 * entity.setIfreceivedflg(ifreceivedflg);
 * entity.setSymbolno(symbolno);
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
public abstract class BsTTrmakercasecd extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trmakercasecdId;

    /** SEQNO: {bigint(19)} */
    protected Long _seqno;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    protected Long _receivePlanHId;

    /** WAREHOUSECD: {varchar(30)} */
    protected String _warehousecd;

    /** SENDER_LOCATION: {varchar(30)} */
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(30)} */
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(30)} */
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(30)} */
    protected String _shipmentDate;

    /** CARRIERNO: {varchar(30)} */
    protected String _carrierno;

    /** CARRIERWBNO: {varchar(30)} */
    protected String _carrierwbno;

    /** NUMBER_OF_PALLETS: {varchar(30)} */
    protected String _numberOfPallets;

    /** SSCC: {varchar(30)} */
    protected String _sscc;

    /** CASENO: {varchar(30)} */
    protected String _caseno;

    /** MAKERCASENO: {varchar(60)} */
    protected String _makercaseno;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** RESULTFLG: {NotNull, char(1)} */
    protected String _resultflg;

    /** RECEIVEDFLG: {NotNull, char(1)} */
    protected String _receivedflg;

    /** IFRECEIVEDFLG: {NotNull, char(1)} */
    protected String _ifreceivedflg;

    /** SYMBOLNO: {bigint(19)} */
    protected Long _symbolno;

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
        return "T_TRMAKERCASECD";
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
        if (_trmakercasecdId == null) { return false; }
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
        if (obj instanceof BsTTrmakercasecd) {
            BsTTrmakercasecd other = (BsTTrmakercasecd)obj;
            if (!xSV(_trmakercasecdId, other._trmakercasecdId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trmakercasecdId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trmakercasecdId));
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_senderLocation));
        sb.append(dm).append(xfND(_receiverLocation));
        sb.append(dm).append(xfND(_shipmentId));
        sb.append(dm).append(xfND(_shipmentDate));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_numberOfPallets));
        sb.append(dm).append(xfND(_sscc));
        sb.append(dm).append(xfND(_caseno));
        sb.append(dm).append(xfND(_makercaseno));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_resultflg));
        sb.append(dm).append(xfND(_receivedflg));
        sb.append(dm).append(xfND(_ifreceivedflg));
        sb.append(dm).append(xfND(_symbolno));
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
    public TTrmakercasecd clone() {
        return (TTrmakercasecd)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メーカーケースCD情報ID
     * @return The value of the column 'TRMAKERCASECD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrmakercasecdId() {
        checkSpecifiedProperty("trmakercasecdId");
        return _trmakercasecdId;
    }

    /**
     * [set] TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メーカーケースCD情報ID
     * @param trmakercasecdId The value of the column 'TRMAKERCASECD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrmakercasecdId(Long trmakercasecdId) {
        registerModifiedProperty("trmakercasecdId");
        _trmakercasecdId = trmakercasecdId;
    }

    /**
     * [get] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSeqno() {
        checkSpecifiedProperty("seqno");
        return _seqno;
    }

    /**
     * [set] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeqno(Long seqno) {
        registerModifiedProperty("seqno");
        _seqno = seqno;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSenderLocation() {
        checkSpecifiedProperty("senderLocation");
        return convertEmptyToNull(_senderLocation);
    }

    /**
     * [set] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSenderLocation(String senderLocation) {
        registerModifiedProperty("senderLocation");
        _senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiverLocation() {
        checkSpecifiedProperty("receiverLocation");
        return convertEmptyToNull(_receiverLocation);
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiverLocation(String receiverLocation) {
        registerModifiedProperty("receiverLocation");
        _receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentId() {
        checkSpecifiedProperty("shipmentId");
        return convertEmptyToNull(_shipmentId);
    }

    /**
     * [set] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentId(String shipmentId) {
        registerModifiedProperty("shipmentId");
        _shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日（YYYYMMDDhhmmss）
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentDate() {
        checkSpecifiedProperty("shipmentDate");
        return convertEmptyToNull(_shipmentDate);
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日（YYYYMMDDhhmmss）
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentDate(String shipmentDate) {
        registerModifiedProperty("shipmentDate");
        _shipmentDate = shipmentDate;
    }

    /**
     * [get] CARRIERNO: {varchar(30)} <br>
     * コンテナNO
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(30)} <br>
     * コンテナNO
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] CARRIERWBNO: {varchar(30)} <br>
     * オーダーNO
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(30)} <br>
     * オーダーNO
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberOfPallets() {
        checkSpecifiedProperty("numberOfPallets");
        return convertEmptyToNull(_numberOfPallets);
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        registerModifiedProperty("numberOfPallets");
        _numberOfPallets = numberOfPallets;
    }

    /**
     * [get] SSCC: {varchar(30)} <br>
     * sscc
     * @return The value of the column 'SSCC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscc() {
        checkSpecifiedProperty("sscc");
        return convertEmptyToNull(_sscc);
    }

    /**
     * [set] SSCC: {varchar(30)} <br>
     * sscc
     * @param sscc The value of the column 'SSCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscc(String sscc) {
        registerModifiedProperty("sscc");
        _sscc = sscc;
    }

    /**
     * [get] CASENO: {varchar(30)} <br>
     * ケース番号
     * @return The value of the column 'CASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseno() {
        checkSpecifiedProperty("caseno");
        return convertEmptyToNull(_caseno);
    }

    /**
     * [set] CASENO: {varchar(30)} <br>
     * ケース番号
     * @param caseno The value of the column 'CASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseno(String caseno) {
        registerModifiedProperty("caseno");
        _caseno = caseno;
    }

    /**
     * [get] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKERCASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakercaseno() {
        checkSpecifiedProperty("makercaseno");
        return convertEmptyToNull(_makercaseno);
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakercaseno(String makercaseno) {
        registerModifiedProperty("makercaseno");
        _makercaseno = makercaseno;
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
     * [get] RESULTFLG: {NotNull, char(1)} <br>
     * 貼付実績フラグ
     * @return The value of the column 'RESULTFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getResultflg() {
        checkSpecifiedProperty("resultflg");
        return convertEmptyToNull(_resultflg);
    }

    /**
     * [set] RESULTFLG: {NotNull, char(1)} <br>
     * 貼付実績フラグ
     * @param resultflg The value of the column 'RESULTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setResultflg(String resultflg) {
        registerModifiedProperty("resultflg");
        _resultflg = resultflg;
    }

    /**
     * [get] RECEIVEDFLG: {NotNull, char(1)} <br>
     * 予定情報受信済フラグ
     * @return The value of the column 'RECEIVEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getReceivedflg() {
        checkSpecifiedProperty("receivedflg");
        return convertEmptyToNull(_receivedflg);
    }

    /**
     * [set] RECEIVEDFLG: {NotNull, char(1)} <br>
     * 予定情報受信済フラグ
     * @param receivedflg The value of the column 'RECEIVEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setReceivedflg(String receivedflg) {
        registerModifiedProperty("receivedflg");
        _receivedflg = receivedflg;
    }

    /**
     * [get] IFRECEIVEDFLG: {NotNull, char(1)} <br>
     * IFファイル受信済フラグ
     * @return The value of the column 'IFRECEIVEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getIfreceivedflg() {
        checkSpecifiedProperty("ifreceivedflg");
        return convertEmptyToNull(_ifreceivedflg);
    }

    /**
     * [set] IFRECEIVEDFLG: {NotNull, char(1)} <br>
     * IFファイル受信済フラグ
     * @param ifreceivedflg The value of the column 'IFRECEIVEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setIfreceivedflg(String ifreceivedflg) {
        registerModifiedProperty("ifreceivedflg");
        _ifreceivedflg = ifreceivedflg;
    }

    /**
     * [get] SYMBOLNO: {bigint(19)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOLNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSymbolno() {
        checkSpecifiedProperty("symbolno");
        return _symbolno;
    }

    /**
     * [set] SYMBOLNO: {bigint(19)} <br>
     * シンボル管理番号
     * @param symbolno The value of the column 'SYMBOLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolno(Long symbolno) {
        registerModifiedProperty("symbolno");
        _symbolno = symbolno;
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
