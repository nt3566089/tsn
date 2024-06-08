package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlBondedShippingRelationListPrintGetId. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_LIST_PRINT_ID, TRSOLISTKEY, LISTKBN, PRINTEDFLG, TRSOLISTSTS, PRINTDATETIME, SHIPSCHDATE, WORKALLOCATEID, RMANO, OWNERSONO, SHIPTOCD, ITEMCD, SOID, SODETAILID, SOPALLETNO, FLOOR, PICKING_INST_ID, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * Long shippingListPrintId = entity.getShippingListPrintId();
 * Long trsolistkey = entity.getTrsolistkey();
 * String listkbn = entity.getListkbn();
 * String printedflg = entity.getPrintedflg();
 * String trsoliststs = entity.getTrsoliststs();
 * java.sql.Timestamp printdatetime = entity.getPrintdatetime();
 * String shipschdate = entity.getShipschdate();
 * Long workallocateid = entity.getWorkallocateid();
 * String rmano = entity.getRmano();
 * String ownersono = entity.getOwnersono();
 * String shiptocd = entity.getShiptocd();
 * String itemcd = entity.getItemcd();
 * Long soid = entity.getSoid();
 * Long sodetailid = entity.getSodetailid();
 * String sopalletno = entity.getSopalletno();
 * String floor = entity.getFloor();
 * Long pickingInstId = entity.getPickingInstId();
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
 * entity.setShippingListPrintId(shippingListPrintId);
 * entity.setTrsolistkey(trsolistkey);
 * entity.setListkbn(listkbn);
 * entity.setPrintedflg(printedflg);
 * entity.setTrsoliststs(trsoliststs);
 * entity.setPrintdatetime(printdatetime);
 * entity.setShipschdate(shipschdate);
 * entity.setWorkallocateid(workallocateid);
 * entity.setRmano(rmano);
 * entity.setOwnersono(ownersono);
 * entity.setShiptocd(shiptocd);
 * entity.setItemcd(itemcd);
 * entity.setSoid(soid);
 * entity.setSodetailid(sodetailid);
 * entity.setSopalletno(sopalletno);
 * entity.setFloor(floor);
 * entity.setPickingInstId(pickingInstId);
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
public abstract class BsSqlBondedShippingRelationListPrintGetId extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_LIST_PRINT_ID: {bigint(19)} */
    protected Long _shippingListPrintId;

    /** TRSOLISTKEY: {bigint(19)} */
    protected Long _trsolistkey;

    /** LISTKBN: {varchar(100)} */
    protected String _listkbn;

    /** PRINTEDFLG: {char(1)} */
    protected String _printedflg;

    /** TRSOLISTSTS: {varchar(100)} */
    protected String _trsoliststs;

    /** PRINTDATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _printdatetime;

    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** WORKALLOCATEID: {bigint(19)} */
    protected Long _workallocateid;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** SHIPTOCD: {varchar(30)} */
    protected String _shiptocd;

    /** ITEMCD: {varchar(30)} */
    protected String _itemcd;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    /** SODETAILID: {bigint(19)} */
    protected Long _sodetailid;

    /** SOPALLETNO: {varchar(30)} */
    protected String _sopalletno;

    /** FLOOR: {varchar(30)} */
    protected String _floor;

    /** PICKING_INST_ID: {bigint(19)} */
    protected Long _pickingInstId;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
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
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlBondedShippingRelationListPrintGetIdDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlBondedShippingRelationListPrintGetId";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
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
        if (obj instanceof BsSqlBondedShippingRelationListPrintGetId) {
            BsSqlBondedShippingRelationListPrintGetId other = (BsSqlBondedShippingRelationListPrintGetId)obj;
            if (!xSV(_shippingListPrintId, other._shippingListPrintId)) { return false; }
            if (!xSV(_trsolistkey, other._trsolistkey)) { return false; }
            if (!xSV(_listkbn, other._listkbn)) { return false; }
            if (!xSV(_printedflg, other._printedflg)) { return false; }
            if (!xSV(_trsoliststs, other._trsoliststs)) { return false; }
            if (!xSV(_printdatetime, other._printdatetime)) { return false; }
            if (!xSV(_shipschdate, other._shipschdate)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_rmano, other._rmano)) { return false; }
            if (!xSV(_ownersono, other._ownersono)) { return false; }
            if (!xSV(_shiptocd, other._shiptocd)) { return false; }
            if (!xSV(_itemcd, other._itemcd)) { return false; }
            if (!xSV(_soid, other._soid)) { return false; }
            if (!xSV(_sodetailid, other._sodetailid)) { return false; }
            if (!xSV(_sopalletno, other._sopalletno)) { return false; }
            if (!xSV(_floor, other._floor)) { return false; }
            if (!xSV(_pickingInstId, other._pickingInstId)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingListPrintId);
        hs = xCH(hs, _trsolistkey);
        hs = xCH(hs, _listkbn);
        hs = xCH(hs, _printedflg);
        hs = xCH(hs, _trsoliststs);
        hs = xCH(hs, _printdatetime);
        hs = xCH(hs, _shipschdate);
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _rmano);
        hs = xCH(hs, _ownersono);
        hs = xCH(hs, _shiptocd);
        hs = xCH(hs, _itemcd);
        hs = xCH(hs, _soid);
        hs = xCH(hs, _sodetailid);
        hs = xCH(hs, _sopalletno);
        hs = xCH(hs, _floor);
        hs = xCH(hs, _pickingInstId);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingListPrintId));
        sb.append(dm).append(xfND(_trsolistkey));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_trsoliststs));
        sb.append(dm).append(xfND(_printdatetime));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_itemcd));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_sodetailid));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_pickingInstId));
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
    public SqlBondedShippingRelationListPrintGetId clone() {
        return (SqlBondedShippingRelationListPrintGetId)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_LIST_PRINT_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingListPrintId() {
        checkSpecifiedProperty("shippingListPrintId");
        return _shippingListPrintId;
    }

    /**
     * [set] SHIPPING_LIST_PRINT_ID: {bigint(19)} <br>
     * @param shippingListPrintId The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingListPrintId(Long shippingListPrintId) {
        registerModifiedProperty("shippingListPrintId");
        _shippingListPrintId = shippingListPrintId;
    }

    /**
     * [get] TRSOLISTKEY: {bigint(19)} <br>
     * @return The value of the column 'TRSOLISTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsolistkey() {
        checkSpecifiedProperty("trsolistkey");
        return _trsolistkey;
    }

    /**
     * [set] TRSOLISTKEY: {bigint(19)} <br>
     * @param trsolistkey The value of the column 'TRSOLISTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsolistkey(Long trsolistkey) {
        registerModifiedProperty("trsolistkey");
        _trsolistkey = trsolistkey;
    }

    /**
     * [get] LISTKBN: {varchar(100)} <br>
     * @return The value of the column 'LISTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getListkbn() {
        checkSpecifiedProperty("listkbn");
        return convertEmptyToNull(_listkbn);
    }

    /**
     * [set] LISTKBN: {varchar(100)} <br>
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setListkbn(String listkbn) {
        registerModifiedProperty("listkbn");
        _listkbn = listkbn;
    }

    /**
     * [get] PRINTEDFLG: {char(1)} <br>
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] TRSOLISTSTS: {varchar(100)} <br>
     * @return The value of the column 'TRSOLISTSTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrsoliststs() {
        checkSpecifiedProperty("trsoliststs");
        return convertEmptyToNull(_trsoliststs);
    }

    /**
     * [set] TRSOLISTSTS: {varchar(100)} <br>
     * @param trsoliststs The value of the column 'TRSOLISTSTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsoliststs(String trsoliststs) {
        registerModifiedProperty("trsoliststs");
        _trsoliststs = trsoliststs;
    }

    /**
     * [get] PRINTDATETIME: {datetime2(26, 6)} <br>
     * @return The value of the column 'PRINTDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPrintdatetime() {
        checkSpecifiedProperty("printdatetime");
        return _printdatetime;
    }

    /**
     * [set] PRINTDATETIME: {datetime2(26, 6)} <br>
     * @param printdatetime The value of the column 'PRINTDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintdatetime(java.sql.Timestamp printdatetime) {
        registerModifiedProperty("printdatetime");
        _printdatetime = printdatetime;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] WORKALLOCATEID: {bigint(19)} <br>
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {bigint(19)} <br>
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkallocateid(Long workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * @return The value of the column 'OWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcd() {
        checkSpecifiedProperty("itemcd");
        return convertEmptyToNull(_itemcd);
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcd(String itemcd) {
        registerModifiedProperty("itemcd");
        _itemcd = itemcd;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * @return The value of the column 'SOID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * @param soid The value of the column 'SOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SODETAILID: {bigint(19)} <br>
     * @return The value of the column 'SODETAILID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSodetailid() {
        checkSpecifiedProperty("sodetailid");
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {bigint(19)} <br>
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSodetailid(Long sodetailid) {
        registerModifiedProperty("sodetailid");
        _sodetailid = sodetailid;
    }

    /**
     * [get] SOPALLETNO: {varchar(30)} <br>
     * @return The value of the column 'SOPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSopalletno() {
        checkSpecifiedProperty("sopalletno");
        return convertEmptyToNull(_sopalletno);
    }

    /**
     * [set] SOPALLETNO: {varchar(30)} <br>
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSopalletno(String sopalletno) {
        registerModifiedProperty("sopalletno");
        _sopalletno = sopalletno;
    }

    /**
     * [get] FLOOR: {varchar(30)} <br>
     * @return The value of the column 'FLOOR'. (NullAllowed even if selected: for no constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {varchar(30)} <br>
     * @param floor The value of the column 'FLOOR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] PICKING_INST_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_INST_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingInstId() {
        checkSpecifiedProperty("pickingInstId");
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {bigint(19)} <br>
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingInstId(Long pickingInstId) {
        registerModifiedProperty("pickingInstId");
        _pickingInstId = pickingInstId;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
