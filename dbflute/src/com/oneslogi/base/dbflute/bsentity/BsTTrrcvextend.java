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
 * The entity of T_TRRCVEXTEND as TABLE. <br>
 * 入庫予定拡張情報
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, SBWAREHOUSECD, IINO, RCVSCHDATE, CARRIERNO, WAREHOUSECD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, LOT2, EXPECTQTY1, FROMFAX, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, FROMREFNAME, CARRIERNAME, CUSTORDERNO, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, BATNO, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_TRRCV
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrrcv
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receivePlanHId = entity.getReceivePlanHId();
 * String sbwarehousecd = entity.getSbwarehousecd();
 * String iino = entity.getIino();
 * String rcvschdate = entity.getRcvschdate();
 * String carrierno = entity.getCarrierno();
 * String warehousecd = entity.getWarehousecd();
 * String otherrefno1 = entity.getOtherrefno1();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * java.math.BigDecimal expectqty1 = entity.getExpectqty1();
 * String fromfax = entity.getFromfax();
 * String carriersname = entity.getCarriersname();
 * String carrierwbno = entity.getCarrierwbno();
 * java.math.BigDecimal foreigncargoflg = entity.getForeigncargoflg();
 * String fromrefname = entity.getFromrefname();
 * String carriername = entity.getCarriername();
 * String custorderno = entity.getCustorderno();
 * String arrivalportdate = entity.getArrivalportdate();
 * String shipname = entity.getShipname();
 * String batdelino = entity.getBatdelino();
 * Long batdelidetailno = entity.getBatdelidetailno();
 * String batwarehousecd = entity.getBatwarehousecd();
 * String batkeepwarehousecd = entity.getBatkeepwarehousecd();
 * String batpartnernorcv = entity.getBatpartnernorcv();
 * String batpartnernosnd = entity.getBatpartnernosnd();
 * Long batdelidetailnum = entity.getBatdelidetailnum();
 * java.math.BigDecimal batno = entity.getBatno();
 * String vaExtdata1 = entity.getVaExtdata1();
 * String vaExtdata2 = entity.getVaExtdata2();
 * String vaExtdata3 = entity.getVaExtdata3();
 * String nvExtdata1 = entity.getNvExtdata1();
 * String nvExtdata2 = entity.getNvExtdata2();
 * String nvExtdata3 = entity.getNvExtdata3();
 * Long nmExtdata1 = entity.getNmExtdata1();
 * Long nmExtdata2 = entity.getNmExtdata2();
 * Long nmExtdata3 = entity.getNmExtdata3();
 * String dtExtdata1 = entity.getDtExtdata1();
 * String dtExtdata2 = entity.getDtExtdata2();
 * String dtExtdata3 = entity.getDtExtdata3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setSbwarehousecd(sbwarehousecd);
 * entity.setIino(iino);
 * entity.setRcvschdate(rcvschdate);
 * entity.setCarrierno(carrierno);
 * entity.setWarehousecd(warehousecd);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setExpectqty1(expectqty1);
 * entity.setFromfax(fromfax);
 * entity.setCarriersname(carriersname);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setFromrefname(fromrefname);
 * entity.setCarriername(carriername);
 * entity.setCustorderno(custorderno);
 * entity.setArrivalportdate(arrivalportdate);
 * entity.setShipname(shipname);
 * entity.setBatdelino(batdelino);
 * entity.setBatdelidetailno(batdelidetailno);
 * entity.setBatwarehousecd(batwarehousecd);
 * entity.setBatkeepwarehousecd(batkeepwarehousecd);
 * entity.setBatpartnernorcv(batpartnernorcv);
 * entity.setBatpartnernosnd(batpartnernosnd);
 * entity.setBatdelidetailnum(batdelidetailnum);
 * entity.setBatno(batno);
 * entity.setVaExtdata1(vaExtdata1);
 * entity.setVaExtdata2(vaExtdata2);
 * entity.setVaExtdata3(vaExtdata3);
 * entity.setNvExtdata1(nvExtdata1);
 * entity.setNvExtdata2(nvExtdata2);
 * entity.setNvExtdata3(nvExtdata3);
 * entity.setNmExtdata1(nmExtdata1);
 * entity.setNmExtdata2(nmExtdata2);
 * entity.setNmExtdata3(nmExtdata3);
 * entity.setDtExtdata1(dtExtdata1);
 * entity.setDtExtdata2(dtExtdata2);
 * entity.setDtExtdata3(dtExtdata3);
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
public abstract class BsTTrrcvextend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV} */
    protected Long _receivePlanHId;

    /** SBWAREHOUSECD: {varchar(30)} */
    protected String _sbwarehousecd;

    /** IINO: {varchar(30)} */
    protected String _iino;

    /** RCVSCHDATE: {varchar(8)} */
    protected String _rcvschdate;

    /** CARRIERNO: {varchar(60)} */
    protected String _carrierno;

    /** WAREHOUSECD: {varchar(30)} */
    protected String _warehousecd;

    /** OTHERREFNO1: {varchar(60)} */
    protected String _otherrefno1;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** EXPECTQTY1: {decimal(16, 6)} */
    protected java.math.BigDecimal _expectqty1;

    /** FROMFAX: {varchar(60)} */
    protected String _fromfax;

    /** CARRIERSNAME: {varchar(100)} */
    protected String _carriersname;

    /** CARRIERWBNO: {varchar(60)} */
    protected String _carrierwbno;

    /** FOREIGNCARGOFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _foreigncargoflg;

    /** FROMREFNAME: {varchar(60)} */
    protected String _fromrefname;

    /** CARRIERNAME: {varchar(255)} */
    protected String _carriername;

    /** CUSTORDERNO: {varchar(60)} */
    protected String _custorderno;

    /** ARRIVALPORTDATE: {varchar(8)} */
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(100)} */
    protected String _shipname;

    /** BATDELINO: {varchar(30)} */
    protected String _batdelino;

    /** BATDELIDETAILNO: {bigint(19)} */
    protected Long _batdelidetailno;

    /** BATWAREHOUSECD: {varchar(30)} */
    protected String _batwarehousecd;

    /** BATKEEPWAREHOUSECD: {varchar(30)} */
    protected String _batkeepwarehousecd;

    /** BATPARTNERNORCV: {varchar(30)} */
    protected String _batpartnernorcv;

    /** BATPARTNERNOSND: {varchar(30)} */
    protected String _batpartnernosnd;

    /** BATDELIDETAILNUM: {bigint(19)} */
    protected Long _batdelidetailnum;

    /** BATNO: {decimal(16, 6)} */
    protected java.math.BigDecimal _batno;

    /** VA_EXTDATA1: {varchar(30)} */
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    protected String _dtExtdata3;

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
        return "T_TRRCVEXTEND";
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
        if (_receivePlanHId == null) { return false; }
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
    /** T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'. */
    protected TTrrcv _tTrrcv;

    /**
     * [get] T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'. <br>
     * @return The entity of foreign property 'TTrrcv'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrrcv getTTrrcv() {
        return _tTrrcv;
    }

    /**
     * [set] T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'.
     * @param tTrrcv The entity of foreign property 'TTrrcv'. (NullAllowed)
     */
    public void setTTrrcv(TTrrcv tTrrcv) {
        _tTrrcv = tTrrcv;
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
        if (obj instanceof BsTTrrcvextend) {
            BsTTrrcvextend other = (BsTTrrcvextend)obj;
            if (!xSV(_receivePlanHId, other._receivePlanHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrrcv != null)
        { sb.append(li).append(xbRDS(_tTrrcv, "tTrrcv")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_sbwarehousecd));
        sb.append(dm).append(xfND(_iino));
        sb.append(dm).append(xfND(_rcvschdate));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_fromfax));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_fromrefname));
        sb.append(dm).append(xfND(_carriername));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_arrivalportdate));
        sb.append(dm).append(xfND(_shipname));
        sb.append(dm).append(xfND(_batdelino));
        sb.append(dm).append(xfND(_batdelidetailno));
        sb.append(dm).append(xfND(_batwarehousecd));
        sb.append(dm).append(xfND(_batkeepwarehousecd));
        sb.append(dm).append(xfND(_batpartnernorcv));
        sb.append(dm).append(xfND(_batpartnernosnd));
        sb.append(dm).append(xfND(_batdelidetailnum));
        sb.append(dm).append(xfND(_batno));
        sb.append(dm).append(xfND(_vaExtdata1));
        sb.append(dm).append(xfND(_vaExtdata2));
        sb.append(dm).append(xfND(_vaExtdata3));
        sb.append(dm).append(xfND(_nvExtdata1));
        sb.append(dm).append(xfND(_nvExtdata2));
        sb.append(dm).append(xfND(_nvExtdata3));
        sb.append(dm).append(xfND(_nmExtdata1));
        sb.append(dm).append(xfND(_nmExtdata2));
        sb.append(dm).append(xfND(_nmExtdata3));
        sb.append(dm).append(xfND(_dtExtdata1));
        sb.append(dm).append(xfND(_dtExtdata2));
        sb.append(dm).append(xfND(_dtExtdata3));
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
        if (_tTrrcv != null)
        { sb.append(dm).append("tTrrcv"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrrcvextend clone() {
        return (TTrrcvextend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(30)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSbwarehousecd() {
        checkSpecifiedProperty("sbwarehousecd");
        return convertEmptyToNull(_sbwarehousecd);
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(30)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        registerModifiedProperty("sbwarehousecd");
        _sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] IINO: {varchar(30)} <br>
     * 保税管理番号
     * @return The value of the column 'IINO'. (NullAllowed even if selected: for no constraint)
     */
    public String getIino() {
        checkSpecifiedProperty("iino");
        return convertEmptyToNull(_iino);
    }

    /**
     * [set] IINO: {varchar(30)} <br>
     * 保税管理番号
     * @param iino The value of the column 'IINO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIino(String iino) {
        registerModifiedProperty("iino");
        _iino = iino;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvschdate() {
        checkSpecifiedProperty("rcvschdate");
        return convertEmptyToNull(_rcvschdate);
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvschdate(String rcvschdate) {
        registerModifiedProperty("rcvschdate");
        _rcvschdate = rcvschdate;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * コンテナNo.
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * コンテナNo.
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
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
     * [get] EXPECTQTY1: {decimal(16, 6)} <br>
     * 個数（個装）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {decimal(16, 6)} <br>
     * 個数（個装）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] FROMFAX: {varchar(60)} <br>
     * ラインNo.
     * @return The value of the column 'FROMFAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromfax() {
        checkSpecifiedProperty("fromfax");
        return convertEmptyToNull(_fromfax);
    }

    /**
     * [set] FROMFAX: {varchar(60)} <br>
     * ラインNo.
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromfax(String fromfax) {
        registerModifiedProperty("fromfax");
        _fromfax = fromfax;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * SRC_CD
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * SRC_CD
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * オーダーNo.
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * オーダーNo.
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] FOREIGNCARGOFLG: {decimal(16, 6)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {decimal(16, 6)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] FROMREFNAME: {varchar(60)} <br>
     * B/LNo.
     * @return The value of the column 'FROMREFNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromrefname() {
        checkSpecifiedProperty("fromrefname");
        return convertEmptyToNull(_fromrefname);
    }

    /**
     * [set] FROMREFNAME: {varchar(60)} <br>
     * B/LNo.
     * @param fromrefname The value of the column 'FROMREFNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromrefname(String fromrefname) {
        registerModifiedProperty("fromrefname");
        _fromrefname = fromrefname;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 連携項目
     * @return The value of the column 'CARRIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriername() {
        checkSpecifiedProperty("carriername");
        return convertEmptyToNull(_carriername);
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 連携項目
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriername(String carriername) {
        registerModifiedProperty("carriername");
        _carriername = carriername;
    }

    /**
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustorderno() {
        checkSpecifiedProperty("custorderno");
        return convertEmptyToNull(_custorderno);
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustorderno(String custorderno) {
        registerModifiedProperty("custorderno");
        _custorderno = custorderno;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalportdate() {
        checkSpecifiedProperty("arrivalportdate");
        return convertEmptyToNull(_arrivalportdate);
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalportdate(String arrivalportdate) {
        registerModifiedProperty("arrivalportdate");
        _arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipname() {
        checkSpecifiedProperty("shipname");
        return convertEmptyToNull(_shipname);
    }

    /**
     * [set] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipname(String shipname) {
        registerModifiedProperty("shipname");
        _shipname = shipname;
    }

    /**
     * [get] BATDELINO: {varchar(30)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @return The value of the column 'BATDELINO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatdelino() {
        checkSpecifiedProperty("batdelino");
        return convertEmptyToNull(_batdelino);
    }

    /**
     * [set] BATDELINO: {varchar(30)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @param batdelino The value of the column 'BATDELINO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelino(String batdelino) {
        registerModifiedProperty("batdelino");
        _batdelino = batdelino;
    }

    /**
     * [get] BATDELIDETAILNO: {bigint(19)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @return The value of the column 'BATDELIDETAILNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBatdelidetailno() {
        checkSpecifiedProperty("batdelidetailno");
        return _batdelidetailno;
    }

    /**
     * [set] BATDELIDETAILNO: {bigint(19)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @param batdelidetailno The value of the column 'BATDELIDETAILNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelidetailno(Long batdelidetailno) {
        registerModifiedProperty("batdelidetailno");
        _batdelidetailno = batdelidetailno;
    }

    /**
     * [get] BATWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼拠点CD
     * @return The value of the column 'BATWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatwarehousecd() {
        checkSpecifiedProperty("batwarehousecd");
        return convertEmptyToNull(_batwarehousecd);
    }

    /**
     * [set] BATWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼拠点CD
     * @param batwarehousecd The value of the column 'BATWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatwarehousecd(String batwarehousecd) {
        registerModifiedProperty("batwarehousecd");
        _batwarehousecd = batwarehousecd;
    }

    /**
     * [get] BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼保管場所CD
     * @return The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatkeepwarehousecd() {
        checkSpecifiedProperty("batkeepwarehousecd");
        return convertEmptyToNull(_batkeepwarehousecd);
    }

    /**
     * [set] BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼保管場所CD
     * @param batkeepwarehousecd The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatkeepwarehousecd(String batkeepwarehousecd) {
        registerModifiedProperty("batkeepwarehousecd");
        _batkeepwarehousecd = batkeepwarehousecd;
    }

    /**
     * [get] BATPARTNERNORCV: {varchar(30)} <br>
     * パートナー番号（受信）
     * @return The value of the column 'BATPARTNERNORCV'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatpartnernorcv() {
        checkSpecifiedProperty("batpartnernorcv");
        return convertEmptyToNull(_batpartnernorcv);
    }

    /**
     * [set] BATPARTNERNORCV: {varchar(30)} <br>
     * パートナー番号（受信）
     * @param batpartnernorcv The value of the column 'BATPARTNERNORCV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatpartnernorcv(String batpartnernorcv) {
        registerModifiedProperty("batpartnernorcv");
        _batpartnernorcv = batpartnernorcv;
    }

    /**
     * [get] BATPARTNERNOSND: {varchar(30)} <br>
     * パートナー番号（送信）
     * @return The value of the column 'BATPARTNERNOSND'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatpartnernosnd() {
        checkSpecifiedProperty("batpartnernosnd");
        return convertEmptyToNull(_batpartnernosnd);
    }

    /**
     * [set] BATPARTNERNOSND: {varchar(30)} <br>
     * パートナー番号（送信）
     * @param batpartnernosnd The value of the column 'BATPARTNERNOSND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatpartnernosnd(String batpartnernosnd) {
        registerModifiedProperty("batpartnernosnd");
        _batpartnernosnd = batpartnernosnd;
    }

    /**
     * [get] BATDELIDETAILNUM: {bigint(19)} <br>
     * 伝票番号
     * @return The value of the column 'BATDELIDETAILNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBatdelidetailnum() {
        checkSpecifiedProperty("batdelidetailnum");
        return _batdelidetailnum;
    }

    /**
     * [set] BATDELIDETAILNUM: {bigint(19)} <br>
     * 伝票番号
     * @param batdelidetailnum The value of the column 'BATDELIDETAILNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelidetailnum(Long batdelidetailnum) {
        registerModifiedProperty("batdelidetailnum");
        _batdelidetailnum = batdelidetailnum;
    }

    /**
     * [get] BATNO: {decimal(16, 6)} <br>
     * ＢＡＴ管理番号
     * @return The value of the column 'BATNO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBatno() {
        checkSpecifiedProperty("batno");
        return _batno;
    }

    /**
     * [set] BATNO: {decimal(16, 6)} <br>
     * ＢＡＴ管理番号
     * @param batno The value of the column 'BATNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatno(java.math.BigDecimal batno) {
        registerModifiedProperty("batno");
        _batno = batno;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata2() {
        checkSpecifiedProperty("vaExtdata2");
        return convertEmptyToNull(_vaExtdata2);
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata2(String vaExtdata2) {
        registerModifiedProperty("vaExtdata2");
        _vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata3() {
        checkSpecifiedProperty("vaExtdata3");
        return convertEmptyToNull(_vaExtdata3);
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata3(String vaExtdata3) {
        registerModifiedProperty("vaExtdata3");
        _vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata1() {
        checkSpecifiedProperty("nvExtdata1");
        return convertEmptyToNull(_nvExtdata1);
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata1(String nvExtdata1) {
        registerModifiedProperty("nvExtdata1");
        _nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata2() {
        checkSpecifiedProperty("nvExtdata2");
        return convertEmptyToNull(_nvExtdata2);
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata2(String nvExtdata2) {
        registerModifiedProperty("nvExtdata2");
        _nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata3() {
        checkSpecifiedProperty("nvExtdata3");
        return convertEmptyToNull(_nvExtdata3);
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata3(String nvExtdata3) {
        registerModifiedProperty("nvExtdata3");
        _nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata1() {
        checkSpecifiedProperty("nmExtdata1");
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        registerModifiedProperty("nmExtdata1");
        _nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata2() {
        checkSpecifiedProperty("nmExtdata2");
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        registerModifiedProperty("nmExtdata2");
        _nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata3() {
        checkSpecifiedProperty("nmExtdata3");
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        registerModifiedProperty("nmExtdata3");
        _nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata1() {
        checkSpecifiedProperty("dtExtdata1");
        return convertEmptyToNull(_dtExtdata1);
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata1(String dtExtdata1) {
        registerModifiedProperty("dtExtdata1");
        _dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return convertEmptyToNull(_dtExtdata2);
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(String dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata3() {
        checkSpecifiedProperty("dtExtdata3");
        return convertEmptyToNull(_dtExtdata3);
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata3(String dtExtdata3) {
        registerModifiedProperty("dtExtdata3");
        _dtExtdata3 = dtExtdata3;
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
