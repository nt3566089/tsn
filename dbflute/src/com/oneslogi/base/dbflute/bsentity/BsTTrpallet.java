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
 * The entity of T_TRPALLET as TABLE. <br>
 * パレットはり紙情報
 * <pre>
 * [primary-key]
 *     TRPALLET_ID
 *
 * [column]
 *     TRPALLET_ID, PALLET_NO, LOT_ID, RECEIVE_PLAN_H_ID, RCVLINENO, PRINTEDFLG, PRINTINGDATE, FIRMCARRYNO, TRANSPORTNO, SOURCECD, SCHDATE, RECEIVECD, RCVDATE, RECEIVEDATE, LOCATION_ID, PRODUCT_CD, LOT3, MANUFACTURE_DATE, BATARTICLESIGN, STOCK_TYPE_CD, RECEIVEQTYCASE, RECEIVEQTYBOWL, RECEIVEQTY, RESTQTYCASE, RESTQTYBOWL, RESTQTY, ALLOCQTY1, FULLPALLETFLG, PALLETSTS, PLURALPRODUCTIONKBN, PALLETCUTTINGKBN, RCVPALLETNO, PALLETADDFLG, ACCEPTUSERCD, ACCEPTDATE, CLIENT_ID, CENTER_ID, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_PALLET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tPalletList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trpalletId = entity.getTrpalletId();
 * java.math.BigDecimal palletNo = entity.getPalletNo();
 * Long lotId = entity.getLotId();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long rcvlineno = entity.getRcvlineno();
 * String printedflg = entity.getPrintedflg();
 * String printingdate = entity.getPrintingdate();
 * String firmcarryno = entity.getFirmcarryno();
 * String transportno = entity.getTransportno();
 * String sourcecd = entity.getSourcecd();
 * String schdate = entity.getSchdate();
 * String receivecd = entity.getReceivecd();
 * String rcvdate = entity.getRcvdate();
 * String receivedate = entity.getReceivedate();
 * Long locationId = entity.getLocationId();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String manufactureDate = entity.getManufactureDate();
 * String batarticlesign = entity.getBatarticlesign();
 * String stockTypeCd = entity.getStockTypeCd();
 * java.math.BigDecimal receiveqtycase = entity.getReceiveqtycase();
 * java.math.BigDecimal receiveqtybowl = entity.getReceiveqtybowl();
 * java.math.BigDecimal receiveqty = entity.getReceiveqty();
 * java.math.BigDecimal restqtycase = entity.getRestqtycase();
 * java.math.BigDecimal restqtybowl = entity.getRestqtybowl();
 * java.math.BigDecimal restqty = entity.getRestqty();
 * java.math.BigDecimal allocqty1 = entity.getAllocqty1();
 * String fullpalletflg = entity.getFullpalletflg();
 * String palletsts = entity.getPalletsts();
 * String pluralproductionkbn = entity.getPluralproductionkbn();
 * String palletcuttingkbn = entity.getPalletcuttingkbn();
 * String rcvpalletno = entity.getRcvpalletno();
 * String palletaddflg = entity.getPalletaddflg();
 * String acceptusercd = entity.getAcceptusercd();
 * java.sql.Timestamp acceptdate = entity.getAcceptdate();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long receivePlanBId = entity.getReceivePlanBId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrpalletId(trpalletId);
 * entity.setPalletNo(palletNo);
 * entity.setLotId(lotId);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setRcvlineno(rcvlineno);
 * entity.setPrintedflg(printedflg);
 * entity.setPrintingdate(printingdate);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setTransportno(transportno);
 * entity.setSourcecd(sourcecd);
 * entity.setSchdate(schdate);
 * entity.setReceivecd(receivecd);
 * entity.setRcvdate(rcvdate);
 * entity.setReceivedate(receivedate);
 * entity.setLocationId(locationId);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setManufactureDate(manufactureDate);
 * entity.setBatarticlesign(batarticlesign);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setReceiveqtycase(receiveqtycase);
 * entity.setReceiveqtybowl(receiveqtybowl);
 * entity.setReceiveqty(receiveqty);
 * entity.setRestqtycase(restqtycase);
 * entity.setRestqtybowl(restqtybowl);
 * entity.setRestqty(restqty);
 * entity.setAllocqty1(allocqty1);
 * entity.setFullpalletflg(fullpalletflg);
 * entity.setPalletsts(palletsts);
 * entity.setPluralproductionkbn(pluralproductionkbn);
 * entity.setPalletcuttingkbn(palletcuttingkbn);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setPalletaddflg(palletaddflg);
 * entity.setAcceptusercd(acceptusercd);
 * entity.setAcceptdate(acceptdate);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setReceivePlanBId(receivePlanBId);
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
public abstract class BsTTrpallet extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trpalletId;

    /** PALLET_NO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _palletNo;

    /** LOT_ID: {IX, bigint(19)} */
    protected Long _lotId;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    protected Long _receivePlanHId;

    /** RCVLINENO: {bigint(19)} */
    protected Long _rcvlineno;

    /** PRINTEDFLG: {NotNull, varchar(30)} */
    protected String _printedflg;

    /** PRINTINGDATE: {NotNull, varchar(8)} */
    protected String _printingdate;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** TRANSPORTNO: {varchar(30)} */
    protected String _transportno;

    /** SOURCECD: {varchar(30)} */
    protected String _sourcecd;

    /** SCHDATE: {varchar(8)} */
    protected String _schdate;

    /** RECEIVECD: {NotNull, varchar(30)} */
    protected String _receivecd;

    /** RCVDATE: {varchar(8)} */
    protected String _rcvdate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** LOT3: {NotNull, varchar(30)} */
    protected String _lot3;

    /** MANUFACTURE_DATE: {NotNull, varchar(8)} */
    protected String _manufactureDate;

    /** BATARTICLESIGN: {varchar(30)} */
    protected String _batarticlesign;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receiveqtycase;

    /** RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receiveqtybowl;

    /** RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _receiveqty;

    /** RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _restqtycase;

    /** RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _restqtybowl;

    /** RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _restqty;

    /** ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocqty1;

    /** FULLPALLETFLG: {NotNull, char(1), default=[(0)]} */
    protected String _fullpalletflg;

    /** PALLETSTS: {NotNull, varchar(30), default=[(0)]} */
    protected String _palletsts;

    /** PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} */
    protected String _pluralproductionkbn;

    /** PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} */
    protected String _palletcuttingkbn;

    /** RCVPALLETNO: {varchar(30)} */
    protected String _rcvpalletno;

    /** PALLETADDFLG: {varchar(30), default=[(2)]} */
    protected String _palletaddflg;

    /** ACCEPTUSERCD: {varchar(30)} */
    protected String _acceptusercd;

    /** ACCEPTDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _acceptdate;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** RECEIVE_PLAN_B_ID: {bigint(19)} */
    protected Long _receivePlanBId;

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
        return "T_TRPALLET";
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
        if (_trpalletId == null) { return false; }
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
    /** T_PALLET by TRPALLET_ID, named 'TPalletList'. */
    protected List<TPallet> _tPalletList;

    /**
     * [get] T_PALLET by TRPALLET_ID, named 'TPalletList'.
     * @return The entity list of referrer property 'TPalletList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPallet> getTPalletList() {
        if (_tPalletList == null) { _tPalletList = newReferrerList(); }
        return _tPalletList;
    }

    /**
     * [set] T_PALLET by TRPALLET_ID, named 'TPalletList'.
     * @param tPalletList The entity list of referrer property 'TPalletList'. (NullAllowed)
     */
    public void setTPalletList(List<TPallet> tPalletList) {
        _tPalletList = tPalletList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrpallet) {
            BsTTrpallet other = (BsTTrpallet)obj;
            if (!xSV(_trpalletId, other._trpalletId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trpalletId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tPalletList != null) { for (TPallet et : _tPalletList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPalletList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trpalletId));
        sb.append(dm).append(xfND(_palletNo));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_printingdate));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_transportno));
        sb.append(dm).append(xfND(_sourcecd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_receivecd));
        sb.append(dm).append(xfND(_rcvdate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_batarticlesign));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_receiveqtycase));
        sb.append(dm).append(xfND(_receiveqtybowl));
        sb.append(dm).append(xfND(_receiveqty));
        sb.append(dm).append(xfND(_restqtycase));
        sb.append(dm).append(xfND(_restqtybowl));
        sb.append(dm).append(xfND(_restqty));
        sb.append(dm).append(xfND(_allocqty1));
        sb.append(dm).append(xfND(_fullpalletflg));
        sb.append(dm).append(xfND(_palletsts));
        sb.append(dm).append(xfND(_pluralproductionkbn));
        sb.append(dm).append(xfND(_palletcuttingkbn));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_palletaddflg));
        sb.append(dm).append(xfND(_acceptusercd));
        sb.append(dm).append(xfND(_acceptdate));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_receivePlanBId));
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
        if (_tPalletList != null && !_tPalletList.isEmpty())
        { sb.append(dm).append("tPalletList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrpallet clone() {
        return (TTrpallet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrpalletId() {
        checkSpecifiedProperty("trpalletId");
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrpalletId(Long trpalletId) {
        registerModifiedProperty("trpalletId");
        _trpalletId = trpalletId;
    }

    /**
     * [get] PALLET_NO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLET_NO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPalletNo() {
        checkSpecifiedProperty("palletNo");
        return _palletNo;
    }

    /**
     * [set] PALLET_NO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletNo The value of the column 'PALLET_NO'. (basically NotNull if update: for the constraint)
     */
    public void setPalletNo(java.math.BigDecimal palletNo) {
        registerModifiedProperty("palletNo");
        _palletNo = palletNo;
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
     * [get] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @return The value of the column 'RCVLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, varchar(30)} <br>
     * はり紙印刷区分
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {NotNull, varchar(30)} <br>
     * はり紙印刷区分
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] PRINTINGDATE: {NotNull, varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PRINTINGDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintingdate() {
        checkSpecifiedProperty("printingdate");
        return convertEmptyToNull(_printingdate);
    }

    /**
     * [set] PRINTINGDATE: {NotNull, varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PRINTINGDATE'. (basically NotNull if update: for the constraint)
     */
    public void setPrintingdate(String printingdate) {
        registerModifiedProperty("printingdate");
        _printingdate = printingdate;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmcarryno() {
        checkSpecifiedProperty("firmcarryno");
        return convertEmptyToNull(_firmcarryno);
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmcarryno(String firmcarryno) {
        registerModifiedProperty("firmcarryno");
        _firmcarryno = firmcarryno;
    }

    /**
     * [get] TRANSPORTNO: {varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'TRANSPORTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportno() {
        checkSpecifiedProperty("transportno");
        return convertEmptyToNull(_transportno);
    }

    /**
     * [set] TRANSPORTNO: {varchar(30)} <br>
     * 整理番号
     * @param transportno The value of the column 'TRANSPORTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportno(String transportno) {
        registerModifiedProperty("transportno");
        _transportno = transportno;
    }

    /**
     * [get] SOURCECD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourcecd() {
        checkSpecifiedProperty("sourcecd");
        return convertEmptyToNull(_sourcecd);
    }

    /**
     * [set] SOURCECD: {varchar(30)} <br>
     * 発送元CD
     * @param sourcecd The value of the column 'SOURCECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourcecd(String sourcecd) {
        registerModifiedProperty("sourcecd");
        _sourcecd = sourcecd;
    }

    /**
     * [get] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] RECEIVECD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'RECEIVECD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceivecd() {
        checkSpecifiedProperty("receivecd");
        return convertEmptyToNull(_receivecd);
    }

    /**
     * [set] RECEIVECD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @param receivecd The value of the column 'RECEIVECD'. (basically NotNull if update: for the constraint)
     */
    public void setReceivecd(String receivecd) {
        registerModifiedProperty("receivecd");
        _receivecd = receivecd;
    }

    /**
     * [get] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvdate() {
        checkSpecifiedProperty("rcvdate");
        return convertEmptyToNull(_rcvdate);
    }

    /**
     * [set] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvdate(String rcvdate) {
        registerModifiedProperty("rcvdate");
        _rcvdate = rcvdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT3: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (basically NotNull if selected: for the constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (basically NotNull if update: for the constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] BATARTICLESIGN: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'BATARTICLESIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatarticlesign() {
        checkSpecifiedProperty("batarticlesign");
        return convertEmptyToNull(_batarticlesign);
    }

    /**
     * [set] BATARTICLESIGN: {varchar(30)} <br>
     * 製造記号
     * @param batarticlesign The value of the column 'BATARTICLESIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatarticlesign(String batarticlesign) {
        registerModifiedProperty("batarticlesign");
        _batarticlesign = batarticlesign;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（ケース）
     * @return The value of the column 'RECEIVEQTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceiveqtycase() {
        checkSpecifiedProperty("receiveqtycase");
        return _receiveqtycase;
    }

    /**
     * [set] RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（ケース）
     * @param receiveqtycase The value of the column 'RECEIVEQTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveqtycase(java.math.BigDecimal receiveqtycase) {
        registerModifiedProperty("receiveqtycase");
        _receiveqtycase = receiveqtycase;
    }

    /**
     * [get] RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（カートン）
     * @return The value of the column 'RECEIVEQTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceiveqtybowl() {
        checkSpecifiedProperty("receiveqtybowl");
        return _receiveqtybowl;
    }

    /**
     * [set] RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫時数量（カートン）
     * @param receiveqtybowl The value of the column 'RECEIVEQTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveqtybowl(java.math.BigDecimal receiveqtybowl) {
        registerModifiedProperty("receiveqtybowl");
        _receiveqtybowl = receiveqtybowl;
    }

    /**
     * [get] RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装入庫時数量
     * @return The value of the column 'RECEIVEQTY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getReceiveqty() {
        checkSpecifiedProperty("receiveqty");
        return _receiveqty;
    }

    /**
     * [set] RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装入庫時数量
     * @param receiveqty The value of the column 'RECEIVEQTY'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveqty(java.math.BigDecimal receiveqty) {
        registerModifiedProperty("receiveqty");
        _receiveqty = receiveqty;
    }

    /**
     * [get] RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（ケース）
     * @return The value of the column 'RESTQTYCASE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRestqtycase() {
        checkSpecifiedProperty("restqtycase");
        return _restqtycase;
    }

    /**
     * [set] RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（ケース）
     * @param restqtycase The value of the column 'RESTQTYCASE'. (basically NotNull if update: for the constraint)
     */
    public void setRestqtycase(java.math.BigDecimal restqtycase) {
        registerModifiedProperty("restqtycase");
        _restqtycase = restqtycase;
    }

    /**
     * [get] RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（カートン）
     * @return The value of the column 'RESTQTYBOWL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRestqtybowl() {
        checkSpecifiedProperty("restqtybowl");
        return _restqtybowl;
    }

    /**
     * [set] RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 残数量（カートン）
     * @param restqtybowl The value of the column 'RESTQTYBOWL'. (basically NotNull if update: for the constraint)
     */
    public void setRestqtybowl(java.math.BigDecimal restqtybowl) {
        registerModifiedProperty("restqtybowl");
        _restqtybowl = restqtybowl;
    }

    /**
     * [get] RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装残数量
     * @return The value of the column 'RESTQTY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRestqty() {
        checkSpecifiedProperty("restqty");
        return _restqty;
    }

    /**
     * [set] RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 個装残数量
     * @param restqty The value of the column 'RESTQTY'. (basically NotNull if update: for the constraint)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        registerModifiedProperty("restqty");
        _restqty = restqty;
    }

    /**
     * [get] ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当数量
     * @return The value of the column 'ALLOCQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAllocqty1() {
        checkSpecifiedProperty("allocqty1");
        return _allocqty1;
    }

    /**
     * [set] ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当数量
     * @param allocqty1 The value of the column 'ALLOCQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setAllocqty1(java.math.BigDecimal allocqty1) {
        registerModifiedProperty("allocqty1");
        _allocqty1 = allocqty1;
    }

    /**
     * [get] FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * 単品パレットフラグ
     * @return The value of the column 'FULLPALLETFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getFullpalletflg() {
        checkSpecifiedProperty("fullpalletflg");
        return convertEmptyToNull(_fullpalletflg);
    }

    /**
     * [set] FULLPALLETFLG: {NotNull, char(1), default=[(0)]} <br>
     * 単品パレットフラグ
     * @param fullpalletflg The value of the column 'FULLPALLETFLG'. (basically NotNull if update: for the constraint)
     */
    public void setFullpalletflg(String fullpalletflg) {
        registerModifiedProperty("fullpalletflg");
        _fullpalletflg = fullpalletflg;
    }

    /**
     * [get] PALLETSTS: {NotNull, varchar(30), default=[(0)]} <br>
     * パレットはり紙ステータス
     * @return The value of the column 'PALLETSTS'. (basically NotNull if selected: for the constraint)
     */
    public String getPalletsts() {
        checkSpecifiedProperty("palletsts");
        return convertEmptyToNull(_palletsts);
    }

    /**
     * [set] PALLETSTS: {NotNull, varchar(30), default=[(0)]} <br>
     * パレットはり紙ステータス
     * @param palletsts The value of the column 'PALLETSTS'. (basically NotNull if update: for the constraint)
     */
    public void setPalletsts(String palletsts) {
        registerModifiedProperty("palletsts");
        _palletsts = palletsts;
    }

    /**
     * [get] PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * 複数製造月日区分
     * @return The value of the column 'PLURALPRODUCTIONKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getPluralproductionkbn() {
        checkSpecifiedProperty("pluralproductionkbn");
        return convertEmptyToNull(_pluralproductionkbn);
    }

    /**
     * [set] PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]} <br>
     * 複数製造月日区分
     * @param pluralproductionkbn The value of the column 'PLURALPRODUCTIONKBN'. (basically NotNull if update: for the constraint)
     */
    public void setPluralproductionkbn(String pluralproductionkbn) {
        registerModifiedProperty("pluralproductionkbn");
        _pluralproductionkbn = pluralproductionkbn;
    }

    /**
     * [get] PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * パレット分割区分
     * @return The value of the column 'PALLETCUTTINGKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getPalletcuttingkbn() {
        checkSpecifiedProperty("palletcuttingkbn");
        return convertEmptyToNull(_palletcuttingkbn);
    }

    /**
     * [set] PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]} <br>
     * パレット分割区分
     * @param palletcuttingkbn The value of the column 'PALLETCUTTINGKBN'. (basically NotNull if update: for the constraint)
     */
    public void setPalletcuttingkbn(String palletcuttingkbn) {
        registerModifiedProperty("palletcuttingkbn");
        _palletcuttingkbn = palletcuttingkbn;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（08需給）
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（08需給）
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] PALLETADDFLG: {varchar(30), default=[(2)]} <br>
     * はり紙作成フラグ
     * @return The value of the column 'PALLETADDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletaddflg() {
        checkSpecifiedProperty("palletaddflg");
        return convertEmptyToNull(_palletaddflg);
    }

    /**
     * [set] PALLETADDFLG: {varchar(30), default=[(2)]} <br>
     * はり紙作成フラグ
     * @param palletaddflg The value of the column 'PALLETADDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletaddflg(String palletaddflg) {
        registerModifiedProperty("palletaddflg");
        _palletaddflg = palletaddflg;
    }

    /**
     * [get] ACCEPTUSERCD: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @return The value of the column 'ACCEPTUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAcceptusercd() {
        checkSpecifiedProperty("acceptusercd");
        return convertEmptyToNull(_acceptusercd);
    }

    /**
     * [set] ACCEPTUSERCD: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @param acceptusercd The value of the column 'ACCEPTUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptusercd(String acceptusercd) {
        registerModifiedProperty("acceptusercd");
        _acceptusercd = acceptusercd;
    }

    /**
     * [get] ACCEPTDATE: {datetime2(26, 6)} <br>
     * 受入検品日時
     * @return The value of the column 'ACCEPTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAcceptdate() {
        checkSpecifiedProperty("acceptdate");
        return _acceptdate;
    }

    /**
     * [set] ACCEPTDATE: {datetime2(26, 6)} <br>
     * 受入検品日時
     * @param acceptdate The value of the column 'ACCEPTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptdate(java.sql.Timestamp acceptdate) {
        registerModifiedProperty("acceptdate");
        _acceptdate = acceptdate;
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
     * [get] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
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
